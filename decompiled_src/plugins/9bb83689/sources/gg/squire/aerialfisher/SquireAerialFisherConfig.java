package gg.squire.aerialfisher;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squireaerialfisher")
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:gg/squire/aerialfisher/SquireAerialFisherConfig.class */
public interface SquireAerialFisherConfig extends Config {
    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "aerialfisher.hop", name = "Hop worlds", description = "Hop worlds when other players are near", position = 10)
    default boolean hopWorlds() {
        return ((104 ^ 113) ^ (46 ^ 40)) & (((139 ^ 129) ^ (17 ^ 4)) ^ (-" ".length()));
    }
}
