package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Getting new seeds", priority = 500, blocking = true)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.o  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/o.class */
public class o extends r {
    private final /* synthetic */ Client V;
    private static /* synthetic */ int[] lIIlllllllIIl;
    private static /* synthetic */ String[] lIIllllllIlll;
    private static final /* synthetic */ int S;
    private final /* synthetic */ SquireTitheConfig U;
    private static final /* synthetic */ int T;

    private static boolean lIllIllIIlIIlII(int i) {
        return i == 0;
    }

    private static boolean lIllIllIIIlllll(int i) {
        return i != 0;
    }

    private static void lIllIllIIIlllII() {
        lIIlllllllIIl = new int[11];
        lIIlllllllIIl[0] = (203 ^ 128) & ((15 ^ 68) ^ (-1));
        lIIlllllllIIl[1] = (-((-285) & 3551)) & (-8193) & 16351;
        lIIlllllllIIl[2] = (-((-9157) & 32735)) & (-8257) & 32734;
        lIIlllllllIIl[3] = " ".length();
        lIIlllllllIIl[4] = (-138) & 10137;
        lIIlllllllIIl[5] = "  ".length();
        lIIlllllllIIl[6] = "   ".length();
        lIIlllllllIIl[7] = (221 ^ 156) ^ (42 ^ 111);
        lIIlllllllIIl[8] = (((118 + 73) - 92) + 57) ^ (((118 + 26) - 46) + 55);
        lIIlllllllIIl[9] = 96 ^ 102;
        lIIlllllllIIl[10] = (((85 + 179) - 226) + 163) ^ (((157 + 48) - 89) + 77);
    }

    private static boolean lIllIllIIlIIIII(int i, int i2) {
        return i > i2;
    }

    private static String lIllIllIIIllIII(String llllllllllllllIlllIIlIllIIllIIll, String llllllllllllllIlllIIlIllIIllIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIlIllIIllIIlI.toCharArray();
        int llllllllllllllIlllIIlIllIIlIllll = lIIlllllllIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllllllIIl[0];
        while (lIllIllIIlIIllI(i, length)) {
            char llllllllllllllIlllIIlIllIIllIlII = charArray2[i];
            sb.append((char) (llllllllllllllIlllIIlIllIIllIlII ^ charArray[llllllllllllllIlllIIlIllIIlIllll % charArray.length]));
            "".length();
            llllllllllllllIlllIIlIllIIlIllll++;
            i++;
            "".length();
            if ((((((106 + 40) - 28) + 104) ^ (((121 + 114) - 155) + 68)) & (((53 ^ 80) ^ (140 ^ 163)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIllIllIIIlllII();
        lIllIllIIIllIIl();
        S = lIIlllllllIIl[4];
        T = lIIlllllllIIl[2];
    }

    private static String lIllIllIIIlIllI(String llllllllllllllIlllIIlIllIlIIIIll, String llllllllllllllIlllIIlIllIlIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllllIIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllllIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIllIlIIIlII) {
            llllllllllllllIlllIIlIllIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIllIIlIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIllIIlIIIll(int i, int i2) {
        return i >= i2;
    }

    private static String lIllIllIIIlIlll(String llllllllllllllIlllIIlIllIIIllllI, String llllllllllllllIlllIIlIllIIIlllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIllIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllllIIl[5], llllllllllllllIlllIIlIllIIlIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIllIIIlllll) {
            llllllllllllllIlllIIlIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIlllIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    public boolean run() {
        if ((!lIllIllIIIlllIl(this.Z.u(), this.Z.t()) || !lIllIllIIIlllll(this.V.isInInstancedRegion() ? 1 : 0)) && !lIllIllIIlIIIII(Vars.getBit(lIIlllllllIIl[1]), lIIlllllllIIl[2])) {
            Item first = Inventory.getFirst(item -> {
                return item.getName().endsWith(lIIllllllIlll[lIIlllllllIIl[8]]);
            });
            if (!lIllIllIIlIIIlI(first) || !lIllIllIIlIIIll(first.getQuantity(), this.Z.u()) || !lIllIllIIIlllll(this.V.isInInstancedRegion() ? 1 : 0) || (!lIllIllIIlIIlII(this.U.fruit().a(first) ? 1 : 0) && !lIllIllIIIlllll(Inventory.contains(item2 -> {
                return item2.getName().endsWith(lIIllllllIlll[lIIlllllllIIl[7]]);
            }) ? 1 : 0))) {
                if (!lIllIllIIlIIlII(this.V.isInInstancedRegion() ? 1 : 0) || lIllIllIIlIIIlI(first)) {
                    String[] strArr = new String[lIIlllllllIIl[3]];
                    strArr[lIIlllllllIIl[0]] = lIIllllllIlll[lIIlllllllIIl[0]];
                    TileObject nearest = TileObjects.getNearest(strArr);
                    if (lIllIllIIlIIlIl(nearest)) {
                        return lIIlllllllIIl[0];
                    }
                    nearest.interact(lIIllllllIlll[lIIlllllllIIl[3]]);
                    return lIIlllllllIIl[3];
                } else if (lIllIllIIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.enterAmount(lIIlllllllIIl[4]);
                    return lIIlllllllIIl[3];
                } else {
                    String[] strArr2 = new String[lIIlllllllIIl[3]];
                    strArr2[lIIlllllllIIl[0]] = lIIllllllIlll[lIIlllllllIIl[5]];
                    TileObject nearest2 = TileObjects.getNearest(strArr2);
                    if (lIllIllIIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
                        Dialog.chooseOption(this.U.fruit().i().ordinal());
                        "".length();
                        "".length();
                        if (((230 ^ 131) ^ (47 ^ 79)) <= 0) {
                            return ((50 ^ 11) ^ (59 ^ 62)) & (("  ".length() ^ (138 ^ 180)) ^ (-" ".length()));
                        }
                    } else {
                        nearest2.interact(lIIllllllIlll[lIIlllllllIIl[6]]);
                    }
                    return lIIlllllllIIl[3];
                }
            }
            return lIIlllllllIIl[0];
        }
        return lIIlllllllIIl[0];
    }

    private static boolean lIllIllIIlIIlIl(Object obj) {
        return obj == null;
    }

    @Inject
    protected o(i iVar, SquireTitheConfig squireTitheConfig, Client client) {
        super(iVar);
        this.U = squireTitheConfig;
        this.V = client;
    }

    private static void lIllIllIIIllIIl() {
        lIIllllllIlll = new String[lIIlllllllIIl[9]];
        lIIllllllIlll[lIIlllllllIIl[0]] = lIllIllIIIlIllI("Cp4LCYtirEIUt7X8ni3K/w==", "QWDUw");
        lIIllllllIlll[lIIlllllllIIl[3]] = lIllIllIIIlIlll("zFlrVsgc+XI=", "spZLt");
        lIIllllllIlll[lIIlllllllIIl[5]] = lIllIllIIIlIllI("da/KgSmHXdXJvNhMKYb6Ig==", "vvLEL");
        lIIllllllIlll[lIIlllllllIIl[6]] = lIllIllIIIllIII("EQ4rGiIq", "BkJhA");
        lIIllllllIlll[lIIlllllllIIl[7]] = lIllIllIIIlIllI("U31DTfUHoC4=", "MMVbI");
        lIIllllllIlll[lIIlllllllIIl[8]] = lIllIllIIIllIII("HwQPLA==", "lajHw");
    }
}
