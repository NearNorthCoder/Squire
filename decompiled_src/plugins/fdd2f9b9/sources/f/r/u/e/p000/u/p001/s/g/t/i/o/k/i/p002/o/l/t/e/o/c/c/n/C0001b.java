package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/b.class */
public class C0001b {
    public static final /* synthetic */ WorldPoint J;
    public static /* synthetic */ List<Integer> M;
    private static /* synthetic */ String[] lIIlIIIllI;
    public static /* synthetic */ List<Integer> K;
    private static /* synthetic */ int[] lIIlIIIlll;
    public static /* synthetic */ List<Integer> L;

    private static boolean llllIllllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llllIllllllI(Object obj) {
        return obj != null;
    }

    private static boolean llllIllllIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllIlllllIl(int i, int i2) {
        return i == i2;
    }

    private static String llllIlllIIlI(String llIllIllI, String llIllIlIl) {
        String llIllIllI2 = new String(Base64.getDecoder().decode(llIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIllIIll = llIllIlIl.toCharArray();
        int llIllIIlI = lIIlIIIlll[0];
        char[] charArray = llIllIllI2.toCharArray();
        int length = charArray.length;
        int i = lIIlIIIlll[0];
        while (llllIlllIlll(i, length)) {
            sb.append((char) (charArray[i] ^ llIllIIll[llIllIIlI % llIllIIll.length]));
            "".length();
            llIllIIlI++;
            i++;
            "".length();
            if (" ".length() >= (159 ^ 155)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void g() {
        Widget widget = Widgets.get(lIIlIIIlll[10], lIIlIIIlll[8], lIIlIIIlll[27]);
        if (llllIllllllI(widget)) {
            widget.interact(lIIlIIIllI[lIIlIIIlll[28]]);
            Time.sleepTicks(lIIlIIIlll[8]);
            "".length();
        }
    }

    private static boolean llllIlllIllI(int i) {
        return i != 0;
    }

    private static String llllIlllIIII(String llIIlIlII, String llIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIlIIIlll[28]), "DES");
            Cipher llIIlIllI = Cipher.getInstance("DES");
            llIIlIllI.init(lIIlIIIlll[8], secretKeySpec);
            return new String(llIIlIllI.doFinal(Base64.getDecoder().decode(llIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIlIl) {
            llIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlllIIll() {
        lIIlIIIllI = new String[lIIlIIIlll[32]];
        lIIlIIIllI[lIIlIIIlll[0]] = llllIlllIIII("1QcldbVPino=", "lZjSk");
        lIIlIIIllI[lIIlIIIlll[1]] = llllIlllIIIl("z7cl6CPAALZJCf7j+js0GQ==", "sWRXQ");
        lIIlIIIllI[lIIlIIIlll[8]] = llllIlllIIlI("DwtNLlsWSU0GDCMBTRwGZhYaAR0lDU0cBmYETThbFkUaBxsqAUFIDCgBBAYOZhYOGgA2EQ==", "Femhi");
        lIIlIIIllI[lIIlIIIlll[4]] = llllIlllIIIl("D0sjhPxAK8puBvsWkAIt+7dHEeg1Njun", "aADSq");
        lIIlIIIllI[lIIlIIIlll[7]] = llllIlllIIIl("JFG8Cch+4R+GNSeqjn3FGfVb5VEyh5uB", "KgdiP");
        lIIlIIIllI[lIIlIIIlll[25]] = llllIlllIIIl("ZEOIOdk1zxQ=", "oMpPP");
        lIIlIIIllI[lIIlIIIlll[26]] = llllIlllIIII("PVUUuAW6c3C79CwmpfPlAQ==", "DRGoG");
        lIIlIIIllI[lIIlIIIlll[13]] = llllIlllIIlI("", "Usoby");
        lIIlIIIllI[lIIlIIIlll[28]] = llllIlllIIII("ghDBY6aFk3I=", "EbXnq");
        lIIlIIIllI[lIIlIIIlll[29]] = llllIlllIIlI("ICkEBT4/", "WLeiJ");
        lIIlIIIllI[lIIlIIIlll[3]] = llllIlllIIIl("Klgg0K4BPHM=", "pXPEI");
        lIIlIIIllI[lIIlIIIlll[27]] = llllIlllIIII("tJeScdJkKOrz9K+Oe/olyvP+QAMNZUYT", "yAFwV");
    }

    private static boolean llllIllllIll(int i, int i2) {
        return i != i2;
    }

    private static boolean llllIllllIIl(int i, int i2) {
        return i > i2;
    }

    private static void llllIlllIlII() {
        lIIlIIIlll = new int[33];
        lIIlIIIlll[0] = ((((19 + 80) - 23) + 52) ^ (((171 + 37) - 182) + 153)) & (((((70 + 100) - 63) + 31) ^ (((16 + 78) - 21) + 112)) ^ (-" ".length()));
        lIIlIIIlll[1] = " ".length();
        lIIlIIIlll[2] = (-10257) & 11251;
        lIIlIIIlll[3] = (((16 + 124) - 18) + 49) ^ (((126 + 88) - 116) + 63);
        lIIlIIIlll[4] = "   ".length();
        lIIlIIIlll[5] = (-((-13061) & 14199)) & (-16386) & 22523;
        lIIlIIIlll[6] = (-((-11365) & 27901)) & (-33) & 24575;
        lIIlIIIlll[7] = (147 ^ 152) ^ (99 ^ 108);
        lIIlIIIlll[8] = "  ".length();
        lIIlIIIlll[9] = (-((-16922) & 30527)) & (-16385) & 30703;
        lIIlIIIlll[10] = (-10243) & 10707;
        lIIlIIIlll[11] = 120 ^ 99;
        lIIlIIIlll[12] = (-((-18439) & 27815)) & (-6171) & 1015546;
        lIIlIIIlll[13] = 51 ^ 52;
        lIIlIIIlll[14] = (-15954) & 16379;
        lIIlIIIlll[15] = (-((-541) & 16957)) & (-1025) & 20459;
        lIIlIIIlll[16] = (-4225) & 6078;
        lIIlIIIlll[17] = (-((-4081) & 32755)) & (-1) & 30591;
        lIIlIIIlll[18] = (-((-26261) & 32405)) & (-8193) & 16254;
        lIIlIIIlll[19] = (-2562) & 2989;
        lIIlIIIlll[20] = (-((-4455) & 29047)) & (-3) & 32607;
        lIIlIIIlll[21] = (-13925) & 14197;
        lIIlIIIlll[22] = (-557) & 13181;
        lIIlIIIlll[23] = (-27266) & 32765;
        lIIlIIIlll[24] = -" ".length();
        lIIlIIIlll[25] = (((103 + 43) - 61) + 53) ^ (((1 + 98) - 2) + 46);
        lIIlIIIlll[26] = (111 ^ 19) ^ (194 ^ 184);
        lIIlIIIlll[27] = 152 ^ 147;
        lIIlIIIlll[28] = 190 ^ 182;
        lIIlIIIlll[29] = 130 ^ 139;
        lIIlIIIlll[30] = (-13091) & 16255;
        lIIlIIIlll[31] = (-((-1998) & 30703)) & (-65) & 32255;
        lIIlIIIlll[32] = 140 ^ 128;
    }

    public static void a(int i) {
        int intValue;
        if (llllIlllIlIl(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (llllIlllIllI(Static.getClient().isItemDefinitionCached(i) ? 1 : 0)) {
            intValue = Static.getClient().getItemComposition(i).getLinkedNoteId();
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return;
            }
        } else {
            intValue = ((Integer) GameThread.invokeLater(() -> {
                return Integer.valueOf(Static.getClient().getItemComposition(i).getLinkedNoteId());
            })).intValue();
        }
        int i2 = intValue;
        if (!llllIllllIll(GrandExchange.getItemId(), lIIlIIIlll[24]) || (llllIllllIll(GrandExchange.getItemId(), i) && llllIllllIll(GrandExchange.getItemId(), i2))) {
            if (llllIlllIlIl(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(i);
        }
    }

    public static void b(List<Integer> list) {
        if (llllIlllIlIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (llllIlllIllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (llllIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (llllIlllIllI(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(lIIlIIIlll[8]);
            "".length();
            int i = lIIlIIIlll[0];
            while (llllIlllIlll(i, list.size())) {
                int[] iArr = new int[lIIlIIIlll[1]];
                iArr[lIIlIIIlll[0]] = list.get(i).intValue();
                if (llllIlllllII(Inventory.getCount(iArr))) {
                    if (llllIlllIlIl(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[lIIlIIIlll[1]];
                        iArr2[lIIlIIIlll[0]] = list.get(i).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(lIIlIIIlll[8]);
                        "".length();
                        int i2 = i;
                        Time.sleepUntil(() -> {
                            if (llllIlllllIl(GrandExchange.getItemId(), ((Integer) list.get(i2)).intValue())) {
                                ?? r0 = lIIlIIIlll[1];
                                "".length();
                                return "   ".length() <= (-" ".length()) ? ((104 ^ 26) ^ (51 ^ 80)) & (((((80 + 26) - 98) + 162) ^ (((2 + 57) - 7) + 135)) ^ (-" ".length())) : r0;
                            }
                            return lIIlIIIlll[0];
                        }, lIIlIIIlll[23]);
                        "".length();
                    }
                    if (llllIlllIllI(GrandExchange.isSelling() ? 1 : 0)) {
                        if (llllIllllIll(GrandExchange.getPrice(), lIIlIIIlll[24])) {
                            GrandExchange.setPrice(lIIlIIIlll[1]);
                            Time.sleepTicks(lIIlIIIlll[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (llllIlllllIl(GrandExchange.getPrice(), lIIlIIIlll[1])) {
                                    ?? r0 = lIIlIIIlll[1];
                                    "".length();
                                    return (-" ".length()) > "  ".length() ? ((((62 + 196) - 257) + 225) ^ (((34 + 166) - 150) + 129)) & (((75 ^ 31) ^ (96 ^ 101)) ^ (-" ".length())) : r0;
                                }
                                return lIIlIIIlll[0];
                            }, lIIlIIIlll[23]);
                            "".length();
                        }
                        if (llllIlllllIl(GrandExchange.getPrice(), lIIlIIIlll[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, lIIlIIIlll[23]);
                            "".length();
                        }
                    }
                    if (llllIlllIllI(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (llllIlllIlIl(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lIIlIIIlll[1];
                                "".length();
                                return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIIIlll[0];
                        }, lIIlIIIlll[5]);
                        "".length();
                    }
                }
                i++;
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
    }

    private static String llllIlllIIIl(String llIlIIIIl, String llIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIll = Cipher.getInstance("Blowfish");
            llIlIIIll.init(lIIlIIIlll[8], secretKeySpec);
            return new String(llIlIIIll.doFinal(Base64.getDecoder().decode(llIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIlI) {
            llIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlllllII(int i) {
        return i > 0;
    }

    private static boolean llllIlllIlll(int i, int i2) {
        return i < i2;
    }

    static {
        llllIlllIlII();
        llllIlllIIll();
        J = new WorldPoint(lIIlIIIlll[30], lIIlIIIlll[31], lIIlIIIlll[0]);
        K = new ArrayList();
        L = new ArrayList();
        M = new ArrayList();
    }

    private static boolean llllIlllIlIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(String str) {
        List all = Inventory.getAll();
        if (llllIlllIlIl(all.isEmpty() ? 1 : 0)) {
            String str2 = null;
            if (llllIlllIllI(str.contains(lIIlIIIllI[lIIlIIIlll[25]]) ? 1 : 0)) {
                str2 = str.replace(lIIlIIIllI[lIIlIIIlll[26]], lIIlIIIllI[lIIlIIIlll[13]]).trim();
            }
            int i = lIIlIIIlll[0];
            while (llllIlllIlll(i, all.size())) {
                String name = ((Item) all.get(i)).getName();
                if (llllIllllllI(name)) {
                    if (llllIlllIllI(name.contains(str) ? 1 : 0)) {
                        return lIIlIIIlll[1];
                    }
                    if (llllIllllllI(str2) && llllIlllIllI(name.contains(str2) ? 1 : 0)) {
                        return lIIlIIIlll[1];
                    }
                }
                i++;
                "".length();
                if ("   ".length() <= 0) {
                    return ((((59 + 109) - 68) + 80) ^ (((122 + 115) - 213) + 113)) & (((185 ^ 192) ^ (57 ^ 125)) ^ (-" ".length()));
                }
            }
        }
        return lIIlIIIlll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x0c7d, code lost:
        if (llllIlllIllI(net.unethicalite.api.items.GrandExchange.canCollect() ? 1 : 0) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0c80, code lost:
        net.unethicalite.api.items.GrandExchange.collect();
        net.unethicalite.api.commons.Time.sleepUntil(() -> { // java.util.function.BooleanSupplier.getAsBoolean():boolean
            return k();
        }, f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0c96, code lost:
        java.lang.System.out.println(r7.get(r8).p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0cc1, code lost:
        if (llllIlllllIl(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.K.get(r8).intValue(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[15]) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0cc4, code lost:
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.K.remove(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[0]);
        "".length();
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.L.remove(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[0]);
        "".length();
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.M.remove(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[0]);
        "".length();
        r7.remove(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0d15, code lost:
        if (llllIlllIllI(a(r0) ? 1 : 0) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0d18, code lost:
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.K.remove(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[0]);
        "".length();
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.L.remove(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[0]);
        "".length();
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.M.remove(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[0]);
        "".length();
        r7.remove(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[0]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0d62, code lost:
        net.unethicalite.api.commons.Time.sleepTicks(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0001b.lIIlIIIlll[8]);
        "".length();
        r8 = r8 + 1;
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0d7b, code lost:
        if (0 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0d7e, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v166, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<C0003d> list) {
        int i;
        long llllIIllI;
        if (llllIlllIlIl(list.isEmpty() ? 1 : 0) && llllIlllIllI(K.isEmpty() ? 1 : 0)) {
            int llllIllIl = lIIlIIIlll[0];
            while (llllIlllIlll(llllIllIl, list.size())) {
                K.add(Integer.valueOf(list.get(llllIllIl).p()));
                "".length();
                L.add(Integer.valueOf(list.get(llllIllIl).q()));
                "".length();
                M.add(Integer.valueOf(list.get(llllIllIl).r()));
                "".length();
                llllIllIl++;
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
        }
        int[] iArr = new int[lIIlIIIlll[1]];
        iArr[lIIlIIIlll[0]] = lIIlIIIlll[2];
        if (!llllIllllIII(Inventory.getCount(iArr), lIIlIIIlll[1]) || llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
            if (llllIlllIllI(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lIIlIIIlll[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(lIIlIIIllI[lIIlIIIlll[27]]);
                };
                if (llllIlllIllI(Bank.contains(predicate) ? 1 : 0) && llllIlllIlIl(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIIlIIIllI[lIIlIIIlll[3]]);
                }) ? 1 : 0) && llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                    Bank.withdraw(predicate, lIIlIIIlll[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(lIIlIIIlll[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIlllllII(Inventory.getCount(predicate))) {
                            ?? r0 = lIIlIIIlll[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIIlll[0];
                    }, lIIlIIIlll[5]);
                    "".length();
                }
                if (llllIlllIlIl(Bank.contains(C0005f.bf) ? 1 : 0) && llllIlllIlIl(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIlIIIllI[lIIlIIIlll[29]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlIIIlll[1]];
                    iArr2[lIIlIIIlll[0]] = lIIlIIIlll[6];
                    if (llllIlllIllI(Bank.contains(iArr2) ? 1 : 0) && llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                        Bank.withdraw(lIIlIIIlll[6], lIIlIIIlll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIlll[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[lIIlIIIlll[1]];
                            iArr3[lIIlIIIlll[0]] = lIIlIIIlll[6];
                            if (llllIlllllII(Inventory.getCount(iArr3))) {
                                ?? r0 = lIIlIIIlll[1];
                                "".length();
                                return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIIIlll[0];
                        }, lIIlIIIlll[5]);
                        "".length();
                    }
                }
                if (llllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                    int[] iArr3 = new int[lIIlIIIlll[1]];
                    iArr3[lIIlIIIlll[0]] = lIIlIIIlll[2];
                    if (llllIlllIlll(Inventory.getCount(iArr3), lIIlIIIlll[1])) {
                        Bank.withdrawAll(lIIlIIIlll[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIlll[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIIlIIIlll[1]];
                            iArr4[lIIlIIIlll[0]] = lIIlIIIlll[2];
                            return Inventory.contains(iArr4);
                        }, lIIlIIIlll[5]);
                        "".length();
                    }
                }
            }
            if (llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                if (llllIlllIllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(lIIlIIIlll[7]);
                    "".length();
                }
                if (llllIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                    if (llllIlllIllI(Inventory.contains(C0005f.bf) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.bf).interact(lIIlIIIllI[lIIlIIIlll[0]]);
                        Time.sleepTicks(lIIlIIIlll[8]);
                        "".length();
                    }
                    if (llllIlllIllI(Equipment.contains(C0005f.bf) ? 1 : 0) && llllIllllIll(Players.getLocal().getAnimation(), lIIlIIIlll[9])) {
                        Equipment.getFirst(C0005f.bf).interact(lIIlIIIllI[lIIlIIIlll[1]]);
                        Time.sleepTicks(lIIlIIIlll[4]);
                        "".length();
                    }
                    Movement.walkTo(J);
                    "".length();
                }
            }
        }
        if (llllIlllIlIl(Bank.isOpen() ? 1 : 0) && llllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
            int[] iArr4 = new int[lIIlIIIlll[1]];
            iArr4[lIIlIIIlll[0]] = lIIlIIIlll[2];
            if (llllIlllIlll(Inventory.getCount(iArr4), lIIlIIIlll[1])) {
                C0000a.a();
            }
        }
        if (llllIlllIlIl(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[lIIlIIIlll[1]];
            iArr5[lIIlIIIlll[0]] = lIIlIIIlll[2];
            if (llllIlllllII(Inventory.getCount(iArr5)) && llllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, lIIlIIIlll[5]);
                "".length();
            }
        }
        if (llllIlllIllI(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[lIIlIIIlll[1]];
            iArr6[lIIlIIIlll[0]] = lIIlIIIlll[2];
            if (llllIlllllII(Inventory.getCount(iArr6))) {
                int llllIllIl2 = lIIlIIIlll[0];
                while (llllIlllIlll(llllIllIl2, K.size())) {
                    String c = C0002c.c(K.get(llllIllIl2).intValue());
                    System.out.println("Buying " + c + " and itemID is: " + String.valueOf(K.get(llllIllIl2)));
                    while (true) {
                        if (!llllIlllIlIl(a(c) ? 1 : 0)) {
                            break;
                        }
                        if (llllIlllIlIl(GrandExchange.canCollect() ? 1 : 0)) {
                            int i2 = llllIllIl2;
                            if (llllIlllllII(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (llllIlllllIl(grandExchangeOffer.getItemId(), K.get(i2).intValue())) {
                                    ?? r0 = lIIlIIIlll[1];
                                    "".length();
                                    return "   ".length() < (-" ".length()) ? ((((5 + 170) - 36) + 88) ^ (((54 + 2) - 54) + 160)) & (((114 ^ 11) ^ (179 ^ 139)) ^ (-" ".length())) : r0;
                                }
                                return lIIlIIIlll[0];
                            }).collect(Collectors.toList())).size())) {
                                i = lIIlIIIlll[1];
                                "".length();
                                if ("  ".length() != "  ".length()) {
                                    return;
                                }
                            } else {
                                i = lIIlIIIlll[0];
                            }
                            int i3 = i;
                            if (llllIlllIllI(i3) && llllIllllIIl(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (llllIlllllIl(grandExchangeOffer2.getItemId(), K.get(i2).intValue())) {
                                    ?? r0 = lIIlIIIlll[1];
                                    "".length();
                                    return (-" ".length()) > 0 ? ((44 ^ 81) ^ (36 ^ 108)) & (((245 ^ 187) ^ (206 ^ 181)) ^ (-" ".length())) : r0;
                                }
                                return lIIlIIIlll[0];
                            }).collect(Collectors.toList())).size(), lIIlIIIlll[1])) {
                                GrandExchange.abortOffer(K.get(llllIllIl2).intValue());
                            }
                            if (llllIlllIlIl(i3)) {
                                if (!llllIlllIllI(GrandExchange.isBuying() ? 1 : 0) || llllIllllIll(GrandExchange.getItemId(), K.get(llllIllIl2).intValue())) {
                                    a(K.get(llllIllIl2).intValue());
                                }
                                if (llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2).intValue()) && llllIllllIll(GrandExchange.getQuantity(), L.get(llllIllIl2).intValue())) {
                                    GrandExchange.setQuantity(L.get(llllIllIl2).intValue());
                                }
                                int intValue = M.get(llllIllIl2).intValue();
                                int llllIlIII = lIIlIIIlll[0];
                                Widget widget = Widgets.get(lIIlIIIlll[10], lIIlIIIlll[11]);
                                if (llllIlllIllI(GrandExchange.isOpen() ? 1 : 0) && llllIlllIllI(GrandExchange.isBuying() ? 1 : 0) && llllIllllllI(widget) && llllIlllIlIl(widget.getText().isEmpty() ? 1 : 0)) {
                                    int guidePrice = GrandExchange.getGuidePrice();
                                    llllIlIII = guidePrice;
                                    System.out.println("Guide price: " + guidePrice + "|Given price: " + String.valueOf(M.get(llllIllIl2)));
                                }
                                if (llllIllllIII(llllIlIII, intValue)) {
                                    if (llllIllllIIl(llllIlIII, lIIlIIIlll[12])) {
                                        llllIIllI = 4591870180066957722L;
                                        "".length();
                                        if ((true ^ true) & ((true ^ true) ^ true)) {
                                            return;
                                        }
                                    } else {
                                        llllIIllI = 4599075939470750515L;
                                    }
                                    int i4 = (int) (llllIlIII + (llllIlIII * llllIIllI));
                                    System.out.println("Increased price: " + i4);
                                    if (llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2).intValue()) && llllIllllIll(GrandExchange.getPrice(), i4)) {
                                        GrandExchange.setPrice(i4);
                                    }
                                    if (llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2).intValue()) && llllIlllllIl(GrandExchange.getPrice(), i4)) {
                                        GrandExchange.confirm();
                                    }
                                    "".length();
                                    if (" ".length() < (-" ".length())) {
                                        return;
                                    }
                                } else {
                                    if (llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2).intValue()) && llllIllllIll(GrandExchange.getPrice(), M.get(llllIllIl2).intValue())) {
                                        GrandExchange.setPrice(M.get(llllIllIl2).intValue());
                                    }
                                    if (llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2).intValue()) && llllIlllllIl(GrandExchange.getPrice(), M.get(llllIllIl2).intValue())) {
                                        GrandExchange.confirm();
                                    }
                                }
                            }
                        }
                        if (llllIlllIlIl(Worlds.inMembersWorld() ? 1 : 0)) {
                            System.out.println(lIIlIIIllI[lIIlIIIlll[8]]);
                            AccBuilderRogues.d = lIIlIIIlll[1];
                            return;
                        }
                        if (llllIlllIlIl(GrandExchange.isOpen() ? 1 : 0)) {
                            GrandExchange.open();
                        }
                        if (llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[13])) {
                            Movement.walkTo(J);
                            "".length();
                            Time.sleepTicks(lIIlIIIlll[1]);
                            "".length();
                        }
                        if (llllIlllIllI(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (llllIlllIlIl(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = lIIlIIIlll[1];
                                    "".length();
                                    return ((((24 + 109) - 55) + 72) ^ (((87 + 11) - (-16)) + 32)) <= 0 ? ((91 ^ 67) ^ (17 ^ 7)) & (((((18 + 157) - 116) + 102) ^ (((128 + 143) - 270) + 174)) ^ (-" ".length())) : r0;
                                }
                                return lIIlIIIlll[0];
                            }, lIIlIIIlll[5]);
                            "".length();
                        }
                        if (llllIlllllIl(K.get(llllIllIl2).intValue(), lIIlIIIlll[14])) {
                            int[] iArr7 = new int[lIIlIIIlll[1]];
                            iArr7[lIIlIIIlll[0]] = lIIlIIIlll[14];
                            if (!llllIlllIlIl(Inventory.contains(iArr7) ? 1 : 0)) {
                                K.remove(lIIlIIIlll[0]);
                                "".length();
                                L.remove(lIIlIIIlll[0]);
                                "".length();
                                M.remove(lIIlIIIlll[0]);
                                "".length();
                                list.remove(lIIlIIIlll[0]);
                                "".length();
                                Time.sleepTicks(lIIlIIIlll[8]);
                                "".length();
                                "".length();
                                if ((-"   ".length()) <= 0) {
                                    return;
                                }
                            }
                        }
                        if (llllIlllllIl(K.get(llllIllIl2).intValue(), lIIlIIIlll[15])) {
                            K.remove(lIIlIIIlll[0]);
                            "".length();
                            L.remove(lIIlIIIlll[0]);
                            "".length();
                            M.remove(lIIlIIIlll[0]);
                            "".length();
                            list.remove(lIIlIIIlll[0]);
                            "".length();
                            Time.sleepTicks(lIIlIIIlll[8]);
                            "".length();
                            "".length();
                            if ((-"   ".length()) <= 0) {
                            }
                        } else {
                            if (llllIlllllIl(K.get(llllIllIl2).intValue(), lIIlIIIlll[16])) {
                                int[] iArr8 = new int[lIIlIIIlll[1]];
                                iArr8[lIIlIIIlll[0]] = lIIlIIIlll[16];
                                if (llllIlllIllI(Inventory.contains(iArr8) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    "".length();
                                    L.remove(lIIlIIIlll[0]);
                                    "".length();
                                    M.remove(lIIlIIIlll[0]);
                                    "".length();
                                    list.remove(lIIlIIIlll[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIlll[8]);
                                    "".length();
                                    "".length();
                                    if ((((235 ^ 191) ^ (43 ^ 56)) & (((40 ^ 123) ^ (179 ^ 167)) ^ (-" ".length()))) != 0) {
                                        return;
                                    }
                                }
                            }
                            if (llllIlllllIl(K.get(llllIllIl2).intValue(), lIIlIIIlll[17])) {
                                int[] iArr9 = new int[lIIlIIIlll[1]];
                                iArr9[lIIlIIIlll[0]] = lIIlIIIlll[18];
                                if (llllIlllIllI(Inventory.contains(iArr9) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    "".length();
                                    L.remove(lIIlIIIlll[0]);
                                    "".length();
                                    M.remove(lIIlIIIlll[0]);
                                    "".length();
                                    list.remove(lIIlIIIlll[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIlll[8]);
                                    "".length();
                                    "".length();
                                    if (((149 ^ 161) & ((151 ^ 163) ^ (-1))) >= "   ".length()) {
                                        return;
                                    }
                                }
                            }
                            if (llllIlllllIl(K.get(llllIllIl2).intValue(), lIIlIIIlll[19])) {
                                int[] iArr10 = new int[lIIlIIIlll[1]];
                                iArr10[lIIlIIIlll[0]] = lIIlIIIlll[19];
                                if (llllIlllIllI(Inventory.contains(iArr10) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    "".length();
                                    L.remove(lIIlIIIlll[0]);
                                    "".length();
                                    M.remove(lIIlIIIlll[0]);
                                    "".length();
                                    list.remove(lIIlIIIlll[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIlll[8]);
                                    "".length();
                                    "".length();
                                    if ((-"   ".length()) >= 0) {
                                        return;
                                    }
                                }
                            }
                            if (llllIlllllIl(K.get(llllIllIl2).intValue(), lIIlIIIlll[20])) {
                                int[] iArr11 = new int[lIIlIIIlll[1]];
                                iArr11[lIIlIIIlll[0]] = lIIlIIIlll[20];
                                if (llllIlllIllI(Inventory.contains(iArr11) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    "".length();
                                    L.remove(lIIlIIIlll[0]);
                                    "".length();
                                    M.remove(lIIlIIIlll[0]);
                                    "".length();
                                    list.remove(lIIlIIIlll[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIlll[8]);
                                    "".length();
                                    "".length();
                                    if ((-" ".length()) != (-" ".length())) {
                                        return;
                                    }
                                }
                            }
                            if (llllIlllllIl(K.get(llllIllIl2).intValue(), lIIlIIIlll[21])) {
                                int[] iArr12 = new int[lIIlIIIlll[1]];
                                iArr12[lIIlIIIlll[0]] = lIIlIIIlll[21];
                                if (llllIlllIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    "".length();
                                    L.remove(lIIlIIIlll[0]);
                                    "".length();
                                    M.remove(lIIlIIIlll[0]);
                                    "".length();
                                    list.remove(lIIlIIIlll[0]);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIlll[8]);
                                    "".length();
                                    "".length();
                                    if ((-"  ".length()) > 0) {
                                        return;
                                    }
                                }
                            }
                            if (llllIlllllIl(K.get(llllIllIl2).intValue(), lIIlIIIlll[22])) {
                                String[] strArr = new String[lIIlIIIlll[1]];
                                strArr[lIIlIIIlll[0]] = lIIlIIIllI[lIIlIIIlll[4]];
                                if (llllIlllIlIl(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[lIIlIIIlll[1]];
                                    strArr2[lIIlIIIlll[0]] = lIIlIIIllI[lIIlIIIlll[7]];
                                    if (llllIlllIllI(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                K.remove(lIIlIIIlll[0]);
                                "".length();
                                L.remove(lIIlIIIlll[0]);
                                "".length();
                                M.remove(lIIlIIIlll[0]);
                                "".length();
                                list.remove(lIIlIIIlll[0]);
                                "".length();
                                Time.sleepTicks(lIIlIIIlll[8]);
                                "".length();
                                "".length();
                                if ("   ".length() <= (((((58 + 64) - (-19)) + 67) ^ (((124 + 21) - 36) + 35)) & (((103 ^ 40) ^ (55 ^ 56)) ^ (-" ".length())))) {
                                    return;
                                }
                            }
                            if (!llllIlllIlIl(a(c) ? 1 : 0)) {
                                break;
                            } else if (llllIlllIllI(AccBuilderRogues.d ? 1 : 0)) {
                                "".length();
                                if ("   ".length() != "   ".length()) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(lIIlIIIlll[4]);
                                "".length();
                                "".length();
                                if ("  ".length() < 0) {
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
