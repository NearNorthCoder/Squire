/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.leagues.thieving;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="[Leagues] Pickpocket nearest", enabledByDefault=false)
@SquireUtil
public class CoinPouchReopener
extends SquirePlugin {

    private static boolean llIlI(Object object) {
        return object != null;
    }

    private static boolean llIll(int n, int n2) {
        return n >= n2;
    }

    static {
        CoinPouchReopener.llIII();
        CoinPouchReopener.lIlll();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Player player = Players.getLocal();
        Actor actor = player.getInteracting();
        if (CoinPouchReopener.llIIl(actor)) {
            void lllllllIllIllll;
            NPC nPC2 = NPCs.getNearest(nPC -> {
                String[] stringArray = new String[lIlI[1]];
                stringArray[CoinPouchReopener.lIlI[0]] = lIII[lIlI[5]];
                return nPC.hasAction(stringArray);
            });
            if (CoinPouchReopener.llIIl(nPC2)) {
                return;
            }
            lllllllIllIllll.interact(lIII[lIlI[0]]);
            return;
        }
        String[] stringArray = new String[lIlI[1]];
        stringArray[CoinPouchReopener.lIlI[0]] = lIII[lIlI[1]];
        Item lllllllIllIllll = Inventory.getFirst((String[])stringArray);
        if (CoinPouchReopener.llIlI(lllllllIllIllll) && CoinPouchReopener.llIll(lllllllIllIllll.getQuantity(), lIlI[2])) {
            void lllllllIlllIIII;
            lllllllIllIllll.interact(lIII[lIlI[3]]);
            lllllllIlllIIII.interact(lIII[lIlI[4]]);
        }
    }

    private static boolean lllII(int n, int n2) {
        return n < n2;
    }

    private static boolean llIIl(Object object) {
        return object == null;
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIlI[0]];
    }

        return String.valueOf(lllllllIllIIIlI);
    }

    private static void lIlll() {
        lIII = new String[lIlI[6]];
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[0]] = "Pickpocket";
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[1]] = "Coin pouch";
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[3]] = "Open-all";
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[4]] = "Pickpocket";
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[5]] = "Pickpocket";
    }

    protected void onStop() {
    }
}

