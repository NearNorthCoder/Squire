/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.DHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.FHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.KHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.NHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.plugins.logout.Clues;

public class CHelper {
    
    public static  WorldArea F;
    public static  boolean E;

    private static boolean lIIIIlIl(int n2) {
        return n2 != 0;
    }

    public static void p() {
        WorldArea llllIllIllIIIIl;
        WorldArea llllIllIllIIIlI;
        WorldArea llllIllIllIIIll;
        if (c.lIIIIlIl(E ? 1 : 0)) {
            d.r();
        }
        if (c.lIIIIllI(E ? 1 : 0)) {
            if (c.lIIIIlIl(Inventory.contains(item -> {
                int n2;
                if (c.lIIIIlIl(item.getName().contains(llIII[llIll[29]]) ? 1 : 0) && c.lIIIIllI(item.getName().contains(llIII[llIll[30]]) ? 1 : 0)) {
                    n2 = llIll[1];

                    if ((176 + 32 - 83 + 60 ^ 142 + 145 - 130 + 32) == 0) {
                        return ((0x6B ^ 0x37 ^ (0xF4 ^ 0x9A)) & (0x28 ^ 0x4B ^ (0x4A ^ 0x1B) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIll[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                System.out.println(llIII[llIll[0]]);
                E = llIll[1];
                Time.sleepTicks((int)k.CHelper(llIll[2], llIll[3]));

                return;
            }
            f.E();
        }
        if (c.lIIIIlIl(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] nArray = new int[llIll[1]];
            nArray[c.llIll[0]] = llIll[4];
            if (c.lIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (c.lIIIIlIl(tileObject.getName().contains(llIII[llIll[27]]) ? 1 : 0)) {
                        String[] stringArray = new String[llIll[1]];
                        stringArray[c.llIll[0]] = llIII[llIll[28]];
                        if (c.lIIIIlIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIll[1];

                            if (-2 <= 0) return n2 != 0;
                            return ((0xA ^ 0x1E ^ (0x21 ^ 0x78)) & (206 + 90 - 129 + 85 ^ 87 + 171 - 180 + 99 ^ -1)) != 0;
                        }
                    }
                    n2 = llIll[0];
                    return n2 != 0;
                }).interact(llIII[llIll[1]]);
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (c.lIIIIllI(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        bl = llIll[1];

                        if (((0x6C ^ 0x65) & ~(0x7D ^ 0x74)) != 0) {
                            return false;
                        }
                    } else {
                        bl = llIll[0];
                    }
                    return bl;
                }, (int)k.CHelper(llIll[5], llIll[6]));

            }
        }
        if (c.lIIIIlIl((llllIllIllIIIll = new WorldArea(llIll[7], llIll[8], llIll[9], llIll[10], llIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && c.lIIIIlIl(Dialog.isOpen() ? 1 : 0) && c.lIIIIllI(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIll[1]];
            stringArray[c.llIll[0]] = llIII[llIll[2]];
            if (c.lIIIIlll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), llIll[2])) {
                while (c.lIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Clues.c = llIII[llIll[3]];
                    String[] stringArray2 = new String[llIll[2]];
                    stringArray2[c.llIll[0]] = llIII[llIll[11]];
                    stringArray2[c.llIll[1]] = llIII[llIll[12]];
                    n.CHelper(stringArray2);

                    if (2 > 0) continue;
                    return;
                }
            }
        }
        if (c.lIIIIlIl((llllIllIllIIIlI = new WorldArea(llIll[13], llIll[14], llIll[15], llIll[15], llIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && c.lIIIlIIl(Quests.getState((Quest)Quest.THE_GRAND_TREE), QuestState.FINISHED)) {
            int[] nArray = new int[llIll[1]];
            nArray[c.llIll[0]] = llIll[16];
            if (c.lIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIll[1]];
                nArray2[c.llIll[0]] = llIll[16];
                Inventory.getFirst((int[])nArray2).interact(llIII[llIll[17]]);
                Time.sleepTicks((int)k.CHelper(llIll[12], llIll[17]));

            }
        }
        if (c.lIIIIlIl((llllIllIllIIIIl = new WorldArea(llIll[18], llIll[14], llIll[19], llIll[20], llIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Clues.c = llIII[llIll[21]];
            if (c.lIIIIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                String[] stringArray = new String[llIll[1]];
                stringArray[c.llIll[0]] = llIII[llIll[22]];
                TileObjects.getNearest((String[])stringArray).interact(llIII[llIll[23]]);
                Time.sleepTicks((int)k.CHelper(llIll[12], llIll[17]));

            }
        }
        String[] stringArray = new String[llIll[1]];
        stringArray[c.llIll[0]] = llIII[llIll[19]];
        if (c.lIIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (c.lIIIlIlI(Clues.j, llIll[1])) {
                Clues.i += llIll[1];
                Clues.j += llIll[1];
            }
            if (c.lIIIIlIl(Clues.f ? 1 : 0)) {
                String[] stringArray3 = new String[llIll[1]];
                stringArray3[c.llIll[0]] = llIII[llIll[24]];
                Inventory.getFirst((String[])stringArray3).interact(llIII[llIll[25]]);
                Time.sleepTicks((int)llIll[1]);

                Clues.g = llIll[1];
            }
            E = llIll[0];
        }
        String[] stringArray4 = new String[llIll[1]];
        stringArray4[c.llIll[0]] = llIII[llIll[15]];
        if (c.lIIIIlIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
            String[] stringArray5 = new String[llIll[1]];
            stringArray5[c.llIll[0]] = llIII[llIll[26]];
            Inventory.getFirst((String[])stringArray5).interact(llIII[llIll[20]]);
            Time.sleepTicks((int)llIll[3]);

        }
    }

    private static boolean lIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIllI(int n2) {
        return n2 == 0;
    }

    static {
        c.lIIIIlII();
        c.lllllll();
        F = new WorldArea(llIll[31], llIll[32], llIll[12], llIll[11], llIll[0]);
    }

        return String.valueOf(llllIllIlIIIIll);
    }

    private static void lllllll() {
        llIII = new String[llIll[33]];
        c.llIII[c.llIll[0]] = "Got a clue";
        c.llIII[c.llIll[1]] = "Pick-lock";
        c.llIII[c.llIll[2]] = "Barrier";
        c.llIII[c.llIll[3]] = "Handling barrier dialogue";
        c.llIII[c.llIll[11]] = "Yes, and don't ask again.";
        c.llIII[c.llIll[12]] = "yes, and don't ask again.";
        c.llIII[c.llIll[17]] = "Break";
        c.llIII[c.llIll[21]] = "Jumping into pool";
        c.llIII[c.llIll[22]] = "Whirlpool";
        c.llIII[c.llIll[23]] = "Dive in";
        c.llIII[c.llIll[19]] = "Reward casket (easy)";
        c.llIII[c.llIll[24]] = "Reward casket (easy)";
        c.llIII[c.llIll[25]] = "Open";
        c.llIII[c.llIll[15]] = "Coin pouch";
        c.llIII[c.llIll[26]] = "Coin pouch";
        c.llIII[c.llIll[20]] = "Open-all";
        c.llIII[c.llIll[27]] = "Door";
        c.llIII[c.llIll[28]] = "Pick-lock";
        c.llIII[c.llIll[29]] = "Clue";
        c.llIII[c.llIll[30]] = "master";
    }

    private static boolean lIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }
}

