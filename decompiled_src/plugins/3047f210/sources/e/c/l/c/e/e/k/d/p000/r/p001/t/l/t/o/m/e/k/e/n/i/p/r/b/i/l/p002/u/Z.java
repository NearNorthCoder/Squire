package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.Z  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/Z.class */
public class Z implements S {
    public static final /* synthetic */ int jk;
    public static final /* synthetic */ int jo;
    public static /* synthetic */ WorldArea y;
    public static final /* synthetic */ int jl;
    public static final /* synthetic */ int jn;
    public static final /* synthetic */ int jm;
    public static final /* synthetic */ int[] jp;
    public static /* synthetic */ WorldPoint F;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ int[] jr;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] lllllIlllI;
    private static /* synthetic */ String[] lllllIllIl;
    public static /* synthetic */ int[] jq;
    public static final /* synthetic */ int jj;

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        es();
        return lllllIlllI[40];
    }

    private static String llIlIlIlIIlIl(String lllllllllllllllllIlIIlIIIlIIIllI, String lllllllllllllllllIlIIlIIIlIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), lllllIlllI[26]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIlllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlIIIlIIIlll) {
            lllllllllllllllllIlIIlIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIlIlIII() {
        lllllIlllI = new int[64];
        lllllIlllI[0] = ((((57 + 56) - (-31)) + 95) ^ (((62 + 6) - (-89)) + 17)) & (((2 ^ 44) ^ (45 ^ 66)) ^ (-" ".length()));
        lllllIlllI[1] = " ".length();
        lllllIlllI[2] = "  ".length();
        lllllIlllI[3] = "   ".length();
        lllllIlllI[4] = (-17491) & 22490;
        lllllIlllI[5] = 167 ^ 163;
        lllllIlllI[6] = (-((-10867) & 31359)) & (-2561) & 24317;
        lllllIlllI[7] = (-6145) & 7413;
        lllllIlllI[8] = (-6913) & 8185;
        lllllIlllI[9] = (-18441) & 19711;
        lllllIlllI[10] = (-27141) & 28415;
        lllllIlllI[11] = (-((-677) & 21422)) & (-33) & 32637;
        lllllIlllI[12] = (-((-567) & 5055)) & (-16422) & 32765;
        lllllIlllI[13] = (-16417) & 28270;
        lllllIlllI[14] = (-((-27906) & 32021)) & (-16641) & 32607;
        lllllIlllI[15] = (-20745) & 32602;
        lllllIlllI[16] = (-4262) & 16111;
        lllllIlllI[17] = (-39) & 12006;
        lllllIlllI[18] = (((77 + 62) - 11) + 83) ^ (((56 + 40) - 70) + 113);
        lllllIlllI[19] = (-((-24780) & 29183)) & (-1) & 16383;
        lllllIlllI[20] = (-(243 ^ 178)) & (-8241) & 28539;
        lllllIlllI[21] = 35 ^ 37;
        lllllIlllI[22] = 161 ^ 181;
        lllllIlllI[23] = (((71 + 32) - (-68)) + 27) ^ (((10 + 147) - 12) + 50);
        lllllIlllI[24] = (219 ^ 163) ^ (89 ^ 46);
        lllllIlllI[25] = 26 ^ 29;
        lllllIlllI[26] = (((112 + 20) - 63) + 84) ^ (((85 + 78) - 160) + 142);
        lllllIlllI[27] = 60 ^ 53;
        lllllIlllI[28] = 21 ^ 31;
        lllllIlllI[29] = (((159 + 123) - 279) + 171) ^ (((106 + 39) - 115) + 135);
        lllllIlllI[30] = (226 ^ 197) ^ (130 ^ 140);
        lllllIlllI[31] = (((149 + 127) - 142) + 45) ^ (((150 + 76) - 220) + 166);
        lllllIlllI[32] = 60 ^ 41;
        lllllIlllI[33] = (-((-7321) & 32477)) & (-5379) & 65534;
        lllllIlllI[34] = (-((-16424) & 20671)) & (-2049) & 15295;
        lllllIlllI[35] = (-102) & 15101;
        lllllIlllI[36] = (-8) & 25007;
        lllllIlllI[37] = (-((-1547) & 18059)) & (-8249) & 32767;
        lllllIlllI[38] = (86 ^ 25) ^ (119 ^ 16);
        lllllIlllI[39] = (-((-965) & 12286)) & (-16451) & 28671;
        lllllIlllI[40] = (15 ^ 89) ^ (87 ^ 101);
        lllllIlllI[41] = 5 ^ 9;
        lllllIlllI[42] = (((81 + 0) - 70) + 191) ^ (((14 + 118) - 103) + 140);
        lllllIlllI[43] = (49 ^ 96) ^ (125 ^ 33);
        lllllIlllI[44] = (-18434) & 18869;
        lllllIlllI[45] = (-26115) & 26554;
        lllllIlllI[46] = (-((-8233) & 12715)) & (-16417) & 22515;
        lllllIlllI[47] = (-2443) & 4063;
        lllllIlllI[48] = (-((-17987) & 32459)) & (-37) & 16127;
        lllllIlllI[49] = (-14465) & 16087;
        lllllIlllI[50] = (-9225) & 32666;
        lllllIlllI[51] = (-((-6419) & 14707)) & (-4120) & 32767;
        lllllIlllI[52] = (-8202) & 28559;
        lllllIlllI[53] = (-4481) & 15845;
        lllllIlllI[54] = (-((-10849) & 15354)) & (-16897) & 32765;
        lllllIlllI[55] = (-5187) & 16347;
        lllllIlllI[56] = (-1281) & 12223;
        lllllIlllI[57] = (-103) & 3063;
        lllllIlllI[58] = (-((-27989) & 32629)) & (-16451) & 24318;
        lllllIlllI[59] = (103 ^ 61) ^ (13 ^ 75);
        lllllIlllI[60] = 107 ^ 112;
        lllllIlllI[61] = (-29697) & 32671;
        lllllIlllI[62] = (-((-24865) & 29558)) & (-8193) & 16127;
        lllllIlllI[63] = (167 ^ 145) ^ (115 ^ 75);
    }

    private static boolean llIlIlIlIllIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static boolean aa() {
        if (llIlIlIlIlllI(Skills.getLevel(Skill.MINING), lllllIlllI[30])) {
            int[] iArr = new int[lllllIlllI[1]];
            iArr[lllllIlllI[0]] = lllllIlllI[10];
            if (llIlIlIlIllIl(Inventory.getCount(iArr))) {
                ?? r0 = lllllIlllI[1];
                "".length();
                return (25 ^ 28) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllllIlllI[0];
        } else if (llIlIlIlIlllI(Skills.getLevel(Skill.MINING), lllllIlllI[31]) && llIlIlIlIlIlI(Skills.getLevel(Skill.MINING), lllllIlllI[30])) {
            int[] iArr2 = new int[lllllIlllI[1]];
            iArr2[lllllIlllI[0]] = lllllIlllI[10];
            if (llIlIlIlIllIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lllllIlllI[1]];
                iArr3[lllllIlllI[0]] = lllllIlllI[9];
                if (llIlIlIlIllIl(Inventory.getCount(iArr3))) {
                    ?? r02 = lllllIlllI[1];
                    "".length();
                    return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return lllllIlllI[0];
        } else if (llIlIlIlIlllI(Skills.getLevel(Skill.MINING), lllllIlllI[32]) && llIlIlIlIlIlI(Skills.getLevel(Skill.MINING), lllllIlllI[31])) {
            int[] iArr4 = new int[lllllIlllI[1]];
            iArr4[lllllIlllI[0]] = lllllIlllI[10];
            if (llIlIlIlIllIl(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[lllllIlllI[1]];
                iArr5[lllllIlllI[0]] = lllllIlllI[9];
                if (llIlIlIlIllIl(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[lllllIlllI[1]];
                    iArr6[lllllIlllI[0]] = lllllIlllI[8];
                    if (llIlIlIlIllIl(Inventory.getCount(iArr6))) {
                        ?? r03 = lllllIlllI[1];
                        "".length();
                        return "  ".length() > (72 ^ 76) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                    }
                }
            }
            return lllllIlllI[0];
        } else if (llIlIlIlIlllI(Skills.getLevel(Skill.MINING), lllllIlllI[21]) && llIlIlIlIlIlI(Skills.getLevel(Skill.MINING), lllllIlllI[32])) {
            int[] iArr7 = new int[lllllIlllI[1]];
            iArr7[lllllIlllI[0]] = lllllIlllI[10];
            if (llIlIlIlIllIl(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lllllIlllI[1]];
                iArr8[lllllIlllI[0]] = lllllIlllI[9];
                if (llIlIlIlIllIl(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[lllllIlllI[1]];
                    iArr9[lllllIlllI[0]] = lllllIlllI[8];
                    if (llIlIlIlIllIl(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[lllllIlllI[1]];
                        iArr10[lllllIlllI[0]] = lllllIlllI[7];
                        if (llIlIlIlIllIl(Inventory.getCount(iArr10))) {
                            ?? r04 = lllllIlllI[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                        }
                    }
                }
            }
            return lllllIlllI[0];
        } else {
            int[] iArr11 = new int[lllllIlllI[1]];
            iArr11[lllllIlllI[0]] = lllllIlllI[10];
            if (llIlIlIlIllIl(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[lllllIlllI[1]];
                iArr12[lllllIlllI[0]] = lllllIlllI[9];
                if (llIlIlIlIllIl(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[lllllIlllI[1]];
                    iArr13[lllllIlllI[0]] = lllllIlllI[8];
                    if (llIlIlIlIllIl(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[lllllIlllI[1]];
                        iArr14[lllllIlllI[0]] = lllllIlllI[7];
                        if (llIlIlIlIllIl(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[lllllIlllI[1]];
                            iArr15[lllllIlllI[0]] = lllllIlllI[6];
                            if (llIlIlIlIllIl(Inventory.getCount(iArr15))) {
                                ?? r05 = lllllIlllI[1];
                                "".length();
                                return ((((85 + 5) - 34) + 104) ^ (((47 + 158) - 204) + 163)) == 0 ? ((((4 + 28) - (-48)) + 62) ^ (((107 + 31) - 27) + 21)) & (((((26 + 142) - 4) + 0) ^ (((132 + 156) - 127) + 13)) ^ (-" ".length())) : r05;
                            }
                        }
                    }
                }
            }
            return lllllIlllI[0];
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllIllIl[lllllIlllI[41]];
    }

    private static boolean llIlIlIlIlIll(int i) {
        return i == 0;
    }

    private static boolean llIlIlIlIlllI(int i, int i2) {
        return i >= i2;
    }

    private static String llIlIlIlIIllI(String lllllllllllllllllIlIIlIIIllIlIll, String lllllllllllllllllIlIIlIIIllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIlIIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIlllI[2], lllllllllllllllllIlIIlIIIllIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlIIIllIllII) {
            lllllllllllllllllIlIIlIIIllIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllllIlllI[0];
    }

    static {
        llIlIlIlIlIII();
        llIlIlIlIIlll();
        jm = lllllIlllI[9];
        jl = lllllIlllI[8];
        jn = lllllIlllI[10];
        jo = lllllIlllI[17];
        jj = lllllIlllI[6];
        jk = lllllIlllI[7];
        int[] iArr = new int[lllllIlllI[27]];
        iArr[lllllIlllI[0]] = lllllIlllI[44];
        iArr[lllllIlllI[1]] = lllllIlllI[45];
        iArr[lllllIlllI[2]] = lllllIlllI[46];
        iArr[lllllIlllI[3]] = lllllIlllI[47];
        iArr[lllllIlllI[5]] = lllllIlllI[48];
        iArr[lllllIlllI[23]] = lllllIlllI[49];
        iArr[lllllIlllI[21]] = lllllIlllI[50];
        iArr[lllllIlllI[25]] = lllllIlllI[51];
        iArr[lllllIlllI[26]] = lllllIlllI[52];
        jp = iArr;
        bu = new ArrayList();
        int[] iArr2 = new int[lllllIlllI[2]];
        iArr2[lllllIlllI[0]] = lllllIlllI[53];
        iArr2[lllllIlllI[1]] = lllllIlllI[54];
        jq = iArr2;
        int[] iArr3 = new int[lllllIlllI[2]];
        iArr3[lllllIlllI[0]] = lllllIlllI[55];
        iArr3[lllllIlllI[1]] = lllllIlllI[56];
        jr = iArr3;
        y = new WorldArea(lllllIlllI[57], lllllIlllI[58], lllllIlllI[59], lllllIlllI[60], lllllIlllI[0]);
        F = new WorldPoint(lllllIlllI[61], lllllIlllI[62], lllllIlllI[0]);
    }

    private static void llIlIlIlIIlll() {
        lllllIllIl = new String[lllllIlllI[63]];
        lllllIllIl[lllllIlllI[0]] = llIlIlIlIIlII("NwcbEDsSUgsNMBgB", "urbyU");
        lllllIllIl[lllllIlllI[1]] = llIlIlIlIIlII("Iz8EIgcNMw5rFhAvAyUTRT8eLhkWeko4AwwiCSMdCzFKKRUGPUo/G0U7AyUdCzE=", "eVjKt");
        lllllIllIl[lllllIlllI[2]] = llIlIlIlIIlIl("1H2DepDB/fRwdEYaVqmc7g0O8CUdBpOy", "zTOrW");
        lllllIllIl[lllllIlllI[3]] = llIlIlIlIIlII("ADc/BzshODZDNSk4Ogo5Lw==", "HVQcW");
        lllllIllIl[lllllIlllI[5]] = llIlIlIlIIlIl("eRR+CsUfCDysWe2gwRPBoDrUFpxfO0d11cEfMBwcBMmz1VmayB8q+3Cl4M4nzEom", "hOoRM");
        lllllIllIl[lllllIlllI[23]] = llIlIlIlIIlIl("mvji3vr7/VbRiI54fUtxpA==", "iirMt");
        lllllIllIl[lllllIlllI[21]] = llIlIlIlIIllI("1AGu1brc2PQNJrkQ4C74eA==", "gwnrA");
        lllllIllIl[lllllIlllI[25]] = llIlIlIlIIlII("IBo4IisKUzUkNR0WJA==", "msVKE");
        lllllIllIl[lllllIlllI[26]] = llIlIlIlIIlIl("I/Rb+XsjU0k=", "lQaAk");
        lllllIllIl[lllllIlllI[27]] = llIlIlIlIIllI("coN7+r1BTURJ6YzLuQv73svh2hZPaKPd", "GaUpo");
        lllllIllIl[lllllIlllI[28]] = llIlIlIlIIlIl("QVi+suH2A451rGf4FXn9bQ==", "PMatu");
        lllllIllIl[lllllIlllI[29]] = llIlIlIlIIlIl("BrT2+LrQCkM=", "OqzvI");
        lllllIllIl[lllllIlllI[41]] = llIlIlIlIIlII("CRobIyoj", "DsuJD");
        lllllIllIl[lllllIlllI[43]] = llIlIlIlIIlIl("CWKlju/xteCpK89YvqUhPS27G3VXfpAm", "oZnve");
    }

    private static boolean llIlIlIlIllII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0151, code lost:
        if (llIlIlIlIlllI(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.lllllIlllI[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0190, code lost:
        if (llIlIlIlIlllI(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.lllllIlllI[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cf, code lost:
        if (llIlIlIlIlllI(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.lllllIlllI[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x020e, code lost:
        if (llIlIlIlIlllI(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.lllllIlllI[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024d, code lost:
        if (llIlIlIlIlIlI(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.lllllIlllI[1]) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0250, code lost:
        ae();
        java.lang.System.out.println(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.lllllIllIl[e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.lllllIlllI[5]]);
        e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.bs = e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Z.lllllIlllI[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v296, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v325, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void es() {
        if (llIlIlIlIlIIl(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[0]];
            C0001b.a(bu);
            if (llIlIlIlIlIlI(bu.size(), lllllIlllI[1])) {
                System.out.println(lllllIllIl[lllllIlllI[1]]);
                bs = lllllIlllI[0];
            }
        }
        if (llIlIlIlIlIll(bs ? 1 : 0)) {
            if (llIlIlIlIlIll(aa() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIlIlIllII(nearest) && llIlIlIlIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[2]];
                    C0000a.a(nearest);
                }
                if (llIlIlIlIllII(nearest) && llIlIlIlIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[3]];
                    if (llIlIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllllIlllI[4]);
                        "".length();
                    }
                    if (llIlIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIlIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllllIlllI[5]);
                            "".length();
                        }
                        if (llIlIlIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllllIlllI[2]);
                            "".length();
                        }
                        int[] iArr = new int[lllllIlllI[1]];
                        iArr[lllllIlllI[0]] = lllllIlllI[6];
                        if (llIlIlIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lllllIlllI[1]];
                            iArr2[lllllIlllI[0]] = lllllIlllI[6];
                        }
                        int[] iArr3 = new int[lllllIlllI[1]];
                        iArr3[lllllIlllI[0]] = lllllIlllI[7];
                        if (llIlIlIlIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllllIlllI[1]];
                            iArr4[lllllIlllI[0]] = lllllIlllI[7];
                        }
                        int[] iArr5 = new int[lllllIlllI[1]];
                        iArr5[lllllIlllI[0]] = lllllIlllI[8];
                        if (llIlIlIlIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllllIlllI[1]];
                            iArr6[lllllIlllI[0]] = lllllIlllI[8];
                        }
                        int[] iArr7 = new int[lllllIlllI[1]];
                        iArr7[lllllIlllI[0]] = lllllIlllI[9];
                        if (llIlIlIlIlIll(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lllllIlllI[1]];
                            iArr8[lllllIlllI[0]] = lllllIlllI[9];
                        }
                        int[] iArr9 = new int[lllllIlllI[1]];
                        iArr9[lllllIlllI[0]] = lllllIlllI[10];
                        if (llIlIlIlIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lllllIlllI[1]];
                            iArr10[lllllIlllI[0]] = lllllIlllI[10];
                        }
                        C0000a.a(lllllIlllI[11], lllllIlllI[1]);
                        C0000a.a(lllllIlllI[12], lllllIlllI[1]);
                        C0000a.a(lllllIlllI[13], lllllIlllI[1]);
                        C0000a.a(lllllIlllI[14], lllllIlllI[1]);
                        C0000a.a(lllllIlllI[15], lllllIlllI[1]);
                        C0000a.a(lllllIlllI[16], lllllIlllI[1]);
                        C0000a.a(lllllIlllI[17], lllllIlllI[1]);
                        int[] iArr11 = new int[lllllIlllI[1]];
                        iArr11[lllllIlllI[0]] = lllllIlllI[11];
                        if (llIlIlIlIlIll(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lllllIlllI[1]];
                            iArr12[lllllIlllI[0]] = lllllIlllI[11];
                            if (llIlIlIlIlIll(Equipment.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lllllIlllI[1]];
                                iArr13[lllllIlllI[0]] = lllllIlllI[11];
                                if (llIlIlIlIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                                    C0000a.a(lllllIlllI[18], lllllIlllI[1]);
                                }
                            }
                        }
                        C0000a.a(lllllIlllI[19], lllllIlllI[1]);
                        C0004e.l(lllllIlllI[11]);
                        C0004e.l(lllllIlllI[12]);
                        C0004e.l(lllllIlllI[13]);
                        C0004e.l(lllllIlllI[14]);
                        C0004e.l(lllllIlllI[15]);
                        Time.sleepTicks(lllllIlllI[1]);
                        "".length();
                        C0004e.l(lllllIlllI[17]);
                        C0004e.l(lllllIlllI[20]);
                        C0004e.l(lllllIlllI[16]);
                        C0004e.l(lllllIlllI[18]);
                        C0004e.l(lllllIlllI[19]);
                        Time.sleepTicks(lllllIlllI[3]);
                        "".length();
                        if (llIlIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lllllIlllI[21]);
                            "".length();
                        }
                        if (llIlIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                            int[] iArr14 = new int[lllllIlllI[1]];
                            iArr14[lllllIlllI[0]] = lllllIlllI[6];
                            if (llIlIlIlIlIIl(Bank.contains(iArr14) ? 1 : 0)) {
                                Bank.withdraw(lllllIlllI[6], lllllIlllI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllllIlllI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lllllIlllI[1]];
                                    iArr15[lllllIlllI[0]] = lllllIlllI[6];
                                    if (llIlIlIlIllIl(Inventory.getCount(iArr15))) {
                                        ?? r0 = lllllIlllI[1];
                                        "".length();
                                        return (52 ^ 48) < (8 ^ 12) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllllIlllI[0];
                                }, lllllIlllI[4]);
                                "".length();
                            }
                            int[] iArr15 = new int[lllllIlllI[1]];
                            iArr15[lllllIlllI[0]] = lllllIlllI[7];
                            if (llIlIlIlIlIIl(Bank.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lllllIlllI[7], lllllIlllI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllllIlllI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr16 = new int[lllllIlllI[1]];
                                    iArr16[lllllIlllI[0]] = lllllIlllI[7];
                                    if (llIlIlIlIllIl(Inventory.getCount(iArr16))) {
                                        ?? r0 = lllllIlllI[1];
                                        "".length();
                                        return "   ".length() != "   ".length() ? ((((71 + 11) - (-26)) + 50) ^ (((90 + 114) - 177) + 113)) & (((228 ^ 147) ^ (28 ^ 121)) ^ (-" ".length())) : r0;
                                    }
                                    return lllllIlllI[0];
                                }, lllllIlllI[4]);
                                "".length();
                            }
                            int[] iArr16 = new int[lllllIlllI[1]];
                            iArr16[lllllIlllI[0]] = lllllIlllI[8];
                            if (llIlIlIlIlIIl(Bank.contains(iArr16) ? 1 : 0)) {
                                Bank.withdraw(lllllIlllI[8], lllllIlllI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllllIlllI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lllllIlllI[1]];
                                    iArr17[lllllIlllI[0]] = lllllIlllI[8];
                                    if (llIlIlIlIllIl(Inventory.getCount(iArr17))) {
                                        ?? r0 = lllllIlllI[1];
                                        "".length();
                                        return (("  ".length() ^ (238 ^ 165)) & (((126 ^ 70) ^ (29 ^ 108)) ^ (-" ".length()))) > " ".length() ? ((12 ^ 69) ^ (200 ^ 166)) & (((111 ^ 79) ^ (6 ^ 1)) ^ (-" ".length())) : r0;
                                    }
                                    return lllllIlllI[0];
                                }, lllllIlllI[4]);
                                "".length();
                            }
                            int[] iArr17 = new int[lllllIlllI[1]];
                            iArr17[lllllIlllI[0]] = lllllIlllI[9];
                            if (llIlIlIlIlIIl(Bank.contains(iArr17) ? 1 : 0)) {
                                Bank.withdraw(lllllIlllI[9], lllllIlllI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllllIlllI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr18 = new int[lllllIlllI[1]];
                                    iArr18[lllllIlllI[0]] = lllllIlllI[9];
                                    if (llIlIlIlIllIl(Inventory.getCount(iArr18))) {
                                        ?? r0 = lllllIlllI[1];
                                        "".length();
                                        return (-(1 ^ 5)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllllIlllI[0];
                                }, lllllIlllI[4]);
                                "".length();
                            }
                            int[] iArr18 = new int[lllllIlllI[1]];
                            iArr18[lllllIlllI[0]] = lllllIlllI[10];
                            if (llIlIlIlIlIIl(Bank.contains(iArr18) ? 1 : 0)) {
                                Bank.withdraw(lllllIlllI[10], lllllIlllI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllllIlllI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr19 = new int[lllllIlllI[1]];
                                    iArr19[lllllIlllI[0]] = lllllIlllI[10];
                                    if (llIlIlIlIllIl(Inventory.getCount(iArr19))) {
                                        ?? r0 = lllllIlllI[1];
                                        "".length();
                                        return 0 != 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                                    }
                                    return lllllIlllI[0];
                                }, lllllIlllI[4]);
                                "".length();
                            }
                            int[] iArr19 = new int[lllllIlllI[1]];
                            iArr19[lllllIlllI[0]] = lllllIlllI[17];
                            if (llIlIlIlIlIIl(Bank.contains(iArr19) ? 1 : 0)) {
                                Bank.withdraw(lllllIlllI[17], lllllIlllI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllllIlllI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr20 = new int[lllllIlllI[1]];
                                    iArr20[lllllIlllI[0]] = lllllIlllI[17];
                                    if (llIlIlIlIllIl(Inventory.getCount(iArr20))) {
                                        ?? r0 = lllllIlllI[1];
                                        "".length();
                                        return "   ".length() <= (-" ".length()) ? ((176 ^ 186) ^ (205 ^ 136)) & (((58 ^ 24) ^ (198 ^ 171)) ^ (-" ".length())) & ((((((108 + 28) - (-70)) + 45) ^ (((50 + 117) - 134) + 130)) & (((163 ^ 149) ^ (87 ^ 57)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                                    }
                                    return lllllIlllI[0];
                                }, lllllIlllI[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIlIlIlIlIIl(aa() ? 1 : 0)) {
                if (llIlIlIlIlIll(Movement.isRunEnabled() ? 1 : 0) && llIlIlIlIllll(Movement.getRunEnergy(), lllllIlllI[22])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lllllIlllI[23]);
                    "".length();
                }
                if (llIlIlIlIlIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[23]];
                    Inventory.getAll(jp).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (llIlIlIlIlIll(Inventory.isFull() ? 1 : 0)) {
                    if (llIlIlIlIlIlI(Skills.getLevel(Skill.MINING), lllllIlllI[24])) {
                        if (llIlIlIlIlIll(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[21]];
                            Movement.walkTo(F);
                            "".length();
                            Time.sleepTicks(lllllIlllI[5]);
                            "".length();
                        }
                        if (llIlIlIlIlIIl(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[25]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), jr);
                            if (llIlIlIlIlIll(Players.getLocal().isAnimating() ? 1 : 0) && llIlIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && llIlIlIlIllII(nearest2)) {
                                nearest2.interact(lllllIllIl[lllllIlllI[26]]);
                                Time.sleepTicks(lllllIlllI[2]);
                                "".length();
                            }
                        }
                    }
                    if (llIlIlIlIlllI(Skills.getLevel(Skill.MINING), lllllIlllI[24])) {
                        if (llIlIlIlIlIll(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[27]];
                            Movement.walkTo(F);
                            "".length();
                            Time.sleepTicks(lllllIlllI[5]);
                            "".length();
                        }
                        if (llIlIlIlIlIIl(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[28]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), jq);
                            if (llIlIlIlIlIll(Players.getLocal().isAnimating() ? 1 : 0) && llIlIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && llIlIlIlIllII(nearest3)) {
                                nearest3.interact(lllllIllIl[lllllIlllI[29]]);
                                Time.sleepTicks(lllllIlllI[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIlIlIlllI(Skills.getLevel(Skill.MINING), lllllIlllI[42])) {
            ?? r0 = lllllIlllI[1];
            "".length();
            return ((((152 + 33) - 78) + 46) ^ (((122 + 112) - 115) + 38)) != ((41 ^ 19) ^ (173 ^ 147)) ? ("   ".length() ^ (163 ^ 189)) & (((190 ^ 128) ^ (187 ^ 152)) ^ (-" ".length())) : r0;
        }
        return lllllIlllI[0];
    }

    private static boolean llIlIlIlIlIlI(int i, int i2) {
        return i < i2;
    }

    public static void ae() {
        bu.add(new C0003d(lllllIlllI[17], lllllIlllI[1], lllllIlllI[33]));
        "".length();
        int[] iArr = new int[lllllIlllI[1]];
        iArr[lllllIlllI[0]] = lllllIlllI[6];
        if (llIlIlIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlllI[6], lllllIlllI[1], lllllIlllI[4]));
            "".length();
        }
        int[] iArr2 = new int[lllllIlllI[1]];
        iArr2[lllllIlllI[0]] = lllllIlllI[7];
        if (llIlIlIlIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlllI[7], lllllIlllI[1], lllllIlllI[4]));
            "".length();
        }
        int[] iArr3 = new int[lllllIlllI[1]];
        iArr3[lllllIlllI[0]] = lllllIlllI[8];
        if (llIlIlIlIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlllI[8], lllllIlllI[1], lllllIlllI[34]));
            "".length();
        }
        int[] iArr4 = new int[lllllIlllI[1]];
        iArr4[lllllIlllI[0]] = lllllIlllI[9];
        if (llIlIlIlIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlllI[9], lllllIlllI[1], lllllIlllI[35]));
            "".length();
        }
        int[] iArr5 = new int[lllllIlllI[1]];
        iArr5[lllllIlllI[0]] = lllllIlllI[10];
        if (llIlIlIlIlIll(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlllI[10], lllllIlllI[1], lllllIlllI[36]));
            "".length();
        }
        if (llIlIlIlIlIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllllIllIl[lllllIlllI[43]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlllI[19], lllllIlllI[23], lllllIlllI[36]));
            "".length();
        }
        int[] iArr6 = new int[lllllIlllI[1]];
        iArr6[lllllIlllI[0]] = lllllIlllI[37];
        if (llIlIlIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlllI[37], lllllIlllI[38], lllllIlllI[39]));
            "".length();
        }
    }

    private static boolean llIlIlIlIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIlIlIlIIl(int i) {
        return i != 0;
    }

    private static String llIlIlIlIIlII(String lllllllllllllllllIlIIlIIIlIllIll, String lllllllllllllllllIlIIlIIIlIllIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIlIIIlIllIIl = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIlIIIlIllIlI.toCharArray();
        int lllllllllllllllllIlIIlIIIlIlIlll = lllllIlllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllllIlIIlIIIlIIllll = lllllIlllI[0];
        while (llIlIlIlIlIlI(lllllllllllllllllIlIIlIIIlIIllll, length)) {
            char lllllllllllllllllIlIIlIIIlIlllII = charArray2[lllllllllllllllllIlIIlIIIlIIllll];
            lllllllllllllllllIlIIlIIIlIllIIl.append((char) (lllllllllllllllllIlIIlIIIlIlllII ^ charArray[lllllllllllllllllIlIIlIIIlIlIlll % charArray.length]));
            "".length();
            lllllllllllllllllIlIIlIIIlIlIlll++;
            lllllllllllllllllIlIIlIIIlIIllll++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIlIIIlIllIIl);
    }
}
