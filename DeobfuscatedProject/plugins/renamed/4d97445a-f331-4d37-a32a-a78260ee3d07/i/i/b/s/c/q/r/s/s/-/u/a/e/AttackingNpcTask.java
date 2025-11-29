/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
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
import net.unethicalite.api.widgets.Dialog;

/* TASK: Attacking NPC -> AttackingnpcTask */
@TaskDesc(name="Attacking NPC", priority=15, blocking=true)
public class AttackingNpcTask
extends Task {
    private static /* synthetic */ int[] lIlIIlIIl;
    private static /* synthetic */ String[] lIIllIlIl;
    private final /* synthetic */ SquireQuestHelper fK;

    public boolean run() {
        bi llIIIIlIIlIlIII;
        if (bi.lIIlIIIIllI(Dialog.isOpen() ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        if (bi.lIIlIIIIlll(llIIIIlIIlIlIII.fK.cz().equals(lIIllIlIl[lIlIIlIIl[0]]) ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        NPC llIIIIlIIlIIlll = llIIIIlIIlIlIII.fK.cK();
        if (bi.lIIlIIIlIII(llIIIIlIIlIIlll)) {
            return lIlIIlIIl[0];
        }
        String[] stringArray = new String[lIlIIlIIl[1]];
        stringArray[bi.lIlIIlIIl[0]] = lIIllIlIl[lIlIIlIIl[2]];
        stringArray[bi.lIlIIlIIl[2]] = lIIllIlIl[lIlIIlIIl[3]];
        stringArray[bi.lIlIIlIIl[3]] = lIIllIlIl[lIlIIlIIl[1]];
        if (bi.lIIlIIIIlll(llIIIIlIIlIlIII.fK.a(stringArray) ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        if (bi.lIIlIIIlIII(Players.getLocal().getInteracting())) {
            llIIIIlIIlIIlll.interact(lIIllIlIl[lIlIIlIIl[4]]);
            llIIIIlIIlIlIII.sleep(lIlIIlIIl[3]);
        }
        return lIlIIlIIl[2];
    }

    private static boolean lIIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIIIIII(String llIIIIlIIIlllII, String llIIIIlIIIlIllI) {
        llIIIIlIIIlllII = new String(Base64.getDecoder().decode(llIIIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIlIIIllIlI = new StringBuilder();
        char[] llIIIIlIIIllIIl = llIIIIlIIIlIllI.toCharArray();
        int llIIIIlIIIllIII = lIlIIlIIl[0];
        char[] llIIIIlIIIlIIlI = llIIIIlIIIlllII.toCharArray();
        int llIIIIlIIIlIIIl = llIIIIlIIIlIIlI.length;
        int llIIIIlIIIlIIII = lIlIIlIIl[0];
        while (bi.lIIlIIIlIIl(llIIIIlIIIlIIII, llIIIIlIIIlIIIl)) {
            char llIIIIlIIIlllIl = llIIIIlIIIlIIlI[llIIIIlIIIlIIII];
            llIIIIlIIIllIlI.append((char)(llIIIIlIIIlllIl ^ llIIIIlIIIllIIl[llIIIIlIIIllIII % llIIIIlIIIllIIl.length]));
            0;
            ++llIIIIlIIIllIII;
            ++llIIIIlIIIlIIII;
            0;
            if (((180 + 137 - 114 + 18 ^ 63 + 78 - 101 + 100) & (0xC9 ^ 0x80 ^ (0xE ^ 0x16) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llIIIIlIIIllIlI);
    }

    private static String lIIIlIIIIlI(String llIIIIIlllllIII, String llIIIIIlllllIIl) {
        try {
            SecretKeySpec llIIIIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIllllllII = Cipher.getInstance("Blowfish");
            llIIIIIllllllII.init(lIlIIlIIl[3], llIIIIIllllllIl);
            return new String(llIIIIIllllllII.doFinal(Base64.getDecoder().decode(llIIIIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIlllllIll) {
            llIIIIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIl(String llIIIIlIIIIIlll, String llIIIIlIIIIIllI) {
        try {
            SecretKeySpec llIIIIlIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIlIIl[6]), "DES");
            Cipher llIIIIlIIIIlIIl = Cipher.getInstance("DES");
            llIIIIlIIIIlIIl.init(lIlIIlIIl[3], llIIIIlIIIIlIlI);
            return new String(llIIIIlIIIIlIIl.doFinal(Base64.getDecoder().decode(llIIIIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIlIIIIlIII) {
            llIIIIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public bi(SquireQuestHelper squireQuestHelper) {
        this.fK = squireQuestHelper;
    }

    private static boolean lIIlIIIlIII(Object object) {
        return object == null;
    }

    private static void lIIIlIIIIll() {
        lIIllIlIl = new String[lIlIIlIIl[5]];
        bi.lIIllIlIl[bi.lIlIIlIIl[0]] = bi."NpcStep";
        bi.lIIllIlIl[bi.lIlIIlIIl[2]] = bi."kill";
        bi.lIIllIlIl[bi.lIlIIlIIl[3]] = bi."attack";
        bi.lIIllIlIl[bi.lIlIIlIIl[1]] = bi."defeat";
        bi.lIIllIlIl[bi.lIlIIlIIl[4]] = bi."Attack";
    }

    private static boolean lIIlIIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIlIl() {
        lIlIIlIIl = new int[7];
        bi.lIlIIlIIl[0] = (35 + 50 - 78 + 248 ^ 20 + 113 - 89 + 127) & (0x42 ^ 0x2D ^ (0x94 ^ 0xAF) ^ -1);
        bi.lIlIIlIIl[1] = 3;
        bi.lIlIIlIIl[2] = 1;
        bi.lIlIIlIIl[3] = 2;
        bi.lIlIIlIIl[4] = 0x9F ^ 0x9B;
        bi.lIlIIlIIl[5] = 0x86 ^ 0xC1 ^ (0x4B ^ 9);
        bi.lIlIIlIIl[6] = 0x63 ^ 0xE ^ (0xFB ^ 0x9E);
    }

    private static boolean lIIlIIIIllI(int n2) {
        return n2 != 0;
    }

    static {
        bi.lIIlIIIIlIl();
        bi.lIIIlIIIIll();
    }
}

