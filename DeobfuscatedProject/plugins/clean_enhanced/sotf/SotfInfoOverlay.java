package gg.squire.sotf;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderSotf;
import gg.squire.account.BuilderConfig;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Overlay panel that displays the Squire SOTF (Secrets of the North) quest builder progress.
 * Shows runtime information, current quest status, and task completion statistics.
 * Positioned at the bottom-left of the screen.
 */
public class SotfInfoOverlay extends OverlayPanel {
    private final BuilderConfig config;
    private final AccBuilderSotf plugin;

    @Inject
    private SotfInfoOverlay(AccBuilderSotf plugin, BuilderConfig config) {
        this.plugin = plugin;
        this.config = config;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        // Calculate runtime since plugin started
        long runtime = System.currentTimeMillis() - AccBuilderSotf.b;
        double version = 0.1;

        // Set panel border (10px on all sides)
        this.panelComponent.setBorder(new Rectangle(10, 10, 10, 10));

        // Add title
        this.panelComponent.getChildren().add(
            TitleComponent.builder()
                .color(ColorScheme.BRAND_ORANGE)
                .text("Squire Sotf Builder")
                .build()
        );

        // Add version information
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Version")
                .right("1." + version)
                .build()
        );

        // Add runtime information
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Runtime")
                .right(e.b(runtime))
                .build()
        );

        // Add current status
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Status:")
                .right(AccBuilderSotf.c)
                .build()
        );

        // Add current quest
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Current Quest:")
                .right(String.valueOf(AccBuilderSotf.l))
                .build()
        );

        // Add tasks completed count
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Tasks Completed:")
                .right(String.valueOf(AccBuilderSotf.f))
                .build()
        );

        // Set panel preferred size (width: 258 + 20 = 278, height: 0)
        this.panelComponent.setPreferredSize(new Dimension(278, 0));

        return super.render(graphics);
    }
}
