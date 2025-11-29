/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.combat.tasks.AHelper;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking To Blue Dragons")
public class WalkingToBlueDragonsTask
extends Task {
    
    private final  a J;
    private final  SquireBlueDragonKiller K;
    
    private final  SquireBlueDragonKillerConfig I;

    private static boolean llIlIIlIIIIlIl(int n) {
        return n != 0;
    }

    static {
        l.llIlIIlIIIIlII();
        l.llIlIIlIIIIIll();
    }

    public boolean run() {
        if (l.llIlIIlIIIIlIl(this.s() ? 1 : 0)) {
            return lIIllllIllII[0];
        }
        this.C();
        return lIIllllIllII[1];
    }

    private boolean y() {
        return this.I.bankLocation().getArea().contains((Locatable)Players.getLocal());
    }

    private boolean A() {
        return this.J.n();
    }

    private void C() {
        if (l.llIlIIlIIIIllI(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        Movement.walkTo((WorldPoint)this.I.dragonLocation().o());

    }

    @Inject
    public WalkingToBlueDragonsTask(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, a a2, SquireBlueDragonKiller squireBlueDragonKiller) {
        this.I = squireBlueDragonKillerConfig;
        this.J = a2;
        this.K = squireBlueDragonKiller;
    }

    private boolean B() {
        int n;
        if (l.llIlIIlIIIIlIl(Inventory.isFull() ? 1 : 0) && l.llIlIIlIIIIllI(Inventory.contains(item -> {
            String[] stringArray = new String[lIIllllIllII[1]];
            stringArray[l.lIIllllIllII[0]] = lIIllllIlIll[lIIllllIllII[0]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            n = lIIllllIllII[1];

            if ((3 ^ 6) <= 0) {
                return false;
            }
        } else {
            n = lIIllllIllII[0];
        }
        return n != 0;
    }

    private boolean s() {
        int n;
        l var1;
        if (l.llIlIIlIIIIlIl(this.K.h() ? 1 : 0) && !l.llIlIIlIIIIllI(this.y() ? 1 : 0) || !l.llIlIIlIIIIllI(var1.A() ? 1 : 0) || !l.llIlIIlIIIIllI(var1.B() ? 1 : 0) || l.llIlIIlIIIIllI(Inventory.contains(item -> {
            String[] stringArray = new String[lIIllllIllII[1]];
            stringArray[l.lIIllllIllII[0]] = lIIllllIlIll[lIIllllIllII[1]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            n = lIIllllIllII[1];

        } else {
            n = lIIllllIllII[0];
        }
        return n != 0;
    }

    private static void llIlIIlIIIIIll() {
        lIIllllIlIll = new String[lIIllllIllII[2]];
        l.lIIllllIlIll[l.lIIllllIllII[0]] = "Eat";
        l.lIIllllIlIll[l.lIIllllIllII[1]] = "Eat";
    }

    private static boolean llIlIIlIIIIllI(int n) {
        return n == 0;
    }
}

