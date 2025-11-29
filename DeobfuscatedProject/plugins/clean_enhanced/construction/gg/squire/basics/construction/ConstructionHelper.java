/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.basics.construction;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.construction.ConstructionHelperConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@SquireUtil
@PluginDescriptor(name="Squire Construction Helper", description="removes / builds", enabledByDefault=false)
public class ConstructionHelper
extends SquirePlugin {
    private static  String[] lIIlIIll;
    @Inject
     ConfigManager bA;
    private  List<Integer> co;
    @Inject
     ConstructionHelperConfig cn;
    private static  int[] lIIlIlII;

    protected Class<?>[] tasks() {
        return new Class[lIIlIlII[5]];
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
    }

    private static boolean var1(int n2, int n3) {
        return n2 <= n3;
    }

    protected void onStart() {
    }

    private static void var2() {
        lIIlIlII = new int[14];
        ConstructionHelper.lIIlIlII[0] = 0xFFFF83FC & 0x7FC3;
        ConstructionHelper.lIIlIlII[1] = 0xFFFFBEEF & 0x635A;
        ConstructionHelper.lIIlIlII[2] = 0xFFFFF37F & 0x2ECC;
        ConstructionHelper.lIIlIlII[3] = -(0xFFFFFB39 & 0xDC7) & (0xFFFFEB4E & 0x3FFF);
        ConstructionHelper.lIIlIlII[4] = 1;
        ConstructionHelper.lIIlIlII[5] = (114 + 31 - -30 + 1 ^ 84 + 40 - 5 + 64) & (150 + 115 - 177 + 88 ^ 168 + 51 - 193 + 157 ^ -1);
        ConstructionHelper.lIIlIlII[6] = 2;
        ConstructionHelper.lIIlIlII[7] = 3;
        ConstructionHelper.lIIlIlII[8] = 0x80 ^ 0xB1 ^ (0x2C ^ 0x19);
        ConstructionHelper.lIIlIlII[9] = -(0xFFFFBEF6 & 0x6D3F) & (0xFFFFBDFF & 0x6FFF);
        ConstructionHelper.lIIlIlII[10] = 15 + 82 - -8 + 26 ^ 79 + 31 - 34 + 58;
        ConstructionHelper.lIIlIlII[11] = 0x58 ^ 0x35 ^ (0xCF ^ 0xA4);
        ConstructionHelper.lIIlIlII[12] = 7 + 124 - -11 + 28 ^ 75 + 52 - 90 + 136;
        ConstructionHelper.lIIlIlII[13] = 0x4D ^ 0x2F ^ (0x27 ^ 0x4D);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        ConstructionHelper var10;
        if (ConstructionHelper.var1(Inventory.getCount(item -> this.co.contains(item.getId())), lIIlIlII[4])) {
            this.aT();
            return;
        }
        int[] nArray = new int[lIIlIlII[4]];
        nArray[ConstructionHelper.lIIlIlII[5]] = var10.cn.removeObjectID();
        TileObject var11 = TileObjects.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIlIlII[4]];
        nArray2[ConstructionHelper.lIIlIlII[5]] = var10.cn.buildObjectID();
        TileObject var12 = TileObjects.getNearest((int[])nArray2);
        if (ConstructionHelper.var13(var11)) {
            if (ConstructionHelper.var14(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIIlIlII[4]);
                0;
                System.out.println(lIIlIIll[lIIlIlII[4]]);
                return;
            }
            System.out.println(lIIlIIll[lIIlIlII[6]]);
            var11.interact(lIIlIIll[lIIlIlII[7]]);
        }
        if (ConstructionHelper.var13(var12)) {
            System.out.println(lIIlIIll[lIIlIlII[8]]);
            if (ConstructionHelper.var13(Widgets.get((int)lIIlIlII[9], (int)lIIlIlII[4])) && ConstructionHelper.var14(Widgets.get((int)lIIlIlII[9], (int)lIIlIlII[4]).isVisible() ? 1 : 0)) {
                System.out.println(lIIlIIll[lIIlIlII[10]]);
                Keyboard.type((int)var10.cn.buildOption());
                return;
            }
            var12.interact(lIIlIIll[lIIlIlII[11]]);
        }
    }

    private static void var15() {
        lIIlIIll = new String[lIIlIlII[13]];
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[5]] = "Talk-to";
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[4]] = "choosing option 1";
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[6]] = "Removing";
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[7]] = "Remove";
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[8]] = "Building";
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[10]] = "Choosing option";
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[11]] = "Build";
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[12]] = "butler";
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    protected void onStop() {
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    public void aT() {
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(lIIlIIll[lIIlIlII[12]]));
        if (ConstructionHelper.var16(nPC2)) {
            return;
        }
        if (ConstructionHelper.var14(Dialog.isOpen() ? 1 : 0)) {
            if (ConstructionHelper.var14(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                0;
                if (((69 + 111 - 145 + 118 ^ 64 + 117 - 148 + 138) & (0x3D ^ 0x40 ^ (0xDD ^ 0x92) ^ -1)) > 2) {
                    return;
                }
            } else {
                Dialog.chooseOption((int)lIIlIlII[4]);
                0;
            }
            return;
        }
        if (ConstructionHelper.var3(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        nPC2.interact(lIIlIIll[lIIlIlII[5]]);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    @Provides
    ConstructionHelperConfig g(ConfigManager configManager) {
        return (ConstructionHelperConfig)configManager.getConfig(ConstructionHelperConfig.class);
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = lIIlIlII[5];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = lIIlIlII[5];
        while (ConstructionHelper.var32(var31, var30)) {
            char var33 = var29[var31];
            var26.append((char)(var33 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var26);
    }

    static {
        ConstructionHelper.var2();
        ConstructionHelper.var15();
    }

    public ConstructionHelper() {
        this.co = List.of(Integer.valueOf(lIIlIlII[0]), Integer.valueOf(lIIlIlII[1]), Integer.valueOf(lIIlIlII[2]), Integer.valueOf(lIIlIlII[3]));
    }

    private static boolean var32(int n2, int n3) {
        return n2 < n3;
    }
}

