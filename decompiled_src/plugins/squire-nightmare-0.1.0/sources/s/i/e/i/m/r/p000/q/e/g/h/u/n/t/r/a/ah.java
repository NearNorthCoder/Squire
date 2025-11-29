package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Attacking SleepWalker", priority = Integer.MAX_VALUE, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ah  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ah.class */
public class ah extends al {
    private static /* synthetic */ int[] llllIIlllIlI;
    private static /* synthetic */ String[] llllIIlllIII;
    private /* synthetic */ HashSet<NPC> dU;
    private static final /* synthetic */ Logger dT;

    private static String lIIIllllllllllI(String lllllllllllllllIIlIlllIIlIIlllIl, String lllllllllllllllIIlIlllIIlIIlllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIIlIIllIll = new StringBuilder();
        char[] lllllllllllllllIIlIlllIIlIIllIlI = lllllllllllllllIIlIlllIIlIIlllII.toCharArray();
        int lllllllllllllllIIlIlllIIlIIllIIl = llllIIlllIlI[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIIlllIlI[2];
        while (lIIlIIIIIIIlIll(i, length)) {
            char lllllllllllllllIIlIlllIIlIIllllI = charArray[i];
            lllllllllllllllIIlIlllIIlIIllIll.append((char) (lllllllllllllllIIlIlllIIlIIllllI ^ lllllllllllllllIIlIlllIIlIIllIlI[lllllllllllllllIIlIlllIIlIIllIIl % lllllllllllllllIIlIlllIIlIIllIlI.length]));
            "".length();
            lllllllllllllllIIlIlllIIlIIllIIl++;
            i++;
            "".length();
            if (((203 ^ 189) ^ (176 ^ 194)) <= (((((88 + 53) - 72) + 75) ^ (((55 + 46) - (-49)) + 20)) & (((((79 + 23) - (-40)) + 10) ^ (((103 + 148) - 203) + 114)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlllIIlIIllIll);
    }

    private static boolean lIIlIIIIIIIIlll(int i) {
        return i == 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        NPC interacting = projectileSpawned.getProjectile().getInteracting();
        if (lIIlIIIIIIIIllI(interacting instanceof NPC ? 1 : 0) && lIIlIIIIIIIIllI(interacting.getName().toLowerCase().contains(llllIIlllIII[llllIIlllIlI[4]]) ? 1 : 0)) {
            this.dU.add(interacting);
            "".length();
        }
    }

    private static boolean lIIlIIIIIIIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v46, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public boolean cr() {
        int i;
        int i2;
        NPC d = SquireNightmarePlugin.d();
        List all = NPCs.getAll(SquireNightmarePlugin.o.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray());
        if (lIIlIIIIIIIIlII(all) && lIIlIIIIIIIIlIl(all.size(), llllIIlllIlI[0])) {
            i = llllIIlllIlI[1];
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((113 ^ 0) ^ (185 ^ 144)) & (((54 ^ 43) ^ (2 ^ 71)) ^ (-" ".length()));
            }
        } else {
            i = llllIIlllIlI[2];
        }
        int i3 = i;
        if (lIIlIIIIIIIIlIl(d.getAnimation(), llllIIlllIlI[3])) {
            this.cM.q(llllIIlllIlI[2]);
            return llllIIlllIlI[2];
        } else if (lIIlIIIIIIIIllI(this.cK.assistantMode() ? 1 : 0)) {
            return llllIIlllIlI[2];
        } else {
            if (lIIlIIIIIIIIllI(i3) && lIIlIIIIIIIIlll(this.cM.aq() ? 1 : 0)) {
                this.cM.h();
                this.cM.q(llllIIlllIlI[1]);
                dT.info(llllIIlllIII[llllIIlllIlI[2]], Integer.valueOf(this.cM.Q()));
                int Q = this.cM.Q() + llllIIlllIlI[1];
                dT.info(llllIIlllIII[llllIIlllIlI[1]], Integer.valueOf(Q));
                this.cM.h(Q);
                this.dU = new HashSet<>();
                if (lIIlIIIIIIIIllI(this.cM.am() ? 1 : 0)) {
                    this.cM.o(llllIIlllIlI[2]);
                }
            }
            if (lIIlIIIIIIIIlll(this.cM.aq() ? 1 : 0)) {
                return llllIIlllIlI[2];
            }
            if (lIIlIIIIIIIIlII(this.cJ.aY())) {
                i2 = llllIIlllIlI[1];
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i2 = llllIIlllIlI[2];
            }
            if (!lIIlIIIIIIIIllI(i2) && !lIIlIIIIIIIIllI(this.cM.ap())) {
                NPC a = this.cJ.a((Set<NPC>) this.dU);
                if (!lIIlIIIIIIIlIIl(a) || !lIIlIIIIIIIIllI(this.dU.isEmpty() ? 1 : 0)) {
                    if (lIIlIIIIIIIIlIl(this.dU.size(), llllIIlllIlI[0])) {
                        this.cM.q(llllIIlllIlI[2]);
                        return llllIIlllIlI[2];
                    }
                    return x(a);
                }
                WorldPoint e = SquireNightmarePlugin.e();
                if (!lIIlIIIIIIIIllI(e.equals(this.cL.getLocalPlayer().getWorldLocation()) ? 1 : 0) && !lIIlIIIIIIIlIlI(this.cJ.ax().size())) {
                    Movement.setDestination(e);
                    return llllIIlllIlI[1];
                }
                return llllIIlllIlI[1];
            }
            return llllIIlllIlI[2];
        }
    }

    private static void lIIlIIIIIIIIIll() {
        llllIIlllIlI = new int[7];
        llllIIlllIlI[0] = 46 ^ 42;
        llllIIlllIlI[1] = " ".length();
        llllIIlllIlI[2] = (83 ^ 6) & ((150 ^ 195) ^ (-1));
        llllIIlllIlI[3] = (-((-22681) & 24315)) & (-20481) & 30718;
        llllIIlllIlI[4] = "  ".length();
        llllIIlllIlI[5] = "   ".length();
        llllIIlllIlI[6] = (12 ^ 92) ^ (108 ^ 52);
    }

    @Inject
    public ah(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0009f);
    }

    private static boolean lIIlIIIIIIIIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIIIIIIlIIl(Object obj) {
        return obj == null;
    }

    private static void lIIlIIIIIIIIIII() {
        llllIIlllIII = new String[llllIIlllIlI[5]];
        llllIIlllIII[llllIIlllIlI[2]] = lIIIllllllllllI("Mg8lBSIfDncHLxAJMlcuAlosCg==", "qzWwG");
        llllIIlllIII[llllIIlllIlI[1]] = lIIIlllllllllll("rIbxYC7zyQnq0XOcku1x7g==", "APYMB");
        llllIIlllIII[llllIIlllIlI[4]] = lIIIlllllllllll("TxEwAfuEY1oharGeAuz4vw==", "myLCf");
    }

    private static String lIIIlllllllllll(String lllllllllllllllIIlIlllIIlIlIllIl, String lllllllllllllllIIlIlllIIlIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIlIlIllII.getBytes(StandardCharsets.UTF_8)), llllIIlllIlI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlllIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIlIlIlllI) {
            lllllllllllllllIIlIlllIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIIIlIlI(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIIIIIlIll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIIIIIIIIIll();
        lIIlIIIIIIIIIII();
        dT = LoggerFactory.getLogger(ah.class);
    }

    private static boolean lIIlIIIIIIIIllI(int i) {
        return i != 0;
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public EquipmentSetup cq() {
        return (EquipmentSetup) this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
    }
}
