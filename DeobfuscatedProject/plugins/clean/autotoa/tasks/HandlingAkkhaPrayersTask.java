/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling Akkha Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingAkkhaPrayersTask
extends AutotoaTaskBase {
    
    private  Prayer df;
    private  int dg;
    
    private  Prayer de;

    @Override
    public boolean aL() {
        int[] nArray = new int[llIllIllIll[5]];
        nArray[ar.llIllIllIll[1]] = llIllIllIll[6];
        nArray[ar.llIllIllIll[0]] = llIllIllIll[7];
        nArray[ar.llIllIllIll[8]] = llIllIllIll[9];
        nArray[ar.llIllIllIll[10]] = llIllIllIll[3];
        return this.cm.a(nArray);
    }

    private static boolean lIlIlIlIIlllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlIlIIllIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIIlllII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIlIlIIlIlll() {
        llIllIllIlI = new String[llIllIllIll[0]];
        ar.llIllIllIlI[ar.llIllIllIll[1]] = "Akkha";
    }

    @Override
    public int aO() {
        return llIllIllIll[4];
    }

    private static boolean lIlIlIlIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean aS() {
        return llIllIllIll[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void var1;
        NPC nPC = npcChanged.getNpc();
        if (ar.lIlIlIlIIlllIl(nPC.getId(), llIllIllIll[6])) {
            this.df = Prayer.PROTECT_FROM_MELEE;

            if (3 < 2) {
                return;
            }
        } else if (ar.lIlIlIlIIlllIl(var1.getId(), llIllIllIll[7])) {
            var2.df = Prayer.PROTECT_FROM_MISSILES;

            if (-1 != -1) {
                return;
            }
        } else if (ar.lIlIlIlIIlllIl(var1.getId(), llIllIllIll[9])) {
            var2.df = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var3;
        Actor actor = animationChanged.getActor();
        if (ar.lIlIlIlIIllllI(actor instanceof Player)) {
            return;
        }
        if (ar.lIlIlIlIIlllll(var3.getId(), llIllIllIll[6]) && ar.lIlIlIlIIlllll(var3.getId(), llIllIllIll[7]) && ar.lIlIlIlIIlllll(var3.getId(), llIllIllIll[9])) {
            return;
        }
        if (ar.lIlIlIlIIlllIl(var3.getAnimation(), llIllIllIll[11])) {
            var4.de = Prayer.PROTECT_FROM_MELEE;
        }
        if (ar.lIlIlIlIIlllIl(var3.getAnimation(), llIllIllIll[12])) {
            var4.de = Prayer.PROTECT_FROM_MISSILES;
        }
        if (ar.lIlIlIlIIlllIl(var3.getAnimation(), llIllIllIll[13])) {
            var4.de = Prayer.PROTECT_FROM_MAGIC;
        }
        this.dg = Static.getClient().getTickCount() + llIllIllIll[5];
    }

    private static boolean lIlIlIlIIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ar.lIlIlIlIIllIII();
        ar.lIlIlIlIIlIlll();
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean lIlIlIlIIllllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        void var5;
        int var6;
        int n2;
        ar var7;
        String[] stringArray = new String[llIllIllIll[0]];
        stringArray[ar.llIllIllIll[1]] = llIllIllIlI[llIllIllIll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (ar.lIlIlIlIIllIIl(nPC)) {
            return List.of(this.aQ());
        }
        if (ar.lIlIlIlIIllIlI(Static.getClient().getTickCount(), var7.dg)) {
            var7.de = var7.df;
        }
        int[] nArray = new int[llIllIllIll[0]];
        nArray[ar.llIllIllIll[1]] = llIllIllIll[2];
        if (ar.lIlIlIlIIllIll(Projectiles.getAll((int[])nArray).isEmpty() ? 1 : 0)) {
            n2 = llIllIllIll[0];

            if (2 != 2) {
                return null;
            }
        } else {
            n2 = llIllIllIll[1];
        }
        if (ar.lIlIlIlIIllIll(var6 = n2) && ar.lIlIlIlIIlllII(var7.df, Prayer.PROTECT_FROM_MELEE) && ar.lIlIlIlIIllIll(var5.isAnimating() ? 1 : 0)) {
            var7.de = var7.df;
        }
        if (ar.lIlIlIlIIlllIl(var5.getId(), llIllIllIll[3])) {
            var7.de = Prayer.PROTECT_FROM_MAGIC;
        }
        return List.of(this.aQ(), this.de);
    }

    @Inject
    public HandlingAkkhaPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.de = Prayer.PROTECT_FROM_MELEE;
        this.df = Prayer.PROTECT_FROM_MAGIC;
    }

    private static boolean lIlIlIlIIllIll(int n2) {
        return n2 == 0;
    }

}

