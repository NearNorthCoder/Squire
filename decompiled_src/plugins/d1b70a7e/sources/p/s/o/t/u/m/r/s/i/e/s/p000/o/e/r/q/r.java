package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Gathering hammer", priority = 100, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.r  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/r.class */
public class r extends l {
    private static /* synthetic */ String[] lIIllIllllllI;
    private static /* synthetic */ int[] lIIllIlllllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if (lIllIIlIIIIIIIl(this.ar.t() ? 1 : 0)) {
            ?? r0 = lIIllIlllllll[0];
            "".length();
            return ((170 ^ 159) ^ (38 ^ 23)) == (((195 ^ 154) ^ (68 ^ 10)) & (((((10 + 136) - 101) + 111) ^ (((5 + 79) - 77) + 132)) ^ (-" ".length()))) ? ((144 ^ 176) ^ (29 ^ 2)) & (((149 ^ 143) ^ (61 ^ 24)) ^ (-" ".length())) & ((((36 ^ 61) ^ (20 ^ 85)) & (((((221 + 101) - 293) + 210) ^ (((128 + 20) - 70) + 105)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
        }
        return lIIllIlllllll[1];
    }

    private static boolean lIllIIlIIIIIlII(int i, int i2) {
        return i < i2;
    }

    @Inject
    protected r(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIllllllll() {
        lIIllIllllllI = new String[lIIllIlllllll[3]];
        lIIllIllllllI[lIIllIlllllll[1]] = lIllIIIllllllIl("6nNjmTGJJ/4=", "MBRHN");
        lIIllIllllllI[lIIllIlllllll[0]] = lIllIIIlllllllI("GwUnHA==", "OdLyy");
    }

    private static boolean lIllIIlIIIIIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        int[] iArr = new int[lIIllIlllllll[0]];
        iArr[lIIllIlllllll[1]] = lIIllIlllllll[2];
        if (lIllIIlIIIIIIlI(Inventory.getCount(iArr), lIIllIlllllll[0])) {
            int[] iArr2 = new int[lIIllIlllllll[0]];
            iArr2[lIIllIlllllll[1]] = lIIllIlllllll[2];
            Inventory.getFirst(iArr2).interact(lIIllIllllllI[lIIllIlllllll[1]]);
            return lIIllIlllllll[0];
        }
        c N = this.ar.N();
        Locatable R = N.R();
        if (lIllIIlIIIIIIll(R) && lIllIIlIIIIIIIl(this.au.a(R) ? 1 : 0)) {
            R.interact(lIIllIllllllI[lIIllIlllllll[0]]);
            return lIIllIlllllll[0];
        }
        this.au.b(N.Y());
        "".length();
        return lIIllIlllllll[1];
    }

    private static String lIllIIIllllllIl(String llllllllllllllIlllIllIlIIIlIIIlI, String llllllllllllllIlllIllIlIIIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIIllIlllllll[4]), "DES");
            Cipher llllllllllllllIlllIllIlIIIlIIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlIIIlIIlII.init(lIIllIlllllll[3], llllllllllllllIlllIllIlIIIlIIlIl);
            return new String(llllllllllllllIlllIllIlIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIIIlIIIll) {
            llllllllllllllIlllIllIlIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlllllllI(String llllllllllllllIlllIllIlIIIllIlll, String llllllllllllllIlllIllIlIIIllIllI) {
        String llllllllllllllIlllIllIlIIIllIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIlIIIllIlIl = new StringBuilder();
        char[] llllllllllllllIlllIllIlIIIllIlII = llllllllllllllIlllIllIlIIIllIllI.toCharArray();
        int llllllllllllllIlllIllIlIIIllIIll = lIIllIlllllll[1];
        char[] charArray = llllllllllllllIlllIllIlIIIllIlll2.toCharArray();
        int length = charArray.length;
        int i = lIIllIlllllll[1];
        while (lIllIIlIIIIIlII(i, length)) {
            llllllllllllllIlllIllIlIIIllIlIl.append((char) (charArray[i] ^ llllllllllllllIlllIllIlIIIllIlII[llllllllllllllIlllIllIlIIIllIIll % llllllllllllllIlllIllIlIIIllIlII.length]));
            "".length();
            llllllllllllllIlllIllIlIIIllIIll++;
            i++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllIlIIIllIlIl);
    }

    private static boolean lIllIIlIIIIIIIl(int i) {
        return i == 0;
    }

    static {
        lIllIIlIIIIIIII();
        lIllIIIllllllll();
    }

    private static void lIllIIlIIIIIIII() {
        lIIllIlllllll = new int[5];
        lIIllIlllllll[0] = " ".length();
        lIIllIlllllll[1] = (185 ^ 139) & ((153 ^ 171) ^ (-1));
        lIIllIlllllll[2] = (-28817) & 31163;
        lIIllIlllllll[3] = "  ".length();
        lIIllIlllllll[4] = (((13 + 8) - (-23)) + 109) ^ (((6 + 39) - 13) + 113);
    }

    private static boolean lIllIIlIIIIIIlI(int i, int i2) {
        return i > i2;
    }
}
