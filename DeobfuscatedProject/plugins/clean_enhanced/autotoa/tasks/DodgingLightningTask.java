/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AttackingFinalWardenTask;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging lightning", priority=50, blocking=true, register=true)
public class DodgingLightningTask
extends AutotoaManager {
    private  int gC;
    @Inject
    private  bL gB;
    
    private static final  int gy;
    private static final  int gv;
    private final  Map<GraphicsObject, Integer> gA;
    @Inject
    private  i i;
    
    private static final  int gz;
    private static final  Point gw;
    private static final  int gx;

    static {
        bJ.var3();
        bJ.var4();
        gz = var2[3];
        gx = var2[1];
        gv = var2[2];
        gy = var2[4];
        gw = new Point(var2[11], var2[12]);
    }

    private static boolean var5(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (bJ.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean var17(int n2, int n3) {
        return n2 == n3;
    }

    private static void var4() {
        var1 = new String[var2[13]];
        bJ.var1[bJ.var2[0]] = "Not on an unsafe enough tile to have to move";
        bJ.var1[bJ.var2[6]] = "Not on a super unsafe tile and no good tile to move to";
        bJ.var1[bJ.var2[5]] = "No decent worldpoint found and we are super unsafe, finding ok tile";
        bJ.var1[bJ.var2[7]] = "Tanking some damage, unavoidable";
        bJ.var1[bJ.var2[3]] = "Staying where we are as it is the safest spot currently";
    }

    private int b(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        return Optional.ofNullable(map.get(worldPoint)).map(GraphicsObject::getFrame).orElse(var2[10]);
    }

    private static boolean var18(int n2, int n3) {
        return n2 >= n3;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (bJ.var17(graphicsObject.getId(), var2[2])) {
            this.gA.put(graphicsObject, this.cu.getTickCount() + var2[7]);
            0;
            return;
        }
        this.gA.put(graphicsObject, this.cu.getTickCount() + var2[8]);
        0;
    }

    private int a(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        int n2 = worldPoint.equals((Object)Players.getLocal().getWorldLocation());
        int n3 = this.b(map, worldPoint);
        if (bJ.var19(n2) && bJ.var18(n3, var2[9])) {
            return var2[10];
        }
        return n3;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected DodgingLightningTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gA = new HashMap<GraphicsObject, Integer>();
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static boolean var26(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var6_6;
        WorldPoint var27;
        Object var28;
        bJ var29;
        if (bJ.var19(this.cq() ? 1 : 0)) {
            return var2[0];
        }
        HashSet<WorldPoint> var30 = new HashSet<WorldPoint>();
        HashSet<WorldPoint> var31 = new HashSet<WorldPoint>();
        HashMap<WorldPoint, GraphicsObject> var32 = new HashMap<WorldPoint, GraphicsObject>();
        Iterator var33 = var29.cu.getGraphicsObjects().iterator();
        while (bJ.var34(var33.hasNext() ? 1 : 0)) {
            var28 = (GraphicsObject)var33.next();
            var27 = WorldPoint.fromLocal((Client)var29.cu, (LocalPoint)var28.getLocation());
            if (bJ.var17(var28.getId(), var2[1])) {
                var31.add(var27);
                0;
                0;
                if (2 != 3) continue;
                return ((0x2E ^ 0x24) & ~(0xA ^ 0)) != 0;
            }
            if (bJ.var17(var28.getId(), var2[2]) && bJ.var26(var28.getFrame(), var2[3])) {
                var30.add(var27);
                0;
            }
            if (bJ.var17(var28.getId(), var2[2])) {
                0;
                if (-1 < 3) continue;
                return ((132 + 185 - 265 + 138 ^ 168 + 174 - 310 + 155) & (0xA8 ^ 0x94 ^ (0x56 ^ 0x6F) ^ -1)) != 0;
            }
            if (bJ.var15(var28.getFrame(), var2[4])) {
                var32.put(var27, (GraphicsObject)var28);
                0;
            }
            0;
            if (1 != ((0xC7 ^ 0x83) & ~(0x22 ^ 0x66))) continue;
            return ((0x42 ^ 2) & ~(0xCF ^ 0x8F)) != 0;
        }
        var33 = Players.getLocal().getWorldLocation();
        var28 = Comparator.comparingDouble(object -> this.a((Map<WorldPoint, GraphicsObject>)var32, (WorldPoint)object)).thenComparingDouble(object -> ((WorldPoint)object).distanceToHypotenuse(this.co().getWorldArea().getCenter()));
        var27 = var33.createWorldArea(var2[5]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bJ.var19(var30.contains(worldPoint) ? 1 : 0)) {
                bl2 = var2[6];
                0;
                if (2 < 0) {
                    return ((71 + 90 - 65 + 56 ^ 67 + 2 - 15 + 104) & (0x46 ^ 0x66 ^ (0x7D ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }).filter(worldPoint -> {
            boolean bl2;
            if (bJ.var17(this.a(gw).getWorldY(), worldPoint.getWorldY())) {
                bl2 = var2[6];
                0;
                if (1 <= 0) {
                    return ((0x4E ^ 0x71 ^ (0x6A ^ 0x1F)) & (0xF3 ^ 0x96 ^ (0x84 ^ 0xAB) ^ -1)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min((Comparator<WorldPoint>)var28).orElse(null);
        int var35 = var29.a(var32, (WorldPoint)var33);
        if (bJ.var19(var30.contains(var33) ? 1 : 0) && bJ.var5(var35, var2[3])) {
            Log.info((String)var1[var2[0]]);
            return var2[0];
        }
        if (bJ.var36(var27)) {
            if (bJ.var19(var30.contains(var33) ? 1 : 0)) {
                Log.info((String)var1[var2[6]]);
                return var2[0];
            }
            Log.info((String)var1[var2[5]]);
            var27 = var33.createWorldArea(var2[5]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bJ.var19(worldPoint.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    bl2 = var2[6];
                    0;
                    if (-3 > 0) {
                        return ((0x59 ^ 0x66) & ~(0x3F ^ 0)) != 0;
                    }
                } else {
                    bl2 = var2[0];
                }
                return bl2;
            }).filter(worldPoint -> {
                boolean bl2;
                if (bJ.var19(var30.contains(worldPoint) ? 1 : 0)) {
                    bl2 = var2[6];
                    0;
                    if (((0xE ^ 5) & ~(0x3C ^ 0x37)) <= -1) {
                        return ((0xB8 ^ 0xB1) & ~(0x9E ^ 0x97)) != 0;
                    }
                } else {
                    bl2 = var2[0];
                }
                return bl2;
            }).filter(worldPoint -> {
                boolean bl2;
                if (bJ.var17(this.a(gw).getWorldY(), worldPoint.getWorldY())) {
                    bl2 = var2[6];
                    0;
                    if (2 < -1) {
                        return ((0xAB ^ 0xC1 ^ (0xC ^ 0x70)) & (0x80 ^ 0xC6 ^ (0x79 ^ 0x29) ^ -1)) != 0;
                    }
                } else {
                    bl2 = var2[0];
                }
                return bl2;
            }).filter(Reachable::isWalkable).min((Comparator<WorldPoint>)var28).orElse(null);
            if (bJ.var36(var27)) {
                Log.info((String)var1[var2[7]]);
                return var2[0];
            }
        }
        if (bJ.var34(var27.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            boolean bl2;
            Log.info((String)var1[var2[3]]);
            if (bJ.var26(var35, var2[8])) {
                bl2 = var2[6];
                0;
                if (2 == ((210 + 16 - 202 + 230 ^ 113 + 11 - 23 + 90) & (153 + 212 - 163 + 39 ^ 136 + 6 - 100 + 134 ^ -1))) {
                    return (1 & (1 ^ -1)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }
        Movement.setDestination((WorldPoint)var6_6);
        this.gC = this.cu.getTickCount();
        return var2[6];
    }

    private static void var3() {
        var2 = new int[15];
        bJ.var2[0] = (0x40 ^ 0x13) & ~(0xD8 ^ 0x8B);
        bJ.var2[1] = 0xFFFFCDB7 & 0x3ADD;
        bJ.var2[2] = -(0xFFFFCB4D & 0x77B3) & (0xFFFFCBFF & 0x7FCB);
        bJ.var2[3] = 0xCD ^ 0x9F ^ (0x3E ^ 0x68);
        bJ.var2[4] = 7 ^ 0xA;
        bJ.var2[5] = 2;
        bJ.var2[6] = 1;
        bJ.var2[7] = 3;
        bJ.var2[8] = 0xB6 ^ 0xB0;
        bJ.var2[9] = 0x80 ^ 0x8A;
        bJ.var2[10] = -1;
        bJ.var2[11] = 0x1C ^ 0x61 ^ (0xCC ^ 0xAE);
        bJ.var2[12] = 0x7C ^ 0x59;
        bJ.var2[13] = 0xA8 ^ 0xAD;
        bJ.var2[14] = 0xB ^ 0x67 ^ (0x11 ^ 0x75);
    }

        catch (Exception var42) {
            var42.printStackTrace();
            return null;
        }
    }

    private static boolean var34(int n2) {
        return n2 != 0;
    }

    private static boolean var36(Object object) {
        return object == null;
    }

    private boolean c(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        boolean bl2;
        if (bJ.var15(this.a(map, worldPoint), var2[3])) {
            bl2 = var2[6];
            0;
            if (-(0xC5 ^ 0xC1) >= 0) {
                return ((0x5B ^ 0x66) & ~(0x47 ^ 0x7A)) != 0;
            }
        } else {
            bl2 = var2[0];
        }
        return bl2;
    }
}

