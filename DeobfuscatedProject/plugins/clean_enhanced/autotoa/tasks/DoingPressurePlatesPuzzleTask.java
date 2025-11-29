/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GroundObject
 *  net.runelite.api.Point
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing pressure plates puzzle", register=true, priority=5, blocking=true)
public class DoingPressurePlatesPuzzleTask
extends AutotoaManager {
    private static final  Pattern fA;
    private  boolean fm;
    
    private  Set<WorldPoint> fo;
    private static final  Map<Integer, Set<Integer>> fz;
    
    private static final  Point[] fy;
    private  Set<Integer> fB;
    private  int fC;
    private static final  Set<Integer> fx;
    private static final  Set<Integer> fw;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (br.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        br.var14();
        br.var15();
        fw = Arrays.stream(bs.values()).map(bs::ci).collect(Collectors.toSet());
        fx = Arrays.stream(bs.values()).map(bs::ch).collect(Collectors.toSet());
        Point[] pointArray = new Point[var1[5]];
        pointArray[br.var1[0]] = new Point(var1[6], var1[7]);
        pointArray[br.var1[2]] = new Point(var1[6], var1[8]);
        pointArray[br.var1[4]] = new Point(var1[9], var1[7]);
        pointArray[br.var1[10]] = new Point(var1[9], var1[8]);
        fy = pointArray;
        Object[] objectArray = new Integer[var1[2]];
        objectArray[br.var1[0]] = var1[23];
        Object[] objectArray2 = new Integer[var1[2]];
        objectArray2[br.var1[0]] = var1[30];
        Object[] objectArray3 = new Integer[var1[2]];
        objectArray3[br.var1[0]] = var1[23];
        Object[] objectArray4 = new Integer[var1[2]];
        objectArray4[br.var1[0]] = var1[18];
        Object[] objectArray5 = new Integer[var1[2]];
        objectArray5[br.var1[0]] = var1[18];
        Object[] objectArray6 = new Integer[var1[2]];
        objectArray6[br.var1[0]] = var1[16];
        Object[] objectArray7 = new Integer[var1[2]];
        objectArray7[br.var1[0]] = var1[23];
        Object[] objectArray8 = new Integer[var1[2]];
        objectArray8[br.var1[0]] = var1[23];
        Object[] objectArray9 = new Integer[var1[2]];
        objectArray9[br.var1[0]] = var1[25];
        Object[] objectArray10 = new Integer[var1[2]];
        objectArray10[br.var1[0]] = var1[30];
        Object[] objectArray11 = new Integer[var1[2]];
        objectArray11[br.var1[0]] = var1[17];
        Object[] objectArray12 = new Integer[var1[2]];
        objectArray12[br.var1[0]] = var1[14];
        fz = ImmutableMap.builder().put((Object)var1[1], (Object)ImmutableSet.of((Object)var1[3], (Object)var1[11], (Object)var1[12])).put((Object)var1[13], (Object)ImmutableSet.of((Object)var1[14], (Object)var1[11], (Object)var1[12])).put((Object)var1[15], (Object)ImmutableSet.of((Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[17], (Object)var1[18])).put((Object)var1[19], (Object)ImmutableSet.of((Object)var1[3], (Object)var1[20], (Object)var1[21], (Object)var1[22], (Object)var1[23])).put((Object)var1[18], (Object)ImmutableSet.of((Object)var1[3], (Object)var1[11], (Object)var1[12], (Object)var1[19])).put((Object)var1[24], (Object)ImmutableSet.of((Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[25])).put((Object)var1[26], (Object)ImmutableSet.of((Object)var1[27], (Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[25])).put((Object)var1[28], (Object)ImmutableSet.of((Object)var1[3], (Object)var1[20], (Object)var1[21], (Object)var1[22], (Object)var1[5])).put((Object)var1[29], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[2], (Object)var1[21], (Object)var1[25], (Object)var1[30])).put((Object)var1[31], (Object)ImmutableSet.of((Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[25], (Object)var1[30])).put((Object)var1[32], (Object)ImmutableSet.of((Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[25], (Object)var1[23])).put((Object)var1[33], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[20], (Object)var1[16], (Object)var1[25], (Object)var1[23])).put((Object)var1[34], (Object)ImmutableSet.of((Object)var1[4], (Object)var1[10], (Object)var1[5], (Object)var1[20], (Object)var1[14])).put((Object)var1[35], (Object)ImmutableSet.of((Object)var1[5], (Object)var1[3], (Object)var1[20], (Object)var1[21], (Object)var1[22], (Object)var1[27], (Object[])objectArray)).put((Object)var1[36], (Object)ImmutableSet.of((Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[25], (Object)var1[23], (Object)var1[30], (Object[])new Integer[var1[0]])).put((Object)var1[37], (Object)ImmutableSet.of((Object)var1[27], (Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[25], (Object)var1[23], (Object[])objectArray2)).put((Object)var1[6], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[2], (Object)var1[4], (Object)var1[10], (Object)var1[5], (Object)var1[27], (Object[])objectArray3)).put((Object)var1[38], (Object)ImmutableSet.of((Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[25], (Object)var1[23], (Object)var1[30], (Object[])objectArray4)).put((Object)var1[39], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[3], (Object)var1[20], (Object)var1[14], (Object)var1[16], (Object)var1[17], (Object[])objectArray5)).put((Object)var1[40], (Object)ImmutableSet.of((Object)var1[4], (Object)var1[10], (Object)var1[5], (Object)var1[21], (Object)var1[14], (Object)var1[11], (Object[])objectArray6)).put((Object)var1[41], (Object)ImmutableSet.of((Object)var1[5], (Object)var1[27], (Object)var1[14], (Object)var1[11], (Object)var1[16], (Object)var1[25], (Object[])objectArray7)).put((Object)var1[42], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[5], (Object)var1[20], (Object)var1[27], (Object)var1[16], (Object)var1[25], (Object[])objectArray8)).put((Object)var1[43], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[3], (Object)var1[27], (Object)var1[14], (Object)var1[11], (Object)var1[16], (Object[])objectArray9)).put((Object)var1[44], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[2], (Object)var1[3], (Object)var1[21], (Object)var1[14], (Object)var1[25], (Object[])objectArray10)).put((Object)var1[8], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[3], (Object)var1[14], (Object)var1[11], (Object)var1[23], (Object)var1[12], (Object[])objectArray11)).put((Object)var1[45], (Object)ImmutableSet.of((Object)var1[0], (Object)var1[2], (Object)var1[4], (Object)var1[10], (Object)var1[5], (Object)var1[3], (Object[])objectArray12)).build();
        fA = Pattern.compile(var2[var1[10]]);
    }

    private static void var15() {
        var2 = new String[var1[5]];
        br.var2[br.var1[0]] = "Ancient tablet";
        br.var2[br.var1[2]] = "Inspect";
        br.var2[br.var1[4]] = "Your party failed to complete the challenge";
        br.var2[br.var1[10]] = "The number (\\d+) has been hastily chipped into the stone.";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var2_2;
        void var16;
        if (br.var17(chatMessage.getMessage().startsWith(var2[var1[4]]) ? 1 : 0)) {
            this.fC = var1[0];
            this.fm = var1[0];
            return;
        }
        Matcher var18 = fA.matcher(Text.removeTags((String)var16.getMessage()));
        if (br.var19(var18.matches() ? 1 : 0)) {
            return;
        }
        this.fC = Integer.parseInt(var2_2.group(var1[2]));
    }

    private static int var20(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Inject
    protected DoingPressurePlatesPuzzleTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fo = Collections.emptySet();
    }

    private static void var14() {
        var1 = new int[46];
        br.var1[0] = (6 ^ 0x14 ^ (2 ^ 0x44)) & (0xC5 ^ 0xA7 ^ (0x32 ^ 4) ^ -1);
        br.var1[1] = 0x7D ^ 0x69;
        br.var1[2] = 1;
        br.var1[3] = 0x6D ^ 0x68;
        br.var1[4] = 2;
        br.var1[5] = 0x4E ^ 0x4A;
        br.var1[6] = 0x4A ^ 0x6E;
        br.var1[7] = 0x7C ^ 0x44;
        br.var1[8] = 0x50 ^ 0x7C;
        br.var1[9] = 0xE5 ^ 0xBF ^ (0x7D ^ 0x12);
        br.var1[10] = 3;
        br.var1[11] = 0x58 ^ 0x53;
        br.var1[12] = 0x83 ^ 0x92;
        br.var1[13] = 0x63 ^ 0x76;
        br.var1[14] = 60 + 66 - 95 + 154 ^ 1 + 131 - 90 + 137;
        br.var1[15] = 0x3A ^ 0x2C;
        br.var1[16] = 0x10 ^ 0x7C ^ (0x32 ^ 0x52);
        br.var1[17] = 0x5A ^ 0x1A ^ (0xFA ^ 0xA8);
        br.var1[18] = 0x68 ^ 0x70;
        br.var1[19] = 0x65 ^ 0x72;
        br.var1[20] = 5 ^ 0x66 ^ (0x74 ^ 0x11);
        br.var1[21] = 0x11 ^ 0x6F ^ (7 ^ 0x7E);
        br.var1[22] = 0xA3 ^ 0xAB;
        br.var1[23] = 0x70 ^ 0x7E;
        br.var1[24] = 0x53 ^ 0x4A;
        br.var1[25] = 0xBE ^ 0xB3;
        br.var1[26] = 7 ^ 0xE ^ (0x40 ^ 0x53);
        br.var1[27] = 0x9C ^ 0xB8 ^ (0x1C ^ 0x31);
        br.var1[28] = 0xE1 ^ 0x92 ^ (0x42 ^ 0x2A);
        br.var1[29] = 0xD8 ^ 0xC4;
        br.var1[30] = 0x19 ^ 0xA;
        br.var1[31] = 0x8B ^ 0x96;
        br.var1[32] = 79 + 0 - 76 + 152 ^ 117 + 65 - 104 + 55;
        br.var1[33] = 0x7F ^ 0x60;
        br.var1[34] = 0xE4 ^ 0xAB ^ (0x43 ^ 0x2C);
        br.var1[35] = 0x4D ^ 3 ^ (0x2C ^ 0x43);
        br.var1[36] = 0x30 ^ 0x50 ^ (0x78 ^ 0x3A);
        br.var1[37] = 0x5F ^ 0x7C;
        br.var1[38] = 0x63 ^ 0x46;
        br.var1[39] = 0x9D ^ 0xBB;
        br.var1[40] = 114 + 166 - 245 + 143 ^ 125 + 14 - 105 + 115;
        br.var1[41] = 23 + 10 - -31 + 89 ^ 174 + 100 - 183 + 86;
        br.var1[42] = 0x33 ^ 0x1A;
        br.var1[43] = 118 + 81 - 117 + 55 ^ 140 + 13 - 78 + 88;
        br.var1[44] = 0x4E ^ 0x65 ^ (0xA2 ^ 0x8B) & ~(0xBE ^ 0x97);
        br.var1[45] = 0xBD ^ 0x90;
    }

    /*
     * WARNING - void declaration
     */
    private Set<Integer> b(Tile[][] tileArray, Point point) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int var21 = var1[0];
        while (br.var12(var21, var1[3])) {
            int var22 = var1[0];
            while (br.var12(var22, var1[3])) {
                void var23;
                void var24;
                void var25 = var24[var23.getX() + var22][var23.getY() - var21];
                IntStream intStream = Arrays.stream(var25.getGameObjects()).filter(Objects::nonNull).mapToInt(TileObject::getId);
                Set<Integer> set = fw;
                Objects.requireNonNull(set);
                0;
                int n2 = intStream.anyMatch(set::contains);
                if (br.var17(n2)) {
                    void var26;
                    var26.add(var21 * var1[3] + var22);
                    0;
                }
                ++var22;
                0;
                
                return null;
            }
            ++var21;
            0;
            if (((231 + 209 - 384 + 184 ^ 33 + 76 - 96 + 162) & (131 + 216 - 332 + 225 ^ 69 + 134 - 199 + 171 ^ -1)) == ((0xE7 ^ 0x9C ^ (0xC ^ 0x59)) & (0xEC ^ 0xB9 ^ (0xC3 ^ 0xB8) ^ -1))) continue;
            return null;
        }
        return hashSet;
    }

    /*
     * WARNING - void declaration
     */
    private Point a(Tile[][] tileArray) {
        void var27;
        Point[] pointArray = fy;
        int n2 = pointArray.length;
        int var28 = var1[0];
        while (br.var12(var28, (int)var27)) {
            void var29;
            void var30;
            void var31 = var30[var28];
            void var32 = var29[var31.getX()][var31.getY()];
            GroundObject var33 = var32.getGroundObject();
            if (br.var34(var33) && br.var35(var33.getId(), bs.FOOT.ch())) {
                return var31;
            }
            ++var28;
            0;
            if (2 > 0) continue;
            return null;
        }
        return null;
    }

    private static boolean var34(Object object) {
        return object != null;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

        catch (Exception var41) {
            var41.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (br.var17(fw.contains(gameObjectSpawned.getGameObject().getId()) ? 1 : 0)) {
            this.fm = var1[0];
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var42(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var2_3;
        br var43;
        if (br.var19(this.fm) && br.var44(this.fC, var1[1])) {
            this.ca();
            return var1[2];
        }
        if (br.var17(var43.fo.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[var1[2]];
            stringArray[br.var1[0]] = var2[var1[0]];
            TileObject var45 = TileObjects.getNearest((String[])stringArray);
            if (br.var46(var45)) {
                return var1[0];
            }
            var45.interact(var2[var1[2]]);
            return var1[2];
        }
        WorldPoint var45 = var43.cu.getLocalPlayer().getWorldLocation();
        WorldPoint var47 = var43.fo.stream().filter(worldPoint -> TileObjects.getAll(tileObject -> fw.contains(tileObject.getId())).stream().noneMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint))).min(Comparator.comparingInt(WorldPoint::getX).thenComparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
        if (br.var46(var47)) {
            return var1[0];
        }
        long var48 = var47.pathTo(var43.cu, var47).stream().filter(worldPoint -> TileObjects.getAll(tileObject -> fx.contains(tileObject.getId())).stream().anyMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint))).count();
        if (br.var42(br.var20(var48, 1L))) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var2_3);
        return var1[2];
    }

    private static boolean var35(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int bZ() {
        return TileObjects.getNearest(tileObject -> fx.contains(tileObject.getId())).getWorldX();
    }

    @Override
    public boolean bk() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> fx.contains(tileObject.getId()));
        if (br.var46(tileObject2)) {
            return var1[0];
        }
        return Reachable.isWalkable((WorldPoint)tileObject2.getWorldLocation());
    }

    @Override
    public void r() {
        this.fm = var1[0];
        this.fB = new HashSet<Integer>();
        this.fC = var1[0];
        this.fo = Collections.emptySet();
    }

    private static boolean var44(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var46(Object object) {
        return object == null;
    }

    @Override
    public boolean bj() {
        return var1[0];
    }

    private Set<WorldPoint> b(Point point) {
        Sets.SetView setView = Sets.difference(fz.get(this.fC), this.fB);
        return setView.stream().map(n2 -> WorldPoint.fromScene((Client)this.cu, (int)(point.getX() + n2 % var1[3]), (int)(point.getY() - n2 / var1[3]), (int)this.cu.getPlane())).collect(Collectors.toSet());
    }

    /*
     * WARNING - void declaration
     */
    private void ca() {
        void var2_2;
        void var1_1;
        br var49;
        if (br.var12(this.fC, var1[1])) {
            return;
        }
        var49.fm = var1[2];
        Tile[][] var50 = var49.cu.getScene().getTiles()[var49.cu.getPlane()];
        Point var51 = var49.a(var50);
        if (br.var46(var51)) {
            return;
        }
        this.fB = this.b((Tile[][])var1_1, (Point)var2_2);
        this.fo = this.b((Point)var2_2);
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (br.var17(fw.contains(gameObjectDespawned.getGameObject().getId()) ? 1 : 0)) {
            this.fm = var1[0];
        }
    }
}

