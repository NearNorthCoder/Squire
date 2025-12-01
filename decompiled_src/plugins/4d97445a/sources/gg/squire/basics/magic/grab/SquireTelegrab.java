package gg.squire.basics.magic.grab;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aR;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
@PluginDescriptor(name = "Squire Telegrab", description = "Telegrabs items", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/magic/grab/SquireTelegrab.class */
public class SquireTelegrab extends SquirePlugin {
    private static /* synthetic */ int[] lIlIIllI;

    protected void onStart() {
    }

    @Provides
    SquireTelegrabConfig p(ConfigManager configManager) {
        return (SquireTelegrabConfig) configManager.getConfig(SquireTelegrabConfig.class);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIIllI[0]];
        clsArr[lIlIIllI[1]] = aR.class;
        return clsArr;
    }

    static {
        lIIlIlIlll();
    }

    protected void onStop() {
    }

    private static void lIIlIlIlll() {
        lIlIIllI = new int[2];
        lIlIIllI[0] = " ".length();
        lIlIIllI[1] = (254 ^ 188) & ((121 ^ 59) ^ (-1));
    }
}
