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
import gg.squire.basics.combat.Lure.ConstructionManager;
import i.i.b.s.c.q.r.s.s.-.u.a.e.O;
import gg.squire.basics.combat.Lure.AttackingLurableTask;
import gg.squire.basics.combat.Lure.RunningTask;
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
    private  LureConfig bU;
    
    @Inject
    public  M bW;
    @Inject
    private  EventBus K;
    private final  HotkeyListener bX;
    @Inject
    private  KeyManager bY;

    @Provides
    public LureConfig e(ConfigManager configManager) {
        return (LureConfig)configManager.getConfig(LureConfig.class);
    }

    public SquireLurer() {
        this.bX = new O(this, () -> this.bU.activate());
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllllIlI[0]];
        classArray[SquireLurer.lIllllIlI[1]] = RunningTask.class;
        classArray[SquireLurer.lIllllIlI[2]] = AttackingLurableTask.class;
        return classArray;
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

