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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Eating", priority=501)
public class aq
extends Task {
    private static /* synthetic */ String[] lllIlllIIIIl;
    private static final /* synthetic */ Logger ej;
    private final /* synthetic */ SquireNightmarePlugin el;
    private final /* synthetic */ h em;
    private static /* synthetic */ int[] lllIlllIIIlI;
    private final /* synthetic */ SquireNightmareConfig ek;

    private static boolean lIIIllIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIllIlIlll(Object object) {
        return object != null;
    }

    private static String lIIIllIllIIlllI(String lllllllllllllllIIllIIlIlIIllllIl, String lllllllllllllllIIllIIlIlIIllllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIlIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIlIIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIlIIllllll.init(lllIlllIIIlI[3], lllllllllllllllIIllIIlIlIlIIIIII);
            return new String(lllllllllllllllIIllIIlIlIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIlIIlllllI) {
            lllllllllllllllIIllIIlIlIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIllIlIllI(Object object) {
        return object == null;
    }

    public boolean run() {
        TileItem lllllllllllllllIIllIIlIlIlIIlIIl;
        aq lllllllllllllllIIllIIlIlIlIIllII;
        block16: {
            Item lllllllllllllllIIllIIlIlIlIIlIlI;
            block18: {
                block17: {
                    if (aq.lIIIllIllIlIlII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        return lllIlllIIIlI[0];
                    }
                    if (aq.lIIIllIllIlIlIl(lllllllllllllllIIllIIlIlIlIIllII.el.aq() ? 1 : 0)) {
                        return lllIlllIIIlI[0];
                    }
                    NPC lllllllllllllllIIllIIlIlIlIIlIll = SquireNightmarePlugin.d();
                    if (aq.lIIIllIllIlIllI(lllllllllllllllIIllIIlIlIlIIlIll)) {
                        return lllIlllIIIlI[0];
                    }
                    String[] stringArray = new String[lllIlllIIIlI[1]];
                    stringArray[aq.lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[0]];
                    if (aq.lIIIllIllIlIlII(lllllllllllllllIIllIIlIlIlIIlIll.hasAction(stringArray) ? 1 : 0)) {
                        int[] nArray = new int[lllIlllIIIlI[1]];
                        nArray[aq.lllIlllIIIlI[0]] = lllIlllIIIlI[2];
                        if (aq.lIIIllIllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && aq.lIIIllIllIlIlll(lllllllllllllllIIllIIlIlIlIIllII.em.aH()) && aq.lIIIllIllIllIII(aq.lIIIllIllIlIIll(Combat.getHealthPercent(), 100.0))) {
                            int[] nArray2 = new int[lllIlllIIIlI[1]];
                            nArray2[aq.lllIlllIIIlI[0]] = lllIlllIIIlI[2];
                            lllllllllllllllIIllIIlIlIlIIlIlI = Inventory.getFirst((int[])nArray2);
                            if (aq.lIIIllIllIlIlll(lllllllllllllllIIllIIlIlIlIIlIlI)) {
                                ej.info(lllIlllIIIIl[lllIlllIIIlI[1]]);
                                lllllllllllllllIIllIIlIlIlIIlIlI.interact(lllIlllIIIIl[lllIlllIIIlI[3]]);
                                lllllllllllllllIIllIIlIlIlIIllII.sleep(lllIlllIIIlI[4]);
                                return lllIlllIIIlI[1];
                            }
                        }
                    }
                    String[] stringArray2 = new String[lllIlllIIIlI[1]];
                    stringArray2[aq.lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[4]];
                    if (aq.lIIIllIllIlIlIl(lllllllllllllllIIllIIlIlIlIIlIll.hasAction(stringArray2) ? 1 : 0)) {
                        return lllIlllIIIlI[0];
                    }
                    lllllllllllllllIIllIIlIlIlIIlIlI = Inventory.getFirst(item -> item.hasAction(lllIlllIIIIl[lllIlllIIIlI[21]]::equals));
                    if (!aq.lIIIllIllIlIlll(lllllllllllllllIIllIIlIlIlIIlIlI)) break block16;
                    if (!aq.lIIIllIllIlIlII(lllllllllllllllIIllIIlIlIlIIllII.cD() ? 1 : 0)) break block17;
                    String[] stringArray3 = new String[lllIlllIIIlI[1]];
                    stringArray3[aq.lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[5]];
                    if (!aq.lIIIllIllIlIlII(lllllllllllllllIIllIIlIlIlIIlIll.hasAction(stringArray3) ? 1 : 0)) break block18;
                }
                if (aq.lIIIllIllIllIII(aq.lIIIllIllIlIIll(Combat.getHealthPercent(), lllllllllllllllIIllIIlIlIlIIllII.ek.restoreHealthPercentBetweenPhase()))) {
                    Object[] objectArray = new Object[lllIlllIIIlI[1]];
                    objectArray[aq.lllIlllIIIlI[0]] = lllllllllllllllIIllIIlIlIlIIllII.ek.restoreHealthPercentBetweenPhase();
                    Log.info((String)lllIlllIIIIl[lllIlllIIIlI[6]], (Object[])objectArray);
                    lllllllllllllllIIllIIlIlIlIIlIlI.interact(lllIlllIIIIl[lllIlllIIIlI[7]]);
                    lllllllllllllllIIllIIlIlIlIIllII.sleep(lllIlllIIIlI[4]);
                    return lllIlllIIIlI[1];
                }
            }
            lllllllllllllllIIllIIlIlIlIIlIIl = NPCs.getNearest(nPC -> {
                int n2;
                if (aq.lIIIllIllIlIlIl(nPC.getName().equals(lllIlllIIIIl[lllIlllIIIlI[19]]) ? 1 : 0) && aq.lIIIllIllIlllII(nPC.getAnimation(), lllIlllIIIlI[20])) {
                    n2 = lllIlllIIIlI[1];
                    0;
                    if (3 <= 0) {
                        return ((0x64 ^ 7 ^ (0x70 ^ 0x45)) & (0xC7 ^ 0xC0 ^ (0x2F ^ 0x7E) ^ -1)) != 0;
                    }
                } else {
                    n2 = lllIlllIIIlI[0];
                }
                return n2 != 0;
            });
            if (aq.lIIIllIllIllIIl(lllllllllllllllIIllIIlIlIlIIllII.d().getId(), lllIlllIIIlI[8]) && aq.lIIIllIllIlIlll(lllllllllllllllIIllIIlIlIlIIlIIl) && aq.lIIIllIllIllIII(aq.lIIIllIllIlIIll(Combat.getHealthPercent(), lllllllllllllllIIllIIlIlIlIIllII.ek.restoreHealthPercentBetweenPhase()))) {
                ej.info(lllIlllIIIIl[lllIlllIIIlI[9]]);
                lllllllllllllllIIllIIlIlIlIIlIlI.interact(lllIlllIIIIl[lllIlllIIIlI[10]]);
                lllllllllllllllIIllIIlIlIlIIllII.sleep(lllIlllIIIlI[4]);
                return lllIlllIIIlI[1];
            }
            if (aq.lIIIllIllIllIlI(Combat.getCurrentHealth(), lllllllllllllllIIllIIlIlIlIIllII.ek.eatAt())) {
                ej.info(lllIlllIIIIl[lllIlllIIIlI[11]], (Object)lllllllllllllllIIllIIlIlIlIIlIlI.getName(), (Object)lllllllllllllllIIllIIlIlIlIIllII.ek.eatAt());
                lllllllllllllllIIllIIlIlIlIIlIlI.interact(lllIlllIIIIl[lllIlllIIIlI[12]]);
                lllllllllllllllIIllIIlIlIlIIllII.sleep(lllIlllIIIlI[4]);
                return lllIlllIIIlI[1];
            }
        }
        if (aq.lIIIllIllIlIlll(lllllllllllllllIIllIIlIlIlIIlIIl = lllllllllllllllIIllIIlIlIlIIllII.em.aH()) && aq.lIIIllIllIllIll(Inventory.getFreeSlots(), lllIlllIIIlI[1])) {
            if (aq.lIIIllIllIlIlIl(lllllllllllllllIIllIIlIlIlIIllII.cD() ? 1 : 0)) {
                ej.info(lllIlllIIIIl[lllIlllIIIlI[13]], (Object)lllllllllllllllIIllIIlIlIlIIlIIl.getName(), (Object)lllllllllllllllIIllIIlIlIlIIlIIl.distanceTo((Locatable)Players.getLocal()));
                lllllllllllllllIIllIIlIlIlIIlIIl.interact(lllIlllIIIIl[lllIlllIIIlI[14]]);
                lllllllllllllllIIllIIlIlIlIIllII.sleep(lllIlllIIIlI[3]);
                return lllIlllIIIlI[1];
            }
            if (aq.lIIIllIllIlIlII(lllllllllllllllIIllIIlIlIlIIlIIl.distanceTo((Locatable)Players.getLocal()))) {
                ej.info(lllIlllIIIIl[lllIlllIIIlI[15]], (Object)lllllllllllllllIIllIIlIlIlIIlIIl.getName());
                lllllllllllllllIIllIIlIlIlIIlIIl.interact(lllIlllIIIIl[lllIlllIIIlI[16]]);
                lllllllllllllllIIllIIlIlIlIIllII.sleep(lllIlllIIIlI[3]);
                return lllIlllIIIlI[1];
            }
        }
        return lllIlllIIIlI[0];
    }

    private static boolean lIIIllIllIlIlII(int n2) {
        return n2 == 0;
    }

    private static String lIIIllIllIlIIII(String lllllllllllllllIIllIIlIlIIIllIII, String lllllllllllllllIIllIIlIlIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIlIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), lllIlllIIIlI[10]), "DES");
            Cipher lllllllllllllllIIllIIlIlIIIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIlIIIllIlI.init(lllIlllIIIlI[3], lllllllllllllllIIllIIlIlIIIllIll);
            return new String(lllllllllllllllIIllIIlIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIlIIIllIIl) {
            lllllllllllllllIIllIIlIlIIIllIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aq(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
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
        aq lllllllllllllllIIllIIlIlIlIIIlll;
        if (aq.lIIIllIllIlIllI(this.d())) {
            return lllIlllIIIlI[0];
        }
        String[] stringArray = new String[lllIlllIIIlI[1]];
        stringArray[aq.lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[17]];
        if (!aq.lIIIllIllIlIlII(lllllllllllllllIIllIIlIlIlIIIlll.d().hasAction(stringArray) ? 1 : 0) || aq.lIIIllIllIlllII(lllllllllllllllIIllIIlIlIlIIIlll.d().getAnimation(), lllIlllIIIlI[18])) {
            bl = lllIlllIIIlI[1];
            0;
            if (-(0x48 ^ 5 ^ (0xC5 ^ 0x8C)) >= 0) {
                return ((149 + 119 - 134 + 84 ^ 136 + 132 - 207 + 95) & (84 + 172 - 178 + 117 ^ 77 + 99 - 152 + 109 ^ -1)) != 0;
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
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[0]] = aq."Attack";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[1]] = aq."Eating tuna to full health";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[3]] = aq."Eat";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[4]] = aq."Disturb";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[5]] = aq."Attack";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[6]] = aq."Eating food since we have downtime, and we're below {} hp.";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[7]] = aq."Eat";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[9]] = aq."oh no a guy made it through and we gota eat now LOL";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[10]] = aq."Eat";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[11]] = aq."eating food: {} in-fight since we're below {} hp";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[12]] = aq."Eat";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[13]] = aq."retrieving food: {} mid-fight since we have room! It's {} tiles away, and pnm is transitioning.";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[14]] = aq."Take";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[15]] = aq."retrieving food: {} since we're standing on it anyway.";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[16]] = aq."Take";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[17]] = aq."Disturb";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[19]] = aq."Sleepwalker";
        aq.lllIlllIIIIl[aq.lllIlllIIIlI[21]] = aq."Eat";
    }

    private static String lIIIllIllIIllll(String lllllllllllllllIIllIIlIlIIlIlIII, String lllllllllllllllIIllIIlIlIIlIllII) {
        lllllllllllllllIIllIIlIlIIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlIIlIlIll = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlIIlIlIlI = lllllllllllllllIIllIIlIlIIlIllII.toCharArray();
        int lllllllllllllllIIllIIlIlIIlIlIIl = lllIlllIIIlI[0];
        char[] lllllllllllllllIIllIIlIlIIlIIIll = lllllllllllllllIIllIIlIlIIlIlIII.toCharArray();
        int lllllllllllllllIIllIIlIlIIlIIIlI = lllllllllllllllIIllIIlIlIIlIIIll.length;
        int lllllllllllllllIIllIIlIlIIlIIIIl = lllIlllIIIlI[0];
        while (aq.lIIIllIllIllIlI(lllllllllllllllIIllIIlIlIIlIIIIl, lllllllllllllllIIllIIlIlIIlIIIlI)) {
            char lllllllllllllllIIllIIlIlIIlIlllI = lllllllllllllllIIllIIlIlIIlIIIll[lllllllllllllllIIllIIlIlIIlIIIIl];
            lllllllllllllllIIllIIlIlIIlIlIll.append((char)(lllllllllllllllIIllIIlIlIIlIlllI ^ lllllllllllllllIIllIIlIlIIlIlIlI[lllllllllllllllIIllIIlIlIIlIlIIl % lllllllllllllllIIllIIlIlIIlIlIlI.length]));
            0;
            ++lllllllllllllllIIllIIlIlIIlIlIIl;
            ++lllllllllllllllIIllIIlIlIIlIIIIl;
            0;
            if ((40 + 46 - 79 + 130 ^ 128 + 56 - 179 + 136) == (23 + 4 - -37 + 108 ^ 20 + 117 - 80 + 111)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlIlIIlIlIll);
    }

    private static void lIIIllIllIlIIlI() {
        lllIlllIIIlI = new int[23];
        aq.lllIlllIIIlI[0] = (3 + 79 - -42 + 16 ^ 89 + 13 - -54 + 28) & (96 + 55 - 125 + 148 ^ 139 + 152 - 203 + 66 ^ -1);
        aq.lllIlllIIIlI[1] = 1;
        aq.lllIlllIIIlI[2] = -(0xFFFFCCDD & 0x7733) & (0xFFFFE7FD & 0x5D7F);
        aq.lllIlllIIIlI[3] = 2;
        aq.lllIlllIIIlI[4] = 3;
        aq.lllIlllIIIlI[5] = 64 + 9 - -23 + 59 ^ 31 + 82 - 60 + 106;
        aq.lllIlllIIIlI[6] = 0x39 ^ 0x3C;
        aq.lllIlllIIIlI[7] = 0xE ^ 0x58 ^ (0xF4 ^ 0xA4);
        aq.lllIlllIIIlI[8] = -(0xFFFFC4FD & 0x7F6B) & (0xFFFFFFFF & 0x6FFA);
        aq.lllIlllIIIlI[9] = 0x8D ^ 0x8A;
        aq.lllIlllIIIlI[10] = 0x43 ^ 0x4B;
        aq.lllIlllIIIlI[11] = 0x9E ^ 0x97;
        aq.lllIlllIIIlI[12] = 0x96 ^ 0x9C;
        aq.lllIlllIIIlI[13] = 0x3C ^ 0x37;
        aq.lllIlllIIIlI[14] = 0x42 ^ 0x4E;
        aq.lllIlllIIIlI[15] = 0x3F ^ 0x32;
        aq.lllIlllIIIlI[16] = 0x6F ^ 0x3F ^ (0xEA ^ 0xB4);
        aq.lllIlllIIIlI[17] = 0x24 ^ 0x2B;
        aq.lllIlllIIIlI[18] = 0xFFFFBBDF & 0x65BC;
        aq.lllIlllIIIlI[19] = 149 + 152 - 156 + 8 ^ 125 + 127 - 187 + 72;
        aq.lllIlllIIIlI[20] = -(0xFFFFDEB5 & 0x754F) & (0xFFFFF77F & 0x7DFF);
        aq.lllIlllIIIlI[21] = 2 ^ 0x6D ^ (0xD ^ 0x73);
        aq.lllIlllIIIlI[22] = 0xDB ^ 0x95 ^ (0x6C ^ 0x30);
    }

    private static boolean lIIIllIllIllIII(int n2) {
        return n2 < 0;
    }

    static {
        aq.lIIIllIllIlIIlI();
        aq.lIIIllIllIlIIIl();
        ej = LoggerFactory.getLogger(aq.class);
    }

    private static int lIIIllIllIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

