package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
@TaskDesc(name = "Looting bird snare", priority = 1)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.D  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/D.class */
public class D extends j {
    private static /* synthetic */ int[] lllIllIllIll;
    private static /* synthetic */ String[] lllIllIllIlI;

    private static boolean lIIIllIllIIIIII(Object obj) {
        return obj != null;
    }

    static {
        lIIIllIlIllllll();
        lIIIllIlIlllllI();
    }

    private static void lIIIllIlIllllll() {
        lllIllIllIll = new int[5];
        lllIllIllIll[0] = "   ".length();
        lllIllIllIll[1] = " ".length();
        lllIllIllIll[2] = (195 ^ 140) & ((29 ^ 82) ^ (-1));
        lllIllIllIll[3] = (-16449) & 26454;
        lllIllIllIll[4] = "  ".length();
    }

    private static void lIIIllIlIlllllI() {
        lllIllIllIlI = new String[lllIllIllIll[1]];
        lllIllIllIlI[lllIllIllIll[2]] = lIIIllIlIllllIl("lQsxBEYy9vA=", "rDpPl");
    }

    private static String lIIIllIlIllllIl(String lllllllllllllllIIlIlllIllIIlllIl, String lllllllllllllllIIlIlllIllIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIllIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIllIIlllll.init(lllIllIllIll[4], secretKeySpec);
            return new String(lllllllllllllllIIlIlllIllIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIllIIllllI) {
            lllllllllllllllIIlIlllIllIIllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int i = lllIllIllIll[0];
        int[] iArr = new int[lllIllIllIll[1]];
        iArr[lllIllIllIll[2]] = lllIllIllIll[3];
        List surrounding = TileItems.getSurrounding(worldLocation, i, iArr);
        if (!lIIIllIllIIIIII(surrounding) || lIIIllIllIIIIIl(surrounding.isEmpty() ? 1 : 0)) {
            return lllIllIllIll[2];
        }
        if (lIIIllIllIIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lllIllIllIll[2];
        }
        surrounding.stream().findFirst().ifPresent(tileItem -> {
            tileItem.interact(lllIllIllIlI[lllIllIllIll[2]]);
        });
        return lllIllIllIll[1];
    }

    private static boolean lIIIllIllIIIIIl(int i) {
        return i != 0;
    }

    @Inject
    public D(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.BIRDS);
    }
}
