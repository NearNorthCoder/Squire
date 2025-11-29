/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Attacking Cerberus", priority=5)
public class r
extends Task {
    private final /* synthetic */ a aA;
    private final /* synthetic */ SquireCerberusConfig aB;
    private static /* synthetic */ String[] lIIIIII;
    private static /* synthetic */ int[] lIIIIIl;

    private static void lllllIlI() {
        lIIIIII = new String[lIIIIIl[5]];
        r.lIIIIII[r.lIIIIIl[0]] = r."Attack";
        r.lIIIIII[r.lIIIIIl[2]] = r."Cerberus is not attackable yet.";
        r.lIIIIII[r.lIIIIIl[4]] = r."Attack";
    }

    private static boolean lllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean llllllII(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllllIIl(String llllIIlIlIllIII, String llllIIlIlIlIlll) {
        try {
            SecretKeySpec llllIIlIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIIIIIl[6]), "DES");
            Cipher llllIIlIlIlllII = Cipher.getInstance("DES");
            llllIIlIlIlllII.init(lIIIIIl[4], llllIIlIlIlllIl);
            return new String(llllIIlIlIlllII.doFinal(Base64.getDecoder().decode(llllIIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIlIlIllIll) {
            llllIIlIlIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllllIII(String llllIIlIlIIlIlI, String llllIIlIlIIIlII) {
        llllIIlIlIIlIlI = new String(Base64.getDecoder().decode(llllIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIIlIlIIlIII = new StringBuilder();
        char[] llllIIlIlIIIlll = llllIIlIlIIIlII.toCharArray();
        int llllIIlIlIIIllI = lIIIIIl[0];
        char[] llllIIlIlIIIIII = llllIIlIlIIlIlI.toCharArray();
        int llllIIlIIllllll = llllIIlIlIIIIII.length;
        int llllIIlIIlllllI = lIIIIIl[0];
        while (r.lIIIIIIlI(llllIIlIIlllllI, llllIIlIIllllll)) {
            char llllIIlIlIIlIll = llllIIlIlIIIIII[llllIIlIIlllllI];
            llllIIlIlIIlIII.append((char)(llllIIlIlIIlIll ^ llllIIlIlIIIlll[llllIIlIlIIIllI % llllIIlIlIIIlll.length]));
            0;
            ++llllIIlIlIIIllI;
            ++llllIIlIIlllllI;
            0;
            if ((0xA0 ^ 0xA5) != 0) continue;
            return null;
        }
        return String.valueOf(llllIIlIlIIlIII);
    }

    @Inject
    private r(a a2, SquireCerberusConfig squireCerberusConfig) {
        this.aA = a2;
        this.aB = squireCerberusConfig;
    }

    private static boolean lIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllll(int n2) {
        return n2 == 0;
    }

    private static void lllllIll() {
        lIIIIIl = new int[7];
        r.lIIIIIl[0] = (0x56 ^ 4) & ~(0x7D ^ 0x2F);
        r.lIIIIIl[1] = 0x28 ^ 0x27;
        r.lIIIIIl[2] = 1;
        r.lIIIIIl[3] = 0x12 ^ 0x17;
        r.lIIIIIl[4] = 2;
        r.lIIIIIl[5] = 3;
        r.lIIIIIl[6] = 0xBD ^ 0x83 ^ (0 ^ 0x36);
    }

    static {
        r.lllllIll();
        r.lllllIlI();
    }

    private static boolean llllllIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r llllIIlIllIIlII;
        NPC llllIIlIllIIIll;
        if (!r.llllllII(this.aA.k()) || r.llllllIl(this.aA.k().y())) {
            return lIIIIIl[0];
        }
        if (!r.llllllIl(Players.getLocal().getInteracting()) || r.lllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIIIIIl[0];
        }
        if (r.llllllll(Movement.isRunEnabled() ? 1 : 0) && r.lIIIIIIII(Movement.getRunEnergy(), lIIIIIl[1])) {
            Movement.toggleRun();
        }
        if (r.llllllIl(llllIIlIllIIIll = llllIIlIllIIlII.aA.k().y())) {
            return lIIIIIl[0];
        }
        if (r.lllllllI(llllIIlIllIIlII.aA.l() ? 1 : 0)) {
            llllIIlIllIIlII.aA.a(lIIIIIl[0]);
        }
        if (r.llllllll(Reachable.isInteractable((Locatable)llllIIlIllIIIll) ? 1 : 0)) {
            return llllIIlIllIIlII.aA.c();
        }
        String[] stringArray = new String[lIIIIIl[2]];
        stringArray[r.lIIIIIl[0]] = lIIIIII[lIIIIIl[0]];
        if (r.llllllll(llllIIlIllIIIll.hasAction(stringArray) ? 1 : 0)) {
            Player llllIIlIllIIIlI = Players.getLocal();
            if (r.llllllll(llllIIlIllIIlII.aA.l() ? 1 : 0) && r.lIIIIIIIl(llllIIlIllIIIlI.getWorldLocation().distanceTo((Locatable)llllIIlIllIIIll), lIIIIIl[3])) {
                Movement.setDestination((WorldPoint)llllIIlIllIIIll.getWorldLocation());
                return lIIIIIl[2];
            }
            Log.info((String)lIIIIII[lIIIIIl[2]]);
            return lIIIIIl[0];
        }
        var1_1.interact(lIIIIII[lIIIIIl[4]]);
        this.sleep(lIIIIIl[4]);
        return lIIIIIl[2];
    }
}

