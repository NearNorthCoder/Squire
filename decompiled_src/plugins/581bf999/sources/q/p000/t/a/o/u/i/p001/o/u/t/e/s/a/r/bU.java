package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving off poison", priority = 30)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bU  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bU.class */
public class bU extends bX {
    private static /* synthetic */ String[] lIlllllIIII;
    private static /* synthetic */ int[] lIlllllIIIl;

    private static void lIIllIlIlllllI() {
        lIlllllIIIl = new int[4];
        lIlllllIIIl[0] = (136 ^ 184) & ((59 ^ 11) ^ (-1));
        lIlllllIIIl[1] = "  ".length();
        lIlllllIIIl[2] = " ".length();
        lIlllllIIIl[3] = (((162 + 167) - 169) + 21) ^ (((168 + 132) - 112) + 1);
    }

    static {
        lIIllIlIlllllI();
        lIIllIlIllllII();
    }

    private static String lIIllIlIlllIll(String llllllllllllllllIlIIlIlIlIIllIII, String llllllllllllllllIlIIlIlIlIIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIlIIlIlll.getBytes(StandardCharsets.UTF_8)), lIlllllIIIl[3]), "DES");
            Cipher llllllllllllllllIlIIlIlIlIIllIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlIlIIllIlI.init(lIlllllIIIl[1], llllllllllllllllIlIIlIlIlIIllIll);
            return new String(llllllllllllllllIlIIlIlIlIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlIlIIllIIl) {
            llllllllllllllllIlIIlIlIlIIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIllIllIIIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIllIlIllllll(int i) {
        return i != 0;
    }

    private static void lIIllIlIllllII() {
        lIlllllIIII = new String[lIlllllIIIl[2]];
        lIlllllIIII[lIlllllIIIl[0]] = lIIllIlIlllIll("1NetXuJRryDqlO3mZH7zG3YoylzTQ/GBLKmRussUNoo=", "pFVeU");
    }

    @Inject
    protected bU(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bX
    public boolean bL() {
        Player local = Players.getLocal();
        Set set = (Set) cC().stream().map((v0) -> {
            return v0.getWorldLocation();
        }).collect(Collectors.toSet());
        if (!lIIllIlIllllll(set.isEmpty() ? 1 : 0) && !lIIllIlIllllll(set.stream().noneMatch(worldPoint -> {
            return worldPoint.equals(local.getWorldLocation());
        }) ? 1 : 0)) {
            Log.info(lIlllllIIII[lIlllllIIIl[0]]);
            WorldPoint worldPoint2 = (WorldPoint) local.getWorldArea().offset(lIlllllIIIl[1]).toWorldPointList().stream().filter(worldPoint3 -> {
                return set.stream().noneMatch(worldPoint3 -> {
                    return worldPoint3.equals(worldPoint3);
                });
            }).min(Comparator.comparingInt(worldPoint4 -> {
                return worldPoint4.distanceTo2D(local.getWorldLocation());
            })).orElse(null);
            if (lIIllIllIIIIII(worldPoint2)) {
                return lIlllllIIIl[0];
            }
            Movement.setDestination(b(local.getWorldLocation(), worldPoint2, worldPoint5 -> {
                if (lIIllIllIIIIIl(set.contains(worldPoint5) ? 1 : 0)) {
                    ?? r0 = lIlllllIIIl[2];
                    "".length();
                    return (7 ^ 3) > (83 ^ 87) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlllllIIIl[0];
            }));
            return lIlllllIIIl[2];
        }
        return lIlllllIIIl[0];
    }
}
