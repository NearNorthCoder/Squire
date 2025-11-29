/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.leagues.gemcrafter;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.widgets.Production;

@PluginDescriptor(name="[Leagues] Gem Crafter", enabledByDefault=false)
@SquireUtil
public class GemCrafter
extends SquirePlugin {
    private static /* synthetic */ int[] lIllI;
    private /* synthetic */ int e;
    private static /* synthetic */ String[] lIlIl;

    private static void lIIIlIl() {
        lIlIl = new String[lIllI[2]];
        GemCrafter.lIlIl[GemCrafter.lIllI[0]] = GemCrafter."Gem trader";
        GemCrafter.lIlIl[GemCrafter.lIllI[1]] = GemCrafter."Trade";
        GemCrafter.lIlIl[GemCrafter.lIllI[5]] = GemCrafter."Gem trader";
        GemCrafter.lIlIl[GemCrafter.lIllI[7]] = GemCrafter."Trade";
    }

    private static boolean lIIlIII(int n) {
        return n != 0;
    }

    private static boolean lIIIlll(int n) {
        return n > 0;
    }

    private static boolean lIIlIlI(int n, int n2) {
        return n < n2;
    }

    protected void onStart() {
    }

    static {
        GemCrafter.lIIIllI();
        GemCrafter.lIIIlIl();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int n = this.e;
        this.e = n - lIllI[1];
        if (GemCrafter.lIIIlll(n)) {
            return;
        }
        if (GemCrafter.lIIlIII(Players.getLocal().isAnimating() ? 1 : 0)) {
            llllllIIIIlIIII.e = lIllI[2];
            return;
        }
        if (GemCrafter.lIIlIII(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIllI[1]];
            nArray[GemCrafter.lIllI[0]] = lIllI[3];
            if (GemCrafter.lIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (GemCrafter.lIIlIII(Production.isOpen() ? 1 : 0)) {
                    Production.choosePreviousOption();
                    llllllIIIIlIIII.e = lIllI[2];
                    return;
                }
                Inventory.use((int)lIllI[4], (int)lIllI[3]);
                0;
                llllllIIIIlIIII.e = lIllI[5];
                return;
            }
            if (GemCrafter.lIIlIIl(Shop.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIllI[1]];
                stringArray[GemCrafter.lIllI[0]] = lIlIl[lIllI[0]];
                NPCs.getNearest((String[])stringArray).interact(lIlIl[lIllI[1]]);
                llllllIIIIlIIII.e = lIllI[2];
                return;
            }
            Shop.sellFifty((int)lIllI[6]);
            return;
        }
        if (GemCrafter.lIIlIIl(Shop.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIllI[1]];
            stringArray[GemCrafter.lIllI[0]] = lIlIl[lIllI[5]];
            NPCs.getNearest((String[])stringArray).interact(lIlIl[lIllI[7]]);
            llllllIIIIlIIII.e = lIllI[2];
            return;
        }
        int llllllIIIIIllll = lIllI[0];
        while (GemCrafter.lIIlIlI(llllllIIIIIllll, lIllI[8])) {
            Shop.buyOne((int)lIllI[3]);
            ++llllllIIIIIllll;
            0;
            if (((5 ^ 0x2A ^ (0x5E ^ 0x48)) & (0x2F ^ 0x62 ^ (0x36 ^ 0x42) ^ -1)) == 0) continue;
            return;
        }
    }

    private static String lIIIlII(String llllllIIIIIIlII, String lllllIllllllllI) {
        llllllIIIIIIlII = new String(Base64.getDecoder().decode(llllllIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIIIIIIlI = new StringBuilder();
        char[] llllllIIIIIIIIl = lllllIllllllllI.toCharArray();
        int llllllIIIIIIIII = lIllI[0];
        char[] lllllIllllllIlI = llllllIIIIIIlII.toCharArray();
        int lllllIllllllIIl = lllllIllllllIlI.length;
        int lllllIllllllIII = lIllI[0];
        while (GemCrafter.lIIlIlI(lllllIllllllIII, lllllIllllllIIl)) {
            char llllllIIIIIIlIl = lllllIllllllIlI[lllllIllllllIII];
            llllllIIIIIIIlI.append((char)(llllllIIIIIIlIl ^ llllllIIIIIIIIl[llllllIIIIIIIII % llllllIIIIIIIIl.length]));
            0;
            ++llllllIIIIIIIII;
            ++lllllIllllllIII;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(llllllIIIIIIIlI);
    }

    private static boolean lIIlIIl(int n) {
        return n == 0;
    }

    protected Class<?>[] tasks() {
        return new Class[lIllI[0]];
    }

    private static void lIIIllI() {
        lIllI = new int[9];
        GemCrafter.lIllI[0] = (0x75 ^ 0x19 ^ (0xF5 ^ 0xC5)) & (0x20 ^ 0x10 ^ (0xEB ^ 0x87) ^ -1);
        GemCrafter.lIllI[1] = 1;
        GemCrafter.lIllI[2] = 0x1A ^ 0x58 ^ (0xD4 ^ 0x92);
        GemCrafter.lIllI[3] = -(0xFFFFEDBF & 0x7BE3) & (0xFFFFFFF7 & 0x6FFF);
        GemCrafter.lIllI[4] = 0xFFFFDEDF & 0x27FB;
        GemCrafter.lIllI[5] = 2;
        GemCrafter.lIllI[6] = -(0xFFFFD11F & 0x3EF3) & (0xFFFFDED7 & 0x377F);
        GemCrafter.lIllI[7] = 3;
        GemCrafter.lIllI[8] = 117 + 101 - 145 + 61 ^ 92 + 3 - -26 + 21;
    }

    private static String lIIIIll(String lllllIllllIllll, String lllllIllllIlllI) {
        try {
            SecretKeySpec lllllIlllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIllllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlllllIIIl = Cipher.getInstance("Blowfish");
            lllllIlllllIIIl.init(lIllI[5], lllllIlllllIIlI);
            return new String(lllllIlllllIIIl.doFinal(Base64.getDecoder().decode(lllllIllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlllllIIII) {
            lllllIlllllIIII.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}

