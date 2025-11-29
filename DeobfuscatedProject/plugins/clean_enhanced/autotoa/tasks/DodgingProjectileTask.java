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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.MovingToBestSpotTask;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging projectile", priority=100, register=true, blocking=true)
public class DodgingProjectileTask
extends AutotoaManager {
    @Inject
    protected  bl eH;
    @Inject
    private  bb eJ;
    @Inject
    private  bd eK;
    
    @Inject
    private  aZ eI;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    protected DodgingProjectileTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        bf.var6();
        bf.var7();
    }

    private static  boolean c(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var8;
        bf var9;
        Set<WorldPoint> set = this.bU();
        if (bf.var10(set.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        if (bf.var10(var9.bR() ? 1 : 0)) {
            return var1[0];
        }
        Player var11 = var9.cu.getLocalPlayer();
        if (bf.var10(var8.stream().noneMatch(worldPoint -> worldPoint.equals((Object)var11.getWorldLocation())) ? 1 : 0)) {
            return var1[0];
        }
        Actor var12 = var11.getInteracting();
        NPC var13 = var9.bO();
        if (bf.var3(var13)) {
            return var1[0];
        }
        if (bf.var4(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        var9.aY.a(var1[1]);
        WorldPoint var14 = var9.bT();
        Comparator<Object> var15 = Comparator.comparingDouble(object -> ((WorldPoint)object).distanceToPath(this.cu, var11.getWorldLocation())).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(var14)));
        if (!bf.var5(var12, var13) || !bf.var16(var12) || bf.var10(var12.getName().toLowerCase().contains(var2[var1[0]]) ? 1 : 0)) {
            WorldArea var17 = var13.getWorldArea();
            Stream<WorldPoint> stream = var17.offset(var1[2]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bf.var4(var17.contains(worldPoint) ? 1 : 0)) {
                    bl2 = var1[2];
                    0;
                    if (-1 >= ((1 ^ 0x19 ^ (0x44 ^ 0x61)) & (54 + 116 - 112 + 69 ^ (0x10 ^ 0x52) ^ -1))) {
                        return ((0x14 ^ 0x75 ^ (0xA0 ^ 0x8C)) & (179 + 181 - 182 + 58 ^ 54 + 34 - -14 + 59 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[0];
                }
                return bl2;
            });
            WorldArea worldArea = var17;
            Objects.requireNonNull(worldArea);
            0;
            WorldPoint var18 = stream.filter(arg_0 -> ((WorldArea)worldArea).isInMeleeDistance(arg_0)).filter(arg_0 -> bf.e((Set)var8, arg_0)).filter(Reachable::isWalkable).min(var15).orElse(null);
            if (bf.var3(var18)) {
                var18 = var17.offset(var1[3]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bf.var4(var17.contains(worldPoint) ? 1 : 0)) {
                        bl2 = var1[2];
                        0;
                        if null != null {
                            return ((0x18 ^ 0x37) & ~(0x57 ^ 0x78)) != 0;
                        }
                    } else {
                        bl2 = var1[0];
                    }
                    return bl2;
                }).filter(arg_0 -> bf.d((Set)var8, arg_0)).filter(Reachable::isWalkable).min(var15).orElse(null);
                if (bf.var3(var18) && bf.var3(var18 = (WorldPoint)var11.getWorldArea().offset(var1[4]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bf.var4(var17.contains(worldPoint) ? 1 : 0)) {
                        bl2 = var1[2];
                        0;
                        if (-1 > ((0x9E ^ 0xC2) & ~(0x1E ^ 0x42))) {
                            return ((0x46 ^ 0x68) & ~(0xB5 ^ 0x9B)) != 0;
                        }
                    } else {
                        bl2 = var1[0];
                    }
                    return bl2;
                }).filter(arg_0 -> bf.c((Set)var8, arg_0)).filter(Reachable::isWalkable).min(var15).orElse(null))) {
                    return var1[0];
                }
                var9.eI.sleep(var1[4]);
            }
            Movement.setDestination((WorldPoint)var18);
            return var1[2];
        }
        WorldPoint var17 = var12.getWorldArea().offset(var1[2]).toWorldPointList().stream().filter(Reachable::isWalkable).filter(arg_0 -> bf.b((Set)var8, arg_0)).filter(worldPoint -> var12.getWorldArea().isInMeleeDistance(worldPoint)).filter(worldPoint -> {
            boolean bl2;
            if (bf.var4(var12.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                bl2 = var1[2];
                0;
                if (2 >= (7 + 21 - -134 + 24 ^ 148 + 162 - 284 + 164)) {
                    return ((105 + 31 - 122 + 234 ^ 94 + 118 - 45 + 3) & (0x76 ^ 0x7B ^ (0xDA ^ 0x85) ^ -1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(var11.getWorldLocation()))).orElse(var12.getWorldLocation());
        Movement.setDestination((WorldPoint)var17);
        if (bf.var4(var12.getWorldArea().isInMeleeDistance(var17) ? 1 : 0)) {
            var9.eJ.sleep(var1[3]);
            var9.eK.sleep(var1[3]);
        }
        return var1[2];
    }

    private static  boolean e(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    private static  boolean d(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    private static void var7() {
        var2 = new String[var1[2]];
        bf.var2[bf.var1[0]] = "egg";
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[0];
        while (bf.var28(var27, var26)) {
            char var29 = var25[var27];
            var22.append((char)(var29 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (((0x25 ^ 0x2C ^ (0x9E ^ 0x91)) & (2 ^ (0xA1 ^ 0xA5) ^ -1)) <= 1) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static void var6() {
        var1 = new int[5];
        bf.var1[0] = (0x75 ^ 9 ^ (0xEC ^ 0xB1)) & (0x54 ^ 0x12 ^ (0xE6 ^ 0x81) ^ -1);
        bf.var1[1] = 0xAE ^ 0x9E;
        bf.var1[2] = 1;
        bf.var1[3] = 3;
        bf.var1[4] = 0x9D ^ 0x98;
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static  boolean b(Set set, WorldPoint worldPoint) {
        boolean bl2;
        if (bf.var4(set.contains(worldPoint) ? 1 : 0)) {
            bl2 = var1[2];
            0;
            if (1 <= ((0x3B ^ 3) & ~(0x37 ^ 0xF))) {
                return ((0xAE ^ 0xAA) & ~(0x9A ^ 0x9E)) != 0;
            }
        } else {
            bl2 = var1[0];
        }
        return bl2;
    }

    private static boolean var28(int n2, int n3) {
        return n2 < n3;
    }
}

