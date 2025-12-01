package gg.squire.basics.combat.Lure;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.M;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.O;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.P;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.Q;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.HotkeyListener;
@PluginDescriptor(name = "Squire Lurer", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/Lure/SquireLurer.class */
public class SquireLurer extends SquirePlugin {
    @Inject
    private /* synthetic */ LureConfig bU;
    private static /* synthetic */ int[] lIllllIlI;
    @Inject
    public /* synthetic */ M bW;
    @Inject
    private /* synthetic */ EventBus K;
    private final /* synthetic */ HotkeyListener bX = new O(this, () -> {
        return this.bU.activate();
    });
    @Inject
    private /* synthetic */ KeyManager bY;

    @Provides
    public LureConfig e(ConfigManager configManager) {
        return (LureConfig) configManager.getConfig(LureConfig.class);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIllllIlI[0]];
        clsArr[lIllllIlI[1]] = Q.class;
        clsArr[lIllllIlI[2]] = P.class;
        return clsArr;
    }

    private static void lIlIIlIIIlI() {
        lIllllIlI = new int[3];
        lIllllIlI[0] = "  ".length();
        lIllllIlI[1] = ((77 ^ 115) ^ (24 ^ 101)) & (((((88 + 17) - (-9)) + 87) ^ (((30 + 104) - 124) + 128)) ^ (-" ".length()));
        lIllllIlI[2] = " ".length();
    }

    static {
        lIlIIlIIIlI();
    }

    protected void onStart() {
        this.K.register(this.bW);
        this.bY.registerKeyListener(this.bX);
    }

    protected void onStop() {
        this.K.unregister(this.bW);
        this.bY.unregisterKeyListener(this.bX);
    }
}
