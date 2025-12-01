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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.M  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/M.class */
public class M implements W {
    private static final /* synthetic */ WorldPoint je;
    private static final /* synthetic */ String[] jf;
    static /* synthetic */ int bT;
    private static /* synthetic */ int[] lIIIIlIII;
    static /* synthetic */ int cl;
    static /* synthetic */ boolean cm;
    public static /* synthetic */ List<C0003d> bv;
    private static final /* synthetic */ int jb;
    private static final /* synthetic */ int jc;
    private static /* synthetic */ String[] lIIIIIlll;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int jd;

    private static String llIllIlIIll(String lIIlIIlllIlllIl, String lIIlIIlllIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIlllIlllII.getBytes(StandardCharsets.UTF_8)), lIIIIlIII[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIlllIllllI) {
            lIIlIIlllIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIllIIl(int i) {
        return i > 0;
    }

    private static void llIllIlIlIl() {
        lIIIIlIII = new int[39];
        lIIIIlIII[0] = (65 ^ 13) & ((220 ^ 144) ^ (-1));
        lIIIIlIII[1] = " ".length();
        lIIIIlIII[2] = 176 ^ 130;
        lIIIIlIII[3] = "  ".length();
        lIIIIlIII[4] = (76 ^ 15) ^ (203 ^ 151);
        lIIIIlIII[5] = "   ".length();
        lIIIIlIII[6] = 65 ^ 69;
        lIIIIlIII[7] = (-3121) & 8120;
        lIIIIlIII[8] = (-26701) & 27134;
        lIIIIlIII[9] = (96 ^ 35) ^ (3 ^ 70);
        lIIIIlIII[10] = (-((-13351) & 32302)) & (-13377) & 32767;
        lIIIIlIII[11] = (-((-902) & 23503)) & (-9217) & 32253;
        lIIIIlIII[12] = (7 ^ 64) ^ (20 ^ 86);
        lIIIIlIII[13] = (-8243) & 16251;
        lIIIIlIII[14] = 204 ^ 168;
        lIIIIlIII[15] = 134 ^ 129;
        lIIIIlIII[16] = (206 ^ 168) ^ (20 ^ 122);
        lIIIIlIII[17] = (((71 + 91) - 101) + 103) ^ (((34 + 85) - (-1)) + 53);
        lIIIIlIII[18] = 106 ^ 96;
        lIIIIlIII[19] = 91 ^ 80;
        lIIIIlIII[20] = 9 ^ 5;
        lIIIIlIII[21] = 181 ^ 184;
        lIIIIlIII[22] = 53 ^ 59;
        lIIIIlIII[23] = (52 ^ 118) ^ (212 ^ 153);
        lIIIIlIII[24] = (-((-9418) & 29899)) & (-11785) & 32765;
        lIIIIlIII[25] = (-16436) & 28415;
        lIIIIlIII[26] = (-((-9001) & 14204)) & (-513) & 30715;
        lIIIIlIII[27] = (-8361) & 16367;
        lIIIIlIII[28] = 167 ^ 143;
        lIIIIlIII[29] = (-21027) & 22526;
        lIIIIlIII[30] = (((43 + 36) - (-13)) + 42) ^ (((95 + 134) - 191) + 112);
        lIIIIlIII[31] = 170 ^ 187;
        lIIIIlIII[32] = (-((-971) & 30667)) & (-89) & 32735;
        lIIIIlIII[33] = (-((-1585) & 30261)) & (-1) & 32127;
        lIIIIlIII[34] = 11 ^ 25;
        lIIIIlIII[35] = (42 ^ 80) ^ (193 ^ 168);
        lIIIIlIII[36] = (21 ^ 103) ^ (196 ^ 162);
        lIIIIlIII[37] = 143 ^ 154;
        lIIIIlIII[38] = 212 ^ 194;
    }

    private static boolean llIllIlIlll(int i, int i2) {
        return i < i2;
    }

    private static void llIllIlIlII() {
        lIIIIIlll = new String[lIIIIlIII[38]];
        lIIIIIlll[lIIIIlIII[0]] = llIllIlIIIl("KiEqGSYPdDoELQUn", "hTSpH");
        lIIIIIlll[lIIIIlIII[1]] = llIllIlIIlI("/vwUSjyhEq5FKXR9Va7dZLRtc8auSTJZp8QveQ3AzPr9Tp7krJbj5E10S6Hpslse", "fscGB");
        lIIIIIlll[lIIIIlIII[3]] = llIllIlIIIl("AAscKzI=", "DyuEY");
        lIIIIIlll[lIIIIlIII[5]] = llIllIlIIll("9ermjpbo1QSVTO37/xQepQ==", "xfexE");
        lIIIIIlll[lIIIIlIII[6]] = llIllIlIIIl("CTs2MQkoND91ByA0MzwLJg==", "AZXUe");
        lIIIIIlll[lIIIIlIII[12]] = llIllIlIIIl("OgB5LxUIRTQnFB4MNylHHBA8PRNNFiw+FwEMPD1LTRYuJxMODTAgAE0RNm4lODwQACA=", "meYNg");
        lIIIIIlll[lIIIIlIII[9]] = llIllIlIIlI("ApoFVX+65zEFtKiHSj0+8I9aN9y1F7ptJ5zwO3VQBBthwIPTIUsPdDG3TuQ7h6TdfKb5/cFmzzg=", "EDBTh");
        lIIIIIlll[lIIIIlIII[15]] = llIllIlIIIl("CS8sZwIobikzFzU6", "GNZGv");
        lIIIIIlll[lIIIIlIII[16]] = llIllIlIIll("b6R/Jf+7ZjvLiONQmq++Lw==", "hvLMb");
        lIIIIIlll[lIIIIlIII[17]] = llIllIlIIlI("juJk04QhGSM=", "ZzJBX");
        lIIIIIlll[lIIIIlIII[18]] = llIllIlIIll("1sdPCrxBxLE=", "EJSHZ");
        lIIIIIlll[lIIIIlIII[19]] = llIllIlIIlI("pMAhabhtBBE=", "xjUdX");
        lIIIIIlll[lIIIIlIII[20]] = llIllIlIIll("ib0kpdZcoLY=", "sGemr");
        lIIIIIlll[lIIIIlIII[21]] = llIllIlIIll("fhbeRlvKH73Gee6rzYbhWQ==", "lGnJs");
        lIIIIIlll[lIIIIlIII[22]] = llIllIlIIlI("Inmk1MdFDslXDtBg+BgRmGj45oqvKb+O", "FksTb");
        lIIIIIlll[lIIIIlIII[23]] = llIllIlIIlI("Dg6h4qyExB3VY9g93DC3yB+Dh1q33NofsDIL5EZGndWJpY+cDC91FojGTWbn6CBTnlvCdg/9vmg=", "FaEBP");
        lIIIIIlll[lIIIIlIII[30]] = llIllIlIIll("QN8uBm8HpodXjrk7DHW9fQ==", "hbAsY");
        lIIIIIlll[lIIIIlIII[31]] = llIllIlIIlI("Fl7z2Ti3esYbJ1ZS8zlb3dEzZAtInAba", "dDKNj");
        lIIIIIlll[lIIIIlIII[34]] = llIllIlIIIl("BVkZDSM4HApMOSNZGx8obAABGT9sGAAaJCAKQA==", "LynlM");
        lIIIIIlll[lIIIIlIII[35]] = llIllIlIIll("AIpKdj3pmGQEWgcA6Kf7o+KKfBN/vpKih7Ollt3Wpt3PhLTv+67j6Q==", "JIVuN");
        lIIIIIlll[lIIIIlIII[36]] = llIllIlIIll("3FSXAbDgwe7Z9fvMilLrSBbhitg24FmYE5RI9DQn3AY=", "xKlFr");
        lIIIIIlll[lIIIIlIII[37]] = llIllIlIIll("9XNOL9Sj8Ls=", "FnLXn");
    }

    private static boolean llIllIlIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cd, code lost:
        if (llIllIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIlIII[9]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020f, code lost:
        if (llIllIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIlIII[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0252, code lost:
        if (llIllIlIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIlIII[6]) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0255, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIIlll[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIlIII[12]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIlIII[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0270, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cj() {
        if (llIllIlIllI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[0]];
            C0001b.a(bv);
            if (llIllIlIlll(bv.size(), lIIIIlIII[1])) {
                System.out.println(lIIIIIlll[lIIIIlIII[1]]);
                bt = lIIIIlIII[0];
            }
        }
        if (llIllIllIII(bt ? 1 : 0)) {
            if (llIllIlIllI(Inventory.contains(C0005f.aV) ? 1 : 0) && llIllIlIlll(Movement.getRunEnergy(), lIIIIlIII[2])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIIIlll[lIIIIlIII[3]]);
                Time.sleepTicks(lIIIIlIII[1]);
                "".length();
            }
            if (llIllIllIII(Movement.isRunEnabled() ? 1 : 0) && llIllIllIIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIllIllIII(ab() ? 1 : 0) && llIllIlIlll(C0004e.j(lIIIIlIII[4]), lIIIIlIII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllIllIlI(nearest) && llIllIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[5]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIIlIII[3]);
                    "".length();
                }
                if (llIllIllIlI(nearest) && llIllIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[6]];
                    if (llIllIllIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIlIII[7]);
                        "".length();
                    }
                    if (llIllIlIllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIllIllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIlIII[6]);
                            "".length();
                        }
                        if (llIllIllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIlIII[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIlIII[1]];
                        iArr[lIIIIlIII[0]] = lIIIIlIII[8];
                        if (llIllIlIllI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIIlIII[1]];
                            iArr2[lIIIIlIII[0]] = lIIIIlIII[8];
                        }
                        int[] iArr3 = new int[lIIIIlIII[1]];
                        iArr3[lIIIIlIII[0]] = lIIIIlIII[10];
                        if (llIllIlIllI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIlIII[1]];
                            iArr4[lIIIIlIII[0]] = lIIIIlIII[10];
                        }
                        int[] iArr5 = new int[lIIIIlIII[1]];
                        iArr5[lIIIIlIII[0]] = lIIIIlIII[11];
                        if (llIllIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIIlIII[1]];
                            iArr6[lIIIIlIII[0]] = lIIIIlIII[11];
                        }
                        int[] iArr7 = new int[lIIIIlIII[6]];
                        iArr7[lIIIIlIII[0]] = lIIIIlIII[11];
                        iArr7[lIIIIlIII[1]] = lIIIIlIII[10];
                        iArr7[lIIIIlIII[3]] = lIIIIlIII[8];
                        iArr7[lIIIIlIII[5]] = lIIIIlIII[13];
                        if (llIllIllIII(C0004e.b(iArr7) ? 1 : 0)) {
                            af();
                            System.out.println(lIIIIIlll[lIIIIlIII[9]]);
                            bt = lIIIIlIII[1];
                            return;
                        }
                        int[] iArr8 = new int[lIIIIlIII[6]];
                        iArr8[lIIIIlIII[0]] = lIIIIlIII[11];
                        iArr8[lIIIIlIII[1]] = lIIIIlIII[10];
                        iArr8[lIIIIlIII[3]] = lIIIIlIII[8];
                        iArr8[lIIIIlIII[5]] = lIIIIlIII[13];
                        if (llIllIlIllI(C0004e.b(iArr8) ? 1 : 0)) {
                            C0000a.a(lIIIIlIII[11], lIIIIlIII[6]);
                            C0000a.a(lIIIIlIII[10], lIIIIlIII[3]);
                            C0000a.a(lIIIIlIII[8], lIIIIlIII[9]);
                            C0000a.a(lIIIIlIII[13], lIIIIlIII[1]);
                        }
                        if (llIllIlIllI(AccBuilderEasyClues.e ? 1 : 0)) {
                            C0000a.b(C0005f.bf, lIIIIlIII[1]);
                        }
                    }
                }
            }
            if (llIllIllIII(ab() ? 1 : 0) && llIllIllIIl(C0004e.j(lIIIIlIII[4])) && llIllIlllII(Players.getLocal().getWorldLocation().distanceTo(je), lIIIIlIII[12])) {
                ck();
            }
            if ((!llIllIllIII(ab() ? 1 : 0) || llIllIlllIl(Players.getLocal().getWorldLocation().distanceTo(je), lIIIIlIII[12])) && llIllIlIlll(C0004e.j(lIIIIlIII[4]), lIIIIlIII[14])) {
                if (llIllIlllII(Players.getLocal().getWorldLocation().distanceTo(je), lIIIIlIII[6])) {
                    cl = lIIIIlIII[0];
                    AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[15]];
                    if (llIllIlIlll(bT, lIIIIlIII[1])) {
                        C0004e.v();
                        bT += lIIIIlIII[1];
                    }
                    Movement.walkTo(je);
                    "".length();
                }
                if (llIllIlllIl(Players.getLocal().getWorldLocation().distanceTo(je), lIIIIlIII[9])) {
                    AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[16]];
                    String[] strArr = new String[lIIIIlIII[1]];
                    strArr[lIIIIlIII[0]] = lIIIIIlll[lIIIIlIII[17]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (llIllIllIlI(nearest2)) {
                        String[] strArr2 = new String[lIIIIlIII[1]];
                        strArr2[lIIIIlIII[0]] = lIIIIIlll[lIIIIlIII[18]];
                        if (llIllIlIllI(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lIIIIIlll[lIIIIlIII[19]]);
                            Time.sleepTicks(lIIIIlIII[5]);
                            "".length();
                        }
                    }
                    if (llIllIlIlll(cl, lIIIIlIII[1])) {
                        an.pO += lIIIIlIII[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIIIlIII[1];
                        an.pO = lIIIIlIII[0];
                        cm = lIIIIlIII[0];
                    }
                    C0006g.a(lIIIIIlll[lIIIIlIII[20]], jf);
                }
            }
            C0006g.a(new String[lIIIIlIII[0]]);
        }
        System.out.println("Setting: " + C0004e.j(lIIIIlIII[4]));
    }

    private static boolean llIllIlllIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIIIlIII[0];
    }

    private static boolean llIllIllIII(int i) {
        return i == 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            cj();
            "".length();
            if ((((62 ^ 117) ^ (203 ^ 147)) & (((197 ^ 164) ^ (79 ^ 61)) ^ (-" ".length()))) == " ".length()) {
                return ((16 ^ 120) ^ (223 ^ 167)) & (((26 ^ 67) ^ (43 ^ 98)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIIlIII[18];
    }

    private static String llIllIlIIIl(String lIIlIIlllllllll, String lIIlIIllllllllI) {
        String lIIlIIlllllllll2 = new String(Base64.getDecoder().decode(lIIlIIlllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIlllllllIl = new StringBuilder();
        char[] charArray = lIIlIIllllllllI.toCharArray();
        int lIIlIIllllllIll = lIIIIlIII[0];
        char[] charArray2 = lIIlIIlllllllll2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIlIII[0];
        while (llIllIlIlll(i, length)) {
            char lIIlIIlllllIIlI = charArray2[i];
            lIIlIIlllllllIl.append((char) (lIIlIIlllllIIlI ^ charArray[lIIlIIllllllIll % charArray.length]));
            "".length();
            lIIlIIllllllIll++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lIIlIIlllllllIl);
    }

    private static boolean llIllIllIlI(Object obj) {
        return obj != null;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIIIIlll[lIIIIlIII[30]];
    }

    private static String llIllIlIIlI(String lIIlIIllllIlIlI, String lIIlIIllllIlIIl) {
        try {
            SecretKeySpec lIIlIIllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIllllIllII = Cipher.getInstance("Blowfish");
            lIIlIIllllIllII.init(lIIIIlIII[3], lIIlIIllllIllIl);
            return new String(lIIlIIllllIllII.doFinal(Base64.getDecoder().decode(lIIlIIllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIllllIlIll) {
            lIIlIIllllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIllIll(int i, int i2) {
        return i >= i2;
    }

    static {
        llIllIlIlIl();
        llIllIlIlII();
        jb = lIIIIlIII[8];
        jc = lIIIIlIII[10];
        jd = lIIIIlIII[11];
        je = new WorldPoint(lIIIIlIII[32], lIIIIlIII[33], lIIIIlIII[0]);
        String[] strArr = new String[lIIIIlIII[6]];
        strArr[lIIIIlIII[0]] = lIIIIIlll[lIIIIlIII[34]];
        strArr[lIIIIlIII[1]] = lIIIIIlll[lIIIIlIII[35]];
        strArr[lIIIIlIII[3]] = lIIIIIlll[lIIIIlIII[36]];
        strArr[lIIIIlIII[5]] = lIIIIIlll[lIIIIlIII[37]];
        jf = strArr;
        bv = new ArrayList();
        bT = lIIIIlIII[0];
    }

    private static boolean llIllIlllII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e6, code lost:
        if (llIllIlIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIlIII[3]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016f, code lost:
        if (llIllIlIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIlIII[6]) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIllIlIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.M.lIIIIlIII[9]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIIIIlIII[1]];
        iArr5[lIIIIlIII[0]] = lIIIIlIII[8];
        if (llIllIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIIIlIII[1]];
            iArr6[lIIIIlIII[0]] = lIIIIlIII[8];
            if (llIllIlIllI(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lIIIIlIII[1]];
                iArr7[lIIIIlIII[0]] = lIIIIlIII[8];
            }
            iArr = new int[lIIIIlIII[1]];
            iArr[lIIIIlIII[0]] = lIIIIlIII[10];
            if (llIllIlIllI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIIlIII[1]];
                iArr8[lIIIIlIII[0]] = lIIIIlIII[10];
                if (llIllIlIllI(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIIIlIII[1]];
                    iArr9[lIIIIlIII[0]] = lIIIIlIII[10];
                }
                iArr2 = new int[lIIIIlIII[1]];
                iArr2[lIIIIlIII[0]] = lIIIIlIII[11];
                if (llIllIlIllI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIlIII[1]];
                    iArr10[lIIIIlIII[0]] = lIIIIlIII[11];
                    if (llIllIlIllI(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIlIII[1]];
                        iArr11[lIIIIlIII[0]] = lIIIIlIII[11];
                    }
                    iArr3 = new int[lIIIIlIII[1]];
                    iArr3[lIIIIlIII[0]] = lIIIIlIII[13];
                    if (llIllIllIII(Bank.contains(iArr3) ? 1 : 0)) {
                        bv.add(new C0003d(lIIIIlIII[13], lIIIIlIII[12], lIIIIlIII[7]));
                        "".length();
                    }
                    if (llIllIllIII(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(lIIIIIlll[lIIIIlIII[31]]);
                    }) ? 1 : 0)) {
                        bv.add(new C0003d(lIIIIlIII[25], lIIIIlIII[12], lIIIIlIII[26]));
                        "".length();
                    }
                    iArr4 = new int[lIIIIlIII[1]];
                    iArr4[lIIIIlIII[0]] = lIIIIlIII[27];
                    if (llIllIllIII(Bank.contains(iArr4) ? 1 : 0)) {
                        return;
                    }
                    bv.add(new C0003d(lIIIIlIII[27], lIIIIlIII[28], lIIIIlIII[29]));
                    "".length();
                    return;
                }
                bv.add(new C0003d(lIIIIlIII[11], lIIIIlIII[6], lIIIIlIII[24]));
                "".length();
                iArr3 = new int[lIIIIlIII[1]];
                iArr3[lIIIIlIII[0]] = lIIIIlIII[13];
                if (llIllIllIII(Bank.contains(iArr3) ? 1 : 0)) {
                }
                if (llIllIllIII(Bank.contains(item2 -> {
                    return item2.getName().toLowerCase().contains(lIIIIIlll[lIIIIlIII[31]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[lIIIIlIII[1]];
                iArr4[lIIIIlIII[0]] = lIIIIlIII[27];
                if (llIllIllIII(Bank.contains(iArr4) ? 1 : 0)) {
                }
            }
            bv.add(new C0003d(lIIIIlIII[10], lIIIIlIII[3], lIIIIlIII[24]));
            "".length();
            iArr2 = new int[lIIIIlIII[1]];
            iArr2[lIIIIlIII[0]] = lIIIIlIII[11];
            if (llIllIlIllI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIIIlIII[11], lIIIIlIII[6], lIIIIlIII[24]));
            "".length();
            iArr3 = new int[lIIIIlIII[1]];
            iArr3[lIIIIlIII[0]] = lIIIIlIII[13];
            if (llIllIllIII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            if (llIllIllIII(Bank.contains(item22 -> {
                return item22.getName().toLowerCase().contains(lIIIIIlll[lIIIIlIII[31]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[lIIIIlIII[1]];
            iArr4[lIIIIlIII[0]] = lIIIIlIII[27];
            if (llIllIllIII(Bank.contains(iArr4) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(lIIIIlIII[8], lIIIIlIII[9], lIIIIlIII[24]));
        "".length();
        iArr = new int[lIIIIlIII[1]];
        iArr[lIIIIlIII[0]] = lIIIIlIII[10];
        if (llIllIlIllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIIlIII[10], lIIIIlIII[3], lIIIIlIII[24]));
        "".length();
        iArr2 = new int[lIIIIlIII[1]];
        iArr2[lIIIIlIII[0]] = lIIIIlIII[11];
        if (llIllIlIllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIIlIII[11], lIIIIlIII[6], lIIIIlIII[24]));
        "".length();
        iArr3 = new int[lIIIIlIII[1]];
        iArr3[lIIIIlIII[0]] = lIIIIlIII[13];
        if (llIllIllIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (llIllIllIII(Bank.contains(item222 -> {
            return item222.getName().toLowerCase().contains(lIIIIIlll[lIIIIlIII[31]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIIlIII[1]];
        iArr4[lIIIIlIII[0]] = lIIIIlIII[27];
        if (llIllIllIII(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIIIlIII[1]];
        iArr[lIIIIlIII[0]] = lIIIIlIII[8];
        if (llIllIllIll(Inventory.getCount(iArr), lIIIIlIII[9])) {
            int[] iArr2 = new int[lIIIIlIII[1]];
            iArr2[lIIIIlIII[0]] = lIIIIlIII[10];
            if (llIllIllIll(Inventory.getCount(iArr2), lIIIIlIII[3])) {
                int[] iArr3 = new int[lIIIIlIII[1]];
                iArr3[lIIIIlIII[0]] = lIIIIlIII[11];
                if (llIllIllIll(Inventory.getCount(iArr3), lIIIIlIII[6])) {
                    ?? r0 = lIIIIlIII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIIIlIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (llIllIllIll(C0004e.j(lIIIIlIII[4]), lIIIIlIII[14])) {
            ?? r0 = lIIIIlIII[1];
            "".length();
            return (-"   ".length()) > 0 ? ("   ".length() ^ (194 ^ 198)) & (((((11 + 75) - 54) + 107) ^ (((18 + 135) - 64) + 51)) ^ (-" ".length())) : r0;
        }
        return lIIIIlIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    private static void ck() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIllIllIlI(nearest) && llIllIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[21]];
            C0000a.a(nearest);
            Time.sleepTicks(lIIIIlIII[3]);
            "".length();
        }
        if (llIllIllIlI(nearest) && llIllIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[22]];
            if (llIllIllIII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIIlIII[7]);
                "".length();
            }
            if (llIllIlIllI(Bank.isOpen() ? 1 : 0)) {
                if (llIllIllIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIIlIII[6]);
                    "".length();
                }
                if (llIllIllIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIIIlIII[3]);
                    "".length();
                }
                int[] iArr = new int[lIIIIlIII[6]];
                iArr[lIIIIlIII[0]] = lIIIIlIII[11];
                iArr[lIIIIlIII[1]] = lIIIIlIII[10];
                iArr[lIIIIlIII[3]] = lIIIIlIII[8];
                iArr[lIIIIlIII[5]] = lIIIIlIII[13];
                if (llIllIllIII(C0004e.b(iArr) ? 1 : 0)) {
                    af();
                    System.out.println(lIIIIIlll[lIIIIlIII[23]]);
                    bt = lIIIIlIII[1];
                    return;
                }
                int[] iArr2 = new int[lIIIIlIII[6]];
                iArr2[lIIIIlIII[0]] = lIIIIlIII[11];
                iArr2[lIIIIlIII[1]] = lIIIIlIII[10];
                iArr2[lIIIIlIII[3]] = lIIIIlIII[8];
                iArr2[lIIIIlIII[5]] = lIIIIlIII[13];
                if (llIllIlIllI(C0004e.b(iArr2) ? 1 : 0)) {
                    C0000a.a(lIIIIlIII[11], lIIIIlIII[6]);
                    C0000a.a(lIIIIlIII[10], lIIIIlIII[3]);
                    C0000a.a(lIIIIlIII[8], lIIIIlIII[9]);
                    C0000a.a(lIIIIlIII[13], lIIIIlIII[1]);
                }
                C0000a.b(C0005f.bf, lIIIIlIII[1]);
            }
        }
    }
}
