/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    private final  c U;
    private final  SquireShamansPlugin T;
    public static final  int S;
    private final  SquireShamanConfig V;
    private static final  Logger R;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[1];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[1];
        while (k.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0xBA ^ 0xBF) > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public BankingTask(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig) {
        this.T = squireShamansPlugin;
        this.U = c2;
        this.V = squireShamanConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        k var14;
        String[] stringArray = new String[var1[0]];
        stringArray[k.var1[1]] = var2[var1[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (!k.var15(nPC) || k.var16(this.U.s() ? 1 : 0)) {
            return var1[1];
        }
        InventorySetup var17 = var14.U.r();
        if (k.var16(var17.matchesInventory() ? 1 : 0)) {
            return var1[1];
        }
        int[] nArray = new int[var1[0]];
        nArray[k.var1[1]] = var1[2];
        TileObject var18 = TileObjects.getNearest((int[])nArray);
        if (!k.var19(var18) || k.var20(var18.distanceTo((Locatable)Players.getLocal()), var1[3])) {
            return var1[1];
        }
        if (k.var21(Movement.shouldWalk() ? 1 : 0)) {
            return var1[1];
        }
        Item var22 = Inventory.getFirst(item -> {
            int n2;
            if (!k.var23(item.getId(), this.V.weapon()) || k.var24(item.getId(), this.T.d())) {
                n2 = var1[0];
                0;
                if null != null {
                    return ((0x39 ^ 0x1B) & ~(0x2C ^ 0xE)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        });
        if (k.var19(var22)) {
            int[] nArray2 = new int[var1[0]];
            nArray2[k.var1[1]] = var22.getId();
            if (k.var21(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                var22.interact(var2[var1[0]]);
                return var1[0];
            }
        }
        if (k.var21(Bank.isOpen() ? 1 : 0)) {
            var18.interact(var2[var1[4]]);
            return var1[0];
        }
        var2_2.withdraw();
        0;
        this.sleep(var1[4]);
        return var1[0];
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var19(Object object) {
        return object != null;
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    static {
        k.var31();
        k.var32();
        S = var1[2];
        R = LoggerFactory.getLogger(BankingTask.class);
    }

    private static boolean var23(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    private static boolean var24(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    private static void var31() {
        var1 = new int[7];
        k.var1[0] = 1;
        k.var1[1] = (0xC5 ^ 0x8E ^ (0x26 ^ 0x68)) & (82 + 108 - 168 + 126 ^ 138 + 70 - 183 + 120 ^ -1);
        k.var1[2] = -(0xFFFFD9A9 & 0x377F) & (0xFFFFFD7F & 0x7BFF);
        k.var1[3] = 0x16 ^ 0x1C;
        k.var1[4] = 2;
        k.var1[5] = 3;
        k.var1[6] = 0x5F ^ 0x57;
    }

    private static boolean var20(int n2, int n3) {
        return n2 > n3;
    }

    private static void var32() {
        var2 = new String[var1[5]];
        k.var2[k.var1[1]] = "Lizardman Shaman";
        k.var2[k.var1[0]] = "Wield";
        k.var2[k.var1[4]] = "Use";
    }
}

