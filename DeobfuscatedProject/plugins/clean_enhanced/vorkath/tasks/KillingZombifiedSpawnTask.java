/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Killing zombified spawn", priority=50)
public class KillingZombifiedSpawnTask
extends VorkathManager {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Inject
    protected KillingZombifiedSpawnTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static void var4() {
        var2 = new int[6];
        y.var2[0] = (0x5D ^ 0x47 ^ (5 ^ 0x38)) & (0x1D ^ 0x3E ^ (0x2B ^ 0x2F) ^ -1);
        y.var2[1] = 1;
        y.var2[2] = 0xFFFFDDCA & 0x327F;
        y.var2[3] = 2;
        y.var2[4] = 3;
        y.var2[5] = 0x7C ^ 0x74;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[0];
        while (y.var5(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (((138 + 15 - 133 + 202 ^ 128 + 61 - 163 + 119) & (3 ^ 0x49 ^ (0x2B ^ 0x2E) ^ -1)) < 3) continue;
            return null;
        }
        return String.valueOf(var16);
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    static {
        y.var4();
        y.var29();
    }

    private static boolean var30(Object object) {
        return object == null;
    }

    private static void var29() {
        var1 = new String[var2[4]];
        y.var1[y.var2[0]] = "Wield";
        y.var1[y.var2[1]] = "Wield";
        y.var1[y.var2[3]] = "staff";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        y var31;
        if (y.var12(this.cg.I() ? 1 : 0)) {
            return var2[0];
        }
        NPC var32 = var31.cg.A();
        if ((!y.var33(var32) || y.var3(var32.isDead() ? 1 : 0)) && y.var33(Players.getLocal().getInteracting())) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[y.var2[0]] = var2[2];
        if (y.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[1]];
            nArray2[y.var2[0]] = var2[2];
            Inventory.getFirst((int[])nArray2).interact(var1[var2[0]]);
            0;
            if (-1 >= 1) {
                return ((0xC0 ^ 0x82 ^ (0xDA ^ 0xBF)) & (0x45 ^ 0xC ^ (0xC ^ 0x62) ^ -1)) != 0;
            }
        } else {
            Inventory.interact(item -> item.getName().toLowerCase().contains(var1[var2[3]]), (String)var1[var2[1]]);
            0;
        }
        if (y.var30(var32)) {
            return var2[1];
        }
        Magic.cast((SpeSpellBook.Standard.CRUMBLE_UNDEAD, (NPC)var1_1);
        return var2[1];
    }

    private static boolean var33(Object object) {
        return object != null;
    }
}

