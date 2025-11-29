package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.x  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/x.class */
public class C0023x implements W {
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea dk;
    public static /* synthetic */ boolean dh;
    public static /* synthetic */ boolean df;
    static /* synthetic */ int cl;
    static /* synthetic */ int dj;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bW;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ boolean dg;
    public static /* synthetic */ boolean di;
    public static /* synthetic */ boolean de;
    private static /* synthetic */ int[] lIllIIlIl;
    static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ String[] lIllIIIll;

    private static int lIIlIlIllllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aV();
            "".length();
            if ((161 ^ 165) <= ((87 ^ 21) & ((83 ^ 17) ^ (-1)))) {
                return (77 ^ 124) & ((122 ^ 75) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllIIlIl[97];
    }

    private static boolean lIIlIllIIIIl(int i) {
        return i == 0;
    }

    private static String lIIlIlIlIllI(String llIlllIIlllIII, String llIlllIIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlllIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIIlllIIl) {
            llIlllIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIlII(int i, int i2) {
        return i >= i2;
    }

    private static void lIIlIlIlllII() {
        lIllIIIll = new String[lIllIIlIl[112]];
        lIllIIIll[lIllIIlIl[1]] = lIIlIlIlIllI("eJeb7hoLw3CIKnuqr7hdFVGy5aG8WQd3vj5nAB5iovQ3OQ3oDVJCjOxKqD1Fl1r9", "hfiCc");
        lIllIIIll[lIllIIlIl[0]] = lIIlIlIlIlll("JhQ+dBMHVSo1CQM=", "huHTg");
        lIllIIIll[lIllIIlIl[3]] = lIIlIlIlIlll("LDEHMAsNPg50BQU+Aj0JAw==", "dPiTg");
        lIllIIIll[lIllIIlIl[11]] = lIIlIlIlIlll("BTxuBhw3eSMOHSEwIABOIywrFBpyKjsXHj4wKxRCcio5DhoxMScJCXItIUcsBwAHKSk=", "RYNgn");
        lIllIIIll[lIllIIlIl[4]] = lIIlIlIllIII("LcyeDkMSCfGWyvdLo/HpJPy4X3W5ZTSPFRMpAw0GnCXUY70yWICiMQ5RBhEMJTM58TO1Iustjig=", "ZdGEm");
        lIllIIIll[lIllIIlIl[12]] = lIIlIlIllIII("UZlQJvoUqyA=", "MpCoB");
        lIllIIIll[lIllIIlIl[17]] = lIIlIlIlIlll("HgAsIj8=", "ZrELT");
        lIllIIIll[lIllIIlIl[18]] = lIIlIlIllIII("XU77G+KQU/U=", "ZaQAK");
        lIllIIIll[lIllIIlIl[19]] = lIIlIlIllIII("1NRy1JiS8EA=", "oegxt");
        lIllIIIll[lIllIIlIl[20]] = lIIlIlIlIllI("h9aKquIvUwM=", "CRbgE");
        lIllIIIll[lIllIIlIl[6]] = lIIlIlIlIllI("tkO77P34leQi+YhH+gJRcQ==", "Nmfmh");
        lIllIIIll[lIllIIlIl[21]] = lIIlIlIllIII("BT4f8p9R7G1LkShqEDak0HfBjT1iDOg8", "YmymJ");
        lIllIIIll[lIllIIlIl[22]] = lIIlIlIlIlll("Ng85GCNVKSoDIRwGJxQuGw==", "ujKqO");
        lIllIIIll[lIllIIlIl[25]] = lIIlIlIlIlll("CyAPVBYqYQ8VDjMkWRsMIA==", "EAytb");
        lIllIIIll[lIllIIlIl[26]] = lIIlIlIlIllI("BJJznZVqBt53qFnW2drYPw==", "WrEdx");
        lIllIIIll[lIllIIlIl[10]] = lIIlIlIlIlll("ByUAKg==", "SPrDh");
        lIllIIIll[lIllIIlIl[27]] = lIIlIlIllIII("KVZzTO/0rS4HwsWI7cG4VcmSa2apBzNO", "EfJeF");
        lIllIIIll[lIllIIlIl[30]] = lIIlIlIlIllI("fNvfx11Q2ylsSJVJ25utw4XhpBgu/kt1", "VGUEw");
        lIllIIIll[lIllIIlIl[31]] = lIIlIlIllIII("mykVY2WR5KvmZJECtDcSsA==", "cJsdK");
        lIllIIIll[lIllIIlIl[32]] = lIIlIlIlIlll("MjYTCA==", "fCafV");
        lIllIIIll[lIllIIlIl[33]] = lIIlIlIlIlll("BxIQAGU6E0IaKnMTCgtlIQ4FBjF9", "SgbnE");
        lIllIIIll[lIllIIlIl[36]] = lIIlIlIllIII("ru3pbvJ+MmwwPi/XnCSVQMUNmq+DhXuG", "TxjLH");
        lIllIIIll[lIllIIlIl[37]] = lIIlIlIlIllI("vFupl9PWTETVrojSUWu2Mg==", "lWCUf");
        lIllIIIll[lIllIIlIl[38]] = lIIlIlIllIII("la1gZ7iWQ4w=", "lSQwp");
        lIllIIIll[lIllIIlIl[16]] = lIIlIlIlIllI("I+nPECOFShGaD/SsQN+nP780PmS9CnX3", "ACmCT");
        lIllIIIll[lIllIIlIl[40]] = lIIlIlIllIII("WdHaXV4bmrV/xxQEX8UCNmpAy8Irg+dR", "XYJao");
        lIllIIIll[lIllIIlIl[41]] = lIIlIlIlIllI("QA3nbOj6yufwZ5rgzHV2CQ==", "zKEuY");
        lIllIIIll[lIllIIlIl[42]] = lIIlIlIlIllI("kEQ3qKHO9nA=", "RxSKa");
        lIllIIIll[lIllIIlIl[43]] = lIIlIlIlIllI("V4AkCJSw1+DM50B6noeAkk8TMdRUt8J0", "KFgGw");
        lIllIIIll[lIllIIlIl[46]] = lIIlIlIllIII("NxuioI7Psj9EzZ/U1Mac1awchOknW89N", "xKZKv");
        lIllIIIll[lIllIIlIl[47]] = lIIlIlIllIII("gAlUBj7g8S7vxRM8GBb15Q==", "wCJPs");
        lIllIIIll[lIllIIlIl[48]] = lIIlIlIlIlll("BgQ1Nw==", "RqGYN");
        lIllIIIll[lIllIIlIl[49]] = lIIlIlIllIII("zyvFTiMyZ/CXPiQe0a1uXbSKBkJ71mG2", "QXttH");
        lIllIIIll[lIllIIlIl[54]] = lIIlIlIlIlll("BSwxRBIkbSQFEC4=", "KMGdf");
        lIllIIIll[lIllIIlIl[55]] = lIIlIlIllIII("Wloi0aaUKII3coQcV1t18Q==", "agjab");
        lIllIIIll[lIllIIlIl[56]] = lIIlIlIllIII("HrfodJ457Iw=", "nvQPc");
        lIllIIIll[lIllIIlIl[57]] = lIIlIlIlIllI("uK9vBnICLAY=", "ikSfV");
        lIllIIIll[lIllIIlIl[58]] = lIIlIlIlIllI("v2vEusqtaiQ=", "hekud");
        lIllIIIll[lIllIIlIl[61]] = lIIlIlIlIlll("ISkgDg==", "sHFzD");
        lIllIIIll[lIllIIlIl[62]] = lIIlIlIllIII("KKftLdegqCc=", "WYjQC");
        lIllIIIll[lIllIIlIl[63]] = lIIlIlIlIlll("GSoMDVk/JQ4aGDQoHw==", "ZKzhy");
        lIllIIIll[lIllIIlIl[64]] = lIIlIlIlIlll("MSsRAxY=", "tEefd");
        lIllIIIll[lIllIIlIl[65]] = lIIlIlIlIlll("GCgCIxQ8aTszHSQgCzI=", "PIxFq");
        lIllIIIll[lIllIIlIl[68]] = lIIlIlIlIlll("DBATcRMtUQM4ACoF", "BqeQg");
        lIllIIIll[lIllIIlIl[69]] = lIIlIlIlIllI("sxviVgtVzqQ=", "aIaat");
        lIllIIIll[lIllIIlIl[70]] = lIIlIlIlIlll("MyIEEVUTLA==", "gChzx");
        lIllIIIll[lIllIIlIl[71]] = lIIlIlIllIII("n+hBpxdUYX4=", "AHtef");
        lIllIIIll[lIllIIlIl[72]] = lIIlIlIlIllI("D/vFdDVd7HU=", "dImkx");
        lIllIIIll[lIllIIlIl[73]] = lIIlIlIlIllI("CMAaGFQh1s0=", "kyPUQ");
        lIllIIIll[lIllIIlIl[74]] = lIIlIlIlIllI("RT3oSYWBVvE=", "ZDQOT");
        lIllIIIll[lIllIIlIl[15]] = lIIlIlIlIlll("KScmBQwGKjEKC0onJgYKHzQ=", "jFTke");
        lIllIIIll[lIllIIlIl[75]] = lIIlIlIllIII("9llpTeY423c=", "aYBXn");
        lIllIIIll[lIllIIlIl[76]] = lIIlIlIlIllI("aN0uYTRWZt8=", "OUoYJ");
        lIllIIIll[lIllIIlIl[77]] = lIIlIlIlIlll("PCsnCgcH", "oNFxd");
        lIllIIIll[lIllIIlIl[78]] = lIIlIlIllIII("DO374FlwQe8GC9V97C/oLxEVVkQfSYau", "ikaBi");
        lIllIIIll[lIllIIlIl[79]] = lIIlIlIlIllI("np8qGY0lfZxhyExTF3Oi5A==", "Xqxqv");
        lIllIIIll[lIllIIlIl[80]] = lIIlIlIlIlll("CyEfOC1oBwwjLyEoATQgJg==", "HDmQA");
        lIllIIIll[lIllIIlIl[81]] = lIIlIlIlIllI("JeOhNVj9+zTB/SETREedSqDQcyI8xGhu", "AaUeD");
        lIllIIIll[lIllIIlIl[82]] = lIIlIlIllIII("Mat39aTndsmN/ED/Sl80Og==", "ZeAYn");
        lIllIIIll[lIllIIlIl[83]] = lIIlIlIlIllI("kCDwD2HJwo12xQDIPj4RAA==", "zwkOj");
        lIllIIIll[lIllIIlIl[84]] = lIIlIlIlIllI("z/3J0qFUNR9aPU7lJquXpw==", "euWYt");
        lIllIIIll[lIllIIlIl[85]] = lIIlIlIllIII("ebpjqVKEZQLqQZB+CJz73w==", "UCBNA");
        lIllIIIll[lIllIIlIl[86]] = lIIlIlIlIllI("ZLv+7Z+rDPA=", "giyiM");
        lIllIIIll[lIllIIlIl[87]] = lIIlIlIlIlll("NzgoNg==", "xHMXQ");
        lIllIIIll[lIllIIlIl[88]] = lIIlIlIlIlll("IBMgOQsb", "svAKh");
        lIllIIIll[lIllIIlIl[89]] = lIIlIlIllIII("aFf+QJuyods=", "tBQXV");
        lIllIIIll[lIllIIlIl[90]] = lIIlIlIllIII("xx+sRrx5ELw=", "jlYka");
        lIllIIIll[lIllIIlIl[98]] = lIIlIlIllIII("Jy5CoXbNqB6GohtOeLoUog==", "arTnn");
        lIllIIIll[lIllIIlIl[99]] = lIIlIlIlIllI("43U2zY1C1JmJn+jkxMETdL0YrRmRS5GM", "MmJTi");
        lIllIIIll[lIllIIlIl[100]] = lIIlIlIllIII("IleLRer+GCedgKdQZhYvew==", "zqIuk");
        lIllIIIll[lIllIIlIl[101]] = lIIlIlIlIlll("MB0vAxMrCjc=", "DxCfc");
        lIllIIIll[lIllIIlIl[107]] = lIIlIlIllIII("9pI3tvBmkXI=", "ubUuG");
        lIllIIIll[lIllIIlIl[108]] = lIIlIlIllIII("8xW1HQBJVfcJYI2UwRUY7A==", "DnIMn");
        lIllIIIll[lIllIIlIl[109]] = lIIlIlIllIII("Xb8xx3OXBYLEQDAVBbBx8yu02CuwVikWeWHdZ6wI56U=", "iggAC");
        lIllIIIll[lIllIIlIl[110]] = lIIlIlIlIllI("tCzAo73Kj5vTINvp0u0SZ7RSd30M3fHj7ZAoQ2Appp8A6vexs1YuNA==", "CMjOX");
        lIllIIIll[lIllIIlIl[111]] = lIIlIlIlIlll("AU4aOgRvGk09DyQeTSwFPUA=", "HnmUj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIllIIlIl[12]];
        iArr[lIllIIlIl[1]] = lIllIIlIl[9];
        iArr[lIllIIlIl[0]] = lIllIIlIl[5];
        iArr[lIllIIlIl[3]] = lIllIIlIl[13];
        iArr[lIllIIlIl[11]] = lIllIIlIl[7];
        iArr[lIllIIlIl[4]] = lIllIIlIl[14];
        int i = lIllIIlIl[1];
        while (lIIlIllIIIII(i, iArr.length)) {
            int[] iArr2 = new int[lIllIIlIl[0]];
            iArr2[lIllIIlIl[1]] = iArr[i];
            if (lIIlIllIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIllIIlIl[1];
            }
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return ((((104 + 41) - 77) + 174) ^ (((109 + 71) - 87) + 92)) & (((82 ^ 94) ^ (128 ^ 199)) ^ (-" ".length()));
            }
        }
        return lIllIIlIl[0];
    }

    private static void lIIlIlIlllIl() {
        lIllIIlIl = new int[113];
        lIllIIlIl[0] = " ".length();
        lIllIIlIl[1] = (184 ^ 182) & ((161 ^ 175) ^ (-1));
        lIllIIlIl[2] = (-((-4297) & 23801)) & (-69) & 24572;
        lIllIIlIl[3] = "  ".length();
        lIllIIlIl[4] = (((146 + 45) - 182) + 150) ^ (((89 + 119) - 144) + 91);
        lIllIIlIl[5] = (-133) & 8142;
        lIllIIlIl[6] = (85 ^ 18) ^ (83 ^ 30);
        lIllIIlIl[7] = (-((-6497) & 8175)) & (-2049) & 16351;
        lIllIIlIl[8] = (-((-5655) & 13943)) & (-22021) & 32742;
        lIllIIlIl[9] = (-((-4933) & 13269)) & (-16425) & 32767;
        lIllIIlIl[10] = 147 ^ 156;
        lIllIIlIl[11] = "   ".length();
        lIllIIlIl[12] = 126 ^ 123;
        lIllIIlIl[13] = (-16421) & 24431;
        lIllIIlIl[14] = (-((-261) & 27085)) & (-4613) & 32767;
        lIllIIlIl[15] = 171 ^ 153;
        lIllIIlIl[16] = (150 ^ 137) ^ (89 ^ 94);
        lIllIIlIl[17] = 169 ^ 175;
        lIllIIlIl[18] = (((59 + 27) - 8) + 51) ^ (((44 + 8) - 39) + 121);
        lIllIIlIl[19] = 65 ^ 73;
        lIllIIlIl[20] = (((65 + 60) - 71) + 92) ^ (((133 + 113) - 241) + 150);
        lIllIIlIl[21] = 125 ^ 118;
        lIllIIlIl[22] = (((25 + 86) - 19) + 37) ^ (((35 + 30) - (-17)) + 59);
        lIllIIlIl[23] = (-1321) & 3881;
        lIllIIlIl[24] = (-16385) & 19631;
        lIllIIlIl[25] = 118 ^ 123;
        lIllIIlIl[26] = 102 ^ 104;
        lIllIIlIl[27] = 39 ^ 55;
        lIllIIlIl[28] = (-(107 ^ 42)) & (-16801) & 19435;
        lIllIIlIl[29] = (-((-409) & 29145)) & (-2) & 31999;
        lIllIIlIl[30] = (135 ^ 173) ^ (94 ^ 101);
        lIllIIlIl[31] = (70 ^ 25) ^ (138 ^ 199);
        lIllIIlIl[32] = 40 ^ 59;
        lIllIIlIl[33] = 169 ^ 189;
        lIllIIlIl[34] = (-9538) & 12121;
        lIllIIlIl[35] = (-28737) & 31982;
        lIllIIlIl[36] = (((11 + 114) - 111) + 141) ^ (((18 + 82) - 55) + 97);
        lIllIIlIl[37] = (32 ^ 97) ^ (145 ^ 198);
        lIllIIlIl[38] = (((14 + 78) - 87) + 142) ^ (((68 + 47) - 20) + 37);
        lIllIIlIl[39] = (-4491) & 7087;
        lIllIIlIl[40] = (61 ^ 49) ^ (138 ^ 159);
        lIllIIlIl[41] = 121 ^ 99;
        lIllIIlIl[42] = (91 ^ 16) ^ (202 ^ 154);
        lIllIIlIl[43] = 54 ^ 42;
        lIllIIlIl[44] = (-((-4643) & 14251)) & (-16453) & 28670;
        lIllIIlIl[45] = (-29202) & 32443;
        lIllIIlIl[46] = (70 ^ 17) ^ (98 ^ 40);
        lIllIIlIl[47] = 182 ^ 168;
        lIllIIlIl[48] = 164 ^ 187;
        lIllIIlIl[49] = (((18 + 89) - (-17)) + 15) ^ (((154 + 128) - 258) + 147);
        lIllIIlIl[50] = (-((-8473) & 13754)) & (-8195) & 16063;
        lIllIIlIl[51] = (-((-15879) & 32607)) & (-12801) & 32765;
        lIllIIlIl[52] = (-4205) & 6764;
        lIllIIlIl[53] = (-6177) & 15851;
        lIllIIlIl[54] = 183 ^ 150;
        lIllIIlIl[55] = (((117 + 38) - 14) + 16) ^ (((130 + 165) - 199) + 95);
        lIllIIlIl[56] = 113 ^ 82;
        lIllIIlIl[57] = (((14 + 78) - 30) + 78) ^ (((24 + 33) - (-99)) + 12);
        lIllIIlIl[58] = (125 ^ 112) ^ (124 ^ 84);
        lIllIIlIl[59] = (-(68 ^ 117)) & (-8201) & 10815;
        lIllIIlIl[60] = (-20525) & 30205;
        lIllIIlIl[61] = (98 ^ 4) ^ (8 ^ 72);
        lIllIIlIl[62] = 72 ^ 111;
        lIllIIlIl[63] = 239 ^ 199;
        lIllIIlIl[64] = 143 ^ 166;
        lIllIIlIl[65] = (12 ^ 27) ^ (181 ^ 136);
        lIllIIlIl[66] = (-13520) & 16127;
        lIllIIlIl[67] = (-2561) & 12232;
        lIllIIlIl[68] = (195 ^ 128) ^ (61 ^ 85);
        lIllIIlIl[69] = (22 ^ 15) ^ (11 ^ 62);
        lIllIIlIl[70] = (210 ^ 194) ^ (62 ^ 3);
        lIllIIlIl[71] = 5 ^ 43;
        lIllIIlIl[72] = (55 ^ 122) ^ (165 ^ 199);
        lIllIIlIl[73] = 9 ^ 57;
        lIllIIlIl[74] = (120 ^ 40) ^ (0 ^ 97);
        lIllIIlIl[75] = 5 ^ 54;
        lIllIIlIl[76] = 156 ^ 168;
        lIllIIlIl[77] = 82 ^ 103;
        lIllIIlIl[78] = (23 ^ 7) ^ (56 ^ 30);
        lIllIIlIl[79] = (11 ^ 101) ^ (237 ^ 180);
        lIllIIlIl[80] = 140 ^ 180;
        lIllIIlIl[81] = (((137 + 97) - 106) + 47) ^ (((132 + 49) - 98) + 67);
        lIllIIlIl[82] = (93 ^ 97) ^ (55 ^ 49);
        lIllIIlIl[83] = (88 ^ 12) ^ (116 ^ 27);
        lIllIIlIl[84] = (102 ^ 29) ^ (1 ^ 70);
        lIllIIlIl[85] = 164 ^ 153;
        lIllIIlIl[86] = (((152 + 149) - 276) + 138) ^ (((133 + 30) - 24) + 18);
        lIllIIlIl[87] = 93 ^ 98;
        lIllIIlIl[88] = (((11 + 5) - (-144)) + 82) ^ (((161 + 121) - 268) + 164);
        lIllIIlIl[89] = 88 ^ 25;
        lIllIIlIl[90] = 64 ^ 2;
        lIllIIlIl[91] = (-9633) & 30652;
        lIllIIlIl[92] = (-6145) & 7594;
        lIllIIlIl[93] = (-((-16653) & 31102)) & (-16385) & 32383;
        lIllIIlIl[94] = (-((-2261) & 6357)) & (-258) & 16333;
        lIllIIlIl[95] = (-3140) & 28139;
        lIllIIlIl[96] = (-13196) & 29695;
        lIllIIlIl[97] = 15 ^ 107;
        lIllIIlIl[98] = 70 ^ 5;
        lIllIIlIl[99] = 105 ^ 45;
        lIllIIlIl[100] = (218 ^ 178) ^ (234 ^ 199);
        lIllIIlIl[101] = 3 ^ 69;
        lIllIIlIl[102] = (-((-23050) & 32351)) & (-4483) & 16351;
        lIllIIlIl[103] = (-((-13789) & 30205)) & (-12305) & 31991;
        lIllIIlIl[104] = ((77 + 8) - (-115)) + 23;
        lIllIIlIl[105] = (-((-263) & 30207)) & (-5) & 32510;
        lIllIIlIl[106] = (-((-2053) & 15166)) & (-16385) & 32763;
        lIllIIlIl[107] = 244 ^ 179;
        lIllIIlIl[108] = (157 ^ 130) ^ (196 ^ 147);
        lIllIIlIl[109] = 107 ^ 34;
        lIllIIlIl[110] = 239 ^ 165;
        lIllIIlIl[111] = (((157 + 60) - 213) + 196) ^ (((114 + 69) - 96) + 44);
        lIllIIlIl[112] = (185 ^ 168) ^ (41 ^ 116);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009f, code lost:
        if (lIIlIllIIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[6]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0130, code lost:
        if (lIIlIllIIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[6]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01fa, code lost:
        if (lIIlIllIIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[4]) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x027e, code lost:
        if (lIIlIllIIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[4]) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIllIIlIl[0]];
        iArr5[lIllIIlIl[1]] = lIllIIlIl[14];
        if (lIIlIllIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIllIIlIl[14], lIllIIlIl[0], lIllIIlIl[91]));
            "".length();
        }
        int[] iArr6 = new int[lIllIIlIl[0]];
        iArr6[lIllIIlIl[1]] = lIllIIlIl[5];
        if (lIIlIlIlllll(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIllIIlIl[0]];
            iArr7[lIllIIlIl[1]] = lIllIIlIl[5];
            if (lIIlIlIlllll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIllIIlIl[0]];
                iArr8[lIllIIlIl[1]] = lIllIIlIl[5];
            }
            iArr = new int[lIllIIlIl[0]];
            iArr[lIllIIlIl[1]] = lIllIIlIl[13];
            if (lIIlIlIlllll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[lIllIIlIl[0]];
                iArr9[lIllIIlIl[1]] = lIllIIlIl[13];
                if (lIIlIlIlllll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIllIIlIl[0]];
                    iArr10[lIllIIlIl[1]] = lIllIIlIl[13];
                }
                if (lIIlIllIIIIl(Bank.contains(item -> {
                    return item.getName().toLowerCase().contains(lIllIIIll[lIllIIlIl[99]]);
                }) ? 1 : 0)) {
                    bv.add(new C0003d(lIllIIlIl[94], lIllIIlIl[12], lIllIIlIl[95]));
                    "".length();
                }
                iArr2 = new int[lIllIIlIl[0]];
                iArr2[lIllIIlIl[1]] = lIllIIlIl[7];
                if (lIIlIlIlllll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr11 = new int[lIllIIlIl[0]];
                    iArr11[lIllIIlIl[1]] = lIllIIlIl[7];
                    if (lIIlIlIlllll(Bank.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lIllIIlIl[0]];
                        iArr12[lIllIIlIl[1]] = lIllIIlIl[7];
                    }
                    iArr3 = new int[lIllIIlIl[0]];
                    iArr3[lIllIIlIl[1]] = lIllIIlIl[8];
                    if (lIIlIlIlllll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr13 = new int[lIllIIlIl[0]];
                        iArr13[lIllIIlIl[1]] = lIllIIlIl[8];
                        if (lIIlIlIlllll(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lIllIIlIl[0]];
                            iArr14[lIllIIlIl[1]] = lIllIIlIl[8];
                        }
                        iArr4 = new int[lIllIIlIl[0]];
                        iArr4[lIllIIlIl[1]] = lIllIIlIl[9];
                        if (lIIlIlIlllll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr15 = new int[lIllIIlIl[0]];
                            iArr15[lIllIIlIl[1]] = lIllIIlIl[9];
                            if (!lIIlIlIlllll(Bank.contains(iArr15) ? 1 : 0)) {
                                return;
                            }
                            int[] iArr16 = new int[lIllIIlIl[0]];
                            iArr16[lIllIIlIl[1]] = lIllIIlIl[9];
                            if (!lIIlIllIIIII(Bank.getFirst(iArr16).getQuantity(), lIllIIlIl[10])) {
                                return;
                            }
                        }
                        bv.add(new C0003d(lIllIIlIl[9], lIllIIlIl[63], C0004e.c(lIllIIlIl[92], lIllIIlIl[93])));
                        "".length();
                    }
                    bv.add(new C0003d(lIllIIlIl[8], lIllIIlIl[4], lIllIIlIl[96]));
                    "".length();
                    iArr4 = new int[lIllIIlIl[0]];
                    iArr4[lIllIIlIl[1]] = lIllIIlIl[9];
                    if (lIIlIlIlllll(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIllIIlIl[9], lIllIIlIl[63], C0004e.c(lIllIIlIl[92], lIllIIlIl[93])));
                    "".length();
                }
                bv.add(new C0003d(lIllIIlIl[7], lIllIIlIl[4], C0008i.bq));
                "".length();
                iArr3 = new int[lIllIIlIl[0]];
                iArr3[lIllIIlIl[1]] = lIllIIlIl[8];
                if (lIIlIlIlllll(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIllIIlIl[8], lIllIIlIl[4], lIllIIlIl[96]));
                "".length();
                iArr4 = new int[lIllIIlIl[0]];
                iArr4[lIllIIlIl[1]] = lIllIIlIl[9];
                if (lIIlIlIlllll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIllIIlIl[9], lIllIIlIl[63], C0004e.c(lIllIIlIl[92], lIllIIlIl[93])));
                "".length();
            }
            bv.add(new C0003d(lIllIIlIl[13], lIllIIlIl[6], C0004e.c(lIllIIlIl[92], lIllIIlIl[93])));
            "".length();
            if (lIIlIllIIIIl(Bank.contains(item2 -> {
                return item2.getName().toLowerCase().contains(lIllIIIll[lIllIIlIl[99]]);
            }) ? 1 : 0)) {
            }
            iArr2 = new int[lIllIIlIl[0]];
            iArr2[lIllIIlIl[1]] = lIllIIlIl[7];
            if (lIIlIlIlllll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllIIlIl[7], lIllIIlIl[4], C0008i.bq));
            "".length();
            iArr3 = new int[lIllIIlIl[0]];
            iArr3[lIllIIlIl[1]] = lIllIIlIl[8];
            if (lIIlIlIlllll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllIIlIl[8], lIllIIlIl[4], lIllIIlIl[96]));
            "".length();
            iArr4 = new int[lIllIIlIl[0]];
            iArr4[lIllIIlIl[1]] = lIllIIlIl[9];
            if (lIIlIlIlllll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllIIlIl[9], lIllIIlIl[63], C0004e.c(lIllIIlIl[92], lIllIIlIl[93])));
            "".length();
        }
        bv.add(new C0003d(lIllIIlIl[5], lIllIIlIl[6], C0004e.c(lIllIIlIl[92], lIllIIlIl[93])));
        "".length();
        iArr = new int[lIllIIlIl[0]];
        iArr[lIllIIlIl[1]] = lIllIIlIl[13];
        if (lIIlIlIlllll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIlIl[13], lIllIIlIl[6], C0004e.c(lIllIIlIl[92], lIllIIlIl[93])));
        "".length();
        if (lIIlIllIIIIl(Bank.contains(item22 -> {
            return item22.getName().toLowerCase().contains(lIllIIIll[lIllIIlIl[99]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIllIIlIl[0]];
        iArr2[lIllIIlIl[1]] = lIllIIlIl[7];
        if (lIIlIlIlllll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIlIl[7], lIllIIlIl[4], C0008i.bq));
        "".length();
        iArr3 = new int[lIllIIlIl[0]];
        iArr3[lIllIIlIl[1]] = lIllIIlIl[8];
        if (lIIlIlIlllll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIlIl[8], lIllIIlIl[4], lIllIIlIl[96]));
        "".length();
        iArr4 = new int[lIllIIlIl[0]];
        iArr4[lIllIIlIl[1]] = lIllIIlIl[9];
        if (lIIlIlIlllll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIlIl[9], lIllIIlIl[63], C0004e.c(lIllIIlIl[92], lIllIIlIl[93])));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlIllIIlII(C0004e.j(dj), lIllIIlIl[20]) && lIIlIllIIIIl(dk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            ?? r0 = lIllIIlIl[0];
            "".length();
            return ((182 ^ 172) ^ (70 ^ 88)) > ((220 ^ 175) ^ (248 ^ 143)) ? ((39 ^ 24) ^ (228 ^ 130)) & (((((70 + 22) - 31) + 147) ^ (((113 + 54) - 114) + 84)) ^ (-" ".length())) : r0;
        }
        return lIllIIlIl[1];
    }

    private static boolean lIIlIllIIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIllIIlll(int i, int i2) {
        return i <= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIllIIIll[lIllIIlIl[98]];
    }

    private static boolean lIIlIllIIIlI(Object obj) {
        return obj != null;
    }

    private static String lIIlIlIlIlll(String llIlllIIlIlIII, String llIlllIIlIIlll) {
        String llIlllIIlIlIII2 = new String(Base64.getDecoder().decode(llIlllIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIlllIIlIIlIl = llIlllIIlIIlll.toCharArray();
        int llIlllIIlIIlII = lIllIIlIl[1];
        char[] charArray = llIlllIIlIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIllIIlIl[1];
        while (lIIlIllIIIII(i, length)) {
            char llIlllIIlIlIIl = charArray[i];
            sb.append((char) (llIlllIIlIlIIl ^ llIlllIIlIIlIl[llIlllIIlIIlII % llIlllIIlIIlIl.length]));
            "".length();
            llIlllIIlIIlII++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIllIIlIl(int i) {
        return i < 0;
    }

    private static boolean lIIlIlIlllll(int i) {
        return i != 0;
    }

    private static boolean lIIlIllIlIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x0cd8, code lost:
        if (lIIlIllIIIlI(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0158, code lost:
        if (lIIlIllIIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[6]) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019a, code lost:
        if (lIIlIllIIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[4]) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01dc, code lost:
        if (lIIlIllIIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[4]) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021f, code lost:
        if (lIIlIllIIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[10]) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0222, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIIll[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[11]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0023x.lIllIIlIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v398, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v437, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v474, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v509, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v653, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v674, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v702, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aV() {
        if (lIIlIlIlllll(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIlIllIIIII(bv.size(), lIllIIlIl[0])) {
                System.out.println(lIllIIIll[lIllIIlIl[1]]);
                bt = lIllIIlIl[1];
            }
        }
        if (lIIlIllIIIIl(bt ? 1 : 0)) {
            if (lIIlIllIIIIl(ab() ? 1 : 0) && lIIlIllIIIII(C0004e.j(dj), lIllIIlIl[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIllIIIlI(nearest) && lIIlIllIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[0]];
                    C0000a.a(nearest);
                }
                if (lIIlIllIIIlI(nearest) && lIIlIlIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIllIIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIlIl[2]);
                        "".length();
                    }
                    if (lIIlIlIlllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[3]];
                        if (lIIlIllIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIIlIl[4]);
                            "".length();
                        }
                        if (lIIlIllIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIIlIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIllIIlIl[0]];
                        iArr[lIllIIlIl[1]] = lIllIIlIl[5];
                        if (lIIlIlIlllll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIllIIlIl[0]];
                            iArr2[lIllIIlIl[1]] = lIllIIlIl[5];
                        }
                        int[] iArr3 = new int[lIllIIlIl[0]];
                        iArr3[lIllIIlIl[1]] = lIllIIlIl[7];
                        if (lIIlIlIlllll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIllIIlIl[0]];
                            iArr4[lIllIIlIl[1]] = lIllIIlIl[7];
                        }
                        int[] iArr5 = new int[lIllIIlIl[0]];
                        iArr5[lIllIIlIl[1]] = lIllIIlIl[8];
                        if (lIIlIlIlllll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIllIIlIl[0]];
                            iArr6[lIllIIlIl[1]] = lIllIIlIl[8];
                        }
                        int[] iArr7 = new int[lIllIIlIl[0]];
                        iArr7[lIllIIlIl[1]] = lIllIIlIl[9];
                        if (lIIlIlIlllll(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIllIIlIl[0]];
                            iArr8[lIllIIlIl[1]] = lIllIIlIl[9];
                        }
                        int[] iArr9 = new int[lIllIIlIl[12]];
                        iArr9[lIllIIlIl[1]] = lIllIIlIl[9];
                        iArr9[lIllIIlIl[0]] = lIllIIlIl[5];
                        iArr9[lIllIIlIl[3]] = lIllIIlIl[13];
                        iArr9[lIllIIlIl[11]] = lIllIIlIl[7];
                        iArr9[lIllIIlIl[4]] = lIllIIlIl[14];
                        if (lIIlIllIIIIl(C0004e.b(iArr9) ? 1 : 0)) {
                            af();
                            System.out.println(lIllIIIll[lIllIIlIl[4]]);
                            bt = lIllIIlIl[0];
                            return;
                        }
                        int[] iArr10 = new int[lIllIIlIl[12]];
                        iArr10[lIllIIlIl[1]] = lIllIIlIl[9];
                        iArr10[lIllIIlIl[0]] = lIllIIlIl[5];
                        iArr10[lIllIIlIl[3]] = lIllIIlIl[13];
                        iArr10[lIllIIlIl[11]] = lIllIIlIl[7];
                        iArr10[lIllIIlIl[4]] = lIllIIlIl[14];
                        if (lIIlIlIlllll(C0004e.b(iArr10) ? 1 : 0)) {
                            C0000a.a(lIllIIlIl[7], lIllIIlIl[4]);
                            C0000a.a(lIllIIlIl[8], lIllIIlIl[3]);
                            C0000a.a(lIllIIlIl[9], lIllIIlIl[6]);
                            C0000a.a(lIllIIlIl[5], lIllIIlIl[6]);
                            C0000a.a(lIllIIlIl[13], lIllIIlIl[6]);
                            C0000a.a(lIllIIlIl[14], lIllIIlIl[0]);
                        }
                    }
                }
            }
            if (lIIlIlIlllll(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlIllIIIII(Movement.getRunEnergy(), lIllIIlIl[15])) {
                Inventory.getFirst(C0005f.aV).interact(lIllIIIll[lIllIIlIl[12]]);
                Time.sleepTicks(lIllIIlIl[0]);
                "".length();
            }
            if (lIIlIlIlllll(Inventory.contains(C0005f.aS) ? 1 : 0) && lIIlIllIIIII(Prayers.getPoints(), lIllIIlIl[16])) {
                Inventory.getFirst(C0005f.aS).interact(lIllIIIll[lIllIIlIl[17]]);
            }
            if (lIIlIllIIlIl(lIIlIlIllllI(C0004e.u(), 60.0d))) {
                String[] strArr = new String[lIllIIlIl[0]];
                strArr[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[18]];
                if (lIIlIlIlllll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIllIIlIl[0]];
                    strArr2[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[19]];
                    Inventory.getFirst(strArr2).interact(lIllIIIll[lIllIIlIl[20]]);
                    Time.sleepTicks(lIllIIlIl[3]);
                    "".length();
                }
            }
            if (lIIlIlIlllll(ab() ? 1 : 0) && lIIlIllIIIIl(C0004e.j(dj))) {
                if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                    AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[6]];
                    if (lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIllIIlIl[0]);
                    "".length();
                }
                if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                    String[] strArr3 = new String[lIllIIlIl[0]];
                    strArr3[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[21]];
                    NPC nearest2 = NPCs.getNearest(strArr3);
                    if (lIIlIllIIIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        Movement.walkTo(nearest2.getWorldLocation());
                        "".length();
                        Time.sleepTicks(lIllIIlIl[0]);
                        "".length();
                    }
                    if (lIIlIlIlllll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        C0006g.a(lIllIIIll[lIllIIlIl[22]], bR);
                    }
                }
            }
            if (lIIlIllIlIII(C0004e.j(dj), lIllIIlIl[3])) {
                if (lIIlIllIIIIl(de ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIllIIlIl[23], lIllIIlIl[24], lIllIIlIl[1]);
                    if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIlIl[3])) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[25]];
                        Movement.walkTo(worldPoint);
                        "".length();
                        Time.sleepTicks(lIllIIlIl[0]);
                        "".length();
                    }
                    if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIlIl[3])) {
                        if (lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr4 = new String[lIllIIlIl[0]];
                            strArr4[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[26]];
                            TileObjects.getNearest(strArr4).interact(lIllIIIll[lIllIIlIl[10]]);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                        }
                        if (lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr5 = new String[lIllIIlIl[0]];
                            strArr5[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[27]];
                            C0006g.a(strArr5);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                            de = lIllIIlIl[0];
                        }
                    }
                }
                if (lIIlIlIlllll(de ? 1 : 0) && lIIlIllIIIIl(df ? 1 : 0)) {
                    WorldPoint worldPoint2 = new WorldPoint(lIllIIlIl[28], lIllIIlIl[29], lIllIIlIl[1]);
                    if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIIlIl[3])) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[30]];
                        Movement.walkTo(worldPoint2);
                        "".length();
                        Time.sleepTicks(lIllIIlIl[0]);
                        "".length();
                    }
                    if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIIlIl[3])) {
                        if (lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[lIllIIlIl[0]];
                            strArr6[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[31]];
                            TileObjects.getNearest(strArr6).interact(lIllIIIll[lIllIIlIl[32]]);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                        }
                        if (lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr7 = new String[lIllIIlIl[0]];
                            strArr7[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[33]];
                            C0006g.a(strArr7);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                            df = lIllIIlIl[0];
                        }
                    }
                }
                if (lIIlIlIlllll(de ? 1 : 0) && lIIlIlIlllll(df ? 1 : 0) && lIIlIllIIIIl(dg ? 1 : 0)) {
                    WorldPoint worldPoint3 = new WorldPoint(lIllIIlIl[34], lIllIIlIl[35], lIllIIlIl[1]);
                    if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIllIIlIl[3])) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[36]];
                        Movement.walkTo(worldPoint3);
                        "".length();
                        Time.sleepTicks(lIllIIlIl[0]);
                        "".length();
                    }
                    if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIllIIlIl[3])) {
                        if (lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr8 = new String[lIllIIlIl[0]];
                            strArr8[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[37]];
                            TileObjects.getNearest(strArr8).interact(lIllIIIll[lIllIIlIl[38]]);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                        }
                        if (lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr9 = new String[lIllIIlIl[0]];
                            strArr9[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[16]];
                            C0006g.a(strArr9);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                            dg = lIllIIlIl[0];
                        }
                    }
                }
                if (lIIlIlIlllll(de ? 1 : 0) && lIIlIlIlllll(df ? 1 : 0) && lIIlIlIlllll(dg ? 1 : 0) && lIIlIllIIIIl(dh ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIllIIlIl[39], lIllIIlIl[29], lIllIIlIl[1]);
                    if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIllIIlIl[3])) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[40]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(lIllIIlIl[0]);
                        "".length();
                    }
                    if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIllIIlIl[3])) {
                        if (lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr10 = new String[lIllIIlIl[0]];
                            strArr10[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[41]];
                            TileObjects.getNearest(strArr10).interact(lIllIIIll[lIllIIlIl[42]]);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                        }
                        if (lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr11 = new String[lIllIIlIl[0]];
                            strArr11[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[43]];
                            C0006g.a(strArr11);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                            dh = lIllIIlIl[0];
                        }
                    }
                }
                if (lIIlIlIlllll(de ? 1 : 0) && lIIlIlIlllll(df ? 1 : 0) && lIIlIlIlllll(dg ? 1 : 0) && lIIlIlIlllll(dh ? 1 : 0) && lIIlIllIIIIl(di ? 1 : 0)) {
                    WorldPoint worldPoint5 = new WorldPoint(lIllIIlIl[44], lIllIIlIl[45], lIllIIlIl[1]);
                    if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIllIIlIl[3])) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[46]];
                        Movement.walkTo(worldPoint5);
                        "".length();
                        Time.sleepTicks(lIllIIlIl[0]);
                        "".length();
                    }
                    if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIllIIlIl[3])) {
                        if (lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[lIllIIlIl[0]];
                            strArr12[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[47]];
                            TileObjects.getNearest(strArr12).interact(lIllIIIll[lIllIIlIl[48]]);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                        }
                        if (lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr13 = new String[lIllIIlIl[0]];
                            strArr13[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[49]];
                            C0006g.a(strArr13);
                            Time.sleepTicks(lIllIIlIl[11]);
                            "".length();
                            di = lIllIIlIl[0];
                        }
                    }
                }
                if (lIIlIlIlllll(de ? 1 : 0) && lIIlIlIlllll(df ? 1 : 0) && lIIlIlIlllll(dg ? 1 : 0) && lIIlIlIlllll(dh ? 1 : 0) && lIIlIlIlllll(di ? 1 : 0)) {
                    WorldPoint worldPoint6 = new WorldPoint(lIllIIlIl[50], lIllIIlIl[51], lIllIIlIl[1]);
                    WorldArea worldArea = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                    if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint6), lIllIIlIl[12]) && lIIlIllIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[54]];
                        Movement.walkTo(worldPoint6);
                        "".length();
                        Time.sleepTicks(lIllIIlIl[0]);
                        "".length();
                    }
                    if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint6), lIllIIlIl[12])) {
                        String[] strArr14 = new String[lIllIIlIl[0]];
                        strArr14[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[55]];
                        TileObjects.getNearest(strArr14).interact(lIllIIIll[lIllIIlIl[56]]);
                        Time.sleepTicks(lIllIIlIl[4]);
                        "".length();
                    }
                    if (lIIlIlIlllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        C0006g.a(lIllIIIll[lIllIIlIl[57]], bR);
                    }
                }
            }
            if (lIIlIllIlIII(C0004e.j(dj), lIllIIlIl[11])) {
                C0006g.a(lIllIIIll[lIllIIlIl[58]], bR);
            }
            if (lIIlIllIlIII(C0004e.j(dj), lIllIIlIl[4])) {
                WorldArea worldArea2 = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                WorldArea worldArea3 = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                WorldPoint worldPoint7 = new WorldPoint(lIllIIlIl[50], lIllIIlIl[51], lIllIIlIl[1]);
                WorldPoint worldPoint8 = new WorldPoint(lIllIIlIl[59], lIllIIlIl[60], lIllIIlIl[1]);
                if (lIIlIlIlllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr15 = new String[lIllIIlIl[0]];
                    strArr15[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[61]];
                    TileObjects.getNearest(strArr15).interact(lIllIIIll[lIllIIlIl[62]]);
                    Time.sleepTicks(lIllIIlIl[11]);
                    "".length();
                }
                if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIllIIlIl[12])) {
                    String[] strArr16 = new String[lIllIIlIl[0]];
                    strArr16[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[63]];
                    TileObjects.getNearest(strArr16).interact(lIllIIIll[lIllIIlIl[64]]);
                    Time.sleepTicks(lIllIIlIl[4]);
                    "".length();
                }
                if (lIIlIllIIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr17 = new String[lIllIIlIl[0]];
                    strArr17[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[65]];
                }
                WorldPoint worldPoint9 = new WorldPoint(lIllIIlIl[66], lIllIIlIl[67], lIllIIlIl[1]);
                if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), lIllIIlIl[12]) && lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), lIllIIlIl[6])) {
                    AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[68]];
                    Movement.walkTo(worldPoint9);
                    "".length();
                    Time.sleepTicks(lIllIIlIl[0]);
                    "".length();
                }
                if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), lIllIIlIl[12])) {
                    if (lIIlIllIIlII(Skills.getLevel(Skill.PRAYER), lIllIIlIl[68]) && lIIlIllIIIll(Prayers.getPoints()) && lIIlIllIIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    C0004e.l(lIllIIlIl[14]);
                    String[] strArr18 = new String[lIllIIlIl[0]];
                    strArr18[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[69]];
                    NPC nearest3 = NPCs.getNearest(strArr18);
                    if (lIIlIllIIIlI(nearest3)) {
                        String[] strArr19 = new String[lIllIIlIl[0]];
                        strArr19[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[70]];
                        if (lIIlIlIlllll(nearest3.hasAction(strArr19) ? 1 : 0)) {
                            String[] strArr20 = new String[lIllIIlIl[0]];
                            strArr20[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[71]];
                            if (lIIlIllIIIIl(nearest3.hasAction(strArr20) ? 1 : 0)) {
                                C0006g.a(lIllIIIll[lIllIIlIl[72]], bR);
                            }
                        }
                    }
                    if (lIIlIllIIIlI(nearest3)) {
                        String[] strArr21 = new String[lIllIIlIl[0]];
                        strArr21[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[73]];
                        if (lIIlIlIlllll(nearest3.hasAction(strArr21) ? 1 : 0) && lIIlIllIlIIl(Players.getLocal().getInteracting())) {
                            nearest3.interact(lIllIIIll[lIllIIlIl[74]]);
                            Time.sleepTicks(lIllIIlIl[3]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIlIllIlIII(C0004e.j(dj), lIllIIlIl[17])) {
                if (lIIlIlIlllll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                String[] strArr22 = new String[lIllIIlIl[0]];
                strArr22[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[15]];
                if (lIIlIllIIIIl(Inventory.contains(strArr22) ? 1 : 0)) {
                    String[] strArr23 = new String[lIllIIlIl[0]];
                    strArr23[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[75]];
                    TileObject nearest4 = TileObjects.getNearest(strArr23);
                    if (lIIlIllIIIlI(nearest4)) {
                        String[] strArr24 = new String[lIllIIlIl[0]];
                        strArr24[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[76]];
                        if (lIIlIlIlllll(nearest4.hasAction(strArr24) ? 1 : 0)) {
                            nearest4.interact(lIllIIIll[lIllIIlIl[77]]);
                            Time.sleepTicks(lIllIIlIl[12]);
                            "".length();
                        }
                    }
                }
                String[] strArr25 = new String[lIllIIlIl[0]];
                strArr25[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[78]];
                if (lIIlIlIlllll(Inventory.contains(strArr25) ? 1 : 0)) {
                    if (lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[79]];
                        if (lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(bX);
                        "".length();
                        Time.sleepTicks(lIllIIlIl[0]);
                        "".length();
                    }
                    if (lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                        String[] strArr26 = new String[lIllIIlIl[0]];
                        strArr26[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[80]];
                        NPC nearest5 = NPCs.getNearest(strArr26);
                        if (lIIlIllIIIIl(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                            Movement.walkTo(nearest5.getWorldLocation());
                            "".length();
                            Time.sleepTicks(lIllIIlIl[0]);
                            "".length();
                        }
                        if (lIIlIlIlllll(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                            C0006g.a(lIllIIIll[lIllIIlIl[81]], bR);
                        }
                    }
                }
            }
            if (lIIlIllIlIII(C0004e.j(dj), lIllIIlIl[18])) {
                if (lIIlIllIIIIl(Players.getLocal().getWorldLocation().getPlane()) && lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr27 = new String[lIllIIlIl[0]];
                    strArr27[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[82]];
                    if (lIIlIllIIIlI(NPCs.getNearest(strArr27))) {
                        String[] strArr28 = new String[lIllIIlIl[0]];
                        strArr28[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[83]];
                        TileObject nearest6 = TileObjects.getNearest(strArr28);
                        if (lIIlIllIIIIl(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            Movement.walkTo(nearest6.getWorldLocation());
                            "".length();
                            Time.sleepTicks(lIllIIlIl[0]);
                            "".length();
                        }
                        if (lIIlIlIlllll(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            nearest6.interact(lIllIIIll[lIllIIlIl[84]]);
                        }
                    }
                }
                if (lIIlIllIlIII(Players.getLocal().getWorldLocation().getPlane(), lIllIIlIl[0])) {
                    if (lIIlIllIIIII(cl, lIllIIlIl[0])) {
                        an.mX += lIllIIlIl[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIllIIlIl[0];
                        an.mX = lIllIIlIl[1];
                    }
                    String[] strArr29 = new String[lIllIIlIl[0]];
                    strArr29[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[85]];
                    TileObject nearest7 = TileObjects.getNearest(strArr29);
                    if (lIIlIllIIIlI(nearest7)) {
                        if (lIIlIllIIIIl(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                            Movement.walkTo(nearest7.getWorldLocation());
                            "".length();
                            Time.sleepTicks(lIllIIlIl[0]);
                            "".length();
                        }
                        if (lIIlIlIlllll(Reachable.isInteractable(nearest7) ? 1 : 0) && lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr30 = new String[lIllIIlIl[0]];
                            strArr30[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[86]];
                            if (lIIlIlIlllll(nearest7.hasAction(strArr30) ? 1 : 0)) {
                                nearest7.interact(lIllIIIll[lIllIIlIl[87]]);
                                Time.sleepTicks(lIllIIlIl[0]);
                                "".length();
                            }
                            String[] strArr31 = new String[lIllIIlIl[0]];
                            strArr31[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[88]];
                            if (lIIlIlIlllll(nearest7.hasAction(strArr31) ? 1 : 0)) {
                                nearest7.interact(lIllIIIll[lIllIIlIl[89]]);
                                Time.sleepTicks(lIllIIlIl[0]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIlIllIIlII(C0004e.j(dj), lIllIIlIl[20]) && lIIlIlIlllll(dk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlllll(Inventory.contains(item -> {
                return item.getName().contains(lIllIIIll[lIllIIlIl[101]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item2 -> {
                    return item2.getName().contains(lIllIIIll[lIllIIlIl[100]]);
                }).interact(lIllIIIll[lIllIIlIl[90]]);
                Time.sleepTicks(C0004e.c(lIllIIlIl[17], lIllIIlIl[19]));
                "".length();
            }
            C0006g.a(bR);
        }
    }

    private static String lIIlIlIllIII(String llIlllIIIlIIll, String llIlllIIIlIIlI) {
        try {
            SecretKeySpec llIlllIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIllIIlIl[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIlIl[3], llIlllIIIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlllIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIIIlIlII) {
            llIlllIIIlIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIllIIlIl[1];
    }

    private static boolean lIIlIllIIIll(int i) {
        return i > 0;
    }

    private static boolean lIIlIllIlIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIllIIIII(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIlIlllIl();
        lIIlIlIlllII();
        bv = new ArrayList();
        bX = new WorldPoint(lIllIIlIl[102], lIllIIlIl[103], lIllIIlIl[1]);
        dj = lIllIIlIl[104];
        dk = new WorldArea(lIllIIlIl[105], lIllIIlIl[106], lIllIIlIl[27], lIllIIlIl[21], lIllIIlIl[1]);
        String[] strArr = new String[lIllIIlIl[12]];
        strArr[lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[107]];
        strArr[lIllIIlIl[0]] = lIllIIIll[lIllIIlIl[108]];
        strArr[lIllIIlIl[3]] = lIllIIIll[lIllIIlIl[109]];
        strArr[lIllIIlIl[11]] = lIllIIIll[lIllIIlIl[110]];
        strArr[lIllIIlIl[4]] = lIllIIIll[lIllIIlIl[111]];
        bR = strArr;
    }
}
