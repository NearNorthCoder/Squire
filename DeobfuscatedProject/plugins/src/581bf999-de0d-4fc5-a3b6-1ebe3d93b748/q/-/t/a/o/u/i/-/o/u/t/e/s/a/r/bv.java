/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.by;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking Obelisk", priority=50)
public class bv
extends by {
    private static /* synthetic */ String[] lIllIllIIll;
    private static /* synthetic */ int[] lIllIllIlIl;

    private static void lIIlIllllIlIll() {
        lIllIllIIll = new String[lIllIllIlIl[4]];
        bv.lIllIllIIll[bv.lIllIllIlIl[1]] = bv.lIIlIllllIlIII("KSnsTCthHPo=", "ftVMY");
        bv.lIllIllIIll[bv.lIllIllIlIl[0]] = bv.lIIlIllllIlIIl("k5h4rRRakdc=", "BtJpk");
    }

    private static boolean lIIlIllllIllll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIllllIlIIl(String llllllllllllllllIlIlIIIIlIlIllll, String llllllllllllllllIlIlIIIIlIlIllII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIIlIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIIIlIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIIIlIllIIIl.init(lIllIllIlIl[4], llllllllllllllllIlIlIIIIlIllIIlI);
            return new String(llllllllllllllllIlIlIIIIlIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIIlIllIIII) {
            llllllllllllllllIlIlIIIIlIllIIII.printStackTrace();
            return null;
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean bq() {
        int n2;
        block3: {
            block2: {
                if (!bv.lIIlIlllllIIll(Combat.getSpecEnergy(), lIllIllIlIl[2])) break block2;
                int[] nArray = new int[lIllIllIlIl[0]];
                nArray[bv.lIllIllIlIl[1]] = lIllIllIlIl[3];
                if (!bv.lIIlIlllllIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            n2 = lIllIllIlIl[0];
            "".length();
            if (((0xD5 ^ 0x97) & ~(5 ^ 0x47)) == 0) return n2 != 0;
            return ((0xB9 ^ 0x96) & ~(0x18 ^ 0x37)) != 0;
        }
        n2 = lIllIllIlIl[1];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        TileObject llllllllllllllllIlIlIIIIlIllIlll;
        void llllllllllllllllIlIlIIIIlIlllIII;
        bv llllllllllllllllIlIlIIIIlIlllIIl;
        String[] stringArray = new String[lIllIllIlIl[0]];
        stringArray[bv.lIllIllIlIl[1]] = lIllIllIIll[lIllIllIlIl[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bv.lIIlIllllIlllI(nPC)) {
            return lIllIllIlIl[1];
        }
        if (bv.lIIlIllllIllll(llllllllllllllllIlIlIIIIlIlllIIl.aY.g() ? 1 : 0)) {
            return lIllIllIlIl[1];
        }
        llllllllllllllllIlIlIIIIlIlllIIl.a((NPC)llllllllllllllllIlIlIIIIlIlllIII, lIllIllIlIl[0]);
        "".length();
        if (bv.lIIlIlllllIIII(llllllllllllllllIlIlIIIIlIlllIIl.bg(), lIllIllIlIl[0]) && bv.lIIlIlllllIIIl(llllllllllllllllIlIlIIIIlIlllIII.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && bv.lIIlIlllllIIlI(llllllllllllllllIlIlIIIIlIllIlll = TileObjects.getNearest(tileObject -> fH.contains(tileObject.getId())))) {
            return lIllIllIlIl[1];
        }
        nPC.interact(lIllIllIIll[lIllIllIlIl[0]]);
        return lIllIllIlIl[0];
    }

    private static String lIIlIllllIlIII(String llllllllllllllllIlIlIIIIlIlIIIII, String llllllllllllllllIlIlIIIIlIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIIlIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIllIllIlIl[5]), "DES");
            Cipher llllllllllllllllIlIlIIIIlIlIIlII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIIlIlIIlII.init(lIllIllIlIl[4], llllllllllllllllIlIlIIIIlIlIIlIl);
            return new String(llllllllllllllllIlIlIIIIlIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIIlIlIIIll) {
            llllllllllllllllIlIlIIIIlIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllllIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlllllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected bv(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.obeliskGear();
    }

    private static void lIIlIllllIllIl() {
        lIllIllIlIl = new int[6];
        bv.lIllIllIlIl[0] = " ".length();
        bv.lIllIllIlIl[1] = (0x2B ^ 0x48) & ~(0xC5 ^ 0xA6);
        bv.lIllIllIlIl[2] = 133 + 188 - 293 + 193 ^ 37 + 2 - -28 + 118;
        bv.lIllIllIlIl[3] = -(0xFFFFD3DD & 0x3EA3) & (0xFFFFF7FF & 0x7FF7);
        bv.lIllIllIlIl[4] = "  ".length();
        bv.lIllIllIlIl[5] = 8 + 64 - 22 + 106 ^ 139 + 132 - 189 + 66;
    }

    private static boolean lIIlIlllllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        bv.lIIlIllllIllIl();
        bv.lIIlIllllIlIll();
    }

    private static boolean lIIlIllllIlllI(Object object) {
        return object == null;
    }
}

