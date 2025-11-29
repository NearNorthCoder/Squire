/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.magic.teleporter;

import com.google.inject.Provides;
import gg.squire.basics.magic.teleporter.SquireTeleporterConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aV;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Teleporter", description="Teleports for Magic XP", enabledByDefault=false)
public class SquireTeleporter
extends SquirePlugin {
    private static /* synthetic */ int[] llIlllIII;

    private static void lIlllllIIIl() {
        llIlllIII = new int[2];
        SquireTeleporter.llIlllIII[0] = 1;
        SquireTeleporter.llIlllIII[1] = (0x13 ^ 0x58) & ~(0x57 ^ 0x1C);
    }

    static {
        SquireTeleporter.lIlllllIIIl();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIlllIII[0]];
        classArray[SquireTeleporter.llIlllIII[1]] = aV.class;
        return classArray;
    }

    protected void onStart() {
    }

    @Provides
    SquireTeleporterConfig r(ConfigManager configManager) {
        return (SquireTeleporterConfig)configManager.getConfig(SquireTeleporterConfig.class);
    }

    protected void onStop() {
    }
}

