package gg.squire.basics.magic.stunalchtp;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squirestuntelealchconfig")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/magic/stunalchtp/SquireAlchTeleportConfig.class */
public interface SquireAlchTeleportConfig extends Config {
    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "stunAlch", name = "Tele Alch only?", description = "Only does tele alch, no stun", position = 1)
    default boolean stunAlchOnly() {
        return ((89 ^ 122) ^ (17 ^ 52)) & (((((96 + 32) - 118) + 132) ^ (((130 + 96) - 168) + 78)) ^ (-" ".length()));
    }
}
