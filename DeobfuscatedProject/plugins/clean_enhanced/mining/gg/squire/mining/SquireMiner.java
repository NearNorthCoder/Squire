package gg.squire.mining;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.fw.PluginBase;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;

/**
 * Squire Miner plugin - supports multiple mining activities including
 * Motherlode Mine, Sandstone, Gem rocks, and more.
 */
@Extension
@PluginDescriptor(
    name = "Squire Miner",
    description = "Automated mining for various activities",
    enabledByDefault = false
)
public class SquireMiner extends PluginBase<SquireMinerConfig> {
    @Inject
    private Client client;

    @Inject
    private SquireMinerConfig config;

    @Inject
    private MotherlodeMineTracker mlmTracker;

    @Inject
    private RockTracker rockTracker;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private MiningInfoBox infoBox;

    @Provides
    SquireMinerConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireMinerConfig.class);
    }

    @Override
    protected void startUp() throws Exception {
        super.startUp();
        mlmTracker.reset();
        overlayManager.add(infoBox);
    }

    @Override
    protected void shutDown() throws Exception {
        super.shutDown();
        overlayManager.remove(infoBox);
    }

    @Subscribe
    public void onGameTick(GameTick event) {
        // Reset tracking if needed
        if (config.activity() == MiningActivity.MOTHERLODE_MINE) {
            if (mlmTracker.getPreviousOreCount() == 0) {
                mlmTracker.reset();
            }
        }
    }

    /**
     * Stops the plugin.
     */
    public void forceStop() {
        this.stop();
    }
}
