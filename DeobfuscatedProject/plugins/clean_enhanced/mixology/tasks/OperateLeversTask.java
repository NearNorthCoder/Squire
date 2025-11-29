/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import gg.squire.mixology.overlay.MixologyInfoBox;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.mixology.tasks.GameEnum6;
import gg.squire.mixology.tasks.GameEnum7;
import gg.squire.mixology.tasks.MixologyManager;
import gg.squire.mixology.tasks.GameEnum;

@TaskDesc(name="Operate levers")
public class OperateLeversTask
extends Task {
    private final  SquireMixologyConfig Y;
    
    private  int K;
    
    private  int J;
    private  int I;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public OperateLeversTask(SquireMixologyConfig squireMixologyConfig) {
        this.I = var1[0];
        this.J = var1[1];
        this.K = var1[2];
        this.Y = squireMixologyConfig;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static void var6() {
        var2 = new String[var1[36]];
        o.var2[o.var1[3]] = "Entering minigame area";
        o.var2[o.var1[4]] = "\\s*\\(.*?\\)";
        o.var2[o.var1[11]] = o.var7("TNjCO/UmkLM=", "djvWl");
        o.var2[o.var1[15]] = "\\s*\\(.*?\\)";
        o.var2[o.var1[14]] = o.var7("dKCTrtcTUmA=", "GVwpi");
        o.var2[o.var1[17]] = "\\s*\\(.*?\\)";
        o.var2[o.var1[16]] = o.var7("ogANug5q1Go=", "jPWhC");
        o.var2[o.var1[18]] = "Empty";
        o.var2[o.var1[19]] = "Empty";
        o.var2[o.var1[20]] = "Empty";
        o.var2[o.var1[22]] = "Empty";
        o.var2[o.var1[29]] = "Drink";
        o.var2[o.var1[30]] = "Vial";
        o.var2[o.var1[31]] = "Vial";
        o.var2[o.var1[32]] = "Drop";
        o.var2[o.var1[33]] = "Stamina";
        o.var2[o.var1[34]] = "Stamina";
        o.var2[o.var1[35]] = "Stamina";
    }

    private static boolean var8(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var9(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static boolean var11(int n2) {
        return n2 > 0;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    static {
        o.var19();
        o.var6();
    }

    private static boolean var20(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var27(Object object, Object object2) {
        return object != object2;
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = var1[3];
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = var1[3];
        while (o.var3(var36, var35)) {
            char var37 = var34[var36];
            var31.append((char)(var37 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    private static boolean var38(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        o var39;
        block47: {
            block52: {
                String var40;
                block51: {
                    block50: {
                        String var41;
                        block49: {
                            block48: {
                                if (o.var38(s.e() ? 1 : 0)) {
                                    return var1[3];
                                }
                                int[] nArray = new int[var1[4]];
                                nArray[o.var1[3]] = var1[5];
                                TileObject var42 = TileObjects.getNearest((int[])nArray);
                                if (o.var4(var42) && o.var10(s.h() ? 1 : 0) && o.var8(Players.getLocal().getWorldLocation().distanceTo(var42.getWorldLocation()), var1[4])) {
                                    return var1[3];
                                }
                                if (o.var38(MixologyInfoBox.D)) {
                                    MixologyInfoBox.D = Static.getClient().getVarpValue(var1[6]);
                                }
                                if (o.var38(MixologyInfoBox.E)) {
                                    MixologyInfoBox.E = Static.getClient().getVarpValue(var1[7]);
                                }
                                if (o.var38(MixologyInfoBox.F)) {
                                    MixologyInfoBox.F = Static.getClient().getVarpValue(var1[8]);
                                }
                                if (o.var27((Object)var39.Y.pluginMode(), (Object)d.MINIGAME)) {
                                    return var1[3];
                                }
                                if (o.var9((Object)var39.Y.potionStrategy(), (Object)f.SINGLE_ORDER) && o.var10(s.f() ? 1 : 0)) {
                                    return var1[3];
                                }
                                if (o.var9((Object)var39.Y.potionStrategy(), (Object)f.MULTI_ORDER) && o.var10(s.g() ? 1 : 0)) {
                                    return var1[3];
                                }
                                if (o.var10(var39.Y.useStamina() ? 1 : 0) && o.var38(Inventory.contains(item -> item.getName().contains(var2[var1[35]])) ? 1 : 0)) {
                                    return var1[3];
                                }
                                if ((!o.var20(Vars.getBit((int)var39.I), var1[9]) || !o.var20(Vars.getBit((int)var39.J), var1[9]) || o.var3(Vars.getBit((int)var39.K), var1[9])) && o.var38(s.f() ? 1 : 0)) {
                                    return var1[3];
                                }
                                if (o.var10(SquireMixology.j)) {
                                    return var1[3];
                                }
                                if (o.var10(SquireMixology.k)) {
                                    return var1[3];
                                }
                                if (o.var12(Widgets.get((int)var1[10], (int)var1[11]))) {
                                    SquireMixology.g = var2[var1[3]];
                                    WorldPoint var43 = new WorldPoint(var1[12], var1[13], var1[3]);
                                    Movement.setDestination((WorldPoint)var43);
                                    return var1[3];
                                }
                                String var43 = Widgets.get((int)var1[10], (int)var1[11]).getChild(var1[11]).getText().replaceAll(var2[var1[4]], var2[var1[11]]).trim();
                                var41 = Widgets.get((int)var1[10], (int)var1[11]).getChild(var1[14]).getText().replaceAll(var2[var1[15]], var2[var1[14]]).trim();
                                var40 = Widgets.get((int)var1[10], (int)var1[11]).getChild(var1[16]).getText().replaceAll(var2[var1[17]], var2[var1[16]]).trim();
                                if (o.var9((Object)var39.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
                                    if (o.var10(s.b(var43, var41, var40) ? 1 : 0)) {
                                        return var1[3];
                                    }
                                    if (!o.var38(SquireMixology.m.equalsIgnoreCase(var2[var1[18]]) ? 1 : 0) || !o.var38(SquireMixology.n.equalsIgnoreCase(var2[var1[19]]) ? 1 : 0) || o.var10(SquireMixology.o.equalsIgnoreCase(var2[var1[20]]) ? 1 : 0)) {
                                        SquireMixology.m = var43;
                                        SquireMixology.y.set(var1[3], var43);
                                        0;
                                        SquireMixology.n = var41;
                                        SquireMixology.y.set(var1[4], var41);
                                        0;
                                        SquireMixology.o = var40;
                                        SquireMixology.y.set(var1[11], var40);
                                        0;
                                    }
                                    if (!o.var21(SquireMixology.r, var1[21]) || !o.var21(SquireMixology.s, var1[21]) || o.var5(SquireMixology.t, var1[21])) {
                                        SquireMixology.r = Widgets.get((int)var1[10], (int)var1[11]).getChild(var1[4]).getSpriteId();
                                        SquireMixology.z.set(var1[3], SquireMixology.r);
                                        0;
                                        SquireMixology.s = Widgets.get((int)var1[10], (int)var1[11]).getChild(var1[15]).getSpriteId();
                                        SquireMixology.z.set(var1[4], SquireMixology.s);
                                        0;
                                        SquireMixology.t = Widgets.get((int)var1[10], (int)var1[11]).getChild(var1[17]).getSpriteId();
                                        SquireMixology.z.set(var1[11], SquireMixology.t);
                                        0;
                                    }
                                }
                                if (o.var27((Object)var39.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
                                    t var44;
                                    if (o.var10(SquireMixology.m.equalsIgnoreCase(var2[var1[22]]) ? 1 : 0) && o.var9((Object)var39.Y.potionStrategy(), (Object)f.SINGLE_ORDER) && o.var4((Object)(var44 = s.a(var43, var41, var40)))) {
                                        SquireMixology.m = var44.a();
                                    }
                                    if (o.var5(SquireMixology.r, var1[21]) && o.var4(SquireMixology.m)) {
                                        SquireMixology.r = s.b(SquireMixology.m);
                                    }
                                }
                                if (!o.var4(SquireMixology.m) || o.var5(SquireMixology.r, var1[21])) {
                                    return var1[3];
                                }
                                if (o.var11(Vars.getBit((int)var1[23]))) {
                                    return var1[3];
                                }
                                if (o.var11(Vars.getBit((int)var1[24]))) {
                                    return var1[3];
                                }
                                if (o.var11(Vars.getBit((int)var1[25]))) {
                                    return var1[3];
                                }
                                if (o.var11(Vars.getBit((int)var1[26]))) {
                                    return var1[3];
                                }
                                if (!o.var38(Players.getLocal().isAnimating() ? 1 : 0) || o.var38(Players.getLocal().isIdle() ? 1 : 0)) {
                                    return var1[3];
                                }
                                if (o.var20(Movement.getRunEnergy(), var1[27]) && o.var38(Movement.isRunEnabled() ? 1 : 0)) {
                                    Movement.toggleRun();
                                    return var1[3];
                                }
                                if (o.var10(var39.Y.useStamina() ? 1 : 0) && o.var3(Movement.getRunEnergy(), var1[28]) && o.var10(Inventory.contains(item -> item.getName().contains(var2[var1[34]])) ? 1 : 0) && o.var38(Movement.isStaminaBoosted() ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(var2[var1[33]])).interact(var2[var1[29]]);
                                }
                                if (o.var10(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] stringArray = new String[var1[4]];
                                stringArray[o.var1[3]] = var2[var1[30]];
                                if (o.var10(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    String[] stringArray2 = new String[var1[4]];
                                    stringArray2[o.var1[3]] = var2[var1[31]];
                                    Inventory.getFirst((String[])stringArray2).interact(var2[var1[32]]);
                                }
                                if (!o.var9((Object)var39.Y.potionStrategy(), (Object)f.MULTI_ORDER)) break block47;
                                if (o.var5(SquireMixology.u, var1[4]) && o.var5(SquireMixology.v, var1[4]) && o.var5(SquireMixology.w, var1[4])) {
                                    if (o.var10(var43.equalsIgnoreCase(var41) ? 1 : 0)) {
                                        SquireMixology.u += var1[4];
                                    }
                                    if (o.var10(var43.equalsIgnoreCase(var40) ? 1 : 0)) {
                                        SquireMixology.u += var1[4];
                                    }
                                    if (o.var10(var41.equalsIgnoreCase(var40) ? 1 : 0)) {
                                        SquireMixology.v += var1[4];
                                    }
                                    if (o.var10(var41.equalsIgnoreCase(var43) ? 1 : 0)) {
                                        SquireMixology.v += var1[4];
                                    }
                                    if (o.var10(var40.equalsIgnoreCase(var43) ? 1 : 0)) {
                                        SquireMixology.w += var1[4];
                                    }
                                    if (o.var10(var40.equalsIgnoreCase(var41) ? 1 : 0)) {
                                        SquireMixology.w += var1[4];
                                    }
                                }
                                System.out.println("POTION 1: " + SquireMixology.m + " Count: " + SquireMixology.u);
                                System.out.println("POTION 2: " + SquireMixology.n + " Count: " + SquireMixology.v);
                                System.out.println("POTION 3: " + SquireMixology.o + " Count: " + SquireMixology.w);
                                int[] nArray2 = new int[var1[4]];
                                nArray2[o.var1[3]] = s.e(var43);
                                if (!o.var10(Inventory.contains((int[])nArray2) ? 1 : 0)) break block48;
                                int[] nArray3 = new int[var1[4]];
                                nArray3[o.var1[3]] = s.e(var43);
                                if (!o.var10(Inventory.contains((int[])nArray3) ? 1 : 0)) break block49;
                                int[] nArray4 = new int[var1[4]];
                                nArray4[o.var1[3]] = s.e(var43);
                                if (!o.var21(Inventory.getCount((int[])nArray4), SquireMixology.u)) break block49;
                            }
                            SquireMixology.p = SquireMixology.m;
                            s.c(SquireMixology.m);
                            0;
                            SquireMixology.A = var1[3];
                            return var1[3];
                        }
                        int[] nArray = new int[var1[4]];
                        nArray[o.var1[3]] = s.e(var41);
                        if (!o.var10(Inventory.contains((int[])nArray) ? 1 : 0)) break block50;
                        int[] nArray5 = new int[var1[4]];
                        nArray5[o.var1[3]] = s.e(var41);
                        if (!o.var10(Inventory.contains((int[])nArray5) ? 1 : 0)) break block51;
                        int[] nArray6 = new int[var1[4]];
                        nArray6[o.var1[3]] = s.e(var41);
                        if (!o.var21(Inventory.getCount((int[])nArray6), SquireMixology.v)) break block51;
                    }
                    SquireMixology.p = SquireMixology.n;
                    s.c(SquireMixology.n);
                    0;
                    SquireMixology.A = var1[3];
                    return var1[3];
                }
                int[] nArray = new int[var1[4]];
                nArray[o.var1[3]] = s.e(var40);
                if (!o.var10(Inventory.contains((int[])nArray) ? 1 : 0)) break block52;
                int[] nArray7 = new int[var1[4]];
                nArray7[o.var1[3]] = s.e(var40);
                if (!o.var10(Inventory.contains((int[])nArray7) ? 1 : 0)) break block47;
                int[] nArray8 = new int[var1[4]];
                nArray8[o.var1[3]] = s.e(var40);
                if (!o.var21(Inventory.getCount((int[])nArray8), SquireMixology.w)) break block47;
            }
            SquireMixology.p = SquireMixology.o;
            s.c(SquireMixology.o);
            0;
            SquireMixology.A = var1[3];
            return var1[3];
        }
        if (o.var27((Object)var39.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
            s.c(SquireMixology.m);
            0;
        }
        return var1[3];
    }

    private static void var19() {
        var1 = new int[37];
        o.var1[0] = 0xFFFFFEFF & 0x2DA7;
        o.var1[1] = 0xFFFFEFFA & 0x3CAD;
        o.var1[2] = 0xFFFFBCB9 & 0x6FEF;
        o.var1[3] = (0x94 ^ 0x9A ^ (0x85 ^ 0xA9)) & (0xA2 ^ 0xAC ^ (0x39 ^ 0x15) ^ -1);
        o.var1[4] = 1;
        o.var1[5] = 0xFFFFFE8F & 0xD7F5;
        o.var1[6] = 0xFFFF93BE & 0x7D7F;
        o.var1[7] = 0xFFFFB5FF & 0x5B3F;
        o.var1[8] = -(0xFFFF9ABF & 0x67EC) & (0xFFFFF7FF & 0x1BEB);
        o.var1[9] = 1 ^ 0x65;
        o.var1[10] = 0xFFFF8773 & 0x7BFE;
        o.var1[11] = 2;
        o.var1[12] = -(0xFFFFEE27 & 0x33DD) & (0xFFFFF7F7 & 0x2F7E);
        o.var1[13] = -(20 + 49 - 25 + 103) & (0xFFFFBCFE & 0x67FF);
        o.var1[14] = 0xA6 ^ 0xA2;
        o.var1[15] = 3;
        o.var1[16] = 1 ^ 0xD ^ (0xA3 ^ 0xA9);
        o.var1[17] = 0x72 ^ 0x77;
        o.var1[18] = 84 + 99 - 163 + 154 ^ 136 + 134 - 144 + 43;
        o.var1[19] = 95 + 72 - 74 + 58 ^ 125 + 17 - 6 + 23;
        o.var1[20] = 0x82 ^ 0x8B;
        o.var1[21] = -1;
        o.var1[22] = 0x75 ^ 0x4A ^ (0x1B ^ 0x2E);
        o.var1[23] = 0xFFFFFC7F & 0x2FCB;
        o.var1[24] = -(0xFFFFD2EB & 0x2F15) & (0xFFFFBFBF & 0x6E7F);
        o.var1[25] = 0xFFFFFD6A & 0x2ED5;
        o.var1[26] = 0xFFFFEEDD & 0x3D63;
        o.var1[27] = 47 + 75 - 28 + 35 ^ 136 + 48 - 133 + 98;
        o.var1[28] = 0xE8 ^ 0xA9;
        o.var1[29] = 9 ^ 2;
        o.var1[30] = 0x84 ^ 0x88;
        o.var1[31] = 0xCC ^ 0xC1;
        o.var1[32] = 0x83 ^ 0x8D;
        o.var1[33] = 0xB0 ^ 0xBF;
        o.var1[34] = 0xA1 ^ 0x9E ^ (0xB5 ^ 0x9A);
        o.var1[35] = 1 ^ 0x18 ^ (0x50 ^ 0x58);
        o.var1[36] = 0xC0 ^ 0x8F ^ (0x44 ^ 0x19);
    }
}

