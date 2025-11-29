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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
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
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Moving to next tile", priority=9, register=true)
@Singleton
public class MovingToNextTileTask
extends Task {
    private final  d ad;
    private  boolean ah;
    
    private  int ae;
    private  boolean af;
    private final  e ac;
    
    private  boolean ag;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var3;
        if (r.var4(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (r.var5(var3.getActor().getAnimation(), var2[6])) {
            var6.ae = Static.getClient().getTickCount();
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (r.var7(npcSpawned.getNpc().getName().equals(var1[var2[2]]) ? 1 : 0)) {
            return;
        }
        this.af = var2[2];
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static void var8() {
        var2 = new int[8];
        r.var2[0] = -1;
        r.var2[1] = 1;
        r.var2[2] = (106 + 47 - 122 + 162 ^ 73 + 8 - -35 + 38) & (89 + 161 - 90 + 58 ^ 11 + 48 - 43 + 113 ^ -1);
        r.var2[3] = 3;
        r.var2[4] = 0x93 ^ 0x99 ^ (0x69 ^ 0x67);
        r.var2[5] = 0x52 ^ 0x55;
        r.var2[6] = -(0xFFFFAFEB & 0x7E56) & (0xFFFFEFFB & 0x3FEF);
        r.var2[7] = 2;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public MovingToNextTileTask(e e2, d d2) {
        this.ae = var2[0];
        this.af = var2[1];
        this.ac = e2;
        this.ad = d2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        r var11;
        if (r.var7(this.ac.t() ? 1 : 0)) {
            this.ah = var2[1];
            this.af = var2[1];
            return var2[2];
        }
        if (r.var7(var11.ac.y() ? 1 : 0)) {
            return var2[2];
        }
        if (r.var7(var11.ac.s() ? 1 : 0)) {
            return var2[2];
        }
        WorldPoint var12 = var11.ad.p();
        if (r.var9(var11.ah) && r.var7(var12.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var11.af = var2[1];
            Movement.setDestination((WorldPoint)var12);
            return var2[1];
        }
        RegionPoint var13 = var11.ad.k();
        if (r.var14(var13)) {
            if (r.var9(Players.getLocal().isMoving() ? 1 : 0)) {
                return var2[2];
            }
            WorldPoint var15 = var11.ad.l();
            if (r.var16(var15)) {
                Movement.setDestination((WorldPoint)var15);
                return var2[1];
            }
            return var2[2];
        }
        if (r.var14(Players.getLocal().getInteracting())) {
            return var2[2];
        }
        WorldPoint var15 = d.a(var13);
        if (r.var14(var15)) {
            return var2[2];
        }
        int var17 = Static.getClient().getTickCount();
        NPC var18 = var11.ac.z().c();
        if (r.var19(var17 - var11.ae, var2[1]) && r.var20(var11.ae, var2[0]) && r.var19(var18.distanceTo((Locatable)Players.getLocal()), var2[3])) {
            return var2[2];
        }
        if (r.var9(d.j() ? 1 : 0) && r.var7(var11.af)) {
            var11.af = var2[1];
            var11.sleep(var2[4]);
            return var2[1];
        }
        if (r.var9(var11.af) && r.var9(var11.ah)) {
            var11.ah = var2[2];
        }
        var11.sleep(var2[1]);
        if (r.var9(var11.ad.n() ? 1 : 0)) {
            int[] nArray = new int[var2[1]];
            nArray[r.var2[2]] = var2[5];
            TileObject var21 = TileObjects.getNearest((int[])nArray);
            var21.interact(var2[2]);
            var11.ag = var2[1];
            return var2[1];
        }
        Movement.setDestination((WorldPoint)var3_4);
        this.ag = var2[2];
        return var2[1];
    }

    private static boolean var19(int n2, int n3) {
        return n2 > n3;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[2];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[2];
        while (r.var10(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            
            return null;
        }
        return String.valueOf(var25);
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }

    public boolean O() {
        return this.ag;
    }

    static {
        r.var8();
        r.var32();
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var39;
        if (r.var9(chatMessage.getMessage().contains(var1[var2[1]]) ? 1 : 0)) {
            this.ae = Static.getClient().getTickCount() + var2[3];
        }
        if (r.var9(var39.getMessage().contains(var1[var2[7]]) ? 1 : 0)) {
            var40.af = var2[2];
        }
    }

    private static void var32() {
        var1 = new String[var2[3]];
        r.var1[r.var2[2]] = "General Graardor";
        r.var1[r.var2[1]] = "heals";
        r.var1[r.var2[7]] = "General Gra";
    }
}

