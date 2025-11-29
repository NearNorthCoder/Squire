/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Avoiding Grasping Claws", priority=0x7FFFFFF9, blocking=true)
public class AvoidingGraspingClawsTask
extends NightmareTaskBase {
    private  List<NPC> ew;
    private static final  Logger et;
    private  NPC eA;
    private  List<WorldPoint> ev;
    private  List<WorldArea> ey;
    
    private  RectangularArea ex;
    private  List<NPC> eB;
    private  WorldPoint ez;
    private  int[] cN;
    private final  f eu;

    private static  int h(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static  int i(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint cG() {
        void var14_16;
        void var1;
        void var2;
        ax var3;
        void var4;
        NPC nPC = SquireNightmarePlugin.d();
        WorldArea worldArea = nPC.getWorldArea();
        int n2 = worldArea.getX();
        int n3 = worldArea.getY();
        int n4 = n2 + worldArea.getWidth() - lllIllllIIlI[0];
        int n5 = n3 + worldArea.getHeight() - lllIllllIIlI[0];
        RectangularArea rectangularArea = e.ay();
        WorldPoint worldPoint3 = new WorldPoint(n2, n3, lllIllllIIlI[3]);
        WorldPoint worldPoint4 = new WorldPoint(n4, n5, lllIllllIIlI[3]);
        WorldPoint worldPoint5 = new WorldPoint(n2, n5, lllIllllIIlI[3]);
        WorldPoint worldPoint6 = new WorldPoint(n4, n3, lllIllllIIlI[3]);
        WorldPoint[] worldPointArray = new WorldPoint[lllIllllIIlI[4]];
        worldPointArray[ax.lllIllllIIlI[1]] = worldPoint3;
        worldPointArray[ax.lllIllllIIlI[0]] = worldPoint4;
        worldPointArray[ax.lllIllllIIlI[2]] = worldPoint5;
        worldPointArray[ax.lllIllllIIlI[3]] = worldPoint6;
        List<WorldPoint> list = Arrays.asList(worldPointArray);
        WorldPoint worldPoint7 = Players.getLocal().getWorldLocation();
        if (ax.lIIIlllIIIlIIIl(e.AvoidingGraspingClawsTask().isEmpty() ? 1 : 0)) {
            void var5;
            Stream<WorldPoint> var6;
            WorldPoint var7;
            Stream<WorldPoint> stream;
            if (ax.lIIIlllIIIlIIII(this.cM.am() ? 1 : 0)) {
                stream = worldArea.getMeleeTiles(this.cL).stream().filter(worldPoint2 -> {
                    boolean bl;
                    if (ax.lIIIlllIIIlIlII(worldPoint2.distanceTo(worldPoint7), lllIllllIIlI[3])) {
                        bl = lllIllllIIlI[0];

                        if ((0x58 ^ 0x5C) == -1) {
                            return false;
                        }
                    } else {
                        bl = lllIllllIIlI[1];
                    }
                    return bl;
                });

                }
            } else {
                stream = var4.getMeleeTiles(var3.cL).stream().filter(arg_0 -> ax.o((WorldPoint)var2, arg_0));
            }
            if (ax.lIIIlllIIIlIIlI(var7 = (WorldPoint)var3.a(var6 = stream).min(Comparator.comparingInt(arg_0 -> ax.n((WorldPoint)var2, arg_0))).orElse(null))) {
                List var8 = var2.toWorldArea(lllIllllIIlI[5], lllIllllIIlI[5]).toWorldPointList();
                var7 = var3.a(var8.stream()).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.getMeleeTiles(this.cL).contains(worldPoint))).min(Comparator.comparingInt(arg_0 -> ax.m((WorldPoint)var2, arg_0))).orElse(null);
                Log.info((String)("[AvoidShadows]: Using shroom melee avoidance via pnm melee points. closest melee shroom tile: " + var7));
            }
            if (ax.lIIIlllIIIlIIlI(var7)) {
                Log.info((String)("[AvoidShadows]: Using shroom melee avoidance via player area points. closest melee shroom tile: " + var7));
                var7 = ((Stream)var5.stream().filter(worldPoint -> {
                    boolean bl;
                    if (ax.lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                        bl = lllIllllIIlI[0];

                        if (((0x44 ^ 0xA) & ~(0xD5 ^ 0x9B)) > 1) {
                            return false;
                        }
                    } else {
                        bl = lllIllllIIlI[1];
                    }
                    return bl;
                }).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).parallel()).filter(worldPoint2 -> this.a(this.ez, (WorldPoint)worldPoint2).stream().noneMatch(worldPoint -> this.ey.stream().anyMatch(worldArea -> worldArea.contains(worldPoint)))).min(Comparator.comparingInt(arg_0 -> ax.l((WorldPoint)var2, arg_0))).orElse(null);
            }
            if (ax.lIIIlllIIIlIIlI(var7)) {
                Log.warn((String)lllIllllIIIl[lllIllllIIlI[3]]);
                var7 = var5.stream().filter(worldPoint -> {
                    boolean bl;
                    if (ax.lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                        bl = lllIllllIIlI[0];

                    } else {
                        bl = lllIllllIIlI[1];
                    }
                    return bl;
                }).min(Comparator.comparingInt(arg_0 -> ax.k((WorldPoint)var2, arg_0))).orElse(null);
            }
            return var7;
        }
        if (ax.lIIIlllIIIlIIlI(var1)) {
            WorldPoint var6 = var3.b(var4.getMeleeTiles(var3.cL).stream()).filter(arg_0 -> ax.j((WorldPoint)var2, arg_0)).min(Comparator.comparingInt(arg_0 -> ax.i((WorldPoint)var2, arg_0))).orElse(null);
            if (ax.lIIIlllIIIlIIlI(var6)) {
                Log.info((String)lllIllllIIIl[lllIllllIIlI[4]]);
                List var7 = var2.toWorldArea(lllIllllIIlI[6], lllIllllIIlI[6]).toWorldPointList();
                var6 = var3.b(var7.stream()).min(Comparator.comparingInt(arg_0 -> ax.h((WorldPoint)var2, arg_0))).orElse(null);
            }
            return var6;
        }
        WorldPoint var6 = null;
        Stream<WorldPoint> stream = var3.b(var4.getMeleeTiles(var3.cL).stream()).filter(arg_0 -> ax.g((WorldPoint)var2, arg_0));
        void v3 = var1;
        Objects.requireNonNull(v3);

        var6 = stream.filter(arg_0 -> ((RectangularArea)v3).contains(arg_0)).min(Comparator.comparingInt(arg_0 -> ax.f((WorldPoint)var2, arg_0))).orElse(null);
        if (ax.lIIIlllIIIlIIlI(var6)) {
            Log.info((String)lllIllllIIIl[lllIllllIIlI[6]]);
            List var7 = var2.toWorldArea(lllIllllIIlI[6], lllIllllIIlI[6]).toWorldPointList();
            Stream<WorldPoint> stream2 = var3.b(var7.stream());
            void v5 = var1;
            Objects.requireNonNull(v5);

            var6 = stream2.filter(arg_0 -> ((RectangularArea)v5).contains(arg_0)).min(Comparator.comparingInt(arg_0 -> ax.e((WorldPoint)var2, arg_0))).orElse(null);
        }
        return var14_16;
    }

    private static  boolean o(WorldPoint worldPoint, WorldPoint worldPoint2) {
        boolean bl;
        if (ax.lIIIlllIIIlIlII(worldPoint2.distanceTo(worldPoint), lllIllllIIlI[7])) {
            bl = lllIllllIIlI[0];

            if (((0xD ^ 0x21) & ~(0x23 ^ 0xF)) != 0) {
                return false;
            }
        } else {
            bl = lllIllllIIlI[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cH() {
        WorldArea worldArea;
        int[] nArray = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC nPC2 = NPCs.getAll((int[])nArray).stream().filter(nPC -> {
            int n2;
            if (ax.lIIIlllIIIlIIIl(nPC.isDead() ? 1 : 0)) {
                String[] stringArray = new String[lllIllllIIlI[0]];
                stringArray[ax.lllIllllIIlI[1]] = lllIllllIIIl[lllIllllIIlI[7]];
                if (ax.lIIIlllIIIlIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllllIIlI[0];

                    if (-2 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIllllIIlI[1];
            return n2 != 0;
        }).filter(nPC -> {
            int n2;
            if (ax.lIIIlllIIIlIIII(this.cM.ag.containsKey(nPC.getId()) ? 1 : 0) && ax.lIIIlllIIIlIlIl(this.cM.ag.get(nPC.getId()), lllIllllIIlI[8])) {
                n2 = lllIllllIIlI[0];

                if (1 >= (0x26 ^ 0x33 ^ (0x61 ^ 0x70))) {
                    return ((150 + 61 - 208 + 155 ^ 137 + 127 - 261 + 151) & (0x48 ^ 0 ^ (0xE8 ^ 0xA4) ^ -1)) != 0;
                }
            } else {
                n2 = lllIllllIIlI[1];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        List<Object> list = this.ev;
        int n2 = lllIllllIIlI[7];
        list = list.stream().filter(worldPoint -> {
            boolean bl;
            if (ax.lIIIlllIIIlIlII(worldPoint.distanceTo(this.ez), n2)) {
                bl = lllIllllIIlI[0];

                if (1 == 2) {
                    return false;
                }
            } else {
                bl = lllIllllIIlI[1];
            }
            return bl;
        }).collect(Collectors.toList());
        Stream<WorldPoint> stream = this.e(list);
        WorldPoint worldPoint2 = SquireNightmarePlugin.e();
        if (ax.lIIIlllIIIlIIlI(nPC2)) {
            worldArea = worldPoint2.toWorldArea();

            }
        } else {
            void var9;
            WorldArea var10 = var9.getWorldArea();
        }
        return stream.min(Comparator.comparingInt(object -> ((WorldPoint)object).distanceTo(worldPoint2)).thenComparingInt(object -> ((WorldPoint)object).distanceTo(worldArea)).thenComparingInt(object -> ((WorldPoint)object).distanceTo(this.ez))).orElse(null);
    }

    @Inject
    public AvoidingGraspingClawsTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
        this.eu = f2;
    }

    private static  boolean j(WorldPoint worldPoint, WorldPoint worldPoint2) {
        boolean bl;
        if (ax.lIIIlllIIIlIlII(worldPoint2.distanceTo(worldPoint), lllIllllIIlI[7])) {
            bl = lllIllllIIlI[0];

            if (((175 + 17 - 174 + 159 ^ 70 + 56 - 5 + 19) & (100 + 25 - 65 + 80 ^ 93 + 47 - -25 + 12 ^ -1)) <= -1) {
                return ((0xD5 ^ 0x81 ^ (0x65 ^ 0x37)) & (0x76 ^ 0x4C ^ (0x78 ^ 0x44) ^ -1)) != 0;
            }
        } else {
            bl = lllIllllIIlI[1];
        }
        return bl;
    }

    private static  int e(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

        return String.valueOf(var11);
    }

    private static  int l(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static  int n(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static  int f(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private Stream<WorldPoint> a(Stream<WorldPoint> stream) {
        return this.b((Stream)stream.parallel()).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(worldPoint2 -> this.a(this.ez, (WorldPoint)worldPoint2).stream().noneMatch(worldPoint -> this.ey.stream().anyMatch(worldArea -> worldArea.contains(worldPoint))));
    }

    private static boolean lIIIlllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIIIlIIII(int n2) {
        return n2 != 0;
    }

    private Stream<WorldPoint> b(Stream<WorldPoint> stream) {
        return stream.filter(worldPoint -> {
            boolean bl;
            if (ax.lIIIlllIIIlIlII(worldPoint.distanceTo((Locatable)Players.getLocal()), lllIllllIIlI[5])) {
                bl = lllIllllIIlI[0];

                if (3 == 0) {
                    return ((0xBA ^ 0xBC ^ (0x82 ^ 0x9D)) & (24 + 62 - -7 + 38 ^ 96 + 54 - 72 + 76 ^ -1)) != 0;
                }
            } else {
                bl = lllIllllIIlI[1];
            }
            return bl;
        }).filter(worldPoint -> {
            int n2;
            if (ax.lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint) ? 1 : 0) && ax.lIIIlllIIIlIIIl(this.cS.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                n2 = lllIllllIIlI[0];

                if (((0xB2 ^ 0xA0) & ~(0xAC ^ 0xBE)) > 0) {
                    return false;
                }
            } else {
                n2 = lllIllllIIlI[1];
            }
            return n2 != 0;
        }).filter(worldPoint -> this.ew.stream().noneMatch(nPC -> nPC.getWorldArea().contains(worldPoint)));
    }

    private WorldPoint cI() {
        return this.b(e.aw().toWorldPointList().stream()).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(this.ez))).orElse(null);
    }

    private static  int m(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private WorldPoint cJ() {
        return this.b(e.aw().toWorldPointList().parallelStream()).filter(worldPoint -> {
            RectangularArea rectangularArea = e.ay();
            if (ax.lIIIlllIIIlIIlI(rectangularArea)) {
                return lllIllllIIlI[0];
            }
            return rectangularArea.contains(worldPoint);
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(this.ez))).orElse(null);
    }

    private Stream<WorldPoint> e(List<WorldPoint> list) {
        return this.b(list.parallelStream()).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(worldPoint2 -> this.a(this.ez, (WorldPoint)worldPoint2).stream().noneMatch(worldPoint -> this.ey.stream().anyMatch(worldArea -> worldArea.contains(worldPoint))));
    }

    static {
        ax.lIIIlllIIIIllll();
        ax.lIIIlllIIIIlllI();
        et = LoggerFactory.getLogger(AvoidingGraspingClawsTask.class);
    }

    @Override
    public boolean bY() {
        ax var12;
        int n2;
        this.ey = e.AvoidingGraspingClawsTask();
        this.ex = e.ay();
        this.ez = Players.getLocal().getWorldLocation();
        if (ax.lIIIlllIIIlIIII(this.cM.ap())) {
            n2 = lllIllllIIlI[0];

            if ((60 + 89 - -3 + 13 ^ 74 + 24 - 57 + 120) == ((42 + 81 - -10 + 87 ^ 57 + 85 - -3 + 4) & (0x64 ^ 0x47 ^ (0x78 ^ 0x12) ^ -1))) {
                return ((0x45 ^ 0x49 ^ (0x9D ^ 0x98)) & (0x89 ^ 0xBF ^ (0x79 ^ 0x46) ^ -1)) != 0;
            }
        } else {
            n2 = lllIllllIIlI[1];
        }
        int var13 = n2;
        var12.ev = e.aw().toWorldPointList();
        if (ax.lIIIlllIIIlIIIl(var13)) {
            return lllIllllIIlI[1];
        }
        if (ax.lIIIlllIIIlIIIl(var12.cM.Y().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ax.lIIIlllIIIlIIIl(var12.cS.getWorldArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lllIllllIIlI[1];
        }
        var12.cN = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        var12.eA = NPCs.getNearest((WorldPoint)var12.ez, (int[])var12.cN);
        var12.ew = NPCs.getAll((int[])SquireNightmarePlugin.s.stream().mapToInt(Integer::intValue).toArray());
        if (ax.lIIIlllIIIlIIlI(var12.eA)) {
            et.info(lllIllllIIIl[lllIllllIIlI[1]]);
            WorldPoint var14 = var12.cG();
            return var12.j(var14);
        }
        var12.eB = NPCs.getAll(nPC -> {
            int n2;
            if (ax.lIIIlllIIIlIIII(SquireNightmarePlugin.q.contains(nPC.getId()) ? 1 : 0)) {
                String[] stringArray = new String[lllIllllIIlI[0]];
                stringArray[ax.lllIllllIIlI[1]] = lllIllllIIIl[lllIllllIIlI[9]];
                if (ax.lIIIlllIIIlIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllllIIlI[0];

                    if (3 != 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIllllIIlI[1];
            return n2 != 0;
        });
        if (ax.lIIIlllIIIlIIll(var12.ex)) {
            if (ax.lIIIlllIIIlIIII(var12.ex.contains(var12.ez) ? 1 : 0)) {
                return var12.j(var12.cJ());
            }
            WorldPoint var14 = var12.b(var12.ex.toWorldPointList().stream()).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(this.ez))).orElse(null);
            Log.info((String)("[AvoidShadows]: Player is not in flower area, walking to closest safe area point: " + var14));
            return var12.j(var14);
        }
        if (ax.lIIIlllIIIlIIIl(var12.ey.isEmpty() ? 1 : 0)) {
            Log.info((String)lllIllllIIIl[lllIllllIIlI[0]]);
            WorldPoint var14 = var12.cH();
            return var12.j(var14);
        }
        Log.info((String)lllIllllIIIl[lllIllllIIlI[2]]);
        return this.j(this.cI());
    }

    private static  boolean g(WorldPoint worldPoint, WorldPoint worldPoint2) {
        boolean bl;
        if (ax.lIIIlllIIIlIlII(worldPoint2.distanceTo(worldPoint), lllIllllIIlI[7])) {
            bl = lllIllllIIlI[0];

            }
        } else {
            bl = lllIllllIIlI[1];
        }
        return bl;
    }

    private static void lIIIlllIIIIlllI() {
        lllIllllIIIl = new String[lllIllllIIlI[10]];
        ax.lllIllllIIIl[ax.lllIllllIIlI[1]] = "[AvoidShadows]: No active totems found, walking to corner";
        ax.lllIllllIIIl[ax.lllIllllIIlI[0]] = "[AvoidShadows]: Shrooms are present, using shroom avoidance";
        ax.lllIllllIIIl[ax.lllIllllIIlI[2]] = "[AvoidShadows]: No shrooms or flowers present, normal dodging to totem";
        ax.lllIllllIIIl[ax.lllIllllIIlI[3]] = "[AvoidShadows]: Final resort to find a pathable tile during shrooms.";
        ax.lllIllllIIIl[ax.lllIllllIIlI[4]] = "[AvoidShadows]: (NO FLOWERS) Using normal melee avoidance via player area points.";
        ax.lllIllllIIIl[ax.lllIllllIIlI[6]] = "[AvoidShadows]: (FLOWERS) Using normal melee avoidance via player area points.";
        ax.lllIllllIIIl[ax.lllIllllIIlI[7]] = "Charge";
        ax.lllIllllIIIl[ax.lllIllllIIlI[9]] = "Charge";
    }

    private static boolean lIIIlllIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIIIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIIIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static  int k(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static boolean lIIIlllIIIlIIll(Object object) {
        return object != null;
    }
}

