/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.GameState
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.plugins.herblore;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.overlay.HerbloreInfoBox;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.plugins.herblore.AHelper;
import gg.squire.plugins.herblore.GameEnum2;
import gg.squire.plugins.herblore.BankingTask;
import gg.squire.plugins.herblore.CleaningHerbsTask;
import gg.squire.plugins.herblore.MakingPotionsTask;

@PluginDescriptor(name="Squire Herblore", enabledByDefault=false, description="Does Herblore stuff")
public class SquireHerblore
extends SquirePlugin {
    @Inject
    private  OverlayManager d;
    @Inject
    private  HerbloreConfig b;
    private final  Class<?>[] a;

    @Inject
    private  HerbloreInfoBox c;

    private static void var3() {
        var2 = new int[5];
        SquireHerblore.var2[0] = 3;
        SquireHerblore.var2[1] = (0x69 ^ 0x7B) & ~(5 ^ 0x17);
        SquireHerblore.var2[2] = 1;
        SquireHerblore.var2[3] = 2;
        SquireHerblore.var2[4] = 0x57 ^ 0xB ^ (0x66 ^ 0x32);
    }

    public SquireHerblore() {
        Class[] classArray = new Class[var2[0]];
        classArray[SquireHerblore.var2[1]] = CleaningHerbsTask.class;
        classArray[SquireHerblore.var2[2]] = BankingTask.class;
        classArray[SquireHerblore.var2[3]] = MakingPotionsTask.class;
        this.a = classArray;
    }

    public boolean a() {
        boolean bl;
        if (!SquireHerblore.var4((Object)this.b.method(), (Object)r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c.ALL_STAGES) || SquireHerblore.var5((Object)this.b.method(), (Object)r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c.ALL_STAGES_ALL_HERBS)) {
            bl = var2[2];
            0;
            if ((5 ^ 0x2F ^ (0xA2 ^ 0x8D)) == 0) {
                return ((31 + 26 - -19 + 54 ^ 171 + 133 - 134 + 26) & (0x31 ^ 0x28 ^ (0x7D ^ 0x22) ^ -1)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.getEventBus().post((Object)new AHelper(this.b.method(), this.b.herb(), this.b.potion()));
        this.d.remove((Overlay)this.c);
        0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (SquireHerblore.var12(configChanged.getGroup().equals(var1[var2[1]]) ? 1 : 0)) {
            return;
        }
        this.getEventBus().post((Object)new AHelper(this.b.method(), this.b.herb(), this.b.potion()));
    }

    protected void onStart() {
        this.getEventBus().post((Object)new AHelper(this.b.method(), this.b.herb(), this.b.potion()));
        this.d.add((Overlay)this.c);
        0;
    }

    private static void var13() {
        var1 = new String[var2[2]];
        SquireHerblore.var1[SquireHerblore.var2[1]] = "squireherblore";
    }

    private static boolean var12(int n) {
        return n == 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean bl;
        if (SquireHerblore.var5(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            bl = var2[2];
            0;
            if (((153 + 123 - 230 + 165 ^ 102 + 61 - 162 + 146) & (157 + 85 - 92 + 100 ^ 116 + 36 - 75 + 109 ^ -1)) != 0) {
                return;
            }
        } else {
            bl = var2[1];
        }
        this.setPaused(bl);
    }

    static {
        SquireHerblore.var3();
        SquireHerblore.var13();
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    @Provides
    HerbloreConfig a(ConfigManager configManager) {
        return (HerbloreConfig)configManager.getConfig(HerbloreConfig.class);
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }
}

