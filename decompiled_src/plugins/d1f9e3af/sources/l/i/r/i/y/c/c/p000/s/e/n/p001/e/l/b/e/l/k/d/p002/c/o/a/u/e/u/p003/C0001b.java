package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/b.class */
public class C0001b {
    public static /* synthetic */ List<Integer> K;
    private static /* synthetic */ int[] lIIllIllI;
    public static /* synthetic */ List<Integer> L;
    public static final /* synthetic */ WorldPoint J;
    public static /* synthetic */ List<Integer> M;
    private static /* synthetic */ String[] lIIllIlIl;

    private static void lIIIIIIIllll() {
        lIIllIllI = new int[33];
        lIIllIllI[0] = (115 ^ 102) & ((153 ^ 140) ^ (-1));
        lIIllIllI[1] = " ".length();
        lIIllIllI[2] = (-((-5011) & 14227)) & (-20485) & 30695;
        lIIllIllI[3] = 5 ^ 15;
        lIIllIllI[4] = "   ".length();
        lIIllIllI[5] = (-8275) & 13274;
        lIIllIllI[6] = (-145) & 8151;
        lIIllIllI[7] = 76 ^ 72;
        lIIllIllI[8] = "  ".length();
        lIIllIllI[9] = (-((-7449) & 23865)) & (-6422) & 23551;
        lIIllIllI[10] = (-22575) & 23039;
        lIIllIllI[11] = (((32 + 161) - 133) + 122) ^ (((113 + 154) - 194) + 100);
        lIIllIllI[12] = (-((-18962) & 32691)) & (-7) & 1013735;
        lIIllIllI[13] = (((11 + 106) - 114) + 134) ^ (((45 + 140) - 76) + 33);
        lIIllIllI[14] = (-19478) & 19903;
        lIIllIllI[15] = (-((-6345) & 7421)) & (-1) & 4095;
        lIIllIllI[16] = (-2114) & 3967;
        lIIllIllI[17] = (-((-6781) & 31359)) & (-6145) & 32639;
        lIIllIllI[18] = (-8322) & 10239;
        lIIllIllI[19] = (-9283) & 9710;
        lIIllIllI[20] = (-8353) & 16365;
        lIIllIllI[21] = (-((-8199) & 13903)) & (-10277) & 16253;
        lIIllIllI[22] = (-((-17757) & 18431)) & (-5) & 13303;
        lIIllIllI[23] = (-516) & 6015;
        lIIllIllI[24] = -" ".length();
        lIIllIllI[25] = 73 ^ 76;
        lIIllIllI[26] = 152 ^ 158;
        lIIllIllI[27] = (227 ^ 155) ^ (87 ^ 36);
        lIIllIllI[28] = (17 ^ 87) ^ (215 ^ 153);
        lIIllIllI[29] = 61 ^ 52;
        lIIllIllI[30] = (-17187) & 20351;
        lIIllIllI[31] = (-((-2645) & 23157)) & (-578) & 24575;
        lIIllIllI[32] = (15 ^ 48) ^ (161 ^ 146);
    }

    public static void a(int i) {
        int intValue;
        if (lIIIIIIlIIII(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (lIIIIIIlIIIl(Static.getClient().isItemDefinitionCached(i) ? 1 : 0)) {
            intValue = Static.getClient().getItemComposition(i).getLinkedNoteId();
            "".length();
            if ("  ".length() == (-" ".length())) {
                return;
            }
        } else {
            intValue = ((Integer) GameThread.invokeLater(() -> {
                return Integer.valueOf(Static.getClient().getItemComposition(i).getLinkedNoteId());
            })).intValue();
        }
        int i2 = intValue;
        if (!lIIIIIIlIllI(GrandExchange.getItemId(), lIIllIllI[24]) || (lIIIIIIlIllI(GrandExchange.getItemId(), i) && lIIIIIIlIllI(GrandExchange.getItemId(), i2))) {
            if (lIIIIIIlIIII(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(i);
        }
    }

    static {
        lIIIIIIIllll();
        lIIIIIIIlllI();
        J = new WorldPoint(lIIllIllI[30], lIIllIllI[31], lIIllIllI[0]);
        K = new ArrayList();
        L = new ArrayList();
        M = new ArrayList();
    }

    private static boolean lIIIIIIllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIIIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIIIIIIlIIIl(int i) {
        return i != 0;
    }

    private static String lIIIIIIIllIl(String lIIIIIIIllIlIIl, String lIIIIIIIllIlIII) {
        String str = new String(Base64.getDecoder().decode(lIIIIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIIIIIIllIIllI = lIIIIIIIllIlIII.toCharArray();
        int lIIIIIIIllIIlIl = lIIllIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lIIIIIIIlIlllIl = lIIllIllI[0];
        while (lIIIIIIlIIlI(lIIIIIIIlIlllIl, length)) {
            char lIIIIIIIllIlIlI = charArray[lIIIIIIIlIlllIl];
            sb.append((char) (lIIIIIIIllIlIlI ^ lIIIIIIIllIIllI[lIIIIIIIllIIlIl % lIIIIIIIllIIllI.length]));
            "".length();
            lIIIIIIIllIIlIl++;
            lIIIIIIIlIlllIl++;
            "".length();
            if ((142 ^ 138) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIIIIIlIll(String lIIIIIIIlIIIlll, String lIIIIIIIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIIIlIIlIIl = Cipher.getInstance("Blowfish");
            lIIIIIIIlIIlIIl.init(lIIllIllI[8], secretKeySpec);
            return new String(lIIIIIIIlIIlIIl.doFinal(Base64.getDecoder().decode(lIIIIIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIIIlIIlIII) {
            lIIIIIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIlll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(String str) {
        List all = Inventory.getAll();
        if (lIIIIIIlIIII(all.isEmpty() ? 1 : 0)) {
            String lIIIIIIlIIIlIlI = null;
            if (lIIIIIIlIIIl(str.contains(lIIllIlIl[lIIllIllI[25]]) ? 1 : 0)) {
                lIIIIIIlIIIlIlI = str.replace(lIIllIlIl[lIIllIllI[26]], lIIllIlIl[lIIllIllI[13]]).trim();
            }
            int i = lIIllIllI[0];
            while (lIIIIIIlIIlI(i, all.size())) {
                String lIIIIIIlIIIlIII = ((Item) all.get(i)).getName();
                if (lIIIIIIllIIl(lIIIIIIlIIIlIII)) {
                    if (lIIIIIIlIIIl(lIIIIIIlIIIlIII.contains(str) ? 1 : 0)) {
                        return lIIllIllI[1];
                    }
                    if (lIIIIIIllIIl(lIIIIIIlIIIlIlI) && lIIIIIIlIIIl(lIIIIIIlIIIlIII.contains(lIIIIIIlIIIlIlI) ? 1 : 0)) {
                        return lIIllIllI[1];
                    }
                }
                i++;
                "".length();
                if (((123 ^ 88) & ((159 ^ 188) ^ (-1))) < ((26 ^ 68) & ((105 ^ 55) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIllIllI[0];
    }

    public static void g() {
        Widget widget = Widgets.get(lIIllIllI[10], lIIllIllI[8], lIIllIllI[27]);
        if (lIIIIIIllIIl(widget)) {
            widget.interact(lIIllIlIl[lIIllIllI[28]]);
            Time.sleepTicks(lIIllIllI[8]);
            "".length();
        }
    }

    private static boolean lIIIIIIlIllI(int i, int i2) {
        return i != i2;
    }

    public static void b(List<Integer> list) {
        if (lIIIIIIlIIII(GrandExchange.isOpen() ? 1 : 0)) {
            if (lIIIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIIIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (lIIIIIIlIIIl(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(lIIllIllI[8]);
            "".length();
            int i = lIIllIllI[0];
            while (lIIIIIIlIIlI(i, list.size())) {
                int[] iArr = new int[lIIllIllI[1]];
                iArr[lIIllIllI[0]] = list.get(i).intValue();
                if (lIIIIIIlIlll(Inventory.getCount(iArr))) {
                    if (lIIIIIIlIIII(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[lIIllIllI[1]];
                        iArr2[lIIllIllI[0]] = list.get(i).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(lIIllIllI[8]);
                        "".length();
                        int i2 = i;
                        Time.sleepUntil(() -> {
                            if (lIIIIIIllIII(GrandExchange.getItemId(), ((Integer) list.get(i2)).intValue())) {
                                ?? r0 = lIIllIllI[1];
                                "".length();
                                return (-" ".length()) > "   ".length() ? ((((128 + 70) - 65) + 21) ^ (((131 + 124) - 230) + 124)) & (((72 ^ 10) ^ (75 ^ 6)) ^ (-" ".length())) : r0;
                            }
                            return lIIllIllI[0];
                        }, lIIllIllI[23]);
                        "".length();
                    }
                    if (lIIIIIIlIIIl(GrandExchange.isSelling() ? 1 : 0)) {
                        if (lIIIIIIlIllI(GrandExchange.getPrice(), lIIllIllI[24])) {
                            GrandExchange.setPrice(lIIllIllI[1]);
                            Time.sleepTicks(lIIllIllI[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIIIIIIllIII(GrandExchange.getPrice(), lIIllIllI[1])) {
                                    ?? r0 = lIIllIllI[1];
                                    "".length();
                                    return ((40 ^ 35) & ((22 ^ 29) ^ (-1))) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIllIllI[0];
                            }, lIIllIllI[23]);
                            "".length();
                        }
                        if (lIIIIIIllIII(GrandExchange.getPrice(), lIIllIllI[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, lIIllIllI[23]);
                            "".length();
                        }
                    }
                    if (lIIIIIIlIIIl(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIIIIIIlIIII(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lIIllIllI[1];
                                "".length();
                                return 0 != 0 ? (!true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                            }
                            return lIIllIllI[0];
                        }, lIIllIllI[5]);
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

    private static boolean lIIIIIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    private static void lIIIIIIIlllI() {
        lIIllIlIl = new String[lIIllIllI[32]];
        lIIllIlIl[lIIllIllI[0]] = lIIIIIIIlIll("6fc/blYcshQ=", "SIccW");
        lIIllIlIl[lIIllIllI[1]] = lIIIIIIIllII("w2rYN8w+Tdv5sjhWYWYWGQ==", "deGHj");
        lIIllIlIl[lIIllIllI[8]] = lIIIIIIIlIll("CR+1xw3aK2m3zTufW4T51UDf7YQ3YpC4kBq3n6/Jn83s9of39WLskcmssNFoKKpzmEMy30MGgCQ=", "VCEEO");
        lIIllIlIl[lIIllIllI[4]] = lIIIIIIIlIll("oCmD4bQxWqyl+ixafq2IKmmn3V45sqaJ", "CuGAK");
        lIIllIlIl[lIIllIllI[7]] = lIIIIIIIllIl("MCAZCTENNVgUNxc9Fwp4S2BR", "cTxdX");
        lIIllIlIl[lIIllIllI[25]] = lIIIIIIIlIll("NLkF/mYC0+Q=", "SjvNC");
        lIIllIlIl[lIIllIllI[26]] = lIIIIIIIllII("O+bGiRjs/9zO4OpnfjTGHg==", "zPpZe");
        lIIllIlIl[lIIllIllI[13]] = lIIIIIIIllII("shZNs5FMIog=", "sgDqY");
        lIIllIlIl[lIIllIllI[28]] = lIIIIIIIlIll("1RTueTzx/X8=", "EBykh");
        lIIllIlIl[lIIllIllI[29]] = lIIIIIIIlIll("urbUnjSI3QM=", "ByOwU");
        lIIllIlIl[lIIllIllI[3]] = lIIIIIIIlIll("zi2sHVJhZ4k=", "UBULX");
        lIIllIlIl[lIIllIllI[27]] = lIIIIIIIlIll("mMVwutCwNvloCZmaDX6R7DvTIcd+to98", "BYLCv");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v169, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<C0003d> list) {
        int i;
        double lIIIIIIlIIllIIl;
        if (lIIIIIIlIIII(list.isEmpty() ? 1 : 0) && lIIIIIIlIIIl(K.isEmpty() ? 1 : 0)) {
            int i2 = lIIllIllI[0];
            while (lIIIIIIlIIlI(i2, list.size())) {
                K.add(Integer.valueOf(list.get(i2).p()));
                "".length();
                L.add(Integer.valueOf(list.get(i2).q()));
                "".length();
                M.add(Integer.valueOf(list.get(i2).r()));
                "".length();
                i2++;
                "".length();
                if ((-((((54 + 3) - 56) + 142) ^ (((25 + 45) - 68) + 137))) > 0) {
                    return;
                }
            }
        }
        int[] iArr = new int[lIIllIllI[1]];
        iArr[lIIllIllI[0]] = lIIllIllI[2];
        if (!lIIIIIIlIIll(Inventory.getCount(iArr), lIIllIllI[1]) || lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
            if (lIIIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lIIllIllI[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(lIIllIlIl[lIIllIllI[27]]);
                };
                if (lIIIIIIlIIIl(Bank.contains(predicate) ? 1 : 0) && lIIIIIIlIIII(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIIllIlIl[lIIllIllI[3]]);
                }) ? 1 : 0) && lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                    Bank.withdraw(predicate, lIIllIllI[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(lIIllIllI[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIIIlIlll(Inventory.getCount(predicate))) {
                            ?? r0 = lIIllIllI[1];
                            "".length();
                            return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIllI[0];
                    }, lIIllIllI[5]);
                    "".length();
                }
                if (lIIIIIIlIIII(Bank.contains(C0005f.bf) ? 1 : 0) && lIIIIIIlIIII(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIllIlIl[lIIllIllI[29]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIllIllI[1]];
                    iArr2[lIIllIllI[0]] = lIIllIllI[6];
                    if (lIIIIIIlIIIl(Bank.contains(iArr2) ? 1 : 0) && lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                        Bank.withdraw(lIIllIllI[6], lIIllIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIllIllI[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[lIIllIllI[1]];
                            iArr3[lIIllIllI[0]] = lIIllIllI[6];
                            if (lIIIIIIlIlll(Inventory.getCount(iArr3))) {
                                ?? r0 = lIIllIllI[1];
                                "".length();
                                return (((((73 + 20) - (-55)) + 28) ^ (((140 + 112) - 99) + 9)) & (((((34 + 62) - 51) + 145) ^ (((132 + 55) - 37) + 22)) ^ (-" ".length()))) < (-" ".length()) ? ((128 ^ 132) ^ (229 ^ 128)) & (((84 ^ 20) ^ (30 ^ 63)) ^ (-" ".length())) : r0;
                            }
                            return lIIllIllI[0];
                        }, lIIllIllI[5]);
                        "".length();
                    }
                }
                if (lIIIIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                    int[] iArr3 = new int[lIIllIllI[1]];
                    iArr3[lIIllIllI[0]] = lIIllIllI[2];
                    if (lIIIIIIlIIlI(Inventory.getCount(iArr3), lIIllIllI[1])) {
                        Bank.withdrawAll(lIIllIllI[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIllIllI[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIIllIllI[1]];
                            iArr4[lIIllIllI[0]] = lIIllIllI[2];
                            return Inventory.contains(iArr4);
                        }, lIIllIllI[5]);
                        "".length();
                    }
                }
            }
            if (lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                if (lIIIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(lIIllIllI[7]);
                    "".length();
                }
                if (lIIIIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                    if (lIIIIIIlIIIl(Inventory.contains(C0005f.bf) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.bf).interact(lIIllIlIl[lIIllIllI[0]]);
                        Time.sleepTicks(lIIllIllI[8]);
                        "".length();
                    }
                    if (lIIIIIIlIIIl(Equipment.contains(C0005f.bf) ? 1 : 0) && lIIIIIIlIllI(Players.getLocal().getAnimation(), lIIllIllI[9])) {
                        Equipment.getFirst(C0005f.bf).interact(lIIllIlIl[lIIllIllI[1]]);
                        Time.sleepTicks(lIIllIllI[4]);
                        "".length();
                    }
                    Movement.walkTo(J);
                    "".length();
                }
            }
        }
        if (lIIIIIIlIIII(Bank.isOpen() ? 1 : 0) && lIIIIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
            int[] iArr4 = new int[lIIllIllI[1]];
            iArr4[lIIllIllI[0]] = lIIllIllI[2];
            if (lIIIIIIlIIlI(Inventory.getCount(iArr4), lIIllIllI[1])) {
                C0000a.a();
            }
        }
        if (lIIIIIIlIIII(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[lIIllIllI[1]];
            iArr5[lIIllIllI[0]] = lIIllIllI[2];
            if (lIIIIIIlIlll(Inventory.getCount(iArr5)) && lIIIIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, lIIllIllI[5]);
                "".length();
            }
        }
        if (lIIIIIIlIIIl(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[lIIllIllI[1]];
            iArr6[lIIllIllI[0]] = lIIllIllI[2];
            if (lIIIIIIlIlll(Inventory.getCount(iArr6))) {
                int i3 = lIIllIllI[0];
                while (lIIIIIIlIIlI(i3, K.size())) {
                    String c = C0002c.c(K.get(i3).intValue());
                    System.out.println("Buying " + c + " and itemID is: " + String.valueOf(K.get(i3)));
                    while (true) {
                        if (!lIIIIIIlIIII(a(c) ? 1 : 0)) {
                            break;
                        }
                        if (lIIIIIIlIIII(GrandExchange.canCollect() ? 1 : 0)) {
                            int i4 = i3;
                            if (lIIIIIIlIlll(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (lIIIIIIllIII(grandExchangeOffer.getItemId(), K.get(i4).intValue())) {
                                    ?? r0 = lIIllIllI[1];
                                    "".length();
                                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIllIllI[0];
                            }).collect(Collectors.toList())).size())) {
                                i = lIIllIllI[1];
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            } else {
                                i = lIIllIllI[0];
                            }
                            int i5 = i;
                            if (lIIIIIIlIIIl(i5) && lIIIIIIlIlII(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (lIIIIIIllIII(grandExchangeOffer2.getItemId(), K.get(i4).intValue())) {
                                    ?? r0 = lIIllIllI[1];
                                    "".length();
                                    return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIllIllI[0];
                            }).collect(Collectors.toList())).size(), lIIllIllI[1])) {
                                GrandExchange.abortOffer(K.get(i3).intValue());
                            }
                            if (lIIIIIIlIIII(i5)) {
                                if (!lIIIIIIlIIIl(GrandExchange.isBuying() ? 1 : 0) || lIIIIIIlIllI(GrandExchange.getItemId(), K.get(i3).intValue())) {
                                    a(K.get(i3).intValue());
                                }
                                if (lIIIIIIllIII(GrandExchange.getItemId(), K.get(i3).intValue()) && lIIIIIIlIllI(GrandExchange.getQuantity(), L.get(i3).intValue())) {
                                    GrandExchange.setQuantity(L.get(i3).intValue());
                                }
                                int intValue = M.get(i3).intValue();
                                int i6 = lIIllIllI[0];
                                Widget widget = Widgets.get(lIIllIllI[10], lIIllIllI[11]);
                                if (lIIIIIIlIIIl(GrandExchange.isOpen() ? 1 : 0) && lIIIIIIlIIIl(GrandExchange.isBuying() ? 1 : 0) && lIIIIIIllIIl(widget) && lIIIIIIlIIII(widget.getText().isEmpty() ? 1 : 0)) {
                                    int guidePrice = GrandExchange.getGuidePrice();
                                    i6 = guidePrice;
                                    System.out.println("Guide price: " + guidePrice + "|Given price: " + String.valueOf(M.get(i3)));
                                }
                                if (lIIIIIIlIIll(i6, intValue)) {
                                    if (lIIIIIIlIlII(i6, lIIllIllI[12])) {
                                        lIIIIIIlIIllIIl = 0.1d;
                                        "".length();
                                        if ("  ".length() == 0) {
                                            return;
                                        }
                                    } else {
                                        lIIIIIIlIIllIIl = 0.3d;
                                    }
                                    int i7 = (int) (i6 + (i6 * lIIIIIIlIIllIIl));
                                    System.out.println("Increased price: " + i7);
                                    if (lIIIIIIllIII(GrandExchange.getItemId(), K.get(i3).intValue()) && lIIIIIIlIllI(GrandExchange.getPrice(), i7)) {
                                        GrandExchange.setPrice(i7);
                                    }
                                    if (lIIIIIIllIII(GrandExchange.getItemId(), K.get(i3).intValue()) && lIIIIIIllIII(GrandExchange.getPrice(), i7)) {
                                        GrandExchange.confirm();
                                    }
                                    "".length();
                                    if ("   ".length() >= (50 ^ 54)) {
                                        return;
                                    }
                                } else {
                                    if (lIIIIIIllIII(GrandExchange.getItemId(), K.get(i3).intValue()) && lIIIIIIlIllI(GrandExchange.getPrice(), M.get(i3).intValue())) {
                                        GrandExchange.setPrice(M.get(i3).intValue());
                                    }
                                    if (lIIIIIIllIII(GrandExchange.getItemId(), K.get(i3).intValue()) && lIIIIIIllIII(GrandExchange.getPrice(), M.get(i3).intValue())) {
                                        GrandExchange.confirm();
                                    }
                                }
                            }
                        }
                        if (lIIIIIIlIIII(Worlds.inMembersWorld() ? 1 : 0)) {
                            System.out.println(lIIllIlIl[lIIllIllI[8]]);
                            AccBuilderEasyClues.d = lIIllIllI[1];
                            return;
                        }
                        if (lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[13])) {
                            Movement.walkTo(J);
                            "".length();
                            Time.sleepTicks(lIIllIllI[1]);
                            "".length();
                        }
                        if (lIIIIIIlIIII(GrandExchange.isOpen() ? 1 : 0)) {
                            GrandExchange.open();
                        }
                        if (lIIIIIIlIIIl(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (lIIIIIIlIIII(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = lIIllIllI[1];
                                    "".length();
                                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIllIllI[0];
                            }, lIIllIllI[5]);
                            "".length();
                        }
                        if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[14])) {
                            int[] iArr7 = new int[lIIllIllI[1]];
                            iArr7[lIIllIllI[0]] = lIIllIllI[14];
                            if (!lIIIIIIlIIII(Inventory.contains(iArr7) ? 1 : 0)) {
                                K.remove(lIIllIllI[0]);
                                "".length();
                                L.remove(lIIllIllI[0]);
                                "".length();
                                M.remove(lIIllIllI[0]);
                                "".length();
                                list.remove(lIIllIllI[0]);
                                "".length();
                                Time.sleepTicks(lIIllIllI[8]);
                                "".length();
                                "".length();
                                if ("  ".length() != 0) {
                                    return;
                                }
                            }
                        }
                        if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[15])) {
                            K.remove(lIIllIllI[0]);
                            "".length();
                            L.remove(lIIllIllI[0]);
                            "".length();
                            M.remove(lIIllIllI[0]);
                            "".length();
                            list.remove(lIIllIllI[0]);
                            "".length();
                            Time.sleepTicks(lIIllIllI[8]);
                            "".length();
                            "".length();
                            if ("  ".length() != 0) {
                            }
                        } else {
                            if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[16])) {
                                int[] iArr8 = new int[lIIllIllI[1]];
                                iArr8[lIIllIllI[0]] = lIIllIllI[16];
                                if (lIIIIIIlIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    list.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[17])) {
                                int[] iArr9 = new int[lIIllIllI[1]];
                                iArr9[lIIllIllI[0]] = lIIllIllI[18];
                                if (lIIIIIIlIIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    list.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if ("  ".length() <= 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[19])) {
                                int[] iArr10 = new int[lIIllIllI[1]];
                                iArr10[lIIllIllI[0]] = lIIllIllI[19];
                                if (lIIIIIIlIIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    list.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[20])) {
                                int[] iArr11 = new int[lIIllIllI[1]];
                                iArr11[lIIllIllI[0]] = lIIllIllI[20];
                                if (lIIIIIIlIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    list.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() >= "  ".length()) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[21])) {
                                int[] iArr12 = new int[lIIllIllI[1]];
                                iArr12[lIIllIllI[0]] = lIIllIllI[21];
                                if (lIIIIIIlIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    list.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks(lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if ((-"   ".length()) >= 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[22])) {
                                String[] strArr = new String[lIIllIllI[1]];
                                strArr[lIIllIllI[0]] = lIIllIlIl[lIIllIllI[4]];
                                if (lIIIIIIlIIII(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[lIIllIllI[1]];
                                    strArr2[lIIllIllI[0]] = lIIllIlIl[lIIllIllI[7]];
                                    if (lIIIIIIlIIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                K.remove(lIIllIllI[0]);
                                "".length();
                                L.remove(lIIllIllI[0]);
                                "".length();
                                M.remove(lIIllIllI[0]);
                                "".length();
                                list.remove(lIIllIllI[0]);
                                "".length();
                                Time.sleepTicks(lIIllIllI[8]);
                                "".length();
                                "".length();
                                if ((-" ".length()) >= (150 ^ 146)) {
                                    return;
                                }
                            }
                            if (!lIIIIIIlIIII(a(c) ? 1 : 0)) {
                                break;
                            } else if (lIIIIIIlIIIl(AccBuilderEasyClues.d ? 1 : 0)) {
                                "".length();
                                if ((-((241 ^ 196) ^ (49 ^ 0))) > 0) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(lIIllIllI[4]);
                                "".length();
                                "".length();
                                if (((121 ^ 57) ^ (99 ^ 39)) <= (-" ".length())) {
                                    return;
                                }
                            }
                        }
                    }
                    if (lIIIIIIlIIIl(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIIIIIIlIIII(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lIIllIllI[1];
                                "".length();
                                return (-((134 ^ 177) ^ (81 ^ 99))) >= 0 ? ((((31 + 209) - 110) + 93) ^ (((25 + 27) - (-88)) + 57)) & (((88 ^ 93) ^ (48 ^ 47)) ^ (-" ".length())) : r0;
                            }
                            return lIIllIllI[0];
                        }, lIIllIllI[5]);
                        "".length();
                    }
                    System.out.println(list.get(i3).p());
                    if (lIIIIIIllIII(K.get(i3).intValue(), lIIllIllI[15])) {
                        K.remove(lIIllIllI[0]);
                        "".length();
                        L.remove(lIIllIllI[0]);
                        "".length();
                        M.remove(lIIllIllI[0]);
                        "".length();
                        list.remove(lIIllIllI[0]);
                        "".length();
                    }
                    if (lIIIIIIlIIIl(a(c) ? 1 : 0)) {
                        K.remove(lIIllIllI[0]);
                        "".length();
                        L.remove(lIIllIllI[0]);
                        "".length();
                        M.remove(lIIllIllI[0]);
                        "".length();
                        list.remove(lIIllIllI[0]);
                        "".length();
                    }
                    Time.sleepTicks(lIIllIllI[8]);
                    "".length();
                    i3++;
                    "".length();
                    if ((((36 ^ 6) ^ (91 ^ 83)) & (((106 ^ 92) ^ (55 ^ 43)) ^ (-" ".length()))) > 0) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean lIIIIIIlIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIIIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIIIIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIIIIIIIllII(String lIIIIIIIlIlIlII, String lIIIIIIIlIlIIIl) {
        try {
            SecretKeySpec lIIIIIIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIllIllI[28]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIllI[8], lIIIIIIIlIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIIIlIlIlIl) {
            lIIIIIIIlIlIlIl.printStackTrace();
            return null;
        }
    }
}
