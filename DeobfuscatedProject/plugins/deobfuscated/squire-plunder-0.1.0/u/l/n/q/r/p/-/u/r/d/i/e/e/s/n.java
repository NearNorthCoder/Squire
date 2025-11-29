/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;

@TaskDesc(name="Starting Minigame", priority=50)
public class n
extends Task {
    private static /* synthetic */ int[] lllllllIIlIl;
    private final /* synthetic */ a I;
    private static /* synthetic */ String[] lllllllIIlII;

    static {
        n.lIIlIlIIlllIlII();
        n.lIIlIlIIlllIIll();
    }

    private static void lIIlIlIIlllIlII() {
        lllllllIIlIl = new int[5];
        n.lllllllIIlIl[0] = 1;
        n.lllllllIIlIl[1] = (0x1A ^ 0x40) & ~(0x11 ^ 0x4B);
        n.lllllllIIlIl[2] = -(0xFFFFDB1D & 0x34E3) & (0xFFFF96FB & 0x7FF7);
        n.lllllllIIlIl[3] = 0x84 ^ 0x90;
        n.lllllllIIlIl[4] = 2;
    }

    public boolean run() {
        int[] nArray = new int[lllllllIIlIl[0]];
        nArray[n.lllllllIIlIl[1]] = lllllllIIlIl[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (n.lIIlIlIIlllIlIl(nPC)) {
            return lllllllIIlIl[1];
        }
        if (n.lIIlIlIIlllIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lllllllIIlIl[1];
        }
        if (n.lIIlIlIIlllIllI(Movement.isRunEnabled() ? 1 : 0) && n.lIIlIlIIlllIlll(Movement.getRunEnergy(), lllllllIIlIl[3])) {
            Movement.toggleRun();
        }
        this.I.a(lllllllIIlIl[1]);
        nPC.interact(lllllllIIlII[lllllllIIlIl[1]]);
        return lllllllIIlIl[0];
    }

    private static void lIIlIlIIlllIIll() {
        lllllllIIlII = new String[lllllllIIlIl[0]];
        n.lllllllIIlII[n.lllllllIIlIl[1]] = n."Start-minigame";
    }

    @Inject
    public n(a a2) {
        this.I = a2;
    }

    private static boolean lIIlIlIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIlllIllI(int n2) {
        return n2 == 0;
    }

    private static String lIIlIlIIlllIIlI(String lllllllllllllllIIlIIllIIIlIlIIIl, String lllllllllllllllIIlIIllIIIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIIlIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIIlIlIlIl.init(lllllllIIlIl[4], lllllllllllllllIIlIIllIIIlIlIllI);
            return new String(lllllllllllllllIIlIIllIIIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIIlIlIlII) {
            lllllllllllllllIIlIIllIIIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlllIlIl(Object object) {
        return object == null;
    }
}

