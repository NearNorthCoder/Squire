/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  javax.inject.Named
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.SpritePixels
 *  net.runelite.http.api.item.ItemPrice
 *  net.runelite.http.api.item.ItemStats
 */
package net.runelite.client.game;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.openosrs.client.game.ItemReclaimCost;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Named;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ItemComposition;
import net.runelite.api.SpritePixels;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.game.ItemClient;
import net.runelite.client.game.ItemMapping;
import net.runelite.client.game.ItemStats;
import net.runelite.client.util.AsyncBufferedImage;
import net.runelite.http.api.item.ItemPrice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class ItemManager {
    private static final Logger log = LoggerFactory.getLogger(ItemManager.class);
    private final Client client;
    private final ClientThread clientThread;
    private final ItemClient itemClient;
    private final RuneLiteConfig runeLiteConfig;
    @Inject(optional=true)
    @Named(value="activePriceThreshold")
    private double activePriceThreshold = 5.0;
    @Inject(optional=true)
    @Named(value="lowPriceThreshold")
    private int lowPriceThreshold = 1000;
    private Map<Integer, ItemPrice> itemPrices = Collections.emptyMap();
    private Map<Integer, ItemStats> itemStats = Collections.emptyMap();
    private final LoadingCache<ImageKey, AsyncBufferedImage> itemImages;
    private final LoadingCache<OutlineKey, BufferedImage> itemOutlines;
    private static final ImmutableMap<Integer, Integer> WORN_ITEMS = ImmutableMap.builder().put(89, 88).put(10554, 10553).put(11851, 11850).put(11853, 11852).put(11855, 11854).put(11857, 11856).put(11859, 11858).put(11861, 11860).put(13580, 13579).put(13582, 13581).put(13584, 13583).put(13586, 13585).put(13588, 13587).put(13590, 13589).put(13592, 13591).put(13594, 13593).put(13596, 13595).put(13598, 13597).put(13600, 13599).put(13602, 13601).put(13604, 13603).put(13606, 13605).put(13608, 13607).put(13610, 13609).put(13612, 13611).put(13614, 13613).put(13616, 13615).put(13618, 13617).put(13620, 13619).put(13622, 13621).put(13624, 13623).put(13626, 13625).put(13628, 13627).put(13630, 13629).put(13632, 13631).put(13634, 13633).put(13636, 13635).put(13638, 13637).put(13668, 13667).put(13670, 13669).put(13672, 13671).put(13674, 13673).put(13676, 13675).put(13678, 13677).put(21063, 21061).put(21066, 21064).put(21069, 21067).put(21072, 21070).put(21075, 21073).put(21078, 21076).put(24745, 24743).put(24748, 24746).put(24751, 24749).put(24754, 24752).put(24757, 24755).put(24760, 24758).put(25071, 25069).put(25074, 25072).put(25077, 25075).put(25080, 25078).put(25083, 25081).put(25086, 25084).put(27446, 27444).put(27449, 27447).put(27452, 27450).put(27455, 27453).put(27458, 27456).put(27461, 27459).put(13342, 13280).put(10073, 10069).put(10074, 10071).put(13341, 9772).put(13340, 9771).build();

    @Inject
    public ItemManager(Client client, ScheduledExecutorService scheduledExecutorService, ClientThread clientThread, ItemClient itemClient, RuneLiteConfig runeLiteConfig) {
        this.client = client;
        this.clientThread = clientThread;
        this.itemClient = itemClient;
        this.runeLiteConfig = runeLiteConfig;
        scheduledExecutorService.scheduleWithFixedDelay(this::loadPrices, 0L, 30L, TimeUnit.MINUTES);
        scheduledExecutorService.submit(this::loadStats);
        this.itemImages = CacheBuilder.newBuilder().maximumSize(128L).expireAfterAccess(1L, TimeUnit.HOURS).build(new CacheLoader<ImageKey, AsyncBufferedImage>(){

            @Override
            public AsyncBufferedImage load(ImageKey key) throws Exception {
                return ItemManager.this.loadImage(key.itemId, key.itemQuantity, key.stackable);
            }
        });
        this.itemOutlines = CacheBuilder.newBuilder().maximumSize(128L).expireAfterAccess(1L, TimeUnit.HOURS).build(new CacheLoader<OutlineKey, BufferedImage>(){

            @Override
            public BufferedImage load(OutlineKey key) throws Exception {
                return ItemManager.this.loadItemOutline(key.itemId, key.itemQuantity, key.outlineColor);
            }
        });
    }

    private void loadPrices() {
        try {
            ItemPrice[] prices = this.itemClient.getPrices();
            if (prices != null) {
                ImmutableMap.Builder<Integer, ItemPrice> map = ImmutableMap.builderWithExpectedSize(prices.length);
                for (ItemPrice price : prices) {
                    map.put(price.getId(), price);
                }
                this.itemPrices = map.build();
            }
            log.debug("Loaded {} prices", (Object)this.itemPrices.size());
        }
        catch (IOException e) {
            log.warn("error loading prices!", e);
        }
    }

    private void loadStats() {
        try {
            Map<Integer, ItemStats> stats = this.itemClient.getStats();
            if (stats != null) {
                this.itemStats = ImmutableMap.copyOf(stats);
            }
            log.debug("Loaded {} stats", (Object)this.itemStats.size());
        }
        catch (IOException e) {
            log.warn("error loading stats!", e);
        }
    }

    public int getItemPrice(int itemID) {
        return this.getItemPriceWithSource(itemID, this.runeLiteConfig.useWikiItemPrices());
    }

    public int getItemPriceWithSource(int itemID, boolean useWikiPrice) {
        if (itemID == 995) {
            return 1;
        }
        if (itemID == 13204) {
            return 1000;
        }
        ItemComposition itemComposition = this.getItemComposition(itemID);
        if (itemComposition.getNote() != -1) {
            itemID = itemComposition.getLinkedNoteId();
        }
        itemID = WORN_ITEMS.getOrDefault(itemID, itemID);
        int price = 0;
        Collection<ItemMapping> mappedItems = ItemMapping.map(itemID);
        if (mappedItems == null) {
            ItemPrice ip = this.itemPrices.get(itemID);
            if (ip != null) {
                price = useWikiPrice ? this.getWikiPrice(ip) : ip.getPrice();
            }
        } else {
            for (ItemMapping mappedItem : mappedItems) {
                price = (int)((long)price + (long)this.getItemPriceWithSource(mappedItem.getTradeableItem(), useWikiPrice) * mappedItem.getQuantity());
            }
        }
        return price;
    }

    public int getAlchValue(ItemComposition composition) {
        if (composition.getId() == 995) {
            return 1;
        }
        if (composition.getId() == 13204) {
            return 1000;
        }
        return Math.max(1, composition.getHaPrice());
    }

    public int getRepairValue(int itemId) {
        return this.getRepairValue(itemId, false);
    }

    private int getRepairValue(int itemId, boolean fullValue) {
        ItemReclaimCost b = ItemReclaimCost.of(itemId);
        if (b != null) {
            if (fullValue || b.getItemID() == 24225 || b.getItemID() == 24227) {
                return b.getValue();
            }
            return (int)((float)b.getValue() * 0.75f);
        }
        return 0;
    }

    public int getWikiPrice(ItemPrice itemPrice) {
        int wikiPrice = itemPrice.getWikiPrice();
        int jagPrice = itemPrice.getPrice();
        if (wikiPrice <= 0) {
            return jagPrice;
        }
        if (wikiPrice <= this.lowPriceThreshold) {
            return wikiPrice;
        }
        return (double)wikiPrice < (double)jagPrice * this.activePriceThreshold ? wikiPrice : jagPrice;
    }

    @Nullable
    public ItemStats getItemStats(int itemId) {
        ItemComposition itemComposition = this.getItemComposition(itemId);
        if (itemComposition.getName() == null || itemComposition.getNote() != -1) {
            return null;
        }
        return this.itemStats.get(this.canonicalize(itemId));
    }

    @Nullable
    @Deprecated
    public net.runelite.http.api.item.ItemStats getItemStats(int itemId, boolean allowNote) {
        ItemComposition itemComposition = this.getItemComposition(itemId);
        if (itemComposition.getName() == null || !allowNote && itemComposition.getNote() != -1) {
            return null;
        }
        ItemStats stats = this.itemStats.get(this.canonicalize(itemId));
        return stats != null ? stats.toHttpApiFormat() : null;
    }

    public List<ItemPrice> search(String itemName) {
        itemName = itemName.toLowerCase();
        ArrayList<ItemPrice> result = new ArrayList<ItemPrice>();
        for (ItemPrice itemPrice : this.itemPrices.values()) {
            String name = itemPrice.getName();
            if (!name.toLowerCase().contains(itemName)) continue;
            result.add(itemPrice);
        }
        return result;
    }

    @Nonnull
    public ItemComposition getItemComposition(int itemId) {
        return this.client.getItemDefinition(itemId);
    }

    public int canonicalize(int itemID) {
        ItemComposition itemComposition = this.getItemComposition(itemID);
        if (itemComposition.getNote() != -1) {
            return itemComposition.getLinkedNoteId();
        }
        if (itemComposition.getPlaceholderTemplateId() != -1) {
            return itemComposition.getPlaceholderId();
        }
        return WORN_ITEMS.getOrDefault(itemID, itemID);
    }

    private AsyncBufferedImage loadImage(int itemId, int quantity, boolean stackable) {
        AsyncBufferedImage img = new AsyncBufferedImage(this.clientThread, 36, 32, 2);
        this.clientThread.invoke(() -> {
            if (this.client.getGameState().ordinal() < GameState.LOGIN_SCREEN.ordinal()) {
                return false;
            }
            SpritePixels sprite = this.client.createItemSprite(itemId, quantity, 1, 0x302020, stackable ? 1 : 0, false, 512);
            if (sprite == null) {
                return false;
            }
            sprite.toBufferedImage((BufferedImage)img);
            img.loaded();
            return true;
        });
        return img;
    }

    public AsyncBufferedImage getImage(int itemId) {
        return this.getImage(itemId, 1, false);
    }

    public AsyncBufferedImage getImage(int itemId, int quantity, boolean stackable) {
        try {
            return this.itemImages.get(new ImageKey(itemId, quantity, stackable));
        }
        catch (ExecutionException ex) {
            return null;
        }
    }

    private BufferedImage loadItemOutline(int itemId, int itemQuantity, Color outlineColor) {
        SpritePixels itemSprite = this.client.createItemSprite(itemId, itemQuantity, 1, 0, 0, false, 512);
        return itemSprite.toBufferedOutline(outlineColor);
    }

    public BufferedImage getItemOutline(int itemId, int itemQuantity, Color outlineColor) {
        try {
            return this.itemOutlines.get(new OutlineKey(itemId, itemQuantity, outlineColor));
        }
        catch (ExecutionException e) {
            return null;
        }
    }

    private static final class OutlineKey {
        private final int itemId;
        private final int itemQuantity;
        private final Color outlineColor;

        public OutlineKey(int itemId, int itemQuantity, Color outlineColor) {
            this.itemId = itemId;
            this.itemQuantity = itemQuantity;
            this.outlineColor = outlineColor;
        }

        public int getItemId() {
            return this.itemId;
        }

        public int getItemQuantity() {
            return this.itemQuantity;
        }

        public Color getOutlineColor() {
            return this.outlineColor;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof OutlineKey)) {
                return false;
            }
            OutlineKey other = (OutlineKey)o;
            if (this.getItemId() != other.getItemId()) {
                return false;
            }
            if (this.getItemQuantity() != other.getItemQuantity()) {
                return false;
            }
            Color this$outlineColor = this.getOutlineColor();
            Color other$outlineColor = other.getOutlineColor();
            return !(this$outlineColor == null ? other$outlineColor != null : !((Object)this$outlineColor).equals(other$outlineColor));
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            result = result * 59 + this.getItemId();
            result = result * 59 + this.getItemQuantity();
            Color $outlineColor = this.getOutlineColor();
            result = result * 59 + ($outlineColor == null ? 43 : ((Object)$outlineColor).hashCode());
            return result;
        }

        public String toString() {
            return "ItemManager.OutlineKey(itemId=" + this.getItemId() + ", itemQuantity=" + this.getItemQuantity() + ", outlineColor=" + String.valueOf(this.getOutlineColor()) + ")";
        }
    }

    private static final class ImageKey {
        private final int itemId;
        private final int itemQuantity;
        private final boolean stackable;

        public ImageKey(int itemId, int itemQuantity, boolean stackable) {
            this.itemId = itemId;
            this.itemQuantity = itemQuantity;
            this.stackable = stackable;
        }

        public int getItemId() {
            return this.itemId;
        }

        public int getItemQuantity() {
            return this.itemQuantity;
        }

        public boolean isStackable() {
            return this.stackable;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof ImageKey)) {
                return false;
            }
            ImageKey other = (ImageKey)o;
            if (this.getItemId() != other.getItemId()) {
                return false;
            }
            if (this.getItemQuantity() != other.getItemQuantity()) {
                return false;
            }
            return this.isStackable() == other.isStackable();
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            result = result * 59 + this.getItemId();
            result = result * 59 + this.getItemQuantity();
            result = result * 59 + (this.isStackable() ? 79 : 97);
            return result;
        }

        public String toString() {
            return "ItemManager.ImageKey(itemId=" + this.getItemId() + ", itemQuantity=" + this.getItemQuantity() + ", stackable=" + this.isStackable() + ")";
        }
    }
}

