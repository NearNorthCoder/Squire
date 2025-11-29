/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.tempoross;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiretempoross")
public interface SquireTemporossConfig
extends Config {
    @ConfigItem(keyName="tempoross.shouldCook", name="Should cook", description="Should cook", position=10, hide="tempoross.solo", hideValue="true")
    default public boolean cookFish() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="tempoross.solo", name="Solo", description="Changes logic to be able to solo!", position=1)
    default public boolean solo() {
        return ((0x53 ^ 0x7C ^ (0xD ^ 0x3C)) & (0x36 ^ 0x20 ^ (0x3D ^ 0x35) ^ -" ".length())) != 0;
    }

    @Range(min=3, max=5)
    @ConfigItem(keyName="tempoross.numBuckets", name="Number of buckets", description="Number of buckets", position=20)
    default public int numberOfBuckets() {
        return "   ".length();
    }

    @ConfigItem(keyName="tempoross.numFish", name="Number of fish", description="Number of fish to catch, if solo this should be around 19-22 depending on buckets", position=19)
    @Range(min=10, max=23)
    default public int numberOfFish() {
        return 57 + 114 - 82 + 54 ^ 75 + 99 - 121 + 103;
    }
}

