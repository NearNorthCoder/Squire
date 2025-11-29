package gg.squire.basics.debug.typer;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0012al;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Typer", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/debug/typer/SquireTyper.class */
public class SquireTyper extends SquirePlugin {
    private static /* synthetic */ int[] llllIl;

    private static void llllIIII() {
        llllIl = new int[2];
        llllIl[0] = " ".length();
        llllIl[1] = ("   ".length() ^ (183 ^ 155)) & (((152 ^ 137) ^ (156 ^ 162)) ^ (-" ".length()));
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llllIl[0]];
        clsArr[llllIl[1]] = C0012al.class;
        return clsArr;
    }

    @Provides
    SquireTyperConfig i(ConfigManager configManager) {
        return (SquireTyperConfig) configManager.getConfig(SquireTyperConfig.class);
    }

    protected void onStop() {
    }

    static {
        llllIIII();
    }

    protected void onStart() {
    }
}
