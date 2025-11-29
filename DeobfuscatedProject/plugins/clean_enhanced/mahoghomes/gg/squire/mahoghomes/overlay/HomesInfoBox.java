/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.api.util.Text
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.mahoghomes.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.model.Home;
import gg.squire.mahoghomes.model.PlankSack;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import net.runelite.api.util.Text;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.items.Bank;

public class HomesInfoBox
extends OverlayPanel {
    private final SquireHomesPlugin plugin;
    private final TaskManager taskManager;
    private final PlankSack plankSack;

    @Inject
    private HomesInfoBox(SquireHomesPlugin plugin, PlankSack plankSack) {
        this.plugin = plugin;
        this.taskManager = plugin.getManager();
        this.plankSack = plankSack;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (this.plugin.isPaintDisabled()) {
            return null;
        }
        Duration runtime = Duration.between(this.plugin.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(10, 10, 10, 10));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text("Squire Mahogany Homes").build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Version").right("1.1.0").build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Runtime").right(Time.format((Duration)runtime)).build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Task: ").right(this.taskManager.getCurrentTask()).build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Bank open: ").right(String.valueOf(Bank.isOpen())).build());
        if (this.plugin.getConfig().sack()) {
            this.panelComponent.getChildren().add(LineComponent.builder().left("Plank sack: ").right(String.valueOf(this.plankSack.getPlanks(this.plugin.getConfig().contract()))).build());
        }
        Home currentHome = this.plugin.getCurrentHome();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Assignment: ").right(currentHome != null ? Text.titleCase((Enum)currentHome) : "None").build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Planks left: ").right(String.valueOf(this.plugin.getPlanksBanked())).build());
        int panelWidth = 258;
        this.panelComponent.setPreferredSize(new Dimension(panelWidth + 20, 0));
        return super.render(graphics2D);
    }

    public long getPerHour(int quantity) {
        Duration timeSinceStart = Duration.between(this.plugin.getStarted(), Instant.now());
        if (!timeSinceStart.isZero()) {
            return (int)((double)quantity * (double)Duration.ofHours(1L).toMillis() / (double)timeSinceStart.toMillis());
        }
        return 0L;
    }
}

