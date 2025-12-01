package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Restock Potions", priority = 200, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.s  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/s.class */
public class s extends Task {
    private final /* synthetic */ SquireNightmareZone aA;
    private final /* synthetic */ Client aC;
    private static /* synthetic */ int[] lIIIlIIlIIlII;
    private final /* synthetic */ SquireNightmareZoneConfig aB;
    private static /* synthetic */ String[] lIIIlIIlIIIIl;

    private static boolean lIIllllIllIlllI(int i) {
        return i == 0;
    }

    static {
        lIIllllIllIlIlI();
        lIIllllIllIIlll();
    }

    private static boolean lIIllllIllIlIll(int i) {
        return i != 0;
    }

    private static boolean lIIllllIllIllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public boolean run() {
        if (lIIllllIllIlIll(this.aC.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIIlII[0];
        }
        if (lIIllllIllIlIll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIIlIIlIIlII[1];
        }
        int varbitValue = Static.getClient().getVarbitValue(b.f0s);
        int lllllllllllllllIIIlIIIIIIIllIIll = Static.getClient().getVarbitValue(b.t);
        if (lIIllllIllIllII(varbitValue + this.aA.a(), this.aB.overload()) && lIIllllIllIllII(lllllllllllllllIIIlIIIIIIIllIIll + this.aA.b(), this.aB.absorption())) {
            return lIIIlIIlIIlII[0];
        }
        Widget widget = Widgets.get(lIIIlIIlIIlII[2], lIIIlIIlIIlII[1], lIIIlIIlIIlII[1]);
        if (!lIIllllIllIllIl(widget) || lIIllllIllIlllI(widget.isVisible() ? 1 : 0)) {
            String[] strArr = new String[lIIIlIIlIIlII[1]];
            strArr[lIIIlIIlIIlII[0]] = lIIIlIIlIIIIl[lIIIlIIlIIlII[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIIllllIllIllll(nearest)) {
                return lIIIlIIlIIlII[0];
            }
            nearest.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[1]]);
            return lIIIlIIlIIlII[1];
        }
        Widget widget2 = Widgets.get(lIIIlIIlIIlII[2], b.n, b.p);
        if (lIIllllIlllIIII(varbitValue, this.aB.overload()) && lIIllllIllIllIl(widget2)) {
            widget2.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[3]]);
            return lIIIlIIlIIlII[1];
        }
        Widget widget3 = Widgets.get(lIIIlIIlIIlII[2], b.n, b.q);
        if (lIIllllIlllIIII(lllllllllllllllIIIlIIIIIIIllIIll, this.aB.absorption()) && lIIllllIllIllIl(widget3)) {
            widget3.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[4]]);
            return lIIIlIIlIIlII[1];
        }
        return lIIIlIIlIIlII[0];
    }

    private static boolean lIIllllIllIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllllIllIllIl(Object obj) {
        return obj != null;
    }

    @Inject
    public s(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.aA = squireNightmareZone;
        this.aB = squireNightmareZoneConfig;
        this.aC = client;
    }

    private static boolean lIIllllIlllIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIllllIllIIllI(String lllllllllllllllIIIlIIIIIIIlIlIII, String lllllllllllllllIIIlIIIIIIIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIlIIlII[3], lllllllllllllllIIIlIIIIIIIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIIIIlIlIIl) {
            lllllllllllllllIIIlIIIIIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIllllIllIIlll() {
        lIIIlIIlIIIIl = new String[lIIIlIIlIIlII[5]];
        lIIIlIIlIIIIl[lIIIlIIlIIlII[0]] = lIIllllIllIIlIl("ORI0CBAPBGMKCg4ENw==", "kwCib");
        lIIIlIIlIIIIl[lIIIlIIlIIlII[1]] = lIIllllIllIIlIl("Kw8bAwEQ", "xjzqb");
        lIIIlIIlIIIIl[lIIIlIIlIIlII[3]] = lIIllllIllIIlIl("MRI+WHxD", "sgGuM");
        lIIIlIIlIIIIl[lIIIlIIlIIlII[4]] = lIIllllIllIIllI("S2ZMzF1XrEo=", "pkREW");
    }

    private static String lIIllllIllIIlIl(String lllllllllllllllIIIlIIIIIIIIllIII, String lllllllllllllllIIIlIIIIIIIIlIlll) {
        String lllllllllllllllIIIlIIIIIIIIllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlIIIIIIIIlIllI = new StringBuilder();
        char[] lllllllllllllllIIIlIIIIIIIIlIlIl = lllllllllllllllIIIlIIIIIIIIlIlll.toCharArray();
        int lllllllllllllllIIIlIIIIIIIIlIlII = lIIIlIIlIIlII[0];
        char[] charArray = lllllllllllllllIIIlIIIIIIIIllIII2.toCharArray();
        int lllllllllllllllIIIlIIIIIIIIIllIl = charArray.length;
        int i = lIIIlIIlIIlII[0];
        while (lIIllllIlllIIII(i, lllllllllllllllIIIlIIIIIIIIIllIl)) {
            char lllllllllllllllIIIlIIIIIIIIllIIl = charArray[i];
            lllllllllllllllIIIlIIIIIIIIlIllI.append((char) (lllllllllllllllIIIlIIIIIIIIllIIl ^ lllllllllllllllIIIlIIIIIIIIlIlIl[lllllllllllllllIIIlIIIIIIIIlIlII % lllllllllllllllIIIlIIIIIIIIlIlIl.length]));
            "".length();
            lllllllllllllllIIIlIIIIIIIIlIlII++;
            i++;
            "".length();
            if (((62 ^ 122) ^ (202 ^ 139)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIlIIIIIIIIlIllI);
    }

    private static void lIIllllIllIlIlI() {
        lIIIlIIlIIlII = new int[6];
        lIIIlIIlIIlII[0] = (79 ^ 69) & ((201 ^ 195) ^ (-1));
        lIIIlIIlIIlII[1] = " ".length();
        lIIIlIIlIIlII[2] = (((107 ^ 111) + (7 ^ 117)) - (98 ^ 85)) + ((7 + 137) - 119) + 118;
        lIIIlIIlIIlII[3] = "  ".length();
        lIIIlIIlIIlII[4] = "   ".length();
        lIIIlIIlIIlII[5] = (27 ^ 96) ^ (((82 + 21) - 92) + 116);
    }
}
