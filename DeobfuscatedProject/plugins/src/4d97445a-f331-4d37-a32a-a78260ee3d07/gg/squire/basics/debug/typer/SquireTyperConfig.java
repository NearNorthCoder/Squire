/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.debug.typer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squiretyper")
public interface SquireTyperConfig
extends Config {
    @ConfigItem(position=1, keyName="tickDelay", name="Delay (ticks)", description="Delay between each tick")
    default public int tickDelay() {
        return 4 ^ 0x38;
    }

    @ConfigItem(position=0, keyName="msg", name="Message", description="Message to type")
    default public String msg() {
        return "Hello World!";
    }
}

