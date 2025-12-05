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
import net.runelite.api.Point;
import net.runelite.api.QueryResults;
import net.runelite.api.queries.WidgetItemQuery;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;

public class InventoryWidgetItemQuery
extends WidgetItemQuery {
    private static final WidgetInfo[] INVENTORY_WIDGET_INFOS = new WidgetInfo[]{WidgetInfo.DEPOSIT_BOX_INVENTORY_ITEMS_CONTAINER, WidgetInfo.BANK_INVENTORY_ITEMS_CONTAINER, WidgetInfo.SHOP_INVENTORY_ITEMS_CONTAINER, WidgetInfo.GRAND_EXCHANGE_INVENTORY_ITEMS_CONTAINER, WidgetInfo.GUIDE_PRICES_INVENTORY_ITEMS_CONTAINER, WidgetInfo.EQUIPMENT_INVENTORY_ITEMS_CONTAINER};

    @Override
    public QueryResults<WidgetItem> result(Client client) {
        Collection<WidgetItem> widgetItems = this.getInventoryItems(client);
        return new QueryResults<WidgetItem>(widgetItems.stream().filter(Objects::nonNull).filter(this.predicate).collect(Collectors.toList()));
    }

    private Collection<WidgetItem> getInventoryItems(Client client) {
        ArrayList<WidgetItem> widgetItems = new ArrayList<WidgetItem>();
        for (WidgetInfo widgetInfo : INVENTORY_WIDGET_INFOS) {
            Widget inventory = client.getWidget(widgetInfo);
            if (inventory == null || inventory.isHidden()) continue;
            Widget[] children = inventory.getDynamicChildren();
            for (int i = 0; i < children.length; ++i) {
                Widget child = children[i];
                boolean isDragged = child.isWidgetItemDragged(child.getItemId());
                int dragOffsetX = 0;
                int dragOffsetY = 0;
                if (isDragged) {
                    Point p = child.getWidgetItemDragOffsets();
                    dragOffsetX = p.getX();
                    dragOffsetY = p.getY();
                }
                Rectangle bounds = child.getBounds();
                bounds.setBounds(bounds.x - 1, bounds.y - 1, 32, 32);
                Rectangle dragBounds = child.getBounds();
                dragBounds.setBounds(bounds.x + dragOffsetX, bounds.y + dragOffsetY, 32, 32);
                widgetItems.add(new WidgetItem(child.getItemId(), child.getItemQuantity(), i, bounds, child, dragBounds));
            }
            break;
        }
        return widgetItems;
    }
}

