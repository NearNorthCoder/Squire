package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Deposit and exit")
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.e  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/e.class */
public class e extends Task {
    private static /* synthetic */ int[] lIIIIIIIlIlll;
    private static /* synthetic */ String[] lIIIIIIIlIIll;
    final /* synthetic */ WorldArea M = new WorldArea(lIIIIIIIlIlll[0], lIIIIIIIlIlll[1], lIIIIIIIlIlll[2], lIIIIIIIlIlll[3], lIIIIIIIlIlll[4]);

    private static boolean lIIlIllIlIlllII(int i) {
        return i != 0;
    }

    private static void lIIlIllIlIllIIl() {
        lIIIIIIIlIlll = new int[18];
        lIIIIIIIlIlll[0] = (-((-16839) & 27119)) & (-20993) & 32763;
        lIIIIIIIlIlll[1] = (-6789) & 16349;
        lIIIIIIIlIlll[2] = 106 ^ 65;
        lIIIIIIIlIlll[3] = 185 ^ 147;
        lIIIIIIIlIlll[4] = ((53 ^ 80) ^ (136 ^ 166)) & (((((99 + 99) - 98) + 103) ^ (((13 + 25) - 9) + 99)) ^ (-" ".length()));
        lIIIIIIIlIlll[5] = (-4394) & 14251;
        lIIIIIIIlIlll[6] = " ".length();
        lIIIIIIIlIlll[7] = (-6165) & 16023;
        lIIIIIIIlIlll[8] = (-((-1181) & 1502)) & (-18443) & 28623;
        lIIIIIIIlIlll[9] = (-((-5025) & 31657)) & (-5265) & 32764;
        lIIIIIIIlIlll[10] = (120 ^ 38) ^ (26 ^ 80);
        lIIIIIIIlIlll[11] = "  ".length();
        lIIIIIIIlIlll[12] = "   ".length();
        lIIIIIIIlIlll[13] = 120 ^ 124;
        lIIIIIIIlIlll[14] = (-((-9487) & 28447)) & (-4099) & 24571;
        lIIIIIIIlIlll[15] = (-((-8804) & 13031)) & (-1) & 13823;
        lIIIIIIIlIlll[16] = (138 ^ 179) ^ (251 ^ 199);
        lIIIIIIIlIlll[17] = 54 ^ 62;
    }

    private static String lIIlIllIlIIllll(String lllllllllllllllIIIllllllIIIIllll, String lllllllllllllllIIIllllllIIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIIllllllIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllllIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIllllllIIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIllllllIIIlIIIl.init(lIIIIIIIlIlll[11], lllllllllllllllIIIllllllIIIlIIlI);
            return new String(lllllllllllllllIIIllllllIIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllllIIIlIIII) {
            lllllllllllllllIIIllllllIIIlIIII.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIllIlIllIIl();
        lIIlIllIlIlIllI();
    }

    private static void lIIlIllIlIlIllI() {
        lIIIIIIIlIIll = new String[lIIIIIIIlIlll[16]];
        lIIIIIIIlIIll[lIIIIIIIlIlll[4]] = lIIlIllIlIIllll("RVgnm9hz977XkPhz82Zdk1bjNcUnnuE1", "jQuzo");
        lIIIIIIIlIIll[lIIIIIIIlIlll[6]] = lIIlIllIlIlIIIl("mTnYCWgYkYhFi+RH8hLsFA==", "vZLEJ");
        lIIIIIIIlIIll[lIIIIIIIlIlll[11]] = lIIlIllIlIIllll("Gg4FFa86SY5AfKHL3kzR0xgGMTemrYZ1", "PaoUR");
        lIIIIIIIlIIll[lIIIIIIIlIlll[12]] = lIIlIllIlIlIlIl("Hi0gA1s6JCEfAykk", "NLSpv");
        lIIIIIIIlIIll[lIIIIIIIlIlll[13]] = lIIlIllIlIlIlIl("LzQhJTYEOTA=", "jZUWW");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    public boolean run() {
        if ((!lIIlIllIlIllIlI(Vars.getBit(lIIIIIIIlIlll[5]), lIIIIIIIlIlll[6]) || !lIIlIllIlIllIlI(Vars.getBit(lIIIIIIIlIlll[7]), lIIIIIIIlIlll[6]) || !lIIlIllIlIllIlI(Vars.getBit(lIIIIIIIlIlll[8]), lIIIIIIIlIlll[6])) && !lIIlIllIlIllIll(this.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIllIlIlllII(this.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIIIIIlIlll[9], lIIIIIIIlIlll[10]);
                if (lIIlIllIlIlllIl(widget)) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIIll[lIIIIIIIlIlll[4]];
                    widget.interact(lIIIIIIIlIIll[lIIIIIIIlIlll[6]]);
                    return lIIIIIIIlIlll[6];
                } else if (lIIlIllIlIllllI(widget)) {
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (lIIlIllIlIlllII(tileObject.getName().contains(lIIIIIIIlIIll[lIIIIIIIlIlll[13]]) ? 1 : 0) && lIIlIllIlIlllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIIlIlll[14], lIIIIIIIlIlll[15], lIIIIIIIlIlll[4])), lIIIIIIIlIlll[16])) {
                            ?? r0 = lIIIIIIIlIlll[6];
                            "".length();
                            return ((42 ^ 7) & ((49 ^ 28) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIIlIlll[4];
                    });
                    if (lIIlIllIlIlllIl(nearest)) {
                        SquireMoonsOfPeril.g = lIIIIIIIlIIll[lIIIIIIIlIlll[11]];
                        nearest.interact(lIIIIIIIlIIll[lIIIIIIIlIlll[12]]);
                        return lIIIIIIIlIlll[6];
                    }
                }
            }
            return lIIIIIIIlIlll[4];
        }
        return lIIIIIIIlIlll[4];
    }

    private static boolean lIIlIllIllIIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIllIlIlIIIl(String lllllllllllllllIIIllllllIIIlllII, String lllllllllllllllIIIllllllIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIIllllllIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllllIIIllIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlIlll[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIlIlll[11], lllllllllllllllIIIllllllIIIlllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllllIIIllIII) {
            lllllllllllllllIIIllllllIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlIllIll(int i) {
        return i == 0;
    }

    private static String lIIlIllIlIlIlIl(String lllllllllllllllIIIllllllIIllIIIl, String lllllllllllllllIIIllllllIIllIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllllIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIllllllIIlIllll = new StringBuilder();
        char[] lllllllllllllllIIIllllllIIlIlllI = lllllllllllllllIIIllllllIIllIIII.toCharArray();
        int lllllllllllllllIIIllllllIIlIllIl = lIIIIIIIlIlll[4];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIIIllllllIIlIIllI = charArray.length;
        int i = lIIIIIIIlIlll[4];
        while (lIIlIllIllIIIII(i, lllllllllllllllIIIllllllIIlIIllI)) {
            lllllllllllllllIIIllllllIIlIllll.append((char) (charArray[i] ^ lllllllllllllllIIIllllllIIlIlllI[lllllllllllllllIIIllllllIIlIllIl % lllllllllllllllIIIllllllIIlIlllI.length]));
            "".length();
            lllllllllllllllIIIllllllIIlIllIl++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIllllllIIlIllll);
    }

    private static boolean lIIlIllIlIllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIllIlIlllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIllIlIllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIllIlIlllIl(Object obj) {
        return obj != null;
    }
}
