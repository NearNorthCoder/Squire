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
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Rid extras", priority = 50)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.u  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/u.class */
public class u extends l {
    private static /* synthetic */ String[] lIIllIllIlIII;
    private static /* synthetic */ int[] lIIllIllIlIIl;

    private static void lIllIIIlIIllIlI() {
        lIIllIllIlIII = new String[lIIllIllIlIIl[4]];
        lIIllIllIlIII[lIIllIllIlIIl[1]] = lIllIIIlIIllIIl("0ctXm6VrG9w=", "wCzmD");
        lIIllIllIlIII[lIIllIllIlIIl[0]] = lIllIIIlIIllIIl("fTv6tPBwLQI=", "QEBYz");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        int[] iArr = new int[lIIllIllIlIIl[0]];
        iArr[lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
        if (lIllIIIlIIlllIl(Inventory.getCount(iArr), lIIllIllIlIIl[0])) {
            int[] iArr2 = new int[lIIllIllIlIIl[0]];
            iArr2[lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
            Inventory.getFirst(iArr2).interact(lIIllIllIlIII[lIIllIllIlIIl[1]]);
            return lIIllIllIlIIl[0];
        }
        if (lIllIIIlIIlllIl(this.ar.n(), this.as.numberOfBuckets())) {
            int[] iArr3 = new int[lIIllIllIlIIl[0]];
            iArr3[lIIllIllIlIIl[1]] = lIIllIllIlIIl[3];
            Inventory.getFirst(iArr3).interact(lIIllIllIlIII[lIIllIllIlIIl[0]]);
        }
        return lIIllIllIlIIl[1];
    }

    @Inject
    protected u(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIlIIllIll() {
        lIIllIllIlIIl = new int[6];
        lIIllIllIlIIl[0] = " ".length();
        lIIllIllIlIIl[1] = ((78 ^ 0) ^ (114 ^ 92)) & (((((121 + 21) - (-7)) + 106) ^ (((69 + 53) - 0) + 37)) ^ (-" ".length()));
        lIIllIllIlIIl[2] = (-24646) & 25599;
        lIIllIllIlIIl[3] = (-((-9769) & 26169)) & (-12385) & 32511;
        lIIllIllIlIIl[4] = "  ".length();
        lIIllIllIlIIl[5] = (104 ^ 1) ^ (160 ^ 193);
    }

    static {
        lIllIIIlIIllIll();
        lIllIIIlIIllIlI();
    }

    private static boolean lIllIIIlIIlllIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        int[] iArr = new int[lIIllIllIlIIl[0]];
        iArr[lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
        if (!lIllIIIlIIlllII(Inventory.getCount(iArr), lIIllIllIlIIl[0]) || lIllIIIlIIlllIl(this.ar.n(), this.as.numberOfBuckets())) {
            ?? r0 = lIIllIllIlIIl[0];
            "".length();
            return 0 != 0 ? ((179 ^ 145) ^ (188 ^ 139)) & (((168 ^ 141) ^ (37 ^ 21)) ^ (-" ".length())) : r0;
        }
        return lIIllIllIlIIl[1];
    }

    private static boolean lIllIIIlIIlllII(int i, int i2) {
        return i <= i2;
    }

    private static String lIllIIIlIIllIIl(String llllllllllllllIlllIlllIlIIIlIIll, String llllllllllllllIlllIlllIlIIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIllIlIIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIllIlIIl[4], llllllllllllllIlllIlllIlIIIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIlIIIlIlII) {
            llllllllllllllIlllIlllIlIIIlIlII.printStackTrace();
            return null;
        }
    }
}
