/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Named
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.events.ClientTick
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.api.events.GameStateChanged
 *  net.unethicalite.api.events.PlaneChanged
 */
package net.runelite.client.plugins.unethicalite.regions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.PlaneChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.client.managers.RegionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class RegionHandler {
    private static final Logger log = LoggerFactory.getLogger(RegionHandler.class);
    public static boolean selectingSourceTile = false;
    public static boolean selectingDestinationTile = false;
    public static boolean selectingObject = false;
    @Inject
    @Named(value="unethicalite.api.url")
    private String apiUrl;
    @Inject
    private Client client;
    @Inject
    private RegionManager regionManager;
    @Inject
    private GlobalCollisionMap collisionMap;

    @Subscribe
    public void onClientTick(ClientTick e) {
        if (selectingSourceTile) {
            this.client.createMenuEntry(-1).setOption("Set").setTarget("<col=00ff00>Source tile").setIdentifier(TileSelection.SOURCE.id);
            return;
        }
        if (selectingDestinationTile) {
            this.client.createMenuEntry(-1).setOption("Set").setTarget("<col=00ff00>Destination tile").setIdentifier(TileSelection.DESTINATION.id);
            return;
        }
        if (selectingObject) {
            this.client.createMenuEntry(-1).setOption("Set").setTarget("<col=00ff00>Transport object").setIdentifier(TileSelection.OBJECT.id);
        }
    }

    @Subscribe
    public void onConfigButtonClicked(ConfigButtonClicked e) {
        if (!e.getGroup().equals("squire")) {
            return;
        }
        switch (e.getKey()) {
            case "downloadCollisionData": {
                break;
            }
            case "localCollisionData": {
                this.loadCachedCollisionMap();
            }
        }
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged e) {
        if (e.getGameState() != GameState.LOGGED_IN) {
            return;
        }
    }

    @Subscribe
    public void onPlaneChanged(PlaneChanged e) {
        if (Game.getState() != GameState.LOGGED_IN) {
            return;
        }
    }

    private void loadCachedCollisionMap() {
    }

    private void updateCollisionMap() {
    }

    private byte[] readGzip(byte[] input) throws IOException {
        return new GZIPInputStream(new ByteArrayInputStream(input)).readAllBytes();
    }

    static enum TileSelection {
        SOURCE(-420),
        DESTINATION(-421),
        OBJECT(-422);

        private final int id;

        private TileSelection(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }
}

