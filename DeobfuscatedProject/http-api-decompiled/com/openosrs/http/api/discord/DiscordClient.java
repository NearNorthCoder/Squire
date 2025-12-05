/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord;

import com.google.gson.Gson;
import com.openosrs.http.api.discord.DiscordMessage;
import java.io.IOException;
import net.runelite.http.api.RuneLiteAPI;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscordClient {
    private static final Logger log = LoggerFactory.getLogger(DiscordClient.class);
    public static final Gson gson = new Gson();
    private static final MediaType JSON = MediaType.parse("application/json");

    public void message(String url, DiscordMessage discordMessage) {
        this.message(HttpUrl.parse(url), discordMessage);
    }

    public void message(HttpUrl url, DiscordMessage discordMessage) {
        log.debug("Message being sent");
        this.message(url, discordMessage, 0, 5);
    }

    private void message(final HttpUrl url, final DiscordMessage discordMessage, final int retryAttempt, final int maxAttempts) {
        RequestBody body = RequestBody.create(JSON, gson.toJson(discordMessage));
        Request request = new Request.Builder().post(body).url(url).build();
        log.debug("Attempting to message with {}", (Object)discordMessage);
        RuneLiteAPI.CLIENT.newCall(request).enqueue(new Callback(){

            @Override
            public void onFailure(Call call, IOException e) {
                log.warn("Unable to submit discord post.", e);
                if (retryAttempt < maxAttempts) {
                    DiscordClient.this.message(url, discordMessage, retryAttempt + 1, maxAttempts);
                }
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    if (response.body() == null) {
                        log.debug("API Call - Reponse was null.");
                        return;
                    }
                    if (response.body().string().contains("You are being rate limited") && retryAttempt < maxAttempts) {
                        log.debug("You are being rate limited, retrying...");
                        DiscordClient.this.message(url, discordMessage, retryAttempt + 1, maxAttempts);
                    }
                }
                finally {
                    response.close();
                    log.debug("Submitted discord log record");
                }
            }
        });
    }
}

