/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Disturb Nightmare", priority=250, blocking=false)
public class DisturbNightmareTask
extends Task {
    private final  h dG;
    
    private final  SquireNightmareConfig dF;
    
    private static final  Logger dE;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (ab.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        ab.var14();
        ab.var15();
        dE = LoggerFactory.getLogger(DisturbNightmareTask.class);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var22(int n2) {
        return n2 == 0;
    }

    @Inject
    public DisturbNightmareTask(SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dF = squireNightmareConfig;
        this.dG = h2;
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var15() {
        var1 = new String[var2[9]];
        ab.var1[ab.var2[0]] = "Disturb";
        ab.var1[ab.var2[1]] = "[DisturbNightmare]: No combat potions";
        ab.var1[ab.var2[2]] = "[DisturbNightmare]: Combat potions: {}";
        ab.var1[ab.var2[3]] = "[DisturbNightmare]: Not enough cleanse doses";
        ab.var1[ab.var2[4]] = "[DisturbNightmare]:  Cleanse doses: {}";
        ab.var1[ab.var2[5]] = "[DisturbNightmare]: Not enough food";
        ab.var1[ab.var2[6]] = "[DisturbNightmare]: Food: {}";
        ab.var1[ab.var2[7]] = "Disturb";
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    private static void var14() {
        var2 = new int[10];
        ab.var2[0] = (0x1F ^ 0x42) & ~(0x2D ^ 0x70);
        ab.var2[1] = 1;
        ab.var2[2] = 2;
        ab.var2[3] = 3;
        ab.var2[4] = 50 + 129 - 27 + 11 ^ 86 + 151 - 226 + 156;
        ab.var2[5] = 0x9B ^ 0x9E;
        ab.var2[6] = 107 + 36 - 49 + 35 ^ 5 + 49 - -63 + 18;
        ab.var2[7] = 0xBE ^ 0x8E ^ (0x47 ^ 0x70);
        ab.var2[8] = 0x11 ^ 3;
        ab.var2[9] = 135 + 95 - 82 + 16 ^ 62 + 26 - -34 + 50;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ab var25;
        if (ab.var23(this.dF.assistantMode() ? 1 : 0)) {
            return var2[0];
        }
        if (ab.var22(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        NPC var26 = SquireNightmarePlugin.d();
        if (ab.var24(var26)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[ab.var2[0]] = var1[var2[0]];
        if (ab.var22(var26.hasAction(stringArray) ? 1 : 0)) {
            return var2[0];
        }
        int var27 = SquireNightmarePlugin.b();
        int var28 = SquireNightmarePlugin.a();
        int var29 = SquireNightmarePlugin.c();
        if (ab.var22(var29) && ab.var22(var25.dF.continueWithNoPots() ? 1 : 0)) {
            dE.info(var1[var2[1]]);
            dE.info(var1[var2[2]], (Object)var29);
            return var25.dG.aP();
        }
        if (ab.var12(var28, var25.dF.teleportCleanse())) {
            dE.info(var1[var2[3]]);
            dE.info(var1[var2[4]], (Object)var28);
            return var25.dG.aP();
        }
        if (ab.var12(var27, var25.dF.minimumFood())) {
            dE.info(var1[var2[5]]);
            dE.info(var1[var2[6]], (Object)var27);
            return var25.dG.aP();
        }
        var1_1.interact(var1[var2[7]]);
        this.sleep(var2[8]);
        return var2[1];
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }
}

