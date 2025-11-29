/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;

/* TASK: Curing Poison/Venom -> Curingpoison/VenomTask */
@TaskDesc(name="Curing Poison/Venom")
public class al
extends Z {
    private static /* synthetic */ String[] llIIlIlIIIl;
    private static /* synthetic */ int[] llIIlIlIIlI;
    private final /* synthetic */ SquireAutoTOA cP;
    private final /* synthetic */ C cQ;

    private static String lIlIIIIIllIIIl(String var15, String var6) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llIIlIlIIlI[2], var2);
            return new String(var7.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    static {
        al.lIlIIIIIllIIll();
        al.lIlIIIIIllIIlI();
    }

    private static boolean lIlIIIIIllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIIllIllI(Object object) {
        return object == null;
    }

    private static String lIlIIIIIlIllll(String var8, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llIIlIlIIlI[7]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIIlIlIIlI[2], var4);
            return new String(var5.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIIIllIIll() {
        llIIlIlIIlI = new int[8];
        al.llIIlIlIIlI[0] = (0xB5 ^ 0xC3 ^ (0x61 ^ 7)) & (65 + 128 - 90 + 51 ^ 131 + 95 - 168 + 80 ^ -1);
        al.llIIlIlIIlI[1] = 1;
        al.llIIlIlIIlI[2] = 2;
        al.llIIlIlIIlI[3] = 3;
        al.llIIlIlIIlI[4] = 0x5C ^ 0x58;
        al.llIIlIlIIlI[5] = 109 + 33 - 9 + 58 ^ 15 + 39 - -7 + 125;
        al.llIIlIlIIlI[6] = 0x1C ^ 0x70 ^ (0x74 ^ 0x1E);
        al.llIIlIlIIlI[7] = 0x9B ^ 0x8B ^ (0x33 ^ 0x2B);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!al.lIlIIIIIllIlII(this.cP.e() ? 1 : 0) || al.lIlIIIIIllIlII(this.bc() ? 1 : 0)) {
            return llIIlIlIIlI[0];
        }
        if (al.lIlIIIIIllIlII(Combat.isPoisoned() ? 1 : 0) && al.lIlIIIIIllIlII(Combat.isVenomed() ? 1 : 0)) {
            return llIIlIlIIlI[0];
        }
        if (al.lIlIIIIIllIlIl(TileObjects.getAll(tileObject -> {
            int n2;
            if (!al.lIlIIIIIllIlII(tileObject.getName().toLowerCase().contains(llIIlIlIIIl[llIIlIlIIlI[4]]) ? 1 : 0) || al.lIlIIIIIllIlIl(tileObject.getName().toLowerCase().contains(llIIlIlIIIl[llIIlIlIIlI[5]]) ? 1 : 0)) {
                n2 = llIIlIlIIlI[1];
                0;
                if ((0xBA ^ 0xBE) <= 0) {
                    return false;
                }
            } else {
                n2 = llIIlIlIIlI[0];
            }
            return n2 != 0;
        }).stream().anyMatch(tileObject -> tileObject.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation())) ? 1 : 0)) {
            return llIIlIlIIlI[0];
        }
        Item var9 = Inventory.getFirst(item -> {
            boolean bl2;
            if (!al.lIlIIIIIllIlII(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[1]]) ? 1 : 0) || !al.lIlIIIIIllIlII(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[2]]) ? 1 : 0) || al.lIlIIIIIllIlIl(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[3]]) ? 1 : 0)) {
                bl2 = llIIlIlIIlI[1];
                0;
                if (-(59 + 141 - 99 + 60 ^ 1 + 33 - 28 + 158) >= 0) {
                    return ((0x41 ^ 0x14 ^ (0xBC ^ 0xC5)) & (75 + 38 - 59 + 85 ^ 62 + 72 - 9 + 42 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIlIlIIlI[0];
            }
            return bl2;
        });
        if (al.lIlIIIIIllIllI(var9)) {
            return llIIlIlIIlI[0];
        }
        var1_1.interact(llIIlIlIIIl[llIIlIlIIlI[0]]);
        return llIIlIlIIlI[0];
    }

    private static boolean lIlIIIIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIIIIIllIIlI() {
        llIIlIlIIIl = new String[llIIlIlIIlI[6]];
        al.llIIlIlIIIl[al.llIIlIlIIlI[0]] = al."Drink";
        al.llIIlIlIIIl[al.llIIlIlIIlI[1]] = al."Anti";
        al.llIIlIlIIIl[al.llIIlIlIIlI[2]] = al."dote";
        al.llIIlIlIIIl[al.llIIlIlIIlI[3]] = al."venom";
        al.llIIlIlIIIl[al.llIIlIlIIlI[4]] = al."venom";
        al.llIIlIlIIIl[al.llIIlIlIIlI[5]] = al."poison";
    }

    private static String lIlIIIIIllIIII(String var16, String var20) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var14 = var20.toCharArray();
        int var13 = llIIlIlIIlI[0];
        char[] var18 = var16.toCharArray();
        int var1 = var18.length;
        int var10 = llIIlIlIIlI[0];
        while (al.lIlIIIIIllIlll(var10, var1)) {
            char var17 = var18[var10];
            var12.append((char)(var17 ^ var14[var13 % var14.length]));
            0;
            ++var13;
            ++var10;
            0;
            if (2 != ((0x4F ^ 0x11) & ~(0xF5 ^ 0xAB))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean lIlIIIIIllIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected al(Client client, SquireAutoTOA squireAutoTOA, C c2) {
        super(client);
        this.cP = squireAutoTOA;
        this.cQ = c2;
    }
}

