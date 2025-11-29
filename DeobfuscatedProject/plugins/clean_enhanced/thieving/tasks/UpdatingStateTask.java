/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum3;
import gg.squire.thieving.tasks.GameEnum5;

@TaskDesc(name="Updating state", priority=2147482310)
public class UpdatingStateTask
extends ThievingManager {

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static void var4() {
        var1 = new String[var2[10]];
        B.var1[B.var2[0]] = "Open";
        B.var1[B.var2[1]] = "Eat";
        B.var1[B.var2[2]] = "Drink";
        B.var1[B.var2[4]] = "Eat";
        B.var1[B.var2[5]] = "Drink";
        B.var1[B.var2[6]] = "Eat";
        B.var1[B.var2[7]] = "Drink";
        B.var1[B.var2[8]] = "gem bag";
        B.var1[B.var2[9]] = "Open";
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (B.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var16(int n2) {
        return n2 > 0;
    }

    private static boolean var17(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static void var24() {
        var2 = new int[11];
        B.var2[0] = (0xAB ^ 0x86 ^ 1) & (0xC ^ 0x67 ^ (0x3F ^ 0x78) ^ -1);
        B.var2[1] = 1;
        B.var2[2] = 2;
        B.var2[3] = 0xFFFFF697 & 0x5BFF;
        B.var2[4] = 3;
        B.var2[5] = 90 + 157 - 221 + 145 ^ 15 + 118 - 39 + 81;
        B.var2[6] = 0x2F ^ 0x25 ^ (0x12 ^ 0x1D);
        B.var2[7] = 0x38 ^ 0x3E;
        B.var2[8] = 0x3E ^ 0x39;
        B.var2[9] = 0x9B ^ 0x93;
        B.var2[10] = 0x82 ^ 0xBC ^ (0x94 ^ 0xA3);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static boolean var31(Object object) {
        return object != null;
    }

    static {
        B.var24();
        B.var4();
    }

    @Inject
    public UpdatingStateTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean var32(int n2) {
        return n2 == 0;
    }

    private static boolean var33(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var34(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean l() {
        int var35;
        int n2;
        int var36;
        int n3;
        B var37;
        if (B.var34(this.p.depositSeedVault() ? 1 : 0)) {
            return var2[0];
        }
        if (B.var32(var37.p.pickpocketFoodAmount())) {
            return var2[0];
        }
        if (B.var34(var37.o.j() ? 1 : 0)) {
            return var2[0];
        }
        Item var38 = Inventory.getFirst(item -> {
            int n2;
            if (B.var34(item.getName().toLowerCase().contains(var1[var2[8]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[B.var2[0]] = var1[var2[9]];
                if (B.var34(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (-1 != 2) return n2 != 0;
                    return ((0x42 ^ 0x5D) & ~(0x3C ^ 0x23)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        if (B.var34(var37.p.gemBag() ? 1 : 0) && B.var31(var38)) {
            var38.interact(var1[var2[0]]);
        }
        if (B.var34(Inventory.contains(item -> {
            int n2;
            block3: {
                block2: {
                    String[] stringArray = new String[var2[1]];
                    stringArray[B.var2[0]] = var1[var2[6]];
                    if (!B.var32(item.hasAction(stringArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[var2[1]];
                    stringArray2[B.var2[0]] = var1[var2[7]];
                    if (!B.var34(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                }
                n2 = var2[1];
                0;
                if null == null return n2 != 0;
                return ((0x72 ^ 0x4D) & ~(0xA4 ^ 0x9B)) != 0;
            }
            n2 = var2[0];
            return n2 != 0;
        }) ? 1 : 0) && B.var16(Combat.getMissingHealth())) {
            n3 = var2[1];
            0;
            if (3 <= ((41 + 3 - -51 + 71 ^ 60 + 74 - 46 + 91) & (101 + 38 - 120 + 148 ^ 72 + 147 - 159 + 118 ^ -1))) {
                return ((0x27 ^ 0x73 ^ (0x36 ^ 0x26)) & (0x43 ^ 0x6D ^ (0xA9 ^ 0xC3) ^ -1)) != 0;
            }
        } else {
            n3 = var36 = var2[0];
        }
        if (!B.var17((Object)var37.p.pickpocketTarget(), (Object)f.VYRE) || B.var3((Object)var37.p.pickpocketTarget(), (Object)f.ELF)) {
            n2 = var2[1];
            0;
            if (((173 + 22 - 24 + 20 ^ 30 + 66 - -29 + 38) & (0x27 ^ 0x55 ^ (0x53 ^ 0x3D) ^ -1)) == (22 + 105 - 102 + 109 ^ 90 + 84 - 61 + 17)) {
                return ((0x3F ^ 0x22 ^ (0x56 ^ 0x5A)) & (0x5D ^ 0x24 ^ (0x55 ^ 0x3D) ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        if (B.var34(var35 = n2) && B.var33(Inventory.getFreeSlots(), var2[2])) {
            if (B.var34(var36)) {
                String[] stringArray = new String[var2[2]];
                stringArray[B.var2[0]] = var1[var2[1]];
                stringArray[B.var2[1]] = var1[var2[2]];
                Inventory.getFirst(item -> {
                    int n2;
                    block3: {
                        block2: {
                            String[] stringArray = new String[var2[1]];
                            stringArray[B.var2[0]] = var1[var2[4]];
                            if (!B.var32(item.hasAction(stringArray) ? 1 : 0)) break block2;
                            String[] stringArray2 = new String[var2[1]];
                            stringArray2[B.var2[0]] = var1[var2[5]];
                            if (!B.var34(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                        }
                        n2 = var2[1];
                        0;
                        if null == null return n2 != 0;
                        return ((0x69 ^ 0x61 ^ (0xFC ^ 0xA3)) & (119 + 175 - 69 + 11 ^ 102 + 161 - 143 + 67 ^ -1)) != 0;
                    }
                    n2 = var2[0];
                    return n2 != 0;
                }).interact(stringArray);
                return var2[1];
            }
            var37.o.b(var2[1]);
            return var2[1];
        }
        if (B.var34(Inventory.isFull() ? 1 : 0)) {
            var37.o.b(var2[1]);
            return var2[1];
        }
        if (B.var17((Object)var37.p.pickpocketFood(), (Object)e.NONE)) {
            int[] nArray = new int[var2[1]];
            nArray[B.var2[0]] = var37.p.pickpocketFood().x();
            if (B.var32(Inventory.contains((int[])nArray) ? 1 : 0) && B.var33(Combat.getCurrentHealth(), var37.p.eatHP())) {
                var37.o.b(var2[1]);
                return var2[1];
            }
        }
        if (B.var34(var37.p.dodgyNecklace() ? 1 : 0)) {
            int[] nArray = new int[var2[1]];
            nArray[B.var2[0]] = var2[3];
            if (B.var32(Inventory.contains((int[])nArray) ? 1 : 0)) {
                var37.o.b(var2[1]);
                return var2[1];
            }
        }
        return var2[0];
    }
}

