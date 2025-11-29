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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.k;

@TaskDesc(name="Killing minions")
public class F
extends Task {
    private static /* synthetic */ int[] lIIlIlIlIlIlI;
    private static /* synthetic */ String[] lIIlIlIlIIIlI;
    private final /* synthetic */ SquireSaraConfig aL;
    private final /* synthetic */ g aK;

    @Inject
    public F(g g2, SquireSaraConfig squireSaraConfig) {
        this.aK = g2;
        this.aL = squireSaraConfig;
    }

    private static boolean lIlIllIIIIIllIl(Object object) {
        return object != null;
    }

    private static String lIlIlIllllIllII(String llllllllllllllIllllIlllIIIIllIII, String llllllllllllllIllllIlllIIIIlIIlI) {
        llllllllllllllIllllIlllIIIIllIII = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlllIIIIlIllI = new StringBuilder();
        char[] llllllllllllllIllllIlllIIIIlIlIl = llllllllllllllIllllIlllIIIIlIIlI.toCharArray();
        int llllllllllllllIllllIlllIIIIlIlII = lIIlIlIlIlIlI[0];
        char[] llllllllllllllIllllIlllIIIIIlllI = llllllllllllllIllllIlllIIIIllIII.toCharArray();
        int llllllllllllllIllllIlllIIIIIllIl = llllllllllllllIllllIlllIIIIIlllI.length;
        int llllllllllllllIllllIlllIIIIIllII = lIIlIlIlIlIlI[0];
        while (F.lIlIllIIIIlIIlI(llllllllllllllIllllIlllIIIIIllII, llllllllllllllIllllIlllIIIIIllIl)) {
            char llllllllllllllIllllIlllIIIIllIIl = llllllllllllllIllllIlllIIIIIlllI[llllllllllllllIllllIlllIIIIIllII];
            llllllllllllllIllllIlllIIIIlIllI.append((char)(llllllllllllllIllllIlllIIIIllIIl ^ llllllllllllllIllllIlllIIIIlIlIl[llllllllllllllIllllIlllIIIIlIlII % llllllllllllllIllllIlllIIIIlIlIl.length]));
            "".length();
            ++llllllllllllllIllllIlllIIIIlIlII;
            ++llllllllllllllIllllIlllIIIIIllII;
            "".length();
            if ("  ".length() > ((0x63 ^ 0x24) & ~(0xCB ^ 0x8C))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlllIIIIlIllI);
    }

    private static void lIlIlIllllIllIl() {
        lIIlIlIlIIIlI = new String[lIIlIlIlIlIlI[5]];
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[0]] = F.lIlIlIllllIlIll("EtR23J69z0+YYwDtSNMWwg==", "IlcUs");
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[1]] = F.lIlIlIllllIllII("GyISGBQ=", "LKwtp");
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[4]] = F.lIlIlIllllIllII("OTMNMAAT", "xGyQc");
    }

    static {
        F.lIlIllIIIIIlIlI();
        F.lIlIlIllllIllIl();
    }

    private static String lIlIlIllllIlIll(String llllllllllllllIllllIlllIIIIIIIIl, String llllllllllllllIllllIlllIIIIIIIII) {
        try {
            SecretKeySpec llllllllllllllIllllIlllIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllIIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIlIlI[6]), "DES");
            Cipher llllllllllllllIllllIlllIIIIIIlIl = Cipher.getInstance("DES");
            llllllllllllllIllllIlllIIIIIIlIl.init(lIIlIlIlIlIlI[4], llllllllllllllIllllIlllIIIIIIllI);
            return new String(llllllllllllllIllllIlllIIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlllIIIIIIlII) {
            llllllllllllllIllllIlllIIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIIIIllII(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private NPC X() {
        int[] nArray = new int[lIIlIlIlIlIlI[1]];
        nArray[F.lIIlIlIlIlIlI[0]] = k.STARLIGHT.D();
        NPC nPC2 = NPCs.getNearest((int[])nArray);
        if (F.lIlIllIIIIIllIl(nPC2) && F.lIlIllIIIIIlllI(nPC2.isDead() ? 1 : 0)) {
            void llllllllllllllIllllIlllIIIlIIllI;
            return llllllllllllllIllllIlllIIIlIIllI;
        }
        int[] nArray2 = new int[lIIlIlIlIlIlI[1]];
        nArray2[F.lIIlIlIlIlIlI[0]] = k.GROWLER.D();
        NPC llllllllllllllIllllIlllIIIlIIlIl = NPCs.getNearest((int[])nArray2);
        if (F.lIlIllIIIIIllIl(llllllllllllllIllllIlllIIIlIIlIl) && F.lIlIllIIIIIlllI(llllllllllllllIllllIlllIIIlIIlIl.isDead() ? 1 : 0)) {
            return llllllllllllllIllllIlllIIIlIIlIl;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (F.lIlIllIIIIIlllI(nPC.isDead() ? 1 : 0) && F.lIlIllIIIIlIIIl(nPC.getId(), k.BREE.D())) {
                n2 = lIIlIlIlIlIlI[1];
                "".length();
                if ((0x60 ^ 0x65) == 0) {
                    return ("  ".length() & ~"  ".length()) != 0;
                }
            } else {
                n2 = lIIlIlIlIlIlI[0];
            }
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        F llllllllllllllIllllIlllIIIlIlIll;
        if (!F.lIlIllIIIIIlIll(this.aK.m() ? 1 : 0) || F.lIlIllIIIIIlIll(this.aK.l() ? 1 : 0)) {
            return lIIlIlIlIlIlI[0];
        }
        NPC llllllllllllllIllllIlllIIIlIlIlI = llllllllllllllIllllIlllIIIlIlIll.X();
        if (F.lIlIllIIIIIllII(llllllllllllllIllllIlllIIIlIlIlI)) {
            return lIIlIlIlIlIlI[0];
        }
        if (F.lIlIllIIIIIllIl(Players.getLocal().getInteracting())) {
            return lIIlIlIlIlIlI[0];
        }
        if (F.lIlIllIIIIIlIll(llllllllllllllIllllIlllIIIlIlIll.aL.useBlowpipe() ? 1 : 0)) {
            String[] stringArray = new String[lIIlIlIlIlIlI[1]];
            stringArray[F.lIIlIlIlIlIlI[0]] = lIIlIlIlIIIlI[lIIlIlIlIlIlI[0]];
            Item llllllllllllllIllllIlllIIIlIlIIl = Inventory.getFirst((String[])stringArray);
            if (F.lIlIllIIIIIllIl(llllllllllllllIllllIlllIIIlIlIIl)) {
                llllllllllllllIllllIlllIIIlIlIIl.interact(lIIlIlIlIIIlI[lIIlIlIlIlIlI[1]]);
                return lIIlIlIlIlIlI[1];
            }
            if (F.lIlIllIIIIIlllI(Combat.isSpecEnabled() ? 1 : 0) && F.lIlIllIIIIIllll(Combat.getSpecEnergy(), lIIlIlIlIlIlI[2]) && F.lIlIllIIIIlIIII(Combat.getMissingHealth(), lIIlIlIlIlIlI[3])) {
                Combat.toggleSpec();
            }
        }
        var1_1.interact(lIIlIlIlIIIlI[lIIlIlIlIlIlI[4]]);
        this.sleep(lIIlIlIlIlIlI[4]);
        return lIIlIlIlIlIlI[1];
    }

    private static void lIlIllIIIIIlIlI() {
        lIIlIlIlIlIlI = new int[7];
        F.lIIlIlIlIlIlI[0] = (0xED ^ 0xA9 ^ (0x5A ^ 0x24)) & (0xAF ^ 0xA3 ^ (0x5D ^ 0x6B) ^ -" ".length());
        F.lIIlIlIlIlIlI[1] = " ".length();
        F.lIIlIlIlIlIlI[2] = 0x27 ^ 0x15;
        F.lIIlIlIlIlIlI[3] = 5 ^ 0xF;
        F.lIIlIlIlIlIlI[4] = "  ".length();
        F.lIIlIlIlIlIlI[5] = "   ".length();
        F.lIIlIlIlIlIlI[6] = 0xB5 ^ 0xBD;
    }

    private static boolean lIlIllIIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIIIIIlIll(int n2) {
        return n2 != 0;
    }
}

