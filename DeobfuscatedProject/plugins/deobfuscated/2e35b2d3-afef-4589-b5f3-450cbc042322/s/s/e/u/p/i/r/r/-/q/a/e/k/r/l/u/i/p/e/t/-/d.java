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
        void llllllllllllllIllIlllIIlIIllllll;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int llllllllllllllIllIlllIIlIIlllllI = lIlIIlIIlllll[0];
        while (d.lIlllIllIIIlIIl(llllllllllllllIllIlllIIlIIlllllI, (int)llllllllllllllIllIlllIIlIIllllll)) {
            d llllllllllllllIllIlllIIlIlIIIIlI;
            void llllllllllllllIllIlllIIlIlIIIIII;
            void llllllllllllllIllIlllIIlIIllllIl = llllllllllllllIllIlllIIlIlIIIIII[llllllllllllllIllIlllIIlIIlllllI];
            if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIIIIlI.g((int)llllllllllllllIllIlllIIlIIllllIl) ? 1 : 0)) {
                return lIlIIlIIlllll[1];
            }
            ++llllllllllllllIllIlllIIlIIlllllI;
            0;
            if (1 < (30 + 46 - -48 + 36 ^ 19 + 124 - 127 + 148)) continue;
            return ((124 + 164 - 97 + 17 ^ 8 + 127 - 72 + 70) & (98 + 100 - 164 + 181 ^ 128 + 71 - 117 + 48 ^ -1)) != 0;
        }
        return lIlIIlIIlllll[0];
    }

    public boolean run() {
        b llllllllllllllIllIlllIIlIllIIllI;
        d llllllllllllllIllIlllIIlIllIlIII;
        if (d.lIlllIllIIIIIll(this.r() ? 1 : 0)) {
            this.w.c(lIlIIlIIlllll[0]);
            this.y = null;
            return lIlIIlIIlllll[0];
        }
        llllllllllllllIllIlllIIlIllIlIII.w.c(lIlIIlIIlllll[1]);
        if (d.lIlllIllIIIIlII(llllllllllllllIllIlllIIlIllIlIII.y)) {
            if (d.lIlllIllIIIIIll(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[18]])) ? 1 : 0)) {
                llllllllllllllIllIlllIIlIllIlIII.y = BankLocation.CRAFTING_GUILD;
                0;
                if (null != null) {
                    return ((0x7A ^ 0x71) & ~(0xBE ^ 0xB5)) != 0;
                }
            } else {
                llllllllllllllIllIlllIIlIllIlIII.y = BankLocation.getNearest();
            }
        }
        System.out.println("Banking at " + llllllllllllllIllIlllIIlIllIlIII.y.toString());
        WorldArea llllllllllllllIllIlllIIlIllIIlll = llllllllllllllIllIlllIIlIllIlIII.y.getArea();
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            if (d.lIlllIllIIIIIll(Bank.open() ? 1 : 0)) {
                System.out.println(lIlIIlIIllllI[lIlIIlIIlllll[0]]);
                return lIlIIlIIlllll[1];
            }
            if (d.lIlllIllIIIIllI(llllllllllllllIllIlllIIlIllIIlll) && d.lIlllIllIIIIlIl(llllllllllllllIllIlllIIlIllIIlll.contains((Locatable)Players.getLocal()) ? 1 : 0) && d.lIlllIllIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((BankLocation)llllllllllllllIllIlllIIlIllIlIII.y);
                0;
                return lIlIIlIIlllll[1];
            }
        }
        if (d.lIlllIllIIIIIll(Inventory.isFull() ? 1 : 0)) {
            if (d.lIlllIllIIIIIll(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[17]])) ? 1 : 0)) {
                Bank.deposit(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[16]]), (int)lIlIIlIIlllll[1]);
                0;
                if (null != null) {
                    return ((0x9C ^ 0x82) & ~(0x5B ^ 0x45)) != 0;
                }
            } else {
                Bank.depositInventory();
            }
            return lIlIIlIIlllll[1];
        }
        if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIlIII.x.sipStam() ? 1 : 0)) {
            llllllllllllllIllIlllIIlIllIlIII.b(lIlIIlIIllllI[lIlIIlIIlllll[1]], lIlIIlIIlllll[1]);
            0;
        }
        if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIlIII.x.gamesNecklace() ? 1 : 0)) {
            llllllllllllllIllIlllIIlIllIlIII.b(lIlIIlIIllllI[lIlIIlIIlllll[2]], lIlIIlIIlllll[1]);
            0;
        }
        if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIlIII.x.antiPoison() ? 1 : 0)) {
            llllllllllllllIllIlllIIlIllIlIII.a(item -> {
                int n2;
                if (!d.lIlllIllIIIIlIl(item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[14]]) ? 1 : 0) || d.lIlllIllIIIIIll(item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[15]]) ? 1 : 0)) {
                    n2 = lIlIIlIIlllll[1];
                    0;
                    if (2 <= -1) {
                        return ((0x5A ^ 0x47) & ~(0x80 ^ 0x9D)) != 0;
                    }
                } else {
                    n2 = lIlIIlIIlllll[0];
                }
                return n2 != 0;
            }, lIlIIlIIlllll[1]);
            0;
        }
        int[] nArray = new int[lIlIIlIIlllll[1]];
        nArray[d.lIlIIlIIlllll[0]] = llllllllllllllIllIlllIIlIllIlIII.x.foodID();
        if (d.lIlllIllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIIlIIlllll[1]];
            nArray2[d.lIlIIlIIlllll[0]] = llllllllllllllIllIlllIIlIllIlIII.x.foodID();
            if (d.lIlllIllIIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(lIlIIlIIllllI[lIlIIlIIlllll[3]]);
                return lIlIIlIIlllll[0];
            }
            Bank.withdraw((int)llllllllllllllIllIlllIIlIllIlIII.x.foodID(), (int)llllllllllllllIllIlllIIlIllIlIII.x.foodAmount(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIlIII.x.slayerRing() ? 1 : 0)) {
            llllllllllllllIllIlllIIlIllIlIII.b(lIlIIlIIllllI[lIlIIlIIlllll[4]], lIlIIlIIlllll[1]);
            0;
        }
        if (d.lIlllIllIIIIllI((Object)(llllllllllllllIllIlllIIlIllIIllI = llllllllllllllIllIlllIIlIllIlIII.w.b()))) {
            List<Integer> llllllllllllllIllIlllIIlIllIIlIl2;
            if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIIllI.o() ? 1 : 0) && d.lIlllIllIIIIlIl(llllllllllllllIllIlllIIlIllIlIII.a(t) ? 1 : 0)) {
                int n2;
                if (d.lIlllIllIIIIlll(Inventory.getFreeSlots(), lIlIIlIIlllll[5])) {
                    n2 = Inventory.getFreeSlots() - lIlIIlIIlllll[3];
                    0;
                    if (null != null) {
                        return ((0xCF ^ 0x8D ^ (0x6C ^ 8)) & (92 + 40 - 45 + 77 ^ 24 + 91 - 94 + 109 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIlIIlllll[1];
                }
                int llllllllllllllIllIlllIIlIllIIlIl2 = n2;
                llllllllllllllIllIlllIIlIllIlIII.a(t, llllllllllllllIllIlllIIlIllIIlIl2);
                0;
            }
            if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIIllI.q() ? 1 : 0) && d.lIlllIllIIIIlIl(llllllllllllllIllIlllIIlIllIlIII.a(u) ? 1 : 0)) {
                llllllllllllllIllIlllIIlIllIlIII.a(u, lIlIIlIIlllll[1]);
                0;
            }
            if (d.lIlllIllIIIIllI(llllllllllllllIllIlllIIlIllIIlIl2 = llllllllllllllIllIlllIIlIllIIllI.p())) {
                Iterator<Integer> llllllllllllllIllIlllIIlIllIIlII = llllllllllllllIllIlllIIlIllIIlIl2.iterator();
                while (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIIlII.hasNext() ? 1 : 0)) {
                    int llllllllllllllIllIlllIIlIllIIIll = llllllllllllllIllIlllIIlIllIIlII.next();
                    if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIlIII.h(llllllllllllllIllIlllIIlIllIIIll) ? 1 : 0) && d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIllIlIII.i(lIlIIlIIllllI[lIlIIlIIlllll[5]]) ? 1 : 0)) {
                        0;
                        if (-1 != 1) continue;
                        return ((0x33 ^ 0x4D ^ (0x69 ^ 0x26)) & (18 + 88 - 80 + 141 ^ 119 + 148 - 266 + 149 ^ -1)) != 0;
                    }
                    if (d.lIlllIllIIIlIII(llllllllllllllIllIlllIIlIllIIIll, lIlIIlIIlllll[6])) {
                        0;
                        if (-(0x54 ^ 0x50) < 0) continue;
                        return ((0x2A ^ 0xD) & ~(0x59 ^ 0x7E)) != 0;
                    }
                    if (d.lIlllIllIIIIlIl(llllllllllllllIllIlllIIlIllIlIII.g(llllllllllllllIllIlllIIlIllIIIll) ? 1 : 0)) {
                        if (d.lIlllIllIIIlIII(llllllllllllllIllIlllIIlIllIIIll, lIlIIlIIlllll[7])) {
                            llllllllllllllIllIlllIIlIllIlIII.a(llllllllllllllIllIlllIIlIllIIIll, lIlIIlIIlllll[8]);
                            0;
                        }
                        llllllllllllllIllIlllIIlIllIlIII.a(llllllllllllllIllIlllIIlIllIIIll, lIlIIlIIlllll[1]);
                        0;
                    }
                    0;
                    if (1 < 2) continue;
                    return ((0xB ^ 0x55) & ~(0x12 ^ 0x4C)) != 0;
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
        void llllllllllllllIllIlllIIlIllIIIII;
        if (d.lIlllIllIIIIIll(Inventory.contains(predicate) ? 1 : 0)) {
            return lIlIIlIIlllll[1];
        }
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIlIl(Bank.contains((Predicate)llllllllllllllIllIlllIIlIllIIIII) ? 1 : 0)) {
            System.out.println("You ran out of " + String.valueOf(llllllllllllllIllIlllIIlIllIIIII));
            return lIlIIlIIlllll[0];
        }
        Bank.withdraw(predicate, (int)n2, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lIlIIlIIlllll[1];
    }

    private static String lIlllIlIllIlIII(String llllllllllllllIllIlllIIlIIIIIllI, String llllllllllllllIllIlllIIlIIIIIlIl) {
        llllllllllllllIllIlllIIlIIIIIllI = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIIlIIIIIlII = new StringBuilder();
        char[] llllllllllllllIllIlllIIlIIIIIIll = llllllllllllllIllIlllIIlIIIIIlIl.toCharArray();
        int llllllllllllllIllIlllIIlIIIIIIlI = lIlIIlIIlllll[0];
        char[] llllllllllllllIllIlllIIIllllllII = llllllllllllllIllIlllIIlIIIIIllI.toCharArray();
        int llllllllllllllIllIlllIIIlllllIll = llllllllllllllIllIlllIIIllllllII.length;
        int llllllllllllllIllIlllIIIlllllIlI = lIlIIlIIlllll[0];
        while (d.lIlllIllIIIlIIl(llllllllllllllIllIlllIIIlllllIlI, llllllllllllllIllIlllIIIlllllIll)) {
            char llllllllllllllIllIlllIIlIIIIIlll = llllllllllllllIllIlllIIIllllllII[llllllllllllllIllIlllIIIlllllIlI];
            llllllllllllllIllIlllIIlIIIIIlII.append((char)(llllllllllllllIllIlllIIlIIIIIlll ^ llllllllllllllIllIlllIIlIIIIIIll[llllllllllllllIllIlllIIlIIIIIIlI % llllllllllllllIllIlllIIlIIIIIIll.length]));
            0;
            ++llllllllllllllIllIlllIIlIIIIIIlI;
            ++llllllllllllllIllIlllIIIlllllIlI;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlllIIlIIIIIlII);
    }

    /*
     * WARNING - void declaration
     */
    private boolean h(int n2) {
        void llllllllllllllIllIlllIIlIIllIlIl;
        int[] nArray = v;
        int n3 = nArray.length;
        int llllllllllllllIllIlllIIlIIllIlII = lIlIIlIIlllll[0];
        while (d.lIlllIllIIIlIIl(llllllllllllllIllIlllIIlIIllIlII, (int)llllllllllllllIllIlllIIlIIllIlIl)) {
            void llllllllllllllIllIlllIIlIIllIlll;
            void llllllllllllllIllIlllIIlIIllIllI;
            void llllllllllllllIllIlllIIlIIllIIll = llllllllllllllIllIlllIIlIIllIllI[llllllllllllllIllIlllIIlIIllIlII];
            if (d.lIlllIllIIIlIII((int)llllllllllllllIllIlllIIlIIllIIll, (int)llllllllllllllIllIlllIIlIIllIlll)) {
                return lIlIIlIIlllll[1];
            }
            ++llllllllllllllIllIlllIIlIIllIlII;
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
            return ((0x2C ^ 0x35) & ~(0xA ^ 0x13)) != 0;
        }
        n3 = lIlIIlIIlllll[0];
        return n3 != 0;
    }

    private static String lIlllIlIllIIIlI(String llllllllllllllIllIlllIIlIIlIIIll, String llllllllllllllIllIlllIIlIIlIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIlIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlllll[11]), "DES");
            Cipher llllllllllllllIllIlllIIlIIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIlllIIlIIlIIlIl.init(lIlIIlIIlllll[2], llllllllllllllIllIlllIIlIIlIIllI);
            return new String(llllllllllllllIllIlllIIlIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIlIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIIlIIlIIlII) {
            llllllllllllllIllIlllIIlIIlIIlII.printStackTrace();
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

    private static String lIlllIlIllIIIll(String llllllllllllllIllIlllIIlIIIlIllI, String llllllllllllllIllIlllIIlIIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIlIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIIlIIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIIlIIIllIII.init(lIlIIlIIlllll[2], llllllllllllllIllIlllIIlIIIllIIl);
            return new String(llllllllllllllIllIlllIIlIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIIlIIIlIlll) {
            llllllllllllllIllIlllIIlIIIlIlll.printStackTrace();
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
        void llllllllllllllIllIlllIIlIlIllIlI;
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        Item llllllllllllllIllIlllIIlIlIllIII = (Item)((ItemQueryResults)Inventory.query().ids((int[])llllllllllllllIllIlllIIlIlIllIlI).results()).first();
        ItemQueryResults llllllllllllllIllIlllIIlIlIlIlll = (ItemQueryResults)Bank.query().ids((int[])llllllllllllllIllIlllIIlIlIllIlI).results();
        if (d.lIlllIllIIIIlII(llllllllllllllIllIlllIIlIlIllIII)) {
            void llllllllllllllIllIlllIIlIlIllIIl;
            if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIlIlll.isEmpty() ? 1 : 0)) {
                System.out.println("You do not have any of " + Arrays.toString((int[])llllllllllllllIllIlllIIlIlIllIlI));
                return lIlIIlIIlllll[0];
            }
            Bank.withdraw((int)((Item)llllllllllllllIllIlllIIlIlIlIlll.first()).getId(), (int)llllllllllllllIllIlllIIlIlIllIIl, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
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
        d llllllllllllllIllIlllIIlIlIlIIIl;
        if (d.lIlllIllIIIIIll(this.x.gamesNecklace() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[13]])) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIlIIIl.x.antiPoison() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> {
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
        nArray[d.lIlIIlIIlllll[0]] = llllllllllllllIllIlllIIlIlIlIIIl.x.foodID();
        if (d.lIlllIllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIlIIIl.x.slayerRing() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[10]])) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        b llllllllllllllIllIlllIIlIlIlIIII = llllllllllllllIllIlllIIlIlIlIIIl.w.b();
        if (d.lIlllIllIIIIllI((Object)llllllllllllllIllIlllIIlIlIlIIII)) {
            if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIlIIII.o() ? 1 : 0) && d.lIlllIllIIIIlIl(llllllllllllllIllIlllIIlIlIlIIIl.a(t) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
            if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIlIIII.q() ? 1 : 0) && d.lIlllIllIIIIlIl(llllllllllllllIllIlllIIlIlIlIIIl.a(u) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
            List<Integer> llllllllllllllIllIlllIIlIlIIllll = llllllllllllllIllIlllIIlIlIlIIII.p();
            if (d.lIlllIllIIIIllI(llllllllllllllIllIlllIIlIlIIllll)) {
                if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIIllll.contains(lIlIIlIIlllll[6]) ? 1 : 0)) {
                    return lIlIIlIIlllll[1];
                }
                Iterator<Integer> llllllllllllllIllIlllIIlIlIIlllI = llllllllllllllIllIlllIIlIlIIllll.iterator();
                while (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIIlllI.hasNext() ? 1 : 0)) {
                    int llllllllllllllIllIlllIIlIlIIllIl = llllllllllllllIllIlllIIlIlIIlllI.next();
                    if (d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIlIIIl.h(llllllllllllllIllIlllIIlIlIIllIl) ? 1 : 0) && d.lIlllIllIIIIIll(llllllllllllllIllIlllIIlIlIlIIIl.i(lIlIIlIIllllI[lIlIIlIIlllll[9]]) ? 1 : 0)) {
                        0;
                        if (((0x4A ^ 0x72) & ~(0xAC ^ 0x94)) == 0) continue;
                        return ((0x76 ^ 0x4D) & ~(0x81 ^ 0xBA)) != 0;
                    }
                    if (d.lIlllIllIIIIlIl(llllllllllllllIllIlllIIlIlIlIIIl.g(llllllllllllllIllIlllIIlIlIIllIl) ? 1 : 0)) {
                        return lIlIIlIIlllll[0];
                    }
                    0;
                    if (3 > ((0xE2 ^ 0xAC) & ~(0x7E ^ 0x30))) continue;
                    return ((0x84 ^ 0xB8) & ~(0x3C ^ 0)) != 0;
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
                    return ((0xD8 ^ 0x8B) & ~(0x18 ^ 0x4B)) != 0;
                }
            } else {
                bl = lIlIIlIIlllll[0];
            }
            return bl;
        }, n3);
    }
}

