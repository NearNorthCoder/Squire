/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.repeat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squirequickmenu")
public interface SquireQuickMenuConfig
extends Config {
    @ConfigItem(position=11, keyName="quickAlchItems", name="Quick Alch Items", description="Items to quick alch (id/name)")
    default public String quickAlch() {
        return "1164,Rune platebody";
    }
}

