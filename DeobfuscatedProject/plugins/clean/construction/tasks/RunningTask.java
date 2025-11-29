/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import gg.squire.construction.tasks.GameEnum70;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Running")
public class RunningTask
extends Task {
    private final  M cc;
    
    private final  LureConfig cd;

    private static void lIllIIlIlII() {
        llIIlIlll = new String[llIlIIIll[3]];
        Q.llIIlIlll[Q.llIlIIIll[0]] = "Wield";
        Q.llIIlIlll[Q.llIlIIIll[1]] = "Wield";
    }

    private static boolean lIllIlllIIl(Object object) {
        return object == null;
    }

        return String.valueOf(lIllIIIllIIIIlI);
    }

    static {
        Q.lIllIllIllI();
        Q.lIllIIlIlII();
    }

    private boolean aN() {
        if (Q.lIllIlllIlI(Movement.getRunEnergy(), llIlIIIll[2])) {
            return llIlIIIll[0];
        }
        if (Q.lIllIllIlll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        return llIlIIIll[0];
    }

    @Inject
    public RunningTask(M m2, LureConfig lureConfig) {
        this.cc = m2;
        this.cd = lureConfig;
    }

    public boolean run() {
        Q lIllIIIllIlIIlI;
        if (Q.lIllIllIlll(this.cc.aI() ? 1 : 0)) {
            return llIlIIIll[0];
        }
        if (Q.lIllIlllIII(lIllIIIllIlIIlI.aN() ? 1 : 0)) {
            return llIlIIIll[1];
        }
        Player lIllIIIllIlIIIl = Players.getLocal();
        if (Q.lIllIlllIIl(lIllIIIllIlIIIl)) {
            return llIlIIIll[0];
        }
        N lIllIIIllIlIIII = lIllIIIllIlIIlI.cc.aG();
        if (Q.lIllIlllIIl(lIllIIIllIlIIlI.cc.a(llIlIIIll[0], null))) {
            if (Q.lIllIllIlll(lIllIIIllIlIIII.aJ().equals((Object)lIllIIIllIlIIIl.getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lIllIIIllIlIIII.aJ());

            }
            int[] nArray = new int[llIlIIIll[1]];
            nArray[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.primaryWeaponID();
            if (Q.lIllIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIIIll[1]];
                nArray2[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.primaryWeaponID();
                if (Q.lIllIlllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIlIIIll[1]];
                    nArray3[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.primaryWeaponID();
                    Inventory.getFirst((int[])nArray3).interact(llIIlIlll[llIlIIIll[0]]);
                }
            }
            if (Q.lIllIlllIII(lIllIIIllIlIIlI.cd.usingSecondary() ? 1 : 0)) {
                int[] nArray4 = new int[llIlIIIll[1]];
                nArray4[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.secondaryWeaponID();
                if (Q.lIllIllIlll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[llIlIIIll[1]];
                    nArray5[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.secondaryWeaponID();
                    if (Q.lIllIlllIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[llIlIIIll[1]];
                        nArray6[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.secondaryWeaponID();
                        Inventory.getFirst((int[])nArray6).interact(llIIlIlll[llIlIIIll[1]]);
                    }
                }
            }
            return llIlIIIll[0];
        }
        WorldPoint lIllIIIllIIllll = Movement.getDestination();
        if (Q.lIllIlllIIl(lIllIIIllIIllll)) {
            WorldPoint worldPoint;
            if (Q.lIllIlllIII(lIllIIIllIlIIIl.getWorldLocation().equals((Object)lIllIIIllIlIIII.aJ()) ? 1 : 0)) {
                worldPoint = lIllIIIllIlIIII.aK();

                if (1 <= 0) {
                    return ((0x18 ^ 0x7C ^ (0xD8 ^ 0xA2)) & (0x27 ^ 0xA ^ (0x8F ^ 0xBC) ^ -1)) != 0;
                }
            } else {
                worldPoint = lIllIIIllIlIIII.aJ();
            }
            Movement.walkTo((WorldPoint)worldPoint);

            return llIlIIIll[1];
        }
        if (Q.lIllIlllIII(lIllIIIllIlIIII.aJ().equals((Object)lIllIIIllIIllll) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)lIllIIIllIlIIII.aK());

            }
        } else {
            Movement.walkTo((WorldPoint)lIllIIIllIlIIII.aJ());

        }
        return llIlIIIll[1];
    }

    private static boolean lIllIlllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIlll(int n2) {
        return n2 == 0;
    }

}

