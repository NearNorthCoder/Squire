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

    private static String lIllIlIlIIllII(String llllllllllllllllIIIllIlIIlIIIIll, String llllllllllllllllIIIllIlIIlIIIlll) {
        llllllllllllllllIIIllIlIIlIIIIll = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIlIIlIIIllI = new StringBuilder();
        char[] llllllllllllllllIIIllIlIIlIIIlIl = llllllllllllllllIIIllIlIIlIIIlll.toCharArray();
        int llllllllllllllllIIIllIlIIlIIIlII = llllIlIIlII[0];
        char[] llllllllllllllllIIIllIlIIIlllllI = llllllllllllllllIIIllIlIIlIIIIll.toCharArray();
        int llllllllllllllllIIIllIlIIIllllIl = llllllllllllllllIIIllIlIIIlllllI.length;
        int llllllllllllllllIIIllIlIIIllllII = llllIlIIlII[0];
        while (l.lIllIlIlIlIIll(llllllllllllllllIIIllIlIIIllllII, llllllllllllllllIIIllIlIIIllllIl)) {
            char llllllllllllllllIIIllIlIIlIIlIIl = llllllllllllllllIIIllIlIIIlllllI[llllllllllllllllIIIllIlIIIllllII];
            llllllllllllllllIIIllIlIIlIIIllI.append((char)(llllllllllllllllIIIllIlIIlIIlIIl ^ llllllllllllllllIIIllIlIIlIIIlIl[llllllllllllllllIIIllIlIIlIIIlII % llllllllllllllllIIIllIlIIlIIIlIl.length]));
            0;
            ++llllllllllllllllIIIllIlIIlIIIlII;
            ++llllllllllllllllIIIllIlIIIllllII;
            0;
            if (1 <= (0x18 ^ 0x32 ^ (0x69 ^ 0x47))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllIlIIlIIIllI);
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
        l llllllllllllllllIIIllIlIIllIIIlI;
        int llllllllllllllllIIIllIlIIllIIIIl;
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
        if (l.lIllIlIlIlIIIl(llllllllllllllllIIIllIlIIllIIIIl = Combat.getCurrentHealth(), llllllllllllllllIIIllIlIIllIIIlI.P.eatAtHp())) {
            return llllIlIIlII[0];
        }
        Item llllllllllllllllIIIllIlIIllIIIII = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIlIIlII[1]];
            stringArray[l.llllIlIIlII[0]] = llllIlIIIll[llllIlIIlII[1]];
            return item.hasAction(stringArray);
        });
        if (l.lIllIlIlIlIIlI(llllllllllllllllIIIllIlIIllIIIII)) {
            return llllIlIIlII[0];
        }
        var2_2.interact(llllIlIIIll[llllIlIIlII[0]]);
        return llllIlIIlII[1];
    }

    private static String lIllIlIlIIlIll(String llllllllllllllllIIIllIlIIlIlIllI, String llllllllllllllllIIIllIlIIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIIllIlIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIlIIlIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIlIIlIllIlI.init(llllIlIIlII[3], llllllllllllllllIIIllIlIIlIllIll);
            return new String(llllllllllllllllIIIllIlIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIlIIlIllIIl) {
            llllllllllllllllIIIllIlIIlIllIIl.printStackTrace();
            return null;
        }
    }
}

