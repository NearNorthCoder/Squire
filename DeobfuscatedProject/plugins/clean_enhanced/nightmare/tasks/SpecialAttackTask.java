/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.time.Duration;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.AttackingNightmareTask;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Special Attack", priority=6, blocking=true)
public class SpecialAttackTask
extends AttackingNightmareTask {
    
    private static final  Logger ee;

    private static boolean var3(Object object) {
        return object == null;
    }

    private int cB() {
        int n2 = this.cq().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(var1[1]).getIntValue(n2);
        return n3 / var1[9];
    }

    /*
     * WARNING - void declaration
     */
    public boolean cC() {
        boolean bl;
        double var4;
        void var5;
        double d2;
        double var6;
        double var7;
        double var8;
        double d3;
        an var9;
        int n2 = CombatOptions.getSpecialAttackEnergy();
        if (an.var10(n2, this.cB())) {
            return var1[0];
        }
        if (an.var11(var9.cM.Q(), var1[7])) {
            return var1[3];
        }
        int[] nArray = new int[var1[3]];
        nArray[an.var1[0]] = var1[10];
        if (an.var12(Equipment.contains((int[])nArray) ? 1 : 0)) {
            d3 = 20.0;
            0;
            if ((0x57 ^ 0x53) != (0x92 ^ 0x96)) {
                return ((0xBD ^ 0xA4) & ~(0x2F ^ 0x36)) != 0;
            }
        } else {
            d3 = var8 = 10.0;
        }
        if (!an.var13(var9.cM.X().isEmpty() ? 1 : 0) || an.var12(var9.cM.W().get(var9.cM.Q() - var1[3]).isEmpty() ? 1 : 0)) {
            switch (var9.cM.Q()) {
                case 1: 
                case 2: 
                case 3: {
                    return var1[3];
                }
                case 4: {
                    return var1[0];
                }
            }
        }
        double var14 = var9.cM.X().stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
        double var15 = var9.cM.W().get(var9.cM.Q() - var1[3]).stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
        if (an.var11(var9.cM.Q(), var1[6])) {
            var7 = var9.cM.W().get(var1[6]).stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
            var6 = var14 - var15 - var7;
            0;
            if null != null {
                return ((0x33 ^ 0x45 ^ (0x25 ^ 0x30)) & (0xA7 ^ 0xB2 ^ (4 ^ 0x72) ^ -1)) != 0;
            }
        } else {
            var6 = var14 - var15;
        }
        var7 = var6 / 30.0 * var8;
        if (an.var11(var9.cM.Q(), var1[6])) {
            d2 = 105.0;
            0;
            if null != null {
                return ((0x12 ^ 0) & ~(0x71 ^ 0x63)) != 0;
            }
        } else {
            d2 = 100.0;
        }
        if (an.var16(an.var17(var7 + (double)var5, var4 = d2))) {
            bl = var1[3];
            0;
            
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static int var17(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static void var18() {
        var2 = new String[var1[14]];
        an.var2[an.var1[0]] = "You setup your spec weapon setup with a weapon that has no spec!!!";
        an.var2[an.var1[3]] = "could not eat food to free up space for spec swap??";
        an.var2[an.var1[4]] = "unable to find a brew or food to free up to make room for swap. resorting to prayer pots or balms now...";
        an.var2[an.var1[5]] = "Drink";
        an.var2[an.var1[6]] = "UNABLE TO MAKE SPACE FOR GEAR SWAP! ERRROR ERROR!";
        an.var2[an.var1[7]] = "Eat";
        an.var2[an.var1[8]] = "Attack";
        an.var2[an.var1[11]] = "prayer potion";
        an.var2[an.var1[12]] = "balm";
        an.var2[an.var1[13]] = "brew";
        an.var2[an.var1[9]] = "Eat";
    }

    private static void var19() {
        var1 = new int[15];
        an.var1[0] = (0x1B ^ 0x32) & ~(6 ^ 0x2F);
        an.var1[1] = -(0xFFFFFC73 & 0x5FAD) & (0xFFFFFFBE & 0x5FEB);
        an.var1[2] = 0xFFFFDFB3 & 0x7EED;
        an.var1[3] = 1;
        an.var1[4] = 2;
        an.var1[5] = 3;
        an.var1[6] = 0x53 ^ 0x57;
        an.var1[7] = 10 + 181 - 162 + 156 ^ 75 + 52 - 119 + 180;
        an.var1[8] = 8 ^ 0xE;
        an.var1[9] = 0x1C ^ 0x16;
        an.var1[10] = 0xFFFFEF7F & 0x75F7;
        an.var1[11] = 0x23 ^ 0x24;
        an.var1[12] = 16 + 0 - -46 + 86 ^ 16 + 26 - -50 + 64;
        an.var1[13] = 0x27 ^ 0x2E;
        an.var1[14] = 0x3D ^ 0x75 ^ (0xE ^ 0x4D);
    }

    private static boolean var16(int n2) {
        return n2 >= 0;
    }

    @Inject
    public SpecialAttackTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2, e2);
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.specGear().selected(EquipmentSetup.class);
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[0];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[0];
        while (an.var10(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if ((0x94 ^ 0x91) != 0) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    @Override
    public boolean cr() {
        an var30;
        if (an.var12(this.cK.assistantMode() ? 1 : 0)) {
            return var1[0];
        }
        if (an.var13(var30.cs() ? 1 : 0)) {
            return var1[0];
        }
        if (an.var12(SquireNightmarePlugin.D.contains(var30.cS.getId()) ? 1 : 0)) {
            int var31 = var30.cq().get(EquipmentInventorySlot.WEAPON);
            int var32 = Arrays.stream(Static.getClient().getEnum(var1[1]).getKeys()).anyMatch(n3 -> {
                boolean bl;
                if (an.var11(n3, var31)) {
                    bl = var1[3];
                    0;
                    if (((78 + 83 - 40 + 41 ^ 87 + 38 - 37 + 102) & (0x1A ^ 0x30 ^ (0xB4 ^ 0x82) ^ -1)) < 0) {
                        return ((0x35 ^ 0x3F ^ (0x73 ^ 0x56)) & (0x11 ^ 3 ^ (0x37 ^ 0xA) ^ -1)) != 0;
                    }
                } else {
                    bl = var1[0];
                }
                return bl;
            }) ? 1 : 0;
            if (an.var13(var32)) {
                Log.warn((String)var2[var1[0]]);
                return var1[0];
            }
            if (an.var3(Players.getLocal().getInteracting()) && an.var11(var31, var1[2])) {
                return var1[0];
            }
            if (an.var13(var30.cC() ? 1 : 0)) {
                return var1[0];
            }
            if (an.var12(var30.cu() ? 1 : 0)) {
                return var30.cA();
            }
        }
        return var1[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean cA() {
        an var33;
        if (an.var12(Inventory.isFull() ? 1 : 0) && an.var34(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && an.var35(this.cq().get(EquipmentInventorySlot.SHIELD))) {
            void var36;
            Item item2 = Inventory.getFirst(item -> {
                String[] stringArray = new String[var1[3]];
                stringArray[an.var1[0]] = var2[var1[9]];
                return item.hasAction(stringArray);
            });
            if (an.var3(item2)) {
                ee.info(var2[var1[3]]);
                Item item3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[13]]));
                if (an.var34(item3)) {
                    item3.drop();
                    return var1[3];
                }
                Log.warn((String)var2[var1[4]]);
                Item var37 = Inventory.getFirst(item -> {
                    boolean bl;
                    if (!an.var13(item.getName().toLowerCase().contains(var2[var1[11]]) ? 1 : 0) || an.var12(item.getName().toLowerCase().contains(var2[var1[12]]) ? 1 : 0)) {
                        bl = var1[3];
                        0;
                        if (2 <= ((0x41 ^ 0x5E) & ~(0x8A ^ 0x95))) {
                            return ((0x3E ^ 0x63) & ~(0 ^ 0x5D)) != 0;
                        }
                    } else {
                        bl = var1[0];
                    }
                    return bl;
                });
                if (an.var34(var37)) {
                    var37.interact(var2[var1[5]]);
                    var37.drop();
                    return var1[3];
                }
                Log.error((String)var2[var1[6]]);
                return var1[0];
            }
            var36.interact(var2[var1[7]]);
            return var1[3];
        }
        if (an.var13(var33.cq().isEquipped() ? 1 : 0)) {
            var33.cq().swap();
        }
        if (an.var13(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            Combat.toggleSpec();
        }
        this.cS.interact(var2[var1[8]]);
        return var1[3];
    }

    private static boolean var35(int n2) {
        return n2 <= 0;
    }

        catch (Exception var43) {
            var43.printStackTrace();
            return null;
        }
    }

    private static boolean var34(Object object) {
        return object != null;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    static {
        an.var19();
        an.var18();
        ee = LoggerFactory.getLogger(SpecialAttackTask.class);
    }

        catch (Exception var49) {
            var49.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }
}

