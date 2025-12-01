package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

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
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Attacking Blue Dragon", priority = 5, register = true)
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.g  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/g.class */
public class g extends Task {
    private static /* synthetic */ String[] lIIllllIIlIl;
    private static /* synthetic */ int[] lIIllllIIllI;
    private final /* synthetic */ a B;
    private final /* synthetic */ SquireBlueDragonKillerConfig A;
    private final /* synthetic */ SquireBlueDragonKiller z;

    private static boolean llIlIIIlllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean t() {
        List all = NPCs.getAll(npc -> {
            if (llIlIIIlllIlll(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = lIIllllIIllI[1];
                "".length();
                return ("  ".length() & ("  ".length() ^ (-" ".length()))) >= ((219 ^ 198) ^ (222 ^ 199)) ? ((64 ^ 112) ^ (252 ^ 128)) & (((((17 + 176) - 34) + 44) ^ (((48 + 38) - 70) + 119)) ^ (-" ".length())) : r0;
            }
            return lIIllllIIllI[0];
        });
        if (llIlIIIlllIIll(v() ? 1 : 0) && llIlIIIlllIlII(x() ? 1 : 0) && llIlIIIlllIlII(all.isEmpty() ? 1 : 0) && llIlIIIlllIlII(((NPC) all.get(lIIllllIIllI[0])).distanceTo(Players.getLocal()))) {
            ?? r0 = lIIllllIIllI[1];
            "".length();
            return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllllIIllI[0];
    }

    private static String llIlIIIlllIIII(String lllllllllllllllIlllIlIIlIlllIIII, String lllllllllllllllIlllIlIIlIllIllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIlllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIlllIIlI.init(lIIllllIIllI[2], lllllllllllllllIlllIlIIlIlllIIll);
            return new String(lllllllllllllllIlllIlIIlIlllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIlllIIIl) {
            lllllllllllllllIlllIlIIlIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIlllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean u() {
        if (!llIlIIIlllIlIl(Players.getLocal().getInteracting()) || ((!llIlIIIlllIIll(v() ? 1 : 0) || llIlIIIlllIlII(x() ? 1 : 0)) && !llIlIIIlllIlII(v() ? 1 : 0))) {
            return lIIllllIIllI[0];
        }
        ?? r0 = lIIllllIIllI[1];
        "".length();
        return " ".length() < 0 ? ((((132 + 110) - 118) + 23) ^ (((146 + 117) - 122) + 16)) & (((58 ^ 116) ^ (85 ^ 21)) ^ (-" ".length())) : r0;
    }

    @Inject
    public g(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, a aVar) {
        this.z = squireBlueDragonKiller;
        this.A = squireBlueDragonKillerConfig;
        this.B = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        if (!llIlIIIlllIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llIlIIIlllIIll(chatMessage.getMessage().contains(lIIllllIIlIl[lIIllllIIllI[0]]) ? 1 : 0)) {
            Log.info(lIIllllIIlIl[lIIllllIIllI[1]]);
            this.z.a((boolean) lIIllllIIllI[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean v() {
        if (llIlIIIlllIllI(this.A.attackStyle(), c.MELEE)) {
            ?? r0 = lIIllllIIllI[1];
            "".length();
            return " ".length() >= ((108 ^ 122) ^ (132 ^ 150)) ? ((49 ^ 57) ^ (122 ^ 40)) & (((((21 + 58) - (-53)) + 76) ^ (((136 + 77) - 197) + 122)) ^ (-" ".length())) & ((((3 ^ 60) ^ (39 ^ 61)) & (((((38 + 105) - 55) + 68) ^ (((19 + 146) - 162) + 182)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
        }
        return lIIllllIIllI[0];
    }

    static {
        llIlIIIlllIIlI();
        llIlIIIlllIIIl();
    }

    private static void llIlIIIlllIIIl() {
        lIIllllIIlIl = new String[lIIllllIIllI[2]];
        lIIllllIIlIl[lIIllllIIllI[0]] = llIlIIIlllIIII("1wE+Mwtzq31swg/VMSrTVv05G8WfNZM9", "KcTWB");
        lIIllllIIlIl[lIIllllIIllI[1]] = llIlIIIlllIIII("CFcXWN4IbKWyP40wdHUGYN95ya9zTdDnmRC4X/Tp7eY=", "mCZHc");
    }

    private void w() {
        if (llIlIIIlllIIll(v() ? 1 : 0) && llIlIIIlllIIll(this.B.m() ? 1 : 0) && llIlIIIlllIlII(x() ? 1 : 0)) {
            Movement.walkTo(this.A.dragonLocation().q());
            "".length();
        }
        if (llIlIIIlllIlII(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        this.B.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean x() {
        if (llIlIIIlllIlll(Players.getLocal().getWorldLocation(), this.A.dragonLocation().q())) {
            ?? r0 = lIIllllIIllI[1];
            "".length();
            return (-" ".length()) > 0 ? ((((27 + 80) - 59) + 87) ^ (((107 + 49) - 136) + 117)) & (((187 ^ 128) ^ (72 ^ 125)) ^ (-" ".length())) : r0;
        }
        return lIIllllIIllI[0];
    }

    private static void llIlIIIlllIIlI() {
        lIIllllIIllI = new int[3];
        lIIllllIIllI[0] = (90 ^ 12) & ((146 ^ 196) ^ (-1));
        lIIllllIIllI[1] = " ".length();
        lIIllllIIllI[2] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public boolean run() {
        if (llIlIIIlllIIll(this.z.h() ? 1 : 0)) {
            return lIIllllIIllI[0];
        }
        if (llIlIIIlllIIll(this.z.b() ? 1 : 0)) {
            this.z.a((boolean) lIIllllIIllI[1]);
            return lIIllllIIllI[0];
        } else if (llIlIIIlllIIll(s() ? 1 : 0)) {
            return lIIllllIIllI[0];
        } else {
            w();
            return lIIllllIIllI[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean s() {
        if (llIlIIIlllIlII(t() ? 1 : 0) && llIlIIIlllIIll(this.z.c().isEmpty() ? 1 : 0) && llIlIIIlllIIll(this.B.n() ? 1 : 0) && llIlIIIlllIlIl(this.B.j()) && !llIlIIIlllIIll(u() ? 1 : 0)) {
            return lIIllllIIllI[0];
        }
        ?? r0 = lIIllllIIllI[1];
        "".length();
        return (-"  ".length()) >= 0 ? ((10 ^ 75) ^ (119 ^ 6)) & (((80 ^ 121) ^ (26 ^ 3)) ^ (-" ".length())) : r0;
    }

    private static boolean llIlIIIlllIlII(int i) {
        return i == 0;
    }

    private static boolean llIlIIIlllIIll(int i) {
        return i != 0;
    }

    private static boolean llIlIIIlllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }
}
