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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    protected void onStart() {
    }

    private static boolean lIllIIIlI(Object object) {
        return object != null;
    }

    static {
        SandWorms.lIllIIIIl();
        SandWorms.lIllIIIII();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void lllIllIllIIIllI;
        void lllIllIllIIlIIl;
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
        NPC lllIllIllIIIlIl = NPCs.getNearest((String[])stringArray2);
        if (SandWorms.lIllIIlII(lllIllIllIIlIIl)) {
            void lllIllIllIIlIII;
            void lllIllIllIIIlll;
            if (SandWorms.lIllIIIlI(lllIllIllIIIlll)) {
                if (SandWorms.lIllIIIlI(lllIllIllIIIlIl)) {
                    lllIllIllIIIlIl.interact(lIlIlll[lIllIII[6]]);
                }
                if (SandWorms.lIllIIlII(lllIllIllIIIlIl)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIllIII[7], lIllIII[8], lIllIII[1]));

                    Time.sleep((long)2L);

                }
            }
            if (SandWorms.lIllIIlII(lllIllIllIIlIII) && SandWorms.lIllIIlII(lllIllIllIIIlll) && SandWorms.lIllIIlIl(Shop.isOpen() ? 1 : 0)) {
                lllIllIllIIIlIl.interact(lIlIlll[lIllIII[9]]);
            }
        }
        if (SandWorms.lIllIIIlI(lllIllIllIIlIIl) && SandWorms.lIllIIIlI(lllIllIllIIIllI) && SandWorms.lIllIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            lllIllIllIIIllI.interact(lIlIlll[lIllIII[10]]);
            Time.sleep((long)1L);

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

        return String.valueOf(lllIllIlIlIlIll);
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

