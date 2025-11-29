/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.woodcutting;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a;

@ConfigGroup(value="squirewcg")
public interface SquireWoodcutterConfig
extends Config {
    @ConfigItem(position=4, keyName="fasterTickChopping", name="1.5t Chopping", description="Should we 1.5t chop the logs? (Only Fossil Island)", disabledBy="tickChopping", hidden=true, unhide="treeToChop", unhideValue="TEAK||MAHOGANY")
    default public boolean fastTickChop() {
        return ((187 + 171 - 356 + 234 ^ 102 + 1 - 0 + 60) & (0x24 ^ 0x57 ^ (0x26 ^ 0x1A) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=1, keyName="treeToChop", name="Tree", description="Tree to chop")
    default public a tree() {
        return a.TEAK;
    }

    @ConfigItem(position=6, keyName="banking", name="Enable banking", description="Will drop logs if disabled", disabledBy="cutLogs")
    default public boolean bank() {
        return " ".length() != 0;
    }

    @ConfigItem(position=13, keyName="pickUpNest", name="Pick up nest", description="Pick up bird nest?")
    default public boolean pickUpNest() {
        return " ".length() != 0;
    }

    @ConfigItem(position=5, keyName="cutLogs", name="Cut logs?", description="Do you want to cut the logs into arrow shafts instead of banking?", disabledBy="banking")
    default public boolean cutLogs() {
        return ((0xEA ^ 0xA4) & ~(0x8F ^ 0xC1)) != 0;
    }

    @ConfigItem(position=3, keyName="tickChopping", name="3t Chopping", description="Should we 3 tick chop the logs?", disabledBy="fasterTickChopping")
    default public boolean tickChop() {
        return ((0x46 ^ 0x6D) & ~(1 ^ 0x2A)) != 0;
    }
}

