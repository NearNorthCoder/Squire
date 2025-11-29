/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Attack", priority=10, register=true)
public class AttackTask
extends VorkathManager {
    private static final  int cb;
    
    private static final  String ca;
    
    private static final  int bZ;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    @Override
    public boolean Q() {
        u var6;
        NPC nPC = this.cg.c(var1[0]);
        if (u.var7(nPC)) {
            return var1[1];
        }
        String[] stringArray = new String[var1[0]];
        stringArray[u.var1[1]] = var2[var1[1]];
        NPC var8 = NPCs.getNearest((String[])stringArray);
        if (u.var5(var8) && u.var4(var8.isDead() ? 1 : 0)) {
            int[] nArray = new int[var1[0]];
            nArray[u.var1[1]] = var1[2];
            if (u.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var1[0]];
                nArray2[u.var1[1]] = var1[2];
                Inventory.getFirst((int[])nArray2).interact(var2[var1[0]]);
            }
            Magic.cast((SpeSpellBook.Standard.CRUMBLE_UNDEAD, (NPC)var8);
            return var1[1];
        }
        if (u.var3(var6.cg.I() ? 1 : 0)) {
            return var1[1];
        }
        if (u.var4(Combat.isSpecEnabled() ? 1 : 0)) {
            EquipmentSetup var9 = var6.cg.D();
            Gear.swapTo((int[])var9.getIds());
            0;
        }
        nPC.interact(var2[var1[3]]);
        return var1[1];
    }

    private static void var10() {
        var1 = new int[8];
        u.var1[0] = 1;
        u.var1[1] = (0x7F ^ 0x34) & ~(0x53 ^ 0x18);
        u.var1[2] = -(0xFFFFB7BE & 0x4DE7) & (0xFFFFF7FF & 0x1DEF);
        u.var1[3] = 2;
        u.var1[4] = -(32 + 17 - 43 + 183) & (0xFFFFFFFE & 0x7DBD);
        u.var1[5] = -(9 ^ 0xD) & (0xFFFFBF9B & 0x5F7F);
        u.var1[6] = 3;
        u.var1[7] = 91 + 120 - 137 + 95 ^ 34 + 101 - 9 + 47;
    }

    private static void var11() {
        var2 = new String[var1[7]];
        u.var2[u.var1[1]] = "Zombified Spawn";
        u.var2[u.var1[0]] = "Wield";
        u.var2[u.var1[3]] = "Attack";
        u.var2[u.var1[6]] = "Zombified Spawn";
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[1];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[1];
        while (u.var12(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var16);
    }

    @Inject
    protected AttackTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    static {
        u.var10();
        u.var11();
        bZ = var1[4];
        cb = var1[5];
        ca = var2[var1[6]];
    }

    private static boolean var7(Object object) {
        return object == null;
    }
}

