/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import gg.squire.nightmarezone.tasks.NightmarezoneManager;

@TaskDesc(name="Using special attack", priority=50)
public class UsingSpecialAttackTask
extends Task {
    private  a i;
    
    private final  Client ak;
    private  boolean f;
    private final  SquireNightmareZone ai;
    private final  SquireNightmareZoneConfig aj;

    static {
        m.var3();
        m.var4();
    }

    private static void var4() {
        var1 = new String[var2[4]];
        m.var1[m.var2[0]] = "None";
        m.var1[m.var2[1]] = "No Spec Gear selected";
        m.var1[m.var2[3]] = "Using spec";
    }

    public boolean run() {
        m var5;
        if (m.var6(this.aj.powerSurge() ? 1 : 0)) {
            return var2[0];
        }
        if (m.var7(var5.aj.specGear().getSelected().equals(var1[var2[0]]) ? 1 : 0)) {
            Log.error((String)var1[var2[1]]);
            return var2[0];
        }
        if (m.var6(var5.ak.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (m.var6(var5.ai.g() ? 1 : 0)) {
            return var2[0];
        }
        if (m.var7(Combat.isSpecEnabled() ? 1 : 0)) {
            return var2[0];
        }
        if (m.var8(Combat.getSpecEnergy(), var2[2])) {
            return var2[0];
        }
        Combat.toggleSpec();
        System.out.println(var1[var2[3]]);
        return var2[1];
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Inject
    public UsingSpecialAttackTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.f = var2[0];
        this.ai = squireNightmareZone;
        this.aj = squireNightmareZoneConfig;
        this.ak = client;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var2 = new int[6];
        m.var2[0] = (0x63 ^ 0x26) & ~(0x27 ^ 0x62);
        m.var2[1] = 1;
        m.var2[2] = 83 + 127 - 168 + 107 ^ 147 + 114 - 203 + 111;
        m.var2[3] = 2;
        m.var2[4] = 3;
        m.var2[5] = 34 + 161 - 182 + 163 ^ 102 + 25 - 0 + 57;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var2[0];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var2[0];
        while (m.var8(var29, var28)) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }
}

