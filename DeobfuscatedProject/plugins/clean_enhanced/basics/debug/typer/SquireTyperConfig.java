/*
 * Deobfuscated from SquireTyperConfig
 * Package: gg.squire.basics.debug.typer
 *
 * Configuration for the auto-typer plugin.
 * Allows configuring message and delay between messages.
 */
package gg.squire.basics.debug.typer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 * Configuration for Squire Typer plugin.
 * Controls automated message sending behavior.
 */
@ConfigGroup(value="squiretyper")
public interface SquireTyperConfig extends Config {

    /**
     * Message to automatically type.
     *
     * @return message string (default: "Hello World!")
     */
    @ConfigItem(
        position=0,
        keyName="msg",
        name="Message",
        description="Message to type"
    )
    default String msg() {
        return "Hello World!";
    }

    /**
     * Delay in game ticks between each message.
     *
     * @return tick delay (default: 60)
     */
    @ConfigItem(
        position=1,
        keyName="tickDelay",
        name="Delay (ticks)",
        description="Delay between each tick"
    )
    default int tickDelay() {
        return 60; // 4 ^ 0x38 = 60
    }
}
