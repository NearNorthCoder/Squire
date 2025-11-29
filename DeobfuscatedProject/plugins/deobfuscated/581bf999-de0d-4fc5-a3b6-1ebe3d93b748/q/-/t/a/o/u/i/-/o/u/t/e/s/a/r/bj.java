/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
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
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v;

@TaskDesc(name="Handling Kephri Prayers", priority=0x7FFFFFFF)
public class bj
extends W {
    private static /* synthetic */ String[] lIllllIIIIl;
    private static /* synthetic */ int[] lIllllIIlIl;
    private /* synthetic */ int eZ;

    private static boolean lIIllIlIIllIll(int n2) {
        return n2 != 0;
    }

    @Override
    public int aO() {
        return lIllllIIlIl[4];
    }

    private static String lIIllIlIIlIlIl(String llllllllllllllllIlIIlIllIllIIlll, String llllllllllllllllIlIIlIllIllIIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIllIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIllIllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIllIllIlIll.init(lIllllIIlIl[3], llllllllllllllllIlIIlIllIllIllII);
            return new String(llllllllllllllllIlIIlIllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIllIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIllIllIlIlI) {
            llllllllllllllllIlIIlIllIllIlIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> aN() {
        bj llllllllllllllllIlIIlIllIllllIIl;
        if (bj.lIIllIlIIllIll(this.bW() ? 1 : 0)) {
            this.eZ = lIllllIIlIl[1];
        }
        if (bj.lIIllIlIIlllII(llllllllllllllllIlIIlIllIllllIIl.eZ)) {
            llllllllllllllllIlIIlIllIllllIIl.eZ -= lIllllIIlIl[2];
            return List.of(llllllllllllllllIlIIlIllIllllIIl.aQ(), Prayer.PROTECT_FROM_MAGIC);
        }
        String[] stringArray = new String[lIllllIIlIl[2]];
        stringArray[bj.lIllllIIlIl[0]] = lIllllIIIIl[lIllllIIlIl[0]];
        NPC llllllllllllllllIlIIlIllIllllIII = NPCs.getNearest((String[])stringArray);
        if (bj.lIIllIlIIlllIl(llllllllllllllllIlIIlIllIllllIII) && bj.lIIllIlIIllllI(llllllllllllllllIlIIlIllIllllIII.getWorldArea().distanceTo((Locatable)Players.getLocal()), lIllllIIlIl[3]) && bj.lIIllIlIIllIll(Reachable.isInteractable((Locatable)llllllllllllllllIlIIlIllIllllIII) ? 1 : 0)) {
            return List.of(llllllllllllllllIlIIlIllIllllIIl.aQ(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] stringArray2 = new String[lIllllIIlIl[3]];
        stringArray2[bj.lIllllIIlIl[0]] = lIllllIIIIl[lIllllIIlIl[2]];
        stringArray2[bj.lIllllIIlIl[2]] = lIllllIIIIl[lIllllIIlIl[3]];
        NPC llllllllllllllllIlIIlIllIlllIlll = NPCs.getNearest((String[])stringArray2);
        if (bj.lIIllIlIIlllIl(llllllllllllllllIlIIlIllIlllIlll)) {
            return List.of(llllllllllllllllIlIIlIllIllllIIl.aQ(), Prayer.PROTECT_FROM_MISSILES);
        }
        return List.of(this.aQ());
    }

    private static boolean lIIllIlIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIlIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bj.lIIllIlIIllIlI();
        bj.lIIllIlIIlIlll();
    }

    private static boolean lIIllIlIlIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIlIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIllIlIIlIllI(String llllllllllllllllIlIIlIllIlIlIlII, String llllllllllllllllIlIIlIllIlIllIII) {
        llllllllllllllllIlIIlIllIlIlIlII = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIllIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIllIlIlIlll = new StringBuilder();
        char[] llllllllllllllllIlIIlIllIlIlIllI = llllllllllllllllIlIIlIllIlIllIII.toCharArray();
        int llllllllllllllllIlIIlIllIlIlIlIl = lIllllIIlIl[0];
        char[] llllllllllllllllIlIIlIllIlIIllll = llllllllllllllllIlIIlIllIlIlIlII.toCharArray();
        int llllllllllllllllIlIIlIllIlIIlllI = llllllllllllllllIlIIlIllIlIIllll.length;
        int llllllllllllllllIlIIlIllIlIIllIl = lIllllIIlIl[0];
        while (bj.lIIllIlIlIIIIl(llllllllllllllllIlIIlIllIlIIllIl, llllllllllllllllIlIIlIllIlIIlllI)) {
            char llllllllllllllllIlIIlIllIlIllIlI = llllllllllllllllIlIIlIllIlIIllll[llllllllllllllllIlIIlIllIlIIllIl];
            llllllllllllllllIlIIlIllIlIlIlll.append((char)(llllllllllllllllIlIIlIllIlIllIlI ^ llllllllllllllllIlIIlIllIlIlIllI[llllllllllllllllIlIIlIllIlIlIlIl % llllllllllllllllIlIIlIllIlIlIllI.length]));
            0;
            ++llllllllllllllllIlIIlIllIlIlIlIl;
            ++llllllllllllllllIlIIlIllIlIIllIl;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIlIllIlIlIlll);
    }

    private static boolean lIIllIlIIlllII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bW() {
        boolean bl2;
        void llllllllllllllllIlIIlIllIlllIIll;
        int n2 = lIllllIIlIl[0];
        Iterator llllllllllllllllIlIIlIllIlllIIlI = Static.getClient().getGraphicsObjects().iterator();
        while (bj.lIIllIlIIllIll(llllllllllllllllIlIIlIllIlllIIlI.hasNext() ? 1 : 0)) {
            GraphicsObject llllllllllllllllIlIIlIllIlllIIIl = (GraphicsObject)llllllllllllllllIlIIlIllIlllIIlI.next();
            if (bj.lIIllIlIIlllll(llllllllllllllllIlIIlIllIlllIIIl.getId(), lIllllIIlIl[9])) {
                ++llllllllllllllllIlIIlIllIlllIIll;
            }
            0;
            if (2 > 0) continue;
            return ((155 + 119 - 255 + 170 ^ 110 + 29 - 48 + 50) & (35 + 22 - 30 + 101 ^ 146 + 67 - 178 + 141 ^ -1)) != 0;
        }
        if (bj.lIIllIlIlIIIII((int)llllllllllllllllIlIIlIllIlllIIll, lIllllIIlIl[1])) {
            bl2 = lIllllIIlIl[2];
            0;
            if (null != null) {
                return ((0x53 ^ 0x6B) & ~(0x65 ^ 0x5D)) != 0;
            }
        } else {
            bl2 = lIllllIIlIl[0];
        }
        return bl2;
    }

    private static boolean lIIllIlIIlllIl(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return lIllllIIlIl[2];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[lIllllIIlIl[5]];
        nArray[bj.lIllllIIlIl[0]] = lIllllIIlIl[6];
        nArray[bj.lIllllIIlIl[2]] = lIllllIIlIl[7];
        nArray[bj.lIllllIIlIl[3]] = lIllllIIlIl[8];
        return this.cm.a(nArray);
    }

    private static void lIIllIlIIllIlI() {
        lIllllIIlIl = new int[10];
        bj.lIllllIIlIl[0] = (0x9D ^ 0xA0 ^ (0xE ^ 0x74)) & (0xCD ^ 0xA7 ^ (0x36 ^ 0x1B) ^ -1);
        bj.lIllllIIlIl[1] = 0x81 ^ 0x87;
        bj.lIllllIIlIl[2] = 1;
        bj.lIllllIIlIl[3] = 2;
        bj.lIllllIIlIl[4] = 0xFFFFFF7C & 0x37D7;
        bj.lIllllIIlIl[5] = 3;
        bj.lIllllIIlIl[6] = 0xFFFFBFC7 & 0x6DFF;
        bj.lIllllIIlIl[7] = 0xFFFFFDCC & 0x2FFB;
        bj.lIllllIIlIl[8] = 0xFFFFBFE9 & 0x6DDF;
        bj.lIllllIIlIl[9] = 0xFFFFE87F & 0x1FE5;
    }

    private static void lIIllIlIIlIlll() {
        lIllllIIIIl = new String[lIllllIIlIl[5]];
        bj.lIllllIIIIl[bj.lIllllIIlIl[0]] = bj."Soldier Scarab";
        bj.lIllllIIIIl[bj.lIllllIIlIl[2]] = bj."Spitting Scarab";
        bj.lIllllIIIIl[bj.lIllllIIlIl[3]] = bj."Agile Scarab";
    }

    @Inject
    public bj(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.eZ = lIllllIIlIl[0];
    }
}

