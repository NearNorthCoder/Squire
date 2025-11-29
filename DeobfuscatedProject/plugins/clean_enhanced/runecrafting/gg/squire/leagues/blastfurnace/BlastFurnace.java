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
    private static  int[] lIIII;
    private static  String[] llll;
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

    protected void onStart() {
        this.d = lIIII[0];
    }

    private static String lIlIII(String var1, String var2) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var4 = var2.toCharArray();
        int var5 = lIIII[0];
        char[] var6 = var1.toCharArray();
        int var7 = var6.length;
        int var8 = lIIII[0];
        while (BlastFurnace.lIlllI(var8, var7)) {
            char var9 = var6[var8];
            var3.append((char)(var9 ^ var4[var5 % var4.length]));
            0;
            ++var5;
            ++var8;
            0;
            if (-1 <= ((0x65 ^ 0x62) & ~(0 ^ 7))) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var10;
        BlastFurnace var11;
        int[] nArray = new int[lIIII[1]];
        nArray[BlastFurnace.lIIII[0]] = a.a;
        Item item2 = Inventory.getFirst((int[])nArray);
        Item item3 = Inventory.getFirst(item -> {
            int n;
            if ((item.getId() == item.getId()2) && BlastFurnace.lIllll(item.isNoted() ? 1 : 0)) {
                n = lIIII[1];
                0;
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
                0;
                if (((0xA2 ^ 0x84) & ~(0x5A ^ 0x7C)) != 0) {
                    return ((0x37 ^ 0x7C) & ~(0xC9 ^ 0x82)) != 0;
                }
            } else {
                n = lIIII[0];
            }
            return n != 0;
        });
        Item item5 = Inventory.getFirst(item -> {
            int n;
            if ((item.getId() == item.getId()2) && BlastFurnace.lIllll(item.isNoted() ? 1 : 0)) {
                n = lIIII[1];
                0;
                if (-1 > 2) {
                    return ((0x5B ^ 0x6D) & ~(0x37 ^ 1)) != 0;
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
                    0;
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
        if (BlastFurnace.lIllII(var11.d) && BlastFurnace.lIllIl(Players.getLocal().getWorldLocation().distanceTo(var10.getWorldLocation()), lIIII[2])) {
            Movement.walkTo((WorldPoint)var10.getWorldLocation());
            0;
            return;
        }
        if (BlastFurnace.lIlllI(Vars.getBit((int)lIIII[3]), lIIII[1]) && BlastFurnace.lIlllI(Vars.getBit((int)lIIII[4]), lIIII[1])) {
            void var12;
            void var13;
            void var14;
            void var15;
            if (BlastFurnace.lIlIll(var15) && BlastFurnace.lIlIll(var14) && BlastFurnace.lIllll(var11.d) && (Players.getLocal().getWorldLocation().distanceTo(var10.getWorldLocation()) <= Players.getLocal().getWorldLocation().distanceTo(var10.getWorldLocation())2) && var13 == null) {
                int[] nArray2 = new int[lIIII[1]];
                nArray2[BlastFurnace.lIIII[0]] = lIIII[5];
                if (BlastFurnace.lIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    var15.useOn((Item)var14);
                    return;
                }
            }
            if (BlastFurnace.lIlIll(var12)) {
                int[] nArray3 = new int[lIIII[1]];
                nArray3[BlastFurnace.lIIII[0]] = var12.getId();
                if (BlastFurnace.lIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    void var16;
                    var16.interact(lIIII[0]);
                    return;
                }
            }
        }
        if ((Vars.getBit((int > 0)lIIII[3])) && BlastFurnace.lIllll(Production.isOpen() ? 1 : 0)) {
            var10.interact(lIIII[0]);
            return;
        }
    }

    private static boolean lIlllI(int n, int n2) {
        return n < n2;
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
        void var17;
        String string = chatMessage.getMessage();
        if (BlastFurnace.lIllII(string.contains(llll[lIIII[1]]) ? 1 : 0)) {
            this.d = lIIII[1];
        }
        if (BlastFurnace.lIllII(var17.contains(llll[lIIII[2]]) ? 1 : 0)) {
            var18.d = lIIII[0];
        }
    }

    private static void lIlIlI() {
        lIIII = new int[11];
        BlastFurnace.lIIII[0] = (0xD8 ^ 0x90) & ~(0x6B ^ 0x23);
        BlastFurnace.lIIII[1] = 1;
        BlastFurnace.lIIII[2] = 2;
        BlastFurnace.lIIII[3] = -(0xFFFF9E7D & 0x7DCB) & (0xFFFFBFFB & 0x5FFF);
        BlastFurnace.lIIII[4] = -(0xFFFFF9F3 & 0x5E0D) & (0xFFFFFFBF & 0x5BFB);
        BlastFurnace.lIIII[5] = 0xFFFFF3BF & 0xDFC;
        BlastFurnace.lIIII[6] = 3;
        BlastFurnace.lIIII[7] = 0x30 ^ 0x46 ^ (0x4C ^ 0x3E);
        BlastFurnace.lIIII[8] = -(0xFFFFDDED & 0x66D3) & (0xFFFFEFF7 & 0x5DFD);
        BlastFurnace.lIIII[9] = 0x65 ^ 0x60;
        BlastFurnace.lIIII[10] = 100 + 15 - 68 + 99 ^ 105 + 67 - 101 + 77;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIll(Object object) {
        return object != null;
    }

    private static boolean lIllII(int n) {
        return n != 0;
    }
}

