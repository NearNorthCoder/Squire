package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Consuming peaches", priority = 5, blocking = true)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.B  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/B.class */
public class B extends Task {
    private final /* synthetic */ C0006g aA;
    private static /* synthetic */ int[] lIIlIIllllIlI;
    private final /* synthetic */ C0000a aB;
    private static /* synthetic */ String[] lIIlIIlllIlll;

    private static boolean lIlIlIlIlIlllll(int i) {
        return i == 0;
    }

    private static void lIlIlIlIlIlllII() {
        lIIlIIllllIlI = new int[4];
        lIIlIIllllIlI[0] = (123 ^ 99) & ((140 ^ 148) ^ (-1));
        lIIlIIllllIlI[1] = 111 ^ 103;
        lIIlIIllllIlI[2] = " ".length();
        lIIlIIllllIlI[3] = "  ".length();
    }

    private static void lIlIlIlIlIlIllI() {
        lIIlIIlllIlll = new String[lIIlIIllllIlI[3]];
        lIIlIIlllIlll[lIIlIIllllIlI[0]] = lIlIlIlIlIlIIlI("nyNEm266Tso=", "hjPXG");
        lIIlIIlllIlll[lIIlIIllllIlI[2]] = lIlIlIlIlIlIlIl("lsHZI4bwyLQ=", "EdWda");
    }

    static {
        lIlIlIlIlIlllII();
        lIlIlIlIlIlIllI();
    }

    private static boolean lIlIlIlIllIIIII(Object obj) {
        return obj == null;
    }

    @Inject
    public B(C0006g c0006g, C0000a c0000a) {
        this.aA = c0006g;
        this.aB = c0000a;
    }

    private static boolean lIlIlIlIlIllllI(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIlIlIlIlIIlI(String llllllllllllllIlllllIIlIIllllIIl, String llllllllllllllIlllllIIlIIllllIII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIlIIllllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIlIIllllIll.init(lIIlIIllllIlI[3], llllllllllllllIlllllIIlIIlllllII);
            return new String(llllllllllllllIlllllIIlIIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIlIIllllIlI) {
            llllllllllllllIlllllIIlIIllllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIlIlIlIlllIl(this.aA.m() ? 1 : 0) || lIlIlIlIlIlllIl(this.aA.l() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        if (!lIlIlIlIlIllllI(Combat.getMissingHealth(), lIIlIIllllIlI[1]) || lIlIlIlIlIlllll(this.aB.d() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        if (lIlIlIlIlIlllIl(this.aA.o() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().toLowerCase().contains(lIIlIIlllIlll[lIIlIIllllIlI[2]]);
        });
        if (lIlIlIlIllIIIII(first)) {
            return lIIlIIllllIlI[0];
        }
        first.interact(lIIlIIlllIlll[lIIlIIllllIlI[0]]);
        this.aB.c();
        return lIIlIIllllIlI[2];
    }

    private static boolean lIlIlIlIlIlllIl(int i) {
        return i != 0;
    }

    private static String lIlIlIlIlIlIlIl(String llllllllllllllIlllllIIlIIllIllII, String llllllllllllllIlllllIIlIIllIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIIllIlIll.getBytes(StandardCharsets.UTF_8)), lIIlIIllllIlI[1]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIllllIlI[3], llllllllllllllIlllllIIlIIllIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIlIIllIllIl) {
            llllllllllllllIlllllIIlIIllIllIl.printStackTrace();
            return null;
        }
    }
}
