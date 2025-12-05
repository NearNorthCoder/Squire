/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.function.Predicate;
import net.runelite.api.Actor;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.queries.LocatableQuery;

public abstract class ActorQuery<EntityType extends Actor, QueryType>
extends LocatableQuery<EntityType, QueryType> {
    public QueryType nameEquals(String ... names) {
        this.predicate = this.and(actor -> {
            for (String name : names) {
                String actorName = actor.getName();
                if (actorName == null || !actorName.equals(name)) continue;
                return true;
            }
            return false;
        });
        return (QueryType)this;
    }

    public QueryType nameContains(String ... names) {
        this.predicate = this.and(actor -> {
            for (String name : names) {
                String actorName = actor.getName();
                if (actorName == null || !actorName.contains(name)) continue;
                return true;
            }
            return false;
        });
        return (QueryType)this;
    }

    public QueryType isLevel(int level) {
        this.predicate = this.and(actor -> actor.getCombatLevel() == level);
        return (QueryType)this;
    }

    public QueryType animationEquals(int animation) {
        this.predicate = this.and(actor -> actor.getAnimation() == animation);
        return (QueryType)this;
    }

    public QueryType isInteractingWith(Actor actor) {
        this.predicate = this.and(a -> a.getInteracting().equals(actor));
        return (QueryType)this;
    }

    public QueryType isWithinArea(WorldPoint from, int area) {
        this.predicate = this.and(a -> a.getWorldArea().distanceTo(from) <= area);
        return (QueryType)this;
    }

    public QueryType hasNoHealthBar() {
        this.predicate = this.and(a -> a.getHealthRatio() == -1);
        return (QueryType)this;
    }

    @Override
    public QueryType filter(Predicate<EntityType> other) {
        this.predicate = this.and(other);
        return (QueryType)this;
    }
}

