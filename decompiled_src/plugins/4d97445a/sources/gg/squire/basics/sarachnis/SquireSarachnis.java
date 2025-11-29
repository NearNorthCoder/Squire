package gg.squire.basics.sarachnis;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aH;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bH;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bI;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bJ;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bK;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bL;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.client.managers.interaction.InteractionManager;
@PluginDescriptor(name = "Squire Sarachnis", description = "Sarachnis Helper", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/sarachnis/SquireSarachnis.class */
public class SquireSarachnis extends SquirePlugin {
    /* synthetic */ List<aH> F = new ArrayList();
    private static /* synthetic */ int[] llIIlllII;
    @Inject
    /* synthetic */ SarachnisConfig gz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected void onStop() {
        InteractionManager.setHelper((boolean) llIIlllII[1]);
        this.F.clear();
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        TileItem item = itemSpawned.getItem();
        if (lIllIlIIlIl(item.canPickup() ? 1 : 0)) {
            return;
        }
        aH aHVar = new aH();
        item.getName();
        aHVar.f(item.getId());
        aHVar.i(item.getWorldLocation());
        p().add(aHVar);
        "".length();
    }

    private static boolean lIllIlIIlIl(int i2) {
        return i2 == 0;
    }

    public List<aH> p() {
        return this.F;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIIlllII[0]];
        clsArr[llIIlllII[1]] = bK.class;
        clsArr[llIIlllII[2]] = bH.class;
        clsArr[llIIlllII[3]] = bJ.class;
        clsArr[llIIlllII[4]] = bL.class;
        clsArr[llIIlllII[5]] = bI.class;
        return clsArr;
    }

    static {
        lIllIlIIlII();
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected void onStart() {
        InteractionManager.setHelper((boolean) llIIlllII[2]);
    }

    @Provides
    SarachnisConfig v(ConfigManager configManager) {
        return (SarachnisConfig) configManager.getConfig(SarachnisConfig.class);
    }

    private static void lIllIlIIlII() {
        llIIlllII = new int[6];
        llIIlllII[0] = (((91 + 108) - 105) + 47) ^ (((72 + 112) - 166) + 118);
        llIIlllII[1] = (2 ^ 68) & ((31 ^ 89) ^ (-1));
        llIIlllII[2] = " ".length();
        llIIlllII[3] = "  ".length();
        llIIlllII[4] = "   ".length();
        llIIlllII[5] = 24 ^ 28;
    }
}
