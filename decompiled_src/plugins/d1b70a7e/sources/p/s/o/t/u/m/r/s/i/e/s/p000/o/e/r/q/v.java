package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
@TaskDesc(name = "Boarding ship", priority = 10, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.v  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/v.class */
public class v extends x {
    private static /* synthetic */ int[] lIIlllIIIIlIl;
    private static /* synthetic */ String[] lIIlllIIIIlII;

    @Inject
    protected v(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    static {
        lIllIIlIIIllIIl();
        lIllIIlIIIllIII();
    }

    private static boolean lIllIIlIIIllIll(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIlIIIlllII(int i) {
        return i != 0;
    }

    private static boolean lIllIIlIIIlllIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.x
    public boolean al() {
        Player local = Players.getLocal();
        if (!lIllIIlIIIllIll(local) && !lIllIIlIIIlllII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            int i = lIIlllIIIIlIl[1];
            int i2 = lIIlllIIIIlIl[2];
            int i3 = lIIlllIIIIlIl[0];
            int[] iArr = new int[lIIlllIIIIlIl[3]];
            iArr[lIIlllIIIIlIl[0]] = lIIlllIIIIlIl[4];
            TileObject firstAt = TileObjects.getFirstAt(i, i2, i3, iArr);
            if (lIllIIlIIIllIll(firstAt)) {
                return lIIlllIIIIlIl[0];
            }
            if (!lIllIIlIIIlllIl(local.getWorldLocation().getX(), firstAt.getWorldLocation().getX()) || lIllIIlIIIlllII(local.isMoving() ? 1 : 0)) {
                return lIIlllIIIIlIl[0];
            }
            if (lIllIIlIIIlllII(this.az.solo() ? 1 : 0)) {
                firstAt.interact(lIIlllIIIIlII[lIIlllIIIIlIl[0]]);
                return lIIlllIIIIlIl[3];
            }
            firstAt.interact(lIIlllIIIIlII[lIIlllIIIIlIl[3]]);
            return lIIlllIIIIlIl[3];
        }
        return lIIlllIIIIlIl[0];
    }

    private static void lIllIIlIIIllIII() {
        lIIlllIIIIlII = new String[lIIlllIIIIlIl[5]];
        lIIlllIIIIlII[lIIlllIIIIlIl[0]] = lIllIIlIIIlIlll("XzMH3brbAVdhDar3atMb9A==", "Kcvxz");
        lIIlllIIIIlII[lIIlllIIIIlIl[3]] = lIllIIlIIIlIlll("TyG9lV5RQBaSd4IgXd+JTQ==", "nEIOb");
    }

    private static void lIllIIlIIIllIIl() {
        lIIlllIIIIlIl = new int[6];
        lIIlllIIIIlIl[0] = ((((76 + 108) - 155) + 117) ^ (((173 + 30) - 33) + 6)) & (((203 ^ 158) ^ (237 ^ 154)) ^ (-" ".length()));
        lIIlllIIIIlIl[1] = (-5057) & 8191;
        lIIlllIIIIlIl[2] = (-((-2801) & 23281)) & (-9285) & 32604;
        lIIlllIIIIlIl[3] = " ".length();
        lIIlllIIIIlIl[4] = (-1699) & 43003;
        lIIlllIIIIlIl[5] = "  ".length();
    }

    private static String lIllIIlIIIlIlll(String llllllllllllllIlllIllIIlIllIlIIl, String llllllllllllllIlllIllIIlIllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIlIllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIlIllIlIll.init(lIIlllIIIIlIl[5], secretKeySpec);
            return new String(llllllllllllllIlllIllIIlIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIlIllIlIlI) {
            llllllllllllllIlllIllIIlIllIlIlI.printStackTrace();
            return null;
        }
    }
}
