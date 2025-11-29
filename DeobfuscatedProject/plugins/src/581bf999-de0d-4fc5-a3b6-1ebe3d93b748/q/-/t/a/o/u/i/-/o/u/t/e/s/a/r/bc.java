/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bi;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking kephri swarm (medic)", priority=12, register=true, blocking=true)
public class bc
extends bh {
    private final /* synthetic */ Set<NPC> eD;
    private static /* synthetic */ int[] lIllllIIlll;
    private /* synthetic */ NPC eE;
    private static /* synthetic */ String[] lIllllIIllI;

    private static String lIIllIlIlIIIlI(String llllllllllllllllIlIIlIllIIIllIlI, String llllllllllllllllIlIIlIllIIIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIllIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIllIIIllIIl.getBytes(StandardCharsets.UTF_8)), lIllllIIlll[4]), "DES");
            Cipher llllllllllllllllIlIIlIllIIIlllII = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIllIIIlllII.init(lIllllIIlll[3], llllllllllllllllIlIIlIllIIIlllIl);
            return new String(llllllllllllllllIlIIlIllIIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIllIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIllIIIllIll) {
            llllllllllllllllIlIIlIllIIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIlIIllI(Object object) {
        return object != null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.gearSwapZebak();
    }

    private static boolean lIIllIlIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIlIlIlIIl(int n2) {
        return n2 == 0;
    }

    static {
        bc.lIIllIlIlIIlII();
        bc.lIIllIlIlIIIll();
    }

    private static void lIIllIlIlIIlII() {
        lIllllIIlll = new int[5];
        bc.lIllllIIlll[0] = 0xFFFFF7D3 & 0xFAE;
        bc.lIllllIIlll[1] = (89 + 33 - 120 + 175 ^ 153 + 89 - 222 + 152) & (0x85 ^ 0xA2 ^ (0x51 ^ 0x6B) ^ -" ".length());
        bc.lIllllIIlll[2] = " ".length();
        bc.lIllllIIlll[3] = "  ".length();
        bc.lIllllIIlll[4] = 0x2F ^ 0x5E ^ (0x75 ^ 0xC);
    }

    private static boolean lIIllIlIlIIlll(int n2) {
        return n2 != 0;
    }

    @Override
    protected boolean bL() {
        int n2;
        bc llllllllllllllllIlIIlIllIIlIlllI;
        if (bc.lIIllIlIlIIlll(this.bR() ? 1 : 0)) {
            return lIllllIIlll[1];
        }
        NPC llllllllllllllllIlIIlIllIIlIllIl = llllllllllllllllIlIIlIllIIlIlllI.bO();
        NPC llllllllllllllllIlIIlIllIIlIllII = NPCs.getAll(nPC2 -> {
            int n2;
            if (bc.lIIllIlIlIIlll(nPC2.getName().equals(lIllllIIllI[lIllllIIlll[2]]) ? 1 : 0) && bc.lIIllIlIlIlIIl(this.eD.contains(nPC2) ? 1 : 0) && bc.lIIllIlIlIlIIl(nPC2.isDead() ? 1 : 0) && bc.lIIllIlIlIlIlI(nPC2.distanceTo((Locatable)llllllllllllllllIlIIlIllIIlIllIl), lIllllIIlll[2])) {
                n2 = lIllllIIlll[2];
                "".length();
                if (" ".length() != " ".length()) {
                    return ((0xA4 ^ 0xB0 ^ "  ".length()) & (0x78 ^ 0x4D ^ (0x55 ^ 0x76) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIllllIIlll[1];
            }
            return n2 != 0;
        }).stream().filter(nPC2 -> {
            boolean bl2;
            if (bc.lIIllIlIlIlIIl(llllllllllllllllIlIIlIllIIlIllIl.getWorldArea().isInMeleeDistance(nPC2.getWorldLocation()) ? 1 : 0)) {
                bl2 = lIllllIIlll[2];
                "".length();
                if (((0x40 ^ 0x13) & ~(0x58 ^ 0xB)) >= (0x46 ^ 0x42)) {
                    return ((0xF1 ^ 0xB7) & ~(0x1E ^ 0x58)) != 0;
                }
            } else {
                bl2 = lIllllIIlll[1];
            }
            return bl2;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceToPath(this.cu, Players.getLocal().getWorldLocation()))).orElse(null);
        if (bc.lIIllIlIlIlIII(llllllllllllllllIlIIlIllIIlIllII)) {
            return lIllllIIlll[1];
        }
        llllllllllllllllIlIIlIllIIlIlllI.bp();
        llllllllllllllllIlIIlIllIIlIllII.interact(lIllllIIllI[lIllllIIlll[1]]);
        llllllllllllllllIlIIlIllIIlIlllI.eE = llllllllllllllllIlIIlIllIIlIllII;
        if (bc.lIIllIlIlIlIIl(bc.bV() ? 1 : 0) && bc.lIIllIlIlIlIIl(llllllllllllllllIlIIlIllIIlIlllI.bR() ? 1 : 0)) {
            n2 = lIllllIIlll[2];
            "".length();
            if (" ".length() >= (0x49 ^ 0x4D)) {
                return ((0xE5 ^ 0xBD) & ~(0x2D ^ 0x75)) != 0;
            }
        } else {
            n2 = lIllllIIlll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIllIlIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (bc.lIIllIlIlIIlIl(projectileSpawned.getProjectile().getId(), lIllllIIlll[0]) && bc.lIIllIlIlIIllI(this.eE)) {
            this.eD.add(this.eE);
            "".length();
            this.eE = null;
        }
    }

    @Inject
    protected bc(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
        this.eD = new HashSet<NPC>();
    }

    private static boolean lIIllIlIlIlIII(Object object) {
        return object == null;
    }

    private static void lIIllIlIlIIIll() {
        lIllllIIllI = new String[lIllllIIlll[3]];
        bc.lIllllIIllI[bc.lIllllIIlll[1]] = bc.lIIllIlIlIIIlI("s6xgmVwibAQ=", "nSZiO");
        bc.lIllllIIllI[bc.lIllllIIlll[2]] = bc.lIIllIlIlIIIlI("eDUttDJ7IXYN7Tqai0r3Dw==", "YoCQK");
    }
}

