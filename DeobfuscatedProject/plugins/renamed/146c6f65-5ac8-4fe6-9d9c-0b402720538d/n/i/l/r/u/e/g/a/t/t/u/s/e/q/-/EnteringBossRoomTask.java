/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Entering boss room -> EnteringbossroomTask */
@TaskDesc(name="Entering boss room", priority=1)
public class EnteringBossRoomTask
extends n_Unknown {
    private static /* synthetic */ int[] llIIlIlllIIl;
    private static /* synthetic */ String[] llIIlIlllIII;

    static {
        w.lllllIlllllllI();
        w.lllllIllllllIl();
    }

    private static boolean llllllIIIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllIIIIIIlI(Object object) {
        return object != null;
    }

    private static void lllllIlllllllI() {
        llIIlIlllIIl = new int[7];
        w.llIIlIlllIIl[0] = 1;
        w.llIIlIlllIIl[1] = (173 + 108 - 63 + 21 ^ 32 + 146 - 98 + 102) & (174 + 70 - 72 + 56 ^ 171 + 17 - 21 + 22 ^ -1);
        w.llIIlIlllIIl[2] = -(0xFFFFE1AF & 0x3ED9) & (0xFFFFFFDE & 0x7DEB);
        w.llIIlIlllIIl[3] = 0x3E ^ 0x73 ^ (0x28 ^ 0x60);
        w.llIIlIlllIIl[4] = 2;
        w.llIIlIlllIIl[5] = 3;
        w.llIIlIlllIIl[6] = 34 + 134 - 75 + 45 ^ 35 + 60 - -10 + 25;
    }

    @Inject
    public w(c c2) {
        d[] dArray = new d[llIIlIlllIIl[0]];
        dArray[w.llIIlIlllIIl[1]] = d.AFK;
        super(c2, dArray);
    }

    private static boolean lllllIllllllll(int n2) {
        return n2 == 0;
    }

    private static String lllllIlllllIll(String var7, String var20) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), llIIlIlllIIl[6]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llIIlIlllIIl[4], var15);
            return new String(var1.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIIIIIl(Object object) {
        return object == null;
    }

    private static void lllllIllllllIl() {
        llIIlIlllIII = new String[llIIlIlllIIl[5]];
        w.llIIlIlllIII[w.llIIlIlllIIl[1]] = w."Quick-exit";
        w.llIIlIlllIII[w.llIIlIlllIIl[0]] = w."Waiting for Hunleff to move away from the entrance";
        w.llIIlIlllIII[w.llIIlIlllIIl[4]] = w."Quick-pass";
    }

    private static boolean llllllIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllllIllllllII(String var4, String var16) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(llIIlIlllIIl[4], var12);
            return new String(var22.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lllllIlllllIlI(String var23, String var17) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var8 = var17.toCharArray();
        int var9 = llIIlIlllIIl[1];
        char[] var10 = var23.toCharArray();
        int var2 = var10.length;
        int var6 = llIIlIlllIIl[1];
        while (w.llllllIIIIIlII(var6, var2)) {
            char var21 = var10[var6];
            var5.append((char)(var21 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var6;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_3;
        w var18;
        if (w.lllllIllllllll(this.ba.h().enterBossRoom() ? 1 : 0)) {
            return llIIlIlllIIl[1];
        }
        int[] nArray = new int[llIIlIlllIIl[0]];
        nArray[w.llIIlIlllIIl[1]] = llIIlIlllIIl[2];
        int var3 = Inventory.getCount((int[])nArray);
        if (w.llllllIIIIIIII(var3, var18.ba.h().abortFishAmount())) {
            TileObject var24 = TileObjects.getNearest(tileObject -> e.ac.contains(tileObject.getId()));
            if (w.llllllIIIIIIIl(var24)) {
                return llIIlIlllIIl[1];
            }
            var24.interact(llIIlIlllIII[llIIlIlllIIl[1]]);
            return llIIlIlllIIl[0];
        }
        TileObject var24 = TileObjects.getNearest(tileObject -> e.aF.contains(tileObject.getId()));
        if (w.llllllIIIIIIIl(var24)) {
            return llIIlIlllIIl[1];
        }
        NPC var11 = var18.ba.X().aI();
        if (!w.llllllIIIIIIlI(var11) || w.llllllIIIIIIll(var24.distanceTo((Locatable)Players.getLocal()), llIIlIlllIIl[3])) {
            ScenePoint var13 = ScenePoint.fromWorld((WorldPoint)var24.getWorldLocation());
            Movement.setDestination((int)var13.getX(), (int)var13.getY());
            return llIIlIlllIIl[0];
        }
        if (w.llllllIIIIIIII(var11.getWorldArea().distanceTo(var24.getWorldLocation()), llIIlIlllIIl[0])) {
            Log.info((String)llIIlIlllIII[llIIlIlllIIl[0]]);
            return llIIlIlllIIl[0];
        }
        var2_3.interact(llIIlIlllIII[llIIlIlllIIl[4]]);
        return llIIlIlllIIl[0];
    }
}

