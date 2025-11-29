package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
@TaskDesc(name = "Handling baba prayers", priority = Integer.MAX_VALUE)
/* renamed from: -.r.u.q.e.s.o.t.a.i.L  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/L.class */
public class L extends z {
    private static /* synthetic */ int[] lIIllllllIIlI;
    private static /* synthetic */ String[] lIIllllllIIIl;

    private static void lIllIlIlIlIIlll() {
        lIIllllllIIIl = new String[lIIllllllIIlI[0]];
        lIIllllllIIIl[lIIllllllIIlI[1]] = lIllIlIlIlIIllI("bupcCIVRam0=", "uyluF");
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayFlickBaba();
    }

    static {
        lIllIlIlIlIlIII();
        lIllIlIlIlIIlll();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        SquireTOA squireTOA = this.aS;
        int[] iArr = new int[lIIllllllIIlI[4]];
        iArr[lIIllllllIIlI[1]] = lIIllllllIIlI[5];
        iArr[lIIllllllIIlI[0]] = lIIllllllIIlI[6];
        iArr[lIIllllllIIlI[7]] = lIIllllllIIlI[2];
        return squireTOA.a(iArr);
    }

    @Inject
    public L(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        String[] strArr = new String[lIIllllllIIlI[0]];
        strArr[lIIllllllIIlI[1]] = lIIllllllIIIl[lIIllllllIIlI[1]];
        NPC nearest = NPCs.getNearest(strArr);
        return (lIllIlIlIlIlIIl(nearest) && lIllIlIlIlIlIlI(nearest.getId(), lIIllllllIIlI[2])) ? List.of(H()) : List.of(Prayer.PROTECT_FROM_MELEE, H());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        return lIIllllllIIlI[0];
    }

    private static boolean lIllIlIlIlIlIlI(int i, int i2) {
        return i == i2;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIIllllllIIlI[3];
    }

    private static void lIllIlIlIlIlIII() {
        lIIllllllIIlI = new int[9];
        lIIllllllIIlI[0] = " ".length();
        lIIllllllIIlI[1] = ("  ".length() ^ (0 ^ 40)) & (((247 ^ 175) ^ (123 ^ 9)) ^ (-" ".length()));
        lIIllllllIIlI[2] = (-20730) & 32509;
        lIIllllllIIlI[3] = (-(153 ^ 186)) & (-1162) & 16383;
        lIIllllllIIlI[4] = "   ".length();
        lIIllllllIIlI[5] = (-((-20650) & 20971)) & (-4153) & 16251;
        lIIllllllIIlI[6] = (-4213) & 15991;
        lIIllllllIIlI[7] = "  ".length();
        lIIllllllIIlI[8] = 5 ^ 13;
    }

    private static boolean lIllIlIlIlIlIIl(Object obj) {
        return obj != null;
    }

    private static String lIllIlIlIlIIllI(String llllllllllllllIlllIIlllllIlIIIll, String llllllllllllllIlllIIlllllIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIllllllIIlI[8]), "DES");
            Cipher llllllllllllllIlllIIlllllIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlllllIlIIlIl.init(lIIllllllIIlI[7], secretKeySpec);
            return new String(llllllllllllllIlllIIlllllIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlllllIlIIlII) {
            llllllllllllllIlllIIlllllIlIIlII.printStackTrace();
            return null;
        }
    }
}
