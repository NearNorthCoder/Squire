package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "SNIPING SleepWalker", priority = 11, register = true, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ai  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ai.class */
public class ai extends al {
    private static final /* synthetic */ int dX;
    private static final /* synthetic */ Logger dV;
    private static /* synthetic */ String[] lllIllllllll;
    private static final /* synthetic */ int dW;
    private static /* synthetic */ int[] llllIIIIlIll;
    private /* synthetic */ Set<NPC> dY;

    private static boolean lIIIlllIllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlllIlIlllll(int i) {
        return i == 0;
    }

    private static String lIIIlllIIllllII(String lllllllllllllllIIllIIIIIllllIllI, String lllllllllllllllIIllIIIIIllllIlIl) {
        String lllllllllllllllIIllIIIIIllllIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIIIIIllllIIll = lllllllllllllllIIllIIIIIllllIlIl.toCharArray();
        int lllllllllllllllIIllIIIIIllllIIlI = llllIIIIlIll[0];
        char[] charArray = lllllllllllllllIIllIIIIIllllIllI2.toCharArray();
        int length = charArray.length;
        int i = llllIIIIlIll[0];
        while (lIIIlllIllIIlIl(i, length)) {
            char lllllllllllllllIIllIIIIIllllIlll = charArray[i];
            sb.append((char) (lllllllllllllllIIllIIIIIllllIlll ^ lllllllllllllllIIllIIIIIllllIIll[lllllllllllllllIIllIIIIIllllIIlI % lllllllllllllllIIllIIIIIllllIIll.length]));
            "".length();
            lllllllllllllllIIllIIIIIllllIIlI++;
            i++;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIlllIllIIlII(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIlllIIllllIl(String lllllllllllllllIIllIIIIlIIIIIllI, String lllllllllllllllIIllIIIIlIIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIlIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIlIIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIlIIIIlIII.init(llllIIIIlIll[3], lllllllllllllllIIllIIIIlIIIIlIIl);
            return new String(lllllllllllllllIIllIIIIlIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIlIIIIIlll) {
            lllllllllllllllIIllIIIIlIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllIIIIl(int i, int i2) {
        return i != i2;
    }

    private static void lIIIlllIlIllllI() {
        llllIIIIlIll = new int[8];
        llllIIIIlIll[0] = ((5 ^ 94) ^ (63 ^ 71)) & (((((139 + 180) - 284) + 147) ^ (((71 + 61) - 31) + 48)) ^ (-" ".length()));
        llllIIIIlIll[1] = (-((-2835) & 24447)) & (-1) & 32766;
        llllIIIIlIll[2] = " ".length();
        llllIIIIlIll[3] = "  ".length();
        llllIIIIlIll[4] = (((86 + 33) - 107) + 168) ^ (((74 + 158) - 181) + 137);
        llllIIIIlIll[5] = (-((-369) & 8178)) & (-1) & 16343;
        llllIIIIlIll[6] = (-2051) & 10619;
        llllIIIIlIll[7] = "   ".length();
    }

    @Inject
    public ai(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0009f);
    }

    private static boolean lIIIlllIllIIIll(Object obj) {
        return obj == null;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        NPC d = SquireNightmarePlugin.d();
        if (lIIIlllIllIIIll(d) || lIIIlllIllIIIIl(llllIIIIlIll[1], d.getId())) {
            return;
        }
        NPC interacting = projectileSpawned.getProjectile().getInteracting();
        if (lIIIlllIllIIIII(interacting instanceof NPC ? 1 : 0) && lIIIlllIllIIIII(interacting.getName().toLowerCase().contains(lllIllllllll[llllIIIIlIll[2]]) ? 1 : 0)) {
            this.dY.add(interacting);
            "".length();
        }
    }

    private static void lIIIlllIIlllllI() {
        lllIllllllll = new String[llllIIIIlIll[7]];
        lllIllllllll[llllIIIIlIll[0]] = lIIIlllIIllllII("Iw4BNwAJ", "bzuVc");
        lllIllllllll[llllIIIIlIll[2]] = lIIIlllIIllllII("FS0xKxwRIDglCRQ=", "fATNl");
        lllIllllllll[llllIIIIlIll[3]] = lIIIlllIIllllIl("XcVBMTQVPtm9furyw6eFUA==", "jryif");
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public EquipmentSetup cq() {
        return (EquipmentSetup) this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
    }

    static {
        lIIIlllIlIllllI();
        lIIIlllIIlllllI();
        dW = llllIIIIlIll[5];
        dX = llllIIIIlIll[6];
        dV = LoggerFactory.getLogger(ai.class);
    }

    private static boolean lIIIlllIllIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllIllIIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public boolean cr() {
        if (!lIIIlllIlIlllll(this.cK.lowerDamageFinalPhase() ? 1 : 0) && !lIIIlllIllIIIII(this.cK.assistantMode() ? 1 : 0)) {
            NPC d = SquireNightmarePlugin.d();
            if (lIIIlllIllIIIIl(llllIIIIlIll[1], d.getId())) {
                this.dY = new HashSet();
                return llllIIIIlIll[0];
            } else if (lIIIlllIlIlllll(cu() ? 1 : 0)) {
                return llllIIIIlIll[0];
            } else {
                NPC nearest = NPCs.getNearest(d.getWorldLocation(), npc -> {
                    if (lIIIlllIllIIIII(npc.getName().equalsIgnoreCase(lllIllllllll[llllIIIIlIll[3]]) ? 1 : 0) && lIIIlllIlIlllll(npc.isDead() ? 1 : 0) && lIIIlllIlIlllll(this.dY.contains(npc) ? 1 : 0) && lIIIlllIllIIlII(d.getWorldArea().distanceTo(npc), llllIIIIlIll[4]) && lIIIlllIllIIIII(npc.isMoving() ? 1 : 0)) {
                        ?? r0 = llllIIIIlIll[2];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIIIIlIll[0];
                });
                if (!lIIIlllIllIIIlI(nearest) || lIIIlllIllIIIII(this.dY.contains(nearest) ? 1 : 0)) {
                    return llllIIIIlIll[0];
                }
                EquipmentSetup equipmentSetup = (EquipmentSetup) this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
                if (lIIIlllIllIIIll(equipmentSetup)) {
                    return llllIIIIlIll[0];
                }
                if (lIIIlllIlIlllll(equipmentSetup.isFullyEquipped() ? 1 : 0)) {
                    equipmentSetup.swap();
                }
                nearest.interact(lllIllllllll[llllIIIIlIll[0]]);
                return llllIIIIlIll[2];
            }
        }
        return llllIIIIlIll[0];
    }
}
