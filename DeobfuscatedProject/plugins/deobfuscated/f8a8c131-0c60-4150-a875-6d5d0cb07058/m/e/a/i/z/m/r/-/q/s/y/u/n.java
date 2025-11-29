/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammy;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Teleporting out", priority=100, blocking=true)
public class n
extends Task {
    private static /* synthetic */ String[] lIllIIlIlllll;
    private final /* synthetic */ l J;
    private final /* synthetic */ SquireZammy L;
    private final /* synthetic */ SquireZammyConfig K;
    private static /* synthetic */ int[] lIllIIllIIIII;

    private static String llIIIllIIllIIlI(String llllllllllllllIllIIlIIlIllIlllll, String llllllllllllllIllIIlIIlIllIllllI) {
        try {
            SecretKeySpec llllllllllllllIllIIlIIlIlllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIlIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIIlIlllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIIlIlllIIIIl.init(lIllIIllIIIII[4], llllllllllllllIllIIlIIlIlllIIIlI);
            return new String(llllllllllllllIllIIlIIlIlllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIIlIlllIIIII) {
            llllllllllllllIllIIlIIlIlllIIIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public n(l l2, SquireZammyConfig squireZammyConfig, SquireZammy squireZammy) {
        this.J = l2;
        this.K = squireZammyConfig;
        this.L = squireZammy;
    }

    private static boolean llIIIllIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void M() {
        if (n.llIIIllIIllIlll(this.K.altarTeleport() ? 1 : 0)) {
            void llllllllllllllIllIIlIIlIlllIIlll;
            String[] stringArray = new String[lIllIIllIIIII[0]];
            stringArray[n.lIllIIllIIIII[1]] = lIllIIlIlllll[lIllIIllIIIII[1]];
            TileObject tileObject = TileObjects.getNearest((String[])stringArray);
            if (n.llIIIllIIlllIIl(tileObject)) {
                Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            llllllllllllllIllIIlIIlIlllIIlll.interact(lIllIIlIlllll[lIllIIllIIIII[0]]);
            0;
            if (((115 + 44 - 84 + 120 ^ 74 + 73 - 29 + 12) & (0xDD ^ 0xAB ^ (0x8E ^ 0xB9) ^ -1)) != 0) {
                return;
            }
        } else {
            Item llllllllllllllIllIIlIIlIlllIIlll = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIllIIllIIIII[0]];
                stringArray[n.lIllIIllIIIII[1]] = lIllIIlIlllll[lIllIIllIIIII[5]];
                return item.hasAction(stringArray);
            });
            if (n.llIIIllIIlllIIl(llllllllllllllIllIIlIIlIlllIIlll)) {
                return;
            }
            llllllllllllllIllIIlIIlIlllIIlll.interact(lIllIIlIlllll[lIllIIllIIIII[4]]);
        }
    }

    private static boolean llIIIllIIlllIIl(Object object) {
        return object == null;
    }

    static {
        n.llIIIllIIllIlIl();
        n.llIIIllIIllIlII();
    }

    private static boolean llIIIllIIllIllI(int n2) {
        return n2 == 0;
    }

    private static void llIIIllIIllIlIl() {
        lIllIIllIIIII = new int[9];
        n.lIllIIllIIIII[0] = 1;
        n.lIllIIllIIIII[1] = ((0x44 ^ 2) & ~(0x5C ^ 0x1A) ^ (0x95 ^ 0xBF)) & (0x86 ^ 0x95 ^ (0xB8 ^ 0x81) ^ -1);
        n.lIllIIllIIIII[2] = 0x88 ^ 0xA0;
        n.lIllIIllIIIII[3] = 0x3D ^ 0x21 ^ (0x84 ^ 0x8F);
        n.lIllIIllIIIII[4] = 2;
        n.lIllIIllIIIII[5] = 3;
        n.lIllIIllIIIII[6] = 0xE2 ^ 0x90 ^ (0x37 ^ 0x41);
        n.lIllIIllIIIII[7] = 0x24 ^ 0x2B ^ (0x38 ^ 0x32);
        n.lIllIIllIIIII[8] = 0x89 ^ 0x8F;
    }

    private static void llIIIllIIllIlII() {
        lIllIIlIlllll = new String[lIllIIllIIIII[8]];
        n.lIllIIlIlllll[n.lIllIIllIIIII[1]] = n."Zamorak altar";
        n.lIllIIlIlllll[n.lIllIIllIIIII[0]] = n."Teleport";
        n.lIllIIlIlllll[n.lIllIIllIIIII[4]] = n."Break";
        n.lIllIIlIlllll[n.lIllIIllIIIII[5]] = n."Break";
        n.lIllIIlIlllll[n.lIllIIllIIIII[6]] = n."Eat";
        n.lIllIIlIlllll[n.lIllIIllIIIII[7]] = n."Stamina";
    }

    private static String llIIIllIIllIIll(String llllllllllllllIllIIlIIlIllIIllll, String llllllllllllllIllIIlIIlIllIIlllI) {
        llllllllllllllIllIIlIIlIllIIllll = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIlIllIIllIl = new StringBuilder();
        char[] llllllllllllllIllIIlIIlIllIIllII = llllllllllllllIllIIlIIlIllIIlllI.toCharArray();
        int llllllllllllllIllIIlIIlIllIIlIll = lIllIIllIIIII[1];
        char[] llllllllllllllIllIIlIIlIllIIIlIl = llllllllllllllIllIIlIIlIllIIllll.toCharArray();
        int llllllllllllllIllIIlIIlIllIIIlII = llllllllllllllIllIIlIIlIllIIIlIl.length;
        int llllllllllllllIllIIlIIlIllIIIIll = lIllIIllIIIII[1];
        while (n.llIIIllIIlllIII(llllllllllllllIllIIlIIlIllIIIIll, llllllllllllllIllIIlIIlIllIIIlII)) {
            char llllllllllllllIllIIlIIlIllIlIIII = llllllllllllllIllIIlIIlIllIIIlIl[llllllllllllllIllIIlIIlIllIIIIll];
            llllllllllllllIllIIlIIlIllIIllIl.append((char)(llllllllllllllIllIIlIIlIllIlIIII ^ llllllllllllllIllIIlIIlIllIIllII[llllllllllllllIllIIlIIlIllIIlIll % llllllllllllllIllIIlIIlIllIIllII.length]));
            0;
            ++llllllllllllllIllIIlIIlIllIIlIll;
            ++llllllllllllllIllIIlIIlIllIIIIll;
            0;
            if (((0xDF ^ 0x9E) & ~(0x33 ^ 0x72)) < 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIIlIllIIllIl);
    }

    private static boolean llIIIllIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        n llllllllllllllIllIIlIIlIlllIllII;
        int llllllllllllllIllIIlIIlIlllIlIll;
        int n2;
        if (n.llIIIllIIllIllI(Inventory.contains(item -> item.getName().startsWith(lIllIIlIlllll[lIllIIllIIIII[7]])) ? 1 : 0)) {
            n2 = lIllIIllIIIII[0];
            0;
            if (null != null) {
                return ((0x13 ^ 0x52) & ~(0x2F ^ 0x6E)) != 0;
            }
        } else {
            n2 = llllllllllllllIllIIlIIlIlllIlIll = lIllIIllIIIII[1];
        }
        if (n.llIIIllIIllIllI(Inventory.contains(item -> item.hasAction(lIllIIlIlllll[lIllIIllIIIII[6]]::equals)) ? 1 : 0)) {
            if (n.llIIIllIIllIlll(llllllllllllllIllIIlIIlIlllIllII.J.A() ? 1 : 0) && n.llIIIllIIlllIII(Combat.getCurrentHealth(), lIllIIllIIIII[2])) {
                llllllllllllllIllIIlIIlIlllIlIll = lIllIIllIIIII[0];
                0;
                if ((0x14 ^ 0x10) == 1) {
                    return ((7 ^ 0x21) & ~(0x99 ^ 0xBF)) != 0;
                }
            } else if (n.llIIIllIIllIllI(llllllllllllllIllIIlIIlIlllIllII.J.A() ? 1 : 0) && n.llIIIllIIlllIII(Combat.getCurrentHealth(), lIllIIllIIIII[3])) {
                llllllllllllllIllIIlIIlIlllIlIll = lIllIIllIIIII[0];
            }
        }
        if (n.llIIIllIIllIlll(llllllllllllllIllIIlIIlIlllIlIll)) {
            if (n.llIIIllIIllIllI(llllllllllllllIllIIlIIlIlllIllII.J.B() ? 1 : 0)) {
                llllllllllllllIllIIlIIlIlllIllII.L.forceStop();
                0;
                if (((0x47 ^ 0x5D ^ (0x79 ^ 0x32)) & (0x2F ^ 0x21 ^ (0x57 ^ 8) ^ -1)) != ((0x50 ^ 0x13 ^ (0x77 ^ 0x26)) & (147 + 45 - 86 + 49 ^ 129 + 23 - 20 + 5 ^ -1))) {
                    return ((8 + 73 - -23 + 148 ^ 60 + 12 - -67 + 30) & (98 + 71 - 49 + 91 ^ 118 + 72 - 184 + 128 ^ -1)) != 0;
                }
            } else {
                llllllllllllllIllIIlIIlIlllIllII.M();
            }
            return lIllIIllIIIII[0];
        }
        return lIllIIllIIIII[1];
    }
}

