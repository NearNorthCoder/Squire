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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Teleporting out", priority=100, blocking=true)
public class n
extends Task {
    private static /* synthetic */ String[] lIIlIIllIIIII;
    private final /* synthetic */ g K;
    private final /* synthetic */ SquireSaradomin M;
    private final /* synthetic */ SquireSaraConfig L;
    private static /* synthetic */ int[] lIIlIIllIIIIl;

    /*
     * WARNING - void declaration
     */
    private void R() {
        if (n.lIlIlIlIIIlIIlI(this.L.altarTeleport() ? 1 : 0)) {
            void llllllllllllllIlllllIlIIIllIllII;
            String[] stringArray = new String[lIIlIIllIIIIl[0]];
            stringArray[n.lIIlIIllIIIIl[1]] = lIIlIIllIIIII[lIIlIIllIIIIl[1]];
            TileObject tileObject = TileObjects.getNearest((String[])stringArray);
            if (n.lIlIlIlIIIlIlII(tileObject)) {
                Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            llllllllllllllIlllllIlIIIllIllII.interact(lIIlIIllIIIII[lIIlIIllIIIIl[0]]);
            0;
            if (((0xE6 ^ 0xA9 ^ (2 ^ 0x5C)) & (160 + 14 - 61 + 48 ^ 99 + 22 - -20 + 35 ^ -1)) < 0) {
                return;
            }
        } else {
            Item llllllllllllllIlllllIlIIIllIllII = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlIIllIIIIl[0]];
                stringArray[n.lIIlIIllIIIIl[1]] = lIIlIIllIIIII[lIIlIIllIIIIl[4]];
                return item.hasAction(stringArray);
            });
            if (n.lIlIlIlIIIlIlII(llllllllllllllIlllllIlIIIllIllII)) {
                Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            llllllllllllllIlllllIlIIIllIllII.interact(lIIlIIllIIIII[lIIlIIllIIIIl[3]]);
        }
    }

    private static boolean lIlIlIlIIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIlIIIIllIl(String llllllllllllllIlllllIlIIIllIIlII, String llllllllllllllIlllllIlIIIllIIIll) {
        try {
            SecretKeySpec llllllllllllllIlllllIlIIIllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIlIIIllIIIll.getBytes(StandardCharsets.UTF_8)), lIIlIIllIIIIl[8]), "DES");
            Cipher llllllllllllllIlllllIlIIIllIIllI = Cipher.getInstance("DES");
            llllllllllllllIlllllIlIIIllIIllI.init(lIIlIIllIIIIl[3], llllllllllllllIlllllIlIIIllIIlll);
            return new String(llllllllllllllIlllllIlIIIllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIlIIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIlIIIllIIlIl) {
            llllllllllllllIlllllIlIIIllIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIIIlIIII() {
        lIIlIIllIIIIl = new int[9];
        n.lIIlIIllIIIIl[0] = 1;
        n.lIIlIIllIIIIl[1] = (10 + 58 - -27 + 41 ^ 36 + 134 - 43 + 22) & (0x4C ^ 1 ^ (0x74 ^ 0x24) ^ -1);
        n.lIIlIIllIIIIl[2] = 0x9C ^ 0x8B;
        n.lIIlIIllIIIIl[3] = 2;
        n.lIIlIIllIIIIl[4] = 3;
        n.lIIlIIllIIIIl[5] = 0x99 ^ 0xBF ^ (0x7F ^ 0x5D);
        n.lIIlIIllIIIIl[6] = 0x1A ^ 0x1F;
        n.lIIlIIllIIIIl[7] = 3 ^ 5;
        n.lIIlIIllIIIIl[8] = 60 + 123 - 47 + 66 ^ 143 + 9 - 47 + 89;
    }

    @Inject
    public n(g g2, SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin) {
        this.K = g2;
        this.L = squireSaraConfig;
        this.M = squireSaradomin;
    }

    private static String lIlIlIlIIIIlllI(String llllllllllllllIlllllIlIIIlIIllll, String llllllllllllllIlllllIlIIIlIlIIll) {
        llllllllllllllIlllllIlIIIlIIllll = new String(Base64.getDecoder().decode(llllllllllllllIlllllIlIIIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIlIIIlIlIIlI = new StringBuilder();
        char[] llllllllllllllIlllllIlIIIlIlIIIl = llllllllllllllIlllllIlIIIlIlIIll.toCharArray();
        int llllllllllllllIlllllIlIIIlIlIIII = lIIlIIllIIIIl[1];
        char[] llllllllllllllIlllllIlIIIlIIlIlI = llllllllllllllIlllllIlIIIlIIllll.toCharArray();
        int llllllllllllllIlllllIlIIIlIIlIIl = llllllllllllllIlllllIlIIIlIIlIlI.length;
        int llllllllllllllIlllllIlIIIlIIlIII = lIIlIIllIIIIl[1];
        while (n.lIlIlIlIIIlIIll(llllllllllllllIlllllIlIIIlIIlIII, llllllllllllllIlllllIlIIIlIIlIIl)) {
            char llllllllllllllIlllllIlIIIlIlIlIl = llllllllllllllIlllllIlIIIlIIlIlI[llllllllllllllIlllllIlIIIlIIlIII];
            llllllllllllllIlllllIlIIIlIlIIlI.append((char)(llllllllllllllIlllllIlIIIlIlIlIl ^ llllllllllllllIlllllIlIIIlIlIIIl[llllllllllllllIlllllIlIIIlIlIIII % llllllllllllllIlllllIlIIIlIlIIIl.length]));
            0;
            ++llllllllllllllIlllllIlIIIlIlIIII;
            ++llllllllllllllIlllllIlIIIlIIlIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllllIlIIIlIlIIlI);
    }

    private static boolean lIlIlIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIIlIIIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        n llllllllllllllIlllllIlIIIlllIIIl;
        int llllllllllllllIlllllIlIIIlllIIII;
        int n2;
        if (n.lIlIlIlIIIlIIIl(Inventory.contains(item -> item.getName().startsWith(lIIlIIllIIIII[lIIlIIllIIIIl[6]])) ? 1 : 0)) {
            n2 = lIIlIIllIIIIl[0];
            0;
            if (-2 >= 0) {
                return ((0xD0 ^ 0x91 ^ (0xC8 ^ 0xC2)) & (0x67 ^ 0x44 ^ (6 ^ 0x6E) ^ -1)) != 0;
            }
        } else {
            n2 = llllllllllllllIlllllIlIIIlllIIII = lIIlIIllIIIIl[1];
        }
        if (n.lIlIlIlIIIlIIIl(Inventory.contains(item -> item.hasAction(lIIlIIllIIIII[lIIlIIllIIIIl[5]]::equals)) ? 1 : 0)) {
            if (n.lIlIlIlIIIlIIlI(llllllllllllllIlllllIlIIIlllIIIl.K.l() ? 1 : 0) && n.lIlIlIlIIIlIIll(Combat.getCurrentHealth(), llllllllllllllIlllllIlIIIlllIIIl.L.eatFoodAt())) {
                llllllllllllllIlllllIlIIIlllIIII = lIIlIIllIIIIl[0];
                0;
                if (2 == (0xC ^ 0x26 ^ (0x2A ^ 4))) {
                    return ((0x81 ^ 0xBB ^ (0x44 ^ 0x66)) & (207 + 161 - 221 + 74 ^ 112 + 183 - 209 + 111 ^ -1)) != 0;
                }
            } else if (n.lIlIlIlIIIlIIIl(llllllllllllllIlllllIlIIIlllIIIl.K.l() ? 1 : 0) && n.lIlIlIlIIIlIIll(Combat.getCurrentHealth(), lIIlIIllIIIIl[2])) {
                llllllllllllllIlllllIlIIIlllIIII = lIIlIIllIIIIl[0];
            }
        }
        if (n.lIlIlIlIIIlIIlI(llllllllllllllIlllllIlIIIlllIIII)) {
            if (n.lIlIlIlIIIlIIIl(llllllllllllllIlllllIlIIIlllIIIl.K.m() ? 1 : 0)) {
                llllllllllllllIlllllIlIIIlllIIIl.M.a(lIIlIIllIIIIl[0]);
                return lIIlIIllIIIIl[1];
            }
            llllllllllllllIlllllIlIIIlllIIIl.R();
            llllllllllllllIlllllIlIIIlllIIIl.M.a(lIIlIIllIIIIl[0]);
            return lIIlIIllIIIIl[0];
        }
        return lIIlIIllIIIIl[1];
    }

    private static void lIlIlIlIIIIllll() {
        lIIlIIllIIIII = new String[lIIlIIllIIIIl[7]];
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[1]] = n."Saradomin altar";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[0]] = n."Teleport";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[3]] = n."Break";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[4]] = n."Break";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[5]] = n."Eat";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[6]] = n."Stamina";
    }

    static {
        n.lIlIlIlIIIlIIII();
        n.lIlIlIlIIIIllll();
    }

    private static boolean lIlIlIlIIIlIlII(Object object) {
        return object == null;
    }
}

