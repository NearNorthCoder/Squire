package m.u.a.p000.e.s.q.t.i.r;

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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
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
/* renamed from: m.u.a.-.e.s.q.t.i.r.n  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/n.class */
public class n extends b {
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
        switch (o.an[direction.ordinal()]) {
            case 1:
                return new WorldArea(this.ak.x + lllIlIlllIII[3], (int) this.ak.getMaxY(), this.ak.width - lllIlIlllIII[3], lllIlIlllIII[3], lllIlIlllIII[1]);
            case 2:
                return new WorldArea(this.ak.x + lllIlIlllIII[3], this.ak.y, this.ak.width - lllIlIlllIII[3], lllIlIlllIII[3], lllIlIlllIII[1]);
            case 3:
                return new WorldArea((int) this.ak.getMaxX(), this.ak.y + lllIlIlllIII[3], lllIlIlllIII[3], this.ak.height - lllIlIlllIII[3], lllIlIlllIII[1]);
            case 4:
                return new WorldArea(this.ak.x, this.ak.y + lllIlIlllIII[3], lllIlIlllIII[3], this.ak.height - lllIlIlllIII[3], lllIlIlllIII[1]);
            default:
                return null;
        }
    }

    private static void lIIIllIIIllllll() {
        lllIlIlllIII = new int[13];
        lllIlIlllIII[0] = "   ".length();
        lllIlIlllIII[1] = (235 ^ 174) & ((45 ^ 104) ^ (-1));
        lllIlIlllIII[2] = (-((-2301) & 19965)) & (-8323) & 32763;
        lllIlIlllIII[3] = " ".length();
        lllIlIlllIII[4] = (-1025) & 7802;
        lllIlIlllIII[5] = "  ".length();
        lllIlIlllIII[6] = (-((-3071) & 28671)) & (-389) & 32767;
        lllIlIlllIII[7] = (-((-24643) & 30075)) & (-197) & 16383;
        lllIlIlllIII[8] = (-((-6673) & 14869)) & (-898) & 32765;
        lllIlIlllIII[9] = ((75 + 179) - 69) + 13;
        lllIlIlllIII[10] = (-1) & Integer.MAX_VALUE;
        lllIlIlllIII[11] = 182 ^ 178;
        lllIlIlllIII[12] = -" ".length();
    }

    private static boolean lIIIllIIlIIIIII(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(GroundObjectSpawned groundObjectSpawned) {
        GroundObject groundObject = groundObjectSpawned.getGroundObject();
        if (lIIIllIIlIIIIlI(groundObject.getId(), lllIlIlllIII[8])) {
            this.aj = groundObject.getWorldLocation();
        }
    }

    private Stack<Direction> a(Map<WorldPoint, WorldPoint> map, WorldPoint worldPoint) {
        Stack<Direction> stack = new Stack<>();
        WorldPoint worldPoint2 = worldPoint;
        while (lIIIllIIlIIIIll(map.containsKey(worldPoint2) ? 1 : 0)) {
            WorldPoint worldPoint3 = map.get(worldPoint2);
            if (lIIIllIIlIIlIII(worldPoint3.getX(), worldPoint2.getX())) {
                stack.add(Direction.WEST);
                "".length();
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else if (lIIIllIIlIIlIIl(worldPoint3.getX(), worldPoint2.getX())) {
                stack.add(Direction.EAST);
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            } else if (lIIIllIIlIIlIII(worldPoint3.getY(), worldPoint2.getY())) {
                stack.add(Direction.SOUTH);
                "".length();
                "".length();
                if ((-" ".length()) == "   ".length()) {
                    return null;
                }
            } else {
                stack.add(Direction.NORTH);
                "".length();
            }
            worldPoint2 = worldPoint3;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return stack;
    }

    private static boolean lIIIllIIlIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIIllIIIllllIl(String lllllllllllllllIIllIlIIllllIIllI, String lllllllllllllllIIllIlIIllllIIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIllllIIlII = new StringBuilder();
        char[] lllllllllllllllIIllIlIIllllIIIll = lllllllllllllllIIllIlIIllllIIlIl.toCharArray();
        int lllllllllllllllIIllIlIIllllIIIlI = lllIlIlllIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIlllIII[1];
        while (lIIIllIIlIIlIIl(i, length)) {
            lllllllllllllllIIllIlIIllllIIlII.append((char) (charArray[i] ^ lllllllllllllllIIllIlIIllllIIIll[lllllllllllllllIIllIlIIllllIIIlI % lllllllllllllllIIllIlIIllllIIIll.length]));
            "".length();
            lllllllllllllllIIllIlIIllllIIIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIIllllIIlII);
    }

    private LocalPoint a(LocalPoint localPoint, Direction direction) {
        int i;
        int i2;
        WorldPoint fromLocal = WorldPoint.fromLocal(this.ae, localPoint);
        WorldArea worldArea = fromLocal.toWorldArea();
        switch (o.an[direction.ordinal()]) {
            case 1:
                i = lllIlIlllIII[1];
                i2 = lllIlIlllIII[3];
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
                break;
            case 2:
                i = lllIlIlllIII[1];
                i2 = lllIlIlllIII[12];
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
                break;
            case 3:
                i = lllIlIlllIII[3];
                i2 = lllIlIlllIII[1];
                "".length();
                if (0 != 0) {
                    return null;
                }
                break;
            case 4:
                i = lllIlIlllIII[12];
                i2 = lllIlIlllIII[1];
                "".length();
                if ("  ".length() < "  ".length()) {
                    return null;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        while (lIIIllIIlIIIIll(worldArea.canTravelInDirection(this.ae.getTopLevelWorldView(), i, i2) ? 1 : 0)) {
            fromLocal = worldArea.toWorldPoint().dx(i).dy(i2);
            worldArea = fromLocal.toWorldArea();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return LocalPoint.fromWorld(this.ae, fromLocal);
    }

    private static boolean lIIIllIIlIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllIIlIIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    private n(MagicArenaConfig magicArenaConfig, Client client) {
        super(magicArenaConfig);
        this.af = new ArrayList();
        this.ag = new Stack<>();
        this.ae = client;
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public c d() {
        return c.TELEKENETIC;
    }

    static {
        lIIIllIIIllllll();
        lIIIllIIIlllllI();
        ad = lllIlIlllIII[8];
        ac = lllIlIlllIII[4];
        ab = lllIlIlllIII[7];
        aa = LoggerFactory.getLogger(n.class);
    }

    private void a(Graphics2D graphics2D, LocalPoint localPoint) {
        if (lIIIllIIlIIIlll(localPoint)) {
            Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.ae, localPoint);
            if (lIIIllIIlIIIlll(canvasTilePoly)) {
                graphics2D.drawPolygon(canvasTilePoly);
            }
        }
    }

    @Subscribe
    public void a(WallObjectSpawned wallObjectSpawned) {
        WallObject wallObject = wallObjectSpawned.getWallObject();
        if (lIIIllIIlIIIIII(wallObject.getId(), lllIlIlllIII[7])) {
            return;
        }
        this.af.add(wallObject);
        "".length();
    }

    private LocalPoint[] a(LocalPoint localPoint) {
        LocalPoint[] localPointArr = new LocalPoint[lllIlIlllIII[11]];
        localPointArr[lllIlIlllIII[1]] = a(localPoint, Direction.NORTH);
        localPointArr[lllIlIlllIII[3]] = a(localPoint, Direction.SOUTH);
        localPointArr[lllIlIlllIII[5]] = a(localPoint, Direction.EAST);
        localPointArr[lllIlIlllIII[0]] = a(localPoint, Direction.WEST);
        return localPointArr;
    }

    private Rectangle a(WallObject[] wallObjectArr) {
        int i = lllIlIlllIII[10];
        int lllllllllllllllIIllIlIlIIIIIIIII = lllIlIlllIII[10];
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int length = wallObjectArr.length;
        int i4 = lllIlIlllIII[1];
        while (lIIIllIIlIIlIIl(i4, length)) {
            WorldPoint worldLocation = wallObjectArr[i4].getWorldLocation();
            i = Math.min(i, worldLocation.getX());
            lllllllllllllllIIllIlIlIIIIIIIII = Math.min(lllllllllllllllIIllIlIlIIIIIIIII, worldLocation.getY());
            i2 = Math.max(i2, worldLocation.getX());
            i3 = Math.max(i3, worldLocation.getY());
            i4++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return new Rectangle(i, lllllllllllllllIIllIlIlIIIIIIIII, i2 - i, i3 - lllllllllllllllIIllIlIlIIIIIIIII);
    }

    public WorldPoint G() {
        WorldPoint worldLocation = this.ae.getLocalPlayer().getWorldLocation();
        if (lIIIllIIlIIIIll(this.ag.isEmpty() ? 1 : 0)) {
            return null;
        }
        Direction pop = this.ag.pop();
        WorldArea a = a(pop);
        WorldPoint a2 = a(a, worldLocation);
        if (lIIIllIIlIIIIll(this.ag.isEmpty() ? 1 : 0)) {
            this.ag.push(pop);
            "".length();
            return a2;
        }
        Direction peek = this.ag.peek();
        this.ag.push(pop);
        "".length();
        return a(a, a(a(peek), a2));
    }

    private static boolean lIIIllIIlIIlllI(int i) {
        return i > 0;
    }

    private static boolean lIIIllIIlIIIIll(int i) {
        return i != 0;
    }

    private WorldPoint a(WorldArea worldArea, WorldPoint worldPoint) {
        int i = lllIlIlllIII[10];
        WorldPoint worldPoint2 = null;
        for (WorldPoint worldPoint3 : worldArea.toWorldPointList()) {
            int a = a(worldPoint3, worldPoint);
            if (!lIIIllIIlIIIlll(worldPoint2) || lIIIllIIlIIlIII(i, a)) {
                worldPoint2 = worldPoint3;
                i = a;
            }
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return worldPoint2;
    }

    private static boolean lIIIllIIlIIllll(int i) {
        return i <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public boolean c() {
        if (lIIIllIIlIIIlll(this.ae.getWidget(lllIlIlllIII[9], lllIlIlllIII[1]))) {
            ?? r0 = lllIlIlllIII[3];
            "".length();
            return (((((50 + 41) - 42) + 113) ^ (((38 + 15) - (-110)) + 9)) & (((((25 + 43) - (-44)) + 73) ^ (((3 + 155) - 49) + 74)) ^ (-" ".length()))) != 0 ? ((202 ^ 198) ^ (70 ^ 113)) & (((((216 + 103) - 136) + 72) ^ (((153 + 51) - 144) + 136)) ^ (-" ".length())) : r0;
        }
        return lllIlIlllIII[1];
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public void a(Graphics2D graphics2D) {
        if (lIIIllIIlIIIIll(c() ? 1 : 0) && lIIIllIIlIIIlll(this.am) && lIIIllIIlIIIlll(this.al)) {
            if (lIIIllIIlIIIlll(this.ah)) {
                graphics2D.setColor(Color.ORANGE);
                a(graphics2D, this.ah);
            }
            if (lIIIllIIlIIIlIl(this.ag.isEmpty() ? 1 : 0)) {
                if (lIIIllIIlIIIIIl(this.ag.peek(), J())) {
                    graphics2D.setColor(Color.GREEN);
                    "".length();
                    if ((50 ^ 54) < 0) {
                        return;
                    }
                } else {
                    graphics2D.setColor(Color.RED);
                }
                Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.ae, this.al.getLocalLocation());
                if (lIIIllIIlIIIlll(canvasTilePoly)) {
                    graphics2D.drawPolygon(canvasTilePoly);
                }
                WorldPoint G = G();
                if (lIIIllIIlIIIlll(G)) {
                    this.ae.setHintArrow(G);
                    a(graphics2D, G);
                }
            }
        }
    }

    private static int lIIIllIIlIIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public void F() {
        this.aj = null;
        this.af.clear();
    }

    private static boolean lIIIllIIlIIllIl(int i) {
        return i < 0;
    }

    private static boolean lIIIllIIlIIllII(int i) {
        return i >= 0;
    }

    private static boolean lIIIllIIlIIIlll(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (lIIIllIIlIIIIII(npc.getId(), lllIlIlllIII[2]) && lIIIllIIlIIIIII(npc.getId(), lllIlIlllIII[4]) && !lIIIllIIlIIIIlI(npc.getId(), lllIlIlllIII[6])) {
            return;
        }
        this.al = npc;
    }

    public WorldPoint K() {
        return this.aj;
    }

    private static int a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return Math.abs(worldPoint.getX() - worldPoint2.getX()) + Math.abs(worldPoint2.getY() - worldPoint.getY());
    }

    private Direction J() {
        WorldPoint worldLocation = this.ae.getLocalPlayer().getWorldLocation();
        if (lIIIllIIlIIllII(lIIIllIIlIIlIlI(worldLocation.getY(), this.ak.getMaxY())) && lIIIllIIlIIllIl(lIIIllIIlIIlIll(worldLocation.getX(), this.ak.getMaxX())) && lIIIllIIlIIlllI(lIIIllIIlIIlIlI(worldLocation.getX(), this.ak.getX()))) {
            return Direction.NORTH;
        }
        if (lIIIllIIlIIllll(lIIIllIIlIIlIll(worldLocation.getY(), this.ak.getY())) && lIIIllIIlIIllIl(lIIIllIIlIIlIll(worldLocation.getX(), this.ak.getMaxX())) && lIIIllIIlIIlllI(lIIIllIIlIIlIlI(worldLocation.getX(), this.ak.getX()))) {
            return Direction.SOUTH;
        }
        if (lIIIllIIlIIllII(lIIIllIIlIIlIlI(worldLocation.getX(), this.ak.getMaxX())) && lIIIllIIlIIllIl(lIIIllIIlIIlIll(worldLocation.getY(), this.ak.getMaxY())) && lIIIllIIlIIlllI(lIIIllIIlIIlIlI(worldLocation.getY(), this.ak.getY()))) {
            return Direction.EAST;
        }
        if (lIIIllIIlIIllll(lIIIllIIlIIlIll(worldLocation.getX(), this.ak.getX())) && lIIIllIIlIIllIl(lIIIllIIlIIlIll(worldLocation.getY(), this.ak.getMaxY())) && lIIIllIIlIIlllI(lIIIllIIlIIlIlI(worldLocation.getY(), this.ak.getY()))) {
            return Direction.WEST;
        }
        return null;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIIIllIIlIIIIIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            F();
        }
    }

    private static int lIIIllIIlIIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIIIllIIIllllII(String lllllllllllllllIIllIlIIlllIlIIIl, String lllllllllllllllIIllIlIIlllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlllIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlllIlIIlI) {
            lllllllllllllllIIllIlIIlllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIlIIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private LocalPoint I() {
        return a(this.al.getLocalLocation(), new Angle(this.al.getOrientation()).getNearestDirection());
    }

    public NPC E() {
        int[] iArr = new int[lllIlIlllIII[0]];
        iArr[lllIlIlllIII[1]] = lllIlIlllIII[2];
        iArr[lllIlIlllIII[3]] = lllIlIlllIII[4];
        iArr[lllIlIlllIII[5]] = lllIlIlllIII[6];
        return NPCs.getNearest(iArr);
    }

    private static void lIIIllIIIlllllI() {
        lllIlIllIlll = new String[lllIlIlllIII[5]];
        lllIlIllIlll[lllIlIlllIII[1]] = lIIIllIIIllllII("AnshAQdVYIpQjlgc+DmlnlwoqO4PWL8Ehqq7dbGWYdQa5Okog9CZQw==", "ZJHYM");
        lllIlIllIlll[lllIlIlllIII[3]] = lIIIllIIIllllIl("MSMMACgPIgcbJkMrAQMkEGYKACRDMgFVJhYnHBEoAihOGC4VIw==", "cFnuA");
    }

    private static boolean lIIIllIIlIIlIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIllIIlIIIlIl(int i) {
        return i == 0;
    }

    private void a(Graphics2D graphics2D, WorldPoint worldPoint) {
        a(graphics2D, LocalPoint.fromWorld(this.ae, worldPoint));
    }

    @Subscribe
    public void a(GameTick gameTick) {
        WorldPoint worldLocation;
        if (!lIIIllIIlIIIIll(c() ? 1 : 0) || lIIIllIIlIIIlII(this.ae.getGameState(), GameState.LOGGED_IN)) {
            this.am = null;
            this.ag.clear();
        } else if (!lIIIllIIlIIIlIl(this.af.isEmpty() ? 1 : 0) || lIIIllIIlIIIllI(this.al)) {
            this.af.clear();
            int[] iArr = new int[lllIlIlllIII[3]];
            iArr[lllIlIlllIII[1]] = lllIlIlllIII[7];
            TileObjects.getAll(iArr).forEach(tileObject -> {
                this.af.add((WallObject) tileObject);
                "".length();
            });
            this.ak = a((WallObject[]) this.af.toArray(new WallObject[lllIlIlllIII[1]]));
            this.am = m.b(this.af.size());
            this.al = E();
            int[] iArr2 = new int[lllIlIlllIII[3]];
            iArr2[lllIlIlllIII[1]] = lllIlIlllIII[8];
            this.aj = TileObjects.getNearest(iArr2).getWorldLocation();
            this.ag = H();
        } else if (!lIIIllIIlIIIlll(this.am) || lIIIllIIlIIIIII(this.af.size(), this.am.C())) {
            this.ak = a((WallObject[]) this.af.toArray(new WallObject[lllIlIlllIII[1]]));
            this.am = m.b(this.af.size());
            this.ae.clearHintArrow();
            "".length();
            if (" ".length() == 0) {
            }
        } else {
            if (lIIIllIIlIIIIlI(this.al.getId(), lllIlIlllIII[4])) {
                this.ah = I();
                worldLocation = WorldPoint.fromLocal(this.ae, this.ah);
                "".length();
                if ((93 ^ 89) < "  ".length()) {
                    return;
                }
            } else {
                this.ah = null;
                worldLocation = this.al.getWorldLocation();
            }
            if (lIIIllIIlIIIIll(worldLocation.equals(this.ai) ? 1 : 0)) {
                return;
            }
            aa.debug(lllIlIllIlll[lllIlIlllIII[1]], this.ai, worldLocation);
            this.ai = worldLocation;
            if (!lIIIllIIlIIIIll(this.ai.equals(this.aj) ? 1 : 0)) {
                aa.debug(lllIlIllIlll[lllIlIlllIII[3]]);
                this.ag = H();
                return;
            }
            this.ae.clearHintArrow();
            "".length();
            if ((-"  ".length()) >= 0) {
            }
        }
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIIIllIIlIIIIIl(npcDespawned.getNpc(), this.al)) {
            this.al = null;
        }
    }

    private static boolean lIIIllIIlIIIllI(Object obj) {
        return obj == null;
    }

    private Stack<Direction> a(WorldPoint worldPoint) {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(worldPoint, Integer.valueOf(lllIlIlllIII[1]));
        "".length();
        linkedList.add(worldPoint);
        "".length();
        while (lIIIllIIlIIIlIl(linkedList.isEmpty() ? 1 : 0)) {
            WorldPoint worldPoint2 = (WorldPoint) linkedList.poll();
            hashSet.add(worldPoint2);
            "".length();
            LocalPoint[] a = a(LocalPoint.fromWorld(this.ae, worldPoint2));
            int lllllllllllllllIIllIlIlIIIlIlIIl = a.length;
            int i = lllIlIlllIII[1];
            while (lIIIllIIlIIlIIl(i, lllllllllllllllIIllIlIlIIIlIlIIl)) {
                LocalPoint localPoint = a[i];
                if (lIIIllIIlIIIllI(localPoint)) {
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else {
                    WorldPoint fromLocal = WorldPoint.fromLocal(this.ae, localPoint);
                    if (lIIIllIIlIIIlIl(fromLocal.equals(worldPoint2) ? 1 : 0) && lIIIllIIlIIIlIl(hashSet.contains(fromLocal) ? 1 : 0)) {
                        int intValue = ((Integer) hashMap.get(worldPoint2)).intValue() + lllIlIlllIII[3];
                        if (!lIIIllIIlIIIIll(hashMap.containsKey(fromLocal) ? 1 : 0) || lIIIllIIlIIlIII(((Integer) hashMap.get(fromLocal)).intValue(), intValue)) {
                            hashMap.put(fromLocal, Integer.valueOf(intValue));
                            "".length();
                            hashMap2.put(fromLocal, worldPoint2);
                            "".length();
                            linkedList.add(fromLocal);
                            "".length();
                        }
                    }
                }
                i++;
                "".length();
                if ((165 ^ 160) <= 0) {
                    return null;
                }
            }
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return a(hashMap2, this.aj);
    }

    private Stack<Direction> H() {
        return lIIIllIIlIIIIlI(this.al.getId(), lllIlIlllIII[4]) ? a(WorldPoint.fromLocal(this.ae, I())) : a(this.al.getWorldLocation());
    }
}
