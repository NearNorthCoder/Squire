package gg.squire.plugins.charters;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import u.e.a.r.s.h.s.e.h.r.p000.p.p001.q.s.t.i.c.i.r.b;
@ConfigGroup("squirecrafter")
/* loaded from: a162439f-48e7-4aeb-adb7-778d42249168.jar:gg/squire/plugins/charters/SquireCharterConfig.class */
public interface SquireCharterConfig extends Config {
    @ConfigItem(position = 0, keyName = "method", name = "Crafting method", description = "Select which crafting method to do")
    default b method() {
        return b.CHARTER_SHIPS;
    }
}
