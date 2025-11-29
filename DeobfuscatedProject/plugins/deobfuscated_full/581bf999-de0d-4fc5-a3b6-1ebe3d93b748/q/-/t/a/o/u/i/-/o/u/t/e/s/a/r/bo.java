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

/* TASK: Doing match puzzle -> DoingmatchpuzzleTask */
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
        bo.llIIlIIlIIl[0] = 1;
        bo.llIIlIIlIIl[1] = (7 ^ 0x54 ^ (0x84 ^ 0x8B)) & (0x71 ^ 0x15 ^ (0x82 ^ 0xBA) ^ -1);
        bo.llIIlIIlIIl[2] = 2;
        bo.llIIlIIlIIl[3] = 3;
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

    private static String lIlIIIIIIlllII(String var2, String var13) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIIlIIlIIl[4]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIIlIIlIIl[2], var1);
            return new String(var11.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIIlllll(Object object) {
        return object == null;
    }

    private static String lIlIIIIIIllIll(String var12, String var15) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var5 = var15.toCharArray();
        int var4 = llIIlIIlIIl[1];
        char[] var9 = var12.toCharArray();
        int var3 = var9.length;
        int var10 = llIIlIIlIIl[1];
        while (bo.lIlIIIIIlIIIIl(var10, var3)) {
            char var8 = var9[var10];
            var7.append((char)(var8 ^ var5[var4 % var5.length]));
            0;
            ++var4;
            ++var10;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void lIlIIIIIIlllIl() {
        llIIlIIlIII = new String[llIIlIIlIIl[3]];
        bo.llIIlIIlIII[bo.llIIlIIlIIl[1]] = bo."Symbol";
        bo.llIIlIIlIII[bo.llIIlIIlIIl[0]] = bo."Activate";
        bo.llIIlIIlIII[bo.llIIlIIlIIl[2]] = bo."Activate";
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
            0;
            if (3 <= -1) {
                return (0x82 ^ 0xBB) & ~(0x49 ^ 0x70);
            }
        } else {
            void var6;
            n2 = var6.getWorldX();
        }
        return n2;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        if (bo.lIlIIIIIIlllll(this.cb())) {
            bl2 = llIIlIIlIIl[0];
            0;
            if (((2 ^ (0xCD ^ 0x9E)) & (0x70 ^ 0x31 ^ (0x9B ^ 0x8B) ^ -1)) == 1) {
                return false;
            }
        } else {
            bl2 = llIIlIIlIIl[1];
        }
        return bl2;
    }
}

