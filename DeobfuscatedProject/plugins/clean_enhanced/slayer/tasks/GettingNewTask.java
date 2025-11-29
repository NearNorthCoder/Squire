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
        k.var3();
        k.var4();
    }

    public boolean run() {
        k var5;
        if (k.var6(this.F.a(this.F.g()) ? 1 : 0)) {
            this.F.forceStop();
        }
        if (k.var6(var5.F.h() ? 1 : 0)) {
            return var2[0];
        }
        if (k.var6(Dialog.isOpen() ? 1 : 0) && (!k.var7(Dialog.getText().contains(var1[var2[0]]) ? 1 : 0) || k.var6(Dialog.getText().contains(var1[var2[1]]) ? 1 : 0))) {
            var5.F.a(var2[0]);
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return var2[1];
        }
        if (k.var6(Dialog.isOpen() ? 1 : 0) && k.var6(Dialog.getText().contains(var1[var2[2]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[var2[3]];
            dialogOptionArray[k.var2[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.var2[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.var2[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.var2[4]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[k.var2[5]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[k.var2[6]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return var2[1];
        }
        b var8 = var5.F.b();
        if (k.var9((Object)var8) && k.var7(var5.F.c() ? 1 : 0)) {
            return var2[0];
        }
        var5.F.a(var5.F.g());
        0;
        NPC var10 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[var2[1]];
            stringArray[k.var2[0]] = var1[var2[5]];
            return nPC.hasAction(stringArray);
        });
        if (k.var9(var10)) {
            var10.interact(var1[var2[4]]);
            return var2[1];
        }
        return var2[0];
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Inject
    public GettingNewTask(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.F = squireSkipperPlugin;
        this.G = squireSkipperConfig;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var2[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var2[0];
        while (k.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if ((0x4C ^ 0x48) > ((0x71 ^ 0x7F) & ~(0xCF ^ 0xC1))) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new String[var2[6]];
        k.var1[k.var2[0]] = "task";
        k.var1[k.var2[1]] = "Come back";
        k.var1[k.var2[2]] = "still hunting";
        k.var1[k.var2[4]] = "Assignment";
        k.var1[k.var2[5]] = "Assignment";
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var2 = new int[8];
        k.var2[0] = (0x9C ^ 0x81) & ~(0xDF ^ 0xC2);
        k.var2[1] = 1;
        k.var2[2] = 2;
        k.var2[3] = 112 + 12 - -1 + 52 ^ 127 + 102 - 65 + 19;
        k.var2[4] = 3;
        k.var2[5] = 0x3E ^ 0x3A;
        k.var2[6] = 0xB5 ^ 0xAA ^ (0x99 ^ 0x83);
        k.var2[7] = 0x58 ^ 0x50;
    }

    private static boolean var9(Object object) {
        return object != null;
    }
}

