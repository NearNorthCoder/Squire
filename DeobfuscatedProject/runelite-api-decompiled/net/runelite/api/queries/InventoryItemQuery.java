/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Query;
import net.runelite.api.QueryResults;

public class InventoryItemQuery
extends Query<Item, InventoryItemQuery, QueryResults<Item>> {
    private final InventoryID inventory;

    @Override
    public QueryResults<Item> result(Client client) {
        ItemContainer container = client.getItemContainer(this.inventory);
        if (container == null) {
            return new QueryResults<Item>(null);
        }
        return new QueryResults<Item>(Arrays.stream(container.getItems()).filter(Objects::nonNull).filter(this.predicate).collect(Collectors.toList()));
    }

    public InventoryItemQuery idEquals(int ... ids) {
        this.predicate = this.and(item -> {
            for (int id : ids) {
                if (item.getId() != id) continue;
                return true;
            }
            return false;
        });
        return this;
    }

    public InventoryItemQuery(InventoryID inventory) {
        this.inventory = inventory;
    }
}

