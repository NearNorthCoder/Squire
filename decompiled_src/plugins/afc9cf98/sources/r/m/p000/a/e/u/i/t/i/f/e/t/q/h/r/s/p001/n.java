package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import gg.squire.client.plugins.fw.Task;
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Drinking energy boost", priority = 20)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.n  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/n.class */
public class n extends Task {
    private final /* synthetic */ SquireTitheConfig R;
    private final /* synthetic */ Client Q;
    private static /* synthetic */ int[] lIlIIIIIIlIll;
    private static /* synthetic */ String[] lIlIIIIIIlIlI;

    private static boolean lIllIllIlIlIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIllIllIlIlIIlI() {
        lIlIIIIIIlIlI = new String[lIlIIIIIIlIll[6]];
        lIlIIIIIIlIlI[lIlIIIIIIlIll[0]] = lIllIllIlIIllll("Ex6BcyMGuXY=", "dtXIA");
        lIlIIIIIIlIlI[lIlIIIIIIlIll[1]] = lIllIllIlIIllll("R745wFc+wbQ=", "wGqvM");
        lIlIIIIIIlIlI[lIlIIIIIIlIll[2]] = lIllIllIlIIllll("diheUcx67og=", "zUnfK");
        lIlIIIIIIlIlI[lIlIIIIIIlIll[3]] = lIllIllIlIlIIII("JCodGQs4", "ADxkl");
        lIlIIIIIIlIlI[lIlIIIIIIlIll[4]] = lIllIllIlIlIIIl("8vSOgFM1qNg=", "KxFQP");
        lIlIIIIIIlIlI[lIlIIIIIIlIll[5]] = lIllIllIlIIllll("U0/wKlLgdDA=", "aacgk");
    }

    private static void lIllIllIlIlIIll() {
        lIlIIIIIIlIll = new int[8];
        lIlIIIIIIlIll[0] = (196 ^ 139) & ((84 ^ 27) ^ (-1));
        lIlIIIIIIlIll[1] = " ".length();
        lIlIIIIIIlIll[2] = "  ".length();
        lIlIIIIIIlIll[3] = "   ".length();
        lIlIIIIIIlIll[4] = 33 ^ 37;
        lIlIIIIIIlIll[5] = (106 ^ 97) ^ (71 ^ 73);
        lIlIIIIIIlIll[6] = (51 ^ 10) ^ (141 ^ 178);
        lIlIIIIIIlIll[7] = (((1 + 127) - 63) + 65) ^ (((107 + 60) - 113) + 84);
    }

    private static boolean lIllIllIlIlIlIl(int i) {
        return i != 0;
    }

    private static String lIllIllIlIlIIII(String llllllllllllllIlllIIlIIlIlllllll, String llllllllllllllIlllIIlIIlIllllllI) {
        String llllllllllllllIlllIIlIIlIlllllll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIIlIlllllIl = new StringBuilder();
        char[] llllllllllllllIlllIIlIIlIlllllII = llllllllllllllIlllIIlIIlIllllllI.toCharArray();
        int llllllllllllllIlllIIlIIlIlllIllI = lIlIIIIIIlIll[0];
        char[] charArray = llllllllllllllIlllIIlIIlIlllllll2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIIlIll[0];
        while (lIllIllIlIlIllI(i, length)) {
            llllllllllllllIlllIIlIIlIlllllIl.append((char) (charArray[i] ^ llllllllllllllIlllIIlIIlIlllllII[llllllllllllllIlllIIlIIlIlllIllI % llllllllllllllIlllIIlIIlIlllllII.length]));
            "".length();
            llllllllllllllIlllIIlIIlIlllIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlIIlIlllllIl);
    }

    private static boolean lIllIllIlIlIlII(int i) {
        return i == 0;
    }

    static {
        lIllIllIlIlIIll();
        lIllIllIlIlIIlI();
    }

    @Inject
    public n(Client client, SquireTitheConfig squireTitheConfig) {
        this.Q = client;
        this.R = squireTitheConfig;
    }

    private static String lIllIllIlIlIIIl(String llllllllllllllIlllIIlIIlIlIlllIl, String llllllllllllllIlllIIlIIlIlIllIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIlIllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIlIlIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIlIlIlllll.init(lIlIIIIIIlIll[2], llllllllllllllIlllIIlIIlIllIIIII);
            return new String(llllllllllllllIlllIIlIIlIlIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIlIlIllllI) {
            llllllllllllllIlllIIlIIlIlIllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        if (lIllIllIlIlIlII(this.Q.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIIlIll[0];
        }
        if (lIllIllIlIlIlIl(Inventory.contains(item -> {
            return item.getName().startsWith(lIlIIIIIIlIlI[lIlIIIIIIlIll[5]]);
        }) ? 1 : 0) && lIllIllIlIlIlII(Movement.isStaminaBoosted() ? 1 : 0) && lIllIllIlIlIllI(Movement.getRunEnergy(), this.R.energyBoostAt())) {
            Inventory.getFirst(item2 -> {
                return item2.getName().startsWith(lIlIIIIIIlIlI[lIlIIIIIIlIll[4]]);
            }).interact(lIlIIIIIIlIlI[lIlIIIIIIlIll[0]]);
            return lIlIIIIIIlIll[1];
        } else if (lIllIllIlIlIlIl(Inventory.contains(item3 -> {
            return item3.getName().toLowerCase().contains(lIlIIIIIIlIlI[lIlIIIIIIlIll[3]]);
        }) ? 1 : 0) && lIllIllIlIlIllI(Movement.getRunEnergy(), this.R.energyBoostAt())) {
            Inventory.getFirst(item4 -> {
                return item4.getName().toLowerCase().contains(lIlIIIIIIlIlI[lIlIIIIIIlIll[2]]);
            }).interact(lIlIIIIIIlIlI[lIlIIIIIIlIll[1]]);
            return lIlIIIIIIlIll[1];
        } else {
            return lIlIIIIIIlIll[0];
        }
    }

    private static String lIllIllIlIIllll(String llllllllllllllIlllIIlIIlIllIlIlI, String llllllllllllllIlllIIlIIlIllIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlIll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIIlIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIlIllIlIll) {
            llllllllllllllIlllIIlIIlIllIlIll.printStackTrace();
            return null;
        }
    }
}
