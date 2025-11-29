package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Configure Party", priority = 2147483545, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.av  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/av.class */
public class C0022av extends AbstractC0026az {
    private final /* synthetic */ SquireChambersConfig du;
    private static /* synthetic */ String[] lIIlllllllII;
    private final /* synthetic */ SquireChambersPlugin dt;
    private static /* synthetic */ int[] lIIlllllllIl;

    private static boolean llIlIIllIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIIlIllllll(int i) {
        return i == 0;
    }

    private static String llIlIIlIllllII(String lllllllllllllllIlllIIlllIlllIIll, String lllllllllllllllIlllIIlllIlllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlllIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllllIl[6]), "DES");
            Cipher lllllllllllllllIlllIIlllIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllIlllIlIl.init(lIIlllllllIl[2], lllllllllllllllIlllIIlllIlllIllI);
            return new String(lllllllllllllllIlllIIlllIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllIlllIlII) {
            lllllllllllllllIlllIIlllIlllIlII.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIlIlllllI();
        llIlIIlIllllIl();
    }

    private static void llIlIIlIllllIl() {
        lIIlllllllII = new String[lIIlllllllIl[5]];
        lIIlllllllII[lIIlllllllIl[0]] = llIlIIlIlllIlI("a/Zif+pkmGCuw97lbLnyNX3byCWscSVE", "qLiDP");
        lIIlllllllII[lIIlllllllIl[1]] = llIlIIlIlllIlI("edQ0Kj2GC7O1ns9O0J8mtm1atRmtbnBYG05NdRd/aS49+O0Z1ZtO0w==", "GHXji");
        lIIlllllllII[lIIlllllllIl[2]] = llIlIIlIlllIll("ICwbLjM=", "eBoKA");
        lIIlllllllII[lIIlllllllIl[3]] = llIlIIlIllllII("2nZGMlvatLzyxhYhe4vdGiGsBfuQfMCb", "vYOBE");
        lIIlllllllII[lIIlllllllIl[4]] = llIlIIlIlllIll("HBQQEDc=", "YzduE");
    }

    private static String llIlIIlIlllIlI(String lllllllllllllllIlllIIllllIIIIIII, String lllllllllllllllIlllIIlllIlllllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllllIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIllllIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIllllIIIIIlI.init(lIIlllllllIl[2], lllllllllllllllIlllIIllllIIIIIll);
            return new String(lllllllllllllllIlllIIllllIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIllllIIIIIIl) {
            lllllllllllllllIlllIIllllIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIlllllI() {
        lIIlllllllIl = new int[7];
        lIIlllllllIl[0] = ((179 ^ 131) ^ (113 ^ 29)) & (((96 ^ 126) ^ (232 ^ 170)) ^ (-" ".length()));
        lIIlllllllIl[1] = " ".length();
        lIIlllllllIl[2] = "  ".length();
        lIIlllllllIl[3] = "   ".length();
        lIIlllllllIl[4] = 7 ^ 3;
        lIIlllllllIl[5] = (((114 + 85) - 178) + 118) ^ (((108 + 97) - 125) + 62);
        lIIlllllllIl[6] = (61 ^ 49) ^ (105 ^ 109);
    }

    private static boolean llIlIIllIIIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.AbstractC0026az
    public boolean cg() {
        if (llIlIIlIllllll(C0046u.bn() ? 1 : 0)) {
            return lIIlllllllIl[0];
        }
        if (llIlIIllIIIIII(Bank.isPinWindowOpen() ? 1 : 0)) {
            System.out.println(lIIlllllllII[lIIlllllllIl[0]]);
            return lIIlllllllIl[1];
        } else if (llIlIIllIIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIIlllllllIl[1];
        } else if (llIlIIllIIIIII(Dialog.isViewingOptions() ? 1 : 0) && llIlIIllIIIIII(Dialog.hasOption(lIIlllllllII[lIIlllllllIl[1]]) ? 1 : 0)) {
            Game.logout();
            return lIIlllllllIl[1];
        } else {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIlIIllIIIIII(tileObject.getName().equals(lIIlllllllII[lIIlllllllIl[3]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIlllllllIl[1]];
                    strArr[lIIlllllllIl[0]] = lIIlllllllII[lIIlllllllIl[4]];
                    if (llIlIIllIIIIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIIlllllllIl[1];
                        "".length();
                        return ((251 ^ 147) ^ (202 ^ 166)) == "   ".length() ? ((((105 + 39) - 70) + 60) ^ (((68 + 123) - 183) + 128)) & (((9 ^ 31) ^ (115 ^ 107)) ^ (-" ".length())) : r0;
                    }
                }
                return lIIlllllllIl[0];
            });
            if (!llIlIIllIIIIIl(nearest) && !llIlIIllIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIIlllllllII[lIIlllllllIl[2]]);
                return lIIlllllllIl[1];
            }
            return lIIlllllllIl[0];
        }
    }

    private static boolean llIlIIllIIIIII(int i) {
        return i != 0;
    }

    private static String llIlIIlIlllIll(String lllllllllllllllIlllIIllllIIlIlIl, String lllllllllllllllIlllIIllllIIlIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIllllIIlIlII.toCharArray();
        int lllllllllllllllIlllIIllllIIlIIIl = lIIlllllllIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlllIIllllIIIlIIl = lIIlllllllIl[0];
        while (llIlIIllIIIIlI(lllllllllllllllIlllIIllllIIIlIIl, length)) {
            char lllllllllllllllIlllIIllllIIlIllI = charArray2[lllllllllllllllIlllIIllllIIIlIIl];
            sb.append((char) (lllllllllllllllIlllIIllllIIlIllI ^ charArray[lllllllllllllllIlllIIllllIIlIIIl % charArray.length]));
            "".length();
            lllllllllllllllIlllIIllllIIlIIIl++;
            lllllllllllllllIlllIIllllIIIlIIl++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public C0022av(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dt = squireChambersPlugin;
        this.du = squireChambersConfig;
    }
}
