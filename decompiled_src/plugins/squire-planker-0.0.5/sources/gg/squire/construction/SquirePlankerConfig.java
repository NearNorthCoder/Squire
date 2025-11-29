package gg.squire.construction;

import k.p.n.s.r.a.p000.q.e.l.r.e.i.u.a;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squireplanker")
/* loaded from: squire-planker-0.0.5.jar:gg/squire/construction/SquirePlankerConfig.class */
public interface SquirePlankerConfig extends Config {
    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 11, keyName = "slowmode", name = "Slow mode", description = "Runs slower but more stable")
    default boolean slowmode() {
        return ((((84 + 6) - 2) + 79) ^ (((10 + 122) - 50) + 57)) & (((45 ^ 106) ^ (41 ^ 66)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 10, keyName = "spell", name = "Use spell", description = "Uses the plank make spell instead of cammy method")
    default boolean spell() {
        return ((49 ^ 59) ^ (194 ^ 151)) & (((49 ^ 113) ^ (127 ^ 96)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 13, keyName = "ironmode", hideValue = "spell", name = "Use portals instead of teleport", description = "Would you rather use your built home portals?")
    default boolean ironMode() {
        return ((96 ^ 106) ^ (32 ^ 57)) & (((((93 + 79) - 47) + 22) ^ (((103 + 52) - 113) + 86)) ^ (-" ".length()));
    }

    @ConfigItem(position = 12, keyName = "plank", name = "Plank to make", description = "Plank to make")
    default a plank() {
        return a.MAHOGANY;
    }
}
