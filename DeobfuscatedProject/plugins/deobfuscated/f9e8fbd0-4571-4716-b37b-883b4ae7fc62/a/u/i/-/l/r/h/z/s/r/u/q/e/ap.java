/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import a.u.i.-.l.r.h.z.s.r.u.q.e.o;
import a.u.i.-.l.r.h.z.s.r.u.q.e.q;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Traversing to Zul-andra")
public class ap
extends Task {
    private final /* synthetic */ SquireZulrah aS;
    private static final /* synthetic */ WorldPoint aQ;
    private static /* synthetic */ int[] lIllIllllllIl;
    private final /* synthetic */ v aT;
    private static final /* synthetic */ int aP;
    private static /* synthetic */ String[] lIllIllllllII;
    private static final /* synthetic */ int aO;
    private final /* synthetic */ SquireZulrahConfig aR;
    private final /* synthetic */ Client aU;

    private static boolean llIIlIlIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlIlIIIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIIlIlIIIIIIII() {
        lIllIllllllII = new String[lIllIllllllIl[11]];
        ap.lIllIllllllII[ap.lIllIllllllIl[0]] = ap."Enter";
        ap.lIllIllllllII[ap.lIllIllllllIl[2]] = ap."Eat";
    }

    private static boolean llIIlIlIIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIlIIIIlIIl(Object object) {
        return object == null;
    }

    private boolean ak() {
        if (ap.llIIlIlIIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)aQ);
            0;
        }
        return lIllIllllllIl[2];
    }

    static {
        ap.llIIlIlIIIIIIIl();
        ap.llIIlIlIIIIIIII();
        aP = lIllIllllllIl[7];
        aO = lIllIllllllIl[8];
        aQ = new WorldPoint(lIllIllllllIl[9], lIllIllllllIl[10], lIllIllllllIl[0]);
    }

    private static boolean llIIlIlIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIlIIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIlIIllllllll(String llllllllllllllIllIIIIllllIlIlIII, String llllllllllllllIllIIIIllllIlIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIIllllIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIllllIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIllIllllllIl[12]), "DES");
            Cipher llllllllllllllIllIIIIllllIlIllII = Cipher.getInstance("DES");
            llllllllllllllIllIIIIllllIlIllII.init(lIllIllllllIl[11], llllllllllllllIllIIIIllllIlIllIl);
            return new String(llllllllllllllIllIIIIllllIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIllllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIIllllIlIlIll) {
            llllllllllllllIllIIIIllllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlIIIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIlIIIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIlIIlllllllI(String llllllllllllllIllIIIIllllIIllIll, String llllllllllllllIllIIIIllllIIlllII) {
        try {
            SecretKeySpec llllllllllllllIllIIIIllllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIllllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIIllllIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIIllllIIlllll.init(lIllIllllllIl[11], llllllllllllllIllIIIIllllIlIIIII);
            return new String(llllllllllllllIllIIIIllllIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIllllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIIllllIIllllI) {
            llllllllllllllIllIIIIllllIIllllI.printStackTrace();
            return null;
        }
    }

    private static void llIIlIlIIIIIIIl() {
        lIllIllllllIl = new int[13];
        ap.lIllIllllllIl[0] = (0x54 ^ 0x10) & ~(0x6B ^ 0x2F);
        ap.lIllIllllllIl[1] = -(0xFFFFDEFA & 0x7DD5) & (0xFFFFFFFF & Short.MAX_VALUE);
        ap.lIllIllllllIl[2] = 1;
        ap.lIllIllllllIl[3] = 0x55 ^ 0x45;
        ap.lIllIllllllIl[4] = 0xFFFFEBFF & 0x7C15;
        ap.lIllIllllllIl[5] = -(0xFFFFAFDF & 0x5C23) & (0xFFFFBD7B & 0x7EBE);
        ap.lIllIllllllIl[6] = 0x96 ^ 0xAE ^ (0x4B ^ 0x77);
        ap.lIllIllllllIl[7] = 0xFFFFF66F & 0x2BBF;
        ap.lIllIllllllIl[8] = 0xFFFFAFD4 & 0x777F;
        ap.lIllIllllllIl[9] = 0xFFFFE9DE & 0x1EB9;
        ap.lIllIllllllIl[10] = 0xFFFFDBF7 & 0x2FF8;
        ap.lIllIllllllIl[11] = 2;
        ap.lIllIllllllIl[12] = 0x41 ^ 1 ^ (0x7F ^ 0x37);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_6;
        int n2;
        int llllllllllllllIllIIIIllllIllIlII;
        ap llllllllllllllIllIIIIllllIllIlll;
        if (!ap.llIIlIlIIIIIIlI((Object)this.aS.a(), (Object)c.DONE) || ap.llIIlIlIIIIIIll(this.aS.d() ? 1 : 0)) {
            return lIllIllllllIl[0];
        }
        if (ap.llIIlIlIIIIIIlI((Object)llllllllllllllIllIIIIllllIllIlll.aR.transport(), (Object)q.ZUL_ANDRA_TELEPORT)) {
            return lIllIllllllIl[0];
        }
        WorldPoint llllllllllllllIllIIIIllllIllIllI = Players.getLocal().getWorldLocation();
        if (ap.llIIlIlIIIIIIll(llllllllllllllIllIIIIllllIllIlll.aU.isInInstancedRegion() ? 1 : 0)) {
            int[] llllllllllllllIllIIIIllllIllIlIl = llllllllllllllIllIIIIllllIllIlll.aU.getMapRegions();
            llllllllllllllIllIIIIllllIllIlII = llllllllllllllIllIIIIllllIllIlIl.length;
            int llllllllllllllIllIIIIllllIllIIll = lIllIllllllIl[0];
            while (ap.llIIlIlIIIIIlII(llllllllllllllIllIIIIllllIllIIll, llllllllllllllIllIIIIllllIllIlII)) {
                int llllllllllllllIllIIIIllllIllIIlI = llllllllllllllIllIIIIllllIllIlIl[llllllllllllllIllIIIIllllIllIIll];
                if (ap.llIIlIlIIIIIlIl(llllllllllllllIllIIIIllllIllIIlI, lIllIllllllIl[1])) {
                    return lIllIllllllIl[0];
                }
                ++llllllllllllllIllIIIIllllIllIIll;
                0;
                if (((75 + 198 - 144 + 121 ^ 155 + 98 - 95 + 22) & (197 + 2 - 24 + 38 ^ 53 + 75 - 2 + 29 ^ -1)) <= 0) continue;
                return ((0xDC ^ 0x93 ^ (0x7B ^ 0x1B)) & (0xE0 ^ 0xC0 ^ (0x32 ^ 0x3D) ^ -1)) != 0;
            }
        }
        int llllllllllllllIllIIIIllllIllIlIl = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIllllllIl[2]];
            stringArray[ap.lIllIllllllIl[0]] = lIllIllllllII[lIllIllllllIl[2]];
            return item.hasAction(stringArray);
        });
        if (!ap.llIIlIlIIIIIllI(Inventory.contains(item -> item.getName().startsWith(this.aR.cure().k())) ? 1 : 0) || ap.llIIlIlIIIIIIlI((Object)llllllllllllllIllIIIIllllIllIlll.aR.cure(), (Object)o.IGNORE)) {
            n2 = lIllIllllllIl[2];
            0;
            if ((0x3A ^ 0x5C ^ (0xD8 ^ 0xBA)) != (0x26 ^ 0x7B ^ (0x61 ^ 0x38))) {
                return ((0xFE ^ 0xB4 ^ (0x33 ^ 0x2C)) & (0x5B ^ 0x64 ^ (0x28 ^ 0x42) ^ -1)) != 0;
            }
        } else {
            n2 = llllllllllllllIllIIIIllllIllIlII = lIllIllllllIl[0];
        }
        if (!ap.llIIlIlIIIIIlll(llllllllllllllIllIIIIllllIllIlIl, llllllllllllllIllIIIIllllIllIlll.aR.multiple()) || ap.llIIlIlIIIIIllI(llllllllllllllIllIIIIllllIllIlII)) {
            return lIllIllllllIl[0];
        }
        if (ap.llIIlIlIIIIIIll(llllllllllllllIllIIIIllllIllIlll.aR.bankLocation().g().contains(llllllllllllllIllIIIIllllIllIllI.getRegionID()) ? 1 : 0)) {
            return lIllIllllllIl[0];
        }
        if (ap.llIIlIlIIIIlIII(aQ.distanceTo(llllllllllllllIllIIIIllllIllIllI), lIllIllllllIl[3]) && ap.llIIlIlIIIIIlll(llllllllllllllIllIIIIllllIllIllI.getX(), aQ.getX())) {
            return lIllIllllllIl[0];
        }
        int[] nArray = new int[lIllIllllllIl[2]];
        nArray[ap.lIllIllllllIl[0]] = lIllIllllllIl[4];
        TileObject llllllllllllllIllIIIIllllIllIIll = TileObjects.getNearest((int[])nArray);
        if (ap.llIIlIlIIIIlIIl(llllllllllllllIllIIIIllllIllIIll)) {
            if (ap.llIIlIlIIIIlIlI(llllllllllllllIllIIIIllllIllIllI.getRegionID(), lIllIllllllIl[5])) {
                return llllllllllllllIllIIIIllllIllIlll.ak();
            }
            return lIllIllllllIl[0];
        }
        var4_6.interact(lIllIllllllII[lIllIllllllIl[0]]);
        this.sleep(lIllIllllllIl[6]);
        return lIllIllllllIl[2];
    }

    private static boolean llIIlIlIIIIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected ap(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, v v2, Client client, t t2) {
        this.aR = squireZulrahConfig;
        this.aS = squireZulrah;
        this.aT = v2;
        this.aU = client;
    }
}

