package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Chopping (fast)", priority = 75, register = true)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.k  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/k.class */
public class k extends Task {
    private static /* synthetic */ int[] lIllIIIIIlIlI;
    private static /* synthetic */ String[] lIllIIIIIlIIl;
    private final /* synthetic */ SquireWoodcutterConfig K;
    private final /* synthetic */ SquireWoodcutterPlugin L;

    static {
        llIIIlIIIIIIIII();
        llIIIIlllllllll();
    }

    private static boolean llIIIlIIIIIIIlI(int i) {
        return i != 0;
    }

    private static String llIIIIllllllllI(String llllllllllllllIllIIllIlIlIIIlIlI, String llllllllllllllIllIIllIlIlIIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIllIlIlIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIIlIlI[7]), "DES");
            Cipher llllllllllllllIllIIllIlIlIIIllII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIlIlIIIllII.init(lIllIIIIIlIlI[4], llllllllllllllIllIIllIlIlIIIllIl);
            return new String(llllllllllllllIllIIllIlIlIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIlIlIIIlIll) {
            llllllllllllllIllIIllIlIlIIIlIll.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlllllllll() {
        lIllIIIIIlIIl = new String[lIllIIIIIlIlI[6]];
        lIllIIIIIlIIl[lIllIIIIIlIlI[0]] = llIIIIlllllllIl("6OS4mfOMS5ocwr2qSZgKrg==", "FcqGv");
        lIllIIIIIlIIl[lIllIIIIIlIlI[2]] = llIIIIllllllllI("tGYIXPfZ+o+ytVfYz68SkeWFEhhr2S8sKi3lrs48N7SWOsafaaI3Hw==", "bUyhJ");
        lIllIIIIIlIIl[lIllIIIIIlIlI[4]] = llIIIIllllllllI("7e7a5BZUh3O+oRDoQN9vkg==", "dHHNB");
        lIllIIIIIlIIl[lIllIIIIIlIlI[5]] = llIIIIllllllllI("4Eraqo6VJzPcK5EidrPKBw==", "EiPgH");
        lIllIIIIIlIIl[lIllIIIIIlIlI[1]] = llIIIIlllllllIl("1DkIAxjkdFqnw5TA5Qpv9g==", "ctHKx");
    }

    private static void llIIIlIIIIIIIII() {
        lIllIIIIIlIlI = new int[8];
        lIllIIIIIlIlI[0] = (147 ^ 153) & ((122 ^ 112) ^ (-1));
        lIllIIIIIlIlI[1] = 164 ^ 160;
        lIllIIIIIlIlI[2] = " ".length();
        lIllIIIIIlIlI[3] = (85 ^ 64) ^ (62 ^ 39);
        lIllIIIIIlIlI[4] = "  ".length();
        lIllIIIIIlIlI[5] = "   ".length();
        lIllIIIIIlIlI[6] = 150 ^ 147;
        lIllIIIIIlIlI[7] = (((85 + 76) - 146) + 135) ^ (((31 + 66) - 41) + 102);
    }

    @Inject
    public k(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.L = squireWoodcutterPlugin;
        this.K = squireWoodcutterConfig;
    }

    private static String llIIIIlllllllIl(String llllllllllllllIllIIllIlIIlllllIl, String llllllllllllllIllIIllIlIIlllllII) {
        try {
            SecretKeySpec llllllllllllllIllIIllIlIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIlIIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIlIIlllllll.init(lIllIIIIIlIlI[4], llllllllllllllIllIIllIlIlIIIIIII);
            return new String(llllllllllllllIllIIllIlIIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIlIIllllllI) {
            llllllllllllllIllIIllIlIIllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIIIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIlIIIIIIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIlIIIIIIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIlIIIIIIlII(Object obj) {
        return obj == null;
    }

    private static boolean llIIIlIIIIIIlIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    public boolean run() {
        if (llIIIlIIIIIIIIl(this.K.fastTickChop() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (!llIIIlIIIIIIIIl(Bank.isOpen() ? 1 : 0) || llIIIlIIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (llIIIlIIIIIIIlI(this.L.p() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (!llIIIlIIIIIIIll(Movement.getRunEnergy(), lIllIIIIIlIlI[1]) || llIIIlIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        Player local = Players.getLocal();
        if (llIIIlIIIIIIlII(local)) {
            return lIllIIIIIlIlI[0];
        }
        WorldPoint worldLocation = local.getWorldLocation();
        WorldArea[] worldAreaArr = new WorldArea[lIllIIIIIlIlI[2]];
        worldAreaArr[lIllIIIIIlIlI[0]] = this.L.j();
        if (llIIIlIIIIIIIlI(worldLocation.isInArea(worldAreaArr) ? 1 : 0) && llIIIlIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIIIlIIIIIIIlI(tileObject.getName().equals(this.K.tree().r() + " tree") ? 1 : 0)) {
                String[] strArr = new String[lIllIIIIIlIlI[2]];
                strArr[lIllIIIIIlIlI[0]] = lIllIIIIIlIIl[lIllIIIIIlIlI[1]];
                if (llIIIlIIIIIIIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIIIIlIlI[2];
                    "".length();
                    return (-((3 ^ 84) ^ (62 ^ 109))) >= 0 ? ((((156 + 13) - 92) + 117) ^ (((3 + 69) - 24) + 82)) & (((116 ^ 29) ^ (92 ^ 117)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIIIIIlIlI[0];
        });
        if (llIIIlIIIIIIlII(nearest)) {
            return lIllIIIIIlIlI[0];
        }
        if (llIIIlIIIIIIlII(i.b(nearest))) {
            Log.info(lIllIIIIIlIIl[lIllIIIIIlIlI[0]]);
            return lIllIIIIIlIlI[0];
        } else if (llIIIlIIIIIIlIl(this.L.q(), lIllIIIIIlIlI[3]) && llIIIlIIIIIIIIl(this.K.bank() ? 1 : 0) && llIIIlIIIIIIllI(nearest.distanceTo(local), this.L.m()) && llIIIlIIIIIIIIl(local.isMoving() ? 1 : 0) && llIIIlIIIIIIIlI(Inventory.contains(item -> {
            return item.getName().contains(this.K.tree().r());
        }) ? 1 : 0)) {
            Log.info(lIllIIIIIlIIl[lIllIIIIIlIlI[2]]);
            nearest.interact(lIllIIIIIlIIl[lIllIIIIIlIlI[4]]);
            return lIllIIIIIlIlI[2];
        } else {
            if (!llIIIlIIIIIIlIl(nearest.distanceTo(local), this.L.m()) && llIIIlIIIIIIIlI(this.L.b() ? 1 : 0)) {
                nearest.interact(lIllIIIIIlIIl[lIllIIIIIlIlI[5]]);
                sleep(lIllIIIIIlIlI[2]);
                return lIllIIIIIlIlI[2];
            }
            return lIllIIIIIlIlI[0];
        }
    }
}
