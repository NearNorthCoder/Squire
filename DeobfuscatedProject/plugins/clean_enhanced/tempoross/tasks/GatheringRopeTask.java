/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Gathering rope", priority=100, blocking=true)
public class GatheringRopeTask
extends TemporossTaskBase {

    @Override
    public boolean ak() {
        boolean bl;
        if (t.var3(this.ar.r() ? 1 : 0)) {
            bl = var1[0];
            0;
            
        } else {
            bl = var1[1];
        }
        return bl;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static void var5() {
        var2 = new String[var1[0]];
        t.var2[t.var1[1]] = "Take";
    }

    @Inject
    protected GatheringRopeTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var6() {
        var1 = new int[3];
        t.var1[0] = 1;
        t.var1[1] = (0xC1 ^ 0xAD ^ (7 ^ 0x3F)) & (85 + 181 - 253 + 197 ^ 113 + 6 - 7 + 22 ^ -1);
        t.var1[2] = 2;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    static {
        t.var6();
        t.var5();
    }

    @Override
    public boolean al() {
        c c2 = this.ar.N();
        TileObject tileObject = c2.Q();
        if (t.var4(tileObject) && t.var3(this.au.a((Locatable)tileObject) ? 1 : 0)) {
            tileObject.interact(var2[var1[1]]);
            return var1[0];
        }
        this.au.b(c2.Y());
        0;
        return var1[1];
    }
}

