/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Mining Plugin
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;

/**
 * Task for casting the Humidify spell on waterskins.
 * The Humidify spell fills empty waterskins, which is useful when mining in the desert.
 * Requires Lunar spellbook and appropriate runes.
 */
@TaskDesc(name="Casting humidify", priority=105, blocking=true)
public class CastingHumidifyTask extends MiningTaskBase {

    @Inject
    protected CastingHumidifyTask(SquireMinerConfig config) {
        super(config);
    }

    @Override
    public boolean t() {
        // Only cast if humidify is enabled in config
        if (!config.humidify()) {
            return false;
        }

        SpellBook.Lunar humidifySpell = SpellBook.Lunar.HUMIDIFY;

        // Check if we can cast the spell (have runes, on lunar spellbook, etc.)
        if (!humidifySpell.canCast()) {
            return false;
        }

        // Don't cast if already animating
        if (Players.getLocal().isAnimating()) {
            return true;
        }

        // Cast the Humidify spell
        Magic.cast(humidifySpell, true, true);
        return true;
    }
}
