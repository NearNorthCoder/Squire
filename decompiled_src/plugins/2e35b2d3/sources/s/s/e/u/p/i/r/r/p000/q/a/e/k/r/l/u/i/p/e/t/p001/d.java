package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.query.results.ItemQueryResults;
@TaskDesc(name = "Banking", priority = 1337)
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.d  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/d.class */
public class d extends Task {
    private static final /* synthetic */ int[] u;
    private static /* synthetic */ String[] lIlIIlIIllllI;
    private final /* synthetic */ SquireSkipperPlugin w;
    private static final /* synthetic */ int[] t;
    private static final /* synthetic */ int[] v;
    private static /* synthetic */ int[] lIlIIlIIlllll;
    private /* synthetic */ BankLocation y;
    private final /* synthetic */ SquireSkipperConfig x;

    @Inject
    public d(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.w = squireSkipperPlugin;
        this.x = squireSkipperConfig;
    }

    private static boolean lIlllIllIIIlIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean a(int[] iArr) {
        int length = iArr.length;
        int llllllllllllllIllIlllIIlIIlllllI = lIlIIlIIlllll[0];
        while (lIlllIllIIIlIIl(llllllllllllllIllIlllIIlIIlllllI, length)) {
            if (lIlllIllIIIIIll(g(iArr[llllllllllllllIllIlllIIlIIlllllI]) ? 1 : 0)) {
                return lIlIIlIIlllll[1];
            }
            llllllllllllllIllIlllIIlIIlllllI++;
            "".length();
            if (" ".length() >= ((((30 + 46) - (-48)) + 36) ^ (((19 + 124) - 127) + 148))) {
                return ((((124 + 164) - 97) + 17) ^ (((8 + 127) - 72) + 70)) & (((((98 + 100) - 164) + 181) ^ (((128 + 71) - 117) + 48)) ^ (-" ".length()));
            }
        }
        return lIlIIlIIlllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v133, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v165, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v109, types: [boolean] */
    public boolean run() {
        int i;
        if (lIlllIllIIIIIll(r() ? 1 : 0)) {
            this.w.c((boolean) lIlIIlIIlllll[0]);
            this.y = null;
            return lIlIIlIIlllll[0];
        }
        this.w.c((boolean) lIlIIlIIlllll[1]);
        if (lIlllIllIIIIlII(this.y)) {
            if (lIlllIllIIIIIll(Inventory.contains(item -> {
                return item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[18]]);
            }) ? 1 : 0)) {
                this.y = BankLocation.CRAFTING_GUILD;
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                this.y = BankLocation.getNearest();
            }
        }
        System.out.println("Banking at " + this.y.toString());
        WorldArea area = this.y.getArea();
        if (lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            if (lIlllIllIIIIIll(Bank.open() ? 1 : 0)) {
                System.out.println(lIlIIlIIllllI[lIlIIlIIlllll[0]]);
                return lIlIIlIIlllll[1];
            } else if (lIlllIllIIIIllI(area) && lIlllIllIIIIlIl(area.contains(Players.getLocal()) ? 1 : 0) && lIlllIllIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(this.y);
                "".length();
                return lIlIIlIIlllll[1];
            }
        }
        if (lIlllIllIIIIIll(Inventory.isFull() ? 1 : 0)) {
            if (lIlllIllIIIIIll(Inventory.contains(item2 -> {
                return item2.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[17]]);
            }) ? 1 : 0)) {
                Bank.deposit(item3 -> {
                    return item3.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[16]]);
                }, lIlIIlIIlllll[1]);
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                Bank.depositInventory();
            }
            return lIlIIlIIlllll[1];
        }
        if (lIlllIllIIIIIll(this.x.sipStam() ? 1 : 0)) {
            b(lIlIIlIIllllI[lIlIIlIIlllll[1]], lIlIIlIIlllll[1]);
            "".length();
        }
        if (lIlllIllIIIIIll(this.x.gamesNecklace() ? 1 : 0)) {
            b(lIlIIlIIllllI[lIlIIlIIlllll[2]], lIlIIlIIlllll[1]);
            "".length();
        }
        if (lIlllIllIIIIIll(this.x.antiPoison() ? 1 : 0)) {
            a(item4 -> {
                if (!lIlllIllIIIIlIl(item4.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[14]]) ? 1 : 0) || lIlllIllIIIIIll(item4.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[15]]) ? 1 : 0)) {
                    ?? r0 = lIlIIlIIlllll[1];
                    "".length();
                    return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIlIIlllll[0];
            }, lIlIIlIIlllll[1]);
            "".length();
        }
        int[] iArr = new int[lIlIIlIIlllll[1]];
        iArr[lIlIIlIIlllll[0]] = this.x.foodID();
        if (lIlllIllIIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIlIIlllll[1]];
            iArr2[lIlIIlIIlllll[0]] = this.x.foodID();
            if (lIlllIllIIIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                System.out.println(lIlIIlIIllllI[lIlIIlIIlllll[3]]);
                return lIlIIlIIlllll[0];
            }
            Bank.withdraw(this.x.foodID(), this.x.foodAmount(), Bank.WithdrawMode.ITEM);
        }
        if (lIlllIllIIIIIll(this.x.slayerRing() ? 1 : 0)) {
            b(lIlIIlIIllllI[lIlIIlIIlllll[4]], lIlIIlIIlllll[1]);
            "".length();
        }
        b b = this.w.b();
        if (lIlllIllIIIIllI(b)) {
            if (lIlllIllIIIIIll(b.o() ? 1 : 0) && lIlllIllIIIIlIl(a(t) ? 1 : 0)) {
                if (lIlllIllIIIIlll(Inventory.getFreeSlots(), lIlIIlIIlllll[5])) {
                    i = Inventory.getFreeSlots() - lIlIIlIIlllll[3];
                    "".length();
                    if (0 != 0) {
                        return ((207 ^ 141) ^ (108 ^ 8)) & (((((92 + 40) - 45) + 77) ^ (((24 + 91) - 94) + 109)) ^ (-" ".length()));
                    }
                } else {
                    i = lIlIIlIIlllll[1];
                }
                a(t, i);
                "".length();
            }
            if (lIlllIllIIIIIll(b.q() ? 1 : 0) && lIlllIllIIIIlIl(a(u) ? 1 : 0)) {
                a(u, lIlIIlIIlllll[1]);
                "".length();
            }
            List<Integer> p = b.p();
            if (lIlllIllIIIIllI(p)) {
                for (Integer num : p) {
                    int intValue = num.intValue();
                    if (lIlllIllIIIIIll(h(intValue) ? 1 : 0) && lIlllIllIIIIIll(i(lIlIIlIIllllI[lIlIIlIIlllll[5]]) ? 1 : 0)) {
                        "".length();
                        if ((-" ".length()) == " ".length()) {
                            return ((51 ^ 77) ^ (105 ^ 38)) & (((((18 + 88) - 80) + 141) ^ (((119 + 148) - 266) + 149)) ^ (-" ".length()));
                        }
                    } else if (lIlllIllIIIlIII(intValue, lIlIIlIIlllll[6])) {
                        "".length();
                        if ((-(84 ^ 80)) >= 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        if (lIlllIllIIIIlIl(g(intValue) ? 1 : 0)) {
                            if (lIlllIllIIIlIII(intValue, lIlIIlIIlllll[7])) {
                                a(intValue, lIlIIlIIlllll[8]);
                                "".length();
                            }
                            a(intValue, lIlIIlIIlllll[1]);
                            "".length();
                        }
                        "".length();
                        if (" ".length() >= "  ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    }
                }
            }
        }
        return lIlIIlIIlllll[1];
    }

    private static boolean lIlllIllIIIIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean i(String str) {
        if (!lIlllIllIIIIlIl(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(str.toLowerCase());
        }) ? 1 : 0) || lIlllIllIIIIIll(Equipment.contains(item2 -> {
            return item2.getName().toLowerCase().contains(str.toLowerCase());
        }) ? 1 : 0)) {
            ?? r0 = lIlIIlIIlllll[1];
            "".length();
            return " ".length() <= (-" ".length()) ? ((155 ^ 135) ^ (198 ^ 149)) & (((25 ^ 118) ^ (86 ^ 118)) ^ (-" ".length())) & ((((79 ^ 86) ^ (22 ^ 91)) & (((((145 + 34) - 105) + 127) ^ (((66 + 145) - 165) + 111)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
        }
        return lIlIIlIIlllll[0];
    }

    static {
        lIlllIllIIIIIlI();
        lIlllIlIllIlIlI();
        int[] iArr = new int[lIlIIlIIlllll[4]];
        iArr[lIlIIlIIlllll[0]] = lIlIIlIIlllll[19];
        iArr[lIlIIlIIlllll[1]] = lIlIIlIIlllll[20];
        iArr[lIlIIlIIlllll[2]] = lIlIIlIIlllll[21];
        iArr[lIlIIlIIlllll[3]] = lIlIIlIIlllll[22];
        t = iArr;
        int[] iArr2 = new int[lIlIIlIIlllll[12]];
        iArr2[lIlIIlIIlllll[0]] = lIlIIlIIlllll[23];
        iArr2[lIlIIlIIlllll[1]] = lIlIIlIIlllll[24];
        iArr2[lIlIIlIIlllll[2]] = lIlIIlIIlllll[25];
        iArr2[lIlIIlIIlllll[3]] = lIlIIlIIlllll[26];
        iArr2[lIlIIlIIlllll[4]] = lIlIIlIIlllll[27];
        iArr2[lIlIIlIIlllll[5]] = lIlIIlIIlllll[28];
        iArr2[lIlIIlIIlllll[9]] = lIlIIlIIlllll[29];
        iArr2[lIlIIlIIlllll[10]] = lIlIIlIIlllll[30];
        iArr2[lIlIIlIIlllll[11]] = lIlIIlIIlllll[31];
        u = iArr2;
        int[] iArr3 = new int[lIlIIlIIlllll[5]];
        iArr3[lIlIIlIIlllll[0]] = lIlIIlIIlllll[32];
        iArr3[lIlIIlIIlllll[1]] = lIlIIlIIlllll[33];
        iArr3[lIlIIlIIlllll[2]] = lIlIIlIIlllll[34];
        iArr3[lIlIIlIIlllll[3]] = lIlIIlIIlllll[35];
        iArr3[lIlIIlIIlllll[4]] = lIlIIlIIlllll[36];
        v = iArr3;
    }

    private static boolean lIlllIllIIIIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean a(Predicate<Item> predicate, int i) {
        if (lIlllIllIIIIIll(Inventory.contains(predicate) ? 1 : 0)) {
            return lIlIIlIIlllll[1];
        }
        if (lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (lIlllIllIIIIlIl(Bank.contains(predicate) ? 1 : 0)) {
            System.out.println("You ran out of " + String.valueOf(predicate));
            return lIlIIlIIlllll[0];
        }
        Bank.withdraw(predicate, i, Bank.WithdrawMode.ITEM);
        return lIlIIlIIlllll[1];
    }

    private static String lIlllIlIllIlIII(String llllllllllllllIllIlllIIlIIIIIllI, String llllllllllllllIllIlllIIlIIIIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlllIIlIIIIIIll = llllllllllllllIllIlllIIlIIIIIlIl.toCharArray();
        int llllllllllllllIllIlllIIlIIIIIIlI = lIlIIlIIlllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIlllll[0];
        while (lIlllIllIIIlIIl(i, length)) {
            char llllllllllllllIllIlllIIlIIIIIlll = charArray[i];
            sb.append((char) (llllllllllllllIllIlllIIlIIIIIlll ^ llllllllllllllIllIlllIIlIIIIIIll[llllllllllllllIllIlllIIlIIIIIIlI % llllllllllllllIllIlllIIlIIIIIIll.length]));
            "".length();
            llllllllllllllIllIlllIIlIIIIIIlI++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean h(int i) {
        int[] iArr = v;
        int length = iArr.length;
        int llllllllllllllIllIlllIIlIIllIlII = lIlIIlIIlllll[0];
        while (lIlllIllIIIlIIl(llllllllllllllIllIlllIIlIIllIlII, length)) {
            int llllllllllllllIllIlllIIlIIllIIll = iArr[llllllllllllllIllIlllIIlIIllIlII];
            if (lIlllIllIIIlIII(llllllllllllllIllIlllIIlIIllIIll, i)) {
                return lIlIIlIIlllll[1];
            }
            llllllllllllllIllIlllIIlIIllIlII++;
            "".length();
            if (" ".length() != " ".length()) {
                return ((7 ^ 43) ^ (61 ^ 30)) & (((251 ^ 198) ^ (3 ^ 49)) ^ (-" ".length()));
            }
        }
        return lIlIIlIIlllll[0];
    }

    private static boolean lIlllIllIIIIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIllIIIIlll(int i, int i2) {
        return i > i2;
    }

    public boolean b(String str, int i) {
        return a(item -> {
            return item.getName().toLowerCase().contains(str.toLowerCase());
        }, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean g(int i) {
        int[] iArr = new int[lIlIIlIIlllll[1]];
        iArr[lIlIIlIIlllll[0]] = i;
        if (lIlllIllIIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIlIIlllll[1]];
            iArr2[lIlIIlIIlllll[0]] = i;
            if (!lIlllIllIIIIIll(Equipment.contains(iArr2) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
        }
        ?? r0 = lIlIIlIIlllll[1];
        "".length();
        return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static String lIlllIlIllIIIlI(String llllllllllllllIllIlllIIlIIlIIIll, String llllllllllllllIllIlllIIlIIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlllll[11]), "DES");
            Cipher llllllllllllllIllIlllIIlIIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIlllIIlIIlIIlIl.init(lIlIIlIIlllll[2], secretKeySpec);
            return new String(llllllllllllllIllIlllIIlIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIlIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIIlIIlIIlII) {
            llllllllllllllIllIlllIIlIIlIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIlllIllIIIIIlI() {
        lIlIIlIIlllll = new int[38];
        lIlIIlIIlllll[0] = ((((245 + 34) - 168) + 138) ^ (((131 + 62) - 87) + 76)) & (((((119 + 16) - 55) + 170) ^ (((77 + 121) - 95) + 78)) ^ (-" ".length()));
        lIlIIlIIlllll[1] = " ".length();
        lIlIIlIIlllll[2] = "  ".length();
        lIlIIlIIlllll[3] = "   ".length();
        lIlIIlIIlllll[4] = (9 ^ 22) ^ (143 ^ 148);
        lIlIIlIIlllll[5] = 185 ^ 188;
        lIlIIlIIlllll[6] = -" ".length();
        lIlIIlIIlllll[7] = (-((-19505) & 28087)) & (-17473) & 32750;
        lIlIIlIIlllll[8] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIlIIlIIlllll[9] = (30 ^ 63) ^ (64 ^ 103);
        lIlIIlIIlllll[10] = 86 ^ 81;
        lIlIIlIIlllll[11] = (79 ^ 9) ^ (73 ^ 7);
        lIlIIlIIlllll[12] = (((93 + 170) - 112) + 26) ^ (((166 + 42) - 90) + 66);
        lIlIIlIIlllll[13] = 70 ^ 76;
        lIlIIlIIlllll[14] = 130 ^ 137;
        lIlIIlIIlllll[15] = (153 ^ 186) ^ (169 ^ 134);
        lIlIIlIIlllll[16] = 123 ^ 118;
        lIlIIlIIlllll[17] = 98 ^ 108;
        lIlIIlIIlllll[18] = (108 ^ 45) ^ (232 ^ 166);
        lIlIIlIIlllll[19] = (-22595) & 24423;
        lIlIIlIIlllll[20] = (-((-4915) & 31743)) & (-4097) & 32751;
        lIlIIlIIlllll[21] = (-24785) & 26609;
        lIlIIlIIlllll[22] = (-((-21539) & 29923)) & (-4097) & 14303;
        lIlIIlIIlllll[23] = (-(((59 + 150) - 47) + 5)) & (-9) & 13311;
        lIlIIlIIlllll[24] = (-17573) & 30710;
        lIlIIlIIlllll[25] = (-((-20625) & 22685)) & (-16385) & 31583;
        lIlIIlIIlllll[26] = (-17548) & 30687;
        lIlIIlIIlllll[27] = (-((-1219) & 27855)) & (-577) & 31743;
        lIlIIlIIlllll[28] = (-((-457) & 17897)) & (-10257) & 32246;
        lIlIIlIIlllll[29] = (-((-2889) & 28522)) & (-129) & 30463;
        lIlIIlIIlllll[30] = (-((-2635) & 20171)) & (-1) & 26601;
        lIlIIlIIlllll[31] = (-((-24794) & 26591)) & (-1) & 28637;
        lIlIIlIIlllll[32] = (-20113) & 24278;
        lIlIIlIIlllll[33] = (-11035) & 15198;
        lIlIIlIIlllll[34] = (-18484) & 22651;
        lIlIIlIIlllll[35] = (-((-1549) & 20029)) & (-9) & 23039;
        lIlIIlIIlllll[36] = (-2049) & 26990;
        lIlIIlIIlllll[37] = (118 ^ 86) ^ (56 ^ 8);
    }

    private static boolean lIlllIllIIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlllIlIllIIIll(String llllllllllllllIllIlllIIlIIIlIllI, String llllllllllllllIllIlllIIlIIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIlIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIlllll[2], llllllllllllllIllIlllIIlIIIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIIlIIIlIlll) {
            llllllllllllllIllIlllIIlIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllIIIIlIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean a(int[] iArr, int i) {
        if (lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        Item item = (Item) ((ItemQueryResults) Inventory.query().ids(iArr).results()).first();
        ItemQueryResults itemQueryResults = (ItemQueryResults) Bank.query().ids(iArr).results();
        if (lIlllIllIIIIlII(item)) {
            if (lIlllIllIIIIIll(itemQueryResults.isEmpty() ? 1 : 0)) {
                System.out.println("You do not have any of " + Arrays.toString(iArr));
                return lIlIIlIIlllll[0];
            }
            Bank.withdraw(((Item) itemQueryResults.first()).getId(), i, Bank.WithdrawMode.ITEM);
            return lIlIIlIIlllll[1];
        }
        return lIlIIlIIlllll[1];
    }

    private static void lIlllIlIllIlIlI() {
        lIlIIlIIllllI = new String[lIlIIlIIlllll[37]];
        lIlIIlIIllllI[lIlIIlIIlllll[0]] = lIlllIlIllIIIlI("uVZS4EOyKxjH06BiXm6Qk7ZOzES/bhuy2SIBpK7/mYg=", "zYVqi");
        lIlIIlIIllllI[lIlIIlIIlllll[1]] = lIlllIlIllIIIlI("ciCZAvfmnVY=", "uUVfs");
        lIlIIlIIllllI[lIlIIlIIlllll[2]] = lIlllIlIllIIIlI("ECv3gPuQ1mw=", "VGOmd");
        lIlIIlIIllllI[lIlIIlIIlllll[3]] = lIlllIlIllIIIll("AO7x25euWsUnTw4xXat37KKluDf548mS", "eCOPd");
        lIlIIlIIllllI[lIlIIlIIlllll[4]] = lIlllIlIllIIIlI("0qNxOzkD60qR+01NZEQecA==", "zYqIF");
        lIlIIlIIllllI[lIlIIlIIlllll[5]] = lIlllIlIllIIIlI("F2XoVe7z7mEcf6iPH0buwQ==", "rmtPj");
        lIlIIlIIllllI[lIlIIlIIlllll[9]] = lIlllIlIllIlIII("AD8MMTwBcwUtNR4=", "sSmHY");
        lIlIIlIIllllI[lIlIIlIIlllll[10]] = lIlllIlIllIIIll("aHeIxJIv0+EeA5iTe9VK0A==", "qUnCz");
        lIlIIlIIllllI[lIlIIlIIlllll[11]] = lIlllIlIllIlIII("Kg8uLw==", "KaZFC");
        lIlIIlIIllllI[lIlIIlIIlllll[12]] = lIlllIlIllIlIII("IAoHAT4=", "dxnoU");
        lIlIIlIIllllI[lIlIIlIIlllll[13]] = lIlllIlIllIIIll("5WMWOwGWW4I=", "jEnfv");
        lIlIIlIIllllI[lIlIIlIIlllll[14]] = lIlllIlIllIIIll("9UsJWJYDV34=", "CYpdQ");
        lIlIIlIIllllI[lIlIIlIIlllll[15]] = lIlllIlIllIIIll("C+db3KFbqHE=", "ItCcg");
        lIlIIlIIllllI[lIlIIlIIlllll[16]] = lIlllIlIllIIIll("e5k8SRSPLVT7nmu4Ifulww==", "luyDM");
        lIlIIlIIllllI[lIlIIlIIlllll[17]] = lIlllIlIllIlIII("GwQ8Nx8/DiE8RQ==", "LeHRm");
        lIlIIlIIllllI[lIlIIlIIlllll[18]] = lIlllIlIllIIIll("mQbIbX3OA10cqmHwhsDXQg==", "BYGlr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public boolean r() {
        if (lIlllIllIIIIIll(this.x.gamesNecklace() ? 1 : 0) && lIlllIllIIIIlIl(Inventory.contains(item -> {
            return item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[13]]);
        }) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (lIlllIllIIIIIll(this.x.antiPoison() ? 1 : 0) && lIlllIllIIIIlIl(Inventory.contains(item2 -> {
            if (lIlllIllIIIIIll(item2.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[11]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIIlllll[1]];
                strArr[lIlIIlIIlllll[0]] = lIlIIlIIllllI[lIlIIlIIlllll[12]];
                if (lIlllIllIIIIIll(item2.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIlIIlllll[1];
                    "".length();
                    return "   ".length() <= 0 ? ((75 ^ 89) ^ (29 ^ 66)) & (((23 ^ 32) ^ (188 ^ 198)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIlIIlllll[0];
        }) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        int[] iArr = new int[lIlIIlIIlllll[1]];
        iArr[lIlIIlIIlllll[0]] = this.x.foodID();
        if (lIlllIllIIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (lIlllIllIIIIIll(this.x.slayerRing() ? 1 : 0) && lIlllIllIIIIlIl(Inventory.contains(item3 -> {
            return item3.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[10]]);
        }) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        b b = this.w.b();
        if (lIlllIllIIIIllI(b)) {
            if (lIlllIllIIIIIll(b.o() ? 1 : 0) && lIlllIllIIIIlIl(a(t) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
            if (lIlllIllIIIIIll(b.q() ? 1 : 0) && lIlllIllIIIIlIl(a(u) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
            List<Integer> p = b.p();
            if (lIlllIllIIIIllI(p)) {
                if (lIlllIllIIIIIll(p.contains(Integer.valueOf(lIlIIlIIlllll[6])) ? 1 : 0)) {
                    return lIlIIlIIlllll[1];
                }
                for (Integer num : p) {
                    int intValue = num.intValue();
                    if (lIlllIllIIIIIll(h(intValue) ? 1 : 0) && lIlllIllIIIIIll(i(lIlIIlIIllllI[lIlIIlIIlllll[9]]) ? 1 : 0)) {
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else if (lIlllIllIIIIlIl(g(intValue) ? 1 : 0)) {
                        return lIlIIlIIlllll[0];
                    } else {
                        "".length();
                        if ("   ".length() <= ((226 ^ 172) & ((126 ^ 48) ^ (-1)))) {
                            return (true ^ true) & (true ^ true);
                        }
                    }
                }
            }
        }
        return lIlIIlIIlllll[1];
    }

    public boolean a(int i, int i2) {
        return a(item -> {
            if (lIlllIllIIIlIII(item.getId(), i)) {
                ?? r0 = lIlIIlIIlllll[1];
                "".length();
                return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIlIIlllll[0];
        }, i2);
    }
}
