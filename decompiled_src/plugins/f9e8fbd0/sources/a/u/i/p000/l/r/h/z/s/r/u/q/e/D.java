package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Banking", priority = 10, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.D  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/D.class */
public class D extends E {
    private static /* synthetic */ int[] lIllIlIIlIIll;
    private static /* synthetic */ String[] lIllIlIIlIIlI;

    private static boolean llIIIllllIlIIIl(int i) {
        return i != 0;
    }

    private static void llIIIllllIIlllI() {
        lIllIlIIlIIlI = new String[lIllIlIIlIIll[1]];
        lIllIlIIlIIlI[lIllIlIIlIIll[0]] = llIIIllllIIllIl("Np+pjRcZJ+OLGGijuktv+3n4QtvHs9yS/ibTYP8UUa8bA19B8ELqVs4wBHIYIOl6", "jvodK");
    }

    private static void llIIIllllIIllll() {
        lIllIlIIlIIll = new int[4];
        lIllIlIIlIIll[0] = ((((200 + 158) - 333) + 178) ^ (((50 + 139) - 43) + 52)) & (((33 ^ 6) ^ (69 ^ 111)) ^ (-" ".length()));
        lIllIlIIlIIll[1] = " ".length();
        lIllIlIIlIIll[2] = 91 ^ 94;
        lIllIlIIlIIll[3] = "  ".length();
    }

    private static String llIIIllllIIllIl(String llllllllllllllIllIIIllllIIIlIIlI, String llllllllllllllIllIIIllllIIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIIlIIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllllIIIlIIll) {
            llllllllllllllIllIIIllllIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllllIlIIII(int i) {
        return i == 0;
    }

    static {
        llIIIllllIIllll();
        llIIIllllIIlllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean ac() {
        if (llIIIllllIlIIII(ae().needsToBank() ? 1 : 0)) {
            Bank.close();
            return lIllIlIIlIIll[0];
        } else if (llIIIllllIlIIIl(this.Y.a(this.Y.O()) ? 1 : 0)) {
            return lIllIlIIlIIll[1];
        } else {
            if (llIIIllllIlIIIl(this.Z.isInInstancedRegion() ? 1 : 0)) {
                return lIllIlIIlIIll[0];
            }
            if (llIIIllllIlIIII(BankLoadouts.withdrawWithRetries(ae(), lIllIlIIlIIll[2]).booleanValue() ? 1 : 0)) {
                Log.info(lIllIlIIlIIlI[lIllIlIIlIIll[0]]);
                return lIllIlIIlIIll[0];
            }
            sleep(lIllIlIIlIIll[3]);
            return lIllIlIIlIIll[1];
        }
    }

    @Inject
    protected D(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, C0019t c0019t) {
        super(squireZulrah, squireZulrahConfig, client, c0019t);
    }
}
