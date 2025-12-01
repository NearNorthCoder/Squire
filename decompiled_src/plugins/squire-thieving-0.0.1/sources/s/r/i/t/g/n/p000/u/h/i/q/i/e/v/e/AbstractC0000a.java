package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/a.class */
public abstract class AbstractC0000a extends Task {
    protected static final /* synthetic */ int q;
    private static /* synthetic */ String[] lIIllIllllllI;
    private static /* synthetic */ int[] lIIlllIIIlllI;
    protected final /* synthetic */ SquireThievingConfig p;
    protected final /* synthetic */ SquireThieving o;

    private static String lIllIIlIIIIlIIl(String llllllllllllllIlllIllIIIllIIllII, String llllllllllllllIlllIllIIIllIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlllI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIlllI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIllIIllIl) {
            llllllllllllllIlllIllIIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIllIIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIlIllIIIII(int i, int i2) {
        return i >= i2;
    }

    private static void lIllIIlIlIllIll() {
        lIIllIllllllI = new String[lIIlllIIIlllI[61]];
        lIIllIllllllI[lIIlllIIIlllI[0]] = lIllIIlIIIIlIII("AjQqHQ==", "UQKow");
        lIIllIllllllI[lIIlllIIIlllI[2]] = lIllIIlIIIIlIII("BCINPz07KAUxOQ==", "TKnTM");
        lIIllIllllllI[lIIlllIIIlllI[6]] = lIllIIlIIIIlIIl("MmCZwbR0RBI=", "KXtnr");
        lIIllIllllllI[lIIlllIIIlllI[3]] = lIllIIlIIIIlIIl("hW4OlC+OlCI=", "cNEfb");
        lIIllIllllllI[lIIlllIIIlllI[9]] = lIllIIlIIIIlIII("NyQ1EhoTOg==", "vVPvr");
        lIIllIllllllI[lIIlllIIIlllI[1]] = lIllIIlIIIIlIII("FjcaAyohPgEQ", "UVhbD");
        lIIllIllllllI[lIIlllIIIlllI[10]] = lIllIIlIIIIlIII("Bx0CCSo2EQ8C", "DxnlH");
        lIIllIllllllI[lIIlllIIIlllI[11]] = lIllIIlIIIIlIII("EScdMCU9MBw=", "RBqUB");
        lIIllIllllllI[lIIlllIIIlllI[12]] = lIllIIlIIIIlIIl("T7mD2SYmO/U=", "XyoEK");
        lIIllIllllllI[lIIlllIIIlllI[13]] = lIllIIlIIIIlIlI("w1fKs9dQXmQ=", "WouEE");
        lIIllIllllllI[lIIlllIIIlllI[14]] = lIllIIlIIIIlIIl("qckovUCiiJg=", "JbujP");
        lIIllIllllllI[lIIlllIIIlllI[15]] = lIllIIlIIIIlIII("LQ83BxEBBw==", "hkEfy");
        lIIllIllllllI[lIIlllIIIlllI[16]] = lIllIIlIIIIlIlI("7mdx4wzar4M=", "ZgPOp");
        lIIllIllllllI[lIIlllIIIlllI[17]] = lIllIIlIIIIlIlI("D5QUYNbPbMc=", "eDYiD");
        lIIllIllllllI[lIIlllIIIlllI[18]] = lIllIIlIIIIlIIl("44ZvmeYxwkM=", "QrDpU");
        lIIllIllllllI[lIIlllIIIlllI[19]] = lIllIIlIIIIlIII("CTUNHycjNQ==", "LGhlS");
        lIIllIllllllI[lIIlllIIIlllI[20]] = lIllIIlIIIIlIII("MgQMNiIfAwU=", "wjiDF");
        lIIllIllllllI[lIIlllIIIlllI[21]] = lIllIIlIIIIlIlI("V7eOflZPc24=", "tEBHH");
        lIIllIllllllI[lIIlllIIIlllI[22]] = lIllIIlIIIIlIIl("3yVco2rwuNY=", "utZex");
        lIIllIllllllI[lIIlllIIIlllI[23]] = lIllIIlIIIIlIIl("ehEpdeO+XMk=", "WpeUl");
        lIIllIllllllI[lIIlllIIIlllI[24]] = lIllIIlIIIIlIIl("bP2Xg+qUuPDIvbaiRvR0Hg==", "BHDyK");
        lIIllIllllllI[lIIlllIIIlllI[25]] = lIllIIlIIIIlIlI("/rhTywjMpYnOQZ/VYkdZYA==", "JrGrk");
        lIIllIllllllI[lIIlllIIIlllI[26]] = lIllIIlIIIIlIIl("ekaF1d0vDe0=", "cnZbA");
        lIIllIllllllI[lIIlllIIIlllI[27]] = lIllIIlIIIIlIIl("sfH1y8FfpekZLj5YKO6I3w==", "atPRE");
        lIIllIllllllI[lIIlllIIIlllI[28]] = lIllIIlIIIIlIIl("uj4Jd7v97fM=", "sBORM");
        lIIllIllllllI[lIIlllIIIlllI[29]] = lIllIIlIIIIlIIl("dvoRRKsTXsRBfgQcRbIEVQ==", "CkKzL");
        lIIllIllllllI[lIIlllIIIlllI[30]] = lIllIIlIIIIlIlI("ZSsli6NGEhA=", "zVrlA");
        lIIllIllllllI[lIIlllIIIlllI[31]] = lIllIIlIIIIlIlI("3w5hOIeodEU=", "iZddA");
        lIIllIllllllI[lIIlllIIIlllI[32]] = lIllIIlIIIIlIII("DDMIBwI=", "EWznn");
        lIIllIllllllI[lIIlllIIIlllI[33]] = lIllIIlIIIIlIIl("lHYk/hNf8fs=", "FpaDy");
        lIIllIllllllI[lIIlllIIIlllI[34]] = lIllIIlIIIIlIII("OwgmKBcX", "reOFn");
        lIIllIllllllI[lIIlllIIIlllI[35]] = lIllIIlIIIIlIIl("JlG7RlgNy0A=", "ykDgd");
        lIIllIllllllI[lIIlllIIIlllI[36]] = lIllIIlIIIIlIlI("gkNnN1ERZgM=", "kwfGt");
        lIIllIllllllI[lIIlllIIIlllI[37]] = lIllIIlIIIIlIIl("zU1ykzKQf3E=", "Rbjrf");
        lIIllIllllllI[lIIlllIIIlllI[38]] = lIllIIlIIIIlIII("Gyo8Oww=", "WORLi");
        lIIllIllllllI[lIIlllIIIlllI[39]] = lIllIIlIIIIlIII("Kig4CRAU", "fAVmy");
        lIIllIllllllI[lIIlllIIIlllI[40]] = lIllIIlIIIIlIlI("fJjwvRDhEJE=", "JJkqu");
        lIIllIllllllI[lIIlllIIIlllI[41]] = lIllIIlIIIIlIII("GxUuPwk4", "VtFKh");
        lIIllIllllllI[lIIlllIIIlllI[42]] = lIllIIlIIIIlIIl("0U22Q5g9L6U=", "Zosoq");
        lIIllIllllllI[lIIlllIIIlllI[43]] = lIllIIlIIIIlIlI("2VTlYCksN7lO4vgk0tZQZA==", "upEkU");
        lIIllIllllllI[lIIlllIIIlllI[44]] = lIllIIlIIIIlIlI("aBt2ECNGd4E=", "VOdex");
        lIIllIllllllI[lIIlllIIIlllI[45]] = lIllIIlIIIIlIIl("Vlc+2g3MIQ7sWMfM/zk0NA==", "LPiTH");
        lIIllIllllllI[lIIlllIIIlllI[46]] = lIllIIlIIIIlIlI("5F5IR/Q7Jmc=", "TTJBe");
        lIIllIllllllI[lIIlllIIIlllI[47]] = lIllIIlIIIIlIII("OyoVOCkRKg==", "tXzHA");
        lIIllIllllllI[lIIlllIIIlllI[48]] = lIllIIlIIIIlIIl("T1ZVLuB12so=", "LNwzO");
        lIIllIllllllI[lIIlllIIIlllI[49]] = lIllIIlIIIIlIII("EhAGKAIy", "AqcZm");
        lIIllIllllllI[lIIlllIIIlllI[50]] = lIllIIlIIIIlIlI("J7zu84elEGE=", "IdrtL");
        lIIllIllllllI[lIIlllIIIlllI[51]] = lIllIIlIIIIlIlI("2V+KolnCRPQ=", "xGHEi");
        lIIllIllllllI[lIIlllIIIlllI[52]] = lIllIIlIIIIlIlI("Gz5IVT0mtak=", "vdHKg");
        lIIllIllllllI[lIIlllIIIlllI[53]] = lIllIIlIIIIlIII("MQ0+JQEL", "exLBn");
        lIIllIllllllI[lIIlllIIIlllI[54]] = lIllIIlIIIIlIIl("Cm8xeQMJL98=", "Uspwg");
        lIIllIllllllI[lIIlllIIIlllI[55]] = lIllIIlIIIIlIIl("lReELRs4JH0=", "BoKKZ");
        lIIllIllllllI[lIIlllIIIlllI[56]] = lIllIIlIIIIlIIl("zmWUURPbT0M=", "NrZYj");
        lIIllIllllllI[lIIlllIIIlllI[8]] = lIllIIlIIIIlIII("GBEFHBs=", "Stieu");
        lIIllIllllllI[lIIlllIIIlllI[57]] = lIllIIlIIIIlIIl("jtjAgvQsWuo=", "liJVg");
        lIIllIllllllI[lIIlllIIIlllI[58]] = lIllIIlIIIIlIII("BAMqFBQhES8ZUSQNKFghOxYy", "RbFxq");
        lIIllIllllllI[lIIlllIIIlllI[60]] = lIllIIlIIIIlIIl("W4s3RVhrLeqa3f+fEthFyA==", "bHoYg");
    }

    protected NPC n() {
        String str = lIIllIllllllI[lIIlllIIIlllI[58]];
        String[] strArr = new String[lIIlllIIIlllI[2]];
        strArr[lIIlllIIIlllI[0]] = str;
        return NPCs.getNearest(strArr);
    }

    private static int lIllIIlIlIllllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIllIIlIlIlllII() {
        lIIlllIIIlllI = new int[62];
        lIIlllIIIlllI[0] = (175 ^ 179) & ((31 ^ 3) ^ (-1));
        lIIlllIIIlllI[1] = (48 ^ 93) ^ (120 ^ 16);
        lIIlllIIIlllI[2] = " ".length();
        lIIlllIIIlllI[3] = "   ".length();
        lIIlllIIIlllI[4] = (-((-5121) & 24075)) & (-8193) & 32703;
        lIIlllIIIlllI[5] = (-((-16435) & 24703)) & (-18433) & 32253;
        lIIlllIIIlllI[6] = "  ".length();
        lIIlllIIIlllI[7] = (-((-8925) & 27357)) & (-69) & 24055;
        lIIlllIIIlllI[8] = 142 ^ 187;
        lIIlllIIIlllI[9] = 107 ^ 111;
        lIIlllIIIlllI[10] = 27 ^ 29;
        lIIlllIIIlllI[11] = (((120 + 147) - 225) + 108) ^ (((92 + 116) - 174) + 111);
        lIIlllIIIlllI[12] = (132 ^ 145) ^ (59 ^ 38);
        lIIlllIIIlllI[13] = (177 ^ 198) ^ (41 ^ 87);
        lIIlllIIIlllI[14] = 140 ^ 134;
        lIIlllIIIlllI[15] = 63 ^ 52;
        lIIlllIIIlllI[16] = (35 ^ 113) ^ (251 ^ 165);
        lIIlllIIIlllI[17] = (140 ^ 165) ^ (5 ^ 33);
        lIIlllIIIlllI[18] = 146 ^ 156;
        lIIlllIIIlllI[19] = (55 ^ 39) ^ (149 ^ 138);
        lIIlllIIIlllI[20] = (54 ^ 51) ^ (72 ^ 93);
        lIIlllIIIlllI[21] = (150 ^ 171) ^ (57 ^ 21);
        lIIlllIIIlllI[22] = (((69 + 92) - 117) + 139) ^ (((104 + 13) - (-14)) + 34);
        lIIlllIIIlllI[23] = (6 ^ 63) ^ (55 ^ 29);
        lIIlllIIIlllI[24] = (((156 + 84) - 221) + 171) ^ (((77 + 163) - 163) + 93);
        lIIlllIIIlllI[25] = 149 ^ 128;
        lIIlllIIIlllI[26] = (108 ^ 76) ^ (3 ^ 53);
        lIIlllIIIlllI[27] = 93 ^ 74;
        lIIlllIIIlllI[28] = (127 ^ 2) ^ (79 ^ 42);
        lIIlllIIIlllI[29] = (((83 + 129) - 179) + 109) ^ (((31 + 118) - 92) + 94);
        lIIlllIIIlllI[30] = (((68 + 42) - (-49)) + 13) ^ (((108 + 147) - 227) + 154);
        lIIlllIIIlllI[31] = (5 ^ 105) ^ (42 ^ 93);
        lIIlllIIIlllI[32] = 23 ^ 11;
        lIIlllIIIlllI[33] = 159 ^ 130;
        lIIlllIIIlllI[34] = 3 ^ 29;
        lIIlllIIIlllI[35] = (((19 + 65) - (-6)) + 126) ^ (((187 + 129) - 137) + 20);
        lIIlllIIIlllI[36] = 230 ^ 198;
        lIIlllIIIlllI[37] = 26 ^ 59;
        lIIlllIIIlllI[38] = 150 ^ 180;
        lIIlllIIIlllI[39] = (215 ^ 167) ^ (43 ^ 120);
        lIIlllIIIlllI[40] = (70 ^ 41) ^ (74 ^ 1);
        lIIlllIIIlllI[41] = (216 ^ 179) ^ (254 ^ 176);
        lIIlllIIIlllI[42] = 58 ^ 28;
        lIIlllIIIlllI[43] = 110 ^ 73;
        lIIlllIIIlllI[44] = 159 ^ 183;
        lIIlllIIIlllI[45] = (163 ^ 187) ^ (20 ^ 37);
        lIIlllIIIlllI[46] = (58 ^ 1) ^ (71 ^ 86);
        lIIlllIIIlllI[47] = (90 ^ 65) ^ (181 ^ 133);
        lIIlllIIIlllI[48] = 131 ^ 175;
        lIIlllIIIlllI[49] = (((5 + 55) - (-60)) + 57) ^ (((44 + 11) - (-58)) + 43);
        lIIlllIIIlllI[50] = 133 ^ 171;
        lIIlllIIIlllI[51] = (146 ^ 175) ^ (26 ^ 8);
        lIIlllIIIlllI[52] = 144 ^ 160;
        lIIlllIIIlllI[53] = 56 ^ 9;
        lIIlllIIIlllI[54] = (143 ^ 175) ^ (38 ^ 52);
        lIIlllIIIlllI[55] = 56 ^ 11;
        lIIlllIIIlllI[56] = 112 ^ 68;
        lIIlllIIIlllI[57] = (((51 + 91) - 134) + 133) ^ (((174 + 108) - 106) + 11);
        lIIlllIIIlllI[58] = 75 ^ 124;
        lIIlllIIIlllI[59] = (((((195 + 204) - 336) + 180) + (((14 + 59) - (-44)) + 100)) - ((-20993) & 21446)) + ((210 + 84) - 95) + 40;
        lIIlllIIIlllI[60] = (141 ^ 178) ^ (117 ^ 114);
        lIIlllIIIlllI[61] = (32 ^ 123) ^ (255 ^ 157);
    }

    private static boolean lIllIIlIllIIIIl(int i) {
        return i <= 0;
    }

    private static String lIllIIlIIIIlIlI(String llllllllllllllIlllIllIIIllIllIIl, String llllllllllllllIlllIllIIIllIllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIIllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIIllIllIll.init(lIIlllIIIlllI[6], llllllllllllllIlllIllIIIllIlllII);
            return new String(llllllllllllllIlllIllIIIllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIllIllIlI) {
            llllllllllllllIlllIllIIIllIllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        return lIllIIlIlIlllIl(this.p.method(), EnumC0001b.PICKPOCKETING) ? lIIlllIIIlllI[0] : l();
    }

    private static String lIllIIlIIIIlIII(String llllllllllllllIlllIllIIIlllIlllI, String llllllllllllllIlllIllIIIlllIllIl) {
        String llllllllllllllIlllIllIIIlllIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIIlllIllII = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIIIlllIllIl.toCharArray();
        int llllllllllllllIlllIllIIIlllIlIlI = lIIlllIIIlllI[0];
        char[] charArray2 = llllllllllllllIlllIllIIIlllIlllI2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIIlllI[0];
        while (lIllIIlIllIIlIl(i, length)) {
            char llllllllllllllIlllIllIIIlllIllll = charArray2[i];
            llllllllllllllIlllIllIIIlllIllII.append((char) (llllllllllllllIlllIllIIIlllIllll ^ charArray[llllllllllllllIlllIllIIIlllIlIlI % charArray.length]));
            "".length();
            llllllllllllllIlllIllIIIlllIlIlI++;
            i++;
            "".length();
            if (((211 ^ 178) ^ (167 ^ 194)) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllIIIlllIllII);
    }

    static {
        lIllIIlIlIlllII();
        lIllIIlIlIllIll();
        q = lIIlllIIIlllI[59];
    }

    private static boolean lIllIIlIlIlllll(int i) {
        return i != 0;
    }

    public abstract boolean l();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0000a(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.o = squireThieving;
        this.p = squireThievingConfig;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public void a(NPC npc) {
        double currentHealth = ((Combat.getCurrentHealth() - lIIlllIIIlllI[1]) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
        if (lIllIIlIlIlllll(this.p.redemptionHeal() ? 1 : 0) && lIllIIlIllIIIII(Prayers.getPoints(), lIIlllIIIlllI[2])) {
            if (lIllIIlIllIIIIl(lIllIIlIlIllllI(currentHealth, 10.0d))) {
                Prayers.flick(List.of(Prayer.REDEMPTION));
                "".length();
                "".length();
                if ((147 ^ 151) < 0) {
                    return;
                }
            } else {
                Prayers.disableAll();
            }
        }
        if (!lIllIIlIlIlllll(Reachable.isInteractable(npc) ? 1 : 0)) {
            Movement.walkTo(npc.getWorldLocation());
            "".length();
            return;
        }
        if (lIllIIlIllIIIlI(this.p.pickpocketTarget(), EnumC0005f.VYRE) && lIllIIlIllIIIll(npc.getWorldLocation().distanceTo(Players.getLocal()), lIIlllIIIlllI[3])) {
            int[] iArr = new int[lIIlllIIIlllI[3]];
            iArr[lIIlllIIIlllI[0]] = lIIlllIIIlllI[4];
            iArr[lIIlllIIIlllI[2]] = lIIlllIIIlllI[5];
            iArr[lIIlllIIIlllI[6]] = lIIlllIIIlllI[7];
            for (Item item : Inventory.getAll(iArr)) {
                item.interact(lIIllIllllllI[lIIlllIIIlllI[0]]);
                "".length();
                if ((-(182 ^ 179)) >= 0) {
                    return;
                }
            }
        }
        if (lIllIIlIlIlllll(this.p.gemBag() ? 1 : 0) && lIllIIlIlIlllll(this.o.k() ? 1 : 0)) {
            this.o.c(lIIlllIIIlllI[0]);
        }
        npc.interact(lIIllIllllllI[lIIlllIIIlllI[2]]);
        "".length();
        if ((true ^ true) && ((true ^ true) ^ true)) {
        }
    }

    protected NPC m() {
        String[] strArr = new String[lIIlllIIIlllI[8]];
        strArr[lIIlllIIIlllI[0]] = lIIllIllllllI[lIIlllIIIlllI[6]];
        strArr[lIIlllIIIlllI[2]] = lIIllIllllllI[lIIlllIIIlllI[3]];
        strArr[lIIlllIIIlllI[6]] = lIIllIllllllI[lIIlllIIIlllI[9]];
        strArr[lIIlllIIIlllI[3]] = lIIllIllllllI[lIIlllIIIlllI[1]];
        strArr[lIIlllIIIlllI[9]] = lIIllIllllllI[lIIlllIIIlllI[10]];
        strArr[lIIlllIIIlllI[1]] = lIIllIllllllI[lIIlllIIIlllI[11]];
        strArr[lIIlllIIIlllI[10]] = lIIllIllllllI[lIIlllIIIlllI[12]];
        strArr[lIIlllIIIlllI[11]] = lIIllIllllllI[lIIlllIIIlllI[13]];
        strArr[lIIlllIIIlllI[12]] = lIIllIllllllI[lIIlllIIIlllI[14]];
        strArr[lIIlllIIIlllI[13]] = lIIllIllllllI[lIIlllIIIlllI[15]];
        strArr[lIIlllIIIlllI[14]] = lIIllIllllllI[lIIlllIIIlllI[16]];
        strArr[lIIlllIIIlllI[15]] = lIIllIllllllI[lIIlllIIIlllI[17]];
        strArr[lIIlllIIIlllI[16]] = lIIllIllllllI[lIIlllIIIlllI[18]];
        strArr[lIIlllIIIlllI[17]] = lIIllIllllllI[lIIlllIIIlllI[19]];
        strArr[lIIlllIIIlllI[18]] = lIIllIllllllI[lIIlllIIIlllI[20]];
        strArr[lIIlllIIIlllI[19]] = lIIllIllllllI[lIIlllIIIlllI[21]];
        strArr[lIIlllIIIlllI[20]] = lIIllIllllllI[lIIlllIIIlllI[22]];
        strArr[lIIlllIIIlllI[21]] = lIIllIllllllI[lIIlllIIIlllI[23]];
        strArr[lIIlllIIIlllI[22]] = lIIllIllllllI[lIIlllIIIlllI[24]];
        strArr[lIIlllIIIlllI[23]] = lIIllIllllllI[lIIlllIIIlllI[25]];
        strArr[lIIlllIIIlllI[24]] = lIIllIllllllI[lIIlllIIIlllI[26]];
        strArr[lIIlllIIIlllI[25]] = lIIllIllllllI[lIIlllIIIlllI[27]];
        strArr[lIIlllIIIlllI[26]] = lIIllIllllllI[lIIlllIIIlllI[28]];
        strArr[lIIlllIIIlllI[27]] = lIIllIllllllI[lIIlllIIIlllI[29]];
        strArr[lIIlllIIIlllI[28]] = lIIllIllllllI[lIIlllIIIlllI[30]];
        strArr[lIIlllIIIlllI[29]] = lIIllIllllllI[lIIlllIIIlllI[31]];
        strArr[lIIlllIIIlllI[30]] = lIIllIllllllI[lIIlllIIIlllI[32]];
        strArr[lIIlllIIIlllI[31]] = lIIllIllllllI[lIIlllIIIlllI[33]];
        strArr[lIIlllIIIlllI[32]] = lIIllIllllllI[lIIlllIIIlllI[34]];
        strArr[lIIlllIIIlllI[33]] = lIIllIllllllI[lIIlllIIIlllI[35]];
        strArr[lIIlllIIIlllI[34]] = lIIllIllllllI[lIIlllIIIlllI[36]];
        strArr[lIIlllIIIlllI[35]] = lIIllIllllllI[lIIlllIIIlllI[37]];
        strArr[lIIlllIIIlllI[36]] = lIIllIllllllI[lIIlllIIIlllI[38]];
        strArr[lIIlllIIIlllI[37]] = lIIllIllllllI[lIIlllIIIlllI[39]];
        strArr[lIIlllIIIlllI[38]] = lIIllIllllllI[lIIlllIIIlllI[40]];
        strArr[lIIlllIIIlllI[39]] = lIIllIllllllI[lIIlllIIIlllI[41]];
        strArr[lIIlllIIIlllI[40]] = lIIllIllllllI[lIIlllIIIlllI[42]];
        strArr[lIIlllIIIlllI[41]] = lIIllIllllllI[lIIlllIIIlllI[43]];
        strArr[lIIlllIIIlllI[42]] = lIIllIllllllI[lIIlllIIIlllI[44]];
        strArr[lIIlllIIIlllI[43]] = lIIllIllllllI[lIIlllIIIlllI[45]];
        strArr[lIIlllIIIlllI[44]] = lIIllIllllllI[lIIlllIIIlllI[46]];
        strArr[lIIlllIIIlllI[45]] = lIIllIllllllI[lIIlllIIIlllI[47]];
        strArr[lIIlllIIIlllI[46]] = lIIllIllllllI[lIIlllIIIlllI[48]];
        strArr[lIIlllIIIlllI[47]] = lIIllIllllllI[lIIlllIIIlllI[49]];
        strArr[lIIlllIIIlllI[48]] = lIIllIllllllI[lIIlllIIIlllI[50]];
        strArr[lIIlllIIIlllI[49]] = lIIllIllllllI[lIIlllIIIlllI[51]];
        strArr[lIIlllIIIlllI[50]] = lIIllIllllllI[lIIlllIIIlllI[52]];
        strArr[lIIlllIIIlllI[51]] = lIIllIllllllI[lIIlllIIIlllI[53]];
        strArr[lIIlllIIIlllI[52]] = lIIllIllllllI[lIIlllIIIlllI[54]];
        strArr[lIIlllIIIlllI[53]] = lIIllIllllllI[lIIlllIIIlllI[55]];
        strArr[lIIlllIIIlllI[54]] = lIIllIllllllI[lIIlllIIIlllI[56]];
        strArr[lIIlllIIIlllI[55]] = lIIllIllllllI[lIIlllIIIlllI[8]];
        strArr[lIIlllIIIlllI[56]] = lIIllIllllllI[lIIlllIIIlllI[57]];
        return NPCs.getNearest(strArr);
    }

    private static boolean lIllIIlIlIlllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIlIllIIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean o() {
        if (lIllIIlIllIIlII(Players.getLocal().getGraphic(), lIIlllIIIlllI[59])) {
            ?? r0 = lIIlllIIIlllI[2];
            "".length();
            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllIIIlllI[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NPC a(EnumC0005f enumC0005f) {
        return lIllIIlIllIIIlI(enumC0005f, EnumC0005f.ELF) ? m() : lIllIIlIllIIIlI(enumC0005f, EnumC0005f.VYRE) ? n() : NPCs.getNearest(npc -> {
            if (lIllIIlIlIlllll(enumC0005f.v().equals(npc.getName()) ? 1 : 0)) {
                String str = lIIllIllllllI[lIIlllIIIlllI[60]];
                if (lIllIIlIlIlllll(npc.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    ?? r0 = lIIlllIIIlllI[2];
                    "".length();
                    return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIlllIIIlllI[0];
        });
    }

    private static boolean lIllIIlIllIIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIlIllIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }
}
