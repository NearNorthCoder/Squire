package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/a.class */
public class a {
    private static /* synthetic */ String[] lIIll;
    private static /* synthetic */ int[] lIlIl;
    static /* synthetic */ String[] a;

    public static void i() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[4]).interact(lIIll[lIlIl[22]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[23]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static String lIllllI(String lllllIIllIIIIIl, String lllllIIllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIllIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIl[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIIllIIIIlI) {
            lllllIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlll(Object obj) {
        return obj != null;
    }

    public static void f() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[2]).interact(lIIll[lIlIl[17]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[18]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void g() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[19]).interact(lIIll[lIlIl[13]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[20]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void n() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[17]).interact(lIIll[lIlIl[30]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[31]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static boolean llIIlII(int i) {
        return i == 0;
    }

    private static boolean llIIIll(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIlI();
        llIIIIl();
        a = new String[lIlIl[0]];
    }

    public static void d() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[13]).interact(lIIll[lIlIl[4]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[14]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static String lIlllIl(String lllllIIlIIlllII, String lllllIIlIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIlIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIIlIIllllI = Cipher.getInstance("Blowfish");
            lllllIIlIIllllI.init(lIlIl[2], secretKeySpec);
            return new String(lllllIIlIIllllI.doFinal(Base64.getDecoder().decode(lllllIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIIlIIlllIl) {
            lllllIIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIl(int i) {
        return i != 0;
    }

    public static void a() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[10]).interact(lIIll[lIlIl[0]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[1]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static void llIIIIl() {
        lIIll = new String[lIlIl[34]];
        lIIll[lIlIl[0]] = lIlllIl("AH878cOyvu0=", "LXKDI");
        lIIll[lIlIl[1]] = lIllllI("zWAyVzHtmaw=", "yscnC");
        lIIll[lIlIl[2]] = lIlllIl("ebuvvpU+Pg0=", "wWEnS");
        lIIll[lIlIl[7]] = lIllllI("CMH0h9EEId0=", "ToPZH");
        lIIll[lIlIl[12]] = lIlllll("FC0mNhs2JQ==", "DHTPt");
        lIIll[lIlIl[8]] = lIlllll("BTob", "PHrSv");
        lIIll[lIlIl[4]] = lIlllll("JikxKRYEIQ==", "vLCOy");
        lIIll[lIlIl[14]] = lIllllI("R3hT0dzQLpg=", "IUIzX");
        lIIll[lIlIl[15]] = lIlllll("JA05HAwGBQ==", "thKzc");
        lIIll[lIlIl[16]] = lIllllI("JkZpGl3uCo8=", "ehEKI");
        lIIll[lIlIl[17]] = lIllllI("aW+GRhkVUzY=", "UISGg");
        lIIll[lIlIl[18]] = lIlllIl("psekr+H8OmI=", "FZJNe");
        lIIll[lIlIl[13]] = lIlllll("JDI1AAMGOg==", "tWGfl");
        lIIll[lIlIl[20]] = lIlllll("HTUO", "HGgLf");
        lIIll[lIlIl[21]] = lIlllIl("A1j/UHhCISA=", "NFBTB");
        lIIll[lIlIl[11]] = lIllllI("L+UCvt/VZ/w=", "UIrYo");
        lIIll[lIlIl[22]] = lIllllI("Ypmk0y2sdDY=", "rzyLp");
        lIIll[lIlIl[23]] = lIllllI("+pMLuYFsDVo=", "aYIWx");
        lIIll[lIlIl[24]] = lIllllI("mHno/Ts8ztI=", "FCkxN");
        lIIll[lIlIl[19]] = lIlllll("EDkH", "EKnIB");
        lIIll[lIlIl[10]] = lIlllll("Gy8ZITY5Jw==", "KJkGY");
        lIIll[lIlIl[25]] = lIllllI("f5Iw+Rduxpw=", "ebsvQ");
        lIIll[lIlIl[26]] = lIllllI("F1XlAPE191A=", "gkMWV");
        lIIll[lIlIl[27]] = lIlllIl("Mg2CkbTVFzQ=", "lesQE");
        lIIll[lIlIl[28]] = lIlllIl("qZC3qV4LwOw=", "mrdRv");
        lIIll[lIlIl[29]] = lIlllll("MDA9", "eBTVE");
        lIIll[lIlIl[30]] = lIlllIl("gU06m/Xrh/k=", "GcpPZ");
        lIIll[lIlIl[31]] = lIlllIl("P5Sii5abE+0=", "KlgYi");
        lIIll[lIlIl[32]] = lIllllI("sFi7r9jjK6A=", "cnrxe");
        lIIll[lIlIl[33]] = lIlllIl("4G702yrCZa0=", "QtCdd");
    }

    public static void l() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[18]).interact(lIIll[lIlIl[26]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[27]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(int[] iArr) {
        int i = lIlIl[0];
        while (llIIIll(i, iArr.length)) {
            int[] iArr2 = new int[lIlIl[1]];
            iArr2[lIlIl[0]] = iArr[i];
            if (llIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIl[1]];
                iArr3[lIlIl[0]] = iArr[i];
                if (llIIlII(Equipment.contains(iArr3) ? 1 : 0)) {
                    return lIlIl[0];
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((((89 + 137) - 145) + 129) ^ (((55 + 67) - 9) + 33)) & (((182 ^ 159) ^ (95 ^ 54)) ^ (-" ".length()));
            }
        }
        return lIlIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public static void a(String str) {
        Clues.f0c = "Selecting music: " + str;
        if (llIIlII(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
            Tabs.open(Tab.MUSIC);
            Time.sleepTicks(lIlIl[2]);
            "".length();
        }
        if (llIIlIl(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
            if (llIIllI(Widgets.get(lIlIl[3], lIlIl[0])) && llIIlIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Widget[] children = Widgets.get(lIlIl[3], lIlIl[4]).getChildren();
            Widget widget = Widgets.get(lIlIl[5], lIlIl[6]);
            Widget child = Widgets.get(lIlIl[3], lIlIl[0]).getChild(lIlIl[0]);
            if (llIIlll(child)) {
                System.out.println(str);
                Mouse.click(child.getClickPoint().getX(), child.getClickPoint().getY(), (boolean) lIlIl[1]);
                Time.sleepTicks(k.c(lIlIl[2], lIlIl[7]));
                "".length();
            }
            try {
                if (llIIlll(widget)) {
                    Keyboard.type(str, (boolean) lIlIl[0]);
                    Time.sleepTicks(k.c(lIlIl[1], lIlIl[2]));
                    "".length();
                }
                List list = (List) Arrays.stream(children).filter(widget2 -> {
                    return widget2.getText().contains(str);
                }).collect(Collectors.toList());
                if (llIIlII(list.isEmpty() ? 1 : 0)) {
                    Mouse.click(((Widget) list.get(lIlIl[0])).getClickPoint().getX(), ((Widget) list.get(lIlIl[0])).getClickPoint().getY(), (boolean) lIlIl[1]);
                    Time.sleepTicks(k.c(lIlIl[8], lIlIl[4]));
                    "".length();
                    Time.sleepTicks(lIlIl[8]);
                    "".length();
                }
                "".length();
                if (" ".length() == 0) {
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
                e.printStackTrace();
            }
        }
    }

    private static boolean llIIllI(Object obj) {
        return obj == null;
    }

    public static void o() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[20]).interact(lIIll[lIlIl[32]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[33]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static String lIlllll(String lllllIIlIllIIIl, String lllllIIlIllIIII) {
        String lllllIIlIllIIIl2 = new String(Base64.getDecoder().decode(lllllIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIIlIlIllll = new StringBuilder();
        char[] charArray = lllllIIlIllIIII.toCharArray();
        int lllllIIlIlIllIl = lIlIl[0];
        char[] charArray2 = lllllIIlIllIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIl[0];
        while (llIIIll(i, length)) {
            lllllIIlIlIllll.append((char) (charArray2[i] ^ charArray[lllllIIlIlIllIl % charArray.length]));
            "".length();
            lllllIIlIlIllIl++;
            i++;
            "".length();
            if ((((((205 + 69) - 110) + 55) ^ (((34 + 7) - (-95)) + 15)) & (((102 ^ 20) ^ (70 ^ 120)) ^ (-" ".length()))) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllIIlIlIllll);
    }

    public static void m() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[21]).interact(lIIll[lIlIl[28]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[29]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void b() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[11]).interact(lIIll[lIlIl[2]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[7]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void e() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[8]).interact(lIIll[lIlIl[15]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[16]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void j() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[24]).interact(lIIll[lIlIl[24]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[19]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void k() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[16]).interact(lIIll[lIlIl[10]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[25]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void h() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[14]).interact(lIIll[lIlIl[21]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[11]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static void llIIIlI() {
        lIlIl = new int[35];
        lIlIl[0] = (233 ^ 195) & ((232 ^ 194) ^ (-1));
        lIlIl[1] = " ".length();
        lIlIl[2] = "  ".length();
        lIlIl[3] = (((12 ^ 29) + (241 ^ 148)) - (22 ^ 16)) + ((70 + 44) - 70) + 83;
        lIlIl[4] = (((146 + 71) - 208) + 170) ^ (((60 + 106) - 150) + 165);
        lIlIl[5] = (("  ".length() + (20 ^ 62)) - (-(46 ^ 97))) + (123 ^ 92);
        lIlIl[6] = (97 ^ 77) ^ (154 ^ 147);
        lIlIl[7] = "   ".length();
        lIlIl[8] = 140 ^ 137;
        lIlIl[9] = (((((165 + 38) - 123) + 88) + (219 ^ 133)) - (((165 + 23) - (-26)) + 24)) + ((78 + 0) - 75) + 189;
        lIlIl[10] = 148 ^ 128;
        lIlIl[11] = (253 ^ 171) ^ (68 ^ 29);
        lIlIl[12] = (63 ^ 26) ^ (24 ^ 57);
        lIlIl[13] = (78 ^ 123) ^ (91 ^ 98);
        lIlIl[14] = 136 ^ 143;
        lIlIl[15] = (172 ^ 162) ^ (124 ^ 122);
        lIlIl[16] = 191 ^ 182;
        lIlIl[17] = 79 ^ 69;
        lIlIl[18] = (127 ^ 51) ^ (12 ^ 75);
        lIlIl[19] = (120 ^ 58) ^ (196 ^ 149);
        lIlIl[20] = (129 ^ 149) ^ (30 ^ 7);
        lIlIl[21] = (116 ^ 91) ^ (97 ^ 64);
        lIlIl[22] = ((114 ^ 64) & ((114 ^ 64) ^ (-1))) ^ (132 ^ 148);
        lIlIl[23] = 69 ^ 84;
        lIlIl[24] = (242 ^ 194) ^ (191 ^ 157);
        lIlIl[25] = 213 ^ 192;
        lIlIl[26] = 40 ^ 62;
        lIlIl[27] = (((23 + 96) - 16) + 37) ^ (((3 + 15) - (-96)) + 41);
        lIlIl[28] = 163 ^ 187;
        lIlIl[29] = (((135 + 139) - 139) + 18) ^ (((125 + 38) - 109) + 74);
        lIlIl[30] = (28 ^ 13) ^ (167 ^ 172);
        lIlIl[31] = (157 ^ 160) ^ (149 ^ 179);
        lIlIl[32] = (194 ^ 146) ^ (143 ^ 195);
        lIlIl[33] = 136 ^ 149;
        lIlIl[34] = 133 ^ 155;
    }

    public static void c() {
        if (llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get(lIlIl[9], lIlIl[2]).getChild(lIlIl[12]).interact(lIIll[lIlIl[12]]);
            Time.sleepTicks(lIlIl[2]);
            "".length();
            n.a(lIIll[lIlIl[8]], a);
        }
        if (llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }
}
