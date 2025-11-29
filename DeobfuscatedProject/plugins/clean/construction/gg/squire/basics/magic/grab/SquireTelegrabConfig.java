/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.magic.grab;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squiretelegrab")
public interface SquireTelegrabConfig
extends Config {
    @ConfigItem(keyName="target", name="Target", description="The item to telegrab", position=1)
    default public int target() {
        return " ".length();
    }
}

