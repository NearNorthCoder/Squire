package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Entering Realm", priority = 100)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.B  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/B.class */
public class B extends u {
    private static /* synthetic */ String[] lIlIllIlllIII;
    private static final /* synthetic */ int af;
    private static /* synthetic */ int[] lIlIllIlllIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        int[] iArr = new int[lIlIllIlllIIl[0]];
        iArr[lIlIllIlllIIl[1]] = lIlIllIlllIIl[2];
        Item first = Inventory.getFirst(iArr);
        if (!llIIIIIllIllIIl(first) && !llIIIIIllIllIlI(this.W.f() ? 1 : 0)) {
            first.interact(lIlIllIlllIII[lIlIllIlllIIl[1]]);
            return lIlIllIlllIIl[0];
        }
        return lIlIllIlllIIl[1];
    }

    private static void llIIIIIllIllIII() {
        lIlIllIlllIIl = new int[4];
        lIlIllIlllIIl[0] = " ".length();
        lIlIllIlllIIl[1] = (116 ^ 97) & ((140 ^ 153) ^ (-1));
        lIlIllIlllIIl[2] = (-4362) & 32717;
        lIlIllIlllIIl[3] = "  ".length();
    }

    static {
        llIIIIIllIllIII();
        llIIIIIllIlIlll();
        af = lIlIllIlllIIl[2];
    }

    private static String llIIIIIllIlIllI(String llllllllllllllIllIlIIIIlllIlIIll, String llllllllllllllIllIlIIIIlllIlIlII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIlllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIlllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIlllIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIlllIlIlll.init(lIlIllIlllIIl[3], llllllllllllllIllIlIIIIlllIllIII);
            return new String(llllllllllllllIllIlIIIIlllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIIlllIlIllI) {
            llllllllllllllIllIlIIIIlllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllIllIlI(int i) {
        return i != 0;
    }

    private static boolean llIIIIIllIllIIl(Object obj) {
        return obj == null;
    }

    private static void llIIIIIllIlIlll() {
        lIlIllIlllIII = new String[lIlIllIlllIIl[0]];
        lIlIllIlllIII[lIlIllIlllIIl[1]] = llIIIIIllIlIllI("FXEANjj4PdvOAMH8dhPZtA==", "EsNwX");
    }
}
