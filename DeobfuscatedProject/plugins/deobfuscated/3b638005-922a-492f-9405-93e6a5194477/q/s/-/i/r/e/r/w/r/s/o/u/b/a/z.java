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
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

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
public class z
extends Task {
    private static /* synthetic */ int[] llllIIlIlIl;
    private static final /* synthetic */ List<WorldPoint> ap;
    private final /* synthetic */ SquireBarrows ar;
    private static /* synthetic */ String[] llllIIlIlII;
    private static final /* synthetic */ WorldPoint aq;

    private static boolean lIllIlIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIIlIIII(Object object) {
        return object == null;
    }

    private static String lIllIlIIIIlIll(String llllllllllllllllIIIlllIIIlIlIllI, String llllllllllllllllIIIlllIIIlIlIlIl) {
        llllllllllllllllIIIlllIIIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIlllIIIlIllIIl = new StringBuilder();
        char[] llllllllllllllllIIIlllIIIlIllIII = llllllllllllllllIIIlllIIIlIlIlIl.toCharArray();
        int llllllllllllllllIIIlllIIIlIlIlll = llllIIlIlIl[0];
        char[] llllllllllllllllIIIlllIIIlIlIIIl = llllllllllllllllIIIlllIIIlIlIllI.toCharArray();
        int llllllllllllllllIIIlllIIIlIlIIII = llllllllllllllllIIIlllIIIlIlIIIl.length;
        int llllllllllllllllIIIlllIIIlIIllll = llllIIlIlIl[0];
        while (z.lIllIlIIIlIIlI(llllllllllllllllIIIlllIIIlIIllll, llllllllllllllllIIIlllIIIlIlIIII)) {
            char llllllllllllllllIIIlllIIIlIlllII = llllllllllllllllIIIlllIIIlIlIIIl[llllllllllllllllIIIlllIIIlIIllll];
            llllllllllllllllIIIlllIIIlIllIIl.append((char)(llllllllllllllllIIIlllIIIlIlllII ^ llllllllllllllllIIIlllIIIlIllIII[llllllllllllllllIIIlllIIIlIlIlll % llllllllllllllllIIIlllIIIlIllIII.length]));
            0;
            ++llllllllllllllllIIIlllIIIlIlIlll;
            ++llllllllllllllllIIIlllIIIlIIllll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIlllIIIlIllIIl);
    }

    private static void lIllIlIIIIllII() {
        llllIIlIlII = new String[llllIIlIlIl[10]];
        z.llllIIlIlII[z.llllIIlIlIl[0]] = z."Chest";
        z.llllIIlIlII[z.llllIIlIlIl[2]] = z."Sarcophagus";
        z.llllIIlIlII[z.llllIIlIlIl[3]] = z."Open";
        z.llllIIlIlII[z.llllIIlIlIl[4]] = z."Open";
    }

    @Inject
    public z(SquireBarrows squireBarrows) {
        this.ar = squireBarrows;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        void var1_1;
        void var3_3;
        CollisionMap llllllllllllllllIIIlllIIIllIlIlI;
        z llllllllllllllllIIIlllIIIllIlllI;
        if (z.lIllIlIIIIlllI(this.ar.u() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIllll(llllllllllllllllIIIlllIIIllIlllI.ar.h() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        String[] stringArray = new String[llllIIlIlIl[2]];
        stringArray[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[0]];
        TileObject llllllllllllllllIIIlllIIIllIllIl = TileObjects.getFirstSurrounding((WorldPoint)aq, (int)llllIIlIlIl[1], (String[])stringArray);
        if (z.lIllIlIIIlIIII(llllllllllllllllIIIlllIIIllIllIl)) {
            return llllIIlIlIl[0];
        }
        String[] stringArray2 = new String[llllIIlIlIl[2]];
        stringArray2[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[2]];
        TileObject llllllllllllllllIIIlllIIIllIllII = TileObjects.getNearest((String[])stringArray2);
        if (z.lIllIlIIIlIIIl(llllllllllllllllIIIlllIIIllIllII) && z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)llllllllllllllllIIIlllIIIllIllII) ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        Player llllllllllllllllIIIlllIIIllIlIll = Players.getLocal();
        if (z.lIllIlIIIlIIIl(llllllllllllllllIIIlllIIIllIlIll.getInteracting()) && z.lIllIlIIIIlllI(llllllllllllllllIIIlllIIIllIlllI.ar.f() ? 1 : 0) && z.lIllIlIIIIllll(llllllllllllllllIIIlllIIIllIlllI.ar.g() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)llllllllllllllllIIIlllIIIllIllIl) ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIlllI(ap.contains(llllllllllllllllIIIlllIIIllIlIll.getWorldLocation()) ? 1 : 0) && z.lIllIlIIIlIIIl(llllllllllllllllIIIlllIIIllIlIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[llllIIlIlIl[2]];
            stringArray[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[4]];
            if (z.lIllIlIIIIlllI(tileObject.hasAction(stringArray) ? 1 : 0) && z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llllIIlIlIl[2];
                0;
                if (-3 >= 0) {
                    return ((51 + 137 - -12 + 25 ^ 177 + 83 - 204 + 133) & (53 + 165 - 58 + 32 ^ 38 + 54 - 81 + 145 ^ -1)) != 0;
                }
            } else {
                n2 = llllIIlIlIl[0];
            }
            return n2 != 0;
        }))) {
            llllllllllllllllIIIlllIIIllIlIlI.interact(llllIIlIlII[llllIIlIlIl[3]]);
            llllllllllllllllIIIlllIIIllIlllI.sleep(llllIIlIlIl[1]);
            return llllIIlIlIl[2];
        }
        llllllllllllllllIIIlllIIIllIlIlI = Static.getGlobalWithLocalCollisions();
        CollisionMap llllllllllllllllIIIlllIIIllIlIIl = Static.getGlobalCollisionMap();
        if (z.lIllIlIIIIlllI(llllllllllllllllIIIlllIIIllIlIIl instanceof GlobalCollisionMap)) {
            llllllllllllllllIIIlllIIIllIlIlI = new LocalCollisionMap((GlobalCollisionMap)llllllllllllllllIIIlllIIIllIlIIl, llllIIlIlIl[0]);
        }
        TilePath tilePath = Walker.calculateTilePath(List.of(var3_3.getWorldLocation()), (WorldArea)var1_1.getWorldLocation().toWorldArea(), (CollisionMap)var4_4);
        Walker.walkAlong((List)tilePath, Collections.emptyMap());
        0;
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

    private static String lIllIlIIIIlIlI(String llllllllllllllllIIIlllIIIlIIIlII, String llllllllllllllllIIIlllIIIlIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIIIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIIIlIIlIII.init(llllIIlIlIl[3], llllllllllllllllIIIlllIIIlIIlIIl);
            return new String(llllllllllllllllIIIlllIIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIIIlIIIlll) {
            llllllllllllllllIIIlllIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIIlllI(int n2) {
        return n2 != 0;
    }

    private static void lIllIlIIIIllIl() {
        llllIIlIlIl = new int[11];
        z.llllIIlIlIl[0] = (0x3E ^ 0x32 ^ (0x61 ^ 0x2F)) & (96 + 111 - -24 + 13 ^ 159 + 3 - 76 + 96 ^ -1);
        z.llllIIlIlIl[1] = 4 ^ 0x25 ^ (0x2B ^ 0);
        z.llllIIlIlIl[2] = 1;
        z.llllIIlIlIl[3] = 2;
        z.llllIIlIlIl[4] = 3;
        z.llllIIlIlIl[5] = -(0xFFFFCB1F & 0x35E7) & (0xFFFF9FEF & 0x6F5E);
        z.llllIIlIlIl[6] = -(0xFFFFCF17 & 0x3AEB) & (0xFFFFAFFF & 0x7FEF);
        z.llllIIlIlIl[7] = -(0xFFFFF157 & 0x7EAB) & (0xFFFFFDEF & Short.MAX_VALUE);
        z.llllIIlIlIl[8] = 0xFFFFEDDF & 0x1FFF;
        z.llllIIlIlIl[9] = 0xFFFFA5FF & 0x7FDE;
        z.llllIIlIlIl[10] = 7 ^ 3;
    }
}

