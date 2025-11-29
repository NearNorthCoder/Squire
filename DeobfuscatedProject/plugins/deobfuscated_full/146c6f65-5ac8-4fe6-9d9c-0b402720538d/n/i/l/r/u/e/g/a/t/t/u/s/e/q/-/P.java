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

/* TASK: Attack T1 Monsters -> Attackt1MonstersTask */
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
        void var6;
        NPC var3;
        int n2;
        int var2;
        int n3;
        P var7;
        Player player = Players.getLocal();
        if (!P.lIIIIIIIlIIlIll(player) || P.lIIIIIIIlIIlIll(player.getInteracting())) {
            return llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllII(var7.ba.B() ? 1 : 0)) {
            return llIlIIIIIIlI[1];
        }
        h var8 = var7.ba.V();
        l var11 = var8.ar().orElse(null);
        if (!P.lIIIIIIIlIIlIll(var11) || P.lIIIIIIIlIIllIl(var11, var8.av())) {
            n3 = llIlIIIIIIlI[0];
            0;
            if (2 < 0) {
                return false;
            }
        } else {
            n3 = llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIlllI(var2 = n3)) {
            n2 = llIlIIIIIIlI[0];
            0;
            if (-(0x4C ^ 0x24 ^ (0xED ^ 0x81)) >= 0) {
                return ((0xC0 ^ 0xA0 ^ (0x3F ^ 1)) & (0xDF ^ 0x95 ^ (0x8B ^ 0x9F) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllll(var3 = (NPC)NPCs.getAll((int[])e.as[n2]).stream().filter(nPC -> {
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
        }).min(Comparator.comparingInt(arg_0 -> P.b((Player)var6, arg_0))).orElse(null))) {
            return llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllII(var7.ca.t() ? 1 : 0) && P.lIIIIIIIlIIllII(var6.isMoving() ? 1 : 0)) {
            var3.interact(llIlIIIIIIIl[llIlIIIIIIlI[1]]);
            var7.ca.c(llIlIIIIIIlI[2]);
        }
        return llIlIIIIIIlI[0];
    }

    private static void lIIIIIIIlIIlIIl() {
        llIlIIIIIIIl = new String[llIlIIIIIIlI[0]];
        P.llIlIIIIIIIl[P.llIlIIIIIIlI[1]] = P."Attack";
    }

    private static String lIIIIIIIlIIlIII(String var4, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIlIIIIIIlI[3], var5);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }
}

