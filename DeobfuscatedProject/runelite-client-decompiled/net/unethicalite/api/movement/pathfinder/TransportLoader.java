/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.Direction
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 */
package net.unethicalite.api.movement.pathfinder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.FairyRingLocation;
import net.unethicalite.api.movement.pathfinder.model.MovementConstants;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.movement.pathfinder.model.dto.TransportDto;
import net.unethicalite.api.movement.pathfinder.model.requirement.Requirements;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransportLoader {
    private static final Logger log = LoggerFactory.getLogger(TransportLoader.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final WorldArea MLM = new WorldArea(3714, 5633, 60, 62, 0);
    private static final List<Transport> ALL_STATIC_TRANSPORTS = new ArrayList<Transport>();
    private static final List<Transport> LAST_TRANSPORT_LIST = new ArrayList<Transport>();

    public static void init() {
        log.info("Loading transports");
        try (InputStream stream = Walker.class.getResourceAsStream("/transports.json");){
            if (stream == null) {
                log.error("Failed to load transports.");
                return;
            }
            TransportDto[] json = GSON.fromJson(new String(stream.readAllBytes()), TransportDto[].class);
            List list = Arrays.stream(json).map(TransportDto::toTransport).collect(Collectors.toList());
            ALL_STATIC_TRANSPORTS.addAll(list);
        }
        catch (IOException e) {
            log.error("Failed to load transports.", e);
        }
        log.info("Loaded {} transports", (Object)ALL_STATIC_TRANSPORTS.size());
    }

    public static List<Transport> buildTransports() {
        return LAST_TRANSPORT_LIST;
    }

    public static void refreshTransports() {
        GameThread.invoke(() -> {
            int gold;
            List filteredStatic = ALL_STATIC_TRANSPORTS.stream().filter(Objects::nonNull).filter(it -> it.getRequirements() != null && it.getRequirements().fulfilled()).collect(Collectors.toList());
            ArrayList<Transport> transports = new ArrayList<Transport>();
            boolean princeAliCompleted = Quests.isFinished(Quest.PRINCE_ALI_RESCUE);
            int n2 = gold = Inventory.getFirst(995) != null ? Inventory.getFirst(995).getQuantity() : 0;
            if (gold >= 10 || princeAliCompleted) {
                transports.add(TransportLoader.objectTransport(new WorldPoint(3267, 3228, 0), new WorldPoint(3268, 3228, 0), TileObjects.getFirstAt(3268, 3228, 0, 44599), princeAliCompleted ? 0 : 3));
                transports.add(TransportLoader.objectTransport(new WorldPoint(3268, 3228, 0), new WorldPoint(3267, 3228, 0), TileObjects.getFirstAt(3268, 3228, 0, 44599), princeAliCompleted ? 0 : 3));
                transports.add(TransportLoader.objectTransport(new WorldPoint(3267, 3227, 0), new WorldPoint(3268, 3227, 0), TileObjects.getFirstAt(3268, 3227, 0, 44598), princeAliCompleted ? 0 : 3));
                transports.add(TransportLoader.objectTransport(new WorldPoint(3268, 3227, 0), new WorldPoint(3267, 3227, 0), TileObjects.getFirstAt(3268, 3227, 0, 44598), princeAliCompleted ? 0 : 3));
            }
            transports.add(TransportLoader.objectTransport(new WorldPoint(2910, 5480, 0), new WorldPoint(2910, 5481, 0), 11987, "Open"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2911, 5473, 0), new WorldPoint(3321, 3140, 0), 12941, "Drink-from"));
            transports.add(TransportLoader.npcTransport(new WorldPoint(3321, 3140, 0), new WorldPoint(2911, 5473, 0), 1808, null, "Teleport"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2893, 3507, 0), new WorldPoint(2893, 9907, 0), 17384, "Climb-down"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2893, 9907, 0), new WorldPoint(2893, 3507, 0), 17387, "Climb-up"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2892, 3508, 0), new WorldPoint(2893, 9907, 0), 17384, "Climb-down"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2910, 9910, 0), new WorldPoint(2910, 9909, 0), 1568, "Open"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2909, 9910, 0), new WorldPoint(2909, 9909, 0), 1569, "Open"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2910, 9910, 0), new WorldPoint(2910, 9909, 0), 1568, "Open"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2910, 9909, 0), new WorldPoint(2910, 9910, 0), 1569, "Open"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2459, 2839, 1), new WorldPoint(2457, 2839, 0), 32206, "Climb-down"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2457, 2839, 0), new WorldPoint(2459, 2839, 1), 31627, "Climb-up"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(2457, 2845, 0), new WorldPoint(1936, 9009, 1), 31626, "Enter"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(1936, 9009, 1), new WorldPoint(2457, 2845, 0), 32205, "Climb-up"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(1859, 5239, 0), new WorldPoint(1859, 5238, 0), 19207, "Open"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(1859, 5236, 0), new WorldPoint(1859, 5235, 0), 19207, "Open"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(1866, 5218, 0), new WorldPoint(1867, 5218, 0), 19207, "Open"));
            transports.add(TransportLoader.objectTransport(new WorldPoint(1869, 5218, 0), new WorldPoint(1870, 5218, 0), 19207, "Open"));
            if (gold >= 30) {
                if (Quests.isFinished(Quest.PIRATES_TREASURE)) {
                    transports.add(TransportLoader.npcTransport(new WorldPoint(3027, 3218, 0), new WorldPoint(2956, 3143, 1), 3644, null, "Pay-fare"));
                    transports.add(TransportLoader.npcTransport(new WorldPoint(2954, 3147, 0), new WorldPoint(3032, 3217, 1), 3648, null, "Pay-Fare"));
                } else {
                    transports.add(TransportLoader.npcDialogTransport(new WorldPoint(3027, 3218, 0), new WorldPoint(2956, 3143, 1), 3644, null, "Yes please."));
                    transports.add(TransportLoader.npcDialogTransport(new WorldPoint(2954, 3147, 0), new WorldPoint(3032, 3217, 1), 3648, null, "Can I journey on this ship?", "Search away, I have nothing to hide.", "Ok"));
                }
            }
            if (Worlds.inMembersWorld()) {
                boolean canFairyRing;
                transports.add(TransportLoader.objectTransport(new WorldPoint(1312, 3685, 0), new WorldPoint(1312, 10086, 0), 34405, "Enter"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1293, 10090, 0), new WorldPoint(1293, 10093, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1293, 10093, 0), new WorldPoint(1293, 10091, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1296, 10096, 0), new WorldPoint(1298, 10096, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1298, 10096, 0), new WorldPoint(1296, 10096, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1307, 10096, 0), new WorldPoint(1309, 10096, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1309, 10096, 0), new WorldPoint(1307, 10096, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1316, 10096, 0), new WorldPoint(1318, 10096, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1318, 10096, 0), new WorldPoint(1316, 10096, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1324, 10096, 0), new WorldPoint(1326, 10096, 0), 34642, "Pass"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(1326, 10096, 0), new WorldPoint(1324, 10096, 0), 34642, "Pass"));
                if (gold >= 10000) {
                    transports.add(TransportLoader.npcTransport(new WorldPoint(1782, 3458, 0), new WorldPoint(1778, 3417, 0), 7483, null, "Travel"));
                }
                transports.add(TransportLoader.npcTransport(new WorldPoint(1779, 3418, 0), new WorldPoint(1784, 3458, 0), 7484, null, "Travel"));
                if (Vars.getBit(4897) == 0) {
                    if (Vars.getBit(8063) >= 7) {
                        transports.add(TransportLoader.npcDialogTransport(new WorldPoint(3054, 3245, 0), new WorldPoint(1824, 3691, 0), 8484, null, "Can you take me to Great Kourend?"));
                    } else {
                        transports.add(TransportLoader.npcDialogTransport(new WorldPoint(3054, 3245, 0), new WorldPoint(1824, 3691, 0), 8484, null, "That's great, can you take me there please?"));
                    }
                } else if (Quests.isFinished(Quest.A_KINGDOM_DIVIDED)) {
                    transports.add(TransportLoader.npcTransport(new WorldPoint(3053, 3245, 0), new WorldPoint(1824, 3695, 1), (String n) -> n.equals("Cabin Boy Herbert"), "Port Piscarilius"));
                    transports.add(TransportLoader.npcTransport(new WorldPoint(3053, 3245, 0), new WorldPoint(1504, 3395, 1), (String n) -> n.equals("Cabin Boy Herbert"), "Land's End"));
                } else {
                    transports.add(TransportLoader.npcTransport(new WorldPoint(3054, 3245, 0), new WorldPoint(1824, 3695, 1), (String n) -> n.equals("Veos"), "Port Piscarilius"));
                }
                if (Quests.getState(Quest.LUNAR_DIPLOMACY) != QuestState.NOT_STARTED) {
                    transports.add(TransportLoader.npcTransport(new WorldPoint(2222, 3796, 2), new WorldPoint(2130, 3899, 2), 6650, null, "Travel"));
                    transports.add(TransportLoader.npcTransport(new WorldPoint(2130, 3899, 2), new WorldPoint(2222, 3796, 2), 6650, null, "Travel"));
                }
                if (Quests.isFinished(Quest.TREE_GNOME_VILLAGE)) {
                    for (SpiritTree source : MovementConstants.SPIRIT_TREES) {
                        if (source.location.equals("Gnome Stronghold") && !Quests.isFinished(Quest.THE_GRAND_TREE)) continue;
                        for (SpiritTree spiritTree : MovementConstants.SPIRIT_TREES) {
                            if (source == spiritTree) continue;
                            transports.add(TransportLoader.spritTreeTransport(source.position, spiritTree.position, spiritTree.location));
                        }
                    }
                }
                if (Quests.isFinished(Quest.THE_LOST_TRIBE)) {
                    transports.add(TransportLoader.npcTransport(new WorldPoint(3229, 9610, 0), new WorldPoint(3316, 9613, 0), 7301, null, "Mines"));
                    transports.add(TransportLoader.npcTransport(new WorldPoint(3316, 9613, 0), new WorldPoint(3229, 9610, 0), 7299, null, "Cellar"));
                }
                if (Quests.getState(Quest.TREE_GNOME_VILLAGE) != QuestState.NOT_STARTED) {
                    transports.add(TransportLoader.npcTransport(new WorldPoint(2504, 3192, 0), new WorldPoint(2515, 3159, 0), 4968, null, "Follow"));
                    transports.add(TransportLoader.npcTransport(new WorldPoint(2515, 3159, 0), new WorldPoint(2504, 3192, 0), 4968, null, "Follow"));
                }
                if (Vars.getVarp(934) >= 15) {
                    transports.add(TransportLoader.objectTransport(new WorldPoint(2328, 3496, 0), new WorldPoint(1994, 4983, 3), 19790, "Enter"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(1994, 4983, 3), new WorldPoint(2328, 3496, 0), 19891, "Exit"));
                }
                if (Quests.isFinished(Quest.THE_FREMENNIK_TRIALS) || gold >= 1000) {
                    transports.add(TransportLoader.npcTransport(new WorldPoint(2544, 3760, 0), new WorldPoint(2620, 3682, 0), 10407, null, "Rellekka"));
                    transports.add(TransportLoader.npcTransport(new WorldPoint(2620, 3682, 0), new WorldPoint(2547, 3759, 0), 5937, null, "Waterbirth Island"));
                }
                transports.add(TransportLoader.npcTransport(new WorldPoint(2620, 3692, 0), new WorldPoint(2213, 3794, 0), 3855, null, "Pirate's Cove"));
                transports.add(TransportLoader.npcTransport(new WorldPoint(2213, 3794, 0), new WorldPoint(2620, 3692, 0), 9306, null, "Rellekka"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(3075, 3653, 0), new WorldPoint(3197, 10056, 0), 31555, "Enter"));
                transports.add(TransportLoader.objectTransport(new WorldPoint(3217, 10058, 0), new WorldPoint(3102, 3656, 0), 31558, "Climb-up"));
                Player local = Players.getLocal();
                if (local != null && MLM.contains((Locatable)local)) {
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3726, 5643, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3726, 5654, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3727, 5652, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3727, 5683, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3728, 5651, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3728, 5688, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3731, 5683, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3733, 5680, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3745, 5689, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3748, 5684, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3748, 5689, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3755, 5640, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3756, 5639, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3757, 5677, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3759, 5690, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3762, 5652, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3762, 5668, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3765, 5688, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3766, 5639, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3766, 5647, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3768, 5674, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3768, 5679, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3769, 5642, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3769, 5658, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3769, 5680, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3770, 5659, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3771, 5638, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3762, 5687, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3766, 5670, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3719, 5664, 0)));
                    transports.addAll(TransportLoader.motherloadMineTransport(new WorldPoint(3720, 5665, 0)));
                }
                if (Quests.getState(Quest.PRIEST_IN_PERIL) != QuestState.IN_PROGRESS) {
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3728, 3302, 0), new WorldPoint(3738, 9703, 1), 32637, "Climb-down"));
                }
                if (Skills.getBoostedLevel(Skill.AGILITY) >= 10) {
                    transports.add(TransportLoader.objectTransport(new WorldPoint(2546, 2871, 0), new WorldPoint(2546, 2873, 0), 31757, "Climb"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(2546, 2873, 0), new WorldPoint(2546, 2871, 0), 31757, "Climb"));
                }
                if (Quests.getState(Quest.RECIPE_FOR_DISASTER) != QuestState.IN_PROGRESS) {
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3213, 3221, 0), new WorldPoint(3212, 3221, 0), 12349, "Open"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3212, 3221, 0), new WorldPoint(3213, 3221, 0), 12349, "Open"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3213, 3222, 0), new WorldPoint(3212, 3222, 0), 12350, "Open"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3212, 3222, 0), new WorldPoint(3213, 3222, 0), 12350, "Open"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3207, 3218, 0), new WorldPoint(3207, 3217, 0), 12348, "Open"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3207, 3217, 0), new WorldPoint(3207, 3218, 0), 12348, "Open"));
                }
                if (Vars.getBit(3637) >= 153) {
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3295, 3429, 0), new WorldPoint(3296, 3429, 0), 24561, "Open"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3296, 3429, 0), new WorldPoint(3295, 3429, 0), 24561, "Open"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3295, 3428, 0), new WorldPoint(3296, 3428, 0), 24561, "Open"));
                    transports.add(TransportLoader.objectTransport(new WorldPoint(3296, 3428, 0), new WorldPoint(3295, 3428, 0), 24561, "Open"));
                }
                boolean staffless = Vars.getBit(4498) > 0;
                boolean bl = canFairyRing = staffless || Equipment.contains(772, 9084) || Inventory.contains(772, 9084);
                if (canFairyRing && Quests.getState(Quest.FAIRYTALE_II__CURE_A_QUEEN) != QuestState.NOT_STARTED) {
                    for (FairyRingLocation sourceRing : FairyRingLocation.values()) {
                        for (FairyRingLocation destRing : FairyRingLocation.values()) {
                            if (sourceRing == destRing) continue;
                            transports.add(TransportLoader.fairyRingTransport(sourceRing, destRing, staffless));
                        }
                    }
                }
            }
            transports.add(TransportLoader.npcTransport(new WorldPoint(3041, 3237, 0), new WorldPoint(2834, 3331, 1), 1166, null, "Take-boat"));
            transports.add(TransportLoader.npcTransport(new WorldPoint(2834, 3335, 0), new WorldPoint(3048, 3231, 1), 1170, null, "Take-boat"));
            transports.add(TransportLoader.npcDialogTransport(new WorldPoint(2821, 3374, 0), new WorldPoint(2822, 9774, 0), 1164, null, "Well that is a risk I will have to take."));
            transports.add(TransportLoader.npcTransport(new WorldPoint(3362, 3445, 0), new WorldPoint(3724, 3808, 0), 8012, null, "Quick-Travel"));
            transports.add(TransportLoader.objectDialogTransport(new WorldPoint(3724, 3808, 0), new WorldPoint(3362, 3445, 0), 30914, new String[]{"Travel"}, "Row to the barge and travel to the Digsite."));
            for (MagicMushtree source : MovementConstants.MUSHTREES) {
                for (MagicMushtree magicMushtree : MovementConstants.MUSHTREES) {
                    if (source.position == magicMushtree.position) continue;
                    transports.add(TransportLoader.mushtreeTransport(source.position, magicMushtree.position, magicMushtree.widget));
                }
            }
            transports.add(TransportLoader.objectDialogTransport(new WorldPoint(2461, 3382, 0), new WorldPoint(2461, 3385, 0), 190, new String[]{"Open"}, "Sorry, I'm a bit busy."));
            transports.add(TransportLoader.trapDoorTransport(new WorldPoint(3405, 3506, 0), new WorldPoint(3405, 9906, 0), 1579, 1581));
            transports.add(TransportLoader.trapDoorTransport(new WorldPoint(3423, 3485, 0), new WorldPoint(3440, 9887, 0), 3432, 3433));
            transports.add(TransportLoader.trapDoorTransport(new WorldPoint(3422, 3484, 0), new WorldPoint(3440, 9887, 0), 3432, 3433));
            transports.add(TransportLoader.npcTransport(new WorldPoint(1824, 3691, 0), new WorldPoint(3055, 3242, 1), "Veos", null, "Port Sarim"));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2557, 3444, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2557, 3445, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2558, 3443, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2559, 3443, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2560, 3444, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2560, 3445, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2558, 3446, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2559, 3446, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2512, 3476, 0), new WorldPoint(2513, 3468, 0), 954, 1996));
            transports.add(TransportLoader.itemUseTransport(new WorldPoint(2512, 3466, 0), new WorldPoint(2511, 3463, 0), 954, 2020));
            transports.add(TransportLoader.charterTransport(new WorldPoint(2760, 3237, 0), new WorldPoint(2142, 3122, 0), "Trader Crewmember", "Port Tyras"));
            LAST_TRANSPORT_LIST.clear();
            LAST_TRANSPORT_LIST.addAll(filteredStatic);
            LAST_TRANSPORT_LIST.addAll(transports);
        });
    }

    public static Transport charterTransport(WorldPoint source, WorldPoint destination, String npc, String destinationName) {
        return new Transport(source, destination, 16, 5, () -> {
            Widget widget = Widgets.get(72, 0);
            if (!Widgets.isVisible(widget)) {
                NPC charter = NPCs.getNearest(npc);
                if (charter == null) {
                    return;
                }
                charter.interact(new String[]{destinationName, "Charter"});
                return;
            }
            for (Widget child : widget.getStaticChildren()) {
                String[] acts = child.getActions();
                if (acts == null || !acts[0].equals(destinationName)) continue;
                child.interact(destinationName);
                return;
            }
        });
    }

    public static Transport trapDoorTransport(WorldPoint source, WorldPoint destination, int closedId, int openedId) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            TileObject openedTrapdoor = TileObjects.getFirstSurrounding(source, 5, openedId);
            if (openedTrapdoor != null) {
                openedTrapdoor.interact(0);
                return;
            }
            TileObject closedTrapDoor = TileObjects.getFirstSurrounding(source, 5, closedId);
            if (closedTrapDoor != null) {
                closedTrapDoor.interact(0);
            }
        });
    }

    public static Transport walkTransport(WorldPoint source, WorldPoint destination, int goodId, int badId) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            TileObject good = TileObjects.getFirstAt(source, goodId);
            TileObject bad = TileObjects.getFirstAt(source, badId);
            if (bad != null) {
                return;
            }
            if (good != null) {
                Movement.walk(destination);
            }
        });
    }

    public static Transport fairyRingTransport(FairyRingLocation source, FairyRingLocation destination, boolean staffless) {
        return new Transport(source.getLocation(), destination.getLocation(), Integer.MAX_VALUE, 0, () -> {
            if (!staffless && !Equipment.contains(772, 9084)) {
                Item staff = Inventory.getFirst(772, 9084);
                staff.interact("Wield");
            }
            log.debug("Looking for fairy ring at {} to {}", (Object)source.getLocation(), (Object)destination.getLocation());
            TileObject ring = TileObjects.getFirstSurrounding(source.getLocation(), 5, "Fairy ring");
            if (ring == null) {
                log.debug("Fairy ring at {} is null", (Object)source.getLocation());
                return;
            }
            if (destination == FairyRingLocation.ZANARIS) {
                ring.interact("Zanaris");
                return;
            }
            if (ring.hasAction(a -> a != null && a.contains(destination.getCode()))) {
                ring.interact(a -> a != null && a.contains(destination.getCode()));
                return;
            }
            if (Widgets.isVisible(Widgets.get(WidgetInfo.FAIRY_RING))) {
                destination.travel();
                return;
            }
            ring.interact("Configure");
        });
    }

    public static Transport itemUseTransport(WorldPoint source, WorldPoint destination, int itemId, int objId) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            Item item = Inventory.getFirst(itemId);
            if (item == null) {
                return;
            }
            TileObject transport = TileObjects.getFirstSurrounding(source, 5, objId);
            if (transport != null) {
                item.useOn(transport);
            }
        });
    }

    public static Transport npcTransport(WorldPoint source, WorldPoint destination, int npcId, Requirements requirements, String ... actions) {
        return new Transport(source, destination, 10, 0, () -> {
            NPC npc = NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 10 && x.getId() == npcId);
            if (npc != null) {
                npc.interact(actions);
            }
        }, requirements, () -> NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 10 && x.getId() == npcId) != null);
    }

    public static Transport npcTransport(WorldPoint source, WorldPoint destination, String npcName, Requirements requirements, String ... actions) {
        return new Transport(source, destination, 10, 0, () -> {
            NPC npc = NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 8 && x.getName().equalsIgnoreCase(npcName));
            if (npc != null) {
                npc.interact(actions);
            }
        }, requirements, () -> NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 8 && x.getName().equalsIgnoreCase(npcName)) != null);
    }

    public static Transport npcTransport(WorldPoint source, WorldPoint destination, Predicate<String> npcName, String ... actions) {
        return new Transport(source, destination, 10, 0, () -> {
            NPC npc = NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 8 && npcName.test(x.getName()));
            if (npc != null) {
                npc.interact(actions);
            }
        }, null, () -> NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 8 && npcName.test(x.getName())) != null);
    }

    public static Transport npcDialogTransport(WorldPoint source, WorldPoint destination, int npcId, Requirements requirements, String ... chatOptions) {
        return new Transport(source, destination, 10, 0, () -> {
            if (Dialog.canContinue()) {
                Dialog.continueSpace();
                return;
            }
            if (Dialog.isViewingOptions()) {
                if (Dialog.chooseOption(chatOptions)) {
                    return;
                }
                return;
            }
            NPC npc = NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 10 && x.getId() == npcId);
            if (npc != null) {
                npc.interact(0);
            }
        }, requirements);
    }

    public static Transport npcActionAndDialogTransport(WorldPoint source, WorldPoint destination, int npcId, Requirements requirements, String action, String ... chatOptions) {
        return new Transport(source, destination, 10, 0, () -> {
            if (Dialog.canContinue()) {
                Dialog.continueSpace();
                return;
            }
            if (Dialog.isViewingOptions()) {
                if (Dialog.chooseOption(chatOptions)) {
                    return;
                }
                return;
            }
            NPC npc = NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 10 && x.getId() == npcId);
            if (npc != null) {
                npc.interact(action);
            }
        }, requirements);
    }

    public static Transport npcDialogTransport(WorldPoint source, WorldPoint destination, String npcName, Requirements requirements, String ... chatOptions) {
        return new Transport(source, destination, 10, 0, () -> {
            if (Dialog.canContinue()) {
                Dialog.continueSpace();
                return;
            }
            if (Dialog.isViewingOptions()) {
                if (Dialog.chooseOption(chatOptions)) {
                    return;
                }
                return;
            }
            NPC npc = NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 10 && x.getName().equals(npcName));
            if (npc != null) {
                npc.interact(0);
            }
        }, requirements);
    }

    public static List<Transport> motherloadMineTransport(WorldPoint rockfall) {
        return Arrays.stream(Direction.values()).map(dir -> {
            WorldPoint neighbor = Reachable.getNeighbour(dir, rockfall);
            if (!Reachable.isObstacle(neighbor)) {
                WorldPoint dest = null;
                switch (dir) {
                    case NORTH: {
                        dest = rockfall.dy(-1);
                        break;
                    }
                    case SOUTH: {
                        dest = rockfall.dy(1);
                        break;
                    }
                    case WEST: {
                        dest = rockfall.dx(1);
                        break;
                    }
                    case EAST: {
                        dest = rockfall.dx(-1);
                    }
                }
                if (dest != null) {
                    WorldPoint finalDest = dest;
                    return new Transport(neighbor, finalDest, Integer.MAX_VALUE, 0, () -> TileObjects.getAt(rockfall, x -> x.getName().equalsIgnoreCase("Rockfall")).stream().findFirst().ifPresentOrElse(obj -> obj.interact("Mine"), () -> Movement.walk(finalDest)));
                }
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

    public static Transport objectTransport(WorldPoint source, WorldPoint destination, int objId, String actions) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            TileObject first = TileObjects.getFirstAt(source, objId);
            if (first != null) {
                first.interact(actions);
                return;
            }
            TileObjects.getSurrounding(source, 5, x -> x.getId() == objId).stream().min(Comparator.comparingInt(o -> o.distanceTo(source))).ifPresent(obj -> obj.interact(actions));
        });
    }

    public static Transport dialogTransport(WorldPoint source, WorldPoint destination, String[] dialog, Transport transport) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            if (Dialog.canContinue()) {
                Dialog.continueSpace();
                return;
            }
            if (Dialog.isViewingOptions()) {
                if (Dialog.chooseOption(dialog)) {
                    return;
                }
                return;
            }
            transport.getHandler().run();
        });
    }

    public static Transport objectTransport(WorldPoint source, WorldPoint destination, int objId, String actions, Requirements requirements) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            TileObject first = TileObjects.getFirstAt(source, objId);
            if (first != null) {
                log.debug("Transport found {}", (Object)first.getWorldLocation());
                first.interact(actions);
                return;
            }
            log.debug("Transport not found {}, {}", (Object)source, (Object)objId);
            TileObjects.getSurrounding(source, 5, x -> x.getId() == objId).stream().min(Comparator.comparingInt(o -> o.distanceTo(source))).ifPresent(obj -> obj.interact(actions));
        }, requirements, () -> !TileObjects.getSurrounding(source, 5, x -> x.getId() == objId).isEmpty());
    }

    public static Transport objectTransport(WorldPoint source, WorldPoint destination, TileObject tileObject, int actionIndex) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            if (tileObject == null) {
                return;
            }
            tileObject.interact(actionIndex);
        });
    }

    public static Transport objectDialogTransport(WorldPoint source, WorldPoint destination, int objId, String[] actions, String ... chatOptions) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            if (Dialog.isOpen()) {
                if (Dialog.canContinue()) {
                    Dialog.continueSpace();
                    return;
                }
                if (Dialog.chooseOption(chatOptions)) {
                    return;
                }
                return;
            }
            TileObject transport = TileObjects.getFirstSurrounding(source, 5, objId);
            if (transport != null) {
                transport.interact(actions);
            }
        });
    }

    public static Transport slashWebTransport(WorldPoint source, WorldPoint destination) {
        return new Transport(source, destination, Integer.MAX_VALUE, 0, () -> {
            TileObject transport = TileObjects.getFirstSurrounding(source, 5, it -> it.getName() != null && it.getName().contains("Web") && it.hasAction(new String[]{"Slash"}));
            if (transport != null) {
                transport.interact("Slash");
            } else {
                Movement.walk(destination);
            }
        });
    }

    private static Transport spritTreeTransport(WorldPoint source, WorldPoint target, String location) {
        return new Transport(source, target, 5, 0, () -> {
            Widget treeWidget = Widgets.get(187, 3);
            if (Widgets.isVisible(treeWidget)) {
                Arrays.stream(treeWidget.getDynamicChildren()).filter(child -> child.getText().toLowerCase().contains(location.toLowerCase())).findFirst().ifPresent(child -> child.interact(0, MenuAction.WIDGET_CONTINUE.getId(), child.getIndex(), child.getId()));
                return;
            }
            TileObject tree = TileObjects.getFirstSurrounding(source, 5, 1293, 1294, 1295);
            if (tree != null) {
                Point point = tree.menuPoint();
                tree.interact(tree.getId(), MenuAction.GAME_OBJECT_FIRST_OPTION.getId(), point.getX(), point.getY());
            }
        });
    }

    private static Transport mushtreeTransport(WorldPoint source, WorldPoint target, WidgetInfo widget) {
        return new Transport(source, target, 5, 0, () -> {
            Widget treeWidget = Widgets.get(widget);
            if (Widgets.isVisible(treeWidget)) {
                treeWidget.interact(0, MenuAction.WIDGET_CONTINUE.getId(), treeWidget.getIndex(), treeWidget.getId());
                return;
            }
            TileObject tree = TileObjects.getFirstSurrounding(source, 5, "Magic Mushtree");
            if (tree != null) {
                tree.interact("Use");
            }
        });
    }

    public static class SpiritTree {
        private final WorldPoint position;
        private final String location;

        public SpiritTree(WorldPoint position, String location) {
            this.position = position;
            this.location = location;
        }
    }

    public static class MagicMushtree {
        private final WorldPoint position;
        private final WidgetInfo widget;

        public MagicMushtree(WorldPoint position, WidgetInfo widget) {
            this.position = position;
            this.widget = widget;
        }
    }
}

