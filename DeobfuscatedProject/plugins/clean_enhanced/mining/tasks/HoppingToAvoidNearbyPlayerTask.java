/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Mining Plugin
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.enums.MiningActivity;
import java.lang.reflect.Field;
import net.runelite.api.AnimationID;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;

/**
 * Task that hops to a different world when a nearby player is detected mining.
 * This helps avoid competition for mining spots.
 */
@TaskDesc(name="Hopping to avoid nearby player", priority=10, blocking=true)
public class HoppingToAvoidNearbyPlayerTask extends Task {

    private static final String MINING_ANIMATION_PREFIX = "MINING_";
    private static final int SLEEP_DURATION = 4;

    private final SquireMinerConfig config;

    @Inject
    public HoppingToAvoidNearbyPlayerTask(SquireMinerConfig config) {
        this.config = config;
    }

    /**
     * Checks if the given animation ID is a mining animation by checking
     * if it corresponds to a field in AnimationID that starts with "MINING_".
     *
     * @param animationId The animation ID to check
     * @return true if this is a mining animation
     */
    private boolean isMiningAnimation(int animationId) {
        Field[] fields = AnimationID.class.getDeclaredFields();

        for (Field field : fields) {
            if (field.getName().startsWith(MINING_ANIMATION_PREFIX)) {
                try {
                    int fieldValue = field.getInt(null);
                    if (fieldValue == animationId) {
                        return true;
                    }
                } catch (IllegalAccessException e) {
                    // Ignore and continue
                }
            }
        }

        return false;
    }

    @Override
    public boolean run() {
        // Don't hop when NOT mining volcanic ash
        if (config.activity() != MiningActivity.VOLCANIC_ASH) {
            return false;
        }

        // Find nearest player who is mining (not including ourselves)
        Player nearbyMiner = Players.getNearest(player ->
            player != Players.getLocal() &&
            isMiningAnimation(player.getAnimation())
        );

        // If no miners nearby, don't hop
        if (nearbyMiner == null) {
            return false;
        }

        // Hop to a random normal members world (different from current)
        Worlds.hopTo(Worlds.getRandom(world ->
            world.isNormal() &&
            world.isMembers() &&
            world.getId() != Worlds.getCurrentId()
        ));

        sleep(SLEEP_DURATION);
        return true;
    }
}
