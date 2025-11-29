package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Banking", priority = 1337, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/o.class */
public class C0066o extends AbstractC0067p {
    private static /* synthetic */ int[] lIIlIIIlI;
    private static /* synthetic */ String[] lIIlIIIIl;

    static {
        lllllIllII();
        lllllIlIll();
    }

    @Inject
    public C0066o(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, C0000a c0000a) {
        super(squireCerberus, squireCerberusConfig, c0000a);
    }

    private static void lllllIlIll() {
        lIIlIIIIl = new String[lIIlIIIlI[4]];
        lIIlIIIIl[lIIlIIIlI[0]] = lllllIlIII("jO3CgtX58EeORcIJlsL3hDw9PspI7BBB", "AFgUY");
        lIIlIIIIl[lIIlIIIlI[1]] = lllllIlIII("yfOyq3lnp4VQG47GPvnpU3YWf2v/pA3VhXQWXR0fQgc=", "lNneV");
        lIIlIIIIl[lIIlIIIlI[3]] = lllllIlIlI("5F1mPXWzV1lhwcAV5Lyqv8qYFdHSyp8bbehxD9az3fx8qr7BHyU3apJ6A+TxBSa/qjgH7k88E8M=", "aJMVA");
    }

    private static boolean lllllIllIl(int i2) {
        return i2 == 0;
    }

    private static String lllllIlIII(String llIIlIIllIllIII, String llIIlIIllIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIIllIllIlI = Cipher.getInstance("Blowfish");
            llIIlIIllIllIlI.init(lIIlIIIlI[3], secretKeySpec);
            return new String(llIIlIIllIllIlI.doFinal(Base64.getDecoder().decode(llIIlIIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIllIllIIl) {
            llIIlIIllIllIIl.printStackTrace();
            return null;
        }
    }

    private static void lllllIllII() {
        lIIlIIIlI = new int[6];
        lIIlIIIlI[0] = ((242 ^ 162) ^ (118 ^ 18)) & (((((81 + 145) - 146) + 111) ^ (((5 + 134) - 40) + 40)) ^ (-" ".length()));
        lIIlIIIlI[1] = " ".length();
        lIIlIIIlI[2] = (49 ^ 81) ^ (206 ^ 171);
        lIIlIIIlI[3] = "  ".length();
        lIIlIIIlI[4] = "   ".length();
        lIIlIIIlI[5] = 110 ^ 102;
    }

    private static boolean lllllIlllI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    @Override // i.i.b.s.c.q.r.s.s.p000.u.a.e.AbstractC0067p
    public boolean V() {
        BankLoadout bankLoadout = (BankLoadout) this.av.bankLoadout().selected(BankLoadout.class);
        if (lllllIllIl(bankLoadout.needsToBank() ? 1 : 0)) {
            Log.info(lIIlIIIIl[lIIlIIIlI[0]]);
            this.at.b((boolean) lIIlIIIlI[0]);
            return lIIlIIIlI[0];
        } else if (lllllIlllI(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info(lIIlIIIIl[lIIlIIIlI[1]]);
            return lIIlIIIlI[0];
        } else if (lllllIllIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            "".length();
            return lIIlIIIlI[1];
        } else if (lllllIllIl(BankLoadouts.withdrawWithRetries(bankLoadout, lIIlIIIlI[2]).booleanValue() ? 1 : 0)) {
            Log.info(lIIlIIIIl[lIIlIIIlI[3]]);
            return lIIlIIIlI[0];
        } else {
            return lIIlIIIlI[0];
        }
    }

    private static String lllllIlIlI(String llIIlIIlllIIlIl, String llIIlIIlllIIlII) {
        try {
            SecretKeySpec llIIlIIlllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIlllIIlII.getBytes(StandardCharsets.UTF_8)), lIIlIIIlI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIIlI[3], llIIlIIlllIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlIIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIlllIIllI) {
            llIIlIIlllIIllI.printStackTrace();
            return null;
        }
    }
}
