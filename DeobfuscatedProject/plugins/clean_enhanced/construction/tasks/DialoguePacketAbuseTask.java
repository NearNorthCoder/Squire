/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.rangingguild.SquireRangingGuild;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Dialogue Packet Abuse")
public class DialoguePacketAbuseTask
extends Task {
    private static  int[] lIIlIllI;
    private static  String[] lIIlIlIl;
    private final  SquireRangingGuild fZ;

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    @Inject
    public DialoguePacketAbuseTask(SquireRangingGuild squireRangingGuild) {
        this.fZ = squireRangingGuild;
    }

    public boolean run() {
        if (bw.var1(this.fZ.cq() ? 1 : 0)) {
            return lIIlIllI[0];
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIlIllI[4]];
        dialogOptionArray[bw.lIIlIllI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[bw.lIIlIllI[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[bw.lIIlIllI[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[bw.lIIlIllI[7]] = DialogOption.NPC_CONTINUE;
        this.a(lIIlIllI[1], new WorldPoint(lIIlIllI[2], lIIlIllI[3], lIIlIllI[0]), dialogOptionArray);
        return lIIlIllI[5];
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        bw.var10();
        bw.var11();
    }

    private static void var11() {
        lIIlIlIl = new String[lIIlIllI[5]];
        bw.lIIlIlIl[bw.lIIlIllI[0]] = "Talk-to";
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var12;
        if (bw.var3(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIlIllI[5]];
        nArray[bw.lIIlIllI[0]] = var12;
        NPC var13 = NPCs.getNearest((int[])nArray);
        if (bw.var2(var13) && bw.var3(Reachable.isInteractable((Locatable)var13) ? 1 : 0)) {
            var13.interact(lIIlIlIl[lIIlIllI[0]]);
            0;
            if (-2 >= 0) {
                return;
            }
        } else {
            bw var14;
            void var15;
            System.out.println("Walking to NPC: " + (int)var12 + " at " + (WorldPoint)var15);
            Movement.walkTo((WorldPoint)var15);
            0;
            var14.sleep(lIIlIllI[6]);
        }
    }

    private static void var10() {
        lIIlIllI = new int[8];
        bw.lIIlIllI[0] = (153 + 141 - 221 + 117 ^ 94 + 14 - 47 + 70) & (0x50 ^ 0x68 ^ (0x5F ^ 0x5A) ^ -1);
        bw.lIIlIllI[1] = -(0xFFFFB993 & 0x666E) & (0xFFFFB7F7 & 0x7FBF);
        bw.lIIlIllI[2] = 0xFFFFEB6F & 0x1EFE;
        bw.lIIlIllI[3] = 0xFFFFEF7A & 0x1DDF;
        bw.lIIlIllI[4] = 0x3A ^ 0x3E;
        bw.lIIlIllI[5] = 1;
        bw.lIIlIllI[6] = 2;
        bw.lIIlIllI[7] = 3;
    }
}

