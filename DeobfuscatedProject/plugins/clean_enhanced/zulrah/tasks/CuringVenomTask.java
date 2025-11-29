/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Lunar
 *  net.unethicalite.client.Static
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.time.Duration;
import java.time.Instant;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;

@TaskDesc(name="Curing venom", priority=100, register=true)
public class CuringVenomTask
extends Task {
    
    private final  Duration T;
    private final  SquireZulrahConfig S;
    
    private  Instant U;

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if ((varbitChanged.getVarpId() == 3)) {
            this.U = Instant.now();
        }
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static int var9(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((0xF9 ^ 0x93 ^ (0xCA ^ 0xA4)) > 3) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    public boolean run() {
        y var20;
        if ((Combat.isVenomed( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((y.var9(Duration.between(var20.U, Instant.now( > 0)).toSeconds(), var20.T.toSeconds()))) {
            switch (z.V[var20.S.cure().ordinal()]) {
                case 1: {
                    Item var21 = Inventory.getFirst(item -> item.getName().startsWith(var2[6]));
                    if var21 == null {
                        return 0;
                    }
                    var21.interact(var2[0]);
                    return 1;
                }
                case 2: {
                    Item var22 = Inventory.getFirst(item -> item.getName().startsWith(var2[5]));
                    if var22 == null {
                        return 0;
                    }
                    var22.interact(var2[1]);
                    return 1;
                }
                case 3: {
                    SpellBook.Lunar var23 = SpellBook.Lunar.CURE_ME;
                    var23.cast();
                    return 1;
                }
                case 4: {
                    Item var24 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[4]));
                    if var24 == null {
                        return 0;
                    }
                    var24.interact(var2[2]);
                    return 1;
                }
            }
            return 0;
        }
        return 0;
    }

    private boolean ab() {
        boolean bl;
        if ((y.var25(Duration.between(this.U, Instant.now( <= 0)).toSeconds(), this.T.toSeconds()))) {
            return 0;
        }
        if ((Combat.isVenomed( == 0) ? 1 : 0) && (Static.getClient( != 0).isInInstancedRegion() ? 1 : 0)) {
            return 0;
        }
        if (!(Combat.isVenomed( == 0) ? 1 : 0) || (Combat.isPoisoned( != 0) ? 1 : 0)) {
            bl = 1;
            0;
            if (1 >= 2) {
                return ((0x14 ^ 0x1B ^ (0x5D ^ 5) & ~(0x17 ^ 0x4F)) & (90 + 35 - 3 + 25 ^ 2 + 24 - -109 + 21 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    @Inject
    public CuringVenomTask(SquireZulrahConfig squireZulrahConfig) {
        this.T = Duration.ofSeconds(14L);
        this.S = squireZulrahConfig;
    }

    private static int var25(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

