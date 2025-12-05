/*
 * Deobfuscated with CFR 0.152.
 *
 * Stun Task
 * Task implementation for casting stun spells on NPCs.
 *
 * Original obfuscated class: aT
 * Package: i.i.b.s.c.q.r.s.s.-.u.a.e
 */
package gg.squire.basics.tasks;

import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.basics.magic.stunalchtp.StunAlchTeleport;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

import javax.inject.Inject;
import java.util.List;

/**
 * Task that automatically casts stun spells on NPCs.
 * Cycles through various debuff spells (Stun, Enfeeble, Vulnerability, etc.)
 * based on what the player can cast. Priority 3 ensures it runs first.
 */
@TaskDesc(name = "Stunning", priority = 3, register = true)
public class StunTask extends Task {

    // Constants
    private static final int NOT_ANIMATING = -1;
    private static final int SLEEP_AFTER_CAST_MS = 1;

    // XP values for each spell to detect successful casts
    private static final int XP_STUN = 180;
    private static final int XP_ENFEEBLE = 83;
    private static final int XP_VULNERABILITY = 76;
    private static final int XP_CURSE = 29;
    private static final int XP_WEAKEN = 21;
    private static final int XP_CONFUSE = 13;

    // NPC names
    private static final String NPC_NAME_GUARD = "Guard";
    private static final String NPC_NAME_KOLODION = "Kolodion";

    private final StunAlchTeleport plugin;
    private final SquireAlchTeleportConfig config;

    /**
     * List of stun/debuff spells to cycle through, ordered by preference.
     */
    private final List<Spell> stunSpells = List.of(
        SpellBook.Standard.STUN,
        SpellBook.Standard.ENFEEBLE,
        SpellBook.Standard.VULNERABILITY,
        SpellBook.Standard.CURSE,
        SpellBook.Standard.WEAKEN,
        SpellBook.Standard.CONFUSE
    );

    /**
     * List of XP values corresponding to each spell for detection.
     */
    private final List<Integer> spellXpValues = List.of(
        XP_STUN,
        XP_ENFEEBLE,
        XP_VULNERABILITY,
        XP_CURSE,
        XP_WEAKEN,
        XP_CONFUSE
    );

    /**
     * Constructs a new StunTask.
     *
     * @param plugin the parent plugin
     * @param config the plugin configuration
     */
    @Inject
    public StunTask(StunAlchTeleport plugin, SquireAlchTeleportConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    /**
     * Executes the stunning task.
     * Finds a valid NPC target and casts the best available stun spell.
     *
     * @return true if the task should continue running, false otherwise
     */
    @Override
    public boolean run() {
        Player localPlayer = Players.getLocal();

        // Don't stun if in teleport-alch only mode
        if (config.stunAlchOnly()) {
            return false;
        }

        // Wait if player is currently animating
        if (localPlayer.getAnimation() == NOT_ANIMATING) {
            return false;
        }

        // Don't stun if we're ready to teleport
        if (plugin.shouldTeleport()) {
            return false;
        }

        // Find guards interacting with the player
        NPC targetNPC = NPCs.getNearest(npc ->
            npc.getName().equals(NPC_NAME_KOLODION) &&
            npc.getInteracting() == localPlayer
        );

        // If no guard attacking us, find any idle guard
        if (targetNPC == null) {
            targetNPC = NPCs.getNearest(npc ->
                npc.getName().equals(NPC_NAME_GUARD) &&
                npc.getInteracting() == null
            );
        }

        // No valid target found
        if (targetNPC == null) {
            return false;
        }

        // Find the first spell we can cast
        Spell spellToCast = null;
        for (Spell spell : stunSpells) {
            if (spell.canCast()) {
                spellToCast = spell;
                break;
            }
        }

        // No castable spell available
        if (spellToCast == null) {
            return false;
        }

        // Cast the spell on the target
        spellToCast.castOn(targetNPC);
        sleep(SLEEP_AFTER_CAST_MS);

        return true;
    }

    /**
     * Listens for magic XP changes to detect successful spell casts.
     * When XP matches one of our stun spell values, marks that we're ready to teleport.
     *
     * @param event the stat changed event
     */
    @Subscribe
    public void onStatChanged(StatChanged event) {
        // Only care about magic XP changes
        if (event.getSkill() != Skill.MAGIC) {
            return;
        }

        int previousXp = plugin.getStartingMagicXp();
        int currentXp = event.getXp();
        plugin.setStartingMagicXp(currentXp);

        int xpGained = currentXp - previousXp;

        // No XP gained
        if (xpGained == 0) {
            return;
        }

        // Check if XP matches one of our spell values
        if (spellXpValues.contains(xpGained)) {
            plugin.setShouldTeleport(true);
        }
    }
}
