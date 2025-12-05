/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.Tile;
import net.runelite.api.queries.TileObjectQuery;

public class GameObjectQuery
extends TileObjectQuery<GameObject, GameObjectQuery> {
    @Override
    public LocatableQueryResults<GameObject> result(Client client) {
        return new LocatableQueryResults<GameObject>(this.getGameObjects(client).stream().filter(Objects::nonNull).filter(this.predicate).distinct().collect(Collectors.toList()));
    }

    private Collection<GameObject> getGameObjects(Client client) {
        ArrayList<GameObject> objects = new ArrayList<GameObject>();
        for (Tile tile : this.getTiles(client)) {
            GameObject[] gameObjects = tile.getGameObjects();
            if (gameObjects == null) continue;
            objects.addAll(Arrays.asList(gameObjects));
        }
        return objects;
    }
}

