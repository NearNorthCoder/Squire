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
import m.u.a.-.e.s.q.t.i.r.CEnum;
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

public class j_Unknown
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
        Iterator<WorldPoint> var4 = this.Q.iterator();
        while (j.lIIIllIIIlIlIlI(var4.hasNext() ? 1 : 0)) {
            double var3;
            WorldPoint var6;
            void var5;
            WorldPoint var1 = var4.next();
            double var13 = var5.distanceTo(var1);
            if (!j.lIIIllIIIlIllII(var6) || j.lIIIllIIIlIlllI(j.lIIIllIIIlIllIl(var13, var3))) {
                var3 = var13;
                var6 = var1;
            }
            0;
            if (1 > ((0xB2 ^ 0xA5) & ~(0xD7 ^ 0xC0))) continue;
            return null;
        }
        return worldPoint;
    }

    private static void lIIIllIIIlIlIII() {
        lllIlIlIlllI = new int[5];
        j.lllIlIlIlllI[0] = (0xB2 ^ 0xAF) & ~(0xD9 ^ 0xC4);
        j.lllIlIlIlllI[1] = 1;
        j.lllIlIlIlllI[2] = -(0xFFFFE5C9 & 0x1E3F) & (0xFFFFBFFF & 0x5EFF);
        j.lllIlIlIlllI[3] = 0xFFFFFC9F & 0x37F6;
        j.lllIlIlIlllI[4] = 2;
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
            0;
            if ((2 & (2 ^ -1)) != 0) {
                return false;
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
        j.lllIlIlIllIl[j.lllIlIlIlllI[0]] = j."Adding dragonstone at {}";
        j.lllIlIlIllIl[j.lllIlIlIlllI[1]] = j."Removed dragonstone at {}";
    }

    private static String lIIIllIIIlIIllI(String var16, String var7) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var2 = var7.toCharArray();
        int var12 = lllIlIlIlllI[0];
        char[] var11 = var16.toCharArray();
        int var8 = var11.length;
        int var17 = lllIlIlIlllI[0];
        while (j.lIIIllIIIllIIII(var17, var8)) {
            char var14 = var11[var17];
            var10.append((char)(var14 ^ var2[var12 % var2.length]));
            0;
            ++var12;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var10);
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
            0;
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        j var9;
        if (j.lIIIllIIIlIlIll(this.c() ? 1 : 0)) {
            return;
        }
        WorldPoint var15 = var9.A();
        if (j.lIIIllIIIlIllII(var15)) {
            var9.P.setHintArrow(var15);
            var9.H = lllIlIlIlllI[1];
            0;
            if (2 <= ((0xB8 ^ 0x9B ^ 1) & (3 ^ (0x5C ^ 0x7D) ^ -1))) {
                return;
            }
        } else {
            var9.P.clearHintArrow();
            var9.H = lllIlIlIlllI[0];
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
            0;
        }
    }
}

