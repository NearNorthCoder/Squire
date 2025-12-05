/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.reactivex.rxjava3.core.Completable
 *  io.reactivex.rxjava3.schedulers.Schedulers
 *  javax.inject.Inject
 *  javax.inject.Singleton
 */
package com.openosrs.client.game;

import com.google.common.collect.ImmutableMap;
import com.google.gson.stream.JsonReader;
import com.openosrs.client.game.NPCStats;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class NPCManager {
    private static final Logger log = LoggerFactory.getLogger(NPCManager.class);
    private static final Set<Integer> blacklistXpMultiplier = Set.of(8026, 8058, 8059, 8060, 8061, 7850, 7852, 7853, 7884, 7885, 7849, 7851, 7854, 7855, 7882, 7883, 7886, 7887, 7888, 7889, 494, 6640, 6656, 2042, 2043, 2044);
    private ImmutableMap<Integer, NPCStats> statsMap;

    @Inject
    private NPCManager() {
        Completable.fromAction(this::loadStats).subscribeOn(Schedulers.computation()).subscribe(() -> log.debug("Loaded {} NPC stats", (Object)this.statsMap.size()), ex -> log.warn("Error loading NPC stats", (Throwable)ex));
    }

    private void loadStats() throws IOException {
        try (JsonReader reader = new JsonReader(new InputStreamReader(NPCManager.class.getResourceAsStream("/npc_stats.json"), StandardCharsets.UTF_8));){
            ImmutableMap.Builder<Integer, NPCStats> builder = ImmutableMap.builderWithExpectedSize(3123);
            reader.beginObject();
            while (reader.hasNext()) {
                builder.put(Integer.parseInt(reader.nextName()), NPCStats.NPC_STATS_TYPE_ADAPTER.read(reader));
            }
            reader.endObject();
            this.statsMap = builder.build();
        }
    }

    @Nullable
    public NPCStats getStats(int npcId) {
        return this.statsMap.get(npcId);
    }

    public int getHealth(int npcId) {
        NPCStats s = this.statsMap.get(npcId);
        if (s == null || s.getHitpoints() == -1) {
            return -1;
        }
        return s.getHitpoints();
    }

    public int getAttackSpeed(int npcId) {
        NPCStats s = this.statsMap.get(npcId);
        if (s == null || s.getAttackSpeed() == -1) {
            return -1;
        }
        return s.getAttackSpeed();
    }

    public double getXpModifier(int npcId) {
        if (blacklistXpMultiplier.contains(npcId)) {
            return 1.0;
        }
        NPCStats s = this.statsMap.get(npcId);
        if (s == null) {
            return 1.0;
        }
        return s.calculateXpModifier();
    }
}

