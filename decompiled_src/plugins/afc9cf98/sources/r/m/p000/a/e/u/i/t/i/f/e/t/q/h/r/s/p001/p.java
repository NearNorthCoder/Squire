package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameObject;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Harvesting Plant")
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.p  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/p.class */
public class p extends r {
    private static /* synthetic */ String[] lIlIIIIIlIIll;
    private static /* synthetic */ int[] lIlIIIIIlIlIl;

    @Inject
    protected p(i iVar) {
        super(iVar);
    }

    private static boolean lIllIlllIIIIIIl(int i) {
        return i != 0;
    }

    static {
        lIllIllIllllllI();
        lIllIllIlllllIl();
    }

    private static boolean lIllIllIlllllll(Object obj) {
        return obj != null;
    }

    private static String lIllIllIlllllII(String llllllllllllllIlllIIlIIIIIllIIll, String llllllllllllllIlllIIlIIIIIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlIl[4]), "DES");
            Cipher llllllllllllllIlllIIlIIIIIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIIIIIllIlIl.init(lIlIIIIIlIlIl[2], llllllllllllllIlllIIlIIIIIllIllI);
            return new String(llllllllllllllIlllIIlIIIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIIIIllIlII) {
            llllllllllllllIlllIIlIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean run() {
        if (lIllIllIlllllll(this.Z.a(lIlIIIIIlIIll[lIlIIIIIlIlIl[0]]))) {
            return lIlIIIIIlIlIl[0];
        }
        GameObject a = this.Z.a(lIlIIIIIlIIll[lIlIIIIIlIlIl[1]]);
        if (lIllIlllIIIIIII(a)) {
            return lIlIIIIIlIlIl[0];
        }
        a.interact(lIlIIIIIlIIll[lIlIIIIIlIlIl[2]]);
        if (lIllIlllIIIIIIl(a.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldArea()) ? 1 : 0)) {
            sleep(lIlIIIIIlIlIl[2]);
        }
        return lIlIIIIIlIlIl[1];
    }

    private static boolean lIllIlllIIIIIII(Object obj) {
        return obj == null;
    }

    private static String lIllIllIlllIlII(String llllllllllllllIlllIIlIIIIlIIIIII, String llllllllllllllIlllIIlIIIIIllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIIIlIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIIIlIIIIlI.init(lIlIIIIIlIlIl[2], secretKeySpec);
            return new String(llllllllllllllIlllIIlIIIIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIIIlIIIIIl) {
            llllllllllllllIlllIIlIIIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIlllllIl() {
        lIlIIIIIlIIll = new String[lIlIIIIIlIlIl[3]];
        lIlIIIIIlIIll[lIlIIIIIlIlIl[0]] = lIllIllIlllIlII("9N0ItudF6oY=", "eGOcW");
        lIlIIIIIlIIll[lIlIIIIIlIlIl[1]] = lIllIllIlllIlII("nYp+WMDIxa4=", "OHWev");
        lIlIIIIIlIIll[lIlIIIIIlIlIl[2]] = lIllIllIlllllII("HgdB6zysO6w=", "pizWV");
    }

    private static void lIllIllIllllllI() {
        lIlIIIIIlIlIl = new int[5];
        lIlIIIIIlIlIl[0] = (102 ^ 90) & ((12 ^ 48) ^ (-1));
        lIlIIIIIlIlIl[1] = " ".length();
        lIlIIIIIlIlIl[2] = "  ".length();
        lIlIIIIIlIlIl[3] = "   ".length();
        lIlIIIIIlIlIl[4] = 40 ^ 32;
    }
}
