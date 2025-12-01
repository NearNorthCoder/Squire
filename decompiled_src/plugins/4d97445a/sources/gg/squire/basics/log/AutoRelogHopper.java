package gg.squire.basics.log;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aC;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aD;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aE;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aF;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Relog Hopper", description = "Automatically relogs when you get logged out", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/log/AutoRelogHopper.class */
public class AutoRelogHopper extends SquirePlugin {
    private static /* synthetic */ int[] llIIIIll;
    private /* synthetic */ boolean bV;

    static {
        lIlIlIllIl();
    }

    public boolean aI() {
        return this.bV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStop() {
        this.bV = llIIIIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStart() {
        this.bV = llIIIIll[2];
    }

    private static void lIlIlIllIl() {
        llIIIIll = new int[5];
        llIIIIll[0] = 147 ^ 151;
        llIIIIll[1] = ((((68 + 131) - 11) + 14) ^ (((75 + 23) - 53) + 90)) & (((91 ^ 102) ^ (249 ^ 137)) ^ (-" ".length()));
        llIIIIll[2] = " ".length();
        llIIIIll[3] = "  ".length();
        llIIIIll[4] = "   ".length();
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIIIIll[0]];
        clsArr[llIIIIll[1]] = aF.class;
        clsArr[llIIIIll[2]] = aC.class;
        clsArr[llIIIIll[3]] = aD.class;
        clsArr[llIIIIll[4]] = aE.class;
        return clsArr;
    }

    @Provides
    RelogConfig m(ConfigManager configManager) {
        return (RelogConfig) configManager.getConfig(RelogConfig.class);
    }
}
