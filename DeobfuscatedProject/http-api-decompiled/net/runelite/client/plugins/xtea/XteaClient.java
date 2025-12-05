/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Named
 */
package net.runelite.client.plugins.xtea;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.xtea.XteaKey;
import net.runelite.http.api.xtea.XteaRequest;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XteaClient {
    private static final Logger log = LoggerFactory.getLogger(XteaClient.class);
    private final OkHttpClient client;
    private final HttpUrl apiBase;
    private final Gson gson;

    @Inject
    private XteaClient(OkHttpClient client, @Named(value="runelite.api.base") HttpUrl apiBase, Gson gson) {
        this.client = client;
        this.apiBase = apiBase;
        this.gson = gson;
    }

    public void submit(XteaRequest xteaRequest) {
        HttpUrl url = this.apiBase.newBuilder().addPathSegment("xtea").build();
        log.debug("Built URI: {}", (Object)url);
        Request request = new Request.Builder().post(RequestBody.create(RuneLiteAPI.JSON, this.gson.toJson(xteaRequest))).url(url).build();
        this.client.newCall(request).enqueue(new Callback(){

            @Override
            public void onFailure(Call call, IOException e) {
                log.warn("unable to submit xtea keys", e);
            }

            @Override
            public void onResponse(Call call, Response response) {
                try {
                    if (!response.isSuccessful()) {
                        log.debug("unsuccessful xtea response");
                    }
                }
                finally {
                    response.close();
                }
            }
        });
    }

    public List<XteaKey> get() throws IOException {
        HttpUrl url = this.apiBase.newBuilder().addPathSegment("xtea").build();
        Request request = new Request.Builder().url(url).build();
        Response response = this.client.newCall(request).execute();
        try {
            InputStream in = response.body().byteStream();
            List list = (List)this.gson.fromJson((Reader)new InputStreamReader(in, StandardCharsets.UTF_8), new TypeToken<List<XteaKey>>(){}.getType());
            if (response != null) {
                response.close();
            }
            return list;
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

    public XteaKey get(int region) throws IOException {
        HttpUrl url = this.apiBase.newBuilder().addPathSegment("xtea").addPathSegment(Integer.toString(region)).build();
        Request request = new Request.Builder().url(url).build();
        Response response = this.client.newCall(request).execute();
        try {
            InputStream in = response.body().byteStream();
            XteaKey xteaKey = this.gson.fromJson((Reader)new InputStreamReader(in, StandardCharsets.UTF_8), XteaKey.class);
            if (response != null) {
                response.close();
            }
            return xteaKey;
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

