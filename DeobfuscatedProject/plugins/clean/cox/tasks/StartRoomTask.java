/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Start room", priority=10000, blocking=true)
public class StartRoomTask
extends CoxTaskBase {
    private  int am;

    private  n ak;
    private  n al;

    static {
        aX.llIllllIlIlIII();
        aX.llIllllIlIIlll();
    }

    @Inject
    protected StartRoomTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIllIlII[0];
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllllIlIlIll(Object object) {
        return object == null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aX var1;
        if (aX.llIllllIlIlIlI(u.bf() ? 1 : 0)) {
            return lIlIlIllIlII[2];
        }
        var1.ak = var1.co.L();
        var1.am = var1.co.N();
        var1.al = var1.co.M();
        if (aX.llIllllIlIllII((Object)var1.ak.bw, (Object)N.START)) {
            bl2 = lIlIlIllIlII[1];

            if (1 < 0) {
                return false;
            }
        } else {
            bl2 = lIlIlIllIlII[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aX var2;
        TileObject var3;
        if (aX.llIllllIlIlIIl(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)this.al.bs);
            return lIlIlIllIlII[1];
        }
        if (aX.llIllllIlIlIlI(Tabs.isOpen((Tab)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
        }
        if (aX.llIllllIlIlIll(var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aX.llIllllIlIlIIl(tileObject.getName().equals(lIlIlIllIIll[lIlIlIllIlII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIlII[1]];
                stringArray[aX.lIlIlIllIlII[2]] = lIlIlIllIIll[lIlIlIllIlII[3]];
                if (aX.llIllllIlIlIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aX.llIllllIlIlIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIlIllIlII[1];

                    if (((0xED ^ 0xC3) & ~(0x30 ^ 0x1E)) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIllIlII[2];
            return n2 != 0;
        }))) {
            return lIlIlIllIlII[2];
        }
        var1_1.interact(lIlIlIllIIll[lIlIlIllIlII[2]]);
        return lIlIlIllIlII[1];
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    private static boolean llIllllIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static void llIllllIlIIlll() {
        lIlIlIllIIll = new String[lIlIlIllIlII[4]];
        aX.lIlIlIllIIll[aX.lIlIlIllIlII[2]] = "Enter";
        aX.lIlIlIllIIll[aX.lIlIlIllIlII[1]] = "Passage";
        aX.lIlIlIllIIll[aX.lIlIlIllIlII[3]] = "Enter";
    }

    private static boolean llIllllIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllllIlIllII(Object object, Object object2) {
        return object == object2;
    }

}

