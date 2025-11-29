package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

/**
 * Task for claiming supplies from the Helpful Spirit NPC at start of TOA.
 *
 * This task:
 * - Finds the Helpful Spirit NPC
 * - Manages inventory space by eating/dropping
 * - Selects supply options from interface
 * - Prioritizes ambrosia/adrenaline based on config
 * - Handles dehydration invocation
 */
@TaskDesc(name = "Claiming supplies", priority = 50, blocking = true)
public class ClaimingSuppliesTask extends AutotoaManager {
    private static final int SUPPLY_INTERFACE_GROUP = 4883;
    private static final int[] SUPPLY_WIDGET_IDS = {28, 9, 12}; // Widget child IDs for supplies

    private boolean hasClaimedSupplies;
    private final SupplyManager supplyManager;
    private final EquipmentManager equipmentManager;

    @Inject
    protected TOAConfig config;

    @Inject
    protected RaidStateManager stateManager;

    @Inject
    protected ClaimingSuppliesTask(Client client, RaidStateManager stateManager, SupplyManager supplyManager) {
        super(client);
        this.hasClaimedSupplies = false;
        this.stateManager = stateManager;
        this.supplyManager = supplyManager;
    }

    @Override
    public boolean run() {
        // Don't claim if already done
        if (!validate()) {
            this.hasClaimedSupplies = false;
            return false;
        }

        // Find Helpful Spirit NPC
        NPC helpfulSpirit = NPCs.getNearest("Helpful Spirit");
        if (helpfulSpirit == null) {
            return false;
        }

        // Already claimed
        if (this.hasClaimedSupplies) {
            return false;
        }

        // Make inventory space if needed
        if (Inventory.isFull()) {
            // Try switching to Akkha melee gear (might free space)
            if (equipmentManager.equipGear(equipmentManager.getGearSetup(config.meleeGearAkkha()))) {
                return true;
            }

            // Eat food to make space
            Item food = Inventory.getFirst(item -> item.hasAction("Eat"::equals));
            if (food != null) {
                food.interact("Eat");
                return true;
            }

            // Drop an item
            dropItemForSpace();
            return true;
        }

        // Determine which supply to take
        boolean takeAmbrosia;
        if (!supplyManager.getSelectedSupplies().containsKey(SupplyType.LIQUID_ADRENALINE) ||
            Inventory.contains(item -> SupplyType.LIQUID_ADRENALINE.matchesId(item.getId()))) {
            takeAmbrosia = true;
        } else {
            takeAmbrosia = false;
        }

        // Skip if dehydration invocation active
        if (config.dehydration()) {
            takeAmbrosia = false;
        }

        // Check if supply selection widget is visible
        Widget supplyWidget = Widgets.get(SUPPLY_INTERFACE_GROUP, SUPPLY_WIDGET_IDS[0]);
        if (Widgets.isVisible(supplyWidget)) {
            // Select the appropriate supply option
            int widgetId = takeAmbrosia ? SUPPLY_WIDGET_IDS[0] : SUPPLY_WIDGET_IDS[2];

            Widget optionWidget = Widgets.get(SUPPLY_INTERFACE_GROUP, widgetId);
            optionWidget.interact("Choose");

            // Record the selection
            supplyManager.recordSupplySelection(Widgets.get(SUPPLY_INTERFACE_GROUP, widgetId - 2));

            this.hasClaimedSupplies = true;
            return true;
        }

        // Open the supply interface
        helpfulSpirit.interact("Claim");
        return true;
    }
}
