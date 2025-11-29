/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  net.runelite.api.coords.WorldPoint
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.common.primitives.Ints;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class NEnum
extends Enum<N> {
    public static final /* synthetic */ /* enum */ N NECHRYAEL;
    private final /* synthetic */ WorldPoint sw;
    private final /* synthetic */ List<Integer> dropTable;
    private static /* synthetic */ String[] llIlIlll;
    private final /* synthetic */ WorldPoint second;
    private static final /* synthetic */ N[] $VALUES;
    private final /* synthetic */ int id;
    private final /* synthetic */ WorldPoint ne;
    public static final /* synthetic */ /* enum */ N SMOKE_DEVIL;
    private final /* synthetic */ WorldPoint first;
    private static /* synthetic */ int[] llIllIII;
    public static final /* synthetic */ /* enum */ N DUST_DEVIL;

    public WorldPoint aJ() {
        return this.first;
    }

    public List<Integer> aL() {
        return this.dropTable;
    }

    private static void llIIIIIlll() {
        llIllIII = new int[55];
        N.llIllIII[0] = (3 ^ 0x61) & ~(0xFC ^ 0x9E);
        N.llIllIII[1] = 0xFFFFBC7F & 0x5FD1;
        N.llIllIII[2] = -(0xFFFFFF33 & 0x40CD) & (0xFFFFE6B7 & 0x5FFC);
        N.llIllIII[3] = 0xFFFFBFDF & 0x673D;
        N.llIllIII[4] = 0xFFFF97B5 & 0x6EFF;
        N.llIllIII[5] = 0xFFFFA75F & 0x7FBE;
        N.llIllIII[6] = 0xFFFFF6BD & 0xFEB;
        N.llIllIII[7] = 0xFFFFAF3E & 0x77DB;
        N.llIllIII[8] = 0xFFFF8EBD & 0x77FA;
        N.llIllIII[9] = 0xFFFFAF65 & 0x77BF;
        N.llIllIII[10] = 1;
        N.llIllIII[11] = 0xFFFFBF6F & 0x5CFE;
        N.llIllIII[12] = 0xFFFFAFEE & 0x56BD;
        N.llIllIII[13] = 0xFFFFEFFE & 0x3767;
        N.llIllIII[14] = -(0xFFFFDE5B & 0x79E5) & (0xFFFFFFED & 0x5EFF);
        N.llIllIII[15] = -(0xFFFFE983 & 0x5EFF) & (0xFFFFEFFF & 0x7FE7);
        N.llIllIII[16] = 0xFFFFF6F7 & 0xFAD;
        N.llIllIII[17] = 0xFFFFEF7F & 0x37DD;
        N.llIllIII[18] = 0xFFFF97F8 & 0x6EB7;
        N.llIllIII[19] = -(0xFFFF971B & 0x78ED) & (0xFFFFF7FF & 0x3F6F);
        N.llIllIII[20] = 111 + 54 - 159 + 148 ^ 43 + 48 - 56 + 104;
        N.llIllIII[21] = 0xFFFFCD6F & 0x37DF;
        N.llIllIII[22] = 0xFFFFBCF7 & 0x47A9;
        N.llIllIII[23] = 2;
        N.llIllIII[24] = -(0xFFFFFF5B & 0xDFD) & (0xFFFFDD7F & 0x3FFB);
        N.llIllIII[25] = 3;
        N.llIllIII[26] = 0xFFFF84D9 & 0x7F7F;
        N.llIllIII[27] = 0x73 ^ 0x5C ^ (0x14 ^ 0x3F);
        N.llIllIII[28] = -(0xFFFFFBFD & 0x6F07) & (0xFFFFFF7F & 0x6FFF);
        N.llIllIII[29] = 0x91 ^ 0xB8 ^ (0xBD ^ 0x91);
        N.llIllIII[30] = -(0xFFFFFBF7 & 0x5E3D) & (0xFFFFFFFF & 0x5EBF);
        N.llIllIII[31] = 0x4C ^ 0x4A;
        N.llIllIII[32] = -(0xFFFFB97E & 0x7FCF) & (0xFFFFFBFF & 0x3F7F);
        N.llIllIII[33] = 0x34 ^ 0x33;
        N.llIllIII[34] = 0xFFFFFABC & 0x773;
        N.llIllIII[35] = 25 + 143 - -28 + 6 ^ 23 + 94 - 112 + 189;
        N.llIllIII[36] = -(0xFFFFFDE7 & 0x7759) & (0xFFFFFFFF & 0x7775);
        N.llIllIII[37] = 7 ^ 0xE;
        N.llIllIII[38] = 0xFFFF97F7 & 0x6A3E;
        N.llIllIII[39] = 0xCD ^ 0xC7;
        N.llIllIII[40] = 0xFFFFD4FE & 0x3FB5;
        N.llIllIII[41] = 0xA7 ^ 0xAC;
        N.llIllIII[42] = -(0xFFFFADE9 & 0x7337) & (0xFFFFFFFF & 0x6DFF);
        N.llIllIII[43] = 159 + 56 - 25 + 13 ^ 27 + 171 - 150 + 151;
        N.llIllIII[44] = 0xFFFFDDED & 0x6EF3;
        N.llIllIII[45] = 0x95 ^ 0xA1 ^ (0xBA ^ 0x83);
        N.llIllIII[46] = 0xFFFFDDEF & 0x6EF3;
        N.llIllIII[47] = 0x48 ^ 0x46;
        N.llIllIII[48] = -(0xFFFFF0B3 & 0x4FCF) & (0xFFFFF7FF & 0x4DFF);
        N.llIllIII[49] = 0x98 ^ 0x97;
        N.llIllIII[50] = 0xFFFF8A6F & 0x77F9;
        N.llIllIII[51] = 0x13 ^ 0x1F ^ (0xBD ^ 0xA1);
        N.llIllIII[52] = 0xFFFFDB7F & 0x25FB;
        N.llIllIII[53] = 0xFFFFF5FF & 0xBF2;
        N.llIllIII[54] = -1;
    }

    private static void llIIIIIllI() {
        llIlIlll = new String[llIllIII[25]];
        N.llIlIlll[N.llIllIII[0]] = N."DUST_DEVIL";
        N.llIlIlll[N.llIllIII[10]] = N."NECHRYAEL";
        N.llIlIlll[N.llIllIII[23]] = N."SMOKE_DEVIL";
    }

    private N(int n3, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, WorldPoint worldPoint4, int ... nArray) {
        this.id = n3;
        this.first = worldPoint;
        this.second = worldPoint2;
        this.sw = worldPoint3;
        this.ne = worldPoint4;
        this.dropTable = Ints.asList((int[])nArray);
    }

    public boolean g(WorldPoint worldPoint) {
        return WorldPoint.isInZone((WorldPoint)this.sw, (WorldPoint)this.ne, (WorldPoint)worldPoint);
    }

    public static N valueOf(String string) {
        return Enum.valueOf(N.class, string);
    }

    public static N[] values() {
        return (N[])$VALUES.clone();
    }

    private static String llIIIIIlII(String llIlIlIlIIlIIll, String llIlIlIlIIlIIlI) {
        llIlIlIlIIlIIll = new String(Base64.getDecoder().decode(llIlIlIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIlIlIIlIllI = new StringBuilder();
        char[] llIlIlIlIIlIlIl = llIlIlIlIIlIIlI.toCharArray();
        int llIlIlIlIIlIlII = llIllIII[0];
        char[] llIlIlIlIIIlllI = llIlIlIlIIlIIll.toCharArray();
        int llIlIlIlIIIllIl = llIlIlIlIIIlllI.length;
        int llIlIlIlIIIllII = llIllIII[0];
        while (N.llIIIIlIlI(llIlIlIlIIIllII, llIlIlIlIIIllIl)) {
            char llIlIlIlIIllIIl = llIlIlIlIIIlllI[llIlIlIlIIIllII];
            llIlIlIlIIlIllI.append((char)(llIlIlIlIIllIIl ^ llIlIlIlIIlIlIl[llIlIlIlIIlIlII % llIlIlIlIIlIlIl.length]));
            0;
            ++llIlIlIlIIlIlII;
            ++llIlIlIlIIIllII;
            0;
            if ((0x5A ^ 0x39 ^ (0x27 ^ 0x40)) >= 0) continue;
            return null;
        }
        return String.valueOf(llIlIlIlIIlIllI);
    }

    public int h(WorldPoint worldPoint) {
        return Math.min(worldPoint.distanceTo(this.first), worldPoint.distanceTo(this.second));
    }

    static {
        N.llIIIIIlll();
        N.llIIIIIllI();
        DUST_DEVIL = new N(llIllIII[1], new WorldPoint(llIllIII[2], llIllIII[3], llIllIII[0]), new WorldPoint(llIllIII[4], llIllIII[5], llIllIII[0]), new WorldPoint(llIllIII[6], llIllIII[7], llIllIII[0]), new WorldPoint(llIllIII[8], llIllIII[9], llIllIII[0]), new int[llIllIII[0]]);
        int[] nArray = new int[llIllIII[20]];
        nArray[N.llIllIII[0]] = llIllIII[21];
        nArray[N.llIllIII[10]] = llIllIII[22];
        nArray[N.llIllIII[23]] = llIllIII[24];
        nArray[N.llIllIII[25]] = llIllIII[26];
        nArray[N.llIllIII[27]] = llIllIII[28];
        nArray[N.llIllIII[29]] = llIllIII[30];
        nArray[N.llIllIII[31]] = llIllIII[32];
        nArray[N.llIllIII[33]] = llIllIII[34];
        nArray[N.llIllIII[35]] = llIllIII[36];
        nArray[N.llIllIII[37]] = llIllIII[38];
        nArray[N.llIllIII[39]] = llIllIII[40];
        nArray[N.llIllIII[41]] = llIllIII[42];
        nArray[N.llIllIII[43]] = llIllIII[44];
        nArray[N.llIllIII[45]] = llIllIII[46];
        nArray[N.llIllIII[47]] = llIllIII[48];
        nArray[N.llIllIII[49]] = llIllIII[50];
        nArray[N.llIllIII[51]] = llIllIII[52];
        NECHRYAEL = new N(llIllIII[11], new WorldPoint(llIllIII[12], llIllIII[13], llIllIII[0]), new WorldPoint(llIllIII[14], llIllIII[15], llIllIII[0]), new WorldPoint(llIllIII[16], llIllIII[17], llIllIII[0]), new WorldPoint(llIllIII[18], llIllIII[19], llIllIII[0]), nArray);
        SMOKE_DEVIL = new N(llIllIII[53], new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[10]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new int[llIllIII[0]]);
        N[] nArray2 = new N[llIllIII[25]];
        nArray2[N.llIllIII[0]] = DUST_DEVIL;
        nArray2[N.llIllIII[10]] = NECHRYAEL;
        nArray2[N.llIllIII[23]] = SMOKE_DEVIL;
        $VALUES = nArray2;
    }

    public int P() {
        return this.id;
    }

    public WorldPoint aK() {
        return this.second;
    }

    private static String llIIIIIIlI(String llIlIlIlIllIIll, String llIlIlIlIllIIlI) {
        try {
            SecretKeySpec llIlIlIlIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIlIlIllIlll = Cipher.getInstance("Blowfish");
            llIlIlIlIllIlll.init(llIllIII[23], llIlIlIlIlllIII);
            return new String(llIlIlIlIllIlll.doFinal(Base64.getDecoder().decode(llIlIlIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIlIlIllIllI) {
            llIlIlIlIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIIIlIl(String llIlIlIlIlIIllI, String llIlIlIlIlIIlIl) {
        try {
            SecretKeySpec llIlIlIlIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), llIllIII[35]), "DES");
            Cipher llIlIlIlIlIlIlI = Cipher.getInstance("DES");
            llIlIlIlIlIlIlI.init(llIllIII[23], llIlIlIlIlIlIll);
            return new String(llIlIlIlIlIlIlI.doFinal(Base64.getDecoder().decode(llIlIlIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIlIlIlIlIIl) {
            llIlIlIlIlIlIIl.printStackTrace();
            return null;
        }
    }
}

