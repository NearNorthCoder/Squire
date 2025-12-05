/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GrandExchangeOffer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.GrandExchangeOffer;
import net.runelite.mapping.Import;

public interface RSGrandExchangeOffer
extends GrandExchangeOffer {
    @Import(value="currentQuantity")
    public int getQuantitySold();

    @Import(value="id")
    public int getItemId();

    @Import(value="totalQuantity")
    public int getTotalQuantity();

    @Import(value="unitPrice")
    public int getPrice();

    @Import(value="currentPrice")
    public int getSpent();

    @Import(value="state")
    public byte getRSState();
}

