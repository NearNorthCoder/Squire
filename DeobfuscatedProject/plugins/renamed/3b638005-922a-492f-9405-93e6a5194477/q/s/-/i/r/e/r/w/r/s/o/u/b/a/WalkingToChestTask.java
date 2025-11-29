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

/* TASK: Walking to chest -> WalkingtochestTask */
@TaskDesc(name="Walking to chest", priority=50, blocking=true)
public class WalkingToChestTask
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

    private static String lIllIlIIIIlIll(String var8, String var13) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var7 = var13.toCharArray();
        int var9 = llllIIlIlIl[0];
        char[] var4 = var8.toCharArray();
        int var1 = var4.length;
        int var12 = llllIIlIlIl[0];
        while (z.lIllIlIIIlIIlI(var12, var1)) {
            char var17 = var4[var12];
            var11.append((char)(var17 ^ var7[var9 % var7.length]));
            0;
            ++var9;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var11);
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
        CollisionMap var15;
        z var19;
        if (z.lIllIlIIIIlllI(this.ar.u() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIllll(var19.ar.h() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        String[] stringArray = new String[llllIIlIlIl[2]];
        stringArray[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[0]];
        TileObject var18 = TileObjects.getFirstSurrounding((WorldPoint)aq, (int)llllIIlIlIl[1], (String[])stringArray);
        if (z.lIllIlIIIlIIII(var18)) {
            return llllIIlIlIl[0];
        }
        String[] stringArray2 = new String[llllIIlIlIl[2]];
        stringArray2[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[2]];
        TileObject var10 = TileObjects.getNearest((String[])stringArray2);
        if (z.lIllIlIIIlIIIl(var10) && z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        Player var20 = Players.getLocal();
        if (z.lIllIlIIIlIIIl(var20.getInteracting()) && z.lIllIlIIIIlllI(var19.ar.f() ? 1 : 0) && z.lIllIlIIIIllll(var19.ar.g() ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)var18) ? 1 : 0)) {
            return llllIIlIlIl[0];
        }
        if (z.lIllIlIIIIlllI(ap.contains(var20.getWorldLocation()) ? 1 : 0) && z.lIllIlIIIlIIIl(var15 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[llllIIlIlIl[2]];
            stringArray[z.llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[4]];
            if (z.lIllIlIIIIlllI(tileObject.hasAction(stringArray) ? 1 : 0) && z.lIllIlIIIIlllI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llllIIlIlIl[2];
                0;
                if (-3 >= 0) {
                    return false;
                }
            } else {
                n2 = llllIIlIlIl[0];
            }
            return n2 != 0;
        }))) {
            var15.interact(llllIIlIlII[llllIIlIlIl[3]]);
            var19.sleep(llllIIlIlIl[1]);
            return llllIIlIlIl[2];
        }
        var15 = Static.getGlobalWithLocalCollisions();
        CollisionMap var2 = Static.getGlobalCollisionMap();
        if (z.lIllIlIIIIlllI(var2 instanceof GlobalCollisionMap)) {
            var15 = new LocalCollisionMap((GlobalCollisionMap)var2, llllIIlIlIl[0]);
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

    private static String lIllIlIIIIlIlI(String var5, String var14) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llllIIlIlIl[3], var16);
            return new String(var6.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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

