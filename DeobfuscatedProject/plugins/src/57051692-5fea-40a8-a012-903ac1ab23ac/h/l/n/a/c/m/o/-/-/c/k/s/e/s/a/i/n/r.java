/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.H;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class r
implements K {
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ int cW;
    private static /* synthetic */ String[] lIllIIlIIl;
    private static /* synthetic */ int[] lIllIIlIlI;
    private static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean cD;
    static /* synthetic */ WorldPoint cV;

    private static String lIIlIlllIlIlI(String lllllllllllllllllllIIIllIIllIIlI, String lllllllllllllllllllIIIllIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIIllIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIllIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIllIIlIlI[20]), "DES");
            Cipher lllllllllllllllllllIIIllIIllIlII = Cipher.getInstance("DES");
            lllllllllllllllllllIIIllIIllIlII.init(lIllIIlIlI[5], lllllllllllllllllllIIIllIIllIlIl);
            return new String(lllllllllllllllllllIIIllIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIllIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIllIIllIIll) {
            lllllllllllllllllllIIIllIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIIIIlIl(int n2) {
        return n2 == 0;
    }

    static {
        r.lIIllIIIIIIlI();
        r.lIIlIlllIllIl();
        bp = new ArrayList<d>();
        cV = new WorldPoint(lIllIIlIlI[1], lIllIIlIlI[1], lIllIIlIlI[1]);
        cW = lIllIIlIlI[1];
        String[] stringArray = new String[lIllIIlIlI[0]];
        stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[102]];
        cy = stringArray;
    }

    private static String lIIlIlllIllII(String lllllllllllllllllllIIIllIlIIIIlI, String lllllllllllllllllllIIIllIlIIIllI) {
        lllllllllllllllllllIIIllIlIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIIllIlIIIlIl = new StringBuilder();
        char[] lllllllllllllllllllIIIllIlIIIlII = lllllllllllllllllllIIIllIlIIIllI.toCharArray();
        int lllllllllllllllllllIIIllIlIIIIll = lIllIIlIlI[1];
        char[] lllllllllllllllllllIIIllIIllllIl = lllllllllllllllllllIIIllIlIIIIlI.toCharArray();
        int lllllllllllllllllllIIIllIIllllII = lllllllllllllllllllIIIllIIllllIl.length;
        int lllllllllllllllllllIIIllIIlllIll = lIllIIlIlI[1];
        while (r.lIIllIIIIIlII(lllllllllllllllllllIIIllIIlllIll, lllllllllllllllllllIIIllIIllllII)) {
            char lllllllllllllllllllIIIllIlIIlIII = lllllllllllllllllllIIIllIIllllIl[lllllllllllllllllllIIIllIIlllIll];
            lllllllllllllllllllIIIllIlIIIlIl.append((char)(lllllllllllllllllllIIIllIlIIlIII ^ lllllllllllllllllllIIIllIlIIIlII[lllllllllllllllllllIIIllIlIIIIll % lllllllllllllllllllIIIllIlIIIlII.length]));
            "".length();
            ++lllllllllllllllllllIIIllIlIIIIll;
            ++lllllllllllllllllllIIIllIIlllIll;
            "".length();
            if (" ".length() <= "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIIIllIlIIIlIl);
    }

    private static boolean lIIllIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlIlllIlIll(String lllllllllllllllllllIIIllIlIlIlll, String lllllllllllllllllllIIIllIlIlIllI) {
        try {
            SecretKeySpec lllllllllllllllllllIIIllIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIllIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIllIlIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIllIlIllIIl.init(lIllIIlIlI[5], lllllllllllllllllllIIIllIlIllIlI);
            return new String(lllllllllllllllllllIIIllIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIllIlIllIII) {
            lllllllllllllllllllIIIllIlIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean al() {
        int n2;
        int[] nArray = new int[lIllIIlIlI[0]];
        nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
        if (r.lIIllIIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0) && r.lIIllIIIIIIll(Inventory.contains(item -> item.getName().contains(lIllIIlIIl[lIllIIlIlI[94]])) ? 1 : 0) && (!r.lIIllIIIIIlIl(Equipment.contains(item -> item.getName().contains(lIllIIlIIl[lIllIIlIlI[93]])) ? 1 : 0) || r.lIIllIIIIIIll(Inventory.contains(item -> item.getName().contains(lIllIIlIIl[lIllIIlIlI[92]])) ? 1 : 0))) {
            n2 = lIllIIlIlI[0];
            "".length();
            if (((0xF0 ^ 0xB7 ^ (0x57 ^ 0x32)) & (0xD0 ^ 0x99 ^ (0xDD ^ 0xB6) ^ -" ".length())) < -" ".length()) {
                return ((0 ^ 0x6F ^ (0xD4 ^ 0x9D)) & (0x33 ^ 0x57 ^ (0xF4 ^ 0xB6) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIllIIlIlI[1];
        }
        return n2 != 0;
    }

    @Override
    public String ae() {
        return lIllIIlIIl[lIllIIlIlI[90]];
    }

    private static /* synthetic */ boolean b(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[96]]) ? 1 : 0) && r.lIIllIIIIlIlI(tileObject.getWorldLocation().distanceTo(worldPoint), lIllIIlIlI[18])) {
            n2 = lIllIIlIlI[0];
            "".length();
            if (((0x19 ^ 0x1E ^ (0x88 ^ 0xBB)) & (71 + 65 - 27 + 28 ^ 141 + 3 - -45 + 0 ^ -" ".length())) != 0) {
                return ((0xDA ^ 0x89 ^ (0x11 ^ 0x7C)) & (80 + 140 - 110 + 79 ^ 101 + 48 - 104 + 86 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIllIIlIlI[1];
        }
        return n2 != 0;
    }

    private static void lIIlIlllIllIl() {
        lIllIIlIIl = new String[lIllIIlIlI[103]];
        r.lIllIIlIIl[r.lIllIIlIlI[1]] = r.lIIlIlllIlIlI("NNRaAbPnPFuZU2PUwjgPD//WRLoibLbYmpS0/WuY+ydo0dTbYDxVlJmmocAHyhCa", "LshdV");
        r.lIllIIlIIl[r.lIllIIlIlI[0]] = r.lIIlIlllIlIll("0QuFmjSsIEStio1OGuVbGg==", "FgElQ");
        r.lIllIIlIIl[r.lIllIIlIlI[5]] = r.lIIlIlllIlIlI("x398dQuDtvzUocdpgcDycLNyScyGw4J4", "PtWKQ");
        r.lIllIIlIIl[r.lIllIIlIlI[9]] = r.lIIlIlllIlIll("Wk9A7+y5hze2ZC2VtAbJ0P2xpftkyK+U70rhTUr+RgobV0WZBOI09xmdq4DRDHNadBZ822y2qOU=", "LxNip");
        r.lIllIIlIIl[r.lIllIIlIlI[6]] = r.lIIlIlllIlIlI("uhQoQfEjjDy5QGtJFNW5mItNrmOrYcCgnDqANa2Y1EWkiQdBMFM8dtWPxmJoyKfZW4HmXMrdqdk=", "zwBPZ");
        r.lIllIIlIIl[r.lIllIIlIlI[14]] = r.lIIlIlllIlIlI("KD9ZCWtptu4=", "Zbbps");
        r.lIllIIlIIl[r.lIllIIlIlI[18]] = r.lIIlIlllIlIlI("2UQbYwCsepbjYaJlRjHBYw==", "zuBux");
        r.lIllIIlIIl[r.lIllIIlIlI[19]] = r.lIIlIlllIllII("OTwjJgA=", "vONGn");
        r.lIllIIlIIl[r.lIllIIlIlI[20]] = r.lIIlIlllIllII("Ch1ZExomHBxHEy0XDQ8bLQlZLlIgDxdHGiYCCUcLLBtZEBs3BkY=", "Cnygr");
        r.lIllIIlIIl[r.lIllIIlIlI[24]] = r.lIIlIlllIllII("JBInbTgFUzA9PBgWPzklCRY=", "jsQML");
        r.lIllIIlIIl[r.lIllIIlIlI[8]] = r.lIIlIlllIllII("PRQpNw==", "rdLYA");
        r.lIllIIlIIl[r.lIllIIlIlI[25]] = r.lIIlIlllIllII("BgoDOicpDhorJw==", "GzsHB");
        r.lIllIIlIIl[r.lIllIIlIlI[26]] = r.lIIlIlllIlIlI("a/VyPCnKpkLvgZYv92MfYDmTpMVAJ3Y8Nmpq8qKR0zz5oDItxuYNO1xBt5obIwYF", "yCCIv");
        r.lIllIIlIIl[r.lIllIIlIlI[27]] = r.lIIlIlllIlIll("edrT3nXWAT2rRZU0DsftKTBDnsTUNKwS47M3iAOEbzsL23HxT+1mDWWvsru31nG3fghsl+yzlb+JDb/NAWCfJA==", "RUbVC");
        r.lIllIIlIIl[r.lIllIIlIlI[28]] = r.lIIlIlllIlIll("nw8zqgRQTKxU6h5xqrJZVSHi5JuBSdcJ457nWcZdh5RvErhuqND3Lw==", "oHxRb");
        r.lIllIIlIIl[r.lIllIIlIlI[29]] = r.lIIlIlllIlIlI("/G/3or8vKBA90W2PH+fn3qgD6HJHXT8Lk2C3/lK/gX1vualP7eb5nmK2z7udIUuS", "hPeEW");
        r.lIllIIlIIl[r.lIllIIlIlI[30]] = r.lIIlIlllIlIll("rxwkh47TjzRXnXM4f1S1nTs+zOQZJxemyDCS5ikE/MSqkYWI4a2mEINRceEY+k3CrgPSgHTq3NSAat7ge0QfJ+WJJOg4oSLs", "icTwT");
        r.lIllIIlIIl[r.lIllIIlIlI[35]] = r.lIIlIlllIlIlI("CQLrkqgtw5gw7oI0uYMTfUfxxmpTHiMD", "cArHw");
        r.lIllIIlIIl[r.lIllIIlIlI[36]] = r.lIIlIlllIlIlI("xThtgH9AqVc=", "qmCMk");
        r.lIllIIlIIl[r.lIllIIlIlI[37]] = r.lIIlIlllIlIll("IJ8TSQ6SV5bVZ0aG4A1ODH/DN34GILGr", "dlZkm");
        r.lIllIIlIIl[r.lIllIIlIlI[38]] = r.lIIlIlllIllII("BTIXIywqNg4yLA==", "DBgQI");
        r.lIllIIlIIl[r.lIllIIlIlI[39]] = r.lIIlIlllIlIll("eJGZ7AdQCowzMn3jf3ycbQ==", "oqPrQ");
        r.lIllIIlIIl[r.lIllIIlIlI[44]] = r.lIIlIlllIlIlI("ZNlc9LZvP/KxWn8ZEbucgw==", "kLGFs");
        r.lIllIIlIIl[r.lIllIIlIlI[12]] = r.lIIlIlllIlIlI("6QbHH4OkXkA=", "lcztA");
        r.lIllIIlIIl[r.lIllIIlIlI[42]] = r.lIIlIlllIlIlI("QwMALwKooXmXzsxfwN6kI7JsrLZ1jeC9hhYEw6KS2zlLdVXT0yVhyg==", "jMVuL");
        r.lIllIIlIIl[r.lIllIIlIlI[62]] = r.lIIlIlllIlIlI("6yLP+Tb/+AilkiBRkR+0Jt8DEqyU/Edh", "DTyoj");
        r.lIllIIlIIl[r.lIllIIlIlI[67]] = r.lIIlIlllIlIll("lz8AgnodQzR9UaJRWugyHVbgbjk+DzfCZZpZuN8pXCK2pFjH5WggHA==", "BCMmD");
        r.lIllIIlIIl[r.lIllIIlIlI[69]] = r.lIIlIlllIllII("BDMseiM5ZnA0M3YyKzYy", "VFBZW");
        r.lIllIIlIIl[r.lIllIIlIlI[72]] = r.lIIlIlllIllII("NycnVBcKcj0cChc2aQAKCTc=", "eRItc");
        r.lIllIIlIIl[r.lIllIIlIlI[79]] = r.lIIlIlllIlIll("h/5R+zSJMEiAQVuic539dA==", "wpQJm");
        r.lIllIIlIIl[r.lIllIIlIlI[80]] = r.lIIlIlllIlIlI("Kwwg+95y+Zc=", "Dntrr");
        r.lIllIIlIIl[r.lIllIIlIlI[81]] = r.lIIlIlllIlIll("JM2kQ7C+KoPgAR7jtCKrjQ==", "NCGBe");
        r.lIllIIlIIl[r.lIllIIlIlI[82]] = r.lIIlIlllIllII("HwEWAw==", "OhuhD");
        r.lIllIIlIIl[r.lIllIIlIlI[90]] = r.lIIlIlllIlIlI("d0e4pltkpQKfhepPwdZsaPnyVyikzbeY", "QBDXQ");
        r.lIllIIlIIl[r.lIllIIlIlI[91]] = r.lIIlIlllIlIll("bnP7qdJNHCkPk1puRvBRsoaNd1ImcIUv", "HbxYU");
        r.lIllIIlIIl[r.lIllIIlIlI[92]] = r.lIIlIlllIllII("FDQQFggeJg==", "pAuza");
        r.lIllIIlIIl[r.lIllIIlIlI[93]] = r.lIIlIlllIllII("DjwUIiEELg==", "jIqNH");
        r.lIllIIlIIl[r.lIllIIlIlI[94]] = r.lIIlIlllIlIlI("kXAKdZ4OyHA=", "LcsiK");
        r.lIllIIlIIl[r.lIllIIlIlI[95]] = r.lIIlIlllIlIll("p1uQtVbqKvU=", "QzZkL");
        r.lIllIIlIIl[r.lIllIIlIlI[96]] = r.lIIlIlllIllII("JQ0YBgo=", "mhjdy");
        r.lIllIIlIIl[r.lIllIIlIlI[87]] = r.lIIlIlllIlIlI("vx5C7oXXLtY=", "ONJZU");
        r.lIllIIlIIl[r.lIllIIlIlI[98]] = r.lIIlIlllIlIll("iz88WOy9RwQ=", "NDrns");
        r.lIllIIlIIl[r.lIllIIlIlI[99]] = r.lIIlIlllIlIll("DoRb9AALMDY=", "geOyq");
        r.lIllIIlIIl[r.lIllIIlIlI[100]] = r.lIIlIlllIlIlI("XJOXvLiAjVU=", "qULFC");
        r.lIllIIlIIl[r.lIllIIlIlI[101]] = r.lIIlIlllIllII("BgE/AA==", "IqZnc");
        r.lIllIIlIIl[r.lIllIIlIlI[102]] = r.lIIlIlllIlIlI("7BIxoN13zwc=", "xxSKE");
    }

    private static boolean lIIllIIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIIIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void O() {
        block11: {
            d lllllllllllllllllllIIIllIllIllll;
            block10: {
                block9: {
                    block8: {
                        Predicate<Item> lllllllllllllllllllIIIllIlllIIII;
                        int[] nArray = new int[lIllIIlIlI[0]];
                        nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[11];
                        if (r.lIIllIIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIllIIlIlI[11], lIllIIlIlI[0], e.c(lIllIIlIlI[83], lIllIIlIlI[50]));
                            bp.add(d2);
                            "".length();
                        }
                        if (r.lIIllIIIIIlIl(Bank.contains(lllllllllllllllllllIIIllIlllIIII = item -> item.getName().toLowerCase().contains(lIllIIlIIl[lIllIIlIlI[91]])) ? 1 : 0)) {
                            lllllllllllllllllllIIIllIllIllll = new d(lIllIIlIlI[84], lIllIIlIlI[14], lIllIIlIlI[85]);
                            bp.add(lllllllllllllllllllIIIllIllIllll);
                            "".length();
                        }
                        int[] nArray2 = new int[lIllIIlIlI[0]];
                        nArray2[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                        if (!r.lIIllIIIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block8;
                        int[] nArray3 = new int[lIllIIlIlI[0]];
                        nArray3[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                        if (!r.lIIllIIIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                        int[] nArray4 = new int[lIllIIlIlI[0]];
                        nArray4[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                        if (!r.lIIllIIIIIlII(Bank.getFirst((int[])nArray4).getQuantity(), lIllIIlIlI[86])) break block9;
                    }
                    lllllllllllllllllllIIIllIllIllll = new d(lIllIIlIlI[7], lIllIIlIlI[86], j.bZ);
                    bp.add(lllllllllllllllllllIIIllIllIllll);
                    "".length();
                }
                int[] nArray = new int[lIllIIlIlI[0]];
                nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                if (!r.lIIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block10;
                int[] nArray5 = new int[lIllIIlIlI[0]];
                nArray5[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                if (!r.lIIllIIIIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                int[] nArray6 = new int[lIllIIlIlI[0]];
                nArray6[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                if (!r.lIIllIIIIIlII(Bank.getFirst((int[])nArray6).getQuantity(), lIllIIlIlI[29])) break block11;
            }
            lllllllllllllllllllIIIllIllIllll = new d(lIllIIlIlI[10], lIllIIlIlI[87], lIllIIlIlI[88]);
            bp.add(lllllllllllllllllllIIIllIllIllll);
            "".length();
        }
    }

    private static boolean aV() {
        int n2;
        WorldArea worldArea = new WorldArea(lIllIIlIlI[40], lIllIIlIlI[41], lIllIIlIlI[36], lIllIIlIlI[42], lIllIIlIlI[1]);
        if (r.lIIllIIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIIllIIIIlIlI(Players.getLocal().getWorldLocation().getX(), lIllIIlIlI[43])) {
            n2 = lIllIIlIlI[0];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x23 ^ 0x2F) & ~(0x7A ^ 0x76)) != 0;
            }
        } else {
            n2 = lIllIIlIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIllIIIIIlll(Object object) {
        return object != null;
    }

    private static void aW() {
        if (r.lIIllIIIIIlIl(r.aV() ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[44]];
            int[] nArray = new int[lIllIIlIlI[6]];
            nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[45];
            nArray[r.lIllIIlIlI[0]] = lIllIIlIlI[46];
            nArray[r.lIllIIlIlI[5]] = lIllIIlIlI[47];
            nArray[r.lIllIIlIlI[9]] = lIllIIlIlI[48];
            int[] nArray2 = nArray;
            if (r.lIIllIIIIIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                Inventory.getAll((int[])nArray2).stream().forEach(Item::drop);
                Time.sleepTicks((int)lIllIIlIlI[0]);
                "".length();
            }
            TileObjects.getNearest(tileObject -> {
                int n2;
                if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[87]]) ? 1 : 0) && r.lIIllIIIIlIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIlIlI[97], lIllIIlIlI[60], lIllIIlIlI[1])), lIllIIlIlI[5])) {
                    n2 = lIllIIlIlI[0];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return ((103 + 139 - 120 + 52 ^ 12 + 148 - 90 + 94) & (22 + 14 - -5 + 87 ^ 94 + 68 - 158 + 134 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIllIIlIlI[1];
                }
                return n2 != 0;
            }).interact(lIllIIlIIl[lIllIIlIlI[12]]);
            Time.sleepUntil(() -> r.aV(), (int)e.c(lIllIIlIlI[49], lIllIIlIlI[50]));
            "".length();
        }
        if (r.lIIllIIIIIIll(r.aV() ? 1 : 0)) {
            WorldPoint lllllllllllllllllllIIIllIlllIlII;
            TileObject lllllllllllllllllllIIIllIlllIIll;
            WorldArea lllllllllllllllllllIIIllIlllIllI;
            WorldArea lllllllllllllllllllIIIllIlllIlll;
            WorldArea lllllllllllllllllllIIIllIllllIlI;
            WorldArea lllllllllllllllllllIIIllIllllIll;
            int[] nArray = new int[lIllIIlIlI[0]];
            nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[51];
            NPC lllllllllllllllllllIIIlllIIIIIII = NPCs.getNearest((int[])nArray);
            int[] nArray3 = new int[lIllIIlIlI[0]];
            nArray3[r.lIllIIlIlI[1]] = lIllIIlIlI[52];
            NPC lllllllllllllllllllIIIllIlllllll = NPCs.getNearest((int[])nArray3);
            int[] nArray4 = new int[lIllIIlIlI[0]];
            nArray4[r.lIllIIlIlI[1]] = lIllIIlIlI[53];
            NPC lllllllllllllllllllIIIllIllllllI = NPCs.getNearest((int[])nArray4);
            int[] nArray5 = new int[lIllIIlIlI[0]];
            nArray5[r.lIllIIlIlI[1]] = lIllIIlIlI[54];
            NPC lllllllllllllllllllIIIllIlllllIl = NPCs.getNearest((int[])nArray5);
            WorldArea lllllllllllllllllllIIIllIlllllII = new WorldArea(lIllIIlIlI[55], lIllIIlIlI[56], lIllIIlIlI[14], lIllIIlIlI[14], lIllIIlIlI[1]);
            if (r.lIIllIIIIIIll(lllllllllllllllllllIIIllIlllllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIIllIIIIIlll(lllllllllllllllllllIIIlllIIIIIII)) {
                lllllllllllllllllllIIIllIllllIll = new WorldArea(lIllIIlIlI[57], lIllIIlIlI[58], lIllIIlIlI[14], lIllIIlIlI[6], lIllIIlIlI[1]);
                if (r.lIIllIIIIIlIl(lllllllllllllllllllIIIllIllllIll.contains((Locatable)lllllllllllllllllllIIIlllIIIIIII) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[42]];
                    lllllllllllllllllllIIIllIllllIlI = new WorldPoint(lIllIIlIlI[59], lIllIIlIlI[60], lIllIIlIlI[1]);
                    if (r.lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIIIllIllllIlI) ? 1 : 0)) {
                        e.c((WorldPoint)lllllllllllllllllllIIIllIllllIlI);
                        Time.sleepTicks((int)lIllIIlIlI[0]);
                        "".length();
                    }
                }
                if (r.lIIllIIIIIIll(lllllllllllllllllllIIIllIllllIll.contains((Locatable)lllllllllllllllllllIIIlllIIIIIII) ? 1 : 0)) {
                    lllllllllllllllllllIIIllIllllIlI = new WorldPoint(lIllIIlIlI[59], lIllIIlIlI[61], lIllIIlIlI[1]);
                    if (r.lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIIIllIllllIlI) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[62]];
                        e.c((WorldPoint)lllllllllllllllllllIIIllIllllIlI);
                        Time.sleepTicks((int)lIllIIlIlI[0]);
                        "".length();
                    }
                }
            }
            lllllllllllllllllllIIIllIllllIll = new WorldArea(lIllIIlIlI[63], lIllIIlIlI[64], lIllIIlIlI[25], lIllIIlIlI[6], lIllIIlIlI[1]);
            lllllllllllllllllllIIIllIllllIlI = new WorldArea(lIllIIlIlI[65], lIllIIlIlI[58], lIllIIlIlI[18], lIllIIlIlI[19], lIllIIlIlI[1]);
            WorldArea lllllllllllllllllllIIIllIllllIIl = new WorldArea(lIllIIlIlI[57], lIllIIlIlI[66], lIllIIlIlI[9], lIllIIlIlI[20], lIllIIlIlI[1]);
            WorldArea lllllllllllllllllllIIIllIllllIII = new WorldArea(lIllIIlIlI[65], lIllIIlIlI[60], lIllIIlIlI[6], lIllIIlIlI[6], lIllIIlIlI[1]);
            if (!r.lIIllIIIIIlIl(lllllllllllllllllllIIIllIllllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIIllIIIIIIll(lllllllllllllllllllIIIllIllllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllllllIIIllIlllIlll = new WorldArea(lIllIIlIlI[63], lIllIIlIlI[64], lIllIIlIlI[24], lIllIIlIlI[9], lIllIIlIlI[1]);
                if (r.lIIllIIIIIlll(lllllllllllllllllllIIIllIlllllll) && r.lIIllIIIIIlll(lllllllllllllllllllIIIllIllllllI) && r.lIIllIIIIIlll(lllllllllllllllllllIIIlllIIIIIII)) {
                    if (!r.lIIllIIIIIIll(lllllllllllllllllllIIIllIlllIlll.contains((Locatable)lllllllllllllllllllIIIllIlllllll) ? 1 : 0) || r.lIIllIIIIIlIl(lllllllllllllllllllIIIllIlllIlll.contains((Locatable)lllllllllllllllllllIIIllIllllllI) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[67]];
                    }
                    if (r.lIIllIIIIIIll(lllllllllllllllllllIIIllIlllIlll.contains((Locatable)lllllllllllllllllllIIIllIlllllll) ? 1 : 0) && r.lIIllIIIIIIll(lllllllllllllllllllIIIllIlllIlll.contains((Locatable)lllllllllllllllllllIIIllIllllllI) ? 1 : 0) && (!r.lIIllIIIIIlIl(lllllllllllllllllllIIIllIllllIIl.contains((Locatable)lllllllllllllllllllIIIlllIIIIIII) ? 1 : 0) || r.lIIllIIIIIIll(lllllllllllllllllllIIIllIllllIII.contains((Locatable)lllllllllllllllllllIIIlllIIIIIII) ? 1 : 0))) {
                        lllllllllllllllllllIIIllIlllIllI = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[68], lIllIIlIlI[1]);
                        if (r.lIIllIIIIIIll(lllllllllllllllllllIIIllIllllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIIIllIlllIllI) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[69]];
                            e.c((WorldPoint)lllllllllllllllllllIIIllIlllIllI);
                            Time.sleepTicks((int)lIllIIlIlI[0]);
                            "".length();
                        }
                    }
                }
                if (r.lIIllIIIIIIll(lllllllllllllllllllIIIllIllllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIIllIIIIIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[68], lIllIIlIlI[1])) ? 1 : 0)) {
                    lllllllllllllllllllIIIllIlllIllI = new WorldPoint(lIllIIlIlI[70], lIllIIlIlI[71], lIllIIlIlI[1]);
                    if (r.lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIIIllIlllIllI) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[72]];
                        e.c((WorldPoint)lllllllllllllllllllIIIllIlllIllI);
                        Time.sleepTicks((int)lIllIIlIlI[0]);
                        "".length();
                    }
                }
            }
            lllllllllllllllllllIIIllIlllIlll = new WorldArea(lIllIIlIlI[73], lIllIIlIlI[74], lIllIIlIlI[8], lIllIIlIlI[29], lIllIIlIlI[1]);
            lllllllllllllllllllIIIllIlllIllI = new WorldArea(lIllIIlIlI[73], lIllIIlIlI[75], lIllIIlIlI[6], lIllIIlIlI[19], lIllIIlIlI[1]);
            WorldPoint lllllllllllllllllllIIIllIlllIlIl = new WorldPoint(lIllIIlIlI[70], lIllIIlIlI[71], lIllIIlIlI[1]);
            if (r.lIIllIIIIIIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIIIllIlllIlIl) ? 1 : 0) && r.lIIllIIIIIlll(lllllllllllllllllllIIIllIlllllIl) && (r.lIIllIIIIlIll(lllllllllllllllllllIIIllIlllllIl.getOrientation(), lIllIIlIlI[76]) && !r.lIIllIIIIIlII(lllllllllllllllllllIIIllIlllllIl.getWorldLocation().getX(), lIllIIlIlI[77]) || r.lIIllIIIIlIll(lllllllllllllllllllIIIllIlllllIl.getOrientation(), lIllIIlIlI[78]) && r.lIIllIIIIIllI(lllllllllllllllllllIIIllIlllllIl.getWorldLocation().getX(), lIllIIlIlI[57])) && r.lIIllIIIIIlll(lllllllllllllllllllIIIllIlllIIll = TileObjects.getNearest(arg_0 -> r.b(lllllllllllllllllllIIIllIlllIlII = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[56], lIllIIlIlI[1]), arg_0)))) {
                AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[79]];
                lllllllllllllllllllIIIllIlllIIll.interact(lIllIIlIIl[lIllIIlIlI[80]]);
                Time.sleepTicks((int)lIllIIlIlI[5]);
                "".length();
            }
            if ((!r.lIIllIIIIIlIl(lllllllllllllllllllIIIllIlllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIIllIIIIIIll(lllllllllllllllllllIIIllIlllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && r.lIIllIIIIIlll(lllllllllllllllllllIIIllIlllIIll = TileObjects.getNearest(arg_0 -> r.a(lllllllllllllllllllIIIllIlllIlII = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[56], lIllIIlIlI[1]), arg_0)))) {
                AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[81]];
                lllllllllllllllllllIIIllIlllIIll.interact(lIllIIlIIl[lIllIIlIlI[82]]);
                Time.sleepTicks((int)lIllIIlIlI[5]);
                "".length();
            }
        }
    }

    @Override
    public int ad() {
        try {
            r.aU();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (" ".length() > "  ".length()) {
            return (77 + 125 - 158 + 174 ^ 146 + 140 - 185 + 98) & (0x2C ^ 0x57 ^ (0xD0 ^ 0xB6) ^ -" ".length());
        }
        return lIllIIlIlI[89];
    }

    private static boolean lIIllIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllIIIIIIlI() {
        lIllIIlIlI = new int[104];
        r.lIllIIlIlI[0] = " ".length();
        r.lIllIIlIlI[1] = (0x4B ^ 0x28 ^ (0xE7 ^ 0xC5)) & (0xD0 ^ 0xBE ^ (0x48 ^ 0x67) ^ -" ".length());
        r.lIllIIlIlI[2] = 0xFFFF8B91 & 0x757F;
        r.lIllIIlIlI[3] = 0x58 ^ 0x51 ^ (5 ^ 0x62);
        r.lIllIIlIlI[4] = 0xFFFFD3EC & 0x3F9B;
        r.lIllIIlIlI[5] = "  ".length();
        r.lIllIIlIlI[6] = 1 + 19 - -51 + 71 ^ 87 + 82 - 109 + 78;
        r.lIllIIlIlI[7] = -(0xFFFFECAF & 0x17FD) & (0xFFFFFDFD & 0x37FF);
        r.lIllIIlIlI[8] = 200 + 137 - 223 + 91 ^ 109 + 104 - 49 + 35;
        r.lIllIIlIlI[9] = "   ".length();
        r.lIllIIlIlI[10] = -(0xFFFFD5B5 & 0x6AEB) & (0xFFFFDFF7 & 0x7FEF);
        r.lIllIIlIlI[11] = 0xFFFFDFFA & 0x29FD;
        r.lIllIIlIlI[12] = 0x4C ^ 0x5B;
        r.lIllIIlIlI[13] = 0x47 ^ 0x66 ^ (0x8B ^ 0x98);
        r.lIllIIlIlI[14] = 0x87 ^ 0x82;
        r.lIllIIlIlI[15] = 0xFFFFDD81 & 0x2F7F;
        r.lIllIIlIlI[16] = 0xFFFF8DF9 & 0x7EDF;
        r.lIllIIlIlI[17] = -(0xFFFFB6D7 & 0x69B9) & (0xFFFFBDFE & 0x6EFF);
        r.lIllIIlIlI[18] = 0xBA ^ 0xBC;
        r.lIllIIlIlI[19] = 92 + 97 - 151 + 151 ^ 127 + 93 - 69 + 35;
        r.lIllIIlIlI[20] = 0x8C ^ 0x84;
        r.lIllIIlIlI[21] = 0xFFFFBD71 & 0x4F8E;
        r.lIllIIlIlI[22] = 0xFFFF8CF8 & Short.MAX_VALUE;
        r.lIllIIlIlI[23] = -(0xFFFFF9FD & 0x57BF) & (0xFFFFFDFF & 0x5FFF);
        r.lIllIIlIlI[24] = 0x6A ^ 0x63;
        r.lIllIIlIlI[25] = 0x26 ^ 0x2D;
        r.lIllIIlIlI[26] = 0x32 ^ 0x46 ^ (0xE ^ 0x76);
        r.lIllIIlIlI[27] = 0x62 ^ 0x2F ^ (0xC2 ^ 0x82);
        r.lIllIIlIlI[28] = 0x35 ^ 0x3B;
        r.lIllIIlIlI[29] = 0x48 ^ 0x47;
        r.lIllIIlIlI[30] = 0x79 ^ 0x69;
        r.lIllIIlIlI[31] = -(0xFFFFFFAB & 0x707F) & (0xFFFFFBFE & 0x7F6F);
        r.lIllIIlIlI[32] = 0xFFFFD74B & 0x3DF6;
        r.lIllIIlIlI[33] = 158 + 145 - 220 + 80 ^ 6 + 112 - 117 + 153;
        r.lIllIIlIlI[34] = " ".length() ^ (0x3E ^ 4);
        r.lIllIIlIlI[35] = 0xD3 ^ 0x8B ^ (0x77 ^ 0x3E);
        r.lIllIIlIlI[36] = 81 + 12 - -70 + 9 ^ 172 + 138 - 304 + 184;
        r.lIllIIlIlI[37] = 0x29 ^ 0x72 ^ (0x14 ^ 0x5C);
        r.lIllIIlIlI[38] = 0xA8 ^ 0x88 ^ (0x20 ^ 0x14);
        r.lIllIIlIlI[39] = 0x45 ^ 0x50;
        r.lIllIIlIlI[40] = -(0xFFFFC689 & 0x7DF7) & (0xFFFFEFF6 & 0x5FCF);
        r.lIllIIlIlI[41] = 0xFFFFDF7C & 0x35DB;
        r.lIllIIlIlI[42] = 0x4E ^ 0x42 ^ (0x9E ^ 0x8A);
        r.lIllIIlIlI[43] = 0xFFFFDB76 & 0x2FDF;
        r.lIllIIlIlI[44] = 0x28 ^ 0x38 ^ (0x95 ^ 0x93);
        r.lIllIIlIlI[45] = 26 + 87 - 29 + 165;
        r.lIllIIlIlI[46] = 77 + 155 - 151 + 133 + (0x3C ^ 0x6E) - (0xE4 ^ 0xB5) + (2 ^ 0x26);
        r.lIllIIlIlI[47] = 128 + 251 - 350 + 224;
        r.lIllIIlIlI[48] = 98 + 214 - 284 + 227;
        r.lIllIIlIlI[49] = 0xFFFF85F9 & 0x7F7E;
        r.lIllIIlIlI[50] = -(0xFFFFFB06 & 0x54FF) & (0xFFFFF77F & 0x5EF7);
        r.lIllIIlIlI[51] = -(3 ^ 0x59) & (0xFFFFBFFF & 0x56FF);
        r.lIllIIlIlI[52] = -" ".length() & (0xFFFFFFA7 & 0x16FF);
        r.lIllIIlIlI[53] = 0xFFFFF6BA & 0x1FED;
        r.lIllIIlIlI[54] = -(0xFFFFF915 & 0x6FEF) & (0xFFFFFFBD & 0x7FEF);
        r.lIllIIlIlI[55] = -(0xFFFFECFE & 0x372F) & (0xFFFFBFFF & 0x6F7F);
        r.lIllIIlIlI[56] = 0xFFFFFFDF & 0x157B;
        r.lIllIIlIlI[57] = 0xFFFFABD3 & 0x5F7C;
        r.lIllIIlIlI[58] = 0xFFFFF577 & 0x1FEB;
        r.lIllIIlIlI[59] = -(0xFFFFCEEB & 0x3515) & (0xFFFFDF7D & 0x2FD6);
        r.lIllIIlIlI[60] = -(0xFFFFEF73 & 0x5AAD) & (0xFFFFFF7E & 0x5FFF);
        r.lIllIIlIlI[61] = -(0xFFFFAA92 & 0x7F6F) & (0xFFFFBFF7 & 0x7F6D);
        r.lIllIIlIlI[62] = 0x7D ^ 0x2A ^ (0xE2 ^ 0xAC);
        r.lIllIIlIlI[63] = 0xFFFFDFFF & 0x2B4B;
        r.lIllIIlIlI[64] = -(0xFFFFFF67 & 0x689D) & (0xFFFFFFFD & 0x7D6E);
        r.lIllIIlIlI[65] = -(0xFFFFEF7F & 0x748F) & (0xFFFFFF5F & 0x6FFF);
        r.lIllIIlIlI[66] = -(0xFFFFEFC3 & 0x3ABD) & (0xFFFFFFDF & 0x3FFF);
        r.lIllIIlIlI[67] = 0x42 ^ 0x58;
        r.lIllIIlIlI[68] = -(0xFFFFEBDF & 0x36A7) & (0xFFFFF7EF & 0x3FFF);
        r.lIllIIlIlI[69] = 0xA0 ^ 0xBB;
        r.lIllIIlIlI[70] = -(0xFFFFF5DB & 0x7EB7) & (0xFFFFFFDE & Short.MAX_VALUE);
        r.lIllIIlIlI[71] = -(0xFFFFD9B4 & 0x2ECF) & (0xFFFFDDEF & 0x3FFF);
        r.lIllIIlIlI[72] = 0x55 ^ 0x49;
        r.lIllIIlIlI[73] = -(0xFFFFDE35 & 0x61FB) & (0xFFFFFFFF & 0x4B77);
        r.lIllIIlIlI[74] = 0xFFFFD77B & 0x3DDD;
        r.lIllIIlIlI[75] = -(0x19 ^ 8) & (0xFFFFD7F7 & 0x3D7F);
        r.lIllIIlIlI[76] = 0xFFFFA7FF & 0x5E00;
        r.lIllIIlIlI[77] = -(0xFFFFF4D3 & 0x3B3F) & (0xFFFFFFDF & 0x3B7F);
        r.lIllIIlIlI[78] = -(0xFFFFCFD3 & 0x7DFE) & (0xFFFFCFFF & 0x7FD1);
        r.lIllIIlIlI[79] = 9 ^ 0x18 ^ (7 ^ 0xB);
        r.lIllIIlIlI[80] = 32 + 38 - -102 + 16 ^ 37 + 76 - 25 + 74;
        r.lIllIIlIlI[81] = 0x98 ^ 0xA0 ^ (6 ^ 0x21);
        r.lIllIIlIlI[82] = 0x1C ^ 0x2E ^ (0x11 ^ 3);
        r.lIllIIlIlI[83] = 0xFFFF95BD & 0x6FE2;
        r.lIllIIlIlI[84] = -(0xFFFF9CF3 & 0x733D) & (0xFFFFBFFC & 0x7EFF);
        r.lIllIIlIlI[85] = 0xFFFFEDF8 & 0x73AF;
        r.lIllIIlIlI[86] = 0x81 ^ 0xBD;
        r.lIllIIlIlI[87] = 0x44 ^ 0x1D ^ (0xCB ^ 0xBA);
        r.lIllIIlIlI[88] = 0xFFFFDF85 & 0x23FE;
        r.lIllIIlIlI[89] = 0x3F ^ 0x5B;
        r.lIllIIlIlI[90] = 0x1E ^ 0x3F;
        r.lIllIIlIlI[91] = 0x3D ^ 0x1F;
        r.lIllIIlIlI[92] = 103 + 93 - 86 + 62 ^ 9 + 16 - -14 + 104;
        r.lIllIIlIlI[93] = 0x3C ^ 0x67 ^ 25 + 3 - 10 + 109;
        r.lIllIIlIlI[94] = 0x3C ^ 0x19;
        r.lIllIIlIlI[95] = "   ".length() ^ (0x3F ^ 0x1A);
        r.lIllIIlIlI[96] = 0x9F ^ 0x83 ^ (0x88 ^ 0xB3);
        r.lIllIIlIlI[97] = -(0xFFFFF77F & 0x78A9) & (0xFFFFFBFF & 0x7F7F);
        r.lIllIIlIlI[98] = 0x90 ^ 0xB9;
        r.lIllIIlIlI[99] = 0x8C ^ 0xA6;
        r.lIllIIlIlI[100] = 0x9F ^ 0xA7 ^ (0x35 ^ 0x26);
        r.lIllIIlIlI[101] = 1 ^ 0x43 ^ (0xF2 ^ 0x9C);
        r.lIllIIlIlI[102] = 2 ^ 0x1F ^ (0x5A ^ 0x6A);
        r.lIllIIlIlI[103] = 0x58 ^ 0x76;
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[95]]) ? 1 : 0) && r.lIIllIIIIlIlI(tileObject.getWorldLocation().distanceTo(worldPoint), lIllIIlIlI[18])) {
            n2 = lIllIIlIlI[0];
            "".length();
            if ("  ".length() == (0x50 ^ 0x57 ^ "   ".length())) {
                return ((198 + 174 - 235 + 87 ^ 71 + 66 - 132 + 172) & (0xF1 ^ 0xBF ^ (0x8C ^ 0x93) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIllIIlIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIllIIIIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (r.lIIllIIIIIllI(Skills.getLevel((Skill)Skill.FARMING), lIllIIlIlI[91])) {
            bl = lIllIIlIlI[0];
            "".length();
            if (-(48 + 58 - 57 + 107 ^ 20 + 68 - 16 + 81) >= 0) {
                return ((0x18 ^ 0x48 ^ " ".length()) & (0x52 ^ 0x6F ^ (0x7C ^ 0x10) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllIIlIlI[1];
        }
        return bl;
    }

    private static boolean lIIllIIIIllII(Object object) {
        return object == null;
    }

    @Override
    public boolean ac() {
        return lIllIIlIlI[1];
    }

    private static boolean lIIllIIIIlIII(int n2) {
        return n2 > 0;
    }

    public static void aU() {
        if (r.lIIllIIIIIIll(bn ? 1 : 0)) {
            b.a(bp);
            if (r.lIIllIIIIIlII(bp.size(), lIllIIlIlI[0])) {
                System.out.println(lIllIIlIIl[lIllIIlIlI[1]]);
                bn = lIllIIlIlI[1];
            }
        }
        if (r.lIIllIIIIIlIl(bn ? 1 : 0)) {
            if (r.lIIllIIIIIlII(e.j(lIllIIlIlI[2]), lIllIIlIlI[3])) {
                H.cH();
            }
            if (r.lIIllIIIIIllI(e.j(lIllIIlIlI[2]), lIllIIlIlI[3])) {
                BankLocation lllllllllllllllllllIIIlllIIlIIll;
                if (r.lIIllIIIIIlIl(r.al() ? 1 : 0)) {
                    lllllllllllllllllllIIIlllIIlIIll = BankLocation.getNearest();
                    if (r.lIIllIIIIIlll(lllllllllllllllllllIIIlllIIlIIll) && r.lIIllIIIIIlIl(lllllllllllllllllllIIIlllIIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[0]];
                        a.a(lllllllllllllllllllIIIlllIIlIIll);
                    }
                    if (r.lIIllIIIIIlll(lllllllllllllllllllIIIlllIIlIIll) && r.lIIllIIIIIIll(lllllllllllllllllllIIIlllIIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (r.lIIllIIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIlIlI[4]);
                            "".length();
                        }
                        if (r.lIIllIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[5]];
                            if (r.lIIllIIIIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIllIIlIlI[6]);
                                "".length();
                            }
                            if (r.lIIllIIIIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIllIIlIlI[5]);
                                "".length();
                            }
                            int[] nArray = new int[lIllIIlIlI[0]];
                            nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                            if (r.lIIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIllIIlIlI[0]];
                                nArray2[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                                if (r.lIIllIIIIIlII(Bank.getFirst((int[])nArray2).getQuantity(), lIllIIlIlI[8])) {
                                    r.O();
                                    System.out.println(lIllIIlIIl[lIllIIlIlI[9]]);
                                    bn = lIllIIlIlI[0];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIllIIlIlI[9]];
                            nArray3[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                            nArray3[r.lIllIIlIlI[0]] = lIllIIlIlI[7];
                            nArray3[r.lIllIIlIlI[5]] = lIllIIlIlI[11];
                            if (r.lIIllIIIIIlIl(e.b(nArray3) ? 1 : 0)) {
                                r.O();
                                System.out.println(lIllIIlIIl[lIllIIlIlI[6]]);
                                bn = lIllIIlIlI[0];
                                return;
                            }
                            int[] nArray4 = new int[lIllIIlIlI[9]];
                            nArray4[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                            nArray4[r.lIllIIlIlI[0]] = lIllIIlIlI[7];
                            nArray4[r.lIllIIlIlI[5]] = lIllIIlIlI[11];
                            if (r.lIIllIIIIIIll(e.b(nArray4) ? 1 : 0)) {
                                a.a(lIllIIlIlI[10], lIllIIlIlI[8]);
                                a.a(lIllIIlIlI[7], lIllIIlIlI[12]);
                                a.a(lIllIIlIlI[11], lIllIIlIlI[0]);
                            }
                        }
                    }
                }
                if (r.lIIllIIIIIIll(Inventory.contains((int[])f.aU) ? 1 : 0) && r.lIIllIIIIIlII(Movement.getRunEnergy(), lIllIIlIlI[13])) {
                    Inventory.getFirst((int[])f.aU).interact(lIllIIlIIl[lIllIIlIlI[14]]);
                    Time.sleepTicks((int)lIllIIlIlI[0]);
                    "".length();
                }
                if (r.lIIllIIIIIIll(r.al() ? 1 : 0)) {
                    TileObject lllllllllllllllllllIIIlllIIlIIlI;
                    e.l(lIllIIlIlI[11]);
                    if (r.lIIllIIIIIlII(Vars.getBit((int)lIllIIlIlI[15]), lIllIIlIlI[0])) {
                        lllllllllllllllllllIIIlllIIlIIll = new WorldPoint(lIllIIlIlI[16], lIllIIlIlI[17], lIllIIlIlI[1]);
                        if (r.lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIll), lIllIIlIlI[8])) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[18]];
                            Movement.walkTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIll);
                            "".length();
                            Time.sleepTicks((int)lIllIIlIlI[0]);
                            "".length();
                        }
                        if (r.lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIll), lIllIIlIlI[8])) {
                            String[] stringArray = new String[lIllIIlIlI[0]];
                            stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[20]];
                            g.a(lIllIIlIIl[lIllIIlIlI[19]], stringArray);
                        }
                    }
                    if (r.lIIllIIIIlIll(Vars.getBit((int)lIllIIlIlI[15]), lIllIIlIlI[0]) && r.lIIllIIIIIlIl(Vars.getBit((int)lIllIIlIlI[21]))) {
                        lllllllllllllllllllIIIlllIIlIIll = new WorldPoint(lIllIIlIlI[22], lIllIIlIlI[23], lIllIIlIlI[1]);
                        if (r.lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIll), lIllIIlIlI[19])) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[24]];
                            Movement.walkTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIll);
                            "".length();
                            Time.sleepTicks((int)lIllIIlIlI[0]);
                            "".length();
                        }
                        if (r.lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIll), lIllIIlIlI[19])) {
                            lllllllllllllllllllIIIlllIIlIIlI = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[100]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIlI[0]];
                                    stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[101]];
                                    if (r.lIIllIIIIIIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                        n2 = lIllIIlIlI[0];
                                        "".length();
                                        if (null == null) return n2 != 0;
                                        return ((0x36 ^ 0x15) & ~(0xE5 ^ 0xC6)) != 0;
                                    }
                                }
                                n2 = lIllIIlIlI[1];
                                return n2 != 0;
                            });
                            if (r.lIIllIIIIIlll(lllllllllllllllllllIIIlllIIlIIlI)) {
                                lllllllllllllllllllIIIlllIIlIIlI.interact(lIllIIlIIl[lIllIIlIlI[8]]);
                                Time.sleepTicks((int)lIllIIlIlI[6]);
                                "".length();
                            }
                            if (r.lIIllIIIIllII(lllllllllllllllllllIIIlllIIlIIlI)) {
                                String[] stringArray = new String[lIllIIlIlI[14]];
                                stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[26]];
                                stringArray[r.lIllIIlIlI[0]] = lIllIIlIIl[lIllIIlIlI[27]];
                                stringArray[r.lIllIIlIlI[5]] = lIllIIlIIl[lIllIIlIlI[28]];
                                stringArray[r.lIllIIlIlI[9]] = lIllIIlIIl[lIllIIlIlI[29]];
                                stringArray[r.lIllIIlIlI[6]] = lIllIIlIIl[lIllIIlIlI[30]];
                                g.a(lIllIIlIIl[lIllIIlIlI[25]], stringArray);
                            }
                        }
                    }
                    if (r.lIIllIIIIlIll(Vars.getBit((int)lIllIIlIlI[15]), lIllIIlIlI[0]) && r.lIIllIIIIlIll(Vars.getBit((int)lIllIIlIlI[21]), lIllIIlIlI[0])) {
                        lllllllllllllllllllIIIlllIIlIIll = new WorldArea(lIllIIlIlI[31], lIllIIlIlI[32], lIllIIlIlI[33], lIllIIlIlI[34], lIllIIlIlI[1]);
                        if (r.lIIllIIIIIlIl(lllllllllllllllllllIIIlllIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lllllllllllllllllllIIIlllIIlIIlI = new WorldPoint(lIllIIlIlI[22], lIllIIlIlI[23], lIllIIlIlI[1]);
                            if (r.lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIlI), lIllIIlIlI[19])) {
                                AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[35]];
                                Movement.walkTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIlI);
                                "".length();
                                Time.sleepTicks((int)lIllIIlIlI[0]);
                                "".length();
                            }
                            if (r.lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIlllIIlIIlI), lIllIIlIlI[19])) {
                                TileObject lllllllllllllllllllIIIlllIIlIIIl = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[98]]) ? 1 : 0)) {
                                        String[] stringArray = new String[lIllIIlIlI[0]];
                                        stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[99]];
                                        if (r.lIIllIIIIIIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                            n2 = lIllIIlIlI[0];
                                            "".length();
                                            if ((30 + 68 - 7 + 44 ^ 61 + 44 - 47 + 72) > 0) return n2 != 0;
                                            return ((0x7E ^ 0x7B ^ (0x19 ^ 0x39)) & (67 + 141 - 151 + 106 ^ 35 + 64 - -17 + 18 ^ -" ".length())) != 0;
                                        }
                                    }
                                    n2 = lIllIIlIlI[1];
                                    return n2 != 0;
                                });
                                if (r.lIIllIIIIIlll(lllllllllllllllllllIIIlllIIlIIIl)) {
                                    lllllllllllllllllllIIIlllIIlIIIl.interact(lIllIIlIIl[lIllIIlIlI[36]]);
                                    Time.sleepTicks((int)lIllIIlIlI[6]);
                                    "".length();
                                }
                                if (r.lIIllIIIIllII(lllllllllllllllllllIIIlllIIlIIIl)) {
                                    AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[37]];
                                    String[] stringArray = new String[lIllIIlIlI[0]];
                                    stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[38]];
                                    NPCs.getNearest((String[])stringArray).interact(lIllIIlIIl[lIllIIlIlI[39]]);
                                    Time.sleepTicks((int)lIllIIlIlI[6]);
                                    "".length();
                                }
                            }
                        }
                        if (r.lIIllIIIIIIll(lllllllllllllllllllIIIlllIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            r.aW();
                        }
                    }
                }
            }
        }
    }
}

