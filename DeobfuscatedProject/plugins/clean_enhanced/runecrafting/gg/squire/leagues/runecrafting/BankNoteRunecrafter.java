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
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="[Leagues] Runecrafter", enabledByDefault=false)
@SquireUtil
public class BankNoteRunecrafter
extends SquirePlugin {
    private static  String[] lIIll;
    private static  int[] lIlII;

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String llllII(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (BankNoteRunecrafter.lIIIIlI(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((0x45 ^ 0x41) >= 1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    protected Class<?>[] tasks() {
        return new Class[0];
    }

    private static boolean lIIIIlI(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIIII(int n, int n2) {
        return n == n2;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if ((Inventory.contains(item -> item.getName( == 0).contains(lIIll[3])) ? 1 : 0)) {
            return;
        }
        if ((Inventory.isFull( == 0) ? 1 : 0)) {
            Inventory.use(item -> {
                int n;
                if (BankNoteRunecrafter.lIIIIIl(item.getName().contains(lIIll[2]) ? 1 : 0) && BankNoteRunecrafter.lIIIIIl(item.isNoted() ? 1 : 0)) {
                    n = 1;
                    0;
                    if (-1 > 0) {
                        return ((0x62 ^ 0x34 ^ (0x1D ^ 0x40)) & (0xE4 ^ 0xB1 ^ (0x42 ^ 0x1C) ^ -1)) != 0;
                    }
                } else {
                    n = 0;
                }
                return n != 0;
            }, item -> {
                boolean bl;
                if (BankNoteRunecrafter.lIIIIII(item.getId(), a.a)) {
                    bl = 1;
                    0;
                    if (-1 >= 0) {
                        return ((65 + 158 - 36 + 7 ^ 96 + 72 - 98 + 58) & (0xCF ^ 0x86 ^ (0 ^ 0xB) ^ -1)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            });
            0;
        }
        TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[1];
            stringArray[0] = lIIll[1];
            return tileObject.hasAction(stringArray);
        }).interact(lIIll[0]);
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    private static boolean lIIIIIl(int n) {
        return n != 0;
    }
}

