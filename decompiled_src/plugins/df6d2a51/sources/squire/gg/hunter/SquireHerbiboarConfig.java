package squire.gg.hunter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o.e;
@ConfigGroup("sqherbiboar")
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:squire/gg/hunter/SquireHerbiboarConfig.class */
public interface SquireHerbiboarConfig extends Config {
    @ConfigItem(position = 13, keyName = "rest.qty", name = "Amount Of Restores", description = "Amount Of Restores to bring")
    default int quantity() {
        return 15 ^ 10;
    }

    @ConfigItem(position = 10, keyName = "sack", name = "Use Herb sack", description = "Make use of the herb sack")
    default boolean useHerbSack() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 12, keyName = "restore", name = "Energy Restoration", description = "Use potions to restore energy")
    default e useEnergyRestoration() {
        return e.STAMINA;
    }
}
