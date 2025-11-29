/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.util.function.Predicate;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum3;

@TaskDesc(name="Healing up", priority=1000)
public class HealingUpTask
extends ThievingManager {
    
    public static final  Predicate<String> av;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (D.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var22(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var23(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public HealingUpTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean var24(int n2) {
        return n2 > 0;
    }

    private static boolean var25(int n2) {
        return n2 == 0;
    }

    static {
        D.var26();
        D.var27();
        av = string -> {
            int n2;
            if (D.var28(string) && (!D.var25(string.equals(var2[var1[6]]) ? 1 : 0) || D.var9(string.equals(var2[var1[7]]) ? 1 : 0))) {
                n2 = var1[1];
                0;
                if (3 < -1) {
                    return ((0x7E ^ 0x4B) & ~(0xA6 ^ 0x93)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        };
    }

    private boolean K() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (D.var28(item.getActions()) && D.var9(item.hasAction(av) ? 1 : 0) && D.var25(item.getName().equals(var2[var1[1]]) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if ((49 + 4 - -42 + 87 ^ 157 + 68 - 150 + 103) <= 2) {
                    return ((0xB3 ^ 0xC1 ^ (0x6A ^ 0x35)) & (0x4B ^ 0x32 ^ (0x5D ^ 9) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (D.var10(item2)) {
            return var1[0];
        }
        item2.interact(av);
        return var1[1];
    }

    private static boolean var29(int n2) {
        return n2 <= 0;
    }

    private static boolean var28(Object object) {
        return object != null;
    }

    private static void var26() {
        var1 = new int[9];
        D.var1[0] = (0x60 ^ 0x4B) & ~(0x9D ^ 0xB6);
        D.var1[1] = 1;
        D.var1[2] = 0xFFFFEEF3 & 0x71DD;
        D.var1[3] = 0x28 ^ 0x2D;
        D.var1[4] = 0x88 ^ 0x8E;
        D.var1[5] = 2;
        D.var1[6] = 3;
        D.var1[7] = 0x9E ^ 0x9A;
        D.var1[8] = 0x12 ^ 0x1A;
    }

    private static boolean var30(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean l() {
        D var31;
        if (D.var9(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        int var32 = Inventory.getCount(item -> {
            int n2;
            if (D.var9(item.hasAction(av) ? 1 : 0) && D.var25(item.getName().equals(var2[var1[5]]) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (3 <= 2) {
                    return ((21 + 4 - -163 + 53 ^ 141 + 112 - 139 + 55) & (0x59 ^ 0x4A ^ (0xFF ^ 0xB4) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (D.var29(var32) && D.var30((Object)var31.p.pickpocketFood(), (Object)e.NONE)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[D.var1[0]] = var1[2];
        int var33 = Inventory.contains((int[])nArray) ? 1 : 0;
        if (D.var9(var33) && D.var22(Combat.getMissingHealth(), var1[3])) {
            int[] nArray2 = new int[var1[1]];
            nArray2[D.var1[0]] = var1[2];
            Inventory.getFirst((int[])nArray2).interact(var2[var1[0]]);
            return var1[1];
        }
        if (D.var9(var31.p.redemptionHeal() ? 1 : 0) && D.var24(Prayers.getPoints())) {
            int var34;
            int n2;
            if (D.var23(Combat.getCurrentHealth(), var1[4])) {
                n2 = var1[1];
                0;
                if (((153 + 75 - 179 + 119 ^ 130 + 112 - 176 + 69) & (0x50 ^ 0x57 ^ (0x25 ^ 0xD) ^ -1)) != 0) {
                    return (((0x3C ^ 0x10) & ~(0x5A ^ 0x76) ^ (0x55 ^ 0x48)) & (0x25 ^ 0x42 ^ (0xDC ^ 0xA6) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            if (D.var9(var34 = n2)) {
                return var31.K();
            }
            return var1[0];
        }
        if (D.var23(Combat.getCurrentHealth(), var31.p.eatHP())) {
            return var31.K();
        }
        return var1[0];
    }

    private static void var27() {
        var2 = new String[var1[3]];
        D.var2[D.var1[0]] = "Eat";
        D.var2[D.var1[1]] = "Blood pint";
        D.var2[D.var1[5]] = "Blood pint";
        D.var2[D.var1[6]] = "Eat";
        D.var2[D.var1[7]] = "Drink";
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }
}

