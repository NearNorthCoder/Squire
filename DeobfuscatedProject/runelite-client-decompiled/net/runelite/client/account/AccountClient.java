/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Named
 *  net.runelite.http.api.account.OAuthResponse
 */
package net.runelite.client.account;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Named;
import net.runelite.http.api.account.OAuthResponse;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountClient {
    private static final Logger log = LoggerFactory.getLogger(AccountClient.class);
    private final OkHttpClient client;
    private final HttpUrl apiBase;
    private final Gson gson;
    private UUID uuid;

    @Inject
    private AccountClient(OkHttpClient client, @Named(value="runelite.api.base") HttpUrl apiBase, Gson gson) {
        this.client = client;
        this.apiBase = apiBase;
        this.gson = gson;
    }

    public OAuthResponse login(int port) throws IOException {
        HttpUrl url = this.apiBase.newBuilder().addPathSegment("account").addPathSegment("login").addQueryParameter("port", Integer.toString(port)).build();
        log.debug("Built URI: {}", (Object)url);
        Request request = new Request.Builder().url(url).build();
        Response response = this.client.newCall(request).execute();
        try {
            InputStream in = response.body().byteStream();
            OAuthResponse oAuthResponse = this.gson.fromJson((Reader)new InputStreamReader(in, StandardCharsets.UTF_8), OAuthResponse.class);
            if (response != null) {
                response.close();
            }
            return oAuthResponse;
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

    public void logout() throws IOException {
        HttpUrl url = this.apiBase.newBuilder().addPathSegment("account").addPathSegment("logout").build();
        log.debug("Built URI: {}", (Object)url);
        Request request = new Request.Builder().header("RUNELITE-AUTH", this.uuid.toString()).url(url).build();
        try (Response ignored = this.client.newCall(request).execute();){
            log.debug("Sent logout request");
        }
    }

    public boolean sessionCheck() {
        HttpUrl url = this.apiBase.newBuilder().addPathSegment("account").addPathSegment("session-check").build();
        log.debug("Built URI: {}", (Object)url);
        Request request = new Request.Builder().header("RUNELITE-AUTH", this.uuid.toString()).url(url).build();
        Response response = this.client.newCall(request).execute();
        try {
            boolean bl = response.isSuccessful();
            if (response != null) {
                response.close();
            }
            return bl;
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
            catch (IOException ex) {
                log.debug("Unable to verify session", ex);
                return true;
            }
        }
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}

