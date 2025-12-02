/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.client.ui.overlay;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public abstract class SquireInfoBox<T extends SquirePlugin>
extends OverlayPanel {
    protected final T plugin;
    protected final TaskManager taskManager;
    protected final String name;
    protected final String version;

    public SquireInfoBox(T plugin) {
        this.plugin = plugin;
        this.taskManager = ((SquirePlugin)((Object)plugin)).getManager();
        this.name = plugin.getName();
        this.version = ((SquirePlugin)((Object)plugin)).getVersion();
        this.setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        this.setLayer(OverlayLayer.ALWAYS_ON_TOP);
        this.setPriority(OverlayPriority.MED);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (((SquirePlugin)((Object)this.plugin)).isPaintDisabled()) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(10, 10, 10, 10));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(this.name).build());
        int panelWidth = 258;
        this.panelComponent.setPreferredSize(new Dimension(panelWidth + 20, 0));
        this.panelComponent.getChildren().add(LineComponent.builder().left("Version").right(this.version).build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Performing").right(this.taskManager.getCurrentTask()).build());
        this.addPluginInfo(graphics2D);
        return super.render(graphics2D);
    }

    public abstract void addPluginInfo(Graphics2D var1);
}
