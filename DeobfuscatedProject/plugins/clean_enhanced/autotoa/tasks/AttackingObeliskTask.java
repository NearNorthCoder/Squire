/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Obelisk", priority=50)
public class AttackingObeliskTask
extends AutotoaManager {

    private static void var3() {
        var1 = new String[var2[4]];
        bv.var1[bv.var2[1]] = "Obelisk";
        bv.var1[bv.var2[0]] = "Attack";
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean bq() {
        int n2;
        block3: {
            block2: {
                if (!bv.var11(Combat.getSpecEnergy(), var2[2])) break block2;
                int[] nArray = new int[var2[0]];
                nArray[bv.var2[1]] = var2[3];
                if (!bv.var12(Equipment.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            n2 = var2[0];
            0;
            if (((0xD5 ^ 0x97) & ~(5 ^ 0x47)) == 0) return n2 != 0;
            return ((0xB9 ^ 0x96) & ~(0x18 ^ 0x37)) != 0;
        }
        n2 = var2[1];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        TileObject var13;
        void var14;
        bv var15;
        String[] stringArray = new String[var2[0]];
        stringArray[bv.var2[1]] = var1[var2[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bv.var16(nPC)) {
            return var2[1];
        }
        if (bv.var4(var15.aY.g() ? 1 : 0)) {
            return var2[1];
        }
        var15.a((NPC)var14, var2[0]);
        0;
        if (bv.var17(var15.bg(), var2[0]) && bv.var12(var14.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && bv.var18(var13 = TileObjects.getNearest(tileObject -> fH.contains(tileObject.getId())))) {
            return var2[1];
        }
        nPC.interact(var1[var2[0]]);
        return var2[0];
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean var18(Object object) {
        return object != null;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var17(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected AttackingObeliskTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.obeliskGear();
    }

    private static void var25() {
        var2 = new int[6];
        bv.var2[0] = 1;
        bv.var2[1] = (0x2B ^ 0x48) & ~(0xC5 ^ 0xA6);
        bv.var2[2] = 133 + 188 - 293 + 193 ^ 37 + 2 - -28 + 118;
        bv.var2[3] = -(0xFFFFD3DD & 0x3EA3) & (0xFFFFF7FF & 0x7FF7);
        bv.var2[4] = 2;
        bv.var2[5] = 8 + 64 - 22 + 106 ^ 139 + 132 - 189 + 66;
    }

    private static boolean var11(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        bv.var25();
        bv.var3();
    }

    private static boolean var16(Object object) {
        return object == null;
    }
}

