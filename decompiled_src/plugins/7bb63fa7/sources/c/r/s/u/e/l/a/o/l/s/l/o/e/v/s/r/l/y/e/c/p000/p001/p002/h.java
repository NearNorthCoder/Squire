package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

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
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.h  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/h.class */
public class h {
    public static /* synthetic */ List<Integer> af;
    public static /* synthetic */ List<Integer> ae;
    public static final /* synthetic */ WorldPoint ac;
    public static /* synthetic */ List<Integer> ad;
    private static /* synthetic */ String[] lIIIl;
    private static /* synthetic */ int[] lIIlI;

    private static boolean lIlIIll(int i) {
        return i == 0;
    }

    static {
        lIlIIlI();
        lIlIIIl();
        ac = new WorldPoint(lIIlI[36], lIIlI[37], lIIlI[0]);
        ad = new ArrayList();
        ae = new ArrayList();
        af = new ArrayList();
    }

    private static void lIlIIIl() {
        lIIIl = new String[lIIlI[38]];
        lIIIl[lIIlI[0]] = lIIlllI("cU64pHBxhRQ=", "Dpbif");
        lIIIl[lIIlI[1]] = lIIlllI("uMWTSA2HEj6ks92R4q1Icg==", "RTOpu");
        lIIIl[lIIlI[8]] = lIIlllI("ObDGQLNmt2tOaBqyNm3gDAZMRVgRO9Z89p4yeK1Ir+OI0eWc2Yjm0Q==", "yCMiW");
        lIIIl[lIIlI[4]] = lIIllll("Ky4DOiIcL048IBwmTiY8GCUaLHQJKh0mdB85ATh0FSIdIQ==", "yKnUT");
        lIIIl[lIIlI[7]] = lIlIIII("TMn1Krzwlf/kAcWpy0NklQTYJY9fEUTA6KX2ARHc9Og=", "EJbAo");
        lIIIl[lIIlI[17]] = lIlIIII("ZN/Wd46aDJPWIIvpGpbLZk9Tr9eZJ0z5q4PLNclXjjpGQbLDCSTniQ==", "XPFtH");
        lIIIl[lIIlI[19]] = lIlIIII("W0nm9o/3SPfjJROvMcHe4j12ZQ7vMZNF0PRd7tGrEpFqNqk64yhuOA==", "rpZBt");
        lIIIl[lIIlI[21]] = lIlIIII("qeOio9CmPRKXoe51yftemnRfJQ4sWNJ3q56fjMQi9w8=", "AfpRN");
        lIIIl[lIIlI[23]] = lIlIIII("FvCMwRgOuIg50HeM8ijVLML2F/WD1Mt8", "mgvFJ");
        lIIIl[lIIlI[24]] = lIlIIII("koUHiQq66pp7gv3TmLtmAxltldJKwtR1", "WLBwL");
        lIIIl[lIIlI[3]] = lIIllll("JyE0GA4QIHkeDBApeQQMFCkwGRlVIisYFVUoMAQM", "uDYwx");
        lIIIl[lIIlI[25]] = lIIlllI("YF/h7HUSUyIdU3CRp7cqiMYqlXKRNNSyDtWNbzVOm4A=", "eemxP");
        lIIIl[lIIlI[28]] = lIIlllI("lWXyf2F22Uk=", "GAMNT");
        lIIIl[lIIlI[29]] = lIIllll("bhc3BCMjF38=", "FcVfO");
        lIIIl[lIIlI[30]] = lIlIIII("kEAW1+Lr3Jw=", "akkqR");
        lIIIl[lIIlI[32]] = lIlIIII("h20btqU8uSo=", "bBQIg");
        lIIIl[lIIlI[33]] = lIlIIII("vxxk5CGm5cs=", "YyuDq");
        lIIIl[lIIlI[34]] = lIIllll("BR0SBSAa", "rxsiT");
        lIIIl[lIIlI[35]] = lIIllll("Jh0PLlU7EkE+EDUYFSFVfA==", "TtaIu");
    }

    private static boolean lIlIlII(int i) {
        return i != 0;
    }

    private static boolean lIlIlll(int i, int i2) {
        return i > i2;
    }

    private static String lIIlllI(String lllllIlIIIlllll, String lllllIlIIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlIIlIIIll = Cipher.getInstance("Blowfish");
            lllllIlIIlIIIll.init(lIIlI[8], secretKeySpec);
            return new String(lllllIlIIlIIIll.doFinal(Base64.getDecoder().decode(lllllIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIlIIlIIIlI) {
            lllllIlIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIII(String lllllIlIIIlIlII, String lllllIlIIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIlIIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIlI[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllIlIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIlIIIlIlIl) {
            lllllIlIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlI() {
        lIIlI = new int[39];
        lIIlI[0] = (116 ^ 88) & ((26 ^ 54) ^ (-1));
        lIIlI[1] = " ".length();
        lIIlI[2] = (-2069) & 3063;
        lIIlI[3] = (36 ^ 23) ^ (18 ^ 43);
        lIIlI[4] = "   ".length();
        lIIlI[5] = (-((-16537) & 17662)) & (-17) & 6141;
        lIIlI[6] = (-24729) & 32735;
        lIIlI[7] = (237 ^ 193) ^ (75 ^ 99);
        lIIlI[8] = "  ".length();
        lIIlI[9] = (-((-8217) & 30010)) & (-8209) & 30715;
        lIIlI[10] = (-((-17411) & 19775)) & (-8193) & 130556;
        lIIlI[11] = (-31317) & 31742;
        lIIlI[12] = (-((-7105) & 23521)) & (-8197) & 27631;
        lIIlI[13] = (-((-8493) & 31213)) & (-2) & 24575;
        lIIlI[14] = (-((-2853) & 31655)) & (-1) & 30719;
        lIIlI[15] = (-10369) & 12286;
        lIIlI[16] = (-((-53) & 30839)) & (-1041) & 32254;
        lIIlI[17] = (0 ^ 21) ^ (27 ^ 11);
        lIIlI[18] = (-((-3141) & 27749)) & (-3) & 32623;
        lIIlI[19] = 59 ^ 61;
        lIIlI[20] = (-((-4897) & 29665)) & (-7683) & 32723;
        lIIlI[21] = 194 ^ 197;
        lIIlI[22] = (-3725) & 16349;
        lIIlI[23] = 152 ^ 144;
        lIIlI[24] = (((84 + 94) - 60) + 44) ^ (((7 + 99) - 46) + 111);
        lIIlI[25] = 141 ^ 134;
        lIIlI[26] = (-((-24691) & 27254)) & (-8321) & 16383;
        lIIlI[27] = -" ".length();
        lIIlI[28] = 86 ^ 90;
        lIIlI[29] = 146 ^ 159;
        lIIlI[30] = (149 ^ 196) ^ (239 ^ 176);
        lIIlI[31] = (-((-497) & 32767)) & (-33) & 32767;
        lIIlI[32] = (175 ^ 157) ^ (41 ^ 20);
        lIIlI[33] = 86 ^ 70;
        lIIlI[34] = (47 ^ 41) ^ (208 ^ 199);
        lIIlI[35] = 132 ^ 150;
        lIIlI[36] = (-((-18521) & 19291)) & (-4097) & 8031;
        lIIlI[37] = (-4194) & 7679;
        lIIlI[38] = (175 ^ 185) ^ (168 ^ 173);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(String str) {
        List all = Inventory.getAll();
        if (lIlIIll(all.isEmpty() ? 1 : 0)) {
            String lllllIlIIlllIll = null;
            if (lIlIlII(str.contains(lIIIl[lIIlI[28]]) ? 1 : 0)) {
                lllllIlIIlllIll = str.replace(lIIIl[lIIlI[29]], lIIIl[lIIlI[30]]).trim();
            }
            int i = lIIlI[0];
            while (lIlIlIl(i, all.size())) {
                String name = ((Item) all.get(i)).getName();
                if (lIlllII(name)) {
                    if (lIlIlII(name.contains(str) ? 1 : 0)) {
                        return lIIlI[1];
                    }
                    if (lIlllII(lllllIlIIlllIll) && lIlIlII(name.contains(lllllIlIIlllIll) ? 1 : 0)) {
                        return lIIlI[1];
                    }
                }
                i++;
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIlI[0];
    }

    private static boolean lIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlllII(Object obj) {
        return obj != null;
    }

    public static void P() {
        Widget widget = Widgets.get(lIIlI[31], lIIlI[8], lIIlI[25]);
        if (lIlllII(widget)) {
            widget.interact(lIIIl[lIIlI[32]]);
            Time.sleepTicks(lIIlI[8]);
            "".length();
        }
    }

    private static boolean lIllIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0b03, code lost:
        if (lIlIlII(net.unethicalite.api.items.GrandExchange.canCollect() ? 1 : 0) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0b06, code lost:
        net.unethicalite.api.items.GrandExchange.collect();
        net.unethicalite.api.commons.Time.sleepUntil(() -> { // java.util.function.BooleanSupplier.getAsBoolean():boolean
            return T();
        }, c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0b1c, code lost:
        java.lang.System.out.println(r7.get(r8).Z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0b47, code lost:
        if (lIllIll(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.ad.get(r8).intValue(), c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[12]) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0b4a, code lost:
        java.lang.System.out.println(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIIl[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[25]]);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.ad.remove(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[0]);
        "".length();
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.ae.remove(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[0]);
        "".length();
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.af.remove(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[0]);
        "".length();
        r7.remove(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0bab, code lost:
        if (lIlIlII(b(r0) ? 1 : 0) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0bae, code lost:
        java.lang.System.out.println("Removed item " + r0 + " from list");
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.ad.remove(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[0]);
        "".length();
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.ae.remove(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[0]);
        "".length();
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.af.remove(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[0]);
        "".length();
        r7.remove(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0c04, code lost:
        net.unethicalite.api.commons.Time.sleepTicks(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.h.lIIlI[8]);
        "".length();
        r8 = r8 + 1;
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0c36, code lost:
        if (((true ^ true) ^ (true ^ true)) == ((true ^ true) ^ (true ^ true))) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0c39, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0658 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<j> list) {
        int i;
        if (lIlIIll(list.isEmpty() ? 1 : 0) && lIlIlII(ad.isEmpty() ? 1 : 0)) {
            int i2 = lIIlI[0];
            while (lIlIlIl(i2, list.size())) {
                ad.add(Integer.valueOf(list.get(i2).Z()));
                "".length();
                ae.add(Integer.valueOf(list.get(i2).aa()));
                "".length();
                af.add(Integer.valueOf(list.get(i2).ab()));
                "".length();
                i2++;
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
        int[] iArr = new int[lIIlI[1]];
        iArr[lIIlI[0]] = lIIlI[2];
        if (!lIlIllI(Inventory.getCount(iArr), lIIlI[1]) || lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
            if (lIlIlII(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lIIlI[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(lIIIl[lIIlI[35]]);
                };
                if (lIlIlII(Bank.contains(predicate) ? 1 : 0) && lIlIIll(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIIIl[lIIlI[34]]);
                }) ? 1 : 0) && lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                    Bank.withdraw(predicate, lIIlI[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(lIIlI[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlI(Inventory.getCount(predicate))) {
                            ?? r0 = lIIlI[1];
                            "".length();
                            return " ".length() > " ".length() ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                        }
                        return lIIlI[0];
                    }, lIIlI[5]);
                    "".length();
                }
                if (lIlIIll(Bank.contains(m.bW) ? 1 : 0) && lIlIIll(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIIl[lIIlI[33]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlI[1]];
                    iArr2[lIIlI[0]] = lIIlI[6];
                    if (lIlIlII(Bank.contains(iArr2) ? 1 : 0) && lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                        Bank.withdraw(lIIlI[6], lIIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlI[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[lIIlI[1]];
                            iArr3[lIIlI[0]] = lIIlI[6];
                            if (lIllIlI(Inventory.getCount(iArr3))) {
                                ?? r0 = lIIlI[1];
                                "".length();
                                return " ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlI[0];
                        }, lIIlI[5]);
                        "".length();
                    }
                }
                if (lIllIII(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                    int[] iArr3 = new int[lIIlI[1]];
                    iArr3[lIIlI[0]] = lIIlI[2];
                    if (lIlIlIl(Inventory.getCount(iArr3), lIIlI[1])) {
                        Bank.withdrawAll(lIIlI[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlI[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIIlI[1]];
                            iArr4[lIIlI[0]] = lIIlI[2];
                            return Inventory.contains(iArr4);
                        }, lIIlI[5]);
                        "".length();
                    }
                }
            }
            if (lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                if (lIlIlII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(lIIlI[7]);
                    "".length();
                }
                if (lIlIIll(Bank.isOpen() ? 1 : 0)) {
                    if (lIlIlII(Inventory.contains(m.bW) ? 1 : 0)) {
                        Inventory.getFirst(m.bW).interact(lIIIl[lIIlI[0]]);
                        Time.sleepTicks(lIIlI[8]);
                        "".length();
                    }
                    if (lIlIlII(Equipment.contains(m.bW) ? 1 : 0) && lIllIIl(Players.getLocal().getAnimation(), lIIlI[9])) {
                        Equipment.getFirst(m.bW).interact(lIIIl[lIIlI[1]]);
                        Time.sleepTicks(lIIlI[4]);
                        "".length();
                    }
                    Movement.walkTo(ac);
                    "".length();
                }
            }
        }
        if (lIlIIll(Bank.isOpen() ? 1 : 0) && lIllIII(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
            int[] iArr4 = new int[lIIlI[1]];
            iArr4[lIIlI[0]] = lIIlI[2];
            if (lIlIlIl(Inventory.getCount(iArr4), lIIlI[1])) {
                g.G();
            }
        }
        if (lIlIIll(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[lIIlI[1]];
            iArr5[lIIlI[0]] = lIIlI[2];
            if (lIllIlI(Inventory.getCount(iArr5)) && lIllIII(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, lIIlI[5]);
                "".length();
            }
        }
        if (lIlIlII(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[lIIlI[1]];
            iArr6[lIIlI[0]] = lIIlI[2];
            if (lIllIlI(Inventory.getCount(iArr6))) {
                int i3 = lIIlI[0];
                while (lIlIlIl(i3, ad.size())) {
                    String a = i.a(ad.get(i3).intValue());
                    System.out.println("Buying " + a + " and itemID is: " + String.valueOf(ad.get(i3)));
                    while (true) {
                        if (!lIlIIll(b(a) ? 1 : 0)) {
                            break;
                        }
                        if (lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                            int i4 = i3;
                            if (lIllIlI(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (lIllIll(grandExchangeOffer.getItemId(), ad.get(i4).intValue())) {
                                    ?? r0 = lIIlI[1];
                                    "".length();
                                    return (-(67 ^ 71)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlI[0];
                            }).collect(Collectors.toList())).size())) {
                                i = lIIlI[1];
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            } else {
                                i = lIIlI[0];
                            }
                            int i5 = i;
                            if (lIlIlII(i5) && lIlIlll(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (lIllIll(grandExchangeOffer2.getItemId(), ad.get(i4).intValue())) {
                                    ?? r0 = lIIlI[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlI[0];
                            }).collect(Collectors.toList())).size(), lIIlI[1])) {
                                GrandExchange.abortOffer(ad.get(i3).intValue());
                            }
                            if (lIlIIll(i5)) {
                                if (lIlIlII(GrandExchange.buy(ad.get(i3).intValue(), ae.get(i3).intValue(), af.get(i3).intValue()) ? 1 : 0)) {
                                    Time.sleepTicks(lIIlI[7]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        return GrandExchange.canCollect();
                                    }, lIIlI[10]);
                                    "".length();
                                }
                                if (lIllIll(GrandExchange.getItemId(), ad.get(i3).intValue()) && lIllIIl(GrandExchange.getQuantity(), ae.get(i3).intValue())) {
                                    GrandExchange.setQuantity(ae.get(i3).intValue());
                                }
                                if (lIllIll(GrandExchange.getItemId(), ad.get(i3).intValue()) && lIllIIl(GrandExchange.getPrice(), af.get(i3).intValue())) {
                                    GrandExchange.setPrice(af.get(i3).intValue());
                                }
                            }
                        }
                        if (lIlIlII(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = lIIlI[1];
                                    "".length();
                                    return (-" ".length()) == (184 ^ 188) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlI[0];
                            }, lIIlI[5]);
                            "".length();
                        }
                        if (lIllIll(ad.get(i3).intValue(), lIIlI[11])) {
                            int[] iArr7 = new int[lIIlI[1]];
                            iArr7[lIIlI[0]] = lIIlI[11];
                            if (!lIlIIll(Inventory.contains(iArr7) ? 1 : 0)) {
                                ad.remove(lIIlI[0]);
                                "".length();
                                ae.remove(lIIlI[0]);
                                "".length();
                                af.remove(lIIlI[0]);
                                "".length();
                                list.remove(lIIlI[0]);
                                "".length();
                                Time.sleepTicks(lIIlI[8]);
                                "".length();
                                System.out.println(lIIIl[lIIlI[8]]);
                                "".length();
                                if ("  ".length() > " ".length()) {
                                    return;
                                }
                            }
                        }
                        if (lIllIll(ad.get(i3).intValue(), lIIlI[12])) {
                            ad.remove(lIIlI[0]);
                            "".length();
                            ae.remove(lIIlI[0]);
                            "".length();
                            af.remove(lIIlI[0]);
                            "".length();
                            list.remove(lIIlI[0]);
                            "".length();
                            Time.sleepTicks(lIIlI[8]);
                            "".length();
                            System.out.println(lIIIl[lIIlI[8]]);
                            "".length();
                            if ("  ".length() > " ".length()) {
                            }
                        } else {
                            if (lIllIll(ad.get(i3).intValue(), lIIlI[13])) {
                                int[] iArr8 = new int[lIIlI[1]];
                                iArr8[lIIlI[0]] = lIIlI[13];
                                if (lIlIlII(Inventory.contains(iArr8) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    "".length();
                                    ae.remove(lIIlI[0]);
                                    "".length();
                                    af.remove(lIIlI[0]);
                                    "".length();
                                    list.remove(lIIlI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlI[8]);
                                    "".length();
                                    System.out.println(lIIIl[lIIlI[4]]);
                                    "".length();
                                    if ("   ".length() <= (-" ".length())) {
                                        return;
                                    }
                                }
                            }
                            if (lIllIll(ad.get(i3).intValue(), lIIlI[14])) {
                                int[] iArr9 = new int[lIIlI[1]];
                                iArr9[lIIlI[0]] = lIIlI[15];
                                if (lIlIlII(Inventory.contains(iArr9) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    "".length();
                                    ae.remove(lIIlI[0]);
                                    "".length();
                                    af.remove(lIIlI[0]);
                                    "".length();
                                    list.remove(lIIlI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlI[8]);
                                    "".length();
                                    System.out.println(lIIIl[lIIlI[7]]);
                                    "".length();
                                    if (" ".length() == 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIllIll(ad.get(i3).intValue(), lIIlI[16])) {
                                int[] iArr10 = new int[lIIlI[1]];
                                iArr10[lIIlI[0]] = lIIlI[16];
                                if (lIlIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    "".length();
                                    ae.remove(lIIlI[0]);
                                    "".length();
                                    af.remove(lIIlI[0]);
                                    "".length();
                                    list.remove(lIIlI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlI[8]);
                                    "".length();
                                    System.out.println(lIIIl[lIIlI[17]]);
                                    "".length();
                                    if (" ".length() != " ".length()) {
                                        return;
                                    }
                                }
                            }
                            if (lIllIll(ad.get(i3).intValue(), lIIlI[18])) {
                                int[] iArr11 = new int[lIIlI[1]];
                                iArr11[lIIlI[0]] = lIIlI[18];
                                if (lIlIlII(Inventory.contains(iArr11) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    "".length();
                                    ae.remove(lIIlI[0]);
                                    "".length();
                                    af.remove(lIIlI[0]);
                                    "".length();
                                    list.remove(lIIlI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlI[8]);
                                    "".length();
                                    System.out.println(lIIIl[lIIlI[19]]);
                                    "".length();
                                    if ("  ".length() >= (133 ^ 129)) {
                                        return;
                                    }
                                }
                            }
                            if (lIllIll(ad.get(i3).intValue(), lIIlI[20])) {
                                int[] iArr12 = new int[lIIlI[1]];
                                iArr12[lIIlI[0]] = lIIlI[20];
                                if (lIlIlII(Inventory.contains(iArr12) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    "".length();
                                    ae.remove(lIIlI[0]);
                                    "".length();
                                    af.remove(lIIlI[0]);
                                    "".length();
                                    list.remove(lIIlI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlI[8]);
                                    "".length();
                                    System.out.println(lIIIl[lIIlI[21]]);
                                    "".length();
                                    if (" ".length() != " ".length()) {
                                        return;
                                    }
                                }
                            }
                            if (lIllIll(ad.get(i3).intValue(), lIIlI[22])) {
                                String[] strArr = new String[lIIlI[1]];
                                strArr[lIIlI[0]] = lIIIl[lIIlI[23]];
                                if (lIlIIll(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[lIIlI[1]];
                                    strArr2[lIIlI[0]] = lIIIl[lIIlI[24]];
                                    if (lIlIlII(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                ad.remove(lIIlI[0]);
                                "".length();
                                ae.remove(lIIlI[0]);
                                "".length();
                                af.remove(lIIlI[0]);
                                "".length();
                                list.remove(lIIlI[0]);
                                "".length();
                                Time.sleepTicks(lIIlI[8]);
                                "".length();
                                System.out.println(lIIIl[lIIlI[3]]);
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            }
                            if (!lIlIIll(b(a) ? 1 : 0)) {
                                break;
                            } else if (lIlIlII(Clues.d ? 1 : 0)) {
                                "".length();
                                if (" ".length() != " ".length()) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(lIIlI[4]);
                                "".length();
                                "".length();
                                if (((64 ^ 101) & ((101 ^ 64) ^ (-1))) < 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIllIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIl(int i, int i2) {
        return i != i2;
    }

    public static void b(List<Integer> list) {
        if (lIlIIll(GrandExchange.isOpen() ? 1 : 0)) {
            if (lIlIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIlIIll(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (lIlIlII(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(lIIlI[8]);
            "".length();
            int i = lIIlI[0];
            while (lIlIlIl(i, list.size())) {
                int[] iArr = new int[lIIlI[1]];
                iArr[lIIlI[0]] = list.get(i).intValue();
                if (lIllIlI(Inventory.getCount(iArr))) {
                    if (lIlIIll(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[lIIlI[1]];
                        iArr2[lIIlI[0]] = list.get(i).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(lIIlI[8]);
                        "".length();
                        int i2 = i;
                        Time.sleepUntil(() -> {
                            if (lIllIll(GrandExchange.getItemId(), ((Integer) list.get(i2)).intValue())) {
                                ?? r0 = lIIlI[1];
                                "".length();
                                return " ".length() <= ((173 ^ 152) & ((70 ^ 115) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlI[0];
                        }, lIIlI[26]);
                        "".length();
                    }
                    if (lIlIlII(GrandExchange.isSelling() ? 1 : 0)) {
                        if (lIllIIl(GrandExchange.getPrice(), lIIlI[27])) {
                            GrandExchange.setPrice(lIIlI[1]);
                            Time.sleepTicks(lIIlI[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIllIll(GrandExchange.getPrice(), lIIlI[1])) {
                                    ?? r0 = lIIlI[1];
                                    "".length();
                                    return "   ".length() >= ((123 ^ 77) ^ (141 ^ 191)) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                                }
                                return lIIlI[0];
                            }, lIIlI[26]);
                            "".length();
                        }
                        if (lIllIll(GrandExchange.getPrice(), lIIlI[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, lIIlI[26]);
                            "".length();
                        }
                    }
                    if (lIlIlII(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lIIlI[1];
                                "".length();
                                return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlI[0];
                        }, lIIlI[5]);
                        "".length();
                    }
                }
                i++;
                "".length();
                if ((-((211 ^ 160) ^ (103 ^ 16))) > 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIllIlI(int i) {
        return i > 0;
    }

    private static String lIIllll(String lllllIlIIIIIlII, String lllllIlIIIIIIll) {
        String lllllIlIIIIIlII2 = new String(Base64.getDecoder().decode(lllllIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIlIIIIIIlI = new StringBuilder();
        char[] lllllIlIIIIIIIl = lllllIlIIIIIIll.toCharArray();
        int lllllIlIIIIIIII = lIIlI[0];
        char[] charArray = lllllIlIIIIIlII2.toCharArray();
        int length = charArray.length;
        int lllllIIlllllIII = lIIlI[0];
        while (lIlIlIl(lllllIIlllllIII, length)) {
            lllllIlIIIIIIlI.append((char) (charArray[lllllIIlllllIII] ^ lllllIlIIIIIIIl[lllllIlIIIIIIII % lllllIlIIIIIIIl.length]));
            "".length();
            lllllIlIIIIIIII++;
            lllllIIlllllIII++;
            "".length();
            if ((99 ^ 103) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllIlIIIIIIlI);
    }
}
