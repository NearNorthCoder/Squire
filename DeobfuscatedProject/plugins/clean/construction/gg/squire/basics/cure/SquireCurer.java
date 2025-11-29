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

        return String.valueOf(lIllllIlIlIllIl);
    }

    private static void lIIlllIIlIl() {
        lIllIIlIl = new String[lIllIIllI[3]];
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[0]] = "Drink";
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[1]] = "antipoison";
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[2]] = "ntidote";
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

