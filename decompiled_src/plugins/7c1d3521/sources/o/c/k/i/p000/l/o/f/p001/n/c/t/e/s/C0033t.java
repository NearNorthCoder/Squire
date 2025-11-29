package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.QuestVarbits;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/t.class */
public class C0033t implements InterfaceC0003ac {
    public static /* synthetic */ String h;
    public static /* synthetic */ List<InterfaceC0003ac> dc;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ int[] llIIIIllll;
    private static /* synthetic */ String[] llIIIIllIl;
    static /* synthetic */ int cG;

    private static boolean lIlIIlIIlIlII(int i) {
        return i > 0;
    }

    private static boolean lIlIIlIIlIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIlIIlIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIIllll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    static {
        lIlIIlIIIllll();
        lIlIIlIIIlllI();
        dc = new ArrayList();
        h = llIIIIllIl[llIIIIllll[49]];
        dd = llIIIIllll[2];
    }

    private static String lIlIIlIIIlIll(String llllllllllllllllllIllIIlIllIllll, String llllllllllllllllllIllIIlIllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIIlIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllIIlIlllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllIIlIlllIIIl.init(llIIIIllll[3], secretKeySpec);
            return new String(llllllllllllllllllIllIIlIlllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIIlIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIIlIllIlIll) {
            llllllllllllllllllIllIIlIllIlIll.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aW();
            "".length();
            if ("  ".length() < 0) {
                return (70 ^ 111) & ((169 ^ 128) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIIIllll[44];
    }

    private static boolean lIlIIlIIlIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIlIIlIIIllII(String llllllllllllllllllIllIIlIllIIIlI, String llllllllllllllllllIllIIlIllIIIIl) {
        try {
            SecretKeySpec llllllllllllllllllIllIIlIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), llIIIIllll[14]), "DES");
            Cipher llllllllllllllllllIllIIlIllIIlII = Cipher.getInstance("DES");
            llllllllllllllllllIllIIlIllIIlII.init(llIIIIllll[3], llllllllllllllllllIllIIlIllIIlIl);
            return new String(llllllllllllllllllIllIIlIllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIIlIllIIIll) {
            llllllllllllllllllIllIIlIllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIIIl(int i, int i2) {
        return i < i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return h;
    }

    private static String lIlIIlIIIlIlI(String llllllllllllllllllIllIIlIlIlIIlI, String llllllllllllllllllIllIIlIlIlIIIl) {
        String llllllllllllllllllIllIIlIlIlIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllllIllIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIllIIlIlIIllll = llllllllllllllllllIllIIlIlIlIIIl.toCharArray();
        int llllllllllllllllllIllIIlIlIIlllI = llIIIIllll[2];
        char[] charArray = llllllllllllllllllIllIIlIlIlIIlI2.toCharArray();
        int length = charArray.length;
        int i = llIIIIllll[2];
        while (lIlIIlIIlIIIl(i, length)) {
            char llllllllllllllllllIllIIlIlIIIlIl = charArray[i];
            sb.append((char) (llllllllllllllllllIllIIlIlIIIlIl ^ llllllllllllllllllIllIIlIlIIllll[llllllllllllllllllIllIIlIlIIlllI % llllllllllllllllllIllIIlIlIIllll.length]));
            "".length();
            llllllllllllllllllIllIIlIlIIlllI++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIlIIlIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.RANGED), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17]) && lIlIIlIIlIIII(dc.isEmpty() ? 1 : 0) && lIlIIlIIlIlII(cG) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), llIIIIllll[42]) && lIlIIlIIlIlIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), llIIIIllll[36])) {
            String[] strArr = new String[llIIIIllll[0]];
            strArr[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[45]];
            if (lIlIIlIIlIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIIIIllll[0]];
                strArr2[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[46]];
                if (lIlIIlIIlIIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[llIIIIllll[0]];
                    strArr3[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[47]];
                    if (lIlIIlIIlIIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                        String[] strArr4 = new String[llIIIIllll[0]];
                        strArr4[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[48]];
                        if (lIlIIlIIlIIlI(Inventory.contains(strArr4) ? 1 : 0) && lIlIIlIIlIlIl(Skills.getLevel(Skill.SLAYER), llIIIIllll[7])) {
                            ?? r0 = llIIIIllll[0];
                            "".length();
                            return " ".length() < 0 ? ((83 ^ 85) ^ (104 ^ 73)) & (((10 ^ 52) ^ (29 ^ 4)) ^ (-" ".length())) : r0;
                        }
                    }
                }
            }
        }
        return llIIIIllll[2];
    }

    private static void lIlIIlIIIllll() {
        llIIIIllll = new int[51];
        llIIIIllll[0] = " ".length();
        llIIIIllll[1] = (19 ^ 27) ^ (135 ^ 138);
        llIIIIllll[2] = ((197 ^ 160) ^ (36 ^ 81)) & (((123 ^ 77) ^ (170 ^ 140)) ^ (-" ".length()));
        llIIIIllll[3] = "  ".length();
        llIIIIllll[4] = "   ".length();
        llIIIIllll[5] = 162 ^ 166;
        llIIIIllll[6] = (((105 + 159) - 243) + 153) ^ (((156 + 107) - 101) + 6);
        llIIIIllll[7] = 144 ^ 162;
        llIIIIllll[8] = (35 ^ 31) ^ (27 ^ 119);
        llIIIIllll[9] = (41 ^ 90) ^ (236 ^ 137);
        llIIIIllll[10] = (112 ^ 62) ^ (234 ^ 190);
        llIIIIllll[11] = 171 ^ 147;
        llIIIIllll[12] = 20 ^ 42;
        llIIIIllll[13] = 164 ^ 163;
        llIIIIllll[14] = 51 ^ 59;
        llIIIIllll[15] = (((158 + 44) - 158) + 126) ^ (((63 + 38) - 52) + 81);
        llIIIIllll[16] = (((56 + 134) - 71) + 30) ^ (((49 + 59) - 44) + 92);
        llIIIIllll[17] = (((144 + 151) - 237) + 131) ^ (((8 + 63) - 15) + 73);
        llIIIIllll[18] = (((82 + 37) - 107) + 134) ^ (((11 + 144) - 129) + 126);
        llIIIIllll[19] = (((139 + 109) - 142) + 39) ^ (((62 + 130) - 180) + 142);
        llIIIIllll[20] = ((4 + 187) - 101) + 150;
        llIIIIllll[21] = (139 ^ 150) ^ (35 ^ 50);
        llIIIIllll[22] = (34 ^ 111) ^ (56 ^ 51);
        llIIIIllll[23] = 54 ^ 59;
        llIIIIllll[24] = (-((-331) & 13274)) & (-2081) & 15343;
        llIIIIllll[25] = (88 ^ 50) ^ (245 ^ 145);
        llIIIIllll[26] = (7 ^ 42) ^ (72 ^ 106);
        llIIIIllll[27] = (94 ^ 25) ^ (100 ^ 51);
        llIIIIllll[28] = (31 ^ 16) ^ (222 ^ 192);
        llIIIIllll[29] = 68 ^ 86;
        llIIIIllll[30] = 81 ^ 66;
        llIIIIllll[31] = (((44 + 100) - 30) + 29) ^ (((109 + 71) - 36) + 11);
        llIIIIllll[32] = (44 ^ 30) ^ (161 ^ 134);
        llIIIIllll[33] = 161 ^ 182;
        llIIIIllll[34] = (138 ^ 147) ^ " ".length();
        llIIIIllll[35] = 99 ^ 122;
        llIIIIllll[36] = ((73 + 135) - 55) + 12;
        llIIIIllll[37] = (49 ^ 104) ^ (225 ^ 163);
        llIIIIllll[38] = (81 ^ 47) ^ (57 ^ 91);
        llIIIIllll[39] = (127 ^ 60) ^ (249 ^ 167);
        llIIIIllll[40] = 222 ^ 192;
        llIIIIllll[41] = 183 ^ 168;
        llIIIIllll[42] = ((56 + 5) - (-58)) + 19;
        llIIIIllll[43] = 224 ^ 192;
        llIIIIllll[44] = 220 ^ 184;
        llIIIIllll[45] = (131 ^ 138) ^ (233 ^ 193);
        llIIIIllll[46] = "   ".length() ^ (231 ^ 198);
        llIIIIllll[47] = (((156 + 91) - 128) + 66) ^ (((73 + 141) - 118) + 58);
        llIIIIllll[48] = 173 ^ 137;
        llIIIIllll[49] = 84 ^ 113;
        llIIIIllll[50] = (109 ^ 94) ^ (59 ^ 46);
    }

    private static void lIlIIlIIIlllI() {
        llIIIIllIl = new String[llIIIIllll[50]];
        llIIIIllIl[llIIIIllll[2]] = lIlIIlIIIlIlI("LQQvNw==", "CkARO");
        llIIIIllIl[llIIIIllll[0]] = lIlIIlIIIlIll("qc3pSzmuKZw6XnQpoSooAFegME/Pv65+", "lWECV");
        llIIIIllIl[llIIIIllll[3]] = lIlIIlIIIlIll("G1IdUYxSwZLAGCS31V2doA==", "RLAQS");
        llIIIIllIl[llIIIIllll[4]] = lIlIIlIIIlIlI("CQoZCyQ8FA==", "HmpgM");
        llIIIIllIl[llIIIIllll[5]] = lIlIIlIIIlIll("DTvQzEY3BKi864jhWf90nw==", "yMMfq");
        llIIIIllIl[llIIIIllll[1]] = lIlIIlIIIllII("v93k6mGTRCw=", "eyEef");
        llIIIIllIl[llIIIIllll[6]] = lIlIIlIIIlIlI("GQYnEjozGiE=", "ZtFtN");
        llIIIIllIl[llIIIIllll[13]] = lIlIIlIIIlIll("/oan5LWDX84HoA4PVjpVcw==", "EvWpK");
        llIIIIllIl[llIIIIllll[14]] = lIlIIlIIIlIlI("CA4QGTtlGwURMSsGGRc=", "EowpX");
        llIIIIllIl[llIIIIllll[16]] = lIlIIlIIIllII("PA7sXtjckfjXZKEvNVP8Zw==", "oJJuA");
        llIIIIllIl[llIIIIllll[18]] = lIlIIlIIIlIll("IBjD9OvGg7Qx2+I48+IROw==", "JcLUZ");
        llIIIIllIl[llIIIIllll[19]] = lIlIIlIIIlIll("mm/ZvD/lVAWJRqqJ7lvQEQ==", "UoIio");
        llIIIIllIl[llIIIIllll[21]] = lIlIIlIIIlIlI("Ix4oJQoOUCwpDAwVNSEYDw==", "bpAHk");
        llIIIIllIl[llIIIIllll[23]] = lIlIIlIIIllII("RjMtQIau+aTcXt3xxad9yQ==", "VDYTk");
        llIIIIllIl[llIIIIllll[25]] = lIlIIlIIIlIlI("DCMnBng3KmoGICgpOAo9Ni8vQ3BrZQ==", "XLJcX");
        llIIIIllIl[llIIIIllll[26]] = lIlIIlIIIllII("m1XmbKjku50yX498D0V1Ywu4wT9sGIcb", "CzhaU");
        llIIIIllIl[llIIIIllll[27]] = lIlIIlIIIlIlI("LgIPI3UVC0IjLQoIEC8wFA4HZn1LRA==", "zmbFU");
        llIIIIllIl[llIIIIllll[28]] = lIlIIlIIIllII("QFpt3tT79IA7pEu7kJZsx+L1vZtR5C3lW71x8SPKJyZRH3e9Fq6Cyg==", "MIEBU");
        llIIIIllIl[llIIIIllll[29]] = lIlIIlIIIlIlI("AxsqAXE4EmcBKScRNQ00ORciRHlkXQ==", "WtGdQ");
        llIIIIllIl[llIIIIllll[30]] = lIlIIlIIIllII("HL59J5SJRaBTg0BM0n5YCf0ha7m9CJqd", "WkwZU");
        llIIIIllIl[llIIIIllll[31]] = lIlIIlIIIllII("s8tsQdc4fPeW9p6sJDwr/335lOwhAW+X", "aMrsQ");
        llIIIIllIl[llIIIIllll[32]] = lIlIIlIIIllII("Vl12+/ATTdhLYSpXpJz3Og==", "WGQkB");
        llIIIIllIl[llIIIIllll[9]] = lIlIIlIIIlIll("WEmTQDIEGU0=", "GAvrz");
        llIIIIllIl[llIIIIllll[33]] = lIlIIlIIIlIlI("EgE8F2spCHEXMzYLIxsuKA00UmN1Rw==", "FnQrK");
        llIIIIllIl[llIIIIllll[34]] = lIlIIlIIIllII("3XQoxxMWaqu/Xh7wIfRrZQhrjBG2lgCY", "vRSXB");
        llIIIIllIl[llIIIIllll[35]] = lIlIIlIIIlIll("+rSQbxFW+c+t8UlqswFNWuiDhQLNJX6m", "StvVw");
        llIIIIllIl[llIIIIllll[10]] = lIlIIlIIIllII("/YTupGvlsAqsARIMTK6olO/j5/uxl2H2", "jieBa");
        llIIIIllIl[llIIIIllll[37]] = lIlIIlIIIlIlI("CXMTMRs8Nmc/DmgbKCAN", "HSGPh");
        llIIIIllIl[llIIIIllll[38]] = lIlIIlIIIlIll("M+9T+cNC22LT33uRZImtx2Tay55GlUWM", "tXSEL");
        llIIIIllIl[llIIIIllll[39]] = lIlIIlIIIlIlI("ESobFnUqI1YWLTUgBBowKyYTU313bA==", "EEvsU");
        llIIIIllIl[llIIIIllll[40]] = lIlIIlIIIlIll("SpajWE3ARXTtysk2LV5V0IpK3gJnhzqJ", "GUOeY");
        llIIIIllIl[llIIIIllll[41]] = lIlIIlIIIlIlI("Nzc1LU4MPngtFhM9KiELDTs9", "cXXHn");
        llIIIIllIl[llIIIIllll[43]] = lIlIIlIIIllII("mJMWX64aoIPhpA4DNLYNB+d5FfnHXuSP", "kaFzR");
        llIIIIllIl[llIIIIllll[45]] = lIlIIlIIIllII("pYEvtkq6LmtNdT+f+QMrUc85lVJhCe+r", "cnVGB");
        llIIIIllIl[llIIIIllll[46]] = lIlIIlIIIlIlI("BCU8AVM/LHEBCyAvIw0WPik0RFtjYw==", "PJQds");
        llIIIIllIl[llIIIIllll[47]] = lIlIIlIIIlIll("qRhUJBnrKxza67yYB93hiJSHsC8+r7NC", "AisIt");
        llIIIIllIl[llIIIIllll[48]] = lIlIIlIIIllII("MsRU8Rxl/7HcOk0shgPVeTty0Pg240PC", "znisF");
        llIIIIllIl[llIIIIllll[49]] = lIlIIlIIIlIll("IHJzh2HNjIM=", "DcJvp");
    }

    private static boolean lIlIIlIIlIlIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0c7d, code lost:
        if (lIlIIlIIlIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0f8b, code lost:
        if (lIlIIlIIlIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L319;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aW() {
        if (lIlIIlIIlIIII(dc.isEmpty() ? 1 : 0) && lIlIIlIIlIIIl(cG, llIIIIllll[0])) {
            InterfaceC0003ac[] interfaceC0003acArr = new InterfaceC0003ac[llIIIIllll[1]];
            interfaceC0003acArr[llIIIIllll[2]] = new P();
            interfaceC0003acArr[llIIIIllll[0]] = new Z();
            interfaceC0003acArr[llIIIIllll[3]] = new W();
            interfaceC0003acArr[llIIIIllll[4]] = new V();
            interfaceC0003acArr[llIIIIllll[5]] = new T();
            List asList = Arrays.asList(interfaceC0003acArr);
            InterfaceC0003ac[] interfaceC0003acArr2 = new InterfaceC0003ac[llIIIIllll[1]];
            interfaceC0003acArr2[llIIIIllll[2]] = new M();
            interfaceC0003acArr2[llIIIIllll[0]] = new A();
            interfaceC0003acArr2[llIIIIllll[3]] = new R();
            interfaceC0003acArr2[llIIIIllll[4]] = new C0001aa();
            interfaceC0003acArr2[llIIIIllll[5]] = new H();
            List asList2 = Arrays.asList(interfaceC0003acArr2);
            InterfaceC0003ac[] interfaceC0003acArr3 = new InterfaceC0003ac[llIIIIllll[4]];
            interfaceC0003acArr3[llIIIIllll[2]] = new G();
            interfaceC0003acArr3[llIIIIllll[0]] = new C0011ak();
            interfaceC0003acArr3[llIIIIllll[3]] = new C0036w();
            List asList3 = Arrays.asList(interfaceC0003acArr3);
            InterfaceC0003ac[] interfaceC0003acArr4 = new InterfaceC0003ac[llIIIIllll[6]];
            interfaceC0003acArr4[llIIIIllll[2]] = new at();
            interfaceC0003acArr4[llIIIIllll[0]] = new C0004ad();
            interfaceC0003acArr4[llIIIIllll[3]] = new C0006af();
            interfaceC0003acArr4[llIIIIllll[4]] = new ao();
            interfaceC0003acArr4[llIIIIllll[5]] = new E();
            interfaceC0003acArr4[llIIIIllll[1]] = new C0014an();
            List asList4 = Arrays.asList(interfaceC0003acArr4);
            InterfaceC0003ac[] interfaceC0003acArr5 = new InterfaceC0003ac[llIIIIllll[3]];
            interfaceC0003acArr5[llIIIIllll[2]] = new C0007ag();
            interfaceC0003acArr5[llIIIIllll[0]] = new D();
            List asList5 = Arrays.asList(interfaceC0003acArr5);
            InterfaceC0003ac[] interfaceC0003acArr6 = new InterfaceC0003ac[llIIIIllll[1]];
            interfaceC0003acArr6[llIIIIllll[2]] = new C0010aj();
            interfaceC0003acArr6[llIIIIllll[0]] = new C0009ai();
            interfaceC0003acArr6[llIIIIllll[3]] = new C0036w();
            interfaceC0003acArr6[llIIIIllll[4]] = new au();
            interfaceC0003acArr6[llIIIIllll[5]] = new C0038y();
            List asList6 = Arrays.asList(interfaceC0003acArr6);
            InterfaceC0003ac[] interfaceC0003acArr7 = new InterfaceC0003ac[llIIIIllll[3]];
            interfaceC0003acArr7[llIIIIllll[2]] = new aq();
            interfaceC0003acArr7[llIIIIllll[0]] = new ar();
            List asList7 = Arrays.asList(interfaceC0003acArr7);
            Collections.shuffle(asList);
            Collections.shuffle(asList2);
            Collections.shuffle(asList3);
            Collections.shuffle(asList4);
            Collections.shuffle(asList5);
            Collections.shuffle(asList6);
            Collections.shuffle(asList7);
            dc.addAll(asList);
            "".length();
            dc.add(new O());
            "".length();
            dc.addAll(asList2);
            "".length();
            dc.add(new U());
            "".length();
            dc.add(new C0008ah());
            "".length();
            dc.addAll(asList3);
            "".length();
            dc.addAll(asList4);
            "".length();
            dc.addAll(asList5);
            "".length();
            dc.addAll(asList6);
            "".length();
            dc.addAll(asList7);
            "".length();
            dc.add(new C0035v());
            "".length();
            dc.add(new L());
            "".length();
            cG += llIIIIllll[0];
            if (lIlIIlIIlIIlI(dc.isEmpty() ? 1 : 0)) {
                if (lIlIIlIIlIIII(dd ? 1 : 0)) {
                    Collections.shuffle(dc);
                }
                System.out.println("Switching to : " + dc.get(llIIIIllll[2]).ag());
                h = dc.get(llIIIIllll[2]).ag();
            }
        }
        while (lIlIIlIIlIIlI(dc.isEmpty() ? 1 : 0) && lIlIIlIIlIIlI(AccBuilderSotf.d ? 1 : 0)) {
            if (lIlIIlIIlIIll(Game.getState(), GameState.LOGGED_IN)) {
                if (lIlIIlIIlIIII(dc.get(llIIIIllll[2]).ah() ? 1 : 0)) {
                    AccBuilderSotf.f += llIIIIllll[0];
                    System.out.println("Achieved " + dc.get(llIIIIllll[2]).ag() + " goal");
                    dc.remove(llIIIIllll[2]);
                    "".length();
                    if (lIlIIlIIlIIlI(dc.isEmpty() ? 1 : 0)) {
                        System.out.println("Switching to : " + dc.get(llIIIIllll[2]).ag());
                        h = dc.get(llIIIIllll[2]).ag();
                    }
                    if (lIlIIlIIlIIII(dc.isEmpty() ? 1 : 0)) {
                        h = llIIIIllIl[llIIIIllll[2]];
                    }
                    Time.sleepTicks(llIIIIllll[5]);
                    "".length();
                }
                if (lIlIIlIIlIIll(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIlIIlIIlIIII(C0018e.z() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIllIl[llIIIIllll[0]];
                        C0018e.A();
                        Time.sleepTicks(llIIIIllll[0]);
                        "".length();
                        "".length();
                        if (((134 ^ 158) & ((16 ^ 8) ^ (-1))) < (-" ".length())) {
                            return;
                        }
                    }
                    AccBuilderSotf.l = dc.get(llIIIIllll[2]).ag();
                    Time.sleep(dc.get(llIIIIllll[2]).af());
                    "".length();
                    Time.sleep(C0018e.c(llIIIIllll[7], llIIIIllll[8]));
                    "".length();
                }
                C0018e.G();
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
        }
        if (lIlIIlIIlIIII(dc.isEmpty() ? 1 : 0) && lIlIIlIIlIlII(cG)) {
            if (lIlIIlIIlIIIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[3]];
                aE.gm();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[4]];
                av.eA();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[5]];
                aw.eH();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.MINING), llIIIIllll[9])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[1]];
                aC.fQ();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[6]];
                ay.fi();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[13]];
                aF.gs();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[14]];
                C0026m.ak();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[16]];
                aB.fL();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[18]];
                aA.fv();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.RANGED), llIIIIllll[7])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[19]];
                C0027n.aA();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.RANGED), llIIIIllll[7]) && lIlIIlIIlIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[21]];
                C0036w.bf();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.RANGED), llIIIIllll[7]) && lIlIIlIIlIIIl(Skills.getLevel(Skill.RANGED), llIIIIllll[22]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20])) {
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[23]];
                C0027n.aA();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.RANGED), llIIIIllll[22]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20])) {
                if (lIlIIlIIlIlIl(Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24])) {
                    String[] strArr = new String[llIIIIllll[0]];
                    strArr[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[25]];
                    if (lIlIIlIIlIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[llIIIIllll[0]];
                        strArr2[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[26]];
                        if (lIlIIlIIlIIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[llIIIIllll[0]];
                            strArr3[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[27]];
                        }
                    }
                }
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[28]];
                C0038y.bl();
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.RANGED), llIIIIllll[22]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24])) {
                String[] strArr4 = new String[llIIIIllll[0]];
                strArr4[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[29]];
                if (lIlIIlIIlIIlI(Inventory.contains(strArr4) ? 1 : 0)) {
                    String[] strArr5 = new String[llIIIIllll[0]];
                    strArr5[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[30]];
                    if (lIlIIlIIlIIlI(Inventory.contains(strArr5) ? 1 : 0)) {
                        String[] strArr6 = new String[llIIIIllll[0]];
                        strArr6[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[31]];
                        if (lIlIIlIIlIIlI(Inventory.contains(strArr6) ? 1 : 0) && lIlIIlIIlIIIl(Skills.getLevel(Skill.SLAYER), llIIIIllll[7])) {
                            AccBuilderSotf.l = llIIIIllIl[llIIIIllll[32]];
                            ar.t(llIIIIllIl[llIIIIllll[9]]);
                            ar.gb();
                        }
                    }
                }
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.RANGED), llIIIIllll[22]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24])) {
                String[] strArr7 = new String[llIIIIllll[0]];
                strArr7[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[33]];
                if (lIlIIlIIlIIlI(Inventory.contains(strArr7) ? 1 : 0)) {
                    String[] strArr8 = new String[llIIIIllll[0]];
                    strArr8[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[34]];
                    if (lIlIIlIIlIIlI(Inventory.contains(strArr8) ? 1 : 0)) {
                        String[] strArr9 = new String[llIIIIllll[0]];
                        strArr9[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[35]];
                        if (lIlIIlIIlIIlI(Inventory.contains(strArr9) ? 1 : 0) && lIlIIlIIlIlIl(Skills.getLevel(Skill.SLAYER), llIIIIllll[7])) {
                            if (lIlIIlIIlIlIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), llIIIIllll[36])) {
                                String[] strArr10 = new String[llIIIIllll[0]];
                                strArr10[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[10]];
                            }
                            AccBuilderSotf.l = llIIIIllIl[llIIIIllll[37]];
                            C0035v.aZ();
                        }
                    }
                }
            }
            if (lIlIIlIIlIlIl(Skills.getLevel(Skill.THIEVING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.AGILITY), llIIIIllll[10]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CONSTRUCTION), llIIIIllll[1]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MINING), llIIIIllll[9]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.CRAFTING), llIIIIllll[11]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.WOODCUTTING), llIIIIllll[12]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.MAGIC), llIIIIllll[7]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.HERBLORE), llIIIIllll[15]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.FLETCHING), llIIIIllll[17]) && lIlIIlIIlIlIl(Skills.getLevel(Skill.RANGED), llIIIIllll[22]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20]) && lIlIIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24])) {
                String[] strArr11 = new String[llIIIIllll[0]];
                strArr11[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[38]];
                if (lIlIIlIIlIIlI(Inventory.contains(strArr11) ? 1 : 0)) {
                    String[] strArr12 = new String[llIIIIllll[0]];
                    strArr12[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[39]];
                    if (lIlIIlIIlIIlI(Inventory.contains(strArr12) ? 1 : 0)) {
                        String[] strArr13 = new String[llIIIIllll[0]];
                        strArr13[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[40]];
                        if (lIlIIlIIlIIlI(Inventory.contains(strArr13) ? 1 : 0) && lIlIIlIIlIlIl(Skills.getLevel(Skill.SLAYER), llIIIIllll[7]) && lIlIIlIIlIlIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), llIIIIllll[36])) {
                            String[] strArr14 = new String[llIIIIllll[0]];
                            strArr14[llIIIIllll[2]] = llIIIIllIl[llIIIIllll[41]];
                            if (lIlIIlIIlIIlI(Inventory.contains(strArr14) ? 1 : 0) && lIlIIlIIlIIIl(Vars.getBit(QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), llIIIIllll[42])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[43]];
                                L.cB();
                            }
                        }
                    }
                }
            }
        }
    }
}
