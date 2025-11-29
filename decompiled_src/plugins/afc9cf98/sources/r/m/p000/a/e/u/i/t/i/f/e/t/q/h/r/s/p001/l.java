package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
@TaskDesc(name = "Clearing blighted plants")
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.l  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/l.class */
public class l extends r {
    private static /* synthetic */ int[] lIIlllllllIlI;
    private static /* synthetic */ String[] lIIlllllllIII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        TileObject a = this.Z.a(tileObject -> {
            String[] strArr = new String[lIIlllllllIlI[1]];
            strArr[lIIlllllllIlI[0]] = lIIlllllllIII[lIIlllllllIlI[1]];
            return tileObject.hasAction(strArr);
        });
        if (lIllIllIIlIIIIl(a)) {
            return lIIlllllllIlI[0];
        }
        a.interact(lIIlllllllIII[lIIlllllllIlI[0]]);
        return lIIlllllllIlI[1];
    }

    private static String lIllIllIIIllIlI(String llllllllllllllIlllIIlIllIlIllIII, String llllllllllllllIlllIIlIllIlIlIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIllIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIllIlIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIllIlIllIlI.init(lIIlllllllIlI[2], llllllllllllllIlllIIlIllIlIllIll);
            return new String(llllllllllllllIlllIIlIllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIllIlIllIIl) {
            llllllllllllllIlllIIlIllIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIIIIl(Object obj) {
        return obj == null;
    }

    static {
        lIllIllIIIllllI();
        lIllIllIIIllIll();
    }

    private static void lIllIllIIIllIll() {
        lIIlllllllIII = new String[lIIlllllllIlI[2]];
        lIIlllllllIII[lIIlllllllIlI[0]] = lIllIllIIIllIlI("LqfDXZrLSQY=", "DLGxS");
        lIIlllllllIII[lIIlllllllIlI[1]] = lIllIllIIIllIlI("gJNW5BRR7SE=", "XzeVt");
    }

    private static void lIllIllIIIllllI() {
        lIIlllllllIlI = new int[3];
        lIIlllllllIlI[0] = ((178 ^ 148) ^ (158 ^ 136)) & (((((86 + 191) - 243) + 207) ^ (((162 + 79) - 110) + 62)) ^ (-" ".length()));
        lIIlllllllIlI[1] = " ".length();
        lIIlllllllIlI[2] = "  ".length();
    }

    @Inject
    protected l(i iVar) {
        super(iVar);
    }
}
