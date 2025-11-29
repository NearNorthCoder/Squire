/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking p1 warden", priority=10)
public class AttackingP1WardenTask
extends AutotoaManager {

    @Inject
    protected AttackingP1WardenTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var2 = new String[var1[8]];
        bF.var2[bF.var1[0]] = "Attack";
        bF.var2[bF.var1[1]] = "Attack";
        bF.var2[bF.var1[3]] = "Elidinis' Warden";
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var13;
        NPC nPC = this.co();
        if (bF.var4(nPC)) {
            return var1[0];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[bF.var1[0]] = var2[var1[0]];
        if (bF.var12(var13.hasAction(stringArray) ? 1 : 0)) {
            return var1[0];
        }
        this.bp();
        this.aY.a(var1[2]);
        nPC.interact(var2[var1[1]]);
        return var1[1];
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        bF.var20();
        bF.var11();
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

    private static void var20() {
        var1 = new int[10];
        bF.var1[0] = (0xB2 ^ 0x82) & ~(0x77 ^ 0x47);
        bF.var1[1] = 1;
        bF.var1[2] = 0x3D ^ 0x21;
        bF.var1[3] = 2;
        bF.var1[4] = -(0xFFFFD4DF & 0x3B33) & (0xFFFFBFFF & 0x7DFF);
        bF.var1[5] = 0xFFFFADEA & Short.MAX_VALUE;
        bF.var1[6] = 0xFFFFBFFD & 0x6DEE;
        bF.var1[7] = -(0xFFFFB35F & 0x5EA1) & (0xFFFFFFF9 & 0x3FEF);
        bF.var1[8] = 3;
        bF.var1[9] = 147 + 82 - 100 + 36 ^ 15 + 38 - -17 + 103;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        bF var22;
        void var23;
        String[] stringArray = new String[var1[1]];
        stringArray[bF.var1[0]] = var2[var1[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bF.var4(nPC)) {
            return this.cW.mageP2Warden();
        }
        int var24 = var23.getId();
        if (!bF.var21(var24, var1[4]) || bF.var3(var24, var1[5])) {
            return var22.cW.rangedP2Warden();
        }
        if (!bF.var21(var24, var1[6]) || bF.var3(var24, var1[7])) {
            return var22.cW.mageP2Warden();
        }
        return this.cW.mageP2Warden();
    }
}

