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
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Attacking NPC", priority=15, blocking=true)
public class AttackingNpcTask
extends Task {
    private static  int[] lIlIIlIIl;
    private static  String[] lIIllIlIl;
    private final  SquireQuestHelper fK;

    public boolean run() {
        bi var1;
        if (bi.var2(Dialog.isOpen() ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        if (bi.var3(var1.fK.cz().equals(lIIllIlIl[lIlIIlIIl[0]]) ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        NPC var4 = var1.fK.cK();
        if (bi.var5(var4)) {
            return lIlIIlIIl[0];
        }
        String[] stringArray = new String[lIlIIlIIl[1]];
        stringArray[bi.lIlIIlIIl[0]] = lIIllIlIl[lIlIIlIIl[2]];
        stringArray[bi.lIlIIlIIl[2]] = lIIllIlIl[lIlIIlIIl[3]];
        stringArray[bi.lIlIIlIIl[3]] = lIIllIlIl[lIlIIlIIl[1]];
        if (bi.var3(var1.fK.a(stringArray) ? 1 : 0)) {
            return lIlIIlIIl[0];
        }
        if (bi.var5(Players.getLocal().getInteracting())) {
            var4.interact(lIIllIlIl[lIlIIlIIl[4]]);
            var1.sleep(lIlIIlIIl[3]);
        }
        return lIlIIlIIl[2];
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = lIlIIlIIl[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = lIlIIlIIl[0];
        while (bi.var6(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (((180 + 137 - 114 + 18 ^ 63 + 78 - 101 + 100) & (0xC9 ^ 0x80 ^ (0xE ^ 0x16) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    @Inject
    public AttackingNpcTask(SquireQuestHelper squireQuestHelper) {
        this.fK = squireQuestHelper;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static void var29() {
        lIIllIlIl = new String[lIlIIlIIl[5]];
        bi.lIIllIlIl[bi.lIlIIlIIl[0]] = "NpcStep";
        bi.lIIllIlIl[bi.lIlIIlIIl[2]] = "kill";
        bi.lIIllIlIl[bi.lIlIIlIIl[3]] = "attack";
        bi.lIIllIlIl[bi.lIlIIlIIl[1]] = "defeat";
        bi.lIIllIlIl[bi.lIlIIlIIl[4]] = "Attack";
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var30() {
        lIlIIlIIl = new int[7];
        bi.lIlIIlIIl[0] = (35 + 50 - 78 + 248 ^ 20 + 113 - 89 + 127) & (0x42 ^ 0x2D ^ (0x94 ^ 0xAF) ^ -1);
        bi.lIlIIlIIl[1] = 3;
        bi.lIlIIlIIl[2] = 1;
        bi.lIlIIlIIl[3] = 2;
        bi.lIlIIlIIl[4] = 0x9F ^ 0x9B;
        bi.lIlIIlIIl[5] = 0x86 ^ 0xC1 ^ (0x4B ^ 9);
        bi.lIlIIlIIl[6] = 0x63 ^ 0xE ^ (0xFB ^ 0x9E);
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    static {
        bi.var30();
        bi.var29();
    }
}

