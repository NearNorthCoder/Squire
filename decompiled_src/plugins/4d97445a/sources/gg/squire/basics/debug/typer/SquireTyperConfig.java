package gg.squire.basics.debug.typer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squiretyper")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/debug/typer/SquireTyperConfig.class */
public interface SquireTyperConfig extends Config {
    @ConfigItem(position = 1, keyName = "tickDelay", name = "Delay (ticks)", description = "Delay between each tick")
    default int tickDelay() {
        return 4 ^ 56;
    }

    @ConfigItem(position = 0, keyName = "msg", name = "Message", description = "Message to type")
    default String msg() {
        return "Hello World!";
    }
}
