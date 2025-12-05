/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 */
package net.runelite.client.ui.overlay;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.Collection;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayPosition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WidgetOverlay
extends Overlay {
    private static final Logger log = LoggerFactory.getLogger(WidgetOverlay.class);
    protected final Client client;
    protected final int componentId;
    protected final String name;
    private final Rectangle parentBounds = new Rectangle();
    private boolean revalidate;

    public static Collection<WidgetOverlay> createOverlays(OverlayManager overlayManager, Client client) {
        return Arrays.asList(new WidgetOverlay(client, 10551392, "RESIZABLE_VIEWPORT_CHATBOX_PARENT", OverlayPosition.DYNAMIC), new WidgetOverlay(client, 10551393, "RESIZABLE_VIEWPORT_INVENTORY_PARENT", OverlayPosition.DYNAMIC), new WidgetOverlay(client, 10551391, "RESIZABLE_MINIMAP_STONES_WIDGET", OverlayPosition.CANVAS_TOP_RIGHT), new WidgetOverlay(client, 10747997, "RESIZABLE_VIEWPORT_BOTTOM_LINE_CHATBOX_PARENT", OverlayPosition.DYNAMIC), new WidgetOverlay(client, 10747996, "RESIZABLE_MINIMAP_WIDGET", OverlayPosition.CANVAS_TOP_RIGHT), new WidgetOverlay(client, 10747998, "RESIZABLE_VIEWPORT_BOTTOM_LINE_TABS1", OverlayPosition.DYNAMIC), new WidgetOverlay(client, 10747999, "RESIZABLE_VIEWPORT_BOTTOM_LINE_TABS2", OverlayPosition.DYNAMIC), new WidgetOverlay(client, 10748000, "RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_PARENT", OverlayPosition.DYNAMIC), new WidgetOverlay(client, 39911425, "FOSSIL_ISLAND_OXYGENBAR", OverlayPosition.TOP_CENTER), new XpTrackerWidgetOverlay(overlayManager, client, 7995396, "EXPERIENCE_TRACKER_WIDGET", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 33619971, "RAIDS_POINTS_INFOBOX", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 1835013, "TOB_PARTY_INTERFACE", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 1835015, "TOB_PARTY_STATS", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 26607621, "GWD_KC", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 15794178, "TITHE_FARM", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 26673154, "PEST_CONTROL_BOAT_INFO", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 26738690, "PEST_CONTROL_KNIGHT_INFO_CONTAINER", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 26738697, "PEST_CONTROL_ACTIVITY_SHIELD_INFO_CONTAINER", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 15400962, "ZEAH_MESS_HALL_COOKING_DISPLAY", OverlayPosition.TOP_LEFT), new PvpKDRWidgetOverlay(client, 5898266, "PVP_KILLDEATH_COUNTER", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 20185090, "SKOTIZO_CONTAINER", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 28049410, "PYRAMID_PLUNDER_DATA", OverlayPosition.ABOVE_CHATBOX_RIGHT), new WidgetOverlay(client, 21823490, "LMS_INFO", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 21495812, "LMS_KDA", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 41746434, "GAUNTLET_TIMER_CONTAINER", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 43778050, "HALLOWED_SEPULCHRE_TIMER_CONTAINER", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 19857413, "HEALTH_OVERLAY_BAR", OverlayPosition.TOP_CENTER), new WidgetOverlay(client, 1835017, "TOB_HEALTH_BAR", OverlayPosition.TOP_CENTER), new WidgetOverlay(client, 27066369, "NIGHTMARE_PILLAR_HEALTH", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 40042522, "VOLCANIC_MINE_VENTS_INFOBOX_GROUP", OverlayPosition.BOTTOM_RIGHT), new WidgetOverlay(client, 40042498, "VOLCANIC_MINE_STABILITY_INFOBOX_GROUP", OverlayPosition.BOTTOM_LEFT), new WidgetOverlay(client, 35913765, "MULTICOMBAT_FIXED", OverlayPosition.BOTTOM_RIGHT), new WidgetOverlay(client, 10747924, "MULTICOMBAT_RESIZABLE_MODERN", OverlayPosition.CANVAS_TOP_RIGHT), new WidgetOverlay(client, 10551316, "MULTICOMBAT_RESIZABLE_CLASSIC", OverlayPosition.CANVAS_TOP_RIGHT), new WidgetOverlay(client, 28639234, "TEMPOROSS_STATUS_INDICATOR", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 45023237, "TEMPOROSS_LOBBY", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 31981581, "BA_HEAL_TEAMMATES", OverlayPosition.BOTTOM_LEFT), new WidgetOverlay(client, 0x1000002, "BA_TEAM", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 5898284, "PVP_WILDERNESS_SKULL_CONTAINER", OverlayPosition.DYNAMIC), new WidgetOverlay(client, 50659330, "TOA_PARTY_LAYER", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 31522819, "TOA_RAID_LAYER", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 48889858, "GOTR_MAIN_DISPLAY", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 27197508, "TROUBLE_BREWING_SCORE", OverlayPosition.BOTTOM_RIGHT), new WidgetOverlay(client, 27394050, "TROUBLE_BREWING_LOBBY", OverlayPosition.BOTTOM_RIGHT), new WidgetOverlay(client, 11206658, "MORTTON_TEMPLE_STATUS", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 0x220002, "BGR_RANK_DISPLAY_DRAUGHTS", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 0x260002, "BGR_RANK_DISPLAY_RUNELINK", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 0x2A0002, "BGR_RANK_DISPLAY_RUNESQUARES", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 0x2E0002, "BGR_RANK_DISPLAY_RUNEVERSI", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 327682, "AGILITY_ARENA_LIGHT_INDICATOR", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 9109506, "GNOMEBALL_SCORE", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 0xC20002, "MTA_ALCHEMY_POINTS", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 12779522, "MTA_ENCHANT_POINTS", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 12779528, "MTA_ENCHANT_BONUS", OverlayPosition.BOTTOM_RIGHT), new WidgetOverlay(client, 12976130, "MTA_TELEKINETIC_POINTS", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 12976136, "MTA_TELEKINETIC_SOLVED", OverlayPosition.BOTTOM_RIGHT), new WidgetOverlay(client, 12845058, "MTA_GRAVEYARD_POINTS", OverlayPosition.TOP_RIGHT), new WidgetOverlay(client, 12845064, "MTA_GRAVEYARD_VALUES", OverlayPosition.BOTTOM_RIGHT), new WidgetOverlay(client, 0x3440004, "STRANGLER_INFECTION_OVERLAY", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 54657027, "SANITY_OVERLAY", OverlayPosition.TOP_LEFT), new WidgetOverlay(client, 56950786, "MOONS_OF_PERIL", OverlayPosition.BOTTOM_RIGHT), new WidgetOverlay(client, 25034755, "MLM_LAYER", OverlayPosition.TOP_LEFT));
    }

    private WidgetOverlay(Client client, int componentId, String name, OverlayPosition overlayPosition) {
        this(client, componentId, name, overlayPosition, 1.0f);
    }

    private WidgetOverlay(Client client, int componentId, String name, OverlayPosition overlayPosition, float overlayPriority) {
        this.client = client;
        this.componentId = componentId;
        this.name = name;
        this.setPriority(overlayPriority);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
        this.setPosition(overlayPosition);
        this.setMovable(true);
        this.setSnappable(true);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        Widget widget = this.client.getWidget(this.componentId);
        Rectangle parent = this.getParentBounds(widget);
        if (parent.isEmpty()) {
            return null;
        }
        assert (widget != null);
        Rectangle bounds = this.getBounds();
        if (this.getPreferredLocation() != null || this.getPreferredPosition() != null) {
            widget.setForcedPosition(bounds.x - parent.x, bounds.y - parent.y);
        } else {
            if (this.revalidate) {
                this.revalidate = false;
                log.debug("Revalidating {}", (Object)this.name);
                widget.setForcedPosition(-1, -1);
                widget.revalidate();
            }
            Rectangle widgetBounds = widget.getBounds();
            bounds.setBounds(widgetBounds.x, widgetBounds.y, widgetBounds.width, widgetBounds.height);
        }
        return new Dimension(widget.getWidth(), widget.getHeight());
    }

    private Rectangle getParentBounds(Widget widget) {
        if (widget == null || widget.isHidden()) {
            this.parentBounds.setBounds(new Rectangle());
            return this.parentBounds;
        }
        Widget parent = widget.getParent();
        Rectangle bounds = parent == null ? new Rectangle(this.client.getRealDimensions()) : parent.getBounds();
        this.parentBounds.setBounds(bounds);
        return bounds;
    }

    @Override
    public Rectangle getParentBounds() {
        if (!this.client.isClientThread()) {
            return this.parentBounds;
        }
        Widget widget = this.client.getWidget(this.componentId);
        return this.getParentBounds(widget);
    }

    @Override
    public void revalidate() {
        this.revalidate = true;
    }

    private static class PvpKDRWidgetOverlay
    extends WidgetOverlay {
        private PvpKDRWidgetOverlay(Client client, int componentId, String name, OverlayPosition overlayPosition) {
            super(client, componentId, name, overlayPosition);
        }

        @Override
        public Dimension render(Graphics2D graphics) {
            if (this.client.getVarbitValue(4143) == 1) {
                return super.render(graphics);
            }
            return null;
        }
    }

    private static class XpTrackerWidgetOverlay
    extends WidgetOverlay {
        private final OverlayManager overlayManager;

        private XpTrackerWidgetOverlay(OverlayManager overlayManager, Client client, int componentId, String name, OverlayPosition overlayPosition) {
            super(client, componentId, name, overlayPosition);
            this.overlayManager = overlayManager;
        }

        @Override
        public Dimension render(Graphics2D graphics) {
            if (this.client.getVarbitValue(4697) == 30 && this.client.getVarbitValue(4698) == 0) {
                return null;
            }
            return super.render(graphics);
        }

        @Override
        public OverlayPosition getPosition() {
            OverlayPosition position;
            if (!this.client.isClientThread()) {
                return super.getPosition();
            }
            switch (this.client.getVarbitValue(4692)) {
                default: {
                    position = OverlayPosition.TOP_RIGHT;
                    break;
                }
                case 1: {
                    position = OverlayPosition.TOP_CENTER;
                    break;
                }
                case 2: {
                    position = OverlayPosition.TOP_LEFT;
                }
            }
            if (position != super.getPosition()) {
                log.debug("Xp tracker moved position");
                this.setPosition(position);
                this.overlayManager.rebuildOverlayLayers();
            }
            return position;
        }
    }
}

