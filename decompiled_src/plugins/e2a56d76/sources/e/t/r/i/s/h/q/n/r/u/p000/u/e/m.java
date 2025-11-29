package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
@TaskDesc(name = "Looting box trap", priority = 1)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.m  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/m.class */
public class m extends j {
    private static /* synthetic */ int[] llllIIIIIlll;
    private static /* synthetic */ String[] llllIIIIIllI;

    private static void lIIIlllIlIIlllI() {
        llllIIIIIlll = new int[6];
        llllIIIIIlll[0] = "   ".length();
        llllIIIIIlll[1] = " ".length();
        llllIIIIIlll[2] = (95 ^ 125) & ((100 ^ 70) ^ (-1));
        llllIIIIIlll[3] = (-20482) & 30489;
        llllIIIIIlll[4] = (((47 + 17) - (-81)) + 10) ^ (((7 + 125) - 131) + 146);
        llllIIIIIlll[5] = "  ".length();
    }

    private static void lIIIlllIlIIllIl() {
        llllIIIIIllI = new String[llllIIIIIlll[1]];
        llllIIIIIllI[llllIIIIIlll[2]] = lIIIlllIlIIllII("u2F3OzRHA7g=", "PXAoA");
    }

    static {
        lIIIlllIlIIlllI();
        lIIIlllIlIIllIl();
    }

    private static boolean lIIIlllIlIlIIII(int i) {
        return i != 0;
    }

    @Inject
    public m(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.CHINS);
    }

    private static String lIIIlllIlIIllII(String lllllllllllllllIIlIllIlIIIIlIIlI, String lllllllllllllllIIlIllIlIIIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIIIIIllll.getBytes(StandardCharsets.UTF_8)), llllIIIIIlll[4]), "DES");
            Cipher lllllllllllllllIIlIllIlIIIIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlIIIIlIlII.init(llllIIIIIlll[5], secretKeySpec);
            return new String(lllllllllllllllIIlIllIlIIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIIIIlIIll) {
            lllllllllllllllIIlIllIlIIIIlIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int i = llllIIIIIlll[0];
        int[] iArr = new int[llllIIIIIlll[1]];
        iArr[llllIIIIIlll[2]] = llllIIIIIlll[3];
        List surrounding = TileItems.getSurrounding(worldLocation, i, iArr);
        if (!lIIIlllIlIIllll(surrounding) || lIIIlllIlIlIIII(surrounding.isEmpty() ? 1 : 0)) {
            return llllIIIIIlll[2];
        }
        surrounding.stream().findFirst().ifPresent(tileItem -> {
            tileItem.interact(llllIIIIIllI[llllIIIIIlll[2]]);
        });
        return llllIIIIIlll[1];
    }

    private static boolean lIIIlllIlIIllll(Object obj) {
        return obj != null;
    }
}
