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

@TaskDesc(name="Recharging Shadow (rich)", priority=1200, blocking=true, register=true)
public class RechargingShadowRichTask
extends NightmareManager {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    static {
        M.var4();
        M.var5();
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bY() {
        M var12;
        if (M.var3(this.cV.useFireSpells() ? 1 : 0)) {
            return var1[5];
        }
        if (M.var13(var12.cW.n() ? 1 : 0)) {
            return var1[5];
        }
        if (M.var3(var12.cW.ae() ? 1 : 0)) {
            return var1[5];
        }
        if (M.var3(var12.dp.contains(var12.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[var1[2]];
            objectArray[M.var1[5]] = var12.ca();
            objectArray[M.var1[6]] = var12.dp;
            Log.info((String)var2[var1[5]], (Object[])objectArray);
            return var1[5];
        }
        return this.cf();
    }

    @Inject
    public RechargingShadowRichTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = ItemVariationMapping.getVariations((int)var1[0]);
        this.dq = Map.of(var1[1], var1[2], var1[3], var1[4]);
        this.dr = List.of(Integer.valueOf(var1[1]), Integer.valueOf(var1[3]));
        this.do = this.dp.size() + this.dr.size();
    }

    private static void var5() {
        var2 = new String[var1[6]];
        M.var2[M.var1[5]] = "Current staff {} does not contains staff ids {}";
    }

    private static void var4() {
        var1 = new int[7];
        M.var1[0] = -(0xFFFFFDD1 & 0x72F) & (0xFFFFEFBF & 0x7FCB);
        M.var1[1] = 0xFFFFEE36 & 0x13FF;
        M.var1[2] = 2;
        M.var1[3] = 0xFFFF8277 & 0x7FBA;
        M.var1[4] = 0xB9 ^ 0xBC;
        M.var1[5] = (46 + 164 - 83 + 57 ^ 48 + 14 - 50 + 160) & (0xDF ^ 0x96 ^ (0x21 ^ 0x7C) ^ -1);
        M.var1[6] = 1;
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }
}

