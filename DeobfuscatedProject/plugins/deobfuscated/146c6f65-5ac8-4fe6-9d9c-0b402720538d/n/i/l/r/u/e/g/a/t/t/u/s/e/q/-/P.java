/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Attack T1 Monsters", priority=2)
public class P
extends n {
    private static /* synthetic */ int[] llIlIIIIIIlI;
    private final /* synthetic */ b ca;
    private static /* synthetic */ String[] llIlIIIIIIIl;

    private static boolean lIIIIIIIlIIlllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public P(c c2, b b2) {
        d[] dArray = new d[llIlIIIIIIlI[0]];
        dArray[P.llIlIIIIIIlI[1]] = d.FIRST_ROTATION_EXPLORE;
        super(c2, dArray);
        this.ca = b2;
    }

    private static boolean lIIIIIIIlIIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIIIIIIlIIlIlI() {
        llIlIIIIIIlI = new int[4];
        P.llIlIIIIIIlI[0] = 1;
        P.llIlIIIIIIlI[1] = (169 + 168 - 185 + 35 ^ 92 + 154 - 226 + 153) & (42 + 43 - -43 + 82 ^ 71 + 135 - 121 + 111 ^ -1);
        P.llIlIIIIIIlI[2] = 0x78 ^ 0x7D;
        P.llIlIIIIIIlI[3] = 2;
    }

    private static boolean lIIIIIIIlIIllII(int n2) {
        return n2 == 0;
    }

    private static /* synthetic */ int b(Player player, NPC nPC) {
        return nPC.distanceTo(player.getWorldLocation());
    }

    static {
        P.lIIIIIIIlIIlIlI();
        P.lIIIIIIIlIIlIIl();
    }

    private static boolean lIIIIIIIlIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIlIIllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void lllllllllllllllIlIIIlllIllIIIlII;
        NPC lllllllllllllllIlIIIlllIllIIIIII;
        int n2;
        int lllllllllllllllIlIIIlllIllIIIIIl;
        int n3;
        P lllllllllllllllIlIIIlllIllIIIlIl;
        Player player = Players.getLocal();
        if (!P.lIIIIIIIlIIlIll(player) || P.lIIIIIIIlIIlIll(player.getInteracting())) {
            return llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllII(lllllllllllllllIlIIIlllIllIIIlIl.ba.B() ? 1 : 0)) {
            return llIlIIIIIIlI[1];
        }
        h lllllllllllllllIlIIIlllIllIIIIll = lllllllllllllllIlIIIlllIllIIIlIl.ba.V();
        l lllllllllllllllIlIIIlllIllIIIIlI = lllllllllllllllIlIIIlllIllIIIIll.ar().orElse(null);
        if (!P.lIIIIIIIlIIlIll(lllllllllllllllIlIIIlllIllIIIIlI) || P.lIIIIIIIlIIllIl(lllllllllllllllIlIIIlllIllIIIIlI, lllllllllllllllIlIIIlllIllIIIIll.av())) {
            n3 = llIlIIIIIIlI[0];
            0;
            if (2 < 0) {
                return ((0xBD ^ 0xB6) & ~(0x9D ^ 0x96)) != 0;
            }
        } else {
            n3 = llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIlllI(lllllllllllllllIlIIIlllIllIIIIIl = n3)) {
            n2 = llIlIIIIIIlI[0];
            0;
            if (-(0x4C ^ 0x24 ^ (0xED ^ 0x81)) >= 0) {
                return ((0xC0 ^ 0xA0 ^ (0x3F ^ 1)) & (0xDF ^ 0x95 ^ (0x8B ^ 0x9F) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllll(lllllllllllllllIlIIIlllIllIIIIII = (NPC)NPCs.getAll((int[])e.as[n2]).stream().filter(nPC -> {
            boolean bl;
            if (P.lIIIIIIIlIIllII(nPC.isDead() ? 1 : 0)) {
                bl = llIlIIIIIIlI[0];
                0;
                if (((59 + 111 - 151 + 132 ^ 135 + 113 - 238 + 157) & (103 + 47 - -5 + 31 ^ 9 + 108 - 24 + 45 ^ -1)) != 0) {
                    return ((0x60 ^ 9 ^ (0xC3 ^ 0xA3)) & (0x23 ^ 0x63 ^ (0xDF ^ 0x96) ^ -1)) != 0;
                }
            } else {
                bl = llIlIIIIIIlI[1];
            }
            return bl;
        }).min(Comparator.comparingInt(arg_0 -> P.b((Player)lllllllllllllllIlIIIlllIllIIIlII, arg_0))).orElse(null))) {
            return llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllII(lllllllllllllllIlIIIlllIllIIIlIl.ca.t() ? 1 : 0) && P.lIIIIIIIlIIllII(lllllllllllllllIlIIIlllIllIIIlII.isMoving() ? 1 : 0)) {
            lllllllllllllllIlIIIlllIllIIIIII.interact(llIlIIIIIIIl[llIlIIIIIIlI[1]]);
            lllllllllllllllIlIIIlllIllIIIlIl.ca.c(llIlIIIIIIlI[2]);
        }
        return llIlIIIIIIlI[0];
    }

    private static void lIIIIIIIlIIlIIl() {
        llIlIIIIIIIl = new String[llIlIIIIIIlI[0]];
        P.llIlIIIIIIIl[P.llIlIIIIIIlI[1]] = P."Attack";
    }

    private static String lIIIIIIIlIIlIII(String lllllllllllllllIlIIIlllIlIllIllI, String lllllllllllllllIlIIIlllIlIllIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllIlIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIlIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlllIlIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlllIlIlllIII.init(llIlIIIIIIlI[3], lllllllllllllllIlIIIlllIlIlllIIl);
            return new String(lllllllllllllllIlIIIlllIlIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlllIlIllIlll) {
            lllllllllllllllIlIIIlllIlIllIlll.printStackTrace();
            return null;
        }
    }
}

