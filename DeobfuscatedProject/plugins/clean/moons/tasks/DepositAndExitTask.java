/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
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
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Deposit and exit")
public class DepositAndExitTask
extends Task {

    final  WorldArea M;

    private static boolean lIIlIllIlIlllII(int n) {
        return n != 0;
    }

    static {
        e.lIIlIllIlIllIIl();
        e.lIIlIllIlIlIllI();
    }

    private static void lIIlIllIlIlIllI() {
        lIIIIIIIlIIll = new String[lIIIIIIIlIlll[16]];
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[4]] = "Depositing to bank";
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[6]] = "Bank-all";
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[11]] = "Exiting to Cavern";
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[12]] = "Pass-through";
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[13]] = "Entrance";
    }

    public boolean run() {
        e var1;
        if (e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[5]), lIIIIIIIlIlll[6]) && e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[7]), lIIIIIIIlIlll[6]) && e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[8]), lIIIIIIIlIlll[6])) {
            return lIIIIIIIlIlll[4];
        }
        if (e.lIIlIllIlIllIll(var1.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIIlIlll[4];
        }
        if (e.lIIlIllIlIlllII(var1.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            TileObject var2;
            Widget var3 = Widgets.get((int)lIIIIIIIlIlll[9], (int)lIIIIIIIlIlll[10]);
            if (e.lIIlIllIlIlllIl(var3)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIIll[lIIIIIIIlIlll[4]];
                var3.interact(lIIIIIIIlIIll[lIIIIIIIlIlll[6]]);
                return lIIIIIIIlIlll[6];
            }
            if (e.lIIlIllIlIllllI(var3) && e.lIIlIllIlIlllIl(var2 = TileObjects.getNearest(tileObject -> {
                int n;
                if (e.lIIlIllIlIlllII(tileObject.getName().contains(lIIIIIIIlIIll[lIIIIIIIlIlll[13]]) ? 1 : 0) && e.lIIlIllIlIlllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIIlIlll[14], lIIIIIIIlIlll[15], lIIIIIIIlIlll[4])), lIIIIIIIlIlll[16])) {
                    n = lIIIIIIIlIlll[6];

                    if (((0x2A ^ 7) & ~(0x31 ^ 0x1C)) <= -1) {
                        return false;
                    }
                } else {
                    n = lIIIIIIIlIlll[4];
                }
                return n != 0;
            }))) {
                SquireMoonsOfPeril.g = lIIIIIIIlIIll[lIIIIIIIlIlll[11]];
                var2.interact(lIIIIIIIlIIll[lIIIIIIIlIlll[12]]);
                return lIIIIIIIlIlll[6];
            }
        }
        return lIIIIIIIlIlll[4];
    }

    private static boolean lIIlIllIllIIIII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIllIlIllIll(int n) {
        return n == 0;
    }

        return String.valueOf(var4);
    }

    private static boolean lIIlIllIlIllllI(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIlIlllll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIllIlIllIlI(int n, int n2) {
        return n == n2;
    }

    public DepositAndExitTask() {
        this.M = new WorldArea(lIIIIIIIlIlll[0], lIIIIIIIlIlll[1], lIIIIIIIlIlll[2], lIIIIIIIlIlll[3], lIIIIIIIlIlll[4]);
    }

    private static boolean lIIlIllIlIlllIl(Object object) {
        return object != null;
    }
}

