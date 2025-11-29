/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
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
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class E
implements M {
    static /* synthetic */ int bY;
    static /* synthetic */ int co;
    static /* synthetic */ boolean cp;
    public static /* synthetic */ List<d> bA;
    private static final /* synthetic */ WorldPoint hj;
    private static /* synthetic */ int[] lIIIllllIIllI;
    private static /* synthetic */ String[] lIIIllllIIlIl;
    private static final /* synthetic */ WorldPoint hg;
    public static final /* synthetic */ String[] hf;
    private static final /* synthetic */ WorldPoint hi;
    private static final /* synthetic */ WorldPoint hh;
    public static /* synthetic */ boolean by;

    static {
        E.lIlIIlIlIllIllI();
        E.lIlIIlIlIllIlIl();
        String[] stringArray = new String[lIIIllllIIllI[23]];
        stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[54]];
        stringArray[E.lIIIllllIIllI[1]] = lIIIllllIIlIl[lIIIllllIIllI[55]];
        stringArray[E.lIIIllllIIllI[3]] = lIIIllllIIlIl[lIIIllllIIllI[56]];
        stringArray[E.lIIIllllIIllI[5]] = lIIIllllIIlIl[lIIIllllIIllI[57]];
        stringArray[E.lIIIllllIIllI[7]] = lIIIllllIIlIl[lIIIllllIIllI[58]];
        stringArray[E.lIIIllllIIllI[8]] = lIIIllllIIlIl[lIIIllllIIllI[59]];
        stringArray[E.lIIIllllIIllI[14]] = lIIIllllIIlIl[lIIIllllIIllI[60]];
        stringArray[E.lIIIllllIIllI[20]] = lIIIllllIIlIl[lIIIllllIIllI[61]];
        stringArray[E.lIIIllllIIllI[18]] = lIIIllllIIlIl[lIIIllllIIllI[62]];
        stringArray[E.lIIIllllIIllI[21]] = lIIIllllIIlIl[lIIIllllIIllI[63]];
        stringArray[E.lIIIllllIIllI[15]] = lIIIllllIIlIl[lIIIllllIIllI[64]];
        stringArray[E.lIIIllllIIllI[19]] = lIIIllllIIlIl[lIIIllllIIllI[65]];
        stringArray[E.lIIIllllIIllI[22]] = lIIIllllIIlIl[lIIIllllIIllI[66]];
        hf = stringArray;
        hg = new WorldPoint(lIIIllllIIllI[16], lIIIllllIIllI[67], lIIIllllIIllI[0]);
        hh = new WorldPoint(lIIIllllIIllI[68], lIIIllllIIllI[69], lIIIllllIIllI[0]);
        hi = new WorldPoint(lIIIllllIIllI[70], lIIIllllIIllI[71], lIIIllllIIllI[0]);
        hj = new WorldPoint(lIIIllllIIllI[72], lIIIllllIIllI[73], lIIIllllIIllI[0]);
        bA = new ArrayList<d>();
        bY = lIIIllllIIllI[0];
    }

    private static boolean lIlIIlIlIllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIlIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIlIllIlII(String lllllllllllllllIIIIIIlllllIIIIlI, String lllllllllllllllIIIIIIlllllIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlllllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlllllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIlllllIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIlllllIIIllI.init(lIIIllllIIllI[3], lllllllllllllllIIIIIIlllllIIIlll);
            return new String(lllllllllllllllIIIIIIlllllIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIlllllIIIlIl) {
            lllllllllllllllIIIIIIlllllIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlIlIllIIll(String lllllllllllllllIIIIIIllllIIlllll, String lllllllllllllllIIIIIIllllIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIllllIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllllIIlllII.getBytes(StandardCharsets.UTF_8)), lIIIllllIIllI[18]), "DES");
            Cipher lllllllllllllllIIIIIIllllIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIllllIlIIIIl.init(lIIIllllIIllI[3], lllllllllllllllIIIIIIllllIlIIIlI);
            return new String(lllllllllllllllIIIIIIllllIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIllllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIllllIlIIIII) {
            lllllllllllllllIIIIIIllllIlIIIII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean X() {
        return lIIIllllIIllI[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIllllIIllI[1]];
        nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[11];
        if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray) ? 1 : 0) && (!E.lIlIIlIlIlllIlI(Inventory.contains((int[])f.aW) ? 1 : 0) || E.lIlIIlIlIlllIII(Equipment.contains((int[])f.aW) ? 1 : 0)) && E.lIlIIlIlIlllIII(Inventory.contains((int[])f.ba) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllllIIllI[1]];
            nArray2[E.lIIIllllIIllI[0]] = lIIIllllIIllI[13];
            if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllllIIllI[1]];
                nArray3[E.lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIllllIIllI[1];
                    "".length();
                    if ((0x13 ^ 0x17) >= " ".length()) return n2 != 0;
                    return ((0x1B ^ 0x13) & ~(0xB4 ^ 0xBC)) != 0;
                }
            }
        }
        n2 = lIIIllllIIllI[0];
        return n2 != 0;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (E.lIlIIlIllIIIIlI(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[8])) {
            bl = lIIIllllIIllI[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0xB9 ^ 0x9F ^ (0xF6 ^ 0x9B)) & (0xCA ^ 0x94 ^ (0xA ^ 0x1F) ^ -" ".length()) & ((190 + 56 - 138 + 142 ^ 62 + 81 - 141 + 161) & (0xE3 ^ 0x9F ^ (0x6A ^ 0x4F) ^ -" ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIIllllIIllI[0];
        }
        return bl;
    }

    private static boolean lIlIIlIlIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIllIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIllIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIllIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlIlllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIIlIlIllIIlI(String lllllllllllllllIIIIIIllllIlIllll, String lllllllllllllllIIIIIIllllIllIIll) {
        lllllllllllllllIIIIIIllllIlIllll = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIllllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIllllIllIIlI = new StringBuilder();
        char[] lllllllllllllllIIIIIIllllIllIIIl = lllllllllllllllIIIIIIllllIllIIll.toCharArray();
        int lllllllllllllllIIIIIIllllIllIIII = lIIIllllIIllI[0];
        char[] lllllllllllllllIIIIIIllllIlIlIlI = lllllllllllllllIIIIIIllllIlIllll.toCharArray();
        int lllllllllllllllIIIIIIllllIlIlIIl = lllllllllllllllIIIIIIllllIlIlIlI.length;
        int lllllllllllllllIIIIIIllllIlIlIII = lIIIllllIIllI[0];
        while (E.lIlIIlIlIlllIIl(lllllllllllllllIIIIIIllllIlIlIII, lllllllllllllllIIIIIIllllIlIlIIl)) {
            char lllllllllllllllIIIIIIllllIllIlIl = lllllllllllllllIIIIIIllllIlIlIlI[lllllllllllllllIIIIIIllllIlIlIII];
            lllllllllllllllIIIIIIllllIllIIlI.append((char)(lllllllllllllllIIIIIIllllIllIlIl ^ lllllllllllllllIIIIIIllllIllIIIl[lllllllllllllllIIIIIIllllIllIIII % lllllllllllllllIIIIIIllllIllIIIl.length]));
            "".length();
            ++lllllllllllllllIIIIIIllllIllIIII;
            ++lllllllllllllllIIIIIIllllIlIlIII;
            "".length();
            if (" ".length() <= " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIIllllIllIIlI);
    }

    private static void lIlIIlIlIllIlIl() {
        lIIIllllIIlIl = new String[lIIIllllIIllI[74]];
        E.lIIIllllIIlIl[E.lIIIllllIIllI[0]] = E.lIlIIlIlIllIIlI("FwA3MAIyVSctCTgG", "UuNYl");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[1]] = E.lIlIIlIlIllIIlI("MSEWJisfLRxvOgIxESE/VyEMKjUEZFg8Lx48GycxGS9YLTkUI1g7N1c5DSorAw==", "wHxOX");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[3]] = E.lIlIIlIlIllIIll("q9Rxn8RFD54=", "ineTi");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[5]] = E.lIlIIlIlIllIlII("gl95HcS+Rgk=", "gfWEl");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[7]] = E.lIlIIlIlIllIIlI("IyMYTR0CYgwMBwY=", "mBnmi");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[8]] = E.lIlIIlIlIllIIlI("GBgiPg45Fyt6ADEXJzMMNw==", "PyLZb");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[14]] = E.lIlIIlIlIllIlII("QXmQdQumt6ajkI4zUbABcX508btC/IV3n1OIAvGF7wFW47xLcXtMR52ndkQWl4zNNZ8hSwhVVKA=", "TOPGx");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[20]] = E.lIlIIlIlIllIlII("h4j6ZebXbKflL0GQCIimaQ==", "sTgBm");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[18]] = E.lIlIIlIlIllIlII("wWcPz6ZH/fz7d87hx6tuuA==", "izvSn");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[21]] = E.lIlIIlIlIllIIll("4+3F7jW/sOYE6VqSRg2FZQ==", "lWvjG");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[15]] = E.lIlIIlIlIllIlII("FRvRWxK9RwhCR0G7guvUwg==", "pRRsL");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[19]] = E.lIlIIlIlIllIlII("FqtPsMWcV0DnRgqxmYScyokR4RVjTNOe", "yfEVD");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[22]] = E.lIlIIlIlIllIIll("jSuBrQ0ft6bVtQOGjxnpug==", "JdPdi");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[23]] = E.lIlIIlIlIllIlII("/nxorBTSAtc=", "OgLwX");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[24]] = E.lIlIIlIlIllIIll("6knAMrrFx80=", "ZsFBs");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[25]] = E.lIlIIlIlIllIIlI("BAcfKw==", "KwzEI");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[26]] = E.lIlIIlIlIllIIll("U1mVhhl0f7ie2V0OZzax0g==", "TngKk");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[28]] = E.lIlIIlIlIllIIll("Zu7u4nFnZt8=", "eCoHB");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[29]] = E.lIlIIlIlIllIlII("8Dq2e9divxq6nI0xV6dQHw==", "YZZgo");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[30]] = E.lIlIIlIlIllIlII("fePfTWNLBpGcCigxZht+1Q==", "RTQEK");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[31]] = E.lIlIIlIlIllIIll("iN1oVi9QT85SM7xeo7AHRA==", "LWwwm");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[32]] = E.lIlIIlIlIllIIll("a9PrZnmtkf7SNEgJgxRCNg==", "HiLOI");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[33]] = E.lIlIIlIlIllIIlI("OQkcLj0U", "zfzHT");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[34]] = E.lIlIIlIlIllIlII("ghji0s4yyMg=", "mSDOW");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[35]] = E.lIlIIlIlIllIlII("TK1O9vUVBlm4qPtUZmSb7g==", "LTUCD");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[36]] = E.lIlIIlIlIllIlII("KYhLRlruVQOsLS45q14VQw==", "jylgq");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[37]] = E.lIlIIlIlIllIIlI("LgInOAI=", "onSYp");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[38]] = E.lIlIIlIlIllIIlI("CigRNjox", "YMpDY");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[39]] = E.lIlIIlIlIllIlII("YCbwcX/rN8w=", "EfuCa");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[40]] = E.lIlIIlIlIllIIlI("OjY7SzEbdy4EIxI+Iw==", "tWMkE");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[41]] = E.lIlIIlIlIllIlII("hryto2efngXHIUbK6dq+Xw==", "uLXPr");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[42]] = E.lIlIIlIlIllIlII("FXbbKysh2rA=", "BMxcM");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[43]] = E.lIlIIlIlIllIlII("5SKOrSQuMUM=", "jMfqX");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[44]] = E.lIlIIlIlIllIIll("EJk6xsIEOS0=", "Wbooa");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[45]] = E.lIlIIlIlIllIlII("A8zntLsT8zDp4oOvw3akeQ==", "anNnh");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[52]] = E.lIlIIlIlIllIIlI("EQgbHBQmHhtIHysCGxxYMhgNGww=", "Cmhhx");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[53]] = E.lIlIIlIlIllIlII("gg1ufmDp/cojNrD7LsAtpANk/F8v2VVJ", "KKaNp");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[54]] = E.lIlIIlIlIllIIll("dNvZe/IQbAlm7XL70o+PXb0qu7Yzp9p29mL2MECS53c=", "oXSyU");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[55]] = E.lIlIIlIlIllIIll("YwomfIsbbnISyIRZadN2VqYLJVdsm+mppcZRPqz+lhke/fbay6T4Nw==", "izDXy");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[56]] = E.lIlIIlIlIllIlII("2/0QrGbAkoYM6l+js2qhRnxBTY6Zfqbm", "UjEXN");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[57]] = E.lIlIIlIlIllIIll("3Tq6zx9akA4=", "WOZOj");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[58]] = E.lIlIIlIlIllIlII("jWM2r5KZ4ewvYmESaP3svAJ0djIciANtSdN9bARu6N8=", "NBiVt");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[59]] = E.lIlIIlIlIllIIlI("Nx5ZWScdAVUULlgdEBU7WAEdHCVW", "xuuyK");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[60]] = E.lIlIIlIlIllIIlI("DCkgCwY4aBUGES8rP0MQLyYgQw4vaCAMQz4pOAhDPid0Ggw/Zg==", "JHTcc");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[61]] = E.lIlIIlIlIllIIlI("OBJWHkUXGAVNBFAQGQIWBFcZDBAeAxgDAlAfGB5FFwUQGwAJFgMJSw==", "pwqme");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[62]] = E.lIlIIlIlIllIIlI("OysoW2UMIS9XMQciNFcoB24vHyQWbiwfIEI+KhgnDis1VywRYA==", "bNXwE");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[63]] = E.lIlIIlIlIllIIlI("Pj0GEkk=", "mHtwg");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[64]] = E.lIlIIlIlIllIIlI("OE87VhQUCSQfDRZINxhDEAUjGgYFSDkQQxYAOQUXURsmEwIaSQ==", "qhVvc");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[65]] = E.lIlIIlIlIllIIlI("MSsyWVQhaSxVBx08JFs=", "hNAut");
        E.lIIIllllIIlIl[E.lIIIllllIIllI[66]] = E.lIlIIlIlIllIlII("2slisWn3BU/9IzttrYutrw==", "JVBHc");
    }

    @Override
    public String Z() {
        return lIIIllllIIlIl[lIIIllllIIllI[52]];
    }

    private static void W() {
        d lllllllllllllllIIIIIIlllllIIlllI;
        Object lllllllllllllllIIIIIIlllllIIllll;
        int[] nArray = new int[lIIIllllIIllI[1]];
        nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[10];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIllllIIllI[10], lIIIllllIIllI[1], lIIIllllIIllI[46]);
            bA.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lIIIllllIIllI[1]];
        nArray2[E.lIIIllllIIllI[0]] = lIIIllllIIllI[4];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllIIIIIIlllllIIllll = new d(lIIIllllIIllI[4], lIIIllllIIllI[15], lIIIllllIIllI[47]);
            bA.add((d)lllllllllllllllIIIIIIlllllIIllll);
            "".length();
        }
        if (E.lIlIIlIlIlllIlI(Bank.contains(lllllllllllllllIIIIIIlllllIIllll = item -> item.getName().toLowerCase().contains(lIIIllllIIlIl[lIIIllllIIllI[53]])) ? 1 : 0)) {
            lllllllllllllllIIIIIIlllllIIlllI = new d(lIIIllllIIllI[48], lIIIllllIIllI[8], lIIIllllIIllI[49]);
            bA.add(lllllllllllllllIIIIIIlllllIIlllI);
            "".length();
        }
        int[] nArray3 = new int[lIIIllllIIllI[1]];
        nArray3[E.lIIIllllIIllI[0]] = lIIIllllIIllI[11];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllIIIIIIlllllIIlllI = new d(lIIIllllIIllI[11], lIIIllllIIllI[15], lIIIllllIIllI[50]);
            bA.add(lllllllllllllllIIIIIIlllllIIlllI);
            "".length();
        }
        int[] nArray4 = new int[lIIIllllIIllI[1]];
        nArray4[E.lIIIllllIIllI[0]] = lIIIllllIIllI[13];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllIIIIIIlllllIIlllI = new d(lIIIllllIIllI[13], lIIIllllIIllI[31], lIIIllllIIllI[50]);
            bA.add(lllllllllllllllIIIIIIlllllIIlllI);
            "".length();
        }
        int[] nArray5 = new int[lIIIllllIIllI[1]];
        nArray5[E.lIIIllllIIllI[0]] = lIIIllllIIllI[12];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllIIIIIIlllllIIlllI = new d(lIIIllllIIllI[12], lIIIllllIIllI[8], h.bv);
            bA.add(lllllllllllllllIIIIIIlllllIIlllI);
            "".length();
        }
    }

    private static boolean lIlIIlIlIlllIll(int n2) {
        return n2 < 0;
    }

    private static int lIlIIlIlIllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIlIlIlllllI(Object object) {
        return object == null;
    }

    private static void lIlIIlIlIllIllI() {
        lIIIllllIIllI = new int[75];
        E.lIIIllllIIllI[0] = (0x53 ^ 0x3B ^ (0x23 ^ 0x64)) & (0xD9 ^ 0xBC ^ (0x47 ^ 0xD) ^ -" ".length());
        E.lIIIllllIIllI[1] = " ".length();
        E.lIIIllllIIllI[2] = 0x5C ^ 0x1A;
        E.lIIIllllIIllI[3] = "  ".length();
        E.lIIIllllIIllI[4] = 0xFFFFAB7B & 0x55FF;
        E.lIIIllllIIllI[5] = "   ".length();
        E.lIIIllllIIllI[6] = 0xDC ^ 0x92 ^ (0x41 ^ 0x64);
        E.lIIIllllIIllI[7] = 0x9A ^ 0x9E;
        E.lIIIllllIIllI[8] = 0xCC ^ 0x87 ^ (0x3E ^ 0x70);
        E.lIIIllllIIllI[9] = 0xFFFFFBDE & 0x17A9;
        E.lIIIllllIIllI[10] = -(0xFFFFF4B7 & 0x5B4D) & (0xFFFFFECE & Short.MAX_VALUE);
        E.lIIIllllIIllI[11] = 0xFFFFDF79 & 0x3FCE;
        E.lIIIllllIIllI[12] = 0xFFFFFBD5 & 0x357B;
        E.lIIIllllIIllI[13] = -(27 + 23 - -22 + 73) & (0xFFFFDFD7 & 0x3FFF);
        E.lIIIllllIIllI[14] = 5 ^ 0x58 ^ (0xFF ^ 0xA4);
        E.lIIIllllIIllI[15] = 0x35 ^ 0x3F;
        E.lIIIllllIIllI[16] = -(0x3F ^ 0x39) & (0xFFFFDDFF & 0x2EAD);
        E.lIIIllllIIllI[17] = 0xFFFFDDF7 & 0x2E8C;
        E.lIIIllllIIllI[18] = 0xE8 ^ 0xA4 ^ (0x5E ^ 0x1A);
        E.lIIIllllIIllI[19] = 0x84 ^ 0xB5 ^ (0x43 ^ 0x79);
        E.lIIIllllIIllI[20] = 0x71 ^ 3 ^ (0xE9 ^ 0x9C);
        E.lIIIllllIIllI[21] = 0x9D ^ 0x94;
        E.lIIIllllIIllI[22] = 0x41 ^ 0x4D;
        E.lIIIllllIIllI[23] = 0xA8 ^ 0x84 ^ (0x20 ^ 1);
        E.lIIIllllIIllI[24] = 0x5F ^ 0x51;
        E.lIIIllllIIllI[25] = 0xCD ^ 0x8D ^ (0x7A ^ 0x35);
        E.lIIIllllIIllI[26] = 9 ^ 0x19;
        E.lIIIllllIIllI[27] = -(0xFFFFD9DD & 0x7FA7) & (0xFFFFFBEC & 0x5FBF);
        E.lIIIllllIIllI[28] = 136 + 8 - 53 + 49 ^ 4 + 156 - 76 + 73;
        E.lIIIllllIIllI[29] = 0x63 ^ 0x71;
        E.lIIIllllIIllI[30] = 0x2B ^ 0x7B ^ (0x82 ^ 0xC1);
        E.lIIIllllIIllI[31] = 0x74 ^ 0x60;
        E.lIIIllllIIllI[32] = 0xAC ^ 0xB9;
        E.lIIIllllIIllI[33] = 0x94 ^ 0x82;
        E.lIIIllllIIllI[34] = 141 + 38 - 96 + 67 ^ 98 + 34 - 30 + 27;
        E.lIIIllllIIllI[35] = 98 + 78 - 76 + 48 ^ 105 + 112 - 155 + 78;
        E.lIIIllllIIllI[36] = 0x3B ^ 0x22;
        E.lIIIllllIIllI[37] = 0x2C ^ 0x36;
        E.lIIIllllIIllI[38] = 0xAE ^ 0xB5;
        E.lIIIllllIIllI[39] = 0x5F ^ 0x43;
        E.lIIIllllIIllI[40] = 0x23 ^ 4 ^ (0x47 ^ 0x7D);
        E.lIIIllllIIllI[41] = 84 + 130 - 188 + 114 ^ 49 + 105 - 110 + 102;
        E.lIIIllllIIllI[42] = 0x35 ^ 0x75 ^ (0xCE ^ 0x91);
        E.lIIIllllIIllI[43] = 0xD0 ^ 0x89 ^ (0x24 ^ 0x5D);
        E.lIIIllllIIllI[44] = 0x91 ^ 0xB0;
        E.lIIIllllIIllI[45] = 0x6D ^ 0x47 ^ (0xA3 ^ 0xAB);
        E.lIIIllllIIllI[46] = 0xFFFFFE9E & 0x3F7D;
        E.lIIIllllIIllI[47] = -(0xFFFFE5B3 & 0x7A6E) & (0xFFFFF73D & 0x7FEF);
        E.lIIIllllIIllI[48] = 0xFFFFBECD & 0x6FFE;
        E.lIIIllllIIllI[49] = 0xFFFFEFF8 & 0x71AF;
        E.lIIIllllIIllI[50] = -(0xFFFFFC81 & 0x337F) & (0xFFFFF7FE & 0x3F6D);
        E.lIIIllllIIllI[51] = 88 + 57 - 79 + 173 ^ 46 + 100 - 59 + 52;
        E.lIIIllllIIllI[52] = 0xAB ^ 0x88;
        E.lIIIllllIIllI[53] = 0xBC ^ 0x98;
        E.lIIIllllIIllI[54] = 0xA7 ^ 0x82;
        E.lIIIllllIIllI[55] = 0xE4 ^ 0xC2;
        E.lIIIllllIIllI[56] = 148 + 110 - 243 + 169 ^ 99 + 7 - -1 + 52;
        E.lIIIllllIIllI[57] = 0x90 ^ 0xB8;
        E.lIIIllllIIllI[58] = 0xAA ^ 0x83;
        E.lIIIllllIIllI[59] = 0x64 ^ 0x4E;
        E.lIIIllllIIllI[60] = 0x50 ^ 0x7B;
        E.lIIIllllIIllI[61] = 0x6C ^ 0x36 ^ (0xB6 ^ 0xC0);
        E.lIIIllllIIllI[62] = 51 + 26 - -26 + 43 ^ 167 + 150 - 245 + 119;
        E.lIIIllllIIllI[63] = 1 + 144 - 8 + 15 ^ 70 + 100 - 105 + 117;
        E.lIIIllllIIllI[64] = 0x46 ^ 0x68 ^ " ".length();
        E.lIIIllllIIllI[65] = 50 + 135 - 168 + 130 ^ 3 + 27 - -128 + 5;
        E.lIIIllllIIllI[66] = 0xA2 ^ 0x93;
        E.lIIIllllIIllI[67] = 0xFFFFFFCB & 0xCBE;
        E.lIIIllllIIllI[68] = 0xFFFF8DEB & 0x7E5E;
        E.lIIIllllIIllI[69] = 0xFFFF8FFB & 0x7C6C;
        E.lIIIllllIIllI[70] = 0xFFFFAFBF & 0x5CF1;
        E.lIIIllllIIllI[71] = -(0xFFFFABFE & 0x5583) & (0xFFFFAFFF & 0x5DFB);
        E.lIIIllllIIllI[72] = 0xFFFF8DAF & 0x7E7E;
        E.lIIIllllIIllI[73] = 0xFFFFBFDF & 0x657E;
        E.lIIIllllIIllI[74] = 0x5B ^ 0x68 ^ " ".length();
    }

    public static void ck() {
        if (E.lIlIIlIlIlllIII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[0]];
            b.a(bA);
            if (E.lIlIIlIlIlllIIl(bA.size(), lIIIllllIIllI[1])) {
                System.out.println(lIIIllllIIlIl[lIIIllllIIllI[1]]);
                by = lIIIllllIIllI[0];
            }
        }
        if (E.lIlIIlIlIlllIlI(by ? 1 : 0)) {
            NPC lllllllllllllllIIIIIIlllllIlIIlI;
            BankLocation lllllllllllllllIIIIIIlllllIlIIll;
            if (E.lIlIIlIlIlllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && E.lIlIIlIlIlllIIl(Movement.getRunEnergy(), lIIIllllIIllI[2])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIllllIIlIl[lIIIllllIIllI[3]]);
                Time.sleepTicks((int)lIIIllllIIllI[1]);
                "".length();
            }
            if (E.lIlIIlIlIlllIll(E.lIlIIlIlIllIlll(e.v(), 70.0))) {
                int[] nArray = new int[lIIIllllIIllI[1]];
                nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIllllIIllI[1]];
                    nArray2[E.lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                    Inventory.getFirst((int[])nArray2).interact(lIIIllllIIlIl[lIIIllllIIllI[5]]);
                }
            }
            if (E.lIlIIlIlIlllIlI(Movement.isRunEnabled() ? 1 : 0) && E.lIlIIlIlIllllII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (E.lIlIIlIlIlllIlI(E.S() ? 1 : 0) && E.lIlIIlIlIlllIIl(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                lllllllllllllllIIIIIIlllllIlIIll = BankLocation.getNearest();
                if (E.lIlIIlIlIllllIl(lllllllllllllllIIIIIIlllllIlIIll) && E.lIlIIlIlIlllIlI(lllllllllllllllIIIIIIlllllIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[7]];
                    a.a(lllllllllllllllIIIIIIlllllIlIIll);
                    Time.sleepTicks((int)lIIIllllIIllI[3]);
                    "".length();
                }
                if (E.lIlIIlIlIllllIl(lllllllllllllllIIIIIIlllllIlIIll) && E.lIlIIlIlIlllIII(lllllllllllllllIIIIIIlllllIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[8]];
                    if (E.lIlIIlIlIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIIllI[9]);
                        "".length();
                    }
                    if (E.lIlIIlIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                        if (E.lIlIIlIlIllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIllllIIllI[7]);
                            "".length();
                        }
                        if (E.lIlIIlIlIllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIllllIIllI[3]);
                            "".length();
                        }
                        int[] nArray = new int[lIIIllllIIllI[8]];
                        nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[10];
                        nArray[E.lIIIllllIIllI[1]] = lIIIllllIIllI[11];
                        nArray[E.lIIIllllIIllI[3]] = lIIIllllIIllI[12];
                        nArray[E.lIIIllllIIllI[5]] = lIIIllllIIllI[13];
                        nArray[E.lIIIllllIIllI[7]] = lIIIllllIIllI[4];
                        if (E.lIlIIlIlIlllIlI(e.b(nArray) ? 1 : 0)) {
                            E.W();
                            System.out.println(lIIIllllIIlIl[lIIIllllIIllI[14]]);
                            by = lIIIllllIIllI[1];
                            return;
                        }
                        Bank.withdraw((int)lIIIllllIIllI[11], (int)lIIIllllIIllI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);
                        "".length();
                        Bank.withdraw((int)lIIIllllIIllI[13], (int)lIIIllllIIllI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);
                        "".length();
                        Bank.withdraw((int)lIIIllllIIllI[10], (int)lIIIllllIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);
                        "".length();
                        a.b(f.ba, lIIIllllIIllI[1]);
                        a.a(lIIIllllIIllI[4], lIIIllllIIllI[15]);
                        a.b(f.bk, lIIIllllIIllI[1]);
                    }
                }
            }
            if (E.lIlIIlIlIlllIII(E.S() ? 1 : 0) && E.lIlIIlIlIlllIIl(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                lllllllllllllllIIIIIIlllllIlIIll = new WorldArea(lIIIllllIIllI[16], lIIIllllIIllI[17], lIIIllllIIllI[18], lIIIllllIIllI[19], lIIIllllIIllI[0]);
                String[] stringArray = new String[lIIIllllIIllI[1]];
                stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[20]];
                lllllllllllllllIIIIIIlllllIlIIlI = NPCs.getNearest((String[])stringArray);
                if (E.lIlIIlIlIlllllI(lllllllllllllllIIIIIIlllllIlIIlI) && E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hg), lIIIllllIIllI[5]) && E.lIlIIlIlIlllIlI(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[18]];
                    if (E.lIlIIlIlIlllIIl(bY, lIIIllllIIllI[1])) {
                        e.w();
                        bY += lIIIllllIIllI[1];
                    }
                    Movement.walkTo((WorldPoint)hg);
                    "".length();
                    Time.sleepTicks((int)lIIIllllIIllI[1]);
                    "".length();
                }
                if (E.lIlIIlIlIllllIl(lllllllllllllllIIIIIIlllllIlIIlI)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[21]];
                    g.a(lIIIllllIIlIl[lIIIllllIIllI[15]], hf, lIIIllllIIllI[1]);
                }
            }
            if (E.lIlIIlIllIIIIII(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                if (E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hh), lIIIllllIIllI[14])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[19]];
                    Movement.walkTo((WorldPoint)hh);
                    "".length();
                    Time.sleepTicks((int)lIIIllllIIllI[1]);
                    "".length();
                }
                if (E.lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hh), lIIIllllIIllI[14])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[22]];
                    String[] stringArray = new String[lIIIllllIIllI[1]];
                    stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[23]];
                    lllllllllllllllIIIIIIlllllIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (E.lIlIIlIlIllllIl(lllllllllllllllIIIIIIlllllIlIIll)) {
                        String[] stringArray2 = new String[lIIIllllIIllI[1]];
                        stringArray2[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[24]];
                        if (E.lIlIIlIlIlllIII(lllllllllllllllIIIIIIlllllIlIIll.hasAction(stringArray2) ? 1 : 0)) {
                            lllllllllllllllIIIIIIlllllIlIIll.interact(lIIIllllIIlIl[lIIIllllIIllI[25]]);
                            Time.sleepTicks((int)lIIIllllIIllI[8]);
                            "".length();
                        }
                    }
                    g.a(lIIIllllIIlIl[lIIIllllIIllI[26]], hf);
                }
            }
            if (E.lIlIIlIllIIIIII(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[3])) {
                if (E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    int[] nArray = new int[lIIIllllIIllI[1]];
                    nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                    if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIIllllIIllI[1]];
                        nArray3[E.lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                        Inventory.getFirst((int[])nArray3).interact(lIIIllllIIlIl[lIIIllllIIllI[28]]);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[29]];
                    Movement.walkTo((WorldPoint)hi);
                    "".length();
                    Time.sleepTicks((int)lIIIllllIIllI[1]);
                    "".length();
                }
                if (E.lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[30]];
                    String[] stringArray = new String[lIIIllllIIllI[1]];
                    stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[31]];
                    lllllllllllllllIIIIIIlllllIlIIll = NPCs.getNearest((String[])stringArray);
                    if (E.lIlIIlIlIllllIl(lllllllllllllllIIIIIIlllllIlIIll)) {
                        g.a(lIIIllllIIlIl[lIIIllllIIllI[32]], hf);
                    }
                    if (E.lIlIIlIlIlllllI(lllllllllllllllIIIIIIlllllIlIIll)) {
                        String[] stringArray3 = new String[lIIIllllIIllI[1]];
                        stringArray3[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lIIIllllIIlIl[lIIIllllIIllI[34]]);
                        Time.sleepTicks((int)lIIIllllIIllI[3]);
                        "".length();
                    }
                }
            }
            if (E.lIlIIlIllIIIIII(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[5])) {
                co = lIIIllllIIllI[0];
                if (E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hj), lIIIllllIIllI[5])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[35]];
                    Movement.walkTo((WorldPoint)hj);
                    "".length();
                    Time.sleepTicks((int)lIIIllllIIllI[1]);
                    "".length();
                }
                if (E.lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIIllllIIllI[5])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[36]];
                    String[] stringArray = new String[lIIIllllIIllI[1]];
                    stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[37]];
                    lllllllllllllllIIIIIIlllllIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (E.lIlIIlIlIllllIl(lllllllllllllllIIIIIIlllllIlIIll)) {
                        lllllllllllllllIIIIIIlllllIlIIll.interact(lIIIllllIIlIl[lIIIllllIIllI[38]]);
                    }
                }
            }
            if (E.lIlIIlIllIIIIII(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[7])) {
                if (E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    int[] nArray = new int[lIIIllllIIllI[1]];
                    nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                    if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lIIIllllIIllI[1]];
                        nArray4[E.lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                        Inventory.getFirst((int[])nArray4).interact(lIIIllllIIlIl[lIIIllllIIllI[39]]);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[40]];
                    Movement.walkTo((WorldPoint)hi);
                    "".length();
                    Time.sleepTicks((int)lIIIllllIIllI[1]);
                    "".length();
                }
                if (E.lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[41]];
                    String[] stringArray = new String[lIIIllllIIllI[1]];
                    stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[42]];
                    lllllllllllllllIIIIIIlllllIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (E.lIlIIlIlIllllIl(lllllllllllllllIIIIIIlllllIlIIll)) {
                        String[] stringArray4 = new String[lIIIllllIIllI[1]];
                        stringArray4[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[43]];
                        if (E.lIlIIlIlIlllIII(lllllllllllllllIIIIIIlllllIlIIll.hasAction(stringArray4) ? 1 : 0)) {
                            lllllllllllllllIIIIIIlllllIlIIll.interact(lIIIllllIIlIl[lIIIllllIIllI[44]]);
                            Time.sleepTicks((int)lIIIllllIIllI[3]);
                            "".length();
                        }
                        String[] stringArray5 = new String[lIIIllllIIllI[1]];
                        stringArray5[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[45]];
                        lllllllllllllllIIIIIIlllllIlIIlI = Inventory.getFirst((String[])stringArray5);
                        if (E.lIlIIlIlIllllIl(lllllllllllllllIIIIIIlllllIlIIlI)) {
                            if (E.lIlIIlIlIlllIIl(co, lIIIllllIIllI[1])) {
                                P.lr += lIIIllllIIllI[1];
                                P.d(AccBuilderRat.m);
                                co += lIIIllllIIllI[1];
                                P.lr = lIIIllllIIllI[0];
                                cp = lIIIllllIIllI[0];
                            }
                            lllllllllllllllIIIIIIlllllIlIIlI.useOn((TileObject)lllllllllllllllIIIIIIlllllIlIIll);
                            Time.sleepTicks((int)lIIIllllIIllI[5]);
                            "".length();
                        }
                    }
                }
                g.a(hf);
            }
            g.a(new String[lIIIllllIIllI[0]]);
        }
    }

    @Override
    public int Y() {
        try {
            E.ck();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-" ".length() > 0) {
            return (0x54 ^ 0x78) & ~(0x35 ^ 0x19);
        }
        return lIIIllllIIllI[51];
    }

    private static boolean lIlIIlIlIlllIlI(int n2) {
        return n2 == 0;
    }
}

