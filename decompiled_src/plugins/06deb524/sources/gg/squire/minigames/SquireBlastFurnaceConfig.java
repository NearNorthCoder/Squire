package gg.squire.minigames;

import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.EnumC0002c;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Units;
@ConfigGroup("squirebf")
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:gg/squire/minigames/SquireBlastFurnaceConfig.class */
public interface SquireBlastFurnaceConfig extends Config {
    @ConfigSection(name = "Supplies Settings", description = "Settings related to supplies", position = 0)
    public static final /* synthetic */ String SUPPLIES = "Supplies Settings";
    public static final /* synthetic */ String GROUP = "squirebf";

    @ConfigItem(position = 3, keyName = "hybridBarType", name = "Hybrid bar", description = "What type of other metal (not gold) do you want to make?", section = "Supplies Settings", hidden = true, unhide = "hybridMode")
    default EnumC0002c hybridChoice() {
        return EnumC0002c.MITHRIL;
    }

    @ConfigItem(position = 11, keyName = "requireStaminaThreshold", name = "Low energy threshold", description = "Run energy will be kept above this value. 0 - 50% recommended.", section = "Supplies Settings")
    @Units("%")
    default int requireStaminaThreshold() {
        return 3 ^ 29;
    }

    @ConfigItem(position = 1, keyName = "barType", name = "Bar", description = "What type of bar do you want to make?", section = "Supplies Settings")
    default EnumC0002c barChoice() {
        return EnumC0002c.GOLD;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 10, keyName = "useStams", name = "Use Staminas", description = "Do you want to use staminas?", section = "Supplies Settings")
    default boolean useStams() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 2, keyName = "hybridMode", name = "Hybrid mode", description = "Turn on hybrid mode for making another metal bar with your gold bar runs?", section = "Supplies Settings", hidden = true, unhide = "barType", unhideValue = "GOLD")
    default boolean hybrid() {
        return ((172 ^ 199) ^ (109 ^ 85)) & (((48 ^ 71) ^ (105 ^ 77)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 5, keyName = "addCoalBuffer", name = "Add coal buffer", description = "Ensure there is always more coal than needed in the furnace. This avoids stalls while bars are created.")
    default boolean addCoalBuffer() {
        return ((((6 + 169) - 21) + 42) ^ (((115 + 96) - 210) + 128)) & (((249 ^ 165) ^ (87 ^ 78)) ^ (-" ".length()));
    }
}
