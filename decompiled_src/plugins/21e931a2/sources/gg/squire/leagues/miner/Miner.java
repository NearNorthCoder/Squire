package gg.squire.leagues.miner;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055.c;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
@PluginDescriptor(name = "[Leagues] Miner", enabledByDefault = false)
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/miner/Miner.class */
public class Miner extends SquirePlugin {
    private static /* synthetic */ int[] llIII;

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIII[0]];
        clsArr[llIII[1]] = c.class;
        return clsArr;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    protected void onStart() {
    }

    private static void lIIlIll() {
        llIII = new int[2];
        llIII[0] = " ".length();
        llIII[1] = ((((19 + 30) - (-48)) + 75) ^ (((29 + 90) - (-8)) + 10)) & (((((25 + 40) - (-19)) + 67) ^ (((48 + 107) - 66) + 89)) ^ (-" ".length()));
    }

    @Provides
    MinerConfig c(ConfigManager configManager) {
        return (MinerConfig) configManager.getConfig(MinerConfig.class);
    }

    protected void onStop() {
    }

    static {
        lIIlIll();
    }
}
