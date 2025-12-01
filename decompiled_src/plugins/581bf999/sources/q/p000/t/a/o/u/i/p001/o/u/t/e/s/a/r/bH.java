package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Attacking skulls", priority = 100, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bH  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bH.class */
public class bH extends bM {
    private /* synthetic */ boolean gt;
    private /* synthetic */ int gu;
    private final /* synthetic */ Set<NPC> gs;
    private /* synthetic */ NPC eE;
    private static final /* synthetic */ Point gq;
    private static /* synthetic */ int[] llIIIIIIIlI;
    private static /* synthetic */ String[] llIIIIIIIIl;
    private static final /* synthetic */ Point gp;
    private static final /* synthetic */ Point gr;

    @Inject
    protected bH(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.gs = new HashSet();
    }

    private static boolean lIIlllIIIlIIlI(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIIlllIIIlIIll(npcDespawned.getNpc().getId(), llIIIIIIIlI[6])) {
            Log.info(llIIIIIIIIl[llIIIIIIIlI[5]]);
            Movement.setDestination(a(gr));
            this.gt = llIIIIIIIlI[5];
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bM, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.skullsGear();
    }

    private static boolean lIIlllIIIlIIll(int i, int i2) {
        return i == i2;
    }

    private static String lIIlllIIIIllll(String llllllllllllllllIlIIIllllllllllI, String llllllllllllllllIlIIIlllllllllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIIIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlllllllllIl.getBytes(StandardCharsets.UTF_8)), llIIIIIIIlI[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIIIIlI[13], llllllllllllllllIlIIlIIIIIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlllllllllll) {
            llllllllllllllllIlIIIlllllllllll.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bM, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        return null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        super.r();
        this.gs.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v32, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (!lIIlllIIIlIIlI(aX(), llIIIIIIIlI[0]) || lIIlllIIIlIIll(aX(), llIIIIIIIlI[1])) {
            bp();
        }
        if (lIIlllIIIlIlII(cr() ? 1 : 0)) {
            this.gt = llIIIIIIIlI[2];
        }
        if (lIIlllIIIlIlIl(this.gt ? 1 : 0)) {
            if (lIIlllIIIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                this.gt = llIIIIIIIlI[2];
            }
            return this.gt;
        }
        NPC nearest = NPCs.getNearest(a(gp), npc -> {
            if (lIIlllIIIlIIll(npc.getId(), llIIIIIIIlI[6]) && lIIlllIIIlIlII(this.gs.contains(npc) ? 1 : 0) && lIIlllIIIlIlII(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIIIIIIlI[5];
                "".length();
                return 0 != 0 ? ((72 ^ 11) ^ (71 ^ 84)) & (((((64 + 228) - 91) + 39) ^ (((85 + 1) - 28) + 102)) ^ (-" ".length())) : r0;
            }
            return llIIIIIIIlI[2];
        });
        if (lIIlllIIIlIlIl(cr() ? 1 : 0)) {
            if (!lIIlllIIIlIllI(nearest)) {
                WorldPoint a = a(gq);
                if (lIIlllIIIlIlII(Players.getLocal().getWorldLocation().equals(a) ? 1 : 0)) {
                    if (lIIlllIIIlIlIl(cs().contains(a) ? 1 : 0)) {
                        return llIIIIIIIlI[5];
                    }
                    Movement.setDestination(a);
                }
                return llIIIIIIIlI[5];
            }
            if (lIIlllIIIlIlII(this.gt ? 1 : 0)) {
                WorldPoint a2 = a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[4]));
                if (lIIlllIIIlIlll(a2.distanceTo(Players.getLocal()))) {
                    if (lIIlllIIIlIlIl(cs().contains(a2) ? 1 : 0)) {
                        return llIIIIIIIlI[5];
                    }
                    Movement.setDestination(a2);
                }
            }
            return llIIIIIIIlI[5];
        }
        if (lIIlllIIIlIllI(nearest)) {
            nearest = NPCs.getNearest(npc2 -> {
                if (lIIlllIIIlIIll(npc2.getId(), llIIIIIIIlI[6]) && lIIlllIIIlIlII(npc2.isDead() ? 1 : 0)) {
                    ?? r0 = llIIIIIIIlI[5];
                    "".length();
                    return "  ".length() >= "   ".length() ? ((((107 + 116) - 187) + 99) ^ (((20 + 69) - (-52)) + 3)) & (((((34 + 158) - 175) + 150) ^ (((168 + 108) - 209) + 109)) ^ (-" ".length())) : r0;
                }
                return llIIIIIIIlI[2];
            });
            if (lIIlllIIIlIllI(nearest)) {
                int[] iArr = new int[llIIIIIIIlI[5]];
                iArr[llIIIIIIIlI[2]] = llIIIIIIIlI[6];
                if (!lIIlllIIIlIllI(NPCs.getNearest(iArr))) {
                    WorldPoint a3 = a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[4]));
                    if (lIIlllIIIlIlll(a3.distanceTo(Players.getLocal()))) {
                        Movement.setDestination(a3);
                        return llIIIIIIIlI[5];
                    }
                    return llIIIIIIIlI[2];
                }
                WorldPoint a4 = a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[7]));
                if (lIIlllIIIlIlll(a4.distanceTo(Players.getLocal())) && lIIlllIIIlIlIl(cr() ? 1 : 0)) {
                    Movement.setDestination(a4);
                    return llIIIIIIIlI[5];
                }
                return llIIIIIIIlI[2];
            }
            this.gs.clear();
        }
        nearest.interact(llIIIIIIIIl[llIIIIIIIlI[2]]);
        this.eE = nearest;
        return llIIIIIIIlI[5];
    }

    private static boolean lIIlllIIIlIlIl(int i) {
        return i != 0;
    }

    private static void lIIlllIIIlIIIl() {
        llIIIIIIIlI = new int[15];
        llIIIIIIIlI[0] = (-((-14617) & 15133)) & (-4097) & 16375;
        llIIIIIIIlI[1] = (-((-27947) & 32555)) & (-1) & 16372;
        llIIIIIIIlI[2] = (162 ^ 142) & ((236 ^ 192) ^ (-1));
        llIIIIIIIlI[3] = 20 ^ 52;
        llIIIIIIIlI[4] = (229 ^ 171) ^ (91 ^ 48);
        llIIIIIIIlI[5] = " ".length();
        llIIIIIIIlI[6] = (-16386) & 28157;
        llIIIIIIIlI[7] = (69 ^ 108) ^ ((104 ^ 97) & ((70 ^ 79) ^ (-1)));
        llIIIIIIIlI[8] = 168 ^ 191;
        llIIIIIIIlI[9] = 164 ^ 148;
        llIIIIIIIlI[10] = (67 ^ 109) ^ (178 ^ 186);
        llIIIIIIIlI[11] = (30 ^ 95) ^ (239 ^ 132);
        llIIIIIIIlI[12] = 162 ^ 128;
        llIIIIIIIlI[13] = "  ".length();
        llIIIIIIIlI[14] = (43 ^ 75) ^ (4 ^ 108);
    }

    @Subscribe
    public void c(StatChanged statChanged) {
        if (lIIlllIIIlIllI(this.eE) || lIIlllIIIllIII(statChanged.getSkill(), Skill.HITPOINTS)) {
            return;
        }
        this.gs.add(this.eE);
        "".length();
    }

    private static void lIIlllIIIlIIII() {
        llIIIIIIIIl = new String[llIIIIIIIlI[13]];
        llIIIIIIIIl[llIIIIIIIlI[2]] = lIIlllIIIIllll("Y9Vh8bGVcTY=", "EzKsk");
        llIIIIIIIIl[llIIIIIIIlI[5]] = lIIlllIIIIllll("M/eb6bGH3AXC7ePOMdZLcXYcS0UZH7de", "spEty");
    }

    static {
        lIIlllIIIlIIIl();
        lIIlllIIIlIIII();
        gp = new Point(llIIIIIIIlI[8], llIIIIIIIlI[9]);
        gq = new Point(llIIIIIIIlI[10], llIIIIIIIlI[11]);
        gr = new Point(llIIIIIIIlI[12], llIIIIIIIlI[11]);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIIlllIIIlIIll(npcSpawned.getNpc().getId(), llIIIIIIIlI[6])) {
            this.gu = this.cu.getTickCount();
        }
    }

    private static boolean lIIlllIIIlIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllIIIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlllIIIlIlll(int i) {
        return i > 0;
    }

    private static boolean lIIlllIIIlIlII(int i) {
        return i == 0;
    }
}
