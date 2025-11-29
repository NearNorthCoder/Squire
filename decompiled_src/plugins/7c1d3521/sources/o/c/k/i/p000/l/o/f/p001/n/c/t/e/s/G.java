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
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.G  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/G.class */
public class G implements InterfaceC0003ac {
    public static final /* synthetic */ int fJ;
    public static final /* synthetic */ WorldPoint fO;
    private static /* synthetic */ String[] lIllllIIII;
    public static final /* synthetic */ WorldPoint fQ;
    static /* synthetic */ WorldArea fR;
    public static final /* synthetic */ int fK;
    public static final /* synthetic */ WorldPoint fM;
    static /* synthetic */ int dF;
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ WorldPoint fP;
    static /* synthetic */ String[] cE;
    public static final /* synthetic */ int fI;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ boolean dj;
    public static final /* synthetic */ int fH;
    private static /* synthetic */ int[] lIllllIIlI;
    public static final /* synthetic */ WorldPoint fN;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint fL;

    private static boolean lIIlllllIlIIl(Object obj) {
        return obj == null;
    }

    private static String lIIllllIlIllI(String llllllllllllllllllIlllIlllIlIIII, String llllllllllllllllllIlllIlllIIlIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlllIlllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlllIlllIIlllI = new StringBuilder();
        char[] charArray = llllllllllllllllllIlllIlllIIlIlI.toCharArray();
        int llllllllllllllllllIlllIlllIIllII = lIllllIIlI[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllllllIlllIlllIIIlIl = charArray2.length;
        int i = lIllllIIlI[1];
        while (lIIlllllIIIII(i, llllllllllllllllllIlllIlllIIIlIl)) {
            char llllllllllllllllllIlllIlllIIIIll = charArray2[i];
            llllllllllllllllllIlllIlllIIlllI.append((char) (llllllllllllllllllIlllIlllIIIIll ^ charArray[llllllllllllllllllIlllIlllIIllII % charArray.length]));
            "".length();
            llllllllllllllllllIlllIlllIIllII++;
            i++;
            "".length();
            if ("   ".length() == ((45 ^ 113) & ((75 ^ 23) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlllIlllIIlllI);
    }

    private static boolean lIIllllIlllll(int i) {
        return i != 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            cb();
            "".length();
            if ("   ".length() <= 0) {
                return (197 ^ 194) & ((33 ^ 38) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllllIIlI[135];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lIllllIIlI[1];
    }

    private static boolean lIIlllllIlIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlllllIIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlllllIIIlI(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lIllllIIII[lIllllIIlI[178]];
    }

    private static int lIIllllIllllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlllllIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllllIIlll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    private static void cc() {
        if (lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
            AccBuilderSotf.c = lIllllIIII[lIllllIIlI[162]];
            Movement.walkTo(fP);
            "".length();
            Time.sleepTicks(lIllllIIlI[0]);
            "".length();
            if (lIIllllIlllll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIlI[35], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0)) {
                C0018e.c(new WorldPoint(lIllllIIlI[38], lIllllIIlI[39], lIllllIIlI[1]));
                Time.sleepTicks(lIllllIIlI[8]);
                "".length();
            }
            Widget widget = Widgets.get(lIllllIIlI[40], lIllllIIlI[30]);
            if (lIIlllllIIlII(widget)) {
                Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                Time.sleepTicks(lIllllIIlI[11]);
                "".length();
            }
            Widget widget2 = Widgets.get(lIllllIIlI[40], lIllllIIlI[41]);
            if (lIIlllllIIlII(widget2)) {
                Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                Time.sleepTicks(lIllllIIlI[11]);
                "".length();
            }
        }
    }

    private static boolean lIIlllllIIIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c3, code lost:
        if (lIIlllllIIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.G.lIllllIIlI[10]) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[lIllllIIlI[0]];
        iArr3[lIllllIIlI[1]] = lIllllIIlI[20];
        if (lIIlllllIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIIlI[20], lIllllIIlI[0], lIllllIIlI[169]));
            "".length();
        }
        int[] iArr4 = new int[lIllllIIlI[0]];
        iArr4[lIllllIIlI[1]] = lIllllIIlI[18];
        if (lIIlllllIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIIlI[18], lIllllIIlI[0], lIllllIIlI[170]));
            "".length();
        }
        int[] iArr5 = new int[lIllllIIlI[0]];
        iArr5[lIllllIIlI[1]] = lIllllIIlI[14];
        if (lIIlllllIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIIlI[14], lIllllIIlI[10], C0018e.c(lIllllIIlI[171], lIllllIIlI[172])));
            "".length();
        }
        int[] iArr6 = new int[lIllllIIlI[0]];
        iArr6[lIllllIIlI[1]] = lIllllIIlI[16];
        if (lIIlllllIIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIIlI[16], lIllllIIlI[11], lIllllIIlI[173]));
            "".length();
        }
        int[] iArr7 = new int[lIllllIIlI[0]];
        iArr7[lIllllIIlI[1]] = lIllllIIlI[17];
        if (lIIlllllIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIIlI[17], lIllllIIlI[5], C0023j.cf));
            "".length();
        }
        int[] iArr8 = new int[lIllllIIlI[0]];
        iArr8[lIllllIIlI[1]] = lIllllIIlI[9];
        if (lIIllllIlllll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIllllIIlI[0]];
            iArr9[lIllllIIlI[1]] = lIllllIIlI[9];
            if (lIIllllIlllll(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIllllIIlI[0]];
                iArr10[lIllllIIlI[1]] = lIllllIIlI[9];
            }
            iArr = new int[lIllllIIlI[0]];
            iArr[lIllllIIlI[1]] = lIllllIIlI[15];
            if (lIIlllllIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIIlI[15], lIllllIIlI[0], lIllllIIlI[169]));
                "".length();
            }
            if (lIIlllllIIIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIllllIIII[lIllllIIlI[179]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIIlI[175], lIllllIIlI[5], lIllllIIlI[176]));
                "".length();
            }
            iArr2 = new int[lIllllIIlI[0]];
            iArr2[lIllllIIlI[1]] = lIllllIIlI[13];
            if (lIIlllllIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                return;
            }
            bv.add(new C0017d(lIllllIIlI[13], lIllllIIlI[71], lIllllIIlI[177]));
            "".length();
            return;
        }
        bv.add(new C0017d(lIllllIIlI[9], lIllllIIlI[61], lIllllIIlI[174]));
        "".length();
        iArr = new int[lIllllIIlI[0]];
        iArr[lIllllIIlI[1]] = lIllllIIlI[15];
        if (lIIlllllIIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIIlllllIIIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllllIIII[lIllllIIlI[179]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIllllIIlI[0]];
        iArr2[lIllllIIlI[1]] = lIllllIIlI[13];
        if (lIIlllllIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
    }

    private static boolean lIIlllllIIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIIlllllIIIlI(C0018e.j(lIllllIIlI[4]), lIllllIIlI[145])) {
            ?? r0 = lIllllIIlI[0];
            "".length();
            return (((((99 + 43) - 37) + 29) ^ (((109 + 123) - 114) + 26)) & (((16 ^ 46) ^ (134 ^ 174)) ^ (-" ".length()))) < 0 ? ((((127 + 196) - 187) + 69) ^ (((28 + 17) - (-97)) + 33)) & (((65 ^ 60) ^ (127 ^ 96)) ^ (-" ".length())) : r0;
        }
        return lIllllIIlI[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008f, code lost:
        if (lIIllllIlllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ec, code lost:
        if (lIIllllIlllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean cd() {
        String[] strArr = new String[lIllllIIlI[0]];
        strArr[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[163]];
        if (lIIllllIlllll(Inventory.contains(strArr) ? 1 : 0) && lIIllllIlllll(Inventory.contains(C0019f.ba) ? 1 : 0)) {
            int[] iArr = new int[lIllllIIlI[0]];
            iArr[lIllllIIlI[1]] = lIllllIIlI[9];
            if (lIIllllIlllll(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIllllIIlI[0]];
                strArr2[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[164]];
                if (lIIlllllIIIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIllllIIlI[0]];
                    strArr3[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[165]];
                }
                String[] strArr4 = new String[lIllllIIlI[0]];
                strArr4[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[166]];
                if (lIIllllIlllll(Inventory.contains(strArr4) ? 1 : 0)) {
                    int[] iArr2 = new int[lIllllIIlI[0]];
                    iArr2[lIllllIIlI[1]] = lIllllIIlI[19];
                    if (lIIlllllIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIllllIIlI[0]];
                        iArr3[lIllllIIlI[1]] = lIllllIIlI[19];
                    }
                    ?? r0 = lIllllIIlI[0];
                    "".length();
                    return "  ".length() < ((198 ^ 145) & ((30 ^ 73) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIllllIIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[lIllllIIlI[0]];
        strArr[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[167]];
        if (lIIlllllIIlIl(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[lIllllIIlI[0]];
            strArr2[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[168]];
            if (lIIlllllIIlIl(Inventory.getCount(strArr2))) {
                ?? r0 = lIllllIIlI[0];
                "".length();
                return "   ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIllllIIlI[1];
    }

    private static void lIIllllIlllIl() {
        lIllllIIlI = new int[212];
        lIllllIIlI[0] = " ".length();
        lIllllIIlI[1] = ((114 ^ 46) ^ (77 ^ 22)) & (((((133 + 36) - 141) + 120) ^ (((119 + 0) - 47) + 75)) ^ (-" ".length()));
        lIllllIIlI[2] = (-((-25147) & 30267)) & (-25217) & 30638;
        lIllllIIlI[3] = (43 ^ 120) ^ (246 ^ 153);
        lIllllIIlI[4] = (-((-2089) & 28265)) & (-4233) & 30715;
        lIllllIIlI[5] = 178 ^ 183;
        lIllllIIlI[6] = (-16504) & 21503;
        lIllllIIlI[7] = "  ".length();
        lIllllIIlI[8] = (((28 + 141) - 136) + 110) ^ (((124 + 54) - 89) + 50);
        lIllllIIlI[9] = (-((-513) & 13829)) & (-19073) & 32767;
        lIllllIIlI[10] = (((127 + 163) - 142) + 17) ^ (((5 + 75) - 77) + 172);
        lIllllIIlI[11] = "   ".length();
        lIllllIIlI[12] = (161 ^ 183) ^ (190 ^ 174);
        lIllllIIlI[13] = (-((-1797) & 18357)) & (-8201) & 32767;
        lIllllIIlI[14] = (-12629) & 32247;
        lIllllIIlI[15] = (-((-3331) & 23911)) & (-8203) & 31743;
        lIllllIIlI[16] = (-((-15330) & 32743)) & (-4129) & 24511;
        lIllllIIlI[17] = (-16905) & 29529;
        lIllllIIlI[18] = (-13901) & 16334;
        lIllllIIlI[19] = (-((-12349) & 29119)) & (-8262) & 25583;
        lIllllIIlI[20] = (-20621) & 21951;
        lIllllIIlI[21] = (17 ^ 78) ^ (110 ^ 54);
        lIllllIIlI[22] = (((94 + 48) - 20) + 59) ^ (((34 + 79) - 93) + 115);
        lIllllIIlI[23] = (-4632) & 8063;
        lIllllIIlI[24] = (-"  ".length()) & (-4119) & 7575;
        lIllllIIlI[25] = (-16903) & 20335;
        lIllllIIlI[26] = (-25218) & 28651;
        lIllllIIlI[27] = (-((-1009) & 29681)) & (-645) & 32751;
        lIllllIIlI[28] = (160 ^ 199) ^ (254 ^ 145);
        lIllllIIlI[29] = (27 ^ 113) ^ (222 ^ 187);
        lIllllIIlI[30] = (((24 + 53) - 67) + 148) ^ (((73 + 100) - 66) + 31);
        lIllllIIlI[31] = ((45 + 109) - 136) + 122;
        lIllllIIlI[32] = (((134 + 164) - 126) + 19) ^ (((92 + 169) - 213) + 134);
        lIllllIIlI[33] = -" ".length();
        lIllllIIlI[34] = 24 ^ 19;
        lIllllIIlI[35] = (-25225) & 28668;
        lIllllIIlI[36] = (-16491) & 19947;
        lIllllIIlI[37] = (-((-18483) & 27191)) & (-9) & 12159;
        lIllllIIlI[38] = (-((-11523) & 32515)) & (-8211) & 32639;
        lIllllIIlI[39] = (-((-3087) & 32399)) & (-1) & 32765;
        lIllllIIlI[40] = (-12571) & 13150;
        lIllllIIlI[41] = 148 ^ 133;
        lIllllIIlI[42] = (-((-10470) & 31479)) & (-8323) & 32759;
        lIllllIIlI[43] = (-24793) & 28123;
        lIllllIIlI[44] = (-((-16713) & 25423)) & (-129) & 12279;
        lIllllIIlI[45] = (-((-311) & 29495)) & (-1) & 32511;
        lIllllIIlI[46] = 32 ^ 44;
        lIllllIIlI[47] = (95 ^ 43) ^ (70 ^ 63);
        lIllllIIlI[48] = 104 ^ 102;
        lIllllIIlI[49] = (184 ^ 163) ^ (206 ^ 197);
        lIllllIIlI[50] = 134 ^ 148;
        lIllllIIlI[51] = 121 ^ 106;
        lIllllIIlI[52] = 61 ^ 40;
        lIllllIIlI[53] = (123 ^ 72) ^ (55 ^ 18);
        lIllllIIlI[54] = (227 ^ 180) ^ (201 ^ 137);
        lIllllIIlI[55] = (174 ^ 144) ^ (10 ^ 44);
        lIllllIIlI[56] = (210 ^ 138) ^ (21 ^ 84);
        lIllllIIlI[57] = (((30 + 66) - 2) + 92) ^ (((28 + 78) - 101) + 155);
        lIllllIIlI[58] = 158 ^ 133;
        lIllllIIlI[59] = 122 ^ 102;
        lIllllIIlI[60] = (238 ^ 158) ^ (15 ^ 98);
        lIllllIIlI[61] = (((5 + 161) - 41) + 66) ^ (((119 + 135) - 206) + 113);
        lIllllIIlI[62] = (((143 + 68) - 103) + 82) ^ (((56 + 94) - 131) + 142);
        lIllllIIlI[63] = (158 ^ 192) ^ (58 ^ 68);
        lIllllIIlI[64] = 58 ^ 27;
        lIllllIIlI[65] = (((15 + 72) - 62) + 114) ^ (((110 + 120) - 99) + 38);
        lIllllIIlI[66] = (((56 + 102) - 68) + 50) ^ (((116 + 111) - 176) + 124);
        lIllllIIlI[67] = (((85 + 15) - (-34)) + 16) ^ (((56 + 96) - 66) + 92);
        lIllllIIlI[68] = (54 ^ 97) ^ (181 ^ 199);
        lIllllIIlI[69] = 131 ^ 165;
        lIllllIIlI[70] = (((113 + 133) - 166) + 79) ^ (((45 + 83) - 12) + 68);
        lIllllIIlI[71] = (103 ^ 20) ^ (73 ^ 18);
        lIllllIIlI[72] = 97 ^ 72;
        lIllllIIlI[73] = 159 ^ 181;
        lIllllIIlI[74] = (122 ^ 71) ^ (20 ^ 2);
        lIllllIIlI[75] = 107 ^ 71;
        lIllllIIlI[76] = (71 ^ 91) ^ (138 ^ 187);
        lIllllIIlI[77] = (187 ^ 156) ^ (137 ^ 128);
        lIllllIIlI[78] = 34 ^ 13;
        lIllllIIlI[79] = 102 ^ 86;
        lIllllIIlI[80] = 246 ^ 199;
        lIllllIIlI[81] = (((52 + 48) - 35) + 77) ^ (((88 + 128) - 168) + 141);
        lIllllIIlI[82] = (((77 + 41) - 108) + 126) ^ (((89 + 177) - 137) + 59);
        lIllllIIlI[83] = (((46 + 139) - 50) + 14) ^ (((109 + 19) - (-12)) + 20);
        lIllllIIlI[84] = (98 ^ 55) ^ (74 ^ 41);
        lIllllIIlI[85] = (42 ^ 15) ^ (165 ^ 183);
        lIllllIIlI[86] = 94 ^ 102;
        lIllllIIlI[87] = 157 ^ 164;
        lIllllIIlI[88] = 38 ^ 28;
        lIllllIIlI[89] = 37 ^ 30;
        lIllllIIlI[90] = (-((-16916) & 30331)) & (-1) & 16383;
        lIllllIIlI[91] = (120 ^ 30) ^ (84 ^ 15);
        lIllllIIlI[92] = (245 ^ 183) ^ (2 ^ 126);
        lIllllIIlI[93] = 84 ^ 107;
        lIllllIIlI[94] = " ".length() ^ (13 ^ 76);
        lIllllIIlI[95] = 53 ^ 116;
        lIllllIIlI[96] = 82 ^ 16;
        lIllllIIlI[97] = (((245 + 31) - 60) + 37) ^ (((110 + 170) - 146) + 56);
        lIllllIIlI[98] = (((127 + 135) - 156) + 126) ^ (((80 + 41) - (-4)) + 47);
        lIllllIIlI[99] = (((195 + 98) - 236) + 159) ^ (((31 + 14) - (-18)) + 94);
        lIllllIIlI[100] = 26 ^ 92;
        lIllllIIlI[101] = (212 ^ 164) ^ (38 ^ 17);
        lIllllIIlI[102] = (((3 + 68) - (-163)) + 1) ^ (((43 + 106) - 42) + 56);
        lIllllIIlI[103] = (77 ^ 31) ^ (58 ^ 33);
        lIllllIIlI[104] = 62 ^ 116;
        lIllllIIlI[105] = (-((-23559) & 24095)) & (-12289) & 16351;
        lIllllIIlI[106] = (166 ^ 163) ^ (137 ^ 199);
        lIllllIIlI[107] = 121 ^ 53;
        lIllllIIlI[108] = (-((-6225) & 23123)) & (-12341) & 32767;
        lIllllIIlI[109] = (26 ^ 89) ^ (63 ^ 49);
        lIllllIIlI[110] = 96 ^ 46;
        lIllllIIlI[111] = (-12305) & 15832;
        lIllllIIlI[112] = 55 ^ 120;
        lIllllIIlI[113] = (252 ^ 162) ^ (84 ^ 90);
        lIllllIIlI[114] = (((100 + 58) - (-29)) + 57) ^ (((57 + 104) - 69) + 73);
        lIllllIIlI[115] = (30 ^ 3) ^ (85 ^ 26);
        lIllllIIlI[116] = 227 ^ 176;
        lIllllIIlI[117] = (-((-6442) & 15167)) & (-16425) & 28669;
        lIllllIIlI[118] = (((106 + 206) - 175) + 78) ^ (((55 + 15) - (-48)) + 13);
        lIllllIIlI[119] = (59 ^ 113) ^ (112 ^ 111);
        lIllllIIlI[120] = (101 ^ 69) ^ (111 ^ 25);
        lIllllIIlI[121] = 87 ^ 0;
        lIllllIIlI[122] = (48 ^ 125) ^ (86 ^ 67);
        lIllllIIlI[123] = (111 ^ 7) ^ (102 ^ 87);
        lIllllIIlI[124] = 93 ^ 7;
        lIllllIIlI[125] = (175 ^ 179) ^ (212 ^ 147);
        lIllllIIlI[126] = (103 ^ 56) ^ "   ".length();
        lIllllIIlI[127] = 97 ^ 60;
        lIllllIIlI[128] = (128 ^ 185) ^ (248 ^ 159);
        lIllllIIlI[129] = (4 ^ 109) ^ (28 ^ 42);
        lIllllIIlI[130] = (56 ^ 4) ^ (49 ^ 109);
        lIllllIIlI[131] = (38 ^ 94) ^ (36 ^ 61);
        lIllllIIlI[132] = 80 ^ 50;
        lIllllIIlI[133] = 208 ^ 179;
        lIllllIIlI[134] = (-25645) & 28607;
        lIllllIIlI[135] = (48 ^ 29) ^ (204 ^ 133);
        lIllllIIlI[136] = (95 ^ 106) ^ (211 ^ 131);
        lIllllIIlI[137] = 111 ^ 9;
        lIllllIIlI[138] = 46 ^ 73;
        lIllllIIlI[139] = (176 ^ 190) ^ (34 ^ 68);
        lIllllIIlI[140] = (52 ^ 113) ^ (17 ^ 61);
        lIllllIIlI[141] = 226 ^ 136;
        lIllllIIlI[142] = (223 ^ 192) ^ (71 ^ 51);
        lIllllIIlI[143] = (((134 + 130) - 69) + 36) ^ (((105 + 68) - 41) + 7);
        lIllllIIlI[144] = (77 ^ 83) ^ (213 ^ 166);
        lIllllIIlI[145] = (140 ^ 190) ^ (249 ^ 165);
        lIllllIIlI[146] = (224 ^ 162) ^ (134 ^ 171);
        lIllllIIlI[147] = 229 ^ 149;
        lIllllIIlI[148] = 66 ^ 51;
        lIllllIIlI[149] = (61 ^ 9) ^ (40 ^ 110);
        lIllllIIlI[150] = (91 ^ 121) ^ (115 ^ 34);
        lIllllIIlI[151] = (((41 + 141) - 13) + 26) ^ (((137 + 158) - 237) + 125);
        lIllllIIlI[152] = (((93 + 81) - (-41)) + 23) ^ (((56 + 108) - 19) + 10);
        lIllllIIlI[153] = 104 ^ 30;
        lIllllIIlI[154] = (112 ^ 116) ^ (180 ^ 199);
        lIllllIIlI[155] = 106 ^ 18;
        lIllllIIlI[156] = (164 ^ 148) ^ (107 ^ 34);
        lIllllIIlI[157] = 9 ^ 115;
        lIllllIIlI[158] = (25 ^ 84) ^ (68 ^ 114);
        lIllllIIlI[159] = (((56 + 36) - (-20)) + 106) ^ (((44 + 132) - 52) + 42);
        lIllllIIlI[160] = (24 ^ 40) ^ (208 ^ 157);
        lIllllIIlI[161] = 61 ^ 67;
        lIllllIIlI[162] = (((77 ^ 55) + (200 ^ 173)) - (((37 + 140) - 104) + 93)) + (12 ^ 74);
        lIllllIIlI[163] = ((108 + 19) - 82) + 83;
        lIllllIIlI[164] = ((41 + 50) - (-23)) + 15;
        lIllllIIlI[165] = ((18 + 94) - 10) + 28;
        lIllllIIlI[166] = ((94 + 87) - 141) + 91;
        lIllllIIlI[167] = ((93 + 34) - 7) + 12;
        lIllllIIlI[168] = ((82 + 8) - 11) + 54;
        lIllllIIlI[169] = (-((-25101) & 30431)) & (-6) & 14335;
        lIllllIIlI[170] = (-((-3599) & 3951)) & (-17413) & 32764;
        lIllllIIlI[171] = (-26146) & 32445;
        lIllllIIlI[172] = (-((-550) & 9197)) & (-1) & 15847;
        lIllllIIlI[173] = (-((-16885) & 27132)) & (-4097) & 15343;
        lIllllIIlI[174] = (-30274) & 30573;
        lIllllIIlI[175] = (-((-11594) & 15693)) & (-305) & 16383;
        lIllllIIlI[176] = (-584) & 25583;
        lIllllIIlI[177] = (-2092) & 2991;
        lIllllIIlI[178] = (((137 ^ 193) + (107 ^ 11)) - (29 ^ 95)) + (29 ^ 61);
        lIllllIIlI[179] = (((((126 + 26) - 68) + 43) + (244 ^ 191)) - (108 ^ 24)) + (165 ^ 148);
        lIllllIIlI[180] = (((230 ^ 173) + (203 ^ 199)) - (101 ^ 82)) + (174 ^ 198);
        lIllllIIlI[181] = (((224 ^ 194) + (239 ^ 140)) - (126 ^ 91)) + (98 ^ 75);
        lIllllIIlI[182] = (-14401) & 15227;
        lIllllIIlI[183] = (-((-3741) & 24318)) & (-3) & 24039;
        lIllllIIlI[184] = (-12811) & 16250;
        lIllllIIlI[185] = (-((-7582) & 32671)) & (-4353) & 32767;
        lIllllIIlI[186] = (-8835) & 12255;
        lIllllIIlI[187] = (-((-18881) & 23505)) & (-16385) & 24447;
        lIllllIIlI[188] = (-487) & 10223;
        lIllllIIlI[189] = (-((-3289) & 32476)) & (-177) & 32699;
        lIllllIIlI[190] = (-((-3361) & 7545)) & (-2049) & 16127;
        lIllllIIlI[191] = (-16393) & 19951;
        lIllllIIlI[192] = ((41 + 48) - 41) + 90;
        lIllllIIlI[193] = ((131 + 4) - 100) + 104;
        lIllllIIlI[194] = (((249 ^ 197) + (((120 + 81) - 196) + 129)) - (58 ^ 123)) + (166 ^ 170);
        lIllllIIlI[195] = ((89 + 28) - 85) + 110;
        lIllllIIlI[196] = (((35 ^ 9) + (235 ^ 178)) - (75 ^ 45)) + (226 ^ 144);
        lIllllIIlI[197] = ((64 + 86) - 77) + 71;
        lIllllIIlI[198] = (((235 ^ 168) + (26 ^ 124)) - (245 ^ 174)) + (109 ^ 46);
        lIllllIIlI[199] = ((129 + 125) - 238) + 130;
        lIllllIIlI[200] = ((23 + 104) - (-1)) + 19;
        lIllllIIlI[201] = ((85 + 128) - 166) + 101;
        lIllllIIlI[202] = (((172 ^ 191) + (((120 + 58) - 165) + 114)) - (-" ".length())) + "  ".length();
        lIllllIIlI[203] = (((((92 + 48) - 57) + 52) + (51 ^ 90)) - (((77 + 31) - 14) + 114)) + (30 ^ 104);
        lIllllIIlI[204] = ((82 + 45) - 95) + 119;
        lIllllIIlI[205] = (((88 ^ 0) + (125 ^ 74)) - (11 ^ 111)) + (241 ^ 156);
        lIllllIIlI[206] = (((220 ^ 176) + (166 ^ 186)) - (65 ^ 57)) + ((69 + 117) - 174) + 125;
        lIllllIIlI[207] = (((((46 + 113) - 31) + 19) + (80 ^ 10)) - (((6 + 111) - 64) + 96)) + (5 ^ 71);
        lIllllIIlI[208] = ((110 + 7) - 89) + 127;
        lIllllIIlI[209] = (((((59 + 117) - 110) + 67) + (238 ^ 170)) - (((19 + 0) - (-87)) + 94)) + ((85 + 3) - (-60)) + 7;
        lIllllIIlI[210] = ((107 + 36) - 103) + 117;
        lIllllIIlI[211] = ((135 + 9) - (-12)) + 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1076, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1085, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v149, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v196, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v222, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v224, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v352, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v354, types: [boolean] */
    public static void cb() {
        if (lIIllllIlllll(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIIlllllIIIII(bv.size(), lIllllIIlI[0])) {
                System.out.println(lIllllIIII[lIllllIIlI[1]]);
                bt = lIllllIIlI[1];
            }
        }
        if (lIIlllllIIIIl(bt ? 1 : 0)) {
            if (!lIIlllllIIIlI(C0018e.j(lIllllIIlI[2]), lIllllIIlI[3]) || lIIlllllIIIII(C0018e.j(lIllllIIlI[4]), lIllllIIlI[5])) {
                H.cf();
            }
            if (lIIlllllIIIIl(cd() ? 1 : 0) && lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[5]) && lIIlllllIIIlI(C0018e.j(lIllllIIlI[2]), lIllllIIlI[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlllllIIlII(nearest) && lIIlllllIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[0]];
                    C0000a.a(nearest);
                }
                if (lIIlllllIIlII(nearest) && lIIllllIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlllllIIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllllIIlI[6]);
                        "".length();
                    }
                    if (lIIllllIlllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[7]];
                        if (lIIlllllIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllllIIlI[8]);
                            "".length();
                        }
                        if (lIIlllllIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllllIIlI[7]);
                            "".length();
                        }
                        int[] iArr = new int[lIllllIIlI[0]];
                        iArr[lIllllIIlI[1]] = lIllllIIlI[9];
                        if (lIIllllIlllll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIllllIIlI[0]];
                            iArr2[lIllllIIlI[1]] = lIllllIIlI[9];
                            if (lIIlllllIIIII(Bank.getFirst(iArr2).getQuantity(), lIllllIIlI[10])) {
                                Q();
                                System.out.println(lIllllIIII[lIllllIIlI[11]]);
                                bt = lIllllIIlI[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIllllIIlI[12]];
                        iArr3[lIllllIIlI[1]] = lIllllIIlI[13];
                        iArr3[lIllllIIlI[0]] = lIllllIIlI[14];
                        iArr3[lIllllIIlI[7]] = lIllllIIlI[15];
                        iArr3[lIllllIIlI[11]] = lIllllIIlI[16];
                        iArr3[lIllllIIlI[8]] = lIllllIIlI[9];
                        iArr3[lIllllIIlI[5]] = lIllllIIlI[17];
                        if (lIIlllllIIIIl(C0018e.c(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(lIllllIIII[lIllllIIlI[8]]);
                            bt = lIllllIIlI[0];
                            return;
                        }
                        int[] iArr4 = new int[lIllllIIlI[12]];
                        iArr4[lIllllIIlI[1]] = lIllllIIlI[13];
                        iArr4[lIllllIIlI[0]] = lIllllIIlI[14];
                        iArr4[lIllllIIlI[7]] = lIllllIIlI[15];
                        iArr4[lIllllIIlI[11]] = lIllllIIlI[16];
                        iArr4[lIllllIIlI[8]] = lIllllIIlI[9];
                        iArr4[lIllllIIlI[5]] = lIllllIIlI[17];
                        if (lIIllllIlllll(C0018e.c(iArr4) ? 1 : 0)) {
                            C0000a.a(lIllllIIlI[18], lIllllIIlI[7]);
                            C0000a.a(lIllllIIlI[19], lIllllIIlI[0]);
                            C0000a.a(lIllllIIlI[20], lIllllIIlI[0]);
                            C0000a.a(lIllllIIlI[13], lIllllIIlI[10]);
                            C0000a.a(lIllllIIlI[14], lIllllIIlI[10]);
                            C0000a.a(lIllllIIlI[15], lIllllIIlI[0]);
                            C0000a.a(lIllllIIlI[16], lIllllIIlI[11]);
                            C0000a.a(lIllllIIlI[17], lIllllIIlI[8]);
                            C0000a.a(lIllllIIlI[9], lIllllIIlI[21]);
                        }
                    }
                }
            }
            if (lIIllllIlllll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIIlllllIIIII(Movement.getRunEnergy(), lIllllIIlI[22])) {
                Inventory.getFirst(C0019f.ba).interact(lIllllIIII[lIllllIIlI[5]]);
                Time.sleepTicks(lIllllIIlI[0]);
                "".length();
            }
            int[] iArr5 = new int[lIllllIIlI[0]];
            iArr5[lIllllIIlI[1]] = lIllllIIlI[9];
            if (lIIllllIlllll(Inventory.contains(iArr5) ? 1 : 0) && lIIlllllIIllI(lIIllllIllllI(C0018e.w(), 60.0d))) {
                int[] iArr6 = new int[lIllllIIlI[0]];
                iArr6[lIllllIIlI[1]] = lIllllIIlI[9];
                Inventory.getFirst(iArr6).interact(lIllllIIII[lIllllIIlI[12]]);
                Time.sleepTicks(lIllllIIlI[0]);
                "".length();
            }
            WorldPoint worldPoint = new WorldPoint(lIllllIIlI[23], lIllllIIlI[24], lIllllIIlI[1]);
            WorldPoint worldPoint2 = new WorldPoint(lIllllIIlI[25], lIllllIIlI[24], lIllllIIlI[1]);
            WorldPoint worldPoint3 = new WorldPoint(lIllllIIlI[26], lIllllIIlI[24], lIllllIIlI[1]);
            WorldPoint worldPoint4 = new WorldPoint(lIllllIIlI[27], lIllllIIlI[24], lIllllIIlI[1]);
            if (!lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) || !lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lIIllllIlllll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                String[] strArr = new String[lIllllIIlI[0]];
                strArr[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[21]];
                TileObjects.getNearest(strArr).interact(lIllllIIII[lIllllIIlI[28]]);
                Time.sleepTicks(lIllllIIlI[29]);
                "".length();
            }
            if (lIIlllllIIIlI(C0018e.j(lIllllIIlI[4]), lIllllIIlI[5]) && lIIlllllIIIII(C0018e.j(lIllllIIlI[4]), lIllllIIlI[30]) && lIIllllIlllll(cd() ? 1 : 0)) {
                if (lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fL), lIllllIIlI[31])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[32]];
                    int[] iArr7 = new int[lIllllIIlI[0]];
                    iArr7[lIllllIIlI[1]] = lIllllIIlI[14];
                    if (lIIllllIlllll(Inventory.contains(iArr7) ? 1 : 0) && lIIlllllIIIll(Players.getLocal().getAnimation(), lIllllIIlI[33])) {
                        int[] iArr8 = new int[lIllllIIlI[0]];
                        iArr8[lIllllIIlI[1]] = lIllllIIlI[14];
                        Inventory.getFirst(iArr8).interact(lIllllIIII[lIllllIIlI[10]]);
                        Time.sleepTicks(lIllllIIlI[7]);
                        "".length();
                    }
                }
                if (lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fL), lIllllIIlI[31])) {
                    if (lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[34]];
                        if (lIIllllIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (!lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIlI[35], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0) || lIIllllIlllll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIlI[37], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0)) {
                            C0018e.c(new WorldPoint(lIllllIIlI[38], lIllllIIlI[39], lIllllIIlI[1]));
                            Time.sleepTicks(lIllllIIlI[8]);
                            "".length();
                        }
                        Widget widget = Widgets.get(lIllllIIlI[40], lIllllIIlI[30]);
                        if (lIIlllllIIlII(widget)) {
                            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                            Time.sleepTicks(lIllllIIlI[11]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(lIllllIIlI[40], lIllllIIlI[41]);
                        if (lIIlllllIIlII(widget2)) {
                            Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                            Time.sleepTicks(lIllllIIlI[11]);
                            "".length();
                        }
                        if (lIIllllIlllll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIlI[42], lIllllIIlI[43], lIllllIIlI[1])) ? 1 : 0)) {
                            C0018e.c(new WorldPoint(lIllllIIlI[44], lIllllIIlI[45], lIllllIIlI[1]));
                            Time.sleepTicks(C0018e.c(lIllllIIlI[5], lIllllIIlI[28]));
                            "".length();
                        }
                        if (lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIlI[35], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0) && lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIlI[37], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0)) {
                            Movement.walkTo(fP);
                            "".length();
                            Time.sleepTicks(lIllllIIlI[0]);
                            "".length();
                        }
                    }
                    if (lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                        C0018e.l(lIllllIIlI[19]);
                        String[] strArr2 = new String[lIllllIIlI[0]];
                        strArr2[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[46]];
                        if (lIIlllllIIIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIIII[lIllllIIlI[47]];
                            String[] strArr3 = new String[lIllllIIlI[0]];
                            strArr3[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[48]];
                            TileItem nearest2 = TileItems.getNearest(strArr3);
                            if (lIIlllllIIlII(nearest2)) {
                                String[] strArr4 = new String[lIllllIIlI[0]];
                                strArr4[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[29]];
                                if (lIIlllllIlIIl(TileItems.getNearest(strArr4))) {
                                    nearest2.interact(lIllllIIII[lIllllIIlI[49]]);
                                    Time.sleepTicks(lIllllIIlI[7]);
                                    "".length();
                                }
                            }
                            String[] strArr5 = new String[lIllllIIlI[0]];
                            strArr5[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[41]];
                            TileItem nearest3 = TileItems.getNearest(strArr5);
                            if (lIIlllllIIlII(nearest3)) {
                                nearest3.interact(lIllllIIII[lIllllIIlI[50]]);
                                Time.sleepTicks(lIllllIIlI[0]);
                                "".length();
                            }
                        }
                        String[] strArr6 = new String[lIllllIIlI[0]];
                        strArr6[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[51]];
                        if (lIIllllIlllll(Inventory.contains(strArr6) ? 1 : 0)) {
                            String[] strArr7 = new String[lIllllIIlI[0]];
                            strArr7[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[30]];
                            if (lIIlllllIIIIl(Inventory.contains(strArr7) ? 1 : 0)) {
                                String[] strArr8 = new String[lIllllIIlI[0]];
                                strArr8[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[52]];
                                TileObjects.getNearest(strArr8).interact(lIllllIIII[lIllllIIlI[53]]);
                                Time.sleepTicks(lIllllIIlI[7]);
                                "".length();
                            }
                        }
                        String[] strArr9 = new String[lIllllIIlI[0]];
                        strArr9[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[54]];
                        if (lIIlllllIlIIl(NPCs.getNearest(strArr9))) {
                            String[] strArr10 = new String[lIllllIIlI[0]];
                            strArr10[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[55]];
                            TileObjects.getNearest(strArr10).interact(lIllllIIII[lIllllIIlI[56]]);
                            Time.sleepTicks(lIllllIIlI[8]);
                            "".length();
                        }
                        String[] strArr11 = new String[lIllllIIlI[0]];
                        strArr11[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[57]];
                        if (lIIlllllIIlII(NPCs.getNearest(strArr11))) {
                            C0020g.a(lIllllIIII[lIllllIIlI[58]], cE);
                        }
                    }
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[30])) {
                di = lIllllIIlI[1];
                String[] strArr12 = new String[lIllllIIlI[0]];
                strArr12[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[59]];
                if (lIIllllIlllll(Inventory.contains(strArr12) ? 1 : 0)) {
                    String[] strArr13 = new String[lIllllIIlI[0]];
                    strArr13[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[60]];
                    if (lIIllllIlllll(Inventory.contains(strArr13) ? 1 : 0)) {
                        int[] iArr9 = new int[lIllllIIlI[0]];
                        iArr9[lIllllIIlI[1]] = lIllllIIlI[19];
                        if (lIIllllIlllll(Inventory.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIllllIIlI[0]];
                            iArr10[lIllllIIlI[1]] = lIllllIIlI[19];
                            if (lIIlllllIIIIl(Equipment.contains(iArr10) ? 1 : 0)) {
                                int[] iArr11 = new int[lIllllIIlI[0]];
                                iArr11[lIllllIIlI[1]] = lIllllIIlI[19];
                                Inventory.getFirst(iArr11).interact(lIllllIIII[lIllllIIlI[61]]);
                            }
                        }
                        String[] strArr14 = new String[lIllllIIlI[0]];
                        strArr14[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[62]];
                        if (lIIlllllIlIIl(NPCs.getNearest(strArr14))) {
                            String[] strArr15 = new String[lIllllIIlI[0]];
                            strArr15[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[63]];
                            TileObjects.getNearest(strArr15).interact(lIllllIIII[lIllllIIlI[64]]);
                            Time.sleepTicks(lIllllIIlI[8]);
                            "".length();
                        }
                        String[] strArr16 = new String[lIllllIIlI[0]];
                        strArr16[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[65]];
                        if (lIIlllllIIlII(NPCs.getNearest(strArr16))) {
                            if (lIIlllllIIIII(dF, lIllllIIlI[0])) {
                                String[] strArr17 = new String[lIllllIIlI[0]];
                                strArr17[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[66]];
                                Item first = Inventory.getFirst(strArr17);
                                String[] strArr18 = new String[lIllllIIlI[0]];
                                strArr18[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[67]];
                                first.useOn(NPCs.getNearest(strArr18));
                                Time.sleepTicks(lIllllIIlI[11]);
                                "".length();
                                dF += lIllllIIlI[0];
                            }
                            if (lIIlllllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr19 = new String[lIllllIIlI[0]];
                                strArr19[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[68]];
                                Item first2 = Inventory.getFirst(strArr19);
                                String[] strArr20 = new String[lIllllIIlI[0]];
                                strArr20[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[69]];
                                first2.useOn(NPCs.getNearest(strArr20));
                                Time.sleepTicks(lIllllIIlI[11]);
                                "".length();
                            }
                            C0020g.a(cE);
                        }
                    }
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[56])) {
                String[] strArr21 = new String[lIllllIIlI[0]];
                strArr21[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[70]];
                if (lIIlllllIlIIl(NPCs.getNearest(strArr21))) {
                    String[] strArr22 = new String[lIllllIIlI[0]];
                    strArr22[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[71]];
                    TileObjects.getNearest(strArr22).interact(lIllllIIII[lIllllIIlI[72]]);
                    Time.sleepTicks(lIllllIIlI[8]);
                    "".length();
                }
                if (lIIlllllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr23 = new String[lIllllIIlI[0]];
                    strArr23[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[73]];
                    Item first3 = Inventory.getFirst(strArr23);
                    String[] strArr24 = new String[lIllllIIlI[0]];
                    strArr24[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[74]];
                    first3.useOn(NPCs.getNearest(strArr24));
                }
                C0020g.a(cE);
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[61])) {
                String[] strArr25 = new String[lIllllIIlI[0]];
                strArr25[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[75]];
                if (lIIlllllIlIIl(NPCs.getNearest(strArr25))) {
                    String[] strArr26 = new String[lIllllIIlI[0]];
                    strArr26[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[76]];
                    TileObjects.getNearest(strArr26).interact(lIllllIIII[lIllllIIlI[77]]);
                    Time.sleepTicks(lIllllIIlI[8]);
                    "".length();
                }
                String[] strArr27 = new String[lIllllIIlI[0]];
                strArr27[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[78]];
                if (lIIlllllIIlII(NPCs.getNearest(strArr27))) {
                    C0020g.a(lIllllIIII[lIllllIIlI[79]], cE);
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[66])) {
                if (lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[12])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[80]];
                    int[] iArr12 = new int[lIllllIIlI[0]];
                    iArr12[lIllllIIlI[1]] = lIllllIIlI[14];
                    if (lIIllllIlllll(Inventory.contains(iArr12) ? 1 : 0) && lIIlllllIIIll(Players.getLocal().getAnimation(), lIllllIIlI[33])) {
                        int[] iArr13 = new int[lIllllIIlI[0]];
                        iArr13[lIllllIIlI[1]] = lIllllIIlI[14];
                        Inventory.getFirst(iArr13).interact(lIllllIIII[lIllllIIlI[22]]);
                        Time.sleepTicks(lIllllIIlI[7]);
                        "".length();
                    }
                }
                if (lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[12]) && lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[12])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[81]];
                    Movement.walkTo(fQ);
                    "".length();
                    Time.sleepTicks(lIllllIIlI[0]);
                    "".length();
                }
                String[] strArr28 = new String[lIllllIIlI[0]];
                strArr28[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[82]];
                if (lIIlllllIIlII(TileObjects.getNearest(strArr28))) {
                    String[] strArr29 = new String[lIllllIIlI[0]];
                    strArr29[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[83]];
                    TileObjects.getNearest(strArr29).interact(lIllllIIII[lIllllIIlI[84]]);
                    Time.sleepTicks(lIllllIIlI[11]);
                    "".length();
                }
                if (lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[29])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[85]];
                    C0020g.a(lIllllIIII[lIllllIIlI[86]], cE);
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[71])) {
                if (lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[12])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[87]];
                    int[] iArr14 = new int[lIllllIIlI[0]];
                    iArr14[lIllllIIlI[1]] = lIllllIIlI[14];
                    if (lIIllllIlllll(Inventory.contains(iArr14) ? 1 : 0) && lIIlllllIIIll(Players.getLocal().getAnimation(), lIllllIIlI[33])) {
                        int[] iArr15 = new int[lIllllIIlI[0]];
                        iArr15[lIllllIIlI[1]] = lIllllIIlI[14];
                        Inventory.getFirst(iArr15).interact(lIllllIIII[lIllllIIlI[88]]);
                        Time.sleepTicks(lIllllIIlI[7]);
                        "".length();
                    }
                }
                if (lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(fN) ? 1 : 0) && lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[12])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[89]];
                    Movement.walkTo(fN);
                    "".length();
                    Time.sleepTicks(lIllllIIlI[0]);
                    "".length();
                    Widget widget3 = Widgets.get(lIllllIIlI[40], lIllllIIlI[30]);
                    if (lIIlllllIIlII(widget3)) {
                        Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                        Time.sleepTicks(lIllllIIlI[11]);
                        "".length();
                    }
                    Widget widget4 = Widgets.get(lIllllIIlI[40], lIllllIIlI[41]);
                    if (lIIlllllIIlII(widget4)) {
                        Mouse.click(widget4.getClickPoint().getX(), widget4.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                        Time.sleepTicks(lIllllIIlI[11]);
                        "".length();
                    }
                }
                if (lIIllllIlllll(Players.getLocal().getWorldLocation().equals(fN) ? 1 : 0)) {
                    int[] iArr16 = new int[lIllllIIlI[0]];
                    iArr16[lIllllIIlI[1]] = lIllllIIlI[90];
                    if (lIIllllIlllll(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIllllIIlI[0]];
                        iArr17[lIllllIIlI[1]] = lIllllIIlI[90];
                        Inventory.getFirst(iArr17).interact(lIllllIIII[lIllllIIlI[3]]);
                        Time.sleepTicks(lIllllIIlI[7]);
                        "".length();
                    }
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[76])) {
                String[] strArr30 = new String[lIllllIIlI[0]];
                strArr30[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[91]];
                TileObject nearest4 = TileObjects.getNearest(strArr30);
                if (lIIlllllIIlII(nearest4)) {
                    nearest4.interact(lIllllIIII[lIllllIIlI[92]]);
                    Time.sleepTicks(lIllllIIlI[7]);
                    "".length();
                }
                String[] strArr31 = new String[lIllllIIlI[0]];
                strArr31[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[93]];
                TileItem nearest5 = TileItems.getNearest(strArr31);
                if (lIIlllllIIlII(nearest5)) {
                    nearest5.interact(lIllllIIII[lIllllIIlI[94]]);
                    Time.sleepTicks(lIllllIIlI[7]);
                    "".length();
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[22])) {
                if (lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[95]];
                    Movement.walkTo(fP);
                    "".length();
                    Time.sleepTicks(lIllllIIlI[0]);
                    "".length();
                    if (lIIllllIlllll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIlI[42], lIllllIIlI[43], lIllllIIlI[1])) ? 1 : 0)) {
                        C0018e.c(new WorldPoint(lIllllIIlI[44], lIllllIIlI[45], lIllllIIlI[1]));
                        Time.sleepTicks(C0018e.c(lIllllIIlI[5], lIllllIIlI[28]));
                        "".length();
                    }
                    if (lIIllllIlllll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIlI[35], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0)) {
                        C0018e.c(new WorldPoint(lIllllIIlI[38], lIllllIIlI[39], lIllllIIlI[1]));
                        Time.sleepTicks(lIllllIIlI[8]);
                        "".length();
                    }
                    Widget widget5 = Widgets.get(lIllllIIlI[40], lIllllIIlI[30]);
                    if (lIIlllllIIlII(widget5)) {
                        Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                        Time.sleepTicks(lIllllIIlI[11]);
                        "".length();
                    }
                    Widget widget6 = Widgets.get(lIllllIIlI[40], lIllllIIlI[41]);
                    if (lIIlllllIIlII(widget6)) {
                        Mouse.click(widget6.getClickPoint().getX(), widget6.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                        Time.sleepTicks(lIllllIIlI[11]);
                        "".length();
                    }
                }
                if (lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                    String[] strArr32 = new String[lIllllIIlI[0]];
                    strArr32[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[96]];
                    if (lIIlllllIlIIl(NPCs.getNearest(strArr32))) {
                        String[] strArr33 = new String[lIllllIIlI[0]];
                        strArr33[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[97]];
                        TileObjects.getNearest(strArr33).interact(lIllllIIII[lIllllIIlI[98]]);
                        Time.sleepTicks(lIllllIIlI[8]);
                        "".length();
                    }
                    String[] strArr34 = new String[lIllllIIlI[0]];
                    strArr34[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[99]];
                    if (lIIlllllIIlII(NPCs.getNearest(strArr34))) {
                        C0020g.a(lIllllIIII[lIllllIIlI[100]], cE);
                    }
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[85])) {
                String[] strArr35 = new String[lIllllIIlI[0]];
                strArr35[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[101]];
                if (lIIllllIlllll(Inventory.contains(strArr35) ? 1 : 0)) {
                    String[] strArr36 = new String[lIllllIIlI[0]];
                    strArr36[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[102]];
                    if (lIIlllllIIlll(Inventory.getAll(strArr36).size(), lIllllIIlI[11])) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[103]];
                        String[] strArr37 = new String[lIllllIIlI[0]];
                        strArr37[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[104]];
                        Item first4 = Inventory.getFirst(strArr37);
                        int[] iArr18 = new int[lIllllIIlI[0]];
                        iArr18[lIllllIIlI[1]] = lIllllIIlI[105];
                        first4.useOn(TileObjects.getNearest(iArr18));
                        Time.sleepTicks(lIllllIIlI[11]);
                        "".length();
                    }
                }
                String[] strArr38 = new String[lIllllIIlI[0]];
                strArr38[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[106]];
                if (lIIllllIlllll(Inventory.contains(strArr38) ? 1 : 0)) {
                    String[] strArr39 = new String[lIllllIIlI[0]];
                    strArr39[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[107]];
                    Item first5 = Inventory.getFirst(strArr39);
                    int[] iArr19 = new int[lIllllIIlI[0]];
                    iArr19[lIllllIIlI[1]] = lIllllIIlI[108];
                    first5.useOn(TileObjects.getNearest(iArr19));
                    Time.sleepTicks(lIllllIIlI[11]);
                    "".length();
                }
                String[] strArr40 = new String[lIllllIIlI[0]];
                strArr40[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[109]];
                if (lIIlllllIIIIl(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[lIllllIIlI[0]];
                    strArr41[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[110]];
                    if (lIIlllllIlIII(Inventory.getAll(strArr41).size(), lIllllIIlI[11])) {
                        int[] iArr20 = new int[lIllllIIlI[0]];
                        iArr20[lIllllIIlI[1]] = lIllllIIlI[111];
                        WorldPoint worldLocation = TileObjects.getNearest(iArr20).getWorldLocation();
                        if (lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(worldLocation) ? 1 : 0)) {
                            Movement.walkTo(worldLocation);
                            "".length();
                            Time.sleepTicks(lIllllIIlI[0]);
                            "".length();
                        }
                        if (lIIllllIlllll(Players.getLocal().getWorldLocation().equals(worldLocation) ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIIII[lIllllIIlI[112]];
                            C0020g.a(lIllllIIII[lIllllIIlI[113]], cE);
                        }
                    }
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[3]) && lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fO), lIllllIIlI[10])) {
                String[] strArr42 = new String[lIllllIIlI[0]];
                strArr42[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[114]];
                TileObjects.getNearest(strArr42).interact(lIllllIIII[lIllllIIlI[115]]);
                Time.sleepTicks(lIllllIIlI[8]);
                "".length();
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[95])) {
                String[] strArr43 = new String[lIllllIIlI[0]];
                strArr43[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[116]];
                if (lIIlllllIlIIl(NPCs.getNearest(strArr43))) {
                    int[] iArr21 = new int[lIllllIIlI[0]];
                    iArr21[lIllllIIlI[1]] = lIllllIIlI[117];
                    TileObjects.getNearest(iArr21).interact(lIllllIIII[lIllllIIlI[118]]);
                    Time.sleepTicks(lIllllIIlI[8]);
                    "".length();
                }
                String[] strArr44 = new String[lIllllIIlI[0]];
                strArr44[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[119]];
                if (lIIlllllIIlII(NPCs.getNearest(strArr44))) {
                    C0020g.a(lIllllIIII[lIllllIIlI[120]], cE);
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[100])) {
                String[] strArr45 = new String[lIllllIIlI[0]];
                strArr45[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[121]];
                if (lIIlllllIlIIl(NPCs.getNearest(strArr45))) {
                    String[] strArr46 = new String[lIllllIIlI[0]];
                    strArr46[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[122]];
                    if (lIIlllllIlIIl(NPCs.getNearest(strArr46))) {
                        int[] iArr22 = new int[lIllllIIlI[0]];
                        iArr22[lIllllIIlI[1]] = lIllllIIlI[117];
                        TileObjects.getNearest(iArr22).interact(lIllllIIII[lIllllIIlI[123]]);
                        Time.sleepTicks(lIllllIIlI[8]);
                        "".length();
                    }
                }
                String[] strArr47 = new String[lIllllIIlI[0]];
                strArr47[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[124]];
                if (lIIlllllIIlII(NPCs.getNearest(strArr47))) {
                    C0020g.a(lIllllIIII[lIllllIIlI[125]], cE);
                }
                String[] strArr48 = new String[lIllllIIlI[0]];
                strArr48[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[126]];
                if (lIIlllllIIlII(NPCs.getNearest(strArr48))) {
                    C0020g.a(lIllllIIII[lIllllIIlI[127]], cE);
                }
            }
            if (lIIlllllIIIlI(C0018e.j(lIllllIIlI[4]), lIllllIIlI[106]) && lIIlllllIlIII(C0018e.j(lIllllIIlI[4]), lIllllIIlI[119])) {
                if (lIIllllIlllll(Dialog.isOpen() ? 1 : 0)) {
                    C0020g.a(cE);
                }
                String[] strArr49 = new String[lIllllIIlI[0]];
                strArr49[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[128]];
                if (lIIlllllIIlII(TileObjects.getNearest(strArr49))) {
                    String[] strArr50 = new String[lIllllIIlI[0]];
                    strArr50[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[129]];
                    if (lIIllllIlllll(Inventory.contains(strArr50) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[130]];
                        int[] iArr23 = new int[lIllllIIlI[0]];
                        iArr23[lIllllIIlI[1]] = lIllllIIlI[14];
                        if (lIIllllIlllll(Inventory.contains(iArr23) ? 1 : 0) && lIIlllllIIIll(Players.getLocal().getAnimation(), lIllllIIlI[33])) {
                            int[] iArr24 = new int[lIllllIIlI[0]];
                            iArr24[lIllllIIlI[1]] = lIllllIIlI[14];
                            Inventory.getFirst(iArr24).interact(lIllllIIII[lIllllIIlI[131]]);
                            Time.sleepTicks(lIllllIIlI[7]);
                            "".length();
                        }
                    }
                }
                if (lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(fN) ? 1 : 0) && lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[12])) {
                    String[] strArr51 = new String[lIllllIIlI[0]];
                    strArr51[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[132]];
                    if (lIIlllllIlIIl(TileObjects.getNearest(strArr51))) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[133]];
                        Movement.walkTo(fN);
                        "".length();
                        Time.sleepTicks(lIllllIIlI[0]);
                        "".length();
                        Widget widget7 = Widgets.get(lIllllIIlI[40], lIllllIIlI[30]);
                        if (lIIlllllIIlII(widget7)) {
                            Mouse.click(widget7.getClickPoint().getX(), widget7.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                            Time.sleepTicks(lIllllIIlI[11]);
                            "".length();
                        }
                        Widget widget8 = Widgets.get(lIllllIIlI[40], lIllllIIlI[41]);
                        if (lIIlllllIIlII(widget8)) {
                            Mouse.click(widget8.getClickPoint().getX(), widget8.getClickPoint().getY(), (boolean) lIllllIIlI[0]);
                            Time.sleepTicks(lIllllIIlI[11]);
                            "".length();
                        }
                    }
                }
                if (lIIllllIlllll(Players.getLocal().getWorldLocation().equals(fN) ? 1 : 0)) {
                    int[] iArr25 = new int[lIllllIIlI[0]];
                    iArr25[lIllllIIlI[1]] = lIllllIIlI[134];
                    if (lIIllllIlllll(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[lIllllIIlI[0]];
                        iArr26[lIllllIIlI[1]] = lIllllIIlI[134];
                        Inventory.getFirst(iArr26).interact(lIllllIIII[lIllllIIlI[135]]);
                        Time.sleepTicks(lIllllIIlI[7]);
                        "".length();
                    }
                }
                String[] strArr52 = new String[lIllllIIlI[0]];
                strArr52[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[136]];
                TileObject nearest6 = TileObjects.getNearest(strArr52);
                if (lIIlllllIIlII(nearest6)) {
                    nearest6.interact(lIllllIIII[lIllllIIlI[137]]);
                    Time.sleepTicks(lIllllIIlI[7]);
                    "".length();
                }
                String[] strArr53 = new String[lIllllIIlI[0]];
                strArr53[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[138]];
                TileItem nearest7 = TileItems.getNearest(strArr53);
                if (lIIlllllIIlII(nearest7)) {
                    nearest7.interact(lIllllIIII[lIllllIIlI[139]]);
                    Time.sleepTicks(lIllllIIlI[7]);
                    "".length();
                }
                String[] strArr54 = new String[lIllllIIlI[0]];
                strArr54[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[140]];
                if (lIIllllIlllll(Inventory.contains(strArr54) ? 1 : 0) && lIIllllIlllll(Players.getLocal().getWorldLocation().equals(fN) ? 1 : 0)) {
                    String[] strArr55 = new String[lIllllIIlI[0]];
                    strArr55[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[141]];
                    if (lIIllllIlllll(Inventory.contains(strArr55) ? 1 : 0)) {
                        String[] strArr56 = new String[lIllllIIlI[0]];
                        strArr56[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[142]];
                        Inventory.getFirst(strArr56).interact(lIllllIIII[lIllllIIlI[143]]);
                        Time.sleepTicks(lIllllIIlI[0]);
                        "".length();
                    }
                }
            }
            if (lIIlllllIIIlI(C0018e.j(lIllllIIlI[4]), lIllllIIlI[124]) && lIIlllllIIIII(C0018e.j(lIllllIIlI[4]), lIllllIIlI[140])) {
                int[] iArr27 = new int[lIllllIIlI[0]];
                iArr27[lIllllIIlI[1]] = lIllllIIlI[20];
                if (lIIlllllIIIIl(Equipment.contains(iArr27) ? 1 : 0)) {
                    int[] iArr28 = new int[lIllllIIlI[0]];
                    iArr28[lIllllIIlI[1]] = lIllllIIlI[20];
                    if (lIIllllIlllll(Inventory.contains(iArr28) ? 1 : 0)) {
                        int[] iArr29 = new int[lIllllIIlI[0]];
                        iArr29[lIllllIIlI[1]] = lIllllIIlI[20];
                        Inventory.getFirst(iArr29).interact(lIllllIIII[lIllllIIlI[144]]);
                    }
                }
                String[] strArr57 = new String[lIllllIIlI[0]];
                strArr57[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[145]];
                NPC npc = (NPC) NPCs.getAll(strArr57).stream().filter(npc2 -> {
                    String[] strArr58 = new String[lIllllIIlI[0]];
                    strArr58[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[181]];
                    return npc2.hasAction(strArr58);
                }).findFirst().orElse(null);
                if (lIIlllllIIIII(Prayers.getPoints(), lIllllIIlI[30])) {
                    Inventory.getFirst(item -> {
                        return item.getName().contains(lIllllIIII[lIllllIIlI[180]]);
                    }).interact(lIllllIIII[lIllllIIlI[146]]);
                }
                if (lIIlllllIlIIl(npc)) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[147]];
                    if (lIIllllIlllll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    String[] strArr58 = new String[lIllllIIlI[0]];
                    strArr58[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[148]];
                    Item first6 = Inventory.getFirst(strArr58);
                    String[] strArr59 = new String[lIllllIIlI[0]];
                    strArr59[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[149]];
                    first6.useOn(NPCs.getNearest(strArr59));
                    Time.sleepTicks(lIllllIIlI[32]);
                    "".length();
                }
                if (lIIlllllIIlII(npc)) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[150]];
                    if (lIIlllllIIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (lIIlllllIIlII(npc) && lIIlllllIlIIl(Players.getLocal().getInteracting())) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[151]];
                    npc.interact(lIllllIIII[lIllllIIlI[152]]);
                    Time.sleepTicks(lIllllIIlI[7]);
                    "".length();
                }
            }
            if (lIIlllllIIIll(C0018e.j(lIllllIIlI[4]), lIllllIIlI[140])) {
                if (lIIllllIlllll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8]) && lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fO), lIllllIIlI[29])) {
                    cc();
                }
                if (lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                    String[] strArr60 = new String[lIllllIIlI[0]];
                    strArr60[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[153]];
                    TileObjects.getNearest(strArr60).interact(lIllllIIII[lIllllIIlI[154]]);
                    Time.sleepTicks(lIllllIIlI[8]);
                    "".length();
                }
                if (lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fO), lIllllIIlI[29])) {
                    if (lIIlllllIIIII(di, lIllllIIlI[0])) {
                        aN.qH += lIllllIIlI[0];
                        aN.u(AccBuilderSotf.m);
                        di += lIllllIIlI[0];
                        aN.qH = lIllllIIlI[1];
                        dj = lIllllIIlI[1];
                    }
                    String[] strArr61 = new String[lIllllIIlI[0]];
                    strArr61[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[155]];
                    if (lIIlllllIlIIl(NPCs.getNearest(strArr61))) {
                        String[] strArr62 = new String[lIllllIIlI[0]];
                        strArr62[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[156]];
                        if (lIIlllllIlIIl(NPCs.getNearest(strArr62))) {
                            int[] iArr30 = new int[lIllllIIlI[0]];
                            iArr30[lIllllIIlI[1]] = lIllllIIlI[117];
                            TileObjects.getNearest(iArr30).interact(lIllllIIII[lIllllIIlI[157]]);
                            Time.sleepTicks(lIllllIIlI[8]);
                            "".length();
                        }
                    }
                    String[] strArr63 = new String[lIllllIIlI[0]];
                    strArr63[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[158]];
                    if (lIIlllllIIlII(NPCs.getNearest(strArr63))) {
                        C0020g.a(lIllllIIII[lIllllIIlI[159]], cE);
                    }
                    String[] strArr64 = new String[lIllllIIlI[0]];
                    strArr64[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[160]];
                    if (lIIlllllIIlII(NPCs.getNearest(strArr64))) {
                        C0020g.a(lIllllIIII[lIllllIIlI[161]], cE);
                    }
                }
            }
        }
    }

    private static boolean lIIlllllIIllI(int i) {
        return i < 0;
    }

    private static String lIIllllIllIII(String llllllllllllllllllIlllIllIlllIll, String llllllllllllllllllIlllIllIlllIlI) {
        try {
            SecretKeySpec llllllllllllllllllIlllIllIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIllIlllIlI.getBytes(StandardCharsets.UTF_8)), lIllllIIlI[28]), "DES");
            Cipher llllllllllllllllllIlllIllIllllIl = Cipher.getInstance("DES");
            llllllllllllllllllIlllIllIllllIl.init(lIllllIIlI[7], llllllllllllllllllIlllIllIlllllI);
            return new String(llllllllllllllllllIlllIllIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIllIllllII) {
            llllllllllllllllllIlllIllIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIIlIl(int i) {
        return i > 0;
    }

    private static void lIIllllIlllII() {
        lIllllIIII = new String[lIllllIIlI[211]];
        lIllllIIII[lIllllIIlI[1]] = lIIllllIlIllI("PishDiMQJytHMg07Jgk3WCs7Aj0Lbm8UJxE2LA85FiVvBTEbKW8TP1gzOgIjDA==", "xBOgP");
        lIllllIIII[lIllllIIlI[0]] = lIIllllIlIlll("kDVwzBh6CXI48EkZRaS0OA==", "ATlMG");
        lIllllIIII[lIllllIIlI[7]] = lIIllllIlIllI("Jy4aDyEGIRNLLw4hHwIjCA==", "oOtkM");
        lIllllIIII[lIllllIIlI[11]] = lIIllllIlIllI("BA9oDx02SiUHHCADJglPIh8tHRtzGT0eHz8DLR1Dcxk/BxswAiEACHMeJ04tBjMBICg=", "SjHno");
        lIllllIIII[lIllllIIlI[8]] = lIIllllIlIllI("PQ5EMysPSwk7KhkCCjV5Gx4BIS1KGBEiKQYCASF1ShgTOy0JAw08PkofC3IbPzItHB4=", "jkdRY");
        lIllllIIII[lIllllIIlI[5]] = lIIllllIllIII("aDlYOSb7SAc=", "wMYCH");
        lIllllIIII[lIllllIIlI[12]] = lIIllllIlIllI("Mzge", "vYjZF");
        lIllllIIII[lIllllIIlI[21]] = lIIllllIlIllI("EScQEQ==", "VFdtX");
        lIllllIIII[lIllllIIlI[28]] = lIIllllIlIllI("ByMoIA==", "HSMNN");
        lIllllIIII[lIllllIIlI[32]] = lIIllllIllIII("6fO0+sjQ7pgvTFASG6d01lAJjwUnoEdU", "qdiTN");
        lIllllIIII[lIllllIIlI[10]] = lIIllllIlIlll("EbQcApfo2vk=", "qadUA");
        lIllllIIII[lIllllIIlI[34]] = lIIllllIlIlll("CrtaroykzzhJlwt1RU/s4w==", "bRdIT");
        lIllllIIII[lIllllIIlI[46]] = lIIllllIllIII("aWwnHScEGmw=", "KoxWR");
        lIllllIIII[lIllllIIlI[47]] = lIIllllIlIlll("CO1l6rnArVl+UKhygNfpcQ==", "HyCIe");
        lIllllIIII[lIllllIIlI[48]] = lIIllllIlIlll("I8PToRgvh5G8uKu/IfDYAQ==", "lDaxm");
        lIllllIIII[lIllllIIlI[29]] = lIIllllIlIlll("gKUqNkfbpI0=", "IiDGw");
        lIllllIIII[lIllllIIlI[49]] = lIIllllIlIlll("bN+BK/wZUFw=", "MNFJe");
        lIllllIIII[lIllllIIlI[41]] = lIIllllIlIlll("H2nyqD6DAdk=", "ciJpg");
        lIllllIIII[lIllllIIlI[50]] = lIIllllIllIII("LZS+/XPimCc=", "SXuGw");
        lIllllIIII[lIllllIIlI[51]] = lIIllllIlIlll("4pwfyA3blVY=", "WAEwd");
        lIllllIIII[lIllllIIlI[30]] = lIIllllIllIII("KVEPImvwkFE=", "oELRc");
        lIllllIIII[lIllllIIlI[52]] = lIIllllIlIllI("NAgJIzscWhIlKhY=", "szfWO");
        lIllllIIII[lIllllIIlI[53]] = lIIllllIlIlll("3Hn+9tix3ZQ=", "ZNsJD");
        lIllllIIII[lIllllIIlI[54]] = lIIllllIlIllI("AQAVNiUqCBd6GCYbFTUvLA==", "GiyZL");
        lIllllIIII[lIllllIIlI[55]] = lIIllllIlIlll("tI2DDsQgwaU=", "IQraC");
        lIllllIIII[lIllllIIlI[56]] = lIIllllIlIllI("IwUACBk=", "fktmk");
        lIllllIIII[lIllllIIlI[57]] = lIIllllIlIlll("iMJA7UK3b5x5+FONno8AWqmZzvqiu4WP", "LLgIL");
        lIllllIIII[lIllllIIlI[58]] = lIIllllIlIllI("ICIVNBgLKhd4JQc5FTcSDQ==", "fKyXq");
        lIllllIIII[lIllllIIlI[59]] = lIIllllIllIII("J3UzAZC9kcs=", "bnrIy");
        lIllllIIII[lIllllIIlI[60]] = lIIllllIlIlll("/wldmMSGAFg=", "hNOwU");
        lIllllIIII[lIllllIIlI[61]] = lIIllllIlIllI("AjQiFg==", "UQCdN");
        lIllllIIII[lIllllIIlI[62]] = lIIllllIllIII("rfqQ/qclZCdGsJtdKH1uVAz3B8RnSAp0", "yqpyJ");
        lIllllIIII[lIllllIIlI[63]] = lIIllllIllIII("Af/STAYm4lg=", "xKYod");
        lIllllIIII[lIllllIIlI[64]] = lIIllllIlIlll("T75ZeF6wNRU=", "tuYtQ");
        lIllllIIII[lIllllIIlI[65]] = lIIllllIlIlll("3jbfdWSeQ60JZGus6pAEZhHsh1f607e7", "hBeaB");
        lIllllIIII[lIllllIIlI[66]] = lIIllllIlIllI("IAcTCxwf", "mnays");
        lIllllIIII[lIllllIIlI[67]] = lIIllllIlIllI("ECMVCw47KxdHMzc4FQgEPQ==", "VJygg");
        lIllllIIII[lIllllIIlI[68]] = lIIllllIllIII("PMTuEknOVz4=", "NMUFD");
        lIllllIIII[lIllllIIlI[69]] = lIIllllIlIllI("FxkDPBA8EQFwLTACAz8aOg==", "QpoPy");
        lIllllIIII[lIllllIIlI[70]] = lIIllllIlIllI("KC0aDR0DJRhBIA82Gg4XBQ==", "nDvat");
        lIllllIIII[lIllllIIlI[71]] = lIIllllIllIII("UFnqdtlglxU=", "myxDj");
        lIllllIIII[lIllllIIlI[72]] = lIIllllIlIllI("EAI3CDc=", "UlCmE");
        lIllllIIII[lIllllIIlI[73]] = lIIllllIllIII("f0yqzDF9z2E=", "PzFNd");
        lIllllIIII[lIllllIIlI[74]] = lIIllllIllIII("P3SZjypYQHH8ril2WPyRvuDXqgsYFpug", "kxikk");
        lIllllIIII[lIllllIIlI[75]] = lIIllllIllIII("qwi+kgZ7yynvpEb9pD0P0TWFZKP1YDRM", "QVwGM");
        lIllllIIII[lIllllIIlI[76]] = lIIllllIlIlll("bFL+3wpYuWo=", "rrSee");
        lIllllIIII[lIllllIIlI[77]] = lIIllllIllIII("QOObi03Xmog=", "oMsvY");
        lIllllIIII[lIllllIIlI[78]] = lIIllllIllIII("lZqXjdeP8QBhvsETnhivEt5nS3duCerm", "CJTco");
        lIllllIIII[lIllllIIlI[79]] = lIIllllIlIllI("MBgkFiAbECZaHRcDJBUqHQ==", "vqHzI");
        lIllllIIII[lIllllIIlI[80]] = lIIllllIlIlll("MqDVzODAyvmnl8kd35NKJg==", "cgjpJ");
        lIllllIIII[lIllllIIlI[22]] = lIIllllIllIII("muu8evrUS3E=", "HeXHo");
        lIllllIIII[lIllllIIlI[81]] = lIIllllIllIII("r1AZ8NS54nkxKSgcb5MmMQ==", "DkhAg");
        lIllllIIII[lIllllIIlI[82]] = lIIllllIllIII("1Rf9pzrRFewITTt6l9V+oQ==", "KCopA");
        lIllllIIII[lIllllIIlI[83]] = lIIllllIlIllI("PCUoMwgHODs=", "hWICl");
        lIllllIIII[lIllllIIlI[84]] = lIIllllIlIlll("EWj9lezIjxo=", "rlOGn");
        lIllllIIII[lIllllIIlI[85]] = lIIllllIlIllI("OwYWExsTCxZWGQABBwUd", "rhbvi");
        lIllllIIII[lIllllIIlI[86]] = lIIllllIlIlll("FM5iWak2ZuA=", "hdkWO");
        lIllllIIII[lIllllIIlI[87]] = lIIllllIlIlll("knzgC3fF7Q7oscrPnmz+/g==", "ldRIq");
        lIllllIIII[lIllllIIlI[88]] = lIIllllIllIII("6H42Iox7YRM=", "LgeQv");
        lIllllIIII[lIllllIIlI[89]] = lIIllllIlIllI("Kw0CcxYKTBg8BQ==", "eltSb");
        lIllllIIII[lIllllIIlI[3]] = lIIllllIlIlll("cypYGC8FJMQ=", "YZwxY");
        lIllllIIII[lIllllIIlI[91]] = lIIllllIllIII("CRA/hUku+qTfMRjYMS0zdQ==", "VCJlk");
        lIllllIIII[lIllllIIlI[92]] = lIIllllIlIllI("JCQUGQ==", "tMwrZ");
        lIllllIIII[lIllllIIlI[93]] = lIIllllIllIII("LDmZeWpKMNp8zcwynMcQvw==", "wdHsL");
        lIllllIIII[lIllllIIlI[94]] = lIIllllIlIlll("QasDHB80H2Q=", "YeAMD");
        lIllllIIII[lIllllIIlI[95]] = lIIllllIlIllI("PyklViMeaDQEOAU8PA==", "qHSvW");
        lIllllIIII[lIllllIIlI[96]] = lIIllllIlIllI("AzspDicoMytCGiQgKQ0tLg==", "EREbN");
        lIllllIIII[lIllllIIlI[97]] = lIIllllIllIII("HuW6rato5fY=", "qsSJP");
        lIllllIIII[lIllllIIlI[98]] = lIIllllIllIII("AhhNFim0vLU=", "UJgVq");
        lIllllIIII[lIllllIIlI[99]] = lIIllllIlIlll("0mT8edPAGaVkIgp+BH4PIVtH/RdoCOt0", "Dqkbe");
        lIllllIIII[lIllllIIlI[100]] = lIIllllIllIII("LgdJWMrHdDEjpRNLsWYUiBRs5jgX2VHZ", "LxEsi");
        lIllllIIII[lIllllIIlI[101]] = lIIllllIllIII("V0vZAjxvguUeTc/+u9a5+49OYRUPll5k", "SZemW");
        lIllllIIII[lIllllIIlI[102]] = lIIllllIlIlll("HuzlpsnY2YVwOq5wC81+F/ZiSJXMj9ib", "yCuvO");
        lIllllIIII[lIllllIIlI[103]] = lIIllllIllIII("xxMkCo/RRNdS7pxDhU99Cw==", "LMySD");
        lIllllIIII[lIllllIIlI[104]] = lIIllllIlIlll("f40du2YNrRrGQVrU7XO2PfHwpaQj9BDr", "DXeZD");
        lIllllIIII[lIllllIIlI[106]] = lIIllllIllIII("3tkQI1EtM1Q/peS6MJrmLQ==", "avAIR");
        lIllllIIII[lIllllIIlI[107]] = lIIllllIlIllI("C3YwIicudjYhJyY6", "JVEQB");
        lIllllIIII[lIllllIIlI[109]] = lIIllllIlIllI("G2MlIjE+YyMhMTYv", "ZCPQT");
        lIllllIIII[lIllllIIlI[110]] = lIIllllIlIlll("3JHRH1P2/XbXbqewR1+i6DC5mpN49AUX", "GMOFt");
        lIllllIIII[lIllllIIlI[112]] = lIIllllIlIlll("wgNaBrf0821Emd6r+DuL6mslvNoQCXCs", "xRRbB");
        lIllllIIII[lIllllIIlI[113]] = lIIllllIlIlll("aC/euyJmliyPx66ENrWb6Nvzq/hz3R5J", "vtlXH");
        lIllllIIII[lIllllIIlI[114]] = lIIllllIlIlll("KHXp0tDuws8=", "AKqsb");
        lIllllIIII[lIllllIIlI[115]] = lIIllllIllIII("DT9zd187bVo=", "WVrEe");
        lIllllIIII[lIllllIIlI[116]] = lIIllllIlIllI("KCImODkDKiR0BA85JjszBQ==", "nKJTP");
        lIllllIIII[lIllllIIlI[118]] = lIIllllIllIII("PHiSh61ejx0=", "vFskk");
        lIllllIIII[lIllllIIlI[119]] = lIIllllIllIII("KCbjyuXUOmrN95Avson8D6mFQasdAypk", "hADum");
        lIllllIIII[lIllllIIlI[120]] = lIIllllIllIII("wIBMKNqewiXtW/2USEA/4sp6nnD3E7bP", "kuRTr");
        lIllllIIII[lIllllIIlI[121]] = lIIllllIlIlll("+jue7ij0zF3pZjG03IfuzMiUsKWqV+Gc", "Myuhm");
        lIllllIIII[lIllllIIlI[122]] = lIIllllIlIllI("KTgYOR4CeT88BRUwGA==", "gYlLl");
        lIllllIIII[lIllllIIlI[123]] = lIIllllIlIlll("v42mdu4/1uU=", "Dofcr");
        lIllllIIII[lIllllIIlI[124]] = lIIllllIlIllI("FSE0OT8+KTZ1AjI6NDo1OA==", "SHXUV");
        lIllllIIII[lIllllIIlI[125]] = lIIllllIlIllI("IQ89Bw0KBz9LMAYUPQQHDA==", "gfQkd");
        lIllllIIII[lIllllIIlI[126]] = lIIllllIlIllI("Pys2JxMUahEiCAMjNg==", "qJBRa");
        lIllllIIII[lIllllIIlI[127]] = lIIllllIlIlll("fZEg8t7jYg5ZkZtLOUXOHQ==", "GQSMT");
        lIllllIIII[lIllllIIlI[128]] = lIIllllIlIllI("BjwdMxAu", "ANrGd");
        lIllllIIII[lIllllIIlI[129]] = lIIllllIlIllI("JTUYKDRBNwI0Mwk=", "aGmAP");
        lIllllIIII[lIllllIIlI[130]] = lIIllllIllIII("mQS4Wfjf/GE1Mmkkp4RbVg==", "yQqEQ");
        lIllllIIII[lIllllIIlI[131]] = lIIllllIllIII("5iIh9VdAnzY=", "NDrgP");
        lIllllIIII[lIllllIIlI[132]] = lIIllllIllIII("4J+wCYcnnjc=", "ALWdx");
        lIllllIIII[lIllllIIlI[133]] = lIIllllIlIllI("LAw1ehgNTS81Cw==", "bmCZl");
        lIllllIIII[lIllllIIlI[135]] = lIIllllIlIllI("Nzg7H002NScEAA==", "tYHkm");
        lIllllIIII[lIllllIIlI[136]] = lIIllllIlIllI("CQU6Lz9vHzpoOiAX", "OpTHV");
        lIllllIIII[lIllllIIlI[137]] = lIIllllIlIlll("yv+P7mOQO0c=", "sfEfg");
        lIllllIIII[lIllllIIlI[138]] = lIIllllIllIII("y7LK74UQFi8o1Xi97V5dNQ==", "dgYCy");
        lIllllIIII[lIllllIIlI[139]] = lIIllllIllIII("GOZvSCvrZqU=", "YVeYW");
        lIllllIIII[lIllllIIlI[140]] = lIIllllIlIllI("OT8CBHoZKQIVehIlHhcvBw==", "tPppZ");
        lIllllIIII[lIllllIIlI[141]] = lIIllllIlIllI("ABwWHwlkHgwDDiw=", "Dncvm");
        lIllllIIII[lIllllIIlI[142]] = lIIllllIllIII("9mkPuPO1rzQ6J77s1EwXVw==", "CVNpV");
        lIllllIIII[lIllllIIlI[143]] = lIIllllIlIlll("jVvcofo+KbA=", "XPwFn");
        lIllllIIII[lIllllIIlI[144]] = lIIllllIllIII("eyWimTsMeCI=", "ARLSx");
        lIllllIIII[lIllllIIlI[145]] = lIIllllIlIllI("EQQ4BDo=", "VlYwN");
        lIllllIIII[lIllllIIlI[146]] = lIIllllIllIII("OrX1JFRk85A=", "uyuln");
        lIllllIIII[lIllllIIlI[147]] = lIIllllIlIllI("NyYKBglCMREdBwZ1EwcbAT1DBwBCMgsJHRY=", "bUchn");
        lIllllIIII[lIllllIIlI[148]] = lIIllllIllIII("n9aWTonbbZt/GSXj+FCpRg==", "lckqq");
        lIllllIIII[lIllllIIlI[149]] = lIIllllIllIII("cBBAZ+9Iuok=", "oBfnO");
        lIllllIIII[lIllllIIlI[150]] = lIIllllIllIII("EF4y8Gd7JL+3x/TaO4qnjQ==", "jBAiW");
        lIllllIIII[lIllllIIlI[151]] = lIIllllIllIII("TdxMITWhdLxoNwXH8+aFD+fmM7RvwYoIyVVQUVpd1PQ=", "iWaca");
        lIllllIIII[lIllllIIlI[152]] = lIIllllIlIllI("LwUNEiUF", "nqysF");
        lIllllIIII[lIllllIIlI[153]] = lIIllllIlIllI("Axs2Ljcr", "DiYZC");
        lIllllIIII[lIllllIIlI[154]] = lIIllllIlIllI("FAwCIyY=", "QbvFT");
        lIllllIIII[lIllllIIlI[155]] = lIIllllIlIlll("Gb8tRcu1R9/NLAOjq5+Nk6dbaemcNXwU", "yPhOk");
        lIllllIIII[lIllllIIlI[156]] = lIIllllIlIlll("nrY5k7OY/Tgk04qUYfIPDg==", "tLfpy");
        lIllllIIII[lIllllIIlI[157]] = lIIllllIllIII("XEjsq5yGL9g=", "mqxVj");
        lIllllIIII[lIllllIIlI[158]] = lIIllllIllIII("ATRlGL91ZB72jsvxRBuBBCIVhPUjHmOi", "GFOGZ");
        lIllllIIII[lIllllIIlI[159]] = lIIllllIllIII("DHt6SoTInDft2GawwTDoFr5p0GJySHuV", "kbMVc");
        lIllllIIII[lIllllIIlI[160]] = lIIllllIllIII("13Z4gaQHPr/ldFHSrUmJ8g==", "VOjvm");
        lIllllIIII[lIllllIIlI[161]] = lIIllllIlIllI("Gg01ByQxTBICPyYFNQ==", "TlArV");
        lIllllIIII[lIllllIIlI[162]] = lIIllllIllIII("FBVAXVNaBPXBINDxYygsUg==", "sNixq");
        lIllllIIII[lIllllIIlI[163]] = lIIllllIlIllI("Ojs/FRVJPSECBgwjMhEUSS42DxUZNSEX", "iZScp");
        lIllllIIII[lIllllIIlI[164]] = lIIllllIlIllI("CQEELicoSBsxITEEDQ==", "ZhhXB");
        lIllllIIII[lIllllIIlI[165]] = lIIllllIlIlll("Mzv9TfYAWwXPk8vI6fIfUA==", "YFahx");
        lIllllIIII[lIllllIIlI[166]] = lIIllllIlIllI("PAMALHQcFQA9dBcZHD8hAg==", "qlrXT");
        lIllllIIII[lIllllIIlI[167]] = lIIllllIlIlll("kDvcsJcD/y8=", "OmirD");
        lIllllIIII[lIllllIIlI[168]] = lIIllllIllIII("t6M3oCXLQhU=", "kdPdx");
        lIllllIIII[lIllllIIlI[178]] = lIIllllIlIllI("LwMAOAMEQgc9GBMLAA==", "abtMq");
        lIllllIIII[lIllllIIlI[179]] = lIIllllIlIlll("yJP4TWrA4sQ/kkrTfR0wqcUHfDEhn1LH", "oATkQ");
        lIllllIIII[lIllllIIlI[180]] = lIIllllIlIllI("Eh4LNy8w", "BljNJ");
        lIllllIIII[lIllllIIlI[181]] = lIIllllIllIII("jUarepsTGTw=", "ghRtu");
        lIllllIIII[lIllllIIlI[192]] = lIIllllIllIII("p/9FsxtYozuG1ZxvD2nmK87GqHKVPgiYlSlHb3p4Sn4=", "IVfRT");
        lIllllIIII[lIllllIIlI[193]] = lIIllllIllIII("/Z5zNGQbEYI=", "XqMlT");
        lIllllIIII[lIllllIIlI[31]] = lIIllllIlIlll("bZAMcchWbnTlT81l1YVLzSCPWPOjvYMD", "CtAbY");
        lIllllIIII[lIllllIIlI[194]] = lIIllllIllIII("wO1dPi+o7aAEPbhoGN4RhjKWZweHyf1qcjhYzrXKRQEykcItZKSO6Q==", "ErJIR");
        lIllllIIII[lIllllIIlI[195]] = lIIllllIlIllI("Aj46E2Q=", "QKHvJ");
        lIllllIIII[lIllllIIlI[196]] = lIIllllIlIllI("HRkjXgIhViQQFywCelkHIVYyFh5jAng=", "DvVyp");
        lIllllIIII[lIllllIIlI[197]] = lIIllllIlIllI("MQl2MREdCDNlGBYDIi0QFh12IBULH3YsFwwfJCAKDBM4IlkMFXYhFlgbJCoMFh52LRwKH2k=", "xzVEy");
        lIllllIIII[lIllllIIlI[198]] = lIIllllIlIllI("FDMrNUdjIS84H2M/NHkCN3pnEEsuNz55CSZ2JjsHJnYzNksrMyspVA==", "CVGYk");
        lIllllIIII[lIllllIIlI[199]] = lIIllllIllIII("OD5YGhE3PUgv5ttkk7LJwRs189e7HN3JMBijfEhkAKo=", "QwRWB");
        lIllllIIII[lIllllIIlI[200]] = lIIllllIlIllI("KR04Yng5XyZuKwUKLmA=", "pxKNX");
        lIllllIIII[lIllllIIlI[201]] = lIIllllIlIlll("qWl7GbpUDNsbix6Jj/Wnaw==", "nXqvD");
        lIllllIIII[lIllllIIlI[202]] = lIIllllIlIllI("MEYkKwYXDXAKSA8DcDAAFRA1J08NDjVjHwwcKi8KWA==", "yfPCo");
        lIllllIIII[lIllllIIlI[203]] = lIIllllIlIllI("LCs8choFKmsbWQwhJyJG", "dDKRy");
        lIllllIIII[lIllllIIlI[204]] = lIIllllIllIII("+NQ4w+rNVms7OCQSEa6NzjPsCsabzB0vUziZSjK1s+zHm5BsYEhviQ==", "piFiE");
        lIllllIIII[lIllllIIlI[205]] = lIIllllIllIII("OE9vjYyrp8HKEobV7t/9yYQla7YHHsXCd79uhNu/8aF4OiSiCJRD/g==", "pRNgm");
        lIllllIIII[lIllllIIlI[206]] = lIIllllIlIllI("DwE/VDozTjgaLz4aZlM/M04uHCZxGmQ=", "VnJsH");
        lIllllIIII[lIllllIIlI[207]] = lIIllllIllIII("l312okGQyLdb/kctiggeiw==", "RyAdh");
        lIllllIIII[lIllllIIlI[208]] = lIIllllIlIllI("Ah9uLwYzUCU4BjFQITBJJx43IgEvHil2IGYTLzhJIh9uPwdmPSEkEDIRID8IeQ==", "FpNVi");
        lIllllIIII[lIllllIIlI[209]] = lIIllllIllIII("5gRTWZL29Wo8IweUyvJiacYhvMMwSfV0xY8bguNXvVo=", "ZWDYX");
        lIllllIIII[lIllllIIlI[210]] = lIIllllIllIII("Fic7GBgGDn/vIoO8FzUG4ZpP9amByTVT", "mujDf");
    }

    static {
        lIIllllIlllIl();
        lIIllllIlllII();
        fH = lIllllIIlI[182];
        fI = lIllllIIlI[142];
        fJ = lIllllIIlI[2];
        fK = lIllllIIlI[4];
        fL = new WorldPoint(lIllllIIlI[37], lIllllIIlI[183], lIllllIIlI[1]);
        fM = new WorldPoint(lIllllIIlI[184], lIllllIIlI[185], lIllllIIlI[1]);
        fN = new WorldPoint(lIllllIIlI[186], lIllllIIlI[187], lIllllIIlI[1]);
        fO = new WorldPoint(lIllllIIlI[44], lIllllIIlI[188], lIllllIIlI[1]);
        fP = new WorldPoint(lIllllIIlI[184], lIllllIIlI[189], lIllllIIlI[1]);
        fQ = new WorldPoint(lIllllIIlI[184], lIllllIIlI[190], lIllllIIlI[1]);
        bv = new ArrayList();
        dF = lIllllIIlI[1];
        fR = new WorldArea(lIllllIIlI[191], lIllllIIlI[43], lIllllIIlI[51], lIllllIIlI[47], lIllllIIlI[1]);
        String[] strArr = new String[lIllllIIlI[30]];
        strArr[lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[192]];
        strArr[lIllllIIlI[0]] = lIllllIIII[lIllllIIlI[193]];
        strArr[lIllllIIlI[7]] = lIllllIIII[lIllllIIlI[31]];
        strArr[lIllllIIlI[11]] = lIllllIIII[lIllllIIlI[194]];
        strArr[lIllllIIlI[8]] = lIllllIIII[lIllllIIlI[195]];
        strArr[lIllllIIlI[5]] = lIllllIIII[lIllllIIlI[196]];
        strArr[lIllllIIlI[12]] = lIllllIIII[lIllllIIlI[197]];
        strArr[lIllllIIlI[21]] = lIllllIIII[lIllllIIlI[198]];
        strArr[lIllllIIlI[28]] = lIllllIIII[lIllllIIlI[199]];
        strArr[lIllllIIlI[32]] = lIllllIIII[lIllllIIlI[200]];
        strArr[lIllllIIlI[10]] = lIllllIIII[lIllllIIlI[201]];
        strArr[lIllllIIlI[34]] = lIllllIIII[lIllllIIlI[202]];
        strArr[lIllllIIlI[46]] = lIllllIIII[lIllllIIlI[203]];
        strArr[lIllllIIlI[47]] = lIllllIIII[lIllllIIlI[204]];
        strArr[lIllllIIlI[48]] = lIllllIIII[lIllllIIlI[205]];
        strArr[lIllllIIlI[29]] = lIllllIIII[lIllllIIlI[206]];
        strArr[lIllllIIlI[49]] = lIllllIIII[lIllllIIlI[207]];
        strArr[lIllllIIlI[41]] = lIllllIIII[lIllllIIlI[208]];
        strArr[lIllllIIlI[50]] = lIllllIIII[lIllllIIlI[209]];
        strArr[lIllllIIlI[51]] = lIllllIIII[lIllllIIlI[210]];
        cE = strArr;
    }

    private static String lIIllllIlIlll(String llllllllllllllllllIlllIllIlIlllI, String llllllllllllllllllIlllIllIlIllIl) {
        try {
            SecretKeySpec llllllllllllllllllIlllIllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIllIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIIlI[7], llllllllllllllllllIlllIllIllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIllIlIllll) {
            llllllllllllllllllIlllIllIlIllll.printStackTrace();
            return null;
        }
    }
}
