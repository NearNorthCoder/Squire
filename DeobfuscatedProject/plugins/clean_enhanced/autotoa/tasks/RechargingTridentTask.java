/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Recharging trident", priority=1000, blocking=true, register=true)
public class RechargingTridentTask
extends ck {

    private  boolean hZ;

    @Inject
    protected RechargingTridentTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
        this.hZ = var2[0];
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (cl.var4(this.cu.isInInstancedRegion() ? 1 : 0)) {
            this.hZ = var2[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var1_1;
        void var5_5;
        int var5;
        int n2;
        cl var6;
        int n3;
        if (cl.var4(this.hZ)) {
            return var2[0];
        }
        if (cl.var4(Dialog.canContinue() ? 1 : 0)) {
            var6.hZ = var2[1];
        }
        if (cl.var4(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var2[2]);
            return var2[1];
        }
        Item var7 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[7]]));
        if (cl.var8(var7)) {
            return var2[0];
        }
        if (cl.var9(var7.getName().toLowerCase().contains(var1[var2[0]]) ? 1 : 0) && cl.var9(var7.getName().toLowerCase().contains(var1[var2[1]]) ? 1 : 0)) {
            n3 = var2[1];
            0;
            if ((0x60 ^ 0x65) == 0) {
                return ((0x54 ^ 8) & ~(0xC4 ^ 0x98)) != 0;
            }
        } else {
            n3 = var2[0];
        }
        int var10 = n3;
        int var11 = var6.gllllllllllllllllIlIIIIIIIIIIIIll;
        if (cl.var4(var10)) {
            n2 = var2[3];
            0;
            if null != null {
                return ((0xC6 ^ 0x99 ^ (0x6C ^ 0x61)) & (51 + 179 - 114 + 104 ^ 84 + 24 - 70 + 104 ^ -1)) != 0;
            }
        } else {
            n2 = var5 = var2[4];
        }
        if (cl.var12(var11, var2[5])) {
            if (cl.var4(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[var2[1]];
                nArray[cl.var2[0]] = var11;
                if (cl.var9(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var6.hZ = var2[1];
                }
                if (cl.var3(Inventory.getFreeSlots(), var2[6])) {
                    int[] nArray2 = new int[var2[6]];
                    nArray2[cl.var2[0]] = var7.getId();
                    nArray2[cl.var2[1]] = var5;
                    nArray2[cl.var2[7]] = var2[8];
                    nArray2[cl.var2[9]] = var2[10];
                    nArray2[cl.var2[11]] = var2[12];
                    Bank.depositAllExcept((int[])nArray2);
                    return var2[1];
                }
                Bank.withdrawAll((int)var11, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return var2[1];
            }
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[cl.var2[0]] = var5;
        Item var13 = Inventory.getFirst((int[])nArray);
        if (cl.var8(var13)) {
            return var2[0];
        }
        var5_5.useOn((Item)var1_1);
        return var2[1];
    }

    static {
        cl.var14();
        cl.var15();
    }

    private static boolean var12(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var15() {
        var1 = new String[var2[9]];
        cl.var1[cl.var2[0]] = "toxic";
        cl.var1[cl.var2[1]] = "swamp";
        cl.var1[cl.var2[7]] = "trident";
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var2[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var2[0];
        while (cl.var3(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (((0x35 ^ 0x63) & ~(0xF7 ^ 0xA1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean var8(Object object) {
        return object == null;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public int g(boolean bl2) {
        int n2;
        if (cl.var4(bl2)) {
            n2 = var2[3];
            0;
            if (-2 > 0) {
                return (0xE4 ^ 0xC5 ^ (0xEB ^ 0xC3)) & (3 ^ (0x23 ^ 0x29) ^ -1);
            }
        } else {
            n2 = var2[4];
        }
        int var32 = n2;
        int[] nArray = new int[var2[1]];
        nArray[cl.var2[0]] = var32;
        if (cl.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var32;
        }
        int[] nArray2 = new int[var2[1]];
        nArray2[cl.var2[0]] = var2[8];
        if (cl.var9(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return var2[8];
        }
        int[] nArray3 = new int[var2[1]];
        nArray3[cl.var2[0]] = var2[10];
        if (cl.var9(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return var2[10];
        }
        int[] nArray4 = new int[var2[1]];
        nArray4[cl.var2[0]] = var2[12];
        if (cl.var9(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return var2[12];
        }
        return var2[5];
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static void var14() {
        var2 = new int[14];
        cl.var2[0] = (0x19 ^ 0x2E ^ (0xDC ^ 0xC1)) & (40 + 0 - 20 + 158 ^ 103 + 15 - -2 + 32 ^ -1);
        cl.var2[1] = 1;
        cl.var2[2] = -(0xFFFFFFBC & 0x707F) & (0xFFFFFFFF & 0x79FF);
        cl.var2[3] = -(0xFFFFF2F1 & 0x4D1F) & (0xFFFFEBF3 & 0x57FF);
        cl.var2[4] = -(0xFFFFDC2B & 0x67FD) & (0xFFFFF7EF & 0x7EBE);
        cl.var2[5] = -1;
        cl.var2[6] = 0x29 ^ 0x2C;
        cl.var2[7] = 2;
        cl.var2[8] = -(0xFFFFF9F6 & 0x6F5B) & (0xFFFFEF7F & 0x7BFB);
        cl.var2[9] = 3;
        cl.var2[10] = -(0xFFFFFFDF & 0x4CEF) & (0xFFFFDFFF & 0x6EFE);
        cl.var2[11] = 0x41 ^ 0x45;
        cl.var2[12] = 0xFFFFDE7A & 0x23B7;
        cl.var2[13] = 0x51 ^ 0x6A ^ (0x3E ^ 0xD);
    }
}

