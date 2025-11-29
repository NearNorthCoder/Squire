/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Units
 */
package gg.squire.minigames;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Units;

@ConfigGroup(value="squirebf")
public interface SquireBlastFurnaceConfig
extends Config {
    public static final  String GROUP;
    @ConfigSection(name="Supplies Settings", description="Settings related to supplies", position=0)
    public static final  String SUPPLIES;

    static {
        SUPPLIES = "Supplies Settings";
        GROUP = "squirebf";
    }

    @ConfigItem(position=3, keyName="hybridBarType", name="Hybrid bar", description="What type of other metal (not gold) do you want to make?", section="Supplies Settings", hidden=true, unhide="hybridMode")
    default public c hybridChoice() {
        return c.MITHRIL;
    }

    @ConfigItem(position=11, keyName="requireStaminaThreshold", name="Low energy threshold", description="Run energy will be kept above this value. 0 - 50% recommended.", section="Supplies Settings")
    @Units(value="%")
    default public int requireStaminaThreshold() {
        return 3 ^ 0x1D;
    }

    @ConfigItem(position=1, keyName="barType", name="Bar", description="What type of bar do you want to make?", section="Supplies Settings")
    default public c barChoice() {
        return c.GOLD;
    }

    @ConfigItem(position=10, keyName="useStams", name="Use Staminas", description="Do you want to use staminas?", section="Supplies Settings")
    default public boolean useStams() {
        return 1 != 0;
    }

    @ConfigItem(position=2, keyName="hybridMode", name="Hybrid mode", description="Turn on hybrid mode for making another metal bar with your gold bar runs?", section="Supplies Settings", hidden=true, unhide="barType", unhideValue="GOLD")
    default public boolean hybrid() {
        return ((0xAC ^ 0xC7 ^ (0x6D ^ 0x55)) & (0x30 ^ 0x47 ^ (0x69 ^ 0x4D) ^ -1)) != 0;
    }

    @ConfigItem(position=5, keyName="addCoalBuffer", name="Add coal buffer", description="Ensure there is always more coal than needed in the furnace. This avoids stalls while bars are created.")
    default public boolean addCoalBuffer() {
        return ((6 + 169 - 21 + 42 ^ 115 + 96 - 210 + 128) & (0xF9 ^ 0xA5 ^ (0x57 ^ 0x4E) ^ -1)) != 0;
    }
}

