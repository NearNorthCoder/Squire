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
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Avoiding Grasping Claws", priority=0x7FFFFFF9, blocking=true)
public class AvoidingGraspingClawsTask
extends NightmareManager {
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint cG() {
        void var14_16;
        void var9;
        void var10;
        ax var11;
        void var12;
        NPC nPC = SquireNightmarePlugin.d();
        WorldArea worldArea = nPC.getWorldArea();
        int n2 = worldArea.getX();
        int n3 = worldArea.getY();
        int n4 = n2 + worldArea.getWidth() - var2[0];
        int n5 = n3 + worldArea.getHeight() - var2[0];
        RectangularArea rectangularArea = e.ay();
        WorldPoint worldPoint3 = new WorldPoint(n2, n3, var2[3]);
        WorldPoint worldPoint4 = new WorldPoint(n4, n5, var2[3]);
        WorldPoint worldPoint5 = new WorldPoint(n2, n5, var2[3]);
        WorldPoint worldPoint6 = new WorldPoint(n4, n3, var2[3]);
        WorldPoint[] worldPointArray = new WorldPoint[var2[4]];
        worldPointArray[ax.var2[1]] = worldPoint3;
        worldPointArray[ax.var2[0]] = worldPoint4;
        worldPointArray[ax.var2[2]] = worldPoint5;
        worldPointArray[ax.var2[3]] = worldPoint6;
        List<WorldPoint> list = Arrays.asList(worldPointArray);
        WorldPoint worldPoint7 = Players.getLocal().getWorldLocation();
        if (ax.var13(e.AvoidingGraspingClawsTask().isEmpty() ? 1 : 0)) {
            void var14;
            Stream<WorldPoint> var15;
            WorldPoint var16;
            Stream<WorldPoint> stream;
            if (ax.var17(this.cM.am() ? 1 : 0)) {
                stream = worldArea.getMeleeTiles(this.cL).stream().filter(worldPoint2 -> {
                    boolean bl;
                    if (ax.var18(worldPoint2.distanceTo(worldPoint7), var2[3])) {
                        bl = var2[0];
                        0;
                        if ((0x58 ^ 0x5C) == -1) {
                            return ((0x97 ^ 0x9A) & ~(0x65 ^ 0x68)) != 0;
                        }
                    } else {
                        bl = var2[1];
                    }
                    return bl;
                });
                0;
                if null != null {
                    return null;
                }
            } else {
                stream = var12.getMeleeTiles(var11.cL).stream().filter(arg_0 -> ax.o((WorldPoint)var10, arg_0));
            }
            if (ax.var19(var16 = (WorldPoint)var11.a(var15 = stream).min(Comparator.comparingInt(arg_0 -> ax.n((WorldPoint)var10, arg_0))).orElse(null))) {
                List var20 = var10.toWorldArea(var2[5], var2[5]).toWorldPointList();
                var16 = var11.a(var20.stream()).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.getMeleeTiles(this.cL).contains(worldPoint))).min(Comparator.comparingInt(arg_0 -> ax.m((WorldPoint)var10, arg_0))).orElse(null);
                Log.info((String)("[AvoidShadows]: Using shroom melee avoidance via pnm melee points. closest melee shroom tile: " + var16));
            }
            if (ax.var19(var16)) {
                Log.info((String)("[AvoidShadows]: Using shroom melee avoidance via player area points. closest melee shroom tile: " + var16));
                var16 = ((Stream)var14.stream().filter(worldPoint -> {
                    boolean bl;
                    if (ax.var13(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                        bl = var2[0];
                        0;
                        if (((0x44 ^ 0xA) & ~(0xD5 ^ 0x9B)) > 1) {
                            return ((0x9F ^ 0xBB) & ~(0x94 ^ 0xB0)) != 0;
                        }
                    } else {
                        bl = var2[1];
                    }
                    return bl;
                }).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).parallel()).filter(worldPoint2 -> this.a(this.ez, (WorldPoint)worldPoint2).stream().noneMatch(worldPoint -> this.ey.stream().anyMatch(worldArea -> worldArea.contains(worldPoint)))).min(Comparator.comparingInt(arg_0 -> ax.l((WorldPoint)var10, arg_0))).orElse(null);
            }
            if (ax.var19(var16)) {
                Log.warn((String)var1[var2[3]]);
                var16 = var14.stream().filter(worldPoint -> {
                    boolean bl;
                    if (ax.var13(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                        bl = var2[0];
                        0;
                        if (-3 >= 0) {
                            return ((0xF0 ^ 0xA8 ^ (0x7F ^ 0x6F)) & (158 + 103 - 167 + 148 ^ 118 + 80 - 154 + 142 ^ -1)) != 0;
                        }
                    } else {
                        bl = var2[1];
                    }
                    return bl;
                }).min(Comparator.comparingInt(arg_0 -> ax.k((WorldPoint)var10, arg_0))).orElse(null);
            }
            return var16;
        }
        if (ax.var19(var9)) {
            WorldPoint var15 = var11.b(var12.getMeleeTiles(var11.cL).stream()).filter(arg_0 -> ax.j((WorldPoint)var10, arg_0)).min(Comparator.comparingInt(arg_0 -> ax.i((WorldPoint)var10, arg_0))).orElse(null);
            if (ax.var19(var15)) {
                Log.info((String)var1[var2[4]]);
                List var16 = var10.toWorldArea(var2[6], var2[6]).toWorldPointList();
                var15 = var11.b(var16.stream()).min(Comparator.comparingInt(arg_0 -> ax.h((WorldPoint)var10, arg_0))).orElse(null);
            }
            return var15;
        }
        WorldPoint var15 = null;
        Stream<WorldPoint> stream = var11.b(var12.getMeleeTiles(var11.cL).stream()).filter(arg_0 -> ax.g((WorldPoint)var10, arg_0));
        void v3 = var9;
        Objects.requireNonNull(v3);
        0;
        var15 = stream.filter(arg_0 -> ((RectangularArea)v3).contains(arg_0)).min(Comparator.comparingInt(arg_0 -> ax.f((WorldPoint)var10, arg_0))).orElse(null);
        if (ax.var19(var15)) {
            Log.info((String)var1[var2[6]]);
            List var16 = var10.toWorldArea(var2[6], var2[6]).toWorldPointList();
            Stream<WorldPoint> stream2 = var11.b(var16.stream());
            void v5 = var9;
            Objects.requireNonNull(v5);
            0;
            var15 = stream2.filter(arg_0 -> ((RectangularArea)v5).contains(arg_0)).min(Comparator.comparingInt(arg_0 -> ax.e((WorldPoint)var10, arg_0))).orElse(null);
        }
        return var14_16;
    }

    private static  boolean o(WorldPoint worldPoint, WorldPoint worldPoint2) {
        boolean bl;
        if (ax.var18(worldPoint2.distanceTo(worldPoint), var2[7])) {
            bl = var2[0];
            0;
            if (((0xD ^ 0x21) & ~(0x23 ^ 0xF)) != 0) {
                return ((0x7D ^ 0x40) & ~(0x80 ^ 0xBD)) != 0;
            }
        } else {
            bl = var2[1];
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
            if (ax.var13(nPC.isDead() ? 1 : 0)) {
                String[] stringArray = new String[var2[0]];
                stringArray[ax.var2[1]] = var1[var2[7]];
                if (ax.var17(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[0];
                    0;
                    if (-2 <= 0) return n2 != 0;
                    return ((121 + 59 - 168 + 121 ^ 77 + 41 - -8 + 11) & (50 + 109 - 157 + 139 ^ 118 + 92 - 109 + 28 ^ -1)) != 0;
                }
            }
            n2 = var2[1];
            return n2 != 0;
        }).filter(nPC -> {
            int n2;
            if (ax.var17(this.cM.ag.containsKey(nPC.getId()) ? 1 : 0) && ax.var21(this.cM.ag.get(nPC.getId()), var2[8])) {
                n2 = var2[0];
                0;
                if (1 >= (0x26 ^ 0x33 ^ (0x61 ^ 0x70))) {
                    return ((150 + 61 - 208 + 155 ^ 137 + 127 - 261 + 151) & (0x48 ^ 0 ^ (0xE8 ^ 0xA4) ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        List<Object> list = this.ev;
        int n2 = var2[7];
        list = list.stream().filter(worldPoint -> {
            boolean bl;
            if (ax.var18(worldPoint.distanceTo(this.ez), n2)) {
                bl = var2[0];
                0;
                if (1 == 2) {
                    return ((24 + 14 - -75 + 16 ^ 128 + 117 - 192 + 85) & (79 + 125 - 175 + 106 ^ 82 + 126 - 152 + 84 ^ -1)) != 0;
                }
            } else {
                bl = var2[1];
            }
            return bl;
        }).collect(Collectors.toList());
        Stream<WorldPoint> stream = this.e(list);
        WorldPoint worldPoint2 = SquireNightmarePlugin.e();
        if (ax.var19(nPC2)) {
            worldArea = worldPoint2.toWorldArea();
            0;
            if null != null {
                return null;
            }
        } else {
            void var22;
            WorldArea var23 = var22.getWorldArea();
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
        if (ax.var18(worldPoint2.distanceTo(worldPoint), var2[7])) {
            bl = var2[0];
            0;
            if (((175 + 17 - 174 + 159 ^ 70 + 56 - 5 + 19) & (100 + 25 - 65 + 80 ^ 93 + 47 - -25 + 12 ^ -1)) <= -1) {
                return ((0xD5 ^ 0x81 ^ (0x65 ^ 0x37)) & (0x76 ^ 0x4C ^ (0x78 ^ 0x44) ^ -1)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    private static  int e(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var2[1];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var2[1];
        while (ax.var21(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (3 <= 3) continue;
            return null;
        }
        return String.valueOf(var27);
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

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static void var34() {
        var2 = new int[11];
        ax.var2[0] = 1;
        ax.var2[1] = (70 + 77 - -17 + 8 ^ 112 + 115 - 202 + 126) & (0xD8 ^ 0x93 ^ (0xFC ^ 0x8C) ^ -1);
        ax.var2[2] = 2;
        ax.var2[3] = 3;
        ax.var2[4] = 0xA8 ^ 0xAC;
        ax.var2[5] = 3 + 27 - -116 + 28 ^ 74 + 92 - 131 + 127;
        ax.var2[6] = 0 ^ 5;
        ax.var2[7] = 173 + 139 - 213 + 86 ^ 127 + 129 - 119 + 54;
        ax.var2[8] = 157 + 161 - 179 + 61;
        ax.var2[9] = 0x87 ^ 0x9D ^ (0xAD ^ 0xB0);
        ax.var2[10] = 0x11 ^ 0x19;
    }

    private Stream<WorldPoint> b(Stream<WorldPoint> stream) {
        return stream.filter(worldPoint -> {
            boolean bl;
            if (ax.var18(worldPoint.distanceTo((Locatable)Players.getLocal()), var2[5])) {
                bl = var2[0];
                0;
                
            } else {
                bl = var2[1];
            }
            return bl;
        }).filter(worldPoint -> {
            int n2;
            if (ax.var13(this.cM.Y().contains(worldPoint) ? 1 : 0) && ax.var13(this.cS.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                n2 = var2[0];
                0;
                if (((0xB2 ^ 0xA0) & ~(0xAC ^ 0xBE)) > 0) {
                    return ((0x33 ^ 0x72) & ~(0x2D ^ 0x6C)) != 0;
                }
            } else {
                n2 = var2[1];
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
            if (ax.var19(rectangularArea)) {
                return var2[0];
            }
            return rectangularArea.contains(worldPoint);
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(this.ez))).orElse(null);
    }

    private Stream<WorldPoint> e(List<WorldPoint> list) {
        return this.b(list.parallelStream()).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(worldPoint2 -> this.a(this.ez, (WorldPoint)worldPoint2).stream().noneMatch(worldPoint -> this.ey.stream().anyMatch(worldArea -> worldArea.contains(worldPoint))));
    }

    static {
        ax.var34();
        ax.var35();
        et = LoggerFactory.getLogger(AvoidingGraspingClawsTask.class);
    }

    @Override
    public boolean bY() {
        ax var36;
        int n2;
        this.ey = e.AvoidingGraspingClawsTask();
        this.ex = e.ay();
        this.ez = Players.getLocal().getWorldLocation();
        if (ax.var17(this.cM.ap())) {
            n2 = var2[0];
            0;
            if ((60 + 89 - -3 + 13 ^ 74 + 24 - 57 + 120) == ((42 + 81 - -10 + 87 ^ 57 + 85 - -3 + 4) & (0x64 ^ 0x47 ^ (0x78 ^ 0x12) ^ -1))) {
                return ((0x45 ^ 0x49 ^ (0x9D ^ 0x98)) & (0x89 ^ 0xBF ^ (0x79 ^ 0x46) ^ -1)) != 0;
            }
        } else {
            n2 = var2[1];
        }
        int var37 = n2;
        var36.ev = e.aw().toWorldPointList();
        if (ax.var13(var37)) {
            return var2[1];
        }
        if (ax.var13(var36.cM.Y().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ax.var13(var36.cS.getWorldArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return var2[1];
        }
        var36.cN = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        var36.eA = NPCs.getNearest((WorldPoint)var36.ez, (int[])var36.cN);
        var36.ew = NPCs.getAll((int[])SquireNightmarePlugin.s.stream().mapToInt(Integer::intValue).toArray());
        if (ax.var19(var36.eA)) {
            et.info(var1[var2[1]]);
            WorldPoint var38 = var36.cG();
            return var36.j(var38);
        }
        var36.eB = NPCs.getAll(nPC -> {
            int n2;
            if (ax.var17(SquireNightmarePlugin.q.contains(nPC.getId()) ? 1 : 0)) {
                String[] stringArray = new String[var2[0]];
                stringArray[ax.var2[1]] = var1[var2[9]];
                if (ax.var17(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[0];
                    0;
                    if (3 != 0) return n2 != 0;
                    return ((0xC7 ^ 0x82) & ~(0xE4 ^ 0xA1)) != 0;
                }
            }
            n2 = var2[1];
            return n2 != 0;
        });
        if (ax.var39(var36.ex)) {
            if (ax.var17(var36.ex.contains(var36.ez) ? 1 : 0)) {
                return var36.j(var36.cJ());
            }
            WorldPoint var38 = var36.b(var36.ex.toWorldPointList().stream()).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(this.ez))).orElse(null);
            Log.info((String)("[AvoidShadows]: Player is not in flower area, walking to closest safe area point: " + var38));
            return var36.j(var38);
        }
        if (ax.var13(var36.ey.isEmpty() ? 1 : 0)) {
            Log.info((String)var1[var2[0]]);
            WorldPoint var38 = var36.cH();
            return var36.j(var38);
        }
        Log.info((String)var1[var2[2]]);
        return this.j(this.cI());
    }

        catch (Exception var45) {
            var45.printStackTrace();
            return null;
        }
    }

    private static  boolean g(WorldPoint worldPoint, WorldPoint worldPoint2) {
        boolean bl;
        if (ax.var18(worldPoint2.distanceTo(worldPoint), var2[7])) {
            bl = var2[0];
            0;
            if null != null {
                return ((187 + 85 - 113 + 72 ^ 94 + 43 - 36 + 62) & (0x2F ^ 0x46 ^ (0xEB ^ 0xC6) ^ -1)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    private static void var35() {
        var1 = new String[var2[10]];
        ax.var1[ax.var2[1]] = "[AvoidShadows]: No active totems found, walking to corner";
        ax.var1[ax.var2[0]] = "[AvoidShadows]: Shrooms are present, using shroom avoidance";
        ax.var1[ax.var2[2]] = "[AvoidShadows]: No shrooms or flowers present, normal dodging to totem";
        ax.var1[ax.var2[3]] = "[AvoidShadows]: Final resort to find a pathable tile during shrooms.";
        ax.var1[ax.var2[4]] = "[AvoidShadows]: (NO FLOWERS) Using normal melee avoidance via player area points.";
        ax.var1[ax.var2[6]] = "[AvoidShadows]: (FLOWERS) Using normal melee avoidance via player area points.";
        ax.var1[ax.var2[7]] = "Charge";
        ax.var1[ax.var2[9]] = "Charge";
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static boolean var18(int n2, int n3) {
        return n2 <= n3;
    }

    private static  int k(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static boolean var39(Object object) {
        return object != null;
    }
}

