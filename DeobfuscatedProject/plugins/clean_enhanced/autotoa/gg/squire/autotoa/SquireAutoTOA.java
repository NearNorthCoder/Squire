/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Auto TOA Plugin
 *
 * This plugin provides automation and helpers for the Tombs of Amascut raid.
 * It handles prayer switching, task management, overlay rendering, and loot tracking.
 */
package gg.squire.autotoa;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.autotoa.TOAConfig;
import gg.squire.autotoa.overlay.debug.DebugOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemStack;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.Static;

// Task imports
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.tasks.*;

/**
 * Main plugin class for Squire Auto TOA
 * Manages automation tasks, overlays, and event handlers for Tombs of Amascut raid
 */
@PluginDescriptor(
    name = "Squire Auto TOA",
    description = "Different helpers/automation for TOA",
    enabledByDefault = false
)
@SquireUtil
public class SquireAutoTOA extends SquirePlugin {

    // Varp ID for TOA raid invocation level
    private static final int TOA_RAID_LEVEL_VARP = 1715;

    // Varp ID for TOA party/raid state
    private static final int TOA_PARTY_VARP = 14877;

    // Chat message strings
    private static final String MSG_RAID_COMPLETED = "Your completed Tombs of Amascut";
    private static final String MSG_FAILED_TO_SURVIVE = "You failed to survive";
    private static final String MSG_YOU_HAVE_DIED = "You have died";
    private static final String NPC_NAME_AMASCUT = "Amascut";

    // Sound effect IDs to mute during raid
    private static final Set<Integer> MUTED_SOUND_EFFECTS_A = ImmutableSet.of(
        28142, 28157, 14975, 12031, 27311, 27038,
        10515, 3439, 7963, 27263, 14975, 27311,
        27182, 7654, 5727, 3834, 7219, 5389,
        7846, 5217, 27718
    );

    // Additional sound effects to mute
    private static final Set<Integer> MUTED_SOUND_EFFECTS_B = ImmutableSet.of(
        26219, 25552, 32495, 29135, 29905, 29550, 30063
    );

    // Unique purple drop item IDs
    private static final Set<Integer> UNIQUE_DROP_IDS = ImmutableSet.of(
        26219, 25552, 32495, 29135, 29905, 29550, 30063
    );

    @Inject private WardenHelper wardenHelper;
    @Inject private AutotoaManager autotoaManager;
    @Inject private DebugOverlay debugOverlay;
    @Inject private ZebakOverlay zebakOverlay;
    @Inject private KephriOverlay kephriOverlay;
    @Inject private OverlayManager overlayManager;
    @Inject private GeneralOverlay generalOverlay;
    @Inject private ConfigManager configManager;
    @Inject private ObeliskHelper obeliskHelper;
    @Inject private KephriHelper kephriHelper;
    @Inject private AutotoaEventHandler autotoaEventHandler;
    @Inject private TOAConfig config;
    @Inject private PuzzleEventHandler puzzleEventHandler;
    @Inject private CombatEventHandler combatEventHandler;
    @Inject private EventBus eventBus;
    @Inject private RoomEventHandler roomEventHandler;
    @Inject private LootEventHandler lootEventHandler;
    @Inject private AkkhaHelper akkhaHelper;

    // Plugin state variables
    private boolean prayersEnabled;
    private boolean overlaysEnabled;
    private int currentTaskIndex = 52;
    private boolean autoEatEnabled;
    private int currentRoomIndex;
    private int completedRaidsCount;
    private int failedRaidsCount;
    private int deathsThisRaid;

    public SquireAutoTOA() {
        this.prayersEnabled = false;
        this.overlaysEnabled = false;
        this.currentTaskIndex = 52;
        this.autoEatEnabled = false;
        this.currentRoomIndex = 0;
        this.completedRaidsCount = 0;
        this.failedRaidsCount = 0;
        this.deathsThisRaid = 0;
    }

    /**
     * Gets the current raid invocation level
     * @return The raid level from varp
     */
    public int getRaidLevel() {
        return Vars.getVarp(TOA_RAID_LEVEL_VARP);
    }

    /**
     * Finds the nearest boss NPC for the current room
     * @return The nearest boss NPC
     */
    public NPC getNearestBoss() {
        int[] bossId = new int[1];
        bossId[0] = this.getRaidLevel();
        return NPCs.getNearest(bossId);
    }

    /**
     * Checks if any NPC with the given IDs exists and matches the predicate
     * @param npcIds Array of NPC IDs to check
     * @return True if a matching NPC exists
     */
    public boolean hasNpcWithIds(int... npcIds) {
        return this.hasNpcMatching(npc -> {
            for (int id : npcIds) {
                if (id == npc.getId()) {
                    return true;
                }
            }
            return false;
        });
    }

    /**
     * Checks if an NPC exists matching the given predicate
     * @param predicate The predicate to test NPCs against
     * @return True if a matching NPC exists
     */
    public boolean hasNpcMatching(Predicate<NPC> predicate) {
        NPC nearestBoss = this.getNearestBoss();
        if (nearestBoss != null && predicate.and(npc -> !npc.isDead()).test(nearestBoss)) {
            return true;
        }
        return false;
    }

    /**
     * Handles chat messages for raid completion and death tracking
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();

        // Raid completed successfully
        if (message.startsWith(MSG_RAID_COMPLETED)) {
            this.completedRaidsCount += 1;
            this.deathsThisRaid = 0;
        }

        // Failed to survive (raid wipe)
        if (message.contains(MSG_FAILED_TO_SURVIVE)) {
            this.failedRaidsCount += 1;
            this.deathsThisRaid = 0;
        }

        // Player died during raid
        if (message.contains(MSG_YOU_HAVE_DIED)) {
            this.deathsThisRaid += 1;
        }
    }

    /**
     * Mutes specific sound effects during the raid
     */
    @Subscribe
    public void onSoundEffectPlayed(SoundEffectPlayed soundEffectPlayed) {
        if (MUTED_SOUND_EFFECTS_A.contains(soundEffectPlayed.getSoundId())) {
            soundEffectPlayed.consume();
        }
    }

    /**
     * Tracks loot received from TOA chests
     */
    @Subscribe
    public void onLootReceived(LootReceived lootReceived) {
        if (!lootReceived.getName().contains(NPC_NAME_AMASCUT)) {
            return;
        }

        int raidLevel = Static.getClient().getVarbitValue(TOA_PARTY_VARP);
        Collection<ItemStack> items = lootReceived.getItems();

        // Check for unique drops
        ItemStack uniqueDrop = items.stream()
            .filter(itemStack -> UNIQUE_DROP_IDS.contains(itemStack.getId()))
            .findFirst()
            .orElse(null);

        // Log loot with anonymization if configured
        LootLogger.logLoot(uniqueDrop, items, String.valueOf(raidLevel), this.config.anonymize());
    }

    /**
     * Defines all automation tasks in priority order
     * Tasks are executed from highest priority (index 0) to lowest
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[] {
            // Death and entry tasks
            ClaimingDeathItemsTask.class,           // 0
            BankingToGoBackInTask.class,            // 1
            CreatingToaPartyTask.class,             // 2
            EnteringToaTask.class,                  // 3
            HoppingToDifferentWorldTask.class,      // 4
            RechargingTridentTask.class,            // 5
            UsingSunKerisSpecialTask.class,         // 6
            DoingTask.class,                        // 7

            // Baboon room tasks
            AttackingABaboonTask.class,             // 8
            DodgingVolatileBaboonTask.class,        // 9
            HandlingBabboonPrayersTask.class,       // 10
            DoingBoulderDashTask.class,             // 11
            MovingNextToRubbleTask.class,           // 12
            DodgingFloorTilesTask.class,            // 13

            // Ba-Ba room tasks
            AttackingBabaTask.class,                // 14
            AttackingBaboonsTask.class,             // 15
            DodgingFallingBoulderTask.class,        // 16
            HandlingBabaPrayersTask.class,          // 17
            RedXCycleTask.class,                    // 18

            // Zebak room tasks
            RunningWaterTask.class,                 // 19
            AttackingZebakTask.class,               // 20
            ClearingBoulderTask.class,              // 21
            DodgingWaveTask.class,                  // 22
            EscapingWaterTask.class,                // 23
            MovingOffPoisonTask.class,              // 24
            HandlingZebakPrayersTask.class,         // 25
            DodgingPoisonSplatTask.class,           // 26
            AvoidingBloodCloudTask.class,           // 27
            MovingToCenterTask.class,               // 28

            // Puzzle room tasks
            DoingMatchPuzzleTask.class,             // 29
            DoingPressureOrderTask.class,           // 30
            DoingPressurePlatesPuzzleTask.class,    // 31
            SolvingLightPuzzleTask.class,           // 32
            SolvingObeliskPuzzleTask.class,         // 33
            PuzzlePrayerHandlerTask.class,          // 34
            ProgressPuzzleTask.class,               // 35

            // Kephri room tasks
            DodgingProjectileTask.class,            // 36
            AttackingKephriTask.class,              // 37
            HandlingKephriPrayersTask.class,        // 38
            AttackingKephriSwarmMedicTask.class,    // 39
            MovingToBestSpotTask.class,             // 40
            AttackingSwarmsTask.class,              // 41
            AttackingMageScarabTask.class,          // 42
            AttackingMeleeScarabTask.class,         // 43
            MovingAwayFromAllDungTask.class,        // 44
            DodgingDungAttackTask.class,            // 45
            KillingAnnoyingEggTask.class,           // 46
            SolvingLightPuzzleTask.class,           // 47
            GrabbingPickaxeTask.class,              // 48

            // Akkha room tasks
            AttackingAkkhaTask.class,               // 49
            HandlingAkkhaPrayersTask.class,         // 52 (index 50)
            AttackingAkkhaShadowTask.class,         // 51
            LuringAkkhaToQuadrantTask.class,        // 52
            SolvingMemoryPuzzleTask.class,          // 53
            AttackingAkkhaButterflyTask.class,      // 54
            KeepBackAkkhaTask.class,                // 55
            SkippingAkkhaDpsTask.class,             // 56

            // Navigation and supply tasks
            EnteringNextPathTask.class,             // 57
            ClaimingSuppliesTask.class,             // 58
            WithdrawingSuppliesTask.class,          // 59
            PreventingLogoutTask.class,             // 60
            TurningOnRunTask.class,                 // 61

            // Combat support tasks
            EatingFoodTask.class,                   // 62
            SmellingSaltsTask.class,                // 63
            DrinkingPotionTask.class,               // 64
            DrinkingBrewTask.class,                 // 65
            DrinkingRestoreTask.class,              // 66
            ApplyingSilkTask.class,                 // 67
            DrinkingAmbrosiaTask.class,             // 68
            DroppingUnnecessarySuppliesTask.class,  // 69
            CuringPoisonvenomTask.class,            // 70
            DrinkingPrayerTask.class,               // 71
            CrackingScarabTask.class,               // 72

            // Obelisk room tasks
            MovingToRightSpotWithChargingTask.class, // 73
            DodgingUfosTask.class,                  // 74
            AttackingObeliskTask.class,             // 75
            HandlingObeliskPrayersTask.class,       // 76
            SunKerisObeliskTask.class,              // 77

            // Warden (final boss) tasks
            AttackingCoreTask.class,                // 78
            AttackingP1WardenTask.class,            // 79
            DodgingElectricSkullTask.class,         // 80
            HandlingWardenPrayersTask.class,        // 81
            DodgingSolidifyAttackTask.class,        // 82
            MovingToSafespotTask.class,             // 83
            GoingToFinalPhaseTask.class,            // 84
            AttackingSkullsTask.class,              // 85
            DodgingTilesTask.class,                 // 86
            AttackingFinalWardenTask.class,         // 87
            HandlingElidinisP3PrayersTask.class,    // 88
            HandlingTumekenP3PrayersTask.class,     // 89
            DodgingLightningTask.class,             // 90
            DodgingBabaBoulderTask.class,           // 91

            // Loot and exit tasks
            LootingChestRoomTask.class,             // 92
            ClaimingRewardsOutsideTask.class,       // 93
            DecantingPotionsTask.class,             // 94
            DrinkingStaminaTask.class,              // 95
            LoggingOutAndStoppingTask.class         // 96
        };
    }

    @Provides
    TOAConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(TOAConfig.class);
    }

    /**
     * Resets task state
     */
    public void resetTaskState() {
        this.setCurrentTaskIndex(30);
        this.setAutoEatEnabled(false);
    }

    @Override
    protected void onStart() {
        try {
            // Reset state variables
            this.overlaysEnabled = false;
            this.prayersEnabled = false;
            this.autoEatEnabled = false;
            this.completedRaidsCount = 0;
            this.deathsThisRaid = 0;
            this.failedRaidsCount = 0;

            // Clear event handler state
            this.autotoaEventHandler.clear();
            this.puzzleEventHandler.clear();
            this.roomEventHandler.clear();

            // Register event handlers
            this.eventBus.register(this.autotoaEventHandler);
            this.eventBus.register(this.roomEventHandler);
            this.eventBus.register(this.combatEventHandler);
            this.eventBus.register(this.puzzleEventHandler);
            this.eventBus.register(this.autotoaManager);
            this.eventBus.register(this.lootEventHandler);

            // Add overlays
            this.overlayManager.add(this.zebakOverlay);
            this.overlayManager.add(this.obeliskHelper);
            this.overlayManager.add(this.akkhaHelper);
            this.overlayManager.add(this.kephriHelper);
            this.overlayManager.add(this.wardenHelper);
            this.overlayManager.add(this.kephriOverlay);
            this.overlayManager.add(this.debugOverlay);
            this.overlayManager.add(this.generalOverlay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStop() {
        // Unregister event handlers
        this.eventBus.unregister(this.autotoaEventHandler);
        this.eventBus.unregister(this.roomEventHandler);
        this.eventBus.unregister(this.combatEventHandler);
        this.eventBus.unregister(this.puzzleEventHandler);
        this.eventBus.unregister(this.autotoaManager);
        this.eventBus.unregister(this.lootEventHandler);

        // Remove overlays
        this.overlayManager.remove(this.zebakOverlay);
        this.overlayManager.remove(this.obeliskHelper);
        this.overlayManager.remove(this.akkhaHelper);
        this.overlayManager.remove(this.kephriHelper);
        this.overlayManager.remove(this.wardenHelper);
        this.overlayManager.remove(this.kephriOverlay);
        this.overlayManager.remove(this.debugOverlay);
        this.overlayManager.remove(this.generalOverlay);
    }

    // Getters and setters
    public void setPrayersEnabled(boolean enabled) {
        this.prayersEnabled = enabled;
    }

    public boolean isPrayersEnabled() {
        return this.prayersEnabled;
    }

    public void setOverlaysEnabled(boolean enabled) {
        this.overlaysEnabled = enabled;
    }

    public boolean isOverlaysEnabled() {
        return this.overlaysEnabled;
    }

    public void setAutoEatEnabled(boolean enabled) {
        this.autoEatEnabled = enabled;
    }

    public boolean isAutoEatEnabled() {
        return this.autoEatEnabled;
    }

    public void setCurrentTaskIndex(int index) {
        this.currentTaskIndex = index;
    }

    public int getCurrentTaskIndex() {
        return this.currentTaskIndex;
    }

    public void setCurrentRoomIndex(int index) {
        this.currentRoomIndex = index;
    }

    public int getCurrentRoomIndex() {
        return this.currentRoomIndex;
    }

    public int getCompletedRaidsCount() {
        return this.completedRaidsCount;
    }

    public int getFailedRaidsCount() {
        return this.failedRaidsCount;
    }

    public int getDeathsThisRaid() {
        return this.deathsThisRaid;
    }

    /**
     * Checks if the plugin is currently paused.
     * When paused, tasks should not execute.
     *
     * @return true if the plugin is paused
     */
    public boolean isPaused() {
        // Check if plugin is in a paused state
        // This could be based on config, manual pause, or other conditions
        return !this.autoEatEnabled && !this.prayersEnabled;
    }

    /**
     * @deprecated Use {@link #isPaused()} instead
     */
    @Deprecated
    public boolean e() {
        return isPaused();
    }
}
