/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.thieving.tasks.ThievingTaskBase;
import gg.squire.thieving.tasks.GameEnum32;

@TaskDesc(name="Pickpocketing the target", priority=3)
public class PickpocketingTheTargetTask
extends ThievingTaskBase {

    private final  WorldPoint ay;
    private static final  Logger ax;

    private static boolean lIllIIIlIIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIIIlIIIllll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        Player var1;
        F var2;
        f var3;
        if (F.lIllIIIlIIIlllI(this.o.j() ? 1 : 0)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(Bank.isOpen() ? 1 : 0)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIllll(Movement.isRunEnabled() ? 1 : 0) && F.lIllIIIlIIlIIII(Movement.getRunEnergy(), Rand.nextInt((int)lIIllIllIIlII[3], (int)lIIllIllIIlII[4]))) {
            Movement.toggleRun();
        }
        if (F.lIllIIIlIIlIIIl((Object)(var3 = var2.p.pickpocketTarget()), (Object)f.VYRE) && (!F.lIllIIIlIIIlllI(var2.o.e()) || F.lIllIIIlIIlIIlI(var2.o.e(), lIIllIllIIlII[5]))) {
            return lIIllIllIIlII[2];
        }
        NPC var4 = var2.a(var3);
        if (F.lIllIIIlIIlIIll(var4)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(Inventory.isFull() ? 1 : 0)) {
            if (F.lIllIIIlIIlIlII((Object)var2.p.pickpocketTarget(), (Object)f.ARDY_KNIGHT)) {
                return lIIllIllIIlII[2];
            }
            String[] stringArray = new String[lIIllIllIIlII[6]];
            stringArray[F.lIIllIllIIlII[2]] = lIIllIllIIIll[lIIllIllIIlII[2]];
            stringArray[F.lIIllIllIIlII[7]] = lIIllIllIIIll[lIIllIllIIlII[7]];
            if (F.lIllIIIlIIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                return lIIllIllIIlII[2];
            }
        }
        if (F.lIllIIIlIIlIIll(var1 = Players.getLocal())) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(var2.o() ? 1 : 0)) {
            var2.sleep(Rand.nextInt((int)lIIllIllIIlII[7], (int)lIIllIllIIlII[8]));
            return lIIllIllIIlII[7];
        }
        if (F.lIllIIIlIIlIlII((Object)var3, (Object)f.VYRE)) {
            if (F.lIllIIIlIIlIIII(var1.getWorldLocation().distanceTo(var2.o.f()), var2.p.wanderRange())) {
                Movement.walkTo((WorldPoint)var2.o.f());

            }
            if (F.lIllIIIlIIlIIll(var4)) {
                return lIIllIllIIlII[2];
            }
            if (F.lIllIIIlIIlIIII(var4.getWorldLocation().distanceTo(var2.o.f()), var2.p.wanderRange())) {
                return lIIllIllIIlII[2];
            }
            if (F.lIllIIIlIIIllll(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var4.getWorldLocation());

                return lIIllIllIIlII[7];
            }
        }
        this.a((NPC)var2_2);
        return lIIllIllIIlII[7];
    }

    private static boolean lIllIIIlIIlIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIlIIIlllI(int n2) {
        return n2 != 0;
    }

    static {
        F.lIllIIIlIIIllIl();
        F.lIllIIIlIIIllII();
        ax = LoggerFactory.getLogger(PickpocketingTheTargetTask.class);
    }

    private static boolean lIllIIIlIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIIIlIIIllII() {
        lIIllIllIIIll = new String[lIIllIllIIlII[6]];
        F.lIIllIllIIIll[F.lIIllIllIIlII[2]] = "Coin pouch";
        F.lIIllIllIIIll[F.lIIllIllIIlII[7]] = "Coins";
    }

    private static boolean lIllIIIlIIlIIll(Object object) {
        return object == null;
    }

    @Inject
    public PickpocketingTheTargetTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        super(squireThieving, squireThievingConfig);
        this.ay = new WorldPoint(lIIllIllIIlII[0], lIIllIllIIlII[1], lIIllIllIIlII[2]);
    }

        return String.valueOf(var5);
    }

    private static boolean lIllIIIlIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIlIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }
}

