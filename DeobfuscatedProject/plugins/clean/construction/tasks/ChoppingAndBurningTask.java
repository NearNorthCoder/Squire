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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    private  List<WorldPoint> bf;
    
    private static final  String aY;
    private  int bg;

    private static boolean lIllIIIIIlI(Object object) {
        return object == null;
    }

    private Optional<WorldPoint> b(List<WorldPoint> list) {
        return list.stream().filter(worldPoint -> {
            boolean bl2;
            if (C.lIllIIIIlIl(TileObjects.getAll(tileObject -> {
                int n2;
                if (C.lIllIIIIlll(tileObject instanceof GameObject) && C.lIllIIIIlll(tileObject.getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIlII[3];

                    }
                } else {
                    n2 = llIIlIlII[1];
                }
                return n2 != 0;
            }).size())) {
                bl2 = llIIlIlII[3];

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
        C.lIllIIIIIIl();
        C.lIllIIIIIII();
        aY = llIIlIIll[llIIlIlII[7]];
        aX = llIIlIIll[llIIlIlII[8]];
        bb = llIIlIlII[4];
        ba = llIIlIlII[2];
        aZ = llIIlIIll[llIIlIlII[6]];
    }

    private static boolean lIllIIIIlIl(int n2) {
        return n2 == 0;
    }

    private WorldPoint a(WorldPoint worldPoint, Direction direction) {
        if (C.lIllIIIIllI(direction, Direction.EAST)) {
            return worldPoint.dx(llIIlIlII[3]);
        }
        return worldPoint.dx(llIIlIlII[5]);
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> X() {
        void var2_2;
        C lIllIlIIlllllII;
        if (C.lIllIIIIIlI(this.be)) {
            this.be = Players.getLocal().getWorldLocation();
        }
        WorldPoint lIllIlIIllllIll = lIllIlIIlllllII.be.dy(llIIlIlII[0]);
        List<WorldPoint> lIllIlIIllllIlI = lIllIlIIlllllII.c(lIllIlIIllllIll);
        int lIllIlIIllllIIl = llIIlIlII[1];
        while (C.lIllIIIIIll(lIllIlIIllllIIl, llIIlIlII[2])) {
            WorldPoint lIllIlIIlllIllI;
            List<WorldPoint> lIllIlIIlllIlIl;
            WorldPoint lIllIlIIllllIII = lIllIlIIllllIll.dy(lIllIlIIllllIIl);
            List<WorldPoint> lIllIlIIlllIlll = lIllIlIIlllllII.c(lIllIlIIllllIII);
            if (C.lIllIIIIlII(lIllIlIIlllIlll.size(), lIllIlIIllllIlI.size())) {
                lIllIlIIllllIlI = lIllIlIIlllIlll;
            }
            if (C.lIllIIIIlII((lIllIlIIlllIlIl = lIllIlIIlllllII.c(lIllIlIIlllIllI = lIllIlIIllllIll.dy(-lIllIlIIllllIIl))).size(), lIllIlIIllllIlI.size())) {
                lIllIlIIllllIlI = lIllIlIIlllIlIl;
            }
            ++lIllIlIIllllIIl;

            if ((1 ^ 5) >= ((0x6F ^ 0x79) & ~(0x10 ^ 6))) continue;
            return null;
        }
        return var2_2;
    }

    private boolean a(List<WorldPoint> list, Direction direction) {
        WorldPoint worldPoint;
        WorldPoint worldPoint2 = this.a(direction, list);
        if (C.lIllIIIIlIl(this.a(worldPoint2, worldPoint = this.a(worldPoint2, direction), direction) ? 1 : 0)) {
            return llIIlIlII[1];
        }
        list.add(worldPoint);

        return llIIlIlII[3];
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> c(WorldPoint worldPoint) {
        void lIllIlIIllIlllI;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        arrayList.add(worldPoint);

        String[] stringArray = new String[llIIlIlII[3]];
        stringArray[C.llIIlIlII[1]] = this.bc.tree().Y();
        int lIllIlIIllIllIl = Math.min(Inventory.getCount((String[])stringArray), llIIlIlII[4]);
        while (C.lIllIIIIIll(lIllIlIIllIlllI.size(), lIllIlIIllIllIl)) {
            C lIllIlIIlllIIII;
            if (!C.lIllIIIIlIl(lIllIlIIlllIIII.a((List<WorldPoint>)lIllIlIIllIlllI, Direction.WEST) ? 1 : 0) || !C.lIllIIIIlIl(lIllIlIIlllIIII.a((List<WorldPoint>)lIllIlIIllIlllI, Direction.EAST) ? 1 : 0)) continue;

            if (2 > 0) break;
            return null;
        }
        return arrayList;
    }

    private WorldPoint a(Direction direction, List<WorldPoint> list) {
        if (C.lIllIIIIllI(direction, Direction.EAST)) {
            return list.stream().max(Comparator.comparingInt(WorldPoint::getX)).get();
        }
        return list.stream().min(Comparator.comparingInt(WorldPoint::getX)).get();
    }

    private static boolean lIllIIIlIII(Object object) {
        return object != null;
    }

    private boolean a(WorldPoint worldPoint, WorldPoint worldPoint2, Direction direction) {
        int n2;
        int n3 = Reachable.getCollisionFlag((WorldPoint)worldPoint);
        int n4 = Reachable.getCollisionFlag((WorldPoint)worldPoint2);
        if (C.lIllIIIIlIl(TileObjects.getAll(tileObject -> {
            int n2;
            if (C.lIllIIIIlll(tileObject instanceof GameObject) && C.lIllIIIIlll(tileObject.getWorldLocation().equals((Object)worldPoint2) ? 1 : 0)) {
                n2 = llIIlIlII[3];

                if (((0x9A ^ 0xA5) & ~(0xB0 ^ 0x8F)) != 0) {
                    return false;
                }
            } else {
                n2 = llIIlIlII[1];
            }
            return n2 != 0;
        }).size()) && C.lIllIIIIlll(Reachable.canWalk((Direction)direction, (int)n3, (int)n4) ? 1 : 0)) {
            n2 = llIIlIlII[3];

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

    private static boolean lIllIIIIlll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        C lIllIlIIlIIlIll;
        block28: {
            block29: {
                block27: {
                    if (!C.lIllIIIIlll(Inventory.isFull() ? 1 : 0)) break block27;
                    this.bd = llIIlIlII[3];

                    if (3 == 0) {
                        return false;
                    }
                    break block28;
                }
                if (!C.lIllIIIlIII(lIllIlIIlIIlIll.bf)) break block29;
                String[] stringArray = new String[llIIlIlII[3]];
                stringArray[C.llIIlIlII[1]] = lIllIlIIlIIlIll.bc.tree().Y();
                if (C.lIllIIIlIIl(Inventory.getCount((String[])stringArray), llIIlIlII[6]) && !C.lIllIIIlIlI(lIllIlIIlIIlIll.bf.size(), llIIlIlII[6])) break block29;
                String[] stringArray2 = new String[llIIlIlII[3]];
                stringArray2[C.llIIlIlII[1]] = lIllIlIIlIIlIll.bc.tree().Y();
                if (!C.lIllIIIIlIl(Inventory.getCount((String[])stringArray2))) break block28;
            }
            lIllIlIIlIIlIll.bf = null;
            lIllIlIIlIIlIll.bd = llIIlIlII[1];
        }
        Player lIllIlIIlIIlIlI = Players.getLocal();
        int lIllIlIIlIIlIIl = Static.getClient().getTickCount();
        if (C.lIllIIIIlll(lIllIlIIlIIlIll.bd ? 1 : 0)) {
            if (C.lIllIIIIIlI(lIllIlIIlIIlIll.bf)) {
                lIllIlIIlIIlIll.bf = lIllIlIIlIIlIll.X();

                if (-(0xC3 ^ 0xC4 ^ 3) >= 0) {
                    return ((76 + 194 - 223 + 173 ^ 88 + 126 - 195 + 134) & (0x59 ^ 0x50 ^ (0xF7 ^ 0xBB) ^ -1)) != 0;
                }
            } else {
                Optional<WorldPoint> lIllIlIIlIIlIII = lIllIlIIlIIlIll.b(lIllIlIIlIIlIll.bf);
                if (C.lIllIIIIlll(lIllIlIIlIIlIII.isEmpty() ? 1 : 0)) {
                    lIllIlIIlIIlIll.bf = null;
                    return llIIlIlII[1];
                }
                if (C.lIllIIIIlIl(lIllIlIIlIIlIlI.getWorldLocation().equals((Object)lIllIlIIlIIlIII.get()) ? 1 : 0)) {
                    if (C.lIllIIIIlll(lIllIlIIlIIlIlI.isMoving() ? 1 : 0)) {
                        return llIIlIlII[1];
                    }
                    Movement.walkTo((WorldPoint)lIllIlIIlIIlIII.get());

                    if (((0xAA ^ 0x93) & ~(0x2B ^ 0x12)) > 0) {
                        return false;
                    }
                } else if (C.lIllIIIlIlI(lIllIlIIlIIlIIl - lIllIlIIlIIlIll.bh, llIIlIlII[6])) {
                    if (C.lIllIIIlIll(lIllIlIIlIIlIlI.getAnimation(), llIIlIlII[5])) {
                        String[] stringArray = new String[llIIlIlII[3]];
                        stringArray[C.llIIlIlII[1]] = lIllIlIIlIIlIll.bc.tree().Y();
                        String[] stringArray3 = new String[llIIlIlII[3]];
                        stringArray3[C.llIIlIlII[1]] = llIIlIIll[llIIlIlII[1]];
                        Inventory.getFirst((String[])stringArray).useOn(Inventory.getFirst((String[])stringArray3));
                    }
                    lIllIlIIlIIlIll.bh = lIllIlIIlIIlIIl;
                }

                if (2 >= (0xB1 ^ 0xA8 ^ (0x99 ^ 0x84))) {
                    return ((0x4B ^ 7 ^ (0x7F ^ 0x2D)) & (0x1A ^ 0x6A ^ (0xE5 ^ 0x8B) ^ -1)) != 0;
                }
            }
        } else {
            if (C.lIllIIIlIIl(lIllIlIIlIIlIIl - lIllIlIIlIIlIll.bg, llIIlIlII[6])) {
                return llIIlIlII[1];
            }
            if (C.lIllIIIlIII(lIllIlIIlIIlIlI) && C.lIllIIIlIll(lIllIlIIlIIlIlI.getAnimation(), llIIlIlII[5])) {
                WorldPoint worldPoint;
                if (C.lIllIIIIIlI(lIllIlIIlIIlIll.be)) {
                    worldPoint = lIllIlIIlIIlIlI.getWorldLocation();

                    if (2 < 1) {
                        return false;
                    }
                } else {
                    worldPoint = lIllIlIIlIIlIll.be;
                }
                WorldPoint lIllIlIIlIIlIII = worldPoint;
                String[] stringArray = new String[llIIlIlII[3]];
                stringArray[C.llIIlIlII[1]] = lIllIlIIlIIlIll.bc.tree().Z();
                TileObject lIllIlIIlIIIlll = TileObjects.getNearest((WorldPoint)lIllIlIIlIIlIII, (String[])stringArray);
                if (C.lIllIIIlIII(lIllIlIIlIIIlll)) {
                    lIllIlIIlIIIlll.interact(llIIlIIll[llIIlIlII[3]]);
                    lIllIlIIlIIlIll.bg = lIllIlIIlIIlIIl;
                    return llIIlIlII[3];
                }

                if ((0xB0 ^ 0xB4) != (0x8D ^ 0x89)) {
                    return false;
                }
            } else if (C.lIllIIIlIII(lIllIlIIlIIlIlI)) {
                lIllIlIIlIIlIll.bg = lIllIlIIlIIlIIl;
            }
        }
        return llIIlIlII[1];
    }

    private static boolean lIllIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lIllIlIIIllIIII);
    }

    private static boolean lIllIIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIIIIIII() {
        llIIlIIll = new String[llIIlIlII[9]];
        C.llIIlIIll[C.llIIlIlII[1]] = "Tinderbox";
        C.llIIlIIll[C.llIIlIlII[3]] = "Chop down";
        C.llIIlIIll[C.llIIlIlII[7]] = "Chop down";
        C.llIIlIIll[C.llIIlIlII[8]] = "Tinderbox";
        C.llIIlIIll[C.llIIlIlII[6]] = "Fire";
    }
}

