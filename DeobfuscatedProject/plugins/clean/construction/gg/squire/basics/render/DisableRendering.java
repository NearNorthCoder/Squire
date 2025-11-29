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
import i.i.b.s.c.q.r.s.s.-.u.a.e.by;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Rendering Disabler", description="Helps with running your client", enabledByDefault=false)
public class DisableRendering
extends SquirePlugin {
    
    @Inject
    private  Client v;

    protected void onStop() {
        this.v.setDrawCallbacks(null);
    }

    protected void onStart() {
        if (DisableRendering.lIIllllIlll(this.v)) {
            this.v.setDrawCallbacks((DrawCallbacks)new by());
        }
    }

    private static boolean lIIllllIlll(Object object) {
        return object != null;
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIllII[0]];
    }

    static {
        DisableRendering.lIIllllIllI();
    }
}

