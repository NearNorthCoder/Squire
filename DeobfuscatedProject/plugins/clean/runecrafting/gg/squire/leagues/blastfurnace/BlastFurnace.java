/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.leagues.blastfurnace;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.leagues.blastfurnace.AHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Production;

@PluginDescriptor(name="[Leagues] Gold BF", enabledByDefault=false)
public class BlastFurnace
extends SquirePlugin {

     boolean d;

    private static boolean lIllIl(int n, int n2) {
        return n > n2;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIIII[0]];
    }

    private static boolean lIllll(int n) {
        return n == 0;
    }

    private static boolean llIIIl(int n, int n2) {
        return n <= n2;
    }

    protected void onStart() {
        this.d = lIIII[0];
    }

        return String.valueOf(llllllIlIllIIII);
    }

    private static boolean llIlII(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIll(int n) {
        return n > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void llllllIllIllIII;
        BlastFurnace llllllIllIllllI;
        int[] nArray = new int[lIIII[1]];
        nArray[BlastFurnace.lIIII[0]] = a.a;
        Item item2 = Inventory.getFirst((int[])nArray);
        Item item3 = Inventory.getFirst(item -> {
            int n;
            if (BlastFurnace.llIlII(item.getId(), lIIII[5]) && BlastFurnace.lIllll(item.isNoted() ? 1 : 0)) {
                n = lIIII[1];

                if (-1 > 3) {
                    return ((2 ^ 0x5A ^ (0x43 ^ 0x24)) & (0xB0 ^ 0x9E ^ (0x3D ^ 0x2C) ^ -1)) != 0;
                }
            } else {
                n = lIIII[0];
            }
            return n != 0;
        });
        Item item4 = Inventory.getFirst(item -> {
            int n;
            if (BlastFurnace.lIllII(item.getName().contains(llll[lIIII[9]]) ? 1 : 0) && BlastFurnace.lIllII(item.isNoted() ? 1 : 0)) {
                n = lIIII[1];

                if (((0xA2 ^ 0x84) & ~(0x5A ^ 0x7C)) != 0) {
                    return false;
                }
            } else {
                n = lIIII[0];
            }
            return n != 0;
        });
        Item item5 = Inventory.getFirst(item -> {
            int n;
            if (BlastFurnace.llIlII(item.getId(), lIIII[8]) && BlastFurnace.lIllll(item.isNoted() ? 1 : 0)) {
                n = lIIII[1];

                if (-1 > 2) {
                    return false;
                }
            } else {
                n = lIIII[0];
            }
            return n != 0;
        });
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n;
            if (BlastFurnace.lIllII(tileObject.getName().contains(llll[lIIII[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIII[1]];
                stringArray[BlastFurnace.lIIII[0]] = llll[lIIII[7]];
                if (BlastFurnace.lIllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIIII[1];

                    if (-3 < 0) return n != 0;
                    return ((0x52 ^ 0x72 ^ (0xB7 ^ 0x90)) & (0x73 ^ 0x68 ^ (0x33 ^ 0x2F) ^ -1)) != 0;
                }
            }
            n = lIIII[0];
            return n != 0;
        });
        String[] stringArray = new String[lIIII[1]];
        stringArray[BlastFurnace.lIIII[0]] = llll[lIIII[0]];
        TileObject tileObject3 = TileObjects.getNearest((String[])stringArray);
        if (BlastFurnace.lIlIll(item5) && BlastFurnace.lIlIll(item2)) {
            item5.useOn(item2);
            return;
        }
        if (BlastFurnace.lIllII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return;
        }
        if (BlastFurnace.lIllII(llllllIllIllllI.d ? 1 : 0) && BlastFurnace.lIllIl(Players.getLocal().getWorldLocation().distanceTo(llllllIllIllIII.getWorldLocation()), lIIII[2])) {
            Movement.walkTo((WorldPoint)llllllIllIllIII.getWorldLocation());

            return;
        }
        if (BlastFurnace.lIlllI(Vars.getBit((int)lIIII[3]), lIIII[1]) && BlastFurnace.lIlllI(Vars.getBit((int)lIIII[4]), lIIII[1])) {
            void llllllIllIlllII;
            void llllllIllIllIlI;
            void llllllIllIlllIl;
            void llllllIllIllIll;
            if (BlastFurnace.lIlIll(llllllIllIllIll) && BlastFurnace.lIlIll(llllllIllIlllIl) && BlastFurnace.lIllll(llllllIllIllllI.d ? 1 : 0) && BlastFurnace.llIIIl(Players.getLocal().getWorldLocation().distanceTo(llllllIllIllIII.getWorldLocation()), lIIII[2]) && BlastFurnace.llIIlI(llllllIllIllIlI)) {
                int[] nArray2 = new int[lIIII[1]];
                nArray2[BlastFurnace.lIIII[0]] = lIIII[5];
                if (BlastFurnace.lIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    llllllIllIllIll.useOn((Item)llllllIllIlllIl);
                    return;
                }
            }
            if (BlastFurnace.lIlIll(llllllIllIlllII)) {
                int[] nArray3 = new int[lIIII[1]];
                nArray3[BlastFurnace.lIIII[0]] = llllllIllIlllII.getId();
                if (BlastFurnace.lIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    void llllllIllIllIIl;
                    llllllIllIllIIl.interact(lIIII[0]);
                    return;
                }
            }
        }
        if (BlastFurnace.llIIll(Vars.getBit((int)lIIII[3])) && BlastFurnace.lIllll(Production.isOpen() ? 1 : 0)) {
            llllllIllIllIII.interact(lIIII[0]);
            return;
        }
    }

    private static boolean lIlllI(int n, int n2) {
        return n < n2;
    }

    static {
        BlastFurnace.lIlIlI();
        BlastFurnace.lIlIIl();
    }

    private static void lIlIIl() {
        llll = new String[lIIII[10]];
        BlastFurnace.llll[BlastFurnace.lIIII[0]] = "Bar dispenser";
        BlastFurnace.llll[BlastFurnace.lIIII[1]] = "All your ore goes onto the conveyor belt";
        BlastFurnace.llll[BlastFurnace.lIIII[2]] = "gold bars from the dispenser";
        BlastFurnace.llll[BlastFurnace.lIIII[6]] = "Conveyor belt";
        BlastFurnace.llll[BlastFurnace.lIIII[7]] = "Put-ore-on";
        BlastFurnace.llll[BlastFurnace.lIIII[9]] = "Gold ore";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllIllIlIIlI;
        String string = chatMessage.getMessage();
        if (BlastFurnace.lIllII(string.contains(llll[lIIII[1]]) ? 1 : 0)) {
            this.d = lIIII[1];
        }
        if (BlastFurnace.lIllII(llllllIllIlIIlI.contains(llll[lIIII[2]]) ? 1 : 0)) {
            llllllIllIlIlII.d = lIIII[0];
        }
    }

    private static boolean lIlIll(Object object) {
        return object != null;
    }

    private static boolean lIllII(int n) {
        return n != 0;
    }
}

