/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.basics.magic;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.unethicalite.api.magic.SpellBook;

@ConfigGroup(value="squiremagearena")
public interface MageArenaOneConfig
extends Config {
    @ConfigSection(name="Spell Settings", description="Settings related to Spells", position=20)
    public static final  String spellSettings;

    static {
        spellSettings = "Spell Settings";
    }

    @ConfigItem(position=22, keyName="teleportSpell", name=" ", description="Spell", section="Spell Settings")
    default public SpellBook.Standard spell() {
        return SpellBook.Standard.FLAMES_OF_ZAMORAK;
    }
}

