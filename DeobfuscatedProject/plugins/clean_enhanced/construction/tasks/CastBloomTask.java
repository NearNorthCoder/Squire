/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.function.Predicate;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Cast Bloom")
public class CastBloomTask
extends Task {
    private static  int[] lIlIIIll;
    private  int gN;
    private final  SecondariesPlugin gM;
    private static  String[] lIlIIIlI;

    static {
        bP.var1();
        bP.var2();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = lIlIIIll[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = lIlIIIll[0];
        while (bP.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static void var1() {
        lIlIIIll = new int[4];
        bP.lIlIIIll[0] = (105 + 75 - 142 + 106 ^ 87 + 147 - 102 + 54) & (62 + 76 - 29 + 29 ^ 157 + 66 - 126 + 63 ^ -1);
        bP.lIlIIIll[1] = 0x90 ^ 0x8E ^ (0x29 ^ 0x33);
        bP.lIlIIIll[2] = 1;
        bP.lIlIIIll[3] = 2;
    }

    private static boolean var21(Object object) {
        return object != null;
    }

    @Inject
    public CastBloomTask(SecondariesPlugin secondariesPlugin) {
        this.gN = lIlIIIll[0];
        this.gM = secondariesPlugin;
    }

    private static void var2() {
        lIlIIIlI = new String[lIlIIIll[3]];
        bP.lIlIIIlI[bP.lIlIIIll[0]] = "Bloom";
        bP.lIlIIIlI[bP.lIlIIIll[2]] = "Bloom";
    }

    private static boolean var22(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var6_6;
        void var24;
        bP var25;
        WorldPoint worldPoint = this.gM.cT();
        if (bP.var26(worldPoint)) {
            return lIlIIIll[0];
        }
        Player var27 = Players.getLocal();
        if (bP.var26(var27)) {
            return lIlIIIll[0];
        }
        int var28 = Static.getClient().getTickCount();
        if (!bP.var9(Inventory.isFull() ? 1 : 0) || !bP.var23(Prayers.getPoints()) || bP.var22(var28 - var25.gN, lIlIIIll[1])) {
            return lIlIIIll[0];
        }
        if (bP.var9(var24.isInScene(Static.getClient()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var24);
            0;
            return lIlIIIll[2];
        }
        WorldPoint var29 = var27.getWorldLocation();
        if (bP.var9(var29.equals((Object)var24) ? 1 : 0) && bP.var30(var29.getRegionID(), var24.getRegionID())) {
            Movement.walk((WorldPoint)var24);
            return lIlIIIll[2];
        }
        if (bP.var9(var29.equals((Object)var24) ? 1 : 0)) {
            return lIlIIIll[0];
        }
        Predicate<Item> var31 = item -> {
            int n2;
            if (bP.var21(item) && bP.var21(item.getActions()) && bP.var23(Arrays.stream(item.getActions()).anyMatch(string -> {
                int n2;
                if (bP.var21(string) && bP.var23(string.contains(lIlIIIlI[lIlIIIll[2]]) ? 1 : 0)) {
                    n2 = lIlIIIll[2];
                    0;
                    if (1 >= 3) {
                        return ((0xA9 ^ 0xBF) & ~(0x7A ^ 0x6C)) != 0;
                    }
                } else {
                    n2 = lIlIIIll[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = lIlIIIll[2];
                0;
                if (-1 == ((0x4C ^ 0x77) & ~(0x22 ^ 0x19))) {
                    return ((0xAC ^ 0xA2) & ~(0x1B ^ 0x15)) != 0;
                }
            } else {
                n2 = lIlIIIll[0];
            }
            return n2 != 0;
        };
        Item var32 = Inventory.getFirst(var31);
        if (bP.var26(var32) && bP.var9(var31.test(var32 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) ? 1 : 0)) {
            return lIlIIIll[0];
        }
        var6_6.interact(string -> {
            int n2;
            if (bP.var21(string) && bP.var23(string.contains(lIlIIIlI[lIlIIIll[0]]) ? 1 : 0)) {
                n2 = lIlIIIll[2];
                0;
                if null != null {
                    return ((0x63 ^ 0 ^ (0x36 ^ 0x7B)) & (0x21 ^ 3 ^ (0x6C ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIll[0];
            }
            return n2 != 0;
        });
        this.gN = var3_3;
        return lIlIIIll[2];
    }

    private static boolean var30(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var26(Object object) {
        return object == null;
    }
}

