/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Widgets
 */
package k.p.n.s.r.a.-.q.e.l.r.e.i.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.SquirePlankerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Teleporting", priority=5)
public class e
extends Task {
    private final /* synthetic */ SquirePlankerConfig o;
    private static /* synthetic */ int[] llllllIIIlII;
    private static /* synthetic */ String[] llllllIIIIll;

    @Inject
    public e(SquirePlankerConfig squirePlankerConfig) {
        this.o = squirePlankerConfig;
    }

    public boolean run() {
        e lllllllllllllllIIlIIlllllIIlIIlI;
        if (e.lIIlIIllllllIII(this.o.spell() ? 1 : 0)) {
            return llllllIIIlII[0];
        }
        String[] stringArray = new String[llllllIIIlII[1]];
        stringArray[e.llllllIIIlII[0]] = llllllIIIIll[llllllIIIlII[0]];
        stringArray[e.llllllIIIlII[2]] = llllllIIIIll[llllllIIIlII[2]];
        TileObject lllllllllllllllIIlIIlllllIIlIIIl = TileObjects.getNearest((String[])stringArray);
        int[] nArray = new int[llllllIIIlII[2]];
        nArray[e.llllllIIIlII[0]] = lllllllllllllllIIlIIlllllIIlIIlI.o.plank().d();
        if (e.lIIlIIllllllIII(Inventory.contains((int[])nArray) ? 1 : 0) && e.lIIlIIllllllIIl(lllllllllllllllIIlIIlllllIIlIIIl)) {
            Widget lllllllllllllllIIlIIlllllIIlIIII = Widgets.get((WidgetInfo)SpellBook.Standard.TELEPORT_TO_HOUSE.getWidget());
            if (e.lIIlIIllllllIIl(lllllllllllllllIIlIIlllllIIlIIII)) {
                if (e.lIIlIIllllllIII(lllllllllllllllIIlIIlllllIIlIIII.hasAction(llllllIIIIll[llllllIIIlII[1]]::equals) ? 1 : 0)) {
                    lllllllllllllllIIlIIlllllIIlIIII.interact(llllllIIIIll[llllllIIIlII[3]]);
                    0;
                    if (-3 > 0) {
                        return ((0x25 ^ 5) & ~(0xBE ^ 0x9E)) != 0;
                    }
                } else {
                    lllllllllllllllIIlIIlllllIIlIIII.interact(llllllIIIIll[llllllIIIlII[4]]);
                }
                lllllllllllllllIIlIIlllllIIlIIlI.sleep(llllllIIIlII[5]);
                return llllllIIIlII[2];
            }
            0;
            if (null != null) {
                return ((0x8D ^ 0xA8 ^ (0x1E ^ 0x64)) & (0xF ^ 0x17 ^ (0x72 ^ 0x35) ^ -1)) != 0;
            }
        } else {
            int[] nArray2 = new int[llllllIIIlII[2]];
            nArray2[e.llllllIIIlII[0]] = lllllllllllllllIIlIIlllllIIlIIlI.o.plank().d();
            if (e.lIIlIIllllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0) && e.lIIlIIllllllIll(lllllllllllllllIIlIIlllllIIlIIIl)) {
                int n;
                if (e.lIIlIIllllllIII(lllllllllllllllIIlIIlllllIIlIIlI.o.ironMode() ? 1 : 0)) {
                    TileObject lllllllllllllllIIlIIlllllIIlIIII = TileObjects.getNearest(tileObject -> {
                        boolean bl;
                        if (!e.lIIlIIllllllIlI(tileObject.getName().contains(llllllIIIIll[llllllIIIlII[8]]) ? 1 : 0) || e.lIIlIIllllllIII(tileObject.getName().contains(llllllIIIIll[llllllIIIlII[9]]) ? 1 : 0)) {
                            bl = llllllIIIlII[2];
                            0;
                            if (-1 == 1) {
                                return ((0x60 ^ 0x39) & ~(0xE6 ^ 0xBF)) != 0;
                            }
                        } else {
                            bl = llllllIIIlII[0];
                        }
                        return bl;
                    });
                    World lllllllllllllllIIlIIlllllIIIllll = Worlds.getCurrentWorld();
                    if (e.lIIlIIllllllIII(lllllllllllllllIIlIIlllllIIIllll.isAllPkWorld() ? 1 : 0)) {
                        Log.info((String)llllllIIIIll[llllllIIIlII[5]]);
                        return llllllIIIlII[0];
                    }
                    if (e.lIIlIIllllllIIl(lllllllllllllllIIlIIlllllIIlIIII)) {
                        lllllllllllllllIIlIIlllllIIlIIII.interact(string -> string.contains(llllllIIIIll[llllllIIIlII[7]]));
                        return llllllIIIlII[2];
                    }
                }
                Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                if (e.lIIlIIllllllIII(lllllllllllllllIIlIIlllllIIlIIlI.o.slowmode() ? 1 : 0)) {
                    n = llllllIIIlII[6];
                    0;
                    if ((0xC4 ^ 0xC0) <= 2) {
                        return ((0x89 ^ 0xC4) & ~(0x58 ^ 0x15)) != 0;
                    }
                } else {
                    n = llllllIIIlII[5];
                }
                lllllllllllllllIIlIIlllllIIlIIlI.sleep(n);
            }
        }
        return llllllIIIlII[2];
    }

    private static boolean lIIlIIllllllIll(Object object) {
        return object == null;
    }

    private static String lIIlIIlllllIIlI(String lllllllllllllllIIlIIlllllIIIIIll, String lllllllllllllllIIlIIlllllIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllllIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllllIIIIlII.getBytes(StandardCharsets.UTF_8)), llllllIIIlII[9]), "DES");
            Cipher lllllllllllllllIIlIIlllllIIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlllllIIIIlll.init(llllllIIIlII[1], lllllllllllllllIIlIIlllllIIIlIII);
            return new String(lllllllllllllllIIlIIlllllIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlllllIIIIllI) {
            lllllllllllllllIIlIIlllllIIIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllllIlIl() {
        llllllIIIIll = new String[llllllIIIlII[10]];
        e.llllllIIIIll[e.llllllIIIlII[0]] = e."Bank chest";
        e.llllllIIIIll[e.llllllIIIlII[2]] = e."Bank booth";
        e.llllllIIIIll[e.llllllIIIlII[1]] = e."Inside";
        e.llllllIIIIll[e.llllllIIIlII[3]] = e."Inside";
        e.llllllIIIIll[e.llllllIIIlII[4]] = e."Cast";
        e.llllllIIIIll[e.llllllIIIlII[5]] = e."Please do not use this feature on a PvP world.";
        e.llllllIIIIll[e.llllllIIIlII[7]] = e."Seers";
        e.llllllIIIIll[e.llllllIIIlII[8]] = e."Seers";
        e.llllllIIIIll[e.llllllIIIlII[9]] = e."Camelot";
    }

    private static boolean lIIlIIllllllIlI(int n) {
        return n == 0;
    }

    private static boolean lIIlIIllllllIII(int n) {
        return n != 0;
    }

    private static boolean lIIlIIlllllllII(int n, int n2) {
        return n < n2;
    }

    private static String lIIlIIlllllIlII(String lllllllllllllllIIlIIllllIlIllllI, String lllllllllllllllIIlIIllllIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllllIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllllIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllllIllIIIlI.init(llllllIIIlII[1], lllllllllllllllIIlIIllllIllIIIll);
            return new String(lllllllllllllllIIlIIllllIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllllIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllllIllIIIIl) {
            lllllllllllllllIIlIIllllIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllllIllI() {
        llllllIIIlII = new int[11];
        e.llllllIIIlII[0] = (0xCF ^ 0x88 ^ (0xE0 ^ 0xA9)) & (62 + 165 - 115 + 66 ^ 142 + 128 - 152 + 70 ^ -1);
        e.llllllIIIlII[1] = 2;
        e.llllllIIIlII[2] = 1;
        e.llllllIIIlII[3] = 3;
        e.llllllIIIlII[4] = 111 + 1 - 35 + 119 ^ 107 + 35 - 49 + 99;
        e.llllllIIIlII[5] = 0x6B ^ 0x61 ^ (0x96 ^ 0x99);
        e.llllllIIIlII[6] = 0xBF ^ 0xB0;
        e.llllllIIIlII[7] = 0x53 ^ 0x55;
        e.llllllIIIlII[8] = 0x71 ^ 0x76;
        e.llllllIIIlII[9] = 0x20 ^ 0x28;
        e.llllllIIIlII[10] = 0x78 ^ 0x71;
    }

    static {
        e.lIIlIIlllllIllI();
        e.lIIlIIlllllIlIl();
    }

    private static boolean lIIlIIllllllIIl(Object object) {
        return object != null;
    }

    private static String lIIlIIlllllIIll(String lllllllllllllllIIlIIllllIlllIlIl, String lllllllllllllllIIlIIllllIllIllll) {
        lllllllllllllllIIlIIllllIlllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllllIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllllIlllIIll = new StringBuilder();
        char[] lllllllllllllllIIlIIllllIlllIIlI = lllllllllllllllIIlIIllllIllIllll.toCharArray();
        int lllllllllllllllIIlIIllllIlllIIIl = llllllIIIlII[0];
        char[] lllllllllllllllIIlIIllllIllIlIll = lllllllllllllllIIlIIllllIlllIlIl.toCharArray();
        int lllllllllllllllIIlIIllllIllIlIlI = lllllllllllllllIIlIIllllIllIlIll.length;
        int lllllllllllllllIIlIIllllIllIlIIl = llllllIIIlII[0];
        while (e.lIIlIIlllllllII(lllllllllllllllIIlIIllllIllIlIIl, lllllllllllllllIIlIIllllIllIlIlI)) {
            char lllllllllllllllIIlIIllllIlllIllI = lllllllllllllllIIlIIllllIllIlIll[lllllllllllllllIIlIIllllIllIlIIl];
            lllllllllllllllIIlIIllllIlllIIll.append((char)(lllllllllllllllIIlIIllllIlllIllI ^ lllllllllllllllIIlIIllllIlllIIlI[lllllllllllllllIIlIIllllIlllIIIl % lllllllllllllllIIlIIllllIlllIIlI.length]));
            0;
            ++lllllllllllllllIIlIIllllIlllIIIl;
            ++lllllllllllllllIIlIIllllIllIlIIl;
            0;
            if (-(93 + 152 - 185 + 122 ^ 27 + 27 - -83 + 42) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllllIlllIIll);
    }
}

