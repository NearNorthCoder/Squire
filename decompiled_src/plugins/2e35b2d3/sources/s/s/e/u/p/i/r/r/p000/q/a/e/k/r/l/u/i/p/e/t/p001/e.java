package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Checking for Task", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.e  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/e.class */
public class e extends Task {
    private static /* synthetic */ String[] lIlIIlIlIIllI;
    private static /* synthetic */ int[] lIlIIlIlIlIIl;
    private static final /* synthetic */ Logger z;
    private final /* synthetic */ SquireSkipperPlugin A;

    private static String lIlllIllIIIIIII(String llllllllllllllIllIlllIIIlIllllII, String llllllllllllllIllIlllIIIlIlllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIIlIlllIll.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIlIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIlIlIIl[4], llllllllllllllIllIlllIIIlIllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIIIlIllllIl) {
            llllllllllllllIllIlllIIIlIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllIIlIIlI(int i, int i2) {
        return i < i2;
    }

    static {
        lIlllIllIIIlllI();
        lIlllIllIIIIIIl();
        z = LoggerFactory.getLogger(e.class);
    }

    @Inject
    public e(SquireSkipperPlugin squireSkipperPlugin) {
        this.A = squireSkipperPlugin;
    }

    private static void lIlllIllIIIIIIl() {
        lIlIIlIlIIllI = new String[lIlIIlIlIlIIl[5]];
        lIlIIlIlIIllI[lIlIIlIlIlIIl[1]] = lIlllIlIllllllI("BBkCJzo=", "GqgDQ");
        lIlIIlIlIIllI[lIlIIlIlIlIIl[2]] = lIlllIlIlllllll("Xuki3ejpGHk=", "YnjqK");
        lIlIIlIlIIllI[lIlIIlIlIlIIl[4]] = lIlllIllIIIIIII("vUPLQZeNxESdFSbOBQE3GA==", "HIdiX");
    }

    private static void lIlllIllIIIlllI() {
        lIlIIlIlIlIIl = new int[7];
        lIlIIlIlIlIIl[0] = (-24585) & 28653;
        lIlIIlIlIlIIl[1] = ((214 ^ 152) ^ (186 ^ 160)) & (((223 ^ 163) ^ (87 ^ 127)) ^ (-" ".length()));
        lIlIIlIlIlIIl[2] = " ".length();
        lIlIIlIlIlIIl[3] = (-((-1189) & 27877)) & (-1025) & 31867;
        lIlIIlIlIlIIl[4] = "  ".length();
        lIlIIlIlIlIIl[5] = "   ".length();
        lIlIIlIlIlIIl[6] = (((177 + 96) - 270) + 188) ^ (((13 + 122) - 26) + 74);
    }

    private static String lIlllIlIllllllI(String llllllllllllllIllIlllIIIlIlIllII, String llllllllllllllIllIlllIIIlIlIlIll) {
        String llllllllllllllIllIlllIIIlIlIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlllIIIlIlIlIIl = llllllllllllllIllIlllIIIlIlIlIll.toCharArray();
        int llllllllllllllIllIlllIIIlIlIlIII = lIlIIlIlIlIIl[1];
        char[] charArray = llllllllllllllIllIlllIIIlIlIllII2.toCharArray();
        int llllllllllllllIllIlllIIIlIlIIIIl = charArray.length;
        int i = lIlIIlIlIlIIl[1];
        while (lIlllIllIIlIIlI(i, llllllllllllllIllIlllIIIlIlIIIIl)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIlllIIIlIlIlIIl[llllllllllllllIllIlllIIIlIlIlIII % llllllllllllllIllIlllIIIlIlIlIIl.length]));
            "".length();
            llllllllllllllIllIlllIIIlIlIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlllIlIlllllll(String llllllllllllllIllIlllIIIllIIlIIl, String llllllllllllllIllIlllIIIllIIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIlIlIIl[4], llllllllllllllIllIlllIIIllIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIIIllIIlIlI) {
            llllllllllllllIllIlllIIIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllIIlIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        b b = this.A.b();
        this.A.d(Static.getClient().getVarbitValue(lIlIIlIlIlIIl[0]));
        if (!lIlllIllIIIllll(b) || lIlllIllIIlIIII(this.A.c() ? 1 : 0)) {
            return lIlIIlIlIlIIl[1];
        }
        Item first = Equipment.getFirst(item -> {
            return item.getName().toLowerCase().contains(lIlIIlIlIIllI[lIlIIlIlIlIIl[4]]);
        });
        if (lIlllIllIIlIIIl(first)) {
            first.interact(lIlIIlIlIIllI[lIlIIlIlIlIIl[1]]);
            return lIlIIlIlIlIIl[2];
        }
        int[] iArr = new int[lIlIIlIlIlIIl[2]];
        iArr[lIlIIlIlIlIIl[1]] = lIlIIlIlIlIIl[3];
        Item first2 = Inventory.getFirst(iArr);
        if (lIlllIllIIlIIIl(first2)) {
            first2.interact(lIlIIlIlIIllI[lIlIIlIlIlIIl[2]]);
            return lIlIIlIlIlIIl[2];
        }
        return lIlIIlIlIlIIl[1];
    }

    private static boolean lIlllIllIIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIllIIlIIIl(Object obj) {
        return obj != null;
    }
}
