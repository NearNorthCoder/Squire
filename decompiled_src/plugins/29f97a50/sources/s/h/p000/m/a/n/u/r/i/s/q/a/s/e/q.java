package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Moving to safespot", priority = 70, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.q  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/q.class */
public class q extends Task {
    private final /* synthetic */ SquireShamanConfig af;
    private static /* synthetic */ String[] lIIlIlllIlIIl;
    /* synthetic */ NPC ah;
    private final /* synthetic */ c ae;
    private static /* synthetic */ int[] lIIlIlllIlIlI;
    private final /* synthetic */ C0000a ag;
    private static final /* synthetic */ Logger ad;

    private static boolean lIlIllIlllIIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllIllIllIll(String llllllllllllllIllllIlIIIlIIllllI, String llllllllllllllIllllIlIIIlIIlllIl) {
        String llllllllllllllIllllIlIIIlIIllllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlIIIlIIlllIl.toCharArray();
        int llllllllllllllIllllIlIIIlIIllIlI = lIIlIlllIlIlI[0];
        char[] charArray2 = llllllllllllllIllllIlIIIlIIllllI2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlllIlIlI[0];
        while (lIlIllIlllIIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllllIlIIIlIIllIlI % charArray.length]));
            "".length();
            llllllllllllllIllllIlIIIlIIllIlI++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIllIllIlllIl() {
        lIIlIlllIlIlI = new int[3];
        lIIlIlllIlIlI[0] = ((73 ^ 61) ^ (28 ^ 35)) & (((57 ^ 29) ^ (194 ^ 173)) ^ (-" ".length()));
        lIIlIlllIlIlI[1] = (-1037) & 8188;
        lIIlIlllIlIlI[2] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    public boolean run() {
        if (!lIlIllIllIllllI(this.ae.s() ? 1 : 0) && !lIlIllIllIlllll(Players.getLocal().isMoving() ? 1 : 0) && !lIlIllIllIlllll(this.ag.m() ? 1 : 0)) {
            NPC o = this.ae.o();
            if (lIlIllIlllIIIII(o)) {
                this.ah = o;
            }
            if (!lIlIllIlllIIIIl(this.ah) && !lIlIllIlllIIIlI(this.ah.getAnimation(), lIIlIlllIlIlI[1])) {
                g room = this.af.room();
                Stream<WorldPoint> stream = room.z().stream();
                c cVar = this.ae;
                Objects.requireNonNull(cVar);
                "".length();
                WorldPoint orElse = stream.filter(this::a).filter(worldPoint -> {
                    if (lIlIllIllIllllI(this.ae.p().contains(worldPoint) ? 1 : 0)) {
                        ?? r0 = lIIlIlllIlIlI[2];
                        "".length();
                        return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlllIlIlI[0];
                }).filter(worldPoint2 -> {
                    String[] strArr = new String[lIIlIlllIlIlI[2]];
                    strArr[lIIlIlllIlIlI[0]] = lIIlIlllIlIIl[lIIlIlllIlIlI[0]];
                    return NPCs.getAll(strArr).stream().filter(npc -> {
                        return room.x().contains(npc);
                    }).noneMatch(npc2 -> {
                        return npc2.getWorldArea().contains(worldPoint2);
                    });
                }).max(Comparator.comparingInt(worldPoint3 -> {
                    return worldPoint3.distanceTo(Players.getLocal().getWorldLocation());
                })).orElse(null);
                if (!lIlIllIlllIIIII(orElse) || lIlIllIllIlllll(Players.getLocal().getWorldLocation().equals(orElse) ? 1 : 0)) {
                    return lIIlIlllIlIlI[0];
                }
                this.ah = null;
                Movement.walk(orElse);
                return lIIlIlllIlIlI[2];
            }
            return lIIlIlllIlIlI[0];
        }
        return lIIlIlllIlIlI[0];
    }

    private static boolean lIlIllIlllIIIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIllIlllIIIIl(Object obj) {
        return obj == null;
    }

    private static void lIlIllIllIlllII() {
        lIIlIlllIlIIl = new String[lIIlIlllIlIlI[2]];
        lIIlIlllIlIIl[lIIlIlllIlIlI[0]] = lIlIllIllIllIll("Gw49OBczCiY3RSQPJjQEOQ==", "WgGYe");
    }

    static {
        lIlIllIllIlllIl();
        lIlIllIllIlllII();
        ad = LoggerFactory.getLogger(q.class);
    }

    private static boolean lIlIllIllIlllll(int i) {
        return i != 0;
    }

    private static boolean lIlIllIlllIIIII(Object obj) {
        return obj != null;
    }

    @Inject
    public q(c cVar, SquireShamanConfig squireShamanConfig, C0000a c0000a) {
        this.ae = cVar;
        this.af = squireShamanConfig;
        this.ag = c0000a;
    }

    private static boolean lIlIllIllIllllI(int i) {
        return i == 0;
    }
}
