package gg.squire.basics.kitten;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.aA;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squirekitten")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/kitten/SquireKittenConfig.class */
public interface SquireKittenConfig extends Config {
    @ConfigItem(keyName = "spiceType", name = "Pickup Spice", description = "Spice type to pick up", position = 2)
    default aA spiceType() {
        return aA.YELLOW;
    }

    @ConfigItem(keyName = "huntCat", name = "Hunt Spice", description = "Enable to start hunting for spice", position = 1)
    default boolean huntSpice() {
        return (true ^ true) & ((true ^ true) ^ true);
    }
}
