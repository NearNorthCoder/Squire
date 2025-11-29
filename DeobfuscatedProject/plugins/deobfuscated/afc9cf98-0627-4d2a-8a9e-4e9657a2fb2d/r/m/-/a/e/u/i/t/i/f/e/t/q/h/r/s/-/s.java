/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.f;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

@TaskDesc(name="Planting Seed", priority=10, blocking=true)
public class s
extends r {
    private static /* synthetic */ String[] lIIlllllIIlIl;
    private final /* synthetic */ SquireTitheConfig aa;
    private static /* synthetic */ int[] lIIlllllIIllI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        s llllllllllllllIlllIIllIlIlIllIll;
        void llllllllllllllIlllIIllIlIlIllIlI;
        Item item2 = Inventory.getFirst(item -> item.getName().endsWith(lIIlllllIIlIl[lIIlllllIIllI[4]]));
        if (s.lIllIlIllIlIlll(item2)) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIII(llllllllllllllIlllIIllIlIlIllIlI.getQuantity(), llllllllllllllIlllIIllIlIlIllIll.Z.u())) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIII(llllllllllllllIlllIIllIlIlIllIll.Z.v(), lIIlllllIIllI[1] * llllllllllllllIlllIIllIlIlIllIll.Z.u())) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIIl(llllllllllllllIlllIIllIlIlIllIll.Z.q()) && s.lIllIlIllIllIlI(Movement.getRunEnergy(), lIIlllllIIllI[2]) && s.lIllIlIllIllIll(llllllllllllllIlllIIllIlIlIllIll.aa.waitForEnergy() ? 1 : 0)) {
            return lIIlllllIIllI[0];
        }
        List llllllllllllllIlllIIllIlIlIllIIl = Inventory.getAll(item -> item.getName().contains(lIIlllllIIlIl[lIIlllllIIllI[3]]));
        if (s.lIllIlIllIlllII(llllllllllllllIlllIIllIlIlIllIIl.size())) {
            Iterator llllllllllllllIlllIIllIlIlIllIII = llllllllllllllIlllIIllIlIlIllIIl.iterator();
            while (s.lIllIlIllIllIll(llllllllllllllIlllIIllIlIlIllIII.hasNext() ? 1 : 0)) {
                Item llllllllllllllIlllIIllIlIlIlIlll = (Item)llllllllllllllIlllIIllIlIlIllIII.next();
                llllllllllllllIlllIIllIlIlIlIlll.interact(lIIlllllIIlIl[lIIlllllIIllI[0]]);
                0;
                if (3 == 3) continue;
                return ((0x1D ^ 0x36) & ~(0xB7 ^ 0x9C)) != 0;
            }
            return lIIlllllIIllI[3];
        }
        TileObject llllllllllllllIlllIIllIlIlIllIII = llllllllllllllIlllIIllIlIlIllIll.Z.a(tileObject -> {
            boolean bl;
            if (s.lIllIlIllIlllIl((Object)f.d(tileObject.getId()), (Object)f.EMPTY)) {
                bl = lIIlllllIIllI[3];
                0;
                if (-1 == 2) {
                    return ((0x6A ^ 0x51 ^ (0xC2 ^ 0xA7)) & (0x2D ^ 0x1B ^ (0x15 ^ 0x7D) ^ -1)) != 0;
                }
            } else {
                bl = lIIlllllIIllI[0];
            }
            return bl;
        });
        if (s.lIllIlIllIlIlll(llllllllllllllIlllIIllIlIlIllIII)) {
            return lIIlllllIIllI[0];
        }
        item2.useOn((TileObject)var3_4);
        return lIIlllllIIllI[3];
    }

    private static String lIllIlIllIlIIll(String llllllllllllllIlllIIllIlIIllIlIl, String llllllllllllllIlllIIllIlIIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIlIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllIIllI[6]), "DES");
            Cipher llllllllllllllIlllIIllIlIIllIlll = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIlIIllIlll.init(lIIlllllIIllI[4], llllllllllllllIlllIIllIlIIlllIII);
            return new String(llllllllllllllIlllIIllIlIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIlIIllIllI) {
            llllllllllllllIlllIIllIlIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIlIlll(Object object) {
        return object == null;
    }

    @Inject
    protected s(i i2, SquireTitheConfig squireTitheConfig) {
        super(i2);
        this.aa = squireTitheConfig;
    }

    private static void lIllIlIllIlIllI() {
        lIIlllllIIllI = new int[7];
        s.lIIlllllIIllI[0] = 1 & (1 ^ -1);
        s.lIIlllllIIllI[1] = 0x64 ^ 0xF ^ (0xCC ^ 0xA3);
        s.lIIlllllIIllI[2] = 39 + 57 - 70 + 187 ^ 100 + 134 - 78 + 21;
        s.lIIlllllIIllI[3] = 1;
        s.lIIlllllIIllI[4] = 2;
        s.lIIlllllIIllI[5] = 3;
        s.lIIlllllIIllI[6] = 0 ^ 0x11 ^ (0xB5 ^ 0xAC);
    }

    private static boolean lIllIlIllIlllIl(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIlIllIlIlII(String llllllllllllllIlllIIllIlIIlIlIII, String llllllllllllllIlllIIllIlIIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIlIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllIlIIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllIlIIlIlIlI.init(lIIlllllIIllI[4], llllllllllllllIlllIIllIlIIlIlIll);
            return new String(llllllllllllllIlllIIllIlIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIlIIlIlIIl) {
            llllllllllllllIlllIIllIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIlIllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllIllIIl(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllIlIllIlllII(int n2) {
        return n2 > 0;
    }

    private static void lIllIlIllIlIlIl() {
        lIIlllllIIlIl = new String[lIIlllllIIllI[5]];
        s.lIIlllllIIlIl[s.lIIlllllIIllI[0]] = s."Wear";
        s.lIIlllllIIlIl[s.lIIlllllIIllI[3]] = s."Graceful";
        s.lIIlllllIIlIl[s.lIIlllllIIllI[4]] = s."seed";
    }

    private static String lIllIlIllIlIIlI(String llllllllllllllIlllIIllIlIlIIlIlI, String llllllllllllllIlllIIllIlIlIIlIIl) {
        llllllllllllllIlllIIllIlIlIIlIlI = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIlIlIIlIII = new StringBuilder();
        char[] llllllllllllllIlllIIllIlIlIIIlll = llllllllllllllIlllIIllIlIlIIlIIl.toCharArray();
        int llllllllllllllIlllIIllIlIlIIIllI = lIIlllllIIllI[0];
        char[] llllllllllllllIlllIIllIlIlIIIIII = llllllllllllllIlllIIllIlIlIIlIlI.toCharArray();
        int llllllllllllllIlllIIllIlIIllllll = llllllllllllllIlllIIllIlIlIIIIII.length;
        int llllllllllllllIlllIIllIlIIlllllI = lIIlllllIIllI[0];
        while (s.lIllIlIllIllIII(llllllllllllllIlllIIllIlIIlllllI, llllllllllllllIlllIIllIlIIllllll)) {
            char llllllllllllllIlllIIllIlIlIIlIll = llllllllllllllIlllIIllIlIlIIIIII[llllllllllllllIlllIIllIlIIlllllI];
            llllllllllllllIlllIIllIlIlIIlIII.append((char)(llllllllllllllIlllIIllIlIlIIlIll ^ llllllllllllllIlllIIllIlIlIIIlll[llllllllllllllIlllIIllIlIlIIIllI % llllllllllllllIlllIIllIlIlIIIlll.length]));
            0;
            ++llllllllllllllIlllIIllIlIlIIIllI;
            ++llllllllllllllIlllIIllIlIIlllllI;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIllIlIlIIlIII);
    }

    static {
        s.lIllIlIllIlIllI();
        s.lIllIlIllIlIlIl();
    }

    private static boolean lIllIlIllIllIll(int n2) {
        return n2 != 0;
    }
}

