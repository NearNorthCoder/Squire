/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.AbstractModule
 *  com.google.inject.Provides
 *  com.google.inject.binder.ConstantBindingBuilder
 *  com.google.inject.name.Names
 *  com.google.inject.util.Providers
 *  javax.inject.Named
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.hooks.Callbacks
 *  net.runelite.api.packets.ClientPacket
 *  net.runelite.api.packets.ServerPacket
 *  net.runelite.http.api.RuneLiteAPI
 */
package net.runelite.client;

import com.google.common.base.Strings;
import com.google.common.math.DoubleMath;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.binder.ConstantBindingBuilder;
import com.google.inject.name.Names;
import com.google.inject.util.Providers;
import com.openosrs.client.config.OpenOSRSConfig;
import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.inject.Named;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.ServerPacket;
import net.runelite.client.NonScheduledExecutorServiceExceptionLogger;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.RuntimeConfig;
import net.runelite.client.TelemetryClient;
import net.runelite.client.account.SessionManager;
import net.runelite.client.callback.Hooks;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ChatColorConfig;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.task.Scheduler;
import net.runelite.client.util.DeferredEventBus;
import net.runelite.client.util.ExecutorServiceExceptionLogger;
import net.runelite.http.api.RuneLiteAPI;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.client.Static;
import net.unethicalite.client.config.SquireConfig;
import net.unethicalite.client.config.UnethicaliteProperties;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

public class RuneLiteModule
extends AbstractModule {
    private final OkHttpClient okHttpClient;
    private final Supplier<Applet> clientLoader;
    private final Supplier<RuntimeConfig> configSupplier;
    private final boolean developerMode;
    private final boolean safeMode;
    private final boolean disableTelemetry;
    private final File sessionfile;
    private final File config;
    private final String profile;

    protected void configure() {
        Properties properties = RuneLiteProperties.getProperties();
        HashMap<Object, Object> props = new HashMap<Object, Object>(properties);
        RuntimeConfig runtimeConfig = this.configSupplier.get();
        if (runtimeConfig != null && runtimeConfig.getProps() != null) {
            props.putAll(runtimeConfig.getProps());
        }
        for (Map.Entry entry : props.entrySet()) {
            ConstantBindingBuilder binder;
            String key = (String)entry.getKey();
            if (entry.getValue() instanceof String) {
                binder = this.bindConstant().annotatedWith((Annotation)Names.named((String)key));
                binder.to((String)entry.getValue());
                continue;
            }
            if (entry.getValue() instanceof Double) {
                binder = this.bindConstant().annotatedWith((Annotation)Names.named((String)key));
                if (DoubleMath.isMathematicalInteger((Double)entry.getValue())) {
                    binder.to((int)((Double)entry.getValue()).doubleValue());
                    continue;
                }
                binder.to(((Double)entry.getValue()).doubleValue());
                continue;
            }
            if (!(entry.getValue() instanceof Boolean)) continue;
            binder = this.bindConstant().annotatedWith((Annotation)Names.named((String)key));
            binder.to(((Boolean)entry.getValue()).booleanValue());
        }
        this.bindConstant().annotatedWith((Annotation)Names.named((String)"developerMode")).to(this.developerMode);
        this.bindConstant().annotatedWith((Annotation)Names.named((String)"safeMode")).to(this.safeMode);
        this.bindConstant().annotatedWith((Annotation)Names.named((String)"disableTelemetry")).to(this.disableTelemetry);
        this.bind(File.class).annotatedWith((Annotation)Names.named((String)"sessionfile")).toInstance((Object)this.sessionfile);
        this.bind(File.class).annotatedWith((Annotation)Names.named((String)"config")).toInstance((Object)this.config);
        this.bind(String.class).annotatedWith((Annotation)Names.named((String)"profile")).toProvider(Providers.of((Object)this.profile));
        this.bind(ScheduledExecutorService.class).toInstance((Object)new ExecutorServiceExceptionLogger(Executors.newSingleThreadScheduledExecutor()));
        this.bind(OkHttpClient.class).toInstance((Object)this.okHttpClient);
        this.bind(MenuManager.class);
        this.bind(ChatMessageManager.class);
        this.bind(ItemManager.class);
        this.bind(Scheduler.class);
        this.bind(PluginManager.class);
        this.bind(SessionManager.class);
        this.bind(Gson.class).toInstance((Object)RuneLiteAPI.GSON);
        this.bind(Callbacks.class).to(Hooks.class);
        this.bind(EventBus.class).toInstance((Object)new EventBus());
        this.bind(EventBus.class).annotatedWith((Annotation)Names.named((String)"Deferred EventBus")).to(DeferredEventBus.class);
        this.requestStaticInjection(new Class[]{Static.class});
        Properties unethicaliteProperties = UnethicaliteProperties.getProperties();
        for (String key : unethicaliteProperties.stringPropertyNames()) {
            String value = unethicaliteProperties.getProperty(key);
            this.bindConstant().annotatedWith((Annotation)Names.named((String)key)).to(value);
        }
    }

    @Provides
    @Singleton
    Applet provideApplet() {
        return this.clientLoader.get();
    }

    @Provides
    @Singleton
    Client provideClient(@Nullable Applet applet) {
        return applet instanceof Client ? (Client)applet : null;
    }

    @Provides
    @Singleton
    RuntimeConfig provideRuntimeConfig() {
        return this.configSupplier.get();
    }

    @Provides
    @Singleton
    RuneLiteConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(RuneLiteConfig.class);
    }

    @Provides
    @Singleton
    ChatColorConfig provideChatColorConfig(ConfigManager configManager) {
        return configManager.getConfig(ChatColorConfig.class);
    }

    @Provides
    @Named(value="runelite.api.base")
    HttpUrl provideApiBase(@Named(value="runelite.api.base") String s) {
        String prop = System.getProperty("runelite.http-service.url");
        return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
    }

    @Provides
    @Named(value="runelite.session")
    HttpUrl provideSession(@Named(value="runelite.session") String s) {
        String prop = System.getProperty("runelite.session.url");
        return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
    }

    @Provides
    @Named(value="runelite.static.base")
    HttpUrl provideStaticBase(@Named(value="runelite.static.base") String s) {
        String prop = System.getProperty("runelite.static.url");
        return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
    }

    @Provides
    @Named(value="runelite.ws")
    HttpUrl provideWs(@Named(value="runelite.ws") String s) {
        String prop = System.getProperty("runelite.ws.url");
        return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
    }

    @Provides
    @Named(value="runelite.pluginhub.url")
    HttpUrl providePluginHubBase(@Named(value="runelite.pluginhub.url") String s) {
        return HttpUrl.get(System.getProperty("runelite.pluginhub.url", s));
    }

    @Provides
    @Singleton
    TelemetryClient provideTelemetry(OkHttpClient okHttpClient, Gson gson, @Named(value="runelite.api.base") HttpUrl apiBase) {
        return this.disableTelemetry ? null : new TelemetryClient(okHttpClient, gson, apiBase);
    }

    @Provides
    @Singleton
    OpenOSRSConfig provideOpenOSRSConfig(ConfigManager configManager) {
        return configManager.getConfig(OpenOSRSConfig.class);
    }

    @Provides
    @Singleton
    ExecutorService provideExecutorService() {
        int poolSize = 2 * Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(poolSize, poolSize, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new ThreadFactoryBuilder().setNameFormat("worker-%d").build());
        executor.allowCoreThreadTimeOut(true);
        return new NonScheduledExecutorServiceExceptionLogger(executor);
    }

    @Provides
    @Singleton
    @Nullable
    ClientPacket provideClientPacket(@Nullable Client client) {
        assert (client != null);
        return client.createClientPacket(-1, -1);
    }

    @Provides
    @Singleton
    @Nullable
    ServerPacket provideServerPacket(@Nullable Client client) {
        assert (client != null);
        return client.createServerPacket(-1, -1);
    }

    @Provides
    @Singleton
    GlobalCollisionMap provideGlobalCollisionMap(@Named(value="unethicalite.api.url") String apiUrl) throws IOException {
        return GlobalCollisionMap.fetchFromUrl(apiUrl + "/regions");
    }

    @Provides
    @Singleton
    SquireConfig provideUnethicaliteConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireConfig.class);
    }

    public RuneLiteModule(OkHttpClient okHttpClient, Supplier<Applet> clientLoader, Supplier<RuntimeConfig> configSupplier, boolean developerMode, boolean safeMode, boolean disableTelemetry, File sessionfile, File config, String profile) {
        this.okHttpClient = okHttpClient;
        this.clientLoader = clientLoader;
        this.configSupplier = configSupplier;
        this.developerMode = developerMode;
        this.safeMode = safeMode;
        this.disableTelemetry = disableTelemetry;
        this.sessionfile = sessionfile;
        this.config = config;
        this.profile = profile;
    }
}

