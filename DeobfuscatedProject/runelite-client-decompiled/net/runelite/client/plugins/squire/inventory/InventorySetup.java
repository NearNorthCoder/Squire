/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.SpritePixels
 */
package net.runelite.client.plugins.squire.inventory;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.SpritePixels;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.util.AsyncBufferedImage;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InventorySetup {
    private static final Logger log = LoggerFactory.getLogger(InventorySetup.class);
    private final int[] ids;
    private final int[] quantities;

    public static InventorySetup empty() {
        return new InventorySetup(new int[28], new int[28]);
    }

    public static InventorySetup get() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return InventorySetup.empty();
        }
        int[] ids = new int[28];
        int[] slots = new int[28];
        for (int i = 0; i < ids.length; ++i) {
            Item in = Inventory.getItem(i);
            ids[i] = in == null ? -1 : in.getId();
            slots[i] = in == null ? 0 : in.getQuantity();
        }
        return new InventorySetup(ids, slots);
    }

    private ItemComposition getComposition(int id) {
        return Static.getClient().getItemComposition(id);
    }

    public int getCount(boolean stacks, Predicate<ItemComposition> itemCompositionPredicate) {
        int count = 0;
        for (int i = 0; i < this.ids.length; ++i) {
            ItemComposition composition;
            int id = this.ids[i];
            int qty = this.quantities[i];
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

    public BufferedImage render() {
        BufferedImage background = ImageUtil.loadImageResource(this.getClass(), "inventory.png");
        background = ImageUtil.resizeImage(background, 158, 232);
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
            for (int i = 0; i < this.ids.length; ++i) {
                int id = this.ids[i];
                int quantity = this.quantities[i];
                if (id <= -1 || quantity <= 0) continue;
                ItemComposition itemComposition = client.getItemDefinition(id);
                BufferedImage img = new BufferedImage(36, 32, 2);
                SpritePixels sprite = client.createItemSprite(id, quantity, 1, 0x302020, itemComposition.isStackable() ? 1 : 0, itemComposition.getNote() == 799, 512);
                if (sprite == null) {
                    return false;
                }
                sprite.toBufferedImage(img);
                this.render(graphics, img, i);
            }
            graphics.dispose();
            result.loaded();
            return true;
        });
        return result;
    }

    private void render(Graphics graphics, BufferedImage img, int slot) {
        int row = slot / 4;
        int column = slot % 4;
        graphics.drawImage(img, 7 + column * 36, 7 + row * 32, null);
    }

    public InventorySetup(int[] ids, int[] quantities) {
        this.ids = ids;
        this.quantities = quantities;
    }

    public int[] getIds() {
        return this.ids;
    }

    public int[] getQuantities() {
        return this.quantities;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InventorySetup)) {
            return false;
        }
        InventorySetup other = (InventorySetup)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!Arrays.equals(this.getIds(), other.getIds())) {
            return false;
        }
        return Arrays.equals(this.getQuantities(), other.getQuantities());
    }

    protected boolean canEqual(Object other) {
        return other instanceof InventorySetup;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + Arrays.hashCode(this.getIds());
        result = result * 59 + Arrays.hashCode(this.getQuantities());
        return result;
    }

    public String toString() {
        return "InventorySetup(ids=" + Arrays.toString(this.getIds()) + ", quantities=" + Arrays.toString(this.getQuantities()) + ")";
    }
}

