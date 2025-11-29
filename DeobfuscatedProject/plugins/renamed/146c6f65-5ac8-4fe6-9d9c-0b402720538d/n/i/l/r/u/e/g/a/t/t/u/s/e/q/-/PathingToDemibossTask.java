/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.GEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Pathing to Demiboss -> PathingtodemibossTask */
@TaskDesc(name="Pathing to Demiboss", priority=1)
public class PathingToDemibossTask
extends n_Unknown {
    private static /* synthetic */ String[] llIlIIlIIIIl;
    private final /* synthetic */ c bU;
    private static /* synthetic */ int[] llIlIIlIIIlI;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var5_6;
        I var21;
        Player player = Players.getLocal();
        if (!I.lIIIIIIllIlIlII(player) || I.lIIIIIIllIlIlII(player.getInteracting())) {
            return llIlIIlIIIlI[1];
        }
        if (I.lIIIIIIllIlIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return llIlIIlIIIlI[1];
        }
        g var2 = var21.bU.J();
        if (I.lIIIIIIllIlIllI((Object)var2)) {
            return llIlIIlIIIlI[1];
        }
        if (I.lIIIIIIllIlIlll(Inventory.getCount((boolean)llIlIIlIIIlI[0], (int[])var2.an().aB()))) {
            return llIlIIlIIIlI[1];
        }
        h var7 = var21.bU.V();
        if (I.lIIIIIIllIlIllI(var7)) {
            Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[1]]);
            return llIlIIlIIIlI[1];
        }
        List<l> var17 = var7.b(l2 -> {
            boolean bl;
            if (I.lIIIIIIllIllIIl((Object)l2.aZ(), (Object)var2)) {
                bl = llIlIIlIIIlI[0];
                0;
                if (((0xFA ^ 0xB3 ^ (0x3F ^ 0x64)) & (43 + 156 - 77 + 61 ^ 57 + 99 - 17 + 26 ^ -1)) > 0) {
                    return ((0x9E ^ 0xC0 ^ 3) & (0x53 ^ 7 ^ (0xB8 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                bl = llIlIIlIIIlI[1];
            }
            return bl;
        });
        if (I.lIIIIIIllIlIlIl(var17.isEmpty() ? 1 : 0)) {
            void var10;
            l var18 = var17.get(llIlIIlIIIlI[1]);
            if (I.lIIIIIIllIlIlIl(var18.e(var10.getWorldLocation()) ? 1 : 0)) {
                if (I.lIIIIIIllIlIlll(I.lIIIIIIllIlIIll(var18.aQ().distanceTo((Locatable)var10), 1.5 * (double)var18.aQ().distanceTo(var7.av().aQ())))) {
                    Item var4 = Inventory.getFirst(item -> e.ab.contains(item.getId()));
                    if (I.lIIIIIIllIlIlII(var4)) {
                        var4.interact(llIlIIlIIIIl[llIlIIlIIIlI[0]]);
                        0;
                        if ((0x10 ^ 0x42 ^ (0x58 ^ 0xE)) == 3) {
                            return ((0xC8 ^ 0xBE ^ (0xB9 ^ 0x8B)) & (130 + 125 - 39 + 16 ^ 133 + 17 - 103 + 125 ^ -1)) != 0;
                        }
                    } else {
                        var21.bU.a((l)var7.av(), var10.getWorldLocation());
                        0;
                    }
                    0;
                    
                    }
                } else {
                    var21.bU.a(var18, var10.getWorldLocation());
                    0;
                }
                return llIlIIlIIIlI[0];
            }
            return llIlIIlIIIlI[1];
        }
        List<l> var18 = var7.b(l2 -> {
            int n2;
            if (I.lIIIIIIllIlIlIl(l2.aY() ? 1 : 0) && I.lIIIIIIllIllIII(l2.aS() ? 1 : 0)) {
                n2 = llIlIIlIIIlI[0];
                0;
                if (2 == (0x64 ^ 0x3B ^ (0x5A ^ 1))) {
                    return ((0xE9 ^ 0xBE ^ (0x65 ^ 0x69)) & (0x78 ^ 0x69 ^ (0x16 ^ 0x5C) ^ -1)) != 0;
                }
            } else {
                n2 = llIlIIlIIIlI[1];
            }
            return n2 != 0;
        });
        if (I.lIIIIIIllIllIII(var18.isEmpty() ? 1 : 0)) {
            Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[2]]);
            return llIlIIlIIIlI[1];
        }
        var5_6.sort(Comparator.comparingInt(l2 -> l2.aW().distanceTo(player.getWorldLocation())));
        l l3 = (l)var5_6.get(llIlIIlIIIlI[1]);
        Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[3]]);
        return this.bU.a(l3, player.getWorldLocation());
    }

    private static void lIIIIIIllIlIIIl() {
        llIlIIlIIIIl = new String[llIlIIlIIIlI[4]];
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[1]] = I."Gauntlet Map is null";
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[0]] = I."Activate";
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[2]] = I."Potentials are empty";
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[3]] = I."Pathing to best potential room";
    }

    private static boolean lIIIIIIllIlIlll(int n2) {
        return n2 > 0;
    }

    private static void lIIIIIIllIlIIlI() {
        llIlIIlIIIlI = new int[5];
        I.llIlIIlIIIlI[0] = 1;
        I.llIlIIlIIIlI[1] = (0x52 ^ 0x7B) & ~(0x32 ^ 0x1B);
        I.llIlIIlIIIlI[2] = 2;
        I.llIlIIlIIIlI[3] = 3;
        I.llIlIIlIIIlI[4] = 4 ^ 0;
    }

    private static boolean lIIIIIIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIllIlIlIl(int n2) {
        return n2 == 0;
    }

    static {
        I.lIIIIIIllIlIIlI();
        I.lIIIIIIllIlIIIl();
    }

    private static boolean lIIIIIIllIlIllI(Object object) {
        return object == null;
    }

    @Inject
    public I(c c2) {
        d[] dArray = new d[llIlIIlIIIlI[0]];
        dArray[I.llIlIIlIIIlI[1]] = d.DEMI_BOSS_EXPLORE;
        super(c2, dArray);
        this.bU = c2;
    }

    private static String lIIIIIIllIIIIll(String var5, String var11) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var8 = var11.toCharArray();
        int var9 = llIlIIlIIIlI[1];
        char[] var6 = var5.toCharArray();
        int var20 = var6.length;
        int var3 = llIlIIlIIIlI[1];
        while (I.lIIIIIIllIllIlI(var3, var20)) {
            char var13 = var6[var3];
            var15.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var3;
            0;
            if (-(0x5D ^ 0x58) < 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean lIIIIIIllIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIllIlIlII(Object object) {
        return object != null;
    }

    private static String lIIIIIIllIIIIlI(String var16, String var12) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIlIIlIIIlI[2], var19);
            return new String(var14.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIllIllIII(int n2) {
        return n2 != 0;
    }

    private static int lIIIIIIllIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }
}

