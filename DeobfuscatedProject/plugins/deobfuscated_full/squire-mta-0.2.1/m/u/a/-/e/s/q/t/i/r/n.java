/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.GroundObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.WallObject
 *  net.runelite.api.coords.Angle
 *  net.runelite.api.coords.Direction
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GroundObjectSpawned
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.WallObjectSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package m.u.a.-.e.s.q.t.i.r;

import gg.squire.mta.MagicArenaConfig;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.c;
import m.u.a.-.e.s.q.t.i.r.m;
import m.u.a.-.e.s.q.t.i.r.o;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.GroundObject;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.WallObject;
import net.runelite.api.coords.Angle;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class n
extends b {
    private /* synthetic */ Rectangle ak;
    private /* synthetic */ NPC al;
    private static /* synthetic */ int[] lllIlIlllIII;
    private final /* synthetic */ Client ae;
    private /* synthetic */ WorldPoint ai;
    private /* synthetic */ LocalPoint ah;
    private /* synthetic */ Stack<Direction> ag;
    private /* synthetic */ m am;
    private /* synthetic */ WorldPoint aj;
    private static /* synthetic */ String[] lllIlIllIlll;
    protected static final /* synthetic */ int ad;
    protected static final /* synthetic */ int ac;
    private static final /* synthetic */ Logger aa;
    public static final /* synthetic */ int ab;
    private final /* synthetic */ List<WallObject> af;

    private WorldArea a(Direction direction) {
        switch (m.u.a.-.e.s.q.t.i.r.o.an[direction.ordinal()]) {
            case 1: {
                n var47;
                return new WorldArea(var47.ak.x + lllIlIlllIII[3], (int)var47.ak.getMaxY(), var47.ak.width - lllIlIlllIII[3], lllIlIlllIII[3], lllIlIlllIII[1]);
            }
            case 2: {
                n var47;
                return new WorldArea(var47.ak.x + lllIlIlllIII[3], var47.ak.y, var47.ak.width - lllIlIlllIII[3], lllIlIlllIII[3], lllIlIlllIII[1]);
            }
            case 4: {
                n var47;
                return new WorldArea(var47.ak.x, var47.ak.y + lllIlIlllIII[3], lllIlIlllIII[3], var47.ak.height - lllIlIlllIII[3], lllIlIlllIII[1]);
            }
            case 3: {
                n var47;
                return new WorldArea((int)var47.ak.getMaxX(), var47.ak.y + lllIlIlllIII[3], lllIlIlllIII[3], var47.ak.height - lllIlIlllIII[3], lllIlIlllIII[1]);
            }
        }
        return null;
    }

    private static void lIIIllIIIllllll() {
        lllIlIlllIII = new int[13];
        n.lllIlIlllIII[0] = 3;
        n.lllIlIlllIII[1] = (0xEB ^ 0xAE) & ~(0x2D ^ 0x68);
        n.lllIlIlllIII[2] = -(0xFFFFF703 & 0x4DFD) & (0xFFFFDF7D & 0x7FFB);
        n.lllIlIlllIII[3] = 1;
        n.lllIlIlllIII[4] = 0xFFFFFBFF & 0x1E7A;
        n.lllIlIlllIII[5] = 2;
        n.lllIlIlllIII[6] = -(0xFFFFF401 & 0x6FFF) & (0xFFFFFE7B & Short.MAX_VALUE);
        n.lllIlIlllIII[7] = -(0xFFFF9FBD & 0x757B) & (0xFFFFFF3B & 0x3FFF);
        n.lllIlIlllIII[8] = -(0xFFFFE5EF & 0x3A15) & (0xFFFFFC7E & 0x7FFD);
        n.lllIlIlllIII[9] = 75 + 179 - 69 + 13;
        n.lllIlIlllIII[10] = 0xFFFFFFFF & Integer.MAX_VALUE;
        n.lllIlIlllIII[11] = 0xB6 ^ 0xB2;
        n.lllIlIlllIII[12] = -1;
    }

    private static boolean lIIIllIIlIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(GroundObjectSpawned groundObjectSpawned) {
        GroundObject groundObject = groundObjectSpawned.getGroundObject();
        if (n.lIIIllIIlIIIIlI(groundObject.getId(), lllIlIlllIII[8])) {
            this.aj = groundObject.getWorldLocation();
        }
    }

    /*
     * WARNING - void declaration
     */
    private Stack<Direction> a(Map<WorldPoint, WorldPoint> map, WorldPoint worldPoint) {
        void var41;
        Stack<Direction> stack = new Stack<Direction>();
        WorldPoint var45 = worldPoint;
        while (n.lIIIllIIlIIIIll(var41.containsKey(var45) ? 1 : 0)) {
            void var67;
            WorldPoint var64 = (WorldPoint)var41.get(var45);
            if (n.lIIIllIIlIIlIII(var64.getX(), var45.getX())) {
                var67.add(Direction.WEST);
                0;
                0;
                
                }
            } else if (n.lIIIllIIlIIlIIl(var64.getX(), var45.getX())) {
                var67.add(Direction.EAST);
                0;
                0;
                if (3 <= 0) {
                    return null;
                }
            } else if (n.lIIIllIIlIIlIII(var64.getY(), var45.getY())) {
                var67.add(Direction.SOUTH);
                0;
                0;
                if (-1 == 3) {
                    return null;
                }
            } else {
                var67.add(Direction.NORTH);
                0;
            }
            var45 = var64;
            0;
            if (3 > 0) continue;
            return null;
        }
        return stack;
    }

    private static boolean lIIIllIIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllIIIllllIl(String var5, String var49) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var21 = var49.toCharArray();
        int var42 = lllIlIlllIII[1];
        char[] var3 = var5.toCharArray();
        int var65 = var3.length;
        int var14 = lllIlIlllIII[1];
        while (n.lIIIllIIlIIlIIl(var14, var65)) {
            char var38 = var3[var14];
            var32.append((char)(var38 ^ var21[var42 % var21.length]));
            0;
            ++var42;
            ++var14;
            0;
            
            return null;
        }
        return String.valueOf(var32);
    }

    private LocalPoint a(LocalPoint localPoint, Direction direction) {
        n var31;
        WorldArea var29;
        int var52;
        int var56;
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ae, (LocalPoint)localPoint);
        WorldArea worldArea = worldPoint.toWorldArea();
        switch (m.u.a.-.e.s.q.t.i.r.o.an[direction.ordinal()]) {
            case 1: {
                var56 = lllIlIlllIII[1];
                var52 = lllIlIlllIII[3];
                0;
                if (2 >= 0) break;
                return null;
            }
            case 2: {
                var56 = lllIlIlllIII[1];
                var52 = lllIlIlllIII[12];
                0;
                if (3 > 0) break;
                return null;
            }
            case 3: {
                var56 = lllIlIlllIII[3];
                var52 = lllIlIlllIII[1];
                0;
                if (null == null) break;
                return null;
            }
            case 4: {
                var56 = lllIlIlllIII[12];
                var52 = lllIlIlllIII[1];
                0;
                if (2 >= 2) break;
                return null;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        while (n.lIIIllIIlIIIIll(var29.canTravelInDirection(var31.ae.getTopLevelWorldView(), var56, var52) ? 1 : 0)) {
            WorldPoint var24 = var29.toWorldPoint().dx(var56).dy(var52);
            var29 = var24.toWorldArea();
            0;
            if (((0x5F ^ 0x65) & ~(5 ^ 0x3F)) == 0) continue;
            return null;
        }
        return LocalPoint.fromWorld((Client)this.ae, (WorldPoint)worldPoint);
    }

    private static boolean lIIIllIIlIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIIlIIIIIl(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    private n(MagicArenaConfig magicArenaConfig, Client client) {
        super(magicArenaConfig);
        this.af = new ArrayList<WallObject>();
        this.ag = new Stack();
        this.ae = client;
    }

    @Override
    public c d() {
        return c.TELEKENETIC;
    }

    static {
        n.lIIIllIIIllllll();
        n.lIIIllIIIlllllI();
        ad = lllIlIlllIII[8];
        ac = lllIlIlllIII[4];
        ab = lllIlIlllIII[7];
        aa = LoggerFactory.getLogger(n.class);
    }

    private void a(Graphics2D graphics2D, LocalPoint localPoint) {
        Polygon polygon;
        if (n.lIIIllIIlIIIlll(localPoint) && n.lIIIllIIlIIIlll(polygon = Perspective.getCanvasTilePoly((Client)this.ae, (LocalPoint)localPoint))) {
            graphics2D.drawPolygon(polygon);
        }
    }

    @Subscribe
    public void a(WallObjectSpawned wallObjectSpawned) {
        WallObject wallObject = wallObjectSpawned.getWallObject();
        if (n.lIIIllIIlIIIIII(wallObject.getId(), lllIlIlllIII[7])) {
            return;
        }
        this.af.add(wallObject);
        0;
    }

    private LocalPoint[] a(LocalPoint localPoint) {
        LocalPoint[] localPointArray = new LocalPoint[lllIlIlllIII[11]];
        localPointArray[n.lllIlIlllIII[1]] = this.a(localPoint, Direction.NORTH);
        localPointArray[n.lllIlIlllIII[3]] = this.a(localPoint, Direction.SOUTH);
        localPointArray[n.lllIlIlllIII[5]] = this.a(localPoint, Direction.EAST);
        localPointArray[n.lllIlIlllIII[0]] = this.a(localPoint, Direction.WEST);
        return localPointArray;
    }

    /*
     * WARNING - void declaration
     */
    private Rectangle a(WallObject[] wallObjectArray) {
        void var55;
        int n2 = lllIlIlllIII[10];
        int n3 = lllIlIlllIII[10];
        int n4 = Integer.MIN_VALUE;
        int n5 = Integer.MIN_VALUE;
        WallObject[] wallObjectArray2 = wallObjectArray;
        int n6 = wallObjectArray2.length;
        int var60 = lllIlIlllIII[1];
        while (n.lIIIllIIlIIlIIl(var60, (int)var55)) {
            int var12;
            int var46;
            int var9;
            int var25;
            void var19;
            void var8 = var19[var60];
            WorldPoint var51 = var8.getWorldLocation();
            var25 = Math.min(var25, var51.getX());
            var9 = Math.min(var9, var51.getY());
            var46 = Math.max(var46, var51.getX());
            var12 = Math.max(var12, var51.getY());
            ++var60;
            0;
            if (2 != 0) continue;
            return null;
        }
        return new Rectangle(n2, n3, n4 - n2, n5 - n3);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint G() {
        void var3_3;
        void var4_4;
        void var2_2;
        void var53;
        n var1;
        WorldPoint worldPoint = this.ae.getLocalPlayer().getWorldLocation();
        if (n.lIIIllIIlIIIIll(this.ag.isEmpty() ? 1 : 0)) {
            return null;
        }
        Direction var63 = var1.ag.pop();
        WorldArea var40 = var1.a(var63);
        WorldPoint var2 = var1.a(var40, (WorldPoint)var53);
        if (n.lIIIllIIlIIIIll(var1.ag.isEmpty() ? 1 : 0)) {
            var1.ag.push(var63);
            0;
            return var2;
        }
        Direction direction = this.ag.peek();
        this.ag.push((Direction)var2_2);
        0;
        WorldArea worldArea = this.a(direction);
        WorldPoint worldPoint2 = this.a(worldArea, (WorldPoint)var4_4);
        return this.a((WorldArea)var3_3, worldPoint2);
    }

    private static boolean lIIIllIIlIIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIllIIlIIIIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint a(WorldArea worldArea, WorldPoint worldPoint) {
        int n2 = lllIlIlllIII[10];
        WorldPoint worldPoint2 = null;
        Iterator var22 = worldArea.toWorldPointList().iterator();
        while (n.lIIIllIIlIIIIll(var22.hasNext() ? 1 : 0)) {
            int var62;
            WorldPoint var33;
            void var13;
            WorldPoint var23 = (WorldPoint)var22.next();
            int var58 = n.a(var23, (WorldPoint)var13);
            if (!n.lIIIllIIlIIIlll(var33) || n.lIIIllIIlIIlIII(var62, var58)) {
                var33 = var23;
                var62 = var58;
            }
            0;
            if (1 >= 0) continue;
            return null;
        }
        return worldPoint2;
    }

    private static boolean lIIIllIIlIIllll(int n2) {
        return n2 <= 0;
    }

    @Override
    public boolean c() {
        boolean bl;
        if (n.lIIIllIIlIIIlll(this.ae.getWidget(lllIlIlllIII[9], lllIlIlllIII[1]))) {
            bl = lllIlIlllIII[3];
            0;
            if (((50 + 41 - 42 + 113 ^ 38 + 15 - -110 + 9) & (25 + 43 - -44 + 73 ^ 3 + 155 - 49 + 74 ^ -1)) != 0) {
                return ((0xCA ^ 0xC6 ^ (0x46 ^ 0x71)) & (216 + 103 - 136 + 72 ^ 153 + 51 - 144 + 136 ^ -1)) != 0;
            }
        } else {
            bl = lllIlIlllIII[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(Graphics2D graphics2D) {
        if (n.lIIIllIIlIIIIll(this.c() ? 1 : 0) && n.lIIIllIIlIIIlll((Object)this.am) && n.lIIIllIIlIIIlll(this.al)) {
            n var35;
            if (n.lIIIllIIlIIIlll(this.ah)) {
                graphics2D.setColor(Color.ORANGE);
                this.a(graphics2D, this.ah);
            }
            if (n.lIIIllIIlIIIlIl(var35.ag.isEmpty() ? 1 : 0)) {
                WorldPoint var7;
                Polygon var43;
                void var48;
                if (n.lIIIllIIlIIIIIl(var35.ag.peek(), var35.J())) {
                    var48.setColor(Color.GREEN);
                    0;
                    if ((0x32 ^ 0x36) < 0) {
                        return;
                    }
                } else {
                    var48.setColor(Color.RED);
                }
                if (n.lIIIllIIlIIIlll(var43 = Perspective.getCanvasTilePoly((Client)var35.ae, (LocalPoint)var35.al.getLocalLocation()))) {
                    var48.drawPolygon(var43);
                }
                if (n.lIIIllIIlIIIlll(var7 = var35.G())) {
                    var35.ae.setHintArrow(var7);
                    var35.a((Graphics2D)var48, var7);
                }
            }
        }
    }

    private static int lIIIllIIlIIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public void F() {
        this.aj = null;
        this.af.clear();
    }

    private static boolean lIIIllIIlIIllIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIllIIlIIllII(int n2) {
        return n2 >= 0;
    }

    private static boolean lIIIllIIlIIIlll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (!n.lIIIllIIlIIIIII(nPC.getId(), lllIlIlllIII[2]) || !n.lIIIllIIlIIIIII(nPC.getId(), lllIlIlllIII[4]) || n.lIIIllIIlIIIIlI(nPC.getId(), lllIlIlllIII[6])) {
            void var6;
            lllllllllllllllIIllIlIlIIlllllll.al = var6;
        }
    }

    public WorldPoint K() {
        return this.aj;
    }

    private static int a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return Math.abs(worldPoint.getX() - worldPoint2.getX()) + Math.abs(worldPoint2.getY() - worldPoint.getY());
    }

    /*
     * WARNING - void declaration
     */
    private Direction J() {
        n var18;
        void var44;
        WorldPoint worldPoint = this.ae.getLocalPlayer().getWorldLocation();
        if (n.lIIIllIIlIIllII(n.lIIIllIIlIIlIlI(worldPoint.getY(), this.ak.getMaxY())) && n.lIIIllIIlIIllIl(n.lIIIllIIlIIlIll(worldPoint.getX(), this.ak.getMaxX())) && n.lIIIllIIlIIlllI(n.lIIIllIIlIIlIlI(worldPoint.getX(), this.ak.getX()))) {
            return Direction.NORTH;
        }
        if (n.lIIIllIIlIIllll(n.lIIIllIIlIIlIll(var44.getY(), var18.ak.getY())) && n.lIIIllIIlIIllIl(n.lIIIllIIlIIlIll(var44.getX(), var18.ak.getMaxX())) && n.lIIIllIIlIIlllI(n.lIIIllIIlIIlIlI(var44.getX(), var18.ak.getX()))) {
            return Direction.SOUTH;
        }
        if (n.lIIIllIIlIIllII(n.lIIIllIIlIIlIlI(var44.getX(), var18.ak.getMaxX())) && n.lIIIllIIlIIllIl(n.lIIIllIIlIIlIll(var44.getY(), var18.ak.getMaxY())) && n.lIIIllIIlIIlllI(n.lIIIllIIlIIlIlI(var44.getY(), var18.ak.getY()))) {
            return Direction.EAST;
        }
        if (n.lIIIllIIlIIllll(n.lIIIllIIlIIlIll(var44.getX(), var18.ak.getX())) && n.lIIIllIIlIIllIl(n.lIIIllIIlIIlIll(var44.getY(), var18.ak.getMaxY())) && n.lIIIllIIlIIlllI(n.lIIIllIIlIIlIlI(var44.getY(), var18.ak.getY()))) {
            return Direction.WEST;
        }
        return null;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (n.lIIIllIIlIIIIIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.F();
        }
    }

    private static int lIIIllIIlIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static String lIIIllIIIllllII(String var59, String var66) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var66.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var39 = Cipher.getInstance("Blowfish");
            var39.init(lllIlIlllIII[5], var27);
            return new String(var39.doFinal(Base64.getDecoder().decode(var59.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIlIIIlII(Object object, Object object2) {
        return object != object2;
    }

    private LocalPoint I() {
        Angle angle = new Angle(this.al.getOrientation());
        Direction direction = angle.getNearestDirection();
        return this.a(this.al.getLocalLocation(), direction);
    }

    public NPC E() {
        int[] nArray = new int[lllIlIlllIII[0]];
        nArray[n.lllIlIlllIII[1]] = lllIlIlllIII[2];
        nArray[n.lllIlIlllIII[3]] = lllIlIlllIII[4];
        nArray[n.lllIlIlllIII[5]] = lllIlIlllIII[6];
        return NPCs.getNearest((int[])nArray);
    }

    private static void lIIIllIIIlllllI() {
        lllIlIllIlll = new String[lllIlIlllIII[5]];
        n.lllIlIllIlll[n.lllIlIlllIII[1]] = n."Updating guarding location {} -> {}";
        n.lllIlIllIlll[n.lllIlIlllIII[3]] = n."Rebuilding moves due to guardian move";
    }

    private static boolean lIIIllIIlIIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIllIIlIIIlIl(int n2) {
        return n2 == 0;
    }

    private void a(Graphics2D graphics2D, WorldPoint worldPoint) {
        this.a(graphics2D, LocalPoint.fromWorld((Client)this.ae, (WorldPoint)worldPoint));
    }

    @Subscribe
    public void a(GameTick gameTick) {
        n var28;
        if (!n.lIIIllIIlIIIIll(this.c() ? 1 : 0) || n.lIIIllIIlIIIlII(this.ae.getGameState(), GameState.LOGGED_IN)) {
            var28.am = null;
            var28.ag.clear();
            return;
        }
        if (!n.lIIIllIIlIIIlIl(var28.af.isEmpty() ? 1 : 0) || n.lIIIllIIlIIIllI(var28.al)) {
            var28.af.clear();
            int[] nArray = new int[lllIlIlllIII[3]];
            nArray[n.lllIlIlllIII[1]] = lllIlIlllIII[7];
            TileObjects.getAll((int[])nArray).forEach(tileObject -> {
                this.af.add((WallObject)tileObject);
                0;
            });
            var28.ak = var28.a(var28.af.toArray(new WallObject[lllIlIlllIII[1]]));
            var28.am = m.b(var28.af.size());
            var28.al = var28.E();
            int[] nArray2 = new int[lllIlIlllIII[3]];
            nArray2[n.lllIlIlllIII[1]] = lllIlIlllIII[8];
            var28.aj = TileObjects.getNearest((int[])nArray2).getWorldLocation();
            var28.ag = var28.H();
            return;
        }
        if (!n.lIIIllIIlIIIlll((Object)var28.am) || n.lIIIllIIlIIIIII(var28.af.size(), var28.am.C())) {
            var28.ak = var28.a(var28.af.toArray(new WallObject[lllIlIlllIII[1]]));
            var28.am = m.b(var28.af.size());
            var28.ae.clearHintArrow();
            0;
            if (1 == 0) {
                return;
            }
        } else {
            WorldPoint var61;
            if (n.lIIIllIIlIIIIlI(var28.al.getId(), lllIlIlllIII[4])) {
                var28.ah = var28.I();
                var61 = WorldPoint.fromLocal((Client)var28.ae, (LocalPoint)var28.ah);
                0;
                if ((0x5D ^ 0x59) < 2) {
                    return;
                }
            } else {
                var28.ah = null;
                var61 = var28.al.getWorldLocation();
            }
            if (n.lIIIllIIlIIIIll(var61.equals((Object)var28.ai) ? 1 : 0)) {
                return;
            }
            aa.debug(lllIlIllIlll[lllIlIlllIII[1]], (Object)var28.ai, (Object)var61);
            var28.ai = var61;
            if (n.lIIIllIIlIIIIll(var28.ai.equals((Object)var28.aj) ? 1 : 0)) {
                var28.ae.clearHintArrow();
                0;
                if (-2 >= 0) {
                    return;
                }
            } else {
                aa.debug(lllIlIllIlll[lllIlIlllIII[3]]);
                var28.ag = var28.H();
            }
        }
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        NPC nPC = npcDespawned.getNpc();
        if (n.lIIIllIIlIIIIIl(nPC, this.al)) {
            this.al = null;
        }
    }

    private static boolean lIIIllIIlIIIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private Stack<Direction> a(WorldPoint worldPoint) {
        void var15;
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        HashSet hashSet = new HashSet();
        HashMap<WorldPoint, Integer> hashMap = new HashMap<WorldPoint, Integer>();
        HashMap<WorldPoint, WorldPoint> hashMap2 = new HashMap<WorldPoint, WorldPoint>();
        hashMap.put(worldPoint, lllIlIlllIII[1]);
        0;
        linkedList.add(worldPoint);
        0;
        while (n.lIIIllIIlIIIlIl(var15.isEmpty() ? 1 : 0)) {
            LocalPoint[] var10;
            n var26;
            void var34;
            WorldPoint var20 = (WorldPoint)var15.poll();
            var34.add(var20);
            0;
            LocalPoint var30 = LocalPoint.fromWorld((Client)var26.ae, (WorldPoint)var20);
            LocalPoint[] var57 = var10 = var26.a(var30);
            int var16 = var57.length;
            int var37 = lllIlIlllIII[1];
            while (n.lIIIllIIlIIlIIl(var37, var16)) {
                LocalPoint var54 = var57[var37];
                if (n.lIIIllIIlIIIllI(var54)) {
                    0;
                    
                    }
                } else {
                    WorldPoint var4 = WorldPoint.fromLocal((Client)var26.ae, (LocalPoint)var54);
                    if (n.lIIIllIIlIIIlIl(var4.equals((Object)var20) ? 1 : 0) && n.lIIIllIIlIIIlIl(var34.contains(var4) ? 1 : 0)) {
                        void var50;
                        int var17 = (Integer)var50.get(var20) + lllIlIlllIII[3];
                        if (!n.lIIIllIIlIIIIll(var50.containsKey(var4) ? 1 : 0) || n.lIIIllIIlIIlIII((Integer)var50.get(var4), var17)) {
                            void var11;
                            var50.put(var4, var17);
                            0;
                            var11.put(var4, var20);
                            0;
                            var15.add(var4);
                            0;
                        }
                    }
                }
                ++var37;
                0;
                if ((0xA5 ^ 0xA0) > 0) continue;
                return null;
            }
            0;
            
            return null;
        }
        return this.a(hashMap2, this.aj);
    }

    private Stack<Direction> H() {
        if (n.lIIIllIIlIIIIlI(this.al.getId(), lllIlIlllIII[4])) {
            WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ae, (LocalPoint)this.I());
            return this.a(worldPoint);
        }
        return this.a(this.al.getWorldLocation());
    }
}

