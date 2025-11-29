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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bm;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Doing match puzzle", priority=50, blocking=true)
public class bo
extends bm {
    private static /* synthetic */ String[] llIIlIIlIII;
    private static /* synthetic */ int[] llIIlIIlIIl;

    @Inject
    protected bo(Client client, z z2, TOAConfig tOAConfig, p p2) {
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

    private static void lIlIIIIIIllllI() {
        llIIlIIlIIl = new int[5];
        bo.llIIlIIlIIl[0] = " ".length();
        bo.llIIlIIlIIl[1] = (7 ^ 0x54 ^ (0x84 ^ 0x8B)) & (0x71 ^ 0x15 ^ (0x82 ^ 0xBA) ^ -" ".length());
        bo.llIIlIIlIIl[2] = "  ".length();
        bo.llIIlIIlIIl[3] = "   ".length();
        bo.llIIlIIlIIl[4] = 0xB7 ^ 0xBF;
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

    private static String lIlIIIIIIlllII(String llllllllllllllllIlIIIIIIIIllIIIl, String llllllllllllllllIlIIIIIIIIllIIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIIIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIIIIllIIII.getBytes(StandardCharsets.UTF_8)), llIIlIIlIIl[4]), "DES");
            Cipher llllllllllllllllIlIIIIIIIIllIIll = Cipher.getInstance("DES");
            llllllllllllllllIlIIIIIIIIllIIll.init(llIIlIIlIIl[2], llllllllllllllllIlIIIIIIIIllIlII);
            return new String(llllllllllllllllIlIIIIIIIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIIIIIIllIIlI) {
            llllllllllllllllIlIIIIIIIIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIIlllll(Object object) {
        return object == null;
    }

    private static String lIlIIIIIIllIll(String llllllllllllllllIlIIIIIIIIlIIIIl, String llllllllllllllllIlIIIIIIIIlIIIII) {
        llllllllllllllllIlIIIIIIIIlIIIIl = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIIIIIIIlllll = new StringBuilder();
        char[] llllllllllllllllIlIIIIIIIIIllllI = llllllllllllllllIlIIIIIIIIlIIIII.toCharArray();
        int llllllllllllllllIlIIIIIIIIIlllIl = llIIlIIlIIl[1];
        char[] llllllllllllllllIlIIIIIIIIIlIlll = llllllllllllllllIlIIIIIIIIlIIIIl.toCharArray();
        int llllllllllllllllIlIIIIIIIIIlIllI = llllllllllllllllIlIIIIIIIIIlIlll.length;
        int llllllllllllllllIlIIIIIIIIIlIlIl = llIIlIIlIIl[1];
        while (bo.lIlIIIIIlIIIIl(llllllllllllllllIlIIIIIIIIIlIlIl, llllllllllllllllIlIIIIIIIIIlIllI)) {
            char llllllllllllllllIlIIIIIIIIlIIIlI = llllllllllllllllIlIIIIIIIIIlIlll[llllllllllllllllIlIIIIIIIIIlIlIl];
            llllllllllllllllIlIIIIIIIIIlllll.append((char)(llllllllllllllllIlIIIIIIIIlIIIlI ^ llllllllllllllllIlIIIIIIIIIllllI[llllllllllllllllIlIIIIIIIIIlllIl % llllllllllllllllIlIIIIIIIIIllllI.length]));
            "".length();
            ++llllllllllllllllIlIIIIIIIIIlllIl;
            ++llllllllllllllllIlIIIIIIIIIlIlIl;
            "".length();
            if (-"   ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIIIIIIIlllll);
    }

    private static void lIlIIIIIIlllIl() {
        llIIlIIlIII = new String[llIIlIIlIIl[3]];
        bo.llIIlIIlIII[bo.llIIlIIlIIl[1]] = bo.lIlIIIIIIllIll("Ji0eAToZ", "uTscU");
        bo.llIIlIIlIII[bo.llIIlIIlIIl[0]] = bo.lIlIIIIIIlllII("8fTVBhe0+2uonroJ/XltBw==", "NHrAR");
        bo.llIIlIIlIII[bo.llIIlIIlIIl[2]] = bo.lIlIIIIIIllIll("DCAwKjUsNyE=", "MCDCC");
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
            "".length();
            if ("   ".length() <= -" ".length()) {
                return (0x82 ^ 0xBB) & ~(0x49 ^ 0x70);
            }
        } else {
            void llllllllllllllllIlIIIIIIIIllllIl;
            n2 = llllllllllllllllIlIIIIIIIIllllIl.getWorldX();
        }
        return n2;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        if (bo.lIlIIIIIIlllll(this.cb())) {
            bl2 = llIIlIIlIIl[0];
            "".length();
            if ((("  ".length() ^ (0xCD ^ 0x9E)) & (0x70 ^ 0x31 ^ (0x9B ^ 0x8B) ^ -" ".length())) == " ".length()) {
                return ((213 + 223 - 414 + 219 ^ 58 + 110 - 133 + 150) & (48 + 162 - 32 + 35 ^ 37 + 48 - 76 + 148 ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIIlIIlIIl[1];
        }
        return bl2;
    }
}

