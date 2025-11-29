/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import gg.squire.gauntlet.tasks.CookingFoodTask;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GameEnum5;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.MHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Crafting gear", priority=5, blocking=true)
public class CraftingGearTask
extends GauntletTaskBase {

    private final  B bQ;
    private  int bR;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        C var4;
        void var5;
        void var6;
        Player player = Players.getLocal();
        h h2 = this.ba.V();
        if (!C.var7(h2) || C.var8(player)) {
            return var1[1];
        }
        int var9 = var6.av().e(var5.getWorldLocation()) ? 1 : 0;
        if (C.var3(var9)) {
            if (C.var10(Movement.isWalking() ? 1 : 0)) {
                return var1[2];
            }
            m var11 = var4.ba.V().av();
            WorldPoint var12 = var11.aQ();
            if (C.var10(var12.isInScene(Static.getClient()) ? 1 : 0)) {
                ScenePoint var13 = ScenePoint.fromWorld((WorldPoint)var12);
                Movement.setDestination((int)var13.getX(), (int)var13.getY());
                0;
                if (((0x31 ^ 0x23) & ~(0xD ^ 0x1F)) != 0) {
                    return ((0x5A ^ 0x10) & ~(0x49 ^ 3)) != 0;
                }
            } else {
                var4.ba.a((var11, var5.getWorldLocation());
                0;
            }
            return var1[2];
        }
        List<f> var11 = var4.ba.I();
        if (C.var3(var11.isEmpty() ? 1 : 0)) {
            Item var13;
            Widget var12;
            if (C.var10(Movement.isWalking() ? 1 : 0)) {
                return var1[2];
            }
            if (C.var10(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[var1[2]];
                nArray[C.var1[1]] = var1[4];
                var12 = Inventory.getFirst((int[])nArray);
                if (C.var7(var12)) {
                    var12.interact(var2[var1[1]]);
                    var4.ba.V().av().k(var1[2]);
                    return var1[2];
                }
                int[] nArray2 = new int[var1[2]];
                nArray2[C.var1[1]] = var1[5];
                var13 = Inventory.getFirst((int[])nArray2);
                if (C.var7(var13)) {
                    var13.interact(var2[var1[2]]);
                    return var1[2];
                }
            }
            if (C.var14(var4.bR)) {
                var4.bR -= var1[2];
                return var1[2];
            }
            var12 = Widgets.get((int)var1[6], (int)var1[7]);
            if (C.var7(var12) && C.var3(var12.isHidden() ? 1 : 0)) {
                Item var15 = var13 = var12.getStaticChildren();
                int var16 = ((Widget[])var15).length;
                int var17 = var1[1];
                while (C.var18(var17, var16)) {
                    Item var19 = var15[var17];
                    String var20 = var19.getName();
                    List<String> var21 = var11.get(var1[1]).ae();
                    Stream stream = var21.stream();
                    String string = var20;
                    Objects.requireNonNull(string);
                    0;
                    if (C.var10(stream.anyMatch(string::contains) ? 1 : 0)) {
                        var19.interact(var2[var1[3]]);
                        var4.bR = var1[2];
                        return var1[2];
                    }
                    ++var17;
                    0;
                    if (-1 != 3) continue;
                    return ((22 + 57 - 70 + 175 ^ 136 + 102 - 141 + 47) & (5 ^ 0x56 ^ (0x53 ^ 0x28) ^ -1)) != 0;
                }
                return var1[1];
            }
            String[] stringArray = new String[var1[2]];
            stringArray[C.var1[1]] = var2[var1[0]];
            var13 = TileObjects.getNearest((String[])stringArray);
            if (C.var7(var13)) {
                var13.interact(var2[var1[8]]);
                return var1[2];
            }
        }
        return var1[1];
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = var1[1];
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = var1[1];
        while (C.var18(var36, var35)) {
            char var37 = var34[var36];
            var31.append((char)(var37 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            
            return null;
        }
        return String.valueOf(var31);
    }

    private static void var38() {
        var1 = new int[11];
        C.var1[0] = 3;
        C.var1[1] = (0xB2 ^ 0x9D) & ~(0x2C ^ 3);
        C.var1[2] = 1;
        C.var1[3] = 2;
        C.var1[4] = 0xFFFFFDD7 & 0x5F68;
        C.var1[5] = -(0xFFFFB69D & 0x6BEF) & (0xFFFFFFEF & 0x7FDE);
        C.var1[6] = -(0xFFFFBCA9 & 0x5FF7) & (0xFFFFFFBF & 0x1DEE);
        C.var1[7] = 0x2D ^ 0x23;
        C.var1[8] = 0xCB ^ 0x87 ^ (0x6B ^ 0x23);
        C.var1[9] = 0xF9 ^ 0xC5 ^ (0xFF ^ 0xC6);
        C.var1[10] = 0x4A ^ 0x42;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var44) {
            var44.printStackTrace();
            return null;
        }
    }

    @Inject
    public CraftingGearTask(c c2, B b2) {
        d[] dArray = new d[var1[0]];
        dArray[C.var1[1]] = d.FIRST_ROTATION_CREATE;
        dArray[C.var1[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[C.var1[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
        this.bQ = b2;
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static boolean var14(int n2) {
        return n2 > 0;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    static {
        C.var38();
        C.var45();
    }

    private static void var45() {
        var2 = new String[var1[9]];
        C.var2[C.var1[1]] = "Drop";
        C.var2[C.var1[2]] = "Eat";
        C.var2[C.var1[3]] = "Make";
        C.var2[C.var1[0]] = "Singing Bowl";
        C.var2[C.var1[8]] = "Sing-crystal";
    }
}

