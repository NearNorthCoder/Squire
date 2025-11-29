package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Entering next path", priority = 20, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.U  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/U.class */
public class U extends Z {
    private final /* synthetic */ TOAConfig ce;
    private final /* synthetic */ B cd;
    private static /* synthetic */ String[] lIllIlIlllI;
    private static final /* synthetic */ int cc;
    private static /* synthetic */ int[] lIllIlIllll;

    private static boolean lIIlIlllIlllIl(Object obj) {
        return obj != null;
    }

    private static String lIIlIlllIlIllI(String llllllllllllllllIlIlIIIlIIllIIlI, String llllllllllllllllIlIlIIIlIIllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIllll[4], llllllllllllllllIlIlIIIlIIllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIlIIllIIll) {
            llllllllllllllllIlIlIIIlIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIllIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    public boolean run() {
        if (lIIlIlllIllIlI(j(lIllIlIllll[0]) ? 1 : 0)) {
            return lIllIlIllll[1];
        }
        EnumC0063l[] enumC0063lArr = new EnumC0063l[lIllIlIllll[2]];
        enumC0063lArr[lIllIlIllll[1]] = this.ce.firstRoom();
        enumC0063lArr[lIllIlIllll[3]] = this.ce.secondRoom();
        enumC0063lArr[lIllIlIllll[4]] = this.ce.thirdRoom();
        enumC0063lArr[lIllIlIllll[5]] = this.ce.fourthRoom();
        int length = enumC0063lArr.length;
        int i = lIllIlIllll[1];
        while (lIIlIlllIllIll(i, length)) {
            EnumC0063l enumC0063l = enumC0063lArr[i];
            int[] iArr = new int[lIllIlIllll[3]];
            iArr[lIllIlIllll[1]] = enumC0063l.F();
            TileObject nearest = TileObjects.getNearest(iArr);
            if (!lIIlIlllIlllII(nearest)) {
                nearest.interact(lIllIlIlllI[lIllIlIllll[1]]);
                return lIllIlIllll[3];
            }
            this.cd.a(enumC0063l);
            "".length();
            if (0 != 0) {
                return ((69 ^ 102) ^ (180 ^ 193)) & (((187 ^ 165) ^ (112 ^ 56)) ^ (-" ".length()));
            }
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return ((91 ^ 18) ^ (15 ^ 114)) & (((159 ^ 197) ^ (10 ^ 100)) ^ (-" ".length()));
            }
        }
        String[] strArr = new String[lIllIlIllll[3]];
        strArr[lIllIlIllll[1]] = lIllIlIlllI[lIllIlIllll[3]];
        TileObject nearest2 = TileObjects.getNearest(strArr);
        if (lIIlIlllIlllIl(nearest2)) {
            nearest2.interact(lIllIlIlllI[lIllIlIllll[4]]);
            return lIllIlIllll[3];
        }
        return lIllIlIllll[1];
    }

    private static void lIIlIlllIllIII() {
        lIllIlIlllI = new String[lIllIlIllll[5]];
        lIllIlIlllI[lIllIlIllll[1]] = lIIlIlllIlIllI("ihPMuPJabsG/RMQjlTbKmA==", "BatbA");
        lIllIlIlllI[lIllIlIllll[3]] = lIIlIlllIlIlll("tmaZ+LO0NTM=", "IUMQK");
        lIllIlIlllI[lIllIlIllll[4]] = lIIlIlllIlIlll("ZVrC+vGh3WAKUtWW2rtQyA==", "mseIG");
    }

    private static boolean lIIlIlllIlllII(Object obj) {
        return obj == null;
    }

    static {
        lIIlIlllIllIIl();
        lIIlIlllIllIII();
        cc = lIllIlIllll[0];
    }

    private static void lIIlIlllIllIIl() {
        lIllIlIllll = new int[7];
        lIllIlIllll[0] = (-((-1158) & 19631)) & (-5) & 32637;
        lIllIlIllll[1] = ((64 ^ 110) ^ (43 ^ 18)) & (((124 ^ 87) ^ (43 ^ 23)) ^ (-" ".length()));
        lIllIlIllll[2] = 106 ^ 110;
        lIllIlIllll[3] = " ".length();
        lIllIlIllll[4] = "  ".length();
        lIllIlIllll[5] = "   ".length();
        lIllIlIllll[6] = 137 ^ 129;
    }

    @Inject
    protected U(Client client, B b, TOAConfig tOAConfig) {
        super(client);
        this.cd = b;
        this.ce = tOAConfig;
    }

    private static String lIIlIlllIlIlll(String llllllllllllllllIlIlIIIlIIlIIlIl, String llllllllllllllllIlIlIIIlIIlIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIllIlIllll[6]), "DES");
            Cipher llllllllllllllllIlIlIIIlIIlIIlll = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIlIIlIIlll.init(lIllIlIllll[4], secretKeySpec);
            return new String(llllllllllllllllIlIlIIIlIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIlIIlIIllI) {
            llllllllllllllllIlIlIIIlIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIllIlI(int i) {
        return i == 0;
    }
}
