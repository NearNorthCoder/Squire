/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.Tile;
import net.runelite.api.queries.TileObjectQuery;

public class GroundObjectQuery
extends TileObjectQuery<GroundObject, GroundObjectQuery> {
    @Override
    public LocatableQueryResults<GroundObject> result(Client client) {
        return new LocatableQueryResults<GroundObject>(this.getGroundObjects(client).stream().filter(Objects::nonNull).filter(this.predicate).distinct().collect(Collectors.toList()));
    }

    private Collection<GroundObject> getGroundObjects(Client client) {
        ArrayList<GroundObject> objects = new ArrayList<GroundObject>();
        for (Tile tile : this.getTiles(client)) {
            objects.add(tile.getGroundObject());
        }
        return objects;
    }
}

