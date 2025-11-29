/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.TileObject;

@TaskDesc(name="Opening the compost bin", priority=35, blocking=true)
public class OpeningTheCompostBinTask
extends aN {

    @Inject
    public OpeningTheCompostBinTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean I(N n2) {
        int n3;
        an an2 = n2.aI();
        au au2 = an2.aY();
        if (((Object)an2.aZ() == (Object)an2.aZ()2)n.GROWING) && (an2.bb() == au2.bc() - 0)) {
            n3 = 0;
            0;
            if (2 != 2) {
                return ((0x5A ^ 0x4D ^ (0x6F ^ 0x7C)) & (111 + 56 - 111 + 77 ^ 64 + 25 - 61 + 101 ^ -1)) != 0;
            }
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    @Override
    public boolean b(TileObject tileObject) {
        tileObject.interact(var1[1]);
        return 0;
    }
}

