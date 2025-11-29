/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.lang.reflect.Field;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Widget step", priority=10, blocking=true)
public class WidgetStepTask
extends Task {
    private static  String[] lIlllIIIl;
    private final  SquireQuestHelper fY;
    private static  int[] lIlllIIlI;

    private static void var1() {
        lIlllIIlI = new int[6];
        bv.lIlllIIlI[0] = (96 + 45 - 17 + 38 ^ 105 + 109 - 114 + 44) & (0xCA ^ 0x89 ^ (0x70 ^ 1) ^ -1);
        bv.lIlllIIlI[1] = -1;
        bv.lIlllIIlI[2] = 1;
        bv.lIlllIIlI[3] = 2;
        bv.lIlllIIlI[4] = 3;
        bv.lIlllIIlI[5] = 0x58 ^ 0x5C;
    }

    private static String var2(String var3, String var4) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var6 = var4.toCharArray();
        int var7 = lIlllIIlI[0];
        char[] var8 = var3.toCharArray();
        int var9 = var8.length;
        int var10 = lIlllIIlI[0];
        while (bv.var11(var10, var9)) {
            char var12 = var8[var10];
            var5.append((char)(var12 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var10;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var5);
    }

    static {
        bv.var1();
        bv.var13();
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    @Inject
    public WidgetStepTask(SquireQuestHelper squireQuestHelper) {
        this.fY = squireQuestHelper;
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var16(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static void var13() {
        lIlllIIIl = new String[lIlllIIlI[5]];
        bv.lIlllIIIl[bv.lIlllIIlI[0]] = "groupID";
        bv.lIlllIIIl[bv.lIlllIIlI[2]] = "childID";
        bv.lIlllIIIl[bv.lIlllIIlI[3]] = "WidgetStep";
        bv.lIlllIIIl[bv.lIlllIIlI[4]] = "widgetDetails";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        Widget var24;
        Widget widget = this.C(lIlllIIlI[0]);
        if (bv.var17(Widgets.isVisible((Widget)widget) ? 1 : 0)) {
            return lIlllIIlI[0];
        }
        String[] var25 = var24.getActions();
        if (!bv.var14(var25) || bv.var17(var25.length)) {
            int var26 = var24.getParentId();
            if (bv.var15(var26, lIlllIIlI[1])) {
                return lIlllIIlI[0];
            }
            var24 = Static.getClient().getWidget(var26);
            if (bv.var17(Widgets.isVisible((Widget)var24) ? 1 : 0)) {
                return lIlllIIlI[0];
            }
            var25 = var24.getActions();
            if (!bv.var14(var25) || bv.var17(var25.length)) {
                return lIlllIIlI[0];
            }
        }
        String var26 = var25[lIlllIIlI[0]];
        String[] var27 = var25;
        int var28 = var27.length;
        int var29 = lIlllIIlI[0];
        while (bv.var11(var29, var28)) {
            String var30 = var27[var29];
            if (bv.var14(var30)) {
                var26 = var30;
                0;
                if (1 > ((0x84 ^ 0x92) & ~(0xB2 ^ 0xA4))) break;
                return ((0x76 ^ 0x7C) & ~(0x87 ^ 0x8D)) != 0;
            }
            ++var29;
            0;
            if (-1 <= 0) continue;
            return ((0x4F ^ 0x57) & ~(0x3C ^ 0x24)) != 0;
        }
        widget.interact((String)var3_4);
        return lIlllIIlI[2];
    }

    /*
     * WARNING - void declaration
     */
    public List<Object> cM() {
        Object object = this.fY.cy();
        if (!bv.var14(object) || bv.var17(object.getClass().getSimpleName().equals(lIlllIIIl[lIlllIIlI[3]]) ? 1 : 0)) {
            return List.of();
        }
        try {
            void var31;
            Field var32 = var31.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[4]]);
            var32.setAccessible(lIlllIIlI[2]);
            return (List)var32.get(var31);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return List.of();
        }
    }

    /*
     * WARNING - void declaration
     */
    public Widget C(int n2) {
        void var33;
        void var34;
        List<Object> list = this.cM();
        if (bv.var16(list.size(), n2)) {
            return null;
        }
        Object var35 = var34.get((int)var33);
        try {
            Field var36 = var35.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[0]]);
            var36.setAccessible(lIlllIIlI[2]);
            Field var37 = var35.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[2]]);
            var37.setAccessible(lIlllIIlI[2]);
            int var38 = var36.getInt(var35);
            int var39 = var37.getInt(var35);
            return Widgets.get((int)var38, (int)var39);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }
}

