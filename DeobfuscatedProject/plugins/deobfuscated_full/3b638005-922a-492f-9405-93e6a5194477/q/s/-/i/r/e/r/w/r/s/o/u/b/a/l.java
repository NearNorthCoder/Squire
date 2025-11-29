/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=133337)
public class l
extends Task {
    private static /* synthetic */ int[] llllIlIIlII;
    private final /* synthetic */ SquireBarrows O;
    private final /* synthetic */ SquireBarrowsConfig P;
    private static /* synthetic */ String[] llllIlIIIll;

    private static boolean lIllIlIlIIllll(int n2) {
        return n2 == 0;
    }

    private static void lIllIlIlIIllIl() {
        llllIlIIIll = new String[llllIlIIlII[3]];
        l.llllIlIIIll[l.llllIlIIlII[0]] = l."Eat";
        l.llllIlIIIll[l.llllIlIIlII[1]] = l."Eat";
    }

    private static boolean lIllIlIlIlIIII(int n2) {
        return n2 != 0;
    }

    private static String lIllIlIlIIllII(String var3, String var6) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var4 = var6.toCharArray();
        int var13 = llllIlIIlII[0];
        char[] var11 = var3.toCharArray();
        int var1 = var11.length;
        int var2 = llllIlIIlII[0];
        while (l.lIllIlIlIlIIll(var2, var1)) {
            char var14 = var11[var2];
            var9.append((char)(var14 ^ var4[var13 % var4.length]));
            0;
            ++var13;
            ++var2;
            0;
            if (1 <= (0x18 ^ 0x32 ^ (0x69 ^ 0x47))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIllIlIlIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIllIlIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        l.lIllIlIlIIlllI();
        l.lIllIlIlIIllIl();
    }

    @Inject
    public l(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.O = squireBarrows;
        this.P = squireBarrowsConfig;
    }

    private static boolean lIllIlIlIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIlIlIIlllI() {
        llllIlIIlII = new int[4];
        l.llllIlIIlII[0] = (0x4F ^ 0x50 ^ (0xF1 ^ 0xA6)) & (64 + 96 - 153 + 187 ^ 83 + 89 - 122 + 88 ^ -1);
        l.llllIlIIlII[1] = 1;
        l.llllIlIIlII[2] = -(0xFFFF8D3D & 0x76F3) & (0xFFFFBFBF & 0x4FFF);
        l.llllIlIIlII[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        l var16;
        int var10;
        if (l.lIllIlIlIIllll(this.O.h() ? 1 : 0)) {
            return llllIlIIlII[0];
        }
        int[] nArray = new int[llllIlIIlII[1]];
        nArray[l.llllIlIIlII[0]] = llllIlIIlII[2];
        if (l.lIllIlIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllIlIIlII[1]];
            nArray2[l.llllIlIIlII[0]] = llllIlIIlII[2];
            Inventory.dropAll((int[])nArray2);
            0;
        }
        if (l.lIllIlIlIlIIIl(var10 = Combat.getCurrentHealth(), var16.P.eatAtHp())) {
            return llllIlIIlII[0];
        }
        Item var5 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIlIIlII[1]];
            stringArray[l.llllIlIIlII[0]] = llllIlIIIll[llllIlIIlII[1]];
            return item.hasAction(stringArray);
        });
        if (l.lIllIlIlIlIIlI(var5)) {
            return llllIlIIlII[0];
        }
        var2_2.interact(llllIlIIIll[llllIlIIlII[0]]);
        return llllIlIIlII[1];
    }

    private static String lIllIlIlIIlIll(String var7, String var17) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llllIlIIlII[3], var12);
            return new String(var8.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }
}

