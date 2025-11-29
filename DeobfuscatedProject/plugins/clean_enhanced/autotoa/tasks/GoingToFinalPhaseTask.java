/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Going to final phase", priority=1000, blocking=true)
public class GoingToFinalPhaseTask
extends AutotoaManager {
    private static final  int gm;

    private static final  int gl;

    private static void var3() {
        var1 = new int[8];
        bE.var1[0] = -(0xFFFFF9EF & 0x5E51) & (0xFFFFFDFE & Short.MAX_VALUE);
        bE.var1[1] = (0xBD ^ 0x89) & ~(0x3A ^ 0xE);
        bE.var1[2] = -(0xFFFFF38F & 0x1E75) & (0xFFFFFFFF & 0x3FEF);
        bE.var1[3] = 0x3A ^ 0x67 ^ (0x45 ^ 0x2F);
        bE.var1[4] = 1;
        bE.var1[5] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        bE.var1[6] = 0x41 ^ 0x49;
        bE.var1[7] = 2;
    }

    private static void var4() {
        var2 = new String[var1[4]];
        bE.var2[bE.var1[1]] = "Take";
    }

    static {
        bE.var3();
        bE.var4();
        gl = var1[0];
        gm = var1[2];
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        bE var6;
        NPC nPC = this.co();
        if (bE.var5(nPC) && bE.var7(nPC.getAnimation(), var1[0])) {
            return var1[1];
        }
        if (bE.var7(var6.aX(), var1[2])) {
            return var1[1];
        }
        if (bE.var8(Combat.getCurrentHealth(), var1[3]) && bE.var9(var6.ba() ? 1 : 0)) {
            return var1[4];
        }
        if (bE.var9(Inventory.isFull() ? 1 : 0)) {
            return var1[1];
        }
        TileItem var10 = TileItems.getAll().stream().filter(Reachable::isInteractable).max(Comparator.comparingInt(tileItem -> {
            int n2;
            if (bE.var9(tileItem.isTradable() ? 1 : 0)) {
                n2 = Prices.getItemPrice((int)tileItem.getId());
                0;
                if (((0x5B ^ 0x27 ^ (0xC1 ^ 0x92)) & (0x32 ^ 0x49 ^ (0x39 ^ 0x6D) ^ -1)) != 0) {
                    return (0xEF ^ 0xC2 ^ (0x7F ^ 0x56)) & (71 + 20 - 11 + 83 ^ 10 + 165 - 165 + 157 ^ -1);
                }
            } else {
                n2 = var1[5];
            }
            return n2;
        })).orElse(null);
        if (bE.var11(var10)) {
            return var1[1];
        }
        var2_2.interact(var2[var1[1]]);
        return var1[4];
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    @Inject
    protected GoingToFinalPhaseTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var7(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

