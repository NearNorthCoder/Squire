package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/r.class */
public class C0017r implements K {
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ int cW;
    private static /* synthetic */ String[] lIllIIlIIl;
    private static /* synthetic */ int[] lIllIIlIlI;
    private static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean cD;
    static /* synthetic */ WorldPoint cV;

    private static String lIIlIlllIlIlI(String lllllllllllllllllllIIIllIIllIIlI, String lllllllllllllllllllIIIllIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIllIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIllIIlIlI[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIlIlI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIllIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIllIIllIIll) {
            lllllllllllllllllllIIIllIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIIIIlIl(int i) {
        return i == 0;
    }

    static {
        lIIllIIIIIIlI();
        lIIlIlllIllIl();
        bp = new ArrayList();
        cV = new WorldPoint(lIllIIlIlI[1], lIllIIlIlI[1], lIllIIlIlI[1]);
        cW = lIllIIlIlI[1];
        String[] strArr = new String[lIllIIlIlI[0]];
        strArr[lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[102]];
        cy = strArr;
    }

    private static String lIIlIlllIllII(String lllllllllllllllllllIIIllIlIIIlll, String lllllllllllllllllllIIIllIlIIIIIl) {
        String lllllllllllllllllllIIIllIlIIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIllIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIIllIlIIIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIIllIlIIIIIl.toCharArray();
        int lllllllllllllllllllIIIllIlIIIIll = lIllIIlIlI[1];
        char[] charArray2 = lllllllllllllllllllIIIllIlIIIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIllIIlIlI[1];
        while (lIIllIIIIIlII(i, length)) {
            lllllllllllllllllllIIIllIlIIIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllIIIllIlIIIIll % charArray.length]));
            "".length();
            lllllllllllllllllllIIIllIlIIIIll++;
            i++;
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIIIllIlIIIlIl);
    }

    private static boolean lIIllIIIIlIIl(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIlllIlIll(String lllllllllllllllllllIIIllIlIlIlll, String lllllllllllllllllllIIIllIlIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIllIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIllIlIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIllIlIllIIl.init(lIllIIlIlI[5], secretKeySpec);
            return new String(lllllllllllllllllllIIIllIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIllIlIllIII) {
            lllllllllllllllllllIIIllIlIllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean al() {
        int[] iArr = new int[lIllIIlIlI[0]];
        iArr[lIllIIlIlI[1]] = lIllIIlIlI[10];
        if (lIIllIIIIIIll(Inventory.contains(iArr) ? 1 : 0) && lIIllIIIIIIll(Inventory.contains(item -> {
            return item.getName().contains(lIllIIlIIl[lIllIIlIlI[94]]);
        }) ? 1 : 0) && (!lIIllIIIIIlIl(Equipment.contains(item2 -> {
            return item2.getName().contains(lIllIIlIIl[lIllIIlIlI[93]]);
        }) ? 1 : 0) || lIIllIIIIIIll(Inventory.contains(item3 -> {
            return item3.getName().contains(lIllIIlIIl[lIllIIlIlI[92]]);
        }) ? 1 : 0))) {
            ?? r0 = lIllIIlIlI[0];
            "".length();
            return (((240 ^ 183) ^ (87 ^ 50)) & (((208 ^ 153) ^ (221 ^ 182)) ^ (-" ".length()))) < (-" ".length()) ? ((0 ^ 111) ^ (212 ^ 157)) & (((51 ^ 87) ^ (244 ^ 182)) ^ (-" ".length())) : r0;
        }
        return lIllIIlIlI[1];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIIlIIl[lIllIIlIlI[90]];
    }

    private static void lIIlIlllIllIl() {
        lIllIIlIIl = new String[lIllIIlIlI[103]];
        lIllIIlIIl[lIllIIlIlI[1]] = lIIlIlllIlIlI("NNRaAbPnPFuZU2PUwjgPD//WRLoibLbYmpS0/WuY+ydo0dTbYDxVlJmmocAHyhCa", "LshdV");
        lIllIIlIIl[lIllIIlIlI[0]] = lIIlIlllIlIll("0QuFmjSsIEStio1OGuVbGg==", "FgElQ");
        lIllIIlIIl[lIllIIlIlI[5]] = lIIlIlllIlIlI("x398dQuDtvzUocdpgcDycLNyScyGw4J4", "PtWKQ");
        lIllIIlIIl[lIllIIlIlI[9]] = lIIlIlllIlIll("Wk9A7+y5hze2ZC2VtAbJ0P2xpftkyK+U70rhTUr+RgobV0WZBOI09xmdq4DRDHNadBZ822y2qOU=", "LxNip");
        lIllIIlIIl[lIllIIlIlI[6]] = lIIlIlllIlIlI("uhQoQfEjjDy5QGtJFNW5mItNrmOrYcCgnDqANa2Y1EWkiQdBMFM8dtWPxmJoyKfZW4HmXMrdqdk=", "zwBPZ");
        lIllIIlIIl[lIllIIlIlI[14]] = lIIlIlllIlIlI("KD9ZCWtptu4=", "Zbbps");
        lIllIIlIIl[lIllIIlIlI[18]] = lIIlIlllIlIlI("2UQbYwCsepbjYaJlRjHBYw==", "zuBux");
        lIllIIlIIl[lIllIIlIlI[19]] = lIIlIlllIllII("OTwjJgA=", "vONGn");
        lIllIIlIIl[lIllIIlIlI[20]] = lIIlIlllIllII("Ch1ZExomHBxHEy0XDQ8bLQlZLlIgDxdHGiYCCUcLLBtZEBs3BkY=", "Cnygr");
        lIllIIlIIl[lIllIIlIlI[24]] = lIIlIlllIllII("JBInbTgFUzA9PBgWPzklCRY=", "jsQML");
        lIllIIlIIl[lIllIIlIlI[8]] = lIIlIlllIllII("PRQpNw==", "rdLYA");
        lIllIIlIIl[lIllIIlIlI[25]] = lIIlIlllIllII("BgoDOicpDhorJw==", "GzsHB");
        lIllIIlIIl[lIllIIlIlI[26]] = lIIlIlllIlIlI("a/VyPCnKpkLvgZYv92MfYDmTpMVAJ3Y8Nmpq8qKR0zz5oDItxuYNO1xBt5obIwYF", "yCCIv");
        lIllIIlIIl[lIllIIlIlI[27]] = lIIlIlllIlIll("edrT3nXWAT2rRZU0DsftKTBDnsTUNKwS47M3iAOEbzsL23HxT+1mDWWvsru31nG3fghsl+yzlb+JDb/NAWCfJA==", "RUbVC");
        lIllIIlIIl[lIllIIlIlI[28]] = lIIlIlllIlIll("nw8zqgRQTKxU6h5xqrJZVSHi5JuBSdcJ457nWcZdh5RvErhuqND3Lw==", "oHxRb");
        lIllIIlIIl[lIllIIlIlI[29]] = lIIlIlllIlIlI("/G/3or8vKBA90W2PH+fn3qgD6HJHXT8Lk2C3/lK/gX1vualP7eb5nmK2z7udIUuS", "hPeEW");
        lIllIIlIIl[lIllIIlIlI[30]] = lIIlIlllIlIll("rxwkh47TjzRXnXM4f1S1nTs+zOQZJxemyDCS5ikE/MSqkYWI4a2mEINRceEY+k3CrgPSgHTq3NSAat7ge0QfJ+WJJOg4oSLs", "icTwT");
        lIllIIlIIl[lIllIIlIlI[35]] = lIIlIlllIlIlI("CQLrkqgtw5gw7oI0uYMTfUfxxmpTHiMD", "cArHw");
        lIllIIlIIl[lIllIIlIlI[36]] = lIIlIlllIlIlI("xThtgH9AqVc=", "qmCMk");
        lIllIIlIIl[lIllIIlIlI[37]] = lIIlIlllIlIll("IJ8TSQ6SV5bVZ0aG4A1ODH/DN34GILGr", "dlZkm");
        lIllIIlIIl[lIllIIlIlI[38]] = lIIlIlllIllII("BTIXIywqNg4yLA==", "DBgQI");
        lIllIIlIIl[lIllIIlIlI[39]] = lIIlIlllIlIll("eJGZ7AdQCowzMn3jf3ycbQ==", "oqPrQ");
        lIllIIlIIl[lIllIIlIlI[44]] = lIIlIlllIlIlI("ZNlc9LZvP/KxWn8ZEbucgw==", "kLGFs");
        lIllIIlIIl[lIllIIlIlI[12]] = lIIlIlllIlIlI("6QbHH4OkXkA=", "lcztA");
        lIllIIlIIl[lIllIIlIlI[42]] = lIIlIlllIlIlI("QwMALwKooXmXzsxfwN6kI7JsrLZ1jeC9hhYEw6KS2zlLdVXT0yVhyg==", "jMVuL");
        lIllIIlIIl[lIllIIlIlI[62]] = lIIlIlllIlIlI("6yLP+Tb/+AilkiBRkR+0Jt8DEqyU/Edh", "DTyoj");
        lIllIIlIIl[lIllIIlIlI[67]] = lIIlIlllIlIll("lz8AgnodQzR9UaJRWugyHVbgbjk+DzfCZZpZuN8pXCK2pFjH5WggHA==", "BCMmD");
        lIllIIlIIl[lIllIIlIlI[69]] = lIIlIlllIllII("BDMseiM5ZnA0M3YyKzYy", "VFBZW");
        lIllIIlIIl[lIllIIlIlI[72]] = lIIlIlllIllII("NycnVBcKcj0cChc2aQAKCTc=", "eRItc");
        lIllIIlIIl[lIllIIlIlI[79]] = lIIlIlllIlIll("h/5R+zSJMEiAQVuic539dA==", "wpQJm");
        lIllIIlIIl[lIllIIlIlI[80]] = lIIlIlllIlIlI("Kwwg+95y+Zc=", "Dntrr");
        lIllIIlIIl[lIllIIlIlI[81]] = lIIlIlllIlIll("JM2kQ7C+KoPgAR7jtCKrjQ==", "NCGBe");
        lIllIIlIIl[lIllIIlIlI[82]] = lIIlIlllIllII("HwEWAw==", "OhuhD");
        lIllIIlIIl[lIllIIlIlI[90]] = lIIlIlllIlIlI("d0e4pltkpQKfhepPwdZsaPnyVyikzbeY", "QBDXQ");
        lIllIIlIIl[lIllIIlIlI[91]] = lIIlIlllIlIll("bnP7qdJNHCkPk1puRvBRsoaNd1ImcIUv", "HbxYU");
        lIllIIlIIl[lIllIIlIlI[92]] = lIIlIlllIllII("FDQQFggeJg==", "pAuza");
        lIllIIlIIl[lIllIIlIlI[93]] = lIIlIlllIllII("DjwUIiEELg==", "jIqNH");
        lIllIIlIIl[lIllIIlIlI[94]] = lIIlIlllIlIlI("kXAKdZ4OyHA=", "LcsiK");
        lIllIIlIIl[lIllIIlIlI[95]] = lIIlIlllIlIll("p1uQtVbqKvU=", "QzZkL");
        lIllIIlIIl[lIllIIlIlI[96]] = lIIlIlllIllII("JQ0YBgo=", "mhjdy");
        lIllIIlIIl[lIllIIlIlI[87]] = lIIlIlllIlIlI("vx5C7oXXLtY=", "ONJZU");
        lIllIIlIIl[lIllIIlIlI[98]] = lIIlIlllIlIll("iz88WOy9RwQ=", "NDrns");
        lIllIIlIIl[lIllIIlIlI[99]] = lIIlIlllIlIll("DoRb9AALMDY=", "geOyq");
        lIllIIlIIl[lIllIIlIlI[100]] = lIIlIlllIlIlI("XJOXvLiAjVU=", "qULFC");
        lIllIIlIIl[lIllIIlIlI[101]] = lIIlIlllIllII("BgE/AA==", "IqZnc");
        lIllIIlIIl[lIllIIlIlI[102]] = lIIlIlllIlIlI("7BIxoN13zwc=", "xxSKE");
    }

    private static boolean lIIllIIIIIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllIIIIlIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIIIIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e4, code lost:
        if (lIIllIIIIIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0017r.lIllIIlIlI[86]) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2 = new int[lIllIIlIlI[0]];
        iArr2[lIllIIlIlI[1]] = lIllIIlIlI[11];
        if (lIIllIIIIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIlIlI[11], lIllIIlIlI[0], C0004e.c(lIllIIlIlI[83], lIllIIlIlI[50])));
            "".length();
        }
        if (lIIllIIIIIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllIIlIIl[lIllIIlIlI[91]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIlIlI[84], lIllIIlIlI[14], lIllIIlIlI[85]));
            "".length();
        }
        int[] iArr3 = new int[lIllIIlIlI[0]];
        iArr3[lIllIIlIlI[1]] = lIllIIlIlI[7];
        if (lIIllIIIIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIllIIlIlI[0]];
            iArr4[lIllIIlIlI[1]] = lIllIIlIlI[7];
            if (lIIllIIIIIIll(Bank.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lIllIIlIlI[0]];
                iArr5[lIllIIlIlI[1]] = lIllIIlIlI[7];
            }
            iArr = new int[lIllIIlIlI[0]];
            iArr[lIllIIlIlI[1]] = lIllIIlIlI[10];
            if (lIIllIIIIIIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr6 = new int[lIllIIlIlI[0]];
                iArr6[lIllIIlIlI[1]] = lIllIIlIlI[10];
                if (!lIIllIIIIIIll(Bank.contains(iArr6) ? 1 : 0)) {
                    return;
                }
                int[] iArr7 = new int[lIllIIlIlI[0]];
                iArr7[lIllIIlIlI[1]] = lIllIIlIlI[10];
                if (!lIIllIIIIIlII(Bank.getFirst(iArr7).getQuantity(), lIllIIlIlI[29])) {
                    return;
                }
            }
            bp.add(new C0003d(lIllIIlIlI[10], lIllIIlIlI[87], lIllIIlIlI[88]));
            "".length();
        }
        bp.add(new C0003d(lIllIIlIlI[7], lIllIIlIlI[86], C0009j.bZ));
        "".length();
        iArr = new int[lIllIIlIlI[0]];
        iArr[lIllIIlIlI[1]] = lIllIIlIlI[10];
        if (lIIllIIIIIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIllIIlIlI[10], lIllIIlIlI[87], lIllIIlIlI[88]));
        "".length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean aV() {
        if (lIIllIIIIIIll(new WorldArea(lIllIIlIlI[40], lIllIIlIlI[41], lIllIIlIlI[36], lIllIIlIlI[42], lIllIIlIlI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIIIIlIlI(Players.getLocal().getWorldLocation().getX(), lIllIIlIlI[43])) {
            ?? r0 = lIllIIlIlI[0];
            "".length();
            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIlIlI[1];
    }

    private static boolean lIIllIIIIIlll(Object obj) {
        return obj != null;
    }

    private static void aW() {
        if (lIIllIIIIIlIl(aV() ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[44]];
            int[] iArr = new int[lIllIIlIlI[6]];
            iArr[lIllIIlIlI[1]] = lIllIIlIlI[45];
            iArr[lIllIIlIlI[0]] = lIllIIlIlI[46];
            iArr[lIllIIlIlI[5]] = lIllIIlIlI[47];
            iArr[lIllIIlIlI[9]] = lIllIIlIlI[48];
            if (lIIllIIIIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                Inventory.getAll(iArr).stream().forEach((v0) -> {
                    v0.drop();
                });
                Time.sleepTicks(lIllIIlIlI[0]);
                "".length();
            }
            TileObjects.getNearest(tileObject -> {
                if (lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[87]]) ? 1 : 0) && lIIllIIIIlIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIlIlI[97], lIllIIlIlI[60], lIllIIlIlI[1])), lIllIIlIlI[5])) {
                    ?? r0 = lIllIIlIlI[0];
                    "".length();
                    return (-" ".length()) != (-" ".length()) ? ((((103 + 139) - 120) + 52) ^ (((12 + 148) - 90) + 94)) & (((((22 + 14) - (-5)) + 87) ^ (((94 + 68) - 158) + 134)) ^ (-" ".length())) : r0;
                }
                return lIllIIlIlI[1];
            }).interact(lIllIIlIIl[lIllIIlIlI[12]]);
            Time.sleepUntil(() -> {
                return aV();
            }, C0004e.c(lIllIIlIlI[49], lIllIIlIlI[50]));
            "".length();
        }
        if (lIIllIIIIIIll(aV() ? 1 : 0)) {
            int[] iArr2 = new int[lIllIIlIlI[0]];
            iArr2[lIllIIlIlI[1]] = lIllIIlIlI[51];
            NPC nearest = NPCs.getNearest(iArr2);
            int[] iArr3 = new int[lIllIIlIlI[0]];
            iArr3[lIllIIlIlI[1]] = lIllIIlIlI[52];
            NPC nearest2 = NPCs.getNearest(iArr3);
            int[] iArr4 = new int[lIllIIlIlI[0]];
            iArr4[lIllIIlIlI[1]] = lIllIIlIlI[53];
            NPC nearest3 = NPCs.getNearest(iArr4);
            int[] iArr5 = new int[lIllIIlIlI[0]];
            iArr5[lIllIIlIlI[1]] = lIllIIlIlI[54];
            NPC nearest4 = NPCs.getNearest(iArr5);
            if (lIIllIIIIIIll(new WorldArea(lIllIIlIlI[55], lIllIIlIlI[56], lIllIIlIlI[14], lIllIIlIlI[14], lIllIIlIlI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIIIIIlll(nearest)) {
                WorldArea worldArea = new WorldArea(lIllIIlIlI[57], lIllIIlIlI[58], lIllIIlIlI[14], lIllIIlIlI[6], lIllIIlIlI[1]);
                if (lIIllIIIIIlIl(worldArea.contains(nearest) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[42]];
                    WorldPoint worldPoint = new WorldPoint(lIllIIlIlI[59], lIllIIlIlI[60], lIllIIlIlI[1]);
                    if (lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                        C0004e.c(worldPoint);
                        Time.sleepTicks(lIllIIlIlI[0]);
                        "".length();
                    }
                }
                if (lIIllIIIIIIll(worldArea.contains(nearest) ? 1 : 0)) {
                    WorldPoint worldPoint2 = new WorldPoint(lIllIIlIlI[59], lIllIIlIlI[61], lIllIIlIlI[1]);
                    if (lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[62]];
                        C0004e.c(worldPoint2);
                        Time.sleepTicks(lIllIIlIlI[0]);
                        "".length();
                    }
                }
            }
            WorldArea worldArea2 = new WorldArea(lIllIIlIlI[63], lIllIIlIlI[64], lIllIIlIlI[25], lIllIIlIlI[6], lIllIIlIlI[1]);
            WorldArea worldArea3 = new WorldArea(lIllIIlIlI[65], lIllIIlIlI[58], lIllIIlIlI[18], lIllIIlIlI[19], lIllIIlIlI[1]);
            WorldArea worldArea4 = new WorldArea(lIllIIlIlI[57], lIllIIlIlI[66], lIllIIlIlI[9], lIllIIlIlI[20], lIllIIlIlI[1]);
            WorldArea worldArea5 = new WorldArea(lIllIIlIlI[65], lIllIIlIlI[60], lIllIIlIlI[6], lIllIIlIlI[6], lIllIIlIlI[1]);
            if (!lIIllIIIIIlIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIllIIIIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea6 = new WorldArea(lIllIIlIlI[63], lIllIIlIlI[64], lIllIIlIlI[24], lIllIIlIlI[9], lIllIIlIlI[1]);
                if (lIIllIIIIIlll(nearest2) && lIIllIIIIIlll(nearest3) && lIIllIIIIIlll(nearest)) {
                    if (!lIIllIIIIIIll(worldArea6.contains(nearest2) ? 1 : 0) || lIIllIIIIIlIl(worldArea6.contains(nearest3) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[67]];
                    }
                    if (lIIllIIIIIIll(worldArea6.contains(nearest2) ? 1 : 0) && lIIllIIIIIIll(worldArea6.contains(nearest3) ? 1 : 0) && (!lIIllIIIIIlIl(worldArea4.contains(nearest) ? 1 : 0) || lIIllIIIIIIll(worldArea5.contains(nearest) ? 1 : 0))) {
                        WorldPoint worldPoint3 = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[68], lIllIIlIlI[1]);
                        if (lIIllIIIIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[69]];
                            C0004e.c(worldPoint3);
                            Time.sleepTicks(lIllIIlIlI[0]);
                            "".length();
                        }
                    }
                }
                if (lIIllIIIIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIIIIIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[68], lIllIIlIlI[1])) ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIllIIlIlI[70], lIllIIlIlI[71], lIllIIlIlI[1]);
                    if (lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[72]];
                        C0004e.c(worldPoint4);
                        Time.sleepTicks(lIllIIlIlI[0]);
                        "".length();
                    }
                }
            }
            WorldArea worldArea7 = new WorldArea(lIllIIlIlI[73], lIllIIlIlI[74], lIllIIlIlI[8], lIllIIlIlI[29], lIllIIlIlI[1]);
            WorldArea worldArea8 = new WorldArea(lIllIIlIlI[73], lIllIIlIlI[75], lIllIIlIlI[6], lIllIIlIlI[19], lIllIIlIlI[1]);
            if (lIIllIIIIIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllIIlIlI[70], lIllIIlIlI[71], lIllIIlIlI[1])) ? 1 : 0) && lIIllIIIIIlll(nearest4) && ((lIIllIIIIlIll(nearest4.getOrientation(), lIllIIlIlI[76]) && !lIIllIIIIIlII(nearest4.getWorldLocation().getX(), lIllIIlIlI[77])) || (lIIllIIIIlIll(nearest4.getOrientation(), lIllIIlIlI[78]) && lIIllIIIIIllI(nearest4.getWorldLocation().getX(), lIllIIlIlI[57])))) {
                WorldPoint worldPoint5 = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[56], lIllIIlIlI[1]);
                TileObject nearest5 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIllIIIIIIll(tileObject2.getName().contains(lIllIIlIIl[lIllIIlIlI[96]]) ? 1 : 0) && lIIllIIIIlIlI(tileObject2.getWorldLocation().distanceTo(worldPoint5), lIllIIlIlI[18])) {
                        ?? r0 = lIllIIlIlI[0];
                        "".length();
                        return (((25 ^ 30) ^ (136 ^ 187)) & (((((71 + 65) - 27) + 28) ^ (((141 + 3) - (-45)) + 0)) ^ (-" ".length()))) != 0 ? ((218 ^ 137) ^ (17 ^ 124)) & (((((80 + 140) - 110) + 79) ^ (((101 + 48) - 104) + 86)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIlIlI[1];
                });
                if (lIIllIIIIIlll(nearest5)) {
                    AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[79]];
                    nearest5.interact(lIllIIlIIl[lIllIIlIlI[80]]);
                    Time.sleepTicks(lIllIIlIlI[5]);
                    "".length();
                }
            }
            if (!lIIllIIIIIlIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIllIIIIIIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint6 = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[56], lIllIIlIlI[1]);
                TileObject nearest6 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIllIIIIIIll(tileObject3.getName().contains(lIllIIlIIl[lIllIIlIlI[95]]) ? 1 : 0) && lIIllIIIIlIlI(tileObject3.getWorldLocation().distanceTo(worldPoint6), lIllIIlIlI[18])) {
                        ?? r0 = lIllIIlIlI[0];
                        "".length();
                        return "  ".length() == ((80 ^ 87) ^ "   ".length()) ? ((((198 + 174) - 235) + 87) ^ (((71 + 66) - 132) + 172)) & (((241 ^ 191) ^ (140 ^ 147)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIlIlI[1];
                });
                if (lIIllIIIIIlll(nearest6)) {
                    AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[81]];
                    nearest6.interact(lIllIIlIIl[lIllIIlIlI[82]]);
                    Time.sleepTicks(lIllIIlIlI[5]);
                    "".length();
                }
            }
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            aU();
            "".length();
            if (" ".length() > "  ".length()) {
                return ((((77 + 125) - 158) + 174) ^ (((146 + 140) - 185) + 98)) & (((44 ^ 87) ^ (208 ^ 182)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIllIIlIlI[89];
    }

    private static boolean lIIllIIIIIlII(int i, int i2) {
        return i < i2;
    }

    private static void lIIllIIIIIIlI() {
        lIllIIlIlI = new int[104];
        lIllIIlIlI[0] = " ".length();
        lIllIIlIlI[1] = ((75 ^ 40) ^ (231 ^ 197)) & (((208 ^ 190) ^ (72 ^ 103)) ^ (-" ".length()));
        lIllIIlIlI[2] = (-29807) & 30079;
        lIllIIlIlI[3] = (88 ^ 81) ^ (5 ^ 98);
        lIllIIlIlI[4] = (-11284) & 16283;
        lIllIIlIlI[5] = "  ".length();
        lIllIIlIlI[6] = (((1 + 19) - (-51)) + 71) ^ (((87 + 82) - 109) + 78);
        lIllIIlIlI[7] = (-((-4945) & 6141)) & (-515) & 14335;
        lIllIIlIlI[8] = (((200 + 137) - 223) + 91) ^ (((109 + 104) - 49) + 35);
        lIllIIlIlI[9] = "   ".length();
        lIllIIlIlI[10] = (-((-10827) & 27371)) & (-8201) & 32751;
        lIllIIlIlI[11] = (-8198) & 10749;
        lIllIIlIlI[12] = 76 ^ 91;
        lIllIIlIlI[13] = (71 ^ 102) ^ (139 ^ 152);
        lIllIIlIlI[14] = 135 ^ 130;
        lIllIIlIlI[15] = (-8831) & 12159;
        lIllIIlIlI[16] = (-29191) & 32479;
        lIllIIlIlI[17] = (-((-18729) & 27065)) & (-16898) & 28415;
        lIllIIlIlI[18] = 186 ^ 188;
        lIllIIlIlI[19] = (((92 + 97) - 151) + 151) ^ (((127 + 93) - 69) + 35);
        lIllIIlIlI[20] = 140 ^ 132;
        lIllIIlIlI[21] = (-17039) & 20366;
        lIllIIlIlI[22] = (-29448) & 32767;
        lIllIIlIlI[23] = (-((-1539) & 22463)) & (-513) & 24575;
        lIllIIlIlI[24] = 106 ^ 99;
        lIllIIlIlI[25] = 38 ^ 45;
        lIllIIlIlI[26] = (50 ^ 70) ^ (14 ^ 118);
        lIllIIlIlI[27] = (98 ^ 47) ^ (194 ^ 130);
        lIllIIlIlI[28] = 53 ^ 59;
        lIllIIlIlI[29] = 72 ^ 71;
        lIllIIlIlI[30] = 121 ^ 105;
        lIllIIlIlI[31] = (-((-85) & 28799)) & (-1026) & 32623;
        lIllIIlIlI[32] = (-10421) & 15862;
        lIllIIlIlI[33] = (((158 + 145) - 220) + 80) ^ (((6 + 112) - 117) + 153);
        lIllIIlIlI[34] = " ".length() ^ (62 ^ 4);
        lIllIIlIlI[35] = (211 ^ 139) ^ (119 ^ 62);
        lIllIIlIlI[36] = (((81 + 12) - (-70)) + 9) ^ (((172 + 138) - 304) + 184);
        lIllIIlIlI[37] = (41 ^ 114) ^ (20 ^ 92);
        lIllIIlIlI[38] = (168 ^ 136) ^ (32 ^ 20);
        lIllIIlIlI[39] = 69 ^ 80;
        lIllIIlIlI[40] = (-((-14711) & 32247)) & (-4106) & 24527;
        lIllIIlIlI[41] = (-8324) & 13787;
        lIllIIlIlI[42] = (78 ^ 66) ^ (158 ^ 138);
        lIllIIlIlI[43] = (-9354) & 12255;
        lIllIIlIlI[44] = (40 ^ 56) ^ (149 ^ 147);
        lIllIIlIlI[45] = ((26 + 87) - 29) + 165;
        lIllIIlIlI[46] = (((((77 + 155) - 151) + 133) + (60 ^ 110)) - (228 ^ 181)) + (2 ^ 38);
        lIllIIlIlI[47] = ((128 + 251) - 350) + 224;
        lIllIIlIlI[48] = ((98 + 214) - 284) + 227;
        lIllIIlIlI[49] = (-31239) & 32638;
        lIllIIlIlI[50] = (-((-1274) & 21759)) & (-2177) & 24311;
        lIllIIlIlI[51] = (-(3 ^ 89)) & (-16385) & 22271;
        lIllIIlIlI[52] = (-" ".length()) & (-89) & 5887;
        lIllIIlIlI[53] = (-2374) & 8173;
        lIllIIlIlI[54] = (-((-1771) & 28655)) & (-67) & 32751;
        lIllIIlIlI[55] = (-((-4866) & 14127)) & (-16385) & 28543;
        lIllIIlIlI[56] = (-33) & 5499;
        lIllIIlIlI[57] = (-21549) & 24444;
        lIllIIlIlI[58] = (-2697) & 8171;
        lIllIIlIlI[59] = (-((-12565) & 13589)) & (-8323) & 12246;
        lIllIIlIlI[60] = (-((-4237) & 23213)) & (-130) & 24575;
        lIllIIlIlI[61] = (-((-21870) & 32623)) & (-16393) & 32621;
        lIllIIlIlI[62] = (125 ^ 42) ^ (226 ^ 172);
        lIllIIlIlI[63] = (-8193) & 11083;
        lIllIIlIlI[64] = (-((-153) & 26781)) & (-3) & 32110;
        lIllIIlIlI[65] = (-((-4225) & 29839)) & (-161) & 28671;
        lIllIIlIlI[66] = (-((-4157) & 15037)) & (-33) & 16383;
        lIllIIlIlI[67] = 66 ^ 88;
        lIllIIlIlI[68] = (-((-5153) & 13991)) & (-2065) & 16383;
        lIllIIlIlI[69] = 160 ^ 187;
        lIllIIlIlI[70] = (-((-2597) & 32439)) & (-34) & 32767;
        lIllIIlIlI[71] = (-((-9804) & 11983)) & (-8721) & 16383;
        lIllIIlIlI[72] = 85 ^ 73;
        lIllIIlIlI[73] = (-((-8651) & 25083)) & (-1) & 19319;
        lIllIIlIlI[74] = (-10373) & 15837;
        lIllIIlIlI[75] = (-(25 ^ 8)) & (-10249) & 15743;
        lIllIIlIlI[76] = (-22529) & 24064;
        lIllIIlIlI[77] = (-((-2861) & 15167)) & (-33) & 15231;
        lIllIIlIlI[78] = (-((-12333) & 32254)) & (-12289) & 32721;
        lIllIIlIlI[79] = (9 ^ 24) ^ (7 ^ 11);
        lIllIIlIlI[80] = (((32 + 38) - (-102)) + 16) ^ (((37 + 76) - 25) + 74);
        lIllIIlIlI[81] = (152 ^ 160) ^ (6 ^ 33);
        lIllIIlIlI[82] = (28 ^ 46) ^ (17 ^ 3);
        lIllIIlIlI[83] = (-27203) & 28642;
        lIllIIlIlI[84] = (-((-25357) & 29501)) & (-16388) & 32511;
        lIllIIlIlI[85] = (-4616) & 29615;
        lIllIIlIlI[86] = 129 ^ 189;
        lIllIIlIlI[87] = (68 ^ 29) ^ (203 ^ 186);
        lIllIIlIlI[88] = (-8315) & 9214;
        lIllIIlIlI[89] = 63 ^ 91;
        lIllIIlIlI[90] = 30 ^ 63;
        lIllIIlIlI[91] = 61 ^ 31;
        lIllIIlIlI[92] = (((103 + 93) - 86) + 62) ^ (((9 + 16) - (-14)) + 104);
        lIllIIlIlI[93] = (60 ^ 103) ^ (((25 + 3) - 10) + 109);
        lIllIIlIlI[94] = 60 ^ 25;
        lIllIIlIlI[95] = "   ".length() ^ (63 ^ 26);
        lIllIIlIlI[96] = (159 ^ 131) ^ (136 ^ 179);
        lIllIIlIlI[97] = (-((-2177) & 30889)) & (-1025) & 32639;
        lIllIIlIlI[98] = 144 ^ 185;
        lIllIIlIlI[99] = 140 ^ 166;
        lIllIIlIlI[100] = (159 ^ 167) ^ (53 ^ 38);
        lIllIIlIlI[101] = (1 ^ 67) ^ (242 ^ 156);
        lIllIIlIlI[102] = (2 ^ 31) ^ (90 ^ 106);
        lIllIIlIlI[103] = 88 ^ 118;
    }

    private static boolean lIIllIIIIIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIllIIIIIllI(Skills.getLevel(Skill.FARMING), lIllIIlIlI[91])) {
            ?? r0 = lIllIIlIlI[0];
            "".length();
            return (-((((48 + 58) - 57) + 107) ^ (((20 + 68) - 16) + 81))) >= 0 ? ((24 ^ 72) ^ " ".length()) & (((82 ^ 111) ^ (124 ^ 16)) ^ (-" ".length())) : r0;
        }
        return lIllIIlIlI[1];
    }

    private static boolean lIIllIIIIllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIIlIlI[1];
    }

    private static boolean lIIllIIIIlIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v180, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v211, types: [boolean] */
    public static void aU() {
        if (lIIllIIIIIIll(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIllIIIIIlII(bp.size(), lIllIIlIlI[0])) {
                System.out.println(lIllIIlIIl[lIllIIlIlI[1]]);
                bn = lIllIIlIlI[1];
            }
        }
        if (lIIllIIIIIlIl(bn ? 1 : 0)) {
            if (lIIllIIIIIlII(C0004e.j(lIllIIlIlI[2]), lIllIIlIlI[3])) {
                H.cH();
            }
            if (lIIllIIIIIllI(C0004e.j(lIllIIlIlI[2]), lIllIIlIlI[3])) {
                if (lIIllIIIIIlIl(al() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIllIIIIIlll(nearest) && lIIllIIIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[0]];
                        C0000a.a(nearest);
                    }
                    if (lIIllIIIIIlll(nearest) && lIIllIIIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIllIIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIllIIlIlI[4]);
                            "".length();
                        }
                        if (lIIllIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[5]];
                            if (lIIllIIIIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIllIIlIlI[6]);
                                "".length();
                            }
                            if (lIIllIIIIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIllIIlIlI[5]);
                                "".length();
                            }
                            int[] iArr = new int[lIllIIlIlI[0]];
                            iArr[lIllIIlIlI[1]] = lIllIIlIlI[7];
                            if (lIIllIIIIIIll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIllIIlIlI[0]];
                                iArr2[lIllIIlIlI[1]] = lIllIIlIlI[7];
                                if (lIIllIIIIIlII(Bank.getFirst(iArr2).getQuantity(), lIllIIlIlI[8])) {
                                    O();
                                    System.out.println(lIllIIlIIl[lIllIIlIlI[9]]);
                                    bn = lIllIIlIlI[0];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lIllIIlIlI[9]];
                            iArr3[lIllIIlIlI[1]] = lIllIIlIlI[10];
                            iArr3[lIllIIlIlI[0]] = lIllIIlIlI[7];
                            iArr3[lIllIIlIlI[5]] = lIllIIlIlI[11];
                            if (lIIllIIIIIlIl(C0004e.b(iArr3) ? 1 : 0)) {
                                O();
                                System.out.println(lIllIIlIIl[lIllIIlIlI[6]]);
                                bn = lIllIIlIlI[0];
                                return;
                            }
                            int[] iArr4 = new int[lIllIIlIlI[9]];
                            iArr4[lIllIIlIlI[1]] = lIllIIlIlI[10];
                            iArr4[lIllIIlIlI[0]] = lIllIIlIlI[7];
                            iArr4[lIllIIlIlI[5]] = lIllIIlIlI[11];
                            if (lIIllIIIIIIll(C0004e.b(iArr4) ? 1 : 0)) {
                                C0000a.a(lIllIIlIlI[10], lIllIIlIlI[8]);
                                C0000a.a(lIllIIlIlI[7], lIllIIlIlI[12]);
                                C0000a.a(lIllIIlIlI[11], lIllIIlIlI[0]);
                            }
                        }
                    }
                }
                if (lIIllIIIIIIll(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIllIIIIIlII(Movement.getRunEnergy(), lIllIIlIlI[13])) {
                    Inventory.getFirst(C0005f.aU).interact(lIllIIlIIl[lIllIIlIlI[14]]);
                    Time.sleepTicks(lIllIIlIlI[0]);
                    "".length();
                }
                if (lIIllIIIIIIll(al() ? 1 : 0)) {
                    C0004e.l(lIllIIlIlI[11]);
                    if (lIIllIIIIIlII(Vars.getBit(lIllIIlIlI[15]), lIllIIlIlI[0])) {
                        WorldPoint worldPoint = new WorldPoint(lIllIIlIlI[16], lIllIIlIlI[17], lIllIIlIlI[1]);
                        if (lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIlIlI[8])) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[18]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIllIIlIlI[0]);
                            "".length();
                        }
                        if (lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIlIlI[8])) {
                            String str = lIllIIlIIl[lIllIIlIlI[19]];
                            String[] strArr = new String[lIllIIlIlI[0]];
                            strArr[lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[20]];
                            C0006g.a(str, strArr);
                        }
                    }
                    if (lIIllIIIIlIll(Vars.getBit(lIllIIlIlI[15]), lIllIIlIlI[0]) && lIIllIIIIIlIl(Vars.getBit(lIllIIlIlI[21]))) {
                        WorldPoint worldPoint2 = new WorldPoint(lIllIIlIlI[22], lIllIIlIlI[23], lIllIIlIlI[1]);
                        if (lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIIlIlI[19])) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[24]];
                            Movement.walkTo(worldPoint2);
                            "".length();
                            Time.sleepTicks(lIllIIlIlI[0]);
                            "".length();
                        }
                        if (lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIIlIlI[19])) {
                            TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                                if (lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[100]]) ? 1 : 0)) {
                                    String[] strArr2 = new String[lIllIIlIlI[0]];
                                    strArr2[lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[101]];
                                    if (lIIllIIIIIIll(tileObject.hasAction(strArr2) ? 1 : 0)) {
                                        ?? r0 = lIllIIlIlI[0];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                                return lIllIIlIlI[1];
                            });
                            if (lIIllIIIIIlll(nearest2)) {
                                nearest2.interact(lIllIIlIIl[lIllIIlIlI[8]]);
                                Time.sleepTicks(lIllIIlIlI[6]);
                                "".length();
                            }
                            if (lIIllIIIIllII(nearest2)) {
                                String str2 = lIllIIlIIl[lIllIIlIlI[25]];
                                String[] strArr2 = new String[lIllIIlIlI[14]];
                                strArr2[lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[26]];
                                strArr2[lIllIIlIlI[0]] = lIllIIlIIl[lIllIIlIlI[27]];
                                strArr2[lIllIIlIlI[5]] = lIllIIlIIl[lIllIIlIlI[28]];
                                strArr2[lIllIIlIlI[9]] = lIllIIlIIl[lIllIIlIlI[29]];
                                strArr2[lIllIIlIlI[6]] = lIllIIlIIl[lIllIIlIlI[30]];
                                C0006g.a(str2, strArr2);
                            }
                        }
                    }
                    if (lIIllIIIIlIll(Vars.getBit(lIllIIlIlI[15]), lIllIIlIlI[0]) && lIIllIIIIlIll(Vars.getBit(lIllIIlIlI[21]), lIllIIlIlI[0])) {
                        WorldArea worldArea = new WorldArea(lIllIIlIlI[31], lIllIIlIlI[32], lIllIIlIlI[33], lIllIIlIlI[34], lIllIIlIlI[1]);
                        if (lIIllIIIIIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint3 = new WorldPoint(lIllIIlIlI[22], lIllIIlIlI[23], lIllIIlIlI[1]);
                            if (lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIllIIlIlI[19])) {
                                AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[35]];
                                Movement.walkTo(worldPoint3);
                                "".length();
                                Time.sleepTicks(lIllIIlIlI[0]);
                                "".length();
                            }
                            if (lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIllIIlIlI[19])) {
                                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                                    if (lIIllIIIIIIll(tileObject2.getName().contains(lIllIIlIIl[lIllIIlIlI[98]]) ? 1 : 0)) {
                                        String[] strArr3 = new String[lIllIIlIlI[0]];
                                        strArr3[lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[99]];
                                        if (lIIllIIIIIIll(tileObject2.hasAction(strArr3) ? 1 : 0)) {
                                            ?? r0 = lIllIIlIlI[0];
                                            "".length();
                                            return ((((30 + 68) - 7) + 44) ^ (((61 + 44) - 47) + 72)) <= 0 ? ((126 ^ 123) ^ (25 ^ 57)) & (((((67 + 141) - 151) + 106) ^ (((35 + 64) - (-17)) + 18)) ^ (-" ".length())) : r0;
                                        }
                                    }
                                    return lIllIIlIlI[1];
                                });
                                if (lIIllIIIIIlll(nearest3)) {
                                    nearest3.interact(lIllIIlIIl[lIllIIlIlI[36]]);
                                    Time.sleepTicks(lIllIIlIlI[6]);
                                    "".length();
                                }
                                if (lIIllIIIIllII(nearest3)) {
                                    AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[37]];
                                    String[] strArr3 = new String[lIllIIlIlI[0]];
                                    strArr3[lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[38]];
                                    NPCs.getNearest(strArr3).interact(lIllIIlIIl[lIllIIlIlI[39]]);
                                    Time.sleepTicks(lIllIIlIlI[6]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIllIIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            aW();
                        }
                    }
                }
            }
        }
    }
}
