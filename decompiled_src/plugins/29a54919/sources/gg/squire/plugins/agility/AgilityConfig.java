package gg.squire.plugins.agility;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.b;
@ConfigGroup("squireagility")
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:gg/squire/plugins/agility/AgilityConfig.class */
public interface AgilityConfig extends Config {
    @ConfigItem(position = 12, keyName = "stopAtHp", name = "Stop at HP%", description = "Will stop the plugin if we go below this HP percentage")
    default int stopAtHp() {
        return (185 ^ 167) ^ ((96 ^ 113) & ((114 ^ 99) ^ (-1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 10, keyName = "progressive", name = "Progressive", description = "If the plugin should progressively switch courses")
    default boolean progressive() {
        return ((((64 + 119) - 170) + 179) ^ (((52 + 113) - 79) + 55)) & (((32 ^ 58) ^ (250 ^ 173)) ^ (-" ".length()));
    }

    @ConfigItem(position = 11, keyName = "course", name = "Agility Course", description = "The desired course", hide = "progressive")
    default b course() {
        return b.ARDOUGNE;
    }

    @ConfigItem(position = 20, keyName = "imbue", name = "Magic Imbue", description = "Whether or not to cast magic imbue", hide = "alch")
    default boolean imbue() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 31, keyName = "markLootAmount", name = "Loot marks at", description = "Amount of marks to loot at")
    default int markLootAmount() {
        return (((119 + 72) - 174) + 113) ^ (((122 + 50) - 166) + 130);
    }

    @ConfigItem(position = 21, keyName = "alchemy", name = "Alchemy", description = "Will alch any noted item in your inventory, unless you specify ids below", hide = "imbue")
    default boolean alch() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 22, keyName = "alchemyIds", name = "Alching items", description = "A list of items to alch (ids), separated by comma, leave empty to take any noted item", hide = "imbue")
    default String alchIds() {
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 15, keyName = "seersTeleport", name = "Seers Teleport", description = "Make use of seers village teleport spell?", hidden = true, unhide = "course", unhideValue = "SEERS_VILLAGE")
    @Range(min = 10, max = 90)
    default boolean seersTeleport() {
        return " ".length();
    }
}
