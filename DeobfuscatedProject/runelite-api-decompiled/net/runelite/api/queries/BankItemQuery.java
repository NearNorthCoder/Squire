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
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;

public class BankItemQuery
extends WidgetItemQuery {
    private static final int ITEM_EMPTY = 6512;

    @Override
    public QueryResults<WidgetItem> result(Client client) {
        Collection<WidgetItem> widgetItems = this.getBankItems(client);
        return new QueryResults<WidgetItem>(widgetItems.stream().filter(Objects::nonNull).filter(this.predicate).collect(Collectors.toList()));
    }

    private Collection<WidgetItem> getBankItems(Client client) {
        ArrayList<WidgetItem> widgetItems = new ArrayList<WidgetItem>();
        Widget bank = client.getWidget(WidgetInfo.BANK_ITEM_CONTAINER);
        if (bank != null && !bank.isHidden()) {
            Widget[] children = bank.getDynamicChildren();
            for (int i = 0; i < children.length; ++i) {
                Widget child = children[i];
                if (child.getItemId() == 6512 || child.isSelfHidden()) continue;
                Rectangle bounds = child.getBounds();
                bounds.setBounds(bounds.x - 1, bounds.y - 1, 32, 32);
                widgetItems.add(new WidgetItem(child.getItemId(), child.getItemQuantity(), 0, bounds, child, null));
            }
        }
        return widgetItems;
    }
}

