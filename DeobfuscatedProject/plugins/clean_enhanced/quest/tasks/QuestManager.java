/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.quest.tasks;

import gg.squire.quest.tasks.LHelper;

public class QuestManager {

    private static boolean var3(Object object) {
        return object != null;
    }

    static {
        K.var4();
        K.var5();
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[1];
        while (K.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((1 & (1 ^ -1)) == ((0x78 ^ 0x46 ^ (0x35 ^ 0xE)) & (0x10 ^ 0x67 ^ (0xDC ^ 0xAE) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static String f(String string) {
        void var1_1;
        String var24;
        if (!K.var3(string) || K.var25(string.isEmpty() ? 1 : 0)) {
            return var24;
        }
        StringBuilder var26 = new StringBuilder();
        int var27 = var2[0];
        char[] var28 = var24.toCharArray();
        int var29 = var28.length;
        int var30 = var2[1];
        while (K.var15(var30, var29)) {
            char var31 = var28[var30];
            if (K.var25(Character.isSpaceChar(var31) ? 1 : 0)) {
                var27 = var2[0];
                0;
                if null != null {
                    return null;
                }
            } else if (K.var25(var27)) {
                var31 = Character.toTitleCase(var31);
                var27 = var2[1];
                0;
                if (((29 + 113 - 141 + 153 ^ 130 + 2 - 61 + 93) & (0x73 ^ 0x40 ^ (0xA4 ^ 0xA9) ^ -1)) == 1) {
                    return null;
                }
            } else {
                var31 = Character.toLowerCase(var31);
            }
            var26.append(var31);
            0;
            ++var30;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    /*
     * WARNING - void declaration
     */
    public static String F() {
        void var32;
        String[] stringArray = new String[var2[2]];
        stringArray[K.var2[1]] = var1[var2[1]];
        stringArray[K.var2[0]] = var1[var2[0]];
        stringArray[K.var2[3]] = var1[var2[3]];
        stringArray[K.var2[4]] = var1[var2[4]];
        stringArray[K.var2[5]] = var1[var2[5]];
        stringArray[K.var2[6]] = var1[var2[6]];
        stringArray[K.var2[7]] = var1[var2[7]];
        stringArray[K.var2[8]] = var1[var2[8]];
        stringArray[K.var2[9]] = var1[var2[9]];
        stringArray[K.var2[10]] = var1[var2[10]];
        stringArray[K.var2[11]] = var1[var2[11]];
        stringArray[K.var2[12]] = var1[var2[12]];
        stringArray[K.var2[13]] = var1[var2[13]];
        stringArray[K.var2[14]] = var1[var2[14]];
        stringArray[K.var2[15]] = var1[var2[15]];
        stringArray[K.var2[16]] = var1[var2[16]];
        stringArray[K.var2[17]] = var1[var2[17]];
        stringArray[K.var2[18]] = var1[var2[18]];
        stringArray[K.var2[19]] = var1[var2[19]];
        stringArray[K.var2[20]] = var1[var2[20]];
        stringArray[K.var2[21]] = var1[var2[21]];
        stringArray[K.var2[22]] = var1[var2[22]];
        stringArray[K.var2[23]] = var1[var2[23]];
        stringArray[K.var2[24]] = var1[var2[24]];
        stringArray[K.var2[25]] = var1[var2[25]];
        stringArray[K.var2[26]] = var1[var2[26]];
        stringArray[K.var2[27]] = var1[var2[27]];
        stringArray[K.var2[28]] = var1[var2[28]];
        stringArray[K.var2[29]] = var1[var2[29]];
        stringArray[K.var2[30]] = var1[var2[30]];
        stringArray[K.var2[31]] = var1[var2[31]];
        stringArray[K.var2[32]] = var1[var2[32]];
        stringArray[K.var2[33]] = var1[var2[33]];
        stringArray[K.var2[34]] = var1[var2[34]];
        stringArray[K.var2[35]] = var1[var2[35]];
        stringArray[K.var2[36]] = var1[var2[36]];
        stringArray[K.var2[37]] = var1[var2[37]];
        stringArray[K.var2[38]] = var1[var2[38]];
        stringArray[K.var2[39]] = var1[var2[39]];
        stringArray[K.var2[40]] = var1[var2[40]];
        stringArray[K.var2[41]] = var1[var2[41]];
        stringArray[K.var2[42]] = var1[var2[42]];
        stringArray[K.var2[43]] = var1[var2[43]];
        stringArray[K.var2[44]] = var1[var2[44]];
        stringArray[K.var2[45]] = var1[var2[45]];
        stringArray[K.var2[46]] = var1[var2[46]];
        stringArray[K.var2[47]] = var1[var2[47]];
        stringArray[K.var2[48]] = var1[var2[48]];
        stringArray[K.var2[49]] = var1[var2[49]];
        stringArray[K.var2[50]] = var1[var2[50]];
        stringArray[K.var2[51]] = var1[var2[51]];
        stringArray[K.var2[52]] = var1[var2[52]];
        stringArray[K.var2[53]] = var1[var2[53]];
        stringArray[K.var2[54]] = var1[var2[54]];
        stringArray[K.var2[55]] = var1[var2[55]];
        stringArray[K.var2[56]] = var1[var2[56]];
        stringArray[K.var2[57]] = var1[var2[57]];
        stringArray[K.var2[58]] = var1[var2[58]];
        stringArray[K.var2[59]] = var1[var2[59]];
        stringArray[K.var2[60]] = var1[var2[60]];
        stringArray[K.var2[61]] = var1[var2[61]];
        stringArray[K.var2[62]] = var1[var2[62]];
        stringArray[K.var2[63]] = var1[var2[63]];
        stringArray[K.var2[64]] = var1[var2[64]];
        stringArray[K.var2[65]] = var1[var2[65]];
        stringArray[K.var2[66]] = var1[var2[66]];
        stringArray[K.var2[67]] = var1[var2[67]];
        stringArray[K.var2[68]] = var1[var2[68]];
        stringArray[K.var2[69]] = var1[var2[69]];
        stringArray[K.var2[70]] = var1[var2[70]];
        stringArray[K.var2[71]] = var1[var2[71]];
        stringArray[K.var2[72]] = var1[var2[72]];
        stringArray[K.var2[73]] = var1[var2[73]];
        stringArray[K.var2[74]] = var1[var2[74]];
        stringArray[K.var2[75]] = var1[var2[75]];
        stringArray[K.var2[76]] = var1[var2[76]];
        stringArray[K.var2[77]] = var1[var2[77]];
        stringArray[K.var2[78]] = var1[var2[78]];
        stringArray[K.var2[79]] = var1[var2[79]];
        stringArray[K.var2[80]] = var1[var2[80]];
        stringArray[K.var2[81]] = var1[var2[81]];
        stringArray[K.var2[82]] = var1[var2[82]];
        stringArray[K.var2[83]] = var1[var2[83]];
        stringArray[K.var2[84]] = var1[var2[84]];
        stringArray[K.var2[85]] = var1[var2[85]];
        stringArray[K.var2[86]] = var1[var2[86]];
        stringArray[K.var2[87]] = var1[var2[87]];
        stringArray[K.var2[88]] = var1[var2[88]];
        stringArray[K.var2[89]] = var1[var2[89]];
        stringArray[K.var2[90]] = var1[var2[90]];
        stringArray[K.var2[91]] = var1[var2[91]];
        stringArray[K.var2[92]] = var1[var2[92]];
        stringArray[K.var2[93]] = var1[var2[93]];
        stringArray[K.var2[94]] = var1[var2[94]];
        stringArray[K.var2[95]] = var1[var2[95]];
        stringArray[K.var2[96]] = var1[var2[96]];
        stringArray[K.var2[97]] = var1[var2[97]];
        stringArray[K.var2[98]] = var1[var2[98]];
        stringArray[K.var2[99]] = var1[var2[99]];
        stringArray[K.var2[100]] = var1[var2[100]];
        stringArray[K.var2[101]] = var1[var2[101]];
        stringArray[K.var2[102]] = var1[var2[102]];
        stringArray[K.var2[103]] = var1[var2[103]];
        stringArray[K.var2[104]] = var1[var2[104]];
        stringArray[K.var2[105]] = var1[var2[105]];
        stringArray[K.var2[106]] = var1[var2[106]];
        stringArray[K.var2[107]] = var1[var2[107]];
        stringArray[K.var2[108]] = var1[var2[108]];
        stringArray[K.var2[109]] = var1[var2[109]];
        stringArray[K.var2[110]] = var1[var2[110]];
        stringArray[K.var2[111]] = var1[var2[111]];
        stringArray[K.var2[112]] = var1[var2[112]];
        stringArray[K.var2[113]] = var1[var2[113]];
        stringArray[K.var2[114]] = var1[var2[114]];
        stringArray[K.var2[115]] = var1[var2[115]];
        stringArray[K.var2[116]] = var1[var2[116]];
        stringArray[K.var2[117]] = var1[var2[117]];
        stringArray[K.var2[118]] = var1[var2[118]];
        stringArray[K.var2[119]] = var1[var2[119]];
        stringArray[K.var2[120]] = var1[var2[120]];
        stringArray[K.var2[121]] = var1[var2[121]];
        stringArray[K.var2[122]] = var1[var2[122]];
        stringArray[K.var2[123]] = var1[var2[123]];
        stringArray[K.var2[124]] = var1[var2[124]];
        stringArray[K.var2[125]] = var1[var2[125]];
        stringArray[K.var2[126]] = var1[var2[126]];
        stringArray[K.var2[127]] = var1[var2[127]];
        stringArray[K.var2[128]] = var1[var2[128]];
        stringArray[K.var2[129]] = var1[var2[129]];
        stringArray[K.var2[130]] = var1[var2[130]];
        stringArray[K.var2[131]] = var1[var2[131]];
        stringArray[K.var2[132]] = var1[var2[132]];
        stringArray[K.var2[133]] = var1[var2[133]];
        stringArray[K.var2[134]] = var1[var2[134]];
        stringArray[K.var2[135]] = var1[var2[135]];
        stringArray[K.var2[136]] = var1[var2[136]];
        stringArray[K.var2[137]] = var1[var2[137]];
        stringArray[K.var2[138]] = var1[var2[138]];
        stringArray[K.var2[139]] = var1[var2[139]];
        stringArray[K.var2[140]] = var1[var2[140]];
        stringArray[K.var2[141]] = var1[var2[141]];
        stringArray[K.var2[142]] = var1[var2[142]];
        stringArray[K.var2[143]] = var1[var2[143]];
        stringArray[K.var2[144]] = var1[var2[144]];
        stringArray[K.var2[145]] = var1[var2[145]];
        stringArray[K.var2[146]] = var1[var2[146]];
        stringArray[K.var2[147]] = var1[var2[147]];
        stringArray[K.var2[148]] = var1[var2[148]];
        stringArray[K.var2[149]] = var1[var2[149]];
        stringArray[K.var2[150]] = var1[var2[150]];
        stringArray[K.var2[151]] = var1[var2[151]];
        stringArray[K.var2[152]] = var1[var2[152]];
        stringArray[K.var2[153]] = var1[var2[153]];
        stringArray[K.var2[154]] = var1[var2[154]];
        stringArray[K.var2[155]] = var1[var2[155]];
        stringArray[K.var2[156]] = var1[var2[156]];
        stringArray[K.var2[157]] = var1[var2[157]];
        stringArray[K.var2[158]] = var1[var2[158]];
        stringArray[K.var2[159]] = var1[var2[159]];
        stringArray[K.var2[160]] = var1[var2[160]];
        stringArray[K.var2[161]] = var1[var2[161]];
        stringArray[K.var2[162]] = var1[var2[162]];
        stringArray[K.var2[163]] = var1[var2[163]];
        stringArray[K.var2[164]] = var1[var2[164]];
        stringArray[K.var2[165]] = var1[var2[165]];
        stringArray[K.var2[166]] = var1[var2[166]];
        String[] stringArray2 = stringArray;
        int n2 = L.a(2.0, 3.0);
        int n3 = L.a(8.0, 12.0);
        String string = var1[var2[2]];
        int var33 = var2[1];
        while (K.var15(var33, (int)var32)) {
            void var34;
            Object var35;
            void var36;
            String var37 = var36[L.a(0.0, ((void)var36).length - var2[0])];
            switch (L.a(0.0, 4.0)) {
                case 0: {
                    var37 = var37.toLowerCase();
                    0;
                    if (1 >= 0) break;
                    return null;
                }
                case 1: {
                    var37 = var37.toUpperCase();
                    0;
                    if (1 >= 1) break;
                    return null;
                }
                case -1: {
                    var37 = K.f(var37);
                }
            }
            if (K.var23(((String)var35).length() + var37.length(), (int)var34)) {
                var35 = (String)var35 + var37;
                0;
                if null != null {
                    return null;
                }
            } else {
                Object var38;
                if (K.var39(L.a(0.0, 1.0), var2[0])) {
                    var38 = ((String)var35 + var37).substring(var2[1], (int)var34);
                    0;
                    if (1 == ((119 + 37 - 60 + 86 ^ 62 + 116 - 28 + 15) & (98 + 9 - 84 + 118 ^ 33 + 45 - -52 + 28 ^ -1))) {
                        return null;
                    }
                } else {
                    int var40 = L.a(9.0, (double)var34);
                    var38 = ((String)var35 + var37).substring(var2[1], var40);
                    int var41 = var40;
                    while (K.var15(var41, var2[13])) {
                        if (K.var39(L.a(0.0, 1.0), var2[0])) {
                            var38 = (String)var38 + L.a(0.0, 9.0);
                            0;
                            if ((0 ^ 0x24 ^ (0x72 ^ 0x52)) == 2) {
                                return null;
                            }
                        } else {
                            var38 = L.a(0.0, 9.0) + (String)var38;
                        }
                        ++var41;
                        0;
                        if null == null continue;
                        return null;
                    }
                }
                var35 = var38;
            }
            ++var33;
            0;
            if (((0x32 ^ 0x15 ^ (0x52 ^ 0x54)) & (0 ^ 0x2E ^ (0x8C ^ 0x83) ^ -1)) == 0) continue;
            return null;
        }
        return string;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static void var5() {
        var1 = new String[var2[167]];
        K.var1[K.var2[1]] = "420";
        K.var1[K.var2[0]] = "Bane";
        K.var1[K.var2[3]] = "Bear";
        K.var1[K.var2[4]] = "Behemoth";
        K.var1[K.var2[5]] = "Big";
        K.var1[K.var2[6]] = "Black";
        K.var1[K.var2[7]] = "Blade";
        K.var1[K.var2[8]] = "Bleed";
        K.var1[K.var2[9]] = "Blood";
        K.var1[K.var2[10]] = "Blow";
        K.var1[K.var2[11]] = "Boar";
        K.var1[K.var2[12]] = "Boi";
        K.var1[K.var2[13]] = "Bolt";
        K.var1[K.var2[14]] = "Boulder";
        K.var1[K.var2[15]] = "Boy";
        K.var1[K.var2[16]] = "Break";
        K.var1[K.var2[17]] = "Brow";
        K.var1[K.var2[18]] = "Challenger";
        K.var1[K.var2[19]] = "Chaser";
        K.var1[K.var2[20]] = "Colossal";
        K.var1[K.var2[21]] = "Colossus";
        K.var1[K.var2[22]] = "Corrupter";
        K.var1[K.var2[23]] = "Crow";
        K.var1[K.var2[24]] = "Danger";
        K.var1[K.var2[25]] = "Dark";
        K.var1[K.var2[26]] = "Dead";
        K.var1[K.var2[27]] = "pelt";
        K.var1[K.var2[28]] = "Death";
        K.var1[K.var2[29]] = "Deceiver";
        K.var1[K.var2[30]] = "Die";
        K.var1[K.var2[31]] = "Dire";
        K.var1[K.var2[32]] = "Doom";
        K.var1[K.var2[33]] = "Dragon";
        K.var1[K.var2[34]] = "Dwarf";
        K.var1[K.var2[35]] = "Dwarven";
        K.var1[K.var2[36]] = "Fang";
        K.var1[K.var2[37]] = "Fierce";
        K.var1[K.var2[38]] = "Fist";
        K.var1[K.var2[39]] = "Flurry";
        K.var1[K.var2[40]] = "Freak";
        K.var1[K.var2[41]] = "Fury";
        K.var1[K.var2[42]] = "Fuse";
        K.var1[K.var2[43]] = "Giant";
        K.var1[K.var2[44]] = "Girl";
        K.var1[K.var2[45]] = "Gold";
        K.var1[K.var2[46]] = "Great";
        K.var1[K.var2[47]] = "Grim";
        K.var1[K.var2[48]] = "Grotesque";
        K.var1[K.var2[49]] = "Guthix";
        K.var1[K.var2[50]] = "Hallow";
        K.var1[K.var2[51]] = "Helm";
        K.var1[K.var2[52]] = "Hit";
        K.var1[K.var2[53]] = "Hollow";
        K.var1[K.var2[54]] = "Homie";
        K.var1[K.var2[55]] = "Hunter";
        K.var1[K.var2[56]] = "Insane";
        K.var1[K.var2[57]] = "Invincible";
        K.var1[K.var2[58]] = "Iron";
        K.var1[K.var2[59]] = "Ironfist";
        K.var1[K.var2[60]] = "Ironman";
        K.var1[K.var2[61]] = "Kill";
        K.var1[K.var2[62]] = "Killa";
        K.var1[K.var2[63]] = "Lion";
        K.var1[K.var2[64]] = "Lone";
        K.var1[K.var2[65]] = "Mammoth";
        K.var1[K.var2[66]] = "Man";
        K.var1[K.var2[67]] = "Mane";
        K.var1[K.var2[68]] = "Me";
        K.var1[K.var2[69]] = "Might";
        K.var1[K.var2[70]] = "Mighty";
        K.var1[K.var2[71]] = "Mithril";
        K.var1[K.var2[72]] = "Molten";
        K.var1[K.var2[73]] = "Myth";
        K.var1[K.var2[74]] = "Mythic";
        K.var1[K.var2[75]] = "Night";
        K.var1[K.var2[76]] = "Night";
        K.var1[K.var2[77]] = "owl";
        K.var1[K.var2[78]] = "One";
        K.var1[K.var2[79]] = "PK";
        K.var1[K.var2[80]] = "Paragon";
        K.var1[K.var2[81]] = "Pelt";
        K.var1[K.var2[82]] = "Poison";
        K.var1[K.var2[83]] = "Proud";
        K.var1[K.var2[84]] = "Pur3";
        K.var1[K.var2[85]] = "Pure";
        K.var1[K.var2[86]] = "Rage";
        K.var1[K.var2[87]] = "Raven";
        K.var1[K.var2[88]] = "Rebel";
        K.var1[K.var2[89]] = "Rock";
        K.var1[K.var2[90]] = "Rumble";
        K.var1[K.var2[91]] = "Savage";
        K.var1[K.var2[92]] = "Scar";
        K.var1[K.var2[93]] = "Sexy";
        K.var1[K.var2[94]] = "Shade";
        K.var1[K.var2[95]] = "Shield";
        K.var1[K.var2[96]] = "Shout";
        K.var1[K.var2[97]] = "Silent";
        K.var1[K.var2[98]] = "Silver";
        K.var1[K.var2[99]] = "Sk1ll";
        K.var1[K.var2[100]] = "Skill";
        K.var1[K.var2[101]] = "Skull";
        K.var1[K.var2[102]] = "Slayer";
        K.var1[K.var2[103]] = "Spirit";
        K.var1[K.var2[104]] = "Spook";
        K.var1[K.var2[105]] = "Steel";
        K.var1[K.var2[106]] = "Storm";
        K.var1[K.var2[107]] = "Stout";
        K.var1[K.var2[108]] = "Strong";
        K.var1[K.var2[109]] = "Swift";
        K.var1[K.var2[110]] = "Tempest";
        K.var1[K.var2[111]] = "The";
        K.var1[K.var2[112]] = "Thirst";
        K.var1[K.var2[113]] = "Thunder";
        K.var1[K.var2[114]] = "Tower";
        K.var1[K.var2[115]] = "True";
        K.var1[K.var2[116]] = "Voidmane";
        K.var1[K.var2[117]] = "White";
        K.var1[K.var2[118]] = "Wild";
        K.var1[K.var2[119]] = "Wildfist";
        K.var1[K.var2[120]] = "Wolf";
        K.var1[K.var2[121]] = "Zam";
        K.var1[K.var2[122]] = "Zammy";
        K.var1[K.var2[123]] = "Zero";
        K.var1[K.var2[124]] = "_";
        K.var1[K.var2[125]] = "axe";
        K.var1[K.var2[126]] = "bolt";
        K.var1[K.var2[127]] = "bow";
        K.var1[K.var2[128]] = "bronze";
        K.var1[K.var2[129]] = "brow";
        K.var1[K.var2[130]] = "chaser";
        K.var1[K.var2[131]] = "cleaver";
        K.var1[K.var2[132]] = "cold";
        K.var1[K.var2[133]] = "earth";
        K.var1[K.var2[134]] = "fang";
        K.var1[K.var2[135]] = "fierce";
        K.var1[K.var2[136]] = "fire";
        K.var1[K.var2[137]] = "flayer";
        K.var1[K.var2[138]] = "gaze";
        K.var1[K.var2[139]] = "hero";
        K.var1[K.var2[140]] = "hot";
        K.var1[K.var2[141]] = "ice";
        K.var1[K.var2[142]] = "killa";
        K.var1[K.var2[143]] = "knight";
        K.var1[K.var2[144]] = "mage";
        K.var1[K.var2[145]] = "man";
        K.var1[K.var2[146]] = "metal";
        K.var1[K.var2[147]] = "might";
        K.var1[K.var2[148]] = "rage";
        K.var1[K.var2[149]] = "scar";
        K.var1[K.var2[150]] = "snarl";
        K.var1[K.var2[151]] = "song";
        K.var1[K.var2[152]] = "sorrow";
        K.var1[K.var2[153]] = "stride";
        K.var1[K.var2[154]] = "strike";
        K.var1[K.var2[155]] = "strong";
        K.var1[K.var2[156]] = "sword";
        K.var1[K.var2[157]] = "sworn";
        K.var1[K.var2[158]] = "thorn";
        K.var1[K.var2[159]] = "throw";
        K.var1[K.var2[160]] = "tongue";
        K.var1[K.var2[161]] = "warrior";
        K.var1[K.var2[162]] = "wind";
        K.var1[K.var2[163]] = "wizard";
        K.var1[K.var2[164]] = "xX";
        K.var1[K.var2[165]] = "xox";
        K.var1[K.var2[166]] = "xxx";
        K.var1[K.var2[2]] = K.var42("2UUz2ALltqk=", "nbeuK");
    }

    private static void var4() {
        var2 = new int[168];
        K.var2[0] = 1;
        K.var2[1] = (0x33 ^ 0x24) & ~(0x30 ^ 0x27);
        K.var2[2] = 37 + 102 - -2 + 11 + (0x67 ^ 0x57) - (0x2E ^ 2) + (0x13 ^ 0x19);
        K.var2[3] = 2;
        K.var2[4] = 3;
        K.var2[5] = 0x2E ^ 0x2A;
        K.var2[6] = 0xC0 ^ 0xC5;
        K.var2[7] = 0xB6 ^ 0xBB ^ (0x73 ^ 0x78);
        K.var2[8] = 8 ^ 0x29 ^ (0xE2 ^ 0xC4);
        K.var2[9] = 0x75 ^ 0x38 ^ (0xE0 ^ 0xA5);
        K.var2[10] = 0xBC ^ 0xB5;
        K.var2[11] = 0x15 ^ 0x1F;
        K.var2[12] = 0x3F ^ 0x34;
        K.var2[13] = 0x80 ^ 0x9B ^ (0x8E ^ 0x99);
        K.var2[14] = 1 ^ 0xC;
        K.var2[15] = 0x75 ^ 9 ^ (0xFF ^ 0x8D);
        K.var2[16] = 131 + 122 - 174 + 56 ^ 120 + 65 - 49 + 0;
        K.var2[17] = 0xB ^ 0x1B;
        K.var2[18] = 0x19 ^ 8;
        K.var2[19] = 99 + 109 - 176 + 150 ^ 85 + 80 - 6 + 5;
        K.var2[20] = 0x38 ^ 0x2B;
        K.var2[21] = 0x68 ^ 0x7C;
        K.var2[22] = 8 ^ 0x1D ^ (0xAF ^ 0x82) & ~(0x7D ^ 0x50);
        K.var2[23] = 0x87 ^ 0x91;
        K.var2[24] = 0x5A ^ 0x11 ^ (0xF ^ 0x53);
        K.var2[25] = 0x29 ^ 0x13 ^ (0x4E ^ 0x6C);
        K.var2[26] = 0x64 ^ 0x7D;
        K.var2[27] = 59 + 146 - 56 + 71 ^ 103 + 88 - 184 + 191;
        K.var2[28] = 37 + 29 - -10 + 73 ^ 62 + 106 - 29 + 3;
        K.var2[29] = 0x91 ^ 0xC5 ^ (0x26 ^ 0x6E);
        K.var2[30] = 0x45 ^ 6 ^ (0x7F ^ 0x21);
        K.var2[31] = 0x35 ^ 0x6D ^ (0x10 ^ 0x56);
        K.var2[32] = 0xB ^ 0x7D ^ (0x7B ^ 0x12);
        K.var2[33] = 0xE5 ^ 0x9C ^ (0xD3 ^ 0x8A);
        K.var2[34] = 0xB4 ^ 0x95;
        K.var2[35] = 0xBE ^ 0x9C;
        K.var2[36] = 0x87 ^ 0xA4;
        K.var2[37] = 0x33 ^ 0x63 ^ (0x2B ^ 0x5F);
        K.var2[38] = 0x6F ^ 0x4A;
        K.var2[39] = 0xE0 ^ 0x99 ^ (0x76 ^ 0x29);
        K.var2[40] = 0x9B ^ 0x8A ^ (0x3D ^ 0xB);
        K.var2[41] = 0x99 ^ 0xB1;
        K.var2[42] = 0x66 ^ 0x4F;
        K.var2[43] = 0x20 ^ 0xA;
        K.var2[44] = 27 + 69 - 77 + 147 ^ 79 + 71 - 110 + 101;
        K.var2[45] = 6 ^ 0x2A;
        K.var2[46] = 0x7F ^ 0x6F ^ (0x43 ^ 0x7E);
        K.var2[47] = 0x34 ^ 0x7E ^ (0xDA ^ 0xBE);
        K.var2[48] = 0xBD ^ 0xA3 ^ (0xA5 ^ 0x94);
        K.var2[49] = 0x4E ^ 0x7E;
        K.var2[50] = 0x73 ^ 0x54 ^ (0x5F ^ 0x49);
        K.var2[51] = 0x90 ^ 0xB1 ^ (0x9E ^ 0x8D);
        K.var2[52] = 121 + 62 - 132 + 79 ^ 27 + 160 - 94 + 84;
        K.var2[53] = 0x9F ^ 0xAB;
        K.var2[54] = 0xF0 ^ 0xC5;
        K.var2[55] = 0xA9 ^ 0x9C ^ 3;
        K.var2[56] = 3 + 78 - 66 + 135 ^ 12 + 140 - 21 + 30;
        K.var2[57] = 0x9F ^ 0xA7;
        K.var2[58] = 2 ^ 0x3B;
        K.var2[59] = 0xD1 ^ 0xA3 ^ (0xE6 ^ 0xAE);
        K.var2[60] = 132 + 149 - 178 + 49 ^ 155 + 34 - 144 + 118;
        K.var2[61] = 0x54 ^ 0x63 ^ (0x82 ^ 0x89);
        K.var2[62] = 0x74 ^ 0x49;
        K.var2[63] = 0xA4 ^ 0x9A;
        K.var2[64] = 9 ^ 0x36;
        K.var2[65] = 0x7B ^ 0x38 ^ 3;
        K.var2[66] = 0xCD ^ 0x8C;
        K.var2[67] = 0x58 ^ 0x2F ^ (0x13 ^ 0x26);
        K.var2[68] = 0xE6 ^ 0xA5;
        K.var2[69] = 84 + 114 - 155 + 158 ^ 105 + 31 - 57 + 62;
        K.var2[70] = 0xE6 ^ 0xA3;
        K.var2[71] = 3 ^ 0x1B ^ (0x58 ^ 6);
        K.var2[72] = 67 + 73 - 47 + 108 ^ 78 + 7 - 14 + 71;
        K.var2[73] = 0x54 ^ 0x1C;
        K.var2[74] = 0xD6 ^ 0xBE ^ (0x75 ^ 0x54);
        K.var2[75] = 0x8E ^ 0xC4;
        K.var2[76] = 0x11 ^ 0x28 ^ (0xC7 ^ 0xB5);
        K.var2[77] = 0xED ^ 0xA1;
        K.var2[78] = 0xF9 ^ 0xB4;
        K.var2[79] = 0x54 ^ 0x58 ^ (0xF9 ^ 0xBB);
        K.var2[80] = 0x1F ^ 0x50;
        K.var2[81] = 0x67 ^ 0x37;
        K.var2[82] = 0xF9 ^ 0xA8;
        K.var2[83] = 0x62 ^ 0x30;
        K.var2[84] = 0xEC ^ 0xBF;
        K.var2[85] = 0x86 ^ 0x81 ^ (0x28 ^ 0x7B);
        K.var2[86] = 0xD3 ^ 0x86;
        K.var2[87] = 0x14 ^ 0x31 ^ (0x58 ^ 0x2B);
        K.var2[88] = 0x64 ^ 0x33;
        K.var2[89] = 0x5E ^ 0x20 ^ (0x89 ^ 0xAF);
        K.var2[90] = 0x26 ^ 0x6E ^ (0x11 ^ 0);
        K.var2[91] = 0xD3 ^ 0xAE ^ (0x82 ^ 0xA5);
        K.var2[92] = 0xEF ^ 0xB4;
        K.var2[93] = 0x4D ^ 0x11;
        K.var2[94] = 0x2C ^ 0x72 ^ 3;
        K.var2[95] = 0x7E ^ 0x3A ^ (0x17 ^ 0xD);
        K.var2[96] = 2 ^ 0x5D;
        K.var2[97] = 0x25 ^ 0x45;
        K.var2[98] = 0xDB ^ 0xBA;
        K.var2[99] = 0xFA ^ 0x9C ^ (0x17 ^ 0x13);
        K.var2[100] = 0x72 ^ 0x41 ^ (0xDD ^ 0x8D);
        K.var2[101] = 0x65 ^ 1;
        K.var2[102] = 0xF4 ^ 0xB8 ^ (0x1A ^ 0x33);
        K.var2[103] = 0x46 ^ 0x11 ^ (0x4C ^ 0x7D);
        K.var2[104] = 0xD2 ^ 0xAE ^ (0x57 ^ 0x4C);
        K.var2[105] = 0x15 ^ 0x7D;
        K.var2[106] = 0x49 ^ 0x74 ^ (0x31 ^ 0x65);
        K.var2[107] = 14 + 97 - -16 + 72 ^ 3 + 14 - -133 + 23;
        K.var2[108] = 0xA7 ^ 0xAC ^ (0x70 ^ 0x10);
        K.var2[109] = 175 + 57 - 33 + 6 ^ 114 + 46 - 122 + 123;
        K.var2[110] = 0xD7 ^ 0xBA;
        K.var2[111] = 0x6D ^ 3;
        K.var2[112] = 0x10 ^ 0x7F;
        K.var2[113] = 103 + 41 - -5 + 57 ^ 35 + 112 - 138 + 181;
        K.var2[114] = 0x36 ^ 0x6E ^ (0x1A ^ 0x33);
        K.var2[115] = 0x23 ^ 0x51;
        K.var2[116] = 0x60 ^ 0x13;
        K.var2[117] = 184 + 35 - 50 + 48 ^ 16 + 110 - -7 + 40;
        K.var2[118] = 0x5D ^ 0x28;
        K.var2[119] = 0x53 ^ 0 ^ (0xE1 ^ 0xC4);
        K.var2[120] = 61 + 154 - 162 + 188 ^ 125 + 21 - 122 + 110;
        K.var2[121] = 0x73 ^ 0xB;
        K.var2[122] = 1 + 20 - -218 + 0 ^ 149 + 76 - 213 + 138;
        K.var2[123] = 0x5D ^ 0x27;
        K.var2[124] = 135 + 59 - 71 + 93 ^ 160 + 80 - 86 + 9;
        K.var2[125] = 0x5E ^ 1 ^ (0x81 ^ 0xA2);
        K.var2[126] = 0x22 ^ 0x5F;
        K.var2[127] = 0x51 ^ 0x68 ^ (0x58 ^ 0x1F);
        K.var2[128] = (0x1A ^ 0x17) + (0x23 ^ 0x70) - (0xB7 ^ 0xBA) + (0x30 ^ 0x1C);
        K.var2[129] = 41 + 107 - 89 + 69;
        K.var2[130] = (0xE2 ^ 0xBC) + (0x3F ^ 0) - (52 + 7 - -73 + 22) + (0xD7 ^ 0xA9);
        K.var2[131] = (4 ^ 0x65) + (0x79 ^ 0x14) - (0x75 ^ 0x21) + (0x5E ^ 0x56);
        K.var2[132] = 63 + 67 - 76 + 77;
        K.var2[133] = (0xA7 ^ 0x8B) + (22 + 49 - -34 + 24) - (0x6E ^ 0x2D) + (0x7E ^ 0x64);
        K.var2[134] = 59 + 104 - 51 + 21;
        K.var2[135] = 39 + 129 - 105 + 71;
        K.var2[136] = 99 + 33 - -1 + 2;
        K.var2[137] = (0x59 ^ 0x6A) + (110 + 63 - 91 + 48) - (0x63 ^ 3) + (0x45 ^ 0x76);
        K.var2[138] = 126 + 115 - 157 + 53;
        K.var2[139] = 35 + 94 - 25 + 26 + (0x51 ^ 0x43) - (0xFD ^ 0xAC) + (0xD6 ^ 0x91);
        K.var2[140] = 86 + 3 - 4 + 54;
        K.var2[141] = 102 + 100 - 101 + 39;
        K.var2[142] = 18 + 79 - 54 + 98;
        K.var2[143] = 135 + 75 - 140 + 72;
        K.var2[144] = 134 + 140 - 164 + 32 + (0xC4 ^ 0xAE) - (95 + 143 - 116 + 74) + (3 ^ 0x58);
        K.var2[145] = 137 + 113 - 160 + 54;
        K.var2[146] = 97 + 96 - 192 + 144;
        K.var2[147] = 32 + 58 - 84 + 140;
        K.var2[148] = (0x4B ^ 0x62) + (0x9F ^ 0x96) - -(0x4D ^ 0x7E) + (0x51 ^ 0x7F);
        K.var2[149] = (0xEE ^ 0xAD) + (114 + 100 - 124 + 41) - (91 + 68 - 15 + 13) + (0xFB ^ 0x90);
        K.var2[150] = 131 + 58 - 89 + 49;
        K.var2[151] = (0xAE ^ 0xC1) + (0xD7 ^ 0x8C) - (0xC9 ^ 0xA6) + (0x63 ^ 0x58);
        K.var2[152] = (0xC2 ^ 0xB3) + (0xB9 ^ 0xA9) - (0x13 ^ 0x1E) + (0x5A ^ 0x79);
        K.var2[153] = 46 + 59 - 27 + 66 + (0xDD ^ 0xAF) - (155 + 155 - 193 + 88) + (0x7C ^ 0x1F);
        K.var2[154] = 26 + 128 - 79 + 78;
        K.var2[155] = 37 + 129 - 143 + 131;
        K.var2[156] = (0xE6 ^ 0xAF) + (0x2C ^ 0x55) - (0xDE ^ 0x90) + (0xAA ^ 0x8D);
        K.var2[157] = (0x79 ^ 0x7D) + (0xC1 ^ 0xB7) - (0xC4 ^ 0x9D) + (0x6B ^ 0x10);
        K.var2[158] = (0x52 ^ 0x1E) + (0x3F ^ 0x31) - -(0x63 ^ 0x70) + (0x11 ^ 0x21);
        K.var2[159] = 87 + 136 - 116 + 51;
        K.var2[160] = 63 + 6 - 30 + 90 + (0x7F ^ 0x5F) - (0x6B ^ 0x3C) + (0xCE ^ 0x9B);
        K.var2[161] = (0x41 ^ 0x15) + (121 + 139 - 175 + 59) - (133 + 141 - 205 + 105) + (3 ^ 0x69);
        K.var2[162] = 83 + 66 - 113 + 125;
        K.var2[163] = 110 + 29 - -15 + 8;
        K.var2[164] = 33 + 46 - -4 + 80;
        K.var2[165] = (0 ^ 0x5D) + (0x25 ^ 0x38) - (2 ^ 0x30) + (2 ^ 0x5E);
        K.var2[166] = (0x32 ^ 0xD) + (0x74 ^ 0x1D) - (54 + 66 - 60 + 73) + (36 + 23 - 47 + 118);
        K.var2[167] = (0xE6 ^ 0xB4) + (113 + 83 - 182 + 134) - (63 + 121 - 143 + 88) + (0x67 ^ 0x25);
    }

    private static boolean var25(int n2) {
        return n2 != 0;
    }

    private static boolean var39(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var47) {
            var47.printStackTrace();
            return null;
        }
    }
}

