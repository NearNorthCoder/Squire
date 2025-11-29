/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.GameEnum32;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Leave Raid", priority=0x7FFFFF99, blocking=true)
public class LeaveRaidTask
extends CoxTaskBase {

    private final  SquireChambersPlugin dw;
    private final  SquireChambersConfig dx;

    private static void llIlllIlIlllII() {
        lIlIlIIllllI = new String[lIlIlIIlllll[6]];
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[0]] = "Leave.";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[1]] = "Leave.";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[2]] = "Cannot find steps?";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[3]] = "Climb";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[4]] = "Steps";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[5]] = "Climb";
    }

    @Inject
    public LeaveRaidTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dw = squireChambersPlugin;
        this.dx = squireChambersConfig;
    }

    @Override
    public boolean run() {
        if (ax.llIlllIlIllllI((Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh(), (Object)w.GET_OUT)) {
            return lIlIlIIlllll[0];
        }
        return this.cg();
    }

    private static boolean llIlllIlIlllll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        if (ax.llIlllIlIlllll(this.dw.G() ? 1 : 0)) {
            return lIlIlIIlllll[0];
        }
        if (ax.llIlllIllIIIII(Dialog.isViewingOptions() ? 1 : 0) && ax.llIlllIllIIIII(Dialog.hasOption((String)lIlIlIIllllI[lIlIlIIlllll[0]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIIlllll[1]];
            stringArray[ax.lIlIlIIlllll[0]] = lIlIlIIllllI[lIlIlIIlllll[1]];
            Dialog.chooseOption((String[])stringArray);

            return lIlIlIIlllll[1];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ax.llIlllIllIIIII(tileObject.getName().equals(lIlIlIIllllI[lIlIlIIlllll[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlllll[1]];
                stringArray[ax.lIlIlIIlllll[0]] = lIlIlIIllllI[lIlIlIIlllll[5]];
                if (ax.llIlllIllIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlllll[1];

                    if ((0xF4 ^ 0x91 ^ (0x57 ^ 0x36)) > 0) return n2 != 0;
                    return ((0x2F ^ 0x22 ^ (0xEF ^ 0xB2)) & (0x43 ^ 0x6F ^ (0x70 ^ 0xC) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIlllll[0];
            return n2 != 0;
        });
        if (ax.llIlllIllIIIIl(var1)) {
            System.out.println(lIlIlIIllllI[lIlIlIIlllll[2]]);
            return lIlIlIIlllll[0];
        }
        var1_1.interact(lIlIlIIllllI[lIlIlIIlllll[3]]);
        return lIlIlIIlllll[1];
    }

    private static boolean llIlllIllIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ax.llIlllIlIlllIl();
        ax.llIlllIlIlllII();
    }

    private static boolean llIlllIlIllllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlllIllIIIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var2);
    }
}

