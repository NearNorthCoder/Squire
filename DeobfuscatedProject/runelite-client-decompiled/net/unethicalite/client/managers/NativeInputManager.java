/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.unethicalite.api.MouseHandler
 *  net.unethicalite.api.events.MenuAutomated
 *  net.unethicalite.api.events.NativeKeyInput
 *  net.unethicalite.api.events.NativeMouseInput
 *  net.unethicalite.api.events.NativeMouseInput$Type
 */
package net.unethicalite.client.managers;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ContainableFrame;
import net.unethicalite.api.MouseHandler;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.events.NativeKeyInput;
import net.unethicalite.api.events.NativeMouseInput;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.client.config.SquireConfig;
import net.unethicalite.client.managers.interaction.InteractMethod;
import net.unethicalite.client.managers.interaction.InteractionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class NativeInputManager {
    private static final Logger log = LoggerFactory.getLogger(NativeInputManager.class);
    @Inject
    private SquireConfig config;
    @Inject
    private Client client;
    @Inject
    private InteractionManager interactionManager;

    @Inject
    NativeInputManager(EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe
    public void onNativeMouseInput(NativeMouseInput event) {
        if (!this.canForwardMouseEvent(event)) {
            return;
        }
        MouseHandler mouseHandler = this.client.getMouseHandler();
        if (mouseHandler == null) {
            return;
        }
        double eventX = event.getX();
        double eventY = event.getY();
        ContainableFrame clientWindow = ClientUI.getFrame();
        if (clientWindow == null) {
            return;
        }
        if (clientWindow.getBounds().contains(eventX, eventY) && clientWindow.isFocused()) {
            return;
        }
        GraphicsDevice[] monitors = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        GraphicsDevice currentMonitor = Arrays.stream(monitors).filter(device -> device.getDefaultConfiguration().getBounds().contains(event.getX(), event.getY())).findFirst().orElse(null);
        if (currentMonitor == null) {
            return;
        }
        List<GraphicsDevice> availableMonitors = this.getAvailableMonitors(monitors);
        if (availableMonitors.isEmpty()) {
            return;
        }
        MenuAutomated queuedMenu = this.client.getQueuedMenu();
        Rectangle totalScreen = this.getJoinedScreen(this.getAdjacentMonitors(currentMonitor, availableMonitors));
        int canvasX = (int)((eventX -= (double)totalScreen.x) * ((double)this.client.getCanvasWidth() / (double)totalScreen.width));
        int canvasY = (int)(eventY * ((double)this.client.getCanvasHeight() / (double)currentMonitor.getDefaultConfiguration().getBounds().height));
        if (!availableMonitors.contains(currentMonitor)) {
            canvasX = -1;
            canvasY = -1;
        }
        if (event.getType() == NativeMouseInput.Type.PRESS) {
            log.debug("Mouse forwarded - Screen area: {} | Click: {} {} ({} {}) | Button {} | Canvas: {} {}", totalScreen, eventX, event.getX(), eventY, event.getY(), event.getButton(), canvasX, canvasY);
        }
        if (event.getType() == NativeMouseInput.Type.PRESS && queuedMenu != null && queuedMenu.getOpcode() != MenuAction.WALK) {
            if (InteractionManager.clickInsideMinimap(new Point(canvasX, canvasY))) {
                return;
            }
        }
        this.forwardToCanvas(event.getType(), canvasX, canvasY, event.getButton(), queuedMenu);
    }

    private void forwardToCanvas(NativeMouseInput.Type type, int canvasX, int canvasY, int eventButton, MenuAutomated queuedMenu) {
        MouseHandler mouseHandler = this.client.getMouseHandler();
        switch (type) {
            case SCROLL: 
            case PRESS: {
                int button;
                String coordsText;
                if (type == NativeMouseInput.Type.SCROLL && !this.config.forwardLeftClick()) {
                    return;
                }
                if (canvasX == -1 && canvasY == -1) {
                    if (this.client.isFocused()) {
                        log.debug("Setting client unfocused");
                        mouseHandler.sendFocusLost();
                    }
                    return;
                }
                if (!this.config.forwardMovement() && (coordsText = this.config.clickLocation()).matches("^\\d{0,5} \\d{0,5}$")) {
                    String[] split = coordsText.split(" ");
                    canvasX = Integer.parseInt(split[0]);
                    canvasY = Integer.parseInt(split[1]);
                }
                int n = button = this.config.forwardLeftClick() ? 1 : eventButton;
                if (queuedMenu == null) {
                    if (!this.config.forceForwarding()) break;
                    mouseHandler.sendClick(canvasX, canvasY, button);
                    break;
                }
                int clickX = canvasX;
                int clickY = canvasY;
                GameThread.invoke(() -> {
                    if (button == 1) {
                        this.client.setPendingAutomation(queuedMenu);
                        this.interactionManager.setHoveredEntity(queuedMenu.getEntity());
                        this.client.setQueuedMenu(null);
                    }
                    mouseHandler.sendClick(clickX, clickY, button);
                });
                break;
            }
            case RELEASE: {
                if (canvasX == -1 && canvasY == -1) {
                    if (!this.client.isFocused()) break;
                    mouseHandler.sendFocusLost();
                    break;
                }
                mouseHandler.sendRelease();
                break;
            }
            case MOVEMENT: {
                if (!this.config.forwardMovement()) {
                    return;
                }
                mouseHandler.sendMovement(canvasX, canvasY);
            }
        }
    }

    @Subscribe
    public void onNativeKeyInput(NativeKeyInput event) {
        if (this.config.forwardKeystrokes()) {
            Point mouse = MouseInfo.getPointerInfo().getLocation();
            this.client.getCallbacks().post((Object)new NativeMouseInput(mouse.x, mouse.y, 1, NativeMouseInput.Type.PRESS));
        }
    }

    private boolean canForwardMouseEvent(NativeMouseInput event) {
        List buttons;
        if (this.config.interactMethod() != InteractMethod.MOUSE_FORWARDING) {
            return false;
        }
        if (this.config.selectedButtonsOnly() && event.isButton() && !(buttons = Arrays.stream(this.config.selectedButtonIds().split(",")).map(Integer::parseInt).collect(Collectors.toList())).contains(event.getButton())) {
            return false;
        }
        if (this.config.forwardMovement() && this.config.forceForwardMovement() && event.getType() == NativeMouseInput.Type.MOVEMENT) {
            return true;
        }
        if (this.config.forceForwarding()) {
            return true;
        }
        return this.client.getQueuedMenu() != null;
    }

    private List<GraphicsDevice> getAdjacentMonitors(GraphicsDevice primary, List<GraphicsDevice> monitors) {
        int i;
        ArrayList<GraphicsDevice> out = new ArrayList<GraphicsDevice>();
        out.add(primary);
        GraphicsDevice current = primary;
        for (i = monitors.indexOf(primary) + 1; i < monitors.size(); ++i) {
            GraphicsDevice next = monitors.get(i);
            if (!this.isAdjacent(current, next)) continue;
            out.add(next);
            current = next;
        }
        current = primary;
        for (i = monitors.indexOf(primary) - 1; i >= 0; --i) {
            GraphicsDevice prev = monitors.get(i);
            if (!this.isAdjacent(current, prev)) continue;
            out.add(prev);
            current = prev;
        }
        return out.stream().sorted(Comparator.comparingInt(m -> m.getDefaultConfiguration().getBounds().x)).collect(Collectors.toList());
    }

    private boolean isAdjacent(GraphicsDevice first, GraphicsDevice second) {
        if (first == null || second == null) {
            return false;
        }
        Rectangle firstBounds = first.getDefaultConfiguration().getBounds();
        Rectangle secondBounds = second.getDefaultConfiguration().getBounds();
        return firstBounds.x + firstBounds.width == secondBounds.x || secondBounds.x + secondBounds.width == firstBounds.x;
    }

    private Rectangle getJoinedScreen(List<GraphicsDevice> sortedMonitors) {
        Rectangle screen = sortedMonitors.get(0).getDefaultConfiguration().getBounds();
        for (int i = 1; i < sortedMonitors.size(); ++i) {
            GraphicsDevice monitor = sortedMonitors.get(i);
            screen.add(monitor.getDefaultConfiguration().getBounds());
        }
        return screen;
    }

    private List<GraphicsDevice> getAvailableMonitors(GraphicsDevice[] devices) {
        if (!this.config.selectedMonitorsOnly()) {
            return Arrays.asList(devices);
        }
        List monitorIds = Arrays.stream(this.config.selectedMonitorIds().split(",")).map(String::trim).map(s -> Integer.parseInt(s) - 1).collect(Collectors.toList());
        return monitorIds.stream().filter(id -> id < devices.length).map(id -> GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[id]).sorted(Comparator.comparingInt(m -> m.getDefaultConfiguration().getBounds().x).thenComparingInt(m -> m.getDefaultConfiguration().getBounds().y)).collect(Collectors.toList());
    }
}

