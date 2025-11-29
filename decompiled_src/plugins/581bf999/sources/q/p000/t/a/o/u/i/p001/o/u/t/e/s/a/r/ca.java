package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ca  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ca.class */
public abstract class ca extends AbstractC0015ao {
    protected static final /* synthetic */ int hA;
    private static /* synthetic */ int[] llIIIllllll;
    protected static final /* synthetic */ int hD;
    private static /* synthetic */ String[] llIIIlllllI;
    protected static final /* synthetic */ int[] hC;
    protected static final /* synthetic */ int hB;
    private static final /* synthetic */ int hE;

    private static boolean lIIllllllIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bm() {
        String[] strArr = new String[llIIIllllll[1]];
        strArr[llIIIllllll[2]] = llIIIlllllI[llIIIllllll[2]];
        TileObject tileObject = (TileObject) TileObjects.getAll(strArr).stream().max(Comparator.comparingInt((v0) -> {
            return v0.getWorldY();
        }).thenComparing((v0) -> {
            return v0.getWorldX();
        })).orElse(null);
        if (lIIllllllIIlll(tileObject)) {
            return llIIIllllll[2];
        }
        tileObject.interact(llIIIlllllI[llIIIllllll[1]]);
        return llIIIllllll[1];
    }

    private static String lIIllllllIIlII(String llllllllllllllllIlIIIIlIIlIlIlll, String llllllllllllllllIlIIIIlIIlIlIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIlIIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlIIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIllllll[5], llllllllllllllllIlIIIIlIIlIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIlIIlIllIII) {
            llllllllllllllllIlIIIIlIIlIllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        int[] iArr = hC;
        int length = iArr.length;
        int i = llIIIllllll[2];
        while (lIIllllllIlIIl(i, length)) {
            if (lIIllllllIlIII(aX(), iArr[i])) {
                return llIIIllllll[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((((144 + 5) - 141) + 137) ^ (((79 + 65) - 140) + 181)) & (((((23 + 169) - 150) + 141) ^ (((69 + 113) - 48) + 25)) ^ (-" ".length()));
            }
        }
        return llIIIllllll[2];
    }

    private static String lIIllllllIIIll(String llllllllllllllllIlIIIIlIIlIIlIlI, String llllllllllllllllIlIIIIlIIlIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), llIIIllllll[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllllll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIlIIlIIlIll) {
            llllllllllllllllIlIIIIlIIlIIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        int[] iArr = new int[llIIIllllll[1]];
        iArr[llIIIllllll[2]] = llIIIllllll[3];
        if (!lIIllllllIIlll(NPCs.getNearest(iArr)) || lIIllllllIlIII(aY(), llIIIllllll[4])) {
            ?? r0 = llIIIllllll[1];
            "".length();
            return (true ^ true) == ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIllllll[2];
    }

    private static boolean lIIllllllIIlll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        if (lIIllllllIlIlI(super.bn() ? 1 : 0)) {
            return llIIIllllll[1];
        }
        String[] strArr = new String[llIIIllllll[1]];
        strArr[llIIIllllll[2]] = llIIIlllllI[llIIIllllll[5]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIllllllIIlll(nearest)) {
            return llIIIllllll[2];
        }
        nearest.interact(llIIIlllllI[llIIIllllll[6]]);
        return llIIIllllll[1];
    }

    static {
        lIIllllllIIllI();
        lIIllllllIIlIl();
        hB = llIIIllllll[0];
        hD = llIIIllllll[3];
        hA = llIIIllllll[7];
        hE = llIIIllllll[4];
        int[] iArr = new int[llIIIllllll[8]];
        iArr[llIIIllllll[2]] = llIIIllllll[9];
        iArr[llIIIllllll[1]] = llIIIllllll[10];
        iArr[llIIIllllll[5]] = llIIIllllll[11];
        iArr[llIIIllllll[6]] = llIIIllllll[12];
        hC = iArr;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.mageGearAkkha();
    }

    private static boolean lIIllllllIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIllllllIIlIl() {
        llIIIlllllI = new String[llIIIllllll[8]];
        llIIIlllllI[llIIIllllll[2]] = lIIllllllIIIll("9FCL63bM+pA=", "xRBMx");
        llIIIlllllI[llIIIllllll[1]] = lIIllllllIIlII("25psxYDoTNHjC9+f8Wswcg==", "StsQB");
        llIIIlllllI[llIIIllllll[5]] = lIIllllllIIIll("HWFN7D2FKhg=", "vjSTP");
        llIIIlllllI[llIIIllllll[6]] = lIIllllllIIlII("1W5y967LzKz+e395N6/4xw==", "wGhOF");
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return llIIIllllll[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ca(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static void lIIllllllIIllI() {
        llIIIllllll = new int[14];
        llIIIllllll[0] = (-17069) & 32766;
        llIIIllllll[1] = " ".length();
        llIIIllllll[2] = ((115 ^ 110) ^ (31 ^ 5)) & (((((4 + 66) - (-100)) + 26) ^ (((82 + 72) - 66) + 107)) ^ (-" ".length()));
        llIIIllllll[3] = (-16389) & 28092;
        llIIIllllll[4] = ((197 + 51) - 119) + 71;
        llIIIllllll[5] = "  ".length();
        llIIIllllll[6] = "   ".length();
        llIIIllllll[7] = (-((-31249) & 32561)) & (-1) & 28607;
        llIIIllllll[8] = (97 ^ 1) ^ (119 ^ 19);
        llIIIllllll[9] = (-20546) & 32245;
        llIIIllllll[10] = (-((-10151) & 26543)) & (-4161) & 32253;
        llIIIllllll[11] = (-((-10277) & 10797)) & (-4162) & 16383;
        llIIIllllll[12] = (-577) & 12279;
        llIIIllllll[13] = 32 ^ 40;
    }

    private static boolean lIIllllllIlIII(int i, int i2) {
        return i == i2;
    }
}
