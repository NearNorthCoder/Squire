/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Baboons", priority=10, blocking=true, register=true)
public class AttackingBaboonsTask
extends AutotoaManager {

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (aM.var3(chatMessage.getMessage().contains(var1[var2[2]]) ? 1 : 0)) {
            this.sleep(var2[3]);
        }
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        aM.var10();
        aM.var11();
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBaboonAttackStyle();
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var2[0];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var2[0];
        while (aM.var15(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (2 >= ((0x79 ^ 0x43) & ~(0x6B ^ 0x51))) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var1_1;
        if (aM.var3(this.cW.redX() ? 1 : 0)) {
            return var2[0];
        }
        NPC var33 = NPCs.getNearest(nPC -> {
            int n2;
            if (aM.var3(nPC.getName().equals(var1[var2[5]]) ? 1 : 0) && aM.var12(nPC.isDead() ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (((139 + 157 - 69 + 28 ^ 77 + 30 - 10 + 78) & (98 + 80 - -35 + 10 ^ 6 + 139 - 61 + 59 ^ -1)) == 1) {
                    return ((0xEC ^ 0xA9 ^ (0xD4 ^ 0x88)) & (0xE5 ^ 0x9B ^ (0x71 ^ 0x16) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (aM.var13(var33)) {
            return var2[0];
        }
        NPC var34 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[4]]));
        if (aM.var14(var34) && aM.var16(var33.distanceTo((Locatable)var34), var2[1])) {
            return var2[0];
        }
        this.bp();
        var1_1.interact(var1[var2[0]]);
        return var2[2];
    }

    @Inject
    protected AttackingBaboonsTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void var10() {
        var2 = new int[7];
        aM.var2[0] = (0x12 ^ 0x28) & ~(0x3C ^ 6);
        aM.var2[1] = 0xBF ^ 0xB7;
        aM.var2[2] = 1;
        aM.var2[3] = 0x60 ^ 0x65;
        aM.var2[4] = 2;
        aM.var2[5] = 3;
        aM.var2[6] = 124 + 98 - 144 + 70 ^ 31 + 3 - 27 + 137;
    }

    private static void var11() {
        var1 = new String[var2[6]];
        aM.var1[aM.var2[0]] = "Attack";
        aM.var1[aM.var2[2]] = "Ba-Ba throws a large boulder at you";
        aM.var1[aM.var2[4]] = "Rubble";
        aM.var1[aM.var2[5]] = "Baboon";
    }
}

