package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.D  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/D.class */
public class D implements ab {
    public static final /* synthetic */ WorldPoint eS;
    public static final /* synthetic */ WorldPoint eP;
    public static final /* synthetic */ WorldPoint eT;
    public static /* synthetic */ int eX;
    public static /* synthetic */ String[] eY;
    public static final /* synthetic */ WorldPoint eV;
    public static /* synthetic */ int eW;
    public static final /* synthetic */ WorldPoint eU;
    public static final /* synthetic */ WorldPoint eO;
    public static final /* synthetic */ WorldPoint eR;
    public static /* synthetic */ String h;
    public static final /* synthetic */ WorldPoint eN;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ String dc;
    private static /* synthetic */ String[] llIllllII;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ int[] llIllllll;
    static /* synthetic */ int dk;
    public static final /* synthetic */ WorldPoint eQ;

    private static int lIllllIIIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIllllIIllIl(int i) {
        return i < 0;
    }

    private static boolean lIllllIIlIIl(int i) {
        return i == 0;
    }

    private static boolean lIllllIIlIII(int i, int i2) {
        return i < i2;
    }

    private static void lIllllIIIlIl() {
        llIllllll = new int[138];
        llIllllll[0] = " ".length();
        llIllllll[1] = ((147 ^ 178) ^ (121 ^ 70)) & (((112 ^ 69) ^ (143 ^ 164)) ^ (-" ".length()));
        llIllllll[2] = (54 ^ 65) ^ (125 ^ 21);
        llIllllll[3] = (((31 + 134) - (-9)) + 4) ^ (((73 + 121) - 150) + 106);
        llIllllll[4] = "  ".length();
        llIllllll[5] = 50 ^ 31;
        llIllllll[6] = "   ".length();
        llIllllll[7] = 97 ^ 101;
        llIllllll[8] = 154 ^ 159;
        llIllllll[9] = (-1027) & 6026;
        llIllllll[10] = 190 ^ 184;
        llIllllll[11] = (((89 + 48) - 87) + 78) ^ (((68 + 109) - 92) + 53);
        llIllllll[12] = (-((-1895) & 18431)) & (-1) & 24543;
        llIllllll[13] = (-((-4443) & 20863)) & (-145) & 24572;
        llIllllll[14] = (-((-9217) & 30233)) & (-1) & 22367;
        llIllllll[15] = (-((-774) & 26381)) & (-513) & 28671;
        llIllllll[16] = (-((-8577) & 13309)) & (-8194) & 15359;
        llIllllll[17] = (-((-16469) & 31062)) & (-1025) & 16175;
        llIllllll[18] = (-((-5826) & 32727)) & (-193) & 27647;
        llIllllll[19] = 11 ^ 12;
        llIllllll[20] = (-((-8299) & 28139)) & (-12289) & 32684;
        llIllllll[21] = (((172 + 136) - 266) + 143) ^ (((99 + 72) - 114) + 120);
        llIllllll[22] = (-((-693) & 31477)) & (-545) & 31713;
        llIllllll[23] = 2 ^ 11;
        llIllllll[24] = (-8589) & 9150;
        llIllllll[25] = (-((-29641) & 31709)) & (-4099) & 7166;
        llIllllll[26] = (-449) & 1003;
        llIllllll[27] = (-((-5029) & 32743)) & (-17) & 28287;
        llIllllll[28] = ((154 + 45) - 145) + 146;
        llIllllll[29] = (14 ^ 72) ^ (21 ^ 95);
        llIllllll[30] = (-((-6217) & 23119)) & (-3105) & 32631;
        llIllllll[31] = (246 ^ 181) ^ (192 ^ 136);
        llIllllll[32] = (-((-8371) & 9395)) & (-24589) & 26607;
        llIllllll[33] = 7 ^ 53;
        llIllllll[34] = 177 ^ 166;
        llIllllll[35] = 130 ^ 143;
        llIllllll[36] = 138 ^ 132;
        llIllllll[37] = (((134 + 112) - 134) + 68) ^ (((3 + 83) - (-97)) + 4);
        llIllllll[38] = (((32 + 67) - (-7)) + 22) ^ (((66 + 130) - 99) + 47);
        llIllllll[39] = (-21301) & 24439;
        llIllllll[40] = (-((-1359) & 6015)) & (-263) & 8127;
        llIllllll[41] = (177 ^ 147) ^ (167 ^ 148);
        llIllllll[42] = 24 ^ 10;
        llIllllll[43] = (64 ^ 61) ^ (83 ^ 61);
        llIllllll[44] = (-((-1833) & 14269)) & (-1025) & 15869;
        llIllllll[45] = (((109 + 172) - 132) + 33) ^ (((99 + 35) - (-6)) + 22);
        llIllllll[46] = 112 ^ 101;
        llIllllll[47] = (204 ^ 184) ^ (75 ^ 41);
        llIllllll[48] = 83 ^ 77;
        llIllllll[49] = (((9 + 104) - 42) + 58) ^ (((87 + 8) - (-35)) + 23);
        llIllllll[50] = 183 ^ 174;
        llIllllll[51] = (3 ^ 93) ^ (117 ^ 49);
        llIllllll[52] = 121 ^ 63;
        llIllllll[53] = (((27 + 132) - 9) + 2) ^ (((92 + 62) - 104) + 81);
        llIllllll[54] = (-((-25153) & 31333)) & (-833) & 8175;
        llIllllll[55] = (107 ^ 112) ^ (44 ^ 43);
        llIllllll[56] = 53 ^ 40;
        llIllllll[57] = (39 ^ 101) ^ (119 ^ 21);
        llIllllll[58] = (102 ^ 21) ^ (220 ^ 140);
        llIllllll[59] = 143 ^ 174;
        llIllllll[60] = (((5 + 71) - (-52)) + 14) ^ (((22 + 73) - (-66)) + 11);
        llIllllll[61] = 102 ^ 67;
        llIllllll[62] = (81 ^ 62) ^ (208 ^ 153);
        llIllllll[63] = 135 ^ 160;
        llIllllll[64] = 33 ^ 9;
        llIllllll[65] = (197 ^ 170) ^ (54 ^ 112);
        llIllllll[66] = 34 ^ 8;
        llIllllll[67] = 61 ^ 22;
        llIllllll[68] = (((57 + 119) - 51) + 25) ^ (((177 + 109) - 138) + 38);
        llIllllll[69] = 184 ^ 150;
        llIllllll[70] = 3 ^ 44;
        llIllllll[71] = (126 ^ 119) ^ (252 ^ 197);
        llIllllll[72] = 86 ^ 103;
        llIllllll[73] = 65 ^ 114;
        llIllllll[74] = -" ".length();
        llIllllll[75] = 92 ^ 104;
        llIllllll[76] = (86 ^ 18) ^ (199 ^ 182);
        llIllllll[77] = (33 ^ 63) ^ (100 ^ 76);
        llIllllll[78] = 83 ^ 100;
        llIllllll[79] = (((41 + 12) - (-14)) + 124) ^ (((59 + 88) - 124) + 112);
        llIllllll[80] = (49 ^ 116) ^ (62 ^ 66);
        llIllllll[81] = (7 ^ 121) ^ (36 ^ 96);
        llIllllll[82] = 153 ^ 162;
        llIllllll[83] = 165 ^ 153;
        llIllllll[84] = (108 ^ 56) ^ (248 ^ 145);
        llIllllll[85] = 81 ^ 111;
        llIllllll[86] = (((132 + 82) - 149) + 73) ^ (((73 + 144) - 166) + 130);
        llIllllll[87] = (149 ^ 188) ^ (117 ^ 28);
        llIllllll[88] = 247 ^ 182;
        llIllllll[89] = (((206 + 46) - 183) + 163) ^ (((107 + 88) - 162) + 137);
        llIllllll[90] = (186 ^ 166) ^ (156 ^ 195);
        llIllllll[91] = 72 ^ 12;
        llIllllll[92] = (-(((79 + 67) - 59) + 58)) & (-17419) & 24062;
        llIllllll[93] = (-12318) & 14237;
        llIllllll[94] = (-((-7169) & 23574)) & (-289) & 28671;
        llIllllll[95] = (-((-10500) & 11591)) & (-8193) & 32203;
        llIllllll[96] = (-16641) & 29560;
        llIllllll[97] = (((((31 + 91) - 99) + 108) + (((46 + 31) - (-26)) + 44)) - (1 ^ 112)) + (0 ^ 15);
        llIllllll[98] = (-25746) & 28665;
        llIllllll[99] = (-1089) & 2008;
        llIllllll[100] = (-22721) & 31740;
        llIllllll[101] = (-((-19970) & 24341)) & (-1) & 16351;
        llIllllll[102] = (-((-261) & 4933)) & (-7) & 29678;
        llIllllll[103] = (-((-5787) & 30459)) & (-2057) & 27628;
        llIllllll[104] = (((97 + 42) - 93) + 202) ^ (((72 + 0) - 15) + 99);
        llIllllll[105] = (244 ^ 169) ^ (171 ^ 179);
        llIllllll[106] = 247 ^ 176;
        llIllllll[107] = (((87 + 91) - (-18)) + 12) ^ (((147 + 17) - 32) + 20);
        llIllllll[108] = (((91 + 47) - 40) + 139) ^ (((39 + 12) - (-56)) + 57);
        llIllllll[109] = (((10 + 185) - 194) + 211) ^ (((58 + 125) - 175) + 150);
        llIllllll[110] = (-((-20157) & 28607)) & (-20993) & 32591;
        llIllllll[111] = (-16737) & 19941;
        llIllllll[112] = (-((-5749) & 22261)) & (-8217) & 27550;
        llIllllll[113] = (-((-9366) & 28119)) & (-4241) & 32767;
        llIllllll[114] = (-9313) & 12155;
        llIllllll[115] = (-20929) & 30694;
        llIllllll[116] = (-4164) & 7023;
        llIllllll[117] = (-((-4617) & 7149)) & (-20500) & 32767;
        llIllllll[118] = (-((-2489) & 23035)) & (-8833) & 32751;
        llIllllll[119] = (-24937) & 28158;
        llIllllll[120] = (-839) & 4055;
        llIllllll[121] = (-513) & 3719;
        llIllllll[122] = (-17252) & 20463;
        llIllllll[123] = (-((-7231) & 32447)) & (-4097) & 32511;
        llIllllll[124] = (-12314) & 15483;
        llIllllll[125] = (-5665) & 8116;
        llIllllll[126] = (-((-7969) & 32551)) & (-2049) & 31103;
        llIllllll[127] = (((127 ^ 64) + (123 ^ 117)) - (186 ^ 190)) + (86 ^ 28);
        llIllllll[128] = 19 ^ 88;
        llIllllll[129] = (60 ^ 56) ^ (214 ^ 158);
        llIllllll[130] = (84 ^ 33) ^ (82 ^ 106);
        llIllllll[131] = (((60 + 89) - 59) + 133) ^ (((130 + 57) - 148) + 106);
        llIllllll[132] = (((55 + 40) - (-114)) + 35) ^ (((78 + 175) - 100) + 34);
        llIllllll[133] = 202 ^ 154;
        llIllllll[134] = 150 ^ 199;
        llIllllll[135] = 241 ^ 163;
        llIllllll[136] = (75 ^ 39) ^ (156 ^ 163);
        llIllllll[137] = 67 ^ 23;
    }

    private static boolean lIllllIlIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0586, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[11]) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0589, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllII[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[21]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x05a4, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0c03, code lost:
        if (lIllllIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0fa6, code lost:
        if (lIllllIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02e8, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x032b, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x036e, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03b1, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03f4, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[28]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0437, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x047a, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[29]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04bd, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[6]) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0500, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[11]) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0543, code lost:
        if (lIllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[7]) != false) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v717, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v726, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v763, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bz() {
        if (lIllllIIIlll(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lIllllIIlIII(bx.size(), llIllllll[0])) {
                System.out.println(llIllllII[llIllllll[1]]);
                bv = llIllllll[1];
            }
        }
        if (lIllllIIlIIl(bv ? 1 : 0)) {
            if (lIllllIIlIII(Skills.getLevel(Skill.CRAFTING), llIllllll[2])) {
                dc = llIllllII[llIllllll[0]];
                an.el();
            }
            if (lIllllIIlIlI(Skills.getLevel(Skill.CRAFTING), llIllllll[2]) && lIllllIIlIII(Skills.getLevel(Skill.WOODCUTTING), llIllllll[3])) {
                dc = llIllllII[llIllllll[4]];
                ar.eP();
            }
            if (lIllllIIlIlI(Skills.getLevel(Skill.CRAFTING), llIllllll[2]) && lIllllIIlIlI(Skills.getLevel(Skill.WOODCUTTING), llIllllll[3]) && lIllllIIlIII(Skills.getLevel(Skill.PRAYER), llIllllll[5])) {
                dc = llIllllII[llIllllll[6]];
                aq.ea();
            }
            if (lIllllIIlIIl(an() ? 1 : 0) && lIllllIIlIII(C0004e.j(eW), llIllllll[0]) && lIllllIIlIlI(Skills.getLevel(Skill.CRAFTING), llIllllll[2]) && lIllllIIlIlI(Skills.getLevel(Skill.WOODCUTTING), llIllllll[3]) && lIllllIIlIlI(Skills.getLevel(Skill.PRAYER), llIllllll[5])) {
                dc = llIllllII[llIllllll[7]];
                BankLocation nearest = BankLocation.getNearest();
                if (lIllllIIlIll(nearest) && lIllllIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIllllII[llIllllll[8]];
                    C0000a.a(nearest);
                }
                if (lIllllIIlIll(nearest) && lIllllIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIllllll[9]);
                        "".length();
                    }
                    if (lIllllIIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIllllII[llIllllll[10]];
                        if (lIllllIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIllllll[7]);
                            "".length();
                        }
                        if (lIllllIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIllllll[4]);
                            "".length();
                        }
                        int[] iArr = new int[llIllllll[11]];
                        iArr[llIllllll[1]] = llIllllll[12];
                        iArr[llIllllll[0]] = llIllllll[13];
                        iArr[llIllllll[4]] = llIllllll[14];
                        iArr[llIllllll[6]] = llIllllll[15];
                        iArr[llIllllll[7]] = llIllllll[16];
                        iArr[llIllllll[8]] = llIllllll[17];
                        iArr[llIllllll[10]] = llIllllll[18];
                        iArr[llIllllll[19]] = llIllllll[20];
                        iArr[llIllllll[21]] = llIllllll[22];
                        iArr[llIllllll[23]] = llIllllll[24];
                        if (lIllllIIlIIl(C0004e.d(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIllllII[llIllllll[19]]);
                            bv = llIllllll[0];
                            return;
                        }
                        int[] iArr2 = new int[llIllllll[0]];
                        iArr2[llIllllll[1]] = llIllllll[20];
                        if (lIllllIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llIllllll[0]];
                            iArr3[llIllllll[1]] = llIllllll[20];
                        }
                        int[] iArr4 = new int[llIllllll[0]];
                        iArr4[llIllllll[1]] = llIllllll[17];
                        if (lIllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIllllll[0]];
                            iArr5[llIllllll[1]] = llIllllll[17];
                        }
                        int[] iArr6 = new int[llIllllll[0]];
                        iArr6[llIllllll[1]] = llIllllll[26];
                        if (lIllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[llIllllll[0]];
                            iArr7[llIllllll[1]] = llIllllll[26];
                        }
                        int[] iArr8 = new int[llIllllll[0]];
                        iArr8[llIllllll[1]] = llIllllll[27];
                        if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                            int[] iArr9 = new int[llIllllll[0]];
                            iArr9[llIllllll[1]] = llIllllll[27];
                        }
                        int[] iArr10 = new int[llIllllll[0]];
                        iArr10[llIllllll[1]] = llIllllll[24];
                        if (lIllllIIIlll(Bank.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[llIllllll[0]];
                            iArr11[llIllllll[1]] = llIllllll[24];
                        }
                        int[] iArr12 = new int[llIllllll[0]];
                        iArr12[llIllllll[1]] = llIllllll[18];
                        if (lIllllIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                            int[] iArr13 = new int[llIllllll[0]];
                            iArr13[llIllllll[1]] = llIllllll[18];
                        }
                        int[] iArr14 = new int[llIllllll[0]];
                        iArr14[llIllllll[1]] = llIllllll[22];
                        if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[llIllllll[0]];
                            iArr15[llIllllll[1]] = llIllllll[22];
                        }
                        int[] iArr16 = new int[llIllllll[0]];
                        iArr16[llIllllll[1]] = llIllllll[16];
                        if (lIllllIIIlll(Bank.contains(iArr16) ? 1 : 0)) {
                            int[] iArr17 = new int[llIllllll[0]];
                            iArr17[llIllllll[1]] = llIllllll[16];
                        }
                        int[] iArr18 = new int[llIllllll[0]];
                        iArr18[llIllllll[1]] = llIllllll[13];
                        if (lIllllIIIlll(Bank.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[llIllllll[0]];
                            iArr19[llIllllll[1]] = llIllllll[13];
                        }
                        int[] iArr20 = new int[llIllllll[0]];
                        iArr20[llIllllll[1]] = llIllllll[30];
                        if (lIllllIIIlll(Bank.contains(iArr20) ? 1 : 0)) {
                            int[] iArr21 = new int[llIllllll[0]];
                            iArr21[llIllllll[1]] = llIllllll[30];
                        }
                        int[] iArr22 = new int[llIllllll[0]];
                        iArr22[llIllllll[1]] = llIllllll[12];
                        if (lIllllIIIlll(Bank.contains(iArr22) ? 1 : 0)) {
                            int[] iArr23 = new int[llIllllll[0]];
                            iArr23[llIllllll[1]] = llIllllll[12];
                        }
                        int[] iArr24 = new int[llIllllll[29]];
                        iArr24[llIllllll[1]] = llIllllll[12];
                        iArr24[llIllllll[0]] = llIllllll[13];
                        iArr24[llIllllll[4]] = llIllllll[14];
                        iArr24[llIllllll[6]] = llIllllll[15];
                        iArr24[llIllllll[7]] = llIllllll[16];
                        iArr24[llIllllll[8]] = llIllllll[17];
                        iArr24[llIllllll[10]] = llIllllll[18];
                        iArr24[llIllllll[19]] = llIllllll[20];
                        iArr24[llIllllll[21]] = llIllllll[22];
                        iArr24[llIllllll[23]] = llIllllll[24];
                        iArr24[llIllllll[11]] = llIllllll[26];
                        iArr24[llIllllll[31]] = llIllllll[27];
                        if (lIllllIIIlll(C0004e.d(iArr24) ? 1 : 0)) {
                            C0000a.a(llIllllll[12], llIllllll[11]);
                            C0000a.a(llIllllll[13], llIllllll[11]);
                            C0000a.a(llIllllll[14], llIllllll[0]);
                            C0000a.a(llIllllll[15], llIllllll[0]);
                            C0000a.a(llIllllll[16], llIllllll[6]);
                            C0000a.b(C0005f.aY, llIllllll[0]);
                            C0000a.a(llIllllll[22], llIllllll[19]);
                            C0000a.a(llIllllll[17], llIllllll[25]);
                            C0000a.a(llIllllll[18], llIllllll[25]);
                            C0000a.a(llIllllll[27], llIllllll[25]);
                            C0000a.a(llIllllll[26], llIllllll[25]);
                            C0000a.a(llIllllll[24], llIllllll[25]);
                            C0000a.a(llIllllll[20], llIllllll[25]);
                            C0000a.a(llIllllll[32], llIllllll[25]);
                            C0000a.a(llIllllll[30], llIllllll[0]);
                        }
                    }
                }
            }
            if (lIllllIIIlll(Inventory.contains(C0005f.bc) ? 1 : 0) && lIllllIIlIII(Movement.getRunEnergy(), llIllllll[33])) {
                Inventory.getFirst(C0005f.bc).interact(llIllllII[llIllllll[23]]);
                Time.sleepTicks(llIllllll[0]);
                "".length();
            }
            if (lIllllIIllIl(lIllllIIIllI(C0004e.w(), 50.0d))) {
                String[] strArr = new String[llIllllll[0]];
                strArr[llIllllll[1]] = llIllllII[llIllllll[11]];
                if (lIllllIIIlll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIllllll[0]];
                    strArr2[llIllllll[1]] = llIllllII[llIllllll[31]];
                    Inventory.getFirst(strArr2).interact(llIllllII[llIllllll[29]]);
                    Time.sleepTicks(llIllllll[4]);
                    "".length();
                }
            }
            if (lIllllIIlIII(Prayers.getPoints(), llIllllll[34]) && lIllllIIIlll(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                Inventory.getFirst(C0005f.aZ).interact(llIllllII[llIllllll[35]]);
                Time.sleepTicks(llIllllll[4]);
                "".length();
            }
            if (lIllllIIIlll(an() ? 1 : 0) && lIllllIIlIII(C0004e.j(eW), llIllllll[0])) {
                if (lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eN), llIllllll[19])) {
                    AccBuilderGWD.c = llIllllII[llIllllll[36]];
                    if (lIllllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(eN);
                    "".length();
                    Time.sleepTicks(llIllllll[0]);
                    "".length();
                }
                if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eN), llIllllll[19])) {
                    AccBuilderGWD.c = llIllllII[llIllllll[37]];
                    C0006g.a(llIllllII[llIllllll[38]], eY);
                }
            }
            if (lIllllIlIIII(C0004e.j(eW), llIllllll[0])) {
                if (lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllllll[39], llIllllll[40], llIllllll[1])), llIllllll[8])) {
                    AccBuilderGWD.c = llIllllII[llIllllll[41]];
                    Movement.walkTo(new WorldPoint(llIllllll[39], llIllllll[40], llIllllll[1]));
                    "".length();
                    Time.sleepTicks(llIllllll[0]);
                    "".length();
                }
                if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllllll[39], llIllllll[40], llIllllll[1])), llIllllll[8])) {
                    AccBuilderGWD.c = llIllllII[llIllllll[42]];
                    String[] strArr3 = new String[llIllllll[0]];
                    strArr3[llIllllll[1]] = llIllllII[llIllllll[43]];
                    if (lIllllIlIIIl(NPCs.getNearest(strArr3))) {
                        int[] iArr25 = new int[llIllllll[0]];
                        iArr25[llIllllll[1]] = llIllllll[44];
                        TileObjects.getNearest(iArr25).interact(llIllllII[llIllllll[45]]);
                        Time.sleepTicks(llIllllll[6]);
                        "".length();
                    }
                    String[] strArr4 = new String[llIllllll[0]];
                    strArr4[llIllllll[1]] = llIllllII[llIllllll[46]];
                    if (lIllllIIlIll(NPCs.getNearest(strArr4))) {
                        C0006g.a(llIllllII[llIllllll[47]], eY);
                    }
                }
            }
            if (lIllllIlIIII(C0004e.j(eW), llIllllll[4])) {
                String[] strArr5 = new String[llIllllll[0]];
                strArr5[llIllllll[1]] = llIllllII[llIllllll[34]];
                if (lIllllIIIlll(Inventory.contains(strArr5) ? 1 : 0)) {
                    if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllllll[39], llIllllll[40], llIllllll[1])), llIllllll[48])) {
                        AccBuilderGWD.c = llIllllII[llIllllll[49]];
                        String[] strArr6 = new String[llIllllll[0]];
                        strArr6[llIllllll[1]] = llIllllII[llIllllll[50]];
                        Inventory.getFirst(strArr6).interact(llIllllII[llIllllll[51]]);
                        Time.sleepTicks(llIllllll[0]);
                        "".length();
                    }
                    if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eO), llIllllll[52]) && lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eQ), llIllllll[7])) {
                        AccBuilderGWD.c = llIllllII[llIllllll[53]];
                        if (lIllllIIIlll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                        }
                        Movement.walkTo(eQ);
                        "".length();
                        Time.sleepTicks(llIllllll[0]);
                        "".length();
                    }
                    if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eQ), llIllllll[7])) {
                        int[] iArr26 = new int[llIllllll[0]];
                        iArr26[llIllllll[1]] = llIllllll[54];
                        if (lIllllIlIIIl(NPCs.getNearest(iArr26))) {
                            String[] strArr7 = new String[llIllllll[0]];
                            strArr7[llIllllll[1]] = llIllllII[llIllllll[55]];
                            TileObjects.getNearest(strArr7).interact(llIllllII[llIllllll[56]]);
                            Time.sleepTicks(llIllllll[4]);
                            "".length();
                        }
                        int[] iArr27 = new int[llIllllll[0]];
                        iArr27[llIllllll[1]] = llIllllll[54];
                        if (lIllllIIlIll(NPCs.getNearest(iArr27))) {
                            AccBuilderGWD.c = llIllllII[llIllllll[48]];
                            if (lIllllIIlIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                            if (lIllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                                if (!lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[35]) || lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[41])) {
                                    String[] strArr8 = new String[llIllllll[0]];
                                    strArr8[llIllllll[1]] = llIllllII[llIllllll[2]];
                                }
                                Magic.cast(SpellBook.Standard.FIRE_STRIKE, NPCs.getNearest(npc -> {
                                    if (lIllllIlIIII(npc.getId(), llIllllll[54]) && lIllllIIlIIl(npc.isDead() ? 1 : 0)) {
                                        ?? r0 = llIllllll[0];
                                        "".length();
                                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIllllll[1];
                                }));
                                Time.sleepTicks(llIllllll[4]);
                                "".length();
                                String[] strArr9 = new String[llIllllll[0]];
                                strArr9[llIllllll[1]] = llIllllII[llIllllll[57]];
                                if (lIllllIIIlll(Inventory.contains(strArr9) ? 1 : 0)) {
                                    if (lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[41]) && lIllllIIlIII(Skills.getLevel(Skill.MAGIC), llIllllll[34])) {
                                        Magic.cast(SpellBook.Standard.WIND_BOLT, NPCs.getNearest(npc2 -> {
                                            if (lIllllIlIIII(npc2.getId(), llIllllll[54]) && lIllllIIlIIl(npc2.isDead() ? 1 : 0)) {
                                                ?? r0 = llIllllll[0];
                                                "".length();
                                                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                            return llIllllll[1];
                                        }));
                                        Time.sleepTicks(llIllllll[4]);
                                        "".length();
                                    }
                                    if (lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[34]) && lIllllIIlIII(Skills.getLevel(Skill.MAGIC), llIllllll[56])) {
                                        Magic.cast(SpellBook.Standard.WATER_BOLT, NPCs.getNearest(npc3 -> {
                                            if (lIllllIlIIII(npc3.getId(), llIllllll[54]) && lIllllIIlIIl(npc3.isDead() ? 1 : 0)) {
                                                ?? r0 = llIllllll[0];
                                                "".length();
                                                return " ".length() > (45 ^ 41) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                            return llIllllll[1];
                                        }));
                                        Time.sleepTicks(llIllllll[4]);
                                        "".length();
                                    }
                                    if (lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[56]) && lIllllIIlIII(Skills.getLevel(Skill.MAGIC), llIllllll[58])) {
                                        Magic.cast(SpellBook.Standard.EARTH_BOLT, NPCs.getNearest(npc4 -> {
                                            if (lIllllIlIIII(npc4.getId(), llIllllll[54]) && lIllllIIlIIl(npc4.isDead() ? 1 : 0)) {
                                                ?? r0 = llIllllll[0];
                                                "".length();
                                                return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                            return llIllllll[1];
                                        }));
                                        Time.sleepTicks(llIllllll[4]);
                                        "".length();
                                    }
                                    if (lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[58])) {
                                        Magic.cast(SpellBook.Standard.FIRE_BOLT, NPCs.getNearest(npc5 -> {
                                            if (lIllllIlIIII(npc5.getId(), llIllllll[54]) && lIllllIIlIIl(npc5.isDead() ? 1 : 0)) {
                                                ?? r0 = llIllllll[0];
                                                "".length();
                                                return "  ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                            return llIllllll[1];
                                        }));
                                        Time.sleepTicks(llIllllll[4]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr10 = new String[llIllllll[0]];
                strArr10[llIllllll[1]] = llIllllII[llIllllll[59]];
                if (lIllllIIlIIl(Inventory.contains(strArr10) ? 1 : 0)) {
                    if (lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eR), llIllllll[7]) && lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eO), llIllllll[52])) {
                        if (lIllllIIIlll(Inventory.contains(C0005f.aY) ? 1 : 0) && lIllllIIlIIl(Equipment.contains(C0005f.aY) ? 1 : 0)) {
                            C0004e.b(C0005f.aY);
                        }
                        AccBuilderGWD.c = llIllllII[llIllllll[60]];
                        if (lIllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo(eR);
                            "".length();
                            Time.sleepTicks(llIllllll[0]);
                            "".length();
                        }
                        String[] strArr11 = new String[llIllllll[6]];
                        strArr11[llIllllll[1]] = llIllllII[llIllllll[58]];
                        strArr11[llIllllll[0]] = llIllllII[llIllllll[3]];
                        strArr11[llIllllll[4]] = llIllllII[llIllllll[61]];
                        C0006g.a(strArr11);
                    }
                    if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eR), llIllllll[7])) {
                        AccBuilderGWD.c = llIllllII[llIllllll[62]];
                        if (lIllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[llIllllll[0]];
                            strArr12[llIllllll[1]] = llIllllII[llIllllll[63]];
                            TileObjects.getNearest(strArr12).interact(llIllllII[llIllllll[64]]);
                            Time.sleepTicks(llIllllll[6]);
                            "".length();
                        }
                        C0006g.a(eY);
                    }
                    if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eO), llIllllll[52])) {
                        if (lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eP), llIllllll[21])) {
                            AccBuilderGWD.c = llIllllII[llIllllll[65]];
                            Movement.walkTo(eP);
                            "".length();
                            Time.sleepTicks(llIllllll[0]);
                            "".length();
                        }
                        if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eP), llIllllll[21])) {
                            AccBuilderGWD.c = llIllllII[llIllllll[66]];
                            if (lIllllIIlIlI(Skills.getLevel(Skill.PRAYER), llIllllll[67]) && lIllllIIllII(Prayers.getPoints()) && lIllllIIlIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                            if (lIllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                                String[] strArr13 = new String[llIllllll[0]];
                                strArr13[llIllllll[1]] = llIllllII[llIllllll[67]];
                                if (lIllllIlIIIl(TileItems.getNearest(strArr13))) {
                                    if (!lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[35]) || lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[41])) {
                                        String[] strArr14 = new String[llIllllll[0]];
                                        strArr14[llIllllll[1]] = llIllllII[llIllllll[68]];
                                    }
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, NPCs.getNearest(npc6 -> {
                                        if (lIllllIIIlll(npc6.getName().equalsIgnoreCase(llIllllII[llIllllll[109]]) ? 1 : 0) && lIllllIIlIIl(npc6.isDead() ? 1 : 0)) {
                                            ?? r0 = llIllllll[0];
                                            "".length();
                                            return (39 ^ 35) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIllllll[1];
                                    }));
                                    Time.sleepTicks(llIllllll[4]);
                                    "".length();
                                    String[] strArr15 = new String[llIllllll[0]];
                                    strArr15[llIllllll[1]] = llIllllII[llIllllll[5]];
                                    if (lIllllIIIlll(Inventory.contains(strArr15) ? 1 : 0)) {
                                        if (lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[41]) && lIllllIIlIII(Skills.getLevel(Skill.MAGIC), llIllllll[34])) {
                                            Magic.cast(SpellBook.Standard.WIND_BOLT, NPCs.getNearest(npc7 -> {
                                                if (lIllllIIIlll(npc7.getName().equalsIgnoreCase(llIllllII[llIllllll[108]]) ? 1 : 0) && lIllllIIlIIl(npc7.isDead() ? 1 : 0)) {
                                                    ?? r0 = llIllllll[0];
                                                    "".length();
                                                    return (-"   ".length()) >= 0 ? ((((168 + 161) - 314) + 158) ^ (((145 + 92) - 96) + 25)) & (((((158 + 19) - 10) + 3) ^ (((143 + 99) - 190) + 109)) ^ (-" ".length())) : r0;
                                                }
                                                return llIllllll[1];
                                            }));
                                            Time.sleepTicks(llIllllll[4]);
                                            "".length();
                                        }
                                        if (lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[34]) && lIllllIIlIII(Skills.getLevel(Skill.MAGIC), llIllllll[56])) {
                                            Magic.cast(SpellBook.Standard.WATER_BOLT, NPCs.getNearest(npc8 -> {
                                                if (lIllllIIIlll(npc8.getName().equalsIgnoreCase(llIllllII[llIllllll[107]]) ? 1 : 0) && lIllllIIlIIl(npc8.isDead() ? 1 : 0)) {
                                                    ?? r0 = llIllllll[0];
                                                    "".length();
                                                    return (((228 ^ 141) ^ (115 ^ 43)) & (((127 ^ 85) ^ (182 ^ 173)) ^ (-" ".length()))) > " ".length() ? ((178 ^ 192) ^ (60 ^ 12)) & (((((99 + 108) - 6) + 51) ^ (((25 + 50) - (-11)) + 104)) ^ (-" ".length())) : r0;
                                                }
                                                return llIllllll[1];
                                            }));
                                            Time.sleepTicks(llIllllll[4]);
                                            "".length();
                                        }
                                        if (lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[56]) && lIllllIIlIII(Skills.getLevel(Skill.MAGIC), llIllllll[58])) {
                                            Magic.cast(SpellBook.Standard.EARTH_BOLT, NPCs.getNearest(npc9 -> {
                                                if (lIllllIIIlll(npc9.getName().equalsIgnoreCase(llIllllII[llIllllll[106]]) ? 1 : 0) && lIllllIIlIIl(npc9.isDead() ? 1 : 0)) {
                                                    ?? r0 = llIllllll[0];
                                                    "".length();
                                                    return ("  ".length() & ("  ".length() ^ (-" ".length()))) != 0 ? ((((6 + 62) - 55) + 151) ^ (((46 + 114) - 33) + 27)) & (((118 ^ 89) ^ (148 ^ 133)) ^ (-" ".length())) : r0;
                                                }
                                                return llIllllll[1];
                                            }));
                                            Time.sleepTicks(llIllllll[4]);
                                            "".length();
                                        }
                                        if (lIllllIIlIlI(Skills.getLevel(Skill.MAGIC), llIllllll[58])) {
                                            Magic.cast(SpellBook.Standard.FIRE_BOLT, NPCs.getNearest(npc10 -> {
                                                if (lIllllIIIlll(npc10.getName().equalsIgnoreCase(llIllllII[llIllllll[52]]) ? 1 : 0) && lIllllIIlIIl(npc10.isDead() ? 1 : 0)) {
                                                    ?? r0 = llIllllll[0];
                                                    "".length();
                                                    return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                }
                                                return llIllllll[1];
                                            }));
                                            Time.sleepTicks(llIllllll[4]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                            String[] strArr16 = new String[llIllllll[0]];
                            strArr16[llIllllll[1]] = llIllllII[llIllllll[69]];
                            if (lIllllIIlIll(TileItems.getNearest(strArr16))) {
                                String[] strArr17 = new String[llIllllll[0]];
                                strArr17[llIllllll[1]] = llIllllII[llIllllll[70]];
                                TileItems.getNearest(strArr17).interact(llIllllII[llIllllll[71]]);
                                Time.sleepTicks(llIllllll[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIllllIlIIII(C0004e.j(eW), llIllllll[6])) {
                AccBuilderGWD.c = llIllllII[llIllllll[72]];
                if (lIllllIIIlll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    String[] strArr18 = new String[llIllllll[0]];
                    strArr18[llIllllll[1]] = llIllllII[llIllllll[33]];
                    TileObjects.getNearest(strArr18).interact(llIllllII[llIllllll[73]]);
                    Time.sleepTicks(llIllllll[0]);
                    "".length();
                }
            }
            if (lIllllIlIIII(C0004e.j(eW), llIllllll[7])) {
                if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eQ), llIllllll[64]) && lIllllIlIIII(Players.getLocal().getAnimation(), llIllllll[74])) {
                    int[] iArr28 = new int[llIllllll[0]];
                    iArr28[llIllllll[1]] = llIllllll[13];
                    Inventory.getFirst(iArr28).interact(llIllllII[llIllllll[75]]);
                    Time.sleepTicks(llIllllll[10]);
                    "".length();
                }
                String[] strArr19 = new String[llIllllll[0]];
                strArr19[llIllllll[1]] = llIllllII[llIllllll[76]];
                if (lIllllIIlIIl(Inventory.contains(strArr19) ? 1 : 0)) {
                    if (lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eT), llIllllll[7])) {
                        AccBuilderGWD.c = llIllllII[llIllllll[77]];
                        Movement.walkTo(eT);
                        "".length();
                        Time.sleepTicks(llIllllll[0]);
                        "".length();
                    }
                    if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eT), llIllllll[7])) {
                        String[] strArr20 = new String[llIllllll[0]];
                        strArr20[llIllllll[1]] = llIllllII[llIllllll[78]];
                        if (lIllllIIlIll(TileItems.getNearest(strArr20))) {
                            String[] strArr21 = new String[llIllllll[0]];
                            strArr21[llIllllll[1]] = llIllllII[llIllllll[79]];
                            TileItems.getNearest(strArr21).interact(llIllllII[llIllllll[80]]);
                            Time.sleepTicks(llIllllll[4]);
                            "".length();
                        }
                    }
                }
                String[] strArr22 = new String[llIllllll[0]];
                strArr22[llIllllll[1]] = llIllllII[llIllllll[81]];
                if (lIllllIIIlll(Inventory.contains(strArr22) ? 1 : 0)) {
                    String[] strArr23 = new String[llIllllll[0]];
                    strArr23[llIllllll[1]] = llIllllII[llIllllll[82]];
                    Item first = Inventory.getFirst(strArr23);
                    String[] strArr24 = new String[llIllllll[0]];
                    strArr24[llIllllll[1]] = llIllllII[llIllllll[83]];
                    first.useOn(Inventory.getFirst(strArr24));
                    Time.sleepTicks(llIllllll[4]);
                    "".length();
                }
            }
            if (lIllllIlIIII(C0004e.j(eW), llIllllll[8])) {
                String[] strArr25 = new String[llIllllll[0]];
                strArr25[llIllllll[1]] = llIllllII[llIllllll[84]];
                if (lIllllIIlIIl(Equipment.contains(strArr25) ? 1 : 0)) {
                    String[] strArr26 = new String[llIllllll[0]];
                    strArr26[llIllllll[1]] = llIllllII[llIllllll[85]];
                    if (lIllllIIIlll(Inventory.contains(strArr26) ? 1 : 0)) {
                        String[] strArr27 = new String[llIllllll[0]];
                        strArr27[llIllllll[1]] = llIllllII[llIllllll[86]];
                        Inventory.getFirst(strArr27).interact(llIllllII[llIllllll[87]]);
                    }
                }
                if (lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eU), llIllllll[8])) {
                    AccBuilderGWD.c = llIllllII[llIllllll[88]];
                    Movement.walkTo(eU);
                    "".length();
                    Time.sleepTicks(llIllllll[0]);
                    "".length();
                }
                if (lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eU), llIllllll[8])) {
                    AccBuilderGWD.c = llIllllII[llIllllll[89]];
                    if (lIllllIIlIII(dk, llIllllll[0])) {
                        as.mT += llIllllll[0];
                        as.u(AccBuilderGWD.m);
                        dk += llIllllll[0];
                        as.mT = llIllllll[1];
                    }
                    String[] strArr28 = new String[llIllllll[0]];
                    strArr28[llIllllll[1]] = llIllllII[llIllllll[90]];
                    TileObjects.getNearest(strArr28).interact(llIllllII[llIllllll[91]]);
                    Time.sleepUntil(() -> {
                        if (lIllllIlIIII(C0004e.j(eW), llIllllll[10])) {
                            ?? r0 = llIllllll[0];
                            "".length();
                            return "  ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIllllll[1];
                    }, llIllllll[92]);
                    "".length();
                }
            }
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bz();
            "".length();
            if ((((93 ^ 51) ^ (192 ^ 128)) & (((157 ^ 147) ^ (126 ^ 94)) ^ (-" ".length()))) >= "  ".length()) {
                return ((185 ^ 177) ^ (89 ^ 102)) & (((((121 + 37) - 13) + 12) ^ (((169 + 70) - 170) + 101)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIllllll[104];
    }

    private static boolean lIllllIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIllllIIlllI(int i, int i2) {
        return i > i2;
    }

    private static String lIlllIlllIIl(String lIIIIIIlllIlll, String lIIIIIIlllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIlllIllI.getBytes(StandardCharsets.UTF_8)), llIllllll[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllllll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIIllllIII) {
            lIIIIIIllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static String lIlllIlllIlI(String lIIIIIlIIIIlII, String lIIIIIlIIIIIll) {
        try {
            SecretKeySpec lIIIIIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllllll[4], lIIIIIlIIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIlIIIIlIl) {
            lIIIIIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIllll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIllllll[1];
    }

    static {
        lIllllIIIlIl();
        lIllllIIIlII();
        eN = new WorldPoint(llIllllll[110], llIllllll[111], llIllllll[1]);
        eO = new WorldPoint(llIllllll[112], llIllllll[113], llIllllll[1]);
        eP = new WorldPoint(llIllllll[114], llIllllll[115], llIllllll[1]);
        eQ = new WorldPoint(llIllllll[116], llIllllll[117], llIllllll[1]);
        eR = new WorldPoint(llIllllll[112], llIllllll[118], llIllllll[1]);
        eS = new WorldPoint(llIllllll[119], llIllllll[120], llIllllll[1]);
        eT = new WorldPoint(llIllllll[121], llIllllll[122], llIllllll[1]);
        eU = new WorldPoint(llIllllll[123], llIllllll[124], llIllllll[1]);
        eV = new WorldPoint(llIllllll[125], llIllllll[126], llIllllll[1]);
        bx = new ArrayList();
        eW = llIllllll[127];
        eX = llIllllll[1];
        String[] strArr = new String[llIllllll[21]];
        strArr[llIllllll[1]] = llIllllII[llIllllll[128]];
        strArr[llIllllll[0]] = llIllllII[llIllllll[129]];
        strArr[llIllllll[4]] = llIllllII[llIllllll[130]];
        strArr[llIllllll[6]] = llIllllII[llIllllll[131]];
        strArr[llIllllll[7]] = llIllllII[llIllllll[132]];
        strArr[llIllllll[8]] = llIllllII[llIllllll[133]];
        strArr[llIllllll[10]] = llIllllII[llIllllll[134]];
        strArr[llIllllll[19]] = llIllllII[llIllllll[135]];
        eY = strArr;
        dc = llIllllII[llIllllll[136]];
        h = "Lost city " + dc;
    }

    private static boolean lIllllIIllII(int i) {
        return i > 0;
    }

    private static boolean lIllllIlIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIllllll[23]];
        iArr[llIllllll[1]] = llIllllll[12];
        iArr[llIllllll[0]] = llIllllll[13];
        iArr[llIllllll[4]] = llIllllll[14];
        iArr[llIllllll[6]] = llIllllll[15];
        iArr[llIllllll[7]] = llIllllll[16];
        iArr[llIllllll[8]] = llIllllll[17];
        iArr[llIllllll[10]] = llIllllll[18];
        iArr[llIllllll[19]] = llIllllll[20];
        iArr[llIllllll[21]] = llIllllll[22];
        int i = llIllllll[1];
        while (lIllllIIlIII(i, iArr.length)) {
            int[] iArr2 = new int[llIllllll[0]];
            iArr2[llIllllll[1]] = iArr[i];
            if (lIllllIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIllllll[1];
            }
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((((94 + 115) - 112) + 95) ^ (((3 + 29) - (-29)) + 71)) & (((68 ^ 7) ^ (23 ^ 16)) ^ (-" ".length()));
            }
        }
        return llIllllll[0];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return h;
    }

    private static String lIlllIlllIII(String lIIIIIIllIIlll, String lIIIIIIllIIllI) {
        String lIIIIIIllIIlll2 = new String(Base64.getDecoder().decode(lIIIIIIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIIIIIllIIlII = lIIIIIIllIIllI.toCharArray();
        int lIIIIIIllIIIll = llIllllll[1];
        char[] charArray = lIIIIIIllIIlll2.toCharArray();
        int length = charArray.length;
        int i = llIllllll[1];
        while (lIllllIIlIII(i, length)) {
            char lIIIIIIllIlIII = charArray[i];
            sb.append((char) (lIIIIIIllIlIII ^ lIIIIIIllIIlII[lIIIIIIllIIIll % lIIIIIIllIIlII.length]));
            "".length();
            lIIIIIIllIIIll++;
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIllllIlIIII(C0004e.j(eW), llIllllll[10])) {
            ?? r0 = llIllllll[0];
            "".length();
            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIllllll[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x012b, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[6]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01b4, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x023d, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02c6, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x034f, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03d8, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[28]) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0461, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x04ea, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[25]) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x05b8, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[11]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[29]) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0704, code lost:
        if (lIllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.D.llIllllll[7]) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x074a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16 = new int[llIllllll[0]];
        iArr16[llIllllll[1]] = llIllllll[22];
        if (lIllllIIIlll(Bank.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[llIllllll[0]];
            iArr17[llIllllll[1]] = llIllllll[22];
            if (lIllllIIIlll(Bank.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[llIllllll[0]];
                iArr18[llIllllll[1]] = llIllllll[22];
            }
            iArr = new int[llIllllll[0]];
            iArr[llIllllll[1]] = llIllllll[94];
            if (lIllllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(llIllllll[94], llIllllll[0], llIllllll[95]));
                "".length();
            }
            iArr2 = new int[llIllllll[0]];
            iArr2[llIllllll[1]] = llIllllll[16];
            if (lIllllIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr19 = new int[llIllllll[0]];
                iArr19[llIllllll[1]] = llIllllll[16];
                if (lIllllIIIlll(Bank.contains(iArr19) ? 1 : 0)) {
                    int[] iArr20 = new int[llIllllll[0]];
                    iArr20[llIllllll[1]] = llIllllll[16];
                }
                iArr3 = new int[llIllllll[0]];
                iArr3[llIllllll[1]] = llIllllll[20];
                if (lIllllIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr21 = new int[llIllllll[0]];
                    iArr21[llIllllll[1]] = llIllllll[20];
                    if (lIllllIIIlll(Bank.contains(iArr21) ? 1 : 0)) {
                        int[] iArr22 = new int[llIllllll[0]];
                        iArr22[llIllllll[1]] = llIllllll[20];
                    }
                    iArr4 = new int[llIllllll[0]];
                    iArr4[llIllllll[1]] = llIllllll[18];
                    if (lIllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr23 = new int[llIllllll[0]];
                        iArr23[llIllllll[1]] = llIllllll[18];
                        if (lIllllIIIlll(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIllllll[0]];
                            iArr24[llIllllll[1]] = llIllllll[18];
                        }
                        iArr5 = new int[llIllllll[0]];
                        iArr5[llIllllll[1]] = llIllllll[27];
                        if (lIllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr25 = new int[llIllllll[0]];
                            iArr25[llIllllll[1]] = llIllllll[27];
                            if (lIllllIIIlll(Bank.contains(iArr25) ? 1 : 0)) {
                                int[] iArr26 = new int[llIllllll[0]];
                                iArr26[llIllllll[1]] = llIllllll[27];
                            }
                            iArr6 = new int[llIllllll[0]];
                            iArr6[llIllllll[1]] = llIllllll[26];
                            if (lIllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                                int[] iArr27 = new int[llIllllll[0]];
                                iArr27[llIllllll[1]] = llIllllll[26];
                                if (lIllllIIIlll(Bank.contains(iArr27) ? 1 : 0)) {
                                    int[] iArr28 = new int[llIllllll[0]];
                                    iArr28[llIllllll[1]] = llIllllll[26];
                                }
                                iArr7 = new int[llIllllll[0]];
                                iArr7[llIllllll[1]] = llIllllll[24];
                                if (lIllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                    int[] iArr29 = new int[llIllllll[0]];
                                    iArr29[llIllllll[1]] = llIllllll[24];
                                    if (lIllllIIIlll(Bank.contains(iArr29) ? 1 : 0)) {
                                        int[] iArr30 = new int[llIllllll[0]];
                                        iArr30[llIllllll[1]] = llIllllll[24];
                                    }
                                    iArr8 = new int[llIllllll[0]];
                                    iArr8[llIllllll[1]] = llIllllll[17];
                                    if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                                        int[] iArr31 = new int[llIllllll[0]];
                                        iArr31[llIllllll[1]] = llIllllll[17];
                                        if (lIllllIIIlll(Bank.contains(iArr31) ? 1 : 0)) {
                                            int[] iArr32 = new int[llIllllll[0]];
                                            iArr32[llIllllll[1]] = llIllllll[17];
                                        }
                                        iArr9 = new int[llIllllll[0]];
                                        iArr9[llIllllll[1]] = llIllllll[17];
                                        if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                            int[] iArr33 = new int[llIllllll[0]];
                                            iArr33[llIllllll[1]] = llIllllll[17];
                                            if (lIllllIIIlll(Bank.contains(iArr33) ? 1 : 0)) {
                                                int[] iArr34 = new int[llIllllll[0]];
                                                iArr34[llIllllll[1]] = llIllllll[17];
                                            }
                                            iArr10 = new int[llIllllll[0]];
                                            iArr10[llIllllll[1]] = llIllllll[15];
                                            if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                                bx.add(new C0003d(llIllllll[15], llIllllll[0], llIllllll[98]));
                                                "".length();
                                            }
                                            iArr11 = new int[llIllllll[0]];
                                            iArr11[llIllllll[1]] = llIllllll[13];
                                            if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                                int[] iArr35 = new int[llIllllll[0]];
                                                iArr35[llIllllll[1]] = llIllllll[13];
                                                if (lIllllIIIlll(Bank.contains(iArr35) ? 1 : 0)) {
                                                    int[] iArr36 = new int[llIllllll[0]];
                                                    iArr36[llIllllll[1]] = llIllllll[13];
                                                }
                                                iArr12 = new int[llIllllll[0]];
                                                iArr12[llIllllll[1]] = llIllllll[14];
                                                if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                                    bx.add(new C0003d(llIllllll[14], llIllllll[0], llIllllll[100]));
                                                    "".length();
                                                }
                                                iArr13 = new int[llIllllll[0]];
                                                iArr13[llIllllll[1]] = llIllllll[15];
                                                if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                                    bx.add(new C0003d(llIllllll[15], llIllllll[0], llIllllll[98]));
                                                    "".length();
                                                }
                                                if (lIllllIIlIIl(Bank.contains(item -> {
                                                    return item.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                                                }) ? 1 : 0)) {
                                                    bx.add(new C0003d(llIllllll[101], llIllllll[8], llIllllll[102]));
                                                    "".length();
                                                }
                                                iArr14 = new int[llIllllll[0]];
                                                iArr14[llIllllll[1]] = llIllllll[30];
                                                if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                                    int[] iArr37 = new int[llIllllll[0]];
                                                    iArr37[llIllllll[1]] = llIllllll[30];
                                                    if (lIllllIIIlll(Bank.contains(iArr37) ? 1 : 0)) {
                                                        int[] iArr38 = new int[llIllllll[0]];
                                                        iArr38[llIllllll[1]] = llIllllll[30];
                                                    }
                                                    iArr15 = new int[llIllllll[0]];
                                                    iArr15[llIllllll[1]] = llIllllll[12];
                                                    if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                                        int[] iArr39 = new int[llIllllll[0]];
                                                        iArr39[llIllllll[1]] = llIllllll[12];
                                                        if (!lIllllIIIlll(Bank.contains(iArr39) ? 1 : 0)) {
                                                            return;
                                                        }
                                                        int[] iArr40 = new int[llIllllll[0]];
                                                        iArr40[llIllllll[1]] = llIllllll[12];
                                                        if (!lIllllIIlIII(Bank.getFirst(iArr40).getQuantity(), llIllllll[11])) {
                                                            return;
                                                        }
                                                    }
                                                    bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                                                    "".length();
                                                }
                                                bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                                                "".length();
                                                iArr15 = new int[llIllllll[0]];
                                                iArr15[llIllllll[1]] = llIllllll[12];
                                                if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                                }
                                                bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                                                "".length();
                                            }
                                            bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
                                            "".length();
                                            iArr12 = new int[llIllllll[0]];
                                            iArr12[llIllllll[1]] = llIllllll[14];
                                            if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                            }
                                            iArr13 = new int[llIllllll[0]];
                                            iArr13[llIllllll[1]] = llIllllll[15];
                                            if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                            }
                                            if (lIllllIIlIIl(Bank.contains(item2 -> {
                                                return item2.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                                            }) ? 1 : 0)) {
                                            }
                                            iArr14 = new int[llIllllll[0]];
                                            iArr14[llIllllll[1]] = llIllllll[30];
                                            if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                            }
                                            bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                                            "".length();
                                            iArr15 = new int[llIllllll[0]];
                                            iArr15[llIllllll[1]] = llIllllll[12];
                                            if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                            }
                                            bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                                            "".length();
                                        }
                                        bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                                        "".length();
                                        iArr10 = new int[llIllllll[0]];
                                        iArr10[llIllllll[1]] = llIllllll[15];
                                        if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                        }
                                        iArr11 = new int[llIllllll[0]];
                                        iArr11[llIllllll[1]] = llIllllll[13];
                                        if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                        }
                                        bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
                                        "".length();
                                        iArr12 = new int[llIllllll[0]];
                                        iArr12[llIllllll[1]] = llIllllll[14];
                                        if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                        }
                                        iArr13 = new int[llIllllll[0]];
                                        iArr13[llIllllll[1]] = llIllllll[15];
                                        if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                        }
                                        if (lIllllIIlIIl(Bank.contains(item22 -> {
                                            return item22.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                                        }) ? 1 : 0)) {
                                        }
                                        iArr14 = new int[llIllllll[0]];
                                        iArr14[llIllllll[1]] = llIllllll[30];
                                        if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                        }
                                        bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                                        "".length();
                                        iArr15 = new int[llIllllll[0]];
                                        iArr15[llIllllll[1]] = llIllllll[12];
                                        if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                        }
                                        bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                                        "".length();
                                    }
                                    bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                                    "".length();
                                    iArr9 = new int[llIllllll[0]];
                                    iArr9[llIllllll[1]] = llIllllll[17];
                                    if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                                    "".length();
                                    iArr10 = new int[llIllllll[0]];
                                    iArr10[llIllllll[1]] = llIllllll[15];
                                    if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                    }
                                    iArr11 = new int[llIllllll[0]];
                                    iArr11[llIllllll[1]] = llIllllll[13];
                                    if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
                                    "".length();
                                    iArr12 = new int[llIllllll[0]];
                                    iArr12[llIllllll[1]] = llIllllll[14];
                                    if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                    }
                                    iArr13 = new int[llIllllll[0]];
                                    iArr13[llIllllll[1]] = llIllllll[15];
                                    if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                    }
                                    if (lIllllIIlIIl(Bank.contains(item222 -> {
                                        return item222.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                                    }) ? 1 : 0)) {
                                    }
                                    iArr14 = new int[llIllllll[0]];
                                    iArr14[llIllllll[1]] = llIllllll[30];
                                    if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                                    "".length();
                                    iArr15 = new int[llIllllll[0]];
                                    iArr15[llIllllll[1]] = llIllllll[12];
                                    if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                                    "".length();
                                }
                                bx.add(new C0003d(llIllllll[24], llIllllll[28], llIllllll[97]));
                                "".length();
                                iArr8 = new int[llIllllll[0]];
                                iArr8[llIllllll[1]] = llIllllll[17];
                                if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                                "".length();
                                iArr9 = new int[llIllllll[0]];
                                iArr9[llIllllll[1]] = llIllllll[17];
                                if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                                "".length();
                                iArr10 = new int[llIllllll[0]];
                                iArr10[llIllllll[1]] = llIllllll[15];
                                if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                }
                                iArr11 = new int[llIllllll[0]];
                                iArr11[llIllllll[1]] = llIllllll[13];
                                if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
                                "".length();
                                iArr12 = new int[llIllllll[0]];
                                iArr12[llIllllll[1]] = llIllllll[14];
                                if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                }
                                iArr13 = new int[llIllllll[0]];
                                iArr13[llIllllll[1]] = llIllllll[15];
                                if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                if (lIllllIIlIIl(Bank.contains(item2222 -> {
                                    return item2222.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                                }) ? 1 : 0)) {
                                }
                                iArr14 = new int[llIllllll[0]];
                                iArr14[llIllllll[1]] = llIllllll[30];
                                if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                                "".length();
                                iArr15 = new int[llIllllll[0]];
                                iArr15[llIllllll[1]] = llIllllll[12];
                                if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                                "".length();
                            }
                            bx.add(new C0003d(llIllllll[26], llIllllll[25], llIllllll[11]));
                            "".length();
                            iArr7 = new int[llIllllll[0]];
                            iArr7[llIllllll[1]] = llIllllll[24];
                            if (lIllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIllllll[24], llIllllll[28], llIllllll[97]));
                            "".length();
                            iArr8 = new int[llIllllll[0]];
                            iArr8[llIllllll[1]] = llIllllll[17];
                            if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                            "".length();
                            iArr9 = new int[llIllllll[0]];
                            iArr9[llIllllll[1]] = llIllllll[17];
                            if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                            "".length();
                            iArr10 = new int[llIllllll[0]];
                            iArr10[llIllllll[1]] = llIllllll[15];
                            if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[llIllllll[0]];
                            iArr11[llIllllll[1]] = llIllllll[13];
                            if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
                            "".length();
                            iArr12 = new int[llIllllll[0]];
                            iArr12[llIllllll[1]] = llIllllll[14];
                            if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            iArr13 = new int[llIllllll[0]];
                            iArr13[llIllllll[1]] = llIllllll[15];
                            if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            if (lIllllIIlIIl(Bank.contains(item22222 -> {
                                return item22222.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                            }) ? 1 : 0)) {
                            }
                            iArr14 = new int[llIllllll[0]];
                            iArr14[llIllllll[1]] = llIllllll[30];
                            if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                            "".length();
                            iArr15 = new int[llIllllll[0]];
                            iArr15[llIllllll[1]] = llIllllll[12];
                            if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                            "".length();
                        }
                        bx.add(new C0003d(llIllllll[27], llIllllll[25], llIllllll[11]));
                        "".length();
                        iArr6 = new int[llIllllll[0]];
                        iArr6[llIllllll[1]] = llIllllll[26];
                        if (lIllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIllllll[26], llIllllll[25], llIllllll[11]));
                        "".length();
                        iArr7 = new int[llIllllll[0]];
                        iArr7[llIllllll[1]] = llIllllll[24];
                        if (lIllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIllllll[24], llIllllll[28], llIllllll[97]));
                        "".length();
                        iArr8 = new int[llIllllll[0]];
                        iArr8[llIllllll[1]] = llIllllll[17];
                        if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                        "".length();
                        iArr9 = new int[llIllllll[0]];
                        iArr9[llIllllll[1]] = llIllllll[17];
                        if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                        "".length();
                        iArr10 = new int[llIllllll[0]];
                        iArr10[llIllllll[1]] = llIllllll[15];
                        if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[llIllllll[0]];
                        iArr11[llIllllll[1]] = llIllllll[13];
                        if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
                        "".length();
                        iArr12 = new int[llIllllll[0]];
                        iArr12[llIllllll[1]] = llIllllll[14];
                        if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        iArr13 = new int[llIllllll[0]];
                        iArr13[llIllllll[1]] = llIllllll[15];
                        if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        if (lIllllIIlIIl(Bank.contains(item222222 -> {
                            return item222222.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                        }) ? 1 : 0)) {
                        }
                        iArr14 = new int[llIllllll[0]];
                        iArr14[llIllllll[1]] = llIllllll[30];
                        if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                        "".length();
                        iArr15 = new int[llIllllll[0]];
                        iArr15[llIllllll[1]] = llIllllll[12];
                        if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                        "".length();
                    }
                    bx.add(new C0003d(llIllllll[18], llIllllll[25], llIllllll[11]));
                    "".length();
                    iArr5 = new int[llIllllll[0]];
                    iArr5[llIllllll[1]] = llIllllll[27];
                    if (lIllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIllllll[27], llIllllll[25], llIllllll[11]));
                    "".length();
                    iArr6 = new int[llIllllll[0]];
                    iArr6[llIllllll[1]] = llIllllll[26];
                    if (lIllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIllllll[26], llIllllll[25], llIllllll[11]));
                    "".length();
                    iArr7 = new int[llIllllll[0]];
                    iArr7[llIllllll[1]] = llIllllll[24];
                    if (lIllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIllllll[24], llIllllll[28], llIllllll[97]));
                    "".length();
                    iArr8 = new int[llIllllll[0]];
                    iArr8[llIllllll[1]] = llIllllll[17];
                    if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                    "".length();
                    iArr9 = new int[llIllllll[0]];
                    iArr9[llIllllll[1]] = llIllllll[17];
                    if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                    "".length();
                    iArr10 = new int[llIllllll[0]];
                    iArr10[llIllllll[1]] = llIllllll[15];
                    if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[llIllllll[0]];
                    iArr11[llIllllll[1]] = llIllllll[13];
                    if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
                    "".length();
                    iArr12 = new int[llIllllll[0]];
                    iArr12[llIllllll[1]] = llIllllll[14];
                    if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    iArr13 = new int[llIllllll[0]];
                    iArr13[llIllllll[1]] = llIllllll[15];
                    if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    if (lIllllIIlIIl(Bank.contains(item2222222 -> {
                        return item2222222.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                    }) ? 1 : 0)) {
                    }
                    iArr14 = new int[llIllllll[0]];
                    iArr14[llIllllll[1]] = llIllllll[30];
                    if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                    "".length();
                    iArr15 = new int[llIllllll[0]];
                    iArr15[llIllllll[1]] = llIllllll[12];
                    if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                    "".length();
                }
                bx.add(new C0003d(llIllllll[20], llIllllll[25], llIllllll[11]));
                "".length();
                iArr4 = new int[llIllllll[0]];
                iArr4[llIllllll[1]] = llIllllll[18];
                if (lIllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[18], llIllllll[25], llIllllll[11]));
                "".length();
                iArr5 = new int[llIllllll[0]];
                iArr5[llIllllll[1]] = llIllllll[27];
                if (lIllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[27], llIllllll[25], llIllllll[11]));
                "".length();
                iArr6 = new int[llIllllll[0]];
                iArr6[llIllllll[1]] = llIllllll[26];
                if (lIllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[26], llIllllll[25], llIllllll[11]));
                "".length();
                iArr7 = new int[llIllllll[0]];
                iArr7[llIllllll[1]] = llIllllll[24];
                if (lIllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[24], llIllllll[28], llIllllll[97]));
                "".length();
                iArr8 = new int[llIllllll[0]];
                iArr8[llIllllll[1]] = llIllllll[17];
                if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                "".length();
                iArr9 = new int[llIllllll[0]];
                iArr9[llIllllll[1]] = llIllllll[17];
                if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
                "".length();
                iArr10 = new int[llIllllll[0]];
                iArr10[llIllllll[1]] = llIllllll[15];
                if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[llIllllll[0]];
                iArr11[llIllllll[1]] = llIllllll[13];
                if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
                "".length();
                iArr12 = new int[llIllllll[0]];
                iArr12[llIllllll[1]] = llIllllll[14];
                if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                }
                iArr13 = new int[llIllllll[0]];
                iArr13[llIllllll[1]] = llIllllll[15];
                if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                }
                if (lIllllIIlIIl(Bank.contains(item22222222 -> {
                    return item22222222.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
                }) ? 1 : 0)) {
                }
                iArr14 = new int[llIllllll[0]];
                iArr14[llIllllll[1]] = llIllllll[30];
                if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
                "".length();
                iArr15 = new int[llIllllll[0]];
                iArr15[llIllllll[1]] = llIllllll[12];
                if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
                "".length();
            }
            bx.add(new C0003d(llIllllll[16], llIllllll[6], llIllllll[96]));
            "".length();
            iArr3 = new int[llIllllll[0]];
            iArr3[llIllllll[1]] = llIllllll[20];
            if (lIllllIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[20], llIllllll[25], llIllllll[11]));
            "".length();
            iArr4 = new int[llIllllll[0]];
            iArr4[llIllllll[1]] = llIllllll[18];
            if (lIllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[18], llIllllll[25], llIllllll[11]));
            "".length();
            iArr5 = new int[llIllllll[0]];
            iArr5[llIllllll[1]] = llIllllll[27];
            if (lIllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[27], llIllllll[25], llIllllll[11]));
            "".length();
            iArr6 = new int[llIllllll[0]];
            iArr6[llIllllll[1]] = llIllllll[26];
            if (lIllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[26], llIllllll[25], llIllllll[11]));
            "".length();
            iArr7 = new int[llIllllll[0]];
            iArr7[llIllllll[1]] = llIllllll[24];
            if (lIllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[24], llIllllll[28], llIllllll[97]));
            "".length();
            iArr8 = new int[llIllllll[0]];
            iArr8[llIllllll[1]] = llIllllll[17];
            if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
            "".length();
            iArr9 = new int[llIllllll[0]];
            iArr9[llIllllll[1]] = llIllllll[17];
            if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
            "".length();
            iArr10 = new int[llIllllll[0]];
            iArr10[llIllllll[1]] = llIllllll[15];
            if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[llIllllll[0]];
            iArr11[llIllllll[1]] = llIllllll[13];
            if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
            "".length();
            iArr12 = new int[llIllllll[0]];
            iArr12[llIllllll[1]] = llIllllll[14];
            if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
            }
            iArr13 = new int[llIllllll[0]];
            iArr13[llIllllll[1]] = llIllllll[15];
            if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
            }
            if (lIllllIIlIIl(Bank.contains(item222222222 -> {
                return item222222222.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
            }) ? 1 : 0)) {
            }
            iArr14 = new int[llIllllll[0]];
            iArr14[llIllllll[1]] = llIllllll[30];
            if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
            "".length();
            iArr15 = new int[llIllllll[0]];
            iArr15[llIllllll[1]] = llIllllll[12];
            if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
            "".length();
        }
        bx.add(new C0003d(llIllllll[22], llIllllll[29], llIllllll[93]));
        "".length();
        iArr = new int[llIllllll[0]];
        iArr[llIllllll[1]] = llIllllll[94];
        if (lIllllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIllllll[0]];
        iArr2[llIllllll[1]] = llIllllll[16];
        if (lIllllIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[16], llIllllll[6], llIllllll[96]));
        "".length();
        iArr3 = new int[llIllllll[0]];
        iArr3[llIllllll[1]] = llIllllll[20];
        if (lIllllIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[20], llIllllll[25], llIllllll[11]));
        "".length();
        iArr4 = new int[llIllllll[0]];
        iArr4[llIllllll[1]] = llIllllll[18];
        if (lIllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[18], llIllllll[25], llIllllll[11]));
        "".length();
        iArr5 = new int[llIllllll[0]];
        iArr5[llIllllll[1]] = llIllllll[27];
        if (lIllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[27], llIllllll[25], llIllllll[11]));
        "".length();
        iArr6 = new int[llIllllll[0]];
        iArr6[llIllllll[1]] = llIllllll[26];
        if (lIllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[26], llIllllll[25], llIllllll[11]));
        "".length();
        iArr7 = new int[llIllllll[0]];
        iArr7[llIllllll[1]] = llIllllll[24];
        if (lIllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[24], llIllllll[28], llIllllll[97]));
        "".length();
        iArr8 = new int[llIllllll[0]];
        iArr8[llIllllll[1]] = llIllllll[17];
        if (lIllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
        "".length();
        iArr9 = new int[llIllllll[0]];
        iArr9[llIllllll[1]] = llIllllll[17];
        if (lIllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[17], llIllllll[25], llIllllll[11]));
        "".length();
        iArr10 = new int[llIllllll[0]];
        iArr10[llIllllll[1]] = llIllllll[15];
        if (lIllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[llIllllll[0]];
        iArr11[llIllllll[1]] = llIllllll[13];
        if (lIllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[13], llIllllll[11], llIllllll[99]));
        "".length();
        iArr12 = new int[llIllllll[0]];
        iArr12[llIllllll[1]] = llIllllll[14];
        if (lIllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
        }
        iArr13 = new int[llIllllll[0]];
        iArr13[llIllllll[1]] = llIllllll[15];
        if (lIllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
        }
        if (lIllllIIlIIl(Bank.contains(item2222222222 -> {
            return item2222222222.getName().toLowerCase().contains(llIllllII[llIllllll[105]]);
        }) ? 1 : 0)) {
        }
        iArr14 = new int[llIllllll[0]];
        iArr14[llIllllll[1]] = llIllllll[30];
        if (lIllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[30], llIllllll[7], C0009j.ch));
        "".length();
        iArr15 = new int[llIllllll[0]];
        iArr15[llIllllll[1]] = llIllllll[12];
        if (lIllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIllllll[12], llIllllll[11], llIllllll[103]));
        "".length();
    }

    private static void lIllllIIIlII() {
        llIllllII = new String[llIllllll[137]];
        llIllllII[llIllllll[1]] = lIlllIlllIII("KicoOwcEKyJyFhk3LzwTTCcyNxkfYmYhAwU6JTodAilmMBUPJWYmG0w/MzcHGA==", "lNFRt");
        llIllllII[llIllllll[0]] = lIlllIlllIII("Ylc1IREpAx89Fw==", "OwvSp");
        llIllllII[llIllllll[4]] = lIlllIlllIIl("6Qs5rTqcdw9XSThPUDjc8Q==", "cnxHw");
        llIllllII[llIllllll[6]] = lIlllIlllIIl("G86XQTDQE+2e1YoOHNJfAA==", "cgbCY");
        llIllllII[llIllllll[7]] = lIlllIlllIIl("YBeEZhSdcEg=", "thuMF");
        llIllllII[llIllllll[8]] = lIlllIlllIIl("8fj6YmJcFF8iv12nMRZSsg==", "nLDIn");
        llIllllII[llIllllll[10]] = lIlllIlllIIl("uUoAjZFgigE+y8zgCzxjIhQ5gd1d88w5", "aOFWi");
        llIllllII[llIllllll[19]] = lIlllIlllIII("HiF6FSYsZDcdJzotNBN0ODE/ByBpNy8EJCUtPwd4aTctHSAqLDMaM2kwNVQWHB0TOhM=", "IDZtT");
        llIllllII[llIllllll[21]] = lIlllIlllIlI("IahmqztsYdAAInXcrMaRnZTna1nR6k+VxXVPjryXvPbGkF0hwFvaQxz73pC3BPPgxxNmksXHT/8=", "MHNBj");
        llIllllII[llIllllll[23]] = lIlllIlllIIl("yLdQcKixnI4=", "XFElk");
        llIllllII[llIllllll[11]] = lIlllIlllIlI("iKiy6byWrns=", "Hlkyu");
        llIllllII[llIllllll[31]] = lIlllIlllIII("HhsDEQk=", "Msbcb");
        llIllllII[llIllllll[29]] = lIlllIlllIII("Jwon", "bkSlc");
        llIllllII[llIllllll[35]] = lIlllIlllIII("JhoFCjs=", "bhldP");
        llIllllII[llIllllll[36]] = lIlllIlllIII("DDgacz4teR8nKzAt", "BYlSJ");
        llIllllII[llIllllll[37]] = lIlllIlllIII("BwAAHhF0BRQJFiA=", "Ttale");
        llIllllII[llIllllll[38]] = lIlllIlllIIl("ExOXnSD0ofk=", "byMbJ");
        llIllllII[llIllllll[41]] = lIlllIlllIII("HC4+ZQY9bzw3Fzc=", "ROHEr");
        llIllllII[llIllllll[42]] = lIlllIlllIlI("5mDpVpSfdQgjzySaen6ucA==", "PEdPm");
        llIllllII[llIllllll[43]] = lIlllIlllIlI("6ek1RyyuYeM=", "TJAlB");
        llIllllII[llIllllll[45]] = lIlllIlllIIl("aNHSu9mHC8E=", "tTulN");
        llIllllII[llIllllll[46]] = lIlllIlllIIl("wG0MCAg7I0E=", "CLNPR");
        llIllllII[llIllllll[47]] = lIlllIlllIIl("R5aIKNSwfHM=", "Uydfl");
        llIllllII[llIllllll[34]] = lIlllIlllIII("BAAJFw0jUgcBEg==", "Frfyw");
        llIllllII[llIllllll[49]] = lIlllIlllIII("FzAsNG0yOiY3", "SBCDM");
        llIllllII[llIllllll[50]] = lIlllIlllIII("MzAlJCgUYisyNw==", "qBJJR");
        llIllllII[llIllllll[51]] = lIlllIlllIIl("uyKBkgFsCvQ=", "LfJti");
        llIllllII[llIllllll[53]] = lIlllIlllIIl("5sayd9oiMdo60ESiVhYJUg==", "fdcYF");
        llIllllII[llIllllll[55]] = lIlllIlllIlI("DIAh5ltL7GxgiqvC3FHy1w==", "VHWjH");
        llIllllII[llIllllll[56]] = lIlllIlllIlI("XFcPqDxKEjxm/L9s/offlg==", "lVrFC");
        llIllllII[llIllllll[48]] = lIlllIlllIlI("TjqNcpWwIkhbiF532So2KQ==", "jYBWm");
        llIllllII[llIllllll[2]] = lIlllIlllIII("KhESKiNJCwYrNQ==", "iysEP");
        llIllllII[llIllllll[57]] = lIlllIlllIII("FxkDKBR0AxcpAg==", "TqbGg");
        llIllllII[llIllllll[59]] = lIlllIlllIII("DR4kHigqTCoINw==", "OlKpR");
        llIllllII[llIllllll[60]] = lIlllIlllIIl("rVSU2iFZ3Gvu1FlzOnr4Xg==", "gwvMn");
        llIllllII[llIllllll[58]] = lIlllIlllIIl("hK4uzh/xWV/BKeNzIusnzp2PZFc1aZ08tk4wyIYKm7M=", "eiOty");
        llIllllII[llIllllll[3]] = lIlllIlllIII("ATI0HCw6dzQZLit7dSdvOjYjC288OCEGJjwwdRogcj88Cip8", "RWUnO");
        llIllllII[llIllllll[61]] = lIlllIlllIlI("1A/wkJotoNI=", "hrThq");
        llIllllII[llIllllll[62]] = lIlllIlllIIl("ob/7MHhiwsZN574dqmmVvg==", "gQTvh");
        llIllllII[llIllllll[63]] = lIlllIlllIlI("/mwf1sgGp0I=", "dgyBF");
        llIllllII[llIllllll[64]] = lIlllIlllIII("ATgMGRRvMAoDGA==", "BTetv");
        llIllllII[llIllllll[65]] = lIlllIlllIIl("lY9IwqQR1jac9kcrUg1xJw==", "IOhws");
        llIllllII[llIllllll[66]] = lIlllIlllIII("HTE2Hx00M2IKDD8=", "ZTBkt");
        llIllllII[llIllllll[67]] = lIlllIlllIIl("osxosH5cDThnOcFZltPgIA==", "uUtLr");
        llIllllII[llIllllll[68]] = lIlllIlllIlI("q3s6j62cD+Jj+3halRyZiw==", "uzgsW");
        llIllllII[llIllllll[5]] = lIlllIlllIIl("T1ZBQa9CCNz1XfotG4nl8g==", "DDWUW");
        llIllllII[llIllllll[69]] = lIlllIlllIIl("cb/PIZrJCIUd7ksDIzKZrA==", "mVAhP");
        llIllllII[llIllllll[70]] = lIlllIlllIlI("98XDnHLckkZ/GXO3zljqtA==", "SmxuF");
        llIllllII[llIllllll[71]] = lIlllIlllIII("BgkSPw==", "RhyZh");
        llIllllII[llIllllll[72]] = lIlllIlllIIl("GYuSWZmmsOvgEp0Jnezahg==", "YNnqF");
        llIllllII[llIllllll[33]] = lIlllIlllIIl("yRnza+2FFdQOLuF9iobOew==", "OmSBC");
        llIllllII[llIllllll[73]] = lIlllIlllIII("OyA4KGEcJyA2", "xHWXA");
        llIllllII[llIllllll[75]] = lIlllIlllIIl("5RlyVu1oy5c=", "XmGKI");
        llIllllII[llIllllll[76]] = lIlllIlllIIl("s3F3i55/ZQ0=", "Mrxgx");
        llIllllII[llIllllll[77]] = lIlllIlllIIl("iAi0/IJvJG7agHLJqTd74g==", "zOygS");
        llIllllII[llIllllll[78]] = lIlllIlllIIl("bGGPyp6f2m0=", "jAGvM");
        llIllllII[llIllllll[79]] = lIlllIlllIlI("vgO9oZMDK0g=", "uYxOv");
        llIllllII[llIllllll[80]] = lIlllIlllIlI("FEexckofwns=", "nvQGS");
        llIllllII[llIllllll[81]] = lIlllIlllIlI("/pHF/LOpO4A=", "EALAC");
        llIllllII[llIllllll[82]] = lIlllIlllIII("Izw/KQA=", "hRVOe");
        llIllllII[llIllllll[83]] = lIlllIlllIlI("lMOGXHJAgZa+GwHhuZZWgw==", "pPxkZ");
        llIllllII[llIllllll[84]] = lIlllIlllIIl("XsKFytxjY4le3lnqLxSrcw==", "edySY");
        llIllllII[llIllllll[85]] = lIlllIlllIIl("MZVc4KHIbnAsbSjGsGLChw==", "iJoPY");
        llIllllII[llIllllll[86]] = lIlllIlllIIl("ke7V2LZaTSgARpXCmHE/8w==", "XNJTZ");
        llIllllII[llIllllll[87]] = lIlllIlllIII("MCUHFD4=", "gLbxZ");
        llIllllII[llIllllll[88]] = lIlllIlllIlI("Z97sindDFqUnhMx6nO6O+A==", "jyeVf");
        llIllllII[llIllllll[89]] = lIlllIlllIlI("IRheXk+LIl04A6GEr33Dvw==", "BsEtW");
        llIllllII[llIllllll[90]] = lIlllIlllIlI("IdW5/LhoCHI=", "dBWuf");
        llIllllII[llIllllll[91]] = lIlllIlllIIl("GRCdSJCo0jY=", "uDYOH");
        llIllllII[llIllllll[105]] = lIlllIlllIlI("QRjomQYVEf/hHY/CARoj3wO/J9BqpP26", "ftyYX");
        llIllllII[llIllllll[52]] = lIlllIlllIlI("GkMB56xcnaw=", "yQAZq");
        llIllllII[llIllllll[106]] = lIlllIlllIII("FSE6CD8q", "ONWjV");
        llIllllII[llIllllll[107]] = lIlllIlllIlI("4UWd6oOSLpg=", "zdNNF");
        llIllllII[llIllllll[108]] = lIlllIlllIlI("lEbJN6FLTLE=", "laBTX");
        llIllllII[llIllllll[109]] = lIlllIlllIlI("ATiE0DgBKxk=", "oeMkO");
        llIllllII[llIllllll[128]] = lIlllIlllIlI("Zjfp9S1RwOYHCC1VWih/Uenptk/2EjZmiff+/S7Lyu+HLdaNfErO1MUAZFkemH39", "WFotH");
        llIllllII[llIllllll[129]] = lIlllIlllIIl("x3wRY/w7eq9eAT+wlS0LdJm3Ns0Hvzmn45V4hj+w6tlObOTiw+z4sWOR7Shprg0USsTwuqoN1p8=", "Vttfu");
        llIllllII[llIllllll[130]] = lIlllIlllIIl("kGgKQwyXpdUYxjyeMP/E51bqYntkl7RVD7+YHJCJ0e1KzOb8Ds55XA==", "ZCBai");
        llIllllII[llIllllll[131]] = lIlllIlllIII("BgV1GzZoEHUaKysHMBxiJwwiUiM9BnULLTpDJR4jIQ08HCVvFzpSJCYNMVIrO1w=", "OcUrB");
        llIllllII[llIllllll[132]] = lIlllIlllIIl("1mEP8aTu3vkTcRDwinky+oWtGZhlcpUkQtrvsvmVhMvFYQEZjwb0/w==", "gYowO");
        llIllllII[llIllllll[133]] = lIlllIlllIII("JgYZeCEBDB14LBpJCDExTgAAeCROGgY9IU4dBj0rUQ==", "ninXE");
        llIllllII[llIllllll[134]] = lIlllIlllIIl("YO1XYcUuAjuRPVXA3nOiVJoP29oGx0BX/tezvXw8tK40HdJBmIF25HXsOdd0k6YU", "UyHqj");
        llIllllII[llIllllll[135]] = lIlllIlllIIl("0hncOOetb+Y=", "cGXPJ");
        llIllllII[llIllllll[136]] = lIlllIlllIIl("baiuqBfT0YI=", "uisjH");
    }

    private static boolean lIllllIIIlll(int i) {
        return i != 0;
    }
}
