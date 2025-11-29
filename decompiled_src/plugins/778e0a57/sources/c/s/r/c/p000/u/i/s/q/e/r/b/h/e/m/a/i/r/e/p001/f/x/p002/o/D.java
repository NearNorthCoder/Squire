package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.runelite.client.game.ItemVariationMapping;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Items;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.D  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/D.class */
public class D extends Items {
    private static final /* synthetic */ D bW;
    private static /* synthetic */ int[] lIlIIIllllIl;
    public static /* synthetic */ int bX;
    static final /* synthetic */ E bY;
    private static final /* synthetic */ D bV;
    private static /* synthetic */ String[] lIlIIIllllII;

    public static D bC() {
        return bW;
    }

    private static boolean llIlIlllIlllII(int i, int i2) {
        return i == i2;
    }

    public List<Item> bF() {
        return a(item -> {
            return lIlIIIllllIl[0];
        });
    }

    private static String llIlIlllIlIlll(String lllllllllllllllIllIllllIIIlIlllI, String lllllllllllllllIllIllllIIIlIllIl) {
        String lllllllllllllllIllIllllIIIlIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllllIIIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllllIIIlIllII = new StringBuilder();
        char[] lllllllllllllllIllIllllIIIlIlIll = lllllllllllllllIllIllllIIIlIllIl.toCharArray();
        int lllllllllllllllIllIllllIIIlIlIlI = lIlIIIllllIl[1];
        char[] charArray = lllllllllllllllIllIllllIIIlIlllI2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIllllIl[1];
        while (llIlIllllIIIIl(i, length)) {
            lllllllllllllllIllIllllIIIlIllII.append((char) (charArray[i] ^ lllllllllllllllIllIllllIIIlIlIll[lllllllllllllllIllIllllIIIlIlIlI % lllllllllllllllIllIllllIIIlIlIll.length]));
            "".length();
            lllllllllllllllIllIllllIIIlIlIlI++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIllllIIIlIllII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean bH() {
        if (llIlIlllIlllII(bI(), C0046u.bi().bL())) {
            ?? r0 = lIlIIIllllIl[0];
            "".length();
            return " ".length() < 0 ? ((117 ^ 78) ^ (193 ^ 198)) & (((((146 + 160) - 143) + 21) ^ (((29 + 80) - 63) + 86)) ^ (-" ".length())) : r0;
        }
        return lIlIIIllllIl[1];
    }

    protected D(int i) {
        super(i, item -> {
            return Boolean.valueOf((boolean) lIlIIIllllIl[0]);
        });
    }

    private static boolean llIlIlllIlllIl(Object obj) {
        return obj != null;
    }

    public static D bD() {
        return bV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean bG() {
        if (llIlIlllIllIll(bI())) {
            ?? r0 = lIlIIIllllIl[0];
            "".length();
            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIllllIl[1];
    }

    public List<Item> a(Predicate<Item> predicate) {
        return bW.all(predicate);
    }

    private static boolean llIlIlllIllllI(int i) {
        return i != 0;
    }

    private static void llIlIlllIllIIl() {
        lIlIIIllllII = new String[lIlIIIllllIl[15]];
        lIlIIIllllII[lIlIIIllllIl[1]] = llIlIlllIlIllI("vXsAdkuiFsYORWO+gb+4yJXC3oOi7api", "WHuBn");
        lIlIIIllllII[lIlIIIllllIl[0]] = llIlIlllIlIlll("PDAkPxA=", "oDKMu");
        lIlIIIllllII[lIlIIIllllIl[7]] = llIlIlllIllIII("xZHP+bqh/fo=", "GKLux");
        lIlIIIllllII[lIlIIIllllIl[8]] = llIlIlllIlIlll("KQ0eLyJWGw==", "qhlFA");
        lIlIIIllllII[lIlIIIllllIl[9]] = llIlIlllIlIlll("HjMhOjBhJQ==", "FVSSS");
        lIlIIIllllII[lIlIIIllllIl[6]] = llIlIlllIllIII("08hpXQ7o9FhbnxwVF8gwKA==", "adXth");
        lIlIIIllllII[lIlIIIllllIl[10]] = llIlIlllIlIllI("xkkBsZ4f/wViK2YcnEitZg==", "EdEzX");
        lIlIIIllllII[lIlIIIllllIl[11]] = llIlIlllIlIlll("FRgoIh81Dyk=", "ZnMPs");
    }

    private static boolean llIlIllllIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIlllIlllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bJ() {
        Widget widget = Widgets.get(lIlIIIllllIl[2], lIlIIIllllIl[0], lIlIIIllllIl[3]);
        if (llIlIlllIlllIl(widget) && llIlIlllIllllI(widget.isVisible() ? 1 : 0)) {
            ?? r0 = lIlIIIllllIl[0];
            "".length();
            return 0 != 0 ? ((46 ^ 22) ^ "   ".length()) & (((((44 + 7) - (-10)) + 72) ^ (((163 + 177) - 183) + 33)) ^ (-" ".length())) : r0;
        }
        return lIlIIIllllIl[1];
    }

    public int bI() {
        return C0046u.bi().bL() - bF().size();
    }

    static {
        llIlIlllIllIlI();
        llIlIlllIllIIl();
        bV = new D(lIlIIIllllIl[12]);
        bW = new D(lIlIIIllllIl[13]);
        bX = lIlIIIllllIl[14];
        bY = new E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    public boolean e(int[] iArr) {
        List<Item> bF = E.bF();
        List<Item> d = d(iArr);
        System.out.println("curr: " + bF.size() + " needed: " + d.size());
        bF.removeAll(d);
        "".length();
        bF.removeIf(item -> {
            if (llIlIlllIllIll(item.getName().contains(lIlIIIllllII[lIlIIIllllIl[9]]) ? 1 : 0) && llIlIlllIllIll(item.getName().contains(lIlIIIllllII[lIlIIIllllIl[6]]) ? 1 : 0) && llIlIlllIllIll(item.getName().contains(lIlIIIllllII[lIlIIIllllIl[10]]) ? 1 : 0) && !llIlIlllIllllI(item.getName().contains(lIlIIIllllII[lIlIIIllllIl[11]]) ? 1 : 0)) {
                return lIlIIIllllIl[1];
            }
            ?? r0 = lIlIIIllllIl[0];
            "".length();
            return " ".length() < 0 ? ((115 ^ 97) ^ (149 ^ 180)) & (((226 ^ 136) ^ (221 ^ 132)) ^ (-" ".length())) : r0;
        });
        "".length();
        for (Item item2 : bF) {
            if (llIlIlllIlllIl(item2)) {
                System.out.println("ItemID: " + item2.getId() + " | name: " + item2.getName() + " | actions: " + Arrays.toString(item2.getActions()));
            }
            "".length();
            if (((192 ^ 134) ^ (118 ^ 52)) == "   ".length()) {
                return ((36 ^ 102) ^ (140 ^ 134)) & (((((228 + 141) - 208) + 92) ^ (((134 + 37) - 163) + 173)) ^ (-" ".length()));
            }
        }
        if (llIlIlllIllllI(bF.isEmpty() ? 1 : 0)) {
            Item b = E.b(item3 -> {
                return item3.getName().contains(lIlIIIllllII[lIlIIIllllIl[8]]);
            });
            if (llIlIlllIlllll(b)) {
                System.out.println(lIlIIIllllII[lIlIIIllllIl[1]]);
                return lIlIIIllllIl[1];
            }
            b.interact(lIlIIIllllII[lIlIIIllllIl[0]]);
            return lIlIIIllllIl[0];
        }
        int i = lIlIIIllllIl[1];
        while (llIlIllllIIIIl(i, lIlIIIllllIl[6])) {
            Item item4 = bF.get(i);
            if (llIlIlllIlllll(item4)) {
                "".length();
                if ("   ".length() <= 0) {
                    return ((((140 + 61) - 109) + 122) ^ (((126 + 33) - 83) + 107)) & (((127 ^ 62) ^ (80 ^ 112)) ^ (-" ".length()));
                }
            } else {
                item4.interact(lIlIIIllllII[lIlIIIllllIl[7]]);
                System.out.println("Item: " + item4.getName() + " | id: " + item4.getId() + " | interacts: " + Arrays.toString(item4.getActions()));
            }
            i++;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIIIllllIl[0];
    }

    private static String llIlIlllIlIllI(String lllllllllllllllIllIllllIIlIIlIll, String lllllllllllllllIllIllllIIlIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIllllIl[15]), "DES");
            Cipher lllllllllllllllIllIllllIIlIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIllIllllIIlIIllIl.init(lIlIIIllllIl[7], secretKeySpec);
            return new String(lllllllllllllllIllIllllIIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllllIIlIIllII) {
            lllllllllllllllIllIllllIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllllIIIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIlIlllIllIII(String lllllllllllllllIllIllllIIIlllllI, String lllllllllllllllIllIllllIIIllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIllllIl[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllllIIIllllll) {
            lllllllllllllllIllIllllIIIllllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllllIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    public List<Item> c(int[] iArr) {
        if (llIlIllllIIIII(Game.getState(), GameState.LOGGED_IN)) {
            ArrayList arrayList = new ArrayList();
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
            return arrayList;
        }
        return a(item -> {
            return IntStream.of(iArr).filter(i -> {
                if (llIlIllllIIIlI(i, lIlIIIllllIl[0])) {
                    ?? r0 = lIlIIIllllIl[0];
                    "".length();
                    return "   ".length() <= 0 ? ((112 ^ 1) ^ (100 ^ 40)) & (((243 ^ 156) ^ (216 ^ 138)) ^ (-" ".length())) : r0;
                }
                return lIlIIIllllIl[1];
            }).anyMatch(i2 -> {
                return ItemVariationMapping.getVariations(ItemVariationMapping.map(i2)).contains(Integer.valueOf(item.getId()));
            });
        });
    }

    private static boolean llIlIlllIllIll(int i) {
        return i == 0;
    }

    private static void llIlIlllIllIlI() {
        lIlIIIllllIl = new int[16];
        lIlIIIllllIl[0] = " ".length();
        lIlIIIllllIl[1] = (120 ^ 119) & ((139 ^ 132) ^ (-1));
        lIlIIIllllIl[2] = (-((-17545) & 24249)) & (-1025) & 7999;
        lIlIIIllllIl[3] = 128 ^ 139;
        lIlIIIllllIl[4] = 99 ^ 90;
        lIlIIIllllIl[5] = -" ".length();
        lIlIIIllllIl[6] = 166 ^ 163;
        lIlIIIllllIl[7] = "  ".length();
        lIlIIIllllIl[8] = "   ".length();
        lIlIIIllllIl[9] = 160 ^ 164;
        lIlIIIllllIl[10] = 67 ^ 69;
        lIlIIIllllIl[11] = 80 ^ 87;
        lIlIIIllllIl[12] = (-((-4623) & 23439)) & (-1026) & 20423;
        lIlIIIllllIl[13] = (-57) & 639;
        lIlIIIllllIl[14] = (-((-1097) & 27853)) & (-5666) & 17792687;
        lIlIIIllllIl[15] = (((38 + 166) - 120) + 116) ^ (((13 + 13) - 4) + 170);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bK() {
        int i;
        Widget widget = Static.getClient().getWidget(bX);
        if (llIlIlllIlllIl(widget) && !llIlIlllIllIll(widget.isVisible() ? 1 : 0)) {
            widget.interact(lIlIIIllllIl[0], lIlIIIllllIl[4], lIlIIIllllIl[5], bX);
            return lIlIIIllllIl[0];
        }
        PrintStream printStream = System.out;
        if (llIlIlllIlllll(widget)) {
            i = lIlIIIllllIl[0];
            "".length();
            if ((((236 ^ 137) ^ (219 ^ 131)) & (((140 ^ 182) ^ (86 ^ 81)) ^ (-" ".length()))) != 0) {
                return ((251 ^ 198) ^ (25 ^ 45)) & (((196 ^ 189) ^ (252 ^ 140)) ^ (-" ".length()));
            }
        } else {
            i = lIlIIIllllIl[1];
        }
        printStream.println("Cant see deposit all" + i);
        return lIlIIIllllIl[1];
    }

    public ItemQuery bE() {
        return a(this::bF);
    }

    public ItemQuery a(Supplier<List<Item>> supplier) {
        return new ItemQuery(supplier);
    }

    public List<Item> d(int[] iArr) {
        if (llIlIllllIIIII(Game.getState(), GameState.LOGGED_IN)) {
            ArrayList arrayList = new ArrayList();
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
            return arrayList;
        }
        return E.a(item -> {
            return IntStream.of(iArr).filter(i -> {
                if (llIlIllllIIIlI(i, lIlIIIllllIl[0])) {
                    ?? r0 = lIlIIIllllIl[0];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIllllIl[1];
            }).anyMatch(i2 -> {
                return ItemVariationMapping.getVariations(ItemVariationMapping.map(i2)).contains(Integer.valueOf(item.getId()));
            });
        });
    }
}
