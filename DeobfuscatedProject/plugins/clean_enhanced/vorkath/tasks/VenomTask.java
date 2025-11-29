/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import java.time.Duration;
import java.time.Instant;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Venom", priority=110, register=true)
public class VenomTask
extends VorkathManager {

    private static final  Duration co;
    private  Instant cp;

    @Inject
    protected VenomTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if ((varbitChanged.getVarpId() == 3)) {
            this.cp = Instant.now();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        J var3;
        int var4;
        int n2;
        if (!(Combat.isVenomed( == 0) ? 1 : 0) || (Combat.isPoisoned( != 0) ? 1 : 0)) {
            n2 = 0;
            0;
            if null != null {
                return ((0xDA ^ 0x92 ^ (0xBB ^ 0xBE)) & (157 + 22 - -8 + 8 ^ 73 + 126 - 197 + 140 ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        if (!(var4 = n2 != 0) || (var3.cp == null)) {
            return 1;
        }
        if ((J.var5(Duration.between(var3.cp, Instant.now( < 0)).toSeconds(), co.toSeconds()))) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 2;
        if ((Projectiles.getNearest((int[] != nunArray))) {
            return 1;
        }
        Item var6 = Inventory.getFirst(item -> {
            boolean bl;
            if (!(item.getName( == 0).toLowerCase().contains(var2[0]) ? 1 : 0) || !(item.getName( == 0).contains(var2[4]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var2[5]) ? 1 : 0)) {
                Item var7;
                String[] stringArray = new String[0];
                stringArray[1] = var2[6];
                if ((var7.hasActionstringArray)) {
                    bl = 0;
                    0;
                    if (-1 < 3) return bl;
                    return ((1 ^ 9) & ~(0x5E ^ 0x56)) != 0;
                }
            }
            bl = 1;
            return bl;
        });
        if var6 == null {
            return 1;
        }
        var2_2.interact(var2[1]);
        this.cg.a(this.cf.getTickCount());
        return 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = 1;
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = 1;
        while (var28 < var27) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (((0x4D ^ 0x3A ^ (0x33 ^ 0x52)) & (0x58 ^ 0x3A ^ (0x4E ^ 0x3A) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    static {
        J.var30();
        J.var31();
        co = Duration.ofSeconds(5L);
    }

    private static int var5(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

