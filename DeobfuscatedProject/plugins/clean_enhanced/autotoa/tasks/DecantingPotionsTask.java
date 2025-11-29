/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Decanting potions", priority=1000, blocking=true)
public class DecantingPotionsTask extends AutotoaManager {

    private static final String VIAL_NAME = "Vial";
    private static final String DROP_ACTION = "Drop";
    private static final String DRINK_ACTION = "Drink";
    private static final String OPEN_PAREN_REGEX = "\\(";
    private static final String CLOSE_PAREN_REGEX = "\\)";
    private static final String DOSE_4_TEXT = "4";
    private static final String OPEN_PAREN = "(";

    @Inject
    protected DecantingPotionsTask(Client client) {
        super(client);
    }

    @Override
    public boolean run() {
        // Drop empty vials first
        Item vial = Inventory.getFirst(VIAL_NAME);
        if (vial != null) {
            vial.interact(DROP_ACTION);
            return true;
        }

        // Find all unique potion types that have drinkable doses (not full 4-dose)
        Set<String> potionTypes = Inventory.getAll(item -> item.getName().contains(OPEN_PAREN))
            .stream()
            .filter(item -> item.hasAction(DRINK_ACTION))
            .map(item -> item.getName().split(OPEN_PAREN_REGEX)[1].trim())
            .collect(Collectors.toSet());

        // Try to combine each potion type
        for (String potionType : potionTypes) {
            if (combinePotion(potionType)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Attempts to combine partial doses of a potion into full doses
     * @param potionType The type of potion (e.g. "1)" from "Super attack(1)")
     * @return true if potions were combined
     */
    private boolean combinePotion(String potionType) {
        // Get all potions of this type that aren't already 4-dose
        List<Item> potions = Inventory.getAll(item -> {
            if (GameEnum12.getItemById(item.getId()) == null
                && item.getName().contains(potionType)
                && !item.getName().contains(DOSE_4_TEXT)) {
                return true;
            }
            return false;
        });

        // Need at least 2 potions to combine
        if (potions.size() <= 1) {
            return false;
        }

        // Find the potion with the lowest dose count
        Item lowestDosePotion = potions.stream()
            .min(Comparator.comparingInt(item -> getPotionDoseCount(item.getName())))
            .orElse(null);

        // Find the potion with the highest dose count (excluding the lowest)
        Item highestDosePotion = potions.stream()
            .filter(item -> item != lowestDosePotion)
            .max(Comparator.comparingInt(item -> getPotionDoseCount(item.getName())))
            .orElse(null);

        if (highestDosePotion == null) {
            return false;
        }

        // Use the highest dose potion on the lowest to combine them
        highestDosePotion.useOn(lowestDosePotion);
        return true;
    }

    /**
     * Parses the dose count from a potion name like "Super attack(3)"
     * @param potionName The potion item name
     * @return The number of doses (1-4)
     */
    private int getPotionDoseCount(String potionName) {
        // Split on "(" and ")" to extract the dose number
        return Integer.parseInt(potionName.split(OPEN_PAREN_REGEX)[1].split(CLOSE_PAREN_REGEX)[0]);
    }
}
