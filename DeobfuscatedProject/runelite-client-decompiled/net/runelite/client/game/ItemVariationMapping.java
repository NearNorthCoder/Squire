/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.game;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class ItemVariationMapping {
    private static final Map<Integer, Integer> MAPPINGS;
    private static final Multimap<Integer, Integer> INVERTED_MAPPINGS;

    public static int map(int itemId) {
        return MAPPINGS.getOrDefault(itemId, itemId);
    }

    public static Collection<Integer> getVariations(int itemId) {
        return INVERTED_MAPPINGS.asMap().getOrDefault(itemId, Collections.singletonList(itemId));
    }

    static {
        Map itemVariations;
        Gson gson = new Gson();
        TypeToken<Map<String, Collection<Integer>>> typeToken = new TypeToken<Map<String, Collection<Integer>>>(){};
        try (InputStream geLimitData = ItemVariationMapping.class.getResourceAsStream("/item_variations.json");){
            itemVariations = (Map)gson.fromJson((Reader)new InputStreamReader(geLimitData, StandardCharsets.UTF_8), typeToken.getType());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        ImmutableMap.Builder<Integer, Integer> builder = new ImmutableMap.Builder<Integer, Integer>();
        ImmutableMultimap.Builder<Integer, Integer> invertedBuilder = new ImmutableMultimap.Builder<Integer, Integer>();
        for (Collection value : itemVariations.values()) {
            Iterator iterator = value.iterator();
            int base = (Integer)iterator.next();
            while (iterator.hasNext()) {
                int id = (Integer)iterator.next();
                builder.put(id, base);
                invertedBuilder.put(base, id);
            }
            invertedBuilder.put(base, base);
        }
        INVERTED_MAPPINGS = invertedBuilder.build();
        MAPPINGS = builder.build();
    }
}

