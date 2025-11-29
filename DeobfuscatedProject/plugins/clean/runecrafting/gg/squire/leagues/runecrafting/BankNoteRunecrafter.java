/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.leagues.runecrafting;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.leagues.runecrafting.AHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="[Leagues] Runecrafter", enabledByDefault=false)
@SquireUtil
public class BankNoteRunecrafter
extends SquirePlugin {

    private static void llllIl() {
        lIIll = new String[lIlII[4]];
        BankNoteRunecrafter.lIIll[BankNoteRunecrafter.lIlII[0]] = "Craft-rune";
        BankNoteRunecrafter.lIIll[BankNoteRunecrafter.lIlII[1]] = "Craft-rune";
        BankNoteRunecrafter.lIIll[BankNoteRunecrafter.lIlII[2]] = "essence";
        BankNoteRunecrafter.lIIll[BankNoteRunecrafter.lIlII[3]] = "essence";
    }

        return String.valueOf(llllllIIIllIlll);
    }

    protected Class<?>[] tasks() {
        return new Class[lIlII[0]];
    }

    private static boolean lIIIIlI(int n, int n2) {
        return n < n2;
    }

    private static boolean llllll(int n) {
        return n == 0;
    }

    private static boolean lIIIIII(int n, int n2) {
        return n == n2;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (BankNoteRunecrafter.llllll(Inventory.contains(item -> item.getName().contains(lIIll[lIlII[3]])) ? 1 : 0)) {
            return;
        }
        if (BankNoteRunecrafter.llllll(Inventory.isFull() ? 1 : 0)) {
            Inventory.use(item -> {
                int n;
                if (BankNoteRunecrafter.lIIIIIl(item.getName().contains(lIIll[lIlII[2]]) ? 1 : 0) && BankNoteRunecrafter.lIIIIIl(item.isNoted() ? 1 : 0)) {
                    n = lIlII[1];

                } else {
                    n = lIlII[0];
                }
                return n != 0;
            }, item -> {
                boolean bl;
                if (BankNoteRunecrafter.lIIIIII(item.getId(), a.a)) {
                    bl = lIlII[1];

                } else {
                    bl = lIlII[0];
                }
                return bl;
            });

        }
        TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIlII[1]];
            stringArray[BankNoteRunecrafter.lIlII[0]] = lIIll[lIlII[1]];
            return tileObject.hasAction(stringArray);
        }).interact(lIIll[lIlII[0]]);
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    static {
        BankNoteRunecrafter.lllllI();
        BankNoteRunecrafter.llllIl();
    }

    private static boolean lIIIIIl(int n) {
        return n != 0;
    }
}

