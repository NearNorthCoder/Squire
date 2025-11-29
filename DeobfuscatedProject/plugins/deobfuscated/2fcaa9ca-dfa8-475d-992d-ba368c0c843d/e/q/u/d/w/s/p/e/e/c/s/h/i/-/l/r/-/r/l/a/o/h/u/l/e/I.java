/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
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

public final class I
extends Enum<I> {
    private static /* synthetic */ int[] lllIIIllIIlI;
    private static /* synthetic */ String[] lllIIIlIlllI;
    private /* synthetic */ int height;
    private /* synthetic */ int nextReq;
    public static final /* synthetic */ /* enum */ I THUNDER_VII;
    public static final /* synthetic */ /* enum */ I THUNDER_I;
    public static final /* synthetic */ /* enum */ I THUNDER_III;
    private static final /* synthetic */ I[] $VALUES;
    private /* synthetic */ int width;
    public static final /* synthetic */ /* enum */ I THUNDER_II;
    public static final /* synthetic */ /* enum */ I THUNDER_VI;
    private /* synthetic */ Supplier<WorldArea> area;
    private /* synthetic */ RegionPoint regionStart;
    public static final /* synthetic */ /* enum */ I THUNDER_V;
    public static final /* synthetic */ /* enum */ I THUNDER_VIII;
    public static final /* synthetic */ /* enum */ I THUNDER_IV;

    static {
        I.lIIIlIIlIlIlIIl();
        I.lIIIlIIlIlIlIII();
        THUNDER_I = new I(new RegionPoint(lllIIIllIIlI[3], lllIIIllIIlI[4], lllIIIllIIlI[0], b.N), lllIIIllIIlI[5], lllIIIllIIlI[6]);
        THUNDER_II = new I(new RegionPoint(lllIIIllIIlI[3], lllIIIllIIlI[7], lllIIIllIIlI[0], b.N), lllIIIllIIlI[5], lllIIIllIIlI[6]);
        THUNDER_III = new I(new RegionPoint(lllIIIllIIlI[8], lllIIIllIIlI[9], lllIIIllIIlI[2], b.N), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_IV = new I(new RegionPoint(lllIIIllIIlI[10], lllIIIllIIlI[9], lllIIIllIIlI[2], b.N), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_V = new I(new RegionPoint(lllIIIllIIlI[12], lllIIIllIIlI[13], lllIIIllIIlI[0], b.N), lllIIIllIIlI[6], lllIIIllIIlI[5]);
        THUNDER_VI = new I(new RegionPoint(lllIIIllIIlI[14], lllIIIllIIlI[13], lllIIIllIIlI[0], b.N), lllIIIllIIlI[6], lllIIIllIIlI[5]);
        THUNDER_VII = new I(new RegionPoint(lllIIIllIIlI[8], lllIIIllIIlI[9], lllIIIllIIlI[1], b.L), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_VIII = new I(new RegionPoint(lllIIIllIIlI[10], lllIIIllIIlI[9], lllIIIllIIlI[1], b.L), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        I[] iArray = new I[lllIIIllIIlI[17]];
        iArray[I.lllIIIllIIlI[0]] = THUNDER_I;
        iArray[I.lllIIIllIIlI[2]] = THUNDER_II;
        iArray[I.lllIIIllIIlI[1]] = THUNDER_III;
        iArray[I.lllIIIllIIlI[5]] = THUNDER_IV;
        iArray[I.lllIIIllIIlI[11]] = THUNDER_V;
        iArray[I.lllIIIllIIlI[6]] = THUNDER_VI;
        iArray[I.lllIIIllIIlI[15]] = THUNDER_VII;
        iArray[I.lllIIIllIIlI[16]] = THUNDER_VIII;
        $VALUES = iArray;
    }

    public static I[] values() {
        return (I[])$VALUES.clone();
    }

    private static boolean lIIIlIIlIlIlIll(int n2) {
        return n2 != 0;
    }

    public static I valueOf(String string) {
        return Enum.valueOf(I.class, string);
    }

    private static void lIIIlIIlIlIlIIl() {
        lllIIIllIIlI = new int[18];
        I.lllIIIllIIlI[0] = (0x30 ^ 0x3D ^ (0x5C ^ 0x63)) & (37 + 142 - 82 + 56 ^ 104 + 81 - 83 + 69 ^ -1);
        I.lllIIIllIIlI[1] = 2;
        I.lllIIIllIIlI[2] = 1;
        I.lllIIIllIIlI[3] = 0xA ^ 0x3D ^ (0xC ^ 3);
        I.lllIIIllIIlI[4] = 106 + 85 - 145 + 103 ^ 134 + 110 - 243 + 152;
        I.lllIIIllIIlI[5] = 3;
        I.lllIIIllIIlI[6] = 0xE ^ 0x3A ^ (0x6E ^ 0x5F);
        I.lllIIIllIIlI[7] = 0x90 ^ 0xA5 ^ (0x94 ^ 0x82);
        I.lllIIIllIIlI[8] = 0x62 ^ 0x7C ^ (2 ^ 0x3A);
        I.lllIIIllIIlI[9] = 0x3A ^ 0x59 ^ (0x2C ^ 0x62);
        I.lllIIIllIIlI[10] = 0x44 ^ 0x3C ^ (0xF7 ^ 0xA1);
        I.lllIIIllIIlI[11] = 0x8F ^ 0x8B;
        I.lllIIIllIIlI[12] = 129 + 3 - 114 + 137 ^ 91 + 76 - 88 + 109;
        I.lllIIIllIIlI[13] = 4 ^ 0x24 ^ (0x3E ^ 0x2D);
        I.lllIIIllIIlI[14] = 14 + 147 - 72 + 87 ^ 116 + 52 - 140 + 137;
        I.lllIIIllIIlI[15] = 103 + 16 - 93 + 152 ^ 14 + 10 - -117 + 39;
        I.lllIIIllIIlI[16] = 0x39 ^ 0x20 ^ (0xAD ^ 0xB3);
        I.lllIIIllIIlI[17] = 128 + 6 - 91 + 126 ^ 112 + 98 - 169 + 120;
    }

    public Supplier<WorldArea> K() {
        return this.area;
    }

    private I(RegionPoint regionPoint, int n3, int n4) {
        this.regionStart = regionPoint;
        this.width = n3;
        this.height = n4;
        this.area = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
    }

    private static String lIIIlIIlIIlllII(String lllllllllllllllIIllIlllIIllIIlll, String lllllllllllllllIIllIlllIIllIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlllIIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlllIIllIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlllIIllIlIll.init(lllIIIllIIlI[1], lllllllllllllllIIllIlllIIllIllII);
            return new String(lllllllllllllllIIllIlllIIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlllIIllIlIlI) {
            lllllllllllllllIIllIlllIIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIlIIllIll(String lllllllllllllllIIllIlllIIlIIllII, String lllllllllllllllIIllIlllIIlIIlIll) {
        lllllllllllllllIIllIlllIIlIIllII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlllIIlIIlIlI = new StringBuilder();
        char[] lllllllllllllllIIllIlllIIlIIlIIl = lllllllllllllllIIllIlllIIlIIlIll.toCharArray();
        int lllllllllllllllIIllIlllIIlIIlIII = lllIIIllIIlI[0];
        char[] lllllllllllllllIIllIlllIIlIIIIlI = lllllllllllllllIIllIlllIIlIIllII.toCharArray();
        int lllllllllllllllIIllIlllIIlIIIIIl = lllllllllllllllIIllIlllIIlIIIIlI.length;
        int lllllllllllllllIIllIlllIIlIIIIII = lllIIIllIIlI[0];
        while (I.lIIIlIIlIlIlIlI(lllllllllllllllIIllIlllIIlIIIIII, lllllllllllllllIIllIlllIIlIIIIIl)) {
            char lllllllllllllllIIllIlllIIlIIllIl = lllllllllllllllIIllIlllIIlIIIIlI[lllllllllllllllIIllIlllIIlIIIIII];
            lllllllllllllllIIllIlllIIlIIlIlI.append((char)(lllllllllllllllIIllIlllIIlIIllIl ^ lllllllllllllllIIllIlllIIlIIlIIl[lllllllllllllllIIllIlllIIlIIlIII % lllllllllllllllIIllIlllIIlIIlIIl.length]));
            0;
            ++lllllllllllllllIIllIlllIIlIIlIII;
            ++lllllllllllllllIIllIlllIIlIIIIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlllIIlIIlIlI);
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> aC() {
        void lllllllllllllllIIllIlllIIllllIll;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        System.out.println(I.values().length);
        I[] iArray = I.values();
        int n2 = iArray.length;
        int lllllllllllllllIIllIlllIIllllIlI = lllIIIllIIlI[0];
        while (I.lIIIlIIlIlIlIlI(lllllllllllllllIIllIlllIIllllIlI, (int)lllllllllllllllIIllIlllIIllllIll)) {
            void lllllllllllllllIIllIlllIIlllllIl;
            void lllllllllllllllIIllIlllIIlllllII;
            void lllllllllllllllIIllIlllIIllllIIl = lllllllllllllllIIllIlllIIlllllII[lllllllllllllllIIllIlllIIllllIlI];
            lllllllllllllllIIllIlllIIlllllIl.addAll(lllllllllllllllIIllIlllIIllllIIl.aD());
            0;
            ++lllllllllllllllIIllIlllIIllllIlI;
            0;
            if ((0x4B ^ 0xA ^ (0xCB ^ 0x8E)) > 1) continue;
            return null;
        }
        return arrayList;
    }

    private List<WorldPoint> aD() {
        WorldArea worldArea = this.area.get();
        List list = worldArea.toWorldPointList();
        list.removeIf(worldPoint -> {
            boolean bl;
            int n2 = Math.abs(worldPoint.getWorldY() - worldArea.getY());
            int n3 = Math.abs(worldPoint.getWorldX() - worldArea.getX());
            if (I.lIIIlIIlIlIlIll((n3 + n2) % lllIIIllIIlI[1])) {
                bl = lllIIIllIIlI[2];
                0;
                if (null != null) {
                    return ((0xF1 ^ 0xA9 ^ (0x26 ^ 0x6A)) & (0xB1 ^ 0xAA ^ (0x17 ^ 0x18) ^ -1)) != 0;
                }
            } else {
                bl = lllIIIllIIlI[0];
            }
            return bl;
        });
        0;
        return list;
    }

    private static String lIIIlIIlIIllllI(String lllllllllllllllIIllIlllIIlIlllII, String lllllllllllllllIIllIlllIIlIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlllIIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIIlIllIll.getBytes(StandardCharsets.UTF_8)), lllIIIllIIlI[17]), "DES");
            Cipher lllllllllllllllIIllIlllIIlIllllI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlllIIlIllllI.init(lllIIIllIIlI[1], lllllllllllllllIIllIlllIIlIlllll);
            return new String(lllllllllllllllIIllIlllIIlIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlllIIlIlllIl) {
            lllllllllllllllIIllIlllIIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIlIlIlIII() {
        lllIIIlIlllI = new String[lllIIIllIIlI[17]];
        I.lllIIIlIlllI[I.lllIIIllIIlI[0]] = I."THUNDER_I";
        I.lllIIIlIlllI[I.lllIIIllIIlI[2]] = I."THUNDER_II";
        I.lllIIIlIlllI[I.lllIIIllIIlI[1]] = I."THUNDER_III";
        I.lllIIIlIlllI[I.lllIIIllIIlI[5]] = I."THUNDER_IV";
        I.lllIIIlIlllI[I.lllIIIllIIlI[11]] = I."THUNDER_V";
        I.lllIIIlIlllI[I.lllIIIllIIlI[6]] = I."THUNDER_VI";
        I.lllIIIlIlllI[I.lllIIIllIIlI[15]] = I."THUNDER_VII";
        I.lllIIIlIlllI[I.lllIIIllIIlI[16]] = I."THUNDER_VIII";
    }

    private static boolean lIIIlIIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }
}

