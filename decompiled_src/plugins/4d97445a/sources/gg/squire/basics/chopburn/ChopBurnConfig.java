package gg.squire.basics.chopburn;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.D;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squirechopburn")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/chopburn/ChopBurnConfig.class */
public interface ChopBurnConfig extends Config {
    @ConfigItem(position = 0, keyName = "tree", name = "Tree Type", description = "What type of tree to cut and burn")
    default D tree() {
        return D.OAK;
    }
}
