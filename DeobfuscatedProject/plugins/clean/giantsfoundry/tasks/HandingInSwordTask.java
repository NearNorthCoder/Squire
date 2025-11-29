/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handing in sword", priority=10, blocking=true)
public class HandingInSwordTask
extends Task {
    private final  a aa;

    public boolean run() {
        l var1;
        if (l.lIIIIIlllllIlll(this.aa.f() ? 1 : 0)) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIII((Object)var1.aa.k())) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIIl(Dialog.getText().contains(llIlIlllIIIl[llIlIlllIIlI[0]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[llIlIlllIIlI[1]];
            dialogOptionArray[l.llIlIlllIIlI[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[2]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[3]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[l.llIlIlllIIlI[4]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[5]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return llIlIlllIIlI[2];
        }
        Player var2 = Players.getLocal();
        if (l.lIIIIIllllllIII(var2.getInteracting())) {
            return llIlIlllIIlI[0];
        }
        this.aa.a(llIlIlllIIIl[llIlIlllIIlI[2]]);

        this.sleep(llIlIlllIIlI[3]);
        return llIlIlllIIlI[2];
    }

    static {
        l.lIIIIIlllllIllI();
        l.lIIIIIlllllIlIl();
    }

    private static boolean lIIIIIllllllIII(Object object) {
        return object != null;
    }

    private static void lIIIIIlllllIlIl() {
        llIlIlllIIIl = new String[llIlIlllIIlI[3]];
        l.llIlIlllIIIl[l.llIlIlllIIlI[0]] = "Hand over.";
        l.llIlIlllIIIl[l.llIlIlllIIlI[2]] = "Hand-in";
    }

    @Inject
    public HandingInSwordTask(a a2) {
        this.aa = a2;
    }

    private static boolean lIIIIIllllllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlllllIlll(int n2) {
        return n2 == 0;
    }
}

