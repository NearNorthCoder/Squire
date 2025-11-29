/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.combat.AgroReset.ResetPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/* TASK: Resetting aggro -> ResettingaggroTask */
@TaskDesc(name="Resetting aggro")
public class E
extends Task {
    private static /* synthetic */ int[] lllIIllll;
    private /* synthetic */ long bj;
    private static /* synthetic */ String[] lllIIlllI;
    private final /* synthetic */ ResetPlugin bi;

    private static boolean llIIIllIllI(Object object) {
        return object != null;
    }

    public boolean run() {
        E lIlIlIllIIlIllI;
        if (E.llIIIllIlII(this.bi.ae() ? 1 : 0)) {
            return lllIIllll[0];
        }
        long lIlIlIllIIlIlIl = System.currentTimeMillis() - lIlIlIllIIlIllI.bi.ag();
        if (E.llIIIllIlIl(E.llIIIllIIlI(lIlIlIllIIlIlIl, lIlIlIllIIlIllI.bi.ak()[lllIIllll[0]]))) {
            return lllIIllll[0];
        }
        WorldPoint lIlIlIllIIlIlII = lIlIlIllIIlIllI.bi.aj();
        Player lIlIlIllIIlIIll = Players.getLocal();
        if (!E.llIIIllIllI(lIlIlIllIIlIlII) || !E.llIIIllIlII(lIlIlIllIIlIIll.isMoving() ? 1 : 0) || E.llIIIllIllI(lIlIlIllIIlIIll.getInteracting()) && E.llIIIllIlll(lIlIlIllIIlIllI.bi.ai().equals((Object)lIlIlIllIIlIIll.getWorldLocation()) ? 1 : 0)) {
            return lllIIllll[0];
        }
        List lIlIlIllIIlIIlI = NPCs.getAll(nPC -> {
            int n2;
            if (E.llIIIlllIIl(nPC.getInteracting(), lIlIlIllIIlIIll)) {
                String[] stringArray = new String[lllIIllll[1]];
                stringArray[E.lllIIllll[0]] = lllIIlllI[lllIIllll[1]];
                if (E.llIIIllIlll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIllll[1];
                    0;
                    if (-(0x7B ^ 0x24 ^ (2 ^ 0x59)) < 0) return n2 != 0;
                    return ((0xC8 ^ 0x8D ^ (0xAF ^ 0xB6)) & (0x4D ^ 0x71 ^ (0x7B ^ 0x1B) ^ -1)) != 0;
                }
            }
            n2 = lllIIllll[0];
            return n2 != 0;
        });
        if (E.llIIIllIlII(lIlIlIllIIlIIlI.isEmpty() ? 1 : 0)) {
            NPC lIlIlIllIIlIIIl = (NPC)lIlIlIllIIlIIlI.get(lllIIllll[0]);
            if (E.llIIIllIllI(lIlIlIllIIlIIIl) && E.llIIIlllIII(E.llIIIllIIll(lIlIlIllIIlIIIl.getWorldLocation().distanceTo2DHypotenuse(lIlIlIllIIlIIll.getWorldLocation()), 1.0f))) {
                lIlIlIllIIlIIIl.interact(lllIIlllI[lllIIllll[0]]);
            }
            return lllIIllll[0];
        }
        WorldPoint lIlIlIllIIlIIIl = lIlIlIllIIlIIll.getWorldLocation();
        if (E.llIIIllIlll(lIlIlIllIIlIlII.equals((Object)lIlIlIllIIlIIIl) ? 1 : 0)) {
            if (E.llIIIllIlII(E.llIIIllIIlI(lIlIlIllIIlIllI.bj, -1L))) {
                lIlIlIllIIlIllI.bj = System.currentTimeMillis();
                return lllIIllll[0];
            }
            long lIlIlIllIIlIIII = System.currentTimeMillis() - lIlIlIllIIlIllI.bj;
            if (E.llIIIllIlIl(E.llIIIllIIlI(lIlIlIllIIlIIII, lIlIlIllIIlIllI.bi.ak()[lllIIllll[1]]))) {
                return lllIIllll[0];
            }
            Movement.walk((WorldPoint)lIlIlIllIIlIllI.bi.ai());
            lIlIlIllIIlIllI.bi.ac();
            lIlIlIllIIlIllI.bj = -1L;
            0;
            if (-1 > 3) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            Movement.walk((WorldPoint)lIlIlIllIIlIlII);
        }
        return lllIIllll[1];
    }

    static {
        E.llIIIllIIIl();
        E.llIIIllIIII();
    }

    private static boolean llIIIlllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public E(ResetPlugin resetPlugin) {
        this.bj = -1L;
        this.bi = resetPlugin;
    }

    private static boolean llIIIllIlll(int n2) {
        return n2 != 0;
    }

    private static void llIIIllIIIl() {
        lllIIllll = new int[4];
        E.lllIIllll[0] = (0xA6 ^ 0x8B) & ~(0x3E ^ 0x13);
        E.lllIIllll[1] = 1;
        E.lllIIllll[2] = 2;
        E.lllIIllll[3] = 0x7D ^ 0x4B ^ (0x1E ^ 0x20);
    }

    private static boolean llIIIlllIII(int n2) {
        return n2 <= 0;
    }

    private static void llIIIllIIII() {
        lllIIlllI = new String[lllIIllll[2]];
        E.lllIIlllI[E.lllIIllll[0]] = E."Attack";
        E.lllIIlllI[E.lllIIllll[1]] = E."Attack";
    }

    private static String llIIIlIlllI(String lIlIlIlIllIllII, String lIlIlIlIllIlIll) {
        try {
            SecretKeySpec lIlIlIlIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIllIlIll.getBytes(StandardCharsets.UTF_8)), lllIIllll[3]), "DES");
            Cipher lIlIlIlIllIlllI = Cipher.getInstance("DES");
            lIlIlIlIllIlllI.init(lllIIllll[2], lIlIlIlIllIllll);
            return new String(lIlIlIlIllIlllI.doFinal(Base64.getDecoder().decode(lIlIlIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIlIllIllIl) {
            lIlIlIlIllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllIlIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIllIlII(int n2) {
        return n2 == 0;
    }

    private static int llIIIllIIll(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
    }

    private static int llIIIllIIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String llIIIlIllll(String lIlIlIlIlllllII, String lIlIlIllIIIIIII) {
        lIlIlIlIlllllII = new String(Base64.getDecoder().decode(lIlIlIlIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIlIlllllll = new StringBuilder();
        char[] lIlIlIlIllllllI = lIlIlIllIIIIIII.toCharArray();
        int lIlIlIlIlllllIl = lllIIllll[0];
        char[] lIlIlIlIlllIlll = lIlIlIlIlllllII.toCharArray();
        int lIlIlIlIlllIllI = lIlIlIlIlllIlll.length;
        int lIlIlIlIlllIlIl = lllIIllll[0];
        while (E.llIIIlllIlI(lIlIlIlIlllIlIl, lIlIlIlIlllIllI)) {
            char lIlIlIllIIIIIlI = lIlIlIlIlllIlll[lIlIlIlIlllIlIl];
            lIlIlIlIlllllll.append((char)(lIlIlIllIIIIIlI ^ lIlIlIlIllllllI[lIlIlIlIlllllIl % lIlIlIlIllllllI.length]));
            0;
            ++lIlIlIlIlllllIl;
            ++lIlIlIlIlllIlIl;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lIlIlIlIlllllll);
    }
}

