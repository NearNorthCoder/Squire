/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.http.api.RuneLiteAPI
 */
package net.runelite.client;

import com.google.common.base.Strings;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.RuntimeConfig;
import net.runelite.http.api.RuneLiteAPI;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuntimeConfigLoader
implements Supplier<RuntimeConfig> {
    private static final Logger log = LoggerFactory.getLogger(RuntimeConfigLoader.class);
    private final OkHttpClient okHttpClient;
    private final CompletableFuture<RuntimeConfig> configFuture;

    public RuntimeConfigLoader(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
        this.configFuture = this.fetch();
    }

    @Override
    public RuntimeConfig get() {
        try {
            return this.configFuture.get();
        }
        catch (InterruptedException | ExecutionException e) {
            log.error("error fetching runtime config", e);
            return null;
        }
    }

    @Nullable
    public RuntimeConfig tryGet() {
        try {
            return this.configFuture.get(0L, TimeUnit.SECONDS);
        }
        catch (InterruptedException | ExecutionException | TimeoutException e) {
            return null;
        }
    }

    private CompletableFuture<RuntimeConfig> fetch() {
        final CompletableFuture<RuntimeConfig> future = new CompletableFuture<RuntimeConfig>();
        String prop = System.getProperty("runelite.rtconf");
        if (!Strings.isNullOrEmpty(prop)) {
            try {
                String strConf = new String(Files.readAllBytes(Paths.get(prop, new String[0])), StandardCharsets.UTF_8);
                RuntimeConfig conf = RuneLiteAPI.GSON.fromJson(strConf, RuntimeConfig.class);
                log.info("Using local runtime config: {}", (Object)conf);
                future.complete(conf);
                return future;
            }
            catch (IOException e) {
                throw new RuntimeException("failed to load override runtime config", e);
            }
        }
        Request request = new Request.Builder().url(RuneLiteProperties.getRuneLiteConfig()).build();
        this.okHttpClient.newCall(request).enqueue(new Callback(){

            @Override
            public void onFailure(Call call, IOException e) {
                future.completeExceptionally(e);
            }

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            @Override
            public void onResponse(Call call, Response response) {
                try {
                    RuntimeConfig config = RuneLiteAPI.GSON.fromJson(response.body().charStream(), RuntimeConfig.class);
                    future.complete(config);
                }
                catch (Throwable ex) {
                    future.completeExceptionally(ex);
                }
                finally {
                    response.close();
                }
            }
        });
        return future;
    }
}

