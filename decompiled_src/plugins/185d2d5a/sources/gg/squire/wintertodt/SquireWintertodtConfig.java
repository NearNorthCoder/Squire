package gg.squire.wintertodt;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.a;
@ConfigGroup("squirewintertodt")
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:gg/squire/wintertodt/SquireWintertodtConfig.class */
public interface SquireWintertodtConfig extends Config {
    @ConfigItem(position = 4, keyName = "specDaxe", name = "Use dragon axe spec", hidden = true, unhide = "axe", unhideValue = "DRAGON", description = "Use the dragon axe special for a woodcutting boost")
    default boolean spec() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 7, keyName = "foodAmount", name = "How many potions", description = "How many pots to make when we are out?")
    @Range(min = 1, max = 5)
    default int foodAmount() {
        return 188 ^ 184;
    }

    @ConfigItem(position = 2, keyName = "side", name = "Wintertodt Game Side", description = "What side to primarily focus on during game")
    default a side() {
        return a.EAST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 4, keyName = "fletch", name = "Fletch", description = "Should we fletch an inventory for the points?")
    default boolean fletch() {
        return ((206 ^ 176) ^ (94 ^ 110)) & (((49 ^ 79) ^ (107 ^ 91)) ^ (-" ".length()));
    }
}
