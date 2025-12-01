package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Flick Rapid Heal", priority = 2, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.g  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/g.class */
public class g extends Task {
    private static /* synthetic */ String[] lIIIlIIlIIlIl;
    private final /* synthetic */ Client Q;
    private static /* synthetic */ int[] lIIIlIIlIIllI;
    private final /* synthetic */ SquireNightmareZone O;
    private final /* synthetic */ SquireNightmareZoneConfig P;
    private /* synthetic */ Random R = new Random();

    @Inject
    public g(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.O = squireNightmareZone;
        this.P = squireNightmareZoneConfig;
        this.Q = client;
    }

    private static boolean lIIllllIllllIII(int i) {
        return i != 0;
    }

    private static boolean lIIllllIlllIlII(int i) {
        return i == 0;
    }

    private static boolean lIIllllIlllIlll(Object obj) {
        return obj == null;
    }

    private static void lIIllllIlllIIlI() {
        lIIIlIIlIIlIl = new String[lIIIlIIlIIllI[4]];
        lIIIlIIlIIlIl[lIIIlIIlIIllI[0]] = lIIllllIlllIIIl("qD0Ot01yEZzElFj8Bm5UClZQVB8n1YH/", "Tmoyc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIIllllIlllIlII(this.Q.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIIllI[0];
        }
        if (!lIIllllIlllIlIl(Skills.getLevel(Skill.PRAYER), lIIIlIIlIIllI[1]) || lIIllllIlllIllI(Skills.getBoostedLevel(Skill.PRAYER))) {
            return lIIIlIIlIIllI[0];
        }
        Widget widget = Widgets.get(Prayer.RAPID_HEAL.getWidgetInfo());
        if (lIIllllIlllIlll(widget)) {
            return lIIIlIIlIIllI[0];
        }
        if (lIIllllIllllIII(Prayers.isEnabled(Prayer.RAPID_HEAL) ? 1 : 0)) {
            WidgetPackets.widgetFirstOption(widget);
            "".length();
            if ((-"   ".length()) > 0) {
                return "   ".length() & ("   ".length() ^ (-" ".length()));
            }
        } else {
            WidgetPackets.widgetFirstOption(widget);
            WidgetPackets.widgetFirstOption(widget);
        }
        System.out.println(lIIIlIIlIIlIl[lIIIlIIlIIllI[0]]);
        sleep(this.R.nextInt(lIIIlIIlIIllI[2]) + lIIIlIIlIIllI[3]);
        return lIIIlIIlIIllI[4];
    }

    private static String lIIllllIlllIIIl(String lllllllllllllllIIIIllllllllIllIl, String lllllllllllllllIIIIllllllllIllII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllllllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllllllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIlIIllI[5], lllllllllllllllIIIIlllllllllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIllllllllIlllI) {
            lllllllllllllllIIIIllllllllIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlllIllI(int i) {
        return i <= 0;
    }

    static {
        lIIllllIlllIIll();
        lIIllllIlllIIlI();
    }

    private static boolean lIIllllIlllIlIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIIllllIlllIIll() {
        lIIIlIIlIIllI = new int[6];
        lIIIlIIlIIllI[0] = (29 ^ 26) & ((191 ^ 184) ^ (-1));
        lIIIlIIlIIllI[1] = (51 ^ 121) ^ (156 ^ 192);
        lIIIlIIlIIllI[2] = (107 ^ 7) ^ (74 ^ 106);
        lIIIlIIlIIllI[3] = 8 ^ 28;
        lIIIlIIlIIllI[4] = " ".length();
        lIIIlIIlIIllI[5] = "  ".length();
    }
}
