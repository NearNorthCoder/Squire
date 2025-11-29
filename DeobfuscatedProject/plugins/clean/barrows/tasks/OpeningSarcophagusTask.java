/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.barrows.tasks.GameEnum20;

@TaskDesc(name="Opening sarcophagus", priority=250, blocking=true)
public class OpeningSarcophagusTask
extends Task {

    private final  SquireBarrows V;

    private static boolean lIllIlIIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIIIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIIIIlIII(Object object) {
        return object != null;
    }

    private static boolean M() {
        String[] stringArray = new String[llllIIlIIlI[0]];
        stringArray[o.llllIIlIIlI[1]] = llllIIlIIIl[llllIIlIIlI[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIlIIIIIIIl(tileObject)) {
            return llllIIlIIlI[1];
        }
        String[] stringArray2 = new String[llllIIlIIlI[2]];
        stringArray2[o.llllIIlIIlI[1]] = llllIIlIIIl[llllIIlIIlI[0]];
        stringArray2[o.llllIIlIIlI[0]] = llllIIlIIIl[llllIIlIIlI[2]];
        tileObject.interact(stringArray2);
        return llllIIlIIlI[0];
    }

    private static boolean lIllIlIIIIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIlIIIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.lIllIlIIIIIIII();
        o.lIllIIllllllll();
    }

    private static boolean lIllIlIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIIIIIIl(Object object) {
        return object == null;
    }

    public boolean run() {
        o var1;
        if (o.lIllIlIIIIIIlI(this.V.h() ? 1 : 0)) {
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
            var1.V.k();
            if (o.lIllIlIIIIIlII(var1.V.e(), llllIIlIIlI[3])) {
                DialogOption[] dialogOptionArray = new DialogOption[llllIIlIIlI[2]];
                dialogOptionArray[o.llllIIlIIlI[1]] = DialogOption.PLAIN_CONTINUE;
                dialogOptionArray[o.llllIIlIIlI[0]] = DialogOption.CHAT_OPTION_ONE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return llllIIlIIlI[0];
            }
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIIll(var1.V.i() ? 1 : 0) && o.lIllIlIIIIIlIl(var1.V.e(), llllIIlIIlI[4])) {
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIllI((Object)var1.V.r(), (Object)var1.V.s()) && o.lIllIlIIIIIlll(var1.V.e(), llllIIlIIlI[3])) {
            return llllIIlIIlI[1];
        }
        NPC var2 = NPCs.getNearest(d::a);
        if (o.lIllIlIIIIlIII(var2) && o.lIllIlIIIIIllI(var2.getInteracting(), Players.getLocal())) {
            return llllIIlIIlI[1];
        }
        return o.M();
    }

    @Inject
    public OpeningSarcophagusTask(SquireBarrows squireBarrows) {
        this.V = squireBarrows;
    }

    private static void lIllIIllllllll() {
        llllIIlIIIl = new String[llllIIlIIlI[5]];
        o.llllIIlIIIl[o.llllIIlIIlI[1]] = "Sarcophagus";
        o.llllIIlIIIl[o.llllIIlIIlI[0]] = "Search";
        o.llllIIlIIIl[o.llllIIlIIlI[2]] = "Open";
    }

    private static boolean lIllIlIIIIIIlI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var3);
    }
}

