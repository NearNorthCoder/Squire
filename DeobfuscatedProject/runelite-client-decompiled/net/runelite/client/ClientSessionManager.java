/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 */
package net.runelite.client;

import gg.squire.client.Squire;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.client.SessionClient;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ClientShutdown;
import net.runelite.client.util.RunnableExceptionLogger;
import net.unethicalite.client.config.SquireConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class ClientSessionManager {
    private static final Logger log = LoggerFactory.getLogger(ClientSessionManager.class);
    private final ScheduledExecutorService executorService;
    private final Client client;
    private final SessionClient sessionClient;
    private final SquireConfig squireConfig;
    private final EventBus eventBus;
    private ScheduledFuture<?> scheduledFuture;
    private ScheduledFuture<?> scheduledPluginsFuture;
    private UUID sessionId;

    @Inject
    ClientSessionManager(ScheduledExecutorService executorService, @Nullable Client client, SessionClient sessionClient, SquireConfig squireConfig, EventBus eventBus) {
        this.executorService = executorService;
        this.client = client;
        this.sessionClient = sessionClient;
        this.squireConfig = squireConfig;
        this.eventBus = eventBus;
    }

    public void start() {
        this.eventBus.register(this.sessionClient);
        if (!this.squireConfig.session()) {
            return;
        }
        this.executorService.execute(() -> {});
        this.scheduledFuture = this.executorService.scheduleWithFixedDelay(RunnableExceptionLogger.wrap(this::ping), 1L, 10L, TimeUnit.MINUTES);
        this.scheduledPluginsFuture = this.executorService.scheduleWithFixedDelay(RunnableExceptionLogger.wrap(() -> this.pingPlugins(false)), 0L, 10L, TimeUnit.MINUTES);
    }

    @Subscribe
    private void onClientShutdown(ClientShutdown e) {
        this.scheduledFuture.cancel(true);
        this.scheduledPluginsFuture.cancel(true);
        this.pingPlugins(true);
        this.eventBus.unregister(this.sessionClient);
        e.waitFor(this.executorService.submit(() -> {
            try {
                UUID localUuid = this.sessionId;
                if (localUuid != null) {
                    this.sessionClient.delete(localUuid);
                }
            }
            catch (IOException ex) {
                log.warn(null, ex);
            }
            this.sessionId = null;
        }));
    }

    private void ping() {
        if (this.sessionId == null) {
            return;
        }
        boolean loggedIn = false;
        if (this.client != null) {
            GameState gameState = this.client.getGameState();
            loggedIn = gameState.getState() >= GameState.LOADING.getState();
        }
        try {
            this.sessionClient.ping(this.sessionId, loggedIn);
        }
        catch (IOException ex) {
            log.warn("Resetting session", ex);
            this.sessionId = null;
        }
    }

    private void pingPlugins(boolean shutoff) {
        try {
            this.sessionClient.pingPlugins(Squire.getUuid(), shutoff);
        }
        catch (IOException e) {
            log.warn("Error pinging", e);
        }
    }

    public UUID getSessionId() {
        return this.sessionId;
    }
}

