package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Walking to boss")
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.l  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/l.class */
public class l extends i {
    private static final /* synthetic */ int J;
    private static final /* synthetic */ int E;
    private static final /* synthetic */ RegionPoint K;
    private static final /* synthetic */ int I;
    private static final /* synthetic */ int L;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ int O;
    private static final /* synthetic */ WorldPoint C;
    private static final /* synthetic */ int P;
    private static final /* synthetic */ int F;
    private static final /* synthetic */ int G;
    private static final /* synthetic */ int N;
    private static final /* synthetic */ int M;
    private static final /* synthetic */ WorldPoint D;
    private static /* synthetic */ int[] lIlIllIllIIlI;
    private static /* synthetic */ String[] lIlIllIlIllll;

    static {
        llIIIIIlIlllllI();
        llIIIIIlIlllIll();
        L = lIlIllIllIIlI[1];
        E = lIlIllIllIIlI[2];
        P = lIlIllIllIIlI[16];
        J = lIlIllIllIIlI[10];
        M = lIlIllIllIIlI[12];
        O = lIlIllIllIIlI[15];
        H = lIlIllIllIIlI[7];
        I = lIlIllIllIIlI[9];
        N = lIlIllIllIIlI[18];
        G = lIlIllIllIIlI[5];
        F = lIlIllIllIIlI[4];
        C = new WorldPoint(lIlIllIllIIlI[19], lIlIllIllIIlI[20], lIlIllIllIIlI[0]);
        D = new WorldPoint(lIlIllIllIIlI[21], lIlIllIllIIlI[22], lIlIllIllIIlI[0]);
        K = new RegionPoint(lIlIllIllIIlI[23], lIlIllIllIIlI[24], lIlIllIllIIlI[0], lIlIllIllIIlI[10]);
    }

    private static boolean llIIIIIllIIIIIl(int i) {
        return i == 0;
    }

    private static String llIIIIIlIllIllI(String llllllllllllllIllIlIIIlIlIIlllll, String llllllllllllllIllIlIIIlIlIIllllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIlIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIIlIlIIllllI.toCharArray();
        int llllllllllllllIllIlIIIlIlIIllIll = lIlIllIllIIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIllIllIIlI[0];
        while (llIIIIIllIIIIll(i, length)) {
            char llllllllllllllIllIlIIIlIlIlIIIII = charArray2[i];
            sb.append((char) (llllllllllllllIllIlIIIlIlIlIIIII ^ charArray[llllllllllllllIllIlIIIlIlIIllIll % charArray.length]));
            "".length();
            llllllllllllllIllIlIIIlIlIIllIll++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIIIIIlIlllIII(String llllllllllllllIllIlIIIlIIllllIll, String llllllllllllllIllIlIIIlIIlllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIlIIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIlIIlllllll.init(lIlIllIllIIlI[6], secretKeySpec);
            return new String(llllllllllllllIllIlIIIlIIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIlIIllllllI) {
            llllllllllllllIllIlIIIlIIllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static String llIIIIIlIllIlll(String llllllllllllllIllIlIIIlIlIIIlIlI, String llllllllllllllIllIlIIIlIlIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIllIIlI[25]), "DES");
            Cipher llllllllllllllIllIlIIIlIlIIIllII = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlIlIIIllII.init(lIlIllIllIIlI[6], secretKeySpec);
            return new String(llllllllllllllIllIlIIIlIlIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIlIlIIIlIll) {
            llllllllllllllIllIlIIIlIlIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllIIIIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.i
    protected boolean p() {
        if (llIIIIIlIllllll(this.p.b(lIlIllIllIIlI[1]) ? 1 : 0)) {
            return lIlIllIllIIlI[0];
        }
        this.w.b(this.w.c());
        "".length();
        if (llIIIIIlIllllll(this.p.c(lIlIllIllIIlI[2]) ? 1 : 0)) {
            int[] iArr = new int[lIlIllIllIIlI[3]];
            iArr[lIlIllIllIIlI[0]] = lIlIllIllIIlI[4];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (llIIIIIllIIIIII(nearest)) {
                nearest.interact(lIlIllIlIllll[lIlIllIllIIlI[0]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (llIIIIIlIllllll(this.p.c(lIlIllIllIIlI[5]) ? 1 : 0)) {
            if (llIIIIIlIllllll(Dialog.isOpen() ? 1 : 0) && llIIIIIlIllllll(Dialog.hasOption(lIlIllIlIllll[lIlIllIllIIlI[3]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIllIllIIlI[3]];
                strArr[lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[6]];
                Dialog.chooseOption(strArr);
                "".length();
                return lIlIllIllIIlI[3];
            }
            int[] iArr2 = new int[lIlIllIllIIlI[3]];
            iArr2[lIlIllIllIIlI[0]] = lIlIllIllIIlI[7];
            TileObject nearest2 = TileObjects.getNearest(iArr2);
            if (llIIIIIllIIIIII(nearest2)) {
                nearest2.interact(lIlIllIlIllll[lIlIllIllIIlI[8]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (!llIIIIIllIIIIIl(this.p.c(lIlIllIllIIlI[9]) ? 1 : 0) || llIIIIIlIllllll(this.p.c(lIlIllIllIIlI[10]) ? 1 : 0)) {
            Movement.setDestination(this.p.a(K));
            return lIlIllIllIIlI[3];
        }
        String[] strArr2 = new String[lIlIllIllIIlI[3]];
        strArr2[lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[11]];
        if (llIIIIIlIllllll(Inventory.contains(strArr2) ? 1 : 0) && llIIIIIllIIIIlI(Vars.getBit(lIlIllIllIIlI[12]), lIlIllIllIIlI[3])) {
            if (llIIIIIlIllllll(Dialog.isOpen() ? 1 : 0) && llIIIIIlIllllll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption(lIlIllIllIIlI[11]);
                "".length();
            }
            String[] strArr3 = new String[lIlIllIllIIlI[3]];
            strArr3[lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[13]];
            Inventory.getFirst(strArr3).interact(lIlIllIlIllll[lIlIllIllIIlI[14]]);
            return lIlIllIllIIlI[3];
        }
        if (llIIIIIlIllllll(this.p.c(lIlIllIllIIlI[15]) ? 1 : 0)) {
            int[] iArr3 = new int[lIlIllIllIIlI[3]];
            iArr3[lIlIllIllIIlI[0]] = lIlIllIllIIlI[16];
            TileObject nearest3 = TileObjects.getNearest(iArr3);
            if (llIIIIIllIIIIII(nearest3)) {
                nearest3.interact(lIlIllIlIllll[lIlIllIllIIlI[17]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (!llIIIIIllIIIIIl(C.isInScene(this.j) ? 1 : 0) || llIIIIIlIllllll(this.p.b(lIlIllIllIIlI[18]) ? 1 : 0)) {
            Movement.walkTo(D);
            "".length();
            return lIlIllIllIIlI[3];
        }
        Movement.walkTo(C);
        "".length();
        return lIlIllIllIIlI[3];
    }

    private static boolean llIIIIIlIllllll(int i) {
        return i != 0;
    }

    private static void llIIIIIlIlllllI() {
        lIlIllIllIIlI = new int[26];
        lIlIllIllIIlI[0] = ((((72 + 30) - (-24)) + 103) ^ (((88 + 97) - 21) + 11)) & (((162 ^ 142) ^ (124 ^ 26)) ^ (-" ".length()));
        lIlIllIllIIlI[1] = (-((-4409) & 22974)) & (-281) & 28159;
        lIlIllIllIIlI[2] = (-20513) & 32123;
        lIlIllIllIIlI[3] = " ".length();
        lIlIllIllIIlI[4] = (-5177) & 54653;
        lIlIllIllIIlI[5] = (-18196) & 28535;
        lIlIllIllIIlI[6] = "  ".length();
        lIlIllIllIIlI[7] = (-15393) & 64871;
        lIlIllIllIIlI[8] = "   ".length();
        lIlIllIllIIlI[9] = (-((-11317) & 28343)) & (-4121) & 31742;
        lIlIllIllIIlI[10] = (-((-291) & 4539)) & (-17925) & 32767;
        lIlIllIllIIlI[11] = (206 ^ 178) ^ (4 ^ 124);
        lIlIllIllIIlI[12] = (-(41 ^ 116)) & (-1) & 15231;
        lIlIllIllIIlI[13] = (((103 + 139) - 131) + 39) ^ (((52 + 145) - 162) + 112);
        lIlIllIllIIlI[14] = 115 ^ 117;
        lIlIllIllIIlI[15] = (-20163) & 32506;
        lIlIllIllIIlI[16] = (-169) & 26813;
        lIlIllIllIIlI[17] = 149 ^ 146;
        lIlIllIllIIlI[18] = (-((-10830) & 11247)) & (-16385) & 28667;
        lIlIllIllIIlI[19] = (-((-19466) & 31755)) & (-16449) & 31735;
        lIlIllIllIIlI[20] = (-((-3517) & 16318)) & (-16465) & 32759;
        lIlIllIllIIlI[21] = (-((-16967) & 30423)) & (-16385) & 32762;
        lIlIllIllIIlI[22] = (-16697) & 22521;
        lIlIllIllIIlI[23] = 61 ^ 29;
        lIlIllIllIIlI[24] = (243 ^ 161) ^ (28 ^ 105);
        lIlIllIllIIlI[25] = 63 ^ 55;
    }

    private static void llIIIIIlIlllIll() {
        lIlIllIlIllll = new String[lIlIllIllIIlI[25]];
        lIlIllIlIllll[lIlIllIllIIlI[0]] = llIIIIIlIllIllI("NgMbOztYHR0mPA==", "uorVY");
        lIlIllIlIllll[lIlIllIllIIlI[3]] = llIIIIIlIllIlll("gMwnf7WOqC3YkK9KEmsNQw==", "cMbla");
        lIlIllIlIllll[lIlIllIllIIlI[6]] = llIIIIIlIlllIII("eXwQzj0x2w1Wns4PIdBxQQ==", "xWdEH");
        lIlIllIlIllll[lIlIllIllIIlI[8]] = llIIIIIlIllIllI("BRI0", "PaQWA");
        lIlIllIlIllll[lIlIllIllIIlI[11]] = llIIIIIlIllIllI("PTsDFEgANE0AAA42AgQb", "oRmsh");
        lIlIllIlIllll[lIlIllIllIIlI[13]] = llIIIIIlIllIllI("HiMjE1gjLG0HEC0uIgML", "LJMtx");
        lIlIllIlIllll[lIlIllIllIIlI[14]] = llIIIIIlIllIlll("TrA2jfzIgVqgQXRA/8+FJg==", "FLXJt");
        lIlIllIlIllll[lIlIllIllIIlI[17]] = llIIIIIlIlllIII("IxSJbNyrcCU=", "RmXTZ");
    }

    private static boolean llIIIIIllIIIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.i
    public boolean run() {
        return llIIIIIlIllllll(this.f.b() ? 1 : 0) ? lIlIllIllIIlI[0] : p();
    }
}
