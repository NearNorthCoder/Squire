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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
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

public class K
implements S {
    private static final /* synthetic */ WorldPoint hV;
    private static final /* synthetic */ WorldPoint hU;
    private static final /* synthetic */ WorldPoint hX;
    static /* synthetic */ int ck;
    private static /* synthetic */ String[] lllllllllI;
    private static /* synthetic */ int[] llllllllll;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint hW;
    static /* synthetic */ int bS;
    public static final /* synthetic */ String[] hT;
    public static /* synthetic */ List<d> bu;

    @Override
    public int T() {
        try {
            K.cY();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x22 ^ 0x26) <= "   ".length()) {
            return (0x3C ^ 0x5F) & ~(0x4A ^ 0x29);
        }
        return llllllllll[51];
    }

    private static boolean llIllIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[llllllllll[1]];
        nArray[K.llllllllll[0]] = llllllllll[11];
        if (K.llIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && (!K.llIllIIlIlIlI(Inventory.contains((int[])f.aQ) ? 1 : 0) || K.llIllIIlIlIII(Equipment.contains((int[])f.aQ) ? 1 : 0)) && K.llIllIIlIlIII(Inventory.contains((int[])f.aU) ? 1 : 0)) {
            int[] nArray2 = new int[llllllllll[1]];
            nArray2[K.llllllllll[0]] = llllllllll[13];
            if (K.llIllIIlIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llllllllll[1]];
                nArray3[K.llllllllll[0]] = llllllllll[4];
                if (K.llIllIIlIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = llllllllll[1];
                    "".length();
                    if (" ".length() >= 0) return n2 != 0;
                    return ((175 + 179 - 295 + 163 ^ 38 + 9 - 0 + 85) & (87 + 169 - 246 + 192 ^ 135 + 86 - 78 + 1 ^ -" ".length())) != 0;
                }
            }
        }
        n2 = llllllllll[0];
        return n2 != 0;
    }

    private static void ae() {
        d lllllllllllllllllIlIIIIlIlIlIIIl;
        Object lllllllllllllllllIlIIIIlIlIlIIlI;
        int[] nArray = new int[llllllllll[1]];
        nArray[K.llllllllll[0]] = llllllllll[10];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llllllllll[10], llllllllll[1], llllllllll[46]);
            bu.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llllllllll[1]];
        nArray2[K.llllllllll[0]] = llllllllll[4];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIlIIIIlIlIlIIlI = new d(llllllllll[4], llllllllll[15], llllllllll[47]);
            bu.add((d)lllllllllllllllllIlIIIIlIlIlIIlI);
            "".length();
        }
        if (K.llIllIIlIlIlI(Bank.contains(lllllllllllllllllIlIIIIlIlIlIIlI = item -> item.getName().toLowerCase().contains(lllllllllI[llllllllll[53]])) ? 1 : 0)) {
            lllllllllllllllllIlIIIIlIlIlIIIl = new d(llllllllll[48], llllllllll[8], llllllllll[49]);
            bu.add(lllllllllllllllllIlIIIIlIlIlIIIl);
            "".length();
        }
        int[] nArray3 = new int[llllllllll[1]];
        nArray3[K.llllllllll[0]] = llllllllll[11];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIlIIIIlIlIlIIIl = new d(llllllllll[11], llllllllll[15], llllllllll[50]);
            bu.add(lllllllllllllllllIlIIIIlIlIlIIIl);
            "".length();
        }
        int[] nArray4 = new int[llllllllll[1]];
        nArray4[K.llllllllll[0]] = llllllllll[13];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIlIIIIlIlIlIIIl = new d(llllllllll[13], llllllllll[31], llllllllll[50]);
            bu.add(lllllllllllllllllIlIIIIlIlIlIIIl);
            "".length();
        }
        int[] nArray5 = new int[llllllllll[1]];
        nArray5[K.llllllllll[0]] = llllllllll[12];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllIlIIIIlIlIlIIIl = new d(llllllllll[12], llllllllll[8], i.bp);
            bu.add(lllllllllllllllllIlIIIIlIlIlIIIl);
            "".length();
        }
    }

    private static void llIllIIlIIIll() {
        lllllllllI = new String[llllllllll[74]];
        K.lllllllllI[K.llllllllll[0]] = K.llIllIIlIIIII("/frgTpq0jWcJtqYQ1Bikqw==", "ZyhJF");
        K.lllllllllI[K.llllllllll[1]] = K.llIllIIlIIIIl("MignIB0cJC1pDAE4ICcJVCg9LAMHbWk6GR01KiEHGiZpKw8XKmk9AVQwPCwdAA==", "tAIIn");
        K.lllllllllI[K.llllllllll[3]] = K.llIllIIlIIIIl("Mys7CxM=", "wYRex");
        K.lllllllllI[K.llllllllll[5]] = K.llIllIIlIIIlI("jRRmvXzWDCI=", "cufKa");
        K.lllllllllI[K.llllllllll[7]] = K.llIllIIlIIIIl("DDs1Yw0teiEiFyk=", "BZCCy");
        K.lllllllllI[K.llllllllll[8]] = K.llIllIIlIIIIl("GAQ2JgA5Cz9iDjELMysCNw==", "PeXBl");
        K.lllllllllI[K.llllllllll[14]] = K.llIllIIlIIIII("IiELxQSbMN9c4k2G3UQfPS+Q6zOuCU+L4qClSbGD5sZR+AQYTyc3a4CniueMAr9CuBXSiE5qVCg=", "pKtTT");
        K.lllllllllI[K.llllllllll[20]] = K.llIllIIlIIIlI("5/Kf2gNPv31xoW/x2w2sKg==", "RsAHf");
        K.lllllllllI[K.llllllllll[18]] = K.llIllIIlIIIIl("Nw0RZC4WTBQwOwsY", "ylgDZ");
        K.lllllllllI[K.llllllllll[21]] = K.llIllIIlIIIlI("nyM3yqN6vvDxrG2vJCK8TA==", "ujTfs");
        K.lllllllllI[K.llllllllll[15]] = K.llIllIIlIIIIl("DxQTHSY7VSYQMSwWDA==", "IuguC");
        K.lllllllllI[K.llllllllll[19]] = K.llIllIIlIIIlI("8wxgzt6h8BKq9D9Amuvj9vitL1f5yPXx", "SPWcr");
        K.lllllllllI[K.llllllllll[22]] = K.llIllIIlIIIIl("HCMWNSo0LhY5NjJtDCA7", "UMbPX");
        K.lllllllllI[K.llllllllll[23]] = K.llIllIIlIIIII("vBrGkQhqX7k=", "UWDIB");
        K.lllllllllI[K.llllllllll[24]] = K.llIllIIlIIIII("NPpo6Cwk05A=", "aWbGK");
        K.lllllllllI[K.llllllllll[25]] = K.llIllIIlIIIII("YU08rqTNQRU=", "BQhiG");
        K.lllllllllI[K.llllllllll[26]] = K.llIllIIlIIIIl("HAofCiEoSz4QLDQOEg==", "ZkkbD");
        K.lllllllllI[K.llllllllll[28]] = K.llIllIIlIIIIl("DwIXFg==", "XgvdZ");
        K.lllllllllI[K.llllllllll[29]] = K.llIllIIlIIIlI("rHHLSqjZWd/EDFAQJcBLOA==", "HVXTX");
        K.lllllllllI[K.llllllllll[30]] = K.llIllIIlIIIII("NRuGQ3OIlfKnITC4L2hWqw==", "BNfSP");
        K.lllllllllI[K.llllllllll[31]] = K.llIllIIlIIIIl("GRwqIA8uCip0BCMWKiA=", "KyYTc");
        K.lllllllllI[K.llllllllll[32]] = K.llIllIIlIIIIl("NSo8Jj8CPDxyNA8gPCY=", "gOORS");
        K.lllllllllI[K.llllllllll[33]] = K.llIllIIlIIIIl("MxgIITwe", "pwnGU");
        K.lllllllllI[K.llllllllll[34]] = K.llIllIIlIIIlI("VWutPYbJy/E=", "jxrMp");
        K.lllllllllI[K.llllllllll[35]] = K.llIllIIlIIIlI("t338YkRYkAw6tltD+2RpRA==", "WMWzT");
        K.lllllllllI[K.llllllllll[36]] = K.llIllIIlIIIII("5szYKETJvq1F2qZf4WmpXA==", "WugNq");
        K.lllllllllI[K.llllllllll[37]] = K.llIllIIlIIIlI("ZlVrB1UxjbQ=", "vdRyS");
        K.lllllllllI[K.llllllllll[38]] = K.llIllIIlIIIIl("BBwgJAY/", "WyAVe");
        K.lllllllllI[K.llllllllll[39]] = K.llIllIIlIIIIl("Jz8NPA==", "pZlNu");
        K.lllllllllI[K.llllllllll[40]] = K.llIllIIlIIIII("2MyKDQanbY6Bv15rDJHkhg==", "DvMeW");
        K.lllllllllI[K.llllllllll[41]] = K.llIllIIlIIIlI("8PK3A4U2j7cfuoYffzoDJw==", "dXdeN");
        K.lllllllllI[K.llllllllll[42]] = K.llIllIIlIIIII("1TiPXgKNwxU=", "ScGAV");
        K.lllllllllI[K.llllllllll[43]] = K.llIllIIlIIIlI("THjD5xxkXmM=", "RGldy");
        K.lllllllllI[K.llllllllll[44]] = K.llIllIIlIIIIl("NjgOIg==", "yHkLm");
        K.lllllllllI[K.llllllllll[45]] = K.llIllIIlIIIlI("Cv5IQ0WgYJ9lAlFHsFkD6Q==", "pifei");
        K.lllllllllI[K.llllllllll[52]] = K.llIllIIlIIIIl("Iy07IwsUOzt3ABknOyNHAD0tJBM=", "qHHWg");
        K.lllllllllI[K.llllllllll[53]] = K.llIllIIlIIIlI("vZJI5cah87pXHrjV/OnCbVsgPscRV0Av", "jdQRN");
        K.lllllllllI[K.llllllllll[54]] = K.llIllIIlIIIIl("Kwx7ZRpDCncwI0QBODdzBQl3JDcSAjkxJhYCeQ==", "dgWES");
        K.lllllllllI[K.llllllllll[55]] = K.llIllIIlIIIlI("sYG3intiioAK67QVxOyegHqYK2YLMPV+FPPVfJ3spWwd034P63wfEQ==", "onPXY");
        K.lllllllllI[K.llllllllll[56]] = K.llIllIIlIIIIl("FSIVEDQ2bQkSMDw+Rw46LT9HHzA0PUY=", "XMgwU");
        K.lllllllllI[K.llllllllll[57]] = K.llIllIIlIIIII("tgOuE1dmSok=", "UqEYr");
        K.lllllllllI[K.llllllllll[58]] = K.llIllIIlIIIlI("pcgZItDY4nhdXREHUtZ2/BtjlXza1N3uXo7VQdSNQkc=", "innkG");
        K.lllllllllI[K.llllllllll[59]] = K.llIllIIlIIIII("kLTu5uwvoMjwBfu8nSf550d+XvXQSxpf", "ntzfk");
        K.lllllllllI[K.llllllllll[60]] = K.llIllIIlIIIII("eRjUYNrloduOEGYUzcqIileymiTjKNpPngdphBc0u69/CEP3L2BmNw==", "BYTnD");
        K.lllllllllI[K.llllllllll[61]] = K.llIllIIlIIIIl("Gh9jGWE1FTBKIHIdLAUyJlosCzQ8Di0EJnISLRlhNQglHCQrGzYObw==", "RzDjA");
        K.lllllllllI[K.llllllllll[62]] = K.llIllIIlIIIIl("Hw00VlooBzNaDiMEKFoXI0gzEhsySDASH2YYNhUYKg0pWhM1Rg==", "FhDzz");
        K.lllllllllI[K.llllllllll[63]] = K.llIllIIlIIIlI("LgWSympXBsk=", "VTBrN");
        K.lllllllllI[K.llllllllll[64]] = K.llIllIIlIIIII("UxiDIoio/QQv10WfOZjTus3knyneaJdS2ObRieR2lzZGiSu+g6qrPQ==", "teYhX");
        K.lllllllllI[K.llllllllll[65]] = K.llIllIIlIIIlI("lwTD42ikIDi2vZ1fBW4zOw==", "acEee");
        K.lllllllllI[K.llllllllll[66]] = K.llIllIIlIIIII("jP1k1JgB/RQBMJSNIabz9Q==", "AOggx");
    }

    private static int llIllIIlIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIllIIlIllIl(Object object) {
        return object != null;
    }

    private static String llIllIIlIIIIl(String lllllllllllllllllIlIIIIlIIllIIlI, String lllllllllllllllllIlIIIIlIIllIIIl) {
        lllllllllllllllllIlIIIIlIIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIIlIIllIlIl = new StringBuilder();
        char[] lllllllllllllllllIlIIIIlIIllIlII = lllllllllllllllllIlIIIIlIIllIIIl.toCharArray();
        int lllllllllllllllllIlIIIIlIIllIIll = llllllllll[0];
        char[] lllllllllllllllllIlIIIIlIIlIllIl = lllllllllllllllllIlIIIIlIIllIIlI.toCharArray();
        int lllllllllllllllllIlIIIIlIIlIllII = lllllllllllllllllIlIIIIlIIlIllIl.length;
        int lllllllllllllllllIlIIIIlIIlIlIll = llllllllll[0];
        while (K.llIllIIlIlIIl(lllllllllllllllllIlIIIIlIIlIlIll, lllllllllllllllllIlIIIIlIIlIllII)) {
            char lllllllllllllllllIlIIIIlIIlllIII = lllllllllllllllllIlIIIIlIIlIllIl[lllllllllllllllllIlIIIIlIIlIlIll];
            lllllllllllllllllIlIIIIlIIllIlIl.append((char)(lllllllllllllllllIlIIIIlIIlllIII ^ lllllllllllllllllIlIIIIlIIllIlII[lllllllllllllllllIlIIIIlIIllIIll % lllllllllllllllllIlIIIIlIIllIlII.length]));
            "".length();
            ++lllllllllllllllllIlIIIIlIIllIIll;
            ++lllllllllllllllllIlIIIIlIIlIlIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIIIlIIllIlIl);
    }

    private static boolean llIllIIlIllII(int n2) {
        return n2 > 0;
    }

    private static boolean llIllIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static String llIllIIlIIIII(String lllllllllllllllllIlIIIIlIIlIIIII, String lllllllllllllllllIlIIIIlIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIlIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llllllllll[18]), "DES");
            Cipher lllllllllllllllllIlIIIIlIIlIIlII = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIIlIIlIIlII.init(llllllllll[3], lllllllllllllllllIlIIIIlIIlIIlIl);
            return new String(lllllllllllllllllIlIIIIlIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIlIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIlIIlIIIll) {
            lllllllllllllllllIlIIIIlIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIlIlllI(Object object) {
        return object == null;
    }

    private static void llIllIIlIIllI() {
        llllllllll = new int[75];
        K.llllllllll[0] = "  ".length() & ~"  ".length();
        K.llllllllll[1] = " ".length();
        K.llllllllll[2] = 2 ^ 0x44;
        K.llllllllll[3] = "  ".length();
        K.llllllllll[4] = -(0xFFFFFE75 & 0x3F8F) & (0xFFFFBFFF & 0x7F7F);
        K.llllllllll[5] = "   ".length();
        K.llllllllll[6] = 0xE3 ^ 0x88;
        K.llllllllll[7] = 0x55 ^ 0x51;
        K.llllllllll[8] = 0x19 ^ 0x33 ^ (0x50 ^ 0x7F);
        K.llllllllll[9] = 0xFFFF97EF & 0x7B98;
        K.llllllllll[10] = 0xFFFFFFEF & 0x2EDA;
        K.llllllllll[11] = 0xFFFFFFFA & 0x1F4D;
        K.llllllllll[12] = -(0xFFFFE6E7 & 0x5B9D) & (0xFFFFFBDD & 0x77F7);
        K.llllllllll[13] = -(0xFFFFEBB9 & 0x547F) & (0xFFFFFFFF & 0x5F7F);
        K.llllllllll[14] = 126 + 73 - 59 + 8 ^ 72 + 29 - 97 + 142;
        K.llllllllll[15] = 0x3C ^ 1 ^ (0x94 ^ 0xA3);
        K.llllllllll[16] = -(0xFFFF9FD7 & 0x722B) & (0xFFFF9FEA & 0x7EBF);
        K.llllllllll[17] = -(0xFFFFD5DF & 0x6A31) & (0xFFFFFEF4 & 0x4D9F);
        K.llllllllll[18] = 0x2F ^ 0x68 ^ (0x6C ^ 0x23);
        K.llllllllll[19] = 0x61 ^ 0x3A ^ (0x46 ^ 0x16);
        K.llllllllll[20] = 0x3F ^ 0x54 ^ (0xD2 ^ 0xBE);
        K.llllllllll[21] = 178 + 168 - 204 + 63 ^ 32 + 35 - 62 + 191;
        K.llllllllll[22] = 0xA1 ^ 0xAD;
        K.llllllllll[23] = 0x81 ^ 0x8C;
        K.llllllllll[24] = 0x2A ^ 0x7C ^ (0x79 ^ 0x21);
        K.llllllllll[25] = 0x33 ^ 0x3C;
        K.llllllllll[26] = 66 + 147 - 120 + 65 ^ 16 + 81 - -40 + 5;
        K.llllllllll[27] = -(0xFFFFF79B & 0x59F7) & (0xFFFFFBFA & 0x57BF);
        K.llllllllll[28] = 97 + 142 - 60 + 5 ^ 156 + 167 - 270 + 116;
        K.llllllllll[29] = 0x19 ^ 0x2D ^ (0x9B ^ 0xBD);
        K.llllllllll[30] = 0x1C ^ 0x1B ^ (0x94 ^ 0x80);
        K.llllllllll[31] = 0x7C ^ 0x68;
        K.llllllllll[32] = 125 + 13 - -36 + 15 ^ 105 + 129 - 101 + 35;
        K.llllllllll[33] = 0x2F ^ 0x39;
        K.llllllllll[34] = 100 + 25 - -8 + 49 ^ 67 + 100 - 12 + 6;
        K.llllllllll[35] = 6 ^ 0x30 ^ (0x20 ^ 0xE);
        K.llllllllll[36] = 0xB1 ^ 0xA6 ^ (0x6C ^ 0x62);
        K.llllllllll[37] = 26 + 87 - 81 + 104 ^ 144 + 124 - 178 + 56;
        K.llllllllll[38] = 0xBD ^ 0x99 ^ (0x34 ^ 0xB);
        K.llllllllll[39] = 0x44 ^ 0x58;
        K.llllllllll[40] = 0x6A ^ 0x77;
        K.llllllllll[41] = 0xE9 ^ 0xC5 ^ (0xBC ^ 0x8E);
        K.llllllllll[42] = 0x5C ^ 0x43;
        K.llllllllll[43] = 0x31 ^ 0x45 ^ (0x1E ^ 0x4A);
        K.llllllllll[44] = 0x44 ^ 0x65;
        K.llllllllll[45] = 0x51 ^ 0x72 ^ " ".length();
        K.llllllllll[46] = 0xFFFFFE5F & 0x3FBC;
        K.llllllllll[47] = 0xFFFFDF8E & 0x377D;
        K.llllllllll[48] = -(0xFFFFF877 & 0x579A) & (0xFFFFFFFD & 0x7EDF);
        K.llllllllll[49] = 0xFFFFF5EA & 0x6BBD;
        K.llllllllll[50] = 0xFFFF9F7D & 0x67EE;
        K.llllllllll[51] = (0x7D ^ 0x2E) & ~(0x63 ^ 0x30) ^ (0x56 ^ 0x32);
        K.llllllllll[52] = 58 + 61 - -5 + 27 ^ 63 + 160 - 71 + 28;
        K.llllllllll[53] = 0xB9 ^ 0x9D;
        K.llllllllll[54] = 0x70 ^ 0x55;
        K.llllllllll[55] = 0x44 ^ 0x56 ^ (0x36 ^ 2);
        K.llllllllll[56] = 135 + 48 - 147 + 119 ^ 36 + 127 - 1 + 26;
        K.llllllllll[57] = 0xB7 ^ 0x9F;
        K.llllllllll[58] = 0xA9 ^ 0xA1 ^ (0x9A ^ 0xBB);
        K.llllllllll[59] = 6 ^ 0x2C;
        K.llllllllll[60] = 0x70 ^ 0x1D ^ (0xC0 ^ 0x86);
        K.llllllllll[61] = 1 ^ 0x2D;
        K.llllllllll[62] = 0x69 ^ 0x44;
        K.llllllllll[63] = 0x64 ^ 0x4A;
        K.llllllllll[64] = 0x4B ^ 0x75 ^ (8 ^ 0x19);
        K.llllllllll[65] = 0xE2 ^ 0xB8 ^ (0x6D ^ 7);
        K.llllllllll[66] = 0xA0 ^ 0xA8 ^ (0x81 ^ 0xB8);
        K.llllllllll[67] = 0xFFFFFCFB & 0xF8E;
        K.llllllllll[68] = -(0xFFFFDFDB & 0x71B6) & (0xFFFFFFFF & 0x5DDB);
        K.llllllllll[69] = -(0xFFFFEDA7 & 0x52DF) & (0xFFFFEEEE & 0x5DFF);
        K.llllllllll[70] = -(0xFFFFF7EB & 0x5B1F) & (0xFFFFFFFF & 0x5FBB);
        K.llllllllll[71] = 0xFFFFDCFA & 0x2F7F;
        K.llllllllll[72] = 0xFFFFAC6F & 0x5FBE;
        K.llllllllll[73] = 0xFFFFF55F & 0x2FFE;
        K.llllllllll[74] = 0xAB ^ 0x99;
    }

    private static boolean llIllIIlIlIll(int n2) {
        return n2 < 0;
    }

    static {
        K.llIllIIlIIllI();
        K.llIllIIlIIIll();
        String[] stringArray = new String[llllllllll[23]];
        stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[54]];
        stringArray[K.llllllllll[1]] = lllllllllI[llllllllll[55]];
        stringArray[K.llllllllll[3]] = lllllllllI[llllllllll[56]];
        stringArray[K.llllllllll[5]] = lllllllllI[llllllllll[57]];
        stringArray[K.llllllllll[7]] = lllllllllI[llllllllll[58]];
        stringArray[K.llllllllll[8]] = lllllllllI[llllllllll[59]];
        stringArray[K.llllllllll[14]] = lllllllllI[llllllllll[60]];
        stringArray[K.llllllllll[20]] = lllllllllI[llllllllll[61]];
        stringArray[K.llllllllll[18]] = lllllllllI[llllllllll[62]];
        stringArray[K.llllllllll[21]] = lllllllllI[llllllllll[63]];
        stringArray[K.llllllllll[15]] = lllllllllI[llllllllll[64]];
        stringArray[K.llllllllll[19]] = lllllllllI[llllllllll[65]];
        stringArray[K.llllllllll[22]] = lllllllllI[llllllllll[66]];
        hT = stringArray;
        hU = new WorldPoint(llllllllll[16], llllllllll[67], llllllllll[0]);
        hV = new WorldPoint(llllllllll[68], llllllllll[69], llllllllll[0]);
        hW = new WorldPoint(llllllllll[70], llllllllll[71], llllllllll[0]);
        hX = new WorldPoint(llllllllll[72], llllllllll[73], llllllllll[0]);
        bu = new ArrayList<d>();
        bS = llllllllll[0];
    }

    @Override
    public String U() {
        return lllllllllI[llllllllll[52]];
    }

    private static boolean llIllIIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    public static void cY() {
        if (K.llIllIIlIlIII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllllllI[llllllllll[0]];
            b.a(bu);
            if (K.llIllIIlIlIIl(bu.size(), llllllllll[1])) {
                System.out.println(lllllllllI[llllllllll[1]]);
                bs = llllllllll[0];
            }
        }
        if (K.llIllIIlIlIlI(bs ? 1 : 0)) {
            NPC lllllllllllllllllIlIIIIlIlIlIlIl;
            BankLocation lllllllllllllllllIlIIIIlIlIlIllI;
            if (K.llIllIIlIlIII(Inventory.contains((int[])f.aU) ? 1 : 0) && K.llIllIIlIlIIl(Movement.getRunEnergy(), llllllllll[2])) {
                Inventory.getFirst((int[])f.aU).interact(lllllllllI[llllllllll[3]]);
                Time.sleepTicks((int)llllllllll[1]);
                "".length();
            }
            if (K.llIllIIlIlIll(K.llIllIIlIIlll(e.u(), 70.0))) {
                int[] nArray = new int[llllllllll[1]];
                nArray[K.llllllllll[0]] = llllllllll[4];
                if (K.llIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllllllll[1]];
                    nArray2[K.llllllllll[0]] = llllllllll[4];
                    Inventory.getFirst((int[])nArray2).interact(lllllllllI[llllllllll[5]]);
                }
            }
            if (K.llIllIIlIlIlI(Movement.isRunEnabled() ? 1 : 0) && K.llIllIIlIllII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (K.llIllIIlIlIlI(K.aa() ? 1 : 0) && K.llIllIIlIlIIl(e.j(llllllllll[6]), llllllllll[1])) {
                lllllllllllllllllIlIIIIlIlIlIllI = BankLocation.getNearest();
                if (K.llIllIIlIllIl(lllllllllllllllllIlIIIIlIlIlIllI) && K.llIllIIlIlIlI(lllllllllllllllllIlIIIIlIlIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[7]];
                    a.a(lllllllllllllllllIlIIIIlIlIlIllI);
                    Time.sleepTicks((int)llllllllll[3]);
                    "".length();
                }
                if (K.llIllIIlIllIl(lllllllllllllllllIlIIIIlIlIlIllI) && K.llIllIIlIlIII(lllllllllllllllllIlIIIIlIlIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[8]];
                    if (K.llIllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllllll[9]);
                        "".length();
                    }
                    if (K.llIllIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (K.llIllIIlIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllllllll[7]);
                            "".length();
                        }
                        if (K.llIllIIlIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllllllll[3]);
                            "".length();
                        }
                        int[] nArray = new int[llllllllll[8]];
                        nArray[K.llllllllll[0]] = llllllllll[10];
                        nArray[K.llllllllll[1]] = llllllllll[11];
                        nArray[K.llllllllll[3]] = llllllllll[12];
                        nArray[K.llllllllll[5]] = llllllllll[13];
                        nArray[K.llllllllll[7]] = llllllllll[4];
                        if (K.llIllIIlIlIlI(e.b(nArray) ? 1 : 0)) {
                            K.ae();
                            System.out.println(lllllllllI[llllllllll[14]]);
                            bs = llllllllll[1];
                            return;
                        }
                        Bank.withdraw((int)llllllllll[11], (int)llllllllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllllll[1]);
                        "".length();
                        Bank.withdraw((int)llllllllll[13], (int)llllllllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllllll[1]);
                        "".length();
                        Bank.withdraw((int)llllllllll[10], (int)llllllllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllllll[1]);
                        "".length();
                        a.b(f.aU, llllllllll[1]);
                        a.a(llllllllll[4], llllllllll[15]);
                        a.b(f.be, llllllllll[1]);
                    }
                }
            }
            if (K.llIllIIlIlIII(K.aa() ? 1 : 0) && K.llIllIIlIlIIl(e.j(llllllllll[6]), llllllllll[1])) {
                lllllllllllllllllIlIIIIlIlIlIllI = new WorldArea(llllllllll[16], llllllllll[17], llllllllll[18], llllllllll[19], llllllllll[0]);
                String[] stringArray = new String[llllllllll[1]];
                stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[20]];
                lllllllllllllllllIlIIIIlIlIlIlIl = NPCs.getNearest((String[])stringArray);
                if (K.llIllIIlIlllI(lllllllllllllllllIlIIIIlIlIlIlIl) && K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hU), llllllllll[5]) && K.llIllIIlIlIlI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[18]];
                    if (K.llIllIIlIlIIl(bS, llllllllll[1])) {
                        e.v();
                        bS += llllllllll[1];
                    }
                    Movement.walkTo((WorldPoint)hU);
                    "".length();
                    Time.sleepTicks((int)llllllllll[1]);
                    "".length();
                }
                if (K.llIllIIlIllIl(lllllllllllllllllIlIIIIlIlIlIlIl)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[21]];
                    g.a(lllllllllI[llllllllll[15]], hT, llllllllll[1]);
                }
            }
            if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[1])) {
                if (K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hV), llllllllll[14])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[19]];
                    Movement.walkTo((WorldPoint)hV);
                    "".length();
                    Time.sleepTicks((int)llllllllll[1]);
                    "".length();
                }
                if (K.llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hV), llllllllll[14])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[22]];
                    String[] stringArray = new String[llllllllll[1]];
                    stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[23]];
                    lllllllllllllllllIlIIIIlIlIlIllI = TileObjects.getNearest((String[])stringArray);
                    if (K.llIllIIlIllIl(lllllllllllllllllIlIIIIlIlIlIllI)) {
                        String[] stringArray2 = new String[llllllllll[1]];
                        stringArray2[K.llllllllll[0]] = lllllllllI[llllllllll[24]];
                        if (K.llIllIIlIlIII(lllllllllllllllllIlIIIIlIlIlIllI.hasAction(stringArray2) ? 1 : 0)) {
                            lllllllllllllllllIlIIIIlIlIlIllI.interact(lllllllllI[llllllllll[25]]);
                            Time.sleepTicks((int)llllllllll[8]);
                            "".length();
                        }
                    }
                    g.a(lllllllllI[llllllllll[26]], hT);
                }
            }
            if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[3])) {
                if (K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    int[] nArray = new int[llllllllll[1]];
                    nArray[K.llllllllll[0]] = llllllllll[27];
                    if (K.llIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[llllllllll[1]];
                        nArray3[K.llllllllll[0]] = llllllllll[27];
                        Inventory.getFirst((int[])nArray3).interact(lllllllllI[llllllllll[28]]);
                        Time.sleepTicks((int)llllllllll[1]);
                        "".length();
                    }
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[29]];
                    Movement.walkTo((WorldPoint)hW);
                    "".length();
                    Time.sleepTicks((int)llllllllll[1]);
                    "".length();
                }
                if (K.llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[30]];
                    String[] stringArray = new String[llllllllll[1]];
                    stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[31]];
                    lllllllllllllllllIlIIIIlIlIlIllI = NPCs.getNearest((String[])stringArray);
                    if (K.llIllIIlIllIl(lllllllllllllllllIlIIIIlIlIlIllI)) {
                        g.a(lllllllllI[llllllllll[32]], hT);
                    }
                    if (K.llIllIIlIlllI(lllllllllllllllllIlIIIIlIlIlIllI)) {
                        String[] stringArray3 = new String[llllllllll[1]];
                        stringArray3[K.llllllllll[0]] = lllllllllI[llllllllll[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lllllllllI[llllllllll[34]]);
                        Time.sleepTicks((int)llllllllll[3]);
                        "".length();
                    }
                }
            }
            if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[5])) {
                ck = llllllllll[0];
                if (K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hX), llllllllll[5])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[35]];
                    Movement.walkTo((WorldPoint)hX);
                    "".length();
                    Time.sleepTicks((int)llllllllll[1]);
                    "".length();
                }
                if (K.llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hX), llllllllll[5])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[36]];
                    String[] stringArray = new String[llllllllll[1]];
                    stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[37]];
                    lllllllllllllllllIlIIIIlIlIlIllI = TileObjects.getNearest((String[])stringArray);
                    if (K.llIllIIlIllIl(lllllllllllllllllIlIIIIlIlIlIllI)) {
                        lllllllllllllllllIlIIIIlIlIlIllI.interact(lllllllllI[llllllllll[38]]);
                    }
                }
            }
            if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[7])) {
                if (K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    int[] nArray = new int[llllllllll[1]];
                    nArray[K.llllllllll[0]] = llllllllll[27];
                    if (K.llIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[llllllllll[1]];
                        nArray4[K.llllllllll[0]] = llllllllll[27];
                        Inventory.getFirst((int[])nArray4).interact(lllllllllI[llllllllll[39]]);
                        Time.sleepTicks((int)llllllllll[1]);
                        "".length();
                    }
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[40]];
                    Movement.walkTo((WorldPoint)hW);
                    "".length();
                    Time.sleepTicks((int)llllllllll[1]);
                    "".length();
                }
                if (K.llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[41]];
                    String[] stringArray = new String[llllllllll[1]];
                    stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[42]];
                    lllllllllllllllllIlIIIIlIlIlIllI = TileObjects.getNearest((String[])stringArray);
                    if (K.llIllIIlIllIl(lllllllllllllllllIlIIIIlIlIlIllI)) {
                        String[] stringArray4 = new String[llllllllll[1]];
                        stringArray4[K.llllllllll[0]] = lllllllllI[llllllllll[43]];
                        if (K.llIllIIlIlIII(lllllllllllllllllIlIIIIlIlIlIllI.hasAction(stringArray4) ? 1 : 0)) {
                            lllllllllllllllllIlIIIIlIlIlIllI.interact(lllllllllI[llllllllll[44]]);
                            Time.sleepTicks((int)llllllllll[3]);
                            "".length();
                        }
                        String[] stringArray5 = new String[llllllllll[1]];
                        stringArray5[K.llllllllll[0]] = lllllllllI[llllllllll[45]];
                        lllllllllllllllllIlIIIIlIlIlIlIl = Inventory.getFirst((String[])stringArray5);
                        if (K.llIllIIlIllIl(lllllllllllllllllIlIIIIlIlIlIlIl)) {
                            if (K.llIllIIlIlIIl(ck, llllllllll[1])) {
                                ac.mP += llllllllll[1];
                                ac.d(AccBuilderTempleTrek.m);
                                ck += llllllllll[1];
                                ac.mP = llllllllll[0];
                                cl = llllllllll[0];
                            }
                            lllllllllllllllllIlIIIIlIlIlIlIl.useOn((TileObject)lllllllllllllllllIlIIIIlIlIlIllI);
                            Time.sleepTicks((int)llllllllll[5]);
                            "".length();
                        }
                    }
                }
                g.a(hT);
            }
            g.a(new String[llllllllll[0]]);
        }
    }

    private static String llIllIIlIIIlI(String lllllllllllllllllIlIIIIlIlIIIlll, String lllllllllllllllllIlIIIIlIlIIIllI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIlIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIIlIlIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIIlIlIIlIIl.init(llllllllll[3], lllllllllllllllllIlIIIIlIlIIlIlI);
            return new String(lllllllllllllllllIlIIIIlIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIlIlIIlIII) {
            lllllllllllllllllIlIIIIlIlIIlIII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return llllllllll[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[8])) {
            bl = llllllllll[1];
            "".length();
            if ((0x2A ^ 0x2F) == 0) {
                return ((0xB7 ^ 0x93) & ~(0x8F ^ 0xAB)) != 0;
            }
        } else {
            bl = llllllllll[0];
        }
        return bl;
    }
}

