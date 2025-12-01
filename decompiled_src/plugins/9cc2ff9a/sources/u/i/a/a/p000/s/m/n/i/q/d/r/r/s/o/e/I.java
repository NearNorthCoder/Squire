package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Equipping Bowfa")
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.I  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/I.class */
public class I extends Task {
    private static /* synthetic */ int[] lIIlIlIIIIlII;
    private final /* synthetic */ C0006g aR;
    private final /* synthetic */ SquireSaraConfig aQ;
    private static /* synthetic */ String[] lIIlIlIIIIIll;

    private static void lIlIlIlIlllllIl() {
        lIIlIlIIIIIll = new String[lIIlIlIIIIlII[3]];
        lIIlIlIIIIIll[lIIlIlIIIIlII[0]] = lIlIlIlIlllllII("b3zoUOFJrM4=", "kBRBH");
        lIIlIlIIIIIll[lIIlIlIIIIlII[2]] = lIlIlIlIlllllII("J9NjXxA10cKvlWp+I7kzcw==", "QXJnJ");
    }

    private static boolean lIlIlIllIIIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIlIlllllll(int i) {
        return i == 0;
    }

    static {
        lIlIlIlIllllllI();
        lIlIlIlIlllllIl();
    }

    private static boolean lIlIlIllIIIIIII(int i) {
        return i != 0;
    }

    @Inject
    public I(SquireSaraConfig squireSaraConfig, C0006g c0006g) {
        this.aQ = squireSaraConfig;
        this.aR = c0006g;
    }

    private static void lIlIlIlIllllllI() {
        lIIlIlIIIIlII = new int[4];
        lIIlIlIIIIlII[0] = (237 ^ 183) & ((239 ^ 181) ^ (-1));
        lIIlIlIIIIlII[1] = (((38 + 30) - 14) + 151) ^ (((26 + 30) - 6) + 149);
        lIIlIlIIIIlII[2] = " ".length();
        lIIlIlIIIIlII[3] = "  ".length();
    }

    private static String lIlIlIlIlllllII(String llllllllllllllIlllllIIIllIIllIIl, String llllllllllllllIlllllIIIllIIllIII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIIllIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIIllIIllIll.init(lIIlIlIIIIlII[3], llllllllllllllIlllllIIIllIIlllII);
            return new String(llllllllllllllIlllllIIIllIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIllIIllIlI) {
            llllllllllllllIlllllIIIllIIllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    public boolean run() {
        if (lIlIlIlIlllllll(this.aQ.useBlowpipe() ? 1 : 0)) {
            return lIIlIlIIIIlII[0];
        }
        if (lIlIlIllIIIIIII(this.aR.o() ? 1 : 0) && lIlIlIlIlllllll(this.aR.l() ? 1 : 0) && lIlIlIllIIIIIIl(this.aR.k(), lIIlIlIIIIlII[1])) {
            return lIIlIlIIIIlII[0];
        }
        if (lIlIlIllIIIIIlI(this.aR.t()) && lIlIlIllIIIIIII(this.aR.t().B() ? 1 : 0)) {
            return lIIlIlIIIIlII[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lIIlIlIIIIIll[lIIlIlIIIIlII[2]]);
        });
        if (lIlIlIllIIIIIlI(first)) {
            first.interact(lIIlIlIIIIIll[lIIlIlIIIIlII[0]]);
            return lIIlIlIIIIlII[2];
        }
        return lIIlIlIIIIlII[0];
    }

    private static boolean lIlIlIllIIIIIlI(Object obj) {
        return obj != null;
    }
}
