/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.quest.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.L;

public class QuestManager {

    private static boolean lIlllIIlIIllIII(Object object) {
        return object != null;
    }

    static {
        K.lIlllIIlIIlIlll();
        K.lIlllIIlIIlIllI();
    }

        return String.valueOf(var1);
    }

    private static boolean lIlllIIlIIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static String f(String string) {
        void var1_1;
        String var2;
        if (!K.lIlllIIlIIllIII(string) || K.lIlllIIlIIllIIl(string.isEmpty() ? 1 : 0)) {
            return var2;
        }
        StringBuilder var3 = new StringBuilder();
        int var4 = lIlIIlIIlIlII[0];
        char[] var5 = var2.toCharArray();
        int var6 = var5.length;
        int var7 = lIlIIlIIlIlII[1];
        while (K.lIlllIIlIIllIlI(var7, var6)) {
            char var8 = var5[var7];
            if (K.lIlllIIlIIllIIl(Character.isSpaceChar(var8) ? 1 : 0)) {
                var4 = lIlIIlIIlIlII[0];

                }
            } else if (K.lIlllIIlIIllIIl(var4)) {
                var8 = Character.toTitleCase(var8);
                var4 = lIlIIlIIlIlII[1];

                if (((29 + 113 - 141 + 153 ^ 130 + 2 - 61 + 93) & (0x73 ^ 0x40 ^ (0xA4 ^ 0xA9) ^ -1)) == 1) {
                    return null;
                }
            } else {
                var8 = Character.toLowerCase(var8);
            }
            var3.append(var8);

            ++var7;

            return null;
        }
        return String.valueOf(var1_1);
    }

    /*
     * WARNING - void declaration
     */
    public static String F() {
        void var9;
        String[] stringArray = new String[lIlIIlIIlIlII[2]];
        stringArray[K.lIlIIlIIlIlII[1]] = lIlIIIlllIIIl[lIlIIlIIlIlII[1]];
        stringArray[K.lIlIIlIIlIlII[0]] = lIlIIIlllIIIl[lIlIIlIIlIlII[0]];
        stringArray[K.lIlIIlIIlIlII[3]] = lIlIIIlllIIIl[lIlIIlIIlIlII[3]];
        stringArray[K.lIlIIlIIlIlII[4]] = lIlIIIlllIIIl[lIlIIlIIlIlII[4]];
        stringArray[K.lIlIIlIIlIlII[5]] = lIlIIIlllIIIl[lIlIIlIIlIlII[5]];
        stringArray[K.lIlIIlIIlIlII[6]] = lIlIIIlllIIIl[lIlIIlIIlIlII[6]];
        stringArray[K.lIlIIlIIlIlII[7]] = lIlIIIlllIIIl[lIlIIlIIlIlII[7]];
        stringArray[K.lIlIIlIIlIlII[8]] = lIlIIIlllIIIl[lIlIIlIIlIlII[8]];
        stringArray[K.lIlIIlIIlIlII[9]] = lIlIIIlllIIIl[lIlIIlIIlIlII[9]];
        stringArray[K.lIlIIlIIlIlII[10]] = lIlIIIlllIIIl[lIlIIlIIlIlII[10]];
        stringArray[K.lIlIIlIIlIlII[11]] = lIlIIIlllIIIl[lIlIIlIIlIlII[11]];
        stringArray[K.lIlIIlIIlIlII[12]] = lIlIIIlllIIIl[lIlIIlIIlIlII[12]];
        stringArray[K.lIlIIlIIlIlII[13]] = lIlIIIlllIIIl[lIlIIlIIlIlII[13]];
        stringArray[K.lIlIIlIIlIlII[14]] = lIlIIIlllIIIl[lIlIIlIIlIlII[14]];
        stringArray[K.lIlIIlIIlIlII[15]] = lIlIIIlllIIIl[lIlIIlIIlIlII[15]];
        stringArray[K.lIlIIlIIlIlII[16]] = lIlIIIlllIIIl[lIlIIlIIlIlII[16]];
        stringArray[K.lIlIIlIIlIlII[17]] = lIlIIIlllIIIl[lIlIIlIIlIlII[17]];
        stringArray[K.lIlIIlIIlIlII[18]] = lIlIIIlllIIIl[lIlIIlIIlIlII[18]];
        stringArray[K.lIlIIlIIlIlII[19]] = lIlIIIlllIIIl[lIlIIlIIlIlII[19]];
        stringArray[K.lIlIIlIIlIlII[20]] = lIlIIIlllIIIl[lIlIIlIIlIlII[20]];
        stringArray[K.lIlIIlIIlIlII[21]] = lIlIIIlllIIIl[lIlIIlIIlIlII[21]];
        stringArray[K.lIlIIlIIlIlII[22]] = lIlIIIlllIIIl[lIlIIlIIlIlII[22]];
        stringArray[K.lIlIIlIIlIlII[23]] = lIlIIIlllIIIl[lIlIIlIIlIlII[23]];
        stringArray[K.lIlIIlIIlIlII[24]] = lIlIIIlllIIIl[lIlIIlIIlIlII[24]];
        stringArray[K.lIlIIlIIlIlII[25]] = lIlIIIlllIIIl[lIlIIlIIlIlII[25]];
        stringArray[K.lIlIIlIIlIlII[26]] = lIlIIIlllIIIl[lIlIIlIIlIlII[26]];
        stringArray[K.lIlIIlIIlIlII[27]] = lIlIIIlllIIIl[lIlIIlIIlIlII[27]];
        stringArray[K.lIlIIlIIlIlII[28]] = lIlIIIlllIIIl[lIlIIlIIlIlII[28]];
        stringArray[K.lIlIIlIIlIlII[29]] = lIlIIIlllIIIl[lIlIIlIIlIlII[29]];
        stringArray[K.lIlIIlIIlIlII[30]] = lIlIIIlllIIIl[lIlIIlIIlIlII[30]];
        stringArray[K.lIlIIlIIlIlII[31]] = lIlIIIlllIIIl[lIlIIlIIlIlII[31]];
        stringArray[K.lIlIIlIIlIlII[32]] = lIlIIIlllIIIl[lIlIIlIIlIlII[32]];
        stringArray[K.lIlIIlIIlIlII[33]] = lIlIIIlllIIIl[lIlIIlIIlIlII[33]];
        stringArray[K.lIlIIlIIlIlII[34]] = lIlIIIlllIIIl[lIlIIlIIlIlII[34]];
        stringArray[K.lIlIIlIIlIlII[35]] = lIlIIIlllIIIl[lIlIIlIIlIlII[35]];
        stringArray[K.lIlIIlIIlIlII[36]] = lIlIIIlllIIIl[lIlIIlIIlIlII[36]];
        stringArray[K.lIlIIlIIlIlII[37]] = lIlIIIlllIIIl[lIlIIlIIlIlII[37]];
        stringArray[K.lIlIIlIIlIlII[38]] = lIlIIIlllIIIl[lIlIIlIIlIlII[38]];
        stringArray[K.lIlIIlIIlIlII[39]] = lIlIIIlllIIIl[lIlIIlIIlIlII[39]];
        stringArray[K.lIlIIlIIlIlII[40]] = lIlIIIlllIIIl[lIlIIlIIlIlII[40]];
        stringArray[K.lIlIIlIIlIlII[41]] = lIlIIIlllIIIl[lIlIIlIIlIlII[41]];
        stringArray[K.lIlIIlIIlIlII[42]] = lIlIIIlllIIIl[lIlIIlIIlIlII[42]];
        stringArray[K.lIlIIlIIlIlII[43]] = lIlIIIlllIIIl[lIlIIlIIlIlII[43]];
        stringArray[K.lIlIIlIIlIlII[44]] = lIlIIIlllIIIl[lIlIIlIIlIlII[44]];
        stringArray[K.lIlIIlIIlIlII[45]] = lIlIIIlllIIIl[lIlIIlIIlIlII[45]];
        stringArray[K.lIlIIlIIlIlII[46]] = lIlIIIlllIIIl[lIlIIlIIlIlII[46]];
        stringArray[K.lIlIIlIIlIlII[47]] = lIlIIIlllIIIl[lIlIIlIIlIlII[47]];
        stringArray[K.lIlIIlIIlIlII[48]] = lIlIIIlllIIIl[lIlIIlIIlIlII[48]];
        stringArray[K.lIlIIlIIlIlII[49]] = lIlIIIlllIIIl[lIlIIlIIlIlII[49]];
        stringArray[K.lIlIIlIIlIlII[50]] = lIlIIIlllIIIl[lIlIIlIIlIlII[50]];
        stringArray[K.lIlIIlIIlIlII[51]] = lIlIIIlllIIIl[lIlIIlIIlIlII[51]];
        stringArray[K.lIlIIlIIlIlII[52]] = lIlIIIlllIIIl[lIlIIlIIlIlII[52]];
        stringArray[K.lIlIIlIIlIlII[53]] = lIlIIIlllIIIl[lIlIIlIIlIlII[53]];
        stringArray[K.lIlIIlIIlIlII[54]] = lIlIIIlllIIIl[lIlIIlIIlIlII[54]];
        stringArray[K.lIlIIlIIlIlII[55]] = lIlIIIlllIIIl[lIlIIlIIlIlII[55]];
        stringArray[K.lIlIIlIIlIlII[56]] = lIlIIIlllIIIl[lIlIIlIIlIlII[56]];
        stringArray[K.lIlIIlIIlIlII[57]] = lIlIIIlllIIIl[lIlIIlIIlIlII[57]];
        stringArray[K.lIlIIlIIlIlII[58]] = lIlIIIlllIIIl[lIlIIlIIlIlII[58]];
        stringArray[K.lIlIIlIIlIlII[59]] = lIlIIIlllIIIl[lIlIIlIIlIlII[59]];
        stringArray[K.lIlIIlIIlIlII[60]] = lIlIIIlllIIIl[lIlIIlIIlIlII[60]];
        stringArray[K.lIlIIlIIlIlII[61]] = lIlIIIlllIIIl[lIlIIlIIlIlII[61]];
        stringArray[K.lIlIIlIIlIlII[62]] = lIlIIIlllIIIl[lIlIIlIIlIlII[62]];
        stringArray[K.lIlIIlIIlIlII[63]] = lIlIIIlllIIIl[lIlIIlIIlIlII[63]];
        stringArray[K.lIlIIlIIlIlII[64]] = lIlIIIlllIIIl[lIlIIlIIlIlII[64]];
        stringArray[K.lIlIIlIIlIlII[65]] = lIlIIIlllIIIl[lIlIIlIIlIlII[65]];
        stringArray[K.lIlIIlIIlIlII[66]] = lIlIIIlllIIIl[lIlIIlIIlIlII[66]];
        stringArray[K.lIlIIlIIlIlII[67]] = lIlIIIlllIIIl[lIlIIlIIlIlII[67]];
        stringArray[K.lIlIIlIIlIlII[68]] = lIlIIIlllIIIl[lIlIIlIIlIlII[68]];
        stringArray[K.lIlIIlIIlIlII[69]] = lIlIIIlllIIIl[lIlIIlIIlIlII[69]];
        stringArray[K.lIlIIlIIlIlII[70]] = lIlIIIlllIIIl[lIlIIlIIlIlII[70]];
        stringArray[K.lIlIIlIIlIlII[71]] = lIlIIIlllIIIl[lIlIIlIIlIlII[71]];
        stringArray[K.lIlIIlIIlIlII[72]] = lIlIIIlllIIIl[lIlIIlIIlIlII[72]];
        stringArray[K.lIlIIlIIlIlII[73]] = lIlIIIlllIIIl[lIlIIlIIlIlII[73]];
        stringArray[K.lIlIIlIIlIlII[74]] = lIlIIIlllIIIl[lIlIIlIIlIlII[74]];
        stringArray[K.lIlIIlIIlIlII[75]] = lIlIIIlllIIIl[lIlIIlIIlIlII[75]];
        stringArray[K.lIlIIlIIlIlII[76]] = lIlIIIlllIIIl[lIlIIlIIlIlII[76]];
        stringArray[K.lIlIIlIIlIlII[77]] = lIlIIIlllIIIl[lIlIIlIIlIlII[77]];
        stringArray[K.lIlIIlIIlIlII[78]] = lIlIIIlllIIIl[lIlIIlIIlIlII[78]];
        stringArray[K.lIlIIlIIlIlII[79]] = lIlIIIlllIIIl[lIlIIlIIlIlII[79]];
        stringArray[K.lIlIIlIIlIlII[80]] = lIlIIIlllIIIl[lIlIIlIIlIlII[80]];
        stringArray[K.lIlIIlIIlIlII[81]] = lIlIIIlllIIIl[lIlIIlIIlIlII[81]];
        stringArray[K.lIlIIlIIlIlII[82]] = lIlIIIlllIIIl[lIlIIlIIlIlII[82]];
        stringArray[K.lIlIIlIIlIlII[83]] = lIlIIIlllIIIl[lIlIIlIIlIlII[83]];
        stringArray[K.lIlIIlIIlIlII[84]] = lIlIIIlllIIIl[lIlIIlIIlIlII[84]];
        stringArray[K.lIlIIlIIlIlII[85]] = lIlIIIlllIIIl[lIlIIlIIlIlII[85]];
        stringArray[K.lIlIIlIIlIlII[86]] = lIlIIIlllIIIl[lIlIIlIIlIlII[86]];
        stringArray[K.lIlIIlIIlIlII[87]] = lIlIIIlllIIIl[lIlIIlIIlIlII[87]];
        stringArray[K.lIlIIlIIlIlII[88]] = lIlIIIlllIIIl[lIlIIlIIlIlII[88]];
        stringArray[K.lIlIIlIIlIlII[89]] = lIlIIIlllIIIl[lIlIIlIIlIlII[89]];
        stringArray[K.lIlIIlIIlIlII[90]] = lIlIIIlllIIIl[lIlIIlIIlIlII[90]];
        stringArray[K.lIlIIlIIlIlII[91]] = lIlIIIlllIIIl[lIlIIlIIlIlII[91]];
        stringArray[K.lIlIIlIIlIlII[92]] = lIlIIIlllIIIl[lIlIIlIIlIlII[92]];
        stringArray[K.lIlIIlIIlIlII[93]] = lIlIIIlllIIIl[lIlIIlIIlIlII[93]];
        stringArray[K.lIlIIlIIlIlII[94]] = lIlIIIlllIIIl[lIlIIlIIlIlII[94]];
        stringArray[K.lIlIIlIIlIlII[95]] = lIlIIIlllIIIl[lIlIIlIIlIlII[95]];
        stringArray[K.lIlIIlIIlIlII[96]] = lIlIIIlllIIIl[lIlIIlIIlIlII[96]];
        stringArray[K.lIlIIlIIlIlII[97]] = lIlIIIlllIIIl[lIlIIlIIlIlII[97]];
        stringArray[K.lIlIIlIIlIlII[98]] = lIlIIIlllIIIl[lIlIIlIIlIlII[98]];
        stringArray[K.lIlIIlIIlIlII[99]] = lIlIIIlllIIIl[lIlIIlIIlIlII[99]];
        stringArray[K.lIlIIlIIlIlII[100]] = lIlIIIlllIIIl[lIlIIlIIlIlII[100]];
        stringArray[K.lIlIIlIIlIlII[101]] = lIlIIIlllIIIl[lIlIIlIIlIlII[101]];
        stringArray[K.lIlIIlIIlIlII[102]] = lIlIIIlllIIIl[lIlIIlIIlIlII[102]];
        stringArray[K.lIlIIlIIlIlII[103]] = lIlIIIlllIIIl[lIlIIlIIlIlII[103]];
        stringArray[K.lIlIIlIIlIlII[104]] = lIlIIIlllIIIl[lIlIIlIIlIlII[104]];
        stringArray[K.lIlIIlIIlIlII[105]] = lIlIIIlllIIIl[lIlIIlIIlIlII[105]];
        stringArray[K.lIlIIlIIlIlII[106]] = lIlIIIlllIIIl[lIlIIlIIlIlII[106]];
        stringArray[K.lIlIIlIIlIlII[107]] = lIlIIIlllIIIl[lIlIIlIIlIlII[107]];
        stringArray[K.lIlIIlIIlIlII[108]] = lIlIIIlllIIIl[lIlIIlIIlIlII[108]];
        stringArray[K.lIlIIlIIlIlII[109]] = lIlIIIlllIIIl[lIlIIlIIlIlII[109]];
        stringArray[K.lIlIIlIIlIlII[110]] = lIlIIIlllIIIl[lIlIIlIIlIlII[110]];
        stringArray[K.lIlIIlIIlIlII[111]] = lIlIIIlllIIIl[lIlIIlIIlIlII[111]];
        stringArray[K.lIlIIlIIlIlII[112]] = lIlIIIlllIIIl[lIlIIlIIlIlII[112]];
        stringArray[K.lIlIIlIIlIlII[113]] = lIlIIIlllIIIl[lIlIIlIIlIlII[113]];
        stringArray[K.lIlIIlIIlIlII[114]] = lIlIIIlllIIIl[lIlIIlIIlIlII[114]];
        stringArray[K.lIlIIlIIlIlII[115]] = lIlIIIlllIIIl[lIlIIlIIlIlII[115]];
        stringArray[K.lIlIIlIIlIlII[116]] = lIlIIIlllIIIl[lIlIIlIIlIlII[116]];
        stringArray[K.lIlIIlIIlIlII[117]] = lIlIIIlllIIIl[lIlIIlIIlIlII[117]];
        stringArray[K.lIlIIlIIlIlII[118]] = lIlIIIlllIIIl[lIlIIlIIlIlII[118]];
        stringArray[K.lIlIIlIIlIlII[119]] = lIlIIIlllIIIl[lIlIIlIIlIlII[119]];
        stringArray[K.lIlIIlIIlIlII[120]] = lIlIIIlllIIIl[lIlIIlIIlIlII[120]];
        stringArray[K.lIlIIlIIlIlII[121]] = lIlIIIlllIIIl[lIlIIlIIlIlII[121]];
        stringArray[K.lIlIIlIIlIlII[122]] = lIlIIIlllIIIl[lIlIIlIIlIlII[122]];
        stringArray[K.lIlIIlIIlIlII[123]] = lIlIIIlllIIIl[lIlIIlIIlIlII[123]];
        stringArray[K.lIlIIlIIlIlII[124]] = lIlIIIlllIIIl[lIlIIlIIlIlII[124]];
        stringArray[K.lIlIIlIIlIlII[125]] = lIlIIIlllIIIl[lIlIIlIIlIlII[125]];
        stringArray[K.lIlIIlIIlIlII[126]] = lIlIIIlllIIIl[lIlIIlIIlIlII[126]];
        stringArray[K.lIlIIlIIlIlII[127]] = lIlIIIlllIIIl[lIlIIlIIlIlII[127]];
        stringArray[K.lIlIIlIIlIlII[128]] = lIlIIIlllIIIl[lIlIIlIIlIlII[128]];
        stringArray[K.lIlIIlIIlIlII[129]] = lIlIIIlllIIIl[lIlIIlIIlIlII[129]];
        stringArray[K.lIlIIlIIlIlII[130]] = lIlIIIlllIIIl[lIlIIlIIlIlII[130]];
        stringArray[K.lIlIIlIIlIlII[131]] = lIlIIIlllIIIl[lIlIIlIIlIlII[131]];
        stringArray[K.lIlIIlIIlIlII[132]] = lIlIIIlllIIIl[lIlIIlIIlIlII[132]];
        stringArray[K.lIlIIlIIlIlII[133]] = lIlIIIlllIIIl[lIlIIlIIlIlII[133]];
        stringArray[K.lIlIIlIIlIlII[134]] = lIlIIIlllIIIl[lIlIIlIIlIlII[134]];
        stringArray[K.lIlIIlIIlIlII[135]] = lIlIIIlllIIIl[lIlIIlIIlIlII[135]];
        stringArray[K.lIlIIlIIlIlII[136]] = lIlIIIlllIIIl[lIlIIlIIlIlII[136]];
        stringArray[K.lIlIIlIIlIlII[137]] = lIlIIIlllIIIl[lIlIIlIIlIlII[137]];
        stringArray[K.lIlIIlIIlIlII[138]] = lIlIIIlllIIIl[lIlIIlIIlIlII[138]];
        stringArray[K.lIlIIlIIlIlII[139]] = lIlIIIlllIIIl[lIlIIlIIlIlII[139]];
        stringArray[K.lIlIIlIIlIlII[140]] = lIlIIIlllIIIl[lIlIIlIIlIlII[140]];
        stringArray[K.lIlIIlIIlIlII[141]] = lIlIIIlllIIIl[lIlIIlIIlIlII[141]];
        stringArray[K.lIlIIlIIlIlII[142]] = lIlIIIlllIIIl[lIlIIlIIlIlII[142]];
        stringArray[K.lIlIIlIIlIlII[143]] = lIlIIIlllIIIl[lIlIIlIIlIlII[143]];
        stringArray[K.lIlIIlIIlIlII[144]] = lIlIIIlllIIIl[lIlIIlIIlIlII[144]];
        stringArray[K.lIlIIlIIlIlII[145]] = lIlIIIlllIIIl[lIlIIlIIlIlII[145]];
        stringArray[K.lIlIIlIIlIlII[146]] = lIlIIIlllIIIl[lIlIIlIIlIlII[146]];
        stringArray[K.lIlIIlIIlIlII[147]] = lIlIIIlllIIIl[lIlIIlIIlIlII[147]];
        stringArray[K.lIlIIlIIlIlII[148]] = lIlIIIlllIIIl[lIlIIlIIlIlII[148]];
        stringArray[K.lIlIIlIIlIlII[149]] = lIlIIIlllIIIl[lIlIIlIIlIlII[149]];
        stringArray[K.lIlIIlIIlIlII[150]] = lIlIIIlllIIIl[lIlIIlIIlIlII[150]];
        stringArray[K.lIlIIlIIlIlII[151]] = lIlIIIlllIIIl[lIlIIlIIlIlII[151]];
        stringArray[K.lIlIIlIIlIlII[152]] = lIlIIIlllIIIl[lIlIIlIIlIlII[152]];
        stringArray[K.lIlIIlIIlIlII[153]] = lIlIIIlllIIIl[lIlIIlIIlIlII[153]];
        stringArray[K.lIlIIlIIlIlII[154]] = lIlIIIlllIIIl[lIlIIlIIlIlII[154]];
        stringArray[K.lIlIIlIIlIlII[155]] = lIlIIIlllIIIl[lIlIIlIIlIlII[155]];
        stringArray[K.lIlIIlIIlIlII[156]] = lIlIIIlllIIIl[lIlIIlIIlIlII[156]];
        stringArray[K.lIlIIlIIlIlII[157]] = lIlIIIlllIIIl[lIlIIlIIlIlII[157]];
        stringArray[K.lIlIIlIIlIlII[158]] = lIlIIIlllIIIl[lIlIIlIIlIlII[158]];
        stringArray[K.lIlIIlIIlIlII[159]] = lIlIIIlllIIIl[lIlIIlIIlIlII[159]];
        stringArray[K.lIlIIlIIlIlII[160]] = lIlIIIlllIIIl[lIlIIlIIlIlII[160]];
        stringArray[K.lIlIIlIIlIlII[161]] = lIlIIIlllIIIl[lIlIIlIIlIlII[161]];
        stringArray[K.lIlIIlIIlIlII[162]] = lIlIIIlllIIIl[lIlIIlIIlIlII[162]];
        stringArray[K.lIlIIlIIlIlII[163]] = lIlIIIlllIIIl[lIlIIlIIlIlII[163]];
        stringArray[K.lIlIIlIIlIlII[164]] = lIlIIIlllIIIl[lIlIIlIIlIlII[164]];
        stringArray[K.lIlIIlIIlIlII[165]] = lIlIIIlllIIIl[lIlIIlIIlIlII[165]];
        stringArray[K.lIlIIlIIlIlII[166]] = lIlIIIlllIIIl[lIlIIlIIlIlII[166]];
        String[] stringArray2 = stringArray;
        int n2 = L.a(2.0, 3.0);
        int n3 = L.a(8.0, 12.0);
        String string = lIlIIIlllIIIl[lIlIIlIIlIlII[2]];
        int var10 = lIlIIlIIlIlII[1];
        while (K.lIlllIIlIIllIlI(var10, (int)var9)) {
            void var11;
            Object var12;
            void var13;
            String var14 = var13[L.a(0.0, ((void)var13).length - lIlIIlIIlIlII[0])];
            switch (L.a(0.0, 4.0)) {
                case 0: {
                    var14 = var14.toLowerCase();

                    if (1 >= 0) break;
                    return null;
                }
                case 1: {
                    var14 = var14.toUpperCase();

                    if (1 >= 1) break;
                    return null;
                }
                case -1: {
                    var14 = K.f(var14);
                }
            }
            if (K.lIlllIIlIIllIll(((String)var12).length() + var14.length(), (int)var11)) {
                var12 = (String)var12 + var14;

                }
            } else {
                Object var15;
                if (K.lIlllIIlIIlllII(L.a(0.0, 1.0), lIlIIlIIlIlII[0])) {
                    var15 = ((String)var12 + var14).substring(lIlIIlIIlIlII[1], (int)var11);

                    if (1 == ((119 + 37 - 60 + 86 ^ 62 + 116 - 28 + 15) & (98 + 9 - 84 + 118 ^ 33 + 45 - -52 + 28 ^ -1))) {
                        return null;
                    }
                } else {
                    int var16 = L.a(9.0, (double)var11);
                    var15 = ((String)var12 + var14).substring(lIlIIlIIlIlII[1], var16);
                    int var17 = var16;
                    while (K.lIlllIIlIIllIlI(var17, lIlIIlIIlIlII[13])) {
                        if (K.lIlllIIlIIlllII(L.a(0.0, 1.0), lIlIIlIIlIlII[0])) {
                            var15 = (String)var15 + L.a(0.0, 9.0);

                            if ((0 ^ 0x24 ^ (0x72 ^ 0x52)) == 2) {
                                return null;
                            }
                        } else {
                            var15 = L.a(0.0, 9.0) + (String)var15;
                        }
                        ++var17;

                        return null;
                    }
                }
                var12 = var15;
            }
            ++var10;

            if (((0x32 ^ 0x15 ^ (0x52 ^ 0x54)) & (0 ^ 0x2E ^ (0x8C ^ 0x83) ^ -1)) == 0) continue;
            return null;
        }
        return string;
    }

    private static boolean lIlllIIlIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllIIlIIlIllI() {
        lIlIIIlllIIIl = new String[lIlIIlIIlIlII[167]];
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[1]] = "420";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[0]] = "Bane";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[3]] = "Bear";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[4]] = "Behemoth";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[5]] = "Big";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[6]] = "Black";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[7]] = "Blade";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[8]] = "Bleed";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[9]] = "Blood";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[10]] = "Blow";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[11]] = "Boar";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[12]] = "Boi";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[13]] = "Bolt";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[14]] = "Boulder";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[15]] = "Boy";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[16]] = "Break";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[17]] = "Brow";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[18]] = "Challenger";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[19]] = "Chaser";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[20]] = "Colossal";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[21]] = "Colossus";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[22]] = "Corrupter";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[23]] = "Crow";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[24]] = "Danger";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[25]] = "Dark";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[26]] = "Dead";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[27]] = "pelt";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[28]] = "Death";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[29]] = "Deceiver";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[30]] = "Die";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[31]] = "Dire";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[32]] = "Doom";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[33]] = "Dragon";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[34]] = "Dwarf";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[35]] = "Dwarven";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[36]] = "Fang";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[37]] = "Fierce";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[38]] = "Fist";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[39]] = "Flurry";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[40]] = "Freak";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[41]] = "Fury";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[42]] = "Fuse";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[43]] = "Giant";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[44]] = "Girl";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[45]] = "Gold";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[46]] = "Great";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[47]] = "Grim";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[48]] = "Grotesque";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[49]] = "Guthix";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[50]] = "Hallow";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[51]] = "Helm";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[52]] = "Hit";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[53]] = "Hollow";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[54]] = "Homie";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[55]] = "Hunter";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[56]] = "Insane";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[57]] = "Invincible";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[58]] = "Iron";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[59]] = "Ironfist";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[60]] = "Ironman";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[61]] = "Kill";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[62]] = "Killa";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[63]] = "Lion";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[64]] = "Lone";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[65]] = "Mammoth";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[66]] = "Man";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[67]] = "Mane";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[68]] = "Me";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[69]] = "Might";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[70]] = "Mighty";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[71]] = "Mithril";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[72]] = "Molten";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[73]] = "Myth";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[74]] = "Mythic";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[75]] = "Night";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[76]] = "Night";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[77]] = "owl";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[78]] = "One";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[79]] = "PK";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[80]] = "Paragon";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[81]] = "Pelt";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[82]] = "Poison";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[83]] = "Proud";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[84]] = "Pur3";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[85]] = "Pure";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[86]] = "Rage";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[87]] = "Raven";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[88]] = "Rebel";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[89]] = "Rock";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[90]] = "Rumble";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[91]] = "Savage";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[92]] = "Scar";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[93]] = "Sexy";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[94]] = "Shade";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[95]] = "Shield";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[96]] = "Shout";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[97]] = "Silent";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[98]] = "Silver";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[99]] = "Sk1ll";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[100]] = "Skill";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[101]] = "Skull";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[102]] = "Slayer";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[103]] = "Spirit";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[104]] = "Spook";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[105]] = "Steel";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[106]] = "Storm";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[107]] = "Stout";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[108]] = "Strong";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[109]] = "Swift";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[110]] = "Tempest";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[111]] = "The";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[112]] = "Thirst";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[113]] = "Thunder";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[114]] = "Tower";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[115]] = "True";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[116]] = "Voidmane";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[117]] = "White";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[118]] = "Wild";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[119]] = "Wildfist";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[120]] = "Wolf";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[121]] = "Zam";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[122]] = "Zammy";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[123]] = "Zero";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[124]] = "_";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[125]] = "axe";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[126]] = "bolt";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[127]] = "bow";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[128]] = "bronze";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[129]] = "brow";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[130]] = "chaser";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[131]] = "cleaver";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[132]] = "cold";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[133]] = "earth";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[134]] = "fang";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[135]] = "fierce";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[136]] = "fire";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[137]] = "flayer";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[138]] = "gaze";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[139]] = "hero";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[140]] = "hot";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[141]] = "ice";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[142]] = "killa";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[143]] = "knight";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[144]] = "mage";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[145]] = "man";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[146]] = "metal";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[147]] = "might";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[148]] = "rage";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[149]] = "scar";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[150]] = "snarl";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[151]] = "song";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[152]] = "sorrow";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[153]] = "stride";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[154]] = "strike";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[155]] = "strong";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[156]] = "sword";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[157]] = "sworn";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[158]] = "thorn";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[159]] = "throw";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[160]] = "tongue";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[161]] = "warrior";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[162]] = "wind";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[163]] = "wizard";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[164]] = "xX";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[165]] = "xox";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[166]] = "xxx";
        K.lIlIIIlllIIIl[K.lIlIIlIIlIlII[2]] = K.lIlllIIIlIIIIll("2UUz2ALltqk=", "nbeuK");
    }

    private static boolean lIlllIIlIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIlIIlllII(int n2, int n3) {
        return n2 == n3;
    }

}

