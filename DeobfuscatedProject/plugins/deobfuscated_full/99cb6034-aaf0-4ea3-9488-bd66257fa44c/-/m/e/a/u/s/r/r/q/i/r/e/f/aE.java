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

/* TASK: Banking for birdhouse stuff -> BankingforbirdhousestuffTask */
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
        void var11;
        au[] auArray = au.values();
        int n2 = auArray.length;
        int var13 = lIlllIIllIIl[0];
        while (aE.lllIlIllllIIII(var13, (int)var11)) {
            void var18;
            void var12 = var18[var13];
            int[] nArray = new int[lIlllIIllIIl[1]];
            nArray[aE.lIlllIIllIIl[0]] = var12.au();
            nArray[aE.lIlllIIllIIl[3]] = var12.au() + lIlllIIllIIl[3];
            if (aE.lllIlIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlllIIllIIl[1]];
                nArray2[aE.lIlllIIllIIl[0]] = var12.au();
                nArray2[aE.lIlllIIllIIl[3]] = var12.au() + lIlllIIllIIl[3];
                Bank.depositAll((int[])nArray2);
                return lIlllIIllIIl[3];
            }
            ++var13;
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
        aE var17;
        if (aE.lllIlIlllIlIll(this.co.birdhouses_enabled() ? 1 : 0)) {
            return lIlllIIllIIl[0];
        }
        if (aE.lllIlIlllIllII((Object)var17.cp.a(), (Object)o.BIRD_HOUSE)) {
            return lIlllIIllIIl[0];
        }
        if (aE.lllIlIlllIllIl((Object)var17.cn.O())) {
            return lIlllIIllIIl[0];
        }
        int n2 = Stream.of(av.values()).anyMatch(av2 -> {
            int[] nArray = new int[lIlllIIllIIl[3]];
            nArray[aE.lIlllIIllIIl[0]] = av2.aA();
            return Inventory.contains((int[])nArray);
        });
        if (aE.lllIlIlllIlIll(var17.cn.N())) {
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
            if (aE.lllIlIlllIllll(var17.bt() ? 1 : 0)) {
                return lIlllIIllIIl[3];
            }
            if (aE.lllIlIlllIllll(n2)) {
                Bank.depositAll(item -> Stream.of(av.values()).anyMatch(av2 -> {
                    boolean bl;
                    if (aE.lllIlIllllIIlI(item.getId(), av2.aA())) {
                        bl = lIlllIIllIIl[3];
                        0;
                        if (3 <= 0) {
                            return false;
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
                    return false;
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
                    C var4 = var17.co.birdhouse_type();
                    Bank.withdraw(item -> {
                        boolean bl;
                        if (!aE.lllIlIllllIIIl(item.getId(), var4.au()) || aE.lllIlIllllIIlI(item.getId(), var4.av())) {
                            bl = lIlllIIllIIl[3];
                            0;
                            if (((0x33 ^ 0x27) & ~(0xB9 ^ 0xAD)) > 3) {
                                return false;
                            }
                        } else {
                            bl = lIlllIIllIIl[0];
                        }
                        return bl;
                    }, (int)var17.cn.N(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
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

    private static String lllIlIllIllIll(String var10, String var1) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var20 = var1.toCharArray();
        int var9 = lIlllIIllIIl[0];
        char[] var21 = var10.toCharArray();
        int var22 = var21.length;
        int var16 = lIlllIIllIIl[0];
        while (aE.lllIlIllllIIII(var16, var22)) {
            char var14 = var21[var16];
            var23.append((char)(var14 ^ var20[var9 % var20.length]));
            0;
            ++var9;
            ++var16;
            0;
            if (3 != (131 + 123 - 174 + 54 ^ 27 + 49 - 16 + 70)) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static String lllIlIllIlllIl(String var3, String var19) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIlllIIllIIl[1], var7);
            return new String(var8.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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

    private static String lllIlIllIlllII(String var5, String var2) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlllIIllIIl[6]), "DES");
            Cipher var25 = Cipher.getInstance("DES");
            var25.init(lIlllIIllIIl[1], var6);
            return new String(var25.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllllIIlI(int n2, int n3) {
        return n2 == n3;
    }
}

