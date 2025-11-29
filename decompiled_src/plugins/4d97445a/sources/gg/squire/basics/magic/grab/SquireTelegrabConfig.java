package gg.squire.basics.magic.grab;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squiretelegrab")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/magic/grab/SquireTelegrabConfig.class */
public interface SquireTelegrabConfig extends Config {
    @ConfigItem(keyName = "target", name = "Target", description = "The item to telegrab", position = 1)
    default int target() {
        return " ".length();
    }
}
