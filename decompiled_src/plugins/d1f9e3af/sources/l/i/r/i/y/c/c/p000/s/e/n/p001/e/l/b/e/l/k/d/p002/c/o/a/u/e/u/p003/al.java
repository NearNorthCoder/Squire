package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.al  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/al.class */
public class al implements W {
    public static final /* synthetic */ WorldPoint mr;
    static final /* synthetic */ WorldPoint mu;
    private static /* synthetic */ int[] lIlIllIII;
    private final /* synthetic */ int mw = lIlIllIII[0];
    public static /* synthetic */ boolean bt;
    static final /* synthetic */ WorldPoint mv;
    public static final /* synthetic */ WorldPoint ms;
    static final /* synthetic */ WorldPoint mt;
    public static final /* synthetic */ WorldPoint mq;
    public static final /* synthetic */ WorldPoint mp;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ String[] lIlIlIllI;

    private static boolean lIIlIIIllIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIIlIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlIIIlllII(Skills.getLevel(Skill.PRAYER), lIlIllIII[76])) {
            ?? r0 = lIlIllIII[2];
            "".length();
            return "   ".length() == "  ".length() ? ((163 ^ 192) ^ (162 ^ 132)) & (((232 ^ 167) ^ (175 ^ 165)) ^ (-" ".length())) : r0;
        }
        return lIlIllIII[1];
    }

    private static void af() {
        int[] iArr = new int[lIlIllIII[2]];
        iArr[lIlIllIII[1]] = lIlIllIII[8];
        if (lIIlIIIlIllI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIII[8], lIlIllIII[13], C0008i.bq));
            "".length();
        }
        int[] iArr2 = new int[lIlIllIII[2]];
        iArr2[lIlIllIII[1]] = lIlIllIII[0];
        if (lIIlIIIlIllI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIII[0], dE(), lIlIllIII[63]));
            "".length();
        }
        int[] iArr3 = new int[lIlIllIII[2]];
        iArr3[lIlIllIII[1]] = lIlIllIII[7];
        if (lIIlIIIlIllI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIII[7], lIlIllIII[3], lIlIllIII[5]));
            "".length();
        }
        if (lIIlIIIlIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIlIllI[lIlIllIII[77]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIII[64], lIlIllIII[13], lIlIllIII[65]));
            "".length();
        }
        int[] iArr4 = new int[lIlIllIII[2]];
        iArr4[lIlIllIII[1]] = lIlIllIII[66];
        if (lIIlIIIlIllI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIII[66], lIlIllIII[67], lIlIllIII[68]));
            "".length();
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            dD();
            "".length();
            if ("  ".length() == 0) {
                return (19 ^ 26) & ((39 ^ 46) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIllIII[74];
    }

    private static boolean lIIlIIIlllII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIIlIIIlIlII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        int[] iArr = new int[lIlIllIII[2]];
        iArr[lIlIllIII[1]] = lIlIllIII[9];
        if (lIIlIIIlIlII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIllIII[2]];
            iArr2[lIlIllIII[1]] = lIlIllIII[9];
            if (lIIlIIIlllII(Inventory.getFirst(iArr2).getQuantity(), lIlIllIII[12])) {
                if (lIIlIIIlIllI(Inventory.contains(C0005f.ba) ? 1 : 0)) {
                    if (lIIlIIIlIlII(Equipment.contains(C0005f.ba) ? 1 : 0)) {
                        int[] iArr3 = new int[lIlIllIII[2]];
                        iArr3[lIlIllIII[1]] = lIlIllIII[0];
                        if (lIIlIIIlIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlIllIII[2]];
                            iArr4[lIlIllIII[1]] = lIlIllIII[50];
                        }
                    }
                }
                ?? r0 = lIlIllIII[2];
                "".length();
                return (-(79 ^ 75)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIllIII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIllIII[1];
    }

    private static boolean lIIlIIIllIII(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIlIlII(int i) {
        return i != 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIlIllI[lIlIllIII[75]];
    }

    private static boolean lIIlIIIlIlll(Object obj) {
        return obj != null;
    }

    private static String lIIlIIIIIIlI(String lllIIIlllIllll, String lllIIIlllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), lIlIllIII[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIllllIIII) {
            lllIIIllllIIII.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIIlIIll();
        lIIlIIIlIIlI();
        mp = new WorldPoint(lIlIllIII[78], lIlIllIII[79], lIlIllIII[1]);
        mq = new WorldPoint(lIlIllIII[80], lIlIllIII[81], lIlIllIII[1]);
        mr = new WorldPoint(lIlIllIII[82], lIlIllIII[83], lIlIllIII[1]);
        ms = new WorldPoint(lIlIllIII[84], lIlIllIII[43], lIlIllIII[1]);
        mt = new WorldPoint(lIlIllIII[1], lIlIllIII[1], lIlIllIII[1]);
        mu = new WorldPoint(lIlIllIII[1], lIlIllIII[1], lIlIllIII[1]);
        mv = new WorldPoint(lIlIllIII[85], lIlIllIII[86], lIlIllIII[1]);
        bv = new ArrayList();
    }

    private static void lIIlIIIlIIll() {
        lIlIllIII = new int[88];
        lIlIllIII[0] = (-((-10249) & 14795)) & (-1026) & 6107;
        lIlIllIII[1] = ((56 ^ 85) ^ (28 ^ 121)) & (((43 ^ 65) ^ (27 ^ 121)) ^ (-" ".length()));
        lIlIllIII[2] = " ".length();
        lIlIllIII[3] = "  ".length();
        lIlIllIII[4] = "   ".length();
        lIlIllIII[5] = (-((-417) & 28152)) & (-1) & 32735;
        lIlIllIII[6] = (((123 + 0) - 55) + 60) ^ (((57 + 88) - 143) + 130);
        lIlIllIII[7] = (-(248 ^ 186)) & (-1041) & 22271;
        lIlIllIII[8] = (-((-16889) & 18425)) & (-16515) & 30675;
        lIlIllIII[9] = (-10265) & 11259;
        lIlIllIII[10] = (-((-14882) & 31283)) & (-4257) & 31157;
        lIlIllIII[11] = ((135 + 173) - 274) + 166;
        lIlIllIII[12] = (((0 + 163) - 45) + 46) ^ (((22 + 33) - (-93)) + 2);
        lIlIllIII[13] = 113 ^ 116;
        lIlIllIII[14] = 116 ^ 96;
        lIlIllIII[15] = (((68 + 20) - 14) + 87) ^ (((131 + 17) - 2) + 21);
        lIlIllIII[16] = -" ".length();
        lIlIllIII[17] = (157 ^ 128) ^ (152 ^ 130);
        lIlIllIII[18] = 181 ^ 189;
        lIlIllIII[19] = 106 ^ 99;
        lIlIllIII[20] = 200 ^ 197;
        lIlIllIII[21] = 115 ^ 121;
        lIlIllIII[22] = (-((-7133) & 15327)) & (-17409) & 28630;
        lIlIllIII[23] = (-12538) & 16379;
        lIlIllIII[24] = (-((-310) & 13631)) & (-16385) & 32731;
        lIlIllIII[25] = (-4101) & 7935;
        lIlIllIII[26] = (-(133 ^ 148)) & (-13313) & 16347;
        lIlIllIII[27] = (-16644) & 20475;
        lIlIllIII[28] = (-((-3217) & 7353)) & (-9217) & 16367;
        lIlIllIII[29] = (-((-18081) & 30377)) & (-16385) & 32509;
        lIlIllIII[30] = (-((-19405) & 23549)) & (-24577) & 31730;
        lIlIllIII[31] = (-16645) & 20469;
        lIlIllIII[32] = (-((-10789) & 15975)) & (-8193) & 16383;
        lIlIllIII[33] = (-20737) & 24558;
        lIlIllIII[34] = (-((-37) & 12397)) & (-1025) & 16383;
        lIlIllIII[35] = (-((-1194) & 29887)) & (-257) & 32767;
        lIlIllIII[36] = (-((-3463) & 19863)) & (-13313) & 32703;
        lIlIllIII[37] = (-((-10963) & 15059)) & (-261) & 8175;
        lIlIllIII[38] = (-((-2837) & 32541)) & (-81) & 32767;
        lIlIllIII[39] = (-((-3681) & 24171)) & (-1026) & 24491;
        lIlIllIII[40] = (-((-6697) & 32302)) & (-4193) & 32767;
        lIlIllIII[41] = (1 ^ 107) ^ (4 ^ 101);
        lIlIllIII[42] = (-((-18449) & 27697)) & (-16461) & 28671;
        lIlIllIII[43] = (-((-2285) & 31230)) & (-3) & 32767;
        lIlIllIII[44] = (13 ^ 7) ^ (124 ^ 122);
        lIlIllIII[45] = (-13345) & 16303;
        lIlIllIII[46] = (7 ^ 37) ^ (170 ^ 134);
        lIlIllIII[47] = 63 ^ 48;
        lIlIllIII[48] = 15 ^ 31;
        lIlIllIII[49] = 150 ^ 135;
        lIlIllIII[50] = (-16547) & 17083;
        lIlIllIII[51] = (((15 + 103) - (-20)) + 52) ^ (((104 + 72) - 6) + 2);
        lIlIllIII[52] = (((116 + 3) - 115) + 141) ^ (((111 + 68) - 71) + 22);
        lIlIllIII[53] = (0 ^ 11) ^ (25 ^ 7);
        lIlIllIII[54] = 0 ^ 22;
        lIlIllIII[55] = 91 ^ 76;
        lIlIllIII[56] = (((86 + 13) - 43) + 72) ^ (((120 + 68) - 184) + 148);
        lIlIllIII[57] = 96 ^ 121;
        lIlIllIII[58] = (((174 + 33) - 140) + 117) ^ (((149 + 27) - 66) + 52);
        lIlIllIII[59] = (245 ^ 148) ^ (190 ^ 196);
        lIlIllIII[60] = 185 ^ 165;
        lIlIllIII[61] = (185 ^ 193) ^ (234 ^ 143);
        lIlIllIII[62] = 169 ^ 183;
        lIlIllIII[63] = (-20747) & 23546;
        lIlIllIII[64] = (-((-8324) & 12455)) & (-257) & 16367;
        lIlIllIII[65] = (-((-16673) & 20839)) & (-1041) & 30206;
        lIlIllIII[66] = (-8241) & 16247;
        lIlIllIII[67] = (9 ^ 43) ^ (37 ^ 47);
        lIlIllIII[68] = (-((-8961) & 25467)) & (-12290) & 29695;
        lIlIllIII[69] = (-((-3203) & 7331)) & (-642) & 278511;
        lIlIllIII[70] = (53 ^ 99) ^ (1 ^ 107);
        lIlIllIII[71] = (((37 + 110) - 137) + 179) ^ (((48 + 122) - 123) + 97);
        lIlIllIII[72] = (-542) & 991;
        lIlIllIII[73] = (-645) & 62156;
        lIlIllIII[74] = 35 ^ 71;
        lIlIllIII[75] = 1 ^ 30;
        lIlIllIII[76] = 39 ^ 68;
        lIlIllIII[77] = (118 ^ 77) ^ (100 ^ 127);
        lIlIllIII[78] = (-12329) & 15357;
        lIlIllIII[79] = (-4283) & 8126;
        lIlIllIII[80] = (-8206) & 11199;
        lIlIllIII[81] = (-((-3681) & 28533)) & (-4097) & 32765;
        lIlIllIII[82] = (-1065) & 4014;
        lIlIllIII[83] = (-((-10345) & 30841)) & (-8449) & 32765;
        lIlIllIII[84] = (-9273) & 12220;
        lIlIllIII[85] = (-29673) & 32766;
        lIlIllIII[86] = (-((-20017) & 28285)) & (-4097) & 15855;
        lIlIllIII[87] = (((165 + 136) - 191) + 70) ^ (((116 + 8) - 44) + 69);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v308, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v332, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v59, types: [boolean] */
    public static void dD() {
        if (lIIlIIIlIlII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[1]];
            C0001b.a(bv);
            if (lIIlIIIlIlIl(bv.size(), lIlIllIII[2])) {
                System.out.println(lIlIlIllI[lIlIllIII[2]]);
                bt = lIlIllIII[1];
            }
        }
        if (lIIlIIIlIllI(bt ? 1 : 0)) {
            if (lIIlIIIlIllI(ab() ? 1 : 0) && lIIlIIIlIlIl(Game.getWildyLevel(), lIlIllIII[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIIlIlll(nearest) && lIIlIIIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[3]];
                    C0000a.a(nearest);
                }
                if (lIIlIIIlIlll(nearest) && lIIlIIIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[4]];
                    if (lIIlIIIlIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIllIII[5]);
                        "".length();
                    }
                    if (lIIlIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIIIllIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIllIII[6]);
                            "".length();
                        }
                        if (lIIlIIIllIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIllIII[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIllIII[4]];
                        iArr[lIlIllIII[1]] = lIlIllIII[7];
                        iArr[lIlIllIII[2]] = lIlIllIII[0];
                        iArr[lIlIllIII[3]] = lIlIllIII[8];
                        if (lIIlIIIlIllI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIlIlIllI[lIlIllIII[6]]);
                            bt = lIlIllIII[2];
                            return;
                        }
                        int[] iArr2 = new int[lIlIllIII[4]];
                        iArr2[lIlIllIII[1]] = lIlIllIII[7];
                        iArr2[lIlIllIII[2]] = lIlIllIII[0];
                        iArr2[lIlIllIII[3]] = lIlIllIII[8];
                        if (lIIlIIIlIlII(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIIlIIIlIllI(Equipment.contains(C0005f.ba) ? 1 : 0)) {
                                C0000a.b(C0005f.ba, lIlIllIII[2]);
                            }
                            C0000a.b(C0005f.aV, lIlIllIII[2]);
                            C0000a.a(lIlIllIII[9], lIlIllIII[10]);
                            C0000a.b(lIlIllIII[0], lIlIllIII[11]);
                        }
                    }
                }
            }
            if (lIIlIIIlIlII(ab() ? 1 : 0)) {
                if (lIIlIIIlIlII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlIIIlIlIl(Movement.getRunEnergy(), lIlIllIII[12])) {
                    Inventory.getFirst(C0005f.aV).interact(lIlIlIllI[lIlIllIII[13]]);
                    Time.sleepTicks(lIlIllIII[2]);
                    "".length();
                }
                if (lIIlIIIlIllI(Movement.isRunEnabled() ? 1 : 0) && lIIlIIIllIIl(Movement.getRunEnergy(), lIlIllIII[14])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIlIllIII[13]);
                    "".length();
                }
                if (lIIlIIIlIlIl(Game.getWildyLevel(), lIlIllIII[2])) {
                    AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[15]];
                    if (lIIlIIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIIlIIIlIllI(Dialog.isOpen() ? 1 : 0) && lIIlIIIlIlII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIIlIIIllIlI(Players.getLocal().getAnimation(), lIlIllIII[16])) {
                        Inventory.getFirst(C0005f.ba).interact(lIlIlIllI[lIlIllIII[17]]);
                        Time.sleepTicks(lIlIllIII[3]);
                        "".length();
                    }
                    String[] strArr = new String[lIlIllIII[3]];
                    strArr[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[18]];
                    strArr[lIlIllIII[2]] = lIlIlIllI[lIlIllIII[19]];
                    C0006g.a(strArr);
                }
                if (lIIlIIIllIII(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIlIllIII[2]];
                    iArr3[lIlIllIII[1]] = lIlIllIII[0];
                    if (lIIlIIIlIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIlIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                            AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[21]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIlIllIII[20]];
                            worldPointArr[lIlIllIII[1]] = new WorldPoint(lIlIllIII[22], lIlIllIII[23], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[2]] = new WorldPoint(lIlIllIII[24], lIlIllIII[25], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[3]] = new WorldPoint(lIlIllIII[26], lIlIllIII[27], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[4]] = new WorldPoint(lIlIllIII[28], lIlIllIII[29], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[6]] = new WorldPoint(lIlIllIII[30], lIlIllIII[31], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[13]] = new WorldPoint(lIlIllIII[32], lIlIllIII[33], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[15]] = new WorldPoint(lIlIllIII[34], lIlIllIII[35], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[17]] = new WorldPoint(lIlIllIII[36], lIlIllIII[37], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[18]] = new WorldPoint(lIlIllIII[38], lIlIllIII[37], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[19]] = new WorldPoint(lIlIllIII[39], lIlIllIII[37], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[21]] = new WorldPoint(lIlIllIII[40], lIlIllIII[37], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[41]] = new WorldPoint(lIlIllIII[42], lIlIllIII[43], lIlIllIII[1]);
                            worldPointArr[lIlIllIII[44]] = new WorldPoint(lIlIllIII[45], lIlIllIII[43], lIlIllIII[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIlIllIII[2]);
                            "".length();
                        }
                        if (lIIlIIIllIll(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                            AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[41]];
                            String[] strArr2 = new String[lIlIllIII[2]];
                            strArr2[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[44]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIlIllIII[2]];
                            strArr3[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[20]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIlIllIII[2]];
                            strArr4[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[46]];
                            if (lIIlIIIlIlII(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIlIlIllI[lIlIllIII[47]]);
                            }
                            if (lIIlIIIlIlll(nearest2)) {
                                String[] strArr5 = new String[lIlIllIII[2]];
                                strArr5[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[48]];
                                if (lIIlIIIlIllI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIlIllIII[2]];
                                    iArr4[lIlIllIII[1]] = lIlIllIII[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIlIllIII[2]];
                                    strArr6[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[49]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIlIllIII[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIlIllIII[2]];
                    iArr5[lIlIllIII[1]] = lIlIllIII[0];
                    if (lIIlIIIlIllI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIlIllIII[2]];
                        iArr6[lIlIllIII[1]] = lIlIllIII[50];
                        if (lIIlIIIlIlII(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIIlIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                                AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[51]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIlIllIII[20]];
                                worldPointArr2[lIlIllIII[1]] = new WorldPoint(lIlIllIII[22], lIlIllIII[23], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[2]] = new WorldPoint(lIlIllIII[24], lIlIllIII[25], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[3]] = new WorldPoint(lIlIllIII[26], lIlIllIII[27], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[4]] = new WorldPoint(lIlIllIII[28], lIlIllIII[29], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[6]] = new WorldPoint(lIlIllIII[30], lIlIllIII[31], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[13]] = new WorldPoint(lIlIllIII[32], lIlIllIII[33], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[15]] = new WorldPoint(lIlIllIII[34], lIlIllIII[35], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[17]] = new WorldPoint(lIlIllIII[36], lIlIllIII[37], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[18]] = new WorldPoint(lIlIllIII[38], lIlIllIII[37], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[19]] = new WorldPoint(lIlIllIII[39], lIlIllIII[37], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[21]] = new WorldPoint(lIlIllIII[40], lIlIllIII[37], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[41]] = new WorldPoint(lIlIllIII[42], lIlIllIII[43], lIlIllIII[1]);
                                worldPointArr2[lIlIllIII[44]] = new WorldPoint(lIlIllIII[45], lIlIllIII[43], lIlIllIII[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIlIllIII[2]);
                                "".length();
                            }
                            if (lIIlIIIllIll(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                                AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[52]];
                                if (!lIIlIIIlIllI(Dialog.canLevelUpContinue() ? 1 : 0) || lIIlIIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIlIllIII[2]];
                                strArr7[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[14]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIlIllIII[2]];
                                strArr8[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[53]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIlIllIII[2]];
                                strArr9[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[54]];
                                if (lIIlIIIlIlII(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIlIlIllI[lIlIllIII[55]]);
                                }
                                if (lIIlIIIlIlll(nearest4)) {
                                    String[] strArr10 = new String[lIlIllIII[2]];
                                    strArr10[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[56]];
                                    if (lIIlIIIlIllI(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIIlIIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIlIllIII[2]];
                                            iArr7[lIlIllIII[1]] = lIlIllIII[50];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIlIllIII[3]);
                                            "".length();
                                        }
                                        if (lIIlIIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIIlIIIlIllI(options.isEmpty() ? 1 : 0)) {
                                                int i = lIlIllIII[1];
                                                while (lIIlIIIlIlIl(i, options.size())) {
                                                    int[] iArr8 = new int[lIlIllIII[2]];
                                                    iArr8[lIlIllIII[1]] = lIlIllIII[50];
                                                    if (lIIlIIIllIlI(((Item) Inventory.getAll(iArr8).get(lIlIllIII[1])).getQuantity(), lIlIllIII[2]) && lIIlIIIlIlII(((Widget) options.get(i)).getText().contains(lIlIlIllI[lIlIllIII[57]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIllIII[2]);
                                                        Time.sleepTicks(lIlIllIII[3]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIlIllIII[2]];
                                                    iArr9[lIlIllIII[1]] = lIlIllIII[50];
                                                    if (lIIlIIIllIlI(((Item) Inventory.getAll(iArr9).get(lIlIllIII[1])).getQuantity(), lIlIllIII[13]) && lIIlIIIlIlII(((Widget) options.get(i)).getText().contains(lIlIlIllI[lIlIllIII[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIllIII[2]);
                                                        Time.sleepTicks(lIlIllIII[3]);
                                                        "".length();
                                                    }
                                                    if (lIIlIIIlIlII(((Widget) options.get(i)).getText().contains(lIlIlIllI[lIlIllIII[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIllIII[2]);
                                                        Time.sleepTicks(lIlIllIII[3]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if ((((24 ^ 100) ^ (236 ^ 192)) & (((145 ^ 184) ^ (83 ^ 42)) ^ (-" ".length()))) != 0) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int[] iArr10 = new int[lIlIllIII[2]];
            iArr10[lIlIllIII[1]] = lIlIllIII[9];
            if (lIIlIIIlIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIlIllIII[2]];
                iArr11[lIlIllIII[1]] = lIlIllIII[0];
                if (!lIIlIIIlIllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIlIllIII[2]];
                iArr12[lIlIllIII[1]] = lIlIllIII[50];
                if (!lIIlIIIlIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIIlIIIllIll(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[60]];
                String[] strArr11 = new String[lIlIllIII[2]];
                strArr11[lIlIllIII[1]] = lIlIlIllI[lIlIllIII[61]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIIlIIIlIlll(nearest6)) {
                    nearest6.interact(lIlIlIllI[lIlIllIII[62]]);
                }
            }
        }
    }

    private static String lIIlIIIlIIIl(String lllIIlIIIlIIIl, String lllIIlIIIlIIII) {
        String lllIIlIIIlIIIl2 = new String(Base64.getDecoder().decode(lllIIlIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIIlIIIIlllI = lllIIlIIIlIIII.toCharArray();
        int lllIIlIIIIllIl = lIlIllIII[1];
        char[] charArray = lllIIlIIIlIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIllIII[1];
        while (lIIlIIIlIlIl(i, length)) {
            char lllIIlIIIlIIlI = charArray[i];
            sb.append((char) (lllIIlIIIlIIlI ^ lllIIlIIIIlllI[lllIIlIIIIllIl % lllIIlIIIIlllI.length]));
            "".length();
            lllIIlIIIIllIl++;
            i++;
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) == (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIlIIIIIIll(String lllIIIlllllIlI, String lllIIIlllllIll) {
        try {
            SecretKeySpec lllIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIII[3], lllIIIllllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIllllllIl) {
            lllIIIllllllIl.printStackTrace();
            return null;
        }
    }

    private static int dE() {
        return (lIIlIIIlIlIl(Skills.getLevel(Skill.PRAYER), lIlIllIII[70]) && lIIlIIIlllII(Skills.getLevel(Skill.PRAYER), lIlIllIII[71])) ? ((lIlIllIII[69] - Skills.getExperience(Skill.PRAYER)) / lIlIllIII[72]) + lIlIllIII[21] : ((lIlIllIII[73] - Skills.getExperience(Skill.PRAYER)) / lIlIllIII[72]) + lIlIllIII[62];
    }

    private static boolean lIIlIIIllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIIIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIIIlIIlI() {
        lIlIlIllI = new String[lIlIllIII[87]];
        lIlIlIllI[lIlIllIII[1]] = lIIlIIIIIIlI("VEXxDh03/WYZiiVHE9YAww==", "kjFEe");
        lIlIlIllI[lIlIllIII[2]] = lIIlIIIIIIll("otDekik1F4ZbzroyEfVihaFpvg4UmJ3dwN9xYRF4+TjQUw8fKuC+aT459vRL0gwQ", "VYIYp");
        lIlIlIllI[lIlIllIII[3]] = lIIlIIIIIIlI("lrN335V/RPFx/Z/qQqUTxKy+JijetwXL", "lMLmE");
        lIlIlIllI[lIlIllIII[4]] = lIIlIIIIIIlI("0ydVjWZvVe3n2SC8+z+ClF/dUbD7UISV", "cjraX");
        lIlIlIllI[lIlIllIII[6]] = lIIlIIIlIIIl("GD1qEBYqeCcYFzwxJBZEPyorCAE9eDkEFD80IxQXY3g5Bg07OyIYCih4Ph5EDQ0TOCoI", "OXJqd");
        lIlIlIllI[lIlIllIII[13]] = lIIlIIIlIIIl("IQEqCCU=", "esCfN");
        lIlIlIllI[lIlIllIII[15]] = lIIlIIIlIIIl("IgskBEICAWgWCxoKMQ==", "vnHab");
        lIlIlIllI[lIlIllIII[17]] = lIIlIIIlIIIl("Pxon", "moEMc");
        lIlIlIllI[lIlIllIII[18]] = lIIlIIIIIIll("xj2xku+oRv4G9+RTarm3NA==", "auPRR");
        lIlIlIllI[lIlIllIII[19]] = lIIlIIIIIIll("+pB5Tm/LXloSBXpQXykAfZSd7mXQl0fMOjKodEUoS35OIvU7kkFnsA==", "bTthT");
        lIlIlIllI[lIlIllIII[21]] = lIIlIIIIIIlI("L/OvXgZ3M9dYbfvRb6Spew==", "bCPeE");
        lIlIlIllI[lIlIllIII[41]] = lIIlIIIlIIIl("fEgZHTQmSB0GNjQ=", "MhmtW");
        lIlIlIllI[lIlIllIII[44]] = lIIlIIIIIIll("6VMpb+ApP0YrJNmbzGmAIQ==", "wSlZn");
        lIlIlIllI[lIlIllIII[20]] = lIIlIIIIIIlI("Q+p88zLpRdy3JEsTTDJ/fQ==", "RssAC");
        lIlIlIllI[lIlIllIII[46]] = lIIlIIIIIIlI("NqnPXDKcRB0=", "buOmC");
        lIlIlIllI[lIlIllIII[47]] = lIIlIIIIIIlI("Dj6gGAU9O60=", "REUUY");
        lIlIlIllI[lIlIllIII[48]] = lIIlIIIlIIIl("ID8vLw==", "oOJAQ");
        lIlIlIllI[lIlIllIII[49]] = lIIlIIIlIIIl("LwYsFzBMDyEMIh4=", "lnMxC");
        lIlIlIllI[lIlIllIII[51]] = lIIlIIIIIIll("xi4AkCT1VTTs5Poqh6MtEA==", "UfGIQ");
        lIlIlIllI[lIlIllIII[52]] = lIIlIIIIIIll("0VPe9qru3cuXlG3kbigNTg==", "LGeob");
        lIlIlIllI[lIlIllIII[14]] = lIIlIIIlIIIl("FwkSKjhyJh4uJSFFEj0/OwE=", "RevOJ");
        lIlIlIllI[lIlIllIII[53]] = lIIlIIIIIIlI("7v8tADP0GY2FfaZOzGkF7g==", "ItfwR");
        lIlIlIllI[lIlIllIII[54]] = lIIlIIIlIIIl("CBkTLA==", "GivBE");
        lIlIlIllI[lIlIllIII[55]] = lIIlIIIlIIIl("DQIpGg==", "BrLto");
        lIlIlIllI[lIlIllIII[56]] = lIIlIIIlIIIl("DhMCAA==", "Acgnr");
        lIlIlIllI[lIlIllIII[57]] = lIIlIIIIIIll("mdplaP/qHHwODOpBJRLBAg==", "TvtnU");
        lIlIlIllI[lIlIllIII[58]] = lIIlIIIIIIll("YLRtOj3tVADIJZHQG+hq/Q==", "nKEsc");
        lIlIlIllI[lIlIllIII[59]] = lIIlIIIIIIll("jWBTptB5jS1uNFIIIaFC8w==", "XYlIa");
        lIlIlIllI[lIlIllIII[60]] = lIIlIIIIIIll("OJrgEMcuqfMUl3su/NVEfg==", "Lwbaf");
        lIlIlIllI[lIlIllIII[61]] = lIIlIIIlIIIl("Hwo/FGMnBXELIiUMIxAo", "HcQqC");
        lIlIlIllI[lIlIllIII[62]] = lIIlIIIIIIll("3/oMWrLT1lQ=", "LLQZi");
        lIlIlIllI[lIlIllIII[75]] = lIIlIIIIIIll("Sour2f7y9WSQxQWAapqmtw==", "joQXo");
        lIlIlIllI[lIlIllIII[77]] = lIIlIIIIIIll("uTacS2PziNptzT//BSOIf8O2tC2igeU0", "ijJbn");
    }
}
