package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/b.class */
public class C0001b {
    private static /* synthetic */ int[] lIlIIlIIII;
    public static /* synthetic */ List<Integer> L;
    private static /* synthetic */ String[] lIlIIIlllI;
    public static final /* synthetic */ WorldPoint I;
    public static /* synthetic */ List<Integer> J;
    public static /* synthetic */ List<Integer> K;

    private static void lIIIlIlIllIIl() {
        lIlIIIlllI = new String[lIlIIlIIII[32]];
        lIlIIIlllI[lIlIIlIIII[0]] = lIIIlIlIlIlIl("N8yQgy1EM98=", "KzhrD");
        lIlIIIlllI[lIlIIlIIII[1]] = lIIIlIlIlIlIl("UU3h6eycEzq59wt++DzwdA==", "gUmtC");
        lIlIIIlllI[lIlIIlIIII[8]] = lIIIlIlIlIllI("cq9eSzNY4vs3IPAquxXK6q60HZpEWMHr6rwTxguxnDIqVUKs7OmJCtiz6V4BqlnugDL6B+yQdy4=", "PAzZE");
        lIlIIIlllI[lIlIIlIIII[4]] = lIIIlIlIlIlll("AAYCJBs9E0M5HScbDCdaZ1s=", "SrcIr");
        lIlIIIlllI[lIlIIlIIII[7]] = lIIIlIlIlIlll("FjYOKiMrI083JTErAClqbXZG", "EBoGJ");
        lIlIIIlllI[lIlIIlIIII[25]] = lIIIlIlIlIlll("FyojOygX", "cKAWM");
        lIlIIIlllI[lIlIIlIIII[26]] = lIIIlIlIlIllI("KsYEO9bbUcigylPcXIMH4g==", "QCXOL");
        lIlIIIlllI[lIlIIlIIII[13]] = lIIIlIlIlIlIl("bUrPDKEH424=", "GgLzE");
        lIlIIIlllI[lIlIIlIIII[28]] = lIIIlIlIlIlIl("GcZNw6u1+os=", "bARoe");
        lIlIIIlllI[lIlIIlIIII[29]] = lIIIlIlIlIlIl("Ag3cpVoZFLg=", "xwjgz");
        lIlIIIlllI[lIlIIlIIII[3]] = lIIIlIlIlIlIl("Ml1eWMfJhK8=", "yMZmA");
        lIlIIIlllI[lIlIIlIIII[27]] = lIIIlIlIlIlll("AwIKA3IeDUQTNxAHEAxyWQ==", "qkddR");
    }

    private static boolean lIIIlIllIIIIl(int i, int i2) {
        return i > i2;
    }

    static {
        lIIIlIlIlllII();
        lIIIlIlIllIIl();
        I = new WorldPoint(lIlIIlIIII[30], lIlIIlIIII[31], lIlIIlIIII[0]);
        J = new ArrayList();
        K = new ArrayList();
        L = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(String str) {
        List all = Inventory.getAll();
        if (lIIIlIlIlllIl(all.isEmpty() ? 1 : 0)) {
            String str2 = null;
            if (lIIIlIlIllllI(str.contains(lIlIIIlllI[lIlIIlIIII[25]]) ? 1 : 0)) {
                str2 = str.replace(lIlIIIlllI[lIlIIlIIII[26]], lIlIIIlllI[lIlIIlIIII[13]]).trim();
            }
            int i = lIlIIlIIII[0];
            while (lIIIlIlIlllll(i, all.size())) {
                String name = ((Item) all.get(i)).getName();
                if (lIIIlIllIIllI(name)) {
                    if (lIIIlIlIllllI(name.contains(str) ? 1 : 0)) {
                        return lIlIIlIIII[1];
                    }
                    if (lIIIlIllIIllI(str2) && lIIIlIlIllllI(name.contains(str2) ? 1 : 0)) {
                        return lIlIIlIIII[1];
                    }
                }
                i++;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIlIIlIIII[0];
    }

    private static boolean lIIIlIlIlllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIllIIIII(int i, int i2) {
        return i >= i2;
    }

    public static void g() {
        Widget widget = Widgets.get(lIlIIlIIII[10], lIlIIlIIII[8], lIlIIlIIII[27]);
        if (lIIIlIllIIllI(widget)) {
            widget.interact(lIlIIIlllI[lIlIIlIIII[28]]);
            Time.sleepTicks(lIlIIlIIII[8]);
            "".length();
        }
    }

    private static boolean lIIIlIlIlllIl(int i) {
        return i == 0;
    }

    public static void a(int i) {
        int intValue;
        if (lIIIlIlIlllIl(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (lIIIlIlIllllI(Static.getClient().isItemDefinitionCached(i) ? 1 : 0)) {
            intValue = Static.getClient().getItemComposition(i).getLinkedNoteId();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else {
            intValue = ((Integer) GameThread.invokeLater(() -> {
                return Integer.valueOf(Static.getClient().getItemComposition(i).getLinkedNoteId());
            })).intValue();
        }
        int i2 = intValue;
        if (!lIIIlIllIIIll(GrandExchange.getItemId(), lIlIIlIIII[24]) || (lIIIlIllIIIll(GrandExchange.getItemId(), i) && lIIIlIllIIIll(GrandExchange.getItemId(), i2))) {
            if (lIIIlIlIlllIl(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(i);
        }
    }

    private static boolean lIIIlIllIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIlIllIIIll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIlIllIIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlIlIllllI(int i) {
        return i != 0;
    }

    private static String lIIIlIlIlIlll(String llllllllllllllllllllIIllIlllIlIl, String llllllllllllllllllllIIllIlllIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIIllIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllllIIllIlllIlII.toCharArray();
        int llllllllllllllllllllIIllIlllIIIl = lIlIIlIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIIII[0];
        while (lIIIlIlIlllll(i, length)) {
            char llllllllllllllllllllIIllIlllIllI = charArray2[i];
            sb.append((char) (llllllllllllllllllllIIllIlllIllI ^ charArray[llllllllllllllllllllIIllIlllIIIl % charArray.length]));
            "".length();
            llllllllllllllllllllIIllIlllIIIl++;
            i++;
            "".length();
            if ("   ".length() == (((((97 + 48) - 22) + 39) ^ (((120 + 122) - 169) + 114)) & ((((180 ^ 191) & ((127 ^ 116) ^ (-1))) ^ (184 ^ 161)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIlIlIlllII() {
        lIlIIlIIII = new int[33];
        lIlIIlIIII[0] = (115 ^ 44) & ((107 ^ 52) ^ (-1));
        lIlIIlIIII[1] = " ".length();
        lIlIIlIIII[2] = (-8213) & 9207;
        lIlIIlIIII[3] = 26 ^ 16;
        lIlIIlIIII[4] = "   ".length();
        lIlIIlIIII[5] = (-((-452) & 19915)) & (-8257) & 32719;
        lIlIIlIIII[6] = (-16521) & 24527;
        lIlIIlIIII[7] = 123 ^ 127;
        lIlIIlIIII[8] = "  ".length();
        lIlIIlIIII[9] = (-5138) & 5851;
        lIlIIlIIII[10] = (-14379) & 14843;
        lIlIIlIIII[11] = 49 ^ 42;
        lIlIIlIIII[12] = (-4286) & 1004285;
        lIlIIlIIII[13] = (26 ^ 57) ^ (82 ^ 118);
        lIlIIlIIII[14] = (-11778) & 12203;
        lIlIIlIIII[15] = (-21525) & 24543;
        lIlIIlIIII[16] = (-((-5737) & 15978)) & (-4097) & 16191;
        lIlIIlIIII[17] = (-((-4021) & 24501)) & (-3) & 22399;
        lIlIIlIIII[18] = (-2050) & 3967;
        lIlIIlIIII[19] = (-((-170) & 12027)) & (-3) & 12287;
        lIlIIlIIII[20] = (-(122 ^ 105)) & (-16513) & 24543;
        lIlIIlIIII[21] = (-((-413) & 27101)) & (-4143) & 31103;
        lIlIIlIIII[22] = (-((-8329) & 27823)) & (-137) & 32255;
        lIlIIlIIII[23] = (-((-17443) & 27814)) & (-16897) & 32767;
        lIlIIlIIII[24] = -" ".length();
        lIlIIlIIII[25] = 32 ^ 37;
        lIlIIlIIII[26] = (133 ^ 174) ^ (144 ^ 189);
        lIlIIlIIII[27] = 71 ^ 76;
        lIlIIlIIII[28] = 180 ^ 188;
        lIlIIlIIII[29] = (211 ^ 197) ^ (47 ^ 48);
        lIlIIlIIII[30] = (-25505) & 28669;
        lIlIIlIIII[31] = (-8801) & 12286;
        lIlIIlIIII[32] = 106 ^ 102;
    }

    private static boolean lIIIlIllIIlII(int i) {
        return i > 0;
    }

    private static String lIIIlIlIlIllI(String llllllllllllllllllllIIllIllIIIII, String llllllllllllllllllllIIllIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIllIlIlllll.getBytes(StandardCharsets.UTF_8)), lIlIIlIIII[28]), "DES");
            Cipher llllllllllllllllllllIIllIllIIIlI = Cipher.getInstance("DES");
            llllllllllllllllllllIIllIllIIIlI.init(lIlIIlIIII[8], secretKeySpec);
            return new String(llllllllllllllllllllIIllIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIllIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIllIllIIIIl) {
            llllllllllllllllllllIIllIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIlIlIlIl(String llllllllllllllllllllIIlllIIIIlIl, String llllllllllllllllllllIIlllIIIIlII) {
        try {
            SecretKeySpec llllllllllllllllllllIIlllIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIlllIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIlllIIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIlllIIIIlll.init(lIlIIlIIII[8], llllllllllllllllllllIIlllIIIlIII);
            return new String(llllllllllllllllllllIIlllIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIlllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIlllIIIIllI) {
            llllllllllllllllllllIIlllIIIIllI.printStackTrace();
            return null;
        }
    }

    public static void b(List<Integer> list) {
        if (lIIIlIlIlllIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (lIIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIIlIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (lIIIlIlIllllI(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(lIlIIlIIII[8]);
            "".length();
            int i = lIlIIlIIII[0];
            while (lIIIlIlIlllll(i, list.size())) {
                int[] iArr = new int[lIlIIlIIII[1]];
                iArr[lIlIIlIIII[0]] = list.get(i).intValue();
                if (lIIIlIllIIlII(Inventory.getCount(iArr))) {
                    if (lIIIlIlIlllIl(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[lIlIIlIIII[1]];
                        iArr2[lIlIIlIIII[0]] = list.get(i).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(lIlIIlIIII[8]);
                        "".length();
                        int i2 = i;
                        Time.sleepUntil(() -> {
                            if (lIIIlIllIIlIl(GrandExchange.getItemId(), ((Integer) list.get(i2)).intValue())) {
                                ?? r0 = lIlIIlIIII[1];
                                "".length();
                                return "   ".length() < "   ".length() ? ((105 ^ 89) ^ (104 ^ 109)) & (((115 ^ 7) ^ (84 ^ 21)) ^ (-" ".length())) : r0;
                            }
                            return lIlIIlIIII[0];
                        }, lIlIIlIIII[23]);
                        "".length();
                    }
                    if (lIIIlIlIllllI(GrandExchange.isSelling() ? 1 : 0)) {
                        if (lIIIlIllIIIll(GrandExchange.getPrice(), lIlIIlIIII[24])) {
                            GrandExchange.setPrice(lIlIIlIIII[1]);
                            Time.sleepTicks(lIlIIlIIII[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIIIlIllIIlIl(GrandExchange.getPrice(), lIlIIlIIII[1])) {
                                    ?? r0 = lIlIIlIIII[1];
                                    "".length();
                                    return (((120 ^ 75) ^ (26 ^ 114)) & (((250 ^ 143) ^ (34 ^ 12)) ^ (-" ".length()))) != ((" ".length() ^ (183 ^ 152)) & (((((71 + 30) - 10) + 50) ^ (((68 + 151) - 207) + 151)) ^ (-" ".length()))) ? ((((88 + 122) - 118) + 109) ^ (((142 + 151) - 165) + 30)) & (((74 ^ 84) ^ (79 ^ 6)) ^ (-" ".length())) : r0;
                                }
                                return lIlIIlIIII[0];
                            }, lIlIIlIIII[23]);
                            "".length();
                        }
                        if (lIIIlIllIIlIl(GrandExchange.getPrice(), lIlIIlIIII[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, lIlIIlIIII[23]);
                            "".length();
                        }
                    }
                    if (lIIIlIlIllllI(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIIIlIlIlllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lIlIIlIIII[1];
                                "".length();
                                return (-" ".length()) >= 0 ? ((226 ^ 150) ^ (192 ^ 162)) & (((167 ^ 135) ^ (164 ^ 146)) ^ (-" ".length())) : r0;
                            }
                            return lIlIIlIIII[0];
                        }, lIlIIlIIII[5]);
                        "".length();
                    }
                }
                i++;
                "".length();
                if ((-((149 ^ 156) ^ (42 ^ 38))) >= 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIIIlIllIIlIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x0c7b, code lost:
        if (lIIIlIlIllllI(net.unethicalite.api.items.GrandExchange.canCollect() ? 1 : 0) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0c7e, code lost:
        net.unethicalite.api.items.GrandExchange.collect();
        net.unethicalite.api.commons.Time.sleepUntil(() -> { // java.util.function.BooleanSupplier.getAsBoolean():boolean
            return k();
        }, h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0c94, code lost:
        java.lang.System.out.println(r7.get(r8).p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0cbf, code lost:
        if (lIIIlIllIIlIl(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.J.get(r8).intValue(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[15]) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0cc2, code lost:
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.J.remove(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[0]);
        "".length();
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.K.remove(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[0]);
        "".length();
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.L.remove(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[0]);
        "".length();
        r7.remove(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0d13, code lost:
        if (lIIIlIlIllllI(a(r0) ? 1 : 0) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0d16, code lost:
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.J.remove(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[0]);
        "".length();
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.K.remove(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[0]);
        "".length();
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.L.remove(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[0]);
        "".length();
        r7.remove(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0d60, code lost:
        net.unethicalite.api.commons.Time.sleepTicks(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0001b.lIlIIlIIII[8]);
        "".length();
        r8 = r8 + 1;
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0d88, code lost:
        if (((73 ^ 15) ^ (107 ^ 41)) > "   ".length()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0d8b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0801 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<C0003d> list) {
        int i;
        double d;
        if (lIIIlIlIlllIl(list.isEmpty() ? 1 : 0) && lIIIlIlIllllI(J.isEmpty() ? 1 : 0)) {
            int i2 = lIlIIlIIII[0];
            while (lIIIlIlIlllll(i2, list.size())) {
                J.add(Integer.valueOf(list.get(i2).p()));
                "".length();
                K.add(Integer.valueOf(list.get(i2).q()));
                "".length();
                L.add(Integer.valueOf(list.get(i2).r()));
                "".length();
                i2++;
                "".length();
                if ((20 ^ 16) <= 0) {
                    return;
                }
            }
        }
        int[] iArr = new int[lIlIIlIIII[1]];
        iArr[lIlIIlIIII[0]] = lIlIIlIIII[2];
        if (!lIIIlIllIIIII(Inventory.getCount(iArr), lIlIIlIIII[1]) || lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
            if (lIIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lIlIIlIIII[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(lIlIIIlllI[lIlIIlIIII[27]]);
                };
                if (lIIIlIlIllllI(Bank.contains(predicate) ? 1 : 0) && lIIIlIlIlllIl(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIlIIIlllI[lIlIIlIIII[3]]);
                }) ? 1 : 0) && lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                    Bank.withdraw(predicate, lIlIIlIIII[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(lIlIIlIIII[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIllIIlII(Inventory.getCount(predicate))) {
                            ?? r0 = lIlIIlIIII[1];
                            "".length();
                            return ((((2 + 82) - 56) + 128) ^ (((122 + 13) - (-6)) + 11)) == "   ".length() ? ((62 ^ 47) ^ (164 ^ 172)) & (((((42 + 110) - (-11)) + 23) ^ (((101 + 40) - 97) + 119)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIIII[0];
                    }, lIlIIlIIII[5]);
                    "".length();
                }
                if (lIIIlIlIlllIl(Bank.contains(C0005f.be) ? 1 : 0) && lIIIlIlIlllIl(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIlIIIlllI[lIlIIlIIII[29]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIIlIIII[1]];
                    iArr2[lIlIIlIIII[0]] = lIlIIlIIII[6];
                    if (lIIIlIlIllllI(Bank.contains(iArr2) ? 1 : 0) && lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                        Bank.withdraw(lIlIIlIIII[6], lIlIIlIIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIlIIII[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[lIlIIlIIII[1]];
                            iArr3[lIlIIlIIII[0]] = lIlIIlIIII[6];
                            if (lIIIlIllIIlII(Inventory.getCount(iArr3))) {
                                ?? r0 = lIlIIlIIII[1];
                                "".length();
                                return (46 ^ 43) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIIlIIII[0];
                        }, lIlIIlIIII[5]);
                        "".length();
                    }
                }
                if (lIIIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                    int[] iArr3 = new int[lIlIIlIIII[1]];
                    iArr3[lIlIIlIIII[0]] = lIlIIlIIII[2];
                    if (lIIIlIlIlllll(Inventory.getCount(iArr3), lIlIIlIIII[1])) {
                        Bank.withdrawAll(lIlIIlIIII[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIlIIII[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIlIIlIIII[1]];
                            iArr4[lIlIIlIIII[0]] = lIlIIlIIII[2];
                            return Inventory.contains(iArr4);
                        }, lIlIIlIIII[5]);
                        "".length();
                    }
                }
            }
            if (lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                if (lIIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(lIlIIlIIII[7]);
                    "".length();
                }
                if (lIIIlIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                    if (lIIIlIlIllllI(Inventory.contains(C0005f.be) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.be).interact(lIlIIIlllI[lIlIIlIIII[0]]);
                        Time.sleepTicks(lIlIIlIIII[8]);
                        "".length();
                    }
                    if (lIIIlIlIllllI(Equipment.contains(C0005f.be) ? 1 : 0) && lIIIlIllIIIll(Players.getLocal().getAnimation(), lIlIIlIIII[9])) {
                        Equipment.getFirst(C0005f.be).interact(lIlIIIlllI[lIlIIlIIII[1]]);
                        Time.sleepTicks(lIlIIlIIII[4]);
                        "".length();
                    }
                    Movement.walkTo(I);
                    "".length();
                }
            }
        }
        if (lIIIlIlIlllIl(Bank.isOpen() ? 1 : 0) && lIIIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
            int[] iArr4 = new int[lIlIIlIIII[1]];
            iArr4[lIlIIlIIII[0]] = lIlIIlIIII[2];
            if (lIIIlIlIlllll(Inventory.getCount(iArr4), lIlIIlIIII[1])) {
                C0000a.a();
            }
        }
        if (lIIIlIlIlllIl(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[lIlIIlIIII[1]];
            iArr5[lIlIIlIIII[0]] = lIlIIlIIII[2];
            if (lIIIlIllIIlII(Inventory.getCount(iArr5)) && lIIIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, lIlIIlIIII[5]);
                "".length();
            }
        }
        if (lIIIlIlIllllI(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[lIlIIlIIII[1]];
            iArr6[lIlIIlIIII[0]] = lIlIIlIIII[2];
            if (lIIIlIllIIlII(Inventory.getCount(iArr6))) {
                int i3 = lIlIIlIIII[0];
                while (lIIIlIlIlllll(i3, J.size())) {
                    String c = C0002c.c(J.get(i3).intValue());
                    System.out.println("Buying " + c + " and itemID is: " + String.valueOf(J.get(i3)));
                    while (true) {
                        if (!lIIIlIlIlllIl(a(c) ? 1 : 0)) {
                            break;
                        }
                        if (lIIIlIlIlllIl(GrandExchange.canCollect() ? 1 : 0)) {
                            int i4 = i3;
                            if (lIIIlIllIIlII(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (lIIIlIllIIlIl(grandExchangeOffer.getItemId(), J.get(i4).intValue())) {
                                    ?? r0 = lIlIIlIIII[1];
                                    "".length();
                                    return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIIlIIII[0];
                            }).collect(Collectors.toList())).size())) {
                                i = lIlIIlIIII[1];
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            } else {
                                i = lIlIIlIIII[0];
                            }
                            int i5 = i;
                            if (lIIIlIlIllllI(i5) && lIIIlIllIIIIl(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (lIIIlIllIIlIl(grandExchangeOffer2.getItemId(), J.get(i4).intValue())) {
                                    ?? r0 = lIlIIlIIII[1];
                                    "".length();
                                    return 0 != 0 ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                                }
                                return lIlIIlIIII[0];
                            }).collect(Collectors.toList())).size(), lIlIIlIIII[1])) {
                                GrandExchange.abortOffer(J.get(i3).intValue());
                            }
                            if (lIIIlIlIlllIl(i5)) {
                                if (!lIIIlIlIllllI(GrandExchange.isBuying() ? 1 : 0) || lIIIlIllIIIll(GrandExchange.getItemId(), J.get(i3).intValue())) {
                                    a(J.get(i3).intValue());
                                }
                                if (lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(i3).intValue()) && lIIIlIllIIIll(GrandExchange.getQuantity(), K.get(i3).intValue())) {
                                    GrandExchange.setQuantity(K.get(i3).intValue());
                                }
                                int intValue = L.get(i3).intValue();
                                int i6 = lIlIIlIIII[0];
                                Widget widget = Widgets.get(lIlIIlIIII[10], lIlIIlIIII[11]);
                                if (lIIIlIlIllllI(GrandExchange.isOpen() ? 1 : 0) && lIIIlIlIllllI(GrandExchange.isBuying() ? 1 : 0) && lIIIlIllIIllI(widget) && lIIIlIlIlllIl(widget.getText().isEmpty() ? 1 : 0)) {
                                    int guidePrice = GrandExchange.getGuidePrice();
                                    i6 = guidePrice;
                                    System.out.println("Guide price: " + guidePrice + "|Given price: " + String.valueOf(L.get(i3)));
                                }
                                if (lIIIlIllIIIII(i6, intValue)) {
                                    if (lIIIlIllIIIIl(i6, lIlIIlIIII[12])) {
                                        d = 0.1d;
                                        "".length();
                                        if ((133 ^ 128) <= 0) {
                                            return;
                                        }
                                    } else {
                                        d = 0.3d;
                                    }
                                    int i7 = (int) (i6 + (i6 * d));
                                    System.out.println("Increased price: " + i7);
                                    if (lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(i3).intValue()) && lIIIlIllIIIll(GrandExchange.getPrice(), i7)) {
                                        GrandExchange.setPrice(i7);
                                    }
                                    if (lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(i3).intValue()) && lIIIlIllIIlIl(GrandExchange.getPrice(), i7)) {
                                        GrandExchange.confirm();
                                    }
                                    "".length();
                                    if ((((31 ^ 54) ^ (197 ^ 171)) & (((((74 + 196) - 259) + 193) ^ (((128 + 48) - 121) + 84)) ^ (-" ".length()))) != 0) {
                                        return;
                                    }
                                } else {
                                    if (lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(i3).intValue()) && lIIIlIllIIIll(GrandExchange.getPrice(), L.get(i3).intValue())) {
                                        GrandExchange.setPrice(L.get(i3).intValue());
                                    }
                                    if (lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(i3).intValue()) && lIIIlIllIIlIl(GrandExchange.getPrice(), L.get(i3).intValue())) {
                                        GrandExchange.confirm();
                                    }
                                }
                            }
                        }
                        if (lIIIlIlIlllIl(Worlds.inMembersWorld() ? 1 : 0)) {
                            System.out.println(lIlIIIlllI[lIlIIlIIII[8]]);
                            AccBuilderShamans.d = lIlIIlIIII[1];
                            return;
                        }
                        if (lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[13])) {
                            Movement.walkTo(I);
                            "".length();
                            Time.sleepTicks(lIlIIlIIII[1]);
                            "".length();
                        }
                        if (lIIIlIlIlllIl(GrandExchange.isOpen() ? 1 : 0)) {
                            GrandExchange.open();
                        }
                        if (lIIIlIlIllllI(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (lIIIlIlIlllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = lIlIIlIIII[1];
                                    "".length();
                                    return ("   ".length() & ("   ".length() ^ (-" ".length()))) != 0 ? ((((10 + 61) - (-129)) + 54) ^ (((109 + 43) - 70) + 76)) & (((76 ^ 94) ^ (65 ^ 51)) ^ (-" ".length())) : r0;
                                }
                                return lIlIIlIIII[0];
                            }, lIlIIlIIII[5]);
                            "".length();
                        }
                        if (lIIIlIllIIlIl(J.get(i3).intValue(), lIlIIlIIII[14])) {
                            int[] iArr7 = new int[lIlIIlIIII[1]];
                            iArr7[lIlIIlIIII[0]] = lIlIIlIIII[14];
                            if (!lIIIlIlIlllIl(Inventory.contains(iArr7) ? 1 : 0)) {
                                J.remove(lIlIIlIIII[0]);
                                "".length();
                                K.remove(lIlIIlIIII[0]);
                                "".length();
                                L.remove(lIlIIlIIII[0]);
                                "".length();
                                list.remove(lIlIIlIIII[0]);
                                "".length();
                                Time.sleepTicks(lIlIIlIIII[8]);
                                "".length();
                                "".length();
                                if ((-"   ".length()) < 0) {
                                    return;
                                }
                            }
                        }
                        if (lIIIlIllIIlIl(J.get(i3).intValue(), lIlIIlIIII[15])) {
                            J.remove(lIlIIlIIII[0]);
                            "".length();
                            K.remove(lIlIIlIIII[0]);
                            "".length();
                            L.remove(lIlIIlIIII[0]);
                            "".length();
                            list.remove(lIlIIlIIII[0]);
                            "".length();
                            Time.sleepTicks(lIlIIlIIII[8]);
                            "".length();
                            "".length();
                            if ((-"   ".length()) < 0) {
                            }
                        } else {
                            if (lIIIlIllIIlIl(J.get(i3).intValue(), lIlIIlIIII[16])) {
                                int[] iArr8 = new int[lIlIIlIIII[1]];
                                iArr8[lIlIIlIIII[0]] = lIlIIlIIII[16];
                                if (lIIIlIlIllllI(Inventory.contains(iArr8) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    "".length();
                                    K.remove(lIlIIlIIII[0]);
                                    "".length();
                                    L.remove(lIlIIlIIII[0]);
                                    "".length();
                                    list.remove(lIlIIlIIII[0]);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIIII[8]);
                                    "".length();
                                    "".length();
                                    if ("   ".length() < ((106 ^ 44) & ((48 ^ 118) ^ (-1)))) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIlIllIIlIl(J.get(i3).intValue(), lIlIIlIIII[17])) {
                                int[] iArr9 = new int[lIlIIlIIII[1]];
                                iArr9[lIlIIlIIII[0]] = lIlIIlIIII[18];
                                if (lIIIlIlIllllI(Inventory.contains(iArr9) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    "".length();
                                    K.remove(lIlIIlIIII[0]);
                                    "".length();
                                    L.remove(lIlIIlIIII[0]);
                                    "".length();
                                    list.remove(lIlIIlIIII[0]);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIIII[8]);
                                    "".length();
                                    "".length();
                                    if ((((((139 + 214) - 202) + 87) ^ (((12 + 43) - 24) + 132)) & (((237 ^ 136) ^ (143 ^ 167)) ^ (-" ".length()))) > 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIlIllIIlIl(J.get(i3).intValue(), lIlIIlIIII[19])) {
                                int[] iArr10 = new int[lIlIIlIIII[1]];
                                iArr10[lIlIIlIIII[0]] = lIlIIlIIII[19];
                                if (lIIIlIlIllllI(Inventory.contains(iArr10) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    "".length();
                                    K.remove(lIlIIlIIII[0]);
                                    "".length();
                                    L.remove(lIlIIlIIII[0]);
                                    "".length();
                                    list.remove(lIlIIlIIII[0]);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIIII[8]);
                                    "".length();
                                    "".length();
                                    if ("   ".length() != "   ".length()) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIlIllIIlIl(J.get(i3).intValue(), lIlIIlIIII[20])) {
                                int[] iArr11 = new int[lIlIIlIIII[1]];
                                iArr11[lIlIIlIIII[0]] = lIlIIlIIII[20];
                                if (lIIIlIlIllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    "".length();
                                    K.remove(lIlIIlIIII[0]);
                                    "".length();
                                    L.remove(lIlIIlIIII[0]);
                                    "".length();
                                    list.remove(lIlIIlIIII[0]);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIIII[8]);
                                    "".length();
                                    "".length();
                                    if ((-"  ".length()) >= 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIlIllIIlIl(J.get(i3).intValue(), lIlIIlIIII[21])) {
                                int[] iArr12 = new int[lIlIIlIIII[1]];
                                iArr12[lIlIIlIIII[0]] = lIlIIlIIII[21];
                                if (lIIIlIlIllllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    "".length();
                                    K.remove(lIlIIlIIII[0]);
                                    "".length();
                                    L.remove(lIlIIlIIII[0]);
                                    "".length();
                                    list.remove(lIlIIlIIII[0]);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIIII[8]);
                                    "".length();
                                    "".length();
                                    if ((-" ".length()) != (-" ".length())) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIlIllIIlIl(J.get(i3).intValue(), lIlIIlIIII[22])) {
                                String[] strArr = new String[lIlIIlIIII[1]];
                                strArr[lIlIIlIIII[0]] = lIlIIIlllI[lIlIIlIIII[4]];
                                if (lIIIlIlIlllIl(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[lIlIIlIIII[1]];
                                    strArr2[lIlIIlIIII[0]] = lIlIIIlllI[lIlIIlIIII[7]];
                                    if (lIIIlIlIllllI(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                J.remove(lIlIIlIIII[0]);
                                "".length();
                                K.remove(lIlIIlIIII[0]);
                                "".length();
                                L.remove(lIlIIlIIII[0]);
                                "".length();
                                list.remove(lIlIIlIIII[0]);
                                "".length();
                                Time.sleepTicks(lIlIIlIIII[8]);
                                "".length();
                                "".length();
                                if (" ".length() >= "   ".length()) {
                                    return;
                                }
                            }
                            if (!lIIIlIlIlllIl(a(c) ? 1 : 0)) {
                                break;
                            } else if (lIIIlIlIllllI(AccBuilderShamans.d ? 1 : 0)) {
                                "".length();
                                if (" ".length() > " ".length()) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(lIlIIlIIII[4]);
                                "".length();
                                "".length();
                                if (0 != 0) {
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
