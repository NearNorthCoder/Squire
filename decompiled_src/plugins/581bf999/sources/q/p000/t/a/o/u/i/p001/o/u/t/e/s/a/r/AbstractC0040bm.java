package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bm  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bm.class */
public abstract class AbstractC0040bm extends AbstractC0015ao {
    private static /* synthetic */ int[] llIlllIIllI;
    protected final /* synthetic */ C0067p fh;
    private static /* synthetic */ String[] llIlllIIlIl;
    protected static final /* synthetic */ int fg;

    private static boolean lIlIlIllIIllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        String[] strArr = new String[llIlllIIllI[2]];
        strArr[llIlllIIllI[1]] = llIlllIIlIl[llIlllIIllI[3]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (!lIlIlIllIIlIII(nearest) || lIlIlIllIIIlll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            return llIlllIIllI[1];
        }
        nearest.interact(llIlllIIlIl[llIlllIIllI[4]]);
        return llIlllIIllI[2];
    }

    public abstract boolean bY();

    private static boolean lIlIlIllIIlIIl(Object obj) {
        return obj == null;
    }

    static {
        lIlIlIllIIIllI();
        lIlIlIllIIIlIl();
        fg = llIlllIIllI[0];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.rangedP2Warden();
    }

    private static boolean lIlIlIllIIlIlI(int i, int i2) {
        return i <= i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return llIlllIIllI[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0040bm(Client client, C0077z c0077z, TOAConfig tOAConfig, C0067p c0067p) {
        super(client, c0077z, tOAConfig);
        this.fh = c0067p;
    }

    private static boolean lIlIlIllIIlIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        return llIlllIIllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIlIlIllIIlllI(tileObject.getName().equals(llIlllIIlIl[llIlllIIllI[6]]) ? 1 : 0)) {
                String[] strArr = new String[llIlllIIllI[2]];
                strArr[llIlllIIllI[1]] = llIlllIIlIl[llIlllIIllI[7]];
                if (lIlIlIllIIlllI(tileObject.hasAction(strArr) ? 1 : 0) && lIlIlIllIIllIl(tileObject.getWorldX(), this.cu.getLocalPlayer().getWorldX())) {
                    ?? r0 = llIlllIIllI[2];
                    "".length();
                    return "  ".length() == (-" ".length()) ? ((59 ^ 10) ^ (12 ^ 110)) & (((163 ^ 170) ^ (47 ^ 117)) ^ (-" ".length())) : r0;
                }
            }
            return llIlllIIllI[1];
        });
        if (lIlIlIllIIlIII(nearest)) {
            nearest.interact(llIlllIIlIl[llIlllIIllI[1]]);
            return llIlllIIllI[2];
        }
        TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
            if (lIlIlIllIIlIll(tileObject2.getId(), llIlllIIllI[5]) && lIlIlIllIIllIl(tileObject2.getWorldX(), this.cu.getLocalPlayer().getWorldX())) {
                ?? r0 = llIlllIIllI[2];
                "".length();
                return 0 != 0 ? ((((74 + 151) - (-4)) + 9) ^ (((28 + 48) - (-57)) + 34)) & (((3 ^ 69) ^ (99 ^ 108)) ^ (-" ".length())) : r0;
            }
            return llIlllIIllI[1];
        });
        if (lIlIlIllIIlIIl(nearest2)) {
            return llIlllIIllI[1];
        }
        if (lIlIlIllIIlIIl(TileObjects.getNearest(tileObject3 -> {
            if (lIlIlIllIIlIll(tileObject3.getId(), llIlllIIllI[5]) && lIlIlIllIIlIll(tileObject3.getWorldX(), nearest2.getWorldX()) && lIlIlIllIIllII(tileObject3, nearest2)) {
                ?? r0 = llIlllIIllI[2];
                "".length();
                return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlllIIllI[1];
        }))) {
            String str = llIlllIIlIl[llIlllIIllI[2]];
            Object[] objArr = new Object[llIlllIIllI[2]];
            objArr[llIlllIIllI[1]] = Integer.valueOf(nearest2.getWorldX());
            Log.info(str, objArr);
            this.fh.g(nearest2.getWorldX());
        }
        return lIlIlIllIIlIlI(bZ(), this.fh.Z()) ? llIlllIIllI[1] : bY();
    }

    private static boolean lIlIlIllIIlllI(int i) {
        return i != 0;
    }

    private static String lIlIlIllIIIlII(String llllllllllllllllIIlIlIllIIIlllII, String llllllllllllllllIIlIlIllIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIllIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllIIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIllIIIlllIl) {
            llllllllllllllllIIlIlIllIIIlllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        if (lIlIlIllIIIlll(bj() ? 1 : 0)) {
            ?? r0 = llIlllIIllI[2];
            "".length();
            return (("  ".length() ^ (196 ^ 131)) & (((17 ^ 32) ^ (68 ^ 48)) ^ (-" ".length()))) == ((237 ^ 128) ^ (94 ^ 55)) ? ((30 ^ 125) ^ (126 ^ 9)) & (((((55 + 164) - 76) + 48) ^ (((17 + 107) - 43) + 90)) ^ (-" ".length())) : r0;
        }
        return llIlllIIllI[1];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.fh.w();
    }

    private static String lIlIlIllIIIIll(String llllllllllllllllIIlIlIllIIIIllll, String llllllllllllllllIIlIlIllIIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIllIIIIlllI.getBytes(StandardCharsets.UTF_8)), llIlllIIllI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlllIIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIllIIIlIIII) {
            llllllllllllllllIIlIlIllIIIlIIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllIIIllI() {
        llIlllIIllI = new int[10];
        llIlllIIllI[0] = (-((-5707) & 7791)) & (-138) & 16383;
        llIlllIIllI[1] = ((6 ^ 108) ^ (19 ^ 79)) & (((15 ^ 88) ^ (250 ^ 155)) ^ (-" ".length()));
        llIlllIIllI[2] = " ".length();
        llIlllIIllI[3] = "  ".length();
        llIlllIIllI[4] = "   ".length();
        llIlllIIllI[5] = (-97) & 45431;
        llIlllIIllI[6] = 129 ^ 133;
        llIlllIIllI[7] = (215 ^ 195) ^ (104 ^ 121);
        llIlllIIllI[8] = 90 ^ 92;
        llIlllIIllI[9] = (((175 + 98) - 257) + 168) ^ (((123 + 60) - 137) + 130);
    }

    private static boolean lIlIlIllIIllIl(int i, int i2) {
        return i > i2;
    }

    public abstract int bZ();

    private static boolean lIlIlIllIIIlll(int i) {
        return i == 0;
    }

    private static void lIlIlIllIIIlIl() {
        llIlllIIlIl = new String[llIlllIIllI[8]];
        llIlllIIlIl[llIlllIIllI[1]] = lIlIlIllIIIIll("ctWbQ1y3QbjTZ8L3xvNotQ==", "UXPaH");
        llIlllIIlIl[llIlllIIllI[2]] = lIlIlIllIIIIll("P4RbGdohzbq+r8Sl1sw+AlFtwUHMJ+dQC+5L6xIhHUQ=", "PRDqe");
        llIlllIIlIl[llIlllIIllI[3]] = lIlIlIllIIIIll("qMZDBeQ8qFU=", "tuAgu");
        llIlllIIlIl[llIlllIIllI[4]] = lIlIlIllIIIlII("+2KyAeB0ftndHjjZj/jNSQ==", "sCkND");
        llIlllIIlIl[llIlllIIllI[6]] = lIlIlIllIIIIll("fEkCviJmu+M=", "ZTyGk");
        llIlllIIlIl[llIlllIIllI[7]] = lIlIlIllIIIIll("SQJ6yc3d9U56hPk6mycneg==", "iuTdX");
    }

    private static boolean lIlIlIllIIlIll(int i, int i2) {
        return i == i2;
    }
}
