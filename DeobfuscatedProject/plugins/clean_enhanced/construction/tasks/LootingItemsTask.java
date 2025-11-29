/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import gg.squire.construction.tasks.HHelper;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Looting items", priority=10)
public class LootingItemsTask
extends Task {
    private static  String[] lIlIlIIl;
    private final  SquireCerberus aG;
    private final  a aH;
    private static  int[] lIlIlIlI;

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = lIlIlIlI[0];
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = lIlIlIlI[0];
        while (v.var10(var9, var8)) {
            char var11 = var7[var9];
            var4.append((char)(var11 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    static {
        v.var12();
        v.var13();
    }

    public boolean run() {
        v var14;
        if (v.var15(this.aH.f() ? 1 : 0)) {
            return lIlIlIlI[0];
        }
        if (!v.var16(var14.aG.p()) || v.var17(var14.aG.p().isEmpty() ? 1 : 0)) {
            return lIlIlIlI[0];
        }
        Instant var18 = Instant.now();
        Iterator<h> var19 = var14.aG.p().iterator();
        while (v.var17(var19.hasNext() ? 1 : 0)) {
            block12: {
                TileItem var20;
                block11: {
                    h var21 = var19.next();
                    if (v.var22(v.var23(Duration.between(var21.O(), var18).toMinutes(), 2L))) {
                        var14.aG.p().remove(var21);
                        0;
                    }
                    int[] nArray = new int[lIlIlIlI[1]];
                    nArray[v.lIlIlIlI[0]] = var21.P();
                    var20 = TileItems.getNearest((int[])nArray);
                    if (v.var24(var20)) {
                        var14.aG.p().remove(var21);
                        0;
                        0;
                        if ((123 + 77 - 169 + 99 ^ 60 + 120 - 124 + 78) != 0) continue;
                        return ((0xCE ^ 0x98 ^ (0xB1 ^ 0xC5)) & (0x18 ^ 0x61 ^ (0x6E ^ 0x35) ^ -1)) != 0;
                    }
                    if (!v.var17(Inventory.isFull() ? 1 : 0)) break block11;
                    if (v.var15(var20.isStackable() ? 1 : 0) && !v.var17(var20.isNoted() ? 1 : 0)) break block12;
                    int[] nArray2 = new int[lIlIlIlI[1]];
                    nArray2[v.lIlIlIlI[0]] = var20.getId();
                    if (!v.var17(Inventory.contains((int[])nArray2) ? 1 : 0)) break block12;
                }
                if (v.var15(Movement.shouldWalk() ? 1 : 0)) {
                    return lIlIlIlI[1];
                }
                var20.interact(lIlIlIIl[lIlIlIlI[0]]);
                return lIlIlIlI[1];
            }
            if (v.var17(Inventory.isFull() ? 1 : 0)) {
                Item var25 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[lIlIlIlI[1]];
                    stringArray[v.lIlIlIlI[0]] = lIlIlIIl[lIlIlIlI[2]];
                    return item.hasAction(stringArray);
                });
                if (v.var24(var25)) {
                    return lIlIlIlI[0];
                }
                var25.interact(lIlIlIIl[lIlIlIlI[1]]);
                var14.sleep(lIlIlIlI[2]);
                return lIlIlIlI[1];
            }
            0;
            if (((0x5A ^ 0x49 ^ (0x9E ^ 0x90)) & (0x69 ^ 0x37 ^ (0x73 ^ 0x30) ^ -1)) <= 3) continue;
            return ((0x63 ^ 0x72 ^ (0x1B ^ 0x5D)) & (9 ^ 0x37 ^ (0x1A ^ 0x73) ^ -1)) != 0;
        }
        return lIlIlIlI[0];
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    private static void var13() {
        lIlIlIIl = new String[lIlIlIlI[3]];
        v.lIlIlIIl[v.lIlIlIlI[0]] = "Take";
        v.lIlIlIIl[v.lIlIlIlI[1]] = "Eat";
        v.lIlIlIIl[v.lIlIlIlI[2]] = "Eat";
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static boolean var22(int n2) {
        return n2 > 0;
    }

    @Inject
    private LootingItemsTask(SquireCerberus squireCerberus, a a2) {
        this.aG = squireCerberus;
        this.aH = a2;
    }

    private static void var12() {
        lIlIlIlI = new int[5];
        v.lIlIlIlI[0] = (8 ^ 0x39 ^ 2) & (0xCE ^ 0x9C ^ (0x36 ^ 0x57) ^ -1);
        v.lIlIlIlI[1] = 1;
        v.lIlIlIlI[2] = 2;
        v.lIlIlIlI[3] = 3;
        v.lIlIlIlI[4] = 14 + 100 - 23 + 56 ^ 140 + 55 - 132 + 92;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static int var23(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }
}

