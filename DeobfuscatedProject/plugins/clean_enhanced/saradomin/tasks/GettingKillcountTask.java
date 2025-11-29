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
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Getting Killcount", priority=5)
public class GettingKillcountTask
extends Task {
    private final  Client aw;
    private final  g au;
    private final  SquireSaraConfig av;

    private static final  WorldPoint at;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public GettingKillcountTask(g g2, SquireSaraConfig squireSaraConfig) {
        this.au = g2;
        this.av = squireSaraConfig;
        this.aw = Static.getClient();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        List<String> list;
        y var10;
        if (y.var11(this.au.s() ? 1 : 0)) {
            return var1[0];
        }
        if (y.var12(var10.au.m() ? 1 : 0)) {
            return var1[0];
        }
        if (y.var13(var10.au.q(), var10.au.r())) {
            return var1[0];
        }
        Player var14 = Players.getLocal();
        if (y.var15(var14.getInteracting())) {
            return var1[0];
        }
        if (y.var12(var10.av.kcSpirituals() ? 1 : 0)) {
            list = List.of(var2[var1[0]], var2[var1[1]]);
            0;
            if (2 == 3) {
                return ((0xED ^ 0xC1) & ~(0x46 ^ 0x6A)) != 0;
            }
        } else {
            list = List.of(var2[var1[2]]);
        }
        List<String> var16 = list;
        NPC var17 = NPCs.getNearest(nPC -> {
            int n2;
            if (y.var11(nPC.isDead() ? 1 : 0) && y.var12(var16.contains(nPC.getName()) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if ((0x28 ^ 0x2C) != (0x36 ^ 0x32)) {
                    return ((0x83 ^ 0xAE) & ~(0x8E ^ 0xA3)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (y.var9(var14.distanceTo(at), var1[3])) {
            Movement.walkTo((WorldPoint)at);
            0;
            return var1[1];
        }
        if (y.var18(var17)) {
            if (y.var19(Players.getLocal().distanceTo(at), var1[4])) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (y.var12(world.isMembers() ? 1 : 0) && y.var12(world.isNormal() ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if ((0x65 ^ 0x60) == 0) {
                            return ((0x62 ^ 0x57) & ~(0xA8 ^ 0x9D)) != 0;
                        }
                    } else {
                        n2 = var1[0];
                    }
                    return n2 != 0;
                }));
                var10.sleep(var1[5]);
                return var1[1];
            }
            return var1[0];
        }
        var3_3.interact(var2[var1[6]]);
        this.sleep(var1[2]);
        return var1[1];
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static void var21() {
        var1 = new int[10];
        y.var1[0] = (0x5F ^ 0x78) & ~(0x74 ^ 0x53);
        y.var1[1] = 1;
        y.var1[2] = 2;
        y.var1[3] = 0x71 ^ 0x5E ^ (0x61 ^ 0x48);
        y.var1[4] = 40 + 46 - -2 + 63 ^ 126 + 53 - 57 + 35;
        y.var1[5] = 0xB9 ^ 0xB6 ^ (0x44 ^ 0x4F);
        y.var1[6] = 3;
        y.var1[7] = -(0x81 ^ 0x86) & (0xFFFFDBDF & 0x2F7F);
        y.var1[8] = -(0xFFFF8735 & 0x7ACB) & (0xFFFF9EFD & 0x77B7);
        y.var1[9] = 0xCC ^ 0xC4;
    }

    private static boolean var19(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    static {
        y.var21();
        y.var28();
        at = new WorldPoint(var1[7], var1[8], var1[2]);
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = var1[0];
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = var1[0];
        while (y.var20(var37, var36)) {
            char var38 = var35[var37];
            var32.append((char)(var38 ^ var33[var34 % var33.length]));
            0;
            ++var34;
            ++var37;
            0;
            
            return null;
        }
        return String.valueOf(var32);
    }

    private static void var28() {
        var2 = new String[var1[5]];
        y.var2[y.var1[0]] = "Saradomin priest";
        y.var2[y.var1[1]] = "Spiritual mage";
        y.var2[y.var1[2]] = "Saradomin priest";
        y.var2[y.var1[6]] = "Attack";
    }

    private static boolean var13(int n2, int n3) {
        return n2 >= n3;
    }
}

