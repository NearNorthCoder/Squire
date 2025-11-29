/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

/* TASK: Drink Overload -> DrinkoverloadTask */
@TaskDesc(name="Drink Overload", priority=30000)
public class ab
extends Task {
    private final /* synthetic */ SquireChambersPlugin cA;
    private static /* synthetic */ String[] lIlIIlIIIIII;
    private static /* synthetic */ int[] lIlIIlIIIIIl;
    private final /* synthetic */ SquireChambersConfig cB;

    private static boolean llIlIlllllllll(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIlllllIIlI(String var28, String var3) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var14 = var3.toCharArray();
        int var5 = lIlIIlIIIIIl[0];
        char[] var24 = var28.toCharArray();
        int var20 = var24.length;
        int var15 = lIlIIlIIIIIl[0];
        while (ab.llIlIlllllllII(var15, var20)) {
            char var18 = var24[var15];
            var22.append((char)(var18 ^ var14[var5 % var14.length]));
            0;
            ++var5;
            ++var15;
            0;
            if ((0x94 ^ 0x91) > 0) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean llIlIllllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private boolean cu() {
        ab var29;
        if (ab.llIlIlllllIllI(Players.getLocal().getPlane())) {
            return lIlIIlIIIIIl[0];
        }
        n var12 = var29.cA.L();
        if (ab.llIlIlllllIlll(var12)) {
            return lIlIIlIIIIIl[0];
        }
        List<N> var13 = var29.cA.C().e();
        int var7 = lIlIIlIIIIIl[0];
        int var16 = lIlIIlIIIIIl[0];
        while (ab.llIlIlllllllII(var16, var13.size())) {
            N var8 = var13.get(var16);
            if (ab.llIlIlllllllIl((Object)var8) && ab.llIlIllllllllI((Object)var8, (Object)N.SCAVENGERS) && ab.llIlIllllllllI((Object)var8, (Object)N.CRABS) && ab.llIlIllllllllI((Object)var8, (Object)N.END) && ab.llIlIllllllllI((Object)var8, (Object)N.START) && ab.llIlIllllllllI((Object)var8, (Object)N.FARMING)) {
                if (ab.llIlIlllllllll((Object)var8, (Object)N.THIEVING)) {
                    0;
                    if (1 < 0) {
                        return ((0x6C ^ 0xE ^ (6 ^ 0x32)) & (0x7E ^ 0x75 ^ (0xEE ^ 0xB3) ^ -1)) != 0;
                    }
                } else {
                    if (ab.llIlIllllllIll(var7) && ab.llIlIllllllIll(var29.cA.C().a(var8) ? 1 : 0)) {
                        return lIlIIlIIIIIl[3];
                    }
                    if (ab.llIlIlllllllll((Object)var8, (Object)var12.aM())) {
                        var7 = lIlIIlIIIIIl[3];
                    }
                }
            }
            ++var16;
            0;
            if (-1 == -1) continue;
            return ((0x7A ^ 0x77 ^ (0x35 ^ 0x3E)) & (0xE3 ^ 0xC0 ^ (0x86 ^ 0xA3) ^ -1)) != 0;
        }
        return lIlIIlIIIIIl[0];
    }

    private static boolean llIlIllllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlllllIlll(Object object) {
        return object == null;
    }

    private static String llIlIlllllIIIl(String var6, String var4) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var27 = Cipher.getInstance("Blowfish");
            var27.init(lIlIIlIIIIIl[5], var10);
            return new String(var27.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllllllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ab.llIlIlllllIllI(this.ct() ? 1 : 0) && ab.llIlIlllllIllI(this.cu() ? 1 : 0)) {
            return lIlIIlIIIIIl[0];
        }
        Item var25 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIlIIIIII[lIlIIlIIIIIl[6]]));
        if (ab.llIlIlllllIlll(var25)) {
            return lIlIIlIIIIIl[0];
        }
        int var1 = Static.getClient().getVarbitValue(lIlIIlIIIIIl[1]);
        if (ab.llIlIllllllIII(var1)) {
            return lIlIIlIIIIIl[0];
        }
        if (ab.llIlIllllllIIl(Combat.getCurrentHealth(), lIlIIlIIIIIl[2])) {
            return lIlIIlIIIIIl[0];
        }
        var1_1.interact(lIlIIlIIIIII[lIlIIlIIIIIl[0]]);
        return lIlIIlIIIIIl[3];
    }

    private static boolean llIlIllllllllI(Object object, Object object2) {
        return object != object2;
    }

    private static void llIlIlllllIlIl() {
        lIlIIlIIIIIl = new int[8];
        ab.lIlIIlIIIIIl[0] = (0xAA ^ 0x9C) & ~(0x79 ^ 0x4F);
        ab.lIlIIlIIIIIl[1] = -(0xFFFFA9ED & 0x7ED3) & (0xFFFFBDEB & 0x7FFE);
        ab.lIlIIlIIIIIl[2] = 0x7E ^ 0x4C;
        ab.lIlIIlIIIIIl[3] = 1;
        ab.lIlIIlIIIIIl[4] = 0x73 ^ 0x34 ^ (0x31 ^ 0x72);
        ab.lIlIIlIIIIIl[5] = 2;
        ab.lIlIIlIIIIIl[6] = 3;
        ab.lIlIIlIIIIIl[7] = 0x75 ^ 0x7D;
    }

    private static void llIlIlllllIlII() {
        lIlIIlIIIIII = new String[lIlIIlIIIIIl[4]];
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[0]] = ab."Drink";
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[3]] = ab."Mystical barrier";
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[5]] = ab."Quick-pass";
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[6]] = ab."Overload";
    }

    private static boolean llIlIlllllllIl(Object object) {
        return object != null;
    }

    private static String llIlIlllllIIll(String var9, String var2) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIIl[7]), "DES");
            Cipher var26 = Cipher.getInstance("DES");
            var26.init(lIlIIlIIIIIl[5], var19);
            return new String(var26.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private boolean ct() {
        if (ab.llIlIlllllIllI(u.be() ? 1 : 0)) {
            return lIlIIlIIIIIl[0];
        }
        Player var11 = Players.getLocal();
        if (!ab.llIlIllllllIlI(u.bg(), lIlIIlIIIIIl[4]) || ab.llIlIllllllIll(var11.getPlane())) {
            return lIlIIlIIIIIl[0];
        }
        TileObject var23 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ab.llIlIllllllIll(tileObject.getName().contains(lIlIIlIIIIII[lIlIIlIIIIIl[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIIIl[3]];
                stringArray[ab.lIlIIlIIIIIl[0]] = lIlIIlIIIIII[lIlIIlIIIIIl[5]];
                if (ab.llIlIllllllIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIIIIl[3];
                    0;
                    if (2 == 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlIIIIIl[0];
            return n2 != 0;
        });
        if (ab.llIlIlllllIlll(var23)) {
            return lIlIIlIIIIIl[0];
        }
        if (ab.llIlIllllllIIl(var11.getWorldY(), var23.getWorldY())) {
            return lIlIIlIIIIIl[0];
        }
        return lIlIIlIIIIIl[3];
    }

    @Inject
    public ab(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cA = squireChambersPlugin;
        this.cB = squireChambersConfig;
    }

    static {
        ab.llIlIlllllIlIl();
        ab.llIlIlllllIlII();
    }

    private static boolean llIlIllllllIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlllllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlllllllII(int n2, int n3) {
        return n2 < n3;
    }
}

