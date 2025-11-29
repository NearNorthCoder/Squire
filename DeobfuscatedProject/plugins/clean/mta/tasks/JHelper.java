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
package gg.squire.mta.tasks;

import gg.squire.mta.MagicArenaConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import gg.squire.mta.tasks.MtaTaskBase;
import gg.squire.mta.tasks.GameEnum8;
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

public class JHelper
extends MtaTaskBase {
    private final  Client P;
    private final  List<WorldPoint> Q;
    
    private static final  int O;
    private static final  Logger N;
    private  boolean H;

    private static boolean lIIIllIIIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIIIlIllII(Object object) {
        return object != null;
    }

    @Inject
    private JHelper(MagicArenaConfig magicArenaConfig, Client client) {
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
        Iterator<WorldPoint> var1 = this.Q.iterator();
        while (j.lIIIllIIIlIlIlI(var1.hasNext() ? 1 : 0)) {
            double var2;
            WorldPoint var3;
            void var4;
            WorldPoint var5 = var1.next();
            double var6 = var4.distanceTo(var5);
            if (!j.lIIIllIIIlIllII(var3) || j.lIIIllIIIlIlllI(j.lIIIllIIIlIllIl(var6, var2))) {
                var2 = var6;
                var3 = var5;
            }

            if (1 > ((0xB2 ^ 0xA5) & ~(0xD7 ^ 0xC0))) continue;
            return null;
        }
        return worldPoint;
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
        j.lllIlIlIllIl[j.lllIlIlIlllI[0]] = "Adding dragonstone at {}";
        j.lllIlIlIllIl[j.lllIlIlIlllI[1]] = "Removed dragonstone at {}";
    }

        return String.valueOf(var7);
    }

    static {
        j.lIIIllIIIlIlIII();
        j.lIIIllIIIlIIlll();
        O = lllIlIlIlllI[3];
        N = LoggerFactory.getLogger(JHelper.class);
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

        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        j var8;
        if (j.lIIIllIIIlIlIll(this.c() ? 1 : 0)) {
            return;
        }
        WorldPoint var9 = var8.A();
        if (j.lIIIllIIIlIllII(var9)) {
            var8.P.setHintArrow(var9);
            var8.H = lllIlIlIlllI[1];

            if (2 <= ((0xB8 ^ 0x9B ^ 1) & (3 ^ (0x5C ^ 0x7D) ^ -1))) {
                return;
            }
        } else {
            var8.P.clearHintArrow();
            var8.H = lllIlIlIlllI[0];
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

        }
    }
}

