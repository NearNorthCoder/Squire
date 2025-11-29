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

/* TASK: SNIPING SleepWalker -> SnipingsleepwalkerTask */
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

    private static String lIIIlllIIllllII(String var19, String var13) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var1 = var13.toCharArray();
        int var6 = llllIIIIlIll[0];
        char[] var16 = var19.toCharArray();
        int var5 = var16.length;
        int var3 = llllIIIIlIll[0];
        while (ai.lIIIlllIllIIlIl(var3, var5)) {
            char var15 = var16[var3];
            var7.append((char)(var15 ^ var1[var6 % var1.length]));
            0;
            ++var6;
            ++var3;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIIIlllIllIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIlllIIllllIl(String var12, String var14) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llllIIIIlIll[3], var17);
            return new String(var18.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
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
        void var20;
        void var9;
        NPC nPC = SquireNightmarePlugin.d();
        if (ai.lIIIlllIllIIIll(nPC)) {
            return;
        }
        if (ai.lIIIlllIllIIIIl(llllIIIIlIll[1], var9.getId())) {
            return;
        }
        Projectile var4 = var20.getProjectile();
        Actor var8 = var4.getInteracting();
        if (ai.lIIIlllIllIIIII(var8 instanceof NPC) && ai.lIIIlllIllIIIII(var8.getName().toLowerCase().contains(lllIllllllll[llllIIIIlIll[2]]) ? 1 : 0)) {
            ai var23;
            var23.dY.add((NPC)var8);
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
        ai var2;
        if (ai.lIIIlllIlIlllll(this.cK.lowerDamageFinalPhase() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIllIIIII(var2.cK.assistantMode() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        NPC var10 = SquireNightmarePlugin.d();
        if (ai.lIIIlllIllIIIIl(llllIIIIlIll[1], var10.getId())) {
            var2.dY = new HashSet<NPC>();
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIlIlllll(var2.cu() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        NPC var21 = NPCs.getNearest((WorldPoint)var10.getWorldLocation(), nPC2 -> {
            int n2;
            if (ai.lIIIlllIllIIIII(nPC2.getName().equalsIgnoreCase(lllIllllllll[llllIIIIlIll[3]]) ? 1 : 0) && ai.lIIIlllIlIlllll(nPC2.isDead() ? 1 : 0) && ai.lIIIlllIlIlllll(this.dY.contains(nPC2) ? 1 : 0) && ai.lIIIlllIllIIlII(var10.getWorldArea().distanceTo((Locatable)nPC2), llllIIIIlIll[4]) && ai.lIIIlllIllIIIII(nPC2.isMoving() ? 1 : 0)) {
                n2 = llllIIIIlIll[2];
                0;
                
                }
            } else {
                n2 = llllIIIIlIll[0];
            }
            return n2 != 0;
        });
        if (!ai.lIIIlllIllIIIlI(var21) || ai.lIIIlllIllIIIII(var2.dY.contains(var21) ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        EquipmentSetup var11 = (EquipmentSetup)var2.cK.sleepwalkerGear().selected(EquipmentSetup.class);
        if (ai.lIIIlllIllIIIll(var11)) {
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIlIlllll(var11.isFullyEquipped() ? 1 : 0)) {
            var11.swap();
        }
        var2_2.interact(lllIllllllll[llllIIIIlIll[0]]);
        return llllIIIIlIll[2];
    }
}

