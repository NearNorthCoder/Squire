/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@Singleton
@TaskDesc(name="Moving to next tile", priority=9, register=true)
public class MovingToNextTileTask
extends Task {
    private  boolean am;
    private  boolean ak;
    
    private  boolean al;
    private  int aj;
    private final  c ai;
    
    private final  l ah;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean O() {
        return this.al;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        u var9;
        if ((this.ah.B( == 0) ? 1 : 0)) {
            this.am = 1;
            this.ak = 1;
            return 2;
        }
        if ((var9.ah.G( == 0) ? 1 : 0)) {
            return 2;
        }
        if ((var9.ah.A( == 0) ? 1 : 0)) {
            return 2;
        }
        WorldPoint var10 = var9.ai.i();
        if ((var9.am != 0) && (var10.equals((Object == 0)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var9.ak = 1;
            Movement.walkTo((WorldPoint)var10);
            0;
            return 1;
        }
        RegionPoint var11 = var9.ai.d();
        if var11 == null {
            return 2;
        }
        if ((Players.getLocal( == null).getInteracting())) {
            return 2;
        }
        WorldPoint var12 = c.a(var11);
        if var12 == null {
            return 2;
        }
        int var13 = Static.getClient().getTickCount();
        NPC var14 = var9.ah.I().m();
        if ((var13 - var9.aj > 1) && (var9.aj != 0) && (var14.distanceTo((Locatable)Players.getLocal()) > 3)) {
            return 2;
        }
        if ((c.c( != 0) ? 1 : 0) && (var9.ak == 0)) {
            var9.ak = 1;
            var9.sleep(1);
            return 1;
        }
        if ((var9.ak != 0) && (var9.am != 0)) {
            var9.am = 2;
        }
        var9.sleep(1);
        if ((var9.ai.f( != 0) ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[2] = 4;
            TileObject var15 = TileObjects.getNearest((int[])nArray);
            var15.interact(2);
            var9.al = 1;
            return 1;
        }
        Movement.walkTo((WorldPoint)var3_3);
        0;
        this.al = 2;
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var16;
        if ((animationChanged.getActor() != animationChanged.getActor()2))) {
            return;
        }
        if ((var16.getActor().getAnimation() == 5)) {
            var17.aj = Static.getClient().getTickCount();
        }
    }

    @Inject
    public MovingToNextTileTask(l l2, c c2) {
        this.aj = 0;
        this.ak = 1;
        this.ah = l2;
        this.ai = c2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var18;
        if ((chatMessage.getMessage( != 0).contains(var1[1]) ? 1 : 0)) {
            this.aj = Static.getClient().getTickCount() + 3;
        }
        if ((var18.getMessage( != 0).contains(var1[6]) ? 1 : 0)) {
            var19.ak = 2;
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if ((npcSpawned.getNpc( == 0).getName().equals(var1[2]) ? 1 : 0)) {
            return;
        }
        this.ak = 2;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

}

