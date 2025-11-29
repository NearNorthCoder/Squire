/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.Direction
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import gg.squire.basics.chopburn.ChopBurnConfig;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Chopping and burning")
@SquireUtil
public class ChoppingAndBurningTask
extends Task {
    private  WorldPoint be;
    private  boolean bd;
    private static final  int ba;
    private  int bh;
    private final  ChopBurnConfig bc;
    private static final  String aX;
    private static final  String aZ;
    private static final  int bb;
    private static  String[] llIIlIIll;
    private  List<WorldPoint> bf;
    private static  int[] llIIlIlII;
    private static final  String aY;
    private  int bg;

    private static boolean var1(Object object) {
        return object == null;
    }

    private Optional<WorldPoint> b(List<WorldPoint> list) {
        return list.stream().filter(worldPoint -> {
            boolean bl2;
            if (C.var2(TileObjects.getAll(tileObject -> {
                int n2;
                if (C.var3(tileObject instanceof GameObject) && C.var3(tileObject.getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIlII[3];
                    0;
                    if null != null {
                        return ((0xF1 ^ 0x98 ^ (4 ^ 0x21)) & (0x4C ^ 0x12 ^ (0xF ^ 0x1D) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIlII[1];
                }
                return n2 != 0;
            }).size())) {
                bl2 = llIIlIlII[3];
                0;
                if ((0x5A ^ 0x3B ^ (0x3C ^ 0x59)) <= 0) {
                    return ((0x48 ^ 0x2F ^ (0x6C ^ 0x4F)) & (0x4C ^ 0x43 ^ (0x5C ^ 0x17) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIlIlII[1];
            }
            return bl2;
        }).max(Comparator.comparingInt(WorldPoint::getX));
    }

    static {
        C.var4();
        C.var5();
        aY = llIIlIIll[llIIlIlII[7]];
        aX = llIIlIIll[llIIlIlII[8]];
        bb = llIIlIlII[4];
        ba = llIIlIlII[2];
        aZ = llIIlIIll[llIIlIlII[6]];
    }

    private static void var4() {
        llIIlIlII = new int[11];
        C.llIIlIlII[0] = -3;
        C.llIIlIlII[1] = (0xC ^ 8) & ~(0xB4 ^ 0xB0);
        C.llIIlIlII[2] = 0x75 ^ 0x73;
        C.llIIlIlII[3] = 1;
        C.llIIlIlII[4] = 0x95 ^ 0xA1 ^ (0x5A ^ 0x7A);
        C.llIIlIlII[5] = -1;
        C.llIIlIlII[6] = 0x44 ^ 0x40;
        C.llIIlIlII[7] = 2;
        C.llIIlIlII[8] = 3;
        C.llIIlIlII[9] = 0x23 ^ 0x6A ^ (0x5E ^ 0x12);
        C.llIIlIlII[10] = 0x59 ^ 0x15 ^ (8 ^ 0x4C);
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private WorldPoint a(WorldPoint worldPoint, Direction direction) {
        if (C.var6(direction, Direction.EAST)) {
            return worldPoint.dx(llIIlIlII[3]);
        }
        return worldPoint.dx(llIIlIlII[5]);
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> X() {
        void var2_2;
        C var7;
        if (C.var1(this.be)) {
            this.be = Players.getLocal().getWorldLocation();
        }
        WorldPoint var8 = var7.be.dy(llIIlIlII[0]);
        List<WorldPoint> var9 = var7.c(var8);
        int var10 = llIIlIlII[1];
        while (C.var11(var10, llIIlIlII[2])) {
            WorldPoint var12;
            List<WorldPoint> var13;
            WorldPoint var14 = var8.dy(var10);
            List<WorldPoint> var15 = var7.c(var14);
            if (C.var16(var15.size(), var9.size())) {
                var9 = var15;
            }
            if (C.var16((var13 = var7.c(var12 = var8.dy(-var10))).size(), var9.size())) {
                var9 = var13;
            }
            ++var10;
            0;
            if ((1 ^ 5) >= ((0x6F ^ 0x79) & ~(0x10 ^ 6))) continue;
            return null;
        }
        return var2_2;
    }

    private boolean a(List<WorldPoint> list, Direction direction) {
        WorldPoint worldPoint;
        WorldPoint worldPoint2 = this.a(direction, list);
        if (C.var2(this.a(worldPoint2, worldPoint = this.a(worldPoint2, direction), direction) ? 1 : 0)) {
            return llIIlIlII[1];
        }
        list.add(worldPoint);
        0;
        return llIIlIlII[3];
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> c(WorldPoint worldPoint) {
        void var17;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        arrayList.add(worldPoint);
        0;
        String[] stringArray = new String[llIIlIlII[3]];
        stringArray[C.llIIlIlII[1]] = this.bc.tree().Y();
        int var18 = Math.min(Inventory.getCount((String[])stringArray), llIIlIlII[4]);
        while (C.var11(var17.size(), var18)) {
            C var19;
            if (!C.var2(var19.a((List<WorldPoint>)var17, Direction.WEST) ? 1 : 0) || !C.var2(var19.a((List<WorldPoint>)var17, Direction.EAST) ? 1 : 0)) continue;
            0;
            if (2 > 0) break;
            return null;
        }
        return arrayList;
    }

    private WorldPoint a(Direction direction, List<WorldPoint> list) {
        if (C.var6(direction, Direction.EAST)) {
            return list.stream().max(Comparator.comparingInt(WorldPoint::getX)).get();
        }
        return list.stream().min(Comparator.comparingInt(WorldPoint::getX)).get();
    }

    private static boolean var20(Object object) {
        return object != null;
    }

    private boolean a(WorldPoint worldPoint, WorldPoint worldPoint2, Direction direction) {
        int n2;
        int n3 = Reachable.getCollisionFlag((WorldPoint)worldPoint);
        int n4 = Reachable.getCollisionFlag((WorldPoint)worldPoint2);
        if (C.var2(TileObjects.getAll(tileObject -> {
            int n2;
            if (C.var3(tileObject instanceof GameObject) && C.var3(tileObject.getWorldLocation().equals((Object)worldPoint2) ? 1 : 0)) {
                n2 = llIIlIlII[3];
                0;
                if (((0x9A ^ 0xA5) & ~(0xB0 ^ 0x8F)) != 0) {
                    return ((1 ^ 0x45) & ~(0x40 ^ 4)) != 0;
                }
            } else {
                n2 = llIIlIlII[1];
            }
            return n2 != 0;
        }).size()) && C.var3(Reachable.canWalk((Direction)direction, (int)n3, (int)n4) ? 1 : 0)) {
            n2 = llIIlIlII[3];
            0;
            if (1 >= 3) {
                return ((0x47 ^ 0x4A ^ (0xA2 ^ 0x85)) & (0x42 ^ 0x2F ^ (0x64 ^ 0x23) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlIlII[1];
        }
        return n2 != 0;
    }

    @Inject
    public ChoppingAndBurningTask(ChopBurnConfig chopBurnConfig) {
        this.bc = chopBurnConfig;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        C var21;
        block28: {
            block29: {
                block27: {
                    if (!C.var3(Inventory.isFull() ? 1 : 0)) break block27;
                    this.bd = llIIlIlII[3];
                    0;
                    
                    break block28;
                }
                if (!C.var20(var21.bf)) break block29;
                String[] stringArray = new String[llIIlIlII[3]];
                stringArray[C.llIIlIlII[1]] = var21.bc.tree().Y();
                if (C.var22(Inventory.getCount((String[])stringArray), llIIlIlII[6]) && !C.var23(var21.bf.size(), llIIlIlII[6])) break block29;
                String[] stringArray2 = new String[llIIlIlII[3]];
                stringArray2[C.llIIlIlII[1]] = var21.bc.tree().Y();
                if (!C.var2(Inventory.getCount((String[])stringArray2))) break block28;
            }
            var21.bf = null;
            var21.bd = llIIlIlII[1];
        }
        Player var24 = Players.getLocal();
        int var25 = Static.getClient().getTickCount();
        if (C.var3(var21.bd)) {
            if (C.var1(var21.bf)) {
                var21.bf = var21.X();
                0;
                if (-(0xC3 ^ 0xC4 ^ 3) >= 0) {
                    return ((76 + 194 - 223 + 173 ^ 88 + 126 - 195 + 134) & (0x59 ^ 0x50 ^ (0xF7 ^ 0xBB) ^ -1)) != 0;
                }
            } else {
                Optional<WorldPoint> var26 = var21.b(var21.bf);
                if (C.var3(var26.isEmpty() ? 1 : 0)) {
                    var21.bf = null;
                    return llIIlIlII[1];
                }
                if (C.var2(var24.getWorldLocation().equals((Object)var26.get()) ? 1 : 0)) {
                    if (C.var3(var24.isMoving() ? 1 : 0)) {
                        return llIIlIlII[1];
                    }
                    Movement.walkTo((WorldPoint)var26.get());
                    0;
                    0;
                    if (((0xAA ^ 0x93) & ~(0x2B ^ 0x12)) > 0) {
                        return ((0x7F ^ 0x53) & ~(0xA6 ^ 0x8A)) != 0;
                    }
                } else if (C.var23(var25 - var21.bh, llIIlIlII[6])) {
                    if (C.var27(var24.getAnimation(), llIIlIlII[5])) {
                        String[] stringArray = new String[llIIlIlII[3]];
                        stringArray[C.llIIlIlII[1]] = var21.bc.tree().Y();
                        String[] stringArray3 = new String[llIIlIlII[3]];
                        stringArray3[C.llIIlIlII[1]] = llIIlIIll[llIIlIlII[1]];
                        Inventory.getFirst((String[])stringArray).useOn(Inventory.getFirst((String[])stringArray3));
                    }
                    var21.bh = var25;
                }
                0;
                if (2 >= (0xB1 ^ 0xA8 ^ (0x99 ^ 0x84))) {
                    return ((0x4B ^ 7 ^ (0x7F ^ 0x2D)) & (0x1A ^ 0x6A ^ (0xE5 ^ 0x8B) ^ -1)) != 0;
                }
            }
        } else {
            if (C.var22(var25 - var21.bg, llIIlIlII[6])) {
                return llIIlIlII[1];
            }
            if (C.var20(var24) && C.var27(var24.getAnimation(), llIIlIlII[5])) {
                WorldPoint worldPoint;
                if (C.var1(var21.be)) {
                    worldPoint = var24.getWorldLocation();
                    0;
                    if (2 < 1) {
                        return ((147 + 158 - 251 + 162 ^ 144 + 23 - 67 + 55) & (96 + 152 - 130 + 103 ^ 56 + 74 - 88 + 116 ^ -1)) != 0;
                    }
                } else {
                    worldPoint = var21.be;
                }
                WorldPoint var26 = worldPoint;
                String[] stringArray = new String[llIIlIlII[3]];
                stringArray[C.llIIlIlII[1]] = var21.bc.tree().Z();
                TileObject var28 = TileObjects.getNearest((WorldPoint)var26, (String[])stringArray);
                if (C.var20(var28)) {
                    var28.interact(llIIlIIll[llIIlIlII[3]]);
                    var21.bg = var25;
                    return llIIlIlII[3];
                }
                0;
                if ((0xB0 ^ 0xB4) != (0x8D ^ 0x89)) {
                    return ((0x24 ^ 0x2A) & ~(0x4E ^ 0x40)) != 0;
                }
            } else if (C.var20(var24)) {
                var21.bg = var25;
            }
        }
        return llIIlIlII[1];
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var35(String var36, String var37) {
        var36 = new String(Base64.getDecoder().decode(var36.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var38 = new StringBuilder();
        char[] var39 = var37.toCharArray();
        int var40 = llIIlIlII[1];
        char[] var41 = var36.toCharArray();
        int var42 = var41.length;
        int var43 = llIIlIlII[1];
        while (C.var11(var43, var42)) {
            char var44 = var41[var43];
            var38.append((char)(var44 ^ var39[var40 % var39.length]));
            0;
            ++var40;
            ++var43;
            0;
            if ((0xE1 ^ 0x8B ^ (0xE4 ^ 0x8A)) <= (1 ^ (0xA5 ^ 0xA0))) continue;
            return null;
        }
        return String.valueOf(var38);
    }

    private static boolean var22(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var16(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var23(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var6(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var27(int n2, int n3) {
        return n2 == n3;
    }

    private static void var5() {
        llIIlIIll = new String[llIIlIlII[9]];
        C.llIIlIIll[C.llIIlIlII[1]] = "Tinderbox";
        C.llIIlIIll[C.llIIlIlII[3]] = "Chop down";
        C.llIIlIIll[C.llIIlIlII[7]] = "Chop down";
        C.llIIlIIll[C.llIIlIlII[8]] = "Tinderbox";
        C.llIIlIIll[C.llIIlIlII[6]] = "Fire";
    }
}

