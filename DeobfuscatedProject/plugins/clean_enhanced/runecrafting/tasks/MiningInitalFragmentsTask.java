/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining inital fragments", priority=12, register=true, blocking=true)
public class MiningInitalFragmentsTask
extends RunecraftingTaskBase {
    
    private  boolean bd;
    
    protected static final  WorldPoint bc;

    @Override
    protected boolean aj() {
        if (((Object)this.aV.m() == (Object)this.aV.m()2)c.ACTIVATING)) {
            this.bd = 2;
        }
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var3;
        if ((chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        if ((var3.getMessage( != 0).contains(var1[2]) ? 1 : 0)) {
            l var4;
            var4.sleep(Rand.nextInt((int)7, (int)8));
        }
    }

    static {
        l.var5();
        l.var6();
        bc = new WorldPoint(9, var2[10], 1);
    }

    @Inject
    public MiningInitalFragmentsTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVATING;
        cArray[2] = c.COUNTDOWN;
        cArray[3] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean ak() {
        TileObject var13;
        TileObject tileObject;
        l var14;
        if ((Game.getState() != Game.getState()2)) {
            return 1;
        }
        if ((SquireGOTRPlugin.g.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            return 1;
        }
        if ((var14.aV.g( == 0) ? 1 : 0)) {
            var14.bd = 1;
            return 1;
        }
        if ((var14.aV.a() > var14.aW.fragmentAmount())) {
            var14.bd = 1;
            return 1;
        }
        if (var14.bd == 0) {
            return 1;
        }
        if ((Skills.getLevel((SkiSkill.AGILITY) >= 4)) {
            int[] nArray = new int[2];
            nArray[1] = 5;
            tileObject = TileObjects.getNearest((int[])nArray);
            0;
            if (((132 + 77 - 104 + 76 ^ 132 + 135 - 229 + 126) & (173 + 154 - 183 + 44 ^ 51 + 147 - 150 + 125 ^ -1)) != 0) {
                return ((0xC0 ^ 0x9A ^ (0x1E ^ 0x7D)) & (81 + 107 - 138 + 95 ^ 119 + 19 - 105 + 135 ^ -1)) != 0;
            }
        } else {
            int[] nArray = new int[2];
            nArray[1] = 6;
            tileObject = TileObjects.getNearest((int[])nArray);
        }
        if (var13 = tileObject == null) {
            if ((Movement.isWalking( == 0) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)bc);
                0;
                return 2;
            }
            return 2;
        }
        Player var15 = Players.getLocal();
        int n2 = Reachable.isInteractable((Locatable)var13);
        if ((var14.ah( != 0) ? 1 : 0) && (n2 == 0) && (var15.isAnimating( == 0) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var13.getWorldLocation());
            0;
            return 2;
        }
        if (n2 == 0) {
            return 2;
        }
        if ((Players.getLocal( != 0).isAnimating() ? 1 : 0) && (var14.bd != 0)) {
            return 2;
        }
        if (!(var14.aV.L( != null)) || (var14.b((GameObject == 0)var13) ? 1 : 0)) {
            var13.interact(var1[1]);
            var14.sleep(3);
            return 2;
        }
        return 2;
    }
}

