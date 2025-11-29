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
 *  net.unethicalite.client.Static
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
import net.unethicalite.client.Static;

@TaskDesc(name="wave 15 to 30 Task", priority=10)
public class Wave15To30Task
extends Task {
    private final  n az;
    private final  f ax;
    
    private final  SquireFightCavesConfig ay;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        NPC var9;
        int n2 = f.Wave15To30Task();
        if (!(n2 < 0) || (n2 <= 1)) {
            return 2;
        }
        SquireFightCavesPlugin.f = 3;
        if ((Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        NPC var10 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var11;
            if ((!(nPC.getId() != var1[25]) || (nPC.getId() == var1[26])) && (var11.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 5) && (var11.isDead( == 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if ((0x95 ^ 0xC5 ^ (0x3A ^ 0x6E)) <= 1) {
                    return ((89 + 38 - 36 + 147 ^ 122 + 175 - 295 + 188) & (71 + 101 - 84 + 39 ^ (0x78 ^ 0x57) ^ -1)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        NPC var12 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var13;
            if ((!(nPC.getId() != var1[23]) || (nPC.getId() == var1[24])) && (var13.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if (3 <= 0) {
                    return ((150 + 108 - 252 + 241 ^ 93 + 109 - 42 + 25) & (0x23 ^ 0x2E ^ (0x50 ^ 0x13) ^ -1)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        NPC var14 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getId() == var1[22]) && (nPC.isDead( == 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if ((0x6A ^ 0x5C ^ (0x2D ^ 0x1F)) < 1) {
                    return ((145 + 139 - 137 + 97 ^ 38 + 131 - 103 + 97) & (0x2C ^ 0x6D ^ (0xA7 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        NPC var15 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var16;
            if ((!(nPC.getId() != var1[18]) || (nPC.getId() == var1[19])) && (var16.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if (((0x4A ^ 0x6C ^ (0x7E ^ 0x17)) & (0x45 ^ 9 ^ 3 ^ -1)) > (0x3B ^ 0x3E ^ 1)) {
                    return ((0x34 ^ 0x52 ^ (0x4E ^ 0x33)) & (83 + 80 - 12 + 21 ^ 178 + 111 - 222 + 116 ^ -1)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        NPC var17 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var18;
            if ((!(nPC.getId() != var1[20]) || (nPC.getId() == var1[21])) && (var18.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if ((4 + 12 - -73 + 56 ^ 18 + 120 - 10 + 21) <= 0) {
                    return ((0xBF ^ 0xC7 ^ (7 ^ 0x30)) & (0x2B ^ 0x52 ^ (0xBD ^ 0x8B) ^ -1)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        if (!(var15 != null && var17 != null && (f.r() == f.u()) && (f.r( > 0)) && (f.u( > 0)) && !(var9 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var19;
            if (!((nPC.getId( != null) != var1[18]) && (nPC.getId() != var1[19]) && (nPC.getId() != var1[20]) && !(nPC.getId() == var1[21]) || !(var19.isDead( == 0) ? 1 : 0))) {
                bl = 3;
                0;
                if null != null {
                    return ((0x35 ^ 0x22) & ~(0x45 ^ 0x52)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        })))) {
            // empty if block
        }
        n.G();
        if ((f.D == 4) && var17 != null && (var17.isDead( == 0) ? 1 : 0) && (Players.getLocal( == null).getInteracting())) {
            SquireFightCavesPlugin.h = var2[2];
            var17.interact(var2[3]);
            return 2;
        }
        if (var10 != null && (var10.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 5) && (!(var10.isMoving( == 0) ? 1 : 0) || (var10.getWorldArea( != 0).canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && (!(Players.getLocal( != null).getInteracting()) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var10.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[6];
            var10.interact(var2[7]);
            return 2;
        }
        if (var17 != null && var15 != null && (Players.getLocal( == null).getInteracting()) && (n.c(var17.getWorldArea( == 0).toWorldPointList()) ? 1 : 0) && (var17.getWorldLocation().distanceTo(n.an) > 8) && (var17.getWorldLocation().distanceTo(n.am) > 8) && (var17.isMoving( == 0) ? 1 : 0) && (Players.getLocal().getWorldLocation().distanceTo(var17.getWorldLocation()) > 9)) {
            SquireFightCavesPlugin.h = var2[5];
            var15.interact(var2[9]);
            return 2;
        }
        if (var17 != null && var10 == null && (f.D != 4) && (var17.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= var1[10]) && (!(Players.getLocal( != null).getInteracting()) || (n.c(var17.getWorldArea( != 0).toWorldPointList()) ? 1 : 0) && !(n.F( != 0) ? 1 : 0) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var17.isDead( == 0) ? 1 : 0)) {
            if (!(n.c(var17.getWorldArea( == 0).toWorldPointList()) ? 1 : 0) || (var17.isMoving( != 0) ? 1 : 0)) {
                n.e(var17);
            }
            if ((n.c(var17.getWorldArea( == 0).toWorldPointList()) ? 1 : 0) && (Players.getLocal( == 0).isMoving() ? 1 : 0) && (var17.isMoving( == 0) ? 1 : 0)) {
                SquireFightCavesPlugin.h = var2[var1[11]];
                var17.interact(var2[8]);
                return 2;
            }
        }
        if (var15 != null && var17 == null && (Players.getLocal( == null).getInteracting()) && (var15.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[var1[12]];
            var15.interact(var2[var1[13]]);
            return 2;
        }
        if (var14 != null && var17 == null && (!(Players.getLocal( != null).getInteracting()) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var14.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[var1[14]];
            var14.interact(var2[var1[15]]);
            return 2;
        }
        if (var12 != null && var17 == null && (Players.getLocal( == null).getInteracting()) && (var12.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[var1[16]];
            var12.interact(var2[var1[17]]);
            return 2;
        }
        return 2;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = 2;
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = 2;
        while (var34 < var33) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var29);
    }

    @Inject
    public Wave15To30Task(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.ax = f2;
        this.ay = squireFightCavesConfig;
        this.az = n2;
    }

}

