/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Throwing fishing explosive", register=true)
public class ThrowingFishingExplosiveTask
extends Task {
    public static final  int cm;
    private static  String[] lIIIlIIl;
    public static final  int cl;
    public static final  int ck;
    public static final  int cj;
    private static  int[] lIIIlIlI;

    private static void var1() {
        lIIIlIlI = new int[10];
        U.lIIIlIlI[0] = (192 + 126 - 209 + 96 ^ 80 + 65 - 92 + 76) & (192 + 93 - 237 + 160 ^ 41 + 154 - 133 + 94 ^ -1);
        U.lIIIlIlI[1] = 17 + 57 - 51 + 123 ^ 70 + 76 - 116 + 147;
        U.lIIIlIlI[2] = 1;
        U.lIIIlIlI[3] = -(0xFFFFA6CF & 0x7B3B) & (0xFFFFE3FB & 0x3FFE);
        U.lIIIlIlI[4] = 72 + 65 - -23 + 42 ^ 45 + 67 - 16 + 96;
        U.lIIIlIlI[5] = 0x7B ^ 0x4A;
        U.lIIIlIlI[6] = -(0xFFFFD6BB & 0x69D7) & (0xFFFFDFDE & 0x7ABB);
        U.lIIIlIlI[7] = 0x85 ^ 0x8D ^ (0x1E ^ 2);
        U.lIIIlIlI[8] = 0xFFFF8C7E & 0xFFAF;
        U.lIIIlIlI[9] = 2;
    }

    private static boolean var2(int n2, int n3) {
        return n2 > n3;
    }

    private static void var3() {
        lIIIlIIl = new String[lIIIlIlI[9]];
        U.lIIIlIIl[U.lIIIlIlI[0]] = "Eat";
        U.lIIIlIIl[U.lIIIlIlI[2]] = "Eat";
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = lIIIlIlI[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = lIIIlIlI[0];
        while (U.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (-(0x2F ^ 0x2A) < 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var4_4;
        Item item2 = Inventory.getFirst(item -> item.hasAction(lIIIlIIl[lIIIlIlI[2]]::equals));
        if (U.var16(item2)) {
            return lIIIlIlI[0];
        }
        if (U.var2(Combat.getMissingHealth(), lIIIlIlI[1])) {
            void var17;
            var17.interact(lIIIlIIl[lIIIlIlI[0]]);
            return lIIIlIlI[2];
        }
        int[] nArray = new int[lIIIlIlI[2]];
        nArray[U.lIIIlIlI[0]] = lIIIlIlI[3];
        NPC var18 = NPCs.getNearest((int[])nArray);
        if (!U.var19(var18) || U.var4(var18.distanceTo((Locatable)Players.getLocal()), lIIIlIlI[4])) {
            return lIIIlIlI[0];
        }
        int[] nArray2 = new int[lIIIlIlI[2]];
        nArray2[U.lIIIlIlI[0]] = lIIIlIlI[5];
        Projectile var20 = Projectiles.getNearest((int[])nArray2);
        if (U.var19(var20)) {
            return lIIIlIlI[0];
        }
        int[] nArray3 = new int[lIIIlIlI[2]];
        nArray3[U.lIIIlIlI[0]] = lIIIlIlI[6];
        Item var21 = Inventory.getFirst((int[])nArray3);
        if (U.var16(var21)) {
            return lIIIlIlI[0];
        }
        var4_4.useOn((Actor)var2_2);
        this.sleep(lIIIlIlI[7]);
        return lIIIlIlI[2];
    }

    private static boolean var19(Object object) {
        return object != null;
    }

    static {
        U.var1();
        U.var3();
        cl = lIIIlIlI[6];
        ck = lIIIlIlI[5];
        cm = lIIIlIlI[3];
        cj = lIIIlIlI[8];
    }
}

