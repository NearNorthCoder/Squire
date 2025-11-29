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
import java.util.Locale;
import java.util.stream.Stream;
import gg.squire.mta.tasks.MtaManager;
import gg.squire.mta.tasks.MtaManager;
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
extends MtaManager<n> {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[0];
        while (x.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (1 <= 3) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    private TelekineticRoomTask(n n2, SquireMTA squireMTA) {
        super(n2, squireMTA);
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }

    static {
        x.var21();
        x.var22();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var23;
        x var24;
        void var25;
        Player player = Players.getLocal();
        NPC nPC = ((n)this.aB).E();
        if (x.var26(nPC)) {
            int[] nArray = new int[var1[1]];
            nArray[x.var1[0]] = var1[2];
            TileObject tileObject = TileObjects.getNearest((int[])nArray);
            String[] stringArray = new String[var1[1]];
            stringArray[x.var1[0]] = var2[var1[1]];
            NPC nPC2 = NPCs.getNearest((String[])stringArray);
            if (x.var27(player.distanceTo((Locatable)nPC2), player.distanceTo((Locatable)tileObject))) {
                Movement.walkTo((Locatable)nPC2);
                0;
                0;
                if (-1 >= 0) {
                    return ((0xE9 ^ 0xC4) & ~(0xAE ^ 0x83)) != 0;
                }
            } else {
                void var28;
                Movement.walkTo((Locatable)var28);
                0;
            }
            return var1[1];
        }
        if (x.var29(var25.isMoving() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var28 = ((n)var24.aB).G();
        if (x.var29(var23.getWorldLocation().equals((Object)((n)var24.aB).K()) ? 1 : 0)) {
            if (x.var29(Dialog.isOpen() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[var1[3]];
                dialogOptionArray[x.var1[0]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[x.var1[1]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[x.var1[4]] = DialogOption.PLAIN_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return var1[1];
            }
            var23.interact(var1[0]);
            return var1[1];
        }
        if (x.var20(var25.getWorldLocation().equals((Object)var28) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var28);
            0;
            if (-1 >= 1) {
                return ((6 + 39 - -51 + 45 ^ 25 + 142 - 12 + 35) & (79 + 59 - 32 + 82 ^ 122 + 26 - 142 + 137 ^ -1)) != 0;
            }
        } else if (x.var20(var23.isMoving() ? 1 : 0)) {
            Magic.cast((Spevar24.L(), (NPC)var23);
            var24.sleep(var1[4]);
        }
        return var1[1];
    }

    private static boolean var26(Object object) {
        return object == null;
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var27(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public Spell L() {
        return SpellBook.Standard.TELEKINETIC_GRAB;
    }

    @Override
    public boolean a(Item item) {
        int n2;
        if (x.var29(item.getName().toLowerCase(Locale.ROOT).contains(var2[var1[0]]) ? 1 : 0) && x.var29(Stream.of(Rune.AIR.getRuneNames()).anyMatch(string -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (1 != 1) {
                return ((0x9E ^ 0x90) & ~(0x9D ^ 0x93)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static void var22() {
        var2 = new String[var1[4]];
        x.var2[x.var1[0]] = "staff";
        x.var2[x.var1[1]] = "Telekinetic Guardian";
    }

    private static void var21() {
        var1 = new int[6];
        x.var1[0] = (0x9B ^ 0x93) & ~(0x3D ^ 0x35);
        x.var1[1] = 1;
        x.var1[2] = -(0xFFFFD7F5 & 0x2D2B) & (0xFFFFFF2F & 0x2FF3);
        x.var1[3] = 3;
        x.var1[4] = 2;
        x.var1[5] = 0x13 ^ 0x5E ^ (0x28 ^ 0x6D);
    }

    private static boolean var29(int n2) {
        return n2 != 0;
    }
}

