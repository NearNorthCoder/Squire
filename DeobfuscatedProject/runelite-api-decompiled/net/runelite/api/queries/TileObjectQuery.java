/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Client;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.queries.LocatableQuery;

public abstract class TileObjectQuery<EntityType extends TileObject, QueryType>
extends LocatableQuery<EntityType, QueryType> {
    protected List<Tile> getTiles(Client client) {
        ArrayList<Tile> tilesList = new ArrayList<Tile>();
        Scene scene = client.getScene();
        Tile[][][] tiles = scene.getTiles();
        int z = client.getPlane();
        for (int x = 0; x < 104; ++x) {
            for (int y = 0; y < 104; ++y) {
                Tile tile = tiles[z][x][y];
                if (tile == null) continue;
                tilesList.add(tile);
            }
        }
        return tilesList;
    }

    public QueryType idEquals(int ... ids) {
        this.predicate = this.and(object -> {
            for (int id : ids) {
                if (object.getId() != id) continue;
                return true;
            }
            return false;
        });
        return (QueryType)this;
    }

    public QueryType nameEquals(String ... names) {
        this.predicate = this.and(object -> {
            for (String name : names) {
                String objectName = object.getName();
                if (objectName == null || !objectName.equals(name)) continue;
                return true;
            }
            return false;
        });
        return (QueryType)this;
    }

    public QueryType actionEquals(String ... actions) {
        this.predicate = this.and(object -> {
            for (String action : actions) {
                String[] objectActions;
                for (String objectAction : objectActions = object.getActions()) {
                    if (objectAction == null || !objectAction.equals(action)) continue;
                    return true;
                }
            }
            return false;
        });
        return (QueryType)this;
    }

    public QueryType idEquals(Collection<Integer> ids) {
        this.predicate = this.and(object -> ids.contains(object.getId()));
        return (QueryType)this;
    }

    @Override
    public QueryType filter(Predicate<EntityType> other) {
        this.predicate = this.and(other);
        return (QueryType)this;
    }
}

