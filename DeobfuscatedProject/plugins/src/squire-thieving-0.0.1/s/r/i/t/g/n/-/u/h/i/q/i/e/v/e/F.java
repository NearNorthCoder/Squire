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
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f;

@TaskDesc(name="Pickpocketing the target", priority=3)
public class F
extends a {
    private static /* synthetic */ String[] lIIllIllIIIll;
    private static /* synthetic */ int[] lIIllIllIIlII;
    private final /* synthetic */ WorldPoint ay;
    private static final /* synthetic */ Logger ax;

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
        Player llllllllllllllIlllIllllIllIIIIlI;
        F llllllllllllllIlllIllllIllIIIlIl;
        f llllllllllllllIlllIllllIllIIIlII;
        if (F.lIllIIIlIIIlllI(this.o.j() ? 1 : 0)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(Bank.isOpen() ? 1 : 0)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIllll(Movement.isRunEnabled() ? 1 : 0) && F.lIllIIIlIIlIIII(Movement.getRunEnergy(), Rand.nextInt((int)lIIllIllIIlII[3], (int)lIIllIllIIlII[4]))) {
            Movement.toggleRun();
        }
        if (F.lIllIIIlIIlIIIl((Object)(llllllllllllllIlllIllllIllIIIlII = llllllllllllllIlllIllllIllIIIlIl.p.pickpocketTarget()), (Object)f.VYRE) && (!F.lIllIIIlIIIlllI(llllllllllllllIlllIllllIllIIIlIl.o.e()) || F.lIllIIIlIIlIIlI(llllllllllllllIlllIllllIllIIIlIl.o.e(), lIIllIllIIlII[5]))) {
            return lIIllIllIIlII[2];
        }
        NPC llllllllllllllIlllIllllIllIIIIll = llllllllllllllIlllIllllIllIIIlIl.a(llllllllllllllIlllIllllIllIIIlII);
        if (F.lIllIIIlIIlIIll(llllllllllllllIlllIllllIllIIIIll)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(Inventory.isFull() ? 1 : 0)) {
            if (F.lIllIIIlIIlIlII((Object)llllllllllllllIlllIllllIllIIIlIl.p.pickpocketTarget(), (Object)f.ARDY_KNIGHT)) {
                return lIIllIllIIlII[2];
            }
            String[] stringArray = new String[lIIllIllIIlII[6]];
            stringArray[F.lIIllIllIIlII[2]] = lIIllIllIIIll[lIIllIllIIlII[2]];
            stringArray[F.lIIllIllIIlII[7]] = lIIllIllIIIll[lIIllIllIIlII[7]];
            if (F.lIllIIIlIIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                return lIIllIllIIlII[2];
            }
        }
        if (F.lIllIIIlIIlIIll(llllllllllllllIlllIllllIllIIIIlI = Players.getLocal())) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(llllllllllllllIlllIllllIllIIIlIl.o() ? 1 : 0)) {
            llllllllllllllIlllIllllIllIIIlIl.sleep(Rand.nextInt((int)lIIllIllIIlII[7], (int)lIIllIllIIlII[8]));
            return lIIllIllIIlII[7];
        }
        if (F.lIllIIIlIIlIlII((Object)llllllllllllllIlllIllllIllIIIlII, (Object)f.VYRE)) {
            if (F.lIllIIIlIIlIIII(llllllllllllllIlllIllllIllIIIIlI.getWorldLocation().distanceTo(llllllllllllllIlllIllllIllIIIlIl.o.f()), llllllllllllllIlllIllllIllIIIlIl.p.wanderRange())) {
                Movement.walkTo((WorldPoint)llllllllllllllIlllIllllIllIIIlIl.o.f());
                "".length();
            }
            if (F.lIllIIIlIIlIIll(llllllllllllllIlllIllllIllIIIIll)) {
                return lIIllIllIIlII[2];
            }
            if (F.lIllIIIlIIlIIII(llllllllllllllIlllIllllIllIIIIll.getWorldLocation().distanceTo(llllllllllllllIlllIllllIllIIIlIl.o.f()), llllllllllllllIlllIllllIllIIIlIl.p.wanderRange())) {
                return lIIllIllIIlII[2];
            }
            if (F.lIllIIIlIIIllll(Reachable.isInteractable((Locatable)llllllllllllllIlllIllllIllIIIIll) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)llllllllllllllIlllIllllIllIIIIll.getWorldLocation());
                "".length();
                return lIIllIllIIlII[7];
            }
        }
        this.a((NPC)var2_2);
        return lIIllIllIIlII[7];
    }

    private static boolean lIllIIIlIIlIlII(Object object, Object object2) {
        return object != object2;
    }

    private static String lIllIIIlIIIlIll(String llllllllllllllIlllIllllIlIlIIIlI, String llllllllllllllIlllIllllIlIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIlIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllllIlIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllllIlIlIIlII.init(lIIllIllIIlII[6], llllllllllllllIlllIllllIlIlIIlIl);
            return new String(llllllllllllllIlllIllllIlIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllIlIlIIIll) {
            llllllllllllllIlllIllllIlIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIlllI(int n2) {
        return n2 != 0;
    }

    static {
        F.lIllIIIlIIIllIl();
        F.lIllIIIlIIIllII();
        ax = LoggerFactory.getLogger(F.class);
    }

    private static boolean lIllIIIlIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIIIlIIIllII() {
        lIIllIllIIIll = new String[lIIllIllIIlII[6]];
        F.lIIllIllIIIll[F.lIIllIllIIlII[2]] = F.lIllIIIlIIIlIlI("ExwGKlIgHBonGg==", "PsoDr");
        F.lIIllIllIIIll[F.lIIllIllIIlII[7]] = F.lIllIIIlIIIlIll("nz5uJEnDqBA=", "lqIKS");
    }

    private static boolean lIllIIIlIIlIIll(Object object) {
        return object == null;
    }

    @Inject
    public F(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        super(squireThieving, squireThievingConfig);
        this.ay = new WorldPoint(lIIllIllIIlII[0], lIIllIllIIlII[1], lIIllIllIIlII[2]);
    }

    private static String lIllIIIlIIIlIlI(String llllllllllllllIlllIllllIlIllIIlI, String llllllllllllllIlllIllllIlIllIIIl) {
        llllllllllllllIlllIllllIlIllIIlI = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllIlIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllIlIllIlIl = new StringBuilder();
        char[] llllllllllllllIlllIllllIlIllIlII = llllllllllllllIlllIllllIlIllIIIl.toCharArray();
        int llllllllllllllIlllIllllIlIllIIll = lIIllIllIIlII[2];
        char[] llllllllllllllIlllIllllIlIlIllIl = llllllllllllllIlllIllllIlIllIIlI.toCharArray();
        int llllllllllllllIlllIllllIlIlIllII = llllllllllllllIlllIllllIlIlIllIl.length;
        int llllllllllllllIlllIllllIlIlIlIll = lIIllIllIIlII[2];
        while (F.lIllIIIlIIlIlIl(llllllllllllllIlllIllllIlIlIlIll, llllllllllllllIlllIllllIlIlIllII)) {
            char llllllllllllllIlllIllllIlIlllIII = llllllllllllllIlllIllllIlIlIllIl[llllllllllllllIlllIllllIlIlIlIll];
            llllllllllllllIlllIllllIlIllIlIl.append((char)(llllllllllllllIlllIllllIlIlllIII ^ llllllllllllllIlllIllllIlIllIlII[llllllllllllllIlllIllllIlIllIIll % llllllllllllllIlllIllllIlIllIlII.length]));
            "".length();
            ++llllllllllllllIlllIllllIlIllIIll;
            ++llllllllllllllIlllIllllIlIlIlIll;
            "".length();
            if (((0x5D ^ 0x65) & ~(0xBD ^ 0x85)) >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllllIlIllIlIl);
    }

    private static boolean lIllIIIlIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIIIlIIIllIl() {
        lIIllIllIIlII = new int[9];
        F.lIIllIllIIlII[0] = -(0xFFFFE6A2 & 0x79FF) & (0xFFFFEFFF & 0x7EEF);
        F.lIIllIllIIlII[1] = 0xFFFFCD3F & 0x3FF1;
        F.lIIllIllIIlII[2] = (207 + 2 - 93 + 112 ^ 180 + 109 - 272 + 165) & (20 + 113 - 67 + 188 ^ 166 + 11 - 26 + 21 ^ -" ".length());
        F.lIIllIllIIlII[3] = 4 ^ 0xC;
        F.lIIllIllIIlII[4] = 0xBA ^ 0xAC;
        F.lIIllIllIIlII[5] = -" ".length();
        F.lIIllIllIIlII[6] = "  ".length();
        F.lIIllIllIIlII[7] = " ".length();
        F.lIIllIllIIlII[8] = "   ".length();
    }

    private static boolean lIllIIIlIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }
}

