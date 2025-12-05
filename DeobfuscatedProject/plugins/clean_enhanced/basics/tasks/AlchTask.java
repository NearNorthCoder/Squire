/*
 * Deobfuscated with CFR 0.152.
 *
 * Alchemy Task
 * Task implementation for casting high/low alchemy on inventory items.
 *
 * Original obfuscated class: aS
 * Package: i.i.b.s.c.q.r.s.s.-.u.a.e
 */
package gg.squire.basics.tasks;

import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.basics.magic.stunalchtp.StunAlchTeleport;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;

import javax.inject.Inject;

/**
 * Task that automatically casts alchemy spells on inventory items.
 * Uses High Level Alchemy if magic level is 55+, otherwise Low Level Alchemy.
 * Priority 2 ensures it runs after stunning but before teleporting.
 */
@TaskDesc(name = "Alching", priority = 2)
public class AlchTask extends Task {

    // Constants
    private static final int NOT_ANIMATING = -1;
    private static final int HIGH_ALCH_LEVEL = 55;
    private static final int INVENTORY_SLOT_ALCHS = 27; // Last inventory slot

    private final StunAlchTeleport plugin;
    private final SquireAlchTeleportConfig config;

    /**
     * Constructs a new AlchTask.
     *
     * @param plugin the parent plugin
     * @param config the plugin configuration
     */
    @Inject
    public AlchTask(StunAlchTeleport plugin, SquireAlchTeleportConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    /**
     * Executes the alchemy task.
     * Finds an appropriate item and casts high or low alchemy on it.
     *
     * @return true if the task should continue running, false otherwise
     */
    @Override
    public boolean run() {
        // Don't alch if not ready to teleport or in stun-only mode
        if (!plugin.shouldTeleport() && !config.stunAlchOnly()) {
            return false;
        }

        // Wait if player is currently animating (unless in teleport-alch only mode)
        if (config.stunAlchOnly() && Players.getLocal().getAnimation() != NOT_ANIMATING) {
            return false;
        }

        // Find first noted item to alch
        Item targetItem = Inventory.getFirst(Item::isNoted);

        // If no noted items, find any item that's not in the last slot
        if (targetItem == null) {
            targetItem = Inventory.getFirst(item -> item.getSlot() != INVENTORY_SLOT_ALCHS);
        }

        // No valid items to alch
        if (targetItem == null) {
            return false;
        }

        // Determine which alchemy spell to use based on magic level
        SpellBook.Standard alchSpell;
        if (Skills.getLevel(Skill.MAGIC) >= HIGH_ALCH_LEVEL) {
            alchSpell = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        } else {
            alchSpell = SpellBook.Standard.LOW_LEVEL_ALCHEMY;
        }

        // Cast the alchemy spell on the target item
        Magic.cast(alchSpell, targetItem);

        return true;
    }
}
