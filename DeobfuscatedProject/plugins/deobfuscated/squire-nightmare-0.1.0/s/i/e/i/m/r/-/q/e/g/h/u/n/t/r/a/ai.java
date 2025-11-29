/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="SNIPING SleepWalker", priority=11, register=true, blocking=true)
public class ai
extends al {
    private static final /* synthetic */ int dX;
    private static final /* synthetic */ Logger dV;
    private static /* synthetic */ String[] lllIllllllll;
    private static final /* synthetic */ int dW;
    private static /* synthetic */ int[] llllIIIIlIll;
    private /* synthetic */ Set<NPC> dY;

    private static boolean lIIIlllIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIlIlllll(int n2) {
        return n2 == 0;
    }

    private static String lIIIlllIIllllII(String lllllllllllllllIIllIIIIIllllIIIl, String lllllllllllllllIIllIIIIIllllIlIl) {
        lllllllllllllllIIllIIIIIllllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIIIllllIlII = new StringBuilder();
        char[] lllllllllllllllIIllIIIIIllllIIll = lllllllllllllllIIllIIIIIllllIlIl.toCharArray();
        int lllllllllllllllIIllIIIIIllllIIlI = llllIIIIlIll[0];
        char[] lllllllllllllllIIllIIIIIlllIllII = lllllllllllllllIIllIIIIIllllIIIl.toCharArray();
        int lllllllllllllllIIllIIIIIlllIlIll = lllllllllllllllIIllIIIIIlllIllII.length;
        int lllllllllllllllIIllIIIIIlllIlIlI = llllIIIIlIll[0];
        while (ai.lIIIlllIllIIlIl(lllllllllllllllIIllIIIIIlllIlIlI, lllllllllllllllIIllIIIIIlllIlIll)) {
            char lllllllllllllllIIllIIIIIllllIlll = lllllllllllllllIIllIIIIIlllIllII[lllllllllllllllIIllIIIIIlllIlIlI];
            lllllllllllllllIIllIIIIIllllIlII.append((char)(lllllllllllllllIIllIIIIIllllIlll ^ lllllllllllllllIIllIIIIIllllIIll[lllllllllllllllIIllIIIIIllllIIlI % lllllllllllllllIIllIIIIIllllIIll.length]));
            0;
            ++lllllllllllllllIIllIIIIIllllIIlI;
            ++lllllllllllllllIIllIIIIIlllIlIlI;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIIIIllllIlII);
    }

    private static boolean lIIIlllIllIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIlllIIllllIl(String lllllllllllllllIIllIIIIlIIIIIllI, String lllllllllllllllIIllIIIIlIIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIlIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIlIIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIlIIIIlIII.init(llllIIIIlIll[3], lllllllllllllllIIllIIIIlIIIIlIIl);
            return new String(lllllllllllllllIIllIIIIlIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIlIIIIIlll) {
            lllllllllllllllIIllIIIIlIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIlllIlIllllI() {
        llllIIIIlIll = new int[8];
        ai.llllIIIIlIll[0] = (5 ^ 0x5E ^ (0x3F ^ 0x47)) & (139 + 180 - 284 + 147 ^ 71 + 61 - 31 + 48 ^ -1);
        ai.llllIIIIlIll[1] = -(0xFFFFF4ED & 0x5F7F) & (0xFFFFFFFF & 0x7FFE);
        ai.llllIIIIlIll[2] = 1;
        ai.llllIIIIlIll[3] = 2;
        ai.llllIIIIlIll[4] = 86 + 33 - 107 + 168 ^ 74 + 158 - 181 + 137;
        ai.llllIIIIlIll[5] = -(0xFFFFFE8F & 0x1FF2) & (0xFFFFFFFF & 0x3FD7);
        ai.llllIIIIlIll[6] = 0xFFFFF7FD & 0x297B;
        ai.llllIIIIlIll[7] = 3;
    }

    @Inject
    public ai(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIIlllIllIIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void lllllllllllllllIIllIIIIlIIIlIlll;
        void lllllllllllllllIIllIIIIlIIIlIllI;
        NPC nPC = SquireNightmarePlugin.d();
        if (ai.lIIIlllIllIIIll(nPC)) {
            return;
        }
        if (ai.lIIIlllIllIIIIl(llllIIIIlIll[1], lllllllllllllllIIllIIIIlIIIlIllI.getId())) {
            return;
        }
        Projectile lllllllllllllllIIllIIIIlIIIlIlIl = lllllllllllllllIIllIIIIlIIIlIlll.getProjectile();
        Actor lllllllllllllllIIllIIIIlIIIlIlII = lllllllllllllllIIllIIIIlIIIlIlIl.getInteracting();
        if (ai.lIIIlllIllIIIII(lllllllllllllllIIllIIIIlIIIlIlII instanceof NPC) && ai.lIIIlllIllIIIII(lllllllllllllllIIllIIIIlIIIlIlII.getName().toLowerCase().contains(lllIllllllll[llllIIIIlIll[2]]) ? 1 : 0)) {
            ai lllllllllllllllIIllIIIIlIIIllIII;
            lllllllllllllllIIllIIIIlIIIllIII.dY.add((NPC)lllllllllllllllIIllIIIIlIIIlIlII);
            0;
        }
    }

    private static void lIIIlllIIlllllI() {
        lllIllllllll = new String[llllIIIIlIll[7]];
        ai.lllIllllllll[ai.llllIIIIlIll[0]] = ai."Attack";
        ai.lllIllllllll[ai.llllIIIIlIll[2]] = ai."sleepwalker";
        ai.lllIllllllll[ai.llllIIIIlIll[3]] = ai."sleepwalker";
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
    }

    static {
        ai.lIIIlllIlIllllI();
        ai.lIIIlllIIlllllI();
        dW = llllIIIIlIll[5];
        dX = llllIIIIlIll[6];
        dV = LoggerFactory.getLogger(ai.class);
    }

    private static boolean lIIIlllIllIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIllIIIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var2_2;
        ai lllllllllllllllIIllIIIIlIIlIIIIl;
        if (ai.lIIIlllIlIlllll(this.cK.lowerDamageFinalPhase() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIllIIIII(lllllllllllllllIIllIIIIlIIlIIIIl.cK.assistantMode() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        NPC lllllllllllllllIIllIIIIlIIlIIIII = SquireNightmarePlugin.d();
        if (ai.lIIIlllIllIIIIl(llllIIIIlIll[1], lllllllllllllllIIllIIIIlIIlIIIII.getId())) {
            lllllllllllllllIIllIIIIlIIlIIIIl.dY = new HashSet<NPC>();
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIlIlllll(lllllllllllllllIIllIIIIlIIlIIIIl.cu() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        NPC lllllllllllllllIIllIIIIlIIIlllll = NPCs.getNearest((WorldPoint)lllllllllllllllIIllIIIIlIIlIIIII.getWorldLocation(), nPC2 -> {
            int n2;
            if (ai.lIIIlllIllIIIII(nPC2.getName().equalsIgnoreCase(lllIllllllll[llllIIIIlIll[3]]) ? 1 : 0) && ai.lIIIlllIlIlllll(nPC2.isDead() ? 1 : 0) && ai.lIIIlllIlIlllll(this.dY.contains(nPC2) ? 1 : 0) && ai.lIIIlllIllIIlII(lllllllllllllllIIllIIIIlIIlIIIII.getWorldArea().distanceTo((Locatable)nPC2), llllIIIIlIll[4]) && ai.lIIIlllIllIIIII(nPC2.isMoving() ? 1 : 0)) {
                n2 = llllIIIIlIll[2];
                0;
                if (null != null) {
                    return ((0x47 ^ 0x1B) & ~(0xCD ^ 0x91)) != 0;
                }
            } else {
                n2 = llllIIIIlIll[0];
            }
            return n2 != 0;
        });
        if (!ai.lIIIlllIllIIIlI(lllllllllllllllIIllIIIIlIIIlllll) || ai.lIIIlllIllIIIII(lllllllllllllllIIllIIIIlIIlIIIIl.dY.contains(lllllllllllllllIIllIIIIlIIIlllll) ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        EquipmentSetup lllllllllllllllIIllIIIIlIIIllllI = (EquipmentSetup)lllllllllllllllIIllIIIIlIIlIIIIl.cK.sleepwalkerGear().selected(EquipmentSetup.class);
        if (ai.lIIIlllIllIIIll(lllllllllllllllIIllIIIIlIIIllllI)) {
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIlIlllll(lllllllllllllllIIllIIIIlIIIllllI.isFullyEquipped() ? 1 : 0)) {
            lllllllllllllllIIllIIIIlIIIllllI.swap();
        }
        var2_2.interact(lllIllllllll[llllIIIIlIll[0]]);
        return llllIIIIlIll[2];
    }
}

