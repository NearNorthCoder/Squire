package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Get Absorption", priority = 6, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.q  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/q.class */
public class q extends Task {
    private static /* synthetic */ int[] lIIIlIIllIIll;
    private final /* synthetic */ Client aw;
    private final /* synthetic */ SquireNightmareZone au;
    private static /* synthetic */ String[] lIIIlIIllIIlI;
    private final /* synthetic */ SquireNightmareZoneConfig av;

    private static boolean lIIlllllIlIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllllIlIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIIlllllIIllIll(String lllllllllllllllIIIIllllIlllIllIl, String lllllllllllllllIIIIllllIlllIllII) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllIllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIlllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIllllIlllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIllllIlllIllll.init(lIIIlIIllIIll[2], lllllllllllllllIIIIllllIllllIIII);
            return new String(lllllllllllllllIIIIllllIlllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIllllIlllIlllI) {
            lllllllllllllllIIIIllllIlllIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllIIllllI() {
        lIIIlIIllIIlI = new String[lIIIlIIllIIll[3]];
        lIIIlIIllIIlI[lIIIlIIllIIll[0]] = lIIlllllIIllIll("aZVwr0VntQv8Oi3FOnaObv7F5IhjQtAOFTzYFPz7mp8=", "iPwvc");
        lIIIlIIllIIlI[lIIIlIIllIIll[1]] = lIIlllllIIlllII("Pu0VhjSA+TD9avbht5vtN4lGm98cdrNn", "JOuyb");
        lIIIlIIllIIlI[lIIIlIIllIIll[2]] = lIIlllllIIlllIl("FgoqNw==", "BkARv");
    }

    private static void lIIlllllIIlllll() {
        lIIIlIIllIIll = new int[5];
        lIIIlIIllIIll[0] = ((145 ^ 155) ^ (234 ^ 162)) & (((((129 + 58) - 74) + 97) ^ (((89 + 96) - 75) + 34)) ^ (-" ".length()));
        lIIIlIIllIIll[1] = " ".length();
        lIIIlIIllIIll[2] = "  ".length();
        lIIIlIIllIIll[3] = "   ".length();
        lIIIlIIllIIll[4] = (88 ^ 11) ^ (105 ^ 50);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (lIIlllllIlIIIII(this.aw.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIllIIll[0];
        }
        int b = this.au.b();
        if (lIIlllllIlIIIIl(b, this.av.absorption())) {
            return lIIIlIIllIIll[0];
        }
        if (lIIlllllIlIIIII(Dialog.isEnterInputOpen() ? 1 : 0) && lIIlllllIlIIIII(Dialog.getText().contains(lIIIlIIllIIlI[lIIIlIIllIIll[0]]) ? 1 : 0)) {
            Dialog.enterAmount(this.av.absorption() - b);
            return lIIIlIIllIIll[1];
        }
        String[] strArr = new String[lIIIlIIllIIll[1]];
        strArr[lIIIlIIllIIll[0]] = lIIIlIIllIIlI[lIIIlIIllIIll[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIlllllIlIIIlI(nearest)) {
            return lIIIlIIllIIll[0];
        }
        nearest.interact(lIIIlIIllIIlI[lIIIlIIllIIll[2]]);
        return lIIIlIIllIIll[1];
    }

    private static String lIIlllllIIlllIl(String lllllllllllllllIIIIlllllIIIIIIlI, String lllllllllllllllIIIIlllllIIIIIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllllIIIIIIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlllllIIIIIIIl.toCharArray();
        int lllllllllllllllIIIIllllIlllllllI = lIIIlIIllIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIIllIIll[0];
        while (lIIlllllIlIIIll(i, length)) {
            char lllllllllllllllIIIIlllllIIIIIIll = charArray2[i];
            lllllllllllllllIIIIlllllIIIIIIII.append((char) (lllllllllllllllIIIIlllllIIIIIIll ^ charArray[lllllllllllllllIIIIllllIlllllllI % charArray.length]));
            "".length();
            lllllllllllllllIIIIllllIlllllllI++;
            i++;
            "".length();
            if ((((87 ^ 97) ^ (168 ^ 137)) & (((125 ^ 40) ^ (53 ^ 119)) ^ (-" ".length()))) == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlllllIIIIIIII);
    }

    private static boolean lIIlllllIlIIIII(int i) {
        return i != 0;
    }

    static {
        lIIlllllIIlllll();
        lIIlllllIIllllI();
    }

    private static String lIIlllllIIlllII(String lllllllllllllllIIIIllllIlllIIIII, String lllllllllllllllIIIIllllIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIllIlllll.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIIll[4]), "DES");
            Cipher lllllllllllllllIIIIllllIlllIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIIIllllIlllIIIlI.init(lIIIlIIllIIll[2], lllllllllllllllIIIIllllIlllIIIll);
            return new String(lllllllllllllllIIIIllllIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIllllIlllIIIIl) {
            lllllllllllllllIIIIllllIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIlIIIll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public q(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.au = squireNightmareZone;
        this.av = squireNightmareZoneConfig;
        this.aw = client;
    }
}
