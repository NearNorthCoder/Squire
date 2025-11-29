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
import java.util.Comparator;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="wave Wave31_62 Task", priority=10)
public class WaveWave31_62Task
extends Task {
    
    private final  SquireFightCavesConfig aE;
    private final  f aD;
    private final  n aF;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 2;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 2;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Inject
    public WaveWave31_62Task(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aD = f2;
        this.aE = squireFightCavesConfig;
        this.aF = n2;
    }

    public boolean run() {
        WorldPoint lllllllllllllllIlIIlllllIIlllIIl2;
        List lllllllllllllllIlIIlllllIIlllIlI2;
        List var19;
        int n2 = f.p();
        if (!(n2 >= 0) || (n2 > 1)) {
            return 2;
        }
        SquireFightCavesPlugin.f = 3;
        if ((Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        NPC var20 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var21;
            if ((!(nPC.getId() != var1[33]) || (nPC.getId() == var1[34])) && (var21.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if (1 < 0) {
                    return ((0x4D ^ 0x70) & ~(0x50 ^ 0x6D)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        NPC var22 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var23;
            if ((!(nPC.getId() != var1[31]) || (nPC.getId() == var1[32])) && (var23.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if ((0x8F ^ 0x8B) == 0) {
                    return ((0x3A ^ 2) & ~(0xFC ^ 0xC4)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        NPC var24 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getId() == var1[30]) && (nPC.isDead( == 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if (2 > (0x90 ^ 0x94)) {
                    return ((0x72 ^ 0x12) & ~(0xFA ^ 0x9A)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        NPC var25 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var26;
            if ((!(nPC.getId() != var1[28]) || (nPC.getId() == var1[29])) && (var26.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if null != null {
                    return ((0x79 ^ 0x2F) & ~(0xF1 ^ 0xA7)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        NPC var27 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var28;
            if ((!(nPC.getId() != var1[26]) || (nPC.getId() == var1[27])) && (var28.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if (((0x2D ^ 0x19) & ~(1 ^ 0x35)) != 0) {
                    return ((0x24 ^ 0x13) & ~(0xBF ^ 0x88)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        NPC var29 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var30;
            if ((!(nPC.getId() != var1[24]) || (nPC.getId() == var1[25])) && (var30.isDead( == 0) ? 1 : 0)) {
                bl = 3;
                0;
                if (((0x1D ^ 0x33) & ~(0x70 ^ 0x5E)) >= 1) {
                    return ((0x32 ^ 0x60) & ~(0x3F ^ 0x6D)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
        if (var29 != null && var27 != null && (f.WaveWave31_62Task() == f.t()) && (f.WaveWave31_62Task( > 0)) && (f.t( > 0)) && (var19 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var31;
            if (!((nPC.getId( != null) != var1[24]) && (nPC.getId() != var1[25]) && (nPC.getId() != var1[26]) && !(nPC.getId() == var1[27]) || !(var31.isDead( == 0) ? 1 : 0))) {
                bl = 3;
                0;
                if null != null {
                    return ((0x7D ^ 0x58) & ~(0x6C ^ 0x49)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        }))) {
            Movement.setDestination((WorldPoint)var19.getWorldLocation());
            return 2;
        }
        n.G();
        if ((f.p() == 4) && var27 != null) {
            var19 = var29.getWorldArea().toWorldPointList();
            if ((n.clllllllllllllllIlIIlllllIIlllIll)) {
                SquireFightCavesPlugin.h = var2[2];
                List lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(5).toWorldPointList();
                WorldPoint lllllllllllllllIlIIlllllIIlllIIl2 = lllllllllllllllIlIIlllllIIlllIlI2.stream().filter(worldPoint -> {
                    int n2;
                    if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var19.contains(worldPoint == 0) ? 1 : 0) && (n.a(worldPoint == 0) ? 1 : 0)) {
                        n2 = 3;
                        0;
                        if (((0x82 ^ 0xAC ^ (0x33 ^ 0x25)) & (0xFA ^ 0xC0 ^ 2 ^ -1)) > 0) {
                            return ((0xB0 ^ 0xC4 ^ (0x60 ^ 0x55)) & (0x7B ^ 0x63 ^ (0x13 ^ 0x4A) ^ -1)) != 0;
                        }
                    } else {
                        n2 = 2;
                    }
                    return n2 != 0;
                }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
                if lllllllllllllllIlIIlllllIIlllIIl2 != null {
                    Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                    return 2;
                }
            }
            SquireFightCavesPlugin.h = var2[3];
            var27.interact(var2[6]);
            return 2;
        }
        if (var20 != null && (var20.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 7) && (!(var20.isMoving( == 0) ? 1 : 0) || (var20.getWorldArea( != 0).canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && (!(Players.getLocal( != null).getInteracting()) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var20.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[8];
            var20.interact(var2[7]);
            return 2;
        }
        if (var27 != null && var29 != null && var25 != null && (var25.getWorldLocation().distanceTo(var27.getWorldLocation()) <= 9) && (Players.getLocal( == null).getInteracting()) && (n.c(var27.getWorldArea( == 0).toWorldPointList()) ? 1 : 0) && (var27.isMoving( == 0) ? 1 : 0) && (var27.getWorldLocation().distanceTo(n.an) > var1[10]) && (var27.getWorldLocation().distanceTo(n.am) > var1[10]) && (Players.getLocal().getWorldLocation().distanceTo(var27.getWorldLocation()) > 5)) {
            SquireFightCavesPlugin.h = var2[9];
            var25.interact(var2[5]);
            return 2;
        }
        if (var27 != null && var29 != null && (n.c(var27.getWorldArea( == 0).toWorldPointList()) ? 1 : 0) && (var27.isMoving( == 0) ? 1 : 0) && (var27.getWorldLocation().distanceTo(n.an) > var1[10]) && (var27.getWorldLocation().distanceTo(n.am) > var1[10]) && (Players.getLocal().getWorldLocation().distanceTo(var27.getWorldLocation()) > 5)) {
            if ((Players.getLocal( == null).getInteracting())) {
                SquireFightCavesPlugin.h = var2[var1[10]];
                var29.interact(var2[var1[11]]);
            }
            return 2;
        }
        if (var27 != null && (var27.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= var1[12]) && (!(Players.getLocal( != null).getInteracting()) || (n.c(var27.getWorldArea( != 0).toWorldPointList()) ? 1 : 0) && !(n.F( != 0) ? 1 : 0) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var27.isDead( == 0) ? 1 : 0)) {
            if (!(n.c(var27.getWorldArea( == 0).toWorldPointList()) ? 1 : 0) || (var27.isMoving( != 0) ? 1 : 0)) {
                n.e(var27);
                return 2;
            }
            if ((n.c(var27.getWorldArea( == 0).toWorldPointList()) ? 1 : 0) && (Players.getLocal( == 0).isMoving() ? 1 : 0) && (var27.isMoving( == 0) ? 1 : 0)) {
                SquireFightCavesPlugin.h = var2[var1[13]];
                var27.interact(var2[var1[14]]);
                return 2;
            }
        }
        if (var29 != null && (var29.isDead( == 0) ? 1 : 0) && (n.c(var19 = var29.getWorldArea( != 0).toWorldPointList()) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[var1[15]];
            lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(5).toWorldPointList();
            lllllllllllllllIlIIlllllIIlllIIl2 = lllllllllllllllIlIIlllllIIlllIlI2.stream().filter(worldPoint -> {
                int n2;
                if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var19.contains(worldPoint == 0) ? 1 : 0) && (n.a(worldPoint == 0) ? 1 : 0)) {
                    n2 = 3;
                    0;
                    if ((0xA1 ^ 0xA5) < 0) {
                        return ((0xB8 ^ 0xA7) & ~(0x14 ^ 0xB)) != 0;
                    }
                } else {
                    n2 = 2;
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if lllllllllllllllIlIIlllllIIlllIIl2 != null {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return 2;
            }
        }
        if (var25 != null && (var25.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= var1[16]) && var27 == null && (!(Players.getLocal( != null).getInteracting()) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (Players.getLocal( == null).getInteracting()) && (var25.isDead( == 0) ? 1 : 0)) {
            var19 = var25.getWorldArea().toWorldPointList();
            if ((n.clllllllllllllllIlIIlllllIIlllIll) && (lllllllllllllllIlIIlllllIIlllIIl2 = WorldPoint != null(lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(5).toWorldPointList()).stream().filter(worldPoint -> {
                int n2;
                if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var19.contains(worldPoint == 0) ? 1 : 0) && (n.a(worldPoint == 0) ? 1 : 0)) {
                    n2 = 3;
                    0;
                    if (2 <= 0) {
                        return ((0x5E ^ 0xD) & ~(0xD3 ^ 0x80)) != 0;
                    }
                } else {
                    n2 = 2;
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return 2;
            }
            SquireFightCavesPlugin.h = var2[var1[17]];
            var25.interact(var2[var1[18]]);
            return 2;
        }
        if (var24 != null && (!(Players.getLocal( != null).getInteracting()) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var24.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[var1[19]];
            var24.interact(var2[var1[20]]);
            return 2;
        }
        if (var22 != null && var27 == null && (Players.getLocal( == null).getInteracting()) && (var22.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[var1[21]];
            var22.interact(var2[var1[22]]);
            return 2;
        }
        if (var29 != null && var27 == null && (Players.getLocal( == null).getInteracting()) && (var29.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[var1[16]];
            var19 = var29.getWorldArea().toWorldPointList();
            if ((n.clllllllllllllllIlIIlllllIIlllIll) && (lllllllllllllllIlIIlllllIIlllIIl2 = WorldPoint != null(lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(5).toWorldPointList()).stream().filter(worldPoint -> {
                int n2;
                if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var19.contains(worldPoint == 0) ? 1 : 0) && (n.a(worldPoint == 0) ? 1 : 0)) {
                    n2 = 3;
                    0;
                    if (((0x85 ^ 0xB8 ^ (0x27 ^ 0x4F)) & (0xC1 ^ 0xB0 ^ (0x1C ^ 0x38) ^ -1)) > 0) {
                        return ((21 + 152 - 4 + 62 ^ 125 + 28 - 9 + 36) & (0x34 ^ 0x70 ^ (0x5E ^ 0x49) ^ -1)) != 0;
                    }
                } else {
                    n2 = 2;
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return 2;
            }
            var29.interact(var2[var1[23]]);
            return 2;
        }
        return 2;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

}

