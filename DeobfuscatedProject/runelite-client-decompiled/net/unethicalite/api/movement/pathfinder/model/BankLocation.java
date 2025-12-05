/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package net.unethicalite.api.movement.pathfinder.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Stream;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;

public enum BankLocation {
    LUMBRIDGE_BANK(new WorldArea(3207, 3215, 4, 8, 2)),
    VARROCK_WEST_BANK(new WorldArea(3180, 3433, 6, 15, 0)),
    VARROCK_EAST_BANK(new WorldArea(3250, 3419, 8, 6, 0)),
    GRAND_EXCHANGE_BANK(new WorldArea(3154, 3480, 22, 22, 0)),
    EDGEVILLE_BANK(new WorldArea(3091, 3488, 8, 12, 0)),
    FALADOR_EAST_BANK(new WorldArea(3009, 3355, 13, 4, 0)),
    FALADOR_WEST_BANK(new WorldArea(2943, 3368, 7, 6, 0)),
    DRAYNOR_BANK(new WorldArea(3092, 3240, 6, 7, 0)),
    DUEL_ARENA_BANK(new WorldArea(3380, 3267, 5, 7, 0)),
    SHANTAY_PASS_BANK(new WorldArea(3299, 3118, 11, 10, 0)),
    AL_KHARID_BANK(new WorldArea(3269, 3161, 4, 13, 0)),
    CATHERBY_BANK(new WorldArea(2806, 3438, 7, 4, 0)),
    SEERS_VILLAGE_BANK(new WorldArea(2721, 3487, 10, 7, 0)),
    ARDOUGNE_NORTH_BANK(new WorldArea(2612, 3330, 10, 6, 0)),
    ARDOUGNE_SOUTH_BANK(new WorldArea(2649, 3280, 7, 8, 0)),
    PORT_KHAZARD_BANK(new WorldArea(2658, 3156, 7, 9, 0)),
    YANILLE_BANK(new WorldArea(2609, 3088, 6, 10, 0)),
    CORSAIR_COVE_BANK(new WorldArea(2567, 2862, 7, 7, 0)),
    CASTLE_WARS_BANK(new WorldArea(2435, 3081, 12, 18, 0)),
    CRAFTING_GUILD(new WorldArea(2930, 3279, 6, 9, 0)),
    LLETYA_BANK(new WorldArea(2349, 3160, 8, 7, 0)),
    PRIF_SOUTH_BANK(new WorldArea(3295, 6059, 2, 1, 0)),
    PRIF_NORTH_BANK(new WorldArea(3257, 6107, 3, 3, 0)),
    GRAND_TREE_WEST_BANK(new WorldArea(2436, 3484, 9, 8, 1)),
    GRAND_TREE_SOUTH_BANK(new WorldArea(2448, 3476, 8, 8, 1)),
    TREE_GNOME_STRONGHOLD_BANK(new WorldArea(2441, 3414, 11, 23, 1)),
    SHILO_VILLAGE_BANK(new WorldArea(2842, 2951, 20, 8, 0)),
    NEITIZNOT_BANK(new WorldArea(2334, 3805, 6, 2, 0)),
    JATIZSO_BANK(new WorldArea(2413, 3798, 7, 7, 0)),
    BARBARIAN_OUTPOST_BANK(new WorldArea(2532, 3570, 6, 10, 0)),
    DARKMEYER_BANK(new WorldArea(3601, 3365, 9, 3, 0)),
    CHARCOAL_BURNERS_BANK(new WorldArea(1711, 3460, 14, 10, 0)),
    HOSIDIUS_BANK(new WorldArea(1748, 3594, 5, 8, 0)),
    PORT_PISCARILIUS_BANK(new WorldArea(1794, 3784, 18, 7, 0)),
    HALLOWED_SEPULCHRE_BANK(new WorldArea(2393, 5975, 15, 15, 0)),
    CANIFIS_BANK(new WorldArea(3508, 3474, 6, 10, 0)),
    BURGH_DE_ROTT_BANK(new WorldArea(3492, 3208, 10, 6, 0)),
    VER_SINHAZA_BANK(new WorldArea(3647, 3206, 7, 4, 0)),
    FEROX_ENCLAVE_BANK(new WorldArea(3127, 3627, 10, 6, 0)),
    ROGUES_DEN_BANK(new WorldArea(3040, 4965, 10, 10, 1)),
    WOODCUTTING_GUILD(new WorldArea(1588, 3474, 8, 8, 0)),
    FARMING_GUILD(new WorldArea(1248, 3738, 7, 6, 0)),
    FISHING_GUILD(new WorldArea(2583, 3418, 6, 5, 0)),
    MOUNT_KARUULM(new WorldArea(1321, 3822, 7, 5, 0)),
    FOSSIL_ISLAND_WRECK(new WorldArea(3768, 3896, 5, 5, 0)),
    FOSSIL_ISLAND_CAMP(new WorldArea(3739, 3802, 3, 4, 0)),
    ZANARIS(new WorldArea(2381, 4455, 5, 7, 0)),
    PORT_PHASMATYS(new WorldArea(3689, 3468, 3, 3, 0)),
    MYTHS_GUILD(new WorldArea(2458, 2842, 11, 10, 1)),
    CIVITAS_ILLA_FORTES_WEST(new WorldArea(1645, 3115, 6, 7, 0)),
    CIVITAS_ILLA_FORTES_EAST(new WorldArea(1776, 3091, 6, 7, 0));

    private final WorldArea area;

    private BankLocation(WorldArea area) {
        this.area = area;
    }

    public static BankLocation getNearest() {
        return Arrays.stream(BankLocation.values()).min(Comparator.comparingInt(x -> x.getArea().distanceTo2D(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    public static BankLocation getNearestPath() {
        ArrayList<BankLocation> bankLocations = new ArrayList<BankLocation>(Arrays.asList(BankLocation.values()));
        Player local = Players.getLocal();
        bankLocations.sort(Comparator.comparingInt(x -> x.getArea().distanceTo((Locatable)local)));
        List<WorldPoint> start = List.of(local.getWorldLocation());
        BankLocation best = null;
        int bestDistance = 5000000;
        for (BankLocation bankLocation : bankLocations) {
            int distance = Walker.buildPath(start, bankLocation.getArea(), true, false, bestDistance).size();
            if (distance >= bestDistance) continue;
            best = bankLocation;
            bestDistance = distance;
        }
        return best;
    }

    public static Future<BankLocation> getNearestPathAsync() {
        return CompletableFuture.supplyAsync(BankLocation::getNearestPath);
    }

    public static BankLocation getNearestCommon() {
        ArrayList<BankLocation> bankLocations = new ArrayList<BankLocation>();
        if (Inventory.contains(i -> i.getName().startsWith("Ring of duel")) || Equipment.contains(i -> i.getName().startsWith("Ring of duel"))) {
            return FEROX_ENCLAVE_BANK;
        }
        bankLocations.add(GRAND_EXCHANGE_BANK);
        bankLocations.add(CASTLE_WARS_BANK);
        bankLocations.add(SEERS_VILLAGE_BANK);
        if (Equipment.contains(item -> item.getName().contains("Fishing cape")) || Inventory.contains(item -> item.getName().contains("Fishing cape"))) {
            bankLocations.add(FISHING_GUILD);
        }
        if (Skills.getLevel(Skill.CRAFTING) > 40) {
            if (Equipment.contains(1757, 20208, 9780, 9781, 13342)) {
                bankLocations.add(CRAFTING_GUILD);
            } else if (Inventory.contains(13280, 9780, 9781)) {
                bankLocations.add(CRAFTING_GUILD);
            }
        }
        if (Inventory.contains(9810, 9811) || Equipment.contains(9810, 9811)) {
            bankLocations.add(FARMING_GUILD);
        }
        bankLocations.add(FALADOR_WEST_BANK);
        bankLocations.add(FALADOR_EAST_BANK);
        return BankLocation.getNearestFrom(bankLocations.toArray(new BankLocation[0]));
    }

    public static BankLocation getNearestFrom(BankLocation ... locations) {
        return Stream.of(locations).min(Comparator.comparingInt(x -> Static.getClient().isClientThread() ? x.getArea().distanceTo((Locatable)Players.getLocal()) : Movement.calculateDistance(x.getArea()))).orElse(null);
    }

    public WorldArea getArea() {
        return this.area;
    }
}

