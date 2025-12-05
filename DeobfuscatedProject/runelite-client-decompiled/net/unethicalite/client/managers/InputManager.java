/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.kwhat.jnativehook.GlobalScreen
 *  com.github.kwhat.jnativehook.keyboard.NativeKeyEvent
 *  com.github.kwhat.jnativehook.keyboard.NativeKeyListener
 *  com.github.kwhat.jnativehook.mouse.NativeMouseEvent
 *  com.github.kwhat.jnativehook.mouse.NativeMouseInputListener
 *  com.github.kwhat.jnativehook.mouse.NativeMouseListener
 *  com.github.kwhat.jnativehook.mouse.NativeMouseMotionListener
 *  com.github.kwhat.jnativehook.mouse.NativeMouseWheelEvent
 *  com.github.kwhat.jnativehook.mouse.NativeMouseWheelListener
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.unethicalite.api.events.MouseAutomated
 *  net.unethicalite.api.events.NativeKeyInput
 *  net.unethicalite.api.events.NativeKeyInput$Type
 *  net.unethicalite.api.events.NativeMouseInput
 *  net.unethicalite.api.events.NativeMouseInput$Type
 */
package net.unethicalite.client.managers;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseMotionListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseWheelEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseWheelListener;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.logging.Level;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.input.MouseListener;
import net.runelite.client.input.MouseManager;
import net.unethicalite.api.events.MouseAutomated;
import net.unethicalite.api.events.NativeKeyInput;
import net.unethicalite.api.events.NativeMouseInput;
import net.unethicalite.client.config.SquireConfig;
import net.unethicalite.client.managers.LoopedPluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class InputManager
implements MouseListener,
NativeMouseInputListener,
NativeMouseWheelListener,
NativeKeyListener {
    private static final Logger log = LoggerFactory.getLogger(InputManager.class);
    private final Client client;
    private final LoopedPluginManager loopedPluginManager;
    private final SquireConfig interactionConfig;
    private int lastClickX = -1;
    private int lastClickY = -1;
    private int lastMoveX = -1;
    private int lastMoveY = -1;

    @Inject
    public InputManager(LoopedPluginManager loopedPluginManager, MouseManager manager, EventBus eventBus, Client client, SquireConfig interactionConfig) {
        this.loopedPluginManager = loopedPluginManager;
        this.client = client;
        this.interactionConfig = interactionConfig;
        eventBus.register(this);
        manager.registerMouseListener(this);
        if (!Boolean.parseBoolean(System.getenv("disablenative"))) {
            try {
                GlobalScreen.registerNativeHook();
            }
            catch (Exception e) {
                log.error("Failed to register native hook", e);
            }
        }
        java.util.logging.Logger.getLogger(GlobalScreen.class.getPackage().getName()).setLevel(Level.OFF);
    }

    @Override
    public MouseEvent mouseClicked(MouseEvent mouseEvent) {
        this.checkIfAutomated(mouseEvent);
        this.setLastClick(mouseEvent.getX(), mouseEvent.getY());
        return mouseEvent;
    }

    @Override
    public MouseEvent mousePressed(MouseEvent mouseEvent) {
        this.checkIfAutomated(mouseEvent);
        this.setLastClick(mouseEvent.getX(), mouseEvent.getY());
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseReleased(MouseEvent mouseEvent) {
        this.checkIfAutomated(mouseEvent);
        this.setLastClick(mouseEvent.getX(), mouseEvent.getY());
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseEntered(MouseEvent mouseEvent) {
        this.checkIfAutomated(mouseEvent);
        this.setLastMove(mouseEvent.getX(), mouseEvent.getY());
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseExited(MouseEvent mouseEvent) {
        this.checkIfAutomated(mouseEvent);
        this.setLastMove(mouseEvent.getX(), mouseEvent.getY());
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseDragged(MouseEvent mouseEvent) {
        this.checkIfAutomated(mouseEvent);
        this.setLastMove(mouseEvent.getX(), mouseEvent.getY());
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseMoved(MouseEvent mouseEvent) {
        this.checkIfAutomated(mouseEvent);
        this.setLastMove(mouseEvent.getX(), mouseEvent.getY());
        return mouseEvent;
    }

    @Subscribe
    private void onMouseAutomated(MouseAutomated event) {
        switch (event.getEventType()) {
            case PRESS: 
            case RELEASE: {
                this.setLastClick(event.getX(), event.getY());
                break;
            }
            case EXIT: 
            case MOVE: {
                this.setLastMove(event.getX(), event.getY());
            }
        }
    }

    public void nativeMouseClicked(NativeMouseEvent nativeEvent) {
        this.client.getCallbacks().post((Object)new NativeMouseInput(nativeEvent.getX(), nativeEvent.getY(), nativeEvent.getButton(), NativeMouseInput.Type.CLICK));
    }

    public void nativeMousePressed(NativeMouseEvent nativeEvent) {
        this.client.getCallbacks().post((Object)new NativeMouseInput(nativeEvent.getX(), nativeEvent.getY(), nativeEvent.getButton(), NativeMouseInput.Type.PRESS));
    }

    public void nativeMouseReleased(NativeMouseEvent nativeEvent) {
        this.client.getCallbacks().post((Object)new NativeMouseInput(nativeEvent.getX(), nativeEvent.getY(), nativeEvent.getButton(), NativeMouseInput.Type.RELEASE));
    }

    public void nativeMouseMoved(NativeMouseEvent nativeEvent) {
        this.client.getCallbacks().post((Object)new NativeMouseInput(nativeEvent.getX(), nativeEvent.getY(), nativeEvent.getButton(), NativeMouseInput.Type.MOVEMENT));
    }

    public void nativeMouseDragged(NativeMouseEvent nativeEvent) {
        this.client.getCallbacks().post((Object)new NativeMouseInput(nativeEvent.getX(), nativeEvent.getY(), nativeEvent.getButton(), NativeMouseInput.Type.MOVEMENT));
    }

    public void nativeMouseWheelMoved(NativeMouseWheelEvent nativeEvent) {
        this.client.getCallbacks().post((Object)new NativeMouseInput(nativeEvent.getX(), nativeEvent.getY(), nativeEvent.getButton(), NativeMouseInput.Type.SCROLL));
    }

    public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
        this.client.getCallbacks().post((Object)new NativeKeyInput(nativeEvent.getKeyChar(), nativeEvent.getKeyCode(), nativeEvent.getKeyLocation(), NativeKeyInput.Type.PRESSED));
    }

    @Subscribe
    private void onConfigChanged(ConfigChanged event) {
        if (!event.getGroup().equals("unethicalite")) {
            return;
        }
        if (!event.getKey().equals("interactMethod")) {
            return;
        }
        if (Objects.equals(event.getNewValue(), "MOUSE_FORWARDING")) {
            GlobalScreen.addNativeMouseListener((NativeMouseListener)this);
            GlobalScreen.addNativeMouseMotionListener((NativeMouseMotionListener)this);
            GlobalScreen.addNativeMouseWheelListener((NativeMouseWheelListener)this);
            GlobalScreen.addNativeKeyListener((NativeKeyListener)this);
        } else if (Objects.equals(event.getOldValue(), "MOUSE_FORWARDING")) {
            GlobalScreen.removeNativeMouseListener((NativeMouseListener)this);
            GlobalScreen.removeNativeMouseMotionListener((NativeMouseMotionListener)this);
            GlobalScreen.removeNativeMouseWheelListener((NativeMouseWheelListener)this);
            GlobalScreen.removeNativeKeyListener((NativeKeyListener)this);
        }
    }

    private void setLastClick(int x, int y) {
        this.lastClickX = x;
        this.lastClickY = y;
    }

    private void setLastMove(int x, int y) {
        this.lastMoveX = x;
        this.lastMoveY = y;
    }

    private void checkIfAutomated(MouseEvent mouseEvent) {
        if (!this.interactionConfig.disableMouse()) {
            return;
        }
        if (this.loopedPluginManager.isPluginRegistered() && mouseEvent.getSource() != "unethicalite") {
            mouseEvent.consume();
        }
    }

    public int getLastClickX() {
        return this.lastClickX;
    }

    public int getLastClickY() {
        return this.lastClickY;
    }

    public int getLastMoveX() {
        return this.lastMoveX;
    }

    public int getLastMoveY() {
        return this.lastMoveY;
    }
}

