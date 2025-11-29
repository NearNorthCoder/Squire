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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static void lIllIIIIlIIlIII() {
        lIIllIlIIlIII = new String[lIIllIlIIlllI[23]];
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[1]] = "Continue-trek";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[3]] = "Cross";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[0]] = "Broken";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[5]] = "Partially";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[6]] = "Slightly";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[7]] = "Logs";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[8]] = "Logs";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[9]] = "Chop down";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[2]] = "Plank";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[10]] = "Plank";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[11]] = "Plank";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[4]] = "Take";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[12]] = "Attack";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[13]] = "Undead Lumberjack";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[17]] = "Dead tree";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[18]] = "Chop down";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[19]] = "bridge";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[20]] = "Continue-trek";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[21]] = "Cross";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[22]] = "Fixed bridge";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean z() {
        TileObject var1;
        Player player = Players.getLocal();
        TileObject tileObject2 = this.A();
        TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIllIlIIlllI[3]];
            stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[21]];
            if (v.lIllIIIIlIIllll(tileObject.hasAction(stringArray) ? 1 : 0) && v.lIllIIIIlIIllll(tileObject.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[22]]) ? 1 : 0)) {
                n2 = lIIllIlIIlllI[3];

                if (2 >= (0xE7 ^ 0x90 ^ (0x70 ^ 3))) {
                    return ((82 + 119 - 170 + 105 ^ 179 + 65 - 71 + 24) & (0xD ^ 0x7D ^ (0xB3 ^ 0x8E) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIIlllI[1];
            }
            return n2 != 0;
        });
        if (v.lIllIIIIlIIllIl(tileObject3)) {
            if (v.lIllIIIIlIIlllI(player.getWorldX(), tileObject3.getWorldX())) {
                tileObject2 = TileObjects.getNearest(tileObject -> {
                    String[] stringArray = new String[lIIllIlIIlllI[3]];
                    stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[20]];
                    return tileObject.hasAction(stringArray);
                });
                if (v.lIllIIIIlIIllIl(tileObject2)) {
                    tileObject2.interact(lIIllIlIIlIII[lIIllIlIIlllI[1]]);
                    return lIIllIlIIlllI[3];
                }
            } else {
                var1.interact(lIIllIlIIlIII[lIIllIlIIlllI[3]]);
                return lIIllIlIIlllI[3];
            }
            return lIIllIlIIlllI[1];
        }
        var1 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[19]]));
        if (v.lIllIIIIlIIllIl(var1)) {
            TileObject llllllllllllllIlllIlllllIIllIIIl2;
            v var2;
            int var3 = lIIllIlIIlllI[5];
            if (v.lIllIIIIlIIllll(var1.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[0]]) ? 1 : 0)) {
                var3 = lIIllIlIIlllI[5];

                if (1 < -1) {
                    return ((0xB8 ^ 0x9B ^ (0xE0 ^ 0x93)) & (108 + 58 - 159 + 203 ^ 84 + 126 - 207 + 127 ^ -1)) != 0;
                }
            } else if (v.lIllIIIIlIIllll(var1.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[5]]) ? 1 : 0)) {
                var3 = lIIllIlIIlllI[0];

                if (((0xE1 ^ 0x91 ^ (0xCA ^ 0x92)) & (70 + 72 - 9 + 104 ^ 122 + 162 - 136 + 49 ^ -1)) != 0) {
                    return ((0xF ^ 0x6A ^ (0x68 ^ 0x37)) & (0x89 ^ 0xBB ^ (0x94 ^ 0x9C) ^ -1)) != 0;
                }
            } else if (v.lIllIIIIlIIllll(var1.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[6]]) ? 1 : 0)) {
                var3 = lIIllIlIIlllI[3];
            }
            if (v.lIllIIIIlIlIIII(var2.ah.b(), lIIllIlIIlllI[2])) {
                String[] stringArray = new String[lIIllIlIIlllI[3]];
                stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[7]];
                if (v.lIllIIIIlIIlllI(Inventory.getCount((String[])stringArray), var3)) {
                    String[] stringArray2 = new String[lIIllIlIIlllI[3]];
                    stringArray2[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[8]];
                    Item llllllllllllllIlllIlllllIIllIIIl2 = Inventory.getFirst((String[])stringArray2);
                    if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIIl2)) {
                        llllllllllllllIlllIlllllIIllIIIl2.useOn(var1);
                    }
                    return lIIllIlIIlllI[3];
                }
                llllllllllllllIlllIlllllIIllIIIl2 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (v.lIllIIIIlIIllll(tileObject.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[17]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIlIIlllI[3]];
                        stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[18]];
                        if (v.lIllIIIIlIIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIIllIlIIlllI[3];

                            if ((4 ^ 0) > 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIllIlIIlllI[1];
                    return n2 != 0;
                });
                if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIIl2)) {
                    llllllllllllllIlllIlllllIIllIIIl2.interact(lIIllIlIIlIII[lIIllIlIIlllI[9]]);
                    return lIIllIlIIlllI[3];
                }
            }
            if (v.lIllIIIIlIlIIII(var2.ah.b(), lIIllIlIIlllI[4])) {
                NPC var4;
                void var5;
                String[] stringArray = new String[lIIllIlIIlllI[3]];
                stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[2]];
                if (v.lIllIIIIlIIlllI(Inventory.getCount((String[])stringArray), var3)) {
                    String[] stringArray3 = new String[lIIllIlIIlllI[3]];
                    stringArray3[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[10]];
                    llllllllllllllIlllIlllllIIllIIIl2 = Inventory.getFirst((String[])stringArray3);
                    if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIIl2)) {
                        llllllllllllllIlllIlllllIIllIIIl2.useOn(var1);
                    }
                    return lIIllIlIIlllI[3];
                }
                String[] stringArray4 = new String[lIIllIlIIlllI[3]];
                stringArray4[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[11]];
                llllllllllllllIlllIlllllIIllIIIl2 = TileItems.getNearest((String[])stringArray4);
                if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIIl2)) {
                    llllllllllllllIlllIlllllIIllIIIl2.interact(lIIllIlIIlIII[lIIllIlIIlllI[4]]);
                    return lIIllIlIIlllI[3];
                }
                if (v.lIllIIIIlIlIIIl(var5.getInteracting()) && v.lIllIIIIlIIllIl(var4 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (v.lIllIIIIlIIllll(nPC.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[13]]) ? 1 : 0) && v.lIllIIIIlIlIIlI(nPC.getAnimation(), lIIllIlIIlllI[14]) && (!v.lIllIIIIlIlIIlI(nPC.getId(), lIIllIlIIlllI[15]) || v.lIllIIIIlIlIIII(nPC.getId(), lIIllIlIIlllI[16]))) {
                        n2 = lIIllIlIIlllI[3];

                        if (2 >= (0x88 ^ 0x8C)) {
                            return false;
                        }
                    } else {
                        n2 = lIIllIlIIlllI[1];
                    }
                    return n2 != 0;
                }))) {
                    var4.interact(lIIllIlIIlIII[lIIllIlIIlllI[12]]);
                    return lIIllIlIIlllI[3];
                }
            }
        }
        return lIIllIlIIlllI[1];
    }

    private static boolean lIllIIIIlIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected HandlingBridgeTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIlIIlllI[0]];
        nArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlllI[2];
        nArray[v.lIIllIlIIlllI[3]] = lIIllIlIIlllI[4];
        super(templeTrekkingPlugin, nArray);
    }

    private static boolean lIllIIIIlIlIIIl(Object object) {
        return object == null;
    }

    static {
        v.lIllIIIIlIIllII();
        v.lIllIIIIlIIlIII();
    }

        return String.valueOf(var6);
    }

    private static boolean lIllIIIIlIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIIlIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIIIlIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIlIIllIl(Object object) {
        return object != null;
    }
}

