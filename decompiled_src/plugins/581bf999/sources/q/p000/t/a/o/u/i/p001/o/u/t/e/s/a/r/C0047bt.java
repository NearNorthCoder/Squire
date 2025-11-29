package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Progress Puzzle")
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bt  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bt.class */
public class C0047bt extends AbstractC0040bm {
    private static /* synthetic */ String[] llIlIlIlIlI;
    private static /* synthetic */ int[] llIlIlIlIll;

    private static boolean lIlIIlllIIIlll(Object obj) {
        return obj != null;
    }

    @Inject
    protected C0047bt(Client client, C0077z c0077z, TOAConfig tOAConfig, C0067p c0067p) {
        super(client, c0077z, tOAConfig, c0067p);
    }

    private static String lIlIIllIlllllI(String llllllllllllllllIIllIIllIIlIllll, String llllllllllllllllIIllIIllIIlIllII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIllIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlIlIll[3], llllllllllllllllIIllIIllIIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIllIIllIIII) {
            llllllllllllllllIIllIIllIIllIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlllIIIIII(String llllllllllllllllIIllIIllIIlIIIlI, String llllllllllllllllIIllIIllIIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIllIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIlIlIll[7]), "DES");
            Cipher llllllllllllllllIIllIIllIIlIIlII = Cipher.getInstance("DES");
            llllllllllllllllIIllIIllIIlIIlII.init(llIlIlIlIll[3], llllllllllllllllIIllIIllIIlIIlIl);
            return new String(llllllllllllllllIIllIIllIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIllIIlIIIll) {
            llllllllllllllllIIllIIllIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlllIIIIIl() {
        llIlIlIlIlI = new String[llIlIlIlIll[4]];
        llIlIlIlIlI[llIlIlIlIll[1]] = lIlIIllIlllllI("MSezcmNE5no=", "jTbWZ");
        llIlIlIlIlI[llIlIlIlIll[0]] = lIlIIllIllllll("MiYuFjxcICcTPwQzJw==", "qTOaP");
        llIlIlIlIlI[llIlIlIlIll[3]] = lIlIIllIllllll("FxUtERYoCyE=", "GyLep");
        llIlIlIlIlI[llIlIlIlIll[2]] = lIlIIllIlllllI("fV2cKVa8Fuk=", "aOnsH");
        llIlIlIlIlI[llIlIlIlIll[5]] = lIlIIlllIIIIII("SYLoLSxvBSp0lXPtnCivCw==", "FdVCA");
        llIlIlIlIlI[llIlIlIlIll[6]] = lIlIIlllIIIIII("GZ7wdZUzyqc=", "kBVzH");
    }

    private static boolean lIlIIlllIIIllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public boolean bY() {
        String[] strArr = new String[llIlIlIlIll[0]];
        strArr[llIlIlIlIll[1]] = llIlIlIlIlI[llIlIlIlIll[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIlllIIIIll(nearest)) {
            return llIlIlIlIll[1];
        }
        int llllllllllllllllIIllIIllIIlllIIl = this.cu.getLocalPlayer().getWorldX();
        if (!lIlIIlllIIIlII(nearest.getWorldX(), llllllllllllllllIIllIIllIIlllIIl)) {
            nearest.interact(llIlIlIlIlI[llIlIlIlIll[5]]);
            return llIlIlIlIll[0];
        }
        if (!lIlIIlllIIIlIl(Players.getLocal().isMoving() ? 1 : 0) && !lIlIIlllIIIllI(llllllllllllllllIIllIIllIIlllIIl, this.fh.Z())) {
            TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                return tileObject.getName().equals(llIlIlIlIlI[llIlIlIlIll[6]]);
            });
            if (lIlIIlllIIIlll(nearest2) && lIlIIlllIIlIII(Math.abs(nearest2.getWorldX() - this.fh.Z()), llIlIlIlIll[2])) {
                nearest2.interact(llIlIlIlIlI[llIlIlIlIll[0]]);
                return llIlIlIlIll[0];
            }
            String[] strArr2 = new String[llIlIlIlIll[0]];
            strArr2[llIlIlIlIll[1]] = llIlIlIlIlI[llIlIlIlIll[3]];
            TileObject nearest3 = TileObjects.getNearest(strArr2);
            if (lIlIIlllIIIlll(nearest3) && lIlIIlllIIIlII(nearest3.getWorldX(), this.fh.Z()) && lIlIIlllIIlIII(Math.abs(nearest3.getWorldX() - this.fh.Z()), llIlIlIlIll[4])) {
                nearest3.interact(llIlIlIlIlI[llIlIlIlIll[2]]);
                return llIlIlIlIll[0];
            }
            return llIlIlIlIll[1];
        }
        return llIlIlIlIll[1];
    }

    private static boolean lIlIIlllIIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIlllIIIIll(Object obj) {
        return obj == null;
    }

    private static void lIlIIlllIIIIlI() {
        llIlIlIlIll = new int[8];
        llIlIlIlIll[0] = " ".length();
        llIlIlIlIll[1] = (135 ^ 130) & ((12 ^ 9) ^ (-1));
        llIlIlIlIll[2] = "   ".length();
        llIlIlIlIll[3] = "  ".length();
        llIlIlIlIll[4] = (((35 + 53) - (-49)) + 0) ^ (((37 + 73) - (-11)) + 22);
        llIlIlIlIll[5] = 166 ^ 162;
        llIlIlIlIll[6] = 55 ^ 50;
        llIlIlIlIll[7] = (((15 + 57) - (-29)) + 32) ^ (((51 + 80) - 3) + 13);
    }

    private static String lIlIIllIllllll(String llllllllllllllllIIllIIllIIIlIIlI, String llllllllllllllllIIllIIllIIIlIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllIIllIIIIllll = llllllllllllllllIIllIIllIIIlIIIl.toCharArray();
        int llllllllllllllllIIllIIllIIIIlllI = llIlIlIlIll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIlIlIll[1];
        while (lIlIIlllIIIlII(i, length)) {
            char llllllllllllllllIIllIIllIIIlIIll = charArray[i];
            sb.append((char) (llllllllllllllllIIllIIllIIIlIIll ^ llllllllllllllllIIllIIllIIIIllll[llllllllllllllllIIllIIllIIIIlllI % llllllllllllllllIIllIIllIIIIllll.length]));
            "".length();
            llllllllllllllllIIllIIllIIIIlllI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIlllIIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIlllIIlIII(int i, int i2) {
        return i <= i2;
    }

    static {
        lIlIIlllIIIIlI();
        lIlIIlllIIIIIl();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public int bZ() {
        return this.fh.Z() + llIlIlIlIll[0];
    }
}
