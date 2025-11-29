/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.sarachnis;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.AttackingTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.DrinkingPrayerPotionTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.EatingFoodTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.FlickingTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.TeleportingOutTask;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.client.managers.interaction.InteractionManager;

@PluginDescriptor(name="Squire Sarachnis", description="Sarachnis Helper", enabledByDefault=false)
@SquireUtil
public class SquireSarachnis
extends SquirePlugin {
    /* synthetic */ List<aH> F;
    private static /* synthetic */ int[] llIIlllII;
    @Inject
    /* synthetic */ SarachnisConfig gz;

    public SquireSarachnis() {
        this.F = new ArrayList<aH>();
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)llIIlllII[1]);
        this.F.clear();
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        TileItem tileItem = itemSpawned.getItem();
        if (SquireSarachnis.lIllIlIIlIl(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        aH aH2 = new aH();
        String string = tileItem.getName();
        aH2.f(tileItem.getId());
        aH2.i(tileItem.getWorldLocation());
        this.p().add(aH2);
        0;
    }

    private static boolean lIllIlIIlIl(int n2) {
        return n2 == 0;
    }

    public List<aH> p() {
        return this.F;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIlllII[0]];
        classArray[SquireSarachnis.llIIlllII[1]] = FlickingTask.class;
        classArray[SquireSarachnis.llIIlllII[2]] = AttackingTask.class;
        classArray[SquireSarachnis.llIIlllII[3]] = EatingFoodTask.class;
        classArray[SquireSarachnis.llIIlllII[4]] = TeleportingOutTask.class;
        classArray[SquireSarachnis.llIIlllII[5]] = DrinkingPrayerPotionTask.class;
        return classArray;
    }

    static {
        SquireSarachnis.lIllIlIIlII();
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)llIIlllII[2]);
    }

    @Provides
    SarachnisConfig v(ConfigManager configManager) {
        return (SarachnisConfig)configManager.getConfig(SarachnisConfig.class);
    }

    private static void lIllIlIIlII() {
        llIIlllII = new int[6];
        SquireSarachnis.llIIlllII[0] = 91 + 108 - 105 + 47 ^ 72 + 112 - 166 + 118;
        SquireSarachnis.llIIlllII[1] = (2 ^ 0x44) & ~(0x1F ^ 0x59);
        SquireSarachnis.llIIlllII[2] = 1;
        SquireSarachnis.llIIlllII[3] = 2;
        SquireSarachnis.llIIlllII[4] = 3;
        SquireSarachnis.llIIlllII[5] = 0x18 ^ 0x1C;
    }
}

