/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import java.awt.Point;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;

public final class GameEnum112
extends Enum<r> {
    public static final  /* enum */ r ROOM_6;
    public static final  /* enum */ r ROOM_4_1;
    public static final  /* enum */ r ROOM_5;
    public static final  /* enum */ r ROOM_3;
    private final  Map<Point, Integer> placingMirrors;
    public static final  /* enum */ r ROOM_7_1;
    
    public static final  /* enum */ r ROOM_1;
    public static final  /* enum */ r ROOM_8_1;
    private final  Set<Point> detectionMirrors;
    public static final  /* enum */ r ROOM_7;
    public static final  /* enum */ r ROOM_3_1;
    private final  List<Point> wallsToBreak;
    public static final  /* enum */ r ROOM_4;
    public static final  /* enum */ r ROOM_1_2;
    private static final  r[] $VALUES;
    private static final  int REGION_ID;
    private final  Point stand;
    
    public static final  /* enum */ r ROOM_8_2;

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum112.class, string);
    }

    public boolean d(WorldPoint worldPoint) {
        Point point = this.c(worldPoint);
        return this.placingMirrors.containsKey(point);
    }

    private static boolean lIlIIlIlllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIlllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum112(Point point, Set<Point> set, Map<Point, Integer> map, Point ... pointArray) {
        this.stand = point;
        this.detectionMirrors = set;
        this.placingMirrors = map;
        this.wallsToBreak = Stream.of(pointArray).collect(Collectors.toList());
    }

    private static void lIlIIlIlllIIII() {
        llIlIIllIII = new String[llIlIIllIIl[37]];
        r.llIlIIllIII[r.llIlIIllIIl[0]] = "Mirror";
        r.llIlIIllIII[r.llIlIIllIIl[1]] = "Pick-up";
        r.llIlIIllIII[r.llIlIIllIIl[3]] = "ROOM_1";
        r.llIlIIllIII[r.llIlIIllIIl[15]] = "ROOM_1_2";
        r.llIlIIllIII[r.llIlIIllIIl[19]] = "ROOM_3";
        r.llIlIIllIII[r.llIlIIllIIl[22]] = "ROOM_3_1";
        r.llIlIIllIII[r.llIlIIllIIl[25]] = "ROOM_4";
        r.llIlIIllIII[r.llIlIIllIIl[29]] = "ROOM_4_1";
        r.llIlIIllIII[r.llIlIIllIIl[30]] = "ROOM_5";
        r.llIlIIllIII[r.llIlIIllIIl[31]] = "ROOM_6";
        r.llIlIIllIII[r.llIlIIllIIl[33]] = "ROOM_7";
        r.llIlIIllIII[r.llIlIIllIIl[34]] = "ROOM_7_1";
        r.llIlIIllIII[r.llIlIIllIIl[35]] = "ROOM_8_1";
        r.llIlIIllIII[r.llIlIIllIIl[36]] = "ROOM_8_2";
    }

    public Point c(WorldPoint worldPoint) {
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        return new Point(regionPoint.getX(), regionPoint.getY());
    }

    private GameEnum112(Set<Point> set, Map<Point, Integer> map, Point ... pointArray) {
        this.stand = null;
        this.detectionMirrors = set;
        this.placingMirrors = map;
        this.wallsToBreak = Stream.of(pointArray).collect(Collectors.toList());
    }

    public Set<Point> ac() {
        return this.detectionMirrors;
    }

    public Map<Point, Integer> ad() {
        return this.placingMirrors;
    }

    public WorldPoint a(Point point) {
        Client client = Static.getClient();
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        RegionPoint regionPoint = new RegionPoint(point.x, point.y, client.getPlane(), llIlIIllIIl[2]);
        return WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo2D(worldPoint))).orElse(null);
    }

    public Point ab() {
        return this.stand;
    }

    public List<Point> ae() {
        return this.wallsToBreak;
    }

    static {
        r.lIlIIlIlllIIIl();
        r.lIlIIlIlllIIII();
        REGION_ID = llIlIIllIIl[2];
        Point[] pointArray = new Point[llIlIIllIIl[1]];
        pointArray[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[13], llIlIIllIIl[5]);
        ROOM_1 = new GameEnum112(new Point(llIlIIllIIl[4], llIlIIllIIl[5]), Set.of(new Point(llIlIIllIIl[6], llIlIIllIIl[7]), new Point(llIlIIllIIl[8], llIlIIllIIl[6]), new Point(llIlIIllIIl[9], llIlIIllIIl[10])), Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[13], llIlIIllIIl[10]), llIlIIllIIl[14]), pointArray);
        Point[] pointArray2 = new Point[llIlIIllIIl[1]];
        pointArray2[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[13], llIlIIllIIl[5]);
        ROOM_1_2 = new GameEnum112(new Point(llIlIIllIIl[4], llIlIIllIIl[5]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[7], llIlIIllIIl[9]), new Point(llIlIIllIIl[5], llIlIIllIIl[17])), Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[9], llIlIIllIIl[10]), llIlIIllIIl[18], new Point(llIlIIllIIl[13], llIlIIllIIl[10]), llIlIIllIIl[14]), pointArray2);
        Point[] pointArray3 = new Point[llIlIIllIIl[1]];
        pointArray3[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_3 = new GameEnum112(new Point(llIlIIllIIl[4], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[6]), new Point(llIlIIllIIl[6], llIlIIllIIl[5]), new Point(llIlIIllIIl[20], llIlIIllIIl[21])), Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), llIlIIllIIl[18], new Point(llIlIIllIIl[8], llIlIIllIIl[21]), llIlIIllIIl[12]), pointArray3);
        Point[] pointArray4 = new Point[llIlIIllIIl[1]];
        pointArray4[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_3_1 = new GameEnum112(new Point(llIlIIllIIl[4], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[9], llIlIIllIIl[16]), new Point(llIlIIllIIl[10], llIlIIllIIl[7]), new Point(llIlIIllIIl[10], llIlIIllIIl[23])), Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), llIlIIllIIl[18], new Point(llIlIIllIIl[8], llIlIIllIIl[21]), llIlIIllIIl[12], new Point(llIlIIllIIl[20], llIlIIllIIl[21]), llIlIIllIIl[24]), pointArray4);
        Point[] pointArray5 = new Point[llIlIIllIIl[1]];
        pointArray5[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[16], llIlIIllIIl[6]);
        ROOM_4 = new GameEnum112(Set.of(new Point(llIlIIllIIl[8], llIlIIllIIl[7]), new Point(llIlIIllIIl[26], llIlIIllIIl[23]), new Point(llIlIIllIIl[27], llIlIIllIIl[28])), Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), llIlIIllIIl[18], new Point(llIlIIllIIl[16], llIlIIllIIl[21]), llIlIIllIIl[12], new Point(llIlIIllIIl[27], llIlIIllIIl[21]), llIlIIllIIl[24]), pointArray5);
        Point[] pointArray6 = new Point[llIlIIllIIl[1]];
        pointArray6[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[16], llIlIIllIIl[6]);
        ROOM_4_1 = new GameEnum112(new Point(llIlIIllIIl[11], llIlIIllIIl[6]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[9], llIlIIllIIl[16]), new Point(llIlIIllIIl[13], llIlIIllIIl[6])), Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[21]), llIlIIllIIl[12], new Point(llIlIIllIIl[27], llIlIIllIIl[21]), llIlIIllIIl[24]), pointArray6);
        ROOM_5 = new GameEnum112(new Point(llIlIIllIIl[6], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[23]), new Point(llIlIIllIIl[26], llIlIIllIIl[26]), new Point(llIlIIllIIl[13], llIlIIllIIl[16])), Map.of(new Point(llIlIIllIIl[21], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[21], llIlIIllIIl[27]), llIlIIllIIl[18], new Point(llIlIIllIIl[20], llIlIIllIIl[27]), llIlIIllIIl[14]), new Point[llIlIIllIIl[0]]);
        ROOM_6 = new GameEnum112(new Point(llIlIIllIIl[11], llIlIIllIIl[20]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[32], llIlIIllIIl[21]), new Point(llIlIIllIIl[13], llIlIIllIIl[27])), Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[27]), llIlIIllIIl[18]), new Point[llIlIIllIIl[0]]);
        Point[] pointArray7 = new Point[llIlIIllIIl[1]];
        pointArray7[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[5], llIlIIllIIl[5]);
        ROOM_7 = new GameEnum112(Set.of(new Point(llIlIIllIIl[23], llIlIIllIIl[32]), new Point(llIlIIllIIl[17], llIlIIllIIl[13]), new Point(llIlIIllIIl[16], llIlIIllIIl[6])), Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[9], llIlIIllIIl[20]), llIlIIllIIl[18], new Point(llIlIIllIIl[5], llIlIIllIIl[20]), llIlIIllIIl[14]), pointArray7);
        Point[] pointArray8 = new Point[llIlIIllIIl[1]];
        pointArray8[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[5], llIlIIllIIl[5]);
        ROOM_7_1 = new GameEnum112(new Point(llIlIIllIIl[32], llIlIIllIIl[20]), Set.of(new Point(llIlIIllIIl[9], llIlIIllIIl[20]), new Point(llIlIIllIIl[21], llIlIIllIIl[11]), new Point(llIlIIllIIl[17], llIlIIllIIl[6])), Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[5], llIlIIllIIl[20]), llIlIIllIIl[14]), pointArray8);
        Point[] pointArray9 = new Point[llIlIIllIIl[1]];
        pointArray9[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_8_1 = new GameEnum112(new Point(llIlIIllIIl[4], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[11], llIlIIllIIl[21]), new Point(llIlIIllIIl[11], llIlIIllIIl[6]), new Point(llIlIIllIIl[6], llIlIIllIIl[17])), Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), llIlIIllIIl[18], new Point(llIlIIllIIl[8], llIlIIllIIl[16]), llIlIIllIIl[12], new Point(llIlIIllIIl[20], llIlIIllIIl[16]), llIlIIllIIl[24]), pointArray9);
        Point[] pointArray10 = new Point[llIlIIllIIl[1]];
        pointArray10[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_8_2 = new GameEnum112(new Point(llIlIIllIIl[4], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), new Point(llIlIIllIIl[13], llIlIIllIIl[17]), new Point(llIlIIllIIl[6], llIlIIllIIl[17])), Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[16]), llIlIIllIIl[12], new Point(llIlIIllIIl[20], llIlIIllIIl[16]), llIlIIllIIl[24]), pointArray10);
        r[] rArray = new r[llIlIIllIIl[35]];
        rArray[r.llIlIIllIIl[0]] = ROOM_1;
        rArray[r.llIlIIllIIl[1]] = ROOM_1_2;
        rArray[r.llIlIIllIIl[3]] = ROOM_3;
        rArray[r.llIlIIllIIl[15]] = ROOM_3_1;
        rArray[r.llIlIIllIIl[19]] = ROOM_4;
        rArray[r.llIlIIllIIl[22]] = ROOM_4_1;
        rArray[r.llIlIIllIIl[25]] = ROOM_5;
        rArray[r.llIlIIllIIl[29]] = ROOM_6;
        rArray[r.llIlIIllIIl[30]] = ROOM_7;
        rArray[r.llIlIIllIIl[31]] = ROOM_7_1;
        rArray[r.llIlIIllIIl[33]] = ROOM_8_1;
        rArray[r.llIlIIllIIl[34]] = ROOM_8_2;
        $VALUES = rArray;
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public static r aa() {
        void var2;
        List list = TileObjects.getAll(tileObject -> {
            int n2;
            if (r.lIlIIlIlllIIll(tileObject.getName().equals(llIlIIllIII[llIlIIllIIl[0]]) ? 1 : 0)) {
                String[] stringArray = new String[llIlIIllIIl[1]];
                stringArray[r.llIlIIllIIl[0]] = llIlIIllIII[llIlIIllIIl[1]];
                if (r.lIlIIlIlllIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIIllIIl[1];

                    if ((0x6B ^ 0x6F) >= (0x5C ^ 0x58)) return n2 != 0;
                    return false;
                }
            }
            n2 = llIlIIllIIl[0];
            return n2 != 0;
        });
        List list2 = list.stream().map(Locatable::getWorldLocation).map(RegionPoint::fromWorld).map(regionPoint -> new Point(regionPoint.getX(), regionPoint.getY())).collect(Collectors.toList());
        r[] rArray = r.values();
        int n2 = rArray.length;
        int var3 = llIlIIllIIl[0];
        while (r.lIlIIlIlllIIlI(var3, (int)var2)) {
            void var4;
            void var5 = var4[var3];
            int var6 = llIlIIllIIl[1];
            Iterator<Point> var7 = var5.ac().iterator();
            while (r.lIlIIlIlllIIll(var7.hasNext() ? 1 : 0)) {
                void var8;
                Point var9 = var7.next();
                if (r.lIlIIlIlllIlII(var8.contains(var9) ? 1 : 0)) {
                    var6 = llIlIIllIIl[0];

                    if (((196 + 132 - 175 + 89 ^ 167 + 80 - 224 + 157) & (0xBA ^ 0x85 ^ (0xC ^ 0x75) ^ -1)) == 0) break;
                    return null;
                }

                if (2 != 0) continue;
                return null;
            }
            if (r.lIlIIlIlllIlII(var6)) {

                if (((115 + 80 - 160 + 143 ^ 28 + 106 - 122 + 136) & (0xF3 ^ 0xBD ^ (0x21 ^ 0x49) ^ -1)) != 0) {
                    return null;
                }
            } else {
                return var5;
            }
            ++var3;

            if (-(0x17 ^ 0x13) <= 0) continue;
            return null;
        }
        return null;
    }

    private static boolean lIlIIlIlllIIll(int n2) {
        return n2 != 0;
    }
}

