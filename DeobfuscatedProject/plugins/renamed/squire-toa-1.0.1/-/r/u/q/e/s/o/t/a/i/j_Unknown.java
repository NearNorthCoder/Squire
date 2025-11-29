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
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.k_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
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

@Singleton
public class j_Unknown {
    private static final /* synthetic */ int ac;
    private final /* synthetic */ Set<GameObject> ak;
    private static final /* synthetic */ int Y;
    private /* synthetic */ int ao;
    private final /* synthetic */ Set<GroundObject> ae;
    private final /* synthetic */ Map<GroundObject, Integer> al;
    private static /* synthetic */ int[] lIlIIIIIllIlI;
    private final /* synthetic */ List<WorldPoint> aj;
    private static /* synthetic */ String[] lIlIIIIIllIIl;
    private static final /* synthetic */ int R;
    private final /* synthetic */ Set<GroundObject> ai;
    private static final /* synthetic */ int S;
    private static final /* synthetic */ int V;
    private static final /* synthetic */ int X;
    private static final /* synthetic */ int aa;
    private final /* synthetic */ Client an;
    private /* synthetic */ int ap;
    private static final /* synthetic */ int U;
    private static final /* synthetic */ int W;
    private final /* synthetic */ Map<GroundObject, Integer> am;
    private final /* synthetic */ List<Projectile> ah;
    private static final /* synthetic */ int Z;
    private static final /* synthetic */ int ab;
    private final /* synthetic */ List<Projectile> ag;
    private static final /* synthetic */ int T;
    private final /* synthetic */ Queue<WorldPoint> af;
    private final /* synthetic */ Map<GroundObject, Integer> ad;

    private static boolean lIllIllIIllIllI(int n2) {
        return n2 != 0;
    }

    public Set<GameObject> v() {
        return this.ak;
    }

    public Set<GroundObject> t() {
        return this.ai;
    }

    public List<Projectile> r() {
        return this.ag;
    }

    private static boolean lIllIllIIlllIII(int n2) {
        return n2 < 0;
    }

    private static boolean lIllIllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.lIllIllIIlIlllI();
        j.lIllIllIIlIllIl();
        W = lIlIIIIIllIlI[2];
        Y = lIlIIIIIllIlI[1];
        U = lIlIIIIIllIlI[7];
        S = lIlIIIIIllIlI[4];
        X = lIlIIIIIllIlI[9];
        V = lIlIIIIIllIlI[1];
        aa = lIlIIIIIllIlI[13];
        R = lIlIIIIIllIlI[3];
        ab = lIlIIIIIllIlI[15];
        ac = lIlIIIIIllIlI[10];
        T = lIlIIIIIllIlI[11];
        Z = lIlIIIIIllIlI[12];
    }

    private static boolean lIllIllIIlllIIl(int n2) {
        return n2 >= 0;
    }

    public Map<GroundObject, Integer> o() {
        return this.ad;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GroundObject var33;
        void var2;
        j var26;
        void var19;
        int n2 = this.an.getTickCount();
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (j.lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[7])) {
            void var7;
            if (j.lIllIllIIlIllll(n2 - this.ao, lIlIIIIIllIlI[8])) {
                this.af.clear();
            }
            var26.ao = var19;
            var26.af.add(var7.getTile().getWorldLocation());
            0;
        }
        if (j.lIllIllIIllIIIl(var2.getId(), lIlIIIIIllIlI[9]) && j.lIllIllIIllIlIl(var26.ap, (int)var19)) {
            var26.ap = var19;
            var26.aj.clear();
        }
        if (j.lIllIllIIllIIIl(var2.getId(), lIlIIIIIllIlI[10])) {
            var26.ak.add((GameObject)var2);
            0;
        }
        Iterator<GroundObject> var16 = var26.al.keySet().iterator();
        while (j.lIllIllIIllIllI(var16.hasNext() ? 1 : 0)) {
            var33 = var16.next();
            if (j.lIllIllIIllIllI(var33.getWorldLocation().equals((Object)var2.getWorldLocation()) ? 1 : 0)) {
                var26.al.remove(var33);
                0;
                0;
                if (((0x4F ^ 0x52) & ~(0xAF ^ 0xB2)) > -1) break;
                return;
            }
            0;
            if (-1 < 0) continue;
            return;
        }
        var16 = var26.am.keySet().iterator();
        while (j.lIllIllIIllIllI(var16.hasNext() ? 1 : 0)) {
            var33 = var16.next();
            if (j.lIllIllIIllIllI(var33.getWorldLocation().equals((Object)var2.getWorldLocation()) ? 1 : 0)) {
                var26.am.remove(var33);
                0;
                0;
                if (-3 <= 0) break;
                return;
            }
            0;
            if (((0xFC ^ 0xC2) & ~(0x17 ^ 0x29)) == 0) continue;
            return;
        }
    }

    public Map<GroundObject, Integer> x() {
        return this.am;
    }

    private static void lIllIllIIlIllIl() {
        lIlIIIIIllIIl = new String[lIlIIIIIllIlI[16]];
        j.lIlIIIIIllIIl[j.lIlIIIIIllIlI[0]] = j."chipped into the stone";
        j.lIlIIIIIllIIl[j.lIlIIIIIllIlI[5]] = j."</col>";
    }

    private static boolean lIllIllIIllIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var22;
        Projectile projectile = projectileSpawned.getProjectile();
        if (j.lIllIllIIllIIIl(projectile.getId(), lIlIIIIIllIlI[12])) {
            this.ag.add(projectile);
            0;
        }
        if (j.lIllIllIIllIIIl(var22.getId(), lIlIIIIIllIlI[13])) {
            j var30;
            var30.ah.add((Projectile)var22);
            0;
        }
    }

    public void c() {
        this.ad.clear();
        this.ae.clear();
        this.ai.clear();
        this.aj.clear();
        this.af.clear();
        this.ag.clear();
        this.ah.clear();
        this.ak.clear();
        this.al.clear();
        this.am.clear();
        this.ao = lIlIIIIIllIlI[0];
    }

    public Set<GroundObject> p() {
        return this.ae;
    }

    private static boolean lIllIllIIlllIlI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        void var4;
        int n2 = this.an.getTickCount();
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (j.lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[11])) {
            this.af.clear();
        }
        if (j.lIllIllIIllIIIl(var4.getId(), lIlIIIIIllIlI[10])) {
            j var3;
            var3.ak.add((GameObject)var4);
            0;
        }
    }

    private static boolean lIllIllIIllIlIl(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GroundObjectSpawned groundObjectSpawned) {
        j var8;
        void var10;
        GroundObject groundObject = groundObjectSpawned.getGroundObject();
        if (j.lIllIllIIlIllll(groundObject.getId(), lIlIIIIIllIlI[1]) && j.lIllIllIIllIIII(groundObject.getId(), lIlIIIIIllIlI[2])) {
            this.ad.put(groundObject, this.b(groundObject.getId()));
            0;
        }
        if (j.lIllIllIIllIIIl(var10.getId(), lIlIIIIIllIlI[1])) {
            var8.ai.add((GroundObject)var10);
            0;
        }
        if (j.lIllIllIIllIIlI(var10.getId(), lIlIIIIIllIlI[3]) && j.lIllIllIIllIIll(var10.getId(), lIlIIIIIllIlI[4])) {
            var8.am.put((GroundObject)var10, lIlIIIIIllIlI[5] + var10.getId() - lIlIIIIIllIlI[3]);
            0;
        }
        if (j.lIllIllIIllIIlI(var10.getId(), lIlIIIIIllIlI[4]) && j.lIllIllIIllIIll(var10.getId(), lIlIIIIIllIlI[6])) {
            var8.al.put((GroundObject)var10, lIlIIIIIllIlI[5] + var10.getId() - lIlIIIIIllIlI[4]);
            0;
        }
    }

    public List<WorldPoint> u() {
        return this.aj;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileMoved projectileMoved) {
        void var14;
        Projectile projectile = projectileMoved.getProjectile();
        if (j.lIllIllIIlIllll(projectile.getEndCycle(), this.an.getGameCycle())) {
            return;
        }
        if (j.lIllIllIIllIIIl(var14.getId(), lIlIIIIIllIlI[12])) {
            j var18;
            var18.ag.remove(var14);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GroundObjectDespawned groundObjectDespawned) {
        void var32;
        GroundObject groundObject = groundObjectDespawned.getGroundObject();
        this.ad.remove(groundObject);
        0;
        this.ai.remove(groundObject);
        0;
        if (j.lIllIllIIllIIlI(groundObject.getId(), lIlIIIIIllIlI[3]) && j.lIllIllIIllIIll(groundObject.getId(), lIlIIIIIllIlI[4])) {
            this.am.remove(groundObject);
            0;
        }
        if (j.lIllIllIIllIIlI(var32.getId(), lIlIIIIIllIlI[4]) && j.lIllIllIIllIIll(var32.getId(), lIlIIIIIllIlI[6])) {
            j var27;
            var27.al.remove(var32);
            0;
        }
    }

    @Inject
    public j(Client client) {
        this.ad = new HashMap<GroundObject, Integer>();
        this.ae = new HashSet<GroundObject>();
        this.af = new LinkedList<WorldPoint>();
        this.ag = new ArrayList<Projectile>();
        this.ah = new ArrayList<Projectile>();
        this.ai = new HashSet<GroundObject>();
        this.aj = new ArrayList<WorldPoint>();
        this.ak = new HashSet<GameObject>();
        this.al = new HashMap<GroundObject, Integer>();
        this.am = new HashMap<GroundObject, Integer>();
        this.an = client;
    }

    public List<Projectile> s() {
        return this.ah;
    }

    private static boolean lIllIllIIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private int b(int n2) {
        return n2 - lIlIIIIIllIlI[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var12;
        if (j.lIllIllIIllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var24 = var12.getMessage();
        if (j.lIllIllIIllIllI(var24.contains(lIlIIIIIllIIl[lIlIIIIIllIlI[0]]) ? 1 : 0)) {
            j var23;
            String[] var1 = var24.split(lIlIIIIIllIIl[lIlIIIIIllIlI[5]]);
            String var34 = var1[lIlIIIIIllIlI[0]].substring(var1[lIlIIIIIllIlI[0]].indexOf(lIlIIIIIllIlI[14]) + lIlIIIIIllIlI[5]);
            int var5 = Integer.parseInt(var34);
            List var25 = var23.o().keySet().stream().sorted(Comparator.comparingInt(TileObject::getX)).collect(Collectors.toList());
            Iterator var20 = var25.iterator();
            while (j.lIllIllIIllIllI(var20.hasNext() ? 1 : 0)) {
                GroundObject var17 = (GroundObject)var20.next();
                int var28 = var23.o().get(var17);
                if (j.lIllIllIIlllIII(var5 - var28)) {
                    0;
                    if (-1 <= 0) continue;
                    return;
                }
                if (j.lIllIllIIlllIIl(j.lIllIllIIllIlll(var25.stream().filter(groundObject2 -> {
                    boolean bl;
                    if (j.lIllIllIIllIIIl(groundObject2.getWorldLocation().distanceTo2D(var17.getWorldLocation()), lIlIIIIIllIlI[5])) {
                        bl = lIlIIIIIllIlI[5];
                        0;
                        if (((32 + 37 - -28 + 45 ^ 168 + 161 - 192 + 37) & (57 + 108 - 123 + 101 ^ 146 + 9 - 20 + 40 ^ -1)) != 0) {
                            return ((0x74 ^ 0x3C ^ (0x7E ^ 2)) & (55 + 70 - 121 + 131 ^ 39 + 61 - 39 + 118 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIIIIIllIlI[0];
                    }
                    return bl;
                }).count(), 8L))) {
                    0;
                    
                    return;
                }
                var23.ae.add(var17);
                0;
                var5 -= var28;
                0;
                if (((0x32 ^ 0x52) & ~(0x15 ^ 0x75)) == 0) continue;
                return;
            }
        }
    }

    private static int lIllIllIIllIlll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static void lIllIllIIlIlllI() {
        lIlIIIIIllIlI = new int[17];
        j.lIlIIIIIllIlI[0] = (0xB3 ^ 0xA8) & ~(0x4D ^ 0x56);
        j.lIlIIIIIllIlI[1] = -(0xFFFFFEDF & 0x4BAB) & (0xFFFFFBEE & 0xFFBB);
        j.lIlIIIIIllIlI[2] = -(0xFFFFEF83 & 0x5EFD) & (0xFFFFFFEF & 0xFFB9);
        j.lIlIIIIIllIlI[3] = -(11 + 97 - 104 + 189) & (0xFFFFF7FD & 0xB9EE);
        j.lIlIIIIIllIlI[4] = 0xFFFFB3FD & 0xFD37;
        j.lIlIIIIIllIlI[5] = 1;
        j.lIlIIIIIllIlI[6] = 0xFFFFB7FF & 0xF93F;
        j.lIlIIIIIllIlI[7] = 0xFFFFF75D & 0xB9BF;
        j.lIlIIIIIllIlI[8] = 0x79 ^ 0x71;
        j.lIlIIIIIllIlI[9] = -(0xFFFFEFDF & 0x5C38) & (0xFFFFFD7F & 0xFFDF);
        j.lIlIIIIIllIlI[10] = -(0xFFFFF7F5 & 0x7E8B) & (0xFFFFF7FF & 0x7FBD);
        j.lIlIIIIIllIlI[11] = 0xFFFFF7BB & 0xB95E;
        j.lIlIIIIIllIlI[12] = -(0xFFFFB52F & 0x7BF6) & (0xFFFFF9FF & 0x3FFF);
        j.lIlIIIIIllIlI[13] = -(0xFFFFA345 & 0x7DBB) & (0xFFFFBBEF & 0x6D73);
        j.lIlIIIIIllIlI[14] = 0x2C ^ 0x12;
        j.lIlIIIIIllIlI[15] = 0xFFFFDFFF & 0x25A7;
        j.lIlIIIIIllIlI[16] = 2;
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (j.lIllIllIIllIlII(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.ad.clear();
            this.ae.clear();
            this.aj.clear();
            this.al.clear();
            this.am.clear();
        }
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> n() {
        void var11;
        int[] nArray = new int[lIlIIIIIllIlI[5]];
        nArray[j.lIlIIIIIllIlI[0]] = lIlIIIIIllIlI[1];
        List list = TileObjects.getAll((int[])nArray);
        HashMap<WorldPoint, Boolean> hashMap = new HashMap<WorldPoint, Boolean>();
        Iterator var15 = list.iterator();
        while (j.lIllIllIIllIllI(var15.hasNext() ? 1 : 0)) {
            boolean bl;
            TileObject var31 = (TileObject)var15.next();
            WorldPoint worldPoint = var31.getWorldLocation();
            if (j.lIllIllIIlllIlI(TileObjects.getAll(tileObject2 -> {
                int n2;
                if (j.lIllIllIIllIllI(tileObject2.getWorldLocation().equals((Object)var31.getWorldLocation()) ? 1 : 0) && j.lIllIllIIllIIIl(tileObject2.getId(), lIlIIIIIllIlI[9])) {
                    n2 = lIlIIIIIllIlI[5];
                    0;
                    if (3 >= (0x63 ^ 0x2B ^ (1 ^ 0x4D))) {
                        return ((30 + 14 - -67 + 83 ^ 65 + 127 - 65 + 26) & (0xA4 ^ 0x8A ^ (0x42 ^ 0x37) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIIIIllIlI[0];
                }
                return n2 != 0;
            }).size())) {
                bl = lIlIIIIIllIlI[5];
                0;
                if (1 != 1) {
                    return null;
                }
            } else {
                bl = lIlIIIIIllIlI[0];
            }
            var11.put(worldPoint, bl);
            0;
            0;
            if (-(0x1B ^ 0x1F) < 0) continue;
            return null;
        }
        if (j.lIllIllIIlllIll(var11.containsValue(lIlIIIIIllIlI[0]) ? 1 : 0)) {
            return new ArrayList<WorldPoint>();
        }
        k k2 = new k(hashMap);
        return k2.y();
    }

    private static boolean lIllIllIIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIllIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIllIIlIllII(String var6, String var13) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIlI[8]), "DES");
            Cipher var29 = Cipher.getInstance("DES");
            var29.init(lIlIIIIIllIlI[16], var9);
            return new String(var29.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlllIll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        int[] nArray = new int[lIlIIIIIllIlI[5]];
        nArray[j.lIlIIIIIllIlI[0]] = lIlIIIIIllIlI[1];
        List list = TileObjects.getAll((int[])nArray);
        if (j.lIllIllIIllIllI(list.isEmpty() ? 1 : 0)) {
            return;
        }
    }

    public Queue<WorldPoint> q() {
        return this.af;
    }

    private static boolean lIllIllIIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    public Map<GroundObject, Integer> w() {
        return this.al;
    }
}

