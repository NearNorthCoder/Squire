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
import gg.squire.farmer.tasks.GameEnum8;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.stream.Stream;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        aF var9;
        if ((this.cr.birdhouses_enabled( == 0) ? 1 : 0)) {
            return 0;
        }
        if (((Object)var9.cq.a() == (Object)var9.cq.a()2)o.BIRD_HOUSE) && (Object != nulllllllllllllllllIlIlIllIlIIIIlIIl.cs.O())) {
            return 0;
        }
        if ((Bank.isOpen( == 0) ? 1 : 0) && ((Object)var9.cq.a() != (Object)var9.cq.a()2)o.BIRD_HOUSE)) {
            return 0;
        }
        int n2 = Inventory.contains(item -> Stream.of(G.values()).anyMatch(g2 -> {
            boolean bl;
            if ((g2.aA() == item.getId())) {
                bl = 2;
                0;
                if ((0xAC ^ 0xA8) == 1) {
                    return ((0x9A ^ 0xC0) & ~(0x75 ^ 0x2F)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }));
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        stringArray[2] = var2[2];
        stringArray[3] = var2[3];
        if ((Inventory.contains((String[] == 0)stringArray) ? 1 : 0) && (n2 == 0)) {
            return 0;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            if ((Inventory.contains(item -> Stream.of(G.values( != 0)).anyMatch(g2 -> {
                boolean bl;
                if ((g2.aA() == item.getId())) {
                    bl = 2;
                    0;
                    if (2 <= 0) {
                        return ((0x4D ^ 0x44) & ~(0x94 ^ 0x9D)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            })) ? 1 : 0)) {
                Bank.depositAll(item -> Stream.of(G.values()).anyMatch(g2 -> {
                    boolean bl;
                    if ((g2.aA() == item.getId())) {
                        bl = 2;
                        0;
                        if (-1 >= ((1 + 94 - -82 + 43 ^ 37 + 41 - -61 + 12) & (0x51 ^ 0x7B ^ (0x28 ^ 0x49) ^ -1))) {
                            return ((80 + 42 - 99 + 111 ^ 88 + 98 - 69 + 41) & (0xD3 ^ 0xBA ^ (0x55 ^ 0x24) ^ -1)) != 0;
                        }
                    } else {
                        bl = 0;
                    }
                    return bl;
                }));
                return 2;
            }
            String[] stringArray2 = new String[2];
            stringArray2[0] = var2[1];
            if ((Inventory.contains((String[] != 0)stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[2];
                stringArray3[0] = var2[4];
                Bank.depositAll((String[])stringArray3);
                return 2;
            }
            String[] stringArray4 = new String[2];
            stringArray4[0] = var2[5];
            if ((Inventory.contains((String[] != 0)stringArray4) ? 1 : 0)) {
                String[] stringArray5 = new String[2];
                stringArray5[0] = var2[6];
                Bank.depositAll((String[])stringArray5);
                return 2;
            }
            String[] stringArray6 = new String[2];
            stringArray6[0] = var2[7];
            if ((Inventory.contains((String[] != 0)stringArray6) ? 1 : 0)) {
                String[] stringArray7 = new String[3];
                stringArray7[0] = var2[8];
                stringArray7[2] = var2[9];
                Bank.depositAll((String[])stringArray7);
                return 2;
            }
            return 0;
        }
        if ((Bank.open( != 0) ? 1 : 0)) {
            return 2;
        }
        BankLocation bankLocation = BankLocation.getNearestCommon();
        Movement.walkTo((BankLocation)bankLocation);
        0;
        return 2;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }
}

