package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Moving to next floor", priority = 10)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.g  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/g.class */
public class g extends k {
    private static /* synthetic */ int[] lllllllIIIII;
    static final /* synthetic */ Set<Integer> A;
    private static /* synthetic */ String[] llllllIlIIll;

    private static void lIIlIlIIlIlllll() {
        lllllllIIIII = new int[13];
        lllllllIIIII[0] = ((153 ^ 143) ^ (160 ^ 152)) & (((((21 + 99) - 115) + 161) ^ (((41 + 37) - 15) + 73)) ^ (-" ".length()));
        lllllllIIIII[1] = " ".length();
        lllllllIIIII[2] = "  ".length();
        lllllllIIIII[3] = "   ".length();
        lllllllIIIII[4] = 164 ^ 160;
        lllllllIIIII[5] = (14 ^ 7) ^ (97 ^ 109);
        lllllllIIIII[6] = (175 ^ 157) ^ (36 ^ 16);
        lllllllIIIII[7] = (79 ^ 74) ^ "  ".length();
        lllllllIIIII[8] = 202 ^ 194;
        lllllllIIIII[9] = (-2209) & 23469;
        lllllllIIIII[10] = (-((-1198) & 9471)) & (-3073) & 32607;
        lllllllIIIII[11] = (-113) & 21375;
        lllllllIIIII[12] = 125 ^ 116;
    }

    private static void lIIlIlIIlIllllI() {
        llllllIlIIll = new String[lllllllIIIII[12]];
        llllllIlIIll[lllllllIIIII[0]] = lIIlIlIIIlIllll("Ho0F2k2Q5og=", "npvEo");
        llllllIlIIll[lllllllIIIII[1]] = lIIlIlIIIlIllll("LRiv432Su+o3boYxgIVFIA==", "HjlIW");
        llllllIlIIll[lllllllIIIII[2]] = lIIlIlIIIllIIII("EgcUOlUuARQ6", "BnwQx");
        llllllIlIIll[lllllllIIIII[3]] = lIIlIlIIIllIIII("PDcIG2ssNwoL", "hXeyK");
        llllllIlIIll[lllllllIIIII[4]] = lIIlIlIIIlIllll("h4709IcxTt9iCBE7RKLhxw==", "MQfpZ");
        llllllIlIIll[lllllllIIIII[5]] = lIIlIlIIIlIllll("kj6Ewepl6D3ay76ujv+CFg==", "kwZoW");
        llllllIlIIll[lllllllIIIII[6]] = lIIlIlIIIlIllll("02wo3lwR2Ud9JzUpMJCxsQ==", "tDEbF");
        llllllIlIIll[lllllllIIIII[7]] = lIIlIlIIIlIllll("lpfT0/GlRo2BkN8pPMlSqKosINntn4Ja", "oYtPS");
        llllllIlIIll[lllllllIIIII[8]] = lIIlIlIIIlIllll("1z1QsEoEv3c=", "QOOth");
    }

    private static boolean lIIlIlIIllIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIIllIIIII(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIIIlIllll(String lllllllllllllllIIlIIllIIllIllllI, String lllllllllllllllIIlIIllIIllIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIlllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllllIIIII[2], lllllllllllllllIIlIIllIIlllIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIllIlllll) {
            lllllllllllllllIIlIIllIIllIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIIllIIII(String lllllllllllllllIIlIIllIIllIIlllI, String lllllllllllllllIIlIIllIIllIIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIIllIIllII = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIllIIlIll = lllllllllllllllIIlIIllIIllIIllIl.toCharArray();
        int lllllllllllllllIIlIIllIIllIIlIlI = lllllllIIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllllllIIIII[0];
        while (lIIlIlIIllIIlII(i, length)) {
            lllllllllllllllIIlIIllIIllIIllII.append((char) (charArray[i] ^ lllllllllllllllIIlIIllIIllIIlIll[lllllllllllllllIIlIIllIIllIIlIlI % lllllllllllllllIIlIIllIIllIIlIll.length]));
            "".length();
            lllllllllllllllIIlIIllIIllIIlIlI++;
            i++;
            "".length();
            if (((90 ^ 105) ^ (137 ^ 190)) == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIllIIllIIllII);
    }

    @Inject
    protected g(a aVar, Client client) {
        super(aVar, client);
    }

    static {
        lIIlIlIIlIlllll();
        lIIlIlIIlIllllI();
        A = ImmutableSet.of(Integer.valueOf(lllllllIIIII[9]), Integer.valueOf(lllllllIIIII[10]), Integer.valueOf(lllllllIIIII[11]));
    }

    private static boolean lIIlIlIIllIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIllIIIll(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIIllIIlII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    @Override // u.l.n.q.r.p.p000.u.r.d.i.e.e.s.k
    public boolean j() {
        c f = c.f();
        if (lIIlIlIIllIIIII(f)) {
            return lllllllIIIII[0];
        }
        if (lIIlIlIIllIIIIl(this.D.a(f) ? 1 : 0) && lIIlIlIIllIIIlI(TileObjects.getNearest(tileObject -> {
            if (lIIlIlIIllIIIIl(tileObject.getName().equals(llllllIlIIll[lllllllIIIII[7]]) ? 1 : 0)) {
                String[] strArr = new String[lllllllIIIII[1]];
                strArr[lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[8]];
                if (lIIlIlIIllIIIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllllllIIIII[1];
                    "".length();
                    return (-"   ".length()) > 0 ? ((26 ^ 89) ^ (23 ^ 1)) & (((((88 + 69) - 131) + 174) ^ (((145 + 2) - 93) + 103)) ^ (-" ".length())) : r0;
                }
            }
            return lllllllIIIII[0];
        }))) {
            return lllllllIIIII[0];
        }
        if (lIIlIlIIllIIIIl(this.D.b(f) ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject2 -> {
                if (lIIlIlIIllIIIIl(A.contains(Integer.valueOf(tileObject2.getActualId())) ? 1 : 0) && lIIlIlIIllIIIIl(Reachable.isInteractable(tileObject2) ? 1 : 0)) {
                    ?? r0 = lllllllIIIII[1];
                    "".length();
                    return "  ".length() <= 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                }
                return lllllllIIIII[0];
            });
            if (lIIlIlIIllIIIlI(nearest)) {
                nearest.interact(llllllIlIIll[lllllllIIIII[0]]);
                return lllllllIIIII[1];
            }
        }
        if (lIIlIlIIllIIIll(c.g() ? 1 : 0)) {
            TileObject nearest2 = TileObjects.getNearest(tileObject3 -> {
                if (lIIlIlIIllIIIIl(tileObject3.getName().equals(llllllIlIIll[lllllllIIIII[5]]) ? 1 : 0) && lIIlIlIIllIIIIl(Reachable.isInteractable(tileObject3) ? 1 : 0)) {
                    String[] strArr = new String[lllllllIIIII[1]];
                    strArr[lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[6]];
                    if (lIIlIlIIllIIIIl(tileObject3.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllllllIIIII[1];
                        "".length();
                        return (((5 ^ 93) ^ (241 ^ 151)) & (((((18 + 25) - (-59)) + 55) ^ (((82 + 12) - 28) + 97)) ^ (-" ".length()))) != 0 ? ((40 ^ 81) ^ (109 ^ 13)) & (((((24 + 41) - (-47)) + 52) ^ (((106 + 44) - 1) + 40)) ^ (-" ".length())) : r0;
                    }
                }
                return lllllllIIIII[0];
            });
            if (lIIlIlIIllIIIlI(nearest2)) {
                nearest2.interact(llllllIlIIll[lllllllIIIII[1]]);
                return lllllllIIIII[1];
            }
            return lllllllIIIII[0];
        }
        TileObject nearest3 = TileObjects.getNearest(tileObject4 -> {
            if (lIIlIlIIllIIIIl(tileObject4.getName().equals(llllllIlIIll[lllllllIIIII[3]]) ? 1 : 0)) {
                String[] strArr = new String[lllllllIIIII[1]];
                strArr[lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[4]];
                if (lIIlIlIIllIIIIl(tileObject4.hasAction(strArr) ? 1 : 0) && lIIlIlIIllIIIIl(Reachable.isInteractable(tileObject4) ? 1 : 0)) {
                    ?? r0 = lllllllIIIII[1];
                    "".length();
                    return (((51 ^ 12) ^ (221 ^ 187)) & (((113 ^ 109) ^ (194 ^ 135)) ^ (-" ".length()))) != 0 ? ((169 ^ 138) ^ (23 ^ 40)) & (((171 ^ 137) ^ (41 ^ 23)) ^ (-" ".length())) : r0;
                }
            }
            return lllllllIIIII[0];
        });
        if (lIIlIlIIllIIIII(nearest3)) {
            return lllllllIIIII[0];
        }
        nearest3.interact(llllllIlIIll[lllllllIIIII[2]]);
        return lllllllIIIII[1];
    }
}
