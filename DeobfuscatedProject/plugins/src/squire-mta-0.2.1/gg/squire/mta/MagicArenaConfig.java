/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.mta;

import m.u.a.-.e.s.q.t.i.r.h;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiremta")
public interface MagicArenaConfig
extends Config {
    @ConfigSection(name="Alchemy room settings", description="Settings related to the alchemy room", position=1)
    public static final /* synthetic */ String Alchemy_room_settings;
    @ConfigSection(name="Enchantment room Settings", description="Settings related to the enchantment room", position=0)
    public static final /* synthetic */ String Enchantment_room_settings;
    @ConfigSection(name="Graveyard room settings", description="Settings related to the graveyard room", position=2)
    public static final /* synthetic */ String Graveyard_room_settings;
    @ConfigSection(name="Telekinetic room settings", description="Settings related to the Telekinetic room", position=3)
    public static final /* synthetic */ String Telekinetic_room_settings;

    @ConfigItem(keyName="Telekinetic points", description="minimum Telekinetic points", name="Telekinetic points", section="Telekinetic room settings")
    @Range(min=0, max=8000)
    default public int telekineticPoints() {
        return 0xFFFFAFE6 & 0x5FB9;
    }

    @Range(min=0, max=8000)
    @ConfigItem(keyName="Graveyard points", description="minimum graveyard points", name="Graveyard points", section="Graveyard room settings")
    default public int graveyardPoints() {
        return -(0xBB ^ 0xA6) & (0xFFFFCFFC & 0x3FBF);
    }

    @ConfigItem(keyName="Alchemy points", description="minimum alchemy points", name="Alchemy points", section="Alchemy room settings")
    @Range(min=0, max=8000)
    default public int alchemyPoints() {
        return -(107 + 51 - -7 + 9) & (0xFFFFBFED & 0x5FFF);
    }

    @ConfigItem(keyName="Enchantment level", description="maximum enchantment level", name="Enchant", section="Enchantment room settings")
    default public h maximumEnchant() {
        return h.LVL1_ENCHANT;
    }

    @ConfigItem(keyName="Enchantment points", description="minimum enchantment poinys", name="Enchant points", section="Enchantment room settings")
    @Range(min=0, max=16000)
    default public int enchantmentPoints() {
        return -(0xFFFFC5FE & 0x7B57) & (0xFFFFFFDF & 0x7FF5);
    }

    static {
        Alchemy_room_settings = "Alchemy room settings";
        Enchantment_room_settings = "Enchantment room settings";
        Telekinetic_room_settings = "Telekinetic room settings";
        Graveyard_room_settings = "Graveyard room settings";
    }
}

