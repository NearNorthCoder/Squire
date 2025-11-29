/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

@TaskDesc(name="Getting Killcount", priority=5)
public class GettingKillcountTask
extends Task {
    
    private static final  WorldPoint aI;
    
    private final  Client aK;
    private final  l aJ;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        E var3;
        if ((this.aJ.B( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.aJ.F() >= var3.R())) {
            return 0;
        }
        Player var4 = Players.getLocal();
        if ((var4.getInteracting( != null))) {
            return 0;
        }
        NPC var5 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.isDead( == 0) ? 1 : 0) && (nPC.getName( != 0).equals(var1[3]) ? 1 : 0) && (nPC.distanceTo(aI) <= var2[14])) {
                n2 = 3;
                0;
                if (-(0x27 ^ 0x23) > 0) {
                    return ((0xC9 ^ 0xAB) & ~(0xC9 ^ 0xAB)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var5 == null {
            if ((Players.getLocal().distanceTo(aI) <= 1)) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if ((world.isMembers( != 0) ? 1 : 0) && (world.isNormal( != 0) ? 1 : 0)) {
                        n2 = 3;
                        0;
                        if ((2 & ~2) != 0) {
                            return ((0x1F ^ 0x21) & ~(0x4D ^ 0x73)) != 0;
                        }
                    } else {
                        n2 = 0;
                    }
                    return n2 != 0;
                }));
                var3.sleep(2);
                return 3;
            }
            return 0;
        }
        var2_2.interact(var1[0]);
        this.sleep(4);
        return 3;
    }

    static {
        E.var6();
        E.var7();
        aI = new WorldPoint(var2[15], var2[16], 4);
    }

    @Inject
    public GettingKillcountTask(l l2) {
        this.aJ = l2;
        this.aK = Static.getClient();
    }

    private int R() {
        E var8;
        if ((this.aK.getVarbitValue(5) == 4)) {
            return 6;
        }
        if ((var8.aK.getVarbitValue(7) == 4)) {
            return 8;
        }
        if ((var8.aK.getVarbitValue(9) == 4)) {
            return var2[10];
        }
        if ((var8.aK.getVarbitValue(var2[11]) == 4)) {
            return var2[12];
        }
        return var2[13];
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (((0xB1 ^ 0xAA ^ (4 ^ 0x7F)) & (166 + 74 - 101 + 82 ^ 100 + 84 - 177 + 182 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }
}

