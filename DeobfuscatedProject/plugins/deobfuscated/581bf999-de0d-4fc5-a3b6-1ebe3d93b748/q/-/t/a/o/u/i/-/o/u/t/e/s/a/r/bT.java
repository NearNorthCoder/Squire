/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bY;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Escaping water", priority=50, blocking=true)
public class bT
extends bX {
    private static /* synthetic */ int[] lIllIlIIlII;
    private static /* synthetic */ String[] lIllIlIIIlI;

    @Inject
    protected bT(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIIlIllIlllIIl() {
        lIllIlIIlII = new int[5];
        bT.lIllIlIIlII[0] = (107 + 122 - 225 + 169 ^ 126 + 94 - 182 + 119) & (0x43 ^ 0x4C ^ (0x16 ^ 0x29) ^ -1);
        bT.lIllIlIIlII[1] = 0x24 ^ 0x3A;
        bT.lIllIlIIlII[2] = 1;
        bT.lIllIlIIlII[3] = 2;
        bT.lIllIlIIlII[4] = 0x33 ^ 0x3B;
    }

    private static boolean lIIlIllIlllIll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIllIllI() {
        lIllIlIIIlI = new String[lIllIlIIlII[3]];
        bT.lIllIlIIIlI[bT.lIllIlIIlII[0]] = bT."Rock steps";
        bT.lIllIlIIIlI[bT.lIllIlIIlII[2]] = bT."Climb-up";
    }

    private static String lIIlIllIllIlIl(String llllllllllllllllIlIlIIIlllllIlIl, String llllllllllllllllIlIlIIIlllllIlII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIllllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIIlllllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIIlllllIlll.init(lIllIlIIlII[3], llllllllllllllllIlIlIIIllllllIII);
            return new String(llllllllllllllllIlIlIIIlllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIlllllIllI) {
            llllllllllllllllIlIlIIIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlllIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIllllII(int n2) {
        return n2 != 0;
    }

    static {
        bT.lIIlIllIlllIIl();
        bT.lIIlIllIllIllI();
    }

    private static String lIIlIllIllIlII(String llllllllllllllllIlIlIIIllllIlIII, String llllllllllllllllIlIlIIIllllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIllllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIllllIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIlII[4]), "DES");
            Cipher llllllllllllllllIlIlIIIllllIlIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIllllIlIlI.init(lIllIlIIlII[3], llllllllllllllllIlIlIIIllllIlIll);
            return new String(llllllllllllllllIlIlIIIllllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIllllIlIIl) {
            llllllllllllllllIlIlIIIllllIlIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var3_3;
        bT llllllllllllllllIlIlIIlIIIIIIIII;
        NPC nPC = this.cB();
        if (bT.lIIlIllIlllIlI(nPC)) {
            return lIllIlIIlII[0];
        }
        Point llllllllllllllllIlIlIIIllllllllI = new Point(lIllIlIIlII[1], lIllIlIIlII[1]);
        if (!bT.lIIlIllIlllIll(Reachable.isWalkable((WorldPoint)llllllllllllllllIlIlIIlIIIIIIIII.a(llllllllllllllllIlIlIIIllllllllI)) ? 1 : 0) || bT.lIIlIllIllllII(Reachable.isObstacle((WorldPoint)llllllllllllllllIlIlIIlIIIIIIIII.a(llllllllllllllllIlIlIIIllllllllI)) ? 1 : 0)) {
            return lIllIlIIlII[0];
        }
        String[] stringArray = new String[lIllIlIIlII[2]];
        stringArray[bT.lIllIlIIlII[0]] = lIllIlIIIlI[lIllIlIIlII[0]];
        TileObject llllllllllllllllIlIlIIIlllllllIl = TileObjects.getNearest((String[])stringArray);
        if (bT.lIIlIllIlllIlI(llllllllllllllllIlIlIIIlllllllIl)) {
            return lIllIlIIlII[0];
        }
        if (bT.lIIlIllIllllIl((Object)llllllllllllllllIlIlIIlIIIIIIIII.cF(), (Object)bY.ATTACK)) {
            Movement.setDestination((WorldPoint)llllllllllllllllIlIlIIIlllllllIl.getWorldLocation());
            return lIllIlIIlII[2];
        }
        var3_3.interact(lIllIlIIIlI[lIllIlIIlII[2]]);
        return lIllIlIIlII[2];
    }

    private static boolean lIIlIllIllllIl(Object object, Object object2) {
        return object != object2;
    }
}

