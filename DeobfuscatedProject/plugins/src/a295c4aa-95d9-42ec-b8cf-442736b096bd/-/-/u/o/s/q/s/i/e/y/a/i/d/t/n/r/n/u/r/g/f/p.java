/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
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

@TaskDesc(name="Controlling Temperature", priority=2147483297, blocking=true)
public class p
extends Task {
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

    /*
     * WARNING - void declaration
     */
    protected boolean a(TileObject tileObject) {
        boolean bl;
        void lllllllllllllllIlIIIIIlllIIIlIll;
        void lllllllllllllllIlIIIIIlllIIIllII;
        WorldPoint worldPoint = Movement.getDestination();
        if (!p.lIIIIIlllIIllIl(worldPoint) || p.lIIIIIlllIIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        WorldArea lllllllllllllllIlIIIIIlllIIIlIlI = lllllllllllllllIlIIIIIlllIIIllII.getWorldLocation().toWorldArea();
        if (!p.lIIIIIlllIIlIlI(lllllllllllllllIlIIIIIlllIIIlIlI.contains((WorldPoint)lllllllllllllllIlIIIIIlllIIIlIll) ? 1 : 0) || p.lIIIIIlllIIlIIl(lllllllllllllllIlIIIIIlllIIIlIlI.isInMeleeDistance((WorldPoint)lllllllllllllllIlIIIIIlllIIIlIll) ? 1 : 0)) {
            bl = llIlIllIIlIl[3];
            "".length();
            if (-"  ".length() > 0) {
                return ((0x8C ^ 0x95) & ~(0xA1 ^ 0xB8)) != 0;
            }
        } else {
            bl = llIlIllIIlIl[0];
        }
        return bl;
    }

    private static void lIIIIIlllIIlIII() {
        llIlIllIIlIl = new int[13];
        p.llIlIllIIlIl[0] = (0x33 ^ 2) & ~(0x91 ^ 0xA0);
        p.llIlIllIIlIl[1] = -" ".length();
        p.llIlIllIIlIl[2] = 0x44 ^ 0x41;
        p.llIlIllIIlIl[3] = " ".length();
        p.llIlIllIIlIl[4] = 0xFFFFBE7C & 0xEFDB;
        p.llIlIllIIlIl[5] = 0x82 ^ 0x96;
        p.llIlIllIIlIl[6] = -(0xFFFFD479 & 0x7BAF) & (0xFFFFFEFF & 0xFF7F);
        p.llIlIllIIlIl[7] = 0xB4 ^ 0xAD;
        p.llIlIllIIlIl[8] = "  ".length();
        p.llIlIllIIlIl[9] = "   ".length();
        p.llIlIllIIlIl[10] = -(0xFFFFCDCF & 0x7E71) & (0xFFFFCF7F & 0x7FFB);
        p.llIlIllIIlIl[11] = 0xFFFFEBC5 & 0x177A;
        p.llIlIllIIlIl[12] = 0xE8 ^ 0xA2 ^ (0xF7 ^ 0xB9);
    }

    private static boolean lIIIIIlllIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIlllIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlllIIllIl(Object object) {
        return object != null;
    }

    private static String lIIIIIlllIIIllI(String lllllllllllllllIlIIIIIlllIIIIIlI, String lllllllllllllllIlIIIIIllIlllllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlllIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIlllIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIlllIIIIlII.init(llIlIllIIlIl[8], lllllllllllllllIlIIIIIlllIIIIlIl);
            return new String(lllllllllllllllIlIIIIIlllIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIlllIIIIIll) {
            lllllllllllllllIlIIIIIlllIIIIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public p(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.af = squireGiantsFoundry;
        this.am = a2;
    }

    static {
        p.lIIIIIlllIIlIII();
        p.lIIIIIlllIIIlll();
        ag = llIlIllIIlIl[5];
        ak = llIlIllIIlIl[10];
        ah = llIlIllIIlIl[6];
        ai = llIlIllIIlIl[4];
        al = llIlIllIIlIl[7];
        aj = llIlIllIIlIl[11];
    }

    private static String lIIIIIlllIIIlIl(String lllllllllllllllIlIIIIIllIlllIIlI, String lllllllllllllllIlIIIIIllIllIllII) {
        lllllllllllllllIlIIIIIllIlllIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIllIlllIIII = new StringBuilder();
        char[] lllllllllllllllIlIIIIIllIllIllll = lllllllllllllllIlIIIIIllIllIllII.toCharArray();
        int lllllllllllllllIlIIIIIllIllIlllI = llIlIllIIlIl[0];
        char[] lllllllllllllllIlIIIIIllIllIlIII = lllllllllllllllIlIIIIIllIlllIIlI.toCharArray();
        int lllllllllllllllIlIIIIIllIllIIlll = lllllllllllllllIlIIIIIllIllIlIII.length;
        int lllllllllllllllIlIIIIIllIllIIllI = llIlIllIIlIl[0];
        while (p.lIIIIIlllIIllll(lllllllllllllllIlIIIIIllIllIIllI, lllllllllllllllIlIIIIIllIllIIlll)) {
            char lllllllllllllllIlIIIIIllIlllIIll = lllllllllllllllIlIIIIIllIllIlIII[lllllllllllllllIlIIIIIllIllIIllI];
            lllllllllllllllIlIIIIIllIlllIIII.append((char)(lllllllllllllllIlIIIIIllIlllIIll ^ lllllllllllllllIlIIIIIllIllIllll[lllllllllllllllIlIIIIIllIllIlllI % lllllllllllllllIlIIIIIllIllIllll.length]));
            "".length();
            ++lllllllllllllllIlIIIIIllIllIlllI;
            ++lllllllllllllllIlIIIIIllIllIIllI;
            "".length();
            if ((0x14 ^ 0x11) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIIIllIlllIIII);
    }

    public boolean run() {
        boolean bl;
        p lllllllllllllllIlIIIIIlllIlIIlll;
        if (p.lIIIIIlllIIlIIl(this.af.c() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIlI(lllllllllllllllIlIIIIIlllIlIIlll.am.f() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(lllllllllllllllIlIIIIIlllIlIIlll.am.m(), llIlIllIIlIl[1])) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIllII(lllllllllllllllIlIIIIIlllIlIIlll.an) && p.lIIIIIlllIIlIIl(lllllllllllllllIlIIIIIlllIlIIlll.am.n() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        int lllllllllllllllIlIIIIIlllIlIIllI = lllllllllllllllIlIIIIIlllIlIIlll.am.m();
        int lllllllllllllllIlIIIIIlllIlIIlIl = lllllllllllllllIlIIIIIlllIlIIlll.am.l();
        if (p.lIIIIIlllIIllIl(lllllllllllllllIlIIIIIlllIlIIlll.an) && p.lIIIIIlllIIlllI(Math.abs(lllllllllllllllIlIIIIIlllIlIIllI - lllllllllllllllIlIIIIIlllIlIIlIl), llIlIllIIlIl[2]) && p.lIIIIIlllIIlIIl(lllllllllllllllIlIIIIIlllIlIIlll.am.n() ? 1 : 0)) {
            lllllllllllllllIlIIIIIlllIlIIlll.an = null;
            lllllllllllllllIlIIIIIlllIlIIlll.ao = llIlIllIIlIl[0];
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIIllIl(lllllllllllllllIlIIIIIlllIlIIlll.an) && p.lIIIIIlllIIlIIl(lllllllllllllllIlIIIIIlllIlIIlll.a(lllllllllllllllIlIIIIIlllIlIIlll.an) ? 1 : 0)) {
            return llIlIllIIlIl[3];
        }
        int lllllllllllllllIlIIIIIlllIlIIlII = llIlIllIIlIl[0];
        if (p.lIIIIIlllIIllll(lllllllllllllllIlIIIIIlllIlIIlIl, lllllllllllllllIlIIIIIlllIlIIllI)) {
            lllllllllllllllIlIIIIIlllIlIIlII = lllllllllllllllIlIIIIIlllIlIIlll.b(lllllllllllllllIlIIIIIlllIlIIlIl, lllllllllllllllIlIIIIIlllIlIIllI) ? 1 : 0;
            "".length();
            if ("  ".length() > "  ".length()) {
                return ((0x2E ^ 0x72) & ~(0x71 ^ 0x2D)) != 0;
            }
        } else {
            bl = lllllllllllllllIlIIIIIlllIlIIlll.a(lllllllllllllllIlIIIIIlllIlIIlIl, lllllllllllllllIlIIIIIlllIlIIllI);
        }
        return bl;
    }

    private static boolean lIIIIIlllIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3) {
        int n4;
        String string;
        void lllllllllllllllIlIIIIIlllIIllIlI;
        int n5;
        void lllllllllllllllIlIIIIIlllIIllIll;
        p lllllllllllllllIlIIIIIlllIIllllI;
        int n6 = n2 - n3;
        int[] nArray = new int[llIlIllIIlIl[3]];
        nArray[p.llIlIllIIlIl[0]] = llIlIllIIlIl[4];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (p.lIIIIIlllIIllII(tileObject)) {
            return llIlIllIIlIl[0];
        }
        int n7 = lllllllllllllllIlIIIIIlllIIllllI.ao;
        if (p.lIIIIIlllIlIIII((int)lllllllllllllllIlIIIIIlllIIllIll, llIlIllIIlIl[5])) {
            n5 = llIlIllIIlIl[3];
            "".length();
            if (((147 + 154 - 215 + 139 ^ 3 + 130 - 118 + 176) & (0x7E ^ 0x5D ^ (0x67 ^ 0x1A) ^ -" ".length())) > 0) {
                return ((0xA ^ 0x5A ^ (0x1D ^ 0x57)) & (104 + 157 - 208 + 116 ^ 22 + 18 - -75 + 64 ^ -" ".length())) != 0;
            }
        } else {
            n5 = llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(n7, n5) && p.lIIIIIlllIlIIIl(lllllllllllllllIlIIIIIlllIIllllI.an, lllllllllllllllIlIIIIIlllIIllIlI)) {
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIlIIII((int)lllllllllllllllIlIIIIIlllIIllIll, llIlIllIIlIl[5])) {
            string = llIlIllIIlII[llIlIllIIlIl[0]];
            "".length();
            if (null != null) {
                return ((0x4A ^ 0x47 ^ (4 ^ 0x15)) & (0xD4 ^ 0xBF ^ (0xB7 ^ 0xC0) ^ -" ".length())) != 0;
            }
        } else {
            string = llIlIllIIlII[llIlIllIIlIl[3]];
        }
        lllllllllllllllIlIIIIIlllIIllIlI.interact(string);
        lllllllllllllllIlIIIIIlllIIllllI.an = lllllllllllllllIlIIIIIlllIIllIlI;
        if (p.lIIIIIlllIlIIII((int)lllllllllllllllIlIIIIIlllIIllIll, llIlIllIIlIl[5])) {
            n4 = llIlIllIIlIl[3];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x4C ^ 0x79 ^ (0x48 ^ 0x27)) & (124 + 233 - 146 + 34 ^ 57 + 160 - 117 + 75 ^ -" ".length())) != 0;
            }
        } else {
            n4 = llIlIllIIlIl[0];
        }
        lllllllllllllllIlIIIIIlllIIllllI.ao = n4;
        return llIlIllIIlIl[3];
    }

    private static boolean lIIIIIlllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(int n2, int n3) {
        String string;
        int n4;
        void lllllllllllllllIlIIIIIlllIIlIIII;
        int n5;
        void lllllllllllllllIlIIIIIlllIIlIIIl;
        p lllllllllllllllIlIIIIIlllIIlIlII;
        int n6 = n3 - n2;
        int[] nArray = new int[llIlIllIIlIl[3]];
        nArray[p.llIlIllIIlIl[0]] = llIlIllIIlIl[6];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (p.lIIIIIlllIIllII(tileObject)) {
            return llIlIllIIlIl[0];
        }
        int n7 = lllllllllllllllIlIIIIIlllIIlIlII.ao;
        if (p.lIIIIIlllIlIIII((int)lllllllllllllllIlIIIIIlllIIlIIIl, llIlIllIIlIl[7])) {
            n5 = llIlIllIIlIl[3];
            "".length();
            if ("  ".length() <= 0) {
                return ("  ".length() & ~"  ".length()) != 0;
            }
        } else {
            n5 = llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(n7, n5) && p.lIIIIIlllIlIIIl(lllllllllllllllIlIIIIIlllIIlIlII.an, lllllllllllllllIlIIIIIlllIIlIIII)) {
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIlIIII((int)lllllllllllllllIlIIIIIlllIIlIIIl, llIlIllIIlIl[7])) {
            n4 = llIlIllIIlIl[3];
            "".length();
            if (((0xB2 ^ 0xAA) & ~(0xAE ^ 0xB6)) != ((0x74 ^ 0x34) & ~(0x61 ^ 0x21))) {
                return ((0x53 ^ 0x57) & ~(1 ^ 5)) != 0;
            }
        } else {
            lllllllllllllllIlIIIIIlllIIlIlII.ao = llIlIllIIlIl[0];
            n4 = lllllllllllllllIlIIIIIlllIIlIlII.ao ? 1 : 0;
        }
        if (p.lIIIIIlllIlIIII((int)lllllllllllllllIlIIIIIlllIIlIIIl, llIlIllIIlIl[7])) {
            string = llIlIllIIlII[llIlIllIIlIl[8]];
            "".length();
            if (null != null) {
                return ((189 + 130 - 294 + 219 ^ 64 + 83 - 66 + 67) & (0x5A ^ 0x52 ^ (0xFD ^ 0x95) ^ -" ".length())) != 0;
            }
        } else {
            string = llIlIllIIlII[llIlIllIIlIl[9]];
        }
        lllllllllllllllIlIIIIIlllIIlIIII.interact(string);
        this.an = tileObject;
        return llIlIllIIlIl[3];
    }

    private static boolean lIIIIIlllIIlIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIlllIIIlll() {
        llIlIllIIlII = new String[llIlIllIIlIl[12]];
        p.llIlIllIIlII[p.llIlIllIIlIl[0]] = p.lIIIIIlllIIIlIl("MhcHFBQLTxIIEgUNEBc=", "cbbzw");
        p.llIlIllIIlII[p.llIlIllIIlIl[3]] = p.lIIIIIlllIIIlIl("NgcmCmUFGiwAJwcF", "uhIfH");
        p.llIlIllIIlII[p.llIlIllIIlIl[8]] = p.lIIIIIlllIIIllI("ynOhsfJeUAGlakivL+FAdw==", "CFjYg");
        p.llIlIllIIlII[p.llIlIllIIlIl[9]] = p.lIIIIIlllIIIllI("D2oDUVZYutmsuSCNjAIZkg==", "wvhzW");
    }

    private static boolean lIIIIIlllIIllII(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlllIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIlllIIlIll(int n2, int n3) {
        return n2 == n3;
    }
}

