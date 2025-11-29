/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.runelite.api.TileObject;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Molten Glass (Furnace)", register=true)
public class MoltenGlassFurnaceTask
extends SkillingManager {

    @Inject
    public MoltenGlassFurnaceTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.FURNACE_GLASS);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Override
    public int i() {
        return var2[5];
    }

    private static void var4() {
        var2 = new int[7];
        z.var2[0] = -(0xFFFFBB9F & 0x5D69) & (0xFFFFDFFF & 0x3FFF);
        z.var2[1] = 1;
        z.var2[2] = -(0xFFFFEC79 & 0x538F) & (0xFFFFDEFF & 0x67FD);
        z.var2[3] = (0x5E ^ 0x19) & ~(0xD8 ^ 0x9F);
        z.var2[4] = 0x3F ^ 0x74;
        z.var2[5] = 8 ^ 0xD;
        z.var2[6] = 2;
    }

    private static void var5() {
        var1 = new String[var2[1]];
        z.var1[z.var2[3]] = "Smelt";
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    static {
        z.var4();
        z.var5();
    }

    private static boolean var7(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var2[0], var2[1], var2[2], var2[1]);
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static boolean var16(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_1;
        if (z.var3(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var2[3]);
            return var2[1];
        }
        if (z.var3(Production.isOpen() ? 1 : 0)) {
            z var17;
            Production.choosePreviousOption();
            var17.sleep(var17.i());
            return var2[1];
        }
        if (z.var15(Movement.isRunEnabled() ? 1 : 0) && z.var16(Movement.getRunEnergy(), var2[4])) {
            Movement.toggleRun();
            return var2[3];
        }
        TileObject var18 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (z.var14(tileObject.getActions())) {
                String[] stringArray = new String[var2[1]];
                stringArray[z.var2[3]] = var1[var2[3]];
                if (z.var3(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (((138 + 124 - 199 + 105 ^ 104 + 188 - 243 + 140) & (0x23 ^ 0x35 ^ 3 ^ -1)) <= 0) return n2 != 0;
                    return ((0xE1 ^ 0x91 ^ (0xE9 ^ 0x94)) & (0xA3 ^ 0x99 ^ (0x1A ^ 0x2D) ^ -1)) != 0;
                }
            }
            n2 = var2[3];
            return n2 != 0;
        });
        if (z.var6(var18)) {
            return var2[3];
        }
        Inventory.use(item -> {
            boolean bl;
            if (z.var7(item.getId(), var2[0])) {
                bl = var2[1];
                0;
                if (((0x4D ^ 0x5F ^ (0xC6 ^ 0xC1)) & (77 + 20 - 16 + 50 ^ 30 + 24 - -77 + 19 ^ -1)) >= 2) {
                    return ((0x3D ^ 0x38 ^ (0x98 ^ 0xC4)) & (0x7F ^ 0x5B ^ (0xFB ^ 0x86) ^ -1)) != 0;
                }
            } else {
                bl = var2[3];
            }
            return bl;
        }, (Interactable)var1_1);
        0;
        return var2[1];
    }
}

