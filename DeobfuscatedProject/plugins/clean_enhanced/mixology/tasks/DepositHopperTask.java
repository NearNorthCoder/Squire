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
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.mixology.tasks.GameEnum6;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="Deposit hopper")
public class DepositHopperTask
extends Task {
    private  int O;
    private  int J;

    private final  SquireMixologyConfig M;
    private  int N;
    private  int P;
    private  int K;
    private  int I;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        i.var9();
        i.var10();
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[6];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[6];
        while (i.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0x20 ^ 0x4C ^ (0x51 ^ 0x39)) >= 1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    private static void var10() {
        var2 = new String[var1[41]];
        i.var2[i.var1[6]] = "Bank Chest";
        i.var2[i.var1[9]] = "Mox paste";
        i.var2[i.var1[11]] = "Bank Chest";
        i.var2[i.var1[12]] = "Opening bank";
        i.var2[i.var1[13]] = "Use";
        i.var2[i.var1[10]] = "Walk closer to bank";
        i.var2[i.var1[16]] = "Mox paste";
        i.var2[i.var1[17]] = "Mox";
        i.var2[i.var1[18]] = "Refilling mox paste";
        i.var2[i.var1[19]] = "Hopper";
        i.var2[i.var1[20]] = "Deposit";
        i.var2[i.var1[21]] = "Empty";
        i.var2[i.var1[23]] = "Bank Chest";
        i.var2[i.var1[24]] = "Opening bank";
        i.var2[i.var1[25]] = "Use";
        i.var2[i.var1[26]] = "Walk closer to bank";
        i.var2[i.var1[27]] = "Aga";
        i.var2[i.var1[28]] = "Refilling Aga paste";
        i.var2[i.var1[29]] = "Hopper";
        i.var2[i.var1[30]] = "Deposit";
        i.var2[i.var1[31]] = "Empty";
        i.var2[i.var1[32]] = "Bank Chest";
        i.var2[i.var1[33]] = "Opening bank";
        i.var2[i.var1[34]] = "Use";
        i.var2[i.var1[35]] = "Walk closer to bank";
        i.var2[i.var1[36]] = "Lye";
        i.var2[i.var1[37]] = "Refilling Lye paste";
        i.var2[i.var1[38]] = "Hopper";
        i.var2[i.var1[39]] = "Deposit";
        i.var2[i.var1[40]] = "Empty";
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    @Inject
    public DepositHopperTask(SquireMixologyConfig squireMixologyConfig) {
        this.I = var1[0];
        this.J = var1[1];
        this.K = var1[2];
        this.N = var1[3];
        this.O = var1[4];
        this.P = var1[5];
        this.M = squireMixologyConfig;
    }

    private static boolean var30(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var31(Object object) {
        return object != null;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var32(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        TileObject var33;
        i var34;
        block38: {
            block40: {
                block39: {
                    if (i.var23(s.e() ? 1 : 0)) {
                        return var1[6];
                    }
                    if (i.var32((Object)var34.M.pluginMode(), (Object)d.MINIGAME)) {
                        return var1[6];
                    }
                    if (i.var35(Vars.getBit((int)var1[7]))) {
                        return var1[6];
                    }
                    if (i.var36(Vars.getBit((int)var34.I), var1[8]) && i.var36(Vars.getBit((int)var34.J), var1[8]) && i.var36(Vars.getBit((int)var34.K), var1[8]) && i.var23(Players.getLocal().isAnimating() ? 1 : 0) && i.var23(s.f() ? 1 : 0) && i.var23(s.DepositHopperTask() ? 1 : 0)) {
                        return var1[6];
                    }
                    if (i.var36(Vars.getBit((int)var34.I), var1[8]) && i.var36(Vars.getBit((int)var34.J), var1[8]) && !i.var21(Vars.getBit((int)var34.K), var1[8])) break block38;
                    if (!i.var37(Players.getLocal().isAnimating() ? 1 : 0)) break block39;
                    String[] stringArray = new String[var1[9]];
                    stringArray[i.var1[6]] = var2[var1[6]];
                    if (!i.var30(TileObjects.getNearest((String[])stringArray).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var1[10])) break block40;
                }
                if (i.var23(s.f() ? 1 : 0) && !i.var37(s.DepositHopperTask() ? 1 : 0)) break block38;
            }
            return var1[6];
        }
        if (i.var37(SquireMixology.j)) {
            return var1[6];
        }
        if (i.var21(Vars.getBit((int)var34.I), var1[8])) {
            String[] stringArray = new String[var1[9]];
            stringArray[i.var1[6]] = var2[var1[9]];
            if (i.var23(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (i.var23(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray2 = new String[var1[9]];
                    stringArray2[i.var1[6]] = var2[var1[11]];
                    var33 = TileObjects.getNearest((String[])stringArray2);
                    if (i.var31(var33)) {
                        SquireMixology.g = var2[var1[12]];
                        var33.interact(var2[var1[13]]);
                        return var1[6];
                    }
                    if (i.var11(var33)) {
                        SquireMixology.g = var2[var1[10]];
                        WorldPoint var38 = new WorldPoint(var1[14], var1[15], var1[6]);
                        Movement.setDestination((WorldPoint)var38);
                        return var1[6];
                    }
                }
                if (i.var37(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray = new int[var1[9]];
                    nArray[i.var1[6]] = var34.N;
                    if (i.var23(Bank.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray3 = new String[var1[9]];
                        stringArray3[i.var1[6]] = var2[var1[16]];
                        if (i.var23(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            SquireMixology.j = var1[9];
                            SquireMixology.q = var2[var1[17]];
                            return var1[6];
                        }
                    }
                    int[] nArray2 = new int[var1[9]];
                    nArray2[i.var1[6]] = var34.N;
                    if (i.var37(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdrawAll((int)var34.N, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return var1[6];
                    }
                }
            }
            int[] nArray = new int[var1[9]];
            nArray[i.var1[6]] = var34.N;
            if (i.var37(Inventory.contains((int[])nArray) ? 1 : 0)) {
                SquireMixology.g = var2[var1[18]];
                String[] stringArray4 = new String[var1[9]];
                stringArray4[i.var1[6]] = var2[var1[19]];
                TileObjects.getNearest((String[])stringArray4).interact(var2[var1[20]]);
                SquireMixology.m = var2[var1[21]];
                SquireMixology.r = var1[22];
                SquireMixology.A = var1[6];
                SquireMixology.k = var1[6];
                return var1[6];
            }
        }
        if (i.var21(Vars.getBit((int)var34.J), var1[8])) {
            int[] nArray = new int[var1[9]];
            nArray[i.var1[6]] = var34.P;
            if (i.var23(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (i.var23(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[var1[9]];
                    stringArray[i.var1[6]] = var2[var1[23]];
                    var33 = TileObjects.getNearest((String[])stringArray);
                    if (i.var31(var33)) {
                        SquireMixology.g = var2[var1[24]];
                        var33.interact(var2[var1[25]]);
                        return var1[6];
                    }
                    if (i.var11(var33)) {
                        SquireMixology.g = var2[var1[26]];
                        WorldPoint var38 = new WorldPoint(var1[14], var1[15], var1[6]);
                        Movement.setDestination((WorldPoint)var38);
                        return var1[6];
                    }
                }
                if (i.var37(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray3 = new int[var1[9]];
                    nArray3[i.var1[6]] = var34.P;
                    if (i.var23(Bank.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[var1[9]];
                        nArray4[i.var1[6]] = var34.P;
                        if (i.var23(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            SquireMixology.j = var1[9];
                            SquireMixology.q = var2[var1[27]];
                            return var1[6];
                        }
                    }
                    int[] nArray5 = new int[var1[9]];
                    nArray5[i.var1[6]] = var34.P;
                    if (i.var37(Bank.contains((int[])nArray5) ? 1 : 0)) {
                        Bank.withdrawAll((int)var34.P, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return var1[6];
                    }
                }
            }
            int[] nArray6 = new int[var1[9]];
            nArray6[i.var1[6]] = var34.P;
            if (i.var37(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                SquireMixology.g = var2[var1[28]];
                String[] stringArray = new String[var1[9]];
                stringArray[i.var1[6]] = var2[var1[29]];
                TileObjects.getNearest((String[])stringArray).interact(var2[var1[30]]);
                SquireMixology.m = var2[var1[31]];
                SquireMixology.r = var1[22];
                SquireMixology.A = var1[6];
                SquireMixology.k = var1[6];
                return var1[6];
            }
        }
        if (i.var21(Vars.getBit((int)var34.K), var1[8])) {
            int[] nArray = new int[var1[9]];
            nArray[i.var1[6]] = var34.O;
            if (i.var23(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (i.var23(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[var1[9]];
                    stringArray[i.var1[6]] = var2[var1[32]];
                    var33 = TileObjects.getNearest((String[])stringArray);
                    if (i.var31(var33)) {
                        SquireMixology.g = var2[var1[33]];
                        var33.interact(var2[var1[34]]);
                        return var1[6];
                    }
                    if (i.var11(var33)) {
                        SquireMixology.g = var2[var1[35]];
                        WorldPoint var38 = new WorldPoint(var1[14], var1[15], var1[6]);
                        Movement.setDestination((WorldPoint)var38);
                        return var1[6];
                    }
                }
                if (i.var37(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray7 = new int[var1[9]];
                    nArray7[i.var1[6]] = var34.O;
                    if (i.var23(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[var1[9]];
                        nArray8[i.var1[6]] = var34.O;
                        if (i.var23(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            SquireMixology.j = var1[9];
                            SquireMixology.q = var2[var1[36]];
                            return var1[6];
                        }
                    }
                    int[] nArray9 = new int[var1[9]];
                    nArray9[i.var1[6]] = var34.O;
                    if (i.var37(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdrawAll((int)var34.O, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return var1[6];
                    }
                }
            }
            int[] nArray10 = new int[var1[9]];
            nArray10[i.var1[6]] = var34.O;
            if (i.var37(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                SquireMixology.g = var2[var1[37]];
                String[] stringArray = new String[var1[9]];
                stringArray[i.var1[6]] = var2[var1[38]];
                TileObjects.getNearest((String[])stringArray).interact(var2[var1[39]]);
                SquireMixology.m = var2[var1[40]];
                SquireMixology.r = var1[22];
                SquireMixology.A = var1[6];
                SquireMixology.k = var1[6];
                return var1[6];
            }
        }
        return var1[6];
    }

    private static boolean var37(int n2) {
        return n2 != 0;
    }

    private static void var9() {
        var1 = new int[42];
        i.var1[0] = -(0xFFFFEA7F & 0x5789) & (0xFFFFFFBF & 0x6EEF);
        i.var1[1] = 0xFFFFEFBD & 0x3CEA;
        i.var1[2] = 0xFFFFECFF & 0x3FA9;
        i.var1[3] = 0xFFFFF5B5 & 0x7F7F;
        i.var1[4] = 0xFFFFF5FB & 0x7F3D;
        i.var1[5] = 0xFFFFF73F & 0x7DF7;
        i.var1[6] = (0xC9 ^ 0xA9) & ~(0xF7 ^ 0x97);
        i.var1[7] = 0xFFFFFC5B & 0x2FEF;
        i.var1[8] = 0x76 ^ 0x12;
        i.var1[9] = 1;
        i.var1[10] = 0xB8 ^ 0xB0 ^ (0xAD ^ 0xA0);
        i.var1[11] = 2;
        i.var1[12] = 3;
        i.var1[13] = 8 ^ 0x4C ^ (5 ^ 0x45);
        i.var1[14] = -(0xFFFFFD4F & 0x5AB9) & (0xFFFFFDFE & 0x5F7F);
        i.var1[15] = -(0xFFFFF1FF & 0x5F8B) & (0xFFFFFFFB & 0x75EF);
        i.var1[16] = 0x7C ^ 0x7A;
        i.var1[17] = 0xE ^ 0x70 ^ (0x6F ^ 0x16);
        i.var1[18] = 0x99 ^ 0x91;
        i.var1[19] = 0xA7 ^ 0xA0 ^ (0x92 ^ 0x9C);
        i.var1[20] = 0x54 ^ 0x5E;
        i.var1[21] = 0xB1 ^ 0xBA;
        i.var1[22] = -1;
        i.var1[23] = 0xB1 ^ 0xC5 ^ (0x53 ^ 0x2B);
        i.var1[24] = 0x76 ^ 0x18 ^ (0x17 ^ 0x74);
        i.var1[25] = 0x22 ^ 0x49 ^ (0 ^ 0x65);
        i.var1[26] = 0x43 ^ 0x4C;
        i.var1[27] = 0xFA ^ 0xAC ^ (0x4B ^ 0xD);
        i.var1[28] = 0x15 ^ 4;
        i.var1[29] = 0x66 ^ 0x26 ^ (0xEE ^ 0xBC);
        i.var1[30] = 0x55 ^ 0x46;
        i.var1[31] = 30 + 149 - 66 + 70 ^ 59 + 97 - 39 + 46;
        i.var1[32] = 0xA9 ^ 0xBC;
        i.var1[33] = 0x9E ^ 0xBD ^ (0x7C ^ 0x49);
        i.var1[34] = 0x2E ^ 0x1F ^ (0x53 ^ 0x75);
        i.var1[35] = 0x64 ^ 0x2C ^ (9 ^ 0x59);
        i.var1[36] = 0x2D ^ 0x34;
        i.var1[37] = 0x9E ^ 0x84;
        i.var1[38] = 0x48 ^ 0x18 ^ (0x59 ^ 0x12);
        i.var1[39] = 0xC8 ^ 0xBD ^ (0xC2 ^ 0xAB);
        i.var1[40] = 0x79 ^ 0x64;
        i.var1[41] = 0x90 ^ 0xB8 ^ (0x58 ^ 0x6E);
    }

    private static boolean var35(int n2) {
        return n2 > 0;
    }

    private static boolean var36(int n2, int n3) {
        return n2 >= n3;
    }
}

