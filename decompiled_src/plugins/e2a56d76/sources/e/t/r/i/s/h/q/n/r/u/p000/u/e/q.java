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
@TaskDesc(name = "Looting items from a failed trap", priority = 50, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.q  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/q.class */
public class q extends j {
    private static /* synthetic */ String[] lllIlllIIIlI;
    private static /* synthetic */ int[] lllIlllIIllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int i = lllIlllIIllI[0];
        int[] iArr = new int[lllIlllIIllI[1]];
        iArr[lllIlllIIllI[2]] = lllIlllIIllI[3];
        iArr[lllIlllIIllI[4]] = lllIlllIIllI[5];
        List surrounding = TileItems.getSurrounding(worldLocation, i, iArr);
        if (!lIIIllIllIllllI(surrounding) || lIIIllIlllIIIIl(surrounding.isEmpty() ? 1 : 0)) {
            return lllIlllIIllI[2];
        }
        surrounding.stream().findFirst().ifPresent(tileItem -> {
            tileItem.interact(lllIlllIIIlI[lllIlllIIllI[2]]);
        });
        return lllIlllIIllI[4];
    }

    private static void lIIIllIllIllIlI() {
        lllIlllIIIlI = new String[lllIlllIIllI[4]];
        lllIlllIIIlI[lllIlllIIllI[2]] = lIIIllIllIllIIl("ziD1t+t7g3M=", "ryxKS");
    }

    private static boolean lIIIllIlllIIIIl(int i) {
        return i != 0;
    }

    @Inject
    public q(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.SALLIES);
    }

    static {
        lIIIllIllIlllIl();
        lIIIllIllIllIlI();
    }

    private static boolean lIIIllIllIllllI(Object obj) {
        return obj != null;
    }

    private static void lIIIllIllIlllIl() {
        lllIlllIIllI = new int[7];
        lllIlllIIllI[0] = 124 ^ 112;
        lllIlllIIllI[1] = "  ".length();
        lllIlllIIllI[2] = ((((147 + 88) - 218) + 169) ^ (((97 + 140) - 175) + 102)) & (((((11 + 42) - (-1)) + 87) ^ (((132 + 25) - 81) + 71)) ^ (-" ".length()));
        lllIlllIIllI[3] = (-((-16915) & 19991)) & (-20482) & 24511;
        lllIlllIIllI[4] = " ".length();
        lllIlllIIllI[5] = (-13969) & 14271;
        lllIlllIIllI[6] = (133 ^ 140) ^ " ".length();
    }

    private static String lIIIllIllIllIIl(String lllllllllllllllIIlIlllIIllllIIlI, String lllllllllllllllIIlIlllIIllllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIllllIIIl.getBytes(StandardCharsets.UTF_8)), lllIlllIIllI[6]), "DES");
            Cipher lllllllllllllllIIlIlllIIllllIlII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIIllllIlII.init(lllIlllIIllI[1], lllllllllllllllIIlIlllIIllllIlIl);
            return new String(lllllllllllllllIIlIlllIIllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIllllIIll) {
            lllllllllllllllIIlIlllIIllllIIll.printStackTrace();
            return null;
        }
    }
}
