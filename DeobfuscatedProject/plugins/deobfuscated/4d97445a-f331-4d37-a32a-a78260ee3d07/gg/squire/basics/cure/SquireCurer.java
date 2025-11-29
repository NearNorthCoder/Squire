/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.basics.cure;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@SquireUtil
@PluginDescriptor(name="Squire Cure", description="Cures Poison", enabledByDefault=false)
public class SquireCurer
extends SquirePlugin {
    private static /* synthetic */ String[] lIllIIlIl;
    private static /* synthetic */ int[] lIllIIllI;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var2_2;
        if (SquireCurer.lIIlllIIlll(Combat.isPoisoned() ? 1 : 0)) {
            return;
        }
        Item lIllllIlIllllII = Inventory.getFirst(item -> {
            int n2;
            if (!SquireCurer.lIIlllIIlll(item.getName().contains(lIllIIlIl[lIllIIllI[1]]) ? 1 : 0) || SquireCurer.lIIlllIlIIl(item.getName().contains(lIllIIlIl[lIllIIllI[2]]) ? 1 : 0)) {
                n2 = lIllIIllI[1];
                0;
                if (-1 >= 0) {
                    return ((0xD ^ 0x24 ^ (0x19 ^ 0x39)) & (0x9A ^ 0xAF ^ (0x50 ^ 0x6C) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIIllI[0];
            }
            return n2 != 0;
        });
        if (SquireCurer.lIIlllIlIII(lIllllIlIllllII)) {
            return;
        }
        var2_2.interact(lIllIIlIl[lIllIIllI[0]]);
    }

    private static String lIIlllIIIlI(String lIllllIlIlIlIlI, String lIllllIlIlIlllI) {
        lIllllIlIlIlIlI = new String(Base64.getDecoder().decode(lIllllIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllllIlIlIllIl = new StringBuilder();
        char[] lIllllIlIlIllII = lIllllIlIlIlllI.toCharArray();
        int lIllllIlIlIlIll = lIllIIllI[0];
        char[] lIllllIlIlIIlIl = lIllllIlIlIlIlI.toCharArray();
        int lIllllIlIlIIlII = lIllllIlIlIIlIl.length;
        int lIllllIlIlIIIll = lIllIIllI[0];
        while (SquireCurer.lIIlllIlIlI(lIllllIlIlIIIll, lIllllIlIlIIlII)) {
            char lIllllIlIllIIII = lIllllIlIlIIlIl[lIllllIlIlIIIll];
            lIllllIlIlIllIl.append((char)(lIllllIlIllIIII ^ lIllllIlIlIllII[lIllllIlIlIlIll % lIllllIlIlIllII.length]));
            0;
            ++lIllllIlIlIlIll;
            ++lIllllIlIlIIIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIllllIlIlIllIl);
    }

    private static String lIIlllIIlII(String lIllllIlIIIlIll, String lIllllIlIIIlIlI) {
        try {
            SecretKeySpec lIllllIlIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIllIIllI[4]), "DES");
            Cipher lIllllIlIIIllll = Cipher.getInstance("DES");
            lIllllIlIIIllll.init(lIllIIllI[2], lIllllIlIIlIIII);
            return new String(lIllllIlIIIllll.doFinal(Base64.getDecoder().decode(lIllllIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIlIIIlllI) {
            lIllllIlIIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIlIl() {
        lIllIIlIl = new String[lIllIIllI[3]];
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[0]] = SquireCurer."Drink";
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[1]] = SquireCurer."antipoison";
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[2]] = SquireCurer."ntidote";
    }

    private static boolean lIIlllIlIII(Object object) {
        return object == null;
    }

    private static boolean lIIlllIIlll(int n2) {
        return n2 == 0;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIIllI[0]];
    }

    private static String lIIlllIIIll(String lIllllIlIIllIlI, String lIllllIlIIlIlll) {
        try {
            SecretKeySpec lIllllIlIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllllIlIIlllII = Cipher.getInstance("Blowfish");
            lIllllIlIIlllII.init(lIllIIllI[2], lIllllIlIIlllIl);
            return new String(lIllllIlIIlllII.doFinal(Base64.getDecoder().decode(lIllllIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIlIIllIll) {
            lIllllIlIIllIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIllI() {
        lIllIIllI = new int[5];
        SquireCurer.lIllIIllI[0] = 3 & (3 ^ -1);
        SquireCurer.lIllIIllI[1] = 1;
        SquireCurer.lIllIIllI[2] = 2;
        SquireCurer.lIllIIllI[3] = 3;
        SquireCurer.lIllIIllI[4] = 0x98 ^ 0x90;
    }

    private static boolean lIIlllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        SquireCurer.lIIlllIIllI();
        SquireCurer.lIIlllIIlIl();
    }

    protected void onStart() {
    }

    private static boolean lIIlllIlIIl(int n2) {
        return n2 != 0;
    }
}

