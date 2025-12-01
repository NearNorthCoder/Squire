package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
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
@Singleton
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.i  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/i.class */
public class i {
    @Inject
    private /* synthetic */ OverlayManager f;
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
    private /* synthetic */ boolean S;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ List<WorldPoint> f0s;
    private /* synthetic */ h U;
    private static final /* synthetic */ Set<Integer> t;
    private final /* synthetic */ Map<WorldPoint, TileObject> v = new HashMap();
    private final /* synthetic */ Map<WorldPoint, TileObject> w = new HashMap();
    private final /* synthetic */ Map<WorldPoint, TileObject> x = new HashMap();
    private final /* synthetic */ Map<WorldPoint, TileObject> y = new HashMap();
    private final /* synthetic */ Set<Integer> z = new HashSet();
    private final /* synthetic */ List<f> L = Lists.newArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public void o() {
        q();
        r();
        this.O = lllIIlllIllI[0];
    }

    public Map<WorldPoint, TileObject> v() {
        return this.w;
    }

    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        if (lIIIlIllIIIlIlI(this.O ? 1 : 0) && lIIIlIllIIIlIII(this.S ? 1 : 0) && !lIIIlIllIIIllll(MenuAction.GAME_OBJECT_FIRST_OPTION, menuOptionClicked.getMenuAction())) {
            String removeTags = Text.removeTags(menuOptionClicked.getMenuTarget());
            int i = lllIIlllIllI[4];
            switch (removeTags.hashCode()) {
                case 2552709:
                    if (lIIIlIllIIIlIlI(removeTags.equals(lllIIllIlllI[lllIIlllIllI[0]]) ? 1 : 0)) {
                        i = lllIIlllIllI[0];
                        "".length();
                        if (!((true ^ true) ^ (true ^ true))) {
                            return;
                        }
                    }
                    break;
                case 193626550:
                    if (lIIIlIllIIIlIlI(removeTags.equals(lllIIllIlllI[lllIIlllIllI[5]]) ? 1 : 0)) {
                        i = lllIIlllIllI[5];
                        break;
                    }
                    break;
                case 908062840:
                    if (lIIIlIllIIIlIlI(removeTags.equals(lllIIllIlllI[lllIIlllIllI[1]]) ? 1 : 0)) {
                        i = lllIIlllIllI[1];
                        "".length();
                        if ((-" ".length()) == "  ".length()) {
                            return;
                        }
                    }
                    break;
            }
            switch (i) {
                case 0:
                case 1:
                case 2:
                    this.T = WorldPoint.fromScene(this.M, menuOptionClicked.getParam0(), menuOptionClicked.getParam1(), this.M.getPlane());
                    return;
                default:
                    return;
            }
        }
    }

    public WorldPoint I() {
        return this.T;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        p();
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        switch (j.V[gameStateChanged.getGameState().ordinal()]) {
            case 1:
            case 2:
                q();
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                return;
            case 3:
                r();
                this.O = s();
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean s() {
        int[] mapRegions = this.M.getMapRegions();
        for (Integer num : u) {
            int intValue = num.intValue();
            int length = mapRegions.length;
            int i = lllIIlllIllI[0];
            while (lIIIlIllIIIlIIl(i, length)) {
                if (lIIIlIllIIIlIll(mapRegions[i], intValue)) {
                    return lllIIlllIllI[1];
                }
                i++;
                "".length();
                if (" ".length() < (-" ".length())) {
                    return ((33 ^ 17) ^ (7 ^ 14)) & (((15 ^ 104) ^ (51 ^ 109)) ^ (-" ".length()));
                }
            }
            "".length();
            if ((((((55 + 53) - 19) + 45) ^ (((119 + 107) - 116) + 86)) & (((((17 + 102) - 27) + 37) ^ (((76 + 106) - 160) + 173)) ^ (-" ".length()))) >= " ".length()) {
                return ((42 ^ 29) ^ (205 ^ 193)) & (((((6 + 61) - 45) + 106) ^ (((47 + 69) - (-22)) + 49)) ^ (-" ".length()));
            }
        }
        return lllIIlllIllI[0];
    }

    private static boolean lIIIlIllIIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIllIIIIllI() {
        lllIIlllIllI = new int[35];
        lllIIlllIllI[0] = (41 ^ 22) & ((79 ^ 112) ^ (-1));
        lllIIlllIllI[1] = " ".length();
        lllIIlllIllI[2] = (-((-7155) & 23547)) & (-290) & 22447;
        lllIIlllIllI[3] = (-((-4103) & 4479)) & (-26625) & 32767;
        lllIIlllIllI[4] = -" ".length();
        lllIIlllIllI[5] = "  ".length();
        lllIIlllIllI[6] = "   ".length();
        lllIIlllIllI[7] = (-20627) & 24319;
        lllIIlllIllI[8] = (-28937) & 32734;
        lllIIlllIllI[9] = (-((-6177) & 14762)) & (-4097) & 16383;
        lllIIlllIllI[10] = (-((-2661) & 14951)) & (-281) & 16378;
        lllIIlllIllI[11] = (-16777) & 20479;
        lllIIlllIllI[12] = (-((-2947) & 31619)) & (-1) & 32498;
        lllIIlllIllI[13] = (-((-1822) & 14239)) & (-16641) & 32767;
        lllIIlllIllI[14] = (-12421) & 16301;
        lllIIlllIllI[15] = (-((-24209) & 24467)) & (-4097) & 8054;
        lllIIlllIllI[16] = (-12299) & 16175;
        lllIIlllIllI[17] = (-((-19075) & 31675)) & (-16449) & 32763;
        lllIIlllIllI[18] = (-125) & 3964;
        lllIIlllIllI[19] = (-8193) & 11943;
        lllIIlllIllI[20] = (-((-6465) & 31079)) & (-4161) & 32623;
        lllIIlllIllI[21] = (-(((101 + 88) - 131) + 97)) & (-4353) & 8191;
        lllIIlllIllI[22] = (-((-1821) & 26591)) & (-4097) & 32735;
        lllIIlllIllI[23] = (-24591) & 28271;
        lllIIlllIllI[24] = (-((-17171) & 29555)) & (-9) & 16255;
        lllIIlllIllI[25] = (-((-8545) & 10729)) & (-65) & 32767;
        lllIIlllIllI[26] = (-3) & 30522;
        lllIIlllIllI[27] = (-(123 ^ 126)) & (-2177) & 32701;
        lllIIlllIllI[28] = (-((-9585) & 11633)) & (-5) & 32574;
        lllIIlllIllI[29] = (-(((102 + 2) - (-75)) + 14)) & (-2053) & 32767;
        lllIIlllIllI[30] = (-((-31189) & 32725)) & (-16577) & 32764;
        lllIIlllIllI[31] = (-((-4537) & 6141)) & (-1) & 16255;
        lllIIlllIllI[32] = (-1473) & 16380;
        lllIIlllIllI[33] = (-((-24627) & 25015)) & (-17409) & 32703;
        lllIIlllIllI[34] = 57 ^ 61;
    }

    public OverlayManager C() {
        return this.f;
    }

    private static boolean lIIIlIllIIIlIlI(int i) {
        return i != 0;
    }

    private void a(TileObject tileObject, TileObject tileObject2) {
        if (lIIIlIllIIIlllI(tileObject)) {
            WorldPoint worldLocation = tileObject.getWorldLocation();
            this.v.remove(worldLocation);
            "".length();
            this.w.remove(worldLocation);
            "".length();
            this.x.remove(worldLocation);
            "".length();
            this.y.remove(worldLocation);
            "".length();
        }
        if (lIIIlIllIIlIIII(tileObject2)) {
            return;
        }
        if (lIIIlIllIIIlIlI(t.contains(Integer.valueOf(tileObject2.getId())) ? 1 : 0)) {
            this.v.put(tileObject2.getWorldLocation(), tileObject2);
            "".length();
        } else if (lIIIlIllIIIlIlI(f.b(tileObject2.getId()) ? 1 : 0)) {
            this.w.put(tileObject2.getWorldLocation(), tileObject2);
            "".length();
        } else if (lIIIlIllIIIlIlI(f.b(tileObject2.getWorldLocation()) ? 1 : 0)) {
            this.x.put(tileObject2.getWorldLocation(), tileObject2);
            "".length();
        } else if (lIIIlIllIIIlIlI(f0s.contains(tileObject2.getWorldLocation()) ? 1 : 0)) {
            this.y.put(tileObject2.getWorldLocation(), tileObject2);
            "".length();
        }
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        a(gameObjectDespawned.getGameObject(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
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

    private static boolean lIIIlIllIIIIlll(Object obj, Object obj2) {
        return obj == obj2;
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
        lIIIlIllIIIIllI();
        lIIIlIllIIIIlII();
        r = LoggerFactory.getLogger(i.class);
        f0s = ImmutableList.of(new WorldPoint(lllIIlllIllI[7], lllIIlllIllI[8], lllIIlllIllI[0]), new WorldPoint(lllIIlllIllI[9], lllIIlllIllI[10], lllIIlllIllI[0]), new WorldPoint(lllIIlllIllI[11], lllIIlllIllI[12], lllIIlllIllI[0]), new WorldPoint(lllIIlllIllI[13], lllIIlllIllI[14], lllIIlllIllI[0]), new WorldPoint(lllIIlllIllI[15], lllIIlllIllI[16], lllIIlllIllI[0]), new WorldPoint(lllIIlllIllI[17], lllIIlllIllI[18], lllIIlllIllI[0]), new WorldPoint(lllIIlllIllI[19], lllIIlllIllI[20], lllIIlllIllI[0]), new WorldPoint(lllIIlllIllI[21], lllIIlllIllI[22], lllIIlllIllI[0]), new WorldPoint(lllIIlllIllI[23], lllIIlllIllI[24], lllIIlllIllI[0]));
        t = ImmutableSet.of(Integer.valueOf(lllIIlllIllI[25]), Integer.valueOf(lllIIlllIllI[26]), Integer.valueOf(lllIIlllIllI[27]), Integer.valueOf(lllIIlllIllI[28]), Integer.valueOf(lllIIlllIllI[29]));
        u = ImmutableList.of(Integer.valueOf(lllIIlllIllI[30]), Integer.valueOf(lllIIlllIllI[31]), Integer.valueOf(lllIIlllIllI[32]), Integer.valueOf(lllIIlllIllI[33]));
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

    private static boolean lIIIlIllIIIllII(int i) {
        return i > 0;
    }

    private static void lIIIlIllIIIIlII() {
        lllIIllIlllI = new String[lllIIlllIllI[34]];
        lllIIllIlllI[lllIIlllIllI[0]] = lIIIlIlIllIIlll("//ksL+VABDw=", "YuUVh");
        lllIIllIlllI[lllIIlllIllI[1]] = lIIIlIlIllIIlll("PWJcY7I90PrgS+pGzWefjQ==", "GSKJv");
        lllIIllIlllI[lllIIlllIllI[5]] = lIIIlIllIIIIIIl("IiM4LzkRPj4t", "fQQIM");
        lllIIllIlllI[lllIIlllIllI[6]] = lIIIlIlIllIIlll("wAG11cWvM31qZMNxgk5fPwKwx7f4caxV", "ojCxR");
    }

    private static boolean lIIIlIllIIIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public g F() {
        return this.Q;
    }

    private static boolean lIIIlIllIIIllIl(int i) {
        return i <= 0;
    }

    List<WorldPoint> t() {
        return f0s;
    }

    @Subscribe
    public void a(GroundObjectDespawned groundObjectDespawned) {
        a(groundObjectDespawned.getGroundObject(), null);
    }

    private static String lIIIlIllIIIIIIl(String lllllllllllllllIIllIIllIIlllIIlI, String lllllllllllllllIIllIIllIIlllIllI) {
        String lllllllllllllllIIllIIllIIlllIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIIllIIlllIlII = lllllllllllllllIIllIIllIIlllIllI.toCharArray();
        int lllllllllllllllIIllIIllIIlllIIll = lllIIlllIllI[0];
        char[] charArray = lllllllllllllllIIllIIllIIlllIIlI2.toCharArray();
        int length = charArray.length;
        int i = lllIIlllIllI[0];
        while (lIIIlIllIIIlIIl(i, length)) {
            char lllllllllllllllIIllIIllIIllllIII = charArray[i];
            sb.append((char) (lllllllllllllllIIllIIllIIllllIII ^ lllllllllllllllIIllIIllIIlllIlII[lllllllllllllllIIllIIllIIlllIIll % lllllllllllllllIIllIIllIIlllIlII.length]));
            "".length();
            lllllllllllllllIIllIIllIIlllIIll++;
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public List<f> z() {
        return this.L;
    }

    @Subscribe
    public void a(GroundObjectSpawned groundObjectSpawned) {
        a(null, groundObjectSpawned.getGroundObject());
    }

    public Set<Integer> y() {
        return this.z;
    }

    private static boolean lIIIlIllIIIlllI(Object obj) {
        return obj != null;
    }

    public Client A() {
        return this.M;
    }

    private static boolean lIIIlIllIIIlIII(int i) {
        return i == 0;
    }

    private static String lIIIlIlIllIIlll(String lllllllllllllllIIllIIllIlIIIIlll, String lllllllllllllllIIllIIllIlIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIlIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllIlIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllIlIIIlIIl.init(lllIIlllIllI[5], lllllllllllllllIIllIIllIlIIIlIlI);
            return new String(lllllllllllllllIIllIIllIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllIlIIIlIII) {
            lllllllllllllllIIllIIllIlIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllIIIlIll(int i, int i2) {
        return i == i2;
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

    private static boolean lIIIlIllIIlIIII(Object obj) {
        return obj == null;
    }

    public void n() {
        if (lIIIlIllIIIIlll(this.M.getGameState(), GameState.LOGGED_IN)) {
            this.N.invokeLater(() -> {
                this.O = s();
                p();
            });
        }
        TileObjects.getAll().forEach(tileObject -> {
            a(null, tileObject);
        });
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        a(null, gameObjectSpawned.getGameObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void p() {
        boolean z;
        int i;
        if (lIIIlIllIIIlIII(D() ? 1 : 0)) {
            return;
        }
        int lllllllllllllllIIllIIllIlIlllIll = lllIIlllIllI[0];
        boolean z2 = this.S;
        f[] values = f.values();
        int length = values.length;
        int i2 = lllIIlllIllI[0];
        while (lIIIlIllIIIlIIl(i2, length)) {
            f fVar = values[i2];
            for (k kVar : fVar.m()) {
                int varbitValue = this.M.getVarbitValue(kVar.O());
                if (lIIIlIllIIIlIll(varbitValue, kVar.M())) {
                    this.Q = fVar.k();
                    this.P = kVar;
                    if (lIIIlIllIIIlIII(this.L.contains(fVar) ? 1 : 0)) {
                        this.L.add(fVar);
                        "".length();
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                    }
                } else if (lIIIlIllIIIllII(varbitValue)) {
                    this.z.addAll(kVar.L());
                    "".length();
                    lllllllllllllllIIllIIllIlIlllIll = lllIIlllIllI[1];
                }
                "".length();
                if ((-" ".length()) >= " ".length()) {
                    return;
                }
            }
            i2++;
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        this.R = this.M.getVarbitValue(lllIIlllIllI[2]);
        if (!lIIIlIllIIIllIl(this.M.getVarbitValue(lllIIlllIllI[3])) || lIIIlIllIIIlllI(this.Q)) {
            int i3 = lllIIlllIllI[1];
            "".length();
            z = i3;
            if ((-" ".length()) >= (((135 ^ 163) ^ (16 ^ 46)) & (((213 ^ 167) ^ (36 ^ 76)) ^ (-" ".length())))) {
                return;
            }
        } else {
            z = lllIIlllIllI[0];
        }
        this.S = z;
        if (lIIIlIllIIIlIII(lllllllllllllllIIllIIllIlIlllIll) && lIIIlIllIIIlIlI(this.S ? 1 : 0)) {
            i = lllIIlllIllI[1];
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
        } else {
            i = lllIIlllIllI[0];
        }
        int i4 = i;
        if (lIIIlIllIIIlIII(z2 ? 1 : 0) && lIIIlIllIIIlIlI(this.S ? 1 : 0)) {
            this.U = h.c(this.T);
        }
        if (lIIIlIllIIIlIlI(i4)) {
            q();
        }
    }
}
