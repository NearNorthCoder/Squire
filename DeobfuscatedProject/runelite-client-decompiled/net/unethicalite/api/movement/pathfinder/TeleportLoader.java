/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ChatLineBuffer
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.MessageNode
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 */
package net.unethicalite.api.movement.pathfinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import net.runelite.api.ChatLineBuffer;
import net.runelite.api.ChatMessageType;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.MessageNode;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.House;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.FairyRingLocation;
import net.unethicalite.api.movement.pathfinder.model.MovementConstants;
import net.unethicalite.api.movement.pathfinder.model.Teleport;
import net.unethicalite.api.movement.pathfinder.model.TeleportItem;
import net.unethicalite.api.movement.pathfinder.model.TeleportSpell;
import net.unethicalite.api.movement.pathfinder.model.poh.HousePortal;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Minigames;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeleportLoader {
    private static final Logger log = LoggerFactory.getLogger(TeleportLoader.class);
    private static final Pattern WILDY_PATTERN = Pattern.compile("Okay, teleport to level [\\d,]* Wilderness\\.");
    private static final List<Teleport> LAST_TELEPORT_LIST = new ArrayList<Teleport>();
    private static final List<Teleport> CACHED_NEXUS = new ArrayList<Teleport>();
    private static final int FAIRY_MUSHROOM = 25102;
    private static final int GLOBETROTTER_PENDANT = 28765;
    private static boolean hasChronicleTeleports;

    public static List<Teleport> buildTeleports() {
        ArrayList<Teleport> teleports = new ArrayList<Teleport>();
        teleports.addAll(LAST_TELEPORT_LIST);
        teleports.addAll(TeleportLoader.buildTimedTeleports());
        return teleports;
    }

    private static List<Teleport> buildTimedTeleports() {
        return GameThread.invokeLater(() -> {
            ArrayList<Teleport> teleports = new ArrayList<Teleport>();
            if (Worlds.inMembersWorld()) {
                if (Game.getWildyLevel() <= 20 && RegionManager.useMinigameTeleports() && Minigames.canTeleport()) {
                    for (Enum enum_ : Minigames.Destination.values()) {
                        if (!((Minigames.Destination)enum_).canUse()) continue;
                        teleports.add(new Teleport(((Minigames.Destination)enum_).getLocation(), 2, () -> TeleportLoader.lambda$buildTimedTeleports$0((Minigames.Destination)enum_)));
                    }
                }
                for (Enum enum_ : TeleportSpell.values()) {
                    if (!((TeleportSpell)enum_).canCast() || ((TeleportSpell)enum_).getPoint() == null || ((TeleportSpell)enum_).getPoint().distanceTo(Players.getLocal().getWorldLocation()) <= 50) continue;
                    teleports.add(new Teleport(((TeleportSpell)enum_).getPoint(), 5, () -> TeleportLoader.lambda$buildTimedTeleports$1((TeleportSpell)enum_)));
                }
            }
            return teleports;
        });
    }

    public static void refreshTeleports() {
        GameThread.invoke(() -> {
            ArrayList<Teleport> teleports = new ArrayList<Teleport>();
            if (Worlds.inMembersWorld()) {
                if (Equipment.contains(28765)) {
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2538, 3863, 0), 'j'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3163, 3478, 0), 'k'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2996, 3375, 0), 'l'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2828, 10166, 0), 'm'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3087, 3496, 0), 'n'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2918, 3176, 0), 'o'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3105, 3251, 0), 'p'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3293, 3163, 0), 'q'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2882, 3548, 0), '9'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3191, 3367, 0), 'a'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3052, 3488, 0), 'b'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2655, 3441, 0), 'c'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2611, 3390, 0), 'd'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3050, 9763, 0), 'e'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2933, 3295, 0), 'f'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3143, 3440, 0), 'g'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(1662, 3505, 0), 'h'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(1249, 3718, 0), 'i'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3315, 3235, 0), '1'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2440, 3090, 0), '2'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3151, 3635, 0), '3'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2898, 3553, 0), '4'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2520, 3571, 0), '5'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(2964, 4382, 2), '6'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(3244, 9501, 2), '7'));
                    teleports.add(TeleportLoader.globeTrotterJewelleryTeleport(new WorldPoint(1624, 3938, 0), '8'));
                    teleports.add(TeleportLoader.globeTrotterNexusTeleport(new WorldPoint(3289, 3886, 0), '1'));
                    teleports.add(TeleportLoader.globeTrotterNexusTeleport(new WorldPoint(2770, 2699, 0), '2'));
                }
                if (Equipment.contains(25102)) {
                    for (Enum enum_ : FairyRingLocation.values()) {
                        teleports.add(TeleportLoader.fairyMushroomTeleport((FairyRingLocation)enum_));
                    }
                }
                for (Enum enum_ : TeleportItem.values()) {
                    if (((TeleportItem)enum_).getDestination() == null || !((TeleportItem)enum_).canUse() || ((TeleportItem)enum_).getDestination().distanceTo(Players.getLocal().getWorldLocation()) <= 20) continue;
                    switch (1.$SwitchMap$net$unethicalite$api$movement$pathfinder$model$TeleportItem[enum_.ordinal()]) {
                        case 1: {
                            if (Game.getWildyLevel() > 30) break;
                            teleports.add(TeleportLoader.itemTeleport((TeleportItem)enum_));
                        }
                    }
                    if (Game.getWildyLevel() > 20) continue;
                    teleports.add(TeleportLoader.itemTeleport((TeleportItem)enum_));
                }
                if (RegionManager.usePoh() && (TeleportLoader.canEnterHouse() || House.isInside())) {
                    if (RegionManager.hasMountedGlory()) {
                        teleports.add(TeleportLoader.mountedPohTeleport(new WorldPoint(3087, 3496, 0), 13523, "Edgeville"));
                        teleports.add(TeleportLoader.mountedPohTeleport(new WorldPoint(2918, 3176, 0), 13523, "Karamja"));
                        teleports.add(TeleportLoader.mountedPohTeleport(new WorldPoint(3105, 3251, 0), 13523, "Draynor Village"));
                        teleports.add(TeleportLoader.mountedPohTeleport(new WorldPoint(3293, 3163, 0), 13523, "Al Kharid"));
                    }
                    if (RegionManager.hasMountedDigsitePendant()) {
                        teleports.add(TeleportLoader.pohDigsitePendantTeleport(new WorldPoint(3341, 3445, 0), 1));
                        teleports.add(TeleportLoader.pohDigsitePendantTeleport(new WorldPoint(3766, 3870, 1), 2));
                        if (Quests.isFinished(Quest.DRAGON_SLAYER_II)) {
                            teleports.add(TeleportLoader.pohDigsitePendantTeleport(new WorldPoint(3549, 10456, 0), 3));
                        }
                    }
                    if (RegionManager.hasMountedXericsTalisman()) {
                        teleports.add(TeleportLoader.pohXericsTalismanTeleport(new WorldPoint(1576, 3530, 0), 1));
                        teleports.add(TeleportLoader.pohXericsTalismanTeleport(new WorldPoint(1752, 3566, 0), 2));
                        teleports.add(TeleportLoader.pohXericsTalismanTeleport(new WorldPoint(1504, 3817, 0), 3));
                        teleports.add(TeleportLoader.pohXericsTalismanTeleport(new WorldPoint(1640, 3674, 0), 4));
                    }
                    if (RegionManager.hasFairyRing()) {
                        boolean canFairyRing;
                        boolean staffless = Vars.getBit(4498) > 0;
                        boolean bl = canFairyRing = staffless || Equipment.contains(25102) || Equipment.contains(772, 9084) || Inventory.contains(772, 9084);
                        if (staffless || canFairyRing) {
                            for (FairyRingLocation location : FairyRingLocation.values()) {
                                teleports.add(TeleportLoader.pohFairyTeleport(location));
                            }
                        }
                    }
                    switch (RegionManager.hasJewelryBox()) {
                        case ORNATE: {
                            if (Quests.isFinished(Quest.THRONE_OF_MISCELLANIA)) {
                                teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2538, 3863, 0), 'k'));
                            }
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3163, 3478, 0), 'l'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2996, 3375, 0), 'm'));
                            if (Quests.isFinished(Quest.BETWEEN_A_ROCK)) {
                                teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2828, 10166, 0), 'n'));
                            }
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3087, 3496, 0), 'o'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2918, 3176, 0), 'p'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3105, 3251, 0), 'q'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3293, 3163, 0), 'r'));
                        }
                        case FANCY: {
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2882, 3548, 0), 'a'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3191, 3367, 0), 'b'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3052, 3488, 0), 'c'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2655, 3441, 0), 'd'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2611, 3390, 0), 'e'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3050, 9763, 0), 'f'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2933, 3295, 0), 'g'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3143, 3440, 0), 'h'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(1662, 3505, 0), 'i'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(1249, 3718, 0), 'j'));
                        }
                        case BASIC: {
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3315, 3235, 0), '1'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2440, 3090, 0), '2'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3151, 3635, 0), '3'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2898, 3553, 0), '5'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2520, 3571, 0), '6'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(2964, 4382, 2), '7'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(3244, 9501, 2), '8'));
                            teleports.add(TeleportLoader.pohWidgetTeleport(new WorldPoint(1624, 3938, 0), '9'));
                            break;
                        }
                    }
                    List<Teleport> nexusTeleports = TeleportLoader.getNexusTeleports();
                    if (!nexusTeleports.isEmpty()) {
                        CACHED_NEXUS.clear();
                        CACHED_NEXUS.addAll(nexusTeleports);
                    }
                    teleports.addAll(CACHED_NEXUS);
                    if (CACHED_NEXUS.stream().noneMatch(tp -> tp.getDestination().equals((Object)HousePortal.VARROCK.getDestination())) && RegionManager.getHousePortals().contains((Object)HousePortal.VARROCK) && Static.getClient().getVarbitValue(4480) == 1) {
                        teleports.add(TeleportLoader.pohPortalTeleport(new WorldPoint(3164, 3477, 0), "Varrock Portal", "Grand Exchange"));
                    }
                    if (CACHED_NEXUS.stream().noneMatch(tp -> tp.getDestination().equals((Object)HousePortal.CAMELOT.getDestination())) && RegionManager.getHousePortals().contains((Object)HousePortal.CAMELOT) && Static.getClient().getVarbitValue(4477) == 1) {
                        teleports.add(TeleportLoader.pohPortalTeleport(new WorldPoint(2727, 3484, 0), "Camelot Portal", "Seers' Village"));
                    }
                    RegionManager.getHousePortals().stream().filter(housePortal -> CACHED_NEXUS.stream().noneMatch(teleport -> teleport.getDestination().equals((Object)housePortal.getDestination()))).forEach(housePortal -> teleports.add(TeleportLoader.pohPortalTeleport(housePortal)));
                }
                if (Game.getWildyLevel() <= 20) {
                    if (TeleportLoader.drakanMedallion()) {
                        teleports.add(new Teleport(new WorldPoint(3649, 3230, 0), 6, () -> TeleportLoader.jewelryTeleport("Ver Sinhaza", MovementConstants.DRAKANS_MEDALLION)));
                        teleports.add(new Teleport(new WorldPoint(3592, 3337, 0), 2, () -> TeleportLoader.jewelryTeleport("Darkmeyer", MovementConstants.DRAKANS_MEDALLION)));
                    }
                    if (TeleportLoader.ringOfDueling()) {
                        teleports.add(new Teleport(new WorldPoint(3315, 3235, 0), 6, () -> TeleportLoader.jewelryTeleport("Emir's Arena", MovementConstants.RING_OF_DUELING)));
                        teleports.add(new Teleport(new WorldPoint(2440, 3090, 0), 2, () -> TeleportLoader.jewelryTeleport("Castle Wars", MovementConstants.RING_OF_DUELING)));
                        teleports.add(new Teleport(new WorldPoint(3151, 3635, 0), 2, () -> TeleportLoader.jewelryTeleport("Ferox Enclave", MovementConstants.RING_OF_DUELING)));
                    }
                    if (TeleportLoader.gamesNecklace()) {
                        teleports.add(new Teleport(new WorldPoint(2898, 3553, 0), 2, () -> TeleportLoader.jewelryTeleport("Burthorpe", MovementConstants.GAMES_NECKLACE)));
                        teleports.add(new Teleport(new WorldPoint(2520, 3571, 0), 6, () -> TeleportLoader.jewelryTeleport("Barbarian Outpost", MovementConstants.GAMES_NECKLACE)));
                        teleports.add(new Teleport(new WorldPoint(2964, 4382, 2), 2, () -> TeleportLoader.jewelryTeleport("Corporeal Beast", MovementConstants.GAMES_NECKLACE)));
                        if (Quests.getState(Quest.TEARS_OF_GUTHIX) == QuestState.FINISHED) {
                            teleports.add(new Teleport(new WorldPoint(3244, 9501, 2), 2, () -> TeleportLoader.jewelryTeleport("Tears of Guthix", MovementConstants.GAMES_NECKLACE)));
                        }
                        teleports.add(new Teleport(new WorldPoint(1624, 3938, 0), 1, () -> TeleportLoader.jewelryTeleport("Wintertodt Camp", MovementConstants.GAMES_NECKLACE)));
                    }
                    if (TeleportLoader.camulet()) {
                        if (Static.getClient().getVarbitValue(4485) != 1) {
                            teleports.add(new Teleport(new WorldPoint(3105, 9316, 2), 8, () -> TeleportLoader.jewelryTeleport("Enakhra's Temple.", MovementConstants.CAMULET)));
                        }
                        if (Static.getClient().getVarbitValue(4485) == 1) {
                            teleports.add(new Teleport(new WorldPoint(3105, 9316, 2), 8, () -> TeleportLoader.jewelryTeleport((String s) -> s.contains("Temple") && !s.contains("Entrance"), MovementConstants.CAMULET)));
                            teleports.add(new Teleport(new WorldPoint(3193, 2925, 0), 8, () -> TeleportLoader.jewelryTeleport((String s) -> s.contains("Entrance") || s.contains("Surface"), MovementConstants.CAMULET)));
                        }
                    }
                    if (TeleportLoader.desertAmulet()) {
                        teleports.add(new Teleport(new WorldPoint(3426, 2928, 0), 8, () -> TeleportLoader.jewelryTeleport("Nardah", MovementConstants.DESERT_AMULET)));
                        teleports.add(new Teleport(new WorldPoint(3324, 3122, 0), 8, () -> TeleportLoader.jewelryTeleport("Kalphite cave", MovementConstants.DESERT_AMULET)));
                    }
                    if (TeleportLoader.karamjaGloves()) {
                        teleports.add(new Teleport(new WorldPoint(2841, 9386, 0), 8, () -> TeleportLoader.jewelryTeleport("Gem Mine", MovementConstants.KARAMJA_GLOVES)));
                        if (Static.getClient().getVarbitValue(4566) == 1) {
                            teleports.add(new Teleport(new WorldPoint(2869, 2982, 1), 5, () -> TeleportLoader.jewelryTeleport("Duradel", MovementConstants.KARAMJA_GLOVES)));
                        }
                    }
                    if (TeleportLoader.necklaceOfPassage()) {
                        teleports.add(new Teleport(new WorldPoint(3114, 3179, 0), 2, () -> TeleportLoader.jewelryTeleport("Wizards' Tower", MovementConstants.NECKLACE_OF_PASSAGE)));
                        teleports.add(new Teleport(new WorldPoint(2430, 3348, 0), 2, () -> TeleportLoader.jewelryTeleport("The Outpost", MovementConstants.NECKLACE_OF_PASSAGE)));
                        teleports.add(new Teleport(new WorldPoint(3405, 3157, 0), 2, () -> TeleportLoader.jewelryTeleport("Eagle's Eyrie", MovementConstants.NECKLACE_OF_PASSAGE)));
                    }
                    if (TeleportLoader.slayerRing()) {
                        teleports.add(new Teleport(new WorldPoint(2432, 3423, 0), 2, () -> TeleportLoader.slayerRingTeleport("Teleport to the Stronghold Slayer Cave", MovementConstants.SLAYER_RING)));
                        teleports.add(new Teleport(new WorldPoint(3422, 3537, 0), 2, () -> TeleportLoader.slayerRingTeleport("Teleport to the Morytania Slayer Tower", MovementConstants.SLAYER_RING)));
                        teleports.add(new Teleport(new WorldPoint(2802, 10000, 0), 2, () -> TeleportLoader.slayerRingTeleport("Teleport to the Rellekka Slayer Caves", MovementConstants.SLAYER_RING)));
                        teleports.add(new Teleport(new WorldPoint(3185, 4601, 0), 2, () -> TeleportLoader.slayerRingTeleport("Teleport to Tarn's Lair", MovementConstants.SLAYER_RING)));
                        if (Quests.isFinished(Quest.MOURNINGS_END_PART_II)) {
                            teleports.add(new Teleport(new WorldPoint(2028, 4636, 0), 2, () -> TeleportLoader.slayerRingTeleport("Dark Beasts", MovementConstants.SLAYER_RING)));
                        }
                    }
                    if (TeleportLoader.xericsTalisman()) {
                        teleports.add(new Teleport(new WorldPoint(1576, 3530, 0), 6, () -> TeleportLoader.jewelryTeleport("Xeric's Lookout", MovementConstants.XERICS_TALISMAN)));
                        teleports.add(new Teleport(new WorldPoint(1752, 3566, 0), 6, () -> TeleportLoader.jewelryTeleport("Xeric's Glade", MovementConstants.XERICS_TALISMAN)));
                        teleports.add(new Teleport(new WorldPoint(1504, 3817, 0), 6, () -> TeleportLoader.jewelryTeleport("Xeric's Inferno", MovementConstants.XERICS_TALISMAN)));
                        teleports.add(new Teleport(new WorldPoint(1640, 3674, 0), 6, () -> TeleportLoader.jewelryTeleport("Xeric's Heart", MovementConstants.XERICS_TALISMAN)));
                    }
                    if (TeleportLoader.questCape()) {
                        teleports.add(new Teleport(new WorldPoint(2728, 3345, 0), 5, () -> TeleportLoader.menuTeleport("Teleport", "Teleport", MovementConstants.QUEST_POINT_CAPE)));
                    }
                    if (TeleportLoader.fishingCape()) {
                        teleports.add(new Teleport(new WorldPoint(2604, 3401, 0), 5, () -> TeleportLoader.menuTeleport("Fishing Guild", "Fishing Guild", MovementConstants.FISHING_CAPE)));
                    }
                    if (TeleportLoader.digsitePendant()) {
                        teleports.add(new Teleport(new WorldPoint(3341, 3445, 0), 6, () -> TeleportLoader.jewelryTeleport("Digsite", MovementConstants.DIGSITE_PENDANT)));
                        teleports.add(new Teleport(new WorldPoint(3764, 3869, 1), 6, () -> TeleportLoader.jewelryTeleport("Fossil Island", MovementConstants.DIGSITE_PENDANT)));
                        if (Quests.isFinished(Quest.DRAGON_SLAYER_II)) {
                            teleports.add(new Teleport(new WorldPoint(3549, 10456, 0), 6, () -> TeleportLoader.jewelryTeleport("Lithkren", MovementConstants.DIGSITE_PENDANT)));
                        }
                    }
                }
                if (Game.getWildyLevel() <= 30) {
                    if (TeleportLoader.combatBracelet()) {
                        teleports.add(new Teleport(new WorldPoint(2882, 3548, 0), 2, () -> TeleportLoader.jewelryTeleport("Warriors' Guild", MovementConstants.COMBAT_BRACELET)));
                        teleports.add(new Teleport(new WorldPoint(3191, 3367, 0), 2, () -> TeleportLoader.jewelryTeleport("Champions' Guild", MovementConstants.COMBAT_BRACELET)));
                        teleports.add(new Teleport(new WorldPoint(3052, 3488, 0), 2, () -> TeleportLoader.jewelryTeleport("Monastery", MovementConstants.COMBAT_BRACELET)));
                        teleports.add(new Teleport(new WorldPoint(2655, 3441, 0), 2, () -> TeleportLoader.jewelryTeleport("Ranging Guild", MovementConstants.COMBAT_BRACELET)));
                    }
                    if (TeleportLoader.skillsNecklace()) {
                        teleports.add(new Teleport(new WorldPoint(2611, 3390, 0), 6, () -> TeleportLoader.jewelryPopupTeleport("Fishing Guild", MovementConstants.SKILLS_NECKLACE)));
                        teleports.add(new Teleport(new WorldPoint(3050, 9763, 0), 6, () -> TeleportLoader.jewelryPopupTeleport("Mining Guild", MovementConstants.SKILLS_NECKLACE)));
                        teleports.add(new Teleport(new WorldPoint(2933, 3295, 0), 6, () -> TeleportLoader.jewelryPopupTeleport("Crafting Guild", MovementConstants.SKILLS_NECKLACE)));
                        teleports.add(new Teleport(new WorldPoint(3143, 3440, 0), 6, () -> TeleportLoader.jewelryPopupTeleport("Cooking Guild", MovementConstants.SKILLS_NECKLACE)));
                        teleports.add(new Teleport(new WorldPoint(1662, 3505, 0), 6, () -> TeleportLoader.jewelryPopupTeleport("Woodcutting Guild", MovementConstants.SKILLS_NECKLACE)));
                        teleports.add(new Teleport(new WorldPoint(1249, 3718, 0), 6, () -> TeleportLoader.jewelryPopupTeleport("Farming Guild", MovementConstants.SKILLS_NECKLACE)));
                    }
                    if (TeleportLoader.ringOfWealth()) {
                        teleports.add(new Teleport(new WorldPoint(3163, 3478, 0), 2, () -> TeleportLoader.jewelryTeleport("Grand Exchange", MovementConstants.RING_OF_WEALTH)));
                        teleports.add(new Teleport(new WorldPoint(2996, 3375, 0), 2, () -> TeleportLoader.jewelryTeleport("Falador", MovementConstants.RING_OF_WEALTH)));
                        if (Quests.isFinished(Quest.THRONE_OF_MISCELLANIA)) {
                            teleports.add(new Teleport(new WorldPoint(2538, 3863, 0), 2, () -> TeleportLoader.jewelryTeleport("Miscellania", MovementConstants.RING_OF_WEALTH)));
                        }
                        if (Quests.isFinished(Quest.BETWEEN_A_ROCK)) {
                            teleports.add(new Teleport(new WorldPoint(2828, 10166, 0), 2, () -> TeleportLoader.jewelryTeleport("Miscellania", MovementConstants.RING_OF_WEALTH)));
                        }
                    }
                    if (TeleportLoader.amuletOfGlory()) {
                        teleports.add(new Teleport(new WorldPoint(3087, 3496, 0), 0, () -> TeleportLoader.jewelryTeleport("Edgeville", MovementConstants.AMULET_OF_GLORY)));
                        teleports.add(new Teleport(new WorldPoint(2918, 3176, 0), 0, () -> TeleportLoader.jewelryTeleport("Karamja", MovementConstants.AMULET_OF_GLORY)));
                        teleports.add(new Teleport(new WorldPoint(3105, 3251, 0), 0, () -> TeleportLoader.jewelryTeleport("Draynor Village", MovementConstants.AMULET_OF_GLORY)));
                        teleports.add(new Teleport(new WorldPoint(3293, 3163, 0), 0, () -> TeleportLoader.jewelryTeleport("Al Kharid", MovementConstants.AMULET_OF_GLORY)));
                    }
                    if (TeleportLoader.burningAmulet()) {
                        teleports.add(new Teleport(new WorldPoint(3235, 3636, 0), 5, () -> TeleportLoader.jewelryWildernessTeleport("Chaos Temple", MovementConstants.BURNING_AMULET)));
                        teleports.add(new Teleport(new WorldPoint(3038, 3651, 0), 5, () -> TeleportLoader.jewelryWildernessTeleport("Bandit Camp", MovementConstants.BURNING_AMULET)));
                        teleports.add(new Teleport(new WorldPoint(3028, 3842, 0), 5, () -> TeleportLoader.jewelryWildernessTeleport("Lava Maze", MovementConstants.BURNING_AMULET)));
                    }
                    if (TeleportLoader.explorerRing()) {
                        teleports.add(new Teleport(new WorldPoint(3055, 3289, 0), 5, () -> TeleportLoader.menuTeleport("Teleport", "Teleport", MovementConstants.EXPLORERS_RING)));
                    }
                    if (TeleportLoader.radasBlessing()) {
                        teleports.add(new Teleport(new WorldPoint(1310, 3797, 0), 5, () -> TeleportLoader.menuTeleport("Mount Karuulm", "Mount Karuulm", MovementConstants.RADAS_BLESSING)));
                    }
                    if (TeleportLoader.ghommalsHilt()) {
                        teleports.add(new Teleport(new WorldPoint(2911, 3729, 0), 5, () -> TeleportLoader.menuTeleport("Trollheim", "Trollheim", MovementConstants.GHOMMALS_HILT)));
                    }
                    if (TeleportLoader.ardyCloak()) {
                        teleports.add(new Teleport(new WorldPoint(2666, 3376, 0), 5, () -> TeleportLoader.menuTeleport("Farm Teleport", "Ardougne Farm", MovementConstants.ARDY_CLOAK)));
                    }
                    if (TeleportLoader.monasteryCloak()) {
                        teleports.add(new Teleport(new WorldPoint(2606, 3219, 0), 5, () -> TeleportLoader.menuTeleport("Monastery Teleport", "Kandarin Monastery", MovementConstants.ARDY_CLOAK)));
                    }
                    if (TeleportLoader.chronicle()) {
                        ChatLineBuffer chatLineBuffer = (ChatLineBuffer)Static.getClient().getChatLineMap().get(ChatMessageType.GAMEMESSAGE);
                        if (chatLineBuffer == null) {
                            hasChronicleTeleports = true;
                        } else {
                            void var4_13;
                            MessageNode[] messageNodeArray = chatLineBuffer.getLines();
                            int n = messageNodeArray.length;
                            boolean bl = false;
                            while (var4_13 < n) {
                                MessageNode messageNode = messageNodeArray[var4_13];
                                if (StringUtils.contains((CharSequence)messageNode.getValue(), "Your book does not hvae any charges")) {
                                    hasChronicleTeleports = true;
                                } else if (StringUtils.contains((CharSequence)messageNode.getValue(), "charges to your book")) {
                                    hasChronicleTeleports = false;
                                }
                                ++var4_13;
                            }
                        }
                        if (hasChronicleTeleports) {
                            teleports.add(new Teleport(new WorldPoint(3202, 3357, 0), 5, () -> TeleportLoader.menuTeleport("Teleport", "Teleport", 13660)));
                        }
                    }
                    if (TeleportLoader.slayerRing()) {
                        teleports.add(new Teleport(new WorldPoint(2432, 3423, 0), 2, () -> TeleportLoader.slayerRingTeleport("Stronghold Slayer Cave", MovementConstants.SLAYER_RING)));
                        teleports.add(new Teleport(new WorldPoint(3422, 3537, 0), 2, () -> TeleportLoader.slayerRingTeleport("Slayer Tower", MovementConstants.SLAYER_RING)));
                        teleports.add(new Teleport(new WorldPoint(2802, 10000, 0), 2, () -> TeleportLoader.slayerRingTeleport("Fremennik Slayer Dungeon", MovementConstants.SLAYER_RING)));
                        teleports.add(new Teleport(new WorldPoint(3185, 4601, 0), 2, () -> TeleportLoader.slayerRingTeleport("Tarn's Lair", MovementConstants.SLAYER_RING)));
                        if (Quests.isFinished(Quest.MOURNINGS_END_PART_II)) {
                            teleports.add(new Teleport(new WorldPoint(2028, 4636, 0), 2, () -> TeleportLoader.slayerRingTeleport("Dark Beasts", MovementConstants.SLAYER_RING)));
                        }
                    }
                }
            }
            LAST_TELEPORT_LIST.clear();
            LAST_TELEPORT_LIST.addAll(teleports);
        });
    }

    private static Teleport pohXericsTalismanTeleport(WorldPoint destination, int action) {
        return new Teleport(destination, 10, () -> {
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            if (Widgets.isVisible(Widgets.get(WidgetInfo.ADVENTURE_LOG))) {
                Keyboard.type(action);
                return;
            }
            TileObject talisman = TileObjects.getNearest("Xeric's Talisman");
            if (talisman != null) {
                talisman.interact("Teleport menu");
                return;
            }
            TeleportLoader.enterHouse();
        });
    }

    private static boolean maxCape() {
        Item cape = Equipment.fromSlot(EquipmentInventorySlot.CAPE);
        return Inventory.contains(13280) || cape != null && cape.getId() == 13342;
    }

    private static boolean chronicle() {
        return Inventory.getFirst(13660) != null || Equipment.getFirst(13660) != null;
    }

    public static boolean canEnterHouse() {
        return Inventory.contains(8013) || TeleportSpell.TELEPORT_TO_HOUSE.canCast() || TeleportLoader.constructionCape() || TeleportLoader.maxCape();
    }

    public static boolean enterHouse() {
        TileObject portal;
        Item teleTab;
        if (TeleportLoader.constructionCape()) {
            TeleportLoader.menuTeleport("Tele to POH", "Tele to POH", MovementConstants.CONSTRUCTION_CAPE);
        }
        if (TeleportLoader.maxCape()) {
            TeleportLoader.menuTeleport("Teleport to house", "Tele to POH", 13280, 13342);
        }
        if (TeleportSpell.TELEPORT_TO_HOUSE.canCast()) {
            SpellBook.Standard.TELEPORT_TO_HOUSE.cast();
        }
        if ((teleTab = Inventory.getFirst(8013)) != null) {
            teleTab.interact("Break");
        }
        if ((portal = TileObjects.getNearest(to -> to.getName().equals("Portal") && to.hasAction(new String[]{"Build mode"}))) != null) {
            portal.interact("Home");
            return true;
        }
        return false;
    }

    public static void jewelryTeleport(String target, int ... ids) {
        Item inv = Inventory.getFirst(ids);
        if (inv != null) {
            if (Dialog.isViewingOptions()) {
                Dialog.chooseOption(target);
                return;
            }
            if (inv.hasAction(target::equals)) {
                inv.interact(target);
                return;
            }
            if (!Dialog.isViewingOptions() && inv.hasAction("Rub"::equals)) {
                inv.interact("Rub");
                Time.sleepTicksUntil(Dialog::isViewingOptions, 2);
                return;
            }
        }
        if (!RegionManager.useEquipmentJewellery()) {
            return;
        }
        Item equipped = Equipment.getFirst(ids);
        if (equipped != null) {
            equipped.interact(target::contains);
        }
    }

    public static void jewelryTeleport(Predicate<String> target, int ... ids) {
        Item inv = Inventory.getFirst(ids);
        if (inv != null) {
            if (Dialog.isViewingOptions()) {
                Dialog.chooseOption(target);
                return;
            }
            if (inv.hasAction(target)) {
                inv.interact(target);
                return;
            }
            if (!Dialog.isViewingOptions() && inv.hasAction("Rub"::equals)) {
                inv.interact("Rub");
                Time.sleepTicksUntil(Dialog::isViewingOptions, 2);
                return;
            }
        }
        if (!RegionManager.useEquipmentJewellery()) {
            return;
        }
        Item equipped = Equipment.getFirst(ids);
        if (equipped != null) {
            equipped.interact(target);
        }
    }

    public static Teleport pohPortalTeleport(HousePortal housePortal) {
        return new Teleport(housePortal.getDestination(), 10, () -> {
            Widget teleportInterface;
            TileObject nexusPortal;
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            if (CACHED_NEXUS.isEmpty() && (nexusPortal = TileObjects.getNearest("Portal Nexus")) != null && ((teleportInterface = Widgets.get(17, 12)) == null || teleportInterface.isHidden())) {
                nexusPortal.interact("Teleport Menu");
                return;
            }
            TileObject portal = TileObjects.getNearest(housePortal.getPortalName());
            if (portal != null) {
                portal.interact(housePortal.getPortalAction());
                return;
            }
            TeleportLoader.pohNexusTeleport(housePortal).getHandler().run();
        });
    }

    public static Teleport pohPortalTeleport(WorldPoint destination, String portalName, String portalAction) {
        return new Teleport(destination, 10, () -> {
            Widget teleportInterface;
            TileObject nexusPortal;
            if (!Movement.shouldWalk() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            log.debug("Using Nexus/Portal tp {} {}", (Object)destination, (Object)portalName);
            if (CACHED_NEXUS.isEmpty() && (nexusPortal = TileObjects.getNearest("Portal Nexus")) != null && ((teleportInterface = Widgets.get(17, 12)) == null || teleportInterface.isHidden())) {
                nexusPortal.interact("Teleport Menu");
                return;
            }
            TileObject portal = TileObjects.getNearest(portalName);
            if (portal != null) {
                portal.interact(portalAction);
                return;
            }
            TeleportLoader.enterHouse();
        });
    }

    public static List<Teleport> getNexusTeleports() {
        int[] varbitArray;
        ArrayList<Teleport> result = new ArrayList<Teleport>();
        block33: for (int varbit : varbitArray = new int[]{6672, 6673, 6674, 6675, 6676, 6677, 6678, 6679, 6680, 6681, 6682, 6683, 6684, 6685, 6686, 6568, 6569, 6582, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10102, 10103}) {
            int id = Vars.getBit(varbit);
            switch (id) {
                case 0: {
                    continue block33;
                }
                case 1: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.VARROCK));
                    if (Static.getClient().getVarbitValue(4480) != 1) continue block33;
                    result.add(TeleportLoader.pohNexusTeleport("Grand Exchange", new WorldPoint(3164, 3477, 0)));
                    continue block33;
                }
                case 2: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.LUMBRIDGE));
                    continue block33;
                }
                case 3: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.FALADOR));
                    continue block33;
                }
                case 4: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.CAMELOT));
                    if (Static.getClient().getVarbitValue(4477) != 1) continue block33;
                    result.add(TeleportLoader.pohNexusTeleport("Seers' Village", new WorldPoint(2727, 3484, 0)));
                    continue block33;
                }
                case 5: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.EAST_ARDOUGNE));
                    continue block33;
                }
                case 6: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.WATCHTOWER));
                    continue block33;
                }
                case 7: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.SENNTISTEN));
                    continue block33;
                }
                case 8: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.MARIM));
                    continue block33;
                }
                case 9: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.KHARYRLL));
                    continue block33;
                }
                case 10: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.LUNAR_ISLE));
                    continue block33;
                }
                case 11: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.KOUREND));
                    continue block33;
                }
                case 12: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.WATERBIRTH_ISLAND));
                    continue block33;
                }
                case 13: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.FISHING_GUILD));
                    continue block33;
                }
                case 14: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.ANNAKARL));
                    continue block33;
                }
                case 15: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.TROLL_STRONGHOLD));
                    continue block33;
                }
                case 16: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.CATHERBY));
                    continue block33;
                }
                case 17: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.GHORROCK));
                    continue block33;
                }
                case 18: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.CARRALLANGAR));
                    continue block33;
                }
                case 19: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.WEISS));
                    continue block33;
                }
                case 20: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.ARCEUUS_LIBRARY));
                    continue block33;
                }
                case 21: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.DRAYNOR_MANOR));
                    continue block33;
                }
                case 22: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.BATTLEFRONT));
                    continue block33;
                }
                case 23: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.MIND_ALTAR));
                    continue block33;
                }
                case 24: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.SALVE_GRAVEYARD));
                    continue block33;
                }
                case 25: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.FENKENSTRAINS_CASTLE));
                    continue block33;
                }
                case 26: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.WEST_ARDOUGNE));
                    continue block33;
                }
                case 27: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.HARMONY_ISLAND));
                    continue block33;
                }
                case 28: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.CEMETERY));
                    continue block33;
                }
                case 29: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.BARROWS));
                    continue block33;
                }
                case 30: {
                    result.add(TeleportLoader.pohNexusTeleport(HousePortal.APE_ATOLL_DUNGEON));
                }
            }
        }
        return result;
    }

    public static Teleport pohNexusTeleport(HousePortal housePortal) {
        return new Teleport(housePortal.getDestination(), 10, () -> {
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            TileObject nexusPortal = TileObjects.getNearest("Portal Nexus");
            if (nexusPortal == null) {
                TeleportLoader.enterHouse();
                return;
            }
            Widget teleportInterface = Widgets.get(17, 12);
            if (teleportInterface == null || teleportInterface.isHidden()) {
                nexusPortal.interact("Teleport Menu");
                return;
            }
            Widget[] teleportChildren = teleportInterface.getDynamicChildren();
            if (teleportChildren == null || teleportChildren.length == 0) {
                return;
            }
            Optional<Widget> optionalTeleportWidget = Arrays.stream(teleportChildren).filter(Objects::nonNull).filter(widget -> widget.getText() != null).filter(widget -> widget.getText().contains(housePortal.getNexusTarget())).findFirst();
            if (optionalTeleportWidget.isEmpty()) {
                return;
            }
            Widget teleportWidget = optionalTeleportWidget.get();
            String teleportChar = teleportWidget.getText().substring(12, 13);
            Keyboard.type(teleportChar);
        });
    }

    public static Teleport pohNexusTeleport(String nexusTarget, WorldPoint destination) {
        return new Teleport(destination, 10, () -> {
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            TileObject nexusPortal = TileObjects.getNearest("Portal Nexus");
            if (nexusPortal == null) {
                TeleportLoader.enterHouse();
                return;
            }
            Widget teleportInterface = Widgets.get(17, 16);
            if (teleportInterface == null || teleportInterface.isHidden()) {
                nexusPortal.interact("Teleport Menu");
                return;
            }
            Widget[] teleportChildren = teleportInterface.getDynamicChildren();
            if (teleportChildren == null || teleportChildren.length == 0) {
                return;
            }
            Optional<Widget> optionalTeleportWidget = Arrays.stream(teleportChildren).filter(Objects::nonNull).filter(widget -> widget.getText() != null).filter(widget -> widget.getText().contains(nexusTarget)).findFirst();
            if (optionalTeleportWidget.isEmpty()) {
                return;
            }
            Widget teleportWidget = optionalTeleportWidget.get();
            String teleportChar = teleportWidget.getText().substring(12, 13);
            Keyboard.type(teleportChar);
        });
    }

    public static void jewelryPopupTeleport(String target, int ... ids) {
        Item inv = Inventory.getFirst(ids);
        if (inv != null) {
            Widget baseWidget = Widgets.get(187, 3);
            if (Widgets.isVisible(baseWidget)) {
                Widget[] children = baseWidget.getChildren();
                if (children == null) {
                    return;
                }
                for (int i = 0; i < children.length; ++i) {
                    Widget teleportItem = children[i];
                    if (!teleportItem.getText().contains(target)) continue;
                    Keyboard.type(i + 1);
                    return;
                }
                return;
            }
            inv.interact("Rub");
            return;
        }
        if (!RegionManager.useEquipmentJewellery()) {
            return;
        }
        Item equipped = Equipment.getFirst(ids);
        if (equipped != null) {
            equipped.interact(target);
        }
    }

    public static Teleport pohFairyTeleport(FairyRingLocation location) {
        return new Teleport(location.getLocation(), 10, () -> {
            TileObject ring;
            boolean staffless;
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            if (!Static.getClient().isInInstancedRegion()) {
                TeleportLoader.enterHouse();
                return;
            }
            boolean bl = staffless = Vars.getBit(4498) > 0;
            if (!staffless && !Equipment.contains(772, 9084)) {
                Item staff = Inventory.getFirst(772, 9084);
                staff.interact("Wield");
            }
            if ((ring = TileObjects.getNearest("Fairy ring", "Spiritual Fairy Tree")) == null) {
                return;
            }
            if (location == FairyRingLocation.ZANARIS) {
                ring.interact(ring.getName().equals("Fairy ring") ? "Zanaris" : "Ring-Zanaris");
                return;
            }
            if (ring.hasAction(a -> a != null && a.contains(location.getCode()))) {
                ring.interact(a -> a != null && a.contains(location.getCode()));
                return;
            }
            if (Widgets.isVisible(Widgets.get(WidgetInfo.FAIRY_RING))) {
                location.travel();
                return;
            }
            ring.interact(ring.getName().equals("Fairy ring") ? "Configure" : "Ring-configure");
        });
    }

    public static Teleport pohDigsitePendantTeleport(WorldPoint destination, int action) {
        return new Teleport(destination, 10, () -> {
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            if (Widgets.isVisible(Widgets.get(WidgetInfo.ADVENTURE_LOG))) {
                Keyboard.type(action);
                return;
            }
            log.debug("Using Digsite Pendant Poh {} {}", (Object)destination, (Object)action);
            TileObject digsitePendant = TileObjects.getNearest("Digsite Pendant");
            if (digsitePendant != null) {
                digsitePendant.interact("Teleport menu");
                return;
            }
            TeleportLoader.enterHouse();
        });
    }

    public static void menuTeleport(String inventory, String worn, int ... ids) {
        Item inv = Inventory.getFirst(ids);
        if (inv != null) {
            inv.interact(inventory);
            return;
        }
        Item equipped = Equipment.getFirst(ids);
        if (equipped != null) {
            equipped.interact(worn);
        }
    }

    public static Teleport itemTeleport(TeleportItem teleportItem) {
        return new Teleport(teleportItem.getDestination(), 5, () -> {
            Item item = Inventory.getFirst(teleportItem.getItemId());
            if (item != null) {
                item.interact(teleportItem.getAction());
            }
        });
    }

    public static Teleport fairyMushroomTeleport(FairyRingLocation fairyRingLocation) {
        return new Teleport(fairyRingLocation.getLocation(), 5, () -> {
            if (Widgets.isVisible(Widgets.get(WidgetInfo.FAIRY_RING))) {
                fairyRingLocation.travel();
                return;
            }
            Item item = Equipment.getFirst(25102);
            if (item != null) {
                item.interact("Fairy-Ring");
            }
        });
    }

    public static Teleport pohWidgetTeleport(WorldPoint destination, char action) {
        return new Teleport(destination, 10, () -> {
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            log.debug("Using Jewelry teleport {} {}", (Object)destination, (Object)Character.valueOf(action));
            if (Widgets.isVisible(Widgets.get(590, 0))) {
                Keyboard.type(action);
                return;
            }
            TileObject box = TileObjects.getNearest(to -> to.getName() != null && to.getName().contains("Jewellery Box"));
            if (box != null) {
                box.interact("Teleport Menu");
                return;
            }
            TeleportLoader.enterHouse();
        });
    }

    public static Teleport globeTrotterJewelleryTeleport(WorldPoint destination, char action) {
        return new Teleport(destination, 10, () -> {
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            log.debug("Using Jewelry teleport {} {}", (Object)destination, (Object)Character.valueOf(action));
            if (Widgets.isVisible(Widgets.get(590, 0))) {
                Keyboard.type(action);
                return;
            }
            if (Equipment.contains(28765)) {
                Equipment.getFirst(28765).interact("Jewellery");
                return;
            }
            if (Inventory.contains(28765)) {
                Inventory.getFirst(28765).interact("Jewellery");
                return;
            }
        });
    }

    public static Teleport globeTrotterNexusTeleport(WorldPoint destination, char action) {
        return new Teleport(destination, 10, () -> {
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            log.debug("Using Nexus teleport {} {}", (Object)destination, (Object)Character.valueOf(action));
            if (Widgets.isVisible(Widgets.get(187, 0))) {
                Keyboard.type(action);
                return;
            }
            if (Equipment.contains(28765)) {
                Equipment.getFirst(28765).interact("Nexus");
                return;
            }
            if (Inventory.contains(28765)) {
                Inventory.getFirst(28765).interact("Nexus");
                return;
            }
        });
    }

    public static Teleport mountedPohTeleport(WorldPoint destination, int objId, String action) {
        return new Teleport(destination, 10, () -> {
            if (!Players.getLocal().isIdle() || Static.getClient().getGameState() == GameState.LOADING) {
                return;
            }
            log.debug("Using Mounted POH teleport {} {} {}", destination, objId, action);
            TileObject first = TileObjects.getNearest(objId);
            if (first != null) {
                first.interact(action);
                return;
            }
            TeleportLoader.enterHouse();
        });
    }

    public static void jewelryWildernessTeleport(String target, int ... ids) {
        TeleportLoader.jewelryTeleport(target, ids);
        Time.sleepTick();
        if (Dialog.isViewingOptions() && Dialog.getOptions().stream().anyMatch(it -> it.getText() != null && WILDY_PATTERN.matcher(it.getText()).matches())) {
            Dialog.chooseOption(1);
        }
    }

    public static void slayerRingTeleport(String target, int ... ids) {
        Item ring = Inventory.getFirst(ids);
        if (ring == null && RegionManager.useEquipmentJewellery()) {
            ring = Equipment.getFirst(ids);
        }
        if (ring != null) {
            if (!Dialog.isViewingOptions()) {
                ring.interact(new String[]{"Teleport", "Rub"});
                Time.sleepTicksUntil(Dialog::isViewingOptions, 2);
                return;
            }
            if (Dialog.hasOption("Teleport")) {
                Dialog.chooseOption("Teleport");
                return;
            }
            Dialog.chooseOption(target);
        }
    }

    public static boolean ringOfDueling() {
        return Inventory.getFirst(MovementConstants.RING_OF_DUELING) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.RING_OF_DUELING) != null;
    }

    public static boolean constructionCape() {
        return Inventory.getFirst(MovementConstants.CONSTRUCTION_CAPE) != null || Equipment.getFirst(MovementConstants.CONSTRUCTION_CAPE) != null;
    }

    public static boolean fishingCape() {
        return Inventory.getFirst(MovementConstants.FISHING_CAPE) != null || Equipment.getFirst(MovementConstants.FISHING_CAPE) != null;
    }

    public static boolean drakanMedallion() {
        return Inventory.getFirst(MovementConstants.DRAKANS_MEDALLION) != null || Equipment.getFirst(MovementConstants.DRAKANS_MEDALLION) != null;
    }

    public static boolean camulet() {
        return Inventory.getFirst(MovementConstants.CAMULET) != null || Equipment.getFirst(MovementConstants.CAMULET) != null;
    }

    public static boolean desertAmulet() {
        return Inventory.getFirst(MovementConstants.DESERT_AMULET) != null || Equipment.contains(MovementConstants.DESERT_AMULET);
    }

    public static boolean karamjaGloves() {
        return Inventory.getFirst(MovementConstants.KARAMJA_GLOVES) != null || Equipment.getFirst(MovementConstants.KARAMJA_GLOVES) != null;
    }

    public static boolean gamesNecklace() {
        return Inventory.getFirst(MovementConstants.GAMES_NECKLACE) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.GAMES_NECKLACE) != null;
    }

    public static boolean combatBracelet() {
        return Inventory.getFirst(MovementConstants.COMBAT_BRACELET) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.COMBAT_BRACELET) != null;
    }

    public static boolean skillsNecklace() {
        return Inventory.getFirst(MovementConstants.SKILLS_NECKLACE) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.SKILLS_NECKLACE) != null;
    }

    public static boolean ringOfWealth() {
        return Inventory.getFirst(MovementConstants.RING_OF_WEALTH) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.RING_OF_WEALTH) != null;
    }

    public static boolean amuletOfGlory() {
        return Inventory.getFirst(MovementConstants.AMULET_OF_GLORY) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.AMULET_OF_GLORY) != null;
    }

    public static boolean necklaceOfPassage() {
        return Inventory.getFirst(MovementConstants.NECKLACE_OF_PASSAGE) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.NECKLACE_OF_PASSAGE) != null;
    }

    public static boolean xericsTalisman() {
        return Inventory.getFirst(MovementConstants.XERICS_TALISMAN) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.XERICS_TALISMAN) != null;
    }

    public static boolean slayerRing() {
        return Inventory.getFirst(MovementConstants.SLAYER_RING) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.SLAYER_RING) != null;
    }

    public static boolean questCape() {
        return Inventory.getFirst(MovementConstants.QUEST_POINT_CAPE) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.QUEST_POINT_CAPE) != null;
    }

    public static boolean digsitePendant() {
        return Inventory.getFirst(MovementConstants.DIGSITE_PENDANT) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.DIGSITE_PENDANT) != null;
    }

    public static boolean burningAmulet() {
        return Inventory.getFirst(MovementConstants.BURNING_AMULET) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.BURNING_AMULET) != null;
    }

    public static boolean ardyCloak() {
        return Vars.getBit(4461) == 1 && (Inventory.getFirst(MovementConstants.ARDY_CLOAK) != null || Equipment.getFirst(MovementConstants.ARDY_CLOAK) != null);
    }

    public static boolean monasteryCloak() {
        return Inventory.getFirst(MovementConstants.ARDY_CLOAK) != null || Equipment.getFirst(MovementConstants.ARDY_CLOAK) != null;
    }

    public static boolean explorerRing() {
        int allowed = 0;
        if (Vars.getBit(4495) == 1) {
            allowed = 1;
        }
        if (Vars.getBit(4496) == 1) {
            allowed = 3;
        }
        if (Vars.getBit(4497) == 1) {
            allowed = Integer.MAX_VALUE;
        }
        if (Vars.getBit(4552) >= allowed) {
            return false;
        }
        return Inventory.getFirst(MovementConstants.EXPLORERS_RING) != null || RegionManager.useEquipmentJewellery() && Equipment.getFirst(MovementConstants.EXPLORERS_RING) != null;
    }

    public static boolean radasBlessing() {
        return Inventory.getFirst(MovementConstants.RADAS_BLESSING) != null || Equipment.getFirst(MovementConstants.RADAS_BLESSING) != null;
    }

    public static boolean ghommalsHilt() {
        return Inventory.getFirst(MovementConstants.GHOMMALS_HILT) != null || Equipment.getFirst(MovementConstants.GHOMMALS_HILT) != null;
    }

    private static /* synthetic */ void lambda$buildTimedTeleports$1(TeleportSpell teleportSpell) {
        Spell spell = teleportSpell.getSpell();
        if (teleportSpell == TeleportSpell.TELEPORT_TO_HOUSE) {
            Widget widget = Widgets.get(spell.getWidget());
            if (widget == null) {
                return;
            }
            widget.interact("Outside");
        } else {
            Magic.cast(spell);
        }
    }

    private static /* synthetic */ void lambda$buildTimedTeleports$0(Minigames.Destination tp) {
        Minigames.teleport(tp);
    }
}

