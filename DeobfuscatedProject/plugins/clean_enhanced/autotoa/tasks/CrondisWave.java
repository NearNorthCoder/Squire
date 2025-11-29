/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Point
 */
package gg.squire.autotoa.tasks;

import java.util.List;
import net.runelite.api.Point;

/**
 * Represents the different wave phases in the Path of Crondis.
 * Each wave has specific boulder positions, jug location, and standing position.
 */
public enum CrondisWave {
    FIRST(
        List.of(new Point(163, 142), new Point(163, 135), new Point(180, 48)),
        new Point(1, 1),
        new Point(1, 1)
    ),
    SECOND(
        List.of(new Point(163, 135), new Point(180, 48), new Point(163, 119)),
        new Point(1, 1),
        new Point(1, 1)
    ),
    THIRD(
        List.of(new Point(180, 135), new Point(163, 48), new Point(171, 119)),
        new Point(163, 27),
        new Point(163, 54)
    ),
    FOURTH(
        List.of(new Point(171, 48), new Point(171, 119)),
        new Point(1, 1),
        new Point(163, 53)
    ),
    FIFTH(
        List.of(new Point(171, 119), new Point(171, 34), new Point(171, 35)),
        new Point(1, 1),
        new Point(1, 1)
    );

    private final List<Point> boulderPositions;
    private final Point jugPosition;
    private final Point standingPosition;

    CrondisWave(List<Point> boulderPositions, Point jugPosition, Point standingPosition) {
        this.boulderPositions = boulderPositions;
        this.jugPosition = jugPosition;
        this.standingPosition = standingPosition;
    }

    /**
     * Gets the list of boulder positions for this wave.
     * @return list of boulder coordinates
     */
    public List<Point> getBoulderPositions() {
        return this.boulderPositions;
    }

    /**
     * Gets the jug position for this wave.
     * @return the jug coordinate
     */
    public Point getJugPosition() {
        return this.jugPosition;
    }

    /**
     * Gets the recommended standing position for this wave.
     * @return the standing coordinate
     */
    public Point getStandingPosition() {
        return this.standingPosition;
    }
}
