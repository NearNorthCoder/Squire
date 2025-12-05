/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.queries.TileObjectQuery;

public class WallObjectQuery
extends TileObjectQuery<WallObject, WallObjectQuery> {
    @Override
    public LocatableQueryResults<WallObject> result(Client client) {
        return new LocatableQueryResults<WallObject>(this.getWallObjects(client).stream().filter(Objects::nonNull).filter(this.predicate).distinct().collect(Collectors.toList()));
    }

    private Collection<WallObject> getWallObjects(Client client) {
        ArrayList<WallObject> objects = new ArrayList<WallObject>();
        for (Tile tile : this.getTiles(client)) {
            objects.add(tile.getWallObject());
        }
        return objects;
    }
}

