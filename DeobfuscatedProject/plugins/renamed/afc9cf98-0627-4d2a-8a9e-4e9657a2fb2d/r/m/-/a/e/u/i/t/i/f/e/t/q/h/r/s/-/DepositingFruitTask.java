/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i_Unknown;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

/* TASK: Depositing fruit -> DepositingfruitTask */
@TaskDesc(name="Depositing fruit", priority=1000, blocking=true)
public class DepositingFruitTask
extends r {
    private final /* synthetic */ SquireTitheConfig N;
    private static /* synthetic */ int[] lIlIIIIIlIIII;
    private /* synthetic */ boolean P;
    private final /* synthetic */ Client O;
    private static /* synthetic */ String[] lIlIIIIIIlllI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_5;
        Object var1;
        m var19;
        void var5;
        String string = this.N.fruit().i().j() + " fruit";
        String[] stringArray = new String[lIlIIIIIlIIII[0]];
        stringArray[m.lIlIIIIIlIIII[1]] = string;
        int n2 = Inventory.getCount((boolean)lIlIIIIIlIIII[0], (String[])stringArray);
        if (m.lIllIllIllIIIIl(n2, this.N.depositFruitAt())) {
            this.P = lIlIIIIIlIIII[0];
            0;
            
            }
        } else if (m.lIllIllIllIIIlI((int)var5, lIlIIIIIlIIII[2])) {
            var19.P = lIlIIIIIlIIII[1];
        }
        if (m.lIllIllIllIIIll(var19.P ? 1 : 0) && (!m.lIllIllIllIIlII(var1 = Inventory.getFirst(item -> item.getName().endsWith(lIlIIIIIIlllI[lIlIIIIIlIIII[5]]))) || !m.lIllIllIllIIlIl(var19.N.fruit().a((Item)var1) ? 1 : 0) || m.lIllIllIllIIIll((int)var5))) {
            return lIlIIIIIlIIII[1];
        }
        if (m.lIllIllIllIIllI(var19.Z.u(), var19.Z.t()) && m.lIllIllIllIIlIl(var19.O.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlIIII[1];
        }
        var1 = Inventory.getAll(item -> item.getName().contains(lIlIIIIIIlllI[lIlIIIIIlIIII[4]]));
        if (m.lIllIllIllIIlll(var1.size())) {
            Iterator var8 = var1.iterator();
            while (m.lIllIllIllIIlIl(var8.hasNext() ? 1 : 0)) {
                Item var22 = (Item)var8.next();
                var22.interact(lIlIIIIIIlllI[lIlIIIIIlIIII[1]]);
                0;
                if (-1 < 0) continue;
                return false;
            }
            return lIlIIIIIlIIII[0];
        }
        String[] stringArray2 = new String[lIlIIIIIlIIII[0]];
        stringArray2[m.lIlIIIIIlIIII[1]] = lIlIIIIIIlllI[lIlIIIIIlIIII[0]];
        TileObject var8 = TileObjects.getNearest((String[])stringArray2);
        if (m.lIllIllIllIlIII(var8)) {
            return lIlIIIIIlIIII[1];
        }
        var4_5.interact(lIlIIIIIIlllI[lIlIIIIIlIIII[3]]);
        return lIlIIIIIlIIII[0];
    }

    private static String lIllIllIlIlllII(String var17, String var7) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIII[7]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIIIIIlIIII[3], var16);
            return new String(var2.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIllIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIllIllIIlll(int n2) {
        return n2 > 0;
    }

    @Inject
    protected m(i i2, SquireTitheConfig squireTitheConfig, Client client) {
        super(i2);
        this.N = squireTitheConfig;
        this.O = client;
    }

    private static void lIllIllIllIIIII() {
        lIlIIIIIlIIII = new int[8];
        m.lIlIIIIIlIIII[0] = 1;
        m.lIlIIIIIlIIII[1] = (0x15 ^ 0x12) & ~(0x32 ^ 0x35);
        m.lIlIIIIIlIIII[2] = 0xB ^ 0x6F;
        m.lIlIIIIIlIIII[3] = 2;
        m.lIlIIIIIlIIII[4] = 3;
        m.lIlIIIIIlIIII[5] = 7 ^ 3;
        m.lIlIIIIIlIIII[6] = 0x7F ^ 0x7A;
        m.lIlIIIIIlIIII[7] = 0x3C ^ 0x34;
    }

    private static boolean lIllIllIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        m.lIllIllIllIIIII();
        m.lIllIllIlIllllI();
    }

    private static boolean lIllIllIllIIIll(int n2) {
        return n2 == 0;
    }

    private static String lIllIllIlIlllIl(String var14, String var6) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var9 = var6.toCharArray();
        int var21 = lIlIIIIIlIIII[1];
        char[] var12 = var14.toCharArray();
        int var13 = var12.length;
        int var23 = lIlIIIIIlIIII[1];
        while (m.lIllIllIllIIIlI(var23, var13)) {
            char var15 = var12[var23];
            var4.append((char)(var15 ^ var9[var21 % var9.length]));
            0;
            ++var21;
            ++var23;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static String lIllIllIlIllIll(String var18, String var24) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIlIIIIIlIIII[3], var11);
            return new String(var10.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIllIIlII(Object object) {
        return object != null;
    }

    private static void lIllIllIlIllllI() {
        lIlIIIIIIlllI = new String[lIlIIIIIlIIII[6]];
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[1]] = m."Wear";
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[0]] = m."Sack";
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[3]] = m."Deposit";
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[4]] = m."Farmer's";
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[5]] = m."seed";
    }

    private static boolean lIllIllIllIlIII(Object object) {
        return object == null;
    }
}

