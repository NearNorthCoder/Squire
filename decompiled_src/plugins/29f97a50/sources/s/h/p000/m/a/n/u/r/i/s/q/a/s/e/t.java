package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Fighting")
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.t  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/t.class */
public class t extends Task {
    private final /* synthetic */ SquireShamansPlugin an;
    private final /* synthetic */ c ao;
    private final /* synthetic */ SquireShamanConfig ap;
    private static /* synthetic */ int[] lIIlIllllIIll;
    private static /* synthetic */ String[] lIIlIllllIIlI;
    private static final /* synthetic */ Logger am;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        NPC o = this.ao.o();
        Player local = Players.getLocal();
        if (lIlIlllIIIIIIII(o) && lIlIlllIIIIIIIl(this.ap.room().x().contains(local) ? 1 : 0) && !lIlIlllIIIIIIIl(local.isMoving() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                if (!lIlIlllIIIIIlIl(item.getId(), this.ap.weapon()) || lIlIlllIIIIIIll(item.getId(), this.an.d())) {
                    ?? r0 = lIIlIllllIIll[2];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlIllllIIll[0];
            });
            if (lIlIlllIIIIIIII(first)) {
                String[] strArr = new String[lIIlIllllIIll[1]];
                strArr[lIIlIllllIIll[0]] = lIIlIllllIIlI[lIIlIllllIIll[0]];
                strArr[lIIlIllllIIll[2]] = lIIlIllllIIlI[lIIlIllllIIll[2]];
                strArr[lIIlIllllIIll[3]] = lIIlIllllIIlI[lIIlIllllIIll[3]];
                first.interact(strArr);
                return lIIlIllllIIll[2];
            } else if (lIlIlllIIIIIIII(local.getInteracting())) {
                return lIIlIllllIIll[0];
            } else {
                WorldPoint worldLocation = local.getWorldLocation();
                if (!lIlIlllIIIIIIlI(this.ao.a(worldLocation) ? 1 : 0) && !lIlIlllIIIIIIll(o.getAnimation(), lIIlIllllIIll[4]) && lIlIlllIIIIIlII(this.ao.a(worldLocation, o).distanceTo(worldLocation), lIIlIllllIIll[2])) {
                    o.interact(lIIlIllllIIlI[lIIlIllllIIll[1]]);
                    return lIIlIllllIIll[2];
                }
                return lIIlIllllIIll[0];
            }
        }
        return lIIlIllllIIll[0];
    }

    @Inject
    public t(SquireShamansPlugin squireShamansPlugin, c cVar, SquireShamanConfig squireShamanConfig) {
        this.an = squireShamansPlugin;
        this.ao = cVar;
        this.ap = squireShamanConfig;
    }

    static {
        lIlIllIllllllll();
        lIlIllIlllllllI();
        am = LoggerFactory.getLogger(t.class);
    }

    private static boolean lIlIlllIIIIIlIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIlllIIIIIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlllIIIIIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlllIIIIIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIlllllllI() {
        lIIlIllllIIlI = new String[lIIlIllllIIll[5]];
        lIIlIllllIIlI[lIIlIllllIIll[0]] = lIlIllIllllllII("NSsxGSM=", "bBTuG");
        lIIlIllllIIlI[lIIlIllllIIll[2]] = lIlIllIllllllIl("7g0eCqH2GuQ=", "yFylz");
        lIIlIllllIIlI[lIIlIllllIIll[3]] = lIlIllIllllllII("LSUGJx0=", "hTsNm");
        lIIlIllllIIlI[lIIlIllllIIll[1]] = lIlIllIllllllIl("gWpfet/fKUo=", "XZBNl");
    }

    private static String lIlIllIllllllII(String llllllllllllllIllllIIllllIlllllI, String llllllllllllllIllllIIllllIllllIl) {
        String llllllllllllllIllllIIllllIlllllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIllllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIIllllIlllIll = llllllllllllllIllllIIllllIllllIl.toCharArray();
        int llllllllllllllIllllIIllllIlllIlI = lIIlIllllIIll[0];
        char[] charArray = llllllllllllllIllllIIllllIlllllI2.toCharArray();
        int length = charArray.length;
        int i = lIIlIllllIIll[0];
        while (lIlIlllIIIIIllI(i, length)) {
            char llllllllllllllIllllIIllllIllllll = charArray[i];
            sb.append((char) (llllllllllllllIllllIIllllIllllll ^ llllllllllllllIllllIIllllIlllIll[llllllllllllllIllllIIllllIlllIlI % llllllllllllllIllllIIllllIlllIll.length]));
            "".length();
            llllllllllllllIllllIIllllIlllIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllIIIIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlllIIIIIIlI(int i) {
        return i == 0;
    }

    private static String lIlIllIllllllIl(String llllllllllllllIllllIIllllIlIlIIl, String llllllllllllllIllllIIllllIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIllllIIllllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllllIlIlIII.getBytes(StandardCharsets.UTF_8)), lIIlIllllIIll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIllllIIll[3], llllllllllllllIllllIIllllIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIllllIlIlIlI) {
            llllllllllllllIllllIIllllIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllllllll() {
        lIIlIllllIIll = new int[7];
        lIIlIllllIIll[0] = ((12 ^ 2) ^ (196 ^ 157)) & (((101 ^ 24) ^ (8 ^ 34)) ^ (-" ".length()));
        lIIlIllllIIll[1] = "   ".length();
        lIIlIllllIIll[2] = " ".length();
        lIIlIllllIIll[3] = "  ".length();
        lIIlIllllIIll[4] = (-17412) & 24563;
        lIIlIllllIIll[5] = 138 ^ 142;
        lIIlIllllIIll[6] = (((23 + 189) - 65) + 57) ^ (((100 + 12) - 85) + 169);
    }

    private static boolean lIlIlllIIIIIIIl(int i) {
        return i != 0;
    }
}
