package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Opening coin pouches", priority = Integer.MAX_VALUE)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.j  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/j.class */
public class C0009j extends Task {
    private final /* synthetic */ SquireThievingConfig v;
    private static /* synthetic */ int[] lIIllIllIIllI;
    private static /* synthetic */ String[] lIIllIllIIlIl;
    private final /* synthetic */ int w = lIIllIllIIllI[0];
    private final /* synthetic */ int x = lIIllIllIIllI[1];
    private /* synthetic */ int y = Rand.nextInt(lIIllIllIIllI[0], lIIllIllIIllI[1]);

    private static void lIllIIIlIIllIlI() {
        lIIllIllIIllI = new int[11];
        lIIllIllIIllI[0] = (245 ^ 196) ^ (69 ^ 123);
        lIIllIllIIllI[1] = 157 ^ 139;
        lIIllIllIIllI[2] = ((84 ^ 26) ^ (205 ^ 180)) & (((((64 + 212) - 238) + 204) ^ (((88 + 21) - 25) + 113)) ^ (-" ".length()));
        lIIllIllIIllI[3] = -" ".length();
        lIIllIllIIllI[4] = " ".length();
        lIIllIllIIllI[5] = "  ".length();
        lIIllIllIIllI[6] = "   ".length();
        lIIllIllIIllI[7] = 89 ^ 93;
        lIIllIllIIllI[8] = 197 ^ 192;
        lIIllIllIIllI[9] = 121 ^ 127;
        lIIllIllIIllI[10] = (34 ^ 79) ^ (238 ^ 139);
    }

    private static boolean lIllIIIlIlIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIlIIlllIl(int i) {
        return i != 0;
    }

    private static String lIllIIIlIIlIllI(String llllllllllllllIlllIllllIIllIlIII, String llllllllllllllIlllIllllIIllIIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIIllIIlll.getBytes(StandardCharsets.UTF_8)), lIIllIllIIllI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIllIIllI[5], llllllllllllllIlllIllllIIllIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIIllIlIIl) {
            llllllllllllllIlllIllllIIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIllllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    public boolean run() {
        if (lIllIIIlIIllIll(Game.getState(), GameState.LOGGED_IN)) {
            return lIIllIllIIllI[2];
        }
        if (lIllIIIlIIlllII(Players.getLocal().getGraphic(), lIIllIllIIllI[3])) {
            String[] strArr = new String[lIIllIllIIllI[4]];
            strArr[lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[2]];
            if (lIllIIIlIIlllIl(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIIllIllIIllI[4]];
                strArr2[lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[4]];
                Inventory.getFirst(strArr2).interact(lIIllIllIIlIl[lIIllIllIIllI[5]]);
                return lIIllIllIIllI[4];
            }
            return lIIllIllIIllI[2];
        }
        String[] strArr3 = new String[lIIllIllIIllI[4]];
        strArr3[lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[6]];
        Item first = Inventory.getFirst(strArr3);
        if (lIllIIIlIIllllI(first)) {
            return lIIllIllIIllI[2];
        }
        if (lIllIIIlIIlllll(Inventory.getFreeSlots(), lIIllIllIIllI[5])) {
            first.interact(lIIllIllIIlIl[lIIllIllIIllI[7]]);
            return lIIllIllIIllI[4];
        } else if (lIllIIIlIlIIIII(first.getQuantity(), this.y)) {
            return lIIllIllIIllI[2];
        } else {
            first.interact(lIIllIllIIlIl[lIIllIllIIllI[8]]);
            this.y = Rand.nextInt(lIIllIllIIllI[0], lIIllIllIIllI[1]);
            return lIIllIllIIllI[4];
        }
    }

    private static boolean lIllIIIlIIlllII(int i, int i2) {
        return i != i2;
    }

    static {
        lIllIIIlIIllIlI();
        lIllIIIlIIllIIl();
    }

    private static boolean lIllIIIlIIlllll(int i, int i2) {
        return i <= i2;
    }

    private static String lIllIIIlIIlIlll(String llllllllllllllIlllIllllIIlIllIII, String llllllllllllllIlllIllllIIlIlIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllIIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllllIIlIlIlIl = llllllllllllllIlllIllllIIlIlIlll.toCharArray();
        int llllllllllllllIlllIllllIIlIIllll = lIIllIllIIllI[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIllIIllI[2];
        while (lIllIIIlIlIIIII(i, length)) {
            char llllllllllllllIlllIllllIIlIllIIl = charArray[i];
            sb.append((char) (llllllllllllllIlllIllllIIlIllIIl ^ llllllllllllllIlllIllllIIlIlIlIl[llllllllllllllIlllIllllIIlIIllll % llllllllllllllIlllIllllIIlIlIlIl.length]));
            "".length();
            llllllllllllllIlllIllllIIlIIllll++;
            i++;
            "".length();
            if (((137 ^ 152) ^ (103 ^ 114)) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllIIIlIIllIIl() {
        lIIllIllIIlIl = new String[lIIllIllIIllI[9]];
        lIIllIllIIlIl[lIIllIllIIllI[2]] = lIllIIIlIIlIllI("DdGaNbidlSgP35oZio57Ew==", "gqhLl");
        lIIllIllIIlIl[lIIllIllIIllI[4]] = lIllIIIlIIlIlll("JzsGHHcUOxoRPw==", "dTorW");
        lIIllIllIIlIl[lIIllIllIIllI[5]] = lIllIIIlIIlIllI("n9+db6V9m/+iZiI/+S1x1Q==", "Pgvrl");
        lIIllIllIIlIl[lIIllIllIIllI[6]] = lIllIIIlIIlIlll("MRslF2UCGzkaLQ==", "rtLyE");
        lIIllIllIIlIl[lIIllIllIIllI[7]] = lIllIIIlIIlIlll("JiMBNEgIPwg=", "iSdZe");
        lIIllIllIIlIl[lIIllIllIIllI[8]] = lIllIIIlIIllIII("N+ycyCeaqX2Fit/gv3Bf7w==", "ePugk");
    }

    private static String lIllIIIlIIllIII(String llllllllllllllIlllIllllIIlllIIll, String llllllllllllllIlllIllllIIlllIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllllIIlllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllllIIlllIlll.init(lIIllIllIIllI[5], llllllllllllllIlllIllllIIllllIII);
            return new String(llllllllllllllIlllIllllIIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIIlllIllI) {
            llllllllllllllIlllIllllIIlllIllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public C0009j(SquireThievingConfig squireThievingConfig) {
        this.v = squireThievingConfig;
    }

    private static boolean lIllIIIlIIllIll(Object obj, Object obj2) {
        return obj != obj2;
    }
}
