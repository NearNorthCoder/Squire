/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.query.results.ItemQueryResults
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.query.results.ItemQueryResults;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=1337)
public class d
extends Task {
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

    private static boolean lIlllIllIIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int[] nArray) {
        void var31;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var25 = lIlIIlIIlllll[0];
        while (d.lIlllIllIIIlIIl(var25, (int)var31)) {
            d var29;
            void var5;
            void var8 = var5[var25];
            if (d.lIlllIllIIIIIll(var29.g((int)var8) ? 1 : 0)) {
                return lIlIIlIIlllll[1];
            }
            ++var25;
            0;
            if (1 < (30 + 46 - -48 + 36 ^ 19 + 124 - 127 + 148)) continue;
            return false;
        }
        return lIlIIlIIlllll[0];
    }

    public boolean run() {
        b var28;
        d var32;
        if (d.lIlllIllIIIIIll(this.r() ? 1 : 0)) {
            this.w.c(lIlIIlIIlllll[0]);
            this.y = null;
            return lIlIIlIIlllll[0];
        }
        var32.w.c(lIlIIlIIlllll[1]);
        if (d.lIlllIllIIIIlII(var32.y)) {
            if (d.lIlllIllIIIIIll(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[18]])) ? 1 : 0)) {
                var32.y = BankLocation.CRAFTING_GUILD;
                0;
                
                }
            } else {
                var32.y = BankLocation.getNearest();
            }
        }
        System.out.println("Banking at " + var32.y.toString());
        WorldArea var17 = var32.y.getArea();
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            if (d.lIlllIllIIIIIll(Bank.open() ? 1 : 0)) {
                System.out.println(lIlIIlIIllllI[lIlIIlIIlllll[0]]);
                return lIlIIlIIlllll[1];
            }
            if (d.lIlllIllIIIIllI(var17) && d.lIlllIllIIIIlIl(var17.contains((Locatable)Players.getLocal()) ? 1 : 0) && d.lIlllIllIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((BankLocation)var32.y);
                0;
                return lIlIIlIIlllll[1];
            }
        }
        if (d.lIlllIllIIIIIll(Inventory.isFull() ? 1 : 0)) {
            if (d.lIlllIllIIIIIll(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[17]])) ? 1 : 0)) {
                Bank.deposit(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[16]]), (int)lIlIIlIIlllll[1]);
                0;
                
                }
            } else {
                Bank.depositInventory();
            }
            return lIlIIlIIlllll[1];
        }
        if (d.lIlllIllIIIIIll(var32.x.sipStam() ? 1 : 0)) {
            var32.b(lIlIIlIIllllI[lIlIIlIIlllll[1]], lIlIIlIIlllll[1]);
            0;
        }
        if (d.lIlllIllIIIIIll(var32.x.gamesNecklace() ? 1 : 0)) {
            var32.b(lIlIIlIIllllI[lIlIIlIIlllll[2]], lIlIIlIIlllll[1]);
            0;
        }
        if (d.lIlllIllIIIIIll(var32.x.antiPoison() ? 1 : 0)) {
            var32.a(item -> {
                int n2;
                if (!d.lIlllIllIIIIlIl(item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[14]]) ? 1 : 0) || d.lIlllIllIIIIIll(item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[15]]) ? 1 : 0)) {
                    n2 = lIlIIlIIlllll[1];
                    0;
                    if (2 <= -1) {
                        return false;
                    }
                } else {
                    n2 = lIlIIlIIlllll[0];
                }
                return n2 != 0;
            }, lIlIIlIIlllll[1]);
            0;
        }
        int[] nArray = new int[lIlIIlIIlllll[1]];
        nArray[d.lIlIIlIIlllll[0]] = var32.x.foodID();
        if (d.lIlllIllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIIlIIlllll[1]];
            nArray2[d.lIlIIlIIlllll[0]] = var32.x.foodID();
            if (d.lIlllIllIIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(lIlIIlIIllllI[lIlIIlIIlllll[3]]);
                return lIlIIlIIlllll[0];
            }
            Bank.withdraw((int)var32.x.foodID(), (int)var32.x.foodAmount(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        if (d.lIlllIllIIIIIll(var32.x.slayerRing() ? 1 : 0)) {
            var32.b(lIlIIlIIllllI[lIlIIlIIlllll[4]], lIlIIlIIlllll[1]);
            0;
        }
        if (d.lIlllIllIIIIllI((Object)(var28 = var32.w.b()))) {
            List<Integer> llllllllllllllIllIlllIIlIllIIlIl2;
            if (d.lIlllIllIIIIIll(var28.o() ? 1 : 0) && d.lIlllIllIIIIlIl(var32.a(t) ? 1 : 0)) {
                int n2;
                if (d.lIlllIllIIIIlll(Inventory.getFreeSlots(), lIlIIlIIlllll[5])) {
                    n2 = Inventory.getFreeSlots() - lIlIIlIIlllll[3];
                    0;
                    
                    }
                } else {
                    n2 = lIlIIlIIlllll[1];
                }
                int llllllllllllllIllIlllIIlIllIIlIl2 = n2;
                var32.a(t, llllllllllllllIllIlllIIlIllIIlIl2);
                0;
            }
            if (d.lIlllIllIIIIIll(var28.q() ? 1 : 0) && d.lIlllIllIIIIlIl(var32.a(u) ? 1 : 0)) {
                var32.a(u, lIlIIlIIlllll[1]);
                0;
            }
            if (d.lIlllIllIIIIllI(llllllllllllllIllIlllIIlIllIIlIl2 = var28.p())) {
                Iterator<Integer> var9 = llllllllllllllIllIlllIIlIllIIlIl2.iterator();
                while (d.lIlllIllIIIIIll(var9.hasNext() ? 1 : 0)) {
                    int var3 = var9.next();
                    if (d.lIlllIllIIIIIll(var32.h(var3) ? 1 : 0) && d.lIlllIllIIIIIll(var32.i(lIlIIlIIllllI[lIlIIlIIlllll[5]]) ? 1 : 0)) {
                        0;
                        if (-1 != 1) continue;
                        return ((0x33 ^ 0x4D ^ (0x69 ^ 0x26)) & (18 + 88 - 80 + 141 ^ 119 + 148 - 266 + 149 ^ -1)) != 0;
                    }
                    if (d.lIlllIllIIIlIII(var3, lIlIIlIIlllll[6])) {
                        0;
                        if (-(0x54 ^ 0x50) < 0) continue;
                        return false;
                    }
                    if (d.lIlllIllIIIIlIl(var32.g(var3) ? 1 : 0)) {
                        if (d.lIlllIllIIIlIII(var3, lIlIIlIIlllll[7])) {
                            var32.a(var3, lIlIIlIIlllll[8]);
                            0;
                        }
                        var32.a(var3, lIlIIlIIlllll[1]);
                        0;
                    }
                    0;
                    if (1 < 2) continue;
                    return false;
                }
            }
        }
        return lIlIIlIIlllll[1];
    }

    private static boolean lIlllIllIIIIIll(int n2) {
        return n2 != 0;
    }

    private boolean i(String string) {
        boolean bl;
        if (!d.lIlllIllIIIIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0) || d.lIlllIllIIIIIll(Equipment.contains(item -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            bl = lIlIIlIIlllll[1];
            0;
            if (1 <= -1) {
                return ((0x9B ^ 0x87 ^ (0xC6 ^ 0x95)) & (0x19 ^ 0x76 ^ (0x56 ^ 0x76) ^ -1) & ((0x4F ^ 0x56 ^ (0x16 ^ 0x5B)) & (145 + 34 - 105 + 127 ^ 66 + 145 - 165 + 111 ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIIlllll[0];
        }
        return bl;
    }

    static {
        d.lIlllIllIIIIIlI();
        d.lIlllIlIllIlIlI();
        int[] nArray = new int[lIlIIlIIlllll[4]];
        nArray[d.lIlIIlIIlllll[0]] = lIlIIlIIlllll[19];
        nArray[d.lIlIIlIIlllll[1]] = lIlIIlIIlllll[20];
        nArray[d.lIlIIlIIlllll[2]] = lIlIIlIIlllll[21];
        nArray[d.lIlIIlIIlllll[3]] = lIlIIlIIlllll[22];
        t = nArray;
        int[] nArray2 = new int[lIlIIlIIlllll[12]];
        nArray2[d.lIlIIlIIlllll[0]] = lIlIIlIIlllll[23];
        nArray2[d.lIlIIlIIlllll[1]] = lIlIIlIIlllll[24];
        nArray2[d.lIlIIlIIlllll[2]] = lIlIIlIIlllll[25];
        nArray2[d.lIlIIlIIlllll[3]] = lIlIIlIIlllll[26];
        nArray2[d.lIlIIlIIlllll[4]] = lIlIIlIIlllll[27];
        nArray2[d.lIlIIlIIlllll[5]] = lIlIIlIIlllll[28];
        nArray2[d.lIlIIlIIlllll[9]] = lIlIIlIIlllll[29];
        nArray2[d.lIlIIlIIlllll[10]] = lIlIIlIIlllll[30];
        nArray2[d.lIlIIlIIlllll[11]] = lIlIIlIIlllll[31];
        u = nArray2;
        int[] nArray3 = new int[lIlIIlIIlllll[5]];
        nArray3[d.lIlIIlIIlllll[0]] = lIlIIlIIlllll[32];
        nArray3[d.lIlIIlIIlllll[1]] = lIlIIlIIlllll[33];
        nArray3[d.lIlIIlIIlllll[2]] = lIlIIlIIlllll[34];
        nArray3[d.lIlIIlIIlllll[3]] = lIlIIlIIlllll[35];
        nArray3[d.lIlIIlIIlllll[4]] = lIlIIlIIlllll[36];
        v = nArray3;
    }

    private static boolean lIlllIllIIIIllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Predicate<Item> predicate, int n2) {
        void var13;
        if (d.lIlllIllIIIIIll(Inventory.contains(predicate) ? 1 : 0)) {
            return lIlIIlIIlllll[1];
        }
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIlIl(Bank.contains((Predicate)var13) ? 1 : 0)) {
            System.out.println("You ran out of " + String.valueOf(var13));
            return lIlIIlIIlllll[0];
        }
        Bank.withdraw(predicate, (int)n2, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lIlIIlIIlllll[1];
    }

    private static String lIlllIlIllIlIII(String var40, String var7) {
        var40 = new String(Base64.getDecoder().decode(var40.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var43 = new StringBuilder();
        char[] var12 = var7.toCharArray();
        int var33 = lIlIIlIIlllll[0];
        char[] var42 = var40.toCharArray();
        int var4 = var42.length;
        int var2 = lIlIIlIIlllll[0];
        while (d.lIlllIllIIIlIIl(var2, var4)) {
            char var35 = var42[var2];
            var43.append((char)(var35 ^ var12[var33 % var12.length]));
            0;
            ++var33;
            ++var2;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var43);
    }

    /*
     * WARNING - void declaration
     */
    private boolean h(int n2) {
        void var41;
        int[] nArray = v;
        int n3 = nArray.length;
        int var1 = lIlIIlIIlllll[0];
        while (d.lIlllIllIIIlIIl(var1, (int)var41)) {
            void var24;
            void var22;
            void var21 = var22[var1];
            if (d.lIlllIllIIIlIII((int)var21, (int)var24)) {
                return lIlIIlIIlllll[1];
            }
            ++var1;
            0;
            if (1 == 1) continue;
            return ((7 ^ 0x2B ^ (0x3D ^ 0x1E)) & (0xFB ^ 0xC6 ^ (3 ^ 0x31) ^ -1)) != 0;
        }
        return lIlIIlIIlllll[0];
    }

    private static boolean lIlllIllIIIIlII(Object object) {
        return object == null;
    }

    private static boolean lIlllIllIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    public boolean b(String string, int n2) {
        return this.a(item -> item.getName().toLowerCase().contains(string.toLowerCase()), n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean g(int n2) {
        int n3;
        block3: {
            block2: {
                int[] nArray = new int[lIlIIlIIlllll[1]];
                nArray[d.lIlIIlIIlllll[0]] = n2;
                if (!d.lIlllIllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIlIIlIIlllll[1]];
                nArray2[d.lIlIIlIIlllll[0]] = n2;
                if (!d.lIlllIllIIIIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n3 = lIlIIlIIlllll[1];
            0;
            if (1 < 2) return n3 != 0;
            return false;
        }
        n3 = lIlIIlIIlllll[0];
        return n3 != 0;
    }

    private static String lIlllIlIllIIIlI(String var44, String var18) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlllll[11]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lIlIIlIIlllll[2], var19);
            return new String(var20.doFinal(Base64.getDecoder().decode(var44.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static void lIlllIllIIIIIlI() {
        lIlIIlIIlllll = new int[38];
        d.lIlIIlIIlllll[0] = (245 + 34 - 168 + 138 ^ 131 + 62 - 87 + 76) & (119 + 16 - 55 + 170 ^ 77 + 121 - 95 + 78 ^ -1);
        d.lIlIIlIIlllll[1] = 1;
        d.lIlIIlIIlllll[2] = 2;
        d.lIlIIlIIlllll[3] = 3;
        d.lIlIIlIIlllll[4] = 9 ^ 0x16 ^ (0x8F ^ 0x94);
        d.lIlIIlIIlllll[5] = 0xB9 ^ 0xBC;
        d.lIlIIlIIlllll[6] = -1;
        d.lIlIIlIIlllll[7] = -(0xFFFFB3CF & 0x6DB7) & (0xFFFFBBBF & 0x7FEE);
        d.lIlIIlIIlllll[8] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        d.lIlIIlIIlllll[9] = 0x1E ^ 0x3F ^ (0x40 ^ 0x67);
        d.lIlIIlIIlllll[10] = 0x56 ^ 0x51;
        d.lIlIIlIIlllll[11] = 0x4F ^ 9 ^ (0x49 ^ 7);
        d.lIlIIlIIlllll[12] = 93 + 170 - 112 + 26 ^ 166 + 42 - 90 + 66;
        d.lIlIIlIIlllll[13] = 0x46 ^ 0x4C;
        d.lIlIIlIIlllll[14] = 0x82 ^ 0x89;
        d.lIlIIlIIlllll[15] = 0x99 ^ 0xBA ^ (0xA9 ^ 0x86);
        d.lIlIIlIIlllll[16] = 0x7B ^ 0x76;
        d.lIlIIlIIlllll[17] = 0x62 ^ 0x6C;
        d.lIlIIlIIlllll[18] = 0x6C ^ 0x2D ^ (0xE8 ^ 0xA6);
        d.lIlIIlIIlllll[19] = 0xFFFFA7BD & 0x5F67;
        d.lIlIIlIIlllll[20] = -(0xFFFFECCD & 0x7BFF) & (0xFFFFEFFF & 0x7FEF);
        d.lIlIIlIIlllll[21] = 0xFFFF9F2F & 0x67F1;
        d.lIlIIlIIlllll[22] = -(0xFFFFABDD & 0x74E3) & (0xFFFFEFFF & 0x37DF);
        d.lIlIIlIIlllll[23] = -(59 + 150 - 47 + 5) & (0xFFFFFFF7 & 0x33FF);
        d.lIlIIlIIlllll[24] = 0xFFFFBB5B & 0x77F6;
        d.lIlIIlIIlllll[25] = -(0xFFFFAF6F & 0x589D) & (0xFFFFBFFF & 0x7B5F);
        d.lIlIIlIIlllll[26] = 0xFFFFBB74 & 0x77DF;
        d.lIlIIlIIlllll[27] = -(0xFFFFFB3D & 0x6CCF) & (0xFFFFFDBF & 0x7BFF);
        d.lIlIIlIIlllll[28] = -(0xFFFFFE37 & 0x45E9) & (0xFFFFD7EF & 0x7DF6);
        d.lIlIIlIIlllll[29] = -(0xFFFFF4B7 & 0x6F6A) & (0xFFFFFF7F & 0x76FF);
        d.lIlIIlIIlllll[30] = -(0xFFFFF5B5 & 0x4ECB) & (0xFFFFFFFF & 0x67E9);
        d.lIlIIlIIlllll[31] = -(0xFFFF9F26 & 0x67DF) & (0xFFFFFFFF & 0x6FDD);
        d.lIlIIlIIlllll[32] = 0xFFFFB16F & 0x5ED6;
        d.lIlIIlIIlllll[33] = 0xFFFFD4E5 & 0x3B5E;
        d.lIlIIlIIlllll[34] = 0xFFFFB7CC & 0x587B;
        d.lIlIIlIIlllll[35] = -(0xFFFFF9F3 & 0x4E3D) & (0xFFFFFFF7 & 0x59FF);
        d.lIlIIlIIlllll[36] = 0xFFFFF7FF & 0x696E;
        d.lIlIIlIIlllll[37] = 0x76 ^ 0x56 ^ (0x38 ^ 8);
    }

    private static boolean lIlllIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllIlIllIIIll(String var36, String var30) {
        try {
            SecretKeySpec var34 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var30.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIIlIIlllll[2], var34);
            return new String(var14.doFinal(Base64.getDecoder().decode(var36.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllIIIIlIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(int[] nArray, int n2) {
        void var10;
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        Item var27 = (Item)((ItemQueryResults)Inventory.query().ids((int[])var10).results()).first();
        ItemQueryResults var16 = (ItemQueryResults)Bank.query().ids((int[])var10).results();
        if (d.lIlllIllIIIIlII(var27)) {
            void var11;
            if (d.lIlllIllIIIIIll(var16.isEmpty() ? 1 : 0)) {
                System.out.println("You do not have any of " + Arrays.toString((int[])var10));
                return lIlIIlIIlllll[0];
            }
            Bank.withdraw((int)((Item)var16.first()).getId(), (int)var11, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return lIlIIlIIlllll[1];
        }
        return lIlIIlIIlllll[1];
    }

    private static void lIlllIlIllIlIlI() {
        lIlIIlIIllllI = new String[lIlIIlIIlllll[37]];
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[0]] = d."Found bank, and we are opening";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[1]] = d."Stamina";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[2]] = d."Games";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[3]] = d."You ran out of food.";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[4]] = d."slayer ring";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[5]] = d."slayer helm";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[9]] = d."slayer helm";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[10]] = d."slayer ring";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[11]] = d."anti";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[12]] = d."Drink";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[13]] = d."Games";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[14]] = d."antip";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[15]] = d."antid";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[16]] = d."Waterskin(";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[17]] = d."Waterskin(";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[18]] = d."Crafting cape";
    }

    public boolean r() {
        d var23;
        if (d.lIlllIllIIIIIll(this.x.gamesNecklace() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[13]])) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIIll(var23.x.antiPoison() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> {
            int n2;
            if (d.lIlllIllIIIIIll(item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[11]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIlllll[1]];
                stringArray[d.lIlIIlIIlllll[0]] = lIlIIlIIllllI[lIlIIlIIlllll[12]];
                if (d.lIlllIllIIIIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIlllll[1];
                    0;
                    if (3 > 0) return n2 != 0;
                    return ((0x4B ^ 0x59 ^ (0x1D ^ 0x42)) & (0x17 ^ 0x20 ^ (0xBC ^ 0xC6) ^ -1)) != 0;
                }
            }
            n2 = lIlIIlIIlllll[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        int[] nArray = new int[lIlIIlIIlllll[1]];
        nArray[d.lIlIIlIIlllll[0]] = var23.x.foodID();
        if (d.lIlllIllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIIll(var23.x.slayerRing() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[10]])) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        b var26 = var23.w.b();
        if (d.lIlllIllIIIIllI((Object)var26)) {
            if (d.lIlllIllIIIIIll(var26.o() ? 1 : 0) && d.lIlllIllIIIIlIl(var23.a(t) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
            if (d.lIlllIllIIIIIll(var26.q() ? 1 : 0) && d.lIlllIllIIIIlIl(var23.a(u) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
            List<Integer> var6 = var26.p();
            if (d.lIlllIllIIIIllI(var6)) {
                if (d.lIlllIllIIIIIll(var6.contains(lIlIIlIIlllll[6]) ? 1 : 0)) {
                    return lIlIIlIIlllll[1];
                }
                Iterator<Integer> var15 = var6.iterator();
                while (d.lIlllIllIIIIIll(var15.hasNext() ? 1 : 0)) {
                    int var38 = var15.next();
                    if (d.lIlllIllIIIIIll(var23.h(var38) ? 1 : 0) && d.lIlllIllIIIIIll(var23.i(lIlIIlIIllllI[lIlIIlIIlllll[9]]) ? 1 : 0)) {
                        0;
                        if (((0x4A ^ 0x72) & ~(0xAC ^ 0x94)) == 0) continue;
                        return false;
                    }
                    if (d.lIlllIllIIIIlIl(var23.g(var38) ? 1 : 0)) {
                        return lIlIIlIIlllll[0];
                    }
                    0;
                    if (3 > ((0xE2 ^ 0xAC) & ~(0x7E ^ 0x30))) continue;
                    return false;
                }
            }
        }
        return lIlIIlIIlllll[1];
    }

    public boolean a(int n2, int n3) {
        return this.a(item -> {
            boolean bl;
            if (d.lIlllIllIIIlIII(item.getId(), n2)) {
                bl = lIlIIlIIlllll[1];
                0;
                if (1 == 0) {
                    return false;
                }
            } else {
                bl = lIlIIlIIlllll[0];
            }
            return bl;
        }, n3);
    }
}

