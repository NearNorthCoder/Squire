/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.am;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

/* TASK: Equipping mage gear -> EquipMageGearTask */
@TaskDesc(name="Equipping mage gear", priority=10)
public class al
extends am {
    private final /* synthetic */ t aH;

    @Override
    public boolean ac() {
        return this.aH.a(this.aH.O());
    }

    @Inject
    protected al(Client client, t t2, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
        this.aH = t2;
    }
}

