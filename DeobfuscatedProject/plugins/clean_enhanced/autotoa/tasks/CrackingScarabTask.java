/*
 * Deobfuscated TOA Cracking Scarab Task
 * Handles cracking blessed crystal scarabs for prayer restoration
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

/**
 * Task for cracking blessed crystal scarabs to restore prayer points.
 *
 * Scarabs are cracked when:
 * - At least 28 ticks have passed since last crack
 * - Prayer has been drained by at least 10 points
 * - A blessed crystal scarab is available in inventory
 */
@TaskDesc(name="Cracking scarab", priority=50)
public class CrackingScarabTask extends KephriManager {
    // Constants
    private static final int TICK_COOLDOWN = 28;
    private static final int MIN_PRAYER_DRAINED = 10;
    private static final String CRACK_ACTION = "Crack";

    // Dependencies
    private final ConsumableManager consumableManager;
    private final SquireAutoTOA plugin;

    // State
    private int lastCrackTick;

    @Inject
    protected CrackingScarabTask(Client client, ConsumableManager consumableManager, SquireAutoTOA plugin) {
        super(client);
        this.consumableManager = consumableManager;
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // Check if enough ticks have passed since last crack
        int ticksSinceLastCrack = this.client.getTickCount() - this.lastCrackTick;
        if (ticksSinceLastCrack < TICK_COOLDOWN) {
            return false;
        }

        // Check if prayer has been drained enough
        int prayerDrained = Skills.getLevel(Skill.PRAYER) - Skills.getBoostedLevel(Skill.PRAYER);
        if (prayerDrained < MIN_PRAYER_DRAINED) {
            return false;
        }

        // Find blessed crystal scarab in inventory
        Item scarab = Inventory.getFirst(item ->
            TOAItemType.BLESSED_CRYSTAL_SCARAB.hasItemId(item.getId())
        );

        if (scarab == null) {
            return false;
        }

        // Crack the scarab
        scarab.interact(CRACK_ACTION);
        this.lastCrackTick = this.client.getTickCount();
        return true;
    }
}
