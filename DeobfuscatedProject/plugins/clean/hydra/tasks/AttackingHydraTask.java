/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import gg.squire.hydra.tasks.AHelper;
import gg.squire.hydra.tasks.EHelper;
import gg.squire.hydra.tasks.HHelper;

@TaskDesc(name="Attacking hydra")
public class AttackingHydraTask
extends Task {
    private final  e ay;

    private final  SquireAlchemicalHydraConfig az;
    private final  a ax;

    private static void lIIIlllllIIllll() {
        llllIIlIIlIl = new String[llllIIlIIllI[1]];
        s.llllIIlIIlIl[s.llllIIlIIllI[0]] = "Attack";
    }

    static {
        s.lIIIlllllIlIIII();
        s.lIIIlllllIIllll();
    }

    private static boolean lIIIlllllIlIIll(Object object) {
        return object == null;
    }

    private static boolean lIIIlllllIlIIlI(Object object) {
        return object != null;
    }

    @Inject
    public AttackingHydraTask(a a2, e e2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ax = a2;
        this.ay = e2;
        this.az = squireAlchemicalHydraConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var1;
        if (s.lIIIlllllIlIIIl(this.az.attack() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        h var2 = var1.ax.k();
        if (!s.lIIIlllllIlIIlI(var2) || s.lIIIlllllIlIIIl(var1.ax.g() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        NPC var3 = var2.K();
        if (s.lIIIlllllIlIIll(var2.K())) {
            return llllIIlIIllI[0];
        }
        if (s.lIIIlllllIlIIlI(Players.getLocal().getInteracting())) {
            return llllIIlIIllI[0];
        }
        if (s.lIIIlllllIlIlII(var2.Q() ? 1 : 0) && s.lIIIlllllIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        var2_2.interact(llllIIlIIlIl[llllIIlIIllI[0]]);
        this.sleep(Math.min(this.ay.w() - llllIIlIIllI[1], llllIIlIIllI[2]));
        return llllIIlIIllI[1];
    }

    private static boolean lIIIlllllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllllIlIlII(int n2) {
        return n2 != 0;
    }
}

