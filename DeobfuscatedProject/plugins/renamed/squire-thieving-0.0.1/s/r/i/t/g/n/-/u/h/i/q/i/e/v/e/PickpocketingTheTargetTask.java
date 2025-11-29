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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a_Unknown;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.FEnum;

/* TASK: Pickpocketing the target -> PickpocketingthetargetTask */
@TaskDesc(name="Pickpocketing the target", priority=3)
public class PickpocketingTheTargetTask
extends a_Unknown {
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
        Player var11;
        F var12;
        f var10;
        if (F.lIllIIIlIIIlllI(this.o.j() ? 1 : 0)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(Bank.isOpen() ? 1 : 0)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIllll(Movement.isRunEnabled() ? 1 : 0) && F.lIllIIIlIIlIIII(Movement.getRunEnergy(), Rand.nextInt((int)lIIllIllIIlII[3], (int)lIIllIllIIlII[4]))) {
            Movement.toggleRun();
        }
        if (F.lIllIIIlIIlIIIl((Object)(var10 = var12.p.pickpocketTarget()), (Object)f.VYRE) && (!F.lIllIIIlIIIlllI(var12.o.e()) || F.lIllIIIlIIlIIlI(var12.o.e(), lIIllIllIIlII[5]))) {
            return lIIllIllIIlII[2];
        }
        NPC var17 = var12.a(var10);
        if (F.lIllIIIlIIlIIll(var17)) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(Inventory.isFull() ? 1 : 0)) {
            if (F.lIllIIIlIIlIlII((Object)var12.p.pickpocketTarget(), (Object)f.ARDY_KNIGHT)) {
                return lIIllIllIIlII[2];
            }
            String[] stringArray = new String[lIIllIllIIlII[6]];
            stringArray[F.lIIllIllIIlII[2]] = lIIllIllIIIll[lIIllIllIIlII[2]];
            stringArray[F.lIIllIllIIlII[7]] = lIIllIllIIIll[lIIllIllIIlII[7]];
            if (F.lIllIIIlIIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                return lIIllIllIIlII[2];
            }
        }
        if (F.lIllIIIlIIlIIll(var11 = Players.getLocal())) {
            return lIIllIllIIlII[2];
        }
        if (F.lIllIIIlIIIlllI(var12.o() ? 1 : 0)) {
            var12.sleep(Rand.nextInt((int)lIIllIllIIlII[7], (int)lIIllIllIIlII[8]));
            return lIIllIllIIlII[7];
        }
        if (F.lIllIIIlIIlIlII((Object)var10, (Object)f.VYRE)) {
            if (F.lIllIIIlIIlIIII(var11.getWorldLocation().distanceTo(var12.o.f()), var12.p.wanderRange())) {
                Movement.walkTo((WorldPoint)var12.o.f());
                0;
            }
            if (F.lIllIIIlIIlIIll(var17)) {
                return lIIllIllIIlII[2];
            }
            if (F.lIllIIIlIIlIIII(var17.getWorldLocation().distanceTo(var12.o.f()), var12.p.wanderRange())) {
                return lIIllIllIIlII[2];
            }
            if (F.lIllIIIlIIIllll(Reachable.isInteractable((Locatable)var17) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var17.getWorldLocation());
                0;
                return lIIllIllIIlII[7];
            }
        }
        this.a((NPC)var2_2);
        return lIIllIllIIlII[7];
    }

    private static boolean lIllIIIlIIlIlII(Object object, Object object2) {
        return object != object2;
    }

    private static String lIllIIIlIIIlIll(String var13, String var18) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIIllIllIIlII[6], var7);
            return new String(var2.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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
        F.lIIllIllIIIll[F.lIIllIllIIlII[2]] = F."Coin pouch";
        F.lIIllIllIIIll[F.lIIllIllIIlII[7]] = F."Coins";
    }

    private static boolean lIllIIIlIIlIIll(Object object) {
        return object == null;
    }

    @Inject
    public F(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        super(squireThieving, squireThievingConfig);
        this.ay = new WorldPoint(lIIllIllIIlII[0], lIIllIllIIlII[1], lIIllIllIIlII[2]);
    }

    private static String lIllIIIlIIIlIlI(String var1, String var15) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var8 = var15.toCharArray();
        int var16 = lIIllIllIIlII[2];
        char[] var14 = var1.toCharArray();
        int var4 = var14.length;
        int var6 = lIIllIllIIlII[2];
        while (F.lIllIIIlIIlIlIl(var6, var4)) {
            char var5 = var14[var6];
            var9.append((char)(var5 ^ var8[var16 % var8.length]));
            0;
            ++var16;
            ++var6;
            0;
            if (((0x5D ^ 0x65) & ~(0xBD ^ 0x85)) >= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIllIIIlIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIIIlIIIllIl() {
        lIIllIllIIlII = new int[9];
        F.lIIllIllIIlII[0] = -(0xFFFFE6A2 & 0x79FF) & (0xFFFFEFFF & 0x7EEF);
        F.lIIllIllIIlII[1] = 0xFFFFCD3F & 0x3FF1;
        F.lIIllIllIIlII[2] = (207 + 2 - 93 + 112 ^ 180 + 109 - 272 + 165) & (20 + 113 - 67 + 188 ^ 166 + 11 - 26 + 21 ^ -1);
        F.lIIllIllIIlII[3] = 4 ^ 0xC;
        F.lIIllIllIIlII[4] = 0xBA ^ 0xAC;
        F.lIIllIllIIlII[5] = -1;
        F.lIIllIllIIlII[6] = 2;
        F.lIIllIllIIlII[7] = 1;
        F.lIIllIllIIlII[8] = 3;
    }

    private static boolean lIllIIIlIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }
}

