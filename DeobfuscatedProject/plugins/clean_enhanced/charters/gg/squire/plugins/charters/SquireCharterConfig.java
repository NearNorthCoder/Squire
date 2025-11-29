/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.plugins.charters;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squirecrafter")
public interface SquireCharterConfig
extends Config {
    @ConfigItem(position=0, keyName="method", name="Crafting method", description="Select which crafting method to do")
    default public b method() {
        return b.CHARTER_SHIPS;
    }
}

