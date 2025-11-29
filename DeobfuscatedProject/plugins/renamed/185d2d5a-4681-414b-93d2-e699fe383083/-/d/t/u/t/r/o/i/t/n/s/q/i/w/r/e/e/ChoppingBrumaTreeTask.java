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
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.AEnum;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b_Unknown;
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

/* TASK: Chopping bruma tree -> ChoppingbrumatreeTask */
@TaskDesc(name="Chopping bruma tree")
public class ChoppingBrumaTreeTask
extends Task {
    private final /* synthetic */ b F;
    private static /* synthetic */ String[] lIlIllllIlIlI;
    private static /* synthetic */ int[] lIlIllllIllIl;
    public static final /* synthetic */ String D;
    private final /* synthetic */ SquireWintertodtConfig E;

    private static boolean llIIIIllIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIllIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIIllIIIlllI() {
        lIlIllllIllIl = new int[10];
        f.lIlIllllIllIl[0] = (7 ^ 0x3C) & ~(0x95 ^ 0xAE);
        f.lIlIllllIllIl[1] = 1;
        f.lIlIllllIllIl[2] = 39 + 26 - 50 + 129 ^ 2 + 130 - 32 + 37;
        f.lIlIllllIllIl[3] = 0x3E ^ 0x1F ^ (0x33 ^ 0x76);
        f.lIlIllllIllIl[4] = 2;
        f.lIlIllllIllIl[5] = 3;
        f.lIlIllllIllIl[6] = 0x69 ^ 0x40 ^ (0x8E ^ 0xA3);
        f.lIlIllllIllIl[7] = 143 + 131 - 104 + 25 ^ 177 + 164 - 169 + 26;
        f.lIlIllllIllIl[8] = 20 + 8 - -18 + 128 ^ 31 + 103 - 45 + 79;
        f.lIlIllllIllIl[9] = 0x9A ^ 0x92;
    }

    @Inject
    public f(SquireWintertodtConfig squireWintertodtConfig, b b2) {
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
        f.lIlIllllIlIlI[f.lIlIllllIllIl[0]] = f."Bruma roots";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[1]] = f."Chop";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[4]] = f."Dragon felling axe";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[5]] = f."Infernal axe";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[6]] = f."Dragon axe";
        f.lIlIllllIlIlI[f.lIlIllllIllIl[7]] = f."Bruma roots";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        f var3;
        if (!f.llIIIIllIIIllll(this.F.i() ? 1 : 0) || !f.llIIIIllIIIllll(this.F.u() ? 1 : 0) || f.llIIIIllIIIllll(this.F.j() ? 1 : 0)) {
            return lIlIllllIllIl[0];
        }
        a var9 = var3.F.q();
        String[] stringArray = new String[lIlIllllIllIl[1]];
        stringArray[f.lIlIllllIllIl[0]] = lIlIllllIlIlI[lIlIllllIllIl[0]];
        TileObject var13 = TileObjects.getNearest((WorldPoint)var9.c(), (String[])stringArray);
        if (f.llIIIIllIIlIIII(var13)) {
            return lIlIllllIllIl[0];
        }
        Player var6 = Players.getLocal();
        if (!f.llIIIIllIIlIIIl(var6.isAnimating() ? 1 : 0) || f.llIIIIllIIIllll(var6.isMoving() ? 1 : 0)) {
            return lIlIllllIllIl[0];
        }
        if (f.llIIIIllIIlIIIl(Movement.isRunEnabled() ? 1 : 0) && f.llIIIIllIIlIIlI(Movement.getRunEnergy(), lIlIllllIllIl[2])) {
            Movement.toggleRun();
        }
        if (f.llIIIIllIIIllll(var3.E.spec() ? 1 : 0) && f.llIIIIllIIlIIll(Combat.getSpecEnergy(), lIlIllllIllIl[3]) && f.llIIIIllIIIllll(var3.B() ? 1 : 0)) {
            Combat.toggleSpec();
            return lIlIllllIllIl[0];
        }
        if (f.llIIIIllIIlIIIl(var6.getWorldLocation().equals((Object)var9.c()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var9.c());
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
            0;
            if (((114 + 121 - 214 + 143 ^ 87 + 123 - 110 + 74) & (107 + 144 - 230 + 159 ^ 31 + 86 - 84 + 157 ^ -1)) == 0) return bl;
            return ((0x84 ^ 0xAA ^ (0x77 ^ 0x11)) & (113 + 71 - 18 + 49 ^ 72 + 146 - 173 + 114 ^ -1)) != 0;
        }
        bl = lIlIllllIllIl[0];
        return bl;
    }

    private static boolean llIIIIllIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIIIIllIIIIIIl(String var5, String var2) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIllllIllIl[9]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlIllllIllIl[4], var7);
            return new String(var12.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String llIIIIlIlllllIl(String var4, String var10) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIllllIllIl[4], var11);
            return new String(var14.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIIlIIII(Object object) {
        return object == null;
    }
}

