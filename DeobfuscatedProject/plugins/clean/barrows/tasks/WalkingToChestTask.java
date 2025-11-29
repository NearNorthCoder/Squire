/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.api.movement.pathfinder.GlobalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.LocalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.TilePath
 *  net.unethicalite.client.Static
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.TilePath;
import net.unethicalite.client.Static;

@TaskDesc(name="Walking to chest", priority=50, blocking=true)
public class WalkingToChestTask
extends Task {
    
    private static final  List<WorldPoint> ap;
    private final  SquireBarrows ar;
    
    private static final  WorldPoint aq;

    private static boolean lIllIlIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIIlIIII(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static void lIllIlIIIIllII() {
        llllIIlIlII = new String[llllIIlIlIl[10]];
        z.llllIIlIlII[z.llllIIlIlIl[0]] = "Chest";
        z.llllIIlIlII[z.llllIIlIlIl[2]] = "Sarcophagus";
        z.llllIIlIlII[z.llllIIlIlIl[3]] = "Open";
        z.llllIIlIlII[z.llllIIlIlIl[4]] = "Open";
    }

    @Inject
    public WalkingToChestTask(SquireBarrows squireBarrows) {
        this.ar = squireBarrows;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        void var1_1;
        void var3_3;
        CollisionMap var2;
        z var3;
        if (z.lIllIlIIIIlllI(this.ar.u() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIllll(var3.ar.h() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        String[] stringArray = new String[llllIIlIlIl[2]];
        stringArray[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[0]];
        TileObject var4 = TileObjects.getFirstSurrounding((WorldPoint)aq, (int)llllIIlIlIl[1], (String[])stringArray);
        if (z.lIllIlIIIlIIII(var4)) {
            return llllIIlIlIl[0];
        }
        String[] stringArray2 = new String[llllIIlIlIl[2]];
        stringArray2[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[2]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray2);
        if (z.lIllIlIIIlIIIl(var5) && z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        Player var6 = Players.getLocal();
        if (z.lIllIlIIIlIIIl(var6.getInteracting()) && z.lIllIlIIIIlllI(var3.ar.f() ? 1 : 0) && z.lIllIlIIIIllll(var3.ar.g() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIlllI(ap.contains(var6.getWorldLocation()) ? 1 : 0) && z.lIllIlIIIlIIIl(var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[llllIIlIlIl[2]];
            stringArray[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[4]];
            if (z.lIllIlIIIIlllI(tileObject.hasAction(stringArray) ? 1 : 0) && z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llllIIlIlIl[2];

            } else {
                n2 = llllIIlIlIl[0];
            }
            return n2 != 0;
        }))) {
            var2.interact(llllIIlIlII[llllIIlIlIl[3]]);
            var3.sleep(llllIIlIlIl[1]);
            return llllIIlIlIl[2];
        }
        var2 = Static.getGlobalWithLocalCollisions();
        CollisionMap var7 = Static.getGlobalCollisionMap();
        if (z.lIllIlIIIIlllI(var7 instanceof GlobalCollisionMap)) {
            var2 = new LocalCollisionMap((GlobalCollisionMap)var7, llllIIlIlIl[0]);
        }
        TilePath tilePath = Walker.calculateTilePath(List.of(var3_3.getWorldLocation()), (WorldArea)var1_1.getWorldLocation().toWorldArea(), (CollisionMap)var4_4);
        Walker.walkAlong((List)tilePath, Collections.emptyMap());

        return llllIIlIlIl[2];
    }

    private static boolean lIllIlIIIIllll(int n2) {
        return n2 == 0;
    }

    static {
        z.lIllIlIIIIllIl();
        z.lIllIlIIIIllII();
        ap = List.of(new WorldPoint(llllIIlIlIl[5], llllIIlIlIl[6], llllIIlIlIl[0]), new WorldPoint(llllIIlIlIl[7], llllIIlIlIl[6], llllIIlIlIl[0]));
        aq = new WorldPoint(llllIIlIlIl[8], llllIIlIlIl[9], llllIIlIlIl[0]);
    }

    private static boolean lIllIlIIIlIIIl(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIIIlllI(int n2) {
        return n2 != 0;
    }

}

