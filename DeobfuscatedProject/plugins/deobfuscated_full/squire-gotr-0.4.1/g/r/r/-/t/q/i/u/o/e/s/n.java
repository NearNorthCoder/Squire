/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/* TASK: Creating essence -> CreatingessenceTask */
@TaskDesc(name="Creating essence", priority=1, blocking=true)
public class n
extends h {
    private static /* synthetic */ String[] llIIllIlIIIl;
    private static /* synthetic */ int[] llIIllIlIIlI;

    private static boolean llllllIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIlIIIIII(Object object) {
        return object != null;
    }

    @Inject
    public n(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllIlIIlI[0]];
        cArray[n.llIIllIlIIlI[1]] = c.COUNTDOWN;
        cArray[n.llIIllIlIIlI[2]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ak() {
        void var1_1;
        n var7;
        if (n.llllllIIllllIl((Object)this.aV.m(), (Object)c.ACTIVATING) && n.llllllIIlllllI(this.aV.a(), this.aW.fragmentAmount())) {
            return llIIllIlIIlI[1];
        }
        int[] nArray = new int[llIIllIlIIlI[2]];
        nArray[n.llIIllIlIIlI[1]] = llIIllIlIIlI[3];
        TileObject var5 = TileObjects.getNearest((int[])nArray);
        Player var6 = Players.getLocal();
        if (!n.llllllIIllllll(Inventory.isFull() ? 1 : 0) || !n.llllllIlIIIIII(var5) || n.llllllIlIIIIIl(SquireGOTRPlugin.g.contains((Locatable)var6) ? 1 : 0)) {
            return llIIllIlIIlI[1];
        }
        if (n.llllllIlIIIIIl(SquireGOTRPlugin.h.contains((Locatable)var6) ? 1 : 0) && n.llllllIIlllllI(var7.aV.a(), var7.aW.fragmentAmount())) {
            return llIIllIlIIlI[1];
        }
        if (n.llllllIlIIIIIl(var7.aV.c() ? 1 : 0)) {
            return llIIllIlIIlI[1];
        }
        if (n.llllllIlIIIIlI(var7.aV.o(), llIIllIlIIlI[0]) && n.llllllIlIIIIll(Players.getLocal().getAnimation(), llIIllIlIIlI[4])) {
            return llIIllIlIIlI[2];
        }
        if (n.llllllIIllllll(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var5.getWorldLocation(), (boolean)llIIllIlIIlI[1]);
            0;
            return llIIllIlIIlI[2];
        }
        if (n.llllllIlIIIIIl(var7.b((GameObject)var5) ? 1 : 0)) {
            return llIIllIlIIlI[1];
        }
        var1_1.interact(llIIllIlIIIl[llIIllIlIIlI[1]]);
        this.sleep(llIIllIlIIlI[2]);
        return llIIllIlIIlI[2];
    }

    private static boolean llllllIIllllll(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIlIIIIIl(int n2) {
        return n2 != 0;
    }

    private static void llllllIIlllIll() {
        llIIllIlIIIl = new String[llIIllIlIIlI[2]];
        n.llIIllIlIIIl[n.llIIllIlIIlI[1]] = n."Work-at";
    }

    static {
        n.llllllIIllllII();
        n.llllllIIlllIll();
    }

    private static boolean llllllIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllllIIllllII() {
        llIIllIlIIlI = new int[5];
        n.llIIllIlIIlI[0] = 2;
        n.llIIllIlIIlI[1] = (0xC6 ^ 0x86) & ~(0xE2 ^ 0xA2);
        n.llIIllIlIIlI[2] = 1;
        n.llIIllIlIIlI[3] = -(0xFFFFB71E & 0x4DE7) & (0xFFFFBFFF & 0xEFEF);
        n.llIIllIlIIlI[4] = -(0xFFFFD9FF & 0x6E61) & (0xFFFFFDF5 & 0x6EFF);
    }

    private static boolean llllllIIllllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllllIlIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String llllllIIlllIlI(String var8, String var2) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIIllIlIIlI[0], var3);
            return new String(var4.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }
}

