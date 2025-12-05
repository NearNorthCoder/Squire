/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.QueryResults;
import net.runelite.api.queries.WidgetItemQuery;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;

public class ShopItemQuery
extends WidgetItemQuery {
    @Override
    public QueryResults<WidgetItem> result(Client client) {
        Collection<WidgetItem> widgetItems = this.getShopItems(client);
        return new QueryResults<WidgetItem>(widgetItems.stream().filter(Objects::nonNull).filter(this.predicate).collect(Collectors.toList()));
    }

    private Collection<WidgetItem> getShopItems(Client client) {
        ArrayList<WidgetItem> widgetItems = new ArrayList<WidgetItem>();
        Widget shop = client.getWidget(300, 2);
        if (shop != null && !shop.isHidden()) {
            Widget[] children = shop.getDynamicChildren();
            for (int i = 1; i < children.length; ++i) {
                Widget child = children[i];
                Rectangle bounds = child.getBounds();
                bounds.setBounds(bounds.x - 1, bounds.y - 1, 32, 32);
                widgetItems.add(new WidgetItem(child.getItemId(), child.getItemQuantity(), i - 1, bounds, child, null));
            }
        }
        return widgetItems;
    }
}

