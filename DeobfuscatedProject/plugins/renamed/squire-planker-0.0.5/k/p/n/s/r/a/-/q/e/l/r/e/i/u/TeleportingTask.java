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

/* TASK: Teleporting -> TeleportingTask */
@TaskDesc(name="Teleporting", priority=5)
public class TeleportingTask
extends Task {
    private final /* synthetic */ SquirePlankerConfig o;
    private static /* synthetic */ int[] llllllIIIlII;
    private static /* synthetic */ String[] llllllIIIIll;

    @Inject
    public e(SquirePlankerConfig squirePlankerConfig) {
        this.o = squirePlankerConfig;
    }

    public boolean run() {
        e var3;
        if (e.lIIlIIllllllIII(this.o.spell() ? 1 : 0)) {
            return llllllIIIlII[0];
        }
        String[] stringArray = new String[llllllIIIlII[1]];
        stringArray[e.llllllIIIlII[0]] = llllllIIIIll[llllllIIIlII[0]];
        stringArray[e.llllllIIIlII[2]] = llllllIIIIll[llllllIIIlII[2]];
        TileObject var20 = TileObjects.getNearest((String[])stringArray);
        int[] nArray = new int[llllllIIIlII[2]];
        nArray[e.llllllIIIlII[0]] = var3.o.plank().d();
        if (e.lIIlIIllllllIII(Inventory.contains((int[])nArray) ? 1 : 0) && e.lIIlIIllllllIIl(var20)) {
            Widget var5 = Widgets.get((WidgetInfo)SpellBook.Standard.TELEPORT_TO_HOUSE.getWidget());
            if (e.lIIlIIllllllIIl(var5)) {
                if (e.lIIlIIllllllIII(var5.hasAction(llllllIIIIll[llllllIIIlII[1]]::equals) ? 1 : 0)) {
                    var5.interact(llllllIIIIll[llllllIIIlII[3]]);
                    0;
                    if (-3 > 0) {
                        return false;
                    }
                } else {
                    var5.interact(llllllIIIIll[llllllIIIlII[4]]);
                }
                var3.sleep(llllllIIIlII[5]);
                return llllllIIIlII[2];
            }
            0;
            
            }
        } else {
            int[] nArray2 = new int[llllllIIIlII[2]];
            nArray2[e.llllllIIIlII[0]] = var3.o.plank().d();
            if (e.lIIlIIllllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0) && e.lIIlIIllllllIll(var20)) {
                int n;
                if (e.lIIlIIllllllIII(var3.o.ironMode() ? 1 : 0)) {
                    TileObject var5 = TileObjects.getNearest(tileObject -> {
                        boolean bl;
                        if (!e.lIIlIIllllllIlI(tileObject.getName().contains(llllllIIIIll[llllllIIIlII[8]]) ? 1 : 0) || e.lIIlIIllllllIII(tileObject.getName().contains(llllllIIIIll[llllllIIIlII[9]]) ? 1 : 0)) {
                            bl = llllllIIIlII[2];
                            0;
                            if (-1 == 1) {
                                return false;
                            }
                        } else {
                            bl = llllllIIIlII[0];
                        }
                        return bl;
                    });
                    World var22 = Worlds.getCurrentWorld();
                    if (e.lIIlIIllllllIII(var22.isAllPkWorld() ? 1 : 0)) {
                        Log.info((String)llllllIIIIll[llllllIIIlII[5]]);
                        return llllllIIIlII[0];
                    }
                    if (e.lIIlIIllllllIIl(var5)) {
                        var5.interact(string -> string.contains(llllllIIIIll[llllllIIIlII[7]]));
                        return llllllIIIlII[2];
                    }
                }
                Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                if (e.lIIlIIllllllIII(var3.o.slowmode() ? 1 : 0)) {
                    n = llllllIIIlII[6];
                    0;
                    if ((0xC4 ^ 0xC0) <= 2) {
                        return false;
                    }
                } else {
                    n = llllllIIIlII[5];
                }
                var3.sleep(n);
            }
        }
        return llllllIIIlII[2];
    }

    private static boolean lIIlIIllllllIll(Object object) {
        return object == null;
    }

    private static String lIIlIIlllllIIlI(String var13, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llllllIIIlII[9]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(llllllIIIlII[1], var1);
            return new String(var18.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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

    private static String lIIlIIlllllIlII(String var21, String var10) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llllllIIIlII[1], var16);
            return new String(var9.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
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

    private static String lIIlIIlllllIIll(String var14, String var19) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var11 = var19.toCharArray();
        int var23 = llllllIIIlII[0];
        char[] var8 = var14.toCharArray();
        int var7 = var8.length;
        int var17 = llllllIIIlII[0];
        while (e.lIIlIIlllllllII(var17, var7)) {
            char var12 = var8[var17];
            var2.append((char)(var12 ^ var11[var23 % var11.length]));
            0;
            ++var23;
            ++var17;
            0;
            if (-(93 + 152 - 185 + 122 ^ 27 + 27 - -83 + 42) < 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

