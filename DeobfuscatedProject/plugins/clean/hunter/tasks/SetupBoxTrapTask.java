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
import gg.squire.hunter.tasks.GameEnum25;
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

@TaskDesc(name="Setup Box Trap", priority=20, blocking=true)
public class SetupBoxTrapTask
extends HunterTaskBase {
    private final  int[] y;
    private  long A;
    private final  d x;

    private final  int[] z;

    private static boolean lIIIlllIllIlIIl(int n2) {
        return n2 > 0;
    }

    private static int lIIIlllIllIIlII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        n var2;
        void var3;
        Player player = Players.getLocal();
        if (n.lIIIlllIllIIlIl(this.y().b() ? 1 : 0) && n.lIIIlllIllIIllI(player.getAnimation(), llllIIIIlllI[11])) {
            return llllIIIIlllI[1];
        }
        if (!n.lIIIlllIllIIllI(var3.getAnimation(), llllIIIIlllI[11]) || n.lIIIlllIllIIlll(var3.getAnimation(), llllIIIIlllI[12])) {
            if (n.lIIIlllIllIlIII(var2.z().tickManipulation() ? 1 : 0)) {
                var2.tickManipulation();

            }
            return llllIIIIlllI[3];
        }
        if (n.lIIIlllIllIlIIl(n.lIIIlllIllIIlII(var2.A - 2L, var2.y().i().get()))) {
            Movement.walkTo((WorldPoint)var2.x.l());

            return llllIIIIlllI[3];
        }
        if (n.lIIIlllIllIlIlI((Object)var2.z().method(), (Object)e.CHINS)) {
            Item var4;
            WorldPoint var5 = var2.y().a(var2.x);
            if (n.lIIIlllIllIlIll(var5)) {
                return llllIIIIlllI[1];
            }
            Tile var6 = Tiles.getAt((WorldPoint)var5);
            if (n.lIIIlllIllIllII(var6) && n.lIIIlllIllIllII(var6.getGroundItems()) && n.lIIIlllIllIIlIl((var4 = var6.getGroundItems().stream().filter(tileItem -> {
                boolean bl;
                if (n.lIIIlllIllIIlll(tileItem.getId(), llllIIIIlllI[13])) {
                    bl = llllIIIIlllI[3];

                } else {
                    bl = llllIIIIlllI[1];
                }
                return bl;
            }).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
                ((TileItem)var4.get(llllIIIIlllI[1])).interact(llllIIIIllIl[llllIIIIlllI[1]]);
                var2.A = var2.y().i().get() - (long)(var3.distanceTo(var5) / llllIIIIlllI[5]);
                return llllIIIIlllI[3];
            }
            if (n.lIIIlllIllIIlIl(var3.getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var5, (boolean)llllIIIIlllI[1]);

                return llllIIIIlllI[3];
            }
            int[] nArray = new int[llllIIIIlllI[3]];
            nArray[n.llllIIIIlllI[1]] = llllIIIIlllI[13];
            var4 = Inventory.getFirst((int[])nArray);
            if (n.lIIIlllIllIlIll(var4)) {
                return llllIIIIlllI[1];
            }
            var4.interact(llllIIIIllIl[llllIIIIlllI[3]]);
            var2.A = var2.y().i().get();
            return llllIIIIlllI[3];
        }
        return llllIIIIlllI[3];
    }

    private static boolean lIIIlllIllIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private boolean tickManipulation() {
        n var7;
        int[] nArray = new int[llllIIIIlllI[3]];
        nArray[n.llllIIIIlllI[1]] = llllIIIIlllI[14];
        Item item = Inventory.getFirst((int[])nArray);
        Item item2 = Inventory.getFirst((int[])this.z);
        if (n.lIIIlllIllIllII(item2) && n.lIIIlllIllIllII(item)) {
            int[] nArray2 = new int[llllIIIIlllI[3]];
            nArray2[n.llllIIIIlllI[1]] = item.getId();
            Inventory.getFirst((int[])nArray2).useOn(item2);
            return llllIIIIlllI[3];
        }
        Item var8 = Inventory.getFirst((int[])var7.y);
        int[] nArray3 = new int[llllIIIIlllI[3]];
        nArray3[n.llllIIIIlllI[1]] = llllIIIIlllI[15];
        Item var9 = Inventory.getFirst((int[])nArray3);
        if (n.lIIIlllIllIllII(var8) && n.lIIIlllIllIllII(var9)) {
            int[] nArray4 = new int[llllIIIIlllI[3]];
            nArray4[n.llllIIIIlllI[1]] = var8.getId();
            Inventory.getFirst((int[])nArray4).useOn(var9);
            return llllIIIIlllI[3];
        }
        return llllIIIIlllI[1];
    }

    private static boolean lIIIlllIllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public SetupBoxTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
        this.x = this.z().chinLocation();
        int[] nArray = new int[llllIIIIlllI[0]];
        nArray[n.llllIIIIlllI[1]] = llllIIIIlllI[2];
        nArray[n.llllIIIIlllI[3]] = llllIIIIlllI[4];
        nArray[n.llllIIIIlllI[5]] = llllIIIIlllI[6];
        nArray[n.llllIIIIlllI[7]] = llllIIIIlllI[8];
        this.y = nArray;
        int[] nArray2 = new int[llllIIIIlllI[5]];
        nArray2[n.llllIIIIlllI[1]] = llllIIIIlllI[9];
        nArray2[n.llllIIIIlllI[3]] = llllIIIIlllI[10];
        this.z = nArray2;
        this.A = 0L;
    }

    private static boolean lIIIlllIllIIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllIllIIIlI() {
        llllIIIIllIl = new String[llllIIIIlllI[5]];
        n.llllIIIIllIl[n.llllIIIIlllI[1]] = "Lay";
        n.llllIIIIllIl[n.llllIIIIlllI[3]] = "Lay";
    }

    private static boolean lIIIlllIllIlIll(Object object) {
        return object == null;
    }

    private boolean A() {
        boolean bl;
        int n2 = Players.getLocal().getAnimation();
        if (!n.lIIIlllIllIIllI(n2, llllIIIIlllI[16]) || n.lIIIlllIllIIlll(n2, llllIIIIlllI[17])) {
            bl = llllIIIIlllI[3];

            }
        } else {
            bl = llllIIIIlllI[1];
        }
        return bl;
    }

    private static boolean lIIIlllIllIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlllIllIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIllIllII(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        n.lIIIlllIllIIIll();
        n.lIIIlllIllIIIlI();
    }
}

