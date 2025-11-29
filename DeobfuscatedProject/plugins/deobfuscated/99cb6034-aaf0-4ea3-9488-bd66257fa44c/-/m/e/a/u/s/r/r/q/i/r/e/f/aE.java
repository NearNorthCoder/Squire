/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.C;
import -.m.e.a.u.s.r.r.q.i.r.e.f.G;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j;
import -.m.e.a.u.s.r.r.q.i.r.e.f.o;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking for birdhouse stuff", priority=10, blocking=true)
public class aE
extends Task {
    private static /* synthetic */ int[] lIlllIIllIIl;
    protected final /* synthetic */ SquireFarmerConfig co;
    protected final /* synthetic */ j cn;
    private final /* synthetic */ SquireFarmer cp;
    private static /* synthetic */ String[] lIlllIIlIlII;

    private static boolean lllIlIllllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIlIlllIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlIlllIllII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIlIlllIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bt() {
        void lllllllllllllllIlIllIlllIIIIllIl;
        au[] auArray = au.values();
        int n2 = auArray.length;
        int lllllllllllllllIlIllIlllIIIIllII = lIlllIIllIIl[0];
        while (aE.lllIlIllllIIII(lllllllllllllllIlIllIlllIIIIllII, (int)lllllllllllllllIlIllIlllIIIIllIl)) {
            void lllllllllllllllIlIllIlllIIIIlllI;
            void lllllllllllllllIlIllIlllIIIIlIll = lllllllllllllllIlIllIlllIIIIlllI[lllllllllllllllIlIllIlllIIIIllII];
            int[] nArray = new int[lIlllIIllIIl[1]];
            nArray[aE.lIlllIIllIIl[0]] = lllllllllllllllIlIllIlllIIIIlIll.au();
            nArray[aE.lIlllIIllIIl[3]] = lllllllllllllllIlIllIlllIIIIlIll.au() + lIlllIIllIIl[3];
            if (aE.lllIlIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlllIIllIIl[1]];
                nArray2[aE.lIlllIIllIIl[0]] = lllllllllllllllIlIllIlllIIIIlIll.au();
                nArray2[aE.lIlllIIllIIl[3]] = lllllllllllllllIlIllIlllIIIIlIll.au() + lIlllIIllIIl[3];
                Bank.depositAll((int[])nArray2);
                return lIlllIIllIIl[3];
            }
            ++lllllllllllllllIlIllIlllIIIIllII;
            0;
            if (-(0x66 ^ 0x6A ^ (0xD ^ 5)) < 0) continue;
            return ((160 + 118 - 153 + 75 ^ 39 + 150 - 109 + 72) & (0x66 ^ 0x79 ^ (1 ^ 0x4E) ^ -1)) != 0;
        }
        return lIlllIIllIIl[0];
    }

    static {
        aE.lllIlIlllIlIlI();
        aE.lllIlIllIllllI();
    }

    private static void lllIlIlllIlIlI() {
        lIlllIIllIIl = new int[7];
        aE.lIlllIIllIIl[0] = (0xCE ^ 0x8B) & ~(0xF9 ^ 0xBC);
        aE.lIlllIIllIIl[1] = 2;
        aE.lIlllIIllIIl[2] = 0xFFFFA7DB & 0x5EFF;
        aE.lIlllIIllIIl[3] = 1;
        aE.lIlllIIllIIl[4] = -(0xFFFFFBB7 & 0x44DD) & (0xFFFFEDFF & 0x5BBF);
        aE.lIlllIIllIIl[5] = 3;
        aE.lIlllIIllIIl[6] = 0x69 ^ 0x73 ^ (0x9E ^ 0x8C);
    }

    private static boolean lllIlIlllIllll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        aE lllllllllllllllIlIllIlllIIIlIlIl;
        if (aE.lllIlIlllIlIll(this.co.birdhouses_enabled() ? 1 : 0)) {
            return lIlllIIllIIl[0];
        }
        if (aE.lllIlIlllIllII((Object)lllllllllllllllIlIllIlllIIIlIlIl.cp.a(), (Object)o.BIRD_HOUSE)) {
            return lIlllIIllIIl[0];
        }
        if (aE.lllIlIlllIllIl((Object)lllllllllllllllIlIllIlllIIIlIlIl.cn.O())) {
            return lIlllIIllIIl[0];
        }
        int n2 = Stream.of(av.values()).anyMatch(av2 -> {
            int[] nArray = new int[lIlllIIllIIl[3]];
            nArray[aE.lIlllIIllIIl[0]] = av2.aA();
            return Inventory.contains((int[])nArray);
        });
        if (aE.lllIlIlllIlIll(lllllllllllllllIlIllIlllIIIlIlIl.cn.N())) {
            int[] nArray = new int[lIlllIIllIIl[1]];
            nArray[aE.lIlllIIllIIl[0]] = lIlllIIllIIl[2];
            nArray[aE.lIlllIIllIIl[3]] = lIlllIIllIIl[4];
            if (aE.lllIlIlllIlllI(Inventory.getCount((int[])nArray), lIlllIIllIIl[1]) && aE.lllIlIlllIllll(Inventory.contains(item -> Stream.of(G.values()).anyMatch(g2 -> {
                boolean bl;
                if (aE.lllIlIllllIIlI(g2.aA(), item.getId())) {
                    bl = lIlllIIllIIl[3];
                    0;
                    if (((19 + 40 - -109 + 15 ^ 108 + 95 - 45 + 20) & (0x30 ^ 0x47 ^ (0x1D ^ 0x6F) ^ -1)) > 2) {
                        return ((0xE ^ 0x5B ^ (0x74 ^ 0x40)) & (0xBD ^ 0xAC ^ (2 ^ 0x72) ^ -1)) != 0;
                    }
                } else {
                    bl = lIlllIIllIIl[0];
                }
                return bl;
            })) ? 1 : 0) && aE.lllIlIlllIlIll(n2)) {
                return lIlllIIllIIl[0];
            }
        }
        if (aE.lllIlIlllIllll(Bank.isOpen() ? 1 : 0)) {
            if (aE.lllIlIlllIllll(lllllllllllllllIlIllIlllIIIlIlIl.bt() ? 1 : 0)) {
                return lIlllIIllIIl[3];
            }
            if (aE.lllIlIlllIllll(n2)) {
                Bank.depositAll(item -> Stream.of(av.values()).anyMatch(av2 -> {
                    boolean bl;
                    if (aE.lllIlIllllIIlI(item.getId(), av2.aA())) {
                        bl = lIlllIIllIIl[3];
                        0;
                        if (3 <= 0) {
                            return ((0x1F ^ 0x58) & ~(0x83 ^ 0xC4)) != 0;
                        }
                    } else {
                        bl = lIlllIIllIIl[0];
                    }
                    return bl;
                }));
                return lIlllIIllIIl[3];
            }
            String[] stringArray = new String[lIlllIIllIIl[3]];
            stringArray[aE.lIlllIIllIIl[0]] = lIlllIIlIlII[lIlllIIllIIl[0]];
            if (aE.lllIlIlllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIlllIIllIIl[1]];
                stringArray2[aE.lIlllIIllIIl[0]] = lIlllIIlIlII[lIlllIIllIIl[3]];
                stringArray2[aE.lIlllIIllIIl[3]] = lIlllIIlIlII[lIlllIIllIIl[1]];
                Bank.depositAll((String[])stringArray2);
                return lIlllIIllIIl[3];
            }
            if (aE.lllIlIlllIlIll(Inventory.contains(item -> Stream.of(G.values()).anyMatch(g2 -> {
                boolean bl;
                if (aE.lllIlIllllIIlI(g2.aA(), item.getId())) {
                    bl = lIlllIIllIIl[3];
                    0;
                    if (((0x5D ^ 0x42 ^ (0x46 ^ 0x5D)) & (117 + 48 - 107 + 70 ^ 118 + 7 - 43 + 50 ^ -1)) < 0) {
                        return ((59 + 88 - 102 + 127 ^ 10 + 42 - -41 + 63) & (0x31 ^ 0x74 ^ (0xDB ^ 0xAE) ^ -1)) != 0;
                    }
                } else {
                    bl = lIlllIIllIIl[0];
                }
                return bl;
            })) ? 1 : 0)) {
                Bank.withdrawAll(item -> Stream.of(G.values()).anyMatch(g2 -> {
                    boolean bl;
                    if (aE.lllIlIllllIIlI(g2.aA(), item.getId())) {
                        bl = lIlllIIllIIl[3];
                        0;
                        if (null != null) {
                            return ((11 + 56 - -52 + 90 ^ 54 + 130 - 121 + 68) & (0x87 ^ 0xB8 ^ (0x47 ^ 0x2A) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlllIIllIIl[0];
                    }
                    return bl;
                }), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIlllIIllIIl[3];
            }
            int[] nArray = new int[lIlllIIllIIl[3]];
            nArray[aE.lIlllIIllIIl[0]] = lIlllIIllIIl[2];
            if (aE.lllIlIlllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Bank.withdraw((int)lIlllIIllIIl[2], (int)lIlllIIllIIl[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                0;
                if (3 < ((0xF ^ 0x23) & ~(0x34 ^ 0x18))) {
                    return ((0x28 ^ 0x66) & ~(0xFE ^ 0xB0)) != 0;
                }
            } else {
                int[] nArray2 = new int[lIlllIIllIIl[3]];
                nArray2[aE.lIlllIIllIIl[0]] = lIlllIIllIIl[4];
                if (aE.lllIlIlllIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((int)lIlllIIllIIl[4], (int)lIlllIIllIIl[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    0;
                    if (2 != 2) {
                        return ((0x61 ^ 0x6D ^ (0x6B ^ 0x5E)) & (0x29 ^ 0x4E ^ (0x5B ^ 5) ^ -1)) != 0;
                    }
                } else {
                    C lllllllllllllllIlIllIlllIIIlIIll = lllllllllllllllIlIllIlllIIIlIlIl.co.birdhouse_type();
                    Bank.withdraw(item -> {
                        boolean bl;
                        if (!aE.lllIlIllllIIIl(item.getId(), lllllllllllllllIlIllIlllIIIlIIll.au()) || aE.lllIlIllllIIlI(item.getId(), lllllllllllllllIlIllIlllIIIlIIll.av())) {
                            bl = lIlllIIllIIl[3];
                            0;
                            if (((0x33 ^ 0x27) & ~(0xB9 ^ 0xAD)) > 3) {
                                return ((0xAB ^ 0xA5) & ~(0x3F ^ 0x31)) != 0;
                            }
                        } else {
                            bl = lIlllIIllIIl[0];
                        }
                        return bl;
                    }, (int)lllllllllllllllIlIllIlllIIIlIlIl.cn.N(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                }
            }
            return lIlllIIllIIl[3];
        }
        if (aE.lllIlIlllIllll(Bank.open() ? 1 : 0)) {
            return lIlllIIllIIl[3];
        }
        BankLocation bankLocation = BankLocation.getNearestCommon();
        Movement.walkTo((BankLocation)bankLocation);
        0;
        return lIlllIIllIIl[3];
    }

    private static boolean lllIlIlllIllIl(Object object) {
        return object == null;
    }

    private static String lllIlIllIllIll(String lllllllllllllllIlIllIllIllIllIlI, String lllllllllllllllIlIllIllIllIllllI) {
        lllllllllllllllIlIllIllIllIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIllIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIllIllIlllIl = new StringBuilder();
        char[] lllllllllllllllIlIllIllIllIlllII = lllllllllllllllIlIllIllIllIllllI.toCharArray();
        int lllllllllllllllIlIllIllIllIllIll = lIlllIIllIIl[0];
        char[] lllllllllllllllIlIllIllIllIlIlIl = lllllllllllllllIlIllIllIllIllIlI.toCharArray();
        int lllllllllllllllIlIllIllIllIlIlII = lllllllllllllllIlIllIllIllIlIlIl.length;
        int lllllllllllllllIlIllIllIllIlIIll = lIlllIIllIIl[0];
        while (aE.lllIlIllllIIII(lllllllllllllllIlIllIllIllIlIIll, lllllllllllllllIlIllIllIllIlIlII)) {
            char lllllllllllllllIlIllIllIlllIIIII = lllllllllllllllIlIllIllIllIlIlIl[lllllllllllllllIlIllIllIllIlIIll];
            lllllllllllllllIlIllIllIllIlllIl.append((char)(lllllllllllllllIlIllIllIlllIIIII ^ lllllllllllllllIlIllIllIllIlllII[lllllllllllllllIlIllIllIllIllIll % lllllllllllllllIlIllIllIllIlllII.length]));
            0;
            ++lllllllllllllllIlIllIllIllIllIll;
            ++lllllllllllllllIlIllIllIllIlIIll;
            0;
            if (3 != (131 + 123 - 174 + 54 ^ 27 + 49 - 16 + 70)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIllIllIlllIl);
    }

    private static String lllIlIllIlllIl(String lllllllllllllllIlIllIllIllIIlIlI, String lllllllllllllllIlIllIllIllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIllIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIllIllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIllIllIIllII.init(lIlllIIllIIl[1], lllllllllllllllIlIllIllIllIIllIl);
            return new String(lllllllllllllllIlIllIllIllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIllIllIIlIll) {
            lllllllllllllllIlIllIllIllIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public aE(SquireFarmer squireFarmer, j j2, SquireFarmerConfig squireFarmerConfig) {
        this.cp = squireFarmer;
        this.cn = j2;
        this.co = squireFarmerConfig;
    }

    private static void lllIlIllIllllI() {
        lIlllIIlIlII = new String[lIlllIIllIIl[5]];
        aE.lIlllIIlIlII[aE.lIlllIIllIIl[0]] = aE."Bird nest";
        aE.lIlllIIlIlII[aE.lIlllIIllIIl[3]] = aE."Feather";
        aE.lIlllIIlIlII[aE.lIlllIIllIIl[1]] = aE."Bird nest";
    }

    private static String lllIlIllIlllII(String lllllllllllllllIlIllIllIlllIllll, String lllllllllllllllIlIllIllIlllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllIllIllllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllIlllIlllI.getBytes(StandardCharsets.UTF_8)), lIlllIIllIIl[6]), "DES");
            Cipher lllllllllllllllIlIllIllIllllIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllIllIllllIIIl.init(lIlllIIllIIl[1], lllllllllllllllIlIllIllIllllIIlI);
            return new String(lllllllllllllllIlIllIllIllllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIllIllllIIII) {
            lllllllllllllllIlIllIllIllllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllllIIlI(int n2, int n3) {
        return n2 == n3;
    }
}

