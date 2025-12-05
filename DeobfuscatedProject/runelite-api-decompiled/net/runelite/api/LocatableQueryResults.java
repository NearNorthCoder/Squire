/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.Collection;
import java.util.Comparator;
import javax.annotation.Nullable;
import net.runelite.api.Locatable;
import net.runelite.api.QueryResults;

public class LocatableQueryResults<EntityType extends Locatable>
extends QueryResults<EntityType> {
    public LocatableQueryResults(Collection<? extends EntityType> results) {
        super(results);
    }

    @Nullable
    public EntityType nearestTo(Locatable locatable) {
        return (EntityType)((Locatable)this.stream().min(Comparator.comparing(entityType -> entityType.getLocalLocation().distanceTo(locatable.getLocalLocation()))).orElse(null));
    }
}

