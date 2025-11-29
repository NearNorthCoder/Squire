package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/b.class */
public class C0001b {
    private static /* synthetic */ int[] lllIlllIll;
    public static /* synthetic */ List<Integer> L;
    public static /* synthetic */ List<Integer> J;
    private static /* synthetic */ String[] lllIlllIlI;
    public static /* synthetic */ List<Integer> K;
    public static final /* synthetic */ WorldPoint I;

    private static boolean llIIlIlIIIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIlIlIIIIll(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIlIIllllll(int i, int i2) {
        return i < i2;
    }

    public static void g() {
        Widget widget = Widgets.get(lllIlllIll[10], lllIlllIll[8], lllIlllIll[27]);
        if (llIIlIlIIIllI(widget)) {
            widget.interact(lllIlllIlI[lllIlllIll[28]]);
            Time.sleepTicks(lllIlllIll[8]);
            "".length();
        }
    }

    private static boolean llIIlIlIIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIlIlIIIIIl(int i, int i2) {
        return i > i2;
    }

    private static String llIIlIIlIllIl(String lllllllllllllllllIllIIllIIIIIlII, String lllllllllllllllllIllIIllIIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIllIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlllIll[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIllIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIllIIIIIlIl) {
            lllllllllllllllllIllIIllIIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlIIlllIll() {
        lllIlllIlI = new String[lllIlllIll[32]];
        lllIlllIlI[lllIlllIll[0]] = llIIlIIlIllII("gFh5lktcn/A=", "XqVxj");
        lllIlllIlI[lllIlllIll[1]] = llIIlIIlIllIl("TxRBzFE1d2IYcRVCYI+wDA==", "YhuWJ");
        lllIlllIlI[lllIlllIll[8]] = llIIlIIlIllIl("dQUfJEfZrWZ3dA0nOQBQ49xikOBsnFYyEGbaNuilR4vbC8Q3yveZD8xWrvFX9VnH7eqk7bN7svE=", "FCNmj");
        lllIlllIlI[lllIlllIll[4]] = llIIlIIlllIlI("JywlPSgaOWQgLgAxKz5pQHE=", "tXDPA");
        lllIlllIlI[lllIlllIll[7]] = llIIlIIlIllIl("SC6W8SWRtIeS9fnHEhxyRpE6ErgGA7Zu", "xDeFd");
        lllIlllIlI[lllIlllIll[25]] = llIIlIIlllIlI("Ag42Hz8C", "voTsZ");
        lllIlllIlI[lllIlllIll[26]] = llIIlIIlIllIl("Kw1LXl1v6RUrascpAzkiDQ==", "pKSyb");
        lllIlllIlI[lllIlllIll[13]] = llIIlIIlllIlI("", "JaieJ");
        lllIlllIlI[lllIlllIll[28]] = llIIlIIlllIlI("MQAcEQM=", "rlsbf");
        lllIlllIlI[lllIlllIll[29]] = llIIlIIlIllII("tqKa+SeU8hs=", "RAPHT");
        lllIlllIlI[lllIlllIll[3]] = llIIlIIlIllIl("Se/r2RwMop4=", "SMYze");
        lllIlllIlI[lllIlllIll[27]] = llIIlIIlllIlI("ADsCHVcdNEwNEhM+GBJXWg==", "rRlzw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(String str) {
        List all = Inventory.getAll();
        if (llIIlIIllllIl(all.isEmpty() ? 1 : 0)) {
            String str2 = null;
            if (llIIlIIlllllI(str.contains(lllIlllIlI[lllIlllIll[25]]) ? 1 : 0)) {
                str2 = str.replace(lllIlllIlI[lllIlllIll[26]], lllIlllIlI[lllIlllIll[13]]).trim();
            }
            int i = lllIlllIll[0];
            while (llIIlIIllllll(i, all.size())) {
                String name = ((Item) all.get(i)).getName();
                if (llIIlIlIIIllI(name)) {
                    if (llIIlIIlllllI(name.contains(str) ? 1 : 0)) {
                        return lllIlllIll[1];
                    }
                    if (llIIlIlIIIllI(str2) && llIIlIIlllllI(name.contains(str2) ? 1 : 0)) {
                        return lllIlllIll[1];
                    }
                }
                i++;
                "".length();
                if ("  ".length() >= ((233 ^ 139) ^ (11 ^ 109))) {
                    return " ".length() & (" ".length() ^ (-" ".length()));
                }
            }
        }
        return lllIlllIll[0];
    }

    public static void b(List<Integer> list) {
        if (llIIlIIllllIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (llIIlIIllllIl(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(lllIlllIll[8]);
            "".length();
            int i = lllIlllIll[0];
            while (llIIlIIllllll(i, list.size())) {
                int[] iArr = new int[lllIlllIll[1]];
                iArr[lllIlllIll[0]] = list.get(i).intValue();
                if (llIIlIlIIIlII(Inventory.getCount(iArr))) {
                    if (llIIlIIllllIl(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[lllIlllIll[1]];
                        iArr2[lllIlllIll[0]] = list.get(i).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(lllIlllIll[8]);
                        "".length();
                        int i2 = i;
                        Time.sleepUntil(() -> {
                            if (llIIlIlIIIlIl(GrandExchange.getItemId(), ((Integer) list.get(i2)).intValue())) {
                                ?? r0 = lllIlllIll[1];
                                "".length();
                                return "   ".length() < " ".length() ? ((((44 + 24) - 66) + 132) ^ (((91 + 20) - 35) + 60)) & (((((3 + 134) - 66) + 79) ^ (((148 + 108) - 208) + 104)) ^ (-" ".length())) : r0;
                            }
                            return lllIlllIll[0];
                        }, lllIlllIll[23]);
                        "".length();
                    }
                    if (llIIlIIlllllI(GrandExchange.isSelling() ? 1 : 0)) {
                        if (llIIlIlIIIIll(GrandExchange.getPrice(), lllIlllIll[24])) {
                            GrandExchange.setPrice(lllIlllIll[1]);
                            Time.sleepTicks(lllIlllIll[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (llIIlIlIIIlIl(GrandExchange.getPrice(), lllIlllIll[1])) {
                                    ?? r0 = lllIlllIll[1];
                                    "".length();
                                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIlllIll[0];
                            }, lllIlllIll[23]);
                            "".length();
                        }
                        if (llIIlIlIIIlIl(GrandExchange.getPrice(), lllIlllIll[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, lllIlllIll[23]);
                            "".length();
                        }
                    }
                    if (llIIlIIlllllI(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lllIlllIll[1];
                                "".length();
                                return ((((109 + 176) - 166) + 70) ^ (((175 + 173) - 246) + 83)) < 0 ? ((5 ^ 53) ^ (76 ^ 94)) & (((0 ^ 91) ^ (216 ^ 161)) ^ (-" ".length())) : r0;
                            }
                            return lllIlllIll[0];
                        }, lllIlllIll[5]);
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

    static {
        llIIlIIllllII();
        llIIlIIlllIll();
        I = new WorldPoint(lllIlllIll[30], lllIlllIll[31], lllIlllIll[0]);
        J = new ArrayList();
        K = new ArrayList();
        L = new ArrayList();
    }

    private static String llIIlIIlllIlI(String lllllllllllllllllIllIIlIlllIIlll, String lllllllllllllllllIllIIlIlllIIllI) {
        String lllllllllllllllllIllIIlIlllIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIllIIlIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIllIIlIlllIIllI.toCharArray();
        int lllllllllllllllllIllIIlIlllIIIll = lllIlllIll[0];
        char[] charArray2 = lllllllllllllllllIllIIlIlllIIlll2.toCharArray();
        int length = charArray2.length;
        int i = lllIlllIll[0];
        while (llIIlIIllllll(i, length)) {
            char lllllllllllllllllIllIIlIlllIlIII = charArray2[i];
            sb.append((char) (lllllllllllllllllIllIIlIlllIlIII ^ charArray[lllllllllllllllllIllIIlIlllIIIll % charArray.length]));
            "".length();
            lllllllllllllllllIllIIlIlllIIIll++;
            i++;
            "".length();
            if ((-(144 ^ 149)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIlIIllllIl(int i) {
        return i == 0;
    }

    public static void a(int i) {
        int intValue;
        if (llIIlIIllllIl(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (llIIlIIlllllI(Static.getClient().isItemDefinitionCached(i) ? 1 : 0)) {
            intValue = Static.getClient().getItemComposition(i).getLinkedNoteId();
            "".length();
            if ("   ".length() < (((119 ^ 69) ^ " ".length()) & (((((30 + 14) - (-65)) + 35) ^ (((36 + 113) - 120) + 134)) ^ (-" ".length())))) {
                return;
            }
        } else {
            intValue = ((Integer) GameThread.invokeLater(() -> {
                return Integer.valueOf(Static.getClient().getItemComposition(i).getLinkedNoteId());
            })).intValue();
        }
        int i2 = intValue;
        if (!llIIlIlIIIIll(GrandExchange.getItemId(), lllIlllIll[24]) || (llIIlIlIIIIll(GrandExchange.getItemId(), i) && llIIlIlIIIIll(GrandExchange.getItemId(), i2))) {
            if (llIIlIIllllIl(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(i);
        }
    }

    private static boolean llIIlIIlllllI(int i) {
        return i != 0;
    }

    private static boolean llIIlIlIIIllI(Object obj) {
        return obj != null;
    }

    private static boolean llIIlIlIIIlII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0818 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<C0003d> list) {
        int i;
        double d;
        if (llIIlIIllllIl(list.isEmpty() ? 1 : 0) && llIIlIIlllllI(J.isEmpty() ? 1 : 0)) {
            int lllllllllllllllllIllIIllIIlllIII = lllIlllIll[0];
            while (llIIlIIllllll(lllllllllllllllllIllIIllIIlllIII, list.size())) {
                J.add(Integer.valueOf(list.get(lllllllllllllllllIllIIllIIlllIII).p()));
                "".length();
                K.add(Integer.valueOf(list.get(lllllllllllllllllIllIIllIIlllIII).q()));
                "".length();
                L.add(Integer.valueOf(list.get(lllllllllllllllllIllIIllIIlllIII).r()));
                "".length();
                lllllllllllllllllIllIIllIIlllIII++;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
        }
        int[] iArr = new int[lllIlllIll[1]];
        iArr[lllIlllIll[0]] = lllIlllIll[2];
        if (!llIIlIlIIIIII(Inventory.getCount(iArr), lllIlllIll[1]) || llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
            if (llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lllIlllIll[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(lllIlllIlI[lllIlllIll[27]]);
                };
                if (llIIlIIlllllI(Bank.contains(predicate) ? 1 : 0) && llIIlIIllllIl(Inventory.contains(item2 -> {
                    return item2.getName().contains(lllIlllIlI[lllIlllIll[3]]);
                }) ? 1 : 0) && llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                    Bank.withdraw(predicate, lllIlllIll[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(lllIlllIll[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIlIlIIIlII(Inventory.getCount(predicate))) {
                            ?? r0 = lllIlllIll[1];
                            "".length();
                            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllIlllIll[0];
                    }, lllIlllIll[5]);
                    "".length();
                }
                if (llIIlIIllllIl(Bank.contains(C0005f.be) ? 1 : 0) && llIIlIIllllIl(Inventory.contains(item3 -> {
                    return item3.getName().contains(lllIlllIlI[lllIlllIll[29]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIlllIll[1]];
                    iArr2[lllIlllIll[0]] = lllIlllIll[6];
                    if (llIIlIIlllllI(Bank.contains(iArr2) ? 1 : 0) && llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                        Bank.withdraw(lllIlllIll[6], lllIlllIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlllIll[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[lllIlllIll[1]];
                            iArr3[lllIlllIll[0]] = lllIlllIll[6];
                            if (llIIlIlIIIlII(Inventory.getCount(iArr3))) {
                                ?? r0 = lllIlllIll[1];
                                "".length();
                                return (((((65 + 217) - 175) + 120) ^ (((56 + 167) - 54) + 19)) & (((172 ^ 193) ^ (83 ^ 97)) ^ (-" ".length()))) > 0 ? ((10 ^ 41) ^ (38 ^ 62)) & (((213 ^ 169) ^ (105 ^ 46)) ^ (-" ".length())) : r0;
                            }
                            return lllIlllIll[0];
                        }, lllIlllIll[5]);
                        "".length();
                    }
                }
                if (llIIlIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                    int[] iArr3 = new int[lllIlllIll[1]];
                    iArr3[lllIlllIll[0]] = lllIlllIll[2];
                    if (llIIlIIllllll(Inventory.getCount(iArr3), lllIlllIll[1])) {
                        Bank.withdrawAll(lllIlllIll[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlllIll[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lllIlllIll[1]];
                            iArr4[lllIlllIll[0]] = lllIlllIll[2];
                            return Inventory.contains(iArr4);
                        }, lllIlllIll[5]);
                        "".length();
                    }
                }
            }
            if (llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                if (llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(lllIlllIll[7]);
                    "".length();
                }
                if (llIIlIIllllIl(Bank.isOpen() ? 1 : 0)) {
                    if (llIIlIIlllllI(Inventory.contains(C0005f.be) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.be).interact(lllIlllIlI[lllIlllIll[0]]);
                        Time.sleepTicks(lllIlllIll[8]);
                        "".length();
                    }
                    if (llIIlIIlllllI(Equipment.contains(C0005f.be) ? 1 : 0) && llIIlIlIIIIll(Players.getLocal().getAnimation(), lllIlllIll[9])) {
                        Equipment.getFirst(C0005f.be).interact(lllIlllIlI[lllIlllIll[1]]);
                        Time.sleepTicks(lllIlllIll[4]);
                        "".length();
                    }
                    Movement.walkTo(I);
                    "".length();
                }
            }
        }
        if (llIIlIIllllIl(Bank.isOpen() ? 1 : 0) && llIIlIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
            int[] iArr4 = new int[lllIlllIll[1]];
            iArr4[lllIlllIll[0]] = lllIlllIll[2];
            if (llIIlIIllllll(Inventory.getCount(iArr4), lllIlllIll[1])) {
                C0000a.a();
            }
        }
        if (llIIlIIllllIl(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[lllIlllIll[1]];
            iArr5[lllIlllIll[0]] = lllIlllIll[2];
            if (llIIlIlIIIlII(Inventory.getCount(iArr5)) && llIIlIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, lllIlllIll[5]);
                "".length();
            }
        }
        if (llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[lllIlllIll[1]];
            iArr6[lllIlllIll[0]] = lllIlllIll[2];
            if (llIIlIlIIIlII(Inventory.getCount(iArr6))) {
                int lllllllllllllllllIllIIllIIlllIII2 = lllIlllIll[0];
                while (llIIlIIllllll(lllllllllllllllllIllIIllIIlllIII2, J.size())) {
                    String c = C0002c.c(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue());
                    System.out.println("Buying " + c + " and itemID is: " + String.valueOf(J.get(lllllllllllllllllIllIIllIIlllIII2)));
                    while (true) {
                        if (!llIIlIIllllIl(a(c) ? 1 : 0)) {
                            break;
                        }
                        if (llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                            int i2 = lllllllllllllllllIllIIllIIlllIII2;
                            if (llIIlIlIIIlII(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (llIIlIlIIIlIl(grandExchangeOffer.getItemId(), J.get(i2).intValue())) {
                                    ?? r0 = lllIlllIll[1];
                                    "".length();
                                    return " ".length() < (((208 ^ 152) ^ (246 ^ 178)) & (((186 ^ 145) ^ (4 ^ 35)) ^ (-" ".length()))) ? ((((18 + 37) - (-24)) + 79) ^ (((73 + 31) - 27) + 60)) & (((57 ^ 78) ^ (30 ^ 126)) ^ (-" ".length())) : r0;
                                }
                                return lllIlllIll[0];
                            }).collect(Collectors.toList())).size())) {
                                i = lllIlllIll[1];
                                "".length();
                                if ("  ".length() == 0) {
                                    return;
                                }
                            } else {
                                i = lllIlllIll[0];
                            }
                            int i3 = i;
                            if (llIIlIIlllllI(i3) && llIIlIlIIIIIl(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (llIIlIlIIIlIl(grandExchangeOffer2.getItemId(), J.get(i2).intValue())) {
                                    ?? r0 = lllIlllIll[1];
                                    "".length();
                                    return "   ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIlllIll[0];
                            }).collect(Collectors.toList())).size(), lllIlllIll[1])) {
                                GrandExchange.abortOffer(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue());
                            }
                            if (llIIlIIllllIl(i3)) {
                                if (!llIIlIIlllllI(GrandExchange.isBuying() ? 1 : 0) || llIIlIlIIIIll(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2).intValue())) {
                                    a(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue());
                                }
                                if (llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2).intValue()) && llIIlIlIIIIll(GrandExchange.getQuantity(), K.get(lllllllllllllllllIllIIllIIlllIII2).intValue())) {
                                    GrandExchange.setQuantity(K.get(lllllllllllllllllIllIIllIIlllIII2).intValue());
                                }
                                int intValue = L.get(lllllllllllllllllIllIIllIIlllIII2).intValue();
                                int i4 = lllIlllIll[0];
                                Widget widget = Widgets.get(lllIlllIll[10], lllIlllIll[11]);
                                if (llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0) && llIIlIIlllllI(GrandExchange.isBuying() ? 1 : 0) && llIIlIlIIIllI(widget) && llIIlIIllllIl(widget.getText().isEmpty() ? 1 : 0)) {
                                    int guidePrice = GrandExchange.getGuidePrice();
                                    i4 = guidePrice;
                                    System.out.println("Guide price: " + guidePrice + "|Given price: " + String.valueOf(L.get(lllllllllllllllllIllIIllIIlllIII2)));
                                }
                                if (llIIlIlIIIIII(i4, intValue)) {
                                    if (llIIlIlIIIIIl(i4, lllIlllIll[12])) {
                                        d = 0.1d;
                                        "".length();
                                        if ((((12 ^ 59) ^ (206 ^ 176)) & (((((128 + 64) - 97) + 45) ^ (((64 + 50) - 74) + 157)) ^ (-" ".length()))) > ((((150 + 55) - 97) + 54) ^ (((16 + 105) - 25) + 70))) {
                                            return;
                                        }
                                    } else {
                                        d = 0.3d;
                                    }
                                    int i5 = (int) (i4 + (i4 * d));
                                    System.out.println("Increased price: " + i5);
                                    if (llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2).intValue()) && llIIlIlIIIIll(GrandExchange.getPrice(), i5)) {
                                        GrandExchange.setPrice(i5);
                                    }
                                    if (llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2).intValue()) && llIIlIlIIIlIl(GrandExchange.getPrice(), i5)) {
                                        GrandExchange.confirm();
                                    }
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                } else {
                                    if (llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2).intValue()) && llIIlIlIIIIll(GrandExchange.getPrice(), L.get(lllllllllllllllllIllIIllIIlllIII2).intValue())) {
                                        GrandExchange.setPrice(L.get(lllllllllllllllllIllIIllIIlllIII2).intValue());
                                    }
                                    if (llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2).intValue()) && llIIlIlIIIlIl(GrandExchange.getPrice(), L.get(lllllllllllllllllIllIIllIIlllIII2).intValue())) {
                                        GrandExchange.confirm();
                                    }
                                }
                            }
                        }
                        if (llIIlIIllllIl(Worlds.inMembersWorld() ? 1 : 0)) {
                            System.out.println(lllIlllIlI[lllIlllIll[8]]);
                            AccBuilderTempleTrek.d = lllIlllIll[1];
                            return;
                        }
                        if (llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[13])) {
                            Movement.walkTo(I);
                            "".length();
                            Time.sleepTicks(lllIlllIll[1]);
                            "".length();
                        }
                        if (llIIlIIllllIl(GrandExchange.isOpen() ? 1 : 0)) {
                            GrandExchange.open();
                        }
                        if (llIIlIIlllllI(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = lllIlllIll[1];
                                    "".length();
                                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIlllIll[0];
                            }, lllIlllIll[5]);
                            "".length();
                        }
                        if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[14])) {
                            int[] iArr7 = new int[lllIlllIll[1]];
                            iArr7[lllIlllIll[0]] = lllIlllIll[14];
                            if (!llIIlIIllllIl(Inventory.contains(iArr7) ? 1 : 0)) {
                                J.remove(lllIlllIll[0]);
                                "".length();
                                K.remove(lllIlllIll[0]);
                                "".length();
                                L.remove(lllIlllIll[0]);
                                "".length();
                                list.remove(lllIlllIll[0]);
                                "".length();
                                Time.sleepTicks(lllIlllIll[8]);
                                "".length();
                                "".length();
                                if (0 == 0) {
                                    return;
                                }
                            }
                        }
                        if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[15])) {
                            J.remove(lllIlllIll[0]);
                            "".length();
                            K.remove(lllIlllIll[0]);
                            "".length();
                            L.remove(lllIlllIll[0]);
                            "".length();
                            list.remove(lllIlllIll[0]);
                            "".length();
                            Time.sleepTicks(lllIlllIll[8]);
                            "".length();
                            "".length();
                            if (0 == 0) {
                            }
                        } else {
                            if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[16])) {
                                int[] iArr8 = new int[lllIlllIll[1]];
                                iArr8[lllIlllIll[0]] = lllIlllIll[16];
                                if (llIIlIIlllllI(Inventory.contains(iArr8) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    "".length();
                                    K.remove(lllIlllIll[0]);
                                    "".length();
                                    L.remove(lllIlllIll[0]);
                                    "".length();
                                    list.remove(lllIlllIll[0]);
                                    "".length();
                                    Time.sleepTicks(lllIlllIll[8]);
                                    "".length();
                                    "".length();
                                    if ((-"  ".length()) >= 0) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[17])) {
                                int[] iArr9 = new int[lllIlllIll[1]];
                                iArr9[lllIlllIll[0]] = lllIlllIll[18];
                                if (llIIlIIlllllI(Inventory.contains(iArr9) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    "".length();
                                    K.remove(lllIlllIll[0]);
                                    "".length();
                                    L.remove(lllIlllIll[0]);
                                    "".length();
                                    list.remove(lllIlllIll[0]);
                                    "".length();
                                    Time.sleepTicks(lllIlllIll[8]);
                                    "".length();
                                    "".length();
                                    if (!(true ^ true)) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[19])) {
                                int[] iArr10 = new int[lllIlllIll[1]];
                                iArr10[lllIlllIll[0]] = lllIlllIll[19];
                                if (llIIlIIlllllI(Inventory.contains(iArr10) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    "".length();
                                    K.remove(lllIlllIll[0]);
                                    "".length();
                                    L.remove(lllIlllIll[0]);
                                    "".length();
                                    list.remove(lllIlllIll[0]);
                                    "".length();
                                    Time.sleepTicks(lllIlllIll[8]);
                                    "".length();
                                    "".length();
                                    if ("  ".length() == 0) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[20])) {
                                int[] iArr11 = new int[lllIlllIll[1]];
                                iArr11[lllIlllIll[0]] = lllIlllIll[20];
                                if (llIIlIIlllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    "".length();
                                    K.remove(lllIlllIll[0]);
                                    "".length();
                                    L.remove(lllIlllIll[0]);
                                    "".length();
                                    list.remove(lllIlllIll[0]);
                                    "".length();
                                    Time.sleepTicks(lllIlllIll[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() > (75 ^ 79)) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[21])) {
                                int[] iArr12 = new int[lllIlllIll[1]];
                                iArr12[lllIlllIll[0]] = lllIlllIll[21];
                                if (llIIlIIlllllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    "".length();
                                    K.remove(lllIlllIll[0]);
                                    "".length();
                                    L.remove(lllIlllIll[0]);
                                    "".length();
                                    list.remove(lllIlllIll[0]);
                                    "".length();
                                    Time.sleepTicks(lllIlllIll[8]);
                                    "".length();
                                    "".length();
                                    if ("   ".length() < 0) {
                                        return;
                                    }
                                }
                            }
                            if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[22])) {
                                String[] strArr = new String[lllIlllIll[1]];
                                strArr[lllIlllIll[0]] = lllIlllIlI[lllIlllIll[4]];
                                if (llIIlIIllllIl(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[lllIlllIll[1]];
                                    strArr2[lllIlllIll[0]] = lllIlllIlI[lllIlllIll[7]];
                                    if (llIIlIIlllllI(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                J.remove(lllIlllIll[0]);
                                "".length();
                                K.remove(lllIlllIll[0]);
                                "".length();
                                L.remove(lllIlllIll[0]);
                                "".length();
                                list.remove(lllIlllIll[0]);
                                "".length();
                                Time.sleepTicks(lllIlllIll[8]);
                                "".length();
                                "".length();
                                if ((-" ".length()) != (-" ".length())) {
                                    return;
                                }
                            }
                            if (!llIIlIIllllIl(a(c) ? 1 : 0)) {
                                break;
                            } else if (llIIlIIlllllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                                "".length();
                                if ((-" ".length()) != (-" ".length())) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(lllIlllIll[4]);
                                "".length();
                                "".length();
                                if (((100 ^ 60) ^ (0 ^ 92)) < "  ".length()) {
                                    return;
                                }
                            }
                        }
                    }
                    if (llIIlIIlllllI(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lllIlllIll[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlllIll[0];
                        }, lllIlllIll[5]);
                        "".length();
                    }
                    System.out.println(list.get(lllllllllllllllllIllIIllIIlllIII2).p());
                    if (llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2).intValue(), lllIlllIll[15])) {
                        J.remove(lllIlllIll[0]);
                        "".length();
                        K.remove(lllIlllIll[0]);
                        "".length();
                        L.remove(lllIlllIll[0]);
                        "".length();
                        list.remove(lllIlllIll[0]);
                        "".length();
                    }
                    if (llIIlIIlllllI(a(c) ? 1 : 0)) {
                        J.remove(lllIlllIll[0]);
                        "".length();
                        K.remove(lllIlllIll[0]);
                        "".length();
                        L.remove(lllIlllIll[0]);
                        "".length();
                        list.remove(lllIlllIll[0]);
                        "".length();
                    }
                    Time.sleepTicks(lllIlllIll[8]);
                    "".length();
                    lllllllllllllllllIllIIllIIlllIII2++;
                    "".length();
                    if ((-"  ".length()) >= 0) {
                        return;
                    }
                }
            }
        }
    }

    private static void llIIlIIllllII() {
        lllIlllIll = new int[33];
        lllIlllIll[0] = ((98 ^ 90) ^ (45 ^ 30)) & (((178 ^ 175) ^ (183 ^ 161)) ^ (-" ".length()));
        lllIlllIll[1] = " ".length();
        lllIlllIll[2] = (-1045) & 2039;
        lllIlllIll[3] = 78 ^ 68;
        lllIlllIll[4] = "   ".length();
        lllIlllIll[5] = (-((-6849) & 24311)) & (-66) & 22527;
        lllIlllIll[6] = (-(171 ^ 154)) & (-24713) & 32767;
        lllIlllIll[7] = 41 ^ 45;
        lllIlllIll[8] = "  ".length();
        lllIlllIll[9] = (-((-10965) & 32501)) & (-10257) & 32506;
        lllIlllIll[10] = (-26667) & 27131;
        lllIlllIll[11] = (155 ^ 148) ^ (127 ^ 107);
        lllIlllIll[12] = (-((-4615) & 15254)) & (-5137) & 1015775;
        lllIlllIll[13] = (215 ^ 194) ^ (92 ^ 78);
        lllIlllIll[14] = (-1093) & 1518;
        lllIlllIll[15] = (-((-45) & 13357)) & (-16421) & 32751;
        lllIlllIll[16] = (-1) & 1854;
        lllIlllIll[17] = (-((-19219) & 31635)) & (-1) & 14333;
        lllIlllIll[18] = (-((-121) & 30970)) & (-1) & 32767;
        lllIlllIll[19] = (-((-11141) & 15318)) & (-19969) & 24573;
        lllIlllIll[20] = (-((-6721) & 31313)) & (-3) & 32607;
        lllIlllIll[21] = (-((-4389) & 8165)) & (-20483) & 24531;
        lllIlllIll[22] = (-((-261) & 19367)) & (-5) & 31735;
        lllIlllIll[23] = (-((-29793) & 31970)) & (-16897) & 24573;
        lllIlllIll[24] = -" ".length();
        lllIlllIll[25] = 84 ^ 81;
        lllIlllIll[26] = (87 ^ 8) ^ (81 ^ 8);
        lllIlllIll[27] = (((77 + 57) - (-5)) + 39) ^ (((114 + 88) - 87) + 70);
        lllIlllIll[28] = (((28 + 29) - (-13)) + 61) ^ (((91 + 99) - 85) + 34);
        lllIlllIll[29] = 125 ^ 116;
        lllIlllIll[30] = (-((-2201) & 27547)) & (-129) & 28639;
        lllIlllIll[31] = (-((-19554) & 31843)) & (-16481) & 32255;
        lllIlllIll[32] = (190 ^ 172) ^ (98 ^ 124);
    }

    private static String llIIlIIlIllII(String lllllllllllllllllIllIIlIllllIlll, String lllllllllllllllllIllIIlIllllIllI) {
        try {
            SecretKeySpec lllllllllllllllllIllIIlIlllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIlIllllIllI.getBytes(StandardCharsets.UTF_8)), lllIlllIll[28]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlllIll[8], lllllllllllllllllIllIIlIlllllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIlIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIlIlllllIII) {
            lllllllllllllllllIllIIlIlllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlIIIIII(int i, int i2) {
        return i >= i2;
    }
}
