package l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;
@TaskDesc(name = "Attacking")
/* renamed from: l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.f  reason: invalid package */
/* loaded from: d3ba43e2-4966-4faf-8fcb-fba83fc95121.jar:l/-/-/n/s/s/i/e/r/q/p/o/c/o/t/u/r/e/t/f.class */
public class f extends Task {
    private static /* synthetic */ int[] lIIIlIlIIllII;
    private final /* synthetic */ a p;
    private static /* synthetic */ String[] lIIIlIlIIlIll;

    private Optional<NPC> r() {
        return NPCs.getAll().stream().filter(this::a).min(this::a);
    }

    @Inject
    public f(a aVar) {
        this.p = aVar;
    }

    private static void lIIllllllllIIII() {
        lIIIlIlIIlIll = new String[lIIIlIlIIllII[5]];
        lIIIlIlIIlIll[lIIIlIlIIllII[2]] = lIIlllllllIlllI("OD0YKTcS", "yIlHT");
        lIIIlIlIIlIll[lIIIlIlIIllII[1]] = lIIlllllllIllll("cwPGnS0O9GE=", "UUhKB");
    }

    private static boolean lIIllllllllIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIllllllllIIlI(int i) {
        return i != 0;
    }

    private static String lIIlllllllIllll(String lllllllllllllllIIIIlllIIlIIlIIll, String lllllllllllllllIIIIlllIIlIIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIIlIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIIlIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIIlIIlIlIl.init(lIIIlIlIIllII[5], lllllllllllllllIIIIlllIIlIIlIllI);
            return new String(lllllllllllllllIIIIlllIIlIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIIlIIlIlII) {
            lllllllllllllllIIIIlllIIlIIlIlII.printStackTrace();
            return null;
        }
    }

    private int a(NPC npc, NPC npc2) {
        return Integer.compare(e.valueOf(npc.getName().toUpperCase()).q(), e.valueOf(npc2.getName().toUpperCase()).q());
    }

    private static boolean lIIllllllllIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    public boolean run() {
        if (lIIllllllllIIlI(s() ? 1 : 0)) {
            return lIIIlIlIIllII[2];
        }
        Optional<NPC> r = r();
        if (lIIllllllllIIlI(r.isPresent() ? 1 : 0)) {
            b(r.get());
            "".length();
            if (" ".length() >= "  ".length()) {
                return ((72 ^ 49) ^ (89 ^ 52)) & (((4 ^ 53) ^ (156 ^ 185)) ^ (-" ".length()));
            }
        } else {
            this.p.i();
        }
        return lIIIlIlIIllII[1];
    }

    private static boolean lIIllllllllIlll(int i, int i2) {
        return i < i2;
    }

    private static String lIIlllllllIlllI(String lllllllllllllllIIIIlllIIlIIIIIll, String lllllllllllllllIIIIlllIIlIIIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlllIIlIIIIIlI.toCharArray();
        int lllllllllllllllIIIIlllIIIlllllll = lIIIlIlIIllII[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIlIIllII[2];
        while (lIIllllllllIlll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIIIlllIIIlllllll % charArray.length]));
            "".length();
            lllllllllllllllIIIIlllIIIlllllll++;
            i++;
            "".length();
            if ((111 ^ 107) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIllllllllIIIl();
        lIIllllllllIIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean s() {
        if (lIIllllllllIIlI(this.p.e() ? 1 : 0) && lIIllllllllIlIl(Players.getLocal().getInteracting()) && !lIIllllllllIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIlIlIIllII[2];
        }
        ?? r0 = lIIIlIlIIllII[1];
        "".length();
        return (-" ".length()) > 0 ? ((86 ^ 55) ^ (13 ^ 86)) & (((((222 + 144) - 268) + 153) ^ (((146 + 172) - 313) + 188)) ^ (-" ".length())) : r0;
    }

    private void b(NPC npc) {
        if (!lIIllllllllIllI(Reachable.isInteractable(npc) ? 1 : 0)) {
            if (lIIllllllllIllI(npc.isDead() ? 1 : 0)) {
                npc.interact(lIIIlIlIIlIll[lIIIlIlIIllII[1]]);
                return;
            }
            return;
        }
        Movement.walkTo(npc.getWorldLocation());
        "".length();
        "".length();
        if ((-" ".length()) == " ".length()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean a(NPC npc) {
        if (lIIllllllllIIlI(Arrays.stream(e.values()).anyMatch(eVar -> {
            return eVar.p().equals(npc.getName());
        }) ? 1 : 0) && lIIllllllllIIll(npc.getWorldLocation().distanceTo(Players.getLocal()), lIIIlIlIIllII[0])) {
            String[] strArr = new String[lIIIlIlIIllII[1]];
            strArr[lIIIlIlIIllII[2]] = lIIIlIlIIlIll[lIIIlIlIIllII[2]];
            if (lIIllllllllIIlI(npc.hasAction(strArr) ? 1 : 0)) {
                ?? r0 = lIIIlIlIIllII[1];
                "".length();
                return !((true ^ true) ^ (true ^ true)) ? ((102 ^ 34) ^ (94 ^ 13)) & (((((104 + 110) - 120) + 37) ^ (((48 + 6) - (-2)) + 92)) ^ (-" ".length())) : r0;
            }
        }
        return lIIIlIlIIllII[2];
    }

    private static boolean lIIllllllllIlII(Object obj) {
        return obj != null;
    }

    private static void lIIllllllllIIIl() {
        lIIIlIlIIllII = new int[6];
        lIIIlIlIIllII[0] = (((84 + 149) - 126) + 81) ^ (((27 + 145) - 95) + 102);
        lIIIlIlIIllII[1] = " ".length();
        lIIIlIlIIllII[2] = ((((0 + 131) - 61) + 89) ^ (((97 + 147) - 55) + 5)) & (((118 ^ 18) ^ (185 ^ 128)) ^ (-" ".length()));
        lIIIlIlIIllII[3] = (-(225 ^ 160)) & (-4743) & 15342;
        lIIIlIlIIllII[4] = -" ".length();
        lIIIlIlIIllII[5] = "  ".length();
    }

    private static boolean lIIllllllllIIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    private int b(int i, int i2, int i3) {
        CollisionMap collisionMap;
        if (lIIllllllllIIlI(Static.getGlobalCollisionMap() instanceof GlobalCollisionMap ? 1 : 0)) {
            collisionMap = Static.getGlobalCollisionMap();
            "".length();
            if (((((150 + 11) - 56) + 59) ^ (((77 + 2) - (-40)) + 41)) < (-" ".length())) {
                return ((237 ^ 128) ^ (135 ^ 161)) & (((((169 + 16) - 120) + 178) ^ (((176 + 136) - 164) + 36)) ^ (-" ".length()));
            }
        } else {
            collisionMap = null;
        }
        List find = new Pathfinder(new LocalCollisionMap((GlobalCollisionMap) collisionMap, (boolean) lIIIlIlIIllII[2]), Walker.buildTransportLinks(), List.of(Players.getLocal().getWorldLocation()), a.a(new RegionPoint(i, i2, i3, lIIIlIlIIllII[3])), RegionManager.avoidWilderness()).find();
        if (lIIllllllllIlII(find)) {
            int size = find.size();
            "".length();
            return " ".length() >= (150 ^ 146) ? (10 ^ 62) & ((64 ^ 116) ^ (-1)) : size;
        }
        return lIIIlIlIIllII[4];
    }
}
