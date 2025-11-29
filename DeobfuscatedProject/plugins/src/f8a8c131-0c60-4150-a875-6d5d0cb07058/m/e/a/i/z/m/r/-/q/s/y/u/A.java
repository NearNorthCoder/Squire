/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.e;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Killing minions", priority=2, blocking=true)
public class A
extends Task {
    private static /* synthetic */ String[] lIllIIIllllII;
    private static /* synthetic */ int[] lIllIIIlllllI;
    private final /* synthetic */ SquireZammyConfig ay;
    private final /* synthetic */ l ax;

    static {
        A.llIIIlIlIlllIll();
        A.llIIIlIlIlllIII();
    }

    private static String llIIIlIlIllIllI(String llllllllllllllIllIIlIlIlllIlIIlI, String llllllllllllllIllIIlIlIlllIIllll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIlllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIlllIIllll.getBytes(StandardCharsets.UTF_8)), lIllIIIlllllI[6]), "DES");
            Cipher llllllllllllllIllIIlIlIlllIlIlII = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIlllIlIlII.init(lIllIIIlllllI[4], llllllllllllllIllIIlIlIlllIlIlIl);
            return new String(llllllllllllllIllIIlIlIlllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIlllIlIIll) {
            llllllllllllllIllIIlIlIlllIlIIll.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIlIlllIll() {
        lIllIIIlllllI = new int[7];
        A.lIllIIIlllllI[0] = (77 + 124 - 174 + 117 ^ 27 + 107 - -33 + 18) & (0x53 ^ 0x32 ^ (0xF9 ^ 0xB1) ^ -" ".length());
        A.lIllIIIlllllI[1] = " ".length();
        A.lIllIIIlllllI[2] = 0 ^ 0x32;
        A.lIllIIIlllllI[3] = 108 + 71 - 168 + 176 ^ 97 + 84 - 173 + 169;
        A.lIllIIIlllllI[4] = "  ".length();
        A.lIllIIIlllllI[5] = "   ".length();
        A.lIllIIIlllllI[6] = 0x3A ^ 0x32;
    }

    private static void llIIIlIlIlllIII() {
        lIllIIIllllII = new String[lIllIIIlllllI[5]];
        A.lIllIIIllllII[A.lIllIIIlllllI[0]] = A.llIIIlIlIllIlII("LBoqHAVYFz4aEQgcIhA=", "xuRuf");
        A.lIllIIIllllII[A.lIllIIIlllllI[1]] = A.llIIIlIlIllIllI("C9je6IuUTXw=", "bZQtW");
        A.lIllIIIllllII[A.lIllIIIlllllI[4]] = A.llIIIlIlIllIlll("5ZH9lhHSY6U=", "ttpSL");
    }

    @Inject
    public A(l l2, SquireZammyConfig squireZammyConfig) {
        this.ax = l2;
        this.ay = squireZammyConfig;
    }

    private static boolean llIIIlIlIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIIIlIlIllIlII(String llllllllllllllIllIIlIlIllllIIIlI, String llllllllllllllIllIIlIlIllllIIllI) {
        llllllllllllllIllIIlIlIllllIIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlIllllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIlIllllIIlIl = new StringBuilder();
        char[] llllllllllllllIllIIlIlIllllIIlII = llllllllllllllIllIIlIlIllllIIllI.toCharArray();
        int llllllllllllllIllIIlIlIllllIIIll = lIllIIIlllllI[0];
        char[] llllllllllllllIllIIlIlIlllIlllIl = llllllllllllllIllIIlIlIllllIIIlI.toCharArray();
        int llllllllllllllIllIIlIlIlllIlllII = llllllllllllllIllIIlIlIlllIlllIl.length;
        int llllllllllllllIllIIlIlIlllIllIll = lIllIIIlllllI[0];
        while (A.llIIIlIllIIIIIl(llllllllllllllIllIIlIlIlllIllIll, llllllllllllllIllIIlIlIlllIlllII)) {
            char llllllllllllllIllIIlIlIllllIlIII = llllllllllllllIllIIlIlIlllIlllIl[llllllllllllllIllIIlIlIlllIllIll];
            llllllllllllllIllIIlIlIllllIIlIl.append((char)(llllllllllllllIllIIlIlIllllIlIII ^ llllllllllllllIllIIlIlIllllIIlII[llllllllllllllIllIIlIlIllllIIIll % llllllllllllllIllIIlIlIllllIIlII.length]));
            "".length();
            ++llllllllllllllIllIIlIlIllllIIIll;
            ++llllllllllllllIllIIlIlIlllIllIll;
            "".length();
            if ("   ".length() > ((204 + 216 - 281 + 101 ^ 64 + 143 - 171 + 111) & (0xB8 ^ 0xA2 ^ (0x35 ^ 0x4C) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIlIllllIIlIl);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        A llllllllllllllIllIIlIllIIIIIIIIl;
        if (!A.llIIIlIlIllllII(this.ax.B() ? 1 : 0) || A.llIIIlIlIllllII(this.ax.A() ? 1 : 0)) {
            return lIllIIIlllllI[0];
        }
        int[] nArray = new int[lIllIIIlllllI[1]];
        nArray[A.lIllIIIlllllI[0]] = e.BALFRUG_KREEYATH.n();
        NPC llllllllllllllIllIIlIllIIIIIIIII = NPCs.getNearest((int[])nArray);
        if (!A.llIIIlIlIllllIl(llllllllllllllIllIIlIllIIIIIIIII) || A.llIIIlIlIllllII(llllllllllllllIllIIlIllIIIIIIIII.isDead() ? 1 : 0)) {
            return lIllIIIlllllI[0];
        }
        if (A.llIIIlIlIllllII(llllllllllllllIllIIlIllIIIIIIIIl.ay.useBlowpipe() ? 1 : 0) && A.llIIIlIlIlllllI(Combat.getSpecEnergy(), lIllIIIlllllI[2]) && A.llIIIlIlIllllll(Combat.getMissingHealth(), lIllIIIlllllI[3])) {
            String[] stringArray = new String[lIllIIIlllllI[1]];
            stringArray[A.lIllIIIlllllI[0]] = lIllIIIllllII[lIllIIIlllllI[0]];
            Item llllllllllllllIllIIlIlIlllllllll = Inventory.getFirst((String[])stringArray);
            if (A.llIIIlIlIllllIl(llllllllllllllIllIIlIlIlllllllll)) {
                llllllllllllllIllIIlIlIlllllllll.interact(lIllIIIllllII[lIllIIIlllllI[1]]);
            }
            if (A.llIIIlIllIIIIII(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
            }
        }
        if (A.llIIIlIlIllllIl(Players.getLocal().getInteracting())) {
            return lIllIIIlllllI[0];
        }
        var1_1.interact(lIllIIIllllII[lIllIIIlllllI[4]]);
        this.sleep(lIllIIIlllllI[4]);
        return lIllIIIlllllI[1];
    }

    private static boolean llIIIlIlIllllIl(Object object) {
        return object != null;
    }

    private static boolean llIIIlIllIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlIlIllIlll(String llllllllllllllIllIIlIlIlllllIlIl, String llllllllllllllIllIIlIlIlllllIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIlllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIlIllllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIlIllllllIIl.init(lIllIIIlllllI[4], llllllllllllllIllIIlIlIllllllIlI);
            return new String(llllllllllllllIllIIlIlIllllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIllllllIII) {
            llllllllllllllIllIIlIlIllllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIlIllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIlIlIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIllIIIIII(int n2) {
        return n2 == 0;
    }
}

