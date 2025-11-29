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

import -.r.u.q.e.s.o.t.a.i.k;
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
public class j {
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
        GroundObject llllllllllllllIlllIIlIlllIIllIll;
        void llllllllllllllIlllIIlIlllIIlllIl;
        j llllllllllllllIlllIIlIlllIlIIIII;
        void llllllllllllllIlllIIlIlllIIllllI;
        int n2 = this.an.getTickCount();
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (j.lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[7])) {
            void llllllllllllllIlllIIlIlllIIlllll;
            if (j.lIllIllIIlIllll(n2 - this.ao, lIlIIIIIllIlI[8])) {
                this.af.clear();
            }
            llllllllllllllIlllIIlIlllIlIIIII.ao = llllllllllllllIlllIIlIlllIIllllI;
            llllllllllllllIlllIIlIlllIlIIIII.af.add(llllllllllllllIlllIIlIlllIIlllll.getTile().getWorldLocation());
            0;
        }
        if (j.lIllIllIIllIIIl(llllllllllllllIlllIIlIlllIIlllIl.getId(), lIlIIIIIllIlI[9]) && j.lIllIllIIllIlIl(llllllllllllllIlllIIlIlllIlIIIII.ap, (int)llllllllllllllIlllIIlIlllIIllllI)) {
            llllllllllllllIlllIIlIlllIlIIIII.ap = llllllllllllllIlllIIlIlllIIllllI;
            llllllllllllllIlllIIlIlllIlIIIII.aj.clear();
        }
        if (j.lIllIllIIllIIIl(llllllllllllllIlllIIlIlllIIlllIl.getId(), lIlIIIIIllIlI[10])) {
            llllllllllllllIlllIIlIlllIlIIIII.ak.add((GameObject)llllllllllllllIlllIIlIlllIIlllIl);
            0;
        }
        Iterator<GroundObject> llllllllllllllIlllIIlIlllIIlllII = llllllllllllllIlllIIlIlllIlIIIII.al.keySet().iterator();
        while (j.lIllIllIIllIllI(llllllllllllllIlllIIlIlllIIlllII.hasNext() ? 1 : 0)) {
            llllllllllllllIlllIIlIlllIIllIll = llllllllllllllIlllIIlIlllIIlllII.next();
            if (j.lIllIllIIllIllI(llllllllllllllIlllIIlIlllIIllIll.getWorldLocation().equals((Object)llllllllllllllIlllIIlIlllIIlllIl.getWorldLocation()) ? 1 : 0)) {
                llllllllllllllIlllIIlIlllIlIIIII.al.remove(llllllllllllllIlllIIlIlllIIllIll);
                0;
                0;
                if (((0x4F ^ 0x52) & ~(0xAF ^ 0xB2)) > -1) break;
                return;
            }
            0;
            if (-1 < 0) continue;
            return;
        }
        llllllllllllllIlllIIlIlllIIlllII = llllllllllllllIlllIIlIlllIlIIIII.am.keySet().iterator();
        while (j.lIllIllIIllIllI(llllllllllllllIlllIIlIlllIIlllII.hasNext() ? 1 : 0)) {
            llllllllllllllIlllIIlIlllIIllIll = llllllllllllllIlllIIlIlllIIlllII.next();
            if (j.lIllIllIIllIllI(llllllllllllllIlllIIlIlllIIllIll.getWorldLocation().equals((Object)llllllllllllllIlllIIlIlllIIlllIl.getWorldLocation()) ? 1 : 0)) {
                llllllllllllllIlllIIlIlllIlIIIII.am.remove(llllllllllllllIlllIIlIlllIIllIll);
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
        void llllllllllllllIlllIIlIlllIIIllIl;
        Projectile projectile = projectileSpawned.getProjectile();
        if (j.lIllIllIIllIIIl(projectile.getId(), lIlIIIIIllIlI[12])) {
            this.ag.add(projectile);
            0;
        }
        if (j.lIllIllIIllIIIl(llllllllllllllIlllIIlIlllIIIllIl.getId(), lIlIIIIIllIlI[13])) {
            j llllllllllllllIlllIIlIlllIIIllll;
            llllllllllllllIlllIIlIlllIIIllll.ah.add((Projectile)llllllllllllllIlllIIlIlllIIIllIl);
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
        void llllllllllllllIlllIIlIlllIIlIIll;
        int n2 = this.an.getTickCount();
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (j.lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[11])) {
            this.af.clear();
        }
        if (j.lIllIllIIllIIIl(llllllllllllllIlllIIlIlllIIlIIll.getId(), lIlIIIIIllIlI[10])) {
            j llllllllllllllIlllIIlIlllIIlIllI;
            llllllllllllllIlllIIlIlllIIlIllI.ak.add((GameObject)llllllllllllllIlllIIlIlllIIlIIll);
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
        j llllllllllllllIlllIIlIlllIllIIll;
        void llllllllllllllIlllIIlIlllIllIIIl;
        GroundObject groundObject = groundObjectSpawned.getGroundObject();
        if (j.lIllIllIIlIllll(groundObject.getId(), lIlIIIIIllIlI[1]) && j.lIllIllIIllIIII(groundObject.getId(), lIlIIIIIllIlI[2])) {
            this.ad.put(groundObject, this.b(groundObject.getId()));
            0;
        }
        if (j.lIllIllIIllIIIl(llllllllllllllIlllIIlIlllIllIIIl.getId(), lIlIIIIIllIlI[1])) {
            llllllllllllllIlllIIlIlllIllIIll.ai.add((GroundObject)llllllllllllllIlllIIlIlllIllIIIl);
            0;
        }
        if (j.lIllIllIIllIIlI(llllllllllllllIlllIIlIlllIllIIIl.getId(), lIlIIIIIllIlI[3]) && j.lIllIllIIllIIll(llllllllllllllIlllIIlIlllIllIIIl.getId(), lIlIIIIIllIlI[4])) {
            llllllllllllllIlllIIlIlllIllIIll.am.put((GroundObject)llllllllllllllIlllIIlIlllIllIIIl, lIlIIIIIllIlI[5] + llllllllllllllIlllIIlIlllIllIIIl.getId() - lIlIIIIIllIlI[3]);
            0;
        }
        if (j.lIllIllIIllIIlI(llllllllllllllIlllIIlIlllIllIIIl.getId(), lIlIIIIIllIlI[4]) && j.lIllIllIIllIIll(llllllllllllllIlllIIlIlllIllIIIl.getId(), lIlIIIIIllIlI[6])) {
            llllllllllllllIlllIIlIlllIllIIll.al.put((GroundObject)llllllllllllllIlllIIlIlllIllIIIl, lIlIIIIIllIlI[5] + llllllllllllllIlllIIlIlllIllIIIl.getId() - lIlIIIIIllIlI[4]);
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
        void llllllllllllllIlllIIlIlllIIIIlll;
        Projectile projectile = projectileMoved.getProjectile();
        if (j.lIllIllIIlIllll(projectile.getEndCycle(), this.an.getGameCycle())) {
            return;
        }
        if (j.lIllIllIIllIIIl(llllllllllllllIlllIIlIlllIIIIlll.getId(), lIlIIIIIllIlI[12])) {
            j llllllllllllllIlllIIlIlllIIIlIIl;
            llllllllllllllIlllIIlIlllIIIlIIl.ag.remove(llllllllllllllIlllIIlIlllIIIIlll);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GroundObjectDespawned groundObjectDespawned) {
        void llllllllllllllIlllIIlIlllIlIlIll;
        GroundObject groundObject = groundObjectDespawned.getGroundObject();
        this.ad.remove(groundObject);
        0;
        this.ai.remove(groundObject);
        0;
        if (j.lIllIllIIllIIlI(groundObject.getId(), lIlIIIIIllIlI[3]) && j.lIllIllIIllIIll(groundObject.getId(), lIlIIIIIllIlI[4])) {
            this.am.remove(groundObject);
            0;
        }
        if (j.lIllIllIIllIIlI(llllllllllllllIlllIIlIlllIlIlIll.getId(), lIlIIIIIllIlI[4]) && j.lIllIllIIllIIll(llllllllllllllIlllIIlIlllIlIlIll.getId(), lIlIIIIIllIlI[6])) {
            j llllllllllllllIlllIIlIlllIlIllIl;
            llllllllllllllIlllIIlIlllIlIllIl.al.remove(llllllllllllllIlllIIlIlllIlIlIll);
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
        void llllllllllllllIlllIIlIllIllllIll;
        if (j.lIllIllIIllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String llllllllllllllIlllIIlIllIllllIlI = llllllllllllllIlllIIlIllIllllIll.getMessage();
        if (j.lIllIllIIllIllI(llllllllllllllIlllIIlIllIllllIlI.contains(lIlIIIIIllIIl[lIlIIIIIllIlI[0]]) ? 1 : 0)) {
            j llllllllllllllIlllIIlIllIlllllII;
            String[] llllllllllllllIlllIIlIllIllllIIl = llllllllllllllIlllIIlIllIllllIlI.split(lIlIIIIIllIIl[lIlIIIIIllIlI[5]]);
            String llllllllllllllIlllIIlIllIllllIII = llllllllllllllIlllIIlIllIllllIIl[lIlIIIIIllIlI[0]].substring(llllllllllllllIlllIIlIllIllllIIl[lIlIIIIIllIlI[0]].indexOf(lIlIIIIIllIlI[14]) + lIlIIIIIllIlI[5]);
            int llllllllllllllIlllIIlIllIlllIlll = Integer.parseInt(llllllllllllllIlllIIlIllIllllIII);
            List llllllllllllllIlllIIlIllIlllIllI = llllllllllllllIlllIIlIllIlllllII.o().keySet().stream().sorted(Comparator.comparingInt(TileObject::getX)).collect(Collectors.toList());
            Iterator llllllllllllllIlllIIlIllIlllIlIl = llllllllllllllIlllIIlIllIlllIllI.iterator();
            while (j.lIllIllIIllIllI(llllllllllllllIlllIIlIllIlllIlIl.hasNext() ? 1 : 0)) {
                GroundObject llllllllllllllIlllIIlIllIlllIlII = (GroundObject)llllllllllllllIlllIIlIllIlllIlIl.next();
                int llllllllllllllIlllIIlIllIlllIIll = llllllllllllllIlllIIlIllIlllllII.o().get(llllllllllllllIlllIIlIllIlllIlII);
                if (j.lIllIllIIlllIII(llllllllllllllIlllIIlIllIlllIlll - llllllllllllllIlllIIlIllIlllIIll)) {
                    0;
                    if (-1 <= 0) continue;
                    return;
                }
                if (j.lIllIllIIlllIIl(j.lIllIllIIllIlll(llllllllllllllIlllIIlIllIlllIllI.stream().filter(groundObject2 -> {
                    boolean bl;
                    if (j.lIllIllIIllIIIl(groundObject2.getWorldLocation().distanceTo2D(llllllllllllllIlllIIlIllIlllIlII.getWorldLocation()), lIlIIIIIllIlI[5])) {
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
                    if (null == null) continue;
                    return;
                }
                llllllllllllllIlllIIlIllIlllllII.ae.add(llllllllllllllIlllIIlIllIlllIlII);
                0;
                llllllllllllllIlllIIlIllIlllIlll -= llllllllllllllIlllIIlIllIlllIIll;
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
        void llllllllllllllIlllIIlIllIllIlIll;
        int[] nArray = new int[lIlIIIIIllIlI[5]];
        nArray[j.lIlIIIIIllIlI[0]] = lIlIIIIIllIlI[1];
        List list = TileObjects.getAll((int[])nArray);
        HashMap<WorldPoint, Boolean> hashMap = new HashMap<WorldPoint, Boolean>();
        Iterator llllllllllllllIlllIIlIllIllIlIlI = list.iterator();
        while (j.lIllIllIIllIllI(llllllllllllllIlllIIlIllIllIlIlI.hasNext() ? 1 : 0)) {
            boolean bl;
            TileObject llllllllllllllIlllIIlIllIllIlIIl = (TileObject)llllllllllllllIlllIIlIllIllIlIlI.next();
            WorldPoint worldPoint = llllllllllllllIlllIIlIllIllIlIIl.getWorldLocation();
            if (j.lIllIllIIlllIlI(TileObjects.getAll(tileObject2 -> {
                int n2;
                if (j.lIllIllIIllIllI(tileObject2.getWorldLocation().equals((Object)llllllllllllllIlllIIlIllIllIlIIl.getWorldLocation()) ? 1 : 0) && j.lIllIllIIllIIIl(tileObject2.getId(), lIlIIIIIllIlI[9])) {
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
            llllllllllllllIlllIIlIllIllIlIll.put(worldPoint, bl);
            0;
            0;
            if (-(0x1B ^ 0x1F) < 0) continue;
            return null;
        }
        if (j.lIllIllIIlllIll(llllllllllllllIlllIIlIllIllIlIll.containsValue(lIlIIIIIllIlI[0]) ? 1 : 0)) {
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

    private static String lIllIllIIlIllII(String llllllllllllllIlllIIlIllIlIllIIl, String llllllllllllllIlllIIlIllIlIllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIllIlIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIlIllIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIlI[8]), "DES");
            Cipher llllllllllllllIlllIIlIllIlIllIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIllIlIllIll.init(lIlIIIIIllIlI[16], llllllllllllllIlllIIlIllIlIlllII);
            return new String(llllllllllllllIlllIIlIllIlIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIllIlIllIlI) {
            llllllllllllllIlllIIlIllIlIllIlI.printStackTrace();
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

