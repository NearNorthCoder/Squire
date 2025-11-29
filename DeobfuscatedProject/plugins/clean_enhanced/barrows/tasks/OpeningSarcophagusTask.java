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
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.barrows.tasks.GameEnum2;

@TaskDesc(name="Opening sarcophagus", priority=250, blocking=true)
public class OpeningSarcophagusTask
extends Task {

    private final  SquireBarrows V;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var11() {
        var2 = new int[7];
        o.var2[0] = 1;
        o.var2[1] = 2 & (2 ^ -1);
        o.var2[2] = 2;
        o.var2[3] = 0x48 ^ 0x2F ^ (0x3D ^ 0x5F);
        o.var2[4] = 0x74 ^ 0x72;
        o.var2[5] = 3;
        o.var2[6] = 5 ^ 0x4E ^ (0x2E ^ 0x6D);
    }

    private static boolean var12(Object object) {
        return object != null;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean M() {
        String[] stringArray = new String[var2[0]];
        stringArray[o.var2[1]] = var1[var2[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (o.var19(tileObject)) {
            return var2[1];
        }
        String[] stringArray2 = new String[var2[2]];
        stringArray2[o.var2[1]] = var1[var2[0]];
        stringArray2[o.var2[0]] = var1[var2[2]];
        tileObject.interact(stringArray2);
        return var2[0];
    }

    private static boolean var20(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.var11();
        o.var22();
    }

    private static boolean var23(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    public boolean run() {
        o var24;
        if (o.var25(this.V.h() ? 1 : 0)) {
            return var2[1];
        }
        if (o.var9(Dialog.isOpen() ? 1 : 0)) {
            var24.V.k();
            if (o.var10(var24.V.e(), var2[3])) {
                DialogOption[] dialogOptionArray = new DialogOption[var2[2]];
                dialogOptionArray[o.var2[1]] = DialogOption.PLAIN_CONTINUE;
                dialogOptionArray[o.var2[0]] = DialogOption.CHAT_OPTION_ONE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return var2[0];
            }
            return var2[1];
        }
        if (o.var9(var24.V.i() ? 1 : 0) && o.var21(var24.V.e(), var2[4])) {
            return var2[1];
        }
        if (o.var20((Object)var24.V.r(), (Object)var24.V.s()) && o.var23(var24.V.e(), var2[3])) {
            return var2[1];
        }
        NPC var26 = NPCs.getNearest(d::a);
        if (o.var12(var26) && o.var20(var26.getInteracting(), Players.getLocal())) {
            return var2[1];
        }
        return o.M();
    }

    @Inject
    public OpeningSarcophagusTask(SquireBarrows squireBarrows) {
        this.V = squireBarrows;
    }

    private static void var22() {
        var1 = new String[var2[5]];
        o.var1[o.var2[1]] = "Sarcophagus";
        o.var1[o.var2[0]] = "Search";
        o.var1[o.var2[2]] = "Open";
    }

    private static boolean var25(int n2) {
        return n2 == 0;
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var2[1];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var2[1];
        while (o.var23(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var30);
    }
}

