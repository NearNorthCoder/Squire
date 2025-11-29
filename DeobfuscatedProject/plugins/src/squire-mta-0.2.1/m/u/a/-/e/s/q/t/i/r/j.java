/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Player
 *  net.runelite.api.Tile
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package m.u.a.-.e.s.q.t.i.r;

import gg.squire.mta.MagicArenaConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.c;
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

public class j
extends b {
    private final /* synthetic */ Client P;
    private final /* synthetic */ List<WorldPoint> Q;
    private static /* synthetic */ int[] lllIlIlIlllI;
    private static final /* synthetic */ int O;
    private static final /* synthetic */ Logger N;
    private /* synthetic */ boolean H;
    private static /* synthetic */ String[] lllIlIlIllIl;

    private static boolean lIIIllIIIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIIIlIllII(Object object) {
        return object != null;
    }

    @Inject
    private j(MagicArenaConfig magicArenaConfig, Client client) {
        super(magicArenaConfig);
        this.Q = new ArrayList<WorldPoint>();
        this.P = client;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint A() {
        WorldPoint worldPoint = null;
        double d2 = Double.MAX_VALUE;
        WorldPoint worldPoint2 = this.P.getLocalPlayer().getWorldLocation();
        Iterator<WorldPoint> lllllllllllllllIIllIlIllIIlIIlll = this.Q.iterator();
        while (j.lIIIllIIIlIlIlI(lllllllllllllllIIllIlIllIIlIIlll.hasNext() ? 1 : 0)) {
            double lllllllllllllllIIllIlIllIIlIlIIl;
            WorldPoint lllllllllllllllIIllIlIllIIlIlIlI;
            void lllllllllllllllIIllIlIllIIlIlIII;
            WorldPoint lllllllllllllllIIllIlIllIIlIIllI = lllllllllllllllIIllIlIllIIlIIlll.next();
            double lllllllllllllllIIllIlIllIIlIIlIl = lllllllllllllllIIllIlIllIIlIlIII.distanceTo(lllllllllllllllIIllIlIllIIlIIllI);
            if (!j.lIIIllIIIlIllII(lllllllllllllllIIllIlIllIIlIlIlI) || j.lIIIllIIIlIlllI(j.lIIIllIIIlIllIl(lllllllllllllllIIllIlIllIIlIIlIl, lllllllllllllllIIllIlIllIIlIlIIl))) {
                lllllllllllllllIIllIlIllIIlIlIIl = lllllllllllllllIIllIlIllIIlIIlIl;
                lllllllllllllllIIllIlIllIIlIlIlI = lllllllllllllllIIllIlIllIIlIIllI;
            }
            "".length();
            if (" ".length() > ((0xB2 ^ 0xA5) & ~(0xD7 ^ 0xC0))) continue;
            return null;
        }
        return worldPoint;
    }

    private static void lIIIllIIIlIlIII() {
        lllIlIlIlllI = new int[5];
        j.lllIlIlIlllI[0] = (0xB2 ^ 0xAF) & ~(0xD9 ^ 0xC4);
        j.lllIlIlIlllI[1] = " ".length();
        j.lllIlIlIlllI[2] = -(0xFFFFE5C9 & 0x1E3F) & (0xFFFFBFFF & 0x5EFF);
        j.lllIlIlIlllI[3] = 0xFFFFFC9F & 0x37F6;
        j.lllIlIlIlllI[4] = "  ".length();
    }

    private static boolean lIIIllIIIlIlIIl(Object object, Object object2) {
        return object == object2;
    }

    private static int lIIIllIIIlIllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (j.lIIIllIIIlIlIIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.Q.clear();
            if (j.lIIIllIIIlIlIlI(this.H ? 1 : 0)) {
                this.P.clearHintArrow();
                this.H = lllIlIlIlllI[0];
            }
        }
    }

    private static boolean lIIIllIIIlIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean c() {
        int n2;
        Player player = this.P.getLocalPlayer();
        if (j.lIIIllIIIlIllII(player) && j.lIIIllIIIlIllll(player.getWorldLocation().getRegionID(), lllIlIlIlllI[3]) && j.lIIIllIIIlIlIll(player.getWorldLocation().getPlane())) {
            n2 = lllIlIlIlllI[1];
            "".length();
            if (("  ".length() & ("  ".length() ^ -" ".length())) != 0) {
                return ((30 + 37 - -17 + 131 ^ 152 + 12 - 85 + 75) & (76 + 108 - 117 + 132 ^ 101 + 23 - 24 + 38 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllIlIlIlllI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIllIIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIIIlIlIll(int n2) {
        return n2 == 0;
    }

    private static void lIIIllIIIlIIlll() {
        lllIlIlIllIl = new String[lllIlIlIlllI[4]];
        j.lllIlIlIllIl[j.lllIlIlIlllI[0]] = j.lIIIllIIIlIIllI("MzQ+KisVcD4xJBU/NDAxHT4/YyQGcCE+", "rPZCE");
        j.lllIlIlIllIl[j.lllIlIlIlllI[1]] = j.lIIIllIIIlIIllI("KDcXIQUfNloqARs1FSAADj0UK1MbJlo1Dg==", "zRzNs");
    }

    private static String lIIIllIIIlIIllI(String lllllllllllllllIIllIlIllIIIIIIlI, String lllllllllllllllIIllIlIllIIIIIIIl) {
        lllllllllllllllIIllIlIllIIIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIllIIIIIIII = new StringBuilder();
        char[] lllllllllllllllIIllIlIlIllllllll = lllllllllllllllIIllIlIllIIIIIIIl.toCharArray();
        int lllllllllllllllIIllIlIlIlllllllI = lllIlIlIlllI[0];
        char[] lllllllllllllllIIllIlIlIlllllIII = lllllllllllllllIIllIlIllIIIIIIlI.toCharArray();
        int lllllllllllllllIIllIlIlIllllIlll = lllllllllllllllIIllIlIlIlllllIII.length;
        int lllllllllllllllIIllIlIlIllllIllI = lllIlIlIlllI[0];
        while (j.lIIIllIIIllIIII(lllllllllllllllIIllIlIlIllllIllI, lllllllllllllllIIllIlIlIllllIlll)) {
            char lllllllllllllllIIllIlIllIIIIIIll = lllllllllllllllIIllIlIlIlllllIII[lllllllllllllllIIllIlIlIllllIllI];
            lllllllllllllllIIllIlIllIIIIIIII.append((char)(lllllllllllllllIIllIlIllIIIIIIll ^ lllllllllllllllIIllIlIlIllllllll[lllllllllllllllIIllIlIlIlllllllI % lllllllllllllllIIllIlIlIllllllll.length]));
            "".length();
            ++lllllllllllllllIIllIlIlIlllllllI;
            ++lllllllllllllllIIllIlIlIllllIllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIllIIIIIIII);
    }

    static {
        j.lIIIllIIIlIlIII();
        j.lIIIllIIIlIIlll();
        O = lllIlIlIlllI[3];
        N = LoggerFactory.getLogger(j.class);
    }

    @Override
    public c d() {
        return c.ENCHANTMENT;
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        TileItem tileItem = itemDespawned.getItem();
        Tile tile = itemDespawned.getTile();
        if (j.lIIIllIIIlIllll(tileItem.getId(), lllIlIlIlllI[2])) {
            WorldPoint worldPoint = tile.getWorldLocation();
            N.debug(lllIlIlIllIl[lllIlIlIlllI[1]], (Object)worldPoint);
            this.Q.remove(worldPoint);
            "".length();
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        j lllllllllllllllIIllIlIllIIllIlII;
        if (j.lIIIllIIIlIlIll(this.c() ? 1 : 0)) {
            return;
        }
        WorldPoint lllllllllllllllIIllIlIllIIllIIll = lllllllllllllllIIllIlIllIIllIlII.A();
        if (j.lIIIllIIIlIllII(lllllllllllllllIIllIlIllIIllIIll)) {
            lllllllllllllllIIllIlIllIIllIlII.P.setHintArrow(lllllllllllllllIIllIlIllIIllIIll);
            lllllllllllllllIIllIlIllIIllIlII.H = lllIlIlIlllI[1];
            "".length();
            if ("  ".length() <= ((0xB8 ^ 0x9B ^ " ".length()) & ("   ".length() ^ (0x5C ^ 0x7D) ^ -" ".length()))) {
                return;
            }
        } else {
            lllllllllllllllIIllIlIllIIllIlII.P.clearHintArrow();
            lllllllllllllllIIllIlIllIIllIlII.H = lllIlIlIlllI[0];
        }
    }

    private static boolean lIIIllIIIlIlllI(int n2) {
        return n2 < 0;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem tileItem = itemSpawned.getItem();
        Tile tile = itemSpawned.getTile();
        if (j.lIIIllIIIlIllll(tileItem.getId(), lllIlIlIlllI[2])) {
            WorldPoint worldPoint = tile.getWorldLocation();
            N.debug(lllIlIlIllIl[lllIlIlIlllI[0]], (Object)worldPoint);
            this.Q.add(worldPoint);
            "".length();
        }
    }
}

