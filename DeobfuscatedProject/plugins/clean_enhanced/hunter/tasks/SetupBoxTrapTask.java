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
import gg.squire.hunter.tasks.GameEnum5;
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

@TaskDesc(name="Setup Box Trap", priority=20, blocking=true)
public class SetupBoxTrapTask
extends HunterTaskBase {
    private final  int[] y;
    private  long A;
    private final  d x;

    private final  int[] z;

    private static boolean var3(int n2) {
        return n2 > 0;
    }

    private static void var4() {
        var1 = new int[19];
        n.var1[0] = 0x45 ^ 0x7B ^ (0xD ^ 0x37);
        n.var1[1] = (5 + 32 - -49 + 75 ^ 111 + 90 - 69 + 38) & (176 + 168 - 185 + 27 ^ 89 + 107 - 32 + 13 ^ -1);
        n.var1[2] = (0x70 ^ 6) + (84 + 29 - 87 + 201) - (10 + 108 - 38 + 53) + (0x8F ^ 0xAA);
        n.var1[3] = 1;
        n.var1[4] = (0xF ^ 8) + (61 + 41 - -24 + 15) - -(0x21 ^ 0x67) + (0x36 ^ 0x17);
        n.var1[5] = 2;
        n.var1[6] = 227 + 242 - 435 + 219;
        n.var1[7] = 3;
        n.var1[8] = (0xC1 ^ 0x87) + (144 + 69 - 141 + 80) - (97 + 86 - 89 + 119) + (186 + 14 - 137 + 183);
        n.var1[9] = -(0x3B ^ 0x7A) & (0xFFFFBFFF & 0x58FD);
        n.var1[10] = 0xFFFFF8FF & 0x1FBC;
        n.var1[11] = -(0xFFFFFBE9 & 0x6717) & (0xFFFFFFDF & 0x777C);
        n.var1[12] = 0xFFFF957C & 0x7EDB;
        n.var1[13] = 0xFFFFBF5A & 0x67BD;
        n.var1[14] = 0xFFFFB7BB & 0x4BF6;
        n.var1[15] = 0xFFFF9FFB & 0x6797;
        n.var1[16] = 0xFFFFD6E5 & 0x3D9B;
        n.var1[17] = 0xFFFFFEF2 & 0x5ED;
        n.var1[18] = 18 + 92 - 102 + 125 ^ 84 + 39 - 87 + 105;
    }

    private static int var5(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[1];
        while (n.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var9);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        n var17;
        void var18;
        Player player = Players.getLocal();
        if (n.var19(this.y().b() ? 1 : 0) && n.var20(player.getAnimation(), var1[11])) {
            return var1[1];
        }
        if (!n.var20(var18.getAnimation(), var1[11]) || n.var21(var18.getAnimation(), var1[12])) {
            if (n.var22(var17.z().tickManipulation() ? 1 : 0)) {
                var17.tickManipulation();
                0;
            }
            return var1[3];
        }
        if (n.var3(n.var5(var17.A - 2L, var17.y().i().get()))) {
            Movement.walkTo((WorldPoint)var17.x.l());
            0;
            return var1[3];
        }
        if (n.var23((Object)var17.z().method(), (Object)e.CHINS)) {
            Item var24;
            WorldPoint var25 = var17.y().a(var17.x);
            if (n.var26(var25)) {
                return var1[1];
            }
            Tile var27 = Tiles.getAt((WorldPoint)var25);
            if (n.var28(var27) && n.var28(var27.getGroundItems()) && n.var19((var24 = var27.getGroundItems().stream().filter(tileItem -> {
                boolean bl;
                if (n.var21(tileItem.getId(), var1[13])) {
                    bl = var1[3];
                    0;
                    if (-2 >= 0) {
                        return ((0x33 ^ 0x1B ^ (0x23 ^ 0x19)) & (0x37 ^ 0x3A ^ (0x95 ^ 0x8A) ^ -1)) != 0;
                    }
                } else {
                    bl = var1[1];
                }
                return bl;
            }).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
                ((TileItem)var24.get(var1[1])).interact(var2[var1[1]]);
                var17.A = var17.y().i().get() - (long)(var18.distanceTo(var25) / var1[5]);
                return var1[3];
            }
            if (n.var19(var18.getWorldLocation().equals((Object)var25) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var25, (boolean)var1[1]);
                0;
                return var1[3];
            }
            int[] nArray = new int[var1[3]];
            nArray[n.var1[1]] = var1[13];
            var24 = Inventory.getFirst((int[])nArray);
            if (n.var26(var24)) {
                return var1[1];
            }
            var24.interact(var2[var1[3]]);
            var17.A = var17.y().i().get();
            return var1[3];
        }
        return var1[3];
    }

    private static boolean var23(Object object, Object object2) {
        return object == object2;
    }

    private boolean tickManipulation() {
        n var29;
        int[] nArray = new int[var1[3]];
        nArray[n.var1[1]] = var1[14];
        Item item = Inventory.getFirst((int[])nArray);
        Item item2 = Inventory.getFirst((int[])this.z);
        if (n.var28(item2) && n.var28(item)) {
            int[] nArray2 = new int[var1[3]];
            nArray2[n.var1[1]] = item.getId();
            Inventory.getFirst((int[])nArray2).useOn(item2);
            return var1[3];
        }
        Item var30 = Inventory.getFirst((int[])var29.y);
        int[] nArray3 = new int[var1[3]];
        nArray3[n.var1[1]] = var1[15];
        Item var31 = Inventory.getFirst((int[])nArray3);
        if (n.var28(var30) && n.var28(var31)) {
            int[] nArray4 = new int[var1[3]];
            nArray4[n.var1[1]] = var30.getId();
            Inventory.getFirst((int[])nArray4).useOn(var31);
            return var1[3];
        }
        return var1[1];
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public SetupBoxTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
        this.x = this.z().chinLocation();
        int[] nArray = new int[var1[0]];
        nArray[n.var1[1]] = var1[2];
        nArray[n.var1[3]] = var1[4];
        nArray[n.var1[5]] = var1[6];
        nArray[n.var1[7]] = var1[8];
        this.y = nArray;
        int[] nArray2 = new int[var1[5]];
        nArray2[n.var1[1]] = var1[9];
        nArray2[n.var1[3]] = var1[10];
        this.z = nArray2;
        this.A = 0L;
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static void var32() {
        var2 = new String[var1[5]];
        n.var2[n.var1[1]] = "Lay";
        n.var2[n.var1[3]] = "Lay";
    }

    private static boolean var26(Object object) {
        return object == null;
    }

    private boolean A() {
        boolean bl;
        int n2 = Players.getLocal().getAnimation();
        if (!n.var20(n2, var1[16]) || n.var21(n2, var1[17])) {
            bl = var1[3];
            0;
            if null != null {
                return ((0x1B ^ 0x4B) & ~(0xFE ^ 0xAE)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var22(int n2) {
        return n2 != 0;
    }

    private static boolean var28(Object object) {
        return object != null;
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n2, int n3) {
        return n2 == n3;
    }

    static {
        n.var4();
        n.var32();
    }
}

