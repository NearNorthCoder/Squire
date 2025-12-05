/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ActorDeath
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GraphicChanged
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.VarbitChanged
 */
package net.runelite.client.plugins.timers;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import java.time.Duration;
import java.time.Instant;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.timers.ElapsedTimer;
import net.runelite.client.plugins.timers.GameIndicator;
import net.runelite.client.plugins.timers.GameTimer;
import net.runelite.client.plugins.timers.IndicatorIndicator;
import net.runelite.client.plugins.timers.TimerTimer;
import net.runelite.client.plugins.timers.TimersConfig;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.RSTimeUnit;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Timers", description="Show various timers in an infobox", tags={"combat", "items", "magic", "potions", "prayer", "overlay", "abyssal", "sire", "inferno", "fight", "caves", "cape", "timer", "tzhaar", "thieving", "pickpocket", "hunter", "impling", "puro"})
public class TimersPlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(TimersPlugin.class);
    private static final String ABYSSAL_SIRE_STUN_MESSAGE = "The Sire has been disorientated temporarily.";
    private static final String CANNON_BASE_MESSAGE = "You place the cannon base on the ground.";
    private static final String CANNON_STAND_MESSAGE = "You add the stand.";
    private static final String CANNON_BARRELS_MESSAGE = "You add the barrels.";
    private static final String CANNON_FURNACE_MESSAGE = "You add the furnace.";
    private static final String CANNON_PICKUP_MESSAGE = "You pick up the cannon. It's really heavy.";
    private static final String CANNON_REPAIR_MESSAGE = "You repair your cannon, restoring it to working order.";
    private static final String CANNON_DESTROYED_MESSAGE = "Your cannon has been destroyed!";
    private static final String CANNON_BROKEN_MESSAGE = "<col=ef1020>Your cannon has broken!";
    private static final String FROZEN_MESSAGE = "<col=ef1020>You have been frozen!</col>";
    private static final String STAFF_OF_THE_DEAD_SPEC_EXPIRED_MESSAGE = "Your protection fades away";
    private static final String STAFF_OF_THE_DEAD_SPEC_MESSAGE = "Spirits of deceased evildoers offer you their protection";
    private static final String PRAYER_ENHANCE_EXPIRED = "<col=ff0000>Your prayer enhance effect has worn off.</col>";
    private static final String SHADOW_VEIL_MESSAGE = ">Your thieving abilities have been enhanced.</col>";
    private static final String RESURRECT_THRALL_MESSAGE_START = ">You resurrect a ";
    private static final String RESURRECT_THRALL_MESSAGE_END = " thrall.</col>";
    private static final String WARD_OF_ARCEUUS_MESSAGE = ">Your defence against Arceuus magic has been strengthened.</col>";
    private static final String MARK_OF_DARKNESS_MESSAGE = "You have placed a Mark of Darkness upon yourself.</col>";
    private static final String PICKPOCKET_FAILURE_MESSAGE = "You fail to pick ";
    private static final String DODGY_NECKLACE_PROTECTION_MESSAGE = "Your dodgy necklace protects you.";
    private static final String SHADOW_VEIL_PROTECTION_MESSAGE = "Your attempt to steal goes unnoticed.";
    private static final String SILK_DRESSING_MESSAGE = "You quickly apply the dressing to your wounds.";
    private static final String BLESSED_CRYSTAL_SCARAB_MESSAGE = "You crack the crystal in your hand.";
    private static final String LIQUID_ADRENALINE_MESSAGE = "You drink some of the potion, reducing the energy cost of your special attacks.</col>";
    private static final Set<Integer> STAVES_OF_THE_DEAD = ((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)((ImmutableSet.Builder)new ImmutableSet.Builder().addAll(ItemVariationMapping.getVariations(11791))).addAll(ItemVariationMapping.getVariations(12902))).add((Object)22296)).add((Object)24144)).build();
    private static final int VENOM_VALUE_CUTOFF = -38;
    private static final int POISON_TICK_LENGTH = 30;
    private static final int OVERLOAD_TICK_LENGTH = 25;
    private static final int ANTIFIRE_TICK_LENGTH = 30;
    private static final int SUPERANTIFIRE_TICK_LENGTH = 20;
    static final int FIGHT_CAVES_REGION_ID = 9551;
    static final int INFERNO_REGION_ID = 9043;
    private static final Pattern TZHAAR_WAVE_MESSAGE = Pattern.compile("Wave: (\\d+)");
    private static final Pattern TZHAAR_PAUSED_MESSAGE = Pattern.compile("The (?:Inferno|Fight Cave) has been paused. You may now log out.");
    private TimerTimer freezeTimer;
    private int freezeTime = -1;
    private final Map<GameTimer, TimerTimer> varTimers = new EnumMap<GameTimer, TimerTimer>(GameTimer.class);
    private int nextPoisonTick;
    private int nextOverloadRefreshTick;
    private int nextAntifireTick;
    private int nextSuperAntifireTick;
    private WorldPoint lastPoint;
    private ElapsedTimer tzhaarTimer;
    @Inject
    private ItemManager itemManager;
    @Inject
    private SpriteManager spriteManager;
    @Inject
    private Client client;
    @Inject
    private TimersConfig config;
    @Inject
    private InfoBoxManager infoBoxManager;

    @Provides
    TimersConfig getConfig(ConfigManager configManager) {
        return configManager.getConfig(TimersConfig.class);
    }

    @Override
    public void startUp() {
        if (this.config.showHomeMinigameTeleports()) {
            this.checkTeleport(892);
            this.checkTeleport(888);
        }
    }

    @Override
    protected void shutDown() throws Exception {
        this.infoBoxManager.removeIf(t -> t instanceof TimerTimer);
        this.lastPoint = null;
        this.nextPoisonTick = 0;
        this.nextOverloadRefreshTick = 0;
        this.nextAntifireTick = 0;
        this.nextSuperAntifireTick = 0;
        this.removeTzhaarTimer();
        this.varTimers.clear();
    }

    @Subscribe
    public void onVarbitChanged(VarbitChanged event) {
        int tickCount;
        if (event.getVarbitId() == 5432) {
            this.removeVarTimer(GameTimer.OVERLOAD_RAID);
            this.removeGameTimer(GameTimer.PRAYER_ENHANCE);
        }
        if (event.getVarbitId() == 2451 && this.config.showVengeance()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.VENGEANCE);
            } else {
                this.removeGameTimer(GameTimer.VENGEANCE);
            }
        }
        if (event.getVarbitId() == 3617 && this.config.showSpellbookSwap()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.SPELLBOOK_SWAP);
            } else {
                this.removeGameTimer(GameTimer.SPELLBOOK_SWAP);
            }
        }
        if (event.getVarbitId() == 925 && this.config.showHealGroup()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.HEAL_GROUP);
            } else {
                this.removeGameTimer(GameTimer.HEAL_GROUP);
            }
        }
        if (event.getVarbitId() == 12138 && this.config.showArceuusCooldown()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.DEATH_CHARGE_COOLDOWN);
            } else {
                this.removeGameTimer(GameTimer.DEATH_CHARGE_COOLDOWN);
            }
        }
        if (event.getVarbitId() == 12288 && this.config.showArceuusCooldown()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.CORRUPTION_COOLDOWN);
            } else {
                this.removeGameTimer(GameTimer.CORRUPTION_COOLDOWN);
            }
        }
        if (event.getVarbitId() == 12290 && this.config.showArceuusCooldown()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.RESURRECT_THRALL_COOLDOWN);
            } else {
                this.removeGameTimer(GameTimer.RESURRECT_THRALL_COOLDOWN);
            }
        }
        if (event.getVarbitId() == 12291 && this.config.showArceuusCooldown()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.SHADOW_VEIL_COOLDOWN);
            } else {
                this.removeGameTimer(GameTimer.SHADOW_VEIL_COOLDOWN);
            }
        }
        if (event.getVarbitId() == 12293 && this.config.showArceuusCooldown()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.WARD_OF_ARCEUUS_COOLDOWN);
            } else {
                this.removeGameTimer(GameTimer.WARD_OF_ARCEUUS_COOLDOWN);
            }
        }
        if (event.getVarbitId() == 2450 && this.config.showVengeanceActive()) {
            if (event.getValue() == 1) {
                this.createGameIndicator(GameIndicator.VENGEANCE_ACTIVE);
            } else {
                this.removeGameIndicator(GameIndicator.VENGEANCE_ACTIVE);
            }
        }
        if (event.getVarbitId() == 12411 && this.config.showArceuus()) {
            if (event.getValue() == 1) {
                this.createGameTimer(GameTimer.DEATH_CHARGE, Duration.of(this.client.getRealSkillLevel(Skill.MAGIC), RSTimeUnit.GAME_TICKS));
            } else {
                this.removeGameTimer(GameTimer.DEATH_CHARGE);
            }
        }
        if (event.getVarbitId() == 12413 && event.getValue() == 0 && this.config.showArceuus()) {
            this.removeGameTimer(GameTimer.RESURRECT_THRALL);
        }
        if (event.getVarbitId() == 12414 && event.getValue() == 0 && this.config.showArceuus()) {
            this.removeGameTimer(GameTimer.SHADOW_VEIL);
        }
        if (event.getVarpId() == 102 && this.config.showAntiPoison()) {
            int poisonVarp = event.getValue();
            tickCount = this.client.getTickCount();
            if (poisonVarp == 0) {
                this.nextPoisonTick = -1;
            } else if (this.nextPoisonTick - tickCount <= 0) {
                this.nextPoisonTick = tickCount + 30;
            }
            this.updateVarTimer(GameTimer.ANTIPOISON, event.getValue(), i -> i >= 0 || i < -38, i -> this.nextPoisonTick - tickCount + Math.abs((i + 1) * 30));
            this.updateVarTimer(GameTimer.ANTIVENOM, event.getValue(), i -> i >= -38, i -> this.nextPoisonTick - tickCount + Math.abs((i + 1 - -38) * 30));
        }
        if ((event.getVarbitId() == 3955 || event.getVarbitId() == 5418) && this.config.showOverload()) {
            int overloadVarb = event.getValue();
            tickCount = this.client.getTickCount();
            if (overloadVarb <= 0) {
                this.nextOverloadRefreshTick = -1;
            } else if (this.nextOverloadRefreshTick - tickCount <= 0) {
                this.nextOverloadRefreshTick = tickCount + 25;
            }
            GameTimer overloadTimer = this.client.getVarbitValue(5432) == 1 ? GameTimer.OVERLOAD_RAID : GameTimer.OVERLOAD;
            this.updateVarTimer(overloadTimer, overloadVarb, i -> this.nextOverloadRefreshTick - tickCount + (i - 1) * 25);
        }
        if (event.getVarbitId() == 4163 && this.config.showTeleblock()) {
            this.updateVarTimer(GameTimer.TELEBLOCK, event.getValue() - 100, i -> i <= 0, IntUnaryOperator.identity());
        }
        if (event.getVarpId() == 272 && this.config.showCharge()) {
            this.updateVarTimer(GameTimer.CHARGE, event.getValue(), i -> i * 2);
        }
        if (event.getVarbitId() == 5361 && this.config.showImbuedHeart()) {
            this.updateVarTimer(GameTimer.IMBUEDHEART, event.getValue(), i -> i * 10);
        }
        if (event.getVarbitId() == 6539 && this.config.showDFSSpecial()) {
            this.updateVarTimer(GameTimer.DRAGON_FIRE_SHIELD, event.getValue(), i -> i * 8);
        }
        if (event.getVarpId() == 892 && this.config.showHomeMinigameTeleports()) {
            this.checkTeleport(892);
        }
        if (event.getVarpId() == 888 && this.config.showHomeMinigameTeleports()) {
            this.checkTeleport(888);
        }
        if (event.getVarbitId() == 25 || event.getVarbitId() == 24 || event.getVarbitId() == 10385) {
            int staminaEffectActive = this.client.getVarbitValue(25);
            int staminaPotionEffectVarb = this.client.getVarbitValue(24);
            int enduranceRingEffectVarb = this.client.getVarbitValue(10385);
            int totalStaminaEffect = staminaPotionEffectVarb + enduranceRingEffectVarb;
            if (staminaEffectActive == 1 && this.config.showStamina()) {
                this.updateVarTimer(GameTimer.STAMINA, totalStaminaEffect, i -> i * 10);
            }
        }
        if (event.getVarbitId() == 3981 && this.config.showAntiFire()) {
            int antifireVarb = event.getValue();
            tickCount = this.client.getTickCount();
            if (antifireVarb == 0) {
                this.nextAntifireTick = -1;
            } else if (this.nextAntifireTick - tickCount <= 0) {
                this.nextAntifireTick = tickCount + 30;
            }
            this.updateVarTimer(GameTimer.ANTIFIRE, antifireVarb, i -> this.nextAntifireTick - tickCount + (i - 1) * 30);
        }
        if (event.getVarbitId() == 6101 && this.config.showAntiFire()) {
            int superAntifireVarb = event.getValue();
            tickCount = this.client.getTickCount();
            if (superAntifireVarb == 0) {
                this.nextSuperAntifireTick = -1;
            } else if (this.nextSuperAntifireTick - tickCount <= 0) {
                this.nextSuperAntifireTick = tickCount + 20;
            }
            this.updateVarTimer(GameTimer.SUPERANTIFIRE, event.getValue(), i -> this.nextSuperAntifireTick - tickCount + (i - 1) * 20);
        }
        if (event.getVarbitId() == 5438 && this.config.showMagicImbue()) {
            this.updateVarTimer(GameTimer.MAGICIMBUE, event.getValue(), i -> i * 10);
        }
        if (event.getVarbitId() == 8429 && this.config.showDivine()) {
            if (this.client.getVarbitValue(13663) > event.getValue()) {
                return;
            }
            this.updateVarTimer(GameTimer.DIVINE_SUPER_ATTACK, event.getValue(), IntUnaryOperator.identity());
        }
        if (event.getVarbitId() == 8430 && this.config.showDivine()) {
            if (this.client.getVarbitValue(13663) > event.getValue()) {
                return;
            }
            this.updateVarTimer(GameTimer.DIVINE_SUPER_STRENGTH, event.getValue(), IntUnaryOperator.identity());
        }
        if (event.getVarbitId() == 8431 && this.config.showDivine()) {
            if (this.client.getVarbitValue(13663) > event.getValue() || this.client.getVarbitValue(13664) > event.getValue() || this.client.getVarbitValue(13665) > event.getValue()) {
                return;
            }
            this.updateVarTimer(GameTimer.DIVINE_SUPER_DEFENCE, event.getValue(), IntUnaryOperator.identity());
        }
        if (event.getVarbitId() == 8432 && this.config.showDivine()) {
            if (this.client.getVarbitValue(13664) > event.getValue()) {
                return;
            }
            this.updateVarTimer(GameTimer.DIVINE_RANGING, event.getValue(), IntUnaryOperator.identity());
        }
        if (event.getVarbitId() == 8433 && this.config.showDivine()) {
            if (this.client.getVarbitValue(13665) > event.getValue()) {
                return;
            }
            this.updateVarTimer(GameTimer.DIVINE_MAGIC, event.getValue(), IntUnaryOperator.identity());
        }
        if (event.getVarbitId() == 13663 && this.config.showDivine()) {
            if (this.client.getVarbitValue(8429) == event.getValue()) {
                this.removeVarTimer(GameTimer.DIVINE_SUPER_ATTACK);
            }
            if (this.client.getVarbitValue(8430) == event.getValue()) {
                this.removeVarTimer(GameTimer.DIVINE_SUPER_STRENGTH);
            }
            if (this.client.getVarbitValue(8431) == event.getValue()) {
                this.removeVarTimer(GameTimer.DIVINE_SUPER_DEFENCE);
            }
            this.updateVarTimer(GameTimer.DIVINE_SUPER_COMBAT, event.getValue(), IntUnaryOperator.identity());
        }
        if (event.getVarbitId() == 13664 && this.config.showDivine()) {
            if (this.client.getVarbitValue(8432) == event.getValue()) {
                this.removeVarTimer(GameTimer.DIVINE_RANGING);
            }
            if (this.client.getVarbitValue(8431) == event.getValue()) {
                this.removeVarTimer(GameTimer.DIVINE_SUPER_DEFENCE);
            }
            this.updateVarTimer(GameTimer.DIVINE_BASTION, event.getValue(), IntUnaryOperator.identity());
        }
        if (event.getVarbitId() == 13665 && this.config.showDivine()) {
            if (this.client.getVarbitValue(8433) == event.getValue()) {
                this.removeVarTimer(GameTimer.DIVINE_MAGIC);
            }
            if (this.client.getVarbitValue(8431) == event.getValue()) {
                this.removeVarTimer(GameTimer.DIVINE_SUPER_DEFENCE);
            }
            this.updateVarTimer(GameTimer.DIVINE_BATTLEMAGE, event.getValue(), IntUnaryOperator.identity());
        }
        if (event.getVarbitId() == 14344 && this.config.showOverload()) {
            this.updateVarTimer(GameTimer.SMELLING_SALTS, event.getValue(), i -> i * 25);
        }
        if (event.getVarbitId() == 14448 && this.config.showMenaphiteRemedy()) {
            this.updateVarTimer(GameTimer.MENAPHITE_REMEDY, event.getValue(), i -> i * 25);
        }
        if (event.getVarbitId() == 14361 && event.getValue() == 0 && this.config.showLiquidAdrenaline()) {
            this.removeGameTimer(GameTimer.LIQUID_ADRENALINE);
        }
        if (event.getVarbitId() == 11765 && this.config.showFarmersAffinity()) {
            this.updateVarTimer(GameTimer.FARMERS_AFFINITY, event.getValue(), i -> i * 20);
        }
        if (event.getVarbitId() == 4099 && this.config.showGodWarsAltar()) {
            this.updateVarTimer(GameTimer.GOD_WARS_ALTAR, event.getValue(), i -> i * 100);
        }
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged event) {
        if (!event.getGroup().equals("timers")) {
            return;
        }
        if (!this.config.showHomeMinigameTeleports()) {
            this.removeGameTimer(GameTimer.HOME_TELEPORT);
            this.removeGameTimer(GameTimer.MINIGAME_TELEPORT);
        } else {
            this.checkTeleport(892);
            this.checkTeleport(888);
        }
        if (!this.config.showAntiFire()) {
            this.removeVarTimer(GameTimer.ANTIFIRE);
            this.removeVarTimer(GameTimer.SUPERANTIFIRE);
        }
        if (!this.config.showStamina()) {
            this.removeVarTimer(GameTimer.STAMINA);
        }
        if (!this.config.showOverload()) {
            this.removeGameTimer(GameTimer.OVERLOAD);
            this.removeGameTimer(GameTimer.OVERLOAD_RAID);
            this.removeGameTimer(GameTimer.SMELLING_SALTS);
        }
        if (!this.config.showPrayerEnhance()) {
            this.removeGameTimer(GameTimer.PRAYER_ENHANCE);
        }
        if (!this.config.showDivine()) {
            this.removeVarTimer(GameTimer.DIVINE_SUPER_ATTACK);
            this.removeVarTimer(GameTimer.DIVINE_SUPER_STRENGTH);
            this.removeVarTimer(GameTimer.DIVINE_SUPER_DEFENCE);
            this.removeVarTimer(GameTimer.DIVINE_RANGING);
            this.removeVarTimer(GameTimer.DIVINE_MAGIC);
            this.removeVarTimer(GameTimer.DIVINE_SUPER_COMBAT);
            this.removeVarTimer(GameTimer.DIVINE_BASTION);
            this.removeVarTimer(GameTimer.DIVINE_BATTLEMAGE);
        }
        if (!this.config.showCannon()) {
            this.removeGameTimer(GameTimer.CANNON);
            this.removeGameTimer(GameTimer.CANNON_REPAIR);
        }
        if (!this.config.showMagicImbue()) {
            this.removeVarTimer(GameTimer.MAGICIMBUE);
        }
        if (!this.config.showCharge()) {
            this.removeGameTimer(GameTimer.CHARGE);
        }
        if (!this.config.showImbuedHeart()) {
            this.removeVarTimer(GameTimer.IMBUEDHEART);
        }
        if (!this.config.showDFSSpecial()) {
            this.removeVarTimer(GameTimer.DRAGON_FIRE_SHIELD);
        }
        if (!this.config.showStaffOfTheDead()) {
            this.removeGameTimer(GameTimer.STAFF_OF_THE_DEAD);
        }
        if (!this.config.showVengeance()) {
            this.removeGameTimer(GameTimer.VENGEANCE);
        }
        if (!this.config.showHealGroup()) {
            this.removeGameTimer(GameTimer.HEAL_GROUP);
        }
        if (!this.config.showVengeanceActive()) {
            this.removeGameIndicator(GameIndicator.VENGEANCE_ACTIVE);
        }
        if (!this.config.showTeleblock()) {
            this.removeGameTimer(GameTimer.TELEBLOCK);
        }
        if (!this.config.showFreezes()) {
            this.removeGameTimer(GameTimer.BIND);
            this.removeGameTimer(GameTimer.SNARE);
            this.removeGameTimer(GameTimer.ENTANGLE);
            this.removeGameTimer(GameTimer.ICERUSH);
            this.removeGameTimer(GameTimer.ICEBURST);
            this.removeGameTimer(GameTimer.ICEBLITZ);
            this.removeGameTimer(GameTimer.ICEBARRAGE);
        }
        if (!this.config.showArceuus()) {
            this.removeGameTimer(GameTimer.DEATH_CHARGE);
            this.removeGameTimer(GameTimer.RESURRECT_THRALL);
            this.removeGameTimer(GameTimer.SHADOW_VEIL);
            this.removeGameTimer(GameTimer.WARD_OF_ARCEUUS);
            this.removeGameTimer(GameTimer.MARK_OF_DARKNESS);
        }
        if (!this.config.showArceuusCooldown()) {
            this.removeGameTimer(GameTimer.DEATH_CHARGE_COOLDOWN);
            this.removeGameTimer(GameTimer.RESURRECT_THRALL_COOLDOWN);
            this.removeGameTimer(GameTimer.SHADOW_VEIL_COOLDOWN);
            this.removeGameTimer(GameTimer.WARD_OF_ARCEUUS_COOLDOWN);
            this.removeGameTimer(GameTimer.CORRUPTION_COOLDOWN);
            this.removeGameTimer(GameTimer.MARK_OF_DARKNESS_COOLDOWN);
        }
        if (!this.config.showAntiPoison()) {
            this.removeGameTimer(GameTimer.ANTIPOISON);
            this.removeGameTimer(GameTimer.ANTIVENOM);
        }
        if (!this.config.showTzhaarTimers()) {
            this.removeTzhaarTimer();
        } else {
            this.createTzhaarTimer();
        }
        if (!this.config.showFarmersAffinity()) {
            this.removeVarTimer(GameTimer.FARMERS_AFFINITY);
        }
        if (!this.config.showGodWarsAltar()) {
            this.removeVarTimer(GameTimer.GOD_WARS_ALTAR);
        }
        if (!this.config.showLiquidAdrenaline()) {
            this.removeGameTimer(GameTimer.LIQUID_ADRENALINE);
        }
        if (!this.config.showMenaphiteRemedy()) {
            this.removeVarTimer(GameTimer.MENAPHITE_REMEDY);
        }
        if (!this.config.showSilkDressing()) {
            this.removeGameTimer(GameTimer.SILK_DRESSING);
        }
        if (!this.config.showBlessedCrystalScarab()) {
            this.removeGameTimer(GameTimer.BLESSED_CRYSTAL_SCARAB);
        }
        if (!this.config.showAbyssalSireStun()) {
            this.removeGameTimer(GameTimer.ABYSSAL_SIRE_STUN);
        }
        if (!this.config.showPickpocketStun()) {
            this.removeGameTimer(GameTimer.PICKPOCKET_STUN);
        }
        if (!this.config.showSpellbookSwap()) {
            this.removeGameTimer(GameTimer.SPELLBOOK_SWAP);
        }
    }

    @Subscribe
    public void onChatMessage(ChatMessage event) {
        String message = event.getMessage();
        if (event.getType() != ChatMessageType.SPAM && event.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }
        if (message.contains(DODGY_NECKLACE_PROTECTION_MESSAGE) || message.contains(SHADOW_VEIL_PROTECTION_MESSAGE)) {
            this.removeGameTimer(GameTimer.PICKPOCKET_STUN);
        }
        if (message.contains(PICKPOCKET_FAILURE_MESSAGE) && this.config.showPickpocketStun() && message.contains("pocket")) {
            if (message.contains("hero") || message.contains("elf")) {
                this.createGameTimer(GameTimer.PICKPOCKET_STUN, Duration.ofSeconds(6L));
            } else {
                this.createGameTimer(GameTimer.PICKPOCKET_STUN, Duration.ofSeconds(5L));
            }
        }
        if (message.equals(ABYSSAL_SIRE_STUN_MESSAGE) && this.config.showAbyssalSireStun()) {
            this.createGameTimer(GameTimer.ABYSSAL_SIRE_STUN);
        }
        if (this.config.showCannon()) {
            TimerTimer cannonTimer;
            if (message.equals(CANNON_BASE_MESSAGE) || message.equals(CANNON_STAND_MESSAGE) || message.equals(CANNON_BARRELS_MESSAGE) || message.equals(CANNON_FURNACE_MESSAGE) || message.contains(CANNON_REPAIR_MESSAGE)) {
                this.removeGameTimer(GameTimer.CANNON_REPAIR);
                cannonTimer = this.createGameTimer(GameTimer.CANNON);
                cannonTimer.setTooltip(cannonTimer.getTooltip() + " - World " + this.client.getWorld());
            } else if (message.equals(CANNON_BROKEN_MESSAGE)) {
                this.removeGameTimer(GameTimer.CANNON);
                cannonTimer = this.createGameTimer(GameTimer.CANNON_REPAIR);
                cannonTimer.setTooltip(cannonTimer.getTooltip() + " - World " + this.client.getWorld());
            } else if (message.equals(CANNON_PICKUP_MESSAGE) || message.equals(CANNON_DESTROYED_MESSAGE)) {
                this.removeGameTimer(GameTimer.CANNON);
                this.removeGameTimer(GameTimer.CANNON_REPAIR);
            }
        }
        if (this.config.showPrayerEnhance() && message.startsWith("You drink some of your") && message.contains("prayer enhance")) {
            this.createGameTimer(GameTimer.PRAYER_ENHANCE);
        }
        if (this.config.showPrayerEnhance() && message.equals(PRAYER_ENHANCE_EXPIRED)) {
            this.removeGameTimer(GameTimer.PRAYER_ENHANCE);
        }
        if (this.config.showStaffOfTheDead() && message.contains(STAFF_OF_THE_DEAD_SPEC_MESSAGE)) {
            this.createGameTimer(GameTimer.STAFF_OF_THE_DEAD);
        }
        if (this.config.showStaffOfTheDead() && message.contains(STAFF_OF_THE_DEAD_SPEC_EXPIRED_MESSAGE)) {
            this.removeGameTimer(GameTimer.STAFF_OF_THE_DEAD);
        }
        if (this.config.showFreezes() && message.equals(FROZEN_MESSAGE)) {
            this.freezeTimer = this.createGameTimer(GameTimer.ICEBARRAGE);
            this.freezeTime = this.client.getTickCount();
        }
        if (this.config.showArceuus()) {
            int magicLevel = this.client.getRealSkillLevel(Skill.MAGIC);
            if (message.endsWith(SHADOW_VEIL_MESSAGE)) {
                this.createGameTimer(GameTimer.SHADOW_VEIL, Duration.of(magicLevel, RSTimeUnit.GAME_TICKS));
            } else if (message.endsWith(WARD_OF_ARCEUUS_MESSAGE)) {
                this.createGameTimer(GameTimer.WARD_OF_ARCEUUS, Duration.of(magicLevel, RSTimeUnit.GAME_TICKS));
            } else if (message.endsWith(MARK_OF_DARKNESS_MESSAGE)) {
                this.createGameTimer(GameTimer.MARK_OF_DARKNESS, Duration.of(magicLevel, RSTimeUnit.GAME_TICKS));
            } else if (message.contains(RESURRECT_THRALL_MESSAGE_START) && message.endsWith(RESURRECT_THRALL_MESSAGE_END)) {
                int t = this.client.getBoostedSkillLevel(Skill.MAGIC);
                if (this.client.getVarbitValue(12868) == 2) {
                    t += t;
                } else if (this.client.getVarbitValue(12867) == 2) {
                    t += t / 2;
                }
                this.createGameTimer(GameTimer.RESURRECT_THRALL, Duration.of(t, RSTimeUnit.GAME_TICKS));
            }
        }
        if (this.config.showArceuusCooldown()) {
            int magicLevel = this.client.getRealSkillLevel(Skill.MAGIC);
            if (message.endsWith(MARK_OF_DARKNESS_MESSAGE)) {
                this.createGameTimer(GameTimer.MARK_OF_DARKNESS_COOLDOWN, Duration.of(magicLevel - 10, RSTimeUnit.GAME_TICKS));
            }
        }
        if (TZHAAR_PAUSED_MESSAGE.matcher(message).find()) {
            log.debug("Pausing tzhaar timer");
            this.config.tzhaarLastTime(Instant.now());
            if (this.config.showTzhaarTimers()) {
                this.createTzhaarTimer();
            }
            return;
        }
        Matcher matcher = TZHAAR_WAVE_MESSAGE.matcher(message);
        if (matcher.find()) {
            int wave = Integer.parseInt(matcher.group(1));
            if (wave == 1) {
                log.debug("Starting tzhaar timer");
                Instant now = Instant.now();
                if (this.isInInferno()) {
                    this.config.tzhaarStartTime(now.minus(Duration.ofSeconds(6L)));
                } else {
                    this.config.tzhaarStartTime(now);
                }
                this.config.tzhaarLastTime(null);
                if (this.config.showTzhaarTimers()) {
                    this.createTzhaarTimer();
                }
            } else if (this.config.tzhaarStartTime() != null && this.config.tzhaarLastTime() != null) {
                log.debug("Unpausing tzhaar timer");
                Instant tzhaarStartTime = this.config.tzhaarStartTime();
                tzhaarStartTime = tzhaarStartTime.plus(Duration.between(this.config.tzhaarLastTime(), Instant.now()));
                this.config.tzhaarStartTime(tzhaarStartTime);
                this.config.tzhaarLastTime(null);
                if (this.config.showTzhaarTimers()) {
                    this.createTzhaarTimer();
                }
            }
        }
        if (message.equals(SILK_DRESSING_MESSAGE) && this.config.showSilkDressing()) {
            this.createGameTimer(GameTimer.SILK_DRESSING);
        }
        if (message.equals(BLESSED_CRYSTAL_SCARAB_MESSAGE) && this.config.showBlessedCrystalScarab()) {
            this.createGameTimer(GameTimer.BLESSED_CRYSTAL_SCARAB);
        }
        if (message.equals(LIQUID_ADRENALINE_MESSAGE) && this.config.showLiquidAdrenaline()) {
            this.createGameTimer(GameTimer.LIQUID_ADRENALINE);
        }
    }

    private boolean isInFightCaves() {
        return this.client.getMapRegions() != null && ArrayUtils.contains(this.client.getMapRegions(), 9551);
    }

    private boolean isInInferno() {
        return this.client.getMapRegions() != null && ArrayUtils.contains(this.client.getMapRegions(), 9043);
    }

    private void createTzhaarTimer() {
        int imageItem;
        this.removeTzhaarTimer();
        int n = this.isInFightCaves() ? 6570 : (imageItem = this.isInInferno() ? 21295 : -1);
        if (imageItem == -1) {
            return;
        }
        this.tzhaarTimer = new ElapsedTimer(this.itemManager.getImage(imageItem), this, this.config.tzhaarStartTime(), this.config.tzhaarLastTime());
        this.infoBoxManager.addInfoBox(this.tzhaarTimer);
    }

    private void removeTzhaarTimer() {
        if (this.tzhaarTimer != null) {
            this.infoBoxManager.removeInfoBox(this.tzhaarTimer);
            this.tzhaarTimer = null;
        }
    }

    private void checkTeleport(int varPlayer) {
        GameTimer teleport;
        switch (varPlayer) {
            case 892: {
                teleport = GameTimer.HOME_TELEPORT;
                break;
            }
            case 888: {
                teleport = GameTimer.MINIGAME_TELEPORT;
                break;
            }
            default: {
                return;
            }
        }
        int lastTeleport = this.client.getVarpValue(varPlayer);
        long lastTeleportSeconds = (long)lastTeleport * 60L;
        Instant teleportExpireInstant = Instant.ofEpochSecond(lastTeleportSeconds).plus(teleport.getDuration());
        Duration remainingTime = Duration.between(Instant.now(), teleportExpireInstant);
        if (remainingTime.getSeconds() > 0L) {
            this.createGameTimer(teleport, remainingTime);
        } else {
            this.removeGameTimer(teleport);
        }
    }

    @Subscribe
    public void onGameTick(GameTick event) {
        Player player = this.client.getLocalPlayer();
        WorldPoint currentWorldPoint = player.getWorldLocation();
        if (this.freezeTimer != null && this.freezeTime != this.client.getTickCount() && !currentWorldPoint.equals((Object)this.lastPoint)) {
            this.removeGameTimer(this.freezeTimer.getTimer());
            this.freezeTimer = null;
        }
        this.lastPoint = currentWorldPoint;
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        switch (gameStateChanged.getGameState()) {
            case LOADING: {
                if (this.tzhaarTimer == null || this.isInFightCaves() || this.isInInferno()) break;
                this.removeTzhaarTimer();
                this.config.tzhaarStartTime(null);
                this.config.tzhaarLastTime(null);
                break;
            }
            case LOGIN_SCREEN: 
            case HOPPING: {
                if (this.config.tzhaarStartTime() != null && this.config.tzhaarLastTime() == null) {
                    this.config.tzhaarLastTime(Instant.now());
                    log.debug("Pausing tzhaar timer");
                }
                this.removeTzhaarTimer();
                this.removeGameTimer(GameTimer.TELEBLOCK);
            }
        }
    }

    @Subscribe
    public void onGraphicChanged(GraphicChanged event) {
        Actor actor = event.getActor();
        if (actor != this.client.getLocalPlayer()) {
            return;
        }
        if (this.config.showFreezes()) {
            if (actor.getGraphic() == GameTimer.BIND.getGraphicId().intValue()) {
                this.createGameTimer(GameTimer.BIND);
            }
            if (actor.getGraphic() == GameTimer.SNARE.getGraphicId().intValue()) {
                this.createGameTimer(GameTimer.SNARE);
            }
            if (actor.getGraphic() == GameTimer.ENTANGLE.getGraphicId().intValue()) {
                this.createGameTimer(GameTimer.ENTANGLE);
            }
            if (this.freezeTime == this.client.getTickCount()) {
                if (actor.getGraphic() == GameTimer.ICERUSH.getGraphicId().intValue()) {
                    this.removeGameTimer(GameTimer.ICEBARRAGE);
                    this.freezeTimer = this.createGameTimer(GameTimer.ICERUSH);
                }
                if (actor.getGraphic() == GameTimer.ICEBURST.getGraphicId().intValue()) {
                    this.removeGameTimer(GameTimer.ICEBARRAGE);
                    this.freezeTimer = this.createGameTimer(GameTimer.ICEBURST);
                }
                if (actor.getGraphic() == GameTimer.ICEBLITZ.getGraphicId().intValue()) {
                    this.removeGameTimer(GameTimer.ICEBARRAGE);
                    this.freezeTimer = this.createGameTimer(GameTimer.ICEBLITZ);
                }
            }
        }
    }

    @Subscribe
    public void onItemContainerChanged(ItemContainerChanged itemContainerChanged) {
        if (itemContainerChanged.getContainerId() != InventoryID.EQUIPMENT.getId()) {
            return;
        }
        ItemContainer container = itemContainerChanged.getItemContainer();
        Item weapon = container.getItem(EquipmentInventorySlot.WEAPON.getSlotIdx());
        if (weapon == null || STAVES_OF_THE_DEAD.contains(weapon.getId())) {
            this.removeGameTimer(GameTimer.STAFF_OF_THE_DEAD);
        }
    }

    @Subscribe
    public void onNpcDespawned(NpcDespawned npcDespawned) {
        NPC npc = npcDespawned.getNpc();
        if (!npc.isDead()) {
            return;
        }
        int npcId = npc.getId();
        if (npcId == 8062 || npcId == 8063) {
            this.removeGameTimer(GameTimer.ICEBARRAGE);
        }
    }

    @Subscribe
    public void onActorDeath(ActorDeath actorDeath) {
        if (actorDeath.getActor() == this.client.getLocalPlayer()) {
            this.infoBoxManager.removeIf(t -> t instanceof TimerTimer && ((TimerTimer)t).getTimer().isRemovedOnDeath());
        }
    }

    private TimerTimer createGameTimer(GameTimer timer) {
        if (timer.getDuration() == null) {
            throw new IllegalArgumentException("Timer with no duration");
        }
        return this.createGameTimer(timer, timer.getDuration());
    }

    private TimerTimer createGameTimer(GameTimer timer, Duration duration) {
        this.removeGameTimer(timer);
        TimerTimer t = new TimerTimer(timer, duration, this);
        switch (timer.getImageType()) {
            case SPRITE: {
                this.spriteManager.getSpriteAsync(timer.getImageId(), 0, t);
                break;
            }
            case ITEM: {
                t.setImage(this.itemManager.getImage(timer.getImageId()));
            }
        }
        t.setTooltip(timer.getDescription());
        this.infoBoxManager.addInfoBox(t);
        return t;
    }

    @VisibleForTesting
    void removeGameTimer(GameTimer timer) {
        this.infoBoxManager.removeIf(t -> t instanceof TimerTimer && ((TimerTimer)t).getTimer() == timer);
    }

    private IndicatorIndicator createGameIndicator(GameIndicator gameIndicator) {
        this.removeGameIndicator(gameIndicator);
        IndicatorIndicator indicator = new IndicatorIndicator(gameIndicator, (Plugin)this);
        switch (gameIndicator.getImageType()) {
            case SPRITE: {
                this.spriteManager.getSpriteAsync(gameIndicator.getImageId(), 0, indicator);
                break;
            }
            case ITEM: {
                indicator.setImage(this.itemManager.getImage(gameIndicator.getImageId()));
            }
        }
        indicator.setTooltip(gameIndicator.getDescription());
        this.infoBoxManager.addInfoBox(indicator);
        return indicator;
    }

    private void removeGameIndicator(GameIndicator indicator) {
        this.infoBoxManager.removeIf(t -> t instanceof IndicatorIndicator && ((IndicatorIndicator)t).getIndicator() == indicator);
    }

    private void updateVarTimer(GameTimer gameTimer, int varValue, IntUnaryOperator tickDuration) {
        this.updateVarTimer(gameTimer, varValue, i -> i == 0, tickDuration);
    }

    private void updateVarTimer(GameTimer gameTimer, int varValue, IntPredicate removeTimerCheck, IntUnaryOperator tickDuration) {
        TimerTimer timer = this.varTimers.get((Object)gameTimer);
        int ticks = tickDuration.applyAsInt(varValue);
        Duration duration = Duration.of(ticks, RSTimeUnit.GAME_TICKS);
        if (removeTimerCheck.test(varValue)) {
            this.removeVarTimer(gameTimer);
        } else if (timer == null || ticks > timer.ticks) {
            timer = this.createGameTimer(gameTimer, duration);
            timer.ticks = ticks;
            this.varTimers.put(gameTimer, timer);
        } else {
            timer.ticks = ticks;
            timer.updateDuration(duration);
        }
    }

    private void removeVarTimer(GameTimer gameTimer) {
        this.removeGameTimer(gameTimer);
        this.varTimers.remove((Object)gameTimer);
    }
}

