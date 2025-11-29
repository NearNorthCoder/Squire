package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Controlling Temperature", priority = 2147483297, blocking = true)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.p  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/p.class */
public class p extends Task {
    private static /* synthetic */ int[] llIlIllIIlIl;
    public static final /* synthetic */ int ag;
    private static final /* synthetic */ int ak;
    private static /* synthetic */ String[] llIlIllIIlII;
    private final /* synthetic */ SquireGiantsFoundry af;
    private static final /* synthetic */ int al;
    private static final /* synthetic */ int ah;
    private static final /* synthetic */ int ai;
    private static final /* synthetic */ int aj;
    private /* synthetic */ boolean ao;
    private /* synthetic */ TileObject an;
    private final /* synthetic */ a am;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected boolean a(TileObject tileObject) {
        WorldPoint destination = Movement.getDestination();
        if (!lIIIIIlllIIllIl(destination) || lIIIIIlllIIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        WorldArea worldArea = tileObject.getWorldLocation().toWorldArea();
        if (!lIIIIIlllIIlIlI(worldArea.contains(destination) ? 1 : 0) || lIIIIIlllIIlIIl(worldArea.isInMeleeDistance(destination) ? 1 : 0)) {
            ?? r0 = llIlIllIIlIl[3];
            "".length();
            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIllIIlIl[0];
    }

    private static void lIIIIIlllIIlIII() {
        llIlIllIIlIl = new int[13];
        llIlIllIIlIl[0] = (51 ^ 2) & ((145 ^ 160) ^ (-1));
        llIlIllIIlIl[1] = -" ".length();
        llIlIllIIlIl[2] = 68 ^ 65;
        llIlIllIIlIl[3] = " ".length();
        llIlIllIIlIl[4] = (-16772) & 61403;
        llIlIllIIlIl[5] = 130 ^ 150;
        llIlIllIIlIl[6] = (-((-11143) & 31663)) & (-257) & 65407;
        llIlIllIIlIl[7] = 180 ^ 173;
        llIlIllIIlIl[8] = "  ".length();
        llIlIllIIlIl[9] = "   ".length();
        llIlIllIIlIl[10] = (-((-12849) & 32369)) & (-12417) & 32763;
        llIlIllIIlIl[11] = (-5179) & 6010;
        llIlIllIIlIl[12] = (232 ^ 162) ^ (247 ^ 185);
    }

    private static boolean lIIIIIlllIIlllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIIlllIIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIIlllIIllIl(Object obj) {
        return obj != null;
    }

    private static String lIIIIIlllIIIllI(String lllllllllllllllIlIIIIIlllIIIIIlI, String lllllllllllllllIlIIIIIlllIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIlllIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIlllIIIIlII.init(llIlIllIIlIl[8], secretKeySpec);
            return new String(lllllllllllllllIlIIIIIlllIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlllIIIIIll) {
            lllllllllllllllIlIIIIIlllIIIIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public p(SquireGiantsFoundry squireGiantsFoundry, a aVar) {
        this.af = squireGiantsFoundry;
        this.am = aVar;
    }

    static {
        lIIIIIlllIIlIII();
        lIIIIIlllIIIlll();
        ag = llIlIllIIlIl[5];
        ak = llIlIllIIlIl[10];
        ah = llIlIllIIlIl[6];
        ai = llIlIllIIlIl[4];
        al = llIlIllIIlIl[7];
        aj = llIlIllIIlIl[11];
    }

    private static String lIIIIIlllIIIlIl(String lllllllllllllllIlIIIIIllIlllIIlI, String lllllllllllllllIlIIIIIllIlllIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIllIlllIIII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIIIllIlllIIIl.toCharArray();
        int lllllllllllllllIlIIIIIllIllIlllI = llIlIllIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIllIIlIl[0];
        while (lIIIIIlllIIllll(i, length)) {
            char lllllllllllllllIlIIIIIllIlllIIll = charArray2[i];
            lllllllllllllllIlIIIIIllIlllIIII.append((char) (lllllllllllllllIlIIIIIllIlllIIll ^ charArray[lllllllllllllllIlIIIIIllIllIlllI % charArray.length]));
            "".length();
            lllllllllllllllIlIIIIIllIllIlllI++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIIIllIlllIIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    public boolean run() {
        boolean a;
        if (!lIIIIIlllIIlIIl(this.af.c() ? 1 : 0) && !lIIIIIlllIIlIlI(this.am.f() ? 1 : 0) && !lIIIIIlllIIlIll(this.am.m(), llIlIllIIlIl[1])) {
            if (lIIIIIlllIIllII(this.an) && lIIIIIlllIIlIIl(this.am.n() ? 1 : 0)) {
                return llIlIllIIlIl[0];
            }
            int m = this.am.m();
            int l = this.am.l();
            if (lIIIIIlllIIllIl(this.an) && lIIIIIlllIIlllI(Math.abs(m - l), llIlIllIIlIl[2]) && lIIIIIlllIIlIIl(this.am.n() ? 1 : 0)) {
                this.an = null;
                this.ao = llIlIllIIlIl[0];
                Movement.setDestination(Players.getLocal().getWorldLocation());
                return llIlIllIIlIl[3];
            } else if (lIIIIIlllIIllIl(this.an) && lIIIIIlllIIlIIl(a(this.an) ? 1 : 0)) {
                return llIlIllIIlIl[3];
            } else {
                int i = llIlIllIIlIl[0];
                if (lIIIIIlllIIllll(l, m)) {
                    a = b(l, m);
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    a = a(l, m);
                }
                return a;
            }
        }
        return llIlIllIIlIl[0];
    }

    private static boolean lIIIIIlllIlIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private boolean a(int i, int i2) {
        int i3;
        String str;
        boolean z;
        int i4 = i - i2;
        int[] iArr = new int[llIlIllIIlIl[3]];
        iArr[llIlIllIIlIl[0]] = llIlIllIIlIl[4];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIIIIlllIIllII(nearest)) {
            return llIlIllIIlIl[0];
        }
        boolean z2 = this.ao;
        if (lIIIIIlllIlIIII(i4, llIlIllIIlIl[5])) {
            i3 = llIlIllIIlIl[3];
            "".length();
            if ((((((147 + 154) - 215) + 139) ^ (((3 + 130) - 118) + 176)) & (((126 ^ 93) ^ (103 ^ 26)) ^ (-" ".length()))) > 0) {
                return ((10 ^ 90) ^ (29 ^ 87)) & (((((104 + 157) - 208) + 116) ^ (((22 + 18) - (-75)) + 64)) ^ (-" ".length()));
            }
        } else {
            i3 = llIlIllIIlIl[0];
        }
        if (lIIIIIlllIIlIll(z2 ? 1 : 0, i3) && lIIIIIlllIlIIIl(this.an, nearest)) {
            return llIlIllIIlIl[3];
        }
        if (lIIIIIlllIlIIII(i4, llIlIllIIlIl[5])) {
            str = llIlIllIIlII[llIlIllIIlIl[0]];
            "".length();
            if (0 != 0) {
                return ((74 ^ 71) ^ (4 ^ 21)) & (((212 ^ 191) ^ (183 ^ 192)) ^ (-" ".length()));
            }
        } else {
            str = llIlIllIIlII[llIlIllIIlIl[3]];
        }
        nearest.interact(str);
        this.an = nearest;
        if (lIIIIIlllIlIIII(i4, llIlIllIIlIl[5])) {
            int i5 = llIlIllIIlIl[3];
            "".length();
            z = i5;
            if ("   ".length() != "   ".length()) {
                return ((76 ^ 121) ^ (72 ^ 39)) & (((((124 + 233) - 146) + 34) ^ (((57 + 160) - 117) + 75)) ^ (-" ".length()));
            }
        } else {
            z = llIlIllIIlIl[0];
        }
        this.ao = z;
        return llIlIllIIlIl[3];
    }

    private static boolean lIIIIIlllIIllll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private boolean b(int i, int i2) {
        int i3;
        boolean z;
        String str;
        int i4 = i2 - i;
        int[] iArr = new int[llIlIllIIlIl[3]];
        iArr[llIlIllIIlIl[0]] = llIlIllIIlIl[6];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIIIIlllIIllII(nearest)) {
            return llIlIllIIlIl[0];
        }
        boolean z2 = this.ao;
        if (lIIIIIlllIlIIII(i4, llIlIllIIlIl[7])) {
            i3 = llIlIllIIlIl[3];
            "".length();
            if ("  ".length() <= 0) {
                return "  ".length() & ("  ".length() ^ (-1));
            }
        } else {
            i3 = llIlIllIIlIl[0];
        }
        if (lIIIIIlllIIlIll(z2 ? 1 : 0, i3) && lIIIIIlllIlIIIl(this.an, nearest)) {
            return llIlIllIIlIl[3];
        }
        if (lIIIIIlllIlIIII(i4, llIlIllIIlIl[7])) {
            int i5 = llIlIllIIlIl[3];
            "".length();
            z = i5;
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            z = llIlIllIIlIl[0];
        }
        this.ao = z;
        if (lIIIIIlllIlIIII(i4, llIlIllIIlIl[7])) {
            str = llIlIllIIlII[llIlIllIIlIl[8]];
            "".length();
            if (0 != 0) {
                return ((((189 + 130) - 294) + 219) ^ (((64 + 83) - 66) + 67)) & (((90 ^ 82) ^ (253 ^ 149)) ^ (-" ".length()));
            }
        } else {
            str = llIlIllIIlII[llIlIllIIlIl[9]];
        }
        nearest.interact(str);
        this.an = nearest;
        return llIlIllIIlIl[3];
    }

    private static boolean lIIIIIlllIIlIlI(int i) {
        return i == 0;
    }

    private static void lIIIIIlllIIIlll() {
        llIlIllIIlII = new String[llIlIllIIlIl[12]];
        llIlIllIIlII[llIlIllIIlIl[0]] = lIIIIIlllIIIlIl("MhcHFBQLTxIIEgUNEBc=", "cbbzw");
        llIlIllIIlII[llIlIllIIlIl[3]] = lIIIIIlllIIIlIl("NgcmCmUFGiwAJwcF", "uhIfH");
        llIlIllIIlII[llIlIllIIlIl[8]] = lIIIIIlllIIIllI("ynOhsfJeUAGlakivL+FAdw==", "CFjYg");
        llIlIllIIlII[llIlIllIIlIl[9]] = lIIIIIlllIIIllI("D2oDUVZYutmsuSCNjAIZkg==", "wvhzW");
    }

    private static boolean lIIIIIlllIIllII(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIlllIlIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIIIlllIIlIll(int i, int i2) {
        return i == i2;
    }
}
