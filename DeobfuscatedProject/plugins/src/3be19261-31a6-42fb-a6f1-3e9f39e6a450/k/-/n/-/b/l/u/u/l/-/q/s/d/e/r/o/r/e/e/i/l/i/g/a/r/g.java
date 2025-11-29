/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.a;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Attacking Blue Dragon", priority=5, register=true)
public class g
extends Task {
    private static /* synthetic */ String[] lIIllllIIlIl;
    private static /* synthetic */ int[] lIIllllIIllI;
    private final /* synthetic */ a B;
    private final /* synthetic */ SquireBlueDragonKillerConfig A;
    private final /* synthetic */ SquireBlueDragonKiller z;

    private static boolean llIlIIIlllIlIl(Object object) {
        return object != null;
    }

    private boolean t() {
        int n;
        List list = NPCs.getAll(nPC -> {
            boolean bl;
            if (g.llIlIIIlllIlll(nPC.getInteracting(), Players.getLocal())) {
                bl = lIIllllIIllI[1];
                "".length();
                if (("  ".length() & ("  ".length() ^ -" ".length())) >= (0xDB ^ 0xC6 ^ (0xDE ^ 0xC7))) {
                    return ((0x40 ^ 0x70 ^ (0xFC ^ 0x80)) & (17 + 176 - 34 + 44 ^ 48 + 38 - 70 + 119 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIIllllIIllI[0];
            }
            return bl;
        });
        if (g.llIlIIIlllIIll(this.v() ? 1 : 0) && g.llIlIIIlllIlII(this.x() ? 1 : 0) && g.llIlIIIlllIlII(list.isEmpty() ? 1 : 0) && g.llIlIIIlllIlII(((NPC)list.get(lIIllllIIllI[0])).distanceTo((Locatable)Players.getLocal()))) {
            n = lIIllllIIllI[1];
            "".length();
            if ("   ".length() > "   ".length()) {
                return ((0x2A ^ 0x10) & ~(0x15 ^ 0x2F)) != 0;
            }
        } else {
            n = lIIllllIIllI[0];
        }
        return n != 0;
    }

    private static String llIlIIIlllIIII(String lllllllllllllllIlllIlIIlIlllIIII, String lllllllllllllllIlllIlIIlIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIlllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIlllIIlI.init(lIIllllIIllI[2], lllllllllllllllIlllIlIIlIlllIIll);
            return new String(lllllllllllllllIlllIlIIlIlllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIlllIIIl) {
            lllllllllllllllIlllIlIIlIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIlllIlll(Object object, Object object2) {
        return object == object2;
    }

    private boolean u() {
        int n;
        g lllllllllllllllIlllIlIIllIIIIlII;
        if (g.llIlIIIlllIlIl(Players.getLocal().getInteracting()) && (g.llIlIIIlllIIll(this.v() ? 1 : 0) && !g.llIlIIIlllIlII(this.x() ? 1 : 0) || g.llIlIIIlllIlII(lllllllllllllllIlllIlIIllIIIIlII.v() ? 1 : 0))) {
            n = lIIllllIIllI[1];
            "".length();
            if (" ".length() < 0) {
                return ((132 + 110 - 118 + 23 ^ 146 + 117 - 122 + 16) & (0x3A ^ 0x74 ^ (0x55 ^ 0x15) ^ -" ".length())) != 0;
            }
        } else {
            n = lIIllllIIllI[0];
        }
        return n != 0;
    }

    @Inject
    public g(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, a a2) {
        this.z = squireBlueDragonKiller;
        this.A = squireBlueDragonKillerConfig;
        this.B = a2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        void lllllllllllllllIlllIlIIlIllllIlI;
        if (g.llIlIIIlllIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (g.llIlIIIlllIIll(lllllllllllllllIlllIlIIlIllllIlI.getMessage().contains(lIIllllIIlIl[lIIllllIIllI[0]]) ? 1 : 0)) {
            g lllllllllllllllIlllIlIIlIllllIll;
            Log.info((String)lIIllllIIlIl[lIIllllIIllI[1]]);
            lllllllllllllllIlllIlIIlIllllIll.z.a(lIIllllIIllI[1]);
        }
    }

    private boolean v() {
        boolean bl;
        if (g.llIlIIIlllIllI((Object)this.A.attackStyle(), (Object)c.MELEE)) {
            bl = lIIllllIIllI[1];
            "".length();
            if (" ".length() >= (0x6C ^ 0x7A ^ (0x84 ^ 0x96))) {
                return ((0x31 ^ 0x39 ^ (0x7A ^ 0x28)) & (21 + 58 - -53 + 76 ^ 136 + 77 - 197 + 122 ^ -" ".length()) & ((3 ^ 0x3C ^ (0x27 ^ 0x3D)) & (38 + 105 - 55 + 68 ^ 19 + 146 - 162 + 182 ^ -" ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIllllIIllI[0];
        }
        return bl;
    }

    static {
        g.llIlIIIlllIIlI();
        g.llIlIIIlllIIIl();
    }

    private static void llIlIIIlllIIIl() {
        lIIllllIIlIl = new String[lIIllllIIllI[2]];
        g.lIIllllIIlIl[g.lIIllllIIllI[0]] = g.llIlIIIlllIIII("1wE+Mwtzq31swg/VMSrTVv05G8WfNZM9", "KcTWB");
        g.lIIllllIIlIl[g.lIIllllIIllI[1]] = g.llIlIIIlllIIII("CFcXWN4IbKWyP40wdHUGYN95ya9zTdDnmRC4X/Tp7eY=", "mCZHc");
    }

    private void w() {
        if (g.llIlIIIlllIIll(this.v() ? 1 : 0) && g.llIlIIIlllIIll(this.B.m() ? 1 : 0) && g.llIlIIIlllIlII(this.x() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)this.A.dragonLocation().q());
            "".length();
        }
        if (g.llIlIIIlllIlII(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        this.B.k();
    }

    private boolean x() {
        boolean bl;
        if (g.llIlIIIlllIlll(Players.getLocal().getWorldLocation(), this.A.dragonLocation().q())) {
            bl = lIIllllIIllI[1];
            "".length();
            if (-" ".length() > 0) {
                return ((27 + 80 - 59 + 87 ^ 107 + 49 - 136 + 117) & (0xBB ^ 0x80 ^ (0x48 ^ 0x7D) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIllllIIllI[0];
        }
        return bl;
    }

    private static void llIlIIIlllIIlI() {
        lIIllllIIllI = new int[3];
        g.lIIllllIIllI[0] = (0x5A ^ 0xC) & ~(0x92 ^ 0xC4);
        g.lIIllllIIllI[1] = " ".length();
        g.lIIllllIIllI[2] = "  ".length();
    }

    public boolean run() {
        g lllllllllllllllIlllIlIIllIIIllII;
        if (g.llIlIIIlllIIll(this.z.h() ? 1 : 0)) {
            return lIIllllIIllI[0];
        }
        if (g.llIlIIIlllIIll(lllllllllllllllIlllIlIIllIIIllII.z.b() ? 1 : 0)) {
            lllllllllllllllIlllIlIIllIIIllII.z.a(lIIllllIIllI[1]);
            return lIIllllIIllI[0];
        }
        if (g.llIlIIIlllIIll(lllllllllllllllIlllIlIIllIIIllII.s() ? 1 : 0)) {
            return lIIllllIIllI[0];
        }
        this.w();
        return lIIllllIIllI[1];
    }

    private boolean s() {
        int n;
        if (!(g.llIlIIIlllIlII(this.t() ? 1 : 0) && g.llIlIIIlllIIll(this.z.c().isEmpty() ? 1 : 0) && g.llIlIIIlllIIll(this.B.n() ? 1 : 0) && g.llIlIIIlllIlIl(this.B.j()) && !g.llIlIIIlllIIll(this.u() ? 1 : 0))) {
            n = lIIllllIIllI[1];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xA ^ 0x4B ^ (0x77 ^ 6)) & (0x50 ^ 0x79 ^ (0x1A ^ 3) ^ -" ".length())) != 0;
            }
        } else {
            n = lIIllllIIllI[0];
        }
        return n != 0;
    }

    private static boolean llIlIIIlllIlII(int n) {
        return n == 0;
    }

    private static boolean llIlIIIlllIIll(int n) {
        return n != 0;
    }

    private static boolean llIlIIIlllIllI(Object object, Object object2) {
        return object != object2;
    }
}

