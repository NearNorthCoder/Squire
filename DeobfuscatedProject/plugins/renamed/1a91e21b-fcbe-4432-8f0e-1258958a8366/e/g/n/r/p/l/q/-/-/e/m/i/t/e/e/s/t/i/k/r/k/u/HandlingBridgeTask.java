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
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.x_Unknown;
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

/* TASK: Handling bridge -> HandlingbridgeTask */
@TaskDesc(name="Handling bridge")
public class HandlingBridgeTask
extends x_Unknown {
    private static /* synthetic */ String[] lIIllIlIIlIII;
    private static /* synthetic */ int[] lIIllIlIIlllI;

    private static void lIllIIIIlIIlIII() {
        lIIllIlIIlIII = new String[lIIllIlIIlllI[23]];
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[1]] = v."Continue-trek";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[3]] = v."Cross";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[0]] = v."Broken";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[5]] = v."Partially";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[6]] = v."Slightly";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[7]] = v."Logs";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[8]] = v."Logs";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[9]] = v."Chop down";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[2]] = v."Plank";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[10]] = v."Plank";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[11]] = v."Plank";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[4]] = v."Take";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[12]] = v."Attack";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[13]] = v."Undead Lumberjack";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[17]] = v."Dead tree";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[18]] = v."Chop down";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[19]] = v."bridge";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[20]] = v."Continue-trek";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[21]] = v."Cross";
        v.lIIllIlIIlIII[v.lIIllIlIIlllI[22]] = v."Fixed bridge";
    }

    private static String lIllIIIIIlllIIl(String var1, String var5) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIllIlIIlllI[2]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIIllIlIIlllI[0], var8);
            return new String(var21.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean z() {
        TileObject var11;
        Player player = Players.getLocal();
        TileObject tileObject2 = this.A();
        TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIllIlIIlllI[3]];
            stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[21]];
            if (v.lIllIIIIlIIllll(tileObject.hasAction(stringArray) ? 1 : 0) && v.lIllIIIIlIIllll(tileObject.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[22]]) ? 1 : 0)) {
                n2 = lIIllIlIIlllI[3];
                0;
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
                var11.interact(lIIllIlIIlIII[lIIllIlIIlllI[3]]);
                return lIIllIlIIlllI[3];
            }
            return lIIllIlIIlllI[1];
        }
        var11 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[19]]));
        if (v.lIllIIIIlIIllIl(var11)) {
            TileObject llllllllllllllIlllIlllllIIllIIIl2;
            v var19;
            int var15 = lIIllIlIIlllI[5];
            if (v.lIllIIIIlIIllll(var11.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[0]]) ? 1 : 0)) {
                var15 = lIIllIlIIlllI[5];
                0;
                if (1 < -1) {
                    return ((0xB8 ^ 0x9B ^ (0xE0 ^ 0x93)) & (108 + 58 - 159 + 203 ^ 84 + 126 - 207 + 127 ^ -1)) != 0;
                }
            } else if (v.lIllIIIIlIIllll(var11.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[5]]) ? 1 : 0)) {
                var15 = lIIllIlIIlllI[0];
                0;
                if (((0xE1 ^ 0x91 ^ (0xCA ^ 0x92)) & (70 + 72 - 9 + 104 ^ 122 + 162 - 136 + 49 ^ -1)) != 0) {
                    return ((0xF ^ 0x6A ^ (0x68 ^ 0x37)) & (0x89 ^ 0xBB ^ (0x94 ^ 0x9C) ^ -1)) != 0;
                }
            } else if (v.lIllIIIIlIIllll(var11.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[6]]) ? 1 : 0)) {
                var15 = lIIllIlIIlllI[3];
            }
            if (v.lIllIIIIlIlIIII(var19.ah.b(), lIIllIlIIlllI[2])) {
                String[] stringArray = new String[lIIllIlIIlllI[3]];
                stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[7]];
                if (v.lIllIIIIlIIlllI(Inventory.getCount((String[])stringArray), var15)) {
                    String[] stringArray2 = new String[lIIllIlIIlllI[3]];
                    stringArray2[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[8]];
                    Item llllllllllllllIlllIlllllIIllIIIl2 = Inventory.getFirst((String[])stringArray2);
                    if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIIl2)) {
                        llllllllllllllIlllIlllllIIllIIIl2.useOn(var11);
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
                            0;
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
            if (v.lIllIIIIlIlIIII(var19.ah.b(), lIIllIlIIlllI[4])) {
                NPC var6;
                void var16;
                String[] stringArray = new String[lIIllIlIIlllI[3]];
                stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[2]];
                if (v.lIllIIIIlIIlllI(Inventory.getCount((String[])stringArray), var15)) {
                    String[] stringArray3 = new String[lIIllIlIIlllI[3]];
                    stringArray3[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[10]];
                    llllllllllllllIlllIlllllIIllIIIl2 = Inventory.getFirst((String[])stringArray3);
                    if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIIl2)) {
                        llllllllllllllIlllIlllllIIllIIIl2.useOn(var11);
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
                if (v.lIllIIIIlIlIIIl(var16.getInteracting()) && v.lIllIIIIlIIllIl(var6 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (v.lIllIIIIlIIllll(nPC.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[13]]) ? 1 : 0) && v.lIllIIIIlIlIIlI(nPC.getAnimation(), lIIllIlIIlllI[14]) && (!v.lIllIIIIlIlIIlI(nPC.getId(), lIIllIlIIlllI[15]) || v.lIllIIIIlIlIIII(nPC.getId(), lIIllIlIIlllI[16]))) {
                        n2 = lIIllIlIIlllI[3];
                        0;
                        if (2 >= (0x88 ^ 0x8C)) {
                            return false;
                        }
                    } else {
                        n2 = lIIllIlIIlllI[1];
                    }
                    return n2 != 0;
                }))) {
                    var6.interact(lIIllIlIIlIII[lIIllIlIIlllI[12]]);
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
    protected v(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIlIIlllI[0]];
        nArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlllI[2];
        nArray[v.lIIllIlIIlllI[3]] = lIIllIlIIlllI[4];
        super(templeTrekkingPlugin, nArray);
    }

    private static String lIllIIIIIlllIlI(String var20, String var17) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIIllIlIIlllI[0], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIlIIIl(Object object) {
        return object == null;
    }

    private static void lIllIIIIlIIllII() {
        lIIllIlIIlllI = new int[24];
        v.lIIllIlIIlllI[0] = 2;
        v.lIIllIlIIlllI[1] = (187 + 158 - 269 + 115 ^ 164 + 134 - 257 + 131) & (106 + 67 - 140 + 115 ^ 5 + 128 - 97 + 99 ^ -1);
        v.lIIllIlIIlllI[2] = 0x7C ^ 0x74;
        v.lIIllIlIIlllI[3] = 1;
        v.lIIllIlIIlllI[4] = 8 + 98 - 102 + 158 ^ 64 + 6 - -31 + 68;
        v.lIIllIlIIlllI[5] = 3;
        v.lIIllIlIIlllI[6] = 2 ^ 0x67 ^ (0x3E ^ 0x5F);
        v.lIIllIlIIlllI[7] = 0xA ^ 0xF;
        v.lIIllIlIIlllI[8] = 0x45 ^ 0x43;
        v.lIIllIlIIlllI[9] = 0xBD ^ 0xC4 ^ (2 ^ 0x7C);
        v.lIIllIlIIlllI[10] = 0x39 ^ 0x7E ^ (0x7D ^ 0x33);
        v.lIIllIlIIlllI[11] = 0x2D ^ 0x27;
        v.lIIllIlIIlllI[12] = 4 ^ 0x67 ^ (0xE2 ^ 0x8D);
        v.lIIllIlIIlllI[13] = 0x33 ^ 0x3E;
        v.lIIllIlIIlllI[14] = -(0xFFFFAC6F & 0x5BB3) & (0xFFFFBF7E & 0x5FF7);
        v.lIIllIlIIlllI[15] = -(0xFFFFAEE7 & 0x79B9) & (0xFFFFFEB7 & 0x3FFF);
        v.lIIllIlIIlllI[16] = -(87 + 49 - 101 + 94) & (0xFFFFDEDB & 0x37B7);
        v.lIIllIlIIlllI[17] = 0xAC ^ 0x8C ^ (2 ^ 0x2C);
        v.lIIllIlIIlllI[18] = 8 ^ 7;
        v.lIIllIlIIlllI[19] = 0x25 ^ 0x35;
        v.lIIllIlIIlllI[20] = 19 + 24 - 0 + 84 ^ (0x1D ^ 0x73);
        v.lIIllIlIIlllI[21] = 28 + 89 - 75 + 86 ^ 62 + 96 - 19 + 7;
        v.lIIllIlIIlllI[22] = 0x85 ^ 0xA7 ^ (0x97 ^ 0xA6);
        v.lIIllIlIIlllI[23] = 0x91 ^ 0xB2 ^ (0x1F ^ 0x28);
    }

    static {
        v.lIllIIIIlIIllII();
        v.lIllIIIIlIIlIII();
    }

    private static String lIllIIIIIlllIII(String var14, String var2) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var7 = var2.toCharArray();
        int var24 = lIIllIlIIlllI[1];
        char[] var9 = var14.toCharArray();
        int var23 = var9.length;
        int var13 = lIIllIlIIlllI[1];
        while (v.lIllIIIIlIlIIll(var13, var23)) {
            char var22 = var9[var13];
            var12.append((char)(var22 ^ var7[var24 % var7.length]));
            0;
            ++var24;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var12);
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

