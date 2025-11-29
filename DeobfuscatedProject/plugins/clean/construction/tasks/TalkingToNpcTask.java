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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private final  SquireQuestHelper fV;

    private static boolean llIlIIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIllIII(Object object) {
        return object == null;
    }

    public boolean run() {
        bt lIlIIllIIllIIII;
        if (bt.llIlIIlIllI(Dialog.isOpen() ? 1 : 0) && bt.llIlIIlIlll(this.fV.cu() ? 1 : 0)) {
            return llllIllll[0];
        }
        if (bt.llIlIIlIlll(lIlIIllIIllIIII.fV.cz().equals(llllIlllI[llllIllll[0]]) ? 1 : 0)) {
            return llllIllll[0];
        }
        String[] stringArray = new String[llllIllll[1]];
        stringArray[bt.llllIllll[0]] = llllIlllI[llllIllll[2]];
        stringArray[bt.llllIllll[2]] = llllIlllI[llllIllll[3]];
        stringArray[bt.llllIllll[3]] = llllIlllI[llllIllll[1]];
        if (bt.llIlIIlIllI(lIlIIllIIllIIII.fV.a(stringArray) ? 1 : 0)) {
            return llllIllll[0];
        }
        if (bt.llIlIIlIlll(Movement.shouldWalk() ? 1 : 0)) {
            return llllIllll[0];
        }
        NPC lIlIIllIIlIllll = lIlIIllIIllIIII.fV.cK();
        if (bt.llIlIIllIII(lIlIIllIIlIllll)) {
            return lIlIIllIIllIIII.fV.cB();
        }
        if (bt.llIlIIlIlll(Reachable.isInteractable((Locatable)lIlIIllIIlIllll) ? 1 : 0) && bt.llIlIIllIIl(lIlIIllIIllIIII.fW, llllIllll[4])) {
            lIlIIllIIllIIII.fW += llllIllll[2];
            Movement.walkTo((Locatable)lIlIIllIIlIllll);

            if (-(0x41 ^ 0x7F ^ (0x2D ^ 0x16)) >= 0) {
                return ((0x93 ^ 0x8D ^ (0xD8 ^ 0x95)) & (70 + 182 - 178 + 176 ^ 158 + 28 - 141 + 124 ^ -1)) != 0;
            }
        } else {
            Item lIlIIllIIlIllIl;
            List<Integer> lIlIIllIIlIlllI = lIlIIllIIllIIII.fV.cI();
            if (bt.llIlIIlIlll(lIlIIllIIlIlllI.isEmpty() ? 1 : 0) && bt.llIlIIllIlI(lIlIIllIIlIllIl = Inventory.getFirst(item -> lIlIIllIIlIlllI.contains(item.getId())))) {
                lIlIIllIIlIllIl.useOn((Actor)lIlIIllIIlIllll);
                lIlIIllIIllIIII.sleep(llllIllll[5]);
                return llllIllll[2];
            }
            lIlIIllIIllIIII.fW = llllIllll[0];
            lIlIIllIIlIllll.interact(llllIlllI[llllIllll[5]]);
        }
        this.sleep(llllIllll[5]);
        return llllIllll[2];
    }

    private static void llIlIIlIlII() {
        llllIlllI = new String[llllIllll[4]];
        bt.llllIlllI[bt.llllIllll[0]] = "NpcStep";
        bt.llllIlllI[bt.llllIllll[2]] = "kill";
        bt.llllIlllI[bt.llllIllll[3]] = "attack";
        bt.llllIlllI[bt.llllIllll[1]] = "defeat";
        bt.llllIlllI[bt.llllIllll[5]] = "Talk-to";
    }

    @Inject
    public TalkingToNpcTask(SquireQuestHelper squireQuestHelper) {
        this.fV = squireQuestHelper;
    }

    private static boolean llIlIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIllIlI(Object object) {
        return object != null;
    }

    static {
        bt.llIlIIlIlIl();
        bt.llIlIIlIlII();
    }

        return String.valueOf(lIlIIllIIIlIIll);
    }

}

