/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.muling.trader;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.muling.trader.TradingTask;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Trader", description="Offers entire inventory for trade menu", enabledByDefault=false)
public class SquireTrader
extends SquirePlugin {

    static {
        SquireTrader.llIIllIIll();
    }

    protected void onStop() {
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIlIIl[0]];
        classArray[SquireTrader.lllIlIIl[1]] = TradingTask.class;
        return classArray;
    }

}

