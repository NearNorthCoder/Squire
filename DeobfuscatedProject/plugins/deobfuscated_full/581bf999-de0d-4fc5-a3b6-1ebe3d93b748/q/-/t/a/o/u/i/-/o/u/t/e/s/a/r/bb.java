/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@Singleton
/* TASK: Attacking melee scarab -> AttackingmeleescarabTask */
@TaskDesc(name="Attacking melee scarab", priority=16, blocking=true)
public class bb
extends bh {
    private static /* synthetic */ String[] lIlllIIIlII;
    private /* synthetic */ boolean eC;
    private static /* synthetic */ int[] lIlllIIIlll;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        if (bb.lIIllIIIllIlIl(this.eC ? 1 : 0)) {
            configStorageBox = this.cW.kephriMelee();
            0;
            if (3 < 0) {
                return null;
            }
        } else {
            bb var22;
            configStorageBox = var22.cW.kephriRanger();
        }
        return configStorageBox;
    }

    private static boolean lIIllIIIllIllI(Object object) {
        return object == null;
    }

    private static String lIIllIIIlIlIlI(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var26 = var25.toCharArray();
        int var21 = lIlllIIIlll[0];
        char[] var20 = var24.toCharArray();
        int var5 = var20.length;
        int var7 = lIlllIIIlll[0];
        while (bb.lIIllIIIlllIII(var7, var5)) {
            char var13 = var20[var7];
            var6.append((char)(var13 ^ var26[var21 % var26.length]));
            0;
            ++var21;
            ++var7;
            0;
            if (((0xA4 ^ 0xB9 ^ (0x71 ^ 0x2E)) & (0x5B ^ 0x4D ^ (0xD3 ^ 0x87) ^ -1)) >= -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void lIIllIIIlIlllI() {
        lIlllIIIlII = new String[lIlllIIIlll[5]];
        bb.lIlllIIIlII[bb.lIlllIIIlll[0]] = bb."Soldier Scarab";
        bb.lIlllIIIlII[bb.lIlllIIIlll[2]] = bb."Attack";
        bb.lIlllIIIlII[bb.lIlllIIIlll[3]] = bb."Spitting Scarab";
        bb.lIlllIIIlII[bb.lIlllIIIlll[4]] = bb."Soldier Scarab";
    }

    static {
        bb.lIIllIIIllIlII();
        bb.lIIllIIIlIlllI();
    }

    private static boolean lIIllIIIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIIlllIlI(Object object) {
        return object != null;
    }

    private static boolean lIIllIIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllIIIlIlIll(String var1, String var4) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlllIIIlll[3], var8);
            return new String(var16.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIIlIlIIl(String var9, String var15) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIlllIIIlll[6]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlllIIIlll[3], var18);
            return new String(var17.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bb(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, null);
    }

    private static boolean lIIllIIIllIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        Actor llllllllllllllllIlIIlllIIlIlllll2;
        Object var10;
        bb var23;
        void var2;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bb.lIIllIIIllIlIl(List.of(lIlllIIIlII[lIlllIIIlll[3]], lIlllIIIlII[lIlllIIIlll[4]]).contains(nPC.getName()) ? 1 : 0) && bb.lIIllIIIllIlll(nPC.isDead() ? 1 : 0)) {
                n2 = lIlllIIIlll[2];
                0;
                if (((0xBF ^ 0xA0 ^ (0x57 ^ 0x67)) & (83 + 22 - -126 + 2 ^ 10 + 47 - -110 + 31 ^ -1)) > 0) {
                    return false;
                }
            } else {
                n2 = lIlllIIIlll[0];
            }
            return n2 != 0;
        });
        if (bb.lIIllIIIllIllI(nPC2)) {
            return lIlllIIIlll[0];
        }
        var23.eC = var2.getName().equals(lIlllIIIlII[lIlllIIIlll[0]]);
        if (bb.lIIllIIIllIlll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            int llllllllllllllllIlIIlllIIlIlllll2 = lIlllIIIlll[0];
            var10 = var23.cV.a(var23.br());
            int var12 = ((Object)var10).length;
            int var14 = lIlllIIIlll[0];
            while (bb.lIIllIIIlllIII(var14, var12)) {
                Object var19 = var10[var14];
                if (bb.lIIllIIIlllIIl((int)var19, lIlllIIIlll[1])) {
                    llllllllllllllllIlIIlllIIlIlllll2 = lIlllIIIlll[2];
                }
                ++var14;
                0;
                if (-2 < 0) continue;
                return ((3 ^ 0x55 ^ (0x42 ^ 0x1A)) & (12 + 52 - 11 + 78 ^ 84 + 8 - -10 + 39 ^ -1)) != 0;
            }
            if (bb.lIIllIIIllIlll(llllllllllllllllIlIIlllIIlIlllll2)) {
                return lIlllIIIlll[0];
            }
        }
        if (bb.lIIllIIIlllIlI(llllllllllllllllIlIIlllIIlIlllll2 = Players.getLocal().getInteracting()) && bb.lIIllIIIllIlIl(llllllllllllllllIlIIlllIIlIlllll2.equals(var2) ? 1 : 0)) {
            return lIlllIIIlll[2];
        }
        var10 = var23.bU();
        WorldPoint var12 = Players.getLocal().getWorldLocation();
        if (bb.lIIllIIIllIlll(var10.isEmpty() ? 1 : 0) && (!bb.lIIllIIIllIlll(var10.contains(var12) ? 1 : 0) || bb.lIIllIIIllIlll(var2.getWorldArea().isInMeleeDistance(var12) ? 1 : 0))) {
            return lIlllIIIlll[2];
        }
        this.bp();
        nPC2.interact(lIlllIIIlII[lIlllIIIlll[2]]);
        return lIlllIIIlll[2];
    }

    private static void lIIllIIIllIlII() {
        lIlllIIIlll = new int[7];
        bb.lIlllIIIlll[0] = (0xA2 ^ 0xBA) & ~(0x84 ^ 0x9C);
        bb.lIlllIIIlll[1] = -(0xFFFFBE77 & 0x459D) & (0xFFFFFFFF & 0x6E9F);
        bb.lIlllIIIlll[2] = 1;
        bb.lIlllIIIlll[3] = 2;
        bb.lIlllIIIlll[4] = 3;
        bb.lIlllIIIlll[5] = 36 + 104 - -32 + 2 ^ 64 + 129 - 177 + 154;
        bb.lIlllIIIlll[6] = 0x9F ^ 0xBD ^ (0x6B ^ 0x41);
    }

    private static boolean lIIllIIIlllIIl(int n2, int n3) {
        return n2 == n3;
    }
}

