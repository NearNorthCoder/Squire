/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.queries;

import java.util.Collection;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.NPC;
import net.runelite.api.queries.ActorQuery;

public class NPCQuery
extends ActorQuery<NPC, NPCQuery> {
    @Override
    public LocatableQueryResults<NPC> result(Client client) {
        return new LocatableQueryResults<NPC>(client.getNpcs().stream().filter(this.predicate).collect(Collectors.toList()));
    }

    public NPCQuery idEquals(int ... ids) {
        this.predicate = this.and(object -> {
            for (int id : ids) {
                if (object.getId() != id) continue;
                return true;
            }
            return false;
        });
        return this;
    }

    public NPCQuery idEquals(Collection<Integer> ids) {
        this.predicate = this.and(object -> ids.contains(object.getId()));
        return this;
    }
}

