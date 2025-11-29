package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking towards the next patch", priority = 50, blocking = true)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.u  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/u.class */
public class u extends r {
    private static /* synthetic */ int[] lIlIIIIIlIlII;
    private final /* synthetic */ Client ad;
    private static /* synthetic */ String[] lIlIIIIIlIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    public boolean run() {
        GameObject a = this.Z.a(tileObject -> {
            return lIlIIIIIlIlII[1];
        });
        if (!lIllIllIlllIllI(a) && !lIllIllIlllIlll(a instanceof GameObject ? 1 : 0)) {
            GameObject gameObject = a;
            Player local = Players.getLocal();
            if (lIllIllIllllIII(gameObject.getWorldArea().isInMeleeDistance(local.getWorldArea()) ? 1 : 0)) {
                return lIlIIIIIlIlII[0];
            }
            int[] iArr = new int[lIlIIIIIlIlII[1]];
            iArr[lIlIIIIIlIlII[0]] = lIlIIIIIlIlII[2];
            if (lIllIllIllllIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIIIlIlII[1]];
                iArr2[lIlIIIIIlIlII[0]] = lIlIIIIIlIlII[2];
                Inventory.getFirst(iArr2).interact(lIlIIIIIlIIlI[lIlIIIIIlIlII[0]]);
                return lIlIIIIIlIlII[1];
            } else if (lIllIllIllllIII(Inventory.contains(item -> {
                return item.getName().toLowerCase().contains(lIlIIIIIlIIlI[lIlIIIIIlIlII[4]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item2 -> {
                    return item2.getName().toLowerCase().contains(lIlIIIIIlIIlI[lIlIIIIIlIlII[3]]);
                }).interact(lIlIIIIIlIIlI[lIlIIIIIlIlII[1]]);
                return lIlIIIIIlIlII[1];
            } else {
                if (lIllIllIlllIlll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIllIllIllllIII(Movement.isWalking() ? 1 : 0)) {
                    WorldPoint destination = Movement.getDestination();
                    if (lIllIllIllllIIl(destination) && lIllIllIllllIII(gameObject.getWorldArea().isInMeleeDistance(destination) ? 1 : 0) && lIllIllIllllIlI(destination.distanceToPath(this.ad, local.getWorldLocation()), lIlIIIIIlIlII[1])) {
                        return lIlIIIIIlIlII[0];
                    }
                }
                GameObject a2 = this.Z.a(tileObject2 -> {
                    return lIlIIIIIlIlII[1];
                }, lIlIIIIIlIlII[3]);
                GameObject a3 = this.Z.a(tileObject3 -> {
                    return lIlIIIIIlIlII[1];
                }, lIlIIIIIlIlII[4]);
                if (!lIllIllIllllIIl(a2) || lIllIllIlllIllI(a3)) {
                    return lIlIIIIIlIlII[0];
                }
                WorldPoint worldPoint = (WorldPoint) gameObject.getWorldArea().toWorldPointList().stream().flatMap(worldPoint2 -> {
                    if (!lIllIllIllllIll(this.Z.r(), g.PATCH_13_SOUTH)) {
                        WorldPoint[] worldPointArr = new WorldPoint[lIlIIIIIlIlII[3]];
                        worldPointArr[lIlIIIIIlIlII[0]] = worldPoint2.dx(lIlIIIIIlIlII[5]);
                        worldPointArr[lIlIIIIIlIlII[1]] = worldPoint2.dx(lIlIIIIIlIlII[1]);
                        return Stream.of((Object[]) worldPointArr);
                    }
                    Stream of = Stream.of(worldPoint2.dy(lIlIIIIIlIlII[1]));
                    "".length();
                    if ("  ".length() <= 0) {
                        return null;
                    }
                    return of;
                }).filter(worldPoint3 -> {
                    if (lIllIllIlllIlll(gameObject.getWorldArea().contains(worldPoint3) ? 1 : 0) && lIllIllIlllIlll(a2.getWorldArea().contains(worldPoint3) ? 1 : 0) && lIllIllIlllIlll(a3.getWorldArea().contains(worldPoint3) ? 1 : 0)) {
                        ?? r0 = lIlIIIIIlIlII[1];
                        "".length();
                        return " ".length() < ((41 ^ 8) & ((40 ^ 9) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIIIIlIlII[0];
                }).filter(worldPoint4 -> {
                    return gameObject.getWorldArea().isInMeleeDistance(worldPoint4);
                }).min(Comparator.comparingDouble(obj -> {
                    return ((WorldPoint) obj).distanceToPath(this.ad, a2.getWorldArea().getCenter());
                }).thenComparing(obj2 -> {
                    return Float.valueOf(((WorldPoint) obj2).distanceTo2DHypotenuse(a3.getWorldArea().getCenter()));
                })).orElse(null);
                if (lIllIllIlllIllI(worldPoint)) {
                    return lIlIIIIIlIlII[0];
                }
                Movement.setDestination(worldPoint);
                return lIlIIIIIlIlII[1];
            }
        }
        return lIlIIIIIlIlII[0];
    }

    private static String lIllIllIlllIIIl(String llllllllllllllIlllIIlIIIIlllIlII, String llllllllllllllIlllIIlIIIIlllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIlIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIIIlllIlIl) {
            llllllllllllllIlllIIlIIIIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlllIlll(int i) {
        return i == 0;
    }

    private static void lIllIllIlllIlIl() {
        lIlIIIIIlIlII = new int[8];
        lIlIIIIIlIlII[0] = (179 ^ 134) & ((240 ^ 197) ^ (-1));
        lIlIIIIIlIlII[1] = " ".length();
        lIlIIIIIlIlII[2] = (-((-30039) & 30551)) & (-16530) & 30461;
        lIlIIIIIlIlII[3] = "  ".length();
        lIlIIIIIlIlII[4] = "   ".length();
        lIlIIIIIlIlII[5] = -" ".length();
        lIlIIIIIlIlII[6] = 162 ^ 166;
        lIlIIIIIlIlII[7] = 143 ^ 135;
    }

    private static boolean lIllIllIllllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIllIllllIII(int i) {
        return i != 0;
    }

    private static boolean lIllIllIllllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIllIlllIIlI(String llllllllllllllIlllIIlIIIIllIIlIl, String llllllllllllllIlllIIlIIIIllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIIllIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlII[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIlIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIIIllIlIII) {
            llllllllllllllIlllIIlIIIIllIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    protected u(i iVar, Client client) {
        super(iVar);
        this.ad = client;
    }

    private static boolean lIllIllIllllIlI(int i, int i2) {
        return i <= i2;
    }

    private static void lIllIllIlllIIll() {
        lIlIIIIIlIIlI = new String[lIlIIIIIlIlII[6]];
        lIlIIIIIlIIlI[lIlIIIIIlIlII[0]] = lIllIllIlllIIIl("j12r31JxNOI=", "rJbdi");
        lIlIIIIIlIIlI[lIlIIIIIlIlII[1]] = lIllIllIlllIIlI("JC8hwJEkWWg=", "DZWYC");
        lIlIIIIIlIIlI[lIlIIIIIlIlII[3]] = lIllIllIlllIIIl("U4RD6eFHXGmyDr/bvWiNeg==", "YaDUl");
        lIlIIIIIlIIlI[lIlIIIIIlIlII[4]] = lIllIllIlllIIlI("j9y9W36M5eRtn0qAUTjLnw==", "rbkEI");
    }

    static {
        lIllIllIlllIlIl();
        lIllIllIlllIIll();
    }

    private static boolean lIllIllIlllIllI(Object obj) {
        return obj == null;
    }
}
