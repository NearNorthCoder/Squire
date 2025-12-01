package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.Y  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/Y.class */
public class Y implements InterfaceC0003ac {
    static /* synthetic */ boolean dj;
    private static final /* synthetic */ WorldPoint mz;
    public static final /* synthetic */ String[] my;
    static /* synthetic */ int cG;
    private static final /* synthetic */ WorldPoint mC;
    private static /* synthetic */ int[] llIlllllll;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] llIlllllIl;
    private static final /* synthetic */ WorldPoint mB;
    private static final /* synthetic */ WorldPoint mA;
    static /* synthetic */ int di;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllllIIIllIl(C0018e.j(llIlllllll[6]), llIlllllll[8])) {
            ?? r0 = llIlllllll[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlllllll[0];
    }

    private static boolean lIllllIIIIlII(int i, int i2) {
        return i < i2;
    }

    private static void lIllllIIIIIII() {
        llIlllllIl = new String[llIlllllll[74]];
        llIlllllIl[llIlllllll[0]] = lIlllIlllllII("VijtT3JLsGjMZV2Bpg+1xg==", "rlkcn");
        llIlllllIl[llIlllllll[1]] = lIlllIlllllIl("FwAvADo5DCVJKyQQKAcucQA1DCQiRWEaPjgdIgEgPw5hCygyAmEdJnEYNAw6JQ==", "QiAiI");
        llIlllllIl[llIlllllll[3]] = lIlllIllllllI("M6NPFOqFHI8=", "kzfog");
        llIlllllIl[llIlllllll[5]] = lIlllIllllllI("wgRk036F2pk=", "ZpmPq");
        llIlllllIl[llIlllllll[7]] = lIlllIlllllII("MwjBZ/ksTmK18cEcdFtEsg==", "JDiqY");
        llIlllllIl[llIlllllll[8]] = lIlllIlllllIl("PxIaNiYeHRNyKBYdHzskEA==", "wstRJ");
        llIlllllIl[llIlllllll[14]] = lIlllIllllllI("RbdWLRm0hai7nq1//qC9VymabOBdTojHbiQkH65UGpnawoiIPLo8CoSpvnNA63Ei1LUL59wdVS8=", "JbJNM");
        llIlllllIl[llIlllllll[20]] = lIlllIlllllIl("LSwuHAsZbRsRHA4uMQ==", "kMZtn");
        llIlllllIl[llIlllllll[18]] = lIlllIllllllI("A+kTggJ4AMzy/pVRJ0+TsA==", "BmWyM");
        llIlllllIl[llIlllllll[21]] = lIlllIllllllI("xEPX4VUXYCW4HCFg5YiNog==", "KccfH");
        llIlllllIl[llIlllllll[15]] = lIlllIlllllIl("Ny4NDxIDbzgCBRQsEg==", "qOygw");
        llIlllllIl[llIlllllll[19]] = lIlllIlllllIl("LCUGQQ0NZB4EGgkoEQIcQiMFGA==", "bDpay");
        llIlllllIl[llIlllllll[22]] = lIlllIlllllII("02WjZdAXm0Jx9u6pBp0NiQ==", "nSEuk");
        llIlllllIl[llIlllllll[23]] = lIlllIlllllII("DPHqKFP3b4Y=", "jEyMT");
        llIlllllIl[llIlllllll[24]] = lIlllIllllllI("4WYDwb+Mq+o=", "CrHvp");
        llIlllllIl[llIlllllll[25]] = lIlllIlllllIl("ITQhGA==", "nDDvU");
        llIlllllIl[llIlllllll[26]] = lIlllIllllllI("Ku76wHK5LX8x/1GCsobe/g==", "lcVKU");
        llIlllllIl[llIlllllll[28]] = lIlllIllllllI("LLmPBB5b5HE=", "FJWYP");
        llIlllllIl[llIlllllll[29]] = lIlllIlllllII("eJItOr1jyg+vmzGCJPyskw==", "MDoit");
        llIlllllIl[llIlllllll[30]] = lIlllIlllllIl("Jg4/DQIHATZJDQEJNwAA", "noQin");
        llIlllllIl[llIlllllll[31]] = lIlllIlllllIl("FAcwJRkjETBxEi4NMCU=", "FbCQu");
        llIlllllIl[llIlllllll[32]] = lIlllIlllllII("jBFQROp3zhHjx+9pCx5Iug==", "jYsMf");
        llIlllllIl[llIlllllll[33]] = lIlllIlllllIl("OysoJyAW", "xDNAI");
        llIlllllIl[llIlllllll[34]] = lIlllIllllllI("FCcnLtiwia4=", "LAera");
        llIlllllIl[llIlllllll[35]] = lIlllIllllllI("sldPpH5/T0CaUY+uY0vfQQ==", "oxIPt");
        llIlllllIl[llIlllllll[36]] = lIlllIlllllII("VgBdzpeEdIiBJgssEv2y7g==", "jcUpZ");
        llIlllllIl[llIlllllll[37]] = lIlllIlllllIl("OSQtKSE=", "xHYHS");
        llIlllllIl[llIlllllll[38]] = lIlllIlllllII("t7qQ077w4Bk=", "uCaet");
        llIlllllIl[llIlllllll[39]] = lIlllIlllllIl("FDcQBQ==", "CRqwI");
        llIlllllIl[llIlllllll[40]] = lIlllIlllllII("hGmXUr+vuoRgxFYgUSAr2Q==", "EJWVG");
        llIlllllIl[llIlllllll[41]] = lIlllIllllllI("c2X/K745VSfRWWfJ/cP/FQ==", "IGvKD");
        llIlllllIl[llIlllllll[42]] = lIlllIlllllIl("OyInAj8W", "xMAdV");
        llIlllllIl[llIlllllll[43]] = lIlllIlllllII("bNZoLp5WccQ=", "QFHSj");
        llIlllllIl[llIlllllll[44]] = lIlllIllllllI("n1DjJWRcjEw=", "ZwyFZ");
        llIlllllIl[llIlllllll[45]] = lIlllIlllllIl("EC8AEgxwNE8SEyIrAw==", "WGoax");
        llIlllllIl[llIlllllll[52]] = lIlllIllllllI("bPU11qY55t2Y7676g1KMnqiBQTUYIkAq", "rsSFX");
        llIlllllIl[llIlllllll[53]] = lIlllIlllllIl("KioIBUc3JUYVAjkvEgpHcA==", "XCfbg");
        llIlllllIl[llIlllllll[54]] = lIlllIlllllII("jJNLfVUvdFRFaxq2f+cTjbRR77m7RqZrAiS5NyyR+MQ=", "IRuSe");
        llIlllllIl[llIlllllll[55]] = lIlllIllllllI("2ybdPnbCZi3qRV3nHHYHDLiRv/TAMCcdSpx9uNE4U/n0aNhtBBj+eA==", "OsOYF");
        llIlllllIl[llIlllllll[56]] = lIlllIlllllIl("PiUzJTgdai8nPBc5YTs2BjhhKjwfOmA=", "sJABY");
        llIlllllIl[llIlllllll[57]] = lIlllIlllllII("zkzlQj8HKrU=", "AUbLD");
        llIlllllIl[llIlllllll[58]] = lIlllIlllllII("J8e9bCXlrLrR+2w1zoFUV4lSq+6Ws/gAizbLsMgyjGo=", "KSOZI");
        llIlllllIl[llIlllllll[59]] = lIlllIlllllII("NTQJPR/DTTTYyNuxfRo0n8ZtP3qNP1/f", "bkylc");
        llIlllllIl[llIlllllll[60]] = lIlllIlllllIl("IAAEHQ0UQTEQGgMCG1UbAw8EVQUDQQQaSBIAHB5IEg5QDAcTTw==", "fapuh");
        llIlllllIl[llIlllllll[61]] = lIlllIlllllII("/7BTOVIUWNiQTyYzcLQ5hhJNjp9RsKXqTBpYLAW+zyHsxr0sO/EnRI5N/zc3yknH", "SNHzC");
        llIlllllIl[llIlllllll[62]] = lIlllIllllllI("eUzza8YcjTJoi88sjjd/E4nfyxja0JOJZBFOFviX1F+nrYz0x6271A==", "jziGd");
        llIlllllIl[llIlllllll[63]] = lIlllIllllllI("i6sxVxE8mxk=", "gfHIl");
        llIlllllIl[llIlllllll[64]] = lIlllIlllllII("g6zBKXDST3R35qudQUdPUfYJEKYoLfJ+ytB8Y3ZFcrkXWzcps+0pVw==", "ZVdMn");
        llIlllllIl[llIlllllll[65]] = lIlllIlllllII("StzbRRIJgHfazt4sq6BUkA==", "ObWLy");
        llIlllllIl[llIlllllll[66]] = lIlllIllllllI("564lqPuYKnx3aQg1i3zX0Q==", "lknfs");
    }

    private static boolean lIllllIIIIlll(int i) {
        return i > 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlllllIl[llIlllllll[52]];
    }

    private static void lIllllIIIIIIl() {
        llIlllllll = new int[75];
        llIlllllll[0] = (103 ^ 123) & ((173 ^ 177) ^ (-1));
        llIlllllll[1] = " ".length();
        llIlllllll[2] = (((27 + 59) - 34) + 202) ^ (((112 + 67) - 79) + 84);
        llIlllllll[3] = "  ".length();
        llIlllllll[4] = (-((-10673) & 27061)) & (-6145) & 22911;
        llIlllllll[5] = "   ".length();
        llIlllllll[6] = 214 ^ 189;
        llIlllllll[7] = 190 ^ 186;
        llIlllllll[8] = 86 ^ 83;
        llIlllllll[9] = (-10290) & 15289;
        llIlllllll[10] = (-16678) & 28655;
        llIlllllll[11] = (-24727) & 32734;
        llIlllllll[12] = (-515) & 13139;
        llIlllllll[13] = (-24729) & 32735;
        llIlllllll[14] = 149 ^ 147;
        llIlllllll[15] = (106 ^ 86) ^ (25 ^ 47);
        llIlllllll[16] = (-((-1545) & 30542)) & (-17) & 32253;
        llIlllllll[17] = (-((-5605) & 14327)) & (-4353) & 16278;
        llIlllllll[18] = 32 ^ 40;
        llIlllllll[19] = 65 ^ 74;
        llIlllllll[20] = 49 ^ 54;
        llIlllllll[21] = 135 ^ 142;
        llIlllllll[22] = 169 ^ 165;
        llIlllllll[23] = 55 ^ 58;
        llIlllllll[24] = (63 ^ 93) ^ (84 ^ 56);
        llIlllllll[25] = 157 ^ 146;
        llIlllllll[26] = (234 ^ 148) ^ (125 ^ 19);
        llIlllllll[27] = (-((-19047) & 31735)) & (-17475) & 30714;
        llIlllllll[28] = 131 ^ 146;
        llIlllllll[29] = (14 ^ 124) ^ (239 ^ 143);
        llIlllllll[30] = (124 ^ 108) ^ "   ".length();
        llIlllllll[31] = 59 ^ 47;
        llIlllllll[32] = (254 ^ 134) ^ (114 ^ 31);
        llIlllllll[33] = 11 ^ 29;
        llIlllllll[34] = (2 ^ 24) ^ (72 ^ 69);
        llIlllllll[35] = (91 ^ 4) ^ (42 ^ 109);
        llIlllllll[36] = 144 ^ 137;
        llIlllllll[37] = (((65 + 82) - 9) + 10) ^ (((107 + 59) - 90) + 66);
        llIlllllll[38] = 150 ^ 141;
        llIlllllll[39] = 96 ^ 124;
        llIlllllll[40] = 159 ^ 130;
        llIlllllll[41] = 149 ^ 139;
        llIlllllll[42] = 94 ^ 65;
        llIlllllll[43] = 182 ^ 150;
        llIlllllll[44] = 180 ^ 149;
        llIlllllll[45] = 155 ^ 185;
        llIlllllll[46] = (-((-602) & 1019)) & (-16451) & 32767;
        llIlllllll[47] = (-16420) & 22319;
        llIlllllll[48] = (-4131) & 16110;
        llIlllllll[49] = (-((-16805) & 23468)) & (-1) & 31663;
        llIlllllll[50] = (-20611) & 22510;
        llIlllllll[51] = 60 ^ 88;
        llIlllllll[52] = 172 ^ 143;
        llIlllllll[53] = 173 ^ 137;
        llIlllllll[54] = (143 ^ 174) ^ (80 ^ 84);
        llIlllllll[55] = 82 ^ 116;
        llIlllllll[56] = ((81 ^ 15) & ((120 ^ 38) ^ (-1))) ^ (10 ^ 45);
        llIlllllll[57] = 38 ^ 14;
        llIlllllll[58] = (((65 + 122) - 159) + 144) ^ (((27 + 83) - 56) + 79);
        llIlllllll[59] = (119 ^ 95) ^ "  ".length();
        llIlllllll[60] = 233 ^ 194;
        llIlllllll[61] = 14 ^ 34;
        llIlllllll[62] = (47 ^ 15) ^ (36 ^ 41);
        llIlllllll[63] = (141 ^ 132) ^ (188 ^ 155);
        llIlllllll[64] = (190 ^ 176) ^ (107 ^ 74);
        llIlllllll[65] = 177 ^ 129;
        llIlllllll[66] = 3 ^ 50;
        llIlllllll[67] = (-12834) & 16043;
        llIlllllll[68] = (-5010) & 8155;
        llIlllllll[69] = (-20866) & 24041;
        llIlllllll[70] = (-((-2257) & 31709)) & (-1) & 32701;
        llIlllllll[71] = (-((-10265) & 15258)) & (-16389) & 24575;
        llIlllllll[72] = (-24657) & 27774;
        llIlllllll[73] = (-4257) & 13822;
        llIlllllll[74] = 33 ^ 19;
    }

    private static boolean lIllllIIIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllllIIIllIl(int i, int i2) {
        return i >= i2;
    }

    private static String lIlllIlllllII(String lllllllllllllllllIllllllIIllIIlI, String lllllllllllllllllIllllllIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllllIIllIIIl.getBytes(StandardCharsets.UTF_8)), llIlllllll[18]), "DES");
            Cipher lllllllllllllllllIllllllIIllIlII = Cipher.getInstance("DES");
            lllllllllllllllllIllllllIIllIlII.init(llIlllllll[3], secretKeySpec);
            return new String(lllllllllllllllllIllllllIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllllIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllllIIllIIll) {
            lllllllllllllllllIllllllIIllIIll.printStackTrace();
            return null;
        }
    }

    private static String lIlllIllllllI(String lllllllllllllllllIllllllIIllllll, String lllllllllllllllllIllllllIIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllllIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllllIlIIIIII) {
            lllllllllllllllllIllllllIlIIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    public static void eq() {
        if (lIllllIIIIIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllllIl[llIlllllll[0]];
            C0015b.a(bv);
            if (lIllllIIIIlII(bv.size(), llIlllllll[1])) {
                System.out.println(llIlllllIl[llIlllllll[1]]);
                bt = llIlllllll[0];
            }
        }
        if (lIllllIIIIlIl(bt ? 1 : 0)) {
            if (lIllllIIIIIll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIllllIIIIlII(Movement.getRunEnergy(), llIlllllll[2])) {
                Inventory.getFirst(C0019f.ba).interact(llIlllllIl[llIlllllll[3]]);
                Time.sleepTicks(llIlllllll[1]);
                "".length();
            }
            if (lIllllIIIIllI(lIllllIIIIIlI(C0018e.w(), 70.0d))) {
                int[] iArr = new int[llIlllllll[1]];
                iArr[llIlllllll[0]] = llIlllllll[4];
                if (lIllllIIIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIlllllll[1]];
                    iArr2[llIlllllll[0]] = llIlllllll[4];
                    Inventory.getFirst(iArr2).interact(llIlllllIl[llIlllllll[5]]);
                }
            }
            if (lIllllIIIIlIl(Movement.isRunEnabled() ? 1 : 0) && lIllllIIIIlll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIllllIIIIlIl(an() ? 1 : 0) && lIllllIIIIlII(C0018e.j(llIlllllll[6]), llIlllllll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllllIIIlIII(nearest) && lIllllIIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[7]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llIlllllll[3]);
                    "".length();
                }
                if (lIllllIIIlIII(nearest) && lIllllIIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[8]];
                    if (lIllllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlllllll[9]);
                        "".length();
                    }
                    if (lIllllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIllllIIIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlllllll[7]);
                            "".length();
                        }
                        if (lIllllIIIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlllllll[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[llIlllllll[8]];
                        iArr3[llIlllllll[0]] = llIlllllll[10];
                        iArr3[llIlllllll[1]] = llIlllllll[11];
                        iArr3[llIlllllll[3]] = llIlllllll[12];
                        iArr3[llIlllllll[5]] = llIlllllll[13];
                        iArr3[llIlllllll[7]] = llIlllllll[4];
                        if (lIllllIIIIlIl(C0018e.c(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlllllIl[llIlllllll[14]]);
                            bt = llIlllllll[1];
                            return;
                        }
                        Bank.withdraw(llIlllllll[11], llIlllllll[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlllllll[1]);
                        "".length();
                        Bank.withdraw(llIlllllll[13], llIlllllll[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlllllll[1]);
                        "".length();
                        Bank.withdraw(llIlllllll[10], llIlllllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlllllll[1]);
                        "".length();
                        C0000a.b(C0019f.ba, llIlllllll[1]);
                        C0000a.a(llIlllllll[4], llIlllllll[15]);
                        C0000a.b(C0019f.bk, llIlllllll[1]);
                    }
                }
            }
            if (lIllllIIIIIll(an() ? 1 : 0) && lIllllIIIIlII(C0018e.j(llIlllllll[6]), llIlllllll[1])) {
                new WorldArea(llIlllllll[16], llIlllllll[17], llIlllllll[18], llIlllllll[19], llIlllllll[0]);
                String[] strArr = new String[llIlllllll[1]];
                strArr[llIlllllll[0]] = llIlllllIl[llIlllllll[20]];
                NPC nearest2 = NPCs.getNearest(strArr);
                if (lIllllIIIlIIl(nearest2) && lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mz), llIlllllll[5]) && lIllllIIIIlIl(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[18]];
                    if (lIllllIIIIlII(cG, llIlllllll[1])) {
                        C0018e.x();
                        cG += llIlllllll[1];
                    }
                    Movement.walkTo(mz);
                    "".length();
                    Time.sleepTicks(llIlllllll[1]);
                    "".length();
                }
                if (lIllllIIIlIII(nearest2)) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[21]];
                    C0020g.a(llIlllllIl[llIlllllll[15]], my, llIlllllll[1]);
                }
            }
            if (lIllllIIIlIll(C0018e.j(llIlllllll[6]), llIlllllll[1])) {
                if (lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mA), llIlllllll[14])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[19]];
                    Movement.walkTo(mA);
                    "".length();
                    Time.sleepTicks(llIlllllll[1]);
                    "".length();
                }
                if (lIllllIIIllII(Players.getLocal().getWorldLocation().distanceTo(mA), llIlllllll[14])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[22]];
                    String[] strArr2 = new String[llIlllllll[1]];
                    strArr2[llIlllllll[0]] = llIlllllIl[llIlllllll[23]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (lIllllIIIlIII(nearest3)) {
                        String[] strArr3 = new String[llIlllllll[1]];
                        strArr3[llIlllllll[0]] = llIlllllIl[llIlllllll[24]];
                        if (lIllllIIIIIll(nearest3.hasAction(strArr3) ? 1 : 0)) {
                            nearest3.interact(llIlllllIl[llIlllllll[25]]);
                            Time.sleepTicks(llIlllllll[8]);
                            "".length();
                        }
                    }
                    C0020g.a(llIlllllIl[llIlllllll[26]], my);
                }
            }
            if (lIllllIIIlIll(C0018e.j(llIlllllll[6]), llIlllllll[3])) {
                if (lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), llIlllllll[3])) {
                    int[] iArr4 = new int[llIlllllll[1]];
                    iArr4[llIlllllll[0]] = llIlllllll[27];
                    if (lIllllIIIIIll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIlllllll[1]];
                        iArr5[llIlllllll[0]] = llIlllllll[27];
                        Inventory.getFirst(iArr5).interact(llIlllllIl[llIlllllll[28]]);
                        Time.sleepTicks(llIlllllll[1]);
                        "".length();
                    }
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[29]];
                    Movement.walkTo(mB);
                    "".length();
                    Time.sleepTicks(llIlllllll[1]);
                    "".length();
                }
                if (lIllllIIIllII(Players.getLocal().getWorldLocation().distanceTo(mB), llIlllllll[3])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[30]];
                    String[] strArr4 = new String[llIlllllll[1]];
                    strArr4[llIlllllll[0]] = llIlllllIl[llIlllllll[31]];
                    NPC nearest4 = NPCs.getNearest(strArr4);
                    if (lIllllIIIlIII(nearest4)) {
                        C0020g.a(llIlllllIl[llIlllllll[32]], my);
                    }
                    if (lIllllIIIlIIl(nearest4)) {
                        String[] strArr5 = new String[llIlllllll[1]];
                        strArr5[llIlllllll[0]] = llIlllllIl[llIlllllll[33]];
                        TileObjects.getNearest(strArr5).interact(llIlllllIl[llIlllllll[34]]);
                        Time.sleepTicks(llIlllllll[3]);
                        "".length();
                    }
                }
            }
            if (lIllllIIIlIll(C0018e.j(llIlllllll[6]), llIlllllll[5])) {
                di = llIlllllll[0];
                if (lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mC), llIlllllll[5])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[35]];
                    Movement.walkTo(mC);
                    "".length();
                    Time.sleepTicks(llIlllllll[1]);
                    "".length();
                }
                if (lIllllIIIllII(Players.getLocal().getWorldLocation().distanceTo(mC), llIlllllll[5])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[36]];
                    String[] strArr6 = new String[llIlllllll[1]];
                    strArr6[llIlllllll[0]] = llIlllllIl[llIlllllll[37]];
                    TileObject nearest5 = TileObjects.getNearest(strArr6);
                    if (lIllllIIIlIII(nearest5)) {
                        nearest5.interact(llIlllllIl[llIlllllll[38]]);
                    }
                }
            }
            if (lIllllIIIlIll(C0018e.j(llIlllllll[6]), llIlllllll[7])) {
                if (lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), llIlllllll[3])) {
                    int[] iArr6 = new int[llIlllllll[1]];
                    iArr6[llIlllllll[0]] = llIlllllll[27];
                    if (lIllllIIIIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIlllllll[1]];
                        iArr7[llIlllllll[0]] = llIlllllll[27];
                        Inventory.getFirst(iArr7).interact(llIlllllIl[llIlllllll[39]]);
                        Time.sleepTicks(llIlllllll[1]);
                        "".length();
                    }
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[40]];
                    Movement.walkTo(mB);
                    "".length();
                    Time.sleepTicks(llIlllllll[1]);
                    "".length();
                }
                if (lIllllIIIllII(Players.getLocal().getWorldLocation().distanceTo(mB), llIlllllll[3])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[41]];
                    String[] strArr7 = new String[llIlllllll[1]];
                    strArr7[llIlllllll[0]] = llIlllllIl[llIlllllll[42]];
                    TileObject nearest6 = TileObjects.getNearest(strArr7);
                    if (lIllllIIIlIII(nearest6)) {
                        String[] strArr8 = new String[llIlllllll[1]];
                        strArr8[llIlllllll[0]] = llIlllllIl[llIlllllll[43]];
                        if (lIllllIIIIIll(nearest6.hasAction(strArr8) ? 1 : 0)) {
                            nearest6.interact(llIlllllIl[llIlllllll[44]]);
                            Time.sleepTicks(llIlllllll[3]);
                            "".length();
                        }
                        String[] strArr9 = new String[llIlllllll[1]];
                        strArr9[llIlllllll[0]] = llIlllllIl[llIlllllll[45]];
                        Item first = Inventory.getFirst(strArr9);
                        if (lIllllIIIlIII(first)) {
                            if (lIllllIIIIlII(di, llIlllllll[1])) {
                                aN.sU += llIlllllll[1];
                                aN.u(AccBuilderSotf.m);
                                di += llIlllllll[1];
                                aN.sU = llIlllllll[0];
                                dj = llIlllllll[0];
                            }
                            first.useOn(nearest6);
                            Time.sleepTicks(llIlllllll[5]);
                            "".length();
                        }
                    }
                }
                C0020g.a(my);
            }
            C0020g.a(new String[llIlllllll[0]]);
        }
    }

    private static int lIllllIIIIIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIlllIlllllIl(String lllllllllllllllllIllllllIlIlIlII, String lllllllllllllllllIllllllIlIlIIll) {
        String lllllllllllllllllIllllllIlIlIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIllllllIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllllllIlIlIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllllIllllllIlIlIIll.toCharArray();
        int lllllllllllllllllIllllllIlIlIIII = llIlllllll[0];
        char[] charArray2 = lllllllllllllllllIllllllIlIlIlII2.toCharArray();
        int length = charArray2.length;
        int i = llIlllllll[0];
        while (lIllllIIIIlII(i, length)) {
            char lllllllllllllllllIllllllIlIlIlIl = charArray2[i];
            lllllllllllllllllIllllllIlIlIIlI.append((char) (lllllllllllllllllIllllllIlIlIlIl ^ charArray[lllllllllllllllllIllllllIlIlIIII % charArray.length]));
            "".length();
            lllllllllllllllllIllllllIlIlIIII++;
            i++;
            "".length();
            if ((-(106 ^ 111)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIllllllIlIlIIlI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlllllll[0];
    }

    private static boolean lIllllIIIllII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllllIIIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIIIlIII(Object obj) {
        return obj != null;
    }

    private static void Q() {
        int[] iArr = new int[llIlllllll[1]];
        iArr[llIlllllll[0]] = llIlllllll[10];
        if (lIllllIIIIlIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllll[10], llIlllllll[1], llIlllllll[46]));
            "".length();
        }
        int[] iArr2 = new int[llIlllllll[1]];
        iArr2[llIlllllll[0]] = llIlllllll[4];
        if (lIllllIIIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllll[4], llIlllllll[15], llIlllllll[47]));
            "".length();
        }
        if (lIllllIIIIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlllllIl[llIlllllll[53]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllll[48], llIlllllll[8], llIlllllll[49]));
            "".length();
        }
        int[] iArr3 = new int[llIlllllll[1]];
        iArr3[llIlllllll[0]] = llIlllllll[11];
        if (lIllllIIIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllll[11], llIlllllll[15], llIlllllll[50]));
            "".length();
        }
        int[] iArr4 = new int[llIlllllll[1]];
        iArr4[llIlllllll[0]] = llIlllllll[13];
        if (lIllllIIIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllll[13], llIlllllll[31], llIlllllll[50]));
            "".length();
        }
        int[] iArr5 = new int[llIlllllll[1]];
        iArr5[llIlllllll[0]] = llIlllllll[12];
        if (lIllllIIIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllll[12], llIlllllll[8], C0023j.cf));
            "".length();
        }
    }

    private static boolean lIllllIIIlIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllllIIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIllllIIIIllI(int i) {
        return i < 0;
    }

    private static boolean lIllllIIIIlIl(int i) {
        return i == 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            eq();
            "".length();
            if (" ".length() == "   ".length()) {
                return ((((48 + 17) - 24) + 90) ^ (((55 + 21) - 67) + 189)) & (((((111 + 185) - 258) + 164) ^ (((26 + 62) - 76) + 131)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlllllll[51];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIlllllll[1]];
        iArr[llIlllllll[0]] = llIlllllll[11];
        if (lIllllIIIIIll(Inventory.contains(iArr) ? 1 : 0) && ((!lIllllIIIIlIl(Inventory.contains(C0019f.aW) ? 1 : 0) || lIllllIIIIIll(Equipment.contains(C0019f.aW) ? 1 : 0)) && lIllllIIIIIll(Inventory.contains(C0019f.ba) ? 1 : 0))) {
            int[] iArr2 = new int[llIlllllll[1]];
            iArr2[llIlllllll[0]] = llIlllllll[13];
            if (lIllllIIIIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIlllllll[1]];
                iArr3[llIlllllll[0]] = llIlllllll[4];
                if (lIllllIIIIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = llIlllllll[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llIlllllll[0];
    }

    static {
        lIllllIIIIIIl();
        lIllllIIIIIII();
        String[] strArr = new String[llIlllllll[23]];
        strArr[llIlllllll[0]] = llIlllllIl[llIlllllll[54]];
        strArr[llIlllllll[1]] = llIlllllIl[llIlllllll[55]];
        strArr[llIlllllll[3]] = llIlllllIl[llIlllllll[56]];
        strArr[llIlllllll[5]] = llIlllllIl[llIlllllll[57]];
        strArr[llIlllllll[7]] = llIlllllIl[llIlllllll[58]];
        strArr[llIlllllll[8]] = llIlllllIl[llIlllllll[59]];
        strArr[llIlllllll[14]] = llIlllllIl[llIlllllll[60]];
        strArr[llIlllllll[20]] = llIlllllIl[llIlllllll[61]];
        strArr[llIlllllll[18]] = llIlllllIl[llIlllllll[62]];
        strArr[llIlllllll[21]] = llIlllllIl[llIlllllll[63]];
        strArr[llIlllllll[15]] = llIlllllIl[llIlllllll[64]];
        strArr[llIlllllll[19]] = llIlllllIl[llIlllllll[65]];
        strArr[llIlllllll[22]] = llIlllllIl[llIlllllll[66]];
        my = strArr;
        mz = new WorldPoint(llIlllllll[16], llIlllllll[67], llIlllllll[0]);
        mA = new WorldPoint(llIlllllll[68], llIlllllll[69], llIlllllll[0]);
        mB = new WorldPoint(llIlllllll[70], llIlllllll[71], llIlllllll[0]);
        mC = new WorldPoint(llIlllllll[72], llIlllllll[73], llIlllllll[0]);
        bv = new ArrayList();
        cG = llIlllllll[0];
    }
}
