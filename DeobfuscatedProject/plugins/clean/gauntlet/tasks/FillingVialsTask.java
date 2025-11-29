/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum39;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling Vials", priority=3, blocking=true)
public class FillingVialsTask
extends GauntletTaskBase {
    private final  b bS;

    private static boolean lIIIIIIIlIIIlll(Object object) {
        return object == null;
    }

    private static void lIIIIIIIlIIIIlI() {
        llIIlllllllI = new String[llIIllllllll[2]];
        E.llIIlllllllI[E.llIIllllllll[1]] = "Water Pump";
    }

    static {
        E.lIIIIIIIlIIIIll();
        E.lIIIIIIIlIIIIlI();
    }

    private static boolean lIIIIIIIlIIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIlIIIllI(Object object) {
        return object != null;
    }

    @Inject
    public FillingVialsTask(c c2, b b2) {
        d[] dArray = new d[llIIllllllll[0]];
        dArray[E.llIIllllllll[1]] = d.FIRST_ROTATION_CREATE;
        dArray[E.llIIllllllll[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[E.llIIllllllll[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
        this.bS = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_2;
        void var1_1;
        E var1;
        if (E.lIIIIIIIlIIIlII(this.bS.p() ? 1 : 0)) {
            return llIIllllllll[1];
        }
        if (E.lIIIIIIIlIIIlIl(var1.ba.I().isEmpty() ? 1 : 0)) {
            return llIIllllllll[1];
        }
        Item var2 = Inventory.getFirst((int[])f.VIAL.ad());
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (E.lIIIIIIIlIIIlII(e.X.contains(tileObject.getId()) ? 1 : 0) && E.lIIIIIIIlIIIlII(tileObject.getName().equals(llIIlllllllI[llIIllllllll[1]]) ? 1 : 0)) {
                n2 = llIIllllllll[2];

                }
            } else {
                n2 = llIIllllllll[1];
            }
            return n2 != 0;
        });
        if (!E.lIIIIIIIlIIIllI(var3) || E.lIIIIIIIlIIIlll(var2)) {
            return llIIllllllll[1];
        }
        var1_1.useOn((TileObject)var2_2);
        this.bS.e(llIIllllllll[0]);
        return llIIllllllll[2];
    }

    private static boolean lIIIIIIIlIIIlIl(int n2) {
        return n2 == 0;
    }
}

