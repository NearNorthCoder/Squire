package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/b.class */
public class C0001b {
    public static final /* synthetic */ WorldPoint J;
    public static /* synthetic */ List<Integer> K;
    public static /* synthetic */ List<Integer> M;
    private static /* synthetic */ int[] lIllIllI;
    public static /* synthetic */ List<Integer> L;
    private static /* synthetic */ String[] lIllIIll;

    public static void g() {
        Widget widget = Widgets.get(lIllIllI[10], lIllIllI[8], lIllIllI[27]);
        if (lIIllIIlIII(widget)) {
            widget.interact(lIllIIll[lIllIllI[28]]);
            Time.sleepTicks(lIllIllI[8]);
            "".length();
        }
    }

    private static boolean lIIlIllllll(int i) {
        return i == 0;
    }

    private static boolean lIIllIIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static String lIIlIlIlIll(String lIllIIlIlIlllIl, String lIllIIlIlIlllII) {
        try {
            SecretKeySpec lIllIIlIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlIlIlllII.getBytes(StandardCharsets.UTF_8)), lIllIllI[28]), "DES");
            Cipher lIllIIlIlIlllll = Cipher.getInstance("DES");
            lIllIIlIlIlllll.init(lIllIllI[8], lIllIIlIllIIIII);
            return new String(lIllIIlIlIlllll.doFinal(Base64.getDecoder().decode(lIllIIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlIlIllllI) {
            lIllIIlIlIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIIlIl(int i, int i2) {
        return i != i2;
    }

    static {
        lIIlIlllllI();
        lIIlIlIlllI();
        J = new WorldPoint(lIllIllI[30], lIllIllI[31], lIllIllI[0]);
        K = new ArrayList();
        L = new ArrayList();
        M = new ArrayList();
    }

    private static boolean lIIllIIIIll(int i, int i2) {
        return i > i2;
    }

    private static void lIIlIlllllI() {
        lIllIllI = new int[33];
        lIllIllI[0] = ((6 ^ 109) ^ (168 ^ 144)) & (((172 ^ 142) ^ (15 ^ 126)) ^ (-" ".length()));
        lIllIllI[1] = " ".length();
        lIllIllI[2] = (-3101) & 4095;
        lIllIllI[3] = "  ".length() ^ (35 ^ 43);
        lIllIllI[4] = "   ".length();
        lIllIllI[5] = (-((-8713) & 26155)) & (-86) & 22527;
        lIllIllI[6] = (-16441) & 24447;
        lIllIllI[7] = (((56 + 114) - 131) + 103) ^ (((46 + 24) - 0) + 68);
        lIllIllI[8] = "  ".length();
        lIllIllI[9] = (-6146) & 6859;
        lIllIllI[10] = (-((-5897) & 32553)) & (-13) & 27133;
        lIllIllI[11] = (((33 + 116) - 132) + 123) ^ (((33 + 65) - 88) + 141);
        lIllIllI[12] = (-((-4300) & 15855)) & (-133) & 1011687;
        lIllIllI[13] = (1 ^ 45) ^ (125 ^ 86);
        lIllIllI[14] = (-((-9666) & 28615)) & (-5121) & 24495;
        lIllIllI[15] = (-24613) & 27631;
        lIllIllI[16] = (-((-10389) & 14549)) & (-2050) & 8063;
        lIllIllI[17] = (-((-6101) & 30679)) & (-129) & 26623;
        lIllIllI[18] = (-8193) & 10110;
        lIllIllI[19] = (-((-16681) & 29563)) & (-18434) & 31743;
        lIllIllI[20] = (-16563) & 24575;
        lIllIllI[21] = (-((-337) & 5109)) & (-10313) & 15357;
        lIllIllI[22] = (-19117) & 31741;
        lIllIllI[23] = (-((-3318) & 20215)) & (-2049) & 24445;
        lIllIllI[24] = -" ".length();
        lIllIllI[25] = 160 ^ 165;
        lIllIllI[26] = 45 ^ 43;
        lIllIllI[27] = 106 ^ 97;
        lIllIllI[28] = 181 ^ 189;
        lIllIllI[29] = 23 ^ 30;
        lIllIllI[30] = (-25345) & 28509;
        lIllIllI[31] = (-((-14) & 4719)) & (-8193) & 16383;
        lIllIllI[32] = (((49 + 89) - 87) + 132) ^ (((105 + 56) - (-26)) + 0);
    }

    private static boolean lIIllIIIlll(int i, int i2) {
        return i == i2;
    }

    private static String lIIlIlIlIlI(String lIllIIlIlIlIIII, String lIllIIlIlIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlIlIlIIlI = Cipher.getInstance("Blowfish");
            lIllIIlIlIlIIlI.init(lIllIllI[8], secretKeySpec);
            return new String(lIllIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(lIllIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlIlIlIIIl) {
            lIllIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIIIII(int i) {
        return i != 0;
    }

    public static void b(List<Integer> list) {
        if (lIIlIllllll(GrandExchange.isOpen() ? 1 : 0)) {
            if (lIIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIlIllllll(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (lIIllIIIIII(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(lIllIllI[8]);
            "".length();
            int i = lIllIllI[0];
            while (lIIllIIIIIl(i, list.size())) {
                int[] iArr = new int[lIllIllI[1]];
                iArr[lIllIllI[0]] = list.get(i).intValue();
                if (lIIllIIIllI(Inventory.getCount(iArr))) {
                    if (lIIlIllllll(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[lIllIllI[1]];
                        iArr2[lIllIllI[0]] = list.get(i).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(lIllIllI[8]);
                        "".length();
                        int i2 = i;
                        Time.sleepUntil(() -> {
                            if (lIIllIIIlll(GrandExchange.getItemId(), ((Integer) list.get(i2)).intValue())) {
                                ?? r0 = lIllIllI[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllIllI[0];
                        }, lIllIllI[23]);
                        "".length();
                    }
                    if (lIIllIIIIII(GrandExchange.isSelling() ? 1 : 0)) {
                        if (lIIllIIIlIl(GrandExchange.getPrice(), lIllIllI[24])) {
                            GrandExchange.setPrice(lIllIllI[1]);
                            Time.sleepTicks(lIllIllI[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIIllIIIlll(GrandExchange.getPrice(), lIllIllI[1])) {
                                    ?? r0 = lIllIllI[1];
                                    "".length();
                                    return (((((121 + 22) - 90) + 121) ^ (((9 + 44) - (-87)) + 47)) & (((8 ^ 1) ^ (140 ^ 144)) ^ (-" ".length()))) < (-" ".length()) ? ((209 ^ 135) ^ (158 ^ 131)) & (((((69 + 107) - 30) + 56) ^ (((120 + 92) - 134) + 51)) ^ (-" ".length())) & ((((((184 + 53) - 164) + 163) ^ (((3 + 166) - 146) + 150)) & (((((52 + 168) - 88) + 69) ^ (((131 + 96) - 201) + 110)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                                }
                                return lIllIllI[0];
                            }, lIllIllI[23]);
                            "".length();
                        }
                        if (lIIllIIIlll(GrandExchange.getPrice(), lIllIllI[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, lIllIllI[23]);
                            "".length();
                        }
                    }
                    if (lIIllIIIIII(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIIlIllllll(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lIllIllI[1];
                                "".length();
                                return ("  ".length() & ("  ".length() ^ (-1))) != 0 ? true & ((true ^ true) ^ true) : r0;
                            }
                            return lIllIllI[0];
                        }, lIllIllI[5]);
                        "".length();
                    }
                }
                i++;
                "".length();
                if ((-"  ".length()) > 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIIllIIIlII(int i, int i2) {
        return i <= i2;
    }

    public static void a(int lIllIIlIlllIlII) {
        int intValue;
        if (lIIlIllllll(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (lIIllIIIIII(Static.getClient().isItemDefinitionCached(lIllIIlIlllIlII) ? 1 : 0)) {
            intValue = Static.getClient().getItemComposition(lIllIIlIlllIlII).getLinkedNoteId();
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return;
            }
        } else {
            intValue = ((Integer) GameThread.invokeLater(() -> {
                return Integer.valueOf(Static.getClient().getItemComposition(lIllIIlIlllIlII).getLinkedNoteId());
            })).intValue();
        }
        int i = intValue;
        if (!lIIllIIIlIl(GrandExchange.getItemId(), lIllIllI[24]) || (lIIllIIIlIl(GrandExchange.getItemId(), lIllIIlIlllIlII) && lIIllIIIlIl(GrandExchange.getItemId(), i))) {
            if (lIIlIllllll(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(lIllIIlIlllIlII);
        }
    }

    private static boolean lIIllIIIllI(int i) {
        return i > 0;
    }

    private static void lIIlIlIlllI() {
        lIllIIll = new String[lIllIllI[32]];
        lIllIIll[lIllIllI[0]] = lIIlIlIlIlI("zZEBFrtbVuQ=", "nxAby");
        lIllIIll[lIllIllI[1]] = lIIlIlIlIll("FHZLC1LERsf0rg5zpgrAmg==", "eFLfj");
        lIllIIll[lIllIllI[8]] = lIIlIlIllII("CwpsE3ESSGw7JicAbCEsYhc7PDchDGwhLGIFbAVxEkQ7OjEuAGB1JiwAJTskYhcvJyoyEA==", "BdLUC");
        lIllIIll[lIllIllI[4]] = lIIlIlIlIlI("eBQO+80zr3LSRWQmGqM3u2jIoql5Mto/", "wjvjE");
        lIllIIll[lIllIllI[7]] = lIIlIlIlIll("u6VRl1hwwOkywaAGifSd7pfkx2hLKNnd", "UIdWp");
        lIllIIll[lIllIllI[25]] = lIIlIlIllII("LgM0ITQu", "ZbVMQ");
        lIllIIll[lIllIllI[26]] = lIIlIlIllII("XCUEMxQRJUw=", "tQeQx");
        lIllIIll[lIllIllI[13]] = lIIlIlIlIll("Nsqnv4bcDA0=", "cwfFp");
        lIllIIll[lIllIllI[28]] = lIIlIlIlIlI("8PiMy/b2PCY=", "PxhKp");
        lIllIIll[lIllIllI[29]] = lIIlIlIlIll("uVTkwyik2PA=", "hAiKY");
        lIllIIll[lIllIllI[3]] = lIIlIlIlIlI("Wrp+nD24HM8=", "iWoGn");
        lIllIIll[lIllIllI[27]] = lIIlIlIlIll("JT3Nk30kqhUL3kvp3WK+cY6H64gxYvS4", "VOgCe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(String str) {
        List all = Inventory.getAll();
        if (lIIlIllllll(all.isEmpty() ? 1 : 0)) {
            String str2 = null;
            if (lIIllIIIIII(str.contains(lIllIIll[lIllIllI[25]]) ? 1 : 0)) {
                str2 = str.replace(lIllIIll[lIllIllI[26]], lIllIIll[lIllIllI[13]]).trim();
            }
            int i = lIllIllI[0];
            while (lIIllIIIIIl(i, all.size())) {
                String name = ((Item) all.get(i)).getName();
                if (lIIllIIlIII(name)) {
                    if (lIIllIIIIII(name.contains(str) ? 1 : 0)) {
                        return lIllIllI[1];
                    }
                    if (lIIllIIlIII(str2) && lIIllIIIIII(name.contains(str2) ? 1 : 0)) {
                        return lIllIllI[1];
                    }
                }
                i++;
                "".length();
                if ("   ".length() == ((0 ^ 35) & ((123 ^ 88) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIllIllI[0];
    }

    private static boolean lIIllIIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x0c9c, code lost:
        if (lIIllIIIIII(net.unethicalite.api.items.GrandExchange.canCollect() ? 1 : 0) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0c9f, code lost:
        net.unethicalite.api.items.GrandExchange.collect();
        net.unethicalite.api.commons.Time.sleepUntil(() -> { // java.util.function.BooleanSupplier.getAsBoolean():boolean
            return k();
        }, p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0cb5, code lost:
        java.lang.System.out.println(r7.get(r8).p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0ce0, code lost:
        if (lIIllIIIlll(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.K.get(r8).intValue(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[15]) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0ce3, code lost:
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.K.remove(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[0]);
        "".length();
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.L.remove(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[0]);
        "".length();
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.M.remove(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[0]);
        "".length();
        r7.remove(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0d34, code lost:
        if (lIIllIIIIII(a(r0) ? 1 : 0) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0d37, code lost:
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.K.remove(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[0]);
        "".length();
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.L.remove(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[0]);
        "".length();
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.M.remove(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[0]);
        "".length();
        r7.remove(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0d81, code lost:
        net.unethicalite.api.commons.Time.sleepTicks(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0001b.lIllIllI[8]);
        "".length();
        r8 = r8 + 1;
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0da6, code lost:
        if ((-" ".length()) != (196 ^ 192)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0da9, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<C0003d> list) {
        int i;
        double lIllIIllIIIlIlI;
        if (lIIlIllllll(list.isEmpty() ? 1 : 0) && lIIllIIIIII(K.isEmpty() ? 1 : 0)) {
            int lIllIIllIIlIIIl = lIllIllI[0];
            while (lIIllIIIIIl(lIllIIllIIlIIIl, list.size())) {
                K.add(Integer.valueOf(list.get(lIllIIllIIlIIIl).p()));
                "".length();
                L.add(Integer.valueOf(list.get(lIllIIllIIlIIIl).q()));
                "".length();
                M.add(Integer.valueOf(list.get(lIllIIllIIlIIIl).r()));
                "".length();
                lIllIIllIIlIIIl++;
                "".length();
                if (" ".length() > " ".length()) {
                    return;
                }
            }
        }
        int[] iArr = new int[lIllIllI[1]];
        iArr[lIllIllI[0]] = lIllIllI[2];
        if (!lIIllIIIIlI(Inventory.getCount(iArr), lIllIllI[1]) || lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
            if (lIIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lIllIllI[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(lIllIIll[lIllIllI[27]]);
                };
                if (lIIllIIIIII(Bank.contains(predicate) ? 1 : 0) && lIIlIllllll(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIllIIll[lIllIllI[3]]);
                }) ? 1 : 0) && lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                    Bank.withdraw(predicate, lIllIllI[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(lIllIllI[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIIIllI(Inventory.getCount(predicate))) {
                            ?? r0 = lIllIllI[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIllI[0];
                    }, lIllIllI[5]);
                    "".length();
                }
                if (lIIlIllllll(Bank.contains(C0005f.bl) ? 1 : 0) && lIIlIllllll(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIllIIll[lIllIllI[29]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[lIllIllI[1]];
                    iArr2[lIllIllI[0]] = lIllIllI[6];
                    if (lIIllIIIIII(Bank.contains(iArr2) ? 1 : 0) && lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                        Bank.withdraw(lIllIllI[6], lIllIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllI[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[lIllIllI[1]];
                            iArr3[lIllIllI[0]] = lIllIllI[6];
                            if (lIIllIIIllI(Inventory.getCount(iArr3))) {
                                ?? r0 = lIllIllI[1];
                                "".length();
                                return " ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllIllI[0];
                        }, lIllIllI[5]);
                        "".length();
                    }
                }
                if (lIIllIIIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                    int[] iArr3 = new int[lIllIllI[1]];
                    iArr3[lIllIllI[0]] = lIllIllI[2];
                    if (lIIllIIIIIl(Inventory.getCount(iArr3), lIllIllI[1])) {
                        Bank.withdrawAll(lIllIllI[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllI[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIllIllI[1]];
                            iArr4[lIllIllI[0]] = lIllIllI[2];
                            return Inventory.contains(iArr4);
                        }, lIllIllI[5]);
                        "".length();
                    }
                }
            }
            if (lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                if (lIIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(lIllIllI[7]);
                    "".length();
                }
                if (lIIlIllllll(Bank.isOpen() ? 1 : 0)) {
                    if (lIIllIIIIII(Inventory.contains(C0005f.bl) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.bl).interact(lIllIIll[lIllIllI[0]]);
                        Time.sleepTicks(lIllIllI[8]);
                        "".length();
                    }
                    if (lIIllIIIIII(Equipment.contains(C0005f.bl) ? 1 : 0) && lIIllIIIlIl(Players.getLocal().getAnimation(), lIllIllI[9])) {
                        Equipment.getFirst(C0005f.bl).interact(lIllIIll[lIllIllI[1]]);
                        Time.sleepTicks(lIllIllI[4]);
                        "".length();
                    }
                    Movement.walkTo(J);
                    "".length();
                }
            }
        }
        if (lIIlIllllll(Bank.isOpen() ? 1 : 0) && lIIllIIIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
            int[] iArr4 = new int[lIllIllI[1]];
            iArr4[lIllIllI[0]] = lIllIllI[2];
            if (lIIllIIIIIl(Inventory.getCount(iArr4), lIllIllI[1])) {
                C0000a.a();
            }
        }
        if (lIIlIllllll(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[lIllIllI[1]];
            iArr5[lIllIllI[0]] = lIllIllI[2];
            if (lIIllIIIllI(Inventory.getCount(iArr5)) && lIIllIIIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, lIllIllI[5]);
                "".length();
            }
        }
        if (lIIllIIIIII(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[lIllIllI[1]];
            iArr6[lIllIllI[0]] = lIllIllI[2];
            if (lIIllIIIllI(Inventory.getCount(iArr6))) {
                int lIllIIllIIlIIIl2 = lIllIllI[0];
                while (lIIllIIIIIl(lIllIIllIIlIIIl2, K.size())) {
                    String lIllIIllIIlIIII = C0002c.c(K.get(lIllIIllIIlIIIl2).intValue());
                    System.out.println("Buying " + lIllIIllIIlIIII + " and itemID is: " + String.valueOf(K.get(lIllIIllIIlIIIl2)));
                    while (true) {
                        if (!lIIlIllllll(a(lIllIIllIIlIIII) ? 1 : 0)) {
                            break;
                        }
                        if (lIIlIllllll(GrandExchange.canCollect() ? 1 : 0)) {
                            int i2 = lIllIIllIIlIIIl2;
                            if (lIIllIIIllI(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (lIIllIIIlll(grandExchangeOffer.getItemId(), K.get(i2).intValue())) {
                                    ?? r0 = lIllIllI[1];
                                    "".length();
                                    return 0 != 0 ? ((49 ^ 83) ^ (100 ^ 93)) & (("   ".length() ^ (152 ^ 192)) ^ (-" ".length())) : r0;
                                }
                                return lIllIllI[0];
                            }).collect(Collectors.toList())).size())) {
                                i = lIllIllI[1];
                                "".length();
                                if (" ".length() <= (-" ".length())) {
                                    return;
                                }
                            } else {
                                i = lIllIllI[0];
                            }
                            int i3 = i;
                            if (lIIllIIIIII(i3) && lIIllIIIIll(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (lIIllIIIlll(grandExchangeOffer2.getItemId(), K.get(i2).intValue())) {
                                    ?? r0 = lIllIllI[1];
                                    "".length();
                                    return (-((((182 + 156) - 277) + 127) ^ (((33 + 181) - 63) + 34))) >= 0 ? ((19 ^ 3) ^ (124 ^ 49)) & (((134 ^ 181) ^ (175 ^ 193)) ^ (-" ".length())) : r0;
                                }
                                return lIllIllI[0];
                            }).collect(Collectors.toList())).size(), lIllIllI[1])) {
                                GrandExchange.abortOffer(K.get(lIllIIllIIlIIIl2).intValue());
                            }
                            if (lIIlIllllll(i3)) {
                                if (!lIIllIIIIII(GrandExchange.isBuying() ? 1 : 0) || lIIllIIIlIl(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2).intValue())) {
                                    a(K.get(lIllIIllIIlIIIl2).intValue());
                                }
                                if (lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2).intValue()) && lIIllIIIlIl(GrandExchange.getQuantity(), L.get(lIllIIllIIlIIIl2).intValue())) {
                                    GrandExchange.setQuantity(L.get(lIllIIllIIlIIIl2).intValue());
                                }
                                int intValue = M.get(lIllIIllIIlIIIl2).intValue();
                                int i4 = lIllIllI[0];
                                Widget widget = Widgets.get(lIllIllI[10], lIllIllI[11]);
                                if (lIIllIIIIII(GrandExchange.isOpen() ? 1 : 0) && lIIllIIIIII(GrandExchange.isBuying() ? 1 : 0) && lIIllIIlIII(widget) && lIIlIllllll(widget.getText().isEmpty() ? 1 : 0)) {
                                    int guidePrice = GrandExchange.getGuidePrice();
                                    i4 = guidePrice;
                                    System.out.println("Guide price: " + guidePrice + "|Given price: " + String.valueOf(M.get(lIllIIllIIlIIIl2)));
                                }
                                if (lIIllIIIIlI(i4, intValue)) {
                                    if (lIIllIIIIll(i4, lIllIllI[12])) {
                                        lIllIIllIIIlIlI = 0.1d;
                                        "".length();
                                        if ((((95 ^ 104) ^ (79 ^ 69)) & (((121 ^ 60) ^ (46 ^ 86)) ^ (-" ".length()))) != 0) {
                                            return;
                                        }
                                    } else {
                                        lIllIIllIIIlIlI = 0.3d;
                                    }
                                    int i5 = (int) (i4 + (i4 * lIllIIllIIIlIlI));
                                    System.out.println("Increased price: " + i5);
                                    if (lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2).intValue()) && lIIllIIIlIl(GrandExchange.getPrice(), i5)) {
                                        GrandExchange.setPrice(i5);
                                    }
                                    if (lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2).intValue()) && lIIllIIIlll(GrandExchange.getPrice(), i5)) {
                                        GrandExchange.confirm();
                                    }
                                    "".length();
                                    if ((-"   ".length()) > 0) {
                                        return;
                                    }
                                } else {
                                    if (lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2).intValue()) && lIIllIIIlIl(GrandExchange.getPrice(), M.get(lIllIIllIIlIIIl2).intValue())) {
                                        GrandExchange.setPrice(M.get(lIllIIllIIlIIIl2).intValue());
                                    }
                                    if (lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2).intValue()) && lIIllIIIlll(GrandExchange.getPrice(), M.get(lIllIIllIIlIIIl2).intValue())) {
                                        GrandExchange.confirm();
                                    }
                                }
                            }
                        }
                        if (lIIlIllllll(Worlds.inMembersWorld() ? 1 : 0)) {
                            System.out.println(lIllIIll[lIllIllI[8]]);
                            AccBuilderBarrows.d = lIllIllI[1];
                            return;
                        }
                        if (lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[13])) {
                            Movement.walkTo(J);
                            "".length();
                            Time.sleepTicks(lIllIllI[1]);
                            "".length();
                        }
                        if (lIIlIllllll(GrandExchange.isOpen() ? 1 : 0)) {
                            GrandExchange.open();
                        }
                        if (lIIllIIIIII(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (lIIlIllllll(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = lIllIllI[1];
                                    "".length();
                                    return (-"   ".length()) > 0 ? ((((3 + 70) - (-11)) + 99) ^ (((54 + 76) - 114) + 127)) & (((((102 + 80) - 41) + 18) ^ (((109 + 89) - 118) + 87)) ^ (-" ".length())) : r0;
                                }
                                return lIllIllI[0];
                            }, lIllIllI[5]);
                            "".length();
                        }
                        if (lIIllIIIlll(K.get(lIllIIllIIlIIIl2).intValue(), lIllIllI[14])) {
                            int[] iArr7 = new int[lIllIllI[1]];
                            iArr7[lIllIllI[0]] = lIllIllI[14];
                            if (!lIIlIllllll(Inventory.contains(iArr7) ? 1 : 0)) {
                                K.remove(lIllIllI[0]);
                                "".length();
                                L.remove(lIllIllI[0]);
                                "".length();
                                M.remove(lIllIllI[0]);
                                "".length();
                                list.remove(lIllIllI[0]);
                                "".length();
                                Time.sleepTicks(lIllIllI[8]);
                                "".length();
                                "".length();
                                if ("  ".length() != 0) {
                                    return;
                                }
                            }
                        }
                        if (lIIllIIIlll(K.get(lIllIIllIIlIIIl2).intValue(), lIllIllI[15])) {
                            K.remove(lIllIllI[0]);
                            "".length();
                            L.remove(lIllIllI[0]);
                            "".length();
                            M.remove(lIllIllI[0]);
                            "".length();
                            list.remove(lIllIllI[0]);
                            "".length();
                            Time.sleepTicks(lIllIllI[8]);
                            "".length();
                            "".length();
                            if ("  ".length() != 0) {
                            }
                        } else {
                            if (lIIllIIIlll(K.get(lIllIIllIIlIIIl2).intValue(), lIllIllI[16])) {
                                int[] iArr8 = new int[lIllIllI[1]];
                                iArr8[lIllIllI[0]] = lIllIllI[16];
                                if (lIIllIIIIII(Inventory.contains(iArr8) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    list.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() == 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIllIIIlll(K.get(lIllIIllIIlIIIl2).intValue(), lIllIllI[17])) {
                                int[] iArr9 = new int[lIllIllI[1]];
                                iArr9[lIllIllI[0]] = lIllIllI[18];
                                if (lIIllIIIIII(Inventory.contains(iArr9) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    list.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if ((-"  ".length()) >= 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIllIIIlll(K.get(lIllIIllIIlIIIl2).intValue(), lIllIllI[19])) {
                                int[] iArr10 = new int[lIllIllI[1]];
                                iArr10[lIllIllI[0]] = lIllIllI[19];
                                if (lIIllIIIIII(Inventory.contains(iArr10) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    list.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if ((107 ^ 111) < ((84 ^ 65) & ((8 ^ 29) ^ (-1)))) {
                                        return;
                                    }
                                }
                            }
                            if (lIIllIIIlll(K.get(lIllIIllIIlIIIl2).intValue(), lIllIllI[20])) {
                                int[] iArr11 = new int[lIllIllI[1]];
                                iArr11[lIllIllI[0]] = lIllIllI[20];
                                if (lIIllIIIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    list.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if ("   ".length() <= (((((90 + 28) - 41) + 77) ^ (((108 + 76) - 90) + 92)) & (((64 ^ 39) ^ (232 ^ 175)) ^ (-" ".length())))) {
                                        return;
                                    }
                                }
                            }
                            if (lIIllIIIlll(K.get(lIllIIllIIlIIIl2).intValue(), lIllIllI[21])) {
                                int[] iArr12 = new int[lIllIllI[1]];
                                iArr12[lIllIllI[0]] = lIllIllI[21];
                                if (lIIllIIIIII(Inventory.contains(iArr12) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    list.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIllIIIlll(K.get(lIllIIllIIlIIIl2).intValue(), lIllIllI[22])) {
                                String[] strArr = new String[lIllIllI[1]];
                                strArr[lIllIllI[0]] = lIllIIll[lIllIllI[4]];
                                if (lIIlIllllll(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[lIllIllI[1]];
                                    strArr2[lIllIllI[0]] = lIllIIll[lIllIllI[7]];
                                    if (lIIllIIIIII(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                K.remove(lIllIllI[0]);
                                "".length();
                                L.remove(lIllIllI[0]);
                                "".length();
                                M.remove(lIllIllI[0]);
                                "".length();
                                list.remove(lIllIllI[0]);
                                "".length();
                                Time.sleepTicks(lIllIllI[8]);
                                "".length();
                                "".length();
                                if ("   ".length() < "  ".length()) {
                                    return;
                                }
                            }
                            if (!lIIlIllllll(a(lIllIIllIIlIIII) ? 1 : 0)) {
                                break;
                            } else if (lIIllIIIIII(AccBuilderBarrows.d ? 1 : 0)) {
                                "".length();
                                if (((244 ^ 153) ^ (197 ^ 172)) != ((((84 + 175) - 138) + 66) ^ (((183 + 101) - 247) + 154))) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(lIllIllI[4]);
                                "".length();
                                "".length();
                                if (((((84 + 50) - 51) + 63) ^ (((127 + 119) - 160) + 65)) == 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIIlIII(Object obj) {
        return obj != null;
    }

    private static String lIIlIlIllII(String lIllIIlIlIIIIII, String lIllIIlIIllllll) {
        String str = new String(Base64.getDecoder().decode(lIllIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIlIIlllllI = new StringBuilder();
        char[] lIllIIlIIllllIl = lIllIIlIIllllll.toCharArray();
        int lIllIIlIIllllII = lIllIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIllI[0];
        while (lIIllIIIIIl(i, length)) {
            char lIllIIlIlIIIIIl = charArray[i];
            lIllIIlIIlllllI.append((char) (lIllIIlIlIIIIIl ^ lIllIIlIIllllIl[lIllIIlIIllllII % lIllIIlIIllllIl.length]));
            "".length();
            lIllIIlIIllllII++;
            i++;
            "".length();
            if ((true ^ true) & ((!true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lIllIIlIIlllllI);
    }
}
