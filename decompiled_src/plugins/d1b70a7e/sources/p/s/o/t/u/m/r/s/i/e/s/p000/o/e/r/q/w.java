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
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Boarding ship", priority = 10, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.w  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/w.class */
public class w extends x {
    private static /* synthetic */ int[] lIIllIlllIIll;
    private /* synthetic */ int ak;
    private static /* synthetic */ String[] lIIllIlllIIlI;

    private static boolean lIllIIIllIIlIIl(int i) {
        return i != 0;
    }

    private static String lIllIIIllIIIIll(String llllllllllllllIlllIllIlllllIIlll, String llllllllllllllIlllIllIlllllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlllllIIllI.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIll[10]), "DES");
            Cipher llllllllllllllIlllIllIlllllIlIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlllllIlIIl.init(lIIllIlllIIll[6], secretKeySpec);
            return new String(llllllllllllllIlllIllIlllllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlllllIlIII) {
            llllllllllllllIlllIllIlllllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllIIlIll(int i, int i2) {
        return i <= i2;
    }

    static {
        lIllIIIllIIIlll();
        lIllIIIllIIIllI();
    }

    private static boolean lIllIIIllIIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.x
    public boolean al() {
        Player local = Players.getLocal();
        if (!lIllIIIllIIlIII(local) && !lIllIIIllIIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            String[] strArr = new String[lIIllIlllIIll[1]];
            strArr[lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[0]];
            if (lIllIIIllIIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                this.ak = lIIllIlllIIll[0];
                return lIIllIlllIIll[0];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIllIIIllIIlIIl(tileObject.getName().contains(lIIllIlllIIlI[lIIllIlllIIll[7]]) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIllIlllIIll[1]];
                    strArr2[lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[8]];
                    if (lIllIIIllIIlIIl(tileObject.hasAction(strArr2) ? 1 : 0)) {
                        ?? r0 = lIIllIlllIIll[1];
                        "".length();
                        return (113 ^ 117) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIllIlllIIll[0];
            });
            if (lIllIIIllIIlIII(nearest)) {
                return lIIllIlllIIll[0];
            }
            int i = lIIllIlllIIll[2];
            int i2 = lIIllIlllIIll[3];
            int i3 = lIIllIlllIIll[0];
            int[] iArr = new int[lIIllIlllIIll[1]];
            iArr[lIIllIlllIIll[0]] = lIIllIlllIIll[4];
            TileObject firstAt = TileObjects.getFirstAt(i, i2, i3, iArr);
            if (lIllIIIllIIlIII(firstAt)) {
                return lIIllIlllIIll[0];
            }
            if (!lIllIIIllIIlIll(local.getWorldLocation().getX(), firstAt.getWorldLocation().getX()) || lIllIIIllIIlIIl(local.isMoving() ? 1 : 0)) {
                return lIIllIlllIIll[0];
            }
            nearest.interact(lIIllIlllIIlI[lIIllIlllIIll[1]]);
            sleepWhile(lIIllIlllIIll[5], () -> {
                if (!lIllIIIllIIlIlI(local.isMoving() ? 1 : 0) || lIllIIIllIIlIIl(Inventory.contains(item -> {
                    if (lIllIIIllIIlIIl(item.getName().contains(lIIllIlllIIlI[lIIllIlllIIll[6]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIllIlllIIll[1]];
                        strArr2[lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[5]];
                        if (lIllIIIllIIlIlI(item.hasAction(strArr2) ? 1 : 0)) {
                            ?? r0 = lIIllIlllIIll[1];
                            "".length();
                            return (126 ^ 122) <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIIllIlllIIll[0];
                }) ? 1 : 0)) {
                    ?? r0 = lIIllIlllIIll[1];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIllIlllIIll[0];
            });
            return lIIllIlllIIll[1];
        }
        return lIIllIlllIIll[0];
    }

    private static boolean lIllIIIllIIlIlI(int i) {
        return i == 0;
    }

    private static String lIllIIIllIIIlII(String llllllllllllllIlllIllIllllIlIlll, String llllllllllllllIlllIllIllllIlIllI) {
        String llllllllllllllIlllIllIllllIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIllllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIllllIlIlIl = new StringBuilder();
        char[] llllllllllllllIlllIllIllllIlIlII = llllllllllllllIlllIllIllllIlIllI.toCharArray();
        int llllllllllllllIlllIllIllllIlIIll = lIIllIlllIIll[0];
        char[] charArray = llllllllllllllIlllIllIllllIlIlll2.toCharArray();
        int length = charArray.length;
        int i = lIIllIlllIIll[0];
        while (lIllIIIllIIllII(i, length)) {
            char llllllllllllllIlllIllIllllIllIII = charArray[i];
            llllllllllllllIlllIllIllllIlIlIl.append((char) (llllllllllllllIlllIllIllllIllIII ^ llllllllllllllIlllIllIllllIlIlII[llllllllllllllIlllIllIllllIlIIll % llllllllllllllIlllIllIllllIlIlII.length]));
            "".length();
            llllllllllllllIlllIllIllllIlIIll++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllIllllIlIlIl);
    }

    private static String lIllIIIllIIIlIl(String llllllllllllllIlllIllIllllIIIIlI, String llllllllllllllIlllIllIllllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIllllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIllllIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIllllIIIlII.init(lIIllIlllIIll[6], llllllllllllllIlllIllIllllIIIlIl);
            return new String(llllllllllllllIlllIllIllllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIllllIIIIll) {
            llllllllllllllIlllIllIllllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIllIIIllI() {
        lIIllIlllIIlI = new String[lIIllIlllIIll[9]];
        lIIllIlllIIlI[lIIllIlllIIll[0]] = lIllIIIllIIIIll("vDW7i16EzZo=", "mTTec");
        lIIllIlllIIlI[lIIllIlllIIll[1]] = lIllIIIllIIIlII("MBov", "eiJDW");
        lIIllIlllIIlI[lIIllIlllIIll[6]] = lIllIIIllIIIlIl("fr/V/qm4L0E=", "OfdIb");
        lIIllIlllIIlI[lIIllIlllIIll[5]] = lIllIIIllIIIlIl("1wmkp+0HZA8=", "hFcLl");
        lIIllIlllIIlI[lIIllIlllIIll[7]] = lIllIIIllIIIlII("HxcgCyRoBiEDJg==", "HvTnV");
        lIIllIlllIIlI[lIIllIlllIIll[8]] = lIllIIIllIIIlII("LDcn", "yDBHt");
    }

    @Inject
    protected w(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
        this.ak = lIIllIlllIIll[0];
    }

    private static boolean lIllIIIllIIlIII(Object obj) {
        return obj == null;
    }

    private static void lIllIIIllIIIlll() {
        lIIllIlllIIll = new int[11];
        lIIllIlllIIll[0] = ((227 ^ 178) ^ (141 ^ 131)) & (((83 ^ 0) ^ (130 ^ 142)) ^ (-" ".length()));
        lIIllIlllIIll[1] = " ".length();
        lIIllIlllIIll[2] = (-((-1281) & 14273)) & (-16385) & 32511;
        lIIllIlllIIll[3] = (-((-2525) & 32222)) & (-5) & 32541;
        lIIllIlllIIll[4] = (-7843) & 49147;
        lIIllIlllIIll[5] = "   ".length();
        lIIllIlllIIll[6] = "  ".length();
        lIIllIlllIIll[7] = 117 ^ 113;
        lIIllIlllIIll[8] = (((88 + 125) - 176) + 109) ^ (((105 + 149) - 107) + 4);
        lIIllIlllIIll[9] = 46 ^ 40;
        lIIllIlllIIll[10] = (210 ^ 133) ^ (77 ^ 18);
    }
}
