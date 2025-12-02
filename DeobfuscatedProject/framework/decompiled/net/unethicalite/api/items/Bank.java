/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.unethicalite.api.items;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Items;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank
extends Items {
    private static final Logger log = LoggerFactory.getLogger(Bank.class);
    private static final Bank BANK = new Bank();
    private static final Inventory BANK_INVENTORY = new Inventory();
    private static final int WITHDRAW_MODE_VARBIT = 3958;
    private static final int QUANTITY_MODE_VARP = 6590;
    private static final Supplier<Widget> TAB_CONTAINER = () -> Widgets.get(WidgetInfo.BANK_TAB_CONTAINER);
    private static final Supplier<Widget> BANK_CAPACITY = () -> Widgets.get(12, 9);
    private static final Supplier<Widget> RELEASE_PLACEHOLDERS = () -> Widgets.get(12, 56);
    private static final Supplier<Widget> SETTINGS_CONTAINER = () -> Widgets.get(12, 48);
    private static final Supplier<Widget> WITHDRAW_ITEM = () -> Widgets.get(12, Component.BANK_WITHDRAW_ITEM.childId);
    private static final Supplier<Widget> WITHDRAW_NOTE = () -> Widgets.get(12, Component.BANK_WITHDRAW_NOTE.childId);
    private static final Supplier<Widget> EXIT = () -> Widgets.get(12, 2, 11);
    private static final WidgetInfo[] BANK_PIN_NUMBERS = new WidgetInfo[]{WidgetInfo.BANK_PIN_10, WidgetInfo.BANK_PIN_1, WidgetInfo.BANK_PIN_2, WidgetInfo.BANK_PIN_3, WidgetInfo.BANK_PIN_4, WidgetInfo.BANK_PIN_5, WidgetInfo.BANK_PIN_6, WidgetInfo.BANK_PIN_7, WidgetInfo.BANK_PIN_8, WidgetInfo.BANK_PIN_9};

    private Bank() {
        super(InventoryID.BANK, (Item item) -> {
            item.setWidgetId(WidgetInfo.BANK_ITEM_CONTAINER.getPackedId());
            return true;
        });
    }

    public static ItemQuery query() {
        return Bank.query(Bank::getAll);
    }

    public static ItemQuery query(Supplier<List<Item>> supplier) {
        return new ItemQuery(supplier);
    }

    public static QuantityMode getQuantityMode() {
        return QuantityMode.getCurrent();
    }

    public static void setQuantityMode(QuantityMode quantityMode) {
        Widget component;
        if (Bank.getQuantityMode() != quantityMode && Widgets.isVisible(component = Widgets.get(quantityMode.widget.groupId, quantityMode.widget.childId))) {
            component.interact(0);
        }
    }

    public static int getFreeSlots() {
        if (!Bank.isOpen()) {
            return -1;
        }
        return Bank.getCapacity() - Bank.getOccupiedSlots();
    }

    public static int getCapacity() {
        Widget widget = BANK_CAPACITY.get();
        if (Widgets.isVisible(widget)) {
            return Integer.parseInt(widget.getText());
        }
        return -1;
    }

    public static int getOccupiedSlots() {
        Widget widget = Widgets.get(WidgetInfo.BANK_ITEM_COUNT_TOP);
        if (Widgets.isVisible(widget)) {
            return Integer.parseInt(widget.getText());
        }
        return -1;
    }

    public static void releasePlaceholders() {
        Widget widget;
        if (!Bank.isSettingsOpen()) {
            Bank.toggleSettings();
            Time.sleepUntil(Bank::isSettingsOpen, 5000);
        }
        if ((widget = RELEASE_PLACEHOLDERS.get()) != null) {
            widget.interact(5);
        }
    }

    public static void toggleSettings() {
        Widget settingsButton = Widgets.get(WidgetInfo.BANK_SETTINGS_BUTTON);
        if (settingsButton != null) {
            settingsButton.interact(0);
        }
    }

    public static boolean isSettingsOpen() {
        return Widgets.isVisible(SETTINGS_CONTAINER.get());
    }

    public static void depositInventory() {
        Widget widget = Widgets.get(WidgetInfo.BANK_DEPOSIT_INVENTORY);
        if (widget != null) {
            widget.interact("Deposit inventory");
        }
    }

    public static void depositEquipment() {
        Widget widget = Widgets.get(WidgetInfo.BANK_DEPOSIT_EQUIPMENT);
        if (widget != null) {
            widget.interact("Deposit worn items");
        }
    }

    public static boolean isOpen() {
        if (Bank.isPinWindowOpen()) {
            return true;
        }
        return Widgets.isVisible(Widgets.get(WidgetInfo.BANK_ITEM_CONTAINER));
    }

    public static boolean isEmpty() {
        return Bank.getAll().isEmpty();
    }

    public static boolean open() {
        if (Bank.isOpen()) {
            Bank.openMainTab();
            return true;
        }
        if (Bank.isPinWindowOpen()) {
            return true;
        }
        ArrayList<TileObject> results = new ArrayList<TileObject>(TileObjects.getAll("Bank booth", "Grand Exchange booth", "Bank chest", "Bank Chest-wreck", "Bank Camel", "Cam the Camel"));
        results.addAll(NPCs.getAll("Banker", "Grand Exchange clerk", "Emerald Benedict", "Arnold Lydspor", "Ashuelot Reis", "Cam the Camel"));
        Player local = Players.getLocal();
        Interactable interactable = results.stream().sorted(Comparator.comparingInt(i -> ((Locatable)i).distanceTo((Locatable)local))).limit(5L).filter(i -> Reachable.isInteractable((Locatable)i)).filter(i -> i.hasAction(new String[]{"Bank", "Use", "Open"})).min(Comparator.comparingInt(i -> ((Locatable)i).distanceTo((Locatable)local))).orElse(null);
        if (interactable == null) {
            return false;
        }
        Locatable loc = (Locatable)interactable;
        if (loc.distanceTo((Locatable)local) > 8) {
            if (Movement.shouldWalk()) {
                Movement.walkTo(loc.getWorldLocation(), false);
            }
        } else {
            interactable.interact(new String[]{"Bank", "Use", "Open"});
        }
        return true;
    }

    public static boolean isPinWindowOpen() {
        Widget bankPinContainer = Widgets.get(WidgetInfo.BANK_PIN_CONTAINER);
        return Widgets.isVisible(bankPinContainer);
    }

    public static boolean enterBankPin() {
        Client client = Static.getClient();
        Widget bankPinContainer = Widgets.get(WidgetInfo.BANK_PIN_CONTAINER);
        if (!Widgets.isVisible(bankPinContainer)) {
            return false;
        }
        String pin = Static.getSquireConfig().bankPin();
        if (!pin.matches("\\d{4}")) {
            return false;
        }
        String[] pinSplit = pin.split("");
        Widget first = Widgets.get(WidgetInfo.BANK_PIN_FIRST_ENTERED);
        Widget second = Widgets.get(WidgetInfo.BANK_PIN_SECOND_ENTERED);
        Widget third = Widgets.get(WidgetInfo.BANK_PIN_THIRD_ENTERED);
        Widget fourth = Widgets.get(WidgetInfo.BANK_PIN_FOURTH_ENTERED);
        if (first.getText().equals("?")) {
            int number = Integer.parseInt(pinSplit[0]);
            Bank.clickNumber(client, number);
        } else if (second.getText().equals("?")) {
            int number = Integer.parseInt(pinSplit[1]);
            Bank.clickNumber(client, number);
        } else if (third.getText().equals("?")) {
            int number = Integer.parseInt(pinSplit[2]);
            Bank.clickNumber(client, number);
        } else if (fourth.getText().equals("?")) {
            int number = Integer.parseInt(pinSplit[3]);
            Bank.clickNumber(client, number);
        }
        return true;
    }

    private static void clickNumber(Client client, int number) {
        for (WidgetInfo widgetInfo : BANK_PIN_NUMBERS) {
            Widget numberBox = Widgets.get(widgetInfo);
            if (!Widgets.isVisible(numberBox) || numberBox.getChildren() == null || numberBox.getChildren().length < 2 || !numberBox.getChild(1).getText().equals(String.valueOf(number))) continue;
            client.invokeWidgetAction(1, numberBox.getChild(0).getId(), 0, -1, "Select");
            break;
        }
    }

    public static void depositAll(String ... names) {
        Bank.depositAll(Predicates.names((String[])names));
    }

    public static void depositAll(int ... ids) {
        Bank.depositAll(Predicates.ids((int[])ids));
    }

    public static void depositAll(Predicate<Item> filter) {
        Bank.deposit(filter, Integer.MAX_VALUE);
    }

    public static void depositAllExcept(String ... names) {
        Bank.depositAllExcept(Predicates.names((String[])names));
    }

    public static void depositAllExcept(int ... ids) {
        Bank.depositAllExcept(Predicates.ids((int[])ids));
    }

    public static void depositAllExcept(Predicate<Item> filter) {
        Bank.depositAll(filter.negate());
    }

    public static void deposit(String name, int amount) {
        Bank.deposit((Item x) -> Objects.equals(x.getName(), name), amount);
    }

    public static void deposit(int id, int amount) {
        Bank.deposit((Item x) -> x.getId() == id, amount);
    }

    public static void deposit(Predicate<Item> filter, int amount) {
        Item item = Inventory.getFirst(filter);
        if (item == null) {
            return;
        }
        String action = Bank.getAction(item, amount, false);
        int actionIndex = item.getActionIndex(action);
        item.interact(actionIndex);
        if (action.equals("Deposit-X")) {
            Dialog.enterAmount(amount);
        }
    }

    public static void withdrawAll(String name, WithdrawMode withdrawMode) {
        Bank.withdrawAll((Item x) -> Objects.equals(x.getName(), name), withdrawMode);
    }

    public static void withdrawAll(int id, WithdrawMode withdrawMode) {
        Bank.withdrawAll((Item x) -> x.getId() == id, withdrawMode);
    }

    public static void withdrawAll(Predicate<Item> filter, WithdrawMode withdrawMode) {
        Bank.withdraw(filter, Integer.MAX_VALUE, withdrawMode);
    }

    public static void withdraw(String name, int amount, WithdrawMode withdrawMode) {
        Bank.withdraw((Item x) -> Objects.equals(x.getName(), name), amount, withdrawMode);
    }

    public static void withdraw(int id, int amount, WithdrawMode withdrawMode) {
        Bank.withdraw((Item x) -> x.getId() == id, amount, withdrawMode);
    }

    public static void withdraw(Predicate<Item> filter, int amount, WithdrawMode withdrawMode) {
        Item item = Bank.getFirst(filter.and(x -> !x.isPlaceholder()));
        if (item == null) {
            return;
        }
        String action = Bank.getAction(item, amount, true);
        int actionIndex = item.getActionIndex(action);
        if (withdrawMode == WithdrawMode.NOTED && !Bank.isNotedWithdrawMode()) {
            Bank.setWithdrawMode(true);
            Time.sleepUntil(Bank::isNotedWithdrawMode, 1200);
        }
        if (withdrawMode == WithdrawMode.ITEM && Bank.isNotedWithdrawMode()) {
            Bank.setWithdrawMode(false);
            Time.sleepUntil(() -> !Bank.isNotedWithdrawMode(), 1200);
        }
        item.interact(actionIndex + 1);
        if (action.equals("Withdraw-X")) {
            Dialog.enterAmount(amount);
        }
    }

    public static void withdrawX(String name, int amount, WithdrawMode withdrawMode) {
        Bank.withdrawX((Item x) -> Objects.equals(x.getName(), name), amount, withdrawMode);
    }

    public static void withdrawX(int id, int amount, WithdrawMode withdrawMode) {
        Bank.withdrawX((Item x) -> x.getId() == id, amount, withdrawMode);
    }

    public static void withdrawX(Predicate<Item> filter, int amount, WithdrawMode withdrawMode) {
        Item item = Bank.getFirst(filter.and(x -> !x.isPlaceholder()));
        if (item == null) {
            return;
        }
        if (withdrawMode == WithdrawMode.NOTED && !Bank.isNotedWithdrawMode()) {
            Bank.setWithdrawMode(true);
            Time.sleepUntil(Bank::isNotedWithdrawMode, 1200);
        }
        if (withdrawMode == WithdrawMode.ITEM && Bank.isNotedWithdrawMode()) {
            Bank.setWithdrawMode(false);
            Time.sleepUntil(() -> !Bank.isNotedWithdrawMode(), 1200);
        }
        item.interact("Withdraw-X");
        Dialog.enterAmount(amount);
    }

    public static void withdrawLastQuantity(String name, WithdrawMode withdrawMode) {
        Bank.withdrawLastQuantity((Item x) -> Objects.equals(name, x.getName()), withdrawMode);
    }

    public static void withdrawLastQuantity(int id, WithdrawMode withdrawMode) {
        Bank.withdrawLastQuantity((Item x) -> x.getId() == id, withdrawMode);
    }

    public static void withdrawLastQuantity(Predicate<Item> filter, WithdrawMode withdrawMode) {
        Item item = Bank.getFirst(filter.and(x -> !x.isPlaceholder()));
        if (item == null) {
            return;
        }
        WithdrawOption withdrawOption = WithdrawOption.LAST_QUANTITY;
        if (withdrawMode == WithdrawMode.NOTED && !Bank.isNotedWithdrawMode()) {
            Bank.setWithdrawMode(true);
        }
        if (withdrawMode == WithdrawMode.ITEM && Bank.isNotedWithdrawMode()) {
            Bank.setWithdrawMode(false);
        }
        item.interact(withdrawOption.getMenuIndex());
    }

    public static void setWithdrawMode(boolean noted) {
        Widget widget;
        Widget widget2 = widget = noted ? WITHDRAW_NOTE.get() : WITHDRAW_ITEM.get();
        if (widget != null) {
            widget.interact(0);
        }
    }

    public static boolean isNotedWithdrawMode() {
        return Vars.getBit(3958) == 1;
    }

    public static List<Item> getAll(Predicate<Item> filter) {
        return BANK.all(filter);
    }

    public static List<Item> getAll() {
        return Bank.getAll((Item x) -> true);
    }

    public static List<Item> getAll(int ... ids) {
        return BANK.all(ids);
    }

    public static List<Item> getAll(String ... names) {
        return BANK.all(names);
    }

    public static Item getFirst(Predicate<Item> filter) {
        return BANK.first(filter);
    }

    public static Item getFirst(int ... ids) {
        return BANK.first(ids);
    }

    public static Item getFirst(String ... names) {
        return BANK.first(names);
    }

    public static boolean contains(Predicate<Item> filter) {
        return BANK.exists(filter);
    }

    public static boolean contains(int ... id) {
        return BANK.exists(id);
    }

    public static boolean contains(String ... name) {
        return BANK.exists(name);
    }

    public static int getCount(boolean stacks, Predicate<Item> filter) {
        return BANK.count(stacks, filter);
    }

    public static int getCount(boolean stacks, int ... ids) {
        return BANK.count(stacks, ids);
    }

    public static int getCount(boolean stacks, String ... names) {
        return BANK.count(stacks, names);
    }

    public static int getCount(Predicate<Item> filter) {
        return BANK.count(false, filter);
    }

    public static int getCount(int ... ids) {
        return BANK.count(false, ids);
    }

    public static int getCount(String ... names) {
        return BANK.count(false, names);
    }

    public static List<Widget> getTabs() {
        return Widgets.getChildren(WidgetInfo.BANK_TAB_CONTAINER, x -> x.hasAction(new String[]{"Collapse tab"}));
    }

    public static boolean hasTabs() {
        return !Bank.getTabs().isEmpty();
    }

    public static void collapseTabs() {
        for (int i = 0; i < Bank.getTabs().size(); ++i) {
            Widget tab = Bank.getTabs().get(i);
            Static.getClient().interact(6, 1007, 11 + i, tab.getId());
        }
    }

    public static void collapseTab(int index) {
        Widget tabContainer = Widgets.get(WidgetInfo.BANK_TAB_CONTAINER);
        if (!Widgets.isVisible(tabContainer)) {
            return;
        }
        int tabIdx = 11 + index;
        Widget tab = tabContainer.getChild(tabIdx);
        if (!Widgets.isVisible(tab)) {
            return;
        }
        Static.getClient().interact(6, 1007, tabIdx, tab.getId());
    }

    public static boolean isMainTabOpen() {
        return Bank.isTabOpen(0);
    }

    public static boolean isTabOpen(int index) {
        return Vars.getBit(4150) == index;
    }

    public static void openMainTab() {
        Bank.openTab(0);
    }

    public static void openTab(int index) {
        if (index < 0 || index > Bank.getTabs().size()) {
            return;
        }
        Widget tabContainer = TAB_CONTAINER.get();
        if (Widgets.isVisible(tabContainer) && !Bank.isTabOpen(index)) {
            tabContainer.getChild(10 + index).interact(0);
        }
    }

    private static String getAction(Item item, int amount, Boolean withdraw) {
        Object action;
        Object object = action = withdraw != false ? "Withdraw" : "Deposit";
        action = amount == 1 ? (String)action + "-1" : (amount == 5 ? (String)action + "-5" : (amount == 10 ? (String)action + "-10" : (withdraw != false && amount >= item.getQuantity() ? (String)action + "-All" : (withdraw == false && amount >= Inventory.getCount(true, item.getId()) ? (String)action + "-All" : (item.hasAction(new String[]{(String)action + "-" + amount}) ? (String)action + "-" + amount : (String)action + "-X")))));
        return action;
    }

    public static void close() {
        Widget exitBank = EXIT.get();
        if (!Widgets.isVisible(exitBank)) {
            return;
        }
        exitBank.interact("Close");
    }

    public static class Inventory
    extends Items {
        public Inventory() {
            super(InventoryID.INVENTORY, (Item item) -> {
                item.setWidgetId(WidgetInfo.BANK_INVENTORY_ITEMS_CONTAINER.getPackedId());
                return true;
            });
        }

        public static ItemQuery query() {
            return new ItemQuery(Inventory::getAll);
        }

        public static List<Item> getAll() {
            return Inventory.getAll((Item x) -> true);
        }

        public static List<Item> getAll(Predicate<Item> filter) {
            return BANK_INVENTORY.all(filter);
        }

        public static List<Item> getAll(int ... ids) {
            return BANK_INVENTORY.all(ids);
        }

        public static List<Item> getAll(String ... names) {
            return BANK_INVENTORY.all(Predicates.names((String[])names));
        }

        public static Item getFirst(Predicate<Item> filter) {
            return BANK_INVENTORY.first(filter);
        }

        public static Item getFirst(int ... ids) {
            return BANK_INVENTORY.first(ids);
        }

        public static Item getFirst(String ... names) {
            return BANK_INVENTORY.first(names);
        }

        public static int getCount(boolean stacks, Predicate<Item> filter) {
            return BANK_INVENTORY.count(stacks, filter);
        }

        public static int getCount(boolean stacks, int ... ids) {
            return BANK_INVENTORY.count(stacks, ids);
        }

        public static int getCount(boolean stacks, String ... names) {
            return BANK_INVENTORY.count(stacks, names);
        }

        public static int getCount(Predicate<Item> filter) {
            return BANK_INVENTORY.count(false, filter);
        }

        public static int getCount(int ... ids) {
            return BANK_INVENTORY.count(false, ids);
        }

        public static int getCount(String ... names) {
            return BANK_INVENTORY.count(false, names);
        }

        public static boolean containsAllOf(int ... ids) {
            for (int id : ids) {
                if (BANK_INVENTORY.exists(id)) continue;
                return false;
            }
            return true;
        }

        public static boolean containsAllOf(List<Integer> itemIdList) {
            for (int id : itemIdList) {
                if (BANK_INVENTORY.exists(id)) continue;
                return false;
            }
            return true;
        }

        public static boolean allMatches(Map<Integer, Integer> idCountMap) {
            for (Map.Entry<Integer, Integer> entry : idCountMap.entrySet()) {
                if (BANK_INVENTORY.count(true, entry.getKey()) == entry.getValue().intValue()) continue;
                return false;
            }
            return true;
        }

        public static boolean allMatches(Map<Integer, Integer> idCountMap, Function<Integer, Predicate<Item>> remapping) {
            for (Map.Entry<Integer, Integer> entry : idCountMap.entrySet()) {
                int count = Math.max(BANK_INVENTORY.count(true, entry.getKey()), BANK_INVENTORY.count(true, remapping.apply(entry.getKey())));
                if (count == entry.getValue()) continue;
                return false;
            }
            return true;
        }
    }

    private static enum WithdrawOption {
        ONE(2),
        FIVE(3),
        TEN(4),
        LAST_QUANTITY(5),
        X(6),
        ALL(7),
        ALL_BUT_1(8);

        private final int menuIndex;

        private WithdrawOption(int menuIndex) {
            this.menuIndex = menuIndex;
        }

        public static WithdrawOption ofAmount(Item item, int amount) {
            if (amount <= 1) {
                return ONE;
            }
            if (amount == 5) {
                return FIVE;
            }
            if (amount == 10) {
                return TEN;
            }
            if (amount > item.getQuantity()) {
                return ALL;
            }
            return X;
        }

        public int getMenuIndex() {
            if (Bank.getQuantityMode() == QuantityMode.ONE && this == ONE) {
                return 1;
            }
            return this.menuIndex;
        }
    }

    public static enum WithdrawMode {
        NOTED,
        ITEM,
        DEFAULT;

    }

    public static enum QuantityMode {
        ONE(Component.BANK_QUANTITY_ONE, 0),
        FIVE(Component.BANK_QUANTITY_FIVE, 1),
        TEN(Component.BANK_QUANTITY_TEN, 2),
        X(Component.BANK_QUANTITY_X, 3),
        ALL(Component.BANK_QUANTITY_ALL, 4),
        UNKNOWN(Component.EMPTY, -1);

        private final Component widget;
        private final int bitValue;

        private QuantityMode(Component widget, int bitValue) {
            this.widget = widget;
            this.bitValue = bitValue;
        }

        public static QuantityMode getCurrent() {
            switch (Vars.getBit(6590)) {
                case 0: {
                    return ONE;
                }
                case 1: {
                    return FIVE;
                }
                case 2: {
                    return TEN;
                }
                case 3: {
                    return X;
                }
                case 4: {
                    return ALL;
                }
            }
            return UNKNOWN;
        }
    }

    public static enum Component {
        BANK_REARRANGE_SWAP(12, 17),
        BANK_REARRANGE_INSERT(12, 19),
        BANK_WITHDRAW_ITEM(12, 24),
        BANK_WITHDRAW_NOTE(12, 26),
        BANK_QUANTITY_BUTTONS_CONTAINER(12, 26),
        BANK_QUANTITY_ONE(12, 28),
        BANK_QUANTITY_FIVE(12, 30),
        BANK_QUANTITY_TEN(12, 32),
        BANK_QUANTITY_X(12, 34),
        BANK_QUANTITY_ALL(12, 36),
        BANK_PLACEHOLDERS_BUTTON(12, 38),
        EMPTY(-1, -1);

        private final int groupId;
        private final int childId;

        private Component(int groupId, int childId) {
            this.groupId = groupId;
            this.childId = childId;
        }
    }
}
