/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.input.KeyListener
 *  net.runelite.client.input.KeyManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.util.HotkeyListener
 */
package gg.squire.basics.combat.Lure;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.M_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.O;
import i.i.b.s.c.q.r.s.s.-.u.a.e.AttackingLurableTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.RunningTask;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.HotkeyListener;

@PluginDescriptor(name="Squire Lurer", enabledByDefault=false)
@SquireUtil
public class SquireLurer
extends SquirePlugin {
    @Inject
    private /* synthetic */ LureConfig bU;
    private static /* synthetic */ int[] lIllllIlI;
    @Inject
    public /* synthetic */ M bW;
    @Inject
    private /* synthetic */ EventBus K;
    private final /* synthetic */ HotkeyListener bX;
    @Inject
    private /* synthetic */ KeyManager bY;

    @Provides
    public LureConfig e(ConfigManager configManager) {
        return (LureConfig)configManager.getConfig(LureConfig.class);
    }

    public SquireLurer() {
        this.bX = new O(this, () -> this.bU.activate());
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllllIlI[0]];
        classArray[SquireLurer.lIllllIlI[1]] = Q.class;
        classArray[SquireLurer.lIllllIlI[2]] = P.class;
        return classArray;
    }

    private static void lIlIIlIIIlI() {
        lIllllIlI = new int[3];
        SquireLurer.lIllllIlI[0] = 2;
        SquireLurer.lIllllIlI[1] = (0x4D ^ 0x73 ^ (0x18 ^ 0x65)) & (88 + 17 - -9 + 87 ^ 30 + 104 - 124 + 128 ^ -1);
        SquireLurer.lIllllIlI[2] = 1;
    }

    static {
        SquireLurer.lIlIIlIIIlI();
    }

    protected void onStart() {
        this.K.register((Object)this.bW);
        this.bY.registerKeyListener((KeyListener)this.bX);
    }

    protected void onStop() {
        this.K.unregister((Object)this.bW);
        this.bY.unregisterKeyListener((KeyListener)this.bX);
    }
}

