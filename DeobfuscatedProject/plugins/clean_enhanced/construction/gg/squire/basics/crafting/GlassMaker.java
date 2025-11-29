/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.crafting;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.crafting.BankingTask;
import gg.squire.basics.crafting.MakingMoltenGlassTask;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Glass Maker", enabledByDefault=false, hidden=true)
public class GlassMaker
extends SquirePlugin {
    private static  int[] lIIIllIl;

    static {
        GlassMaker.var1();
    }

    protected void onStart() {
    }

    private static void var1() {
        lIIIllIl = new int[3];
        GlassMaker.lIIIllIl[0] = 2;
        GlassMaker.lIIIllIl[1] = (0x28 ^ 0x1D) & ~(0x7A ^ 0x4F);
        GlassMaker.lIIIllIl[2] = 1;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIllIl[0]];
        classArray[GlassMaker.lIIIllIl[1]] = BankingTask.class;
        classArray[GlassMaker.lIIIllIl[2]] = MakingMoltenGlassTask.class;
        return classArray;
    }
}

