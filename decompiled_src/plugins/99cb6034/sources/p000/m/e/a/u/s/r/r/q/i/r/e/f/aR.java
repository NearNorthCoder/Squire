package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
@TaskDesc(name = "Opening the compost bin", priority = 35, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aR  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aR.class */
public class aR extends aN {
    private static /* synthetic */ String[] lIlllllIIllI;
    private static /* synthetic */ int[] lIlllllIIlll;

    private static boolean lllIllllIlllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lllIllllIlllII();
        lllIllllIllIll();
    }

    @Inject
    public aR(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client);
    }

    private static void lllIllllIlllII() {
        lIlllllIIlll = new int[3];
        lIlllllIIlll[0] = " ".length();
        lIlllllIIlll[1] = (91 ^ 59) & ((244 ^ 148) ^ (-1));
        lIlllllIIlll[2] = "  ".length();
    }

    private static boolean lllIllllIllllI(int i, int i2) {
        return i == i2;
    }

    private static String lllIllllIllIlI(String lllllllllllllllIlIllIIIIlllIIIIl, String lllllllllllllllIlIllIIIIlllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIIlllIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIIlllIIIll.init(lIlllllIIlll[2], secretKeySpec);
            return new String(lllllllllllllllIlIllIIIIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIIlllIIIlI) {
            lllllllllllllllIlIllIIIIlllIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean I(N n) {
        C0014an aI = n.aI();
        EnumC0021au aY = aI.aY();
        if (lllIllllIlllIl(aI.aZ(), EnumC0039n.GROWING) && lllIllllIllllI(aI.bb(), aY.bc() - lIlllllIIlll[0])) {
            ?? r0 = lIlllllIIlll[0];
            "".length();
            return "  ".length() != "  ".length() ? ((90 ^ 77) ^ (111 ^ 124)) & (((((111 + 56) - 111) + 77) ^ (((64 + 25) - 61) + 101)) ^ (-" ".length())) : r0;
        }
        return lIlllllIIlll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean b(TileObject tileObject) {
        tileObject.interact(lIlllllIIllI[lIlllllIIlll[1]]);
        return lIlllllIIlll[0];
    }

    private static void lllIllllIllIll() {
        lIlllllIIllI = new String[lIlllllIIlll[0]];
        lIlllllIIllI[lIlllllIIlll[1]] = lllIllllIllIlI("+6zoFWlS7Oc=", "lnhJJ");
    }
}
