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
import m.u.a.-.e.s.q.t.i.r.n;
import m.u.a.-.e.s.q.t.i.r.w;
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

@TaskDesc(name="Telekinetic room", priority=7, blocking=true)
public class x
extends w<n> {
    private static /* synthetic */ int[] lllIllIIlllI;
    private static /* synthetic */ String[] lllIllIIllIl;

    private static String lIIIllIIlllllll(String lllllllllllllllIIllIlIIIIIIIlllI, String lllllllllllllllIIllIlIIIIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), lllIllIIlllI[5]), "DES");
            Cipher lllllllllllllllIIllIlIIIIIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIIIIlIIII.init(lllIllIIlllI[4], lllllllllllllllIIllIlIIIIIIlIIIl);
            return new String(lllllllllllllllIIllIlIIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIIIIIllll) {
            lllllllllllllllIIllIlIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIIllllllI(String lllllllllllllllIIllIIllllllllllI, String lllllllllllllllIIllIIllllllllIII) {
        lllllllllllllllIIllIIllllllllllI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllllllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlllllllllII = new StringBuilder();
        char[] lllllllllllllllIIllIIllllllllIll = lllllllllllllllIIllIIllllllllIII.toCharArray();
        int lllllllllllllllIIllIIllllllllIlI = lllIllIIlllI[0];
        char[] lllllllllllllllIIllIIlllllllIlII = lllllllllllllllIIllIIllllllllllI.toCharArray();
        int lllllllllllllllIIllIIlllllllIIll = lllllllllllllllIIllIIlllllllIlII.length;
        int lllllllllllllllIIllIIlllllllIIlI = lllIllIIlllI[0];
        while (x.lIIIllIlIIIIllI(lllllllllllllllIIllIIlllllllIIlI, lllllllllllllllIIllIIlllllllIIll)) {
            char lllllllllllllllIIllIIlllllllllll = lllllllllllllllIIllIIlllllllIlII[lllllllllllllllIIllIIlllllllIIlI];
            lllllllllllllllIIllIIlllllllllII.append((char)(lllllllllllllllIIllIIlllllllllll ^ lllllllllllllllIIllIIllllllllIll[lllllllllllllllIIllIIllllllllIlI % lllllllllllllllIIllIIllllllllIll.length]));
            "".length();
            ++lllllllllllllllIIllIIllllllllIlI;
            ++lllllllllllllllIIllIIlllllllIIlI;
            "".length();
            if (" ".length() <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlllllllllII);
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
        void lllllllllllllllIIllIlIIIIIIllIII;
        x lllllllllllllllIIllIlIIIIIIllIlI;
        void lllllllllllllllIIllIlIIIIIIllIIl;
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
                "".length();
                "".length();
                if (-" ".length() >= 0) {
                    return ((0xE9 ^ 0xC4) & ~(0xAE ^ 0x83)) != 0;
                }
            } else {
                void lllllllllllllllIIllIlIIIIIIlIlll;
                Movement.walkTo((Locatable)lllllllllllllllIIllIlIIIIIIlIlll);
                "".length();
            }
            return lllIllIIlllI[1];
        }
        if (x.lIIIllIlIIIIIlI(lllllllllllllllIIllIlIIIIIIllIIl.isMoving() ? 1 : 0)) {
            return lllIllIIlllI[0];
        }
        WorldPoint lllllllllllllllIIllIlIIIIIIlIlll = ((n)lllllllllllllllIIllIlIIIIIIllIlI.aB).G();
        if (x.lIIIllIlIIIIIlI(lllllllllllllllIIllIlIIIIIIllIII.getWorldLocation().equals((Object)((n)lllllllllllllllIIllIlIIIIIIllIlI.aB).K()) ? 1 : 0)) {
            if (x.lIIIllIlIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[lllIllIIlllI[3]];
                dialogOptionArray[x.lllIllIIlllI[0]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[x.lllIllIIlllI[1]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[x.lllIllIIlllI[4]] = DialogOption.PLAIN_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return lllIllIIlllI[1];
            }
            lllllllllllllllIIllIlIIIIIIllIII.interact(lllIllIIlllI[0]);
            return lllIllIIlllI[1];
        }
        if (x.lIIIllIlIIIIlIl(lllllllllllllllIIllIlIIIIIIllIIl.getWorldLocation().equals((Object)lllllllllllllllIIllIlIIIIIIlIlll) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIIllIlIIIIIIlIlll);
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((6 + 39 - -51 + 45 ^ 25 + 142 - 12 + 35) & (79 + 59 - 32 + 82 ^ 122 + 26 - 142 + 137 ^ -" ".length())) != 0;
            }
        } else if (x.lIIIllIlIIIIlIl(lllllllllllllllIIllIlIIIIIIllIII.isMoving() ? 1 : 0)) {
            Magic.cast((Spell)lllllllllllllllIIllIlIIIIIIllIlI.L(), (NPC)lllllllllllllllIIllIlIIIIIIllIII);
            lllllllllllllllIIllIlIIIIIIllIlI.sleep(lllIllIIlllI[4]);
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
            "".length();
            if (" ".length() != " ".length()) {
                return ((0x9E ^ 0x90) & ~(0x9D ^ 0x93)) != 0;
            }
        } else {
            n2 = lllIllIIlllI[0];
        }
        return n2 != 0;
    }

    private static void lIIIllIlIIIIIII() {
        lllIllIIllIl = new String[lllIllIIlllI[4]];
        x.lllIllIIllIl[x.lllIllIIlllI[0]] = x.lIIIllIIllllllI("OhgpDQI=", "IlHkd");
        x.lllIllIIllIl[x.lllIllIIlllI[1]] = x.lIIIllIIlllllll("inFmW8CQpHvxh3kfUb9eMS8hGTAERxXa", "YrSFa");
    }

    private static void lIIIllIlIIIIIIl() {
        lllIllIIlllI = new int[6];
        x.lllIllIIlllI[0] = (0x9B ^ 0x93) & ~(0x3D ^ 0x35);
        x.lllIllIIlllI[1] = " ".length();
        x.lllIllIIlllI[2] = -(0xFFFFD7F5 & 0x2D2B) & (0xFFFFFF2F & 0x2FF3);
        x.lllIllIIlllI[3] = "   ".length();
        x.lllIllIIlllI[4] = "  ".length();
        x.lllIllIIlllI[5] = 0x13 ^ 0x5E ^ (0x28 ^ 0x6D);
    }

    private static boolean lIIIllIlIIIIIlI(int n2) {
        return n2 != 0;
    }
}

