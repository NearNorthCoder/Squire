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

/* TASK: Teleporting out -> TeleportOutTask */
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

    private static String lIlIlllIIllllI(String var1, String var11) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lllIIlIIIII[11]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllIIlIIIII[5], var22);
            return new String(var10.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIIlll(Object object, Object object2) {
        return object != object2;
    }

    private void K() {
        l var17;
        if (l.lIlIlllIlIIlII(this.J.pickupCannon() ? 1 : 0) && l.lIlIlllIlIIlII(this.I.y() ? 1 : 0)) {
            int[] nArray = new int[lllIIlIIIII[0]];
            nArray[l.lllIIlIIIII[1]] = lllIIlIIIII[4];
            TileObject tileObject = TileObjects.getNearest((int[])nArray);
            tileObject.interact(lllIIIlllll[lllIIlIIIII[1]]);
            return;
        }
        if (l.lIlIlllIlIIlII(var17.J.altarTeleport() ? 1 : 0)) {
            String[] stringArray = new String[lllIIlIIIII[0]];
            stringArray[l.lllIIlIIIII[1]] = lllIIIlllll[lllIIlIIIII[0]];
            TileObject var19 = TileObjects.getNearest((String[])stringArray);
            if (l.lIlIlllIlIIllI(var19)) {
                var17.L();
                return;
            }
            var19.interact(lllIIIlllll[lllIIlIIIII[5]]);
            0;
            if (((0xF0 ^ 0x95 ^ (0x7D ^ 0x57)) & (21 + 149 - 135 + 213 ^ 150 + 44 - 164 + 153 ^ -1)) <= -1) {
                return;
            }
        } else {
            var17.L();
        }
    }

    private static String lIlIlllIlIIIII(String var21, String var23) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var14 = var23.toCharArray();
        int var15 = lllIIlIIIII[1];
        char[] var9 = var21.toCharArray();
        int var13 = var9.length;
        int var18 = lllIIlIIIII[1];
        while (l.lIlIlllIlIIlIl(var18, var13)) {
            char var5 = var9[var18];
            var16.append((char)(var5 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    static {
        l.lIlIlllIlIIIlI();
        l.lIlIlllIlIIIIl();
    }

    private static String lIlIlllIIlllll(String var20, String var7) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllIIlIIIII[5], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
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
        void var6;
        if (l.lIlIlllIlIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (l.lIlIlllIlIIlII(var6.getMessage().contains(lllIIIlllll[lllIIlIIIII[8]]) ? 1 : 0)) {
            llllllllllllllllIIlIIlIlllIlIlII.L = lllIIlIIIII[0];
        }
    }

    public boolean run() {
        l var8;
        int n2;
        if (!l.lIlIlllIlIIIll(this.L ? 1 : 0) || l.lIlIlllIlIIIll(Inventory.contains(item -> item.getName().startsWith(lllIIIlllll[lllIIlIIIII[10]])) ? 1 : 0)) {
            n2 = lllIIlIIIII[0];
            0;
            if (1 < 0) {
                return false;
            }
        } else {
            this.L = lllIIlIIIII[1];
            n2 = this.L ? 1 : 0;
        }
        if (l.lIlIlllIlIIIll(Inventory.contains(item -> item.hasAction(lllIIIlllll[lllIIlIIIII[9]]::equals)) ? 1 : 0)) {
            if (l.lIlIlllIlIIlII(var8.I.s() ? 1 : 0) && l.lIlIlllIlIIlIl(Combat.getCurrentHealth(), lllIIlIIIII[2])) {
                var8.L = lllIIlIIIII[0];
                0;
                if ((0x65 ^ 0x28 ^ (0xD2 ^ 0x9A)) <= 0) {
                    return ((84 + 22 - -2 + 40 ^ 73 + 153 - 187 + 133) & (0x32 ^ 0x2B ^ (0x29 ^ 8) ^ -1)) != 0;
                }
            } else if (l.lIlIlllIlIIIll(var8.I.s() ? 1 : 0) && l.lIlIlllIlIIlIl(Combat.getCurrentHealth(), lllIIlIIIII[3])) {
                var8.L = lllIIlIIIII[0];
            }
        }
        if (l.lIlIlllIlIIlII(var8.L ? 1 : 0)) {
            if (l.lIlIlllIlIIIll(var8.I.t() ? 1 : 0)) {
                var8.K.forceStop();
                0;
                if (1 <= 0) {
                    return false;
                }
            } else {
                var8.K();
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

