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

import -.m.e.a.u.s.r.r.q.i.r.e.f.az_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
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

/* TASK: Moving to next region -> MovingtonextregionTask */
@TaskDesc(name="Moving to next region", priority=25, blocking=true)
public class MovingToNextRegionTask
extends az_Unknown {
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

    private static String llllIIllIlllIl(String var10, String var8) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIIIIlllllI[3], var3);
            return new String(var1.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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
        void var4;
        bc var7;
        Player player = Players.getLocal();
        if (!bc.llllIIlllIIIll(player) || bc.llllIIlllIIlII(player.isAnimating() ? 1 : 0)) {
            return llIIIIlllllI[0];
        }
        WorldPoint var5 = var7.bR.u();
        WorldPoint var2 = var4.getWorldLocation();
        if (!bc.llllIIlllIIIll(var5) || bc.llllIIlllIIlII(var7.bR.b(var2) ? 1 : 0)) {
            return llIIIIlllllI[0];
        }
        if (bc.llllIIlllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
            int[] nArray = new int[llIIIIlllllI[1]];
            nArray[bc.llIIIIlllllI[0]] = llIIIIlllllI[2];
            Item var9 = Inventory.getFirst((int[])nArray);
            if (bc.llllIIlllIIIll(var9)) {
                var9.interact(llIIIIllllII[llIIIIlllllI[0]]);
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

