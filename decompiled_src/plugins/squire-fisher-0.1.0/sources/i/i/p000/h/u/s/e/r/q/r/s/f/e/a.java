package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Chopping Tentacle")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.a  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/a.class */
public class a extends Task {
    private static /* synthetic */ int[] lIlllIlIIlll;
    private /* synthetic */ int q;
    private static /* synthetic */ String[] lIlllIlIIllI;
    private static final /* synthetic */ Logger o;
    private final /* synthetic */ SquireFisherConfig p;

    private static boolean lllIlIlIllIllI(int i2) {
        return i2 == 0;
    }

    private static String lllIlIlIllIIIl(String lllllllllllllllIlIlllIllllIlIlll, String lllllllllllllllIlIlllIllllIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlIIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIllllIllIII) {
            lllllllllllllllIlIlllIllllIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIlllIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    public boolean run() {
        if (lllIlIlIllIllI(this.p.fishingTrawler() ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        if (lllIlIlIllIlll(this.q)) {
            this.q -= lIlllIlIIlll[1];
            return lIlllIlIIlll[0];
        } else if (lllIlIlIllIllI(Widgets.isVisible(Widgets.get(WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0)) {
            return lIlllIlIIlll[0];
        } else {
            String[] strArr = new String[lIlllIlIIlll[1]];
            strArr[lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[0]];
            NPC nearest = NPCs.getNearest(strArr);
            String[] strArr2 = new String[lIlllIlIIlll[1]];
            strArr2[lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[1]];
            NPC nearest2 = NPCs.getNearest(strArr2);
            if (!lllIlIlIlllIII(nearest) && !lllIlIlIlllIIl(nearest2) && !lllIlIlIlllIlI(nearest2.getAnimation(), lIlllIlIIlll[2])) {
                String[] strArr3 = new String[lIlllIlIIlll[1]];
                strArr3[lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[3]];
                if (!lllIlIlIllIllI(nearest2.hasAction(strArr3) ? 1 : 0) && !lllIlIlIlllIlI(Players.getLocal().getAnimation(), lIlllIlIIlll[4])) {
                    nearest2.interact(lIlllIlIIllI[lIlllIlIIlll[5]]);
                    return lIlllIlIIlll[1];
                }
                return lIlllIlIIlll[0];
            }
            return lIlllIlIIlll[0];
        }
    }

    private static boolean lllIlIlIlllIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lllIlIlIlllIll(int i2, int i3) {
        return i2 < i3;
    }

    private static String lllIlIlIllIIlI(String lllllllllllllllIlIlllIllllIIlIII, String lllllllllllllllIlIlllIllllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIllllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlllIlIIlll[7]), "DES");
            Cipher lllllllllllllllIlIlllIllllIIllII = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIllllIIllII.init(lIlllIlIIlll[3], lllllllllllllllIlIlllIllllIIllIl);
            return new String(lllllllllllllllIlIlllIllllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIllllIIlIll) {
            lllllllllllllllIlIlllIllllIIlIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlIllIlIl() {
        lIlllIlIIlll = new int[8];
        lIlllIlIIlll[0] = ((86 ^ 19) ^ (36 ^ 58)) & (((183 ^ 159) ^ (238 ^ 157)) ^ (-" ".length()));
        lIlllIlIIlll[1] = " ".length();
        lIlllIlIIlll[2] = (-((-23269) & 24565)) & (-4099) & 14303;
        lIlllIlIIlll[3] = "  ".length();
        lIlllIlIIlll[4] = (-(86 ^ 119)) & (-23809) & 32750;
        lIlllIlIIlll[5] = "   ".length();
        lIlllIlIIlll[6] = 47 ^ 43;
        lIlllIlIIlll[7] = 59 ^ 51;
    }

    static {
        lllIlIlIllIlIl();
        lllIlIlIllIlII();
        o = LoggerFactory.getLogger(a.class);
    }

    @Inject
    public a(SquireFisherConfig squireFisherConfig) {
        this.p = squireFisherConfig;
    }

    private static boolean lllIlIlIllIlll(int i2) {
        return i2 >= 0;
    }

    private static void lllIlIlIllIlII() {
        lIlllIlIIllI = new String[lIlllIlIIlll[6]];
        lIlllIlIIllI[lIlllIlIIlll[0]] = lllIlIlIllIIIl("vyndD8l5LUU=", "YRPDv");
        lIlllIlIIllI[lIlllIlIIlll[1]] = lllIlIlIllIIlI("3BiZLzez0Q5i4mSsfkwxzTGHbubF2KqZ", "uYrXz");
        lIlllIlIIllI[lIlllIlIIlll[3]] = lllIlIlIllIIll("ABI1Mw==", "CzZCj");
        lIlllIlIIllI[lIlllIlIIlll[5]] = lllIlIlIllIIll("ICMjNQ==", "cKLEL");
    }

    private static String lllIlIlIllIIll(String lllllllllllllllIlIlllIlllIlllIlI, String lllllllllllllllIlIlllIlllIlllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlllIlllIII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIlllIlllIIl.toCharArray();
        int lllllllllllllllIlIlllIlllIllIllI = lIlllIlIIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIlllIlIIlll[0];
        while (lllIlIlIlllIll(i2, length)) {
            lllllllllllllllIlIlllIlllIlllIII.append((char) (charArray2[i2] ^ charArray[lllllllllllllllIlIlllIlllIllIllI % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIlllIllIllI++;
            i2++;
            "".length();
            if ((((((121 + 116) - 232) + 172) ^ (((79 + 30) - 77) + 143)) & (((229 ^ 189) ^ (45 ^ 107)) ^ (-" ".length())) & (("  ".length() & ("  ".length() ^ (-" ".length()))) ^ (-" ".length()))) != ("  ".length() & ("  ".length() ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIlllIlllIII);
    }

    private static boolean lllIlIlIlllIII(Object obj) {
        return obj != null;
    }
}
