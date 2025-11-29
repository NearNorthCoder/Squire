/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", priority=50)
public class W
extends ad {
    private static /* synthetic */ String[] lIllIlIlIllll;
    private static /* synthetic */ int[] lIllIlIllIIll;

    private static boolean llIIlIIIIlIIIIl(Object object) {
        return object == null;
    }

    private static boolean llIIlIIIIlIIllI(Object object) {
        return object != null;
    }

    static {
        W.llIIlIIIIlIIIII();
        W.llIIlIIIIIlllIl();
    }

    private static void llIIlIIIIlIIIII() {
        lIllIlIllIIll = new int[10];
        W.lIllIlIllIIll[0] = (0xA8 ^ 0xC6 ^ (0x6B ^ 0x13)) & (113 + 11 - -23 + 16 ^ 106 + 166 - 162 + 71 ^ -" ".length());
        W.lIllIlIllIIll[1] = -(0xFFFFD97B & 0x66A6) & (0xFFFFF7F7 & 0x5BF9);
        W.lIllIlIllIIll[2] = 0x96 ^ 0x82;
        W.lIllIlIllIIll[3] = " ".length();
        W.lIllIlIllIIll[4] = -(0xFFFFF0A6 & Short.MAX_VALUE) & (0xFFFFFEFF & 0x7DED);
        W.lIllIlIllIIll[5] = "  ".length();
        W.lIllIlIllIIll[6] = "   ".length();
        W.lIllIlIllIIll[7] = 172 + 14 - 81 + 80 ^ 138 + 16 - 33 + 68;
        W.lIllIlIllIIll[8] = 0x33 ^ 0x50 ^ (0x4F ^ 0x29);
        W.lIllIlIllIIll[9] = 0x31 ^ 0x39;
    }

    private static boolean llIIlIIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static String llIIlIIIIIllIII(String llllllllllllllIllIIIllIlIlIIIlIl, String llllllllllllllIllIIIllIlIlIIIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIlIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), lIllIlIllIIll[9]), "DES");
            Cipher llllllllllllllIllIIIllIlIlIIlIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIllIlIlIIlIIl.init(lIllIlIllIIll[5], llllllllllllllIllIIIllIlIlIIlIlI);
            return new String(llllllllllllllIllIIIllIlIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllIlIlIIlIII) {
            llllllllllllllIllIIIllIlIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIIIlllII(String llllllllllllllIllIIIllIlIIllIlll, String llllllllllllllIllIIIllIlIIllIIIl) {
        llllllllllllllIllIIIllIlIIllIlll = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIlIIllIlIl = new StringBuilder();
        char[] llllllllllllllIllIIIllIlIIllIlII = llllllllllllllIllIIIllIlIIllIIIl.toCharArray();
        int llllllllllllllIllIIIllIlIIllIIll = lIllIlIllIIll[0];
        char[] llllllllllllllIllIIIllIlIIlIllIl = llllllllllllllIllIIIllIlIIllIlll.toCharArray();
        int llllllllllllllIllIIIllIlIIlIllII = llllllllllllllIllIIIllIlIIlIllIl.length;
        int llllllllllllllIllIIIllIlIIlIlIll = lIllIlIllIIll[0];
        while (W.llIIlIIIIlIlIIl(llllllllllllllIllIIIllIlIIlIlIll, llllllllllllllIllIIIllIlIIlIllII)) {
            char llllllllllllllIllIIIllIlIIlllIII = llllllllllllllIllIIIllIlIIlIllIl[llllllllllllllIllIIIllIlIIlIlIll];
            llllllllllllllIllIIIllIlIIllIlIl.append((char)(llllllllllllllIllIIIllIlIIlllIII ^ llllllllllllllIllIIIllIlIIllIlII[llllllllllllllIllIIIllIlIIllIIll % llllllllllllllIllIIIllIlIIllIlII.length]));
            "".length();
            ++llllllllllllllIllIIIllIlIIllIIll;
            ++llllllllllllllIllIIIllIlIIlIlIll;
            "".length();
            if ("  ".length() == "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIllIlIIllIlIl);
    }

    private static void llIIlIIIIIlllIl() {
        lIllIlIlIllll = new String[lIllIlIllIIll[8]];
        W.lIllIlIlIllll[W.lIllIlIllIIll[0]] = W.llIIlIIIIIllIII("Uv0qqA+0hqI=", "BylTF");
        W.lIllIlIlIllll[W.lIllIlIllIIll[3]] = W.llIIlIIIIIllIIl("P5oUu2+5TRc=", "GHIAi");
        W.lIllIlIlIllll[W.lIllIlIllIIll[5]] = W.llIIlIIIIIlllII("FxsF", "RzqVT");
        W.lIllIlIlIllll[W.lIllIlIllIIll[6]] = W.llIIlIIIIIlllII("HAA1", "YaAqb");
        W.lIllIlIlIllll[W.lIllIlIllIIll[7]] = W.llIIlIIIIIllIIl("H1US+RqeqnQ=", "coTpo");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void llllllllllllllIllIIIllIlIlIlIIlI;
        W llllllllllllllIllIIIllIlIlIlIIll;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (W.llIIlIIIIlIlIII(item.hasAction(lIllIlIlIllll[lIllIlIllIIll[7]]::equals) ? 1 : 0) && W.llIIlIIIIlIIlll(item.getId(), lIllIlIllIIll[4])) {
                n2 = lIllIlIllIIll[3];
                "".length();
                if (-(0xF ^ 0x25 ^ (0x36 ^ 0x19)) >= 0) {
                    return ((0xD0 ^ 0xB2 ^ (0x43 ^ 0xE)) & (33 + 1 - 12 + 108 ^ 66 + 119 - 131 + 119 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIllIlIllIIll[0];
            }
            return n2 != 0;
        });
        if (W.llIIlIIIIlIIIIl(item2) && W.llIIlIIIIlIIIIl(item2 = Inventory.getFirst(item -> item.hasAction(lIllIlIlIllll[lIllIlIllIIll[6]]::equals)))) {
            return lIllIlIllIIll[0];
        }
        if (W.llIIlIIIIlIIIll(llllllllllllllIllIIIllIlIlIlIIll.az.W().getAnimation(), lIllIlIllIIll[1])) {
            int llllllllllllllIllIIIllIlIlIlIIIl = Combat.getMissingHealth();
            if (W.llIIlIIIIlIIlII(llllllllllllllIllIIIllIlIlIlIIIl, lIllIlIllIIll[2])) {
                llllllllllllllIllIIIllIlIlIlIIlI.interact(lIllIlIlIllll[lIllIlIllIIll[0]]);
                return lIllIlIllIIll[3];
            }
            return lIllIlIllIIll[0];
        }
        if (W.llIIlIIIIlIIlIl(Combat.getCurrentHealth(), llllllllllllllIllIIIllIlIlIlIIll.aA.eatAtHP())) {
            llllllllllllllIllIIIllIlIlIlIIlI.interact(lIllIlIlIllll[lIllIlIllIIll[3]]);
            int[] nArray = new int[lIllIlIllIIll[3]];
            nArray[W.lIllIlIllIIll[0]] = lIllIlIllIIll[4];
            Item llllllllllllllIllIIIllIlIlIlIIIl = Inventory.getFirst((int[])nArray);
            if (W.llIIlIIIIlIIllI(llllllllllllllIllIIIllIlIlIlIIIl) && W.llIIlIIIIlIIlll(llllllllllllllIllIIIllIlIlIlIIlI.getId(), lIllIlIllIIll[4])) {
                llllllllllllllIllIIIllIlIlIlIIIl.interact(lIllIlIlIllll[lIllIlIllIIll[5]]);
            }
            return lIllIlIllIIll[3];
        }
        return lIllIlIllIIll[0];
    }

    private static boolean llIIlIIIIlIIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected W(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static boolean llIIlIIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlIIIIIllIIl(String llllllllllllllIllIIIllIlIIlIIIII, String llllllllllllllIllIIIllIlIIIlllll) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIlIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIlIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllIlIIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllIlIIlIIlII.init(lIllIlIllIIll[5], llllllllllllllIllIIIllIlIIlIIlIl);
            return new String(llllllllllllllIllIIIllIlIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllIlIIlIIIll) {
            llllllllllllllIllIIIllIlIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIIlIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIIIIlIIlII(int n2, int n3) {
        return n2 > n3;
    }
}

