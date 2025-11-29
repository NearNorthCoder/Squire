/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class s
implements M {
    private static /* synthetic */ int[] lIIIlllIIlllI;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ int fp;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ WorldPoint fu;
    private static /* synthetic */ String[] lIIIlllIIllII;
    public static /* synthetic */ List<d> bA;
    static /* synthetic */ int co;
    private static final /* synthetic */ String[] ft;
    public static final /* synthetic */ int fr;
    public static final /* synthetic */ int fq;
    public static final /* synthetic */ WorldPoint fs;
    static /* synthetic */ int bY;

    private static boolean lIlIIlIIIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIIlIIIIIlIlI() {
        lIIIlllIIllII = new String[lIIIlllIIlllI[32]];
        s.lIIIlllIIllII[s.lIIIlllIIlllI[0]] = s.lIlIIlIIIIIIlII("vh9JzT/x7Ju8h+Ipvi3bYA==", "eFOgc");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[1]] = s.lIlIIlIIIIIIlIl("ESo4GRw/JjJQDSI6Px4IdyoiFQIkb3YDGD43NRgGOSR2Eg40KHYEAHcyIxUcIw==", "WCVpo");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[4]] = s.lIlIIlIIIIIIllI("xKhEAEoZ9oiTS2nsK8KXcA==", "HwLJM");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[5]] = s.lIlIIlIIIIIIllI("/v25EHCfJSftpzEImYkCnRzauWKz0abx", "NanBf");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[2]] = s.lIlIIlIIIIIIlII("yXM+8fLl1A61z6PvzCHBzHVd+W5i7rBlQGCnycOhB8FblA3rBFHL1QrAVPqHsCnGOVfEOQXKuYg=", "osEXQ");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[11]] = s.lIlIIlIIIIIIllI("Sr/krelXF72u7nrp46p2QA==", "KOpof");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[12]] = s.lIlIIlIIIIIIlIl("BTMFDCUkPAxILSQzBwcu", "MRkhI");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[13]] = s.lIlIIlIIIIIIlIl("CT8jOg==", "JPLQo");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[22]] = s.lIlIIlIIIIIIllI("4ROcWseeAuITRgOJW1b6UOQ4+CmeXGJV", "tcfMy");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[23]] = s.lIlIIlIIIIIIlII("+lp9KIm6qTLbSF2m4sHRGZkKap4MJaD1", "gwlDg");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[14]] = s.lIlIIlIIIIIIlII("P2m4iRK8oXHEjbdpjK1EY1iOAiqMXpK2", "jNDDC");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[26]] = s.lIlIIlIIIIIIllI("pCXzoER504M1POL8dRBd7Hk9Mx4xQTHSk6hsoEdsG9AVrYPPLW9wpBRgh4bDh81E", "dVAxq");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[27]] = s.lIlIIlIIIIIIllI("4R16LrXhL4hfRVSTGxqMHHu3eA0uK+T6apqFGIagFsUI7iIdlDf8XEkzr95ALucq", "XrskW");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[28]] = s.lIlIIlIIIIIIlII("AUhSZijAs3k=", "rrWlT");
        s.lIIIlllIIllII[s.lIIIlllIIlllI[29]] = s.lIlIIlIIIIIIllI("MiY0VNDTXLUnC6gcpOuRCg==", "taGfF");
    }

    private static String lIlIIlIIIIIIlII(String lllllllllllllllIIIIIllIIIIlIIIll, String lllllllllllllllIIIIIllIIIIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIIIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIIIlllIIlllI[22]), "DES");
            Cipher lllllllllllllllIIIIIllIIIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIIIIllIIIIlIIlll.init(lIIIlllIIlllI[4], lllllllllllllllIIIIIllIIIIlIlIII);
            return new String(lllllllllllllllIIIIIllIIIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIllIIIIlIIllI) {
            lllllllllllllllIIIIIllIIIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIIIIlIll() {
        lIIIlllIIlllI = new int[33];
        s.lIIIlllIIlllI[0] = (0x8B ^ 0x8C) & ~(0x8B ^ 0x8C);
        s.lIIIlllIIlllI[1] = " ".length();
        s.lIIIlllIIlllI[2] = 0x71 ^ 0x46 ^ (0x12 ^ 0x21);
        s.lIIIlllIIlllI[3] = 0x15 ^ 8;
        s.lIIIlllIIlllI[4] = "  ".length();
        s.lIIIlllIIlllI[5] = "   ".length();
        s.lIIIlllIIlllI[6] = -(0xFFFFBDF6 & 0x665D) & (0xFFFFB7FB & 0x7FDF);
        s.lIIIlllIIlllI[7] = -(0xFFFFC979 & 0x3ED7) & (0xFFFFFFFD & 0xFDF);
        s.lIIIlllIIlllI[8] = 0xFFFFE7FB & 0x1F9C;
        s.lIIIlllIIlllI[9] = -(0xFFFF96F1 & 0x796F) & (0xFFFF9FF7 & 0x77EF);
        s.lIIIlllIIlllI[10] = 0xFFFFDFEE & 0x3F59;
        s.lIIIlllIIlllI[11] = 0x7D ^ 0x3D ^ (0x23 ^ 0x66);
        s.lIIIlllIIlllI[12] = 0x32 ^ 0x34;
        s.lIIIlllIIlllI[13] = 169 + 125 - 156 + 58 ^ 49 + 127 - -10 + 9;
        s.lIIIlllIIlllI[14] = 0x7E ^ 0x23 ^ (0xDD ^ 0x8A);
        s.lIIIlllIIlllI[15] = -(0xFFFFFE9E & 0x716F) & (0xFFFFF7DD & Short.MAX_VALUE);
        s.lIIIlllIIlllI[16] = 0xFFFFAFFD & 0x7ECE;
        s.lIIIlllIIlllI[17] = -(0xFFFFF65A & 0xBA7) & (0xFFFFEFA9 & 0x73FF);
        s.lIIIlllIIlllI[18] = 0xFFFFBF7F & 0x5FC7;
        s.lIIIlllIIlllI[19] = 0x3F ^ 0x17;
        s.lIIIlllIIlllI[20] = -(0xFFFFFB3E & 0x54D3) & (0xFFFFFF7F & 0x57FD);
        s.lIIIlllIIlllI[21] = 58 + 7 - 48 + 184 ^ 8 + 101 - 58 + 122;
        s.lIIIlllIIlllI[22] = 0x14 ^ 0x1C;
        s.lIIIlllIIlllI[23] = 0x4B ^ 0x42;
        s.lIIIlllIIlllI[24] = -(0xFFFFFBD1 & 0x176F) & (0xFFFFBFF7 & 0x5FCF);
        s.lIIIlllIIlllI[25] = 0xFFFFCCEF & 0x3F9E;
        s.lIIIlllIIlllI[26] = 0x3A ^ 0x31;
        s.lIIIlllIIlllI[27] = 0x60 ^ 0x39 ^ (0x39 ^ 0x6C);
        s.lIIIlllIIlllI[28] = 0x5A ^ 0x57;
        s.lIIIlllIIlllI[29] = 68 + 97 - 87 + 54 ^ 17 + 39 - 12 + 94;
        s.lIIIlllIIlllI[30] = 0xFFFFACE9 & 0x5F9F;
        s.lIIIlllIIlllI[31] = 0xFFFFFED7 & 0xDBB;
        s.lIIIlllIIlllI[32] = 0x40 ^ 0x4F;
    }

    @Override
    public boolean X() {
        return lIIIlllIIlllI[0];
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (s.lIlIIlIIIIlIIll(e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
            bl = lIIIlllIIlllI[1];
            "".length();
            if (" ".length() == 0) {
                return ((0x22 ^ 8) & ~(1 ^ 0x2B)) != 0;
            }
        } else {
            bl = lIIIlllIIlllI[0];
        }
        return bl;
    }

    static {
        s.lIlIIlIIIIIlIll();
        s.lIlIIlIIIIIlIlI();
        fp = lIIIlllIIlllI[9];
        fr = lIIIlllIIlllI[7];
        fq = lIIIlllIIlllI[8];
        fs = new WorldPoint(lIIIlllIIlllI[24], lIIIlllIIlllI[25], lIIIlllIIlllI[0]);
        String[] stringArray = new String[lIIIlllIIlllI[11]];
        stringArray[s.lIIIlllIIlllI[0]] = lIIIlllIIllII[lIIIlllIIlllI[14]];
        stringArray[s.lIIIlllIIlllI[1]] = lIIIlllIIllII[lIIIlllIIlllI[26]];
        stringArray[s.lIIIlllIIlllI[4]] = lIIIlllIIllII[lIIIlllIIlllI[27]];
        stringArray[s.lIIIlllIIlllI[5]] = lIIIlllIIllII[lIIIlllIIlllI[28]];
        stringArray[s.lIIIlllIIlllI[2]] = lIIIlllIIllII[lIIIlllIIlllI[29]];
        ft = stringArray;
        fu = new WorldPoint(lIIIlllIIlllI[30], lIIIlllIIlllI[31], lIIIlllIIlllI[4]);
        bA = new ArrayList<d>();
        bY = lIIIlllIIlllI[0];
    }

    private static boolean lIlIIlIIIIIllll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int Y() {
        try {
            s.be();
            "".length();
        }
        catch (Exception lllllllllllllllIIIIIllIIIIlllIlI) {
            lllllllllllllllIIIIIllIIIIlllIlI.printStackTrace();
        }
        if ("   ".length() <= 0) {
            return (113 + 203 - 169 + 94 ^ 94 + 164 - 233 + 154) & (0x69 ^ 0x59 ^ (0xEB ^ 0x99) ^ -" ".length());
        }
        return lIIIlllIIlllI[21];
    }

    private static String lIlIIlIIIIIIlIl(String lllllllllllllllIIIIIllIIIIIlIlIl, String lllllllllllllllIIIIIllIIIIIIllll) {
        lllllllllllllllIIIIIllIIIIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIllIIIIIlIIll = new StringBuilder();
        char[] lllllllllllllllIIIIIllIIIIIlIIlI = lllllllllllllllIIIIIllIIIIIIllll.toCharArray();
        int lllllllllllllllIIIIIllIIIIIlIIIl = lIIIlllIIlllI[0];
        char[] lllllllllllllllIIIIIllIIIIIIlIll = lllllllllllllllIIIIIllIIIIIlIlIl.toCharArray();
        int lllllllllllllllIIIIIllIIIIIIlIlI = lllllllllllllllIIIIIllIIIIIIlIll.length;
        int lllllllllllllllIIIIIllIIIIIIlIIl = lIIIlllIIlllI[0];
        while (s.lIlIIlIIIIIllIl(lllllllllllllllIIIIIllIIIIIIlIIl, lllllllllllllllIIIIIllIIIIIIlIlI)) {
            char lllllllllllllllIIIIIllIIIIIlIllI = lllllllllllllllIIIIIllIIIIIIlIll[lllllllllllllllIIIIIllIIIIIIlIIl];
            lllllllllllllllIIIIIllIIIIIlIIll.append((char)(lllllllllllllllIIIIIllIIIIIlIllI ^ lllllllllllllllIIIIIllIIIIIlIIlI[lllllllllllllllIIIIIllIIIIIlIIIl % lllllllllllllllIIIIIllIIIIIlIIlI.length]));
            "".length();
            ++lllllllllllllllIIIIIllIIIIIlIIIl;
            ++lllllllllllllllIIIIIllIIIIIIlIIl;
            "".length();
            if (" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIllIIIIIlIIll);
    }

    public static void be() {
        if (s.lIlIIlIIIIIllII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[0]];
            b.a(bA);
            if (s.lIlIIlIIIIIllIl(bA.size(), lIIIlllIIlllI[1])) {
                System.out.println(lIIIlllIIllII[lIIIlllIIlllI[1]]);
                by = lIIIlllIIlllI[0];
            }
        }
        if (s.lIlIIlIIIIIlllI(by ? 1 : 0)) {
            if (s.lIlIIlIIIIIlllI(s.S() ? 1 : 0) && s.lIlIIlIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[2]) && s.lIlIIlIIIIIllIl(e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
                BankLocation lllllllllllllllIIIIIllIIIlIIIIII = BankLocation.getNearest();
                if (s.lIlIIlIIIIlIIII(lllllllllllllllIIIIIllIIIlIIIIII) && s.lIlIIlIIIIIlllI(lllllllllllllllIIIIIllIIIlIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[4]];
                    a.a(lllllllllllllllIIIIIllIIIlIIIIII);
                }
                if (s.lIlIIlIIIIlIIII(lllllllllllllllIIIIIllIIIlIIIIII) && s.lIlIIlIIIIIllII(lllllllllllllllIIIIIllIIIlIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[5]];
                    if (s.lIlIIlIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIIlllI[6]);
                        "".length();
                    }
                    if (s.lIlIIlIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (s.lIlIIlIIIIlIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllIIlllI[2]);
                            "".length();
                        }
                        if (s.lIlIIlIIIIlIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlllIIlllI[4]);
                            "".length();
                        }
                        int[] nArray = new int[lIIIlllIIlllI[2]];
                        nArray[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                        nArray[s.lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                        nArray[s.lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                        nArray[s.lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                        if (s.lIlIIlIIIIIlllI(e.b(nArray) ? 1 : 0)) {
                            s.W();
                            System.out.println(lIIIlllIIllII[lIIIlllIIlllI[2]]);
                            by = lIIIlllIIlllI[1];
                            return;
                        }
                        if (s.lIlIIlIIIIIllII(AccBuilderRat.e ? 1 : 0)) {
                            a.b(f.bk, lIIIlllIIlllI[1]);
                        }
                        int[] nArray2 = new int[lIIIlllIIlllI[2]];
                        nArray2[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                        nArray2[s.lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                        nArray2[s.lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                        nArray2[s.lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                        if (s.lIlIIlIIIIIllII(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIlllIIlllI[2]];
                            nArray3[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                            nArray3[s.lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                            nArray3[s.lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                            nArray3[s.lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!s.lIlIIlIIIIIlllI(s.S() ? 1 : 0) || s.lIlIIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[2])) && s.lIlIIlIIIIIllIl(e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
                AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[11]];
                if (s.lIlIIlIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[5])) {
                    co = lIIIlllIIlllI[0];
                    Movement.walkTo((WorldPoint)fs);
                    "".length();
                }
                if (s.lIlIIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[5])) {
                    if (s.lIlIIlIIIIIllIl(co, lIIIlllIIlllI[1])) {
                        P.lD += lIIIlllIIlllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllIIlllI[1];
                        P.lD = lIIIlllIIlllI[0];
                        cp = lIIIlllIIlllI[0];
                    }
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[12]];
                    if (s.lIlIIlIIIIIllIl(bY, lIIIlllIIlllI[1])) {
                        e.w();
                        bY += lIIIlllIIlllI[1];
                    }
                    g.a(lIIIlllIIllII[lIIIlllIIlllI[13]], ft);
                }
            }
            g.a(new String[lIIIlllIIlllI[0]]);
        }
    }

    private static boolean lIlIIlIIIIlIIIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIlllIIlllI[1]];
        nArray[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
        if (s.lIlIIlIIIIlIIIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIlllIIlllI[1]];
            nArray2[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[9];
            if (s.lIlIIlIIIIlIIIl(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIlllIIlllI[1]];
                nArray3[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[8];
                if (s.lIlIIlIIIIlIIIl(Inventory.getCount((int[])nArray3))) {
                    n2 = lIIIlllIIlllI[1];
                    "".length();
                    if (" ".length() != 0) return n2 != 0;
                    return ((0x26 ^ 0x2C) & ~(0x54 ^ 0x5E) & ~((0x2F ^ 0x4C) & ~(0xE9 ^ 0x8A))) != 0;
                }
            }
        }
        n2 = lIIIlllIIlllI[0];
        return n2 != 0;
    }

    private static boolean lIlIIlIIIIIllII(int n2) {
        return n2 != 0;
    }

    @Override
    public String Z() {
        return lIIIlllIIllII[lIIIlllIIlllI[22]];
    }

    private static void W() {
        d lllllllllllllllIIIIIllIIIIllllII;
        Object lllllllllllllllIIIIIllIIIIllllIl;
        int[] nArray = new int[lIIIlllIIlllI[1]];
        nArray[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[9];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIlllIIlllI[9], lIIIlllIIlllI[1], lIIIlllIIlllI[6]);
            bA.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lIIIlllIIlllI[1]];
        nArray2[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[8];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllIIIIIllIIIIllllIl = new d(lIIIlllIIlllI[8], lIIIlllIIlllI[1], lIIIlllIIlllI[6]);
            bA.add((d)lllllllllllllllIIIIIllIIIIllllIl);
            "".length();
        }
        int[] nArray3 = new int[lIIIlllIIlllI[1]];
        nArray3[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllIIIIIllIIIIllllIl = new d(lIIIlllIIlllI[7], lIIIlllIIlllI[1], lIIIlllIIlllI[6]);
            bA.add((d)lllllllllllllllIIIIIllIIIIllllIl);
            "".length();
        }
        int[] nArray4 = new int[lIIIlllIIlllI[1]];
        nArray4[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[10];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllIIIIIllIIIIllllIl = new d(lIIIlllIIlllI[10], lIIIlllIIlllI[14], lIIIlllIIlllI[15]);
            bA.add((d)lllllllllllllllIIIIIllIIIIllllIl);
            "".length();
        }
        if (s.lIlIIlIIIIIlllI(Bank.contains((Predicate)(lllllllllllllllIIIIIllIIIIllllIl = item -> item.getName().toLowerCase().contains(lIIIlllIIllII[lIIIlllIIlllI[23]]))) ? 1 : 0)) {
            lllllllllllllllIIIIIllIIIIllllII = new d(lIIIlllIIlllI[16], lIIIlllIIlllI[11], lIIIlllIIlllI[17]);
            bA.add(lllllllllllllllIIIIIllIIIIllllII);
            "".length();
        }
        int[] nArray5 = new int[lIIIlllIIlllI[1]];
        nArray5[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[18];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllIIIIIllIIIIllllII = new d(lIIIlllIIlllI[18], lIIIlllIIlllI[19], lIIIlllIIlllI[20]);
            bA.add(lllllllllllllllIIIIIllIIIIllllII);
            "".length();
        }
    }

    private static boolean lIlIIlIIIIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIIIIIIllI(String lllllllllllllllIIIIIllIIIIllIIlI, String lllllllllllllllIIIIIllIIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIllIIIIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIllIIIIllIlII.init(lIIIlllIIlllI[4], lllllllllllllllIIIIIllIIIIllIlIl);
            return new String(lllllllllllllllIIIIIllIIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIllIIIIllIIll) {
            lllllllllllllllIIIIIllIIIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIIlllI(int n2) {
        return n2 == 0;
    }
}

