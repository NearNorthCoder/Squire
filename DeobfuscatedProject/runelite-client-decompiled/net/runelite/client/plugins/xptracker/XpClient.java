/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Named
 */
package net.runelite.client.plugins.xptracker;

import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XpClient {
    private static final Logger log = LoggerFactory.getLogger(XpClient.class);
    private final OkHttpClient client;
    private final HttpUrl apiBase;

    @Inject
    private XpClient(OkHttpClient client, @Named(value="runelite.api.base") HttpUrl apiBase) {
        this.client = client;
        this.apiBase = apiBase;
    }

    public void update(final String username) {
        HttpUrl url = this.apiBase.newBuilder().addPathSegment("xp").addPathSegment("update").addQueryParameter("username", username).build();
        Request request = new Request.Builder().url(url).build();
        this.client.newCall(request).enqueue(new Callback(){

            @Override
            public void onFailure(Call call, IOException e) {
                log.warn("Error submitting xp track", e);
            }

            @Override
            public void onResponse(Call call, Response response) {
                response.close();
                log.debug("Submitted xp track for {}", (Object)username);
            }
        });
    }
}

