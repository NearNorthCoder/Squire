package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving away from Shaman", priority = 55, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.u  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/u.class */
public class u extends Task {
    private final /* synthetic */ SquireShamanConfig as;
    private final /* synthetic */ C0000a ar;
    private static /* synthetic */ int[] lIIllIIIIlllI;
    private final /* synthetic */ c aq;
    private static /* synthetic */ String[] lIIllIIIIlIll;

    private static boolean lIlIlllIllIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllIlllIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlllIllIlllI(Object obj) {
        return obj != null;
    }

    private static String lIlIlllIllIIlll(String llllllllllllllIllllIIlIIlIlIIIII, String llllllllllllllIllllIIlIIlIIlllll) {
        String llllllllllllllIllllIIlIIlIlIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIlIIlIIlllll.toCharArray();
        int llllllllllllllIllllIIlIIlIIlIlll = lIIllIIIIlllI[0];
        char[] charArray2 = llllllllllllllIllllIIlIIlIlIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIIlllI[0];
        while (lIlIlllIlllIlII(i, length)) {
            char llllllllllllllIllllIIlIIlIlIIIIl = charArray2[i];
            sb.append((char) (llllllllllllllIllllIIlIIlIlIIIIl ^ charArray[llllllllllllllIllllIIlIIlIIlIlll % charArray.length]));
            "".length();
            llllllllllllllIllllIIlIIlIIlIlll++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllIllIllIl(int i) {
        return i == 0;
    }

    static {
        lIlIlllIllIlIll();
        lIlIlllIllIlIlI();
    }

    private static boolean lIlIlllIllIllII(int i) {
        return i != 0;
    }

    @Inject
    public u(c cVar, C0000a c0000a, SquireShamanConfig squireShamanConfig) {
        this.aq = cVar;
        this.ar = c0000a;
        this.as = squireShamanConfig;
    }

    private static void lIlIlllIllIlIll() {
        lIIllIIIIlllI = new int[6];
        lIIllIIIIlllI[0] = ((((140 + 23) - 143) + 161) ^ (((134 + 90) - 178) + 104)) & (((114 ^ 1) ^ (33 ^ 113)) ^ (-" ".length()));
        lIIllIIIIlllI[1] = "  ".length();
        lIIllIIIIlllI[2] = " ".length();
        lIIllIIIIlllI[3] = "   ".length();
        lIIllIIIIlllI[4] = 37 ^ 33;
        lIIllIIIIlllI[5] = 137 ^ 129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    public boolean run() {
        List all = NPCs.getAll(npc -> {
            return npc.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[3]]);
        });
        if (!lIlIlllIllIllII(this.aq.s() ? 1 : 0) || lIlIlllIllIllIl(all.isEmpty() ? 1 : 0)) {
            return lIIllIIIIlllI[0];
        }
        if (lIlIlllIllIllII(this.ar.m() ? 1 : 0)) {
            return lIIllIIIIlllI[0];
        }
        Player local = Players.getLocal();
        TileItem orElse = this.ar.k().orElse(null);
        NPC attackableNPC = Combat.getAttackableNPC(npc2 -> {
            if (lIlIlllIllIllII(this.as.room().x().contains(npc2.getWorldLocation()) ? 1 : 0) && lIlIlllIllIllII(npc2.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[1]]) ? 1 : 0)) {
                ?? r0 = lIIllIIIIlllI[2];
                "".length();
                return "  ".length() == 0 ? ((54 ^ 107) ^ (81 ^ 5)) & (((127 ^ 97) ^ (158 ^ 137)) ^ (-" ".length())) : r0;
            }
            return lIIllIIIIlllI[0];
        });
        if (lIlIlllIllIlllI(orElse)) {
            attackableNPC = Combat.getAttackableNPC(npc3 -> {
                if (lIlIlllIllIllII(this.as.room().x().contains(npc3.getWorldLocation()) ? 1 : 0) && lIlIlllIllIllII(npc3.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[2]]) ? 1 : 0) && lIlIlllIlllIIIl(npc3.getInteracting(), local)) {
                    ?? r0 = lIIllIIIIlllI[2];
                    "".length();
                    return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                }
                return lIIllIIIIlllI[0];
            });
        }
        if (!lIlIlllIllIllll(attackableNPC) && !lIlIlllIlllIIII(attackableNPC.distanceTo(Players.getLocal()), lIIllIIIIlllI[1])) {
            Stream<WorldPoint> stream = this.as.room().z().stream();
            c cVar = this.aq;
            Objects.requireNonNull(cVar);
            "".length();
            WorldPoint orElse2 = stream.filter(this::a).filter(worldPoint -> {
                String[] strArr = new String[lIIllIIIIlllI[2]];
                strArr[lIIllIIIIlllI[0]] = lIIllIIIIlIll[lIIllIIIIlllI[0]];
                if (lIlIlllIlllIIII(worldPoint.distanceTo(NPCs.getNearest(worldPoint, strArr)), lIIllIIIIlllI[1])) {
                    ?? r0 = lIIllIIIIlllI[2];
                    "".length();
                    return (92 ^ 88) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIllIIIIlllI[0];
            }).min(Comparator.comparingInt(worldPoint2 -> {
                return worldPoint2.distanceTo(Players.getLocal().getWorldLocation());
            })).orElse(null);
            if (lIlIlllIllIllll(orElse2)) {
                return lIIllIIIIlllI[0];
            }
            Movement.walkTo(orElse2, (boolean) lIIllIIIIlllI[0]);
            "".length();
            return lIIllIIIIlllI[2];
        }
        return lIIllIIIIlllI[0];
    }

    private static String lIlIlllIllIIIll(String llllllllllllllIllllIIlIIlIllIIII, String llllllllllllllIllllIIlIIlIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIIlIlIllIl.getBytes(StandardCharsets.UTF_8)), lIIllIIIIlllI[5]), "DES");
            Cipher llllllllllllllIllllIIlIIlIllIIlI = Cipher.getInstance("DES");
            llllllllllllllIllllIIlIIlIllIIlI.init(lIIllIIIIlllI[1], secretKeySpec);
            return new String(llllllllllllllIllllIIlIIlIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlIIlIllIIIl) {
            llllllllllllllIllllIIlIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlllIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIlllIllIlIlI() {
        lIIllIIIIlIll = new String[lIIllIIIIlllI[4]];
        lIIllIIIIlIll[lIIllIIIIlllI[0]] = lIlIlllIllIIIll("L3BmO3tBKCPZkhW53sNI4quVHYsBPw5A", "BYgGW");
        lIIllIIIIlIll[lIIllIIIIlllI[2]] = lIlIlllIllIIlll("OS49AAURKiYPVwYvJgwWGw==", "uGGaw");
        lIIllIIIIlIll[lIIllIIIIlllI[1]] = lIlIlllIllIIlll("GTsSEyYxPwkcdCY6CR81Ow==", "URhrT");
        lIIllIIIIlIll[lIIllIIIIlllI[3]] = lIlIlllIllIIlll("JQE7FQ0=", "vqZbc");
    }

    private static boolean lIlIlllIlllIIII(int i, int i2) {
        return i > i2;
    }
}
