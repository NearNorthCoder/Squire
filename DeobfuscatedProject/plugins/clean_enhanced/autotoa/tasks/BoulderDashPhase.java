/*
 * Deobfuscated TOA Boulder Dash Phase Enum
 * Represents the phases of the boulder dash puzzle in Path of Het
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Point;
import java.util.List;

/**
 * Represents the different phases of the boulder dash puzzle.
 *
 * In the Path of Het, players must navigate through a course while
 * avoiding rolling boulders. Each phase has:
 * - Boulder spawn/roll positions
 * - Jug location (water collection point)
 * - Standing position (safe spot)
 */
public enum BoulderDashPhase {
    FIRST(
        List.of(new Point(24, 28), new Point(24, 32), new Point(28, 30)),
        new Point(0, 0),
        new Point(0, 0)
    ),
    SECOND(
        List.of(new Point(24, 32), new Point(28, 30), new Point(24, 34)),
        new Point(0, 0),
        new Point(0, 0)
    ),
    THIRD(
        List.of(new Point(28, 32), new Point(24, 30), new Point(32, 34)),
        new Point(24, 36),
        new Point(24, 38)
    ),
    FOURTH(
        List.of(new Point(32, 30), new Point(32, 34)),
        new Point(0, 0),
        new Point(24, 40)
    ),
    FIFTH(
        List.of(new Point(32, 34), new Point(32, 36), new Point(32, 38)),
        new Point(0, 0),
        new Point(0, 0)
    );

    /** Positions where boulders spawn/roll */
    private final List<Point> boulders;

    /** Location of water jug (if applicable) */
    private final Point jug;

    /** Safe standing position */
    private final Point stand;

    BoulderDashPhase(List<Point> boulders, Point jug, Point stand) {
        this.boulders = boulders;
        this.jug = jug;
        this.stand = stand;
    }

    /**
     * Get boulder positions for this phase
     */
    public List<Point> getBoulders() {
        return this.boulders;
    }

    /**
     * Get jug position (may be Point(0,0) if not applicable)
     */
    public Point getJug() {
        return this.jug;
    }

    /**
     * Get safe standing position (may be Point(0,0) if not applicable)
     */
    public Point getStand() {
        return this.stand;
    }

    /**
     * Check if this phase has a jug to interact with
     */
    public boolean hasJug() {
        return jug.getX() != 0 || jug.getY() != 0;
    }

    /**
     * Check if this phase has a designated standing position
     */
    public boolean hasStandingPosition() {
        return stand.getX() != 0 || stand.getY() != 0;
    }

    /**
     * Check if a point is on a boulder path
     */
    public boolean isOnBoulderPath(Point position) {
        return boulders.stream().anyMatch(b ->
            b.getX() == position.getX() || b.getY() == position.getY()
        );
    }
}
