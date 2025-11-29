/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.basics.combat.AgroReset.ResetPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Resetting aggro")
public class ResettingAggroTask
extends Task {
    private static  int[] lllIIllll;
    private  long bj;
    private static  String[] lllIIlllI;
    private final  ResetPlugin bi;

    public boolean run() {
        E var1;
        if ((this.bi.ae( == 0) ? 1 : 0)) {
            return 0;
        }
        long var2 = System.currentTimeMillis() - var1.bi.ag();
        if ((E.var3(var2, var1.bi.ak( < 0)[0]))) {
            return 0;
        }
        WorldPoint var4 = var1.bi.aj();
        Player var5 = Players.getLocal();
        if (!var4 != null || !(var5.isMoving( == 0) ? 1 : 0) || (var5.getInteracting( != null)) && (var1.bi.ai( != 0).equals((Object)var5.getWorldLocation()) ? 1 : 0)) {
            return 0;
        }
        List var6 = NPCs.getAll(nPC -> {
            int n2;
            if ((nPC.getInteracting() == nPC.getInteracting()2)) {
                String[] stringArray = new String[1];
                stringArray[0] = lllIIlllI[1];
                if ((nPC.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (-(0x7B ^ 0x24 ^ (2 ^ 0x59)) < 0) return n2 != 0;
                    return ((0xC8 ^ 0x8D ^ (0xAF ^ 0xB6)) & (0x4D ^ 0x71 ^ (0x7B ^ 0x1B) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if ((var6.isEmpty( == 0) ? 1 : 0)) {
            NPC var7 = (NPC)var6.get(0);
            if (var7 != null && (E.var8(var7.getWorldLocation( <= 0).distanceTo2DHypotenuse(var5.getWorldLocation()), 1.0f))) {
                var7.interact(lllIIlllI[0]);
            }
            return 0;
        }
        WorldPoint var7 = var5.getWorldLocation();
        if ((var4.equals(ObjectlIlIlIllIIlIIIl) ? 1 : 0)) {
            if ((E.var3(var1.bj, -1L == 0))) {
                var1.bj = System.currentTimeMillis();
                return 0;
            }
            long var9 = System.currentTimeMillis() - var1.bj;
            if ((E.var3(var9, var1.bi.ak( < 0)[1]))) {
                return 0;
            }
            Movement.walk((WorldPoint)var1.bi.ai());
            var1.bi.ac();
            var1.bj = -1L;
            0;
            if (-1 > 3) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            Movement.walk((WorldPoint)var4);
        }
        return 1;
    }

    @Inject
    public ResettingAggroTask(ResetPlugin resetPlugin) {
        this.bj = -1L;
        this.bi = resetPlugin;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static int var8(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
    }

    private static int var3(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 0;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 0;
        while (var24 < var23) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }
}

