/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Walking to boss")
public class WalkingToBossTask
extends WhispererTaskBase {
    private static final  int J;
    private static final  int E;
    private static final  RegionPoint K;
    private static final  int I;
    private static final  int L;
    private static final  int H;
    private static final  int O;
    private static final  WorldPoint C;
    private static final  int P;
    private static final  int F;
    private static final  int G;
    private static final  int N;
    private static final  int M;
    private static final  WorldPoint D;

    static {
        l.llIIIIIlIlllllI();
        l.llIIIIIlIlllIll();
        L = lIlIllIllIIlI[1];
        E = lIlIllIllIIlI[2];
        P = lIlIllIllIIlI[16];
        J = lIlIllIllIIlI[10];
        M = lIlIllIllIIlI[12];
        O = lIlIllIllIIlI[15];
        H = lIlIllIllIIlI[7];
        I = lIlIllIllIIlI[9];
        N = lIlIllIllIIlI[18];
        G = lIlIllIllIIlI[5];
        F = lIlIllIllIIlI[4];
        C = new WorldPoint(lIlIllIllIIlI[19], lIlIllIllIIlI[20], lIlIllIllIIlI[0]);
        D = new WorldPoint(lIlIllIllIIlI[21], lIlIllIllIIlI[22], lIlIllIllIIlI[0]);
        K = new RegionPoint(lIlIllIllIIlI[23], lIlIllIllIIlI[24], lIlIllIllIIlI[0], lIlIllIllIIlI[10]);
    }

    private static boolean llIIIIIllIIIIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static boolean llIIIIIllIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIIllIIIIII(Object object) {
        return object != null;
    }

    @Override
    protected boolean p() {
        TileObject var2;
        l var3;
        if (l.llIIIIIlIllllll(this.p.b(lIlIllIllIIlI[1]) ? 1 : 0)) {
            return lIlIllIllIIlI[0];
        }
        var3.w.b(var3.w.c());

        if (l.llIIIIIlIllllll(var3.p.c(lIlIllIllIIlI[2]) ? 1 : 0)) {
            int[] nArray = new int[lIlIllIllIIlI[3]];
            nArray[l.lIlIllIllIIlI[0]] = lIlIllIllIIlI[4];
            var2 = TileObjects.getNearest((int[])nArray);
            if (l.llIIIIIllIIIIII(var2)) {
                var2.interact(lIlIllIlIllll[lIlIllIllIIlI[0]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (l.llIIIIIlIllllll(var3.p.c(lIlIllIllIIlI[5]) ? 1 : 0)) {
            if (l.llIIIIIlIllllll(Dialog.isOpen() ? 1 : 0) && l.llIIIIIlIllllll(Dialog.hasOption((String)lIlIllIlIllll[lIlIllIllIIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIllIIlI[3]];
                stringArray[l.lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[6]];
                Dialog.chooseOption((String[])stringArray);

                return lIlIllIllIIlI[3];
            }
            int[] nArray = new int[lIlIllIllIIlI[3]];
            nArray[l.lIlIllIllIIlI[0]] = lIlIllIllIIlI[7];
            var2 = TileObjects.getNearest((int[])nArray);
            if (l.llIIIIIllIIIIII(var2)) {
                var2.interact(lIlIllIlIllll[lIlIllIllIIlI[8]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (!l.llIIIIIllIIIIIl(var3.p.c(lIlIllIllIIlI[9]) ? 1 : 0) || l.llIIIIIlIllllll(var3.p.c(lIlIllIllIIlI[10]) ? 1 : 0)) {
            var2 = var3.p.a(K);
            Movement.setDestination((WorldPoint)var2);
            return lIlIllIllIIlI[3];
        }
        String[] stringArray = new String[lIlIllIllIIlI[3]];
        stringArray[l.lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[11]];
        if (l.llIIIIIlIllllll(Inventory.contains((String[])stringArray) ? 1 : 0) && l.llIIIIIllIIIIlI(Vars.getBit((int)lIlIllIllIIlI[12]), lIlIllIllIIlI[3])) {
            if (l.llIIIIIlIllllll(Dialog.isOpen() ? 1 : 0) && l.llIIIIIlIllllll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIllIllIIlI[11]);

            }
            String[] stringArray2 = new String[lIlIllIllIIlI[3]];
            stringArray2[l.lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[13]];
            var2 = Inventory.getFirst((String[])stringArray2);
            var2.interact(lIlIllIlIllll[lIlIllIllIIlI[14]]);
            return lIlIllIllIIlI[3];
        }
        if (l.llIIIIIlIllllll(var3.p.c(lIlIllIllIIlI[15]) ? 1 : 0)) {
            int[] nArray = new int[lIlIllIllIIlI[3]];
            nArray[l.lIlIllIllIIlI[0]] = lIlIllIllIIlI[16];
            var2 = TileObjects.getNearest((int[])nArray);
            if (l.llIIIIIllIIIIII(var2)) {
                var2.interact(lIlIllIlIllll[lIlIllIllIIlI[17]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (!l.llIIIIIllIIIIIl(C.isInScene(var3.j) ? 1 : 0) || l.llIIIIIlIllllll(var3.p.b(lIlIllIllIIlI[18]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)D);

            return lIlIllIllIIlI[3];
        }
        Movement.walkTo((WorldPoint)C);

        return lIlIllIllIIlI[3];
    }

    private static boolean llIIIIIlIllllll(int n2) {
        return n2 != 0;
    }

    private static void llIIIIIlIlllIll() {
        lIlIllIlIllll = new String[lIlIllIllIIlI[25]];
        l.lIlIllIlIllll[l.lIlIllIllIIlI[0]] = "Climb-rope";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[3]] = "The Cathedral.";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[6]] = "The Cathedral";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[8]] = "Use";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[11]] = "Ring of shadows";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[13]] = "Ring of shadows";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[14]] = "Teleport";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[17]] = "Enter";
    }

    private static boolean llIIIIIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean run() {
        if (l.llIIIIIlIllllll(this.f.b() ? 1 : 0)) {
            return lIlIllIllIIlI[0];
        }
        return this.p();
    }
}

