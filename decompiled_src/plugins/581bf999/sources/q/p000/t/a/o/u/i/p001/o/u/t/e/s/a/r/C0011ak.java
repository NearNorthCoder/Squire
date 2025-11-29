package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating Food", priority = 250)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ak  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ak.class */
public class C0011ak extends Z {
    private final /* synthetic */ C cN;
    private final /* synthetic */ SquireAutoTOA cO;
    private static /* synthetic */ int[] llIllIIlllI;
    private static /* synthetic */ String[] llIllIIllIl;

    @Inject
    protected C0011ak(Client client, C c, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cN = c;
        this.cO = squireAutoTOA;
    }

    private static boolean lIlIlIIlIlllIl(int i) {
        return i != 0;
    }

    private static void lIlIlIIlIlllII() {
        llIllIIlllI = new int[4];
        llIllIIlllI[0] = ((((130 + 148) - 111) + 11) ^ (((178 + 160) - 336) + 181)) & (((((139 + 31) - 58) + 51) ^ (((129 + 30) - 144) + 151)) ^ (-" ".length()));
        llIllIIlllI[1] = " ".length();
        llIllIIlllI[2] = "  ".length();
        llIllIIlllI[3] = 100 ^ 108;
    }

    private static String lIlIlIIlIllIlI(String llllllllllllllllIIlIllIlllllIllI, String llllllllllllllllIIlIllIlllllIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIllllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlllllIlIl.getBytes(StandardCharsets.UTF_8)), llIllIIlllI[3]), "DES");
            Cipher llllllllllllllllIIlIllIllllllIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIllIllllllIII.init(llIllIIlllI[2], llllllllllllllllIIlIllIllllllIIl);
            return new String(llllllllllllllllIIlIllIllllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIlllllIlll) {
            llllllllllllllllIIlIllIlllllIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    public boolean run() {
        if (!lIlIlIIlIlllIl(this.cO.e() ? 1 : 0) && !lIlIlIIlIllllI(this.cu.isInInstancedRegion() ? 1 : 0)) {
            if (!lIlIlIIlIlllIl(this.cN.al() ? 1 : 0) || lIlIlIIlIllllI(this.cN.ar() ? 1 : 0)) {
                return llIllIIlllI[0];
            }
            Item first = Inventory.getFirst(item -> {
                String str = llIllIIllIl[llIllIIlllI[1]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (lIlIlIIlIlllll(first)) {
                this.cN.an();
                first.interact(llIllIIllIl[llIllIIlllI[0]]);
                return llIllIIlllI[1];
            }
            return llIllIIlllI[0];
        }
        return llIllIIlllI[0];
    }

    private static boolean lIlIlIIlIlllll(Object obj) {
        return obj != null;
    }

    static {
        lIlIlIIlIlllII();
        lIlIlIIlIllIll();
    }

    private static boolean lIlIlIIlIllllI(int i) {
        return i == 0;
    }

    private static void lIlIlIIlIllIll() {
        llIllIIllIl = new String[llIllIIlllI[2]];
        llIllIIllIl[llIllIIlllI[0]] = lIlIlIIlIllIlI("qt0edL2RjDg=", "bjDqZ");
        llIllIIllIl[llIllIIlllI[1]] = lIlIlIIlIllIlI("wVqQK4EEP6s=", "mUANe");
    }
}
