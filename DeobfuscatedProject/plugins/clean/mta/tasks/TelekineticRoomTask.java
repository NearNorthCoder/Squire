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
package gg.squire.mta.tasks;

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
import gg.squire.mta.tasks.MtaManager;
import gg.squire.mta.tasks.MtaTaskBase;
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
public class TelekineticRoomTask
extends MtaTaskBase<n> {

        return String.valueOf(var1);
    }

    @Inject
    private TelekineticRoomTask(n n2, SquireMTA squireMTA) {
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
        void var2;
        x var3;
        void var4;
        Player player = Players.getLocal();
        NPC nPC = ((MtaManager) his.aB).E();
        if (x.lIIIllIlIIIIIll(nPC)) {
            int[] nArray = new int[lllIllIIlllI[1]];
            nArray[x.lllIllIIlllI[0]] = lllIllIIlllI[2];
            TileObject tileObject = TileObjects.getNearest((int[])nArray);
            String[] stringArray = new String[lllIllIIlllI[1]];
            stringArray[x.lllIllIIlllI[0]] = lllIllIIllIl[lllIllIIlllI[1]];
            NPC nPC2 = NPCs.getNearest((String[])stringArray);
            if (x.lIIIllIlIIIIlII(player.distanceTo((Locatable)nPC2), player.distanceTo((Locatable)tileObject))) {
                Movement.walkTo((Locatable)nPC2);

            } else {
                void var5;
                Movement.walkTo((Locatable)var5);

            }
            return lllIllIIlllI[1];
        }
        if (x.lIIIllIlIIIIIlI(var4.isMoving() ? 1 : 0)) {
            return lllIllIIlllI[0];
        }
        WorldPoint var5 = ((MtaManager) ar3.aB).G();
        if (x.lIIIllIlIIIIIlI(var2.getWorldLocation().equals((Object)((MtaManager) ar3.aB).K()) ? 1 : 0)) {
            if (x.lIIIllIlIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[lllIllIIlllI[3]];
                dialogOptionArray[x.lllIllIIlllI[0]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[x.lllIllIIlllI[1]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[x.lllIllIIlllI[4]] = DialogOption.PLAIN_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return lllIllIIlllI[1];
            }
            var2.interact(lllIllIIlllI[0]);
            return lllIllIIlllI[1];
        }
        if (x.lIIIllIlIIIIlIl(var4.getWorldLocation().equals((Object)var5) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var5);

            if (-1 >= 1) {
                return false;
            }
        } else if (x.lIIIllIlIIIIlIl(var2.isMoving() ? 1 : 0)) {
            Magic.cast((Spell)var3.L(), (NPC)var2);
            var3.sleep(lllIllIIlllI[4]);
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
        x.lllIllIIllIl[x.lllIllIIlllI[0]] = "staff";
        x.lllIllIIllIl[x.lllIllIIlllI[1]] = "Telekinetic Guardian";
    }

    private static boolean lIIIllIlIIIIIlI(int n2) {
        return n2 != 0;
    }
}

