package gg.squire.basics.chopburn;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Chop 'n Burn", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/chopburn/SquireChopAndBurn.class */
public class SquireChopAndBurn extends SquirePlugin {
    private static /* synthetic */ int[] lIIllIIlI;

    @Provides
    ChopBurnConfig b(ConfigManager configManager) {
        return (ChopBurnConfig) configManager.getConfig(ChopBurnConfig.class);
    }

    protected void onStop() {
    }

    static {
        lIIIIllIIII();
    }

    private static void lIIIIllIIII() {
        lIIllIIlI = new int[2];
        lIIllIIlI[0] = " ".length();
        lIIllIIlI[1] = ((((50 + 36) - 54) + 96) ^ (((16 + 169) - 122) + 134)) & (((60 ^ 22) ^ (235 ^ 132)) ^ (-" ".length()));
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllIIlI[0]];
        clsArr[lIIllIIlI[1]] = C.class;
        return clsArr;
    }
}
