/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Getting killcount", priority=5)
public class GettingKillcountTask
extends Task {
    
    private final  Client aE;
    private final  e aD;
    
    private static final  WorldPoint aC;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (A.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (3 <= (0x24 ^ 0x20)) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    static {
        A.var23();
        A.var24();
        aC = new WorldPoint(var1[14], var1[15], var1[1]);
    }

    private static boolean var25(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public GettingKillcountTask(e e2) {
        this.aD = e2;
        this.aE = Static.getClient();
    }

    private int R() {
        A var26;
        if (A.var9(this.aE.getVarbitValue(var1[3]), var1[1])) {
            return var1[4];
        }
        if (A.var9(var26.aE.getVarbitValue(var1[5]), var1[1])) {
            return var1[6];
        }
        if (A.var9(var26.aE.getVarbitValue(var1[7]), var1[1])) {
            return var1[8];
        }
        if (A.var9(var26.aE.getVarbitValue(var1[9]), var1[1])) {
            return var1[10];
        }
        return var1[11];
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static void var24() {
        var2 = new String[var1[1]];
        A.var2[A.var1[0]] = "Attack";
        A.var2[A.var1[2]] = "Goblin";
    }

    private static boolean var27(int n2) {
        return n2 == 0;
    }

    private static boolean var28(int n2) {
        return n2 != 0;
    }

    private static boolean var29(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        A var30;
        if (A.var28(this.aD.t() ? 1 : 0)) {
            return var1[0];
        }
        if (A.var25(var30.aD.x(), var30.R())) {
            return var1[0];
        }
        Player var31 = Players.getLocal();
        if (A.var10(var31.getInteracting())) {
            return var1[0];
        }
        NPC var32 = NPCs.getNearest(nPC -> {
            int n2;
            if (A.var27(nPC.isDead() ? 1 : 0) && A.var28(nPC.getName().equals(var2[var1[2]]) ? 1 : 0) && A.var29(nPC.distanceTo((Locatable)var31), var1[12]) && A.var29(nPC.distanceTo(aC), var1[13])) {
                n2 = var1[2];
                0;
                if (2 == ((0x22 ^ 0x28 ^ (5 ^ 0x2B)) & (0xB6 ^ 0xAF ^ (0x2C ^ 0x11) ^ -1))) {
                    return ((0xB5 ^ 0xBA ^ (0x97 ^ 0xC6)) & (0x63 ^ 0x25 ^ (0xAF ^ 0xB7) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (A.var11(var32)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[0]]);
        this.sleep(var1[1]);
        return var1[2];
    }

    private static void var23() {
        var1 = new int[16];
        A.var1[0] = (0x62 ^ 0x79) & ~(0xB4 ^ 0xAF);
        A.var1[1] = 2;
        A.var1[2] = 1;
        A.var1[3] = 0xFFFFB6DE & 0x7B65;
        A.var1[4] = 51 + 102 - 73 + 95 ^ 119 + 12 - 23 + 52;
        A.var1[5] = 0xFFFFBEFF & 0x7343;
        A.var1[6] = 0x28 ^ 0x1D ^ (0x30 ^ 0x1C);
        A.var1[7] = 0xFFFFF37E & 0x3EC3;
        A.var1[8] = 0x33 ^ 0x2D;
        A.var1[9] = -(0xFFFFA53D & 0x5EDF) & (0xFFFFF7DD & 0x3E7F);
        A.var1[10] = 0x58 ^ 0x7B;
        A.var1[11] = 0x2A ^ 2;
        A.var1[12] = 9 ^ 3;
        A.var1[13] = 0xC3 ^ 0x9D ^ (8 ^ 0x5E);
        A.var1[14] = 0xFFFFBFFE & 0x4B3F;
        A.var1[15] = -(0xFFFFFABE & 0x4F6F) & (0xFFFFFFFF & 0x5EFF);
    }
}

