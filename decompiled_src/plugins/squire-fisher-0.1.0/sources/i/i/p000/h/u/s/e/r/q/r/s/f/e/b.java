package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Climbing Up Ladder")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.b  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/b.class */
public class b extends Task {
    private static final /* synthetic */ Logger r;
    private final /* synthetic */ SquireFisherConfig s;
    private static /* synthetic */ int[] lIllllIIIIlI;
    private static /* synthetic */ String[] lIllllIIIIIl;

    @Inject
    public b(SquireFisherConfig squireFisherConfig) {
        this.s = squireFisherConfig;
    }

    private static String lllIllIIlIIIII(String lllllllllllllllIlIlllIIlIIlIllll, String lllllllllllllllIlIlllIIlIIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIlIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIIlIIllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIIlIIllIIIl.init(lIllllIIIIlI[3], lllllllllllllllIlIlllIIlIIllIIlI);
            return new String(lllllllllllllllIlIlllIIlIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIlIIllIIII) {
            lllllllllllllllIlIlllIIlIIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIIlIIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (lllIllIIlIIIll(this.s.fishingTrawler() ? 1 : 0)) {
            return lIllllIIIIlI[0];
        }
        String[] strArr = new String[lIllllIIIIlI[1]];
        strArr[lIllllIIIIlI[0]] = lIllllIIIIIl[lIllllIIIIlI[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lllIllIIlIIIll(Widgets.isVisible(Widgets.get(WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0) && !lllIllIIlIIlII(nearest)) {
            int[] iArr = new int[lIllllIIIIlI[1]];
            iArr[lIllllIIIIlI[0]] = lIllllIIIIlI[2];
            TileObjects.getNearest(iArr).interact(lIllllIIIIIl[lIllllIIIIlI[1]]);
            return lIllllIIIIlI[1];
        }
        return lIllllIIIIlI[0];
    }

    private static void lllIllIIlIIIlI() {
        lIllllIIIIlI = new int[4];
        lIllllIIIIlI[0] = ((19 ^ 87) ^ (251 ^ 156)) & (((130 ^ 152) ^ (140 ^ 181)) ^ (-" ".length()));
        lIllllIIIIlI[1] = " ".length();
        lIllllIIIIlI[2] = (-((-14274) & 30691)) & (-12291) & 32767;
        lIllllIIIIlI[3] = "  ".length();
    }

    static {
        lllIllIIlIIIlI();
        lllIllIIlIIIIl();
        r = LoggerFactory.getLogger(b.class);
    }

    private static String lllIllIIIlllll(String lllllllllllllllIlIlllIIlIlIIIlII, String lllllllllllllllIlIlllIIlIlIIIIll) {
        String lllllllllllllllIlIlllIIlIlIIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIlIlIIIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIIlIlIIIIll.toCharArray();
        int lllllllllllllllIlIlllIIlIlIIIIII = lIllllIIIIlI[0];
        char[] charArray2 = lllllllllllllllIlIlllIIlIlIIIlII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIllllIIIIlI[0];
        while (lllIllIIlIIlIl(i2, length)) {
            lllllllllllllllIlIlllIIlIlIIIIlI.append((char) (charArray2[i2] ^ charArray[lllllllllllllllIlIlllIIlIlIIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIIlIlIIIIII++;
            i2++;
            "".length();
            if (((35 ^ 56) & ((61 ^ 38) ^ (-1))) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIIlIlIIIIlI);
    }

    private static void lllIllIIlIIIIl() {
        lIllllIIIIIl = new String[lIllllIIIIlI[3]];
        lIllllIIIIIl[lIllllIIIIlI[0]] = lllIllIIIlllll("OB4zNyEM", "ukAGI");
        lIllllIIIIIl[lIllllIIIIlI[1]] = lllIllIIlIIIII("1D9qT88tOHP8iPcrkLMSdw==", "OWpJw");
    }

    private static boolean lllIllIIlIIlIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lllIllIIlIIIll(int i2) {
        return i2 == 0;
    }
}
