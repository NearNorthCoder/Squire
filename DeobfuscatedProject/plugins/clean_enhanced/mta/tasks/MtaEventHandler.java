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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import gg.squire.mta.tasks.MtaTaskBase;
import gg.squire.mta.tasks.GameEnum2;
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

public class MtaEventHandler
extends MtaTaskBase {
    private final  Client P;
    private final  List<WorldPoint> Q;
    
    private static final  int O;
    private static final  Logger N;
    private  boolean H;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    @Inject
    private MtaEventHandler(MagicArenaConfig magicArenaConfig, Client client) {
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
        Iterator<WorldPoint> var5 = this.Q.iterator();
        while (j.var6(var5.hasNext() ? 1 : 0)) {
            double var7;
            WorldPoint var8;
            void var9;
            WorldPoint var10 = var5.next();
            double var11 = var9.distanceTo(var10);
            if (!j.var4(var8) || j.var12(j.var13(var11, var7))) {
                var7 = var11;
                var8 = var10;
            }
            0;
            if (1 > ((0xB2 ^ 0xA5) & ~(0xD7 ^ 0xC0))) continue;
            return null;
        }
        return worldPoint;
    }

    private static void var14() {
        var1 = new int[5];
        j.var1[0] = (0xB2 ^ 0xAF) & ~(0xD9 ^ 0xC4);
        j.var1[1] = 1;
        j.var1[2] = -(0xFFFFE5C9 & 0x1E3F) & (0xFFFFBFFF & 0x5EFF);
        j.var1[3] = 0xFFFFFC9F & 0x37F6;
        j.var1[4] = 2;
    }

    private static boolean var15(Object object, Object object2) {
        return object == object2;
    }

    private static int var13(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (j.var15(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.Q.clear();
            if (j.var6(this.H)) {
                this.P.clearHintArrow();
                this.H = var1[0];
            }
        }
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean c() {
        int n2;
        Player player = this.P.getLocalPlayer();
        if (j.var4(player) && j.var3(player.getWorldLocation().getRegionID(), var1[3]) && j.var16(player.getWorldLocation().getPlane())) {
            n2 = var1[1];
            0;
            if ((2 & (2 ^ -1)) != 0) {
                return ((30 + 37 - -17 + 131 ^ 152 + 12 - 85 + 75) & (76 + 108 - 117 + 132 ^ 101 + 23 - 24 + 38 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    private static void var18() {
        var2 = new String[var1[4]];
        j.var2[j.var1[0]] = "Adding dragonstone at {}";
        j.var2[j.var1[1]] = "Removed dragonstone at {}";
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[0];
        while (j.var17(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var22);
    }

    static {
        j.var14();
        j.var18();
        O = var1[3];
        N = LoggerFactory.getLogger(MtaEventHandler.class);
    }

    @Override
    public c d() {
        return c.ENCHANTMENT;
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        TileItem tileItem = itemDespawned.getItem();
        Tile tile = itemDespawned.getTile();
        if (j.var3(tileItem.getId(), var1[2])) {
            WorldPoint worldPoint = tile.getWorldLocation();
            N.debug(var2[var1[1]], (Object)worldPoint);
            this.Q.remove(worldPoint);
            0;
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        j var29;
        if (j.var16(this.c() ? 1 : 0)) {
            return;
        }
        WorldPoint var30 = var29.A();
        if (j.var4(var30)) {
            var29.P.setHintArrow(var30);
            var29.H = var1[1];
            0;
            if (2 <= ((0xB8 ^ 0x9B ^ 1) & (3 ^ (0x5C ^ 0x7D) ^ -1))) {
                return;
            }
        } else {
            var29.P.clearHintArrow();
            var29.H = var1[0];
        }
    }

    private static boolean var12(int n2) {
        return n2 < 0;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem tileItem = itemSpawned.getItem();
        Tile tile = itemSpawned.getTile();
        if (j.var3(tileItem.getId(), var1[2])) {
            WorldPoint worldPoint = tile.getWorldLocation();
            N.debug(var2[var1[0]], (Object)worldPoint);
            this.Q.add(worldPoint);
            0;
        }
    }
}

