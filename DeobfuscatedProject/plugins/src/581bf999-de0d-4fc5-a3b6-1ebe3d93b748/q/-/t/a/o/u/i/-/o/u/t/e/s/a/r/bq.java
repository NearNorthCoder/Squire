/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bm;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Doing pressure order", priority=5, blocking=true)
public class bq
extends bm {
    private static /* synthetic */ int[] llIIIIIllIl;
    private static /* synthetic */ String[] llIIIIIlIIl;
    private final /* synthetic */ Set<WorldPoint> fv;

    private static void lIIlllIIllIIII() {
        llIIIIIlIIl = new String[llIIIIIllIl[5]];
        bq.llIIIIIlIIl[bq.llIIIIIllIl[1]] = bq.lIIlllIIlIllIl("9KxeFguVug/MV7538TPGjA==", "upfgc");
        bq.llIIIIIlIIl[bq.llIIIIIllIl[0]] = bq.lIIlllIIlIlllI("GT0XOQ==", "IHdQn");
        bq.llIIIIIlIIl[bq.llIIIIIllIl[6]] = bq.lIIlllIIlIllIl("zbA7ZR/OEzCVxiTVYTGL9Q==", "BJAVK");
        bq.llIIIIIlIIl[bq.llIIIIIllIl[8]] = bq.lIIlllIIlIllll("BlIe58+e/QLL5atHY4/O+A==", "vmvxC");
        bq.llIIIIIlIIl[bq.llIIIIIllIl[9]] = bq.lIIlllIIlIlllI("Jj4AAyMJJEMIMxMkDAQ=", "gPcjF");
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[llIIIIIllIl[0]];
        nArray[bq.llIIIIIllIl[1]] = llIIIIIllIl[2];
        if (bq.lIIlllIIlllIII(TileObjects.getAll((int[])nArray).size(), llIIIIIllIl[3])) {
            bl2 = llIIIIIllIl[0];
            "".length();
            if ((0x3D ^ 0x28 ^ (0x6C ^ 0x7D)) == ((2 ^ 0x3C ^ " ".length()) & (0x61 ^ 0x5F ^ " ".length() ^ -" ".length()) & ((0xC2 ^ 0x97 ^ (0x50 ^ 8)) & (24 + 77 - 91 + 126 ^ 75 + 97 - 101 + 62 ^ -" ".length()) ^ -" ".length()))) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIIIIIllIl[1];
        }
        return bl2;
    }

    @Inject
    protected bq(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fv = new HashSet<WorldPoint>();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void llllllllllllllllIlIIIlllIllIIIlI;
        bq llllllllllllllllIlIIIlllIllIIIll;
        Queue<WorldPoint> queue = this.fh.R();
        if (!bq.lIIlllIIlllIIl(queue) || bq.lIIlllIIlllIlI(queue.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llIIIIIllIl[0]];
            stringArray[bq.llIIIIIllIl[1]] = llIIIIIlIIl[llIIIIIllIl[1]];
            TileObject llllllllllllllllIlIIIlllIllIIIIl = TileObjects.getNearest((String[])stringArray);
            if (bq.lIIlllIIlllIll(llllllllllllllllIlIIIlllIllIIIIl)) {
                return llIIIIIllIl[1];
            }
            llllllllllllllllIlIIIlllIllIIIIl.interact(llIIIIIlIIl[llIIIIIllIl[0]]);
            llllllllllllllllIlIIIlllIllIIIll.sleep(llIIIIIllIl[5]);
            return llIIIIIllIl[0];
        }
        WorldPoint llllllllllllllllIlIIIlllIllIIIIl = Players.getLocal().getWorldLocation();
        WorldPoint llllllllllllllllIlIIIlllIllIIIII = (WorldPoint)llllllllllllllllIlIIIlllIllIIIlI.peek();
        if (bq.lIIlllIIlllIIl(llllllllllllllllIlIIIlllIllIIIII) && bq.lIIlllIIlllIlI(llllllllllllllllIlIIIlllIllIIIII.equals((Object)llllllllllllllllIlIIIlllIllIIIIl) ? 1 : 0)) {
            llllllllllllllllIlIIIlllIllIIIlI.remove();
            "".length();
        }
        Object[] objectArray = new Object[llIIIIIllIl[6]];
        objectArray[bq.llIIIIIllIl[1]] = llllllllllllllllIlIIIlllIllIIIII;
        objectArray[bq.llIIIIIllIl[0]] = llllllllllllllllIlIIIlllIllIIIll.fv;
        Log.info((String)llIIIIIlIIl[llIIIIIllIl[6]], (Object[])objectArray);
        WorldArea llllllllllllllllIlIIIlllIlIlllll = llllllllllllllllIlIIIlllIllIIIIl.dx(llIIIIIllIl[7]).dy(llIIIIIllIl[7]).createWorldArea(llIIIIIllIl[8], llIIIIIllIl[8]);
        if (bq.lIIlllIIlllIlI(llllllllllllllllIlIIIlllIlIlllll.contains(llllllllllllllllIlIIIlllIllIIIII) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)llllllllllllllllIlIIIlllIllIIIII);
            "".length();
            if (-"   ".length() > 0) {
                return ((0xF ^ 0x5F) & ~(0x4C ^ 0x1C)) != 0;
            }
        } else {
            WorldPoint llllllllllllllllIlIIIlllIlIllllI = llllllllllllllllIlIIIlllIlIlllll.toWorldPointList().stream().filter(worldPoint -> {
                int[] nArray = new int[llIIIIIllIl[0]];
                nArray[bq.llIIIIIllIl[1]] = llIIIIIllIl[4];
                return TileObjects.getAll((int[])nArray).stream().noneMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint));
            }).filter(worldPoint2 -> {
                boolean bl2;
                if (bq.lIIlllIIllllII(worldPoint2.equals((Object)llllllllllllllllIlIIIlllIllIIIIl) ? 1 : 0)) {
                    bl2 = llIIIIIllIl[0];
                    "".length();
                    if ((0x12 ^ 0x16) == -" ".length()) {
                        return ((0x45 ^ 0x7E) & ~(0xC ^ 0x37)) != 0;
                    }
                } else {
                    bl2 = llIIIIIllIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(llllllllllllllllIlIIIlllIllIIIII))).orElse(null);
            Object[] objectArray2 = new Object[llIIIIIllIl[0]];
            objectArray2[bq.llIIIIIllIl[1]] = llllllllllllllllIlIIIlllIlIllllI;
            Log.info((String)llIIIIIlIIl[llIIIIIllIl[8]], (Object[])objectArray2);
            if (bq.lIIlllIIlllIIl(llllllllllllllllIlIIIlllIlIllllI)) {
                Movement.setDestination((WorldPoint)llllllllllllllllIlIIIlllIlIllllI);
            }
        }
        return llIIIIIllIl[0];
    }

    private static void lIIlllIIllIlll() {
        llIIIIIllIl = new int[11];
        bq.llIIIIIllIl[0] = " ".length();
        bq.llIIIIIllIl[1] = (0x92 ^ 0x95) & ~(0xB3 ^ 0xB4);
        bq.llIIIIIllIl[2] = 0xFFFFB7DD & 0xF93F;
        bq.llIIIIIllIl[3] = 43 + 5 - 4 + 140 ^ 117 + 56 - 158 + 162;
        bq.llIIIIIllIl[4] = -(0xFFFF89F2 & 0x7EEF) & (0xFFFFFDFF & 0xBBFD);
        bq.llIIIIIllIl[5] = 123 + 27 - 107 + 140 ^ 52 + 105 - 81 + 102;
        bq.llIIIIIllIl[6] = "  ".length();
        bq.llIIIIIllIl[7] = -" ".length();
        bq.llIIIIIllIl[8] = "   ".length();
        bq.llIIIIIllIl[9] = 0x78 ^ 0x7C;
        bq.llIIIIIllIl[10] = 0x6D ^ 0x57 ^ (0x50 ^ 0x62);
    }

    private static boolean lIIlllIIlllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIIlllIIlIllIl(String llllllllllllllllIlIIIlllIlIIIIll, String llllllllllllllllIlIIIlllIlIIIIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlllIlIIIIII.getBytes(StandardCharsets.UTF_8)), llIIIIIllIl[10]), "DES");
            Cipher llllllllllllllllIlIIIlllIlIIIlIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIIlllIlIIIlIl.init(llIIIIIllIl[6], llllllllllllllllIlIIIlllIlIIIllI);
            return new String(llllllllllllllllIlIIIlllIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlllIlIIIlII) {
            llllllllllllllllIlIIIlllIlIIIlII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bk() {
        int[] nArray = new int[llIIIIIllIl[0]];
        nArray[bq.llIIIIIllIl[1]] = llIIIIIllIl[4];
        return TileObjects.getAll((int[])nArray).stream().anyMatch(Reachable::isInteractable);
    }

    private static boolean lIIlllIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlllIIlIlllI(String llllllllllllllllIlIIIlllIIllIIll, String llllllllllllllllIlIIIlllIIllIIlI) {
        llllllllllllllllIlIIIlllIIllIIll = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIlllIIllIIIl = new StringBuilder();
        char[] llllllllllllllllIlIIIlllIIllIIII = llllllllllllllllIlIIIlllIIllIIlI.toCharArray();
        int llllllllllllllllIlIIIlllIIlIllll = llIIIIIllIl[1];
        char[] llllllllllllllllIlIIIlllIIlIlIIl = llllllllllllllllIlIIIlllIIllIIll.toCharArray();
        int llllllllllllllllIlIIIlllIIlIlIII = llllllllllllllllIlIIIlllIIlIlIIl.length;
        int llllllllllllllllIlIIIlllIIlIIlll = llIIIIIllIl[1];
        while (bq.lIIlllIIllllIl(llllllllllllllllIlIIIlllIIlIIlll, llllllllllllllllIlIIIlllIIlIlIII)) {
            char llllllllllllllllIlIIIlllIIllIlII = llllllllllllllllIlIIIlllIIlIlIIl[llllllllllllllllIlIIIlllIIlIIlll];
            llllllllllllllllIlIIIlllIIllIIIl.append((char)(llllllllllllllllIlIIIlllIIllIlII ^ llllllllllllllllIlIIIlllIIllIIII[llllllllllllllllIlIIIlllIIlIllll % llllllllllllllllIlIIIlllIIllIIII.length]));
            "".length();
            ++llllllllllllllllIlIIIlllIIlIllll;
            ++llllllllllllllllIlIIIlllIIlIIlll;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIlllIIllIIIl);
    }

    static {
        bq.lIIlllIIllIlll();
        bq.lIIlllIIllIIII();
    }

    private static boolean lIIlllIIlllIIl(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.fv.clear();
    }

    @Override
    public int bZ() {
        String[] stringArray = new String[llIIIIIllIl[0]];
        stringArray[bq.llIIIIIllIl[1]] = llIIIIIlIIl[llIIIIIllIl[9]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (bq.lIIlllIIlllIIl(tileObject)) {
            return tileObject.getWorldLocation().getX();
        }
        return llIIIIIllIl[1];
    }

    private static boolean lIIlllIIlllIll(Object object) {
        return object == null;
    }

    private static boolean lIIlllIIllllII(int n2) {
        return n2 == 0;
    }

    private static String lIIlllIIlIllll(String llllllllllllllllIlIIIlllIlIlIIII, String llllllllllllllllIlIIIlllIlIIllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlllIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlllIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIlllIlIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIlllIlIlIIlI.init(llIIIIIllIl[6], llllllllllllllllIlIIIlllIlIlIIll);
            return new String(llllllllllllllllIlIIIlllIlIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlllIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlllIlIlIIIl) {
            llllllllllllllllIlIIIlllIlIlIIIl.printStackTrace();
            return null;
        }
    }
}

