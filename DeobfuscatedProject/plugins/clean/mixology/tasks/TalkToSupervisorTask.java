/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.mixology.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="talk to supervisor")
public class TalkToSupervisorTask
extends Task {

    static {
        p.lIIlIlIlIIlIlll();
        p.lIIlIlIlIIlIllI();
    }

    public boolean run() {
        if (p.lIIlIlIlIIllIII(Vars.getBit((int)lllllllIlIII[0]), lllllllIlIII[1])) {
            return lllllllIlIII[2];
        }
        if (p.lIIlIlIlIIllIIl(s.e() ? 1 : 0)) {
            return lllllllIlIII[2];
        }
        if (p.lIIlIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lllllllIlIII[1]];
            stringArray[p.lllllllIlIII[2]] = lllllllIIlll[lllllllIlIII[2]];
            NPCs.getNearest((String[])stringArray).interact(lllllllIIlll[lllllllIlIII[1]]);
            return lllllllIlIII[2];
        }
        if (p.lIIlIlIlIIllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        return lllllllIlIII[2];
    }

    private static boolean lIIlIlIlIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIlIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIlIIllIlI(int n2) {
        return n2 != 0;
    }

    private static void lIIlIlIlIIlIllI() {
        lllllllIIlll = new String[lllllllIlIII[3]];
        p.lllllllIIlll[p.lllllllIlIII[2]] = "Supervisor Lalo";
        p.lllllllIIlll[p.lllllllIlIII[1]] = "Talk-to";
    }
}

