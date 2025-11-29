package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Leaving Tithe Instance", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.q  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/q.class */
public class q extends Task {
    private static final /* synthetic */ int W;
    private final /* synthetic */ SquireTitheConfig X;
    private final /* synthetic */ Client Y;
    private static /* synthetic */ String[] lIIlllllIllII;
    private static /* synthetic */ int[] lIIlllllIlllI;

    static {
        lIllIlIlllllIll();
        lIllIlIlllllIlI();
        W = lIIlllllIlllI[2];
    }

    private static String lIllIlIllllIlII(String llllllllllllllIlllIIllIIIIIIlIlI, String llllllllllllllIlllIIllIIIIIIlllI) {
        String llllllllllllllIlllIIllIIIIIIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIIIIIIllIl = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIllIIIIIIlllI.toCharArray();
        int llllllllllllllIlllIIllIIIIIIlIll = lIIlllllIlllI[0];
        char[] charArray2 = llllllllllllllIlllIIllIIIIIIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllllIlllI[0];
        while (lIllIlIllllllIl(i, length)) {
            char llllllllllllllIlllIIllIIIIIlIIII = charArray2[i];
            llllllllllllllIlllIIllIIIIIIllIl.append((char) (llllllllllllllIlllIIllIIIIIlIIII ^ charArray[llllllllllllllIlllIIllIIIIIIlIll % charArray.length]));
            "".length();
            llllllllllllllIlllIIllIIIIIIlIll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIllIIIIIIllIl);
    }

    private static boolean lIllIlIlllllllI(int i) {
        return i != 0;
    }

    private static String lIllIlIllllIIll(String llllllllllllllIlllIIllIIIIIlllll, String llllllllllllllIlllIIllIIIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIIIllllI.getBytes(StandardCharsets.UTF_8)), lIIlllllIlllI[10]), "DES");
            Cipher llllllllllllllIlllIIllIIIIlIIIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIIIIlIIIIl.init(lIIlllllIlllI[4], secretKeySpec);
            return new String(llllllllllllllIlllIIllIIIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIIIlIIIII) {
            llllllllllllllIlllIIllIIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIllllIlIl(String llllllllllllllIlllIIllIIIIlIllII, String llllllllllllllIlllIIllIIIIlIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllIlllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIIIlIllIl) {
            llllllllllllllIlllIIllIIIIlIllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean y() {
        String[] strArr = new String[lIIlllllIlllI[3]];
        strArr[lIIlllllIlllI[0]] = lIIlllllIllII[lIIlllllIlllI[5]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIllIllIIIIIIII(nearest)) {
            return lIIlllllIlllI[0];
        }
        nearest.interact(lIIlllllIllII[lIIlllllIlllI[6]]);
        return lIIlllllIlllI[3];
    }

    private static boolean lIllIlIllllllll(int i) {
        return i > 0;
    }

    private static boolean lIllIlIllllllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllIlIlllllIlI() {
        lIIlllllIllII = new String[lIIlllllIlllI[10]];
        lIIlllllIllII[lIIlllllIlllI[0]] = lIllIlIllllIIll("zBsbINs0hFQ=", "rNkgf");
        lIIlllllIllII[lIIlllllIlllI[3]] = lIllIlIllllIlII("BwYIGQ==", "Tgkrb");
        lIIlllllIllII[lIIlllllIlllI[4]] = lIllIlIllllIlIl("059Z6jZUrdU=", "pabrA");
        lIIlllllIllII[lIIlllllIlllI[5]] = lIllIlIllllIIll("Mg/zb36ubikZVM/E1lWqag==", "cRVqh");
        lIIlllllIllII[lIIlllllIlllI[6]] = lIllIlIllllIlIl("dKNkmGLdtkU=", "zRayB");
        lIIlllllIllII[lIIlllllIlllI[7]] = lIllIlIllllIlIl("JGlbt2g60qvhtkKZ59TzLQ==", "MDKRC");
        lIIlllllIllII[lIIlllllIlllI[8]] = lIllIlIllllIIll("HmmPxV+3IBs=", "LphDc");
        lIIlllllIllII[lIIlllllIlllI[9]] = lIllIlIllllIIll("3iebL8L3M4c=", "ViCog");
    }

    private static boolean lIllIlIllllllII(int i) {
        return i == 0;
    }

    private static boolean lIllIllIIIIIIII(Object obj) {
        return obj == null;
    }

    @Inject
    public q(SquireTitheConfig squireTitheConfig, Client client) {
        this.X = squireTitheConfig;
        this.Y = client;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    public boolean run() {
        if (lIllIlIllllllII(this.Y.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllllIlllI[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().endsWith(lIIlllllIllII[lIIlllllIlllI[9]]);
        });
        if (lIllIlIllllllIl(Vars.getBit(lIIlllllIlllI[1]), lIIlllllIlllI[2]) && lIllIlIllllllII(this.X.fruit().a(first) ? 1 : 0)) {
            return lIIlllllIlllI[0];
        }
        if (lIllIlIlllllllI(Inventory.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIlllllIllII[lIIlllllIlllI[8]]);
        }) ? 1 : 0)) {
            List<Item> all = Inventory.getAll(item3 -> {
                return item3.getName().contains(lIIlllllIllII[lIIlllllIlllI[7]]);
            });
            if (lIllIlIllllllll(all.size())) {
                for (Item item4 : all) {
                    item4.interact(lIIlllllIllII[lIIlllllIlllI[0]]);
                    "".length();
                    if ((((55 ^ 15) ^ (93 ^ 106)) & (((48 ^ 67) ^ (38 ^ 90)) ^ (-" ".length()))) != 0) {
                        return ((107 ^ 24) ^ (192 ^ 152)) & (((((157 + 90) - 213) + 125) ^ (((104 + 5) - (-24)) + 47)) ^ (-" ".length()));
                    }
                }
                return lIIlllllIlllI[3];
            }
            String[] strArr = new String[lIIlllllIlllI[3]];
            strArr[lIIlllllIlllI[0]] = lIIlllllIllII[lIIlllllIlllI[3]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIllIllIIIIIIII(nearest)) {
                return lIIlllllIlllI[0];
            }
            nearest.interact(lIIlllllIllII[lIIlllllIlllI[4]]);
            return lIIlllllIlllI[3];
        }
        return y();
    }

    private static void lIllIlIlllllIll() {
        lIIlllllIlllI = new int[11];
        lIIlllllIlllI[0] = ((109 ^ 54) ^ (22 ^ 125)) & (((((13 + 26) - (-68)) + 65) ^ (((142 + 6) - 61) + 69)) ^ (-" ".length()));
        lIIlllllIlllI[1] = (-11267) & 16159;
        lIIlllllIlllI[2] = (-2849) & 16185;
        lIIlllllIlllI[3] = " ".length();
        lIIlllllIlllI[4] = "  ".length();
        lIIlllllIlllI[5] = "   ".length();
        lIIlllllIlllI[6] = 99 ^ 103;
        lIIlllllIlllI[7] = 94 ^ 91;
        lIIlllllIlllI[8] = (((153 + 0) - 28) + 72) ^ (((46 + 82) - 102) + 169);
        lIIlllllIlllI[9] = (((150 + 86) - 111) + 54) ^ (((151 + 42) - 110) + 97);
        lIIlllllIlllI[10] = (((115 + 75) - 2) + 13) ^ (((98 + 144) - 125) + 76);
    }
}
