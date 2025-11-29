package gg.squire.minigames;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a.a;
@ConfigGroup("squireSorcGarden")
/* loaded from: 36afa564-21f3-409d-8955-c6e80fe75d70.jar:gg/squire/minigames/SquireSorceressGardenConfig.class */
public interface SquireSorceressGardenConfig extends Config {
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(keyName = "breakDownHerbs", name = "Full Herb Infobox", description = "Do you want to see all herbs per hour?", position = 4, hidden = true, unhide = "pickHerbs")
    default boolean breakDownHerbs() {
        return " ".length();
    }

    @ConfigItem(keyName = "stamAmount", name = "Amount of Stamina Potions", description = "how many?", position = 2)
    default int stamAmount() {
        return "  ".length();
    }

    @ConfigItem(keyName = "activity", name = "Activity", description = "What activity are you doing?", position = 0)
    default a botActivity() {
        return a.EXCHANGE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(keyName = "useStaminas", name = "Use Stamina Potions", description = "Do you want to use stamina potions?", position = 1)
    default boolean useStaminas() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "pickHerbs", name = "Pick up herbs instead", description = "Do you want to pick up herbs?", position = 3, hidden = true, unhide = "activity", unhideValue = "MINIGAME")
    default boolean pickHerbs() {
        return ((95 ^ 127) ^ (61 ^ 51)) & (((89 ^ 26) ^ (39 ^ 74)) ^ (-" ".length()));
    }
}
