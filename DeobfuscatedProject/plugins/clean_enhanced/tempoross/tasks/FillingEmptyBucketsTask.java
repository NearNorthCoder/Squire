/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Filling empty buckets", priority=10, blocking=true)
public class FillingEmptyBucketsTask
extends TemporossTaskBase {
    
    private  int ak;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ak() {
        int n2;
        if (h.var3(this.ar.l() ? 1 : 0) && h.var4(this.ar.L() ? 1 : 0) && h.var3(Inventory.contains(item -> {
            int n2;
            if (h.var3(item.getName().contains(var2[var1[10]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[3]];
                stringArray[h.var1[0]] = var2[var1[11]];
                if (h.var4(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[3];
                    0;
                    if (-1 <= 0) return n2 != 0;
                    return ((0xBA ^ 0xB1) & ~(0x1E ^ 0x15)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = var1[2];
            nArray[h.var1[3]] = var1[4];
            if (h.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = var1[3];
                0;
                if (1 != 0) return n2 != 0;
                return ((21 + 144 - 109 + 142 ^ 43 + 74 - 36 + 50) & (0x1D ^ 0x50 ^ (0x64 ^ 0x6C) ^ -1)) != 0;
            }
        }
        n2 = var1[0];
        return n2 != 0;
    }

    static {
        h.var5();
        h.var6();
    }

    private static void var5() {
        var1 = new int[13];
        h.var1[0] = (0xEE ^ 0xBB) & ~(0xF3 ^ 0xA6);
        h.var1[1] = 2;
        h.var1[2] = 0xFFFFF3DD & 0x6FFF;
        h.var1[3] = 1;
        h.var1[4] = 0xFFFFE7DC & 0x7BFF;
        h.var1[5] = 3;
        h.var1[6] = 0x2E ^ 0x35 ^ (0x92 ^ 0x8D);
        h.var1[7] = 0xB5 ^ 0xB9;
        h.var1[8] = 0xDE ^ 0xB7 ^ (0xA9 ^ 0xC5);
        h.var1[9] = 4 ^ 2;
        h.var1[10] = 0xB ^ 0x1B ^ (0xB ^ 0x1C);
        h.var1[11] = 0x78 ^ 0x6F ^ (0xBD ^ 0xA2);
        h.var1[12] = 0x12 ^ 0x1B;
    }

    private static boolean var7(int n2) {
        return n2 > 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var1[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var1[0];
        while (h.var23(var22, var21)) {
            char var24 = var20[var22];
            var17.append((char)(var24 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (((0x1C ^ 0x11 ^ (0x7F ^ 0x5C)) & (0x62 ^ 0x6E ^ (0x83 ^ 0xA1) ^ -1)) < (0x5D ^ 0xB ^ (0xDC ^ 0x8E))) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var6() {
        var2 = new String[var1[12]];
        h.var2[h.var1[0]] = "Fill-bucket";
        h.var2[h.var1[3]] = "Bucket";
        h.var2[h.var1[1]] = "Empty";
        h.var2[h.var1[5]] = "Water pump";
        h.var2[h.var1[6]] = "Fill-bucket";
        h.var2[h.var1[8]] = "Bucket";
        h.var2[h.var1[9]] = "Empty";
        h.var2[h.var1[10]] = "Bucket";
        h.var2[h.var1[11]] = "Empty";
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        h var31;
        Player player = Players.getLocal();
        if (h.var7(this.ak)) {
            if (h.var32(player) && h.var3(player.isMoving() ? 1 : 0)) {
                return var1[3];
            }
            var31.ak -= var1[3];
            if (h.var4(Inventory.contains(item -> {
                int n2;
                if (h.var3(item.getName().contains(var2[var1[8]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[3]];
                    stringArray[h.var1[0]] = var2[var1[9]];
                    if (h.var4(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[3];
                        0;
                        if (((0x4A ^ 0xF ^ (0xDF ^ 0x96)) & (0xCF ^ 0x85 ^ (0x3C ^ 0x7A) ^ -1)) == 0) return n2 != 0;
                        return ((0xBB ^ 0xB2 ^ (0x6E ^ 0x6B)) & (0x36 ^ 0x32 ^ (0x2A ^ 0x22) ^ -1)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            }) ? 1 : 0)) {
                var31.ak = var1[0];
                return var1[0];
            }
            return var1[3];
        }
        TileObject var33 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.var3(tileObject.getName().contains(var2[var1[5]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[3]];
                stringArray[h.var1[0]] = var2[var1[6]];
                if (h.var3(tileObject.hasAction(stringArray) ? 1 : 0) && h.var23(tileObject.getWorldLocation().distanceTo(this.ar.N().ag()), var1[7])) {
                    n2 = var1[3];
                    0;
                    if (1 != -1) return n2 != 0;
                    return ((45 + 74 - 99 + 116 ^ 59 + 55 - 79 + 98) & (86 + 58 - 79 + 83 ^ 110 + 67 - 151 + 127 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (!h.var32(var33) || h.var3(var31.au.a((Locatable)var33) ? 1 : 0)) {
            return var1[3];
        }
        if (h.var3(var31.au.a((Locatable)var33) ? 1 : 0)) {
            return var31.au.b((SceneEntity)var33);
        }
        var2_2.interact(var2[var1[0]]);
        int n2 = Inventory.getAll(item -> {
            int n2;
            if (h.var3(item.getName().contains(var2[var1[3]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[3]];
                stringArray[h.var1[0]] = var2[var1[1]];
                if (h.var4(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[3];
                    0;
                    if (2 < (0xE6 ^ 0xA1 ^ (9 ^ 0x4A))) return n2 != 0;
                    return ((195 + 180 - 343 + 219 ^ 26 + 159 - 83 + 59) & (7 ^ 0x19 ^ (0xFF ^ 0xBB) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }).size();
        this.ak = n2 * var1[1];
        return var1[3];
    }

    @Inject
    protected FillingEmptyBucketsTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
        this.ak = var1[0];
    }

    private static boolean var23(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var32(Object object) {
        return object != null;
    }
}

