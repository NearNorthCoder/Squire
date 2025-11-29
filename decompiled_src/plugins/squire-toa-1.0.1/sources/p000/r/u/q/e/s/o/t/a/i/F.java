package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
@TaskDesc(name = "Handling Obelisk Prayers", priority = Integer.MAX_VALUE)
/* renamed from: -.r.u.q.e.s.o.t.a.i.F  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/F.class */
public class F extends z {
    private static /* synthetic */ int[] lIlIIIIlIIlII;
    private static /* synthetic */ String[] lIlIIIIlIIIll;

    @Inject
    public F(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        return List.of(H());
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        return C();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayFlickObelisk();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        return this.aS.a(npc -> {
            return npc.getName().equals(lIlIIIIlIIIll[lIlIIIIlIIlII[1]]);
        });
    }

    private static void lIllIllIlIlIIll() {
        lIlIIIIlIIlII = new int[4];
        lIlIIIIlIIlII[0] = (-((-15153) & 32696)) & (-41) & 32767;
        lIlIIIIlIIlII[1] = ((209 ^ 180) ^ (43 ^ 44)) & (((87 ^ 14) ^ (72 ^ 115)) ^ (-" ".length()));
        lIlIIIIlIIlII[2] = " ".length();
        lIlIIIIlIIlII[3] = "  ".length();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIlIIIIlIIlII[0];
    }

    static {
        lIllIllIlIlIIll();
        lIllIllIlIlIIlI();
    }

    private static String lIllIllIlIlIIIl(String llllllllllllllIlllIIlIlIlIIIllIl, String llllllllllllllIlllIIlIlIlIIIllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIlIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIlIIIllll.init(lIlIIIIlIIlII[3], llllllllllllllIlllIIlIlIlIIlIIII);
            return new String(llllllllllllllIlllIIlIlIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIlIIIlllI) {
            llllllllllllllIlllIIlIlIlIIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIlIlIIlI() {
        lIlIIIIlIIIll = new String[lIlIIIIlIIlII[2]];
        lIlIIIIlIIIll[lIlIIIIlIIlII[1]] = lIllIllIlIlIIIl("WIl/Xuh8kVg=", "EtGNA");
    }
}
