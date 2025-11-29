/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Quest
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.pathfinder.Walker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Collecting Items")
public class CollectingItemsTask
extends Task {

    private static final  Logger ag;
    private final  Client ah;
    private final  SquireQuesterConfig ai;

    private int a(int n2) {
        Object[] objectArray = new Object[lIIIllIlIllIl[8]];
        objectArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[21];
        objectArray[l.lIIIllIlIllIl[1]] = n2;
        this.ah.runScript(objectArray);
        return this.ah.getIntStack()[lIIIllIlIllIl[0]];
    }

    private static boolean lIlIIIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIllIIlII(Object object) {
        return object != null;
    }

    @Inject
    public CollectingItemsTask(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.ah = client;
        this.ai = squireQuesterConfig;
    }

    private static boolean lIlIIIlIllIIIlI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIIIlIllIIlll(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        TileItem var2;
        l var3;
        if (l.lIlIIIlIllIIIII((Object)this.ai.quest(), (Object)h.BELOW_ICE_MOUNTAIN)) {
            return lIIIllIlIllIl[0];
        }
        if (l.lIlIIIlIllIIIIl(var3.a(Quest.BELOW_ICE_MOUNTAIN.getId()))) {
            return lIIIllIlIllIl[0];
        }
        int[] nArray = new int[lIIIllIlIllIl[1]];
        nArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[2];
        if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlIllIl[1]];
            nArray2[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[2];
            var2 = TileItems.getFirstAt((WorldPoint)new WorldPoint(lIIIllIlIllIl[3], lIIIllIlIllIl[4], lIIIllIlIllIl[0]), (int[])nArray2);
            if (l.lIlIIIlIllIIIll(var2)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllIl[5], lIIIllIlIllIl[4], lIIIllIlIllIl[0]));

                if (-1 >= ((0xBF ^ 0x9A) & ~(0xAC ^ 0x89))) {
                    return false;
                }
            } else {
                var2.interact(lIIIllIlIllII[lIIIllIlIllIl[0]]);
            }
        }
        int[] nArray3 = new int[lIIIllIlIllIl[1]];
        nArray3[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[6];
        if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIlIllIl[1]];
            nArray4[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
            if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIllIl[1]];
                stringArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[1]];
                var2 = NPCs.getNearest((String[])stringArray);
                int[] nArray5 = new int[lIIIllIlIllIl[1]];
                nArray5[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
                TileItem var4 = TileItems.getNearest((int[])nArray5);
                if (l.lIlIIIlIllIIIll(var4)) {
                    if (l.lIlIIIlIllIIlII(var2)) {
                        var2.interact(lIIIllIlIllII[lIIIllIlIllIl[8]]);

                        if (((22 + 55 - 60 + 135 ^ 84 + 91 - 30 + 46) & (0xB1 ^ 0xBB ^ (5 ^ 0x28) ^ -1)) != 0) {
                            return ((0x78 ^ 0x24 ^ (0xDA ^ 0xAF)) & (16 + 56 - -17 + 55 ^ 135 + 77 - 163 + 136 ^ -1)) != 0;
                        }
                    }
                } else {
                    var4.interact(lIIIllIlIllII[lIIIllIlIllIl[9]]);
                }

                if (((0x71 ^ 0x43) & ~(0x6C ^ 0x5E)) != 0) {
                    return false;
                }
            } else {
                String[] stringArray = new String[lIIIllIlIllIl[1]];
                stringArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[10]];
                TileObject var4 = TileObjects.getNearest((String[])stringArray);
                if (l.lIlIIIlIllIIIll(var4)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllIl[11], lIIIllIlIllIl[12], lIIIllIlIllIl[0]));

                    }
                } else {
                    int[] nArray6 = new int[lIIIllIlIllIl[1]];
                    nArray6[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
                    Inventory.getFirst((int[])nArray6).useOn(var4);
                }
            }
        }
        int[] nArray7 = new int[lIIIllIlIllIl[1]];
        nArray7[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
        if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
            var3.x();
        }
        int[] nArray8 = new int[lIIIllIlIllIl[1]];
        nArray8[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
        if (l.lIlIIIlIllIIlIl(Inventory.getCount((boolean)lIIIllIlIllIl[1], (int[])nArray8), lIIIllIlIllIl[14])) {
            int[] nArray9 = new int[lIIIllIlIllIl[1]];
            nArray9[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[15];
            if (l.lIlIIIlIllIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lIIIllIlIllIl[1]];
                nArray10[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[15];
                Inventory.getFirst((int[])nArray10).interact(lIIIllIlIllII[lIIIllIlIllIl[16]]);
            }
            var3.x();
        }
        int[] nArray11 = new int[lIIIllIlIllIl[1]];
        nArray11[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[17];
        if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIIllIlIllIl[1]];
            nArray12[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
            if (l.lIlIIIlIllIIllI(Inventory.getCount((boolean)lIIIllIlIllIl[1], (int[])nArray12), lIIIllIlIllIl[14])) {
                String[] stringArray = new String[lIIIllIlIllIl[1]];
                stringArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[18]];
                var2 = NPCs.getNearest((String[])stringArray);
                if (l.lIlIIIlIllIIIIl(Shop.isOpen() ? 1 : 0)) {
                    Shop.buyOne((int)lIIIllIlIllIl[17]);

                    if (((0x27 ^ 0x3E ^ (0x89 ^ 0xA5)) & (0x66 ^ 0x29 ^ (0xCB ^ 0xB1) ^ -1)) != 0) {
                        return ((66 + 0 - -76 + 87 ^ 144 + 95 - 64 + 18) & (0x1B ^ 6 ^ (0x6A ^ 0x53) ^ -1)) != 0;
                    }
                } else if (l.lIlIIIlIllIIIll(var2)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllIl[19], lIIIllIlIllIl[3], lIIIllIlIllIl[0]));

                    if (((187 + 101 - 158 + 82 ^ 71 + 104 - 174 + 139) & (90 + 164 - 153 + 145 ^ 78 + 75 - 151 + 172 ^ -1)) >= (0x53 ^ 0x2E ^ (0x35 ^ 0x4C))) {
                        return ((0xD3 ^ 0x80 ^ (0xE2 ^ 0xAE)) & (49 + 56 - 45 + 128 ^ 11 + 24 - -104 + 24 ^ -1)) != 0;
                    }
                } else {
                    var2.interact(lIIIllIlIllII[lIIIllIlIllIl[20]]);
                }
            }
        }
        return lIIIllIlIllIl[0];
    }

    private static boolean lIlIIIlIllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlIllIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIlIIIlIlIllllI() {
        lIIIllIlIllII = new String[lIIIllIlIllIl[28]];
        l.lIIIllIlIllII[l.lIIIllIlIllIl[0]] = "Take";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[1]] = "Giant rat";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[8]] = "Attack";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[9]] = "Take";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[10]] = "Cooking range";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[16]] = "Open-all";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[18]] = "Wydin";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[20]] = "Trade";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[22]] = "Man";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[23]] = "Woman";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[24]] = "Pickpocket";
        l.lIIIllIlIllII[l.lIIIllIlIllIl[25]] = "No health, waiting to heal";
    }

    static {
        l.lIlIIIlIlIlllll();
        l.lIlIIIlIlIllllI();
        ag = LoggerFactory.getLogger(CollectingItemsTask.class);
    }

    private static boolean lIlIIIlIllIIIll(Object object) {
        return object == null;
    }

    private void x() {
        String[] stringArray = new String[lIIIllIlIllIl[8]];
        stringArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[22]];
        stringArray[l.lIIIllIlIllIl[1]] = lIIIllIlIllII[lIIIllIlIllIl[23]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (l.lIlIIIlIllIIlII(nPC)) {
            if (l.lIlIIIlIllIIlll(Combat.getCurrentHealth(), lIIIllIlIllIl[8])) {
                nPC.interact(lIIIllIlIllII[lIIIllIlIllIl[24]]);

                if (((0xA1 ^ 0xB4) & ~(0x79 ^ 0x6C)) != 0) {
                    return;
                }
            } else {
                System.out.println(lIIIllIlIllII[lIIIllIlIllIl[25]]);

                if (((3 ^ 0x52 ^ (0x7E ^ 0x17)) & (0x30 ^ 0x1D ^ (6 ^ 0x13) ^ -1)) != 0) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllIl[26], lIIIllIlIllIl[27], lIIIllIlIllIl[0]));

        }
    }

    private static boolean lIlIIIlIllIIIIl(int n2) {
        return n2 != 0;
    }
}

