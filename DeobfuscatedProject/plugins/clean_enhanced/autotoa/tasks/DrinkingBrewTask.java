/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Drinking brew", priority=100)
public class DrinkingBrewTask
extends AutotoaManager {
    private final  SquireAutoTOA cH;
    
    private final  C cG;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        int llllllllllllllllIIlIllIlIIIlIIIl2;
        int n2;
        ae var6;
        if (ae.var7(this.cH.e() ? 1 : 0)) {
            return var1[0];
        }
        Item var8 = Inventory.getFirst(item -> {
            int n2;
            if (!ae.var5(e.NECTAR.d(item.getId()) ? 1 : 0) || ae.var7(item.getName().contains(var2[var1[1]]) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (2 != 2) {
                    return ((0x5D ^ 0x19) & ~(0x77 ^ 0x33)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (ae.var4(var8)) {
            return var1[0];
        }
        if (ae.var5(var6.aq() ? 1 : 0)) {
            int[] nArray = new int[var1[1]];
            nArray[ae.var1[0]] = var1[2];
            Item llllllllllllllllIIlIllIlIIIlIIIl2 = Inventory.getFirst((int[])nArray);
            if (ae.var3(llllllllllllllllIIlIllIlIIIlIIIl2) && ae.var9(Combat.getSpecEnergy(), var1[3]) && ae.var9(Combat.getCurrentHealth(), var1[4])) {
                return var1[0];
            }
        }
        if (ae.var7(var6.bf() ? 1 : 0) && !ae.var10(Combat.getCurrentHealth(), var1[5]) || ae.var7(var6.cG.ap() ? 1 : 0)) {
            n2 = var1[1];
            0;
            
        } else {
            n2 = llllllllllllllllIIlIllIlIIIlIIIl2 = var1[0];
        }
        if (!ae.var7(var6.cG.am() ? 1 : 0) || ae.var5(llllllllllllllllIIlIllIlIIIlIIIl2)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        this.cG.ao();
        return var1[1];
    }

    private static void var11() {
        var2 = new String[var1[6]];
        ae.var2[ae.var1[0]] = "Drink";
        ae.var2[ae.var1[1]] = "brew";
    }

    private static void var12() {
        var1 = new int[8];
        ae.var1[0] = (3 + 74 - -110 + 19 ^ 16 + 107 - 108 + 120) & (150 + 49 - 12 + 10 ^ 1 + 39 - 1 + 101 ^ -1);
        ae.var1[1] = 1;
        ae.var1[2] = -(0xFFFF8DFD & 0x7743) & (0xFFFFFFDF & 0x6FFB);
        ae.var1[3] = 0x79 ^ 0x71 ^ (0x55 ^ 0x1B);
        ae.var1[4] = 0x44 ^ 0x6C;
        ae.var1[5] = 0x93 ^ 0xC3;
        ae.var1[6] = 2;
        ae.var1[7] = 0x61 ^ 0x41 ^ (0x89 ^ 0xA1);
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (ae.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (((0xDC ^ 0x81) & ~(0x70 ^ 0x2D)) == ((0x37 ^ 0x31) & ~(0x62 ^ 0x64))) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var10(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    static {
        ae.var12();
        ae.var11();
    }

    @Inject
    protected DrinkingBrewTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cG = c2;
        this.cH = squireAutoTOA;
    }
}

