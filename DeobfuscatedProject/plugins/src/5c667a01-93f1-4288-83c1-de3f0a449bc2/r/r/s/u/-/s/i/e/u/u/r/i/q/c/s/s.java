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

@TaskDesc(name="High Alching loot", priority=60000)
public class s
extends Task {
    private static /* synthetic */ String[] lIIlIlIlllIII;
    private static /* synthetic */ int[] lIIlIlIlllIIl;
    private final /* synthetic */ SquireScurriusConfig ad;
    private final /* synthetic */ SquireScurrius ac;

    private static String lIlIllIIIllIIll(String llllllllllllllIllllIllIIllIlIlll, String llllllllllllllIllllIllIIllIlIllI) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllIIllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllIIllIllIll.init(lIIlIlIlllIIl[1], llllllllllllllIllllIllIIllIlllII);
            return new String(llllllllllllllIllllIllIIllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllIIllIllIlI) {
            llllllllllllllIllllIllIIllIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIlllIIl(Object object) {
        return object == null;
    }

    private static void lIlIllIIIllIlIl() {
        lIIlIlIlllIII = new String[lIIlIlIlllIIl[1]];
        s.lIIlIlIlllIII[s.lIIlIlIlllIIl[0]] = s.lIlIllIIIllIIll("RPLHF1aDweXyZbAKZsVaYw==", "PofWD");
        s.lIIlIlIlllIII[s.lIIlIlIlllIIl[2]] = s.lIlIllIIIllIlII("pZ1RCWNMBHjZbKOyf3tvsw==", "uicmv");
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
        s llllllllllllllIllllIllIIllllIlIl;
        if (s.lIlIllIIIllIlll(this.ad.highAlch() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        if (s.lIlIllIIIllIlll(llllllllllllllIllllIllIIllllIlIl.ac.c() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        String[] stringArray = new String[lIIlIlIlllIIl[1]];
        stringArray[s.lIIlIlIlllIIl[0]] = lIIlIlIlllIII[lIIlIlIlllIIl[0]];
        stringArray[s.lIIlIlIlllIIl[2]] = lIIlIlIlllIII[lIIlIlIlllIIl[2]];
        NPC llllllllllllllIllllIllIIllllIlII = NPCs.getNearest((String[])stringArray);
        if (s.lIlIllIIIlllIII(llllllllllllllIllllIllIIllllIlII)) {
            return lIIlIlIlllIIl[0];
        }
        Item llllllllllllllIllllIllIIllllIIll = Inventory.getFirst(item -> d.x.contains(item.getName()));
        if (s.lIlIllIIIlllIIl(llllllllllllllIllllIllIIllllIIll)) {
            return lIIlIlIlllIIl[0];
        }
        SpellBook.Standard llllllllllllllIllllIllIIllllIIlI = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (s.lIlIllIIIllIlll(llllllllllllllIllllIllIIllllIIlI.canCast() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        Magic.cast((Spell)var3_3);
        var2_2.interact(lIIlIlIlllIIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var2_2.getSlot(), WidgetInfo.INVENTORY.getId());
        return lIIlIlIlllIIl[2];
    }

    private static boolean lIlIllIIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIllIIIllIlII(String llllllllllllllIllllIllIIlllIIllI, String llllllllllllllIllllIllIIlllIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIlllIIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIlllIIl[4]), "DES");
            Cipher llllllllllllllIllllIllIIlllIlIII = Cipher.getInstance("DES");
            llllllllllllllIllllIllIIlllIlIII.init(lIIlIlIlllIIl[1], llllllllllllllIllllIllIIlllIlIIl);
            return new String(llllllllllllllIllllIllIIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllIIlllIIlll) {
            llllllllllllllIllllIllIIlllIIlll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void llllllllllllllIllllIllIIlllIllll;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.addAll(Prayers.getOffensive());
        "".length();
        int[] nArray = new int[lIIlIlIlllIIl[1]];
        nArray[s.lIIlIlIlllIIl[0]] = d.C;
        nArray[s.lIIlIlIlllIIl[2]] = d.D;
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (s.lIlIllIIIlllIII(projectile) && s.lIlIllIIIlllIlI(projectile.getRemainingCycles(), lIIlIlIlllIIl[3])) {
            if (s.lIlIllIIIlllIll(projectile.getId(), d.C)) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                "".length();
                "".length();
                if ("   ".length() < " ".length()) {
                    return null;
                }
            } else {
                llllllllllllllIllllIllIIlllIllll.add(Prayer.PROTECT_FROM_MAGIC);
                "".length();
                "".length();
                if ("   ".length() <= " ".length()) {
                    return null;
                }
            }
        } else {
            llllllllllllllIllllIllIIlllIllll.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
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
        s.lIIlIlIlllIIl[1] = "  ".length();
        s.lIIlIlIlllIIl[2] = " ".length();
        s.lIIlIlIlllIIl[3] = 0x33 ^ 0x1E;
        s.lIIlIlIlllIIl[4] = 70 + 12 - 45 + 135 ^ 78 + 158 - 161 + 89;
    }

    static {
        s.lIlIllIIIllIllI();
        s.lIlIllIIIllIlIl();
    }
}

