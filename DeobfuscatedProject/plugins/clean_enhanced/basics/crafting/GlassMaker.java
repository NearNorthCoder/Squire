/*
 * Deobfuscated from gg.squire.basics.crafting.GlassMaker
 *
 * Automatically makes glass items for Crafting training.
 */
package gg.squire.basics.crafting;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.X;
import i.i.b.s.c.q.r.s.s.-.u.a.e.Y;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Makes glass items for Crafting training.
 */
@PluginDescriptor(
    name = "Squire Glass Maker",
    enabledByDefault = false,
    hidden = true
)
@SquireUtil
public class GlassMaker extends SquirePlugin {

    @Override
    protected Class<?>[] tasks() {
        return new Class[]{ X.class, Y.class };
    }

    @Override
    protected void onStart() {
    }

    @Override
    protected void onStop() {
    }
}
