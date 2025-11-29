/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.GroundObject
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GroundObjectDespawned
 *  net.runelite.api.events.GroundObjectSpawned
 *  net.runelite.api.events.ProjectileMoved
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.GroundObject;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.s_Unknown;

@Singleton
public class p_Unknown {
    private static final /* synthetic */ int ar;
    private static final /* synthetic */ int ap;
    private /* synthetic */ int aN;
    private static final /* synthetic */ int az;
    private final /* synthetic */ Set<GroundObject> aB;
    private static final /* synthetic */ int av;
    private static /* synthetic */ String[] llIIIlIlIll;
    private final /* synthetic */ Map<GroundObject, Integer> aJ;
    private static final /* synthetic */ int ay;
    private final /* synthetic */ Set<GroundObject> aF;
    private final /* synthetic */ List<WorldPoint> aG;
    private static final /* synthetic */ int au;
    private static final /* synthetic */ int aq;
    private static final /* synthetic */ int as;
    private static final /* synthetic */ int aw;
    private final /* synthetic */ List<Projectile> aE;
    private final /* synthetic */ List<Projectile> aD;
    private final /* synthetic */ Client aK;
    private static final /* synthetic */ int ao;
    private final /* synthetic */ Map<GroundObject, Integer> aI;
    private /* synthetic */ int aL;
    private final /* synthetic */ Map<GroundObject, Integer> aA;
    private /* synthetic */ int aM;
    private static /* synthetic */ int[] llIIIlIllII;
    private static final /* synthetic */ int at;
    private final /* synthetic */ Queue<WorldPoint> aC;
    private final /* synthetic */ Set<GameObject> aH;
    private static final /* synthetic */ int ax;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GroundObject var1;
        void var42;
        p var27;
        void var24;
        int n2 = this.aK.getTickCount();
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (p.lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[7])) {
            void var14;
            if (p.lIIllllIIIlllI(n2 - this.aM, llIIIlIllII[8])) {
                this.aC.clear();
            }
            var27.aM = var24;
            var27.aC.add(var14.getTile().getWorldLocation());
            0;
        }
        if (p.lIIllllIIlIIII(var42.getId(), llIIIlIllII[9]) && p.lIIllllIIlIlII(var27.aN, (int)var24)) {
            var27.aN = var24;
            var27.aG.clear();
        }
        if (p.lIIllllIIlIIII(var42.getId(), llIIIlIllII[10])) {
            var27.aH.add((GameObject)var42);
            0;
        }
        Iterator<GroundObject> var23 = var27.aI.keySet().iterator();
        while (p.lIIllllIIlIlIl(var23.hasNext() ? 1 : 0)) {
            var1 = var23.next();
            if (p.lIIllllIIlIlIl(var1.getWorldLocation().equals((Object)var42.getWorldLocation()) ? 1 : 0)) {
                var27.aI.remove(var1);
                0;
                0;
                if (((0x56 ^ 0x72 ^ (0xF ^ 0x60)) & (136 + 246 - 310 + 181 ^ 88 + 142 - 143 + 95 ^ -1)) >= 0) break;
                return;
            }
            0;
            
            return;
        }
        var23 = var27.aJ.keySet().iterator();
        while (p.lIIllllIIlIlIl(var23.hasNext() ? 1 : 0)) {
            var1 = var23.next();
            if (p.lIIllllIIlIlIl(var1.getWorldLocation().equals((Object)var42.getWorldLocation()) ? 1 : 0)) {
                var27.aJ.remove(var1);
                0;
                0;
                if (1 >= 0) break;
                return;
            }
            0;
            if (((0x2F ^ 0x61) & ~(0x43 ^ 0xD)) <= 0) continue;
            return;
        }
    }

    public Queue<WorldPoint> R() {
        return this.aC;
    }

    private static boolean lIIllllIIlIIll(Object object, Object object2) {
        return object != object2;
    }

    public int Z() {
        return this.aL;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GroundObjectSpawned groundObjectSpawned) {
        p var33;
        void var18;
        GroundObject groundObject = groundObjectSpawned.getGroundObject();
        if (p.lIIllllIIIlllI(groundObject.getId(), llIIIlIllII[1]) && p.lIIllllIIIllll(groundObject.getId(), llIIIlIllII[2])) {
            this.aA.put(groundObject, this.f(groundObject.getId()));
            0;
        }
        if (p.lIIllllIIlIIII(var18.getId(), llIIIlIllII[1])) {
            var33.aF.add((GroundObject)var18);
            0;
        }
        if (p.lIIllllIIlIIIl(var18.getId(), llIIIlIllII[3]) && p.lIIllllIIlIIlI(var18.getId(), llIIIlIllII[4])) {
            var33.aJ.put((GroundObject)var18, llIIIlIllII[5] + var18.getId() - llIIIlIllII[3]);
            0;
        }
        if (p.lIIllllIIlIIIl(var18.getId(), llIIIlIllII[4]) && p.lIIllllIIlIIlI(var18.getId(), llIIIlIllII[6])) {
            var33.aI.put((GroundObject)var18, llIIIlIllII[5] + var18.getId() - llIIIlIllII[4]);
            0;
        }
    }

    @Inject
    public p(Client client) {
        this.aA = new HashMap<GroundObject, Integer>();
        this.aB = new HashSet<GroundObject>();
        this.aC = new LinkedList<WorldPoint>();
        this.aD = new ArrayList<Projectile>();
        this.aE = new ArrayList<Projectile>();
        this.aF = new HashSet<GroundObject>();
        this.aG = new ArrayList<WorldPoint>();
        this.aH = new HashSet<GameObject>();
        this.aI = new HashMap<GroundObject, Integer>();
        this.aJ = new HashMap<GroundObject, Integer>();
        this.aK = client;
    }

    private static void lIIllllIIIllIl() {
        llIIIlIllII = new int[17];
        p.llIIIlIllII[0] = (0x9D ^ 0xAE ^ (0xFB ^ 0x92)) & (0x15 ^ 0x24 ^ (0x18 ^ 0x73) ^ -1);
        p.llIIIlIllII[1] = 0xFFFFB125 & 0xFFFA;
        p.llIIIlIllII[2] = 0xFFFFB5AB & 0xFB7D;
        p.llIIIlIllII[3] = 0xFFFFBB7D & 0xF5AE;
        p.llIIIlIllII[4] = -(0xFFFFCC4F & 0x77B9) & (0xFFFFF73F & 0xFDFD);
        p.llIIIlIllII[5] = 1;
        p.llIIIlIllII[6] = -(0xFFFFAC55 & 0x5BAB) & (0xFFFFF9BF & 0xBF7F);
        p.llIIIlIllII[7] = -(0xFFFF8E63 & Short.MAX_VALUE) & (0xFFFFBFFF & 0xFF7F);
        p.llIIIlIllII[8] = 0xB7 ^ 0xBF;
        p.llIIIlIllII[9] = -(0xFFFFAFF6 & 0x5A3B) & (0xFFFFFF7F & 0xBBF9);
        p.llIIIlIllII[10] = 0xFFFFA17D & 0x5FBF;
        p.llIIIlIllII[11] = -(0xFFFFEDA6 & 0x5E5B) & (0xFFFFFF5F & 0xFDBB);
        p.llIIIlIllII[12] = 0xFFFFCFDF & 0x38FA;
        p.llIIIlIllII[13] = 0xFFFFBF7F & 0x48E3;
        p.llIIIlIllII[14] = 0xB1 ^ 0x8F;
        p.llIIIlIllII[15] = 0xFFFFE5B7 & 0x1FEF;
        p.llIIIlIllII[16] = 2;
    }

    private static boolean lIIllllIIlIlll(int n2) {
        return n2 < 0;
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (p.lIIllllIIlIIll(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.aA.clear();
            this.aB.clear();
            this.aG.clear();
            this.aI.clear();
            this.aJ.clear();
        }
    }

    private static boolean lIIllllIIllIII(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> O() {
        void var20;
        int[] nArray = new int[llIIIlIllII[5]];
        nArray[p.llIIIlIllII[0]] = llIIIlIllII[1];
        List list = TileObjects.getAll((int[])nArray);
        HashMap<WorldPoint, Boolean> hashMap = new HashMap<WorldPoint, Boolean>();
        Iterator var15 = list.iterator();
        while (p.lIIllllIIlIlIl(var15.hasNext() ? 1 : 0)) {
            boolean bl2;
            TileObject var34 = (TileObject)var15.next();
            WorldPoint worldPoint = var34.getWorldLocation();
            if (p.lIIllllIIllIIl(TileObjects.getAll(tileObject2 -> {
                int n2;
                if (p.lIIllllIIlIlIl(tileObject2.getWorldLocation().equals((Object)var34.getWorldLocation()) ? 1 : 0) && p.lIIllllIIlIIII(tileObject2.getId(), llIIIlIllII[9])) {
                    n2 = llIIIlIllII[5];
                    0;
                    if (-3 >= 0) {
                        return ((0x77 ^ 0xB ^ (0x62 ^ 1)) & (6 + 65 - -24 + 39 ^ 14 + 60 - 57 + 136 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIlIllII[0];
                }
                return n2 != 0;
            }).size())) {
                bl2 = llIIIlIllII[5];
                0;
                if (-1 > 0) {
                    return null;
                }
            } else {
                bl2 = llIIIlIllII[0];
            }
            var20.put(worldPoint, bl2);
            0;
            0;
            if (3 > -1) continue;
            return null;
        }
        if (p.lIIllllIIllIlI(var20.containsValue(llIIIlIllII[0]) ? 1 : 0)) {
            return new ArrayList<WorldPoint>();
        }
        s s2 = new s(hashMap);
        return s2.af();
    }

    private static boolean lIIllllIIllIlI(int n2) {
        return n2 == 0;
    }

    public void w() {
        this.aA.clear();
        this.aB.clear();
        this.aF.clear();
        this.aG.clear();
        this.aC.clear();
        this.aD.clear();
        this.aE.clear();
        this.aH.clear();
        this.aI.clear();
        this.aJ.clear();
        this.aL = llIIIlIllII[0];
        this.aM = llIIIlIllII[0];
        this.aN = llIIIlIllII[0];
    }

    private static boolean lIIllllIIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileMoved projectileMoved) {
        void var9;
        Projectile projectile = projectileMoved.getProjectile();
        if (p.lIIllllIIIlllI(projectile.getEndCycle(), this.aK.getGameCycle())) {
            return;
        }
        if (p.lIIllllIIlIIII(var9.getId(), llIIIlIllII[12])) {
            p var25;
            var25.aD.remove(var9);
            0;
        }
    }

    private static String lIIllllIIIlIlI(String var40, String var2) {
        var40 = new String(Base64.getDecoder().decode(var40.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var29 = var2.toCharArray();
        int var10 = llIIIlIllII[0];
        char[] var32 = var40.toCharArray();
        int var12 = var32.length;
        int var5 = llIIIlIllII[0];
        while (p.lIIllllIIlIIlI(var5, var12)) {
            char var41 = var32[var5];
            var16.append((char)(var41 ^ var29[var10 % var29.length]));
            0;
            ++var10;
            ++var5;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    public List<Projectile> S() {
        return this.aD;
    }

    public Set<GroundObject> Q() {
        return this.aB;
    }

    private int f(int n2) {
        return n2 - llIIIlIllII[1];
    }

    public Map<GroundObject, Integer> P() {
        return this.aA;
    }

    private static boolean lIIllllIIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIllllIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIllllIIIllII() {
        llIIIlIlIll = new String[llIIIlIllII[16]];
        p.llIIIlIlIll[p.llIIIlIllII[0]] = p."chipped into the stone";
        p.llIIIlIlIll[p.llIIIlIllII[5]] = p."</col>";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        void var21;
        int n2 = this.aK.getTickCount();
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (p.lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[11])) {
            this.aC.clear();
        }
        if (p.lIIllllIIlIIII(var21.getId(), llIIIlIllII[10])) {
            p var13;
            var13.aH.add((GameObject)var21);
            0;
        }
    }

    public Map<GroundObject, Integer> X() {
        return this.aI;
    }

    private static boolean lIIllllIIlIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var37;
        if (p.lIIllllIIlIIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var11 = var37.getMessage();
        if (p.lIIllllIIlIlIl(var11.contains(llIIIlIlIll[llIIIlIllII[0]]) ? 1 : 0)) {
            p var36;
            String[] var6 = var11.split(llIIIlIlIll[llIIIlIllII[5]]);
            String var38 = var6[llIIIlIllII[0]].substring(var6[llIIIlIllII[0]].indexOf(llIIIlIllII[14]) + llIIIlIllII[5]);
            int var19 = Integer.parseInt(var38);
            List var26 = var36.P().keySet().stream().sorted(Comparator.comparingInt(TileObject::getX)).collect(Collectors.toList());
            Iterator var3 = var26.iterator();
            while (p.lIIllllIIlIlIl(var3.hasNext() ? 1 : 0)) {
                GroundObject var35 = (GroundObject)var3.next();
                int var28 = var36.P().get(var35);
                if (p.lIIllllIIlIlll(var19 - var28)) {
                    0;
                    if (-1 <= 0) continue;
                    return;
                }
                if (p.lIIllllIIllIII(p.lIIllllIIlIllI(var26.stream().filter(groundObject2 -> {
                    boolean bl2;
                    if (p.lIIllllIIlIIII(groundObject2.getWorldLocation().distanceTo2D(var35.getWorldLocation()), llIIIlIllII[5])) {
                        bl2 = llIIIlIllII[5];
                        0;
                        if (-1 >= 2) {
                            return false;
                        }
                    } else {
                        bl2 = llIIIlIllII[0];
                    }
                    return bl2;
                }).count(), 8L))) {
                    0;
                    if (2 >= 1) continue;
                    return;
                }
                var36.aB.add(var35);
                0;
                var19 -= var28;
                0;
                if (3 != 1) continue;
                return;
            }
        }
    }

    public void g(int n2) {
        this.aL = n2;
    }

    private static String lIIllllIIIlIll(String var31, String var39) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var39.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIIIlIllII[16], var7);
            return new String(var4.doFinal(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var43) {
            var43.printStackTrace();
            return null;
        }
    }

    public Set<GameObject> W() {
        return this.aH;
    }

    private static boolean lIIllllIIllIIl(int n2) {
        return n2 > 0;
    }

    static {
        p.lIIllllIIIllIl();
        p.lIIllllIIIllII();
        au = llIIIlIllII[9];
        ay = llIIIlIllII[15];
        ao = llIIIlIllII[3];
        ar = llIIIlIllII[7];
        av = llIIIlIllII[1];
        aw = llIIIlIllII[12];
        at = llIIIlIllII[2];
        az = llIIIlIllII[10];
        ap = llIIIlIllII[4];
        as = llIIIlIllII[1];
        aq = llIIIlIllII[11];
        ax = llIIIlIllII[13];
    }

    @Subscribe
    public void a(GameTick gameTick) {
        int[] nArray = new int[llIIIlIllII[5]];
        nArray[p.llIIIlIllII[0]] = llIIIlIllII[1];
        List list = TileObjects.getAll((int[])nArray);
        if (p.lIIllllIIlIlIl(list.isEmpty() ? 1 : 0)) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GroundObjectDespawned groundObjectDespawned) {
        void var30;
        GroundObject groundObject = groundObjectDespawned.getGroundObject();
        this.aA.remove(groundObject);
        0;
        this.aF.remove(groundObject);
        0;
        if (p.lIIllllIIlIIIl(groundObject.getId(), llIIIlIllII[3]) && p.lIIllllIIlIIlI(groundObject.getId(), llIIIlIllII[4])) {
            this.aJ.remove(groundObject);
            0;
        }
        if (p.lIIllllIIlIIIl(var30.getId(), llIIIlIllII[4]) && p.lIIllllIIlIIlI(var30.getId(), llIIIlIllII[6])) {
            p var22;
            var22.aI.remove(var30);
            0;
        }
    }

    private static int lIIllllIIlIllI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public List<WorldPoint> V() {
        return this.aG;
    }

    private static boolean lIIllllIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    public List<Projectile> T() {
        return this.aE;
    }

    public Map<GroundObject, Integer> Y() {
        return this.aJ;
    }

    public Set<GroundObject> U() {
        return this.aF;
    }

    private static boolean lIIllllIIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllllIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var17;
        Projectile projectile = projectileSpawned.getProjectile();
        if (p.lIIllllIIlIIII(projectile.getId(), llIIIlIllII[12])) {
            this.aD.add(projectile);
            0;
        }
        if (p.lIIllllIIlIIII(var17.getId(), llIIIlIllII[13])) {
            p var8;
            var8.aE.add((Projectile)var17);
            0;
        }
    }
}

