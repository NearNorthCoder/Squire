/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Talking to NPC", priority=10, blocking=true)
public class TalkingToNpcTask
extends Task {
    private  int fW;
    private static  int[] llllIllll;
    private static  String[] llllIlllI;
    private final  SquireQuestHelper fV;

    public boolean run() {
        bt var1;
        if ((Dialog.isOpen( != 0) ? 1 : 0) && (this.fV.cu( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var1.fV.cz( == 0).equals(llllIlllI[0]) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = llllIlllI[2];
        stringArray[2] = llllIlllI[3];
        stringArray[3] = llllIlllI[1];
        if ((var1.fV.astringArray)) {
            return 0;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        NPC var2 = var1.fV.cK();
        if var2 == null {
            return var1.fV.cB();
        }
        if ((Reachable.isInteractable((Locatable == 0)var2) ? 1 : 0) && (var1.fW < 4)) {
            var1.fW += 2;
            Movement.walkTo((Locatable)var2);
            0;
            0;
            if (-(0x41 ^ 0x7F ^ (0x2D ^ 0x16)) >= 0) {
                return ((0x93 ^ 0x8D ^ (0xD8 ^ 0x95)) & (70 + 182 - 178 + 176 ^ 158 + 28 - 141 + 124 ^ -1)) != 0;
            }
        } else {
            Item var3;
            List<Integer> var4 = var1.fV.cI();
            if ((var4.isEmpty( == 0) ? 1 : 0) && (var3 = Inventory.getFirst(item -> var4.contains(item.getId( != null))))) {
                var3.useOn((Actor)var2);
                var1.sleep(5);
                return 2;
            }
            var1.fW = 0;
            var2.interact(llllIlllI[5]);
        }
        this.sleep(5);
        return 2;
    }

    @Inject
    public TalkingToNpcTask(SquireQuestHelper squireQuestHelper) {
        this.fV = squireQuestHelper;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }
}

