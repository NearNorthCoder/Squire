/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Attacking Chompy", priority=100, blocking=true)
public class aZ
extends Task {
    private static /* synthetic */ String[] llIlllll;
    private static /* synthetic */ int[] lllIIIIl;

    private static void llIIIllIll() {
        llIlllll = new String[lllIIIIl[5]];
        aZ.llIlllll[aZ.lllIIIIl[1]] = aZ.llIIIlIIll("QHlumTXhoEk=", "AaIuX");
        aZ.llIlllll[aZ.lllIIIIl[3]] = aZ.llIIIlIlII("oLStvShw2HVd0LkeabpGwA==", "ZmZNr");
        aZ.llIlllll[aZ.lllIIIIl[2]] = aZ.llIIIlIlII("ZZyQnrkc5eY=", "GzsEH");
        aZ.llIlllll[aZ.lllIIIIl[4]] = aZ.llIIIlIIll("x57yB/IohOs=", "XlafY");
    }

    private static void llIIIlllII() {
        lllIIIIl = new int[7];
        aZ.lllIIIIl[0] = -(0xFFFFCFFF & 0x7BEE) & (0xFFFFEFEF & 0x5FFF);
        aZ.lllIIIIl[1] = (0xC9 ^ 0xB9 ^ (0xD3 ^ 0x9E)) & (125 + 21 - 22 + 31 ^ 64 + 98 - 74 + 78 ^ -" ".length());
        aZ.lllIIIIl[2] = "  ".length();
        aZ.lllIIIIl[3] = " ".length();
        aZ.lllIIIIl[4] = "   ".length();
        aZ.lllIIIIl[5] = 0x40 ^ 0x44 ^ (0x13 ^ 0x49) & ~(0x52 ^ 8);
        aZ.lllIIIIl[6] = 0x39 ^ 0x31;
    }

    private static String llIIIlIlII(String llIlIlIIIIlIIII, String llIlIlIIIIlIIIl) {
        try {
            SecretKeySpec llIlIlIIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIlIIIIlIlII = Cipher.getInstance("Blowfish");
            llIlIlIIIIlIlII.init(lllIIIIl[2], llIlIlIIIIlIlIl);
            return new String(llIlIlIIIIlIlII.doFinal(Base64.getDecoder().decode(llIlIlIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIlIIIIlIIll) {
            llIlIlIIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIIll(String llIlIlIIIIlllIl, String llIlIlIIIIlllII) {
        try {
            SecretKeySpec llIlIlIIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), lllIIIIl[6]), "DES");
            Cipher llIlIlIIIlIIIIl = Cipher.getInstance("DES");
            llIlIlIIIlIIIIl.init(lllIIIIl[2], llIlIlIIIlIIIlI);
            return new String(llIlIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(llIlIlIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIlIIIlIIIII) {
            llIlIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIII(int n2) {
        return n2 != 0;
    }

    static {
        aZ.llIIIlllII();
        aZ.llIIIllIll();
    }

    private static boolean llIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llIlIlIIIlIlIIl;
        NPC nPC2 = Combat.getAttackableNPC(nPC -> {
            int n2;
            if (aZ.llIIlIIIII(nPC.getName().equals(llIlllll[lllIIIIl[3]]) ? 1 : 0) && aZ.llIIlIIIIl(nPC.isDead() ? 1 : 0)) {
                String[] stringArray = new String[lllIIIIl[3]];
                stringArray[aZ.lllIIIIl[1]] = llIlllll[lllIIIIl[2]];
                if (aZ.llIIlIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIIIIl[3]];
                    stringArray2[aZ.lllIIIIl[1]] = llIlllll[lllIIIIl[4]];
                    if (aZ.llIIlIIIIl(nPC.hasAction(stringArray2) ? 1 : 0)) {
                        n2 = lllIIIIl[3];
                        "".length();
                        if (null == null) return n2 != 0;
                        return ((0x85 ^ 0x93 ^ (0x5F ^ 0x19)) & (0x59 ^ 0x3F ^ (0x7C ^ 0x4A) ^ -" ".length())) != 0;
                    }
                }
            }
            n2 = lllIIIIl[1];
            return n2 != 0;
        });
        if (aZ.llIIIlllIl(Players.getLocal().getAnimation(), lllIIIIl[0])) {
            return lllIIIIl[1];
        }
        if (aZ.llIIIllllI(Players.getLocal().getInteracting())) {
            return lllIIIIl[1];
        }
        if (aZ.llIIIlllll(llIlIlIIIlIlIIl)) {
            return lllIIIIl[1];
        }
        nPC2.interact(llIlllll[lllIIIIl[1]]);
        this.sleep(lllIIIIl[2]);
        return lllIIIIl[3];
    }

    private static boolean llIIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlllll(Object object) {
        return object == null;
    }

    private static boolean llIIIllllI(Object object) {
        return object != null;
    }
}

