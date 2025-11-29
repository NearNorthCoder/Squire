/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Pouring crucible", priority=200)
public class PouringCrucibleTask
extends GiantsfoundryTaskBase {
    private static final  int ar;
    private static final  WorldPoint as;

    private static boolean lIIIIIllIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public PouringCrucibleTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    static {
        x.lIIIIIllIlIlIll();
        x.lIIIIIllIlIlIlI();
        ar = llIlIlIlllII[1];
        as = new WorldPoint(llIlIlIlllII[4], llIlIlIlllII[5], llIlIlIlllII[0]);
    }

    private static boolean lIIIIIllIlIllII(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIllIlIlIlI() {
        llIlIlIllIll = new String[llIlIlIlllII[6]];
        x.llIlIlIllIll[x.llIlIlIlllII[0]] = "Pour";
        x.llIlIlIllIll[x.llIlIlIlllII[2]] = "Pour";
    }

    private static boolean lIIIIIllIlIllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        if (x.lIIIIIllIlIllII(this.T.g() ? 1 : 0)) {
            return llIlIlIlllII[0];
        }
        if (x.lIIIIIllIlIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIlIlIlllII[0];
        }
        if (x.lIIIIIllIlIllIl(Vars.getBit((int)llIlIlIlllII[1])) && x.lIIIIIllIlIllII(Players.getLocal().getWorldLocation().equals((Object)as) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)as);
            return llIlIlIlllII[2];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lIIIIIllIlIllll(tileObject.getId(), llIlIlIlllII[3])) {
                String[] stringArray = new String[llIlIlIlllII[2]];
                stringArray[x.llIlIlIlllII[0]] = llIlIlIllIll[llIlIlIlllII[2]];
                if (x.lIIIIIllIlIllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIlIlllII[2];

                    if (-1 < 2) return n2 != 0;
                    return ((28 + 108 - 31 + 74 ^ 126 + 65 - 190 + 140) & (0x1F ^ 0x7D ^ (0x11 ^ 0x4D) ^ -1)) != 0;
                }
            }
            n2 = llIlIlIlllII[0];
            return n2 != 0;
        });
        if (x.lIIIIIllIlIlllI(var1)) {
            return llIlIlIlllII[0];
        }
        var1_1.interact(llIlIlIllIll[llIlIlIlllII[0]]);
        return llIlIlIlllII[2];
    }

    private static boolean lIIIIIllIlIlllI(Object object) {
        return object == null;
    }
}

