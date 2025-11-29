/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.G;
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

@TaskDesc(name="Depositing birdhouse materials", priority=1001, blocking=true)
public class aF
extends Task {
    private final /* synthetic */ j cs;
    private static /* synthetic */ int[] llIIIIIllllI;
    private static /* synthetic */ String[] llIIIIIlllIl;
    private final /* synthetic */ SquireFarmer cq;
    private final /* synthetic */ SquireFarmerConfig cr;

    @Inject
    public aF(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        this.cq = squireFarmer;
        this.cr = squireFarmerConfig;
        this.cs = j2;
    }

    private static boolean llllIIlIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllIIIlllIlll(String lllllllllllllllIlIlIllIIllllIIll, String lllllllllllllllIlIlIllIIllllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIIllllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIllIIllllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIllIIllllIlIl.init(llIIIIIllllI[3], lllllllllllllllIlIlIllIIllllIllI);
            return new String(lllllllllllllllIlIlIllIIllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllIIllllIlII) {
            lllllllllllllllIlIlIllIIllllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIllllIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        aF lllllllllllllllIlIlIllIlIIIIlIIl;
        if (aF.llllIIIllllIlI(this.cr.birdhouses_enabled() ? 1 : 0)) {
            return llIIIIIllllI[0];
        }
        if (aF.llllIIIllllIll((Object)lllllllllllllllIlIlIllIlIIIIlIIl.cq.a(), (Object)o.BIRD_HOUSE) && aF.llllIIIlllllII((Object)lllllllllllllllIlIlIllIlIIIIlIIl.cs.O())) {
            return llIIIIIllllI[0];
        }
        if (aF.llllIIIllllIlI(Bank.isOpen() ? 1 : 0) && aF.llllIIIlllllIl((Object)lllllllllllllllIlIlIllIlIIIIlIIl.cq.a(), (Object)o.BIRD_HOUSE)) {
            return llIIIIIllllI[0];
        }
        int n2 = Inventory.contains(item -> Stream.of(G.values()).anyMatch(g2 -> {
            boolean bl;
            if (aF.llllIIIlllllll(g2.aA(), item.getId())) {
                bl = llIIIIIllllI[2];
                0;
                if ((0xAC ^ 0xA8) == 1) {
                    return ((0x9A ^ 0xC0) & ~(0x75 ^ 0x2F)) != 0;
                }
            } else {
                bl = llIIIIIllllI[0];
            }
            return bl;
        }));
        String[] stringArray = new String[llIIIIIllllI[1]];
        stringArray[aF.llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[0]];
        stringArray[aF.llIIIIIllllI[2]] = llIIIIIlllIl[llIIIIIllllI[2]];
        stringArray[aF.llIIIIIllllI[3]] = llIIIIIlllIl[llIIIIIllllI[3]];
        if (aF.llllIIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && aF.llllIIIllllIlI(n2)) {
            return llIIIIIllllI[0];
        }
        if (aF.llllIIIllllllI(Bank.isOpen() ? 1 : 0)) {
            if (aF.llllIIIllllllI(Inventory.contains(item -> Stream.of(G.values()).anyMatch(g2 -> {
                boolean bl;
                if (aF.llllIIIlllllll(g2.aA(), item.getId())) {
                    bl = llIIIIIllllI[2];
                    0;
                    if (2 <= 0) {
                        return ((0x4D ^ 0x44) & ~(0x94 ^ 0x9D)) != 0;
                    }
                } else {
                    bl = llIIIIIllllI[0];
                }
                return bl;
            })) ? 1 : 0)) {
                Bank.depositAll(item -> Stream.of(G.values()).anyMatch(g2 -> {
                    boolean bl;
                    if (aF.llllIIIlllllll(g2.aA(), item.getId())) {
                        bl = llIIIIIllllI[2];
                        0;
                        if (-1 >= ((1 + 94 - -82 + 43 ^ 37 + 41 - -61 + 12) & (0x51 ^ 0x7B ^ (0x28 ^ 0x49) ^ -1))) {
                            return ((80 + 42 - 99 + 111 ^ 88 + 98 - 69 + 41) & (0xD3 ^ 0xBA ^ (0x55 ^ 0x24) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIIllllI[0];
                    }
                    return bl;
                }));
                return llIIIIIllllI[2];
            }
            String[] stringArray2 = new String[llIIIIIllllI[2]];
            stringArray2[aF.llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[1]];
            if (aF.llllIIIllllllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIIIIllllI[2]];
                stringArray3[aF.llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[4]];
                Bank.depositAll((String[])stringArray3);
                return llIIIIIllllI[2];
            }
            String[] stringArray4 = new String[llIIIIIllllI[2]];
            stringArray4[aF.llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[5]];
            if (aF.llllIIIllllllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                String[] stringArray5 = new String[llIIIIIllllI[2]];
                stringArray5[aF.llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[6]];
                Bank.depositAll((String[])stringArray5);
                return llIIIIIllllI[2];
            }
            String[] stringArray6 = new String[llIIIIIllllI[2]];
            stringArray6[aF.llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[7]];
            if (aF.llllIIIllllllI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                String[] stringArray7 = new String[llIIIIIllllI[3]];
                stringArray7[aF.llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[8]];
                stringArray7[aF.llIIIIIllllI[2]] = llIIIIIlllIl[llIIIIIllllI[9]];
                Bank.depositAll((String[])stringArray7);
                return llIIIIIllllI[2];
            }
            return llIIIIIllllI[0];
        }
        if (aF.llllIIIllllllI(Bank.open() ? 1 : 0)) {
            return llIIIIIllllI[2];
        }
        BankLocation bankLocation = BankLocation.getNearestCommon();
        Movement.walkTo((BankLocation)bankLocation);
        0;
        return llIIIIIllllI[2];
    }

    private static void llllIIIllllIIl() {
        llIIIIIllllI = new int[11];
        aF.llIIIIIllllI[0] = (0xBB ^ 0x84) & ~(0x63 ^ 0x5C);
        aF.llIIIIIllllI[1] = 3;
        aF.llIIIIIllllI[2] = 1;
        aF.llIIIIIllllI[3] = 2;
        aF.llIIIIIllllI[4] = 0x1C ^ 0x56 ^ (0xF4 ^ 0xBA);
        aF.llIIIIIllllI[5] = 0x50 ^ 0x3A ^ (0xDB ^ 0xB4);
        aF.llIIIIIllllI[6] = 0xAC ^ 0xAB ^ 1;
        aF.llIIIIIllllI[7] = 41 + 155 - 144 + 122 ^ 72 + 100 - 38 + 35;
        aF.llIIIIIllllI[8] = 0x66 ^ 0x6E;
        aF.llIIIIIllllI[9] = 0xCD ^ 0xC4;
        aF.llIIIIIllllI[10] = 0x95 ^ 0x9F;
    }

    private static boolean llllIIIlllllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIIIllllllI(int n2) {
        return n2 != 0;
    }

    private static void llllIIIllllIII() {
        llIIIIIlllIl = new String[llIIIIIllllI[10]];
        aF.llIIIIIlllIl[aF.llIIIIIllllI[0]] = aF."Bird nest";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[2]] = aF."Hammer";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[3]] = aF."Chisel";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[1]] = aF."Hammer";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[4]] = aF."Hammer";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[5]] = aF."Chisel";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[6]] = aF."Chisel";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[7]] = aF."Bird nest";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[8]] = aF."Feather";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[9]] = aF."Bird nest";
    }

    private static boolean llllIIIlllllII(Object object) {
        return object != null;
    }

    private static String llllIIIlllIlIl(String lllllllllllllllIlIlIllIIllIllllI, String lllllllllllllllIlIlIllIIlllIIIlI) {
        lllllllllllllllIlIlIllIIllIllllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIllIIlllIIIIl = new StringBuilder();
        char[] lllllllllllllllIlIlIllIIlllIIIII = lllllllllllllllIlIlIllIIlllIIIlI.toCharArray();
        int lllllllllllllllIlIlIllIIllIlllll = llIIIIIllllI[0];
        char[] lllllllllllllllIlIlIllIIllIllIIl = lllllllllllllllIlIlIllIIllIllllI.toCharArray();
        int lllllllllllllllIlIlIllIIllIllIII = lllllllllllllllIlIlIllIIllIllIIl.length;
        int lllllllllllllllIlIlIllIIllIlIlll = llIIIIIllllI[0];
        while (aF.llllIIlIIIIIII(lllllllllllllllIlIlIllIIllIlIlll, lllllllllllllllIlIlIllIIllIllIII)) {
            char lllllllllllllllIlIlIllIIlllIIlII = lllllllllllllllIlIlIllIIllIllIIl[lllllllllllllllIlIlIllIIllIlIlll];
            lllllllllllllllIlIlIllIIlllIIIIl.append((char)(lllllllllllllllIlIlIllIIlllIIlII ^ lllllllllllllllIlIlIllIIlllIIIII[lllllllllllllllIlIlIllIIllIlllll % lllllllllllllllIlIlIllIIlllIIIII.length]));
            0;
            ++lllllllllllllllIlIlIllIIllIlllll;
            ++lllllllllllllllIlIlIllIIllIlIlll;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIllIIlllIIIIl);
    }

    private static boolean llllIIIlllllll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        aF.llllIIIllllIIl();
        aF.llllIIIllllIII();
    }

    private static boolean llllIIIllllIll(Object object, Object object2) {
        return object == object2;
    }

    private static String llllIIIlllIllI(String lllllllllllllllIlIlIllIIllIIllII, String lllllllllllllllIlIlIllIIllIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIllIIlIll.getBytes(StandardCharsets.UTF_8)), llIIIIIllllI[8]), "DES");
            Cipher lllllllllllllllIlIlIllIIllIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllIIllIlIIII.init(llIIIIIllllI[3], lllllllllllllllIlIlIllIIllIlIIIl);
            return new String(lllllllllllllllIlIlIllIIllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllIIllIIllll) {
            lllllllllllllllIlIlIllIIllIIllll.printStackTrace();
            return null;
        }
    }
}

