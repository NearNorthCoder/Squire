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
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.NEnum;
import -.r.u.q.e.s.o.t.a.i.z_Unknown;
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

/* TASK: Handling Akkha Prayers -> HandlingakkhaprayersTask */
@TaskDesc(name="Handling Akkha Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingAkkhaPrayersTask
extends z_Unknown {
    private static /* synthetic */ int[] lIlIIIIIllIII;
    private static /* synthetic */ String[] lIlIIIIIlIlll;
    private /* synthetic */ Prayer aY;
    private /* synthetic */ int aZ;
    private /* synthetic */ Prayer aX;

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
        void var11;
        int var5;
        int n2;
        D var10;
        String[] stringArray = new String[lIlIIIIIllIII[0]];
        stringArray[D.lIlIIIIIllIII[1]] = lIlIIIIIlIlll[lIlIIIIIllIII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (D.lIllIllIIlIIIll(nPC)) {
            return List.of(this.H());
        }
        if (D.lIllIllIIlIIlII(Static.getClient().getTickCount(), var10.aZ)) {
            var10.aX = var10.aY;
        }
        int[] nArray = new int[lIlIIIIIllIII[0]];
        nArray[D.lIlIIIIIllIII[1]] = lIlIIIIIllIII[2];
        if (D.lIllIllIIlIIlIl(Projectiles.getAll((int[])nArray).size())) {
            n2 = lIlIIIIIllIII[0];
            0;
            if ((0x8A ^ 0x8E) == ((0xD7 ^ 0x8C) & ~(0xE7 ^ 0xBC) & ~((0xB8 ^ 0x8E) & ~(0x63 ^ 0x55)))) {
                return null;
            }
        } else {
            n2 = lIlIIIIIllIII[1];
        }
        if (D.lIllIllIIlIIllI(var5 = n2) && D.lIllIllIIlIIlll(var10.aY, Prayer.PROTECT_FROM_MELEE) && D.lIllIllIIlIIllI(var11.isAnimating() ? 1 : 0)) {
            var10.aX = var10.aY;
        }
        if (D.lIllIllIIlIlIII(var11.getId(), lIlIIIIIllIII[3])) {
            var10.aX = Prayer.PROTECT_FROM_MAGIC;
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
            var6.aX = Prayer.PROTECT_FROM_MELEE;
        }
        if (D.lIllIllIIlIlIII(var4.getAnimation(), lIlIIIIIllIII[12])) {
            var6.aX = Prayer.PROTECT_FROM_MISSILES;
        }
        if (D.lIllIllIIlIlIII(var4.getAnimation(), lIlIIIIIllIII[13])) {
            var6.aX = Prayer.PROTECT_FROM_MAGIC;
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
        void var8;
        NPC nPC = npcChanged.getNpc();
        if (D.lIllIllIIlIlIII(nPC.getId(), lIlIIIIIllIII[6])) {
            this.aY = Prayer.PROTECT_FROM_MELEE;
            0;
            if ((24 + 134 - 49 + 56 ^ 127 + 101 - 158 + 91) == 2) {
                return;
            }
        } else if (D.lIllIllIIlIlIII(var8.getId(), lIlIIIIIllIII[7])) {
            var7.aY = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (-1 == ((74 + 18 - 42 + 99 ^ 17 + 47 - -40 + 92) & (205 + 187 - 141 + 4 ^ 119 + 39 - 64 + 80 ^ -1))) {
                return;
            }
        } else if (D.lIllIllIIlIlIII(var8.getId(), lIlIIIIIllIII[9])) {
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
        D.lIlIIIIIlIlll[D.lIlIIIIIllIII[1]] = D."Akkha";
    }

    @Inject
    public D(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.aX = Prayer.PROTECT_FROM_MELEE;
        this.aY = Prayer.PROTECT_FROM_MAGIC;
    }

    private static void lIllIllIIlIIIlI() {
        lIlIIIIIllIII = new int[15];
        D.lIlIIIIIllIII[0] = 1;
        D.lIlIIIIIllIII[1] = (0xE8 ^ 0xB7) & ~(0xD ^ 0x52);
        D.lIlIIIIIllIII[2] = -(0xFFFFE63B & 0x5FF7) & (0xFFFFFEFF & 0x4FFF);
        D.lIlIIIIIllIII[3] = 0xFFFFBFFF & 0x6E13;
        D.lIlIIIIIllIII[4] = 0xFFFFF9F7 & 0x3F5C;
        D.lIlIIIIIllIII[5] = 0xF ^ 0xB;
        D.lIlIIIIIllIII[6] = -(0xFFFFD3B6 & 0x2D7B) & (0xFFFFAF7F & 0x7FBF);
        D.lIlIIIIIllIII[7] = 0xFFFFBF5F & 0x6EAF;
        D.lIlIIIIIllIII[8] = 2;
        D.lIlIIIIIllIII[9] = 0xFFFFAF9D & 0x7E72;
        D.lIlIIIIIllIII[10] = 3;
        D.lIlIIIIIllIII[11] = 0xFFFFFFAF & 0x267A;
        D.lIlIIIIIllIII[12] = 0xFFFFFEEC & 0x273F;
        D.lIlIIIIIllIII[13] = -(0xFFFFD897 & 0x7FF9) & (0xFFFFFEFF & 0x7FBE);
        D.lIlIIIIIllIII[14] = 0x26 ^ 0x77 ^ (0x46 ^ 0x1F);
    }

    private static boolean lIllIllIIlIIIll(Object object) {
        return object == null;
    }

    private static String lIllIllIIlIIIII(String var12, String var1) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIII[14]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIIIIIllIII[8], var9);
            return new String(var2.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }
}

