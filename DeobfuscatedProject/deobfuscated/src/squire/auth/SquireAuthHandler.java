/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.auth.AccountData;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import okhttp3.CookieJar;
import okhttp3.FormBody$Builder;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import okhttp3.Request;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SquireAuthHandler {
    private static /* synthetic */ String t;
    public static final /* synthetic */ String n;
    private static final /* synthetic */ Gson l;
    public static final /* synthetic */ String h;
    private static /* synthetic */ int[] lIlIIl;
    public static final /* synthetic */ String r;
    private static /* synthetic */ String[] llllI;

    /*
     * WARNING - void declaration
     */
    private static String a(Map<String, Object> map, OkHttpClient okHttpClient) {
        String lllllIIlIIIlIII22;
        Object lllllIIlIIIlIIl;
        Request lllllIIlIIIlIlI;
        void lllllIIlIIIllIl;
        Object lllllIIlIIIIlll22;
        Object lllllIIlIIIIlIl;
        Object lllllIIlIIIIllI;
        block27: {
            void lllllIIlIIIlIll;
            block26: {
                Object lllllIIlIIIIIll22;
                int n = map.getOrDefault(llllI[lIlIIl[90]], llllI[lIlIIl[91]]).toString().equalsIgnoreCase(llllI[lIlIIl[92]]);
                String string = map.get(llllI[lIlIIl[93]]).toString();
                if (!a.lIlIlIl(n)) break block26;
                Map map2 = (Map)map.get(llllI[lIlIIl[94]]);
                List list = (List)map2.get(llllI[lIlIIl[95]]);
                String string2 = llllI[lIlIIl[96]];
                lllllIIlIIIIllI = list.iterator();
                while (a.lIlIlIl(lllllIIlIIIIllI.hasNext() ? 1 : 0)) {
                    lllllIIlIIIIlIl = (Map)lllllIIlIIIIllI.next();
                    if (a.lIlIlIl(((String)lllllIIlIIIIlIl.get(llllI[lIlIIl[97]])).equalsIgnoreCase(llllI[lIlIIl[98]]) ? 1 : 0)) {
                        lllllIIlIIIIlll22 = (String)lllllIIlIIIIlIl.get(llllI[lIlIIl[99]]);
                        0;
                        if (-1 == -1) break;
                        return null;
                    }
                    0;
                    if (4 != ((0x8A ^ 0xB3 ^ (0x9F ^ 0x85)) & (0xCA ^ 0xA2 ^ (0xF8 ^ 0xB3) ^ -1))) continue;
                    return null;
                }
                Object[] objectArray = new Object[lIlIIl[1]];
                objectArray[a.lIlIIl[0]] = lllllIIlIIIIlll22;
                lllllIIlIIIIllI = String.format(llllI[lIlIIl[100]], objectArray);
                lllllIIlIIIIlIl = RequestBody.create(MediaType.parse(llllI[lIlIIl[101]]), (String)lllllIIlIIIIllI);
                Object[] objectArray2 = new Object[lIlIIl[1]];
                objectArray2[a.lIlIIl[0]] = lllllIIlIIIlIll;
                Request lllllIIlIIIIlII = new Request$Builder().url(String.format(llllI[lIlIIl[102]], objectArray2)).put((RequestBody)lllllIIlIIIIlIl).build();
                try {
                    lllllIIlIIIIIll22 = lllllIIlIIIllIl.newCall(lllllIIlIIIIlII).execute();
                    try {
                        System.out.println(llllI[lIlIIl[103]]);
                    }
                    catch (Throwable lllllIIlIIIIIlI) {
                        if (a.lIlIlII(lllllIIlIIIIIll22)) {
                            try {
                                ((Response)lllllIIlIIIIIll22).close();
                                0;
                            }
                            catch (Throwable lllllIIlIIIIIIl) {
                                lllllIIlIIIIIlI.addSuppressed(lllllIIlIIIIIIl);
                            }
                            if ((((0xD0 ^ 0x87) & ~(0xFC ^ 0xAB) ^ (0x1B ^ 0x5D)) & (0xFB ^ 0x98 ^ (0x3B ^ 0x1E) ^ -1)) >= (0x74 ^ 0xA ^ (0x38 ^ 0x42))) {
                                return null;
                            }
                        }
                        throw lllllIIlIIIIIlI;
                    }
                    if (a.lIlIlII(lllllIIlIIIIIll22)) {
                        ((Response)lllllIIlIIIIIll22).close();
                        0;
                        if (2 != 2) {
                            return null;
                        }
                    }
                    0;
                }
                catch (IOException lllllIIlIIIIIll22) {
                    throw new RuntimeException(lllllIIlIIIIIll22);
                }
                if (-2 >= 0) {
                    return null;
                }
                lllllIIlIIIIIll22 = JOptionPane.showInputDialog(null, llllI[lIlIIl[104]], llllI[lIlIIl[105]], lIlIIl[3]);
                Object[] objectArray3 = new Object[lIlIIl[1]];
                objectArray3[a.lIlIIl[0]] = lllllIIlIIIIIll22;
                String lllllIIlIIIIIlI = String.format(llllI[lIlIIl[106]], objectArray3);
                RequestBody lllllIIlIIIIIIl = RequestBody.create(MediaType.parse(llllI[lIlIIl[107]]), lllllIIlIIIIIlI);
                Object[] objectArray4 = new Object[lIlIIl[1]];
                objectArray4[a.lIlIIl[0]] = lllllIIlIIIlIll;
                lllllIIlIIIlIlI = new Request$Builder().url(String.format(llllI[lIlIIl[108]], objectArray4)).put(lllllIIlIIIIIIl).build();
                0;
                if (((0x40 ^ 0xD ^ (0x5E ^ 5)) & (0x56 ^ 6 ^ (0xD5 ^ 0x93) ^ -1)) > 0) {
                    return null;
                }
                break block27;
            }
            lllllIIlIIIlIIl = JOptionPane.showInputDialog(null, llllI[lIlIIl[109]], llllI[lIlIIl[110]], lIlIIl[3]);
            Object[] objectArray = new Object[lIlIIl[1]];
            objectArray[a.lIlIIl[0]] = lllllIIlIIIlIIl;
            lllllIIlIIIlIII22 = String.format(llllI[lIlIIl[111]], objectArray);
            lllllIIlIIIIlll22 = RequestBody.create(MediaType.parse(llllI[lIlIIl[112]]), lllllIIlIIIlIII22);
            Object[] objectArray5 = new Object[lIlIIl[1]];
            objectArray5[a.lIlIIl[0]] = lllllIIlIIIlIll;
            lllllIIlIIIlIlI = new Request$Builder().url(String.format(llllI[lIlIIl[113]], objectArray5)).put((RequestBody)lllllIIlIIIIlll22).build();
        }
        lllllIIlIIIlIIl = lllllIIlIIIllIl.newCall(lllllIIlIIIlIlI).execute();
        try {
            lllllIIlIIIlIII22 = ((Response)lllllIIlIIIlIIl).body().string();
            System.out.println(lllllIIlIIIlIII22);
            lllllIIlIIIIlll22 = l.fromJson(lllllIIlIIIlIII22, Map.class);
            lllllIIlIIIIllI = (Map)lllllIIlIIIIlll22.get(llllI[lIlIIl[114]]);
            t = (String)lllllIIlIIIIllI.get(llllI[lIlIIl[115]]);
            lllllIIlIIIIlIl = (String)lllllIIlIIIIllI.get(llllI[lIlIIl[116]]);
        }
        catch (Throwable lllllIIlIIIlIII22) {
            try {
                if (a.lIlIlII(lllllIIlIIIlIIl)) {
                    try {
                        ((Response)lllllIIlIIIlIIl).close();
                        0;
                    }
                    catch (Throwable lllllIIlIIIIlll22) {
                        lllllIIlIIIlIII22.addSuppressed(lllllIIlIIIIlll22);
                    }
                    
                }
                throw lllllIIlIIIlIII22;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        if (a.lIlIlII(lllllIIlIIIlIIl)) {
            ((Response)lllllIIlIIIlIIl).close();
        }
        return lllllIIlIIIIlIl;
    }

    private static void lIlIIlI() {
        lIlIIl = new int[141];
        a.lIlIIl[0] = (0xE2 ^ 0x97 ^ (0x33 ^ 0x7B)) & (100 + 132 - 133 + 66 ^ 62 + 16 - 10 + 84 ^ -1);
        a.lIlIIl[1] = 1;
        a.lIlIIl[2] = 2;
        a.lIlIIl[3] = 3;
        a.lIlIIl[4] = 0x2E ^ 0xD ^ (0x46 ^ 0x61);
        a.lIlIIl[5] = 133 + 92 - 152 + 67 ^ 13 + 24 - -28 + 72;
        a.lIlIIl[6] = 0x96 ^ 0x90;
        a.lIlIIl[7] = 0x10 ^ 0x17;
        a.lIlIIl[8] = 0x42 ^ 0x51 ^ (0x3A ^ 0x21);
        a.lIlIIl[9] = 0x2F ^ 0x26;
        a.lIlIIl[10] = 0xC1 ^ 0x9E ^ (0xF7 ^ 0xA2);
        a.lIlIIl[11] = 0x96 ^ 0x9D;
        a.lIlIIl[12] = 0xAE ^ 0xBD ^ (0x8C ^ 0x93);
        a.lIlIIl[13] = 177 + 67 - 214 + 155 ^ 164 + 162 - 253 + 107;
        a.lIlIIl[14] = 109 + 137 - 231 + 188 ^ 138 + 28 - -4 + 27;
        a.lIlIIl[15] = 0x42 ^ 0x38 ^ (0x21 ^ 0x54);
        a.lIlIIl[16] = 0x9F ^ 0x8F;
        a.lIlIIl[17] = 0xA2 ^ 0xB3;
        a.lIlIIl[18] = 107 + 80 - 48 + 3 ^ 30 + 95 - 75 + 106;
        a.lIlIIl[19] = 0xBF ^ 0xAC;
        a.lIlIIl[20] = 0x1A ^ 0xE;
        a.lIlIIl[21] = 0xB1 ^ 0xA4;
        a.lIlIIl[22] = 0x2E ^ 0x6A ^ (0x18 ^ 0x4A);
        a.lIlIIl[23] = 0xF2 ^ 0xB5 ^ (0xCF ^ 0x9F);
        a.lIlIIl[24] = 0xE5 ^ 0xA9 ^ (0xF9 ^ 0xAD);
        a.lIlIIl[25] = 0x6A ^ 0x73;
        a.lIlIIl[26] = 0x23 ^ 0xE ^ (0x64 ^ 0x53);
        a.lIlIIl[27] = 0x4E ^ 0x55;
        a.lIlIIl[28] = 120 + 11 - 118 + 168 ^ 58 + 52 - -16 + 43;
        a.lIlIIl[29] = 0x31 ^ 0x5D ^ (0x55 ^ 0x24);
        a.lIlIIl[30] = 0x89 ^ 0x97;
        a.lIlIIl[31] = 0x67 ^ 0x78;
        a.lIlIIl[32] = 0x3E ^ 0x47 ^ (0xB ^ 0x52);
        a.lIlIIl[33] = 0x72 ^ 0x53;
        a.lIlIIl[34] = 0xE5 ^ 0xC7;
        a.lIlIIl[35] = 0x83 ^ 0xBB ^ (0xB ^ 0x10);
        a.lIlIIl[36] = 0x54 ^ 0x60 ^ (0x58 ^ 0x48);
        a.lIlIIl[37] = 0x65 ^ 0x40;
        a.lIlIIl[38] = 125 + 47 - 70 + 26 ^ 62 + 28 - 11 + 87;
        a.lIlIIl[39] = 0x48 ^ 0x6F;
        a.lIlIIl[40] = 0xBC ^ 0x94;
        a.lIlIIl[41] = 0x23 ^ 0xA;
        a.lIlIIl[42] = 133 + 167 - 134 + 6 ^ 59 + 124 - 84 + 35;
        a.lIlIIl[43] = 0x3A ^ 0x36 ^ (0x68 ^ 0x4F);
        a.lIlIIl[44] = 0x22 ^ 0xE;
        a.lIlIIl[45] = 0x8F ^ 0xA2;
        a.lIlIIl[46] = 146 + 37 - 71 + 59 ^ 51 + 113 - 70 + 39;
        a.lIlIIl[47] = 0x8B ^ 0xA4;
        a.lIlIIl[48] = 75 + 68 - 68 + 64 ^ 90 + 129 - 197 + 165;
        a.lIlIIl[49] = 0x43 ^ 0x16 ^ (0xA ^ 0x6E);
        a.lIlIIl[50] = 0x1F ^ 3 ^ (0x23 ^ 0xD);
        a.lIlIIl[51] = 0x42 ^ 0x59 ^ (0x51 ^ 0x79);
        a.lIlIIl[52] = 0x8B ^ 0xBF;
        a.lIlIIl[53] = 0x76 ^ 0x43;
        a.lIlIIl[54] = 0x9D ^ 0x8A ^ (0xB8 ^ 0x99);
        a.lIlIIl[55] = 0x7D ^ 0x4A;
        a.lIlIIl[56] = 0x54 ^ 0x17 ^ (0x30 ^ 0x4B);
        a.lIlIIl[57] = 0x95 ^ 0xAC;
        a.lIlIIl[58] = 0xB9 ^ 0x87 ^ (0x88 ^ 0x8C);
        a.lIlIIl[59] = 117 + 70 - 117 + 99 ^ 138 + 41 - 90 + 57;
        a.lIlIIl[60] = 0x3B ^ 7;
        a.lIlIIl[61] = 0x13 ^ 0x2E;
        a.lIlIIl[62] = 62 + 47 - -15 + 24 ^ 29 + 89 - -52 + 0;
        a.lIlIIl[63] = 0x51 ^ 0x46 ^ (0x89 ^ 0xA1);
        a.lIlIIl[64] = 0x82 ^ 0xC2;
        a.lIlIIl[65] = 0x85 ^ 0xBB ^ 50 + 46 - 55 + 86;
        a.lIlIIl[66] = 0xC3 ^ 0x81;
        a.lIlIIl[67] = 0x61 ^ 0x22;
        a.lIlIIl[68] = 0x91 ^ 0xB6 ^ (0xE9 ^ 0x8A);
        a.lIlIIl[69] = 0x74 ^ 0x79 ^ (0x6F ^ 0x27);
        a.lIlIIl[70] = 0x3F ^ 0x66 ^ (0xDA ^ 0xC5);
        a.lIlIIl[71] = 128 + 36 - 121 + 203 ^ 10 + 19 - 5 + 153;
        a.lIlIIl[72] = 0x7E ^ 0x36;
        a.lIlIIl[73] = (0x19 ^ 0x28) & ~(0x32 ^ 3) ^ (0xE0 ^ 0xA9);
        a.lIlIIl[74] = 0xDC ^ 0x96;
        a.lIlIIl[75] = 0x89 ^ 0xA9 ^ (0x1A ^ 0x71);
        a.lIlIIl[76] = 0x3E ^ 0x72;
        a.lIlIIl[77] = 0x35 ^ 0x78;
        a.lIlIIl[78] = 0xD ^ 0x43;
        a.lIlIIl[79] = 0x24 ^ 0x6B;
        a.lIlIIl[80] = 8 ^ 0x58;
        a.lIlIIl[81] = 0xD4 ^ 0x85;
        a.lIlIIl[82] = 0xF6 ^ 0xA4;
        a.lIlIIl[83] = 0x33 ^ 0x6B ^ (0x71 ^ 0x7A);
        a.lIlIIl[84] = 0xCA ^ 0xAC ^ (0x64 ^ 0x56);
        a.lIlIIl[85] = 0x10 ^ 0x45;
        a.lIlIIl[86] = 0xE2 ^ 0xB4;
        a.lIlIIl[87] = 0xEC ^ 0xBB;
        a.lIlIIl[88] = 53 + 143 - 64 + 107 ^ 86 + 36 - -25 + 36;
        a.lIlIIl[89] = 0x2B ^ 0x79 ^ (0x31 ^ 0x3A);
        a.lIlIIl[90] = 0x44 ^ 0x1E;
        a.lIlIIl[91] = 0x6E ^ 0x35;
        a.lIlIIl[92] = 0xF1 ^ 0xAD;
        a.lIlIIl[93] = 0x7D ^ 0x20;
        a.lIlIIl[94] = 0xE2 ^ 0xBC;
        a.lIlIIl[95] = 0x45 ^ 0x40 ^ (0x28 ^ 0x72);
        a.lIlIIl[96] = 0xE ^ 0x6E;
        a.lIlIIl[97] = 0xF7 ^ 0xB2 ^ (0x52 ^ 0x76);
        a.lIlIIl[98] = 4 + 229 - 71 + 76 ^ 80 + 4 - 76 + 132;
        a.lIlIIl[99] = 0x3E ^ 0x5D;
        a.lIlIIl[100] = 0x73 ^ 0x17;
        a.lIlIIl[101] = 0x1C ^ 0x79;
        a.lIlIIl[102] = 0xD5 ^ 0xB3;
        a.lIlIIl[103] = 0xE8 ^ 0x8F;
        a.lIlIIl[104] = 0x46 ^ 0x6B ^ (0xF0 ^ 0xB5);
        a.lIlIIl[105] = 3 ^ 0x6A;
        a.lIlIIl[106] = 6 ^ 0x76 ^ (0xAA ^ 0xB0);
        a.lIlIIl[107] = 0xD7 ^ 0xBC;
        a.lIlIIl[108] = 0x2D ^ 0x41;
        a.lIlIIl[109] = 193 + 53 - 139 + 104 ^ 170 + 127 - 213 + 106;
        a.lIlIIl[110] = 0x12 ^ 0x7C;
        a.lIlIIl[111] = 0xF8 ^ 0x97;
        a.lIlIIl[112] = 0x6E ^ 0x1E;
        a.lIlIIl[113] = 0xDA ^ 0xBE ^ (0x7D ^ 0x68);
        a.lIlIIl[114] = 0xD6 ^ 0xA4;
        a.lIlIIl[115] = 2 ^ 0x71;
        a.lIlIIl[116] = 0x14 ^ 0x35 ^ (0x64 ^ 0x31);
        a.lIlIIl[117] = 0xD2 ^ 0xA7;
        a.lIlIIl[118] = 0xE9 ^ 0x9F;
        a.lIlIIl[119] = 0xC5 ^ 0xB2;
        a.lIlIIl[120] = 0xBF ^ 0xC7;
        a.lIlIIl[121] = 0x3C ^ 0x69 ^ (0x35 ^ 0x19);
        a.lIlIIl[122] = 0xDB ^ 0xA1;
        a.lIlIIl[123] = 0xDD ^ 0xAA ^ (0x41 ^ 0x4D);
        a.lIlIIl[124] = 32 + 71 - -68 + 29;
        a.lIlIIl[125] = 0x18 ^ 0x64;
        a.lIlIIl[126] = 0x57 ^ 0x6E ^ (0x78 ^ 0x3C);
        a.lIlIIl[127] = 7 ^ 0x79;
        a.lIlIIl[128] = 116 + 12 - 76 + 75;
        a.lIlIIl[129] = 33 + 59 - 24 + 60;
        a.lIlIIl[130] = (0xD4 ^ 0x84) + (0xAF ^ 0xB4) - (0x32 ^ 6) + (0xF1 ^ 0xBB);
        a.lIlIIl[131] = (2 ^ 0x56) + (0x19 ^ 0x15) - (0x68 ^ 0x6E) + (0x49 ^ 0x61);
        a.lIlIIl[132] = (0xE ^ 0x34) + (0x46 ^ 0x6A) - -(0xBC ^ 0xA7) + 2;
        a.lIlIIl[133] = 45 + 82 - 60 + 65;
        a.lIlIIl[134] = (0x9E ^ 0x9A) + (0x23 ^ 0x52) - -(0x1C ^ 0x1B) + (0xC9 ^ 0xC0);
        a.lIlIIl[135] = 99 + 123 - 211 + 123;
        a.lIlIIl[136] = (0xF7 ^ 0x8D) + (0x8F ^ 0xB9) - (56 + 102 - 47 + 44) + (0xCB ^ 0xB9);
        a.lIlIIl[137] = (5 ^ 0x6E) + (0x1B ^ 0x2A) - (0x13 ^ 0x71) + (0x6B ^ 0x25);
        a.lIlIIl[138] = (0xC4 ^ 0xA0) + (0x26 ^ 0x5D) - (32 + 100 - -1 + 24) + (0x6C ^ 0x2B);
        a.lIlIIl[139] = (0x67 ^ 0x2C) + (0xAA ^ 0xC0) - (0x8B ^ 0xC5) + (0xAC ^ 0x8F);
        a.lIlIIl[140] = 103 + 137 - 184 + 83;
    }

    /*
     * WARNING - void declaration
     */
    private static String c(String string, OkHttpClient okHttpClient) {
        String lllllIIlllIIIIl;
        void lllllIIlllIIllI;
        Object[] objectArray = new Object[lIlIIl[1]];
        objectArray[a.lIlIIl[0]] = t;
        Object[] objectArray2 = new Object[lIlIIl[1]];
        objectArray2[a.lIlIIl[0]] = string;
        Request lllllIIlllIIlIl = new Request$Builder().url(String.format(llllI[lIlIIl[46]], objectArray)).header(llllI[lIlIIl[47]], String.format(llllI[lIlIIl[48]], objectArray2)).build();
        Response lllllIIlllIIlII = lllllIIlllIIllI.newCall(lllllIIlllIIlIl).execute();
        try {
            String lllllIIlllIIIll = lllllIIlllIIlII.body().string();
            Map lllllIIlllIIIlI = l.fromJson(lllllIIlllIIIll, Map.class);
            lllllIIlllIIIIl = (String)lllllIIlllIIIlI.get(llllI[lIlIIl[49]]);
        }
        catch (Throwable lllllIIlllIIIll) {
            try {
                if (a.lIlIlII(lllllIIlllIIlII)) {
                    try {
                        lllllIIlllIIlII.close();
                        0;
                    }
                    catch (Throwable lllllIIlllIIIlI) {
                        lllllIIlllIIIll.addSuppressed(lllllIIlllIIIlI);
                    }
                    if (3 != 3) {
                        return null;
                    }
                }
                throw lllllIIlllIIIll;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        if (a.lIlIlII(lllllIIlllIIlII)) {
            lllllIIlllIIlII.close();
        }
        return lllllIIlllIIIIl;
    }

    private static boolean lIlIlII(Object object) {
        return object != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Map<String, Object> a(OkHttpClient okHttpClient, String string) {
        String string2 = JOptionPane.showInputDialog(null, llllI[lIlIIl[117]], llllI[lIlIIl[118]], lIlIIl[3]);
        String string3 = JOptionPane.showInputDialog(null, llllI[lIlIIl[119]], llllI[lIlIIl[120]], lIlIIl[3]);
        Object[] objectArray = new Object[lIlIIl[3]];
        objectArray[a.lIlIIl[0]] = string2;
        objectArray[a.lIlIIl[1]] = string3;
        objectArray[a.lIlIIl[2]] = string;
        String string4 = String.format(llllI[lIlIIl[121]], objectArray);
        RequestBody requestBody = RequestBody.create(MediaType.parse(llllI[lIlIIl[122]]), string4);
        Request lllllIIIlllIIII = new Request$Builder().url(llllI[lIlIIl[123]]).post(requestBody).build();
        try {
            Response lllllIIIllIllll;
            block7: {
                OkHttpClient lllllIIIlllIllI;
                lllllIIIllIllll = lllllIIIlllIllI.newCall(lllllIIIlllIIII).execute();
                try {
                    if (!a.lIllIII(lllllIIIllIllll.code(), lIlIIl[124])) break block7;
                    JOptionPane.showMessageDialog(null, llllI[lIlIIl[125]], llllI[lIlIIl[126]], lIlIIl[0]);
                    Map<String, Object> lllllIIIllIlllI222 = null;
                }
                catch (Throwable lllllIIIllIlllI222) {
                    if (!a.lIlIlII(lllllIIIllIllll)) throw lllllIIIllIlllI222;
                    try {
                        lllllIIIllIllll.close();
                        0;
                    }
                    catch (Throwable lllllIIIllIllIl) {
                        lllllIIIllIlllI222.addSuppressed(lllllIIIllIllIl);
                    }
                    throw lllllIIIllIlllI222;
                    throw lllllIIIllIlllI222;
                }
                if (!a.lIlIlII(lllllIIIllIllll)) return lllllIIIllIlllI222;
                lllllIIIllIllll.close();
                return lllllIIIllIlllI222;
            }
            Map lllllIIIllIlllI222 = l.fromJson(lllllIIIllIllll.body().string(), Map.class);
            if (!a.lIlIlII(lllllIIIllIllll)) return lllllIIIllIlllI222;
            lllllIIIllIllll.close();
            return lllllIIIllIlllI222;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    private static void lIlIIIl() {
        llllI = new String[lIlIIl[140]];
        a.llllI[a.lIlIIl[0]] = a."Invalid authentication code";
        a.llllI[a.lIlIIl[1]] = a."Squire Jagex Acc Importer";
        a.llllI[a.lIlIIl[2]] = a."";
        a.llllI[a.lIlIIl[3]] = a."location";
        a.llllI[a.lIlIIl[4]] = a."code=";
        a.llllI[a.lIlIIl[5]] = a."&";
        a.llllI[a.lIlIIl[6]] = a."grant_type";
        a.llllI[a.lIlIIl[7]] = a."authorization_code";
        a.llllI[a.lIlIIl[8]] = a."client_id";
        a.llllI[a.lIlIIl[9]] = a."com_jagex_auth_desktop_launcher";
        a.llllI[a.lIlIIl[10]] = a."code";
        a.llllI[a.lIlIIl[11]] = a."redirect_uri";
        a.llllI[a.lIlIIl[12]] = a."https://secure.runescape.com/m=weblogin/launcher-redirect";
        a.llllI[a.lIlIIl[13]] = a."https://account.jagex.com/oauth2/token";
        a.llllI[a.lIlIIl[14]] = a."";
        a.llllI[a.lIlIIl[15]] = a."";
        a.llllI[a.lIlIIl[16]] = a."access_token";
        a.llllI[a.lIlIIl[17]] = a."id_token";
        a.llllI[a.lIlIIl[18]] = a."{\"idToken\":\"%s\"}";
        a.llllI[a.lIlIIl[19]] = a."application/json";
        a.llllI[a.lIlIIl[20]] = a."https://auth.runescape.com/game-session/v1/sessions";
        a.llllI[a.lIlIIl[21]] = a."sessionId";
        a.llllI[a.lIlIIl[22]] = a."https://auth.runescape.com/game-session/v1/accounts";
        a.llllI[a.lIlIIl[23]] = a."Authorization";
        a.llllI[a.lIlIIl[24]] = a."Bearer %s";
        a.llllI[a.lIlIIl[25]] = a."accountId";
        a.llllI[a.lIlIIl[26]] = a."sessionId";
        a.llllI[a.lIlIIl[27]] = a."displayName";
        a.llllI[a.lIlIIl[28]] = a."displayName";
        a.llllI[a.lIlIIl[29]] = a."NO_DISPLAY_NAME";
        a.llllI[a.lIlIIl[30]] = a."user.home";
        a.llllI[a.lIlIIl[31]] = a.".squire";
        a.llllI[a.lIlIIl[32]] = a."launcher.dat";
        a.llllI[a.lIlIIl[33]] = a.":";
        a.llllI[a.lIlIIl[34]] = a."accountId";
        a.llllI[a.lIlIIl[35]] = a."displayName";
        a.llllI[a.lIlIIl[36]] = a."NO_DISPLAY_NAME";
        a.llllI[a.lIlIIl[37]] = a."sessionId";
        a.llllI[a.lIlIIl[38]] = a."displayName";
        a.llllI[a.lIlIIl[39]] = a."displayName";
        a.llllI[a.lIlIIl[40]] = a."accountId";
        a.llllI[a.lIlIIl[41]] = a."sessionId";
        a.llllI[a.lIlIIl[42]] = a."displayName";
        a.llllI[a.lIlIIl[43]] = a."";
        a.llllI[a.lIlIIl[44]] = a."::%s:%s:%s
";
        a.llllI[a.lIlIIl[45]] = a."Successfully imported %d characters, have a total of %d characters now!";
        a.llllI[a.lIlIIl[46]] = a."https://api.jagex.com/v1/users/%s/displayName";
        a.llllI[a.lIlIIl[47]] = a."Authorization";
        a.llllI[a.lIlIIl[48]] = a."Bearer %s";
        a.llllI[a.lIlIIl[49]] = a."displayName";
        a.llllI[a.lIlIIl[50]] = a."https://account.jagex.com/oauth2/auth";
        a.llllI[a.lIlIIl[51]] = a."id_token_hint";
        a.llllI[a.lIlIIl[52]] = a."nonce";
        a.llllI[a.lIlIIl[53]] = a."YWI0MTUzZWYtODQ2My00NWRhLTkyZDktNWI3MmIxNDA1Mzgz";
        a.llllI[a.lIlIIl[54]] = a."prompt";
        a.llllI[a.lIlIIl[55]] = a."consent";
        a.llllI[a.lIlIIl[56]] = a."redirect_uri";
        a.llllI[a.lIlIIl[57]] = a."http://localhost";
        a.llllI[a.lIlIIl[58]] = a."response_type";
        a.llllI[a.lIlIIl[59]] = a."id_token code";
        a.llllI[a.lIlIIl[60]] = a."state";
        a.llllI[a.lIlIIl[61]] = a."UcAIZJhXDNKF";
        a.llllI[a.lIlIIl[62]] = a."client_id";
        a.llllI[a.lIlIIl[63]] = a."1fddee4e-b100-4f4e-b2b0-097f9088f9d2";
        a.llllI[a.lIlIIl[64]] = a."scope";
        a.llllI[a.lIlIIl[65]] = a."openid offline";
        a.llllI[a.lIlIIl[66]] = a."User-Agent";
        a.llllI[a.lIlIIl[67]] = a."Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
        a.llllI[a.lIlIIl[68]] = a."Accept";
        a.llllI[a.lIlIIl[69]] = a."text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9";
        a.llllI[a.lIlIIl[70]] = a."accept-encoding";
        a.llllI[a.lIlIIl[71]] = a."gzip, deflate, br";
        a.llllI[a.lIlIIl[72]] = a."";
        a.llllI[a.lIlIIl[73]] = a."=";
        a.llllI[a.lIlIIl[74]] = a."{\"consentChallenge\":\"%s\"}";
        a.llllI[a.lIlIIl[75]] = a."application/json";
        a.llllI[a.lIlIIl[76]] = a."https://account.jagex.com/api/auth/consent";
        a.llllI[a.lIlIIl[77]] = a."";
        a.llllI[a.lIlIIl[78]] = a."redirectTo";
        a.llllI[a.lIlIIl[79]] = a."";
        a.llllI[a.lIlIIl[80]] = a."location";
        a.llllI[a.lIlIIl[81]] = a."id_token=";
        a.llllI[a.lIlIIl[82]] = a."&";
        a.llllI[a.lIlIIl[83]] = a."=";
        a.llllI[a.lIlIIl[84]] = a."{\"consentChallenge\":\"%s\"}";
        a.llllI[a.lIlIIl[85]] = a."application/json";
        a.llllI[a.lIlIIl[86]] = a."https://account.jagex.com/api/auth/consent";
        a.llllI[a.lIlIIl[87]] = a."redirectTo";
        a.llllI[a.lIlIIl[88]] = a."";
        a.llllI[a.lIlIIl[89]] = a."location";
        a.llllI[a.lIlIIl[90]] = a."state";
        a.llllI[a.lIlIIl[91]] = a."";
        a.llllI[a.lIlIIl[92]] = a."SELECT_MFA";
        a.llllI[a.lIlIIl[93]] = a."flowId";
        a.llllI[a.lIlIIl[94]] = a."data";
        a.llllI[a.lIlIIl[95]] = a."availableMfas";
        a.llllI[a.lIlIIl[96]] = a."";
        a.llllI[a.lIlIIl[97]] = a."type";
        a.llllI[a.lIlIIl[98]] = a."TOTP";
        a.llllI[a.lIlIIl[99]] = a."id";
        a.llllI[a.lIlIIl[100]] = a."{\"id\":\"%s\", \"type\":\"TOTP\"}";
        a.llllI[a.lIlIIl[101]] = a."application/json";
        a.llllI[a.lIlIIl[102]] = a."https://account.jagex.com/login/api/auth/login/%s/selectMfa";
        a.llllI[a.lIlIIl[103]] = a."Selected TOTP as MFA";
        a.llllI[a.lIlIIl[104]] = a."Please enter the code from your 2FA authenticator";
        a.llllI[a.lIlIIl[105]] = a."Squire Jagex Acc Importer";
        a.llllI[a.lIlIIl[106]] = a."{\"totp\":\"%s\"}";
        a.llllI[a.lIlIIl[107]] = a."application/json";
        a.llllI[a.lIlIIl[108]] = a."https://account.jagex.com/login/api/auth/login/%s/totpCode";
        a.llllI[a.lIlIIl[109]] = a."Please enter the code sent to your e-mail";
        a.llllI[a.lIlIIl[110]] = a."Squire Jagex Acc Importer";
        a.llllI[a.lIlIIl[111]] = a."{\"code\":\"%s\"}";
        a.llllI[a.lIlIIl[112]] = a."application/json";
        a.llllI[a.lIlIIl[113]] = a."https://account.jagex.com/login/api/auth/login/%s/emailCode";
        a.llllI[a.lIlIIl[114]] = a."data";
        a.llllI[a.lIlIIl[115]] = a."userId";
        a.llllI[a.lIlIIl[116]] = a."redirectTo";
        a.llllI[a.lIlIIl[117]] = a."Please enter your e-mail";
        a.llllI[a.lIlIIl[118]] = a."Squire Jagex Acc Importer";
        a.llllI[a.lIlIIl[119]] = a."Please enter your password!";
        a.llllI[a.lIlIIl[120]] = a."Squire Jagex Acc Importer";
        a.llllI[a.lIlIIl[121]] = a."{\"email\":\"%s\", \"password\":\"%s\", \"loginChallenge\":\"%s\"}";
        a.llllI[a.lIlIIl[122]] = a."application/json";
        a.llllI[a.lIlIIl[123]] = a."https://account.jagex.com/api/auth/login/jagex";
        a.llllI[a.lIlIIl[125]] = a."Invalid user/pass combination";
        a.llllI[a.lIlIIl[126]] = a."Squire Jagex Acc Importer";
        a.llllI[a.lIlIIl[127]] = a."https://account.jagex.com/oauth2/auth?auth_method=&login_type=&flow=form&response_type=code&client_id=com_jagex_auth_desktop_launcher&prompt=login&scope=openid+offline+gamesso.token.create+user.profile.read&state=UcAIZJhXDNKF";
        a.llllI[a.lIlIIl[128]] = a."Connection";
        a.llllI[a.lIlIIl[129]] = a."keep-alive";
        a.llllI[a.lIlIIl[130]] = a."User-Agent";
        a.llllI[a.lIlIIl[131]] = a."PostmanRuntime/7.36.0";
        a.llllI[a.lIlIIl[132]] = a."Accept";
        a.llllI[a.lIlIIl[133]] = a."*/*";
        a.llllI[a.lIlIIl[134]] = a."location";
        a.llllI[a.lIlIIl[135]] = a."=";
        a.llllI[a.lIlIIl[136]] = a."UcAIZJhXDNKF";
        a.llllI[a.lIlIIl[137]] = a."YWI0MTUzZWYtODQ2My00NWRhLTkyZDktNWI3MmIxNDA1Mzgz";
        a.llllI[a.lIlIIl[138]] = a."1fddee4e-b100-4f4e-b2b0-097f9088f9d2";
        a.llllI[a.lIlIIl[139]] = a."";
    }

    /*
     * WARNING - void declaration
     */
    private static String a(String string, OkHttpClient okHttpClient) {
        void var5_9;
        Object[] objectArray = new Object[lIlIIl[1]];
        objectArray[a.lIlIIl[0]] = string;
        String string2 = String.format(llllI[lIlIIl[18]], objectArray);
        RequestBody requestBody = RequestBody.create(MediaType.parse(llllI[lIlIIl[19]]), string2);
        Request lllllIlIIIlIlll = new Request$Builder().url(llllI[lIlIIl[20]]).post(requestBody).build();
        try {
            void lllllIlIIIllIlI;
            Response lllllIlIIIlIlIl = lllllIlIIIllIlI.newCall(lllllIlIIIlIlll).execute();
            try {
                Map lllllIlIIIlIlII = l.fromJson(lllllIlIIIlIlIl.body().string(), Map.class);
                String lllllIlIIIlIllI = (String)lllllIlIIIlIlII.get(llllI[lIlIIl[21]]);
            }
            catch (Throwable lllllIlIIIlIlII) {
                if (a.lIlIlII(lllllIlIIIlIlIl)) {
                    try {
                        lllllIlIIIlIlIl.close();
                        0;
                    }
                    catch (Throwable lllllIlIIIlIIll) {
                        lllllIlIIIlIlII.addSuppressed(lllllIlIIIlIIll);
                    }
                    if (2 != 2) {
                        return null;
                    }
                }
                throw lllllIlIIIlIlII;
            }
            if (a.lIlIlII(lllllIlIIIlIlIl)) {
                lllllIlIIIlIlIl.close();
                0;
                
            }
            0;
        }
        catch (IOException lllllIlIIIlIlIl) {
            throw new RuntimeException(lllllIlIIIlIlIl);
        }
        if (2 < 0) {
            return null;
        }
        return var5_9;
    }

    private static boolean lIllIIl(int n, int n2) {
        return n < n2;
    }

    static {
        a.lIlIIlI();
        a.lIlIIIl();
        r = llllI[lIlIIl[136]];
        n = llllI[lIlIIl[137]];
        h = llllI[lIlIIl[138]];
        l = new Gson();
        t = llllI[lIlIIl[139]];
    }

    /*
     * WARNING - void declaration
     */
    private static String a(String lllllIIllIlIIII, CookieJar lllllIIllIIllll) {
        void var12_17;
        Object lllllIIllIIIlII2;
        Object lllllIIllIIIlIl2;
        Object lllllIIllIIIllI2;
        Object lllllIIllIIlIlI2;
        OkHttpClient lllllIIllIIlllI = new OkHttpClient$Builder().cookieJar(lllllIIllIIllll).build();
        HttpUrl lllllIIllIIllIl = HttpUrl.parse(llllI[lIlIIl[50]]).newBuilder().addEncodedQueryParameter(llllI[lIlIIl[51]], lllllIIllIlIIII).addEncodedQueryParameter(llllI[lIlIIl[52]], llllI[lIlIIl[53]]).addEncodedQueryParameter(llllI[lIlIIl[54]], llllI[lIlIIl[55]]).addEncodedQueryParameter(llllI[lIlIIl[56]], llllI[lIlIIl[57]]).addEncodedQueryParameter(llllI[lIlIIl[58]], llllI[lIlIIl[59]]).addEncodedQueryParameter(llllI[lIlIIl[60]], llllI[lIlIIl[61]]).addEncodedQueryParameter(llllI[lIlIIl[62]], llllI[lIlIIl[63]]).addQueryParameter(llllI[lIlIIl[64]], llllI[lIlIIl[65]]).build();
        Request lllllIIllIIllII = new Request$Builder().url(lllllIIllIIllIl.toString()).header(llllI[lIlIIl[66]], llllI[lIlIIl[67]]).header(llllI[lIlIIl[68]], llllI[lIlIIl[69]]).header(llllI[lIlIIl[70]], llllI[lIlIIl[71]]).build();
        String lllllIIllIIlIll = llllI[lIlIIl[72]];
        try {
            lllllIIllIIlIlI2 = lllllIIllIIlllI.newCall(lllllIIllIIllII).execute();
            try {
                lllllIIllIIlIll = ((Response)lllllIIllIIlIlI2).request().url().toString().split(llllI[lIlIIl[73]])[lIlIIl[1]];
            }
            catch (Throwable lllllIIllIIlIIl) {
                if (a.lIlIlII(lllllIIllIIlIlI2)) {
                    try {
                        ((Response)lllllIIllIIlIlI2).close();
                        0;
                    }
                    catch (Throwable lllllIIllIIlIII) {
                        lllllIIllIIlIIl.addSuppressed(lllllIIllIIlIII);
                    }
                    if (-1 >= 1) {
                        return null;
                    }
                }
                throw lllllIIllIIlIIl;
            }
            if (a.lIlIlII(lllllIIllIIlIlI2)) {
                ((Response)lllllIIllIIlIlI2).close();
                0;
                
            }
            0;
        }
        catch (IOException lllllIIllIIlIlI2) {
            throw new RuntimeException(lllllIIllIIlIlI2);
        }
        
        Object[] objectArray = new Object[lIlIIl[1]];
        objectArray[a.lIlIIl[0]] = lllllIIllIIlIll;
        lllllIIllIIlIlI2 = String.format(llllI[lIlIIl[74]], objectArray);
        RequestBody lllllIIllIIlIIl = RequestBody.create(MediaType.parse(llllI[lIlIIl[75]]), (String)lllllIIllIIlIlI2);
        Request lllllIIllIIlIII = new Request$Builder().url(llllI[lIlIIl[76]]).post(lllllIIllIIlIIl).build();
        String lllllIIllIIIlll = llllI[lIlIIl[77]];
        try {
            lllllIIllIIIllI2 = lllllIIllIIlllI.newCall(lllllIIllIIlIII).execute();
            try {
                lllllIIllIIIlIl2 = ((Response)lllllIIllIIIllI2).body().string();
                lllllIIllIIIlII2 = l.fromJson((String)lllllIIllIIIlIl2, Map.class);
                lllllIIllIIIlll = lllllIIllIIIlII2.get(llllI[lIlIIl[78]]).toString();
            }
            catch (Throwable lllllIIllIIIlIl2) {
                if (a.lIlIlII(lllllIIllIIIllI2)) {
                    try {
                        ((Response)lllllIIllIIIllI2).close();
                        0;
                    }
                    catch (Throwable lllllIIllIIIlII2) {
                        lllllIIllIIIlIl2.addSuppressed(lllllIIllIIIlII2);
                    }
                    
                }
                throw lllllIIllIIIlIl2;
            }
            if (a.lIlIlII(lllllIIllIIIllI2)) {
                ((Response)lllllIIllIIIllI2).close();
                0;
                
            }
            0;
        }
        catch (IOException lllllIIllIIIllI2) {
            throw new RuntimeException(lllllIIllIIIllI2);
        }
        if (((0x4E ^ 0x41 ^ 1) & (5 + 39 - -12 + 95 ^ 0 + 94 - 59 + 118 ^ -1)) > 0) {
            return null;
        }
        lllllIIllIIIllI2 = new OkHttpClient$Builder().cookieJar(lllllIIllIIllll).followRedirects(lIlIIl[0]).build();
        lllllIIllIIIlIl2 = new Request$Builder().url(lllllIIllIIIlll).build();
        lllllIIllIIIlII2 = llllI[lIlIIl[79]];
        try {
            Response lllllIIllIIIIll = ((OkHttpClient)lllllIIllIIIllI2).newCall((Request)lllllIIllIIIlIl2).execute();
            try {
                lllllIIllIIIlII2 = lllllIIllIIIIll.header(llllI[lIlIIl[80]]).split(llllI[lIlIIl[81]])[lIlIIl[1]].split(llllI[lIlIIl[82]])[lIlIIl[0]];
            }
            catch (Throwable lllllIIllIIIIlI) {
                if (a.lIlIlII(lllllIIllIIIIll)) {
                    try {
                        lllllIIllIIIIll.close();
                        0;
                    }
                    catch (Throwable lllllIIllIIIIIl) {
                        lllllIIllIIIIlI.addSuppressed(lllllIIllIIIIIl);
                    }
                    if (((0xD2 ^ 0x85 ^ (0x47 ^ 0x5E)) & (0x1D ^ 0x7C ^ (0xB3 ^ 0x9C) ^ -1)) != 0) {
                        return null;
                    }
                }
                throw lllllIIllIIIIlI;
            }
            if (a.lIlIlII(lllllIIllIIIIll)) {
                lllllIIllIIIIll.close();
                0;
                if (-(0x30 ^ 0x34) >= 0) {
                    return null;
                }
            }
            0;
        }
        catch (IOException lllllIIllIIIIll) {
            throw new RuntimeException(lllllIIllIIIIll);
        }
        if (3 <= ((26 + 69 - -36 + 38 ^ 161 + 7 - 122 + 132) & (28 + 137 - 86 + 86 ^ 173 + 95 - 95 + 17 ^ -1))) {
            return null;
        }
        return var12_17;
    }

    private static boolean lIlIlIl(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static String d(String string, OkHttpClient okHttpClient) {
        String lllllIIlIlIllIl;
        void lllllIIlIllIlIl;
        String string2 = string.split(llllI[lIlIIl[83]])[lIlIIl[1]];
        Object[] objectArray = new Object[lIlIIl[1]];
        objectArray[a.lIlIIl[0]] = string2;
        String string3 = String.format(llllI[lIlIIl[84]], objectArray);
        RequestBody requestBody = RequestBody.create(MediaType.parse(llllI[lIlIIl[85]]), string3);
        Request lllllIIlIllIIIl = new Request$Builder().url(llllI[lIlIIl[86]]).post(requestBody).build();
        Response lllllIIlIllIIII = lllllIIlIllIlIl.newCall(lllllIIlIllIIIl).execute();
        try {
            String lllllIIlIlIllll = lllllIIlIllIIII.body().string();
            Map lllllIIlIlIlllI = l.fromJson(lllllIIlIlIllll, Map.class);
            lllllIIlIlIllIl = lllllIIlIlIlllI.get(llllI[lIlIIl[87]]).toString();
        }
        catch (Throwable lllllIIlIlIllll) {
            try {
                if (a.lIlIlII(lllllIIlIllIIII)) {
                    try {
                        lllllIIlIllIIII.close();
                        0;
                    }
                    catch (Throwable lllllIIlIlIlllI) {
                        lllllIIlIlIllll.addSuppressed(lllllIIlIlIlllI);
                    }
                    if (1 == ((0x46 ^ 2) & ~(0x3B ^ 0x7F))) {
                        return null;
                    }
                }
                throw lllllIIlIlIllll;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        if (a.lIlIlII(lllllIIlIllIIII)) {
            lllllIIlIllIIII.close();
        }
        return lllllIIlIlIllIl;
    }

    private static boolean lIlIllI(int n) {
        return n == 0;
    }

    private static boolean lIlIlll(int n, int n2) {
        return n == n2;
    }

    /*
     * WARNING - void declaration
     */
    private static void b(String string, OkHttpClient okHttpClient) {
        Object[] objectArray = new Object[lIlIIl[1]];
        objectArray[a.lIlIIl[0]] = string;
        Request lllllIlIIIIlIlI = new Request$Builder().url(llllI[lIlIIl[22]]).header(llllI[lIlIIl[23]], String.format(llllI[lIlIIl[24]], objectArray)).build();
        try {
            void lllllIlIIIIlIll;
            Response lllllIlIIIIlIIl = lllllIlIIIIlIll.newCall(lllllIlIIIIlIlI).execute();
            try {
                String lllllIlIIIIllII;
                List lllllIlIIIIlIII = (List)l.fromJson(lllllIlIIIIlIIl.body().string(), Object.class);
                a.a(lllllIlIIIIlIII, lllllIlIIIIllII);
            }
            catch (Throwable lllllIlIIIIlIII) {
                if (a.lIlIlII(lllllIlIIIIlIIl)) {
                    try {
                        lllllIlIIIIlIIl.close();
                        0;
                    }
                    catch (Throwable lllllIlIIIIIlll) {
                        lllllIlIIIIlIII.addSuppressed(lllllIlIIIIIlll);
                    }
                    if (-1 >= 0) {
                        return;
                    }
                }
                throw lllllIlIIIIlIII;
            }
            if (a.lIlIlII(lllllIlIIIIlIIl)) {
                lllllIlIIIIlIIl.close();
                0;
                if (-2 >= 0) {
                    return;
                }
            }
            0;
        }
        catch (IOException lllllIlIIIIlIIl) {
            throw new RuntimeException(lllllIlIIIIlIIl);
        }
        if ((79 & (176 + 1 - 159 + 212 ^ 126 + 159 - 212 + 96 ^ -1)) != 0) {
            return;
        }
    }

    private static String lIIlIII(String lllllIIIlIlIIll, String lllllIIIlIlIIlI) {
        lllllIIIlIlIIll = new String(Base64.getDecoder().decode(lllllIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIIIlIlIllI = new StringBuilder();
        char[] lllllIIIlIlIlIl = lllllIIIlIlIIlI.toCharArray();
        int lllllIIIlIlIlII = lIlIIl[0];
        char[] lllllIIIlIIlllI = lllllIIIlIlIIll.toCharArray();
        int lllllIIIlIIllIl = lllllIIIlIIlllI.length;
        int lllllIIIlIIllII = lIlIIl[0];
        while (a.lIllIIl(lllllIIIlIIllII, lllllIIIlIIllIl)) {
            char lllllIIIlIllIIl = lllllIIIlIIlllI[lllllIIIlIIllII];
            lllllIIIlIlIllI.append((char)(lllllIIIlIllIIl ^ lllllIIIlIlIlIl[lllllIIIlIlIlII % lllllIIIlIlIlIl.length]));
            0;
            ++lllllIIIlIlIlII;
            ++lllllIIIlIIllII;
            0;
            if (-(0x81 ^ 0x85) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllIIIlIlIllI);
    }

    /*
     * WARNING - void declaration
     */
    public static void a() {
        void var12_15;
        void var11_14;
        Object lllllIlIIlIlIlI2;
        Object lllllIlIIlIlIll2;
        void lllllIlIIllIIll;
        void lllllIlIIllIIIl;
        String string;
        b b2 = new b();
        OkHttpClient okHttpClient = new OkHttpClient$Builder().cookieJar(b2).followRedirects(lIlIIl[0]).build();
        Map<String, Object> map = a.a(okHttpClient, string = a.a(okHttpClient));
        if (a.lIlIIll(map)) {
            return;
        }
        String lllllIlIIllIIII = a.a((Map<String, Object>)lllllIlIIllIIIl, (OkHttpClient)lllllIlIIllIIll);
        if (a.lIlIIll(lllllIlIIllIIII)) {
            JOptionPane.showMessageDialog(null, llllI[lIlIIl[0]], llllI[lIlIIl[1]], lIlIIl[0]);
            System.exit(lIlIIl[0]);
        }
        String lllllIlIIlIllll = a.e(lllllIlIIllIIII, (OkHttpClient)lllllIlIIllIIll);
        String lllllIlIIlIlllI = a.d(lllllIlIIlIllll, (OkHttpClient)lllllIlIIllIIll);
        Request lllllIlIIlIllIl = new Request$Builder().url(lllllIlIIlIlllI).build();
        String lllllIlIIlIllII = llllI[lIlIIl[2]];
        try {
            lllllIlIIlIlIll2 = lllllIlIIllIIll.newCall(lllllIlIIlIllIl).execute();
            try {
                lllllIlIIlIlIlI2 = ((Response)lllllIlIIlIlIll2).header(llllI[lIlIIl[3]]);
                lllllIlIIlIllII = ((String)lllllIlIIlIlIlI2).split(llllI[lIlIIl[4]])[lIlIIl[1]].split(llllI[lIlIIl[5]])[lIlIIl[0]];
            }
            catch (Throwable lllllIlIIlIlIlI2) {
                if (a.lIlIlII(lllllIlIIlIlIll2)) {
                    try {
                        ((Response)lllllIlIIlIlIll2).close();
                        0;
                    }
                    catch (Throwable lllllIlIIlIlIIl) {
                        lllllIlIIlIlIlI2.addSuppressed(lllllIlIIlIlIIl);
                    }
                    if (1 <= -1) {
                        return;
                    }
                }
                throw lllllIlIIlIlIlI2;
            }
            if (a.lIlIlII(lllllIlIIlIlIll2)) {
                ((Response)lllllIlIIlIlIll2).close();
                0;
                if (3 < 0) {
                    return;
                }
            }
            0;
        }
        catch (IOException lllllIlIIlIlIll2) {
            throw new RuntimeException(lllllIlIIlIlIll2);
        }
        if (-2 >= 0) {
            return;
        }
        lllllIlIIlIlIll2 = new FormBody$Builder().add(llllI[lIlIIl[6]], llllI[lIlIIl[7]]).add(llllI[lIlIIl[8]], llllI[lIlIIl[9]]).add(llllI[lIlIIl[10]], lllllIlIIlIllII).add(llllI[lIlIIl[11]], llllI[lIlIIl[12]]).build();
        lllllIlIIlIlIlI2 = new Request$Builder().url(llllI[lIlIIl[13]]).post((RequestBody)lllllIlIIlIlIll2).build();
        String lllllIlIIlIlIIl = llllI[lIlIIl[14]];
        String lllllIlIIlIlIII = llllI[lIlIIl[15]];
        try {
            Response lllllIlIIlIIlll = lllllIlIIllIIll.newCall((Request)lllllIlIIlIlIlI2).execute();
            try {
                Map lllllIlIIlIIllI = l.fromJson(lllllIlIIlIIlll.body().string(), Map.class);
                lllllIlIIlIlIIl = (String)lllllIlIIlIIllI.get(llllI[lIlIIl[16]]);
                lllllIlIIlIlIII = (String)lllllIlIIlIIllI.get(llllI[lIlIIl[17]]);
            }
            catch (Throwable lllllIlIIlIIllI) {
                if (a.lIlIlII(lllllIlIIlIIlll)) {
                    try {
                        lllllIlIIlIIlll.close();
                        0;
                    }
                    catch (Throwable lllllIlIIlIIlIl) {
                        lllllIlIIlIIllI.addSuppressed(lllllIlIIlIIlIl);
                    }
                    if (1 >= (0x44 ^ 0x11 ^ (0x2A ^ 0x7B))) {
                        return;
                    }
                }
                throw lllllIlIIlIIllI;
            }
            if (a.lIlIlII(lllllIlIIlIIlll)) {
                lllllIlIIlIIlll.close();
                0;
                if (-3 >= 0) {
                    return;
                }
            }
            0;
        }
        catch (IOException lllllIlIIlIIlll) {
            throw new RuntimeException(lllllIlIIlIIlll);
        }
        
        a.c((String)var11_14, okHttpClient);
        0;
        String string2 = a.a((String)var12_15, b2);
        String string3 = a.a(string2, okHttpClient);
        a.b(string3, okHttpClient);
    }

    /*
     * WARNING - void declaration
     */
    private static void a(List<Map<String, String>> lllllIIlllllIlI, String lllllIIlllllIIl) {
        void var2_2;
        void var3_3;
        Object lllllIIlllIllll;
        Object lllllIIllllIIII;
        String lllllIIllllIIIl;
        Object lllllIIllllIIlI2;
        Iterator lllllIIllllIIll2;
        Object lllllIIllllIlII2;
        Object lllllIIllllIlIl;
        HashMap<Object, Object> lllllIIlllllIII = new HashMap<Object, Object>();
        int lllllIIllllIlll = lllllIIlllllIlI.size();
        Object lllllIIllllIllI = lllllIIlllllIlI.iterator();
        while (a.lIlIlIl(lllllIIllllIllI.hasNext() ? 1 : 0)) {
            lllllIIllllIlIl = lllllIIllllIllI.next();
            lllllIIllllIlII2 = lllllIIllllIlIl.get(llllI[lIlIIl[25]]);
            lllllIIllllIIll2 = new HashMap<String, String>((Map<String, String>)lllllIIllllIlIl);
            ((HashMap)((Object)lllllIIllllIIll2)).put((String)llllI[lIlIIl[26]], (String)lllllIIlllllIIl);
            0;
            if (a.lIlIllI(((HashMap)((Object)lllllIIllllIIll2)).containsKey(llllI[lIlIIl[27]]) ? 1 : 0)) {
                ((HashMap)((Object)lllllIIllllIIll2)).put((String)llllI[lIlIIl[28]], (String)llllI[lIlIIl[29]]);
                0;
            }
            lllllIIlllllIII.put(lllllIIllllIlII2, lllllIIllllIIll2);
            0;
            0;
            continue;
            return;
        }
        lllllIIllllIllI = new File(System.getProperty(llllI[lIlIIl[30]]), llllI[lIlIIl[31]]);
        if (a.lIlIllI(((File)lllllIIllllIllI).exists() ? 1 : 0)) {
            ((File)lllllIIllllIllI).mkdirs();
            0;
        }
        if (a.lIlIllI(((File)(lllllIIllllIlIl = new File((File)lllllIIllllIllI, llllI[lIlIIl[32]]))).exists() ? 1 : 0)) {
            try {
                ((File)lllllIIllllIlIl).createNewFile();
                0;
                0;
            }
            catch (IOException lllllIIllllIlII2) {
                throw new RuntimeException(lllllIIllllIlII2);
            }
            if ((0x80 ^ 0x9D ^ (0x91 ^ 0x88)) <= 1) {
                return;
            }
        }
        try {
            lllllIIllllIlII2 = new Scanner((File)lllllIIllllIlIl);
            try {
                while (a.lIlIlIl(((Scanner)lllllIIllllIlII2).hasNextLine() ? 1 : 0)) {
                    String string;
                    lllllIIllllIIll2 = ((Scanner)lllllIIllllIlII2).nextLine();
                    lllllIIllllIIlI2 = ((String)((Object)lllllIIllllIIll2)).split(llllI[lIlIIl[33]]);
                    lllllIIllllIIIl = lllllIIllllIIlI2[lIlIIl[3]];
                    String string2 = llllI[lIlIIl[34]];
                    String string3 = llllI[lIlIIl[35]];
                    if (a.lIlIlll(((String[])lllllIIllllIIlI2).length, lIlIIl[5])) {
                        string = lllllIIllllIIlI2[lIlIIl[4]];
                        0;
                        
                    } else {
                        string = llllI[lIlIIl[36]];
                    }
                    lllllIIllllIIII = Map.of(string2, lllllIIllllIIIl, string3, string, llllI[lIlIIl[37]], lllllIIllllIIlI2[lIlIIl[2]]);
                    if (a.lIlIllI(lllllIIlllllIII.containsKey(lllllIIllllIIIl) ? 1 : 0)) {
                        lllllIIlllllIII.put(lllllIIllllIIIl, lllllIIllllIIII);
                        0;
                        0;
                        if (1 == 1) continue;
                        return;
                    }
                    lllllIIlllIllll = (Map)lllllIIlllllIII.get(lllllIIllllIIIl);
                    if (!a.lIlIlIl(lllllIIlllIllll.containsKey(llllI[lIlIIl[38]]) ? 1 : 0) || a.lIlIlIl(((String)lllllIIlllIllll.get(llllI[lIlIIl[39]])).isEmpty() ? 1 : 0)) {
                        lllllIIlllllIII.put(lllllIIllllIIIl, lllllIIllllIIII);
                        0;
                    }
                    0;
                    if (4 > ((0x63 ^ 0x21 ^ (0x64 ^ 0xE)) & (213 + 201 - 279 + 100 ^ 22 + 194 - 178 + 157 ^ -1))) continue;
                    return;
                }
                ((Scanner)lllllIIllllIlII2).close();
                0;
            }
            catch (Throwable lllllIIllllIIll2) {
                try {
                    ((Scanner)lllllIIllllIlII2).close();
                    0;
                }
                catch (Throwable lllllIIllllIIlI2) {
                    lllllIIllllIIll2.addSuppressed(lllllIIllllIIlI2);
                }
                
                throw lllllIIllllIIll2;
            }
            if (3 < 0) {
                return;
            }
            0;
        }
        catch (FileNotFoundException lllllIIllllIlII2) {
            throw new RuntimeException(lllllIIllllIlII2);
        }
        if (3 <= 0) {
            return;
        }
        try {
            lllllIIllllIlII2 = new FileWriter((File)lllllIIllllIlIl, lIlIIl[0]);
            try {
                lllllIIllllIIll2 = lllllIIlllllIII.values().iterator();
                while (a.lIlIlIl(lllllIIllllIIll2.hasNext() ? 1 : 0)) {
                    lllllIIllllIIlI2 = (Map)lllllIIllllIIll2.next();
                    lllllIIllllIIIl = (String)lllllIIllllIIlI2.get(llllI[lIlIIl[40]]);
                    lllllIIllllIIII = (String)lllllIIllllIIlI2.get(llllI[lIlIIl[41]]);
                    lllllIIlllIllll = lllllIIllllIIlI2.getOrDefault(llllI[lIlIIl[42]], llllI[lIlIIl[43]]);
                    Object[] objectArray = new Object[lIlIIl[3]];
                    objectArray[a.lIlIIl[0]] = lllllIIllllIIII;
                    objectArray[a.lIlIIl[1]] = lllllIIllllIIIl;
                    objectArray[a.lIlIIl[2]] = lllllIIlllIllll;
                    ((Writer)lllllIIllllIlII2).write(String.format(llllI[lIlIIl[44]], objectArray));
                    0;
                    if (-1 >= -1) continue;
                    return;
                }
            }
            catch (Throwable lllllIIllllIIll2) {
                try {
                    ((OutputStreamWriter)lllllIIllllIlII2).close();
                    0;
                }
                catch (Throwable lllllIIllllIIlI2) {
                    lllllIIllllIIll2.addSuppressed(lllllIIllllIIlI2);
                }
                if ((0x61 ^ 0xF ^ (0x65 ^ 0xF)) <= (69 & (73 + 65 - 35 + 28 ^ 21 + 167 - 177 + 187 ^ -1))) {
                    return;
                }
                throw lllllIIllllIIll2;
            }
            ((OutputStreamWriter)lllllIIllllIlII2).close();
            0;
            if (1 <= 0) {
                return;
            }
            0;
        }
        catch (IOException lllllIIllllIlII2) {
            lllllIIllllIlII2.printStackTrace();
        }
        if (((0x29 ^ 0x35) & ~(0x2A ^ 0x36)) != 0) {
            return;
        }
        Object[] objectArray = new Object[lIlIIl[2]];
        objectArray[a.lIlIIl[0]] = (int)var3_3;
        objectArray[a.lIlIIl[1]] = var2_2.size();
        JOptionPane.showMessageDialog(null, String.format(llllI[lIlIIl[45]], objectArray));
    }

    /*
     * WARNING - void declaration
     */
    private static String e(String string, OkHttpClient okHttpClient) {
        String lllllIIlIlIIIlI;
        Object lllllIIlIlIIIII2;
        void lllllIIlIlIIIll;
        String string2 = llllI[lIlIIl[88]];
        Request lllllIIlIlIIIIl = new Request$Builder().url(string).build();
        try {
            lllllIIlIlIIIII2 = lllllIIlIlIIIll.newCall(lllllIIlIlIIIIl).execute();
            try {
                lllllIIlIlIIIlI = ((Response)lllllIIlIlIIIII2).headers().get(llllI[lIlIIl[89]]);
            }
            catch (Throwable lllllIIlIIlllll) {
                if (a.lIlIlII(lllllIIlIlIIIII2)) {
                    try {
                        ((Response)lllllIIlIlIIIII2).close();
                        0;
                    }
                    catch (Throwable lllllIIlIIllllI) {
                        lllllIIlIIlllll.addSuppressed(lllllIIlIIllllI);
                    }
                    if ((0x20 ^ 0x24) < -1) {
                        return null;
                    }
                }
                throw lllllIIlIIlllll;
            }
            if (a.lIlIlII(lllllIIlIlIIIII2)) {
                ((Response)lllllIIlIlIIIII2).close();
                0;
                
            }
            0;
        }
        catch (IOException lllllIIlIlIIIII2) {
            throw new RuntimeException(lllllIIlIlIIIII2);
        }
        if (1 <= 0) {
            return null;
        }
        lllllIIlIlIIIII2 = new Request$Builder().url(lllllIIlIlIIIlI).build();
        try {
            Response lllllIIlIIlllll = lllllIIlIlIIIll.newCall((Request)lllllIIlIlIIIII2).execute();
            try {
                System.out.println(lllllIIlIIlllll.body().string());
            }
            catch (Throwable lllllIIlIIllllI) {
                if (a.lIlIlII(lllllIIlIIlllll)) {
                    try {
                        lllllIIlIIlllll.close();
                        0;
                    }
                    catch (Throwable lllllIIlIIlllIl) {
                        lllllIIlIIllllI.addSuppressed(lllllIIlIIlllIl);
                    }
                    if ((0xC5 ^ 0xC1) < -1) {
                        return null;
                    }
                }
                throw lllllIIlIIllllI;
            }
            if (a.lIlIlII(lllllIIlIIlllll)) {
                lllllIIlIIlllll.close();
                0;
                if (5 <= 0) {
                    return null;
                }
            }
            0;
        }
        catch (IOException lllllIIlIIlllll) {
            throw new RuntimeException(lllllIIlIIlllll);
        }
        
        return string2;
    }

    private static String a(OkHttpClient okHttpClient) {
        OkHttpClient lllllIIIllIIlll;
        Request lllllIIIllIIllI = new Request$Builder().url(llllI[lIlIIl[127]]).header(llllI[lIlIIl[128]], llllI[lIlIIl[129]]).header(llllI[lIlIIl[130]], llllI[lIlIIl[131]]).header(llllI[lIlIIl[132]], llllI[lIlIIl[133]]).build();
        Response lllllIIIllIIlIl = lllllIIIllIIlll.newCall(lllllIIIllIIllI).execute();
        try {
            String lllllIIIllIIlII = lllllIIIllIIlIl.header(llllI[lIlIIl[134]]).split(llllI[lIlIIl[135]])[lIlIIl[1]];
        }
        catch (Throwable lllllIIIllIIlII) {
            try {
                if (a.lIlIlII(lllllIIIllIIlIl)) {
                    try {
                        lllllIIIllIIlIl.close();
                        0;
                    }
                    catch (Throwable lllllIIIllIIIll) {
                        lllllIIIllIIlII.addSuppressed(lllllIIIllIIIll);
                    }
                    if ((0x6D ^ 0x68) <= 0) {
                        return null;
                    }
                }
                throw lllllIIIllIIlII;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        if (a.lIlIlII(lllllIIIllIIlIl)) {
            lllllIIIllIIlIl.close();
        }
        return lllllIIIllIIlII;
    }

    private static boolean lIllIII(int n, int n2) {
        return n != n2;
    }

    private static String lIIlIlI(String lllllIIIIllIllI, String lllllIIIIllIlIl) {
        try {
            SecretKeySpec lllllIIIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIIIIlllIII = Cipher.getInstance("Blowfish");
            lllllIIIIlllIII.init(lIlIIl[2], lllllIIIIlllIIl);
            return new String(lllllIIIIlllIII.doFinal(Base64.getDecoder().decode(lllllIIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIIllIlll) {
            lllllIIIIllIlll.printStackTrace();
            return null;
        }
    }

    private static String lllIlI(String lllllIIIlIIIIIl, String lllllIIIlIIIIlI) {
        try {
            SecretKeySpec lllllIIIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIl[8]), "DES");
            Cipher lllllIIIlIIIlIl = Cipher.getInstance("DES");
            lllllIIIlIIIlIl.init(lIlIIl[2], lllllIIIlIIIllI);
            return new String(lllllIIIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllIIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIlIIIlII) {
            lllllIIIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIll(Object object) {
        return object == null;
    }
}
