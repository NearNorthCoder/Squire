/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.DecorativeObject;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.Tile;
import net.runelite.api.queries.TileObjectQuery;

public class DecorativeObjectQuery
extends TileObjectQuery<DecorativeObject, DecorativeObjectQuery> {
    @Override
    public LocatableQueryResults<DecorativeObject> result(Client client) {
        return new LocatableQueryResults<DecorativeObject>(this.getDecorativeObjects(client).stream().filter(Objects::nonNull).filter(this.predicate).distinct().collect(Collectors.toList()));
    }

    private Collection<DecorativeObject> getDecorativeObjects(Client client) {
        ArrayList<DecorativeObject> objects = new ArrayList<DecorativeObject>();
        for (Tile tile : this.getTiles(client)) {
            objects.add(tile.getDecorativeObject());
        }
        return objects;
    }
}

