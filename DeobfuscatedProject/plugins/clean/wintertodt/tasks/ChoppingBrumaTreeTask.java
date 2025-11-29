/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum8;
import gg.squire.wintertodt.tasks.BHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Chopping bruma tree")
public class ChoppingBrumaTreeTask
extends Task {
    private final  b F;

    public static final  String D;
    private final  SquireWintertodtConfig E;

    private static boolean llIIIIllIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIllIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public ChoppingBrumaTreeTask(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.E = squireWintertodtConfig;
        this.F = b2;
    }

    static {
        f.llIIIIllIIIlllI();
        f.llIIIIllIIIIIll();
        D = lIlIllllIlIlI[lIlIllllIllIl[7]];
    }

    private static void llIIIIllIIIIIll() {
        lIlIllllIlIlI = new String[lIlIllllIllIl[8]];
        f.lIlIllllIlIlI[f.lIlIllllIllIl[0]] = "Bruma roots";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[1]] = "Chop";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[4]] = "Dragon felling axe";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[5]] = "Infernal axe";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[6]] = "Dragon axe";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[7]] = "Bruma roots";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        f var1;
        if (!f.llIIIIllIIIllll(this.F.i() ? 1 : 0) || !f.llIIIIllIIIllll(this.F.u() ? 1 : 0) || f.llIIIIllIIIllll(this.F.j() ? 1 : 0)) {
            return lIlIllllIllIl[0];
        }
        a var2 = var1.F.q();
        String[] stringArray = new String[lIlIllllIllIl[1]];
        stringArray[f.lIlIllllIllIl[0]] = lIlIllllIlIlI[lIlIllllIllIl[0]];
        TileObject var3 = TileObjects.getNearest((WorldPoint)var2.c(), (String[])stringArray);
        if (f.llIIIIllIIlIIII(var3)) {
            return lIlIllllIllIl[0];
        }
        Player var4 = Players.getLocal();
        if (!f.llIIIIllIIlIIIl(var4.isAnimating() ? 1 : 0) || f.llIIIIllIIIllll(var4.isMoving() ? 1 : 0)) {
            return lIlIllllIllIl[0];
        }
        if (f.llIIIIllIIlIIIl(Movement.isRunEnabled() ? 1 : 0) && f.llIIIIllIIlIIlI(Movement.getRunEnergy(), lIlIllllIllIl[2])) {
            Movement.toggleRun();
        }
        if (f.llIIIIllIIIllll(var1.E.spec() ? 1 : 0) && f.llIIIIllIIlIIll(Combat.getSpecEnergy(), lIlIllllIllIl[3]) && f.llIIIIllIIIllll(var1.B() ? 1 : 0)) {
            Combat.toggleSpec();
            return lIlIllllIllIl[0];
        }
        if (f.llIIIIllIIlIIIl(var4.getWorldLocation().equals((Object)var2.c()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var2.c());
            return lIlIllllIllIl[1];
        }
        var2_2.interact(lIlIllllIlIlI[lIlIllllIllIl[1]]);
        return lIlIllllIllIl[1];
    }

    private static boolean llIIIIllIIIllll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean B() {
        boolean bl;
        block3: {
            block2: {
                if (!f.llIIIIllIIlIIIl(Equipment.contains(item -> item.getName().contains(lIlIllllIlIlI[lIlIllllIllIl[6]])) ? 1 : 0)) break block2;
                String[] stringArray = new String[lIlIllllIllIl[1]];
                stringArray[f.lIlIllllIllIl[0]] = lIlIllllIlIlI[lIlIllllIllIl[4]];
                if (!f.llIIIIllIIlIIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) break block2;
                String[] stringArray2 = new String[lIlIllllIllIl[1]];
                stringArray2[f.lIlIllllIllIl[0]] = lIlIllllIlIlI[lIlIllllIllIl[5]];
                if (!f.llIIIIllIIIllll(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block3;
            }
            bl = lIlIllllIllIl[1];

            if (((114 + 121 - 214 + 143 ^ 87 + 123 - 110 + 74) & (107 + 144 - 230 + 159 ^ 31 + 86 - 84 + 157 ^ -1)) == 0) return bl;
            return ((0x84 ^ 0xAA ^ (0x77 ^ 0x11)) & (113 + 71 - 18 + 49 ^ 72 + 146 - 173 + 114 ^ -1)) != 0;
        }
        bl = lIlIllllIllIl[0];
        return bl;
    }

    private static boolean llIIIIllIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIllIIlIIII(Object object) {
        return object == null;
    }
}

