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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving to next tree", priority = 100)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.j  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/j.class */
public class j extends Task {
    private static /* synthetic */ String[] lIllIIIIlIIIl;
    private final /* synthetic */ SquireWoodcutterConfig J;
    private static /* synthetic */ int[] lIllIIIIlIIlI;
    private final /* synthetic */ SquireWoodcutterPlugin I;

    private static void llIIIlIIIIlllII() {
        lIllIIIIlIIIl = new String[lIllIIIIlIIlI[4]];
        lIllIIIIlIIIl[lIllIIIIlIIlI[0]] = llIIIlIIIIllIlI("hacDbSsDpo+WNkTnFIVFmw==", "LRxVL");
        lIllIIIIlIIIl[lIllIIIIlIIlI[2]] = llIIIlIIIIllIll("Xyqzqki0jUO5H2toO9ivPw==", "VBdJe");
    }

    private static boolean llIIIlIIIlIIIlI(Object obj) {
        return obj != null;
    }

    private static String llIIIlIIIIllIll(String llllllllllllllIllIIllIIlllIlIIll, String llllllllllllllIllIIllIIlllIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIlllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIIlI[5]), "DES");
            Cipher llllllllllllllIllIIllIIlllIlIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIIllIIlllIlIlIl.init(lIllIIIIlIIlI[4], llllllllllllllIllIIllIIlllIlIllI);
            return new String(llllllllllllllIllIIllIIlllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIlllIlIlII) {
            llllllllllllllIllIIllIIlllIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIlllll(int i) {
        return i != 0;
    }

    private static boolean llIIIlIIIlIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void llIIIlIIIIlllIl() {
        lIllIIIIlIIlI = new int[6];
        lIllIIIIlIIlI[0] = (106 ^ 62) & ((57 ^ 109) ^ (-1));
        lIllIIIIlIIlI[1] = (62 ^ 4) ^ (32 ^ 31);
        lIllIIIIlIIlI[2] = " ".length();
        lIllIIIIlIIlI[3] = (-((-20881) & 29587)) & (-17729) & 32767;
        lIllIIIIlIIlI[4] = "  ".length();
        lIllIIIIlIIlI[5] = 21 ^ 29;
    }

    @Inject
    public j(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.I = squireWoodcutterPlugin;
        this.J = squireWoodcutterConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    public boolean run() {
        if (!llIIIlIIIIllllI(this.J.fastTickChop() ? 1 : 0) && !llIIIlIIIIlllll(this.I.p() ? 1 : 0)) {
            Player local = Players.getLocal();
            if (!llIIIlIIIlIIIII(local) && !llIIIlIIIIllllI(Movement.shouldWalk() ? 1 : 0)) {
                if (llIIIlIIIlIIIIl(Movement.getRunEnergy(), lIllIIIIlIIlI[1]) && llIIIlIIIIllllI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                    return lIllIIIIlIIlI[2];
                } else if (llIIIlIIIIllllI(this.I.j().contains(local) ? 1 : 0)) {
                    Movement.walkTo(this.I.j().getCenter(), (boolean) lIllIIIIlIIlI[0]);
                    "".length();
                    return lIllIIIIlIIlI[2];
                } else {
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (llIIIlIIIIlllll(tileObject.getName().equals(this.J.tree().r() + " tree") ? 1 : 0)) {
                            String[] strArr = new String[lIllIIIIlIIlI[2]];
                            strArr[lIllIIIIlIIlI[0]] = lIllIIIIlIIIl[lIllIIIIlIIlI[2]];
                            if (llIIIlIIIIlllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                                ?? r0 = lIllIIIIlIIlI[2];
                                "".length();
                                return (-"  ".length()) >= 0 ? ((220 ^ 139) ^ (24 ^ 108)) & (("  ".length() ^ (57 ^ 24)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lIllIIIIlIIlI[0];
                    });
                    if (llIIIlIIIlIIIII(nearest)) {
                        i x = l.x();
                        if (llIIIlIIIlIIIlI(x)) {
                            Movement.setDestination(x.w().getNearest());
                            return lIllIIIIlIIlI[2];
                        }
                        return lIllIIIIlIIlI[0];
                    }
                    if (llIIIlIIIIllllI(this.J.bank() ? 1 : 0)) {
                        int[] iArr = new int[lIllIIIIlIIlI[2]];
                        iArr[lIllIIIIlIIlI[0]] = lIllIIIIlIIlI[3];
                        if (llIIIlIIIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIllIIIIlIIlI[2]];
                            iArr2[lIllIIIIlIIlI[0]] = lIllIIIIlIIlI[3];
                            Inventory.dropAll(iArr2);
                            "".length();
                        }
                    }
                    if (llIIIlIIIlIIIIl(nearest.distanceTo(local), this.I.m())) {
                        nearest.interact(lIllIIIIlIIIl[lIllIIIIlIIlI[0]]);
                        return lIllIIIIlIIlI[2];
                    }
                    return lIllIIIIlIIlI[0];
                }
            }
            return lIllIIIIlIIlI[0];
        }
        return lIllIIIIlIIlI[0];
    }

    private static boolean llIIIlIIIlIIIII(Object obj) {
        return obj == null;
    }

    static {
        llIIIlIIIIlllIl();
        llIIIlIIIIlllII();
    }

    private static String llIIIlIIIIllIlI(String llllllllllllllIllIIllIIllllIIIII, String llllllllllllllIllIIllIIlllIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIlllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIIllllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIIllllIIIlI.init(lIllIIIIlIIlI[4], secretKeySpec);
            return new String(llllllllllllllIllIIllIIllllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIllllIIIIl) {
            llllllllllllllIllIIllIIllllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIllllI(int i) {
        return i == 0;
    }
}
