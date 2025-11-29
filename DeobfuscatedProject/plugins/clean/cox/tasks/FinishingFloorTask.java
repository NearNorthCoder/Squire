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
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Finishing floor", priority=10000, blocking=true)
public class FinishingFloorTask
extends CoxTaskBase {
    
    private  n ak;

    private static boolean llIlIlIlllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIlllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aT var1;
        if (aT.llIlIlIlllIIlI(u.bf() ? 1 : 0)) {
            return lIlIIIlIIlII[1];
        }
        var1.ak = var1.co.L();
        if (aT.llIlIlIlllIlII((Object)var1.ak.bw, (Object)N.END)) {
            bl2 = lIlIIIlIIlII[0];

            if ((0x6B ^ 0x2B ^ (0xCB ^ 0x8F)) < -1) {
                return ((178 + 162 - 254 + 123 ^ 6 + 115 - 9 + 81) & (0xFB ^ 0x9A ^ (0xED ^ 0x9C) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIIIlIIlII[1];
        }
        return bl2;
    }

    private static boolean llIlIlIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIlllIIll(Object object) {
        return object == null;
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    protected boolean dX() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().equals(lIlIIIlIIIll[lIlIIIlIIlII[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[5]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];

                    if (null == null) return n2 != 0;
                    return ((0x81 ^ 0xB2 ^ (0x9D ^ 0x8E)) & (0xCD ^ 0x81 ^ (0xE6 ^ 0x8A) ^ -1)) != 0;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIll(tileObject2)) {
            return lIlIIIlIIlII[1];
        }
        if (aT.llIlIlIlllIlIl(Movement.getRunEnergy(), lIlIIIlIIlII[2])) {
            return lIlIIIlIIlII[1];
        }
        tileObject2.interact(lIlIIIlIIIll[lIlIIIlIIlII[3]]);
        return lIlIIIlIIlII[0];
    }

    private static boolean llIlIlIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIlIllIlllI() {
        lIlIIIlIIIll = new String[lIlIIIlIIlII[10]];
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[1]] = "Enter";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[0]] = "Enter";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[3]] = "Touch";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[4]] = "Energy well";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[5]] = "Touch";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[6]] = "Passage";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[7]] = "Enter";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[8]] = "Hole";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[9]] = "Enter";
    }

    static {
        aT.llIlIlIllIllll();
        aT.llIlIlIllIlllI();
    }

    private static boolean llIlIlIlllIlII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    protected FinishingFloorTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aT var2;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().contains(lIlIIIlIIIll[lIlIIIlIIlII[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[9]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIII(tileObject2) && aT.llIlIlIlllIIIl(Reachable.isInteractable((Locatable)tileObject2) ? 1 : 0)) {
            void var3;
            if (aT.llIlIlIlllIIIl(this.dX() ? 1 : 0)) {
                return lIlIIIlIIlII[0];
            }
            if (aT.llIlIlIlllIIlI(Movement.shouldWalk() ? 1 : 0)) {
                return lIlIIIlIIlII[0];
            }
            var3.interact(lIlIIIlIIIll[lIlIIIlIIlII[1]]);
            return lIlIIIlIIlII[0];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().equals(lIlIIIlIIIll[lIlIIIlIIlII[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[7]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];

                    if (2 > 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIll(var4)) {
            return lIlIIIlIIlII[1];
        }
        var2_2.interact(lIlIIIlIIIll[lIlIIIlIIlII[0]]);
        return lIlIIIlIIlII[0];
    }

        return String.valueOf(var5);
    }

    private static boolean llIlIlIlllIIII(Object object) {
        return object != null;
    }
}

