/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.moons.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Claim chest")
public class ClaimChestTask
extends Task {
    
    final  WorldArea K;
    final  WorldArea J;
    
    final  WorldPoint L;

        return String.valueOf(var1);
    }

    public boolean run() {
        TileObject var2;
        d var3;
        if (!d.lIIlIlllllIIllI(Vars.getBit((int)lIIIIIIlIlllI[11]), lIIIIIIlIlllI[12]) || !d.lIIlIlllllIIllI(Vars.getBit((int)lIIIIIIlIlllI[13]), lIIIIIIlIlllI[12]) || d.lIIlIlllllIIlll(Vars.getBit((int)lIIIIIIlIlllI[14]), lIIIIIIlIlllI[12])) {
            return lIIIIIIlIlllI[4];
        }
        if (d.lIIlIlllllIlIII(var3.J.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var2 = TileObjects.getNearest(tileObject -> {
                int n;
                if (d.lIIlIlllllIlIII(tileObject.getName().contains(lIIIIIIlIllII[lIIIIIIlIlllI[24]]) ? 1 : 0) && d.lIIlIlllllIllII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIlllI[17])) {
                    n = lIIIIIIlIlllI[12];

                    if (-(63 + 46 - 14 + 47 ^ 109 + 130 - 106 + 6) >= 0) {
                        return ((0x54 ^ 0x40 ^ (0x3F ^ 0x12)) & (63 + 109 - 80 + 69 ^ 110 + 21 - -4 + 17 ^ -1)) != 0;
                    }
                } else {
                    n = lIIIIIIlIlllI[4];
                }
                return n != 0;
            });
            if (d.lIIlIlllllIlIIl(var2) && d.lIIlIlllllIlIlI(Movement.getRunEnergy(), lIIIIIIlIlllI[15])) {
                SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[4]];
                var2.interact(lIIIIIIlIllII[lIIIIIIlIlllI[12]]);
                return lIIIIIIlIlllI[12];
            }
            if (d.lIIlIlllllIlIll(Players.getLocal().getWorldLocation().distanceTo(var3.L), lIIIIIIlIlllI[16]) && (!d.lIIlIlllllIlIlI(Movement.getRunEnergy(), lIIIIIIlIlllI[15]) || !d.lIIlIlllllIlIIl(var2) || d.lIIlIlllllIlIIl(var2) && d.lIIlIlllllIlIll(Players.getLocal().getWorldLocation().distanceTo(var2.getWorldLocation()), lIIIIIIlIlllI[17]))) {
                SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[18]];
                Movement.walkTo((WorldPoint)var3.L);

                return lIIIIIIlIlllI[12];
            }
            if (d.lIIlIlllllIllII(Players.getLocal().getWorldLocation().distanceTo(var3.L), lIIIIIIlIlllI[16])) {
                String[] stringArray = new String[lIIIIIIlIlllI[12]];
                stringArray[d.lIIIIIIlIlllI[4]] = lIIIIIIlIllII[lIIIIIIlIlllI[19]];
                TileObject var4 = TileObjects.getNearest((String[])stringArray);
                if (d.lIIlIlllllIlIIl(var4)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[20]];
                    var4.interact(lIIIIIIlIllII[lIIIIIIlIlllI[17]]);
                    return lIIIIIIlIlllI[12];
                }
            }
        }
        if (d.lIIlIlllllIlIII(var3.K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIIlIlllI[12]];
            stringArray[d.lIIIIIIlIlllI[4]] = lIIIIIIlIllII[lIIIIIIlIlllI[21]];
            var2 = TileObjects.getNearest((String[])stringArray);
            if (d.lIIlIlllllIlIIl(var2)) {
                SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[22]];
                var2.interact(lIIIIIIlIllII[lIIIIIIlIlllI[23]]);
                return lIIIIIIlIlllI[12];
            }
        }
        return lIIIIIIlIlllI[4];
    }

    private static boolean lIIlIlllllIllII(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIlllllIlIIl(Object object) {
        return object != null;
    }

    public ClaimChestTask() {
        this.J = new WorldArea(lIIIIIIlIlllI[0], lIIIIIIlIlllI[1], lIIIIIIlIlllI[2], lIIIIIIlIlllI[3], lIIIIIIlIlllI[4]);
        this.K = new WorldArea(lIIIIIIlIlllI[5], lIIIIIIlIlllI[6], lIIIIIIlIlllI[7], lIIIIIIlIlllI[8], lIIIIIIlIlllI[4]);
        this.L = new WorldPoint(lIIIIIIlIlllI[9], lIIIIIIlIlllI[10], lIIIIIIlIlllI[4]);
    }

    static {
        d.lIIlIlllllIIlIl();
        d.lIIlIlllllIIlII();
    }

    private static void lIIlIlllllIIlII() {
        lIIIIIIlIllII = new String[lIIIIIIlIlllI[16]];
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[4]] = "Drinking tea";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[12]] = "Make-cuppa";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[18]] = "Nav to door";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[19]] = "Entrance";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[20]] = "Entering door";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[17]] = "Pass-through";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[21]] = "Lunar Chest";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[22]] = "Claiming chest";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[23]] = "Claim";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[24]] = "Cooking stove";
    }

    private static boolean lIIlIlllllIlIll(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIlllllIIlll(int n, int n2) {
        return n != n2;
    }

    private static boolean lIIlIlllllIIllI(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIlllllIlIII(int n) {
        return n != 0;
    }

    private static boolean lIIlIlllllIlIlI(int n, int n2) {
        return n < n2;
    }
}

