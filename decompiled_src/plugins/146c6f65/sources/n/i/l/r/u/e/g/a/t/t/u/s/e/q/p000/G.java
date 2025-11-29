package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "Attacking Demiboss", priority = 3, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.G  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/G.class */
public class G extends AbstractC0013n {
    private static /* synthetic */ int[] llIIlIllllII;
    private static /* synthetic */ String[] llIIlIlllIll;
    private final /* synthetic */ C0001b bT;

    private static boolean llllllIIIIllll(int i) {
        return i != 0;
    }

    private static boolean llllllIIIlIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllllIIIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean llllllIIIlIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public G(C0001b c0001b, C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlIllllII[0]];
        enumC0003dArr[llIIlIllllII[1]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        this.bT = c0001b;
    }

    private static String llllllIIIIlIlI(String lllllllllllllllIlIIllIIIIIllIIII, String lllllllllllllllIlIIllIIIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIIIIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIIIIIllIIlI.init(llIIlIllllII[3], lllllllllllllllIlIIllIIIIIllIIll);
            return new String(lllllllllllllllIlIIllIIIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIIIllIIIl) {
            lllllllllllllllIlIIllIIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIlIIIl(int i) {
        return i == 0;
    }

    private static void llllllIIIIllII() {
        llIIlIllllII = new int[8];
        llIIlIllllII[0] = " ".length();
        llIIlIllllII[1] = (56 ^ 7) & ((2 ^ 61) ^ (-1));
        llIIlIllllII[2] = (222 ^ 162) ^ (235 ^ 155);
        llIIlIllllII[3] = "  ".length();
        llIIlIllllII[4] = "   ".length();
        llIIlIllllII[5] = (149 ^ 135) ^ (125 ^ 107);
        llIIlIllllII[6] = (((9 + 29) - 12) + 110) ^ (((98 + 126) - 193) + 110);
        llIIlIllllII[7] = 117 ^ 125;
    }

    private static boolean llllllIIIlIlII(int i, int i2) {
        return i < i2;
    }

    private static void llllllIIIIlIll() {
        llIIlIlllIll = new String[llIIlIllllII[6]];
        llIIlIlllIll[llIIlIllllII[1]] = llllllIIIIlIII("w6G88Z6d7vzLdTICdeE3ptfjqFD5tJqUt5buKk2TBYYQeyJaI0x76GzOSsZK445m", "DXVnV");
        llIIlIlllIll[llIIlIllllII[0]] = llllllIIIIlIIl("EjUNLy0sM1kzK2IgGDUjJyBZKTQheFkzJTAzHDNkMDsWKmQrJ1khKzc6HWdpYi8E", "BTyGD");
        llIIlIlllIll[llIIlIllllII[3]] = llllllIIIIlIIl("MQxRMQ5GBxk3Sw8HAiYZBwoCKgUBSQEqHw5JFy0SEgEfLQxKSRc3HwcKHSoFAUkYMwhI", "fivCk");
        llIIlIlllIll[llIIlIllllII[4]] = llllllIIIIlIII("r4+c+Q5mLrQ=", "ELdVy");
        llIIlIlllIll[llIIlIllllII[5]] = llllllIIIIlIlI("Xr5DdWKMC46o7lm5CEVSQCe4Pm9ePewjomT3Xwso+hdbDzv0pACiTw==", "ENCub");
    }

    private static boolean llllllIIIlIIII(int i, int i2) {
        return i > i2;
    }

    static {
        llllllIIIIllII();
        llllllIIIIlIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (llllllIIIIllIl(local)) {
            return llIIlIllllII[1];
        }
        EnumC0006g J = this.ba.J();
        if (!llllllIIIIllIl(J) && !llllllIIIIlllI(Inventory.getCount((boolean) llIIlIllllII[0], J.an().aB()))) {
            NPC nearest = NPCs.getNearest(J.ah());
            if (llllllIIIIllIl(nearest)) {
                nearest = NPCs.getNearest(npc -> {
                    if (!llllllIIIlIIIl(EnumC0006g.DRAGON.f(npc) ? 1 : 0) || llllllIIIIllll(EnumC0006g.DARK_BEAST.f(npc) ? 1 : 0)) {
                        ?? r0 = llIIlIllllII[0];
                        "".length();
                        return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlIllllII[1];
                });
                if (llllllIIIIllIl(nearest)) {
                    return llIIlIllllII[1];
                }
            }
            if (llllllIIIIllll(nearest.isDead() ? 1 : 0)) {
                return llIIlIllllII[0];
            }
            if (llllllIIIlIIII(nearest.distanceTo(local), llIIlIllllII[2])) {
                C0007h V = this.ba.V();
                if (llllllIIIIllIl(V.d(nearest.getWorldLocation()))) {
                    NPC npc2 = nearest;
                    C0011l orElse = V.b(c0011l -> {
                        if (llllllIIIIllll(c0011l.aY() ? 1 : 0) && llllllIIIlIlII(c0011l.aW().distanceTo(npc2.getWorldLocation()), npc2.getWorldLocation().distanceTo(local))) {
                            ?? r0 = llIIlIllllII[0];
                            "".length();
                            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlIllllII[1];
                    }).stream().min(Comparator.comparingInt(c0011l2 -> {
                        return c0011l2.aW().distanceTo(local);
                    })).orElse(null);
                    if (llllllIIIIllIl(orElse)) {
                        return llIIlIllllII[1];
                    }
                    String str = llIIlIlllIll[llIIlIllllII[1]];
                    Object[] objArr = new Object[llIIlIllllII[0]];
                    objArr[llIIlIllllII[1]] = Integer.valueOf(nearest.distanceTo(local));
                    Log.info(str, objArr);
                    this.ba.a(orElse, Players.getLocal().getWorldLocation());
                    "".length();
                    "".length();
                    if ((-((((121 + 73) - 134) + 98) ^ (((133 + 135) - 127) + 14))) >= 0) {
                        return ((56 ^ 5) ^ (78 ^ 118)) & (((((84 + 123) - 76) + 18) ^ (((3 + 49) - 3) + 95)) ^ (-" ".length()));
                    }
                } else {
                    String str2 = llIIlIlllIll[llIIlIllllII[0]];
                    Object[] objArr2 = new Object[llIIlIllllII[0]];
                    objArr2[llIIlIllllII[1]] = Integer.valueOf(nearest.distanceTo(local));
                    Log.info(str2, objArr2);
                    this.ba.a(V.d(nearest.getWorldLocation()), Players.getLocal().getWorldLocation());
                    "".length();
                }
                return llIIlIllllII[0];
            }
            Actor interacting = local.getInteracting();
            if (llllllIIIIllIl(interacting) && llllllIIIlIIIl(this.bT.p() ? 1 : 0)) {
                Log.info(llIIlIlllIll[llIIlIllllII[3]]);
                nearest.interact(llIIlIlllIll[llIIlIllllII[4]]);
                this.bT.c(llIIlIllllII[5]);
                return llIIlIllllII[0];
            }
            if (llllllIIIlIIlI(interacting, nearest)) {
                WorldPoint worldPoint = null;
                int i = Integer.MIN_VALUE;
                for (WorldPoint worldPoint2 : this.ba.V().d(interacting.getWorldLocation()).aR().toWorldPointList()) {
                    int distanceTo = worldPoint2.distanceTo(this.ba.V().aq().aQ());
                    if (llllllIIIlIIII(distanceTo, i) && llllllIIIlIIIl(Reachable.isObstacle(worldPoint2) ? 1 : 0) && llllllIIIIllll(worldPoint2.toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), interacting.getWorldArea()) ? 1 : 0)) {
                        i = distanceTo;
                        worldPoint = worldPoint2;
                    }
                    "".length();
                    if ("   ".length() >= ((((75 + 139) - 195) + 157) ^ (((44 + 144) - 103) + 95))) {
                        return ((49 ^ 44) ^ (19 ^ 68)) & (((((105 + 87) - 49) + 0) ^ (((81 + 181) - 140) + 75)) ^ (-" ".length()));
                    }
                }
                if (llllllIIIlIIll(worldPoint) && llllllIIIlIIII(local.getWorldLocation().distanceTo(worldPoint), llIIlIllllII[4])) {
                    Log.info(llIIlIlllIll[llIIlIllllII[5]]);
                    ScenePoint fromWorld = ScenePoint.fromWorld(worldPoint);
                    Movement.setDestination(fromWorld.getX(), fromWorld.getY());
                    this.bT.e(Rand.nextInt(llIIlIllllII[3], llIIlIllllII[5]));
                }
            }
            return llIIlIllllII[0];
        }
        return llIIlIllllII[1];
    }

    private static String llllllIIIIlIII(String lllllllllllllllIlIIllIIIIIllllIl, String lllllllllllllllIlIIllIIIIIllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIIIllllII.getBytes(StandardCharsets.UTF_8)), llIIlIllllII[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIllllII[3], lllllllllllllllIlIIllIIIIlIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIIIlllllI) {
            lllllllllllllllIlIIllIIIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIIlllI(int i) {
        return i > 0;
    }

    private static String llllllIIIIlIIl(String lllllllllllllllIlIIllIIIIlIIllIl, String lllllllllllllllIlIIllIIIIlIlIIIl) {
        String lllllllllllllllIlIIllIIIIlIIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIIIlIlIIII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllIIIIlIlIIIl.toCharArray();
        int lllllllllllllllIlIIllIIIIlIIlllI = llIIlIllllII[1];
        char[] charArray2 = lllllllllllllllIlIIllIIIIlIIllIl2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIllllII[1];
        while (llllllIIIlIlII(i, length)) {
            char lllllllllllllllIlIIllIIIIlIlIIll = charArray2[i];
            lllllllllllllllIlIIllIIIIlIlIIII.append((char) (lllllllllllllllIlIIllIIIIlIlIIll ^ charArray[lllllllllllllllIlIIllIIIIlIIlllI % charArray.length]));
            "".length();
            lllllllllllllllIlIIllIIIIlIIlllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIllIIIIlIlIIII);
    }
}
