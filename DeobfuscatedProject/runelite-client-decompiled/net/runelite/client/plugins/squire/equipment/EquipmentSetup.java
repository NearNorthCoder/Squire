/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GameState
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.SpritePixels
 */
package net.runelite.client.plugins.squire.equipment;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.SpritePixels;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.util.AsyncBufferedImage;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EquipmentSetup {
    private static final Logger log = LoggerFactory.getLogger(EquipmentSetup.class);
    private final int[] ids;
    private final int[] amounts;
    private final String[] names;
    private boolean active;
    private int hotkey = -1;
    private transient ItemComposition[] compositions;

    public static EquipmentSetup empty() {
        int[] slots = new int[14];
        String[] names = new String[14];
        return new EquipmentSetup(slots, slots, names);
    }

    public static EquipmentSetup get() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return EquipmentSetup.empty();
        }
        int[] ids = new int[14];
        int[] amounts = new int[14];
        String[] names = new String[14];
        for (EquipmentInventorySlot slot : EquipmentInventorySlot.values()) {
            Item inSlot = Equipment.fromSlot(slot);
            if (inSlot == null) {
                ids[slot.getSlotIdx()] = -1;
                amounts[slot.getSlotIdx()] = 0;
                names[slot.getSlotIdx()] = null;
                continue;
            }
            ids[slot.getSlotIdx()] = inSlot.getId();
            amounts[slot.getSlotIdx()] = inSlot.getQuantity();
            names[slot.getSlotIdx()] = inSlot.getName();
        }
        return new EquipmentSetup(ids, amounts, names);
    }

    public String getNameFor(int id) {
        for (int i = 0; i < this.ids.length; ++i) {
            if (this.ids[i] != id) continue;
            return this.names[i];
        }
        return "";
    }

    public EquipmentSetup load(Consumer<EquipmentSetup> callback) {
        Client client = Static.getClient();
        ClientThread thread = Static.getClientThread();
        thread.invoke(() -> {
            this.compositions = new ItemComposition[this.ids.length];
            for (int i = 0; i < this.ids.length; ++i) {
                this.compositions[i] = client.getItemDefinition(this.ids[i]);
            }
            Executors.newSingleThreadExecutor().submit(() -> callback.accept(this));
        });
        return this;
    }

    public BufferedImage render() {
        BufferedImage background = ImageUtil.loadImageResource(this.getClass(), "equipment.png");
        background = ImageUtil.resizeImage(background, 158, 212);
        if (Game.getState() != GameState.LOGGED_IN) {
            return background;
        }
        BufferedImage backgroundFinal = background;
        ClientThread clientThread = Static.getClientThread();
        AsyncBufferedImage result = new AsyncBufferedImage(clientThread, background.getWidth(), background.getHeight(), 2);
        Client client = Static.getClient();
        clientThread.invoke(() -> {
            Graphics2D graphics = result.createGraphics();
            graphics.drawImage((Image)backgroundFinal, 0, 0, null);
            for (EquipmentInventorySlot slot : EquipmentInventorySlot.values()) {
                int id = this.ids[slot.getSlotIdx()];
                int quantity = this.amounts[slot.getSlotIdx()];
                if (id <= -1 || quantity <= 0) continue;
                BufferedImage img = new BufferedImage(36, 32, 2);
                ItemComposition item = client.getItemDefinition(id);
                SpritePixels sprite = client.createItemSprite(item.getId(), quantity, 1, 0x302020, item.isStackable() ? 2 : 0, false, 512);
                if (sprite == null) {
                    return false;
                }
                sprite.toBufferedImage(img);
                this.render(graphics, img, slot);
            }
            graphics.dispose();
            result.loaded();
            return true;
        });
        return result;
    }

    private void render(Graphics graphics, BufferedImage img, EquipmentInventorySlot slot) {
        int borders = 14;
        switch (slot) {
            case HEAD: {
                graphics.drawImage(img, 100, borders + 12, null);
                break;
            }
            case AMULET: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case CAPE: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case WEAPON: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case BODY: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case SHIELD: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case LEGS: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case GLOVES: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case BOOTS: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case RING: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
            case AMMO: {
                graphics.drawImage(img, 150, borders + 12, null);
                break;
            }
        }
    }

    public BufferedImage getImageForSlot(EquipmentInventorySlot slot, ItemManager itemManager) {
        int id = this.ids[slot.getSlotIdx()];
        BufferedImage image = id == -1 ? ImageUtil.loadImageResource(this.getClass(), slot.name().toLowerCase() + "_empty.png") : ImageUtil.loadImageResource(this.getClass(), "empty.png");
        Client client = Static.getClient();
        if (id > 0) {
            ClientThread clientThread = Static.getClientThread();
            AsyncBufferedImage canvas = new AsyncBufferedImage(clientThread, image.getWidth(), image.getHeight(), image.getType());
            clientThread.invoke(() -> {
                ItemComposition item = client.getItemComposition(id);
                BufferedImage img = new BufferedImage(36, 32, 2);
                SpritePixels sprite = client.createItemSprite(item.getId(), this.amounts[slot.getSlotIdx()], 1, 0x302020, item.isStackable() ? 2 : 0, false, 512);
                if (sprite == null) {
                    return false;
                }
                sprite.toBufferedImage(img);
                Graphics2D graphics = canvas.createGraphics();
                graphics.drawImage((Image)image, 0, 0, null);
                graphics.drawImage((Image)img, 2, 2, null);
                graphics.dispose();
                canvas.loaded();
                return true;
            });
            return canvas;
        }
        return image;
    }

    public int get(EquipmentInventorySlot slot) {
        return this.ids[slot.getSlotIdx()];
    }

    public ItemComposition getComposition(EquipmentInventorySlot slot) {
        if (this.compositions == null) {
            return null;
        }
        return this.compositions[slot.getSlotIdx()];
    }

    private ItemComposition getComposition(int id) {
        return Static.getClient().getItemComposition(id);
    }

    public int getCount(boolean stacks, Predicate<ItemComposition> itemCompositionPredicate) {
        int count = 0;
        for (int i = 0; i < this.ids.length; ++i) {
            ItemComposition composition;
            int id = this.ids[i];
            int qty = this.amounts[i];
            if (id <= 0 || !itemCompositionPredicate.test(composition = this.getComposition(id))) continue;
            count += stacks ? qty : 1;
        }
        return count;
    }

    public boolean contains(Predicate<ItemComposition> itemCompositionPredicate) {
        return this.getCount(itemCompositionPredicate) > 0;
    }

    public int getCount(Predicate<ItemComposition> itemCompositionPredicate) {
        return this.getCount(false, itemCompositionPredicate);
    }

    public List<ItemComposition> getAll(Predicate<ItemComposition> itemCompositionPredicate) {
        return this.getAll().stream().filter(itemCompositionPredicate).collect(Collectors.toList());
    }

    public List<ItemComposition> getAll() {
        ArrayList<ItemComposition> compositions = new ArrayList<ItemComposition>();
        for (int id : this.ids) {
            if (id <= 0) continue;
            compositions.add(this.getComposition(id));
        }
        return compositions;
    }

    public void swap() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return;
        }
        Gear.swapTo(this.getFilteredIds());
    }

    private int[] getFilteredIds() {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for (int id : this.ids) {
            if (id == -1) continue;
            integerList.add(id);
        }
        return integerList.stream().mapToInt(i -> i).toArray();
    }

    public boolean isEquipped() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return false;
        }
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (itemContainer == null) {
            return false;
        }
        Set ids = IntStream.of(this.getIds()).boxed().collect(Collectors.toSet());
        for (Item item : itemContainer.getItems()) {
            if (item == null || item.getId() <= 0) continue;
            ids.remove(item.getId());
        }
        return ids.isEmpty();
    }

    public boolean isFullyEquipped() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return false;
        }
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (itemContainer == null) {
            return false;
        }
        Set ids = IntStream.of(this.getIds()).boxed().filter(id -> id >= 1).collect(Collectors.toSet());
        for (Item item : itemContainer.getItems()) {
            if (item == null || item.getId() <= 0) continue;
            int mapped = ItemVariationMapping.map(item.getId());
            ids.removeAll(ItemVariationMapping.getVariations(mapped));
        }
        return ids.isEmpty();
    }

    public Set<Item> getInventoryItemsThatAreNotEquipped() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return Collections.emptySet();
        }
        return new HashSet<Item>(Inventory.getAll(i -> IntStream.of(this.getIds()).filter(id -> id >= 1).anyMatch(id -> ItemVariationMapping.getVariations(ItemVariationMapping.map(id)).contains(i.getId()))));
    }

    public Set<Item> getInventoryItems() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return Collections.emptySet();
        }
        return new HashSet<Item>(Inventory.getAll(i -> IntStream.of(this.getIds()).filter(id -> id >= 1).anyMatch(id -> ItemVariationMapping.getVariations(ItemVariationMapping.map(id)).contains(i.getId()))));
    }

    public int getFilledSlotCount() {
        int count = 0;
        for (int id : this.ids) {
            if (id <= 0) continue;
            ++count;
        }
        return count;
    }

    public Predicate<Item> matches(int id) {
        return i -> i.getId() == id || i.getName().equals(this.getNameFor(id));
    }

    public Predicate<Item> noneMatch() {
        return i -> {
            for (int id : this.ids) {
                if (id != i.getId() && !i.getName().equals(this.getNameFor(id))) continue;
                return false;
            }
            return true;
        };
    }

    public EquipmentSetup derive(EquipmentInventorySlot slot, int id) {
        return this.derive(slot, id, 1);
    }

    public EquipmentSetup derive(EquipmentInventorySlot slot, int id, int quantity) {
        int[] ids = Arrays.copyOf(this.ids, this.ids.length);
        int[] amounts = Arrays.copyOf(this.amounts, this.amounts.length);
        String[] names = Arrays.copyOf(this.names, this.names.length);
        ids[slot.getSlotIdx()] = id;
        amounts[slot.getSlotIdx()] = quantity;
        ClientThread clientThread = Static.getClientThread();
        clientThread.invoke(() -> {
            ItemComposition objType = Static.getItemManager().getItemComposition(id);
            names[slot.getSlotIdx()] = objType.getName();
        });
        return new EquipmentSetup(ids, amounts, names);
    }

    public EquipmentSetup(int[] ids, int[] amounts, String[] names) {
        this.ids = ids;
        this.amounts = amounts;
        this.names = names;
    }

    public int[] getIds() {
        return this.ids;
    }

    public int[] getAmounts() {
        return this.amounts;
    }

    public String[] getNames() {
        return this.names;
    }

    public ItemComposition[] getCompositions() {
        return this.compositions;
    }

    public void setCompositions(ItemComposition[] compositions) {
        this.compositions = compositions;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EquipmentSetup)) {
            return false;
        }
        EquipmentSetup other = (EquipmentSetup)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isActive() != other.isActive()) {
            return false;
        }
        if (this.getHotkey() != other.getHotkey()) {
            return false;
        }
        if (!Arrays.equals(this.getIds(), other.getIds())) {
            return false;
        }
        if (!Arrays.equals(this.getAmounts(), other.getAmounts())) {
            return false;
        }
        return Arrays.deepEquals(this.getNames(), other.getNames());
    }

    protected boolean canEqual(Object other) {
        return other instanceof EquipmentSetup;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isActive() ? 79 : 97);
        result = result * 59 + this.getHotkey();
        result = result * 59 + Arrays.hashCode(this.getIds());
        result = result * 59 + Arrays.hashCode(this.getAmounts());
        result = result * 59 + Arrays.deepHashCode(this.getNames());
        return result;
    }

    public String toString() {
        return "EquipmentSetup(ids=" + Arrays.toString(this.getIds()) + ", amounts=" + Arrays.toString(this.getAmounts()) + ", names=" + Arrays.deepToString(this.getNames()) + ", active=" + this.isActive() + ", hotkey=" + this.getHotkey() + ", compositions=" + Arrays.deepToString(this.getCompositions()) + ")";
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return this.active;
    }

    public int getHotkey() {
        return this.hotkey;
    }

    public void setHotkey(int hotkey) {
        this.hotkey = hotkey;
    }
}

