/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.MouseRecorder
 *  net.runelite.api.Perspective
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.events.FocusChanged
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.packets.ClientPacket
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.MouseHandler
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.events.MenuAutomated
 *  net.unethicalite.api.events.PacketSent
 *  net.unethicalite.api.exception.InteractionException
 */
package net.unethicalite.client.managers.interaction;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.MouseRecorder;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.recorder.MouseClick;
import net.runelite.client.plugins.recorder.MouseMovement;
import net.runelite.client.plugins.recorder.MouseRecording;
import net.unethicalite.api.MouseHandler;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.events.PacketSent;
import net.unethicalite.api.exception.InteractionException;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.input.naturalmouse.NaturalMouse;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.packets.DialogPackets;
import net.unethicalite.api.packets.ItemPackets;
import net.unethicalite.api.packets.MousePackets;
import net.unethicalite.api.packets.Packets;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.client.config.SquireConfig;
import net.unethicalite.client.managers.interaction.InteractMethod;
import net.unethicalite.client.managers.interaction.MouseBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class InteractionManager {
    private static final Logger log = LoggerFactory.getLogger(InteractionManager.class);
    private static final int MINIMAP_WIDTH = 250;
    private static final int MINIMAP_HEIGHT = 180;
    private static final Map<String, Integer> MAP_ACTION_PARTS_TO_KEYCODE = new HashMap<String, Integer>(){
        {
            this.put("Cast", 114);
            this.put("Activate", 116);
            this.put("Deactivate", 116);
            this.put("Wield", 27);
            this.put("Equip", 27);
            this.put("Use", 27);
            this.put("Rub", 27);
            this.put("Lay", 27);
            this.put("Clean", 27);
            this.put("Eat", 27);
            this.put("Drink", 27);
            this.put("Drop", 27);
            this.put("Remove", 113);
            this.put("Perform", 122);
            this.put("Play", 123);
        }
    };
    private static final Map<String, Set<String>> SKILLING_ACTIONS = new HashMap<String, Set<String>>(){
        {
            this.put("Agility", Set.of("Climb", "Climb up", "Climb-up", "Climb-down", "Jump", "Jump-up", "Jump-off", "Jump-in", "Balance", "Vault", "Balance-across", "Swing-across", "Teeth-grip", "Leap", "Hurdle", "Cross"));
            this.put("Woodcutting", Set.of("Chop"));
            this.put("Fishing", Set.of("Net", "Bait", "Cage", "Harpoon"));
            this.put("Smithing", Set.of("Smith", "Smelt", "Cool-preform", "Heat-preform", "Fill", "Pour"));
            this.put("Hunter", Set.of("Lay", "Catch", "Reset", "Set-trap"));
        }
    };
    private static final Set<String> AFK_ACTIONS = new HashSet<String>(){
        {
            this.add("Walk here");
            this.addAll((Collection)SKILLING_ACTIONS.get("Agility"));
            this.addAll((Collection)SKILLING_ACTIONS.get("Woodcutting"));
            this.addAll((Collection)SKILLING_ACTIONS.get("Fishing"));
            this.addAll((Collection)SKILLING_ACTIONS.get("Smithing"));
            this.addAll((Collection)SKILLING_ACTIONS.get("Hunter"));
        }
    };
    private static int lastKeyCode = -1;
    private static final Set<Integer> COMBAT_STYLE_IDS = Set.of(Integer.valueOf(38862856), Integer.valueOf(38862852), Integer.valueOf(38862860), Integer.valueOf(38862864), Integer.valueOf(38862874), Integer.valueOf(38862869));
    private static MouseRecording recording;
    private static boolean helper;
    private static int clickSequenceIndex;
    private static boolean focus;
    private static java.awt.Point lastClickPoint;
    @Inject
    private NaturalMouse naturalMouse;
    @Inject
    private SquireConfig config;
    @Inject
    private Client client;
    private static boolean hasSwappedSession;

    @Inject
    InteractionManager(EventBus eventBus) {
        eventBus.register(this);
    }

    public static MouseRecording getRecording() {
        return recording;
    }

    public static void setRecording(MouseRecording recording) {
        InteractionManager.recording = recording;
    }

    public static void setHelper(boolean helper) {
        InteractionManager.helper = helper;
    }

    public static void createMouseRecorderPacket(java.awt.Point clickPoint) {
        if (InteractionManager.recording == null || InteractionManager.recording.size() == 0) {
            InteractionManager.recording = MouseRecording.findBestFitting(null).stream().filter(recording -> !recording.getMousePaths().isEmpty()).findFirst().orElse(null);
            log.debug("Not creating mouse recording packet since current recording is null, trying to find any recording to use for now");
            return;
        }
        MouseRecorder mouseRecorder = Static.getClient().getMouseRecorder();
        ArrayList<ArrayList<MouseMovement>> paths = InteractionManager.recording.getMousePaths();
        if (paths.isEmpty()) {
            List<MouseClick> clicks = InteractionManager.recording.getMouseClicks();
            if (clicks.size() > 500) {
                clicks = clicks.subList(0, 500);
            }
            int[] xs = clicks.stream().mapToInt(x -> x.getP().x).toArray();
            int[] ys = clicks.stream().mapToInt(x -> x.getP().y).toArray();
            long[] millis = new long[xs.length];
            for (int i = millis.length - 1; i >= 0; --i) {
                int sub = millis.length - i;
                millis[i] = System.currentTimeMillis() - (long)sub * (long)Rand.nextInt(1, 5);
            }
            mouseRecorder.setXs(xs);
            mouseRecorder.setYs(ys);
            mouseRecorder.setMillis(millis);
            mouseRecorder.setIndex(xs.length);
            return;
        }
        ArrayList<MouseMovement> best = null;
        double bestDistance = Double.MAX_VALUE;
        for (ArrayList<MouseMovement> path : paths) {
            double v;
            if (path.size() == 0 || !((v = path.get(path.size() - 1).distanceTo(clickPoint)) < bestDistance)) continue;
            bestDistance = v;
            best = path;
        }
        if (best == null) {
            log.debug("Not creating mouse recording packet since best path is null {}", (Object)paths);
            return;
        }
        int[] xs = best.stream().mapToInt(MouseMovement::getX).toArray();
        int[] ys = best.stream().mapToInt(MouseMovement::getY).toArray();
        long[] millis = new long[xs.length];
        long last = ((MouseMovement)best.get(best.size() - 1)).getMillis();
        long current = System.currentTimeMillis();
        for (int i = 0; i < millis.length; ++i) {
            millis[i] = best.get(i).getMillis() - last + current;
        }
        MousePackets.queueRecorderPacket(xs, ys, millis);
    }

    public static void clickAndInvoke(Runnable invokable) {
        InteractionManager.clickAndInvoke(InteractionManager.getRecordingClickPoint(), invokable, null);
    }

    public static void clickAndInvoke(java.awt.Point clickPoint, Runnable invokable) {
        InteractionManager.clickAndInvoke(clickPoint, invokable, null);
    }

    public static void clickAndInvoke(java.awt.Point clickPoint, Runnable invokable, MenuAutomated event) {
        log.debug("Sending mouse recorder packet and click packet for an action");
        lastClickPoint = clickPoint;
        InteractionManager.determineAndSendKeyboardPacketFor(event);
        MousePackets.queueClickPacket(-1, -1);
        if (!focus) {
            Packets.queueFocusPacket(true);
            focus = true;
        }
        invokable.run();
        if (event == null) {
            return;
        }
        if (AFK_ACTIONS.contains(event.getOption()) && Rand.nextInt(1, 15) == 1) {
            focus = false;
            Packets.queueFocusPacket(false);
        }
        InteractionManager.randomDragItem(event);
    }

    private static void randomDragItem(MenuAutomated event) {
        if (event == null) {
            return;
        }
        if (event.getItemId() == -1) {
            return;
        }
        Item swap = Inventory.getFirst(event.getItemId());
        if (swap == null) {
            return;
        }
        Item with = Inventory.getFirst(i -> i.getId() != event.getItemId());
        if (with == null) {
            return;
        }
        if (hasSwappedSession && Rand.nextInt(0, 250) != 1) {
            return;
        }
        hasSwappedSession = true;
        java.awt.Point clickPoint = with.getClickPoint().getAwtPoint();
        InteractionManager.determineAndSendKeyboardPacketFor(event);
        MousePackets.queueClickPacket(-1, -1);
        ItemPackets.queueSwapItems(swap, with);
    }

    public static java.awt.Point getRecordingClickPoint() {
        if (recording != null && recording.size() > 0) {
            ArrayList<MouseClick> clicks = recording.getMouseClicks();
            int incr = Math.random() < (double)Math.max(0.05f, 1.0f / (float)clicks.size()) ? 2 : 1;
            clickSequenceIndex = (clickSequenceIndex + incr) % clicks.size();
            MouseClick result = clicks.get(clickSequenceIndex);
            while (InteractionManager.clickInsideMinimap(result.getP())) {
                clickSequenceIndex = (clickSequenceIndex + incr) % clicks.size();
                result = clicks.get(clickSequenceIndex);
            }
            return new java.awt.Point(result.getP().x, result.getP().y);
        }
        Rectangle bounds = Static.getClient().getCanvas().getBounds();
        java.awt.Point randomPoint = new java.awt.Point(Rand.nextInt(0, bounds.width), Rand.nextInt(0, bounds.height));
        if (InteractionManager.clickInsideMinimap(randomPoint)) {
            return InteractionManager.getRecordingClickPoint();
        }
        return randomPoint;
    }

    public static boolean clickInsideMinimap(java.awt.Point point) {
        return InteractionManager.getMinimap().contains(point);
    }

    private static Rectangle getMinimap() {
        Widget minimap = Widgets.get(WidgetInfo.FIXED_VIEWPORT_MINIMAP_DRAW_AREA);
        if (Widgets.isVisible(minimap)) {
            return minimap.getBounds();
        }
        Widget minimap1 = Widgets.get(WidgetInfo.RESIZABLE_MINIMAP_DRAW_AREA);
        if (Widgets.isVisible(minimap1)) {
            return minimap1.getBounds();
        }
        Widget minimap2 = Widgets.get(WidgetInfo.RESIZABLE_MINIMAP_STONES_DRAW_AREA);
        if (Widgets.isVisible(minimap2)) {
            return minimap2.getBounds();
        }
        Rectangle bounds = Static.getClient().getCanvas().getBounds();
        return new Rectangle(bounds.width - 250, 0, 250, 180);
    }

    private static void determineAndSendKeyboardPacketFor(MenuAutomated event) {
        if (event == null) {
            return;
        }
        String option = event.getOption();
        int keyCode = -1;
        if (option != null) {
            for (String action : MAP_ACTION_PARTS_TO_KEYCODE.keySet()) {
                if (!option.contains(action)) continue;
                keyCode = MAP_ACTION_PARTS_TO_KEYCODE.get(action);
                break;
            }
        }
        if (event.getItemId() != -1) {
            keyCode = 27;
        }
        if (COMBAT_STYLE_IDS.contains(event.getParam1())) {
            keyCode = 112;
        }
        if (keyCode == -1) {
            return;
        }
        if (keyCode == lastKeyCode) {
            return;
        }
        lastKeyCode = keyCode;
        DialogPackets.sendKeyboardEvent(keyCode);
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == GameState.LOGGING_IN) {
            hasSwappedSession = false;
        }
    }

    @Subscribe
    public void onFocusChanged(FocusChanged focusChanged) {
        if (Game.getState() != GameState.LOGGED_IN) {
            focus = false;
            return;
        }
        if (!focusChanged.isFocused()) {
            log.debug("(Real) focus lost, setting focus back to false");
            focus = false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Subscribe
    public void onMenuAutomated(MenuAutomated event) {
        java.awt.Point clickPoint = this.getClickPoint(event);
        MouseHandler mouseHandler = this.client.getMouseHandler();
        try {
            switch (this.config.interactMethod()) {
                case MOUSE_FORWARDING: {
                    long millis;
                    if (this.client.getQueuedMenu() != null && (millis = mouseHandler.getCurrentMillis() - mouseHandler.getLastPressedMillis()) >= 250L && this.config.clickAfterInactivity()) {
                        this.invoke(event, clickPoint, mouseHandler);
                        return;
                    }
                    this.client.setQueuedMenu(event);
                    return;
                }
                case MOUSE_EVENTS: {
                    Point newPoint;
                    SceneEntity entity = event.getEntity();
                    if (entity != null && this.config.mouseBehavior() == MouseBehavior.CLICKBOXES) {
                        clickPoint = entity.getClickPoint().getAwtPoint();
                    }
                    if (event.getOpcode() == MenuAction.WALK && this.clickOffScreen(clickPoint) && (newPoint = Perspective.localToMinimap((Client)this.client, (LocalPoint)LocalPoint.fromScene((int)event.getParam0(), (int)event.getParam1()))) != null) {
                        clickPoint = newPoint.getAwtPoint();
                    }
                    if (this.config.naturalMouse()) {
                        this.naturalMouse.moveTo(clickPoint.x, clickPoint.y);
                    }
                    java.awt.Point finalClickPoint = clickPoint;
                    GameThread.invoke(() -> {
                        this.client.setPendingAutomation(event);
                        this.setHoveredEntity(entity);
                        if (!this.config.naturalMouse()) {
                            mouseHandler.sendMovement(finalClickPoint.x, finalClickPoint.y);
                        }
                        log.debug("Sending click to [{}, {}]", (Object)finalClickPoint.x, (Object)finalClickPoint.y);
                        mouseHandler.sendClick(finalClickPoint.x, finalClickPoint.y, 1);
                    });
                    return;
                }
                case INVOKE: {
                    this.invoke(event, clickPoint, mouseHandler);
                    return;
                }
                case PACKETS: {
                    java.awt.Point fcp = clickPoint;
                    GameThread.invoke(() -> {
                        try {
                            if (event.getOpcode() == MenuAction.CC_OP || event.getOpcode() == MenuAction.CC_OP_LOW_PRIORITY) {
                                Widget child;
                                int param0 = event.getParam0();
                                int param1 = event.getParam1();
                                int id = event.getIdentifier();
                                int itemId = event.getItemId();
                                if (itemId != -1) {
                                    this.client.invokeWidgetAction(id, param1, param0, itemId, "");
                                    return;
                                }
                                Widget widget = Widgets.fromId(event.getParam1());
                                if (widget == null) {
                                    return;
                                }
                                Widget widget2 = child = param0 == -1 ? null : widget.getChild(param0);
                                if (child == null) {
                                    this.client.invokeWidgetAction(id, param1, param0, -1, "");
                                    return;
                                }
                                this.client.invokeWidgetAction(id, param1, param0, child.getItemId(), "");
                            } else {
                                Packets.fromAutomatedMenu(event).send();
                            }
                        }
                        catch (InteractionException ex) {
                            log.error("Packet interaction failed, falling back to invoke", ex);
                            this.invoke(event, fcp, mouseHandler);
                        }
                    });
                    return;
                }
            }
            return;
        }
        catch (InteractionException ex) {
            log.error("Interaction failed: {}", (Object)ex.getMessage());
            this.client.setPendingAutomation(null);
            return;
        }
        finally {
            if (this.config.interactMethod() == InteractMethod.MOUSE_EVENTS) {
                Time.sleep(10, 20);
                mouseHandler.sendRelease();
            }
        }
    }

    private void invoke(MenuAutomated event, java.awt.Point clickPoint, MouseHandler mouseHandler) {
        if (!helper) {
            mouseHandler.setIdleCycles(0);
            mouseHandler.setLastPressedMillis(System.currentTimeMillis());
        }
        GameThread.invoke(() -> InteractionManager.clickAndInvoke(clickPoint, () -> this.processAction(event, clickPoint.x, clickPoint.y), event));
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int roll = Rand.nextInt(0, 100);
        if (roll != 1) {
            return;
        }
        int direction = Rand.nextBool() ? 1 : -1;
        int amount = Rand.nextInt(1, 3);
        for (int i = 0; i < amount; ++i) {
            int size = Rand.nextInt(1, 4);
            MousePackets.queueMouseWheelRotationPacket(size * direction);
        }
    }

    @Subscribe
    private void onPacketSent(PacketSent e) {
        ClientPacket packet = e.getPacketBufferNode().getClientPacket();
        if (packet == null) {
            return;
        }
        if (packet != Static.getClientPacket().RESUME_COUNTDIALOG() && packet != Static.getClientPacket().RESUME_NAMEDIALOG() && packet != Static.getClientPacket().RESUME_STRINGDIALOG()) {
            return;
        }
        if (!e.getPacketBufferNode().getPacketBuffer().isAutomated()) {
            return;
        }
        log.info("Closing dialog after packet sent");
        Dialog.close();
    }

    public void setHoveredEntity(SceneEntity entity) {
        if (entity != null) {
            long[] entitiesAtMouse = this.client.getEntitiesAtMouse();
            int count = this.client.getEntitiesAtMouseCount();
            if (count < 1000) {
                entitiesAtMouse[count] = entity.getTag();
                this.client.setEntitiesAtMouseCount(count + 1);
            }
        }
    }

    private void processAction(MenuAutomated entry, int x, int y) {
        GameThread.invoke(() -> this.client.invokeMenuAction(entry.getOption(), entry.getTarget(), entry.getIdentifier(), entry.getOpcode().getId(), entry.getParam0(), entry.getParam1(), x, y));
    }

    private java.awt.Point getClickPoint(MenuAutomated event) {
        java.awt.Point clickPoint;
        java.awt.Point clickPoint2;
        if (helper) {
            return new java.awt.Point(this.client.getMouseHandler().getCurrentX(), this.client.getMouseHandler().getCurrentY());
        }
        if (event.getClickX() != -1 && event.getClickY() != -1 && !InteractionManager.clickInsideMinimap(clickPoint2 = new java.awt.Point(event.getClickX(), event.getClickY()))) {
            return clickPoint2;
        }
        java.awt.Point recording = InteractionManager.getRecordingClickPoint();
        if (recording != null) {
            return recording;
        }
        if (this.config.mouseBehavior() == MouseBehavior.OFF_SCREEN) {
            return new java.awt.Point(0, 0);
        }
        if (this.config.mouseBehavior() == MouseBehavior.MOUSE_POS) {
            return new java.awt.Point(this.client.getMouseHandler().getCurrentX(), this.client.getMouseHandler().getCurrentY());
        }
        if (event.getClickX() != -1 && event.getClickY() != -1 && this.config.mouseBehavior() == MouseBehavior.CLICKBOXES && !InteractionManager.clickInsideMinimap(clickPoint = new java.awt.Point(event.getClickX(), event.getClickY()))) {
            return clickPoint;
        }
        Rectangle bounds = this.client.getCanvas().getBounds();
        java.awt.Point randomPoint = new java.awt.Point(Rand.nextInt(0, bounds.width), Rand.nextInt(0, bounds.height));
        if (InteractionManager.clickInsideMinimap(randomPoint)) {
            return this.getClickPoint(event);
        }
        return randomPoint;
    }

    private boolean clickOffScreen(java.awt.Point point) {
        return point.x < 0 || point.y < 0 || point.x > this.client.getViewportWidth() || point.y > this.client.getViewportHeight();
    }

    public static boolean isFocus() {
        return focus;
    }

    public static void setFocus(boolean focus) {
        InteractionManager.focus = focus;
    }

    public static java.awt.Point getLastClickPoint() {
        return lastClickPoint;
    }

    public static void setLastClickPoint(java.awt.Point lastClickPoint) {
        InteractionManager.lastClickPoint = lastClickPoint;
    }

    static {
        clickSequenceIndex = 0;
        focus = true;
        hasSwappedSession = false;
    }
}

