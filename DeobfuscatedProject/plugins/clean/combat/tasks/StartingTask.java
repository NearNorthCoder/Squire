/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Starting")
public class StartingTask
extends Task {
    
    private final  Client v;
    
    private final  SquireBlueDragonKiller t;
    private final  SquireBlueDragonKillerConfig u;

    static {
        e.llIlIIIlIlIlll();
        e.llIlIIIlIlIllI();
    }

    private static boolean llIlIIIlIllIlI(int n) {
        return n != 0;
    }

    private static boolean llIlIIIlIllIII(int n) {
        return n == 0;
    }

    private static boolean llIlIIIlIllIIl(Object object) {
        return object == null;
    }

    public boolean run() {
        e var1;
        if (e.llIlIIIlIllIII(this.t.i() ? 1 : 0)) {
            return lIIlllIlllll[0];
        }
        BankLoadout var2 = (BankLoadout)var1.u.loadout().selected(BankLoadout.class);
        if (e.llIlIIIlIllIIl(var2)) {
            Log.error((String)lIIlllIllllI[lIIlllIlllll[0]]);
            var1.t.forceStop();
            return lIIlllIlllll[1];
        }
        if (e.llIlIIIlIllIII(var1.u.dragonLocation().p().contains((Locatable)Players.getLocal()) ? 1 : 0) && e.llIlIIIlIllIlI(var2.needsToBank() ? 1 : 0)) {
            var1.t.a(lIIlllIlllll[1]);
        }
        this.t.b(lIIlllIlllll[0]);
        return lIIlllIlllll[1];
    }

    private static void llIlIIIlIlIllI() {
        lIIlllIllllI = new String[lIIlllIlllll[1]];
        e.lIIlllIllllI[e.lIIlllIlllll[0]] = "No loadout selected";
    }

    @Inject
    public StartingTask(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, Client client) {
        this.t = squireBlueDragonKiller;
        this.u = squireBlueDragonKillerConfig;
        this.v = client;
    }

}

