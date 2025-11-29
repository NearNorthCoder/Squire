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
import gg.squire.minigames.tasks.NHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

        return String.valueOf(var1);
    }

    private static boolean lllllIIIlIlIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lllllIIIlIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public WaveWave31_62Task(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aD = f2;
        this.aE = squireFightCavesConfig;
        this.aF = n2;
    }

    private static boolean lllllIIIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        WorldPoint lllllllllllllllIlIIlllllIIlllIIl2;
        List lllllllllllllllIlIIlllllIIlllIlI2;
        List var2;
        int n2 = f.p();
        if (!r.lllllIIIlIIlII(n2, llIIlIIIllII[0]) || r.lllllIIIlIIlIl(n2, llIIlIIIllII[1])) {
            return llIIlIIIllII[2];
        }
        SquireFightCavesPlugin.f = llIIlIIIllII[3];
        if (r.lllllIIIlIIllI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var4;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[33]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[34])) && r.lllllIIIlIllII(var4.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];

                if (1 < 0) {
                    return false;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC var5 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var6;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[31]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[32])) && r.lllllIIIlIllII(var6.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];

                if ((0x8F ^ 0x8B) == 0) {
                    return false;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC var7 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[30]) && r.lllllIIIlIllII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllII[3];

                if (2 > (0x90 ^ 0x94)) {
                    return false;
                }
            } else {
                n2 = llIIlIIIllII[2];
            }
            return n2 != 0;
        });
        NPC var8 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var9;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[28]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[29])) && r.lllllIIIlIllII(var9.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];

                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC var10 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var11;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[26]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[27])) && r.lllllIIIlIllII(var11.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];

                if (((0x2D ^ 0x19) & ~(1 ^ 0x35)) != 0) {
                    return false;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC var12 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var13;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[24]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[25])) && r.lllllIIIlIllII(var13.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];

                if (((0x1D ^ 0x33) & ~(0x70 ^ 0x5E)) >= 1) {
                    return false;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        if (r.lllllIIIlIIlll(var12) && r.lllllIIIlIIlll(var10) && r.lllllIIIlIlIII(f.WaveWave31_62Task(), f.t()) && r.lllllIIIlIlIIl(f.WaveWave31_62Task()) && r.lllllIIIlIlIIl(f.t()) && r.lllllIIIlIIlll(var2 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var14;
            if (!(r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[24]) && r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[25]) && r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[26]) && !r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[27]) || !r.lllllIIIlIllII(var14.isDead() ? 1 : 0))) {
                bl = llIIlIIIllII[3];

                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        }))) {
            Movement.setDestination((WorldPoint)var2.getWorldLocation());
            return llIIlIIIllII[2];
        }
        n.G();
        if (r.lllllIIIlIlIII(f.p(), llIIlIIIllII[4]) && r.lllllIIIlIIlll(var10)) {
            var2 = var12.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(var2) ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[2]];
                List lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList();
                WorldPoint lllllllllllllllIlIIlllllIIlllIIl2 = lllllllllllllllIlIIlllllIIlllIlI2.stream().filter(worldPoint -> {
                    int n2;
                    if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(var2.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                        n2 = llIIlIIIllII[3];

                        if (((0x82 ^ 0xAC ^ (0x33 ^ 0x25)) & (0xFA ^ 0xC0 ^ 2 ^ -1)) > 0) {
                            return ((0xB0 ^ 0xC4 ^ (0x60 ^ 0x55)) & (0x7B ^ 0x63 ^ (0x13 ^ 0x4A) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIlIIIllII[2];
                    }
                    return n2 != 0;
                }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
                if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2)) {
                    Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                    return llIIlIIIllII[2];
                }
            }
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[3]];
            var10.interact(llIIlIIIIIII[llIIlIIIllII[6]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var3) && r.lllllIIIlIlIll(var3.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[7]) && (!r.lllllIIIlIllII(var3.isMoving() ? 1 : 0) || r.lllllIIIlIlIlI(var3.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), var3.getName())) && r.lllllIIIlIllII(var3.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[8]];
            var3.interact(llIIlIIIIIII[llIIlIIIllII[7]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var10) && r.lllllIIIlIIlll(var12) && r.lllllIIIlIIlll(var8) && r.lllllIIIlIlIll(var8.getWorldLocation().distanceTo(var10.getWorldLocation()), llIIlIIIllII[9]) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(n.c(var10.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(var10.isMoving() ? 1 : 0) && r.lllllIIIlIIlIl(var10.getWorldLocation().distanceTo(n.an), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(var10.getWorldLocation().distanceTo(n.am), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(var10.getWorldLocation()), llIIlIIIllII[5])) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[9]];
            var8.interact(llIIlIIIIIII[llIIlIIIllII[5]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var10) && r.lllllIIIlIIlll(var12) && r.lllllIIIlIllII(n.c(var10.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(var10.isMoving() ? 1 : 0) && r.lllllIIIlIIlIl(var10.getWorldLocation().distanceTo(n.an), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(var10.getWorldLocation().distanceTo(n.am), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(var10.getWorldLocation()), llIIlIIIllII[5])) {
            if (r.lllllIIIlIllIl(Players.getLocal().getInteracting())) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[10]];
                var12.interact(llIIlIIIIIII[llIIlIIIllII[11]]);
            }
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var10) && r.lllllIIIlIlIll(var10.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[12]) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIlIlI(n.c(var10.getWorldArea().toWorldPointList()) ? 1 : 0) && !r.lllllIIIlIlIlI(n.F() ? 1 : 0) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), var10.getName())) && r.lllllIIIlIllII(var10.isDead() ? 1 : 0)) {
            if (!r.lllllIIIlIllII(n.c(var10.getWorldArea().toWorldPointList()) ? 1 : 0) || r.lllllIIIlIlIlI(var10.isMoving() ? 1 : 0)) {
                n.e(var10);
                return llIIlIIIllII[2];
            }
            if (r.lllllIIIlIllII(n.c(var10.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(Players.getLocal().isMoving() ? 1 : 0) && r.lllllIIIlIllII(var10.isMoving() ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[13]];
                var10.interact(llIIlIIIIIII[llIIlIIIllII[14]]);
                return llIIlIIIllII[2];
            }
        }
        if (r.lllllIIIlIIlll(var12) && r.lllllIIIlIllII(var12.isDead() ? 1 : 0) && r.lllllIIIlIlIlI(n.c(var2 = var12.getWorldArea().toWorldPointList()) ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[15]];
            lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList();
            lllllllllllllllIlIIlllllIIlllIIl2 = lllllllllllllllIlIIlllllIIlllIlI2.stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(var2.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];

                    if ((0xA1 ^ 0xA5) < 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlIIIllII[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return llIIlIIIllII[2];
            }
        }
        if (r.lllllIIIlIIlll(var8) && r.lllllIIIlIlIll(var8.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[16]) && r.lllllIIIlIllIl(var10) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), var8.getName())) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(var8.isDead() ? 1 : 0)) {
            var2 = var8.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(var2) ? 1 : 0) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2 = (WorldPoint)(lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList()).stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(var2.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];

                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlIIIllII[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return llIIlIIIllII[2];
            }
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[17]];
            var8.interact(llIIlIIIIIII[llIIlIIIllII[18]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var7) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), var7.getName())) && r.lllllIIIlIllII(var7.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[19]];
            var7.interact(llIIlIIIIIII[llIIlIIIllII[20]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var5) && r.lllllIIIlIllIl(var10) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(var5.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[21]];
            var5.interact(llIIlIIIIIII[llIIlIIIllII[22]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var12) && r.lllllIIIlIllIl(var10) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(var12.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[16]];
            var2 = var12.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(var2) ? 1 : 0) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2 = (WorldPoint)(lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList()).stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(var2.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];

                    if (((0x85 ^ 0xB8 ^ (0x27 ^ 0x4F)) & (0xC1 ^ 0xB0 ^ (0x1C ^ 0x38) ^ -1)) > 0) {
                        return ((21 + 152 - 4 + 62 ^ 125 + 28 - 9 + 36) & (0x34 ^ 0x70 ^ (0x5E ^ 0x49) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIIIllII[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return llIIlIIIllII[2];
            }
            var12.interact(llIIlIIIIIII[llIIlIIIllII[23]]);
            return llIIlIIIllII[2];
        }
        return llIIlIIIllII[2];
    }

    private static boolean lllllIIIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllIIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIIIlIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIIIlIllIl(Object object) {
        return object == null;
    }

    private static boolean lllllIIIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lllllIIIlIIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllIIIlIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llllIllllIllll() {
        llIIlIIIIIII = new String[llIIlIIIllII[12]];
        r.llIIlIIIIIII[r.llIIlIIIllII[2]] = "Dodge mager";
        r.llIIlIIIIIII[r.llIIlIIIllII[3]] = "Attacking melee";
        r.llIIlIIIIIII[r.llIIlIIIllII[6]] = "Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[8]] = "Attacking bird";
        r.llIIlIIIIIII[r.llIIlIIIllII[7]] = "Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[9]] = "Attacking ranger";
        r.llIIlIIIIIII[r.llIIlIIIllII[5]] = "Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[10]] = "Attacking mager";
        r.llIIlIIIIIII[r.llIIlIIIllII[11]] = "Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[13]] = "Attacking melee";
        r.llIIlIIIIIII[r.llIIlIIIllII[14]] = "Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[15]] = "Dodge mager";
        r.llIIlIIIIIII[r.llIIlIIIllII[17]] = "Attack ranger";
        r.llIIlIIIIIII[r.llIIlIIIllII[18]] = ",";
        r.llIIlIIIIIII[r.llIIlIIIllII[19]] = "Attacking small blob";
        r.llIIlIIIIIII[r.llIIlIIIllII[20]] = "Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[21]] = "Attacking big blob";
        r.llIIlIIIIIII[r.llIIlIIIllII[22]] = "Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[16]] = "Attacking mager";
        r.llIIlIIIIIII[r.llIIlIIIllII[23]] = "Attack";
    }

    private static boolean lllllIIIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        r.lllllIIIlIIIll();
        r.llllIllllIllll();
    }
}

