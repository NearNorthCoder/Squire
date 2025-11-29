/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.client.game.ItemVariationMapping
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.client.game.ItemVariationMapping;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Recharging trident", priority=1200, blocking=true, register=true)
public class RechargingTridentTask
extends NightmareManager {

    private static boolean var3(int n2) {
        return n2 == 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        O.var10();
        O.var11();
    }

    private static void var10() {
        var1 = new int[9];
        O.var1[0] = -(0xFFFFBD9D & 0x4BF7) & (0xFFFFBBF7 & Short.MAX_VALUE);
        O.var1[1] = -(0xFFFFD57F & 0x2FE2) & (0xFFFFB7F7 & 0x7FEF);
        O.var1[2] = 1;
        O.var1[3] = 0xFFFFC6B2 & 0x3B7D;
        O.var1[4] = 0xFFFFEFF3 & 0x123E;
        O.var1[5] = -(0xFFFFF6CE & 0x7933) & (0xFFFFFF7B & 0x72AF);
        O.var1[6] = 0x73 ^ 0x3E ^ (0x56 ^ 0x1E);
        O.var1[7] = (0x98 ^ 0xB0 ^ (0x69 ^ 0x3F) & ~(0x68 ^ 0x3E)) & (77 + 104 - 132 + 105 ^ 51 + 32 - 57 + 152 ^ -1);
        O.var1[8] = 2;
    }

    private static void var11() {
        var2 = new String[var1[2]];
        O.var2[O.var1[7]] = "Current staff {} does not contains staff ids {}";
    }

    @Override
    public boolean bY() {
        O var12;
        if (O.var13(this.cV.useFireSpells() ? 1 : 0)) {
            return var1[7];
        }
        if (O.var3(var12.cW.n() ? 1 : 0)) {
            return var1[7];
        }
        if (O.var13(var12.cW.ae() ? 1 : 0)) {
            return var1[7];
        }
        if (O.var13(var12.dp.contains(var12.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[var1[8]];
            objectArray[O.var1[7]] = var12.ca();
            objectArray[O.var1[2]] = var12.dp;
            Log.info((String)var2[var1[7]], (Object[])objectArray);
            return var1[7];
        }
        return this.cf();
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    @Inject
    public RechargingTridentTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = ItemVariationMapping.getVariations((int)var1[0]);
        this.dq = Map.of(var1[1], var1[2], var1[3], var1[2], var1[4], var1[2], var1[5], var1[6]);
        this.dr = List.of(Integer.valueOf(var1[1]), Integer.valueOf(var1[5]), Integer.valueOf(var1[3]), Integer.valueOf(var1[4]));
        this.do = this.dp.size() + this.dr.size();
    }
}

