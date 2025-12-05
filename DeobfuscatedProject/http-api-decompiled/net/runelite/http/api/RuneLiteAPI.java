/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import net.runelite.http.api.gson.ColorTypeAdapter;
import net.runelite.http.api.gson.IllegalReflectionExclusion;
import net.runelite.http.api.gson.InstantTypeAdapter;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuneLiteAPI {
    private static final Logger logger = LoggerFactory.getLogger(RuneLiteAPI.class);
    public static final String RUNELITE_AUTH = "RUNELITE-AUTH";
    public static final String RUNELITE_MACHINEID = "RUNELITE-MACHINEID";
    public static OkHttpClient CLIENT;
    public static final Gson GSON;
    public static final MediaType JSON;
    public static String userAgent;
    private static final String BASE = "https://api.runelite.net";
    private static final Properties properties;
    private static String version;
    private static String jagexAccountIdentifier;

    public static HttpUrl getApiBase() {
        String prop = System.getProperty("runelite.http-service.url");
        if (prop != null && !prop.isEmpty()) {
            return HttpUrl.parse(prop);
        }
        return HttpUrl.parse("https://api.runelite.net/runelite-" + RuneLiteAPI.getVersion());
    }

    public static String getVersion() {
        return version;
    }

    public static String getJagexAccountIdentifier() {
        return jagexAccountIdentifier;
    }

    public static void setJagexAccountIdentifier(String jagexAccountIdentifier) {
        RuneLiteAPI.jagexAccountIdentifier = jagexAccountIdentifier;
    }

    static {
        JSON = MediaType.parse("application/json");
        properties = new Properties();
        try {
            InputStream in = RuneLiteAPI.class.getResourceAsStream("/runelite.properties");
            properties.load(in);
            version = properties.getProperty("runelite.version");
            String commit = properties.getProperty("runelite.commit");
            boolean dirty = Boolean.parseBoolean(properties.getProperty("runelite.dirty"));
            userAgent = "RuneLite/" + version + "-" + commit + (dirty ? "+" : "");
        }
        catch (NumberFormatException e) {
            throw new RuntimeException("Version string has not been substituted; Re-run maven");
        }
        catch (IOException ex) {
            logger.error(null, ex);
        }
        CLIENT = new OkHttpClient.Builder().pingInterval(30L, TimeUnit.SECONDS).addNetworkInterceptor(new Interceptor(){

            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request userAgentRequest = chain.request().newBuilder().header("User-Agent", userAgent).build();
                return chain.proceed(userAgentRequest);
            }
        }).build();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter((Type)((Object)Instant.class), new InstantTypeAdapter()).registerTypeAdapter((Type)((Object)Color.class), new ColorTypeAdapter());
        boolean assertionsEnabled = false;
        if (!$assertionsDisabled) {
            assertionsEnabled = true;
            if (!true) {
                throw new AssertionError();
            }
        }
        if (assertionsEnabled) {
            IllegalReflectionExclusion jbe = new IllegalReflectionExclusion();
            gsonBuilder.addSerializationExclusionStrategy(jbe);
            gsonBuilder.addDeserializationExclusionStrategy(jbe);
        }
        GSON = gsonBuilder.create();
    }
}

