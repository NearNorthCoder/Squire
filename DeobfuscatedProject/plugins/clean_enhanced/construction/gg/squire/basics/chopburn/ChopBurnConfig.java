/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.chopburn;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squirechopburn")
public interface ChopBurnConfig
extends Config {
    @ConfigItem(position=0, keyName="tree", name="Tree Type", description="What type of tree to cut and burn")
    default public D tree() {
        return D.OAK;
    }
}

