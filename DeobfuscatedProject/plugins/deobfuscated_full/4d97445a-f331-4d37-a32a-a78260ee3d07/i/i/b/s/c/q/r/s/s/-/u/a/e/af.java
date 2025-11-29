/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
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
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

/* TASK: Attacking -> AttackTask */
@TaskDesc(name="Attacking")
public class af
extends Task {
    private static /* synthetic */ String[] llllIIIl;
    private static /* synthetic */ int[] llllIIlI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llIlIIlIlIlIlII;
        int[] nArray = new int[llllIIlI[0]];
        nArray[af.llllIIlI[1]] = llllIIlI[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llllIIlI[3], llllIIlI[4], llllIIlI[5], llllIIlI[6], llllIIlI[1]);
        if (af.llIlIIIlll(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llllIIlI[1];
        }
        if (af.llIlIIlIII(llIlIIlIlIlIlII)) {
            return llllIIlI[1];
        }
        if (!af.llIlIIlIIl(llIlIIlIlIlIlII) || af.llIlIIlIlI(llIlIIlIlIlIlII.isDead() ? 1 : 0)) {
            return llllIIlI[1];
        }
        if (af.llIlIIlIll(Players.getLocal().getInteracting(), llIlIIlIlIlIlII)) {
            llIlIIlIlIlIlII.interact(llllIIIl[llllIIlI[1]]);
        }
        return llllIIlI[0];
    }

    private static boolean llIlIIlIII(Object object) {
        return object == null;
    }

    private static boolean llIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static void llIlIIIllI() {
        llllIIlI = new int[9];
        af.llllIIlI[0] = 1;
        af.llllIIlI[1] = (0x5C ^ 0x54) & ~(0xA8 ^ 0xA0);
        af.llllIIlI[2] = 0xFFFFA35B & 0x7EAD;
        af.llllIIlI[3] = 0xFFFF9FE6 & 0x673F;
        af.llllIIlI[4] = 0xFFFFEFEB & 0x36B5;
        af.llllIIlI[5] = 0x56 ^ 0x4E;
        af.llllIIlI[6] = 0xA2 ^ 0x97 ^ (0x64 ^ 0x46);
        af.llllIIlI[7] = 0x6E ^ 0x66;
        af.llllIIlI[8] = 2;
    }

    private static void llIlIIIlIl() {
        llllIIIl = new String[llllIIlI[0]];
        af.llllIIIl[af.llllIIlI[1]] = af."Attack";
    }

    private static String llIlIIIlII(String llIlIIlIlIIlIIl, String llIlIIlIlIIlIlI) {
        try {
            SecretKeySpec llIlIIlIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIlI[7]), "DES");
            Cipher llIlIIlIlIIllIl = Cipher.getInstance("DES");
            llIlIIlIlIIllIl.init(llllIIlI[8], llIlIIlIlIIlllI);
            return new String(llIlIIlIlIIllIl.doFinal(Base64.getDecoder().decode(llIlIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlIlIIllII) {
            llIlIIlIlIIllII.printStackTrace();
            return null;
        }
    }

    static {
        af.llIlIIIllI();
        af.llIlIIIlIl();
    }

    private static boolean llIlIIlIIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlIll(Object object, Object object2) {
        return object != object2;
    }
}

