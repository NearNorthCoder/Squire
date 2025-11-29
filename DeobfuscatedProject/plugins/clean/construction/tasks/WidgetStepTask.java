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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Widget step", priority=10, blocking=true)
public class WidgetStepTask
extends Task {
    
    private final  SquireQuestHelper fY;

        return String.valueOf(lIllllIIIIIIlIl);
    }

    static {
        bv.lIlIIIIIIIl();
        bv.lIlIIIIIIII();
    }

    private static boolean lIlIIIIIIll(Object object) {
        return object != null;
    }

    @Inject
    public WidgetStepTask(SquireQuestHelper squireQuestHelper) {
        this.fY = squireQuestHelper;
    }

    private static boolean lIlIIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIIIIIIII() {
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
        Widget lIllllIIIlIlllI;
        Widget widget = this.C(lIlllIIlI[0]);
        if (bv.lIlIIIIIIlI(Widgets.isVisible((Widget)widget) ? 1 : 0)) {
            return lIlllIIlI[0];
        }
        String[] lIllllIIIlIllIl = lIllllIIIlIlllI.getActions();
        if (!bv.lIlIIIIIIll(lIllllIIIlIllIl) || bv.lIlIIIIIIlI(lIllllIIIlIllIl.length)) {
            int lIllllIIIlIllII = lIllllIIIlIlllI.getParentId();
            if (bv.lIlIIIIIlII(lIllllIIIlIllII, lIlllIIlI[1])) {
                return lIlllIIlI[0];
            }
            lIllllIIIlIlllI = Static.getClient().getWidget(lIllllIIIlIllII);
            if (bv.lIlIIIIIIlI(Widgets.isVisible((Widget)lIllllIIIlIlllI) ? 1 : 0)) {
                return lIlllIIlI[0];
            }
            lIllllIIIlIllIl = lIllllIIIlIlllI.getActions();
            if (!bv.lIlIIIIIIll(lIllllIIIlIllIl) || bv.lIlIIIIIIlI(lIllllIIIlIllIl.length)) {
                return lIlllIIlI[0];
            }
        }
        String lIllllIIIlIllII = lIllllIIIlIllIl[lIlllIIlI[0]];
        String[] lIllllIIIlIlIll = lIllllIIIlIllIl;
        int lIllllIIIlIlIlI = lIllllIIIlIlIll.length;
        int lIllllIIIlIlIIl = lIlllIIlI[0];
        while (bv.lIlIIIIIlIl(lIllllIIIlIlIIl, lIllllIIIlIlIlI)) {
            String lIllllIIIlIlIII = lIllllIIIlIlIll[lIllllIIIlIlIIl];
            if (bv.lIlIIIIIIll(lIllllIIIlIlIII)) {
                lIllllIIIlIllII = lIllllIIIlIlIII;

                if (1 > ((0x84 ^ 0x92) & ~(0xB2 ^ 0xA4))) break;
                return false;
            }
            ++lIllllIIIlIlIIl;

            if (-1 <= 0) continue;
            return false;
        }
        widget.interact((String)var3_4);
        return lIlllIIlI[2];
    }

    /*
     * WARNING - void declaration
     */
    public List<Object> cM() {
        Object object = this.fY.cy();
        if (!bv.lIlIIIIIIll(object) || bv.lIlIIIIIIlI(object.getClass().getSimpleName().equals(lIlllIIIl[lIlllIIlI[3]]) ? 1 : 0)) {
            return List.of();
        }
        try {
            void lIllllIIIIlIIll;
            Field lIllllIIIIlIIlI = lIllllIIIIlIIll.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[4]]);
            lIllllIIIIlIIlI.setAccessible(lIlllIIlI[2]);
            return (List)lIllllIIIIlIIlI.get(lIllllIIIIlIIll);
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
        void lIllllIIIIllllI;
        void lIllllIIIIlllIl;
        List<Object> list = this.cM();
        if (bv.lIlIIIIIllI(list.size(), n2)) {
            return null;
        }
        Object lIllllIIIIlllII = lIllllIIIIlllIl.get((int)lIllllIIIIllllI);
        try {
            Field lIllllIIIIllIll = lIllllIIIIlllII.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[0]]);
            lIllllIIIIllIll.setAccessible(lIlllIIlI[2]);
            Field lIllllIIIIllIlI = lIllllIIIIlllII.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[2]]);
            lIllllIIIIllIlI.setAccessible(lIlllIIlI[2]);
            int lIllllIIIIllIIl = lIllllIIIIllIll.getInt(lIllllIIIIlllII);
            int lIllllIIIIllIII = lIllllIIIIllIlI.getInt(lIllllIIIIlllII);
            return Widgets.get((int)lIllllIIIIllIIl, (int)lIllllIIIIllIII);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }
}

