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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing pressure plates puzzle", register=true, priority=5, blocking=true)
public class DoingPressurePlatesPuzzleTask
extends AutotoaTaskBase {
    private static final  Pattern fA;
    private  boolean fm;
    
    private  Set<WorldPoint> fo;
    private static final  Map<Integer, Set<Integer>> fz;
    
    private static final  Point[] fy;
    private  Set<Integer> fB;
    private  int fC;
    private static final  Set<Integer> fx;
    private static final  Set<Integer> fw;

        return String.valueOf(var1);
    }

    static {
        br.lIlIIlIlIIIIll();
        br.lIlIIlIlIIIIlI();
        fw = Arrays.stream(bs.values()).map(bs::ci).collect(Collectors.toSet());
        fx = Arrays.stream(bs.values()).map(bs::ch).collect(Collectors.toSet());
        Point[] pointArray = new Point[llIlIIIllII[5]];
        pointArray[br.llIlIIIllII[0]] = new Point(llIlIIIllII[6], llIlIIIllII[7]);
        pointArray[br.llIlIIIllII[2]] = new Point(llIlIIIllII[6], llIlIIIllII[8]);
        pointArray[br.llIlIIIllII[4]] = new Point(llIlIIIllII[9], llIlIIIllII[7]);
        pointArray[br.llIlIIIllII[10]] = new Point(llIlIIIllII[9], llIlIIIllII[8]);
        fy = pointArray;
        Object[] objectArray = new Integer[llIlIIIllII[2]];
        objectArray[br.llIlIIIllII[0]] = llIlIIIllII[23];
        Object[] objectArray2 = new Integer[llIlIIIllII[2]];
        objectArray2[br.llIlIIIllII[0]] = llIlIIIllII[30];
        Object[] objectArray3 = new Integer[llIlIIIllII[2]];
        objectArray3[br.llIlIIIllII[0]] = llIlIIIllII[23];
        Object[] objectArray4 = new Integer[llIlIIIllII[2]];
        objectArray4[br.llIlIIIllII[0]] = llIlIIIllII[18];
        Object[] objectArray5 = new Integer[llIlIIIllII[2]];
        objectArray5[br.llIlIIIllII[0]] = llIlIIIllII[18];
        Object[] objectArray6 = new Integer[llIlIIIllII[2]];
        objectArray6[br.llIlIIIllII[0]] = llIlIIIllII[16];
        Object[] objectArray7 = new Integer[llIlIIIllII[2]];
        objectArray7[br.llIlIIIllII[0]] = llIlIIIllII[23];
        Object[] objectArray8 = new Integer[llIlIIIllII[2]];
        objectArray8[br.llIlIIIllII[0]] = llIlIIIllII[23];
        Object[] objectArray9 = new Integer[llIlIIIllII[2]];
        objectArray9[br.llIlIIIllII[0]] = llIlIIIllII[25];
        Object[] objectArray10 = new Integer[llIlIIIllII[2]];
        objectArray10[br.llIlIIIllII[0]] = llIlIIIllII[30];
        Object[] objectArray11 = new Integer[llIlIIIllII[2]];
        objectArray11[br.llIlIIIllII[0]] = llIlIIIllII[17];
        Object[] objectArray12 = new Integer[llIlIIIllII[2]];
        objectArray12[br.llIlIIIllII[0]] = llIlIIIllII[14];
        fz = ImmutableMap.builder().put((Object)llIlIIIllII[1], (Object)ImmutableSet.of((Object)llIlIIIllII[3], (Object)llIlIIIllII[11], (Object)llIlIIIllII[12])).put((Object)llIlIIIllII[13], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[12])).put((Object)llIlIIIllII[15], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[17], (Object)llIlIIIllII[18])).put((Object)llIlIIIllII[19], (Object)ImmutableSet.of((Object)llIlIIIllII[3], (Object)llIlIIIllII[20], (Object)llIlIIIllII[21], (Object)llIlIIIllII[22], (Object)llIlIIIllII[23])).put((Object)llIlIIIllII[18], (Object)ImmutableSet.of((Object)llIlIIIllII[3], (Object)llIlIIIllII[11], (Object)llIlIIIllII[12], (Object)llIlIIIllII[19])).put((Object)llIlIIIllII[24], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25])).put((Object)llIlIIIllII[26], (Object)ImmutableSet.of((Object)llIlIIIllII[27], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25])).put((Object)llIlIIIllII[28], (Object)ImmutableSet.of((Object)llIlIIIllII[3], (Object)llIlIIIllII[20], (Object)llIlIIIllII[21], (Object)llIlIIIllII[22], (Object)llIlIIIllII[5])).put((Object)llIlIIIllII[29], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[2], (Object)llIlIIIllII[21], (Object)llIlIIIllII[25], (Object)llIlIIIllII[30])).put((Object)llIlIIIllII[31], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[30])).put((Object)llIlIIIllII[32], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23])).put((Object)llIlIIIllII[33], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[20], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23])).put((Object)llIlIIIllII[34], (Object)ImmutableSet.of((Object)llIlIIIllII[4], (Object)llIlIIIllII[10], (Object)llIlIIIllII[5], (Object)llIlIIIllII[20], (Object)llIlIIIllII[14])).put((Object)llIlIIIllII[35], (Object)ImmutableSet.of((Object)llIlIIIllII[5], (Object)llIlIIIllII[3], (Object)llIlIIIllII[20], (Object)llIlIIIllII[21], (Object)llIlIIIllII[22], (Object)llIlIIIllII[27], (Object[])objectArray)).put((Object)llIlIIIllII[36], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23], (Object)llIlIIIllII[30], (Object[])new Integer[llIlIIIllII[0]])).put((Object)llIlIIIllII[37], (Object)ImmutableSet.of((Object)llIlIIIllII[27], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23], (Object[])objectArray2)).put((Object)llIlIIIllII[6], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[2], (Object)llIlIIIllII[4], (Object)llIlIIIllII[10], (Object)llIlIIIllII[5], (Object)llIlIIIllII[27], (Object[])objectArray3)).put((Object)llIlIIIllII[38], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23], (Object)llIlIIIllII[30], (Object[])objectArray4)).put((Object)llIlIIIllII[39], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[3], (Object)llIlIIIllII[20], (Object)llIlIIIllII[14], (Object)llIlIIIllII[16], (Object)llIlIIIllII[17], (Object[])objectArray5)).put((Object)llIlIIIllII[40], (Object)ImmutableSet.of((Object)llIlIIIllII[4], (Object)llIlIIIllII[10], (Object)llIlIIIllII[5], (Object)llIlIIIllII[21], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object[])objectArray6)).put((Object)llIlIIIllII[41], (Object)ImmutableSet.of((Object)llIlIIIllII[5], (Object)llIlIIIllII[27], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object[])objectArray7)).put((Object)llIlIIIllII[42], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[5], (Object)llIlIIIllII[20], (Object)llIlIIIllII[27], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object[])objectArray8)).put((Object)llIlIIIllII[43], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[3], (Object)llIlIIIllII[27], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object[])objectArray9)).put((Object)llIlIIIllII[44], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[2], (Object)llIlIIIllII[3], (Object)llIlIIIllII[21], (Object)llIlIIIllII[14], (Object)llIlIIIllII[25], (Object[])objectArray10)).put((Object)llIlIIIllII[8], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[3], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[23], (Object)llIlIIIllII[12], (Object[])objectArray11)).put((Object)llIlIIIllII[45], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[2], (Object)llIlIIIllII[4], (Object)llIlIIIllII[10], (Object)llIlIIIllII[5], (Object)llIlIIIllII[3], (Object[])objectArray12)).build();
        fA = Pattern.compile(llIlIIIlIll[llIlIIIllII[10]]);
    }

    private static void lIlIIlIlIIIIlI() {
        llIlIIIlIll = new String[llIlIIIllII[5]];
        br.llIlIIIlIll[br.llIlIIIllII[0]] = "Ancient tablet";
        br.llIlIIIlIll[br.llIlIIIllII[2]] = "Inspect";
        br.llIlIIIlIll[br.llIlIIIllII[4]] = "Your party failed to complete the challenge";
        br.llIlIIIlIll[br.llIlIIIllII[10]] = "The number (\\d+) has been hastily chipped into the stone.";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var2_2;
        void var2;
        if (br.lIlIIlIlIIlIII(chatMessage.getMessage().startsWith(llIlIIIlIll[llIlIIIllII[4]]) ? 1 : 0)) {
            this.fC = llIlIIIllII[0];
            this.fm = llIlIIIllII[0];
            return;
        }
        Matcher var3 = fA.matcher(Text.removeTags((String)var2.getMessage()));
        if (br.lIlIIlIlIIIllI(var3.matches() ? 1 : 0)) {
            return;
        }
        this.fC = Integer.parseInt(var2_2.group(llIlIIIllII[2]));
    }

    private static int lIlIIlIlIIIlIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Inject
    protected DoingPressurePlatesPuzzleTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fo = Collections.emptySet();
    }

    /*
     * WARNING - void declaration
     */
    private Set<Integer> b(Tile[][] tileArray, Point point) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int var4 = llIlIIIllII[0];
        while (br.lIlIIlIlIIlIlI(var4, llIlIIIllII[3])) {
            int var5 = llIlIIIllII[0];
            while (br.lIlIIlIlIIlIlI(var5, llIlIIIllII[3])) {
                void var6;
                void var7;
                void var8 = var7[var6.getX() + var5][var6.getY() - var4];
                IntStream intStream = Arrays.stream(var8.getGameObjects()).filter(Objects::nonNull).mapToInt(TileObject::getId);
                Set<Integer> set = fw;
                Objects.requireNonNull(set);

                int n2 = intStream.anyMatch(set::contains);
                if (br.lIlIIlIlIIlIII(n2)) {
                    void var9;
                    var9.add(var4 * llIlIIIllII[3] + var5);

                }
                ++var5;

                if (1 >= 1) continue;
                return null;
            }
            ++var4;

            if (((231 + 209 - 384 + 184 ^ 33 + 76 - 96 + 162) & (131 + 216 - 332 + 225 ^ 69 + 134 - 199 + 171 ^ -1)) == ((0xE7 ^ 0x9C ^ (0xC ^ 0x59)) & (0xEC ^ 0xB9 ^ (0xC3 ^ 0xB8) ^ -1))) continue;
            return null;
        }
        return hashSet;
    }

    /*
     * WARNING - void declaration
     */
    private Point a(Tile[][] tileArray) {
        void var10;
        Point[] pointArray = fy;
        int n2 = pointArray.length;
        int var11 = llIlIIIllII[0];
        while (br.lIlIIlIlIIlIlI(var11, (int)var10)) {
            void var12;
            void var13;
            void var14 = var13[var11];
            void var15 = var12[var14.getX()][var14.getY()];
            GroundObject var16 = var15.getGroundObject();
            if (br.lIlIIlIlIIlIll(var16) && br.lIlIIlIlIIllII(var16.getId(), bs.FOOT.ch())) {
                return var14;
            }
            ++var11;

            if (2 > 0) continue;
            return null;
        }
        return null;
    }

    private static boolean lIlIIlIlIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIlIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIIIllI(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (br.lIlIIlIlIIlIII(fw.contains(gameObjectSpawned.getGameObject().getId()) ? 1 : 0)) {
            this.fm = llIlIIIllII[0];
        }
    }

    private static boolean lIlIIlIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIlIIlIIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var2_3;
        br var17;
        if (br.lIlIIlIlIIIllI(this.fm ? 1 : 0) && br.lIlIIlIlIIIlll(this.fC, llIlIIIllII[1])) {
            this.ca();
            return llIlIIIllII[2];
        }
        if (br.lIlIIlIlIIlIII(var17.fo.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llIlIIIllII[2]];
            stringArray[br.llIlIIIllII[0]] = llIlIIIlIll[llIlIIIllII[0]];
            TileObject var18 = TileObjects.getNearest((String[])stringArray);
            if (br.lIlIIlIlIIIlII(var18)) {
                return llIlIIIllII[0];
            }
            var18.interact(llIlIIIlIll[llIlIIIllII[2]]);
            return llIlIIIllII[2];
        }
        WorldPoint var18 = var17.cu.getLocalPlayer().getWorldLocation();
        WorldPoint var19 = var17.fo.stream().filter(worldPoint -> TileObjects.getAll(tileObject -> fw.contains(tileObject.getId())).stream().noneMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint))).min(Comparator.comparingInt(WorldPoint::getX).thenComparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
        if (br.lIlIIlIlIIIlII(var19)) {
            return llIlIIIllII[0];
        }
        long var20 = var19.pathTo(var17.cu, var19).stream().filter(worldPoint -> TileObjects.getAll(tileObject -> fx.contains(tileObject.getId())).stream().anyMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint))).count();
        if (br.lIlIIlIlIIlIIl(br.lIlIIlIlIIIlIl(var20, 1L))) {
            return llIlIIIllII[0];
        }
        Movement.setDestination((WorldPoint)var2_3);
        return llIlIIIllII[2];
    }

    private static boolean lIlIIlIlIIllII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int bZ() {
        return TileObjects.getNearest(tileObject -> fx.contains(tileObject.getId())).getWorldX();
    }

    @Override
    public boolean bk() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> fx.contains(tileObject.getId()));
        if (br.lIlIIlIlIIIlII(tileObject2)) {
            return llIlIIIllII[0];
        }
        return Reachable.isWalkable((WorldPoint)tileObject2.getWorldLocation());
    }

    @Override
    public void r() {
        this.fm = llIlIIIllII[0];
        this.fB = new HashSet<Integer>();
        this.fC = llIlIIIllII[0];
        this.fo = Collections.emptySet();
    }

    private static boolean lIlIIlIlIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlIIIlII(Object object) {
        return object == null;
    }

    @Override
    public boolean bj() {
        return llIlIIIllII[0];
    }

    private Set<WorldPoint> b(Point point) {
        Sets.SetView setView = Sets.difference(fz.get(this.fC), this.fB);
        return setView.stream().map(n2 -> WorldPoint.fromScene((Client)this.cu, (int)(point.getX() + n2 % llIlIIIllII[3]), (int)(point.getY() - n2 / llIlIIIllII[3]), (int)this.cu.getPlane())).collect(Collectors.toSet());
    }

    /*
     * WARNING - void declaration
     */
    private void ca() {
        void var2_2;
        void var1_1;
        br var21;
        if (br.lIlIIlIlIIlIlI(this.fC, llIlIIIllII[1])) {
            return;
        }
        var21.fm = llIlIIIllII[2];
        Tile[][] var22 = var21.cu.getScene().getTiles()[var21.cu.getPlane()];
        Point var23 = var21.a(var22);
        if (br.lIlIIlIlIIIlII(var23)) {
            return;
        }
        this.fB = this.b((Tile[][])var1_1, (Point)var2_2);
        this.fo = this.b((Point)var2_2);
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (br.lIlIIlIlIIlIII(fw.contains(gameObjectDespawned.getGameObject().getId()) ? 1 : 0)) {
            this.fm = llIlIIIllII[0];
        }
    }
}

