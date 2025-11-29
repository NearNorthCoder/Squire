package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
@TaskDesc(name = "Walking to next tile", priority = 80)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.m  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/m.class */
public class m extends Task {
    private static /* synthetic */ String[] lIllIIIIllIII;
    private final /* synthetic */ SquireWoodcutterPlugin O;
    private static /* synthetic */ int[] lIllIIIIllIIl;
    private final /* synthetic */ SquireWoodcutterConfig P;

    private static String llIIIlIIIlllIII(String llllllllllllllIllIIllIIIlllIIIII, String llllllllllllllIllIIllIIIllIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIIllIlllll.getBytes(StandardCharsets.UTF_8)), lIllIIIIllIIl[2]), "DES");
            Cipher llllllllllllllIllIIllIIIlllIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIllIIIlllIIIlI.init(lIllIIIIllIIl[3], secretKeySpec);
            return new String(llllllllllllllIllIIllIIIlllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIIlllIIIIl) {
            llllllllllllllIllIIllIIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public m(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.O = squireWoodcutterPlugin;
        this.P = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIIllllIl(Object obj) {
        return obj == null;
    }

    private static void llIIIlIIIlllIlI() {
        lIllIIIIllIIl = new int[4];
        lIllIIIIllIIl[0] = ((208 ^ 166) ^ (155 ^ 184)) & (((49 ^ 105) ^ (34 ^ 47)) ^ (-" ".length()));
        lIllIIIIllIIl[1] = " ".length();
        lIllIIIIllIIl[2] = 206 ^ 198;
        lIllIIIIllIIl[3] = "  ".length();
    }

    private WorldPoint b(TileObject tileObject, i iVar) {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        return Walker.nearestWalkableTile(tileObject.getWorldLocation(), worldPoint -> {
            if (llIIIlIIIllllII(iVar.w().contains(worldPoint) ? 1 : 0) && llIIIlIIIlllllI(worldPoint.distanceTo(worldLocation), lIllIIIIllIIl[1]) && llIIIlIIIllllII(worldPoint.distanceTo(worldLocation))) {
                ?? r0 = lIllIIIIllIIl[1];
                "".length();
                return (((83 ^ 113) ^ (25 ^ 4)) & (((95 ^ 66) ^ (89 ^ 123)) ^ (-" ".length()))) != 0 ? ((((184 + 53) - 199) + 209) ^ (((133 + 137) - 139) + 50)) & (((((93 + 203) - 48) + 5) ^ (((8 + 4) - (-90)) + 89)) ^ (-" ".length())) : r0;
            }
            return lIllIIIIllIIl[0];
        });
    }

    private static boolean llIIIlIIIlllllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    public boolean run() {
        if (!llIIIlIIIlllIll(this.P.fastTickChop() ? 1 : 0) && !llIIIlIIIllllII(this.O.p() ? 1 : 0) && !llIIIlIIIllllII(Inventory.isFull() ? 1 : 0)) {
            if ((!llIIIlIIIllllII(this.P.pickUpNest() ? 1 : 0) || !llIIIlIIIllllII(this.O.a() ? 1 : 0)) && !llIIIlIIIlllIll(Movement.isRunEnabled() ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (llIIIlIIIllllII(tileObject.getName().equals(this.P.tree().r() + " tree") ? 1 : 0)) {
                        String[] strArr = new String[lIllIIIIllIIl[1]];
                        strArr[lIllIIIIllIIl[0]] = lIllIIIIllIII[lIllIIIIllIIl[0]];
                        if (llIIIlIIIllllII(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = lIllIIIIllIIl[1];
                            "".length();
                            return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIllIIIIllIIl[0];
                });
                if (llIIIlIIIllllIl(nearest)) {
                    return lIllIIIIllIIl[0];
                }
                i b = i.b(nearest);
                Player local = Players.getLocal();
                if (llIIIlIIIllllIl(b)) {
                    return lIllIIIIllIIl[0];
                }
                if (llIIIlIIIlllllI(local.distanceTo(nearest), this.O.m())) {
                    this.O.h();
                }
                if (llIIIlIIIllllII(local.isMoving() ? 1 : 0)) {
                    return lIllIIIIllIIl[0];
                }
                WorldPoint b2 = b(nearest, b);
                if (!llIIIlIIIllllIl(b2) && !llIIIlIIIllllII(b2.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.setDestination(b2);
                    sleep(lIllIIIIllIIl[1]);
                    return lIllIIIIllIIl[1];
                }
                return lIllIIIIllIIl[0];
            }
            return lIllIIIIllIIl[0];
        }
        return lIllIIIIllIIl[0];
    }

    private static boolean llIIIlIIIlllIll(int i) {
        return i == 0;
    }

    private static void llIIIlIIIlllIIl() {
        lIllIIIIllIII = new String[lIllIIIIllIIl[1]];
        lIllIIIIllIII[lIllIIIIllIIl[0]] = llIIIlIIIlllIII("eMqdmjA/m2cSOL/3g75o4A==", "CbZZY");
    }

    static {
        llIIIlIIIlllIlI();
        llIIIlIIIlllIIl();
    }

    private static boolean llIIIlIIIllllII(int i) {
        return i != 0;
    }
}
