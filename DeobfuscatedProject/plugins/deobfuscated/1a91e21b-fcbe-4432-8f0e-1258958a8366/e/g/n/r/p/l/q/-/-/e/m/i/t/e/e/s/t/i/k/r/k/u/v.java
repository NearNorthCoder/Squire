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
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.x;
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
public class v
extends x {
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

    private static String lIllIIIIIlllIIl(String llllllllllllllIlllIllllIlllllIll, String llllllllllllllIlllIllllIllllllII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIllllllII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIlllI[2]), "DES");
            Cipher llllllllllllllIlllIllllIllllllll = Cipher.getInstance("DES");
            llllllllllllllIlllIllllIllllllll.init(lIIllIlIIlllI[0], llllllllllllllIlllIlllllIIIIIIII);
            return new String(llllllllllllllIlllIllllIllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllIlllllllI) {
            llllllllllllllIlllIllllIlllllllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean z() {
        TileObject llllllllllllllIlllIlllllIIllIIll;
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
                llllllllllllllIlllIlllllIIllIIll.interact(lIIllIlIIlIII[lIIllIlIIlllI[3]]);
                return lIIllIlIIlllI[3];
            }
            return lIIllIlIIlllI[1];
        }
        llllllllllllllIlllIlllllIIllIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[19]]));
        if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIll)) {
            TileObject llllllllllllllIlllIlllllIIllIIIl2;
            v llllllllllllllIlllIlllllIIllIllI;
            int llllllllllllllIlllIlllllIIllIIlI = lIIllIlIIlllI[5];
            if (v.lIllIIIIlIIllll(llllllllllllllIlllIlllllIIllIIll.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[0]]) ? 1 : 0)) {
                llllllllllllllIlllIlllllIIllIIlI = lIIllIlIIlllI[5];
                0;
                if (1 < -1) {
                    return ((0xB8 ^ 0x9B ^ (0xE0 ^ 0x93)) & (108 + 58 - 159 + 203 ^ 84 + 126 - 207 + 127 ^ -1)) != 0;
                }
            } else if (v.lIllIIIIlIIllll(llllllllllllllIlllIlllllIIllIIll.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[5]]) ? 1 : 0)) {
                llllllllllllllIlllIlllllIIllIIlI = lIIllIlIIlllI[0];
                0;
                if (((0xE1 ^ 0x91 ^ (0xCA ^ 0x92)) & (70 + 72 - 9 + 104 ^ 122 + 162 - 136 + 49 ^ -1)) != 0) {
                    return ((0xF ^ 0x6A ^ (0x68 ^ 0x37)) & (0x89 ^ 0xBB ^ (0x94 ^ 0x9C) ^ -1)) != 0;
                }
            } else if (v.lIllIIIIlIIllll(llllllllllllllIlllIlllllIIllIIll.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[6]]) ? 1 : 0)) {
                llllllllllllllIlllIlllllIIllIIlI = lIIllIlIIlllI[3];
            }
            if (v.lIllIIIIlIlIIII(llllllllllllllIlllIlllllIIllIllI.ah.b(), lIIllIlIIlllI[2])) {
                String[] stringArray = new String[lIIllIlIIlllI[3]];
                stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[7]];
                if (v.lIllIIIIlIIlllI(Inventory.getCount((String[])stringArray), llllllllllllllIlllIlllllIIllIIlI)) {
                    String[] stringArray2 = new String[lIIllIlIIlllI[3]];
                    stringArray2[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[8]];
                    Item llllllllllllllIlllIlllllIIllIIIl2 = Inventory.getFirst((String[])stringArray2);
                    if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIIl2)) {
                        llllllllllllllIlllIlllllIIllIIIl2.useOn(llllllllllllllIlllIlllllIIllIIll);
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
                            return ((0x1F ^ 0x4F) & ~(0x90 ^ 0xC0)) != 0;
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
            if (v.lIllIIIIlIlIIII(llllllllllllllIlllIlllllIIllIllI.ah.b(), lIIllIlIIlllI[4])) {
                NPC llllllllllllllIlllIlllllIIllIIII;
                void llllllllllllllIlllIlllllIIllIlIl;
                String[] stringArray = new String[lIIllIlIIlllI[3]];
                stringArray[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[2]];
                if (v.lIllIIIIlIIlllI(Inventory.getCount((String[])stringArray), llllllllllllllIlllIlllllIIllIIlI)) {
                    String[] stringArray3 = new String[lIIllIlIIlllI[3]];
                    stringArray3[v.lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[10]];
                    llllllllllllllIlllIlllllIIllIIIl2 = Inventory.getFirst((String[])stringArray3);
                    if (v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIIl2)) {
                        llllllllllllllIlllIlllllIIllIIIl2.useOn(llllllllllllllIlllIlllllIIllIIll);
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
                if (v.lIllIIIIlIlIIIl(llllllllllllllIlllIlllllIIllIlIl.getInteracting()) && v.lIllIIIIlIIllIl(llllllllllllllIlllIlllllIIllIIII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (v.lIllIIIIlIIllll(nPC.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[13]]) ? 1 : 0) && v.lIllIIIIlIlIIlI(nPC.getAnimation(), lIIllIlIIlllI[14]) && (!v.lIllIIIIlIlIIlI(nPC.getId(), lIIllIlIIlllI[15]) || v.lIllIIIIlIlIIII(nPC.getId(), lIIllIlIIlllI[16]))) {
                        n2 = lIIllIlIIlllI[3];
                        0;
                        if (2 >= (0x88 ^ 0x8C)) {
                            return ((0x56 ^ 0x61) & ~(0x97 ^ 0xA0)) != 0;
                        }
                    } else {
                        n2 = lIIllIlIIlllI[1];
                    }
                    return n2 != 0;
                }))) {
                    llllllllllllllIlllIlllllIIllIIII.interact(lIIllIlIIlIII[lIIllIlIIlllI[12]]);
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

    private static String lIllIIIIIlllIlI(String llllllllllllllIlllIlllllIIIIlIlI, String llllllllllllllIlllIlllllIIIIIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllllIIIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllllIIIIllII.init(lIIllIlIIlllI[0], llllllllllllllIlllIlllllIIIIllIl);
            return new String(llllllllllllllIlllIlllllIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllllIIIIlIll) {
            llllllllllllllIlllIlllllIIIIlIll.printStackTrace();
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

    private static String lIllIIIIIlllIII(String llllllllllllllIlllIlllllIIIlllll, String llllllllllllllIlllIlllllIIIllllI) {
        llllllllllllllIlllIlllllIIIlllll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllllIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllllIIIlllIl = new StringBuilder();
        char[] llllllllllllllIlllIlllllIIIlllII = llllllllllllllIlllIlllllIIIllllI.toCharArray();
        int llllllllllllllIlllIlllllIIIllIll = lIIllIlIIlllI[1];
        char[] llllllllllllllIlllIlllllIIIlIlIl = llllllllllllllIlllIlllllIIIlllll.toCharArray();
        int llllllllllllllIlllIlllllIIIlIlII = llllllllllllllIlllIlllllIIIlIlIl.length;
        int llllllllllllllIlllIlllllIIIlIIll = lIIllIlIIlllI[1];
        while (v.lIllIIIIlIlIIll(llllllllllllllIlllIlllllIIIlIIll, llllllllllllllIlllIlllllIIIlIlII)) {
            char llllllllllllllIlllIlllllIIlIIIII = llllllllllllllIlllIlllllIIIlIlIl[llllllllllllllIlllIlllllIIIlIIll];
            llllllllllllllIlllIlllllIIIlllIl.append((char)(llllllllllllllIlllIlllllIIlIIIII ^ llllllllllllllIlllIlllllIIIlllII[llllllllllllllIlllIlllllIIIllIll % llllllllllllllIlllIlllllIIIlllII.length]));
            0;
            ++llllllllllllllIlllIlllllIIIllIll;
            ++llllllllllllllIlllIlllllIIIlIIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllllIIIlllIl);
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

