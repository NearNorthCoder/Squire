/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving to next region", priority=25, blocking=true)
public class bc
extends az {
    private static /* synthetic */ String[] llIIIIllllII;
    private static /* synthetic */ int[] llIIIIlllllI;

    private static boolean llllIIlllIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIlllIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    public bc(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static String llllIIllIlllIl(String lllllllllllllllIlIlIlIIlllIlIIII, String lllllllllllllllIlIlIlIIlllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIlllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIIlllIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIIlllIlIlII.init(llIIIIlllllI[3], lllllllllllllllIlIlIlIIlllIlIlIl);
            return new String(lllllllllllllllIlIlIlIIlllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIlllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIIlllIlIIll) {
            lllllllllllllllIlIlIlIIlllIlIIll.printStackTrace();
            return null;
        }
    }

    static {
        bc.llllIIlllIIIlI();
        bc.llllIIllIllllI();
    }

    private static void llllIIllIllllI() {
        llIIIIllllII = new String[llIIIIlllllI[1]];
        bc.llIIIIllllII[bc.llIIIIlllllI[0]] = bc."Drop";
    }

    private static boolean llllIIlllIIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void lllllllllllllllIlIlIlIIlllIlllIl;
        bc lllllllllllllllIlIlIlIIlllIllllI;
        Player player = Players.getLocal();
        if (!bc.llllIIlllIIIll(player) || bc.llllIIlllIIlII(player.isAnimating() ? 1 : 0)) {
            return llIIIIlllllI[0];
        }
        WorldPoint lllllllllllllllIlIlIlIIlllIlllII = lllllllllllllllIlIlIlIIlllIllllI.bR.u();
        WorldPoint lllllllllllllllIlIlIlIIlllIllIll = lllllllllllllllIlIlIlIIlllIlllIl.getWorldLocation();
        if (!bc.llllIIlllIIIll(lllllllllllllllIlIlIlIIlllIlllII) || bc.llllIIlllIIlII(lllllllllllllllIlIlIlIIlllIllllI.bR.b(lllllllllllllllIlIlIlIIlllIllIll) ? 1 : 0)) {
            return llIIIIlllllI[0];
        }
        if (bc.llllIIlllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
            int[] nArray = new int[llIIIIlllllI[1]];
            nArray[bc.llIIIIlllllI[0]] = llIIIIlllllI[2];
            Item lllllllllllllllIlIlIlIIlllIllIlI = Inventory.getFirst((int[])nArray);
            if (bc.llllIIlllIIIll(lllllllllllllllIlIlIlIIlllIllIlI)) {
                lllllllllllllllIlIlIlIIlllIllIlI.interact(llIIIIllllII[llIIIIlllllI[0]]);
            }
            return llIIIIlllllI[1];
        }
        Movement.walkTo((WorldPoint)var2_2);
        0;
        return llIIIIlllllI[1];
    }

    private static void llllIIlllIIIlI() {
        llIIIIlllllI = new int[4];
        bc.llIIIIlllllI[0] = (0x2A ^ 0x10 ^ (0xA0 ^ 0xC2)) & (185 + 105 - 140 + 91 ^ 39 + 48 - 14 + 96 ^ -1);
        bc.llIIIIlllllI[1] = 1;
        bc.llIIIIlllllI[2] = 0xFFFF8F9D & 0x77E7;
        bc.llIIIIlllllI[3] = 2;
    }
}

