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
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@Singleton
@TaskDesc(name = "Attacking swarms", priority = 15, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bd  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bd.class */
public class C0031bd extends AbstractC0035bh {
    private static /* synthetic */ String[] llIIllIIlIl;
    private final /* synthetic */ Set<NPC> eF;
    private static /* synthetic */ int[] llIIllIIllI;

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriSwarm();
    }

    @Inject
    protected C0031bd(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig, EnumC0036bi.SWARM);
        this.eF = new HashSet();
    }

    private static boolean lIlIIIlIIllIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIIlIIllIlI(Object obj) {
        return obj != null;
    }

    private static void lIlIIIlIIlIllI() {
        llIIllIIlIl = new String[llIIllIIllI[4]];
        llIIllIIlIl[llIIllIIllI[0]] = lIlIIIlIIlIIll("PejjrqN1Qx8=", "JEWiR");
        llIIllIIlIl[llIIllIIllI[2]] = lIlIIIlIIlIlII("KTkqIw0YehgmDQg3", "zZKQl");
        llIIllIIlIl[llIIllIIllI[3]] = lIlIIIlIIlIlIl("vfcMkNEMsMQ/xe1SX8FRjA==", "FRCES");
    }

    private static void lIlIIIlIIlIlll() {
        llIIllIIllI = new int[6];
        llIIllIIllI[0] = (131 ^ 142) & ((54 ^ 59) ^ (-1));
        llIIllIIllI[1] = 85 ^ 80;
        llIIllIIllI[2] = " ".length();
        llIIllIIllI[3] = "  ".length();
        llIIllIIllI[4] = "   ".length();
        llIIllIIllI[5] = (47 ^ 103) ^ (225 ^ 161);
    }

    private static boolean lIlIIIlIIllIll(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        this.eF.remove(npcDespawned.getNpc());
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        NPC bO = bO();
        NPC npc = (NPC) NPCs.getAll(npc2 -> {
            if (lIlIIIlIIllIll(npc2.getName().equals(llIIllIIlIl[llIIllIIllI[3]]) ? 1 : 0) && lIlIIIlIIlllII(this.eF.contains(npc2) ? 1 : 0) && lIlIIIlIIlllII(npc2.isDead() ? 1 : 0) && lIlIIIlIIllIIl(npc2.distanceTo(bO), llIIllIIllI[4])) {
                ?? r0 = llIIllIIllI[2];
                "".length();
                return (83 ^ 86) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllIIllI[0];
        }).stream().filter(npc3 -> {
            if (lIlIIIlIIlllII(bO.getWorldArea().isInMeleeDistance(npc3.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = llIIllIIllI[2];
                "".length();
                return " ".length() == 0 ? ((136 ^ 162) ^ (198 ^ 141)) & (((((111 + 23) - 133) + 162) ^ (((132 + 189) - 231) + 104)) ^ (-" ".length())) : r0;
            }
            return llIIllIIllI[0];
        }).min(Comparator.comparingInt(npc4 -> {
            return npc4.getWorldLocation().distanceToPath(this.cu, Players.getLocal().getWorldLocation());
        })).orElse(null);
        if (lIlIIIlIIllIII(npc)) {
            return llIIllIIllI[0];
        }
        if (lIlIIIlIIllIIl(npc.distanceTo(Players.getLocal()), llIIllIIllI[1])) {
            Movement.setDestination(npc.getWorldLocation());
            return llIIllIIllI[2];
        }
        bp();
        npc.interact(llIIllIIlIl[llIIllIIllI[0]]);
        return llIIllIIllI[0];
    }

    private static String lIlIIIlIIlIIll(String llllllllllllllllIIllllIIllIlllII, String llllllllllllllllIIllllIIllIllIll) {
        try {
            SecretKeySpec llllllllllllllllIIllllIIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIIllIllIll.getBytes(StandardCharsets.UTF_8)), llIIllIIllI[5]), "DES");
            Cipher llllllllllllllllIIllllIIllIllllI = Cipher.getInstance("DES");
            llllllllllllllllIIllllIIllIllllI.init(llIIllIIllI[3], llllllllllllllllIIllllIIllIlllll);
            return new String(llllllllllllllllIIllllIIllIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllIIllIlllIl) {
            llllllllllllllllIIllllIIllIlllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIIlIIlIlll();
        lIlIIIlIIlIllI();
    }

    private static boolean lIlIIIlIIlllIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIlIIlIlIl(String llllllllllllllllIIllllIIlIllIlll, String llllllllllllllllIIllllIIlIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllllIIlIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllllIIlIlllIIl.init(llIIllIIllI[3], secretKeySpec);
            return new String(llllllllllllllllIIllllIIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllIIlIlllIII) {
            llllllllllllllllIIllllIIlIlllIII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        NPC interacting = projectileSpawned.getProjectile().getInteracting();
        if (lIlIIIlIIllIlI(interacting) && lIlIIIlIIllIll(interacting.getName().equals(llIIllIIlIl[llIIllIIllI[2]]) ? 1 : 0)) {
            this.eF.add(interacting);
            "".length();
        }
    }

    private static boolean lIlIIIlIIlllII(int i) {
        return i == 0;
    }

    private static String lIlIIIlIIlIlII(String llllllllllllllllIIllllIIllIIllII, String llllllllllllllllIIllllIIllIIlIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllllIIllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllllIIllIIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllllIIllllIIllIIlIll.toCharArray();
        int llllllllllllllllIIllllIIllIIlIII = llIIllIIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllIIllI[0];
        while (lIlIIIlIIlllIl(i, length)) {
            char llllllllllllllllIIllllIIllIIllIl = charArray2[i];
            llllllllllllllllIIllllIIllIIlIlI.append((char) (llllllllllllllllIIllllIIllIIllIl ^ charArray[llllllllllllllllIIllllIIllIIlIII % charArray.length]));
            "".length();
            llllllllllllllllIIllllIIllIIlIII++;
            i++;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIllllIIllIIlIlI);
    }

    private static boolean lIlIIIlIIllIII(Object obj) {
        return obj == null;
    }
}
