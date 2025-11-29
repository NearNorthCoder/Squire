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
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum15;
import gg.squire.hunter.tasks.GameEnum16;
import gg.squire.hunter.tasks.HunterTaskBase;
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
public class SetupBirdSnareTask
extends HunterTaskBase {
    
    private  long I;
    private final  c H;

    @Inject
    public SetupBirdSnareTask(a a2, SquireHunterConfig squireHunterConfig) {
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

    private static void lIIIlllIlIIIIlI() {
        llllIIIIIlII = new String[llllIIIIIlIl[3]];
        E.llllIIIIIlII[E.llllIIIIIlIl[0]] = "Lay";
        E.llllIIIIIlII[E.llllIIIIIlIl[1]] = "Lay";
    }

    private static boolean lIIIlllIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIIIlllIlIIIlII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
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

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var4_4;
        Item var2;
        E var3;
        if (E.lIIIlllIlIIIlIl(this.y().b() ? 1 : 0)) {
            return llllIIIIIlIl[0];
        }
        Player var4 = Players.getLocal();
        if (E.lIIIlllIlIIIllI(E.lIIIlllIlIIIlII(var3.I - 2L, var3.y().i().get()))) {
            if (E.lIIIlllIlIIIlIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIIIIIlIl[0];
            }
            Movement.walkTo((WorldPoint)var3.H.l());

            return llllIIIIIlIl[1];
        }
        WorldPoint var5 = var3.y().a(var3.H);
        if (E.lIIIlllIlIIIlll(var5)) {
            return llllIIIIIlIl[0];
        }
        if (E.lIIIlllIlIIlIII(var4.isAnimating() ? 1 : 0) && E.lIIIlllIlIIlIIl(var4.getAnimationFrame(), llllIIIIIlIl[2])) {
            return llllIIIIIlIl[0];
        }
        Tile var6 = Tiles.getAt((WorldPoint)var5);
        if (E.lIIIlllIlIIlIlI(var6) && E.lIIIlllIlIIlIlI(var6.getGroundItems()) && E.lIIIlllIlIIIlIl((var2 = var6.getGroundItems().stream().filter(tileItem -> {
            boolean bl;
            if (E.lIIIlllIlIIlIll(tileItem.getId(), llllIIIIIlIl[4])) {
                bl = llllIIIIIlIl[1];

                if ((0xB5 ^ 0xB1) < 0) {
                    return false;
                }
            } else {
                bl = llllIIIIIlIl[0];
            }
            return bl;
        }).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
            ((TileItem)var2.get(llllIIIIIlIl[0])).interact(llllIIIIIlII[llllIIIIIlIl[0]]);
            var3.I = var3.y().i().get() - (long)(var4.distanceTo(var5) / llllIIIIIlIl[3]);
            return llllIIIIIlIl[1];
        }
        if (E.lIIIlllIlIIIlIl(var4.getWorldLocation().equals((Object)var5) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var5);

            return llllIIIIIlIl[1];
        }
        int[] nArray = new int[llllIIIIIlIl[1]];
        nArray[E.llllIIIIIlIl[0]] = llllIIIIIlIl[4];
        var2 = Inventory.getFirst((int[])nArray);
        if (E.lIIIlllIlIIIlll(var2)) {
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

