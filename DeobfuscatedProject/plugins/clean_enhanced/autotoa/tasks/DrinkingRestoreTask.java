/*
 * Decompiled with CFR 0.152.
 *
 * Restore Potion Drinking Task
 *
 * This task handles drinking restore/sanfew potions during TOA raids.
 * It drinks restore potions when:
 * - Prayer points are below threshold (60)
 * - Combat stats (Strength, Magic, Ranged) are drained below base level
 * - Not during Kephri attack phase (when Attack NPC is present)
 * - Either in safe phase or HP is full
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking restore", priority=85)
public class DrinkingRestoreTask extends KephriManager {

    // Constants
    private static final int PRAYER_THRESHOLD = 60;
    private static final int TOA_VARBIT = 11460; // 0x2CC4

    private final ConsumableManager consumableManager;

    @Inject
    protected DrinkingRestoreTask(Client client, ConsumableManager consumableManager) {
        super(client);
        this.consumableManager = consumableManager;
    }

    @Override
    public boolean run() {
        // Check if restore is needed based on prayer level
        boolean needsRestore = Skills.getBoostedLevel(Skill.PRAYER) <= PRAYER_THRESHOLD;

        // Check if any combat stats are drained
        Skill[] combatSkills = {Skill.STRENGTH, Skill.MAGIC, Skill.RANGED};
        for (Skill skill : combatSkills) {
            if (Skills.getBoostedLevel(skill) < Skills.getLevel(skill)) {
                needsRestore = true;
                break;
            }
        }

        // Don't restore if nothing needs restoring
        if (!needsRestore) {
            return false;
        }

        // Check if we're in a safe phase (not in Kephri attack phase)
        boolean inSafePhase = true;
        if (getPhaseNumber() > 0) {
            // Don't restore during attack phase if NPC with "Attack" action is present
            if (NPCs.getNearest(npc -> npc.hasAction("Attack")) != null) {
                inSafePhase = false;
            }
        }

        // Only restore if in safe phase
        if (!inSafePhase) {
            return false;
        }

        // Check health conditions
        if (getPhaseNumber() > 0 && getRemainingHealth() <= 0) {
            return false;
        }

        // Check TOA varbit
        if (Vars.getBit(TOA_VARBIT) > 0) {
            return false;
        }

        // Find restore or sanfew potion (but not Tears of Elidinis)
        Item restorePotion = Inventory.getFirst(item -> {
            boolean isTears = TOAItemType.TEARS_OF_ELIDINIS.hasItemId(item.getId());
            boolean isRestore = item.getName().contains("restore");
            boolean isSanfew = item.getName().contains("Sanfew");

            return !isTears && (isRestore || isSanfew);
        });

        // Check if potion found and consumable manager allows usage
        if (restorePotion != null && this.consumableManager.canConsumeItem()) {
            restorePotion.interact("Drink");
            this.consumableManager.recordConsumption();
            return true;
        }

        return false;
    }
}
