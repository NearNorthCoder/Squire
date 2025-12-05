package gg.squire.mixology.overlay;

import com.google.inject.Inject;
import gg.squire.mixology.SquireMixology;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.awt.*;
import java.util.List;

/**
 * Overlay for the Mixology plugin that highlights relevant NPCs and objects
 * in the game world.
 */
@Singleton
public class MixologyOverlay extends Overlay {
    private static final Logger log = LoggerFactory.getLogger(MixologyOverlay.class);

    private static final int NPC_ID_1 = 28140;
    private static final int NPC_ID_2 = 28159;
    private static final int NPC_ID_3 = 28158;
    private static final Color HIGHLIGHT_COLOR = new Color(255, 0, 0, 9);

    private final SquireMixology plugin;

    @Inject
    private MixologyOverlay(SquireMixology plugin) {
        this.plugin = plugin;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    /**
     * Gets the plugin instance.
     *
     * @return the plugin
     */
    public SquireMixology getPlugin() {
        return plugin;
    }

    @Override
    public Plugin getPlugin() {
        return getPlugin();
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        List<NPC> npcs = NPCs.getAll(NPC_ID_1, NPC_ID_2, NPC_ID_3);

        if (!npcs.isEmpty()) {
            for (NPC npc : npcs) {
                Polygon tilePoly = Perspective.getCanvasTilePoly(
                    Static.getClient(),
                    npc.getLocalLocation()
                );

                if (tilePoly == null) {
                    System.out.println("MixologyOverlay");
                    return null;
                }

                OverlayUtil.renderPolygon(
                    graphics,
                    tilePoly,
                    Color.GREEN,
                    new BasicStroke(1.0f)
                );
            }
        }

        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof MixologyOverlay)) {
            return false;
        }

        MixologyOverlay other = (MixologyOverlay) obj;

        if (!canEqual(other)) {
            return false;
        }

        SquireMixology thisPlugin = getPlugin();
        SquireMixology otherPlugin = other.getPlugin();

        if (thisPlugin == null) {
            return otherPlugin == null;
        }

        return thisPlugin.equals(otherPlugin);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof MixologyOverlay;
    }

    @Override
    public int hashCode() {
        int prime = 59;
        int result = 1;
        SquireMixology plugin = getPlugin();
        result = result * prime + (plugin == null ? 43 : plugin.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MixologyOverlay(plugin=" + getPlugin() + ")";
    }
}
