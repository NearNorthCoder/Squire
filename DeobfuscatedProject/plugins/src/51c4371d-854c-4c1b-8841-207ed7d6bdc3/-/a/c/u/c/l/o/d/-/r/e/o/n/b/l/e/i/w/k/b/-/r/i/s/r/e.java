/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.World
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.util.WorldUtil
 *  net.runelite.http.api.worlds.World
 *  net.runelite.http.api.worlds.WorldResult
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.n;
import gg.squire.account.AccBuilderBarrows;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
import net.runelite.http.api.worlds.WorldResult;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class e {
    private static final /* synthetic */ int Y;
    private static final /* synthetic */ int ab;
    private static final /* synthetic */ int aa;
    private static /* synthetic */ String[] llllIlll;
    static final /* synthetic */ WorldArea U;
    private static final /* synthetic */ int[] ad;
    static /* synthetic */ WorldPoint ag;
    static final /* synthetic */ WorldArea T;
    private static final /* synthetic */ int Z;
    private static /* synthetic */ int[] lllllIIl;
    private static final /* synthetic */ int ac;
    public static /* synthetic */ int[] af;
    private static final /* synthetic */ long V;
    private static final /* synthetic */ Map<Integer, Integer> X;
    public static /* synthetic */ WorldPoint ae;
    private static final /* synthetic */ long W;
    public static final /* synthetic */ String R;
    public static final /* synthetic */ ThreadLocalRandom S;
    static /* synthetic */ WorldArea ah;

    private static String llIIllIllIl(String lIIllIIllIllIlI, String lIIllIIllIllIIl) {
        try {
            SecretKeySpec lIIllIIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIllIllIIl.getBytes(StandardCharsets.UTF_8)), lllllIIl[11]), "DES");
            Cipher lIIllIIllIllllI = Cipher.getInstance("DES");
            lIIllIIllIllllI.init(lllllIIl[6], lIIllIIllIlllll);
            return new String(lIIllIIllIllllI.doFinal(Base64.getDecoder().decode(lIIllIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIllIlllIl) {
            lIIllIIllIlllIl.printStackTrace();
            return null;
        }
    }

    public static boolean i(int n2) {
        int[] nArray = new int[lllllIIl[0]];
        nArray[e.lllllIIl[4]] = n2;
        return Bank.contains((int[])nArray);
    }

    public static int I() {
        return e.j(lllllIIl[76]);
    }

    private static boolean llIIllllllI(Object object) {
        return object == null;
    }

    public static boolean y() {
        boolean bl;
        if (!e.llIIlllIlll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lllllIIl[31]))) || e.llIIlllIlIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lllllIIl[34])))) {
            bl = lllllIIl[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x7C ^ 0x60) & ~(0xDE ^ 0xC2)) != 0;
            }
        } else {
            bl = lllllIIl[4];
        }
        return bl;
    }

    private static boolean llIIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static long t() {
        return V + (System.nanoTime() - W) / 1000000L;
    }

    private static void llIIlllIIll() {
        llllIlll = new String[lllllIIl[173]];
        e.llllIlll[e.lllllIIl[4]] = e.llIIllIllIl("TDWTmtq8tCMFBECPHxPfFg==", "bvccF");
        e.llllIlll[e.lllllIIl[0]] = e.llIIllIllIl("xn5UCxuCIqcf+y65rc8hCEi3qBZg0+9O", "zECMD");
        e.llllIlll[e.lllllIIl[6]] = e.llIIllIlllI("HgcQPmoeAREpKzwBDiM/PQ==", "NhbJJ");
        e.llllIlll[e.lllllIIl[5]] = e.llIIllIllIl("kY9N8664mozqEV6IuWizX280qQlwQ81I", "qiHnA");
        e.llllIlll[e.lllllIIl[7]] = e.llIIllIllIl("Ca/7cQbFIl+/bFVmv+5BDIjfEsSlakh/", "FrAhm");
        e.llllIlll[e.lllllIIl[8]] = e.llIIllIllll("+WxYSg/MprQ=", "XbeXA");
        e.llllIlll[e.lllllIIl[9]] = e.llIIllIllIl("/fjAoMApaapOQc3LNU66ZTHm7twM6hT+", "ivthR");
        e.llllIlll[e.lllllIIl[10]] = e.llIIllIllIl("FIbsbunLvA3zj6V5/PbVK2cWQjV/+Soi", "GGukh");
        e.llllIlll[e.lllllIIl[11]] = e.llIIllIllIl("cVKLv7VjE7FRM0QlikPEk27REW4qJscY", "yklAa");
        e.llllIlll[e.lllllIIl[12]] = e.llIIllIllll("Phwp9t8T2FQ07I+QnOySSdzt0UuUt4xL", "Ucpav");
        e.llllIlll[e.lllllIIl[13]] = e.llIIllIllIl("GbwlwXn1FDcUYDNgRceYowwOPY8wl6Bv", "Fkykg");
        e.llllIlll[e.lllllIIl[14]] = e.llIIllIlllI("aVZ3ah4o", "LsGOz");
        e.llllIlll[e.lllllIIl[15]] = e.llIIllIlllI("GlM+MRg8GxE4JTAKCTgqKRkmBR84NTALCjQADAM3dx0QDQk2HT4jBD0aLxEHPDUPEQc8RxYcHw==", "Yibdk");
        e.llllIlll[e.lllllIIl[16]] = e.llIIllIllll("IdumM8r3LlZ8LWihRuDcfA==", "RYbLy");
        e.llllIlll[e.lllllIIl[19]] = e.llIIllIlllI("ERs8JBE=", "RwSWt");
        e.llllIlll[e.lllllIIl[20]] = e.llIIllIllIl("ZuvtNVNhavoriaYeJRx7rpHHR6Wve0Zn", "TrqpR");
        e.llllIlll[e.lllllIIl[26]] = e.llIIllIllIl("6HU4kG8LH88=", "WiiBt");
        e.llllIlll[e.lllllIIl[27]] = e.llIIllIllll("0OqbNbhxQciF0WeDaxnw5InD9yj31Edd", "hSQas");
        e.llllIlll[e.lllllIIl[30]] = e.llIIllIllll("LT3xSg22sn2drjjUnCTPXA==", "XaxQg");
        e.llllIlll[e.lllllIIl[32]] = e.llIIllIlllI("Li0LMRQf", "zBlVx");
        e.llllIlll[e.lllllIIl[33]] = e.llIIllIllll("SrJWdNYZnEE=", "RAqjU");
        e.llllIlll[e.lllllIIl[36]] = e.llIIllIllIl("2CscODphtWk=", "eDjIB");
        e.llllIlll[e.lllllIIl[39]] = e.llIIllIllll("Dh13Cs3xaAk8aEJ+TeVcbg==", "bqxQL");
        e.llllIlll[e.lllllIIl[29]] = e.llIIllIlllI("EioGIg==", "EOgPD");
        e.llllIlll[e.lllllIIl[40]] = e.llIIllIllIl("iJfTms3km44=", "CCIgc");
        e.llllIlll[e.lllllIIl[41]] = e.llIIllIllIl("/zsyXi3/nQI=", "OtwoF");
        e.llllIlll[e.lllllIIl[42]] = e.llIIllIllIl("XKXtpeAjwYo=", "wiauz");
        e.llllIlll[e.lllllIIl[43]] = e.llIIllIllIl("i9Xggufk5ZU=", "TmfBo");
        e.llllIlll[e.lllllIIl[44]] = e.llIIllIlllI("AQgDCik=", "DyvcY");
        e.llllIlll[e.lllllIIl[18]] = e.llIIllIllll("9N5EKiTyr9vVFFpaYNftxMamurCdkSSB", "MYslr");
        e.llllIlll[e.lllllIIl[57]] = e.llIIllIllll("l2CUdQ+Up49DCr3Z273OsrvBzY3xLSv1", "iMyQf");
        e.llllIlll[e.lllllIIl[58]] = e.llIIllIlllI("LyUkJw==", "hDPBd");
        e.llllIlll[e.lllllIIl[38]] = e.llIIllIllll("w9aQjq74Kzc=", "wqInw");
        e.llllIlll[e.lllllIIl[59]] = e.llIIllIllll("R5y4o70wCICtov4g5NRC1Tn4ufNrWJ/X", "WxPmC");
        e.llllIlll[e.lllllIIl[60]] = e.llIIllIlllI("IggEQRsDSQEVHQMHFQkAAA1SFQYADA==", "lirao");
        e.llllIlll[e.lllllIIl[50]] = e.llIIllIlllI("GDU5Aw==", "HzjWD");
        e.llllIlll[e.lllllIIl[63]] = e.llIIllIlllI("Oi47GiEXNXg6PQkk", "yAUnD");
        e.llllIlll[e.lllllIIl[64]] = e.llIIllIlllI("EREXHAETABMZBx5ODQMHHg==", "pagph");
        e.llllIlll[e.lllllIIl[68]] = e.llIIllIllll("g+HP3Ll4hSHWW9F0Gu4F1w==", "oYuED");
        e.llllIlll[e.lllllIIl[69]] = e.llIIllIllIl("jfKwfAyj2FFjlFwq9JeABw==", "EOPDj");
        e.llllIlll[e.lllllIIl[24]] = e.llIIllIllll("wfusVgffE7EdviyQXNoFjA==", "syccc");
        e.llllIlll[e.lllllIIl[35]] = e.llIIllIllll("c98o43OYrs8rDsBb4jp7+Q==", "bmchA");
        e.llllIlll[e.lllllIIl[70]] = e.llIIllIlllI("Lg8EPiw=", "jjeJD");
        e.llllIlll[e.lllllIIl[71]] = e.llIIllIllll("Wa5gbeFf2sk=", "RMpaW");
        e.llllIlll[e.lllllIIl[72]] = e.llIIllIllll("4X/I/7qV3TQ=", "qLqfi");
        e.llllIlll[e.lllllIIl[73]] = e.llIIllIlllI("BgkR", "SztsU");
        e.llllIlll[e.lllllIIl[77]] = e.llIIllIllIl("04tzrSR0t3I=", "WDZUm");
        e.llllIlll[e.lllllIIl[79]] = e.llIIllIllll("MjhnLZgeis0=", "zWXyW");
        e.llllIlll[e.lllllIIl[80]] = e.llIIllIllll("0ColAQPEesU=", "NaJuR");
        e.llllIlll[e.lllllIIl[81]] = e.llIIllIlllI("HAU6", "LsjFN");
        e.llllIlll[e.lllllIIl[74]] = e.llIIllIlllI("Dzk1Aw==", "GPRkd");
        e.llllIlll[e.lllllIIl[84]] = e.llIIllIllIl("P/N7ooltzdc=", "DXrGy");
        e.llllIlll[e.lllllIIl[85]] = e.llIIllIlllI("GAcGKg==", "ZbrKI");
        e.llllIlll[e.lllllIIl[86]] = e.llIIllIlllI("OCc2Ag==", "ZBBci");
        e.llllIlll[e.lllllIIl[87]] = e.llIIllIllll("AAcA6HK8xhw=", "zmTSP");
        e.llllIlll[e.lllllIIl[88]] = e.llIIllIllIl("kWLTIPmB2cc=", "lsAfw");
        e.llllIlll[e.lllllIIl[89]] = e.llIIllIlllI("IiEELiMDJA8lLh82", "qQaKG");
        e.llllIlll[e.lllllIIl[90]] = e.llIIllIllll("1FtBleVeGb8=", "fJfxF");
        e.llllIlll[e.lllllIIl[91]] = e.llIIllIlllI("KysBOQ==", "iNuXs");
        e.llllIlll[e.lllllIIl[93]] = e.llIIllIllll("H9SIfeZtHky05+YQiKM+9PCUmEdsnctJ", "bbMSL");
        e.llllIlll[e.lllllIIl[94]] = e.llIIllIlllI("EBkAHQwdAws=", "svnie");
        e.llllIlll[e.lllllIIl[23]] = e.llIIllIllll("S1QpjSrproHsRSIRF1iQPA==", "ZiLHs");
        e.llllIlll[e.lllllIIl[95]] = e.llIIllIlllI("LgMYBCsjGRM=", "MlvpB");
        e.llllIlll[e.lllllIIl[96]] = e.llIIllIllIl("tIx1vJQF0MSWGFNjAnjZ6w==", "xOvcv");
        e.llllIlll[e.lllllIIl[98]] = e.llIIllIllIl("7mrQIRRCmvsKhQ90nLFjA6w8pZFo6euqhOmL3QokRJFPJ4Mg7Pu+ja1xaXXeuNZ4542TaKe59rk=", "VEEUw");
    }

    public static void D() {
        if (e.llIIlllIlIl(e.j(lllllIIl[66]))) {
            Widget lIIllIIllllIlII;
            if (e.llIIlllIlIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lllllIIl[0]);
                "".length();
            }
            if (e.llIIlllIlll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.llIIllllIlI(lIIllIIllllIlII = Widgets.get((int)lllllIIl[67], (int)lllllIIl[57]))) {
                lIIllIIllllIlII.interact(llllIlll[lllllIIl[68]]);
                Time.sleepTicks((int)lllllIIl[0]);
                "".length();
            }
        }
    }

    public static void c(String string) {
        FileWriter fileWriter = new FileWriter(llllIlll[lllllIIl[15]]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string + System.getProperty(llllIlll[lllllIIl[16]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static void B() {
        Widget widget = Widgets.get((int)lllllIIl[37], (int)lllllIIl[38]);
        if (e.llIIllllIlI(widget)) {
            widget.interact(llllIlll[lllllIIl[39]]);
            Time.sleepTicks((int)lllllIIl[0]);
            "".length();
        }
    }

    private static void llIIlllIlII() {
        lllllIIl = new int[258];
        e.lllllIIl[0] = " ".length();
        e.lllllIIl[1] = 222 + 84 - 195 + 118;
        e.lllllIIl[2] = 26 + 60 - 77 + 153;
        e.lllllIIl[3] = 206 + 171 - 237 + 68 + (0x1F ^ 7) - (23 + 2 - -21 + 82) + (80 + 18 - -25 + 4);
        e.lllllIIl[4] = (0x90 ^ 0x94 ^ (0x69 ^ 0x4C)) & (37 + 42 - -9 + 84 ^ 58 + 18 - 52 + 117 ^ -" ".length());
        e.lllllIIl[5] = "   ".length();
        e.lllllIIl[6] = "  ".length();
        e.lllllIIl[7] = 111 + 94 - 202 + 140 ^ 110 + 109 - 105 + 25;
        e.lllllIIl[8] = 0x50 ^ 0x55;
        e.lllllIIl[9] = 0x3E ^ 0x38;
        e.lllllIIl[10] = 0xB7 ^ 0xB0;
        e.lllllIIl[11] = 44 + 0 - -82 + 38 ^ 1 + 145 - 12 + 38;
        e.lllllIIl[12] = 0x7E ^ 0x77;
        e.lllllIIl[13] = 0xAF ^ 0xA5;
        e.lllllIIl[14] = 0x84 ^ 0x8F;
        e.lllllIIl[15] = 0x70 ^ 0x7C;
        e.lllllIIl[16] = 0x3E ^ 0x33;
        e.lllllIIl[17] = -(0xFFFFFEB7 & 0x754F) & (0xFFFFFFBE & 0x76DF);
        e.lllllIIl[18] = 0x87 ^ 0xAF ^ (0x4F ^ 0x7A);
        e.lllllIIl[19] = 120 + 157 - 156 + 49 ^ 45 + 65 - 85 + 139;
        e.lllllIIl[20] = 0x6B ^ 0x5F ^ (0x6B ^ 0x50);
        e.lllllIIl[21] = 0xFFFFDC73 & 0x2FEC;
        e.lllllIIl[22] = -(0xFFFFF3FF & 0x3EAA) & (0xFFFFFFFF & 0x3FFF);
        e.lllllIIl[23] = 0x4A ^ 0x77;
        e.lllllIIl[24] = 75 + 36 - 85 + 148 ^ 73 + 131 - 138 + 68;
        e.lllllIIl[25] = -(0xFFFFF55D & 0x2AA3) & (0xFFFFBF77 & 0x7FCF);
        e.lllllIIl[26] = 0x39 ^ 0x14 ^ (0x1D ^ 0x20);
        e.lllllIIl[27] = 0x6D ^ 0x7C;
        e.lllllIIl[28] = (0x79 ^ 0x1D) + (0x1B ^ 0x61) - (31 + 106 - 40 + 75) + (0x38 ^ 0x6C);
        e.lllllIIl[29] = 0xD6 ^ 0xC1;
        e.lllllIIl[30] = 0xEB ^ 0x9F ^ (0x12 ^ 0x74);
        e.lllllIIl[31] = 0xFFFFFDEF & 0x3B7C;
        e.lllllIIl[32] = 0x8A ^ 0x99;
        e.lllllIIl[33] = 0x54 ^ 0x40;
        e.lllllIIl[34] = -(0xFFFFF7B7 & 0x4CDB) & (0xFFFFFFFF & 0x7DFF);
        e.lllllIIl[35] = 0x9C ^ 0xB5;
        e.lllllIIl[36] = 0xBC ^ 0xA9;
        e.lllllIIl[37] = 0xF ^ 0x7B;
        e.lllllIIl[38] = 0x47 ^ 0x67;
        e.lllllIIl[39] = 0xB3 ^ 0xA5;
        e.lllllIIl[40] = 0xBD ^ 0xB1 ^ (0xB2 ^ 0xA6);
        e.lllllIIl[41] = 0x5E ^ 0x47;
        e.lllllIIl[42] = 0xF ^ 0x15;
        e.lllllIIl[43] = 1 + 85 - 41 + 109 ^ 98 + 123 - 152 + 60;
        e.lllllIIl[44] = 0x26 ^ 0x6C ^ (0xC ^ 0x5A);
        e.lllllIIl[45] = 0xFFFFFC7D & 0x5B9F;
        e.lllllIIl[46] = 0xFFFF9BBD & 0x6DDF;
        e.lllllIIl[47] = 0xFFFFCD3F & 0x3FF7;
        e.lllllIIl[48] = -(0xFFFFB5EF & 0x7E73) & (0xFFFFFFFB & 0x3DFF);
        e.lllllIIl[49] = -(0xFFFFC7F7 & 0x7A8F) & (0xFFFFEFFF & 0x5FBE);
        e.lllllIIl[50] = 0x57 ^ 0x15 ^ (0xDD ^ 0xBC);
        e.lllllIIl[51] = 0xFFFFAF77 & 0x59FF;
        e.lllllIIl[52] = 0xFFFF9D3F & 0x6FFF;
        e.lllllIIl[53] = 0xD0 ^ 0x97;
        e.lllllIIl[54] = (0xA6 ^ 0x81) + (6 ^ 0x4C) - (0xB1 ^ 0x8C) + (0x1E ^ 0x45);
        e.lllllIIl[55] = -(0xFFFFD0CC & 0x7F37) & (0xFFFFDFBF & 0x79DF);
        e.lllllIIl[56] = -(0xFFFFEBCF & 0x34B7) & (0xFFFFBDFF & 0x6FDF);
        e.lllllIIl[57] = 0x98 ^ 0x86;
        e.lllllIIl[58] = 0x64 ^ 0x7B;
        e.lllllIIl[59] = 95 + 59 - 9 + 31 ^ 44 + 141 - 83 + 43;
        e.lllllIIl[60] = 0x66 ^ 0x33 ^ (0xFC ^ 0x8B);
        e.lllllIIl[61] = -(0xFFFF96BF & 0x7B43) & (0xFFFFDF7B & 0x3FBF);
        e.lllllIIl[62] = -(0xFFFFEB7B & 0x76A7) & (0xFFFFFF7F & 0x6FE7);
        e.lllllIIl[63] = 0xE5 ^ 0xC1;
        e.lllllIIl[64] = 0xA2 ^ 0x87;
        e.lllllIIl[65] = -" ".length();
        e.lllllIIl[66] = 51 + 124 - 4 + 1;
        e.lllllIIl[67] = 0xFFFFDFDD & 0x2273;
        e.lllllIIl[68] = 8 + 123 - -40 + 3 ^ 122 + 8 - 100 + 106;
        e.lllllIIl[69] = 0x53 ^ 0x74;
        e.lllllIIl[70] = 91 + 158 - 186 + 121 ^ 52 + 26 - -34 + 34;
        e.lllllIIl[71] = 0x42 ^ 0x69;
        e.lllllIIl[72] = 0x69 ^ 0x45;
        e.lllllIIl[73] = 0xAC ^ 0x81;
        e.lllllIIl[74] = 0xA4 ^ 0x96;
        e.lllllIIl[75] = 24 + 13 - 9 + 125;
        e.lllllIIl[76] = 0x33 ^ 0x25 ^ (0x1C ^ 0x6F);
        e.lllllIIl[77] = 0xE ^ 0x20;
        e.lllllIIl[78] = 0xFFFF8FDE & 0x77BF;
        e.lllllIIl[79] = 0x37 ^ 0x18;
        e.lllllIIl[80] = 7 ^ 0x53 ^ (0x1B ^ 0x7F);
        e.lllllIIl[81] = 38 + 147 - 122 + 178 ^ 60 + 136 - 122 + 118;
        e.lllllIIl[82] = -(0xFFFFFE3F & 0x7BE5) & (0xFFFFFBFE & Short.MAX_VALUE);
        e.lllllIIl[83] = 0xFFFFD3DF & 0x2E35;
        e.lllllIIl[84] = 0x95 ^ 0xA6;
        e.lllllIIl[85] = 0x9B ^ 0xAF;
        e.lllllIIl[86] = 0xEB ^ 0xB5 ^ (0xFB ^ 0x90);
        e.lllllIIl[87] = 0x7F ^ 0x49;
        e.lllllIIl[88] = 0x54 ^ 0x63;
        e.lllllIIl[89] = 18 + 53 - -48 + 70 ^ 47 + 123 - 151 + 114;
        e.lllllIIl[90] = 139 + 112 - 137 + 75 ^ 105 + 129 - 110 + 8;
        e.lllllIIl[91] = 0x4D ^ 0x77;
        e.lllllIIl[92] = 0x15 ^ 0x71;
        e.lllllIIl[93] = 141 + 113 - 209 + 121 ^ 78 + 25 - 58 + 112;
        e.lllllIIl[94] = 0x20 ^ 0x1C;
        e.lllllIIl[95] = 0x8E ^ 0xB0;
        e.lllllIIl[96] = 0xBE ^ 0xAD ^ (0x19 ^ 0x35);
        e.lllllIIl[97] = 214 + 86 - 138 + 55;
        e.lllllIIl[98] = 0xC1 ^ 0x81;
        e.lllllIIl[99] = 105 + 40 - 102 + 150;
        e.lllllIIl[100] = (0xF9 ^ 0xB9) + (61 + 19 - 8 + 92) - (40 + 158 - 116 + 115) + (70 + 161 - 72 + 29);
        e.lllllIIl[101] = 0xFFFFDFFF & 0x2C76;
        e.lllllIIl[102] = -(0xFFFFBEA1 & 0x61DF) & (0xFFFFEFFD & 0x3CFF);
        e.lllllIIl[103] = 0xFFFFFC7F & 0xFFE;
        e.lllllIIl[104] = 0xFFFF9CAD & 0x6FD6;
        e.lllllIIl[105] = -(0xFFFFFF9F & 0x1EB) & (0xFFFFBFFB & 0x4DFE);
        e.lllllIIl[106] = -(0xFFFFF7DB & 0x5837) & (0xFFFFDF7F & 0x7DFF);
        e.lllllIIl[107] = 0x52 ^ 0x4F ^ (0x4C ^ 0x3A);
        e.lllllIIl[108] = 0xFFFFD9FB & 0x275E;
        e.lllllIIl[109] = 0xFFFFEBBA & 0x1577;
        e.lllllIIl[110] = 0xFFFFE176 & 0x1FBF;
        e.lllllIIl[111] = -(0xFFFFFAB4 & 0x57DB) & (0xFFFFF3FF & 0x5FEF);
        e.lllllIIl[112] = -(0xFFFFFC17 & 0x7BFD) & (0xFFFFFB7F & 0x7DF7);
        e.lllllIIl[113] = 0xFFFF8FEE & 0x7175;
        e.lllllIIl[114] = 0xFFFFB165 & 0x4FFF;
        e.lllllIIl[115] = 0xFFFF856F & 0x7BF6;
        e.lllllIIl[116] = 0xFFFFE9B7 & 0x17CA;
        e.lllllIIl[117] = 0xFFFF93FB & 0x6D8F;
        e.lllllIIl[118] = -(0xFFFFEECF & 0x5F36) & (0xFFFFEFF7 & 0x5FDF);
        e.lllllIIl[119] = -(0xFFFFDEDB & 0x3F36) & (0xFFFF9FFF & Short.MAX_VALUE);
        e.lllllIIl[120] = -(0xFFFFF6F9 & 0x7F07) & (0xFFFFFFEF & 0x77FF);
        e.lllllIIl[121] = 0xFFFFE1F1 & 0x1FFE;
        e.lllllIIl[122] = -(0xFFFFDAEA & 0x3DB7) & (0xFFFF9BFB & 0x7EBD);
        e.lllllIIl[123] = 0xFFFF82F6 & 0x7F0D;
        e.lllllIIl[124] = -(0xFFFFCA7D & 0x7D87) & (0xFFFFE9FE & 0x5F3F);
        e.lllllIIl[125] = 0xFFFFE5EF & 0x1BFB;
        e.lllllIIl[126] = -(0xFFFFAAB9 & 0x7DF7) & (0xFFFFFBFF & 0x2DFE);
        e.lllllIIl[127] = 0xFFFFAFFA & 0x5167;
        e.lllllIIl[128] = -(0xFFFFDEE1 & 0x773F) & (0xFFFFD7FD & Short.MAX_VALUE);
        e.lllllIIl[129] = -(0xFFFFEEB6 & 0x3BFF) & (0xFFFFAFF7 & 0x7BFF);
        e.lllllIIl[130] = -(0xFFFFFED3 & 0x7B6D) & (0xFFFFFF7D & 0x7BF3);
        e.lllllIIl[131] = 0xFFFFBB3B & 0x45FF;
        e.lllllIIl[132] = -(0xFFFFF7C2 & 0x3EBF) & (0xFFFFB7F7 & 0x7FFB);
        e.lllllIIl[133] = 0xFFFFB775 & 0x49CE;
        e.lllllIIl[134] = 0xFFFF9947 & 0x67FD;
        e.lllllIIl[135] = 0xFFFFBDD8 & 0x436F;
        e.lllllIIl[136] = 0xFFFFDBBF & 0x25FD;
        e.lllllIIl[137] = -(0xFFFFF53D & 0xEE3) & (0xFFFF85F2 & 0x7FFD);
        e.lllllIIl[138] = 0xFFFFE9DE & 0x17FF;
        e.lllllIIl[139] = 0xFFFFA9EF & 0x57FA;
        e.lllllIIl[140] = -(0xFFFFEEBC & 0x1F47) & (0xFFFFEFFF & 0x1FEF);
        e.lllllIIl[141] = 0xFFFF99FB & 0x67FF;
        e.lllllIIl[142] = 0xFFFFCE2B & 0x33DE;
        e.lllllIIl[143] = -(0xFFFFFADB & 0x35B5) & (0xFFFFBBFE & 0x75DB);
        e.lllllIIl[144] = 0xFFFF8FF7 & 0x71D9;
        e.lllllIIl[145] = 0xFFFFAFD4 & 0x522B;
        e.lllllIIl[146] = -(0xFFFFF1F3 & 0x5ECD) & (0xFFFFFAEF & 0x57FF);
        e.lllllIIl[147] = -" ".length() & (0xFFFFF97F & 0x7F9);
        e.lllllIIl[148] = -(68 + 163 - 177 + 126) & (0xFFFFB7FF & 0x49FF);
        e.lllllIIl[149] = -(0xFFFFFF0F & 0x7AF7) & (0xFFFFFFFF & 0x7BFF);
        e.lllllIIl[150] = -(0xFFFFEE27 & 0x35F9) & (0xFFFFEDFF & 0x3771);
        e.lllllIIl[151] = 0xFFFFB67B & 0x4B86;
        e.lllllIIl[152] = 0xFFFF81E7 & 0x7F5F;
        e.lllllIIl[153] = 0xFFFFA5F2 & 0x5BED;
        e.lllllIIl[154] = -(0xFFFFF7EF & 0x4A12) & (0xFFFFC7DD & 0x7B7B);
        e.lllllIIl[155] = 0xFFFFBDFF & 0x43DF;
        e.lllllIIl[156] = -(0xFFFF9AFD & 0x6F13) & (0xFFFF8BFD & Short.MAX_VALUE);
        e.lllllIIl[157] = 0xFFFFC57F & 0x3BD6;
        e.lllllIIl[158] = -(0xFFFFFC71 & 0x4FCF) & (0xFFFFCFFF & 0x7DFE);
        e.lllllIIl[159] = -(0xFFFFDFBF & 0x3E72) & (0xFFFF9F7B & 0x7FF5);
        e.lllllIIl[160] = 0xFFFFC55F & 0x3BFE;
        e.lllllIIl[161] = -(0xFFFFFE9D & 0x377B) & (0xFFFFF75F & 0x3FF9);
        e.lllllIIl[162] = 0xFFFFE57F & 0x1BD5;
        e.lllllIIl[163] = 0xFFFFDFF7 & 0x21AE;
        e.lllllIIl[164] = 0xFFFFA5DF & 0x5BEF;
        e.lllllIIl[165] = 0xFFFFF377 & 0xDFE;
        e.lllllIIl[166] = 0xFFFFDBFF & 0x2578;
        e.lllllIIl[167] = 0xFFFF9BF1 & 0x655E;
        e.lllllIIl[168] = 0xFFFF8B7D & 0x75CB;
        e.lllllIIl[169] = 0xFFFFB1DF & 0x4F6B;
        e.lllllIIl[170] = -(0xFFFFECF3 & 0x7FBF) & (0xFFFFFFFF & 0x6DFF);
        e.lllllIIl[171] = 0xFFFFF9FD & 0x732;
        e.lllllIIl[172] = 0xFFFFF36A & 0xDFF;
        e.lllllIIl[173] = 0xFB ^ 0xC3 ^ (0xDD ^ 0xA4);
        e.lllllIIl[174] = 0xFFFF9BCF & 0x6573;
        e.lllllIIl[175] = 0x80 ^ 0xC2;
        e.lllllIIl[176] = 0xFFFF853B & 0x7BF7;
        e.lllllIIl[177] = 0x20 ^ 0x63;
        e.lllllIIl[178] = -(0xFFFF87ED & 0x7E5B) & (0xFFFFBFFF & 0x477D);
        e.lllllIIl[179] = 0x78 ^ 0x1A ^ (0x5F ^ 0x79);
        e.lllllIIl[180] = -(0xFFFFB9FB & 0x56CD) & (0xFFFF97FF & 0x79FF);
        e.lllllIIl[181] = 0xB0 ^ 0xBA ^ (0x24 ^ 0x6B);
        e.lllllIIl[182] = 0xFFFFF9FF & 0x777;
        e.lllllIIl[183] = 0x70 ^ 0x36;
        e.lllllIIl[184] = -(0xFFFFBDED & 0x7A97) & (0xFFFFBFFF & 0x79FE);
        e.lllllIIl[185] = 0xFFFFFFFB & 0x205;
        e.lllllIIl[186] = 0x54 ^ 0x1C;
        e.lllllIIl[187] = 0xFFFFF7FF & 0x92F;
        e.lllllIIl[188] = 0x8A ^ 0xBC ^ 76 + 95 - 47 + 3;
        e.lllllIIl[189] = 0xFFFFF5F9 & 0xB3E;
        e.lllllIIl[190] = 0xC ^ 0x46;
        e.lllllIIl[191] = -(0xFFFFFADB & 0x47E7) & (0xFFFFF7FF & 0x4BFB);
        e.lllllIIl[192] = 78 + 55 - -16 + 51 ^ 49 + 113 - 67 + 36;
        e.lllllIIl[193] = 0xFFFFA77D & 0x59BF;
        e.lllllIIl[194] = 0x34 ^ 0x78;
        e.lllllIIl[195] = 0xFFFF957F & 0x6BD3;
        e.lllllIIl[196] = 0x41 ^ 0xC;
        e.lllllIIl[197] = 0xFFFFB9D6 & 0x477D;
        e.lllllIIl[198] = 0x99 ^ 0xC4 ^ (0x9D ^ 0x8E);
        e.lllllIIl[199] = 0xFFFFD75F & 0x29F7;
        e.lllllIIl[200] = 0x8E ^ 0xC1;
        e.lllllIIl[201] = 0xFFFF91DB & 0x6F7F;
        e.lllllIIl[202] = 0x45 ^ 0x15;
        e.lllllIIl[203] = -(0xFFFFFFFC & 0x42A7) & (0xFFFFD3FF & 0x6FFF);
        e.lllllIIl[204] = 24 + 151 - -9 + 47 ^ 21 + 39 - -90 + 32;
        e.lllllIIl[205] = 0xFFFFDD7F & 0x23DF;
        e.lllllIIl[206] = 0xD0 ^ 0x9C ^ (0xAA ^ 0xB4);
        e.lllllIIl[207] = -(0xFFFFFFD5 & 0x362B) & (0xFFFFBFEF & 0x7777);
        e.lllllIIl[208] = 0xEC ^ 0xB0 ^ (0x41 ^ 0x4E);
        e.lllllIIl[209] = -(0xFFFFAFDC & 0x763B) & (0xFFFFE77F & 0x3FFF);
        e.lllllIIl[210] = 0x37 ^ 0x33 ^ (0xE0 ^ 0xB0);
        e.lllllIIl[211] = 0xFFFFDBEF & 0x257F;
        e.lllllIIl[212] = 0xAE ^ 0xBF ^ (0xB ^ 0x4F);
        e.lllllIIl[213] = -(0xFFFFD69C & 0x7FE7) & (0xFFFFD7FF & 0x7FF3);
        e.lllllIIl[214] = 0x7B ^ 0x2D;
        e.lllllIIl[215] = -(0xFFFFFC1F & 0x1FFB) & (0xFFFFDFFB & 0x3DFF);
        e.lllllIIl[216] = 0x76 ^ 0x21;
        e.lllllIIl[217] = -(0xFFFFB67B & 0x7B9E) & (0xFFFFFBFB & 0x37FF);
        e.lllllIIl[218] = 0x15 ^ 0x4D;
        e.lllllIIl[219] = -(0xFFFFF57B & 0x2E9D) & (0xFFFFBFFF & 0x65FC);
        e.lllllIIl[220] = 0xDA ^ 0x83;
        e.lllllIIl[221] = 0xFFFFF1F5 & 0xFEF;
        e.lllllIIl[222] = 177 + 95 - 238 + 161 ^ 44 + 109 - 118 + 118;
        e.lllllIIl[223] = -(0xFFFFFC3B & 0x33DD) & (0xFFFFFFFE & 0x31FF);
        e.lllllIIl[224] = 76 + 227 - 187 + 122 ^ 166 + 45 - 139 + 109;
        e.lllllIIl[225] = 0xFFFFB5F7 & 0x4BEF;
        e.lllllIIl[226] = 11 + 42 - 45 + 193 ^ 113 + 144 - 149 + 41;
        e.lllllIIl[227] = 0xFFFFF9F8 & 0x7EF;
        e.lllllIIl[228] = 0x20 ^ 0x7D;
        e.lllllIIl[229] = 0xFFFFB5FD & 0x4BEB;
        e.lllllIIl[230] = 0x7A ^ 0x24;
        e.lllllIIl[231] = 0xFFFFA9FB & 0x57FE;
        e.lllllIIl[232] = 0x5D ^ 0x2E ^ (0x7F ^ 0x53);
        e.lllllIIl[233] = -(0xFFFF82CF & 0x7F33) & (0xFFFFE3FF & 0x1FFE);
        e.lllllIIl[234] = 0x43 ^ 0x23;
        e.lllllIIl[235] = -(0xFFFFEF3B & 0x7AC7) & (0xFFFFEBFF & Short.MAX_VALUE);
        e.lllllIIl[236] = 0xD ^ 0x6C;
        e.lllllIIl[237] = -(0xFFFFFD1B & 0x5EE6) & (0xFFFFDFFF & 0x7DFF);
        e.lllllIIl[238] = 0xE ^ 0x7C ^ (0xA7 ^ 0xB7);
        e.lllllIIl[239] = 0xFFFFAFFF & 0x51FF;
        e.lllllIIl[240] = 0xE9 ^ 0x8A;
        e.lllllIIl[241] = -(0xFFFFDCBF & 0x77DB) & (0xFFFFF69F & 0x5FFF);
        e.lllllIIl[242] = 0xFFFFCBB6 & 0x364F;
        e.lllllIIl[243] = -(0xFFFFFCED & 0x33BB) & (0xFFFFFFAF & 0x32FF);
        e.lllllIIl[244] = 9 + 177 - 108 + 133 ^ 162 + 76 - 124 + 67;
        e.lllllIIl[245] = -(0xFFFFFF9F & 0xC73) & (0xFFFFBE9A & 0x4F7F);
        e.lllllIIl[246] = 0x4D ^ 0x71 ^ (0xD9 ^ 0x82);
        e.lllllIIl[247] = 0xFFFFBB6B & 0x469D;
        e.lllllIIl[248] = 132 + 3 - 7 + 114 ^ 88 + 19 - 17 + 64;
        e.lllllIIl[249] = -(0xFFFFFD3D & 0x3EF7) & (0xFFFFFFFF & 0x3E3F);
        e.lllllIIl[250] = 52 + 7 - -86 + 97 ^ 114 + 17 - 81 + 105;
        e.lllllIIl[251] = -(0xFFFFBCB7 & 0x5BDB) & (0xFFFFDEDE & 0x3BBF);
        e.lllllIIl[252] = 0xD1 ^ 0xBB;
        e.lllllIIl[253] = -(0xFFFFF641 & 0x1DFF) & (0xFFFFF6DD & 0x1F6F);
        e.lllllIIl[254] = 0xFFFFEFCE & 0x1CB9;
        e.lllllIIl[255] = -(0xFFFFD57F & 0x7BED) & (0xFFFFDFFF & 0x7DFF);
        e.lllllIIl[256] = -(0xFFFFB877 & 0x77AB) & (0xFFFFBBBF & 0x7FEF);
        e.lllllIIl[257] = -(179 + 126 - 213 + 134) & (0xFFFFDDEF & 0x2FF5);
    }

    public static int u() {
        int n2 = e.c(lllllIIl[4], af.length - lllllIIl[0]);
        return af[n2];
    }

    public static String h(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public static void k(int n2) {
        if (e.llIIlllllIl(Static.getClient().getWorld(), n2)) {
            void lIIllIlIIlllIIl;
            WorldResult worldResult = Static.getWorldService().getWorlds();
            World world = worldResult.findWorld(n2);
            if (e.llIIllllllI(world)) {
                return;
            }
            if (e.llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            net.runelite.api.World lIIllIlIIlllIII = Static.getClient().createWorld();
            lIIllIlIIlllIII.setActivity(lIIllIlIIlllIIl.getActivity());
            lIIllIlIIlllIII.setAddress(lIIllIlIIlllIIl.getAddress());
            lIIllIlIIlllIII.setId(lIIllIlIIlllIIl.getId());
            lIIllIlIIlllIII.setPlayerCount(lIIllIlIIlllIIl.getPlayers());
            lIIllIlIIlllIII.setLocation(lIIllIlIIlllIIl.getLocation());
            lIIllIlIIlllIII.setTypes(WorldUtil.toWorldTypes((EnumSet)lIIllIlIIlllIIl.getTypes()));
            Worlds.hopTo((net.runelite.api.World)lIIllIlIIlllIII);
        }
    }

    private static boolean llIIlllllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlllllIl(int n2, int n3) {
        return n2 != n3;
    }

    public static long a(long l2) {
        return e.t() - l2;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(HashMap<Integer, Integer> hashMap, boolean bl, boolean bl2) {
        if (e.llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(ae), lllllIIl[7])) {
            int n2;
            AccBuilderBarrows.c = llllIlll[lllllIIl[20]];
            WorldArea worldArea = new WorldArea(lllllIIl[21], lllllIIl[22], lllllIIl[23], lllllIIl[24], lllllIIl[4]);
            int[] nArray = new int[lllllIIl[0]];
            nArray[e.lllllIIl[4]] = lllllIIl[25];
            int n3 = Inventory.contains((int[])nArray);
            if (e.llIIlllIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                n2 = lllllIIl[0];
                "".length();
                if ((0x22 ^ 0x27) <= 0) {
                    return;
                }
            } else {
                n2 = lllllIIl[4];
            }
            if (e.llIIlllIlll(n3 & n2)) {
                int[] nArray2 = new int[lllllIIl[0]];
                nArray2[e.lllllIIl[4]] = lllllIIl[25];
                Inventory.getFirst((int[])nArray2).interact(llllIlll[lllllIIl[26]]);
                Time.sleepTicks((int)lllllIIl[11]);
                "".length();
            }
            Movement.walkTo((WorldPoint)ae);
            "".length();
            Time.sleepTicks((int)lllllIIl[0]);
            "".length();
        }
        if (e.llIIlllllII(Players.getLocal().getWorldLocation().distanceTo(ae), lllllIIl[7])) {
            HashMap<Integer, Integer> lIIllIlIIlIlllI;
            void lIIllIlIIlIllII;
            void lIIllIlIIlIllIl;
            if (e.llIIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
            }
            AccBuilderBarrows.c = llllIlll[lllllIIl[27]];
            if (e.llIIlllIlll((int)lIIllIlIIlIllIl) && e.llIIlllllll(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks((int)lllllIIl[7]);
                "".length();
            }
            if (e.llIIlllIlll((int)lIIllIlIIlIllII) && e.llIIlllllll(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks((int)lllllIIl[6]);
                "".length();
            }
            Iterator<Map.Entry<Integer, Integer>> lIIllIlIIlIlIll = lIIllIlIIlIlllI.entrySet().iterator();
            while (e.llIIlllIlll(lIIllIlIIlIlIll.hasNext() ? 1 : 0)) {
                Map.Entry<Integer, Integer> lIIllIlIIlIlIlI = lIIllIlIIlIlIll.next();
                int lIIllIlIIlIlIIl = lIIllIlIIlIlIlI.getKey();
                int lIIllIlIIlIlIII = lIIllIlIIlIlIlI.getValue();
                System.out.println("Key: " + lIIllIlIIlIlIIl + ", Value: " + lIIllIlIIlIlIII);
                a.a(lIIllIlIIlIlIIl, lIIllIlIIlIlIII);
                Time.sleepTicks((int)lllllIIl[0]);
                "".length();
                "".length();
                if (-"   ".length() < 0) continue;
                return;
            }
        }
    }

    private static boolean llIIllllIlI(Object object) {
        return object != null;
    }

    public static boolean A() {
        boolean bl;
        if (e.llIIllllIlI(Widgets.get((int)lllllIIl[28], (int)lllllIIl[0]))) {
            bl = lllllIIl[0];
            "".length();
            if (" ".length() <= 0) {
                return ((0x37 ^ 6) & ~(0xF7 ^ 0xC6)) != 0;
            }
        } else {
            bl = lllllIIl[4];
        }
        return bl;
    }

    private static boolean llIIllllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlllllll(int n2) {
        return n2 > 0;
    }

    public static String b(long l2) {
        Object[] objectArray = new Object[lllllIIl[0]];
        objectArray[e.lllllIIl[4]] = lllllIIl[6];
        String string = String.format(llllIlll[lllllIIl[14]], objectArray);
        Object[] objectArray2 = new Object[lllllIIl[0]];
        objectArray2[e.lllllIIl[4]] = (l2 /= 1000L) % 60L;
        String string2 = String.format(string, objectArray2);
        Object[] objectArray3 = new Object[lllllIIl[0]];
        objectArray3[e.lllllIIl[4]] = l2 % 3600L / 60L;
        String string3 = String.format(string, objectArray3);
        Object[] objectArray4 = new Object[lllllIIl[0]];
        objectArray4[e.lllllIIl[4]] = l2 / 3600L;
        String string4 = String.format(string, objectArray4);
        String string5 = string4 + ":" + string3 + ":" + string2;
        return string5;
    }

    private static String llIIllIlllI(String lIIllIIlIllllll, String lIIllIIlIlllllI) {
        lIIllIIlIllllll = new String(Base64.getDecoder().decode(lIIllIIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIlIllllIl = new StringBuilder();
        char[] lIIllIIlIllllII = lIIllIIlIlllllI.toCharArray();
        int lIIllIIlIlllIll = lllllIIl[4];
        char[] lIIllIIlIllIlIl = lIIllIIlIllllll.toCharArray();
        int lIIllIIlIllIlII = lIIllIIlIllIlIl.length;
        int lIIllIIlIllIIll = lllllIIl[4];
        while (e.llIIllllIIl(lIIllIIlIllIIll, lIIllIIlIllIlII)) {
            char lIIllIIllIIIIII = lIIllIIlIllIlIl[lIIllIIlIllIIll];
            lIIllIIlIllllIl.append((char)(lIIllIIllIIIIII ^ lIIllIIlIllllII[lIIllIIlIlllIll % lIIllIIlIllllII.length]));
            "".length();
            ++lIIllIIlIlllIll;
            ++lIIllIIlIllIIll;
            "".length();
            if ((140 + 11 - 70 + 111 ^ 73 + 26 - 93 + 190) >= 0) continue;
            return null;
        }
        return String.valueOf(lIIllIIlIllllIl);
    }

    private static boolean llIIlllIlIl(int n2) {
        return n2 == 0;
    }

    public static void H() {
        if (e.llIIlllIlIl(Widgets.get((int)lllllIIl[75]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get((int)lllllIIl[75], (int)lllllIIl[26]);
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)lllllIIl[0]);
            Time.sleepTicks((int)lllllIIl[5]);
            "".length();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void c(WorldPoint worldPoint) {
        void var7_7;
        void var5_5;
        void var4_4;
        int n2;
        int n3;
        int lIIllIIlllllIIl;
        void lIIllIIllllllIl;
        WorldPoint lIIllIIlllllllI;
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (e.llIIllllllI(player)) {
            return;
        }
        WorldPoint lIIllIIlllllIll = lIIllIIlllllllI;
        int lIIllIIlllllIlI = lIIllIIlllllIll.getX() - lIIllIIllllllIl.getBaseX();
        Point lIIllIIlllllIII = Perspective.localToCanvas((Client)lIIllIIllllllIl, (LocalPoint)LocalPoint.fromScene((int)lIIllIIlllllIlI, (int)(lIIllIIlllllIIl = lIIllIIlllllIll.getY() - lIIllIIllllllIl.getBaseY())), (int)lIIllIIllllllIl.getPlane());
        if (e.llIIllllIlI(lIIllIIlllllIII)) {
            n3 = lIIllIIlllllIII.getX();
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        } else {
            int lIIllIIllllIlll;
            n3 = lIIllIIllllIlll = lllllIIl[65];
        }
        if (e.llIIllllIlI(lIIllIIlllllIII)) {
            n2 = lIIllIIlllllIII.getY();
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        } else {
            n2 = lllllIIl[65];
        }
        int n4 = n2;
        client.interact(lllllIIl[4], MenuAction.WALK.getId(), (int)var4_4, (int)var5_5, (int)var7_7, n4);
    }

    private static String llIIllIllll(String lIIllIIllIIllIl, String lIIllIIllIIlllI) {
        try {
            SecretKeySpec lIIllIIllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIllIlIIIl = Cipher.getInstance("Blowfish");
            lIIllIIllIlIIIl.init(lllllIIl[6], lIIllIIllIlIIlI);
            return new String(lIIllIIllIlIIIl.doFinal(Base64.getDecoder().decode(lIIllIIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIllIlIIII) {
            lIIllIIllIlIIII.printStackTrace();
            return null;
        }
    }

    public static boolean b(int[] nArray) {
        int[] lIIllIlIlIIIIIl;
        int lIIllIlIlIIIIII = lllllIIl[4];
        while (e.llIIllllIIl(lIIllIlIlIIIIII, lIIllIlIlIIIIIl.length)) {
            if (e.llIIlllIlIl(e.i(lIIllIlIlIIIIIl[lIIllIlIlIIIIII]) ? 1 : 0)) {
                System.out.println("Missing ID: " + lIIllIlIlIIIIIl[lIIllIlIlIIIIII]);
                return lllllIIl[4];
            }
            ++lIIllIlIlIIIIII;
            "".length();
            if (-" ".length() < "   ".length()) continue;
            return ((0xA5 ^ 0x8F ^ (7 ^ 0x4F)) & (0x53 ^ 0x75 ^ (0xC3 ^ 0x87) ^ -" ".length())) != 0;
        }
        return lllllIIl[0];
    }

    public static void C() {
        net.runelite.api.World world2 = Worlds.getRandom(world -> {
            int n2;
            if (e.llIIlllIlll(world.isMembers() ? 1 : 0) && e.llIIlllllII(world.getPlayerCount(), lllllIIl[78]) && e.llIIlllllIl(world.getId(), Worlds.getCurrentId()) && e.llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[79]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[80]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().startsWith(llllIlll[lllllIIl[81]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().startsWith(llllIlll[lllllIIl[74]]) ? 1 : 0) && e.llIIlllllIl(world.getId(), lllllIIl[82]) && e.llIIlllllIl(world.getId(), lllllIIl[83]) && e.llIIlllllIl(world.getId(), lllllIIl[83]) && e.llIIlllIlIl(world.getActivity().contains(llllIlll[lllllIIl[84]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().contains(llllIlll[lllllIIl[85]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().contains(llllIlll[lllllIIl[86]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().startsWith(llllIlll[lllllIIl[87]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[88]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[89]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[90]]) ? 1 : 0) && e.llIIlllIlIl(world.getActivity().startsWith(llllIlll[lllllIIl[91]]) ? 1 : 0) && e.llIIllllIll(world.getPlayerCount(), lllllIIl[92])) {
                n2 = lllllIIl[0];
                "".length();
                if (-" ".length() > (0x4F ^ 0x4B)) {
                    return ((0x73 ^ 0x2C) & ~(0xC3 ^ 0x9C)) != 0;
                }
            } else {
                n2 = lllllIIl[4];
            }
            return n2 != 0;
        });
        Worlds.hopTo((net.runelite.api.World)world2);
    }

    public static void F() {
        block9: {
            int lIIllIIlllIllIl = lllllIIl[4];
            do {
                String[] stringArray = new String[lllllIIl[0]];
                stringArray[e.lllllIIl[4]] = llllIlll[lllllIIl[24]];
                if (!e.llIIllllIlI(TileObjects.getNearest((String[])stringArray)) || !e.llIIlllIlIl(AccBuilderBarrows.d ? 1 : 0)) break block9;
                AccBuilderBarrows.c = llllIlll[lllllIIl[35]];
                String[] stringArray2 = new String[lllllIIl[0]];
                stringArray2[e.lllllIIl[4]] = llllIlll[lllllIIl[70]];
                NPC lIIllIIlllIllII = NPCs.getNearest((String[])stringArray2);
                if (e.llIIlllIlIl(lIIllIIlllIllIl)) {
                    if (e.llIIlllIlIl(Dialog.isOpen() ? 1 : 0)) {
                        lIIllIIlllIllII.interact(llllIlll[lllllIIl[71]]);
                    }
                    if (e.llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                        List lIIllIIlllIlIll;
                        if (e.llIIlllIlIl(Dialog.canContinueNPC() ? 1 : 0) && e.llIIlllIlIl(Dialog.canContinue() ? 1 : 0) && e.llIIlllIlIl((lIIllIIlllIlIll = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                            List lIIllIIlllIlIlI = lIIllIIlllIlIll.stream().filter(widget -> {
                                boolean bl;
                                if (e.llIIlllIlIl(widget.getText().contains(llllIlll[lllllIIl[77]]) ? 1 : 0)) {
                                    bl = lllllIIl[0];
                                    "".length();
                                    if (-" ".length() != -" ".length()) {
                                        return ((0xCD ^ 0xB7 ^ (0xA1 ^ 0x86)) & (0x7F ^ 0xE ^ (0x64 ^ 0x48) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = lllllIIl[4];
                                }
                                return bl;
                            }).collect(Collectors.toList());
                            if (e.llIIlllIlIl(lIIllIIlllIlIlI.isEmpty() ? 1 : 0)) {
                                Mouse.click((int)((Widget)lIIllIIlllIlIlI.get(lllllIIl[4])).getClickPoint().getX(), (int)((Widget)lIIllIIlllIlIlI.get(lllllIIl[4])).getClickPoint().getY(), (boolean)lllllIIl[0]);
                                Time.sleepTicks((int)lllllIIl[5]);
                                "".length();
                            }
                            if (e.llIIlllIllI(lIIllIIlllIlIlI.size(), lllllIIl[0])) {
                                lIIllIIlllIllIl = lllllIIl[0];
                            }
                        }
                        if (!e.llIIlllIlIl(Dialog.canContinueNPC() ? 1 : 0) || e.llIIlllIlll(Dialog.canContinue() ? 1 : 0)) {
                            Dialog.continueSpace();
                        }
                    }
                }
                if (e.llIIlllIlll(lIIllIIlllIllIl)) {
                    String[] stringArray3 = new String[lllllIIl[0]];
                    stringArray3[e.lllllIIl[4]] = llllIlll[lllllIIl[72]];
                    TileObjects.getNearest((String[])stringArray3).interact(llllIlll[lllllIIl[73]]);
                    Time.sleepTicks((int)lllllIIl[8]);
                    "".length();
                }
                Time.sleepTicks((int)lllllIIl[0]);
                "".length();
                "".length();
            } while (null == null);
            return;
        }
    }

    private static boolean llIIllllIII(int n2) {
        return n2 < 0;
    }

    static {
        e.llIIlllIlII();
        e.llIIlllIIll();
        aa = lllllIIl[97];
        Z = lllllIIl[3];
        ac = lllllIIl[1];
        R = llllIlll[lllllIIl[98]];
        Y = lllllIIl[99];
        ab = lllllIIl[100];
        S = ThreadLocalRandom.current();
        T = new WorldArea(lllllIIl[101], lllllIIl[102], lllllIIl[74], lllllIIl[80], lllllIIl[4]);
        U = new WorldArea(lllllIIl[103], lllllIIl[104], lllllIIl[29], lllllIIl[57], lllllIIl[0]);
        V = System.currentTimeMillis();
        W = System.nanoTime();
        X = new HashMap<Integer, Integer>();
        int[] nArray = new int[lllllIIl[8]];
        nArray[e.lllllIIl[4]] = lllllIIl[99];
        nArray[e.lllllIIl[0]] = lllllIIl[3];
        nArray[e.lllllIIl[6]] = lllllIIl[97];
        nArray[e.lllllIIl[5]] = lllllIIl[100];
        nArray[e.lllllIIl[7]] = lllllIIl[1];
        ad = nArray;
        ae = new WorldPoint(lllllIIl[105], lllllIIl[106], lllllIIl[4]);
        int[] nArray2 = new int[lllllIIl[107]];
        nArray2[e.lllllIIl[4]] = lllllIIl[108];
        nArray2[e.lllllIIl[0]] = lllllIIl[109];
        nArray2[e.lllllIIl[6]] = lllllIIl[110];
        nArray2[e.lllllIIl[5]] = lllllIIl[111];
        nArray2[e.lllllIIl[7]] = lllllIIl[112];
        nArray2[e.lllllIIl[8]] = lllllIIl[113];
        nArray2[e.lllllIIl[9]] = lllllIIl[114];
        nArray2[e.lllllIIl[10]] = lllllIIl[115];
        nArray2[e.lllllIIl[11]] = lllllIIl[116];
        nArray2[e.lllllIIl[12]] = lllllIIl[117];
        nArray2[e.lllllIIl[13]] = lllllIIl[118];
        nArray2[e.lllllIIl[14]] = lllllIIl[119];
        nArray2[e.lllllIIl[15]] = lllllIIl[120];
        nArray2[e.lllllIIl[16]] = lllllIIl[121];
        nArray2[e.lllllIIl[19]] = lllllIIl[122];
        nArray2[e.lllllIIl[20]] = lllllIIl[123];
        nArray2[e.lllllIIl[26]] = lllllIIl[124];
        nArray2[e.lllllIIl[27]] = lllllIIl[125];
        nArray2[e.lllllIIl[30]] = lllllIIl[126];
        nArray2[e.lllllIIl[32]] = lllllIIl[127];
        nArray2[e.lllllIIl[33]] = lllllIIl[128];
        nArray2[e.lllllIIl[36]] = lllllIIl[129];
        nArray2[e.lllllIIl[39]] = lllllIIl[130];
        nArray2[e.lllllIIl[29]] = lllllIIl[131];
        nArray2[e.lllllIIl[40]] = lllllIIl[132];
        nArray2[e.lllllIIl[41]] = lllllIIl[133];
        nArray2[e.lllllIIl[42]] = lllllIIl[134];
        nArray2[e.lllllIIl[43]] = lllllIIl[135];
        nArray2[e.lllllIIl[44]] = lllllIIl[136];
        nArray2[e.lllllIIl[18]] = lllllIIl[137];
        nArray2[e.lllllIIl[57]] = lllllIIl[138];
        nArray2[e.lllllIIl[58]] = lllllIIl[139];
        nArray2[e.lllllIIl[38]] = lllllIIl[140];
        nArray2[e.lllllIIl[59]] = lllllIIl[141];
        nArray2[e.lllllIIl[60]] = lllllIIl[142];
        nArray2[e.lllllIIl[50]] = lllllIIl[143];
        nArray2[e.lllllIIl[63]] = lllllIIl[144];
        nArray2[e.lllllIIl[64]] = lllllIIl[145];
        nArray2[e.lllllIIl[68]] = lllllIIl[146];
        nArray2[e.lllllIIl[69]] = lllllIIl[147];
        nArray2[e.lllllIIl[24]] = lllllIIl[148];
        nArray2[e.lllllIIl[35]] = lllllIIl[149];
        nArray2[e.lllllIIl[70]] = lllllIIl[150];
        nArray2[e.lllllIIl[71]] = lllllIIl[151];
        nArray2[e.lllllIIl[72]] = lllllIIl[152];
        nArray2[e.lllllIIl[73]] = lllllIIl[153];
        nArray2[e.lllllIIl[77]] = lllllIIl[154];
        nArray2[e.lllllIIl[79]] = lllllIIl[155];
        nArray2[e.lllllIIl[80]] = lllllIIl[156];
        nArray2[e.lllllIIl[81]] = lllllIIl[157];
        nArray2[e.lllllIIl[74]] = lllllIIl[158];
        nArray2[e.lllllIIl[84]] = lllllIIl[159];
        nArray2[e.lllllIIl[85]] = lllllIIl[160];
        nArray2[e.lllllIIl[86]] = lllllIIl[161];
        nArray2[e.lllllIIl[87]] = lllllIIl[162];
        nArray2[e.lllllIIl[88]] = lllllIIl[163];
        nArray2[e.lllllIIl[89]] = lllllIIl[164];
        nArray2[e.lllllIIl[90]] = lllllIIl[165];
        nArray2[e.lllllIIl[91]] = lllllIIl[166];
        nArray2[e.lllllIIl[93]] = lllllIIl[167];
        nArray2[e.lllllIIl[94]] = lllllIIl[168];
        nArray2[e.lllllIIl[23]] = lllllIIl[169];
        nArray2[e.lllllIIl[95]] = lllllIIl[170];
        nArray2[e.lllllIIl[96]] = lllllIIl[171];
        nArray2[e.lllllIIl[98]] = lllllIIl[172];
        nArray2[e.lllllIIl[173]] = lllllIIl[174];
        nArray2[e.lllllIIl[175]] = lllllIIl[176];
        nArray2[e.lllllIIl[177]] = lllllIIl[178];
        nArray2[e.lllllIIl[179]] = lllllIIl[180];
        nArray2[e.lllllIIl[181]] = lllllIIl[182];
        nArray2[e.lllllIIl[183]] = lllllIIl[184];
        nArray2[e.lllllIIl[53]] = lllllIIl[185];
        nArray2[e.lllllIIl[186]] = lllllIIl[187];
        nArray2[e.lllllIIl[188]] = lllllIIl[189];
        nArray2[e.lllllIIl[190]] = lllllIIl[191];
        nArray2[e.lllllIIl[192]] = lllllIIl[193];
        nArray2[e.lllllIIl[194]] = lllllIIl[195];
        nArray2[e.lllllIIl[196]] = lllllIIl[197];
        nArray2[e.lllllIIl[198]] = lllllIIl[199];
        nArray2[e.lllllIIl[200]] = lllllIIl[201];
        nArray2[e.lllllIIl[202]] = lllllIIl[203];
        nArray2[e.lllllIIl[204]] = lllllIIl[205];
        nArray2[e.lllllIIl[206]] = lllllIIl[207];
        nArray2[e.lllllIIl[208]] = lllllIIl[209];
        nArray2[e.lllllIIl[210]] = lllllIIl[211];
        nArray2[e.lllllIIl[212]] = lllllIIl[213];
        nArray2[e.lllllIIl[214]] = lllllIIl[215];
        nArray2[e.lllllIIl[216]] = lllllIIl[217];
        nArray2[e.lllllIIl[218]] = lllllIIl[219];
        nArray2[e.lllllIIl[220]] = lllllIIl[221];
        nArray2[e.lllllIIl[222]] = lllllIIl[223];
        nArray2[e.lllllIIl[224]] = lllllIIl[225];
        nArray2[e.lllllIIl[226]] = lllllIIl[227];
        nArray2[e.lllllIIl[228]] = lllllIIl[229];
        nArray2[e.lllllIIl[230]] = lllllIIl[231];
        nArray2[e.lllllIIl[232]] = lllllIIl[233];
        nArray2[e.lllllIIl[234]] = lllllIIl[235];
        nArray2[e.lllllIIl[236]] = lllllIIl[237];
        nArray2[e.lllllIIl[238]] = lllllIIl[239];
        nArray2[e.lllllIIl[240]] = lllllIIl[241];
        nArray2[e.lllllIIl[92]] = lllllIIl[242];
        nArray2[e.lllllIIl[76]] = lllllIIl[243];
        nArray2[e.lllllIIl[244]] = lllllIIl[245];
        nArray2[e.lllllIIl[246]] = lllllIIl[247];
        nArray2[e.lllllIIl[248]] = lllllIIl[249];
        nArray2[e.lllllIIl[250]] = lllllIIl[251];
        nArray2[e.lllllIIl[252]] = lllllIIl[253];
        af = nArray2;
        ag = new WorldPoint(lllllIIl[254], lllllIIl[255], lllllIIl[6]);
        ah = new WorldArea(lllllIIl[256], lllllIIl[257], lllllIIl[59], lllllIIl[39], lllllIIl[4]);
    }

    public static void a(String lIIllIlIIIIlllI, String lIIllIlIIIIllIl) {
        try {
            URL lIIllIlIIIIllII = new URL(lIIllIlIIIIlllI);
            HttpURLConnection lIIllIlIIIIlIll = (HttpURLConnection)lIIllIlIIIIllII.openConnection();
            lIIllIlIIIIlIll.setRequestMethod(llllIlll[lllllIIl[50]]);
            lIIllIlIIIIlIll.setRequestProperty(llllIlll[lllllIIl[63]], llllIlll[lllllIIl[64]]);
            lIIllIlIIIIlIll.setDoOutput(lllllIIl[0]);
            String lIIllIlIIIIlIlI = "{\"content\": \"" + lIIllIlIIIIllIl + "\"}";
            DataOutputStream lIIllIlIIIIlIIl = new DataOutputStream(lIIllIlIIIIlIll.getOutputStream());
            lIIllIlIIIIlIIl.writeBytes(lIIllIlIIIIlIlI);
            lIIllIlIIIIlIIl.flush();
            lIIllIlIIIIlIIl.close();
            int lIIllIlIIIIlIII = lIIllIlIIIIlIll.getResponseCode();
            System.out.println("Response Code: " + lIIllIlIIIIlIII);
            lIIllIlIIIIlIll.disconnect();
            "".length();
        }
        catch (Exception lIIllIlIIIIllII) {
            lIIllIlIIIIllII.printStackTrace();
        }
        if (null != null) {
            return;
        }
    }

    public static boolean G() {
        int n2;
        if (!e.llIIlllIlIl(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIlllIlIl(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(ag), lllllIIl[74]) || e.llIIlllIlll(ah.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lllllIIl[0];
            "".length();
            if (-" ".length() >= 0) {
                return ((60 + 116 - 74 + 35 ^ 20 + 172 - 184 + 181) & (16 + 123 - -9 + 35 ^ 107 + 98 - 102 + 28 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllllIIl[4];
        }
        return n2 != 0;
    }

    public static int j(int n2) {
        return (Integer)GameThread.invokeLater(() -> Static.getClient().getVarpValue(n2));
    }

    public static void x() {
        Widget widget = Widgets.get((int)lllllIIl[17], (int)lllllIIl[18], (int)lllllIIl[4]);
        if (e.llIIllllIlI(widget)) {
            widget.interact(llllIlll[lllllIIl[19]]);
            Time.sleepTicks((int)lllllIIl[5]);
            "".length();
        }
    }

    public static void w() {
        if (e.llIIlllIlll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks((int)lllllIIl[7]);
            "".length();
        }
        if (e.llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.llIIlllIlIl(Bank.isOpen() ? 1 : 0)) {
            e.C();
        }
    }

    public static double v() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    public static void s() {
        List list = Widgets.getAll((int)lllllIIl[1], widget -> widget.getText().contains(llllIlll[lllllIIl[96]]));
        List list2 = Widgets.getAll((int)lllllIIl[2], widget -> widget.getText().contains(llllIlll[lllllIIl[95]]));
        List list3 = Widgets.getAll((int)lllllIIl[3], widget -> widget.getText().contains(llllIlll[lllllIIl[23]]));
        int lIIllIlIlIIlIll = lllllIIl[4];
        while (e.llIIllllIIl(lIIllIlIlIIlIll, ad.length)) {
            Widget lIIllIlIlIIlIlI = Widgets.get((int)ad[lIIllIlIlIIlIll], widget -> widget.getText().contains(llllIlll[lllllIIl[94]]));
            if (e.llIIllllIlI(lIIllIlIlIIlIlI)) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + ad[lIIllIlIlIIlIll]);
            }
            ++lIIllIlIlIIlIll;
            "".length();
            if (-" ".length() < 0) continue;
            return;
        }
    }

    public static void l(int n2) {
        int[] nArray = new int[lllllIIl[0]];
        nArray[e.lllllIIl[4]] = n2;
        if (e.llIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllllIIl[0]];
            nArray2[e.lllllIIl[4]] = n2;
            if (e.llIIlllIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int lIIllIlIIIllllI;
                int[] nArray3 = new int[lllllIIl[0]];
                nArray3[e.lllllIIl[4]] = n2;
                String[] stringArray = new String[lllllIIl[0]];
                stringArray[e.lllllIIl[4]] = llllIlll[lllllIIl[29]];
                if (e.llIIlllIlll(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lllllIIl[0]];
                    nArray4[e.lllllIIl[4]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(llllIlll[lllllIIl[40]]);
                }
                int[] nArray5 = new int[lllllIIl[0]];
                nArray5[e.lllllIIl[4]] = lIIllIlIIIllllI;
                String[] stringArray2 = new String[lllllIIl[0]];
                stringArray2[e.lllllIIl[4]] = llllIlll[lllllIIl[41]];
                if (e.llIIlllIlll(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[lllllIIl[0]];
                    nArray6[e.lllllIIl[4]] = lIIllIlIIIllllI;
                    Inventory.getFirst((int[])nArray6).interact(llllIlll[lllllIIl[42]]);
                }
                int[] nArray7 = new int[lllllIIl[0]];
                nArray7[e.lllllIIl[4]] = lIIllIlIIIllllI;
                String[] stringArray3 = new String[lllllIIl[0]];
                stringArray3[e.lllllIIl[4]] = llllIlll[lllllIIl[43]];
                if (e.llIIlllIlll(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[lllllIIl[0]];
                    nArray8[e.lllllIIl[4]] = lIIllIlIIIllllI;
                    Inventory.getFirst((int[])nArray8).interact(llllIlll[lllllIIl[44]]);
                }
                if (e.llIIlllIllI(lIIllIlIIIllllI, lllllIIl[45])) {
                    Time.sleepTicks((int)lllllIIl[5]);
                    "".length();
                    String[] stringArray4 = new String[lllllIIl[0]];
                    stringArray4[e.lllllIIl[4]] = llllIlll[lllllIIl[18]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)lllllIIl[0]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIIlllIlll(int n2) {
        return n2 != 0;
    }

    public static void a(WorldPoint worldPoint) {
        if (e.llIIlllIlIl(n.bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (e.llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(n.bU), lllllIIl[5])) {
                AccBuilderBarrows.c = llllIlll[lllllIIl[4]];
                Movement.walkTo((WorldPoint)n.bU);
                "".length();
                Time.sleepTicks((int)lllllIIl[0]);
                "".length();
            }
            if (e.llIIlllllII(Players.getLocal().getWorldLocation().distanceTo(n.bU), lllllIIl[5])) {
                NPC lIIllIlIlIIIlIl;
                AccBuilderBarrows.c = llllIlll[lllllIIl[0]];
                if (e.llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (e.llIIllllIlI(lIIllIlIlIIIlIl = NPCs.getNearest(nPC -> {
                    String[] stringArray = new String[lllllIIl[0]];
                    stringArray[e.lllllIIl[4]] = llllIlll[lllllIIl[93]];
                    return nPC.hasAction(stringArray);
                }))) {
                    String[] stringArray = new String[lllllIIl[0]];
                    stringArray[e.lllllIIl[4]] = llllIlll[lllllIIl[6]];
                    if (e.llIIlllIlll(lIIllIlIlIIIlIl.hasAction(stringArray) ? 1 : 0)) {
                        lIIllIlIlIIIlIl.interact(llllIlll[lllllIIl[5]]);
                        Time.sleepTicks((int)lllllIIl[5]);
                        "".length();
                    }
                    String[] stringArray2 = new String[lllllIIl[0]];
                    stringArray2[e.lllllIIl[4]] = llllIlll[lllllIIl[7]];
                    if (e.llIIlllIlIl(lIIllIlIlIIIlIl.hasAction(stringArray2) ? 1 : 0)) {
                        g.b(llllIlll[lllllIIl[8]], n.bX);
                        Time.sleepTicks((int)lllllIIl[0]);
                        "".length();
                    }
                }
                String[] stringArray = new String[lllllIIl[0]];
                stringArray[e.lllllIIl[4]] = llllIlll[lllllIIl[9]];
                NPC lIIllIlIlIIIlII = NPCs.getNearest((String[])stringArray);
                if (e.llIIllllIlI(lIIllIlIlIIIlII)) {
                    String[] stringArray3 = new String[lllllIIl[0]];
                    stringArray3[e.lllllIIl[4]] = llllIlll[lllllIIl[10]];
                    if (e.llIIlllIlll(lIIllIlIlIIIlII.hasAction(stringArray3) ? 1 : 0)) {
                        lIIllIlIlIIIlII.interact(llllIlll[lllllIIl[11]]);
                        Time.sleepTicks((int)lllllIIl[5]);
                        "".length();
                    }
                    String[] stringArray4 = new String[lllllIIl[0]];
                    stringArray4[e.lllllIIl[4]] = llllIlll[lllllIIl[12]];
                    if (e.llIIlllIlIl(lIIllIlIlIIIlII.hasAction(stringArray4) ? 1 : 0)) {
                        g.b(llllIlll[lllllIIl[13]], n.bX);
                        Time.sleepTicks((int)lllllIIl[0]);
                        "".length();
                    }
                }
            }
        }
        if (e.llIIlllIlll(n.bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lIIllIlIlIIIllI;
            Movement.walkTo((WorldPoint)lIIllIlIlIIIllI);
            "".length();
            Time.sleepTicks((int)lllllIIl[0]);
            "".length();
        }
    }

    public static void z() {
        Widget lIIllIlIIlIIlII;
        if (e.llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.llIIlllIlll(e.y() ? 1 : 0)) {
            if (e.llIIlllIlIl(e.A() ? 1 : 0)) {
                e.B();
            }
            if (e.llIIlllIlll(e.A() ? 1 : 0)) {
                Widget lIIllIlIIlIIIlI;
                Widget lIIllIlIIlIIIll;
                lIIllIlIIlIIlII = Widgets.get((int)lllllIIl[28], (int)lllllIIl[29], (int)lllllIIl[10]);
                if (e.llIIllllIlI(lIIllIlIIlIIlII)) {
                    lIIllIlIIlIIlII.interact(llllIlll[lllllIIl[30]]);
                    Time.sleepTicks((int)lllllIIl[0]);
                    "".length();
                }
                if (e.llIIlllIlIl(Vars.getBit((int)lllllIIl[31])) && e.llIIllllIlI(lIIllIlIIlIIIll = Widgets.get((int)lllllIIl[28], (int)lllllIIl[32], (int)lllllIIl[24]))) {
                    if (e.llIIlllIlIl(lIIllIlIIlIIIll.isVisible() ? 1 : 0)) {
                        lIIllIlIIlIIIlI = Widgets.get((int)lllllIIl[28], (int)lllllIIl[33], (int)lllllIIl[8]);
                        Mouse.click((int)lIIllIlIIlIIIlI.getClickPoint().getX(), (int)lIIllIlIIlIIIlI.getClickPoint().getY(), (boolean)lllllIIl[0]);
                        Time.sleepTicks((int)lllllIIl[0]);
                        "".length();
                    }
                    if (e.llIIlllIlll(lIIllIlIIlIIIll.isVisible() ? 1 : 0)) {
                        lIIllIlIIlIIIll.interact(llllIlll[lllllIIl[32]]);
                        Time.sleepTicks((int)lllllIIl[0]);
                        "".length();
                    }
                }
                if (e.llIIlllIlIl(Vars.getBit((int)lllllIIl[34])) && e.llIIllllIlI(lIIllIlIIlIIIll = Widgets.get((int)lllllIIl[28], (int)lllllIIl[32], (int)lllllIIl[35]))) {
                    if (e.llIIlllIlIl(lIIllIlIIlIIIll.isVisible() ? 1 : 0)) {
                        lIIllIlIIlIIIlI = Widgets.get((int)lllllIIl[28], (int)lllllIIl[33], (int)lllllIIl[8]);
                        Mouse.click((int)lIIllIlIIlIIIlI.getClickPoint().getX(), (int)lIIllIlIIlIIIlI.getClickPoint().getY(), (boolean)lllllIIl[0]);
                        Time.sleepTicks((int)lllllIIl[0]);
                        "".length();
                    }
                    if (e.llIIlllIlll(lIIllIlIIlIIIll.isVisible() ? 1 : 0)) {
                        lIIllIlIIlIIIll.interact(llllIlll[lllllIIl[33]]);
                        Time.sleepTicks((int)lllllIIl[6]);
                        "".length();
                    }
                }
            }
        }
        if (e.llIIllllIlI(lIIllIlIIlIIlII = Widgets.get((int)lllllIIl[28], (int)lllllIIl[7]))) {
            lIIllIlIIlIIlII.interact(llllIlll[lllllIIl[36]]);
            Time.sleepTicks((int)lllllIIl[0]);
            "".length();
        }
    }

    public static void E() {
        if (e.llIIlllIllI(e.j(lllllIIl[66]), lllllIIl[0])) {
            Widget lIIllIIllllIIlI;
            if (e.llIIlllIlIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lllllIIl[0]);
                "".length();
            }
            if (e.llIIlllIlll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.llIIllllIlI(lIIllIIllllIIlI = Widgets.get((int)lllllIIl[67], (int)lllllIIl[57]))) {
                lIIllIIllllIIlI.interact(llllIlll[lllllIIl[69]]);
                Time.sleepTicks((int)lllllIIl[0]);
                "".length();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int c(int n2, int n3) {
        void lIIllIlIlIlIlIl;
        int lIIllIlIlIlIlII;
        int lIIllIlIlIlIllI;
        int n4 = n3 - n2;
        if (e.llIIlllIlIl(n4)) {
            return lIIllIlIlIlIllI;
        }
        if (e.llIIlllIllI(Math.abs(lIIllIlIlIlIlII), lllllIIl[0])) {
            int n5;
            if (e.llIIlllIlll(S.nextBoolean() ? 1 : 0)) {
                n5 = lIIllIlIlIlIllI;
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return (0x24 ^ 0x60 ^ (0x81 ^ 0x8F)) & (51 + 99 - -63 + 16 ^ 20 + 62 - 69 + 162 ^ -" ".length());
                }
            } else {
                n5 = lIIllIlIlIlIlIl;
            }
            return n5;
        }
        if (e.llIIllllIII(lIIllIlIlIlIlII)) {
            lIIllIlIlIlIlII = lIIllIlIlIlIllI;
            lIIllIlIlIlIllI = lIIllIlIlIlIlIl;
            n3 = lIIllIlIlIlIlII;
        }
        return n2 + S.nextInt(n3 - n2 + lllllIIl[0]);
    }

    /*
     * WARNING - void declaration
     */
    public static void b(WorldPoint worldPoint) {
        void lIIllIlIIIlIllI;
        void lIIllIlIIIlIlll;
        void lIIllIlIIIllIII;
        WorldPoint worldPoint2 = new WorldPoint(lllllIIl[46], lllllIIl[47], lllllIIl[4]);
        WorldArea worldArea = new WorldArea(lllllIIl[48], lllllIIl[49], lllllIIl[12], lllllIIl[50], lllllIIl[4]);
        WorldArea worldArea2 = new WorldArea(lllllIIl[51], lllllIIl[52], lllllIIl[53], lllllIIl[54], lllllIIl[4]);
        if (e.llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllllIIl[9]) && e.llIIlllIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIIlllIlIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIIl[55], lllllIIl[56], lllllIIl[0])), lllllIIl[33])) {
            AccBuilderBarrows.c = llllIlll[lllllIIl[57]];
            if (e.llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)lIIllIlIIIllIII);
            "".length();
            Time.sleepTicks((int)lllllIIl[0]);
            "".length();
        }
        if (e.llIIlllllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIllIlIIIllIII), lllllIIl[9]) && e.llIIlllllII(Players.getLocal().getWorldLocation().getY(), lllllIIl[47])) {
            if (e.llIIlllIlIl(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lllllIIl[0]];
                stringArray[e.lllllIIl[4]] = llllIlll[lllllIIl[58]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlll[lllllIIl[38]]);
                Time.sleepTicks((int)lllllIIl[6]);
                "".length();
            }
            if (e.llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lllllIIl[0]];
                stringArray[e.lllllIIl[4]] = llllIlll[lllllIIl[59]];
                g.a(stringArray);
            }
        }
        if (e.llIIllllIll(Players.getLocal().getWorldLocation().getY(), lllllIIl[47]) && (!e.llIIlllIlIl(lIIllIlIIIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIlllIlIl(lIIllIlIIIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || e.llIIlllllII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIIl[55], lllllIIl[56], lllllIIl[0])), lllllIIl[33]))) {
            WorldPoint lIIllIlIIIllIIl;
            AccBuilderBarrows.c = llllIlll[lllllIIl[60]];
            if (e.llIIlllIlll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIl[46], lllllIIl[61], lllllIIl[4])) ? 1 : 0)) {
                e.c(new WorldPoint(lllllIIl[46], lllllIIl[62], lllllIIl[4]));
                Time.sleepTicks((int)lllllIIl[9]);
                "".length();
            }
            Movement.walkTo((WorldPoint)lIIllIlIIIllIIl);
            "".length();
            Time.sleepTicks((int)lllllIIl[0]);
            "".length();
        }
    }
}

