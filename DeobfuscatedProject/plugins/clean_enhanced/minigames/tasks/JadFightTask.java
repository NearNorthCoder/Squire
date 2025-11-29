/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.CHelper;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.MinigamesManager;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="jad fight", priority=10)
public class JadFightTask
extends Task {
    private final  f au;
    
    private final  n aw;
    
    private final  SquireFightCavesConfig av;

    @Inject
    public JadFightTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.au = f2;
        this.av = squireFightCavesConfig;
        this.aw = n2;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-(0x6B ^ 0x78 ^ (0x92 ^ 0x84)) < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        List var13;
        WorldPoint var14;
        void var15;
        NPC nPC2 = NPCs.getNearest((int[])c.v);
        if nPC2 == null {
            return 0;
        }
        SquireFightCavesPlugin.f = 1;
        NPC var16 = NPCs.getNearest(arg_0 -> o.a((NPC)var15, arg_0));
        NPC var17 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var18;
            if (!((nPC.getId() != 7) && (nPC.getId() != 8) && (nPC.getId() != 9) && (nPC.getId() != var1[10]) && !(nPC.getId() == 7) || !(var18.isDead( == 0) ? 1 : 0) || !(var18.getInteracting() == var18.getInteracting()2)))) {
                n2 = 1;
                0;
                if (2 < 0) {
                    return ((0xC5 ^ 0xAF ^ (0x36 ^ 0x17)) & (0x40 ^ 0x3C ^ (0x86 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if (var16 == null && var17 != null) {
            SquireFightCavesPlugin.h = var2[0];
            if ((Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
            var17.interact(var2[1]);
            return 0;
        }
        if (var16 == null && (Players.getLocal( == null).getInteracting())) {
            SquireFightCavesPlugin.h = var2[2];
            if ((Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
            var15.interact(var2[3]);
            return 0;
        }
        List var19 = var15.getWorldArea().toWorldPointList();
        if ((n.clllllllllllllllIlIlIIIlllIlIlIlI) && (var14 = WorldPoint != null(var13 = Players.getLocal().getWorldLocation().createWorldArea(4).toWorldPointList()).stream().filter(worldPoint -> {
            int n2;
            if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var19.contains(worldPoint == 0) ? 1 : 0) && (n.a(worldPoint == 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if (3 == -1) {
                    return ((0x50 ^ 0x7E) & ~(0x4B ^ 0x65)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
            Movement.setDestination((WorldPoint)var14);
            return 0;
        }
        if (var16 != null && (!(var16.isMoving( != 0) ? 1 : 0) || (var16.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 4))) {
            o var20;
            SquireFightCavesPlugin.h = var2[5];
            if ((Combat.getAttackStyle() != Combat.getAttackStyle()2) && (var20.av.avoidDefXp( == 0) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
            }
            var16.interact(var2[6]);
            return 0;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(NPC nPC, NPC nPC2) {
        int n2;
        NPC var21;
        void var22;
        if ((!(nPC2.getId() != 7) || !(nPC2.getId() != 8) || !(nPC2.getId() != 9) || !(nPC2.getId() != var1[10]) || (nPC2.getId() == 7)) && (var22.getWorldLocation().distanceTo(var21.getWorldLocation()) <= var1[11]) && (var22.isDead( == 0) ? 1 : 0) && (var22.getInteracting() != var22.getInteracting()2))) {
            n2 = 1;
            0;
            if (1 != 1) {
                return ((0x55 ^ 0x34) & ~(0x7C ^ 0x1D)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }
}

