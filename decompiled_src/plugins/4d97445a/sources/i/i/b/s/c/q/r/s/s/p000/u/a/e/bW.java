package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Opening pack", priority = 10, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bW  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bW.class */
public class bW extends Task {
    private static /* synthetic */ int[] llIIIIIlI;
    private static /* synthetic */ String[] lIlllIlIl;

    private static void lIlIIIlIlIl() {
        lIlllIlIl = new String[llIIIIIlI[4]];
        lIlllIlIl[llIIIIIlI[0]] = lIlIIIlIIll("WwdBiDzZrTk=", "hxxiV");
        lIlllIlIl[llIIIIIlI[2]] = lIlIIIlIIll("8tcwmYYw+Yk=", "tLXgO");
        lIlllIlIl[llIIIIIlI[3]] = lIlIIIlIlII("LFFGlfwH+Rc=", "BOfTK");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (lIlIlIIIllI(Inventory.contains(item -> {
            return item.getName().contains(lIlllIlIl[llIIIIIlI[3]]);
        }) ? 1 : 0)) {
            return llIIIIIlI[0];
        }
        List all = Inventory.getAll(item2 -> {
            return item2.getName().contains(lIlllIlIl[llIIIIIlI[2]]);
        });
        int lIlllIIIIlIIIII = llIIIIIlI[0];
        while (lIlIlIIIlll(lIlllIIIIlIIIII, Math.min(llIIIIIlI[1], all.size()))) {
            ((Item) all.get(lIlllIIIIlIIIII)).interact(lIlllIlIl[llIIIIIlI[0]]);
            lIlllIIIIlIIIII++;
            "".length();
            if (((10 ^ 7) ^ (200 ^ 193)) < 0) {
                return ((((21 + 53) - (-38)) + 20) ^ (((115 + 97) - 171) + 113)) & (((((117 + 161) - 146) + 30) ^ (((157 + 66) - 151) + 116)) ^ (-" ".length()));
            }
        }
        return llIIIIIlI[2];
    }

    private static boolean lIlIlIIIllI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIlIIIlll(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIIlIIll(String lIlllIIIIIIlIll, String lIlllIIIIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), llIIIIIlI[1]), "DES");
            Cipher lIlllIIIIIIllIl = Cipher.getInstance("DES");
            lIlllIIIIIIllIl.init(llIIIIIlI[3], secretKeySpec);
            return new String(lIlllIIIIIIllIl.doFinal(Base64.getDecoder().decode(lIlllIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIIIIllII) {
            lIlllIIIIIIllII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIlIlII(String lIlllIIIIIllIII, String lIlllIIIIIlIlll) {
        try {
            SecretKeySpec lIlllIIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIIlI[3], lIlllIIIIIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIIIllIIl) {
            lIlllIIIIIllIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIIIlIl();
        lIlIIIlIlIl();
    }

    private static void lIlIlIIIlIl() {
        llIIIIIlI = new int[5];
        llIIIIIlI[0] = (4 ^ 83) & ((205 ^ 154) ^ (-1));
        llIIIIIlI[1] = (111 ^ 1) ^ (243 ^ 149);
        llIIIIIlI[2] = " ".length();
        llIIIIIlI[3] = "  ".length();
        llIIIIIlI[4] = "   ".length();
    }
}
