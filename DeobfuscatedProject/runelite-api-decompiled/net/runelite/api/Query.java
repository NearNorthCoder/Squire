/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.function.Predicate;
import net.runelite.api.Client;
import net.runelite.api.QueryResults;

public abstract class Query<EntityType, QueryType, QR extends QueryResults> {
    protected Predicate<EntityType> predicate = x -> true;

    protected Query() {
    }

    public abstract QR result(Client var1);

    protected Predicate<EntityType> and(Predicate<EntityType> other) {
        if (this.predicate == null) {
            return other;
        }
        return this.predicate.and(other);
    }
}

