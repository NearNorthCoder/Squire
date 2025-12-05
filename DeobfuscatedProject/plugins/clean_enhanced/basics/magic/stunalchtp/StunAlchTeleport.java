/*
 * Deobfuscated with CFR 0.152.
 *
 * Stun Alch Teleport Plugin
 * Performs stun on guards, alchs items, and teleports to Ardougne for magic training.
 *
 * Original obfuscated class: StunAlchTeleport
 * Package: gg.squire.basics.magic.stunalchtp
 */
package gg.squire.basics.magic.stunalchtp;

import com.google.inject.Provides;
import gg.squire.basics.tasks.AlchTask;
import gg.squire.basics.tasks.StunTask;
import gg.squire.basics.tasks.TeleportTask;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.game.Skills;

/**
 * Plugin for combined magic training using stun, high alchemy, and teleportation.
 * Typically used on guards in Ardougne for efficient magic experience.
 */
@PluginDescriptor(
    name = "Squire StunAlchTP",
    description = "Performs stun on guard, alchs and tps to ardougne",
    enabledByDefault = false
)
public class StunAlchTeleport extends SquirePlugin {

    // Log messages
    private static final String MSG_STARTED = "StunAlchTP Started";
    private static final String MSG_STOPPED = "StunAlchTP Stopped";

    private int startingMagicXp;
    private boolean shouldTeleport;

    /**
     * Constructs a new StunAlchTeleport plugin.
     * Initializes state variables.
     */
    public StunAlchTeleport() {
        this.shouldTeleport = false;
        this.startingMagicXp = 0;
    }

    /**
     * Provides the plugin configuration.
     *
     * @param configManager the config manager
     * @return the plugin configuration
     */
    @Provides
    SquireAlchTeleportConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireAlchTeleportConfig.class);
    }

    /**
     * Returns the task classes used by this plugin.
     * Tasks run in priority order: StunTask (3), AlchTask (2), TeleportTask (default).
     *
     * @return array of task classes
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[]{
            StunTask.class,
            AlchTask.class,
            TeleportTask.class
        };
    }

    /**
     * Called when the plugin is started.
     * Logs startup message and records starting magic XP.
     */
    @Override
    protected void onStart() {
        Log.info(MSG_STARTED);
        this.startingMagicXp = Skills.getExperience(Skill.MAGIC);
    }

    /**
     * Called when the plugin is stopped.
     * Logs shutdown message.
     */
    @Override
    protected void onStop() {
        Log.info(MSG_STOPPED);
    }

    /**
     * Gets the starting magic experience when the plugin was started.
     *
     * @return starting magic XP
     */
    public int getStartingMagicXp() {
        return this.startingMagicXp;
    }

    /**
     * Sets the starting magic experience.
     *
     * @param xp the magic XP value
     */
    public void setStartingMagicXp(int xp) {
        this.startingMagicXp = xp;
    }

    /**
     * Checks if the plugin should teleport after casting spells.
     *
     * @return true if should teleport, false otherwise
     */
    public boolean shouldTeleport() {
        return this.shouldTeleport;
    }

    /**
     * Sets whether the plugin should teleport.
     *
     * @param shouldTeleport true to enable teleporting, false to disable
     */
    public void setShouldTeleport(boolean shouldTeleport) {
        this.shouldTeleport = shouldTeleport;
    }
}
