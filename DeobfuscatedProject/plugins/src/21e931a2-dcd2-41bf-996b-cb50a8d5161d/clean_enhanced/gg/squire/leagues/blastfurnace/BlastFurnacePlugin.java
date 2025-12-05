package gg.squire.leagues.blastfurnace;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.leagues.common.LeaguesConstants;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Production;

/**
 * Leagues utility plugin for automated gold bar smelting at the Blast Furnace.
 *
 * This plugin automates the gold smelting process at the Blast Furnace by:
 * - Putting gold ore on the conveyor belt
 * - Collecting gold bars from the dispenser
 * - Using ice gloves to handle hot bars
 * - Walking to the dispenser when bars are ready
 *
 * The plugin uses game varbits to detect when bars are ready and manages
 * the entire smelting cycle automatically.
 *
 * Setup Instructions:
 * 1. Have gold ore in your inventory
 * 2. Have ice gloves in your inventory (required to collect bars without taking damage)
 * 3. Stand at the Blast Furnace
 * 4. Enable the plugin
 *
 * The plugin will:
 * - Automatically put gold ore on the conveyor belt
 * - Walk to the bar dispenser when bars are ready
 * - Collect bars using ice gloves
 * - Repeat the process
 */
@PluginDescriptor(
        name = "[Leagues] Gold BF",
        enabledByDefault = false
)
public class BlastFurnacePlugin extends SquirePlugin {

    // Decrypted string constants
    private static final String OBJECT_CONVEYOR_BELT = "Conveyor belt";
    private static final String MESSAGE_BARS_READY = "The bars are ready to collect and will remain on the bar dispenser for 12 minutes.";
    private static final String MESSAGE_COLLECTED_BARS = "You retrieve a bar of gold.";
    private static final String OBJECT_BAR_DISPENSER = "Bar dispenser";
    private static final String ACTION_TAKE = "Take";
    private static final String ITEM_GOLD_ORE = "Gold ore";

    /** Item ID for gold ore */
    private static final int GOLD_ORE_ID = 444;

    /** Item ID for ice gloves */
    private static final int ICE_GLOVES_ID = 1580;

    /** Item ID for gold bar */
    private static final int GOLD_BAR_ID = 2357;

    /** Varbit that indicates bars are ready to collect */
    private static final int VARBIT_BARS_READY = 936;

    /** Varbit for blast furnace state */
    private static final int VARBIT_BF_STATE = 937;

    /** Maximum distance from dispenser before walking to it */
    private static final int MAX_DISTANCE_FROM_DISPENSER = 2;

    /**
     * Flag indicating whether bars are ready to be collected.
     * Set to true when the "bars ready" message appears in chat.
     */
    private boolean barsReady;

    /**
     * Called when the plugin is started.
     * Initializes the bars ready flag to false.
     */
    @Override
    protected void onStart() {
        this.barsReady = false;
    }

    /**
     * Called when the plugin is stopped.
     * No cleanup needed for this plugin.
     */
    @Override
    protected void onStop() {
    }

    /**
     * Returns the tasks that should be executed by this plugin.
     * This plugin doesn't use the task framework.
     *
     * @return empty array (no tasks)
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[0];
    }

    /**
     * Handles chat messages to detect when bars are ready or collected.
     *
     * @param chatMessage the chat message event
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();

        // Check if bars are ready to collect
        if (message.contains(MESSAGE_BARS_READY)) {
            this.barsReady = true;
        }

        // Check if we just collected bars
        if (message.contains(MESSAGE_COLLECTED_BARS)) {
            this.barsReady = false;
        }
    }

    /**
     * Called on each game tick.
     * Handles the blast furnace smelting logic.
     *
     * @param gameTick the game tick event
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Get relevant game objects
        Item goldOre = Inventory.getFirst(GOLD_ORE_ID);
        Item goldBarNoted = Inventory.getFirst(item ->
                item.getId() == GOLD_BAR_ID && !item.isNoted()
        );
        Item goldOreUnnoted = Inventory.getFirst(item ->
                item.getName().contains(ITEM_GOLD_ORE) && item.isNoted()
        );
        TileObject barDispenser = TileObjects.getNearest(tileObject ->
                tileObject.getName().contains(OBJECT_BAR_DISPENSER) &&
                tileObject.hasAction(ACTION_TAKE)
        );
        TileObject conveyorBelt = TileObjects.getNearest(OBJECT_CONVEYOR_BELT);

        // If we have a gold bar and gold ore, use ice gloves to combine them
        // (This seems to be using the bar on ore to note it via banker's note mechanism)
        if (goldBarNoted != null && goldOre != null) {
            goldBarNoted.useOn(goldOre);
            return;
        }

        // If the production window is open, select the previous option
        if (Production.isOpen()) {
            Production.choosePreviousOption();
            return;
        }

        // If bars are ready and we're far from the dispenser, walk to it
        if (this.barsReady && barDispenser != null) {
            WorldPoint dispenserLocation = barDispenser.getWorldLocation();
            WorldPoint playerLocation = Players.getLocal().getWorldLocation();

            if (playerLocation.distanceTo(dispenserLocation) > MAX_DISTANCE_FROM_DISPENSER) {
                Movement.walkTo(dispenserLocation);
                return;
            }
        }

        // Check varbits to see if bars are ready
        boolean barsReadyVarbit1 = Vars.getBit(VARBIT_BARS_READY) == 1;
        boolean barsReadyVarbit2 = Vars.getBit(VARBIT_BF_STATE) == 1;

        if (barsReadyVarbit1 && barsReadyVarbit2) {
            // Bars are ready - collect them
            Item hotGoldBar = Inventory.getFirst(item ->
                    item.getId() == GOLD_BAR_ID && !item.isNoted()
            );
            Item goldOreItem = Inventory.getFirst(item ->
                    item.getName().contains(ITEM_GOLD_ORE) && !item.isNoted()
            );

            // If we have hot bars and gold ore, and we're at the dispenser
            if (hotGoldBar != null && goldOreItem != null && !this.barsReady) {
                WorldPoint dispenserLocation = barDispenser.getWorldLocation();
                WorldPoint playerLocation = Players.getLocal().getWorldLocation();

                if (playerLocation.distanceTo(dispenserLocation) <= MAX_DISTANCE_FROM_DISPENSER &&
                    goldOreUnnoted == null) {

                    // Check if we have a gold bar in inventory
                    if (!Inventory.contains(GOLD_BAR_ID)) {
                        // Use gold ore on gold bar (possibly to note it)
                        hotGoldBar.useOn(goldOreItem);
                        return;
                    }
                }
            }

            // If we have noted gold ore, take bars from dispenser
            if (goldOreUnnoted != null) {
                if (Inventory.contains(goldOreUnnoted.getId())) {
                    // Interact with dispenser (index 0 = Take)
                    barDispenser.interact(0);
                    return;
                }
            }
        }

        // If varbit shows bars are ready and production window is not open, put ore on belt
        if (Vars.getBit(VARBIT_BARS_READY) > 0 && !Production.isOpen()) {
            if (conveyorBelt != null) {
                // Put ore on conveyor belt (index 0 = Put-ore-on)
                conveyorBelt.interact(0);
                return;
            }
        }
    }
}
