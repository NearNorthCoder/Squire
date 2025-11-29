/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.membership;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.membership.BuyingBondTask;
import gg.squire.basics.membership.RedeemingBondTask;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Membership Buyer", description="Buys bonds and converts to keys", enabledByDefault=false, hidden=true)
public class SquireMembershipBuyer
extends SquirePlugin {
    
    private  boolean ff;

    public void e(boolean bl2) {
        this.ff = bl2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIlIl[0]];
        classArray[SquireMembershipBuyer.lllIlIl[1]] = RedeemingBondTask.class;
        classArray[SquireMembershipBuyer.lllIlIl[2]] = BuyingBondTask.class;
        return classArray;
    }

    public boolean cq() {
        return this.ff;
    }

    protected void onStop() {
    }

    protected void onStart() {
    }

    static {
        SquireMembershipBuyer.lllIIlIlI();
    }
}

