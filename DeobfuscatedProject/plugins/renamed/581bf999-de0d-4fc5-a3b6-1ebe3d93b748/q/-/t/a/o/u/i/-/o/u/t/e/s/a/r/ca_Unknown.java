/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

public abstract class ca_Unknown
extends ao_Unknown {
    protected static final /* synthetic */ int hA;
    private static /* synthetic */ int[] llIIIllllll;
    protected static final /* synthetic */ int hD;
    private static /* synthetic */ String[] llIIIlllllI;
    protected static final /* synthetic */ int[] hC;
    protected static final /* synthetic */ int hB;
    private static final /* synthetic */ int hE;

    private static boolean lIIllllllIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bm() {
        String[] stringArray = new String[llIIIllllll[1]];
        stringArray[ca.llIIIllllll[2]] = llIIIlllllI[llIIIllllll[2]];
        TileObject tileObject = TileObjects.getAll((String[])stringArray).stream().max(Comparator.comparingInt(Locatable::getWorldY).thenComparing(Locatable::getWorldX)).orElse(null);
        if (ca.lIIllllllIIlll(tileObject)) {
            return llIIIllllll[2];
        }
        tileObject.interact(llIIIlllllI[llIIIllllll[1]]);
        return llIIIllllll[1];
    }

    private static String lIIllllllIIlII(String var3, String var14) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(llIIIllllll[5], var10);
            return new String(var11.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bk() {
        void var12;
        int[] nArray = hC;
        int n2 = nArray.length;
        int var4 = llIIIllllll[2];
        while (ca.lIIllllllIlIIl(var4, (int)var12)) {
            ca var5;
            void var16;
            void var9 = var16[var4];
            if (ca.lIIllllllIlIII(var5.aX(), (int)var9)) {
                return llIIIllllll[1];
            }
            ++var4;
            0;
            
            return false;
        }
        return llIIIllllll[2];
    }

    private static String lIIllllllIIIll(String var6, String var13) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIIIllllll[13]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIIIllllll[5], var7);
            return new String(var8.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[llIIIllllll[1]];
        nArray[ca.llIIIllllll[2]] = llIIIllllll[3];
        if (!ca.lIIllllllIIlll(NPCs.getNearest((int[])nArray)) || ca.lIIllllllIlIII(this.aY(), llIIIllllll[4])) {
            bl2 = llIIIllllll[1];
            0;
            if ((0xA3 ^ 0xA7) == ((0x4B ^ 0x56) & ~(0x47 ^ 0x5A))) {
                return false;
            }
        } else {
            bl2 = llIIIllllll[2];
        }
        return bl2;
    }

    private static boolean lIIllllllIIlll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (ca.lIIllllllIlIlI(super.bn() ? 1 : 0)) {
            return llIIIllllll[1];
        }
        String[] stringArray = new String[llIIIllllll[1]];
        stringArray[ca.llIIIllllll[2]] = llIIIlllllI[llIIIllllll[5]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        if (ca.lIIllllllIIlll(var2)) {
            return llIIIllllll[2];
        }
        var1_1.interact(llIIIlllllI[llIIIllllll[6]]);
        return llIIIllllll[1];
    }

    static {
        ca.lIIllllllIIllI();
        ca.lIIllllllIIlIl();
        hB = llIIIllllll[0];
        hD = llIIIllllll[3];
        hA = llIIIllllll[7];
        hE = llIIIllllll[4];
        int[] nArray = new int[llIIIllllll[8]];
        nArray[ca.llIIIllllll[2]] = llIIIllllll[9];
        nArray[ca.llIIIllllll[1]] = llIIIllllll[10];
        nArray[ca.llIIIllllll[5]] = llIIIllllll[11];
        nArray[ca.llIIIllllll[6]] = llIIIllllll[12];
        hC = nArray;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.mageGearAkkha();
    }

    private static boolean lIIllllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllllllIIlIl() {
        llIIIlllllI = new String[llIIIllllll[8]];
        ca.llIIIlllllI[ca.llIIIllllll[2]] = ca."Barrier";
        ca.llIIIlllllI[ca.llIIIllllll[1]] = ca."Quick-Pass";
        ca.llIIIlllllI[ca.llIIIllllll[5]] = ca."Entry";
        ca.llIIIlllllI[ca.llIIIllllll[6]] = ca."Quick-Enter";
    }

    @Override
    public int bi() {
        return llIIIllllll[0];
    }

    protected ca(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIIllllllIIllI() {
        llIIIllllll = new int[14];
        ca.llIIIllllll[0] = 0xFFFFBD53 & 0x7FFE;
        ca.llIIIllllll[1] = 1;
        ca.llIIIllllll[2] = (0x73 ^ 0x6E ^ (0x1F ^ 5)) & (4 + 66 - -100 + 26 ^ 82 + 72 - 66 + 107 ^ -1);
        ca.llIIIllllll[3] = 0xFFFFBFFB & 0x6DBC;
        ca.llIIIllllll[4] = 197 + 51 - 119 + 71;
        ca.llIIIllllll[5] = 2;
        ca.llIIIllllll[6] = 3;
        ca.llIIIllllll[7] = -(0xFFFF85EF & 0x7F31) & (0xFFFFFFFF & 0x6FBF);
        ca.llIIIllllll[8] = 0x61 ^ 1 ^ (0x77 ^ 0x13);
        ca.llIIIllllll[9] = 0xFFFFAFBE & 0x7DF5;
        ca.llIIIllllll[10] = -(0xFFFFD859 & 0x67AF) & (0xFFFFEFBF & 0x7DFD);
        ca.llIIIllllll[11] = -(0xFFFFD7DB & 0x2A2D) & (0xFFFFEFBE & 0x3FFF);
        ca.llIIIllllll[12] = 0xFFFFFDBF & 0x2FF7;
        ca.llIIIllllll[13] = 0x20 ^ 0x28;
    }

    private static boolean lIIllllllIlIII(int n2, int n3) {
        return n2 == n3;
    }
}

