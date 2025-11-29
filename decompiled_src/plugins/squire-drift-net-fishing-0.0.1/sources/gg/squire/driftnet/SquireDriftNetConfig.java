package gg.squire.driftnet;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
@ConfigGroup("squiredriftnet")
/* loaded from: squire-drift-net-fishing-0.0.1.jar:gg/squire/driftnet/SquireDriftNetConfig.class */
public interface SquireDriftNetConfig extends Config {
    @ConfigItem(keyName = "stamina", name = "Stamina", description = "(0 to disable - REQUIRES: Relog Hopper) Withdraw this many staminas when banking", position = 15)
    @Range(max = 20)
    default int stamina() {
        return (189 ^ 138) ^ (83 ^ 107);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "depositFish", name = "Deposit Fish", description = "Can disable this feature to increase XP per hour at the cost of caught fish", position = 10)
    default boolean depositFish() {
        return " ".length();
    }
}
