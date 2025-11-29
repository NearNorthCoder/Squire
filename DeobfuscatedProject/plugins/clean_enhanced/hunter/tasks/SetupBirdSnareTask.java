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
import gg.squire.hunter.tasks.GameEnum3;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.util.stream.Collectors;
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
        E.var3();
        E.var4();
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[6];
        E.var1[0] = (0x14 ^ 0x48) & ~(0xA ^ 0x56);
        E.var1[1] = 1;
        E.var1[2] = 31 + 55 - 12 + 59 ^ 44 + 136 - 146 + 109;
        E.var1[3] = 2;
        E.var1[4] = 0xFFFFBF3F & 0x67D6;
        E.var1[5] = 0x20 ^ 0x28;
    }

    private static void var4() {
        var2 = new String[var1[3]];
        E.var2[E.var1[0]] = "Lay";
        E.var2[E.var1[1]] = "Lay";
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    private static int var7(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    private static boolean var15(int n2) {
        return n2 > 0;
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (E.var27(var26, var25)) {
            char var28 = var24[var26];
            var21.append((char)(var28 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (1 > ((17 + 89 - 70 + 106 ^ 161 + 70 - 126 + 70) & (0x36 ^ 5 ^ (0x81 ^ 0x93) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var4_4;
        Item var29;
        E var30;
        if (E.var14(this.y().b() ? 1 : 0)) {
            return var1[0];
        }
        Player var31 = Players.getLocal();
        if (E.var15(E.var7(var30.I - 2L, var30.y().i().get()))) {
            if (E.var14(Movement.shouldWalk() ? 1 : 0)) {
                return var1[0];
            }
            Movement.walkTo((WorldPoint)var30.H.l());
            0;
            return var1[1];
        }
        WorldPoint var32 = var30.y().a(var30.H);
        if (E.var17(var32)) {
            return var1[0];
        }
        if (E.var5(var31.isAnimating() ? 1 : 0) && E.var27(var31.getAnimationFrame(), var1[2])) {
            return var1[0];
        }
        Tile var33 = Tiles.getAt((WorldPoint)var32);
        if (E.var16(var33) && E.var16(var33.getGroundItems()) && E.var14((var29 = var33.getGroundItems().stream().filter(tileItem -> {
            boolean bl;
            if (E.var6(tileItem.getId(), var1[4])) {
                bl = var1[1];
                0;
                if ((0xB5 ^ 0xB1) < 0) {
                    return ((0x6F ^ 0x32) & ~(0xE9 ^ 0xB4)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
            ((TileItem)var29.get(var1[0])).interact(var2[var1[0]]);
            var30.I = var30.y().i().get() - (long)(var31.distanceTo(var32) / var1[3]);
            return var1[1];
        }
        if (E.var14(var31.getWorldLocation().equals((Object)var32) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var32);
            0;
            return var1[1];
        }
        int[] nArray = new int[var1[1]];
        nArray[E.var1[0]] = var1[4];
        var29 = Inventory.getFirst((int[])nArray);
        if (E.var17(var29)) {
            return var1[0];
        }
        var4_4.interact(var2[var1[1]]);
        this.I = this.y().i().get();
        return var1[1];
    }

    private static boolean var27(int n2, int n3) {
        return n2 < n3;
    }
}

