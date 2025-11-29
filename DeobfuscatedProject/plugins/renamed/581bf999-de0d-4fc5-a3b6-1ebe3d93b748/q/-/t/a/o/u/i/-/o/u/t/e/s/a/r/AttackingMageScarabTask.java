/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Attacking mage scarab -> AttackingmagescarabTask */
@TaskDesc(name="Attacking mage scarab", priority=25, blocking=true)
public class AttackingMageScarabTask
extends bh_Unknown {
    private static /* synthetic */ String[] llIIlIlIlIl;
    private static /* synthetic */ int[] llIIlIlIllI;

    private static void lIlIIIIlIIIlll() {
        llIIlIlIlIl = new String[llIIlIlIllI[2]];
        ba.llIIlIlIlIl[ba.llIIlIlIllI[0]] = ba."Attack";
        ba.llIIlIlIlIl[ba.llIIlIlIllI[1]] = ba."Arcane Scarab";
    }

    private static boolean lIlIIIIlIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIlIIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIlIIIIlIIIllI(String var16, String var6) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIIlIlIllI[2], var13);
            return new String(var14.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Inject
    protected ba(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        ba.lIlIIIIlIIlIII();
        ba.lIlIIIIlIIIlll();
    }

    private static boolean lIlIIIIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriMager();
    }

    private static boolean lIlIIIIlIIlIlI(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIlIIllII(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIIlIIlIII() {
        llIIlIlIllI = new int[3];
        ba.llIIlIlIllI[0] = (0x21 ^ 0x64) & ~(0x7A ^ 0x3F);
        ba.llIIlIlIllI[1] = 1;
        ba.llIIlIlIllI[2] = 2;
    }

    private static String lIlIIIIlIIIlIl(String var9, String var1) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var7 = var1.toCharArray();
        int var3 = llIIlIlIllI[0];
        char[] var8 = var9.toCharArray();
        int var10 = var8.length;
        int var12 = llIIlIlIllI[0];
        while (ba.lIlIIIIlIIllIl(var12, var10)) {
            char var2 = var8[var12];
            var5.append((char)(var2 ^ var7[var3 % var7.length]));
            0;
            ++var3;
            ++var12;
            0;
            if (((0xCC ^ 0x98) & ~(0x3E ^ 0x6A)) < (0x38 ^ 0x3C)) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var11;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (ba.lIlIIIIlIIlIll(nPC.getName().equals(llIIlIlIlIl[llIIlIlIllI[1]]) ? 1 : 0) && ba.lIlIIIIlIIllII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIlIllI[1];
                0;
                if (((44 + 162 - 194 + 202 ^ 36 + 6 - -27 + 65) & (123 + 89 - 190 + 186 ^ 98 + 42 - 57 + 45 ^ -1)) > 0) {
                    return ((39 + 3 - -9 + 93 ^ 42 + 61 - 28 + 61) & (0x2F ^ 0x10 ^ (0x61 ^ 0x46) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIlIllI[0];
            }
            return n2 != 0;
        });
        if (ba.lIlIIIIlIIlIIl(nPC2)) {
            return llIIlIlIllI[0];
        }
        Actor var4 = Players.getLocal().getInteracting();
        if (ba.lIlIIIIlIIlIlI(var4) && ba.lIlIIIIlIIlIll(var4.equals(var11) ? 1 : 0)) {
            return llIIlIlIllI[1];
        }
        this.bp();
        nPC2.interact(llIIlIlIlIl[llIIlIlIllI[0]]);
        return llIIlIlIllI[1];
    }
}

