package m.u.a.p000.e.s.q.t.i.r;

import gg.squire.mta.MagicArenaConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* renamed from: m.u.a.-.e.s.q.t.i.r.j  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/j.class */
public class j extends b {
    private final /* synthetic */ Client P;
    private final /* synthetic */ List<WorldPoint> Q;
    private static /* synthetic */ int[] lllIlIlIlllI;
    private static final /* synthetic */ int O;
    private static final /* synthetic */ Logger N;
    private /* synthetic */ boolean H;
    private static /* synthetic */ String[] lllIlIlIllIl;

    private static boolean lIIIllIIIlIllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllIIIlIllII(Object obj) {
        return obj != null;
    }

    @Inject
    private j(MagicArenaConfig magicArenaConfig, Client client) {
        super(magicArenaConfig);
        this.Q = new ArrayList();
        this.P = client;
    }

    private WorldPoint A() {
        WorldPoint worldPoint = null;
        double d = Double.MAX_VALUE;
        WorldPoint worldLocation = this.P.getLocalPlayer().getWorldLocation();
        for (WorldPoint worldPoint2 : this.Q) {
            double distanceTo = worldLocation.distanceTo(worldPoint2);
            if (!lIIIllIIIlIllII(worldPoint) || lIIIllIIIlIlllI(lIIIllIIIlIllIl(distanceTo, d))) {
                d = distanceTo;
                worldPoint = worldPoint2;
            }
            "".length();
            if (" ".length() <= ((178 ^ 165) & ((215 ^ 192) ^ (-1)))) {
                return null;
            }
        }
        return worldPoint;
    }

    private static void lIIIllIIIlIlIII() {
        lllIlIlIlllI = new int[5];
        lllIlIlIlllI[0] = (178 ^ 175) & ((217 ^ 196) ^ (-1));
        lllIlIlIlllI[1] = " ".length();
        lllIlIlIlllI[2] = (-((-6711) & 7743)) & (-16385) & 24319;
        lllIlIlIlllI[3] = (-865) & 14326;
        lllIlIlIlllI[4] = "  ".length();
    }

    private static boolean lIIIllIIIlIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static int lIIIllIIIlIllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIIIllIIIlIlIIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.Q.clear();
            if (lIIIllIIIlIlIlI(this.H ? 1 : 0)) {
                this.P.clearHintArrow();
                this.H = lllIlIlIlllI[0];
            }
        }
    }

    private static boolean lIIIllIIIlIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public boolean c() {
        Player localPlayer = this.P.getLocalPlayer();
        if (lIIIllIIIlIllII(localPlayer) && lIIIllIIIlIllll(localPlayer.getWorldLocation().getRegionID(), lllIlIlIlllI[3]) && lIIIllIIIlIlIll(localPlayer.getWorldLocation().getPlane())) {
            ?? r0 = lllIlIlIlllI[1];
            "".length();
            return ("  ".length() & ("  ".length() ^ (-" ".length()))) != 0 ? ((((30 + 37) - (-17)) + 131) ^ (((152 + 12) - 85) + 75)) & (((((76 + 108) - 117) + 132) ^ (((101 + 23) - 24) + 38)) ^ (-" ".length())) : r0;
        }
        return lllIlIlIlllI[0];
    }

    private static boolean lIIIllIIIllIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIIIlIlIll(int i) {
        return i == 0;
    }

    private static void lIIIllIIIlIIlll() {
        lllIlIlIllIl = new String[lllIlIlIlllI[4]];
        lllIlIlIllIl[lllIlIlIlllI[0]] = lIIIllIIIlIIllI("MzQ+KisVcD4xJBU/NDAxHT4/YyQGcCE+", "rPZCE");
        lllIlIlIllIl[lllIlIlIlllI[1]] = lIIIllIIIlIIllI("KDcXIQUfNloqARs1FSAADj0UK1MbJlo1Dg==", "zRzNs");
    }

    private static String lIIIllIIIlIIllI(String lllllllllllllllIIllIlIllIIIIIIlI, String lllllllllllllllIIllIlIllIIIIIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlIlIllllllll = lllllllllllllllIIllIlIllIIIIIIIl.toCharArray();
        int lllllllllllllllIIllIlIlIlllllllI = lllIlIlIlllI[0];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIIllIlIlIllllIlll = charArray.length;
        int i = lllIlIlIlllI[0];
        while (lIIIllIIIllIIII(i, lllllllllllllllIIllIlIlIllllIlll)) {
            char lllllllllllllllIIllIlIlIllllIlIl = charArray[i];
            sb.append((char) (lllllllllllllllIIllIlIlIllllIlIl ^ lllllllllllllllIIllIlIlIllllllll[lllllllllllllllIIllIlIlIlllllllI % lllllllllllllllIIllIlIlIllllllll.length]));
            "".length();
            lllllllllllllllIIllIlIlIlllllllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIIllIIIlIlIII();
        lIIIllIIIlIIlll();
        O = lllIlIlIlllI[3];
        N = LoggerFactory.getLogger(j.class);
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public c d() {
        return c.ENCHANTMENT;
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        TileItem item = itemDespawned.getItem();
        Tile tile = itemDespawned.getTile();
        if (lIIIllIIIlIllll(item.getId(), lllIlIlIlllI[2])) {
            WorldPoint worldLocation = tile.getWorldLocation();
            N.debug(lllIlIlIllIl[lllIlIlIlllI[1]], worldLocation);
            this.Q.remove(worldLocation);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void a(GameTick gameTick) {
        if (lIIIllIIIlIlIll(c() ? 1 : 0)) {
            return;
        }
        WorldPoint A = A();
        if (!lIIIllIIIlIllII(A)) {
            this.P.clearHintArrow();
            this.H = lllIlIlIlllI[0];
            return;
        }
        this.P.setHintArrow(A);
        this.H = lllIlIlIlllI[1];
        "".length();
        if ("  ".length() <= (((184 ^ 155) ^ " ".length()) & (("   ".length() ^ (92 ^ 125)) ^ (-" ".length())))) {
        }
    }

    private static boolean lIIIllIIIlIlllI(int i) {
        return i < 0;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem item = itemSpawned.getItem();
        Tile tile = itemSpawned.getTile();
        if (lIIIllIIIlIllll(item.getId(), lllIlIlIlllI[2])) {
            WorldPoint worldLocation = tile.getWorldLocation();
            N.debug(lllIlIlIllIl[lllIlIlIlllI[0]], worldLocation);
            this.Q.add(worldLocation);
            "".length();
        }
    }
}
