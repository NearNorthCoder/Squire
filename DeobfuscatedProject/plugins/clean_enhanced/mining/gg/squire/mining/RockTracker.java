package gg.squire.mining;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.client.eventbus.Subscribe;

/**
 * Tracks the last mined rock to avoid re-clicking depleted rocks.
 */
@Singleton
public class RockTracker {
    private final Client client;
    private TileObject lastMinedRock;
    private WorldPoint lastMinedLocation;
    private int lastMinedRockId;
    private boolean shouldClearNextTick;
    private int lastDepletedTick;

    @Inject
    public RockTracker(Client client) {
        this.client = client;
    }

    /**
     * Gets the last mined rock.
     *
     * @return the last mined rock or null
     */
    public TileObject getLastMinedRock() {
        return lastMinedRock;
    }

    /**
     * Gets the tick when a rock was last depleted.
     *
     * @return the tick count
     */
    public int getLastDepletedTick() {
        return lastDepletedTick;
    }

    /**
     * Sets the currently mining rock.
     *
     * @param rock the rock being mined
     */
    public void setMiningRock(TileObject rock) {
        this.lastMinedRock = rock;
        if (rock == null) {
            this.lastMinedLocation = null;
            this.lastMinedRockId = -1;
        } else {
            this.lastMinedLocation = rock.getWorldLocation();
            this.lastMinedRockId = rock.getId();
        }
    }

    /**
     * Checks if the given rock matches the last mined rock.
     *
     * @param rock the rock to check
     * @return true if it matches
     */
    private boolean matchesLastRock(TileObject rock) {
        return rock.getId() == lastMinedRockId &&
               rock.getWorldLocation().equals(lastMinedLocation);
    }

    @Subscribe
    public void onWallObjectSpawned(WallObjectSpawned event) {
        WallObject wall = event.getWallObject();
        if (matchesLastRock(wall)) {
            this.lastMinedRock = wall;
            this.shouldClearNextTick = false;
        }
    }

    @Subscribe
    public void onGameTick(GameTick event) {
        if (shouldClearNextTick) {
            this.lastMinedRock = null;
            this.lastMinedLocation = null;
            this.lastMinedRockId = -1;
            this.shouldClearNextTick = false;
            this.lastDepletedTick = client.getTickCount();
        }
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged event) {
        this.shouldClearNextTick = true;
    }

    @Subscribe
    public void onWallObjectDespawned(WallObjectDespawned event) {
        if (event.getWallObject() == lastMinedRock) {
            this.shouldClearNextTick = true;
        }
    }

    @Subscribe
    public void onGameObjectDespawned(GameObjectDespawned event) {
        if (event.getGameObject() == lastMinedRock) {
            this.lastMinedRock = null;
            this.lastDepletedTick = client.getTickCount();
        }
    }
}
