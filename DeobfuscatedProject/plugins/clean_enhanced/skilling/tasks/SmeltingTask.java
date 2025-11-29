/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Smelting", register=true)
public class SmeltingTask
extends SkillingManager {

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    static {
        P.var5();
        P.var6();
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    @Override
    public int i() {
        return var2[3];
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.smeltingProduct().q(), this.j.smeltingProduct().r(), this.j.smeltingProduct().t(), this.j.smeltingProduct().u());
    }

    private static void var6() {
        var1 = new String[var2[4]];
        P.var1[P.var2[0]] = "Smelt";
        P.var1[P.var2[1]] = "Smelt";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_2;
        if (P.var7(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var2[0]);
            return var2[1];
        }
        if (P.var7(Production.isOpen() ? 1 : 0)) {
            P var10;
            int var11 = var10.j.smeltingProduct().w();
            Production.chooseOption((int)var11);
            var10.sleep(var10.i());
            return var2[1];
        }
        if (P.var3(Movement.isRunEnabled() ? 1 : 0) && P.var12(Movement.getRunEnergy(), var2[2])) {
            Movement.toggleRun();
            return var2[0];
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (P.var4(tileObject.getActions())) {
                String[] stringArray = new String[var2[1]];
                stringArray[P.var2[0]] = var1[var2[1]];
                if (P.var7(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (((0xBE ^ 0xA0 ^ (0xAB ^ 0xA4)) & (0xE7 ^ 0xA0 ^ (0x97 ^ 0xC1) ^ -1)) <= ((106 + 73 - 5 + 32 ^ 106 + 90 - 178 + 128) & (0x51 ^ 0x4A ^ (0x25 ^ 0x62) ^ -1))) return n2 != 0;
                    return ((0xB9 ^ 0x9E ^ (0xFB ^ 0x89)) & (0x71 ^ 0x45 ^ (0x48 ^ 0x29) ^ -1)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        if (P.var9(var11)) {
            return var2[0];
        }
        var1_2.interact(var1[var2[0]]);
        return var2[1];
    }

    private static void var5() {
        var2 = new int[6];
        P.var2[0] = (0x5A ^ 0x53) & ~(0xCC ^ 0xC5);
        P.var2[1] = 1;
        P.var2[2] = 0x1D ^ 0x56;
        P.var2[3] = 0xDF ^ 0xBD ^ (0xC1 ^ 0xA6);
        P.var2[4] = 2;
        P.var2[5] = 0xCF ^ 0xC6 ^ 1;
    }

    @Inject
    public SmeltingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.SMELTING);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var2[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var2[0];
        while (P.var8(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (((0x51 ^ 0x64 ^ (0x20 ^ 0x1F)) & (0x68 ^ 0x45 ^ (0x11 ^ 0x36) ^ -1)) < (33 + 23 - 26 + 124 ^ 120 + 75 - 110 + 73)) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }
}

