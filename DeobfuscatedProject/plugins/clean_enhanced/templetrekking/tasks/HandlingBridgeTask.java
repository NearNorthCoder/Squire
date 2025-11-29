/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.TempletrekkingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Handling bridge")
public class HandlingBridgeTask
extends TempletrekkingTaskBase {

    private static void var3() {
        var1 = new String[var2[23]];
        v.var1[v.var2[1]] = "Continue-trek";
        v.var1[v.var2[3]] = "Cross";
        v.var1[v.var2[0]] = "Broken";
        v.var1[v.var2[5]] = "Partially";
        v.var1[v.var2[6]] = "Slightly";
        v.var1[v.var2[7]] = "Logs";
        v.var1[v.var2[8]] = "Logs";
        v.var1[v.var2[9]] = "Chop down";
        v.var1[v.var2[2]] = "Plank";
        v.var1[v.var2[10]] = "Plank";
        v.var1[v.var2[11]] = "Plank";
        v.var1[v.var2[4]] = "Take";
        v.var1[v.var2[12]] = "Attack";
        v.var1[v.var2[13]] = "Undead Lumberjack";
        v.var1[v.var2[17]] = "Dead tree";
        v.var1[v.var2[18]] = "Chop down";
        v.var1[v.var2[19]] = "bridge";
        v.var1[v.var2[20]] = "Continue-trek";
        v.var1[v.var2[21]] = "Cross";
        v.var1[v.var2[22]] = "Fixed bridge";
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean z() {
        TileObject var10;
        Player player = Players.getLocal();
        TileObject tileObject2 = this.A();
        TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[var2[3]];
            stringArray[v.var2[1]] = var1[var2[21]];
            if (v.var11(tileObject.hasAction(stringArray) ? 1 : 0) && v.var11(tileObject.getName().equals(var1[var2[22]]) ? 1 : 0)) {
                n2 = var2[3];
                0;
                if (2 >= (0xE7 ^ 0x90 ^ (0x70 ^ 3))) {
                    return ((82 + 119 - 170 + 105 ^ 179 + 65 - 71 + 24) & (0xD ^ 0x7D ^ (0xB3 ^ 0x8E) ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
        if (v.var12(tileObject3)) {
            if (v.var13(player.getWorldX(), tileObject3.getWorldX())) {
                tileObject2 = TileObjects.getNearest(tileObject -> {
                    String[] stringArray = new String[var2[3]];
                    stringArray[v.var2[1]] = var1[var2[20]];
                    return tileObject.hasAction(stringArray);
                });
                if (v.var12(tileObject2)) {
                    tileObject2.interact(var1[var2[1]]);
                    return var2[3];
                }
            } else {
                var10.interact(var1[var2[3]]);
                return var2[3];
            }
            return var2[1];
        }
        var10 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(var1[var2[19]]));
        if (v.var12(var10)) {
            TileObject llllllllllllllIlllIlllllIIllIIIl2;
            v var14;
            int var15 = var2[5];
            if (v.var11(var10.getName().contains(var1[var2[0]]) ? 1 : 0)) {
                var15 = var2[5];
                0;
                if (1 < -1) {
                    return ((0xB8 ^ 0x9B ^ (0xE0 ^ 0x93)) & (108 + 58 - 159 + 203 ^ 84 + 126 - 207 + 127 ^ -1)) != 0;
                }
            } else if (v.var11(var10.getName().contains(var1[var2[5]]) ? 1 : 0)) {
                var15 = var2[0];
                0;
                if (((0xE1 ^ 0x91 ^ (0xCA ^ 0x92)) & (70 + 72 - 9 + 104 ^ 122 + 162 - 136 + 49 ^ -1)) != 0) {
                    return ((0xF ^ 0x6A ^ (0x68 ^ 0x37)) & (0x89 ^ 0xBB ^ (0x94 ^ 0x9C) ^ -1)) != 0;
                }
            } else if (v.var11(var10.getName().contains(var1[var2[6]]) ? 1 : 0)) {
                var15 = var2[3];
            }
            if (v.var16(var14.ah.b(), var2[2])) {
                String[] stringArray = new String[var2[3]];
                stringArray[v.var2[1]] = var1[var2[7]];
                if (v.var13(Inventory.getCount((String[])stringArray), var15)) {
                    String[] stringArray2 = new String[var2[3]];
                    stringArray2[v.var2[1]] = var1[var2[8]];
                    Item llllllllllllllIlllIlllllIIllIIIl2 = Inventory.getFirst((String[])stringArray2);
                    if (v.var12(llllllllllllllIlllIlllllIIllIIIl2)) {
                        llllllllllllllIlllIlllllIIllIIIl2.useOn(var10);
                    }
                    return var2[3];
                }
                llllllllllllllIlllIlllllIIllIIIl2 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (v.var11(tileObject.getName().equals(var1[var2[17]]) ? 1 : 0)) {
                        String[] stringArray = new String[var2[3]];
                        stringArray[v.var2[1]] = var1[var2[18]];
                        if (v.var11(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = var2[3];
                            0;
                            if ((4 ^ 0) > 0) return n2 != 0;
                            return ((0x1F ^ 0x4F) & ~(0x90 ^ 0xC0)) != 0;
                        }
                    }
                    n2 = var2[1];
                    return n2 != 0;
                });
                if (v.var12(llllllllllllllIlllIlllllIIllIIIl2)) {
                    llllllllllllllIlllIlllllIIllIIIl2.interact(var1[var2[9]]);
                    return var2[3];
                }
            }
            if (v.var16(var14.ah.b(), var2[4])) {
                NPC var17;
                void var18;
                String[] stringArray = new String[var2[3]];
                stringArray[v.var2[1]] = var1[var2[2]];
                if (v.var13(Inventory.getCount((String[])stringArray), var15)) {
                    String[] stringArray3 = new String[var2[3]];
                    stringArray3[v.var2[1]] = var1[var2[10]];
                    llllllllllllllIlllIlllllIIllIIIl2 = Inventory.getFirst((String[])stringArray3);
                    if (v.var12(llllllllllllllIlllIlllllIIllIIIl2)) {
                        llllllllllllllIlllIlllllIIllIIIl2.useOn(var10);
                    }
                    return var2[3];
                }
                String[] stringArray4 = new String[var2[3]];
                stringArray4[v.var2[1]] = var1[var2[11]];
                llllllllllllllIlllIlllllIIllIIIl2 = TileItems.getNearest((String[])stringArray4);
                if (v.var12(llllllllllllllIlllIlllllIIllIIIl2)) {
                    llllllllllllllIlllIlllllIIllIIIl2.interact(var1[var2[4]]);
                    return var2[3];
                }
                if (v.var19(var18.getInteracting()) && v.var12(var17 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (v.var11(nPC.getName().equals(var1[var2[13]]) ? 1 : 0) && v.var20(nPC.getAnimation(), var2[14]) && (!v.var20(nPC.getId(), var2[15]) || v.var16(nPC.getId(), var2[16]))) {
                        n2 = var2[3];
                        0;
                        if (2 >= (0x88 ^ 0x8C)) {
                            return ((0x56 ^ 0x61) & ~(0x97 ^ 0xA0)) != 0;
                        }
                    } else {
                        n2 = var2[1];
                    }
                    return n2 != 0;
                }))) {
                    var17.interact(var1[var2[12]]);
                    return var2[3];
                }
            }
        }
        return var2[1];
    }

    private static boolean var13(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected HandlingBridgeTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[var2[0]];
        nArray[v.var2[1]] = var2[2];
        nArray[v.var2[3]] = var2[4];
        super(templeTrekkingPlugin, nArray);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static void var28() {
        var2 = new int[24];
        v.var2[0] = 2;
        v.var2[1] = (187 + 158 - 269 + 115 ^ 164 + 134 - 257 + 131) & (106 + 67 - 140 + 115 ^ 5 + 128 - 97 + 99 ^ -1);
        v.var2[2] = 0x7C ^ 0x74;
        v.var2[3] = 1;
        v.var2[4] = 8 + 98 - 102 + 158 ^ 64 + 6 - -31 + 68;
        v.var2[5] = 3;
        v.var2[6] = 2 ^ 0x67 ^ (0x3E ^ 0x5F);
        v.var2[7] = 0xA ^ 0xF;
        v.var2[8] = 0x45 ^ 0x43;
        v.var2[9] = 0xBD ^ 0xC4 ^ (2 ^ 0x7C);
        v.var2[10] = 0x39 ^ 0x7E ^ (0x7D ^ 0x33);
        v.var2[11] = 0x2D ^ 0x27;
        v.var2[12] = 4 ^ 0x67 ^ (0xE2 ^ 0x8D);
        v.var2[13] = 0x33 ^ 0x3E;
        v.var2[14] = -(0xFFFFAC6F & 0x5BB3) & (0xFFFFBF7E & 0x5FF7);
        v.var2[15] = -(0xFFFFAEE7 & 0x79B9) & (0xFFFFFEB7 & 0x3FFF);
        v.var2[16] = -(87 + 49 - 101 + 94) & (0xFFFFDEDB & 0x37B7);
        v.var2[17] = 0xAC ^ 0x8C ^ (2 ^ 0x2C);
        v.var2[18] = 8 ^ 7;
        v.var2[19] = 0x25 ^ 0x35;
        v.var2[20] = 19 + 24 - 0 + 84 ^ (0x1D ^ 0x73);
        v.var2[21] = 28 + 89 - 75 + 86 ^ 62 + 96 - 19 + 7;
        v.var2[22] = 0x85 ^ 0xA7 ^ (0x97 ^ 0xA6);
        v.var2[23] = 0x91 ^ 0xB2 ^ (0x1F ^ 0x28);
    }

    static {
        v.var28();
        v.var3();
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = var2[1];
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = var2[1];
        while (v.var21(var37, var36)) {
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

    private static boolean var16(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var12(Object object) {
        return object != null;
    }
}

