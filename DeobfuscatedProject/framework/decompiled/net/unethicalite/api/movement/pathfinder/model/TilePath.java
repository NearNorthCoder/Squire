/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  org.jetbrains.annotations.NotNull
 */
package net.unethicalite.api.movement.pathfinder.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import net.runelite.api.coords.WorldPoint;
import org.jetbrains.annotations.NotNull;

public final class TilePath
extends ArrayList<WorldPoint> {
    private final boolean incomplete;

    public TilePath(boolean incomplete) {
        this.incomplete = incomplete;
    }

    public TilePath(Collection<WorldPoint> worldPoints, boolean incomplete) {
        this(incomplete);
        this.addAll(worldPoints);
    }

    public static TilePath empty() {
        return new TilePath(true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        TilePath that = (TilePath)o;
        return this.incomplete == that.incomplete;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.incomplete);
    }

    @NotNull
    public TilePath subList(int fromIndex, int toIndex) {
        return new TilePath(super.subList(fromIndex, toIndex), this.incomplete);
    }

    public boolean isIncomplete() {
        return this.incomplete;
    }
}
