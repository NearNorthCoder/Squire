package gg.squire.mta;

import m.u.a.p000.e.s.q.t.i.r.h;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squiremta")
/* loaded from: squire-mta-0.2.1.jar:gg/squire/mta/MagicArenaConfig.class */
public interface MagicArenaConfig extends Config {
    @ConfigSection(name = "Alchemy room settings", description = "Settings related to the alchemy room", position = 1)
    public static final /* synthetic */ String Alchemy_room_settings = "Alchemy room settings";
    @ConfigSection(name = "Enchantment room Settings", description = "Settings related to the enchantment room", position = 0)
    public static final /* synthetic */ String Enchantment_room_settings = "Enchantment room settings";
    @ConfigSection(name = "Telekinetic room settings", description = "Settings related to the Telekinetic room", position = 3)
    public static final /* synthetic */ String Telekinetic_room_settings = "Telekinetic room settings";
    @ConfigSection(name = "Graveyard room settings", description = "Settings related to the graveyard room", position = 2)
    public static final /* synthetic */ String Graveyard_room_settings = "Graveyard room settings";

    @ConfigItem(keyName = "Telekinetic points", description = "minimum Telekinetic points", name = "Telekinetic points", section = "Telekinetic room settings")
    @Range(min = 0, max = 8000)
    default int telekineticPoints() {
        return (-20506) & 24505;
    }

    @ConfigItem(keyName = "Graveyard points", description = "minimum graveyard points", name = "Graveyard points", section = "Graveyard room settings")
    @Range(min = 0, max = 8000)
    default int graveyardPoints() {
        return (-(187 ^ 166)) & (-12292) & 16319;
    }

    @ConfigItem(keyName = "Alchemy points", description = "minimum alchemy points", name = "Alchemy points", section = "Alchemy room settings")
    @Range(min = 0, max = 8000)
    default int alchemyPoints() {
        return (-(((107 + 51) - (-7)) + 9)) & (-16403) & 24575;
    }

    @ConfigItem(keyName = "Enchantment level", description = "maximum enchantment level", name = "Enchant", section = "Enchantment room settings")
    default h maximumEnchant() {
        return h.LVL1_ENCHANT;
    }

    @ConfigItem(keyName = "Enchantment points", description = "minimum enchantment poinys", name = "Enchant points", section = "Enchantment room settings")
    @Range(min = 0, max = 16000)
    default int enchantmentPoints() {
        return (-((-14850) & 31575)) & (-33) & 32757;
    }
}
