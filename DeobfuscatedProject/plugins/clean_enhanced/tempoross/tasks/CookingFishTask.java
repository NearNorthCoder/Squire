/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Cooking fish", priority=5, blocking=true)
public class CookingFishTask
extends TemporossTaskBase {

    @Inject
    protected CookingFishTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    private int d() {
        int[] nArray = new int[var1[0]];
        nArray[e.var1[1]] = var1[6];
        return Inventory.getCount((int[])nArray);
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static boolean var18(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var19;
        e var20;
        void var21;
        void var22;
        c c2 = this.ar.N();
        TileObject tileObject = c2.V();
        int[] nArray = new int[var1[0]];
        nArray[e.var1[1]] = var1[2];
        TileObject tileObject2 = TileObjects.getNearest((int[])nArray);
        Player player = Players.getLocal();
        if ((!e.var16(player.getAnimation(), var1[3]) || e.var17(player.isMoving() ? 1 : 0)) && e.var18(Dialog.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (e.var17(var22 instanceof GameObject) && e.var17(((GameObject)var22).getWorldArea().contains(var21.getWorldLocation()) ? 1 : 0)) {
            System.out.println(var2[var1[1]]);
            NPC var23 = var20.au.a((SceneEntity)var19);
            if (e.var15(var23)) {
                return var20.au.b((SceneEntity)var19);
            }
            var19.interact(var2[var1[0]]);
            return var1[1];
        }
        if (e.var24(var19)) {
            void var25;
            System.out.println(var2[var1[4]]);
            return var20.ar.f(var25.ah());
        }
        if (e.var17(var20.au.a((Locatable)var19) ? 1 : 0)) {
            return var20.au.b((SceneEntity)var19);
        }
        tileObject.interact(var2[var1[5]]);
        this.sleep(var1[4]);
        return var1[0];
    }

    private static boolean var26(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var27() {
        var2 = new String[var1[7]];
        e.var2[e.var1[1]] = "Dodging fire!";
        e.var2[e.var1[0]] = "Cook-at";
        e.var2[e.var1[4]] = "range is null";
        e.var2[e.var1[5]] = "Cook-at";
    }

    static {
        e.var28();
        e.var27();
    }

    @Override
    public boolean ak() {
        int n2;
        e var29;
        if ((!e.var18(this.as.cookFish() ? 1 : 0) || e.var17(this.as.solo() ? 1 : 0)) && e.var18(var29.ar.L() ? 1 : 0) && e.var17(var29.d()) && e.var26(var29.au.f(), var29.as.numberOfFish())) {
            n2 = var1[0];
            0;
            if (-1 >= 0) {
                return ((112 + 90 - 75 + 10 ^ 84 + 33 - 87 + 103) & (0x49 ^ 0x73 ^ (0x98 ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

    private static boolean var30(int n2, int n3) {
        return n2 < n3;
    }

    private static void var28() {
        var1 = new int[9];
        e.var1[0] = 1;
        e.var1[1] = (0x1D ^ 0x1B) & ~(0x5A ^ 0x5C);
        e.var1[2] = 0xFFFFFE7F & 0xA1AE;
        e.var1[3] = -(0xFFFFF176 & 0x7E9F) & (0xFFFFFFB7 & 0x73DD);
        e.var1[4] = 2;
        e.var1[5] = 3;
        e.var1[6] = 0xFFFFEFDF & 0x73FC;
        e.var1[7] = 0x1A ^ 0x5C ^ (0x17 ^ 0x55);
        e.var1[8] = 0x8A ^ 0xB7 ^ (0 ^ 0x35);
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    private static String var31(String var32, String var33) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var34 = new StringBuilder();
        char[] var35 = var33.toCharArray();
        int var36 = var1[1];
        char[] var37 = var32.toCharArray();
        int var38 = var37.length;
        int var39 = var1[1];
        while (e.var30(var39, var38)) {
            char var40 = var37[var39];
            var34.append((char)(var40 ^ var35[var36 % var35.length]));
            0;
            ++var36;
            ++var39;
            0;
            if ((0x1E ^ 0x1A) > 0) continue;
            return null;
        }
        return String.valueOf(var34);
    }
}

