/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.hooks.DrawCallbacks
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.render;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Rendering Disabler", description="Helps with running your client", enabledByDefault=false)
public class DisableRendering
extends SquirePlugin {
    private static  int[] lIllIllII;
    @Inject
    private  Client v;

    protected void onStop() {
        this.v.setDrawCallbacks(null);
    }

    protected void onStart() {
        if (DisableRendering.var1(this.v)) {
            this.v.setDrawCallbacks((DrawCallbacks)new by());
        }
    }

    private static boolean var1(Object object) {
        return object != null;
    }

    private static void var2() {
        lIllIllII = new int[1];
        DisableRendering.lIllIllII[0] = (0 ^ 0x47) & ~(0xDA ^ 0x9D);
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIllII[0]];
    }

    static {
        DisableRendering.var2();
    }
}

