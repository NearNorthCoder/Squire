package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Picking the lock")
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.w  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/w.class */
public class w extends s {
    private static /* synthetic */ int[] lIIllIllIlIlI;
    /* synthetic */ WorldArea ag;
    private static /* synthetic */ String[] lIIllIllIlIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.s
    public boolean l() {
        Player local = Players.getLocal();
        if (!lIllIIIlIllIIIl(local) && !lIllIIIlIllIIlI(Dialog.isOpen() ? 1 : 0) && !lIllIIIlIllIIlI(Inventory.isFull() ? 1 : 0)) {
            if (!lIllIIIlIllIIll(local.isAnimating() ? 1 : 0) || lIllIIIlIllIIll(Movement.shouldWalk() ? 1 : 0)) {
                return lIIllIllIlIlI[3];
            }
            if (lIllIIIlIllIIlI(this.ag.contains(local) ? 1 : 0)) {
                Movement.walkTo(new WorldPoint(lIIllIllIlIlI[4], lIIllIllIlIlI[5], lIIllIllIlIlI[3]), (boolean) lIIllIllIlIlI[3]);
                "".length();
                return lIIllIllIlIlI[6];
            }
            String[] strArr = new String[lIIllIllIlIlI[6]];
            strArr[lIIllIllIlIlI[3]] = lIIllIllIlIIl[lIIllIllIlIlI[3]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIllIIIlIllIIIl(nearest)) {
                return lIIllIllIlIlI[3];
            }
            nearest.interact(lIIllIllIlIIl[lIIllIllIlIlI[6]]);
            return lIIllIllIlIlI[6];
        }
        return lIIllIllIlIlI[3];
    }

    @Inject
    public w(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ag = new WorldArea(lIIllIllIlIlI[0], lIIllIllIlIlI[1], lIIllIllIlIlI[2], lIIllIllIlIlI[2], lIIllIllIlIlI[3]);
    }

    private static boolean lIllIIIlIllIIlI(int i) {
        return i != 0;
    }

    private static void lIllIIIlIlIllll() {
        lIIllIllIlIIl = new String[lIIllIllIlIlI[7]];
        lIIllIllIlIIl[lIIllIllIlIlI[3]] = lIllIIIlIlIllIl("EREsJwhiBissHjY=", "BeCIm");
        lIIllIllIlIIl[lIIllIllIlIlI[6]] = lIllIIIlIlIlllI("8MmPCfKmMl1gUI5USv8HZw==", "FVHez");
    }

    private static String lIllIIIlIlIlllI(String llllllllllllllIlllIlllIllIlIllll, String llllllllllllllIlllIlllIllIlIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIllIlIlllI.getBytes(StandardCharsets.UTF_8)), lIIllIllIlIlI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIllIlIlI[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIllIllIIII) {
            llllllllllllllIlllIlllIllIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIllIIll(int i) {
        return i == 0;
    }

    private static void lIllIIIlIllIIII() {
        lIIllIllIlIlI = new int[9];
        lIIllIllIlIlI[0] = (-14561) & 15868;
        lIIllIllIlIlI[1] = (-20629) & 30710;
        lIIllIllIlIlI[2] = (29 ^ 118) ^ (240 ^ 145);
        lIIllIllIlIlI[3] = ((41 ^ 10) ^ (47 ^ 65)) & (((((74 + 105) - 157) + 221) ^ (((11 + 97) - 76) + 158)) ^ (-" ".length()));
        lIIllIllIlIlI[4] = (-((-516) & 27335)) & (-4641) & 32759;
        lIIllIllIlIlI[5] = (-2057) & 12143;
        lIIllIllIlIlI[6] = " ".length();
        lIIllIllIlIlI[7] = "  ".length();
        lIIllIllIlIlI[8] = (236 ^ 178) ^ (51 ^ 101);
    }

    private static boolean lIllIIIlIllIIIl(Object obj) {
        return obj == null;
    }

    static {
        lIllIIIlIllIIII();
        lIllIIIlIlIllll();
    }

    private static String lIllIIIlIlIllIl(String llllllllllllllIlllIlllIlllIIIlII, String llllllllllllllIlllIlllIlllIIIIll) {
        String llllllllllllllIlllIlllIlllIIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlllIlllIIIIIl = llllllllllllllIlllIlllIlllIIIIll.toCharArray();
        int llllllllllllllIlllIlllIlllIIIIII = lIIllIllIlIlI[3];
        char[] charArray = llllllllllllllIlllIlllIlllIIIlII2.toCharArray();
        int length = charArray.length;
        int i = lIIllIllIlIlI[3];
        while (lIllIIIlIllIlII(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIlllIlllIIIIIl[llllllllllllllIlllIlllIlllIIIIII % llllllllllllllIlllIlllIlllIIIIIl.length]));
            "".length();
            llllllllllllllIlllIlllIlllIIIIII++;
            i++;
            "".length();
            if (((40 ^ 39) & ((67 ^ 76) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIlIllIlII(int i, int i2) {
        return i < i2;
    }
}
