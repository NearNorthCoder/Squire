/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Getting New Task")
public class GettingNewTask
extends Task {
    private final  SquireSkipperPlugin F;

    private final  SquireSkipperConfig G;

    static {
        k.lIlllIlIIllIIlI();
        k.lIlllIlIIlIllIl();
    }

    public boolean run() {
        k var1;
        if (k.lIlllIlIIllIllI(this.F.a(this.F.g()) ? 1 : 0)) {
            this.F.forceStop();
        }
        if (k.lIlllIlIIllIllI(var1.F.h() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        if (k.lIlllIlIIllIllI(Dialog.isOpen() ? 1 : 0) && (!k.lIlllIlIIllIlll(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[0]]) ? 1 : 0) || k.lIlllIlIIllIllI(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[1]]) ? 1 : 0))) {
            var1.F.a(lIlIIlIIlIIll[0]);
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return lIlIIlIIlIIll[1];
        }
        if (k.lIlllIlIIllIllI(Dialog.isOpen() ? 1 : 0) && k.lIlllIlIIllIllI(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[2]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lIlIIlIIlIIll[3]];
            dialogOptionArray[k.lIlIIlIIlIIll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.lIlIIlIIlIIll[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.lIlIIlIIlIIll[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.lIlIIlIIlIIll[4]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[k.lIlIIlIIlIIll[5]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[k.lIlIIlIIlIIll[6]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return lIlIIlIIlIIll[1];
        }
        b var2 = var1.F.b();
        if (k.lIlllIlIIlllIIl((Object)var2) && k.lIlllIlIIllIlll(var1.F.c() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        var1.F.a(var1.F.g());

        NPC var3 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[lIlIIlIIlIIll[1]];
            stringArray[k.lIlIIlIIlIIll[0]] = lIlIIlIIlIIII[lIlIIlIIlIIll[5]];
            return nPC.hasAction(stringArray);
        });
        if (k.lIlllIlIIlllIIl(var3)) {
            var3.interact(lIlIIlIIlIIII[lIlIIlIIlIIll[4]]);
            return lIlIIlIIlIIll[1];
        }
        return lIlIIlIIlIIll[0];
    }

    @Inject
    public GettingNewTask(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.F = squireSkipperPlugin;
        this.G = squireSkipperConfig;
    }

        return String.valueOf(var4);
    }

    private static boolean lIlllIlIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllIlIIlIllIl() {
        lIlIIlIIlIIII = new String[lIlIIlIIlIIll[6]];
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[0]] = "task";
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[1]] = "Come back";
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[2]] = "still hunting";
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[4]] = "Assignment";
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[5]] = "Assignment";
    }

    private static boolean lIlllIlIIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIIllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIlIIlllIIl(Object object) {
        return object != null;
    }
}

