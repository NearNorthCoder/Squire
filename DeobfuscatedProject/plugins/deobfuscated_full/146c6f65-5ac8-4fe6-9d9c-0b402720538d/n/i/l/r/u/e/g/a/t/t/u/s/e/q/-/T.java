/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

/* TASK: Equipping gear -> EquippinggearTask */
@TaskDesc(name="Equipping gear", priority=5, blocking=true)
public class T
extends n {
    private static /* synthetic */ String[] llIIllIIllII;
    private static /* synthetic */ int[] llIIllIIllIl;

    @Override
    public boolean be() {
        Player player = Players.getLocal();
        if (!T.llllllIllIIIll(player) || T.llllllIllIIlII(player.isMoving() ? 1 : 0)) {
            return llIIllIIllIl[1];
        }
        f[] fArray = new f[llIIllIIllIl[5]];
        fArray[T.llIIllIIllIl[1]] = f.TIER_1_BODY;
        fArray[T.llIIllIIllIl[2]] = f.TIER_1_HELM;
        fArray[T.llIIllIIllIl[3]] = f.TIER_1_LEGS;
        fArray[T.llIIllIIllIl[4]] = f.TIER_1_STAFF;
        fArray[T.llIIllIIllIl[0]] = f.TIER_2_STAFF;
        List var13 = Stream.of(fArray).filter(f2 -> {
            boolean bl;
            if (T.llllllIllIIlII(Equipment.contains((int[])f2.ad()) ? 1 : 0)) {
                bl = llIIllIIllIl[2];
                0;
                if (3 <= -1) {
                    return false;
                }
            } else {
                bl = llIIllIIllIl[1];
            }
            return bl;
        }).filter(f2 -> Inventory.contains((int[])f2.ad())).collect(Collectors.toList());
        if (T.llllllIllIIlIl(var13.isEmpty() ? 1 : 0)) {
            return llIIllIIllIl[1];
        }
        Iterator var2 = var13.iterator();
        if (T.llllllIllIIlIl(var2.hasNext() ? 1 : 0)) {
            String string;
            f var8 = (f)((Object)var2.next());
            Item var5 = Inventory.getFirst((int[])var8.ad());
            if (T.llllllIllIIllI(var5)) {
                return llIIllIIllIl[1];
            }
            String[] stringArray = new String[llIIllIIllIl[2]];
            stringArray[T.llIIllIIllIl[1]] = llIIllIIllII[llIIllIIllIl[1]];
            if (T.llllllIllIIlIl(var5.hasAction(stringArray) ? 1 : 0)) {
                string = llIIllIIllII[llIIllIIllIl[2]];
                0;
                if ((0x70 ^ 0x75) <= 0) {
                    return false;
                }
            } else {
                string = llIIllIIllII[llIIllIIllIl[3]];
            }
            var5.interact(string);
            return llIIllIIllIl[2];
        }
        return llIIllIIllIl[1];
    }

    private static String llllllIlIlllll(String var6, String var14) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llIIllIIllIl[6]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llIIllIIllIl[3], var15);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    static {
        T.llllllIllIIIlI();
        T.llllllIllIIIIl();
    }

    private static String llllllIlIllllI(String var10, String var21) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIIllIIllIl[3], var18);
            return new String(var3.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIllIIlII(int n2) {
        return n2 == 0;
    }

    private static void llllllIllIIIlI() {
        llIIllIIllIl = new int[7];
        T.llIIllIIllIl[0] = 0x7D ^ 0x22 ^ (0xEB ^ 0xB0);
        T.llIIllIIllIl[1] = (0x4D ^ 0x55) & ~(0x6B ^ 0x73);
        T.llIIllIIllIl[2] = 1;
        T.llIIllIIllIl[3] = 2;
        T.llIIllIIllIl[4] = 3;
        T.llIIllIIllIl[5] = 0x52 ^ 0x4D ^ (0x5A ^ 0x40);
        T.llIIllIIllIl[6] = 0x32 ^ 0x7F ^ (0x74 ^ 0x31);
    }

    private static String llllllIllIIIII(String var4, String var16) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var12 = var16.toCharArray();
        int var11 = llIIllIIllIl[1];
        char[] var23 = var4.toCharArray();
        int var7 = var23.length;
        int var9 = llIIllIIllIl[1];
        while (T.llllllIllIIlll(var9, var7)) {
            char var17 = var23[var9];
            var20.append((char)(var17 ^ var12[var11 % var12.length]));
            0;
            ++var11;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean llllllIllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIllIIllI(Object object) {
        return object == null;
    }

    @Inject
    public T(c c2) {
        d[] dArray = new d[llIIllIIllIl[0]];
        dArray[T.llIIllIIllIl[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[T.llIIllIIllIl[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[T.llIIllIIllIl[3]] = d.FIRST_ROTATION_CREATE;
        dArray[T.llIIllIIllIl[4]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
    }

    private static boolean llllllIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIllIIIll(Object object) {
        return object != null;
    }

    private static void llllllIllIIIIl() {
        llIIllIIllII = new String[llIIllIIllIl[4]];
        T.llIIllIIllII[T.llIIllIIllIl[1]] = T."Wear";
        T.llIIllIIllII[T.llIIllIIllIl[2]] = T."Wear";
        T.llIIllIIllII[T.llIIllIIllIl[3]] = T."Wield";
    }
}

