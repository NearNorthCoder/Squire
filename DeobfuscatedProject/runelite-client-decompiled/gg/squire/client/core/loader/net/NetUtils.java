/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.core.loader.net;

import gg.squire.client.Squire;
import gg.squire.client.plugins.SquirePlugin;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class NetUtils {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean confirm(SquirePlugin plugin) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(new HttpUrl.Builder().scheme("https").host("g0dp8zyku3.execute-api.eu-west-1.amazonaws.com").port(443).addPathSegments("default/TestConfirm").addQueryParameter("auth", Squire.getKey()).addQueryParameter("plugin", plugin.getResourceName()).addQueryParameter("session", Squire.getUuid().toString()).build()).header("X-Authentication-Key", Squire.getKey()).header("X-Hardware-Id", Squire.getIdentifier()).header("Accept", "application/json").get().build();
        try (Response response = client.newCall(request).execute();){
            if (response.code() != 200) {
                boolean bl = false;
                return bl;
            }
            ResponseBody body = response.body();
            if (body == null) {
                boolean bl = false;
                return bl;
            }
            String responseString = body.string();
            boolean bl = responseString.contains(Squire.getKey());
            return bl;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static void delete(SquirePlugin pluginEnabled) {
    }

    public static void clear() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(new HttpUrl.Builder().scheme("https").host("g0dp8zyku3.execute-api.eu-west-1.amazonaws.com").port(443).addPathSegments("default/Session-Clear").addQueryParameter("auth", Squire.getKey()).addQueryParameter("session", Squire.getUuid().toString()).build()).addHeader("X-Authentication-Key", Squire.getKey()).addHeader("X-Hardware-Id", Squire.getIdentifier()).build();
        try (Response response = client.newCall(request).execute();){
            if (!response.isSuccessful()) {
                // empty if block
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

