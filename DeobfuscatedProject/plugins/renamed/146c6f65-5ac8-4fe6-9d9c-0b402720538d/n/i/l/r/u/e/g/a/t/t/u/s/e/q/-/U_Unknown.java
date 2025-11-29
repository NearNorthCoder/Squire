/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.FEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.HerbType;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(priority=4, name="Making potion")
public class U_Unknown
extends n_Unknown {
    private static /* synthetic */ String[] llIIlIllIIlI;
    private final /* synthetic */ b cd;
    private static /* synthetic */ int[] llIIlIllIIll;

    private static boolean lllllIllIlllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllIllIllIlI(Object object) {
        return object != null;
    }

    private static boolean lllllIlllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean q(Item item) {
        void var2_2;
        U var23;
        if (U.lllllIllIlllll(item)) {
            return llIIlIllIIll[1];
        }
        Item var18 = Inventory.getFirst((int[])i.CRYSTAL_DUST.aB());
        if (!U.lllllIllIllIlI(var18) || U.lllllIlllIIIII(var18.getQuantity(), var23.bE() * llIIlIllIIll[8])) {
            return llIIlIllIIll[1];
        }
        var2_2.useOn(item);
        return llIIlIllIIll[2];
    }

    private static String lllllIllIlIllI(String var1, String var15) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIIlIllIIll[10]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llIIlIllIIll[3], var6);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    @Inject
    public U(c c2, b b2) {
        d[] dArray = new d[llIIlIllIIll[0]];
        dArray[U.llIIlIllIIll[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[U.llIIlIllIIll[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[U.llIIlIllIIll[3]] = d.FIRST_ROTATION_CREATE;
        dArray[U.llIIlIllIIll[4]] = d.PREPARE_BOSS_FIGHT;
        dArray[U.llIIlIllIIll[5]] = d.AFK;
        dArray[U.llIIlIllIIll[6]] = d.EXTRA_FOOD_EXPLORE;
        dArray[U.llIIlIllIIll[7]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.cd = b2;
    }

    private static boolean lllllIlllIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllIllIllllI(int n2) {
        return n2 > 0;
    }

    private boolean bF() {
        int n2;
        int n3 = this.ba.H();
        if (U.lllllIlllIIIII(i.CRYSTAL_DUST.aC(), llIIlIllIIll[8] * n3) && U.lllllIlllIIIII(Inventory.getCount(item -> e.aa.contains(item.getId())), n3)) {
            n2 = llIIlIllIIll[2];
            0;
            if (-(0xD ^ 8) >= 0) {
                return false;
            }
        } else {
            n2 = llIIlIllIIll[1];
        }
        return n2 != 0;
    }

    private static void lllllIllIllIIl() {
        llIIlIllIIll = new int[11];
        U.llIIlIllIIll[0] = 180 + 195 - 220 + 42 ^ 187 + 128 - 201 + 80;
        U.llIIlIllIIll[1] = (0xFC ^ 0xAF) & ~(0xED ^ 0xBE);
        U.llIIlIllIIll[2] = 1;
        U.llIIlIllIIll[3] = 2;
        U.llIIlIllIIll[4] = 3;
        U.llIIlIllIIll[5] = 0x2E ^ 0x2A;
        U.llIIlIllIIll[6] = 8 ^ 0x4F ^ (0x6D ^ 0x2F);
        U.llIIlIllIIll[7] = 0x2D ^ 0x23 ^ (0x1E ^ 0x16);
        U.llIIlIllIIll[8] = 22 + 57 - -28 + 46 ^ 104 + 126 - 192 + 109;
        U.llIIlIllIIll[9] = 0xA2 ^ 0xB6;
        U.llIIlIllIIll[10] = 0x92 ^ 0xB8 ^ (0xAD ^ 0x8F);
    }

    @Override
    public boolean be() {
        Item var9;
        U var19;
        Player player = Players.getLocal();
        if (!U.lllllIllIllIlI(player) || U.lllllIllIllIll(player.isMoving() ? 1 : 0) && U.lllllIllIlllII(this.ba.S() ? 1 : 0)) {
            return llIIlIllIIll[1];
        }
        if (U.lllllIllIllIll(var19.ba.S() ? 1 : 0) && U.lllllIllIlllII(var19.cd.p() ? 1 : 0)) {
            return llIIlIllIIll[1];
        }
        int var12 = Inventory.getCount(item -> e.aa.contains(item.getId()));
        int var22 = var19.ba.H() - var12;
        if (U.lllllIllIlllIl((Object)var19.ba.W(), (Object)d.EXTRA_FOOD_EXPLORE) && U.lllllIllIllIll(var22) && U.lllllIllIllllI(i.CRYSTAL_DUST.aC()) && U.lllllIllIllIlI(var9 = Inventory.getFirst((int[])i.CRYSTAL_DUST.aB()))) {
            var9.interact(llIIlIllIIlI[llIIlIllIIll[1]]);
            return llIIlIllIIll[2];
        }
        if (U.lllllIllIllIll(var19.bF() ? 1 : 0) && U.lllllIllIllIlI(var9 = Inventory.getFirst(item -> e.Y.contains(item.getId())))) {
            var9.interact(llIIlIllIIlI[llIIlIllIIll[2]]);
            return llIIlIllIIll[2];
        }
        if (U.lllllIllIllIll(var19.ba.H())) {
            return llIIlIllIIll[1];
        }
        if (U.lllllIllIlllII(var19.bG() ? 1 : 0)) {
            return llIIlIllIIll[2];
        }
        var9 = Inventory.getFirst(item -> i.HERB.aA().contains(item.getId()));
        Item var7 = Inventory.getFirst(item -> e.Z.contains(item.getId()));
        if (U.lllllIllIlllll(var9) && U.lllllIllIlllll(var7)) {
            return llIIlIllIIll[1];
        }
        if (!U.lllllIllIllIll(var19.r(var9) ? 1 : 0) || U.lllllIllIlllII(var19.q(var7) ? 1 : 0)) {
            var19.cd.e(llIIlIllIIll[4]);
            return llIIlIllIIll[2];
        }
        return llIIlIllIIll[1];
    }

    /*
     * WARNING - void declaration
     */
    private boolean r(Item item2) {
        void var2_2;
        if (U.lllllIllIlllll(item2)) {
            return llIIlIllIIll[1];
        }
        Item var13 = Inventory.getFirst(item -> f.VIAL.ac().contains(item.getId() - llIIlIllIIll[2]));
        if (U.lllllIllIlllll(var13)) {
            return llIIlIllIIll[1];
        }
        item2.useOn((Item)var2_2);
        return llIIlIllIIll[2];
    }

    static {
        U.lllllIllIllIIl();
        U.lllllIllIllIII();
    }

    private static String lllllIllIlIlll(String var10, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(llIIlIllIIll[3], var4);
            return new String(var16.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static void lllllIllIllIII() {
        llIIlIllIIlI = new String[llIIlIllIIll[3]];
        U.llIIlIllIIlI[U.llIIlIllIIll[1]] = U."Drop";
        U.llIIlIllIIlI[U.llIIlIllIIll[2]] = U."Drop";
    }

    private static boolean lllllIllIlllII(int n2) {
        return n2 != 0;
    }

    private int bE() {
        int n2 = Inventory.getCount((int[])f.VIAL.ad());
        int n3 = Inventory.getCount(item -> e.Z.contains(item.getId()));
        return n2 + n3;
    }

    private static boolean lllllIllIlllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bG() {
        void var6_6;
        void var5_5;
        U var3;
        void var2;
        int n2 = this.ba.H();
        int n3 = (n2 + llIIlIllIIll[2]) * llIIlIllIIll[9] + this.bE() * llIIlIllIIll[8];
        if (U.lllllIlllIIIII(i.CRYSTAL_SHARD.aC(), n3) && U.lllllIlllIIIIl((Object)this.ba.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            return llIIlIllIIll[1];
        }
        int var11 = Inventory.getCount(item -> e.aa.contains(item.getId()));
        void var24 = var2 - var11;
        if (U.lllllIlllIIIlI(i.CRYSTAL_DUST.aC(), (int)(var24 * llIIlIllIIll[8]))) {
            return llIIlIllIIll[1];
        }
        Item var8 = Inventory.getFirst((int[])i.CRYSTAL_SHARD.aB());
        if (!U.lllllIllIllIlI(var8) || U.lllllIlllIIIII(var8.getQuantity(), llIIlIllIIll[8] * var3.bE())) {
            return llIIlIllIIll[1];
        }
        Item var21 = Inventory.getFirst(item -> e.Y.contains(item.getId()));
        if (U.lllllIllIlllll(var21)) {
            return llIIlIllIIll[1];
        }
        var5_5.useOn((Item)var6_6);
        return llIIlIllIIll[2];
    }

    private static boolean lllllIllIllIll(int n2) {
        return n2 == 0;
    }
}

