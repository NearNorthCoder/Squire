/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
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
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

/* TASK: Plucking bird -> PluckingbirdTask */
@TaskDesc(name="Plucking bird", priority=25)
public class PluckingBirdTask
extends Task {
    private static /* synthetic */ int[] lIlIlIlll;
    private static /* synthetic */ String[] lIlIIlIII;

    private static boolean lIIllIIIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void lIllllllIIIlllI;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bc.lIIllIIIlII(nPC.getName().equalsIgnoreCase(lIlIIlIII[lIlIlIlll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIlll[2]];
                stringArray[bc.lIlIlIlll[0]] = lIlIIlIII[lIlIlIlll[1]];
                if (bc.lIIllIIIlII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIlll[2];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x16 ^ 0x29 ^ (0x86 ^ 0xA7)) & (23 + 26 - 47 + 162 ^ 138 + 54 - 37 + 31 ^ -1)) != 0;
                }
            }
            n2 = lIlIlIlll[0];
            return n2 != 0;
        });
        if (bc.lIIllIIIIlI(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIlIlll[0];
        }
        if (bc.lIIllIIIIll(lIllllllIIIlllI)) {
            return lIlIlIlll[0];
        }
        nPC2.interact(lIlIIlIII[lIlIlIlll[0]]);
        this.sleep(lIlIlIlll[1]);
        return lIlIlIlll[2];
    }

    private static void lIIllIIIIII() {
        lIlIIlIII = new String[lIlIlIlll[3]];
        bc.lIlIIlIII[bc.lIlIlIlll[0]] = bc."Pluck";
        bc.lIlIIlIII[bc.lIlIlIlll[2]] = bc."chompy bird";
        bc.lIlIIlIII[bc.lIlIlIlll[1]] = bc."Pluck";
    }

    private static String lIIlIIIIlII(String lIllllllIIIIlII, String lIllllllIIIIIll) {
        try {
            SecretKeySpec lIllllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllllIIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlll[4]), "DES");
            Cipher lIllllllIIIIllI = Cipher.getInstance("DES");
            lIllllllIIIIllI.init(lIlIlIlll[1], lIllllllIIIIlll);
            return new String(lIllllllIIIIllI.doFinal(Base64.getDecoder().decode(lIllllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllllIIIIlIl) {
            lIllllllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIllIIIIIl() {
        lIlIlIlll = new int[5];
        bc.lIlIlIlll[0] = (3 ^ 0x2C) & ~(0x38 ^ 0x17);
        bc.lIlIlIlll[1] = 2;
        bc.lIlIlIlll[2] = 1;
        bc.lIlIlIlll[3] = 3;
        bc.lIlIlIlll[4] = 0x11 ^ 0x73 ^ (0xF5 ^ 0x9F);
    }

    private static boolean lIIllIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bc.lIIllIIIIIl();
        bc.lIIllIIIIII();
    }

    private static boolean lIIllIIIIll(Object object) {
        return object == null;
    }

    private static String lIIlIlllllI(String lIlllllIlllIlII, String lIlllllIllIlllI) {
        lIlllllIlllIlII = new String(Base64.getDecoder().decode(lIlllllIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllllIlllIIlI = new StringBuilder();
        char[] lIlllllIlllIIIl = lIlllllIllIlllI.toCharArray();
        int lIlllllIlllIIII = lIlIlIlll[0];
        char[] lIlllllIllIlIlI = lIlllllIlllIlII.toCharArray();
        int lIlllllIllIlIIl = lIlllllIllIlIlI.length;
        int lIlllllIllIlIII = lIlIlIlll[0];
        while (bc.lIIllIIIlIl(lIlllllIllIlIII, lIlllllIllIlIIl)) {
            char lIlllllIlllIlIl = lIlllllIllIlIlI[lIlllllIllIlIII];
            lIlllllIlllIIlI.append((char)(lIlllllIlllIlIl ^ lIlllllIlllIIIl[lIlllllIlllIIII % lIlllllIlllIIIl.length]));
            0;
            ++lIlllllIlllIIII;
            ++lIlllllIllIlIII;
            0;
            if (2 < (47 + 43 - -19 + 78 ^ 77 + 138 - 177 + 153)) continue;
            return null;
        }
        return String.valueOf(lIlllllIlllIIlI);
    }

    private static String lIIlIllllll(String lIlllllIlIlllll, String lIlllllIlIlllII) {
        try {
            SecretKeySpec lIlllllIllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllllIllIIIIl = Cipher.getInstance("Blowfish");
            lIlllllIllIIIIl.init(lIlIlIlll[1], lIlllllIllIIIlI);
            return new String(lIlllllIllIIIIl.doFinal(Base64.getDecoder().decode(lIlllllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllllIllIIIII) {
            lIlllllIllIIIII.printStackTrace();
            return null;
        }
    }
}

