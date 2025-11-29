package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Buying new supplies (Restocking)", priority = 13337, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.Q  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/Q.class */
public class Q extends S {
    private static /* synthetic */ String[] llllIlIllIll;
    private static /* synthetic */ int[] llllIlIlllII;

    private static void lIIlIIIlIIIllIl() {
        llllIlIlllII = new int[16];
        llllIlIlllII[0] = (115 ^ 94) & ((90 ^ 119) ^ (-1));
        llllIlIlllII[1] = " ".length();
        llllIlIlllII[2] = (-((-17033) & 27293)) & (-20489) & 31743;
        llllIlIlllII[3] = "  ".length();
        llllIlIlllII[4] = "   ".length();
        llllIlIlllII[5] = 199 ^ 195;
        llllIlIlllII[6] = (-((-5157) & 21933)) & (-1045) & 30719;
        llllIlIlllII[7] = (-((-26313) & 28666)) & (-16393) & 31679;
        llllIlIlllII[8] = (-((-545) & 12266)) & (-3) & 12283;
        llllIlIlllII[9] = (-10254) & 10815;
        llllIlIlllII[10] = (-22594) & 23147;
        llllIlIlllII[11] = 144 ^ 149;
        llllIlIlllII[12] = (-((-3085) & 23661)) & (-1) & 32483;
        llllIlIlllII[13] = (126 ^ 51) ^ (43 ^ 108);
        llllIlIlllII[14] = (-((-6921) & 15305)) & (-1) & 30707;
        llllIlIlllII[15] = (-((-2081) & 23915)) & (-1) & 22399;
    }

    static {
        lIIlIIIlIIIllIl();
        lIIlIIIlIIIllII();
    }

    private static boolean lIIlIIIlIIlIIll(int i, int i2) {
        return i >= i2;
    }

    private static void lIIlIIIlIIIllII() {
        llllIlIllIll = new String[llllIlIlllII[5]];
        llllIlIllIll[llllIlIlllII[0]] = lIIlIIIlIIIlIll("HAA4PiQiNR4yGjcuJCIZGnhtCQVnISIuBDRiJClKLiw7IgQzLT8+RmchISgZLiwqZy0CbA==", "GBMGj");
        llllIlIllIll[llllIlIlllII[1]] = lIIlIIIlIIIlIll("OS15ACMSLypJIxhiOxwuW2I2G3cZLXkbMhQqOBswEmI4BDgCLC1JJBI2dUkkAy0pGT4ZJXkbMgQ2Ngo8Hiw+", "wBYiW");
        llllIlIllIll[llllIlIlllII[3]] = lIIlIIIlIIIlIll("OAU0LAMGMBIgPRMrKDA+Pn1hAihDLyAjKEMmLTltDCFhISUGZzMwPBYuMzApQy41MCAQa2EmOQw3MTwjBGczMD4XKCI+JA0gbw==", "cGAUM");
        llllIlIllIll[llllIlIlllII[4]] = lIIlIIIlIIIlIll("DQE9IAkzNBssNyYvITw0C3loDiJ2KykvInY4NXkkOSomKmc0Njx5KTMmLHk8K2M8Nmc0NjF5PCtjJz9nLT4=", "VCHYG");
    }

    private static boolean lIIlIIIlIIlIIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v149, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v165, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v174, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.S
    public boolean ci() {
        if (!lIIlIIIlIIIlllI(this.cW.C() ? 1 : 0) && !lIIlIIIlIIIlllI(cn() ? 1 : 0)) {
            int[] iArr = new int[llllIlIlllII[1]];
            iArr[llllIlIlllII[0]] = llllIlIlllII[2];
            if (lIIlIIIlIIIlllI(Inventory.contains(iArr) ? 1 : 0) && lIIlIIIlIIIllll(GrandExchange.isOpen() ? 1 : 0)) {
                Log.info(llllIlIllIll[llllIlIlllII[0]]);
                Bank.open();
                "".length();
                return llllIlIlllII[1];
            }
            EquipmentSetup equipmentSetup = (EquipmentSetup) this.cV.totemGear().selected(EquipmentSetup.class);
            if (lIIlIIIlIIlIIII(equipmentSetup)) {
                return llllIlIlllII[0];
            }
            int lllllllllllllllIIlIllIIlIIlIIIII = equipmentSetup.get(EquipmentInventorySlot.WEAPON);
            int rechargeStaffAmount = this.cV.rechargeStaffAmount();
            Collection<Integer> variations = ItemVariationMapping.getVariations(lllllllllllllllIIlIllIIlIIlIIIII);
            Log.info("Weapon variations: " + variations);
            Map<Integer, Integer> a = a(variations);
            Log.info("Required items: " + a);
            if (!lIIlIIIlIIlIIIl(a) || lIIlIIIlIIlIIlI(rechargeStaffAmount)) {
                Log.info(llllIlIllIll[llllIlIlllII[1]]);
                co();
                return llllIlIlllII[0];
            } else if (lIIlIIIlIIlIIll(Inventory.getCount((boolean) llllIlIlllII[1], a.keySet().stream().mapToInt((v0) -> {
                return v0.intValue();
            }).toArray()), rechargeStaffAmount)) {
                Log.info(llllIlIllIll[llllIlIlllII[3]]);
                co();
                return llllIlIlllII[0];
            } else {
                for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    int[] iArr2 = new int[llllIlIlllII[1]];
                    iArr2[llllIlIlllII[0]] = intValue;
                    if (!lIIlIIIlIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                        Bank.withdrawAll(intValue, Bank.WithdrawMode.ITEM);
                        return llllIlIlllII[1];
                    }
                    "".length();
                    if ((-" ".length()) == " ".length()) {
                        return ((118 ^ 58) ^ (64 ^ 10)) & (((((109 + 21) - 0) + 2) ^ (((49 + 128) - 90) + 43)) ^ (-" ".length()));
                    }
                }
                int[] iArr3 = new int[llllIlIlllII[1]];
                iArr3[llllIlIlllII[0]] = llllIlIlllII[2];
                if (lIIlIIIlIIIllll(Bank.contains(iArr3) ? 1 : 0)) {
                    Bank.withdrawAll(llllIlIlllII[2], Bank.WithdrawMode.ITEM);
                    return llllIlIlllII[1];
                }
                if (lIIlIIIlIIIllll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIIlIIIlIIIlllI(GrandExchange.isOpen() ? 1 : 0)) {
                    GrandExchange.open();
                    return llllIlIlllII[1];
                } else if (lIIlIIIlIIIllll(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    return llllIlIlllII[1];
                } else {
                    for (Map.Entry<Integer, Integer> entry2 : a.entrySet()) {
                        int intValue2 = entry2.getKey().intValue();
                        int intValue3 = entry2.getValue().intValue();
                        ?? r2 = llllIlIlllII[1];
                        int[] iArr4 = new int[llllIlIlllII[1]];
                        iArr4[llllIlIlllII[0]] = intValue2;
                        int count = intValue3 * (rechargeStaffAmount - Inventory.getCount((boolean) r2, iArr4));
                        ?? r0 = llllIlIlllII[1];
                        int[] iArr5 = new int[llllIlIlllII[1]];
                        iArr5[llllIlIlllII[0]] = intValue2;
                        if (lIIlIIIlIIlIIll(Inventory.getCount((boolean) r0, iArr5), count)) {
                            "".length();
                            if (((95 ^ 102) & ((53 ^ 12) ^ (-1))) > ((135 ^ 136) & ((44 ^ 35) ^ (-1)))) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            ?? r1 = llllIlIlllII[1];
                            int[] iArr6 = new int[llllIlIlllII[1]];
                            iArr6[llllIlIlllII[0]] = intValue2;
                            int lllllllllllllllIIlIllIIlIIIllIII = count - Inventory.getCount((boolean) r1, iArr6);
                            if (!lIIlIIIlIIlIIlI(lllllllllllllllIIlIllIIlIIIllIII)) {
                                int itemPrice = (int) (Prices.getItemPrice(intValue2) * 1.25d);
                                int i = lllllllllllllllIIlIllIIlIIIllIII * itemPrice;
                                ?? r02 = llllIlIlllII[1];
                                int[] iArr7 = new int[llllIlIlllII[1]];
                                iArr7[llllIlIlllII[0]] = llllIlIlllII[2];
                                if (!lIIlIIIlIIlIlII(Inventory.getCount((boolean) r02, iArr7), i)) {
                                    Log.info("[BuyNewSupplies]: Buying " + lllllllllllllllIIlIllIIlIIIllIII + " of " + intValue2 + " (price: " + itemPrice + ")");
                                    GrandExchange.buy(intValue2, lllllllllllllllIIlIllIIlIIIllIII, itemPrice);
                                    "".length();
                                    sleep(llllIlIlllII[4]);
                                    return llllIlIlllII[1];
                                }
                                String str = llllIlIllIll[llllIlIlllII[4]];
                                Object[] objArr = new Object[llllIlIlllII[5]];
                                int i2 = llllIlIlllII[0];
                                ?? r4 = llllIlIlllII[1];
                                int[] iArr8 = new int[llllIlIlllII[1]];
                                iArr8[llllIlIlllII[0]] = llllIlIlllII[2];
                                objArr[i2] = Integer.valueOf(Inventory.getCount((boolean) r4, iArr8));
                                objArr[llllIlIlllII[1]] = Integer.valueOf(i);
                                objArr[llllIlIlllII[3]] = Integer.valueOf(lllllllllllllllIIlIllIIlIIIllIII);
                                objArr[llllIlIlllII[4]] = Integer.valueOf(intValue2);
                                Log.info(str, objArr);
                                return llllIlIlllII[0];
                            }
                            "".length();
                            if ("   ".length() > "   ".length()) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        }
                    }
                    return llllIlIlllII[0];
                }
            }
        }
        return llllIlIlllII[0];
    }

    private static boolean lIIlIIIlIIIlllI(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIlIIlIlII(int i, int i2) {
        return i < i2;
    }

    @Inject
    protected Q(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static boolean lIIlIIIlIIlIIlI(int i) {
        return i <= 0;
    }

    private static boolean lIIlIIIlIIIllll(int i) {
        return i != 0;
    }

    private Map<Integer, Integer> a(Collection<Integer> collection) {
        Log.info("[BuyNewSupplies]: Getting required items for weapon variations: " + collection);
        if (lIIlIIIlIIIllll(collection.contains(Integer.valueOf(llllIlIlllII[6])) ? 1 : 0)) {
            return Map.of(Integer.valueOf(llllIlIlllII[7]), Integer.valueOf(llllIlIlllII[1]), Integer.valueOf(llllIlIlllII[8]), Integer.valueOf(llllIlIlllII[1]), Integer.valueOf(llllIlIlllII[9]), Integer.valueOf(llllIlIlllII[1]), Integer.valueOf(llllIlIlllII[10]), Integer.valueOf(llllIlIlllII[11]));
        }
        if (lIIlIIIlIIIllll(collection.contains(Integer.valueOf(llllIlIlllII[12])) ? 1 : 0)) {
            return Map.of(Integer.valueOf(llllIlIlllII[2]), Integer.valueOf(llllIlIlllII[13]), Integer.valueOf(llllIlIlllII[8]), Integer.valueOf(llllIlIlllII[1]), Integer.valueOf(llllIlIlllII[9]), Integer.valueOf(llllIlIlllII[1]), Integer.valueOf(llllIlIlllII[10]), Integer.valueOf(llllIlIlllII[11]));
        }
        if (lIIlIIIlIIIllll(collection.contains(Integer.valueOf(llllIlIlllII[14])) ? 1 : 0)) {
            return Map.of(Integer.valueOf(llllIlIlllII[15]), Integer.valueOf(llllIlIlllII[4]));
        }
        Log.info("[BuyNewSupplies]: No required items found for weapon variations: " + collection);
        return null;
    }

    private static boolean lIIlIIIlIIlIIIl(Object obj) {
        return obj != null;
    }

    private static String lIIlIIIlIIIlIll(String lllllllllllllllIIlIllIIlIIIIIlII, String lllllllllllllllIIlIllIIlIIIIlIII) {
        String lllllllllllllllIIlIllIIlIIIIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIlIIIIIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIIlIIIIlIII.toCharArray();
        int lllllllllllllllIIlIllIIlIIIIIlIl = llllIlIlllII[0];
        char[] charArray2 = lllllllllllllllIIlIllIIlIIIIIlII2.toCharArray();
        int length = charArray2.length;
        int i = llllIlIlllII[0];
        while (lIIlIIIlIIlIlII(i, length)) {
            char lllllllllllllllIIlIllIIlIIIIlIlI = charArray2[i];
            lllllllllllllllIIlIllIIlIIIIIlll.append((char) (lllllllllllllllIIlIllIIlIIIIlIlI ^ charArray[lllllllllllllllIIlIllIIlIIIIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIIlIIIIIlIl++;
            i++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIIlIIIIIlll);
    }
}
