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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

@TaskDesc(name="Depositing fruit", priority=1000, blocking=true)
public class m
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
        Object llllllllllllllIlllIIlIIlIIlIlIlI;
        m llllllllllllllIlllIIlIIlIIlIllIl;
        void llllllllllllllIlllIIlIIlIIlIlIll;
        String string = this.N.fruit().i().j() + " fruit";
        String[] stringArray = new String[lIlIIIIIlIIII[0]];
        stringArray[m.lIlIIIIIlIIII[1]] = string;
        int n2 = Inventory.getCount((boolean)lIlIIIIIlIIII[0], (String[])stringArray);
        if (m.lIllIllIllIIIIl(n2, this.N.depositFruitAt())) {
            this.P = lIlIIIIIlIIII[0];
            0;
            if (null != null) {
                return ((0x5E ^ 0x62) & ~(0xB2 ^ 0x8E)) != 0;
            }
        } else if (m.lIllIllIllIIIlI((int)llllllllllllllIlllIIlIIlIIlIlIll, lIlIIIIIlIIII[2])) {
            llllllllllllllIlllIIlIIlIIlIllIl.P = lIlIIIIIlIIII[1];
        }
        if (m.lIllIllIllIIIll(llllllllllllllIlllIIlIIlIIlIllIl.P ? 1 : 0) && (!m.lIllIllIllIIlII(llllllllllllllIlllIIlIIlIIlIlIlI = Inventory.getFirst(item -> item.getName().endsWith(lIlIIIIIIlllI[lIlIIIIIlIIII[5]]))) || !m.lIllIllIllIIlIl(llllllllllllllIlllIIlIIlIIlIllIl.N.fruit().a((Item)llllllllllllllIlllIIlIIlIIlIlIlI) ? 1 : 0) || m.lIllIllIllIIIll((int)llllllllllllllIlllIIlIIlIIlIlIll))) {
            return lIlIIIIIlIIII[1];
        }
        if (m.lIllIllIllIIllI(llllllllllllllIlllIIlIIlIIlIllIl.Z.u(), llllllllllllllIlllIIlIIlIIlIllIl.Z.t()) && m.lIllIllIllIIlIl(llllllllllllllIlllIIlIIlIIlIllIl.O.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlIIII[1];
        }
        llllllllllllllIlllIIlIIlIIlIlIlI = Inventory.getAll(item -> item.getName().contains(lIlIIIIIIlllI[lIlIIIIIlIIII[4]]));
        if (m.lIllIllIllIIlll(llllllllllllllIlllIIlIIlIIlIlIlI.size())) {
            Iterator llllllllllllllIlllIIlIIlIIlIlIIl = llllllllllllllIlllIIlIIlIIlIlIlI.iterator();
            while (m.lIllIllIllIIlIl(llllllllllllllIlllIIlIIlIIlIlIIl.hasNext() ? 1 : 0)) {
                Item llllllllllllllIlllIIlIIlIIlIlIII = (Item)llllllllllllllIlllIIlIIlIIlIlIIl.next();
                llllllllllllllIlllIIlIIlIIlIlIII.interact(lIlIIIIIIlllI[lIlIIIIIlIIII[1]]);
                0;
                if (-1 < 0) continue;
                return ((0x5E ^ 0x73) & ~(0xB9 ^ 0x94)) != 0;
            }
            return lIlIIIIIlIIII[0];
        }
        String[] stringArray2 = new String[lIlIIIIIlIIII[0]];
        stringArray2[m.lIlIIIIIlIIII[1]] = lIlIIIIIIlllI[lIlIIIIIlIIII[0]];
        TileObject llllllllllllllIlllIIlIIlIIlIlIIl = TileObjects.getNearest((String[])stringArray2);
        if (m.lIllIllIllIlIII(llllllllllllllIlllIIlIIlIIlIlIIl)) {
            return lIlIIIIIlIIII[1];
        }
        var4_5.interact(lIlIIIIIIlllI[lIlIIIIIlIIII[3]]);
        return lIlIIIIIlIIII[0];
    }

    private static String lIllIllIlIlllII(String llllllllllllllIlllIIlIIIlllllIIl, String llllllllllllllIlllIIlIIIlllllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIlllllIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIII[7]), "DES");
            Cipher llllllllllllllIlllIIlIIIllllllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIIIllllllIl.init(lIlIIIIIlIIII[3], llllllllllllllIlllIIlIIIlllllllI);
            return new String(llllllllllllllIlllIIlIIIllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIIllllllII) {
            llllllllllllllIlllIIlIIIllllllII.printStackTrace();
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

    private static String lIllIllIlIlllIl(String llllllllllllllIlllIIlIIlIIIllIII, String llllllllllllllIlllIIlIIlIIIlIlll) {
        llllllllllllllIlllIIlIIlIIIllIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIIlIIIllIll = new StringBuilder();
        char[] llllllllllllllIlllIIlIIlIIIllIlI = llllllllllllllIlllIIlIIlIIIlIlll.toCharArray();
        int llllllllllllllIlllIIlIIlIIIllIIl = lIlIIIIIlIIII[1];
        char[] llllllllllllllIlllIIlIIlIIIlIIll = llllllllllllllIlllIIlIIlIIIllIII.toCharArray();
        int llllllllllllllIlllIIlIIlIIIlIIlI = llllllllllllllIlllIIlIIlIIIlIIll.length;
        int llllllllllllllIlllIIlIIlIIIlIIIl = lIlIIIIIlIIII[1];
        while (m.lIllIllIllIIIlI(llllllllllllllIlllIIlIIlIIIlIIIl, llllllllllllllIlllIIlIIlIIIlIIlI)) {
            char llllllllllllllIlllIIlIIlIIIllllI = llllllllllllllIlllIIlIIlIIIlIIll[llllllllllllllIlllIIlIIlIIIlIIIl];
            llllllllllllllIlllIIlIIlIIIllIll.append((char)(llllllllllllllIlllIIlIIlIIIllllI ^ llllllllllllllIlllIIlIIlIIIllIlI[llllllllllllllIlllIIlIIlIIIllIIl % llllllllllllllIlllIIlIIlIIIllIlI.length]));
            0;
            ++llllllllllllllIlllIIlIIlIIIllIIl;
            ++llllllllllllllIlllIIlIIlIIIlIIIl;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIIlIIIllIll);
    }

    private static String lIllIllIlIllIll(String llllllllllllllIlllIIlIIlIIIIlIII, String llllllllllllllIlllIIlIIlIIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIlIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIlIIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIlIIIIlIlI.init(lIlIIIIIlIIII[3], llllllllllllllIlllIIlIIlIIIIlIll);
            return new String(llllllllllllllIlllIIlIIlIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIlIIIIlIIl) {
            llllllllllllllIlllIIlIIlIIIIlIIl.printStackTrace();
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

