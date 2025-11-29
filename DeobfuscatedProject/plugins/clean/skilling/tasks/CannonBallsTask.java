/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.skilling.tasks.SkillingTaskBase;
import gg.squire.skilling.tasks.GameEnum9;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Cannon Balls")
public class CannonBallsTask
extends SkillingTaskBase {

    private static boolean lIlIlllIIIIllI(int n2) {
        return n2 == 0;
    }

    static {
        O.lIlIlllIIIIlIl();
        O.lIlIlllIIIIlII();
    }

        return String.valueOf(var1);
    }

    @Override
    public int i() {
        return lllIIlIllIl[4];
    }

    private static boolean lIlIlllIIIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_1;
        if (!O.lIlIlllIIIIllI(Players.getLocal().isMoving() ? 1 : 0) || O.lIlIlllIIIIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIlIllIl[2];
        }
        if (O.lIlIlllIIIIlll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIIlIllIl[2]);
        }
        if (O.lIlIlllIIIIllI(Movement.isRunEnabled() ? 1 : 0) && O.lIlIlllIIIlIII(Movement.getRunEnergy(), lllIIlIllIl[3])) {
            Movement.toggleRun();
            return lllIIlIllIl[2];
        }
        String[] stringArray = new String[lllIIlIllIl[1]];
        stringArray[O.lllIIlIllIl[2]] = lllIIlIllII[lllIIlIllIl[2]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        if (O.lIlIlllIIIlIIl(var2)) {
            return lllIIlIllIl[2];
        }
        if (O.lIlIlllIIIIlll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return lllIIlIllIl[1];
        }
        var1_1.interact(lllIIlIllII[lllIIlIllIl[1]]);
        return lllIIlIllIl[1];
    }

    private static boolean lIlIlllIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIlllIIIIlII() {
        lllIIlIllII = new String[lllIIlIllIl[5]];
        O.lllIIlIllII[O.lllIIlIllIl[2]] = "Furnace";
        O.lllIIlIllII[O.lllIIlIllIl[1]] = "Smelt";
    }

    @Inject
    public CannonBallsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.CANNON_BALLS);
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlIllIl[0], lllIIlIllIl[1]);
    }

    private static boolean lIlIlllIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIIIlIIl(Object object) {
        return object == null;
    }
}

