/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Resetting Sword", priority=2147483397, register=true, blocking=true)
public class ResettingSwordTask
extends Task {
    private final  SquireGiantsFoundry ad;
    private final  a ae;

    private static boolean lIIIIIllIIIIlIl(Object object) {
        return object == null;
    }

    @Inject
    public ResettingSwordTask(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.ad = squireGiantsFoundry;
        this.ae = a2;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIIIllIIIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIllIIIIllI(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIIIIllIIIIIIl() {
        llIlIlIlIIII = new String[llIlIlIlIIIl[6]];
        o.llIlIlIlIIII[o.llIlIlIlIIIl[0]] = "No preform, we have successfully reset.";
        o.llIlIlIlIIII[o.llIlIlIlIIIl[1]] = "Resetting the sword";
        o.llIlIlIlIIII[o.llIlIlIlIIIl[3]] = "Hand-in";
        o.llIlIlIlIIII[o.llIlIlIlIIIl[4]] = "too damaged to keep working";
        o.llIlIlIlIIII[o.llIlIlIlIIIl[5]] = "Something went wrong with the sword, trying to reset.";
    }

    static {
        o.lIIIIIllIIIIIlI();
        o.lIIIIIllIIIIIIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var2;
        if (o.lIIIIIllIIIIIll(this.ad.c() ? 1 : 0)) {
            return llIlIlIlIIIl[0];
        }
        int[] nArray = new int[llIlIlIlIIIl[1]];
        nArray[o.llIlIlIlIIIl[0]] = llIlIlIlIIIl[2];
        if (o.lIIIIIllIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            Log.info((String)llIlIlIlIIII[llIlIlIlIIIl[0]]);
            var2.ad.a(llIlIlIlIIIl[0]);
            return llIlIlIlIIIl[1];
        }
        if (o.lIIIIIllIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
            return llIlIlIlIIIl[0];
        }
        if (o.lIIIIIllIIIIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIlIlIlIIIl[1];
        }
        Log.info((String)llIlIlIlIIII[llIlIlIlIIIl[1]]);
        NPC var3 = var2.ae.p();
        if (o.lIIIIIllIIIIlIl(var3)) {
            return llIlIlIlIIIl[0];
        }
        var1_1.interact(llIlIlIlIIII[llIlIlIlIIIl[3]]);
        return llIlIlIlIIIl[1];
    }

    private static boolean lIIIIIllIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var4;
        if (o.lIIIIIllIIIIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (o.lIIIIIllIIIIlII(var4.getMessage().contains(llIlIlIlIIII[llIlIlIlIIIl[4]]) ? 1 : 0)) {
            o var5;
            Log.info((String)llIlIlIlIIII[llIlIlIlIIIl[5]]);
            var5.ad.a(llIlIlIlIIIl[1]);
        }
    }

    private static boolean lIIIIIllIIIIIll(int n2) {
        return n2 == 0;
    }

}

