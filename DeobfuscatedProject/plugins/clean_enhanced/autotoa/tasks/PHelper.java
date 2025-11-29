/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.KephriManager;

/**
 * ProjectileOverlay - Renders projectile target locations with colored tiles.
 *
 * This overlay visualizes where projectiles will land by drawing colored
 * tiles at their target locations. Two different projectile types are
 * tracked and rendered with different colors:
 * - Primary projectiles: Yellow/orange color (255, 60, 60, 145 RGBA)
 * - Secondary projectiles: Green color (255, 0, 0, 145 RGBA)
 */
public class ProjectileOverlay extends AutotoaTaskBase {

    /** The projectile manager tracking active projectiles */
    private final AutotoaManager projectileManager;

    /** TOA configuration */
    private final TOAConfig config;

    /** RuneLite client instance */
    private final Client client;

    /**
     * Color component values for rendering projectile tiles.
     * [0] = 255 (red component for both types)
     * [1] = 60 (green/blue for primary projectiles)
     * [2] = 145 (alpha transparency)
     * [3] = 0 (green/blue for secondary projectiles)
     * [4] = 1 (boolean true value)
     */
    private static int[] COLOR_COMPONENTS;

    /**
     * Creates a new projectile overlay.
     *
     * @param client RuneLite client instance
     * @param config TOA configuration
     * @param projectileManager The projectile manager
     */
    @Inject
    protected ProjectileOverlay(Client client, TOAConfig config, AutotoaManager projectileManager) {
        super(config);
        this.client = client;
        this.config = config;
        this.projectileManager = projectileManager;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    /**
     * Initializes the color component values.
     */
    private static void initializeColorComponents() {
        COLOR_COMPONENTS = new int[5];
        // Red component (255)
        ProjectileOverlay.COLOR_COMPONENTS[0] = 21 + 8 - -127 + 13 + (0x8C ^ 0xA2) - (132 + 79 - 182 + 159) + (192 + 87 - 196 + 145);
        // Green/blue for primary (60)
        ProjectileOverlay.COLOR_COMPONENTS[1] = 0xE ^ 0x32;
        // Alpha transparency (145)
        ProjectileOverlay.COLOR_COMPONENTS[2] = 93 + 53 - 68 + 74 + (0x67 ^ 0x53) - (0x16 ^ 0x58) + (0x6F ^ 0x58);
        // Green/blue for secondary (0)
        ProjectileOverlay.COLOR_COMPONENTS[3] = (0x22 ^ 0xA) & ~(0x9D ^ 0xB5);
        // Boolean true
        ProjectileOverlay.COLOR_COMPONENTS[4] = 1;
    }

    /**
     * Renders projectile target indicators.
     *
     * @param graphics The graphics context to draw on
     */
    private void renderProjectiles(Graphics2D graphics) {
        // Remove expired primary projectiles (past end cycle)
        this.projectileManager.getPrimaryProjectiles().removeIf(projectile -> {
            return isExpired(projectile.getEndCycle(), this.client.getGameCycle())
                ? COLOR_COMPONENTS[4] != 0  // true
                : COLOR_COMPONENTS[3] != 0; // false
        });

        // Remove expired secondary projectiles (past end cycle)
        this.projectileManager.getSecondaryProjectiles().removeIf(projectile -> {
            return isExpired(projectile.getEndCycle(), this.client.getGameCycle())
                ? COLOR_COMPONENTS[4] != 0  // true
                : COLOR_COMPONENTS[3] != 0; // false
        });

        // Render primary projectiles in yellow/orange
        Iterator<Projectile> primaryIterator = this.projectileManager.getPrimaryProjectiles().iterator();
        while (isTrue(primaryIterator.hasNext() ? 1 : 0)) {
            Projectile projectile = primaryIterator.next();
            LocalPoint target = projectile.getTarget();

            // Create yellow/orange color (255, 60, 60, 145)
            Color primaryColor = new Color(
                COLOR_COMPONENTS[0],
                COLOR_COMPONENTS[1],
                COLOR_COMPONENTS[1],
                COLOR_COMPONENTS[2]
            );

            this.renderTile(graphics, primaryColor, target);
        }

        // Render secondary projectiles in green
        Iterator<Projectile> secondaryIterator = this.projectileManager.getSecondaryProjectiles().iterator();
        while (isTrue(secondaryIterator.hasNext() ? 1 : 0)) {
            Projectile projectile = secondaryIterator.next();

            // Create green color (255, 0, 0, 145)
            Color secondaryColor = new Color(
                COLOR_COMPONENTS[0],
                COLOR_COMPONENTS[3],
                COLOR_COMPONENTS[3],
                COLOR_COMPONENTS[2]
            );

            this.renderTile(graphics, secondaryColor, projectile.getTarget());
        }
    }

    /**
     * Checks if a projectile has expired based on its end cycle.
     *
     * @param endCycle The projectile's end cycle
     * @param currentCycle The current game cycle
     * @return true if the projectile has expired
     */
    private static boolean isExpired(int endCycle, int currentCycle) {
        return endCycle < currentCycle;
    }

    /**
     * Checks if an integer represents a true boolean value.
     *
     * @param value The integer to check
     * @return true if value is non-zero
     */
    private static boolean isTrue(int value) {
        return value != 0;
    }

    static {
        ProjectileOverlay.initializeColorComponents();
    }

    /**
     * Renders the overlay by drawing projectile indicators.
     *
     * @param graphics The graphics context to draw on
     * @return null (no specific dimension requirements)
     */
    public Dimension render(Graphics2D graphics) {
        this.renderProjectiles(graphics);
        return null;
    }

    /**
     * Renders a colored tile at the specified location.
     * Note: This method likely calls a helper method to draw the tile polygon.
     *
     * @param graphics The graphics context
     * @param color The color to render
     * @param location The location to render at
     */
    private void renderTile(Graphics2D graphics, Color color, LocalPoint location) {
        // Implementation depends on helper methods from the task manager or parent class
        // This would typically render a polygon overlay at the tile location
    }
}
