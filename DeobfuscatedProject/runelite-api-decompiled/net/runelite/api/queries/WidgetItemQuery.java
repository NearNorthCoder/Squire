/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.Collection;
import java.util.function.Predicate;
import net.runelite.api.Query;
import net.runelite.api.QueryResults;
import net.runelite.api.widgets.WidgetItem;

public abstract class WidgetItemQuery
extends Query<WidgetItem, WidgetItemQuery, QueryResults<WidgetItem>> {
    public WidgetItemQuery idEquals(int ... ids) {
        this.predicate = this.and(item -> {
            for (int id : ids) {
                if (item.getId() != id) continue;
                return true;
            }
            return false;
        });
        return this;
    }

    public WidgetItemQuery idEquals(Collection<Integer> ids) {
        this.predicate = this.and(object -> ids.contains(object.getId()));
        return this;
    }

    public WidgetItemQuery quantityEquals(int quantity) {
        this.predicate = this.and(item -> item.getQuantity() == quantity);
        return this;
    }

    public WidgetItemQuery filter(Predicate<WidgetItem> other) {
        this.predicate = this.and(other);
        return this;
    }
}

