/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.basics.favor;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;

@SquireUtil
@PluginDescriptor(name="Squire Sandworm Digger", description="Collects sandworms", enabledByDefault=false)
public class SandWorms
extends SquirePlugin {
    private static  int[] lIllIII;
    private static  String[] lIlIlll;

    protected void onStart() {
    }

    private static boolean lIllIIIlI(Object object) {
        return object != null;
    }

    private static void lIllIIIIl() {
        lIllIII = new int[13];
        SandWorms.lIllIII[0] = 1;
        SandWorms.lIllIII[1] = (0xE6 ^ 0xAF) & ~(0xF7 ^ 0xBE);
        SandWorms.lIllIII[2] = -(0xFFFFBB9D & 0x747B) & (0xFFFFFFDF & 0x37BD);
        SandWorms.lIllIII[3] = -(0xFFFFBB5F & 0x5CA9) & (0xFFFF9EFF & Short.MAX_VALUE);
        SandWorms.lIllIII[4] = -(0xFFFFBB9F & 0x4FE9) & (0xFFFFFFFE & 0x3FFF);
        SandWorms.lIllIII[5] = 2;
        SandWorms.lIllIII[6] = 3;
        SandWorms.lIllIII[7] = 0xFFFFD76F & 0x2FBF;
        SandWorms.lIllIII[8] = -(0xFFFFE5BF & 0x7B75) & (0xFFFFFFFF & 0x6FFD);
        SandWorms.lIllIII[9] = 0x19 ^ 0x71 ^ (0xAE ^ 0xC2);
        SandWorms.lIllIII[10] = 35 + 2 - 7 + 139 ^ 112 + 106 - 173 + 127;
        SandWorms.lIllIII[11] = 97 + 95 - 170 + 161 ^ 84 + 171 - 160 + 82;
        SandWorms.lIllIII[12] = 0xBE ^ 0xC3 ^ (0x2B ^ 0x5E);
    }

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
        void var6;
        void var7;
        int[] nArray = new int[lIllIII[0]];
        nArray[SandWorms.lIllIII[1]] = lIllIII[2];
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lIllIII[0]];
        nArray2[SandWorms.lIllIII[1]] = lIllIII[3];
        Item item2 = Inventory.getFirst((int[])nArray2);
        int[] nArray3 = new int[lIllIII[0]];
        nArray3[SandWorms.lIllIII[1]] = lIllIII[4];
        Item item3 = Inventory.getFirst((int[])nArray3);
        String[] stringArray = new String[lIllIII[0]];
        stringArray[SandWorms.lIllIII[1]] = lIlIlll[lIllIII[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (SandWorms.lIllIIIlI(item2)) {
            item2.interact(lIlIlll[lIllIII[0]]);
        }
        if (SandWorms.lIllIIIll(Shop.isOpen() ? 1 : 0)) {
            Shop.buyFifty((int)lIllIII[2]);
        }
        String[] stringArray2 = new String[lIllIII[0]];
        stringArray2[SandWorms.lIllIII[1]] = lIlIlll[lIllIII[5]];
        NPC var8 = NPCs.getNearest((String[])stringArray2);
        if (SandWorms.lIllIIlII(var7)) {
            void var9;
            void var10;
            if (SandWorms.lIllIIIlI(var10)) {
                if (SandWorms.lIllIIIlI(var8)) {
                    var8.interact(lIlIlll[lIllIII[6]]);
                }
                if (SandWorms.lIllIIlII(var8)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIllIII[7], lIllIII[8], lIllIII[1]));
                    0;
                    Time.sleep((long)2L);
                    0;
                }
            }
            if (SandWorms.lIllIIlII(var9) && SandWorms.lIllIIlII(var10) && SandWorms.lIllIIlIl(Shop.isOpen() ? 1 : 0)) {
                var8.interact(lIlIlll[lIllIII[9]]);
            }
        }
        if (SandWorms.lIllIIIlI(var7) && SandWorms.lIllIIIlI(var6) && SandWorms.lIllIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            var6.interact(lIlIlll[lIllIII[10]]);
            Time.sleep((long)1L);
            0;
        }
    }

    private static boolean lIllIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIl(int n2) {
        return n2 == 0;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIII[1]];
    }

    private static boolean lIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllllI(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = lIllIII[1];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = lIllIII[1];
        while (SandWorms.lIllIIllI(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((0x64 ^ 0x61) > 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIII() {
        lIlIlll = new String[lIllIII[11]];
        SandWorms.lIlIlll[SandWorms.lIllIII[1]] = "Sandworm castings";
        SandWorms.lIlIlll[SandWorms.lIllIII[0]] = "Empty";
        SandWorms.lIlIlll[SandWorms.lIllIII[5]] = "Tynan";
        SandWorms.lIlIlll[SandWorms.lIllIII[6]] = "Talk-to";
        SandWorms.lIlIlll[SandWorms.lIllIII[9]] = "Trade";
        SandWorms.lIlIlll[SandWorms.lIllIII[10]] = "Dig";
    }
}

