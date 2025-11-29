/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.combat.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking To Bank")
public class WalkingToBankTask
extends Task {

    private final  SquireBlueDragonKiller G;
    private final  SquireBlueDragonKillerConfig H;

    private static void llIlIIIllIlIll() {
        lIIllllIIIll = new String[lIIllllIIlII[3]];
        k.lIIllllIIIll[k.lIIllllIIlII[0]] = "Wear";
        k.lIIllllIIIll[k.lIIllllIIlII[1]] = "Games";
        k.lIIllllIIIll[k.lIIllllIIlII[2]] = "Games";
    }

    private static boolean llIlIIIllIlllI(int n) {
        return n != 0;
    }

    static {
        k.llIlIIIllIllII();
        k.llIlIIIllIlIll();
    }

        return String.valueOf(var1);
    }

    public boolean run() {
        k var2;
        if (k.llIlIIIllIllIl(this.G.h() ? 1 : 0)) {
            return lIIllllIIlII[0];
        }
        if (k.llIlIIIllIlllI(var2.y() ? 1 : 0)) {
            return lIIllllIIlII[0];
        }
        this.z();
        return lIIllllIIlII[1];
    }

    private static boolean llIlIIIllIllIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIIllIllll(int n, int n2) {
        return n < n2;
    }

    @Inject
    public WalkingToBankTask(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.G = squireBlueDragonKiller;
        this.H = squireBlueDragonKillerConfig;
    }

    private void z() {
        if (k.llIlIIIllIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        if (k.llIlIIIllIlllI(Inventory.contains(item -> item.getName().contains(lIIllllIIIll[lIIllllIIlII[2]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(lIIllllIIIll[lIIllllIIlII[1]])).interact(lIIllllIIIll[lIIllllIIlII[0]]);
            return;
        }
        Movement.walkTo((WorldArea)this.H.bankLocation().getArea());

    }

    private boolean y() {
        return this.H.bankLocation().getArea().contains((Locatable)Players.getLocal());
    }
}

