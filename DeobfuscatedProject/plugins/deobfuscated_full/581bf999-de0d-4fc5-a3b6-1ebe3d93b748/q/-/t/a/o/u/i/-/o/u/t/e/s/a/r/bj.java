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

/* TASK: Handling Kephri Prayers -> HandlingkephriprayersTask */
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

    private static String lIIllIlIIlIlIl(String var10, String var6) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIllllIIlIl[3], var18);
            return new String(var16.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> aN() {
        bj var2;
        if (bj.lIIllIlIIllIll(this.bW() ? 1 : 0)) {
            this.eZ = lIllllIIlIl[1];
        }
        if (bj.lIIllIlIIlllII(var2.eZ)) {
            var2.eZ -= lIllllIIlIl[2];
            return List.of(var2.aQ(), Prayer.PROTECT_FROM_MAGIC);
        }
        String[] stringArray = new String[lIllllIIlIl[2]];
        stringArray[bj.lIllllIIlIl[0]] = lIllllIIIIl[lIllllIIlIl[0]];
        NPC var15 = NPCs.getNearest((String[])stringArray);
        if (bj.lIIllIlIIlllIl(var15) && bj.lIIllIlIIllllI(var15.getWorldArea().distanceTo((Locatable)Players.getLocal()), lIllllIIlIl[3]) && bj.lIIllIlIIllIll(Reachable.isInteractable((Locatable)var15) ? 1 : 0)) {
            return List.of(var2.aQ(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] stringArray2 = new String[lIllllIIlIl[3]];
        stringArray2[bj.lIllllIIlIl[0]] = lIllllIIIIl[lIllllIIlIl[2]];
        stringArray2[bj.lIllllIIlIl[2]] = lIllllIIIIl[lIllllIIlIl[3]];
        NPC var3 = NPCs.getNearest((String[])stringArray2);
        if (bj.lIIllIlIIlllIl(var3)) {
            return List.of(var2.aQ(), Prayer.PROTECT_FROM_MISSILES);
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

    private static String lIIllIlIIlIllI(String var12, String var9) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var14 = var9.toCharArray();
        int var1 = lIllllIIlIl[0];
        char[] var19 = var12.toCharArray();
        int var17 = var19.length;
        int var7 = lIllllIIlIl[0];
        while (bj.lIIllIlIlIIIIl(var7, var17)) {
            char var13 = var19[var7];
            var20.append((char)(var13 ^ var14[var1 % var14.length]));
            0;
            ++var1;
            ++var7;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean lIIllIlIIlllII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bW() {
        boolean bl2;
        void var8;
        int n2 = lIllllIIlIl[0];
        Iterator var5 = Static.getClient().getGraphicsObjects().iterator();
        while (bj.lIIllIlIIllIll(var5.hasNext() ? 1 : 0)) {
            GraphicsObject var4 = (GraphicsObject)var5.next();
            if (bj.lIIllIlIIlllll(var4.getId(), lIllllIIlIl[9])) {
                ++var8;
            }
            0;
            if (2 > 0) continue;
            return false;
        }
        if (bj.lIIllIlIlIIIII((int)var8, lIllllIIlIl[1])) {
            bl2 = lIllllIIlIl[2];
            0;
            
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

