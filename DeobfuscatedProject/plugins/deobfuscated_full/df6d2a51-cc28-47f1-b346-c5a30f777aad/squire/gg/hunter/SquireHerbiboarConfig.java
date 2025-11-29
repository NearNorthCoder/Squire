/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package squire.gg.hunter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.e;

@ConfigGroup(value="sqherbiboar")
public interface SquireHerbiboarConfig
extends Config {
    @ConfigItem(position=13, keyName="rest.qty", name="Amount Of Restores", description="Amount Of Restores to bring")
    default public int quantity() {
        return 0xF ^ 0xA;
    }

    @ConfigItem(position=10, keyName="sack", name="Use Herb sack", description="Make use of the herb sack")
    default public boolean useHerbSack() {
        return false;
    }

    @ConfigItem(position=12, keyName="restore", name="Energy Restoration", description="Use potions to restore energy")
    default public e useEnergyRestoration() {
        return e.STAMINA;
    }
}

