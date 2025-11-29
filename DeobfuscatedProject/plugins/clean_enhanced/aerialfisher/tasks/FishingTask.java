/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.aerialfisher.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Fishing", priority=5)
public class FishingTask
extends Task {

    private static final  int k;
    private static final  Predicate<NPC> j;

    private static boolean var3(int n) {
        return n == 0;
    }

    private static void var4() {
        var1 = new String[var2[5]];
        b.var1[b.var2[1]] = "Catch";
        b.var1[b.var2[3]] = "Fishing spot";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var17(Object object) {
        return object != null;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    private static boolean var19(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var20(int n, int n2) {
        return n <= n2;
    }

    private static void var21() {
        var2 = new int[13];
        b.var2[0] = 41 + 148 - 112 + 121 ^ 141 + 123 - 130 + 60;
        b.var2[1] = (0x12 ^ 0x2B) & ~(0xAD ^ 0x94);
        b.var2[2] = -(69 + 47 - 76 + 105) & (0xFFFFDBFA & 0x7DBF);
        b.var2[3] = 1;
        b.var2[4] = 0xFFFFFF6F & 0x59BD;
        b.var2[5] = 2;
        b.var2[6] = -(0xFFFFB2FD & 0x6F8F) & (0xFFFFFBBE & 0x7FFD);
        b.var2[7] = 3;
        b.var2[8] = 0xFFFFFD3F & 0x5BF3;
        b.var2[9] = -(0xFFFFFC6B & 0x13DD) & (0xFFFFDFFB & 0x33FE);
        b.var2[10] = 0xFFFFE6E1 & 0x1F7E;
        b.var2[11] = 0xA1 ^ 0xAE;
        b.var2[12] = 0xA3 ^ 0xAB;
    }

    private static boolean var22(int n) {
        return n != 0;
    }

    public boolean run() {
        NPC var23;
        NPC nPC2;
        int[] nArray = new int[var2[0]];
        nArray[b.var2[1]] = var2[2];
        nArray[b.var2[3]] = var2[4];
        nArray[b.var2[5]] = var2[6];
        nArray[b.var2[7]] = var2[8];
        Item item = Inventory.getFirst((int[])nArray);
        if (b.var17(item)) {
            int[] nArray2 = new int[var2[3]];
            nArray2[b.var2[1]] = var2[9];
            item.useOn(Inventory.getFirst((int[])nArray2));
        }
        int[] nArray3 = new int[var2[3]];
        nArray3[b.var2[1]] = var2[10];
        Projectile var24 = Projectiles.getNearest((int[])nArray3);
        if (b.var17(var24) && b.var3(var24.getTarget().equals((Object)Players.getLocal().getLocalLocation()) ? 1 : 0)) {
            return var2[3];
        }
        NPC var25 = NPCs.getNearest(nPC -> {
            int n;
            if (b.var22(j.test((NPC)nPC) ? 1 : 0) && b.var19(Static.getClient().getHintArrowNpc(), nPC)) {
                n = var2[3];
                0;
                if (3 != 3) {
                    return ((0 ^ 0x38) & ~(0x4F ^ 0x77)) != 0;
                }
            } else {
                n = var2[1];
            }
            return n != 0;
        });
        NPC var26 = NPCs.getNearest(j);
        if (b.var17(var25)) {
            nPC2 = var25;
            0;
            if ((0x4A ^ 0x4E) == 0) {
                return ((0x12 ^ 0x16) & ~(9 ^ 0xD)) != 0;
            }
        } else {
            nPC2 = var26;
        }
        if (b.var17(var23 = nPC2)) {
            var23.interact(var1[var2[1]]);
        }
        return var2[3];
    }

    static {
        b.var21();
        b.var4();
        k = var2[10];
        j = nPC -> {
            int n;
            if (b.var17(nPC.getName()) && b.var22(nPC.getName().equals(var1[var2[3]]) ? 1 : 0) && b.var20(nPC.distanceTo((Locatable)Players.getLocal()), var2[11]) && b.var18(Players.getNearest(player -> {
                int n;
                if (b.var17(player.getInteracting()) && b.var22(player.getInteracting().equals(nPC) ? 1 : 0)) {
                    n = var2[3];
                    0;
                    if ((0x71 ^ 0x75) <= 1) {
                        return ((0xC9 ^ 0x8A) & ~(0x68 ^ 0x2B)) != 0;
                    }
                } else {
                    n = var2[1];
                }
                return n != 0;
            })) && b.var18(Projectiles.getNearest(projectile -> {
                int n;
                if (b.var17(projectile.getTarget()) && b.var22(projectile.getTarget().equals((Object)nPC.getLocalLocation()) ? 1 : 0)) {
                    n = var2[3];
                    0;
                    if (-1 > ((0x14 ^ 1) & ~(0x28 ^ 0x3D))) {
                        return ((0x37 ^ 0x10) & ~(0x7F ^ 0x58)) != 0;
                    }
                } else {
                    n = var2[1];
                }
                return n != 0;
            }))) {
                n = var2[3];
                0;
                if (-2 > 0) {
                    return ((0xBD ^ 0x95) & ~(0x62 ^ 0x4A)) != 0;
                }
            } else {
                n = var2[1];
            }
            return n != 0;
        };
    }
}

