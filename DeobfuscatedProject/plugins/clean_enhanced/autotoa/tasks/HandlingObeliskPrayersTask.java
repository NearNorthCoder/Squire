/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Prayer;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling Obelisk Prayers", priority=0x7FFFFFFF)
public class HandlingObeliskPrayersTask
extends AutotoaManager {

    @Override
    public boolean aL() {
        return this.cm.a(nPC -> nPC.getName().equals(var2[var1[1]]));
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    @Override
    public List<Prayer> aN() {
        return List.of(this.aQ());
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        aD.var9();
        aD.var10();
    }

    private static void var10() {
        var2 = new String[var1[2]];
        aD.var2[aD.var1[1]] = "Obelisk";
    }

    @Override
    public int aO() {
        return var1[0];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    @Inject
    public HandlingObeliskPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    private static void var9() {
        var1 = new int[5];
        aD.var1[0] = 0xFFFFBBFC & 0x7F53;
        aD.var1[1] = (7 ^ 0x57) & ~(0xFF ^ 0xAF);
        aD.var1[2] = 1;
        aD.var1[3] = 0x2F ^ 0x27;
        aD.var1[4] = 2;
    }
}

