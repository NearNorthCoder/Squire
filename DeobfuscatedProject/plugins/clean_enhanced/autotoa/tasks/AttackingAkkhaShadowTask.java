/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Akkha Shadow", priority=25, blocking=true)
public class AttackingAkkhaShadowTask
extends AutotoaManager {

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.shadowAttackStyle();
    }

    @Override
    public boolean bq() {
        int n2;
        int[] nArray = new int[var1[1]];
        nArray[at.var1[0]] = var1[3];
        if (at.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1[1];
        }
        Item var5 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (!at.var6(var5) || !at.var4(var5.getName().contains(var2[var1[4]]) ? 1 : 0) || !at.var7(Combat.getMissingHealth(), var1[5]) || at.var8(Combat.getSpecEnergy(), var1[6])) {
            n2 = var1[1];
            0;
            if ((0x2C ^ 0x28) <= -1) {
                return ((0x3E ^ 0x70) & ~(0xB ^ 0x45)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var9() {
        var2 = new String[var1[2]];
        at.var2[at.var1[0]] = "Akkha's Shadow";
        at.var2[at.var1[1]] = "Attack";
        at.var2[at.var1[4]] = "blowpipe";
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        at var16;
        if (at.var4(this.bu() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var17 = var16.bx().a(var16.cu);
        String[] stringArray = new String[var1[1]];
        stringArray[at.var1[0]] = var2[var1[0]];
        NPC var18 = NPCs.getNearest((WorldPoint)var17, (String[])stringArray);
        if (!at.var6(var18) || at.var3(var16.g(var18) ? 1 : 0)) {
            return var1[0];
        }
        Player var19 = Players.getLocal();
        if (at.var20(var19.getInteracting(), var18) && at.var3(var19.isMoving() ? 1 : 0) && at.var21(var18.distanceTo((Locatable)var19), var1[2])) {
            var16.g(var18.getWorldLocation());
            return var1[1];
        }
        this.bp();
        var2_2.interact(var2[var1[1]]);
        return var1[1];
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var20(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var21(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected AttackingAkkhaShadowTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void var28() {
        var1 = new int[8];
        at.var1[0] = (0x11 ^ 0x7D ^ (5 ^ 0x38)) & (200 + 27 - 162 + 181 ^ 164 + 94 - 106 + 15 ^ -1);
        at.var1[1] = 1;
        at.var1[2] = 3;
        at.var1[3] = -(0xFFFFDBEF & 0x3571) & (0xFFFFFFFB & 0x7BFF);
        at.var1[4] = 2;
        at.var1[5] = 183 + 85 - 133 + 55 ^ 75 + 96 - 156 + 155;
        at.var1[6] = 0x5A ^ 0xA;
        at.var1[7] = 0x75 ^ 0x30 ^ (0x43 ^ 0xE);
    }

    static {
        at.var28();
        at.var9();
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.shadowAttackStyle();
    }
}

