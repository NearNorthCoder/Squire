package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/j.class */
public class C0013j {
    private static /* synthetic */ int[] llllIIlllIll;
    private static /* synthetic */ String[] llllIIlllIIl;
    private static final /* synthetic */ int[] bE;
    private static final /* synthetic */ int[] bD;
    private static final /* synthetic */ int bH;
    private static final /* synthetic */ int bB;
    private static final /* synthetic */ int[] bF;
    private static final /* synthetic */ int bC;
    private static final /* synthetic */ Map<Integer, Integer> bG;
    private static final /* synthetic */ Logger bA;
    public /* synthetic */ List<WorldPoint> bI = null;
    public /* synthetic */ WorldPoint bJ = null;
    public /* synthetic */ NPC bK = null;
    public /* synthetic */ boolean bL = llllIIlllIll[2];
    public /* synthetic */ WorldPoint bM = null;
    public /* synthetic */ WorldPoint bN = null;
    private /* synthetic */ LinkedList<WorldPoint> bO = new LinkedList<>();

    public NPC aY() {
        return NPCs.getNearest(npc -> {
            if (lIIlIIIIIIlIIll(npc.getName().equalsIgnoreCase(llllIIlllIIl[llllIIlllIll[1]]) ? 1 : 0) && lIIlIIIIIIIllll(npc.isDead() ? 1 : 0)) {
                ?? r0 = llllIIlllIll[1];
                "".length();
                return "   ".length() <= ((22 ^ 65) & ((252 ^ 171) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIlllIll[2];
        });
    }

    public static TileObject aV() {
        return TileObjects.getNearest(bD);
    }

    private static void lIIlIIIIIIIlIII() {
        llllIIlllIIl = new String[llllIIlllIll[18]];
        llllIIlllIIl[llllIIlllIll[2]] = lIIlIIIIIIIIIIl("8x9Qg3MRVkxhZ1dvXz17yQ==", "QtXFr");
        llllIIlllIIl[llllIIlllIll[1]] = lIIlIIIIIIIIIIl("z0aMv02DIh8=", "cZbyW");
        llllIIlllIIl[llllIIlllIll[7]] = lIIlIIIIIIIIIlI("gmdUIRrJCMoYfH5fz4v4Hw==", "IhPnZ");
    }

    public WorldPoint bb() {
        return this.bJ;
    }

    protected boolean a(Object obj) {
        return obj instanceof C0013j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
        if (lIIlIIIIIIIllll(r0.equals(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
        if (lIIlIIIIIIIllll(r0.equals(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013f, code lost:
        if (lIIlIIIIIIIllll(r0.equals(r0) ? 1 : 0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019d, code lost:
        if (lIIlIIIIIIIllll(r0.equals(r0) ? 1 : 0) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0207, code lost:
        if (lIIlIIIIIIIllll(r0.equals(r0) ? 1 : 0) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0250, code lost:
        if (lIIlIIIIIIIllll(r0.equals(r0) ? 1 : 0) != false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v126, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v139, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v143, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v145, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIlIIIIIIIlllI(obj, this)) {
            return llllIIlllIll[1];
        }
        if (lIIlIIIIIIIllll(obj instanceof C0013j ? 1 : 0)) {
            return llllIIlllIll[2];
        }
        C0013j c0013j = (C0013j) obj;
        if (lIIlIIIIIIIllll(c0013j.a(this) ? 1 : 0)) {
            return llllIIlllIll[2];
        }
        if (lIIlIIIIIIlIIII(bd() ? 1 : 0, c0013j.bd() ? 1 : 0)) {
            return llllIIlllIll[2];
        }
        List<WorldPoint> ba = ba();
        List<WorldPoint> ba2 = c0013j.ba();
        if (lIIlIIIIIIlIIIl(ba)) {
            if (lIIlIIIIIIlIIlI(ba2)) {
                "".length();
                if (((177 ^ 162) ^ (107 ^ 124)) < " ".length()) {
                    return ((83 ^ 74) ^ (97 ^ 56)) & (((195 ^ 144) ^ (185 ^ 170)) ^ (-" ".length()));
                }
                return llllIIlllIll[2];
            }
            WorldPoint bb = bb();
            WorldPoint bb2 = c0013j.bb();
            if (lIIlIIIIIIlIIIl(bb)) {
                if (lIIlIIIIIIlIIlI(bb2)) {
                    "".length();
                    if ((65 ^ 69) <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return llllIIlllIll[2];
                }
                NPC bc = bc();
                NPC bc2 = c0013j.bc();
                if (lIIlIIIIIIlIIIl(bc)) {
                    if (lIIlIIIIIIlIIlI(bc2)) {
                        "".length();
                        if (" ".length() < 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        return llllIIlllIll[2];
                    }
                    WorldPoint be = be();
                    WorldPoint be2 = c0013j.be();
                    if (lIIlIIIIIIlIIIl(be)) {
                        if (lIIlIIIIIIlIIlI(be2)) {
                            "".length();
                            if (" ".length() <= 0) {
                                return ((173 ^ 129) ^ (32 ^ 25)) & (((41 ^ 109) ^ (116 ^ 37)) ^ (-" ".length()));
                            }
                            return llllIIlllIll[2];
                        }
                        WorldPoint bf = bf();
                        WorldPoint bf2 = c0013j.bf();
                        if (lIIlIIIIIIlIIIl(bf)) {
                            if (lIIlIIIIIIlIIlI(bf2)) {
                                "".length();
                                if (" ".length() < 0) {
                                    return ((77 ^ 101) ^ (222 ^ 182)) & (((((54 + 94) - 53) + 33) ^ (((93 + 87) - 12) + 24)) ^ (-" ".length()));
                                }
                                return llllIIlllIll[2];
                            }
                            LinkedList<WorldPoint> bg = bg();
                            LinkedList<WorldPoint> bg2 = c0013j.bg();
                            if (lIIlIIIIIIlIIIl(bg)) {
                                if (lIIlIIIIIIlIIlI(bg2)) {
                                    "".length();
                                    if (0 != 0) {
                                        return (true ^ true) & ((true ^ true) ^ true);
                                    }
                                    return llllIIlllIll[2];
                                }
                                return llllIIlllIll[1];
                            }
                        }
                    }
                }
            }
        }
    }

    public void e(NPC npc) {
        this.bK = npc;
    }

    public void v(boolean z) {
        this.bL = z;
    }

    private static boolean lIIlIIIIIIIllll(int i) {
        return i == 0;
    }

    private static String lIIlIIIIIIIIIIl(String lllllllllllllllIIlIlllIIIIllIIIl, String lllllllllllllllIIlIlllIIIIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIIllIIII.getBytes(StandardCharsets.UTF_8)), llllIIlllIll[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlllIll[7], lllllllllllllllIIlIlllIIIIllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIIIllIIlI) {
            lllllllllllllllIIlIlllIIIIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIIlIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aU() {
        if (lIIlIIIIIIIllIl(Static.getClient().getVarbitValue(llllIIlllIll[0]), llllIIlllIll[1])) {
            ?? r0 = llllIIlllIll[1];
            "".length();
            return (-" ".length()) > "  ".length() ? ((((58 + 126) - 19) + 17) ^ (((79 + 112) - 60) + 43)) & (((((74 + 6) - 51) + 162) ^ (((87 + 14) - 80) + 146)) ^ (-" ".length())) : r0;
        }
        return llllIIlllIll[2];
    }

    private static boolean lIIlIIIIIIIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public NPC aZ() {
        return a(Collections.emptySet());
    }

    public boolean bd() {
        return this.bL;
    }

    public List<WorldPoint> ba() {
        return this.bI;
    }

    static {
        lIIlIIIIIIIllII();
        lIIlIIIIIIIlIII();
        bH = llllIIlllIll[8];
        bC = llllIIlllIll[9];
        bB = llllIIlllIll[0];
        bA = LoggerFactory.getLogger(C0013j.class);
        int[] iArr = new int[llllIIlllIll[7]];
        iArr[llllIIlllIll[2]] = llllIIlllIll[10];
        iArr[llllIIlllIll[1]] = llllIIlllIll[11];
        bD = iArr;
        int[] iArr2 = new int[llllIIlllIll[7]];
        iArr2[llllIIlllIll[2]] = llllIIlllIll[12];
        iArr2[llllIIlllIll[1]] = llllIIlllIll[13];
        bE = iArr2;
        int[] iArr3 = new int[llllIIlllIll[14]];
        iArr3[llllIIlllIll[2]] = llllIIlllIll[15];
        iArr3[llllIIlllIll[1]] = llllIIlllIll[16];
        iArr3[llllIIlllIll[7]] = llllIIlllIll[17];
        iArr3[llllIIlllIll[18]] = llllIIlllIll[19];
        bF = iArr3;
        bG = new C0014k();
    }

    public LinkedList<WorldPoint> bg() {
        return this.bO;
    }

    private static boolean lIIlIIIIIIlIIII(int i, int i2) {
        return i != i2;
    }

    public static List<TileObject> aW() {
        return TileObjects.getAll(bD);
    }

    private static String lIIlIIIIIIIIIlI(String lllllllllllllllIIlIlllIIIIlllllI, String lllllllllllllllIIlIlllIIIIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIIIlIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIIIlIIIIII.init(llllIIlllIll[7], lllllllllllllllIIlIlllIIIlIIIIIl);
            return new String(lllllllllllllllIIlIlllIIIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIIIllllll) {
            lllllllllllllllIIlIlllIIIIllllll.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "NightmareManager(path=" + ba() + ", lastMeleeLocation=" + bb() + ", lastTotem=" + bc() + ", meleeShroomDodged=" + bd() + ", previousMeleeShroomLocation=" + be() + ", previousFinalPhaseLocation=" + bf() + ", meleeShroomAvoidancePath=" + bg() + ")";
    }

    public NPC aX() {
        return NPCs.getNearest(npc -> {
            if (lIIlIIIIIIlIIll(npc.getName().equalsIgnoreCase(llllIIlllIIl[llllIIlllIll[7]]) ? 1 : 0) && lIIlIIIIIIIllll(npc.isDead() ? 1 : 0)) {
                ?? r0 = llllIIlllIll[1];
                "".length();
                return ((162 ^ 166) ^ " ".length()) == 0 ? ((217 ^ 133) ^ (26 ^ 6)) & (((202 ^ 198) ^ (64 ^ 12)) ^ (-" ".length())) : r0;
            }
            return llllIIlllIll[2];
        });
    }

    private static boolean lIIlIIIIIIIllIl(int i, int i2) {
        return i == i2;
    }

    public void g(WorldPoint worldPoint) {
        this.bN = worldPoint;
    }

    public void f(WorldPoint worldPoint) {
        this.bM = worldPoint;
    }

    public NPC a(Set<NPC> set) {
        return NPCs.getNearest(npc -> {
            if (lIIlIIIIIIlIIll(npc.getName().equalsIgnoreCase(llllIIlllIIl[llllIIlllIll[2]]) ? 1 : 0) && lIIlIIIIIIIllll(npc.isDead() ? 1 : 0) && lIIlIIIIIIIllll(set.contains(npc) ? 1 : 0)) {
                ?? r0 = llllIIlllIll[1];
                "".length();
                return (((((87 + 147) - 185) + 106) ^ (((79 + 21) - (-6)) + 32)) & (((48 ^ 38) ^ (1 ^ 6)) ^ (-" ".length()))) == "  ".length() ? ((198 ^ 166) ^ (102 ^ 47)) & (((229 ^ 143) ^ (62 ^ 125)) ^ (-" ".length())) : r0;
            }
            return llllIIlllIll[2];
        });
    }

    public void a(LinkedList<WorldPoint> linkedList) {
        this.bO = linkedList;
    }

    private static void lIIlIIIIIIIllII() {
        llllIIlllIll = new int[21];
        llllIIlllIll[0] = (-((-12547) & 15743)) & (-16899) & 32510;
        llllIIlllIll[1] = " ".length();
        llllIIlllIll[2] = (65 ^ 91) & ((187 ^ 161) ^ (-1));
        llllIIlllIll[3] = (((54 + 12) - (-48)) + 67) ^ (((35 + 80) - 21) + 48);
        llllIIlllIll[4] = 201 ^ 134;
        llllIIlllIll[5] = 220 ^ 189;
        llllIIlllIll[6] = 165 ^ 142;
        llllIIlllIll[7] = "  ".length();
        llllIIlllIll[8] = (-((-265) & 31051)) & (-33) & 31231;
        llllIIlllIll[9] = (-22529) & 32678;
        llllIIlllIll[10] = (-8329) & 46073;
        llllIIlllIll[11] = (-2056) & 39799;
        llllIIlllIll[12] = (-((-4867) & 32663)) & (-1) & 65535;
        llllIIlllIll[13] = (-8325) & 46062;
        llllIIlllIll[14] = (1 ^ 8) ^ (201 ^ 196);
        llllIIlllIll[15] = 167 ^ 174;
        llllIIlllIll[16] = 51 ^ 60;
        llllIIlllIll[17] = ((213 ^ 182) & ((65 ^ 34) ^ (-1))) ^ (153 ^ 140);
        llllIIlllIll[18] = "   ".length();
        llllIIlllIll[19] = 70 ^ 93;
        llllIIlllIll[20] = 154 ^ 146;
    }

    public void e(WorldPoint worldPoint) {
        this.bJ = worldPoint;
    }

    public WorldPoint bf() {
        return this.bN;
    }

    public void d(List<WorldPoint> list) {
        this.bI = list;
    }

    private static boolean lIIlIIIIIIlIIll(int i) {
        return i != 0;
    }

    public List<TileObject> ax() {
        return TileObjects.getAll(bE);
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i2 = llllIIlllIll[3];
        int i3 = llllIIlllIll[1] * llllIIlllIll[3];
        if (lIIlIIIIIIlIIll(bd() ? 1 : 0)) {
            i = llllIIlllIll[4];
            "".length();
            if ("   ".length() == 0) {
                return (8 ^ 26) & ((96 ^ 114) ^ (-1));
            }
        } else {
            i = llllIIlllIll[5];
        }
        int i4 = i3 + i;
        List<WorldPoint> ba = ba();
        int i5 = i4 * llllIIlllIll[3];
        if (lIIlIIIIIIlIIIl(ba)) {
            hashCode = llllIIlllIll[6];
            "".length();
            if ((-"   ".length()) > 0) {
                return ((126 ^ 27) ^ (18 ^ 50)) & (((((84 + 93) - 151) + 185) ^ (((45 + 75) - (-27)) + 3)) ^ (-" ".length()));
            }
        } else {
            hashCode = ba.hashCode();
        }
        int i6 = i5 + hashCode;
        WorldPoint bb = bb();
        int i7 = i6 * llllIIlllIll[3];
        if (lIIlIIIIIIlIIIl(bb)) {
            hashCode2 = llllIIlllIll[6];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (151 ^ 160) & ((76 ^ 123) ^ (-1));
            }
        } else {
            hashCode2 = bb.hashCode();
        }
        int i8 = i7 + hashCode2;
        NPC bc = bc();
        int i9 = i8 * llllIIlllIll[3];
        if (lIIlIIIIIIlIIIl(bc)) {
            hashCode3 = llllIIlllIll[6];
            "".length();
            if (" ".length() <= 0) {
                return (168 ^ 183) & ((149 ^ 138) ^ (-1));
            }
        } else {
            hashCode3 = bc.hashCode();
        }
        int i10 = i9 + hashCode3;
        WorldPoint be = be();
        int i11 = i10 * llllIIlllIll[3];
        if (lIIlIIIIIIlIIIl(be)) {
            hashCode4 = llllIIlllIll[6];
            "".length();
            if (" ".length() != " ".length()) {
                return "  ".length() & ("  ".length() ^ (-" ".length()));
            }
        } else {
            hashCode4 = be.hashCode();
        }
        int i12 = i11 + hashCode4;
        WorldPoint bf = bf();
        int i13 = i12 * llllIIlllIll[3];
        if (lIIlIIIIIIlIIIl(bf)) {
            hashCode5 = llllIIlllIll[6];
            "".length();
            if ((-(162 ^ 167)) >= 0) {
                return (96 ^ 39) & ((86 ^ 17) ^ (-1));
            }
        } else {
            hashCode5 = bf.hashCode();
        }
        int i14 = i13 + hashCode5;
        LinkedList<WorldPoint> bg = bg();
        int i15 = i14 * llllIIlllIll[3];
        if (lIIlIIIIIIlIIIl(bg)) {
            hashCode6 = llllIIlllIll[6];
            "".length();
            if ((((220 ^ 175) ^ (162 ^ 178)) & (((132 ^ 163) ^ (214 ^ 146)) ^ (-" ".length()))) != (((155 ^ 187) ^ (54 ^ 119)) & (((73 ^ 5) ^ (33 ^ 12)) ^ (-" ".length())))) {
                return ((252 ^ 133) ^ (22 ^ 86)) & (((127 ^ 78) ^ (24 ^ 16)) ^ (-" ".length()));
            }
        } else {
            hashCode6 = bg.hashCode();
        }
        return i15 + hashCode6;
    }

    public NPC bc() {
        return this.bK;
    }

    private static boolean lIIlIIIIIIlIIlI(Object obj) {
        return obj != null;
    }

    public WorldPoint be() {
        return this.bM;
    }
}
