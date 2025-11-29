/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Quest
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.WintertodtManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Creating Rejuvenation Potions", priority=0x7FFFFFFF, blocking=true)
public class CreatingRejuvenationPotionsTask
extends Task {
    private final  b M;

    private final  SquireWintertodtConfig L;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean C() {
        void var3_3;
        void var9;
        void var10;
        int n2 = Inventory.getCount(item -> item.getName().contains(var1[var2[15]]));
        String[] stringArray = new String[0];
        stringArray[1] = var1[9];
        int n3 = Inventory.getCount((String[])stringArray);
        if ((n2 > 0) && (n3 == 0)) {
            Inventory.dropAll(item -> item.getName().contains(var1[var2[14]]));
            0;
            return 0;
        }
        if (!(intllllllllllllllIllIIllIlllIIllIlI) || ((int == 0)var9)) {
            return 1;
        }
        if ((Quests.isFinished(QuestQuest.DRUIDIC_RITUAL) ? 1 : 0)) {
            Inventory.use(item -> item.getName().contains(var1[var2[13]]), item -> item.getName().equals(var1[var2[12]]));
            0;
            return 0;
        }
        String[] stringArray2 = new String[0];
        stringArray2[1] = var1[2];
        NPC var11 = NPCs.getNearest((String[])stringArray2);
        if var11 == null {
            int[] nArray = new int[0];
            nArray[1] = var2[10];
            var11 = NPCs.getNearest((int[])nArray);
        }
        if ((Dialog.canContinue( != 0) ? 1 : 0)) {
            Dialog.continueSpace();
            return 0;
        }
        Inventory.use(item -> var1[var2[11]].equalsIgnoreCase(item.getName()), (Interactable)var3_3);
        0;
        return 0;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    @Inject
    public CreatingRejuvenationPotionsTask(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.L = squireWintertodtConfig;
        this.M = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var18;
        void var19;
        h var20;
        int n2 = Inventory.getCount(item -> {
            int n2;
            if ((item.getName( != 0).startsWith(var1[var2[17]]) ? 1 : 0) && (item.getName( == 0).contains(var1[var2[18]]) ? 1 : 0)) {
                n2 = 0;
                0;
                if (-(64 + 155 - 160 + 114 ^ 128 + 164 - 266 + 143) >= 0) {
                    return ((3 ^ 0x1B ^ (0x86 ^ 0x99)) & (0xBF ^ 0x89 ^ (0x7A ^ 0x4B) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        int n3 = Inventory.getCount(item -> item.getName().contains(var1[var2[16]]));
        String[] stringArray = new String[0];
        stringArray[1] = var1[1];
        int n4 = Inventory.getCount((String[])stringArray);
        if (!(n2 <= 0) || (n4 == this.L.foodAmount())) {
            return var20.C();
        }
        if ((var20.M.i( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.getFreeSlots() < 2)) {
            int[] nArray = new int[3];
            nArray[1] = 4;
            nArray[0] = 5;
            Inventory.dropAll((int[])nArray);
            0;
        }
        if (((int == 0)var19)) {
            int[] nArray = new int[0];
            nArray[1] = 6;
            TileObjects.getNearest((int[])nArray).interact(var1[0]);
            return 0;
        }
        if (((int)var18 < var20.L.foodAmount())) {
            if ((Players.getLocal().getAnimation() != 7)) {
                return 0;
            }
            String[] stringArray2 = new String[0];
            stringArray2[1] = var1[3];
            TileObjects.getNearest((String[])stringArray2).interact(var1[8]);
            return 0;
        }
        return 1;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = 1;
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = 1;
        while (var29 < var28) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            
            return null;
        }
        return String.valueOf(var24);
    }
}

