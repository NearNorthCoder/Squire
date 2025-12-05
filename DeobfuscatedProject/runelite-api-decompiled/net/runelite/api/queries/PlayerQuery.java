/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.List;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.Player;
import net.runelite.api.queries.ActorQuery;

public class PlayerQuery
extends ActorQuery<Player, PlayerQuery> {
    @Override
    public LocatableQueryResults<Player> result(Client client) {
        List<Player> players = client.getPlayers();
        return new LocatableQueryResults<Player>(players.stream().filter(this.predicate).collect(Collectors.toList()));
    }
}

