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
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum21;
import gg.squire.farmer.tasks.GameEnum;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum2;
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

@TaskDesc(name="Banking for birdhouse stuff", priority=10, blocking=true)
public class BankingForBirdhouseStuffTask
extends Task {
    
    protected final  SquireFarmerConfig co;
    protected final  j cn;
    private final  SquireFarmer cp;

    /*
     * WARNING - void declaration
     */
    private boolean bt() {
        void var3;
        au[] auArray = au.values();
        int n2 = auArray.length;
        int var4 = 0;
        while ((var4 < (int)var3)) {
            void var5;
            void var6 = var5[var4];
            int[] nArray = new int[1];
            nArray[0] = var6.au();
            nArray[3] = var6.au() + 3;
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                int[] nArray2 = new int[1];
                nArray2[0] = var6.au();
                nArray2[3] = var6.au() + 3;
                Bank.depositAll((int[])nArray2);
                return 3;
            }
            ++var4;
            0;
            if (-(0x66 ^ 0x6A ^ (0xD ^ 5)) < 0) continue;
            return ((160 + 118 - 153 + 75 ^ 39 + 150 - 109 + 72) & (0x66 ^ 0x79 ^ (1 ^ 0x4E) ^ -1)) != 0;
        }
        return 0;
    }

    public boolean run() {
        aE var7;
        if ((this.co.birdhouses_enabled( == 0) ? 1 : 0)) {
            return 0;
        }
        if (((Object)var7.cp.a() != (Object)var7.cp.a()2)o.BIRD_HOUSE)) {
            return 0;
        }
        if ((Object == nulllllllllllllllllIlIllIlllIIIlIlIl.cn.O())) {
            return 0;
        }
        int n2 = Stream.of(av.values()).anyMatch(av2 -> {
            int[] nArray = new int[3];
            nArray[0] = av2.aA();
            return Inventory.contains((int[])nArray);
        });
        if ((var7.cn.N( == 0))) {
            int[] nArray = new int[1];
            nArray[0] = 2;
            nArray[3] = 4;
            if ((Inventory.getCount((int[])nArray) >= 1) && (Inventory.contains(item -> Stream.of(G.values( != 0)).anyMatch(g2 -> {
                boolean bl;
                if ((g2.aA() == item.getId())) {
                    bl = 3;
                    0;
                    if (((19 + 40 - -109 + 15 ^ 108 + 95 - 45 + 20) & (0x30 ^ 0x47 ^ (0x1D ^ 0x6F) ^ -1)) > 2) {
                        return ((0xE ^ 0x5B ^ (0x74 ^ 0x40)) & (0xBD ^ 0xAC ^ (2 ^ 0x72) ^ -1)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            })) ? 1 : 0) && (n2 == 0)) {
                return 0;
            }
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            if ((var7.bt( != 0) ? 1 : 0)) {
                return 3;
            }
            if n2 {
                Bank.depositAll(item -> Stream.of(av.values()).anyMatch(av2 -> {
                    boolean bl;
                    if ((item.getId() == av2.aA())) {
                        bl = 3;
                        0;
                        if (3 <= 0) {
                            return ((0x1F ^ 0x58) & ~(0x83 ^ 0xC4)) != 0;
                        }
                    } else {
                        bl = 0;
                    }
                    return bl;
                }));
                return 3;
            }
            String[] stringArray = new String[3];
            stringArray[0] = var2[0];
            if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[1];
                stringArray2[0] = var2[3];
                stringArray2[3] = var2[1];
                Bank.depositAll((String[])stringArray2);
                return 3;
            }
            if ((Inventory.contains(item -> Stream.of(G.values( == 0)).anyMatch(g2 -> {
                boolean bl;
                if ((g2.aA() == item.getId())) {
                    bl = 3;
                    0;
                    if (((0x5D ^ 0x42 ^ (0x46 ^ 0x5D)) & (117 + 48 - 107 + 70 ^ 118 + 7 - 43 + 50 ^ -1)) < 0) {
                        return ((59 + 88 - 102 + 127 ^ 10 + 42 - -41 + 63) & (0x31 ^ 0x74 ^ (0xDB ^ 0xAE) ^ -1)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            })) ? 1 : 0)) {
                Bank.withdrawAll(item -> Stream.of(G.values()).anyMatch(g2 -> {
                    boolean bl;
                    if ((g2.aA() == item.getId())) {
                        bl = 3;
                        0;
                        if null != null {
                            return ((11 + 56 - -52 + 90 ^ 54 + 130 - 121 + 68) & (0x87 ^ 0xB8 ^ (0x47 ^ 0x2A) ^ -1)) != 0;
                        }
                    } else {
                        bl = 0;
                    }
                    return bl;
                }), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return 3;
            }
            int[] nArray = new int[3];
            nArray[0] = 2;
            if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
                Bank.withdraw((int)2, (int)3, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                0;
                if (3 < ((0xF ^ 0x23) & ~(0x34 ^ 0x18))) {
                    return ((0x28 ^ 0x66) & ~(0xFE ^ 0xB0)) != 0;
                }
            } else {
                int[] nArray2 = new int[3];
                nArray2[0] = 4;
                if ((Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) {
                    Bank.withdraw((int)4, (int)3, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    0;
                    if (2 != 2) {
                        return ((0x61 ^ 0x6D ^ (0x6B ^ 0x5E)) & (0x29 ^ 0x4E ^ (0x5B ^ 5) ^ -1)) != 0;
                    }
                } else {
                    C var8 = var7.co.birdhouse_type();
                    Bank.withdraw(item -> {
                        boolean bl;
                        if (!(item.getId() != var8.au()) || (item.getId() == var8.av())) {
                            bl = 3;
                            0;
                            if (((0x33 ^ 0x27) & ~(0xB9 ^ 0xAD)) > 3) {
                                return ((0xAB ^ 0xA5) & ~(0x3F ^ 0x31)) != 0;
                            }
                        } else {
                            bl = 0;
                        }
                        return bl;
                    }, (int)var7.cn.N(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                }
            }
            return 3;
        }
        if ((Bank.open( != 0) ? 1 : 0)) {
            return 3;
        }
        BankLocation bankLocation = BankLocation.getNearestCommon();
        Movement.walkTo((BankLocation)bankLocation);
        0;
        return 3;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (3 != (131 + 123 - 174 + 54 ^ 27 + 49 - 16 + 70)) continue;
            return null;
        }
        return String.valueOf(var12);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    @Inject
    public BankingForBirdhouseStuffTask(SquireFarmer squireFarmer, j j2, SquireFarmerConfig squireFarmerConfig) {
        this.cp = squireFarmer;
        this.cn = j2;
        this.co = squireFarmerConfig;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

}

