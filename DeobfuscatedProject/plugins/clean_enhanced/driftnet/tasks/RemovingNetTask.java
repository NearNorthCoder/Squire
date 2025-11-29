/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNet;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Removing net", priority=20, blocking=true)
public class RemovingNetTask
extends Task {
    
    private static final  int S;
    private final  Client X;
    private static final  int V;
    private final  SquireDriftNet W;
    private static final  int U;
    private static final  int T;

    static {
        k.var3();
        k.var4();
        V = 2;
        U = 0;
        S = 3;
        T = 4;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < lllllllllllllllIlllIlIIIllIIIlII2) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((0x15 ^ 0x78 ^ (0xDE ^ 0xA3)) & (102 + 6 - 89 + 144 ^ 162 + 99 - 177 + 95 ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public boolean run() {
        if ((this.X.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var1[0];
        if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0)) {
            return 0;
        }
        int var15 = Static.getClient().getVarbitValue(2);
        if (var15 == 0) {
            k var16;
            Log.error((String)var1[1]);
            var16.W.forceStop();
            return 0;
        }
        Widget var17 = Widgets.get((int)3, (int)4, (int)0);
        if var17 != null {
            var17.interact(var1[5]);
            return 1;
        }
        String[] stringArray2 = new String[1];
        stringArray2[0] = var1[6];
        TileObject var18 = TileObjects.getNearest((String[])stringArray2);
        if var18 != null {
            var18.interact(var1[7]);
            return 1;
        }
        return 0;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    @Inject
    public RemovingNetTask(SquireDriftNet squireDriftNet, Client client) {
        this.W = squireDriftNet;
        this.X = client;
    }
}

