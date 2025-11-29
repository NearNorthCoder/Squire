package k.p.n.s.r.a.p000.q.e.l.r.e.i.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.SquirePlankerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Teleporting", priority = 5)
/* renamed from: k.p.n.s.r.a.-.q.e.l.r.e.i.u.e  reason: invalid package */
/* loaded from: squire-planker-0.0.5.jar:k/p/n/s/r/a/-/q/e/l/r/e/i/u/e.class */
public class e extends Task {
    private final /* synthetic */ SquirePlankerConfig o;
    private static /* synthetic */ int[] llllllIIIlII;
    private static /* synthetic */ String[] llllllIIIIll;

    @Inject
    public e(SquirePlankerConfig squirePlankerConfig) {
        this.o = squirePlankerConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    public boolean run() {
        int i;
        if (lIIlIIllllllIII(this.o.spell() ? 1 : 0)) {
            return llllllIIIlII[0];
        }
        String[] strArr = new String[llllllIIIlII[1]];
        strArr[llllllIIIlII[0]] = llllllIIIIll[llllllIIIlII[0]];
        strArr[llllllIIIlII[2]] = llllllIIIIll[llllllIIIlII[2]];
        TileObject nearest = TileObjects.getNearest(strArr);
        int[] iArr = new int[llllllIIIlII[2]];
        iArr[llllllIIIlII[0]] = this.o.plank().d();
        if (lIIlIIllllllIII(Inventory.contains(iArr) ? 1 : 0) && lIIlIIllllllIIl(nearest)) {
            Widget widget = Widgets.get(SpellBook.Standard.TELEPORT_TO_HOUSE.getWidget());
            if (lIIlIIllllllIIl(widget)) {
                String str = llllllIIIIll[llllllIIIlII[1]];
                if (lIIlIIllllllIII(widget.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    widget.interact(llllllIIIIll[llllllIIIlII[3]]);
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    widget.interact(llllllIIIIll[llllllIIIlII[4]]);
                }
                sleep(llllllIIIlII[5]);
                return llllllIIIlII[2];
            }
            "".length();
            if (0 != 0) {
                return ((141 ^ 168) ^ (30 ^ 100)) & (((15 ^ 23) ^ (114 ^ 53)) ^ (-" ".length()));
            }
        } else {
            int[] iArr2 = new int[llllllIIIlII[2]];
            iArr2[llllllIIIlII[0]] = this.o.plank().d();
            if (lIIlIIllllllIlI(Inventory.contains(iArr2) ? 1 : 0) && lIIlIIllllllIll(nearest)) {
                if (lIIlIIllllllIII(this.o.ironMode() ? 1 : 0)) {
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        if (!lIIlIIllllllIlI(tileObject.getName().contains(llllllIIIIll[llllllIIIlII[8]]) ? 1 : 0) || lIIlIIllllllIII(tileObject.getName().contains(llllllIIIIll[llllllIIIlII[9]]) ? 1 : 0)) {
                            ?? r0 = llllllIIIlII[2];
                            "".length();
                            return (-" ".length()) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllllIIIlII[0];
                    });
                    if (lIIlIIllllllIII(Worlds.getCurrentWorld().isAllPkWorld() ? 1 : 0)) {
                        Log.info(llllllIIIIll[llllllIIIlII[5]]);
                        return llllllIIIlII[0];
                    } else if (lIIlIIllllllIIl(nearest2)) {
                        nearest2.interact(str2 -> {
                            return str2.contains(llllllIIIIll[llllllIIIlII[7]]);
                        });
                        return llllllIIIlII[2];
                    }
                }
                Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                if (lIIlIIllllllIII(this.o.slowmode() ? 1 : 0)) {
                    i = llllllIIIlII[6];
                    "".length();
                    if ((196 ^ 192) <= "  ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    i = llllllIIIlII[5];
                }
                sleep(i);
            }
        }
        return llllllIIIlII[2];
    }

    private static boolean lIIlIIllllllIll(Object obj) {
        return obj == null;
    }

    private static String lIIlIIlllllIIlI(String lllllllllllllllIIlIIlllllIIIIlIl, String lllllllllllllllIIlIIlllllIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllllIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllllIIIIlII.getBytes(StandardCharsets.UTF_8)), llllllIIIlII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIIIlII[1], lllllllllllllllIIlIIlllllIIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlllllIIIIllI) {
            lllllllllllllllIIlIIlllllIIIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllllIlIl() {
        llllllIIIIll = new String[llllllIIIlII[10]];
        llllllIIIIll[llllllIIIlII[0]] = lIIlIIlllllIIlI("XW34fLwgCf5mywd+Nj3P5A==", "rjtlp");
        llllllIIIIll[llllllIIIlII[2]] = lIIlIIlllllIIlI("2oh3+5Qn2g63kP+pcjMguw==", "DCOAB");
        llllllIIIIll[llllllIIIlII[1]] = lIIlIIlllllIIll("GCg2OSw0", "QFEPH");
        llllllIIIIll[llllllIIIlII[3]] = lIIlIIlllllIIll("JSYfGxMJ", "lHlrw");
        llllllIIIIll[llllllIIIlII[4]] = lIIlIIlllllIIll("FwIpOQ==", "TcZMg");
        llllllIIIIll[llllllIIIlII[5]] = lIIlIIlllllIIlI("z4YErh+aK9dzZPJHYl6ZMTbk5V5iH7LASgBxQtuLpLq73TCS+wHaroSoJ21PqM2R", "pFfyp");
        llllllIIIIll[llllllIIIlII[7]] = lIIlIIlllllIlII("WcvuK1+u+iQ=", "zFcGh");
        llllllIIIIll[llllllIIIlII[8]] = lIIlIIlllllIIll("HiEoEDI=", "MDMbA");
        llllllIIIIll[llllllIIIlII[9]] = lIIlIIlllllIIlI("KWXyw9Mo3o4=", "TVKZd");
    }

    private static boolean lIIlIIllllllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlIIllllllIII(int i) {
        return i != 0;
    }

    private static boolean lIIlIIlllllllII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIlllllIlII(String lllllllllllllllIIlIIllllIllIIIII, String lllllllllllllllIIlIIllllIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllllIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIIIlII[1], lllllllllllllllIIlIIllllIllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllllIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllllIllIIIIl) {
            lllllllllllllllIIlIIllllIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllllIllI() {
        llllllIIIlII = new int[11];
        llllllIIIlII[0] = ((207 ^ 136) ^ (224 ^ 169)) & (((((62 + 165) - 115) + 66) ^ (((142 + 128) - 152) + 70)) ^ (-" ".length()));
        llllllIIIlII[1] = "  ".length();
        llllllIIIlII[2] = " ".length();
        llllllIIIlII[3] = "   ".length();
        llllllIIIlII[4] = (((111 + 1) - 35) + 119) ^ (((107 + 35) - 49) + 99);
        llllllIIIlII[5] = (107 ^ 97) ^ (150 ^ 153);
        llllllIIIlII[6] = 191 ^ 176;
        llllllIIIlII[7] = 83 ^ 85;
        llllllIIIlII[8] = 113 ^ 118;
        llllllIIIlII[9] = 32 ^ 40;
        llllllIIIlII[10] = 120 ^ 113;
    }

    static {
        lIIlIIlllllIllI();
        lIIlIIlllllIlIl();
    }

    private static boolean lIIlIIllllllIIl(Object obj) {
        return obj != null;
    }

    private static String lIIlIIlllllIIll(String lllllllllllllllIIlIIllllIlllIlIl, String lllllllllllllllIIlIIllllIlllIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllllIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllllIlllIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIllllIlllIlII.toCharArray();
        int lllllllllllllllIIlIIllllIlllIIIl = llllllIIIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllllIIIlII[0];
        while (lIIlIIlllllllII(i, length)) {
            lllllllllllllllIIlIIllllIlllIIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIllllIlllIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIllllIlllIIIl++;
            i++;
            "".length();
            if ((-((((93 + 152) - 185) + 122) ^ (((27 + 27) - (-83)) + 42))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIllllIlllIIll);
    }
}
