/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.by;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Sun Keris (OBELISK)", priority=2500, blocking=true)
public class bz
extends by {
    private static /* synthetic */ int[] llIllIllIII;
    private static final /* synthetic */ int fM;
    private static /* synthetic */ String[] llIllIlIlll;
    private static final /* synthetic */ int fN;

    @Override
    public boolean bl() {
        int llllllllllllllllIIlIllIIllIIlllI;
        int n2;
        bz llllllllllllllllIIlIllIIllIlIIII;
        if (bz.lIlIlIlIIIlIll(this.cl() ? 1 : 0)) {
            this.aY.c(llIllIllIII[0]);
            return llIllIllIII[0];
        }
        if (bz.lIlIlIlIIIllII(Prayers.getPoints(), llIllIllIII[1])) {
            Item llllllllllllllllIIlIllIIllIIllll = Inventory.getFirst(item -> {
                int n2;
                if (!bz.lIlIlIlIIIlIll(q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !bz.lIlIlIlIIIlIll(item.getName().contains(llIllIlIlll[llIllIllIII[19]]) ? 1 : 0) || !bz.lIlIlIlIIIlIll(item.getName().contains(llIllIlIlll[llIllIllIII[17]]) ? 1 : 0) || bz.lIlIlIlIIIlllI(item.getName().contains(llIllIlIlll[llIllIllIII[20]]) ? 1 : 0)) {
                    n2 = llIllIllIII[2];
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return ((0x3D ^ 0x11 ^ (1 ^ 0x18)) & (0xEE ^ 0xC4 ^ (4 ^ 0x1B) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIllIllIII[0];
                }
                return n2 != 0;
            });
            if (bz.lIlIlIlIIIllIl(llllllllllllllllIIlIllIIllIIllll)) {
                return llIllIllIII[0];
            }
            llllllllllllllllIIlIllIIllIIllll.interact(llIllIlIlll[llIllIllIII[0]]);
            return llIllIllIII[2];
        }
        if (bz.lIlIlIlIIIlIll(llllllllllllllllIIlIllIIllIlIIII.aZ() ? 1 : 0) && bz.lIlIlIlIIIlllI(llllllllllllllllIIlIllIIllIlIIII.aq() ? 1 : 0) && bz.lIlIlIlIIIllll(llllllllllllllllIIlIllIIllIlIIII.aY(), llIllIllIII[2])) {
            int[] nArray = new int[llIllIllIII[3]];
            nArray[bz.llIllIllIII[0]] = llIllIllIII[4];
            nArray[bz.llIllIllIII[2]] = llIllIllIII[5];
            Item llllllllllllllllIIlIllIIllIIllll = Inventory.getFirst((int[])nArray);
            if (bz.lIlIlIlIIlIIII(llllllllllllllllIIlIllIIllIIllll)) {
                llllllllllllllllIIlIllIIllIIllll.interact(llIllIlIlll[llIllIllIII[2]]);
            }
        }
        if (bz.lIlIlIlIIIlIll(llllllllllllllllIIlIllIIllIlIIII.ck() ? 1 : 0)) {
            return llIllIllIII[0];
        }
        if (bz.lIlIlIlIIIllll(Combat.getCurrentHealth(), llllllllllllllllIIlIllIIllIlIIII.cj())) {
            return llIllIllIII[0];
        }
        int llllllllllllllllIIlIllIIllIIllll = Vars.getVarp((int)llIllIllIII[6]);
        if (bz.lIlIlIlIIIlllI(llllllllllllllllIIlIllIIllIlIIII.aZ() ? 1 : 0)) {
            n2 = llIllIllIII[7];
            "".length();
            if (((9 ^ 0x1A ^ (0x44 ^ 0xE)) & (0x24 ^ 0x35 ^ (0xFC ^ 0xB4) ^ -" ".length())) != 0) {
                return ((104 + 62 - 73 + 107 ^ 92 + 93 - 159 + 108) & (0x27 ^ 0x60 ^ (0xCA ^ 0xC3) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llllllllllllllllIIlIllIIllIIlllI = llIllIllIII[8];
        }
        if (bz.lIlIlIlIIIlllI(llllllllllllllllIIlIllIIllIlIIII.cW.overlyDraining() ? 1 : 0)) {
            int n3;
            if (bz.lIlIlIlIIIlllI(llllllllllllllllIIlIllIIllIlIIII.aZ() ? 1 : 0)) {
                n3 = llIllIllIII[9];
                "".length();
                if (((0xA9 ^ 0xB1 ^ (0x10 ^ 0x68)) & (0x1C ^ 0x3F ^ (0x17 ^ 0x54) ^ -" ".length())) >= ((0x8E ^ 0xA6) & ~(0x6F ^ 0x47) ^ (0x71 ^ 0x75))) {
                    return ((8 + 154 - -10 + 23 ^ 60 + 25 - -13 + 50) & (37 + 177 - 171 + 208 ^ 5 + 112 - 93 + 148 ^ -" ".length())) != 0;
                }
            } else {
                n3 = llllllllllllllllIIlIllIIllIIlllI = llIllIllIII[10];
            }
        }
        if (bz.lIlIlIlIIIllII(llllllllllllllllIIlIllIIllIIllll, llllllllllllllllIIlIllIIllIIlllI)) {
            llllllllllllllllIIlIllIIllIlIIII.aY.c();
            return llIllIllIII[0];
        }
        llllllllllllllllIIlIllIIllIlIIII.aY.c(llIllIllIII[2]);
        Item llllllllllllllllIIlIllIIllIIllIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (!bz.lIlIlIlIIlIIII(llllllllllllllllIIlIllIIllIIllIl) || bz.lIlIlIlIIlIIIl(llllllllllllllllIIlIllIIllIIllIl.getId(), llIllIllIII[11])) {
            int[] nArray = new int[llIllIllIII[2]];
            nArray[bz.llIllIllIII[0]] = llIllIllIII[11];
            Item llllllllllllllllIIlIllIIllIIllII = Inventory.getFirst((int[])nArray);
            if (bz.lIlIlIlIIIllIl(llllllllllllllllIIlIllIIllIIllII)) {
                return llIllIllIII[0];
            }
            llllllllllllllllIIlIllIIllIIllII.interact(llIllIlIlll[llIllIllIII[3]]);
        }
        Combat.toggleSpec();
        this.aY.c(llIllIllIII[0]);
        return llIllIllIII[0];
    }

    private static void lIlIlIlIIIlIlI() {
        llIllIllIII = new int[22];
        bz.llIllIllIII[0] = (0x60 ^ 0x3C) & ~(0x4B ^ 0x17);
        bz.llIllIllIII[1] = 0x68 ^ 0x5B;
        bz.llIllIllIII[2] = " ".length();
        bz.llIllIllIII[3] = "  ".length();
        bz.llIllIllIII[4] = -(0xFFFFD5BB & 0x3F77) & (0xFFFFFFFF & Short.MAX_VALUE);
        bz.llIllIllIII[5] = -(0xE6 ^ 0xC7) & (0xFFFFFEEB & 0x6BFF);
        bz.llIllIllIII[6] = 0xFFFFB3EE & 0x4D3D;
        bz.llIllIllIII[7] = 0xFFFFA377 & 0x5DFF;
        bz.llIllIllIII[8] = -(0xFFFFA76A & 0x5997) & (0xFFFFC7EF & 0x3BFF);
        bz.llIllIllIII[9] = 0xFFFFC1F5 & 0x3FFE;
        bz.llIllIllIII[10] = 0xFFFF87FD & 0x7BEA;
        bz.llIllIllIII[11] = 0xFFFFFF9F & 0x6AFB;
        bz.llIllIllIII[12] = -(0xFFFF974B & 0x7FF6) & (0xFFFFBFFF & 0x5FFF);
        bz.llIllIllIII[13] = -(0xFFFFCE63 & 0x779F) & (0xFFFFCEBF & Short.MAX_VALUE);
        bz.llIllIllIII[14] = 0x2D ^ 0x33;
        bz.llIllIllIII[15] = 0x7E ^ 0x59 ^ (0xAB ^ 0xA1);
        bz.llIllIllIII[16] = 0xC2 ^ 0x84;
        bz.llIllIllIII[17] = 0xD ^ 8;
        bz.llIllIllIII[18] = "   ".length();
        bz.llIllIllIII[19] = 0x78 ^ 0x7C;
        bz.llIllIllIII[20] = 0xAB ^ 0xAD;
        bz.llIllIllIII[21] = 0xBE ^ 0xB9;
    }

    private static boolean lIlIlIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private boolean ck() {
        int[] nArray = new int[llIllIllIII[3]];
        nArray[bz.llIllIllIII[0]] = llIllIllIII[12];
        nArray[bz.llIllIllIII[2]] = llIllIllIII[13];
        Projectile projectile2 = Projectiles.getAll((int[])nArray).stream().filter(projectile -> {
            boolean bl2;
            if (!bz.lIlIlIlIIlIIIl(projectile.getId(), llIllIllIII[12]) || bz.lIlIlIlIIlIIlI(projectile.getId(), llIllIllIII[13])) {
                bl2 = llIllIllIII[2];
                "".length();
                if (((0x1E ^ 0x3B) & ~(0x57 ^ 0x72)) >= "  ".length()) {
                    return ((0x2F ^ 0x29) & ~(0xA8 ^ 0xAE)) != 0;
                }
            } else {
                bl2 = llIllIllIII[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(Projectile::getRemainingCycles)).orElse(null);
        if (bz.lIlIlIlIIlIIII(projectile2) && bz.lIlIlIlIIIllII(projectile2.getRemainingCycles(), llIllIllIII[16]) && bz.lIlIlIlIIIllll(projectile2.getRemainingCycles(), llIllIllIII[17])) {
            Object[] objectArray = new Object[llIllIllIII[3]];
            objectArray[bz.llIllIllIII[0]] = projectile2.getId();
            objectArray[bz.llIllIllIII[2]] = projectile2.getRemainingCycles();
            Log.info((String)llIllIlIlll[llIllIllIII[18]], (Object[])objectArray);
            return llIllIllIII[2];
        }
        return llIllIllIII[0];
    }

    private static boolean lIlIlIlIIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlIlIIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIIIlllI(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIlIIIIlll(String llllllllllllllllIIlIllIIlIlIIlll, String llllllllllllllllIIlIllIIlIlIIllI) {
        llllllllllllllllIIlIllIIlIlIIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllIIlIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllIIlIlIlIlI = new StringBuilder();
        char[] llllllllllllllllIIlIllIIlIlIlIIl = llllllllllllllllIIlIllIIlIlIIllI.toCharArray();
        int llllllllllllllllIIlIllIIlIlIlIII = llIllIllIII[0];
        char[] llllllllllllllllIIlIllIIlIlIIIlI = llllllllllllllllIIlIllIIlIlIIlll.toCharArray();
        int llllllllllllllllIIlIllIIlIlIIIIl = llllllllllllllllIIlIllIIlIlIIIlI.length;
        int llllllllllllllllIIlIllIIlIlIIIII = llIllIllIII[0];
        while (bz.lIlIlIlIIIllII(llllllllllllllllIIlIllIIlIlIIIII, llllllllllllllllIIlIllIIlIlIIIIl)) {
            char llllllllllllllllIIlIllIIlIlIllIl = llllllllllllllllIIlIllIIlIlIIIlI[llllllllllllllllIIlIllIIlIlIIIII];
            llllllllllllllllIIlIllIIlIlIlIlI.append((char)(llllllllllllllllIIlIllIIlIlIllIl ^ llllllllllllllllIIlIllIIlIlIlIIl[llllllllllllllllIIlIllIIlIlIlIII % llllllllllllllllIIlIllIIlIlIlIIl.length]));
            "".length();
            ++llllllllllllllllIIlIllIIlIlIlIII;
            ++llllllllllllllllIIlIllIIlIlIIIII;
            "".length();
            if ("  ".length() != -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIllIIlIlIlIlI);
    }

    /*
     * WARNING - void declaration
     */
    private int cj() {
        void llllllllllllllllIIlIllIIllIIlIlI;
        int[] nArray = new int[llIllIllIII[3]];
        nArray[bz.llIllIllIII[0]] = llIllIllIII[12];
        nArray[bz.llIllIllIII[2]] = llIllIllIII[13];
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (bz.lIlIlIlIIIllIl(projectile)) {
            return llIllIllIII[2];
        }
        if (bz.lIlIlIlIIlIIlI(llllllllllllllllIIlIllIIllIIlIlI.getId(), llIllIllIII[13])) {
            return llIllIllIII[14];
        }
        return llIllIllIII[15];
    }

    private static boolean lIlIlIlIIlIIII(Object object) {
        return object != null;
    }

    private static String lIlIlIlIIIlIII(String llllllllllllllllIIlIllIIlIlllIlI, String llllllllllllllllIIlIllIIlIlllIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIIlIlllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIIlIlllllI.init(llIllIllIII[3], llllllllllllllllIIlIllIIlIllllll);
            return new String(llllllllllllllllIIlIllIIlIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIIlIllllIl) {
            llllllllllllllllIIlIllIIlIllllIl.printStackTrace();
            return null;
        }
    }

    static {
        bz.lIlIlIlIIIlIlI();
        bz.lIlIlIlIIIlIIl();
        fM = llIllIllIII[12];
        fN = llIllIllIII[13];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean cl() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[llIllIllIII[2]];
                nArray[bz.llIllIllIII[0]] = llIllIllIII[11];
                if (!bz.lIlIlIlIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIllIllIII[2]];
                nArray2[bz.llIllIllIII[0]] = llIllIllIII[11];
                if (!bz.lIlIlIlIIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n2 = llIllIllIII[2];
            "".length();
            if (-" ".length() <= "  ".length()) return n2 != 0;
            return ((9 ^ 6) & ~(0x97 ^ 0x98) & ~((0x16 ^ 0x4D) & ~(0x5F ^ 4))) != 0;
        }
        n2 = llIllIllIII[0];
        return n2 != 0;
    }

    @Inject
    protected bz(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIlIlIIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIlIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlIlIIIlIIl() {
        llIllIlIlll = new String[llIllIllIII[21]];
        bz.llIllIlIlll[bz.llIllIllIII[0]] = bz.lIlIlIlIIIIlll("KgMhACQ=", "nqHnO");
        bz.llIllIlIlll[bz.llIllIllIII[2]] = bz.lIlIlIlIIIlIII("3d+hoM0s/RE=", "gcYfW");
        bz.llIllIlIlll[bz.llIllIllIII[3]] = bz.lIlIlIlIIIlIII("xwaxFDCj/O8=", "IUEke");
        bz.llIllIlIlll[bz.llIllIllIII[18]] = bz.lIlIlIlIIIIlll("GiU4HhotbSMCFSJtMgoCaSM4HExpNipLDTRtLBY=", "IMWkv");
        bz.llIllIlIlll[bz.llIllIllIII[19]] = bz.lIlIlIlIIIIlll("Ax0xLg0DHQ==", "qxBZb");
        bz.llIllIlIlll[bz.llIllIllIII[17]] = bz.lIlIlIlIIIlIII("nrELI/AkAuI=", "zOSCV");
        bz.llIllIlIlll[bz.llIllIllIII[20]] = bz.lIlIlIlIIIlIII("PmkcvKxnGI0=", "MXfsr");
    }
}

