/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Leaving the altar", blocking=true, priority=5)
public class LeavingTheAltarTask
extends RunecraftingTaskBase {

    private static boolean lIIIIIIIIIlIIII(Object object) {
        return object != null;
    }

    @Inject
    public LeavingTheAltarTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIlIIIIIlII[0]];
        cArray[r.llIlIIIIIlII[1]] = c.ACTIVE;
        cArray[r.llIlIIIIIlII[2]] = c.FINISHING;
        cArray[r.llIlIIIIIlII[3]] = c.OUTSIDE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lIIIIIIIIIIlIll(int n2) {
        return n2 <= 0;
    }

    private static boolean lIIIIIIIIIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var2_2;
        r var1;
        int var2;
        int n2;
        int[] nArray = new int[llIlIIIIIlII[2]];
        nArray[r.llIlIIIIIlII[1]] = llIlIIIIIlII[4];
        if (!r.lIIIIIIIIIIlIll(Inventory.getCount((int[])nArray)) || r.lIIIIIIIIIIllII(this.aV.S(), Static.getClient().getTickCount())) {
            n2 = llIlIIIIIlII[2];

            if (-1 < -1) {
                return false;
            }
        } else {
            n2 = llIlIIIIIlII[1];
        }
        if (!r.lIIIIIIIIIIllIl(var2 = n2) || r.lIIIIIIIIIIlllI(var1.aV.g() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIIIIIIIIlllI(tileObject.getName().contains(llIlIIIIIIlI[llIlIIIIIlII[2]]) ? 1 : 0) && r.lIIIIIIIIIIlllI(tileObject.hasAction(string -> {
                int n2;
                if (r.lIIIIIIIIIlIIII(string) && r.lIIIIIIIIIIlllI(string.equals(llIlIIIIIIlI[llIlIIIIIlII[3]]) ? 1 : 0)) {
                    n2 = llIlIIIIIlII[2];

                    if (3 <= 1) {
                        return false;
                    }
                } else {
                    n2 = llIlIIIIIlII[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = llIlIIIIIlII[2];

                if (3 <= 2) {
                    return false;
                }
            } else {
                n2 = llIlIIIIIlII[1];
            }
            return n2 != 0;
        });
        if (r.lIIIIIIIIIIllll(var3)) {
            return llIlIIIIIlII[1];
        }
        var2_2.interact(llIlIIIIIIlI[llIlIIIIIlII[1]]);
        this.b(llIlIIIIIlII[2], () -> Players.getLocal().isMoving());
        return llIlIIIIIlII[2];
    }

    static {
        r.lIIIIIIIIIIlIlI();
        r.lIIIIIIIIIIlIIl();
    }

        return String.valueOf(var4);
    }

    private static boolean lIIIIIIIIIIlllI(int n2) {
        return n2 != 0;
    }

    private static void lIIIIIIIIIIlIIl() {
        llIlIIIIIIlI = new String[llIlIIIIIlII[0]];
        r.llIlIIIIIIlI[r.llIlIIIIIlII[1]] = "Use";
        r.llIlIIIIIIlI[r.llIlIIIIIlII[2]] = "Portal";
        r.llIlIIIIIIlI[r.llIlIIIIIlII[3]] = "Use";
    }

    private static boolean lIIIIIIIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIIIIIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIIIIIIllll(Object object) {
        return object == null;
    }
}

