package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.S  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/S.class */
public class S implements K {
    public static /* synthetic */ WorldArea cH;
    private static /* synthetic */ String[] lIllIIllII;
    public static /* synthetic */ WorldPoint cJ;
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ WorldPoint cI;
    public static /* synthetic */ int[] cE;
    public static /* synthetic */ WorldArea cF;
    public static /* synthetic */ WorldArea cG;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIllIIllIl;
    public static /* synthetic */ WorldPoint ce;

    private static void lIIlIllllIlIl() {
        lIllIIllIl = new int[74];
        lIllIIllIl[0] = (44 ^ 57) & ((159 ^ 138) ^ (-1));
        lIllIIllIl[1] = " ".length();
        lIllIIllIl[2] = 14 ^ 16;
        lIllIIllIl[3] = 68 ^ 118;
        lIllIIllIl[4] = "  ".length();
        lIllIIllIl[5] = "   ".length();
        lIllIIllIl[6] = (-"  ".length()) & (-26695) & 31695;
        lIllIIllIl[7] = " ".length() ^ (73 ^ 76);
        lIllIIllIl[8] = (-((-4297) & 29897)) & (-4097) & 30691;
        lIllIIllIl[9] = (-((-941) & 4031)) & (-24582) & 28671;
        lIllIIllIl[10] = (-24721) & 32727;
        lIllIIllIl[11] = (((150 + 150) - 134) + 26) ^ (((85 + 55) - 95) + 152);
        lIllIIllIl[12] = (-((-73) & 14025)) & (-18433) & 32763;
        lIllIIllIl[13] = (189 ^ 139) ^ (53 ^ 103);
        lIllIIllIl[14] = 190 ^ 177;
        lIllIIllIl[15] = (87 ^ 92) ^ (59 ^ 54);
        lIllIIllIl[16] = 100 ^ 99;
        lIllIIllIl[17] = (-((-529) & 6869)) & (-16385) & 24055;
        lIllIIllIl[18] = (-((-17381) & 23533)) & (-17027) & 24511;
        lIllIIllIl[19] = (6 ^ 80) ^ (207 ^ 145);
        lIllIIllIl[20] = (32 ^ 28) ^ (165 ^ 141);
        lIllIIllIl[21] = 46 ^ 6;
        lIllIIllIl[22] = 70 ^ 79;
        lIllIIllIl[23] = (48 ^ 121) ^ (244 ^ 183);
        lIllIIllIl[24] = 165 ^ 174;
        lIllIIllIl[25] = 69 ^ 73;
        lIllIIllIl[26] = (159 ^ 131) ^ (110 ^ 127);
        lIllIIllIl[27] = (((10 + 137) - 127) + 136) ^ (((95 + 121) - 112) + 42);
        lIllIIllIl[28] = "   ".length() ^ (156 ^ 143);
        lIllIIllIl[29] = (((116 + 56) - 92) + 88) ^ (((86 + 114) - 126) + 111);
        lIllIIllIl[30] = -" ".length();
        lIllIIllIl[31] = (-10145) & 38873022;
        lIllIIllIl[32] = (((98 + 95) - 94) + 66) ^ (((57 + 85) - (-20)) + 21);
        lIllIIllIl[33] = (133 ^ 177) ^ (150 ^ 177);
        lIllIIllIl[34] = (108 ^ 6) ^ (((25 + 96) - 71) + 77);
        lIllIIllIl[35] = 5 ^ 19;
        lIllIIllIl[36] = 213 ^ 194;
        lIllIIllIl[37] = 0 ^ 24;
        lIllIIllIl[38] = 123 ^ 98;
        lIllIIllIl[39] = 123 ^ 97;
        lIllIIllIl[40] = (((69 + 22) - 44) + 83) ^ (((8 + 31) - (-33)) + 81);
        lIllIIllIl[41] = (((69 + 104) - 35) + 28) ^ (((47 + 55) - 24) + 108);
        lIllIIllIl[42] = (-((-16589) & 21487)) & (-18501) & 24559;
        lIllIIllIl[43] = 38 ^ 59;
        lIllIIllIl[44] = (-23173) & 24295;
        lIllIIllIl[45] = (-((-4609) & 29583)) & (-2113) & 28159;
        lIllIIllIl[46] = 106 ^ 117;
        lIllIIllIl[47] = (-((-19333) & 23509)) & (-25345) & 30719;
        lIllIIllIl[48] = (((140 + 100) - 173) + 89) ^ (((100 + 69) - 133) + 152);
        lIllIIllIl[49] = (-((-6313) & 14575)) & (-16402) & 26367;
        lIllIIllIl[50] = (4 ^ 65) ^ (124 ^ 24);
        lIllIIllIl[51] = (-((-2350) & 6447)) & (-16513) & 31735;
        lIllIIllIl[52] = (71 ^ 51) ^ (39 ^ 113);
        lIllIIllIl[53] = (-((-2569) & 6731)) & (-26657) & 31718;
        lIllIIllIl[54] = (-(147 ^ 148)) & (-49) & 8062;
        lIllIIllIl[55] = (-((-1) & 30467)) & (-5) & 65470;
        lIllIIllIl[56] = (-((-24881) & 29492)) & (-3153) & 32763;
        lIllIIllIl[57] = (-((-421) & 30637)) & (-2052) & 32767;
        lIllIIllIl[58] = (-16708) & 31707;
        lIllIIllIl[59] = (((103 + 43) - 119) + 129) ^ (((120 + 14) - 121) + 178);
        lIllIIllIl[60] = (((177 + 101) - 113) + 65) ^ (((31 + 105) - 102) + 160);
        lIllIIllIl[61] = (-4391) & 7615;
        lIllIIllIl[62] = (-28677) & 31966;
        lIllIIllIl[63] = (-((-17967) & 30319)) & (-771) & 16366;
        lIllIIllIl[64] = (-12809) & 16088;
        lIllIIllIl[65] = (-((-23681) & 24453)) & (-8203) & 12159;
        lIllIIllIl[66] = (-12929) & 16095;
        lIllIIllIl[67] = 76 ^ 124;
        lIllIIllIl[68] = (-((-17005) & 21375)) & (-8289) & 15871;
        lIllIIllIl[69] = (-4225) & 7405;
        lIllIIllIl[70] = (-((-3285) & 7637)) & (-16905) & 24510;
        lIllIIllIl[71] = (-((-209) & 29681)) & (-1) & 32703;
        lIllIIllIl[72] = (-((-18905) & 31711)) & (-18) & 16119;
        lIllIIllIl[73] = 99 ^ 70;
    }

    public static void O() {
        int[] iArr = new int[lIllIIllIl[1]];
        iArr[lIllIIllIl[0]] = lIllIIllIl[10];
        if (lIIlIlllllIIl(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[10], lIllIIllIl[21], lIllIIllIl[53]));
            "".length();
        }
        int[] iArr2 = new int[lIllIIllIl[1]];
        iArr2[lIllIIllIl[0]] = lIllIIllIl[54];
        if (lIIlIlllllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[54], lIllIIllIl[11], lIllIIllIl[53]));
            "".length();
        }
        int[] iArr3 = new int[lIllIIllIl[1]];
        iArr3[lIllIIllIl[0]] = lIllIIllIl[51];
        if (lIIlIlllllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[51], lIllIIllIl[1], lIllIIllIl[55]));
            "".length();
        }
        int[] iArr4 = new int[lIllIIllIl[1]];
        iArr4[lIllIIllIl[0]] = lIllIIllIl[49];
        if (lIIlIlllllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[49], lIllIIllIl[1], lIllIIllIl[56]));
            "".length();
        }
        int[] iArr5 = new int[lIllIIllIl[1]];
        iArr5[lIllIIllIl[0]] = lIllIIllIl[12];
        if (lIIlIlllllIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[12], lIllIIllIl[13], lIllIIllIl[57]));
            "".length();
        }
        int[] iArr6 = new int[lIllIIllIl[1]];
        iArr6[lIllIIllIl[0]] = lIllIIllIl[42];
        if (lIIlIlllllIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[42], lIllIIllIl[1], lIllIIllIl[58]));
            "".length();
        }
        int[] iArr7 = new int[lIllIIllIl[1]];
        iArr7[lIllIIllIl[0]] = lIllIIllIl[45];
        if (lIIlIlllllIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[45], lIllIIllIl[1], lIllIIllIl[58]));
            "".length();
        }
        int[] iArr8 = new int[lIllIIllIl[1]];
        iArr8[lIllIIllIl[0]] = lIllIIllIl[47];
        if (lIIlIlllllIIl(Bank.contains(iArr8) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[47], lIllIIllIl[1], lIllIIllIl[58]));
            "".length();
        }
        int[] iArr9 = new int[lIllIIllIl[1]];
        iArr9[lIllIIllIl[0]] = lIllIIllIl[44];
        if (lIIlIlllllIIl(Bank.contains(iArr9) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[44], lIllIIllIl[1], lIllIIllIl[58]));
            "".length();
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21])) {
            int[] iArr10 = new int[lIllIIllIl[1]];
            iArr10[lIllIIllIl[0]] = lIllIIllIl[18];
            if (lIIlIlllllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                bp.add(new C0003d(lIllIIllIl[18], lIllIIllIl[1], lIllIIllIl[56]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIllIIllIl[1]];
        iArr11[lIllIIllIl[0]] = lIllIIllIl[17];
        if (lIIlIlllllIIl(Bank.contains(iArr11) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIllIl[17], lIllIIllIl[1], lIllIIllIl[58]));
            "".length();
        }
    }

    private static boolean lIIlIlllllIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIllllIlll(int i) {
        return i != 0;
    }

    public static void aM() {
        if (lIIlIlllllIII(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[23]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[23]) && lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[23]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[23]) && lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[23]) && lIIlIlllllIII(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[23]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIIlIlllllIII(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[20]) && lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[23]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[23]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[20]) && lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[20]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[23]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[20]) && lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[20]) && lIIlIlllllIII(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[20]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIIlIlllllIII(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[2]) && lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[20]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[20]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[2]) && lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[2]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[20]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[2]) && lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[2]) && lIIlIlllllIII(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[2]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIIlIlllllIII(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[21]) && lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[2]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[2]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[21]) && lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[2]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIIlIlllllIII(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[3]) && lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[2]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[3]) && lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[3]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[2]) && lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
    }

    private static boolean lIIlIlllllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIllllllII(int i) {
        return i > 0;
    }

    private static boolean lIIlIlllllIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIIllIl[0];
    }

    private static boolean lIIlIlllllIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIllllIIll(String lllllllllllllllllllIIIlllllIIIIl, String lllllllllllllllllllIIIlllllIIIII) {
        try {
            SecretKeySpec lllllllllllllllllllIIIlllllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIllIl[4], lllllllllllllllllllIIIlllllIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIlllllIIIlI) {
            lllllllllllllllllllIIIlllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllllIl(int i) {
        return i < 0;
    }

    private static int lIIlIllllIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIIlIllllIIlI(String lllllllllllllllllllIIIllllIlIIIl, String lllllllllllllllllllIIIllllIlIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIIllllIlIIII.toCharArray();
        int lllllllllllllllllllIIIllllIIllIl = lIllIIllIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIllIl[0];
        while (lIIlIlllllIII(i, length)) {
            char lllllllllllllllllllIIIllllIlIIlI = charArray2[i];
            sb.append((char) (lllllllllllllllllllIIIllllIlIIlI ^ charArray[lllllllllllllllllllIIIllllIIllIl % charArray.length]));
            "".length();
            lllllllllllllllllllIIIllllIIllIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[3]) && lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[3]) && lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[2])) {
            ?? r0 = lIllIIllIl[1];
            "".length();
            return (-((((181 + 7) - 18) + 14) ^ (((122 + 105) - 159) + 121))) >= 0 ? ((70 ^ 63) ^ (66 ^ 23)) & (((((9 + 106) - 11) + 30) ^ (((150 + 96) - 104) + 28)) ^ (-" ".length())) : r0;
        }
        return lIllIIllIl[0];
    }

    private static String lIIlIllllIIIl(String lllllllllllllllllllIIIlllIllllII, String lllllllllllllllllllIIIlllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlllIlllIll.getBytes(StandardCharsets.UTF_8)), lIllIIllIl[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIllIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIlllIllllIl) {
            lllllllllllllllllllIIIlllIllllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0571, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05a8, code lost:
        return h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.S.lIllIIllIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0114, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016b, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c2, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0219, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0270, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02aa, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d8, code lost:
        return h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.S.lIllIIllIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x032d, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0384, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03db, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0432, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0489, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04e0, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0537, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aL() {
        if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21])) {
            int[] iArr = new int[lIllIIllIl[1]];
            iArr[lIllIIllIl[0]] = lIllIIllIl[18];
            if (lIIlIlllllIIl(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllIIllIl[1]];
                iArr2[lIllIIllIl[0]] = lIllIIllIl[18];
                if (lIIlIlllllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllIIllIl[1]];
                    iArr3[lIllIIllIl[0]] = lIllIIllIl[18];
                }
            }
            int[] iArr4 = new int[lIllIIllIl[1]];
            iArr4[lIllIIllIl[0]] = lIllIIllIl[44];
            if (lIIlIlllllIIl(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lIllIIllIl[1]];
                iArr5[lIllIIllIl[0]] = lIllIIllIl[44];
                if (lIIlIlllllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIllIIllIl[1]];
                    iArr6[lIllIIllIl[0]] = lIllIIllIl[44];
                }
            }
            int[] iArr7 = new int[lIllIIllIl[1]];
            iArr7[lIllIIllIl[0]] = lIllIIllIl[45];
            if (lIIlIlllllIIl(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIllIIllIl[1]];
                iArr8[lIllIIllIl[0]] = lIllIIllIl[45];
                if (lIIlIlllllIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIllIIllIl[1]];
                    iArr9[lIllIIllIl[0]] = lIllIIllIl[45];
                }
            }
            int[] iArr10 = new int[lIllIIllIl[1]];
            iArr10[lIllIIllIl[0]] = lIllIIllIl[42];
            if (lIIlIlllllIIl(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIllIIllIl[1]];
                iArr11[lIllIIllIl[0]] = lIllIIllIl[42];
                if (lIIlIlllllIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIllIIllIl[1]];
                    iArr12[lIllIIllIl[0]] = lIllIIllIl[42];
                }
            }
            int[] iArr13 = new int[lIllIIllIl[1]];
            iArr13[lIllIIllIl[0]] = lIllIIllIl[47];
            if (lIIlIlllllIIl(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIllIIllIl[1]];
                iArr14[lIllIIllIl[0]] = lIllIIllIl[47];
                if (lIIlIlllllIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIllIIllIl[1]];
                    iArr15[lIllIIllIl[0]] = lIllIIllIl[47];
                }
            }
            int[] iArr16 = new int[lIllIIllIl[1]];
            iArr16[lIllIIllIl[0]] = lIllIIllIl[49];
            if (lIIlIlllllIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIllIIllIl[1]];
                iArr17[lIllIIllIl[0]] = lIllIIllIl[49];
                if (lIIlIlllllIIl(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIllIIllIl[1]];
                    iArr18[lIllIIllIl[0]] = lIllIIllIl[49];
                }
            }
            int[] iArr19 = new int[lIllIIllIl[1]];
            iArr19[lIllIIllIl[0]] = lIllIIllIl[51];
            if (lIIlIlllllIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIllIIllIl[1]];
                iArr20[lIllIIllIl[0]] = lIllIIllIl[51];
                if (lIIlIlllllIIl(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIllIIllIl[1]];
                    iArr21[lIllIIllIl[0]] = lIllIIllIl[51];
                }
            }
            int[] iArr22 = new int[lIllIIllIl[1]];
            iArr22[lIllIIllIl[0]] = lIllIIllIl[12];
            if (lIIlIlllllIIl(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIllIIllIl[1]];
                iArr23[lIllIIllIl[0]] = lIllIIllIl[12];
            }
            ?? r0 = lIllIIllIl[1];
            "".length();
            return "   ".length() != "   ".length() ? "  ".length() & ("  ".length() ^ (-1)) : r0;
        }
        int[] iArr24 = new int[lIllIIllIl[1]];
        iArr24[lIllIIllIl[0]] = lIllIIllIl[17];
        if (lIIlIlllllIIl(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lIllIIllIl[1]];
            iArr25[lIllIIllIl[0]] = lIllIIllIl[17];
            if (lIIlIlllllIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[lIllIIllIl[1]];
                iArr26[lIllIIllIl[0]] = lIllIIllIl[17];
            }
        }
        int[] iArr27 = new int[lIllIIllIl[1]];
        iArr27[lIllIIllIl[0]] = lIllIIllIl[44];
        if (lIIlIlllllIIl(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[lIllIIllIl[1]];
            iArr28[lIllIIllIl[0]] = lIllIIllIl[44];
            if (lIIlIlllllIIl(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[lIllIIllIl[1]];
                iArr29[lIllIIllIl[0]] = lIllIIllIl[44];
            }
        }
        int[] iArr30 = new int[lIllIIllIl[1]];
        iArr30[lIllIIllIl[0]] = lIllIIllIl[45];
        if (lIIlIlllllIIl(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[lIllIIllIl[1]];
            iArr31[lIllIIllIl[0]] = lIllIIllIl[45];
            if (lIIlIlllllIIl(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lIllIIllIl[1]];
                iArr32[lIllIIllIl[0]] = lIllIIllIl[45];
            }
        }
        int[] iArr33 = new int[lIllIIllIl[1]];
        iArr33[lIllIIllIl[0]] = lIllIIllIl[42];
        if (lIIlIlllllIIl(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[lIllIIllIl[1]];
            iArr34[lIllIIllIl[0]] = lIllIIllIl[42];
            if (lIIlIlllllIIl(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[lIllIIllIl[1]];
                iArr35[lIllIIllIl[0]] = lIllIIllIl[42];
            }
        }
        int[] iArr36 = new int[lIllIIllIl[1]];
        iArr36[lIllIIllIl[0]] = lIllIIllIl[47];
        if (lIIlIlllllIIl(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[lIllIIllIl[1]];
            iArr37[lIllIIllIl[0]] = lIllIIllIl[47];
            if (lIIlIlllllIIl(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[lIllIIllIl[1]];
                iArr38[lIllIIllIl[0]] = lIllIIllIl[47];
            }
        }
        int[] iArr39 = new int[lIllIIllIl[1]];
        iArr39[lIllIIllIl[0]] = lIllIIllIl[49];
        if (lIIlIlllllIIl(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[lIllIIllIl[1]];
            iArr40[lIllIIllIl[0]] = lIllIIllIl[49];
            if (lIIlIlllllIIl(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lIllIIllIl[1]];
                iArr41[lIllIIllIl[0]] = lIllIIllIl[49];
            }
        }
        int[] iArr42 = new int[lIllIIllIl[1]];
        iArr42[lIllIIllIl[0]] = lIllIIllIl[51];
        if (lIIlIlllllIIl(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[lIllIIllIl[1]];
            iArr43[lIllIIllIl[0]] = lIllIIllIl[51];
            if (lIIlIlllllIIl(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[lIllIIllIl[1]];
                iArr44[lIllIIllIl[0]] = lIllIIllIl[51];
            }
        }
        int[] iArr45 = new int[lIllIIllIl[1]];
        iArr45[lIllIIllIl[0]] = lIllIIllIl[12];
        if (lIIlIlllllIIl(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[lIllIIllIl[1]];
            iArr46[lIllIIllIl[0]] = lIllIIllIl[12];
        }
        ?? r02 = lIllIIllIl[1];
        "".length();
        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
    }

    private static boolean lIIllIIIIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f7, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0131, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016b, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a5, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0228, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0262, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x029c, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d6, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0310, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x034a, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0384, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aK() {
        if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21])) {
            int[] iArr = new int[lIllIIllIl[1]];
            iArr[lIllIIllIl[0]] = lIllIIllIl[18];
            if (lIIlIlllllIIl(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllIIllIl[1]];
                iArr2[lIllIIllIl[0]] = lIllIIllIl[18];
            }
            int[] iArr3 = new int[lIllIIllIl[1]];
            iArr3[lIllIIllIl[0]] = lIllIIllIl[44];
            if (lIIlIlllllIIl(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIllIIllIl[1]];
                iArr4[lIllIIllIl[0]] = lIllIIllIl[44];
            }
            int[] iArr5 = new int[lIllIIllIl[1]];
            iArr5[lIllIIllIl[0]] = lIllIIllIl[45];
            if (lIIlIlllllIIl(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIllIIllIl[1]];
                iArr6[lIllIIllIl[0]] = lIllIIllIl[45];
            }
            int[] iArr7 = new int[lIllIIllIl[1]];
            iArr7[lIllIIllIl[0]] = lIllIIllIl[42];
            if (lIIlIlllllIIl(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIllIIllIl[1]];
                iArr8[lIllIIllIl[0]] = lIllIIllIl[42];
            }
            int[] iArr9 = new int[lIllIIllIl[1]];
            iArr9[lIllIIllIl[0]] = lIllIIllIl[47];
            if (lIIlIlllllIIl(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIllIIllIl[1]];
                iArr10[lIllIIllIl[0]] = lIllIIllIl[47];
            }
            int[] iArr11 = new int[lIllIIllIl[1]];
            iArr11[lIllIIllIl[0]] = lIllIIllIl[49];
            if (lIIlIlllllIIl(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIllIIllIl[1]];
                iArr12[lIllIIllIl[0]] = lIllIIllIl[49];
            }
            int[] iArr13 = new int[lIllIIllIl[1]];
            iArr13[lIllIIllIl[0]] = lIllIIllIl[51];
            if (lIIlIlllllIIl(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIllIIllIl[1]];
                iArr14[lIllIIllIl[0]] = lIllIIllIl[51];
            }
            int[] iArr15 = new int[lIllIIllIl[1]];
            iArr15[lIllIIllIl[0]] = lIllIIllIl[12];
            if (lIIlIllllIlll(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = lIllIIllIl[1];
                "".length();
                return "  ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIllIl[0];
        }
        int[] iArr16 = new int[lIllIIllIl[1]];
        iArr16[lIllIIllIl[0]] = lIllIIllIl[17];
        if (lIIlIlllllIIl(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIllIIllIl[1]];
            iArr17[lIllIIllIl[0]] = lIllIIllIl[17];
        }
        int[] iArr18 = new int[lIllIIllIl[1]];
        iArr18[lIllIIllIl[0]] = lIllIIllIl[44];
        if (lIIlIlllllIIl(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIllIIllIl[1]];
            iArr19[lIllIIllIl[0]] = lIllIIllIl[44];
        }
        int[] iArr20 = new int[lIllIIllIl[1]];
        iArr20[lIllIIllIl[0]] = lIllIIllIl[45];
        if (lIIlIlllllIIl(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[lIllIIllIl[1]];
            iArr21[lIllIIllIl[0]] = lIllIIllIl[45];
        }
        int[] iArr22 = new int[lIllIIllIl[1]];
        iArr22[lIllIIllIl[0]] = lIllIIllIl[42];
        if (lIIlIlllllIIl(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[lIllIIllIl[1]];
            iArr23[lIllIIllIl[0]] = lIllIIllIl[42];
        }
        int[] iArr24 = new int[lIllIIllIl[1]];
        iArr24[lIllIIllIl[0]] = lIllIIllIl[47];
        if (lIIlIlllllIIl(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lIllIIllIl[1]];
            iArr25[lIllIIllIl[0]] = lIllIIllIl[47];
        }
        int[] iArr26 = new int[lIllIIllIl[1]];
        iArr26[lIllIIllIl[0]] = lIllIIllIl[49];
        if (lIIlIlllllIIl(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[lIllIIllIl[1]];
            iArr27[lIllIIllIl[0]] = lIllIIllIl[49];
        }
        int[] iArr28 = new int[lIllIIllIl[1]];
        iArr28[lIllIIllIl[0]] = lIllIIllIl[51];
        if (lIIlIlllllIIl(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[lIllIIllIl[1]];
            iArr29[lIllIIllIl[0]] = lIllIIllIl[51];
        }
        int[] iArr30 = new int[lIllIIllIl[1]];
        iArr30[lIllIIllIl[0]] = lIllIIllIl[12];
        if (lIIlIllllIlll(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = lIllIIllIl[1];
            "".length();
            return ((55 ^ 114) & ((195 ^ 134) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r02;
        }
        return lIllIIllIl[0];
    }

    private static boolean lIIllIIIIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0275, code lost:
        if (lIIlIllllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aH() {
        if (lIIlIllllIlll(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[0]];
            C0001b.a(bp);
            if (lIIlIlllllIII(bp.size(), lIllIIllIl[1])) {
                System.out.println(lIllIIllII[lIllIIllIl[1]]);
                bn = lIllIIllIl[0];
            }
        }
        if (lIIlIlllllIIl(bn ? 1 : 0)) {
            if (lIIlIlllllIIl(aK() ? 1 : 0) && (!lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[2]) || !lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[3]) || lIIlIlllllIII(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[3]))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIlllllIll(nearest) && lIIlIlllllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIllII[lIllIIllIl[4]];
                    C0000a.a(nearest);
                }
                if (lIIlIlllllIll(nearest) && lIIlIllllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIllII[lIllIIllIl[5]];
                    if (lIIlIlllllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIllIl[6]);
                        "".length();
                    }
                    if (lIIlIllllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIllllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIIllIl[1]);
                            "".length();
                        }
                        if (lIIlIllllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIIllIl[4]);
                            "".length();
                        }
                        if (lIIlIlllllIIl(aL() ? 1 : 0)) {
                            O();
                            System.out.println(lIllIIllII[lIllIIllIl[7]]);
                            bn = lIllIIllIl[1];
                            return;
                        }
                        C0000a.a(cE, lIllIIllIl[1]);
                        C0000a.a(lIllIIllIl[8], lIllIIllIl[9]);
                        C0000a.b(C0005f.aU, lIllIIllIl[1]);
                        C0000a.a(lIllIIllIl[10], lIllIIllIl[11]);
                        C0000a.a(lIllIIllIl[12], lIllIIllIl[13]);
                    }
                }
            }
            if (lIIlIllllIlll(aK() ? 1 : 0)) {
                aJ();
                if (lIIlIlllllIlI(Movement.getRunEnergy(), lIllIIllIl[14]) && lIIlIlllllIIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[lIllIIllIl[1]];
                strArr[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[11]];
                if (lIIlIlllllIIl(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIllIIllIl[1]];
                    strArr2[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[15]];
                    if (lIIlIlllllIIl(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lIllIIllIl[1]];
                        strArr3[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[16]];
                        if (lIIlIlllllIIl(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[lIllIIllIl[1]];
                            iArr[lIllIIllIl[0]] = lIllIIllIl[17];
                            if (lIIlIlllllIIl(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIllIIllIl[1]];
                                iArr2[lIllIIllIl[0]] = lIllIIllIl[18];
                            }
                        }
                    }
                }
                aM();
                if (lIIlIllllllIl(lIIlIllllIllI(C0004e.u(), 45.0d))) {
                    int[] iArr3 = new int[lIllIIllIl[1]];
                    iArr3[lIllIIllIl[0]] = lIllIIllIl[12];
                    if (lIIlIllllIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIllIIllIl[1]];
                        iArr4[lIllIIllIl[0]] = lIllIIllIl[12];
                        Inventory.getFirst(iArr4).interact(lIllIIllII[lIllIIllIl[19]]);
                        Time.sleepTicks(lIllIIllIl[1]);
                        "".length();
                    }
                }
                if ((lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[20]) && !lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21])) || (lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[20]) && lIIlIlllllIII(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[21]))) {
                    C0015p.aj();
                }
                if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21]) && lIIlIlllllIlI(Skills.getLevel(Skill.STRENGTH), lIllIIllIl[21])) {
                    C0011l.ah();
                }
            }
        }
    }

    private static void lIIlIllllIlII() {
        lIllIIllII = new String[lIllIIllIl[73]];
        lIllIIllII[lIllIIllIl[0]] = lIIlIllllIIIl("VVIqLlu3IY7esBH7xrDoGw==", "tKKdp");
        lIllIIllII[lIllIIllIl[1]] = lIIlIllllIIlI("ISI4GwkPLjJSGBIyPxwdRyIiFxcUZ3YBDQ4/NRoTCSx2EBsEIHYGFUcmMx4fAmsiABsOJT8cHQ==", "gKVrz");
        lIllIIllII[lIllIIllIl[4]] = lIIlIllllIIlI("BhYnHigpAzgZKGgDPlctKRk6", "HwQwO");
        lIllIIllII[lIllIIllIl[5]] = lIIlIllllIIIl("N3guYUSOY5rkaiTRe8AiZaYQP871bdac", "Timhf");
        lIllIIllII[lIllIIllIl[7]] = lIIlIllllIIll("v3pDEakC4hI4il9WfOTEwqFKYKmhN6il1xuqGLWxPIUHeYrvGPVUkRHYinYvl02e", "dTkHE");
        lIllIIllII[lIllIIllIl[11]] = lIIlIllllIIIl("5JM9+u1bMe2Jneq7fGxIYg==", "nnCPz");
        lIllIIllII[lIllIIllIl[15]] = lIIlIllllIIlI("FRYkNgpmESI6Cy8WICE=", "FbASf");
        lIllIIllII[lIllIIllIl[16]] = lIIlIllllIIIl("LlmFvoedcAn8oVTZWzC9Sd6flyWInTVn", "ifkAk");
        lIllIIllII[lIllIIllIl[19]] = lIIlIllllIIll("kjzx+mGm6KU=", "LQKfG");
        lIllIIllII[lIllIIllIl[22]] = lIIlIllllIIlI("JBQ9GCQdEnEHIlMWPgRtEgc0Eg==", "suQsM");
        lIllIIllII[lIllIIllIl[23]] = lIIlIllllIIIl("qY9nuAO8j4NyMtjEMPJqzA==", "ojRAW");
        lIllIIllII[lIllIIllIl[24]] = lIIlIllllIIlI("Egsd", "Qdjft");
        lIllIIllII[lIllIIllIl[25]] = lIIlIllllIIIl("RwouyQiulJQ=", "GkDTp");
        lIllIIllII[lIllIIllIl[26]] = lIIlIllllIIll("L4/Gr2NTRqo=", "QGFpK");
        lIllIIllII[lIllIIllIl[27]] = lIIlIllllIIll("Bz56dnve0Lo=", "WtSHb");
        lIllIIllII[lIllIIllIl[14]] = lIIlIllllIIIl("APbW0jk4D7sHL5cM0XtAti0XvQywNxRs", "aWDbA");
        lIllIIllII[lIllIIllIl[28]] = lIIlIllllIIll("TtxBuF528RQARkBY0+/trw==", "eOKCE");
        lIllIIllII[lIllIIllIl[29]] = lIIlIllllIIlI("", "gNOQa");
        lIllIIllII[lIllIIllIl[32]] = lIIlIllllIIIl("SG+Bt6c2KDohXvKwqzzGLw==", "OsRxH");
        lIllIIllII[lIllIIllIl[33]] = lIIlIllllIIIl("CsOSLP/XT6T1eGFy/v3+sQ==", "VumVb");
        lIllIIllII[lIllIIllIl[20]] = lIIlIllllIIll("y0KI5Octul4=", "eFoZB");
        lIllIIllII[lIllIIllIl[34]] = lIIlIllllIIll("TXoGW8FKqNYinguZPhgpmg==", "AWDxA");
        lIllIIllII[lIllIIllIl[35]] = lIIlIllllIIlI("NDU2FBtHMjAYGg41MgM=", "gASqw");
        lIllIIllII[lIllIIllIl[36]] = lIIlIllllIIIl("e4GHYIPxE3E=", "mavBh");
        lIllIIllII[lIllIIllIl[37]] = lIIlIllllIIIl("I9He9jtyQvhnYcNsOWmygXHapOiDCcqC", "dxyhA");
        lIllIIllII[lIllIIllIl[38]] = lIIlIllllIIIl("gimMGoRwwHp44WXJgiMJFdfqQmhCuVFA", "PPwpx");
        lIllIIllII[lIllIIllIl[39]] = lIIlIllllIIll("vdJfD6w56y4=", "yOPpl");
        lIllIIllII[lIllIIllIl[40]] = lIIlIllllIIlI("BzwTCgs=", "PUvfo");
        lIllIIllII[lIllIIllIl[41]] = lIIlIllllIIIl("VT3LhBcKHzw=", "STGAm");
        lIllIIllII[lIllIIllIl[43]] = lIIlIllllIIIl("88/s5vaNnfI=", "UlikZ");
        lIllIIllII[lIllIIllIl[2]] = lIIlIllllIIIl("FLxphHhHsU0=", "ovLZd");
        lIllIIllII[lIllIIllIl[46]] = lIIlIllllIIIl("jj8ms577DwM=", "yEJxN");
        lIllIIllII[lIllIIllIl[48]] = lIIlIllllIIll("+At69z4Lx/0=", "nFAzi");
        lIllIIllII[lIllIIllIl[50]] = lIIlIllllIIIl("XlQZWb/FfFE=", "TZfkX");
        lIllIIllII[lIllIIllIl[52]] = lIIlIllllIIIl("eD4Mqflb4qg=", "qAlIl");
        lIllIIllII[lIllIIllIl[59]] = lIIlIllllIIll("o5yhFqYgSv32E3+poiP1wA==", "PDyxy");
        lIllIIllII[lIllIIllIl[60]] = lIIlIllllIIlI("Mz8+", "pPIXo");
    }

    static {
        lIIlIllllIlIl();
        lIIlIllllIlII();
        bp = new ArrayList();
        int[] iArr = new int[lIllIIllIl[19]];
        iArr[lIllIIllIl[0]] = lIllIIllIl[17];
        iArr[lIllIIllIl[1]] = lIllIIllIl[18];
        iArr[lIllIIllIl[4]] = lIllIIllIl[44];
        iArr[lIllIIllIl[5]] = lIllIIllIl[45];
        iArr[lIllIIllIl[7]] = lIllIIllIl[42];
        iArr[lIllIIllIl[11]] = lIllIIllIl[47];
        iArr[lIllIIllIl[15]] = lIllIIllIl[49];
        iArr[lIllIIllIl[16]] = lIllIIllIl[51];
        cE = iArr;
        cF = new WorldArea(lIllIIllIl[61], lIllIIllIl[62], lIllIIllIl[24], lIllIIllIl[24], lIllIIllIl[0]);
        cG = new WorldArea(lIllIIllIl[63], lIllIIllIl[64], lIllIIllIl[34], lIllIIllIl[28], lIllIIllIl[0]);
        cH = new WorldArea(lIllIIllIl[65], lIllIIllIl[66], lIllIIllIl[67], lIllIIllIl[2], lIllIIllIl[0]);
        cI = new WorldPoint(lIllIIllIl[68], lIllIIllIl[69], lIllIIllIl[0]);
        ce = new WorldPoint(lIllIIllIl[70], lIllIIllIl[62], lIllIIllIl[0]);
        cJ = new WorldPoint(lIllIIllIl[71], lIllIIllIl[72], lIllIIllIl[0]);
    }

    private static boolean lIIlIlllllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIllllllll(int i, int i2) {
        return i == i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            aH();
            "".length();
            if ((-"   ".length()) > 0) {
                return ((228 ^ 148) ^ (109 ^ 69)) & (((((47 + 190) - 197) + 215) ^ (((64 + 44) - (-36)) + 23)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIllIIllIl[0];
    }

    public static void ak() {
        if (lIIlIlllllIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[22]];
            Movement.walkTo(ce);
            "".length();
            Time.sleepTicks(lIllIIllIl[1]);
            "".length();
        }
        if (lIIlIllllIlll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[23]];
            if (lIIlIlllllllI(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIIlIllllIlll(npc.getName().contains(lIllIIllII[lIllIIllIl[60]]) ? 1 : 0) && lIIlIlllllllI(npc.getInteracting()) && lIIlIlllllIIl(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIIllIl[1];
                        "".length();
                        return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIllIl[0];
                });
                String[] strArr = new String[lIllIIllIl[4]];
                strArr[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[24]];
                strArr[lIllIIllIl[1]] = lIllIIllII[lIllIIllIl[25]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIIllIIIIIIIl(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = lIllIIllIl[1];
                        "".length();
                        return (-"   ".length()) > 0 ? ((22 ^ 10) ^ (88 ^ 92)) & (((62 ^ 27) ^ (1 ^ 60)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIllIl[0];
                }).collect(Collectors.toList());
                if (lIIlIlllllIIl(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(lIllIIllIl[0])).interact(lIllIIllII[lIllIIllIl[26]]);
                    Time.sleepTicks(lIllIIllIl[4]);
                    "".length();
                }
                if (lIIlIlllllIll(nearest) && lIIlIlllllIIl(Players.getLocal().isMoving() ? 1 : 0) && lIIlIllllIlll(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(lIllIIllII[lIllIIllIl[27]]);
                    Time.sleepTicks(lIllIIllIl[4]);
                    "".length();
                }
            }
            if (lIIlIlllllIll(Players.getLocal().getInteracting())) {
                Time.sleepTicks(lIllIIllIl[7]);
                "".length();
            }
        }
    }

    public static void aJ() {
        if (lIIlIllllllll(Static.getClient().getVar(lIllIIllIl[24]), lIllIIllIl[1])) {
            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[14]];
            Static.getClient().invokeMenuAction(lIllIIllII[lIllIIllIl[28]], lIllIIllII[lIllIIllIl[29]], lIllIIllIl[1], MenuAction.CC_OP.getId(), lIllIIllIl[30], lIllIIllIl[31]);
        }
        if (lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[11])) {
            String[] strArr = new String[lIllIIllIl[1]];
            strArr[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[32]];
            if (lIIlIllllIlll(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIllIIllIl[1]];
                strArr2[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[33]];
                Inventory.getFirst(strArr2).interact(lIllIIllII[lIllIIllIl[20]]);
            }
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[11]) && lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[20])) {
            String[] strArr3 = new String[lIllIIllIl[1]];
            strArr3[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[34]];
            if (lIIlIllllIlll(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lIllIIllIl[1]];
                strArr4[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[35]];
                Inventory.getFirst(strArr4).interact(lIllIIllII[lIllIIllIl[36]]);
            }
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[20]) && lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[2])) {
            String[] strArr5 = new String[lIllIIllIl[1]];
            strArr5[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[37]];
            if (lIIlIllllIlll(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[lIllIIllIl[1]];
                strArr6[lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[38]];
                Inventory.getFirst(strArr6).interact(lIllIIllII[lIllIIllIl[39]]);
            }
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[2]) && lIIlIlllllIII(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21])) {
            int[] iArr = new int[lIllIIllIl[1]];
            iArr[lIllIIllIl[0]] = lIllIIllIl[17];
            if (lIIlIllllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllIIllIl[1]];
                iArr2[lIllIIllIl[0]] = lIllIIllIl[17];
                Inventory.getFirst(iArr2).interact(lIllIIllII[lIllIIllIl[40]]);
            }
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.ATTACK), lIllIIllIl[21])) {
            int[] iArr3 = new int[lIllIIllIl[1]];
            iArr3[lIllIIllIl[0]] = lIllIIllIl[18];
            if (lIIlIllllIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIllIIllIl[1]];
                iArr4[lIllIIllIl[0]] = lIllIIllIl[18];
                Inventory.getFirst(iArr4).interact(lIllIIllII[lIllIIllIl[41]]);
            }
        }
        if (lIIlIlllllIlI(Skills.getLevel(Skill.DEFENCE), lIllIIllIl[2])) {
            int[] iArr5 = new int[lIllIIllIl[1]];
            iArr5[lIllIIllIl[0]] = lIllIIllIl[42];
            if (lIIlIllllIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIllIIllIl[1]];
                iArr6[lIllIIllIl[0]] = lIllIIllIl[42];
                Inventory.getFirst(iArr6).interact(lIllIIllII[lIllIIllIl[43]]);
            }
            int[] iArr7 = new int[lIllIIllIl[1]];
            iArr7[lIllIIllIl[0]] = lIllIIllIl[44];
            if (lIIlIllllIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIllIIllIl[1]];
                iArr8[lIllIIllIl[0]] = lIllIIllIl[44];
                Inventory.getFirst(iArr8).interact(lIllIIllII[lIllIIllIl[2]]);
            }
            int[] iArr9 = new int[lIllIIllIl[1]];
            iArr9[lIllIIllIl[0]] = lIllIIllIl[45];
            if (lIIlIllllIlll(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIllIIllIl[1]];
                iArr10[lIllIIllIl[0]] = lIllIIllIl[45];
                Inventory.getFirst(iArr10).interact(lIllIIllII[lIllIIllIl[46]]);
            }
            int[] iArr11 = new int[lIllIIllIl[1]];
            iArr11[lIllIIllIl[0]] = lIllIIllIl[47];
            if (lIIlIllllIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIllIIllIl[1]];
                iArr12[lIllIIllIl[0]] = lIllIIllIl[47];
                Inventory.getFirst(iArr12).interact(lIllIIllII[lIllIIllIl[48]]);
            }
        }
        int[] iArr13 = new int[lIllIIllIl[1]];
        iArr13[lIllIIllIl[0]] = lIllIIllIl[49];
        if (lIIlIllllIlll(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIllIIllIl[1]];
            iArr14[lIllIIllIl[0]] = lIllIIllIl[49];
            Inventory.getFirst(iArr14).interact(lIllIIllII[lIllIIllIl[50]]);
        }
        int[] iArr15 = new int[lIllIIllIl[1]];
        iArr15[lIllIIllIl[0]] = lIllIIllIl[51];
        if (lIIlIllllIlll(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lIllIIllIl[1]];
            iArr16[lIllIIllIl[0]] = lIllIIllIl[51];
            Inventory.getFirst(iArr16).interact(lIllIIllII[lIllIIllIl[52]]);
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIIllII[lIllIIllIl[59]];
    }
}
