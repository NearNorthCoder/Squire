/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Enter Sepulchre", priority=25, blocking=true)
public class EnterSepulchreTask
extends Task {
    private  TileObject ap;
    
    private  J aq;
    private final  SquireSepulchre am;
    private final  SquireSepulchreConfig an;
    
    private  Player ai;
    private final  d ao;

    private static boolean lIIIlIIlIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIIlIIlIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public EnterSepulchreTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.an = squireSepulchreConfig;
        this.am = squireSepulchre;
        this.ao = d2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileObject var1;
        P var2;
        void var3;
        Player player = Players.getLocal();
        if (P.lIIIlIIlIIlIlII(player)) {
            return lllIIIlIllII[0];
        }
        if (P.lIIIlIIlIIlIlIl(b.B.contains((Locatable)var3) ? 1 : 0)) {
            return lllIIIlIllII[0];
        }
        if (P.lIIIlIIlIIlIlIl(var2.am.j().matchesInventory() ? 1 : 0)) {
            return lllIIIlIllII[0];
        }
        if (P.lIIIlIIlIIlIllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIIIlIllII[0]);
        }
        if (P.lIIIlIIlIIlIlII(var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lllIIIlIllII[1]];
            stringArray[P.lllIIIlIllII[0]] = lllIIIlIlIIl[lllIIIlIllII[1]];
            if (P.lIIIlIIlIIlIllI(tileObject.hasAction(stringArray) ? 1 : 0) && P.lIIIlIIlIIlIllI(tileObject.getName().startsWith(lllIIIlIlIIl[lllIIIlIllII[2]]) ? 1 : 0)) {
                n2 = lllIIIlIllII[1];

                if (-1 >= 3) {
                    return false;
                }
            } else {
                n2 = lllIIIlIllII[0];
            }
            return n2 != 0;
        }))) {
            return lllIIIlIllII[0];
        }
        var2_2.interact(lllIIIlIlIIl[lllIIIlIllII[0]]);
        return lllIIIlIllII[1];
    }

    static {
        P.lIIIlIIlIIlIIll();
        P.lIIIlIIlIIlIIlI();
    }

    private static void lIIIlIIlIIlIIlI() {
        lllIIIlIlIIl = new String[lllIIIlIllII[3]];
        P.lllIIIlIlIIl[P.lllIIIlIllII[0]] = "Climb-down";
        P.lllIIIlIlIIl[P.lllIIIlIllII[1]] = "Climb-down";
        P.lllIIIlIlIIl[P.lllIIIlIllII[2]] = "Stairs";
    }

        return String.valueOf(var4);
    }

    private static boolean lIIIlIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIlIIlIlII(Object object) {
        return object == null;
    }
}

