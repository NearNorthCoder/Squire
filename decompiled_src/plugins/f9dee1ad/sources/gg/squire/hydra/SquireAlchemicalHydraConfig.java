package gg.squire.hydra;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import u.i.r.d.s.e.r.q.y.a.h.p000.g;
@ConfigGroup("squirealchemicalhydra")
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:gg/squire/hydra/SquireAlchemicalHydraConfig.class */
public interface SquireAlchemicalHydraConfig extends Config {
    @ConfigItem(keyName = "offensivePrayer", name = "Offensive Prayer", description = "What offensive prayer should be used when fighting the alchemical hydra?", position = 1)
    default g getOffensivePrayer() {
        return g.RIGOUR;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "blowpipeSpec", name = "Blowpipe spec", description = "If this is enabled, plugin will swap to blowpipe for spec", position = 5)
    default boolean blowpipeSpec() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "bury", name = "Bury bones", description = "If this is enabled, bones will be buried", position = 4)
    default boolean bury() {
        return ((((31 + 117) - 139) + 118) ^ (237 ^ 156)) & (((65 ^ 33) ^ (64 ^ 46)) ^ (-" ".length()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "attack", name = "Attack Hydra", description = "If this is disabled, only prayers will be dealt with", position = 3)
    default boolean attack() {
        return " ".length();
    }

    @ConfigItem(keyName = "eatAt", name = "Eat at", description = "What HP to eat at", position = 6)
    @Range(min = 1, max = 80)
    default int eatAt() {
        return 29 ^ 47;
    }

    @ConfigItem(keyName = "melee", name = "Melee Hydra", description = "Enable if you are using melee versus hydra (with a lance)", hidden = true, position = 2)
    default boolean melee() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "drinkPrayAt", name = "Prayer restore at", description = "What prayer points to drink pots/restores at", position = 7)
    @Range(min = 1, max = 80)
    default int restorePrayAt() {
        return (58 ^ 121) ^ (126 ^ 15);
    }

    @ConfigItem(keyName = "makeDivines", name = "Make divines", description = "If this is enabled, range pots will be turned into divine ranging potions with crystal dust", position = 4)
    default boolean makeDivines() {
        return (true ^ true) & ((true ^ true) ^ true);
    }
}
