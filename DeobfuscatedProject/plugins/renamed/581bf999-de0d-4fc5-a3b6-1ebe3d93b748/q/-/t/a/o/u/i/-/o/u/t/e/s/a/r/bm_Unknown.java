/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

public abstract class bm_Unknown
extends ao_Unknown {
    private static /* synthetic */ int[] llIlllIIllI;
    protected final /* synthetic */ p fh;
    private static /* synthetic */ String[] llIlllIIlIl;
    protected static final /* synthetic */ int fg;

    private static boolean lIlIlIllIIllII(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean bn() {
        String[] stringArray = new String[llIlllIIllI[2]];
        stringArray[bm.llIlllIIllI[1]] = llIlllIIlIl[llIlllIIllI[3]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (!bm.lIlIlIllIIlIII(tileObject) || bm.lIlIlIllIIIlll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
            return llIlllIIllI[1];
        }
        tileObject.interact(llIlllIIlIl[llIlllIIllI[4]]);
        return llIlllIIllI[2];
    }

    public abstract boolean bY();

    private static boolean lIlIlIllIIlIIl(Object object) {
        return object == null;
    }

    static {
        bm.lIlIlIllIIIllI();
        bm.lIlIlIllIIIlIl();
        fg = llIlllIIllI[0];
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.rangedP2Warden();
    }

    private static boolean lIlIlIllIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int bi() {
        return llIlllIIllI[0];
    }

    protected bm(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig);
        this.fh = p2;
    }

    private static boolean lIlIlIllIIlIII(Object object) {
        return object != null;
    }

    @Override
    public boolean bj() {
        return llIlllIIllI[1];
    }

    @Override
    public boolean bl() {
        bm var2;
        TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bm.lIlIlIllIIlllI(tileObject.getName().equals(llIlllIIlIl[llIlllIIllI[6]]) ? 1 : 0)) {
                String[] stringArray = new String[llIlllIIllI[2]];
                stringArray[bm.llIlllIIllI[1]] = llIlllIIlIl[llIlllIIllI[7]];
                if (bm.lIlIlIllIIlllI(tileObject.hasAction(stringArray) ? 1 : 0) && bm.lIlIlIllIIllIl(tileObject.getWorldX(), this.cu.getLocalPlayer().getWorldX())) {
                    n2 = llIlllIIllI[2];
                    0;
                    if (2 != -1) return n2 != 0;
                    return ((0x3B ^ 0xA ^ (0xC ^ 0x6E)) & (0xA3 ^ 0xAA ^ (0x2F ^ 0x75) ^ -1)) != 0;
                }
            }
            n2 = llIlllIIllI[1];
            return n2 != 0;
        });
        if (bm.lIlIlIllIIlIII(tileObject3)) {
            tileObject3.interact(llIlllIIlIl[llIlllIIllI[1]]);
            return llIlllIIllI[2];
        }
        TileObject var9 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bm.lIlIlIllIIlIll(tileObject.getId(), llIlllIIllI[5]) && bm.lIlIlIllIIllIl(tileObject.getWorldX(), this.cu.getLocalPlayer().getWorldX())) {
                n2 = llIlllIIllI[2];
                0;
                
                }
            } else {
                n2 = llIlllIIllI[1];
            }
            return n2 != 0;
        });
        if (bm.lIlIlIllIIlIIl(var9)) {
            return llIlllIIllI[1];
        }
        TileObject var1 = TileObjects.getNearest(tileObject2 -> {
            int n2;
            if (bm.lIlIlIllIIlIll(tileObject2.getId(), llIlllIIllI[5]) && bm.lIlIlIllIIlIll(tileObject2.getWorldX(), var9.getWorldX()) && bm.lIlIlIllIIllII(tileObject2, var9)) {
                n2 = llIlllIIllI[2];
                0;
                if (2 > 2) {
                    return false;
                }
            } else {
                n2 = llIlllIIllI[1];
            }
            return n2 != 0;
        });
        if (bm.lIlIlIllIIlIIl(var1)) {
            Object[] objectArray = new Object[llIlllIIllI[2]];
            objectArray[bm.llIlllIIllI[1]] = var9.getWorldX();
            Log.info((String)llIlllIIlIl[llIlllIIllI[2]], (Object[])objectArray);
            var2.fh.g(var9.getWorldX());
        }
        if (bm.lIlIlIllIIlIlI(var2.bZ(), var2.fh.Z())) {
            return llIlllIIllI[1];
        }
        return this.bY();
    }

    private static boolean lIlIlIllIIlllI(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIllIIIlII(String var11, String var3) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIlllIIllI[3], var12);
            return new String(var4.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bk() {
        boolean bl2;
        if (bm.lIlIlIllIIIlll(this.bj() ? 1 : 0)) {
            bl2 = llIlllIIllI[2];
            0;
            if (((2 ^ (0xC4 ^ 0x83)) & (0x11 ^ 0x20 ^ (0x44 ^ 0x30) ^ -1)) == (0xED ^ 0x80 ^ (0x5E ^ 0x37))) {
                return ((0x1E ^ 0x7D ^ (0x7E ^ 9)) & (55 + 164 - 76 + 48 ^ 17 + 107 - 43 + 90 ^ -1)) != 0;
            }
        } else {
            bl2 = llIlllIIllI[1];
        }
        return bl2;
    }

    @Override
    public void r() {
        this.fh.w();
    }

    private static String lIlIlIllIIIIll(String var5, String var10) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llIlllIIllI[9]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIlllIIllI[3], var13);
            return new String(var8.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllIIIllI() {
        llIlllIIllI = new int[10];
        bm.llIlllIIllI[0] = -(0xFFFFE9B5 & 0x1E6F) & (0xFFFFFF76 & 0x3FFF);
        bm.llIlllIIllI[1] = (6 ^ 0x6C ^ (0x13 ^ 0x4F)) & (0xF ^ 0x58 ^ (0xFA ^ 0x9B) ^ -1);
        bm.llIlllIIllI[2] = 1;
        bm.llIlllIIllI[3] = 2;
        bm.llIlllIIllI[4] = 3;
        bm.llIlllIIllI[5] = 0xFFFFFF9F & 0xB177;
        bm.llIlllIIllI[6] = 0x81 ^ 0x85;
        bm.llIlllIIllI[7] = 0xD7 ^ 0xC3 ^ (0x68 ^ 0x79);
        bm.llIlllIIllI[8] = 0x5A ^ 0x5C;
        bm.llIlllIIllI[9] = 175 + 98 - 257 + 168 ^ 123 + 60 - 137 + 130;
    }

    private static boolean lIlIlIllIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    public abstract int bZ();

    private static boolean lIlIlIllIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIllIIIlIl() {
        llIlllIIlIl = new String[llIlllIIllI[8]];
        bm.llIlllIIlIl[bm.llIlllIIllI[1]] = bm."Quick-Pass";
        bm.llIlllIIlIl[bm.llIlllIIllI[2]] = bm."Moving up to completed x = {}";
        bm.llIlllIIlIl[bm.llIlllIIllI[3]] = bm."Entry";
        bm.llIlllIIlIl[bm.llIlllIIllI[4]] = bm."Quick-Enter";
        bm.llIlllIIlIl[bm.llIlllIIllI[6]] = bm."Barrier";
        bm.llIlllIIlIl[bm.llIlllIIllI[7]] = bm."Quick-Pass";
    }

    private static boolean lIlIlIllIIlIll(int n2, int n3) {
        return n2 == n3;
    }
}

