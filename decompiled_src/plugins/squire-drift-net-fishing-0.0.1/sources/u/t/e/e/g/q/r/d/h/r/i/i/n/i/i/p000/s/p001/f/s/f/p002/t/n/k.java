package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Removing net", priority = 20, blocking = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.k  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/k.class */
public class k extends Task {
    private static /* synthetic */ String[] lIlIIIIIIllI;
    private static final /* synthetic */ int S;
    private final /* synthetic */ Client X;
    private static final /* synthetic */ int V;
    private final /* synthetic */ SquireDriftNet W;
    private static final /* synthetic */ int U;
    private static final /* synthetic */ int T;
    private static /* synthetic */ int[] lIlIIIIIIlll;

    private static boolean llIlIIllIIIlIl(Object obj) {
        return obj != null;
    }

    static {
        llIlIIllIIIIlI();
        llIlIIllIIIIIl();
        V = lIlIIIIIIlll[2];
        U = lIlIIIIIIlll[0];
        S = lIlIIIIIIlll[3];
        T = lIlIIIIIIlll[4];
    }

    private static boolean llIlIIllIIIIll(int i) {
        return i == 0;
    }

    private static boolean llIlIIllIIIllI(int i, int i2) {
        return i < i2;
    }

    private static String llIlIIllIIIIII(String lllllllllllllllIlllIlIIIllIlIIII, String lllllllllllllllIlllIlIIIllIIllll) {
        String lllllllllllllllIlllIlIIIllIlIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIllIIllIl = lllllllllllllllIlllIlIIIllIIllll.toCharArray();
        int lllllllllllllllIlllIlIIIllIIllII = lIlIIIIIIlll[0];
        char[] charArray = lllllllllllllllIlllIlIIIllIlIIII2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIIlll[0];
        while (llIlIIllIIIllI(i, length)) {
            char lllllllllllllllIlllIlIIIllIlIIIl = charArray[i];
            sb.append((char) (lllllllllllllllIlllIlIIIllIlIIIl ^ lllllllllllllllIlllIlIIIllIIllIl[lllllllllllllllIlllIlIIIllIIllII % lllllllllllllllIlllIlIIIllIIllIl.length]));
            "".length();
            lllllllllllllllIlllIlIIIllIIllII++;
            i++;
            "".length();
            if ((((21 ^ 120) ^ (222 ^ 163)) & (((((102 + 6) - 89) + 144) ^ (((162 + 99) - 177) + 95)) ^ (-" ".length()))) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        if (llIlIIllIIIIll(this.X.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIIlll[0];
        }
        String[] strArr = new String[lIlIIIIIIlll[1]];
        strArr[lIlIIIIIIlll[0]] = lIlIIIIIIllI[lIlIIIIIIlll[0]];
        if (llIlIIllIIIlII(Inventory.contains(strArr) ? 1 : 0)) {
            return lIlIIIIIIlll[0];
        }
        if (llIlIIllIIIIll(Static.getClient().getVarbitValue(lIlIIIIIIlll[2]))) {
            Log.error(lIlIIIIIIllI[lIlIIIIIIlll[1]]);
            this.W.forceStop();
            return lIlIIIIIIlll[0];
        }
        Widget widget = Widgets.get(lIlIIIIIIlll[3], lIlIIIIIIlll[4], lIlIIIIIIlll[0]);
        if (llIlIIllIIIlIl(widget)) {
            widget.interact(lIlIIIIIIllI[lIlIIIIIIlll[5]]);
            return lIlIIIIIIlll[1];
        }
        String[] strArr2 = new String[lIlIIIIIIlll[1]];
        strArr2[lIlIIIIIIlll[0]] = lIlIIIIIIllI[lIlIIIIIIlll[6]];
        TileObject nearest = TileObjects.getNearest(strArr2);
        if (llIlIIllIIIlIl(nearest)) {
            nearest.interact(lIlIIIIIIllI[lIlIIIIIIlll[7]]);
            return lIlIIIIIIlll[1];
        }
        return lIlIIIIIIlll[0];
    }

    private static void llIlIIllIIIIIl() {
        lIlIIIIIIllI = new String[lIlIIIIIIlll[4]];
        lIlIIIIIIllI[lIlIIIIIIlll[0]] = llIlIIlIlllllI("IBl/X7wiTkvfGag6YykM3w==", "VsWfI");
        lIlIIIIIIllI[lIlIIIIIIlll[1]] = llIlIIlIllllll("1Qsx6g84/ak0wHEYePIBuOQqsmhgljT6", "ZQWMB");
        lIlIIIIIIllI[lIlIIIIIIlll[5]] = llIlIIlIllllll("FYcsyOJ4MZiGM1ypWiFd7w==", "LGxkH");
        lIlIIIIIIllI[lIlIIIIIIlll[6]] = llIlIIlIllllll("nRUfSva1KBQ=", "KCVTq");
        lIlIIIIIIllI[lIlIIIIIIlll[7]] = llIlIIllIIIIII("ND8+BA==", "zZJwE");
    }

    private static String llIlIIlIllllll(String lllllllllllllllIlllIlIIIlllIIIII, String lllllllllllllllIlllIlIIIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIIlll[5], lllllllllllllllIlllIlIIIlllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIlllIIIIl) {
            lllllllllllllllIlllIlIIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIllIIIIlI() {
        lIlIIIIIIlll = new int[9];
        lIlIIIIIIlll[0] = ((151 ^ 170) ^ (5 ^ 27)) & (((19 ^ 90) ^ (107 ^ 1)) ^ (-" ".length()));
        lIlIIIIIIlll[1] = " ".length();
        lIlIIIIIIlll[2] = ((231 + 3) - 89) + 98;
        lIlIIIIIIlll[3] = (-((-4797) & 6911)) & (-29313) & 31735;
        lIlIIIIIIlll[4] = (((91 + 159) - 164) + 95) ^ (((157 + 55) - 137) + 101);
        lIlIIIIIIlll[5] = "  ".length();
        lIlIIIIIIlll[6] = "   ".length();
        lIlIIIIIIlll[7] = (110 ^ 59) ^ (203 ^ 154);
        lIlIIIIIIlll[8] = 154 ^ 146;
    }

    private static String llIlIIlIlllllI(String lllllllllllllllIlllIlIIIlIlllIIl, String lllllllllllllllIlllIlIIIlIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIIlll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIlIllllII) {
            lllllllllllllllIlllIlIIIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIIIlII(int i) {
        return i != 0;
    }

    @Inject
    public k(SquireDriftNet squireDriftNet, Client client) {
        this.W = squireDriftNet;
        this.X = client;
    }
}
