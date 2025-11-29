/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;

public final class av
extends Enum<av> {
    public static final /* synthetic */ /* enum */ av CADANTINE;
    public static final /* synthetic */ /* enum */ av IRIT;
    public static final /* synthetic */ /* enum */ av WHITE_BERRY;
    private static final /* synthetic */ av[] $VALUES;
    public static final /* synthetic */ /* enum */ av LANTADYME;
    private final /* synthetic */ int amount;
    public static final /* synthetic */ /* enum */ av SNAPE_GRASS;
    public static final /* synthetic */ /* enum */ av RANNAR_WEED;
    private final /* synthetic */ au produce;
    public static final /* synthetic */ /* enum */ av GUAM;
    public static final /* synthetic */ /* enum */ av HARRALANDER;
    public static final /* synthetic */ /* enum */ av SEAWEED;
    public static final /* synthetic */ /* enum */ av STRAWEBERRIES;
    public static final /* synthetic */ /* enum */ av AVANTOE;
    public static final /* synthetic */ /* enum */ av GRAPES;
    public static final /* synthetic */ /* enum */ av SNAPDRAGON;
    public static final /* synthetic */ /* enum */ av TARROMIN;
    public static final /* synthetic */ /* enum */ av TOADFLAX;
    public static final /* synthetic */ /* enum */ av JANGERBERRIES;
    private static /* synthetic */ int[] llIIIlIlIlll;
    public static final /* synthetic */ /* enum */ av DWARF_WEED;
    public static final /* synthetic */ /* enum */ av KWUARM;
    public static final /* synthetic */ /* enum */ av ONIONS;
    public static final /* synthetic */ /* enum */ av NASTURTIUM;
    public static final /* synthetic */ /* enum */ av MARIGOLD;
    public static final /* synthetic */ /* enum */ av TORSTOL;
    public static final /* synthetic */ /* enum */ av LIMPWURT;
    public static final /* synthetic */ /* enum */ av DEFAULT;
    private final /* synthetic */ int seed;
    public static final /* synthetic */ /* enum */ av SWEETCORN;
    public static final /* synthetic */ /* enum */ av WATERMELON;
    public static final /* synthetic */ /* enum */ av POISON_IVY;
    private static /* synthetic */ String[] llIIIlIlIlIl;

    public int bl() {
        return this.amount;
    }

    private static String llllIlIIlllIIl(String lllllllllllllllIlIlIIlIllllIIIII, String lllllllllllllllIlIlIIlIlllIllIII) {
        lllllllllllllllIlIlIIlIllllIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIlIlllIlllIl = new StringBuilder();
        char[] lllllllllllllllIlIlIIlIlllIlllII = lllllllllllllllIlIlIIlIlllIllIII.toCharArray();
        int lllllllllllllllIlIlIIlIlllIllIlI = llIIIlIlIlll[1];
        char[] lllllllllllllllIlIlIIlIlllIlIIIl = lllllllllllllllIlIlIIlIllllIIIII.toCharArray();
        int lllllllllllllllIlIlIIlIlllIIllll = lllllllllllllllIlIlIIlIlllIlIIIl.length;
        int lllllllllllllllIlIlIIlIlllIIlllI = llIIIlIlIlll[1];
        while (av.llllIlIlIlIIlI(lllllllllllllllIlIlIIlIlllIIlllI, lllllllllllllllIlIlIIlIlllIIllll)) {
            char lllllllllllllllIlIlIIlIllllIIIIl = lllllllllllllllIlIlIIlIlllIlIIIl[lllllllllllllllIlIlIIlIlllIIlllI];
            lllllllllllllllIlIlIIlIlllIlllIl.append((char)(lllllllllllllllIlIlIIlIllllIIIIl ^ lllllllllllllllIlIlIIlIlllIlllII[lllllllllllllllIlIlIIlIlllIllIlI % lllllllllllllllIlIlIIlIlllIlllII.length]));
            0;
            ++lllllllllllllllIlIlIIlIlllIllIlI;
            ++lllllllllllllllIlIlIIlIlllIIlllI;
            0;
            if ((0xB2 ^ 0xB7) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIlIlllIlllIl);
    }

    public au aY() {
        return this.produce;
    }

    private static void llllIlIlIlIIIl() {
        llIIIlIlIlll = new int[55];
        av.llIIIlIlIlll[0] = 1;
        av.llIIIlIlIlll[1] = 3 & ~3;
        av.llIIIlIlIlll[2] = 0xFFFFD7AB & 0x3CFF;
        av.llIIIlIlIlll[3] = -(0xFFFFFF6F & 0x4BD1) & (0xFFFFFFFF & 0x5FED);
        av.llIIIlIlIlll[4] = 2;
        av.llIIIlIlIlll[5] = 0xFFFF9EEF & 0x75BE;
        av.llIIIlIlIlll[6] = 3;
        av.llIIIlIlIlll[7] = -(0xFFFFEF45 & 0x11BB) & (0xFFFFD7FF & 0x3DAF);
        av.llIIIlIlIlll[8] = 0xDC ^ 0xA4 ^ (0xE8 ^ 0x94);
        av.llIIIlIlIlll[9] = -(0xFFFFABDD & 0x576E) & (0xFFFFF7FF & 0x1FFF);
        av.llIIIlIlIlll[10] = 10 + 160 - 121 + 113 ^ 55 + 110 - 86 + 88;
        av.llIIIlIlIlll[11] = -(0xFFFFAB87 & 0x7F7F) & (0xFFFFBFFF & 0x7FB6);
        av.llIIIlIlIlll[12] = 0xC ^ 0xA;
        av.llIIIlIlIlll[13] = -(0xFFFFF3EF & 0x6F5D) & (0xFFFFFFFD & 0x77FF);
        av.llIIIlIlIlll[14] = 0xDB ^ 0x88 ^ (0xF7 ^ 0xA3);
        av.llIIIlIlIlll[15] = 0xFFFFD7FF & 0x3CB5;
        av.llIIIlIlIlll[16] = 0xB3 ^ 0xBB;
        av.llIIIlIlIlll[17] = 0xFFFFB4BE & 0x5FF7;
        av.llIIIlIlIlll[18] = 127 + 61 - 74 + 29 ^ 17 + 24 - -38 + 55;
        av.llIIIlIlIlll[19] = 0xFFFF94F7 & 0x7FBF;
        av.llIIIlIlIlll[20] = 0x4A ^ 0x66 ^ (0x88 ^ 0xAE);
        av.llIIIlIlIlll[21] = -(0xFFFFE4FF & 0x5B07) & (0xFFFFDDFE & 0x76BF);
        av.llIIIlIlIlll[22] = 0xB5 ^ 0xBE;
        av.llIIIlIlIlll[23] = -(0xFFFFF96D & 0x6F9F) & (0xFFFFFFBE & 0x7DFF);
        av.llIIIlIlIlll[24] = 0x52 ^ 0x5E;
        av.llIIIlIlIlll[25] = 0xFFFFD6F7 & 0x3DBB;
        av.llIIIlIlIlll[26] = 0x14 ^ 0x19;
        av.llIIIlIlIlll[27] = 0xFFFFDBDF & 0x7D7F;
        av.llIIIlIlIlll[28] = 123 + 83 - 190 + 170 ^ 106 + 35 - 41 + 80;
        av.llIIIlIlIlll[29] = 0xFFFFBEDF & 0x55E9;
        av.llIIIlIlIlll[30] = 85 + 181 - 88 + 25 ^ 185 + 111 - 283 + 183;
        av.llIIIlIlIlll[31] = 0xFFFFB6C7 & 0x5DFF;
        av.llIIIlIlIlll[32] = 0x3A ^ 0x2A;
        av.llIIIlIlIlll[33] = 0xFFFF94CD & 0x7FFA;
        av.llIIIlIlIlll[34] = 67 + 70 - 104 + 97 ^ 95 + 61 - 79 + 70;
        av.llIIIlIlIlll[35] = 0xFFFFBDEB & 0x56DF;
        av.llIIIlIlIlll[36] = 0xC1 ^ 0xA2 ^ (0xD7 ^ 0xA6);
        av.llIIIlIlIlll[37] = 0xFFFFDFEE & 0x33FD;
        av.llIIIlIlIlll[38] = 0x80 ^ 0xC3 ^ (0x56 ^ 6);
        av.llIIIlIlIlll[39] = -(0xFFFFF6B8 & 0x6D5F) & (0xFFFFFFFF & 0x77FF);
        av.llIIIlIlIlll[40] = 0x6F ^ 0x7B;
        av.llIIIlIlIlll[41] = 0xFFFFF7FB & 0x1BEE;
        av.llIIIlIlIlll[42] = 0x98 ^ 0x8D;
        av.llIIIlIlIlll[43] = -(0xFFFFE44F & 0x5FB5) & (0xFFFFDFF7 & 0x77FD);
        av.llIIIlIlIlll[44] = 128 + 9 - 126 + 160 ^ 108 + 152 - 249 + 178;
        av.llIIIlIlIlll[45] = -(0xFFFFC9A9 & 0x7E5F) & (0xFFFFFFFA & 0x5BFF);
        av.llIIIlIlIlll[46] = 0x29 ^ 0x69 ^ (0xCA ^ 0x9D);
        av.llIIIlIlIlll[47] = 0xFFFFFBFB & 0x17F4;
        av.llIIIlIlIlll[48] = 0x73 ^ 0x6B;
        av.llIIIlIlIlll[49] = 0xFFFFFFFF & 0x53F2;
        av.llIIIlIlIlll[50] = 0x3B ^ 0x22;
        av.llIIIlIlIlll[51] = -(0xFFFFC6B3 & 0x7BCD) & (0xFFFFFFDB & 0x77FD);
        av.llIIIlIlIlll[52] = 0x4A ^ 5 ^ (0x33 ^ 0x66);
        av.llIIIlIlIlll[53] = -1;
        av.llIIIlIlIlll[54] = 0x3E ^ 0x16 ^ (0x4E ^ 0x7D);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean H(N n2) {
        void lllllllllllllllIlIlIIllIIIIIIlll;
        P p2 = n2.aL();
        av[] avArray = av.values();
        int n3 = avArray.length;
        int lllllllllllllllIlIlIIllIIIIIIlIl = llIIIlIlIlll[1];
        while (av.llllIlIlIlIIlI(lllllllllllllllIlIlIIllIIIIIIlIl, (int)lllllllllllllllIlIlIIllIIIIIIlll)) {
            void lllllllllllllllIlIlIIllIIIIIlIlI;
            void lllllllllllllllIlIlIIllIIIIIlIIl;
            void lllllllllllllllIlIlIIllIIIIIIlII = lllllllllllllllIlIlIIllIIIIIlIIl[lllllllllllllllIlIlIIllIIIIIIlIl];
            au lllllllllllllllIlIlIIllIIIIIIIlI = lllllllllllllllIlIlIIllIIIIIIlII.aY();
            if (av.llllIlIlIlIlII((Object)lllllllllllllllIlIlIIllIIIIIIIlI.bh(), lllllllllllllllIlIlIIllIIIIIlIlI)) {
                0;
                if (2 > (0xA6 ^ 0xA9 ^ (0x4E ^ 0x45))) {
                    return ((34 + 10 - -143 + 1 ^ 30 + 11 - 40 + 142) & (0x18 ^ 0x42 ^ (0xFD ^ 0x94) ^ -1)) != 0;
                }
            } else {
                int[] nArray = new int[llIIIlIlIlll[0]];
                nArray[av.llIIIlIlIlll[1]] = lllllllllllllllIlIlIIllIIIIIIlII.aA();
                if (av.llllIlIlIlIlIl(Inventory.getCount((boolean)llIIIlIlIlll[0], (int[])nArray), lllllllllllllllIlIlIIllIIIIIIlII.bl())) {
                    return llIIIlIlIlll[0];
                }
            }
            ++lllllllllllllllIlIlIIllIIIIIIlIl;
            0;
            if (-1 < ((0x98 ^ 0xA6) & ~(0x69 ^ 0x57))) continue;
            return ((0xB7 ^ 0xA2) & ~(0x98 ^ 0x8D)) != 0;
        }
        return llIIIlIlIlll[1];
    }

    private static String llllIlIIlllIlI(String lllllllllllllllIlIlIIlIllIlIlllI, String lllllllllllllllIlIlIIlIllIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIllIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIllIlIllll.getBytes(StandardCharsets.UTF_8)), llIIIlIlIlll[16]), "DES");
            Cipher lllllllllllllllIlIlIIlIllIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIllIllIIlI.init(llIIIlIlIlll[4], lllllllllllllllIlIlIIlIllIllIIll);
            return new String(lllllllllllllllIlIlIIlIllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIllIllIIIl) {
            lllllllllllllllIlIlIIlIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private av(int n3, int n4, au au2) {
        this.seed = n3;
        this.amount = n4;
        this.produce = au2;
    }

    private static void llllIlIlIIlIll() {
        llIIIlIlIlIl = new String[llIIIlIlIlll[54]];
        av.llIIIlIlIlIl[av.llIIIlIlIlll[1]] = av."GUAM";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[0]] = av."TARROMIN";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[4]] = av."HARRALANDER";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[6]] = av."RANNAR_WEED";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[8]] = av."SNAPDRAGON";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[10]] = av."TOADFLAX";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[12]] = av."IRIT";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[14]] = av."CADANTINE";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[16]] = av."LANTADYME";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[18]] = av."DWARF_WEED";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[20]] = av."TORSTOL";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[22]] = av."AVANTOE";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[24]] = av."KWUARM";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[26]] = av."SNAPE_GRASS";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[28]] = av."WATERMELON";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[30]] = av."ONIONS";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[32]] = av."SWEETCORN";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[34]] = av."STRAWEBERRIES";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[36]] = av."LIMPWURT";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[38]] = av."MARIGOLD";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[40]] = av."NASTURTIUM";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[42]] = av."WHITE_BERRY";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[44]] = av."POISON_IVY";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[46]] = av."JANGERBERRIES";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[48]] = av."SEAWEED";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[50]] = av."GRAPES";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[52]] = av."DEFAULT";
    }

    private static boolean llllIlIlIlIIll(Object object, Object object2) {
        return object == object2;
    }

    private static String llllIlIIlllIll(String lllllllllllllllIlIlIIlIllIlllIll, String lllllllllllllllIlIlIIlIllIllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIlllIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIlllIIIIIl.init(llIIIlIlIlll[4], lllllllllllllllIlIlIIlIlllIIIIll);
            return new String(lllllllllllllllIlIlIIlIlllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIllIllllll) {
            lllllllllllllllIlIlIIlIllIllllll.printStackTrace();
            return null;
        }
    }

    public int aA() {
        return this.seed;
    }

    private static boolean llllIlIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIlIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static av[] values() {
        return (av[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public static List<Integer> c(P p2) {
        void lllllllllllllllIlIlIIllIIIIlllll;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        av[] avArray = av.values();
        int n2 = avArray.length;
        int lllllllllllllllIlIlIIllIIIIlllIl = llIIIlIlIlll[1];
        while (av.llllIlIlIlIIlI(lllllllllllllllIlIlIIllIIIIlllIl, (int)lllllllllllllllIlIlIIllIIIIlllll)) {
            P lllllllllllllllIlIlIIllIIIlIIlIl;
            void lllllllllllllllIlIlIIllIIIlIIIIl;
            void lllllllllllllllIlIlIIllIIIIlllII = lllllllllllllllIlIlIIllIIIlIIIIl[lllllllllllllllIlIlIIllIIIIlllIl];
            au lllllllllllllllIlIlIIllIIIIllIll = lllllllllllllllIlIlIIllIIIIlllII.aY();
            if (av.llllIlIlIlIIll((Object)lllllllllllllllIlIlIIllIIIIllIll.bh(), (Object)lllllllllllllllIlIlIIllIIIlIIlIl)) {
                void lllllllllllllllIlIlIIllIIIlIIIll;
                lllllllllllllllIlIlIIllIIIlIIIll.add(lllllllllllllllIlIlIIllIIIIlllII.aA());
                0;
            }
            ++lllllllllllllllIlIlIIllIIIIlllIl;
            0;
            if (2 > ((0x25 ^ 0x2D) & ~(0x2B ^ 0x23))) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean llllIlIlIlIlII(Object object, Object object2) {
        return object != object2;
    }

    private av(int n3, au au2) {
        this(n3, llIIIlIlIlll[0], au2);
    }

    public static av valueOf(String string) {
        return Enum.valueOf(av.class, string);
    }

    static {
        av.llllIlIlIlIIIl();
        av.llllIlIlIIlIll();
        GUAM = new av(llIIIlIlIlll[2], au.GUAM);
        TARROMIN = new av(llIIIlIlIlll[3], au.TARROMIN);
        HARRALANDER = new av(llIIIlIlIlll[5], au.HARRALANDER);
        RANNAR_WEED = new av(llIIIlIlIlll[7], au.RANARR);
        SNAPDRAGON = new av(llIIIlIlIlll[9], au.SNAPDRAGON);
        TOADFLAX = new av(llIIIlIlIlll[11], au.TOADFLAX);
        IRIT = new av(llIIIlIlIlll[13], au.IRIT);
        CADANTINE = new av(llIIIlIlIlll[15], au.CADANTINE);
        LANTADYME = new av(llIIIlIlIlll[17], au.LANTADYME);
        DWARF_WEED = new av(llIIIlIlIlll[19], au.DWARF_WEED);
        TORSTOL = new av(llIIIlIlIlll[21], au.TORSTOL);
        AVANTOE = new av(llIIIlIlIlll[23], au.AVANTOE);
        KWUARM = new av(llIIIlIlIlll[25], au.KWUARM);
        SNAPE_GRASS = new av(llIIIlIlIlll[27], llIIIlIlIlll[6], au.SNAPE_GRASS);
        WATERMELON = new av(llIIIlIlIlll[29], llIIIlIlIlll[6], au.WATERMELON);
        ONIONS = new av(llIIIlIlIlll[31], llIIIlIlIlll[6], au.ONION);
        SWEETCORN = new av(llIIIlIlIlll[33], llIIIlIlIlll[6], au.SWEETCORN);
        STRAWEBERRIES = new av(llIIIlIlIlll[35], llIIIlIlIlll[6], au.STRAWBERRY);
        LIMPWURT = new av(llIIIlIlIlll[37], au.LIMPWURT);
        MARIGOLD = new av(llIIIlIlIlll[39], au.MARIGOLD);
        NASTURTIUM = new av(llIIIlIlIlll[41], au.NASTURTIUM);
        WHITE_BERRY = new av(llIIIlIlIlll[43], au.WHITEBERRIES);
        POISON_IVY = new av(llIIIlIlIlll[45], au.POISON_IVY);
        JANGERBERRIES = new av(llIIIlIlIlll[47], au.JANGERBERRIES);
        SEAWEED = new av(llIIIlIlIlll[49], au.SEAWEED);
        GRAPES = new av(llIIIlIlIlll[51], au.GRAPE);
        DEFAULT = new av(llIIIlIlIlll[53], null);
        av[] avArray = new av[llIIIlIlIlll[54]];
        avArray[av.llIIIlIlIlll[1]] = GUAM;
        avArray[av.llIIIlIlIlll[0]] = TARROMIN;
        avArray[av.llIIIlIlIlll[4]] = HARRALANDER;
        avArray[av.llIIIlIlIlll[6]] = RANNAR_WEED;
        avArray[av.llIIIlIlIlll[8]] = SNAPDRAGON;
        avArray[av.llIIIlIlIlll[10]] = TOADFLAX;
        avArray[av.llIIIlIlIlll[12]] = IRIT;
        avArray[av.llIIIlIlIlll[14]] = CADANTINE;
        avArray[av.llIIIlIlIlll[16]] = LANTADYME;
        avArray[av.llIIIlIlIlll[18]] = DWARF_WEED;
        avArray[av.llIIIlIlIlll[20]] = TORSTOL;
        avArray[av.llIIIlIlIlll[22]] = AVANTOE;
        avArray[av.llIIIlIlIlll[24]] = KWUARM;
        avArray[av.llIIIlIlIlll[26]] = SNAPE_GRASS;
        avArray[av.llIIIlIlIlll[28]] = WATERMELON;
        avArray[av.llIIIlIlIlll[30]] = ONIONS;
        avArray[av.llIIIlIlIlll[32]] = SWEETCORN;
        avArray[av.llIIIlIlIlll[34]] = STRAWEBERRIES;
        avArray[av.llIIIlIlIlll[36]] = LIMPWURT;
        avArray[av.llIIIlIlIlll[38]] = MARIGOLD;
        avArray[av.llIIIlIlIlll[40]] = NASTURTIUM;
        avArray[av.llIIIlIlIlll[42]] = WHITE_BERRY;
        avArray[av.llIIIlIlIlll[44]] = POISON_IVY;
        avArray[av.llIIIlIlIlll[46]] = JANGERBERRIES;
        avArray[av.llIIIlIlIlll[48]] = SEAWEED;
        avArray[av.llIIIlIlIlll[50]] = GRAPES;
        avArray[av.llIIIlIlIlll[52]] = DEFAULT;
        $VALUES = avArray;
    }
}

