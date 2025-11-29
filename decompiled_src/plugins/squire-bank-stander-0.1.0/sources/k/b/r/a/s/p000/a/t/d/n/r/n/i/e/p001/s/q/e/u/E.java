package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Picking up glass", blocking = true)
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.E  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/E.class */
public class E extends Task {
    private final /* synthetic */ BankStanderConfig t;
    private static /* synthetic */ String[] lllIlIIIIlI;
    private static /* synthetic */ int[] lllIlIIIIll;
    private final /* synthetic */ SquireBankStander s;

    static {
        lIlIlllIllllIl();
        lIlIlllIllllII();
    }

    private static void lIlIlllIllllII() {
        lllIlIIIIlI = new String[lllIlIIIIll[3]];
        lllIlIIIIlI[lllIlIIIIll[0]] = lIlIlllIlllIll("D3xOtHC03lY=", "QDMjs");
    }

    @Inject
    public E(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.s = squireBankStander;
        this.t = bankStanderConfig;
    }

    private static boolean lIlIllllIIIIII(int i) {
        return i != 0;
    }

    private static boolean lIlIlllIlllllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public boolean run() {
        if (lIlIlllIlllllI(this.t.glassMakePickGlass() ? 1 : 0)) {
            return lllIlIIIIll[0];
        }
        if (lIlIlllIllllll(this.s.b(), lllIlIIIIll[1]) && lIlIlllIlllllI(this.s.d() ? 1 : 0)) {
            return lllIlIIIIll[0];
        }
        if (lIlIllllIIIIII(Inventory.isFull() ? 1 : 0)) {
            if (lIlIllllIIIIII(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
            }
            return Bank.open();
        }
        if (lIlIllllIIIIIl(this.s.b(), lllIlIIIIll[2])) {
            this.s.a((boolean) lllIlIIIIll[3]);
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (lIlIllllIIIIll(tileItem.getId(), lllIlIIIIll[4])) {
                ?? r0 = lllIlIIIIll[3];
                "".length();
                return 0 != 0 ? ((62 ^ 114) ^ (88 ^ 119)) & (((12 ^ 18) ^ (229 ^ 152)) ^ (-" ".length())) : r0;
            }
            return lllIlIIIIll[0];
        });
        if (!lIlIllllIIIIlI(nearest)) {
            nearest.interact(lllIlIIIIlI[lllIlIIIIll[0]]);
            return lllIlIIIIll[3];
        }
        this.s.a((boolean) lllIlIIIIll[0]);
        this.s.a(lllIlIIIIll[0]);
        return lllIlIIIIll[0];
    }

    private static boolean lIlIllllIIIIll(int i, int i2) {
        return i == i2;
    }

    private static void lIlIlllIllllIl() {
        lllIlIIIIll = new int[6];
        lllIlIIIIll[0] = ((123 ^ 116) ^ (123 ^ 126)) & (((((41 + 20) - (-47)) + 69) ^ (((67 + 173) - 145) + 92)) ^ (-" ".length()));
        lllIlIIIIll[1] = (((41 + 11) - (-34)) + 48) ^ (((75 + 0) - (-11)) + 63);
        lllIlIIIIll[2] = (36 ^ 127) ^ (59 ^ 116);
        lllIlIIIIll[3] = " ".length();
        lllIlIIIIll[4] = (-2321) & 4095;
        lllIlIIIIll[5] = "  ".length();
    }

    private static boolean lIlIlllIllllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIllllIIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIlllIlllIll(String llllllllllllllllIIlIIllIlIlIIIIl, String llllllllllllllllIIlIIllIlIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIlIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIlIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIlIlIIIll.init(lllIlIIIIll[5], secretKeySpec);
            return new String(llllllllllllllllIIlIIllIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIlIlIIIlI) {
            llllllllllllllllIIlIIllIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIIIIlI(Object obj) {
        return obj == null;
    }
}
