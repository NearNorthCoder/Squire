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
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.util.ArrayList;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.mixology.tasks.GameEnum6;
import gg.squire.mixology.tasks.GameEnum7;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="Turning in potion task")
public class TurningInPotionTask
extends Task {
    private final  SquireMixologyConfig Z;

    static {
        q.var3();
        q.var4();
    }

    @Inject
    public TurningInPotionTask(SquireMixologyConfig squireMixologyConfig) {
        this.Z = squireMixologyConfig;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean var18(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var19(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var20(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var21(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var22(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var2[0];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var2[0];
        while (q.var32(var31, var30)) {
            char var33 = var29[var31];
            var26.append((char)(var33 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    private static boolean var34(int n2) {
        return n2 == 0;
    }

    private static boolean var35(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var32(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var36;
        block19: {
            block22: {
                int var37;
                int var38;
                int var39;
                block21: {
                    block20: {
                        if (q.var34(s.e() ? 1 : 0)) {
                            return var2[0];
                        }
                        if (q.var35((Object)var36.Z.pluginMode(), (Object)d.MINIGAME)) {
                            return var2[0];
                        }
                        if (q.var21(Movement.getRunEnergy(), var2[1]) && q.var34(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                            return var2[0];
                        }
                        int[] nArray = new int[var2[2]];
                        nArray[q.var2[0]] = var2[3];
                        TileObject var40 = TileObjects.getNearest((int[])nArray);
                        if (q.var5(var40) && q.var41(s.h() ? 1 : 0) && q.var22(Players.getLocal().getWorldLocation().distanceTo(var40.getWorldLocation()), var2[2])) {
                            var40.interact(var2[0]);
                            return var2[0];
                        }
                        if (q.var5(var40) && q.var34(s.f() ? 1 : 0) && q.var22(Players.getLocal().getWorldLocation().distanceTo(var40.getWorldLocation()), var2[2])) {
                            SquireMixology.m = var1[var2[0]];
                            SquireMixology.o = var1[var2[2]];
                            SquireMixology.n = var1[var2[4]];
                            SquireMixology.p = var1[var2[5]];
                            SquireMixology.r = var2[6];
                            SquireMixology.A = var2[0];
                            SquireMixology.k = var2[0];
                            SquireMixology.u = var2[2];
                            SquireMixology.v = var2[2];
                            SquireMixology.w = var2[2];
                            SquireMixology.s = var2[6];
                            SquireMixology.t = var2[6];
                            SquireMixology.x = var2[6];
                            Integer[] integerArray = new Integer[var2[5]];
                            integerArray[q.var2[0]] = var2[6];
                            integerArray[q.var2[2]] = var2[6];
                            integerArray[q.var2[4]] = var2[6];
                            SquireMixology.z = new ArrayList<Integer>(Arrays.asList(integerArray));
                            String[] stringArray = new String[var2[5]];
                            stringArray[q.var2[0]] = null;
                            stringArray[q.var2[2]] = null;
                            stringArray[q.var2[4]] = null;
                            SquireMixology.y = new ArrayList<String>(Arrays.asList(stringArray));
                        }
                        if (q.var34(s.h() ? 1 : 0)) {
                            return var2[0];
                        }
                        String[] stringArray = new String[var2[2]];
                        stringArray[q.var2[0]] = var1[var2[7]];
                        TileObject var42 = TileObjects.getNearest((String[])stringArray);
                        if (q.var5(var42)) {
                            SquireMixology.g = var1[var2[8]];
                            var42.interact(var1[var2[9]]);
                            return var2[0];
                        }
                        if (!q.var18((Object)var36.Z.potionStrategy(), (Object)f.MULTI_ORDER)) break block19;
                        var39 = s.e(SquireMixology.m);
                        var38 = s.e(SquireMixology.n);
                        var37 = s.e(SquireMixology.o);
                        int[] nArray2 = new int[var2[2]];
                        nArray2[q.var2[0]] = var39;
                        if (!q.var41(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                        int[] nArray3 = new int[var2[2]];
                        nArray3[q.var2[0]] = var39;
                        if (!q.var20(Inventory.getCount((int[])nArray3), SquireMixology.u)) break block20;
                        int[] nArray4 = new int[var2[2]];
                        nArray4[q.var2[0]] = var38;
                        if (!q.var41(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                        int[] nArray5 = new int[var2[2]];
                        nArray5[q.var2[0]] = var38;
                        if (!q.var20(Inventory.getCount((int[])nArray5), SquireMixology.v)) break block20;
                        int[] nArray6 = new int[var2[2]];
                        nArray6[q.var2[0]] = var37;
                        if (!q.var41(Inventory.contains((int[])nArray6) ? 1 : 0)) break block20;
                        int[] nArray7 = new int[var2[2]];
                        nArray7[q.var2[0]] = var37;
                        if (!q.var19(Inventory.getCount((int[])nArray7), SquireMixology.w)) break block21;
                    }
                    return var2[0];
                }
                int[] nArray = new int[var2[2]];
                nArray[q.var2[0]] = var39;
                if (!q.var41(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray8 = new int[var2[2]];
                nArray8[q.var2[0]] = var38;
                if (!q.var41(Inventory.contains((int[])nArray8) ? 1 : 0)) break block22;
                int[] nArray9 = new int[var2[2]];
                nArray9[q.var2[0]] = var37;
                if (!q.var34(Inventory.contains((int[])nArray9) ? 1 : 0)) break block19;
            }
            return var2[0];
        }
        String[] stringArray = new String[var2[2]];
        stringArray[q.var2[0]] = var1[var2[10]];
        if (q.var41(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (q.var32(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
                String[] stringArray2 = new String[var2[2]];
                stringArray2[q.var2[0]] = var1[var2[12]];
                int[] nArray = new int[var2[2]];
                nArray[q.var2[0]] = s.e(SquireMixology.m);
                Inventory.getFirst((String[])stringArray2).useOn(Inventory.getFirst((int[])nArray));
            }
            if (q.var21(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
                String[] stringArray3 = new String[var2[2]];
                stringArray3[q.var2[0]] = var1[var2[13]];
                if (q.var41(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[var2[2]];
                    stringArray4[q.var2[0]] = var1[var2[14]];
                    int[] nArray = new int[var2[2]];
                    nArray[q.var2[0]] = s.e(var1[var2[15]]);
                    Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((int[])nArray));
                }
            }
        }
        String[] stringArray5 = new String[var2[2]];
        stringArray5[q.var2[0]] = var1[var2[16]];
        if (q.var41(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
            String[] stringArray6 = new String[var2[2]];
            stringArray6[q.var2[0]] = var1[var2[17]];
            Inventory.getFirst((String[])stringArray6).interact(var1[var2[18]]);
        }
        if (q.var41(var36.Z.useStamina() ? 1 : 0) && q.var32(Movement.getRunEnergy(), var2[19]) && q.var41(Inventory.contains(item -> item.getName().contains(var1[var2[23]])) ? 1 : 0) && q.var34(Movement.isStaminaBoosted() ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(var1[var2[22]])).interact(var1[var2[20]]);
        }
        SquireMixology.g = var1[var2[21]];
        var1_1.interact(var2[0]);
        return var2[0];
    }

    private static void var3() {
        var2 = new int[25];
        q.var2[0] = (0xDF ^ 0x9D ^ (0x26 ^ 0x71)) & (0x1B ^ 0x66 ^ (0xF2 ^ 0x9A) ^ -1);
        q.var2[1] = 0x8F ^ 0x9B;
        q.var2[2] = 1;
        q.var2[3] = -(0xFFFFD579 & 0x2BCF) & (0xFFFFDFED & 0xF7DF);
        q.var2[4] = 2;
        q.var2[5] = 3;
        q.var2[6] = -1;
        q.var2[7] = 0xAA ^ 0xAE;
        q.var2[8] = 44 + 142 - 76 + 40 ^ 68 + 65 - 120 + 134;
        q.var2[9] = 9 ^ 0xF;
        q.var2[10] = 0xE4 ^ 0x93 ^ (0xF9 ^ 0x89);
        q.var2[11] = 0xE0 ^ 0xB1;
        q.var2[12] = 0xC9 ^ 0xC1;
        q.var2[13] = 0xB8 ^ 0xB1;
        q.var2[14] = 0x10 ^ 0x4C ^ (0xDF ^ 0x89);
        q.var2[15] = 146 + 143 - 116 + 14 ^ 93 + 50 - 108 + 141;
        q.var2[16] = 0x18 ^ 0x14;
        q.var2[17] = 0x5D ^ 0x50;
        q.var2[18] = 0xC8 ^ 0x97 ^ (0xE5 ^ 0xB4);
        q.var2[19] = 0x2F ^ 0x6E;
        q.var2[20] = 0x27 ^ 0x75 ^ (0xF7 ^ 0xAA);
        q.var2[21] = 23 + 3 - 1 + 159 ^ 96 + 33 - 49 + 88;
        q.var2[22] = 0xAA ^ 0xA7 ^ (0x65 ^ 0x79);
        q.var2[23] = 0x17 ^ 5;
        q.var2[24] = 0xB ^ 0x18;
    }

    private static void var4() {
        var1 = new String[var2[24]];
        q.var1[q.var2[0]] = "Empty";
        q.var1[q.var2[2]] = "Empty";
        q.var1[q.var2[4]] = "Empty";
        q.var1[q.var2[5]] = "Empty";
        q.var1[q.var2[7]] = "Mature digweed";
        q.var1[q.var2[8]] = "Collecting digweed";
        q.var1[q.var2[9]] = "Collect";
        q.var1[q.var2[10]] = "Digweed";
        q.var1[q.var2[12]] = "Digweed";
        q.var1[q.var2[13]] = "Mixalot";
        q.var1[q.var2[14]] = "Digweed";
        q.var1[q.var2[15]] = "Mixalot";
        q.var1[q.var2[16]] = "Vial";
        q.var1[q.var2[17]] = "Vial";
        q.var1[q.var2[18]] = "Drop";
        q.var1[q.var2[20]] = "Drink";
        q.var1[q.var2[21]] = "Turning in potion";
        q.var1[q.var2[22]] = "Stamina";
        q.var1[q.var2[23]] = "Stamina";
    }

    private static boolean var41(int n2) {
        return n2 != 0;
    }
}

