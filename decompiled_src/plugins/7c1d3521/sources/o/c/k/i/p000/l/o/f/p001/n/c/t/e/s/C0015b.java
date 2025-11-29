package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/b.class */
public class C0015b {
    public static /* synthetic */ List<Integer> L;
    public static /* synthetic */ List<Integer> K;
    public static final /* synthetic */ WorldPoint I;
    private static /* synthetic */ String[] llIIIlIlII;
    public static /* synthetic */ List<Integer> J;
    private static /* synthetic */ int[] llIIIlIlIl;

    private static String lIlIIlIllIlII(String llllllllllllllllllIlIlllIIllIlII, String llllllllllllllllllIlIlllIIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlllIIllIIll.getBytes(StandardCharsets.UTF_8)), llIIIlIlIl[28]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlIlIl[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlllIIllIlIl) {
            llllllllllllllllllIlIlllIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlllIll(int i, int i2) {
        return i > i2;
    }

    static {
        lIlIIlIllIllI();
        lIlIIlIllIlIl();
        I = new WorldPoint(llIIIlIlIl[30], llIIIlIlIl[31], llIIIlIlIl[0]);
        J = new ArrayList();
        K = new ArrayList();
        L = new ArrayList();
    }

    private static boolean lIlIIlIllIlll(int i) {
        return i == 0;
    }

    private static boolean lIlIIllIIIIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(String str) {
        List all = Inventory.getAll();
        if (lIlIIlIllIlll(all.isEmpty() ? 1 : 0)) {
            String str2 = null;
            if (lIlIIlIlllIII(str.contains(llIIIlIlII[llIIIlIlIl[25]]) ? 1 : 0)) {
                str2 = str.replace(llIIIlIlII[llIIIlIlIl[26]], llIIIlIlII[llIIIlIlIl[13]]).trim();
            }
            int i = llIIIlIlIl[0];
            while (lIlIIlIlllIIl(i, all.size())) {
                String name = ((Item) all.get(i)).getName();
                if (lIlIIllIIIIII(name)) {
                    if (lIlIIlIlllIII(name.contains(str) ? 1 : 0)) {
                        return llIIIlIlIl[1];
                    }
                    if (lIlIIllIIIIII(str2) && lIlIIlIlllIII(name.contains(str2) ? 1 : 0)) {
                        return llIIIlIlIl[1];
                    }
                }
                i++;
                "".length();
                if (" ".length() < ((97 ^ 87) & ((4 ^ 50) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llIIIlIlIl[0];
    }

    private static boolean lIlIIlIlllIIl(int i, int i2) {
        return i < i2;
    }

    public static void g() {
        Widget widget = Widgets.get(llIIIlIlIl[10], llIIIlIlIl[8], llIIIlIlIl[27]);
        if (lIlIIllIIIIII(widget)) {
            widget.interact(llIIIlIlII[llIIIlIlIl[28]]);
            Time.sleepTicks(llIIIlIlIl[8]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0813 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v171, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(List<C0017d> list) {
        int i;
        double d;
        if (lIlIIlIllIlll(list.isEmpty() ? 1 : 0) && lIlIIlIlllIII(J.isEmpty() ? 1 : 0)) {
            int i2 = llIIIlIlIl[0];
            while (lIlIIlIlllIIl(i2, list.size())) {
                J.add(Integer.valueOf(list.get(i2).p()));
                "".length();
                K.add(Integer.valueOf(list.get(i2).q()));
                "".length();
                L.add(Integer.valueOf(list.get(i2).r()));
                "".length();
                i2++;
                "".length();
                if ((27 ^ 31) < 0) {
                    return;
                }
            }
        }
        int[] iArr = new int[llIIIlIlIl[1]];
        iArr[llIIIlIlIl[0]] = llIIIlIlIl[2];
        if (!lIlIIlIlllIlI(Inventory.getCount(iArr), llIIIlIlIl[1]) || lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
            if (lIlIIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                Time.sleepTicks(llIIIlIlIl[4]);
                "".length();
                Predicate predicate = item -> {
                    return item.getName().toLowerCase().contains(llIIIlIlII[llIIIlIlIl[27]]);
                };
                if (lIlIIlIlllIII(Bank.contains(predicate) ? 1 : 0) && lIlIIlIllIlll(Inventory.contains(item2 -> {
                    return item2.getName().contains(llIIIlIlII[llIIIlIlIl[3]]);
                }) ? 1 : 0) && lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                    Bank.withdraw(predicate, llIIIlIlIl[1], Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(llIIIlIlIl[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIlllllI(Inventory.getCount(predicate))) {
                            ?? r0 = llIIIlIlIl[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIlIlIl[0];
                    }, llIIIlIlIl[5]);
                    "".length();
                }
                if (lIlIIlIllIlll(Bank.contains(C0019f.bk) ? 1 : 0) && lIlIIlIllIlll(Inventory.contains(item3 -> {
                    return item3.getName().contains(llIIIlIlII[llIIIlIlIl[29]]);
                }) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIIlIlIl[1]];
                    iArr2[llIIIlIlIl[0]] = llIIIlIlIl[6];
                    if (lIlIIlIlllIII(Bank.contains(iArr2) ? 1 : 0) && lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                        Bank.withdraw(llIIIlIlIl[6], llIIIlIlIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIlIlIl[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr3 = new int[llIIIlIlIl[1]];
                            iArr3[llIIIlIlIl[0]] = llIIIlIlIl[6];
                            if (lIlIIlIlllllI(Inventory.getCount(iArr3))) {
                                ?? r0 = llIIIlIlIl[1];
                                "".length();
                                return ((((59 + 110) - 119) + 101) ^ (((68 + 65) - 52) + 66)) == "   ".length() ? ((240 ^ 185) ^ (236 ^ 128)) & (((196 ^ 159) ^ (47 ^ 81)) ^ (-" ".length())) : r0;
                            }
                            return llIIIlIlIl[0];
                        }, llIIIlIlIl[5]);
                        "".length();
                    }
                }
                if (lIlIIlIllllII(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                    int[] iArr3 = new int[llIIIlIlIl[1]];
                    iArr3[llIIIlIlIl[0]] = llIIIlIlIl[2];
                    if (lIlIIlIlllIIl(Inventory.getCount(iArr3), llIIIlIlIl[1])) {
                        Bank.withdrawAll(llIIIlIlIl[2], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIlIlIl[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[llIIIlIlIl[1]];
                            iArr4[llIIIlIlIl[0]] = llIIIlIlIl[2];
                            return Inventory.contains(iArr4);
                        }, llIIIlIlIl[5]);
                        "".length();
                    }
                }
            }
            if (lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                if (lIlIIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks(llIIIlIlIl[7]);
                    "".length();
                }
                if (lIlIIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                    if (lIlIIlIlllIII(Inventory.contains(C0019f.bk) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.bk).interact(llIIIlIlII[llIIIlIlIl[0]]);
                        Time.sleepTicks(llIIIlIlIl[8]);
                        "".length();
                    }
                    if (lIlIIlIlllIII(Equipment.contains(C0019f.bk) ? 1 : 0) && lIlIIlIllllIl(Players.getLocal().getAnimation(), llIIIlIlIl[9])) {
                        Equipment.getFirst(C0019f.bk).interact(llIIIlIlII[llIIIlIlIl[1]]);
                        Time.sleepTicks(llIIIlIlIl[4]);
                        "".length();
                    }
                    Movement.walkTo(I);
                    "".length();
                }
            }
        }
        if (lIlIIlIllIlll(Bank.isOpen() ? 1 : 0) && lIlIIlIllllII(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
            int[] iArr4 = new int[llIIIlIlIl[1]];
            iArr4[llIIIlIlIl[0]] = llIIIlIlIl[2];
            if (lIlIIlIlllIIl(Inventory.getCount(iArr4), llIIIlIlIl[1])) {
                C0000a.a();
            }
        }
        if (lIlIIlIllIlll(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr5 = new int[llIIIlIlIl[1]];
            iArr5[llIIIlIlIl[0]] = llIIIlIlIl[2];
            if (lIlIIlIlllllI(Inventory.getCount(iArr5)) && lIlIIlIllllII(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                GrandExchange.open();
                Time.sleepUntil(() -> {
                    return GrandExchange.isOpen();
                }, llIIIlIlIl[5]);
                "".length();
            }
        }
        if (lIlIIlIlllIII(GrandExchange.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[llIIIlIlIl[1]];
            iArr6[llIIIlIlIl[0]] = llIIIlIlIl[2];
            if (lIlIIlIlllllI(Inventory.getCount(iArr6))) {
                int i3 = llIIIlIlIl[0];
                while (lIlIIlIlllIIl(i3, J.size())) {
                    String llllllllllllllllllIlIllllIIIllII = C0016c.c(J.get(i3).intValue());
                    System.out.println("Buying " + llllllllllllllllllIlIllllIIIllII + " and itemID is: " + String.valueOf(J.get(i3)));
                    while (true) {
                        if (!lIlIIlIllIlll(a(llllllllllllllllllIlIllllIIIllII) ? 1 : 0)) {
                            break;
                        }
                        if (lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                            int i4 = i3;
                            if (lIlIIlIlllllI(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                if (lIlIIlIllllll(grandExchangeOffer.getItemId(), J.get(i4).intValue())) {
                                    ?? r0 = llIIIlIlIl[1];
                                    "".length();
                                    return "   ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIIlIlIl[0];
                            }).collect(Collectors.toList())).size())) {
                                i = llIIIlIlIl[1];
                                "".length();
                                if (" ".length() == (((15 ^ 64) ^ (11 ^ 106)) & (("  ".length() ^ (64 ^ 108)) ^ (-" ".length())))) {
                                    return;
                                }
                            } else {
                                i = llIIIlIlIl[0];
                            }
                            int i5 = i;
                            if (lIlIIlIlllIII(i5) && lIlIIlIlllIll(((List) GrandExchange.getOffers().stream().filter(grandExchangeOffer2 -> {
                                if (lIlIIlIllllll(grandExchangeOffer2.getItemId(), J.get(i4).intValue())) {
                                    ?? r0 = llIIIlIlIl[1];
                                    "".length();
                                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIIlIlIl[0];
                            }).collect(Collectors.toList())).size(), llIIIlIlIl[1])) {
                                GrandExchange.abortOffer(J.get(i3).intValue());
                            }
                            if (lIlIIlIllIlll(i5)) {
                                if (!lIlIIlIlllIII(GrandExchange.isBuying() ? 1 : 0) || lIlIIlIllllIl(GrandExchange.getItemId(), J.get(i3).intValue())) {
                                    a(J.get(i3).intValue());
                                }
                                if (lIlIIlIllllll(GrandExchange.getItemId(), J.get(i3).intValue()) && lIlIIlIllllIl(GrandExchange.getQuantity(), K.get(i3).intValue())) {
                                    GrandExchange.setQuantity(K.get(i3).intValue());
                                }
                                int intValue = L.get(i3).intValue();
                                int i6 = llIIIlIlIl[0];
                                Widget widget = Widgets.get(llIIIlIlIl[10], llIIIlIlIl[11]);
                                if (lIlIIlIlllIII(GrandExchange.isOpen() ? 1 : 0) && lIlIIlIlllIII(GrandExchange.isBuying() ? 1 : 0) && lIlIIllIIIIII(widget) && lIlIIlIllIlll(widget.getText().isEmpty() ? 1 : 0)) {
                                    int guidePrice = GrandExchange.getGuidePrice();
                                    i6 = guidePrice;
                                    System.out.println("Guide price: " + guidePrice + "|Given price: " + String.valueOf(L.get(i3)));
                                }
                                if (lIlIIlIlllIlI(i6, intValue)) {
                                    if (lIlIIlIlllIll(i6, llIIIlIlIl[12])) {
                                        d = 0.1d;
                                        "".length();
                                        if ("   ".length() > "   ".length()) {
                                            return;
                                        }
                                    } else {
                                        d = 0.3d;
                                    }
                                    int i7 = (int) (i6 + (i6 * d));
                                    System.out.println("Increased price: " + i7);
                                    if (lIlIIlIllllll(GrandExchange.getItemId(), J.get(i3).intValue()) && lIlIIlIllllIl(GrandExchange.getPrice(), i7)) {
                                        GrandExchange.setPrice(i7);
                                    }
                                    if (lIlIIlIllllll(GrandExchange.getItemId(), J.get(i3).intValue()) && lIlIIlIllllll(GrandExchange.getPrice(), i7)) {
                                        GrandExchange.confirm();
                                    }
                                    "".length();
                                    if (((93 ^ 82) & ((63 ^ 48) ^ (-1))) < 0) {
                                        return;
                                    }
                                } else {
                                    if (lIlIIlIllllll(GrandExchange.getItemId(), J.get(i3).intValue()) && lIlIIlIllllIl(GrandExchange.getPrice(), L.get(i3).intValue())) {
                                        GrandExchange.setPrice(L.get(i3).intValue());
                                    }
                                    if (lIlIIlIllllll(GrandExchange.getItemId(), J.get(i3).intValue()) && lIlIIlIllllll(GrandExchange.getPrice(), L.get(i3).intValue())) {
                                        GrandExchange.confirm();
                                    }
                                }
                            }
                        }
                        if (lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[13])) {
                            Movement.walkTo(I);
                            "".length();
                            Time.sleepTicks(llIIIlIlIl[1]);
                            "".length();
                        }
                        if (lIlIIlIllIlll(Worlds.inMembersWorld() ? 1 : 0)) {
                            System.out.println(llIIIlIlII[llIIIlIlIl[8]]);
                            AccBuilderSotf.d = llIIIlIlIl[1];
                            return;
                        }
                        if (lIlIIlIllIlll(GrandExchange.isOpen() ? 1 : 0)) {
                            GrandExchange.open();
                        }
                        if (lIlIIlIlllIII(GrandExchange.canCollect() ? 1 : 0)) {
                            GrandExchange.collect();
                            Time.sleepUntil(() -> {
                                if (lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                                    ?? r0 = llIIIlIlIl[1];
                                    "".length();
                                    return (((86 ^ 126) ^ (157 ^ 168)) & (((97 ^ 54) ^ (60 ^ 118)) ^ (-" ".length()))) != 0 ? ((((40 + 43) - 1) + 46) ^ (((79 + 2) - (-63)) + 48)) & (((76 ^ 34) ^ (24 ^ 54)) ^ (-" ".length())) : r0;
                                }
                                return llIIIlIlIl[0];
                            }, llIIIlIlIl[5]);
                            "".length();
                        }
                        if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[14])) {
                            int[] iArr7 = new int[llIIIlIlIl[1]];
                            iArr7[llIIIlIlIl[0]] = llIIIlIlIl[14];
                            if (!lIlIIlIllIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                                J.remove(llIIIlIlIl[0]);
                                "".length();
                                K.remove(llIIIlIlIl[0]);
                                "".length();
                                L.remove(llIIIlIlIl[0]);
                                "".length();
                                list.remove(llIIIlIlIl[0]);
                                "".length();
                                Time.sleepTicks(llIIIlIlIl[8]);
                                "".length();
                                "".length();
                                if (" ".length() >= ((235 ^ 179) & ((90 ^ 2) ^ (-1)))) {
                                    return;
                                }
                            }
                        }
                        if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[15])) {
                            J.remove(llIIIlIlIl[0]);
                            "".length();
                            K.remove(llIIIlIlIl[0]);
                            "".length();
                            L.remove(llIIIlIlIl[0]);
                            "".length();
                            list.remove(llIIIlIlIl[0]);
                            "".length();
                            Time.sleepTicks(llIIIlIlIl[8]);
                            "".length();
                            "".length();
                            if (" ".length() >= ((235 ^ 179) & ((90 ^ 2) ^ (-1)))) {
                            }
                        } else {
                            if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[16])) {
                                int[] iArr8 = new int[llIIIlIlIl[1]];
                                iArr8[llIIIlIlIl[0]] = llIIIlIlIl[16];
                                if (lIlIIlIlllIII(Inventory.contains(iArr8) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    "".length();
                                    K.remove(llIIIlIlIl[0]);
                                    "".length();
                                    L.remove(llIIIlIlIl[0]);
                                    "".length();
                                    list.remove(llIIIlIlIl[0]);
                                    "".length();
                                    Time.sleepTicks(llIIIlIlIl[8]);
                                    "".length();
                                    "".length();
                                    if ("  ".length() <= (((111 ^ 123) ^ (4 ^ 88)) & (((118 ^ 62) ^ ((24 ^ 120) & ((205 ^ 173) ^ (-1)))) ^ (-" ".length())))) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[17])) {
                                int[] iArr9 = new int[llIIIlIlIl[1]];
                                iArr9[llIIIlIlIl[0]] = llIIIlIlIl[18];
                                if (lIlIIlIlllIII(Inventory.contains(iArr9) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    "".length();
                                    K.remove(llIIIlIlIl[0]);
                                    "".length();
                                    L.remove(llIIIlIlIl[0]);
                                    "".length();
                                    list.remove(llIIIlIlIl[0]);
                                    "".length();
                                    Time.sleepTicks(llIIIlIlIl[8]);
                                    "".length();
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[19])) {
                                int[] iArr10 = new int[llIIIlIlIl[1]];
                                iArr10[llIIIlIlIl[0]] = llIIIlIlIl[19];
                                if (lIlIIlIlllIII(Inventory.contains(iArr10) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    "".length();
                                    K.remove(llIIIlIlIl[0]);
                                    "".length();
                                    L.remove(llIIIlIlIl[0]);
                                    "".length();
                                    list.remove(llIIIlIlIl[0]);
                                    "".length();
                                    Time.sleepTicks(llIIIlIlIl[8]);
                                    "".length();
                                    "".length();
                                    if ((-" ".length()) != (-" ".length())) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[20])) {
                                int[] iArr11 = new int[llIIIlIlIl[1]];
                                iArr11[llIIIlIlIl[0]] = llIIIlIlIl[20];
                                if (lIlIIlIlllIII(Inventory.contains(iArr11) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    "".length();
                                    K.remove(llIIIlIlIl[0]);
                                    "".length();
                                    L.remove(llIIIlIlIl[0]);
                                    "".length();
                                    list.remove(llIIIlIlIl[0]);
                                    "".length();
                                    Time.sleepTicks(llIIIlIlIl[8]);
                                    "".length();
                                    "".length();
                                    if ((23 ^ 18) <= 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[21])) {
                                int[] iArr12 = new int[llIIIlIlIl[1]];
                                iArr12[llIIIlIlIl[0]] = llIIIlIlIl[21];
                                if (lIlIIlIlllIII(Inventory.contains(iArr12) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    "".length();
                                    K.remove(llIIIlIlIl[0]);
                                    "".length();
                                    L.remove(llIIIlIlIl[0]);
                                    "".length();
                                    list.remove(llIIIlIlIl[0]);
                                    "".length();
                                    Time.sleepTicks(llIIIlIlIl[8]);
                                    "".length();
                                    "".length();
                                    if (((((129 + 18) - 61) + 57) ^ (((67 + 33) - 21) + 60)) < "  ".length()) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[22])) {
                                String[] strArr = new String[llIIIlIlIl[1]];
                                strArr[llIIIlIlIl[0]] = llIIIlIlII[llIIIlIlIl[4]];
                                if (lIlIIlIllIlll(Inventory.contains(strArr) ? 1 : 0)) {
                                    String[] strArr2 = new String[llIIIlIlIl[1]];
                                    strArr2[llIIIlIlIl[0]] = llIIIlIlII[llIIIlIlIl[7]];
                                    if (lIlIIlIlllIII(Inventory.contains(strArr2) ? 1 : 0)) {
                                    }
                                }
                                J.remove(llIIIlIlIl[0]);
                                "".length();
                                K.remove(llIIIlIlIl[0]);
                                "".length();
                                L.remove(llIIIlIlIl[0]);
                                "".length();
                                list.remove(llIIIlIlIl[0]);
                                "".length();
                                Time.sleepTicks(llIIIlIlIl[8]);
                                "".length();
                                "".length();
                                if ((((201 ^ 159) ^ (154 ^ 144)) & (((255 ^ 141) ^ (47 ^ 1)) ^ (-" ".length()))) != 0) {
                                    return;
                                }
                            }
                            if (!lIlIIlIllIlll(a(llllllllllllllllllIlIllllIIIllII) ? 1 : 0)) {
                                break;
                            } else if (lIlIIlIlllIII(AccBuilderSotf.d ? 1 : 0)) {
                                "".length();
                                if (" ".length() <= (-" ".length())) {
                                    return;
                                }
                            } else {
                                Time.sleepTicks(llIIIlIlIl[4]);
                                "".length();
                                "".length();
                                if ("  ".length() == " ".length()) {
                                    return;
                                }
                            }
                        }
                    }
                    if (lIlIIlIlllIII(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = llIIIlIlIl[1];
                                "".length();
                                return ((((64 + 49) - 85) + 108) ^ (((96 + 84) - 142) + 102)) == 0 ? ((158 ^ 128) ^ (154 ^ 197)) & (((29 ^ 11) ^ (26 ^ 77)) ^ (-" ".length())) : r0;
                            }
                            return llIIIlIlIl[0];
                        }, llIIIlIlIl[5]);
                        "".length();
                    }
                    System.out.println(list.get(i3).p());
                    if (lIlIIlIllllll(J.get(i3).intValue(), llIIIlIlIl[15])) {
                        J.remove(llIIIlIlIl[0]);
                        "".length();
                        K.remove(llIIIlIlIl[0]);
                        "".length();
                        L.remove(llIIIlIlIl[0]);
                        "".length();
                        list.remove(llIIIlIlIl[0]);
                        "".length();
                    }
                    if (lIlIIlIlllIII(a(llllllllllllllllllIlIllllIIIllII) ? 1 : 0)) {
                        J.remove(llIIIlIlIl[0]);
                        "".length();
                        K.remove(llIIIlIlIl[0]);
                        "".length();
                        L.remove(llIIIlIlIl[0]);
                        "".length();
                        list.remove(llIIIlIlIl[0]);
                        "".length();
                    }
                    Time.sleepTicks(llIIIlIlIl[8]);
                    "".length();
                    i3++;
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
            }
        }
    }

    public static void a(int i) {
        int intValue;
        if (lIlIIlIllIlll(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (lIlIIlIlllIII(Static.getClient().isItemDefinitionCached(i) ? 1 : 0)) {
            intValue = Static.getClient().getItemComposition(i).getLinkedNoteId();
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return;
            }
        } else {
            intValue = ((Integer) GameThread.invokeLater(() -> {
                return Integer.valueOf(Static.getClient().getItemComposition(i).getLinkedNoteId());
            })).intValue();
        }
        int i2 = intValue;
        if (!lIlIIlIllllIl(GrandExchange.getItemId(), llIIIlIlIl[24]) || (lIlIIlIllllIl(GrandExchange.getItemId(), i) && lIlIIlIllllIl(GrandExchange.getItemId(), i2))) {
            if (lIlIIlIllIlll(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(i);
        }
    }

    private static boolean lIlIIlIllllII(int i, int i2) {
        return i <= i2;
    }

    public static void b(List<Integer> list) {
        if (lIlIIlIllIlll(GrandExchange.isOpen() ? 1 : 0)) {
            if (lIlIIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIlIIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (lIlIIlIlllIII(GrandExchange.isOpen() ? 1 : 0)) {
            Time.sleepTicks(llIIIlIlIl[8]);
            "".length();
            int i = llIIIlIlIl[0];
            while (lIlIIlIlllIIl(i, list.size())) {
                int[] iArr = new int[llIIIlIlIl[1]];
                iArr[llIIIlIlIl[0]] = list.get(i).intValue();
                if (lIlIIlIlllllI(Inventory.getCount(iArr))) {
                    if (lIlIIlIllIlll(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] iArr2 = new int[llIIIlIlIl[1]];
                        iArr2[llIIIlIlIl[0]] = list.get(i).intValue();
                        GrandExchange.sell(iArr2);
                        Time.sleepTicks(llIIIlIlIl[8]);
                        "".length();
                        int llllllllllllllllllIlIlllIlllllll = i;
                        Time.sleepUntil(() -> {
                            if (lIlIIlIllllll(GrandExchange.getItemId(), ((Integer) list.get(llllllllllllllllllIlIlllIlllllll)).intValue())) {
                                ?? r0 = llIIIlIlIl[1];
                                "".length();
                                return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIlIlIl[0];
                        }, llIIIlIlIl[23]);
                        "".length();
                    }
                    if (lIlIIlIlllIII(GrandExchange.isSelling() ? 1 : 0)) {
                        if (lIlIIlIllllIl(GrandExchange.getPrice(), llIIIlIlIl[24])) {
                            GrandExchange.setPrice(llIIIlIlIl[1]);
                            Time.sleepTicks(llIIIlIlIl[8]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIlIIlIllllll(GrandExchange.getPrice(), llIIIlIlIl[1])) {
                                    ?? r0 = llIIIlIlIl[1];
                                    "".length();
                                    return "  ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIIlIlIl[0];
                            }, llIIIlIlIl[23]);
                            "".length();
                        }
                        if (lIlIIlIllllll(GrandExchange.getPrice(), llIIIlIlIl[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> {
                                return GrandExchange.canCollect();
                            }, llIIIlIlIl[23]);
                            "".length();
                        }
                    }
                    if (lIlIIlIlllIII(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            if (lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                                ?? r0 = llIIIlIlIl[1];
                                "".length();
                                return " ".length() == 0 ? ((78 ^ 9) ^ (96 ^ 49)) & (("   ".length() ^ (55 ^ 34)) ^ (-" ".length())) : r0;
                            }
                            return llIIIlIlIl[0];
                        }, llIIIlIlIl[5]);
                        "".length();
                    }
                }
                i++;
                "".length();
                if ((-((28 ^ 54) ^ (176 ^ 158))) >= 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIlIIlIlllIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIlIlllllI(int i) {
        return i > 0;
    }

    private static boolean lIlIIlIllllIl(int i, int i2) {
        return i != i2;
    }

    private static void lIlIIlIllIllI() {
        llIIIlIlIl = new int[33];
        llIIIlIlIl[0] = ((199 ^ 190) ^ (185 ^ 133)) & (((63 ^ 8) ^ (26 ^ 104)) ^ (-" ".length()));
        llIIIlIlIl[1] = " ".length();
        llIIIlIlIl[2] = (-31769) & 32763;
        llIIIlIlIl[3] = 70 ^ 76;
        llIIIlIlIl[4] = "   ".length();
        llIIIlIlIl[5] = (-10308) & 15307;
        llIIIlIlIl[6] = (-((-2519) & 27103)) & (-161) & 32751;
        llIIIlIlIl[7] = 199 ^ 195;
        llIIIlIlIl[8] = "  ".length();
        llIIIlIlIl[9] = (-6454) & 7167;
        llIIIlIlIl[10] = (-2571) & 3035;
        llIIIlIlIl[11] = (150 ^ 193) ^ (81 ^ 29);
        llIIIlIlIl[12] = (-14727) & 1014726;
        llIIIlIlIl[13] = 103 ^ 96;
        llIIIlIlIl[14] = (-((-2498) & 15315)) & (-18501) & 31743;
        llIIIlIlIl[15] = (-21505) & 24523;
        llIIIlIlIl[16] = (-8386) & 10239;
        llIIIlIlIl[17] = (-22657) & 24573;
        llIIIlIlIl[18] = (-10369) & 12286;
        llIIIlIlIl[19] = (-23636) & 24063;
        llIIIlIlIl[20] = (-8193) & 16205;
        llIIIlIlIl[21] = (-((-6177) & 23087)) & (-11457) & 28639;
        llIIIlIlIl[22] = (-16521) & 29145;
        llIIIlIlIl[23] = (-((-4645) & 12967)) & (-2562) & 16383;
        llIIIlIlIl[24] = -" ".length();
        llIIIlIlIl[25] = (40 ^ 27) ^ (18 ^ 36);
        llIIIlIlIl[26] = 159 ^ 153;
        llIIIlIlIl[27] = 70 ^ 77;
        llIIIlIlIl[28] = (235 ^ 135) ^ (67 ^ 39);
        llIIIlIlIl[29] = (31 ^ 33) ^ (41 ^ 30);
        llIIIlIlIl[30] = (-20481) & 23645;
        llIIIlIlIl[31] = (-8258) & 11743;
        llIIIlIlIl[32] = (((98 + 89) - 119) + 82) ^ (((46 + 26) - 67) + 149);
    }

    private static void lIlIIlIllIlIl() {
        llIIIlIlII = new String[llIIIlIlIl[32]];
        llIIIlIlII[llIIIlIlIl[0]] = lIlIIlIllIIlI("ovwEyJW50D8=", "OBFGf");
        llIIIlIlII[llIIIlIlIl[1]] = lIlIIlIllIIll("FAYoLChzMTEhJDIaLic=", "StIBL");
        llIIIlIlII[llIIIlIlIl[8]] = lIlIIlIllIIlI("KgPdZoprfUfpTGsyIuCP30zYG+ALy2f/1I0eAoJWzfIeq3luFH8U3PyHx++mp9gcrWtIyHyy6aE=", "ksTmI");
        llIIIlIlII[llIIIlIlIl[4]] = lIlIIlIllIIll("KyIuIScWN288IQw/ICJmTH8=", "xVOLN");
        llIIIlIlII[llIIIlIlIl[7]] = lIlIIlIllIIlI("QfKoXWg26NkOWGuEjz7yCCW9GsF/DTOY", "MvYLd");
        llIIIlIlII[llIIIlIlIl[25]] = lIlIIlIllIlII("CE2k4Q+/TVE=", "pBXiD");
        llIIIlIlII[llIIIlIlIl[26]] = lIlIIlIllIIlI("qPIhTeGpWUTxjg5yZ9lNmg==", "zzMEE");
        llIIIlIlII[llIIIlIlIl[13]] = lIlIIlIllIIlI("eC9mB/5Z/kA=", "CzDan");
        llIIIlIlII[llIIIlIlIl[28]] = lIlIIlIllIIll("GQg+HwI=", "ZdQlg");
        llIIIlIlII[llIIIlIlIl[29]] = lIlIIlIllIIll("EBAuJxkP", "guOKm");
        llIIIlIlII[llIIIlIlIl[3]] = lIlIIlIllIlII("EUf9MPUtPso=", "CvhfN");
        llIIIlIlII[llIIIlIlIl[27]] = lIlIIlIllIIlI("ebRt5ZMRPta5MKhcV/dEEeBsmwYBomCr", "ztguw");
    }

    private static boolean lIlIIlIlllIII(int i) {
        return i != 0;
    }

    private static String lIlIIlIllIIll(String llllllllllllllllllIlIlllIlIIlIIl, String llllllllllllllllllIlIlllIlIIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIlllIlIIIlll = new StringBuilder();
        char[] charArray = llllllllllllllllllIlIlllIlIIlIII.toCharArray();
        int llllllllllllllllllIlIlllIlIIIlIl = llIIIlIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIIlIlIl[0];
        while (lIlIIlIlllIIl(i, length)) {
            llllllllllllllllllIlIlllIlIIIlll.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIlIlllIlIIIlIl % charArray.length]));
            "".length();
            llllllllllllllllllIlIlllIlIIIlIl++;
            i++;
            "".length();
            if ((-" ".length()) > (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlIlllIlIIIlll);
    }

    private static String lIlIIlIllIIlI(String llllllllllllllllllIlIlllIlIllIIl, String llllllllllllllllllIlIlllIlIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlllIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlIlIl[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlllIlIllIlI) {
            llllllllllllllllllIlIlllIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllllll(int i, int i2) {
        return i == i2;
    }
}
