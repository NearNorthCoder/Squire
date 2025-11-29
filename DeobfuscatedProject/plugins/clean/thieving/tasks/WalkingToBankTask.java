/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.thieving.tasks.ThievingTaskBase;
import gg.squire.thieving.tasks.GameEnum32;

@TaskDesc(name="Walking to bank", priority=5000)
public class WalkingToBankTask
extends ThievingTaskBase {

    private  BankLocation aw;

    private static boolean lIllIIIIllllIIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        E.lIllIIIIlllIlIl();
        E.lIllIIIIlllIlII();
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIIIIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean l() {
        E var2;
        if (E.lIllIIIIlllIllI(this.o.j() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(Bank.isOpen() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(var2.o() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIllIlIllllI[lIIllIlIlllll[2]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIIllIlIllllI[lIIllIlIlllll[1]])).interact(lIIllIlIllllI[lIIllIlIlllll[0]]);
        }
        if (E.lIllIIIIllllIII(var2.aw)) {
            if (E.lIllIIIIllllIIl((Object)var2.p.pickpocketTarget(), (Object)f.VYRE)) {
                var2.aw = BankLocation.HALLOWED_SEPULCHRE_BANK;

                if (3 <= ((0x70 ^ 0x75) & ~(0x6F ^ 0x6A))) {
                    return false;
                }
            } else {
                var2.aw = BankLocation.getNearest();
            }
        }
        if (E.lIllIIIIlllIllI(Bank.open() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var2.aw.getArea().getCenter());

            return lIIllIlIlllll[1];
        }
        return lIIllIlIlllll[0];
    }

    private static boolean lIllIIIIllllIII(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIlllIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public WalkingToBankTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIIlllIlII() {
        lIIllIlIllllI = new String[lIIllIlIlllll[3]];
        E.lIIllIlIllllI[E.lIIllIlIlllll[0]] = "Open-all";
        E.lIIllIlIllllI[E.lIIllIlIlllll[1]] = "coin pouch";
        E.lIIllIlIllllI[E.lIIllIlIlllll[2]] = "coin pouch";
    }
}

