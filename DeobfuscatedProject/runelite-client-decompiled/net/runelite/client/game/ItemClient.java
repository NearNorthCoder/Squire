/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Named
 *  net.runelite.http.api.item.ItemPrice
 */
package net.runelite.client.game;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import net.runelite.client.game.ItemStats;
import net.runelite.http.api.item.ItemPrice;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItemClient {
    private static final Logger log = LoggerFactory.getLogger(ItemClient.class);
    private final OkHttpClient client;
    private final HttpUrl apiBase;
    private final HttpUrl staticBase;
    private final Gson gson;

    @Inject
    private ItemClient(OkHttpClient client, @Named(value="runelite.api.base") HttpUrl apiBase, @Named(value="runelite.static.base") HttpUrl staticBase, Gson gson) {
        this.client = client;
        this.apiBase = apiBase;
        this.staticBase = staticBase;
        this.gson = gson;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ItemPrice[] getPrices() throws IOException {
        HttpUrl.Builder urlBuilder = this.apiBase.newBuilder().addPathSegment("item").addPathSegment("prices.js");
        HttpUrl url = urlBuilder.build();
        log.debug("Built URI: {}", (Object)url);
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.client.newCall(request).execute();){
            if (!response.isSuccessful()) {
                log.warn("Error looking up prices: {}", (Object)response);
                ItemPrice[] itemPriceArray = null;
                return itemPriceArray;
            }
            InputStream in = response.body().byteStream();
            ItemPrice[] itemPriceArray = this.gson.fromJson((Reader)new InputStreamReader(in, StandardCharsets.UTF_8), ItemPrice[].class);
            return itemPriceArray;
        }
        catch (JsonParseException ex) {
            throw new IOException(ex);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map<Integer, ItemStats> getStats() throws IOException {
        HttpUrl.Builder urlBuilder = this.staticBase.newBuilder().addPathSegment("item").addPathSegment("stats.ids.min.json");
        HttpUrl url = urlBuilder.build();
        log.debug("Built URI: {}", (Object)url);
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.client.newCall(request).execute();){
            if (!response.isSuccessful()) {
                log.warn("Error looking up item stats: {}", (Object)response);
                Map<Integer, ItemStats> map = null;
                return map;
            }
            InputStream in = response.body().byteStream();
            Type typeToken = new TypeToken<Map<Integer, ItemStats>>(){}.getType();
            Map map = (Map)this.gson.fromJson((Reader)new InputStreamReader(in, StandardCharsets.UTF_8), typeToken);
            return map;
        }
        catch (JsonParseException ex) {
            throw new IOException(ex);
        }
    }
}

