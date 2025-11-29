/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drink Stamina", priority=30000)
public class ac
extends Task {
    private static /* synthetic */ int[] lIlIIlIlllII;
    private static /* synthetic */ String[] lIlIIlIllIll;
    /* synthetic */ int cD;
    /* synthetic */ boolean cE;
    private final /* synthetic */ SquireChambersPlugin cC;

    protected boolean cv() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (ac.llIllIIllIlIlI(item.getName().startsWith(lIlIIlIllIll[lIlIIlIlllII[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIlllII[3]];
                stringArray[ac.lIlIIlIlllII[0]] = lIlIIlIllIll[lIlIIlIlllII[6]];
                if (ac.llIllIIllIlIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIlllII[3];
                    0;
                    if (2 != (6 ^ 0x51 ^ (0xCD ^ 0x9E))) return n2 != 0;
                    return ((145 + 70 - 189 + 169 ^ 79 + 67 - 112 + 112) & (51 + 189 - 98 + 111 ^ 145 + 49 - 109 + 87 ^ -1)) != 0;
                }
            }
            n2 = lIlIIlIlllII[0];
            return n2 != 0;
        });
        if (ac.llIllIIllIllII(item2)) {
            return lIlIIlIlllII[0];
        }
        item2.interact(lIlIIlIllIll[lIlIIlIlllII[0]]);
        this.sleep(lIlIIlIlllII[4]);
        return lIlIIlIlllII[3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean b(n n2, TileObject tileObject) {
        int n3;
        if (ac.llIllIIllIlIlI(tileObject.getName().equals(lIlIIlIllIll[lIlIIlIlllII[3]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIlIlllII[3]];
            stringArray[ac.lIlIIlIlllII[0]] = lIlIIlIllIll[lIlIIlIlllII[4]];
            if (ac.llIllIIllIlIlI(tileObject.hasAction(stringArray) ? 1 : 0) && ac.llIllIIllIlIlI(n2.a((Locatable)tileObject) ? 1 : 0)) {
                n3 = lIlIIlIlllII[3];
                0;
                if (-1 <= 0) return n3 != 0;
                return ((0xAE ^ 0xA5) & ~(0x31 ^ 0x3A)) != 0;
            }
        }
        n3 = lIlIIlIlllII[0];
        return n3 != 0;
    }

    private static boolean llIllIIllIllII(Object object) {
        return object == null;
    }

    private static void llIllIIllIlIIl() {
        lIlIIlIlllII = new int[9];
        ac.lIlIIlIlllII[0] = (55 + 146 - 63 + 47 ^ 60 + 77 - 106 + 102) & (0x57 ^ 0x78 ^ (0x23 ^ 0x30) ^ -1);
        ac.lIlIIlIlllII[1] = 137 + 49 - 123 + 80 ^ 94 + 11 - 16 + 56;
        ac.lIlIIlIlllII[2] = 108 + 61 - 105 + 65 ^ 67 + 106 - 72 + 38;
        ac.lIlIIlIlllII[3] = 1;
        ac.lIlIIlIlllII[4] = 2;
        ac.lIlIIlIlllII[5] = 3;
        ac.lIlIIlIlllII[6] = 0xC0 ^ 0xC4;
        ac.lIlIIlIlllII[7] = 0x39 ^ 0x3C;
        ac.lIlIIlIlllII[8] = 63 + 33 - 47 + 78 ^ (0x1E ^ 0x69);
    }

    static {
        ac.llIllIIllIlIIl();
        ac.llIllIIllIlIII();
    }

    public boolean run() {
        if (ac.llIllIIllIlIlI(this.cw() ? 1 : 0)) {
            return lIlIIlIlllII[0];
        }
        if (ac.llIllIIllIlIll(Movement.getRunEnergy(), lIlIIlIlllII[1]) && !ac.llIllIIllIlIlI(Movement.isStaminaBoosted() ? 1 : 0) || ac.llIllIIllIlIll(Movement.getRunEnergy(), lIlIIlIlllII[2])) {
            ac lllllllllllllllIllIllIIlllIIlIll;
            lllllllllllllllIllIllIIlllIIlIll.cv();
            0;
            return lIlIIlIlllII[3];
        }
        return lIlIIlIlllII[0];
    }

    private static boolean llIllIIllIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cw() {
        boolean bl2;
        void lllllllllllllllIllIllIIlllIIIIlI;
        n n2 = this.cC.L();
        if (!ac.llIllIIllIllIl(n2) || ac.llIllIIllIlllI(n2.a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIlIlllII[0];
        }
        TileObject lllllllllllllllIllIllIIlllIIIIIl = TileObjects.getNearest(arg_0 -> ac.b((n)lllllllllllllllIllIllIIlllIIIIlI, arg_0));
        if (ac.llIllIIllIllIl(lllllllllllllllIllIllIIlllIIIIIl)) {
            bl2 = lIlIIlIlllII[3];
            0;
            if (3 == 0) {
                return ((0x54 ^ 0x63) & ~(8 ^ 0x3F)) != 0;
            }
        } else {
            bl2 = lIlIIlIlllII[0];
        }
        return bl2;
    }

    private static String llIllIIllIIlIl(String lllllllllllllllIllIllIIllIIllIll, String lllllllllllllllIllIllIIllIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIllIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIllIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIllIIlllIl.init(lIlIIlIlllII[4], lllllllllllllllIllIllIIllIIllllI);
            return new String(lllllllllllllllIllIllIIllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIllIIlllII) {
            lllllllllllllllIllIllIIllIIlllII.printStackTrace();
            return null;
        }
    }

    private static void llIllIIllIlIII() {
        lIlIIlIllIll = new String[lIlIIlIlllII[7]];
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[0]] = ac."Drink";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[3]] = ac."Energy well";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[4]] = ac."Touch";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[5]] = ac."Stamina potion";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[6]] = ac."Drink";
    }

    private static String llIllIIllIIlll(String lllllllllllllllIllIllIIllIllIIII, String lllllllllllllllIllIllIIllIlIlIlI) {
        lllllllllllllllIllIllIIllIllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIllIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIIllIlIlllI = new StringBuilder();
        char[] lllllllllllllllIllIllIIllIlIllIl = lllllllllllllllIllIllIIllIlIlIlI.toCharArray();
        int lllllllllllllllIllIllIIllIlIllII = lIlIIlIlllII[0];
        char[] lllllllllllllllIllIllIIllIlIIllI = lllllllllllllllIllIllIIllIllIIII.toCharArray();
        int lllllllllllllllIllIllIIllIlIIlIl = lllllllllllllllIllIllIIllIlIIllI.length;
        int lllllllllllllllIllIllIIllIlIIlII = lIlIIlIlllII[0];
        while (ac.llIllIIllIlIll(lllllllllllllllIllIllIIllIlIIlII, lllllllllllllllIllIllIIllIlIIlIl)) {
            char lllllllllllllllIllIllIIllIllIIIl = lllllllllllllllIllIllIIllIlIIllI[lllllllllllllllIllIllIIllIlIIlII];
            lllllllllllllllIllIllIIllIlIlllI.append((char)(lllllllllllllllIllIllIIllIllIIIl ^ lllllllllllllllIllIllIIllIlIllIl[lllllllllllllllIllIllIIllIlIllII % lllllllllllllllIllIllIIllIlIllIl.length]));
            0;
            ++lllllllllllllllIllIllIIllIlIllII;
            ++lllllllllllllllIllIllIIllIlIIlII;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIIllIlIlllI);
    }

    private static boolean llIllIIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIllIllIl(Object object) {
        return object != null;
    }

    @Inject
    public ac(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIIlIlllII[0];
        this.cE = lIlIIlIlllII[0];
        this.cC = squireChambersPlugin;
    }

    private static String llIllIIllIIllI(String lllllllllllllllIllIllIIllIIIllII, String lllllllllllllllIllIllIIllIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIllIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIllIIIllIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIlllII[8]), "DES");
            Cipher lllllllllllllllIllIllIIllIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIllIIlIIII.init(lIlIIlIlllII[4], lllllllllllllllIllIllIIllIIlIIIl);
            return new String(lllllllllllllllIllIllIIllIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIllIIIllll) {
            lllllllllllllllIllIllIIllIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllIlllI(int n2) {
        return n2 == 0;
    }
}

