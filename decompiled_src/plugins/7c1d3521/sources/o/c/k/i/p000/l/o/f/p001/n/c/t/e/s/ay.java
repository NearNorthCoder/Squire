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
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ay  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ay.class */
public class ay implements InterfaceC0003ac {
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int oH;
    private static /* synthetic */ int[] llIIlIlIIl;
    public static final /* synthetic */ int oG;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] llIIlIlIII;

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIlIlIII[llIIlIlIIl[43]];
    }

    private static boolean lIlIlIlIIlIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlIlIIlIlI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[44])) {
            ?? r0 = llIIlIlIIl[1];
            "".length();
            return "  ".length() == ((1 ^ 84) & ((229 ^ 176) ^ (-1))) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
        }
        return llIIlIlIIl[0];
    }

    private static String lIlIlIlIIIIIl(String llllllllllllllllllIlIIlIllIlIIll, String llllllllllllllllllIlIIlIllIlIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlIllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIllIlIIlI.getBytes(StandardCharsets.UTF_8)), llIIlIlIIl[12]), "DES");
            Cipher llllllllllllllllllIlIIlIllIlIlIl = Cipher.getInstance("DES");
            llllllllllllllllllIlIIlIllIlIlIl.init(llIIlIlIIl[3], llllllllllllllllllIlIIlIllIlIllI);
            return new String(llllllllllllllllllIlIIlIllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIlIllIlIlII) {
            llllllllllllllllllIlIIlIllIlIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIlIIIlII();
        lIlIlIlIIIIll();
        oH = llIIlIlIIl[8];
        oG = llIIlIlIIl[7];
        bv = new ArrayList();
    }

    public static void Q() {
        int[] iArr = new int[llIIlIlIIl[1]];
        iArr[llIIlIlIIl[0]] = llIIlIlIIl[7];
        if (lIlIlIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println(llIIlIlIII[llIIlIlIIl[32]]);
            bv.add(new C0017d(llIIlIlIIl[7], llIIlIlIIl[33], llIIlIlIIl[34]));
            "".length();
        }
        int[] iArr2 = new int[llIIlIlIIl[1]];
        iArr2[llIIlIlIIl[0]] = llIIlIlIIl[8];
        if (lIlIlIlIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
            System.out.println(llIIlIlIII[llIIlIlIIl[35]]);
            bv.add(new C0017d(llIIlIlIIl[8], llIIlIlIIl[1], llIIlIlIIl[36]));
            "".length();
        }
        if (lIlIlIlIIIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIlIlIII[llIIlIlIIl[45]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIlIIl[37], llIIlIlIIl[9], llIIlIlIIl[38]));
            "".length();
        }
        int[] iArr3 = new int[llIIlIlIIl[1]];
        iArr3[llIIlIlIIl[0]] = llIIlIlIIl[39];
        if (lIlIlIlIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIlIIl[39], llIIlIlIIl[40], llIIlIlIIl[41]));
            "".length();
        }
    }

    private static boolean lIlIlIlIIIlll(int i) {
        return i == 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        fi();
        return llIIlIlIIl[42];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean an() {
        int[] iArr = new int[llIIlIlIIl[1]];
        iArr[llIIlIlIIl[0]] = llIIlIlIIl[7];
        if (lIlIlIlIIlIII(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llIIlIlIIl[1]];
            iArr2[llIIlIlIIl[0]] = llIIlIlIIl[8];
            if (lIlIlIlIIlIII(Inventory.getCount(iArr2))) {
                ?? r0 = llIIlIlIIl[1];
                "".length();
                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIIlIlIIl[0];
    }

    private static boolean lIlIlIlIIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIlIIlIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIlIlIIl[0];
    }

    private static String lIlIlIlIIIIII(String llllllllllllllllllIlIIlIllIIIllI, String llllllllllllllllllIlIIlIllIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIlIllIIIlll) {
            llllllllllllllllllIlIIlIllIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIIIIll() {
        llIIlIlIII = new String[llIIlIlIIl[46]];
        llIIlIlIII[llIIlIlIIl[0]] = lIlIlIlIIIIII("RLBGQmVl8BRw4wo+T5XS+Q==", "NBsiR");
        llIIlIlIII[llIIlIlIIl[1]] = lIlIlIlIIIIIl("zmBtvhARoqLwi8ez9Hb0ynjdLv1qWVNm2yOqtqqsKwDgg46zu+L1uRCBV/uLdyiRsXsl64maln0=", "ahzST");
        llIIlIlIII[llIIlIlIIl[3]] = lIlIlIlIIIIII("2mxplDdPVyRwzmE1lIJKR6HbaKbdvWEv", "rpjyu");
        llIIlIlIII[llIIlIlIIl[4]] = lIlIlIlIIIIlI("CggqGA4rH28UBisT", "ExOvg");
        llIIlIlIII[llIIlIlIIl[6]] = lIlIlIlIIIIII("9/r+atTYG3OWxbJcYiifPV4Rndb4DBmZ", "PDuae");
        llIIlIlIII[llIIlIlIIl[9]] = lIlIlIlIIIIIl("NP0g8KXp/434B4BZFtk3JSEJnhYrpHRwh0sDNC1GBUbtuYJbjTaFGnrBvU1XAJWm", "xoxhq");
        llIIlIlIII[llIIlIlIIl[10]] = lIlIlIlIIIIIl("a1DNqceP3M/zC2Si+sUVCA==", "LudsU");
        llIIlIlIII[llIIlIlIIl[11]] = lIlIlIlIIIIII("Ue9lE47q3euKlUKR92ZYMg==", "xCUap");
        llIIlIlIII[llIIlIlIIl[12]] = lIlIlIlIIIIlI("IwoKF2EGAw4WMg==", "aooeA");
        llIIlIlIII[llIIlIlIIl[15]] = lIlIlIlIIIIIl("IG/7th7Q6eXcEWXKWlsESqZGYS2NTuid", "UJduK");
        llIIlIlIII[llIIlIlIIl[17]] = lIlIlIlIIIIlI("OzckCAQRKyJOHBkoNQ==", "xEEnp");
        llIIlIlIII[llIIlIlIIl[18]] = lIlIlIlIIIIII("YmlEHNzzepAK6VzaLRi6FA==", "gQect");
        llIIlIlIII[llIIlIlIIl[14]] = lIlIlIlIIIIIl("G9eNQffRDazpv2QM4lt5Ow==", "BYBCo");
        llIIlIlIII[llIIlIlIIl[20]] = lIlIlIlIIIIIl("4YsaEpTaLmU=", "OAfDo");
        llIIlIlIII[llIIlIlIIl[22]] = lIlIlIlIIIIII("oy6lMaIGww0XeeHnKuiOUhzf5M7RAs7h", "cYbGz");
        llIIlIlIII[llIIlIlIIl[23]] = lIlIlIlIIIIII("3z4wGtDl2tBVFPGY2bekMA==", "nWVuR");
        llIIlIlIII[llIIlIlIIl[25]] = lIlIlIlIIIIlI("KCY3FiMCOjFQOBk2", "kTVpW");
        llIIlIlIII[llIIlIlIIl[26]] = lIlIlIlIIIIlI("BAwZPg40EAw1WSIWCDcfcQ0bMw==", "QbiQy");
        llIIlIlIII[llIIlIlIIl[28]] = lIlIlIlIIIIII("k6hPzw/tbn66hHtUi5X8hg==", "LMJUe");
        llIIlIlIII[llIIlIlIIl[29]] = lIlIlIlIIIIIl("U/JXv7Q40s3gYkCCLhmAYw==", "HGjlg");
        llIIlIlIII[llIIlIlIIl[30]] = lIlIlIlIIIIIl("PRg3Y2hNXx4+pRpgsMXF5FjM+SpvAFiI", "oZySr");
        llIIlIlIII[llIIlIlIIl[31]] = lIlIlIlIIIIII("JGxe7viPf7Fm/IGS5bUuNw==", "QPADo");
        llIIlIlIII[llIIlIlIIl[32]] = lIlIlIlIIIIlI("CyQ9JwQucSkhBj00Km4NJTA3PQ==", "IQDNj");
        llIIlIlIII[llIIlIlIIl[35]] = lIlIlIlIIIIII("pj8g2uEWtMkIKMpKcmRyex8DCkMTtRUeV/yKC5vH/ZY=", "khsnY");
        llIIlIlIII[llIIlIlIIl[43]] = lIlIlIlIIIIII("sRha5INkWjZlXbZ/BbA6qA==", "tTtBW");
        llIIlIlIII[llIIlIlIIl[45]] = lIlIlIlIIIIlI("HT4eP1YAMVAvEw47BDBWRw==", "oWpXv");
    }

    private static String lIlIlIlIIIIlI(String llllllllllllllllllIlIIlIlllIlIII, String llllllllllllllllllIlIIlIlllIIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIlIlllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIIlIlllIIllI = new StringBuilder();
        char[] charArray = llllllllllllllllllIlIIlIlllIIlll.toCharArray();
        int llllllllllllllllllIlIIlIlllIIlII = llIIlIlIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlIIl[0];
        while (lIlIlIlIIIllI(i, length)) {
            llllllllllllllllllIlIIlIlllIIllI.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIlIIlIlllIIlII % charArray.length]));
            "".length();
            llllllllllllllllllIlIIlIlllIIlII++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlIIlIlllIIllI);
    }

    private static boolean lIlIlIlIIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlIIlIIl(Object obj) {
        return obj != null;
    }

    private static void lIlIlIlIIIlII() {
        llIIlIlIIl = new int[47];
        llIIlIlIIl[0] = (162 ^ 141) & ((59 ^ 20) ^ (-1));
        llIIlIlIIl[1] = " ".length();
        llIIlIlIIl[2] = (-((-9475) & 32027)) & (-1) & 23547;
        llIIlIlIIl[3] = "  ".length();
        llIIlIlIIl[4] = "   ".length();
        llIIlIlIIl[5] = (-((-387) & 27111)) & (-1028) & 32751;
        llIIlIlIIl[6] = (19 ^ 45) ^ (122 ^ 64);
        llIIlIlIIl[7] = (-((-125) & 22653)) & (-8449) & 32751;
        llIIlIlIIl[8] = (-8193) & 9977;
        llIIlIlIIl[9] = 133 ^ 128;
        llIIlIlIIl[10] = (((82 + 133) - 113) + 75) ^ (((121 + 12) - (-50)) + 0);
        llIIlIlIIl[11] = 124 ^ 123;
        llIIlIlIIl[12] = 36 ^ 44;
        llIIlIlIIl[13] = (-1059) & 59058;
        llIIlIlIIl[14] = (23 ^ 6) ^ (149 ^ 136);
        llIIlIlIIl[15] = (191 ^ 133) ^ (81 ^ 98);
        llIIlIlIIl[16] = 34 ^ 3;
        llIIlIlIIl[17] = (((134 + 31) - 89) + 80) ^ (((133 + 3) - 42) + 56);
        llIIlIlIIl[18] = (67 ^ 53) ^ (106 ^ 23);
        llIIlIlIIl[19] = (56 ^ 63) ^ (94 ^ 115);
        llIIlIlIIl[20] = (((133 + 1) - 90) + 163) ^ (((0 + 68) - 56) + 182);
        llIIlIlIIl[21] = 157 ^ 179;
        llIIlIlIIl[22] = (182 ^ 150) ^ (189 ^ 147);
        llIIlIlIIl[23] = 145 ^ 158;
        llIIlIlIIl[24] = 39 ^ 22;
        llIIlIlIIl[25] = 131 ^ 147;
        llIIlIlIIl[26] = 65 ^ 80;
        llIIlIlIIl[27] = (1 ^ 52) ^ (108 ^ 14);
        llIIlIlIIl[28] = (116 ^ 39) ^ (241 ^ 176);
        llIIlIlIIl[29] = (((65 + 112) - 48) + 38) ^ (((1 + 139) - (-30)) + 10);
        llIIlIlIIl[30] = (((41 + 49) - 38) + 82) ^ (((41 + 13) - 35) + 127);
        llIIlIlIIl[31] = (((165 + 168) - 246) + 100) ^ (((113 + 24) - 87) + 124);
        llIIlIlIIl[32] = 44 ^ 58;
        llIIlIlIIl[33] = (-((-16483) & 30947)) & (-6) & 16319;
        llIIlIlIIl[34] = (74 ^ 39) ^ "   ".length();
        llIIlIlIIl[35] = (((139 + 162) - 134) + 19) ^ (((122 + 157) - 194) + 88);
        llIIlIlIIl[36] = (-((-14562) & 31475)) & (-5) & 22527;
        llIIlIlIIl[37] = (-((-11842) & 16213)) & (-33) & 16383;
        llIIlIlIIl[38] = (-(124 ^ 62)) & (-2069) & 27133;
        llIIlIlIIl[39] = (-9) & 8015;
        llIIlIlIIl[40] = 20 ^ 60;
        llIIlIlIIl[41] = (-17475) & 18374;
        llIIlIlIIl[42] = (143 ^ 160) ^ (59 ^ 112);
        llIIlIlIIl[43] = 31 ^ 7;
        llIIlIlIIl[44] = 90 ^ 57;
        llIIlIlIIl[45] = (((38 + 46) - (-99)) + 7) ^ (((53 + 136) - 127) + 105);
        llIIlIlIIl[46] = (212 ^ 167) ^ (25 ^ 112);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (lIlIlIlIIlIII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017a, code lost:
        if (lIlIlIlIIlIlI(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ay.llIIlIlIIl[1]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
        if (lIlIlIlIIIllI(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ay.llIIlIlIIl[1]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bc, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ay.llIIlIlIII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ay.llIIlIlIIl[9]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ay.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ay.llIIlIlIIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d7, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v268, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fi() {
        if (lIlIlIlIIIlIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[0]];
            C0015b.a(bv);
            if (lIlIlIlIIIllI(bv.size(), llIIlIlIIl[1])) {
                System.out.println(llIIlIlIII[llIIlIlIIl[1]]);
                bt = llIIlIlIIl[0];
            }
        }
        if (lIlIlIlIIIlll(bt ? 1 : 0)) {
            if (lIlIlIlIIIlIl(an() ? 1 : 0)) {
                int[] iArr = new int[llIIlIlIIl[1]];
                iArr[llIIlIlIIl[0]] = llIIlIlIIl[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lIlIlIlIIlIIl(nearest) && lIlIlIlIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[3]];
                C0000a.a(nearest);
            }
            if (lIlIlIlIIlIIl(nearest) && lIlIlIlIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIlIlIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIIlIlIIl[5]);
                    "".length();
                }
                if (lIlIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[6]];
                    if (lIlIlIlIIlIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIIlIlIIl[4]);
                        "".length();
                    }
                    if (lIlIlIlIIlIII(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(llIIlIlIIl[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[llIIlIlIIl[1]];
                    iArr2[llIIlIlIIl[0]] = llIIlIlIIl[7];
                    if (lIlIlIlIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIlIlIIl[1]];
                        iArr3[llIIlIlIIl[0]] = llIIlIlIIl[7];
                    }
                    int[] iArr4 = new int[llIIlIlIIl[1]];
                    iArr4[llIIlIlIIl[0]] = llIIlIlIIl[8];
                    if (lIlIlIlIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIIlIlIIl[1]];
                        iArr5[llIIlIlIIl[0]] = llIIlIlIIl[8];
                    }
                    int[] iArr6 = new int[llIIlIlIIl[1]];
                    iArr6[llIIlIlIIl[0]] = llIIlIlIIl[8];
                    if (lIlIlIlIIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIIlIlIIl[1]];
                        iArr7[llIIlIlIIl[0]] = llIIlIlIIl[8];
                        if (lIlIlIlIIIllI(Inventory.getCount(iArr7), llIIlIlIIl[1])) {
                            Bank.withdraw(llIIlIlIIl[8], llIIlIlIIl[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIIlIlIIl[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr8 = new int[llIIlIlIIl[1]];
                                iArr8[llIIlIlIIl[0]] = llIIlIlIIl[8];
                                if (lIlIlIlIIlIII(Inventory.getCount(iArr8))) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[5]);
                            "".length();
                        }
                    }
                    int[] iArr8 = new int[llIIlIlIIl[1]];
                    iArr8[llIIlIlIIl[0]] = llIIlIlIIl[7];
                    if (lIlIlIlIIIlIl(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[llIIlIlIIl[1]];
                        iArr9[llIIlIlIIl[0]] = llIIlIlIIl[7];
                        if (lIlIlIlIIIllI(Inventory.getCount(iArr9), llIIlIlIIl[1])) {
                            int[] iArr10 = new int[llIIlIlIIl[1]];
                            iArr10[llIIlIlIIl[0]] = llIIlIlIIl[8];
                            if (lIlIlIlIIlIII(Inventory.getCount(iArr10))) {
                                Bank.withdrawAll(llIIlIlIIl[7], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIlIlIIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[llIIlIlIIl[1]];
                                    iArr11[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                    if (lIlIlIlIIlIII(Inventory.getCount(iArr11))) {
                                        ?? r0 = llIIlIlIIl[1];
                                        "".length();
                                        return " ".length() != " ".length() ? ((47 ^ 119) ^ (92 ^ 48)) & (((103 ^ 81) ^ "  ".length()) ^ (-" ".length())) : r0;
                                    }
                                    return llIIlIlIIl[0];
                                }, llIIlIlIIl[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlIlIlIIIlIl(an() ? 1 : 0)) {
                if (lIlIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIlIlIlIIIlll(Bank.isOpen() ? 1 : 0) && lIlIlIlIIIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[10]];
                    if (lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIlIlIlIIIlll(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks(llIIlIlIIl[3]);
                        "".length();
                        int[] iArr11 = new int[llIIlIlIIl[1]];
                        iArr11[llIIlIlIIl[0]] = llIIlIlIIl[8];
                        Item first = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[llIIlIlIIl[1]];
                        iArr12[llIIlIlIIl[0]] = llIIlIlIIl[7];
                        Item first2 = Inventory.getFirst(iArr12);
                        if (lIlIlIlIIlIIl(first) && lIlIlIlIIlIIl(first2)) {
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, llIIlIlIIl[5]);
                            "".length();
                        }
                    }
                    if (lIlIlIlIIIlIl(Production.isOpen() ? 1 : 0)) {
                        if (lIlIlIlIIIllI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[6])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[11]];
                            Production.chooseOption(llIIlIlIII[llIIlIlIIl[12]]);
                            Time.sleepTicks(llIIlIlIIl[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIlIlIIl[1]];
                                iArr13[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!lIlIlIlIIlIlI(Inventory.getCount(iArr13), llIIlIlIIl[1]) || lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return (((184 ^ 148) ^ (16 ^ 40)) & (((61 ^ 24) ^ (243 ^ 194)) ^ (-" ".length()))) <= (-" ".length()) ? ((78 ^ 80) ^ (((95 + 66) - 128) + 94)) & (((((91 + 74) - 111) + 109) ^ (((26 + 97) - (-6)) + 65)) ^ (-" ".length())) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[13]);
                            "".length();
                        }
                        if (lIlIlIlIIlIlI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[6]) && lIlIlIlIIIllI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[14])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[15]];
                            Production.chooseOption(llIIlIlIIl[3]);
                            Time.sleepTicks(llIIlIlIIl[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIlIlIIl[1]];
                                iArr13[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!lIlIlIlIIlIlI(Inventory.getCount(iArr13), llIIlIlIIl[1]) || lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[13]);
                            "".length();
                        }
                        if (lIlIlIlIIlIlI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[14]) && lIlIlIlIIIllI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[16])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[17]];
                            Production.chooseOption(llIIlIlIII[llIIlIlIIl[18]]);
                            Time.sleepTicks(llIIlIlIIl[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIlIlIIl[1]];
                                iArr13[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!lIlIlIlIIlIlI(Inventory.getCount(iArr13), llIIlIlIIl[1]) || lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return (76 ^ 72) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[13]);
                            "".length();
                        }
                        if (lIlIlIlIIlIlI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[16]) && lIlIlIlIIIllI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[19])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[14]];
                            Production.chooseOption(llIIlIlIII[llIIlIlIIl[20]]);
                            Time.sleepTicks(llIIlIlIIl[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIlIlIIl[1]];
                                iArr13[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!lIlIlIlIIlIlI(Inventory.getCount(iArr13), llIIlIlIIl[1]) || lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return "   ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[13]);
                            "".length();
                        }
                        if (lIlIlIlIIlIlI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[19]) && lIlIlIlIIIllI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[21])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[22]];
                            Production.chooseOption(llIIlIlIII[llIIlIlIIl[23]]);
                            Time.sleepTicks(llIIlIlIIl[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIlIlIIl[1]];
                                iArr13[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!lIlIlIlIIlIlI(Inventory.getCount(iArr13), llIIlIlIIl[1]) || lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return (-"  ".length()) > 0 ? ((5 ^ 51) ^ (192 ^ 182)) & (((((80 + 190) - 235) + 187) ^ (((138 + 26) - 16) + 10)) ^ (-" ".length())) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[13]);
                            "".length();
                        }
                        if (lIlIlIlIIlIlI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[21]) && lIlIlIlIIIllI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[24])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[25]];
                            Production.chooseOption(llIIlIlIII[llIIlIlIIl[26]]);
                            Time.sleepTicks(llIIlIlIIl[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIlIlIIl[1]];
                                iArr13[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!lIlIlIlIIlIlI(Inventory.getCount(iArr13), llIIlIlIIl[1]) || lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return "   ".length() < ((82 ^ 105) & ((178 ^ 137) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[13]);
                            "".length();
                        }
                        if (lIlIlIlIIlIlI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[24]) && lIlIlIlIIIllI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[27])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[28]];
                            Production.chooseOption(llIIlIlIII[llIIlIlIIl[29]]);
                            Time.sleepTicks(llIIlIlIIl[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIlIlIIl[1]];
                                iArr13[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!lIlIlIlIIlIlI(Inventory.getCount(iArr13), llIIlIlIIl[1]) || lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[13]);
                            "".length();
                        }
                        if (lIlIlIlIIlIlI(Skills.getLevel(Skill.CRAFTING), llIIlIlIIl[27])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[30]];
                            Production.chooseOption(llIIlIlIII[llIIlIlIIl[31]]);
                            Time.sleepTicks(llIIlIlIIl[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIlIlIIl[1]];
                                iArr13[llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!lIlIlIlIIlIlI(Inventory.getCount(iArr13), llIIlIlIIl[1]) || lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIlIlIIl[1];
                                    "".length();
                                    return "   ".length() < 0 ? ((100 ^ 36) ^ (3 ^ 11)) & (((83 ^ 106) ^ (126 ^ 15)) ^ (-" ".length())) : r0;
                                }
                                return llIIlIlIIl[0];
                            }, llIIlIlIIl[13]);
                            "".length();
                        }
                    }
                }
            }
        }
    }
}
