/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import gg.squire.mixology.tasks.GameEnum2;
import gg.squire.mixology.tasks.GameEnum6;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="Make paste task")
public class MakePasteTask
extends Task {
    private final  SquireMixologyConfig W;

    static {
        m.var3();
        m.var4();
    }

    private static void var4() {
        var2 = new String[var1[20]];
        m.var2[m.var1[0]] = "Aga";
        m.var2[m.var1[2]] = "Aga paste";
        m.var2[m.var1[3]] = "Aga paste";
        m.var2[m.var1[4]] = "Lye";
        m.var2[m.var1[5]] = "Lye paste";
        m.var2[m.var1[6]] = "Lye paste";
        m.var2[m.var1[7]] = "Mox";
        m.var2[m.var1[8]] = "Mox paste";
        m.var2[m.var1[9]] = "Mox paste";
        m.var2[m.var1[10]] = "Opening bank";
        m.var2[m.var1[11]] = "Bank Chest";
        m.var2[m.var1[12]] = "Use";
        m.var2[m.var1[13]] = "Mox paste";
        m.var2[m.var1[14]] = "Lye paste";
        m.var2[m.var1[15]] = "Aga paste";
        m.var2[m.var1[16]] = "Out of herbs";
        m.var2[m.var1[17]] = "Refining";
        m.var2[m.var1[18]] = "Refiner";
        m.var2[m.var1[19]] = "Operate";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    public MakePasteTask(SquireMixologyConfig squireMixologyConfig) {
        this.W = squireMixologyConfig;
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(int n2) {
        void var11;
        int[] nArray = new int[var1[2]];
        nArray[m.var1[0]] = n2;
        if (m.var12(Inventory.contains((int[])nArray) ? 1 : 0)) {
            if (m.var12(Bank.isOpen() ? 1 : 0)) {
                SquireMixology.g = var2[var1[10]];
                String[] stringArray = new String[var1[2]];
                stringArray[m.var1[0]] = var2[var1[11]];
                TileObjects.getNearest((String[])stringArray).interact(var2[var1[12]]);
                return var1[0];
            }
            if (m.var13(Bank.isOpen() ? 1 : 0)) {
                SquireMixology.g = "Withdrawing " + (int)var11;
                String[] stringArray = new String[var1[4]];
                stringArray[m.var1[0]] = var2[var1[13]];
                stringArray[m.var1[2]] = var2[var1[14]];
                stringArray[m.var1[3]] = var2[var1[15]];
                Bank.depositAllExcept((String[])stringArray);
                int[] nArray2 = new int[var1[2]];
                nArray2[m.var1[0]] = var11;
                if (m.var12(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    SquireMixology.j = var1[0];
                    return var1[0];
                }
                int[] nArray3 = new int[var1[2]];
                nArray3[m.var1[0]] = var11;
                if (m.var13(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdrawAll((int)var11, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                }
                int[] nArray4 = new int[var1[2]];
                nArray4[m.var1[0]] = var11;
                if (m.var12(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    SquireMixology.g = var2[var1[16]];
                    System.out.println("Out of " + (int)var11);
                    return var1[0];
                }
                Bank.withdrawAll((int)var11, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return var1[0];
            }
        }
        int[] nArray5 = new int[var1[2]];
        nArray5[m.var1[0]] = var11;
        if (m.var13(Inventory.contains((int[])nArray5) ? 1 : 0)) {
            SquireMixology.g = var2[var1[17]];
            String[] stringArray = new String[var1[2]];
            stringArray[m.var1[0]] = var2[var1[18]];
            TileObjects.getNearest((String[])stringArray).interact(var2[var1[19]]);
            return var1[0];
        }
        return var1[2];
    }

    /*
     * WARNING - void declaration
     */
    public boolean d() {
        void var14;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var15 = var1[0];
        while (m.var16(var15, (int)var14)) {
            void var17;
            void var18 = var17[var15];
            String[] stringArray = new String[var1[2]];
            stringArray[m.var1[0]] = var18.a();
            if (m.var13(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                System.out.println("Found herb in inventory: " + var18.a());
                return var1[2];
            }
            ++var15;
            0;
            
            return ((163 + 53 - 57 + 55 ^ 34 + 53 - -23 + 31) & (154 + 52 - 18 + 29 ^ 79 + 34 - 82 + 99 ^ -1)) != 0;
        }
        return var1[0];
    }

    private static boolean var19(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var20(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var21(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static void var3() {
        var1 = new int[21];
        m.var1[0] = (0x47 ^ 0x42) & ~(0x28 ^ 0x2D);
        m.var1[1] = -(0xFFFFF1ED & 0x5F37) & (0xFFFFFDEE & 0x7F7D);
        m.var1[2] = 1;
        m.var1[3] = 2;
        m.var1[4] = 3;
        m.var1[5] = 0xA0 ^ 0xA4;
        m.var1[6] = 0x3D ^ 0x1A ^ (0x2A ^ 8);
        m.var1[7] = 0x63 ^ 0x65;
        m.var1[8] = 0x1D ^ 0x1A;
        m.var1[9] = 0xB9 ^ 0xB1;
        m.var1[10] = 0x41 ^ 0x48;
        m.var1[11] = 112 + 66 - 68 + 57 ^ 32 + 55 - 66 + 152;
        m.var1[12] = 0x26 ^ 4 ^ (0x2C ^ 5);
        m.var1[13] = 0x7B ^ 0x77;
        m.var1[14] = 102 + 125 - 156 + 76 ^ 55 + 104 - 3 + 2;
        m.var1[15] = 0x4D ^ 0x43;
        m.var1[16] = 0x39 ^ 0x24 ^ (0xF ^ 0x1D);
        m.var1[17] = 0xD0 ^ 0xC0;
        m.var1[18] = 0x49 ^ 0x58;
        m.var1[19] = 0x3E ^ 0x2C;
        m.var1[20] = 0x4C ^ 0x5F;
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        m var28;
        if (m.var12(s.e() ? 1 : 0)) {
            return var1[0];
        }
        if (m.var16(Vars.getBit((int)var1[1]), var1[2])) {
            return var1[0];
        }
        if (m.var20((Object)var28.W.pluginMode(), (Object)d.CREATE_PASTE) && m.var12(SquireMixology.j)) {
            return var1[0];
        }
        if (m.var21((Object)var28.W.pluginMode(), (Object)d.CREATE_PASTE) && m.var12(var28.d(var28.W.herbPaste().b()) ? 1 : 0)) {
            return var1[0];
        }
        if (m.var21((Object)var28.W.pluginMode(), (Object)d.MINIGAME) && m.var13(SquireMixology.j)) {
            if (m.var13(SquireMixology.q.equalsIgnoreCase(var2[var1[0]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[2]];
                stringArray[m.var1[0]] = var2[var1[2]];
                if (m.var13(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[var1[2]];
                    stringArray2[m.var1[0]] = var2[var1[3]];
                    if (m.var19(Inventory.getFirst((String[])stringArray2).getQuantity(), var28.W.stopAt3000()) && m.var12(var28.d() ? 1 : 0)) {
                        SquireMixology.j = var1[0];
                        return var1[0];
                    }
                }
                if (m.var12(var28.d(var28.W.agaHerb().b()) ? 1 : 0)) {
                    return var1[0];
                }
            }
            if (m.var13(SquireMixology.q.equalsIgnoreCase(var2[var1[4]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[2]];
                stringArray[m.var1[0]] = var2[var1[5]];
                if (m.var13(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[var1[2]];
                    stringArray3[m.var1[0]] = var2[var1[6]];
                    if (m.var19(Inventory.getFirst((String[])stringArray3).getQuantity(), var28.W.stopAt3000()) && m.var12(var28.d() ? 1 : 0)) {
                        SquireMixology.j = var1[0];
                        return var1[0];
                    }
                }
                if (m.var12(var28.d(var28.W.lyeHerb().b()) ? 1 : 0)) {
                    return var1[0];
                }
            }
            if (m.var13(SquireMixology.q.equalsIgnoreCase(var2[var1[7]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[2]];
                stringArray[m.var1[0]] = var2[var1[8]];
                if (m.var13(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray4 = new String[var1[2]];
                    stringArray4[m.var1[0]] = var2[var1[9]];
                    if (m.var19(Inventory.getFirst((String[])stringArray4).getQuantity(), var28.W.stopAt3000()) && m.var12(var28.d() ? 1 : 0)) {
                        SquireMixology.j = var1[0];
                        return var1[0];
                    }
                }
                if (m.var12(var28.d(var28.W.moxHerb().b()) ? 1 : 0)) {
                    return var1[0];
                }
            }
        }
        return var1[0];
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = var1[0];
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = var1[0];
        while (m.var16(var37, var36)) {
            char var38 = var35[var37];
            var32.append((char)(var38 ^ var33[var34 % var33.length]));
            0;
            ++var34;
            ++var37;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var32);
    }
}

