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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v;

@TaskDesc(name="Handling Akkha Prayers", priority=0x7FFFFFFF, register=true)
public class ar
extends W {
    private static /* synthetic */ String[] llIllIllIlI;
    private /* synthetic */ Prayer df;
    private /* synthetic */ int dg;
    private static /* synthetic */ int[] llIllIllIll;
    private /* synthetic */ Prayer de;

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
        ar.llIllIllIlI[ar.llIllIllIll[1]] = ar."Akkha";
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
        void llllllllllllllllIIlIllIIIllllIll;
        NPC nPC = npcChanged.getNpc();
        if (ar.lIlIlIlIIlllIl(nPC.getId(), llIllIllIll[6])) {
            this.df = Prayer.PROTECT_FROM_MELEE;
            0;
            if (3 < 2) {
                return;
            }
        } else if (ar.lIlIlIlIIlllIl(llllllllllllllllIIlIllIIIllllIll.getId(), llIllIllIll[7])) {
            llllllllllllllllIIlIllIIIlllllIl.df = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (-1 != -1) {
                return;
            }
        } else if (ar.lIlIlIlIIlllIl(llllllllllllllllIIlIllIIIllllIll.getId(), llIllIllIll[9])) {
            llllllllllllllllIIlIllIIIlllllIl.df = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void llllllllllllllllIIlIllIIIlllIlIl;
        Actor actor = animationChanged.getActor();
        if (ar.lIlIlIlIIllllI(actor instanceof Player)) {
            return;
        }
        if (ar.lIlIlIlIIlllll(llllllllllllllllIIlIllIIIlllIlIl.getId(), llIllIllIll[6]) && ar.lIlIlIlIIlllll(llllllllllllllllIIlIllIIIlllIlIl.getId(), llIllIllIll[7]) && ar.lIlIlIlIIlllll(llllllllllllllllIIlIllIIIlllIlIl.getId(), llIllIllIll[9])) {
            return;
        }
        if (ar.lIlIlIlIIlllIl(llllllllllllllllIIlIllIIIlllIlIl.getAnimation(), llIllIllIll[11])) {
            llllllllllllllllIIlIllIIIlllIlll.de = Prayer.PROTECT_FROM_MELEE;
        }
        if (ar.lIlIlIlIIlllIl(llllllllllllllllIIlIllIIIlllIlIl.getAnimation(), llIllIllIll[12])) {
            llllllllllllllllIIlIllIIIlllIlll.de = Prayer.PROTECT_FROM_MISSILES;
        }
        if (ar.lIlIlIlIIlllIl(llllllllllllllllIIlIllIIIlllIlIl.getAnimation(), llIllIllIll[13])) {
            llllllllllllllllIIlIllIIIlllIlll.de = Prayer.PROTECT_FROM_MAGIC;
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

    private static void lIlIlIlIIllIII() {
        llIllIllIll = new int[14];
        ar.llIllIllIll[0] = 1;
        ar.llIllIllIll[1] = (104 + 159 - 63 + 10 ^ 151 + 53 - 59 + 53) & (0x9C ^ 0x8F ^ (0xA2 ^ 0xA5) ^ -1);
        ar.llIllIllIll[2] = -(0xFFFFDF13 & 0x37EF) & (0xFFFFBFFF & 0x5FCF);
        ar.llIllIllIll[3] = 0xFFFFAF3F & 0x7ED3;
        ar.llIllIllIll[4] = -(0xFFFFA4AB & 0x5F75) & (0xFFFFFFF7 & 0x3D7C);
        ar.llIllIllIll[5] = 0x75 ^ 0x71;
        ar.llIllIllIll[6] = -(0xFFFFFD71 & 0x539F) & (0xFFFFFF7E & 0x7F9F);
        ar.llIllIllIll[7] = 0xFFFFFE8F & 0x2F7F;
        ar.llIllIllIll[8] = 2;
        ar.llIllIllIll[9] = -(3 + 182 - 24 + 33) & (0xFFFFAEF3 & 0x7FDD);
        ar.llIllIllIll[10] = 3;
        ar.llIllIllIll[11] = -(0xFFFFDBB7 & 0x65DD) & (0xFFFFE7FF & 0x7FBE);
        ar.llIllIllIll[12] = -(0xFFFFDBE7 & 0x7DDB) & (0xFFFFFFFF & 0x7FEE);
        ar.llIllIllIll[13] = 0xFFFFF7FE & 0x2E2F;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        void llllllllllllllllIIlIllIIlIIIIIlI;
        int llllllllllllllllIIlIllIIlIIIIIIl;
        int n2;
        ar llllllllllllllllIIlIllIIlIIIIIll;
        String[] stringArray = new String[llIllIllIll[0]];
        stringArray[ar.llIllIllIll[1]] = llIllIllIlI[llIllIllIll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (ar.lIlIlIlIIllIIl(nPC)) {
            return List.of(this.aQ());
        }
        if (ar.lIlIlIlIIllIlI(Static.getClient().getTickCount(), llllllllllllllllIIlIllIIlIIIIIll.dg)) {
            llllllllllllllllIIlIllIIlIIIIIll.de = llllllllllllllllIIlIllIIlIIIIIll.df;
        }
        int[] nArray = new int[llIllIllIll[0]];
        nArray[ar.llIllIllIll[1]] = llIllIllIll[2];
        if (ar.lIlIlIlIIllIll(Projectiles.getAll((int[])nArray).isEmpty() ? 1 : 0)) {
            n2 = llIllIllIll[0];
            0;
            if (2 != 2) {
                return null;
            }
        } else {
            n2 = llIllIllIll[1];
        }
        if (ar.lIlIlIlIIllIll(llllllllllllllllIIlIllIIlIIIIIIl = n2) && ar.lIlIlIlIIlllII(llllllllllllllllIIlIllIIlIIIIIll.df, Prayer.PROTECT_FROM_MELEE) && ar.lIlIlIlIIllIll(llllllllllllllllIIlIllIIlIIIIIlI.isAnimating() ? 1 : 0)) {
            llllllllllllllllIIlIllIIlIIIIIll.de = llllllllllllllllIIlIllIIlIIIIIll.df;
        }
        if (ar.lIlIlIlIIlllIl(llllllllllllllllIIlIllIIlIIIIIlI.getId(), llIllIllIll[3])) {
            llllllllllllllllIIlIllIIlIIIIIll.de = Prayer.PROTECT_FROM_MAGIC;
        }
        return List.of(this.aQ(), this.de);
    }

    @Inject
    public ar(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.de = Prayer.PROTECT_FROM_MELEE;
        this.df = Prayer.PROTECT_FROM_MAGIC;
    }

    private static boolean lIlIlIlIIllIll(int n2) {
        return n2 == 0;
    }

    private static String lIlIlIlIIlIllI(String llllllllllllllllIIlIllIIIllIllIl, String llllllllllllllllIIlIllIIIllIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIIIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIIIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIIIllIllll.init(llIllIllIll[8], llllllllllllllllIIlIllIIIlllIIII);
            return new String(llllllllllllllllIIlIllIIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIIIllIlllI) {
            llllllllllllllllIIlIllIIIllIlllI.printStackTrace();
            return null;
        }
    }
}

