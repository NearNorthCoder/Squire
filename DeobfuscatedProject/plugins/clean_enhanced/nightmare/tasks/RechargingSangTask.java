/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.client.game.ItemVariationMapping
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import java.util.Map;
import net.runelite.client.game.ItemVariationMapping;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Recharging sang", priority=1200, blocking=true, register=true)
public class RechargingSangTask
extends NightmareManager {

    private static void var3() {
        var1 = new int[7];
        K.var1[0] = 0xFFFFD7FB & 0x7F37;
        K.var1[1] = 0xFFFFF6BD & 0xB77;
        K.var1[2] = 3;
        K.var1[3] = (0x8F ^ 0x84) & ~(0x5E ^ 0x55);
        K.var1[4] = 2;
        K.var1[5] = 1;
        K.var1[6] = 0x55 ^ 0x5D;
    }

    @Inject
    public RechargingSangTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = ItemVariationMapping.getVariations((int)var1[0]);
        this.dq = Map.of(var1[1], var1[2]);
        this.dr = List.of(Integer.valueOf(var1[1]));
        this.do = this.dp.size() + this.dr.size();
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    static {
        K.var3();
        K.var12();
    }

    private static void var12() {
        var2 = new String[var1[5]];
        K.var2[K.var1[3]] = "Current staff {} does not contains staff ids {}";
    }

    @Override
    public boolean bY() {
        K var13;
        if (K.var5(this.cV.useFireSpells() ? 1 : 0)) {
            return var1[3];
        }
        if (K.var4(var13.cW.n() ? 1 : 0)) {
            return var1[3];
        }
        if (K.var5(var13.cW.ae() ? 1 : 0)) {
            return var1[3];
        }
        if (K.var5(var13.dp.contains(var13.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[var1[4]];
            objectArray[K.var1[3]] = var13.ca();
            objectArray[K.var1[5]] = var13.dp;
            Log.info((String)var2[var1[3]], (Object[])objectArray);
            return var1[3];
        }
        return this.cf();
    }
}

