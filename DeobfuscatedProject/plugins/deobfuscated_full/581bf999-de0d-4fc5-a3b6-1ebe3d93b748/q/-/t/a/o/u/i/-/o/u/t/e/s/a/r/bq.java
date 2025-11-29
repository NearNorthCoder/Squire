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

/* TASK: Doing pressure order -> DoingpressureorderTask */
@TaskDesc(name="Doing pressure order", priority=5, blocking=true)
public class bq
extends bm {
    private static /* synthetic */ int[] llIIIIIllIl;
    private static /* synthetic */ String[] llIIIIIlIIl;
    private final /* synthetic */ Set<WorldPoint> fv;

    private static void lIIlllIIllIIII() {
        llIIIIIlIIl = new String[llIIIIIllIl[5]];
        bq.llIIIIIlIIl[bq.llIIIIIllIl[1]] = bq."Ancient button";
        bq.llIIIIIlIIl[bq.llIIIIIllIl[0]] = bq."Push";
        bq.llIIIIIlIIl[bq.llIIIIIllIl[6]] = bq."Next: %s, %s";
        bq.llIIIIIlIIl[bq.llIIIIIllIl[8]] = bq."Closest: %s";
        bq.llIIIIIlIIl[bq.llIIIIIllIl[9]] = bq."Ancient button";
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[llIIIIIllIl[0]];
        nArray[bq.llIIIIIllIl[1]] = llIIIIIllIl[2];
        if (bq.lIIlllIIlllIII(TileObjects.getAll((int[])nArray).size(), llIIIIIllIl[3])) {
            bl2 = llIIIIIllIl[0];
            0;
            if ((0x3D ^ 0x28 ^ (0x6C ^ 0x7D)) == ((2 ^ 0x3C ^ 1) & (0x61 ^ 0x5F ^ 1 ^ -1) & ((0xC2 ^ 0x97 ^ (0x50 ^ 8)) & (24 + 77 - 91 + 126 ^ 75 + 97 - 101 + 62 ^ -1) ^ -1))) {
                return (2 & (2 ^ -1)) != 0;
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
        void var11;
        bq var8;
        Queue<WorldPoint> queue = this.fh.R();
        if (!bq.lIIlllIIlllIIl(queue) || bq.lIIlllIIlllIlI(queue.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llIIIIIllIl[0]];
            stringArray[bq.llIIIIIllIl[1]] = llIIIIIlIIl[llIIIIIllIl[1]];
            TileObject var25 = TileObjects.getNearest((String[])stringArray);
            if (bq.lIIlllIIlllIll(var25)) {
                return llIIIIIllIl[1];
            }
            var25.interact(llIIIIIlIIl[llIIIIIllIl[0]]);
            var8.sleep(llIIIIIllIl[5]);
            return llIIIIIllIl[0];
        }
        WorldPoint var25 = Players.getLocal().getWorldLocation();
        WorldPoint var7 = (WorldPoint)var11.peek();
        if (bq.lIIlllIIlllIIl(var7) && bq.lIIlllIIlllIlI(var7.equals((Object)var25) ? 1 : 0)) {
            var11.remove();
            0;
        }
        Object[] objectArray = new Object[llIIIIIllIl[6]];
        objectArray[bq.llIIIIIllIl[1]] = var7;
        objectArray[bq.llIIIIIllIl[0]] = var8.fv;
        Log.info((String)llIIIIIlIIl[llIIIIIllIl[6]], (Object[])objectArray);
        WorldArea var17 = var25.dx(llIIIIIllIl[7]).dy(llIIIIIllIl[7]).createWorldArea(llIIIIIllIl[8], llIIIIIllIl[8]);
        if (bq.lIIlllIIlllIlI(var17.contains(var7) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var7);
            0;
            if (-3 > 0) {
                return false;
            }
        } else {
            WorldPoint var10 = var17.toWorldPointList().stream().filter(worldPoint -> {
                int[] nArray = new int[llIIIIIllIl[0]];
                nArray[bq.llIIIIIllIl[1]] = llIIIIIllIl[4];
                return TileObjects.getAll((int[])nArray).stream().noneMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint));
            }).filter(worldPoint2 -> {
                boolean bl2;
                if (bq.lIIlllIIllllII(worldPoint2.equals((Object)var25) ? 1 : 0)) {
                    bl2 = llIIIIIllIl[0];
                    0;
                    if ((0x12 ^ 0x16) == -1) {
                        return false;
                    }
                } else {
                    bl2 = llIIIIIllIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var7))).orElse(null);
            Object[] objectArray2 = new Object[llIIIIIllIl[0]];
            objectArray2[bq.llIIIIIllIl[1]] = var10;
            Log.info((String)llIIIIIlIIl[llIIIIIllIl[8]], (Object[])objectArray2);
            if (bq.lIIlllIIlllIIl(var10)) {
                Movement.setDestination((WorldPoint)var10);
            }
        }
        return llIIIIIllIl[0];
    }

    private static void lIIlllIIllIlll() {
        llIIIIIllIl = new int[11];
        bq.llIIIIIllIl[0] = 1;
        bq.llIIIIIllIl[1] = (0x92 ^ 0x95) & ~(0xB3 ^ 0xB4);
        bq.llIIIIIllIl[2] = 0xFFFFB7DD & 0xF93F;
        bq.llIIIIIllIl[3] = 43 + 5 - 4 + 140 ^ 117 + 56 - 158 + 162;
        bq.llIIIIIllIl[4] = -(0xFFFF89F2 & 0x7EEF) & (0xFFFFFDFF & 0xBBFD);
        bq.llIIIIIllIl[5] = 123 + 27 - 107 + 140 ^ 52 + 105 - 81 + 102;
        bq.llIIIIIllIl[6] = 2;
        bq.llIIIIIllIl[7] = -1;
        bq.llIIIIIllIl[8] = 3;
        bq.llIIIIIllIl[9] = 0x78 ^ 0x7C;
        bq.llIIIIIllIl[10] = 0x6D ^ 0x57 ^ (0x50 ^ 0x62);
    }

    private static boolean lIIlllIIlllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIIlllIIlIllIl(String var6, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llIIIIIllIl[10]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIIIIIllIl[6], var2);
            return new String(var5.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
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

    private static String lIIlllIIlIlllI(String var22, String var16) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var23 = var16.toCharArray();
        int var9 = llIIIIIllIl[1];
        char[] var14 = var22.toCharArray();
        int var3 = var14.length;
        int var15 = llIIIIIllIl[1];
        while (bq.lIIlllIIllllIl(var15, var3)) {
            char var12 = var14[var15];
            var18.append((char)(var12 ^ var23[var9 % var23.length]));
            0;
            ++var9;
            ++var15;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var18);
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

    private static String lIIlllIIlIllll(String var19, String var21) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llIIIIIllIl[6], var4);
            return new String(var13.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}

