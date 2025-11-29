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
    private static  int[] lIllI;
    private  int e;
    private static  String[] lIlIl;

    private static void lIIIlIl() {
        lIlIl = new String[lIllI[2]];
        GemCrafter.lIlIl[GemCrafter.lIllI[0]] = "Gem trader";
        GemCrafter.lIlIl[GemCrafter.lIllI[1]] = "Trade";
        GemCrafter.lIlIl[GemCrafter.lIllI[5]] = "Gem trader";
        GemCrafter.lIlIl[GemCrafter.lIllI[7]] = "Trade";
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

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int n = this.e;
        this.e = n - lIllI[1];
        if (GemCrafter.lIIIlll(n)) {
            return;
        }
        if (GemCrafter.lIIlIII(Players.getLocal().isAnimating() ? 1 : 0)) {
            var1.e = lIllI[2];
            return;
        }
        if (GemCrafter.lIIlIII(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIllI[1]];
            nArray[GemCrafter.lIllI[0]] = lIllI[3];
            if (GemCrafter.lIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (GemCrafter.lIIlIII(Production.isOpen() ? 1 : 0)) {
                    Production.choosePreviousOption();
                    var1.e = lIllI[2];
                    return;
                }
                Inventory.use((int)lIllI[4], (int)lIllI[3]);
                0;
                var1.e = lIllI[5];
                return;
            }
            if (GemCrafter.lIIlIIl(Shop.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIllI[1]];
                stringArray[GemCrafter.lIllI[0]] = lIlIl[lIllI[0]];
                NPCs.getNearest((String[])stringArray).interact(lIlIl[lIllI[1]]);
                var1.e = lIllI[2];
                return;
            }
            Shop.sellFifty((int)lIllI[6]);
            return;
        }
        if (GemCrafter.lIIlIIl(Shop.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIllI[1]];
            stringArray[GemCrafter.lIllI[0]] = lIlIl[lIllI[5]];
            NPCs.getNearest((String[])stringArray).interact(lIlIl[lIllI[7]]);
            var1.e = lIllI[2];
            return;
        }
        int var2 = lIllI[0];
        while (GemCrafter.lIIlIlI(var2, lIllI[8])) {
            Shop.buyOne((int)lIllI[3]);
            ++var2;
            0;
            if (((5 ^ 0x2A ^ (0x5E ^ 0x48)) & (0x2F ^ 0x62 ^ (0x36 ^ 0x42) ^ -1)) == 0) continue;
            return;
        }
    }

    private static String lIIIlII(String var3, String var4) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var6 = var4.toCharArray();
        int var7 = lIllI[0];
        char[] var8 = var3.toCharArray();
        int var9 = var8.length;
        int var10 = lIllI[0];
        while (GemCrafter.lIIlIlI(var10, var9)) {
            char var11 = var8[var10];
            var5.append((char)(var11 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var10;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(var5);
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

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}

