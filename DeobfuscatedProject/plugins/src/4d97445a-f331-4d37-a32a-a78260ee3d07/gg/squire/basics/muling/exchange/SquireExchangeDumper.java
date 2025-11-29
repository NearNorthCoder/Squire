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
    private static /* synthetic */ int[] llIIIlI;

    protected Class<?>[] tasks() {
        return new Class[llIIIlI[0]];
    }

    private static void llIIIllIl() {
        llIIIlI = new int[1];
        SquireExchangeDumper.llIIIlI[0] = (0xF0 ^ 0xC5 ^ (0xC9 ^ 0xAB)) & (0x2C ^ 0xC ^ (0xEA ^ 0x9D) ^ -" ".length());
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    static {
        SquireExchangeDumper.llIIIllIl();
    }
}

