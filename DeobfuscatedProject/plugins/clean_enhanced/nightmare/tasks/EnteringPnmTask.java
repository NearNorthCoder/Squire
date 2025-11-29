/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Entering PNM", priority=500, blocking=true)
public class EnteringPnmTask
extends NightmareTaskBase {
    private static final  Logger eI;

    @Inject
    protected EnteringPnmTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void var3() {
        var2 = new int[7];
        aA.var2[0] = (0xC7 ^ 0x84) & ~(0xF3 ^ 0xB0);
        aA.var2[1] = 1;
        aA.var2[2] = 2;
        aA.var2[3] = 3;
        aA.var2[4] = 0xE6 ^ 0xA5 ^ (0x5A ^ 0x1D);
        aA.var2[5] = 0xCA ^ 0x90 ^ (0x2A ^ 0x75);
        aA.var2[6] = 0x14 ^ 0x2A ^ (0x16 ^ 0x20);
    }

    private static void var4() {
        var1 = new String[var2[5]];
        aA.var1[aA.var2[0]] = "you like to attempt";
        aA.var1[aA.var2[1]] = "still like to";
        aA.var1[aA.var2[2]] = "you sure you wish to begin";
        aA.var1[aA.var2[3]] = "Drink-from";
        aA.var1[aA.var2[4]] = "Pool of Nightmares";
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (aA.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Override
    public boolean bY() {
        aA var16;
        if (aA.var17(this.cV.assistantMode() ? 1 : 0)) {
            return var2[0];
        }
        if (aA.var17(var16.cW.ad() ? 1 : 0)) {
            return var2[0];
        }
        if (aA.var17(var16.cV.useFireSpells() ? 1 : 0) && aA.var17(var16.cW.av() ? 1 : 0)) {
            return var2[0];
        }
        if (aA.var18(Movement.shouldWalk() ? 1 : 0)) {
            return var2[0];
        }
        if (!aA.var18(Dialog.getName().contains(var1[var2[0]]) ? 1 : 0) || aA.var17(Dialog.getName().contains(var1[var2[1]]) ? 1 : 0)) {
            Dialog.chooseOption((int)var2[1]);
            0;
            return var2[1];
        }
        if (aA.var17(Dialog.getName().contains(var1[var2[2]]) ? 1 : 0)) {
            Dialog.chooseOption((int)var2[2]);
            0;
            return var2[1];
        }
        TileObject var19 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(var1[var2[4]]));
        if (aA.var20(var19)) {
            var19.interact(var1[var2[3]]);
            return var2[1];
        }
        return var2[0];
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var20(Object object) {
        return object != null;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static boolean var18(int n2) {
        return n2 == 0;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    static {
        aA.var3();
        aA.var4();
        eI = LoggerFactory.getLogger(EnteringPnmTask.class);
    }
}

