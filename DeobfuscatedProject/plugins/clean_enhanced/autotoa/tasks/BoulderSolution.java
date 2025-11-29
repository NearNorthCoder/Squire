/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

/**
 * Represents a solution for clearing a boulder in the Crondis room.
 * Contains information about which boulder to attack, which jug to use,
 * and where to position.
 */
public final class BoulderSolution {
    // The boulder NPC that needs to be cleared
    final NPC boulder;

    // The jug NPC to use (water container)
    final NPC jug;

    // The target world point to move towards
    final WorldPoint targetPoint;

    // Whether this is a diagonal movement
    private final boolean isDiagonal;

    // Whether the boulder needs to be attacked first
    final boolean needsAttack;

    /**
     * Creates a new boulder clearing solution.
     *
     * @param boulder The boulder NPC to clear
     * @param jug The jug NPC to use for water
     * @param targetPoint The point to move towards
     * @param diagonal Whether this requires diagonal movement
     * @param attack Whether the boulder needs to be attacked
     */
    public BoulderSolution(NPC boulder, NPC jug, WorldPoint targetPoint,
                          boolean diagonal, boolean attack) {
        this.boulder = boulder;
        this.jug = jug;
        this.targetPoint = targetPoint;
        this.isDiagonal = diagonal;
        this.needsAttack = attack;
    }

    /**
     * Gets the boulder NPC.
     *
     * @return The boulder to clear
     */
    public NPC getBoulder() {
        return this.boulder;
    }

    /**
     * Gets the jug NPC.
     *
     * @return The jug to use
     */
    public NPC getJug() {
        return this.jug;
    }

    /**
     * Gets the target world point.
     *
     * @return The point to move towards
     */
    public WorldPoint getTargetPoint() {
        return this.targetPoint;
    }

    /**
     * Checks if this solution requires diagonal movement.
     *
     * @return true if diagonal movement is needed
     */
    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    /**
     * Checks if the boulder needs to be attacked.
     *
     * @return true if attack is needed
     */
    public boolean needsAttack() {
        return this.needsAttack;
    }

    /**
     * Calculates the tile to stand on based on the boulder and jug positions.
     * For diagonal moves, calculates the diagonal tile.
     * For straight moves, calculates the appropriate adjacent tile.
     *
     * @return The world point to stand on
     */
    public WorldPoint getStandingTile() {
        if (this.isDiagonal()) {
            // Move diagonally from the jug towards the target
            int xOffset = (int) Math.signum(this.jug.getWorldX() - this.targetPoint.getWorldX());
            int yOffset = (int) Math.signum(this.jug.getWorldY() - this.targetPoint.getWorldY());
            return this.jug.getWorldLocation().dx(xOffset).dy(yOffset);
        }

        // For straight moves, check if we need horizontal or vertical alignment
        if (this.jug.getWorldY() != this.boulder.getWorldY() ||
            this.jug.getWorldY() == this.targetPoint.getWorldY()) {
            // Move horizontally
            int xOffset = (int) Math.signum(this.jug.getWorldX() - this.boulder.getWorldX());
            return this.jug.getWorldLocation().dx(xOffset);
        }

        // Move vertically
        int yOffset = (int) Math.signum(this.jug.getWorldY() - this.boulder.getWorldY());
        return this.jug.getWorldLocation().dy(yOffset);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoulderSolution)) {
            return false;
        }

        BoulderSolution other = (BoulderSolution) obj;

        if (this.isDiagonal() != other.isDiagonal()) {
            return false;
        }
        if (this.needsAttack() != other.needsAttack()) {
            return false;
        }

        NPC thisBoulder = this.getBoulder();
        NPC otherBoulder = other.getBoulder();
        if (thisBoulder == null) {
            if (otherBoulder != null) {
                return false;
            }
        } else if (!thisBoulder.equals(otherBoulder)) {
            return false;
        }

        NPC thisJug = this.getJug();
        NPC otherJug = other.getJug();
        if (thisJug == null) {
            if (otherJug != null) {
                return false;
            }
        } else if (!thisJug.equals(otherJug)) {
            return false;
        }

        WorldPoint thisPoint = this.getTargetPoint();
        WorldPoint otherPoint = other.getTargetPoint();
        if (thisPoint == null) {
            if (otherPoint != null) {
                return false;
            }
        } else if (!thisPoint.equals(otherPoint)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "BoulderSolution(boulder=" + this.getBoulder() +
               ", jug=" + this.getJug() +
               ", target=" + this.getTargetPoint() +
               ", diagonal=" + this.isDiagonal() +
               ", needsAttack=" + this.needsAttack() + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;

        result = result * prime + (this.isDiagonal() ? 79 : 97);
        result = result * prime + (this.needsAttack() ? 79 : 97);

        NPC boulder = this.getBoulder();
        result = result * prime + (boulder == null ? 43 : boulder.hashCode());

        NPC jug = this.getJug();
        result = result * prime + (jug == null ? 43 : jug.hashCode());

        WorldPoint point = this.getTargetPoint();
        result = result * prime + (point == null ? 43 : point.hashCode());

        return result;
    }
}
