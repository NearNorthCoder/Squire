/*
 * Deobfuscated with CFR 0.152.
 *
 * Squire Mage Arena One Plugin
 * Automatically casts god spells on Kolodion during the Mage Arena minigame.
 *
 * Original obfuscated class: MageArenaOne
 * Package: gg.squire.basics.magic
 */
package gg.squire.basics.magic;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.NPC;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.client.managers.interaction.InteractionManager;

import java.util.List;

/**
 * Plugin for automating Mage Arena One combat.
 * Casts configured god spells on Kolodion when attacked.
 */
@SquireUtil
@PluginDescriptor(
    name = "Squire Mage Arena One",
    description = "Cast god spells for you",
    enabledByDefault = false
)
public class MageArenaOne extends SquirePlugin {

    // Constants
    private static final int NOT_ANIMATING = -1;
    private static final String ACTION_ATTACK = "Attack";
    private static final String NPC_NAME_KOLODION = "Kolodion";

    @Inject
    private MageArenaOneConfig config;

    @Inject
    private ConfigManager configManager;

    /**
     * Provides the plugin configuration.
     *
     * @param configManager the config manager
     * @return the plugin configuration
     */
    @Provides
    MageArenaOneConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(MageArenaOneConfig.class);
    }

    /**
     * Returns an empty array as this plugin doesn't use the task framework.
     *
     * @return empty class array
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }

    /**
     * Called when the plugin is started.
     * Enables the interaction helper.
     */
    @Override
    protected void onStart() {
        InteractionManager.setHelper(true);
    }

    /**
     * Called when the plugin is stopped.
     * Disables the interaction helper.
     */
    @Override
    protected void onStop() {
        InteractionManager.setHelper(false);
    }

    /**
     * Handles game tick events to automatically cast spells.
     * Casts the configured god spell on Kolodion when the player is attacked.
     *
     * @param gameTick the game tick event
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Find NPCs interacting with the player that have the Attack action and are named Kolodion
        List<NPC> targetNPCs = NPCs.getAll(npc ->
            npc.getInteracting() == Players.getLocal() &&
            npc.hasAction(ACTION_ATTACK) &&
            npc.getName().contains(NPC_NAME_KOLODION)
        );

        // If we found a valid target and player is not animating, cast the configured spell
        if (targetNPCs != null &&
            !targetNPCs.isEmpty() &&
            Players.getLocal().getAnimation() == NOT_ANIMATING) {

            Magic.cast(config.spell(), targetNPCs.get(0));
        }
    }
}
