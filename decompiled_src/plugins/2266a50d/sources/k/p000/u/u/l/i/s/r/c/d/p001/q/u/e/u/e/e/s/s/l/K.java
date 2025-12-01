package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Exit Arder Area", priority = 87, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.K  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/K.class */
public class K extends Task {
    final /* synthetic */ SquireDukeSucellus bt;
    final /* synthetic */ C0000a bu;
    private static /* synthetic */ String[] lIllIlIllIll;
    private static /* synthetic */ int[] lIllIlIlllII;

    private static boolean lllIlIIIIlllIl(Object obj) {
        return obj == null;
    }

    private static String lllIlIIIIllIIl(String lllllllllllllllIlIllllIIlIIIIIlI, String lllllllllllllllIlIllllIIlIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIlIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIlllII[3], lllllllllllllllIlIllllIIlIIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIIlIIIIIll) {
            lllllllllllllllIlIllllIIlIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIIIllllI(Object obj) {
        return obj != null;
    }

    static {
        lllIlIIIIllIll();
        lllIlIIIIllIlI();
    }

    private static void lllIlIIIIllIlI() {
        lIllIlIllIll = new String[lIllIlIlllII[4]];
        lIllIlIllIll[lIllIlIlllII[0]] = lllIlIIIIllIII("7Yz6hDcmksLCm9YEYpqaKA==", "MMbkQ");
        lIllIlIllIll[lIllIlIlllII[1]] = lllIlIIIIllIII("vLAp81pVrlI=", "lCTdL");
        lIllIlIllIll[lIllIlIlllII[3]] = lllIlIIIIllIIl("Am3uvUMm6ju5vQu3fiaX/A==", "bGcqj");
    }

    @Inject
    public K(SquireDukeSucellus squireDukeSucellus) {
        this.bt = squireDukeSucellus;
        this.bu = squireDukeSucellus.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    public boolean run() {
        if (lllIlIIIIlllII(this.bu.v())) {
            return lIllIlIlllII[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIIIIlllII(tileObject.getName().equals(lIllIlIllIll[lIllIlIlllII[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIlllII[1]];
                strArr[lIllIlIlllII[0]] = lIllIlIllIll[lIllIlIlllII[3]];
                if (lllIlIIIIlllII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIlllII[1];
                    "".length();
                    return " ".length() == (66 ^ 70) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIlIlllII[0];
        });
        if (lllIlIIIIlllIl(nearest)) {
            return lIllIlIlllII[0];
        }
        Player local = Players.getLocal();
        if (!lllIlIIIIlllIl(local) && !lllIlIIIIlllII(C0001b.i(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIllIlIlllII[1]];
            strArr[lIllIlIlllII[0]] = lIllIlIllIll[lIllIlIlllII[0]];
            Item first = Inventory.getFirst(strArr);
            if (!lllIlIIIIllllI(first) || lllIlIIIIlllll(first.getQuantity(), lIllIlIlllII[2])) {
                return lIllIlIlllII[0];
            }
            if (lllIlIIIIlllII(C0001b.b(nearest).contains(local) ? 1 : 0) && lllIlIIIlIIIII(C0001b.f(nearest).equals(local.getWorldLocation()) ? 1 : 0)) {
                Movement.setDestination(C0001b.f(nearest));
                return lIllIlIlllII[1];
            }
            Movement.setDestination(C0001b.j(nearest));
            return lIllIlIlllII[1];
        }
        return lIllIlIlllII[0];
    }

    private static boolean lllIlIIIIlllII(int i) {
        return i != 0;
    }

    private static String lllIlIIIIllIII(String lllllllllllllllIlIllllIIlIIIllll, String lllllllllllllllIlIllllIIlIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), lIllIlIlllII[5]), "DES");
            Cipher lllllllllllllllIlIllllIIlIIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIIlIIlIIIl.init(lIllIlIlllII[3], lllllllllllllllIlIllllIIlIIlIIlI);
            return new String(lllllllllllllllIlIllllIIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIIlIIlIIII) {
            lllllllllllllllIlIllllIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIIIlllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlIIIlIIIII(int i) {
        return i == 0;
    }

    private static void lllIlIIIIllIll() {
        lIllIlIlllII = new int[6];
        lIllIlIlllII[0] = ((((14 + 128) - 96) + 128) ^ (((141 + 106) - 204) + 101)) & (((((8 + 84) - 64) + 107) ^ (((72 + 117) - 99) + 95)) ^ (-" ".length()));
        lIllIlIlllII[1] = " ".length();
        lIllIlIlllII[2] = (19 ^ 79) ^ (21 ^ 69);
        lIllIlIlllII[3] = "  ".length();
        lIllIlIlllII[4] = "   ".length();
        lIllIlIlllII[5] = 163 ^ 171;
    }
}
