/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerTaskBase;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;

@TaskDesc(name="Clearing dead crop", priority=5, blocking=true)
public class ClearingDeadCropTask
extends FarmerTaskBase {

    @Override
    public boolean J(N n2) {
        this.sleep(llIIIIIIlIlI[3]);
        return this.a(n2, tileObject -> tileObject.interact(llIIIIIIlIIl[llIIIIIIlIlI[2]]::equals));
    }

    private static boolean llllIIIlIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllIIIlIIIIIl() {
        llIIIIIIlIIl = new String[llIIIIIIlIlI[1]];
        aW.llIIIIIIlIIl[aW.llIIIIIIlIlI[2]] = "Clear";
    }

    @Override
    public boolean bv() {
        if (aW.llllIIIlIIIIll(super.bv() ? 1 : 0)) {
            this.sleep(llIIIIIIlIlI[0]);
            return llIIIIIIlIlI[1];
        }
        return llIIIIIIlIlI[2];
    }

    static {
        aW.llllIIIlIIIIlI();
        aW.llllIIIlIIIIIl();
    }

    @Inject
    public ClearingDeadCropTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            boolean bl;
            if (aW.llllIIIlIIIlII((Object)an2.aZ(), (Object)n.DEAD)) {
                bl = llIIIIIIlIlI[1];

                if (2 < -1) {
                    return false;
                }
            } else {
                bl = llIIIIIIlIlI[2];
            }
            return bl;
        });
    }

    private static boolean llllIIIlIIIIll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }
}

