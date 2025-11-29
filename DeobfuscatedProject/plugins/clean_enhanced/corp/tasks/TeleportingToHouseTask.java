/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Teleporting to house")
public class TeleportingToHouseTask
extends CorpManager {
    
    @Inject
    private  SquireCorp p;

    public boolean run() {
        o var2;
        if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.(this.p.d( == 0) ? 1 : 0)) {
            if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.(this.g( != 0) ? 1 : 0)) {
                return 0;
            }
            if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.(var2.p.c( != 0) ? 1 : 0)) {
                return 0;
            }
            if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.(var2.p.b( != 0) ? 1 : 0)) {
                return 0;
            }
        }
        if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.(var2.l( != 0) ? 1 : 0)) {
            return 0;
        }
        TeleportLoader.enterHouse();
        0;
        return 1;
    }

}

