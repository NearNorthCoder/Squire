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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Get Absorption", priority = 6, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.r  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/r.class */
public class r extends Task {
    private static /* synthetic */ int[] lIIIlIIlIllIl;
    private final /* synthetic */ SquireNightmareZone ax;
    private final /* synthetic */ Client az;
    private static /* synthetic */ String[] lIIIlIIlIllII;
    private final /* synthetic */ SquireNightmareZoneConfig ay;

    private static boolean lIIlllllIIIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllllIIIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllllIIIllIl(Object obj) {
        return obj == null;
    }

    private static void lIIlllllIIIlIlI() {
        lIIIlIIlIllIl = new int[4];
        lIIIlIIlIllIl[0] = ((174 ^ 199) ^ (82 ^ 8)) & (((((142 + 96) - 88) + 20) ^ (((24 + 6) - (-73)) + 50)) ^ (-" ".length()));
        lIIIlIIlIllIl[1] = " ".length();
        lIIIlIIlIllIl[2] = "  ".length();
        lIIIlIIlIllIl[3] = "   ".length();
    }

    private static String lIIlllllIIIIlll(String lllllllllllllllIIIIlllllIlllIllI, String lllllllllllllllIIIIlllllIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllllIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIlIllIl[2], lllllllllllllllIIIIlllllIllllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllllIllllIIl) {
            lllllllllllllllIIIIlllllIllllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (lIIlllllIIIlIll(this.az.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIllIl[0];
        }
        int a = this.ax.a();
        if (lIIlllllIIIllII(a, this.ay.overload())) {
            return lIIIlIIlIllIl[0];
        }
        if (lIIlllllIIIlIll(Dialog.isEnterInputOpen() ? 1 : 0) && lIIlllllIIIlIll(Dialog.getText().contains(lIIIlIIlIllII[lIIIlIIlIllIl[0]]) ? 1 : 0)) {
            Dialog.enterAmount(this.ay.overload() - a);
            return lIIIlIIlIllIl[1];
        }
        String[] strArr = new String[lIIIlIIlIllIl[1]];
        strArr[lIIIlIIlIllIl[0]] = lIIIlIIlIllII[lIIIlIIlIllIl[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIlllllIIIllIl(nearest)) {
            return lIIIlIIlIllIl[0];
        }
        nearest.interact(lIIIlIIlIllII[lIIIlIIlIllIl[2]]);
        return lIIIlIIlIllIl[1];
    }

    private static void lIIlllllIIIlIIl() {
        lIIIlIIlIllII = new String[lIIIlIIlIllIl[3]];
        lIIIlIIlIllII[lIIIlIIlIllIl[0]] = lIIlllllIIIIlll("WgeKNJkHwVWoeXp1NYRL9MN+ZtTf5sVU", "YXmge");
        lIIIlIIlIllII[lIIIlIIlIllIl[1]] = lIIlllllIIIIlll("+dyW1xQ1Yf4OnCyI8R5ybA==", "yWWPN");
        lIIIlIIlIllII[lIIIlIIlIllIl[2]] = lIIlllllIIIlIII("DgofAw==", "ZktfA");
    }

    @Inject
    public r(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ax = squireNightmareZone;
        this.ay = squireNightmareZoneConfig;
        this.az = client;
    }

    private static String lIIlllllIIIlIII(String lllllllllllllllIIIIllllllIIIllIl, String lllllllllllllllIIIIllllllIIIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIllllllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIllllllIIIlIll = new StringBuilder();
        char[] lllllllllllllllIIIIllllllIIIlIlI = lllllllllllllllIIIIllllllIIIllII.toCharArray();
        int lllllllllllllllIIIIllllllIIIlIIl = lIIIlIIlIllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIlIIlIllIl[0];
        while (lIIlllllIIIlllI(i, length)) {
            char lllllllllllllllIIIIllllllIIIlllI = charArray[i];
            lllllllllllllllIIIIllllllIIIlIll.append((char) (lllllllllllllllIIIIllllllIIIlllI ^ lllllllllllllllIIIIllllllIIIlIlI[lllllllllllllllIIIIllllllIIIlIIl % lllllllllllllllIIIIllllllIIIlIlI.length]));
            "".length();
            lllllllllllllllIIIIllllllIIIlIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIllllllIIIlIll);
    }

    private static boolean lIIlllllIIIlIll(int i) {
        return i != 0;
    }

    static {
        lIIlllllIIIlIlI();
        lIIlllllIIIlIIl();
    }
}
