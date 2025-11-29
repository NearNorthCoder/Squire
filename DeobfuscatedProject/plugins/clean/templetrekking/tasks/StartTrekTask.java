/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Start trek task")
public class StartTrekTask
extends Task {
     Pattern X;
     WorldArea Y;
    private final  TempleTrekkingConfig W;

    private final  TempleTrekkingPlugin V;

    @Inject
    public StartTrekTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.X = Pattern.compile(lIIllIlIIIIIl[lIIllIlIIIIll[0]]);
        this.Y = new WorldArea(new WorldPoint(lIIllIlIIIIll[1], lIIllIlIIIIll[2], lIIllIlIIIIll[0]), new WorldPoint(lIIllIlIIIIll[3], lIIllIlIIIIll[4], lIIllIlIIIIll[0]));
        this.W = templeTrekkingConfig;
        this.V = templeTrekkingPlugin;
    }

    private static void lIllIIIIIlIlIII() {
        lIIllIlIIIIIl = new String[lIIllIlIIIIll[21]];
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[0]] = "^Stamina potion.*$";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[5]] = "Knife";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[6]] = "Plank";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[7]] = "Logs";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[10]] = "Escort";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[11]] = "Rotten food";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[8]] = "Escort";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[12]] = "easy";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[13]] = "Escort";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[14]] = "Mage";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[9]] = "Adventurer";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[15]] = "easy";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[16]] = "Escort";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[17]] = "Dalcian";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[18]] = "Fyion";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[19]] = "Stamina";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[20]] = "Drink";
    }

    private static boolean lIllIIIIIllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        r.lIllIIIIIlIllIl();
        r.lIllIIIIIlIlIII();
    }

    private static boolean lIllIIIIIllIlII(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        Player var1;
        r var2;
        block18: {
            block20: {
                block19: {
                    if (r.lIllIIIIIlIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        Dialog.enterAmount((int)lIIllIlIIIIll[0]);
                        return lIIllIlIIIIll[5];
                    }
                    if (r.lIllIIIIIlIllll(var2.V.e() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    var1 = Players.getLocal();
                    if (r.lIllIIIIIllIIII(var1)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (!r.lIllIIIIIllIIIl(var1.isMoving() ? 1 : 0) || r.lIllIIIIIlIllll(var1.isAnimating() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (r.lIllIIIIIllIIlI(var2.V.c(), lIIllIlIIIIll[6])) {
                        return lIIllIlIIIIll[0];
                    }
                    if (r.lIllIIIIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (!r.lIllIIIIIlIllll(var2.V.f().contains((Locatable)var1) ? 1 : 0)) break block18;
                    if (r.lIllIIIIIlIllll(var2.W.healInBank() ? 1 : 0) && r.lIllIIIIIllIIll(var2.W.hpToBank(), Skills.getBoostedLevel((Skill)Skill.HITPOINTS))) {
                        var2.V.b(lIIllIlIIIIll[5]);
                        return lIIllIlIIIIll[0];
                    }
                    String[] stringArray = new String[lIIllIlIIIIll[5]];
                    stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[5]];
                    if (!r.lIllIIIIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block19;
                    String[] stringArray2 = new String[lIIllIlIIIIll[6]];
                    stringArray2[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[6]];
                    stringArray2[r.lIIllIlIIIIll[5]] = lIIllIlIIIIIl[lIIllIlIIIIll[7]];
                    if (r.lIllIIIIIllIIll(Inventory.getFreeSlots() - Math.min(lIIllIlIIIIll[7], Inventory.getAll((String[])stringArray2).size()), lIIllIlIIIIll[8]) && (!r.lIllIIIIIlIllll(var2.W.stamina()) || !r.lIllIIIIIllIIIl(Inventory.contains(item -> {
                        int n2;
                        if (r.lIllIIIIIlIllll(item.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[19]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIlIIIIll[5]];
                            stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[20]];
                            if (r.lIllIIIIIlIllll(item.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIllIlIIIIll[5];

                                if (3 != 1) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIllIlIIIIll[0];
                        return n2 != 0;
                    }) ? 1 : 0))) break block20;
                }
                var2.V.b(lIIllIlIIIIll[5]);
                return lIIllIlIIIIll[0];
            }
            NPC var3 = NPCs.getNearest(nPC -> {
                int n2;
                if (r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[15]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIlIIIIll[5]];
                    stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[16]];
                    if (r.lIllIIIIIlIllll(nPC.hasAction(stringArray) ? 1 : 0) && (!r.lIllIIIIIllIIIl(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[17]]) ? 1 : 0) || r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[18]]) ? 1 : 0))) {
                        n2 = lIIllIlIIIIll[5];

                        if (2 != -1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIIllIlIIIIll[0];
                return n2 != 0;
            });
            if (r.lIllIIIIIllIlII(var3) && r.lIllIIIIIllIlIl(var1.distanceTo((Locatable)var3), lIIllIlIIIIll[9])) {
                var3.interact(lIIllIlIIIIIl[lIIllIlIIIIll[10]]);
                var2.sleep(lIIllIlIIIIll[11]);
                return lIIllIlIIIIll[5];
            }
            Movement.walkTo((WorldArea)var2.V.f());

            return lIIllIlIIIIll[5];
        }
        if (r.lIllIIIIIlIllll(var2.Y.contains((Locatable)var1) ? 1 : 0)) {
            String[] stringArray = new String[lIIllIlIIIIll[5]];
            stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[11]];
            if (r.lIllIIIIIlIllll(Inventory.dropAll((String[])stringArray) ? 1 : 0)) {
                return lIIllIlIIIIll[5];
            }
            if (r.lIllIIIIIlIllll(var2.V.g().contains((Locatable)var1) ? 1 : 0)) {
                NPC var3 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[12]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIlIIIIll[5]];
                        stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[13]];
                        if (r.lIllIIIIIlIllll(nPC.hasAction(stringArray) ? 1 : 0) && (!r.lIllIIIIIllIIIl(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[14]]) ? 1 : 0) || r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[9]]) ? 1 : 0))) {
                            n2 = lIIllIlIIIIll[5];

                            if (3 >= 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIllIlIIIIll[0];
                    return n2 != 0;
                });
                if (r.lIllIIIIIllIlII(var3)) {
                    var3.interact(lIIllIlIIIIIl[lIIllIlIIIIll[8]]);
                    var2.sleep(lIIllIlIIIIll[11]);
                    return lIIllIlIIIIll[5];
                }

                if (1 == 0) {
                    return ((0xE ^ 0x64 ^ (0x47 ^ 0x1F)) & (166 + 157 - 307 + 228 ^ 194 + 142 - 295 + 157 ^ -1)) != 0;
                }
            } else {
                Movement.walkTo((WorldArea)var2.V.g());

                return lIIllIlIIIIll[5];
            }
        }
        return lIIllIlIIIIll[0];
    }

    private static boolean lIllIIIIIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIlIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var4);
    }
}

