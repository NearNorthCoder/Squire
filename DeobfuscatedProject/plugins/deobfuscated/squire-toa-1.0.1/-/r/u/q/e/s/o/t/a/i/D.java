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

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
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
public class D
extends z {
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
        void llllllllllllllIlllIIllIIIIIlIIII;
        int llllllllllllllIlllIIllIIIIIIllll;
        int n2;
        D llllllllllllllIlllIIllIIIIIlIIIl;
        String[] stringArray = new String[lIlIIIIIllIII[0]];
        stringArray[D.lIlIIIIIllIII[1]] = lIlIIIIIlIlll[lIlIIIIIllIII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (D.lIllIllIIlIIIll(nPC)) {
            return List.of(this.H());
        }
        if (D.lIllIllIIlIIlII(Static.getClient().getTickCount(), llllllllllllllIlllIIllIIIIIlIIIl.aZ)) {
            llllllllllllllIlllIIllIIIIIlIIIl.aX = llllllllllllllIlllIIllIIIIIlIIIl.aY;
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
        if (D.lIllIllIIlIIllI(llllllllllllllIlllIIllIIIIIIllll = n2) && D.lIllIllIIlIIlll(llllllllllllllIlllIIllIIIIIlIIIl.aY, Prayer.PROTECT_FROM_MELEE) && D.lIllIllIIlIIllI(llllllllllllllIlllIIllIIIIIlIIII.isAnimating() ? 1 : 0)) {
            llllllllllllllIlllIIllIIIIIlIIIl.aX = llllllllllllllIlllIIllIIIIIlIIIl.aY;
        }
        if (D.lIllIllIIlIlIII(llllllllllllllIlllIIllIIIIIlIIII.getId(), lIlIIIIIllIII[3])) {
            llllllllllllllIlllIIllIIIIIlIIIl.aX = Prayer.PROTECT_FROM_MAGIC;
        }
        return List.of(this.H(), this.aX);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void llllllllllllllIlllIIllIIIIIIIIll;
        Actor actor = animationChanged.getActor();
        if (D.lIllIllIIlIlIIl(actor instanceof Player)) {
            return;
        }
        if (D.lIllIllIIlIlIlI(llllllllllllllIlllIIllIIIIIIIIll.getId(), lIlIIIIIllIII[6]) && D.lIllIllIIlIlIlI(llllllllllllllIlllIIllIIIIIIIIll.getId(), lIlIIIIIllIII[7]) && D.lIllIllIIlIlIlI(llllllllllllllIlllIIllIIIIIIIIll.getId(), lIlIIIIIllIII[9])) {
            return;
        }
        if (D.lIllIllIIlIlIII(llllllllllllllIlllIIllIIIIIIIIll.getAnimation(), lIlIIIIIllIII[11])) {
            llllllllllllllIlllIIllIIIIIIIlIl.aX = Prayer.PROTECT_FROM_MELEE;
        }
        if (D.lIllIllIIlIlIII(llllllllllllllIlllIIllIIIIIIIIll.getAnimation(), lIlIIIIIllIII[12])) {
            llllllllllllllIlllIIllIIIIIIIlIl.aX = Prayer.PROTECT_FROM_MISSILES;
        }
        if (D.lIllIllIIlIlIII(llllllllllllllIlllIIllIIIIIIIIll.getAnimation(), lIlIIIIIllIII[13])) {
            llllllllllllllIlllIIllIIIIIIIlIl.aX = Prayer.PROTECT_FROM_MAGIC;
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
        void llllllllllllllIlllIIllIIIIIIlIIl;
        NPC nPC = npcChanged.getNpc();
        if (D.lIllIllIIlIlIII(nPC.getId(), lIlIIIIIllIII[6])) {
            this.aY = Prayer.PROTECT_FROM_MELEE;
            0;
            if ((24 + 134 - 49 + 56 ^ 127 + 101 - 158 + 91) == 2) {
                return;
            }
        } else if (D.lIllIllIIlIlIII(llllllllllllllIlllIIllIIIIIIlIIl.getId(), lIlIIIIIllIII[7])) {
            llllllllllllllIlllIIllIIIIIIlIll.aY = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (-1 == ((74 + 18 - 42 + 99 ^ 17 + 47 - -40 + 92) & (205 + 187 - 141 + 4 ^ 119 + 39 - 64 + 80 ^ -1))) {
                return;
            }
        } else if (D.lIllIllIIlIlIII(llllllllllllllIlllIIllIIIIIIlIIl.getId(), lIlIIIIIllIII[9])) {
            llllllllllllllIlllIIllIIIIIIlIll.aY = Prayer.PROTECT_FROM_MAGIC;
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

    private static String lIllIllIIlIIIII(String llllllllllllllIlllIIlIlllllllIll, String llllllllllllllIlllIIlIlllllllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlllllllIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIII[14]), "DES");
            Cipher llllllllllllllIlllIIlIllllllllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIllllllllIl.init(lIlIIIIIllIII[8], llllllllllllllIlllIIlIlllllllllI);
            return new String(llllllllllllllIlllIIlIllllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIllllllllII) {
            llllllllllllllIlllIIlIllllllllII.printStackTrace();
            return null;
        }
    }
}

