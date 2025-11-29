/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="Bank for staminas")
public class BankForStaminasTask
extends Task {
    
    private  int J;
    private  int I;
    private  int K;
    private final  SquireMixologyConfig L;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[3];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[3];
        while (h.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0x90 ^ 0xA4 ^ (0xB0 ^ 0xC2)) & (0x64 ^ 0x55 ^ (3 ^ 0x74) ^ -1)) == ((0xBF ^ 0x9A ^ 3) & (211 + 176 - 248 + 92 ^ 6 + 18 - -22 + 147 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static void var15() {
        var1 = new int[22];
        h.var1[0] = -(0xFFFFEF81 & 0x127F) & (0xFFFFEFEF & 0x3EB7);
        h.var1[1] = -(0xFFFF9BDF & 0x7771) & (0xFFFFFFF9 & 0x3FFE);
        h.var1[2] = 0xFFFFBDB9 & 0x6EEF;
        h.var1[3] = (0x5A ^ 0x40) & ~(0x9B ^ 0x81);
        h.var1[4] = 0x34 ^ 0x22 ^ (0x7C ^ 0xE);
        h.var1[5] = 1;
        h.var1[6] = 2;
        h.var1[7] = 3;
        h.var1[8] = 0xFFFFBFF6 & 0x457F;
        h.var1[9] = 0xFFFFE5EB & 0x3E75;
        h.var1[10] = 0xD ^ 0x22 ^ (0xE ^ 0x25);
        h.var1[11] = 0x6E ^ 0x6B;
        h.var1[12] = 6 ^ 0;
        h.var1[13] = 0x37 ^ 0x30;
        h.var1[14] = 0x51 ^ 0x4B ^ (4 ^ 0x16);
        h.var1[15] = 0x5B ^ 0x52;
        h.var1[16] = -1;
        h.var1[17] = 0x74 ^ 0x7E;
        h.var1[18] = 88 + 67 - -7 + 15 ^ 167 + 88 - 203 + 134;
        h.var1[19] = 0x66 ^ 0x6A;
        h.var1[20] = 99 + 30 - 89 + 103 ^ 59 + 21 - 23 + 73;
        h.var1[21] = 0x2F ^ 0xF ^ (0x31 ^ 0x1F);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        h var18;
        if (h.var16(s.e() ? 1 : 0)) {
            return var1[3];
        }
        if (h.var16(var18.L.useStamina() ? 1 : 0)) {
            return var1[3];
        }
        if (h.var17(Inventory.contains(item -> item.getName().contains(var2[var1[20]])) ? 1 : 0)) {
            return var1[3];
        }
        if (!h.var19(Vars.getBit((int)var18.I), var1[4]) || !h.var19(Vars.getBit((int)var18.J), var1[4]) || h.var12(Vars.getBit((int)var18.K), var1[4])) {
            return var1[3];
        }
        if (h.var17(SquireMixology.j)) {
            return var1[3];
        }
        if (h.var17(SquireMixology.k)) {
            return var1[3];
        }
        if (h.var16(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[var1[5]];
            stringArray[h.var1[3]] = var2[var1[3]];
            TileObject var20 = TileObjects.getNearest((String[])stringArray);
            if (h.var14(var20)) {
                SquireMixology.g = var2[var1[5]];
                var20.interact(var2[var1[6]]);
                return var1[3];
            }
            if (h.var21(var20)) {
                SquireMixology.g = var2[var1[7]];
                WorldPoint var22 = new WorldPoint(var1[8], var1[9], var1[3]);
                Movement.setDestination((WorldPoint)var22);
                return var1[3];
            }
        }
        if (h.var17(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[var1[7]];
            stringArray[h.var1[3]] = var2[var1[10]];
            stringArray[h.var1[5]] = var2[var1[11]];
            stringArray[h.var1[6]] = var2[var1[12]];
            Bank.depositAllExcept((String[])stringArray);
            if (h.var16(Bank.contains(item -> item.getName().contains(var2[var1[19]])) ? 1 : 0)) {
                SquireMixology.g = var2[var1[13]];
                return var1[3];
            }
            if (h.var17(Bank.contains(item -> item.getName().contains(var2[var1[18]])) ? 1 : 0)) {
                SquireMixology.g = var2[var1[14]];
                Bank.withdraw(item -> item.getName().contains(var2[var1[17]]), (int)var1[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                SquireMixology.m = var2[var1[15]];
                SquireMixology.r = var1[16];
                SquireMixology.A = var1[3];
                SquireMixology.k = var1[3];
                return var1[3];
            }
        }
        return var1[3];
    }

    private static boolean var19(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var21(Object object) {
        return object == null;
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static void var35() {
        var2 = new String[var1[21]];
        h.var2[h.var1[3]] = "Bank Chest";
        h.var2[h.var1[5]] = "Opening bank";
        h.var2[h.var1[6]] = "Use";
        h.var2[h.var1[7]] = "Walk closer to bank";
        h.var2[h.var1[10]] = "Mox paste";
        h.var2[h.var1[11]] = "Lye paste";
        h.var2[h.var1[12]] = "Aga paste";
        h.var2[h.var1[13]] = "Out of staminas";
        h.var2[h.var1[14]] = "Withdrawing staminas";
        h.var2[h.var1[15]] = "Empty";
        h.var2[h.var1[17]] = "Stamina";
        h.var2[h.var1[18]] = "Stamina";
        h.var2[h.var1[19]] = "Stamina";
        h.var2[h.var1[20]] = "Stamina";
    }

    @Inject
    public BankForStaminasTask(SquireMixologyConfig squireMixologyConfig) {
        this.I = var1[0];
        this.J = var1[1];
        this.K = var1[2];
        this.L = squireMixologyConfig;
    }

    static {
        h.var15();
        h.var35();
    }
}

