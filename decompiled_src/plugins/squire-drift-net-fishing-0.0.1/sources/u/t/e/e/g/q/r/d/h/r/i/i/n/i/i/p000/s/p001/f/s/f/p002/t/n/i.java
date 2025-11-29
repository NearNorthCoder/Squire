package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Removing net", priority = 10, blocking = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.i  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/i.class */
public class i extends Task {
    private static final /* synthetic */ int J;
    private static /* synthetic */ int[] lIlIIIIlIIlI;
    private static final /* synthetic */ int N;
    private static final /* synthetic */ int M;
    private static final /* synthetic */ int L;
    private static /* synthetic */ String[] lIlIIIIlIIIl;
    private final /* synthetic */ Client P;
    private final /* synthetic */ SquireDriftNet O;
    private static final /* synthetic */ int K;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ int I;

    private static boolean llIlIIllllllII(Object obj) {
        return obj != null;
    }

    private static String llIlIIllllIIll(String lllllllllllllllIlllIIlllIIllIIll, String lllllllllllllllIlllIIlllIIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIlIIlI[4], lllllllllllllllIlllIIlllIIllIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllIIllIlII) {
            lllllllllllllllIlllIIlllIIllIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    public i(SquireDriftNet squireDriftNet, Client client) {
        this.O = squireDriftNet;
        this.P = client;
    }

    private static boolean llIlIIlllllIll(int i, int i2) {
        return i == i2;
    }

    private static void llIlIIllllIlll() {
        lIlIIIIlIIlI = new int[14];
        lIlIIIIlIIlI[0] = (8 ^ 14) & ((94 ^ 88) ^ (-1));
        lIlIIIIlIIlI[1] = (-24843) & 30655;
        lIlIIIIlIIlI[2] = (-((-543) & 27167)) & (-1) & 32439;
        lIlIIIIlIIlI[3] = (-((-4383) & 23871)) & (-8321) & 28415;
        lIlIIIIlIIlI[4] = "  ".length();
        lIlIIIIlIIlI[5] = (81 ^ 61) ^ (243 ^ 146);
        lIlIIIIlIIlI[6] = (22 ^ 98) ^ (187 ^ 197);
        lIlIIIIlIIlI[7] = " ".length();
        lIlIIIIlIIlI[8] = "   ".length();
        lIlIIIIlIIlI[9] = (175 ^ 198) ^ (73 ^ 39);
        lIlIIIIlIIlI[10] = 61 ^ 57;
        lIlIIIIlIIlI[11] = 95 ^ 90;
        lIlIIIIlIIlI[12] = 10 ^ 12;
        lIlIIIIlIIlI[13] = 67 ^ 75;
    }

    private static boolean llIlIIlllllIII(int i) {
        return i == 0;
    }

    private static boolean llIlIIlllllllI(int i, int i2) {
        return i < i2;
    }

    static {
        llIlIIllllIlll();
        llIlIIllllIllI();
        J = lIlIIIIlIIlI[3];
        H = lIlIIIIlIIlI[1];
        M = lIlIIIIlIIlI[5];
        N = lIlIIIIlIIlI[9];
        K = lIlIIIIlIIlI[4];
        L = lIlIIIIlIIlI[5];
        I = lIlIIIIlIIlI[2];
    }

    private static boolean llIlIIllllllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    public boolean run() {
        if (llIlIIlllllIII(this.P.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIlIIlI[0];
        }
        int varbitValue = Static.getClient().getVarbitValue(lIlIIIIlIIlI[1]);
        int varbitValue2 = Static.getClient().getVarbitValue(lIlIIIIlIIlI[2]);
        Widget widget = Widgets.get(lIlIIIIlIIlI[3], lIlIIIIlIIlI[4], lIlIIIIlIIlI[5]);
        if (llIlIIlllllIIl(widget)) {
            if (!llIlIIlllllIlI(varbitValue, lIlIIIIlIIlI[6]) || llIlIIlllllIll(varbitValue2, lIlIIIIlIIlI[6])) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (llIlIIllllllIl(tileObject.getName().equals(lIlIIIIlIIIl[lIlIIIIlIIlI[12]]) ? 1 : 0)) {
                        String[] strArr = new String[lIlIIIIlIIlI[7]];
                        strArr[lIlIIIIlIIlI[0]] = lIlIIIIlIIIl[lIlIIIIlIIlI[9]];
                        if (llIlIIllllllIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = lIlIIIIlIIlI[7];
                            "".length();
                            return ((94 ^ 16) & ((78 ^ 0) ^ (-1))) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIlIIIIlIIlI[0];
                });
                if (llIlIIllllllII(nearest)) {
                    nearest.interact(lIlIIIIlIIIl[lIlIIIIlIIlI[0]]);
                    return lIlIIIIlIIlI[7];
                }
            }
            return lIlIIIIlIIlI[0];
        }
        Widget widget2 = Widgets.get(lIlIIIIlIIlI[3], lIlIIIIlIIlI[5]);
        if (llIlIIllllllII(widget2) && llIlIIllllllIl(widget2.isVisible() ? 1 : 0)) {
            widget2.interact(lIlIIIIlIIIl[lIlIIIIlIIlI[7]]);
            System.out.println(lIlIIIIlIIIl[lIlIIIIlIIlI[4]]);
            this.O.a((boolean) lIlIIIIlIIlI[7]);
            widget.interact(lIlIIIIlIIIl[lIlIIIIlIIlI[8]]);
            return lIlIIIIlIIlI[7];
        }
        Widget widget3 = Widgets.get(lIlIIIIlIIlI[3], lIlIIIIlIIlI[9]);
        if (llIlIIllllllII(widget3)) {
            System.out.println(lIlIIIIlIIIl[lIlIIIIlIIlI[10]]);
            widget3.interact(lIlIIIIlIIIl[lIlIIIIlIIlI[11]]);
            return lIlIIIIlIIlI[7];
        }
        return lIlIIIIlIIlI[0];
    }

    private static boolean llIlIIlllllIIl(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIlllllIlI(int i, int i2) {
        return i != i2;
    }

    private static void llIlIIllllIllI() {
        lIlIIIIlIIIl = new String[lIlIIIIlIIlI[13]];
        lIlIIIIlIIIl[lIlIIIIlIIlI[0]] = llIlIIlllIllII("/WbkiCXdq3c=", "YOwsP");
        lIlIIIIlIIIl[lIlIIIIlIIlI[7]] = llIlIIlllIllII("jRXiJ/2rSGi35FQTMPBzdw==", "DOCcv");
        lIlIIIIlIIIl[lIlIIIIlIIlI[4]] = llIlIIllllIIll("xtRC8tCzcvDGT61tkMaJ2vkiJYukIf4F", "cOcOQ");
        lIlIIIIlIIIl[lIlIIIIlIIlI[8]] = llIlIIllllIlIl("IRsaFww=", "bwudi");
        lIlIIIIlIIIl[lIlIIIIlIIlI[10]] = llIlIIlllIllII("L2ACPIrqHzKV1gKN0+aE/g==", "uMTLP");
        lIlIIIIlIIIl[lIlIIIIlIIlI[11]] = llIlIIllllIIll("YRz5GaTgCw2SWXa5wvnFdQ==", "GUoxH");
        lIlIIIIlIIIl[lIlIIIIlIIlI[12]] = llIlIIllllIIll("pi3/rKQ9u3QIOzrUhFYCFwT6IXV4N/4e", "nHEem");
        lIlIIIIlIIIl[lIlIIIIlIIlI[9]] = llIlIIlllIllII("uZEk2HJ7f4s=", "bMzkS");
    }

    private static String llIlIIllllIlIl(String lllllllllllllllIlllIIlllIlIIlIII, String lllllllllllllllIlllIIlllIlIIIlll) {
        String lllllllllllllllIlllIIlllIlIIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlllIlIIIllI = new StringBuilder();
        char[] lllllllllllllllIlllIIlllIlIIIlIl = lllllllllllllllIlllIIlllIlIIIlll.toCharArray();
        int lllllllllllllllIlllIIlllIlIIIlII = lIlIIIIlIIlI[0];
        char[] charArray = lllllllllllllllIlllIIlllIlIIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIlIIlI[0];
        while (llIlIIlllllllI(i, length)) {
            char lllllllllllllllIlllIIlllIlIIlIIl = charArray[i];
            lllllllllllllllIlllIIlllIlIIIllI.append((char) (lllllllllllllllIlllIIlllIlIIlIIl ^ lllllllllllllllIlllIIlllIlIIIlIl[lllllllllllllllIlllIIlllIlIIIlII % lllllllllllllllIlllIIlllIlIIIlIl.length]));
            "".length();
            lllllllllllllllIlllIIlllIlIIIlII++;
            i++;
            "".length();
            if (((205 ^ 182) ^ (((54 + 64) - 55) + 64)) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIlllIlIIIllI);
    }

    private static String llIlIIlllIllII(String lllllllllllllllIlllIIlllIlIllIII, String lllllllllllllllIlllIIlllIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIlI[13]), "DES");
            Cipher lllllllllllllllIlllIIlllIlIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllIlIllIlI.init(lIlIIIIlIIlI[4], secretKeySpec);
            return new String(lllllllllllllllIlllIIlllIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllIlIllIIl) {
            lllllllllllllllIlllIIlllIlIllIIl.printStackTrace();
            return null;
        }
    }
}
