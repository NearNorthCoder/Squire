/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Rune
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package m.u.a.-.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.u.a.-.e.s.q.t.i.r.n_Unknown;
import m.u.a.-.e.s.q.t.i.r.w_Unknown;
import net.runelite.api.DialogOption;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Telekinetic room -> TelekineticroomTask */
@TaskDesc(name="Telekinetic room", priority=7, blocking=true)
public class TelekineticRoomTask
extends w_Unknown<n> {
    private static /* synthetic */ int[] lllIllIIlllI;
    private static /* synthetic */ String[] lllIllIIllIl;

    private static String lIIIllIIlllllll(String var2, String var18) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lllIllIIlllI[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lllIllIIlllI[4], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIIllllllI(String var10, String var1) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var17 = var1.toCharArray();
        int var11 = lllIllIIlllI[0];
        char[] var4 = var10.toCharArray();
        int var3 = var4.length;
        int var5 = lllIllIIlllI[0];
        while (x.lIIIllIlIIIIllI(var5, var3)) {
            char var7 = var4[var5];
            var14.append((char)(var7 ^ var17[var11 % var17.length]));
            0;
            ++var11;
            ++var5;
            0;
            if (1 <= 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    @Inject
    private x(n n2, SquireMTA squireMTA) {
        super(n2, squireMTA);
    }

    private static boolean lIIIllIlIIIIlIl(int n2) {
        return n2 == 0;
    }

    static {
        x.lIIIllIlIIIIIIl();
        x.lIIIllIlIIIIIII();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var6;
        x var12;
        void var13;
        Player player = Players.getLocal();
        NPC nPC = ((n)this.aB).E();
        if (x.lIIIllIlIIIIIll(nPC)) {
            int[] nArray = new int[lllIllIIlllI[1]];
            nArray[x.lllIllIIlllI[0]] = lllIllIIlllI[2];
            TileObject tileObject = TileObjects.getNearest((int[])nArray);
            String[] stringArray = new String[lllIllIIlllI[1]];
            stringArray[x.lllIllIIlllI[0]] = lllIllIIllIl[lllIllIIlllI[1]];
            NPC nPC2 = NPCs.getNearest((String[])stringArray);
            if (x.lIIIllIlIIIIlII(player.distanceTo((Locatable)nPC2), player.distanceTo((Locatable)tileObject))) {
                Movement.walkTo((Locatable)nPC2);
                0;
                0;
                if (-1 >= 0) {
                    return false;
                }
            } else {
                void var15;
                Movement.walkTo((Locatable)var15);
                0;
            }
            return lllIllIIlllI[1];
        }
        if (x.lIIIllIlIIIIIlI(var13.isMoving() ? 1 : 0)) {
            return lllIllIIlllI[0];
        }
        WorldPoint var15 = ((n)var12.aB).G();
        if (x.lIIIllIlIIIIIlI(var6.getWorldLocation().equals((Object)((n)var12.aB).K()) ? 1 : 0)) {
            if (x.lIIIllIlIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[lllIllIIlllI[3]];
                dialogOptionArray[x.lllIllIIlllI[0]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[x.lllIllIIlllI[1]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[x.lllIllIIlllI[4]] = DialogOption.PLAIN_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return lllIllIIlllI[1];
            }
            var6.interact(lllIllIIlllI[0]);
            return lllIllIIlllI[1];
        }
        if (x.lIIIllIlIIIIlIl(var13.getWorldLocation().equals((Object)var15) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var15);
            0;
            if (-1 >= 1) {
                return false;
            }
        } else if (x.lIIIllIlIIIIlIl(var6.isMoving() ? 1 : 0)) {
            Magic.cast((Spell)var12.L(), (NPC)var6);
            var12.sleep(lllIllIIlllI[4]);
        }
        return lllIllIIlllI[1];
    }

    private static boolean lIIIllIlIIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIIllIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public Spell L() {
        return SpellBook.Standard.TELEKINETIC_GRAB;
    }

    @Override
    public boolean a(Item item) {
        int n2;
        if (x.lIIIllIlIIIIIlI(item.getName().toLowerCase(Locale.ROOT).contains(lllIllIIllIl[lllIllIIlllI[0]]) ? 1 : 0) && x.lIIIllIlIIIIIlI(Stream.of(Rune.AIR.getRuneNames()).anyMatch(string -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            n2 = lllIllIIlllI[1];
            0;
            if (1 != 1) {
                return false;
            }
        } else {
            n2 = lllIllIIlllI[0];
        }
        return n2 != 0;
    }

    private static void lIIIllIlIIIIIII() {
        lllIllIIllIl = new String[lllIllIIlllI[4]];
        x.lllIllIIllIl[x.lllIllIIlllI[0]] = x."staff";
        x.lllIllIIllIl[x.lllIllIIlllI[1]] = x."Telekinetic Guardian";
    }

    private static void lIIIllIlIIIIIIl() {
        lllIllIIlllI = new int[6];
        x.lllIllIIlllI[0] = (0x9B ^ 0x93) & ~(0x3D ^ 0x35);
        x.lllIllIIlllI[1] = 1;
        x.lllIllIIlllI[2] = -(0xFFFFD7F5 & 0x2D2B) & (0xFFFFFF2F & 0x2FF3);
        x.lllIllIIlllI[3] = 3;
        x.lllIllIIlllI[4] = 2;
        x.lllIllIIlllI[5] = 0x13 ^ 0x5E ^ (0x28 ^ 0x6D);
    }

    private static boolean lIIIllIlIIIIIlI(int n2) {
        return n2 != 0;
    }
}

