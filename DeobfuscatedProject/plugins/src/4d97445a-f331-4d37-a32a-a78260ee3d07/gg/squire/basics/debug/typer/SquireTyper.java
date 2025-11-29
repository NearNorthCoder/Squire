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
package gg.squire.basics.debug.typer;

import com.google.inject.Provides;
import gg.squire.basics.debug.typer.SquireTyperConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.al;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Typer", enabledByDefault=false)
public class SquireTyper
extends SquirePlugin {
    private static /* synthetic */ int[] llllIl;

    private static void llllIIII() {
        llllIl = new int[2];
        SquireTyper.llllIl[0] = " ".length();
        SquireTyper.llllIl[1] = ("   ".length() ^ (0xB7 ^ 0x9B)) & (0x98 ^ 0x89 ^ (0x9C ^ 0xA2) ^ -" ".length());
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllIl[0]];
        classArray[SquireTyper.llllIl[1]] = al.class;
        return classArray;
    }

    @Provides
    SquireTyperConfig i(ConfigManager configManager) {
        return (SquireTyperConfig)configManager.getConfig(SquireTyperConfig.class);
    }

    protected void onStop() {
    }

    static {
        SquireTyper.llllIIII();
    }

    protected void onStart() {
    }
}

