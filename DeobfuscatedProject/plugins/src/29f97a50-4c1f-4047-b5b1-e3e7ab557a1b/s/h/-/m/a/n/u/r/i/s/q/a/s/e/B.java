/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.g;

@TaskDesc(name="Walking to shamans", priority=10, blocking=true)
public class B
extends Task {
    private final /* synthetic */ SquireShamansPlugin aP;
    private static /* synthetic */ String[] lIIlIllllllIl;
    private final /* synthetic */ c aO;
    private static /* synthetic */ int[] lIIllIIIIlIlI;

    private static boolean lIlIlllIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlllIlIllIII() {
        lIIllIIIIlIlI = new int[6];
        B.lIIllIIIIlIlI[0] = (0x4C ^ 0x21 ^ (0x5B ^ 0x30)) & (0x4C ^ 0x63 ^ (0x6A ^ 0x43) ^ -" ".length());
        B.lIIllIIIIlIlI[1] = 0x8B ^ 0x9F;
        B.lIIllIIIIlIlI[2] = " ".length();
        B.lIIllIIIIlIlI[3] = -" ".length();
        B.lIIllIIIIlIlI[4] = "  ".length();
        B.lIIllIIIIlIlI[5] = 0xBF ^ 0xB7;
    }

    private static void lIlIlllIIlIIlIl() {
        lIIlIllllllIl = new String[lIIllIIIIlIlI[4]];
        B.lIIlIllllllIl[B.lIIllIIIIlIlI[0]] = B.lIlIlllIIlIIIll("z6fJnT02dHY=", "NuLZe");
        B.lIIlIllllllIl[B.lIIllIIIIlIlI[2]] = B.lIlIlllIIlIIlII("Fx8QGh8qCg==", "Dkqwv");
    }

    private static boolean lIlIlllIllIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIlIlllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlllIIlIIlII(String llllllllllllllIllllIIlIlIIIllIII, String llllllllllllllIllllIIlIlIIIlllII) {
        llllllllllllllIllllIIlIlIIIllIII = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIlIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIlIlIIIllIll = new StringBuilder();
        char[] llllllllllllllIllllIIlIlIIIllIlI = llllllllllllllIllllIIlIlIIIlllII.toCharArray();
        int llllllllllllllIllllIIlIlIIIllIIl = lIIllIIIIlIlI[0];
        char[] llllllllllllllIllllIIlIlIIIlIIll = llllllllllllllIllllIIlIlIIIllIII.toCharArray();
        int llllllllllllllIllllIIlIlIIIlIIlI = llllllllllllllIllllIIlIlIIIlIIll.length;
        int llllllllllllllIllllIIlIlIIIlIIIl = lIIllIIIIlIlI[0];
        while (B.lIlIlllIllIIIlI(llllllllllllllIllllIIlIlIIIlIIIl, llllllllllllllIllllIIlIlIIIlIIlI)) {
            char llllllllllllllIllllIIlIlIIIllllI = llllllllllllllIllllIIlIlIIIlIIll[llllllllllllllIllllIIlIlIIIlIIIl];
            llllllllllllllIllllIIlIlIIIllIll.append((char)(llllllllllllllIllllIIlIlIIIllllI ^ llllllllllllllIllllIIlIlIIIllIlI[llllllllllllllIllllIIlIlIIIllIIl % llllllllllllllIllllIIlIlIIIllIlI.length]));
            "".length();
            ++llllllllllllllIllllIIlIlIIIllIIl;
            ++llllllllllllllIllllIIlIlIIIlIIIl;
            "".length();
            if ((0xA3 ^ 0xA7) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIlIlIIIllIll);
    }

    /*
     * WARNING - void declaration
     */
    private void H() {
        void var2_2;
        World llllllllllllllIllllIIlIlIIllllIl;
        void llllllllllllllIllllIIlIlIIlllllI;
        int n2 = this.aP.c();
        if (B.lIlIlllIlIlllIl(Worlds.getCurrentId(), n2)) {
            this.aP.a(lIIllIIIIlIlI[3]);
            return;
        }
        if (B.lIlIlllIlIllllI((int)llllllllllllllIllllIIlIlIIlllllI, lIIllIIIIlIlI[3])) {
            llllllllllllllIllllIIlIlIIllllIl = Worlds.getFirst((int)llllllllllllllIllllIIlIlIIlllllI);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        } else {
            llllllllllllllIllllIIlIlIIllllIl = Worlds.getFirst(world -> {
                int n2;
                if (B.lIlIlllIlIllIIl(world.isNormal() ? 1 : 0) && B.lIlIlllIlIllIIl(world.isMembers() ? 1 : 0) && B.lIlIlllIllIIIII(world.getId(), Worlds.getCurrentId())) {
                    n2 = lIIllIIIIlIlI[2];
                    "".length();
                    if (null != null) {
                        return ((0 ^ 0x1C) & ~(7 ^ 0x1B)) != 0;
                    }
                } else {
                    n2 = lIIllIIIIlIlI[0];
                }
                return n2 != 0;
            });
        }
        if (B.lIlIlllIlIlllll(llllllllllllllIllllIIlIlIIllllIl) && B.lIlIlllIlIlllll(llllllllllllllIllllIIlIlIIllllIl = Worlds.getFirst(world -> {
            int n2;
            if (B.lIlIlllIlIllIIl(world.isNormal() ? 1 : 0) && B.lIlIlllIlIllIIl(world.isMembers() ? 1 : 0)) {
                n2 = lIIllIIIIlIlI[2];
                "".length();
                if (null != null) {
                    return ((0x5E ^ 0x71) & ~(0x76 ^ 0x59)) != 0;
                }
            } else {
                n2 = lIIllIIIIlIlI[0];
            }
            return n2 != 0;
        }))) {
            return;
        }
        Worlds.hopTo((World)var2_2);
    }

    private static boolean lIlIlllIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIlIlllll(Object object) {
        return object == null;
    }

    public boolean run() {
        B llllllllllllllIllllIIlIlIlIIIlll;
        if (B.lIlIlllIlIllIIl(this.aO.s() ? 1 : 0)) {
            return lIIllIIIIlIlI[0];
        }
        Item llllllllllllllIllllIIlIlIlIIIllI = Inventory.getFirst(item -> item.getName().startsWith(lIIlIllllllIl[lIIllIIIIlIlI[2]]));
        if (B.lIlIlllIlIllIlI(llllllllllllllIllllIIlIlIlIIIllI) && B.lIlIlllIlIllIll(Movement.isStaminaBoosted() ? 1 : 0) && B.lIlIlllIlIlllII(Movement.getRunEnergy(), lIIllIIIIlIlI[1])) {
            llllllllllllllIllllIIlIlIlIIIllI.interact(lIIlIllllllIl[lIIllIIIIlIlI[0]]);
            return lIIllIIIIlIlI[2];
        }
        InventorySetup llllllllllllllIllllIIlIlIlIIIlIl = llllllllllllllIllllIIlIlIlIIIlll.aO.r();
        if (B.lIlIlllIlIllIll(llllllllllllllIllllIIlIlIlIIIlIl.matchesInventory() ? 1 : 0)) {
            return lIIllIIIIlIlI[0];
        }
        g llllllllllllllIllllIIlIlIlIIIlII = llllllllllllllIllllIIlIlIlIIIlll.aO.t();
        Player llllllllllllllIllllIIlIlIlIIIIll = Players.getNearest(player -> {
            int n2;
            if (B.lIlIlllIlIllIIl(llllllllllllllIllllIIlIlIlIIIlII.x().contains((Locatable)player) ? 1 : 0) && B.lIlIlllIllIIIIl(player, Players.getLocal())) {
                n2 = lIIllIIIIlIlI[2];
                "".length();
                if (null != null) {
                    return ((108 + 222 - 176 + 87 ^ 111 + 29 - 58 + 106) & (196 + 95 - 124 + 41 ^ 66 + 64 - 114 + 141 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIIllIIIIlIlI[0];
            }
            return n2 != 0;
        });
        if (B.lIlIlllIlIllIlI(llllllllllllllIllllIIlIlIlIIIIll)) {
            llllllllllllllIllllIIlIlIlIIIlll.H();
            return lIIllIIIIlIlI[0];
        }
        if (B.lIlIlllIlIllIIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llllllllllllllIllllIIlIlIlIIIlII.A());
            "".length();
            return lIIllIIIIlIlI[2];
        }
        return lIIllIIIIlIlI[2];
    }

    private static boolean lIlIlllIlIllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlllIlIllIlI(Object object) {
        return object != null;
    }

    static {
        B.lIlIlllIlIllIII();
        B.lIlIlllIIlIIlIl();
    }

    private static boolean lIlIlllIlIllIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public B(c c2, SquireShamansPlugin squireShamansPlugin) {
        this.aO = c2;
        this.aP = squireShamansPlugin;
    }

    private static String lIlIlllIIlIIIll(String llllllllllllllIllllIIlIlIIlIllIl, String llllllllllllllIllllIIlIlIIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIlIIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIIllIIIIlIlI[5]), "DES");
            Cipher llllllllllllllIllllIIlIlIIlIllll = Cipher.getInstance("DES");
            llllllllllllllIllllIIlIlIIlIllll.init(lIIllIIIIlIlI[4], llllllllllllllIllllIIlIlIIllIIII);
            return new String(llllllllllllllIllllIIlIlIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIlIlIIlIlllI) {
            llllllllllllllIllllIIlIlIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIllIIIIl(Object object, Object object2) {
        return object != object2;
    }
}

