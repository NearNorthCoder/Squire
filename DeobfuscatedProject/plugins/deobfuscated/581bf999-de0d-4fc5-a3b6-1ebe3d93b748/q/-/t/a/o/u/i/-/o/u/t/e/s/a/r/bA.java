/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bG;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking core", priority=50, blocking=true, register=true)
public class bA
extends bG {
    private /* synthetic */ int fV;
    private static final /* synthetic */ int fS;
    private /* synthetic */ boolean fW;
    private static final /* synthetic */ int fT;
    private static final /* synthetic */ int fP;
    private /* synthetic */ int fU;
    private static /* synthetic */ int[] lIlllIllIlI;
    private static /* synthetic */ String[] lIlllIllIIl;
    private static final /* synthetic */ int fO;
    private static final /* synthetic */ int fR;
    private static final /* synthetic */ int fQ;

    private static void lIIllIIlllIIlI() {
        lIlllIllIIl = new String[lIlllIllIlI[22]];
        bA.lIlllIllIIl[bA.lIlllIllIlI[0]] = bA."Wield";
        bA.lIlllIllIIl[bA.lIlllIllIlI[6]] = bA."Drink";
        bA.lIlllIllIIl[bA.lIlllIllIlI[4]] = bA."Attack";
        bA.lIlllIllIIl[bA.lIlllIllIlI[16]] = bA."Core projectile spawned";
        bA.lIlllIllIIl[bA.lIlllIllIlI[17]] = bA."Core";
        bA.lIlllIllIIl[bA.lIlllIllIlI[19]] = bA."Warden";
        bA.lIlllIllIIl[bA.lIlllIllIlI[20]] = bA."Attack";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_6;
        bA llllllllllllllllIlIIllIIIlIlllIl;
        void llllllllllllllllIlIIllIIIlIlllII;
        NPC nPC = this.co();
        if (bA.lIIllIIlllIlIl(nPC)) {
            return lIlllIllIlI[0];
        }
        if (!bA.lIIllIIlllIllI(llllllllllllllllIlIIllIIIlIlllII.getAnimation(), lIlllIllIlI[1]) || bA.lIIllIIlllIlll(llllllllllllllllIlIIllIIIlIlllII.getAnimation(), lIlllIllIlI[2])) {
            llllllllllllllllIlIIllIIIlIlllIl.fU = lIlllIllIlI[3];
            return lIlllIllIlI[0];
        }
        int[] nArray = new int[lIlllIllIlI[4]];
        nArray[bA.lIlllIllIlI[0]] = lIlllIllIlI[5];
        nArray[bA.lIlllIllIlI[6]] = lIlllIllIlI[7];
        Item llllllllllllllllIlIIllIIIlIllIll = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lIlllIllIlI[4]];
        nArray2[bA.lIlllIllIlI[0]] = lIlllIllIlI[5];
        nArray2[bA.lIlllIllIlI[6]] = lIlllIllIlI[7];
        int n2 = Equipment.contains((int[])nArray2);
        if ((!bA.lIIllIIlllIlIl(llllllllllllllllIlIIllIIIlIllIll) || bA.lIIllIIllllIII(n2)) && bA.lIIllIIllllIIl(llllllllllllllllIlIIllIIIlIlllIl.cu.getTickCount() - llllllllllllllllIlIIllIIIlIlllIl.fU, lIlllIllIlI[8] + (llllllllllllllllIlIIllIIIlIlllIl.fV - lIlllIllIlI[6]) * lIlllIllIlI[9])) {
            if (bA.lIIllIIllllIlI(n2)) {
                llllllllllllllllIlIIllIIIlIllIll.interact(lIlllIllIIl[lIlllIllIlI[0]]);
                0;
                if (1 < 1) {
                    return ((0x72 ^ 0x67) & ~(0x78 ^ 0x6D)) != 0;
                }
            }
        } else {
            boolean bl2;
            if (bA.lIIllIIllllIlI(llllllllllllllllIlIIllIIIlIlllIl.cW.overlyDraining() ? 1 : 0)) {
                bl2 = lIlllIllIlI[6];
                0;
                if (null != null) {
                    return ((102 + 150 - 150 + 58 ^ 81 + 130 - 144 + 71) & (0x6C ^ 0x1A ^ (0x4C ^ 0x10) ^ -1)) != 0;
                }
            } else {
                bl2 = lIlllIllIlI[0];
            }
            boolean llllllllllllllllIlIIllIIIlIllIIl = llllllllllllllllIlIIllIIIlIlllIl.e(bl2);
        }
        if (bA.lIIllIIllllIlI(llllllllllllllllIlIIllIIIlIlllIl.aZ() ? 1 : 0) && bA.lIIllIIllllIIl(llllllllllllllllIlIIllIIIlIlllIl.aY(), lIlllIllIlI[10]) && bA.lIIllIIllllIlI(llllllllllllllllIlIIllIIIlIlllIl.cW.overlyDraining() ? 1 : 0)) {
            int[] nArray3 = new int[lIlllIllIlI[4]];
            nArray3[bA.lIlllIllIlI[0]] = lIlllIllIlI[11];
            nArray3[bA.lIlllIllIlI[6]] = lIlllIllIlI[12];
            Item llllllllllllllllIlIIllIIIlIllIIl = Inventory.getFirst((int[])nArray3);
            if (bA.lIIllIIllllIll(llllllllllllllllIlIIllIIIlIllIIl)) {
                llllllllllllllllIlIIllIIIlIllIIl.interact(lIlllIllIIl[lIlllIllIlI[6]]);
            }
        }
        int[] nArray4 = new int[lIlllIllIlI[6]];
        nArray4[bA.lIlllIllIlI[0]] = lIlllIllIlI[13];
        NPC llllllllllllllllIlIIllIIIlIllIIl = NPCs.getNearest((int[])nArray4);
        if (bA.lIIllIIlllIlIl(llllllllllllllllIlIIllIIIlIllIIl)) {
            return lIlllIllIlI[6];
        }
        this.aY.a(lIlllIllIlI[14]);
        var4_6.interact(lIlllIllIIl[lIlllIllIlI[4]]);
        return lIlllIllIlI[6];
    }

    private static boolean lIIllIIllllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIllIIlllIlII() {
        lIlllIllIlI = new int[23];
        bA.lIlllIllIlI[0] = (0x4D ^ 0x1E) & ~(0xCA ^ 0x99) & ~((0xBE ^ 0x9D) & ~(0xAC ^ 0x8F));
        bA.lIlllIllIlI[1] = -(0xFFFFDA3D & 0x67F7) & (0xFFFFE7FF & 0x7FFC);
        bA.lIlllIllIlI[2] = -(0xFFFFBF2D & 0x5AD3) & (0xFFFFBFBF & 0x7FFE);
        bA.lIlllIllIlI[3] = -1;
        bA.lIlllIllIlI[4] = 2;
        bA.lIlllIllIlI[5] = -(0xFFFFF90F & 0x56F2) & (0xFFFFFE1F & 0x7FFD);
        bA.lIlllIllIlI[6] = 1;
        bA.lIlllIllIlI[7] = 0xFFFFEFFB & 0x5F96;
        bA.lIlllIllIlI[8] = 0x2F ^ 0x7E ^ (0xC3 ^ 0x81);
        bA.lIlllIllIlI[9] = 137 + 24 - 33 + 58 ^ 173 + 126 - 251 + 130;
        bA.lIlllIllIlI[10] = -(0xFFFFDE8E & 0x39F3) & (0xFFFF9FFB & 0x7BD7);
        bA.lIlllIllIlI[11] = -(0xFFFF8353 & 0x7DBF) & (0xFFFFEFFF & 0x7BDF);
        bA.lIlllIllIlI[12] = 0xFFFFEFEB & 0x7ADF;
        bA.lIlllIllIlI[13] = -(0xFFFFEB65 & 0x569F) & (0xFFFFFFFF & 0x6FFF);
        bA.lIlllIllIlI[14] = 0xB6 ^ 0xB9;
        bA.lIlllIllIlI[15] = 0xFFFFBDC7 & 0x4AF8;
        bA.lIlllIllIlI[16] = 3;
        bA.lIlllIllIlI[17] = 0x29 ^ 0x58 ^ (0 ^ 0x75);
        bA.lIlllIllIlI[18] = 0x8F ^ 0xA6 ^ (0x60 ^ 0x43);
        bA.lIlllIllIlI[19] = 40 + 156 - 137 + 117 ^ 73 + 11 - 6 + 103;
        bA.lIlllIllIlI[20] = 83 + 10 - 25 + 128 ^ 48 + 19 - -111 + 16;
        bA.lIlllIllIlI[21] = 0xFFFFEDC7 & 0x37FE;
        bA.lIlllIllIlI[22] = 0xA7 ^ 0xA0;
    }

    private static String lIIllIIllIllll(String llllllllllllllllIlIIllIIIlIIIlIl, String llllllllllllllllIlIIllIIIlIIIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIllIIIlIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIllIIIlIIlIIl.init(lIlllIllIlI[4], llllllllllllllllIlIIllIIIlIIlIlI);
            return new String(llllllllllllllllIlIIllIIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIllIIIlIIlIII) {
            llllllllllllllllIlIIllIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlllIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIllIIllIlllI(String llllllllllllllllIlIIllIIIIlIIlIl, String llllllllllllllllIlIIllIIIIlIIlII) {
        llllllllllllllllIlIIllIIIIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllIIIIlIlIII = new StringBuilder();
        char[] llllllllllllllllIlIIllIIIIlIIlll = llllllllllllllllIlIIllIIIIlIIlII.toCharArray();
        int llllllllllllllllIlIIllIIIIlIIllI = lIlllIllIlI[0];
        char[] llllllllllllllllIlIIllIIIIlIIIII = llllllllllllllllIlIIllIIIIlIIlIl.toCharArray();
        int llllllllllllllllIlIIllIIIIIlllll = llllllllllllllllIlIIllIIIIlIIIII.length;
        int llllllllllllllllIlIIllIIIIIllllI = lIlllIllIlI[0];
        while (bA.lIIllIIlllllII(llllllllllllllllIlIIllIIIIIllllI, llllllllllllllllIlIIllIIIIIlllll)) {
            char llllllllllllllllIlIIllIIIIlIlIll = llllllllllllllllIlIIllIIIIlIIIII[llllllllllllllllIlIIllIIIIIllllI];
            llllllllllllllllIlIIllIIIIlIlIII.append((char)(llllllllllllllllIlIIllIIIIlIlIll ^ llllllllllllllllIlIIllIIIIlIIlll[llllllllllllllllIlIIllIIIIlIIllI % llllllllllllllllIlIIllIIIIlIIlll.length]));
            0;
            ++llllllllllllllllIlIIllIIIIlIIllI;
            ++llllllllllllllllIlIIllIIIIIllllI;
            0;
            if ((0xC ^ 9) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIllIIIIlIlIII);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.specialCore();
    }

    @Inject
    protected bA(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.normalCore();
    }

    private static String lIIllIIlllIIIl(String llllllllllllllllIlIIllIIIIlllIlI, String llllllllllllllllIlIIllIIIIlllIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIIIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIIIlllIIl.getBytes(StandardCharsets.UTF_8)), lIlllIllIlI[9]), "DES");
            Cipher llllllllllllllllIlIIllIIIIllllII = Cipher.getInstance("DES");
            llllllllllllllllIlIIllIIIIllllII.init(lIlllIllIlI[4], llllllllllllllllIlIIllIIIIllllIl);
            return new String(llllllllllllllllIlIIllIIIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIllIIIIlllIll) {
            llllllllllllllllIlIIllIIIIlllIll.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (bA.lIIllIIlllIlll(projectile.getId(), lIlllIllIlI[15])) {
            Log.info((String)lIlllIllIIl[lIlllIllIlI[16]]);
            this.fV += lIlllIllIlI[6];
            this.fU = this.cu.getTickCount();
        }
    }

    private static boolean lIIllIIllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public void r() {
        this.fU = lIlllIllIlI[0];
        this.fW = lIlllIllIlI[0];
        this.fV = lIlllIllIlI[0];
    }

    private static boolean lIIllIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIIlllIlIl(Object object) {
        return object == null;
    }

    @Override
    public boolean bk() {
        boolean bl2;
        String[] stringArray = new String[lIlllIllIlI[6]];
        stringArray[bA.lIlllIllIlI[0]] = lIlllIllIIl[lIlllIllIlI[17]];
        if (!bA.lIIllIIlllIlIl(NPCs.getNearest((String[])stringArray)) || !bA.lIIllIIllllIll(NPCs.getNearest(nPC -> {
            int n2;
            if (bA.lIIllIIllllIII(nPC.getName().contains(lIlllIllIIl[lIlllIllIlI[19]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlllIllIlI[6]];
                stringArray[bA.lIlllIllIlI[0]] = lIlllIllIIl[lIlllIllIlI[20]];
                if (bA.lIIllIIllllIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlllIllIlI[6];
                    0;
                    if (((0x9D ^ 0x86) & ~(0x1D ^ 6)) >= 0) return n2 != 0;
                    return ((0x8D ^ 0xAA) & ~(0x59 ^ 0x7E)) != 0;
                }
            }
            n2 = lIlllIllIlI[0];
            return n2 != 0;
        })) || bA.lIIllIIlllllII(this.cu.getTickCount() - this.fU, lIlllIllIlI[18])) {
            bl2 = lIlllIllIlI[6];
            0;
            if (((184 + 110 - 191 + 85 ^ 49 + 68 - 91 + 158) & (0x36 ^ 0x10 ^ (0x62 ^ 0x40) ^ -1)) != 0) {
                return ((0x5E ^ 0x56 ^ (0x5E ^ 0x47)) & (0x68 ^ 0x40 ^ (0xAA ^ 0x93) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlllIllIlI[0];
        }
        return bl2;
    }

    private static boolean lIIllIIllllIll(Object object) {
        return object != null;
    }

    private static boolean lIIllIIlllIlll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        bA.lIIllIIlllIlII();
        bA.lIIllIIlllIIlI();
        fO = lIlllIllIlI[13];
        fT = lIlllIllIlI[10];
        fR = lIlllIllIlI[1];
        fS = lIlllIllIlI[2];
        fQ = lIlllIllIlI[21];
        fP = lIlllIllIlI[15];
    }

    private static boolean lIIllIIllllIII(int n2) {
        return n2 != 0;
    }
}

