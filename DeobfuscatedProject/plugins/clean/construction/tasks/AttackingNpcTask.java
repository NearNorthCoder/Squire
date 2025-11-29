/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Attacking NPC", priority=15, blocking=true)
public class AttackingNpcTask
extends Task {

    private final  SquireQuestHelper fK;

    public boolean run() {
        bi llIIIIlIIlIlIII;
        if (bi.lIIlIIIIllI(Dialog.isOpen() ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        if (bi.lIIlIIIIlll(llIIIIlIIlIlIII.fK.cz().equals(lIIllIlIl[lIlIIlIIl[0]]) ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        NPC llIIIIlIIlIIlll = llIIIIlIIlIlIII.fK.cK();
        if (bi.lIIlIIIlIII(llIIIIlIIlIIlll)) {
            return lIlIIlIIl[0];
        }
        String[] stringArray = new String[lIlIIlIIl[1]];
        stringArray[bi.lIlIIlIIl[0]] = lIIllIlIl[lIlIIlIIl[2]];
        stringArray[bi.lIlIIlIIl[2]] = lIIllIlIl[lIlIIlIIl[3]];
        stringArray[bi.lIlIIlIIl[3]] = lIIllIlIl[lIlIIlIIl[1]];
        if (bi.lIIlIIIIlll(llIIIIlIIlIlIII.fK.a(stringArray) ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        if (bi.lIIlIIIlIII(Players.getLocal().getInteracting())) {
            llIIIIlIIlIIlll.interact(lIIllIlIl[lIlIIlIIl[4]]);
            llIIIIlIIlIlIII.sleep(lIlIIlIIl[3]);
        }
        return lIlIIlIIl[2];
    }

    private static boolean lIIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(llIIIIlIIIllIlI);
    }

    @Inject
    public AttackingNpcTask(SquireQuestHelper squireQuestHelper) {
        this.fK = squireQuestHelper;
    }

    private static boolean lIIlIIIlIII(Object object) {
        return object == null;
    }

    private static void lIIIlIIIIll() {
        lIIllIlIl = new String[lIlIIlIIl[5]];
        bi.lIIllIlIl[bi.lIlIIlIIl[0]] = "NpcStep";
        bi.lIIllIlIl[bi.lIlIIlIIl[2]] = "kill";
        bi.lIIllIlIl[bi.lIlIIlIIl[3]] = "attack";
        bi.lIIllIlIl[bi.lIlIIlIIl[1]] = "defeat";
        bi.lIIllIlIl[bi.lIlIIlIIl[4]] = "Attack";
    }

    private static boolean lIIlIIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIllI(int n2) {
        return n2 != 0;
    }

    static {
        bi.lIIlIIIIlIl();
        bi.lIIIlIIIIll();
    }
}

