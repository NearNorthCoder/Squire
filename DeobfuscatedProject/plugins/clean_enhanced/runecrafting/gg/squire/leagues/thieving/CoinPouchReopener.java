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
    private static  int[] lIlI;
    private static  String[] lIII;

        catch (Exception var5) {
            var5.printStackTrace();
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
        if actor == null {
            void var6;
            NPC nPC2 = NPCs.getNearest(nPC -> {
                String[] stringArray = new String[1];
                stringArray[0] = lIII[5];
                return nPC.hasAction(stringArray);
            });
            if nPC2 == null {
                return;
            }
            var6.interact(lIII[0]);
            return;
        }
        String[] stringArray = new String[1];
        stringArray[0] = lIII[1];
        Item var6 = Inventory.getFirst((String[])stringArray);
        if (var6 != null && (var6.getQuantity() >= var6.getQuantity()2)) {
            void var7;
            var6.interact(lIII[3]);
            var7.interact(lIII[4]);
        }
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        return new Class[0];
    }

    private static String lIllI(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 0;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 0;
        while (var15 < lllllllIlIllIII2) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if ((0x25 ^ 0x37 ^ (0xA2 ^ 0xB4)) != 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void lIlll() {
        lIII = new String[6];
        CoinPouchReopener.lIII[0] = "Pickpocket";
        CoinPouchReopener.lIII[1] = "Coin pouch";
        CoinPouchReopener.lIII[3] = "Open-all";
        CoinPouchReopener.lIII[4] = "Pickpocket";
        CoinPouchReopener.lIII[5] = "Pickpocket";
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}

