/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.MenuAction
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GroundObjectDespawned
 *  net.runelite.api.events.GroundObjectSpawned
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.runelite.client.util.Text
 *  net.unethicalite.api.entities.TileObjects
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.hunter.tasks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MenuAction;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.Text;
import net.unethicalite.api.entities.TileObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.hunter.tasks.GameEnum13;
import gg.squire.hunter.tasks.GameEnum;
import gg.squire.hunter.tasks.GameEnum14;
import gg.squire.hunter.tasks.JHelper;
import gg.squire.hunter.tasks.KHelper;

@Singleton
public class IHelper {
    @Inject
    private  OverlayManager f;
    private final  Map<WorldPoint, TileObject> w;
    @Inject
    private  Client M;
    private static final  Logger r;
    private  int R;
    private  boolean O;
    private  WorldPoint T;
    
    private static final  List<Integer> u;
    private  k P;
    private  g Q;
    
    @Inject
    private  ClientThread N;
    private final  Map<WorldPoint, TileObject> y;
    private final  Map<WorldPoint, TileObject> x;
    private  boolean S;
    private static final  List<WorldPoint> s;
    private  h U;
    private final  Set<Integer> z;
    private final  Map<WorldPoint, TileObject> v;
    private static final  Set<Integer> t;
    private final  List<f> L;

    public void o() {
        this.q();
        this.r();
        this.O = lllIIlllIllI[0];
    }

    public Map<WorldPoint, TileObject> v() {
        return this.w;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        void var1;
        if (!i.lIIIlIllIIIlIlI(this.O ? 1 : 0) || !i.lIIIlIllIIIlIII(this.S ? 1 : 0) || i.lIIIlIllIIIllll(MenuAction.GAME_OBJECT_FIRST_OPTION, menuOptionClicked.getMenuAction())) {
            return;
        }
        String var2 = Text.removeTags((String)var1.getMenuTarget());
        int var3 = lllIIlllIllI[4];
        switch (var2.hashCode()) {
            case 2552709: {
                if (!i.lIIIlIllIIIlIlI(var2.equals(lllIIllIlllI[lllIIlllIllI[0]]) ? 1 : 0)) break;
                var3 = lllIIlllIllI[0];

                if ((0x31 ^ 0x47 ^ (0x31 ^ 0x43)) != 0) break;
                return;
            }
            case 908062840: {
                if (!i.lIIIlIllIIIlIlI(var2.equals(lllIIllIlllI[lllIIlllIllI[1]]) ? 1 : 0)) break;
                var3 = lllIIlllIllI[1];

                if (-1 != 2) break;
                return;
            }
            case 193626550: {
                if (!i.lIIIlIllIIIlIlI(var2.equals(lllIIllIlllI[lllIIlllIllI[5]]) ? 1 : 0)) break;
                var3 = lllIIlllIllI[5];
            }
        }
        switch (var3) {
            case 0: 
            case 1: 
            case 2: {
                i var4;
                var4.T = WorldPoint.fromScene((Client)var4.M, (int)var1.getParam0(), (int)var1.getParam1(), (int)var4.M.getPlane());
            }
        }
    }

    public WorldPoint I() {
        return this.T;
    }

    public IHelper() {
        this.v = new HashMap<WorldPoint, TileObject>();
        this.w = new HashMap<WorldPoint, TileObject>();
        this.x = new HashMap<WorldPoint, TileObject>();
        this.y = new HashMap<WorldPoint, TileObject>();
        this.z = new HashSet<Integer>();
        this.L = Lists.newArrayList();
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        this.p();
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        switch (j.V[gameStateChanged.getGameState().ordinal()]) {
            case 1: 
            case 2: {
                i var5;
                var5.q();

                if (2 >= 0) break;
                return;
            }
            case 3: {
                i var5;
                var5.r();
                var5.O = var5.s();

                if (null == null) break;
                return;
            }
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.p();
    }

    /*
     * WARNING - void declaration
     */
    private boolean s() {
        int[] nArray = this.M.getMapRegions();
        Iterator<Integer> var6 = u.iterator();
        while (i.lIIIlIllIIIlIlI(var6.hasNext() ? 1 : 0)) {
            void var7;
            int var8 = var6.next();
            void var9 = var7;
            int var10 = ((void)var9).length;
            int var11 = lllIIlllIllI[0];
            while (i.lIIIlIllIIIlIIl(var11, var10)) {
                void var12 = var9[var11];
                if (i.lIIIlIllIIIlIll((int)var12, var8)) {
                    return lllIIlllIllI[1];
                }
                ++var11;

                if (1 >= -1) continue;
                return ((0x21 ^ 0x11 ^ (7 ^ 0xE)) & (0xF ^ 0x68 ^ (0x33 ^ 0x6D) ^ -1)) != 0;
            }

            if (((55 + 53 - 19 + 45 ^ 119 + 107 - 116 + 86) & (17 + 102 - 27 + 37 ^ 76 + 106 - 160 + 173 ^ -1)) < 1) continue;
            return ((0x2A ^ 0x1D ^ (0xCD ^ 0xC1)) & (6 + 61 - 45 + 106 ^ 47 + 69 - -22 + 49 ^ -1)) != 0;
        }
        return lllIIlllIllI[0];
    }

    private static boolean lIIIlIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public OverlayManager C() {
        return this.f;
    }

    private static boolean lIIIlIllIIIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(TileObject tileObject, TileObject tileObject2) {
        i var13;
        void var14;
        if (i.lIIIlIllIIIlllI(tileObject)) {
            WorldPoint worldPoint = tileObject.getWorldLocation();
            this.v.remove(worldPoint);

            this.w.remove(worldPoint);

            this.x.remove(worldPoint);

            this.y.remove(worldPoint);

        }
        if (i.lIIIlIllIIlIIII(var14)) {
            return;
        }
        if (i.lIIIlIllIIIlIlI(t.contains(var14.getId()) ? 1 : 0)) {
            var13.v.put(var14.getWorldLocation(), (TileObject)var14);

            return;
        }
        if (i.lIIIlIllIIIlIlI(s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f.b(var14.getId()) ? 1 : 0)) {
            var13.w.put(var14.getWorldLocation(), (TileObject)var14);

            return;
        }
        if (i.lIIIlIllIIIlIlI(s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f.b(var14.getWorldLocation()) ? 1 : 0)) {
            var13.x.put(var14.getWorldLocation(), (TileObject)var14);

            return;
        }
        if (i.lIIIlIllIIIlIlI(s.contains(var14.getWorldLocation()) ? 1 : 0)) {
            var13.y.put(var14.getWorldLocation(), (TileObject)var14);

        }
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        this.a((TileObject)gameObjectDespawned.getGameObject(), null);
    }

    private void q() {
        r.debug(lllIIllIlllI[lllIIlllIllI[6]]);
        this.z.clear();
        this.L.clear();
        this.P = null;
        this.Q = null;
        this.R = lllIIlllIllI[0];
        this.S = lllIIlllIllI[0];
        this.T = null;
        this.U = null;
    }

    private static boolean lIIIlIllIIIIlll(Object object, Object object2) {
        return object == object2;
    }

    public k E() {
        return this.P;
    }

    public Map<WorldPoint, TileObject> u() {
        return this.v;
    }

    private void r() {
        this.v.clear();
        this.w.clear();
        this.x.clear();
        this.y.clear();
    }

    public h J() {
        return this.U;
    }

    static {
        i.lIIIlIllIIIIllI();
        i.lIIIlIllIIIIlII();
        r = LoggerFactory.getLogger(IHelper.class);
        s = ImmutableList.of((Object)new WorldPoint(lllIIlllIllI[7], lllIIlllIllI[8], lllIIlllIllI[0]), (Object)new WorldPoint(lllIIlllIllI[9], lllIIlllIllI[10], lllIIlllIllI[0]), (Object)new WorldPoint(lllIIlllIllI[11], lllIIlllIllI[12], lllIIlllIllI[0]), (Object)new WorldPoint(lllIIlllIllI[13], lllIIlllIllI[14], lllIIlllIllI[0]), (Object)new WorldPoint(lllIIlllIllI[15], lllIIlllIllI[16], lllIIlllIllI[0]), (Object)new WorldPoint(lllIIlllIllI[17], lllIIlllIllI[18], lllIIlllIllI[0]), (Object)new WorldPoint(lllIIlllIllI[19], lllIIlllIllI[20], lllIIlllIllI[0]), (Object)new WorldPoint(lllIIlllIllI[21], lllIIlllIllI[22], lllIIlllIllI[0]), (Object)new WorldPoint(lllIIlllIllI[23], lllIIlllIllI[24], lllIIlllIllI[0]));
        t = ImmutableSet.of((Object)lllIIlllIllI[25], (Object)lllIIlllIllI[26], (Object)lllIIlllIllI[27], (Object)lllIIlllIllI[28], (Object)lllIIlllIllI[29]);
        u = ImmutableList.of((Object)lllIIlllIllI[30], (Object)lllIIlllIllI[31], (Object)lllIIlllIllI[32], (Object)lllIIlllIllI[33]);
    }

    public boolean H() {
        return this.S;
    }

    public Map<WorldPoint, TileObject> w() {
        return this.x;
    }

    public ClientThread B() {
        return this.N;
    }

    private static boolean lIIIlIllIIIllII(int n2) {
        return n2 > 0;
    }

    private static void lIIIlIllIIIIlII() {
        lllIIllIlllI = new String[lllIIlllIllI[34]];
        i.lllIIllIlllI[i.lllIIlllIllI[0]] = "Rock";
        i.lllIIllIlllI[i.lllIIlllIllI[1]] = "Mushroom";
        i.lllIIllIlllI[i.lllIIlllIllI[5]] = "Driftwood";
        i.lllIIllIlllI[i.lllIIlllIllI[6]] = "Reset trail data";
    }

    private static boolean lIIIlIllIIIllll(Object object, Object object2) {
        return object != object2;
    }

    public g F() {
        return this.Q;
    }

    private static boolean lIIIlIllIIIllIl(int n2) {
        return n2 <= 0;
    }

    List<WorldPoint> t() {
        return s;
    }

    @Subscribe
    public void a(GroundObjectDespawned groundObjectDespawned) {
        this.a((TileObject)groundObjectDespawned.getGroundObject(), null);
    }

        return String.valueOf(var15);
    }

    public List<f> z() {
        return this.L;
    }

    @Subscribe
    public void a(GroundObjectSpawned groundObjectSpawned) {
        this.a(null, (TileObject)groundObjectSpawned.getGroundObject());
    }

    public Set<Integer> y() {
        return this.z;
    }

    private static boolean lIIIlIllIIIlllI(Object object) {
        return object != null;
    }

    public Client A() {
        return this.M;
    }

    private static boolean lIIIlIllIIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIllIIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    public Map<WorldPoint, TileObject> x() {
        return this.y;
    }

    public boolean D() {
        return this.O;
    }

    public int G() {
        return this.R;
    }

    private static boolean lIIIlIllIIlIIII(Object object) {
        return object == null;
    }

    public void n() {
        if (i.lIIIlIllIIIIlll(this.M.getGameState(), GameState.LOGGED_IN)) {
            this.N.invokeLater(() -> {
                this.O = this.s();
                this.p();
            });
        }
        TileObjects.getAll().forEach(tileObject -> this.a(null, (TileObject)tileObject));
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        this.a(null, (TileObject)gameObjectSpawned.getGameObject());
    }

    private void p() {
        int n2;
        int n3;
        i var16;
        if (i.lIIIlIllIIIlIII(this.D() ? 1 : 0)) {
            return;
        }
        int var17 = lllIIlllIllI[0];
        int n4 = var16.S;
        f[] var18 = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f.values();
        int var19 = var18.length;
        int var20 = lllIIlllIllI[0];
        while (i.lIIIlIllIIIlIIl(var20, var19)) {
            f var21 = var18[var20];
            Iterator<k> var22 = var21.m().iterator();
            while (i.lIIIlIllIIIlIlI(var22.hasNext() ? 1 : 0)) {
                k var23 = var22.next();
                int var24 = var16.M.getVarbitValue(var23.O());
                if (i.lIIIlIllIIIlIll(var24, var23.M())) {
                    var16.Q = var21.k();
                    var16.P = var23;
                    if (i.lIIIlIllIIIlIII(var16.L.contains((Object)var21) ? 1 : 0)) {
                        var16.L.add(var21);

                        if (3 == 0) {
                            return;
                        }
                    }
                } else if (i.lIIIlIllIIIllII(var24)) {
                    var16.z.addAll(var23.L());

                    var17 = lllIIlllIllI[1];
                }

                if (-1 < 1) continue;
                return;
            }
            ++var20;

            if (1 == 1) continue;
            return;
        }
        var16.R = var16.M.getVarbitValue(lllIIlllIllI[2]);
        if (!i.lIIIlIllIIIllIl(var16.M.getVarbitValue(lllIIlllIllI[3])) || i.lIIIlIllIIIlllI((Object)var16.Q)) {
            n3 = lllIIlllIllI[1];

            if (-1 >= ((0x87 ^ 0xA3 ^ (0x10 ^ 0x2E)) & (0xD5 ^ 0xA7 ^ (0x24 ^ 0x4C) ^ -1))) {
                return;
            }
        } else {
            var16.S = lllIIlllIllI[0];
            n3 = var16.S ? 1 : 0;
        }
        if (i.lIIIlIllIIIlIII(var17) && i.lIIIlIllIIIlIlI(var16.S ? 1 : 0)) {
            n2 = lllIIlllIllI[1];

            if (3 <= 1) {
                return;
            }
        } else {
            n2 = var18 = lllIIlllIllI[0];
        }
        if (i.lIIIlIllIIIlIII(n4) && i.lIIIlIllIIIlIlI(var16.S ? 1 : 0)) {
            var16.U = h.c(var16.T);
        }
        if (i.lIIIlIllIIIlIlI(var18)) {
            var16.q();
        }
    }
}

