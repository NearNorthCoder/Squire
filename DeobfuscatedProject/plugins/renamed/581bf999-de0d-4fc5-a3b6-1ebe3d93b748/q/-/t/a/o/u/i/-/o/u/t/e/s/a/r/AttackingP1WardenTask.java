/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
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
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bG_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Attacking p1 warden -> Attackingp1WardenTask */
@TaskDesc(name="Attacking p1 warden", priority=10)
public class AttackingP1WardenTask
extends bG_Unknown {
    private static /* synthetic */ int[] llIlllIIIlI;
    private static /* synthetic */ String[] llIllIllIIl;

    @Inject
    protected bF(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIlIlIllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIlllIlI(Object object) {
        return object == null;
    }

    private static String lIlIlIlIIlIlII(String var2, String var6) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIlllIIIlI[9]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIlllIIIlI[3], var5);
            return new String(var11.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIIlIlIl() {
        llIllIllIIl = new String[llIlllIIIlI[8]];
        bF.llIllIllIIl[bF.llIlllIIIlI[0]] = bF."Attack";
        bF.llIllIllIIl[bF.llIlllIIIlI[1]] = bF."Attack";
        bF.llIllIllIIl[bF.llIlllIIIlI[3]] = bF."Elidinis' Warden";
    }

    private static boolean lIlIlIlIlllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var14;
        NPC nPC = this.co();
        if (bF.lIlIlIlIlllIlI(nPC)) {
            return llIlllIIIlI[0];
        }
        String[] stringArray = new String[llIlllIIIlI[1]];
        stringArray[bF.llIlllIIIlI[0]] = llIllIllIIl[llIlllIIIlI[0]];
        if (bF.lIlIlIlIlllIll(var14.hasAction(stringArray) ? 1 : 0)) {
            return llIlllIIIlI[0];
        }
        this.bp();
        this.aY.a(llIlllIIIlI[2]);
        nPC.interact(llIllIllIIl[llIlllIIIlI[1]]);
        return llIlllIIIlI[1];
    }

    private static String lIlIlIlIIlIIll(String var12, String var1) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIlllIIIlI[3], var10);
            return new String(var9.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    static {
        bF.lIlIlIlIlllIIl();
        bF.lIlIlIlIIlIlIl();
    }

    private static boolean lIlIlIlIllllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIlIlIlllIIl() {
        llIlllIIIlI = new int[10];
        bF.llIlllIIIlI[0] = (0xB2 ^ 0x82) & ~(0x77 ^ 0x47);
        bF.llIlllIIIlI[1] = 1;
        bF.llIlllIIIlI[2] = 0x3D ^ 0x21;
        bF.llIlllIIIlI[3] = 2;
        bF.llIlllIIIlI[4] = -(0xFFFFD4DF & 0x3B33) & (0xFFFFBFFF & 0x7DFF);
        bF.llIlllIIIlI[5] = 0xFFFFADEA & Short.MAX_VALUE;
        bF.llIlllIIIlI[6] = 0xFFFFBFFD & 0x6DEE;
        bF.llIlllIIIlI[7] = -(0xFFFFB35F & 0x5EA1) & (0xFFFFFFF9 & 0x3FEF);
        bF.llIlllIIIlI[8] = 3;
        bF.llIlllIIIlI[9] = 147 + 82 - 100 + 36 ^ 15 + 38 - -17 + 103;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        bF var4;
        void var3;
        String[] stringArray = new String[llIlllIIIlI[1]];
        stringArray[bF.llIlllIIIlI[0]] = llIllIllIIl[llIlllIIIlI[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bF.lIlIlIlIlllIlI(nPC)) {
            return this.cW.mageP2Warden();
        }
        int var8 = var3.getId();
        if (!bF.lIlIlIlIllllII(var8, llIlllIIIlI[4]) || bF.lIlIlIlIllllIl(var8, llIlllIIIlI[5])) {
            return var4.cW.rangedP2Warden();
        }
        if (!bF.lIlIlIlIllllII(var8, llIlllIIIlI[6]) || bF.lIlIlIlIllllIl(var8, llIlllIIIlI[7])) {
            return var4.cW.mageP2Warden();
        }
        return this.cW.mageP2Warden();
    }
}

