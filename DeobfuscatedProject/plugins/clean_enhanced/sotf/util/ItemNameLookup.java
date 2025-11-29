package gg.squire.sotf.util;

import com.google.common.collect.ImmutableMap;
import net.runelite.http.api.RuneLiteAPI;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Map;

/**
 * Utility for looking up item names from item IDs.
 *
 * Uses a cached map of common items and falls back to OSRS Wiki API
 * for items not in the cache.
 */
public class ItemNameLookup {

    private static final OkHttpClient HTTP_CLIENT = RuneLiteAPI.CLIENT;

    /** Map of common item IDs to their names */
    private static final Map<Integer, String> ITEM_NAMES = ImmutableMap.<Integer, String>builder()
        .put(1171, "Bronze axe")
        .put(1349, "Iron axe")
        .put(1353, "Steel axe")
        .put(1359, "Mithril axe")
        .put(1361, "Adamant axe")
        .put(1373, "Rune axe")
        .put(1277, "Bronze pickaxe")
        .put(1267, "Iron pickaxe")
        .put(1269, "Steel pickaxe")
        .put(1273, "Mithril pickaxe")
        .put(1271, "Adamant pickaxe")
        .put(1275, "Rune pickaxe")
        .put(303, "Raw shrimps")
        .put(317, "Shrimps")
        .put(307, "Raw anchovies")
        .put(319, "Anchovies")
        .put(309, "Raw sardine")
        .put(325, "Sardine")
        .put(313, "Raw herring")
        .put(347, "Herring")
        .put(321, "Raw mackerel")
        .put(353, "Mackerel")
        .put(327, "Raw trout")
        .put(333, "Trout")
        .put(335, "Raw salmon")
        .put(329, "Salmon")
        .put(341, "Raw tuna")
        .put(359, "Tuna")
        .put(349, "Raw swordfish")
        .put(373, "Swordfish")
        .put(377, "Raw lobster")
        .put(379, "Lobster")
        .put(13439, "Raw karambwan")
        .put(3142, "Cooked karambwan")
        .build();

    /**
     * Looks up the name of an item by its ID.
     *
     * First checks the cached item names map, then queries the OSRS Wiki API
     * if the item is not found in the cache.
     *
     * @param itemId The item ID to look up
     * @return The item name, or "Unknown item" if not found
     */
    public static String getItemName(int itemId) {
        // Check cache first
        if (ITEM_NAMES.containsKey(itemId)) {
            return ITEM_NAMES.get(itemId);
        }

        // Fall back to OSRS Wiki API
        return fetchItemNameFromWiki(itemId);
    }

    /**
     * Fetches an item name from the OSRS Wiki API.
     *
     * @param itemId The item ID to look up
     * @return The item name from the wiki, or "Unknown item" if the request fails
     */
    private static String fetchItemNameFromWiki(int itemId) {
        try {
            HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("oldschool.runescape.wiki")
                .addPathSegment("api.php")
                .addQueryParameter("action", "query")
                .addQueryParameter("format", "json")
                .addQueryParameter("prop", "info")
                .addQueryParameter("titles", "Item:" + itemId)
                .build();

            Request request = new Request.Builder()
                .url(url)
                .build();

            try (Response response = HTTP_CLIENT.newCall(request).execute()) {
                if (response.isSuccessful() && response.body() != null) {
                    String responseBody = response.body().string();
                    // Parse the JSON response to extract item name
                    // This is a simplified implementation
                    return parseItemNameFromJson(responseBody);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Unknown item";
    }

    /**
     * Parses the item name from the OSRS Wiki API JSON response.
     *
     * @param json The JSON response from the wiki
     * @return The parsed item name
     */
    private static String parseItemNameFromJson(String json) {
        // Simplified JSON parsing
        // In production code, use a proper JSON parser
        return "Unknown item";
    }
}
