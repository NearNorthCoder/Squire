/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Making party", priority=2147483547, blocking=true)
public class MakingPartyTask
extends CoxTaskBase {
    
    private final  SquireChambersPlugin dy;
    private final  SquireChambersConfig dz;

    private static boolean llIlIIlIllIllI(int n2) {
        return n2 != 0;
    }

    private static void llIlIIlIllIlII() {
        lIIlllllIllI = new String[lIIllllllIll[8]];
        ay.lIIlllllIllI[ay.lIIllllllIll[0]] = "Make party";
        ay.lIIlllllIllI[ay.lIIllllllIll[2]] = "Read";
        ay.lIIlllllIllI[ay.lIIllllllIll[3]] = "Recruiting board";
        ay.lIIlllllIllI[ay.lIIllllllIll[4]] = "Read";
        ay.lIIlllllIllI[ay.lIIllllllIll[5]] = "Recruiting board";
        ay.lIIlllllIllI[ay.lIIllllllIll[6]] = "Read";
        ay.lIIlllllIllI[ay.lIIllllllIll[7]] = "Make party";
    }

    private static boolean llIlIIlIllIlll(Object object) {
        return object != null;
    }

    private static boolean llIlIIlIlllIII(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    static {
        ay.llIlIIlIllIlIl();
        ay.llIlIIlIllIlII();
    }

    private static boolean llIlIIlIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public MakingPartyTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dy = squireChambersPlugin;
        this.dz = squireChambersConfig;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        ay var2;
        if (ay.llIlIIlIllIllI(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bn() ? 1 : 0)) {
            return lIIllllllIll[0];
        }
        Widget var3 = Widgets.get((int)lIIllllllIll[1], widget -> {
            String[] stringArray = new String[lIIllllllIll[2]];
            stringArray[ay.lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[7]];
            return widget.hasAction(stringArray);
        });
        if (ay.llIlIIlIllIlll(var3)) {
            var3.interact(lIIlllllIllI[lIIllllllIll[0]]);
            return lIIllllllIll[0];
        }
        TileObjects.getNearest((WorldPoint)var2.cy, tileObject -> {
            int n2;
            if (ay.llIlIIlIllIllI(tileObject.getName().equals(lIIlllllIllI[lIIllllllIll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllllllIll[2]];
                stringArray[ay.lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[6]];
                if (ay.llIlIIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllllllIll[2];

                    if (((0xBD ^ 0xB9) & ~(0x4F ^ 0x4B)) < 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllllllIll[0];
            return n2 != 0;
        });

        TileObject var4 = TileObjects.getNearest((WorldPoint)var2.cy, tileObject -> {
            int n2;
            if (ay.llIlIIlIllIllI(tileObject.getName().equals(lIIlllllIllI[lIIllllllIll[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllllllIll[2]];
                stringArray[ay.lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[4]];
                if (ay.llIlIIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllllllIll[2];

                    if (3 != 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllllllIll[0];
            return n2 != 0;
        });
        if (ay.llIlIIlIlllIII(var4)) {
            return lIIllllllIll[0];
        }
        var2_2.interact(lIIlllllIllI[lIIllllllIll[2]]);
        return lIIllllllIll[2];
    }
}

