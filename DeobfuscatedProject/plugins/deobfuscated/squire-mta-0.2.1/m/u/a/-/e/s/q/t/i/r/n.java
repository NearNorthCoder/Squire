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
                n lllllllllllllllIIllIlIIlllllIIlI;
                return new WorldArea(lllllllllllllllIIllIlIIlllllIIlI.ak.x + lllIlIlllIII[3], (int)lllllllllllllllIIllIlIIlllllIIlI.ak.getMaxY(), lllllllllllllllIIllIlIIlllllIIlI.ak.width - lllIlIlllIII[3], lllIlIlllIII[3], lllIlIlllIII[1]);
            }
            case 2: {
                n lllllllllllllllIIllIlIIlllllIIlI;
                return new WorldArea(lllllllllllllllIIllIlIIlllllIIlI.ak.x + lllIlIlllIII[3], lllllllllllllllIIllIlIIlllllIIlI.ak.y, lllllllllllllllIIllIlIIlllllIIlI.ak.width - lllIlIlllIII[3], lllIlIlllIII[3], lllIlIlllIII[1]);
            }
            case 4: {
                n lllllllllllllllIIllIlIIlllllIIlI;
                return new WorldArea(lllllllllllllllIIllIlIIlllllIIlI.ak.x, lllllllllllllllIIllIlIIlllllIIlI.ak.y + lllIlIlllIII[3], lllIlIlllIII[3], lllllllllllllllIIllIlIIlllllIIlI.ak.height - lllIlIlllIII[3], lllIlIlllIII[1]);
            }
            case 3: {
                n lllllllllllllllIIllIlIIlllllIIlI;
                return new WorldArea((int)lllllllllllllllIIllIlIIlllllIIlI.ak.getMaxX(), lllllllllllllllIIllIlIIlllllIIlI.ak.y + lllIlIlllIII[3], lllIlIlllIII[3], lllllllllllllllIIllIlIIlllllIIlI.ak.height - lllIlIlllIII[3], lllIlIlllIII[1]);
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
        void lllllllllllllllIIllIlIlIIIIlllll;
        Stack<Direction> stack = new Stack<Direction>();
        WorldPoint lllllllllllllllIIllIlIlIIIIlllII = worldPoint;
        while (n.lIIIllIIlIIIIll(lllllllllllllllIIllIlIlIIIIlllll.containsKey(lllllllllllllllIIllIlIlIIIIlllII) ? 1 : 0)) {
            void lllllllllllllllIIllIlIlIIIIlllIl;
            WorldPoint lllllllllllllllIIllIlIlIIIIllIll = (WorldPoint)lllllllllllllllIIllIlIlIIIIlllll.get(lllllllllllllllIIllIlIlIIIIlllII);
            if (n.lIIIllIIlIIlIII(lllllllllllllllIIllIlIlIIIIllIll.getX(), lllllllllllllllIIllIlIlIIIIlllII.getX())) {
                lllllllllllllllIIllIlIlIIIIlllIl.add(Direction.WEST);
                0;
                0;
                if (null != null) {
                    return null;
                }
            } else if (n.lIIIllIIlIIlIIl(lllllllllllllllIIllIlIlIIIIllIll.getX(), lllllllllllllllIIllIlIlIIIIlllII.getX())) {
                lllllllllllllllIIllIlIlIIIIlllIl.add(Direction.EAST);
                0;
                0;
                if (3 <= 0) {
                    return null;
                }
            } else if (n.lIIIllIIlIIlIII(lllllllllllllllIIllIlIlIIIIllIll.getY(), lllllllllllllllIIllIlIlIIIIlllII.getY())) {
                lllllllllllllllIIllIlIlIIIIlllIl.add(Direction.SOUTH);
                0;
                0;
                if (-1 == 3) {
                    return null;
                }
            } else {
                lllllllllllllllIIllIlIlIIIIlllIl.add(Direction.NORTH);
                0;
            }
            lllllllllllllllIIllIlIlIIIIlllII = lllllllllllllllIIllIlIlIIIIllIll;
            0;
            if (3 > 0) continue;
            return null;
        }
        return stack;
    }

    private static boolean lIIIllIIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllIIIllllIl(String lllllllllllllllIIllIlIIllllIIllI, String lllllllllllllllIIllIlIIllllIIIII) {
        lllllllllllllllIIllIlIIllllIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIllllIIlII = new StringBuilder();
        char[] lllllllllllllllIIllIlIIllllIIIll = lllllllllllllllIIllIlIIllllIIIII.toCharArray();
        int lllllllllllllllIIllIlIIllllIIIlI = lllIlIlllIII[1];
        char[] lllllllllllllllIIllIlIIlllIlllII = lllllllllllllllIIllIlIIllllIIllI.toCharArray();
        int lllllllllllllllIIllIlIIlllIllIll = lllllllllllllllIIllIlIIlllIlllII.length;
        int lllllllllllllllIIllIlIIlllIllIlI = lllIlIlllIII[1];
        while (n.lIIIllIIlIIlIIl(lllllllllllllllIIllIlIIlllIllIlI, lllllllllllllllIIllIlIIlllIllIll)) {
            char lllllllllllllllIIllIlIIllllIIlll = lllllllllllllllIIllIlIIlllIlllII[lllllllllllllllIIllIlIIlllIllIlI];
            lllllllllllllllIIllIlIIllllIIlII.append((char)(lllllllllllllllIIllIlIIllllIIlll ^ lllllllllllllllIIllIlIIllllIIIll[lllllllllllllllIIllIlIIllllIIIlI % lllllllllllllllIIllIlIIllllIIIll.length]));
            0;
            ++lllllllllllllllIIllIlIIllllIIIlI;
            ++lllllllllllllllIIllIlIIlllIllIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIllllIIlII);
    }

    private LocalPoint a(LocalPoint localPoint, Direction direction) {
        n lllllllllllllllIIllIlIlIIIIlIIll;
        WorldArea lllllllllllllllIIllIlIlIIIIIllll;
        int lllllllllllllllIIllIlIlIIIIIllIl;
        int lllllllllllllllIIllIlIlIIIIIlllI;
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ae, (LocalPoint)localPoint);
        WorldArea worldArea = worldPoint.toWorldArea();
        switch (m.u.a.-.e.s.q.t.i.r.o.an[direction.ordinal()]) {
            case 1: {
                lllllllllllllllIIllIlIlIIIIIlllI = lllIlIlllIII[1];
                lllllllllllllllIIllIlIlIIIIIllIl = lllIlIlllIII[3];
                0;
                if (2 >= 0) break;
                return null;
            }
            case 2: {
                lllllllllllllllIIllIlIlIIIIIlllI = lllIlIlllIII[1];
                lllllllllllllllIIllIlIlIIIIIllIl = lllIlIlllIII[12];
                0;
                if (3 > 0) break;
                return null;
            }
            case 3: {
                lllllllllllllllIIllIlIlIIIIIlllI = lllIlIlllIII[3];
                lllllllllllllllIIllIlIlIIIIIllIl = lllIlIlllIII[1];
                0;
                if (null == null) break;
                return null;
            }
            case 4: {
                lllllllllllllllIIllIlIlIIIIIlllI = lllIlIlllIII[12];
                lllllllllllllllIIllIlIlIIIIIllIl = lllIlIlllIII[1];
                0;
                if (2 >= 2) break;
                return null;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        while (n.lIIIllIIlIIIIll(lllllllllllllllIIllIlIlIIIIIllll.canTravelInDirection(lllllllllllllllIIllIlIlIIIIlIIll.ae.getTopLevelWorldView(), lllllllllllllllIIllIlIlIIIIIlllI, lllllllllllllllIIllIlIlIIIIIllIl) ? 1 : 0)) {
            WorldPoint lllllllllllllllIIllIlIlIIIIlIIII = lllllllllllllllIIllIlIlIIIIIllll.toWorldPoint().dx(lllllllllllllllIIllIlIlIIIIIlllI).dy(lllllllllllllllIIllIlIlIIIIIllIl);
            lllllllllllllllIIllIlIlIIIIIllll = lllllllllllllllIIllIlIlIIIIlIIII.toWorldArea();
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
        void lllllllllllllllIIllIlIIlllllllII;
        int n2 = lllIlIlllIII[10];
        int n3 = lllIlIlllIII[10];
        int n4 = Integer.MIN_VALUE;
        int n5 = Integer.MIN_VALUE;
        WallObject[] wallObjectArray2 = wallObjectArray;
        int n6 = wallObjectArray2.length;
        int lllllllllllllllIIllIlIIllllllIll = lllIlIlllIII[1];
        while (n.lIIIllIIlIIlIIl(lllllllllllllllIIllIlIIllllllIll, (int)lllllllllllllllIIllIlIIlllllllII)) {
            int lllllllllllllllIIllIlIIllllllllI;
            int lllllllllllllllIIllIlIIlllllllll;
            int lllllllllllllllIIllIlIlIIIIIIIII;
            int lllllllllllllllIIllIlIlIIIIIIIIl;
            void lllllllllllllllIIllIlIIlllllllIl;
            void lllllllllllllllIIllIlIIllllllIlI = lllllllllllllllIIllIlIIlllllllIl[lllllllllllllllIIllIlIIllllllIll];
            WorldPoint lllllllllllllllIIllIlIIllllllIIl = lllllllllllllllIIllIlIIllllllIlI.getWorldLocation();
            lllllllllllllllIIllIlIlIIIIIIIIl = Math.min(lllllllllllllllIIllIlIlIIIIIIIIl, lllllllllllllllIIllIlIIllllllIIl.getX());
            lllllllllllllllIIllIlIlIIIIIIIII = Math.min(lllllllllllllllIIllIlIlIIIIIIIII, lllllllllllllllIIllIlIIllllllIIl.getY());
            lllllllllllllllIIllIlIIlllllllll = Math.max(lllllllllllllllIIllIlIIlllllllll, lllllllllllllllIIllIlIIllllllIIl.getX());
            lllllllllllllllIIllIlIIllllllllI = Math.max(lllllllllllllllIIllIlIIllllllllI, lllllllllllllllIIllIlIIllllllIIl.getY());
            ++lllllllllllllllIIllIlIIllllllIll;
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
        void lllllllllllllllIIllIlIlIIllIIIll;
        n lllllllllllllllIIllIlIlIIllIIlII;
        WorldPoint worldPoint = this.ae.getLocalPlayer().getWorldLocation();
        if (n.lIIIllIIlIIIIll(this.ag.isEmpty() ? 1 : 0)) {
            return null;
        }
        Direction lllllllllllllllIIllIlIlIIllIIIlI = lllllllllllllllIIllIlIlIIllIIlII.ag.pop();
        WorldArea lllllllllllllllIIllIlIlIIllIIIIl = lllllllllllllllIIllIlIlIIllIIlII.a(lllllllllllllllIIllIlIlIIllIIIlI);
        WorldPoint lllllllllllllllIIllIlIlIIllIIIII = lllllllllllllllIIllIlIlIIllIIlII.a(lllllllllllllllIIllIlIlIIllIIIIl, (WorldPoint)lllllllllllllllIIllIlIlIIllIIIll);
        if (n.lIIIllIIlIIIIll(lllllllllllllllIIllIlIlIIllIIlII.ag.isEmpty() ? 1 : 0)) {
            lllllllllllllllIIllIlIlIIllIIlII.ag.push(lllllllllllllllIIllIlIlIIllIIIlI);
            0;
            return lllllllllllllllIIllIlIlIIllIIIII;
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
        Iterator lllllllllllllllIIllIlIlIIlIlIIIl = worldArea.toWorldPointList().iterator();
        while (n.lIIIllIIlIIIIll(lllllllllllllllIIllIlIlIIlIlIIIl.hasNext() ? 1 : 0)) {
            int lllllllllllllllIIllIlIlIIlIlIIll;
            WorldPoint lllllllllllllllIIllIlIlIIlIlIIlI;
            void lllllllllllllllIIllIlIlIIlIlIlII;
            WorldPoint lllllllllllllllIIllIlIlIIlIlIIII = (WorldPoint)lllllllllllllllIIllIlIlIIlIlIIIl.next();
            int lllllllllllllllIIllIlIlIIlIIllll = n.a(lllllllllllllllIIllIlIlIIlIlIIII, (WorldPoint)lllllllllllllllIIllIlIlIIlIlIlII);
            if (!n.lIIIllIIlIIIlll(lllllllllllllllIIllIlIlIIlIlIIlI) || n.lIIIllIIlIIlIII(lllllllllllllllIIllIlIlIIlIlIIll, lllllllllllllllIIllIlIlIIlIIllll)) {
                lllllllllllllllIIllIlIlIIlIlIIlI = lllllllllllllllIIllIlIlIIlIlIIII;
                lllllllllllllllIIllIlIlIIlIlIIll = lllllllllllllllIIllIlIlIIlIIllll;
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
            n lllllllllllllllIIllIlIlIIlllIIII;
            if (n.lIIIllIIlIIIlll(this.ah)) {
                graphics2D.setColor(Color.ORANGE);
                this.a(graphics2D, this.ah);
            }
            if (n.lIIIllIIlIIIlIl(lllllllllllllllIIllIlIlIIlllIIII.ag.isEmpty() ? 1 : 0)) {
                WorldPoint lllllllllllllllIIllIlIlIIllIllIl;
                Polygon lllllllllllllllIIllIlIlIIllIlllI;
                void lllllllllllllllIIllIlIlIIllIllll;
                if (n.lIIIllIIlIIIIIl(lllllllllllllllIIllIlIlIIlllIIII.ag.peek(), lllllllllllllllIIllIlIlIIlllIIII.J())) {
                    lllllllllllllllIIllIlIlIIllIllll.setColor(Color.GREEN);
                    0;
                    if ((0x32 ^ 0x36) < 0) {
                        return;
                    }
                } else {
                    lllllllllllllllIIllIlIlIIllIllll.setColor(Color.RED);
                }
                if (n.lIIIllIIlIIIlll(lllllllllllllllIIllIlIlIIllIlllI = Perspective.getCanvasTilePoly((Client)lllllllllllllllIIllIlIlIIlllIIII.ae, (LocalPoint)lllllllllllllllIIllIlIlIIlllIIII.al.getLocalLocation()))) {
                    lllllllllllllllIIllIlIlIIllIllll.drawPolygon(lllllllllllllllIIllIlIlIIllIlllI);
                }
                if (n.lIIIllIIlIIIlll(lllllllllllllllIIllIlIlIIllIllIl = lllllllllllllllIIllIlIlIIlllIIII.G())) {
                    lllllllllllllllIIllIlIlIIlllIIII.ae.setHintArrow(lllllllllllllllIIllIlIlIIllIllIl);
                    lllllllllllllllIIllIlIlIIlllIIII.a((Graphics2D)lllllllllllllllIIllIlIlIIllIllll, lllllllllllllllIIllIlIlIIllIllIl);
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
            void lllllllllllllllIIllIlIlIIlllllIl;
            lllllllllllllllIIllIlIlIIlllllll.al = lllllllllllllllIIllIlIlIIlllllIl;
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
        n lllllllllllllllIIllIlIIlllllIllI;
        void lllllllllllllllIIllIlIIlllllIlIl;
        WorldPoint worldPoint = this.ae.getLocalPlayer().getWorldLocation();
        if (n.lIIIllIIlIIllII(n.lIIIllIIlIIlIlI(worldPoint.getY(), this.ak.getMaxY())) && n.lIIIllIIlIIllIl(n.lIIIllIIlIIlIll(worldPoint.getX(), this.ak.getMaxX())) && n.lIIIllIIlIIlllI(n.lIIIllIIlIIlIlI(worldPoint.getX(), this.ak.getX()))) {
            return Direction.NORTH;
        }
        if (n.lIIIllIIlIIllll(n.lIIIllIIlIIlIll(lllllllllllllllIIllIlIIlllllIlIl.getY(), lllllllllllllllIIllIlIIlllllIllI.ak.getY())) && n.lIIIllIIlIIllIl(n.lIIIllIIlIIlIll(lllllllllllllllIIllIlIIlllllIlIl.getX(), lllllllllllllllIIllIlIIlllllIllI.ak.getMaxX())) && n.lIIIllIIlIIlllI(n.lIIIllIIlIIlIlI(lllllllllllllllIIllIlIIlllllIlIl.getX(), lllllllllllllllIIllIlIIlllllIllI.ak.getX()))) {
            return Direction.SOUTH;
        }
        if (n.lIIIllIIlIIllII(n.lIIIllIIlIIlIlI(lllllllllllllllIIllIlIIlllllIlIl.getX(), lllllllllllllllIIllIlIIlllllIllI.ak.getMaxX())) && n.lIIIllIIlIIllIl(n.lIIIllIIlIIlIll(lllllllllllllllIIllIlIIlllllIlIl.getY(), lllllllllllllllIIllIlIIlllllIllI.ak.getMaxY())) && n.lIIIllIIlIIlllI(n.lIIIllIIlIIlIlI(lllllllllllllllIIllIlIIlllllIlIl.getY(), lllllllllllllllIIllIlIIlllllIllI.ak.getY()))) {
            return Direction.EAST;
        }
        if (n.lIIIllIIlIIllll(n.lIIIllIIlIIlIll(lllllllllllllllIIllIlIIlllllIlIl.getX(), lllllllllllllllIIllIlIIlllllIllI.ak.getX())) && n.lIIIllIIlIIllIl(n.lIIIllIIlIIlIll(lllllllllllllllIIllIlIIlllllIlIl.getY(), lllllllllllllllIIllIlIIlllllIllI.ak.getMaxY())) && n.lIIIllIIlIIlllI(n.lIIIllIIlIIlIlI(lllllllllllllllIIllIlIIlllllIlIl.getY(), lllllllllllllllIIllIlIIlllllIllI.ak.getY()))) {
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

    private static String lIIIllIIIllllII(String lllllllllllllllIIllIlIIlllIlIIIl, String lllllllllllllllIIllIlIIlllIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIlllIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIlllIlIIll.init(lllIlIlllIII[5], lllllllllllllllIIllIlIIlllIlIlII);
            return new String(lllllllllllllllIIllIlIIlllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlllIlIIlI) {
            lllllllllllllllIIllIlIIlllIlIIlI.printStackTrace();
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
        n lllllllllllllllIIllIlIlIlIIIIlII;
        if (!n.lIIIllIIlIIIIll(this.c() ? 1 : 0) || n.lIIIllIIlIIIlII(this.ae.getGameState(), GameState.LOGGED_IN)) {
            lllllllllllllllIIllIlIlIlIIIIlII.am = null;
            lllllllllllllllIIllIlIlIlIIIIlII.ag.clear();
            return;
        }
        if (!n.lIIIllIIlIIIlIl(lllllllllllllllIIllIlIlIlIIIIlII.af.isEmpty() ? 1 : 0) || n.lIIIllIIlIIIllI(lllllllllllllllIIllIlIlIlIIIIlII.al)) {
            lllllllllllllllIIllIlIlIlIIIIlII.af.clear();
            int[] nArray = new int[lllIlIlllIII[3]];
            nArray[n.lllIlIlllIII[1]] = lllIlIlllIII[7];
            TileObjects.getAll((int[])nArray).forEach(tileObject -> {
                this.af.add((WallObject)tileObject);
                0;
            });
            lllllllllllllllIIllIlIlIlIIIIlII.ak = lllllllllllllllIIllIlIlIlIIIIlII.a(lllllllllllllllIIllIlIlIlIIIIlII.af.toArray(new WallObject[lllIlIlllIII[1]]));
            lllllllllllllllIIllIlIlIlIIIIlII.am = m.b(lllllllllllllllIIllIlIlIlIIIIlII.af.size());
            lllllllllllllllIIllIlIlIlIIIIlII.al = lllllllllllllllIIllIlIlIlIIIIlII.E();
            int[] nArray2 = new int[lllIlIlllIII[3]];
            nArray2[n.lllIlIlllIII[1]] = lllIlIlllIII[8];
            lllllllllllllllIIllIlIlIlIIIIlII.aj = TileObjects.getNearest((int[])nArray2).getWorldLocation();
            lllllllllllllllIIllIlIlIlIIIIlII.ag = lllllllllllllllIIllIlIlIlIIIIlII.H();
            return;
        }
        if (!n.lIIIllIIlIIIlll((Object)lllllllllllllllIIllIlIlIlIIIIlII.am) || n.lIIIllIIlIIIIII(lllllllllllllllIIllIlIlIlIIIIlII.af.size(), lllllllllllllllIIllIlIlIlIIIIlII.am.C())) {
            lllllllllllllllIIllIlIlIlIIIIlII.ak = lllllllllllllllIIllIlIlIlIIIIlII.a(lllllllllllllllIIllIlIlIlIIIIlII.af.toArray(new WallObject[lllIlIlllIII[1]]));
            lllllllllllllllIIllIlIlIlIIIIlII.am = m.b(lllllllllllllllIIllIlIlIlIIIIlII.af.size());
            lllllllllllllllIIllIlIlIlIIIIlII.ae.clearHintArrow();
            0;
            if (1 == 0) {
                return;
            }
        } else {
            WorldPoint lllllllllllllllIIllIlIlIlIIIIIll;
            if (n.lIIIllIIlIIIIlI(lllllllllllllllIIllIlIlIlIIIIlII.al.getId(), lllIlIlllIII[4])) {
                lllllllllllllllIIllIlIlIlIIIIlII.ah = lllllllllllllllIIllIlIlIlIIIIlII.I();
                lllllllllllllllIIllIlIlIlIIIIIll = WorldPoint.fromLocal((Client)lllllllllllllllIIllIlIlIlIIIIlII.ae, (LocalPoint)lllllllllllllllIIllIlIlIlIIIIlII.ah);
                0;
                if ((0x5D ^ 0x59) < 2) {
                    return;
                }
            } else {
                lllllllllllllllIIllIlIlIlIIIIlII.ah = null;
                lllllllllllllllIIllIlIlIlIIIIIll = lllllllllllllllIIllIlIlIlIIIIlII.al.getWorldLocation();
            }
            if (n.lIIIllIIlIIIIll(lllllllllllllllIIllIlIlIlIIIIIll.equals((Object)lllllllllllllllIIllIlIlIlIIIIlII.ai) ? 1 : 0)) {
                return;
            }
            aa.debug(lllIlIllIlll[lllIlIlllIII[1]], (Object)lllllllllllllllIIllIlIlIlIIIIlII.ai, (Object)lllllllllllllllIIllIlIlIlIIIIIll);
            lllllllllllllllIIllIlIlIlIIIIlII.ai = lllllllllllllllIIllIlIlIlIIIIIll;
            if (n.lIIIllIIlIIIIll(lllllllllllllllIIllIlIlIlIIIIlII.ai.equals((Object)lllllllllllllllIIllIlIlIlIIIIlII.aj) ? 1 : 0)) {
                lllllllllllllllIIllIlIlIlIIIIlII.ae.clearHintArrow();
                0;
                if (-2 >= 0) {
                    return;
                }
            } else {
                aa.debug(lllIlIllIlll[lllIlIlllIII[3]]);
                lllllllllllllllIIllIlIlIlIIIIlII.ag = lllllllllllllllIIllIlIlIlIIIIlII.H();
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
        void lllllllllllllllIIllIlIlIIIllIIIl;
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        HashSet hashSet = new HashSet();
        HashMap<WorldPoint, Integer> hashMap = new HashMap<WorldPoint, Integer>();
        HashMap<WorldPoint, WorldPoint> hashMap2 = new HashMap<WorldPoint, WorldPoint>();
        hashMap.put(worldPoint, lllIlIlllIII[1]);
        0;
        linkedList.add(worldPoint);
        0;
        while (n.lIIIllIIlIIIlIl(lllllllllllllllIIllIlIlIIIllIIIl.isEmpty() ? 1 : 0)) {
            LocalPoint[] lllllllllllllllIIllIlIlIIIlIlIll;
            n lllllllllllllllIIllIlIlIIIllIIll;
            void lllllllllllllllIIllIlIlIIIllIIII;
            WorldPoint lllllllllllllllIIllIlIlIIIlIllIl = (WorldPoint)lllllllllllllllIIllIlIlIIIllIIIl.poll();
            lllllllllllllllIIllIlIlIIIllIIII.add(lllllllllllllllIIllIlIlIIIlIllIl);
            0;
            LocalPoint lllllllllllllllIIllIlIlIIIlIllII = LocalPoint.fromWorld((Client)lllllllllllllllIIllIlIlIIIllIIll.ae, (WorldPoint)lllllllllllllllIIllIlIlIIIlIllIl);
            LocalPoint[] lllllllllllllllIIllIlIlIIIlIlIlI = lllllllllllllllIIllIlIlIIIlIlIll = lllllllllllllllIIllIlIlIIIllIIll.a(lllllllllllllllIIllIlIlIIIlIllII);
            int lllllllllllllllIIllIlIlIIIlIlIIl = lllllllllllllllIIllIlIlIIIlIlIlI.length;
            int lllllllllllllllIIllIlIlIIIlIlIII = lllIlIlllIII[1];
            while (n.lIIIllIIlIIlIIl(lllllllllllllllIIllIlIlIIIlIlIII, lllllllllllllllIIllIlIlIIIlIlIIl)) {
                LocalPoint lllllllllllllllIIllIlIlIIIlIIlll = lllllllllllllllIIllIlIlIIIlIlIlI[lllllllllllllllIIllIlIlIIIlIlIII];
                if (n.lIIIllIIlIIIllI(lllllllllllllllIIllIlIlIIIlIIlll)) {
                    0;
                    if (null != null) {
                        return null;
                    }
                } else {
                    WorldPoint lllllllllllllllIIllIlIlIIIlIIllI = WorldPoint.fromLocal((Client)lllllllllllllllIIllIlIlIIIllIIll.ae, (LocalPoint)lllllllllllllllIIllIlIlIIIlIIlll);
                    if (n.lIIIllIIlIIIlIl(lllllllllllllllIIllIlIlIIIlIIllI.equals((Object)lllllllllllllllIIllIlIlIIIlIllIl) ? 1 : 0) && n.lIIIllIIlIIIlIl(lllllllllllllllIIllIlIlIIIllIIII.contains(lllllllllllllllIIllIlIlIIIlIIllI) ? 1 : 0)) {
                        void lllllllllllllllIIllIlIlIIIlIllll;
                        int lllllllllllllllIIllIlIlIIIlIIlIl = (Integer)lllllllllllllllIIllIlIlIIIlIllll.get(lllllllllllllllIIllIlIlIIIlIllIl) + lllIlIlllIII[3];
                        if (!n.lIIIllIIlIIIIll(lllllllllllllllIIllIlIlIIIlIllll.containsKey(lllllllllllllllIIllIlIlIIIlIIllI) ? 1 : 0) || n.lIIIllIIlIIlIII((Integer)lllllllllllllllIIllIlIlIIIlIllll.get(lllllllllllllllIIllIlIlIIIlIIllI), lllllllllllllllIIllIlIlIIIlIIlIl)) {
                            void lllllllllllllllIIllIlIlIIIlIlllI;
                            lllllllllllllllIIllIlIlIIIlIllll.put(lllllllllllllllIIllIlIlIIIlIIllI, lllllllllllllllIIllIlIlIIIlIIlIl);
                            0;
                            lllllllllllllllIIllIlIlIIIlIlllI.put(lllllllllllllllIIllIlIlIIIlIIllI, lllllllllllllllIIllIlIlIIIlIllIl);
                            0;
                            lllllllllllllllIIllIlIlIIIllIIIl.add(lllllllllllllllIIllIlIlIIIlIIllI);
                            0;
                        }
                    }
                }
                ++lllllllllllllllIIllIlIlIIIlIlIII;
                0;
                if ((0xA5 ^ 0xA0) > 0) continue;
                return null;
            }
            0;
            if (null == null) continue;
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

