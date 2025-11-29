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
import gg.squire.tithefarm.tasks.TithefarmManager;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Refilling Watering Cans", priority=100, blocking=true, register=true)
public class RefillingWateringCansTask
extends TithefarmTaskBase {
    private final  SquireTitheFarm ab;
    
    private  boolean ac;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[1];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[1];
        while (t.var3(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        t.var14();
        t.var15();
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (t.var16(chatMessage.getMessage().contains(var1[var2[0]]) ? 1 : 0)) {
            this.ac = var2[0];
            this.ab.b(var2[6]);
        }
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static void var14() {
        var2 = new int[7];
        t.var2[0] = 1;
        t.var2[1] = (0xA2 ^ 0xAA) & ~(0x38 ^ 0x30);
        t.var2[2] = -(0xFFFFE9DF & 0x5EF7) & (0xFFFFFCFF & Short.MAX_VALUE);
        t.var2[3] = 0xFFFFDEFF & 0x35D3;
        t.var2[4] = 2;
        t.var2[5] = -(0xFFFFC82F & 0x77FA) & (0xFFFFCF79 & 0x73EF);
        t.var2[6] = -(0xFFFFFB7D & 0x7497) & (0xFFFFFBFE & 0x77FD);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        SpellBook.Lunar var17;
        t var18;
        if (t.var3(this.Z.u(), this.Z.RefillingWateringCansTask())) {
            this.ac = var2[1];
            return var2[1];
        }
        int[] nArray = new int[var2[0]];
        nArray[t.var2[1]] = var2[2];
        if (t.var16(Inventory.contains((int[])nArray) ? 1 : 0) && t.var16(var18.ac)) {
            return var2[1];
        }
        int[] nArray2 = new int[var2[0]];
        nArray2[t.var2[1]] = var2[3];
        if (t.var19(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var2[0]];
            nArray3[t.var2[1]] = var2[2];
            if (t.var19(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return var2[1];
            }
        }
        if (t.var16(Magic.canCast((Spell)(var17 = SpellBook.Lunar.HUMIDIFY)) ? 1 : 0)) {
            Magic.cast((Spevar17, (int)var2[0], (boolean)var2[0]);
            var18.ac = var2[0];
            return var2[0];
        }
        String[] stringArray = new String[var2[0]];
        stringArray[t.var2[1]] = var1[var2[1]];
        TileObject var20 = TileObjects.getNearest((String[])stringArray);
        if (t.var21(var20)) {
            return var2[1];
        }
        int[] nArray4 = new int[var2[4]];
        nArray4[t.var2[1]] = var2[3];
        nArray4[t.var2[0]] = var2[2];
        Inventory.getFirst((int[])nArray4).useOn((TileObject)var2_2);
        return var2[0];
    }

    @Inject
    protected RefillingWateringCansTask(SquireTitheFarm squireTitheFarm, i i2) {
        super(i2);
        this.ac = var2[0];
        this.ab = squireTitheFarm;
    }

    private static boolean var21(Object object) {
        return object == null;
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static boolean var22(int n2, int n3) {
        return n2 == n3;
    }

    private static void var15() {
        var1 = new String[var2[4]];
        t.var1[t.var2[1]] = "Water Barrel";
        t.var1[t.var2[0]] = "Gricoller's can is already full";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var23;
        if (t.var24(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (t.var22(var23.getActor().getAnimation(), var2[5])) {
            t var25;
            var25.ac = var2[0];
            var25.ab.b(var2[6]);
        }
    }

    private static boolean var24(Object object, Object object2) {
        return object != object2;
    }
}

