/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.NPC;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Looting", priority=500, blocking=true)
public class LootingTask
extends Task {
    private final  j eE;
    
    private final  h eG;
    private static final  Logger eD;
    private final  SquireNightmareConfig eF;
    
    private final  SquireNightmarePlugin eH;

    private static void var3() {
        var1 = new String[var2[1]];
        az.var1[az.var2[0]] = "Disturb";
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    @Inject
    public LootingTask(SquireNightmarePlugin squireNightmarePlugin, j j2, SquireNightmareConfig squireNightmareConfig, h h2) {
        this.eH = squireNightmarePlugin;
        this.eE = j2;
        this.eF = squireNightmareConfig;
        this.eG = h2;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (az.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    static {
        az.var17();
        az.var3();
        eD = LoggerFactory.getLogger(LootingTask.class);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static void var17() {
        var2 = new int[2];
        az.var2[0] = (5 ^ 0x26) & ~(0xBD ^ 0x9E);
        az.var2[1] = 1;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    public boolean run() {
        az var19;
        if (az.var4(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (az.var16(var19.eF.assistantMode() ? 1 : 0)) {
            return var2[0];
        }
        NPC var20 = SquireNightmarePlugin.d();
        if (az.var18(var20)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[az.var2[0]] = var1[var2[0]];
        if (az.var4(var20.hasAction(stringArray) ? 1 : 0)) {
            return var2[0];
        }
        boolean bl = this.eG.aG();
        this.sleep(var2[1]);
        return bl;
    }
}

