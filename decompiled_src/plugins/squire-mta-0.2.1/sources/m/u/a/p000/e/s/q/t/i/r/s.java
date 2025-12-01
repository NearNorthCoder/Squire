package m.u.a.p000.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Checking points", priority = 100, blocking = true)
/* renamed from: m.u.a.-.e.s.q.t.i.r.s  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/s.class */
public class s extends Task {
    private static /* synthetic */ int[] lllIlIlllllI;
    private final /* synthetic */ SquireMTA aw;
    private static final /* synthetic */ Pattern av;
    private static /* synthetic */ String[] lllIlIllllII;

    static {
        lIIIllIIlIllIlI();
        lIIIllIIlIlIlIl();
        av = Pattern.compile(lllIlIllllII[lllIlIlllllI[0]], lllIlIlllllI[10]);
    }

    private static String lIIIllIIlIlIlII(String lllllllllllllllIIllIlIIlIlIIIIII, String lllllllllllllllIIllIlIIlIIllllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlllllI[7], lllllllllllllllIIllIlIIlIlIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIIllllII) {
            lllllllllllllllIIllIlIIlIIllllII.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIIlIllIlI() {
        lllIlIlllllI = new int[11];
        lllIlIlllllI[0] = ((((73 + 112) - 77) + 19) ^ (55 ^ 14)) & ((" ".length() ^ (54 ^ 113)) ^ (-" ".length()));
        lllIlIlllllI[1] = (-17413) & 17965;
        lllIlIlllllI[2] = (74 ^ 3) ^ (120 ^ 59);
        lllIlIlllllI[3] = (54 ^ 90) ^ (161 ^ 198);
        lllIlIlllllI[4] = (159 ^ 196) ^ (145 ^ 198);
        lllIlIlllllI[5] = 53 ^ 56;
        lllIlIlllllI[6] = " ".length();
        lllIlIlllllI[7] = "  ".length();
        lllIlIlllllI[8] = "   ".length();
        lllIlIlllllI[9] = (((103 + 134) - 168) + 75) ^ (((119 + 40) - 111) + 100);
        lllIlIlllllI[10] = 99 ^ 67;
    }

    private static void lIIIllIIlIlIlIl() {
        lllIlIllllII = new String[lllIlIlllllI[6]];
        lllIlIllllII[lllIlIlllllI[0]] = lIIIllIIlIlIlII("/pZd1g1z3nsHpI8LcgUjP4WNpBo3o8SfhyG+n9k+7ZUxirxZgH5TDpF5NQHzUAtF/pZd1g1z3nuTrEtw0KYiYbBwNbwfCathezWrgrpL/VN14RipWFKedputAK3XF1f9IVcUuUnyc0E=", "UoikC");
    }

    private void b(String str) {
        Matcher matcher = av.matcher(str);
        if (lIIIllIIlIlllII(matcher.find() ? 1 : 0)) {
            int parseInt = Integer.parseInt(matcher.group(lllIlIlllllI[6]));
            int parseInt2 = Integer.parseInt(matcher.group(lllIlIlllllI[7]));
            int parseInt3 = Integer.parseInt(matcher.group(lllIlIlllllI[8]));
            int parseInt4 = Integer.parseInt(matcher.group(lllIlIlllllI[9]));
            this.aw.a(c.ALCHEMY, parseInt2);
            this.aw.a(c.ENCHANTMENT, parseInt3);
            this.aw.a(c.GRAVEYARD, parseInt4);
            this.aw.a(c.TELEKENETIC, parseInt);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (lIIIllIIlIllIll(this.aw.a().isEmpty() ? 1 : 0)) {
            return lllIlIlllllI[0];
        }
        Widget widget = Widgets.get(lllIlIlllllI[1], lllIlIlllllI[2]);
        Widget widget2 = Widgets.get(lllIlIlllllI[1], lllIlIlllllI[3]);
        Widget widget3 = Widgets.get(lllIlIlllllI[1], lllIlIlllllI[4]);
        Widget widget4 = Widgets.get(lllIlIlllllI[1], lllIlIlllllI[5]);
        if (lIIIllIIlIllIll(Widgets.isVisible(widget) ? 1 : 0)) {
            return lllIlIlllllI[0];
        }
        this.aw.a(c.ALCHEMY, Integer.parseInt(widget2.getText()));
        this.aw.a(c.TELEKENETIC, Integer.parseInt(widget.getText()));
        this.aw.a(c.ENCHANTMENT, Integer.parseInt(widget3.getText()));
        this.aw.a(c.GRAVEYARD, Integer.parseInt(widget4.getText()));
        return lllIlIlllllI[6];
    }

    @Inject
    public s(SquireMTA squireMTA) {
        this.aw = squireMTA;
    }

    private static boolean lIIIllIIlIllIll(int i) {
        return i == 0;
    }

    private static boolean lIIIllIIlIlllII(int i) {
        return i != 0;
    }
}
