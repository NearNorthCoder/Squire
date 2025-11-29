/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Recharging trident (sea trident)", priority=1200, blocking=true, register=true)
public class RechargingTridentSeaTridentTask
extends NightmareManager {

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var1 = new String[var2[8]];
        L.var1[L.var2[13]] = "Current staff {} does not contains staff ids {}";
    }

    @Inject
    public RechargingTridentSeaTridentTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = List.of(Integer.valueOf(var2[0]), Integer.valueOf(var2[1]), Integer.valueOf(var2[2]), Integer.valueOf(var2[3]), Integer.valueOf(var2[4]));
        this.dq = Map.of(var2[5], var2[6], var2[7], var2[8], var2[9], var2[8], var2[10], var2[11]);
        this.dr = List.of(Integer.valueOf(var2[12]), Integer.valueOf(var2[10]), Integer.valueOf(var2[7]), Integer.valueOf(var2[9]));
        this.do = this.dp.size() + this.dr.size();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    static {
        L.var12();
        L.var4();
    }

    @Override
    public boolean bY() {
        L var13;
        if (L.var11(this.cV.useFireSpells() ? 1 : 0)) {
            return var2[13];
        }
        if (L.var3(var13.cW.n() ? 1 : 0)) {
            return var2[13];
        }
        if (L.var11(var13.cW.ae() ? 1 : 0)) {
            return var2[13];
        }
        if (L.var11(var13.dp.contains(var13.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[var2[14]];
            objectArray[L.var2[13]] = var13.ca();
            objectArray[L.var2[8]] = var13.dp;
            Log.info((String)var1[var2[13]], (Object[])objectArray);
            return var2[13];
        }
        return this.cf();
    }

    private static void var12() {
        var2 = new int[16];
        L.var2[0] = -(0xFFFFE371 & 0x5CFF) & (0xFFFFEEFE & 0x7FF5);
        L.var2[1] = 0xFFFFBEAB & 0x6FD7;
        L.var2[2] = -(0xFFFF8E6F & 0x79DD) & (0xFFFFDFFF & 0x7F5E);
        L.var2[3] = 0xFFFFFF5D & 0x57B2;
        L.var2[4] = 0xFFFFFEF5 & 0x2F8B;
        L.var2[5] = 0xFFFFBFEB & 0x43F7;
        L.var2[6] = 0x5E ^ 0x54;
        L.var2[7] = 0xFFFFF6BF & 0xB70;
        L.var2[8] = 1;
        L.var2[9] = 0xFFFF8EFB & 0x7336;
        L.var2[10] = 0xFFFFDE6B & 0x23BE;
        L.var2[11] = 0xCC ^ 0x97 ^ (0x68 ^ 0x36);
        L.var2[12] = -(0xFFFFAC6E & 0x5BF3) & (0xFFFFFBFF & 0x3EE7);
        L.var2[13] = 1 & ~1;
        L.var2[14] = 2;
        L.var2[15] = 0x12 ^ 0x1A;
    }
}

