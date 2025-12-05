/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.http.api.worlds.World
 */
package net.runelite.client.plugins.squire;

import gg.squire.client.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.runelite.client.plugins.squire.runepouch.RunePouchSetup;
import net.runelite.client.plugins.worldhopper.ping.Ping;
import net.runelite.http.api.worlds.World;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankLoadouts {
    private static final Logger log = LoggerFactory.getLogger(BankLoadouts.class);
    private static final int DEFAULT_TIMEOUT = 40000;
    private static final int WITHDRAW_SLEEP_UNTIL_TIMEOUT = 1000;
    private static final int[] RUNE_POUCH_IDS = new int[]{12791, 24416, 27281, 27509};
    private static final List<Integer> BANNED_VARIATIONS = List.of(Integer.valueOf(1704), Integer.valueOf(11118), Integer.valueOf(2572));
    private static final int TICK_DELAY = 600;
    private static BankLoadout withdrawing = null;
    private static long loadoutTime = 0L;
    private static CompletableFuture<Boolean> loadoutFuture = null;
    private static Object bankLoadoutState = null;

    public static Boolean withdrawWithRetries(BankLoadout bankLoadout, int retries) {
        Client client = Static.getClient();
        if (bankLoadoutState == null) {
            bankLoadoutState = new BankLoadoutLogic();
        }
        BankLoadoutLogic loadoutLogic = (BankLoadoutLogic)bankLoadoutState;
        if (loadoutLogic.retries > retries) {
            bankLoadoutState = null;
            return false;
        }
        loadoutLogic.execute(client, bankLoadout);
        return true;
    }

    public static Boolean withdraw(BankLoadout bankLoadout) {
        CompletableFuture<Boolean> result = BankLoadouts.withdraw(bankLoadout, false);
        Time.sleepUntil(result::isDone, 40000);
        return result.join();
    }

    public static CompletableFuture<Boolean> withdraw(BankLoadout bankLoadout, boolean strictMatching) {
        World currentWorld = Static.getWorldService().getWorlds().findWorld(Static.getClient().getWorld());
        int currentWorldMS = 50;
        if (currentWorld != null) {
            currentWorldMS = Ping.ping(currentWorld);
        }
        int delayModifier = 325;
        int adaptiveDelay = currentWorldMS + delayModifier;
        loadoutTime = System.currentTimeMillis();
        loadoutFuture = CompletableFuture.supplyAsync(() -> BankLoadouts.internalWithdraw(bankLoadout, adaptiveDelay, strictMatching));
        return loadoutFuture;
    }

    private static boolean internalWithdraw(BankLoadout loadout, int adaptiveDelay, boolean strictMatching) {
        CompletableFuture<Boolean> inventoryFuture;
        Boolean invResult;
        int timeout = 10000 + adaptiveDelay * 5;
        if (!Bank.isMainTabOpen()) {
            Bank.openMainTab();
        }
        withdrawing = loadout;
        if (strictMatching) {
            if (!loadout.getEquipmentSetup().isFullyEquipped()) {
                Bank.depositEquipment();
                Time.sleep(adaptiveDelay);
                Time.sleepUntil(() -> Equipment.getAll().isEmpty(), 1000);
            }
        } else if (!loadout.getEquipmentSetup().isEquipped()) {
            Bank.depositEquipment();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(() -> Equipment.getAll().isEmpty(), 1000);
        }
        if (!Bank.Inventory.getAll().isEmpty()) {
            Bank.depositInventory();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(() -> Bank.Inventory.getAll().isEmpty(), 1000);
        }
        Time.sleepUntil(() -> BankLoadouts.loadRunePouch(loadout, adaptiveDelay), timeout);
        CompletableFuture<Boolean> equipmentFuture = CompletableFuture.supplyAsync(() -> BankLoadouts.loadEquipment(loadout, adaptiveDelay, strictMatching));
        Boolean eqResult = equipmentFuture.join();
        if (!eqResult.booleanValue()) {
            return false;
        }
        if (!Bank.isOpen()) {
            Bank.open();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(Bank::isOpen, 5000);
        }
        Time.sleep(adaptiveDelay);
        if (!Bank.Inventory.getAll().isEmpty()) {
            Bank.depositInventory();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(() -> Bank.Inventory.getAll().isEmpty(), 1000);
        }
        if (!(invResult = (inventoryFuture = CompletableFuture.supplyAsync(() -> BankLoadouts.loadInventory(loadout, adaptiveDelay, strictMatching))).join()).booleanValue()) {
            return false;
        }
        Time.sleep(adaptiveDelay);
        if (Bank.isOpen()) {
            Bank.close();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(() -> !Bank.isOpen(), 1000);
        }
        if (Dialog.isEnterInputOpen()) {
            Dialog.enterAmount(0);
        }
        return true;
    }

    private static boolean loadRunePouch(BankLoadout loadout, int adaptiveDelay) {
        RunePouchSetup runePouchSetup = loadout.getRunePouchSetup();
        Predicate<Item> runePouchPredicate = i -> i.getName().toLowerCase().contains("rune pouch") && !i.getName().toLowerCase().contains("note") && !i.isPlaceholder();
        if (runePouchSetup == null || runePouchSetup.getRunes().isEmpty() || !Bank.contains(RUNE_POUCH_IDS) || Bank.getCount(RUNE_POUCH_IDS) == 0) {
            return true;
        }
        Bank.withdrawAll(Bank.getFirst(RUNE_POUCH_IDS).getId(), Bank.WithdrawMode.ITEM);
        Time.sleep(adaptiveDelay);
        Time.sleepUntil(() -> Bank.Inventory.getCount(RUNE_POUCH_IDS) > 0, 5000);
        ArrayList<Integer> runeIDs = new ArrayList<Integer>(runePouchSetup.getRunes().keySet());
        boolean alreadySetup = false;
        for (Integer n : runeIDs) {
            Rune rune = Arrays.stream(Rune.values()).filter(r -> r.getRuneId() == n.intValue()).findFirst().orElse(null);
            if (rune == null) {
                alreadySetup = false;
                break;
            }
            if (RunePouch.getQuantity(rune, true) < runePouchSetup.getRunes().get(n)) {
                alreadySetup = false;
                break;
            }
            alreadySetup = true;
        }
        if (alreadySetup) {
            return true;
        }
        if (!BankLoadouts.runesInPouchMatchLoadout(loadout)) {
            Log.info("Rune pouch types does not match loadout");
            int[] runesInPouchBeforeEmpty = BankLoadouts.runesInRunePouch().stream().map(Rune::getRuneId).mapToInt(Integer::intValue).toArray();
            Bank.Inventory.getFirst(RUNE_POUCH_IDS).interact("Empty");
            if (runesInPouchBeforeEmpty.length != 0) {
                Time.sleep(adaptiveDelay);
                Time.sleepUntil(() -> Bank.Inventory.getAll(runesInPouchBeforeEmpty).size() == runesInPouchBeforeEmpty.length, 5000);
            }
        }
        boolean pouchIsEmpty = BankLoadouts.runesInRunePouch().isEmpty();
        for (Integer id : runeIDs) {
            Rune rune = Arrays.stream(Rune.values()).filter(r -> r.getRuneId() == id.intValue()).findFirst().orElse(null);
            if (!Bank.contains(id) || Bank.getCount(true, id) == 0) continue;
            if (pouchIsEmpty) {
                Bank.withdraw(id, (int)runePouchSetup.getRunes().get(id), Bank.WithdrawMode.ITEM);
                continue;
            }
            int quantityToWithdraw = runePouchSetup.getRunes().get(id) - RunePouch.getQuantity(rune, true);
            if (quantityToWithdraw < 0) continue;
            Bank.withdraw(id, quantityToWithdraw, Bank.WithdrawMode.ITEM);
        }
        Time.sleep(adaptiveDelay);
        Bank.close();
        Time.sleep(adaptiveDelay);
        Time.sleepUntil(() -> !Bank.isOpen(), 1000);
        Item item = Inventory.getFirst(RUNE_POUCH_IDS);
        List<Item> runesToFill = Inventory.getAll(i -> runePouchSetup.getRunes().containsKey(i.getId()));
        for (Item runeToUse : runesToFill) {
            runeToUse.useOn(item);
            Time.sleep(adaptiveDelay);
        }
        if (!Bank.isOpen()) {
            Bank.open();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(Bank::isOpen, 5000);
        }
        if (!Bank.Inventory.getAll().isEmpty()) {
            Bank.depositInventory();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(() -> Bank.Inventory.getAll().isEmpty(), 1000);
        }
        return true;
    }

    private static boolean loadEquipment(BankLoadout loadout, int adaptiveDelay, boolean strictMatching) {
        EquipmentSetup equipmentSetup = loadout.getEquipmentSetup();
        if (equipmentSetup.isFullyEquipped()) {
            log.info("Equipment is already fully equipped, skipping");
            return true;
        }
        for (int i = 0; i < equipmentSetup.getIds().length; ++i) {
            int id = equipmentSetup.getIds()[i];
            if (id <= 0) continue;
            Predicate<Item> match = BankLoadouts.matchingPredicateFor(id);
            if (BankLoadouts.loadItem(item -> item.getId() == id, equipmentSetup, id, i, adaptiveDelay) || BankLoadouts.loadItem(match, equipmentSetup, id, i, adaptiveDelay) || !strictMatching) continue;
            log.info("No equipment: {} in bank, failing due to strict matching", (Object)equipmentSetup.getNames()[i]);
            return false;
        }
        if (Bank.isOpen()) {
            Bank.close();
        }
        Time.sleepUntil(() -> equipmentSetup.getFilledSlotCount() == equipmentSetup.getInventoryItems().size(), 1000);
        int equipped = 0;
        Set<Item> items = equipmentSetup.getInventoryItems();
        for (Item item2 : items) {
            item2.interact(new String[]{"Wear", "Wield", "Equip"});
            if (++equipped != 8) continue;
            equipped = 0;
            Time.sleep(600L);
            Time.sleepUntil(() -> Equipment.contains(item2.getId()), 1000);
        }
        Time.sleepUntil(() -> strictMatching ? equipmentSetup.isFullyEquipped() : equipmentSetup.isEquipped(), 1000);
        if (!equipmentSetup.isFullyEquipped()) {
            equipmentSetup.swap();
            Time.sleepUntil(() -> strictMatching ? equipmentSetup.isFullyEquipped() : equipmentSetup.isEquipped(), 1000);
        }
        if (strictMatching && !equipmentSetup.isFullyEquipped()) {
            log.info("After equipping all, equipment is not right, failed");
            return false;
        }
        if (!Bank.isOpen()) {
            Bank.open();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(Bank::isOpen, 5000);
        }
        if (!Bank.Inventory.getAll().isEmpty()) {
            Bank.depositInventory();
            Time.sleep(adaptiveDelay);
            Time.sleepUntil(() -> Bank.Inventory.getAll().isEmpty(), 1000);
        }
        return true;
    }

    private static boolean loadItem(Predicate<Item> match, EquipmentSetup equipmentSetup, int id, int idx, long adaptiveDelay) {
        boolean equipped;
        int amount = equipmentSetup.getAmounts()[idx];
        boolean bl = equipped = Equipment.contains(match) && Equipment.getCount(true, match) >= amount;
        if (!equipped) {
            if (!Bank.contains(match) || Bank.getCount(true, match) == 0) {
                return false;
            }
            Bank.withdraw(match, amount, Bank.WithdrawMode.ITEM);
            if (!List.of(Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(10)).contains(amount)) {
                Time.sleep(adaptiveDelay);
            }
        }
        return true;
    }

    private static Predicate<Item> matchingPredicateFor(int id) {
        int mapped = ItemVariationMapping.map(id);
        ArrayList<Integer> list = new ArrayList<Integer>(ItemVariationMapping.getVariations(mapped));
        list.removeAll(BANNED_VARIATIONS);
        return item -> list.contains(item.getId());
    }

    private static boolean equipmentContains(int id) {
        ItemComposition composition = Static.getClient().getItemComposition(id);
        String name = composition.getName();
        if (name == null) {
            return Equipment.contains(id);
        }
        return Equipment.contains(i -> i.getName().toLowerCase().startsWith(name.toLowerCase()) || name.toLowerCase().startsWith(i.getName().toLowerCase()));
    }

    public static boolean loadInventory(BankLoadout loadout, int adaptiveDelay, boolean strictMatching) {
        InventorySetup inventorySetup = loadout.getInventorySetup();
        Map<Integer, Integer> inventoryMap = BankLoadouts.createMapFrom(inventorySetup);
        for (Integer id : inventoryMap.keySet()) {
            Integer amt = inventoryMap.get(id);
            Predicate<Item> match = BankLoadouts.matchingPredicateFor(id);
            boolean loadExactMatchAttempt = BankLoadouts.loadInventoryItem(i -> i.getId() == id.intValue(), id, amt, adaptiveDelay, strictMatching, inventoryMap);
            if (!loadExactMatchAttempt && !BankLoadouts.loadInventoryItem(match, id, amt, adaptiveDelay, strictMatching, inventoryMap) && strictMatching) {
                log.info("No item id: {} in bank, failing due to strict matching", (Object)match);
                return false;
            }
            log.info("Exact match attempt for {} was {}", (Object)id, (Object)loadExactMatchAttempt);
        }
        Time.sleepUntil(() -> Bank.Inventory.allMatches(inventoryMap, BankLoadouts::matchingPredicateFor), 5000);
        return !strictMatching || Bank.Inventory.allMatches(inventoryMap, BankLoadouts::matchingPredicateFor);
    }

    private static boolean loadInventoryItem(Predicate<Item> match, Integer id, Integer amt, int adaptiveDelay, boolean strictMatching, Map<Integer, Integer> inventoryMap) {
        if (!Bank.contains(match) || Bank.getCount(true, match) == 0) {
            log.info("Failing on item with id {} inventory mapping = {}", (Object)id, (Object)ItemVariationMapping.getVariations(id));
            if (strictMatching) {
                log.info("No item id: {} in bank, failing due to strict matching", (Object)match);
            }
            return false;
        }
        if (Bank.Inventory.getCount(true, match) > 0) {
            amt = amt - Bank.Inventory.getCount(true, match);
        }
        if (amt <= 0) {
            return false;
        }
        int count = Bank.getCount(true, match);
        if (amt > count) {
            log.info("Wanted {} but only had {} in bank, so withdrawing what we can of {}", amt, count, Bank.getFirst(match).getName());
            amt = Bank.getCount(true, match);
            inventoryMap.put(id, amt);
        }
        if (Bank.contains(match)) {
            Bank.withdraw(match, (int)amt, Bank.WithdrawMode.ITEM);
        }
        if (!List.of(Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(10)).contains(amt)) {
            Integer finalAmt = amt;
            Time.sleepUntil(() -> Bank.Inventory.allMatches(Map.of(id, finalAmt), BankLoadouts::matchingPredicateFor), 5000);
        }
        return true;
    }

    private static Map<Integer, Integer> createMapFrom(InventorySetup inventorySetup) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inventorySetup.getIds().length; ++i) {
            int id = inventorySetup.getIds()[i];
            if (id < 0) continue;
            if (map.containsKey(id)) {
                map.put(id, (Integer)map.get(id) + inventorySetup.getQuantities()[i]);
                continue;
            }
            map.put(id, inventorySetup.getQuantities()[i]);
        }
        return map;
    }

    private static List<Rune> runesInRunePouch() {
        ArrayList<Rune> runesInPouch = new ArrayList<Rune>();
        RunePouch.RuneSlot[] slots = RunePouch.RuneSlot.values();
        int amount = 0;
        if (Inventory.getFirst(i -> i.getName().toLowerCase().startsWith("rune pouch")) != null) {
            amount = 3;
        }
        if (Inventory.getFirst(i -> i.getName().toLowerCase().startsWith("divine rune pouch")) != null) {
            amount = 4;
        }
        if (amount == 0) {
            return Collections.emptyList();
        }
        log.debug("slots = {} {}", (Object)slots.length, (Object)Arrays.stream(slots).collect(Collectors.toList()));
        for (int i2 = 0; i2 < amount; ++i2) {
            Rune rune;
            String runeName = slots[i2].getRuneName();
            if (runeName == null || (rune = (Rune)Arrays.stream(Rune.values()).filter(r -> runeName.contains(r.getRuneNames()[0])).findFirst().orElse(null)) == null) continue;
            runesInPouch.add(rune);
        }
        return runesInPouch;
    }

    private static boolean runesInPouchMatchLoadout(BankLoadout loadout) {
        RunePouch.RuneSlot[] slots = RunePouch.RuneSlot.values();
        int amount = 0;
        if (Bank.Inventory.getFirst(i -> i.getName().toLowerCase().startsWith("rune pouch")) != null) {
            amount = 3;
        }
        if (Bank.Inventory.getFirst(i -> i.getName().toLowerCase().startsWith("divine rune pouch")) != null) {
            amount = 4;
        }
        if (amount == 0) {
            return false;
        }
        log.debug("slots = {} {}", (Object)slots.length, (Object)Arrays.stream(slots).collect(Collectors.toList()));
        for (int i2 = 0; i2 < amount; ++i2) {
            String runeName = slots[i2].getRuneName();
            if (runeName == null) {
                log.debug("Rune pouch slot {} is empty, filling...", (Object)i2);
                return false;
            }
            Rune rune = Arrays.stream(Rune.values()).filter(r -> runeName.contains(r.getRuneNames()[0])).findFirst().orElse(null);
            if (loadout.getRunePouchSetup().getRunes().containsKey(rune.getRuneId())) continue;
            return false;
        }
        return true;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BankLoadouts)) {
            return false;
        }
        BankLoadouts other = (BankLoadouts)o;
        return other.canEqual(this);
    }

    protected boolean canEqual(Object other) {
        return other instanceof BankLoadouts;
    }

    public int hashCode() {
        boolean result = true;
        return 1;
    }

    public String toString() {
        return "BankLoadouts()";
    }

    public static BankLoadout getWithdrawing() {
        return withdrawing;
    }

    public static void setWithdrawing(BankLoadout withdrawing) {
        BankLoadouts.withdrawing = withdrawing;
    }

    private static class BankLoadoutLogic {
        private int bankingStartedTick;
        private CompletableFuture<Boolean> loadoutFuture = null;
        private int retries = 0;

        private BankLoadoutLogic() {
        }

        public boolean execute(Client client, BankLoadout bankLoadout) {
            if (this.drinkRefreshment()) {
                return false;
            }
            if (this.restoreHealth()) {
                return false;
            }
            if (this.restoreStats()) {
                return false;
            }
            if (this.restorePrayer()) {
                return false;
            }
            if (!Bank.isOpen()) {
                Bank.open();
                return false;
            }
            if (client.getTickCount() - this.bankingStartedTick > 15) {
                this.loadoutFuture = null;
                ++this.retries;
            }
            if (this.loadoutFuture == null) {
                this.loadoutFuture = BankLoadouts.withdraw(bankLoadout, true);
                this.bankingStartedTick = client.getTickCount();
            }
            if (this.loadoutFuture.isDone()) {
                boolean result = this.loadoutFuture.join();
                if (result) {
                    if (Dialog.isEnterInputOpen()) {
                        Dialog.enterAmount(0);
                    }
                    return true;
                }
                this.loadoutFuture = null;
            }
            return false;
        }

        private boolean drinkRefreshment() {
            if (Combat.getMissingHealth() == 0 && !Combat.isPoisoned() && !Combat.isVenomed()) {
                return false;
            }
            TileObject refreshment = TileObjects.getNearest("Pool of Refreshment");
            if (refreshment == null || !Reachable.isInteractable((Locatable)refreshment)) {
                return false;
            }
            refreshment.interact("Drink");
            return true;
        }

        private boolean restorePrayer() {
            if (Skills.getBoostedLevel(Skill.PRAYER) >= Skills.getLevel(Skill.PRAYER)) {
                return false;
            }
            Item prayer = Inventory.getFirst(i -> i.getName().startsWith("Prayer") || i.getName().startsWith("Super restore"));
            if (prayer == null) {
                return false;
            }
            prayer.interact("Drink");
            return true;
        }

        private boolean restoreHealth() {
            if (Combat.getMissingHealth() <= 0) {
                return false;
            }
            Item edible = Inventory.getFirst(i -> i.hasAction(new String[]{"Eat"}) || i.getName().startsWith("Saradomin brew"));
            if (edible == null) {
                return false;
            }
            edible.interact(new String[]{"Eat", "Drink"});
            return true;
        }

        private boolean restoreStats() {
            boolean lowStats = false;
            for (Skill skill : Skill.values()) {
                if (skill == Skill.HITPOINTS || Skills.getBoostedLevel(skill) >= Skills.getLevel(skill)) continue;
                lowStats = true;
            }
            if (!lowStats) {
                return false;
            }
            Item restore = Inventory.getFirst(i -> i.getName().toLowerCase().contains("restore"));
            if (restore == null) {
                return Combat.drinkBoostingPotion(10);
            }
            restore.interact("Drink");
            return true;
        }
    }

    public static enum BankLoadoutState {
        PENDING,
        FAILED,
        COMPLETE;

    }
}

