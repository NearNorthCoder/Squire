/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Tile
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.scene.Tiles
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.c;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.scene.Tiles;

@TaskDesc(name="Setup Bird Snare", priority=20, blocking=true)
public class E
extends j {
    private static /* synthetic */ int[] llllIIIIIlIl;
    private /* synthetic */ long I;
    private final /* synthetic */ c H;
    private static /* synthetic */ String[] llllIIIIIlII;

    @Inject
    public E(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
        this.H = this.z().birdLocation();
        this.I = 0L;
    }

    static {
        E.lIIIlllIlIIIIll();
        E.lIIIlllIlIIIIlI();
    }

    private static boolean lIIIlllIlIIlIII(int n2) {
        return n2 != 0;
    }

    private static void lIIIlllIlIIIIll() {
        llllIIIIIlIl = new int[6];
        E.llllIIIIIlIl[0] = (0x14 ^ 0x48) & ~(0xA ^ 0x56);
        E.llllIIIIIlIl[1] = 1;
        E.llllIIIIIlIl[2] = 31 + 55 - 12 + 59 ^ 44 + 136 - 146 + 109;
        E.llllIIIIIlIl[3] = 2;
        E.llllIIIIIlIl[4] = 0xFFFFBF3F & 0x67D6;
        E.llllIIIIIlIl[5] = 0x20 ^ 0x28;
    }

    private static void lIIIlllIlIIIIlI() {
        llllIIIIIlII = new String[llllIIIIIlIl[3]];
        E.llllIIIIIlII[E.llllIIIIIlIl[0]] = E."Lay";
        E.llllIIIIIlII[E.llllIIIIIlIl[1]] = E."Lay";
    }

    private static boolean lIIIlllIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIIIlllIlIIIlII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String lIIIlllIlIIIIII(String lllllllllllllllIIlIllIlIIlIIlIIl, String lllllllllllllllIIlIllIlIIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIIIIlIl[5]), "DES");
            Cipher lllllllllllllllIIlIllIlIIlIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlIIlIIllIl.init(llllIIIIIlIl[3], lllllllllllllllIIlIllIlIIlIIlllI);
            return new String(lllllllllllllllIIlIllIlIIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlIIlIIllII) {
            lllllllllllllllIIlIllIlIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIlIIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlllIlIIlIlI(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIlIIIlll(Object object) {
        return object == null;
    }

    private static String lIIIlllIlIIIIIl(String lllllllllllllllIIlIllIlIIIlllIll, String lllllllllllllllIIlIllIlIIIlllIlI) {
        lllllllllllllllIIlIllIlIIIlllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIlIIIlllIIl = new StringBuilder();
        char[] lllllllllllllllIIlIllIlIIIlllIII = lllllllllllllllIIlIllIlIIIlllIlI.toCharArray();
        int lllllllllllllllIIlIllIlIIIllIlll = llllIIIIIlIl[0];
        char[] lllllllllllllllIIlIllIlIIIllIIIl = lllllllllllllllIIlIllIlIIIlllIll.toCharArray();
        int lllllllllllllllIIlIllIlIIIllIIII = lllllllllllllllIIlIllIlIIIllIIIl.length;
        int lllllllllllllllIIlIllIlIIIlIllll = llllIIIIIlIl[0];
        while (E.lIIIlllIlIIlIIl(lllllllllllllllIIlIllIlIIIlIllll, lllllllllllllllIIlIllIlIIIllIIII)) {
            char lllllllllllllllIIlIllIlIIIllllII = lllllllllllllllIIlIllIlIIIllIIIl[lllllllllllllllIIlIllIlIIIlIllll];
            lllllllllllllllIIlIllIlIIIlllIIl.append((char)(lllllllllllllllIIlIllIlIIIllllII ^ lllllllllllllllIIlIllIlIIIlllIII[lllllllllllllllIIlIllIlIIIllIlll % lllllllllllllllIIlIllIlIIIlllIII.length]));
            0;
            ++lllllllllllllllIIlIllIlIIIllIlll;
            ++lllllllllllllllIIlIllIlIIIlIllll;
            0;
            if (1 > ((17 + 89 - 70 + 106 ^ 161 + 70 - 126 + 70) & (0x36 ^ 5 ^ (0x81 ^ 0x93) ^ -1))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIlIIIlllIIl);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var4_4;
        Item lllllllllllllllIIlIllIlIIlIlIlIl;
        E lllllllllllllllIIlIllIlIIlIllIIl;
        if (E.lIIIlllIlIIIlIl(this.y().b() ? 1 : 0)) {
            return llllIIIIIlIl[0];
        }
        Player lllllllllllllllIIlIllIlIIlIllIII = Players.getLocal();
        if (E.lIIIlllIlIIIllI(E.lIIIlllIlIIIlII(lllllllllllllllIIlIllIlIIlIllIIl.I - 2L, lllllllllllllllIIlIllIlIIlIllIIl.y().i().get()))) {
            if (E.lIIIlllIlIIIlIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIIIIIlIl[0];
            }
            Movement.walkTo((WorldPoint)lllllllllllllllIIlIllIlIIlIllIIl.H.l());
            0;
            return llllIIIIIlIl[1];
        }
        WorldPoint lllllllllllllllIIlIllIlIIlIlIlll = lllllllllllllllIIlIllIlIIlIllIIl.y().a(lllllllllllllllIIlIllIlIIlIllIIl.H);
        if (E.lIIIlllIlIIIlll(lllllllllllllllIIlIllIlIIlIlIlll)) {
            return llllIIIIIlIl[0];
        }
        if (E.lIIIlllIlIIlIII(lllllllllllllllIIlIllIlIIlIllIII.isAnimating() ? 1 : 0) && E.lIIIlllIlIIlIIl(lllllllllllllllIIlIllIlIIlIllIII.getAnimationFrame(), llllIIIIIlIl[2])) {
            return llllIIIIIlIl[0];
        }
        Tile lllllllllllllllIIlIllIlIIlIlIllI = Tiles.getAt((WorldPoint)lllllllllllllllIIlIllIlIIlIlIlll);
        if (E.lIIIlllIlIIlIlI(lllllllllllllllIIlIllIlIIlIlIllI) && E.lIIIlllIlIIlIlI(lllllllllllllllIIlIllIlIIlIlIllI.getGroundItems()) && E.lIIIlllIlIIIlIl((lllllllllllllllIIlIllIlIIlIlIlIl = lllllllllllllllIIlIllIlIIlIlIllI.getGroundItems().stream().filter(tileItem -> {
            boolean bl;
            if (E.lIIIlllIlIIlIll(tileItem.getId(), llllIIIIIlIl[4])) {
                bl = llllIIIIIlIl[1];
                0;
                if ((0xB5 ^ 0xB1) < 0) {
                    return ((0x6F ^ 0x32) & ~(0xE9 ^ 0xB4)) != 0;
                }
            } else {
                bl = llllIIIIIlIl[0];
            }
            return bl;
        }).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
            ((TileItem)lllllllllllllllIIlIllIlIIlIlIlIl.get(llllIIIIIlIl[0])).interact(llllIIIIIlII[llllIIIIIlIl[0]]);
            lllllllllllllllIIlIllIlIIlIllIIl.I = lllllllllllllllIIlIllIlIIlIllIIl.y().i().get() - (long)(lllllllllllllllIIlIllIlIIlIllIII.distanceTo(lllllllllllllllIIlIllIlIIlIlIlll) / llllIIIIIlIl[3]);
            return llllIIIIIlIl[1];
        }
        if (E.lIIIlllIlIIIlIl(lllllllllllllllIIlIllIlIIlIllIII.getWorldLocation().equals((Object)lllllllllllllllIIlIllIlIIlIlIlll) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)lllllllllllllllIIlIllIlIIlIlIlll);
            0;
            return llllIIIIIlIl[1];
        }
        int[] nArray = new int[llllIIIIIlIl[1]];
        nArray[E.llllIIIIIlIl[0]] = llllIIIIIlIl[4];
        lllllllllllllllIIlIllIlIIlIlIlIl = Inventory.getFirst((int[])nArray);
        if (E.lIIIlllIlIIIlll(lllllllllllllllIIlIllIlIIlIlIlIl)) {
            return llllIIIIIlIl[0];
        }
        var4_4.interact(llllIIIIIlII[llllIIIIIlIl[1]]);
        this.I = this.y().i().get();
        return llllIIIIIlIl[1];
    }

    private static boolean lIIIlllIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }
}

