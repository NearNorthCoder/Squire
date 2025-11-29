/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Smithing")
public class SmithingTask
extends SkillingManager {

    private static boolean var3(Object object) {
        return object != null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void var10() {
        var1 = new int[11];
        Q.var1[0] = 0xFFFF9F2F & 0x69FB;
        Q.var1[1] = 1;
        Q.var1[2] = (0x28 ^ 3 ^ (0x14 ^ 0x74)) & (0xE2 ^ 0x97 ^ (0xF8 ^ 0xC6) ^ -1);
        Q.var1[3] = 0x93 ^ 0x99;
        Q.var1[4] = 2;
        Q.var1[5] = 3;
        Q.var1[6] = 0x4A ^ 0x22 ^ (0xE5 ^ 0x89);
        Q.var1[7] = 129 + 27 - -2 + 5 ^ 63 + 29 - -59 + 15;
        Q.var1[8] = 0x68 ^ 0x73 ^ (0x61 ^ 0x7C);
        Q.var1[9] = 0x83 ^ 0xB2 ^ (0x91 ^ 0xA7);
        Q.var1[10] = 0x69 ^ 0 ^ (0xD1 ^ 0xB0);
    }

    @Inject
    public SmithingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.SMITHING);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var2_2;
        if (Q.var11(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var1[2]);
        }
        if (Q.var12(Movement.isRunEnabled() ? 1 : 0) && Q.var13(Movement.getRunEnergy(), var1[3])) {
            Movement.toggleRun();
            return var1[2];
        }
        Widget var14 = Widgets.get((WidgetInfo)WidgetInfo.SMITHING_INVENTORY_ITEMS_CONTAINER);
        if (Q.var3(var14)) {
            Q var15;
            String[] stringArray = new String[var1[1]];
            stringArray[Q.var1[2]] = var2[var1[2]];
            if (Q.var12(Widgets.get((WidgetInfo)var15.j.smithingProduct().SmithingTask()).hasAction(stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[var1[1]];
                stringArray2[Q.var1[2]] = var2[var1[1]];
                if (Q.var12(Widgets.get((WidgetInfo)var15.j.smithingProduct().SmithingTask()).hasAction(stringArray2) ? 1 : 0)) {
                    Log.info((String)var2[var1[4]]);
                    return var1[2];
                }
            }
            String[] stringArray3 = new String[var1[4]];
            stringArray3[Q.var1[2]] = var2[var1[5]];
            stringArray3[Q.var1[1]] = var2[var1[6]];
            Widgets.get((WidgetInfo)var15.j.smithingProduct().SmithingTask()).interact(stringArray3);
            var15.sleep(var15.i());
            return var1[1];
        }
        TileObject var16 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (Q.var3(tileObject.getActions())) {
                String[] stringArray = new String[var1[1]];
                stringArray[Q.var1[2]] = var2[var1[9]];
                if (Q.var11(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (3 > 0) return n2 != 0;
                    return ((0x5D ^ 0x54 ^ (0x31 ^ 0x21)) & (62 + 152 - 130 + 73 ^ 72 + 131 - 102 + 31 ^ -1)) != 0;
                }
            }
            n2 = var1[2];
            return n2 != 0;
        });
        if (Q.var17(var16)) {
            Log.info((String)var2[var1[7]]);
            return var1[2];
        }
        var2_2.interact(var2[var1[8]]);
        this.sleep(var1[4]);
        return var1[1];
    }

    static {
        Q.var10();
        Q.var18();
    }

    private static boolean var13(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[2];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[2];
        while (Q.var28(var27, var26)) {
            char var29 = var25[var27];
            var22.append((char)(var29 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var22);
    }

    @Override
    public int i() {
        return var1[5];
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var28(int n2, int n3) {
        return n2 < n3;
    }

    private static void var18() {
        var2 = new String[var1[10]];
        Q.var2[Q.var1[2]] = "Smith";
        Q.var2[Q.var1[1]] = "Smith set";
        Q.var2[Q.var1[4]] = "something is wrong";
        Q.var2[Q.var1[5]] = "Smith";
        Q.var2[Q.var1[6]] = "Smith set";
        Q.var2[Q.var1[7]] = "Cant find an anvil";
        Q.var2[Q.var1[8]] = "Smith";
        Q.var2[Q.var1[9]] = "Smith";
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var1[0], var1[1], this.j.smithingBar().p(), this.j.smithingProduct().R());
    }
}

