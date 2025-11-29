/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

@TaskDesc(name="Equipping mage gear", priority=10)
public class EquippingMageGearTask
extends am {
    private final  t aH;

    @Override
    public boolean ac() {
        return this.aH.a(this.aH.O());
    }

    @Inject
    protected EquippingMageGearTask(Client client, t t2, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
        this.aH = t2;
    }
}

