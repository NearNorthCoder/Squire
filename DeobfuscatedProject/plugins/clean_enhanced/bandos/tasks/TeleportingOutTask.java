/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandos;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Teleporting out", priority=100, blocking=true, register=true)
public class TeleportingOutTask
extends Task {
    private final  SquireBandos K;
    private final  e I;
    
    private final  SquireBandosConfig J;
    private  boolean L;

    private static void var3() {
        var2 = new String[var1[4]];
        l.var2[l.var1[1]] = "Pick-up";
        l.var2[l.var1[0]] = "Bandos altar";
        l.var2[l.var1[5]] = "Teleport";
        l.var2[l.var1[7]] = "Break";
        l.var2[l.var1[8]] = "blowpipe needs to be charged";
        l.var2[l.var1[9]] = "Eat";
        l.var2[l.var1[10]] = "Stamina";
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(Object object, Object object2) {
        return object != object2;
    }

    private void K() {
        l var13;
        if (l.var4(this.J.pickupCannon() ? 1 : 0) && l.var4(this.I.y() ? 1 : 0)) {
            int[] nArray = new int[var1[0]];
            nArray[l.var1[1]] = var1[4];
            TileObject tileObject = TileObjects.getNearest((int[])nArray);
            tileObject.interact(var2[var1[1]]);
            return;
        }
        if (l.var4(var13.J.altarTeleport() ? 1 : 0)) {
            String[] stringArray = new String[var1[0]];
            stringArray[l.var1[1]] = var2[var1[0]];
            TileObject var14 = TileObjects.getNearest((String[])stringArray);
            if (l.var5(var14)) {
                var13.L();
                return;
            }
            var14.interact(var2[var1[5]]);
            0;
            if (((0xF0 ^ 0x95 ^ (0x7D ^ 0x57)) & (21 + 149 - 135 + 213 ^ 150 + 44 - 164 + 153 ^ -1)) <= -1) {
                return;
            }
        } else {
            var13.L();
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[1];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[1];
        while (l.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            
            return null;
        }
        return String.valueOf(var18);
    }

    static {
        l.var26();
        l.var3();
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    private static void var26() {
        var1 = new int[12];
        l.var1[0] = 1;
        l.var1[1] = (0x12 ^ 6 ^ (0xF8 ^ 0xB1)) & (0x41 ^ 0x4A ^ (0xF3 ^ 0xA5) ^ -1);
        l.var1[2] = 89 + 74 - 6 + 21 ^ 108 + 49 - 127 + 112;
        l.var1[3] = 0xC ^ 0x6B ^ (0x6E ^ 0x1E);
        l.var1[4] = 0xC7 ^ 0xA4 ^ (0x72 ^ 0x16);
        l.var1[5] = 2;
        l.var1[6] = 0xFFFFDF7D & 0x3FCF;
        l.var1[7] = 3;
        l.var1[8] = 0xB3 ^ 0xB7;
        l.var1[9] = 1 ^ 4;
        l.var1[10] = 0x1B ^ 0x1D;
        l.var1[11] = 0xB2 ^ 0xBA;
    }

    private void L() {
        int[] nArray = new int[var1[0]];
        nArray[l.var1[1]] = var1[6];
        Item item = Inventory.getFirst((int[])nArray);
        if (l.var5(item)) {
            Magic.cast((SpeSpellBook.Standard.TELEPORT_TO_HOUSE);
            return;
        }
        item.interact(var2[var1[7]]);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var33;
        if (l.var12(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (l.var4(var33.getMessage().contains(var2[var1[8]]) ? 1 : 0)) {
            var34.L = var1[0];
        }
    }

    public boolean run() {
        l var35;
        int n2;
        if (!l.var36(this.L) || l.var36(Inventory.contains(item -> item.getName().startsWith(var2[var1[10]])) ? 1 : 0)) {
            n2 = var1[0];
            0;
            if (1 < 0) {
                return ((0xEB ^ 0xBA) & ~(0x59 ^ 8)) != 0;
            }
        } else {
            this.L = var1[1];
            n2 = this.L;
        }
        if (l.var36(Inventory.contains(item -> item.hasAction(var2[var1[9]]::equals)) ? 1 : 0)) {
            if (l.var4(var35.I.s() ? 1 : 0) && l.var24(Combat.getCurrentHealth(), var1[2])) {
                var35.L = var1[0];
                0;
                if ((0x65 ^ 0x28 ^ (0xD2 ^ 0x9A)) <= 0) {
                    return ((84 + 22 - -2 + 40 ^ 73 + 153 - 187 + 133) & (0x32 ^ 0x2B ^ (0x29 ^ 8) ^ -1)) != 0;
                }
            } else if (l.var36(var35.I.s() ? 1 : 0) && l.var24(Combat.getCurrentHealth(), var1[3])) {
                var35.L = var1[0];
            }
        }
        if (l.var4(var35.L)) {
            if (l.var36(var35.I.t() ? 1 : 0)) {
                var35.K.forceStop();
                0;
                if (1 <= 0) {
                    return ((0x33 ^ 0x11) & ~(0x19 ^ 0x3B)) != 0;
                }
            } else {
                var35.K();
            }
            return var1[0];
        }
        return var1[1];
    }

    private static boolean var36(int n2) {
        return n2 == 0;
    }

    @Inject
    public TeleportingOutTask(e e2, SquireBandosConfig squireBandosConfig, SquireBandos squireBandos) {
        this.I = e2;
        this.J = squireBandosConfig;
        this.K = squireBandos;
    }
}

