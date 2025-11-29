/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandos;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

@TaskDesc(name="Teleporting out", priority=100, blocking=true, register=true)
public class l
extends Task {
    private final /* synthetic */ SquireBandos K;
    private final /* synthetic */ e I;
    private static /* synthetic */ int[] lllIIlIIIII;
    private final /* synthetic */ SquireBandosConfig J;
    private /* synthetic */ boolean L;
    private static /* synthetic */ String[] lllIIIlllll;

    private static void lIlIlllIlIIIIl() {
        lllIIIlllll = new String[lllIIlIIIII[4]];
        l.lllIIIlllll[l.lllIIlIIIII[1]] = l."Pick-up";
        l.lllIIIlllll[l.lllIIlIIIII[0]] = l."Bandos altar";
        l.lllIIIlllll[l.lllIIlIIIII[5]] = l."Teleport";
        l.lllIIIlllll[l.lllIIlIIIII[7]] = l."Break";
        l.lllIIIlllll[l.lllIIlIIIII[8]] = l."blowpipe needs to be charged";
        l.lllIIIlllll[l.lllIIlIIIII[9]] = l."Eat";
        l.lllIIIlllll[l.lllIIlIIIII[10]] = l."Stamina";
    }

    private static boolean lIlIlllIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIlIIllI(Object object) {
        return object == null;
    }

    private static String lIlIlllIIllllI(String llllllllllllllllIIlIIlIlllIIlIll, String llllllllllllllllIIlIIlIlllIIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIlllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIIlIIIII[11]), "DES");
            Cipher llllllllllllllllIIlIIlIlllIIllIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlIlllIIllIl.init(lllIIlIIIII[5], llllllllllllllllIIlIIlIlllIIlllI);
            return new String(llllllllllllllllIIlIIlIlllIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIlllIIllII) {
            llllllllllllllllIIlIIlIlllIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIIlll(Object object, Object object2) {
        return object != object2;
    }

    private void K() {
        l llllllllllllllllIIlIIlIlllIllIlI;
        if (l.lIlIlllIlIIlII(this.J.pickupCannon() ? 1 : 0) && l.lIlIlllIlIIlII(this.I.y() ? 1 : 0)) {
            int[] nArray = new int[lllIIlIIIII[0]];
            nArray[l.lllIIlIIIII[1]] = lllIIlIIIII[4];
            TileObject tileObject = TileObjects.getNearest((int[])nArray);
            tileObject.interact(lllIIIlllll[lllIIlIIIII[1]]);
            return;
        }
        if (l.lIlIlllIlIIlII(llllllllllllllllIIlIIlIlllIllIlI.J.altarTeleport() ? 1 : 0)) {
            String[] stringArray = new String[lllIIlIIIII[0]];
            stringArray[l.lllIIlIIIII[1]] = lllIIIlllll[lllIIlIIIII[0]];
            TileObject llllllllllllllllIIlIIlIlllIllIIl = TileObjects.getNearest((String[])stringArray);
            if (l.lIlIlllIlIIllI(llllllllllllllllIIlIIlIlllIllIIl)) {
                llllllllllllllllIIlIIlIlllIllIlI.L();
                return;
            }
            llllllllllllllllIIlIIlIlllIllIIl.interact(lllIIIlllll[lllIIlIIIII[5]]);
            0;
            if (((0xF0 ^ 0x95 ^ (0x7D ^ 0x57)) & (21 + 149 - 135 + 213 ^ 150 + 44 - 164 + 153 ^ -1)) <= -1) {
                return;
            }
        } else {
            llllllllllllllllIIlIIlIlllIllIlI.L();
        }
    }

    private static String lIlIlllIlIIIII(String llllllllllllllllIIlIIlIllIlllIll, String llllllllllllllllIIlIIlIllIllIlIl) {
        llllllllllllllllIIlIIlIllIlllIll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIllIlllIIl = new StringBuilder();
        char[] llllllllllllllllIIlIIlIllIlllIII = llllllllllllllllIIlIIlIllIllIlIl.toCharArray();
        int llllllllllllllllIIlIIlIllIllIlll = lllIIlIIIII[1];
        char[] llllllllllllllllIIlIIlIllIllIIIl = llllllllllllllllIIlIIlIllIlllIll.toCharArray();
        int llllllllllllllllIIlIIlIllIllIIII = llllllllllllllllIIlIIlIllIllIIIl.length;
        int llllllllllllllllIIlIIlIllIlIllll = lllIIlIIIII[1];
        while (l.lIlIlllIlIIlIl(llllllllllllllllIIlIIlIllIlIllll, llllllllllllllllIIlIIlIllIllIIII)) {
            char llllllllllllllllIIlIIlIllIllllII = llllllllllllllllIIlIIlIllIllIIIl[llllllllllllllllIIlIIlIllIlIllll];
            llllllllllllllllIIlIIlIllIlllIIl.append((char)(llllllllllllllllIIlIIlIllIllllII ^ llllllllllllllllIIlIIlIllIlllIII[llllllllllllllllIIlIIlIllIllIlll % llllllllllllllllIIlIIlIllIlllIII.length]));
            0;
            ++llllllllllllllllIIlIIlIllIllIlll;
            ++llllllllllllllllIIlIIlIllIlIllll;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIllIlllIIl);
    }

    static {
        l.lIlIlllIlIIIlI();
        l.lIlIlllIlIIIIl();
    }

    private static String lIlIlllIIlllll(String llllllllllllllllIIlIIlIllIlIIllI, String llllllllllllllllIIlIIlIllIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIllIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIllIlIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIllIlIlIII.init(lllIIlIIIII[5], llllllllllllllllIIlIIlIllIlIlIIl);
            return new String(llllllllllllllllIIlIIlIllIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIllIlIIlll) {
            llllllllllllllllIIlIIlIllIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlllIlIIIlI() {
        lllIIlIIIII = new int[12];
        l.lllIIlIIIII[0] = 1;
        l.lllIIlIIIII[1] = (0x12 ^ 6 ^ (0xF8 ^ 0xB1)) & (0x41 ^ 0x4A ^ (0xF3 ^ 0xA5) ^ -1);
        l.lllIIlIIIII[2] = 89 + 74 - 6 + 21 ^ 108 + 49 - 127 + 112;
        l.lllIIlIIIII[3] = 0xC ^ 0x6B ^ (0x6E ^ 0x1E);
        l.lllIIlIIIII[4] = 0xC7 ^ 0xA4 ^ (0x72 ^ 0x16);
        l.lllIIlIIIII[5] = 2;
        l.lllIIlIIIII[6] = 0xFFFFDF7D & 0x3FCF;
        l.lllIIlIIIII[7] = 3;
        l.lllIIlIIIII[8] = 0xB3 ^ 0xB7;
        l.lllIIlIIIII[9] = 1 ^ 4;
        l.lllIIlIIIII[10] = 0x1B ^ 0x1D;
        l.lllIIlIIIII[11] = 0xB2 ^ 0xBA;
    }

    private void L() {
        int[] nArray = new int[lllIIlIIIII[0]];
        nArray[l.lllIIlIIIII[1]] = lllIIlIIIII[6];
        Item item = Inventory.getFirst((int[])nArray);
        if (l.lIlIlllIlIIllI(item)) {
            Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
            return;
        }
        item.interact(lllIIIlllll[lllIIlIIIII[7]]);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllllIIlIIlIlllIlIIll;
        if (l.lIlIlllIlIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (l.lIlIlllIlIIlII(llllllllllllllllIIlIIlIlllIlIIll.getMessage().contains(lllIIIlllll[lllIIlIIIII[8]]) ? 1 : 0)) {
            llllllllllllllllIIlIIlIlllIlIlII.L = lllIIlIIIII[0];
        }
    }

    public boolean run() {
        l llllllllllllllllIIlIIlIlllIlllIl;
        int n2;
        if (!l.lIlIlllIlIIIll(this.L ? 1 : 0) || l.lIlIlllIlIIIll(Inventory.contains(item -> item.getName().startsWith(lllIIIlllll[lllIIlIIIII[10]])) ? 1 : 0)) {
            n2 = lllIIlIIIII[0];
            0;
            if (1 < 0) {
                return ((0xEB ^ 0xBA) & ~(0x59 ^ 8)) != 0;
            }
        } else {
            this.L = lllIIlIIIII[1];
            n2 = this.L ? 1 : 0;
        }
        if (l.lIlIlllIlIIIll(Inventory.contains(item -> item.hasAction(lllIIIlllll[lllIIlIIIII[9]]::equals)) ? 1 : 0)) {
            if (l.lIlIlllIlIIlII(llllllllllllllllIIlIIlIlllIlllIl.I.s() ? 1 : 0) && l.lIlIlllIlIIlIl(Combat.getCurrentHealth(), lllIIlIIIII[2])) {
                llllllllllllllllIIlIIlIlllIlllIl.L = lllIIlIIIII[0];
                0;
                if ((0x65 ^ 0x28 ^ (0xD2 ^ 0x9A)) <= 0) {
                    return ((84 + 22 - -2 + 40 ^ 73 + 153 - 187 + 133) & (0x32 ^ 0x2B ^ (0x29 ^ 8) ^ -1)) != 0;
                }
            } else if (l.lIlIlllIlIIIll(llllllllllllllllIIlIIlIlllIlllIl.I.s() ? 1 : 0) && l.lIlIlllIlIIlIl(Combat.getCurrentHealth(), lllIIlIIIII[3])) {
                llllllllllllllllIIlIIlIlllIlllIl.L = lllIIlIIIII[0];
            }
        }
        if (l.lIlIlllIlIIlII(llllllllllllllllIIlIIlIlllIlllIl.L ? 1 : 0)) {
            if (l.lIlIlllIlIIIll(llllllllllllllllIIlIIlIlllIlllIl.I.t() ? 1 : 0)) {
                llllllllllllllllIIlIIlIlllIlllIl.K.forceStop();
                0;
                if (1 <= 0) {
                    return ((0x33 ^ 0x11) & ~(0x19 ^ 0x3B)) != 0;
                }
            } else {
                llllllllllllllllIIlIIlIlllIlllIl.K();
            }
            return lllIIlIIIII[0];
        }
        return lllIIlIIIII[1];
    }

    private static boolean lIlIlllIlIIIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public l(e e2, SquireBandosConfig squireBandosConfig, SquireBandos squireBandos) {
        this.I = e2;
        this.J = squireBandosConfig;
        this.K = squireBandos;
    }
}

