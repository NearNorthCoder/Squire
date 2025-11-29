package gg.squire.plugins.charters;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import u.e.a.r.s.h.s.e.h.r.p000.p.p001.q.s.t.i.c.i.r.c;
@PluginDescriptor(name = "Squire Charter Ships", enabledByDefault = false, description = "Does crafting methods")
/* loaded from: a162439f-48e7-4aeb-adb7-778d42249168.jar:gg/squire/plugins/charters/SquireCharterShips.class */
public class SquireCharterShips extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager a;
    private static /* synthetic */ int[] lIlIlllIIIII;

    @Provides
    SquireCharterConfig a(ConfigManager configManager) {
        return (SquireCharterConfig) configManager.getConfig(SquireCharterConfig.class);
    }

    static {
        lllIIIIlIIlllI();
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIlllIIIII[0]];
        clsArr[lIlIlllIIIII[1]] = c.class;
        return clsArr;
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    private static void lllIIIIlIIlllI() {
        lIlIlllIIIII = new int[2];
        lIlIlllIIIII[0] = " ".length();
        lIlIlllIIIII[1] = (133 ^ 144) & ((19 ^ 6) ^ (-1));
    }
}
