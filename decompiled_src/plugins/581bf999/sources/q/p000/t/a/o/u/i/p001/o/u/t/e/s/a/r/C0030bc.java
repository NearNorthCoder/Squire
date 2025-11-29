package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
import net.runelite.api.NPC;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Attacking kephri swarm (medic)", priority = 12, register = true, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bc  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bc.class */
public class C0030bc extends AbstractC0035bh {
    private final /* synthetic */ Set<NPC> eD;
    private static /* synthetic */ int[] lIllllIIlll;
    private /* synthetic */ NPC eE;
    private static /* synthetic */ String[] lIllllIIllI;

    private static String lIIllIlIlIIIlI(String llllllllllllllllIlIIlIllIIIllIlI, String llllllllllllllllIlIIlIllIIIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIllIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIllIIIlIlll.getBytes(StandardCharsets.UTF_8)), lIllllIIlll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIIlll[3], llllllllllllllllIlIIlIllIIIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIllIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIllIIIllIll) {
            llllllllllllllllIlIIlIllIIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIlIIllI(Object obj) {
        return obj != null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.gearSwapZebak();
    }

    private static boolean lIIllIlIlIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllIlIlIlIIl(int i) {
        return i == 0;
    }

    static {
        lIIllIlIlIIlII();
        lIIllIlIlIIIll();
    }

    private static void lIIllIlIlIIlII() {
        lIllllIIlll = new int[5];
        lIllllIIlll[0] = (-2093) & 4014;
        lIllllIIlll[1] = ((((89 + 33) - 120) + 175) ^ (((153 + 89) - 222) + 152)) & (((133 ^ 162) ^ (81 ^ 107)) ^ (-" ".length()));
        lIllllIIlll[2] = " ".length();
        lIllllIIlll[3] = "  ".length();
        lIllllIIlll[4] = (47 ^ 94) ^ (117 ^ 12);
    }

    private static boolean lIIllIlIlIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        if (lIIllIlIlIIlll(bR() ? 1 : 0)) {
            return lIllllIIlll[1];
        }
        NPC bO = bO();
        NPC npc = (NPC) NPCs.getAll(npc2 -> {
            if (lIIllIlIlIIlll(npc2.getName().equals(lIllllIIllI[lIllllIIlll[2]]) ? 1 : 0) && lIIllIlIlIlIIl(this.eD.contains(npc2) ? 1 : 0) && lIIllIlIlIlIIl(npc2.isDead() ? 1 : 0) && lIIllIlIlIlIlI(npc2.distanceTo(bO), lIllllIIlll[2])) {
                ?? r0 = lIllllIIlll[2];
                "".length();
                return " ".length() != " ".length() ? ((164 ^ 176) ^ "  ".length()) & (((120 ^ 77) ^ (85 ^ 118)) ^ (-" ".length())) : r0;
            }
            return lIllllIIlll[1];
        }).stream().filter(npc3 -> {
            if (lIIllIlIlIlIIl(bO.getWorldArea().isInMeleeDistance(npc3.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIllllIIlll[2];
                "".length();
                return ((64 ^ 19) & ((88 ^ 11) ^ (-1))) >= (70 ^ 66) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllIIlll[1];
        }).min(Comparator.comparingInt(npc4 -> {
            return npc4.getWorldLocation().distanceToPath(this.cu, Players.getLocal().getWorldLocation());
        })).orElse(null);
        if (lIIllIlIlIlIII(npc)) {
            return lIllllIIlll[1];
        }
        bp();
        npc.interact(lIllllIIllI[lIllllIIlll[1]]);
        this.eE = npc;
        if (lIIllIlIlIlIIl(bV() ? 1 : 0) && lIIllIlIlIlIIl(bR() ? 1 : 0)) {
            ?? r0 = lIllllIIlll[2];
            "".length();
            return " ".length() >= (73 ^ 77) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllllIIlll[1];
    }

    private static boolean lIIllIlIlIIlIl(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (lIIllIlIlIIlIl(projectileSpawned.getProjectile().getId(), lIllllIIlll[0]) && lIIllIlIlIIllI(this.eE)) {
            this.eD.add(this.eE);
            "".length();
            this.eE = null;
        }
    }

    @Inject
    protected C0030bc(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig, EnumC0036bi.ATTACK);
        this.eD = new HashSet();
    }

    private static boolean lIIllIlIlIlIII(Object obj) {
        return obj == null;
    }

    private static void lIIllIlIlIIIll() {
        lIllllIIllI = new String[lIllllIIlll[3]];
        lIllllIIllI[lIllllIIlll[1]] = lIIllIlIlIIIlI("s6xgmVwibAQ=", "nSZiO");
        lIllllIIllI[lIllllIIlll[2]] = lIIllIlIlIIIlI("eDUttDJ7IXYN7Tqai0r3Dw==", "YoCQK");
    }
}
