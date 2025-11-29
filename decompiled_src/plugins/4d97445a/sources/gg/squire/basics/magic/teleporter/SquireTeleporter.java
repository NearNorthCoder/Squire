package gg.squire.basics.magic.teleporter;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aV;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Teleporter", description = "Teleports for Magic XP", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/magic/teleporter/SquireTeleporter.class */
public class SquireTeleporter extends SquirePlugin {
    private static /* synthetic */ int[] llIlllIII;

    private static void lIlllllIIIl() {
        llIlllIII = new int[2];
        llIlllIII[0] = " ".length();
        llIlllIII[1] = (19 ^ 88) & ((87 ^ 28) ^ (-1));
    }

    static {
        lIlllllIIIl();
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIlllIII[0]];
        clsArr[llIlllIII[1]] = aV.class;
        return clsArr;
    }

    protected void onStart() {
    }

    @Provides
    SquireTeleporterConfig r(ConfigManager configManager) {
        return (SquireTeleporterConfig) configManager.getConfig(SquireTeleporterConfig.class);
    }

    protected void onStop() {
    }
}
