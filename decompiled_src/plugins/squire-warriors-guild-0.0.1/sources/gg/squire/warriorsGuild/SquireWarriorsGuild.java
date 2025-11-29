package gg.squire.warriorsGuild;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.warriorsGuild.overlay.WarriorsGuildInfobox;
import gg.squire.warriorsGuild.tasks.defender.preDragon.AttackCyclops;
import gg.squire.warriorsGuild.tasks.defender.preDragon.EnterCyclopsArea;
import gg.squire.warriorsGuild.tasks.defender.preDragon.LootDefender;
import gg.squire.warriorsGuild.tasks.defender.preDragon.Reset;
import gg.squire.warriorsGuild.tasks.defender.preDragon.TraverseToTopFloor;
import gg.squire.warriorsGuild.tasks.tokens.AttackAnimatedArmour;
import gg.squire.warriorsGuild.tasks.tokens.Loot;
import gg.squire.warriorsGuild.tasks.tokens.ReanimateArmour;
import java.time.Instant;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
@PluginDescriptor(name = "Squire Warriors Guild", enabledByDefault = false, description = "Dragon defender in no time.")
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/SquireWarriorsGuild.class */
public class SquireWarriorsGuild extends SquirePlugin {
    @Inject
    private EventBus eventBus;
    @Inject
    private SquireWarriorsGuildConfig config;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private WarriorsGuildInfobox warriorsGuildInfobox;
    private Instant started;

    public Instant getStarted() {
        return this.started;
    }

    @Provides
    SquireWarriorsGuildConfig provideConfig(ConfigManager config) {
        return (SquireWarriorsGuildConfig) config.getConfig(SquireWarriorsGuildConfig.class);
    }

    protected Class<?>[] tasks() {
        return new Class[]{ReanimateArmour.class, AttackAnimatedArmour.class, Loot.class, TraverseToTopFloor.class, EnterCyclopsArea.class, AttackCyclops.class, LootDefender.class, Reset.class};
    }

    protected void onStart() {
        this.started = Instant.now();
        this.overlayManager.add(this.warriorsGuildInfobox);
    }

    protected void onStop() {
        this.overlayManager.remove(this.warriorsGuildInfobox);
    }
}
