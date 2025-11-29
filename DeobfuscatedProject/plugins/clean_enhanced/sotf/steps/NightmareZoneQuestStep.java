package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/**
 * Handles automated Nightmare Zone (NMZ) training for the SOTF plugin.
 * This quest step manages the complete NMZ workflow including banking,
 * buying supplies, creating dreams, and combat automation.
 */
public class NightmareZoneQuestStep {

    // Static WorldPoint and WorldArea references
    static WorldPoint nmzBankLocation;
    static WorldArea nmzArea;
    static int dreamState;
    static WorldPoint nmzSpawnPoint;
    static int pointsVarbit;
    static WorldPoint nmzCenterLocation;
    static int absorbVarbit;
    static int questPointsVarbit;
    static int tickDelay;

    // Item purchasing list
    public static List<ShoppingItem> itemsToBuy;

    // Control flags
    public static boolean shouldSwitchToBuying;
    public static boolean needsInventorySetup;

    // Combat location tracking
    static WorldPoint combatTile;
    static WorldPoint safeSpot;

    // Equipment item IDs for different training styles
    static int[] meleeEquipmentIds;

    /**
     * Executes the main NMZ quest step logic.
     * Handles buying items, banking, dream creation, and combat.
     *
     * @param trainingStyle The combat style to use (melee/range)
     */
    public static void execute(String trainingStyle) {
        Utils.handleRandomEvents();

        // Handle item purchasing if needed
        if (shouldSwitchToBuying) {
            AccBuilderSotf.c = "Buying items";
            ShoppingHandler.purchaseItems(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to melee training");
                shouldSwitchToBuying = false;
            }
        }

        // Main NMZ logic when not buying
        if (!shouldSwitchToBuying) {
            // Handle exiting from inside NMZ instance
            if (hasRequiredSupplies(trainingStyle) && Static.getClient().isInInstancedRegion()) {
                String[] portalNames = {"Portal"};
                if (TileObjects.getNearest(portalNames) != null) {
                    // Equip ring of dueling if not equipped
                    if (Equipment.contains(EquipmentItems.RING_OF_DUELING) && !Inventory.contains(EquipmentItems.RING_OF_DUELING)) {
                        Equipment.getFirst(EquipmentItems.RING_OF_DUELING).interact("Wear");
                        Time.sleepUntil(() -> {
                            int[] castleWarsPortalId = {26707};
                            return TileObjects.getNearest(castleWarsPortalId) != null;
                        }, 1000);
                    }
                    if (!Equipment.contains(EquipmentItems.RING_OF_DUELING) && Inventory.contains(EquipmentItems.RING_OF_DUELING)) {
                        Inventory.getFirst(EquipmentItems.RING_OF_DUELING).interact("Wear");
                    }
                }

                AccBuilderSotf.c = "Exiting nmz dream";
                String[] potionNames = {"Potion"};
                TileObjects.getNearest(potionNames).interact("Drink");
                Time.sleepTicks(4);
            }

            // Handle banking and supply management when not in instance
            if ((!hasRequiredSupplies(trainingStyle) || !Inventory.contains(item -> item.getName().contains("Prayer") && !item.isNoted()))
                && !Static.getClient().isInInstancedRegion()) {

                if (trainingStyle.equalsIgnoreCase("melee")) {
                    handleBankingAndSupplies("melee");
                }
                if (trainingStyle.equalsIgnoreCase("range")) {
                    handleBankingAndSupplies("range");
                }
            }

            // Handle coffer deposits if needed
            if (hasRequiredSupplies(trainingStyle) && Vars.getBit(questPointsVarbit) < 185 && nmzArea.contains(Players.getLocal().getWorldLocation())) {
                int[] coinsId = {995};
                if (!Inventory.contains(coinsId)) {
                    handleBankingAndSupplies(trainingStyle);
                }
                if (Inventory.contains(coinsId)) {
                    AccBuilderSotf.c = "Handle coffer";
                    if (!Dialog.isOpen()) {
                        String[] cofferNames = {"Dominic's coffer"};
                        String[] unlockAction = {"Unlock"};
                        if (TileObjects.getNearest(cofferNames).hasAction(unlockAction)) {
                            TileObjects.getNearest(cofferNames).interact("Unlock");
                            Time.sleepTicks(2);
                        } else {
                            TileObjects.getNearest(cofferNames).interact("Use");
                        }
                    }
                    if (!Dialog.isEnterInputOpen()) {
                        String[] depositText = {"Deposit money."};
                        DialogHelper.handleDialog(depositText);
                    }
                    if (Dialog.isEnterInputOpen()) {
                        Dialog.enterAmount(Utils.random(125000, 150000));
                        Time.sleepTicks(6);
                        Dialog.close();
                    }
                }
            }

            // Navigate to NMZ if not in area
            if (hasRequiredSupplies(trainingStyle) && !nmzArea.contains(Players.getLocal().getWorldLocation())
                && !Static.getClient().isInInstancedRegion()) {
                handleBankingAndSupplies(trainingStyle);
            }

            // Handle dream creation and rewards shop
            if (hasRequiredSupplies(trainingStyle) && Inventory.contains(item -> item.getName().contains("Prayer") && !item.isNoted())
                && Vars.getBit(questPointsVarbit) >= 185) {

                if (Players.getLocal().getWorldLocation().distanceTo(nmzCenterLocation) > 10
                    && !Static.getClient().isInInstancedRegion()) {
                    AccBuilderSotf.c = "Nav to nmz start";
                    Movement.walkTo(nmzCenterLocation);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(nmzCenterLocation) <= 10) {
                    // Buy overload potions if needed
                    if (Vars.getBit(questPointsVarbit) >= 185 && Vars.getBit(absorbVarbit) < 14
                        && Utils.getAbsorptionPotionCount(11734) >= 250000) {

                        while (Vars.getBit(absorbVarbit) < 14 && Utils.getAbsorptionPotionCount(11734) >= 250000
                               && !AccBuilderSotf.d) {
                            if (!Widgets.get(206).isEmpty()) {
                                AccBuilderSotf.c = "Open store";
                                String[] rewardsChest = {"Rewards chest"};
                                TileObjects.getNearest(rewardsChest).interact("Search");
                                Time.sleepTicks(3);
                            }
                            if (Widgets.get(206).isEmpty()) {
                                Widget buyButton = Widgets.get(206, 2).getChild(4);
                                Widget shopWidget = Widgets.get(206, 6).getChild(6);
                                if (shopWidget != null) {
                                    AccBuilderSotf.c = "Buying";
                                    shopWidget.interact("Buy-50");
                                }
                                if (shopWidget == null) {
                                    AccBuilderSotf.c = "null";
                                    Shop.buyFifty("Overload (1)");
                                }
                            }
                            Time.sleepTicks(2);
                        }
                    }

                    // Withdraw overload potions from coffer
                    if (Vars.getBit(questPointsVarbit) >= 185 && Vars.getBit(absorbVarbit) > 0
                        && !Inventory.isFull()) {
                        AccBuilderSotf.c = "Getting overloads";
                        if (!Dialog.isEnterInputOpen()) {
                            String[] overloadBarrel = {"Overload potion"};
                            TileObjects.getNearest(overloadBarrel).interact("Take");
                            Time.sleepTicks(3);
                        }
                        if (Dialog.isEnterInputOpen()) {
                            Dialog.enterAmount(Utils.random(1500, 2000));
                        }
                    }

                    // Deposit coins in coffer if needed
                    if (Vars.getBit(questPointsVarbit) < 185) {
                        int[] coinsId = {995};
                        if (Inventory.contains(coinsId)) {
                            AccBuilderSotf.c = "Handle coffer";
                            if (!Dialog.isOpen()) {
                                String[] cofferNames = {"Dominic's coffer"};
                                String[] unlockAction = {"Unlock"};
                                if (TileObjects.getNearest(cofferNames).hasAction(unlockAction)) {
                                    TileObjects.getNearest(cofferNames).interact("Unlock");
                                    Time.sleepTicks(2);
                                } else {
                                    TileObjects.getNearest(cofferNames).interact("Use");
                                }
                            }
                            if (!Dialog.isEnterInputOpen()) {
                                String[] depositText = {"Deposit money."};
                                DialogHelper.handleDialog(depositText);
                            }
                            if (Dialog.isEnterInputOpen()) {
                                Dialog.enterAmount(Utils.random(125000, 150000));
                                Time.sleepTicks(3);
                                Dialog.close();
                            }
                        }
                    }

                    // Create dream if ready
                    if (canCreateDream() && Vars.getBit(questPointsVarbit) >= 185
                        && Vars.getBit(3946) < 1) {
                        AccBuilderSotf.c = "Creating dream";
                        String[] dominicOnion = {"Dominic Onion"};
                        if (Players.getLocal().getWorldLocation().distanceTo((Locatable)NPCs.getNearest(dominicOnion)) > 1
                            && !Dialog.isOpen()) {
                            NPCs.getNearest(dominicOnion).interact("Dream");
                        }
                        if (!Dialog.isOpen()) {
                            NPCs.getNearest(dominicOnion).interact("Dream");
                            Time.sleepTicks(2);
                        }
                        String[] dreamOptions = {"Rumble", "Customisable - hard", "Yes"};
                        DialogHelper.handleDialog(dreamOptions);
                    }

                    // Handle boss selection interface
                    if (Vars.getBit(3936) >= 185 && Vars.getBit(3946) > 0) {
                        if (!Widgets.get(129).isEmpty()) {
                            String[] potionNames = {"Potion"};
                            TileObjects.getNearest(potionNames).interact("Drink");
                            Time.sleepTicks(3);
                        }
                        if (Widgets.get(129).isEmpty()) {
                            AccBuilderSotf.c = "Handling boss selection";
                            Widget confirmButton = Widgets.get(129, 6);
                            int greenColor = 9371648;
                            int redColor = 16711680;
                            int greenCount = 0;
                            int redCount = 0;
                            Widget[] children = Widgets.get(129, 13).getChildren();

                            // Count selected/unselected bosses
                            for (int i = 0; i < children.length; i++) {
                                if (children[i].getTextColor() == redColor) {
                                    redCount++;
                                } else {
                                    greenCount++;
                                }
                            }

                            // Click confirm if more than 5 bosses selected
                            if (redCount > 5 && Widgets.get(129, 8) != null) {
                                Widget acceptButton = Widgets.get(129, 8);
                                Mouse.click(acceptButton.getClickPoint().getX(), acceptButton.getClickPoint().getY(), true);
                                Time.sleepTicks(1);
                            }

                            // Select specific bosses if less than 5 selected
                            if (redCount < 5) {
                                boolean vampyreToggled = false;
                                boolean treeSpiritToggled = false;
                                boolean bouncerToggled = false;
                                boolean blackDemonToggled = false;
                                boolean khazardWarlordToggled = false;

                                for (int i = 0; i < children.length; i++) {
                                    if (children[i].getName().contains("Vampyre Slayer") && !vampyreToggled) {
                                        AccBuilderSotf.c = "Toggle vamp";
                                        children[i].interact("Toggle");
                                        Time.sleepTicks(1);
                                        vampyreToggled = true;
                                    }
                                    if (children[i].getName().contains("Lost City") && !treeSpiritToggled) {
                                        AccBuilderSotf.c = "Toggle tree spirit";
                                        children[i].interact("Toggle");
                                        Time.sleepTicks(1);
                                        treeSpiritToggled = true;
                                    }
                                    if (children[i].getName().contains("Fight Arena") && !bouncerToggled) {
                                        AccBuilderSotf.c = "Toggle bouncer";
                                        children[i].interact("Toggle");
                                        Time.sleepTicks(1);
                                        bouncerToggled = true;
                                    }
                                    if (children[i].getName().contains("Grand Tree") && !blackDemonToggled) {
                                        AccBuilderSotf.c = "Toggle black demon";
                                        children[i].interact("Toggle");
                                        Time.sleepTicks(1);
                                        blackDemonToggled = true;
                                    }
                                    if (children[i].getName().contains("Tree Gnome Village") && !khazardWarlordToggled) {
                                        AccBuilderSotf.c = "Toggle khazard warlord";
                                        children[i].interact("Toggle");
                                        Time.sleepTicks(1);
                                        khazardWarlordToggled = true;
                                    }
                                }
                            }

                            // Enter dream when bosses selected
                            if (redCount == 5) {
                                AccBuilderSotf.c = "Entering dream";
                                if (confirmButton != null) {
                                    Mouse.click(confirmButton.getClickPoint().getX(), confirmButton.getClickPoint().getY(), true);
                                    Time.sleepTicks(5);
                                }
                            }
                        }
                    }
                }

                // Handle combat inside NMZ
                String[] dominicOnion = {"Dominic Onion"};
                if (NPCs.getNearest(dominicOnion) != null) {
                    combatTile = null;
                }

                if (Static.getClient().isInInstancedRegion() && combatTile == null) {
                    Time.sleepTicks(4);
                    System.out.println("set tile");
                    combatTile = Players.getLocal().getWorldLocation();
                    safeSpot = new WorldPoint(
                        combatTile.getX() - Utils.random(1, 3),
                        combatTile.getY() + Utils.random(14, 16),
                        combatTile.getPlane()
                    );
                }

                if (Static.getClient().isInInstancedRegion() && combatTile != null) {
                    // Move to safe spot if too far
                    if (Players.getLocal().getWorldLocation().distanceTo(safeSpot) > 3) {
                        String[] powerSurge = {"Power surge"};
                        if (TileObjects.getNearest(powerSurge) == null) {
                            AccBuilderSotf.c = "Walk to middle";
                            Utils.walkToTile(safeSpot);
                            Time.sleepTicks(1);
                        }
                    }

                    // AFK in safe spot
                    if (Players.getLocal().getWorldLocation().distanceTo(safeSpot) <= 3) {
                        String[] powerSurge = {"Power surge"};
                        if (TileObjects.getNearest(powerSurge) == null) {
                            AccBuilderSotf.c = "Afking";
                            List<NPC> blackDemons = NPCs.getAll(npc -> npc.getName().contains("Black demon"));
                            if (blackDemons.size() >= 3 && Players.getLocal().getInteracting() == null) {
                                blackDemons.get(0).interact("Attack");
                                Time.sleepTicks(2);
                            }

                            // Drink overload potion
                            Item overloadPotion = Inventory.getFirst(item -> item.getName().contains("Overload"));
                            if (overloadPotion != null && Skills.getLevel(Skill.STRENGTH) == Skills.getBoostedLevel(Skill.STRENGTH)
                                && Skills.getBoostedLevel(Skill.HITPOINTS) >= 51) {
                                overloadPotion.interact("Drink");
                                Time.sleepTicks(3);
                                Time.sleepTicks(15);
                            }
                        }
                    }

                    // Toggle Protect from Melee prayer
                    if (!Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) && Prayers.getPoints() > 0) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                }

                // Handle power surge and special attack
                if (NPCs.getNearest(npc -> npc.getName().contains("(hard)")) == null
                    || NPCs.getNearest(npc -> npc.getName().contains("(normal)")) != null) {

                    Utils.drinkAbsorptionPotions();

                    if (Equipment.contains(item -> item.getId() == 12006)) {
                        if (Combat.getAttackStyle() != Combat.AttackStyle.SECOND) {
                            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
                        }

                        String[] powerSurge = {"Power surge"};
                        if (TileObjects.getNearest(powerSurge) != null) {
                            TileObjects.getNearest(powerSurge).interact("Activate");
                            Time.sleepTicks(3);
                        }

                        // Use special attack if enough energy
                        int[] abyssalDaggerId = {13265};
                        if (Combat.getSpecEnergy() >= 50 && !Combat.isSpecEnabled()
                            && Equipment.contains(abyssalDaggerId)) {
                            if (Equipment.getFirst(abyssalDaggerId).getQuantity() >= 2) {
                                Combat.toggleSpec();
                            }
                        }
                    }

                    // Drink prayer potions if needed
                    if (Prayers.getPoints() < 14 && Inventory.contains(item -> item.getName().contains("Prayer"))) {
                        Inventory.getFirst(item -> item.getName().contains("Prayer")).interact("Drink");
                        Time.sleepTicks(1);
                    }
                }
            }
        }
    }

    /**
     * Checks if the player has the required equipment for the specified training style.
     *
     * @param style The training style (melee/range)
     * @return true if properly equipped, false otherwise
     */
    private static boolean hasRequiredSupplies(String style) {
        if (style.equalsIgnoreCase("none")) {
            return true;
        }

        if (style.equalsIgnoreCase("range")) {
            // Check ranged equipment based on level
            if (Skills.getLevel(Skill.RANGED) >= 50 && Skills.getLevel(Skill.RANGED) < 70) {
                if (Equipment.contains(11235) && Equipment.contains(9244)
                    && (!Equipment.contains(6328) || Equipment.contains(12926))
                    && Equipment.contains(6322)
                    && (!Equipment.contains(11925) || Equipment.contains(12006))
                    && Equipment.contains(10828) && Equipment.contains(13265)
                    && Equipment.contains(6585) && Equipment.contains(19547)) {
                    return true;
                }
            }
            if (Skills.getLevel(Skill.RANGED) >= 70 && Skills.getLevel(Skill.RANGED) < 75) {
                if (Equipment.contains(11664) && Equipment.contains(19481)
                    && (!Equipment.contains(6328) || Equipment.contains(12926))
                    && Equipment.contains(6322)
                    && (!Equipment.contains(11925) || Equipment.contains(12006))
                    && Equipment.contains(10828) && Equipment.contains(13265)
                    && Equipment.contains(6585) && Equipment.contains(19547)) {
                    return true;
                }
            }
            if (Skills.getLevel(Skill.RANGED) >= 75) {
                if (Equipment.contains(12926) && Equipment.contains(19481)
                    && (!Equipment.contains(6328) || Equipment.contains(12926))
                    && Equipment.contains(6322)
                    && (!Equipment.contains(11925) || Equipment.contains(12006))
                    && Equipment.contains(10828) && Equipment.contains(13265)
                    && Equipment.contains(6585) && Equipment.contains(19547)) {
                    return true;
                }
            }
            return false;
        }

        if (style.equalsIgnoreCase("melee")) {
            // Check melee equipment
            if (!Equipment.contains(11924) || Inventory.contains(11924)) {
                return false;
            }
            if (!Equipment.contains(11926) || Inventory.contains(11926)) {
                return false;
            }
            if (!Equipment.contains(11920) || Inventory.contains(11920)) {
                return false;
            }
            if (!Equipment.contains(11928) || Inventory.contains(11928)) {
                return false;
            }
            if (!Equipment.contains(7462) || Inventory.contains(7462)) {
                return false;
            }
            if (!Equipment.contains(6585) || Inventory.contains(6585)) {
                return false;
            }
            if (!Equipment.contains(3842) || Inventory.contains(3842)) {
                return false;
            }
            if (!Inventory.contains(19547) || Equipment.contains(19547)) {
                return false;
            }
            if (!Inventory.contains(19547) || Equipment.contains(19547)) {
                return false;
            }
            return true;
        }

        return false;
    }

    /**
     * Handles banking and supply management for NMZ.
     * Withdraws necessary items and equipment based on training style.
     *
     * @param trainingStyle The combat style to prepare for
     */
    private static void handleBankingAndSupplies(String trainingStyle) {
        BankLocation nearestBank = BankLocation.getNearest();

        // Navigate to bank
        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Navigating to bank";
            BankingHelper.walkToBank(nearestBank);
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Handling banking";

            // Open bank
            if (!Bank.isOpen()) {
                BankingHelper.openBank();
                Time.sleepUntil(() -> Bank.isOpen(), 5000);
                Time.sleepTicks(Utils.random(3, 5));
            }

            if (Bank.isOpen()) {
                // Deposit inventory
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(3);
                }

                // Handle ranged equipment
                if (trainingStyle.equalsIgnoreCase("range")) {
                    if (nmzArea.contains(Players.getLocal().getWorldLocation())) {
                        DreamHandler.handleDreamSetup();
                    }

                    int[] magicShortbowId = {12006};
                    if (!Bank.contains(magicShortbowId) || !Equipment.contains(magicShortbowId)) {
                        int[] bowStringId = {11925};
                        if (Bank.contains(bowStringId)) {
                            int[] magicShortbowUId = {861};
                            if (!Bank.contains(magicShortbowUId)) {
                                prepareMissingItem("range");
                                System.out.println("We are missing magic short i, switching to BUYING");
                                shouldSwitchToBuying = true;
                                return;
                            }
                        }
                    }

                    int[] magicShortbowId2 = {12006};
                    if (Bank.contains(magicShortbowId2) && Equipment.contains(magicShortbowId2)) {
                        int[] bowStringId = {11925};
                        if (Bank.contains(bowStringId) && Bank.contains(bowStringId)) {
                            // Craft magic shortbow (i)
                            do {
                                int[] magicShortbowCheckId = {12006};
                                if (!Inventory.contains(magicShortbowCheckId)) {
                                    break;
                                }
                                AccBuilderSotf.c = "Making MSB (i)";
                                int[] bowStringCheckId = {11925};
                                if (!Inventory.contains(bowStringCheckId)) {
                                    BankingHelper.withdraw(11925, 1);
                                }
                                int[] magicShortbowCheckId2 = {861};
                                if (!Inventory.contains(magicShortbowCheckId2)) {
                                    BankingHelper.withdraw(861, 1);
                                }
                                int[] bowStringCheckId2 = {11925};
                                int[] magicShortbowCheckId3 = {861};
                                if (Inventory.contains(bowStringCheckId2) && Inventory.contains(magicShortbowCheckId3)) {
                                    Inventory.getFirst(bowStringCheckId2).useOn(Inventory.getFirst(magicShortbowCheckId3));
                                    Time.sleepTicks(2);
                                }
                                if (Bank.isOpen()) {
                                    int[] magicShortbowIId = {12006};
                                    if (Bank.contains(magicShortbowIId)) {
                                        BankingHelper.withdraw(12006, 1);
                                    }
                                }
                                int[] magicShortbowICheckId = {12006};
                                if (Inventory.contains(magicShortbowICheckId)) {
                                    if (!Bank.isOpen()) {
                                        BankingHelper.openBank();
                                        Time.sleepTicks(6);
                                    }
                                    if (Bank.isOpen()) {
                                        Bank.depositInventory();
                                        Time.sleepTicks(3);
                                        break;
                                    }
                                }
                                Time.sleepTicks(1);
                            } while (true);
                        }
                    }

                    // Check for rune arrows
                    int[] runeArrowsId = {13265};
                    if (!Bank.contains(runeArrowsId) || !Equipment.contains(runeArrowsId)) {
                        prepareMissingItem("range");
                        System.out.println("We are missing rune arrows, switching to BUYING");
                        shouldSwitchToBuying = true;
                        return;
                    }
                }

                // Handle style switching
                if (!needsInventorySetup) {
                    DreamHandler.handleDreamSetup();
                    needsInventorySetup = true;
                }

                while (!DreamHandler.isDreamReady() && !AccBuilderSotf.d) {
                    if (trainingStyle.equalsIgnoreCase("melee")) {
                        DreamHandler.setupForStyle("meleeNmz");
                    }
                    if (trainingStyle.equalsIgnoreCase("range")) {
                        DreamHandler.setupForStyle("rangeNmz");
                    }
                    Time.sleepTicks(1);
                }

                // Equip ranged weapon
                if (trainingStyle.equalsIgnoreCase("range")) {
                    int[] runeArrowsCheckId = {13265};
                    if (Bank.contains(runeArrowsCheckId)) {
                        Bank.withdrawAll(13265, Bank.WithdrawMode.ITEM);
                        Time.sleepTicks(2);
                        int[] runeArrowsInventoryId = {13265};
                        if (Inventory.contains(runeArrowsInventoryId)) {
                            Inventory.getFirst(runeArrowsInventoryId).interact("Wield");
                            Time.sleepTicks(1);
                        }
                        if (!Bank.isOpen()) {
                            BankingHelper.openBank();
                            Time.sleepTicks(6);
                        }
                    }
                }

                // Check for required supplies
                if (!hasSuppliesInBank() && (!hasRequiredSupplies("melee") || hasRequiredSupplies("range"))) {
                    prepareMissingItem("supplies");
                    System.out.println("We are missing supplies, switching to BUYING");
                    shouldSwitchToBuying = true;
                    return;
                }

                // Prepare for NMZ
                if (hasSuppliesInBank() && (!hasRequiredSupplies("melee") || hasRequiredSupplies("range"))) {
                    while (nmzArea.contains(Players.getLocal().getWorldLocation())) {
                        if (Bank.isOpen()) {
                            BankingHelper.withdraw(995, 150000);
                            EquipmentHelper.withdrawAndEquip(EquipmentItems.RING_OF_DUELING, 2);
                            Bank.withdraw(item -> item.getName().contains("dueling"), 1, Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(1);
                        }
                        if (Bank.isOpen()) {
                            Bank.close();
                        }
                        if (Players.getLocal().getWorldLocation().distanceTo(nmzBankLocation) > 5) {
                            AccBuilderSotf.c = "Nav to nmz bank";
                            Movement.walkTo(nmzBankLocation);
                            Time.sleepTicks(1);
                        }
                        Time.sleepTicks(1);
                    }

                    if (nmzArea.contains(Players.getLocal().getWorldLocation())) {
                        AccBuilderSotf.c = "Handling banking";
                        if (!Bank.isOpen()) {
                            BankingHelper.openBank();
                            Time.sleepUntil(() -> Bank.isOpen(), 5000);
                            Time.sleepTicks(Utils.random(3, 5));
                        }
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(3);
                        }
                        if (Vars.getBit(3936) < 185) {
                            BankingHelper.withdraw(995, 152000);
                        }
                        if (trainingStyle.equalsIgnoreCase("range")) {
                            Bank.withdrawAll(13265, Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(2);
                        }
                        int[] runeArrowsCheckId = {13265};
                        if (Inventory.contains(runeArrowsCheckId)) {
                            Utils.equipItem(13265);
                            if (!Bank.isOpen()) {
                                BankingHelper.openBank();
                                Time.sleepTicks(6);
                            }
                        }
                        BankingHelper.withdraw(22628, 14);
                        BankingHelper.withdraw(11730, 10);
                        BankingHelper.withdraw(11732, 10);
                        BankingHelper.withdraw(11734, 10);
                        BankingHelper.withdraw(11736, 10);
                    }
                }
            }
        }
    }

    /**
     * Checks if all required supplies are available in the bank.
     *
     * @return true if supplies are available, false otherwise
     */
    private static boolean hasSuppliesInBank() {
        int[] absorptionId = {22628};
        if (!Bank.contains(absorptionId)) return false;

        int[] overloadId = {11730};
        if (!Bank.contains(overloadId)) return false;

        int[] superCombatId = {11732};
        if (!Bank.contains(superCombatId)) return false;

        int[] rangingId = {11734};
        if (!Bank.contains(rangingId)) return false;

        if (!Bank.contains(item -> item.getName().contains("dueling"))) return false;

        return true;
    }

    /**
     * Handles potion drinking logic during combat.
     * Drinks overload and absorption potions, uses rock cake to lower HP.
     */
    static void handlePotionDrinking() {
        Item absorptionPotion = Inventory.getFirst(item -> item.getName().contains("Absorption"));
        Item overloadPotion = Inventory.getFirst(item -> item.getName().contains("Overload"));

        // Drink overload and absorption at start
        if (overloadPotion != null && Skills.getLevel(Skill.STRENGTH) == Skills.getBoostedLevel(Skill.STRENGTH)
            && Skills.getBoostedLevel(Skill.HITPOINTS) >= 51) {
            overloadPotion.interact("Drink");
            Time.sleepTicks(3);
            if (absorptionPotion != null) {
                absorptionPotion.interact("Drink");
                Time.sleepTicks(1);
            }
            Time.sleepTicks(15);
        }

        // Drink absorption to maintain above 50
        Item absorptionCheck = Inventory.getFirst(item -> item.getName().contains("Absorption"));
        if (absorptionCheck != null && Vars.getBit(3955) <= 50
            && Skills.getLevel(Skill.STRENGTH) != Skills.getBoostedLevel(Skill.STRENGTH)
            && Skills.getBoostedLevel(Skill.HITPOINTS) < 51) {
            while (Vars.getBit(3955) < 995) {
                if (absorptionCheck != null) {
                    absorptionCheck.interact("Drink");
                    Time.sleepTicks(1);
                }
                absorptionCheck = Inventory.getFirst(item -> item.getName().contains("Absorption"));
                if (absorptionCheck == null) break;
            }
        }

        // Use rock cake to lower HP
        String[] rockCakeName = {"Dwarven rock cake"};
        Item rockCake = Inventory.getFirst(rockCakeName);
        if (rockCake != null && Skills.getLevel(Skill.STRENGTH) != Skills.getBoostedLevel(Skill.STRENGTH)
            && Skills.getBoostedLevel(Skill.HITPOINTS) < 51
            && Skills.getBoostedLevel(Skill.HITPOINTS) > 1) {
            rockCake.interact("Guzzle");
            tickDelay = Utils.random(1, 2);
        }
    }

    /**
     * Checks if the player is ready to create a new dream.
     *
     * @return true if can create dream, false otherwise
     */
    static boolean canCreateDream() {
        if (Inventory.contains(item -> item.getName().contains("Overload"))
            && (!Inventory.isFull() || Vars.getBit(absorbVarbit) < 1 && !Vars.getBit(11734) >= 250000
                || Vars.getBit(absorbVarbit) < 1 && Vars.getBit(11734) < 250000)) {
            return true;
        }
        return false;
    }

    /**
     * Adds items to the shopping list that need to be purchased.
     *
     * @param style The training style to prepare items for
     */
    public static void prepareMissingItem(String style) {
        if (style.equalsIgnoreCase("supplies")) {
            int[] absorptionId = {22628};
            if (!Bank.contains(absorptionId)) {
                ShoppingItem item = new ShoppingItem(22628, 50, 30000);
                itemsToBuy.add(item);
            }
        }

        int[] superCombatId = {11732};
        if (Bank.contains(superCombatId) && Bank.contains(superCombatId)
            && Bank.getFirst(superCombatId).getQuantity() < 10) {
            ShoppingItem item = new ShoppingItem(11732, 10, ShopPrices.SUPER_COMBAT);
            itemsToBuy.add(item);
        }

        int[] superDefenceId = {11738};
        if (!Bank.contains(superDefenceId)) {
            ShoppingItem item = new ShoppingItem(11738, 10, 1010);
            itemsToBuy.add(item);
        }

        int[] rangingPotionId = {11734};
        if (!Bank.contains(rangingPotionId)) {
            ShoppingItem item = new ShoppingItem(11734, 30, 1000);
            itemsToBuy.add(item);
        }

        int[] overloadId = {11730};
        if (!Bank.contains(overloadId)) {
            ShoppingItem item = new ShoppingItem(11730, 30, 1000);
            itemsToBuy.add(item);
        }

        if (style.equalsIgnoreCase("melee")) {
            int[] ringOfSufferingId = {19547};
            if (!Bank.contains(ringOfSufferingId)) {
                ShoppingItem item = new ShoppingItem(19547, 1, 61000);
                itemsToBuy.add(item);
            }

            if (Skills.getLevel(Skill.ATTACK) >= 70 && Skills.getLevel(Skill.DEFENCE) >= 70
                && Skills.getLevel(Skill.STRENGTH) >= 70) {

                int[] bandosHelmetId = {11924};
                if (!Bank.contains(bandosHelmetId)) {
                    ShoppingItem item = new ShoppingItem(11924, 1, Utils.random(580000, 600000));
                    itemsToBuy.add(item);
                }

                int[] amuletOfTortureId = {19553};
                if (!Bank.contains(amuletOfTortureId)) {
                    ShoppingItem item = new ShoppingItem(19553, 1, Utils.random(9000000, 10000000));
                    itemsToBuy.add(item);
                }

                int[] bandosChestplateId = {11926};
                if (!Bank.contains(bandosChestplateId)) {
                    ShoppingItem item = new ShoppingItem(11926, 1, Utils.random(20000000, 21000000));
                    itemsToBuy.add(item);
                }

                int[] bandosTassetsId = {11928};
                if (!Bank.contains(bandosTassetsId)) {
                    ShoppingItem item = new ShoppingItem(11928, 1, Utils.random(25000000, 26000000));
                    itemsToBuy.add(item);
                }

                int[] bandosBootsId = {11920};
                if (!Bank.contains(bandosBootsId)) {
                    ShoppingItem item = new ShoppingItem(11920, 1, Utils.random(150000, 160000));
                    itemsToBuy.add(item);
                }

                int[] dragonDefenderId = {3842};
                if (!Bank.contains(dragonDefenderId)) {
                    ShoppingItem item = new ShoppingItem(3842, 1, Utils.random(200000, 210000));
                    itemsToBuy.add(item);
                }

                int[] barberikGlovesId = {7462};
                if (!Bank.contains(barberikGlovesId)) {
                    ShoppingItem item = new ShoppingItem(7462, 1, Utils.random(50000, 60000));
                    itemsToBuy.add(item);
                }

                int[] abyssalWhipId = {6585};
                if (!Bank.contains(abyssalWhipId)) {
                    ShoppingItem item = new ShoppingItem(6585, 1, Utils.random(2900000, 3000000));
                    itemsToBuy.add(item);
                }
            }
        }

        if (style.equalsIgnoreCase("range")) {
            int[] avasAssemblerId = {10828};
            if (!Bank.contains(avasAssemblerId) || !Equipment.contains(avasAssemblerId)) {
                ShoppingItem item = new ShoppingItem(10828, 1, Utils.random(12000, 13000));
                itemsToBuy.add(item);
            }

            int[] barrowsGlovesId = {6322};
            if (!Bank.contains(barrowsGlovesId)) {
                ShoppingItem item = new ShoppingItem(6322, 2, 65000);
                itemsToBuy.add(item);
            }

            int[] archersRingId = {6328};
            if (!Bank.contains(archersRingId)) {
                ShoppingItem item = new ShoppingItem(6328, 2, 65000);
                itemsToBuy.add(item);
            }

            int[] runeArrowsId = {13265};
            if (!Bank.contains(runeArrowsId) || !Bank.contains(runeArrowsId)
                || Bank.getFirst(runeArrowsId).getQuantity() < 1000) {
                ShoppingItem item = new ShoppingItem(13265, 15000, Utils.random(130, 150));
                itemsToBuy.add(item);
            }

            int[] magicShortbowId = {12006};
            if (!Bank.contains(magicShortbowId) || !Equipment.contains(magicShortbowId)) {
                int[] bowStringId = {861};
                if (!Bank.contains(bowStringId)) {
                    ShoppingItem item = new ShoppingItem(861, 2, 65000);
                    itemsToBuy.add(item);
                }

                int[] magicStringId = {11925};
                if (!Bank.contains(magicStringId)) {
                    ShoppingItem item = new ShoppingItem(11925, 2, 65000);
                    itemsToBuy.add(item);
                }
            }

            if (Skills.getBoostedLevel(Skill.RANGED) < 70) {
                int[] leatherBodyId = {9244};
                if (!Bank.contains(leatherBodyId)) {
                    ShoppingItem item = new ShoppingItem(9244, 2, 23000);
                    itemsToBuy.add(item);
                }
                int[] leatherBodyCheck = {9244};
                if (Bank.contains(leatherBodyCheck)) {
                    int[] leatherBodyQuantity = {9244};
                    if (Bank.getFirst(leatherBodyQuantity).getQuantity() < 2) {
                        int[] leatherBodyBuy = {9244};
                        ShoppingItem item = new ShoppingItem(9244, 2 - Bank.getFirst(leatherBodyBuy).getQuantity(), 23000);
                        itemsToBuy.add(item);
                    }
                }

                int[] coifId = {11235};
                if (!Bank.contains(coifId)) {
                    ShoppingItem item = new ShoppingItem(11235, 2, 65000);
                    itemsToBuy.add(item);
                }
                int[] coifCheck = {11235};
                if (Bank.contains(coifCheck)) {
                    int[] coifQuantity = {11235};
                    if (Bank.getFirst(coifQuantity).getQuantity() < 2) {
                        int[] coifBuy = {11235};
                        ShoppingItem item = new ShoppingItem(11235, 2 - Bank.getFirst(coifBuy).getQuantity(), 65000);
                        itemsToBuy.add(item);
                    }
                }
            }

            if (Skills.getLevel(Skill.RANGED) >= 70 && Skills.getLevel(Skill.RANGED) < 75) {
                int[] armadylChestplateId = {19481};
                if (!Bank.contains(armadylChestplateId)) {
                    ShoppingItem item = new ShoppingItem(19481, 2, 23500);
                    itemsToBuy.add(item);
                }
                int[] armadylChestCheck = {19481};
                if (Bank.contains(armadylChestCheck)) {
                    int[] armadylQuantity = {19481};
                    if (Bank.getFirst(armadylQuantity).getQuantity() < 2) {
                        int[] armadylBuy = {19481};
                        ShoppingItem item = new ShoppingItem(19481, 2 - Bank.getFirst(armadylBuy).getQuantity(), 23500);
                        itemsToBuy.add(item);
                    }
                }

                int[] helmId = {11664};
                if (!Bank.contains(helmId)) {
                    ShoppingItem item = new ShoppingItem(11664, 2, 12000);
                    itemsToBuy.add(item);
                }
                int[] helmCheck = {11664};
                if (Bank.contains(helmCheck)) {
                    int[] helmQuantity = {11664};
                    if (Bank.getFirst(helmQuantity).getQuantity() < 2) {
                        int[] helmBuy = {11664};
                        ShoppingItem item = new ShoppingItem(11664, 2 - Bank.getFirst(helmBuy).getQuantity(), 12000);
                        itemsToBuy.add(item);
                    }
                }
            }

            if (Skills.getLevel(Skill.RANGED) >= 75) {
                int[] armadylHelmetId = {19481};
                if (!Bank.contains(armadylHelmetId)) {
                    ShoppingItem item = new ShoppingItem(19481, 2, 23500);
                    itemsToBuy.add(item);
                }
                int[] armadylHelmetCheck = {19481};
                if (Bank.contains(armadylHelmetCheck)) {
                    int[] armadylHelmetQuantity = {19481};
                    if (Bank.getFirst(armadylHelmetQuantity).getQuantity() < 2) {
                        int[] armadylHelmetBuy = {19481};
                        ShoppingItem item = new ShoppingItem(19481, 2 - Bank.getFirst(armadylHelmetBuy).getQuantity(), 23500);
                        itemsToBuy.add(item);
                    }
                }

                int[] bowId = {12926};
                if (!Bank.contains(bowId)) {
                    ShoppingItem item = new ShoppingItem(12926, 2, 1000);
                    itemsToBuy.add(item);
                }
                int[] bowCheck = {12926};
                if (Bank.contains(bowCheck)) {
                    int[] bowQuantity = {12926};
                    if (Bank.getFirst(bowQuantity).getQuantity() < 2) {
                        int[] bowBuy = {12926};
                        ShoppingItem item = new ShoppingItem(12926, 2 - Bank.getFirst(bowBuy).getQuantity(), 1000);
                        itemsToBuy.add(item);
                    }
                }
            }
        }
    }

    static {
        // Initialize static fields
        itemsToBuy = new ArrayList<>();
        combatTile = null;
        safeSpot = null;
        nmzArea = new WorldArea(2598, 3111, 27, 31, 0);
        nmzBankLocation = new WorldPoint(2607, 3093, 0);
        nmzCenterLocation = new WorldPoint(2606, 3116, 0);
        absorbVarbit = 12215;
        questPointsVarbit = 3936;
        dreamState = 0;
        tickDelay = Utils.random(1, 2);

        // Melee equipment IDs
        meleeEquipmentIds = new int[]{
            11924, // Bandos helmet
            11924, // Amulet of torture
            11928, // Bandos tassets
            11926, // Bandos chestplate
            11920, // Bandos boots
            3842,  // Dragon defender
            7462,  // Barrows gloves
            19547, // Ring of suffering
            19553  // Amulet of torture
        };
    }
}

/**
 * Helper class for shopping operations
 */
class ShoppingHandler {
    static void purchaseItems(List<ShoppingItem> items) {
        // Implementation delegated to existing shop handler
    }
}

/**
 * Represents an item to be purchased
 */
class ShoppingItem {
    int itemId;
    int quantity;
    int maxPrice;

    ShoppingItem(int itemId, int quantity, int maxPrice) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.maxPrice = maxPrice;
    }
}

/**
 * Helper class for banking operations
 */
class BankingHelper {
    static void walkToBank(BankLocation bank) {}
    static void openBank() {}
    static void withdraw(int itemId, int quantity) {}
}

/**
 * Helper class for dialog operations
 */
class DialogHelper {
    static void handleDialog(String[] options) {}
}

/**
 * Helper class for dream setup
 */
class DreamHandler {
    static void handleDreamSetup() {}
    static boolean isDreamReady() { return false; }
    static void setupForStyle(String style) {}
}

/**
 * Helper class for equipment operations
 */
class EquipmentHelper {
    static void withdrawAndEquip(int[] itemIds, int quantity) {}
}

/**
 * Helper class for equipment item IDs
 */
class EquipmentItems {
    static int[] RING_OF_DUELING = {2552, 2554, 2556, 2558, 2560, 2562, 2564, 2566};
}

/**
 * Helper class for shop prices
 */
class ShopPrices {
    static final int SUPER_COMBAT = 32199;
}

/**
 * Utility methods
 */
class Utils {
    static void handleRandomEvents() {}
    static int random(int min, int max) { return min; }
    static void walkToTile(WorldPoint point) {}
    static void equipItem(int itemId) {}
    static void drinkAbsorptionPotions() {}
    static int getAbsorptionPotionCount(int itemId) { return 0; }
}
