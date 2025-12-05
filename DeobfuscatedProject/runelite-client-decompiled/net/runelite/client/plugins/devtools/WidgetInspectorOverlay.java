/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.widgets.Widget
 */
package net.runelite.client.plugins.devtools;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.devtools.WidgetInspector;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

@Singleton
public class WidgetInspectorOverlay
extends Overlay {
    private final Client client;
    private final WidgetInspector inspector;

    @Inject
    public WidgetInspectorOverlay(Client client, WidgetInspector inspector) {
        this.client = client;
        this.inspector = inspector;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_WIDGETS);
        this.setPriority(1.0f);
        this.drawAfterInterface(165);
    }

    @Override
    public Dimension render(Graphics2D g) {
        Widget w = this.inspector.getSelectedWidget();
        if (w != null) {
            this.renderWidget(g, w, WidgetInspector.SELECTED_WIDGET_COLOR);
        }
        if (this.inspector.isPickerSelected()) {
            int i;
            boolean menuOpen = this.client.isMenuOpen();
            MenuEntry[] entries = this.client.getMenuEntries();
            int n = i = menuOpen ? 0 : entries.length - 1;
            while (i < entries.length) {
                MenuEntry e = entries[i];
                Widget w2 = this.inspector.getWidgetForMenuOption(e.getType(), e.getParam0(), e.getParam1());
                if (w2 != null) {
                    Color color = this.inspector.colorForWidget(i, entries.length);
                    this.renderWidget(g, w2, color);
                }
                ++i;
            }
        }
        return null;
    }

    private void renderWidget(Graphics2D g, Widget w, Color color) {
        g.setColor(color);
        g.draw(w.getBounds());
    }
}

