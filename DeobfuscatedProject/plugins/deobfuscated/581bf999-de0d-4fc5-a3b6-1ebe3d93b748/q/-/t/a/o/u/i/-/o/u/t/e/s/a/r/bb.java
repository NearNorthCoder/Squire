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
            bb llllllllllllllllIlIIlllIIllIlIIl;
            configStorageBox = llllllllllllllllIlIIlllIIllIlIIl.cW.kephriRanger();
        }
        return configStorageBox;
    }

    private static boolean lIIllIIIllIllI(Object object) {
        return object == null;
    }

    private static String lIIllIIIlIlIlI(String llllllllllllllllIlIIlllIIIlIllll, String llllllllllllllllIlIIlllIIIllIIll) {
        llllllllllllllllIlIIlllIIIlIllll = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlllIIIllIIlI = new StringBuilder();
        char[] llllllllllllllllIlIIlllIIIllIIIl = llllllllllllllllIlIIlllIIIllIIll.toCharArray();
        int llllllllllllllllIlIIlllIIIllIIII = lIlllIIIlll[0];
        char[] llllllllllllllllIlIIlllIIIlIlIlI = llllllllllllllllIlIIlllIIIlIllll.toCharArray();
        int llllllllllllllllIlIIlllIIIlIlIIl = llllllllllllllllIlIIlllIIIlIlIlI.length;
        int llllllllllllllllIlIIlllIIIlIlIII = lIlllIIIlll[0];
        while (bb.lIIllIIIlllIII(llllllllllllllllIlIIlllIIIlIlIII, llllllllllllllllIlIIlllIIIlIlIIl)) {
            char llllllllllllllllIlIIlllIIIllIlIl = llllllllllllllllIlIIlllIIIlIlIlI[llllllllllllllllIlIIlllIIIlIlIII];
            llllllllllllllllIlIIlllIIIllIIlI.append((char)(llllllllllllllllIlIIlllIIIllIlIl ^ llllllllllllllllIlIIlllIIIllIIIl[llllllllllllllllIlIIlllIIIllIIII % llllllllllllllllIlIIlllIIIllIIIl.length]));
            0;
            ++llllllllllllllllIlIIlllIIIllIIII;
            ++llllllllllllllllIlIIlllIIIlIlIII;
            0;
            if (((0xA4 ^ 0xB9 ^ (0x71 ^ 0x2E)) & (0x5B ^ 0x4D ^ (0xD3 ^ 0x87) ^ -1)) >= -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIlllIIIllIIlI);
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

    private static String lIIllIIIlIlIll(String llllllllllllllllIlIIlllIIlIIIIlI, String llllllllllllllllIlIIlllIIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlllIIlIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlllIIlIIIllI.init(lIlllIIIlll[3], llllllllllllllllIlIIlllIIlIIIlll);
            return new String(llllllllllllllllIlIIlllIIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlllIIlIIIlIl) {
            llllllllllllllllIlIIlllIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIIlIlIIl(String llllllllllllllllIlIIlllIIlIIllll, String llllllllllllllllIlIIlllIIlIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIlllIIIlll[6]), "DES");
            Cipher llllllllllllllllIlIIlllIIlIlIIll = Cipher.getInstance("DES");
            llllllllllllllllIlIIlllIIlIlIIll.init(lIlllIIIlll[3], llllllllllllllllIlIIlllIIlIlIlII);
            return new String(llllllllllllllllIlIIlllIIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlllIIlIlIIlI) {
            llllllllllllllllIlIIlllIIlIlIIlI.printStackTrace();
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
        Object llllllllllllllllIlIIlllIIlIllllI;
        bb llllllllllllllllIlIIlllIIllIIIIl;
        void llllllllllllllllIlIIlllIIllIIIII;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bb.lIIllIIIllIlIl(List.of(lIlllIIIlII[lIlllIIIlll[3]], lIlllIIIlII[lIlllIIIlll[4]]).contains(nPC.getName()) ? 1 : 0) && bb.lIIllIIIllIlll(nPC.isDead() ? 1 : 0)) {
                n2 = lIlllIIIlll[2];
                0;
                if (((0xBF ^ 0xA0 ^ (0x57 ^ 0x67)) & (83 + 22 - -126 + 2 ^ 10 + 47 - -110 + 31 ^ -1)) > 0) {
                    return ((2 + 108 - 48 + 134 ^ 95 + 127 - 86 + 17) & (64 + 93 - 116 + 172 ^ 76 + 27 - 78 + 111 ^ -1)) != 0;
                }
            } else {
                n2 = lIlllIIIlll[0];
            }
            return n2 != 0;
        });
        if (bb.lIIllIIIllIllI(nPC2)) {
            return lIlllIIIlll[0];
        }
        llllllllllllllllIlIIlllIIllIIIIl.eC = llllllllllllllllIlIIlllIIllIIIII.getName().equals(lIlllIIIlII[lIlllIIIlll[0]]);
        if (bb.lIIllIIIllIlll(Reachable.isInteractable((Locatable)llllllllllllllllIlIIlllIIllIIIII) ? 1 : 0)) {
            int llllllllllllllllIlIIlllIIlIlllll2 = lIlllIIIlll[0];
            llllllllllllllllIlIIlllIIlIllllI = llllllllllllllllIlIIlllIIllIIIIl.cV.a(llllllllllllllllIlIIlllIIllIIIIl.br());
            int llllllllllllllllIlIIlllIIlIlllIl = ((Object)llllllllllllllllIlIIlllIIlIllllI).length;
            int llllllllllllllllIlIIlllIIlIlllII = lIlllIIIlll[0];
            while (bb.lIIllIIIlllIII(llllllllllllllllIlIIlllIIlIlllII, llllllllllllllllIlIIlllIIlIlllIl)) {
                Object llllllllllllllllIlIIlllIIlIllIll = llllllllllllllllIlIIlllIIlIllllI[llllllllllllllllIlIIlllIIlIlllII];
                if (bb.lIIllIIIlllIIl((int)llllllllllllllllIlIIlllIIlIllIll, lIlllIIIlll[1])) {
                    llllllllllllllllIlIIlllIIlIlllll2 = lIlllIIIlll[2];
                }
                ++llllllllllllllllIlIIlllIIlIlllII;
                0;
                if (-2 < 0) continue;
                return ((3 ^ 0x55 ^ (0x42 ^ 0x1A)) & (12 + 52 - 11 + 78 ^ 84 + 8 - -10 + 39 ^ -1)) != 0;
            }
            if (bb.lIIllIIIllIlll(llllllllllllllllIlIIlllIIlIlllll2)) {
                return lIlllIIIlll[0];
            }
        }
        if (bb.lIIllIIIlllIlI(llllllllllllllllIlIIlllIIlIlllll2 = Players.getLocal().getInteracting()) && bb.lIIllIIIllIlIl(llllllllllllllllIlIIlllIIlIlllll2.equals(llllllllllllllllIlIIlllIIllIIIII) ? 1 : 0)) {
            return lIlllIIIlll[2];
        }
        llllllllllllllllIlIIlllIIlIllllI = llllllllllllllllIlIIlllIIllIIIIl.bU();
        WorldPoint llllllllllllllllIlIIlllIIlIlllIl = Players.getLocal().getWorldLocation();
        if (bb.lIIllIIIllIlll(llllllllllllllllIlIIlllIIlIllllI.isEmpty() ? 1 : 0) && (!bb.lIIllIIIllIlll(llllllllllllllllIlIIlllIIlIllllI.contains(llllllllllllllllIlIIlllIIlIlllIl) ? 1 : 0) || bb.lIIllIIIllIlll(llllllllllllllllIlIIlllIIllIIIII.getWorldArea().isInMeleeDistance(llllllllllllllllIlIIlllIIlIlllIl) ? 1 : 0))) {
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

