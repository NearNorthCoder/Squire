/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.i;

@TaskDesc(name="Walking to next tile", priority=80)
public class m
extends Task {
    private static /* synthetic */ String[] lIllIIIIllIII;
    private final /* synthetic */ SquireWoodcutterPlugin O;
    private static /* synthetic */ int[] lIllIIIIllIIl;
    private final /* synthetic */ SquireWoodcutterConfig P;

    private static String llIIIlIIIlllIII(String llllllllllllllIllIIllIIIllIllllI, String llllllllllllllIllIIllIIIllIlllll) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIIllIlllll.getBytes(StandardCharsets.UTF_8)), lIllIIIIllIIl[2]), "DES");
            Cipher llllllllllllllIllIIllIIIlllIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIllIIIlllIIIlI.init(lIllIIIIllIIl[3], llllllllllllllIllIIllIIIlllIIIll);
            return new String(llllllllllllllIllIIllIIIlllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIIIlllIIIIl) {
            llllllllllllllIllIIllIIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public m(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.O = squireWoodcutterPlugin;
        this.P = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIIllllIl(Object object) {
        return object == null;
    }

    private static void llIIIlIIIlllIlI() {
        lIllIIIIllIIl = new int[4];
        m.lIllIIIIllIIl[0] = (0xD0 ^ 0xA6 ^ (0x9B ^ 0xB8)) & (0x31 ^ 0x69 ^ (0x22 ^ 0x2F) ^ -" ".length());
        m.lIllIIIIllIIl[1] = " ".length();
        m.lIllIIIIllIIl[2] = 0xCE ^ 0xC6;
        m.lIllIIIIllIIl[3] = "  ".length();
    }

    private WorldPoint b(TileObject tileObject, i i2) {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return Walker.nearestWalkableTile((WorldPoint)tileObject.getWorldLocation(), worldPoint2 -> {
            int n;
            if (m.llIIIlIIIllllII(i2.w().contains(worldPoint2) ? 1 : 0) && m.llIIIlIIIlllllI(worldPoint2.distanceTo(worldPoint), lIllIIIIllIIl[1]) && m.llIIIlIIIllllII(worldPoint2.distanceTo(worldPoint))) {
                n = lIllIIIIllIIl[1];
                "".length();
                if (((0x53 ^ 0x71 ^ (0x19 ^ 4)) & (0x5F ^ 0x42 ^ (0x59 ^ 0x7B) ^ -" ".length())) != 0) {
                    return ((184 + 53 - 199 + 209 ^ 133 + 137 - 139 + 50) & (93 + 203 - 48 + 5 ^ 8 + 4 - -90 + 89 ^ -" ".length())) != 0;
                }
            } else {
                n = lIllIIIIllIIl[0];
            }
            return n != 0;
        });
    }

    private static boolean llIIIlIIIlllllI(int n, int n2) {
        return n <= n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        m llllllllllllllIllIIllIIIllllIllI;
        if (m.llIIIlIIIlllIll(this.P.fastTickChop() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIllllII(llllllllllllllIllIIllIIIllllIllI.O.p() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIllllII(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIllllII(llllllllllllllIllIIllIIIllllIllI.P.pickUpNest() ? 1 : 0) && m.llIIIlIIIllllII(llllllllllllllIllIIllIIIllllIllI.O.a() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIlllIll(Movement.isRunEnabled() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        TileObject llllllllllllllIllIIllIIIllllIlIl = TileObjects.getNearest(tileObject -> {
            int n;
            if (m.llIIIlIIIllllII(tileObject.getName().equals(this.P.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIllIIl[1]];
                stringArray[m.lIllIIIIllIIl[0]] = lIllIIIIllIII[lIllIIIIllIIl[0]];
                if (m.llIIIlIIIllllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIllIIIIllIIl[1];
                    "".length();
                    if (-" ".length() < "   ".length()) return n != 0;
                    return ((0x65 ^ 0x5E) & ~(0x46 ^ 0x7D)) != 0;
                }
            }
            n = lIllIIIIllIIl[0];
            return n != 0;
        });
        if (m.llIIIlIIIllllIl(llllllllllllllIllIIllIIIllllIlIl)) {
            return lIllIIIIllIIl[0];
        }
        i llllllllllllllIllIIllIIIllllIlII = i.b(llllllllllllllIllIIllIIIllllIlIl);
        Player llllllllllllllIllIIllIIIllllIIll = Players.getLocal();
        if (m.llIIIlIIIllllIl((Object)llllllllllllllIllIIllIIIllllIlII)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIlllllI(llllllllllllllIllIIllIIIllllIIll.distanceTo((Locatable)llllllllllllllIllIIllIIIllllIlIl), llllllllllllllIllIIllIIIllllIllI.O.m())) {
            llllllllllllllIllIIllIIIllllIllI.O.h();
        }
        if (m.llIIIlIIIllllII(llllllllllllllIllIIllIIIllllIIll.isMoving() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        WorldPoint llllllllllllllIllIIllIIIllllIIlI = llllllllllllllIllIIllIIIllllIllI.b(llllllllllllllIllIIllIIIllllIlIl, llllllllllllllIllIIllIIIllllIlII);
        if (m.llIIIlIIIllllIl(llllllllllllllIllIIllIIIllllIIlI)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIllllII(llllllllllllllIllIIllIIIllllIIlI.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.sleep(lIllIIIIllIIl[1]);
        return lIllIIIIllIIl[1];
    }

    private static boolean llIIIlIIIlllIll(int n) {
        return n == 0;
    }

    private static void llIIIlIIIlllIIl() {
        lIllIIIIllIII = new String[lIllIIIIllIIl[1]];
        m.lIllIIIIllIII[m.lIllIIIIllIIl[0]] = m.llIIIlIIIlllIII("eMqdmjA/m2cSOL/3g75o4A==", "CbZZY");
    }

    static {
        m.llIIIlIIIlllIlI();
        m.llIIIlIIIlllIIl();
    }

    private static boolean llIIIlIIIllllII(int n) {
        return n != 0;
    }
}

