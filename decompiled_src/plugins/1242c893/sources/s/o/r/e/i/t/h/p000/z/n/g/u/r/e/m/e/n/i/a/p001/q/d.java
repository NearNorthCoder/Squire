package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Attack NPC", priority = 3, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.d  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/d.class */
public class d extends Task {
    private static /* synthetic */ int[] lIIIlIIIlIIll;
    private /* synthetic */ int E = lIIIlIIIlIIll[0];
    private final /* synthetic */ Client D;
    private final /* synthetic */ SquireNightmareZoneConfig C;
    private final /* synthetic */ SquireNightmareZone B;
    private static /* synthetic */ String[] lIIIlIIIlIIlI;

    private static boolean lIIllllIIlllIll(int i) {
        return i == 0;
    }

    private static String lIIllllIIllIlIl(String lllllllllllllllIIIlIIIIlIllIIIlI, String lllllllllllllllIIIlIIIIlIllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIIll[4]), "DES");
            Cipher lllllllllllllllIIIlIIIIlIllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIlIIIIlIllIIlII.init(lIIIlIIIlIIll[3], secretKeySpec);
            return new String(lllllllllllllllIIIlIIIIlIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIlIllIIIll) {
            lllllllllllllllIIIlIIIIlIllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIllllII(int i) {
        return i != 0;
    }

    private static void lIIllllIIllIllI() {
        lIIIlIIIlIIlI = new String[lIIIlIIIlIIll[3]];
        lIIIlIIIlIIlI[lIIIlIIIlIIll[0]] = lIIllllIIllIlIl("XPllzBr8XTq/Set72g8SKlIEuLcKTD3nngw36DtyS4Ep6n6zTpF8rRm/wlOymkU2XFIwm5EEyTMM015ZTP+dP7Mzt/D5GZMU", "byfCk");
        lIIIlIIIlIIlI[lIIIlIIIlIIll[1]] = lIIllllIIllIlIl("REcoHjW8YTI=", "MLswL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        if (lIIllllIIlllIll(this.D.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIIll[0];
        }
        if (lIIllllIIllllII(Players.getLocal().getInteracting() instanceof NPC ? 1 : 0)) {
            this.E = lIIIlIIIlIIll[0];
            return lIIIlIIIlIIll[0];
        }
        this.E += lIIIlIIIlIIll[1];
        if (lIIllllIIllllIl(this.E, lIIIlIIIlIIll[2])) {
            return lIIIlIIIlIIll[0];
        }
        NPC attackableNPC = Combat.getAttackableNPC(npc -> {
            if (lIIllllIIlllIll(npc.isDead() ? 1 : 0)) {
                ?? r0 = lIIIlIIIlIIll[1];
                "".length();
                return (104 ^ 108) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIlIIIlIIll[0];
        });
        if (lIIllllIIlllllI(attackableNPC)) {
            System.out.println(lIIIlIIIlIIlI[lIIIlIIIlIIll[0]]);
            return lIIIlIIIlIIll[0];
        }
        attackableNPC.interact(lIIIlIIIlIIlI[lIIIlIIIlIIll[1]]);
        return lIIIlIIIlIIll[1];
    }

    private static void lIIllllIIlllIlI() {
        lIIIlIIIlIIll = new int[5];
        lIIIlIIIlIIll[0] = (1 ^ 51) & ((51 ^ 1) ^ (-1));
        lIIIlIIIlIIll[1] = " ".length();
        lIIIlIIIlIIll[2] = (((40 + 71) - 79) + 116) ^ (((143 + 21) - 38) + 32);
        lIIIlIIIlIIll[3] = "  ".length();
        lIIIlIIIlIIll[4] = 77 ^ 69;
    }

    private static boolean lIIllllIIllllIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    public d(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.B = squireNightmareZone;
        this.C = squireNightmareZoneConfig;
        this.D = client;
    }

    private static boolean lIIllllIIlllllI(Object obj) {
        return obj == null;
    }

    static {
        lIIllllIIlllIlI();
        lIIllllIIllIllI();
    }
}
