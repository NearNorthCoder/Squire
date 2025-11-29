package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 10000)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/z.class */
public class z extends AbstractC0000a {
    private static /* synthetic */ int[] lIlIlIIlllllI;
    private static /* synthetic */ String[] lIlIlIIllIIlI;

    private static void lIlllllIIlIIllI() {
        lIlIlIIlllllI = new int[6];
        lIlIlIIlllllI[0] = " ".length();
        lIlIlIIlllllI[1] = (172 ^ 191) & ((124 ^ 111) ^ (-1));
        lIlIlIIlllllI[2] = "   ".length();
        lIlIlIIlllllI[3] = "  ".length();
        lIlIlIIlllllI[4] = (138 ^ 169) ^ (105 ^ 78);
        lIlIlIIlllllI[5] = (110 ^ 39) ^ (34 ^ 99);
    }

    static {
        lIlllllIIlIIllI();
        lIlllllIIlIIlIl();
    }

    private static boolean lIlllllIIlIlIll(int i, int i2) {
        return i < i2;
    }

    private static void lIlllllIIlIIlIl() {
        lIlIlIIllIIlI = new String[lIlIlIIlllllI[4]];
        lIlIlIIllIIlI[lIlIlIIlllllI[1]] = lIlllllIIIIllII("4oQGtvzA4Ok=", "yVbUK");
        lIlIlIIllIIlI[lIlIlIIlllllI[0]] = lIlllllIIIIllIl("CSMO", "LBzTA");
        lIlIlIIllIIlI[lIlIlIIlllllI[3]] = lIlllllIIIIllII("u/TLdLdhrB4=", "yoMOB");
        lIlIlIIllIIlI[lIlIlIIlllllI[2]] = lIlllllIIIIlllI("CoaS9DPRpyQ=", "QsWfZ");
    }

    @Inject
    protected z(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        super(squireVardorvis, squireVardorvisConfig, c0004e, c0001b, client);
    }

    private static String lIlllllIIIIlllI(String llllllllllllllIllIlIllIllllIlIII, String llllllllllllllIllIlIllIllllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIllllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIllIllllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIllIllllIlIlI.init(lIlIlIIlllllI[3], secretKeySpec);
            return new String(llllllllllllllIllIlIllIllllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllIllllIlIIl) {
            llllllllllllllIllIlIllIllllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIlIlIIl(int i, int i2) {
        return i > i2;
    }

    private static String lIlllllIIIIllII(String llllllllllllllIllIlIllIlllllIlIl, String llllllllllllllIllIlIllIlllllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIlllllIlII.getBytes(StandardCharsets.UTF_8)), lIlIlIIlllllI[5]), "DES");
            Cipher llllllllllllllIllIlIllIlllllIlll = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIlllllIlll.init(lIlIlIIlllllI[3], secretKeySpec);
            return new String(llllllllllllllIllIlIllIlllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllIlllllIllI) {
            llllllllllllllIllIlIllIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIlIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.AbstractC0000a
    public boolean l() {
        if (lIlllllIIlIIlll(this.t.earlyBank() ? 1 : 0) && lIlllllIIlIlIII(Inventory.getCount(item -> {
            String[] strArr = new String[lIlIlIIlllllI[0]];
            strArr[lIlIlIIlllllI[1]] = lIlIlIIllIIlI[lIlIlIIlllllI[2]];
            return item.hasAction(strArr);
        }), lIlIlIIlllllI[0])) {
            this.s.c((boolean) lIlIlIIlllllI[0]);
            return lIlIlIIlllllI[1];
        } else if (lIlllllIIlIlIIl(Combat.getCurrentHealth(), this.t.eatAt())) {
            return lIlIlIIlllllI[1];
        } else {
            Item first = Inventory.getFirst(item2 -> {
                String[] strArr = new String[lIlIlIIlllllI[0]];
                strArr[lIlIlIIlllllI[1]] = lIlIlIIllIIlI[lIlIlIIlllllI[3]];
                return item2.hasAction(strArr);
            });
            if (lIlllllIIlIlIlI(first)) {
                Log.error(lIlIlIIllIIlI[lIlIlIIlllllI[1]]);
                this.s.c((boolean) lIlIlIIlllllI[0]);
                return lIlIlIIlllllI[1];
            }
            first.interact(lIlIlIIllIIlI[lIlIlIIlllllI[0]]);
            sleep(lIlIlIIlllllI[2]);
            return lIlIlIIlllllI[0];
        }
    }

    private static boolean lIlllllIIlIlIII(int i, int i2) {
        return i <= i2;
    }

    private static String lIlllllIIIIllIl(String llllllllllllllIllIlIllIlllIllIII, String llllllllllllllIllIlIllIlllIlIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIlllIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllIlllIlIllI = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIllIlllIlIlll.toCharArray();
        int llllllllllllllIllIlIllIlllIlIlII = lIlIlIIlllllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlllllI[1];
        while (lIlllllIIlIlIll(i, length)) {
            char llllllllllllllIllIlIllIlllIllIIl = charArray2[i];
            llllllllllllllIllIlIllIlllIlIllI.append((char) (llllllllllllllIllIlIllIlllIllIIl ^ charArray[llllllllllllllIllIlIllIlllIlIlII % charArray.length]));
            "".length();
            llllllllllllllIllIlIllIlllIlIlII++;
            i++;
            "".length();
            if ((((166 ^ 184) ^ (20 ^ 61)) & (((((47 + 58) - 89) + 171) ^ (((109 + 127) - 191) + 95)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIllIlllIlIllI);
    }

    private static boolean lIlllllIIlIlIlI(Object obj) {
        return obj == null;
    }
}
