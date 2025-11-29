package gg.squire.tempoross;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
@ConfigGroup("squiretempoross")
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:gg/squire/tempoross/SquireTemporossConfig.class */
public interface SquireTemporossConfig extends Config {
    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "tempoross.shouldCook", name = "Should cook", description = "Should cook", position = 10, hide = "tempoross.solo", hideValue = "true")
    default boolean cookFish() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "tempoross.solo", name = "Solo", description = "Changes logic to be able to solo!", position = 1)
    default boolean solo() {
        return ((83 ^ 124) ^ (13 ^ 60)) & (((54 ^ 32) ^ (61 ^ 53)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "tempoross.numBuckets", name = "Number of buckets", description = "Number of buckets", position = 20)
    @Range(min = 3, max = 5)
    default int numberOfBuckets() {
        return "   ".length();
    }

    @ConfigItem(keyName = "tempoross.numFish", name = "Number of fish", description = "Number of fish to catch, if solo this should be around 19-22 depending on buckets", position = 19)
    @Range(min = 10, max = 23)
    default int numberOfFish() {
        return (((57 + 114) - 82) + 54) ^ (((75 + 99) - 121) + 103);
    }
}
