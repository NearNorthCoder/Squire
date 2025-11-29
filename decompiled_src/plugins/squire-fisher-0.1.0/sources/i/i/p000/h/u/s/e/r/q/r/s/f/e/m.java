package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Tick Manipulating", priority = 50)
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.m  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/m.class */
public class m extends Task {
    private final /* synthetic */ SquireFisherConfig V;
    private static /* synthetic */ String[] lIlllIlIlllI;
    private final /* synthetic */ int[] Y;
    private final /* synthetic */ SquireFisherPlugin U;
    private final /* synthetic */ int[] X;
    private static /* synthetic */ int[] lIlllIlIllll;
    private final /* synthetic */ int[] W;

    private static boolean lllIlIlllIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIllIllllI(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lllIlIllIlllll(int i2, int i3) {
        return i2 == i3;
    }

    private static String lllIlIllIlIllI(String lllllllllllllllIlIlllIllIIIIIIlI, String lllllllllllllllIlIlllIllIIIIIIIl) {
        String lllllllllllllllIlIlllIllIIIIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIllIIIIIIIl.toCharArray();
        int lllllllllllllllIlIlllIlIlllllllI = lIlllIlIllll[1];
        char[] charArray2 = lllllllllllllllIlIlllIllIIIIIIlI2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlIlllIlIllllIllI = lIlllIlIllll[1];
        while (lllIlIlllIIIIl(lllllllllllllllIlIlllIlIllllIllI, length)) {
            sb.append((char) (charArray2[lllllllllllllllIlIlllIlIllllIllI] ^ charArray[lllllllllllllllIlIlllIlIlllllllI % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIlIlllllllI++;
            lllllllllllllllIlIlllIlIllllIllI++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllIlIllIlIlll() {
        lIlllIlIlllI = new String[lIlllIlIllll[25]];
        lIlllIlIlllI[lIlllIlIllll[1]] = lllIlIllIlIlIl("RQicXsA0ZEo=", "Hwpky");
        lIlllIlIlllI[lIlllIlIllll[3]] = lllIlIllIlIlIl("7Kh2RNRk2tEaolHKZWd+WJoAG6fpGyGANnygopGmE3D1jJsfIZr6FA==", "Qydhl");
        lIlllIlIlllI[lIlllIlIllll[5]] = lllIlIllIlIlIl("GOQQM88S2AQpeD4wgOZK8VcIp2njPLBOOLimB96iwFAoIv++dVuo0A==", "GWwCM");
        lIlllIlIlllI[lIlllIlIllll[7]] = lllIlIllIlIlIl("V5dizSTd4qE=", "gFzAR");
        lIlllIlIlllI[lIlllIlIllll[0]] = lllIlIllIlIllI("AS40", "SAQOa");
        lIlllIlIlllI[lIlllIlIllll[23]] = lllIlIllIlIlIl("NUGNY798hUQ=", "VMIWz");
        lIlllIlIlllI[lIlllIlIllll[24]] = lllIlIllIlIlIl("P4uLiRcboWw=", "aYLki");
    }

    static {
        lllIlIllIllIII();
        lllIlIllIlIlll();
    }

    @Inject
    public m(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        int[] iArr = new int[lIlllIlIllll[0]];
        iArr[lIlllIlIllll[1]] = lIlllIlIllll[2];
        iArr[lIlllIlIllll[3]] = lIlllIlIllll[4];
        iArr[lIlllIlIllll[5]] = lIlllIlIllll[6];
        iArr[lIlllIlIllll[7]] = lIlllIlIllll[8];
        this.W = iArr;
        int[] iArr2 = new int[lIlllIlIllll[0]];
        iArr2[lIlllIlIllll[1]] = lIlllIlIllll[9];
        iArr2[lIlllIlIllll[3]] = lIlllIlIllll[10];
        iArr2[lIlllIlIllll[5]] = lIlllIlIllll[11];
        iArr2[lIlllIlIllll[7]] = lIlllIlIllll[12];
        this.X = iArr2;
        int[] iArr3 = new int[lIlllIlIllll[5]];
        iArr3[lIlllIlIllll[1]] = lIlllIlIllll[13];
        iArr3[lIlllIlIllll[3]] = lIlllIlIllll[14];
        this.Y = iArr3;
        this.U = squireFisherPlugin;
        this.V = squireFisherConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean r() {
        if (lllIlIllIllIll(Inventory.contains(this.Y) ? 1 : 0)) {
            int[] iArr = new int[lIlllIlIllll[3]];
            iArr[lIlllIlIllll[1]] = lIlllIlIllll[17];
            if (lllIlIllIllIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIlllIlIllll[3];
                "".length();
                return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlllIlIllll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    public boolean run() {
        if ((!lllIlIllIllIIl(this.V.fish(), f.FLY_FISHING) || !lllIlIllIllIIl(this.V.fish(), f.BARBARIAN_FISHING)) && !lllIlIllIllIlI(this.V.tickFishing() ? 1 : 0) && !lllIlIllIllIll(Inventory.isFull() ? 1 : 0) && !lllIlIllIllIll(Bank.isOpen() ? 1 : 0)) {
            if (lllIlIllIllIlI(Inventory.contains(this.X) ? 1 : 0) && lllIlIllIllIll(Inventory.contains(this.W) ? 1 : 0)) {
                Inventory.getFirst(this.W).interact(lIlllIlIlllI[lIlllIlIllll[1]]);
                return lIlllIlIllll[3];
            } else if (lllIlIllIllIlI(r() ? 1 : 0) && lllIlIllIllIlI(q() ? 1 : 0)) {
                if (lllIlIllIllIlI(r() ? 1 : 0)) {
                    System.out.println(lIlllIlIlllI[lIlllIlIllll[3]]);
                }
                if (lllIlIllIllIlI(q() ? 1 : 0)) {
                    System.out.println(lIlllIlIlllI[lIlllIlIllll[5]]);
                }
                return lIlllIlIllll[1];
            } else {
                int animation = Players.getLocal().getAnimation();
                NPC nearest = NPCs.getNearest(npc -> {
                    return npc.hasAction(this.V.fish().n());
                });
                if (!lllIlIllIlllII(nearest) && !lllIlIllIlllIl(nearest.distanceTo(Players.getLocal()), lIlllIlIllll[0])) {
                    if (!lllIlIllIllllI(animation, lIlllIlIllll[15]) || lllIlIllIlllll(animation, lIlllIlIllll[16])) {
                        if (lllIlIllIllIll(this.V.cutEat() ? 1 : 0)) {
                            Item first = Inventory.getFirst(item -> {
                                return item.getName().contains(lIlllIlIlllI[lIlllIlIllll[24]]);
                            });
                            Item first2 = Inventory.getFirst(item2 -> {
                                if (!lllIlIllIllIlI(item2.getName().equals(lIlllIlIlllI[lIlllIlIllll[0]]) ? 1 : 0) || lllIlIllIllIll(item2.getName().equals(lIlllIlIlllI[lIlllIlIllll[23]]) ? 1 : 0)) {
                                    ?? r0 = lIlllIlIllll[3];
                                    "".length();
                                    return 0 != 0 ? ((((80 + 51) - (-40)) + 20) ^ (((29 + 60) - 3) + 75)) & (((84 ^ 3) ^ (212 ^ 157)) ^ (-" ".length())) : r0;
                                }
                                return lIlllIlIllll[1];
                            });
                            if (lllIlIlllIIIII(first) && lllIlIlllIIIII(first2)) {
                                int[] iArr = new int[lIlllIlIllll[3]];
                                iArr[lIlllIlIllll[1]] = lIlllIlIllll[17];
                                Inventory.getFirst(iArr).useOn(first);
                                first2.interact(lIlllIlIlllI[lIlllIlIllll[7]]);
                                return lIlllIlIllll[3];
                            } else if (lllIlIllIlllII(first2)) {
                                int[] iArr2 = new int[lIlllIlIllll[3]];
                                iArr2[lIlllIlIllll[1]] = lIlllIlIllll[17];
                                Inventory.getFirst(iArr2).useOn(first);
                            }
                        }
                        if (lllIlIllIllIll(q() ? 1 : 0)) {
                            Item first3 = Inventory.getFirst(this.X);
                            int[] iArr3 = new int[lIlllIlIllll[3]];
                            iArr3[lIlllIlIllll[1]] = lIlllIlIllll[18];
                            first3.useOn(Inventory.getFirst(iArr3));
                            return lIlllIlIllll[3];
                        } else if (lllIlIllIllIll(r() ? 1 : 0)) {
                            Item first4 = Inventory.getFirst(this.Y);
                            int[] iArr4 = new int[lIlllIlIllll[3]];
                            iArr4[lIlllIlIllll[1]] = lIlllIlIllll[17];
                            first4.useOn(Inventory.getFirst(iArr4));
                            return lIlllIlIllll[3];
                        }
                    }
                    if (!lllIlIllIllllI(animation, lIlllIlIllll[19]) || lllIlIllIlllll(animation, lIlllIlIllll[20])) {
                        nearest.interact(this.V.fish().n());
                        sleep(lIlllIlIllll[5]);
                        return lIlllIlIllll[3];
                    }
                    return lIlllIlIllll[1];
                }
                return lIlllIlIllll[1];
            }
        }
        return lIlllIlIllll[1];
    }

    private static void lllIlIllIllIII() {
        lIlllIlIllll = new int[26];
        lIlllIlIllll[0] = (((102 + 130) - 145) + 108) ^ (((98 + 28) - (-31)) + 42);
        lIlllIlIllll[1] = ((127 ^ 115) ^ (128 ^ 196)) & (((((186 + 120) - 159) + 50) ^ (((4 + 19) - (-53)) + 65)) ^ (-" ".length()));
        lIlllIlIllll[2] = ((35 + 149) - 117) + 132;
        lIlllIlIllll[3] = " ".length();
        lIlllIlIllll[4] = ((3 + 5) - (-15)) + 178;
        lIlllIlIllll[5] = "  ".length();
        lIlllIlIllll[6] = ((112 + 129) - 177) + 139;
        lIlllIlIllll[7] = "   ".length();
        lIlllIlIllll[8] = ((20 + 39) - 32) + 178;
        lIlllIlIllll[9] = ((51 + 79) - (-42)) + 77;
        lIlllIlIllll[10] = ((27 + 219) - 213) + 218;
        lIlllIlIllll[11] = (((((116 + 52) - 77) + 54) + (((133 + 54) - 40) + 73)) - ((-14433) & 14713)) + ((66 + 60) - (-16)) + 27;
        lIlllIlIllll[12] = (((218 ^ 177) + (3 ^ 70)) - (51 ^ 100)) + ((78 + 145) - 88) + 31;
        lIlllIlIllll[13] = (-17729) & 24061;
        lIlllIlIllll[14] = (-1795) & 8126;
        lIlllIlIllll[15] = (-((-642) & 23459)) & (-25) & 32191;
        lIlllIlIllll[16] = (-20737) & 21359;
        lIlllIlIllll[17] = (-((-26342) & 32495)) & (-16389) & 23487;
        lIlllIlIllll[18] = (-16457) & 18395;
        lIlllIlIllll[19] = (-((-12417) & 15313)) & (-47) & 8191;
        lIlllIlIllll[20] = (-((-561) & 11067)) & (-4101) & 15854;
        lIlllIlIllll[21] = (49 ^ 12) ^ (22 ^ 36);
        lIlllIlIllll[22] = (((57 ^ 60) + (38 ^ 19)) - (-(44 ^ 12))) + ((73 + 120) - 125) + 75;
        lIlllIlIllll[23] = 118 ^ 115;
        lIlllIlIllll[24] = 134 ^ 128;
        lIlllIlIllll[25] = 85 ^ 82;
    }

    private static boolean lllIlIlllIIIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lllIlIllIllIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lllIlIllIllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIlIllIlllII(Object obj) {
        return obj == null;
    }

    private static String lllIlIllIlIlIl(String lllllllllllllllIlIlllIlIlllIllIl, String lllllllllllllllIlIlllIlIlllIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIlllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlIllll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIlllIlllI) {
            lllllllllllllllIlIlllIlIlllIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean q() {
        if (lllIlIllIllIll(Inventory.contains(this.X) ? 1 : 0)) {
            ?? r0 = lIlllIlIllll[3];
            int[] iArr = new int[lIlllIlIllll[3]];
            iArr[lIlllIlIllll[1]] = lIlllIlIllll[18];
            if (lllIlIllIlllIl(Inventory.getCount((boolean) r0, iArr), lIlllIlIllll[21])) {
                int[] iArr2 = new int[lIlllIlIllll[3]];
                iArr2[lIlllIlIllll[1]] = lIlllIlIllll[22];
                if (lllIlIllIllIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    ?? r02 = lIlllIlIllll[3];
                    "".length();
                    return ((109 ^ 68) ^ (19 ^ 62)) == (-" ".length()) ? ((169 ^ 185) ^ (216 ^ 144)) & (((((57 + 162) - 129) + 140) ^ (((74 + 122) - 118) + 112)) ^ (-" ".length())) : r02;
                }
            }
        }
        return lIlllIlIllll[1];
    }

    private static boolean lllIlIllIlllIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lllIlIllIllIll(int i2) {
        return i2 != 0;
    }
}
