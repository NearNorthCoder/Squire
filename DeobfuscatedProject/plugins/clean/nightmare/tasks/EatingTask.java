/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Eating", priority=501)
public class EatingTask
extends Task {
    
    private static final  Logger ej;
    private final  SquireNightmarePlugin el;
    private final  h em;
    
    private final  SquireNightmareConfig ek;

    private static boolean lIIIllIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIllIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIIIllIllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIllIlIllI(Object object) {
        return object == null;
    }

    public boolean run() {
        TileItem var1;
        aq var2;
        block16: {
            Item var3;
            block18: {
                block17: {
                    if (aq.lIIIllIllIlIlII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        return lllIlllIIIlI[0];
                    }
                    if (aq.lIIIllIllIlIlIl(var2.el.EatingTask() ? 1 : 0)) {
                        return lllIlllIIIlI[0];
                    }
                    NPC var4 = SquireNightmarePlugin.d();
                    if (aq.lIIIllIllIlIllI(var4)) {
                        return lllIlllIIIlI[0];
                    }
                    String[] stringArray = new String[lllIlllIIIlI[1]];
                    stringArray[aq.lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[0]];
                    if (aq.lIIIllIllIlIlII(var4.hasAction(stringArray) ? 1 : 0)) {
                        int[] nArray = new int[lllIlllIIIlI[1]];
                        nArray[aq.lllIlllIIIlI[0]] = lllIlllIIIlI[2];
                        if (aq.lIIIllIllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && aq.lIIIllIllIlIlll(var2.em.aH()) && aq.lIIIllIllIllIII(aq.lIIIllIllIlIIll(Combat.getHealthPercent(), 100.0))) {
                            int[] nArray2 = new int[lllIlllIIIlI[1]];
                            nArray2[aq.lllIlllIIIlI[0]] = lllIlllIIIlI[2];
                            var3 = Inventory.getFirst((int[])nArray2);
                            if (aq.lIIIllIllIlIlll(var3)) {
                                ej.info(lllIlllIIIIl[lllIlllIIIlI[1]]);
                                var3.interact(lllIlllIIIIl[lllIlllIIIlI[3]]);
                                var2.sleep(lllIlllIIIlI[4]);
                                return lllIlllIIIlI[1];
                            }
                        }
                    }
                    String[] stringArray2 = new String[lllIlllIIIlI[1]];
                    stringArray2[aq.lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[4]];
                    if (aq.lIIIllIllIlIlIl(var4.hasAction(stringArray2) ? 1 : 0)) {
                        return lllIlllIIIlI[0];
                    }
                    var3 = Inventory.getFirst(item -> item.hasAction(lllIlllIIIIl[lllIlllIIIlI[21]]::equals));
                    if (!aq.lIIIllIllIlIlll(var3)) break block16;
                    if (!aq.lIIIllIllIlIlII(var2.cD() ? 1 : 0)) break block17;
                    String[] stringArray3 = new String[lllIlllIIIlI[1]];
                    stringArray3[aq.lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[5]];
                    if (!aq.lIIIllIllIlIlII(var4.hasAction(stringArray3) ? 1 : 0)) break block18;
                }
                if (aq.lIIIllIllIllIII(aq.lIIIllIllIlIIll(Combat.getHealthPercent(), var2.ek.restoreHealthPercentBetweenPhase()))) {
                    Object[] objectArray = new Object[lllIlllIIIlI[1]];
                    objectArray[aq.lllIlllIIIlI[0]] = var2.ek.restoreHealthPercentBetweenPhase();
                    Log.info((String)lllIlllIIIIl[lllIlllIIIlI[6]], (Object[])objectArray);
                    var3.interact(lllIlllIIIIl[lllIlllIIIlI[7]]);
                    var2.sleep(lllIlllIIIlI[4]);
                    return lllIlllIIIlI[1];
                }
            }
            var1 = NPCs.getNearest(nPC -> {
                int n2;
                if (aq.lIIIllIllIlIlIl(nPC.getName().equals(lllIlllIIIIl[lllIlllIIIlI[19]]) ? 1 : 0) && aq.lIIIllIllIlllII(nPC.getAnimation(), lllIlllIIIlI[20])) {
                    n2 = lllIlllIIIlI[1];

                    if (3 <= 0) {
                        return ((0x64 ^ 7 ^ (0x70 ^ 0x45)) & (0xC7 ^ 0xC0 ^ (0x2F ^ 0x7E) ^ -1)) != 0;
                    }
                } else {
                    n2 = lllIlllIIIlI[0];
                }
                return n2 != 0;
            });
            if (aq.lIIIllIllIllIIl(var2.d().getId(), lllIlllIIIlI[8]) && aq.lIIIllIllIlIlll(var1) && aq.lIIIllIllIllIII(aq.lIIIllIllIlIIll(Combat.getHealthPercent(), var2.ek.restoreHealthPercentBetweenPhase()))) {
                ej.info(lllIlllIIIIl[lllIlllIIIlI[9]]);
                var3.interact(lllIlllIIIIl[lllIlllIIIlI[10]]);
                var2.sleep(lllIlllIIIlI[4]);
                return lllIlllIIIlI[1];
            }
            if (aq.lIIIllIllIllIlI(Combat.getCurrentHealth(), var2.ek.eatAt())) {
                ej.info(lllIlllIIIIl[lllIlllIIIlI[11]], (Object)var3.getName(), (Object)var2.ek.eatAt());
                var3.interact(lllIlllIIIIl[lllIlllIIIlI[12]]);
                var2.sleep(lllIlllIIIlI[4]);
                return lllIlllIIIlI[1];
            }
        }
        if (aq.lIIIllIllIlIlll(var1 = var2.em.aH()) && aq.lIIIllIllIllIll(Inventory.getFreeSlots(), lllIlllIIIlI[1])) {
            if (aq.lIIIllIllIlIlIl(var2.cD() ? 1 : 0)) {
                ej.info(lllIlllIIIIl[lllIlllIIIlI[13]], (Object)var1.getName(), (Object)var1.distanceTo((Locatable)Players.getLocal()));
                var1.interact(lllIlllIIIIl[lllIlllIIIlI[14]]);
                var2.sleep(lllIlllIIIlI[3]);
                return lllIlllIIIlI[1];
            }
            if (aq.lIIIllIllIlIlII(var1.distanceTo((Locatable)Players.getLocal()))) {
                ej.info(lllIlllIIIIl[lllIlllIIIlI[15]], (Object)var1.getName());
                var1.interact(lllIlllIIIIl[lllIlllIIIlI[16]]);
                var2.sleep(lllIlllIIIlI[3]);
                return lllIlllIIIlI[1];
            }
        }
        return lllIlllIIIlI[0];
    }

    private static boolean lIIIllIllIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected EatingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        this.ek = squireNightmareConfig;
        this.el = squireNightmarePlugin;
        this.em = h2;
    }

    private NPC d() {
        return SquireNightmarePlugin.d();
    }

    private static boolean lIIIllIllIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIllIllIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private boolean cD() {
        boolean bl;
        aq var5;
        if (aq.lIIIllIllIlIllI(this.d())) {
            return lllIlllIIIlI[0];
        }
        String[] stringArray = new String[lllIlllIIIlI[1]];
        stringArray[aq.lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[17]];
        if (!aq.lIIIllIllIlIlII(var5.d().hasAction(stringArray) ? 1 : 0) || aq.lIIIllIllIlllII(var5.d().getAnimation(), lllIlllIIIlI[18])) {
            bl = lllIlllIIIlI[1];

            if (-(0x48 ^ 5 ^ (0xC5 ^ 0x8C)) >= 0) {
                return false;
            }
        } else {
            bl = lllIlllIIIlI[0];
        }
        return bl;
    }

    private static boolean lIIIllIllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static void lIIIllIllIlIIIl() {
        lllIlllIIIIl = new String[lllIlllIIIlI[22]];
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[0]] = "Attack";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[1]] = "Eating tuna to full health";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[3]] = "Eat";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[4]] = "Disturb";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[5]] = "Attack";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[6]] = "Eating food since we have downtime, and we're below {} hp.";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[7]] = "Eat";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[9]] = "oh no a guy made it through and we gota eat now LOL";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[10]] = "Eat";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[11]] = "eating food: {} in-fight since we're below {} hp";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[12]] = "Eat";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[13]] = "retrieving food: {} mid-fight since we have room! It's {} tiles away, and pnm is transitioning.";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[14]] = "Take";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[15]] = "retrieving food: {} since we're standing on it anyway.";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[16]] = "Take";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[17]] = "Disturb";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[19]] = "Sleepwalker";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[21]] = "Eat";
    }

        return String.valueOf(var6);
    }

    private static boolean lIIIllIllIllIII(int n2) {
        return n2 < 0;
    }

    static {
        aq.lIIIllIllIlIIlI();
        aq.lIIIllIllIlIIIl();
        ej = LoggerFactory.getLogger(EatingTask.class);
    }

    private static int lIIIllIllIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

