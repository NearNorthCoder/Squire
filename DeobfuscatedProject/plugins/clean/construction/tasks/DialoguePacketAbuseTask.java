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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private final  SquireRangingGuild fZ;

    private static boolean lIIIllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIlll(Object object) {
        return object != null;
    }

    @Inject
    public DialoguePacketAbuseTask(SquireRangingGuild squireRangingGuild) {
        this.fZ = squireRangingGuild;
    }

    public boolean run() {
        if (bw.lIIIllIlIl(this.fZ.cq() ? 1 : 0)) {
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

    private static boolean lIIIllIllI(int n2) {
        return n2 != 0;
    }

    static {
        bw.lIIIllIlII();
        bw.lIIIllIIll();
    }

    private static void lIIIllIIll() {
        lIIlIlIl = new String[lIIlIllI[5]];
        bw.lIIlIlIl[bw.lIIlIllI[0]] = "Talk-to";
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void lllIIIlIIIIIIII;
        if (bw.lIIIllIllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIlIllI[5]];
        nArray[bw.lIIlIllI[0]] = lllIIIlIIIIIIII;
        NPC lllIIIIllllllIl = NPCs.getNearest((int[])nArray);
        if (bw.lIIIllIlll(lllIIIIllllllIl) && bw.lIIIllIllI(Reachable.isInteractable((Locatable)lllIIIIllllllIl) ? 1 : 0)) {
            lllIIIIllllllIl.interact(lIIlIlIl[lIIlIllI[0]]);

        } else {
            bw lllIIIlIIIIIIIl;
            void lllIIIIllllllll;
            System.out.println("Walking to NPC: " + (int)lllIIIlIIIIIIII + " at " + (WorldPoint)lllIIIIllllllll);
            Movement.walkTo((WorldPoint)lllIIIIllllllll);

            lllIIIlIIIIIIIl.sleep(lIIlIllI[6]);
        }
    }

}

