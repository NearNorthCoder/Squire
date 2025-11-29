/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Moving away from Shaman", priority=55, blocking=true)
public class MovingAwayFromShamanTask
extends Task {
    private final  SquireShamanConfig as;
    private final  a ar;
    
    private final  c aq;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (u.var4(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    static {
        u.var17();
        u.var18();
    }

    private static boolean var19(int n2) {
        return n2 != 0;
    }

    @Inject
    public MovingAwayFromShamanTask(c c2, a a2, SquireShamanConfig squireShamanConfig) {
        this.aq = c2;
        this.ar = a2;
        this.as = squireShamanConfig;
    }

    private static void var17() {
        var1 = new int[6];
        u.var1[0] = (140 + 23 - 143 + 161 ^ 134 + 90 - 178 + 104) & (0x72 ^ 1 ^ (0x21 ^ 0x71) ^ -1);
        u.var1[1] = 2;
        u.var1[2] = 1;
        u.var1[3] = 3;
        u.var1[4] = 0x25 ^ 0x21;
        u.var1[5] = 0x89 ^ 0x81;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7_7;
        u var20;
        List list = NPCs.getAll(nPC -> nPC.getName().equals(var2[var1[3]]));
        if (!u.var19(this.aq.s() ? 1 : 0) || u.var16(list.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        if (u.var19(var20.ar.m() ? 1 : 0)) {
            return var1[0];
        }
        Player var21 = Players.getLocal();
        TileItem var22 = var20.ar.k().orElse(null);
        NPC var23 = Combat.getAttackableNPC(nPC -> {
            int n2;
            if (u.var19(this.as.room().x().contains(nPC.getWorldLocation()) ? 1 : 0) && u.var19(nPC.getName().equals(var2[var1[1]]) ? 1 : 0)) {
                n2 = var1[2];
                0;
                
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (u.var5(var22)) {
            var23 = Combat.getAttackableNPC(nPC -> {
                int n2;
                if (u.var19(this.as.room().x().contains(nPC.getWorldLocation()) ? 1 : 0) && u.var19(nPC.getName().equals(var2[var1[2]]) ? 1 : 0) && u.var24(nPC.getInteracting(), var21)) {
                    n2 = var1[2];
                    0;
                    if (3 < 0) {
                        return ((0xAF ^ 0x9D) & ~(0x74 ^ 0x46) & ~((0x85 ^ 0xB2) & ~(0xB1 ^ 0x86))) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            });
        }
        if (u.var3(var23)) {
            return var1[0];
        }
        NPC var25 = var23;
        if (u.var26(var25.distanceTo((Locatable)Players.getLocal()), var1[1])) {
            return var1[0];
        }
        g var27 = var20.as.room();
        Stream stream = var27.z().stream();
        c c2 = var20.aq;
        Objects.requireNonNull(c2);
        0;
        WorldPoint var28 = stream.filter(c2::a).filter(worldPoint -> {
            boolean bl;
            String[] stringArray = new String[var1[2]];
            stringArray[u.var1[0]] = var2[var1[0]];
            if (u.var26(worldPoint.distanceTo((Locatable)NPCs.getNearest((WorldPoint)worldPoint, (String[])stringArray)), var1[1])) {
                bl = var1[2];
                0;
                if ((0x5C ^ 0x58) < 0) {
                    return ((0xC3 ^ 0x97) & ~(0xC9 ^ 0x9D)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
        if (u.var3(var28)) {
            return var1[0];
        }
        Movement.walkTo((WorldPoint)var7_7, (boolean)var1[0]);
        0;
        return var1[2];
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var24(Object object, Object object2) {
        return object == object2;
    }

    private static void var18() {
        var2 = new String[var1[4]];
        u.var2[u.var1[0]] = "Lizardman shaman";
        u.var2[u.var1[2]] = "Lizardman shaman";
        u.var2[u.var1[1]] = "Lizardman shaman";
        u.var2[u.var1[3]] = "Spawn";
    }

    private static boolean var26(int n2, int n3) {
        return n2 > n3;
    }
}

