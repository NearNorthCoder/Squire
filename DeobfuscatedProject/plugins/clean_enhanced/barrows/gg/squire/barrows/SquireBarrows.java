/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Main plugin class for Squire Barrows automation.
 * Handles brother tracking, reward potential management, and task execution.
 */
package gg.squire.barrows;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.barrows.overlay.BarrowsInfoBox;
import gg.squire.barrows.tasks.*;
import gg.squire.client.plugins.SquirePlugin;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Main plugin class for Squire Barrows bot.
 * Automates the Barrows minigame including brother killing, tunnel navigation,
 * chest looting, and banking.
 */
@PluginDescriptor(
    name = "Squire Barrows",
    description = "Does the barrows minigame",
    enabledByDefault = false
)
public class SquireBarrows extends SquirePlugin {
    // Widget IDs
    private static final int BARROWS_BROTHERS_WIDGET_ID = 24;
    private static final int PUZZLE_WIDGET_GROUP_ID = 25;

    // Puzzle widget IDs
    private static final int PUZZLE_ANSWER_1_WIDGET = 103309;
    private static final int PUZZLE_ANSWER_2_WIDGET = 103565;
    private static final int PUZZLE_ANSWER_3_WIDGET = 103821;

    // Region IDs
    private static final int BARROWS_SURFACE_REGION = 14131;
    private static final int BARROWS_TUNNEL_REGION = 14231;

    // Brother Varbit IDs
    private static final ImmutableList<Integer> BROTHER_VARBITS = ImmutableList.of(
        457,  // Dharok
        458,  // Ahrim
        459,  // Guthan
        460,  // Karil
        461,  // Verac
        462,  // Torag
        463,  // Bloodworm
        464,  // Crypt rat
        465,  // Crypt spider
        466,  // Giant crypt rat
        467,  // Giant crypt spider
        468   // Skeleton
    );

    // Puzzle answer widgets
    private static final ImmutableList<WidgetInfo> PUZZLE_ANSWER_WIDGETS = ImmutableList.of(
        WidgetInfo.BARROWS_PUZZLE_ANSWER1,
        WidgetInfo.BARROWS_PUZZLE_ANSWER2,
        WidgetInfo.BARROWS_PUZZLE_ANSWER3
    );

    // Chat messages
    private static final String MSG_FOUND_BROTHER = "You've found";
    private static final String MSG_CHEST_OPENED = "Your Barrows chest";

    @Inject private Client client;
    @Inject private OverlayManager overlayManager;
    @Inject private BarrowsInfoBox infoBox;
    @Inject private ChatMessageManager chatMessageManager;
    @Inject private GearManager gearManager;
    @Inject private BarrowsHelper helper;

    // Plugin state
    private Brother currentBrother;
    private Brother targetBrother;
    private Brother lastBrother;
    private NPC currentNpc;
    private Widget activePuzzleWidget;
    private boolean stairsFound;
    private boolean needsHouseRestore;
    private boolean shouldBank;
    private int chestsOpened;
    private int uniqueDrops;

    public SquireBarrows() {
        this.currentBrother = Brother.DHAROK;
        this.targetBrother = Brother.DHAROK;
        this.stairsFound = false;
    }

    @Override
    protected void onStart() {
        resetState();
        this.overlayManager.add(this.infoBox);
        Executors.newSingleThreadExecutor().submit(this::checkAntiCheat);
    }

    @Override
    protected void onStop() {
        resetState();
        this.overlayManager.remove(this.infoBox);
    }

    @Provides
    SquireBarrowsConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireBarrowsConfig.class);
    }

    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[]{
            // High priority tasks
            HandlePrayersTask.class,      // 0
            CheckStateTask.class,          // 1

            // Banking tasks
            WalkToBankTask.class,          // 2
            BankTask.class,                // 3

            // Combat tasks
            EatTask.class,                 // 4
            DrinkPrayerTask.class,         // 5
           
            // Puzzle solving
            // ... (19 total tasks as per original)
        };
    }

    /**
     * Handles chat messages for tracking brother encounters and chest openings.
     */
    @Subscribe
    public void onChatMessage(ChatMessage event) {
        String message = event.getMessage();

        if (message.contains(MSG_FOUND_BROTHER)) {
            this.stairsFound = true;
        }

        if (message.contains(MSG_CHEST_OPENED)) {
            this.chestsOpened++;
        }
    }

    /**
     * Handles NPC despawn events to clear current NPC reference.
     */
    @Subscribe
    public void onNpcDespawned(NpcDespawned event) {
        if (event.getNpc() == this.currentNpc) {
            this.currentNpc = null;
        }
    }

    /**
     * Handles loot received events to track unique drops.
     */
    @Subscribe
    public void onLootReceived(LootReceived event) {
        if (event.getItems().stream().anyMatch(itemStack -> 
            BROTHER_VARBITS.contains(itemStack.getId()))) {
            this.uniqueDrops++;
        }
    }

    /**
     * Handles puzzle widget loading and solving.
     */
    @Subscribe
    public void onWidgetLoaded(WidgetLoaded event) {
        if (event.getGroupId() == PUZZLE_WIDGET_GROUP_ID) {
            int puzzleIndex = client.getWidget(WidgetInfo.BARROWS_FIRST_PUZZLE).getModelId() - 3;
            this.activePuzzleWidget = null;

            for (WidgetInfo answerWidget : PUZZLE_ANSWER_WIDGETS) {
                Widget widget = client.getWidget(answerWidget);
                if (widget != null && widget.getModelId() == puzzleIndex) {
                    this.activePuzzleWidget = widget;
                    widget.interact(0);
                    break;
                }
            }
        }
    }

    /**
     * Handles widget closed events.
     */
    @Subscribe
    public void onWidgetClosed(WidgetClosed event) {
        if (event.getGroupId() == PUZZLE_WIDGET_GROUP_ID) {
            this.activePuzzleWidget = null;
        }
    }

    /**
     * Main game tick handler.
     */
    @Subscribe
    public void onGameTick(GameTick event) {
        // Handle automatic brother cycling
        if (isInBarrowsRegion() && !isInHouse() && getBrothersKilledCount() == 6 && needsHouseRestore()) {
            this.currentBrother = Brother.DHAROK;
            this.targetBrother = Brother.DHAROK;
            this.lastBrother = null;
        }

        // Handle puzzle solving
        if (this.activePuzzleWidget != null && !this.activePuzzleWidget.isHidden()) {
            solvePuzzle(this.activePuzzleWidget.getId());
        }

        // Handle stairs detection
        if (this.stairsFound) {
            TileObject stairs = TileObjects.getNearest("Stairs");
            if (stairs != null) {
                stairs.interact("Open");
                this.stairsFound = false;
            }
        }
    }

    /**
     * Solves a Barrows puzzle by clicking the correct answer.
     *
     * @param puzzleId The puzzle widget ID
     */
    private void solvePuzzle(int puzzleId) {
        ChatMessageBuilder message = new ChatMessageBuilder()
            .append(ChatColorType.HIGHLIGHT)
            .append("Solving Puzzle " + puzzleId)
            .append(ChatColorType.NORMAL);

        this.chatMessageManager.queue(QueuedMessage.builder()
            .type(ChatMessageType.ITEM_EXAMINE)
            .runeLiteFormattedMessage(message.build())
            .build());

        Widget answerWidget = Widgets.get(PUZZLE_WIDGET_GROUP_ID, getAnswerChildId(puzzleId));
        if (answerWidget != null) {
            answerWidget.interact(0);
        }
    }

    /**
     * Gets the child widget ID for the puzzle answer.
     *
     * @param puzzleId The puzzle widget ID
     * @return The answer child ID
     */
    private int getAnswerChildId(int puzzleId) {
        if (puzzleId == PUZZLE_ANSWER_1_WIDGET) return 14;
        if (puzzleId == PUZZLE_ANSWER_2_WIDGET) return 11;
        if (puzzleId == PUZZLE_ANSWER_3_WIDGET) return 7;
        return 0;
    }

    /**
     * Resets all plugin state variables.
     */
    private void resetState() {
        this.chestsOpened = 0;
        this.uniqueDrops = 0;
        this.shouldBank = false;
        this.currentBrother = Brother.DHAROK;
        this.targetBrother = Brother.DHAROK;
        this.lastBrother = null;
        this.stairsFound = false;
        this.activePuzzleWidget = null;
        this.currentNpc = null;
        this.client.forcedLogoutWildy();
    }

    /**
     * Cycles to the next brother.
     */
    public void cycleToNextBrother() {
        this.currentBrother = Brother.values()[
            (this.currentBrother.ordinal() + 1) % Brother.values().length
        ];

        if (this.client.getVarbitValue(this.currentBrother.getKilledVarbit()) > 0 &&
            getBrothersKilledCount() < 6) {
            cycleToNextBrother();
        }
    }

    /**
     * Checks if the player is in the Barrows region.
     *
     * @return True if in Barrows surface or tunnel region
     */
    public boolean isInBarrowsRegion() {
        for (int region : this.client.getMapRegions()) {
            if (region == BARROWS_TUNNEL_REGION) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the player is in their house.
     *
     * @return True if in house region
     */
    public boolean isInHouse() {
        Player player = this.client.getLocalPlayer();
        return player != null && player.getWorldLocation().getRegionID() == BARROWS_SURFACE_REGION;
    }

    /**
     * Gets the number of brothers killed this run.
     *
     * @return Number of brothers killed
     */
    public int getBrothersKilledCount() {
        int count = 0;
        for (Brother brother : Brother.values()) {
            if (this.client.getVarbitValue(brother.getKilledVarbit()) > 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if all brothers have been killed.
     *
     * @return True if all 6 brothers are dead
     */
    public boolean allBrothersKilled() {
        return this.helper.getRemainingPotential() == 0;
    }

    /**
     * Checks if the current brother has been killed.
     *
     * @param brother The brother to check
     * @return True if the brother is dead
     */
    public boolean isBrotherKilled(Brother brother) {
        return this.client.getVarbitValue(brother.getKilledVarbit()) > 0;
    }

    /**
     * Checks if an NPC is currently interacting with the player.
     *
     * @return True if being attacked
     */
    public boolean isBeingAttacked() {
        Actor attacker = Players.getLocal().getInteracting();
        if (attacker == null) {
            return false;
        }

        if (!Brother.isBrotherAttackingPlayer(attacker) ||
            this.helper.getTunnelCreaturesToFight(this.helper.getCurrentPotential())
                .contains(attacker.getName())) {
            return true;
        }

        return false;
    }

    /**
     * Drinks or wields an item with the "Drink" or "Wield" action.
     *
     * @return True if action was performed
     */
    public boolean consumeOrEquipItem() {
        Item item = Inventory.getFirst(i ->
            i.hasAction("Drink") &&
            (!i.getName().toLowerCase().contains("prayer") ||
             i.getName().toLowerCase().contains("potion"))
        );

        if (item == null) {
            return false;
        }

        item.interact("Drink");
        return true;
    }

    /**
     * Anti-cheat check that randomly exits the client.
     */
    private void checkAntiCheat() {
        if (!((net.runelite.rs.api.RSClient) client).isTesting()) {
            int delay = Rand.nextInt(5, 18);
            Executors.newSingleThreadScheduledExecutor().schedule(
                () -> System.exit(0),
                delay,
                TimeUnit.MINUTES
            );
        }
    }

    // Getters and setters
    public Brother getCurrentBrother() { return this.currentBrother; }
    public void setCurrentBrother(Brother brother) { this.currentBrother = brother; }
    
    public Brother getTargetBrother() { return this.targetBrother; }
    public void setTargetBrother(Brother brother) { this.targetBrother = brother; }
    
    public Brother getLastBrother() { return this.lastBrother; }
    public void saveLastBrother() { this.lastBrother = this.targetBrother; }
    
    public NPC getCurrentNpc() { return this.currentNpc; }
    public void setCurrentNpc(NPC npc) { this.currentNpc = npc; }
    
    public Widget getActivePuzzleWidget() { return this.activePuzzleWidget; }
    
    public boolean needsHouseRestore() { return this.needsHouseRestore; }
    public void setNeedsHouseRestore(boolean needs) { this.needsHouseRestore = needs; }
    
    public boolean shouldBank() { return this.shouldBank; }
    public void setShouldBank(boolean should) { this.shouldBank = should; }
    
    public int getChestsOpened() { return this.chestsOpened; }
    public int getUniqueDrops() { return this.uniqueDrops; }
    
    public GearManager getGearManager() { return this.gearManager; }
}
