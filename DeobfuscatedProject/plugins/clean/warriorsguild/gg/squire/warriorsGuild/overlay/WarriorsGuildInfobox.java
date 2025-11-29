/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.warriorsGuild.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class WarriorsGuildInfobox
extends OverlayPanel {
    private static final String SEPARATOR_TITLE = "------------------------------------";
    private final SquireWarriorsGuild plugin;
    private final TaskManager taskManager;
    private final SquireWarriorsGuildConfig config;

    @Inject
    private WarriorsGuildInfobox(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.taskManager = plugin.getManager();
        this.config = config;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (this.plugin.isPaintDisabled()) {
            return null;
        }
        Duration runtime = Duration.between(this.plugin.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text("Squire Warriors Guild").build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Runtime").right(Time.format((Duration)runtime)).build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Version").right("0.0.1").build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Task: ").right(this.taskManager.getCurrentTask()).build());
        int panelWidth = 258;
        this.panelComponent.setPreferredSize(new Dimension(panelWidth + 20, 0));
        return super.render(graphics2D);
    }
}

