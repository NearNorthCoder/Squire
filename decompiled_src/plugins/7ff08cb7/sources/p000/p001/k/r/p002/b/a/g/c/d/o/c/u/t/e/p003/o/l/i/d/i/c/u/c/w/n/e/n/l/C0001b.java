package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/b.class */
public class C0001b {
    private static /* synthetic */ int[] llllIIIll;
    private static /* synthetic */ String[] llllIIIII;
    public static /* synthetic */ List<Integer> L;
    public static final /* synthetic */ WorldPoint K;
    public static /* synthetic */ List<Integer> M;
    public static /* synthetic */ List<Integer> N;

    public static void g() {
        Widget widget = Widgets.get(llllIIIll[10], llllIIIll[8], llllIIIll[27]);
        if (llIIlllIlIll(widget)) {
            widget.interact(llllIIIII[llllIIIll[28]]);
            Time.sleepTicks(llllIIIll[8]);
            "".length();
        }
    }

    private static String llIIllIlIIIl(String llIIIllIIIIll, String llIIIllIIIIlI) {
        String str = new String(Base64.getDecoder().decode(llIIIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIllIIIIIl = new StringBuilder();
        char[] charArray = llIIIllIIIIlI.toCharArray();
        int llIIIlIllllll = llllIIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llIIIlIllIlll = llllIIIll[0];
        while (llIIlllIIlII(llIIIlIllIlll, length)) {
            char llIIIllIIIlII = charArray2[llIIIlIllIlll];
            llIIIllIIIIIl.append((char) (llIIIllIIIlII ^ charArray[llIIIlIllllll % charArray.length]));
            "".length();
            llIIIlIllllll++;
            llIIIlIllIlll++;
            "".length();
            if ((-" ".length()) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llIIIllIIIIIl);
    }

    public static void b(List<Integer> list) {
        if (llIIlllIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
            if (llIIlllIIIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (llIIlllIIIlI(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (llIIlllIIIll(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(llllIIIll[8]);
            "".length();
            int i = llllIIIll[0];
            while (llIIlllIIlII(i, list.size())) {
                int[] iArr = new int[llllIIIll[1]];
                iArr[llllIIIll[0]] = list.get(i).intValue();
                if (llIIlllIlIIl(Inventory.getCount(iArr))) {
                    if (llIIlllIIIlI(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[llllIIIll[1]];
                        iArr2[llllIIIll[0]] = list.get(i).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(llllIIIll[8]);
                        "".length();
                        int i2 = i;
                        Time.sleepUntil(() -> {
                            if (llIIlllIlIlI(GrandExchange.getItemId(), ((Integer) list.get(i2)).intValue())) {
                                ?? r0 = llllIIIll[1];
                                "".length();
                                return (-(39 ^ 35)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllIIIll[0];
                        }, llllIIIll[23]);
                        "".length();
                    }
                    if (llIIlllIIIll(GrandExchange.isSelling() ? 1 : 0)) {
                        if (llIIlllIlIII(GrandExchange.getPrice(), llllIIIll[24])) {
                            GrandExchange.setPrice(llllIIIll[1]);
                            Time.sleepTicks(llllIIIll[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (llIIlllIlIlI(GrandExchange.getPrice(), llllIIIll[1])) {
                                    ?? r0 = llllIIIll[1];
                                    "".length();
                                    return (((243 ^ 142) ^ (146 ^ 173)) & (((((43 + 47) - 29) + 184) ^ (((17 + 150) - 142) + 158)) ^ (-" ".length()))) != 0 ? ((111 ^ 106) ^ (55 ^ 114)) & (((((142 + 50) - 128) + 134) ^ (((72 + 18) - 76) + 120)) ^ (-" ".length())) : r0;
                                }
                                return llllIIIll[0];
                            }, llllIIIll[23]);
                            "".length();
                        }
                        if (llIIlllIlIlI(GrandExchange.getPrice(), llllIIIll[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, llllIIIll[23]);
                            "".length();
                        }
                    }
                    if (llIIlllIIIll(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (llIIlllIIIlI(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = llllIIIll[1];
                                "".length();
                                return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllIIIll[0];
                        }, llllIIIll[5]);
                        "".length();
                    }
                }
                i++;
                "".length();
                if (" ".length() == "   ".length()) {
                    return;
                }
            }
        }
    }

    private static void llIIllIlIlII() {
        llllIIIII = new String[llllIIIll[32]];
        llllIIIII[llllIIIll[0]] = llIIllIlIIIl("NCAgOg==", "cEAHD");
        llllIIIII[llllIIIll[1]] = llIIllIlIIlI("uEQuszTJEn5GLJTGyMnttw==", "PymiR");
        llllIIIII[llllIIIll[8]] = llIIllIlIIll("WK+tzAMycAp0lZ2WXgFA+IYSlcMhf/ZjJ38ti7tUvFWJeXdSpjohV4bLBq4/VuTWpb7GvrYY6JI=", "xseuE");
        llllIIIII[llllIIIll[4]] = llIIllIlIIIl("ICUpBj0dMGgbOwc4JwV8R3g=", "sQHkT");
        llllIIIII[llllIIIll[7]] = llIIllIlIIlI("EL42ukANSJC2RNXDpzVi4xC5i8nJxPWw", "nRMiK");
        llllIIIII[llllIIIll[25]] = llIIllIlIIlI("IpUJa7Zex7Q=", "FdlhF");
        llllIIIII[llllIIIll[26]] = llIIllIlIIlI("BiN+zDJPcllz61XxlEH0og==", "bJWMj");
        llllIIIII[llllIIIll[13]] = llIIllIlIIIl("", "vvgqE");
        llllIIIII[llllIIIll[28]] = llIIllIlIIIl("NBghGQ8=", "wtNjj");
        llllIIIII[llllIIIll[29]] = llIIllIlIIll("cwP8X/4JTHc=", "DCKFh");
        llllIIIII[llllIIIll[3]] = llIIllIlIIlI("oWCwbyik34c=", "GKjMl");
        llllIIIII[llllIIIll[27]] = llIIllIlIIIl("GhE9AmUHHnMSIAkUJw1lQA==", "hxSeE");
    }

    private static boolean llIIlllIlIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(String str) {
        List all = Inventory.getAll();
        if (llIIlllIIIlI(all.isEmpty() ? 1 : 0)) {
            String str2 = null;
            if (llIIlllIIIll(str.contains(llllIIIII[llllIIIll[25]]) ? 1 : 0)) {
                str2 = str.replace(llllIIIII[llllIIIll[26]], llllIIIII[llllIIIll[13]]).trim();
            }
            int i = llllIIIll[0];
            while (llIIlllIIlII(i, all.size())) {
                String llIIIlllIIIlI = ((Item) all.get(i)).getName();
                if (llIIlllIlIll(llIIIlllIIIlI)) {
                    if (llIIlllIIIll(llIIIlllIIIlI.contains(str) ? 1 : 0)) {
                        return llllIIIll[1];
                    }
                    if (llIIlllIlIll(str2) && llIIlllIIIll(llIIIlllIIIlI.contains(str2) ? 1 : 0)) {
                        return llllIIIll[1];
                    }
                }
                i++;
                "".length();
                if (" ".length() <= 0) {
                    return ((112 ^ 21) ^ (40 ^ 85)) & (((((38 + 76) - 6) + 54) ^ (((162 + 150) - 218) + 92)) ^ (-" ".length()));
                }
            }
        }
        return llllIIIll[0];
    }

    private static boolean llIIlllIlIll(Object obj) {
        return obj != null;
    }

    private static void llIIlllIIIIl() {
        llllIIIll = new int[33];
        llllIIIll[0] = (72 ^ 16) & ((223 ^ 135) ^ (-1));
        llllIIIll[1] = " ".length();
        llllIIIll[2] = (-((-35) & 10287)) & (-1) & 11247;
        llllIIIll[3] = 170 ^ 160;
        llllIIIll[4] = "   ".length();
        llllIIIll[5] = (-26744) & 31743;
        llllIIIll[6] = (-8377) & 16383;
        llllIIIll[7] = 103 ^ 99;
        llllIIIll[8] = "  ".length();
        llllIIIll[9] = (-27906) & 28619;
        llllIIIll[10] = (-((-16841) & 26571)) & (-16389) & 26583;
        llllIIIll[11] = (((19 + 88) - 76) + 102) ^ (((70 + 87) - 56) + 57);
        llllIIIll[12] = (-((-23301) & 31670)) & (-1285) & 1009653;
        llllIIIll[13] = 52 ^ 51;
        llllIIIll[14] = (-23638) & 24063;
        llllIIIll[15] = (-((-2409) & 26989)) & (-1041) & 28639;
        llllIIIll[16] = (-((-1154) & 3267)) & (-16385) & 20351;
        llllIIIll[17] = (-((-3179) & 23787)) & (-10241) & 32765;
        llllIIIll[18] = (-((-3701) & 24310)) & (-2049) & 24575;
        llllIIIll[19] = (-28225) & 28652;
        llllIIIll[20] = (-16529) & 24541;
        llllIIIll[21] = (-585) & 857;
        llllIIIll[22] = (-((-12293) & 31911)) & (-5) & 32247;
        llllIIIll[23] = (-24706) & 30205;
        llllIIIll[24] = -" ".length();
        llllIIIll[25] = 137 ^ 140;
        llllIIIll[26] = (((104 + 28) - 78) + 75) ^ (((108 + 14) - 55) + 68);
        llllIIIll[27] = (41 ^ 99) ^ (11 ^ 74);
        llllIIIll[28] = 168 ^ 160;
        llllIIIll[29] = 0 ^ 9;
        llllIIIll[30] = (-25475) & 28639;
        llllIIIll[31] = (-((-6289) & 31409)) & (-66) & 28671;
        llllIIIll[32] = (((34 + 52) - 60) + 127) ^ (((44 + 133) - 167) + 139);
    }

    private static boolean llIIlllIlIIl(int i) {
        return i > 0;
    }

    private static String llIIllIlIIlI(String llIIIlIlIlllI, String llIIIlIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIll[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIlIllll) {
            llIIIlIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllIIIlI(int i) {
        return i == 0;
    }

    public static void a(int llIIIllIlllIl) {
        int intValue;
        if (llIIlllIIIlI(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (llIIlllIIIll(Static.getClient().isItemDefinitionCached(llIIIllIlllIl) ? 1 : 0)) {
            intValue = Static.getClient().getItemComposition(llIIIllIlllIl).getLinkedNoteId();
            "".length();
            if (0 != 0) {
                return;
            }
        } else {
            intValue = ((Integer) GameThread.invokeLater(() -> {
                return Integer.valueOf(Static.getClient().getItemComposition(llIIIllIlllIl).getLinkedNoteId());
            })).intValue();
        }
        int i = intValue;
        if (!llIIlllIlIII(GrandExchange.getItemId(), llllIIIll[24]) || (llIIlllIlIII(GrandExchange.getItemId(), llIIIllIlllIl) && llIIlllIlIII(GrandExchange.getItemId(), i))) {
            if (llIIlllIIIlI(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(llIIIllIlllIl);
        }
    }

    private static String llIIllIlIIll(String llIIIlIlIIIIl, String llIIIlIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), llllIIIll[28]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIll[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIlIIIlI) {
            llIIIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllIIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlllIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIlllIIIll(int i) {
        return i != 0;
    }

    private static boolean llIIlllIIlll(int i, int i2) {
        return i <= i2;
    }

    static {
        llIIlllIIIIl();
        llIIllIlIlII();
        K = new WorldPoint(llllIIIll[30], llllIIIll[31], llllIIIll[0]);
        L = new ArrayList();
        M = new ArrayList();
        N = new ArrayList();
    }

    private static boolean llIIlllIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlllIlIII(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x0c9a, code lost:
        if (llIIlllIIIll(net.unethicalite.api.items.GrandExchange.canCollect() ? 1 : 0) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0c9d, code lost:
        net.unethicalite.api.items.GrandExchange.collect();
        net.unethicalite.api.commons.Time.sleepUntil(() -> { // java.util.function.BooleanSupplier.getAsBoolean():boolean
            return k();
        }, p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0cb3, code lost:
        java.lang.System.out.println(r7.get(r8).p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0cde, code lost:
        if (llIIlllIlIlI(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.L.get(r8).intValue(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[15]) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0ce1, code lost:
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.L.remove(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[0]);
        "".length();
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.M.remove(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[0]);
        "".length();
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.N.remove(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[0]);
        "".length();
        r7.remove(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0d32, code lost:
        if (llIIlllIIIll(a(r0) ? 1 : 0) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0d35, code lost:
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.L.remove(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[0]);
        "".length();
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.M.remove(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[0]);
        "".length();
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.N.remove(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[0]);
        "".length();
        r7.remove(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0d7f, code lost:
        net.unethicalite.api.commons.Time.sleepTicks(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0001b.llllIIIll[8]);
        "".length();
        r8 = r8 + 1;
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0dcc, code lost:
        if (((((116 + 16) - 126) + 126) ^ (((59 + 72) - 47) + 44)) >= (((10 ^ 42) ^ (34 ^ 63)) & (((32 ^ 36) ^ (105 ^ 80)) ^ (-" ".length())))) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0dcf, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0808 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x040d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v170, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<C0003d> list) {
        int i;
        double d;
        if (llIIlllIIIlI(list.isEmpty() ? 1 : 0) && llIIlllIIIll(L.isEmpty() ? 1 : 0)) {
            int i2 = llllIIIll[0];
            while (llIIlllIIlII(i2, list.size())) {
                L.add(Integer.valueOf(list.get(i2).p()));
                "".length();
                M.add(Integer.valueOf(list.get(i2).q()));
                "".length();
                N.add(Integer.valueOf(list.get(i2).r()));
                "".length();
                i2++;
                "".length();
                if ((((125 ^ 49) ^ (197 ^ 169)) & (((82 ^ 113) ^ "   ".length()) ^ (-" ".length()))) >= " ".length()) {
                    return;
                }
            }
        }
        int[] iArr = new int[llllIIIll[1]];
        iArr[llllIIIll[0]] = llllIIIll[2];
        if (!llIIlllIIlIl(Inventory.getCount(iArr), llllIIIll[1]) || llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
            if (llIIlllIIIll(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(llllIIIll[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(llllIIIII[llllIIIll[27]]);
                };
                if (llIIlllIIIll(Bank.contains(predicate) ? 1 : 0) && llIIlllIIIlI(Inventory.contains(item2 -> {
                    return item2.getName().contains(llllIIIII[llllIIIll[3]]);
                }) ? 1 : 0) && llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                    Bank.withdraw(predicate, llllIIIll[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(llllIIIll[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIlllIlIIl(Inventory.getCount(predicate))) {
                            ?? r0 = llllIIIll[1];
                            "".length();
                            return " ".length() <= (-" ".length()) ? ((((20 + 19) - (-39)) + 52) ^ (((150 + 119) - 114) + 0)) & (((((174 + 123) - 193) + 82) ^ (((30 + 65) - 60) + 128)) ^ (-" ".length())) : r0;
                        }
                        return llllIIIll[0];
                    }, llllIIIll[5]);
                    "".length();
                }
                if (llIIlllIIIlI(Bank.contains(C0005f.bm) ? 1 : 0) && llIIlllIIIlI(Inventory.contains(item3 -> {
                    return item3.getName().contains(llllIIIII[llllIIIll[29]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[llllIIIll[1]];
                    iArr2[llllIIIll[0]] = llllIIIll[6];
                    if (llIIlllIIIll(Bank.contains(iArr2) ? 1 : 0) && llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                        Bank.withdraw(llllIIIll[6], llllIIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllIIIll[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[llllIIIll[1]];
                            iArr3[llllIIIll[0]] = llllIIIll[6];
                            if (llIIlllIlIIl(Inventory.getCount(iArr3))) {
                                ?? r0 = llllIIIll[1];
                                "".length();
                                return ((147 ^ 148) & ((157 ^ 154) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllIIIll[0];
                        }, llllIIIll[5]);
                        "".length();
                    }
                }
                if (llIIlllIIlll(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                    int[] iArr3 = new int[llllIIIll[1]];
                    iArr3[llllIIIll[0]] = llllIIIll[2];
                    if (llIIlllIIlII(Inventory.getCount(iArr3), llllIIIll[1])) {
                        Bank.withdrawAll(llllIIIll[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllIIIll[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[llllIIIll[1]];
                            iArr4[llllIIIll[0]] = llllIIIll[2];
                            return Inventory.contains(iArr4);
                        }, llllIIIll[5]);
                        "".length();
                    }
                }
            }
            if (llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                if (llIIlllIIIll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(llllIIIll[7]);
                    "".length();
                }
                if (llIIlllIIIlI(Bank.isOpen() ? 1 : 0)) {
                    if (llIIlllIIIll(Inventory.contains(C0005f.bm) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.bm).interact(llllIIIII[llllIIIll[0]]);
                        Time.sleepTicks(llllIIIll[8]);
                        "".length();
                    }
                    if (llIIlllIIIll(Equipment.contains(C0005f.bm) ? 1 : 0) && llIIlllIlIII(Players.getLocal().getAnimation(), llllIIIll[9])) {
                        Equipment.getFirst(C0005f.bm).interact(llllIIIII[llllIIIll[1]]);
                        Time.sleepTicks(llllIIIll[4]);
                        "".length();
                    }
                    Movement.walkTo(K);
                    "".length();
                }
            }
        }
        if (llIIlllIIIlI(Bank.isOpen() ? 1 : 0) && llIIlllIIlll(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
            int[] iArr4 = new int[llllIIIll[1]];
            iArr4[llllIIIll[0]] = llllIIIll[2];
            if (llIIlllIIlII(Inventory.getCount(iArr4), llllIIIll[1])) {
                C0000a.a();
            }
        }
        if (llIIlllIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[llllIIIll[1]];
            iArr5[llllIIIll[0]] = llllIIIll[2];
            if (llIIlllIlIIl(Inventory.getCount(iArr5)) && llIIlllIIlll(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, llllIIIll[5]);
                "".length();
            }
        }
        if (llIIlllIIIll(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[llllIIIll[1]];
            iArr6[llllIIIll[0]] = llllIIIll[2];
            if (llIIlllIlIIl(Inventory.getCount(iArr6))) {
                int i3 = llllIIIll[0];
                while (llIIlllIIlII(i3, L.size())) {
                    String c = C0002c.c(L.get(i3).intValue());
                    System.out.println("Buying " + c + " and itemID is: " + String.valueOf(L.get(i3)));
                    while (true) {
                        if (!llIIlllIIIlI(a(c) ? 1 : 0)) {
                            break;
                        }
                        if (llIIlllIIIlI(GrandExchange.canCollect() ? 1 : 0)) {
                            int i4 = i3;
                            if (llIIlllIlIIl(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (llIIlllIlIlI(grandExchangeOffer.getItemId(), L.get(i4).intValue())) {
                                    ?? r0 = llllIIIll[1];
                                    "".length();
                                    return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llllIIIll[0];
                            }).collect(Collectors.toList())).size())) {
                                i = llllIIIll[1];
                                "".length();
                                if ((33 ^ 37) <= (-" ".length())) {
                                    return;
                                }
                            } else {
                                i = llllIIIll[0];
                            }
                            int i5 = i;
                            if (llIIlllIIIll(i5) && llIIlllIIllI(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (llIIlllIlIlI(grandExchangeOffer2.getItemId(), L.get(i4).intValue())) {
                                    ?? r0 = llllIIIll[1];
                                    "".length();
                                    return (-"  ".length()) >= 0 ? (!true) & ((true ^ true) ^ true) : r0;
                                }
                                return llllIIIll[0];
                            }).collect(Collectors.toList())).size(), llllIIIll[1])) {
                                GrandExchange.abortOffer(L.get(i3).intValue());
                            }
                            if (llIIlllIIIlI(i5)) {
                                if (!llIIlllIIIll(GrandExchange.isBuying() ? 1 : 0) || llIIlllIlIII(GrandExchange.getItemId(), L.get(i3).intValue())) {
                                    a(L.get(i3).intValue());
                                }
                                if (llIIlllIlIlI(GrandExchange.getItemId(), L.get(i3).intValue()) && llIIlllIlIII(GrandExchange.getQuantity(), M.get(i3).intValue())) {
                                    GrandExchange.setQuantity(M.get(i3).intValue());
                                }
                                int llIIIllllIllI = N.get(i3).intValue();
                                int i6 = llllIIIll[0];
                                Widget widget = Widgets.get(llllIIIll[10], llllIIIll[11]);
                                if (llIIlllIIIll(GrandExchange.isOpen() ? 1 : 0) && llIIlllIIIll(GrandExchange.isBuying() ? 1 : 0) && llIIlllIlIll(widget) && llIIlllIIIlI(widget.getText().isEmpty() ? 1 : 0)) {
                                    int guidePrice = GrandExchange.getGuidePrice();
                                    i6 = guidePrice;
                                    System.out.println("Guide price: " + guidePrice + "|Given price: " + String.valueOf(N.get(i3)));
                                }
                                if (llIIlllIIlIl(i6, llIIIllllIllI)) {
                                    if (llIIlllIIllI(i6, llllIIIll[12])) {
                                        d = 0.1d;
                                        "".length();
                                        if ((" ".length() & (" ".length() ^ (-1))) != 0) {
                                            return;
                                        }
                                    } else {
                                        d = 0.3d;
                                    }
                                    int i7 = (int) (i6 + (i6 * d));
                                    System.out.println("Increased price: " + i7);
                                    if (llIIlllIlIlI(GrandExchange.getItemId(), L.get(i3).intValue()) && llIIlllIlIII(GrandExchange.getPrice(), i7)) {
                                        GrandExchange.setPrice(i7);
                                    }
                                    if (llIIlllIlIlI(GrandExchange.getItemId(), L.get(i3).intValue()) && llIIlllIlIlI(GrandExchange.getPrice(), i7)) {
                                        GrandExchange.confirm();
                                    }
                                    "".length();
                                    if ((-" ".length()) > 0) {
                                        return;
                                    }
                                } else {
                                    if (llIIlllIlIlI(GrandExchange.getItemId(), L.get(i3).intValue()) && llIIlllIlIII(GrandExchange.getPrice(), N.get(i3).intValue())) {
                                        GrandExchange.setPrice(N.get(i3).intValue());
                                    }
                                    if (llIIlllIlIlI(GrandExchange.getItemId(), L.get(i3).intValue()) && llIIlllIlIlI(GrandExchange.getPrice(), N.get(i3).intValue())) {
                                        GrandExchange.confirm();
                                    }
                                }
                            }
                        }
                        if (llIIlllIIIlI(Worlds.inMembersWorld() ? 1 : 0)) {
                            System.out.println(llllIIIII[llllIIIll[8]]);
                            AccBuilderGWD.d = llllIIIll[1];
                            return;
                        }
                        if (llIIlllIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                            GrandExchange.open();
                        }
                        if (llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[13])) {
                            Movement.walkTo(K);
                            "".length();
                            Time.sleepTicks(llllIIIll[1]);
                            "".length();
                        }
                        if (llIIlllIIIll(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (llIIlllIIIlI(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = llllIIIll[1];
                                    "".length();
                                    return "  ".length() <= 0 ? ((18 ^ 114) ^ (61 ^ 112)) & (((129 ^ 174) ^ "  ".length()) ^ (-" ".length())) : r0;
                                }
                                return llllIIIll[0];
                            }, llllIIIll[5]);
                            "".length();
                        }
                        if (llIIlllIlIlI(L.get(i3).intValue(), llllIIIll[14])) {
                            int[] iArr7 = new int[llllIIIll[1]];
                            iArr7[llllIIIll[0]] = llllIIIll[14];
                            if (!llIIlllIIIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                                L.remove(llllIIIll[0]);
                                "".length();
                                M.remove(llllIIIll[0]);
                                "".length();
                                N.remove(llllIIIll[0]);
                                "".length();
                                list.remove(llllIIIll[0]);
                                "".length();
                                Time.sleepTicks(llllIIIll[8]);
                                "".length();
                                "".length();
                                if ((-"  ".length()) <= 0) {
                                    return;
                                }
                            }
                        }
                        if (llIIlllIlIlI(L.get(i3).intValue(), llllIIIll[15])) {
                            L.remove(llllIIIll[0]);
                            "".length();
                            M.remove(llllIIIll[0]);
                            "".length();
                            N.remove(llllIIIll[0]);
                            "".length();
                            list.remove(llllIIIll[0]);
                            "".length();
                            Time.sleepTicks(llllIIIll[8]);
                            "".length();
                            "".length();
                            if ((-"  ".length()) <= 0) {
                            }
                        } else {
                            if (llIIlllIlIlI(L.get(i3).intValue(), llllIIIll[16])) {
                                int[] iArr8 = new int[llllIIIll[1]];
                                iArr8[llllIIIll[0]] = llllIIIll[16];
                                if (llIIlllIIIll(Inventory.contains(iArr8) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    "".length();
                                    M.remove(llllIIIll[0]);
                                    "".length();
                                    N.remove(llllIIIll[0]);
                                    "".length();
                                    list.remove(llllIIIll[0]);
                                    "".length();
                                    Time.sleepTicks(llllIIIll[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() > "   ".length()) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlllIlIlI(L.get(i3).intValue(), llllIIIll[17])) {
                                int[] iArr9 = new int[llllIIIll[1]];
                                iArr9[llllIIIll[0]] = llllIIIll[18];
                                if (llIIlllIIIll(Inventory.contains(iArr9) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    "".length();
                                    M.remove(llllIIIll[0]);
                                    "".length();
                                    N.remove(llllIIIll[0]);
                                    "".length();
                                    list.remove(llllIIIll[0]);
                                    "".length();
                                    Time.sleepTicks(llllIIIll[8]);
                                    "".length();
                                    "".length();
                                    if ("  ".length() < 0) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlllIlIlI(L.get(i3).intValue(), llllIIIll[19])) {
                                int[] iArr10 = new int[llllIIIll[1]];
                                iArr10[llllIIIll[0]] = llllIIIll[19];
                                if (llIIlllIIIll(Inventory.contains(iArr10) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    "".length();
                                    M.remove(llllIIIll[0]);
                                    "".length();
                                    N.remove(llllIIIll[0]);
                                    "".length();
                                    list.remove(llllIIIll[0]);
                                    "".length();
                                    Time.sleepTicks(llllIIIll[8]);
                                    "".length();
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlllIlIlI(L.get(i3).intValue(), llllIIIll[20])) {
                                int[] iArr11 = new int[llllIIIll[1]];
                                iArr11[llllIIIll[0]] = llllIIIll[20];
                                if (llIIlllIIIll(Inventory.contains(iArr11) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    "".length();
                                    M.remove(llllIIIll[0]);
                                    "".length();
                                    N.remove(llllIIIll[0]);
                                    "".length();
                                    list.remove(llllIIIll[0]);
                                    "".length();
                                    Time.sleepTicks(llllIIIll[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() <= (((133 ^ 168) ^ (50 ^ 43)) & (((((23 + 34) - 17) + 113) ^ (((125 + 117) - 95) + 26)) ^ (-" ".length())))) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlllIlIlI(L.get(i3).intValue(), llllIIIll[21])) {
                                int[] iArr12 = new int[llllIIIll[1]];
                                iArr12[llllIIIll[0]] = llllIIIll[21];
                                if (llIIlllIIIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    "".length();
                                    M.remove(llllIIIll[0]);
                                    "".length();
                                    N.remove(llllIIIll[0]);
                                    "".length();
                                    list.remove(llllIIIll[0]);
                                    "".length();
                                    Time.sleepTicks(llllIIIll[8]);
                                    "".length();
                                    "".length();
                                    if ("   ".length() < 0) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlllIlIlI(L.get(i3).intValue(), llllIIIll[22])) {
                                String[] strArr = new String[llllIIIll[1]];
                                strArr[llllIIIll[0]] = llllIIIII[llllIIIll[4]];
                                if (llIIlllIIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[llllIIIll[1]];
                                    strArr2[llllIIIll[0]] = llllIIIII[llllIIIll[7]];
                                    if (llIIlllIIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                L.remove(llllIIIll[0]);
                                "".length();
                                M.remove(llllIIIll[0]);
                                "".length();
                                N.remove(llllIIIll[0]);
                                "".length();
                                list.remove(llllIIIll[0]);
                                "".length();
                                Time.sleepTicks(llllIIIll[8]);
                                "".length();
                                "".length();
                                if ((((((187 + 162) - 285) + 132) ^ (((140 + 16) - 136) + 124)) & (((43 ^ 81) ^ (92 ^ 114)) ^ (-" ".length()))) > 0) {
                                    return;
                                }
                            }
                            if (!llIIlllIIIlI(a(c) ? 1 : 0)) {
                                break;
                            } else if (llIIlllIIIll(AccBuilderGWD.d ? 1 : 0)) {
                                "".length();
                                if ((-" ".length()) == ((46 ^ 70) ^ (38 ^ 74))) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(llllIIIll[4]);
                                "".length();
                                "".length();
                                if (" ".length() <= 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
