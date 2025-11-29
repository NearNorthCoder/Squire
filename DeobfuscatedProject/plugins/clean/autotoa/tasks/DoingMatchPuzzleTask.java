/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GroundObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing match puzzle", priority=50, blocking=true)
public class DoingMatchPuzzleTask
extends AutotoaTaskBase {

    @Inject
    protected DoingMatchPuzzleTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
    }

    private static boolean lIlIIIIIlIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public GroundObject cb() {
        List list = TileObjects.getAll(tileObject -> {
            String[] stringArray = new String[llIIlIIlIIl[0]];
            stringArray[bo.llIIlIIlIIl[1]] = llIIlIIlIII[llIIlIIlIIl[2]];
            return tileObject.hasAction(stringArray);
        });
        TileObject tileObject2 = list.stream().min(Comparator.comparingInt(TileObject::getId).thenComparingInt(tileObject -> tileObject.getWorldLocation().distanceTo((Locatable)Players.getLocal()))).orElse(null);
        if (bo.lIlIIIIIlIIIII(tileObject2 instanceof GroundObject)) {
            return (GroundObject)tileObject2;
        }
        return null;
    }

    static {
        bo.lIlIIIIIIllllI();
        bo.lIlIIIIIIlllIl();
    }

    @Override
    public boolean bk() {
        String[] stringArray = new String[llIIlIIlIIl[0]];
        stringArray[bo.llIIlIIlIIl[1]] = llIIlIIlIII[llIIlIIlIIl[1]];
        return TileObjects.getAll((String[])stringArray).stream().anyMatch(Reachable::isInteractable);
    }

    private static boolean lIlIIIIIIlllll(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static void lIlIIIIIIlllIl() {
        llIIlIIlIII = new String[llIIlIIlIIl[3]];
        bo.llIIlIIlIII[bo.llIIlIIlIIl[1]] = "Symbol";
        bo.llIIlIIlIII[bo.llIIlIIlIIl[0]] = "Activate";
        bo.llIIlIIlIII[bo.llIIlIIlIIl[2]] = "Activate";
    }

    @Override
    public boolean bY() {
        GroundObject groundObject = this.cb();
        if (bo.lIlIIIIIIlllll(groundObject)) {
            return llIIlIIlIIl[1];
        }
        groundObject.interact(llIIlIIlIII[llIIlIIlIIl[0]]);
        return llIIlIIlIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int bZ() {
        int n2;
        GroundObject groundObject = this.cb();
        if (bo.lIlIIIIIIlllll(groundObject)) {
            n2 = llIIlIIlIIl[1];

            if (3 <= -1) {
                return (0x82 ^ 0xBB) & ~(0x49 ^ 0x70);
            }
        } else {
            void var2;
            n2 = var2.getWorldX();
        }
        return n2;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        if (bo.lIlIIIIIIlllll(this.cb())) {
            bl2 = llIIlIIlIIl[0];

            if (((2 ^ (0xCD ^ 0x9E)) & (0x70 ^ 0x31 ^ (0x9B ^ 0x8B) ^ -1)) == 1) {
                return false;
            }
        } else {
            bl2 = llIIlIIlIIl[1];
        }
        return bl2;
    }
}

