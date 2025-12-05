/*
 * Deobfuscated from gg.squire.basics.chopburn.ChopBurnConfig
 */
package gg.squire.basics.chopburn;

import i.i.b.s.c.q.r.s.s.-.u.a.e.D;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 * Configuration for Chop and Burn plugin.
 */
@ConfigGroup(value = "squirechopburn")
public interface ChopBurnConfig extends Config {

    /**
     * Type of tree to chop and burn.
     *
     * @return Tree type
     */
    @ConfigItem(
        position = 0,
        keyName = "tree",
        name = "Tree Type",
        description = "What type of tree to cut and burn"
    )
    default D tree() {
        return D.OAK;
    }
}
