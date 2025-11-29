/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GameEnum5;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Making mould", priority=10)
public class MakingMouldTask
extends GiantsfoundryTaskBase {

    private static boolean var3(Object object) {
        return object == null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var1 = new String[var2[8]];
        u.var1[u.var2[0]] = "No mould jig found";
        u.var1[u.var2[1]] = "Interacting with mould jig";
        u.var1[u.var2[3]] = "Setup";
        u.var1[u.var2[4]] = "Selecting FORTE mould";
        u.var1[u.var2[5]] = "Selecting BLADE mould";
        u.var1[u.var2[6]] = "Selecting TIP mould";
    }

    private static void var6() {
        var2 = new int[10];
        u.var2[0] = (0x5A ^ 3) & ~(0xD0 ^ 0x89);
        u.var2[1] = 1;
        u.var2[2] = 0xFFFFEEFB & 0xBFED;
        u.var2[3] = 2;
        u.var2[4] = 3;
        u.var2[5] = 149 + 66 - 97 + 46 ^ 143 + 151 - 230 + 96;
        u.var2[6] = 0x3E ^ 0x2C ^ (0x26 ^ 0x31);
        u.var2[7] = -(0xFFFFBA95 & 0x7D6B) & (0xFFFFBFDF & 0x7AEE);
        u.var2[8] = 0xA8 ^ 0xAE;
        u.var2[9] = 0x5C ^ 0x54;
    }

    private boolean MakingMouldTask() {
        Widget widget = Widgets.get((int)var2[7], (int)var2[3]);
        return Widgets.isVisible((Widget)widget);
    }

    static {
        u.var6();
        u.var5();
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    public MakingMouldTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    @Override
    public boolean M() {
        u var13;
        if (u.var14(this.T.g() ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[u.var2[0]] = var2[2];
        TileObject var15 = TileObjects.getNearest((int[])nArray);
        if (u.var3(var15)) {
            Log.info((String)var1[var2[0]]);
            return var2[0];
        }
        if (u.var4(var13.MakingMouldTask() ? 1 : 0)) {
            Log.info((String)var1[var2[1]]);
            var15.interact(var1[var2[3]]);
            return var2[1];
        }
        if (u.var4(Vars.getBit((int)f.FORTE.E()))) {
            Log.info((String)var1[var2[4]]);
            if (u.var4(f.FORTE.B() ? 1 : 0)) {
                f.FORTE.C();
                return var2[1];
            }
            f.FORTE.D();
            return var2[1];
        }
        if (u.var4(Vars.getBit((int)f.BLADE.E()))) {
            Log.info((String)var1[var2[5]]);
            if (u.var4(f.BLADE.B() ? 1 : 0)) {
                f.BLADE.C();
                return var2[1];
            }
            f.BLADE.D();
            return var2[1];
        }
        if (u.var4(Vars.getBit((int)f.TIP.E()))) {
            Log.info((String)var1[var2[6]]);
            if (u.var4(f.TIP.B() ? 1 : 0)) {
                f.TIP.C();
                return var2[1];
            }
            f.TIP.D();
            return var2[1];
        }
        return var2[0];
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }
}

