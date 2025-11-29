/*
 * Decompiled with CFR 0.152.
 *
 * Poison/Venom Curing Task
 *
 * This task handles drinking antidote potions during TOA raids.
 * It cures poison/venom when:
 * - Not paused and not currently in combat
 * - Player is poisoned or venomed
 * - Not standing on a venom/poison tile
 * - Has antidote potion in inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Curing Poison/Venom")
public class CuringPoisonvenomTask extends AutotoaManager {

    private final SquireAutoTOA plugin;
    private final C consumableManager;

    @Inject
    protected CuringPoisonvenomTask(Client client, SquireAutoTOA plugin, C consumableManager) {
        super(client);
        this.plugin = plugin;
        this.consumableManager = consumableManager;
    }

    @Override
    public boolean run() {
        // Don't cure if paused or currently in combat
        if (this.plugin.e() || bc()) {
            return false;
        }

        // Only cure if actually poisoned or venomed
        if (!Combat.isPoisoned() && !Combat.isVenomed()) {
            return false;
        }

        // Don't cure if standing on venom/poison tile
        // (will get re-poisoned immediately)
        boolean onVenomTile = TileObjects.getAll(tileObject -> {
            String name = tileObject.getName().toLowerCase();
            return name.contains("venom") || name.contains("poison");
        }).stream().anyMatch(tileObject ->
            tileObject.getWorldLocation().equals(Players.getLocal().getWorldLocation())
        );

        if (onVenomTile) {
            return false;
        }

        // Find antidote potion (but not anti-venom)
        Item antidote = Inventory.getFirst(item -> {
            String name = item.getName();
            boolean isAnti = name.contains("Anti");
            boolean isDote = name.contains("dote");
            boolean isVenom = name.contains("venom");

            // Must contain "Anti" and "dote" but NOT "venom"
            // (antidote++ is fine, antivenom is not)
            return isAnti && isDote && !isVenom;
        });

        // No antidote found
        if (antidote == null) {
            return false;
        }

        // Drink the antidote
        antidote.interact("Drink");
        return false; // Return false to allow other tasks to run
    }
}
