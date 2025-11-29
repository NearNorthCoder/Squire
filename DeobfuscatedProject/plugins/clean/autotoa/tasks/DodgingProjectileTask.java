/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AttackingKephriTask;
import gg.squire.autotoa.tasks.AttackingMeleeScarabTask;
import gg.squire.autotoa.tasks.AttackingSwarmsTask;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.MovingToBestSpotTask;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging projectile", priority=100, register=true, blocking=true)
public class DodgingProjectileTask
extends AutotoaTaskBase {
    @Inject
    protected  bl eH;
    @Inject
    private  bb eJ;
    @Inject
    private  bd eK;
    
    @Inject
    private  aZ eI;

    private static boolean lIlIIllllllIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIllllllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllllllIll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    protected DodgingProjectileTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        bf.lIlIIlllllIlll();
        bf.lIlIIlllllIllI();
    }

    private static  boolean c(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var1;
        bf var2;
        Set<WorldPoint> set = this.bU();
        if (bf.lIlIIllllllIII(set.isEmpty() ? 1 : 0)) {
            return llIlIllIllI[0];
        }
        if (bf.lIlIIllllllIII(var2.bR() ? 1 : 0)) {
            return llIlIllIllI[0];
        }
        Player var3 = var2.cu.getLocalPlayer();
        if (bf.lIlIIllllllIII(var1.stream().noneMatch(worldPoint -> worldPoint.equals((Object)var3.getWorldLocation())) ? 1 : 0)) {
            return llIlIllIllI[0];
        }
        Actor var4 = var3.getInteracting();
        NPC var5 = var2.bO();
        if (bf.lIlIIllllllIIl(var5)) {
            return llIlIllIllI[0];
        }
        if (bf.lIlIIllllllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        var2.aY.a(llIlIllIllI[1]);
        WorldPoint var6 = var2.bT();
        Comparator<Object> var7 = Comparator.comparingDouble(object -> ((WorldPoint)object).distanceToPath(this.cu, var3.getWorldLocation())).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(var6)));
        if (!bf.lIlIIllllllIll(var4, var5) || !bf.lIlIIlllllllII(var4) || bf.lIlIIllllllIII(var4.getName().toLowerCase().contains(llIlIllIlIl[llIlIllIllI[0]]) ? 1 : 0)) {
            WorldArea var8 = var5.getWorldArea();
            Stream<WorldPoint> stream = var8.offset(llIlIllIllI[2]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bf.lIlIIllllllIlI(var8.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIlIllIllI[2];

                    if (-1 >= ((1 ^ 0x19 ^ (0x44 ^ 0x61)) & (54 + 116 - 112 + 69 ^ (0x10 ^ 0x52) ^ -1))) {
                        return ((0x14 ^ 0x75 ^ (0xA0 ^ 0x8C)) & (179 + 181 - 182 + 58 ^ 54 + 34 - -14 + 59 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIllIllI[0];
                }
                return bl2;
            });
            WorldArea worldArea = var8;
            Objects.requireNonNull(worldArea);

            WorldPoint var9 = stream.filter(arg_0 -> ((WorldArea)worldArea).isInMeleeDistance(arg_0)).filter(arg_0 -> bf.e((Set)var1, arg_0)).filter(Reachable::isWalkable).min(var7).orElse(null);
            if (bf.lIlIIllllllIIl(var9)) {
                var9 = var8.offset(llIlIllIllI[3]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bf.lIlIIllllllIlI(var8.contains(worldPoint) ? 1 : 0)) {
                        bl2 = llIlIllIllI[2];

                        }
                    } else {
                        bl2 = llIlIllIllI[0];
                    }
                    return bl2;
                }).filter(arg_0 -> bf.d((Set)var1, arg_0)).filter(Reachable::isWalkable).min(var7).orElse(null);
                if (bf.lIlIIllllllIIl(var9) && bf.lIlIIllllllIIl(var9 = (WorldPoint)var3.getWorldArea().offset(llIlIllIllI[4]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bf.lIlIIllllllIlI(var8.contains(worldPoint) ? 1 : 0)) {
                        bl2 = llIlIllIllI[2];

                        if (-1 > ((0x9E ^ 0xC2) & ~(0x1E ^ 0x42))) {
                            return false;
                        }
                    } else {
                        bl2 = llIlIllIllI[0];
                    }
                    return bl2;
                }).filter(arg_0 -> bf.c((Set)var1, arg_0)).filter(Reachable::isWalkable).min(var7).orElse(null))) {
                    return llIlIllIllI[0];
                }
                var2.eI.sleep(llIlIllIllI[4]);
            }
            Movement.setDestination((WorldPoint)var9);
            return llIlIllIllI[2];
        }
        WorldPoint var8 = var4.getWorldArea().offset(llIlIllIllI[2]).toWorldPointList().stream().filter(Reachable::isWalkable).filter(arg_0 -> bf.b((Set)var1, arg_0)).filter(worldPoint -> var4.getWorldArea().isInMeleeDistance(worldPoint)).filter(worldPoint -> {
            boolean bl2;
            if (bf.lIlIIllllllIlI(var4.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                bl2 = llIlIllIllI[2];

                if (2 >= (7 + 21 - -134 + 24 ^ 148 + 162 - 284 + 164)) {
                    return ((105 + 31 - 122 + 234 ^ 94 + 118 - 45 + 3) & (0x76 ^ 0x7B ^ (0xDA ^ 0x85) ^ -1)) != 0;
                }
            } else {
                bl2 = llIlIllIllI[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(var3.getWorldLocation()))).orElse(var4.getWorldLocation());
        Movement.setDestination((WorldPoint)var8);
        if (bf.lIlIIllllllIlI(var4.getWorldArea().isInMeleeDistance(var8) ? 1 : 0)) {
            var2.eJ.sleep(llIlIllIllI[3]);
            var2.eK.sleep(llIlIllIllI[3]);
        }
        return llIlIllIllI[2];
    }

    private static  boolean e(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    private static  boolean d(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    private static void lIlIIlllllIllI() {
        llIlIllIlIl = new String[llIlIllIllI[2]];
        bf.llIlIllIlIl[bf.llIlIllIllI[0]] = "egg";
    }

        return String.valueOf(var10);
    }

    private static boolean lIlIIlllllllII(Object object) {
        return object != null;
    }

    private static boolean lIlIIllllllIII(int n2) {
        return n2 != 0;
    }

    private static  boolean b(Set set, WorldPoint worldPoint) {
        boolean bl2;
        if (bf.lIlIIllllllIlI(set.contains(worldPoint) ? 1 : 0)) {
            bl2 = llIlIllIllI[2];

            if (1 <= ((0x3B ^ 3) & ~(0x37 ^ 0xF))) {
                return false;
            }
        } else {
            bl2 = llIlIllIllI[0];
        }
        return bl2;
    }

    private static boolean lIlIIlllllllIl(int n2, int n3) {
        return n2 < n3;
    }
}

