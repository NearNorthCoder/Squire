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
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.LHelper;

@TaskDesc(name="Moving to next tile", priority=9, register=true)
@Singleton
public class MovingToNextTileTask
extends Task {
    
    private  boolean aq;
    private final  g am;
    private final  l an;
    private  int ao;
    private  boolean ap;

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (w.var3(npcSpawned.getNpc().getName().equals(var2[var1[2]]) ? 1 : 0)) {
            return;
        }
        this.ap = var1[2];
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        int var10;
        int n2;
        w var11;
        if (w.var3(this.am.m() ? 1 : 0)) {
            this.aq = var1[1];
            this.ap = var1[1];
            return var1[2];
        }
        if (w.var3(var11.am.l() ? 1 : 0)) {
            return var1[2];
        }
        WorldPoint var12 = var11.an.N();
        if (w.var13(var11.aq) && w.var3(var12.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var11.ap = var1[1];
            Movement.walkTo((WorldPoint)var12);
            0;
            return var1[1];
        }
        RegionPoint var14 = var11.an.L();
        if (w.var15(var14)) {
            return var1[2];
        }
        if (w.var15(Players.getLocal().getInteracting()) && w.var13(var11.an.P() ? 1 : 0)) {
            return var1[2];
        }
        WorldPoint var16 = l.a(var14);
        if (w.var15(var16)) {
            return var1[2];
        }
        int var17 = Static.getClient().getTickCount();
        NPC var18 = var11.am.t().C();
        if (w.var19(var18.distanceTo((Locatable)Players.getLocal()), var1[3])) {
            n2 = var1[1];
            0;
            if ((37 + 125 - 37 + 49 ^ 29 + 23 - -93 + 25) <= -1) {
                return ((1 + 28 - -143 + 25 ^ 88 + 131 - 167 + 84) & (0xD4 ^ 0xAA ^ (0x66 ^ 0x55) ^ -1)) != 0;
            }
        } else {
            n2 = var10 = var1[2];
        }
        if (w.var19(var17 - var11.ao, var1[1]) && w.var20(var11.ao, var1[0]) && w.var13(var10) && w.var13(var11.an.P() ? 1 : 0)) {
            return var1[2];
        }
        if (w.var13(l.H() ? 1 : 0) && w.var3(var11.ap)) {
            var11.ap = var1[1];
            var11.sleep(var1[4]);
            return var1[1];
        }
        if (w.var13(var11.ap) && w.var13(var11.aq)) {
            var11.aq = var1[2];
        }
        Movement.walkTo((WorldPoint)var3_3);
        0;
        this.sleep(var1[1]);
        return var1[1];
    }

    @Inject
    public MovingToNextTileTask(g g2, l l2) {
        this.ao = var1[0];
        this.ap = var1[1];
        this.am = g2;
        this.an = l2;
    }

    static {
        w.var21();
        w.var22();
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var29(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }

    private static String var30(String var31, String var32) {
        var31 = new String(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var33 = new StringBuilder();
        char[] var34 = var32.toCharArray();
        int var35 = var1[2];
        char[] var36 = var31.toCharArray();
        int var37 = var36.length;
        int var38 = var1[2];
        while (w.var39(var38, var37)) {
            char var40 = var36[var38];
            var33.append((char)(var40 ^ var34[var35 % var34.length]));
            0;
            ++var35;
            ++var38;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var33);
    }

    private static void var22() {
        var2 = new String[var1[3]];
        w.var2[w.var1[2]] = "Commander Zilyana";
        w.var2[w.var1[1]] = "heals";
        w.var2[w.var1[6]] = "Commander Zilyana";
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    private static boolean var19(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var39(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var41;
        if (w.var13(chatMessage.getMessage().contains(var2[var1[1]]) ? 1 : 0)) {
            this.ao = Static.getClient().getTickCount() + var1[3];
        }
        if (w.var13(var41.getMessage().contains(var2[var1[6]]) ? 1 : 0)) {
            var42.ap = var1[2];
        }
    }

    private static boolean var43(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var44;
        if (w.var29(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (w.var43(var44.getActor().getAnimation(), var1[5])) {
            var45.ao = Static.getClient().getTickCount();
        }
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static void var21() {
        var1 = new int[8];
        w.var1[0] = -1;
        w.var1[1] = 1;
        w.var1[2] = (0x52 ^ 0x1C) & ~(0x4F ^ 1);
        w.var1[3] = 3;
        w.var1[4] = 41 + 23 - 56 + 162 ^ 46 + 82 - 94 + 140;
        w.var1[5] = 0xFFFFF3AA & 0xDFF;
        w.var1[6] = 2;
        w.var1[7] = 0xF ^ 7;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }
}

