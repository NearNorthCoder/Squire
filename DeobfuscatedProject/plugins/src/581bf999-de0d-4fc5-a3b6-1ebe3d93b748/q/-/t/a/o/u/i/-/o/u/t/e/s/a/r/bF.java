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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bG;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking p1 warden", priority=10)
public class bF
extends bG {
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

    private static String lIlIlIlIIlIlII(String llllllllllllllllIIlIlIllIllIIllI, String llllllllllllllllIIlIlIllIllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIllIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIllIllIIlIl.getBytes(StandardCharsets.UTF_8)), llIlllIIIlI[9]), "DES");
            Cipher llllllllllllllllIIlIlIllIllIlIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIllIllIlIlI.init(llIlllIIIlI[3], llllllllllllllllIIlIlIllIllIlIll);
            return new String(llllllllllllllllIIlIlIllIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIllIllIlIIl) {
            llllllllllllllllIIlIlIllIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIIlIlIl() {
        llIllIllIIl = new String[llIlllIIIlI[8]];
        bF.llIllIllIIl[bF.llIlllIIIlI[0]] = bF.lIlIlIlIIlIIll("LR2LVg2zY9A=", "RSSdr");
        bF.llIllIllIIl[bF.llIlllIIIlI[1]] = bF.lIlIlIlIIlIIll("tSC8vXIvdbE=", "kHfpg");
        bF.llIllIllIIl[bF.llIlllIIIlI[3]] = bF.lIlIlIlIIlIlII("cysRlSUCWSziqAsSz/VqC4KJaKwD1asm", "cxbqf");
    }

    private static boolean lIlIlIlIlllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void llllllllllllllllIIlIlIllIlllIllI;
        NPC nPC = this.co();
        if (bF.lIlIlIlIlllIlI(nPC)) {
            return llIlllIIIlI[0];
        }
        String[] stringArray = new String[llIlllIIIlI[1]];
        stringArray[bF.llIlllIIIlI[0]] = llIllIllIIl[llIlllIIIlI[0]];
        if (bF.lIlIlIlIlllIll(llllllllllllllllIIlIlIllIlllIllI.hasAction(stringArray) ? 1 : 0)) {
            return llIlllIIIlI[0];
        }
        this.bp();
        this.aY.a(llIlllIIIlI[2]);
        nPC.interact(llIllIllIIl[llIlllIIIlI[1]]);
        return llIlllIIIlI[1];
    }

    private static String lIlIlIlIIlIIll(String llllllllllllllllIIlIlIllIlIllIll, String llllllllllllllllIIlIlIllIlIllIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIllIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIllIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIllIlIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIllIlIlllIl.init(llIlllIIIlI[3], llllllllllllllllIIlIlIllIlIllllI);
            return new String(llllllllllllllllIIlIlIllIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIllIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIllIlIlllII) {
            llllllllllllllllIIlIlIllIlIlllII.printStackTrace();
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
        bF.llIlllIIIlI[1] = " ".length();
        bF.llIlllIIIlI[2] = 0x3D ^ 0x21;
        bF.llIlllIIIlI[3] = "  ".length();
        bF.llIlllIIIlI[4] = -(0xFFFFD4DF & 0x3B33) & (0xFFFFBFFF & 0x7DFF);
        bF.llIlllIIIlI[5] = 0xFFFFADEA & Short.MAX_VALUE;
        bF.llIlllIIIlI[6] = 0xFFFFBFFD & 0x6DEE;
        bF.llIlllIIIlI[7] = -(0xFFFFB35F & 0x5EA1) & (0xFFFFFFF9 & 0x3FEF);
        bF.llIlllIIIlI[8] = "   ".length();
        bF.llIlllIIIlI[9] = 147 + 82 - 100 + 36 ^ 15 + 38 - -17 + 103;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        bF llllllllllllllllIIlIlIllIlllIIlI;
        void llllllllllllllllIIlIlIllIlllIIIl;
        String[] stringArray = new String[llIlllIIIlI[1]];
        stringArray[bF.llIlllIIIlI[0]] = llIllIllIIl[llIlllIIIlI[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bF.lIlIlIlIlllIlI(nPC)) {
            return this.cW.mageP2Warden();
        }
        int llllllllllllllllIIlIlIllIlllIIII = llllllllllllllllIIlIlIllIlllIIIl.getId();
        if (!bF.lIlIlIlIllllII(llllllllllllllllIIlIlIllIlllIIII, llIlllIIIlI[4]) || bF.lIlIlIlIllllIl(llllllllllllllllIIlIlIllIlllIIII, llIlllIIIlI[5])) {
            return llllllllllllllllIIlIlIllIlllIIlI.cW.rangedP2Warden();
        }
        if (!bF.lIlIlIlIllllII(llllllllllllllllIIlIlIllIlllIIII, llIlllIIIlI[6]) || bF.lIlIlIlIllllIl(llllllllllllllllIIlIlIllIlllIIII, llIlllIIIlI[7])) {
            return llllllllllllllllIIlIlIllIlllIIlI.cW.mageP2Warden();
        }
        return this.cW.mageP2Warden();
    }
}

