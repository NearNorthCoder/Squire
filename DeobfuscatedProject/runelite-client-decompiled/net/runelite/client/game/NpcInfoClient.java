/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Named
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
import net.runelite.client.game.NpcInfo;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NpcInfoClient {
    private static final Logger log = LoggerFactory.getLogger(NpcInfoClient.class);
    private final OkHttpClient client;
    private final HttpUrl staticBase;
    private final Gson gson;

    @Inject
    private NpcInfoClient(OkHttpClient client, @Named(value="runelite.static.base") HttpUrl staticBase, Gson gson) {
        this.client = client;
        this.staticBase = staticBase;
        this.gson = gson;
    }

    public Map<Integer, NpcInfo> getNpcs() throws IOException {
        HttpUrl.Builder urlBuilder = this.staticBase.newBuilder().addPathSegment("npcs").addPathSegment("npcs.min.json");
        HttpUrl url = urlBuilder.build();
        log.debug("Built URI: {}", (Object)url);
        Request request = new Request.Builder().url(url).build();
        Response response = this.client.newCall(request).execute();
        try {
            if (!response.isSuccessful()) {
                throw new IOException(response.toString());
            }
            InputStream in = response.body().byteStream();
            Type typeToken = new TypeToken<Map<Integer, NpcInfo>>(){}.getType();
            Map map = (Map)this.gson.fromJson((Reader)new InputStreamReader(in, StandardCharsets.UTF_8), typeToken);
            if (response != null) {
                response.close();
            }
            return map;
        }
        catch (Throwable throwable) {
            try {
                if (response != null) {
                    try {
                        response.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            catch (JsonParseException ex) {
                throw new IOException(ex);
            }
        }
    }
}

