package gg.squire.basics.magic.teleporter;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.aW;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squireteleporterconfig")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/magic/teleporter/SquireTeleporterConfig.class */
public interface SquireTeleporterConfig extends Config {
    @ConfigItem(keyName = "teleport", name = "Teleport", description = "Which teleport to cast", position = 1)
    default aW teleport() {
        return aW.PROGRESSIVE;
    }
}
