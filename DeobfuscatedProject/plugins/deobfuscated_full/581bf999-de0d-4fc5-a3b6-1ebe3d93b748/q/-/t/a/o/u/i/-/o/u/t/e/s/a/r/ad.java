/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

/* TASK: Drinking Ambrosia -> DrinkingambrosiaTask */
@TaskDesc(name="Drinking Ambrosia", priority=105)
public class ad
extends Z {
    private final /* synthetic */ C cE;
    private static /* synthetic */ String[] llIIllIllII;
    private static /* synthetic */ int[] llIIllIllIl;
    private final /* synthetic */ SquireAutoTOA cF;

    static {
        ad.lIlIIIlIllllIl();
        ad.lIlIIIlIllllII();
    }

    private static boolean lIlIIIllIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected ad(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cE = c2;
        this.cF = squireAutoTOA;
    }

    private static boolean lIlIIIllIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlIlllllI(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIlIllllIl() {
        llIIllIllIl = new int[5];
        ad.llIIllIllIl[0] = (0x23 ^ 0x79 ^ (0xAB ^ 0xB3)) & (0xB8 ^ 0x97 ^ (0x44 ^ 0x29) ^ -1);
        ad.llIIllIllIl[1] = 0x18 ^ 0x12 ^ (0x7D ^ 0x63);
        ad.llIIllIllIl[2] = 0x1E ^ 0x66 ^ (0x47 ^ 0x12);
        ad.llIIllIllIl[3] = 0x94 ^ 0xA6;
        ad.llIIllIllIl[4] = 1;
    }

    private static String lIlIIIlIlllIll(String var7, String var12) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var2 = var12.toCharArray();
        int var8 = llIIllIllIl[0];
        char[] var3 = var7.toCharArray();
        int var1 = var3.length;
        int var4 = llIIllIllIl[0];
        while (ad.lIlIIIllIIIIlI(var4, var1)) {
            char var5 = var3[var4];
            var6.append((char)(var5 ^ var2[var8 % var2.length]));
            0;
            ++var8;
            ++var4;
            0;
            
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean lIlIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIllllll(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIlIllllII() {
        llIIllIllII = new String[llIIllIllIl[4]];
        ad.llIIllIllII[ad.llIIllIllIl[0]] = ad."Drink";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        int var11;
        int n2;
        ad var10;
        if (ad.lIlIIIlIlllllI(this.cF.e() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIllllll(var10.aq() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIllllll(var10.cE.am() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIlllllI(Inventory.contains(item -> e.NECTAR.d(item.getId())) ? 1 : 0)) {
            n2 = llIIllIllIl[1];
            0;
            if (-1 != -1) {
                return (3 & ~3) != 0;
            }
        } else {
            n2 = var11 = llIIllIllIl[2];
        }
        if (ad.lIlIIIlIlllllI(var10.bf() ? 1 : 0)) {
            var11 = llIIllIllIl[3];
        }
        if (ad.lIlIIIllIIIIII(Combat.getCurrentHealth(), var11)) {
            return llIIllIllIl[0];
        }
        Item var9 = Inventory.getFirst(item -> e.AMBROSIA.d(item.getId()));
        if (ad.lIlIIIllIIIIIl(var9)) {
            return llIIllIllIl[0];
        }
        var2_2.interact(llIIllIllII[llIIllIllIl[0]]);
        this.cE.ao();
        return llIIllIllIl[4];
    }
}

