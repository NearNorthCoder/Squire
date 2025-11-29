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
    private static /* synthetic */ int[] lIlI;
    private static /* synthetic */ String[] lIII;

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

    private static String lIlIl(String lllllllIlIIIIlI, String lllllllIIllllll) {
        try {
            SecretKeySpec lllllllIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllIIllllll.getBytes(StandardCharsets.UTF_8)), lIlI[7]), "DES");
            Cipher lllllllIlIIIlII = Cipher.getInstance("DES");
            lllllllIlIIIlII.init(lIlI[3], lllllllIlIIIlIl);
            return new String(lllllllIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllIlIIIIll) {
            lllllllIlIIIIll.printStackTrace();
            return null;
        }
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

    private static void llIII() {
        lIlI = new int[8];
        CoinPouchReopener.lIlI[0] = (0x39 ^ 0x71) & ~(0xC5 ^ 0x8D);
        CoinPouchReopener.lIlI[1] = 1;
        CoinPouchReopener.lIlI[2] = 1 ^ 0x15;
        CoinPouchReopener.lIlI[3] = 2;
        CoinPouchReopener.lIlI[4] = 3;
        CoinPouchReopener.lIlI[5] = 0x8B ^ 0x8F;
        CoinPouchReopener.lIlI[6] = 0x8D ^ 0x88;
        CoinPouchReopener.lIlI[7] = 170 + 5 - 98 + 106 ^ 77 + 173 - 92 + 33;
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

    private static String lIllI(String lllllllIlIlllll, String lllllllIllIIIll) {
        lllllllIlIlllll = new String(Base64.getDecoder().decode(lllllllIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllIllIIIlI = new StringBuilder();
        char[] lllllllIllIIIIl = lllllllIllIIIll.toCharArray();
        int lllllllIllIIIII = lIlI[0];
        char[] lllllllIlIllIlI = lllllllIlIlllll.toCharArray();
        int lllllllIlIllIIl = lllllllIlIllIlI.length;
        int lllllllIlIllIII = lIlI[0];
        while (CoinPouchReopener.lllII(lllllllIlIllIII, lllllllIlIllIIl)) {
            char lllllllIllIIlIl = lllllllIlIllIlI[lllllllIlIllIII];
            lllllllIllIIIlI.append((char)(lllllllIllIIlIl ^ lllllllIllIIIIl[lllllllIllIIIII % lllllllIllIIIIl.length]));
            0;
            ++lllllllIllIIIII;
            ++lllllllIlIllIII;
            0;
            if ((0x25 ^ 0x37 ^ (0xA2 ^ 0xB4)) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllIllIIIlI);
    }

    private static void lIlll() {
        lIII = new String[lIlI[6]];
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[0]] = CoinPouchReopener."Pickpocket";
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[1]] = CoinPouchReopener."Coin pouch";
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[3]] = CoinPouchReopener."Open-all";
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[4]] = CoinPouchReopener."Pickpocket";
        CoinPouchReopener.lIII[CoinPouchReopener.lIlI[5]] = CoinPouchReopener."Pickpocket";
    }

    private static String lIll(String lllllllIlIIllIl, String lllllllIlIIlllI) {
        try {
            SecretKeySpec lllllllIlIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllIlIlIIIl = Cipher.getInstance("Blowfish");
            lllllllIlIlIIIl.init(lIlI[3], lllllllIlIlIIlI);
            return new String(lllllllIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllIlIlIIII) {
            lllllllIlIlIIII.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}

