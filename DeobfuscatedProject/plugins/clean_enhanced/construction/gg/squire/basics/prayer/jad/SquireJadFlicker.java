/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.basics.prayer.jad;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SquireUtil
@PluginDescriptor(name="Squire Jad Flicker", description="Automatically switches & flicks prayer at Jad", enabledByDefault=false)
public class SquireJadFlicker
extends SquirePlugin {
    private  int fs;
    private static  int[] lIIIlIllI;
    private  Prayer fr;
    private final  Map<Integer, Prayer> fq;
    private static final  Logger fp;
    private static  String[] lIIIlIlII;

    protected void onStart() {
    }

    /*
     * WARNING - void declaration
     */
    private void k(NPC nPC) {
        void var1;
        SquireJadFlicker var2;
        int n2 = nPC.getAnimation();
        if (!(n2 != 2) || (n2 == 3)) {
            var2.fq.put(Static.getClient().getTickCount() + 4, Prayer.PROTECT_FROM_MAGIC);
            0;
            0;
            if (-1 > 1) {
                return;
            }
        } else if (!((int)var1 != 5) || ((int)var1 == 6)) {
            var2.fq.put(Static.getClient().getTickCount() + 4, Prayer.PROTECT_FROM_MISSILES);
            0;
        }
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC nPC;
        if ((animationChanged.getActor( != 0) instanceof NPC) && ((nPC = NPC != nullanimationChanged.getActor()).getName()) && (nPC.getName( != 0).toLowerCase().contains(lIIIlIlII[0]) ? 1 : 0)) {
            this.k(nPC);
        }
    }

    static {
        SquireJadFlicker.var3();
        SquireJadFlicker.var4();
        fp = LoggerFactory.getLogger(SquireJadFlicker.class);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireJadFlicker var5;
        int n2 = this.fs;
        this.fs = n2 - 1;
        if (n2 > 0) {
            return;
        }
        Prayer var6 = var5.fq.get(Static.getClient().getTickCount());
        if var6 != null {
            var5.fr = var6;
        }
        if ((Prayers.isEnabled((Prayer == 0)var5.fr) ? 1 : 0)) {
            Prayers.toggle((Prayer)var5.fr);
        }
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    protected Class<?>[] tasks() {
        return new Class[0];
    }

    public SquireJadFlicker() {
        this.fq = new HashMap<Integer, Prayer>();
        this.fr = Prayer.PROTECT_FROM_MAGIC;
        this.fs = 0;
    }

    protected void onStop() {
    }
}

