package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.I  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/I.class */
public final class I {
    private static /* synthetic */ int[] lllIIIllIIlI;
    private static /* synthetic */ String[] lllIIIlIlllI;
    private /* synthetic */ int height;
    private /* synthetic */ int nextReq;
    public static final /* synthetic */ I THUNDER_VII;
    public static final /* synthetic */ I THUNDER_I;
    public static final /* synthetic */ I THUNDER_III;
    private static final /* synthetic */ I[] $VALUES;
    private /* synthetic */ int width;
    public static final /* synthetic */ I THUNDER_II;
    public static final /* synthetic */ I THUNDER_VI;
    private /* synthetic */ Supplier<WorldArea> area;
    private /* synthetic */ RegionPoint regionStart;
    public static final /* synthetic */ I THUNDER_V;
    public static final /* synthetic */ I THUNDER_VIII;
    public static final /* synthetic */ I THUNDER_IV;

    static {
        lIIIlIIlIlIlIIl();
        lIIIlIIlIlIlIII();
        THUNDER_I = new I(lllIIIlIlllI[lllIIIllIIlI[0]], lllIIIllIIlI[0], new RegionPoint(lllIIIllIIlI[3], lllIIIllIIlI[4], lllIIIllIIlI[0], C0001b.N), lllIIIllIIlI[5], lllIIIllIIlI[6]);
        THUNDER_II = new I(lllIIIlIlllI[lllIIIllIIlI[2]], lllIIIllIIlI[2], new RegionPoint(lllIIIllIIlI[3], lllIIIllIIlI[7], lllIIIllIIlI[0], C0001b.N), lllIIIllIIlI[5], lllIIIllIIlI[6]);
        THUNDER_III = new I(lllIIIlIlllI[lllIIIllIIlI[1]], lllIIIllIIlI[1], new RegionPoint(lllIIIllIIlI[8], lllIIIllIIlI[9], lllIIIllIIlI[2], C0001b.N), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_IV = new I(lllIIIlIlllI[lllIIIllIIlI[5]], lllIIIllIIlI[5], new RegionPoint(lllIIIllIIlI[10], lllIIIllIIlI[9], lllIIIllIIlI[2], C0001b.N), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_V = new I(lllIIIlIlllI[lllIIIllIIlI[11]], lllIIIllIIlI[11], new RegionPoint(lllIIIllIIlI[12], lllIIIllIIlI[13], lllIIIllIIlI[0], C0001b.N), lllIIIllIIlI[6], lllIIIllIIlI[5]);
        THUNDER_VI = new I(lllIIIlIlllI[lllIIIllIIlI[6]], lllIIIllIIlI[6], new RegionPoint(lllIIIllIIlI[14], lllIIIllIIlI[13], lllIIIllIIlI[0], C0001b.N), lllIIIllIIlI[6], lllIIIllIIlI[5]);
        THUNDER_VII = new I(lllIIIlIlllI[lllIIIllIIlI[15]], lllIIIllIIlI[15], new RegionPoint(lllIIIllIIlI[8], lllIIIllIIlI[9], lllIIIllIIlI[1], C0001b.L), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_VIII = new I(lllIIIlIlllI[lllIIIllIIlI[16]], lllIIIllIIlI[16], new RegionPoint(lllIIIllIIlI[10], lllIIIllIIlI[9], lllIIIllIIlI[1], C0001b.L), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        I[] iArr = new I[lllIIIllIIlI[17]];
        iArr[lllIIIllIIlI[0]] = THUNDER_I;
        iArr[lllIIIllIIlI[2]] = THUNDER_II;
        iArr[lllIIIllIIlI[1]] = THUNDER_III;
        iArr[lllIIIllIIlI[5]] = THUNDER_IV;
        iArr[lllIIIllIIlI[11]] = THUNDER_V;
        iArr[lllIIIllIIlI[6]] = THUNDER_VI;
        iArr[lllIIIllIIlI[15]] = THUNDER_VII;
        iArr[lllIIIllIIlI[16]] = THUNDER_VIII;
        $VALUES = iArr;
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }

    private static boolean lIIIlIIlIlIlIll(int i) {
        return i != 0;
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    private static void lIIIlIIlIlIlIIl() {
        lllIIIllIIlI = new int[18];
        lllIIIllIIlI[0] = ((48 ^ 61) ^ (92 ^ 99)) & (((((37 + 142) - 82) + 56) ^ (((104 + 81) - 83) + 69)) ^ (-" ".length()));
        lllIIIllIIlI[1] = "  ".length();
        lllIIIllIIlI[2] = " ".length();
        lllIIIllIIlI[3] = (10 ^ 61) ^ (12 ^ 3);
        lllIIIllIIlI[4] = (((106 + 85) - 145) + 103) ^ (((134 + 110) - 243) + 152);
        lllIIIllIIlI[5] = "   ".length();
        lllIIIllIIlI[6] = (14 ^ 58) ^ (110 ^ 95);
        lllIIIllIIlI[7] = (144 ^ 165) ^ (148 ^ 130);
        lllIIIllIIlI[8] = (98 ^ 124) ^ (2 ^ 58);
        lllIIIllIIlI[9] = (58 ^ 89) ^ (44 ^ 98);
        lllIIIllIIlI[10] = (68 ^ 60) ^ (247 ^ 161);
        lllIIIllIIlI[11] = 143 ^ 139;
        lllIIIllIIlI[12] = (((129 + 3) - 114) + 137) ^ (((91 + 76) - 88) + 109);
        lllIIIllIIlI[13] = (4 ^ 36) ^ (62 ^ 45);
        lllIIIllIIlI[14] = (((14 + 147) - 72) + 87) ^ (((116 + 52) - 140) + 137);
        lllIIIllIIlI[15] = (((103 + 16) - 93) + 152) ^ (((14 + 10) - (-117)) + 39);
        lllIIIllIIlI[16] = (57 ^ 32) ^ (173 ^ 179);
        lllIIIllIIlI[17] = (((128 + 6) - 91) + 126) ^ (((112 + 98) - 169) + 120);
    }

    public Supplier<WorldArea> K() {
        return this.area;
    }

    private I(String str, int i, RegionPoint regionPoint, int i2, int i3) {
        this.regionStart = regionPoint;
        this.width = i2;
        this.height = i3;
        this.area = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint), i2, i3);
        };
    }

    private static String lIIIlIIlIIlllII(String lllllllllllllllIIllIlllIIllIlIIl, String lllllllllllllllIIllIlllIIllIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIllIIlI[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlllIIllIlIlI) {
            lllllllllllllllIIllIlllIIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIlIIllIll(String lllllllllllllllIIllIlllIIlIIllII, String lllllllllllllllIIllIlllIIlIIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlllIIlIIlIll.toCharArray();
        int lllllllllllllllIIllIlllIIlIIlIII = lllIIIllIIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIIllIIlI[0];
        while (lIIIlIIlIlIlIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIlllIIlIIlIII % charArray.length]));
            "".length();
            lllllllllllllllIIllIlllIIlIIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static List<WorldPoint> aC() {
        ArrayList arrayList = new ArrayList();
        System.out.println(values().length);
        I[] values = values();
        int length = values.length;
        int i = lllIIIllIIlI[0];
        while (lIIIlIIlIlIlIlI(i, length)) {
            arrayList.addAll(values[i].aD());
            "".length();
            i++;
            "".length();
            if (((75 ^ 10) ^ (203 ^ 142)) <= " ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    private List<WorldPoint> aD() {
        WorldArea worldArea = this.area.get();
        List<WorldPoint> worldPointList = worldArea.toWorldPointList();
        worldPointList.removeIf(worldPoint -> {
            if (lIIIlIIlIlIlIll((Math.abs(worldPoint.getWorldX() - worldArea.getX()) + Math.abs(worldPoint.getWorldY() - worldArea.getY())) % lllIIIllIIlI[1])) {
                ?? r0 = lllIIIllIIlI[2];
                "".length();
                return 0 != 0 ? ((241 ^ 169) ^ (38 ^ 106)) & (((177 ^ 170) ^ (23 ^ 24)) ^ (-" ".length())) : r0;
            }
            return lllIIIllIIlI[0];
        });
        "".length();
        return worldPointList;
    }

    private static String lIIIlIIlIIllllI(String lllllllllllllllIIllIlllIIlIlllII, String lllllllllllllllIIllIlllIIlIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlllIIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIIlIllIll.getBytes(StandardCharsets.UTF_8)), lllIIIllIIlI[17]), "DES");
            Cipher lllllllllllllllIIllIlllIIlIllllI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlllIIlIllllI.init(lllIIIllIIlI[1], lllllllllllllllIIllIlllIIlIlllll);
            return new String(lllllllllllllllIIllIlllIIlIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlllIIlIlllIl) {
            lllllllllllllllIIllIlllIIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIlIlIlIII() {
        lllIIIlIlllI = new String[lllIIIllIIlI[17]];
        lllIIIlIlllI[lllIIIllIIlI[0]] = lIIIlIIlIIllIll("AgA9LSITGjcq", "VHhcf");
        lllIIIlIlllI[lllIIIllIIlI[2]] = lIIIlIIlIIlllII("BjNtde1dnvimlCyrA/6TpQ==", "eeEiv");
        lllIIIlIlllI[lllIIIllIIlI[1]] = lIIIlIIlIIlllII("9BjUxWHBOIJtxyIrEL4zkA==", "cnuRZ");
        lllIIIlIlllI[lllIIIllIIlI[5]] = lIIIlIIlIIllllI("AFdjMy5HHBtWVvQrL4vRcw==", "okyGU");
        lllIIIlIlllI[lllIIIllIIlI[11]] = lIIIlIIlIIlllII("KILOMoupNbQ+JCPQv0ceSw==", "NPwBt");
        lllIIIlIlllI[lllIIIllIIlI[6]] = lIIIlIIlIIllllI("Y/WY/4QS6M27TqBA8fCjeQ==", "bvbZa");
        lllIIIlIlllI[lllIIIllIIlI[15]] = lIIIlIIlIIllIll("Iy4iPSgyNCglJT4=", "wfwsl");
        lllIIIlIlllI[lllIIIllIIlI[16]] = lIIIlIIlIIllIll("OhE/OSgrCzUhJScQ", "nYjwl");
    }

    private static boolean lIIIlIIlIlIlIlI(int i, int i2) {
        return i < i2;
    }
}
