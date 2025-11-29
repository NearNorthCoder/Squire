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
    private static /* synthetic */ String[] lIIlIIll;
    @Inject
    /* synthetic */ ConfigManager bA;
    private /* synthetic */ List<Integer> co;
    @Inject
    /* synthetic */ ConstructionHelperConfig cn;
    private static /* synthetic */ int[] lIIlIlII;

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

    private static void lIIIlIlIll() {
        lIIlIlII = new int[14];
        ConstructionHelper.lIIlIlII[0] = 0xFFFF83FC & 0x7FC3;
        ConstructionHelper.lIIlIlII[1] = 0xFFFFBEEF & 0x635A;
        ConstructionHelper.lIIlIlII[2] = 0xFFFFF37F & 0x2ECC;
        ConstructionHelper.lIIlIlII[3] = -(0xFFFFFB39 & 0xDC7) & (0xFFFFEB4E & 0x3FFF);
        ConstructionHelper.lIIlIlII[4] = " ".length();
        ConstructionHelper.lIIlIlII[5] = (114 + 31 - -30 + 1 ^ 84 + 40 - 5 + 64) & (150 + 115 - 177 + 88 ^ 168 + 51 - 193 + 157 ^ -" ".length());
        ConstructionHelper.lIIlIlII[6] = "  ".length();
        ConstructionHelper.lIIlIlII[7] = "   ".length();
        ConstructionHelper.lIIlIlII[8] = 0x80 ^ 0xB1 ^ (0x2C ^ 0x19);
        ConstructionHelper.lIIlIlII[9] = -(0xFFFFBEF6 & 0x6D3F) & (0xFFFFBDFF & 0x6FFF);
        ConstructionHelper.lIIlIlII[10] = 15 + 82 - -8 + 26 ^ 79 + 31 - 34 + 58;
        ConstructionHelper.lIIlIlII[11] = 0x58 ^ 0x35 ^ (0xCF ^ 0xA4);
        ConstructionHelper.lIIlIlII[12] = 7 + 124 - -11 + 28 ^ 75 + 52 - 90 + 136;
        ConstructionHelper.lIIlIlII[13] = 0x4D ^ 0x2F ^ (0x27 ^ 0x4D);
    }

    private static boolean lIIIlIlllI(int n2) {
        return n2 == 0;
    }

    private static String lIIIlIlIII(String lllIIIlIIlIlIIl, String lllIIIlIIlIlIlI) {
        try {
            SecretKeySpec lllIIIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIlIIlIllIl = Cipher.getInstance("Blowfish");
            lllIIIlIIlIllIl.init(lIIlIlII[6], lllIIIlIIlIlllI);
            return new String(lllIIIlIIlIllIl.doFinal(Base64.getDecoder().decode(lllIIIlIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlIIlIllII) {
            lllIIIlIIlIllII.printStackTrace();
            return null;
        }
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
                "".length();
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
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[5]] = ConstructionHelper.lIIIlIIlll("Bw01H0YnAw==", "SlYtk");
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[4]] = ConstructionHelper.lIIIlIlIII("RaLmzSD0qAjj1id1BP1hou13DqdVCklY", "qDrKT");
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[6]] = ConstructionHelper.lIIIlIlIIl("dxNcC5833uJOp0tSCl4TeQ==", "pEIGR");
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[7]] = ConstructionHelper.lIIIlIIlll("NjIvFTkB", "dWBzO");
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[8]] = ConstructionHelper.lIIIlIlIIl("ajN28C8iqekxijiSAsw3oQ==", "WFkRr");
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[10]] = ConstructionHelper.lIIIlIlIII("X2hJdEO1OVdCL64kzG6NxA==", "poRjH");
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[11]] = ConstructionHelper.lIIIlIlIIl("DOURL5fxOMI=", "VEZWA");
        ConstructionHelper.lIIlIIll[ConstructionHelper.lIIlIlII[12]] = ConstructionHelper.lIIIlIlIII("tjNlFhrwyyw=", "xUFxa");
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
                "".length();
                if (((69 + 111 - 145 + 118 ^ 64 + 117 - 148 + 138) & (0x3D ^ 0x40 ^ (0xDD ^ 0x92) ^ -" ".length())) > "  ".length()) {
                    return;
                }
            } else {
                Dialog.chooseOption((int)lIIlIlII[4]);
                "".length();
            }
            return;
        }
        if (ConstructionHelper.lIIIlIlllI(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        nPC2.interact(lIIlIIll[lIIlIlII[5]]);
    }

    private static String lIIIlIlIIl(String lllIIIlIIIlllII, String lllIIIlIIIlllIl) {
        try {
            SecretKeySpec lllIIIlIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIIlIlII[13]), "DES");
            Cipher lllIIIlIIlIIIII = Cipher.getInstance("DES");
            lllIIIlIIlIIIII.init(lIIlIlII[6], lllIIIlIIlIIIIl);
            return new String(lllIIIlIIlIIIII.doFinal(Base64.getDecoder().decode(lllIIIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlIIIlllll) {
            lllIIIlIIIlllll.printStackTrace();
            return null;
        }
    }

    @Provides
    ConstructionHelperConfig g(ConfigManager configManager) {
        return (ConstructionHelperConfig)configManager.getConfig(ConstructionHelperConfig.class);
    }

    private static String lIIIlIIlll(String lllIIIlIIlllIll, String lllIIIlIIlllIlI) {
        lllIIIlIIlllIll = new String(Base64.getDecoder().decode(lllIIIlIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIlIIlllllI = new StringBuilder();
        char[] lllIIIlIIllllIl = lllIIIlIIlllIlI.toCharArray();
        int lllIIIlIIllllII = lIIlIlII[5];
        char[] lllIIIlIIllIllI = lllIIIlIIlllIll.toCharArray();
        int lllIIIlIIllIlIl = lllIIIlIIllIllI.length;
        int lllIIIlIIllIlII = lIIlIlII[5];
        while (ConstructionHelper.lIIIllIIIl(lllIIIlIIllIlII, lllIIIlIIllIlIl)) {
            char lllIIIlIlIIIIIl = lllIIIlIIllIllI[lllIIIlIIllIlII];
            lllIIIlIIlllllI.append((char)(lllIIIlIlIIIIIl ^ lllIIIlIIllllIl[lllIIIlIIllllII % lllIIIlIIllllIl.length]));
            "".length();
            ++lllIIIlIIllllII;
            ++lllIIIlIIllIlII;
            "".length();
            if (null == null) continue;
            return null;
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

