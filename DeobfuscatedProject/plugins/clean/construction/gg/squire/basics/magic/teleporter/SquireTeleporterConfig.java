/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.magic.teleporter;

import i.i.b.s.c.q.r.s.s.-.u.a.e.aW;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squireteleporterconfig")
public interface SquireTeleporterConfig
extends Config {
    @ConfigItem(keyName="teleport", name="Teleport", description="Which teleport to cast", position=1)
    default public aW teleport() {
        return aW.PROGRESSIVE;
    }
}

