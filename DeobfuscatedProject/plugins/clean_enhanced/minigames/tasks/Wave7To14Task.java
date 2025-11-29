/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.MinigamesManager;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="wave 7 to 14 Task", priority=10)
public class Wave7To14Task
extends Task {
    private final  SquireFightCavesConfig aH;
    
    private final  n aI;
    private final  f aG;

    @Inject
    public Wave7To14Task(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aG = f2;
        this.aH = squireFightCavesConfig;
        this.aI = n2;
    }

    public boolean run() {
        int n2 = f.p();
        if (!(n2 >= 0) || (n2 > 1)) {
            return 2;
        }
        SquireFightCavesPlugin.f = 3;
        if ((Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        n.G();
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var4;
            if ((!(nPC.getId() != var2[14]) || (nPC.getId() == var2[15])) && (var4.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 4) && (var4.isDead( == 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if (1 == (0x35 ^ 0x31)) {
                    return ((0x80 ^ 0xA4) & ~(0x36 ^ 0x12)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        NPC var5 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var6;
            if ((!(nPC.getId() != var2[12]) || (nPC.getId() == var2[13])) && (var6.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if ((123 + 140 - 233 + 112 ^ 65 + 20 - 2 + 55) > (0x4C ^ 0x32 ^ (0xF4 ^ 0x8E))) {
                    return ((0x11 ^ 0x2C ^ (0xC9 ^ 0xC2)) & (0x4D ^ 0x1C ^ (9 ^ 0x6E) ^ -1)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        NPC var7 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getId() == var2[11]) && (nPC.isDead( == 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if ((0xC2 ^ 0xC6) > (0x4E ^ 0x4A)) {
                    return ((0x3D ^ 0x69) & ~(0x45 ^ 0x11)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        NPC var8 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var9;
            if ((!(nPC.getId() != 9) || (nPC.getId() == var2[10])) && (var9.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if (3 < 3) {
                    return ((0xAB ^ 0xA2) & ~(0x13 ^ 0x1A)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        if (var3 != null && (var3.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 4) && (!(Players.getLocal( != null).getInteracting()) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var3.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var1[2];
            var3.interact(var1[3]);
            return 2;
        }
        if (var8 != null && var3 == null && (Players.getLocal( == null).getInteracting()) && (var8.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var1[5];
            var8.interact(var1[6]);
            return 2;
        }
        if (var7 != null && var3 == null && (!(Players.getLocal( != null).getInteracting()) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var7.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var1[7];
            var7.interact(var1[8]);
            return 2;
        }
        if (var5 != null && var3 == null && (Players.getLocal( == null).getInteracting()) && (var5.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var1[4];
            var5.interact(var1[0]);
            return 2;
        }
        return 2;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 2;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 2;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

}

