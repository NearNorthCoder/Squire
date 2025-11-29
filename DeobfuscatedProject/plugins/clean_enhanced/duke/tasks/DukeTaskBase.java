/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

public abstract class DukeTaskBase
extends Task {
    @Inject
    protected  SquireDukeSucellusConfig ae;
    
    @Inject
    protected  Client x;
    @Inject
    protected  SquireDukeSucellus w;

    public boolean g(int n2) {
        boolean bl;
        if ((this.G() == n2)) {
            bl = 1;
            0;
            if null != null {
                return ((0xFC ^ 0x84 ^ (0x4B ^ 0x7B)) & (80 + 187 - 265 + 214 ^ 12 + 48 - -3 + 81 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    protected BankLoadout Q() {
        return (BankLoadout)this.ae.bankLoadout().selected(BankLoadout.class);
    }

    static {
        n.var2();
    }

    public int G() {
        WorldPoint worldPoint = this.x.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.x.getLocalPlayer().getLocalLocation();
        if ((this.x.isInInstancedRegion( != 0) ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.x, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    protected abstract boolean R();

    protected boolean P() {
        return this.g(this.ae.bank().G());
    }

    public boolean run() {
        if ((this.w.p( == 0) ? 1 : 0)) {
            return 0;
        }
        return this.R();
    }
}

