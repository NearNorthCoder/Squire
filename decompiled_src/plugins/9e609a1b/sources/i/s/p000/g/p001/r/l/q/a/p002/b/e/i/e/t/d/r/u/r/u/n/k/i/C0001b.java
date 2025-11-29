package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/b.class */
public class C0001b {
    public static final /* synthetic */ WorldPoint I;
    private static /* synthetic */ String[] lIIIllllIlIll;
    public static /* synthetic */ List<Integer> L;
    private static /* synthetic */ int[] lIIIllllIllII;
    public static /* synthetic */ List<Integer> K;
    public static /* synthetic */ List<Integer> J;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(String str) {
        List all = Inventory.getAll();
        if (lIlIIlIlllIllII(all.isEmpty() ? 1 : 0)) {
            String str2 = null;
            if (lIlIIlIlllIllIl(str.contains(lIIIllllIlIll[lIIIllllIllII[25]]) ? 1 : 0)) {
                str2 = str.replace(lIIIllllIlIll[lIIIllllIllII[26]], lIIIllllIlIll[lIIIllllIllII[13]]).trim();
            }
            int i2 = lIIIllllIllII[0];
            while (lIlIIlIlllIlllI(i2, all.size())) {
                String name = ((Item) all.get(i2)).getName();
                if (lIlIIlIllllIlIl(name)) {
                    if (lIlIIlIlllIllIl(name.contains(str) ? 1 : 0)) {
                        return lIIIllllIllII[1];
                    }
                    if (lIlIIlIllllIlIl(str2) && lIlIIlIlllIllIl(name.contains(str2) ? 1 : 0)) {
                        return lIIIllllIllII[1];
                    }
                }
                i2++;
                "".length();
                if (" ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIIllllIllII[0];
    }

    private static boolean lIlIIlIlllIlllI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIlIlllIlIII(String lllllllllllllllIIIIIIllIIlIIIIll, String lllllllllllllllIIIIIIllIIlIIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIllIIlIIIIIl = new StringBuilder();
        char[] lllllllllllllllIIIIIIllIIlIIIIII = lllllllllllllllIIIIIIllIIlIIIIlI.toCharArray();
        int lllllllllllllllIIIIIIllIIIllllll = lIIIllllIllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIIllllIllII[0];
        while (lIlIIlIlllIlllI(i2, length)) {
            lllllllllllllllIIIIIIllIIlIIIIIl.append((char) (charArray[i2] ^ lllllllllllllllIIIIIIllIIlIIIIII[lllllllllllllllIIIIIIllIIIllllll % lllllllllllllllIIIIIIllIIlIIIIII.length]));
            "".length();
            lllllllllllllllIIIIIIllIIIllllll++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIIllIIlIIIIIl);
    }

    private static void lIlIIlIlllIlIlI() {
        lIIIllllIllII = new int[33];
        lIIIllllIllII[0] = (214 ^ 140) & ((198 ^ 156) ^ (-1));
        lIIIllllIllII[1] = " ".length();
        lIIIllllIllII[2] = (-14361) & 15355;
        lIIIllllIllII[3] = 29 ^ 23;
        lIIIllllIllII[4] = "   ".length();
        lIIIllllIllII[5] = (-1123) & 6122;
        lIIIllllIllII[6] = (-24761) & 32767;
        lIIIllllIllII[7] = 46 ^ 42;
        lIIIllllIllII[8] = "  ".length();
        lIIIllllIllII[9] = (-3073) & 3786;
        lIIIllllIllII[10] = (-((-4861) & 30463)) & (-45) & 26111;
        lIIIllllIllII[11] = 23 ^ 12;
        lIIIllllIllII[12] = (-4374) & 1004373;
        lIIIllllIllII[13] = 192 ^ 199;
        lIIIllllIllII[14] = (-((-1710) & 12015)) & (-1029) & 11759;
        lIIIllllIllII[15] = (-13329) & 16347;
        lIIIllllIllII[16] = (-18434) & 20287;
        lIIIllllIllII[17] = (-((-19741) & 32157)) & (-1) & 14333;
        lIIIllllIllII[18] = (-((-27253) & 31349)) & (-8194) & 14207;
        lIIIllllIllII[19] = (-((-16433) & 26227)) & (-4114) & 14335;
        lIIIllllIllII[20] = (-8241) & 16253;
        lIIIllllIllII[21] = (-25161) & 25433;
        lIIIllllIllII[22] = (-((-8553) & 9711)) & (-16897) & 30679;
        lIIIllllIllII[23] = (-((-209) & 2771)) & (-16514) & 24575;
        lIIIllllIllII[24] = -" ".length();
        lIIIllllIllII[25] = (34 ^ 91) ^ (213 ^ 169);
        lIIIllllIllII[26] = 124 ^ 122;
        lIIIllllIllII[27] = 100 ^ 111;
        lIIIllllIllII[28] = (80 ^ 11) ^ (63 ^ 108);
        lIIIllllIllII[29] = 52 ^ 61;
        lIIIllllIllII[30] = (-((-10317) & 14831)) & (-8705) & 16383;
        lIIIllllIllII[31] = (-((-3386) & 32571)) & (-65) & 32735;
        lIIIllllIllII[32] = (100 ^ 118) ^ (89 ^ 71);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<C0003d> list) {
        int i2;
        double lllllllllllllllIIIIIIllIlIIIllIl;
        if (lIlIIlIlllIllII(list.isEmpty() ? 1 : 0) && lIlIIlIlllIllIl(J.isEmpty() ? 1 : 0)) {
            int i3 = lIIIllllIllII[0];
            while (lIlIIlIlllIlllI(i3, list.size())) {
                J.add(Integer.valueOf(list.get(i3).p()));
                "".length();
                K.add(Integer.valueOf(list.get(i3).q()));
                "".length();
                L.add(Integer.valueOf(list.get(i3).r()));
                "".length();
                i3++;
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
        }
        int[] iArr = new int[lIIIllllIllII[1]];
        iArr[lIIIllllIllII[0]] = lIIIllllIllII[2];
        if (!lIlIIlIlllIllll(Inventory.getCount(iArr), lIIIllllIllII[1]) || lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
            if (lIlIIlIlllIllIl(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lIIIllllIllII[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(lIIIllllIlIll[lIIIllllIllII[27]]);
                };
                if (lIlIIlIlllIllIl(Bank.contains(predicate) ? 1 : 0) && lIlIIlIlllIllII(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIIIllllIlIll[lIIIllllIllII[3]]);
                }) ? 1 : 0) && lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                    Bank.withdraw(predicate, lIIIllllIllII[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(lIIIllllIllII[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIllllIIll(Inventory.getCount(predicate))) {
                            ?? r0 = lIIIllllIllII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllllIllII[0];
                    }, lIIIllllIllII[5]);
                    "".length();
                }
                if (lIlIIlIlllIllII(Bank.contains(C0005f.bk) ? 1 : 0) && lIlIIlIlllIllII(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIIllllIlIll[lIIIllllIllII[29]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIllllIllII[1]];
                    iArr2[lIIIllllIllII[0]] = lIIIllllIllII[6];
                    if (lIlIIlIlllIllIl(Bank.contains(iArr2) ? 1 : 0) && lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                        Bank.withdraw(lIIIllllIllII[6], lIIIllllIllII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllII[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[lIIIllllIllII[1]];
                            iArr3[lIIIllllIllII[0]] = lIIIllllIllII[6];
                            if (lIlIIlIllllIIll(Inventory.getCount(iArr3))) {
                                ?? r0 = lIIIllllIllII[1];
                                "".length();
                                return " ".length() > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIllllIllII[0];
                        }, lIIIllllIllII[5]);
                        "".length();
                    }
                }
                if (lIlIIlIllllIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                    int[] iArr3 = new int[lIIIllllIllII[1]];
                    iArr3[lIIIllllIllII[0]] = lIIIllllIllII[2];
                    if (lIlIIlIlllIlllI(Inventory.getCount(iArr3), lIIIllllIllII[1])) {
                        Bank.withdrawAll(lIIIllllIllII[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllII[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIIIllllIllII[1]];
                            iArr4[lIIIllllIllII[0]] = lIIIllllIllII[2];
                            return Inventory.contains(iArr4);
                        }, lIIIllllIllII[5]);
                        "".length();
                    }
                }
            }
            if (lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                if (lIlIIlIlllIllIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(lIIIllllIllII[7]);
                    "".length();
                }
                if (lIlIIlIlllIllII(Bank.isOpen() ? 1 : 0)) {
                    if (lIlIIlIlllIllIl(Inventory.contains(C0005f.bk) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.bk).interact(lIIIllllIlIll[lIIIllllIllII[0]]);
                        Time.sleepTicks(lIIIllllIllII[8]);
                        "".length();
                    }
                    if (lIlIIlIlllIllIl(Equipment.contains(C0005f.bk) ? 1 : 0) && lIlIIlIllllIIlI(Players.getLocal().getAnimation(), lIIIllllIllII[9])) {
                        Equipment.getFirst(C0005f.bk).interact(lIIIllllIlIll[lIIIllllIllII[1]]);
                        Time.sleepTicks(lIIIllllIllII[4]);
                        "".length();
                    }
                    Movement.walkTo(I);
                    "".length();
                }
            }
        }
        if (lIlIIlIlllIllII(Bank.isOpen() ? 1 : 0) && lIlIIlIllllIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
            int[] iArr4 = new int[lIIIllllIllII[1]];
            iArr4[lIIIllllIllII[0]] = lIIIllllIllII[2];
            if (lIlIIlIlllIlllI(Inventory.getCount(iArr4), lIIIllllIllII[1])) {
                C0000a.a();
            }
        }
        if (lIlIIlIlllIllII(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[lIIIllllIllII[1]];
            iArr5[lIIIllllIllII[0]] = lIIIllllIllII[2];
            if (lIlIIlIllllIIll(Inventory.getCount(iArr5)) && lIlIIlIllllIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, lIIIllllIllII[5]);
                "".length();
            }
        }
        if (lIlIIlIlllIllIl(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[lIIIllllIllII[1]];
            iArr6[lIIIllllIllII[0]] = lIIIllllIllII[2];
            if (lIlIIlIllllIIll(Inventory.getCount(iArr6))) {
                int i4 = lIIIllllIllII[0];
                while (lIlIIlIlllIlllI(i4, J.size())) {
                    String c = C0002c.c(J.get(i4).intValue());
                    System.out.println("Buying " + c + " and itemID is: " + String.valueOf(J.get(i4)));
                    while (true) {
                        if (!lIlIIlIlllIllII(a(c) ? 1 : 0)) {
                            break;
                        }
                        if (lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                            int i5 = i4;
                            if (lIlIIlIllllIIll(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (lIlIIlIllllIlII(grandExchangeOffer.getItemId(), J.get(i5).intValue())) {
                                    ?? r0 = lIIIllllIllII[1];
                                    "".length();
                                    return 0 != 0 ? ((((22 + 128) - 57) + 36) ^ (((130 + 4) - 46) + 70)) & (((((47 + 99) - 88) + 71) ^ (((53 + 73) - (-21)) + 11)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllllIllII[0];
                            }).collect(Collectors.toList())).size())) {
                                i2 = lIIIllllIllII[1];
                                "".length();
                                if ((82 ^ 86) == "  ".length()) {
                                    return;
                                }
                            } else {
                                i2 = lIIIllllIllII[0];
                            }
                            int i6 = i2;
                            if (lIlIIlIlllIllIl(i6) && lIlIIlIllllIIII(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (lIlIIlIllllIlII(grandExchangeOffer2.getItemId(), J.get(i5).intValue())) {
                                    ?? r0 = lIIIllllIllII[1];
                                    "".length();
                                    return (-((((112 + 5) - 26) + 48) ^ (((66 + 138) - 190) + 129))) > 0 ? ((194 ^ 190) ^ (53 ^ 1)) & (((233 ^ 170) ^ (201 ^ 194)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllllIllII[0];
                            }).collect(Collectors.toList())).size(), lIIIllllIllII[1])) {
                                GrandExchange.abortOffer(J.get(i4).intValue());
                            }
                            if (lIlIIlIlllIllII(i6)) {
                                if (!lIlIIlIlllIllIl(GrandExchange.isBuying() ? 1 : 0) || lIlIIlIllllIIlI(GrandExchange.getItemId(), J.get(i4).intValue())) {
                                    a(J.get(i4).intValue());
                                }
                                if (lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(i4).intValue()) && lIlIIlIllllIIlI(GrandExchange.getQuantity(), K.get(i4).intValue())) {
                                    GrandExchange.setQuantity(K.get(i4).intValue());
                                }
                                int lllllllllllllllIIIIIIllIlIIlIIII = L.get(i4).intValue();
                                int i7 = lIIIllllIllII[0];
                                Widget widget = Widgets.get(lIIIllllIllII[10], lIIIllllIllII[11]);
                                if (lIlIIlIlllIllIl(GrandExchange.isOpen() ? 1 : 0) && lIlIIlIlllIllIl(GrandExchange.isBuying() ? 1 : 0) && lIlIIlIllllIlIl(widget) && lIlIIlIlllIllII(widget.getText().isEmpty() ? 1 : 0)) {
                                    int guidePrice = GrandExchange.getGuidePrice();
                                    i7 = guidePrice;
                                    System.out.println("Guide price: " + guidePrice + "|Given price: " + String.valueOf(L.get(i4)));
                                }
                                if (lIlIIlIlllIllll(i7, lllllllllllllllIIIIIIllIlIIlIIII)) {
                                    if (lIlIIlIllllIIII(i7, lIIIllllIllII[12])) {
                                        lllllllllllllllIIIIIIllIlIIIllIl = 0.1d;
                                        "".length();
                                        if (((250 ^ 194) & ((77 ^ 117) ^ (-1))) > (2 ^ 6)) {
                                            return;
                                        }
                                    } else {
                                        lllllllllllllllIIIIIIllIlIIIllIl = 0.3d;
                                    }
                                    int i8 = (int) (i7 + (i7 * lllllllllllllllIIIIIIllIlIIIllIl));
                                    System.out.println("Increased price: " + i8);
                                    if (lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(i4).intValue()) && lIlIIlIllllIIlI(GrandExchange.getPrice(), i8)) {
                                        GrandExchange.setPrice(i8);
                                    }
                                    if (lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(i4).intValue()) && lIlIIlIllllIlII(GrandExchange.getPrice(), i8)) {
                                        GrandExchange.confirm();
                                    }
                                    "".length();
                                    if (!((true ^ true) ^ (true ^ true))) {
                                        return;
                                    }
                                } else {
                                    if (lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(i4).intValue()) && lIlIIlIllllIIlI(GrandExchange.getPrice(), L.get(i4).intValue())) {
                                        GrandExchange.setPrice(L.get(i4).intValue());
                                    }
                                    if (lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(i4).intValue()) && lIlIIlIllllIlII(GrandExchange.getPrice(), L.get(i4).intValue())) {
                                        GrandExchange.confirm();
                                    }
                                }
                            }
                        }
                        if (lIlIIlIlllIllII(Worlds.inMembersWorld() ? 1 : 0)) {
                            System.out.println(lIIIllllIlIll[lIIIllllIllII[8]]);
                            AccBuilderRat.d = lIIIllllIllII[1];
                            return;
                        }
                        if (lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[13])) {
                            Movement.walkTo(I);
                            "".length();
                            Time.sleepTicks(lIIIllllIllII[1]);
                            "".length();
                        }
                        if (lIlIIlIlllIllII(GrandExchange.isOpen() ? 1 : 0)) {
                            GrandExchange.open();
                        }
                        if (lIlIIlIlllIllIl(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = lIIIllllIllII[1];
                                    "".length();
                                    return "   ".length() <= 0 ? ((173 ^ 193) ^ (120 ^ 1)) & (((((114 + 113) - 109) + 40) ^ (((74 + 118) - 128) + 75)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllllIllII[0];
                            }, lIIIllllIllII[5]);
                            "".length();
                        }
                        if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[14])) {
                            int[] iArr7 = new int[lIIIllllIllII[1]];
                            iArr7[lIIIllllIllII[0]] = lIIIllllIllII[14];
                            if (!lIlIIlIlllIllII(Inventory.contains(iArr7) ? 1 : 0)) {
                                J.remove(lIIIllllIllII[0]);
                                "".length();
                                K.remove(lIIIllllIllII[0]);
                                "".length();
                                L.remove(lIIIllllIllII[0]);
                                "".length();
                                list.remove(lIIIllllIllII[0]);
                                "".length();
                                Time.sleepTicks(lIIIllllIllII[8]);
                                "".length();
                                "".length();
                                if ((-"   ".length()) <= 0) {
                                    return;
                                }
                            }
                        }
                        if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[15])) {
                            J.remove(lIIIllllIllII[0]);
                            "".length();
                            K.remove(lIIIllllIllII[0]);
                            "".length();
                            L.remove(lIIIllllIllII[0]);
                            "".length();
                            list.remove(lIIIllllIllII[0]);
                            "".length();
                            Time.sleepTicks(lIIIllllIllII[8]);
                            "".length();
                            "".length();
                            if ((-"   ".length()) <= 0) {
                            }
                        } else {
                            if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[16])) {
                                int[] iArr8 = new int[lIIIllllIllII[1]];
                                iArr8[lIIIllllIllII[0]] = lIIIllllIllII[16];
                                if (lIlIIlIlllIllIl(Inventory.contains(iArr8) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    list.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks(lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if (((240 ^ 163) ^ (24 ^ 78)) <= 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[17])) {
                                int[] iArr9 = new int[lIIIllllIllII[1]];
                                iArr9[lIIIllllIllII[0]] = lIIIllllIllII[18];
                                if (lIlIIlIlllIllIl(Inventory.contains(iArr9) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    list.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks(lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() < (((7 ^ 56) ^ (83 ^ 126)) & (((((55 + 3) - (-39)) + 36) ^ (((123 + 134) - 128) + 22)) ^ (-" ".length())))) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[19])) {
                                int[] iArr10 = new int[lIIIllllIllII[1]];
                                iArr10[lIIIllllIllII[0]] = lIIIllllIllII[19];
                                if (lIlIIlIlllIllIl(Inventory.contains(iArr10) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    list.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks(lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if ((-" ".length()) > "  ".length()) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[20])) {
                                int[] iArr11 = new int[lIIIllllIllII[1]];
                                iArr11[lIIIllllIllII[0]] = lIIIllllIllII[20];
                                if (lIlIIlIlllIllIl(Inventory.contains(iArr11) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    list.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks(lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if ((-(92 ^ 89)) >= 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[21])) {
                                int[] iArr12 = new int[lIIIllllIllII[1]];
                                iArr12[lIIIllllIllII[0]] = lIIIllllIllII[21];
                                if (lIlIIlIlllIllIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    list.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks(lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if ("  ".length() <= (-" ".length())) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[22])) {
                                String[] strArr = new String[lIIIllllIllII[1]];
                                strArr[lIIIllllIllII[0]] = lIIIllllIlIll[lIIIllllIllII[4]];
                                if (lIlIIlIlllIllII(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[lIIIllllIllII[1]];
                                    strArr2[lIIIllllIllII[0]] = lIIIllllIlIll[lIIIllllIllII[7]];
                                    if (lIlIIlIlllIllIl(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                J.remove(lIIIllllIllII[0]);
                                "".length();
                                K.remove(lIIIllllIllII[0]);
                                "".length();
                                L.remove(lIIIllllIllII[0]);
                                "".length();
                                list.remove(lIIIllllIllII[0]);
                                "".length();
                                Time.sleepTicks(lIIIllllIllII[8]);
                                "".length();
                                "".length();
                                if ("  ".length() <= 0) {
                                    return;
                                }
                            }
                            if (!lIlIIlIlllIllII(a(c) ? 1 : 0)) {
                                break;
                            } else if (lIlIIlIlllIllIl(AccBuilderRat.d ? 1 : 0)) {
                                "".length();
                                if ("   ".length() <= "  ".length()) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(lIIIllllIllII[4]);
                                "".length();
                                "".length();
                                if ((((90 ^ 52) ^ (165 ^ 152)) & (((240 ^ 141) ^ (159 ^ 177)) ^ (-" ".length()))) != 0) {
                                    return;
                                }
                            }
                        }
                    }
                    if (lIlIIlIlllIllIl(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lIIIllllIllII[1];
                                "".length();
                                return (-(121 ^ 125)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIllllIllII[0];
                        }, lIIIllllIllII[5]);
                        "".length();
                    }
                    System.out.println(list.get(i4).p());
                    if (lIlIIlIllllIlII(J.get(i4).intValue(), lIIIllllIllII[15])) {
                        J.remove(lIIIllllIllII[0]);
                        "".length();
                        K.remove(lIIIllllIllII[0]);
                        "".length();
                        L.remove(lIIIllllIllII[0]);
                        "".length();
                        list.remove(lIIIllllIllII[0]);
                        "".length();
                    }
                    if (lIlIIlIlllIllIl(a(c) ? 1 : 0)) {
                        J.remove(lIIIllllIllII[0]);
                        "".length();
                        K.remove(lIIIllllIllII[0]);
                        "".length();
                        L.remove(lIIIllllIllII[0]);
                        "".length();
                        list.remove(lIIIllllIllII[0]);
                        "".length();
                    }
                    Time.sleepTicks(lIIIllllIllII[8]);
                    "".length();
                    i4++;
                    "".length();
                    if ((159 ^ 154) <= 0) {
                        return;
                    }
                }
            }
        }
    }

    static {
        lIlIIlIlllIlIlI();
        lIlIIlIlllIlIIl();
        I = new WorldPoint(lIIIllllIllII[30], lIIIllllIllII[31], lIIIllllIllII[0]);
        J = new ArrayList();
        K = new ArrayList();
        L = new ArrayList();
    }

    private static boolean lIlIIlIlllIllII(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlIllllIIIl(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIlIllllIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlIIlIlllIIllI(String lllllllllllllllIIIIIIllIIllIIIII, String lllllllllllllllIIIIIIllIIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIllIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllllIllII[8], lllllllllllllllIIIIIIllIIllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIllIIllIIIIl) {
            lllllllllllllllIIIIIIllIIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIlllIlIIl() {
        lIIIllllIlIll = new String[lIIIllllIllII[32]];
        lIIIllllIlIll[lIIIllllIllII[0]] = lIlIIlIlllIIllI("YVI4l4WsSm4=", "KayOX");
        lIIIllllIlIll[lIIIllllIllII[1]] = lIlIIlIlllIIllI("F6o23p1f+jXJ2JJ6am0wJw==", "fFezx");
        lIIIllllIlIll[lIIIllllIllII[8]] = lIlIIlIlllIIlll("X+UwIUI6TRxKh9WTEsdDQDT2nolViSNnDZQfexU79Sjpw1R6PBifMoJGBfiYI4G7LJzPz5mmEsY=", "tsdiy");
        lIIIllllIlIll[lIIIllllIllII[4]] = lIlIIlIlllIlIII("ITMtByccJmwaIQYuIwRmRm4=", "rGLjN");
        lIIIllllIlIll[lIIIllllIllII[7]] = lIlIIlIlllIIlll("1GXM1netUyfKPw3lLu/NCxBwNmSdqkpY", "aiudo");
        lIIIllllIlIll[lIIIllllIllII[25]] = lIlIIlIlllIIllI("l81qja676m0=", "gCnVy");
        lIIIllllIlIll[lIIIllllIllII[26]] = lIlIIlIlllIIllI("ksCk4QHQkGII5+Nr2xTWYA==", "RufaY");
        lIIIllllIlIll[lIIIllllIllII[13]] = lIlIIlIlllIIlll("2BB/EUqV67M=", "lSeGK");
        lIIIllllIlIll[lIIIllllIllII[28]] = lIlIIlIlllIlIII("KxQlFSw=", "hxJfI");
        lIIIllllIlIll[lIIIllllIllII[29]] = lIlIIlIlllIIlll("J+rors4TRYk=", "RQZPO");
        lIIIllllIlIll[lIIIllllIllII[3]] = lIlIIlIlllIlIII("BisjGhkZ", "qNBvm");
        lIIIllllIlIll[lIIIllllIllII[27]] = lIlIIlIlllIlIII("ByYINUEaKUYlBBQjEjpBXQ==", "uOfRa");
    }

    private static boolean lIlIIlIlllIllll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIlIllllIIlI(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlIIlIlllIllIl(int i2) {
        return i2 != 0;
    }

    public static void g() {
        Widget widget = Widgets.get(lIIIllllIllII[10], lIIIllllIllII[8], lIIIllllIllII[27]);
        if (lIlIIlIllllIlIl(widget)) {
            widget.interact(lIIIllllIlIll[lIIIllllIllII[28]]);
            Time.sleepTicks(lIIIllllIllII[8]);
            "".length();
        }
    }

    public static void b(List<Integer> list) {
        if (lIlIIlIlllIllII(GrandExchange.isOpen() ? 1 : 0)) {
            if (lIlIIlIlllIllIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIlIIlIlllIllII(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (lIlIIlIlllIllIl(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(lIIIllllIllII[8]);
            "".length();
            int i2 = lIIIllllIllII[0];
            while (lIlIIlIlllIlllI(i2, list.size())) {
                int[] iArr = new int[lIIIllllIllII[1]];
                iArr[lIIIllllIllII[0]] = list.get(i2).intValue();
                if (lIlIIlIllllIIll(Inventory.getCount(iArr))) {
                    if (lIlIIlIlllIllII(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[lIIIllllIllII[1]];
                        iArr2[lIIIllllIllII[0]] = list.get(i2).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(lIIIllllIllII[8]);
                        "".length();
                        int i3 = i2;
                        Time.sleepUntil(() -> {
                            if (lIlIIlIllllIlII(GrandExchange.getItemId(), ((Integer) list.get(i3)).intValue())) {
                                ?? r0 = lIIIllllIllII[1];
                                "".length();
                                return 0 != 0 ? ((((0 + 73) - (-140)) + 3) ^ (((54 + 83) - 117) + 114)) & (((82 ^ 12) ^ ((66 ^ 13) & ((75 ^ 4) ^ (-1)))) ^ (-" ".length())) : r0;
                            }
                            return lIIIllllIllII[0];
                        }, lIIIllllIllII[23]);
                        "".length();
                    }
                    if (lIlIIlIlllIllIl(GrandExchange.isSelling() ? 1 : 0)) {
                        if (lIlIIlIllllIIlI(GrandExchange.getPrice(), lIIIllllIllII[24])) {
                            GrandExchange.setPrice(lIIIllllIllII[1]);
                            Time.sleepTicks(lIIIllllIllII[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIlIIlIllllIlII(GrandExchange.getPrice(), lIIIllllIllII[1])) {
                                    ?? r0 = lIIIllllIllII[1];
                                    "".length();
                                    return (185 ^ 189) < (174 ^ 170) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIllllIllII[0];
                            }, lIIIllllIllII[23]);
                            "".length();
                        }
                        if (lIlIIlIllllIlII(GrandExchange.getPrice(), lIIIllllIllII[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, lIIIllllIllII[23]);
                            "".length();
                        }
                    }
                    if (lIlIIlIlllIllIl(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = lIIIllllIllII[1];
                                "".length();
                                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIllllIllII[0];
                        }, lIIIllllIllII[5]);
                        "".length();
                    }
                }
                i2++;
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
        }
    }

    public static void a(int i2) {
        int intValue;
        if (lIlIIlIlllIllII(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (lIlIIlIlllIllIl(Static.getClient().isItemDefinitionCached(i2) ? 1 : 0)) {
            intValue = Static.getClient().getItemComposition(i2).getLinkedNoteId();
            "".length();
            if ((((218 ^ 158) ^ (180 ^ 184)) & (((241 ^ 195) ^ (57 ^ 67)) ^ (-" ".length()))) != (((((0 + 60) - (-91)) + 63) ^ (((26 + 19) - 43) + 128)) & (((138 ^ 155) ^ (9 ^ 76)) ^ (-" ".length())))) {
                return;
            }
        } else {
            intValue = ((Integer) GameThread.invokeLater(() -> {
                return Integer.valueOf(Static.getClient().getItemComposition(i2).getLinkedNoteId());
            })).intValue();
        }
        int i3 = intValue;
        if (!lIlIIlIllllIIlI(GrandExchange.getItemId(), lIIIllllIllII[24]) || (lIlIIlIllllIIlI(GrandExchange.getItemId(), i2) && lIlIIlIllllIIlI(GrandExchange.getItemId(), i3))) {
            if (lIlIIlIlllIllII(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(i2);
        }
    }

    private static String lIlIIlIlllIIlll(String lllllllllllllllIIIIIIllIIlIlIIll, String lllllllllllllllIIIIIIllIIlIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIllIIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIIllllIllII[28]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllllIllII[8], lllllllllllllllIIIIIIllIIlIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIllIIlIlIlII) {
            lllllllllllllllIIIIIIllIIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllllIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIllllIIII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIIlIllllIIll(int i2) {
        return i2 > 0;
    }
}
