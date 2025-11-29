package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
@TaskDesc(name = "Clicking Spores", priority = 6000, blocking = true)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/v.class */
public class v extends AbstractC0000a {
    private static /* synthetic */ int ao;
    private static /* synthetic */ String[] lIlIIllllllll;
    private static /* synthetic */ int[] lIlIlIIIIIIII;
    private /* synthetic */ List<Widget> ap;

    @Inject
    protected v(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        super(squireVardorvis, squireVardorvisConfig, c0004e, c0001b, client);
        this.ap = new ArrayList();
    }

    private static void lIllllIIllIIlIl() {
        lIlIlIIIIIIII = new int[6];
        lIlIlIIIIIIII[0] = (194 ^ 156) & ((127 ^ 33) ^ (-1));
        lIlIlIIIIIIII[1] = 5 ^ 3;
        lIlIlIIIIIIII[2] = "  ".length();
        lIlIlIIIIIIII[3] = " ".length();
        lIlIlIIIIIIII[4] = (-12865) & 54604363;
        lIlIlIIIIIIII[5] = (3 ^ 71) ^ (67 ^ 15);
    }

    private static boolean lIllllIIllIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIllllIIllIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.AbstractC0000a
    public boolean l() {
        int llllllllllllllIllIllIIllIIllIIll = lIlIlIIIIIIII[0];
        this.ap.clear();
        int i = lIlIlIIIIIIII[0];
        while (lIllllIIllIIllI(i, lIlIlIIIIIIII[1])) {
            Widget widget = this.w.getWidget(ao - i);
            if (lIllllIIllIIlll(widget)) {
                if (lIllllIIllIlIII(widget.isVisible() ? 1 : 0)) {
                    "".length();
                    if (0 != 0) {
                        return ((110 ^ 106) ^ (86 ^ 120)) & (((9 ^ 7) ^ (126 ^ 90)) ^ (-" ".length()));
                    }
                } else {
                    llllllllllllllIllIllIIllIIllIIll++;
                    this.ap.add(widget);
                    "".length();
                }
            }
            i++;
            "".length();
            if (" ".length() == (-" ".length())) {
                return ((5 ^ 94) ^ "  ".length()) & (((23 ^ 31) ^ (193 ^ 144)) ^ (-" ".length()));
            }
        }
        if (lIllllIIllIlIII(llllllllllllllIllIllIIllIIllIIll)) {
            return lIlIlIIIIIIII[0];
        }
        Collections.shuffle(this.ap);
        int i2 = lIlIlIIIIIIII[0];
        while (lIllllIIllIIllI(i2, lIlIlIIIIIIII[2])) {
            if (lIllllIIllIlIII(this.ap.size())) {
                return lIlIlIIIIIIII[0];
            }
            Widget widget2 = this.ap.get(lIlIlIIIIIIII[0]);
            if (lIllllIIllIIlll(widget2)) {
                if (lIllllIIllIlIII(widget2.isVisible() ? 1 : 0)) {
                    "".length();
                    if ("   ".length() <= (-" ".length())) {
                        return ((150 ^ 177) ^ (150 ^ 146)) & (((163 ^ 187) ^ (249 ^ 194)) ^ (-" ".length()));
                    }
                } else {
                    widget2.interact(lIlIIllllllll[lIlIlIIIIIIII[0]]);
                    this.ap.remove(lIlIlIIIIIIII[0]);
                    "".length();
                }
            }
            i2++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIlIIIIIIII[3];
    }

    private static void lIllllIIllIIlII() {
        lIlIIllllllll = new String[lIlIlIIIIIIII[3]];
        lIlIIllllllll[lIlIlIIIIIIII[0]] = lIllllIIllIIIll("6rVHJ9FAbus=", "JfZau");
    }

    static {
        lIllllIIllIIlIl();
        lIllllIIllIIlII();
        ao = lIlIlIIIIIIII[4];
    }

    private static String lIllllIIllIIIll(String llllllllllllllIllIllIIllIIlIlIIl, String llllllllllllllIllIllIIllIIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIllIIllIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIIII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIIIIII[2], llllllllllllllIllIllIIllIIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIllIIlIlIlI) {
            llllllllllllllIllIllIIllIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIllIIllI(int i, int i2) {
        return i < i2;
    }
}
