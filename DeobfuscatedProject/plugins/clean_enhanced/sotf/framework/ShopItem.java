/*
 * Deobfuscated from class 'd' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * ShopItem represents an item to be purchased from the Grand Exchange.
 * Used by GrandExchangeUtil.buyItems(List<ShopItem>) to process buy orders.
 *
 * Original obfuscated methods:
 *   p() -> getItemId()
 *   q() -> getQuantity()
 *   r() -> getTimeout()
 */
package gg.squire.sotf.framework;

/**
 * Data class representing a Grand Exchange purchase order.
 * Contains the item ID, quantity to buy, and timeout for the GE operation.
 */
public class ShopItem {
    private final int itemId;
    private final int quantity;
    private final int timeout;

    /**
     * Create a new shop item purchase order.
     *
     * @param itemId The OSRS item ID to purchase
     * @param quantity The number of items to buy
     * @param timeout The maximum time (in milliseconds) to wait for the GE order
     */
    public ShopItem(int itemId, int quantity, int timeout) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.timeout = timeout;
    }

    /**
     * Get the item ID for this purchase order.
     * Original obfuscated method: p()
     *
     * @return The OSRS item ID
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use getItemId() instead
     */
    @Deprecated
    public int p() {
        return itemId;
    }

    /**
     * Get the quantity to purchase.
     * Original obfuscated method: q()
     *
     * @return The quantity to buy
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use getQuantity() instead
     */
    @Deprecated
    public int q() {
        return quantity;
    }

    /**
     * Get the timeout for this GE operation.
     * Original obfuscated method: r()
     *
     * @return The timeout in milliseconds
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use getTimeout() instead
     */
    @Deprecated
    public int r() {
        return timeout;
    }

    @Override
    public String toString() {
        return "ShopItem{itemId=" + itemId + ", quantity=" + quantity + ", timeout=" + timeout + "}";
    }
}
