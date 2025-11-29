/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.K;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.O;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class L {
    private static final /* synthetic */ Pattern cg;
    private static /* synthetic */ String[] lIlIlIlllIII;
    private static final /* synthetic */ Logger ce;
    private static /* synthetic */ int[] lIlIlIlllIIl;
    private static final /* synthetic */ String[] ch;
    private static final /* synthetic */ List<K> cf;

    private static String llIllllIlllllI(String var50, String var11) {
        var50 = new String(Base64.getDecoder().decode(var50.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var35 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var36 = lIlIlIlllIIl[0];
        char[] var37 = var50.toCharArray();
        int var41 = var37.length;
        int var32 = lIlIlIlllIIl[0];
        while (L.llIlllllIIIlII(var32, var41)) {
            char var33 = var37[var32];
            var35.append((char)(var33 ^ var13[var36 % var13.length]));
            0;
            ++var36;
            ++var32;
            0;
            if (((0x3B ^ 0x1A) & ~(0xA7 ^ 0x86)) == 0) continue;
            return null;
        }
        return String.valueOf(var35);
    }

    private static void llIlllllIIIIIl() {
        lIlIlIlllIII = new String[lIlIlIlllIIl[36]];
        L.lIlIlIlllIII[L.lIlIlIlllIIl[0]] = L."N";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[1]] = L."E";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[7]] = L."S";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[4]] = L."W";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[6]] = L."^([A-Z]*)\\.([A-Z]*) - #([A-Z]*)#([A-Z]*)$";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[12]] = L."FSCCP.PCSCF - #WNWSWN#ESEENW";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[13]] = L."FSCCS.PCPSF - #WSEEEN#WSWNWS";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[14]] = L."FSCPC.CSCPF - #WNWWSE#EENWWW";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[3]] = L."SCCFC.PSCSF - #EEENWW#WSEEEN";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[15]] = L."SCCFP.CCSPF - #NESEEN#WSWNWS";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[16]] = L."SCFCP.CCSPF - #ESEENW#ESWWNW";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[17]] = L."SCFCP.CSCFS - #ENEESW#ENWWSW";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[18]] = L."SCFCPC.CSPCSF - #ESWWNWS#NESENES";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[19]] = L."SCFPC.CSPCF - #WSWWNE#WSEENE";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[20]] = L."SCFPC.PCCSF - #WSEENE#WWWSEE";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[21]] = L."SCFPC.SCPCF - #NESENE#WSWWNE";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[22]] = L."SCPFC.CCPSF - #NWWWSE#WNEESE";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[23]] = L."SCPFC.CSPCF - #NEEESW#WWNEEE";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[24]] = L."SCPFC.CSPSF - #WWSEEE#NWSWWN";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[25]] = L."SCSPF.CCSPF - #ESWWNW#ESENES";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[26]] = L."SFCCP.CSCPF - #WNEESE#NWSWWN";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[27]] = L."SFCCS.PCPSF - #ENWWSW#ENESEN";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[28]] = L."SPCFC.CSPCF - #WWNEEE#WSWNWS";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[29]] = L."SPCFC.SCCPF - #ESENES#WWWNEE";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[30]] = L."SPSFP.CCCSF - #NWSWWN#ESEENW";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[31]] = L."SCFCP.CSCPF - #ENESEN#WWWSEE";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[11]] = L."SCPFC.PCSCF - #WNEEES#NWSWNW";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[32]] = L."SFCCPC.PCSCPF - #WSEENES#WWWNEEE";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[33]] = L."FSPCC.PSCCF - #WWWSEE#ENWWSW";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[34]] = L."FSCCP.PCSCF - #ENWWWS#NEESEN";
        L.lIlIlIlllIII[L.lIlIlIlllIIl[35]] = L."SCPFC.CCSSF - #NEESEN#WSWWNE";
    }

    public L() {
        this.bQ();
    }

    /*
     * WARNING - void declaration
     */
    public K a(String string) {
        void var18;
        K var26;
        Object var2_2 = null;
        int n2 = lIlIlIlllIIl[0];
        Iterator<K> var4 = cf.iterator();
        while (L.llIlllllIIIIll(var4.hasNext() ? 1 : 0)) {
            void var23;
            K var38 = var4.next();
            int var34 = lIlIlIlllIIl[1];
            int var6 = lIlIlIlllIIl[0];
            while (L.llIlllllIIIlII(var6, var23.length())) {
                O var46 = var38.w(var6);
                char var5 = var23.charAt(var6);
                if (L.llIlllllIIIlIl(var46) && L.llIlllllIIIllI(var5, lIlIlIlllIIl[2]) && L.llIlllllIIIllI(var5, var46.ca())) {
                    var34 = lIlIlIlllIIl[0];
                    0;
                    if (null == null) break;
                    return null;
                }
                ++var6;
                0;
                if (((0xA1 ^ 0x83) & ~(0xB8 ^ 0x9A)) == ((8 ^ 0x2C) & ~(0xA9 ^ 0x8D))) continue;
                return null;
            }
            if (L.llIlllllIIIIll(var34)) {
                var26 = var38;
                ++var18;
                ce.debug("Found matching layout: " + var38.d());
            }
            0;
            
            return null;
        }
        if (L.llIlllllIIIlll((int)var18, lIlIlIlllIIl[1])) {
            return var26;
        }
        return null;
    }

    private static boolean llIlllllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllllIIlIII(int n2) {
        return n2 >= 0;
    }

    private static boolean llIlllllIIIlIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private void bQ() {
        void var31;
        String[] stringArray = ch;
        int n2 = stringArray.length;
        int var9 = lIlIlIlllIIl[0];
        while (L.llIlllllIIIlII(var9, (int)var31)) {
            void var10;
            void var8 = var10[var9];
            Matcher var44 = cg.matcher((CharSequence)var8);
            if (L.llIlllllIIlIIl(var44.find() ? 1 : 0)) {
                0;
                if (3 > 3) {
                    return;
                }
            } else {
                L var15;
                int var24 = var15.b(var44.group(lIlIlIlllIIl[4]));
                K var52 = new K();
                O var2 = null;
                int var14 = lIlIlIlllIIl[0];
                while (L.llIlllllIIIlII(var14, lIlIlIlllIIl[7])) {
                    O var16;
                    String var29 = var44.group(lIlIlIlllIIl[1] + var14);
                    String var45 = var44.group(lIlIlIlllIIl[4] + var14);
                    int var3 = lIlIlIlllIIl[0];
                    while (L.llIlllllIIIlII(var3, var45.length())) {
                        char c2;
                        if (L.llIlllllIIlIIl(var3)) {
                            c2 = lIlIlIlllIIl[9];
                            0;
                            if (1 < 0) {
                                return;
                            }
                        } else {
                            c2 = var29.charAt(var3 - lIlIlIlllIIl[1]);
                        }
                        char var1 = c2;
                        var16 = new O(var24, var1);
                        if (L.llIlllllIIIlIl(var2)) {
                            var2.b(var16);
                            var16.c(var2);
                        }
                        var52.a(var16);
                        var2 = var16;
                        int var30 = var15.b(var45.charAt(var3));
                        var24 += var30;
                        ++var3;
                        0;
                        if (3 != 0) continue;
                        return;
                    }
                    var16 = new O(var24, lIlIlIlllIIl[10]);
                    var16.c(var2);
                    var2.b(var16);
                    var52.a(var16);
                    var24 += 8;
                    ++var14;
                    0;
                    if (3 >= 0) continue;
                    return;
                }
                cf.add(var52);
                0;
            }
            ++var9;
            0;
            if (-2 < 0) continue;
            return;
        }
    }

    private static boolean llIlllllIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIlllllIIIIlI() {
        lIlIlIlllIIl = new int[37];
        L.lIlIlIlllIIl[0] = (34 + 11 - -46 + 85 ^ 117 + 132 - 62 + 4) & (0xC7 ^ 0x8C ^ (0x10 ^ 0x54) ^ -1);
        L.lIlIlIlllIIl[1] = 1;
        L.lIlIlIlllIIl[2] = 123 + 88 - 164 + 135 ^ 77 + 67 - 28 + 34;
        L.lIlIlIlllIIl[3] = 5 ^ 0xD;
        L.lIlIlIlllIIl[4] = 3;
        L.lIlIlIlllIIl[5] = -1;
        L.lIlIlIlllIIl[6] = 0xE9 ^ 0xC0 ^ (0x67 ^ 0x4A);
        L.lIlIlIlllIIl[7] = 2;
        L.lIlIlIlllIIl[8] = -(0x28 ^ 0x2C);
        L.lIlIlIlllIIl[9] = 0x62 ^ 0x64 ^ (0xB9 ^ 0x9C);
        L.lIlIlIlllIIl[10] = 123 + 7 - 54 + 88;
        L.lIlIlIlllIIl[11] = 0x78 ^ 0x1F ^ (0xFA ^ 0x87);
        L.lIlIlIlllIIl[12] = 0x4A ^ 0x4F;
        L.lIlIlIlllIIl[13] = 140 + 52 - 160 + 136 ^ 85 + 80 - 98 + 107;
        L.lIlIlIlllIIl[14] = 0xB3 ^ 0xB4;
        L.lIlIlIlllIIl[15] = 0xBB ^ 0x8E ^ (0x2F ^ 0x13);
        L.lIlIlIlllIIl[16] = 34 + 138 - 88 + 71 ^ 61 + 80 - 105 + 109;
        L.lIlIlIlllIIl[17] = 0xA7 ^ 0xAC;
        L.lIlIlIlllIIl[18] = 0x28 ^ 0x24;
        L.lIlIlIlllIIl[19] = 0x8F ^ 0x82;
        L.lIlIlIlllIIl[20] = 0x5C ^ 0x52;
        L.lIlIlIlllIIl[21] = 0x7B ^ 0x4E ^ (0x14 ^ 0x2E);
        L.lIlIlIlllIIl[22] = 0x14 ^ 4;
        L.lIlIlIlllIIl[23] = 0x6A ^ 1 ^ (0x5B ^ 0x21);
        L.lIlIlIlllIIl[24] = 30 + 72 - 25 + 104 ^ 62 + 35 - -11 + 59;
        L.lIlIlIlllIIl[25] = 0xD ^ 0x52 ^ (0x31 ^ 0x7D);
        L.lIlIlIlllIIl[26] = 0xA1 ^ 0xB9 ^ (0x75 ^ 0x79);
        L.lIlIlIlllIIl[27] = 0x35 ^ 0x54 ^ (0xD1 ^ 0xA5);
        L.lIlIlIlllIIl[28] = 105 + 151 - 73 + 0 ^ 105 + 12 - 91 + 135;
        L.lIlIlIlllIIl[29] = 0x20 ^ 0x37;
        L.lIlIlIlllIIl[30] = 0x2C ^ 0x1A ^ (0xB5 ^ 0x9B);
        L.lIlIlIlllIIl[31] = 110 + 12 - 42 + 59 ^ 136 + 83 - 209 + 136;
        L.lIlIlIlllIIl[32] = 0xDB ^ 0x92 ^ (0x2E ^ 0x7C);
        L.lIlIlIlllIIl[33] = 0x69 ^ 0x75;
        L.lIlIlIlllIIl[34] = 0x13 ^ 0xE;
        L.lIlIlIlllIIl[35] = 9 ^ 0x17;
        L.lIlIlIlllIIl[36] = 172 + 25 - 28 + 47 ^ 189 + 151 - 330 + 189;
    }

    static {
        L.llIlllllIIIIlI();
        L.llIlllllIIIIIl();
        ce = LoggerFactory.getLogger(L.class);
        cf = new ArrayList<K>();
        cg = Pattern.compile(lIlIlIlllIII[lIlIlIlllIIl[6]]);
        String[] stringArray = new String[lIlIlIlllIIl[11]];
        stringArray[L.lIlIlIlllIIl[0]] = lIlIlIlllIII[lIlIlIlllIIl[12]];
        stringArray[L.lIlIlIlllIIl[1]] = lIlIlIlllIII[lIlIlIlllIIl[13]];
        stringArray[L.lIlIlIlllIIl[7]] = lIlIlIlllIII[lIlIlIlllIIl[14]];
        stringArray[L.lIlIlIlllIIl[4]] = lIlIlIlllIII[lIlIlIlllIIl[3]];
        stringArray[L.lIlIlIlllIIl[6]] = lIlIlIlllIII[lIlIlIlllIIl[15]];
        stringArray[L.lIlIlIlllIIl[12]] = lIlIlIlllIII[lIlIlIlllIIl[16]];
        stringArray[L.lIlIlIlllIIl[13]] = lIlIlIlllIII[lIlIlIlllIIl[17]];
        stringArray[L.lIlIlIlllIIl[14]] = lIlIlIlllIII[lIlIlIlllIIl[18]];
        stringArray[L.lIlIlIlllIIl[3]] = lIlIlIlllIII[lIlIlIlllIIl[19]];
        stringArray[L.lIlIlIlllIIl[15]] = lIlIlIlllIII[lIlIlIlllIIl[20]];
        stringArray[L.lIlIlIlllIIl[16]] = lIlIlIlllIII[lIlIlIlllIIl[21]];
        stringArray[L.lIlIlIlllIIl[17]] = lIlIlIlllIII[lIlIlIlllIIl[22]];
        stringArray[L.lIlIlIlllIIl[18]] = lIlIlIlllIII[lIlIlIlllIIl[23]];
        stringArray[L.lIlIlIlllIIl[19]] = lIlIlIlllIII[lIlIlIlllIIl[24]];
        stringArray[L.lIlIlIlllIIl[20]] = lIlIlIlllIII[lIlIlIlllIIl[25]];
        stringArray[L.lIlIlIlllIIl[21]] = lIlIlIlllIII[lIlIlIlllIIl[26]];
        stringArray[L.lIlIlIlllIIl[22]] = lIlIlIlllIII[lIlIlIlllIIl[27]];
        stringArray[L.lIlIlIlllIIl[23]] = lIlIlIlllIII[lIlIlIlllIIl[28]];
        stringArray[L.lIlIlIlllIIl[24]] = lIlIlIlllIII[lIlIlIlllIIl[29]];
        stringArray[L.lIlIlIlllIIl[25]] = lIlIlIlllIII[lIlIlIlllIIl[30]];
        stringArray[L.lIlIlIlllIIl[26]] = lIlIlIlllIII[lIlIlIlllIIl[31]];
        stringArray[L.lIlIlIlllIIl[27]] = lIlIlIlllIII[lIlIlIlllIIl[11]];
        stringArray[L.lIlIlIlllIIl[28]] = lIlIlIlllIII[lIlIlIlllIIl[32]];
        stringArray[L.lIlIlIlllIIl[29]] = lIlIlIlllIII[lIlIlIlllIIl[33]];
        stringArray[L.lIlIlIlllIIl[30]] = lIlIlIlllIII[lIlIlIlllIIl[34]];
        stringArray[L.lIlIlIlllIIl[31]] = lIlIlIlllIII[lIlIlIlllIIl[35]];
        ch = stringArray;
    }

    private static boolean llIlllllIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlllllIIIIll(int n2) {
        return n2 != 0;
    }

    private static String llIllllIllllll(String var43, String var47) {
        try {
            SecretKeySpec var40 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var47.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var42 = Cipher.getInstance("Blowfish");
            var42.init(lIlIlIlllIIl[7], var40);
            return new String(var42.doFinal(Base64.getDecoder().decode(var43.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int b(char c2) {
        int var39;
        String string = String.valueOf(c2);
        int n2 = lIlIlIlllIIl[5];
        switch (string.hashCode()) {
            case 78: {
                void var48;
                if (!L.llIlllllIIIIll(var48.equals(lIlIlIlllIII[lIlIlIlllIIl[0]]) ? 1 : 0)) break;
                var39 = lIlIlIlllIIl[0];
                0;
                if (-(0x89 ^ 0x8F ^ 2) < 0) break;
                return (65 + 88 - 41 + 17 ^ 131 + 163 - 144 + 14) & (0 + 15 - -116 + 2 ^ 16 + 35 - 1 + 110 ^ -1);
            }
            case 69: {
                void var48;
                if (!L.llIlllllIIIIll(var48.equals(lIlIlIlllIII[lIlIlIlllIIl[1]]) ? 1 : 0)) break;
                var39 = lIlIlIlllIIl[1];
                0;
                if ((1 & (1 ^ -1)) == 0) break;
                return (146 + 56 - 64 + 32 ^ 38 + 73 - 97 + 149) & (0x10 ^ 0x3F ^ (0x2E ^ 8) ^ -1);
            }
            case 83: {
                void var48;
                if (!L.llIlllllIIIIll(var48.equals(lIlIlIlllIII[lIlIlIlllIIl[7]]) ? 1 : 0)) break;
                var39 = lIlIlIlllIIl[7];
                0;
                if (null == null) break;
                return (0x18 ^ 0x10) & ~(0x60 ^ 0x68);
            }
            case 87: {
                void var48;
                if (!L.llIlllllIIIIll(var48.equals(lIlIlIlllIII[lIlIlIlllIIl[4]]) ? 1 : 0)) break;
                var39 = lIlIlIlllIIl[4];
            }
        }
        switch (var39) {
            case 0: {
                return lIlIlIlllIIl[8];
            }
            case 1: {
                return lIlIlIlllIIl[1];
            }
            case 2: {
                return lIlIlIlllIIl[6];
            }
            case 3: {
                return lIlIlIlllIIl[5];
            }
        }
        return lIlIlIlllIIl[0];
    }

    private static String llIlllllIIIIII(String var27, String var17) {
        try {
            SecretKeySpec var51 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIlIlIlllIIl[3]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(lIlIlIlllIIl[7], var51);
            return new String(var28.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int b(String string) {
        void var21;
        int n2 = lIlIlIlllIIl[0];
        int n3 = lIlIlIlllIIl[0];
        int var22 = lIlIlIlllIIl[0];
        while (L.llIlllllIIIlII(var22, var21.length())) {
            void var7;
            L var49;
            char var12 = var21.charAt(var22);
            int var25 = var49.b(var12);
            if (!L.llIlllllIIlIII((int)(var7 += var25)) || !L.llIlllllIIIlII((int)var7, lIlIlIlllIIl[3]) || L.llIlllllIIIlll((int)var7, lIlIlIlllIIl[4]) && !L.llIlllllIIIllI(var25, lIlIlIlllIIl[5]) || L.llIlllllIIIlll((int)var7, lIlIlIlllIIl[6]) && L.llIlllllIIIlll(var25, lIlIlIlllIIl[1])) {
                var7 -= var25;
                lllllllllllllllIllIIllIlllllIlIl -= var25;
            }
            ++var22;
            0;
            
            return 3 & (3 ^ -1);
        }
        return n2;
    }

    public static List<K> bR() {
        return cf;
    }
}

