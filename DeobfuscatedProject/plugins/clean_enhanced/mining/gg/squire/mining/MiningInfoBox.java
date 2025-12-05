package gg.squire.mining;

import com.google.inject.Inject;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import java.awt.*;

/**
 * Overlay panel that displays mining information.
 */
public class MiningInfoBox extends OverlayPanel {
    private final SquireMinerConfig config;
    private final MotherlodeMineTracker mlmTracker;

    @Inject
    public MiningInfoBox(SquireMinerConfig config, MotherlodeMineTracker mlmTracker) {
        this.config = config;
        this.mlmTracker = mlmTracker;
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        panelComponent.getChildren().clear();

        panelComponent.getChildren().add(TitleComponent.builder()
            .text("Squire Miner")
            .color(Color.GREEN)
            .build());

        panelComponent.getChildren().add(LineComponent.builder()
            .left("Activity:")
            .right(config.activity().toString())
            .build());

        if (config.activity() == MiningActivity.MOTHERLODE_MINE) {
            panelComponent.getChildren().add(LineComponent.builder()
                .left("Sack:")
                .right(mlmTracker.getSackCount() + "/" + mlmTracker.getSackCapacity())
                .build());

            panelComponent.getChildren().add(LineComponent.builder()
                .left("Pay-dirt:")
                .right(String.valueOf(mlmTracker.getTotalPaydirt()))
                .build());
        }

        return super.render(graphics);
    }
}
