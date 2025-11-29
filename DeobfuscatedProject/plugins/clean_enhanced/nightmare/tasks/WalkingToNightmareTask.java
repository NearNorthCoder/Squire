/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Walking to nightmare", priority=10, blocking=true)
public class WalkingToNightmareTask
extends NightmareTaskBase {
    
    private static final  Logger eL;

    @Inject
    protected WalkingToNightmareTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (aD.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (((86 + 149 - 173 + 116 ^ 171 + 135 - 192 + 68) & (99 + 108 - 103 + 52 ^ 139 + 135 - 190 + 68 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void var15() {
        var2 = new int[4];
        aD.var2[0] = (0x46 ^ 6) & ~(0x64 ^ 0x24);
        aD.var2[1] = 0x5B ^ 0x71 ^ (0x89 ^ 0xAF);
        aD.var2[2] = 1;
        aD.var2[3] = 2;
    }

    private static void var16() {
        var1 = new String[var2[3]];
        aD.var1[aD.var2[0]] = "[WalkToNightmare]: We're already at the well";
        aD.var1[aD.var2[2]] = "Pool of Nightmares";
    }

    static {
        aD.var15();
        aD.var16();
        eL = LoggerFactory.getLogger(WalkingToNightmareTask.class);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var23(Object object) {
        return object != null;
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bY() {
        aD var25;
        if (aD.var24(this.cW.ae() ? 1 : 0)) {
            return var2[0];
        }
        if (aD.var24(var25.cW.s() ? 1 : 0)) {
            return var2[0];
        }
        if (aD.var24(var25.cW.ad() ? 1 : 0)) {
            return var2[0];
        }
        if (aD.var3(Movement.shouldWalk() ? 1 : 0)) {
            return var2[0];
        }
        TileObject var26 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(var1[var2[2]]));
        Player var27 = Players.getLocal();
        if (aD.var23(var26) && aD.var13(var27.distanceTo((Locatable)var26), var2[1])) {
            Log.info((String)var1[var2[0]]);
            return var2[0];
        }
        Movement.walkTo((WorldPoint)cU);
        0;
        return var2[2];
    }
}

