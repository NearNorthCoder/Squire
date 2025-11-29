package gg.squire.basics.magic;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.unethicalite.api.magic.SpellBook;
@ConfigGroup("squiremagearena")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/magic/MageArenaOneConfig.class */
public interface MageArenaOneConfig extends Config {
    @ConfigSection(name = "Spell Settings", description = "Settings related to Spells", position = 20)
    public static final /* synthetic */ String spellSettings = "Spell Settings";

    @ConfigItem(position = 22, keyName = "teleportSpell", name = " ", description = "Spell", section = "Spell Settings")
    default SpellBook.Standard spell() {
        return SpellBook.Standard.FLAMES_OF_ZAMORAK;
    }
}
