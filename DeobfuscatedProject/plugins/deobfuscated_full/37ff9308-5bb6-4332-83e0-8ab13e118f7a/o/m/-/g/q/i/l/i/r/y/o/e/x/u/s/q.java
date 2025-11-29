/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.d;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.f;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s;

/* TASK: Turning in potion task -> TurninginpotiontaskTask */
@TaskDesc(name="Turning in potion task")
public class q
extends Task {
    private final /* synthetic */ SquireMixologyConfig Z;
    private static /* synthetic */ String[] lllllllIlIIl;
    private static /* synthetic */ int[] lllllllIllII;

    static {
        q.lIIlIlIlIlIIlll();
        q.lIIlIlIlIlIIIII();
    }

    @Inject
    public q(SquireMixologyConfig squireMixologyConfig) {
        this.Z = squireMixologyConfig;
    }

    private static boolean lIIlIlIlIlIlIll(Object object) {
        return object != null;
    }

    private static String lIIlIlIlIIllIll(String var15, String var13) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lllllllIllII[4], var23);
            return new String(var12.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIlIIlllII(String var9, String var11) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lllllllIllII[12]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lllllllIllII[4], var17);
            return new String(var20.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIlIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIlIlIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIlIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIlIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIlIlIlIIlllIl(String var4, String var3) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var6 = var3.toCharArray();
        int var1 = lllllllIllII[0];
        char[] var16 = var4.toCharArray();
        int var8 = var16.length;
        int var22 = lllllllIllII[0];
        while (q.lIIlIlIlIllIIIl(var22, var8)) {
            char var5 = var16[var22];
            var2.append((char)(var5 ^ var6[var1 % var6.length]));
            0;
            ++var1;
            ++var22;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIIlIlIlIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIlIlIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIlIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var10;
        block19: {
            block22: {
                int var24;
                int var7;
                int var21;
                block21: {
                    block20: {
                        if (q.lIIlIlIlIlIlIII(s.e() ? 1 : 0)) {
                            return lllllllIllII[0];
                        }
                        if (q.lIIlIlIlIlIlIIl((Object)var10.Z.pluginMode(), (Object)d.MINIGAME)) {
                            return lllllllIllII[0];
                        }
                        if (q.lIIlIlIlIlIlIlI(Movement.getRunEnergy(), lllllllIllII[1]) && q.lIIlIlIlIlIlIII(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                            return lllllllIllII[0];
                        }
                        int[] nArray = new int[lllllllIllII[2]];
                        nArray[q.lllllllIllII[0]] = lllllllIllII[3];
                        TileObject var18 = TileObjects.getNearest((int[])nArray);
                        if (q.lIIlIlIlIlIlIll(var18) && q.lIIlIlIlIlIllII(s.h() ? 1 : 0) && q.lIIlIlIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(var18.getWorldLocation()), lllllllIllII[2])) {
                            var18.interact(lllllllIllII[0]);
                            return lllllllIllII[0];
                        }
                        if (q.lIIlIlIlIlIlIll(var18) && q.lIIlIlIlIlIlIII(s.f() ? 1 : 0) && q.lIIlIlIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(var18.getWorldLocation()), lllllllIllII[2])) {
                            SquireMixology.m = lllllllIlIIl[lllllllIllII[0]];
                            SquireMixology.o = lllllllIlIIl[lllllllIllII[2]];
                            SquireMixology.n = lllllllIlIIl[lllllllIllII[4]];
                            SquireMixology.p = lllllllIlIIl[lllllllIllII[5]];
                            SquireMixology.r = lllllllIllII[6];
                            SquireMixology.A = lllllllIllII[0];
                            SquireMixology.k = lllllllIllII[0];
                            SquireMixology.u = lllllllIllII[2];
                            SquireMixology.v = lllllllIllII[2];
                            SquireMixology.w = lllllllIllII[2];
                            SquireMixology.s = lllllllIllII[6];
                            SquireMixology.t = lllllllIllII[6];
                            SquireMixology.x = lllllllIllII[6];
                            Integer[] integerArray = new Integer[lllllllIllII[5]];
                            integerArray[q.lllllllIllII[0]] = lllllllIllII[6];
                            integerArray[q.lllllllIllII[2]] = lllllllIllII[6];
                            integerArray[q.lllllllIllII[4]] = lllllllIllII[6];
                            SquireMixology.z = new ArrayList<Integer>(Arrays.asList(integerArray));
                            String[] stringArray = new String[lllllllIllII[5]];
                            stringArray[q.lllllllIllII[0]] = null;
                            stringArray[q.lllllllIllII[2]] = null;
                            stringArray[q.lllllllIllII[4]] = null;
                            SquireMixology.y = new ArrayList<String>(Arrays.asList(stringArray));
                        }
                        if (q.lIIlIlIlIlIlIII(s.h() ? 1 : 0)) {
                            return lllllllIllII[0];
                        }
                        String[] stringArray = new String[lllllllIllII[2]];
                        stringArray[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[7]];
                        TileObject var19 = TileObjects.getNearest((String[])stringArray);
                        if (q.lIIlIlIlIlIlIll(var19)) {
                            SquireMixology.g = lllllllIlIIl[lllllllIllII[8]];
                            var19.interact(lllllllIlIIl[lllllllIllII[9]]);
                            return lllllllIllII[0];
                        }
                        if (!q.lIIlIlIlIlIlllI((Object)var10.Z.potionStrategy(), (Object)f.MULTI_ORDER)) break block19;
                        var21 = s.e(SquireMixology.m);
                        var7 = s.e(SquireMixology.n);
                        var24 = s.e(SquireMixology.o);
                        int[] nArray2 = new int[lllllllIllII[2]];
                        nArray2[q.lllllllIllII[0]] = var21;
                        if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                        int[] nArray3 = new int[lllllllIllII[2]];
                        nArray3[q.lllllllIllII[0]] = var21;
                        if (!q.lIIlIlIlIlIllll(Inventory.getCount((int[])nArray3), SquireMixology.u)) break block20;
                        int[] nArray4 = new int[lllllllIllII[2]];
                        nArray4[q.lllllllIllII[0]] = var7;
                        if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                        int[] nArray5 = new int[lllllllIllII[2]];
                        nArray5[q.lllllllIllII[0]] = var7;
                        if (!q.lIIlIlIlIlIllll(Inventory.getCount((int[])nArray5), SquireMixology.v)) break block20;
                        int[] nArray6 = new int[lllllllIllII[2]];
                        nArray6[q.lllllllIllII[0]] = var24;
                        if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block20;
                        int[] nArray7 = new int[lllllllIllII[2]];
                        nArray7[q.lllllllIllII[0]] = var24;
                        if (!q.lIIlIlIlIllIIII(Inventory.getCount((int[])nArray7), SquireMixology.w)) break block21;
                    }
                    return lllllllIllII[0];
                }
                int[] nArray = new int[lllllllIllII[2]];
                nArray[q.lllllllIllII[0]] = var21;
                if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray8 = new int[lllllllIllII[2]];
                nArray8[q.lllllllIllII[0]] = var7;
                if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block22;
                int[] nArray9 = new int[lllllllIllII[2]];
                nArray9[q.lllllllIllII[0]] = var24;
                if (!q.lIIlIlIlIlIlIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block19;
            }
            return lllllllIllII[0];
        }
        String[] stringArray = new String[lllllllIllII[2]];
        stringArray[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[10]];
        if (q.lIIlIlIlIlIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (q.lIIlIlIlIllIIIl(Skills.getLevel((Skill)Skill.HERBLORE), lllllllIllII[11])) {
                String[] stringArray2 = new String[lllllllIllII[2]];
                stringArray2[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[12]];
                int[] nArray = new int[lllllllIllII[2]];
                nArray[q.lllllllIllII[0]] = s.e(SquireMixology.m);
                Inventory.getFirst((String[])stringArray2).useOn(Inventory.getFirst((int[])nArray));
            }
            if (q.lIIlIlIlIlIlIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllllllIllII[11])) {
                String[] stringArray3 = new String[lllllllIllII[2]];
                stringArray3[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[13]];
                if (q.lIIlIlIlIlIllII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lllllllIllII[2]];
                    stringArray4[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[14]];
                    int[] nArray = new int[lllllllIllII[2]];
                    nArray[q.lllllllIllII[0]] = s.e(lllllllIlIIl[lllllllIllII[15]]);
                    Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((int[])nArray));
                }
            }
        }
        String[] stringArray5 = new String[lllllllIllII[2]];
        stringArray5[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[16]];
        if (q.lIIlIlIlIlIllII(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
            String[] stringArray6 = new String[lllllllIllII[2]];
            stringArray6[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[17]];
            Inventory.getFirst((String[])stringArray6).interact(lllllllIlIIl[lllllllIllII[18]]);
        }
        if (q.lIIlIlIlIlIllII(var10.Z.useStamina() ? 1 : 0) && q.lIIlIlIlIllIIIl(Movement.getRunEnergy(), lllllllIllII[19]) && q.lIIlIlIlIlIllII(Inventory.contains(item -> item.getName().contains(lllllllIlIIl[lllllllIllII[23]])) ? 1 : 0) && q.lIIlIlIlIlIlIII(Movement.isStaminaBoosted() ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(lllllllIlIIl[lllllllIllII[22]])).interact(lllllllIlIIl[lllllllIllII[20]]);
        }
        SquireMixology.g = lllllllIlIIl[lllllllIllII[21]];
        var1_1.interact(lllllllIllII[0]);
        return lllllllIllII[0];
    }

    private static void lIIlIlIlIlIIlll() {
        lllllllIllII = new int[25];
        q.lllllllIllII[0] = (0xDF ^ 0x9D ^ (0x26 ^ 0x71)) & (0x1B ^ 0x66 ^ (0xF2 ^ 0x9A) ^ -1);
        q.lllllllIllII[1] = 0x8F ^ 0x9B;
        q.lllllllIllII[2] = 1;
        q.lllllllIllII[3] = -(0xFFFFD579 & 0x2BCF) & (0xFFFFDFED & 0xF7DF);
        q.lllllllIllII[4] = 2;
        q.lllllllIllII[5] = 3;
        q.lllllllIllII[6] = -1;
        q.lllllllIllII[7] = 0xAA ^ 0xAE;
        q.lllllllIllII[8] = 44 + 142 - 76 + 40 ^ 68 + 65 - 120 + 134;
        q.lllllllIllII[9] = 9 ^ 0xF;
        q.lllllllIllII[10] = 0xE4 ^ 0x93 ^ (0xF9 ^ 0x89);
        q.lllllllIllII[11] = 0xE0 ^ 0xB1;
        q.lllllllIllII[12] = 0xC9 ^ 0xC1;
        q.lllllllIllII[13] = 0xB8 ^ 0xB1;
        q.lllllllIllII[14] = 0x10 ^ 0x4C ^ (0xDF ^ 0x89);
        q.lllllllIllII[15] = 146 + 143 - 116 + 14 ^ 93 + 50 - 108 + 141;
        q.lllllllIllII[16] = 0x18 ^ 0x14;
        q.lllllllIllII[17] = 0x5D ^ 0x50;
        q.lllllllIllII[18] = 0xC8 ^ 0x97 ^ (0xE5 ^ 0xB4);
        q.lllllllIllII[19] = 0x2F ^ 0x6E;
        q.lllllllIllII[20] = 0x27 ^ 0x75 ^ (0xF7 ^ 0xAA);
        q.lllllllIllII[21] = 23 + 3 - 1 + 159 ^ 96 + 33 - 49 + 88;
        q.lllllllIllII[22] = 0xAA ^ 0xA7 ^ (0x65 ^ 0x79);
        q.lllllllIllII[23] = 0x17 ^ 5;
        q.lllllllIllII[24] = 0xB ^ 0x18;
    }

    private static void lIIlIlIlIlIIIII() {
        lllllllIlIIl = new String[lllllllIllII[24]];
        q.lllllllIlIIl[q.lllllllIllII[0]] = q."Empty";
        q.lllllllIlIIl[q.lllllllIllII[2]] = q."Empty";
        q.lllllllIlIIl[q.lllllllIllII[4]] = q."Empty";
        q.lllllllIlIIl[q.lllllllIllII[5]] = q."Empty";
        q.lllllllIlIIl[q.lllllllIllII[7]] = q."Mature digweed";
        q.lllllllIlIIl[q.lllllllIllII[8]] = q."Collecting digweed";
        q.lllllllIlIIl[q.lllllllIllII[9]] = q."Collect";
        q.lllllllIlIIl[q.lllllllIllII[10]] = q."Digweed";
        q.lllllllIlIIl[q.lllllllIllII[12]] = q."Digweed";
        q.lllllllIlIIl[q.lllllllIllII[13]] = q."Mixalot";
        q.lllllllIlIIl[q.lllllllIllII[14]] = q."Digweed";
        q.lllllllIlIIl[q.lllllllIllII[15]] = q."Mixalot";
        q.lllllllIlIIl[q.lllllllIllII[16]] = q."Vial";
        q.lllllllIlIIl[q.lllllllIllII[17]] = q."Vial";
        q.lllllllIlIIl[q.lllllllIllII[18]] = q."Drop";
        q.lllllllIlIIl[q.lllllllIllII[20]] = q."Drink";
        q.lllllllIlIIl[q.lllllllIllII[21]] = q."Turning in potion";
        q.lllllllIlIIl[q.lllllllIllII[22]] = q."Stamina";
        q.lllllllIlIIl[q.lllllllIllII[23]] = q."Stamina";
    }

    private static boolean lIIlIlIlIlIllII(int n2) {
        return n2 != 0;
    }
}

