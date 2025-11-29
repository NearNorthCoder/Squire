/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Avoiding Spores", priority=0x7FFFFFFA, blocking=true)
public class AvoidingSporesTask
extends NightmareManager {

    private static final  Logger eC;

    private static void var3() {
        var1 = new String[var2[2]];
        ay.var1[ay.var2[0]] = "[AvoidSpores]: No valid path to move to";
        ay.var1[ay.var2[1]] = "[AvoidSpores]: Moving to {} from {}";
    }

    private static boolean var4(int n2) {
        return n2 > 0;
    }

    @Inject
    protected AvoidingSporesTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    @Override
    public boolean bY() {
        if (ay.var4(this.cM.ap())) {
            return var2[0];
        }
        NPC var5 = SquireNightmarePlugin.d();
        WorldArea var6 = var5.getWorldArea();
        List<WorldArea> var7 = e.ax();
        if (ay.var8(var7.isEmpty() ? 1 : 0)) {
            return var2[0];
        }
        Player var9 = Players.getLocal();
        int var10 = var7.stream().anyMatch(worldArea -> worldArea.contains((Locatable)var9)) ? 1 : 0;
        if (ay.var8(var10)) {
            ay var11;
            WorldPoint var12 = var11.cT.toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if (ay.var13(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                    bl = var2[1];
                    0;
                    if (((0x6E ^ 0x5A) & ~(0x13 ^ 0x27)) != 0) {
                        return ((7 ^ 0x55) & ~(0x25 ^ 0x77)) != 0;
                    }
                } else {
                    bl = var2[0];
                }
                return bl;
            }).filter(worldPoint -> {
                boolean bl;
                if (ay.var13(var6.contains(worldPoint) ? 1 : 0)) {
                    bl = var2[1];
                    0;
                    if null != null {
                        return ((0x58 ^ 0x57) & ~(0x56 ^ 0x59)) != 0;
                    }
                } else {
                    bl = var2[0];
                }
                return bl;
            }).filter(worldPoint -> var7.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> var9.getWorldLocation().distanceTo(worldPoint))).orElse(null);
            if (!ay.var14(var12) || ay.var8(var9.getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                Log.info((String)var1[var2[0]]);
                return var2[0];
            }
            eC.info(var1[var2[1]], (Object)var12, (Object)Players.getLocal().getWorldLocation());
            var11.j(var12);
            0;
            return var2[1];
        }
        return var2[0];
    }

    static {
        ay.var15();
        ay.var3();
        eC = LoggerFactory.getLogger(AvoidingSporesTask.class);
    }

    private static void var15() {
        var2 = new int[3];
        ay.var2[0] = (0x35 ^ 0x7F) & ~(0xD5 ^ 0x9F);
        ay.var2[1] = 1;
        ay.var2[2] = 2;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var14(Object object) {
        return object != null;
    }
}

