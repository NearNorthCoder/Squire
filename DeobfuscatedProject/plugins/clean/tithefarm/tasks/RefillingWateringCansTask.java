/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheFarm;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.tithefarm.tasks.IHelper;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Refilling Watering Cans", priority=100, blocking=true, register=true)
public class RefillingWateringCansTask
extends TithefarmTaskBase {
    private final  SquireTitheFarm ab;
    
    private  boolean ac;

    private static boolean lIllIllIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    static {
        t.lIllIllIIIIIlll();
        t.lIllIllIIIIIllI();
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (t.lIllIllIIIIlIIl(chatMessage.getMessage().contains(lIIllllllIIII[lIIllllllIIIl[0]]) ? 1 : 0)) {
            this.ac = lIIllllllIIIl[0];
            this.ab.b(lIIllllllIIIl[6]);
        }
    }

    private static boolean lIllIllIIIIlIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        SpellBook.Lunar var2;
        t var3;
        if (t.lIllIllIIIIlIII(this.Z.u(), this.Z.RefillingWateringCansTask())) {
            this.ac = lIIllllllIIIl[1];
            return lIIllllllIIIl[1];
        }
        int[] nArray = new int[lIIllllllIIIl[0]];
        nArray[t.lIIllllllIIIl[1]] = lIIllllllIIIl[2];
        if (t.lIllIllIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) && t.lIllIllIIIIlIIl(var3.ac ? 1 : 0)) {
            return lIIllllllIIIl[1];
        }
        int[] nArray2 = new int[lIIllllllIIIl[0]];
        nArray2[t.lIIllllllIIIl[1]] = lIIllllllIIIl[3];
        if (t.lIllIllIIIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIllllllIIIl[0]];
            nArray3[t.lIIllllllIIIl[1]] = lIIllllllIIIl[2];
            if (t.lIllIllIIIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIllllllIIIl[1];
            }
        }
        if (t.lIllIllIIIIlIIl(Magic.canCast((Spell)(var2 = SpellBook.Lunar.HUMIDIFY)) ? 1 : 0)) {
            Magic.cast((Spell)var2, (int)lIIllllllIIIl[0], (boolean)lIIllllllIIIl[0]);
            var3.ac = lIIllllllIIIl[0];
            return lIIllllllIIIl[0];
        }
        String[] stringArray = new String[lIIllllllIIIl[0]];
        stringArray[t.lIIllllllIIIl[1]] = lIIllllllIIII[lIIllllllIIIl[1]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray);
        if (t.lIllIllIIIIlIll(var4)) {
            return lIIllllllIIIl[1];
        }
        int[] nArray4 = new int[lIIllllllIIIl[4]];
        nArray4[t.lIIllllllIIIl[1]] = lIIllllllIIIl[3];
        nArray4[t.lIIllllllIIIl[0]] = lIIllllllIIIl[2];
        Inventory.getFirst((int[])nArray4).useOn((TileObject)var2_2);
        return lIIllllllIIIl[0];
    }

    @Inject
    protected RefillingWateringCansTask(SquireTitheFarm squireTitheFarm, i i2) {
        super(i2);
        this.ac = lIIllllllIIIl[0];
        this.ab = squireTitheFarm;
    }

    private static boolean lIllIllIIIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIllIllIIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIllIIIIIllI() {
        lIIllllllIIII = new String[lIIllllllIIIl[4]];
        t.lIIllllllIIII[t.lIIllllllIIIl[1]] = "Water Barrel";
        t.lIIllllllIIII[t.lIIllllllIIIl[0]] = "Gricoller's can is already full";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var5;
        if (t.lIllIllIIIIllII(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (t.lIllIllIIIIllIl(var5.getActor().getAnimation(), lIIllllllIIIl[5])) {
            t var6;
            var6.ac = lIIllllllIIIl[0];
            var6.ab.b(lIIllllllIIIl[6]);
        }
    }

    private static boolean lIllIllIIIIllII(Object object, Object object2) {
        return object != object2;
    }
}

