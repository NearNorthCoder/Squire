/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Vars;

@TaskDesc(name="Raking the current patch", priority=10)
public class RakingTheCurrentPatchTask
extends FarmerTaskBase {

    private static boolean llllIIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public RakingTheCurrentPatchTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, au.WEEDS);
    }

    private static boolean llllIIlIIIllIl(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    static {
        bb.llllIIlIIIllII();
        bb.llllIIlIIIlIll();
    }

    @Override
    public boolean J(N n2) {
        if (bb.llllIIlIIIllIl(Vars.getBit((int)llIIIIlIIlII[0]))) {
            return llIIIIlIIlII[1];
        }
        this.sleep(llIIIIlIIlII[2]);
        return this.a(n2, tileObject -> tileObject.interact(llIIIIlIIIll[llIIIIlIIlII[1]]::equals));
    }

    private static void llllIIlIIIlIll() {
        llIIIIlIIIll = new String[llIIIIlIIlII[3]];
        bb.llIIIIlIIIll[bb.llIIIIlIIlII[1]] = "Rake";
    }
}

