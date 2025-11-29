/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;

@TaskDesc(name="Fishing", priority=1000, blocking=true)
public class g
extends Task {
    private final /* synthetic */ SquireTempoross aj;
    private final /* synthetic */ a ag;
    private final /* synthetic */ SquireTemporossConfig ah;
    private static /* synthetic */ int[] lIIllIllIIlIl;
    private static /* synthetic */ String[] lIIllIllIIlII;
    private final /* synthetic */ Client ai;

    private static void lIllIIIlIIIllIl() {
        lIIllIllIIlII = new String[lIIllIllIIlIl[3]];
        g.lIIllIllIIlII[g.lIIllIllIIlIl[0]] = g.lIllIIIlIIIlIlI("GjEHOx8=", "VTfMz");
        g.lIIllIllIIlII[g.lIIllIllIIlIl[1]] = g.lIllIIIlIIIlIll("PIzdDOa4HwE=", "ObaFi");
        g.lIIllIllIIlII[g.lIIllIllIIlIl[2]] = g.lIllIIIlIIIllII("D64rbPVbZ9k=", "nYloa");
    }

    private static boolean lIllIIIlIIIllll(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIlIIIlIlI(String llllllllllllllIlllIlllIlIIllllll, String llllllllllllllIlllIlllIlIlIIIIll) {
        llllllllllllllIlllIlllIlIIllllll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIlIlIIIIlI = new StringBuilder();
        char[] llllllllllllllIlllIlllIlIlIIIIIl = llllllllllllllIlllIlllIlIlIIIIll.toCharArray();
        int llllllllllllllIlllIlllIlIlIIIIII = lIIllIllIIlIl[0];
        char[] llllllllllllllIlllIlllIlIIlllIlI = llllllllllllllIlllIlllIlIIllllll.toCharArray();
        int llllllllllllllIlllIlllIlIIlllIIl = llllllllllllllIlllIlllIlIIlllIlI.length;
        int llllllllllllllIlllIlllIlIIlllIII = lIIllIllIIlIl[0];
        while (g.lIllIIIlIIlIIll(llllllllllllllIlllIlllIlIIlllIII, llllllllllllllIlllIlllIlIIlllIIl)) {
            char llllllllllllllIlllIlllIlIlIIIlIl = llllllllllllllIlllIlllIlIIlllIlI[llllllllllllllIlllIlllIlIIlllIII];
            llllllllllllllIlllIlllIlIlIIIIlI.append((char)(llllllllllllllIlllIlllIlIlIIIlIl ^ llllllllllllllIlllIlllIlIlIIIIIl[llllllllllllllIlllIlllIlIlIIIIII % llllllllllllllIlllIlllIlIlIIIIIl.length]));
            "".length();
            ++llllllllllllllIlllIlllIlIlIIIIII;
            ++llllllllllllllIlllIlllIlIIlllIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIlIlIIIIlI);
    }

    private static boolean lIllIIIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIIlIIIl(Object object) {
        return object != null;
    }

    private static void lIllIIIlIIIlllI() {
        lIIllIllIIlIl = new int[5];
        g.lIIllIllIIlIl[0] = (0x55 ^ 0x18 ^ (0x24 ^ 0x31)) & (4 ^ 0x58 ^ (0xAF ^ 0xAB) ^ -" ".length());
        g.lIIllIllIIlIl[1] = " ".length();
        g.lIIllIllIIlIl[2] = "  ".length();
        g.lIIllIllIIlIl[3] = "   ".length();
        g.lIIllIllIIlIl[4] = 61 + 129 - 42 + 21 ^ 96 + 33 - -20 + 12;
    }

    private static boolean lIllIIIlIIlIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        g llllllllllllllIlllIlllIlIllIllIl;
        if (g.lIllIIIlIIIllll(this.ai.isInInstancedRegion() ? 1 : 0)) {
            return lIIllIllIIlIl[0];
        }
        if (g.lIllIIIlIIIllll(llllllllllllllIlllIlllIlIllIllIl.ag.M() ? 1 : 0)) {
            return lIIllIllIIlIl[0];
        }
        if (g.lIllIIIlIIlIIII(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIllIIlIl[0];
        }
        if (g.lIllIIIlIIIllll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIllIIlIl[0];
        }
        NPC llllllllllllllIlllIlllIlIllIllII = NPCs.getNearest(nPC -> {
            int n2;
            if (g.lIllIIIlIIlIIII(nPC.getName().toLowerCase().contains(lIIllIllIIlII[lIIllIllIIlIl[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIllIIlIl[1]];
                stringArray[g.lIIllIllIIlIl[0]] = lIIllIllIIlII[lIIllIllIIlIl[2]];
                if (g.lIllIIIlIIlIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIllIIlIl[1];
                    "".length();
                    if (-(0x1C ^ 4 ^ (0x83 ^ 0x9E)) < 0) return n2 != 0;
                    return ((0x7F ^ 0xD ^ (0xD7 ^ 0x8E)) & (143 + 164 - 125 + 6 ^ 36 + 108 - 131 + 138 ^ -" ".length())) != 0;
                }
            }
            n2 = lIIllIllIIlIl[0];
            return n2 != 0;
        });
        Player llllllllllllllIlllIlllIlIllIlIll = Players.getLocal();
        if (!g.lIllIIIlIIlIIIl(llllllllllllllIlllIlllIlIllIlIll) || g.lIllIIIlIIlIIlI(llllllllllllllIlllIlllIlIllIllII)) {
            return lIIllIllIIlIl[0];
        }
        var1_1.interact(lIIllIllIIlII[lIIllIllIIlIl[0]]);
        return lIIllIllIIlIl[1];
    }

    static {
        g.lIllIIIlIIIlllI();
        g.lIllIIIlIIIllIl();
    }

    private static String lIllIIIlIIIlIll(String llllllllllllllIlllIlllIlIlIlIlII, String llllllllllllllIlllIlllIlIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIlIlIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIlIlIlIllI.init(lIIllIllIIlIl[2], llllllllllllllIlllIlllIlIlIlIlll);
            return new String(llllllllllllllIlllIlllIlIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIlIlIlIlIl) {
            llllllllllllllIlllIlllIlIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIIIllII(String llllllllllllllIlllIlllIlIllIIIIl, String llllllllllllllIlllIlllIlIlIllllI) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIlIllllI.getBytes(StandardCharsets.UTF_8)), lIIllIllIIlIl[4]), "DES");
            Cipher llllllllllllllIlllIlllIlIllIIIll = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIlIllIIIll.init(lIIllIllIIlIl[2], llllllllllllllIlllIlllIlIllIIlII);
            return new String(llllllllllllllIlllIlllIlIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIlIllIIIlI) {
            llllllllllllllIlllIlllIlIllIIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected g(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        this.ag = a2;
        this.ah = squireTemporossConfig;
        this.ai = client;
        this.aj = squireTempoross;
    }

    private static boolean lIllIIIlIIlIIII(int n2) {
        return n2 != 0;
    }
}

