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
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

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
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.a;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking To Blue Dragons")
public class l
extends Task {
    private static /* synthetic */ int[] lIIllllIllII;
    private final /* synthetic */ a J;
    private final /* synthetic */ SquireBlueDragonKiller K;
    private static /* synthetic */ String[] lIIllllIlIll;
    private final /* synthetic */ SquireBlueDragonKillerConfig I;

    private static String llIlIIlIIIIIlI(String lllllllllllllllIlllIlIIlIIIlIlIl, String lllllllllllllllIlllIlIIlIIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIIIlIlll.init(lIIllllIllII[2], lllllllllllllllIlllIlIIlIIIllIII);
            return new String(lllllllllllllllIlllIlIIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIIIlIllI) {
            lllllllllllllllIlllIlIIlIIIlIllI.printStackTrace();
            return null;
        }
    }

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

    private static void llIlIIlIIIIlII() {
        lIIllllIllII = new int[3];
        l.lIIllllIllII[0] = (0xAB ^ 0xB9 ^ (0x3A ^ 0x61)) & (58 + 81 - 120 + 203 ^ 108 + 4 - 64 + 103 ^ -" ".length());
        l.lIIllllIllII[1] = " ".length();
        l.lIIllllIllII[2] = "  ".length();
    }

    private boolean A() {
        return this.J.n();
    }

    private void C() {
        if (l.llIlIIlIIIIllI(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        Movement.walkTo((WorldPoint)this.I.dragonLocation().o());
        "".length();
    }

    @Inject
    public l(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, a a2, SquireBlueDragonKiller squireBlueDragonKiller) {
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
            "".length();
            if ((3 ^ 6) <= 0) {
                return ((0x24 ^ 0x7C) & ~(0xEA ^ 0xB2)) != 0;
            }
        } else {
            n = lIIllllIllII[0];
        }
        return n != 0;
    }

    private boolean s() {
        int n;
        l lllllllllllllllIlllIlIIlIIIlllll;
        if (l.llIlIIlIIIIlIl(this.K.h() ? 1 : 0) && !l.llIlIIlIIIIllI(this.y() ? 1 : 0) || !l.llIlIIlIIIIllI(lllllllllllllllIlllIlIIlIIIlllll.A() ? 1 : 0) || !l.llIlIIlIIIIllI(lllllllllllllllIlllIlIIlIIIlllll.B() ? 1 : 0) || l.llIlIIlIIIIllI(Inventory.contains(item -> {
            String[] stringArray = new String[lIIllllIllII[1]];
            stringArray[l.lIIllllIllII[0]] = lIIllllIlIll[lIIllllIllII[1]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            n = lIIllllIllII[1];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x9F ^ 0xC1) & ~(0x73 ^ 0x2D)) != 0;
            }
        } else {
            n = lIIllllIllII[0];
        }
        return n != 0;
    }

    private static void llIlIIlIIIIIll() {
        lIIllllIlIll = new String[lIIllllIllII[2]];
        l.lIIllllIlIll[l.lIIllllIllII[0]] = l.llIlIIlIIIIIlI("oZ6BDubGi1I=", "mBccd");
        l.lIIllllIlIll[l.lIIllllIllII[1]] = l.llIlIIlIIIIIlI("97zxFWZss5w=", "euXjI");
    }

    private static boolean llIlIIlIIIIllI(int n) {
        return n == 0;
    }
}

