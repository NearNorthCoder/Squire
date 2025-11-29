/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bm;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Progress Puzzle")
public class bt
extends bm {
    private static /* synthetic */ String[] llIlIlIlIlI;
    private static /* synthetic */ int[] llIlIlIlIll;

    private static boolean lIlIIlllIIIlll(Object object) {
        return object != null;
    }

    @Inject
    protected bt(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
    }

    private static String lIlIIllIlllllI(String llllllllllllllllIIllIIllIIlIllIl, String llllllllllllllllIIllIIllIIlIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIllIIllIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIllIIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIllIIllIIIl.init(llIlIlIlIll[3], llllllllllllllllIIllIIllIIllIIlI);
            return new String(llllllllllllllllIIllIIllIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIllIIllIIII) {
            llllllllllllllllIIllIIllIIllIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlllIIIIII(String llllllllllllllllIIllIIllIIlIIIlI, String llllllllllllllllIIllIIllIIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIllIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIlIlIll[7]), "DES");
            Cipher llllllllllllllllIIllIIllIIlIIlII = Cipher.getInstance("DES");
            llllllllllllllllIIllIIllIIlIIlII.init(llIlIlIlIll[3], llllllllllllllllIIllIIllIIlIIlIl);
            return new String(llllllllllllllllIIllIIllIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIllIIlIIIll) {
            llllllllllllllllIIllIIllIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlllIIIIIl() {
        llIlIlIlIlI = new String[llIlIlIlIll[4]];
        bt.llIlIlIlIlI[bt.llIlIlIlIll[1]] = bt."Barrier";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[0]] = bt."Crawl-through";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[3]] = bt."Platform";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[2]] = bt."Jump-to";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[5]] = bt."Quick-pass";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[6]] = bt."Passage";
    }

    private static boolean lIlIIlllIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void llllllllllllllllIIllIIllIIlllIlI;
        bt llllllllllllllllIIllIIllIIlllIll;
        String[] stringArray = new String[llIlIlIlIll[0]];
        stringArray[bt.llIlIlIlIll[1]] = llIlIlIlIlI[llIlIlIlIll[1]];
        TileObject tileObject2 = TileObjects.getNearest((String[])stringArray);
        if (bt.lIlIIlllIIIIll(tileObject2)) {
            return llIlIlIlIll[1];
        }
        int llllllllllllllllIIllIIllIIlllIIl = llllllllllllllllIIllIIllIIlllIll.cu.getLocalPlayer().getWorldX();
        if (bt.lIlIIlllIIIlII(llllllllllllllllIIllIIllIIlllIlI.getWorldX(), llllllllllllllllIIllIIllIIlllIIl)) {
            if (bt.lIlIIlllIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlIlIlIll[1];
            }
            if (bt.lIlIIlllIIIllI(llllllllllllllllIIllIIllIIlllIIl, llllllllllllllllIIllIIllIIlllIll.fh.Z())) {
                return llIlIlIlIll[1];
            }
            TileObject llllllllllllllllIIllIIllIIlllIII = TileObjects.getNearest(tileObject -> tileObject.getName().equals(llIlIlIlIlI[llIlIlIlIll[6]]));
            if (bt.lIlIIlllIIIlll(llllllllllllllllIIllIIllIIlllIII) && bt.lIlIIlllIIlIII(Math.abs(llllllllllllllllIIllIIllIIlllIII.getWorldX() - llllllllllllllllIIllIIllIIlllIll.fh.Z()), llIlIlIlIll[2])) {
                llllllllllllllllIIllIIllIIlllIII.interact(llIlIlIlIlI[llIlIlIlIll[0]]);
                return llIlIlIlIll[0];
            }
            String[] stringArray2 = new String[llIlIlIlIll[0]];
            stringArray2[bt.llIlIlIlIll[1]] = llIlIlIlIlI[llIlIlIlIll[3]];
            TileObject llllllllllllllllIIllIIllIIllIlll = TileObjects.getNearest((String[])stringArray2);
            if (bt.lIlIIlllIIIlll(llllllllllllllllIIllIIllIIllIlll) && bt.lIlIIlllIIIlII(llllllllllllllllIIllIIllIIllIlll.getWorldX(), llllllllllllllllIIllIIllIIlllIll.fh.Z()) && bt.lIlIIlllIIlIII(Math.abs(llllllllllllllllIIllIIllIIllIlll.getWorldX() - llllllllllllllllIIllIIllIIlllIll.fh.Z()), llIlIlIlIll[4])) {
                llllllllllllllllIIllIIllIIllIlll.interact(llIlIlIlIlI[llIlIlIlIll[2]]);
                return llIlIlIlIll[0];
            }
            return llIlIlIlIll[1];
        }
        tileObject2.interact(llIlIlIlIlI[llIlIlIlIll[5]]);
        return llIlIlIlIll[0];
    }

    private static boolean lIlIIlllIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlllIIIIll(Object object) {
        return object == null;
    }

    private static void lIlIIlllIIIIlI() {
        llIlIlIlIll = new int[8];
        bt.llIlIlIlIll[0] = 1;
        bt.llIlIlIlIll[1] = (0x87 ^ 0x82) & ~(0xC ^ 9);
        bt.llIlIlIlIll[2] = 3;
        bt.llIlIlIlIll[3] = 2;
        bt.llIlIlIlIll[4] = 35 + 53 - -49 + 0 ^ 37 + 73 - -11 + 22;
        bt.llIlIlIlIll[5] = 0xA6 ^ 0xA2;
        bt.llIlIlIlIll[6] = 0x37 ^ 0x32;
        bt.llIlIlIlIll[7] = 15 + 57 - -29 + 32 ^ 51 + 80 - 3 + 13;
    }

    private static String lIlIIllIllllll(String llllllllllllllllIIllIIllIIIlIIlI, String llllllllllllllllIIllIIllIIIlIIIl) {
        llllllllllllllllIIllIIllIIIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIllIIIlIIII = new StringBuilder();
        char[] llllllllllllllllIIllIIllIIIIllll = llllllllllllllllIIllIIllIIIlIIIl.toCharArray();
        int llllllllllllllllIIllIIllIIIIlllI = llIlIlIlIll[1];
        char[] llllllllllllllllIIllIIllIIIIlIII = llllllllllllllllIIllIIllIIIlIIlI.toCharArray();
        int llllllllllllllllIIllIIllIIIIIlll = llllllllllllllllIIllIIllIIIIlIII.length;
        int llllllllllllllllIIllIIllIIIIIllI = llIlIlIlIll[1];
        while (bt.lIlIIlllIIIlII(llllllllllllllllIIllIIllIIIIIllI, llllllllllllllllIIllIIllIIIIIlll)) {
            char llllllllllllllllIIllIIllIIIlIIll = llllllllllllllllIIllIIllIIIIlIII[llllllllllllllllIIllIIllIIIIIllI];
            llllllllllllllllIIllIIllIIIlIIII.append((char)(llllllllllllllllIIllIIllIIIlIIll ^ llllllllllllllllIIllIIllIIIIllll[llllllllllllllllIIllIIllIIIIlllI % llllllllllllllllIIllIIllIIIIllll.length]));
            0;
            ++llllllllllllllllIIllIIllIIIIlllI;
            ++llllllllllllllllIIllIIllIIIIIllI;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIllIIIlIIII);
    }

    private static boolean lIlIIlllIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        bt.lIlIIlllIIIIlI();
        bt.lIlIIlllIIIIIl();
    }

    @Override
    public int bZ() {
        return this.fh.Z() + llIlIlIlIll[0];
    }
}

