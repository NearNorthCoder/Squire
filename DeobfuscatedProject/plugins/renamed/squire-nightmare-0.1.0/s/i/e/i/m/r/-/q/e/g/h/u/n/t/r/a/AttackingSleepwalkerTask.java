/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j_Unknown;

/* TASK: Attacking SleepWalker -> AttackingsleepwalkerTask */
@TaskDesc(name="Attacking SleepWalker", priority=0x7FFFFFFF, blocking=true, register=true)
public class AttackingSleepwalkerTask
extends al_Unknown {
    private static /* synthetic */ int[] llllIIlllIlI;
    private static /* synthetic */ String[] llllIIlllIII;
    private /* synthetic */ HashSet<NPC> dU;
    private static final /* synthetic */ Logger dT;

    private static String lIIIllllllllllI(String var12, String var11) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var15 = var11.toCharArray();
        int var16 = llllIIlllIlI[2];
        char[] var6 = var12.toCharArray();
        int var7 = var6.length;
        int var17 = llllIIlllIlI[2];
        while (ah.lIIlIIIIIIIlIll(var17, var7)) {
            char var5 = var6[var17];
            var2.append((char)(var5 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var17;
            0;
            if ((0xCB ^ 0xBD ^ (0xB0 ^ 0xC2)) > ((88 + 53 - 72 + 75 ^ 55 + 46 - -49 + 20) & (79 + 23 - -40 + 10 ^ 103 + 148 - 203 + 114 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIIlIIIIIIIIlll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        Actor actor = projectile.getInteracting();
        if (ah.lIIlIIIIIIIIllI(actor instanceof NPC) && ah.lIIlIIIIIIIIllI(actor.getName().toLowerCase().contains(llllIIlllIII[llllIIlllIlI[4]]) ? 1 : 0)) {
            this.dU.add((NPC)actor);
            0;
        }
    }

    private static boolean lIIlIIIIIIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var6_6;
        int n2;
        int var20;
        ah var13;
        void var8;
        int var14;
        int n3;
        NPC nPC = SquireNightmarePlugin.d();
        int[] nArray = SquireNightmarePlugin.o.stream().mapToInt(Integer::intValue).toArray();
        List list = NPCs.getAll((int[])nArray);
        if (ah.lIIlIIIIIIIIlII(list) && ah.lIIlIIIIIIIIlIl(list.size(), llllIIlllIlI[0])) {
            n3 = llllIIlllIlI[1];
            0;
            if (2 <= 1) {
                return ((0x71 ^ 0 ^ (0xB9 ^ 0x90)) & (0x36 ^ 0x2B ^ (2 ^ 0x47) ^ -1)) != 0;
            }
        } else {
            n3 = var14 = llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIlIl(var8.getAnimation(), llllIIlllIlI[3])) {
            var13.cM.q(llllIIlllIlI[2]);
            return llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIllI(var13.cK.assistantMode() ? 1 : 0)) {
            return llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIllI(var14) && ah.lIIlIIIIIIIIlll(var13.cM.aq() ? 1 : 0)) {
            var13.cM.h();
            var13.cM.q(llllIIlllIlI[1]);
            dT.info(llllIIlllIII[llllIIlllIlI[2]], (Object)var13.cM.Q());
            var20 = var13.cM.Q() + llllIIlllIlI[1];
            dT.info(llllIIlllIII[llllIIlllIlI[1]], (Object)var20);
            var13.cM.h(var20);
            var13.dU = new HashSet();
            if (ah.lIIlIIIIIIIIllI(var13.cM.am() ? 1 : 0)) {
                var13.cM.o(llllIIlllIlI[2]);
            }
        }
        if (ah.lIIlIIIIIIIIlll(var13.cM.aq() ? 1 : 0)) {
            return llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIlII(var13.cJ.aY())) {
            n2 = llllIIlllIlI[1];
            0;
            if (((0xB2 ^ 0xA9) & ~(0xB9 ^ 0xA2)) != 0) {
                return false;
            }
        } else {
            n2 = llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIllI(var20 = n2)) {
            return llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIllI(var13.cM.ap())) {
            return llllIIlllIlI[2];
        }
        NPC var19 = var13.cJ.a(var13.dU);
        if (ah.lIIlIIIIIIIlIIl(var19) && ah.lIIlIIIIIIIIllI(var13.dU.isEmpty() ? 1 : 0)) {
            WorldPoint var10 = SquireNightmarePlugin.e();
            if (ah.lIIlIIIIIIIIllI(var10.equals((Object)var13.cL.getLocalPlayer().getWorldLocation()) ? 1 : 0)) {
                return llllIIlllIlI[1];
            }
            if (ah.lIIlIIIIIIIlIlI(var13.cJ.ax().size())) {
                return llllIIlllIlI[1];
            }
            Movement.setDestination((WorldPoint)var10);
            return llllIIlllIlI[1];
        }
        if (ah.lIIlIIIIIIIIlIl(var13.dU.size(), llllIIlllIlI[0])) {
            var13.cM.q(llllIIlllIlI[2]);
            return llllIIlllIlI[2];
        }
        return this.x((NPC)var6_6);
    }

    private static void lIIlIIIIIIIIIll() {
        llllIIlllIlI = new int[7];
        ah.llllIIlllIlI[0] = 0x2E ^ 0x2A;
        ah.llllIIlllIlI[1] = 1;
        ah.llllIIlllIlI[2] = (0x53 ^ 6) & ~(0x96 ^ 0xC3);
        ah.llllIIlllIlI[3] = -(0xFFFFA767 & 0x5EFB) & (0xFFFFAFFF & 0x77FE);
        ah.llllIIlllIlI[4] = 2;
        ah.llllIIlllIlI[5] = 3;
        ah.llllIIlllIlI[6] = 0xC ^ 0x5C ^ (0x6C ^ 0x34);
    }

    @Inject
    public ah(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIlIIIIIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIIIIIlIIl(Object object) {
        return object == null;
    }

    private static void lIIlIIIIIIIIIII() {
        llllIIlllIII = new String[llllIIlllIlI[5]];
        ah.llllIIlllIII[ah.llllIIlllIlI[2]] = ah."Current phase is {}";
        ah.llllIIlllIII[ah.llllIIlllIlI[1]] = ah."New phase is {}";
        ah.llllIIlllIII[ah.llllIIlllIlI[4]] = ah."sleepwalker";
    }

    private static String lIIIlllllllllll(String var3, String var18) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), llllIIlllIlI[6]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llllIIlllIlI[4], var9);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIIIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ah.lIIlIIIIIIIIIll();
        ah.lIIlIIIIIIIIIII();
        dT = LoggerFactory.getLogger(AttackingSleepwalkerTask.class);
    }

    private static boolean lIIlIIIIIIIIllI(int n2) {
        return n2 != 0;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
    }
}

