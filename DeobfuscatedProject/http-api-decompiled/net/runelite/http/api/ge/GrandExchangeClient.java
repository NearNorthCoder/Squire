/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ge;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.UUID;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.ge.GrandExchangeTrade;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrandExchangeClient {
    private static final Logger log = LoggerFactory.getLogger(GrandExchangeClient.class);
    private static final Gson GSON = RuneLiteAPI.GSON;
    private final OkHttpClient client;
    private UUID uuid;
    private String machineId;

    public void submit(GrandExchangeTrade grandExchangeTrade) {
        HttpUrl url = RuneLiteAPI.getApiBase().newBuilder().addPathSegment("ge").build();
        Request.Builder builder = new Request.Builder();
        if (this.uuid != null) {
            builder.header("RUNELITE-AUTH", this.uuid.toString());
        }
        if (this.machineId != null) {
            builder.header("RUNELITE-MACHINEID", this.machineId);
        }
        Request request = builder.post(RequestBody.create(RuneLiteAPI.JSON, GSON.toJson(grandExchangeTrade))).url(url).build();
        this.client.newCall(request).enqueue(new Callback(){

            @Override
            public void onFailure(Call call, IOException e) {
                log.debug("unable to submit trade", e);
            }

            @Override
            public void onResponse(Call call, Response response) {
                log.debug("Submitted trade");
                response.close();
            }
        });
    }

    public GrandExchangeClient(OkHttpClient client) {
        this.client = client;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }
}

