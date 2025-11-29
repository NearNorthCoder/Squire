/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/* TASK: Traversing to Cerberus -> TraversingtocerberusTask */
@TaskDesc(name="Traversing to Cerberus", priority=155)
public class TraversingToCerberusTask
extends Task {
    private final /* synthetic */ SquireCerberus aQ;
    private final /* synthetic */ a aS;
    private static /* synthetic */ String[] lIlIIllIl;
    private final /* synthetic */ SquireCerberusConfig aR;
    private static /* synthetic */ int[] lIlIIlllI;

    @Inject
    public A(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        this.aQ = squireCerberus;
        this.aR = squireCerberusConfig;
        this.aS = a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        A llIIIIIlIlIIlII;
        if (A.lIIlIIlIlll(this.aQ.r() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        if (A.lIIlIIlIlll(llIIIIIlIlIIlII.aS.l() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        if (A.lIIlIIllIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        String[] stringArray = new String[lIlIIlllI[1]];
        stringArray[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[0]];
        NPC llIIIIIlIlIIIll = NPCs.getNearest((String[])stringArray);
        if (A.lIIlIIllIIl(llIIIIIlIlIIlII.aS.k()) && A.lIIlIIllIlI(llIIIIIlIlIIIll)) {
            llIIIIIlIlIIlII.aS.a(llIIIIIlIlIIIll);
        }
        if (A.lIIlIIllIlI(llIIIIIlIlIIIll)) {
            return lIlIIlllI[0];
        }
        if (A.lIIlIIllIlI(llIIIIIlIlIIlII.aS.b())) {
            Log.info((String)lIlIIllIl[lIlIIlllI[1]]);
            return llIIIIIlIlIIlII.aS.c();
        }
        String[] stringArray2 = new String[lIlIIlllI[1]];
        stringArray2[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[2]];
        TileObject llIIIIIlIlIIIlI = TileObjects.getNearest((String[])stringArray2);
        if (A.lIIlIIllIlI(llIIIIIlIlIIIlI)) {
            Log.info((String)lIlIIllIl[lIlIIlllI[3]]);
            WorldPoint llIIIIIlIlIIIIl = Players.getLocal().getWorldLocation();
            Movement.setDestination((WorldPoint)new WorldPoint(llIIIIIlIlIIIIl.getX(), llIIIIIlIlIIIIl.getY() + lIlIIlllI[4], llIIIIIlIlIIIIl.getPlane()));
            return lIlIIlllI[1];
        }
        String[] stringArray3 = new String[lIlIIlllI[1]];
        stringArray3[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[5]];
        TileObject llIIIIIlIlIIIIl = TileObjects.getNearest((String[])stringArray3);
        if (A.lIIlIIllIIl(llIIIIIlIlIIIIl)) {
            WorldPoint llIIIIIlIlIIIII = new WorldPoint(lIlIIlllI[6], lIlIIlllI[7], lIlIIlllI[0]);
            return Movement.walkTo((WorldPoint)llIIIIIlIlIIIII);
        }
        Log.info((String)lIlIIllIl[lIlIIlllI[8]]);
        var3_4.interact(lIlIIllIl[lIlIIlllI[9]]);
        this.sleep(lIlIIlllI[9]);
        return lIlIIlllI[1];
    }

    private static String lIIlIIlIIlI(String llIIIIIlIIIlIII, String llIIIIIlIIIIlll) {
        llIIIIIlIIIlIII = new String(Base64.getDecoder().decode(llIIIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIIlIIIIllI = new StringBuilder();
        char[] llIIIIIlIIIIlIl = llIIIIIlIIIIlll.toCharArray();
        int llIIIIIlIIIIlII = lIlIIlllI[0];
        char[] llIIIIIIllllllI = llIIIIIlIIIlIII.toCharArray();
        int llIIIIIIlllllIl = llIIIIIIllllllI.length;
        int llIIIIIIlllllII = lIlIIlllI[0];
        while (A.lIIlIIllIll(llIIIIIIlllllII, llIIIIIIlllllIl)) {
            char llIIIIIlIIIlIIl = llIIIIIIllllllI[llIIIIIIlllllII];
            llIIIIIlIIIIllI.append((char)(llIIIIIlIIIlIIl ^ llIIIIIlIIIIlIl[llIIIIIlIIIIlII % llIIIIIlIIIIlIl.length]));
            0;
            ++llIIIIIlIIIIlII;
            ++llIIIIIIlllllII;
            0;
            if ((0x5C ^ 0x3C ^ (0x23 ^ 0x47)) != 0) continue;
            return null;
        }
        return String.valueOf(llIIIIIlIIIIllI);
    }

    private static boolean lIIlIIlIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIlIIlIlIl() {
        lIlIIllIl = new String[lIlIIlllI[10]];
        A.lIlIIllIl[A.lIlIIlllI[0]] = A."Cerberus";
        A.lIlIIllIl[A.lIlIIlllI[1]] = A."Passing flames";
        A.lIlIIllIl[A.lIlIIlllI[2]] = A."Portcullis";
        A.lIlIIllIl[A.lIlIIlllI[3]] = A."We are inside the Cerb lair, but there are no flames.";
        A.lIlIIllIl[A.lIlIIlllI[5]] = A."Iron Winch";
        A.lIlIIllIl[A.lIlIIlllI[8]] = A."Turning winch";
        A.lIlIIllIl[A.lIlIIlllI[9]] = A."Turn";
    }

    private static boolean lIIlIIllIIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIlIlII(String llIIIIIIlllIIIl, String llIIIIIIlllIIlI) {
        try {
            SecretKeySpec llIIIIIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIlllI[11]), "DES");
            Cipher llIIIIIIlllIlIl = Cipher.getInstance("DES");
            llIIIIIIlllIlIl.init(lIlIIlllI[2], llIIIIIIlllIllI);
            return new String(llIIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llIIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIlllIlII) {
            llIIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlIIll(String llIIIIIlIIllIII, String llIIIIIlIIlIlll) {
        try {
            SecretKeySpec llIIIIIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIlIIllIlI = Cipher.getInstance("Blowfish");
            llIIIIIlIIllIlI.init(lIlIIlllI[2], llIIIIIlIIllIll);
            return new String(llIIIIIlIIllIlI.doFinal(Base64.getDecoder().decode(llIIIIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIlIIllIIl) {
            llIIIIIlIIllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlIllI() {
        lIlIIlllI = new int[12];
        A.lIlIIlllI[0] = (0x12 ^ 0x4F) & ~(0xC2 ^ 0x9F);
        A.lIlIIlllI[1] = 1;
        A.lIlIIlllI[2] = 2;
        A.lIlIIlllI[3] = 3;
        A.lIlIIlllI[4] = 92 + 2 - 73 + 110 ^ 32 + 127 - 55 + 36;
        A.lIlIIlllI[5] = 0x8C ^ 0xB1 ^ (3 ^ 0x3A);
        A.lIlIIlllI[6] = -(0xFFFFFE73 & 0x7BBD) & (0xFFFFFFFD & 0x7F3F);
        A.lIlIIlllI[7] = 0xFFFFD5EE & 0x2EF5;
        A.lIlIIlllI[8] = 80 + 138 - 153 + 93 ^ 147 + 86 - 199 + 121;
        A.lIlIIlllI[9] = 0x20 ^ 0x26;
        A.lIlIIlllI[10] = 0x8C ^ 0x8B;
        A.lIlIIlllI[11] = 0x65 ^ 0x5E ^ (0x65 ^ 0x56);
    }

    static {
        A.lIIlIIlIllI();
        A.lIIlIIlIlIl();
    }

    private static boolean lIIlIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIllIlI(Object object) {
        return object != null;
    }
}

