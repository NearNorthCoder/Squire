package gg.squire.giantsfoundry;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.c;
@ConfigGroup("squiregiantsfoundry")
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:gg/squire/giantsfoundry/SquireGiantsConfig.class */
public interface SquireGiantsConfig extends Config {
    @ConfigItem(position = 4, keyName = "secondBarAmount", name = "Secondary bar amount", description = "How many secondary bars should we use?")
    @Range(min = 1, max = 27)
    default int secondaryBarAmount() {
        return (111 ^ 120) ^ (9 ^ 14);
    }

    @ConfigItem(position = 3, keyName = "secondBarType", name = "Secondary bar", description = "What secondary bar should we use?")
    default c secondaryBar() {
        return c.ADAMANT_BAR;
    }

    @ConfigItem(position = 2, keyName = "firstBarAmount", name = "Primary bar amount", description = "How many primary bars should we use?")
    @Range(min = 1, max = 27)
    default int primaryBarAmount() {
        return 10 ^ 6;
    }

    @ConfigItem(position = 1, keyName = "firstBarType", name = "Primary bar", description = "What primary bar should we use?")
    default c primaryBar() {
        return c.STEEL_BAR;
    }
}
