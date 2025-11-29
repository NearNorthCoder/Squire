/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Rotating Mirror", priority=1000, blocking=true)
public class RotatingMirrorTask
extends Task {
    private final  SquireQuestHelper fU;
    private static  int[] llIIIIlII;
    private static  String[] llIIIIIll;

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    private static boolean var2(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    private static void var4() {
        llIIIIIll = new String[llIIIIlII[6]];
        bs.llIIIIIll[bs.llIIIIlII[0]] = "ObjectStep";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        bs.var11();
        bs.var4();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        bs var12;
        String string = this.fU.cz();
        if (bs.var1(string.equals(llIIIIIll[llIIIIlII[0]]) ? 1 : 0)) {
            return llIIIIlII[0];
        }
        TileObject var13 = var12.fU.cx();
        if (!bs.var3(var13) || bs.var2(var13.distanceTo((Locatable)Players.getLocal()), llIIIIlII[1])) {
            return llIIIIlII[0];
        }
        if (bs.var1(Dialog.isOpen() ? 1 : 0)) {
            return llIIIIlII[0];
        }
        Widget var14 = Widgets.get((int)llIIIIlII[2], (int)llIIIIlII[3]);
        if (bs.var1(Widgets.isVisible((Widget)var14) ? 1 : 0)) {
            return llIIIIlII[0];
        }
        var3_3.interact(llIIIIlII[0], llIIIIlII[4], llIIIIlII[5], var3_3.getId());
        return llIIIIlII[6];
    }

    private static void var11() {
        llIIIIlII = new int[7];
        bs.llIIIIlII[0] = (3 ^ (0xAB ^ 0xA6)) & (0x3F ^ 0x78 ^ (0x8A ^ 0xC3) ^ -1);
        bs.llIIIIlII[1] = 2;
        bs.llIIIIlII[2] = -(0xFFFFFED7 & 0x5929) & (0xFFFFFFFF & 0x5A7B);
        bs.llIIIIlII[3] = 0x46 ^ 0x73 ^ (0x4D ^ 0x6A);
        bs.llIIIIlII[4] = 0x1A ^ 0x5B ^ (0x17 ^ 0x48);
        bs.llIIIIlII[5] = -1;
        bs.llIIIIlII[6] = 1;
    }

    @Inject
    public RotatingMirrorTask(SquireQuestHelper squireQuestHelper) {
        this.fU = squireQuestHelper;
    }
}

