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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.s.r.i.e.s.o.u.a.d.n.-.b.b;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

@TaskDesc(name="Killing minions")
public class q
extends Task {
    private static /* synthetic */ String[] lllIIIlllII;
    private final /* synthetic */ e aa;
    private static /* synthetic */ int[] lllIIIlllIl;
    private final /* synthetic */ SquireBandosConfig ab;

    static {
        q.lIlIlllIIlIlIl();
        q.lIlIlllIIlIlII();
    }

    /*
     * WARNING - void declaration
     */
    private NPC N() {
        int[] nArray = new int[lllIIIlllIl[1]];
        nArray[q.lllIIIlllIl[0]] = b.STEELWILL.d();
        NPC nPC2 = NPCs.getNearest((int[])nArray);
        if (q.lIlIlllIIllIII(nPC2) && q.lIlIlllIIllIIl(nPC2.isDead() ? 1 : 0)) {
            void llllllllllllllllIIlIIllIIIlIllII;
            return llllllllllllllllIIlIIllIIIlIllII;
        }
        int[] nArray2 = new int[lllIIIlllIl[1]];
        nArray2[q.lllIIIlllIl[0]] = b.STRONGSACK.d();
        NPC llllllllllllllllIIlIIllIIIlIlIll = NPCs.getNearest((int[])nArray2);
        if (q.lIlIlllIIllIII(llllllllllllllllIIlIIllIIIlIlIll) && q.lIlIlllIIllIIl(llllllllllllllllIIlIIllIIIlIlIll.isDead() ? 1 : 0)) {
            return llllllllllllllllIIlIIllIIIlIlIll;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (q.lIlIlllIIllIIl(nPC.isDead() ? 1 : 0) && q.lIlIlllIIlllII(nPC.getId(), b.GRIMSPIKE.d())) {
                n2 = lllIIIlllIl[1];
                "".length();
                if (((0x5B ^ 0x11) & ~(0xEC ^ 0xA6)) > " ".length()) {
                    return ((0x56 ^ 0x6F) & ~(0xB2 ^ 0x8B)) != 0;
                }
            } else {
                n2 = lllIIIlllIl[0];
            }
            return n2 != 0;
        });
    }

    private static String lIlIlllIIlIIIl(String llllllllllllllllIIlIIllIIIlIIIIl, String llllllllllllllllIIlIIllIIIlIIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIIlIIIII.getBytes(StandardCharsets.UTF_8)), lllIIIlllIl[6]), "DES");
            Cipher llllllllllllllllIIlIIllIIIlIIIll = Cipher.getInstance("DES");
            llllllllllllllllIIlIIllIIIlIIIll.init(lllIIIlllIl[4], llllllllllllllllIIlIIllIIIlIIlII);
            return new String(llllllllllllllllIIlIIllIIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIIIlIIIlI) {
            llllllllllllllllIIlIIllIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlllIIlIlll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q llllllllllllllllIIlIIllIIIllIIIl;
        if (!q.lIlIlllIIlIllI(this.aa.t() ? 1 : 0) || q.lIlIlllIIlIllI(this.aa.s() ? 1 : 0)) {
            return lllIIIlllIl[0];
        }
        NPC llllllllllllllllIIlIIllIIIllIIII = llllllllllllllllIIlIIllIIIllIIIl.N();
        if (q.lIlIlllIIlIlll(llllllllllllllllIIlIIllIIIllIIII)) {
            return lllIIIlllIl[0];
        }
        if (q.lIlIlllIIllIII(Players.getLocal().getInteracting())) {
            return lllIIIlllIl[0];
        }
        if (q.lIlIlllIIlIllI(llllllllllllllllIIlIIllIIIllIIIl.ab.useBlowpipe() ? 1 : 0)) {
            String[] stringArray = new String[lllIIIlllIl[1]];
            stringArray[q.lllIIIlllIl[0]] = lllIIIlllII[lllIIIlllIl[0]];
            Item llllllllllllllllIIlIIllIIIlIllll = Inventory.getFirst((String[])stringArray);
            if (q.lIlIlllIIllIII(llllllllllllllllIIlIIllIIIlIllll)) {
                llllllllllllllllIIlIIllIIIlIllll.interact(lllIIIlllII[lllIIIlllIl[1]]);
                return lllIIIlllIl[1];
            }
            if (q.lIlIlllIIllIIl(Combat.isSpecEnabled() ? 1 : 0) && q.lIlIlllIIllIlI(Combat.getSpecEnergy(), lllIIIlllIl[2]) && q.lIlIlllIIllIll(Combat.getMissingHealth(), lllIIIlllIl[3])) {
                Combat.toggleSpec();
            }
        }
        var1_1.interact(lllIIIlllII[lllIIIlllIl[4]]);
        this.sleep(lllIIIlllIl[4]);
        return lllIIIlllIl[1];
    }

    private static boolean lIlIlllIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIlllIIlIIlI(String llllllllllllllllIIlIIllIIIIlIIlI, String llllllllllllllllIIlIIllIIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIIIlIllI.init(lllIIIlllIl[4], llllllllllllllllIIlIIllIIIIlIlll);
            return new String(llllllllllllllllIIlIIllIIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIIIIlIlIl) {
            llllllllllllllllIIlIIllIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIlIllI(int n2) {
        return n2 != 0;
    }

    private static void lIlIlllIIlIlII() {
        lllIIIlllII = new String[lllIIIlllIl[5]];
        q.lllIIIlllII[q.lllIIIlllIl[0]] = q.lIlIlllIIlIIIl("nHD6iZbUEUZ/5qNTAswTiA==", "DDZkf");
        q.lllIIIlllII[q.lllIIIlllIl[1]] = q.lIlIlllIIlIIlI("0KCJ96ECCeE=", "uzCtN");
        q.lllIIIlllII[q.lllIIIlllIl[4]] = q.lIlIlllIIlIIll("JB43MDYO", "ejCQU");
    }

    private static void lIlIlllIIlIlIl() {
        lllIIIlllIl = new int[7];
        q.lllIIIlllIl[0] = (0x48 ^ 0x17 ^ (0x5E ^ 0x42)) & (0x30 ^ 0x36 ^ (0x54 ^ 0x11) ^ -" ".length());
        q.lllIIIlllIl[1] = " ".length();
        q.lllIIIlllIl[2] = 2 ^ 0x30;
        q.lllIIIlllIl[3] = 80 + 34 - 21 + 63 ^ 52 + 57 - 5 + 46;
        q.lllIIIlllIl[4] = "  ".length();
        q.lllIIIlllIl[5] = "   ".length();
        q.lllIIIlllIl[6] = 0x60 ^ 0x4C ^ (0x93 ^ 0xB7);
    }

    @Inject
    public q(e e2, SquireBandosConfig squireBandosConfig) {
        this.aa = e2;
        this.ab = squireBandosConfig;
    }

    private static boolean lIlIlllIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlllIIlIIll(String llllllllllllllllIIlIIlIlllllllll, String llllllllllllllllIIlIIllIIIIIIIll) {
        llllllllllllllllIIlIIlIlllllllll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllIIIIIIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIIllIIIIIIIIl = llllllllllllllllIIlIIllIIIIIIIll.toCharArray();
        int llllllllllllllllIIlIIllIIIIIIIII = lllIIIlllIl[0];
        char[] llllllllllllllllIIlIIlIllllllIlI = llllllllllllllllIIlIIlIlllllllll.toCharArray();
        int llllllllllllllllIIlIIlIllllllIIl = llllllllllllllllIIlIIlIllllllIlI.length;
        int llllllllllllllllIIlIIlIllllllIII = lllIIIlllIl[0];
        while (q.lIlIlllIIlllIl(llllllllllllllllIIlIIlIllllllIII, llllllllllllllllIIlIIlIllllllIIl)) {
            char llllllllllllllllIIlIIllIIIIIIlIl = llllllllllllllllIIlIIlIllllllIlI[llllllllllllllllIIlIIlIllllllIII];
            llllllllllllllllIIlIIllIIIIIIIlI.append((char)(llllllllllllllllIIlIIllIIIIIIlIl ^ llllllllllllllllIIlIIllIIIIIIIIl[llllllllllllllllIIlIIllIIIIIIIII % llllllllllllllllIIlIIllIIIIIIIIl.length]));
            "".length();
            ++llllllllllllllllIIlIIllIIIIIIIII;
            ++llllllllllllllllIIlIIlIllllllIII;
            "".length();
            if (-"   ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIllIIIIIIIlI);
    }

    private static boolean lIlIlllIIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIIllIII(Object object) {
        return object != null;
    }
}

