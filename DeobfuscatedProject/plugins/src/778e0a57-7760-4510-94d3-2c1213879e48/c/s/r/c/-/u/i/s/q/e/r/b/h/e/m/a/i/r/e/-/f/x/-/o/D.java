/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.game.ItemVariationMapping
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Items
 *  net.unethicalite.api.query.items.ItemQuery
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.E;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
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

public class D
extends Items {
    private static final /* synthetic */ D bW;
    private static /* synthetic */ int[] lIlIIIllllIl;
    public static /* synthetic */ int bX;
    static final /* synthetic */ E bY;
    private static final /* synthetic */ D bV;
    private static /* synthetic */ String[] lIlIIIllllII;

    public static D bC() {
        return bW;
    }

    private static boolean llIlIlllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    public List<Item> bF() {
        return this.a((Item item) -> lIlIIIllllIl[0]);
    }

    private static String llIlIlllIlIlll(String lllllllllllllllIllIllllIIIlIlIIl, String lllllllllllllllIllIllllIIIlIlIII) {
        lllllllllllllllIllIllllIIIlIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIllIllllIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllllIIIlIllII = new StringBuilder();
        char[] lllllllllllllllIllIllllIIIlIlIll = lllllllllllllllIllIllllIIIlIlIII.toCharArray();
        int lllllllllllllllIllIllllIIIlIlIlI = lIlIIIllllIl[1];
        char[] lllllllllllllllIllIllllIIIlIIlII = lllllllllllllllIllIllllIIIlIlIIl.toCharArray();
        int lllllllllllllllIllIllllIIIlIIIll = lllllllllllllllIllIllllIIIlIIlII.length;
        int lllllllllllllllIllIllllIIIlIIIlI = lIlIIIllllIl[1];
        while (D.llIlIllllIIIIl(lllllllllllllllIllIllllIIIlIIIlI, lllllllllllllllIllIllllIIIlIIIll)) {
            char lllllllllllllllIllIllllIIIlIllll = lllllllllllllllIllIllllIIIlIIlII[lllllllllllllllIllIllllIIIlIIIlI];
            lllllllllllllllIllIllllIIIlIllII.append((char)(lllllllllllllllIllIllllIIIlIllll ^ lllllllllllllllIllIllllIIIlIlIll[lllllllllllllllIllIllllIIIlIlIlI % lllllllllllllllIllIllllIIIlIlIll.length]));
            "".length();
            ++lllllllllllllllIllIllllIIIlIlIlI;
            ++lllllllllllllllIllIllllIIIlIIIlI;
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllllIIIlIllII);
    }

    public boolean bH() {
        boolean bl2;
        if (D.llIlIlllIlllII(this.bI(), u.bi().bL())) {
            bl2 = lIlIIIllllIl[0];
            "".length();
            if (" ".length() < 0) {
                return ((0x75 ^ 0x4E ^ (0xC1 ^ 0xC6)) & (146 + 160 - 143 + 21 ^ 29 + 80 - 63 + 86 ^ -" ".length())) != 0;
            }
        } else {
            bl2 = lIlIIIllllIl[1];
        }
        return bl2;
    }

    protected D(int n2) {
        super(n2, item -> lIlIIIllllIl[0]);
    }

    private static boolean llIlIlllIlllIl(Object object) {
        return object != null;
    }

    public static D bD() {
        return bV;
    }

    public boolean bG() {
        boolean bl2;
        if (D.llIlIlllIllIll(this.bI())) {
            bl2 = lIlIIIllllIl[0];
            "".length();
            if (" ".length() == 0) {
                return ((0xAE ^ 0xBE) & ~(0x2D ^ 0x3D)) != 0;
            }
        } else {
            bl2 = lIlIIIllllIl[1];
        }
        return bl2;
    }

    public List<Item> a(Predicate<Item> predicate) {
        return bW.all(predicate);
    }

    private static boolean llIlIlllIllllI(int n2) {
        return n2 != 0;
    }

    private static void llIlIlllIllIIl() {
        lIlIIIllllII = new String[lIlIIIllllIl[15]];
        D.lIlIIIllllII[D.lIlIIIllllIl[1]] = D.llIlIlllIlIllI("vXsAdkuiFsYORWO+gb+4yJXC3oOi7api", "WHuBn");
        D.lIlIIIllllII[D.lIlIIIllllIl[0]] = D.llIlIlllIlIlll("PDAkPxA=", "oDKMu");
        D.lIlIIIllllII[D.lIlIIIllllIl[7]] = D.llIlIlllIllIII("xZHP+bqh/fo=", "GKLux");
        D.lIlIIIllllII[D.lIlIIIllllIl[8]] = D.llIlIlllIlIlll("KQ0eLyJWGw==", "qhlFA");
        D.lIlIIIllllII[D.lIlIIIllllIl[9]] = D.llIlIlllIlIlll("HjMhOjBhJQ==", "FVSSS");
        D.lIlIIIllllII[D.lIlIIIllllIl[6]] = D.llIlIlllIllIII("08hpXQ7o9FhbnxwVF8gwKA==", "adXth");
        D.lIlIIIllllII[D.lIlIIIllllIl[10]] = D.llIlIlllIlIllI("xkkBsZ4f/wViK2YcnEitZg==", "EdEzX");
        D.lIlIIIllllII[D.lIlIIIllllIl[11]] = D.llIlIlllIlIlll("FRgoIh81Dyk=", "ZnMPs");
    }

    private static boolean llIlIllllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlllIlllll(Object object) {
        return object == null;
    }

    public static boolean bJ() {
        int n2;
        Widget widget = Widgets.get((int)lIlIIIllllIl[2], (int)lIlIIIllllIl[0], (int)lIlIIIllllIl[3]);
        if (D.llIlIlllIlllIl(widget) && D.llIlIlllIllllI(widget.isVisible() ? 1 : 0)) {
            n2 = lIlIIIllllIl[0];
            "".length();
            if (null != null) {
                return ((0x2E ^ 0x16 ^ "   ".length()) & (44 + 7 - -10 + 72 ^ 163 + 177 - 183 + 33 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIlIIIllllIl[1];
        }
        return n2 != 0;
    }

    public int bI() {
        return u.bi().bL() - this.bF().size();
    }

    static {
        D.llIlIlllIllIlI();
        D.llIlIlllIllIIl();
        bV = new D(lIlIIIllllIl[12]);
        bW = new D(lIlIIIllllIl[13]);
        bX = lIlIIIllllIl[14];
        bY = new E();
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(int[] nArray) {
        void lllllllllllllllIllIllllIIlIlllII;
        Item lllllllllllllllIllIllllIIlIllIIl;
        List<Item> list = E.bF();
        List<Item> list2 = this.d(nArray);
        System.out.println("curr: " + list.size() + " needed: " + list2.size());
        list.removeAll(list2);
        "".length();
        list.removeIf(item -> {
            int n2;
            if (!D.llIlIlllIllIll(item.getName().contains(lIlIIIllllII[lIlIIIllllIl[9]]) ? 1 : 0) || !D.llIlIlllIllIll(item.getName().contains(lIlIIIllllII[lIlIIIllllIl[6]]) ? 1 : 0) || !D.llIlIlllIllIll(item.getName().contains(lIlIIIllllII[lIlIIIllllIl[10]]) ? 1 : 0) || D.llIlIlllIllllI(item.getName().contains(lIlIIIllllII[lIlIIIllllIl[11]]) ? 1 : 0)) {
                n2 = lIlIIIllllIl[0];
                "".length();
                if (" ".length() < 0) {
                    return ((0x73 ^ 0x61 ^ (0x95 ^ 0xB4)) & (0xE2 ^ 0x88 ^ (0xDD ^ 0x84) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIIllllIl[1];
            }
            return n2 != 0;
        });
        "".length();
        Item lllllllllllllllIllIllllIIlIllIlI22 = list.iterator();
        while (D.llIlIlllIllllI(lllllllllllllllIllIllllIIlIllIlI22.hasNext() ? 1 : 0)) {
            lllllllllllllllIllIllllIIlIllIIl = lllllllllllllllIllIllllIIlIllIlI22.next();
            if (D.llIlIlllIlllIl(lllllllllllllllIllIllllIIlIllIIl)) {
                System.out.println("ItemID: " + lllllllllllllllIllIllllIIlIllIIl.getId() + " | name: " + lllllllllllllllIllIllllIIlIllIIl.getName() + " | actions: " + Arrays.toString(lllllllllllllllIllIllllIIlIllIIl.getActions()));
            }
            "".length();
            if ((0xC0 ^ 0x86 ^ (0x76 ^ 0x34)) != "   ".length()) continue;
            return ((0x24 ^ 0x66 ^ (0x8C ^ 0x86)) & (228 + 141 - 208 + 92 ^ 134 + 37 - 163 + 173 ^ -" ".length())) != 0;
        }
        if (D.llIlIlllIllllI(lllllllllllllllIllIllllIIlIlllII.isEmpty() ? 1 : 0)) {
            lllllllllllllllIllIllllIIlIllIlI22 = E.b(item -> item.getName().contains(lIlIIIllllII[lIlIIIllllIl[8]]));
            if (D.llIlIlllIlllll(lllllllllllllllIllIllllIIlIllIlI22)) {
                System.out.println(lIlIIIllllII[lIlIIIllllIl[1]]);
                return lIlIIIllllIl[1];
            }
            lllllllllllllllIllIllllIIlIllIlI22.interact(lIlIIIllllII[lIlIIIllllIl[0]]);
            return lIlIIIllllIl[0];
        }
        int lllllllllllllllIllIllllIIlIllIlI22 = lIlIIIllllIl[1];
        while (D.llIlIllllIIIIl(lllllllllllllllIllIllllIIlIllIlI22, lIlIIIllllIl[6])) {
            lllllllllllllllIllIllllIIlIllIIl = (Item)lllllllllllllllIllIllllIIlIlllII.get(lllllllllllllllIllIllllIIlIllIlI22);
            if (D.llIlIlllIlllll(lllllllllllllllIllIllllIIlIllIIl)) {
                "".length();
                if ("   ".length() <= 0) {
                    return ((140 + 61 - 109 + 122 ^ 126 + 33 - 83 + 107) & (0x7F ^ 0x3E ^ (0x50 ^ 0x70) ^ -" ".length())) != 0;
                }
            } else {
                lllllllllllllllIllIllllIIlIllIIl.interact(lIlIIIllllII[lIlIIIllllIl[7]]);
                System.out.println("Item: " + lllllllllllllllIllIllllIIlIllIIl.getName() + " | id: " + lllllllllllllllIllIllllIIlIllIIl.getId() + " | interacts: " + Arrays.toString(lllllllllllllllIllIllllIIlIllIIl.getActions()));
            }
            ++lllllllllllllllIllIllllIIlIllIlI22;
            "".length();
            if ("   ".length() > "  ".length()) continue;
            return ((0xB0 ^ 0xBD) & ~(2 ^ 0xF)) != 0;
        }
        return lIlIIIllllIl[0];
    }

    private static String llIlIlllIlIllI(String lllllllllllllllIllIllllIIlIIlIll, String lllllllllllllllIllIllllIIlIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIllIllllIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllIIlIIlIII.getBytes(StandardCharsets.UTF_8)), lIlIIIllllIl[15]), "DES");
            Cipher lllllllllllllllIllIllllIIlIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIllIllllIIlIIllIl.init(lIlIIIllllIl[7], lllllllllllllllIllIllllIIlIIlllI);
            return new String(lllllllllllllllIllIllllIIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllllIIlIIllII) {
            lllllllllllllllIllIllllIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIlllIllIII(String lllllllllllllllIllIllllIIIllllII, String lllllllllllllllIllIllllIIIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllllIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllllIIlIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllllIIlIIIIII.init(lIlIIIllllIl[7], lllllllllllllllIllIllllIIlIIIIIl);
            return new String(lllllllllllllllIllIllllIIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllllIIIllllll) {
            lllllllllllllllIllIllllIIIllllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllllIIIII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public List<Item> c(int[] nArray) {
        ArrayList<Item> arrayList;
        if (D.llIlIllllIIIII(Game.getState(), GameState.LOGGED_IN)) {
            arrayList = new ArrayList();
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        } else {
            void lllllllllllllllIllIllllIIllIIlll;
            D lllllllllllllllIllIllllIIllIlIII;
            arrayList = lllllllllllllllIllIllllIIllIlIII.a(arg_0 -> D.b((int[])lllllllllllllllIllIllllIIllIIlll, arg_0));
        }
        return arrayList;
    }

    private static boolean llIlIlllIllIll(int n2) {
        return n2 == 0;
    }

    private static /* synthetic */ boolean b(int[] nArray, Item item) {
        return IntStream.of(nArray).filter(n2 -> {
            boolean bl2;
            if (D.llIlIllllIIIlI(n2, lIlIIIllllIl[0])) {
                bl2 = lIlIIIllllIl[0];
                "".length();
                if ("   ".length() <= 0) {
                    return ((0x70 ^ 1 ^ (0x64 ^ 0x28)) & (0xF3 ^ 0x9C ^ (0xD8 ^ 0x8A) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = lIlIIIllllIl[1];
            }
            return bl2;
        }).anyMatch(n2 -> ItemVariationMapping.getVariations((int)ItemVariationMapping.map((int)n2)).contains(item.getId()));
    }

    private static void llIlIlllIllIlI() {
        lIlIIIllllIl = new int[16];
        D.lIlIIIllllIl[0] = " ".length();
        D.lIlIIIllllIl[1] = (0x78 ^ 0x77) & ~(0x8B ^ 0x84);
        D.lIlIIIllllIl[2] = -(0xFFFFBB77 & 0x5EB9) & (0xFFFFFBFF & 0x1F3F);
        D.lIlIIIllllIl[3] = 0x80 ^ 0x8B;
        D.lIlIIIllllIl[4] = 0x63 ^ 0x5A;
        D.lIlIIIllllIl[5] = -" ".length();
        D.lIlIIIllllIl[6] = 0xA6 ^ 0xA3;
        D.lIlIIIllllIl[7] = "  ".length();
        D.lIlIIIllllIl[8] = "   ".length();
        D.lIlIIIllllIl[9] = 0xA0 ^ 0xA4;
        D.lIlIIIllllIl[10] = 0x43 ^ 0x45;
        D.lIlIIIllllIl[11] = 0x50 ^ 0x57;
        D.lIlIIIllllIl[12] = -(0xFFFFEDF1 & 0x5B8F) & (0xFFFFFBFE & 0x4FC7);
        D.lIlIIIllllIl[13] = 0xFFFFFFC7 & 0x27F;
        D.lIlIIIllllIl[14] = -(0xFFFFFBB7 & 0x6CCD) & (0xFFFFE9DE & 0x10F7EAF);
        D.lIlIIIllllIl[15] = 38 + 166 - 120 + 116 ^ 13 + 13 - 4 + 170;
    }

    private static /* synthetic */ boolean a(int[] nArray, Item item) {
        return IntStream.of(nArray).filter(n2 -> {
            boolean bl2;
            if (D.llIlIllllIIIlI(n2, lIlIIIllllIl[0])) {
                bl2 = lIlIIIllllIl[0];
                "".length();
                if (null != null) {
                    return ((0x5B ^ 0x6D) & ~(0x85 ^ 0xB3)) != 0;
                }
            } else {
                bl2 = lIlIIIllllIl[1];
            }
            return bl2;
        }).anyMatch(n2 -> ItemVariationMapping.getVariations((int)ItemVariationMapping.map((int)n2)).contains(item.getId()));
    }

    /*
     * WARNING - void declaration
     */
    public static boolean bK() {
        Widget widget = Static.getClient().getWidget(bX);
        if (!D.llIlIlllIlllIl(widget) || D.llIlIlllIllIll(widget.isVisible() ? 1 : 0)) {
            boolean bl2;
            void lllllllllllllllIllIllllIIllIlIll;
            if (D.llIlIlllIlllll(lllllllllllllllIllIllllIIllIlIll)) {
                bl2 = lIlIIIllllIl[0];
                "".length();
                if (((0xEC ^ 0x89 ^ (0xDB ^ 0x83)) & (0x8C ^ 0xB6 ^ (0x56 ^ 0x51) ^ -" ".length())) != 0) {
                    return ((0xFB ^ 0xC6 ^ (0x19 ^ 0x2D)) & (0xC4 ^ 0xBD ^ (0xFC ^ 0x8C) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = lIlIIIllllIl[1];
            }
            System.out.println("Cant see deposit all" + bl2);
            return lIlIIIllllIl[1];
        }
        widget.interact(lIlIIIllllIl[0], lIlIIIllllIl[4], lIlIIIllllIl[5], bX);
        return lIlIIIllllIl[0];
    }

    public ItemQuery bE() {
        return this.a(this::bF);
    }

    public ItemQuery a(Supplier<List<Item>> supplier) {
        return new ItemQuery(supplier);
    }

    /*
     * WARNING - void declaration
     */
    public List<Item> d(int[] nArray) {
        ArrayList<Item> arrayList;
        if (D.llIlIllllIIIII(Game.getState(), GameState.LOGGED_IN)) {
            arrayList = new ArrayList();
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        } else {
            void lllllllllllllllIllIllllIIllIIlIl;
            arrayList = E.a(arg_0 -> D.a((int[])lllllllllllllllIllIllllIIllIIlIl, arg_0));
        }
        return arrayList;
    }
}

