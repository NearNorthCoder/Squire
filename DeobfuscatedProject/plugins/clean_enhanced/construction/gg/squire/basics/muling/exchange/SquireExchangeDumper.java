/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.muling.exchange;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(name="Squire Exchange Dumper", description="Dumps inventory on the grand exchange", enabledByDefault=false, hidden=true)
@SquireUtil
public class SquireExchangeDumper
extends SquirePlugin {
    private static  int[] llIIIlI;

    protected Class<?>[] tasks() {
        return new Class[0];
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

}

