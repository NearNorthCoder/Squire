package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/l.class */
public class C0011l implements F {
    private static /* synthetic */ int[] llIlIlII;
    private static /* synthetic */ String[] llIlIIIl;
    public static /* synthetic */ List<C0003d> bB;
    static /* synthetic */ WorldPoint bE;
    static /* synthetic */ WorldPoint bD;
    static /* synthetic */ WorldArea bC;
    public static /* synthetic */ boolean bz;
    public static /* synthetic */ boolean bA;

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llIlIIIl[llIlIlII[72]];
    }

    private static boolean lIllIIIIlII(int i) {
        return i < 0;
    }

    public static void aa() {
        if (lIlIlllllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIllllllI(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llIlIIIl[llIlIlII[40]];
            Movement.walkTo(bD);
            "".length();
            Time.sleepTicks(llIlIlII[1]);
            "".length();
        }
        if (lIlIlllllII(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            ab();
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            Z();
            "".length();
            if ((((53 ^ 121) ^ (104 ^ 32)) & (((91 ^ 0) ^ (37 ^ 122)) ^ (-" ".length()))) > 0) {
                return ((((73 + 150) - 166) + 114) ^ (((10 + 118) - 106) + 158)) & (((((137 + 182) - 214) + 83) ^ (((143 + 67) - 188) + 141)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlIlII[67];
    }

    private static String lIlIlllIllI(String lIlIIllIlIllIll, String lIlIIllIlIllIlI) {
        try {
            SecretKeySpec lIlIIllIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIlIllIlI.getBytes(StandardCharsets.UTF_8)), llIlIlII[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlII[2], lIlIIllIlIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIllIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllIlIlllII) {
            lIlIIllIlIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIllllllI(int i) {
        return i == 0;
    }

    private static String lIlIlllIlIl(String lIlIIlllIIIIIII, String lIlIIllIlllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlllIIIIIlI = Cipher.getInstance("Blowfish");
            lIlIIlllIIIIIlI.init(llIlIlII[2], secretKeySpec);
            return new String(lIlIIlllIIIIIlI.doFinal(Base64.getDecoder().decode(lIlIIlllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlllIIIIIIl) {
            lIlIIlllIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIlIlllIlII(String lIlIIllIlllIIII, String lIlIIllIllIllll) {
        String lIlIIllIlllIIII2 = new String(Base64.getDecoder().decode(lIlIIllIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIllIllIlllI = new StringBuilder();
        char[] lIlIIllIllIllIl = lIlIIllIllIllll.toCharArray();
        int lIlIIllIllIllII = llIlIlII[0];
        char[] charArray = lIlIIllIlllIIII2.toCharArray();
        int length = charArray.length;
        int i = llIlIlII[0];
        while (lIlIlllllIl(i, length)) {
            lIlIIllIllIlllI.append((char) (charArray[i] ^ lIlIIllIllIllIl[lIlIIllIllIllII % lIlIIllIllIllIl.length]));
            "".length();
            lIlIIllIllIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIlIIllIllIlllI);
    }

    private static boolean lIlIlllllII(int i) {
        return i != 0;
    }

    private static void lIlIllllIll() {
        llIlIlII = new int[82];
        llIlIlII[0] = ((((148 + 11) - 93) + 104) ^ (((123 + 83) - 98) + 65)) & (((((29 + 71) - (-44)) + 18) ^ (((64 + 157) - 87) + 31)) ^ (-" ".length()));
        llIlIlII[1] = " ".length();
        llIlIlII[2] = "  ".length();
        llIlIlII[3] = "   ".length();
        llIlIlII[4] = (-((-13289) & 15343)) & (-16466) & 23519;
        llIlIlII[5] = (25 ^ 121) ^ (250 ^ 158);
        llIlIlII[6] = (98 ^ 93) ^ (6 ^ 14);
        llIlIlII[7] = (-11601) & 12158;
        llIlIlII[8] = (-4097) & 5596;
        llIlIlII[9] = (-22741) & 23295;
        llIlIlII[10] = (-((-273) & 22332)) & (-8193) & 32751;
        llIlIlII[11] = (-((-5683) & 32691)) & (-1107) & 28671;
        llIlIlII[12] = (-((-24779) & 31199)) & (-8193) & 15166;
        llIlIlII[13] = (-16939) & 21438;
        llIlIlII[14] = (-29761) & 30323;
        llIlIlII[15] = (-18437) & 31061;
        llIlIlII[16] = (-((-23631) & 31999)) & (-16387) & 32763;
        llIlIlII[17] = 80 ^ 85;
        llIlIlII[18] = (-4097) & 4475;
        llIlIlII[19] = 53 ^ 44;
        llIlIlII[20] = (-((-355) & 15335)) & (-16401) & 32767;
        llIlIlII[21] = (-((-16526) & 30943)) & (-17667) & 32639;
        llIlIlII[22] = (-((-21281) & 22439)) & (-6153) & 7871;
        llIlIlII[23] = (((47 + 90) - 122) + 115) ^ (((170 + 52) - 199) + 165);
        llIlIlII[24] = 19 ^ 21;
        llIlIlII[25] = 175 ^ 176;
        llIlIlII[26] = (((148 + 131) - 191) + 96) ^ (((175 + 71) - 59) + 4);
        llIlIlII[27] = -" ".length();
        llIlIlII[28] = 104 ^ 77;
        llIlIlII[29] = 203 ^ 195;
        llIlIlII[30] = (235 ^ 192) ^ (85 ^ 83);
        llIlIlII[31] = 19 ^ 26;
        llIlIlII[32] = 122 ^ 112;
        llIlIlII[33] = 49 ^ 58;
        llIlIlII[34] = 64 ^ 76;
        llIlIlII[35] = (178 ^ 146) ^ (67 ^ 92);
        llIlIlII[36] = 121 ^ 116;
        llIlIlII[37] = (-4286) & 4605;
        llIlIlII[38] = (-((-17153) & 28590)) & (-257) & 12223;
        llIlIlII[39] = (-((-7209) & 23658)) & (-8193) & 28141;
        llIlIlII[40] = 92 ^ 82;
        llIlIlII[41] = (80 ^ 1) ^ (153 ^ 199);
        llIlIlII[42] = (155 ^ 128) ^ (34 ^ 41);
        llIlIlII[43] = (((54 + 58) - (-18)) + 22) ^ (((73 + 109) - 76) + 31);
        llIlIlII[44] = (-8337) & 9717;
        llIlIlII[45] = (109 ^ 114) ^ (126 ^ 115);
        llIlIlII[46] = 80 ^ 67;
        llIlIlII[47] = 135 ^ 147;
        llIlIlII[48] = (-30732) & 31007;
        llIlIlII[49] = (-((-7) & 15791)) & (-3) & 16379;
        llIlIlII[50] = (212 ^ 188) ^ (32 ^ 82);
        llIlIlII[51] = (((83 + 54) - 46) + 87) ^ (((104 + 34) - 52) + 81);
        llIlIlII[52] = 189 ^ 171;
        llIlIlII[53] = (((5 ^ 91) + (((85 + 109) - 61) + 2)) - (((53 + 92) - 1) + 23)) + ((72 + 84) - 18) + 1;
        llIlIlII[54] = (152 ^ 170) ^ (3 ^ 38);
        llIlIlII[55] = (((30 + 39) - 32) + 109) ^ (((71 + 137) - 129) + 59);
        llIlIlII[56] = (89 ^ 81) ^ (100 ^ 119);
        llIlIlII[57] = (-3080) & 4079;
        llIlIlII[58] = (((((66 + 102) - 17) + 14) + (208 ^ 167)) - ((-26789) & 27046)) + ((35 + 129) - 128) + 108;
        llIlIlII[59] = (-16464) & 20463;
        llIlIlII[60] = (-14350) & 16349;
        llIlIlII[61] = (-((-2066) & 31827)) & (-7) & 32767;
        llIlIlII[62] = (-16674) & 29173;
        llIlIlII[63] = (-17187) & 32686;
        llIlIlII[64] = 76 ^ 52;
        llIlIlII[65] = (((60 ^ 51) + (((3 + 131) - 25) + 27)) - (250 ^ 167)) + (219 ^ 135);
        llIlIlII[66] = (-17448) & 32447;
        llIlIlII[67] = 51 ^ 87;
        llIlIlII[68] = (-((-9428) & 25847)) & (-273) & 28671;
        llIlIlII[69] = (-(27 ^ 72)) & (-513) & 25594;
        llIlIlII[70] = (-(((10 + 75) - 34) + 118)) & (-8209) & 16383;
        llIlIlII[71] = (-((-29190) & 30303)) & (-28675) & 30687;
        llIlIlII[72] = 41 ^ 53;
        llIlIlII[73] = (167 ^ 157) ^ (229 ^ 188);
        llIlIlII[74] = (((151 + 153) - 257) + 115) ^ (((117 + 47) - 137) + 164);
        llIlIlII[75] = (((102 + 78) - 26) + 25) ^ (((128 + 137) - 137) + 45);
        llIlIlII[76] = (-1042) & 4063;
        llIlIlII[77] = (-28697) & 31995;
        llIlIlII[78] = (-((-2771) & 24315)) & (-1) & 24575;
        llIlIlII[79] = (-25347) & 28651;
        llIlIlII[80] = (-20742) & 23903;
        llIlIlII[81] = (-29185) & 32671;
    }

    private static boolean lIlIlllllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llIlIlII[0];
    }

    private static void ag() {
        if (lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6])) {
            int[] iArr = new int[llIlIlII[1]];
            iArr[llIlIlII[0]] = llIlIlII[14];
            if (lIlIllllllI(Bank.contains(iArr) ? 1 : 0)) {
                bB.add(new C0003d(llIlIlII[14], llIlIlII[57], llIlIlII[58]));
                "".length();
            }
            int[] iArr2 = new int[llIlIlII[1]];
            iArr2[llIlIlII[0]] = llIlIlII[7];
            if (lIlIllllllI(Bank.contains(iArr2) ? 1 : 0)) {
                bB.add(new C0003d(llIlIlII[7], llIlIlII[59], llIlIlII[24]));
                "".length();
            }
            int[] iArr3 = new int[llIlIlII[1]];
            iArr3[llIlIlII[0]] = llIlIlII[9];
            if (lIlIllllllI(Bank.contains(iArr3) ? 1 : 0)) {
                bB.add(new C0003d(llIlIlII[9], llIlIlII[60], llIlIlII[24]));
                "".length();
            }
            int[] iArr4 = new int[llIlIlII[1]];
            iArr4[llIlIlII[0]] = llIlIlII[11];
            if (lIlIllllllI(Bank.contains(iArr4) ? 1 : 0)) {
                bB.add(new C0003d(llIlIlII[11], llIlIlII[61], llIlIlII[24]));
                "".length();
            }
            int[] iArr5 = new int[llIlIlII[1]];
            iArr5[llIlIlII[0]] = llIlIlII[12];
            if (lIlIllllllI(Bank.contains(iArr5) ? 1 : 0)) {
                bB.add(new C0003d(llIlIlII[12], llIlIlII[4], llIlIlII[24]));
                "".length();
            }
            int[] iArr6 = new int[llIlIlII[1]];
            iArr6[llIlIlII[0]] = llIlIlII[44];
            if (lIlIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
                bB.add(new C0003d(llIlIlII[44], llIlIlII[1], C0004e.c(llIlIlII[62], llIlIlII[63])));
                "".length();
            }
        }
        if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6])) {
            int[] iArr7 = new int[llIlIlII[1]];
            iArr7[llIlIlII[0]] = llIlIlII[22];
            if (lIlIlllllII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIlIlII[1]];
                iArr8[llIlIlII[0]] = llIlIlII[22];
                if (lIlIlllllIl(Bank.getFirst(iArr8).getQuantity(), llIlIlII[61])) {
                    int i = llIlIlII[22];
                    int i2 = llIlIlII[61];
                    int[] iArr9 = new int[llIlIlII[1]];
                    iArr9[llIlIlII[0]] = llIlIlII[22];
                    bB.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), llIlIlII[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[llIlIlII[1]];
            iArr10[llIlIlII[0]] = llIlIlII[22];
            if (lIlIllllllI(Bank.contains(iArr10) ? 1 : 0)) {
                bB.add(new C0003d(llIlIlII[22], llIlIlII[61], llIlIlII[64]));
                "".length();
            }
            int[] iArr11 = new int[llIlIlII[1]];
            iArr11[llIlIlII[0]] = llIlIlII[23];
            if (lIlIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIlIlII[1]];
                iArr12[llIlIlII[0]] = llIlIlII[23];
                if (lIlIlllllIl(Bank.getFirst(iArr12).getQuantity(), llIlIlII[61])) {
                    int i3 = llIlIlII[23];
                    int i4 = llIlIlII[61];
                    int[] iArr13 = new int[llIlIlII[1]];
                    iArr13[llIlIlII[0]] = llIlIlII[23];
                    bB.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), llIlIlII[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[llIlIlII[1]];
            iArr14[llIlIlII[0]] = llIlIlII[23];
            if (lIlIllllllI(Bank.contains(iArr14) ? 1 : 0)) {
                bB.add(new C0003d(llIlIlII[23], llIlIlII[61], llIlIlII[65]));
                "".length();
            }
            int[] iArr15 = new int[llIlIlII[1]];
            iArr15[llIlIlII[0]] = llIlIlII[20];
            if (lIlIllllllI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llIlIlII[1]];
                iArr16[llIlIlII[0]] = llIlIlII[20];
                if (lIlIllllllI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bB.add(new C0003d(llIlIlII[20], llIlIlII[1], llIlIlII[66]));
                    "".length();
                }
            }
            if (lIlIlllllII(bA ? 1 : 0)) {
                int[] iArr17 = new int[llIlIlII[1]];
                iArr17[llIlIlII[0]] = llIlIlII[14];
                if (lIlIlllllII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIlIlII[1]];
                    iArr18[llIlIlII[0]] = llIlIlII[14];
                    if (lIlIlllllIl(Bank.getFirst(iArr18).getQuantity(), llIlIlII[61])) {
                        int i5 = llIlIlII[14];
                        int i6 = llIlIlII[61];
                        int[] iArr19 = new int[llIlIlII[1]];
                        iArr19[llIlIlII[0]] = llIlIlII[14];
                        bB.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), llIlIlII[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[llIlIlII[1]];
                iArr20[llIlIlII[0]] = llIlIlII[14];
                if (lIlIllllllI(Bank.contains(iArr20) ? 1 : 0)) {
                    bB.add(new C0003d(llIlIlII[14], llIlIlII[61], llIlIlII[58]));
                    "".length();
                }
                int[] iArr21 = new int[llIlIlII[1]];
                iArr21[llIlIlII[0]] = llIlIlII[21];
                if (lIlIlllllII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIlIlII[1]];
                    iArr22[llIlIlII[0]] = llIlIlII[21];
                    if (lIlIlllllIl(Bank.getFirst(iArr22).getQuantity(), llIlIlII[66])) {
                        int i7 = llIlIlII[21];
                        int i8 = llIlIlII[66];
                        int[] iArr23 = new int[llIlIlII[1]];
                        iArr23[llIlIlII[0]] = llIlIlII[21];
                        bB.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), llIlIlII[24]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[llIlIlII[1]];
                iArr24[llIlIlII[0]] = llIlIlII[21];
                if (lIlIllllllI(Bank.contains(iArr24) ? 1 : 0)) {
                    bB.add(new C0003d(llIlIlII[21], llIlIlII[66], llIlIlII[24]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[llIlIlII[1]];
        iArr25[llIlIlII[0]] = llIlIlII[18];
        if (lIlIllllllI(Bank.contains(iArr25) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlII[18], llIlIlII[67], llIlIlII[37]));
            "".length();
        }
        if (lIlIllllllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIIIl[llIlIlII[74]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlII[68], llIlIlII[17], llIlIlII[69]));
            "".length();
        }
        int[] iArr26 = new int[llIlIlII[1]];
        iArr26[llIlIlII[0]] = llIlIlII[70];
        if (lIlIllllllI(Bank.contains(iArr26) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlII[70], llIlIlII[32], llIlIlII[71]));
            "".length();
        }
        int[] iArr27 = new int[llIlIlII[1]];
        iArr27[llIlIlII[0]] = llIlIlII[16];
        if (lIlIllllllI(Bank.contains(iArr27) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlII[16], llIlIlII[32], llIlIlII[71]));
            "".length();
        }
    }

    private static boolean lIllIIIIlll(int i, int i2) {
        return i > i2;
    }

    private static void lIlIlllIlll() {
        llIlIIIl = new String[llIlIlII[25]];
        llIlIIIl[llIlIlII[0]] = lIlIlllIlII("AzkzKCYmbCM1LSw/", "ALJAH");
        llIlIIIl[llIlIlII[1]] = lIlIlllIlIl("sxHO5nFO3JAkt/kvIcgv83c/v7Oebfwhjwp2h0Gk4/SRqson+wfMjSqX3rRk/fcKc+0bDyOdDWY=", "JeuYp");
        llIlIIIl[llIlIlII[2]] = lIlIlllIlII("PjEkMTQRJDs2NFAkPXgxET45", "pPRXS");
        llIlIIIl[llIlIlII[3]] = lIlIlllIllI("uqSwIq2UHCZ4UApx44VhPOSiGQwHRShP", "vduQn");
        llIlIIIl[llIlIlII[5]] = lIlIlllIlIl("+zvHTc0l5WfGFrawHZ40i97Ti9aE7MkkMkJCA+vabwumK5xlpwWtYx4VGLs+4M6c", "HkrUK");
        llIlIIIl[llIlIlII[17]] = lIlIlllIlII("IAsBdxsBShQ4GB0=", "njwWo");
        llIlIIIl[llIlIlII[24]] = lIlIlllIlII("LA0NDTQGEBcLdw4WDh8=", "myylW");
        llIlIIIl[llIlIlII[26]] = lIlIlllIlII("GzslJjM2PXYkOyooOTExeC4zPj8=", "XZVRZ");
        llIlIIIl[llIlIlII[29]] = lIlIlllIlIl("kwAmLUsF2vpTjHDrb+joOwUTTN+3z8Pw", "sHLlV");
        llIlIIIl[llIlIlII[31]] = lIlIlllIlII("MAIXPxMdBEQtGx8PHWsOFg8B", "scdKz");
        llIlIIIl[llIlIlII[32]] = lIlIlllIllI("jnIS10jntpVE/7mN5FX1BKjQJY9TGBvA", "IXxEV");
        llIlIIIl[llIlIlII[33]] = lIlIlllIllI("WEehC9DE864=", "iIWGj");
        llIlIIIl[llIlIlII[34]] = lIlIlllIlII("IyMrLgs=", "tJNBo");
        llIlIIIl[llIlIlII[36]] = lIlIlllIllI("u2nNsj6b/Pn6UKe4oby11N6Gxrqqpr+H", "SKBgO");
        llIlIIIl[llIlIlII[40]] = lIlIlllIlII("IDgdeBEBeQg3Eh0=", "nYkXe");
        llIlIIIl[llIlIlII[41]] = lIlIlllIlII("BhIk", "CsPtt");
        llIlIIIl[llIlIlII[42]] = lIlIlllIlIl("eg9jHidkKzA=", "peOFC");
        llIlIIIl[llIlIlII[43]] = lIlIlllIlII("GQ4O", "zaycH");
        llIlIIIl[llIlIlII[45]] = lIlIlllIlIl("dIf9VVEvG+pndpyG04TQFA==", "FUNaR");
        llIlIIIl[llIlIlII[46]] = lIlIlllIllI("4Xhgi9r/XZU=", "mhUuf");
        llIlIIIl[llIlIlII[47]] = lIlIlllIllI("JmV0ehgeoiHG7riMXv+6sA==", "xbimp");
        llIlIIIl[llIlIlII[51]] = lIlIlllIllI("Ym4tB3A1Aja5mXFHZTvIiA5ArlXszFnw", "rREdP");
        llIlIIIl[llIlIlII[52]] = lIlIlllIlII("BQAhOikjSD0lPyoE", "FhNUZ");
        llIlIIIl[llIlIlII[54]] = lIlIlllIlIl("5J1/sIWfQpyXECH+6XKGvw==", "HDkgc");
        llIlIIIl[llIlIlII[55]] = lIlIlllIlII("Mhs6Bh5FKToRBQ4f", "ezNcl");
        llIlIIIl[llIlIlII[19]] = lIlIlllIlIl("rvdSwbFh6zyuAUPp9WwSbw==", "qKmZe");
        llIlIIIl[llIlIlII[50]] = lIlIlllIllI("gK98X3t0aGbc57pJsN5SPw==", "mLrRX");
        llIlIIIl[llIlIlII[56]] = lIlIlllIlIl("1rJUMgx8uMxXR0jBgTtfSw==", "FycUT");
        llIlIIIl[llIlIlII[72]] = lIlIlllIllI("K+JHy+Sw3Y4oTSG07Sf4nQ==", "dsEKC");
        llIlIIIl[llIlIlII[74]] = lIlIlllIllI("YV/hwr6h5WRB9x9407RLCpdiQnrO/4/U", "ParUH");
        llIlIIIl[llIlIlII[75]] = lIlIlllIlIl("hbUgVN2Fc+o=", "iIrzY");
    }

    private static boolean lIllIIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIIIIIl(int i, int i2) {
        return i >= i2;
    }

    static {
        lIlIllllIll();
        lIlIlllIlll();
        bB = new ArrayList();
        bC = new WorldArea(llIlIlII[76], llIlIlII[77], llIlIlII[47], llIlIlII[40], llIlIlII[0]);
        bD = new WorldPoint(llIlIlII[78], llIlIlII[79], llIlIlII[0]);
        bE = new WorldPoint(llIlIlII[80] + C0004e.c(llIlIlII[1], llIlIlII[5]), llIlIlII[81], llIlIlII[0]);
    }

    private static boolean lIlIlllllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIlllllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0208, code lost:
        if (lIlIlllllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x029c, code lost:
        if (lIlIlllllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0378, code lost:
        if (lIlIlllllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ad() {
        if (lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[19])) {
            int[] iArr = new int[llIlIlII[1]];
            iArr[llIlIlII[0]] = llIlIlII[7];
            if (lIlIlllllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlII[1]];
                iArr2[llIlIlII[0]] = llIlIlII[11];
                if (lIlIlllllII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlIlII[1]];
                    iArr3[llIlIlII[0]] = llIlIlII[9];
                    if (lIlIlllllII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIlIlII[1]];
                        iArr4[llIlIlII[0]] = llIlIlII[12];
                        if (lIlIlllllII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIlIlII[1]];
                            iArr5[llIlIlII[0]] = llIlIlII[18];
                            if (lIlIlllllII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIlIlII[1]];
                                iArr6[llIlIlII[0]] = llIlIlII[44];
                                if (lIlIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llIlIlII[1]];
                                    iArr7[llIlIlII[0]] = llIlIlII[44];
                                }
                                ?? r0 = llIlIlII[1];
                                "".length();
                                return " ".length() >= "  ".length() ? ((((42 + 153) - 110) + 121) ^ (((140 + 67) - 102) + 36)) & (((((69 + 167) - 193) + 198) ^ (((52 + 168) - 122) + 80)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return llIlIlII[0];
        } else if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[19]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6])) {
            int[] iArr8 = new int[llIlIlII[1]];
            iArr8[llIlIlII[0]] = llIlIlII[11];
            if (lIlIlllllII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIlIlII[1]];
                iArr9[llIlIlII[0]] = llIlIlII[9];
                if (lIlIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIlIlII[1]];
                    iArr10[llIlIlII[0]] = llIlIlII[12];
                    if (lIlIlllllII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIlIlII[1]];
                        iArr11[llIlIlII[0]] = llIlIlII[14];
                        if (lIlIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIlIlII[1]];
                            iArr12[llIlIlII[0]] = llIlIlII[44];
                            if (lIlIllllllI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIlIlII[1]];
                                iArr13[llIlIlII[0]] = llIlIlII[44];
                            }
                            ?? r02 = llIlIlII[1];
                            "".length();
                            return (-" ".length()) > 0 ? ((224 ^ 179) ^ (187 ^ 189)) & (((87 ^ 82) ^ (216 ^ 136)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llIlIlII[0];
        } else if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6]) && lIlIllllllI(bA ? 1 : 0)) {
            int[] iArr14 = new int[llIlIlII[1]];
            iArr14[llIlIlII[0]] = llIlIlII[20];
            if (lIlIllllllI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIlIlII[1]];
                iArr15[llIlIlII[0]] = llIlIlII[20];
            }
            int[] iArr16 = new int[llIlIlII[1]];
            iArr16[llIlIlII[0]] = llIlIlII[22];
            if (lIlIlllllII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIlIlII[1]];
                iArr17[llIlIlII[0]] = llIlIlII[23];
                if (lIlIlllllII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llIlIlII[1];
                    "".length();
                    return "  ".length() > "  ".length() ? ((((176 + 68) - 163) + 100) ^ (((6 + 115) - 76) + 105)) & (((110 ^ 127) ^ (101 ^ 87)) ^ (-" ".length())) : r03;
                }
            }
            return llIlIlII[0];
        } else if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6]) && lIlIlllllII(bA ? 1 : 0)) {
            int[] iArr18 = new int[llIlIlII[1]];
            iArr18[llIlIlII[0]] = llIlIlII[20];
            if (lIlIllllllI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIlIlII[1]];
                iArr19[llIlIlII[0]] = llIlIlII[20];
            }
            int[] iArr20 = new int[llIlIlII[1]];
            iArr20[llIlIlII[0]] = llIlIlII[14];
            if (lIlIlllllII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIlIlII[1]];
                iArr21[llIlIlII[0]] = llIlIlII[21];
                if (lIlIlllllII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIlIlII[1]];
                    iArr22[llIlIlII[0]] = llIlIlII[21];
                    if (lIllIIIIIIl(Bank.getFirst(iArr22).getQuantity(), llIlIlII[17])) {
                        int[] iArr23 = new int[llIlIlII[1]];
                        iArr23[llIlIlII[0]] = llIlIlII[22];
                        if (lIlIlllllII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIlIlII[1]];
                            iArr24[llIlIlII[0]] = llIlIlII[23];
                            if (lIlIlllllII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llIlIlII[1];
                                "".length();
                                return (10 ^ 14) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llIlIlII[0];
        } else {
            return llIlIlII[0];
        }
    }

    private static void ab() {
        if (lIllIIIIlII(lIllIIIIIll(C0004e.v(), 30.0d))) {
            int[] iArr = new int[llIlIlII[1]];
            iArr[llIlIlII[0]] = llIlIlII[18];
            if (lIlIlllllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlII[1]];
                iArr2[llIlIlII[0]] = llIlIlII[18];
                Inventory.getFirst(iArr2).interact(llIlIIIl[llIlIlII[41]]);
                Time.sleepTicks(llIlIlII[1]);
                "".length();
            }
        }
        if (lIllIIIIlIl(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIlllllII(npc.getName().contains(llIlIIIl[llIlIlII[75]]) ? 1 : 0) && lIlIllllllI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = llIlIlII[1];
                    "".length();
                    return (((67 ^ 25) ^ (161 ^ 198)) & (((159 ^ 139) ^ (7 ^ 46)) ^ (-" ".length()))) != 0 ? ((99 ^ 50) ^ (21 ^ 97)) & (((101 ^ 6) ^ (77 ^ 11)) ^ (-" ".length())) : r0;
                }
                return llIlIlII[0];
            });
            String[] strArr = new String[llIlIlII[2]];
            strArr[llIlIlII[0]] = llIlIIIl[llIlIlII[42]];
            strArr[llIlIlII[1]] = llIlIIIl[llIlIlII[43]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIllIIIIllI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = llIlIlII[1];
                    "".length();
                    return (-"  ".length()) > 0 ? ((16 ^ 40) ^ (203 ^ 188)) & (((46 ^ 83) ^ (38 ^ 20)) ^ (-" ".length())) : r0;
                }
                return llIlIlII[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[llIlIlII[1]];
            iArr3[llIlIlII[0]] = llIlIlII[44];
            if (lIlIlllllII(Equipment.contains(iArr3) ? 1 : 0) && lIlIllllllI(ae() ? 1 : 0)) {
                af();
            }
            if (lIlIlllllll(nearest) && lIlIllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderBarrows.c = llIlIIIl[llIlIlII[45]];
                nearest.interact(llIlIIIl[llIlIlII[46]]);
                Time.sleepTicks(llIlIlII[3]);
                "".length();
            }
        }
        if (lIlIlllllll(Players.getLocal().getInteracting())) {
            AccBuilderBarrows.c = llIlIIIl[llIlIlII[47]];
            Time.sleepTicks(llIlIlII[1]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[73])) {
            ?? r0 = llIlIlII[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlII[0];
    }

    private static int lIllIIIIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ae() {
        if (lIllIIIIIlI(Vars.getBit(llIlIlII[48]), llIlIlII[1]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[17])) {
            return llIlIlII[1];
        }
        if (lIllIIIIIlI(Vars.getBit(llIlIlII[48]), llIlIlII[2]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[31]) && lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[17])) {
            return llIlIlII[1];
        }
        if (lIllIIIIIlI(Vars.getBit(llIlIlII[48]), llIlIlII[3]) && lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[31]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[36])) {
            return llIlIlII[1];
        }
        if (lIllIIIIIlI(Vars.getBit(llIlIlII[48]), llIlIlII[3]) && lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[31])) {
            int[] iArr = new int[llIlIlII[1]];
            iArr[llIlIlII[0]] = llIlIlII[12];
            if (lIlIllllllI(Inventory.contains(iArr) ? 1 : 0)) {
                return llIlIlII[1];
            }
        }
        if (lIllIIIIIlI(Vars.getBit(llIlIlII[48]), llIlIlII[5]) && lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[36])) {
            int[] iArr2 = new int[llIlIlII[1]];
            iArr2[llIlIlII[0]] = llIlIlII[12];
            if (lIlIlllllII(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIlIlII[1];
            }
        }
        return llIlIlII[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIlllllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d4, code lost:
        if (lIlIlllllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0297, code lost:
        if (lIlIlllllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0351, code lost:
        if (lIlIlllllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        if (lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[19])) {
            int[] iArr = new int[llIlIlII[1]];
            iArr[llIlIlII[0]] = llIlIlII[7];
            if (lIlIlllllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlII[1]];
                iArr2[llIlIlII[0]] = llIlIlII[11];
                if (lIlIlllllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlIlII[1]];
                    iArr3[llIlIlII[0]] = llIlIlII[9];
                    if (lIlIlllllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIlIlII[1]];
                        iArr4[llIlIlII[0]] = llIlIlII[12];
                        if (lIlIlllllII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIlIlII[1]];
                            iArr5[llIlIlII[0]] = llIlIlII[18];
                            if (lIlIlllllII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIlIlII[1]];
                                iArr6[llIlIlII[0]] = llIlIlII[44];
                                if (lIlIllllllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llIlIlII[1]];
                                    iArr7[llIlIlII[0]] = llIlIlII[44];
                                }
                                ?? r0 = llIlIlII[1];
                                "".length();
                                return (-(116 ^ 113)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llIlIlII[0];
        } else if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[19]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6])) {
            int[] iArr8 = new int[llIlIlII[1]];
            iArr8[llIlIlII[0]] = llIlIlII[11];
            if (lIlIlllllII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIlIlII[1]];
                iArr9[llIlIlII[0]] = llIlIlII[9];
                if (lIlIlllllII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIlIlII[1]];
                    iArr10[llIlIlII[0]] = llIlIlII[12];
                    if (lIlIlllllII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIlIlII[1]];
                        iArr11[llIlIlII[0]] = llIlIlII[14];
                        if (lIlIlllllII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIlIlII[1]];
                            iArr12[llIlIlII[0]] = llIlIlII[44];
                            if (lIlIllllllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIlIlII[1]];
                                iArr13[llIlIlII[0]] = llIlIlII[44];
                            }
                            ?? r02 = llIlIlII[1];
                            "".length();
                            return ((((34 + 83) - (-5)) + 53) ^ (((120 + 8) - (-19)) + 24)) <= (-" ".length()) ? ((((103 + 28) - 41) + 59) ^ (((127 + 125) - 197) + 104)) & (((((78 + 120) - 181) + 169) ^ (((163 + 165) - 161) + 9)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llIlIlII[0];
        } else if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6]) && lIlIllllllI(bA ? 1 : 0)) {
            int[] iArr14 = new int[llIlIlII[1]];
            iArr14[llIlIlII[0]] = llIlIlII[20];
            if (lIlIllllllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIlIlII[1]];
                iArr15[llIlIlII[0]] = llIlIlII[20];
            }
            int[] iArr16 = new int[llIlIlII[1]];
            iArr16[llIlIlII[0]] = llIlIlII[22];
            if (lIlIlllllII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIlIlII[1]];
                iArr17[llIlIlII[0]] = llIlIlII[35];
                if (lIlIlllllII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llIlIlII[1];
                    "".length();
                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llIlIlII[0];
        } else if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6]) && lIlIlllllII(bA ? 1 : 0)) {
            int[] iArr18 = new int[llIlIlII[1]];
            iArr18[llIlIlII[0]] = llIlIlII[20];
            if (lIlIllllllI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIlIlII[1]];
                iArr19[llIlIlII[0]] = llIlIlII[20];
            }
            int[] iArr20 = new int[llIlIlII[1]];
            iArr20[llIlIlII[0]] = llIlIlII[14];
            if (lIlIlllllII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIlIlII[1]];
                iArr21[llIlIlII[0]] = llIlIlII[21];
                if (lIlIlllllII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIlIlII[1]];
                    iArr22[llIlIlII[0]] = llIlIlII[21];
                    if (lIllIIIIIIl(Inventory.getFirst(iArr22).getQuantity(), llIlIlII[17])) {
                        int[] iArr23 = new int[llIlIlII[1]];
                        iArr23[llIlIlII[0]] = llIlIlII[22];
                        if (lIlIlllllII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIlIlII[1]];
                            iArr24[llIlIlII[0]] = llIlIlII[35];
                            if (lIlIlllllII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llIlIlII[1];
                                "".length();
                                return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llIlIlII[0];
        } else {
            return llIlIlII[0];
        }
    }

    private static boolean lIllIIIIIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v386, types: [boolean] */
    public static void Z() {
        if (lIlIlllllII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llIlIIIl[llIlIlII[0]];
            C0001b.a(bB);
            if (lIlIlllllIl(bB.size(), llIlIlII[1])) {
                System.out.println(llIlIIIl[llIlIlII[1]]);
                bz = llIlIlII[0];
            }
        }
        if (lIlIllllllI(bz ? 1 : 0)) {
            if (lIlIllllllI(ac() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlllllll(nearest) && lIlIllllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[2]];
                    C0000a.a(nearest);
                }
                if (lIlIlllllll(nearest) && lIlIlllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[3]];
                    if (lIlIllllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIlII[4]);
                        "".length();
                    }
                    if (lIlIlllllII(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIIIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIlII[5]);
                            "".length();
                        }
                        while (lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6]) && lIlIllllllI(u.aV() ? 1 : 0)) {
                            u.aT();
                            Time.sleepTicks(llIlIlII[1]);
                            "".length();
                            "".length();
                            if (0 != 0) {
                                return;
                            }
                        }
                        if (lIlIllllllI(ad() ? 1 : 0)) {
                            ag();
                            System.out.println(llIlIIIl[llIlIlII[5]]);
                            bz = llIlIlII[1];
                            return;
                        }
                        if (lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6])) {
                            int[] iArr = new int[llIlIlII[1]];
                            iArr[llIlIlII[0]] = llIlIlII[7];
                            if (lIlIlllllII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIlIlII[1]];
                                iArr2[llIlIlII[0]] = llIlIlII[7];
                                if (lIlIlllllIl(Inventory.getCount(iArr2), llIlIlII[1])) {
                                    Bank.withdraw(llIlIlII[7], llIlIlII[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[llIlIlII[1]];
                                        iArr3[llIlIlII[0]] = llIlIlII[7];
                                        if (lIllIIIIIII(Inventory.getCount(iArr3))) {
                                            ?? r0 = llIlIlII[1];
                                            "".length();
                                            return ((((83 + 87) - 94) + 108) ^ (((174 + 33) - 198) + 179)) < " ".length() ? ((26 ^ 10) ^ (75 ^ 86)) & (((2 ^ 9) ^ (121 ^ 127)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlIlII[0];
                                    }, llIlIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[llIlIlII[1]];
                            iArr3[llIlIlII[0]] = llIlIlII[9];
                            if (lIlIlllllII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIlIlII[1]];
                                iArr4[llIlIlII[0]] = llIlIlII[9];
                                if (lIlIlllllIl(Inventory.getCount(iArr4), llIlIlII[1])) {
                                    Bank.withdraw(llIlIlII[9], llIlIlII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[llIlIlII[1]];
                                        iArr5[llIlIlII[0]] = llIlIlII[9];
                                        if (lIllIIIIIII(Inventory.getCount(iArr5))) {
                                            ?? r0 = llIlIlII[1];
                                            "".length();
                                            return !((true ^ true) ^ (true ^ true)) ? ((251 ^ 197) ^ (45 ^ 12)) & (((100 ^ 125) ^ (90 ^ 92)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlIlII[0];
                                    }, llIlIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[llIlIlII[1]];
                            iArr5[llIlIlII[0]] = llIlIlII[11];
                            if (lIlIlllllII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIlIlII[1]];
                                iArr6[llIlIlII[0]] = llIlIlII[11];
                                if (lIlIlllllIl(Inventory.getCount(iArr6), llIlIlII[1])) {
                                    Bank.withdraw(llIlIlII[11], llIlIlII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[llIlIlII[1]];
                                        iArr7[llIlIlII[0]] = llIlIlII[11];
                                        if (lIllIIIIIII(Inventory.getCount(iArr7))) {
                                            ?? r0 = llIlIlII[1];
                                            "".length();
                                            return ("   ".length() & ("   ".length() ^ (-1))) != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlIlII[0];
                                    }, llIlIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[llIlIlII[1]];
                            iArr7[llIlIlII[0]] = llIlIlII[12];
                            if (lIlIlllllII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIlIlII[1]];
                                iArr8[llIlIlII[0]] = llIlIlII[12];
                                if (lIlIlllllIl(Inventory.getCount(iArr8), llIlIlII[1])) {
                                    Bank.withdraw(llIlIlII[12], llIlIlII[13], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[llIlIlII[1]];
                                        iArr9[llIlIlII[0]] = llIlIlII[12];
                                        if (lIllIIIIIII(Inventory.getCount(iArr9))) {
                                            ?? r0 = llIlIlII[1];
                                            "".length();
                                            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlIlII[0];
                                    }, llIlIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[llIlIlII[1]];
                            iArr9[llIlIlII[0]] = llIlIlII[14];
                            if (lIlIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llIlIlII[1]];
                                iArr10[llIlIlII[0]] = llIlIlII[14];
                                if (lIlIlllllIl(Inventory.getCount(iArr10), llIlIlII[1])) {
                                    Bank.withdraw(llIlIlII[14], llIlIlII[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[llIlIlII[1]];
                                        iArr11[llIlIlII[0]] = llIlIlII[14];
                                        if (lIllIIIIIII(Inventory.getCount(iArr11))) {
                                            ?? r0 = llIlIlII[1];
                                            "".length();
                                            return (-(77 ^ 73)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlIlII[0];
                                    }, llIlIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[llIlIlII[1]];
                            iArr11[llIlIlII[0]] = llIlIlII[15];
                            if (lIlIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llIlIlII[1]];
                                iArr12[llIlIlII[0]] = llIlIlII[15];
                                if (lIlIllllllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(llIlIlII[15], llIlIlII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[llIlIlII[1]];
                                        iArr13[llIlIlII[0]] = llIlIlII[15];
                                        return Inventory.contains(iArr13);
                                    }, llIlIlII[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(llIlIlII[16], llIlIlII[17], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[llIlIlII[1]];
                            iArr13[llIlIlII[0]] = llIlIlII[18];
                            if (lIlIlllllII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[llIlIlII[1]];
                                iArr14[llIlIlII[0]] = llIlIlII[18];
                                if (lIlIlllllIl(Inventory.getCount(iArr14), llIlIlII[1]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[19])) {
                                    Bank.withdrawAll(llIlIlII[18], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[llIlIlII[1]];
                                        iArr15[llIlIlII[0]] = llIlIlII[18];
                                        if (lIllIIIIIII(Inventory.getCount(iArr15))) {
                                            ?? r0 = llIlIlII[1];
                                            "".length();
                                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlIlII[0];
                                    }, llIlIlII[4]);
                                    "".length();
                                }
                            }
                        }
                        if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6])) {
                            int[] iArr15 = new int[llIlIlII[1]];
                            iArr15[llIlIlII[0]] = llIlIlII[20];
                            if (lIlIllllllI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(llIlIlII[20], llIlIlII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIlIlII[1]);
                                "".length();
                            }
                            if (lIlIlllllII(bA ? 1 : 0)) {
                                Bank.withdrawAll(llIlIlII[21], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIlIlII[1]);
                                "".length();
                                Bank.withdrawAll(llIlIlII[14], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIlIlII[1]);
                                "".length();
                            }
                            Bank.withdrawAll(llIlIlII[22], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llIlIlII[1]);
                            "".length();
                            Bank.withdrawAll(llIlIlII[23], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(llIlIlII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIlllllII(ac() ? 1 : 0)) {
                if (lIlIlllllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[19])) {
                    if (lIlIllllllI(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIlIIIl[llIlIlII[17]];
                        Movement.walkTo(bD);
                        "".length();
                        Time.sleepTicks(llIlIlII[1]);
                        "".length();
                    }
                    if (lIlIlllllII(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIlIIIl[llIlIlII[24]];
                        ab();
                    }
                }
                if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[19]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[25])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[26]];
                    if (lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(llIlIlII[1]);
                        "".length();
                    }
                }
                if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[25]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[28])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[29]];
                    if (lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(llIlIlII[1]);
                        "".length();
                    }
                }
                if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[28]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[30])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[31]];
                    if (lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(llIlIlII[1]);
                        "".length();
                    }
                }
                if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[30]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[32]];
                    if (lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(llIlIlII[1]);
                        "".length();
                    }
                }
                if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[6])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[33]];
                    int[] iArr16 = new int[llIlIlII[1]];
                    iArr16[llIlIlII[0]] = llIlIlII[20];
                    if (lIlIlllllII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llIlIlII[1]];
                        iArr17[llIlIlII[0]] = llIlIlII[20];
                        if (lIlIllllllI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llIlIlII[1]];
                            iArr18[llIlIlII[0]] = llIlIlII[20];
                            Inventory.getFirst(iArr18).interact(llIlIIIl[llIlIlII[34]]);
                            Time.sleepTicks(llIlIlII[1]);
                            "".length();
                        }
                    }
                    if (lIlIlllllII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[llIlIlII[1]];
                    iArr19[llIlIlII[0]] = llIlIlII[22];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[llIlIlII[1]];
                    iArr20[llIlIlII[0]] = llIlIlII[35];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIlIllllllI(bA ? 1 : 0)) {
                        if (lIlIllllllI(Players.getLocal().getWorldLocation().equals(bE) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIlIIIl[llIlIlII[36]];
                            Movement.walkTo(bE);
                            "".length();
                            Time.sleepTicks(llIlIlII[1]);
                            "".length();
                        }
                        if (lIlIlllllII(Players.getLocal().getWorldLocation().equals(bE) ? 1 : 0) && lIlIlllllll(first) && lIlIlllllll(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIllIIIIlll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = llIlIlII[1];
                                    "".length();
                                    return 0 != 0 ? ((((155 + 61) - 208) + 233) ^ (((182 + 84) - 219) + 149)) & (((((86 + 11) - 11) + 93) ^ (((114 + 70) - 117) + 67)) ^ (-" ".length())) : r0;
                                }
                                return llIlIlII[0];
                            }, llIlIlII[8]);
                            "".length();
                            Time.sleep(C0004e.c(llIlIlII[37], llIlIlII[38]));
                            "".length();
                        }
                    }
                    if (lIlIlllllII(bA ? 1 : 0)) {
                        if (lIlIlllllll(first) && lIlIlllllll(first2) && lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIllIIIIlll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = llIlIlII[1];
                                    "".length();
                                    return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIlII[0];
                            }, llIlIlII[8]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                                ?? r0 = llIlIlII[1];
                                "".length();
                                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIlIlII[0];
                        }, llIlIlII[39]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void af() {
        if (lIlIlllllll(Widgets.get(llIlIlII[49], llIlIlII[50]))) {
            AccBuilderBarrows.c = llIlIIIl[llIlIlII[51]];
            Widgets.get(llIlIlII[49], llIlIlII[50]).interact(llIlIIIl[llIlIlII[52]]);
            Time.sleepTicks(llIlIlII[5]);
            "".length();
        }
        if (lIllIIIIlIl(Widgets.get(llIlIlII[49], llIlIlII[50])) && lIlIllllllI(Widgets.get(llIlIlII[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(llIlIlII[1]);
            "".length();
            if (lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[17])) {
                Widgets.get(llIlIlII[53], llIlIlII[1]).getChild(llIlIlII[1]).interact(llIlIIIl[llIlIlII[54]]);
            }
            if (lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[31]) && lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[17])) {
                Widgets.get(llIlIlII[53], llIlIlII[1]).getChild(llIlIlII[2]).interact(llIlIIIl[llIlIlII[55]]);
            }
            if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[31]) && lIlIlllllIl(Skills.getLevel(Skill.MAGIC), llIlIlII[36])) {
                Widgets.get(llIlIlII[53], llIlIlII[1]).getChild(llIlIlII[3]).interact(llIlIIIl[llIlIlII[19]]);
            }
            if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[31])) {
                int[] iArr = new int[llIlIlII[1]];
                iArr[llIlIlII[0]] = llIlIlII[12];
                if (lIlIllllllI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(llIlIlII[53], llIlIlII[1]).getChild(llIlIlII[3]).interact(llIlIIIl[llIlIlII[50]]);
                }
            }
            if (lIllIIIIIIl(Skills.getLevel(Skill.MAGIC), llIlIlII[36])) {
                int[] iArr2 = new int[llIlIlII[1]];
                iArr2[llIlIlII[0]] = llIlIlII[12];
                if (lIlIlllllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(llIlIlII[53], llIlIlII[1]).getChild(llIlIlII[5]).interact(llIlIIIl[llIlIlII[56]]);
                }
            }
            Time.sleepTicks(llIlIlII[1]);
            "".length();
        }
    }
}
