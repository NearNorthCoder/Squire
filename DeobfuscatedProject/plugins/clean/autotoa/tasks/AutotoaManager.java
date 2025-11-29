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
package gg.squire.autotoa.tasks;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.s;

@Singleton
public class AutotoaManager {
    private static final  int ar;
    private static final  int ap;
    private  int aN;
    private static final  int az;
    private final  Set<GroundObject> aB;
    private static final  int av;
    
    private final  Map<GroundObject, Integer> aJ;
    private static final  int ay;
    private final  Set<GroundObject> aF;
    private final  List<WorldPoint> aG;
    private static final  int au;
    private static final  int aq;
    private static final  int as;
    private static final  int aw;
    private final  List<Projectile> aE;
    private final  List<Projectile> aD;
    private final  Client aK;
    private static final  int ao;
    private final  Map<GroundObject, Integer> aI;
    private  int aL;
    private final  Map<GroundObject, Integer> aA;
    private  int aM;
    
    private static final  int at;
    private final  Queue<WorldPoint> aC;
    private final  Set<GameObject> aH;
    private static final  int ax;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GroundObject var1;
        void var2;
        p var3;
        void var4;
        int n2 = this.aK.getTickCount();
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (p.lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[7])) {
            void var5;
            if (p.lIIllllIIIlllI(n2 - this.aM, llIIIlIllII[8])) {
                this.aC.clear();
            }
            var3.aM = var4;
            var3.aC.add(var5.getTile().getWorldLocation());

        }
        if (p.lIIllllIIlIIII(var2.getId(), llIIIlIllII[9]) && p.lIIllllIIlIlII(var3.aN, (int)var4)) {
            var3.aN = var4;
            var3.aG.clear();
        }
        if (p.lIIllllIIlIIII(var2.getId(), llIIIlIllII[10])) {
            var3.aH.add((GameObject)var2);

        }
        Iterator<GroundObject> var6 = var3.aI.keySet().iterator();
        while (p.lIIllllIIlIlIl(var6.hasNext() ? 1 : 0)) {
            var1 = var6.next();
            if (p.lIIllllIIlIlIl(var1.getWorldLocation().equals((Object)var2.getWorldLocation()) ? 1 : 0)) {
                var3.aI.remove(var1);

                if (((0x56 ^ 0x72 ^ (0xF ^ 0x60)) & (136 + 246 - 310 + 181 ^ 88 + 142 - 143 + 95 ^ -1)) >= 0) break;
                return;
            }

            return;
        }
        var6 = var3.aJ.keySet().iterator();
        while (p.lIIllllIIlIlIl(var6.hasNext() ? 1 : 0)) {
            var1 = var6.next();
            if (p.lIIllllIIlIlIl(var1.getWorldLocation().equals((Object)var2.getWorldLocation()) ? 1 : 0)) {
                var3.aJ.remove(var1);

                if (1 >= 0) break;
                return;
            }

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
        p var7;
        void var8;
        GroundObject groundObject = groundObjectSpawned.getGroundObject();
        if (p.lIIllllIIIlllI(groundObject.getId(), llIIIlIllII[1]) && p.lIIllllIIIllll(groundObject.getId(), llIIIlIllII[2])) {
            this.aA.put(groundObject, this.f(groundObject.getId()));

        }
        if (p.lIIllllIIlIIII(var8.getId(), llIIIlIllII[1])) {
            var7.aF.add((GroundObject)var8);

        }
        if (p.lIIllllIIlIIIl(var8.getId(), llIIIlIllII[3]) && p.lIIllllIIlIIlI(var8.getId(), llIIIlIllII[4])) {
            var7.aJ.put((GroundObject)var8, llIIIlIllII[5] + var8.getId() - llIIIlIllII[3]);

        }
        if (p.lIIllllIIlIIIl(var8.getId(), llIIIlIllII[4]) && p.lIIllllIIlIIlI(var8.getId(), llIIIlIllII[6])) {
            var7.aI.put((GroundObject)var8, llIIIlIllII[5] + var8.getId() - llIIIlIllII[4]);

        }
    }

    @Inject
    public AutotoaManager(Client client) {
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
        void var9;
        int[] nArray = new int[llIIIlIllII[5]];
        nArray[p.llIIIlIllII[0]] = llIIIlIllII[1];
        List list = TileObjects.getAll((int[])nArray);
        HashMap<WorldPoint, Boolean> hashMap = new HashMap<WorldPoint, Boolean>();
        Iterator var10 = list.iterator();
        while (p.lIIllllIIlIlIl(var10.hasNext() ? 1 : 0)) {
            boolean bl2;
            TileObject var11 = (TileObject)var10.next();
            WorldPoint worldPoint = var11.getWorldLocation();
            if (p.lIIllllIIllIIl(TileObjects.getAll(tileObject2 -> {
                int n2;
                if (p.lIIllllIIlIlIl(tileObject2.getWorldLocation().equals((Object)var11.getWorldLocation()) ? 1 : 0) && p.lIIllllIIlIIII(tileObject2.getId(), llIIIlIllII[9])) {
                    n2 = llIIIlIllII[5];

                } else {
                    n2 = llIIIlIllII[0];
                }
                return n2 != 0;
            }).size())) {
                bl2 = llIIIlIllII[5];

            } else {
                bl2 = llIIIlIllII[0];
            }
            var9.put(worldPoint, bl2);

            if (3 > -1) continue;
            return null;
        }
        if (p.lIIllllIIllIlI(var9.containsValue(llIIIlIllII[0]) ? 1 : 0)) {
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
        void var12;
        Projectile projectile = projectileMoved.getProjectile();
        if (p.lIIllllIIIlllI(projectile.getEndCycle(), this.aK.getGameCycle())) {
            return;
        }
        if (p.lIIllllIIlIIII(var12.getId(), llIIIlIllII[12])) {
            p var13;
            var13.aD.remove(var12);

        }
    }

        return String.valueOf(var14);
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
        p.llIIIlIlIll[p.llIIIlIllII[0]] = "chipped into the stone";
        p.llIIIlIlIll[p.llIIIlIllII[5]] = "</col>";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        void var15;
        int n2 = this.aK.getTickCount();
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (p.lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[11])) {
            this.aC.clear();
        }
        if (p.lIIllllIIlIIII(var15.getId(), llIIIlIllII[10])) {
            p var16;
            var16.aH.add((GameObject)var15);

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
        void var17;
        if (p.lIIllllIIlIIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var18 = var17.getMessage();
        if (p.lIIllllIIlIlIl(var18.contains(llIIIlIlIll[llIIIlIllII[0]]) ? 1 : 0)) {
            p var19;
            String[] var20 = var18.split(llIIIlIlIll[llIIIlIllII[5]]);
            String var21 = var20[llIIIlIllII[0]].substring(var20[llIIIlIllII[0]].indexOf(llIIIlIllII[14]) + llIIIlIllII[5]);
            int var22 = Integer.parseInt(var21);
            List var23 = var19.P().keySet().stream().sorted(Comparator.comparingInt(TileObject::getX)).collect(Collectors.toList());
            Iterator var24 = var23.iterator();
            while (p.lIIllllIIlIlIl(var24.hasNext() ? 1 : 0)) {
                GroundObject var25 = (GroundObject)var24.next();
                int var26 = var19.P().get(var25);
                if (p.lIIllllIIlIlll(var22 - var26)) {

                    if (-1 <= 0) continue;
                    return;
                }
                if (p.lIIllllIIllIII(p.lIIllllIIlIllI(var23.stream().filter(groundObject2 -> {
                    boolean bl2;
                    if (p.lIIllllIIlIIII(groundObject2.getWorldLocation().distanceTo2D(var25.getWorldLocation()), llIIIlIllII[5])) {
                        bl2 = llIIIlIllII[5];

                        if (-1 >= 2) {
                            return false;
                        }
                    } else {
                        bl2 = llIIIlIllII[0];
                    }
                    return bl2;
                }).count(), 8L))) {

                    if (2 >= 1) continue;
                    return;
                }
                var19.aB.add(var25);

                var22 -= var26;

                if (3 != 1) continue;
                return;
            }
        }
    }

    public void g(int n2) {
        this.aL = n2;
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
        void var27;
        GroundObject groundObject = groundObjectDespawned.getGroundObject();
        this.aA.remove(groundObject);

        this.aF.remove(groundObject);

        if (p.lIIllllIIlIIIl(groundObject.getId(), llIIIlIllII[3]) && p.lIIllllIIlIIlI(groundObject.getId(), llIIIlIllII[4])) {
            this.aJ.remove(groundObject);

        }
        if (p.lIIllllIIlIIIl(var27.getId(), llIIIlIllII[4]) && p.lIIllllIIlIIlI(var27.getId(), llIIIlIllII[6])) {
            p var28;
            var28.aI.remove(var27);

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
        void var29;
        Projectile projectile = projectileSpawned.getProjectile();
        if (p.lIIllllIIlIIII(projectile.getId(), llIIIlIllII[12])) {
            this.aD.add(projectile);

        }
        if (p.lIIllllIIlIIII(var29.getId(), llIIIlIllII[13])) {
            p var30;
            var30.aE.add((Projectile)var29);

        }
    }
}

