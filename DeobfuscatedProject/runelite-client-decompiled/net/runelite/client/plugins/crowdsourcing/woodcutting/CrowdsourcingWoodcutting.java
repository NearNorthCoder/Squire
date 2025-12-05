/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.MenuOptionClicked
 */
package net.runelite.client.plugins.crowdsourcing.woodcutting;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.crowdsourcing.CrowdsourcingManager;
import net.runelite.client.plugins.crowdsourcing.skilling.SkillingEndReason;
import net.runelite.client.plugins.crowdsourcing.skilling.SkillingState;
import net.runelite.client.plugins.crowdsourcing.woodcutting.WoodcuttingData;

public class CrowdsourcingWoodcutting {
    private static final String CHOPPING_MESSAGE = "You swing your axe at the tree.";
    private static final String INVENTORY_FULL_MESSAGE = "Your inventory is too full to hold any more logs.";
    private static final String NEST_MESSAGE = "A bird's nest falls out of the tree";
    private static final Set<Integer> TREE_OBJECTS = ((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)new ImmutableSet.Builder().add((Object)8462)).add((Object)10820)).add((Object)8467)).add((Object)9734)).add((Object)10822)).add((Object)8513)).add((Object)1276)).add((Object)1277)).add((Object)1278)).add((Object)1279)).add((Object)1280)).add((Object)1282)).add((Object)1283)).add((Object)1284)).add((Object)1285)).add((Object)1286)).add((Object)1289)).add((Object)1290)).add((Object)1291)).add((Object)1318)).add((Object)1319)).add((Object)1330)).add((Object)1331)).add((Object)1332)).add((Object)1365)).add((Object)1383)).add((Object)1384)).add((Object)2091)).add((Object)2092)).add((Object)2409)).add((Object)3879)).add((Object)3881)).add((Object)3882)).add((Object)3883)).add((Object)5902)).add((Object)5903)).add((Object)5904)).add((Object)9730)).add((Object)9731)).add((Object)9732)).add((Object)9733)).add((Object)10041)).add((Object)14308)).add((Object)14309)).add((Object)16264)).add((Object)16265)).add((Object)27060)).add((Object)30852)).add((Object)30854)).add((Object)27499)).add((Object)10819)).add((Object)10829)).add((Object)10831)).add((Object)10833)).add((Object)8488)).add((Object)15970)).add((Object)15951)).add((Object)15954)).add((Object)15948)).add((Object)10832)).add((Object)4674)).add((Object)8444)).add((Object)36688)).add((Object)15062)).add((Object)15062)).add((Object)10834)).add((Object)8409)).add((Object)10821)).add((Object)10830)).add((Object)2023)).add((Object)29668)).add((Object)29670)).add((Object)29311)).add((Object)3037)).add((Object)30602)).build();
    private static final Map<Integer, Integer> AXE_ANIMS = new ImmutableMap.Builder<Integer, Integer>().put(879, 1351).put(877, 1349).put(875, 1353).put(873, 1361).put(871, 1355).put(869, 1357).put(867, 1359).put(2846, 6739).put(24, 25378).put(2117, 13241).put(7264, 20011).put(8324, 23673).put(8778, 25066).build();
    private static final Set<String> SUCCESS_MESSAGES = ((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)new ImmutableSet.Builder().add("You get some logs.")).add("You get some oak logs.")).add("You get some willow logs.")).add("You get some teak logs.")).add("You get some teak logs and give them to Carpenter Kjallak.")).add("You get some maple logs.")).add("You get some maple logs and give them to Lumberjack Leif.")).add("You get some mahogany logs.")).add("You get some mahogany logs and give them to Carpenter Kjallak.")).add("You get some yew logs.")).add("You get some magic logs.")).add("You get some redwood logs.")).add("You get some scrapey tree logs.")).add("You get some bark.")).add("You get a bruma root.")).add("You get an arctic pine log")).add("You get some juniper logs.")).add("You get some mushrooms.")).build();
    @Inject
    private CrowdsourcingManager manager;
    @Inject
    private Client client;
    private SkillingState state = SkillingState.RECOVERING;
    private int lastExperimentEnd = 0;
    private WorldPoint treeLocation;
    private int treeId;
    private int startTick;
    private int axe;
    private List<Integer> chopTicks = new ArrayList<Integer>();
    private List<Integer> nestTicks = new ArrayList<Integer>();

    private void endExperiment(SkillingEndReason reason) {
        if (this.state == SkillingState.CUTTING) {
            int endTick = this.client.getTickCount();
            int woodcuttingLevel = this.client.getBoostedSkillLevel(Skill.WOODCUTTING);
            WoodcuttingData data = new WoodcuttingData(woodcuttingLevel, this.startTick, endTick, this.chopTicks, this.nestTicks, this.axe, this.treeId, this.treeLocation, reason);
            this.manager.storeEvent(data);
            this.chopTicks = new ArrayList<Integer>();
            this.nestTicks = new ArrayList<Integer>();
        }
        this.state = SkillingState.RECOVERING;
        this.lastExperimentEnd = this.client.getTickCount();
    }

    @Subscribe
    public void onChatMessage(ChatMessage event) {
        String message = event.getMessage();
        ChatMessageType type = event.getType();
        if (this.state == SkillingState.CLICKED && type == ChatMessageType.SPAM && message.equals(CHOPPING_MESSAGE)) {
            this.startTick = this.client.getTickCount();
            this.state = SkillingState.CUTTING;
        } else if (this.state == SkillingState.CUTTING && type == ChatMessageType.SPAM && SUCCESS_MESSAGES.contains(message)) {
            this.chopTicks.add(this.client.getTickCount());
        } else if (this.state == SkillingState.CUTTING && type == ChatMessageType.GAMEMESSAGE && message.equals(INVENTORY_FULL_MESSAGE)) {
            this.endExperiment(SkillingEndReason.INVENTORY_FULL);
        } else if (this.state == SkillingState.CUTTING && type == ChatMessageType.GAMEMESSAGE && message.contains(NEST_MESSAGE)) {
            this.nestTicks.add(this.client.getTickCount());
        }
    }

    @Subscribe
    public void onGameTick(GameTick tick) {
        int animId = this.client.getLocalPlayer().getAnimation();
        if (this.state == SkillingState.CUTTING) {
            if (AXE_ANIMS.containsKey(animId)) {
                this.axe = AXE_ANIMS.get(animId);
            } else {
                this.endExperiment(SkillingEndReason.INTERRUPTED);
            }
        } else if (animId != -1) {
            this.endExperiment(SkillingEndReason.INTERRUPTED);
        } else if (this.state == SkillingState.RECOVERING && this.client.getTickCount() - this.lastExperimentEnd >= 4) {
            this.state = SkillingState.READY;
        } else if (this.state == SkillingState.CLICKED && this.client.getTickCount() - this.lastExperimentEnd >= 20) {
            this.state = SkillingState.READY;
        }
    }

    @Subscribe
    public void onMenuOptionClicked(MenuOptionClicked menuOptionClicked) {
        MenuAction menuAction = menuOptionClicked.getMenuAction();
        int id = menuOptionClicked.getId();
        if (this.state == SkillingState.READY && menuAction == MenuAction.GAME_OBJECT_FIRST_OPTION && TREE_OBJECTS.contains(id)) {
            this.state = SkillingState.CLICKED;
            this.lastExperimentEnd = this.client.getTickCount();
            this.treeId = id;
            this.treeLocation = WorldPoint.fromScene((Client)this.client, (int)menuOptionClicked.getParam0(), (int)menuOptionClicked.getParam1(), (int)this.client.getPlane());
        } else {
            this.endExperiment(SkillingEndReason.INTERRUPTED);
        }
    }

    @Subscribe
    public void onGameObjectDespawned(GameObjectDespawned event) {
        if (this.state != SkillingState.CUTTING) {
            return;
        }
        if (this.treeId == event.getGameObject().getId() && this.treeLocation.equals((Object)event.getTile().getWorldLocation())) {
            this.endExperiment(SkillingEndReason.DEPLETED);
        }
    }
}

