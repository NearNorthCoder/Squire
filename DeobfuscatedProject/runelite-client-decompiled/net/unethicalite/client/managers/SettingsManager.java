/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Named
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.http.api.RuneLiteAPI
 */
package net.unethicalite.client.managers;

import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Named;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.http.api.RuneLiteAPI;
import net.unethicalite.api.account.GameAccount;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SettingsManager {
    private static final Logger log = LoggerFactory.getLogger(SettingsManager.class);
    private final Client client;
    private final OptionSet clientArgs;
    private final ConfigManager configManager;
    private boolean initializedArgs;

    @Inject
    public SettingsManager(Client client, @Named(value="clientArgs") OptionSet clientArgs, EventBus eventBus, ConfigManager configManager) {
        this.client = client;
        this.clientArgs = clientArgs;
        this.configManager = configManager;
        eventBus.register(this);
    }

    public static OptionSet parseArgs(OptionParser parser, String ... args) {
        ArgumentAcceptingOptionSpec<String> accInfo = parser.accepts("account").withRequiredArg().ofType(String.class);
        ArgumentAcceptingOptionSpec<String> cacheDirInfo = parser.accepts("cache-dir").withOptionalArg().ofType(String.class);
        parser.accepts("minimal");
        parser.accepts("norender");
        parser.accepts("script").withRequiredArg().ofType(String.class);
        parser.accepts("scriptArgs").withRequiredArg().ofType(String.class);
        OptionSet options = parser.parse(args);
        if (options.has("account")) {
            String string = options.valueOf(accInfo);
            if (!string.contains(":")) {
                RuneLiteAPI.setJagexAccountIdentifier((String)string);
            } else {
                String[] details = string.split(":");
                GameAccount gameAccount = new GameAccount(details[0], details[1]);
                if (details.length >= 3) {
                    gameAccount.setAuth(details[2]);
                }
                Game.setGameAccount(gameAccount);
            }
        }
        if (options.has("scriptArgs")) {
            Static.setScriptArgs(((String)options.valueOf("scriptArgs")).split(","));
        }
        if (options.has("script")) {
            Static.setScript((String)options.valueOf("script"));
        }
        if (options.has("cache-dir")) {
            String cacheDir = options.valueOf(cacheDirInfo);
            if (cacheDir != null) {
                System.setProperty("unethicalite.cache-dir", cacheDir);
            } else {
                GameAccount acc = Game.getGameAccount();
                if (acc != null) {
                    System.setProperty("unethicalite.cache-dir", acc.getUsername());
                } else {
                    System.setProperty("unethicalite.cache-dir", UUID.randomUUID().toString());
                }
            }
        }
        return options;
    }

    private void initArgs() {
        if (this.clientArgs.has("norender")) {
            this.configManager.setConfiguration("unethicalite", "renderOff", true);
        }
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged e) {
        if (e.getGameState() == GameState.LOGIN_SCREEN && !this.initializedArgs) {
            this.initArgs();
            this.initializedArgs = true;
        }
    }

    @Subscribe
    private void onConfigChanged(ConfigChanged event) {
        if (!event.getGroup().equals("unethicalite")) {
            return;
        }
        if ("renderOff".equals(event.getKey())) {
            boolean enabled = Boolean.parseBoolean(event.getNewValue());
            this.client.setLowCpu(enabled);
        }
    }
}

