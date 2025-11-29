/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.minigames;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.a;

@ConfigGroup(value="squireSorcGarden")
public interface SquireSorceressGardenConfig
extends Config {
    @ConfigItem(keyName="breakDownHerbs", name="Full Herb Infobox", description="Do you want to see all herbs per hour?", position=4, hidden=true, unhide="pickHerbs")
    default public boolean breakDownHerbs() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="stamAmount", name="Amount of Stamina Potions", description="how many?", position=2)
    default public int stamAmount() {
        return "  ".length();
    }

    @ConfigItem(keyName="activity", name="Activity", description="What activity are you doing?", position=0)
    default public a botActivity() {
        return a.EXCHANGE;
    }

    @ConfigItem(keyName="useStaminas", name="Use Stamina Potions", description="Do you want to use stamina potions?", position=1)
    default public boolean useStaminas() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="pickHerbs", name="Pick up herbs instead", description="Do you want to pick up herbs?", position=3, hidden=true, unhide="activity", unhideValue="MINIGAME")
    default public boolean pickHerbs() {
        return ((0x5F ^ 0x7F ^ (0x3D ^ 0x33)) & (0x59 ^ 0x1A ^ (0x27 ^ 0x4A) ^ -" ".length())) != 0;
    }
}

