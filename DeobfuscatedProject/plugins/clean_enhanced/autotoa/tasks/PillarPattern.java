/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Point
 */
package gg.squire.autotoa.tasks;

import java.util.List;
import java.util.Set;
import net.runelite.api.Point;

/**
 * Represents the movement and attack patterns for each pillar type.
 * Defines clockwise movement order and which tiles receive attacks.
 */
public enum PillarPattern {
    DEATH(
        List.of(new Point(28, 23), new Point(23, 28), new Point(28, 20), new Point(21, 22)),
        Set.of(new Point(28, 20), new Point(28, 23))
    ),
    LIGHTNING(
        List.of(new Point(23, 19), new Point(28, 24), new Point(21, 17), new Point(28, 18)),
        Set.of(new Point(28, 24), new Point(28, 18))
    ),
    FIRE(
        List.of(new Point(10, 28), new Point(13, 20), new Point(20, 22), new Point(13, 23)),
        Set.of(new Point(13, 20), new Point(13, 23))
    ),
    AIR(
        List.of(new Point(10, 19), new Point(13, 24), new Point(20, 17), new Point(13, 18)),
        Set.of(new Point(13, 24), new Point(13, 18))
    );

    private final List<Point> clockwiseMovement;
    private final Set<Point> attackTiles;

    PillarPattern(List<Point> clockwiseMovement, Set<Point> attackTiles) {
        this.clockwiseMovement = clockwiseMovement;
        this.attackTiles = attackTiles;
    }

    /**
     * Gets the list of points the pillar moves through in clockwise order.
     * @return list of movement points
     */
    public List<Point> getClockwiseMovement() {
        return this.clockwiseMovement;
    }

    /**
     * Gets the set of tiles that receive attacks from this pillar.
     * @return set of attack tile coordinates
     */
    public Set<Point> getAttackTiles() {
        return this.attackTiles;
    }
}
