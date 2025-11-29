/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Prayers
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Prayers;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

/* TASK: High Alching loot -> HighalchinglootTask */
@TaskDesc(name="High Alching loot", priority=60000)
public class s
extends Task {
    private static /* synthetic */ String[] lIIlIlIlllIII;
    private static /* synthetic */ int[] lIIlIlIlllIIl;
    private final /* synthetic */ SquireScurriusConfig ad;
    private final /* synthetic */ SquireScurrius ac;

    private static String lIlIllIIIllIIll(String var5, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIlIlIlllIIl[1], var3);
            return new String(var8.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIlllIIl(Object object) {
        return object == null;
    }

    private static void lIlIllIIIllIlIl() {
        lIIlIlIlllIII = new String[lIIlIlIlllIIl[1]];
        s.lIIlIlIlllIII[s.lIIlIlIlllIIl[0]] = s."Scurrius";
        s.lIIlIlIlllIII[s.lIIlIlIlllIIl[2]] = s."Giant rat";
    }

    private static boolean lIlIllIIIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIIlllIII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var3_3;
        s var13;
        if (s.lIlIllIIIllIlll(this.ad.highAlch() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        if (s.lIlIllIIIllIlll(var13.ac.c() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        String[] stringArray = new String[lIIlIlIlllIIl[1]];
        stringArray[s.lIIlIlIlllIIl[0]] = lIIlIlIlllIII[lIIlIlIlllIIl[0]];
        stringArray[s.lIIlIlIlllIIl[2]] = lIIlIlIlllIII[lIIlIlIlllIIl[2]];
        NPC var9 = NPCs.getNearest((String[])stringArray);
        if (s.lIlIllIIIlllIII(var9)) {
            return lIIlIlIlllIIl[0];
        }
        Item var11 = Inventory.getFirst(item -> d.x.contains(item.getName()));
        if (s.lIlIllIIIlllIIl(var11)) {
            return lIIlIlIlllIIl[0];
        }
        SpellBook.Standard var14 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (s.lIlIllIIIllIlll(var14.canCast() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        Magic.cast((Spell)var3_3);
        var2_2.interact(lIIlIlIlllIIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var2_2.getSlot(), WidgetInfo.INVENTORY.getId());
        return lIIlIlIlllIIl[2];
    }

    private static boolean lIlIllIIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIllIIIllIlII(String var7, String var2) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIlIlIlllIIl[4]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIIlIlIlllIIl[1], var4);
            return new String(var12.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void var1;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.addAll(Prayers.getOffensive());
        0;
        int[] nArray = new int[lIIlIlIlllIIl[1]];
        nArray[s.lIIlIlIlllIIl[0]] = d.C;
        nArray[s.lIIlIlIlllIIl[2]] = d.D;
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (s.lIlIllIIIlllIII(projectile) && s.lIlIllIIIlllIlI(projectile.getRemainingCycles(), lIIlIlIlllIIl[3])) {
            if (s.lIlIllIIIlllIll(projectile.getId(), d.C)) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                0;
                0;
                if (3 < 1) {
                    return null;
                }
            } else {
                var1.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                0;
                if (3 <= 1) {
                    return null;
                }
            }
        } else {
            var1.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return arrayList;
    }

    @Inject
    public s(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ac = squireScurrius;
        this.ad = squireScurriusConfig;
    }

    private static boolean lIlIllIIIlllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIllIIIllIllI() {
        lIIlIlIlllIIl = new int[5];
        s.lIIlIlIlllIIl[0] = (0x25 ^ 0x1C) & ~(0x52 ^ 0x6B);
        s.lIIlIlIlllIIl[1] = 2;
        s.lIIlIlIlllIIl[2] = 1;
        s.lIIlIlIlllIIl[3] = 0x33 ^ 0x1E;
        s.lIIlIlIlllIIl[4] = 70 + 12 - 45 + 135 ^ 78 + 158 - 161 + 89;
    }

    static {
        s.lIlIllIIIllIllI();
        s.lIlIllIIIllIlIl();
    }
}

