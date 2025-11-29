/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Attacking zamorak", priority=10)
public class AttackingZamorakTask
extends Task {
    
    private final  l M;
    
    private final  c N;

    private static boolean llIIIlIlIIIllII(int n2) {
        return n2 != 0;
    }

    private static void llIIIlIlIIIlIlI() {
        lIllIIIlIlllI = new String[lIllIIIlIllll[2]];
        o.lIllIIIlIlllI[o.lIllIIIlIllll[0]] = "Attack";
    }

    @Inject
    public AttackingZamorakTask(l l2, c c2) {
        this.M = l2;
        this.N = c2;
    }

    public boolean run() {
        o var1;
        if (!o.llIIIlIlIIIllII(this.M.B() ? 1 : 0) || o.llIIIlIlIIIllIl(this.M.G() ? 1 : 0)) {
            return lIllIIIlIllll[0];
        }
        if (o.llIIIlIlIIIllIl(var1.M.A() ? 1 : 0)) {
            return lIllIIIlIllll[0];
        }
        if (o.llIIIlIlIIIllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (o.llIIIlIlIIIlllI(var1.N.e())) {
            return lIllIIIlIllll[0];
        }
        if (o.llIIIlIlIIIllll(Players.getLocal().getInteracting())) {
            return lIllIIIlIllll[0];
        }
        NPC nPC = this.M.I().m();
        nPC.interact(lIllIIIlIlllI[lIllIIIlIllll[0]]);
        this.sleep(lIllIIIlIllll[1]);
        return lIllIIIlIllll[2];
    }

    private static boolean llIIIlIlIIIllll(Object object) {
        return object != null;
    }

    private static boolean llIIIlIlIIIllIl(int n2) {
        return n2 == 0;
    }

    static {
        o.llIIIlIlIIIlIll();
        o.llIIIlIlIIIlIlI();
    }

    private static boolean llIIIlIlIIIlllI(Object object) {
        return object == null;
    }
}

