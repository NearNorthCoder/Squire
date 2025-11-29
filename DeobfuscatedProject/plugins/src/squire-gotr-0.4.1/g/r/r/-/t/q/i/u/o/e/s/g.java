/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Force Leaving Altar")
public class g
extends Task {
    private static /* synthetic */ int[] llIIllIllIII;
    private static /* synthetic */ String[] llIIllIlIlll;
    private final /* synthetic */ SquireGOTRPlugin aQ;

    @Inject
    public g(SquireGOTRPlugin squireGOTRPlugin) {
        this.aQ = squireGOTRPlugin;
    }

    private static boolean llllllIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllllIlIlIIll(String lllllllllllllllIlIIllIIllllIllII, String lllllllllllllllIlIIllIIllllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIlllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIIlllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIIlllllIIII.init(llIIllIllIII[3], lllllllllllllllIlIIllIIlllllIIIl);
            return new String(lllllllllllllllIlIIllIIlllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIllllIllll) {
            lllllllllllllllIlIIllIIllllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIllIIl(Object object) {
        return object != null;
    }

    static {
        g.llllllIlIlIlIl();
        g.llllllIlIlIlII();
    }

    private static boolean llllllIlIlIlll(Object object) {
        return object == null;
    }

    private static boolean llllllIlIlIllI(int n2) {
        return n2 != 0;
    }

    private static void llllllIlIlIlIl() {
        llIIllIllIII = new int[5];
        g.llIIllIllIII[0] = (253 + 208 - 265 + 59 ^ 155 + 146 - 210 + 77) & (46 + 120 - 116 + 168 ^ 120 + 20 - 93 + 94 ^ -" ".length()) & ((0x42 ^ 0x58 ^ " ".length()) & (142 + 86 - 118 + 72 ^ 56 + 172 - 175 + 120 ^ -" ".length()) ^ -" ".length());
        g.llIIllIllIII[1] = " ".length();
        g.llIIllIllIII[2] = 0xFFFFE8FF & Short.MAX_VALUE;
        g.llIIllIllIII[3] = "  ".length();
        g.llIIllIllIII[4] = "   ".length();
    }

    private static boolean llllllIlIllIII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (g.llllllIlIlIllI(this.aQ.g() ? 1 : 0)) {
            return llIIllIllIII[0];
        }
        TileObject lllllllllllllllIlIIllIIllllllIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.llllllIlIlIllI(tileObject.getName().contains(llIIllIlIlll[llIIllIllIII[1]]) ? 1 : 0) && g.llllllIlIlIllI(tileObject.hasAction(string -> {
                int n2;
                if (g.llllllIlIllIIl(string) && g.llllllIlIlIllI(string.equals(llIIllIlIlll[llIIllIllIII[3]]) ? 1 : 0)) {
                    n2 = llIIllIllIII[1];
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return ((0x16 ^ 0x1D) & ~(0x2F ^ 0x24)) != 0;
                    }
                } else {
                    n2 = llIIllIllIII[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = llIIllIllIII[1];
                "".length();
                if (null != null) {
                    return ((68 + 11 - 25 + 78 ^ 168 + 101 - 220 + 126) & (0x2A ^ 0x3A ^ (0xA7 ^ 0x9C) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIllIllIII[0];
            }
            return n2 != 0;
        });
        if (g.llllllIlIlIlll(lllllllllllllllIlIIllIIllllllIlI)) {
            return llIIllIllIII[0];
        }
        int[] nArray = new int[llIIllIllIII[1]];
        nArray[g.llIIllIllIII[0]] = llIIllIllIII[2];
        if (g.llllllIlIllIII(Inventory.getCount((int[])nArray))) {
            return llIIllIllIII[0];
        }
        var1_1.interact(llIIllIlIlll[llIIllIllIII[0]]);
        return llIIllIllIII[1];
    }

    private static String llllllIlIlIIlI(String lllllllllllllllIlIIllIIlllIllIIl, String lllllllllllllllIlIIllIIlllIllIII) {
        lllllllllllllllIlIIllIIlllIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIlllIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIllIIlllIllIll = lllllllllllllllIlIIllIIlllIllIII.toCharArray();
        int lllllllllllllllIlIIllIIlllIllIlI = llIIllIllIII[0];
        char[] lllllllllllllllIlIIllIIlllIlIlII = lllllllllllllllIlIIllIIlllIllIIl.toCharArray();
        int lllllllllllllllIlIIllIIlllIlIIll = lllllllllllllllIlIIllIIlllIlIlII.length;
        int lllllllllllllllIlIIllIIlllIlIIlI = llIIllIllIII[0];
        while (g.llllllIlIllIlI(lllllllllllllllIlIIllIIlllIlIIlI, lllllllllllllllIlIIllIIlllIlIIll)) {
            char lllllllllllllllIlIIllIIlllIlllll = lllllllllllllllIlIIllIIlllIlIlII[lllllllllllllllIlIIllIIlllIlIIlI];
            lllllllllllllllIlIIllIIlllIlllII.append((char)(lllllllllllllllIlIIllIIlllIlllll ^ lllllllllllllllIlIIllIIlllIllIll[lllllllllllllllIlIIllIIlllIllIlI % lllllllllllllllIlIIllIIlllIllIll.length]));
            "".length();
            ++lllllllllllllllIlIIllIIlllIllIlI;
            ++lllllllllllllllIlIIllIIlllIlIIlI;
            "".length();
            if ("   ".length() != " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllIIlllIlllII);
    }

    private static void llllllIlIlIlII() {
        llIIllIlIlll = new String[llIIllIllIII[4]];
        g.llIIllIlIlll[g.llIIllIllIII[0]] = g.llllllIlIlIIlI("LgE+DDw=", "koJiN");
        g.llIIllIlIlll[g.llIIllIllIII[1]] = g.llllllIlIlIIlI("IhkHFjIe", "rvubS");
        g.llIIllIlIlll[g.llIIllIllIII[3]] = g.llllllIlIlIIll("s3oRhtgkxNU=", "TaEbb");
    }
}

