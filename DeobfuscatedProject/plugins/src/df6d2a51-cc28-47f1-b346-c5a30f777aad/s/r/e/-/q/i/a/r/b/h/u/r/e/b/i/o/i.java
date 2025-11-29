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
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

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
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.g;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.h;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.j;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.k;

@Singleton
public class i {
    @Inject
    private /* synthetic */ OverlayManager f;
    private final /* synthetic */ Map<WorldPoint, TileObject> w;
    @Inject
    private /* synthetic */ Client M;
    private static final /* synthetic */ Logger r;
    private /* synthetic */ int R;
    private /* synthetic */ boolean O;
    private /* synthetic */ WorldPoint T;
    private static /* synthetic */ int[] lllIIlllIllI;
    private static final /* synthetic */ List<Integer> u;
    private /* synthetic */ k P;
    private /* synthetic */ g Q;
    private static /* synthetic */ String[] lllIIllIlllI;
    @Inject
    private /* synthetic */ ClientThread N;
    private final /* synthetic */ Map<WorldPoint, TileObject> y;
    private final /* synthetic */ Map<WorldPoint, TileObject> x;
    private /* synthetic */ boolean S;
    private static final /* synthetic */ List<WorldPoint> s;
    private /* synthetic */ h U;
    private final /* synthetic */ Set<Integer> z;
    private final /* synthetic */ Map<WorldPoint, TileObject> v;
    private static final /* synthetic */ Set<Integer> t;
    private final /* synthetic */ List<f> L;

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
        void lllllllllllllllIIllIIllIlIlIllIl;
        if (!i.lIIIlIllIIIlIlI(this.O ? 1 : 0) || !i.lIIIlIllIIIlIII(this.S ? 1 : 0) || i.lIIIlIllIIIllll(MenuAction.GAME_OBJECT_FIRST_OPTION, menuOptionClicked.getMenuAction())) {
            return;
        }
        String lllllllllllllllIIllIIllIlIlIllII = Text.removeTags((String)lllllllllllllllIIllIIllIlIlIllIl.getMenuTarget());
        int lllllllllllllllIIllIIllIlIlIlIll = lllIIlllIllI[4];
        switch (lllllllllllllllIIllIIllIlIlIllII.hashCode()) {
            case 2552709: {
                if (!i.lIIIlIllIIIlIlI(lllllllllllllllIIllIIllIlIlIllII.equals(lllIIllIlllI[lllIIlllIllI[0]]) ? 1 : 0)) break;
                lllllllllllllllIIllIIllIlIlIlIll = lllIIlllIllI[0];
                "".length();
                if ((0x31 ^ 0x47 ^ (0x31 ^ 0x43)) != 0) break;
                return;
            }
            case 908062840: {
                if (!i.lIIIlIllIIIlIlI(lllllllllllllllIIllIIllIlIlIllII.equals(lllIIllIlllI[lllIIlllIllI[1]]) ? 1 : 0)) break;
                lllllllllllllllIIllIIllIlIlIlIll = lllIIlllIllI[1];
                "".length();
                if (-" ".length() != "  ".length()) break;
                return;
            }
            case 193626550: {
                if (!i.lIIIlIllIIIlIlI(lllllllllllllllIIllIIllIlIlIllII.equals(lllIIllIlllI[lllIIlllIllI[5]]) ? 1 : 0)) break;
                lllllllllllllllIIllIIllIlIlIlIll = lllIIlllIllI[5];
            }
        }
        switch (lllllllllllllllIIllIIllIlIlIlIll) {
            case 0: 
            case 1: 
            case 2: {
                i lllllllllllllllIIllIIllIlIlIlllI;
                lllllllllllllllIIllIIllIlIlIlllI.T = WorldPoint.fromScene((Client)lllllllllllllllIIllIIllIlIlIlllI.M, (int)lllllllllllllllIIllIIllIlIlIllIl.getParam0(), (int)lllllllllllllllIIllIIllIlIlIllIl.getParam1(), (int)lllllllllllllllIIllIIllIlIlIlllI.M.getPlane());
            }
        }
    }

    public WorldPoint I() {
        return this.T;
    }

    public i() {
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
                i lllllllllllllllIIllIIllIlIlIlIII;
                lllllllllllllllIIllIIllIlIlIlIII.q();
                "".length();
                if ("  ".length() >= 0) break;
                return;
            }
            case 3: {
                i lllllllllllllllIIllIIllIlIlIlIII;
                lllllllllllllllIIllIIllIlIlIlIII.r();
                lllllllllllllllIIllIIllIlIlIlIII.O = lllllllllllllllIIllIIllIlIlIlIII.s();
                "".length();
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
        Iterator<Integer> lllllllllllllllIIllIIllIlIIlIlII = u.iterator();
        while (i.lIIIlIllIIIlIlI(lllllllllllllllIIllIIllIlIIlIlII.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIllIIllIlIIlIlIl;
            int lllllllllllllllIIllIIllIlIIlIIll = lllllllllllllllIIllIIllIlIIlIlII.next();
            void lllllllllllllllIIllIIllIlIIlIIlI = lllllllllllllllIIllIIllIlIIlIlIl;
            int lllllllllllllllIIllIIllIlIIlIIIl = ((void)lllllllllllllllIIllIIllIlIIlIIlI).length;
            int lllllllllllllllIIllIIllIlIIlIIII = lllIIlllIllI[0];
            while (i.lIIIlIllIIIlIIl(lllllllllllllllIIllIIllIlIIlIIII, lllllllllllllllIIllIIllIlIIlIIIl)) {
                void lllllllllllllllIIllIIllIlIIIllll = lllllllllllllllIIllIIllIlIIlIIlI[lllllllllllllllIIllIIllIlIIlIIII];
                if (i.lIIIlIllIIIlIll((int)lllllllllllllllIIllIIllIlIIIllll, lllllllllllllllIIllIIllIlIIlIIll)) {
                    return lllIIlllIllI[1];
                }
                ++lllllllllllllllIIllIIllIlIIlIIII;
                "".length();
                if (" ".length() >= -" ".length()) continue;
                return ((0x21 ^ 0x11 ^ (7 ^ 0xE)) & (0xF ^ 0x68 ^ (0x33 ^ 0x6D) ^ -" ".length())) != 0;
            }
            "".length();
            if (((55 + 53 - 19 + 45 ^ 119 + 107 - 116 + 86) & (17 + 102 - 27 + 37 ^ 76 + 106 - 160 + 173 ^ -" ".length())) < " ".length()) continue;
            return ((0x2A ^ 0x1D ^ (0xCD ^ 0xC1)) & (6 + 61 - 45 + 106 ^ 47 + 69 - -22 + 49 ^ -" ".length())) != 0;
        }
        return lllIIlllIllI[0];
    }

    private static boolean lIIIlIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIllIIIIllI() {
        lllIIlllIllI = new int[35];
        i.lllIIlllIllI[0] = (0x29 ^ 0x16) & ~(0x4F ^ 0x70);
        i.lllIIlllIllI[1] = " ".length();
        i.lllIIlllIllI[2] = -(0xFFFFE40D & 0x5BFB) & (0xFFFFFEDE & 0x57AF);
        i.lllIIlllIllI[3] = -(0xFFFFEFF9 & 0x117F) & (0xFFFF97FF & Short.MAX_VALUE);
        i.lllIIlllIllI[4] = -" ".length();
        i.lllIIlllIllI[5] = "  ".length();
        i.lllIIlllIllI[6] = "   ".length();
        i.lllIIlllIllI[7] = 0xFFFFAF6D & 0x5EFF;
        i.lllIIlllIllI[8] = 0xFFFF8EF7 & 0x7FDE;
        i.lllIIlllIllI[9] = -(0xFFFFE7DF & 0x39AA) & (0xFFFFEFFF & 0x3FFF);
        i.lllIIlllIllI[10] = -(0xFFFFF59B & 0x3A67) & (0xFFFFFEE7 & 0x3FFA);
        i.lllIIlllIllI[11] = 0xFFFFBE77 & 0x4FFF;
        i.lllIIlllIllI[12] = -(0xFFFFF47D & 0x7B83) & (0xFFFFFFFF & 0x7EF2);
        i.lllIIlllIllI[13] = -(0xFFFFF8E2 & 0x379F) & (0xFFFFBEFF & Short.MAX_VALUE);
        i.lllIIlllIllI[14] = 0xFFFFCF7B & 0x3FAD;
        i.lllIIlllIllI[15] = -(0xFFFFA16F & 0x5F93) & (0xFFFFEFFF & 0x1F76);
        i.lllIIlllIllI[16] = 0xFFFFCFF5 & 0x3F2F;
        i.lllIIlllIllI[17] = -(0xFFFFB57D & 0x7BBB) & (0xFFFFBFBF & 0x7FFB);
        i.lllIIlllIllI[18] = 0xFFFFFF83 & 0xF7C;
        i.lllIIlllIllI[19] = 0xFFFFDFFF & 0x2EA7;
        i.lllIIlllIllI[20] = -(0xFFFFE6BF & 0x7967) & (0xFFFFEFBF & 0x7F6F);
        i.lllIIlllIllI[21] = -(101 + 88 - 131 + 97) & (0xFFFFEEFF & 0x1FFF);
        i.lllIIlllIllI[22] = -(0xFFFFF8E3 & 0x67DF) & (0xFFFFEFFF & 0x7FDF);
        i.lllIIlllIllI[23] = 0xFFFF9FF1 & 0x6E6F;
        i.lllIIlllIllI[24] = -(0xFFFFBCED & 0x7373) & (0xFFFFFFF7 & 0x3F7F);
        i.lllIIlllIllI[25] = -(0xFFFFDE9F & 0x29E9) & (0xFFFFFFBF & Short.MAX_VALUE);
        i.lllIIlllIllI[26] = 0xFFFFFFFD & 0x773A;
        i.lllIIlllIllI[27] = -(0x7B ^ 0x7E) & (0xFFFFF77F & 0x7FBD);
        i.lllIIlllIllI[28] = -(0xFFFFDA8F & 0x2D71) & (0xFFFFFFFB & 0x7F3E);
        i.lllIIlllIllI[29] = -(102 + 2 - -75 + 14) & (0xFFFFF7FB & Short.MAX_VALUE);
        i.lllIIlllIllI[30] = -(0xFFFF862B & 0x7FD5) & (0xFFFFBF3F & 0x7FFC);
        i.lllIIlllIllI[31] = -(0xFFFFEE47 & 0x17FD) & (0xFFFFFFFF & 0x3F7F);
        i.lllIIlllIllI[32] = 0xFFFFFA3F & 0x3FFC;
        i.lllIIlllIllI[33] = -(0xFFFF9FCD & 0x61B7) & (0xFFFFBBFF & 0x7FBF);
        i.lllIIlllIllI[34] = 0x39 ^ 0x3D;
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
        i lllllllllllllllIIllIIllIlIlIIIlI;
        void lllllllllllllllIIllIIllIlIlIIIII;
        if (i.lIIIlIllIIIlllI(tileObject)) {
            WorldPoint worldPoint = tileObject.getWorldLocation();
            this.v.remove(worldPoint);
            "".length();
            this.w.remove(worldPoint);
            "".length();
            this.x.remove(worldPoint);
            "".length();
            this.y.remove(worldPoint);
            "".length();
        }
        if (i.lIIIlIllIIlIIII(lllllllllllllllIIllIIllIlIlIIIII)) {
            return;
        }
        if (i.lIIIlIllIIIlIlI(t.contains(lllllllllllllllIIllIIllIlIlIIIII.getId()) ? 1 : 0)) {
            lllllllllllllllIIllIIllIlIlIIIlI.v.put(lllllllllllllllIIllIIllIlIlIIIII.getWorldLocation(), (TileObject)lllllllllllllllIIllIIllIlIlIIIII);
            "".length();
            return;
        }
        if (i.lIIIlIllIIIlIlI(s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f.b(lllllllllllllllIIllIIllIlIlIIIII.getId()) ? 1 : 0)) {
            lllllllllllllllIIllIIllIlIlIIIlI.w.put(lllllllllllllllIIllIIllIlIlIIIII.getWorldLocation(), (TileObject)lllllllllllllllIIllIIllIlIlIIIII);
            "".length();
            return;
        }
        if (i.lIIIlIllIIIlIlI(s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f.b(lllllllllllllllIIllIIllIlIlIIIII.getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIIllIIllIlIlIIIlI.x.put(lllllllllllllllIIllIIllIlIlIIIII.getWorldLocation(), (TileObject)lllllllllllllllIIllIIllIlIlIIIII);
            "".length();
            return;
        }
        if (i.lIIIlIllIIIlIlI(s.contains(lllllllllllllllIIllIIllIlIlIIIII.getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIIllIIllIlIlIIIlI.y.put(lllllllllllllllIIllIIllIlIlIIIII.getWorldLocation(), (TileObject)lllllllllllllllIIllIIllIlIlIIIII);
            "".length();
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
        r = LoggerFactory.getLogger(i.class);
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
        i.lllIIllIlllI[i.lllIIlllIllI[0]] = i.lIIIlIlIllIIlll("//ksL+VABDw=", "YuUVh");
        i.lllIIllIlllI[i.lllIIlllIllI[1]] = i.lIIIlIlIllIIlll("PWJcY7I90PrgS+pGzWefjQ==", "GSKJv");
        i.lllIIllIlllI[i.lllIIlllIllI[5]] = i.lIIIlIllIIIIIIl("IiM4LzkRPj4t", "fQQIM");
        i.lllIIllIlllI[i.lllIIlllIllI[6]] = i.lIIIlIlIllIIlll("wAG11cWvM31qZMNxgk5fPwKwx7f4caxV", "ojCxR");
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

    private static String lIIIlIllIIIIIIl(String lllllllllllllllIIllIIllIIlllIlll, String lllllllllllllllIIllIIllIIlllIllI) {
        lllllllllllllllIIllIIllIIlllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllIIlllIlIl = new StringBuilder();
        char[] lllllllllllllllIIllIIllIIlllIlII = lllllllllllllllIIllIIllIIlllIllI.toCharArray();
        int lllllllllllllllIIllIIllIIlllIIll = lllIIlllIllI[0];
        char[] lllllllllllllllIIllIIllIIllIllIl = lllllllllllllllIIllIIllIIlllIlll.toCharArray();
        int lllllllllllllllIIllIIllIIllIllII = lllllllllllllllIIllIIllIIllIllIl.length;
        int lllllllllllllllIIllIIllIIllIlIll = lllIIlllIllI[0];
        while (i.lIIIlIllIIIlIIl(lllllllllllllllIIllIIllIIllIlIll, lllllllllllllllIIllIIllIIllIllII)) {
            char lllllllllllllllIIllIIllIIllllIII = lllllllllllllllIIllIIllIIllIllIl[lllllllllllllllIIllIIllIIllIlIll];
            lllllllllllllllIIllIIllIIlllIlIl.append((char)(lllllllllllllllIIllIIllIIllllIII ^ lllllllllllllllIIllIIllIIlllIlII[lllllllllllllllIIllIIllIIlllIIll % lllllllllllllllIIllIIllIIlllIlII.length]));
            "".length();
            ++lllllllllllllllIIllIIllIIlllIIll;
            ++lllllllllllllllIIllIIllIIllIlIll;
            "".length();
            if (-" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIllIIlllIlIl);
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

    private static String lIIIlIlIllIIlll(String lllllllllllllllIIllIIllIlIIIIlIl, String lllllllllllllllIIllIIllIlIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIlIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIlIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllIlIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllIlIIIlIIl.init(lllIIlllIllI[5], lllllllllllllllIIllIIllIlIIIlIlI);
            return new String(lllllllllllllllIIllIIllIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIllIlIIIlIII) {
            lllllllllllllllIIllIIllIlIIIlIII.printStackTrace();
            return null;
        }
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
        i lllllllllllllllIIllIIllIlIllllII;
        if (i.lIIIlIllIIIlIII(this.D() ? 1 : 0)) {
            return;
        }
        int lllllllllllllllIIllIIllIlIlllIll = lllIIlllIllI[0];
        int n4 = lllllllllllllllIIllIIllIlIllllII.S;
        f[] lllllllllllllllIIllIIllIlIlllIIl = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f.values();
        int lllllllllllllllIIllIIllIlIlllIII = lllllllllllllllIIllIIllIlIlllIIl.length;
        int lllllllllllllllIIllIIllIlIllIlll = lllIIlllIllI[0];
        while (i.lIIIlIllIIIlIIl(lllllllllllllllIIllIIllIlIllIlll, lllllllllllllllIIllIIllIlIlllIII)) {
            f lllllllllllllllIIllIIllIlIllIllI = lllllllllllllllIIllIIllIlIlllIIl[lllllllllllllllIIllIIllIlIllIlll];
            Iterator<k> lllllllllllllllIIllIIllIlIllIlIl = lllllllllllllllIIllIIllIlIllIllI.m().iterator();
            while (i.lIIIlIllIIIlIlI(lllllllllllllllIIllIIllIlIllIlIl.hasNext() ? 1 : 0)) {
                k lllllllllllllllIIllIIllIlIllIlII = lllllllllllllllIIllIIllIlIllIlIl.next();
                int lllllllllllllllIIllIIllIlIllIIll = lllllllllllllllIIllIIllIlIllllII.M.getVarbitValue(lllllllllllllllIIllIIllIlIllIlII.O());
                if (i.lIIIlIllIIIlIll(lllllllllllllllIIllIIllIlIllIIll, lllllllllllllllIIllIIllIlIllIlII.M())) {
                    lllllllllllllllIIllIIllIlIllllII.Q = lllllllllllllllIIllIIllIlIllIllI.k();
                    lllllllllllllllIIllIIllIlIllllII.P = lllllllllllllllIIllIIllIlIllIlII;
                    if (i.lIIIlIllIIIlIII(lllllllllllllllIIllIIllIlIllllII.L.contains((Object)lllllllllllllllIIllIIllIlIllIllI) ? 1 : 0)) {
                        lllllllllllllllIIllIIllIlIllllII.L.add(lllllllllllllllIIllIIllIlIllIllI);
                        "".length();
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                    }
                } else if (i.lIIIlIllIIIllII(lllllllllllllllIIllIIllIlIllIIll)) {
                    lllllllllllllllIIllIIllIlIllllII.z.addAll(lllllllllllllllIIllIIllIlIllIlII.L());
                    "".length();
                    lllllllllllllllIIllIIllIlIlllIll = lllIIlllIllI[1];
                }
                "".length();
                if (-" ".length() < " ".length()) continue;
                return;
            }
            ++lllllllllllllllIIllIIllIlIllIlll;
            "".length();
            if (" ".length() == " ".length()) continue;
            return;
        }
        lllllllllllllllIIllIIllIlIllllII.R = lllllllllllllllIIllIIllIlIllllII.M.getVarbitValue(lllIIlllIllI[2]);
        if (!i.lIIIlIllIIIllIl(lllllllllllllllIIllIIllIlIllllII.M.getVarbitValue(lllIIlllIllI[3])) || i.lIIIlIllIIIlllI((Object)lllllllllllllllIIllIIllIlIllllII.Q)) {
            n3 = lllIIlllIllI[1];
            "".length();
            if (-" ".length() >= ((0x87 ^ 0xA3 ^ (0x10 ^ 0x2E)) & (0xD5 ^ 0xA7 ^ (0x24 ^ 0x4C) ^ -" ".length()))) {
                return;
            }
        } else {
            lllllllllllllllIIllIIllIlIllllII.S = lllIIlllIllI[0];
            n3 = lllllllllllllllIIllIIllIlIllllII.S ? 1 : 0;
        }
        if (i.lIIIlIllIIIlIII(lllllllllllllllIIllIIllIlIlllIll) && i.lIIIlIllIIIlIlI(lllllllllllllllIIllIIllIlIllllII.S ? 1 : 0)) {
            n2 = lllIIlllIllI[1];
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
        } else {
            n2 = lllllllllllllllIIllIIllIlIlllIIl = lllIIlllIllI[0];
        }
        if (i.lIIIlIllIIIlIII(n4) && i.lIIIlIllIIIlIlI(lllllllllllllllIIllIIllIlIllllII.S ? 1 : 0)) {
            lllllllllllllllIIllIIllIlIllllII.U = h.c(lllllllllllllllIIllIIllIlIllllII.T);
        }
        if (i.lIIIlIllIIIlIlI(lllllllllllllllIIllIIllIlIlllIIl)) {
            lllllllllllllllIIllIIllIlIllllII.q();
        }
    }
}

