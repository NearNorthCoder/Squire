/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Anti Poison")
public class f
extends Task {
    private static /* synthetic */ int[] lIlIIlIIIllll;
    private static /* synthetic */ String[] lIlIIlIIIlllI;

    private static String lIlllIlIIlIIIll(String llllllllllllllIllIlllIlllIllllII, String llllllllllllllIllIlllIllllIIIIII) {
        llllllllllllllIllIlllIlllIllllII = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIlllIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIlllIllllll = new StringBuilder();
        char[] llllllllllllllIllIlllIlllIlllllI = llllllllllllllIllIlllIllllIIIIII.toCharArray();
        int llllllllllllllIllIlllIlllIllllIl = lIlIIlIIIllll[0];
        char[] llllllllllllllIllIlllIlllIllIlll = llllllllllllllIllIlllIlllIllllII.toCharArray();
        int llllllllllllllIllIlllIlllIllIllI = llllllllllllllIllIlllIlllIllIlll.length;
        int llllllllllllllIllIlllIlllIllIlIl = lIlIIlIIIllll[0];
        while (f.lIlllIlIIlIlIIl(llllllllllllllIllIlllIlllIllIlIl, llllllllllllllIllIlllIlllIllIllI)) {
            char llllllllllllllIllIlllIllllIIIIlI = llllllllllllllIllIlllIlllIllIlll[llllllllllllllIllIlllIlllIllIlIl];
            llllllllllllllIllIlllIlllIllllll.append((char)(llllllllllllllIllIlllIllllIIIIlI ^ llllllllllllllIllIlllIlllIlllllI[llllllllllllllIllIlllIlllIllllIl % llllllllllllllIllIlllIlllIlllllI.length]));
            "".length();
            ++llllllllllllllIllIlllIlllIllllIl;
            ++llllllllllllllIllIlllIlllIllIlIl;
            "".length();
            if (((0xEB ^ 0x9A ^ (0xD0 ^ 0xB7)) & (0x6C ^ 0x67 ^ (0x57 ^ 0x4A) ^ -" ".length())) < "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlllIlllIllllll);
    }

    private static void lIlllIlIIlIIllI() {
        lIlIIlIIIllll = new int[5];
        f.lIlIIlIIIllll[0] = (0x31 ^ 0x27) & ~(0x5C ^ 0x4A);
        f.lIlIIlIIIllll[1] = " ".length();
        f.lIlIIlIIIllll[2] = "  ".length();
        f.lIlIIlIIIllll[3] = "   ".length();
        f.lIlIIlIIIllll[4] = 0xC4 ^ 0x81 ^ (0xFB ^ 0xBA);
    }

    private static void lIlllIlIIlIIlIl() {
        lIlIIlIIIlllI = new String[lIlIIlIIIllll[4]];
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[0]] = f.lIlllIlIIlIIIll("EyEzJxE=", "WSZIz");
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[1]] = f.lIlllIlIIlIIlII("E2UWVHkF7Ws=", "XDKsR");
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[2]] = f.lIlllIlIIlIIlII("d9aIWwpi4nY=", "bkeWc");
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[3]] = f.lIlllIlIIlIIlII("0Cws6wfmhZQ=", "EySfy");
    }

    private static boolean lIlllIlIIlIIlll(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (f.lIlllIlIIlIIlll(Combat.isPoisoned() ? 1 : 0)) {
            return lIlIIlIIIllll[0];
        }
        if (f.lIlllIlIIlIIlll(Inventory.contains(item -> {
            int n2;
            if (f.lIlllIlIIlIlIII(item.getName().toLowerCase().contains(lIlIIlIIIlllI[lIlIIlIIIllll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIllll[1]];
                stringArray[f.lIlIIlIIIllll[0]] = lIlIIlIIIlllI[lIlIIlIIIllll[3]];
                if (f.lIlllIlIIlIlIII(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIIllll[1];
                    "".length();
                    if (-" ".length() <= (0x99 ^ 0x9D)) return n2 != 0;
                    return ((0x6B ^ 0x6F) & ~(0xB1 ^ 0xB5)) != 0;
                }
            }
            n2 = lIlIIlIIIllll[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIlIIlIIIllll[0];
        }
        Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIIlIIIlllI[lIlIIlIIIllll[1]])).interact(lIlIIlIIIlllI[lIlIIlIIIllll[0]]);
        return lIlIIlIIIllll[1];
    }

    private static String lIlllIlIIlIIlII(String llllllllllllllIllIlllIllllIlIIIl, String llllllllllllllIllIlllIllllIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIllllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIllllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIllllIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIllllIlIIll.init(lIlIIlIIIllll[2], llllllllllllllIllIlllIllllIlIlII);
            return new String(llllllllllllllIllIlllIllllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIllllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIllllIlIIlI) {
            llllllllllllllIllIlllIllllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIlIIlIlIII(int n2) {
        return n2 != 0;
    }

    static {
        f.lIlllIlIIlIIllI();
        f.lIlllIlIIlIIlIl();
    }
}

