/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.corp.tasks.CorpManager;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Attacking corporeal beast")
@Singleton
public class AttackingCorporealBeastTask
extends CorpTaskBase {
    
    @Inject
    private  SquireCorp p;
    @Inject
    private  s a;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        h var3;
        if ((this.a.u() != 0)) {
            return 1;
        }
        NPC var4 = var3.f();
        if (!var4 != null || !(Reachable.isInteractable(LocatablelllllllllllllllIllIIIllIlIlIIIIl) ? 1 : 0) || (var4.isDead( != 0) ? 1 : 0)) {
            return 1;
        }
        Player var5 = Players.getNearest(player -> {
            int n2;
            if (player != player2) && (player.getInteracting() == player.getInteracting()2) && (player.isFriend( == 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if (1 >= 2) {
                    return ((0xC5 ^ 0xAC ^ (0x25 ^ 0x48)) & (0x12 ^ 0x75 ^ (0x10 ^ 0x73) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var5 != null {
            var3.p.c(2);
            return 1;
        }
        if ((Combat.getCurrentHealth() < 3)) {
            TeleportLoader.enterHouse();
            0;
            return 1;
        }
        if ((Combat.getSpecEnergy() >= 4) && (var3.alllllllllllllllIllIIIllIlIlIIIIl)) {
            String[] stringArray = new String[2];
            stringArray[1] = var1[1];
            Item var6 = Inventory.getFirst((String[])stringArray);
            if var6 != null {
                var6.interact(var1[2]);
            }
            if ((Combat.isSpecEnabled( == 0) ? 1 : 0)) {
                Combat.toggleSpec();
            }
            0;
            if (3 >= (157 + 48 - 44 + 6 ^ 15 + 110 - 120 + 158)) {
                return ((43 + 81 - 30 + 140 ^ 68 + 3 - -97 + 21) & (94 + 154 - 220 + 185 ^ 97 + 62 - 34 + 5 ^ -1)) != 0;
            }
        } else if ((Combat.getSpecEnergy() >= 5) && (var3.a(var4 == 0) ? 1 : 0)) {
            int[] nArray = new int[2];
            nArray[1] = 6;
            Item var6 = Inventory.getFirst((int[])nArray);
            if var6 != null {
                var6.interact(var1[7]);
            }
            if ((Combat.isSpecEnabled( == 0) ? 1 : 0)) {
                Combat.toggleSpec();
            }
            0;
            if (1 != 1) {
                return ((0xB4 ^ 0xB1) & ~(0x7F ^ 0x7A)) != 0;
            }
        } else {
            EquipmentSetup var6 = (EquipmentSetup)var3.o.fightLoadout().selected(EquipmentSetup.class);
            if ((Gear.isEquipped((int[] == 0)var6.getIds()) ? 1 : 0)) {
                Gear.swapTo((EquipmentSetup)var6);
                0;
            }
        }
        if ((Players.getLocal().getInteracting() == Players.getLocal().getInteracting()2)) {
            return 1;
        }
        var1_1.interact(var1[8]);
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(NPC nPC) {
        int n2;
        void var7;
        String[] stringArray = new String[2];
        stringArray[1] = var1[9];
        if ((Inventory.contains((String[] == 0)stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[2];
            stringArray2[1] = var1[var2[10]];
            if ((Equipment.contains((String[] == 0)stringArray2) ? 1 : 0)) {
                return 1;
            }
        }
        if ((var7.getHealthRatio() < var2[11]) && (var7.getHealthRatio() > 2)) {
            n2 = 2;
            0;
            if (((4 ^ 0x1A ^ (0xD ^ 0x5A)) & (0xA8 ^ 0xB0 ^ (0xC2 ^ 0x93) ^ -1)) != 0) {
                return ((0xF ^ 0x44 ^ (8 ^ 2)) & (0x59 ^ 0x6B ^ (0xFE ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = 1;
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = 1;
        while (var16 < var15) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var11);
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

}

