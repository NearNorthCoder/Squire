/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Creating TOA Party", priority=5, blocking=true)
public class CreatingToaPartyTask
extends ck {

    private static final  int hQ;

    @Override
    public boolean bl() {
        ch var3;
        if (ch.var4(Vars.getBit((int)var2[0]), var2[1])) {
            return var2[2];
        }
        BankLoadout var5 = (BankLoadout)var3.hY.loadout().selected(BankLoadout.class);
        if (ch.var6(var5.needsToBank() ? 1 : 0)) {
            return var2[2];
        }
        Widget var7 = var3.cu.getWidget(var2[3]);
        if (ch.var6(Widgets.isVisible((Widget)var7) ? 1 : 0)) {
            Log.info((String)var1[var2[2]]);
            var7.interact(var1[var2[1]]);
            return var2[1];
        }
        int[] nArray = new int[var2[4]];
        nArray[ch.var2[2]] = var2[5];
        nArray[ch.var2[1]] = var2[6];
        TileObject var8 = TileObjects.getNearest((int[])nArray);
        if (ch.var9(var8)) {
            Log.info((String)var1[var2[4]]);
            var8.interact(var1[var2[7]]);
            return var2[1];
        }
        return var2[2];
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        ch.var22();
        ch.var23();
        hQ = var2[0];
    }

    private static void var22() {
        var2 = new int[10];
        ch.var2[0] = -(0xFFFF9FF9 & 0x6647) & (0xFFFFFFC9 & 0x3E7F);
        ch.var2[1] = 1;
        ch.var2[2] = (108 + 44 - 150 + 130 ^ 113 + 73 - 84 + 41) & (9 ^ 0x28 ^ (0xF ^ 0x25) ^ -1);
        ch.var2[3] = 0xFFFFC7D6 & 0x3043869;
        ch.var2[4] = 2;
        ch.var2[5] = 0xFFFFFFFE & 0xB3F5;
        ch.var2[6] = 0xFFFFB3F7 & 0xFFFD;
        ch.var2[7] = 3;
        ch.var2[8] = 0x61 ^ 0x65;
        ch.var2[9] = 0x51 ^ 0xF ^ (0xC5 ^ 0x93);
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected CreatingToaPartyTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void var23() {
        var1 = new String[var2[8]];
        ch.var1[ch.var2[2]] = "[CreateParty] Creating a party";
        ch.var1[ch.var2[1]] = "Make Party";
        ch.var1[ch.var2[4]] = "[CreateParty] Opening party menu";
        ch.var1[ch.var2[7]] = "Inspect";
    }

    private static boolean var9(Object object) {
        return object != null;
    }
}

