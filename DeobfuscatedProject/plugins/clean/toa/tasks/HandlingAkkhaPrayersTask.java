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
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
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

@TaskDesc(name="Handling Akkha Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingAkkhaPrayersTask
extends ToaTaskBase {

    private  Prayer aY;
    private  int aZ;
    private  Prayer aX;

    private static boolean lIllIllIIlIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIllIIlIlIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIlIIIIIllIII[5]];
        nArray[D.lIlIIIIIllIII[1]] = lIlIIIIIllIII[6];
        nArray[D.lIlIIIIIllIII[0]] = lIlIIIIIllIII[7];
        nArray[D.lIlIIIIIllIII[8]] = lIlIIIIIllIII[9];
        nArray[D.lIlIIIIIllIII[10]] = lIlIIIIIllIII[3];
        return this.aS.a(nArray);
    }

    @Override
    public n J() {
        return this.aT.prayerFlickAkkha();
    }

    @Override
    public boolean I() {
        return lIlIIIIIllIII[0];
    }

    @Override
    public int F() {
        return lIlIIIIIllIII[4];
    }

    static {
        D.lIllIllIIlIIIlI();
        D.lIllIllIIlIIIIl();
    }

    private static boolean lIllIllIIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIllIIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> E() {
        void var1;
        int var2;
        int n2;
        D var3;
        String[] stringArray = new String[lIlIIIIIllIII[0]];
        stringArray[D.lIlIIIIIllIII[1]] = lIlIIIIIlIlll[lIlIIIIIllIII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (D.lIllIllIIlIIIll(nPC)) {
            return List.of(this.H());
        }
        if (D.lIllIllIIlIIlII(Static.getClient().getTickCount(), var3.aZ)) {
            var3.aX = var3.aY;
        }
        int[] nArray = new int[lIlIIIIIllIII[0]];
        nArray[D.lIlIIIIIllIII[1]] = lIlIIIIIllIII[2];
        if (D.lIllIllIIlIIlIl(Projectiles.getAll((int[])nArray).size())) {
            n2 = lIlIIIIIllIII[0];

            if ((0x8A ^ 0x8E) == ((0xD7 ^ 0x8C) & ~(0xE7 ^ 0xBC) & ~((0xB8 ^ 0x8E) & ~(0x63 ^ 0x55)))) {
                return null;
            }
        } else {
            n2 = lIlIIIIIllIII[1];
        }
        if (D.lIllIllIIlIIllI(var2 = n2) && D.lIllIllIIlIIlll(var3.aY, Prayer.PROTECT_FROM_MELEE) && D.lIllIllIIlIIllI(var1.isAnimating() ? 1 : 0)) {
            var3.aX = var3.aY;
        }
        if (D.lIllIllIIlIlIII(var1.getId(), lIlIIIIIllIII[3])) {
            var3.aX = Prayer.PROTECT_FROM_MAGIC;
        }
        return List.of(this.H(), this.aX);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var4;
        Actor actor = animationChanged.getActor();
        if (D.lIllIllIIlIlIIl(actor instanceof Player)) {
            return;
        }
        if (D.lIllIllIIlIlIlI(var4.getId(), lIlIIIIIllIII[6]) && D.lIllIllIIlIlIlI(var4.getId(), lIlIIIIIllIII[7]) && D.lIllIllIIlIlIlI(var4.getId(), lIlIIIIIllIII[9])) {
            return;
        }
        if (D.lIllIllIIlIlIII(var4.getAnimation(), lIlIIIIIllIII[11])) {
            var5.aX = Prayer.PROTECT_FROM_MELEE;
        }
        if (D.lIllIllIIlIlIII(var4.getAnimation(), lIlIIIIIllIII[12])) {
            var5.aX = Prayer.PROTECT_FROM_MISSILES;
        }
        if (D.lIllIllIIlIlIII(var4.getAnimation(), lIlIIIIIllIII[13])) {
            var5.aX = Prayer.PROTECT_FROM_MAGIC;
        }
        this.aZ = Static.getClient().getTickCount() + lIlIIIIIllIII[5];
    }

    private static boolean lIllIllIIlIIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void var6;
        NPC nPC = npcChanged.getNpc();
        if (D.lIllIllIIlIlIII(nPC.getId(), lIlIIIIIllIII[6])) {
            this.aY = Prayer.PROTECT_FROM_MELEE;

            if ((24 + 134 - 49 + 56 ^ 127 + 101 - 158 + 91) == 2) {
                return;
            }
        } else if (D.lIllIllIIlIlIII(var6.getId(), lIlIIIIIllIII[7])) {
            var7.aY = Prayer.PROTECT_FROM_MISSILES;

            if (-1 == ((74 + 18 - 42 + 99 ^ 17 + 47 - -40 + 92) & (205 + 187 - 141 + 4 ^ 119 + 39 - 64 + 80 ^ -1))) {
                return;
            }
        } else if (D.lIllIllIIlIlIII(var6.getId(), lIlIIIIIllIII[9])) {
            var7.aY = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    private static boolean lIllIllIIlIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIllIIlIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIllIIlIIIIl() {
        lIlIIIIIlIlll = new String[lIlIIIIIllIII[0]];
        D.lIlIIIIIlIlll[D.lIlIIIIIllIII[1]] = "Akkha";
    }

    @Inject
    public HandlingAkkhaPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.aX = Prayer.PROTECT_FROM_MELEE;
        this.aY = Prayer.PROTECT_FROM_MAGIC;
    }

    private static boolean lIllIllIIlIIIll(Object object) {
        return object == null;
    }

}

