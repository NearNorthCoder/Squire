/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.Prayer;

@TaskDesc(name="Handling Obelisk Prayers", priority=0x7FFFFFFF)
public class HandlingObeliskPrayersTask
extends ToaManager {

    @Inject
    public HandlingObeliskPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    @Override
    public List<Prayer> E() {
        return List.of(this.H());
    }

    @Override
    public boolean I() {
        return this.C();
    }

    @Override
    public n J() {
        return this.aT.prayFlickObelisk();
    }

    @Override
    public boolean C() {
        return this.aS.a(nPC -> nPC.getName().equals(var2[var1[1]]));
    }

    private static void var3() {
        var1 = new int[4];
        F.var1[0] = -(0xFFFFC4CF & 0x7FB8) & (0xFFFFFFD7 & Short.MAX_VALUE);
        F.var1[1] = (0xD1 ^ 0xB4 ^ (0x2B ^ 0x2C)) & (0x57 ^ 0xE ^ (0x48 ^ 0x73) ^ -1);
        F.var1[2] = 1;
        F.var1[3] = 2;
    }

    @Override
    public int HandlingObeliskPrayersTask() {
        return var1[0];
    }

    static {
        F.var3();
        F.var4();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var2 = new String[var1[2]];
        F.var2[F.var1[1]] = "Obelisk";
    }
}

