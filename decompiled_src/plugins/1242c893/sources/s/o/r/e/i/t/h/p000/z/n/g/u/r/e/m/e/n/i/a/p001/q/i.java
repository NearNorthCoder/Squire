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
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Pick Power Up", priority = 10, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.i  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/i.class */
public class i extends Task {
    private final /* synthetic */ SquireNightmareZoneConfig W;
    private static /* synthetic */ String[] lIIIlIIIlIlll;
    private final /* synthetic */ SquireNightmareZone V;
    private final /* synthetic */ Client X;
    private static /* synthetic */ int[] lIIIlIIIllIII;

    private static void lIIllllIlIIlIll() {
        lIIIlIIIllIII = new int[4];
        lIIIlIIIllIII[0] = (201 ^ 138) & ((35 ^ 96) ^ (-1));
        lIIIlIIIllIII[1] = " ".length();
        lIIIlIIIllIII[2] = "  ".length();
        lIIIlIIIllIII[3] = "   ".length();
    }

    private static String lIIllllIlIIlIII(String lllllllllllllllIIIlIIIIIllllIllI, String lllllllllllllllIIIlIIIIIllllIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIlIIIIIllllIIll = lllllllllllllllIIIlIIIIIllllIlIl.toCharArray();
        int lllllllllllllllIIIlIIIIIllllIIlI = lIIIlIIIllIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIlIIIllIII[0];
        while (lIIllllIlIIlllI(i, length)) {
            char lllllllllllllllIIIlIIIIIllllIlll = charArray[i];
            sb.append((char) (lllllllllllllllIIIlIIIIIllllIlll ^ lllllllllllllllIIIlIIIIIllllIIll[lllllllllllllllIIIlIIIIIllllIIlI % lllllllllllllllIIIlIIIIIllllIIll.length]));
            "".length();
            lllllllllllllllIIIlIIIIIllllIIlI++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIllllIlIIlIll();
        lIIllllIlIIlIlI();
    }

    private static boolean lIIllllIlIIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIllllIlIIlIIl(String lllllllllllllllIIIlIIIIIlllIIIIl, String lllllllllllllllIIIlIIIIIlllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlIIIIIlllIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlIIIIIlllIIIll.init(lIIIlIIIllIII[2], secretKeySpec);
            return new String(lllllllllllllllIIIlIIIIIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIIlllIIIlI) {
            lllllllllllllllIIIlIIIIIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIllllIlIIlIlI() {
        lIIIlIIIlIlll = new String[lIIIlIIIllIII[3]];
        lIIIlIIIlIlll[lIIIlIIIllIII[0]] = lIIllllIlIIlIII("AgABPBhyHAMrDTc=", "RovYj");
        lIIIlIIIlIlll[lIIIlIIIllIII[1]] = lIIllllIlIIlIIl("zq41RArshT2SzqCCbEBgdd/Wzg4ZreYR", "cXiJg");
        lIIIlIIIlIlll[lIIIlIIIllIII[2]] = lIIllllIlIIlIIl("G4dvUhV7V2itRaexUjnwPA==", "wxuku");
    }

    @Inject
    public i(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.V = squireNightmareZone;
        this.W = squireNightmareZoneConfig;
        this.X = client;
    }

    private static boolean lIIllllIlIIllII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        if (!lIIllllIlIIllII(this.W.powerSurge() ? 1 : 0) && !lIIllllIlIIllII(this.X.isInInstancedRegion() ? 1 : 0)) {
            String[] strArr = new String[lIIIlIIIllIII[1]];
            strArr[lIIIlIIIllIII[0]] = lIIIlIIIlIlll[lIIIlIIIllIII[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIIllllIlIIllIl(nearest)) {
                return lIIIlIIIllIII[0];
            }
            if (lIIllllIlIIllII(Movement.shouldWalk() ? 1 : 0)) {
                return lIIIlIIIllIII[1];
            }
            System.out.println(lIIIlIIIlIlll[lIIIlIIIllIII[1]]);
            nearest.interact(lIIIlIIIlIlll[lIIIlIIIllIII[2]]);
            return lIIIlIIIllIII[1];
        }
        return lIIIlIIIllIII[0];
    }

    private static boolean lIIllllIlIIllIl(Object obj) {
        return obj == null;
    }
}
