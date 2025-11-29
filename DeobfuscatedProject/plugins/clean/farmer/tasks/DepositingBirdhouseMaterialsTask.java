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
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum14;
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
public class DepositingBirdhouseMaterialsTask
extends Task {
    private final  j cs;

    private final  SquireFarmer cq;
    private final  SquireFarmerConfig cr;

    @Inject
    public DepositingBirdhouseMaterialsTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        this.cq = squireFarmer;
        this.cr = squireFarmerConfig;
        this.cs = j2;
    }

    private static boolean llllIIlIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIIIllllIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        aF var1;
        if (aF.llllIIIllllIlI(this.cr.birdhouses_enabled() ? 1 : 0)) {
            return llIIIIIllllI[0];
        }
        if (aF.llllIIIllllIll((Object)var1.cq.a(), (Object)o.BIRD_HOUSE) && aF.llllIIIlllllII((Object)var1.cs.O())) {
            return llIIIIIllllI[0];
        }
        if (aF.llllIIIllllIlI(Bank.isOpen() ? 1 : 0) && aF.llllIIIlllllIl((Object)var1.cq.a(), (Object)o.BIRD_HOUSE)) {
            return llIIIIIllllI[0];
        }
        int n2 = Inventory.contains(item -> Stream.of(G.values()).anyMatch(g2 -> {
            boolean bl;
            if (aF.llllIIIlllllll(g2.aA(), item.getId())) {
                bl = llIIIIIllllI[2];

                if ((0xAC ^ 0xA8) == 1) {
                    return false;
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

                    if (2 <= 0) {
                        return false;
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

        return llIIIIIllllI[2];
    }

    private static boolean llllIIIlllllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIIIllllllI(int n2) {
        return n2 != 0;
    }

    private static void llllIIIllllIII() {
        llIIIIIlllIl = new String[llIIIIIllllI[10]];
        aF.llIIIIIlllIl[aF.llIIIIIllllI[0]] = "Bird nest";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[2]] = "Hammer";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[3]] = "Chisel";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[1]] = "Hammer";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[4]] = "Hammer";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[5]] = "Chisel";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[6]] = "Chisel";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[7]] = "Bird nest";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[8]] = "Feather";
        aF.llIIIIIlllIl[aF.llIIIIIllllI[9]] = "Bird nest";
    }

    private static boolean llllIIIlllllII(Object object) {
        return object != null;
    }

        return String.valueOf(var2);
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

}

