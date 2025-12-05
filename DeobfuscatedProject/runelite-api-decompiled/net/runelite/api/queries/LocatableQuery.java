/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.function.Predicate;
import net.runelite.api.Locatable;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.Query;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

public abstract class LocatableQuery<EntityType extends Locatable, QueryType>
extends Query<EntityType, QueryType, LocatableQueryResults<EntityType>> {
    public QueryType atWorldLocation(WorldPoint location) {
        this.predicate = this.and(object -> object.getWorldLocation().equals(location));
        return (QueryType)this;
    }

    public QueryType atLocalLocation(LocalPoint location) {
        this.predicate = this.and(object -> object.getLocalLocation().equals(location));
        return (QueryType)this;
    }

    public QueryType isWithinDistance(LocalPoint to, int distance) {
        this.predicate = this.and(a -> a.getLocalLocation().distanceTo(to) <= distance);
        return (QueryType)this;
    }

    public QueryType isWithinDistance(WorldPoint to, int distance) {
        this.predicate = this.and(a -> a.getWorldLocation().distanceTo(to) <= distance);
        return (QueryType)this;
    }

    public QueryType isWithinArea(LocalPoint from, int area) {
        this.predicate = this.and(a -> {
            LocalPoint localLocation = a.getLocalLocation();
            return Math.abs(localLocation.getX() - from.getX()) < area && Math.abs(localLocation.getY() - from.getY()) < area;
        });
        return (QueryType)this;
    }

    public QueryType filter(Predicate<EntityType> other) {
        this.predicate = this.and(other);
        return (QueryType)this;
    }
}

