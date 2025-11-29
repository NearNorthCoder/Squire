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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lIIIlllIIIIIIIl(Object object) {
        return object == null;
    }

    private int cB() {
        int n2 = this.cq().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(lllIlllIllll[1]).getIntValue(n2);
        return n3 / lllIlllIllll[9];
    }

    /*
     * WARNING - void declaration
     */
    public boolean cC() {
        boolean bl;
        double var1;
        void var2;
        double d2;
        double var3;
        double var4;
        double var5;
        double d3;
        an var6;
        int n2 = CombatOptions.getSpecialAttackEnergy();
        if (an.lIIIlllIIIIIllI(n2, this.cB())) {
            return lllIlllIllll[0];
        }
        if (an.lIIIlllIIIIIIlI(var6.cM.Q(), lllIlllIllll[7])) {
            return lllIlllIllll[3];
        }
        int[] nArray = new int[lllIlllIllll[3]];
        nArray[an.lllIlllIllll[0]] = lllIlllIllll[10];
        if (an.lIIIllIllllllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            d3 = 20.0;

            if ((0x57 ^ 0x53) != (0x92 ^ 0x96)) {
                return false;
            }
        } else {
            d3 = var5 = 10.0;
        }
        if (!an.lIIIlllIIIIIIII(var6.cM.X().isEmpty() ? 1 : 0) || an.lIIIllIllllllll(var6.cM.W().get(var6.cM.Q() - lllIlllIllll[3]).isEmpty() ? 1 : 0)) {
            switch (var6.cM.Q()) {
                case 1: 
                case 2: 
                case 3: {
                    return lllIlllIllll[3];
                }
                case 4: {
                    return lllIlllIllll[0];
                }
            }
        }
        double var7 = var6.cM.X().stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
        double var8 = var6.cM.W().get(var6.cM.Q() - lllIlllIllll[3]).stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
        if (an.lIIIlllIIIIIIlI(var6.cM.Q(), lllIlllIllll[6])) {
            var4 = var6.cM.W().get(lllIlllIllll[6]).stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
            var3 = var7 - var8 - var4;

            }
        } else {
            var3 = var7 - var8;
        }
        var4 = var3 / 30.0 * var5;
        if (an.lIIIlllIIIIIIlI(var6.cM.Q(), lllIlllIllll[6])) {
            d2 = 105.0;

            }
        } else {
            d2 = 100.0;
        }
        if (an.lIIIlllIIIIIlll(an.lIIIlllIIIIIlIl(var4 + (double)var2, var1 = d2))) {
            bl = lllIlllIllll[3];

            if (1 == 0) {
                return false;
            }
        } else {
            bl = lllIlllIllll[0];
        }
        return bl;
    }

    private static int lIIIlllIIIIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static void lIIIllIllllllIl() {
        lllIlllIlllI = new String[lllIlllIllll[14]];
        an.lllIlllIlllI[an.lllIlllIllll[0]] = "You setup your spec weapon setup with a weapon that has no spec!!!";
        an.lllIlllIlllI[an.lllIlllIllll[3]] = "could not eat food to free up space for spec swap??";
        an.lllIlllIlllI[an.lllIlllIllll[4]] = "unable to find a brew or food to free up to make room for swap. resorting to prayer pots or balms now...";
        an.lllIlllIlllI[an.lllIlllIllll[5]] = "Drink";
        an.lllIlllIlllI[an.lllIlllIllll[6]] = "UNABLE TO MAKE SPACE FOR GEAR SWAP! ERRROR ERROR!";
        an.lllIlllIlllI[an.lllIlllIllll[7]] = "Eat";
        an.lllIlllIlllI[an.lllIlllIllll[8]] = "Attack";
        an.lllIlllIlllI[an.lllIlllIllll[11]] = "prayer potion";
        an.lllIlllIlllI[an.lllIlllIllll[12]] = "balm";
        an.lllIlllIlllI[an.lllIlllIllll[13]] = "brew";
        an.lllIlllIlllI[an.lllIlllIllll[9]] = "Eat";
    }

    private static boolean lIIIlllIIIIIlll(int n2) {
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

    private static boolean lIIIlllIIIIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIllllllll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var9);
    }

    @Override
    public boolean cr() {
        an var10;
        if (an.lIIIllIllllllll(this.cK.assistantMode() ? 1 : 0)) {
            return lllIlllIllll[0];
        }
        if (an.lIIIlllIIIIIIII(var10.cs() ? 1 : 0)) {
            return lllIlllIllll[0];
        }
        if (an.lIIIllIllllllll(SquireNightmarePlugin.D.contains(var10.cS.getId()) ? 1 : 0)) {
            int var11 = var10.cq().get(EquipmentInventorySlot.WEAPON);
            int var12 = Arrays.stream(Static.getClient().getEnum(lllIlllIllll[1]).getKeys()).anyMatch(n3 -> {
                boolean bl;
                if (an.lIIIlllIIIIIIlI(n3, var11)) {
                    bl = lllIlllIllll[3];

                    if (((78 + 83 - 40 + 41 ^ 87 + 38 - 37 + 102) & (0x1A ^ 0x30 ^ (0xB4 ^ 0x82) ^ -1)) < 0) {
                        return ((0x35 ^ 0x3F ^ (0x73 ^ 0x56)) & (0x11 ^ 3 ^ (0x37 ^ 0xA) ^ -1)) != 0;
                    }
                } else {
                    bl = lllIlllIllll[0];
                }
                return bl;
            }) ? 1 : 0;
            if (an.lIIIlllIIIIIIII(var12)) {
                Log.warn((String)lllIlllIlllI[lllIlllIllll[0]]);
                return lllIlllIllll[0];
            }
            if (an.lIIIlllIIIIIIIl(Players.getLocal().getInteracting()) && an.lIIIlllIIIIIIlI(var11, lllIlllIllll[2])) {
                return lllIlllIllll[0];
            }
            if (an.lIIIlllIIIIIIII(var10.cC() ? 1 : 0)) {
                return lllIlllIllll[0];
            }
            if (an.lIIIllIllllllll(var10.cu() ? 1 : 0)) {
                return var10.cA();
            }
        }
        return lllIlllIllll[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean cA() {
        an var13;
        if (an.lIIIllIllllllll(Inventory.isFull() ? 1 : 0) && an.lIIIlllIIIIIIll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && an.lIIIlllIIIIIlII(this.cq().get(EquipmentInventorySlot.SHIELD))) {
            void var14;
            Item item2 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lllIlllIllll[3]];
                stringArray[an.lllIlllIllll[0]] = lllIlllIlllI[lllIlllIllll[9]];
                return item.hasAction(stringArray);
            });
            if (an.lIIIlllIIIIIIIl(item2)) {
                ee.info(lllIlllIlllI[lllIlllIllll[3]]);
                Item item3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[13]]));
                if (an.lIIIlllIIIIIIll(item3)) {
                    item3.drop();
                    return lllIlllIllll[3];
                }
                Log.warn((String)lllIlllIlllI[lllIlllIllll[4]]);
                Item var15 = Inventory.getFirst(item -> {
                    boolean bl;
                    if (!an.lIIIlllIIIIIIII(item.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[11]]) ? 1 : 0) || an.lIIIllIllllllll(item.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[12]]) ? 1 : 0)) {
                        bl = lllIlllIllll[3];

                        if (2 <= ((0x41 ^ 0x5E) & ~(0x8A ^ 0x95))) {
                            return false;
                        }
                    } else {
                        bl = lllIlllIllll[0];
                    }
                    return bl;
                });
                if (an.lIIIlllIIIIIIll(var15)) {
                    var15.interact(lllIlllIlllI[lllIlllIllll[5]]);
                    var15.drop();
                    return lllIlllIllll[3];
                }
                Log.error((String)lllIlllIlllI[lllIlllIllll[6]]);
                return lllIlllIllll[0];
            }
            var14.interact(lllIlllIlllI[lllIlllIllll[7]]);
            return lllIlllIllll[3];
        }
        if (an.lIIIlllIIIIIIII(var13.cq().isEquipped() ? 1 : 0)) {
            var13.cq().swap();
        }
        if (an.lIIIlllIIIIIIII(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            Combat.toggleSpec();
        }
        this.cS.interact(lllIlllIlllI[lllIlllIllll[8]]);
        return lllIlllIllll[3];
    }

    private static boolean lIIIlllIIIIIlII(int n2) {
        return n2 <= 0;
    }

    private static boolean lIIIlllIIIIIIll(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        an.lIIIllIlllllllI();
        an.lIIIllIllllllIl();
        ee = LoggerFactory.getLogger(SpecialAttackTask.class);
    }

    private static boolean lIIIlllIIIIIIlI(int n2, int n3) {
        return n2 == n3;
    }
}

