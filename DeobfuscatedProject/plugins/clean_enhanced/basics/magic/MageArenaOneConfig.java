/*
 * Deobfuscated with CFR 0.152.
 *
 * Configuration for the Mage Arena One Plugin
 *
 * Original obfuscated class: MageArenaOneConfig
 * Package: gg.squire.basics.magic
 */
package gg.squire.basics.magic;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.unethicalite.api.magic.SpellBook;

/**
 * Configuration interface for the Mage Arena One plugin.
 * Allows selection of god spell to cast during combat.
 */
@ConfigGroup(value = "squiremagearena")
public interface MageArenaOneConfig extends Config {

    /**
     * Spell settings section identifier.
     */
    String SPELL_SETTINGS_SECTION = "Spell Settings";

    /**
     * Configuration section for spell-related settings.
     */
    @ConfigSection(
        name = "Spell Settings",
        description = "Settings related to Spells",
        position = 20
    )
    String spellSettings = SPELL_SETTINGS_SECTION;

    /**
     * Gets the god spell to cast during combat.
     * Defaults to Flames of Zamorak.
     *
     * @return the selected god spell
     */
    @ConfigItem(
        position = 22,
        keyName = "teleportSpell",
        name = "God Spell",
        description = "The god spell to cast on Kolodion",
        section = SPELL_SETTINGS_SECTION
    )
    default SpellBook.Standard spell() {
        return SpellBook.Standard.FLAMES_OF_ZAMORAK;
    }
}
