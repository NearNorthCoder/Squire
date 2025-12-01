package gg.squire.basics.prayer.prayerflicker;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0033bf;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0034bg;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.widgets.Prayers;
@SquireUtil
@PluginDescriptor(name = "Squire Prayer Flicker", description = "Pray flicks", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/prayer/prayerflicker/SquirePrayFlick.class */
public class SquirePrayFlick extends SquirePlugin {
    public /* synthetic */ boolean fu;
    @Inject
    public /* synthetic */ PrayFlickerConfig ft;
    private final /* synthetic */ KeyListener fv = new C0033bf(this);
    private static /* synthetic */ int[] lIlIIII;
    @Inject
    private /* synthetic */ KeyManager bY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lIlIIIIIl(this.fu ? 1 : 0) && lIlIIIIlI(Prayers.isQuickPrayerEnabled() ? 1 : 0) && lIlIIIIIl(this.ft.keepPrayerOn() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean) lIlIIII[0]);
        }
    }

    protected void onStop() {
        this.bY.unregisterKeyListener(this.fv);
    }

    protected void onStart() {
        this.bY.registerKeyListener(this.fv);
    }

    private static boolean lIlIIIIlI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIIIIl(int i2) {
        return i2 == 0;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIIII[1]];
        clsArr[lIlIIII[0]] = C0034bg.class;
        return clsArr;
    }

    public boolean isEnabled() {
        return this.fu;
    }

    static {
        lIlIIIIII();
    }

    @Provides
    PrayFlickerConfig s(ConfigManager configManager) {
        return (PrayFlickerConfig) configManager.getConfig(PrayFlickerConfig.class);
    }

    private static void lIlIIIIII() {
        lIlIIII = new int[2];
        lIlIIII[0] = ((27 ^ 50) ^ (169 ^ 160)) & (((((76 + 55) - 102) + 138) ^ (((16 + 99) - 44) + 64)) ^ (-" ".length()));
        lIlIIII[1] = " ".length();
    }
}
