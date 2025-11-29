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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    @Inject
     ConfigManager bA;
    private  List<Integer> co;
    @Inject
     ConstructionHelperConfig cn;

    protected Class<?>[] tasks() {
        return new Class[lIIlIlII[5]];
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
    }

    private static boolean lIIIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    protected void onStart() {
    }

    private static boolean lIIIlIlllI(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        ConstructionHelper lllIIIlIlIIllIl;
        if (ConstructionHelper.lIIIlIllll(Inventory.getCount(item -> this.co.contains(item.getId())), lIIlIlII[4])) {
            this.aT();
            return;
        }
        int[] nArray = new int[lIIlIlII[4]];
        nArray[ConstructionHelper.lIIlIlII[5]] = lllIIIlIlIIllIl.cn.removeObjectID();
        TileObject lllIIIlIlIIllII = TileObjects.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIlIlII[4]];
        nArray2[ConstructionHelper.lIIlIlII[5]] = lllIIIlIlIIllIl.cn.buildObjectID();
        TileObject lllIIIlIlIIlIll = TileObjects.getNearest((int[])nArray2);
        if (ConstructionHelper.lIIIllIIII(lllIIIlIlIIllII)) {
            if (ConstructionHelper.lIIIlIllIl(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIIlIlII[4]);

                System.out.println(lIIlIIll[lIIlIlII[4]]);
                return;
            }
            System.out.println(lIIlIIll[lIIlIlII[6]]);
            lllIIIlIlIIllII.interact(lIIlIIll[lIIlIlII[7]]);
        }
        if (ConstructionHelper.lIIIllIIII(lllIIIlIlIIlIll)) {
            System.out.println(lIIlIIll[lIIlIlII[8]]);
            if (ConstructionHelper.lIIIllIIII(Widgets.get((int)lIIlIlII[9], (int)lIIlIlII[4])) && ConstructionHelper.lIIIlIllIl(Widgets.get((int)lIIlIlII[9], (int)lIIlIlII[4]).isVisible() ? 1 : 0)) {
                System.out.println(lIIlIIll[lIIlIlII[10]]);
                Keyboard.type((int)lllIIIlIlIIllIl.cn.buildOption());
                return;
            }
            lllIIIlIlIIlIll.interact(lIIlIIll[lIIlIlII[11]]);
        }
    }

    private static void lIIIlIlIlI() {
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

    private static boolean lIIIlIllII(Object object) {
        return object == null;
    }

    private static boolean lIIIllIIII(Object object) {
        return object != null;
    }

    protected void onStop() {
    }

    private static boolean lIIIlIllIl(int n2) {
        return n2 != 0;
    }

    public void aT() {
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(lIIlIIll[lIIlIlII[12]]));
        if (ConstructionHelper.lIIIlIllII(nPC2)) {
            return;
        }
        if (ConstructionHelper.lIIIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            if (ConstructionHelper.lIIIlIllIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();

                if (((69 + 111 - 145 + 118 ^ 64 + 117 - 148 + 138) & (0x3D ^ 0x40 ^ (0xDD ^ 0x92) ^ -1)) > 2) {
                    return;
                }
            } else {
                Dialog.chooseOption((int)lIIlIlII[4]);

            }
            return;
        }
        if (ConstructionHelper.lIIIlIlllI(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        nPC2.interact(lIIlIIll[lIIlIlII[5]]);
    }

    @Provides
    ConstructionHelperConfig g(ConfigManager configManager) {
        return (ConstructionHelperConfig)configManager.getConfig(ConstructionHelperConfig.class);
    }

        return String.valueOf(lllIIIlIIlllllI);
    }

    static {
        ConstructionHelper.lIIIlIlIll();
        ConstructionHelper.lIIIlIlIlI();
    }

    public ConstructionHelper() {
        this.co = List.of(Integer.valueOf(lIIlIlII[0]), Integer.valueOf(lIIlIlII[1]), Integer.valueOf(lIIlIlII[2]), Integer.valueOf(lIIlIlII[3]));
    }

    private static boolean lIIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

