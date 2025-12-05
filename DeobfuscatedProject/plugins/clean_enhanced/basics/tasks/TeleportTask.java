/*
 * Deobfuscated with CFR 0.152.
 *
 * Teleport Task
 * Task implementation for casting teleportation spells.
 *
 * Original obfuscated class: aU
 * Package: i.i.b.s.c.q.r.s.s.-.u.a.e
 */
package gg.squire.basics.tasks;

import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.basics.magic.stunalchtp.StunAlchTeleport;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;

import javax.inject.Inject;
import java.util.Iterator;
import java.util.List;

/**
 * Task that automatically casts teleportation spells.
 * Used in the stun-alch-teleport training method.
 */
@TaskDesc(name = "Teleporting")
public class TeleportTask extends Task {

    // Animation IDs for teleport animations
    private static final int ANIMATION_STANDARD_TELEPORT = 8939;  // Standard spellbook teleport
    private static final int ANIMATION_ANCIENT_TELEPORT = 9606;   // Ancient spellbook teleport

    // Tick delay after teleporting
    private static final int TICK_DELAY_AFTER_TELEPORT = 2;

    /**
     * Global tick counter for the last teleport cast.
     * Used to prevent casting teleports too frequently.
     */
    public static int lastTeleportTick;

    static {
        lastTeleportTick = Static.getClient().getTickCount();
    }

    private final StunAlchTeleport plugin;
    private final SquireAlchTeleportConfig config;

    /**
     * Teleport spells used in stun-alch-teleport mode (with stunning).
     */
    private final List<Spell> stunTeleports = List.of(
        SpellBook.Standard.ARDOUGNE_TELEPORT,
        SpellBook.Standard.FALADOR_TELEPORT
    );

    /**
     * Teleport spells used in teleport-alch only mode (no stunning).
     */
    private final List<Spell> alchTeleports = List.of(
        SpellBook.Standard.CAMELOT_TELEPORT,
        SpellBook.Standard.FALADOR_TELEPORT,
        SpellBook.Standard.LUMBRIDGE_TELEPORT,
        SpellBook.Standard.VARROCK_TELEPORT
    );

    /**
     * Constructs a new TeleportTask.
     *
     * @param plugin the parent plugin
     * @param config the plugin configuration
     */
    @Inject
    public TeleportTask(StunAlchTeleport plugin, SquireAlchTeleportConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    /**
     * Executes the teleport task.
     * Casts an available teleport spell if conditions are met.
     *
     * @return true if the task should continue running, false otherwise
     */
    @Override
    public boolean run() {
        Player localPlayer = Players.getLocal();

        // Don't teleport if player is already teleporting or in teleport-alch only mode without stunning done
        if (localPlayer.getAnimation() != ANIMATION_STANDARD_TELEPORT &&
            localPlayer.getAnimation() != ANIMATION_ANCIENT_TELEPORT &&
            !config.stunAlchOnly()) {
            return false;
        }

        // Reset teleport flag after casting
        if (plugin.shouldTeleport()) {
            plugin.setShouldTeleport(false);
        }

        // Check if enough ticks have passed since last teleport
        int currentTick = Static.getClient().getTickCount();
        if (lastTeleportTick - currentTick >= 0) {
            return false;
        }

        // Select which teleport list to use based on configuration
        List<Spell> availableTeleports;
        if (config.stunAlchOnly()) {
            availableTeleports = alchTeleports;
        } else {
            availableTeleports = stunTeleports;
        }

        // Find the first teleport we can cast
        Spell teleportSpell = null;
        for (Spell spell : availableTeleports) {
            if (Magic.canCast(spell)) {
                teleportSpell = spell;
                break;
            }
        }

        // No castable teleport available
        if (teleportSpell == null) {
            return false;
        }

        // Cast the teleport spell
        Magic.cast(teleportSpell);

        // Update last teleport tick
        lastTeleportTick = Static.getClient().getTickCount() + TICK_DELAY_AFTER_TELEPORT;

        return true;
    }
}
