package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
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
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Handling bridge")
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.v  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/v.class */
public class v extends x {
    private static /* synthetic */ String[] lIIllIlIIlIII;
    private static /* synthetic */ int[] lIIllIlIIlllI;

    private static void lIllIIIIlIIlIII() {
        lIIllIlIIlIII = new String[lIIllIlIIlllI[23]];
        lIIllIlIIlIII[lIIllIlIIlllI[1]] = lIllIIIIIlllIII("NDg3FxgZIjxOBQUyMg==", "wWYcq");
        lIIllIlIIlIII[lIIllIlIIlllI[3]] = lIllIIIIIlllIIl("n0e+r1TG2KE=", "idXMU");
        lIIllIlIIlIII[lIIllIlIIlllI[0]] = lIllIIIIIlllIIl("884oNe4B/bM=", "ibyZi");
        lIIllIlIIlIII[lIIllIlIIlllI[5]] = lIllIIIIIlllIIl("CKwwV0KmPRIi9wcuukxtnQ==", "cjCSa");
        lIIllIlIIlIII[lIIllIlIIlllI[6]] = lIllIIIIIlllIIl("72UTbbPW/oIc+sJTAEPQIg==", "meYqN");
        lIIllIlIIlIII[lIIllIlIIlllI[7]] = lIllIIIIIlllIlI("ekx3Aieh7hw=", "WDZWf");
        lIIllIlIIlIII[lIIllIlIIlllI[8]] = lIllIIIIIlllIIl("56JRIh90Kp8=", "FGhVd");
        lIIllIlIIlIII[lIIllIlIIlllI[9]] = lIllIIIIIlllIII("FgYGG3MxAR4F", "UnikS");
        lIIllIlIIlIII[lIIllIlIIlllI[2]] = lIllIIIIIlllIII("AT4bGQA=", "QRzwk");
        lIIllIlIIlIII[lIIllIlIIlllI[10]] = lIllIIIIIlllIIl("eAO4CmctHHw=", "LHzsC");
        lIIllIlIIlIII[lIIllIlIIlllI[11]] = lIllIIIIIlllIlI("HYXc6p8X7lA=", "xsZpq");
        lIIllIlIIlIII[lIIllIlIIlllI[4]] = lIllIIIIIlllIlI("MZiWlkCyydc=", "TuGOD");
        lIIllIlIIlIII[lIIllIlIIlllI[12]] = lIllIIIIIlllIlI("+icMfsjjHpU=", "CEmto");
        lIIllIlIIlIII[lIIllIlIIlllI[13]] = lIllIIIIIlllIII("PDkJKgANdyE6DAsyHyUACjw=", "iWmOa");
        lIIllIlIIlIII[lIIllIlIIlllI[17]] = lIllIIIIIlllIII("FQM1NVQlFDE0", "QfTQt");
        lIIllIlIIlIII[lIIllIlIIlllI[18]] = lIllIIIIIlllIIl("cpIr2/bw7X4GKVeP15abfw==", "LaQwP");
        lIIllIlIIlIII[lIIllIlIIlllI[19]] = lIllIIIIIlllIII("NhULMwAx", "TgbWg");
        lIIllIlIIlIII[lIIllIlIIlllI[20]] = lIllIIIIIlllIIl("4T8iKO++/D9dtLlM/em+3w==", "OTWIP");
        lIIllIlIIlIII[lIIllIlIIlllI[21]] = lIllIIIIIlllIII("IhUGHQQ=", "aginw");
        lIIllIlIIlIII[lIIllIlIIlllI[22]] = lIllIIIIIlllIIl("mvwCoFhJNqeayUMt2XvSjQ==", "jntne");
    }

    private static String lIllIIIIIlllIIl(String llllllllllllllIlllIllllIllllllIl, String llllllllllllllIlllIllllIllllllII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIllllllII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIlllI[2]), "DES");
            Cipher llllllllllllllIlllIllllIllllllll = Cipher.getInstance("DES");
            llllllllllllllIlllIllllIllllllll.init(lIIllIlIIlllI[0], llllllllllllllIlllIlllllIIIIIIII);
            return new String(llllllllllllllIlllIllllIllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIlllllllI) {
            llllllllllllllIlllIllllIlllllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v126, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    @Override // e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.x
    public boolean z() {
        Player local = Players.getLocal();
        A();
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[lIIllIlIIlllI[3]];
            strArr[lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[21]];
            if (lIllIIIIlIIllll(tileObject.hasAction(strArr) ? 1 : 0) && lIllIIIIlIIllll(tileObject.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[22]]) ? 1 : 0)) {
                ?? r0 = lIIllIlIIlllI[3];
                "".length();
                return "  ".length() >= ((231 ^ 144) ^ (112 ^ 3)) ? ((((82 + 119) - 170) + 105) ^ (((179 + 65) - 71) + 24)) & (((13 ^ 125) ^ (179 ^ 142)) ^ (-" ".length())) : r0;
            }
            return lIIllIlIIlllI[1];
        });
        if (lIllIIIIlIIllIl(nearest)) {
            if (!lIllIIIIlIIlllI(local.getWorldX(), nearest.getWorldX())) {
                nearest.interact(lIIllIlIIlIII[lIIllIlIIlllI[3]]);
                return lIIllIlIIlllI[3];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                String[] strArr = new String[lIIllIlIIlllI[3]];
                strArr[lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[20]];
                return tileObject2.hasAction(strArr);
            });
            if (lIllIIIIlIIllIl(nearest2)) {
                nearest2.interact(lIIllIlIIlIII[lIIllIlIIlllI[1]]);
                return lIIllIlIIlllI[3];
            }
            return lIIllIlIIlllI[1];
        }
        TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
            return tileObject3.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[19]]);
        });
        if (lIllIIIIlIIllIl(nearest3)) {
            int i = lIIllIlIIlllI[5];
            if (lIllIIIIlIIllll(nearest3.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[0]]) ? 1 : 0)) {
                i = lIIllIlIIlllI[5];
                "".length();
                if (" ".length() < (-" ".length())) {
                    return ((184 ^ 155) ^ (224 ^ 147)) & (((((108 + 58) - 159) + 203) ^ (((84 + 126) - 207) + 127)) ^ (-" ".length()));
                }
            } else if (lIllIIIIlIIllll(nearest3.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[5]]) ? 1 : 0)) {
                i = lIIllIlIIlllI[0];
                "".length();
                if ((((225 ^ 145) ^ (202 ^ 146)) & (((((70 + 72) - 9) + 104) ^ (((122 + 162) - 136) + 49)) ^ (-" ".length()))) != 0) {
                    return ((15 ^ 106) ^ (104 ^ 55)) & (((137 ^ 187) ^ (148 ^ 156)) ^ (-" ".length()));
                }
            } else if (lIllIIIIlIIllll(nearest3.getName().contains(lIIllIlIIlIII[lIIllIlIIlllI[6]]) ? 1 : 0)) {
                i = lIIllIlIIlllI[3];
            }
            if (lIllIIIIlIlIIII(this.ah.b(), lIIllIlIIlllI[2])) {
                String[] strArr = new String[lIIllIlIIlllI[3]];
                strArr[lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[7]];
                if (lIllIIIIlIIlllI(Inventory.getCount(strArr), i)) {
                    String[] strArr2 = new String[lIIllIlIIlllI[3]];
                    strArr2[lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[8]];
                    Item first = Inventory.getFirst(strArr2);
                    if (lIllIIIIlIIllIl(first)) {
                        first.useOn(nearest3);
                    }
                    return lIIllIlIIlllI[3];
                }
                TileObject nearest4 = TileObjects.getNearest(tileObject4 -> {
                    if (lIllIIIIlIIllll(tileObject4.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[17]]) ? 1 : 0)) {
                        String[] strArr3 = new String[lIIllIlIIlllI[3]];
                        strArr3[lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[18]];
                        if (lIllIIIIlIIllll(tileObject4.hasAction(strArr3) ? 1 : 0)) {
                            ?? r0 = lIIllIlIIlllI[3];
                            "".length();
                            return (4 ^ 0) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIIllIlIIlllI[1];
                });
                if (lIllIIIIlIIllIl(nearest4)) {
                    nearest4.interact(lIIllIlIIlIII[lIIllIlIIlllI[9]]);
                    return lIIllIlIIlllI[3];
                }
            }
            if (lIllIIIIlIlIIII(this.ah.b(), lIIllIlIIlllI[4])) {
                String[] strArr3 = new String[lIIllIlIIlllI[3]];
                strArr3[lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[2]];
                if (lIllIIIIlIIlllI(Inventory.getCount(strArr3), i)) {
                    String[] strArr4 = new String[lIIllIlIIlllI[3]];
                    strArr4[lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[10]];
                    Item first2 = Inventory.getFirst(strArr4);
                    if (lIllIIIIlIIllIl(first2)) {
                        first2.useOn(nearest3);
                    }
                    return lIIllIlIIlllI[3];
                }
                String[] strArr5 = new String[lIIllIlIIlllI[3]];
                strArr5[lIIllIlIIlllI[1]] = lIIllIlIIlIII[lIIllIlIIlllI[11]];
                TileItem nearest5 = TileItems.getNearest(strArr5);
                if (lIllIIIIlIIllIl(nearest5)) {
                    nearest5.interact(lIIllIlIIlIII[lIIllIlIIlllI[4]]);
                    return lIIllIlIIlllI[3];
                } else if (lIllIIIIlIlIIIl(local.getInteracting())) {
                    NPC nearest6 = NPCs.getNearest(npc -> {
                        if (lIllIIIIlIIllll(npc.getName().equals(lIIllIlIIlIII[lIIllIlIIlllI[13]]) ? 1 : 0) && lIllIIIIlIlIIlI(npc.getAnimation(), lIIllIlIIlllI[14]) && (!lIllIIIIlIlIIlI(npc.getId(), lIIllIlIIlllI[15]) || lIllIIIIlIlIIII(npc.getId(), lIIllIlIIlllI[16]))) {
                            ?? r0 = lIIllIlIIlllI[3];
                            "".length();
                            return "  ".length() >= (136 ^ 140) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIlIIlllI[1];
                    });
                    if (lIllIIIIlIIllIl(nearest6)) {
                        nearest6.interact(lIIllIlIIlIII[lIIllIlIIlllI[12]]);
                        return lIIllIlIIlllI[3];
                    }
                }
            }
        }
        return lIIllIlIIlllI[1];
    }

    private static boolean lIllIIIIlIIlllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIIIlIlIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected v(TempleTrekkingPlugin templeTrekkingPlugin) {
        super(templeTrekkingPlugin, r2);
        int[] iArr = new int[lIIllIlIIlllI[0]];
        iArr[lIIllIlIIlllI[1]] = lIIllIlIIlllI[2];
        iArr[lIIllIlIIlllI[3]] = lIIllIlIIlllI[4];
    }

    private static String lIllIIIIIlllIlI(String llllllllllllllIlllIlllllIIIIlIlI, String llllllllllllllIlllIlllllIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllllIIIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllllIIIIllII.init(lIIllIlIIlllI[0], secretKeySpec);
            return new String(llllllllllllllIlllIlllllIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllllIIIIlIll) {
            llllllllllllllIlllIlllllIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIlIIIl(Object obj) {
        return obj == null;
    }

    private static void lIllIIIIlIIllII() {
        lIIllIlIIlllI = new int[24];
        lIIllIlIIlllI[0] = "  ".length();
        lIIllIlIIlllI[1] = ((((187 + 158) - 269) + 115) ^ (((164 + 134) - 257) + 131)) & (((((106 + 67) - 140) + 115) ^ (((5 + 128) - 97) + 99)) ^ (-" ".length()));
        lIIllIlIIlllI[2] = 124 ^ 116;
        lIIllIlIIlllI[3] = " ".length();
        lIIllIlIIlllI[4] = (((8 + 98) - 102) + 158) ^ (((64 + 6) - (-31)) + 68);
        lIIllIlIIlllI[5] = "   ".length();
        lIIllIlIIlllI[6] = (2 ^ 103) ^ (62 ^ 95);
        lIIllIlIIlllI[7] = 10 ^ 15;
        lIIllIlIIlllI[8] = 69 ^ 67;
        lIIllIlIIlllI[9] = (189 ^ 196) ^ (2 ^ 124);
        lIIllIlIIlllI[10] = (57 ^ 126) ^ (125 ^ 51);
        lIIllIlIIlllI[11] = 45 ^ 39;
        lIIllIlIIlllI[12] = (4 ^ 103) ^ (226 ^ 141);
        lIIllIlIIlllI[13] = 51 ^ 62;
        lIIllIlIIlllI[14] = (-((-21393) & 23475)) & (-16514) & 24567;
        lIIllIlIIlllI[15] = (-((-20761) & 31161)) & (-329) & 16383;
        lIIllIlIIlllI[16] = (-(((87 + 49) - 101) + 94)) & (-8485) & 14263;
        lIIllIlIIlllI[17] = (172 ^ 140) ^ (2 ^ 44);
        lIIllIlIIlllI[18] = 8 ^ 7;
        lIIllIlIIlllI[19] = 37 ^ 53;
        lIIllIlIIlllI[20] = (((19 + 24) - 0) + 84) ^ (29 ^ 115);
        lIIllIlIIlllI[21] = (((28 + 89) - 75) + 86) ^ (((62 + 96) - 19) + 7);
        lIIllIlIIlllI[22] = (133 ^ 167) ^ (151 ^ 166);
        lIIllIlIIlllI[23] = (145 ^ 178) ^ (31 ^ 40);
    }

    static {
        lIllIIIIlIIllII();
        lIllIIIIlIIlIII();
    }

    private static String lIllIIIIIlllIII(String llllllllllllllIlllIlllllIIIlllll, String llllllllllllllIlllIlllllIIIllllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllllIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllllIIIlllIl = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlllllIIIllllI.toCharArray();
        int llllllllllllllIlllIlllllIIIllIll = lIIllIlIIlllI[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIlllIlllllIIIlIlII = charArray2.length;
        int i = lIIllIlIIlllI[1];
        while (lIllIIIIlIlIIll(i, llllllllllllllIlllIlllllIIIlIlII)) {
            llllllllllllllIlllIlllllIIIlllIl.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIlllllIIIllIll % charArray.length]));
            "".length();
            llllllllllllllIlllIlllllIIIllIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlllllIIIlllIl);
    }

    private static boolean lIllIIIIlIlIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIIIlIlIIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIIIlIIllll(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIlIIllIl(Object obj) {
        return obj != null;
    }
}
