/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Grabbing a weak cell", priority=14, blocking=true)
public class k
extends h {
    private static /* synthetic */ String[] llIlIIIIIIII;
    private static /* synthetic */ int[] llIlIIIIIIIl;

    private static boolean lIIIIIIIIIIIIll(Object object) {
        return object == null;
    }

    private static String lIIIIIIIIIIIIII(String lllllllllllllllIlIIlIlIlIllIllII, String lllllllllllllllIlIIlIlIlIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlIlllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlIlllIIII.init(llIlIIIIIIIl[2], lllllllllllllllIlIIlIlIlIlllIIIl);
            return new String(lllllllllllllllIlIIlIlIlIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlIlIllIllll) {
            lllllllllllllllIlIIlIlIlIllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        k.lIIIIIIIIIIIIlI();
        k.lIIIIIIIIIIIIIl();
    }

    @Override
    protected boolean ak() {
        k lllllllllllllllIlIIlIlIlIlllIlll;
        if (!k.lIIIIIIIIIIIIll(this.aV.e()) || k.lIIIIIIIIIIIlII(Inventory.isFull() ? 1 : 0)) {
            return llIlIIIIIIIl[1];
        }
        if (k.lIIIIIIIIIIIlII(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIlIIIIIIIl[1];
        }
        GameObject lllllllllllllllIlIIlIlIlIlllIllI = lllllllllllllllIlIIlIlIlIlllIlll.aV.z();
        if (k.lIIIIIIIIIIIlIl(lllllllllllllllIlIIlIlIlIlllIllI) && k.lIIIIIIIIIIIlII(Reachable.isInteractable((Locatable)lllllllllllllllIlIIlIlIlIlllIllI) ? 1 : 0)) {
            lllllllllllllllIlIIlIlIlIlllIllI.interact(llIlIIIIIIII[llIlIIIIIIIl[1]]);
            return llIlIIIIIIIl[0];
        }
        return llIlIIIIIIIl[1];
    }

    private static void lIIIIIIIIIIIIIl() {
        llIlIIIIIIII = new String[llIlIIIIIIIl[0]];
        k.llIlIIIIIIII[k.llIlIIIIIIIl[1]] = k.lIIIIIIIIIIIIII("B2nCPsOnJDM=", "oUJzE");
    }

    @Inject
    public k(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIlIIIIIIIl[0]];
        cArray[k.llIlIIIIIIIl[1]] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lIIIIIIIIIIIlIl(Object object) {
        return object != null;
    }

    private static void lIIIIIIIIIIIIlI() {
        llIlIIIIIIIl = new int[3];
        k.llIlIIIIIIIl[0] = " ".length();
        k.llIlIIIIIIIl[1] = (0x21 ^ 4) & ~(0x8B ^ 0xAE);
        k.llIlIIIIIIIl[2] = "  ".length();
    }
}

