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

/* TASK: Attacking Obelisk -> AttackingobeliskTask */
@TaskDesc(name="Attacking Obelisk", priority=50)
public class bv
extends by {
    private static /* synthetic */ String[] lIllIllIIll;
    private static /* synthetic */ int[] lIllIllIlIl;

    private static void lIIlIllllIlIll() {
        lIllIllIIll = new String[lIllIllIlIl[4]];
        bv.lIllIllIIll[bv.lIllIllIlIl[1]] = bv."Obelisk";
        bv.lIllIllIIll[bv.lIllIllIlIl[0]] = bv."Attack";
    }

    private static boolean lIIlIllllIllll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIllllIlIIl(String var1, String var10) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIllIllIlIl[4], var5);
            return new String(var11.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
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
            0;
            if (((0xD5 ^ 0x97) & ~(5 ^ 0x47)) == 0) return n2 != 0;
            return false;
        }
        n2 = lIllIllIlIl[1];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        TileObject var2;
        void var13;
        bv var6;
        String[] stringArray = new String[lIllIllIlIl[0]];
        stringArray[bv.lIllIllIlIl[1]] = lIllIllIIll[lIllIllIlIl[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bv.lIIlIllllIlllI(nPC)) {
            return lIllIllIlIl[1];
        }
        if (bv.lIIlIllllIllll(var6.aY.g() ? 1 : 0)) {
            return lIllIllIlIl[1];
        }
        var6.a((NPC)var13, lIllIllIlIl[0]);
        0;
        if (bv.lIIlIlllllIIII(var6.bg(), lIllIllIlIl[0]) && bv.lIIlIlllllIIIl(var13.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && bv.lIIlIlllllIIlI(var2 = TileObjects.getNearest(tileObject -> fH.contains(tileObject.getId())))) {
            return lIllIllIlIl[1];
        }
        nPC.interact(lIllIllIIll[lIllIllIlIl[0]]);
        return lIllIllIlIl[0];
    }

    private static String lIIlIllllIlIII(String var3, String var4) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIllIllIlIl[5]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIllIllIlIl[4], var7);
            return new String(var12.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
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
        bv.lIllIllIlIl[0] = 1;
        bv.lIllIllIlIl[1] = (0x2B ^ 0x48) & ~(0xC5 ^ 0xA6);
        bv.lIllIllIlIl[2] = 133 + 188 - 293 + 193 ^ 37 + 2 - -28 + 118;
        bv.lIllIllIlIl[3] = -(0xFFFFD3DD & 0x3EA3) & (0xFFFFF7FF & 0x7FF7);
        bv.lIllIllIlIl[4] = 2;
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

